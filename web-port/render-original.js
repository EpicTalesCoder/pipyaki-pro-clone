/**
 * Port of wb.java, x.java, qb.java, gb.java, tb.java, fb.java, q.java, j.java, s.java, o.java, w.java, hb.java
 * 1:1 Pipyaki Pro J2ME Rendering Pipeline (240x320 logical canvas).
 */

import {
  ITEM_ICON_CODES,
  ITEM_PRICES,
  OBSTACLE_OFFSETS,
  SKILL_COSTS,
  SKILL_MAX_LEVELS,
  SKILL_SPRITE_ICO,
  WEAPON_ICON_CODES,
  WEAPON_PRICES,
} from './pipyaki-loader.js';
import { SpriteAnim } from './midp-graphics.js';

export const VIEW_W = 240;
export const VIEW_H = 320;

const TEAM_POD_COLORS = ['#7bff7b', '#ffd84d', '#5fd0ff', '#ff6464'];

/**
 * Draw 9-patch translucent frame (fragswin.png 60x60 = 3x3 cells of 20x20).
 * Port of qb.java:581-649 & fb.java:920-998.
 */
export function drawFragswinBox(g, fragStrip, x, y, cols, rows) {
  if (!fragStrip) return;
  const cw = fragStrip.d; // 20
  const ch = fragStrip.e; // 20
  let py = Math.round(y);
  for (let r = 1; r <= rows; r++) {
    let px = Math.round(x);
    const ty = r === 1 ? 0 : r === rows ? 2 : 1;
    for (let c = 1; c <= cols; c++) {
      const tx = c === 1 ? 0 : c === cols ? 2 : 1;
      fragStrip.b = ty * 3 + tx;
      fragStrip.setPos(px, py);
      fragStrip.draw(g);
      px += cw;
    }
    py += ch;
  }
}

/**
 * Draw crisp horizontal gradient/shadow separator bar under softkey / shop footer (qb.b line separator).
 */
export function drawMenuFooterBar(g, sheets, yTop, textWidth = 0) {
  const line = sheets.menuLine?.a;
  g.setAlphaColor(0, 0, 0, 0.94);
  g.fillRect(0, yTop, VIEW_W, VIEW_H - yTop);
  if (line) {
    g.drawImage(line, 0, yTop, 0);
  } else {
    g.setColor(110, 145, 95);
    g.drawLine(0, yTop, VIEW_W - 1, yTop);
  }
}

/**
 * Draw LSK / RSK button icon from sscrbuttons.png (20x20, 3 frames: 0=OK/Yes, 1=Back/No, 2=Pause).
 */
export function drawSoftkey(g, sheets, isRight, frameIdx, hovered = false) {
  const s = sheets.sscrbuttons;
  if (!s) return;
  const x = isRight ? VIEW_W - 2 - s.d : 2;
  const y = VIEW_H - 2 - s.e;
  if (hovered) {
    g.setAlphaColor(255, 216, 77, 0.25);
    g.fillRect(x - 1, y - 1, s.d + 2, s.e + 2);
  }
  s.b = frameIdx;
  s.setPos(x, y);
  s.draw(g);
}

/**
 * Port of wb.b(Graphics) (wb.java:385-625) + x.b(Graphics) (x.java:1-138).
 * Draws parallax hills, clouds, windblown leaf, winking star, dropping letters, house & logo + music prompt.
 */
export function renderIntro(g, state, assets, font) {
  const { sheets, wordLetters } = assets;
  const intro = state.intro;
  const skyH = intro.y; // 213
  const camY = Math.round(intro.x / 10);
  const Q = Math.min(240, intro.Q);

  // Port of wb.java:391-422 — animated sky dusk/dawn color gradient
  const r1 = Math.floor(160 + (80 * Q) / 240);
  const g1 = Math.floor(240 - (220 * Q) / 240);
  const b1 = Math.floor(60 - (60 * Q) / 240);
  const r2 = Math.floor(30 + (30 * Q) / 240);
  const g2 = Math.floor(60 - (60 * Q) / 240);
  const b2 = 0;

  g.setColor(0, 0, 0);
  g.fillRect(0, 0, VIEW_W, VIEW_H);

  // Sky horizon fill + vertical banded gradient matching wb.java:410-414
  if (skyH + camY > 0) {
    for (let step = 0; step < skyH; step += 2) {
      const rr = Math.floor(r1 - ((r1 - r2) * step) / skyH);
      const gg = Math.floor(g1 - ((g1 - g2) * step) / skyH);
      const bb = Math.floor(b1 - (b1 * step) / skyH);
      g.setColor(rr, gg, bb);
      g.fillRect(0, skyH + camY - step - 2, VIEW_W, 2);
    }
  }

  // Far horizon green grass base beneath hills (hills5 anchors ground)
  if (skyH + camY < VIEW_H) {
    g.setColor(34, 62, 24);
    g.fillRect(0, skyH + camY, VIEW_W, VIEW_H - (skyH + camY));
  }

  // Big clouds (type 2), small clouds (type 1), hills (type 0), leaves (type 3), star (type 4)
  const cloudS = [sheets.cloudS1?.a, sheets.cloudS2?.a, sheets.cloudS3?.a];
  const cloudB = [sheets.cloudB1?.a, sheets.cloudB2?.a, sheets.cloudB3?.a];
  const hills = [sheets.hills1?.a, sheets.hills2?.a, sheets.hills3?.a, sheets.hills4?.a, sheets.hills5?.a];

  for (const pass of [2, 1, 0, 3, 4]) {
    for (const item of intro.items) {
      if (item.type !== pass) continue;
      const sx = Math.round(item.x + intro.w * (item.parallax || 1));
      const sy = Math.round(item.y + camY);
      if (pass === 2 && cloudS[item.variant]) {
        g.drawImage(cloudS[item.variant], sx, sy, 0);
      } else if (pass === 1 && cloudB[item.variant]) {
        g.drawImage(cloudB[item.variant], sx, sy, 0);
      } else if (pass === 0 && hills[item.variant]) {
        g.drawImage(hills[item.variant], sx, sy - hills[item.variant].height, 0);
      } else if (pass === 3) {
        const leaf = item.variant === 0 ? sheets.leaf1 : sheets.leaf2;
        if (leaf) {
          leaf.b = Math.floor((item.animTick || 0) / 3) % leaf.h;
          leaf.setPos(sx, sy);
          leaf.draw(g);
        }
      } else if (pass === 4 && sheets.star) {
        // Twinkle star above logo
        const sf = (item.animTick || 0) % 4;
        if (sf < 2) {
          g.drawImage(sheets.star.a, sx, sy, 0);
        }
      }
    }
  }

  // Sliding hills5 grass seam strip across ground boundary (hills5.png 180x15)
  const h5 = sheets.hills5?.a;
  if (h5 && skyH + camY > -15) {
    const ox = ((Math.round(intro.w * 1.4) % h5.width) + h5.width) % h5.width - h5.width;
    for (let x = ox; x < VIEW_W; x += h5.width) {
      g.drawImage(h5, x, skyH + camY - 6, 0);
    }
  }

  // Port of wb.java:518-527 — bombaka_house_v1 sliding across horizon
  if (intro.phase > 2 && sheets.bombakaHouseV1) {
    const bh = sheets.bombakaHouseV1;
    bh.b = Math.min(8, Math.floor(intro.U / 3));
    bh.setPos(Math.round(intro.S), Math.round(intro.T + camY));
    bh.draw(g);
  }

  // Port of wb.java:529-543 — dropping title word letters (w1..w32)
  if (intro.phase >= 2) {
    for (let i = 0; i < intro.letters.length; i++) {
      const L = intro.letters[i];
      if (!L.visible) continue;
      const img = wordLetters[i];
      if (img) {
        g.drawImage(img, Math.round(L.x), Math.round(L.y / 100 + camY), 0);
      }
    }
  }

  // Port of wb.java:615-624 — pro_blood_short blood emblem animation (phase >= 7)
  if ((intro.phase >= 7 || intro.leaving) && sheets.proBloodShort) {
    const pb = sheets.proBloodShort;
    pb.b = Math.min(4, Math.max(0, Math.floor((intro.bloodFrame || 0) / 2)));
    pb.setPos(Math.round((VIEW_W - pb.d) / 2), Math.round((VIEW_H - pb.e) / 2 - 20 + camY));
    pb.draw(g);
  }

  // Port of wb.java:545-582 — Sound ON/OFF prompt OR Skip button on bottom softkeys
  if (!intro.leaving && intro.phase > 0) {
    const skipStrip = sheets.introSkip;
    if (!intro.soundAnswered) {
      drawMenuFooterBar(g, sheets, VIEW_H - 34);
      font.drawText(g, font.tMain(10) + '?', VIEW_W / 2, VIEW_H - 29, -1, 2, 0);
      if (skipStrip) {
        // frames 0..2: check(on), 3..5: cross(off)
        skipStrip.b = 0;
        skipStrip.setPos(4, VIEW_H - 2 - skipStrip.e);
        skipStrip.draw(g);
        skipStrip.b = 3;
        skipStrip.setPos(VIEW_W - 4 - skipStrip.d, VIEW_H - 2 - skipStrip.e);
        skipStrip.draw(g);
      } else {
        drawSoftkey(g, sheets, false, 0);
        drawSoftkey(g, sheets, true, 1);
      }
    } else if (skipStrip) {
      skipStrip.b = 6;
      skipStrip.setPos(VIEW_W - 4 - skipStrip.d, VIEW_H - 4 - skipStrip.e);
      skipStrip.draw(g);
    }
  }
}

