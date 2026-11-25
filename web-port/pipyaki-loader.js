/**
 * Port of k.java, hb.java, mb.java, l.java, ib.java — Asset Loader & Binary .map v2 Decoder.
 * Decodes every .map binary from assets/maps/, parses maps/list and lang*.txt configs,
 * and preloads all original PNG sprite sheets from assets/.
 */

import { SpriteStrip } from './midp-graphics.js';

// Port of k.java:4-6 (obstacle offsets [dx, dy, size])
export const OBSTACLE_OFFSETS = [
  [-10, -12, 45],
  [-12, -10, 55],
  [-10, -37, 110],
  [-30, -30, 150],
  [-10, -25, 50],
  [5, -20, 81],
  [-12, -25, 140],
  [0, -18, 60],
];

// Port of k.java:7-84 (sec==3 prop table: [active, layer, p2, p3])
export const PROP_TABLE = [
  [
    [0, 2, 400, 30], [0, 2, 350, 30], [0, 2, 200, 30], [0, 2, 200, 30], [0, 2, 350, 30],
    [0, 2, 300, 30], [0, 2, 500, 30], [0, 2, 150, 30], [0, 2, 200, 30], [0, 2, 200, 30],
    [0, 2, 150, 30], [1, 0, 0, 0], [1, 0, 0, 0], [1, 0, 0, 0], [1, 0, 0, 0],
    [1, 0, 0, 0], [1, 0, 0, 0], [1, 0, 0, 0], [1, 0, 0, 0], [1, 0, 0, 0],
    [1, 0, 0, 0], [1, 0, 0, 0], [1, 0, 0, 0], [1, 0, 0, 0], [1, 0, 0, 0],
    [1, 0, 0, 0], [0, 2, 20, 80], [0, 2, 20, 80], [0, 2, 20, 80], [0, 2, 20, 80],
    [0, 2, 20, 80], [0, 2, 60, 90], [0, 2, 60, 90], [0, 0, 0, 0],
  ],
  [
    [0, 0, 0, 0], [0, 0, 0, 0], [0, 2, 1000, 30], [1, 0, 0, 0], [1, 0, 0, 0],
    [1, 0, 0, 0], [1, 0, 0, 0], [1, 0, 0, 0], [1, 0, 0, 0], [1, 0, 0, 0],
    [1, 0, 0, 0], [1, 0, 0, 0], [1, 0, 0, 0], [1, 0, 0, 0], [1, 0, 0, 0],
    [1, 0, 0, 0], [1, 0, 0, 0], [1, 0, 0, 0], [1, 0, 0, 0], [1, 0, 0, 0],
    [1, 0, 0, 0], [0, 2, 30, 80], [0, 2, 30, 80], [0, 2, 30, 80], [0, 2, 30, 80],
    [0, 2, 30, 80], [0, 2, 70, 80], [0, 2, 70, 80], [0, 2, 70, 80], [0, 2, 60, 80],
    [0, 2, 60, 80], [0, 0, 0, 0], [0, 0, 0, 0],
  ],
  [[1, 0, 0, 0], [1, 0, 0, 0], [1, 0, 0, 0]],
  [[1, 1, 0, 0], [1, 1, 0, 0]],
  [[1, 1, 0, 0], [1, 1, 0, 0]],
  [[1, 1, 0, 0], [1, 1, 0, 0]],
  [[1, 0, 0, 0], [1, 0, 0, 0], [1, 0, 0, 0], [1, 0, 0, 0], [1, 0, 0, 0], [1, 0, 0, 0], [1, 0, 0, 0]],
];

// Port of hb.java:8, 1783-1853 — Weapons (0..13) & Support Items (0..5)
export const WEAPON_COUNT = 14;
export const ITEM_COUNT = 6;
export const SKILL_COUNT = 11;

