/**
 * Port of fb.java, q.java, hb.java, p.java, s.java, j.java, sb.java, v.java, y.java
 * Complete 1:1 Fixed-Timestep (25 Hz / 40ms) Simulation Engine for Pipyaki Pro.
 */

import { ITEM_START_CAMPAIGN, WEAPON_ICON_CODES, WEAPON_START_CAMPAIGN } from './pipyaki-loader.js';

const DIR_DX = [0, -1, 0, 1]; // ab.gb: 0=down, 1=left, 2=up, 3=right
const DIR_DY = [1, 0, -1, 0]; // ab.hb

/**
 * Port of q.v() (q.java:4860-4937) — Max HP per archetype & difficulty.
 */
export function calcMaxHp(charType, hpSkill = 0, themeLevel = 0, isMainPlayer = false, isCampaign = true) {
  let hp = 90;
  if (charType === 0) hp = 90 + 30 * (hpSkill | 0);
  else if (charType === 1) hp = 90;
  else if (charType === 3) hp = 50;
  else if (charType === 4) hp = 240;
  else if (charType === 5) hp = 90;
  else if (charType === 6) hp = 120;
  else if (charType === 7 || charType === 8) hp = 90;
  else if (charType === 9) hp = 30;
  else if (charType === 2) hp = 300; // slonyaka boss

  if (isCampaign && !isMainPlayer) {
    hp = Math.floor((hp * (100 + themeLevel * 15)) / 100);
  }
  return hp;
}

/**
 * Port of q.b(q, int weaponId) (q.java:4939-5121) — Weapon Damage & Blast Radius.
 */
export function calcWeaponDamage(owner, weaponId, isCampaign = true, isMainPlayer = false, themeLevel = 0) {
  const sk = owner?.skills || [];
  let dmg = 60;
  switch (weaponId) {
    case 0: dmg = 90 + 25 * (sk[2] || 0); break;   // Normal Melon
    case 1: dmg = 120 + 30 * (sk[2] || 0); break;  // Hard Melon
    case 2: dmg = 15 + 15 * (sk[3] || 0); break;   // Brick
    case 3: dmg = 40 + 10 * (sk[4] || 0); break;   // Sticky Melon
    case 4: dmg = 50 + 15 * (sk[4] || 0); break;   // Sticky Hard
    case 5: dmg = 60 + 15 * (sk[5] || 0); break;   // Rubber Melon
    case 6: dmg = 90 + 20 * (sk[5] || 0); break;   // Rubber Hard
    case 7: dmg = 90 + 25 * (sk[6] || 0); break;   // Pineapple
    case 8: dmg = 120 + 30 * (sk[6] || 0); break;  // Forest Pineapple
    case 9: dmg = 90 + 45 * (sk[7] || 0); break;   // Stinky Sock
    case 10: dmg = 6; break;                        // Banana Peel
    case 11: dmg = 60 + 60 * (sk[8] || 0); break;  // Rake
    case 12: dmg = 90; break;                       // Time Bomb
    case 13: dmg = 60; break;                       // Trap Mine
    case -4: dmg = 5; break;                        // Snail spit
    case -5: dmg = 30; break;                       // Cannon core
    case -6: dmg = 45; break;                       // Homing rocket
    default: dmg = 60; break;
  }
  if (isCampaign && !isMainPlayer && owner && owner.team !== 0) {
    dmg = Math.floor(((10 + themeLevel) * dmg) / 10);
  }
  return dmg;
}

export function getWeaponRadius(weaponId) {
  switch (weaponId) {
    case 0: case 1: case 3: case 4: case 5: case 6: return 2;
    case 7: case 8: case 9: case 12: return 3;
    case -6: return 2;
    case -5: return 2;
    default: return 1;
  }
}

export function getBrickStunTicks(owner) {
  const sk = owner?.skills || [];
  return (6 + 3 * (sk[3] || 0)) * 25;
}

export function getRakeStunTicks(owner) {
  const sk = owner?.skills || [];
  return (2 + 2 * (sk[8] || 0)) * 25;
}

export class PipyakiWorld {
  constructor(parsedMap, opts = {}) {
    this.width = parsedMap.width;
    this.height = parsedMap.height;
    this.musicTrack = parsedMap.musicTrack;
    this.themeLevel = parsedMap.themeLevel || 0;
    this.specialCutscene = parsedMap.specialCutscene;
    this.isCampaign = opts.isCampaign !== false;
    this.mode = this.isCampaign ? 1 : (opts.mode ?? 0); // arena: 0=DM, 1=TM, 2=CTF
    this.isTeamMode = !this.isCampaign && (this.mode === 1 || this.mode === 2);
    this.friendlyFire = !!opts.friendlyFire;
    this.weatherEnabled = opts.weatherEnabled !== false;
    this.bloodEnabled = opts.bloodEnabled !== false;
    this.onSfx = opts.onSfx || (() => {});
    this.onCampaignEnd = opts.onCampaignEnd || (() => {});
    this.onShowText = opts.onShowText || (() => {});

    this.tiles = parsedMap.tiles.map((col) =>
      col.map((cell) => ({
        b: cell.b,
        c: cell.c,
        d: null,
        e: [],
        f: [],
      }))
    );

    this.props = parsedMap.props.map((p) => ({ ...p }));
    this.props.forEach((p, idx) => {
      if (this.tiles[p.tx] && this.tiles[p.tx][p.ty]) {
        const pyMod = p.py % 30;
        if (pyMod >= 22 || p.layer === 1 || p.layer === 3) {
          this.tiles[p.tx][p.ty].f.push(idx);
        } else {
          this.tiles[p.tx][p.ty].e.push(idx);
        }
      }
    });

    this.obstacles = [];
    for (const o of parsedMap.obstacles) {
      if (!this.inBounds(o.tx, o.ty)) continue;
      if (o.onlyIfEmpty && this.tiles[o.tx][o.ty].d) continue;
      const obs = this.createObstacle(o.type, o.frame, o.tx, o.ty, o.extra);
      this.tiles[o.tx][o.ty].d = obs;
      this.obstacles.push(obs);
    }

    this.spawners = parsedMap.spawners.map((sp, i) => ({
      id: i,
      ...sp,
      remaining: sp.quota < 0 ? 9999 : sp.quota,
      aliveIds: [],
      cooldown: 0,
      capsuleFrame: 0,
      hasFiredFirst: false,
    }));

    this.actors = [];
    this.bombs = [];
    this.explosions = [];
    this.pickups = [];
    this.decals = [];
    this.particles = [];
    this.floatingTexts = [];
    this.killfeed = [];
    this.triggers = parsedMap.triggers.map((t, i) => ({ id: i, ...t, fired: false, timer: 0, waiting: false }));
    this.markers = parsedMap.markers || [];
    this.flagBases = [];
    this.flags = [];
    this.teamScores = [0, 0];
    this.scoreLimit = opts.scoreLimit ?? (this.mode === 2 ? 3 : 10);

    this.nextActorId = 1;
    this.nextBombId = 1;
    this.tickCount = 0;
    this.startTimeMs = Date.now();
    this.itemsPicked = 0;
    this.coinsEarned = 0;
    this.secretsFound = 0;
    this.secretsTotal = this.markers.filter((m) => m.kind === 3 || m.params?.[0] === 3).length;
    this.campaignWinCountdown = -1;
    this.finished = false;
    this.winnerTeam = -1;
    this.showLeaderboard = false;
    this.modal = null;
    this.camX = 0;
    this.camY = 0;
    this.targetCamX = 0;
    this.targetCamY = 0;
    this.camLockTimer = 0;
    this.camLockX = 0;
    this.camLockY = 0;
    this.shakeAmp = 0;
    this.shakeTicks = 0;
    this.lightningFlash = 0;
    this.letterbox = 0;
    this.walkability = Array.from({ length: this.width }, () => new Uint8Array(this.height));
    this.rebuildWalkability();

    // Place initial map pickups (k.java kind==2/3)
    for (const pk of parsedMap.pickups) {
      if (pk.isKind3) {
        const modeOk = !this.isCampaign ? (pk.modeFilter === 1 || pk.modeFilter === 2) : (pk.modeFilter === 0 || pk.modeFilter === 2);
        if (!modeOk) continue;
        const typeMap = [2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17];
        const sType = typeMap[pk.itemIdx] ?? 17;
        this.spawnPickup(sType, pk.tx, pk.ty, pk.respawn);
      } else {
        this.spawnPickup(pk.type, pk.tx, pk.ty, false);
      }
    }

    // Place initial traps / hazards (k.java kind==1/6)
    for (const tr of parsedMap.initialTraps) {
      const modeOk = !this.isCampaign ? tr.mpModeFilter !== 0 : tr.mpModeFilter !== 1;
      if (!modeOk) continue;
      if (tr.trapKind === 0 && !this.isCampaign) this.spawnBomb(11, tr.tx, tr.ty, null);
      else if (tr.trapKind === 1) this.spawnBomb(10, tr.tx, tr.ty, null);
      else if (tr.trapKind === 2) this.spawnBomb(13, tr.tx, tr.ty, null);
      else if (tr.trapKind >= 3 && tr.trapKind <= 6) {
        const b = this.spawnBomb(5, tr.tx, tr.ty, null);
        if (tr.trapKind > 3) b.dir = tr.trapKind - 3;
      }
    }
    for (const hz of parsedMap.hazards) {
      this.spawnBomb(hz.hazardType, hz.tx, hz.ty, null);
    }

    // Setup CTF flag bases if arena CTF (mode == 2)
    if (this.mode === 2) {
      for (const m of this.markers) {
        if (m.kind === 4 || m.kind === 5 || (m.params && (m.params[0] === 4 || m.params[0] === 5))) {
          const team = (m.kind === 4 || m.params?.[0] === 4) ? 0 : 1;
          this.flagBases.push({ team, tx: m.tx, ty: m.ty });
        }
      }
      if (this.flagBases.length < 2) {
        this.flagBases = [
          { team: 0, tx: 2, ty: 2 },
          { team: 1, tx: Math.max(3, this.width - 3), ty: Math.max(3, this.height - 3) },
        ];
      }
      this.flags = this.flagBases.map((b) => ({
        team: b.team,
        homeTx: b.tx,
        homeTy: b.ty,
        x: b.tx * 30 + 15,
        y: b.ty * 30 + 15,
        carrierId: null,
        droppedTimer: 0,
      }));
    }

    // Spawn players & bots or campaign hero
    this.player = null;
    if (this.isCampaign) {
      const save = opts.campaignSave;
      const heroSp = this.spawners.find((s) => s.charType === 0 || s.team === 0);
      const sx = heroSp ? heroSp.tx : 2;
      const sy = heroSp ? heroSp.ty : 2;
      if (heroSp) {
        heroSp.remaining = 0;
      }
      this.player = this.spawnActor({
        id: 1,
        charType: 0,
        team: 0,
        tx: sx,
        ty: sy,
        name: opts.nickname || 'Pipyaka',
        weapons: [...(save?.weapons || WEAPON_START_CAMPAIGN)],
        items: [...(save?.items || ITEM_START_CAMPAIGN.map((v, i) => (i === 5 ? 3 : v)))],
        skills: [...(save?.skills || new Array(11).fill(0))],
        coins: save?.coins ?? 200,
        primaryWeapon: save?.primary ?? 0,
        secondaryWeapon: save?.secondary ?? 14,
        isBot: false,
        isPlayerOrBot: true,
      });
      this.nextActorId = 10;
      // Trigger initial spawners & map opening events (v.d == 7)
      this.stepSpawners(true);
      for (const tr of this.triggers) {
        if (tr.action === 7) this.fireTrigger(tr, this.player);
      }
    } else {
      this.initArenaParticipants(opts);
    }

    this.snapCameraToTarget();
  }