/**
 * Port of qb.b(Graphics) & gb.b(Graphics, camX, camY) (qb.java:560-1101, gb.java:265-977).
 * Draws hierarchical zoom-pan menus, Shop/Workshop, Settings toggles, Credits scroll, and Rb==34 Quick Weapon Selector.
 */
export function renderMenu(g, state, assets, font) {
  const { sheets } = assets;
  const menu = state.menu;

  // Modal scrolling text box inside menu (tb.java)
  if (menu.modal) {
    renderModalBox(g, menu.modal, assets, font);
    return;
  }

  // Port of qb.java:567-708 — Quick Weapon & Equipment 3x3 Selector Overlay (Rb == 34)
  if (menu.mode === 'quick_select') {
    if (state.world) {
      renderWorld(g, state, assets, font, true);
    }
    const cols = 8;
    const rows = 8;
    const boxW = cols * 20;
    const boxH = rows * 20;
    const bx = Math.round((VIEW_W - boxW) / 2);
    const by = Math.round((VIEW_H - boxH) / 2);
    drawFragswinBox(g, sheets.fragswin, bx, by, cols, rows);

    const wep = sheets.menuWeapons;
    const ps = sheets.weaponsPs;
    const p = state.world?.player;
    const startX = bx + Math.floor((boxW - 44 * 3) / 2) + 1;
    const startY = by + Math.floor((boxH - 44 * 3) / 2) + 1;
    const page = menu.quickPage || 0;
    const pageStart = page * 9;

    // Animated selection cursor V.b = 0
    if (wep && menu.quickCurPos) {
      wep.b = 0;
      wep.setPos(Math.round(menu.quickCurPos.x), Math.round(menu.quickCurPos.y));
      wep.draw(g);
    }

    for (let slot = 0; slot < 9; slot++) {
      const id = pageStart + slot; // 0..19 (0..13 weapons, 14..19 items)
      if (id >= 20) break;
      const gx = startX + (slot % 3) * 42;
      const gy = startY + Math.floor(slot / 3) * 42;
      const count = id < 14 ? (p?.weapons[id] ?? 0) : (p?.items[id - 14] ?? 0);
      const known = id < 14 ? (count > 0 || state.progress.knownWeapons[id]) : (count > 0 || state.progress.knownItems[id - 14]);
      if (wep) {
        wep.b = known ? id + 2 : 1; // frame 1 is '?' locked
        wep.setPos(gx, gy);
        wep.draw(g);
      }
      if (p) {
        if (id < 14 && p.primaryWeapon === id && ps) {
          ps.b = 0; // Primary 'P'
          ps.setPos(gx, gy);
          ps.draw(g);
        } else if (p.secondaryWeapon === id && ps) {
          ps.b = 1; // Secondary 'S'
          ps.setPos(gx, gy);
          ps.draw(g);
        }
      }
      if (count !== 0) {
        if (count === -1 && sheets.menuInf) {
          g.drawImage(sheets.menuInf.a, gx + 39 - sheets.menuInf.a.width, gy + 30, 0);
        } else {
          font.drawSmallDigits(g, String(count), gx + 39, gy + 30, 1);
        }
      }
    }

    // Page indicator dots (qb.java:692-708)
    if (sheets.menuPages) {
      const totalPages = 3;
      let px = bx + Math.floor((boxW - sheets.menuPages.d * totalPages - (totalPages - 1)) / 2);
      const py = Math.min(VIEW_H - sheets.menuPages.e - 1, by + boxH - sheets.menuPages.e - 10);
      for (let i = 0; i < totalPages; i++) {
        sheets.menuPages.b = i === page ? 0 : 1;
        sheets.menuPages.setPos(px, py);
        sheets.menuPages.draw(g);
        px += sheets.menuPages.d + 1;
      }
    }

    // Tooltip bar for selected quick weapon/item
    const selId = menu.quickSelected ?? 0;
    const tipText = getWeaponOrItemTitle(selId, font);
    drawMenuFooterBar(g, sheets, VIEW_H - 22);
    font.drawText(g, tipText, VIEW_W / 2, VIEW_H - 18, VIEW_W - 44, 2, 2);
    drawSoftkey(g, sheets, false, 0);
    drawSoftkey(g, sheets, true, 1);
    return;
  }

  // Dark textured forest/dungeon menu background matching qb.java:710-711 + subtle radial ambient
  g.setColor(10, 16, 11);
  g.fillRect(0, 0, VIEW_W, VIEW_H);

  // Subtle decorative grid in pan space (qb.java:710 backdrop feel while keeping pure black contrast)
  g.setColor(18, 28, 20);
  const gridOx = ((-Math.round(menu.camX * 0.4) % 30) + 30) % 30;
  const gridOy = ((-Math.round(menu.camY * 0.4) % 30) + 30) % 30;
  for (let x = gridOx; x < VIEW_W; x += 30) g.drawLine(x, 0, x, VIEW_H);
  for (let y = gridOy; y < VIEW_H; y += 30) g.drawLine(0, y, VIEW_W, y);

  // Port of qb.java:713-717 — Scrolling Credits (Rb == 15)
  if (menu.mode === 'credits') {
    const h = font.drawText(g, getCreditsText(), VIEW_W / 2, menu.creditsY, VIEW_W - 8, 2, 0);
    menu.creditsHeight = h;
    drawMenuFooterBar(g, sheets, VIEW_H - 22);
    font.drawText(g, font.tMain(16) || 'Thoát', VIEW_W / 2, VIEW_H - 17, -1, 2, 1);
    drawSoftkey(g, sheets, true, 1);
    return;
  }

  // Render hierarchical menu nodes (gb.java:265-977)
  const nodes = menu.nodes || [];
  const bgStrip = sheets.menuBtnBg;   // 60x60 (2 frames: 0=unselected, 1=selected)
  const icoStrip = sheets.menuIcons;  // 34x34
  const wepStrip = sheets.menuWeapons;// 44x44
  const arrStrip = sheets.menuArrows; // 26x26
  const lockSigns = sheets.menuSigns; // 12x12

  for (const node of nodes) {
    if (!node.visible) continue;
    const cx = Math.round(node.fx + menu.camX);
    const cy = Math.round(node.fy + menu.camY);
    const bw = bgStrip ? bgStrip.d : 60;
    const bh = bgStrip ? bgStrip.e : 60;
    const bx = cx - (bw >> 1);
    const by = cy - (bh >> 1);
    if (bx + bw < -10 || bx > VIEW_W + 10 || by + bh < -10 || by > VIEW_H + 10) continue;

    const isSel = node.id === menu.selectedId;
    if (bgStrip) {
      const prevComp = g.ctx.globalCompositeOperation;
      if (isSel) g.ctx.globalCompositeOperation = 'screen';
      bgStrip.b = isSel ? 1 : 0;
      bgStrip.setPos(bx, by);
      bgStrip.draw(g);
      g.ctx.globalCompositeOperation = prevComp;
    }

    // Directional cycle arrows on active option nodes (gb.java:428-439)
    if (isSel && node.cyclable && arrStrip) {
      const bounce = Math.round(Math.sin((state.tick || 0) * 0.35) * 2);
      const axOff = (bw >> 1) + 2 + bounce;
      arrStrip.b = 1; // left
      arrStrip.setPos(cx - axOff - arrStrip.d, cy - (arrStrip.e >> 1));
      arrStrip.draw(g);
      arrStrip.b = 3; // right
      arrStrip.setPos(cx + axOff, cy - (arrStrip.e >> 1));
      arrStrip.draw(g);
    }

    // Node inner icon: weapon/item/skill strip vs menuIcons
    if (node.kind === 'weapon' || node.kind === 'item') {
      if (wepStrip) {
        const wIdx = node.itemId;
        const unlocked = node.known !== false;
        wepStrip.b = unlocked ? wIdx + 2 : 1;
        wepStrip.setPos(bx + Math.floor((bw - wepStrip.d) / 2), by + Math.floor((bh - wepStrip.e) / 2));
        wepStrip.draw(g);
        if (node.count !== undefined && node.count !== 0) {
          font.drawSmallDigits(g, node.count === -1 ? '∞' : String(node.count), bx + bw - 6, by + bh - 14, 1);
        }
      }
    } else if (node.kind === 'skill') {
      if (wepStrip) {
        const sk = node.itemId;
        wepStrip.b = Math.max(0, (SKILL_SPRITE_ICO[sk] ?? 5) - 3);
        wepStrip.setPos(bx + Math.floor((bw - wepStrip.d) / 2), by + Math.floor((bh - wepStrip.e) / 2));
        wepStrip.draw(g);
      }
      if (sheets.skillsShevron) {
        sheets.skillsShevron.b = isSel ? 0 : 1;
        sheets.skillsShevron.setPos(bx + 32, by + 36);
        sheets.skillsShevron.draw(g);
      }
      const lvl = node.level ?? 0;
      const maxL = SKILL_MAX_LEVELS[node.itemId] ?? 1;
      font.drawText(g, `${lvl}/${maxL}`, bx + bw - 2, cy - Math.floor(font.height / 2), -1, 0, isSel ? 2 : 1);
    } else if (icoStrip && node.iconFrame >= 0) {
      const ix = bx + Math.floor((bw - icoStrip.d) / 2);
      const iy = by + Math.floor((bh - icoStrip.e) / 2);
      icoStrip.b = node.iconFrame;
      icoStrip.setPos(ix, iy);
      icoStrip.draw(g);

      // Settings badges matching gb.java:779-840
      if (node.badge === 'bot_diff' && sheets.iconsBot) {
        sheets.iconsBot.b = node.value || 0;
        sheets.iconsBot.setPos(ix + 14, iy + 14);
        sheets.iconsBot.draw(g);
      } else if (node.badge === 'vol' && (sheets.iconsVolOff || sheets.iconsVolDot)) {
        const v = node.value || 0;
        if (v === 0 && sheets.iconsVolOff) {
          g.drawImage(sheets.iconsVolOff.a, ix + 21, iy + 17, 0);
        } else if (sheets.iconsVolDot) {
          const pts = [[24, 4], [28, 14], [24, 24], [14, 28], [4, 24], [0, 14], [4, 4]];
          for (let d = 0; d < Math.min(v, pts.length); d++) {
            g.drawImage(sheets.iconsVolDot.a, ix + pts[d][0], iy + pts[d][1], 0);
          }
        }
      } else if (node.badge === 'tips_off' && !node.value && sheets.iconsTipOff) {
        g.drawImage(sheets.iconsTipOff.a, ix + 10, iy + 7, 0);
      } else if (node.badge === 'ff_on' && node.value && sheets.iconsFf) {
        g.drawImage(sheets.iconsFf.a, ix + 18, iy + 8, 0);
      } else if (node.badge === 'level_num') {
        font.drawText(g, String(node.value), cx - 1, cy - 5, -1, 2, isSel ? 0 : 1);
      } else if (node.badge === 'bots_num') {
        font.drawText(g, String(node.value), cx + 6, cy, -1, 2, isSel ? 0 : 1);
      }
    }

    if (node.disabled && lockSigns && node.kind !== 'weapon' && node.kind !== 'item' && node.kind !== 'skill') {
      lockSigns.b = 1;
      lockSigns.setPos(bx, by);
      lockSigns.draw(g);
    }

    // Node label (gb.java:941-973)
    if (node.label) {
      const tone = isSel && !node.disabled ? 0 : 1;
      if (node.vertical) {
        font.drawText(g, node.label, bx + bw - 5, cy - Math.floor(font.height / 2), -1, 0, tone);
      } else {
        font.drawText(g, node.label, cx + 2, by + bh + 1, -1, 2, tone);
      }
    }
  }

  // Shop/Workshop Bottom Header & Price Readout (qb.java:1018-1076)
  if (menu.mode === 'workshop') {
    const sel = nodes.find((n) => n.id === menu.selectedId);
    drawMenuFooterBar(g, sheets, VIEW_H - 36);
    const coins = menu.shopCoins ?? 0;
    font.drawText(g, `^40~${coins}`, 26, VIEW_H - 32, 110, 0, 2);
    if (menu.coinDeltaTimer > 0 && menu.lastCoinSpent > 0) {
      font.drawText(g, `^41~-${menu.lastCoinSpent}`, 26, VIEW_H - 46, -1, 0, 1);
    }
    if (sel) {
      let priceStr = '';
      if (sel.kind === 'weapon') {
        priceStr = `5${WEAPON_ICON_CODES[sel.itemId]} = ${WEAPON_PRICES[sel.itemId]}^41~`;
      } else if (sel.kind === 'item') {
        priceStr = `1${ITEM_ICON_CODES[sel.itemId]} = ${ITEM_PRICES[sel.itemId]}^41~`;
      } else if (sel.kind === 'skill') {
        priceStr = `${SKILL_COSTS[sel.itemId]}^41~`;
      }
      if (priceStr) {
        font.drawText(g, priceStr, VIEW_W - 4, VIEW_H - 30, -1, 1, 0);
      }
      const descTitle = sel.title || sel.label || '';
      if (descTitle) {
        font.drawText(g, descTitle, VIEW_W / 2, VIEW_H - 16, VIEW_W - 50, 2, 1);
      }
    }
    drawSoftkey(g, sheets, false, 0); // Enter/Inspect/Buy
    drawSoftkey(g, sheets, true, 1);  // Play/Back
    return;
  }

  // Standard Menu Bottom Hint + Softkeys (qb.java:1080-1093)
  const sel = nodes.find((n) => n.id === menu.selectedId);
  const hint = sel?.hint || font.tMain(3) || 'Chọn mục';
  drawMenuFooterBar(g, sheets, VIEW_H - 22);
  font.drawText(g, hint, VIEW_W / 2, VIEW_H - 17, VIEW_W - 48, 2, 1);
  if (menu.canGoBack) {
    drawSoftkey(g, sheets, false, 0);
    drawSoftkey(g, sheets, true, 1);
  } else {
    drawSoftkey(g, sheets, false, 0);
  }
}