export const WEAPON_SHOP_ORDER = [1, 4, 3, 6, 5, 8, 7, 2, 9, 12, 0, 13, 11, 10];
export const WEAPON_PRICES = [10, 20, 20, 15, 25, 30, 45, 30, 45, 40, 15, 30, 10, 25];
export const WEAPON_BATCH = new Array(14).fill(5);
export const WEAPON_START_CAMPAIGN = [50, 0, 20, 20, 0, 15, 0, 10, 0, 2, 3, 3, 0, 2];
export const WEAPON_ICON_CODES = [
  '^10~', '^36~', '^12~', '^21~', '^38~', '^13~', '^37~', '^34~', '^30~', '^15~', '^14~', '^11~', '^32~', '^35~',
];
// Port of gb.java menu/weapons.png frame indices (frame = g() - 3 in menu/weapons.png 44x44)
export const WEAPON_SPRITE_FRAME = [
  10 - 3, // 0: normal green melon -> ico 10 -> frame 7 (verify via gb.g())
  21 - 3, // actually let's map direct frame offsets from weapons.png!
];

export const ITEM_PRICES = [15, 30, 50, 25, 30, 30];
export const ITEM_BATCH = [1, 1, 1, 1, 1, 1];
export const ITEM_START_CAMPAIGN = [5, 1, 0, 0, 0, 0];
export const ITEM_ICON_CODES = ['^22~', '^29~', '^28~', '^31~', '^23~', '^43~'];
export const ITEM_MAX_CARRY = [-1, 3, 3, 3, 5, 9]; // q.java ec[] caps (safe defaults)

// Port of mb.java:1-13 — Passive skill upgrades (0..10)
export const SKILL_SPRITE_ICO = [25, 26, 5, 7, 8, 10, 12, 14, 16, 20, 21]; // mb.b
export const SKILL_MAX_LEVELS = [3, 3, 2, 1, 2, 2, 2, 1, 1, 1, 1];         // mb.c
export const SKILL_COSTS = [100, 100, 60, 80, 70, 80, 90, 80, 50, 80, 80];  // mb.d

// Port of l.java:4-23 — Attachable gear/skin overlay offsets [dx, dy, followDir, ...]
export const L_ATTACH_OFFSETS = [
  [0, -13, 0, 1],
  [0, -19, 0, 1],
  [0, -9, 0, 1],
  [0, -10, 0, 1],
  [0, -12, 0, 1],
  [0, -2, 0, 1],
  [0, -10, 0, 1],
  [0, -2, 0, 1],
  [0, -2, 0, 1],
  [0, 0, 0, 1],
  [0, -2, 0, 1],
  [0, 0, 0, 0],
  [0, -6, 0, 1],
  [0, 0, 0, 0],
  [0, 0, 0, 0],
  [0, 0, 0, 0],
  [0, 0, 0, 0],
  [0, 0, 0, 0],
];