  initArenaParticipants(opts) {
    const save = opts.arenaSave;
    const humans = opts.humanRoster && opts.humanRoster.length > 0
      ? opts.humanRoster
      : [{ id: 1, name: opts.nickname || 'Pipyaka', team: opts.teamColor ?? 0, isLocal: true }];
    const botCount = Math.max(0, Math.min(3, opts.botCount ?? (4 - humans.length)));
    const totalCount = Math.min(4, humans.length + botCount);

    const spawns = this.findArenaSpawns(totalCount);
    const botNames = ['Bomba', 'Kaka', 'Yaki', 'Toto'];

    for (let i = 0; i < totalCount; i++) {
      const isHuman = i < humans.length;
      const cfg = isHuman ? humans[i] : {
        id: i + 1,
        name: botNames[i % botNames.length],
        team: this.isTeamMode ? (i % 2) : i,
      };
      const team = this.isTeamMode ? (cfg.team % 2) : i;
      const sp = spawns[i % spawns.length];
      const actor = this.spawnActor({
        id: cfg.id || (i + 1),
        charType: 0,
        team,
        tx: sp.tx,
        ty: sp.ty,
        name: cfg.name,
        weapons: [...(save?.weapons || [20, 2, 5, 5, 0, 5, 0, 3, 0, 1, 2, 1, 0, 1])],
        items: [...(save?.items || [2, 1, 0, 0, 0, 0])],
        skills: [...(save?.skills || new Array(11).fill(0))],
        coins: save?.coins ?? 250,
        primaryWeapon: save?.primary ?? 0,
        secondaryWeapon: save?.secondary ?? 14,
        isBot: !isHuman,
        botSkill: (opts.botDifficulty ?? 1) * 3,
        isPlayerOrBot: true,
      });
      if ((isHuman && cfg.isLocal) || (!this.player && isHuman)) {
        this.player = actor;
      }
    }
    this.nextActorId = totalCount + 10;
  }

  findArenaSpawns(needed) {
    const pts = [];
    for (const m of this.markers) {
      if (m.kind === 4 || m.kind === 5) pts.push({ tx: m.tx, ty: m.ty });
    }
    if (pts.length >= needed) return pts;
    const candidates = [
      { tx: 2, ty: 2 },
      { tx: this.width - 3, ty: this.height - 3 },
      { tx: this.width - 3, ty: 2 },
      { tx: 2, ty: this.height - 3 },
    ];
    for (const c of candidates) {
      if (this.isWalkable(c.tx, c.ty)) {
        pts.push(c);
      } else {
        const free = this.findNearestFreeTile(c.tx, c.ty);
        if (free) pts.push(free);
      }
    }
    return pts.length > 0 ? pts : [{ tx: 2, ty: 2 }];
  }

  findNearestFreeTile(cx, cy) {
    for (let rad = 0; rad < 6; rad++) {
      for (let dx = -rad; dx <= rad; dx++) {
        for (let dy = -rad; dy <= rad; dy++) {
          const tx = cx + dx;
          const ty = cy + dy;
          if (this.isWalkable(tx, ty)) return { tx, ty };
        }
      }
    }
    return { tx: Math.max(1, Math.min(this.width - 2, cx)), ty: Math.max(1, Math.min(this.height - 2, cy)) };
  }

  createObstacle(type, frame, tx, ty, extra) {
    const destructibleWall = type === 0 && frame >= 5 && frame <= 12;
    const woodBox = type === 1;
    let maxHp = 0;
    let hp = 0;
    let baseFrame = frame;
    let destructKind = 0;
    if (type === 0) {
      maxHp = 240;
      if (frame >= 5 && frame <= 8) {
        baseFrame = 5;
        destructKind = 1;
        hp = Math.floor((240 / 4) * (9 - frame));
      } else if (frame >= 9 && frame <= 12) {
        baseFrame = 9;
        destructKind = 1;
        hp = Math.floor((240 / 4) * (13 - frame));
      }
    } else if (woodBox) {
      baseFrame = -1;
      maxHp = hp = 30;
      destructKind = 2;
    }

    return {
      tx,
      ty,
      x: tx * 30,
      y: ty * 30,
      type,
      frame,
      baseFrame,
      extra,
      maxHp,
      hp,
      destructKind,
      destructible: destructibleWall || woodBox,
      hasRoof: type === 3,
      hasCrown: type === 4 && extra > 0,
      tallFront: type === 2,
      isWell: type === 5,
      isRocket: type === 6,
      isCrateEnd: type === 7,
      wellReady: true,
      wellCooldown: 0,
      bailFrame: 4,
      shakeX: 0,
      shakeY: 0,
      removed: false,
    };
  }

  inBounds(tx, ty) {
    return tx >= 0 && tx < this.width && ty >= 0 && ty < this.height;
  }