/**
 * Port of tb.java:1-419 — Scrolling Story Briefing / Victory / Defeat / Workshop Item Info / Help Modal.
 */
export function renderModalBox(g, modal, assets, font) {
  const { sheets } = assets;
  g.setColor(0, 0, 0);
  g.fillRect(0, 0, VIEW_W, VIEW_H);

  // Top Header badge (bigIcons or pipyaka or weapon icon)
  let topY = 10;
  if (modal.badgeKind === 'weapon' && sheets.menuWeapons) {
    sheets.menuWeapons.b = modal.badgeFrame ?? 0;
    sheets.menuWeapons.setPos(Math.round((VIEW_W - sheets.menuWeapons.d) / 2), topY);
    sheets.menuWeapons.draw(g);
    topY += sheets.menuWeapons.e + 8;
  } else if (modal.badgeKind === 'pipyaka' && sheets.pipyaka) {
    sheets.pipyaka.b = 0;
    sheets.pipyaka.setPos(Math.round((VIEW_W - sheets.pipyaka.d) / 2), topY);
    sheets.pipyaka.draw(g);
    topY += sheets.pipyaka.e + 8;
  } else if (sheets.bigIcons) {
    sheets.bigIcons.b = modal.badgeFrame ?? 0; // 0=info/story, 1=lose, 3=win
    sheets.bigIcons.setPos(Math.round((VIEW_W - sheets.bigIcons.d) / 2), topY);
    sheets.bigIcons.draw(g);
    topY += sheets.bigIcons.e + 8;
  }

  const clipH = VIEW_H - topY - 26;
  const textBody = modal.lines ? modal.lines.join('\n') : (modal.text || '');
  g.setClip(6, topY, VIEW_W - 12, clipH);
  const totalH = font.drawText(g, textBody, modal.align === 2 ? VIEW_W / 2 : 10, topY - (modal.scrollY || 0), VIEW_W - 20, modal.align ?? 0, 0);
  g.setClip(0, 0, VIEW_W, VIEW_H);
  modal.maxScroll = Math.max(0, totalH - clipH + 8);

  drawMenuFooterBar(g, sheets, VIEW_H - 22);
  if (modal.maxScroll > 0 && sheets.smallArrows) {
    sheets.smallArrows.b = 0;
    sheets.smallArrows.setPos(VIEW_W / 2 - 6, VIEW_H - 15);
    sheets.smallArrows.draw(g);
    sheets.smallArrows.b = 1;
    sheets.smallArrows.setPos(VIEW_W / 2 + 2, VIEW_H - 15);
    sheets.smallArrows.draw(g);
  } else {
    font.drawText(g, modal.footerLabel || 'OK / Tiếp tục', VIEW_W / 2, VIEW_H - 17, VIEW_W - 48, 2, 1);
  }
  drawSoftkey(g, sheets, false, 0);
  if (modal.showCancel) {
    drawSoftkey(g, sheets, true, 1);
  }
}

