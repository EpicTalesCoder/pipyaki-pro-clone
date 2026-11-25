import test from 'node:test';
import assert from 'node:assert/strict';
import fs from 'node:fs';
import path from 'node:path';
import { fileURLToPath } from 'node:url';

import { parseMapBinary } from '../pipyaki-loader.js';
import { calcMaxHp, calcWeaponDamage, getWeaponRadius, PipyakiWorld } from '../pipyaki-sim.js';

const __dirname = path.dirname(fileURLToPath(import.meta.url));
const ASSETS_DIR = path.resolve(__dirname, '../assets');

test('verifies J2ME HP, weapon damage, and blast radius formulas (q.java)', () => {
  assert.equal(calcMaxHp(0, 0, 0, true, true), 90);
  assert.equal(calcMaxHp(0, 3, 0, true, true), 180);
  assert.equal(calcMaxHp(2, 0, 0, false, true), 300);

  const hero = { team: 0, skills: [0, 0, 2, 1, 0, 0, 1, 0, 0, 0, 0] };
  assert.equal(calcWeaponDamage(hero, 0, true, true, 0), 90 + 25 * 2);
  assert.equal(calcWeaponDamage(hero, 1, true, true, 0), 120 + 30 * 2);
  assert.equal(calcWeaponDamage(hero, 7, true, true, 0), 90 + 25 * 1);
  assert.equal(getWeaponRadius(0), 2);
  assert.equal(getWeaponRadius(7), 3);
  assert.equal(getWeaponRadius(2), 1);
});

test('steps campaign map0 simulation cleanly and fires weapons', () => {
  const bytes = fs.readFileSync(path.join(ASSETS_DIR, 'maps/campaign/map0.map'));
  const parsed = parseMapBinary(bytes);
  const world = new PipyakiWorld(parsed, { isCampaign: true, weatherEnabled: false });

  assert.ok(world.player, 'Campaign hero must spawn');
  const startPx = world.player.px;
  const startMelons = world.player.weapons[0];

  world.step({ moveDir: 3, firePrimary: true, fireSecondary: false, dashDir: -1 });
  assert.ok(world.bombs.length >= 1, 'Firing primary should spawn bomb/melon');
  assert.equal(world.player.weapons[0], startMelons - 1);

  for (let i = 0; i < 15; i++) {
    world.step({ moveDir: 3, firePrimary: false, fireSecondary: false, dashDir: -1 });
  }
  assert.notEqual(world.player.px, startPx, 'Player should move when holding direction');
});

test('synchronizes arena Host -> Guest snapshot cleanly across CTF/DM worlds', () => {
  const bytes = fs.readFileSync(path.join(ASSETS_DIR, 'maps/ctf_headphones.map'));
  const parsed = parseMapBinary(bytes);
  const roster = [
    { id: 1, name: 'HostPlayer', team: 0, isLocal: true },
    { id: 2, name: 'GuestPlayer', team: 1, isLocal: false },
  ];

  const hostWorld = new PipyakiWorld(parsed, {
    isCampaign: false,
    mode: 2,
    botCount: 2,
    humanRoster: roster,
  });

  const guestWorld = new PipyakiWorld(parsed, {
    isCampaign: false,
    mode: 2,
    botCount: 2,
    humanRoster: roster.map((r) => ({ ...r, isLocal: r.id === 2 })),
  });

  assert.equal(hostWorld.flags.length, 2, 'CTF should spawn 2 team flags');
  const remoteMap = new Map([[2, { moveDir: 0, firePrimary: true, fireSecondary: false, dashDir: -1 }]]);
  for (let t = 0; t < 10; t++) {
    hostWorld.step({ moveDir: 3, firePrimary: t === 0, fireSecondary: false, dashDir: -1 }, remoteMap);
  }

  const snap = hostWorld.exportNetSnapshot();
  guestWorld.applyNetSnapshot(snap, 2);

  assert.equal(guestWorld.tickCount, hostWorld.tickCount);
  assert.equal(guestWorld.player?.id, 2, 'Guest perspective must bind to localPlayerId=2');
  const gHostActor = guestWorld.actors.find((a) => a.id === 1);
  const hHostActor = hostWorld.actors.find((a) => a.id === 1);
  assert.equal(gHostActor.px, hHostActor.px);
  assert.equal(gHostActor.py, hHostActor.py);
  assert.equal(guestWorld.bombs.length, hostWorld.bombs.length);
});