  rebuildWalkability() {
    for (let x = 0; x < this.width; x++) {
      for (let y = 0; y < this.height; y++) {
        const t = this.tiles[x][y];
        if (t.d && !t.d.removed || x === 0 || y === 0 || x === this.width - 1 || y === this.height - 1) {
          this.walkability[x][y] = 0;
        } else if (t.c > 0 && t.c <= 16) {
          this.walkability[x][y] = 2; // slower swamp/water/road modifier
        } else {
          this.walkability[x][y] = 1;
        }
      }
    }
  }

  isWalkable(tx, ty) {
    if (!this.inBounds(tx, ty)) return false;
    return this.walkability[tx][ty] !== 0;
  }

  spawnActor(cfg) {
    const id = cfg.id ?? this.nextActorId++;
    const maxHp = calcMaxHp(cfg.charType, cfg.skills?.[0] || 0, this.themeLevel, id === 1, this.isCampaign);
    const actor = {
      id,
      charType: cfg.charType ?? 1,
      team: cfg.team ?? 1,
      tx: cfg.tx,
      ty: cfg.ty,
      px: (cfg.tx * 30 + 15) * 10,
      py: (cfg.ty * 30 + 15) * 10,
      pz: 0,
      vz: 0,
      dir: 0, // 0=down,1=left,2=up,3=right
      speed: cfg.charType === 9 ? 50 : cfg.charType === 2 ? 30 : 40,
      moving: false,
      stepProgress: 0,
      dashing: false,
      dashSteps: 0,
      dashDir: 0,
      dashInvuln: false,
      dashCooldown: 0,
      dead: false,
      spawning: !!cfg.spawning,
      spawnFrame: 0,
      deathTimer: 0,
      deathAnimIdx: 0,
      respawnTimer: 0,
      hp: maxHp,
      maxHp,
      kills: 0,
      deaths: 0,
      coins: cfg.coins ?? 0,
      name: cfg.name || 'Bot',
      weapons: cfg.weapons || [999, 0, 5, 5, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0],
      items: cfg.items || [0, 0, 0, 0, 0, 0],
      skills: cfg.skills || new Array(11).fill(0),
      primaryWeapon: cfg.primaryWeapon ?? (cfg.charType === 0 ? 0 : -4),
      secondaryWeapon: cfg.secondaryWeapon ?? -1,
      weaponCooldowns: new Array(14).fill(0),
      stunTicks: 0,
      berserkTicks: 0,
      invisTicks: 0,
      kaskaTicks: 0,
      poisonTicks: 0,
      poisonOwnerId: -1,
      hurtFlash: 0,
      isBot: !!cfg.isBot,
      botSkill: cfg.botSkill ?? 3,
      botThinkTimer: 0,
      aiRush: !!cfg.rush,
      spawnerId: cfg.spawnerId ?? -1,
      isPlayerOrBot: !!cfg.isPlayerOrBot,
    };
    if (actor.charType !== 0) {
      actor.weapons = new Array(14).fill(-1);
      if (actor.charType === 5) actor.primaryWeapon = 12; // kamikaze bomb
      else if (actor.charType === 6) actor.primaryWeapon = -6; // rocketman
      else if (actor.charType === 8) actor.primaryWeapon = 9; // miner mine
      else if (actor.charType === 3) actor.primaryWeapon = -4; // snail spit
      else if (actor.charType === 4) actor.primaryWeapon = -5; // cannon
      else actor.primaryWeapon = 0; // bombaka/slonyaka melon
    }
    this.actors.push(actor);
    return actor;
  }

  spawnPickup(type, tx, ty, respawn = false) {
    const pk = {
      id: this.pickups.length + 1,
      type,
      tx,
      ty,
      x: tx * 30 + 15,
      y: ty * 30 + 15,
      raised: type !== 1,
      hideShadow: type === 1,
      respawn,
      respawnTimer: 0,
      removed: false,
    };
    this.pickups.push(pk);
    return pk;
  }

  spawnBomb(kind, tx, ty, owner, extraDir = null) {
    const bomb = {
      id: this.nextBombId++,
      kind,
      tx,
      ty,
      px: (tx * 30 + 15) * 10,
      py: (ty * 30 + 15) * 10,
      pz: kind === -6 || kind === 7 || kind === 8 || kind === 2 ? 120 : 0,
      vx: 0,
      vy: 0,
      vz: 0,
      dir: extraDir !== null ? extraDir : (owner ? owner.dir : 0),
      ownerId: owner ? owner.id : -1,
      ownerTeam: owner ? owner.team : -1,
      damage: calcWeaponDamage(owner, kind, this.isCampaign, owner === this.player, this.themeLevel),
      radius: getWeaponRadius(kind),
      fuse: kind === 0 || kind === 1 ? 65 : kind === 12 ? 90 : kind === 3 || kind === 4 ? 75 : kind === 5 || kind === 6 ? 110 : kind === 7 || kind === 8 ? 55 : 0,
      armed: kind !== 9 && kind !== 13 ? true : false,
      armTimer: kind === 9 || kind === 13 ? 35 : 0,
      flying: kind === -6 || kind === 7 || kind === 8 || kind === 2 || kind === -5 || kind === -4,
      isTrap: kind === 9 || kind === 10 || kind === 11 || kind === 13 || kind <= -1 && kind >= -3,
      gasTimer: kind === 10 ? 250 + 25 * (owner?.skills?.[7] || 0) : 0,
      bouncesLeft: kind === 5 || kind === 6 ? 6 : 0,
      frame: 0,
      removed: false,
    };

    const throwSpeed = kind === 2 ? 120 : kind === -5 ? 110 : kind === -6 ? 95 : kind === -4 ? 85 : kind === 7 || kind === 8 ? 75 : kind === 5 || kind === 6 ? 70 : kind === 3 || kind === 4 ? 80 : 0;
    if (throwSpeed > 0) {
      bomb.vx = DIR_DX[bomb.dir] * throwSpeed;
      bomb.vy = DIR_DY[bomb.dir] * throwSpeed;
      if (kind === 7 || kind === 8) bomb.vz = 32;
    }

    this.bombs.push(bomb);
    return bomb;
  }

  /**
   * Advance simulation 1 fixed J2ME tick (40ms = 25 Hz).
   */
  step(localInput = null, remoteInputs = new Map()) {
    this.tickCount++;
    if (this.modal) {
      return;
    }

    if (this.lightningFlash > 0) this.lightningFlash--;
    if (this.shakeTicks > 0) this.shakeTicks--;

    // 1. Update Killfeed TTL
    for (let i = this.killfeed.length - 1; i >= 0; i--) {
      this.killfeed[i].ttl--;
      if (this.killfeed[i].ttl <= 0) this.killfeed.splice(i, 1);
    }

    // 2. Update Obstacles (Well recharge & crate shake)
    for (const obs of this.obstacles) {
      if (obs.removed) continue;
      if (obs.isWell && !obs.wellReady) {
        obs.wellCooldown--;
        if (obs.wellCooldown <= 0) {
          obs.wellReady = true;
          obs.bailFrame = 4;
        }
      }
      if (obs.shakeX || obs.shakeY) {
        obs.shakeX = 0;
        obs.shakeY = 0;
      }
    }

    // 3. Apply Local Input + Network Guest Inputs
    if (!this.finished) {
      if (this.player) {
        this.applyActorInput(this.player, localInput);
      }
      for (const actor of this.actors) {
        if (actor !== this.player && !actor.isBot) {
          const rInput = remoteInputs.get(actor.id);
          if (rInput) this.applyActorInput(actor, rInput);
        }
      }
    }

    // 4. Bot & Monster AI (y.java)
    for (const actor of this.actors) {
      if (actor.dead || actor.spawning || !actor.isBot) continue;
      this.stepAi(actor);
    }

    // 5. Actors Physics, Status & Regen
    for (const actor of this.actors) {
      this.stepActor(actor);
    }

    // 6. Bombs, Rockets & Mines (hb.java)
    this.stepBombs();

    // 7. Blast Waves (p.java)
    for (let i = this.explosions.length - 1; i >= 0; i--) {
      const ex = this.explosions[i];
      ex.ticks++;
      ex.frame = Math.floor(ex.ticks / 2);
      if (ex.ticks >= ex.maxTicks) {
        ex.removed = true;
        this.explosions.splice(i, 1);
      }
    }

    // 8. Pickups & CTF Flags (s.java)
    this.stepPickupsAndFlags();

    // 9. Floating text & particles (w.java / t.java)
    for (let i = this.floatingTexts.length - 1; i >= 0; i--) {
      const ft = this.floatingTexts[i];
      ft.ticks++;
      ft.rise += 0.5;
      if (ft.ticks >= 42) this.floatingTexts.splice(i, 1);
    }
    for (let i = this.particles.length - 1; i >= 0; i--) {
      const pt = this.particles[i];
      pt.ticks++;
      pt.x += pt.vx;
      pt.y += pt.vy;
      pt.frame = Math.floor((pt.ticks / pt.maxTicks) * pt.frames);
      if (pt.ticks >= pt.maxTicks) this.particles.splice(i, 1);
    }

    // 10. Campaign Spawners & Triggers
    if (this.isCampaign && !this.finished) {
      this.stepSpawners(false);
      this.stepTriggers();
      this.checkCampaignState();
    }

    // 11. Weather thunder & random droplets
    if (this.weatherEnabled && Math.random() < 0.0025) {
      this.lightningFlash = 4;
    }

    // 12. Update camera follow
    this.updateCamera();
  }