/**
 * Port of fb.b(Graphics) (fb.java:5200-8951) — Layered 1:1 World, Entities, VFX, Offscreen Arrows & HUD.
 */
export function renderWorld(g, state, assets, font, asBackdrop = false) {
  const world = state.world;
  if (!world) return;
  const { sheets } = assets;

  if (world.modal && !asBackdrop) {
    renderModalBox(g, world.modal, assets, font);
    return;
  }

  const camX = Math.round(world.camX);
  const camY = Math.round(world.camY);

  g.setColor(0, 0, 0);
  g.fillRect(0, 0, VIEW_W, VIEW_H);

  // Tile viewport bounds
  const stX = Math.max(0, Math.floor(camX / 30));
  const stY = Math.max(0, Math.floor(camY / 30));
  const enX = Math.min(world.width, stX + Math.ceil(VIEW_W / 30) + 2);
  const enY = Math.min(world.height, stY + Math.ceil(VIEW_H / 30) + 2);

  // 1. Ground tiles (ground_grass.png)
  const gg = sheets.groundGrass;
  if (gg) {
    for (let y = stY; y < enY; y++) {
      for (let x = stX; x < enX; x++) {
        const t = world.tiles[x][y];
        if (t.b > 0) {
          gg.b = t.b - 1;
          gg.setPos(x * 30 - camX, y * 30 - camY);
          gg.draw(g);
        }
      }
    }
  }

  // 2. Persistent craters, blood pools & footprints (fb.Wd)
  for (const dec of world.decals) {
    const sx = Math.round(dec.x - camX);
    const sy = Math.round(dec.y - camY);
    if (sx < -40 || sx > VIEW_W + 40 || sy < -40 || sy > VIEW_H + 40) continue;
    const strip = sheets[dec.sheet];
    if (strip) {
      strip.b = dec.frame | 0;
      strip.setPos(sx - (strip.d >> 1), sy - (strip.e >> 1));
      strip.draw(g);
    }
  }

  // 3. Team pods under alive visible actors (fx/team_pods.png 36x24)
  const podStrip = sheets.teamPods;
  if (podStrip) {
    for (const actor of world.actors) {
      if (actor.dead || (actor.invisTicks > 0 && actor !== world.player)) continue;
      if (actor.dashing && actor.dashInvuln) continue;
      const sx = Math.round(actor.px / 10 - camX);
      const sy = Math.round(actor.py / 10 - camY);
      if (sx < -24 || sx > VIEW_W + 24 || sy < -24 || sy > VIEW_H + 24) continue;
      podStrip.b = world.isCampaign ? 9 + Math.max(0, actor.team) : (actor.team === 0 ? 7 : actor.team === 1 ? 2 : actor.team % 9);
      podStrip.setPos(sx - (podStrip.d >> 1), sy - Math.floor(podStrip.e / 3) + 2);
      podStrip.draw(g);
    }
  }

  // 4. CTF Flag bases (fx/ctf_flag_base.png 40x40)
  if (world.mode === 2 && world.flagBases && sheets.ctfFlagBase) {
    for (const base of world.flagBases) {
      const bx = base.tx * 30 + 15 - camX;
      const by = base.ty * 30 + 15 - camY;
      sheets.ctfFlagBase.b = base.team;
      sheets.ctfFlagBase.setPos(bx - (sheets.ctfFlagBase.d >> 1), by - (sheets.ctfFlagBase.e >> 1));
      sheets.ctfFlagBase.draw(g);
    }
  }

  // 5. Pickup shadows + CTF flag shadows
  const dropShadow = sheets.flashYellowSmall || sheets.shadowSmall;
  for (const pk of world.pickups) {
    if (pk.removed || pk.hideShadow) continue;
    const sx = Math.round(pk.x - camX);
    const sy = Math.round(pk.y - camY);
    if (dropShadow) {
      dropShadow.b = 0;
      dropShadow.setPos(sx - (dropShadow.d >> 1), sy - (dropShadow.e >> 1) + 8);
      dropShadow.draw(g);
    }
  }

  // 6. Y-Sorted Tile Column/Row Render Loop (Xe..Xe+Ze with 4-tile margin for tall houses/trees)
  const mStX = Math.max(0, stX - 3);
  const mStY = Math.max(0, stY - 3);
  const mEnX = Math.min(world.width, enX + 3);
  const mEnY = Math.min(world.height, enY + 3);

  // Build quick spatial index per row (keeps frame render O(N) & 100% deterministic Y-sorting)
  for (let y = mStY; y < mEnY; y++) {
    // 6a. Non-solid pickups (trampoline etc)
    for (const pk of world.pickups) {
      if (!pk.removed && !pk.raised && pk.ty === y && pk.tx >= mStX && pk.tx < mEnX) {
        drawPickup(g, pk, camX, camY, sheets, state.tick);
      }
    }

    // 6b. Background props (lb.e)
    for (let x = mStX; x < mEnX; x++) {
      for (const propIdx of world.tiles[x][y].e) {
        drawProp(g, world.props[propIdx], camX, camY, sheets);
      }
    }

    // 6c. Ground bombs/traps (hb where !flying)
    for (const bomb of world.bombs) {
      if (!bomb.removed && !bomb.flying && bomb.ty === y && bomb.tx >= mStX && bomb.tx < mEnX) {
        drawBomb(g, bomb, camX, camY, sheets);
      }
    }

    // 6d. Alive Characters at row y
    for (const actor of world.actors) {
      if (!actor.dead && actor.ty === y && actor.tx >= mStX && actor.tx < mEnX) {
        drawActor(g, actor, world, camX, camY, sheets, state.tick);
      }
    }

    // 6e. Capsule spawners hatches (sb)
    for (const sp of world.spawners) {
      if (sp.hasCapsule && sp.ty === y && sp.tx >= mStX && sp.tx < mEnX && sheets.spiderCapsule) {
        sheets.spiderCapsule.b = sp.capsuleFrame | 0;
        sheets.spiderCapsule.setPos(sp.tx * 30 - camX, sp.ty * 30 - camY);
        sheets.spiderCapsule.draw(g);
      }
    }

    // 6f. Raised pickups (coins, powerups, ammo boxes)
    for (const pk of world.pickups) {
      if (!pk.removed && pk.raised && pk.ty === y && pk.tx >= mStX && pk.tx < mEnX) {
        drawPickup(g, pk, camX, camY, sheets, state.tick);
      }
    }

    // 6g. Explosion blast wave tiles (p)
    for (const exp of world.explosions) {
      if (!exp.removed && exp.ty === y && exp.tx >= mStX && exp.tx < mEnX) {
        drawExplosionTile(g, exp, camX, camY, sheets);
      }
    }

    // 6h. CTF Flags (carrying or dropped)
    if (world.mode === 2 && world.flags) {
      for (const flag of world.flags) {
        if (Math.floor(flag.y / 30) === y) {
          drawCtfFlag(g, flag, camX, camY, sheets, state.tick);
        }
      }
    }

    // 6i. Obstacles pass 1 (!tallFront) + Foreground props (lb.f) + Obstacles pass 2 (tallFront gates)
    for (let x = mStX; x < mEnX; x++) {
      const obs = world.tiles[x][y].d;
      if (obs && !obs.removed && !obs.tallFront) {
        drawObstacle(g, obs, camX, camY, sheets);
      }
      for (const propIdx of world.tiles[x][y].f) {
        drawProp(g, world.props[propIdx], camX, camY, sheets);
      }
      if (obs && !obs.removed && obs.tallFront) {
        drawObstacle(g, obs, camX, camY, sheets);
      }
    }
  }

  // 7. Top pass: Tree Crowns (with original faux-3D parallax!), House Roofs, Dead Character Explosions, Flying Bombs, Particles & Floating Text
  for (let y = mStY; y < mEnY; y++) {
    for (let x = mStX; x < mEnX; x++) {
      const obs = world.tiles[x][y].d;
      if (!obs || obs.removed) continue;
      if (obs.hasRoof) {
        const roofStrip = obs.extra === 1 ? sheets.bombakaHouseTop : sheets.houseTop;
        if (roofStrip) {
          const [ox, oy] = OBSTACLE_OFFSETS[obs.type] || [0, 0];
          roofStrip.b = 0;
          roofStrip.setPos(obs.x + ox - camX, obs.y + oy - camY);
          roofStrip.draw(g);
        }
      }
      if (obs.hasCrown && sheets.treeCrowns) {
        // Port of fb.b(Graphics, j) (fb.java:759-835) tree crown + parallax canopy offset
        const oxOff = obs.extra - 1 === 7 ? -1 : 0;
        const oyOff = (obs.extra - 1 === 7 || obs.extra - 1 === 8) ? (obs.frame !== 0 ? -5 : 0) : 12;
        const cx = obs.x + 15 + oxOff;
        const cy = obs.y + 15 - 60 + oyOff;
        const crown = sheets.treeCrowns;
        crown.b = (obs.extra - 1 === 7 || obs.extra - 1 === 8) ? 1 : 0;
        const halfW = VIEW_W >> 1;
        const halfH = VIEW_H >> 1;
        const pDx = ((halfW - (cx - camX)) * 12) / halfW;
        const pDy = ((halfH - (cy - camY)) * 12) / halfH;
        crown.setPos(Math.round(cx - pDx - crown.d / 2 - camX), Math.round(cy - pDy - crown.e / 2 - camY));
        crown.draw(g);
      }
    }
  }

  // Airborne projectiles (rockets, thrown cannon/pineapple bombs)
  for (const bomb of world.bombs) {
    if (!bomb.removed && bomb.flying) {
      drawBomb(g, bomb, camX, camY, sheets);
    }
  }

  // Dying character death animations + HP/Armor pods
  for (const actor of world.actors) {
    if (actor.dead && actor.deathTimer > 0) {
      drawActor(g, actor, world, camX, camY, sheets, state.tick);
    } else if (!actor.dead && (!actor.invisTicks || actor === world.player)) {
      drawActorHpBar(g, actor, camX, camY, sheets);
    }
  }

  // Particles + Floating Text/Damage/Pickups (`w`)
  for (const pt of world.particles) {
    if (pt.removed) continue;
    const strip = sheets[pt.sheet];
    if (strip) {
      strip.b = pt.frame | 0;
      strip.setPos(Math.round(pt.x - camX - strip.d / 2), Math.round(pt.y - camY - strip.e / 2));
      strip.draw(g);
    }
  }
  for (const fx of world.floatingTexts) {
    const sx = Math.round(fx.x - camX);
    const sy = Math.round(fx.y - camY - fx.rise);
    font.drawText(g, fx.text, sx, sy, -1, 2, fx.tone || 2);
  }

  // Weather lightning flash & rain particles
  if (world.lightningFlash > 0) {
    g.setAlphaColor(255, 255, 255, Math.min(0.85, world.lightningFlash * 0.4));
    g.fillRect(0, 0, VIEW_W, VIEW_H);
  }

  // Cutscene black bars (ab.x)
  if (world.letterbox > 0) {
    g.setColor(0, 0, 0);
    g.fillRect(0, 0, VIEW_W, world.letterbox);
    g.fillRect(0, VIEW_H - world.letterbox, VIEW_W, world.letterbox);
    return;
  }

  if (asBackdrop) return;

  // Damage border pulse (Pd.Pb)
  if (world.player && world.player.hurtFlash > 0) {
    g.setAlphaColor(255, 40, 40, Math.min(0.45, world.player.hurtFlash * 0.12));
    g.fillRect(0, 0, VIEW_W, 4);
    g.fillRect(0, VIEW_H - 4, VIEW_W, 4);
    g.fillRect(0, 0, 4, VIEW_H);
    g.fillRect(VIEW_W - 4, 0, 4, VIEW_H);
  }

  // Offscreen Directional Edge Indicators for Enemies / Objectives / CTF Flags (fb.b bytecode 1168..1999)
  drawOffscreenIndicators(g, world, camX, camY, sheets, state.tick);

  // Killfeed / Announcement Banner (h.b(Graphics))
  if (world.killfeed.length > 0) {
    let ky = 4;
    for (const entry of world.killfeed) {
      font.drawText(g, entry.text, VIEW_W / 2, ky, VIEW_W - 12, 2, 0);
      ky += font.height + 1;
    }
  }

  // HUD Bottom-Left: Coins + Eggs (offset clear of Pause softkey at x=2..22, y=298..318) & Bottom-Right: Equipped Primary/Secondary Weapon Count
  const p = world.player;
  const hudBottomY = VIEW_H - 19;
  if (p) {
    font.drawText(g, `^41~${p.coins}`, 26, hudBottomY, -1, 0, 2);
    font.drawText(g, `^43~${p.items[5] ?? 0}`, 4, hudBottomY - 19, -1, 0, 0);

    if (p.primaryWeapon >= 0 && p.primaryWeapon < 14) {
      const pCount = p.weapons[p.primaryWeapon] ?? 0;
      const pLabel = `${WEAPON_ICON_CODES[p.primaryWeapon]}${pCount === -1 ? '∞' : pCount}`;
      font.drawText(g, pLabel, VIEW_W - 4, hudBottomY, -1, 1, 0);
    }
    if (p.secondaryWeapon >= 0) {
      const sCount = p.secondaryWeapon < 14 ? (p.weapons[p.secondaryWeapon] ?? 0) : (p.items[p.secondaryWeapon - 14] ?? 0);
      const sCode = p.secondaryWeapon < 14 ? WEAPON_ICON_CODES[p.secondaryWeapon] : ITEM_ICON_CODES[p.secondaryWeapon - 14];
      font.drawText(g, `${sCode}${sCount}`, VIEW_W - 4, hudBottomY - 19, -1, 1, 1);
    }
  }

  // Top-Left CTF Scores or Top-Right Arena Stats
  if (world.mode === 2 && !world.showLeaderboard) {
    font.drawText(g, `^16~${world.teamScores[0] || 0}`, 4, 24, -1, 0, 0);
    font.drawText(g, `^18~${world.teamScores[1] || 0}`, 4, 42, -1, 0, 0);
  }
  if (!world.isCampaign && !world.showLeaderboard && p) {
    font.drawText(g, `^9~${p.kills}`, VIEW_W - 4, 24, -1, 1, 0);
    font.drawText(g, `^39~${p.deaths}`, VIEW_W - 4, 42, -1, 1, 1);
    if (world.mode === 1) {
      font.drawText(g, `^20~${world.teamScores[p.team] || 0}`, VIEW_W - 4, 60, -1, 1, 2);
    }
  } else if (world.isCampaign) {
    const aliveEnemies = world.actors.filter((a) => !a.dead && a.team !== 0).length;
    const pendingEnemies = world.spawners.reduce((acc, s) => acc + Math.max(0, s.remaining), 0);
    const totalLeft = aliveEnemies + pendingEnemies;
    font.drawText(g, `^9~${totalLeft}`, VIEW_W - 4, 18, -1, 1, totalLeft === 0 ? 2 : 0);
  }

  // Leaderboard Overlay (fb.R, toggled with key `9` or when waiting to respawn)
  if (!world.isCampaign && world.showLeaderboard) {
    renderLeaderboard(g, world, sheets, font);
  }

  // Respawn countdown when MP player is dead
  if (!world.isCampaign && p && p.dead && p.respawnTimer > 0) {
    const secLeft = Math.ceil(p.respawnTimer / 25);
    font.drawBigDigits(g, String(secLeft), Math.floor(VIEW_W / 2) - 8, VIEW_H - 46);
  }

  // Softkeys: Left = Pause (2), Right = Switch/Cheat (#)
  drawSoftkey(g, sheets, false, 2);
}