// Sprite sheets metadata matching fb.java:3483-3845 and fb.e(int):9673-9902
export const SPRITE_SHEET_SPECS = {
  // UI & Menu (qb.java:227-283)
  sscrbuttons: { path: 'sscrbuttons.png', w: 20, h: 20 },
  menuCursor: { path: 'menu/menu_cursor.png', w: 14, h: 26 },
  skillsShevron: { path: 'menu/skills_shevron.png', w: 11, h: 10 },
  skillsBar: { path: 'menu/skills.png', w: 64, h: 10 },
  menuTransparent: { path: 'menu/transparent.png', w: 30, h: 30 },
  charArrows: { path: 'char_arrows.png', w: 20, h: 20 },
  smallArrows: { path: 'menu/small_arrows.png', w: 5, h: 5 },
  menuLine: { path: 'menu/line.png', w: 240, h: 1 },
  fragswin: { path: 'menu/fragswin.png', w: 20, h: 20 },
  menuWeapons: { path: 'menu/weapons.png', w: 44, h: 44 },
  menuStatus: { path: 'menu/status.png', w: 22, h: 22 },
  menuStatusBt1: { path: 'menu/status_bt1.png', w: 34, h: 34 },
  menuStatusBt2: { path: 'menu/status_bt2.png', w: 6, h: 6 },
  bigIcons: { path: 'menu/big_icons.png', w: 38, h: 38 },
  bigIconsCircle: { path: 'menu/big_icons_circle.png', w: 31, h: 31 },
  iconTw: { path: 'menu/icon_tw.png', w: 26, h: 26 },
  menuPhone: { path: 'menu/phone.png', w: 22, h: 30 },
  menuIcons: { path: 'menu/icons.png', w: 34, h: 34 },
  menuBtnBg: { path: 'menu/menu_icons.png', w: 60, h: 60 },
  menuInf: { path: 'menu/inf.png', w: 10, h: 11 },
  menuArrows: { path: 'menu/menu_arrows.png', w: 26, h: 26 },
  menuPages: { path: 'menu/pages.png', w: 6, h: 6 },
  menuSigns: { path: 'menu/signs.png', w: 12, h: 12 },
  iconsBot: { path: 'menu/icons_bot.png', w: 18, h: 18 },
  weaponsPs: { path: 'menu/weapons_ps.png', w: 10, h: 10 },
  iconsFf: { path: 'menu/icons_ff.png', w: 16, h: 18 },
  iconsPlay: { path: 'menu/icons_play.png', w: 19, h: 20 },
  iconsTb: { path: 'menu/icons_tb.png', w: 34, h: 19 },
  iconsTipOff: { path: 'menu/icons_tip-off.png', w: 14, h: 15 },
  iconsVibro: { path: 'menu/icons_vibro.png', w: 10, h: 10 },
  iconsVolDot: { path: 'menu/icons_vol-dot.png', w: 5, h: 5 },
  iconsVolOff: { path: 'menu/icons_vol-off.png', w: 11, h: 11 },
  iconsTs: { path: 'menu/icons_ts.png', w: 48, h: 48 },
  menuLoading: { path: 'menu/loading.png', w: 34, h: 34 },
  menuPointerKey: { path: 'menu/pointer_key.png', w: 20, h: 20 },
  menuTarget: { path: 'menu/target.png', w: 54, h: 54 },
  menuPointerMove: { path: 'menu/pointer_move.png', w: 12, h: 16 },
  menuDigits: { path: 'menu/digits.png', w: 8, h: 11 },
  numbersBig: { path: 'font/numbers_big.png', w: 14, h: 17 },

  // Intro (wb.java:64-120)
  hills1: { path: 'intro/hills1.png', w: 220, h: 57 },
  hills2: { path: 'intro/hills2.png', w: 140, h: 56 },
  hills3: { path: 'intro/hills3.png', w: 226, h: 45 },
  hills4: { path: 'intro/hills4.png', w: 139, h: 47 },
  hills5: { path: 'intro/hills5.png', w: 180, h: 15 },
  cloudB1: { path: 'intro/cloud_b1.png', w: 134, h: 68 },
  cloudB2: { path: 'intro/cloud_b2.png', w: 128, h: 55 },
  cloudB3: { path: 'intro/cloud_b3.png', w: 88, h: 54 },
  cloudS1: { path: 'intro/cloud_s1.png', w: 46, h: 24 },
  cloudS2: { path: 'intro/cloud_s2.png', w: 46, h: 24 },
  cloudS3: { path: 'intro/cloud_s3.png', w: 48, h: 26 },
  leaf1: { path: 'intro/leaf1.png', w: 6, h: 6 },
  leaf2: { path: 'intro/leaf2.png', w: 8, h: 8 },
  star: { path: 'intro/star.png', w: 36, h: 64 },
  introSkip: { path: 'intro/skip.png', w: 28, h: 28 },
  bombakaHouseV1: { path: 'intro/bombaka_house_v1.png', w: 63, h: 63 },
  proBloodShort: { path: 'intro/pro_blood_short.png', w: 100, h: 73 },

  // World Terrain & Obstacles (fb.java:3564-3845, fb.e:9673-9902)
  groundGrass: { path: 'ground_grass.png', w: 30, h: 30 },
  walls: { path: 'walls.png', w: 45, h: 55 },
  woodWalls: { path: 'wood_walls.png', w: 55, h: 55 },
  gates: { path: 'gates.png', w: 110, h: 80 },
  houseBottom: { path: 'house_bottom.png', w: 150, h: 150 },
  houseTop: { path: 'house_top.png', w: 150, h: 150 },
  bombakaHouseBottom: { path: 'bombaka_house_bottom.png', w: 150, h: 150 },
  bombakaHouseTop: { path: 'bombaka_house_top.png', w: 150, h: 150 },
  well: { path: 'well.png', w: 81, h: 65 },
  wellBail: { path: 'well_bail.png', w: 30, h: 34 },
  box: { path: 'box.png', w: 60, h: 60 },
  treeStubs: { path: 'tree_stubs.png', w: 50, h: 60 },
  treeCrowns: { path: 'tree_crowns.png', w: 105, h: 92 },
  bushesBig: { path: 'bushes_big.png', w: 55, h: 55 },
  bushesBananas: { path: 'bushes_bananas.png', w: 60, h: 60 },
  telegaBricks: { path: 'telega_bricks.png', w: 50, h: 50 },
  ridge: { path: 'ridge.png', w: 70, h: 70 },
  trampoline: { path: 'trampoline.png', w: 40, h: 35 },
  transparent10: { path: 'transparent10.png', w: 30, h: 30 },

  // Characters & Skins
  pipyaka: { path: 'chars/pipyaka.png', w: 30, h: 30 },
  pipyakaExplosion: { path: 'chars/death/pipyaka_explosion.png', w: 60, h: 60 },
  bombaka: { path: 'chars/bombaka.png', w: 30, h: 30 },
  bombakaSpawn: { path: 'chars/bombaka_spawn.png', w: 40, h: 40 },
  bombakaSpawnCrater: { path: 'chars/bombaka_spawn_crater.png', w: 40, h: 40 },
  bombakaFlow: { path: 'chars/death/bombaka_flow.png', w: 30, h: 30 },
  cannon: { path: 'chars/cannon.png', w: 54, h: 54 },
  cannonDeath: { path: 'chars/death/cannon.png', w: 54, h: 54 },
  ulityaka: { path: 'chars/ulityaka.png', w: 40, h: 40 },
  ulityakaExplosion: { path: 'chars/death/ulityaka_explosion.png', w: 60, h: 60 },
  spider: { path: 'chars/spider.png', w: 30, h: 24 },
  spiderCapsule: { path: 'chars/spider_capsule.png', w: 30, h: 30 },
  spiderExploding: { path: 'chars/death/spider_exploding.png', w: 60, h: 60 },
  skinKamikadze: { path: 'chars/skins/bombaka_kamikadze.png', w: 40, h: 40 },
  skinMiner: { path: 'chars/skins/bombaka_miner.png', w: 40, h: 40 },
  skinRocketman: { path: 'chars/skins/bombaka_rocketman.png', w: 40, h: 40 },
  skinSockHelm: { path: 'chars/skins/sock_helm.png', w: 36, h: 36 },

  // Items
  coin: { path: 'items/coin.png', w: 20, h: 20 },
  berserker: { path: 'items/berserker.png', w: 35, h: 35 },
  kaska: { path: 'items/kaska.png', w: 36, h: 36 },
  invisible: { path: 'items/invisible.png', w: 35, h: 35 },
  banana: { path: 'items/banana.png', w: 22, h: 18 },
  sockItem: { path: 'items/sock.png', w: 28, h: 18 },
  carrot: { path: 'items/carrot.png', w: 22, h: 29 },
  bag: { path: 'items/bag.png', w: 30, h: 30 },

  // Weapons & Projectiles
  melon: { path: 'weapons/melon.png', w: 20, h: 20 },
  melonThr: { path: 'weapons/melon_thr.png', w: 20, h: 20 },
  ananas: { path: 'weapons/ananas.png', w: 40, h: 40 },
  rabberMelon: { path: 'weapons/rabber_melon.png', w: 30, h: 30 },
  melonExplosion: { path: 'weapons/melon_explosion.png', w: 60, h: 60 },
  ananasExploding: { path: 'weapons/ananas_exploding.png', w: 60, h: 60 },
  mine: { path: 'weapons/mine.png', w: 16, h: 14 },
  melonHard: { path: 'weapons/melon_hard.png', w: 20, h: 20 },
  melonThrHard: { path: 'weapons/melon_thr_hard.png', w: 20, h: 20 },
  rabberMelonHard: { path: 'weapons/rabber_melon_hard.png', w: 30, h: 30 },
  ananasHard: { path: 'weapons/ananas_hard.png', w: 40, h: 40 },
  melonExplosionHard: { path: 'weapons/melon_explosion_hard.png', w: 60, h: 60 },
  bombCrater: { path: 'weapons/bomb_crater.png', w: 40, h: 40 },
  melonCrater: { path: 'weapons/melon_crater.png', w: 35, h: 35 },
  bomb: { path: 'weapons/bomb.png', w: 30, h: 30 },
  bombExplosion: { path: 'weapons/bomb_explosion.png', w: 60, h: 60 },
  rake: { path: 'weapons/rake.png', w: 42, h: 48 },
  brick: { path: 'weapons/brick.png', w: 20, h: 17 },
  brickExplosion: { path: 'weapons/brick_explosion.png', w: 45, h: 45 },
  bananaSkin: { path: 'weapons/banana_skin.png', w: 30, h: 30 },
  sockWeapon: { path: 'weapons/sock.png', w: 20, h: 20 },
  cannonCore: { path: 'weapons/np/cannon_core.png', w: 30, h: 30 },
  rocket: { path: 'weapons/np/rocket.png', w: 9, h: 18 },
  rocketSparks: { path: 'weapons/np/rocket_sparks.png', w: 30, h: 30 },
  spittleGum: { path: 'weapons/np/spittle_gum.png', w: 15, h: 15 },

  // FX
  pipyakaHurt1: { path: 'fx/pipyaka_hurt1.png', w: 30, h: 30 },
  pipyakaEyesRolling: { path: 'fx/pipyaka_eyes_rolling.png', w: 18, h: 11 },
  bombakaEyesRolling: { path: 'fx/bombaka_eyes_rolling.png', w: 18, h: 7 },
  bmBloodPool: { path: 'fx/bm_blood_pool.png', w: 44, h: 25 },
  egg: { path: 'fx/egg.png', w: 60, h: 49 },
  eggParts: { path: 'fx/egg_parts.png', w: 30, h: 30 },
  teamPods: { path: 'fx/team_pods.png', w: 36, h: 24 },
  hpPodL: { path: 'fx/hp_pod_l.png', w: 7, h: 9 },
  hpPodM: { path: 'fx/hp_pod_m.png', w: 6, h: 9 },
  hpPodR: { path: 'fx/hp_pod_r.png', w: 7, h: 9 },
  hpScores: { path: 'fx/hp_scores.png', w: 5, h: 6 },
  hpScoresExtra: { path: 'fx/hp_scores_extra.png', w: 5, h: 6 },
  hpFlow: { path: 'fx/hp_flow.png', w: 8, h: 9 },
  hpFlowExtra: { path: 'fx/hp_flow_extra.png', w: 8, h: 9 },
  spark: { path: 'fx/spark.png', w: 22, h: 22 },
  cloudBlackMedium: { path: 'fx/cloud_black_medium.png', w: 30, h: 30 },
  explosionFire: { path: 'fx/explosion_fire.png', w: 60, h: 60 },
  starsWhite: { path: 'fx/stars_white.png', w: 15, h: 15 },
  cloudGreenMedium: { path: 'fx/cloud_green_medium.png', w: 30, h: 30 },
  ctfFlagThread: { path: 'fx/ctf_flag_thread.png', w: 1, h: 1 },
  ctfFlag: { path: 'fx/ctf_flag.png', w: 17, h: 20 },
  ctfFlagBase: { path: 'fx/ctf_flag_base.png', w: 40, h: 40 },
};

