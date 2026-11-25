/**
 * Port of n.java + qb.p/q/s/c/d — localStorage RMS Persistence & VI/EN UI Shell Translations.
 */

import { SKILL_COUNT, WEAPON_START_CAMPAIGN, ITEM_START_CAMPAIGN } from './pipyaki-loader.js';

const KEY_SETTINGS = 'pipyaki_pro_settings_v1';
const KEY_AUTOSAVE = 'pipyaki_pro_autosave_v1';
const KEY_BT_AUTOSAVE = 'pipyaki_pro_btautosave_v1';

export function defaultSettings() {
  return {
    musicOn: true,
    sfxOn: true,
    musicVol: 50,
    sfxVol: 70,
    vibra: true,
    blood: true,
    weather: true,
    tips: true,
    nickname: 'Pipyaka',
    bots: 3,
    botLevel: 1,
    mpMode: 0, // 0=DM, 1=TM, 2=CTF
    mapId: 0,
    teamColor: 0,
    friendlyFire: false,
    teamBalance: 1,
    lang: 'vi',
  };
}

export function defaultCampaignSave() {
  return {
    unlockedLevel: 0,
    curLevel: 0,
    score: 0,
    coins: 200,
    weapons: [...WEAPON_START_CAMPAIGN],
    knownWeapons: WEAPON_START_CAMPAIGN.map((v, i) => v > 0 || i === 0),
    skills: new Array(SKILL_COUNT).fill(0),
    items: ITEM_START_CAMPAIGN.map((v, i) => (i === 5 ? 3 : v)), // index 5 = 3 eggs
    knownItems: [true, true, false, false, false, true],
    primary: 0,
    secondary: 14, // Banana item
  };
}

export function defaultArenaSave() {
  const weapons = [20, 0, 5, 5, 0, 5, 0, 3, 0, 1, 2, 1, 0, 1];
  return {
    coins: 250,
    weapons,
    skills: new Array(SKILL_COUNT).fill(0),
    items: [2, 1, 0, 0, 0, 0],
    primary: 0,
    secondary: 14,
  };
}

export function loadSettings() {
  try {
    const raw = localStorage.getItem(KEY_SETTINGS);
    if (!raw) return defaultSettings();
    return { ...defaultSettings(), ...JSON.parse(raw) };
  } catch {
    return defaultSettings();
  }
}

export function saveSettings(s) {
  try {
    localStorage.setItem(KEY_SETTINGS, JSON.stringify(s));
  } catch {}
}

export function loadCampaignSave() {
  try {
    const raw = localStorage.getItem(KEY_AUTOSAVE);
    if (!raw) return defaultCampaignSave();
    const parsed = JSON.parse(raw);
    const def = defaultCampaignSave();
    return {
      ...def,
      ...parsed,
      weapons: parsed.weapons?.length === 14 ? parsed.weapons : def.weapons,
      knownWeapons: parsed.knownWeapons?.length === 14 ? parsed.knownWeapons : def.knownWeapons,
      skills: parsed.skills?.length === SKILL_COUNT ? parsed.skills : def.skills,
      items: parsed.items?.length === 6 ? parsed.items : def.items,
      knownItems: parsed.knownItems?.length === 6 ? parsed.knownItems : def.knownItems,
    };
  } catch {
    return defaultCampaignSave();
  }
}

export function saveCampaignSave(c) {
  try {
    localStorage.setItem(KEY_AUTOSAVE, JSON.stringify(c));
  } catch {}
}

export function resetCampaignSave() {
  const fresh = defaultCampaignSave();
  saveCampaignSave(fresh);
  return fresh;
}

export function loadArenaSave() {
  try {
    const raw = localStorage.getItem(KEY_BT_AUTOSAVE);
    if (!raw) return defaultArenaSave();
    return { ...defaultArenaSave(), ...JSON.parse(raw) };
  } catch {
    return defaultArenaSave();
  }
}

export function saveArenaSave(a) {
  try {
    localStorage.setItem(KEY_BT_AUTOSAVE, JSON.stringify(a));
  } catch {}
}

export const SHELL_STRINGS = {
  vi: {
    backPortal: '← Cổng Game',
    mpLobbyBtn: '⚔️ Phòng MP (2-4P)',
    soundOn: '🔊 Âm thanh',
    soundOff: '🔇 Tắt tiếng',
    fullscreen: '⛶ Toàn màn hình',
    controlsHint: 'Phím: Di chuyển (↑↓←→ / WASD) · Bắn chính (Enter / Space / 5) · Phụ (*) · Túi đồ (#) · Điểm (9) · Thoát (Q/E)',
  },
  en: {
    backPortal: '← Portal',
    mpLobbyBtn: '⚔️ MP Lobby (2-4P)',
    soundOn: '🔊 Sound On',
    soundOff: '🔇 Muted',
    fullscreen: '⛶ Fullscreen',
    controlsHint: 'Keys: Move (Arrows / WASD) · Fire Primary (Enter / Space / 5) · Secondary (*) · Inventory (#) · Board (9) · Softkeys (Q/E)',
  },
};
