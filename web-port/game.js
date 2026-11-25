/**
 * Port of ab.java, wb.java, qb.java, gb.java, fb.java, tb.java
 * Main Entry & Complete 1:1 Web Port Orchestrator for Pipyaki Pro (240x320, 25 Hz / 40ms).
 */

import { MidpGraphics } from './midp-graphics.js';
import { PipyakiFontRenderer } from './font-original.js';
import {
  ITEM_PRICES,
  SKILL_COSTS,
  SKILL_MAX_LEVELS,
  WEAPON_BATCH,
  WEAPON_PRICES,
  WEAPON_SHOP_ORDER,
  loadPipyakiAssets,
  parseMapBinary,
} from './pipyaki-loader.js';
import { PipyakiAudio } from './pipyaki-audio.js';
import {
  loadArenaSave,
  loadCampaignSave,
  loadSettings,
  resetCampaignSave,
  saveArenaSave,
  saveCampaignSave,
  saveSettings,
  SHELL_STRINGS,
} from './storage-i18n.js';
import { PipyakiWorld } from './pipyaki-sim.js';
import { renderIntro, renderMenu, renderModalBox, renderWorld, VIEW_H, VIEW_W } from './render-original.js';
import { mountPhaserRuntime } from './phaser-engine.js';
import { MultiplayerClient, bindMultiplayerLobby } from './multiplayer.js';

const TOTAL_CAMPAIGN_LEVELS = 25;

// Port of wb.java:155-370 — Intro splash element positions
function createIntroState() {
  // w1..w14: DaSuppaStudios (~112px wide), w15..w22: presents (~60px wide), w23..w32: Pipyaki PRO
  const letters = [];
  let lx = 63;
  const w1Widths = [11, 8, 10, 8, 8, 9, 8, 10, 7, 9, 8, 2, 8, 7];
  for (let i = 0; i < 14; i++) {
    letters.push({ x: lx, y: -3000 - i * 420, targetY: 2400, vy: 0, visible: true, landed: false });
    lx += w1Widths[i] || 8;
  }
  lx = 89;
  const w2Widths = [9, 6, 8, 7, 8, 8, 6, 7];
  for (let i = 0; i < 8; i++) {
    letters.push({ x: lx, y: -3800 - i * 380, targetY: 4000, vy: 0, visible: true, landed: false });
    lx += w2Widths[i] || 7;
  }
  // Big PIPYAKI title letters w23..w31 + w32 emblem (packed to PNG widths)
  const bigX = [42, 92, 106, 110, 121, 131, 141, 151, 161, 174];
  const bigY = [6800, 7900, 8200, 8200, 8400, 8200, 8400, 8400, 8400, 6800];
  for (let i = 0; i < 10; i++) {
    letters.push({
      x: bigX[i],
      y: -3200 - i * 520,
      targetY: bigY[i],
      vy: 0,
      visible: true,
      landed: false,
    });
  }

  return {
    phase: 1,
    tick: 0,
    w: 0,
    x: 0,
    y: 213,
    Q: 40,
    U: 0,
    S: 245,
    T: 174,
    bloodFrame: 0,
    leaving: false,
    soundAnswered: false,
    items: [
      { type: 2, x: 18, y: 18, variant: 0, parallax: 0.35 },
      { type: 2, x: 155, y: 34, variant: 1, parallax: 0.45 },
      { type: 1, x: 64, y: 58, variant: 0, parallax: 0.55 },
      { type: 1, x: 210, y: 42, variant: 2, parallax: 0.6 },
      { type: 0, x: -20, y: 213, variant: 0, parallax: 0.35 },
      { type: 0, x: 110, y: 213, variant: 1, parallax: 0.55 },
      { type: 0, x: 24, y: 213, variant: 2, parallax: 0.78 },
      { type: 0, x: 145, y: 213, variant: 3, parallax: 1.0 },
      { type: 3, x: 40, y: 40, variant: 0, parallax: 0.85, animTick: 0 },
      { type: 3, x: 175, y: 15, variant: 1, parallax: 1.05, animTick: 4 },
      { type: 4, x: 148, y: 118, variant: 0, parallax: 0.1, animTick: 0 },
    ],
    letters,
  };
}