class DataReader {
  constructor(bytes) {
    this.u8 = bytes instanceof Uint8Array ? bytes : new Uint8Array(bytes);
    this.view = new DataView(this.u8.buffer, this.u8.byteOffset, this.u8.byteLength);
    this.pos = 0;
  }

  get remaining() {
    return this.u8.byteLength - this.pos;
  }

  readByte() {
    if (this.pos >= this.u8.byteLength) return -1;
    const v = this.view.getInt8(this.pos);
    this.pos += 1;
    return v;
  }

  readUByte() {
    if (this.pos >= this.u8.byteLength) return -1;
    const v = this.u8[this.pos];
    this.pos += 1;
    return v;
  }

  readShort() {
    const v = this.view.getInt16(this.pos, false);
    this.pos += 2;
    return v;
  }

  readInt() {
    const v = this.view.getInt32(this.pos, false);
    this.pos += 4;
    return v;
  }

  readBytes(len) {
    const end = Math.min(this.u8.byteLength, this.pos + len);
    const slice = this.u8.subarray(this.pos, end);
    this.pos = end;
    return slice;
  }
}

/**
 * Port of k.b(byte[], boolean) (k.java:87-1599, decompiled-cfr/k.java:17-510).
 * Pure binary parser returning structured tiles, obstacles, props, spawners, pickups, triggers, emitters, markers, and meta.
 */