  applyActorInput(actor, inp) {
    if (!inp || actor.dead || actor.spawning) return;
    if (actor.stunTicks > 0) return;

    if (inp.selectPrimary !== undefined && inp.selectPrimary >= 0 && inp.selectPrimary < 14) {
      actor.primaryWeapon = inp.selectPrimary;
    }
    if (inp.selectSecondary !== undefined && inp.selectSecondary >= 0) {
      actor.secondaryWeapon = inp.selectSecondary;
    }

    if (inp.firePrimary) {
      this.fireWeapon(actor, actor.primaryWeapon);
    }
    if (inp.fireSecondary && actor.secondaryWeapon !== -1) {
      if (actor.secondaryWeapon < 14) {
        this.fireWeapon(actor, actor.secondaryWeapon);
      } else {
        this.useSupportItem(actor, actor.secondaryWeapon - 14);
      }
    }
    if (inp.useItem !== undefined && inp.useItem >= 0 && inp.useItem < 6) {
      this.useSupportItem(actor, inp.useItem);
    }

    if (inp.dashDir !== undefined && inp.dashDir !== -1 && actor.dashCooldown <= 0 && !actor.dashing) {
      actor.dashing = true;
      actor.dashDir = inp.dashDir;
      actor.dashSteps = 4;
      actor.dashInvuln = false;
      actor.dashCooldown = 14;
      this.onSfx('jump');
    }

    if (inp.moveDir !== undefined && inp.moveDir !== -1) {
      actor.wantMoveDir = inp.moveDir;
    } else {
      actor.wantMoveDir = -1;
    }
  }

  /**
   * Port of q.b(byte weaponId, ...) & weapon ammo handling.
   */
  fireWeapon(actor, weaponId) {
    if (actor.dead || weaponId < -6 || actor.stunTicks > 0) return false;
    if (weaponId >= 0) {
      if ((actor.weaponCooldowns[weaponId] || 0) > 0) return false;
      const count = actor.weapons[weaponId] ?? 0;
      if (count === 0) {
        if (actor === this.player) this.onSfx('denied');
        this.autoFallbackWeapon(actor);
        return false;
      }
      if (count > 0) actor.weapons[weaponId]--;
      actor.weaponCooldowns[weaponId] = weaponId === 2 ? 12 : weaponId === 10 || weaponId === 11 ? 15 : 16;
    }

    if (actor === this.player) this.onSfx('throw');
    this.spawnBomb(weaponId, actor.tx, actor.ty, actor, actor.dir);
    return true;
  }

  autoFallbackWeapon(actor) {
    for (let i = 0; i < 14; i++) {
      if ((actor.weapons[i] ?? 0) !== 0) {
        actor.primaryWeapon = i;
        return;
      }
    }
    actor.primaryWeapon = -1;
  }

  /**
   * Port of q.d(byte itemId, boolean fromNet) (q.java:3054-3109).
   */
  useSupportItem(actor, itemId) {
    if (actor.dead || (actor.items[itemId] ?? 0) === 0 || itemId === 5) return false;
    if ((itemId === 1 || itemId === 2 || itemId === 3) && (actor.berserkTicks > 0 || actor.invisTicks > 0 || actor.kaskaTicks > 0)) {
      return false;
    }
    if (actor.items[itemId] > 0) actor.items[itemId]--;

    if (itemId === 0) {
      // Banana: +1 peel weapon (10) & heal 50% maxHP
      actor.weapons[10] = (actor.weapons[10] || 0) + 1;
      this.healActor(actor, Math.floor(actor.maxHp / 2), false);
    } else if (itemId === 1) {
      actor.berserkTicks = (30 + 15 * (actor.skills?.[9] || 0)) * 25;
      this.onSfx('pickup');
    } else if (itemId === 2) {
      actor.invisTicks = (30 + 30 * (actor.skills?.[10] || 0)) * 25;
      this.onSfx('pickup');
    } else if (itemId === 3) {
      actor.kaskaTicks = 30 * 25;
      this.onSfx('pickup');
    } else if (itemId === 4) {
      // Carrot: +90 HP overheal up to 2x maxHp
      this.healActor(actor, 90, true);
    }
    return true;
  }

  healActor(actor, amount, overheal = false) {
    if (actor.dead) return;
    const cap = overheal ? actor.maxHp * 2 : actor.maxHp;
    const prev = actor.hp;
    actor.hp = Math.min(cap, actor.hp + amount);
    const diff = actor.hp - prev;
    if (diff > 0) {
      this.floatingTexts.push({
        x: actor.px / 10,
        y: actor.py / 10 - 20,
        text: `+${diff}`,
        rise: 0,
        ticks: 0,
        tone: 2,
      });
      if (actor === this.player) this.onSfx('heal');
    }
  }