// Entrypoint bootstrap
async function main() {
  const canvas = document.getElementById('game');
  const ctx = canvas.getContext('2d');
  ctx.imageSmoothingEnabled = false;

  const font = new PipyakiFontRenderer();
  const audio = new PipyakiAudio();

  let settings = loadSettings();
  let campaignSave = loadCampaignSave();
  let arenaSave = loadArenaSave();
  let assets = null;
  let loadProgress = 0;
  let loaded = false;

  const state = {
    phase: 'loading', // 'loading' | 'intro' | 'menu' | 'world'
    tick: 0,
    intro: createIntroState(),
    menu: {
      mode: 'main', // 'main' | 'workshop' | 'credits' | 'quick_select'
      screenId: 'root', // 'root' | 'play' | 'multiplayer' | 'settings' | 'pause'
      camX: 0,
      camY: 0,
      targetCamX: 0,
      targetCamY: 0,
      selectedId: 'play',
      nodes: [],
      canGoBack: false,
      shopCoins: 0,
      shopContext: 'menu', // 'menu' | 'between_levels'
      coinDeltaTimer: 0,
      lastCoinSpent: 0,
      creditsY: VIEW_H - 30,
      creditsHeight: 240,
      quickPage: 0,
      quickSelected: 0,
      quickCurPos: { x: 54, y: 98 },
      modal: null,
    },
    world: null,
    progress: campaignSave,
  };

  // Input state
  const heldKeys = new Set();
  const queuedCmds = [];
  const lastTapTime = new Map();
  let pendingDashDir = -1;
  const remoteInputs = new Map();
  let isMpGuest = false;

  // Bind toolbar buttons
  const btnSound = document.getElementById('btn-sound');
  const btnLang = document.getElementById('btn-lang');
  const btnFullscreen = document.getElementById('btn-fullscreen');
  const btnMpLobby = document.getElementById('btn-mp-lobby');
  const linkPortal = document.getElementById('link-portal');

  function syncToolbarText() {
    const lang = settings.lang === 'en' ? 'en' : 'vi';
    const str = SHELL_STRINGS[lang];
    const soundActive = settings.musicOn || settings.sfxOn;
    if (btnSound) btnSound.textContent = soundActive ? str.soundOn : str.soundOff;
    if (btnLang) btnLang.textContent = lang === 'en' ? '🌐 EN' : '🌐 VI';
    if (btnFullscreen) btnFullscreen.textContent = str.fullscreen;
    if (btnMpLobby) btnMpLobby.textContent = str.mpLobbyBtn;
    if (linkPortal) linkPortal.textContent = str.backPortal;
  }

  function applyAudioSettings() {
    audio.musicEnabled = Boolean(settings.musicOn);
    audio.sfxEnabled = Boolean(settings.sfxOn);
    audio.musicVolume = Math.max(0, Math.min(1, (settings.musicVol ?? 50) / 100));
    audio.sfxVolume = Math.max(0, Math.min(1, (settings.sfxVol ?? 70) / 100));
    if (!audio.musicEnabled || audio.musicVolume <= 0) {
      const savedTrack = audio.activeTrack;
      audio.stopMidi();
      audio.activeTrack = savedTrack;
    } else if (audio.activeTrack) {
      const t = audio.activeTrack;
      audio.activeTrack = null;
      audio.playMidi(t);
    }
    syncToolbarText();
  }

  // Multiplayer integration (2-4 players)
  let mpUi = null;
  const mpClient = new MultiplayerClient({
    onLobbyChange(lobbyState) {
      mpUi?.refresh(lobbyState);
    },
    onRemoteInput(actorId, input) {
      remoteInputs.set(actorId, input);
    },
    onMatchStart(matchConfig) {
      mpUi?.closeLobby();
      startMultiplayerMatch(matchConfig);
    },
    onSnapshot(snap) {
      if (isMpGuest && state.world) {
        state.world.applyNetSnapshot(snap, mpClient.getLocalActorId());
      }
    },
  });

  // Expose debug helper cleanly
  if (typeof window !== 'undefined') {
    window.__PIPYAKI__ = { state, mpClient, getWorld: () => state.world, getAssets: () => assets };
  }

  function playTrackForPhase(track) {
    audio.playMidi(track);
  }

  function clearInputQueues() {
    heldKeys.clear();
    queuedCmds.length = 0;
    pendingDashDir = -1;
  }

  // Menu Node Construction (Port of qb.java:100-550 & gb.java:1-977)
  function getMapsFlat() {
    if (!assets?.mapsList) return ['dm_crossroad'];
    const m = settings.mpMode || 0;
    return m === 1 ? assets.mapsList.tm : m === 2 ? assets.mapsList.ctf : assets.mapsList.dm;
  }

  function openMenuScreen(screenId, defaultSel = null) {
    clearInputQueues();
    state.phase = 'menu';
    state.menu.mode = screenId === 'workshop' ? 'workshop' : screenId === 'credits' ? 'credits' : screenId === 'quick_select' ? 'quick_select' : 'main';
    state.menu.screenId = screenId;
    state.menu.modal = null;

    if (screenId === 'credits') {
      state.menu.creditsY = VIEW_H - 30;
      state.menu.nodes = [];
      state.menu.canGoBack = true;
      return;
    }

    if (screenId === 'quick_select') {
      state.menu.canGoBack = true;
      updateQuickCursorTarget();
      return;
    }

    const nodes = [];
    if (screenId === 'root') {
      // Port of qb.java main menu cross
      nodes.push(
        { id: 'play', fx: 0, fy: 0, visible: true, iconFrame: 0, label: font.tMain(1) || 'Bắt đầu chơi', hint: font.tMain(1) || 'Chiến dịch 25 màn' },
        { id: 'multiplayer', fx: 104, fy: 0, visible: true, iconFrame: 11, label: font.tMain(3) || 'Nhiều người chơi', hint: 'Online 2-4P & Đấu Bot' },
        { id: 'settings', fx: 0, fy: 86, visible: true, iconFrame: 16, label: font.tMain(9) || 'Cài đặt', hint: font.tMain(9) || 'Âm thanh & Đồ họa' },
        { id: 'help', fx: -94, fy: 0, visible: true, iconFrame: 21, label: font.tMain(35) || 'Trợ giúp', hint: font.tMain(35) || 'Hướng dẫn chơi' },
        { id: 'credits', fx: 0, fy: -86, visible: true, iconFrame: 23, label: font.tMain(15) || 'Giới thiệu', hint: font.tMain(15) || 'Tác giả' }
      );
      state.menu.canGoBack = false;
      state.menu.selectedId = defaultSel || 'play';
    } else if (screenId === 'play') {
      const canContinue = campaignSave.curLevel > 0 || campaignSave.unlockedLevel > 0 || campaignSave.score > 0;
      nodes.push(
        { id: 'newgame', fx: 0, fy: 0, visible: true, iconFrame: 27, label: font.tMain(4) || 'Bắt đầu!', hint: canContinue ? `Chơi lại từ màn 1` : 'Chiến dịch 25 màn' },
        { id: 'continue', fx: 0, fy: -82, visible: true, iconFrame: 25, label: font.tMain(31) || 'Tiếp tục', hint: canContinue ? `Màn ${campaignSave.curLevel + 1}/${TOTAL_CAMPAIGN_LEVELS}` : 'Chưa có lưu', disabled: !canContinue },
        { id: 'shop', fx: 84, fy: 0, visible: true, iconFrame: 1, label: font.tSub(39) || 'Cửa hàng', hint: `${campaignSave.coins} xu` },
        { id: 'back_root', fx: -84, fy: 0, visible: true, iconFrame: 24, label: font.tMain(16) || 'Thoát', hint: 'Quay lại menu chính' }
      );
      state.menu.canGoBack = true;
      state.menu.selectedId = defaultSel || (canContinue ? 'continue' : 'newgame');
    } else if (screenId === 'multiplayer') {
      const modes = [font.tSub(0) || 'Deathmatch', font.tSub(1) || 'Nhóm', 'CTF Cướp cờ'];
      const diffs = [font.tSub(8) || 'Thấp', font.tSub(9) || 'Trung bình', font.tSub(10) || 'Cao'];
      const flat = getMapsFlat();
      const mapName = flat[settings.mapId % flat.length] || 'dm_crossroad';
      nodes.push(
        { id: 'mp_online', fx: 0, fy: 0, visible: true, iconFrame: 11, label: 'Online 2-4P', hint: 'Tạo hoặc vào phòng PKxxxx' },
        { id: 'skirmish_start', fx: 0, fy: -84, visible: true, iconFrame: 0, label: 'Đấu với Bot!', hint: `${modes[settings.mpMode]} · ${mapName}` },
        { id: 'mp_mode', fx: 86, fy: 0, visible: true, iconFrame: 12, cyclable: true, label: modes[settings.mpMode], hint: 'Trái/Phải đổi chế độ' },
        { id: 'mp_map', fx: 86, fy: 86, visible: true, iconFrame: 25, cyclable: true, label: mapName.replace(/^(dm|tm|ctf)_/, ''), hint: `Bản đồ: ${mapName}` },
        { id: 'mp_bots', fx: 0, fy: 86, visible: true, iconFrame: 13, cyclable: true, badge: 'bots_num', value: settings.bots, label: font.tMain(57) || 'Bots', hint: `${settings.bots} Bot AI` },
        { id: 'mp_diff', fx: -86, fy: 86, visible: true, iconFrame: 16, cyclable: true, badge: 'bot_diff', value: settings.botLevel, label: diffs[settings.botLevel], hint: 'Độ khó AI' },
        { id: 'back_root', fx: -86, fy: 0, visible: true, iconFrame: 24, label: font.tMain(16) || 'Thoát', hint: 'Quay lại menu chính' }
      );
      state.menu.canGoBack = true;
      state.menu.selectedId = defaultSel || 'mp_online';
    } else if (screenId === 'settings') {
      const volStep = settings.sfxOn ? Math.max(1, Math.round((settings.sfxVol ?? 70) / 14)) : 0;
      nodes.push(
        { id: 'set_sound', fx: 0, fy: 0, visible: true, iconFrame: 17, cyclable: true, badge: 'vol', value: volStep, label: font.tMain(10) || 'Âm thanh', hint: `${settings.sfxOn ? 'Bật' : 'Tắt'} (${settings.sfxVol}%)` },
        { id: 'set_music', fx: 84, fy: 0, visible: true, iconFrame: 17, cyclable: true, label: settings.musicOn ? 'Nhạc: Bật' : 'Nhạc: Tắt', hint: 'Nhạc nền MIDI gốc' },
        { id: 'set_weather', fx: 0, fy: 84, visible: true, iconFrame: 37, label: `${font.tMain(43) || 'Thời tiết'}: ${settings.weather ? 'Bật' : 'Tắt'}`, hint: 'Hiệu ứng sấm chớp & thời tiết' },
        { id: 'set_blood', fx: -84, fy: 84, visible: true, iconFrame: 18, label: `${font.tMain(47) || 'Krovischa'}: ${settings.blood ? 'Bật' : 'Tắt'}`, hint: 'Vết máu & hiệu ứng chiến đấu' },
        { id: 'set_tips', fx: 84, fy: 84, visible: true, iconFrame: 37, badge: 'tips_off', value: settings.tips, label: `Mẹo: ${settings.tips ? 'Bật' : 'Tắt'}`, hint: 'Gợi ý chiến thuật trong màn' },
        { id: 'set_reset', fx: 0, fy: -84, visible: true, iconFrame: 24, label: font.tMain(25) || 'Xóa cài đặt', hint: 'Đưa tiến độ & cài đặt về mặc định' },
        { id: 'back_root', fx: -84, fy: 0, visible: true, iconFrame: 24, label: font.tMain(16) || 'Thoát', hint: 'Lưu & quay lại' }
      );
      state.menu.canGoBack = true;
      state.menu.selectedId = defaultSel || 'set_sound';
    } else if (screenId === 'pause') {
      nodes.push(
        { id: 'pause_resume', fx: 0, fy: 0, visible: true, iconFrame: 0, label: font.tMain(31) || 'Tiếp tục', hint: 'Quay lại trận đấu' },
        { id: 'pause_sound', fx: 88, fy: 0, visible: true, iconFrame: 17, label: font.tMain(10) || 'Âm thanh', hint: settings.musicOn || settings.sfxOn ? 'Âm thanh: Bật' : 'Âm thanh: Tắt' },
        { id: 'pause_help', fx: 0, fy: 86, visible: true, iconFrame: 21, label: font.tMain(35) || 'Trợ giúp', hint: 'Xem hướng dẫn & phím bấm' },
        { id: 'pause_quit', fx: -88, fy: 0, visible: true, iconFrame: 24, label: font.tMain(32) || 'Thoát', hint: font.tSub(24) || 'Thoát về menu?' }
      );
      state.menu.canGoBack = true;
      state.menu.selectedId = defaultSel || 'pause_resume';
    } else if (screenId === 'workshop') {
      buildWorkshopNodes(nodes, defaultSel);
      state.menu.canGoBack = true;
    }

    state.menu.nodes = nodes;
    snapMenuCameraToSelected();
  }

  function buildWorkshopNodes(nodes, defaultSel) {
    state.menu.shopCoins = campaignSave.coins;
    state.progress = campaignSave;

    // Left start button
    const nextLbl = state.menu.shopContext === 'between_levels'
      ? `Màn ${campaignSave.curLevel + 1}!`
      : (font.tMain(16) || 'Thoát');
    nodes.push({
      id: 'shop_go',
      fx: -84,
      fy: 0,
      visible: true,
      iconFrame: state.menu.shopContext === 'between_levels' ? 0 : 24,
      label: nextLbl,
      title: state.menu.shopContext === 'between_levels' ? `Vào màn ${campaignSave.curLevel + 1}` : 'Quay lại Menu',
    });

    // Row 0 (y = 0): 14 weapons ordered by WEAPON_SHOP_ORDER
    for (let idx = 0; idx < WEAPON_SHOP_ORDER.length; idx++) {
      const wId = WEAPON_SHOP_ORDER[idx];
      const count = campaignSave.weapons[wId] ?? 0;
      const known = campaignSave.knownWeapons[wId] || count !== 0;
      const title = (font.workshopStrings[wId + 1] || '').split('\n')[0].trim();
      nodes.push({
        id: `w_${wId}`,
        fx: idx * 78,
        fy: 0,
        visible: true,
        kind: 'weapon',
        itemId: wId,
        count,
        known,
        label: '',
        title: title || `Vũ khí #${wId}`,
      });
    }

    // Row 1 (y = 84): 6 support items (id 14..19)
    for (let i = 0; i < ITEM_PRICES.length; i++) {
      const count = campaignSave.items[i] ?? 0;
      const known = campaignSave.knownItems[i] || count > 0;
      const title = (font.workshopStrings[15 + i] || '').split('\n')[0].trim();
      nodes.push({
        id: `it_${i}`,
        fx: i * 78,
        fy: 84,
        visible: true,
        kind: 'item',
        itemId: 14 + i,
        count,
        known,
        label: '',
        title: title || `Trang bị #${i}`,
      });
    }

    // Row 2 (y = 168): 11 skills
    for (let s = 0; s < SKILL_COSTS.length; s++) {
      const lvl = campaignSave.skills[s] ?? 0;
      const title = (font.workshopStrings[21 + s] || '').split('\n')[0].trim();
      nodes.push({
        id: `sk_${s}`,
        fx: s * 78,
        fy: 168,
        visible: true,
        kind: 'skill',
        itemId: s,
        level: lvl,
        label: '',
        title: title || `Kỹ năng #${s}`,
      });
    }

    state.menu.selectedId = defaultSel || `w_${WEAPON_SHOP_ORDER[0]}`;
  }

  function snapMenuCameraToSelected() {
    const sel = state.menu.nodes.find((n) => n.id === state.menu.selectedId);
    if (!sel) return;
    state.menu.targetCamX = Math.round(VIEW_W / 2 - sel.fx);
    state.menu.targetCamY = Math.round((VIEW_H - 28) / 2 - sel.fy);
    state.menu.camX = state.menu.targetCamX;
    state.menu.camY = state.menu.targetCamY;
  }

  function moveMenuSelection(dx, dy) {
    const nodes = state.menu.nodes.filter((n) => n.visible);
    const cur = nodes.find((n) => n.id === state.menu.selectedId);
    if (!cur) {
      if (nodes[0]) state.menu.selectedId = nodes[0].id;
      return;
    }
    let best = null;
    let bestScore = Infinity;
    for (const n of nodes) {
      if (n === cur) continue;
      const rx = n.fx - cur.fx;
      const ry = n.fy - cur.fy;
      const proj = rx * dx + ry * dy;
      if (proj <= 10) continue;
      const perp = Math.abs(rx * dy - ry * dx);
      const score = proj + perp * 2.2;
      if (score < bestScore) {
        bestScore = score;
        best = n;
      }
    }
    if (best) {
      state.menu.selectedId = best.id;
      audio.playSfx('menu_move');
    }
  }

  function openModal(cfg) {
    const modal = {
      badgeKind: cfg.badgeKind || 'big',
      badgeFrame: cfg.badgeFrame ?? 0,
      text: cfg.text || '',
      lines: cfg.lines || null,
      align: cfg.align ?? 0,
      scrollY: 0,
      maxScroll: 0,
      footerLabel: cfg.footerLabel || 'OK / Tiếp tục',
      showCancel: Boolean(cfg.showCancel),
      onConfirm: cfg.onConfirm || (() => {}),
      onCancel: cfg.onCancel || (() => {}),
    };
    if (state.phase === 'world' && state.world) {
      state.world.modal = modal;
    } else {
      state.menu.modal = modal;
    }
  }

  function closeModal() {
    if (state.phase === 'world' && state.world) state.world.modal = null;
    else state.menu.modal = null;
  }

  function handleMenuCycle(dir) {
    const id = state.menu.selectedId;
    let changed = false;
    if (id === 'mp_mode') {
      settings.mpMode = (settings.mpMode + dir + 3) % 3;
      settings.mapId = 0;
      changed = true;
    } else if (id === 'mp_map') {
      const flat = getMapsFlat();
      settings.mapId = (settings.mapId + dir + flat.length) % flat.length;
      changed = true;
    } else if (id === 'mp_bots') {
      settings.bots = Math.max(0, Math.min(3, settings.bots + dir));
      changed = true;
    } else if (id === 'mp_diff') {
      settings.botLevel = (settings.botLevel + dir + 3) % 3;
      changed = true;
    } else if (id === 'set_sound') {
      const next = Math.max(0, Math.min(100, (settings.sfxVol ?? 70) + dir * 15));
      settings.sfxVol = next;
      settings.sfxOn = next > 0;
      applyAudioSettings();
      changed = true;
    } else if (id === 'set_music') {
      settings.musicOn = !settings.musicOn;
      applyAudioSettings();
      changed = true;
    }
    if (changed) {
      saveSettings(settings);
      audio.playSfx('menu_move');
      openMenuScreen(state.menu.screenId, id);
    }
  }

  function purchaseShopItem(sel) {
    if (!sel) return false;
    if (sel.kind === 'weapon') {
      const wId = sel.itemId;
      const cost = WEAPON_PRICES[wId] || 10;
      const pack = WEAPON_BATCH[wId] || 5;
      const curCount = campaignSave.weapons[wId] ?? 0;
      if (curCount === -1 || campaignSave.coins < cost) {
        audio.playSfx('denied');
        return false;
      }
      campaignSave.coins -= cost;
      campaignSave.weapons[wId] = curCount + pack;
      campaignSave.knownWeapons[wId] = true;
    } else if (sel.kind === 'item') {
      const idx = sel.itemId - 14;
      const cost = ITEM_PRICES[idx] || 20;
      if (campaignSave.coins < cost || campaignSave.items[idx] >= 9) {
        audio.playSfx('denied');
        return false;
      }
      campaignSave.coins -= cost;
      campaignSave.items[idx] = (campaignSave.items[idx] || 0) + 1;
      campaignSave.knownItems[idx] = true;
    } else if (sel.kind === 'skill') {
      const sk = sel.itemId;
      const cost = SKILL_COSTS[sk] || 50;
      const curLvl = campaignSave.skills[sk] || 0;
      if (curLvl >= (SKILL_MAX_LEVELS[sk] ?? 1) || campaignSave.coins < cost) {
        audio.playSfx('denied');
        return false;
      }
      campaignSave.coins -= cost;
      campaignSave.skills[sk] = curLvl + 1;
    } else {
      return false;
    }
    state.menu.lastCoinSpent = sel.kind === 'weapon' ? WEAPON_PRICES[sel.itemId] : sel.kind === 'item' ? ITEM_PRICES[sel.itemId - 14] : SKILL_COSTS[sel.itemId];
    state.menu.coinDeltaTimer = 30;
    saveCampaignSave(campaignSave);
    audio.playSfx('buy');
    openMenuScreen('workshop', sel.id);
    return true;
  }

  function handleMenuConfirm() {
    const id = state.menu.selectedId;
    const node = state.menu.nodes.find((n) => n.id === id);
    if (!node || node.disabled) {
      audio.playSfx('denied');
      return;
    }
    audio.playSfx('menu_ok');

    if (state.menu.screenId === 'workshop') {
      if (id === 'shop_go') {
        if (state.menu.shopContext === 'between_levels') {
          launchCampaignLevel(campaignSave.curLevel);
        } else {
          openMenuScreen('play', 'shop');
        }
        return;
      }
      const wsIdx = node.kind === 'weapon' ? node.itemId + 1 : node.kind === 'item' ? node.itemId + 1 : 21 + node.itemId;
      const body = (font.workshopStrings[wsIdx] || node.title || '').trim();
      const price = node.kind === 'weapon' ? WEAPON_PRICES[node.itemId] : node.kind === 'item' ? ITEM_PRICES[node.itemId - 14] : SKILL_COSTS[node.itemId];
      openModal({
        badgeKind: node.kind === 'weapon' || node.kind === 'item' ? 'weapon' : 'big',
        badgeFrame: node.kind === 'weapon' || node.kind === 'item' ? node.itemId + 2 : 0,
        text: `${body}\n\n\`2~Giá: ${price} xu`,
        footerLabel: 'Mua (Enter)',
        showCancel: true,
        onConfirm() {
          closeModal();
          purchaseShopItem(node);
        },
        onCancel() {
          closeModal();
        },
      });
      return;
    }

    switch (id) {
      case 'play': openMenuScreen('play'); break;
      case 'multiplayer': openMenuScreen('multiplayer'); break;
      case 'settings': openMenuScreen('settings'); break;
      case 'help':
        openModal({
          badgeFrame: 0,
          text: font.helpText || SHELL_STRINGS.vi.controlsHint,
          footerLabel: 'Đóng',
          onConfirm: closeModal,
        });
        break;
      case 'credits': openMenuScreen('credits'); break;
      case 'back_root': openMenuScreen('root'); break;

      case 'newgame':
        campaignSave = resetCampaignSave();
        state.progress = campaignSave;
        launchCampaignLevel(0);
        break;
      case 'continue':
        launchCampaignLevel(Math.max(0, Math.min(TOTAL_CAMPAIGN_LEVELS - 1, campaignSave.curLevel || 0)));
        break;
      case 'shop':
        state.menu.shopContext = 'menu';
        openMenuScreen('workshop');
        break;

      case 'mp_online':
        mpUi?.openLobby();
        break;
      case 'skirmish_start': {
        const flat = getMapsFlat();
        const mapName = flat[settings.mapId % flat.length] || 'dm_crossroad';
        startSingleSkirmish({
          mode: settings.mpMode || 0,
          mapName,
          botCount: settings.bots ?? 2,
          botDifficulty: settings.botLevel ?? 1,
          scoreLimit: settings.mpMode === 2 ? 3 : 10,
        });
        break;
      }
      case 'mp_mode':
      case 'mp_map':
      case 'mp_bots':
      case 'mp_diff':
      case 'set_sound':
      case 'set_music':
        handleMenuCycle(1);
        break;
      case 'set_weather':
        settings.weather = !settings.weather;
        saveSettings(settings);
        openMenuScreen('settings', id);
        break;
      case 'set_blood':
        settings.blood = !settings.blood;
        saveSettings(settings);
        openMenuScreen('settings', id);
        break;
      case 'set_tips':
        settings.tips = !settings.tips;
        saveSettings(settings);
        openMenuScreen('settings', id);
        break;
      case 'set_reset':
        openModal({
          badgeFrame: 0,
          align: 2,
          text: font.tSub(37) || 'Xóa các cài đặt?',
          footerLabel: 'Xóa',
          showCancel: true,
          onConfirm() {
            localStorage.clear();
            settings = loadSettings();
            campaignSave = resetCampaignSave();
            arenaSave = loadArenaSave();
            applyAudioSettings();
            closeModal();
            openMenuScreen('root');
          },
          onCancel: closeModal,
        });
        break;

      case 'pause_resume':
        clearInputQueues();
        state.phase = 'world';
        break;
      case 'pause_sound':
        settings.musicOn = !settings.musicOn;
        settings.sfxOn = settings.musicOn;
        saveSettings(settings);
        applyAudioSettings();
        openMenuScreen('pause', id);
        break;
      case 'pause_help':
        openModal({
          badgeFrame: 0,
          text: font.helpText || SHELL_STRINGS.vi.controlsHint,
          footerLabel: 'Đóng',
          onConfirm: closeModal,
        });
        break;
      case 'pause_quit':
        state.world = null;
        isMpGuest = false;
        remoteInputs.clear();
        openMenuScreen('root');
        playTrackForPhase('menu');
        break;
    }
  }

  function handleMenuBack() {
    audio.playSfx('menu_move');
    if (state.menu.screenId === 'workshop') {
      if (state.menu.shopContext === 'between_levels') launchCampaignLevel(campaignSave.curLevel);
      else openMenuScreen('play', 'shop');
      return;
    }
    if (state.menu.screenId === 'credits') {
      openMenuScreen('root', 'credits');
      return;
    }
    if (state.menu.screenId === 'pause') {
      state.phase = 'world';
      return;
    }
    if (state.menu.canGoBack) {
      openMenuScreen('root', state.menu.screenId === 'play' ? 'play' : state.menu.screenId === 'multiplayer' ? 'multiplayer' : 'settings');
    }
  }

  // Launchers: Campaign, Skirmish, Online Multiplayer
  async function launchCampaignLevel(levelIdx) {
    isMpGuest = false;
    remoteInputs.clear();
    const clamped = Math.max(0, Math.min(TOTAL_CAMPAIGN_LEVELS - 1, levelIdx));
    campaignSave.curLevel = clamped;
    saveCampaignSave(campaignSave);

    const bytes = await assets.loadMapBytes(`campaign/map${clamped}.map`);
    const parsedMap = parseMapBinary(bytes, { sheets: assets.sheets });

    state.world = new PipyakiWorld(parsedMap, {
      isCampaign: true,
      friendlyFire: false,
      weatherEnabled: settings.weather,
      bloodEnabled: settings.blood,
      nickname: settings.nickname,
      campaignSave,
      onSfx: (name) => audio.playSfx(name),
      onShowText(hintIdx) {
        if (!settings.tips) return;
        const msg = font.tSub(49 + hintIdx) || font.tSub(49);
        if (msg) {
          openModal({ badgeFrame: 0, text: msg, footerLabel: 'Tiếp tục', onConfirm: closeModal });
        }
      },
      onCampaignEnd(victory, stats) {
        handleCampaignEnd(clamped, victory, stats);
      },
    });

    state.progress = campaignSave;
    state.phase = 'world';
    playTrackForPhase(parsedMap.musicTrack === 1 ? 'game1' : 'game0');

    const story = (assets.campaignLangs[clamped] || '').split(';')[0].trim();
    if (story) {
      openModal({
        badgeKind: 'pipyaka',
        text: `\`2~Màn ${clamped + 1}/${TOTAL_CAMPAIGN_LEVELS}\n\n\`0~${story}`,
        footerLabel: 'Chiến đấu!',
        onConfirm: closeModal,
      });
    }
  }

  function handleCampaignEnd(levelIdx, victory, stats) {
    const p = stats?.player;
    if (victory && p) {
      campaignSave.coins = p.coins;
      campaignSave.weapons = [...p.weapons];
      campaignSave.items = [...p.items];
      campaignSave.primary = p.primaryWeapon;
      campaignSave.secondary = p.secondaryWeapon;
      campaignSave.score += (stats.kills || 0) * 50 + 200;
      const next = Math.min(TOTAL_CAMPAIGN_LEVELS - 1, levelIdx + 1);
      campaignSave.unlockedLevel = Math.max(campaignSave.unlockedLevel, next);
      campaignSave.curLevel = levelIdx + 1 < TOTAL_CAMPAIGN_LEVELS ? levelIdx + 1 : 0;
      saveCampaignSave(campaignSave);
    }

    const summary = victory
      ? `\`2~${font.tSub(21) || 'Bạn đã chiến thắng!'}\n\n` +
        `\`0~${font.tSub(41) || 'Tiêu diệt:'} ${stats.kills}\n` +
        `${font.tSub(42) || 'Các mục:'} ${stats.itemsPicked}\n` +
        `${font.tSub(45) || 'Tổng số tiền:'} ${stats.totalCoins} xu\n` +
        `${font.tSub(46) || 'Thời gian chơi:'} ${stats.elapsedSec}s`
      : `\`2~${font.tSub(23) || 'Bạn đã thua!'}\n\n` +
        `\`0~${font.tSub(41) || 'Tiêu diệt:'} ${stats.kills}\n` +
        `${font.tSub(46) || 'Thời gian chơi:'} ${stats.elapsedSec}s`;

    openModal({
      badgeKind: 'big',
      badgeFrame: victory ? 3 : 1,
      align: 2,
      text: summary,
      footerLabel: victory ? (levelIdx + 1 < TOTAL_CAMPAIGN_LEVELS ? 'Cửa hàng →' : 'Menu') : 'Chơi lại',
      showCancel: true,
      onConfirm() {
        closeModal();
        if (victory) {
          if (levelIdx + 1 < TOTAL_CAMPAIGN_LEVELS) {
            state.menu.shopContext = 'between_levels';
            openMenuScreen('workshop');
          } else {
            state.world = null;
            openMenuScreen('root');
            playTrackForPhase('menu');
          }
        } else {
          launchCampaignLevel(levelIdx);
        }
      },
      onCancel() {
        closeModal();
        state.world = null;
        openMenuScreen('root');
        playTrackForPhase('menu');
      },
    });
  }

  async function startSingleSkirmish(cfg) {
    isMpGuest = false;
    remoteInputs.clear();
    const bytes = await assets.loadMapBytes(`${cfg.mapName}.map`);
    const parsedMap = parseMapBinary(bytes, { sheets: assets.sheets });
    state.world = new PipyakiWorld(parsedMap, {
      isCampaign: false,
      mode: cfg.mode,
      scoreLimit: cfg.scoreLimit || 10,
      friendlyFire: settings.friendlyFire,
      weatherEnabled: settings.weather,
      bloodEnabled: settings.blood,
      nickname: settings.nickname,
      arenaSave,
      botCount: cfg.botCount,
      botDifficulty: cfg.botDifficulty,
      teamColor: settings.teamColor || 0,
      onSfx: (name) => audio.playSfx(name),
    });
    state.progress = { knownWeapons: new Array(14).fill(true), knownItems: new Array(6).fill(true) };
    state.phase = 'world';
    playTrackForPhase(parsedMap.musicTrack === 1 ? 'game1' : 'game0');
  }

  async function startMultiplayerMatch(matchConfig) {
    remoteInputs.clear();
    isMpGuest = mpClient.role === 'guest';
    const localId = mpClient.getLocalActorId();
    const bytes = await assets.loadMapBytes(`${matchConfig.mapName}.map`);
    const parsedMap = parseMapBinary(bytes, { sheets: assets.sheets });
    const humanRoster = (matchConfig.players || []).map((p) => ({
      id: p.id,
      name: p.name,
      team: p.team,
      isLocal: p.id === localId,
    }));

    state.world = new PipyakiWorld(parsedMap, {
      isCampaign: false,
      mode: matchConfig.mode,
      scoreLimit: matchConfig.scoreLimit || 10,
      friendlyFire: Boolean(matchConfig.friendlyFire),
      weatherEnabled: settings.weather,
      bloodEnabled: settings.blood,
      nickname: mpClient.getMyPlayer()?.name || settings.nickname,
      arenaSave,
      botCount: matchConfig.botCount ?? 0,
      botDifficulty: matchConfig.botDifficulty ?? 1,
      humanRoster,
      onSfx: (name) => audio.playSfx(name),
    });
    state.progress = { knownWeapons: new Array(14).fill(true), knownItems: new Array(6).fill(true) };
    state.phase = 'world';
    playTrackForPhase(parsedMap.musicTrack === 1 ? 'game1' : 'game0');
  }

  function showArenaResultModal(world) {
    if (world.modal) return;
    let headline = 'Trận đấu kết thúc!';
    if (world.mode === 0) {
      const winner = world.actors.find((a) => a.id === world.winnerTeam);
      headline = winner ? `${winner.name} thắng Tử chiến!` : headline;
    } else {
      headline = world.winnerTeam === 0 ? 'Đội Xanh chiến thắng!' : 'Đội Đỏ chiến thắng!';
    }
    const rows = [...world.actors]
      .filter((a) => a.isPlayerOrBot)
      .sort((a, b) => b.kills - a.kills || a.deaths - b.deaths)
      .map((a) => `${a.name}: ${a.kills}K / ${a.deaths}D`)
      .join('\n');

    openModal({
      badgeKind: 'big',
      badgeFrame: 3,
      align: 2,
      text: `\`2~${headline}\n\n\`0~${rows}`,
      footerLabel: 'Phòng / Menu',
      onConfirm() {
        closeModal();
        state.world = null;
        isMpGuest = false;
        openMenuScreen('root');
        playTrackForPhase('menu');
        if (mpClient.isRoomActive() && mpClient.role === 'host') {
          mpClient.lobby.status = 'lobby';
          mpClient.emitLobby();
          mpUi?.openLobby();
        }
      },
    });
  }

  // Quick Weapon Selector (# key) helpers (qb.java:567-708)
  function updateQuickCursorTarget() {
    const startX = Math.round((VIEW_W - 160) / 2) + Math.floor((160 - 44 * 3) / 2) + 1;
    const startY = Math.round((VIEW_H - 160) / 2) + Math.floor((160 - 44 * 3) / 2) + 1;
    const slot = (state.menu.quickSelected ?? 0) % 9;
    state.menu.quickCurPos = {
      x: startX + (slot % 3) * 42,
      y: startY + Math.floor(slot / 3) * 42,
    };
  }

  function openQuickSelect() {
    if (!state.world || state.world.finished) return;
    clearInputQueues();
    state.phase = 'menu';
    state.menu.mode = 'quick_select';
    state.menu.screenId = 'quick_select';
    state.menu.modal = null;
    const p = state.world.player;
    const curId = Math.max(0, p?.primaryWeapon ?? 0);
    state.menu.quickPage = Math.floor(curId / 9);
    state.menu.quickSelected = curId;
    updateQuickCursorTarget();
  }

  function handleQuickSelectCmd(cmd) {
    let sel = state.menu.quickSelected ?? 0;
    let page = state.menu.quickPage || 0;
    if (cmd === 'left') sel = (sel % 3 === 0) ? sel + 2 : sel - 1;
    else if (cmd === 'right') sel = (sel % 3 === 2) ? sel - 2 : sel + 1;
    else if (cmd === 'up') sel = sel - 3 < page * 9 ? sel + 6 : sel - 3;
    else if (cmd === 'down') sel = sel + 3 >= (page + 1) * 9 ? sel - 6 : sel + 3;
    else if (cmd === 'page') {
      page = (page + 1) % 3;
      sel = page * 9;
    } else if (cmd === 'primary') {
      const p = state.world?.player;
      if (p) {
        if (sel < 14 && (p.weapons[sel] ?? 0) !== 0) {
          p.primaryWeapon = sel;
          if (isMpGuest) mpClient.sendInput({ selectPrimary: sel });
          audio.playSfx('menu_ok');
        } else if (sel >= 14 && sel < 20 && (p.items[sel - 14] ?? 0) > 0) {
          queuedCmds.push({ type: 'useItem', itemIdx: sel - 14 });
          audio.playSfx('pickup');
        } else {
          audio.playSfx('denied');
        }
      }
      state.phase = 'world';
      return;
    } else if (cmd === 'secondary') {
      const p = state.world?.player;
      if (p && sel < 20) {
        p.secondaryWeapon = sel;
        if (isMpGuest) mpClient.sendInput({ selectSecondary: sel });
        audio.playSfx('menu_ok');
      }
      state.phase = 'world';
      return;
    } else if (cmd === 'close') {
      state.phase = 'world';
      return;
    }
    sel = Math.max(0, Math.min(19, sel));
    state.menu.quickPage = Math.floor(sel / 9);
    state.menu.quickSelected = sel;
    updateQuickCursorTarget();
    audio.playSfx('menu_move');
  }

  // Input Event Wiring
  function mapKeyDirection(code) {
    if (code === 'ArrowDown' || code === 'KeyS' || code === 'Numpad2') return 0;
    if (code === 'ArrowLeft' || code === 'KeyA' || code === 'Numpad4') return 1;
    if (code === 'ArrowUp' || code === 'KeyW' || code === 'Numpad8') return 2;
    if (code === 'ArrowRight' || code === 'KeyD' || code === 'Numpad6') return 3;
    return -1;
  }

  function shouldIgnoreTarget(e) {
    const t = e.target;
    return t && (t.tagName === 'INPUT' || t.tagName === 'TEXTAREA' || t.tagName === 'SELECT');
  }

  window.addEventListener('keydown', (e) => {
    if (shouldIgnoreTarget(e)) return;
    audio.unlock();

    const code = e.code;
    const key = e.key;
    const isGameKey =
      ['ArrowUp', 'ArrowDown', 'ArrowLeft', 'ArrowRight', 'Space', 'Enter', 'Tab', 'Backspace', 'Escape'].includes(code) ||
      ['KeyW', 'KeyA', 'KeyS', 'KeyD', 'KeyQ', 'KeyE', 'KeyF', 'Digit1', 'Digit2', 'Digit3', 'Digit4', 'Digit5', 'Digit6', 'Digit7', 'Digit8', 'Digit9', 'Digit0', 'Numpad0', 'Numpad2', 'Numpad4', 'Numpad5', 'Numpad6', 'Numpad8', 'NumpadMultiply'].includes(code) ||
      key === '*' || key === '#';
    if (isGameKey) e.preventDefault();

    if (e.repeat) {
      if (state.phase === 'menu') {
        // Allow held scroll inside modals & credits
      } else {
        return;
      }
    }

    heldKeys.add(code);

    // Intro keys
    if (state.phase === 'intro') {
      if (!state.intro.soundAnswered) {
        if (code === 'KeyE' || code === 'Escape' || code === 'Digit0' || code === 'KeyN') {
          settings.musicOn = false;
          saveSettings(settings);
          applyAudioSettings();
          state.intro.soundAnswered = true;
          state.intro.leaving = true;
        } else if (code === 'Enter' || code === 'Space' || code === 'KeyQ' || code === 'Digit5' || code === 'Digit1' || code === 'KeyY') {
          settings.musicOn = true;
          saveSettings(settings);
          applyAudioSettings();
          state.intro.soundAnswered = true;
          playTrackForPhase('menu');
        }
      } else if (code === 'Enter' || code === 'Space' || code === 'Escape' || code === 'KeyE') {
        state.intro.leaving = true;
      }
      return;
    }

    // Active modal anywhere (Menu or World)
    const activeModal = state.phase === 'world' ? state.world?.modal : state.menu.modal;
    if (activeModal) {
      if (code === 'ArrowUp' || code === 'KeyW') activeModal.scrollY = Math.max(0, activeModal.scrollY - 18);
      else if (code === 'ArrowDown' || code === 'KeyS') activeModal.scrollY = Math.min(activeModal.maxScroll || 0, activeModal.scrollY + 18);
      else if (code === 'Enter' || code === 'Space' || code === 'KeyQ' || code === 'Digit5') activeModal.onConfirm?.();
      else if (code === 'Escape' || code === 'KeyE' || code === 'Backspace') activeModal.onCancel?.();
      return;
    }

    // Quick Weapon Grid (#)
    if (state.phase === 'menu' && state.menu.mode === 'quick_select') {
      if (code === 'ArrowLeft' || code === 'KeyA') handleQuickSelectCmd('left');
      else if (code === 'ArrowRight' || code === 'KeyD') handleQuickSelectCmd('right');
      else if (code === 'ArrowUp' || code === 'KeyW') handleQuickSelectCmd('up');
      else if (code === 'ArrowDown' || code === 'KeyS') handleQuickSelectCmd('down');
      else if (key === '#' || code === 'Tab' || code === 'Digit3') handleQuickSelectCmd('page');
      else if (code === 'Enter' || code === 'Space' || code === 'Digit5' || code === 'KeyQ') handleQuickSelectCmd('primary');
      else if (key === '*' || code === 'KeyF' || code === 'ShiftLeft' || code === 'ShiftRight') handleQuickSelectCmd('secondary');
      else if (code === 'Escape' || code === 'KeyE' || code === 'Backspace') handleQuickSelectCmd('close');
      return;
    }

    // Menu / Workshop / Credits / Pause
    if (state.phase === 'menu') {
      if (state.menu.mode === 'credits') {
        if (code === 'Escape' || code === 'KeyE' || code === 'Enter' || code === 'Space' || code === 'Backspace') handleMenuBack();
        return;
      }
      const id = state.menu.selectedId;
      const node = state.menu.nodes.find((n) => n.id === id);
      if (node?.cyclable && (code === 'ArrowLeft' || code === 'KeyA')) { handleMenuCycle(-1); return; }
      if (node?.cyclable && (code === 'ArrowRight' || code === 'KeyD')) { handleMenuCycle(1); return; }

      if (code === 'ArrowLeft' || code === 'KeyA') moveMenuSelection(-1, 0);
      else if (code === 'ArrowRight' || code === 'KeyD') moveMenuSelection(1, 0);
      else if (code === 'ArrowUp' || code === 'KeyW') moveMenuSelection(0, -1);
      else if (code === 'ArrowDown' || code === 'KeyS') moveMenuSelection(0, 1);
      else if (code === 'Enter' || code === 'Space' || code === 'Digit5' || code === 'KeyQ') handleMenuConfirm();
      else if (code === 'Escape' || code === 'KeyE' || code === 'Backspace') handleMenuBack();
      return;
    }

    // Gameplay inputs
    if (state.phase === 'world' && state.world) {
      const dir = mapKeyDirection(code);
      if (dir !== -1 && !e.repeat) {
        const now = performance.now();
        const prev = lastTapTime.get(dir) || 0;
        if (now - prev < 260) {
          pendingDashDir = dir;
          lastTapTime.delete(dir);
        } else {
          lastTapTime.set(dir, now);
        }
      }
      if (code === 'Enter' || code === 'Space' || code === 'Digit5') {
        queuedCmds.push({ type: 'firePrimary' });
      } else if (key === '*' || code === 'KeyF' || code === 'ShiftLeft' || code === 'ShiftRight' || code === 'NumpadMultiply') {
        queuedCmds.push({ type: 'fireSecondary' });
      } else if (key === '#' || code === 'Tab' || code === 'Digit3') {
        openQuickSelect();
      } else if (code === 'Digit9') {
        state.world.showLeaderboard = !state.world.showLeaderboard;
      } else if (code === 'KeyE' || code === 'Escape' || code === 'KeyQ' || code === 'Backspace') {
        openMenuScreen('pause');
      }
    }
  });

  window.addEventListener('keyup', (e) => {
    heldKeys.delete(e.code);
  });

  window.addEventListener('blur', clearInputQueues);

  // Canvas Pointer / Touch handler (maps viewport client coords cleanly to 240x320 logical coords)
  canvas.addEventListener('pointerdown', (e) => {
    audio.unlock();
    const rect = canvas.getBoundingClientRect();
    const lx = ((e.clientX - rect.left) / rect.width) * VIEW_W;
    const ly = ((e.clientY - rect.top) / rect.height) * VIEW_H;

    if (state.phase === 'intro') {
      if (!state.intro.soundAnswered) {
        if (lx > VIEW_W - 70 && ly > VIEW_H - 44) {
          settings.musicOn = false;
          saveSettings(settings);
          applyAudioSettings();
          state.intro.soundAnswered = true;
          state.intro.leaving = true;
        } else {
          settings.musicOn = true;
          saveSettings(settings);
          applyAudioSettings();
          state.intro.soundAnswered = true;
          playTrackForPhase('menu');
        }
      } else {
        state.intro.leaving = true;
      }
      return;
    }

    const activeModal = state.phase === 'world' ? state.world?.modal : state.menu.modal;
    if (activeModal) {
      if (activeModal.showCancel && lx > VIEW_W - 44 && ly > VIEW_H - 34) activeModal.onCancel?.();
      else activeModal.onConfirm?.();
      return;
    }

    if (state.phase === 'menu') {
      if (state.menu.mode === 'quick_select') {
        if (lx < 40 && ly > VIEW_H - 34) { handleQuickSelectCmd('primary'); return; }
        if (lx > VIEW_W - 40 && ly > VIEW_H - 34) { handleQuickSelectCmd('close'); return; }
        const startX = Math.round((VIEW_W - 160) / 2) + Math.floor((160 - 44 * 3) / 2) + 1;
        const startY = Math.round((VIEW_H - 160) / 2) + Math.floor((160 - 44 * 3) / 2) + 1;
        const col = Math.floor((lx - startX) / 42);
        const row = Math.floor((ly - startY) / 42);
        if (col >= 0 && col < 3 && row >= 0 && row < 3) {
          const hitId = (state.menu.quickPage || 0) * 9 + row * 3 + col;
          if (hitId < 20) {
            if (state.menu.quickSelected === hitId) handleQuickSelectCmd('primary');
            else {
              state.menu.quickSelected = hitId;
              updateQuickCursorTarget();
              audio.playSfx('menu_move');
            }
          }
        }
        return;
      }

      if (ly > VIEW_H - 34) {
        if (lx < 48) { handleMenuConfirm(); return; }
        if (lx > VIEW_W - 48 && state.menu.canGoBack) { handleMenuBack(); return; }
      }

      for (const node of state.menu.nodes) {
        if (!node.visible) continue;
        const cx = node.fx + state.menu.camX;
        const cy = node.fy + state.menu.camY;
        if (Math.abs(lx - cx) <= 32 && Math.abs(ly - cy) <= 32) {
          if (state.menu.selectedId === node.id) handleMenuConfirm();
          else {
            state.menu.selectedId = node.id;
            audio.playSfx('menu_move');
          }
          return;
        }
      }
      return;
    }

    if (state.phase === 'world' && state.world) {
      if (ly > VIEW_H - 34) {
        if (lx < 28) openMenuScreen('pause');
        else if (lx > VIEW_W - 48) openQuickSelect();
        else queuedCmds.push({ type: 'firePrimary' });
      }
    }
  });

  // Wire Floating Toolbar Controls
  btnSound?.addEventListener('click', () => {
    audio.unlock();
    const next = !(settings.musicOn || settings.sfxOn);
    settings.musicOn = next;
    settings.sfxOn = next;
    saveSettings(settings);
    applyAudioSettings();
  });

  btnLang?.addEventListener('click', () => {
    settings.lang = settings.lang === 'en' ? 'vi' : 'en';
    saveSettings(settings);
    syncToolbarText();
    if (mpClient.isRoomActive()) mpClient.emitLobby();
  });

  btnFullscreen?.addEventListener('click', () => {
    const el = document.getElementById('viewport-stage');
    if (document.fullscreenElement) document.exitFullscreen().catch(() => {});
    else el?.requestFullscreen?.().catch(() => {});
  });

  btnMpLobby?.addEventListener('click', () => {
    mpUi?.openLobby();
  });

  // Fixed-Timestep 25 Hz (40ms) Simulation Tick
  function stepIntro() {
    const intro = state.intro;
    intro.tick++;
    intro.w -= 0.8;
    for (const item of intro.items) {
      if (item.type === 3) {
        item.animTick = (item.animTick || 0) + 1;
        item.y += 0.6;
        item.x += Math.sin(intro.tick * 0.1 + item.variant) * 0.7;
        if (item.y > VIEW_H) { item.y = -20; item.x = Math.random() * VIEW_W; }
      } else if (item.type === 4) {
        item.animTick = (item.animTick || 0) + 1;
      }
    }

    if (intro.leaving) {
      intro.x -= 280;
      if (intro.x < -2800) {
        openMenuScreen('root');
        if (settings.musicOn) playTrackForPhase('menu');
      }
      return;
    }

    if (intro.Q < 240) intro.Q += 2;
    if (intro.phase === 1 && intro.tick > 18) intro.phase = 2;
    if (intro.phase >= 2) {
      let allLanded = true;
      for (const L of intro.letters) {
        if (L.landed) continue;
        allLanded = false;
        L.vy = Math.min(480, L.vy + 75);
        L.y += L.vy;
        if (L.y >= L.targetY) {
          L.y = L.targetY;
          if (Math.abs(L.vy) > 120) L.vy = -Math.floor(L.vy * 0.35);
          else { L.vy = 0; L.landed = true; }
        }
      }
      if (intro.phase === 2 && allLanded) intro.phase = 3;
    }
    if (intro.phase >= 3) {
      intro.U = (intro.U + 1) % 27;
      if (intro.S > 96) intro.S -= 3.5;
      else if (intro.phase < 7) intro.phase = 7;
    }
    if (intro.phase >= 7) {
      intro.bloodFrame = Math.min(8, intro.bloodFrame + 1);
      if (intro.soundAnswered && intro.tick > 210) intro.leaving = true;
    }
  }

  function stepMenu() {
    const m = state.menu;
    if (m.coinDeltaTimer > 0) m.coinDeltaTimer--;
    if (m.mode === 'credits') {
      m.creditsY -= 1.2;
      if (m.creditsY < -(m.creditsHeight || 240)) m.creditsY = VIEW_H - 30;
      return;
    }
    const sel = m.nodes.find((n) => n.id === m.selectedId);
    if (sel) {
      m.targetCamX = Math.round(VIEW_W / 2 - sel.fx);
      m.targetCamY = Math.round((VIEW_H - 28) / 2 - sel.fy);
      m.camX += (m.targetCamX - m.camX) * 0.28;
      m.camY += (m.targetCamY - m.camY) * 0.28;
    }
  }

  function readLocalInputPacket() {
    let moveDir = -1;
    for (const c of heldKeys) {
      const d = mapKeyDirection(c);
      if (d !== -1) { moveDir = d; break; }
    }
    let firePrimary = false;
    let fireSecondary = false;
    let useItem = -1;
    for (const cmd of queuedCmds) {
      if (cmd.type === 'firePrimary') firePrimary = true;
      else if (cmd.type === 'fireSecondary') fireSecondary = true;
      else if (cmd.type === 'useItem') useItem = cmd.itemIdx;
    }
    queuedCmds.length = 0;
    const dashDir = pendingDashDir;
    pendingDashDir = -1;
    const pkt = { moveDir, firePrimary, fireSecondary, dashDir };
    if (useItem !== -1) pkt.useItem = useItem;
    return pkt;
  }

  function onStepSimulation() {
    state.tick++;
    if (!loaded || state.phase === 'loading') return;
    if (state.phase === 'intro') {
      stepIntro();
    } else if (state.phase === 'menu') {
      stepMenu();
    } else if (state.phase === 'world' && state.world) {
      const world = state.world;
      const localInput = readLocalInputPacket();
      if (isMpGuest) {
        mpClient.sendInput(localInput);
        if (world.finished && !world.modal) showArenaResultModal(world);
        return;
      }
      world.step(localInput, remoteInputs);
      if (mpClient.isRoomActive() && mpClient.role === 'host') {
        mpClient.sendSnapshot(world.exportNetSnapshot());
      }
      if (!world.isCampaign && world.finished && !world.modal) {
        showArenaResultModal(world);
      }
    }
  }

  const midpG = new MidpGraphics(ctx, VIEW_W, VIEW_H);

  function renderFrame(targetCtx) {
    midpG.ctx = targetCtx;
    midpG.reset();
    if (!loaded || state.phase === 'loading') {
      midpG.setColor(9, 14, 8);
      midpG.fillRect(0, 0, VIEW_W, VIEW_H);
      midpG.setColor(60, 95, 42);
      midpG.drawRectMIDP(40, 152, 160, 14);
      midpG.setColor(156, 255, 123);
      midpG.fillRect(42, 154, Math.round(156 * loadProgress), 10);
      return;
    }
    if (state.phase === 'intro') {
      renderIntro(midpG, state, assets, font);
    } else if (state.phase === 'menu') {
      renderMenu(midpG, state, assets, font);
    } else if (state.phase === 'world') {
      renderWorld(midpG, state, assets, font);
    }
  }

  // Mount 25 Hz fixed simulation + 60 FPS visual loop (Port of ab.java:320-385 FRAME_TIME=40ms)
  mountPhaserRuntime({
    canvas,
    width: VIEW_W,
    height: VIEW_H,
    tickMs: 40,
    onStepSimulation,
    onFrameInterpolate() {
      return true;
    },
    onRenderFrame: renderFrame,
  });

  // Stream assets and start game
  assets = await loadPipyakiAssets((p) => {
    loadProgress = p;
  });
  font.init({
    fontImg: assets.fontImg,
    fontTxt: assets.fontTxt,
    fontCfg: assets.fontCfg,
    icons: assets.fontIcons,
    digitsStrip: assets.sheets.menuDigits,
    bigDigitsStrip: assets.sheets.numbersBig,
    langTxt: assets.langTxt,
    workshopTxt: assets.workshopTxt,
    helpTxt: assets.helpTxt,
  });
  audio.setMidiBuffers(assets.midiBuffers);
  loaded = true;

  mpUi = bindMultiplayerLobby({
    client: mpClient,
    getLang: () => settings.lang,
    getMapsList: () => assets.mapsList,
    getDefaultNickname: () => settings.nickname || 'Pipyaka',
  });
  applyAudioSettings();

  // Check URL deep-links (?mp=PKxxxx or ?screen=menu|shop|skirmish|map0)
  const params = new URLSearchParams(window.location.search || '');
  const screenParam = params.get('screen');
  if (mpUi.autoJoinFromUrl()) {
    openMenuScreen('root');
  } else if (screenParam === 'menu') {
    openMenuScreen('root');
  } else if (screenParam === 'shop') {
    state.menu.shopContext = 'menu';
    openMenuScreen('workshop');
  } else if (screenParam === 'skirmish') {
    openMenuScreen('multiplayer');
  } else {
    state.phase = 'intro';
  }
}

main().catch((err) => {
  console.error('Pipyaki Pro boot failed:', err);
});