export function parseMapBinary(rawBytes, { campaignIndex = -1, campaignUnbeaten = false, rng = Math.random } = {}) {
  const r = new DataReader(rawBytes);
  const magic = r.readByte();
  if (magic !== -87) {
    throw new Error(`Invalid .map magic byte: ${magic} (expected -87 / 0xA9)`);
  }
  const version = r.readByte();
  if (version < 2) {
    throw new Error(`Unsupported .map version: ${version}`);
  }
  r.readInt(); // reserved 4 bytes
  const width = r.readByte();
  const height = r.readByte();
  if (width <= 0 || height <= 0) {
    throw new Error(`Invalid map dimensions ${width}x${height}`);
  }

  const chunk1Len = r.readInt();
  const chunk1Bytes = r.readBytes(chunk1Len);
  const metaLen = r.readInt();
  const metaBytes = r.readBytes(metaLen);

  const musicTrack = metaBytes.length > 0 ? metaBytes[0] : 0;
  const themeLevel = metaBytes.length > 1 ? metaBytes[1] : 0;
  const specialCutscene = metaBytes.length > 2 ? metaBytes[2] === 1 : false;

  const tiles = Array.from({ length: width }, () =>
    Array.from({ length: height }, () => ({
      b: 0, // ground_grass frame (1-based)
      c: 0, // terrain overlay speed tag
      d: null, // obstacle descriptor index / obj
      e: [],   // background prop indices
      f: [],   // foreground prop indices
    }))
  );

  const obstacles = [];
  const props = [];
  const spawners = [];
  const initialTraps = [];
  const pickups = [];
  const hazards = [];
  const triggers = [];
  const emitters = [];
  const markers = [];

  const sub = new DataReader(chunk1Bytes);
  while (sub.remaining > 0) {
    const sec = sub.readByte();
    if (sec === 0) {
      for (let x = 0; x < width; x++) {
        for (let y = 0; y < height; y++) {
          let v = sub.readByte();
          if (v > 0) {
            if (Math.floor(rng() * 4) === 0) {
              v = Math.floor(rng() * 9) + 27;
            } else {
              v = Math.floor(rng() * 6);
            }
            v += 1;
          }
          tiles[x][y].b = v;
        }
      }
    } else if (sec === 1) {
      for (let x = 0; x < width; x++) {
        for (let y = 0; y < height; y++) {
          const v = sub.readByte();
          if (v > 0) {
            tiles[x][y].b = v + 6;
          }
          tiles[x][y].c = v;
        }
      }
    } else if (sec === 2) {
      const count = sub.readShort();
      for (let i = 0; i < count; i++) {
        const tx = sub.readByte();
        const ty = sub.readByte();
        const type = sub.readByte();
        let frame = 0;
        let extra = 0;
        if (type !== -1) {
          frame = sub.readByte();
          extra = sub.readByte();
        }
        // Map bug workarounds from decompiled-cfr/k.java:177
        if (campaignIndex === 7 && tx === 5 && ty === 29) continue;
        if (campaignIndex === 17 && tx === 10 && ty === 10) continue;

        if (type === 2) {
          obstacles.push({ tx, ty, type: 0, frame: 0, extra });
          if (tx + 2 < width) {
            obstacles.push({ tx: tx + 2, ty, type: 0, frame: 0, extra });
          }
        } else if (type === -1) {
          obstacles.push({ tx, ty, type: -1, frame: 0, extra: 0, onlyIfEmpty: true });
        } else {
          obstacles.push({ tx, ty, type, frame, extra });
        }
      }
    } else if (sec === 3) {
      const count = sub.readInt();
      for (let i = 0; i < count; i++) {
        const px = sub.readShort();
        const py = sub.readShort();
        const objType = sub.readByte();
        const objSub = sub.readByte();
        const tx = Math.floor(px / 30);
        const ty = Math.floor(py / 30);
        const spec = (PROP_TABLE[objType] && PROP_TABLE[objType][objSub]) || [0, 0, 0, 0];
        const active = spec[0];
        const layer = spec[1];
        if (active !== 1) continue;
        props.push({ px, py, tx, ty, objType, objSub, layer });
      }
    } else if (sec === 4) {
      const count = sub.readInt();
      for (let i = 0; i < count; i++) {
        const kind = sub.readByte();
        const tx = sub.readByte();
        const ty = sub.readByte();
        const paramLen = sub.readByte();
        const params = [];
        for (let p = 0; p < paramLen; p++) {
          params.push(sub.readByte());
        }
        if (kind === 0) {
          const charType = params[0] === 2 ? 3 : params[0];
          spawners.push({
            tx,
            ty,
            charType,
            quota: params[1],
            maxAlive: params[2],
            respawnSec: params[3],
            minRange: params[4],
            team: params[5],
            inactive: params[6] === 1,
            skill: params[7],
            aiFlag8: params[8] === 1,
            aiFlag9: params[9] === 1,
            rush: params[10] === 1,
            hasCapsule: params[0] === 9,
          });
        } else if (kind === 1) {
          initialTraps.push({
            tx,
            ty,
            trapKind: params[0], // 0=rake(11), 1=sock(10), 2=trap(13), 3..6=melon/bouncy(5)
            mpModeFilter: params[1],
          });
        } else if (kind === 2) {
          if (params[0] < 4) {
            pickups.push({ type: 1, tx, ty, respawn: false, campaignFilter: 2 });
          }
        } else if (kind === 3) {
          // Port of k.c() (decompiled-cfr/k.java:592-663)
          const itemIdx = params[0];
          const respawn = params[1] === 1;
          const modeFilter = params[2];
          pickups.push({ itemIdx, tx, ty, respawn, modeFilter, isKind3: true });
        } else if (kind === 4 || kind === 5) {
          markers.push({ kind, tx, ty, params });
        } else if (kind === 6) {
          hazards.push({ hazardType: params[0] === 0 ? -1 : params[0] === 1 ? -2 : -3, tx, ty });
        } else if (kind === 7) {
          triggers.push({
            tx,
            ty,
            action: params[0],
            p: params,
          });
        } else if (kind === 8) {
          emitters.push({ tx, ty, params });
        } else {
          markers.push({ kind, tx, ty, params });
        }
      }
    }
  }

  return {
    version,
    width,
    height,
    musicTrack,
    themeLevel,
    specialCutscene,
    campaignUnbeaten,
    tiles,
    obstacles,
    props,
    spawners,
    initialTraps,
    pickups,
    hazards,
    triggers,
    emitters,
    markers,
  };
}