  stepActor(actor) {
    if (actor.hurtFlash > 0) actor.hurtFlash--;
    if (actor.dashCooldown > 0) actor.dashCooldown--;
    if (actor.stunTicks > 0) actor.stunTicks--;
    if (actor.berserkTicks > 0) actor.berserkTicks--;
    if (actor.invisTicks > 0) actor.invisTicks--;
    if (actor.kaskaTicks > 0) actor.kaskaTicks--;

    if (actor.poisonTicks > 0) {
      actor.poisonTicks--;
      if (actor.poisonTicks % 25 === 0) {
        this.damageActor(actor, 5, actor.poisonOwnerId, 9);
      }
    }

    for (let i = 0; i < actor.weaponCooldowns.length; i++) {
      if (actor.weaponCooldowns[i] > 0) actor.weaponCooldowns[i]--;
    }

    if (actor.dead) {
      if (actor.deathTimer > 0) {
        actor.deathTimer--;
        actor.deathAnimIdx += 0.35;
      }
      if (!this.isCampaign && actor.isPlayerOrBot) {
        actor.respawnTimer--;
        if (actor.respawnTimer <= 0) {
          this.respawnArenaActor(actor);
        }
      }
      return;
    }

    if (actor.spawning) {
      actor.spawnFrame += 0.35;
      if (actor.spawnFrame >= 8) actor.spawning = false;
      return;
    }

    // Dashing & berserker contact bump
    if (actor.berserkTicks > 0) {
      for (const other of this.actors) {
        if (other !== actor && !other.dead && !this.isAlly(actor, other) && other.tx === actor.tx && other.ty === actor.ty) {
          const dmg = Math.max(50, Math.floor(other.maxHp / 2) + 30 * (actor.skills?.[9] || 0));
          this.damageActor(other, dmg, actor.id, 0);
        }
      }
    }

    if (actor.stunTicks > 0) {
      actor.moving = false;
      return;
    }

    // Tile-aligned grid movement (q.java:4195-4365)
    if (actor.dashing) {
      const dx = DIR_DX[actor.dashDir];
      const dy = DIR_DY[actor.dashDir];
      const dashSpd = 90;
      const nx = actor.px + dx * dashSpd;
      const ny = actor.py + dy * dashSpd;
      const ntx = Math.floor(nx / 300);
      const nty = Math.floor(ny / 300);
      if (this.isWalkable(ntx, nty)) {
        actor.px = nx;
        actor.py = ny;
        actor.tx = ntx;
        actor.ty = nty;
        actor.moving = true;
        actor.dir = actor.dashDir;
      } else {
        actor.dashing = false;
      }
      actor.dashSteps--;
      if (actor.dashSteps <= 0) {
        actor.dashing = false;
        actor.px = (actor.tx * 30 + 15) * 10;
        actor.py = (actor.ty * 30 + 15) * 10;
      }
      return;
    }

    const moveDir = actor.wantMoveDir ?? -1;
    const centerX = (actor.tx * 30 + 15) * 10;
    const centerY = (actor.ty * 30 + 15) * 10;

    if (moveDir !== -1) {
      actor.dir = moveDir;
      const spd = Math.round(actor.speed * (actor.berserkTicks > 0 ? 1.45 : 1) * (this.walkability[actor.tx]?.[actor.ty] === 2 ? 0.72 : 1));
      const nx = actor.px + DIR_DX[moveDir] * spd;
      const ny = actor.py + DIR_DY[moveDir] * spd;

      // Keep orthogonal axis aligned cleanly to lane center (prevents snagging corners just like J2ME q.b)
      const alignX = DIR_DX[moveDir] === 0 ? Math.round(actor.px + Math.sign(centerX - actor.px) * Math.min(Math.abs(centerX - actor.px), spd)) : nx;
      const alignY = DIR_DY[moveDir] === 0 ? Math.round(actor.py + Math.sign(centerY - actor.py) * Math.min(Math.abs(centerY - actor.py), spd)) : ny;

      const checkTx = Math.floor((alignX + DIR_DX[moveDir] * 110) / 300);
      const checkTy = Math.floor((alignY + DIR_DY[moveDir] * 110) / 300);

      if (this.isWalkable(checkTx, checkTy)) {
        actor.px = alignX;
        actor.py = alignY;
        actor.tx = Math.floor(actor.px / 300);
        actor.ty = Math.floor(actor.py / 300);
        actor.moving = true;
      } else {
        // Check interactive Well / Crate bump
        const obs = this.inBounds(checkTx, checkTy) ? this.tiles[checkTx][checkTy].d : null;
        if (obs && obs.isWell && obs.wellReady && actor.charType === 0 && actor.hp < actor.maxHp) {
          this.healActor(actor, actor.maxHp - actor.hp, false);
          obs.wellReady = false;
          obs.wellCooldown = 375; // 15s recharge
          obs.bailFrame = 0;
        }
        if (obs && obs.isCrateEnd && actor === this.player) {
          this.finishCampaignVictory();
        }
        actor.moving = false;
      }
    } else {
      // Snap gently to tile center when released (q.j())
      const dx = centerX - actor.px;
      const dy = centerY - actor.py;
      if (Math.abs(dx) <= 35 && Math.abs(dy) <= 35) {
        actor.px = centerX;
        actor.py = centerY;
        actor.moving = false;
      } else {
        actor.px += Math.sign(dx) * Math.min(30, Math.abs(dx));
        actor.py += Math.sign(dy) * Math.min(30, Math.abs(dy));
      }
    }
  }

  isAlly(a, b) {
    if (!a || !b) return false;
    if (a.id === b.id) return !this.friendlyFire;
    if (this.isCampaign) return a.team === b.team;
    if (this.isTeamMode) return a.team === b.team && !this.friendlyFire;
    return false;
  }

  damageActor(target, amount, attackerId = -1, weaponId = 0) {
    if (!target || target.dead || target.dashInvuln || amount <= 0) return;
    const attacker = attackerId !== -1 ? this.actors.find((a) => a.id === attackerId) : null;
    if (attacker && attacker !== target && this.isAlly(attacker, target)) return;

    const finalDmg = target.kaskaTicks > 0 ? Math.max(1, Math.floor(amount / 2)) : amount;
    target.hp -= finalDmg;
    target.hurtFlash = 5;

    this.floatingTexts.push({
      x: target.px / 10,
      y: target.py / 10 - 20,
      text: `-${finalDmg}`,
      rise: 0,
      ticks: 0,
      tone: 1,
    });

    if (this.bloodEnabled) {
      this.decals.push({
        sheet: 'bmBloodPool',
        x: target.px / 10,
        y: target.py / 10 + 4,
        frame: 0,
      });
      if (this.decals.length > 80) this.decals.shift();
    }

    if (target === this.player) {
      this.onSfx('pain');
    }

    if (target.hp <= 0) {
      target.hp = 0;
      target.dead = true;
      target.deathTimer = 25;
      target.deathAnimIdx = 0;
      target.respawnTimer = 200; // 8s arena respawn
      target.deaths++;

      // Drop CTF flag if holding one
      if (this.mode === 2 && this.flags) {
        for (const f of this.flags) {
          if (f.carrierId === target.id) {
            f.carrierId = null;
            f.x = target.tx * 30 + 15;
            f.y = target.ty * 30 + 15;
            f.droppedTimer = 300;
            this.addKillfeed(`${target.name} ^17~`);
          }
        }
      }

      if (attacker && attacker !== target) {
        attacker.kills++;
        if (this.isTeamMode && !this.isCampaign && this.mode === 1) {
          this.teamScores[attacker.team] = (this.teamScores[attacker.team] || 0) + 1;
        }
        if (attacker === this.player && this.isCampaign) {
          const reward = target.charType === 4 ? 14 : target.charType === 2 ? 25 : 6;
          this.player.coins += reward;
          this.coinsEarned += reward;
          this.floatingTexts.push({
            x: target.px / 10,
            y: target.py / 10 - 30,
            text: `+${reward}^41~`,
            rise: 0,
            ticks: 0,
            tone: 2,
          });
        }
        this.addKillfeed(`${attacker.name} (${attacker.kills}) ${WEAPON_ICON_CODES[weaponId] || '^9~'} ${target.name}`);
      } else {
        this.addKillfeed(`${target.name} ^9~`);
      }

      if (target === this.player) this.onSfx('death');
      if (target.spawnerId >= 0 && this.spawners[target.spawnerId]) {
        const sp = this.spawners[target.spawnerId];
        sp.aliveIds = sp.aliveIds.filter((id) => id !== target.id);
      }

      if (!this.isCampaign && this.mode === 0 && attacker && attacker.kills >= this.scoreLimit) {
        this.finished = true;
        this.winnerTeam = attacker.id;
      } else if (!this.isCampaign && this.mode === 1 && attacker && this.teamScores[attacker.team] >= this.scoreLimit) {
        this.finished = true;
        this.winnerTeam = attacker.team;
      }
    }
  }

  respawnArenaActor(actor) {
    const spawns = this.findArenaSpawns(4);
    const sp = spawns[Math.floor(Math.random() * spawns.length)];
    actor.dead = false;
    actor.deathTimer = 0;
    actor.spawning = true;
    actor.spawnFrame = 0;
    actor.hp = actor.maxHp;
    actor.tx = sp.tx;
    actor.ty = sp.ty;
    actor.px = (sp.tx * 30 + 15) * 10;
    actor.py = (sp.ty * 30 + 15) * 10;
    actor.pz = 0;
    actor.stunTicks = 0;
    actor.poisonTicks = 0;
    if (actor === this.player) this.snapCameraToTarget();
  }