function drawObstacle(g, obs, camX, camY, sheets) {
  const sheetMap = {
    0: sheets.walls,
    1: sheets.woodWalls,
    2: sheets.gates,
    3: obs.extra === 1 ? sheets.bombakaHouseBottom : sheets.houseBottom,
    4: sheets.treeStubs,
    5: sheets.well,
    7: sheets.box,
  };
  const strip = sheetMap[obs.type];
  if (!strip) return;
  const [ox, oy] = OBSTACLE_OFFSETS[obs.type] || [0, 0];
  strip.b = obs.frame | 0;
  strip.setPos(obs.x + (obs.jx || 0) + ox + (obs.shakeX || 0) - camX, obs.y + (obs.jy || 0) + oy + (obs.shakeY || 0) - camY);
  strip.draw(g);

  // Well bail bucket animation on type 5
  if (obs.type === 5 && sheets.wellBail) {
    sheets.wellBail.b = obs.bailFrame | 0;
    sheets.wellBail.setPos(obs.x - camX + 5, obs.y - camY + 15);
    sheets.wellBail.draw(g);
  }
}

function drawProp(g, prop, camX, camY, sheets) {
  if (!prop) return;
  const map = {
    2: sheets.bushesBig,
    3: sheets.bushesBananas,
    4: sheets.telegaBricks,
    5: sheets.ridge,
    6: sheets.stones30 || sheets.stones20,
  };
  const strip = map[prop.objType];
  if (!strip) return;
  strip.b = prop.objSub % Math.max(1, strip.h);
  strip.setPos(prop.px - (strip.d >> 1) - camX, prop.py - (strip.e >> 1) - camY);
  strip.draw(g);
}