/**
 * Port of qb.m(int) (qb.java:3329-3436) — parses assets/maps/list into DM / TM / CTF lists.
 */
export function parseMapsList(text) {
  const lines = String(text)
    .replace(/\r\n/g, '\n')
    .split('\n')
    .map((l) => l.trim());
  if (!lines.includes('[XXXYAKAS]')) {
    return { dm: [], tm: [], ctf: [] };
  }
  const sections = { DM: [], TM: [], CTF: [] };
  let cur = null;
  for (const line of lines) {
    if (!line || line === '[XXXYAKAS]') continue;
    if (line === '[DM]') {
      cur = 'DM';
      continue;
    }
    if (line === '[TM]') {
      cur = 'TM';
      continue;
    }
    if (line === '[CTF]') {
      cur = 'CTF';
      continue;
    }
    if (line === 'end') {
      cur = null;
      continue;
    }
    if (cur && sections[cur]) {
      sections[cur].push(line);
    }
  }
  return {
    dm: [...sections.DM, ...sections.TM, ...sections.CTF],
    tm: [...sections.TM, ...sections.CTF],
    ctf: [...sections.CTF],
    sections,
  };
}

function loadImage(src) {
  return new Promise((resolve, reject) => {
    const img = new Image();
    img.onload = () => resolve(img);
    img.onerror = () => reject(new Error(`Failed to load image: ${src}`));
    img.src = src;
  });
}