  stepBombs() {
    for (let i = this.bombs.length - 1; i >= 0; i--) {
      const b = this.bombs[i];
      if (b.removed) {
        this.bombs.splice(i, 1);
        continue;
      }
      b.frame++;

      // Arm mines after brief safety delay
      if (!b.armed && b.armTimer > 0) {
        b.armTimer--;
        if (b.armTimer === 0) b.armed = true;
      }

      // Move flying / rolling projectiles
      if (b.vx !== 0 || b.vy !== 0 || b.vz !== 0) {
        const nx = b.px + b.vx;
        const ny = b.py + b.vy;
        const ntx = Math.floor(nx / 300);
        const nty = Math.floor(ny / 300);
        b.pz = Math.max(0, b.pz + b.vz);
        if (b.kind === 7 || b.kind === 8) b.vz -= 4;

        if (!this.isWalkable(ntx, nty)) {
          if (b.kind === 5 || b.kind === 6) {
            if (b.bouncesLeft > 0) {
              b.bouncesLeft--;
              b.vx = -b.vx;
              b.vy = -b.vy;
              this.onSfx('bounce');
            } else {
              this.detonateBomb(b);
            }
          } else {
            this.detonateBomb(b);
          }
          continue;
        }
        b.px = nx;
        b.py = ny;
        b.tx = ntx;
        b.ty = nty;
      }

      // Contact check for mines, rakes, bananas, bricks, rockets
      if (b.armed && (b.kind === 2 || b.kind === 9 || b.kind === 10 || b.kind === 11 || b.kind === 13 || b.kind === -4 || b.kind === -5 || b.kind === -6)) {
        for (const a of this.actors) {
          if (a.dead || a.spawning || (b.ownerId === a.id && b.fuse < 5)) continue;
          if (a.tx === b.tx && a.ty === b.ty) {
            if (a.id === b.ownerId && (b.kind === 2 || b.kind <= -4)) continue;
            if (b.kind === 2) {
              // Brick stun + direct hit
              this.damageActor(a, b.damage, b.ownerId, 2);
              const owner = this.actors.find((o) => o.id === b.ownerId);
              a.stunTicks = Math.max(a.stunTicks, getBrickStunTicks(owner));
              this.explodeTile(b.tx, b.ty, 'brick', 0, b.ownerId, 2);
              b.removed = true;
            } else if (b.kind === 11) {
              // Rake stun + hit
              this.damageActor(a, b.damage, b.ownerId, 11);
              const owner = this.actors.find((o) => o.id === b.ownerId);
              a.stunTicks = Math.max(a.stunTicks, getRakeStunTicks(owner));
              b.removed = true;
            } else if (b.kind === 10) {
              // Stinky sock -> gas cloud
              a.poisonTicks = Math.max(a.poisonTicks, 125);
              a.poisonOwnerId = b.ownerId;
            } else if (b.kind === 9 || b.kind === 13 || b.kind <= -4) {
              this.detonateBomb(b);
            }
            if (b.removed) break;
          }
        }
      }

      if (b.gasTimer > 0) {
        b.gasTimer--;
        if (b.gasTimer <= 0) b.removed = true;
        else if (this.tickCount % 15 === 0) {
          this.explosions.push({ tx: b.tx, ty: b.ty, style: 'gas', ticks: 0, maxTicks: 16, frame: 0, removed: false });
        }
      }

      if (b.fuse > 0) {
        b.fuse--;
        if (b.fuse <= 0) {
          this.detonateBomb(b);
        }
      }
    }
  }

  detonateBomb(b) {
    if (b.removed) return;
    b.removed = true;
    if (b.kind === -4) {
      this.explodeTile(b.tx, b.ty, 'gas', b.damage, b.ownerId, b.kind);
      return;
    }

    this.onSfx('explosion');
    this.shakeAmp = 4;
    this.shakeTicks = 6;

    const style = b.kind === 0 || b.kind === 3 || b.kind === 5 ? 'melon' : b.kind === 1 || b.kind === 4 || b.kind === 6 ? 'melonHard' : b.kind === 7 || b.kind === 8 ? 'ananas' : b.kind === 12 || b.kind === 9 ? 'bomb' : 'fire';

    this.decals.push({
      sheet: b.kind === 12 || b.kind === 9 ? 'bombCrater' : 'melonCrater',
      x: b.tx * 30 + 15,
      y: b.ty * 30 + 15,
      frame: 0,
    });
    if (this.decals.length > 80) this.decals.shift();

    // Cross propagation (p.java) respecting solid walls!
    this.explodeTile(b.tx, b.ty, style, b.damage, b.ownerId, b.kind);
    for (let d = 0; d < 4; d++) {
      for (let dist = 1; dist <= b.radius; dist++) {
        const tx = b.tx + DIR_DX[d] * dist;
        const ty = b.ty + DIR_DY[d] * dist;
        if (!this.inBounds(tx, ty)) break;
        const obs = this.tiles[tx][ty].d;
        const stepDmg = Math.max(10, Math.floor(b.damage / (dist === 1 ? 1 : 1.5)));
        if (obs && !obs.removed) {
          if (obs.destructible) {
            obs.hp -= stepDmg;
            obs.shakeX = (Math.random() - 0.5) * 4;
            obs.shakeY = (Math.random() - 0.5) * 4;
            this.explodeTile(tx, ty, style, 0, b.ownerId, b.kind);
            if (obs.hp <= 0) {
              obs.removed = true;
              this.tiles[tx][ty].d = null;
              this.rebuildWalkability();
            } else if (obs.destructKind === 1 && obs.maxHp > 0) {
              const pct = Math.floor((100 * obs.hp) / obs.maxHp);
              obs.frame = obs.baseFrame + Math.min(3, Math.floor((99 - pct) / 25));
            }
          }
          break; // Walls stop explosion propagation
        }
        this.explodeTile(tx, ty, style, stepDmg, b.ownerId, b.kind);
      }
    }
  }

  explodeTile(tx, ty, style, dmg, ownerId, weaponId) {
    this.explosions.push({
      tx,
      ty,
      style,
      frame: 0,
      ticks: 0,
      maxTicks: 14,
      removed: false,
    });
    if (dmg > 0) {
      for (const a of this.actors) {
        if (!a.dead && a.tx === tx && a.ty === ty) {
          this.damageActor(a, dmg, ownerId, weaponId);
        }
      }
    }
  }

  stepPickupsAndFlags() {
    for (const pk of this.pickups) {
      if (pk.removed) {
        if (pk.respawn) {
          pk.respawnTimer--;
          if (pk.respawnTimer <= 0) {
            pk.removed = false;
          }
        }
        continue;
      }
      for (const a of this.actors) {
        if (a.dead || a.spawning || a.tx !== pk.tx || a.ty !== pk.ty) continue;
        if (this.isCampaign && a !== this.player && pk.type !== 1) continue;

        let consumed = true;
        if (pk.type === 1) {
          // Trampoline bounce (s.java:250)
          a.dashing = true;
          a.dashDir = a.dir;
          a.dashSteps = 4;
          a.dashInvuln = true;
          this.onSfx('jump');
          consumed = false;
        } else if (pk.type === 2) {
          a.berserkTicks = (30 + 15 * (a.skills?.[9] || 0)) * 25;
        } else if (pk.type === 3) {
          a.invisTicks = (30 + 30 * (a.skills?.[10] || 0)) * 25;
        } else if (pk.type === 12) {
          a.kaskaTicks = 30 * 25;
        } else if (pk.type === 4) {
          a.items[0] = (a.items[0] || 0) + 1;
        } else if (pk.type === 10) {
          a.items[4] = (a.items[4] || 0) + 1;
        } else if (pk.type === 17) {
          const val = 10 + Math.floor(Math.random() * 15);
          a.coins += val;
          if (a === this.player) this.coinsEarned += val;
        } else {
          // Ammo pickup mappings from s.java
          const ammoMap = { 5: [9, 3], 7: [2, 6], 8: [5, 6], 9: [3, 10], 11: [0, 10], 13: [7, 5], 14: [12, 3], 15: [13, 3] };
          const grant = ammoMap[pk.type];
          if (grant) {
            a.weapons[grant[0]] = (a.weapons[grant[0]] || 0) + grant[1];
          }
        }

        if (consumed) {
          pk.removed = true;
          pk.respawnTimer = pk.respawn ? 250 : 0;
          if (a === this.player) {
            this.itemsPicked++;
            this.onSfx('pickup');
          }
        }
      }
    }

    // CTF Flags (s.java + fb.java:1228)
    if (this.mode === 2 && this.flags) {
      for (const f of this.flags) {
        if (f.carrierId !== null) {
          const holder = this.actors.find((a) => a.id === f.carrierId);
          if (!holder || holder.dead) {
            f.carrierId = null;
            f.droppedTimer = 300;
          } else {
            f.x = holder.px / 10;
            f.y = holder.py / 10;
            const myBase = this.flagBases.find((b) => b.team === holder.team);
            const myFlag = this.flags.find((fl) => fl.team === holder.team);
            const isHome = myFlag && Math.floor(myFlag.x / 30) === myBase?.tx && Math.floor(myFlag.y / 30) === myBase?.ty;
            if (myBase && isHome && holder.tx === myBase.tx && holder.ty === myBase.ty) {
              this.teamScores[holder.team] = (this.teamScores[holder.team] || 0) + 1;
              holder.kills += 5;
              this.addKillfeed(`${holder.name} ^20~`);
              f.carrierId = null;
              f.x = f.homeTx * 30 + 15;
              f.y = f.homeTy * 30 + 15;
              this.onSfx('pickup');
              if (this.teamScores[holder.team] >= this.scoreLimit) {
                this.finished = true;
                this.winnerTeam = holder.team;
              }
            }
          }
        } else {
          if (f.droppedTimer > 0) {
            f.droppedTimer--;
            if (f.droppedTimer === 0) {
              f.x = f.homeTx * 30 + 15;
              f.y = f.homeTy * 30 + 15;
            }
          }
          const ftx = Math.floor(f.x / 30);
          const fty = Math.floor(f.y / 30);
          for (const a of this.actors) {
            if (a.dead || a.spawning || a.tx !== ftx || a.ty !== fty) continue;
            if (a.team !== f.team) {
              f.carrierId = a.id;
              this.addKillfeed(`${a.name} ^16~`);
              this.onSfx('pickup');
              break;
            } else if (ftx !== f.homeTx || fty !== f.homeTy) {
              // Return friendly dropped flag home
              f.x = f.homeTx * 30 + 15;
              f.y = f.homeTy * 30 + 15;
              this.addKillfeed(`${a.name} ^17~`);
              this.onSfx('pickup');
            }
          }
        }
      }
    }
  }