function drawPickup(g, pk, camX, camY, sheets, tick) {
  const sx = Math.round(pk.x - camX);
  const sy = Math.round(pk.y - camY);
  let strip = sheets.coin;
  let frame = Math.floor(tick / 3) % 12;
  switch (pk.type) {
    case 1: strip = sheets.trampoline; frame = Math.floor(tick / 4) % (strip?.h || 8); break;
    case 2: strip = sheets.berserker; frame = Math.floor(tick / 3) % (strip?.h || 12); break;
    case 3: strip = sheets.invisible; frame = Math.floor(tick / 3) % (strip?.h || 12); break;
    case 4: strip = sheets.banana; frame = 0; break;
    case 5: strip = sheets.mine; frame = 0; break;
    case 7: strip = sheets.brick; frame = 0; break;
    case 8: strip = sheets.rabberMelon; frame = Math.floor(tick / 4) % 3; break;
    case 9: strip = sheets.melonThr; frame = Math.floor(tick / 4) % 3; break;
    case 10: strip = sheets.carrot; frame = 0; break;
    case 11: strip = sheets.melon; frame = 2; break;
    case 12: strip = sheets.kaska; frame = Math.floor(tick / 3) % (strip?.h || 12); break;
    case 13: strip = sheets.ananas; frame = 0; break;
    case 14: strip = sheets.bomb; frame = 1; break;
    case 15: strip = sheets.mine; frame = 0; break;
    case 16: strip = sheets.bag; frame = Math.floor(tick / 5) % 2; break;
    case 17: strip = sheets.coin; frame = Math.floor(tick / 2) % 12; break;
    default: break;
  }
  if (!strip) return;
  strip.b = frame % Math.max(1, strip.h);
  strip.setPos(sx - (strip.d >> 1), sy - (strip.e >> 1) - (pk.type === 1 ? 0 : 2));
  strip.draw(g);
}