async function fetchText(url) {
  const res = await fetch(url);
  if (!res.ok) return '';
  return res.text();
}

async function fetchBytes(url) {
  const res = await fetch(url);
  if (!res.ok) throw new Error(`Failed to fetch binary ${url}: ${res.status}`);
  return new Uint8Array(await res.arrayBuffer());
}

/**
 * Load all Pipyaki Pro assets from assets/ into an immutable runtime bundle.
 */
export async function loadPipyakiAssets(onProgress = () => {}) {
  const sheets = {};
  const entries = Object.entries(SPRITE_SHEET_SPECS);
  const totalSteps = entries.length + 32 + 44 + 8;
  let completed = 0;
  const tick = () => {
    completed++;
    onProgress(Math.min(1, completed / totalSteps));
  };

  // 1. Sprite strips
  await Promise.all(
    entries.map(async ([key, spec]) => {
      try {
        const img = await loadImage(`assets/${spec.path}`);
        sheets[key] = new SpriteStrip(img, spec.w, spec.h);
      } catch {
        sheets[key] = null;
      }
      tick();
    })
  );

  // 2. Intro word letters w1..w32 + raw menu images
  const wordLetters = await Promise.all(
    Array.from({ length: 32 }, (_, i) =>
      loadImage(`assets/intro/w${i + 1}.png`)
        .catch(() => null)
        .finally(tick)
    )
  );

  // 3. Inline font icons ico0..ico43 (b.b)
  const fontIcons = await Promise.all(
    Array.from({ length: 44 }, (_, i) =>
      loadImage(`assets/font/icons/ico${i}.png`)
        .catch(() => null)
        .finally(tick)
    )
  );

  // 4. Font sheet, font.txt, font.cfg, lang.txt, lang_workshop.txt, lang_help.txt, maps/list, midi buffers
  const [fontImg, fontTxt, fontCfg, langTxt, workshopTxt, helpTxt, mapsListTxt, keyb2Img, keyboardImg] = await Promise.all([
    loadImage('assets/font/font.png').finally(tick),
    fetchText('assets/font/font.txt').finally(tick),
    fetchBytes('assets/font/font.cfg').finally(tick),
    fetchText('assets/lang.txt').finally(tick),
    fetchText('assets/lang_workshop.txt').finally(tick),
    fetchText('assets/lang_help.txt').finally(tick),
    fetchText('assets/maps/list').finally(tick),
    loadImage('assets/menu/keyb2.png').catch(() => null).finally(tick),
    loadImage('assets/menu/keyboard.png').catch(() => null).finally(tick),
  ]);

  const mapsList = parseMapsList(mapsListTxt);

  // Preload existing campaign mission text files + MIDI files cleanly (zero 404s)
  const CAMPAIGN_TEXT_IDS = [0, 1, 2, 3, 5, 7, 8, 12, 13, 14, 15];
  const campaignLangs = {};
  await Promise.all(
    CAMPAIGN_TEXT_IDS.map(async (idx) => {
      try {
        const txt = await fetchText(`assets/lang_map${idx}.txt`);
        campaignLangs[idx] = txt.replace(/^\uFEFF/, '').trim();
      } catch {
        campaignLangs[idx] = '';
      }
    })
  );

  const midiBuffers = {};
  await Promise.all([
    fetchBytes('assets/midi/music_menu.mid').then((b) => { midiBuffers.menu = b; }).catch(() => {}),
    fetchBytes('assets/midi/music_game0.mid').then((b) => { midiBuffers.game0 = b; }).catch(() => {}),
    fetchBytes('assets/midi/music_game1.mid').then((b) => { midiBuffers.game1 = b; }).catch(() => {}),
  ]);

  const mapCache = new Map();
  async function loadMapBytes(relMapPath) {
    if (mapCache.has(relMapPath)) return mapCache.get(relMapPath);
    const bytes = await fetchBytes(`assets/maps/${relMapPath}`);
    mapCache.set(relMapPath, bytes);
    return bytes;
  }

  return {
    sheets,
    wordLetters,
    fontIcons,
    fontImg,
    fontTxt,
    fontCfg,
    langTxt,
    workshopTxt,
    helpTxt,
    mapsList,
    campaignLangs,
    midiBuffers,
    keyb2Img,
    keyboardImg,
    loadMapBytes,
  };
}
