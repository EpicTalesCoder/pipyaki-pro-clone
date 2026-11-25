import test from 'node:test';
import assert from 'node:assert/strict';
import fs from 'node:fs';
import path from 'node:path';
import { fileURLToPath } from 'node:url';

import { parseMapBinary, parseMapsList, WEAPON_SHOP_ORDER, SKILL_COSTS } from '../pipyaki-loader.js';
import { parseStandardMidi } from '../pipyaki-audio.js';

const __dirname = path.dirname(fileURLToPath(import.meta.url));
const ASSETS_DIR = path.resolve(__dirname, '../assets');

test('parses maps/list DM, TM, and CTF arena buckets faithfully (qb.m)', () => {
  const txt = fs.readFileSync(path.join(ASSETS_DIR, 'maps/list'), 'utf8');
  const list = parseMapsList(txt);
  assert.deepEqual(list.sections.DM, ['dm_crossroad', 'dm_fall', 'dm_placidity', 'dm_target']);
  assert.deepEqual(list.sections.TM, ['tm_bouncing', 'tm_suicide']);
  assert.deepEqual(list.sections.CTF, ['ctf_headphones', 'ctf_microscheme', 'ctf_monster']);
  assert.equal(list.dm.length, 9);
  assert.equal(list.tm.length, 5);
  assert.equal(list.ctf.length, 3);
});

test('decodes all 25 campaign .map binaries and 9 arena .map binaries without error', () => {
  for (let i = 0; i < 25; i++) {
    const buf = fs.readFileSync(path.join(ASSETS_DIR, `maps/campaign/map${i}.map`));
    const parsed = parseMapBinary(buf);
    assert.ok(parsed.width >= 10 && parsed.width <= 120, `map${i} width out of range: ${parsed.width}`);
    assert.ok(parsed.height >= 10 && parsed.height <= 120, `map${i} height out of range: ${parsed.height}`);
    assert.equal(parsed.tiles.length, parsed.width);
    assert.equal(parsed.tiles[0].length, parsed.height);
  }

  const txt = fs.readFileSync(path.join(ASSETS_DIR, 'maps/list'), 'utf8');
  const list = parseMapsList(txt);
  for (const name of [...list.dm, ...list.tm, ...list.ctf]) {
    const buf = fs.readFileSync(path.join(ASSETS_DIR, `maps/${name}.map`));
    const parsed = parseMapBinary(buf);
    assert.ok(parsed.width >= 10 && parsed.height >= 10, `${name} invalid dimensions`);
  }
});

test('verifies font.cfg glyph count, Vietnamese lang strings, and MIDI SMF headers', () => {
  const fontTxt = fs.readFileSync(path.join(ASSETS_DIR, 'font/font.txt'), 'utf8').replace(/^\uFEFF/, '').replace(/[\r\n]+$/, '');
  const fontCfg = fs.readFileSync(path.join(ASSETS_DIR, 'font/font.cfg'));
  assert.equal(fontCfg.length, 94);
  assert.equal(fontTxt.length, 94);

  const lang = fs.readFileSync(path.join(ASSETS_DIR, 'lang.txt'), 'utf8').replace(/^\uFEFF/, '').split(';');
  assert.ok(lang[1].includes('Bắt đầu'), 'Expected Vietnamese label at lang[1]');
  assert.equal(WEAPON_SHOP_ORDER.length, 14);
  assert.equal(SKILL_COSTS.length, 11);

  for (const mid of ['midi/music_menu.mid', 'midi/music_game0.mid', 'midi/music_game1.mid']) {
    const bytes = fs.readFileSync(path.join(ASSETS_DIR, mid));
    const parsed = parseStandardMidi(bytes);
    assert.ok(parsed.events.length > 20, `${mid} should yield MIDI note events`);
    assert.ok(parsed.durationSec > 5, `${mid} duration should exceed 5s`);
  }
});