function drawCtfFlag(g, flag, camX, camY, sheets, tick) {
  const sx = Math.round(flag.x - camX);
  const sy = Math.round(flag.y - camY);
  if (sheets.ctfFlag) {
    sheets.ctfFlag.b = flag.team;
    sheets.ctfFlag.setPos(sx - (sheets.ctfFlag.d >> 1), sy - (sheets.ctfFlag.e >> 1) - (flag.carrierId ? 18 : 6));
    sheets.ctfFlag.draw(g);
  }
}

function drawBomb(g, bomb, camX, camY, sheets) {
  const sx = Math.round(bomb.px / 10 - camX);
  const sy = Math.round(bomb.py / 10 - camY);
  const z = Math.round(bomb.pz / 10);
  if (sheets.shadowSmall) {
    sheets.shadowSmall.b = Math.min(3, Math.floor(z / 20));
    sheets.shadowSmall.setPos(sx - (sheets.shadowSmall.d >> 1), sy - (sheets.shadowSmall.e >> 1) + 5);
    sheets.shadowSmall.draw(g);
  }
  const map = {
    0: sheets.melon,
    1: sheets.melonHard,
    2: sheets.brick,
    3: sheets.melonThr,
    4: sheets.melonThrHard,
    5: sheets.rabberMelon,
    6: sheets.rabberMelonHard,
    7: sheets.ananas,
    8: sheets.ananasHard,
    9: sheets.sockWeapon,
    10: sheets.bananaSkin,
    11: sheets.rake,
    12: sheets.bomb,
    13: sheets.mine,
    '-4': sheets.spittleGum,
    '-5': sheets.cannonCore,
    '-6': sheets.rocket,
  };
  const strip = map[String(bomb.kind)] || sheets.melon;
  if (!strip) return;
  strip.b = bomb.frame % Math.max(1, strip.h);
  strip.setPos(sx - (strip.d >> 1), sy - z - (strip.e >> 1));
  strip.draw(g);
  if (bomb.kind === 12 && sheets.spark) {
    sheets.spark.b = Math.floor((bomb.fuse || 0) / 2) % sheets.spark.h;
    sheets.spark.setPos(sx - (sheets.spark.d >> 1) + 1, sy - z - 15 - (sheets.spark.e >> 1));
    sheets.spark.draw(g);
  }
}

function drawExplosionTile(g, exp, camX, camY, sheets) {
  const stripMap = {
    fire: sheets.explosionFire,
    melon: sheets.melonExplosion,
    melonHard: sheets.melonExplosionHard,
    ananas: sheets.ananasExploding,
    brick: sheets.brickExplosion,
    bomb: sheets.bombExplosion,
    gas: sheets.cloudGreenMedium,
  };
  const strip = stripMap[exp.style] || sheets.explosionFire;
  if (!strip) return;
  strip.b = Math.min(strip.h - 1, exp.frame | 0);
  strip.setPos(exp.tx * 30 + 15 - (strip.d >> 1) - camX, exp.ty * 30 + 15 - (strip.e >> 1) - camY);
  strip.draw(g);
}

function drawActor(g, actor, world, camX, camY, sheets, tick) {
  if (actor.invisTicks > 0 && actor !== world.player) return;
  const sx = Math.round(actor.px / 10 - camX);
  const sy = Math.round(actor.py / 10 - camY);
  const z = Math.round(actor.pz / 10);

  // Shadow (q.java:4482-4505)
  const sh = actor.charType === 2 ? sheets.shadowBig : actor.charType === 3 ? sheets.shadowMedium2 : sheets.shadowMedium;
  if (sh) {
    sh.b = actor.invisTicks > 0 ? 3 : Math.min(3, Math.floor(z / 20));
    sh.setPos(sx - (sh.d >> 1), sy + 7 - (sh.e >> 1));
    sh.draw(g);
  }

  // Dying / Spawning animation
  if (actor.dead) {
    const deathStrip = actor.charType === 0 ? sheets.pipyakaExplosion : actor.charType === 3 ? sheets.ulityakaExplosion : actor.charType === 9 ? sheets.spiderExploding : sheets.bombakaFlow;
    if (deathStrip) {
      deathStrip.b = Math.min(deathStrip.h - 1, Math.floor((actor.deathAnimIdx || 0)));
      deathStrip.setPos(sx - (deathStrip.d >> 1), sy - z - (deathStrip.e >> 1));
      deathStrip.draw(g);
    }
    return;
  }

  if (actor.spawning && sheets.bombakaSpawn) {
    const spStrip = actor.charType === 0 ? sheets.egg : sheets.bombakaSpawn;
    if (spStrip) {
      spStrip.b = Math.min(spStrip.h - 1, actor.spawnFrame | 0);
      spStrip.setPos(sx - (spStrip.d >> 1), sy - z - (spStrip.e >> 1));
      spStrip.draw(g);
    }
    return;
  }

  // Base character sprite
  const charMap = {
    0: sheets.pipyaka,
    1: sheets.bombaka,
    2: sheets.slonyaka || sheets.bombaka,
    3: sheets.ulityaka,
    4: sheets.cannon,
    5: sheets.bombaka,
    6: sheets.bombaka,
    7: sheets.bombaka,
    8: sheets.bombaka,
    9: sheets.spider,
  };
  const strip = charMap[actor.charType] || sheets.bombaka;
  if (strip && actor.invisTicks <= 0) {
    let frame = 0;
    const dirBase = actor.dir === 0 ? 12 : actor.dir === 1 ? 17 : actor.dir === 2 ? 22 : 27;
    if (actor.charType === 9) {
      frame = actor.dashing ? 6 : Math.floor(tick / 2) % 6;
    } else if (actor.charType === 3) {
      const uBase = actor.dir === 0 ? 12 : actor.dir === 1 ? 16 : actor.dir === 2 ? 20 : 24;
      frame = actor.moving ? uBase + (Math.floor(tick / 2) % 4) : (actor.dir * 3);
    } else if (actor.charType === 4) {
      frame = Math.min(strip.h - 1, actor.dir * 3);
    } else {
      frame = actor.moving ? dirBase + (Math.floor(tick / 2) % 5) : (actor.dir * 3);
    }
    strip.b = Math.max(0, Math.min(strip.h - 1, frame));
    strip.setPos(sx - (strip.d >> 1), sy - z - (strip.e >> 1));
    strip.draw(g);

    // Skins / Status gear overlays (l.java)
    const drawOverlay = (ovrStrip, dy = -12) => {
      if (!ovrStrip) return;
      ovrStrip.b = Math.min(ovrStrip.h - 1, frame);
      ovrStrip.setPos(sx - (ovrStrip.d >> 1), sy - z - (ovrStrip.e >> 1) + dy);
      ovrStrip.draw(g);
    };
    if (actor.charType === 5) drawOverlay(sheets.skinKamikadze, 0);
    if (actor.charType === 6) drawOverlay(sheets.skinRocketman, 0);
    if (actor.charType === 8) drawOverlay(sheets.skinMiner, 0);
    if (actor.berserkTicks > 0) drawOverlay(sheets.berserker, -13);
    if (actor.kaskaTicks > 0) drawOverlay(sheets.kaska, -10);
    if (actor.poisonTicks > 0 && sheets.skinSockHelm) drawOverlay(sheets.skinSockHelm, -10);
  }
}