  /**
   * Port of y.java (Bot AI: scan enemies, dodge bombs, fire weapons, CTF flag pursuit).
   */
  stepAi(actor) {
    if (actor.botThinkTimer > 0) {
      actor.botThinkTimer--;
      return;
    }
    actor.botThinkTimer = actor.charType === 0 ? Math.max(1, 4 - Math.floor(actor.botSkill / 3)) : 3;

    // Avoid active ticking bombs on current tile or ahead
    const dangerHere = this.bombs.some((b) => !b.removed && Math.abs(b.tx - actor.tx) <= 1 && Math.abs(b.ty - actor.ty) <= 1 && b.fuse > 0);
    if (dangerHere) {
      for (let d = 0; d < 4; d++) {
        const ntx = actor.tx + DIR_DX[d];
        const nty = actor.ty + DIR_DY[d];
        if (this.isWalkable(ntx, nty) && !this.bombs.some((b) => b.tx === ntx && b.ty === nty)) {
          actor.wantMoveDir = d;
          return;
        }
      }
    }

    // Find closest enemy
    let target = null;
    let bestDist = 999;
    for (const other of this.actors) {
      if (other.dead || other.invisTicks > 0 || this.isAlly(actor, other)) continue;
      const d = Math.abs(other.tx - actor.tx) + Math.abs(other.ty - actor.ty);
      if (d < bestDist) {
        bestDist = d;
        target = other;
      }
    }

    if (!target) {
      // Wander
      if (Math.random() < 0.25) {
        actor.wantMoveDir = Math.floor(Math.random() * 4);
      }
      return;
    }

    // Check line of sight along axes (y.b())
    const alignedX = target.tx === actor.tx;
    const alignedY = target.ty === actor.ty;
    if ((alignedX || alignedY) && bestDist <= 6) {
      const aimDir = alignedX ? (target.ty > actor.ty ? 0 : 2) : (target.tx > actor.tx ? 3 : 1);
      if (this.hasLineOfSight(actor.tx, actor.ty, aimDir, bestDist)) {
        actor.dir = aimDir;
        if (actor.charType === 5 && bestDist <= 2) {
          this.fireWeapon(actor, 12);
        } else {
          this.fireWeapon(actor, actor.primaryWeapon);
        }
        actor.wantMoveDir = bestDist > 3 ? aimDir : -1;
        return;
      }
    }

    // Step toward target (or enemy flag in CTF)
    let goalX = target.tx;
    let goalY = target.ty;
    if (this.mode === 2 && this.flags) {
      const holding = this.flags.some((f) => f.carrierId === actor.id);
      if (holding) {
        const home = this.flagBases.find((b) => b.team === actor.team);
        if (home) {
          goalX = home.tx;
          goalY = home.ty;
        }
      } else {
        const enemyFlag = this.flags.find((f) => f.team !== actor.team);
        if (enemyFlag) {
          goalX = Math.floor(enemyFlag.x / 30);
          goalY = Math.floor(enemyFlag.y / 30);
        }
      }
    }

    const dx = goalX - actor.tx;
    const dy = goalY - actor.ty;
    const prefDirs = Math.abs(dx) >= Math.abs(dy)
      ? [dx > 0 ? 3 : 1, dy > 0 ? 0 : 2, dy > 0 ? 2 : 0, dx > 0 ? 1 : 3]
      : [dy > 0 ? 0 : 2, dx > 0 ? 3 : 1, dx > 0 ? 1 : 3, dy > 0 ? 2 : 0];

    for (const d of prefDirs) {
      const ntx = actor.tx + DIR_DX[d];
      const nty = actor.ty + DIR_DY[d];
      if (this.isWalkable(ntx, nty)) {
        actor.wantMoveDir = d;
        return;
      }
    }
    actor.wantMoveDir = -1;
  }

  hasLineOfSight(tx, ty, dir, maxDist) {
    for (let i = 1; i < maxDist; i++) {
      const cx = tx + DIR_DX[dir] * i;
      const cy = ty + DIR_DY[dir] * i;
      if (!this.isWalkable(cx, cy)) return false;
    }
    return true;
  }

  stepSpawners(initialPass) {
    for (const sp of this.spawners) {
      if (sp.inactive || sp.remaining <= 0 || sp.charType === 0) continue;
      const activeCount = sp.aliveIds.filter((id) => {
        const a = this.actors.find((x) => x.id === id);
        return a && !a.dead;
      }).length;
      if (activeCount >= sp.maxAlive) continue;
      if (!initialPass && sp.cooldown > 0) {
        sp.cooldown--;
        continue;
      }
      const mob = this.spawnActor({
        charType: sp.charType,
        team: sp.team >= 0 ? 1 : 1,
        tx: sp.tx,
        ty: sp.ty,
        name: `Mob${sp.id}`,
        isBot: true,
        botSkill: sp.skill,
        spawning: !initialPass,
        spawnerId: sp.id,
        rush: sp.rush,
      });
      sp.aliveIds.push(mob.id);
      sp.remaining--;
      sp.cooldown = Math.max(10, sp.respawnSec * 25);
    }
  }

  stepTriggers() {
    const p = this.player;
    if (!p || p.dead) return;
    for (const tr of this.triggers) {
      if (tr.fired) continue;
      const radius = Math.max(0, tr.p?.[1] || 0);
      const dist = Math.max(Math.abs(p.tx - tr.tx), Math.abs(p.ty - tr.ty));
      if (tr.action === 3 && dist <= radius) {
        this.fireTrigger(tr, p);
      } else if (tr.action === 6 && dist <= radius) {
        this.fireTrigger(tr, p);
      } else if (tr.action === 21 && dist <= radius) {
        this.fireTrigger(tr, p);
      }
    }
  }

  fireTrigger(tr, actor) {
    tr.fired = true;
    if (tr.action === 3) {
      // Win objective zone
      this.finishCampaignVictory();
    } else if (tr.action === 6 || tr.action === 21) {
      const hintIdx = tr.p?.[2] ?? 0;
      this.onShowText(hintIdx);
    }
  }

  checkCampaignState() {
    if (this.finished) return;
    if (this.player && this.player.dead) {
      if (this.player.items[5] > 0 && this.player.deathTimer === 1) {
        // Auto-consume an Easter Egg extra life!
        this.player.items[5]--;
        this.player.dead = false;
        this.player.hp = this.player.maxHp;
        this.player.spawning = true;
        this.player.spawnFrame = 0;
        this.onSfx('pickup');
      } else if (this.player.items[5] <= 0 && this.player.deathTimer <= 0) {
        this.finished = true;
        this.onCampaignEnd(false, this.buildStats());
      }
      return;
    }

    const aliveEnemies = this.actors.some((a) => !a.dead && a.team !== 0);
    const pendingSpawners = this.spawners.some((s) => !s.inactive && s.team !== 0 && s.charType !== 0 && s.remaining > 0);
    if (!aliveEnemies && !pendingSpawners && !this.hasWinTriggerZone()) {
      if (this.campaignWinCountdown < 0) {
        this.campaignWinCountdown = 75; // 3s celebratory clear countdown
      } else if (this.campaignWinCountdown > 0) {
        this.campaignWinCountdown--;
      } else {
        this.finishCampaignVictory();
      }
    }
  }