function drawActorHpBar(g, actor, camX, camY, sheets) {
  if (actor.maxHp <= 0) return;
  const ratio = Math.max(0, Math.min(1, actor.hp / actor.maxHp));
  const sx = Math.round(actor.px / 10 - camX);
  const sy = Math.round(actor.py / 10 - Math.round(actor.pz / 10) - camY - 22);
  if (sx < -20 || sx > VIEW_W + 20 || sy < -20 || sy > VIEW_H + 20) return;

  const barW = 24;
  const lx = sx - (barW >> 1);
  g.setColor(20, 20, 20);
  g.fillRect(lx - 1, sy - 1, barW + 2, 5);
  const col = actor.team === 0 ? [95, 255, 95] : [255, 75, 75];
  g.setColor(col[0], col[1], col[2]);
  g.fillRect(lx, sy, Math.max(1, Math.round(barW * ratio)), 3);
  if (actor.hp > actor.maxHp) {
    const overW = Math.min(barW, Math.round(barW * ((actor.hp - actor.maxHp) / actor.maxHp)));
    g.setColor(90, 210, 255);
    g.fillRect(lx, sy, overW, 3);
  }
}

function drawOffscreenIndicators(g, world, camX, camY, sheets, tick) {
  const arrows = sheets.charArrows;
  if (!arrows) return;
  for (const a of world.actors) {
    if (a.dead || a === world.player || (a.invisTicks > 0 && a.team !== world.player?.team)) continue;
    const ax = Math.round(a.px / 10 - camX);
    const ay = Math.round(a.py / 10 - camY);
    if (ax >= 4 && ax <= VIEW_W - 4 && ay >= 4 && ay <= VIEW_H - 4) continue;
    const cx = Math.max(2, Math.min(VIEW_W - arrows.d - 2, ax - (arrows.d >> 1)));
    const cy = Math.max(2, Math.min(VIEW_H - arrows.e - 2, ay - (arrows.e >> 1)));
    arrows.b = a.team === 0 ? 7 : 2;
    arrows.setPos(cx, cy);
    arrows.draw(g);
  }
  if (world.mode === 2 && world.flags) {
    for (const f of world.flags) {
      const fx = Math.round(f.x - camX);
      const fy = Math.round(f.y - camY);
      if (fx >= 0 && fx <= VIEW_W && fy >= 0 && fy <= VIEW_H) continue;
      arrows.b = 20 + f.team;
      arrows.setPos(
        Math.max(2, Math.min(VIEW_W - arrows.d - 2, fx - (arrows.d >> 1))),
        Math.max(2, Math.min(VIEW_H - arrows.e - 2, fy - (arrows.e >> 1)))
      );
      arrows.draw(g);
    }
  }
}

function renderLeaderboard(g, world, sheets, font) {
  const sorted = [...world.actors]
    .filter((a) => a.isPlayerOrBot)
    .sort((a, b) => b.kills - a.kills || a.deaths - b.deaths);
  const rows = Math.min(8, Math.max(3, sorted.length + (world.isTeamMode ? 2 : 1)));
  const cols = 10;
  const bx = Math.round((VIEW_W - cols * 20) / 2);
  const by = Math.round((VIEW_H - rows * 20) / 2);
  drawFragswinBox(g, sheets.fragswin, bx, by, cols, rows);

  let cy = by + 10;
  if (world.isTeamMode) {
    font.drawText(g, `^7~${world.teamScores[0] || 0}`, bx + 12, cy, -1, 0, 0);
    font.drawText(g, `^2~${world.teamScores[1] || 0}`, bx + cols * 20 - 12, cy, -1, 1, 0);
    cy += 18;
  }
  for (const a of sorted) {
    const icon = `^${a.team === 0 ? 7 : 2}~ `;
    font.drawText(g, `${icon}${a.name || 'Bot'}`, bx + 12, cy, -1, 0, a === world.player ? 2 : 0);
    font.drawText(g, `${a.kills}/${a.deaths}`, bx + cols * 20 - 12, cy, -1, 1, 0);
    cy += 16;
  }
}

function getWeaponOrItemTitle(id, font) {
  const raw = font.workshopStrings[id + 1] || '';
  const firstLine = raw.split('\n')[0].trim();
  if (firstLine) return firstLine;
  const names = [
    'Dưa hấu xanh', 'Dưa hấu đỏ', 'Gạch ngói', 'Dưa xanh cao su', 'Dưa đỏ cao su',
    'Dưa lăn', 'Dưa lăn cải tiến', 'Dứa', 'Dứa rừng', 'Tất thối',
    'Vỏ chuối', 'Bừa cào', 'Bom', 'Bom bẫy',
    'Quả chuối', 'Mũ giác đấu', 'Mũ tàng hình', 'Mũ bảo vệ', 'Cà rốt', 'Trứng phục sinh',
  ];
  return names[id] || `#${id}`;
}

function getCreditsText() {
  return (
    'Pipyaki `2~PRO\n`0~version 1.1\n\n' +
    '`2~Directed by:\n`0~Pluschevsky Dmitry\nSlobodenyuk Sasha\n\n' +
    '`2~Produced by:\n`0~Pershakov Sergey\n\n' +
    '`2~Programmed by:\n`0~Rusyakin Vasily\nPershakov Sergey\nKarpushina Maria\n\n' +
    '`2~Art by:\n`0~Lyukshin Alexey\nOrlov Maxim\n\n' +
    '`2~Music by:\n`0~DJ Paul Mira\n\n' +
    '`2~Marketing by:\n`0~Kovalev Leonid\n\n' +
    '(c) 2010 DaSuppaStudios Ltd.\nWeb Port 1:1 Fidelity'
  );
}