  hasWinTriggerZone() {
    return this.triggers.some((t) => t.action === 3);
  }

  finishCampaignVictory() {
    if (this.finished) return;
    this.finished = true;
    this.onCampaignEnd(true, this.buildStats());
  }

  buildStats() {
    const p = this.player;
    return {
      kills: p?.kills ?? 0,
      itemsPicked: this.itemsPicked,
      coinsEarned: this.coinsEarned,
      totalCoins: p?.coins ?? 0,
      elapsedSec: Math.max(1, Math.floor((Date.now() - this.startTimeMs) / 1000)),
      player: p,
    };
  }

  addKillfeed(text) {
    this.killfeed.unshift({ text, ttl: 75 });
    if (this.killfeed.length > 3) this.killfeed.pop();
  }

  updateCamera() {
    const focus = this.player || this.actors[0];
    if (!focus) return;
    let tx = focus.px / 10 - 120;
    let ty = focus.py / 10 - 160;
    if (focus === this.player) {
      tx += DIR_DX[focus.dir] * 28;
      ty += DIR_DY[focus.dir] * 28;
    }
    const maxCamX = Math.max(0, this.width * 30 - 240);
    const maxCamY = Math.max(0, this.height * 30 - 320);
    tx = Math.max(15, Math.min(maxCamX - 15, tx));
    ty = Math.max(15, Math.min(maxCamY - 15, ty));
    this.targetCamX = tx;
    this.targetCamY = ty;
    this.camX += (this.targetCamX - this.camX) * 0.25;
    this.camY += (this.targetCamY - this.camY) * 0.25;
    if (this.shakeTicks > 0) {
      this.camX += (Math.random() - 0.5) * this.shakeAmp;
      this.camY += (Math.random() - 0.5) * this.shakeAmp;
    }
  }

  snapCameraToTarget() {
    const focus = this.player || this.actors[0];
    if (!focus) return;
    const maxCamX = Math.max(0, this.width * 30 - 240);
    const maxCamY = Math.max(0, this.height * 30 - 320);
    this.camX = Math.max(0, Math.min(maxCamX, focus.px / 10 - 120));
    this.camY = Math.max(0, Math.min(maxCamY, focus.py / 10 - 160));
    this.targetCamX = this.camX;
    this.targetCamY = this.camY;
  }

  /**
   * Compact serializable state snapshot for 2-4 player online MP Host -> Guest sync.
   */
  exportNetSnapshot() {
    return {
      t: this.tickCount,
      fin: this.finished ? 1 : 0,
      win: this.winnerTeam,
      ts: this.teamScores,
      kf: this.killfeed.slice(0, 3).map((k) => k.text),
      obsRm: this.obstacles.filter((o) => o.removed).map((o) => [o.tx, o.ty]),
      a: this.actors.map((a) => ({
        id: a.id,
        px: Math.round(a.px),
        py: Math.round(a.py),
        pz: Math.round(a.pz),
        d: a.dir,
        m: a.moving ? 1 : 0,
        hp: a.hp,
        mhp: a.maxHp,
        k: a.kills,
        dt: a.deaths,
        c: a.coins,
        tm: a.team,
        nm: a.name,
        dd: a.dead ? 1 : 0,
        rt: a.respawnTimer,
        inv: a.invisTicks,
        bsk: a.berserkTicks,
        ksk: a.kaskaTicks,
        pw: a.primaryWeapon,
        sw: a.secondaryWeapon,
        wc: a.weapons,
        ic: a.items,
      })),
      b: this.bombs.map((b) => ({
        id: b.id,
        k: b.kind,
        px: Math.round(b.px),
        py: Math.round(b.py),
        pz: Math.round(b.pz),
        tx: b.tx,
        ty: b.ty,
        f: b.frame,
      })),
      ex: this.explosions.map((e) => [e.tx, e.ty, e.style, e.frame]),
      pk: this.pickups.filter((p) => !p.removed).map((p) => [p.id, p.type, p.tx, p.ty]),
      fl: this.flags.map((f) => [f.team, Math.round(f.x), Math.round(f.y), f.carrierId]),
    };
  }

  /**
   * Apply Host snapshot cleanly on Guest side + rebind local player perspective.
   */
  applyNetSnapshot(snap, localPlayerId) {
    if (!snap) return;
    this.tickCount = snap.t;
    this.finished = !!snap.fin;
    this.winnerTeam = snap.win;
    if (Array.isArray(snap.ts)) this.teamScores = [...snap.ts];
    if (Array.isArray(snap.kf)) {
      this.killfeed = snap.kf.map((text) => ({ text, ttl: 40 }));
    }

    // Reconcile destroyed obstacles
    if (Array.isArray(snap.obsRm)) {
      for (const [tx, ty] of snap.obsRm) {
        if (this.inBounds(tx, ty) && this.tiles[tx][ty].d) {
          this.tiles[tx][ty].d.removed = true;
          this.tiles[tx][ty].d = null;
        }
      }
      this.rebuildWalkability();
    }

    // Update actors
    if (Array.isArray(snap.a)) {
      const nextIds = new Set();
      for (const s of snap.a) {
        nextIds.add(s.id);
        let a = this.actors.find((x) => x.id === s.id);
        if (!a) {
          a = this.spawnActor({ id: s.id, charType: 0, team: s.tm, tx: Math.floor(s.px / 300), ty: Math.floor(s.py / 300), name: s.nm, isPlayerOrBot: true });
        }
        a.px = s.px;
        a.py = s.py;
        a.pz = s.pz;
        a.tx = Math.floor(s.px / 300);
        a.ty = Math.floor(s.py / 300);
        a.dir = s.d;
        a.moving = !!s.m;
        a.hp = s.hp;
        a.maxHp = s.mhp;
        a.kills = s.k;
        a.deaths = s.dt;
        a.coins = s.c;
        a.team = s.tm;
        a.dead = !!s.dd;
        a.respawnTimer = s.rt;
        a.invisTicks = s.inv;
        a.berserkTicks = s.bsk;
        a.kaskaTicks = s.ksk;
        a.primaryWeapon = s.pw;
        a.secondaryWeapon = s.sw;
        if (s.wc) a.weapons = s.wc;
        if (s.ic) a.items = s.ic;
        if (s.id === localPlayerId) {
          this.player = a;
        }
      }
      this.actors = this.actors.filter((a) => nextIds.has(a.id));
    }

    if (Array.isArray(snap.b)) {
      this.bombs = snap.b.map((b) => ({
        id: b.id,
        kind: b.k,
        px: b.px,
        py: b.py,
        pz: b.pz,
        tx: b.tx,
        ty: b.ty,
        frame: b.f,
        flying: b.k === -6 || b.k === 7 || b.k === 8 || b.k === 2 || b.k === -5 || b.k === -4,
        removed: false,
      }));
    }
    if (Array.isArray(snap.ex)) {
      this.explosions = snap.ex.map(([tx, ty, style, frame]) => ({ tx, ty, style, frame, removed: false }));
    }
    if (Array.isArray(snap.pk)) {
      const liveIds = new Set(snap.pk.map((p) => p[0]));
      for (const pk of this.pickups) {
        pk.removed = !liveIds.has(pk.id);
      }
      for (const [id, type, tx, ty] of snap.pk) {
        if (!this.pickups.find((p) => p.id === id)) {
          this.pickups.push({ id, type, tx, ty, x: tx * 30 + 15, y: ty * 30 + 15, raised: type !== 1, hideShadow: type === 1, removed: false });
        }
      }
    }
    if (Array.isArray(snap.fl)) {
      this.flags = snap.fl.map(([team, x, y, carrierId]) => {
        const base = this.flagBases.find((b) => b.team === team);
        return { team, x, y, carrierId, homeTx: base?.tx ?? 2, homeTy: base?.ty ?? 2 };
      });
    }
    this.updateCamera();
  }
}
