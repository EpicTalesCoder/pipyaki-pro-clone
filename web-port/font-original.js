/**
 * Port of b.java + ib.java — Original Pipyaki Pro Bitmap Font + Inline Icons + Vietnamese Localization.
 * Uses extracted assets:
 *  - assets/font/font.png, assets/font/font.txt, assets/font/font.cfg
 *  - assets/font/icons/ico0.png .. ico43.png (^0~ .. ^43~ inline icon codes)
 *  - assets/menu/digits.png (8x11 small weapon counts)
 *  - assets/font/numbers_big.png (14x17 HUD/countdown big numbers)
 * Renders Vietnamese diacritics cleanly atop font.png pixel glyphs via NFD decomposition.
 */

// Port of b.java:36-807, ib.java:1-49
const COLOR_DEFAULT = '#ffffff';
const COLOR_DIM = '#b8e094';
const COLOR_GOLD = '#ffd84d';
const RGB_DEFAULT = [255, 255, 255];
const RGB_DIM = [184, 224, 148];
const RGB_GOLD = [255, 216, 77];

export class PipyakiFontRenderer {
  constructor() {
    this.fontImg = null;
    this.fontDimImg = null;
    this.fontGoldImg = null;
    this.fontText = '';
    this.widths = [];
    this.offsets = [];
    this.charMap = new Map();
    this.height = 13;
    this.spaceWidth = 5;
    this.charSpacing = -2; // b.java:42 this.v = -2
    this.lineSpacing = 1;  // b.java:43 this.w = 1
    this.icons = [];
    this.digitsStrip = null;
    this.bigDigitsStrip = null;
    this.langStrings = [];
    this.workshopStrings = [];
    this.helpText = '';
    this.ready = false;
  }

  /**
   * Initialize from loaded image/buffer dictionary.
   */
  init({ fontImg, fontTxt, fontCfg, icons, digitsStrip, bigDigitsStrip, langTxt, workshopTxt, helpTxt }) {
    this.fontImg = fontImg;
    this.fontText = fontTxt.replace(/^\uFEFF/, '').replace(/[\r\n]+$/, '');
    this.widths = Array.from(fontCfg);
    this.height = fontImg ? fontImg.height : 13;
    this.offsets = [];
    this.charMap.clear();
    let x = 0;
    const count = Math.min(this.fontText.length, this.widths.length);
    for (let i = 0; i < count; i++) {
      const ch = this.fontText.charAt(i);
      this.offsets[i] = x;
      this.charMap.set(ch, i);
      x += this.widths[i];
    }
    this.icons = icons || [];
    this.digitsStrip = digitsStrip || null;
    this.bigDigitsStrip = bigDigitsStrip || null;

    if (fontImg && typeof document !== 'undefined') {
      this.fontDimImg = tintImage(fontImg, COLOR_DIM);
      this.fontGoldImg = tintImage(fontImg, COLOR_GOLD);
    } else {
      this.fontDimImg = fontImg;
      this.fontGoldImg = fontImg;
    }

    if (langTxt) {
      const clean = langTxt.replace(/^\uFEFF/, '').normalize('NFC');
      this.langStrings = clean.split(';');
    }
    if (workshopTxt) {
      this.workshopStrings = workshopTxt.replace(/^\uFEFF/, '').normalize('NFC').split(';').map((s) => s.trim());
    }
    if (helpTxt) {
      this.helpText = helpTxt.replace(/^\uFEFF/, '').normalize('NFC').trim();
    }
    this.ready = true;
  }

  /**
   * Port of ib.b(id) (id 0..63) and ib.c(id) (id >= 0 mapped to offset +64).
   */
  tMain(id) {
    return (this.langStrings[id] || '').trim();
  }

  tSub(id) {
    return (this.langStrings[id + 64] || '').trim();
  }

  getLineHeight() {
    return this.height;
  }

  getGlyphIndex(ch) {
    if (this.charMap.has(ch)) return this.charMap.get(ch);
    const decomp = splitBaseAndMarks(ch);
    if (decomp.base && this.charMap.has(decomp.base)) {
      return this.charMap.get(decomp.base);
    }
    return -1;
  }

  /**
   * Measure pixel width of a single line (supports ^id~ icon tags and `0~/`1~ color tags).
   */
  measureWidth(str) {
    if (!str) return 0;
    str = String(str).normalize('NFC');
    let w = 0;
    let i = 0;
    while (i < str.length) {
      const ch = str[i];
      if (ch === '^' || ch === '`') {
        const tilde = str.indexOf('~', i + 1);
        if (tilde !== -1) {
          const num = parseInt(str.slice(i + 1, tilde), 10);
          if (ch === '^' && !Number.isNaN(num) && this.icons[num]) {
            if (w > 0) w += this.charSpacing;
            w += this.icons[num].width;
          }
          i = tilde + 1;
          continue;
        }
      }
      if (ch === ' ') {
        if (w > 0) w += this.charSpacing;
        w += this.spaceWidth;
        i++;
        continue;
      }
      const gi = this.getGlyphIndex(ch);
      if (gi !== -1) {
        if (w > 0) w += this.charSpacing;
        w += this.widths[gi];
      } else if (ch >= '\u0020') {
        if (w > 0) w += this.charSpacing;
        w += 6;
      }
      i++;
    }
    return Math.max(0, w);
  }

  /**
   * Wrap text into lines respecting `\n` and pixel maxWidth (or -1 for single line).
   */
  wrapLines(str, maxWidth = -1) {
    if (!str) return [''];
    const paragraphs = String(str).normalize('NFC').split('\n');
    const out = [];
    for (const para of paragraphs) {
      if (maxWidth <= 0) {
        out.push(para);
        continue;
      }
      const words = para.split(' ');
      let cur = '';
      for (const word of words) {
        const candidate = cur ? `${cur} ${word}` : word;
        if (cur && this.measureWidth(candidate) > maxWidth) {
          out.push(cur);
          cur = word;
        } else {
          cur = candidate;
        }
      }
      out.push(cur);
    }
    return out;
  }

  measureHeight(str, maxWidth = -1) {
    const lines = this.wrapLines(str, maxWidth);
    return lines.length * (this.height + this.lineSpacing);
  }

  /**
   * Draw rich wrapped string with `^id~` icons & `` `0~ ``/`` `1~ `` color toggles.
   * align: 0 = left, 1 = right, 2 = center
   */
  drawText(g, str, x, y, maxWidth = -1, align = 0, defaultTone = 0) {
    if (!str && str !== 0) return 0;
    const text = String(str).normalize('NFC');
    const lines = this.wrapLines(text, maxWidth);
    let cy = Math.round(y);
    let tone = defaultTone; // 0 = white, 1 = dim green/gold, 2 = bright gold

    for (const line of lines) {
      const lineW = this.measureWidth(line);
      let cx = Math.round(x);
      if (align === 1) cx -= lineW;
      else if (align === 2) cx -= Math.floor(lineW / 2);

      let drewAny = false;
      let i = 0;
      while (i < line.length) {
        const ch = line[i];
        if (ch >= '\u0300' && ch <= '\u036f') {
          i++;
          continue;
        }
        if (ch === '^' || ch === '`') {
          const tilde = line.indexOf('~', i + 1);
          if (tilde !== -1) {
            const num = parseInt(line.slice(i + 1, tilde), 10);
            if (ch === '^') {
              const icon = this.icons[num];
              if (icon && g) {
                if (drewAny) cx += this.charSpacing;
                const iy = cy - Math.floor((icon.height - this.height) / 2) - 1;
                g.drawImage(icon, cx, iy, 0);
                cx += icon.width;
                drewAny = true;
              }
            } else if (!Number.isNaN(num)) {
              tone = num;
            }
            i = tilde + 1;
            continue;
          }
        }
        if (ch === ' ') {
          if (drewAny) cx += this.charSpacing;
          cx += this.spaceWidth;
          drewAny = true;
          i++;
          continue;
        }
        const decomp = splitBaseAndMarks(ch);
        const gi = this.getGlyphIndex(decomp.base);
        if (gi !== -1) {
          if (drewAny) cx += this.charSpacing;
          const gw = this.widths[gi];
          const gx = this.offsets[gi];
          const sheet = tone === 1 ? (this.fontDimImg || this.fontImg) : tone === 2 ? (this.fontGoldImg || this.fontImg) : this.fontImg;
          if (g && sheet) {
            g.drawRegion(sheet, gx, 0, gw, this.height, 0, cx, cy, 0);
            if (decomp.marks.length > 0 || decomp.strokeBar) {
              drawDiacritics(g, cx, cy, gw, this.height, decomp, tone === 1 ? RGB_DIM : tone === 2 ? RGB_GOLD : RGB_DEFAULT);
            }
          }
          cx += gw;
          drewAny = true;
        } else {
          if (drewAny) cx += this.charSpacing;
          if (g) {
            g.ctx.fillStyle = tone === 1 ? COLOR_DIM : tone === 2 ? COLOR_GOLD : COLOR_DEFAULT;
            g.ctx.font = 'bold 10px monospace';
            g.ctx.textBaseline = 'top';
            g.ctx.textAlign = 'left';
            g.ctx.fillText(ch, cx, cy + 1);
          }
          cx += 6;
          drewAny = true;
        }
        i++;
      }
      cy += this.height + this.lineSpacing;
    }
    return lines.length * (this.height + this.lineSpacing);
  }

  /**
   * Port of b.b(Graphics, String, x, y, align) — small numeric digits (menu/digits.png 8x11).
   */
  drawSmallDigits(g, str, x, y, align = 0) {
    if (!this.digitsStrip || !g) return;
    const text = String(str);
    const step = this.digitsStrip.d - 2; // 6px advance
    let dx = Math.round(x);
    if (align === 1) {
      dx -= text.length * this.digitsStrip.d - (text.length - 1) * 2;
    } else if (align === 2) {
      dx -= Math.floor((text.length * step) / 2);
    }
    for (let i = 0; i < text.length; i++) {
      const ch = text[i];
      let frame = -1;
      if (ch >= '0' && ch <= '9') frame = ch.charCodeAt(0) - 48;
      else if (ch === '+') frame = 10;
      else if (ch === '-') frame = 11;
      else if (ch === '/') frame = 12;
      if (frame !== -1) {
        this.digitsStrip.b = frame;
        this.digitsStrip.setPos(dx, y);
        this.digitsStrip.draw(g);
        dx += step;
      }
    }
  }

  /**
   * Port of b.c(Graphics, String, x, y, align) using numbers_big.png + inline icons.
   */
  drawBigDigits(g, str, x, y) {
    if (!this.bigDigitsStrip || !g) return;
    const text = String(str);
    let dx = Math.round(x);
    let dy = Math.round(y);
    let inIcon = false;
    let iconBuf = '';
    for (let i = 0; i < text.length; i++) {
      const ch = text[i];
      if (ch === '^') {
        inIcon = true;
        iconBuf = '';
        continue;
      }
      if (ch === '~') {
        inIcon = false;
        const idx = parseInt(iconBuf, 10);
        const ico = this.icons[idx];
        if (ico) {
          g.drawImage(ico, dx, dy - (ico.height >> 1), 0);
          dx += ico.width;
        }
        continue;
      }
      if (inIcon) {
        iconBuf += ch;
        continue;
      }
      this.bigDigitsStrip.b = ch === '0' ? 9 : Math.max(0, ch.charCodeAt(0) - 49);
      this.bigDigitsStrip.setPos(dx, dy);
      this.bigDigitsStrip.draw(g);
      dx += this.bigDigitsStrip.d - 4;
    }
  }
}

function tintImage(img, hexColor) {
  const c = document.createElement('canvas');
  c.width = img.width;
  c.height = img.height;
  const ctx = c.getContext('2d');
  ctx.imageSmoothingEnabled = false;
  ctx.drawImage(img, 0, 0);
  ctx.globalCompositeOperation = 'source-atop';
  ctx.fillStyle = hexColor;
  ctx.fillRect(0, 0, c.width, c.height);
  return c;
}

export function splitBaseAndMarks(ch) {
  if (!ch) return { base: '', marks: [], strokeBar: false, isUpper: false };
  if (ch === 'đ') return { base: 'd', marks: [], strokeBar: true, isUpper: false };
  if (ch === 'Đ') return { base: 'D', marks: [], strokeBar: true, isUpper: true };
  const nfd = ch.normalize('NFD');
  const base = nfd[0] || ch;
  const marks = [];
  for (let i = 1; i < nfd.length; i++) {
    marks.push(nfd[i]);
  }
  const isUpper = base >= 'A' && base <= 'Z';
  return { base, marks, strokeBar: false, isUpper };
}

function drawDiacritics(g, cx, cy, gw, gh, { base, marks, strokeBar, isUpper }, rgb) {
  const mx = cx + Math.floor(gw / 2);
  const putPx = (px, py, w = 1, h = 1) => {
    g.setColor(0, 0, 0);
    g.fillRect(px, py + 1, w, h);
    g.setColor(rgb[0], rgb[1], rgb[2]);
    g.fillRect(px, py, w, h);
  };
  if (strokeBar) {
    const by = isUpper ? cy + 5 : cy + 3;
    putPx(cx + (isUpper ? 1 : gw - 5), by, Math.max(3, gw - 3), 1);
  }
  const topY = isUpper ? cy - 2 : cy - 1;
  let hasBaseAccent = false;

  for (const m of marks) {
    if (m === '\u0302') {
      // Circumflex ^ (â, ê, ô)
      hasBaseAccent = true;
      putPx(mx - 1, topY - 1, 3, 1);
      putPx(mx - 2, topY, 1, 1);
      putPx(mx + 1, topY, 1, 1);
    } else if (m === '\u0306') {
      // Breve u (ă)
      hasBaseAccent = true;
      putPx(mx - 2, topY - 1, 1, 1);
      putPx(mx + 2, topY - 1, 1, 1);
      putPx(mx - 1, topY, 3, 1);
    } else if (m === '\u031b') {
      // Horn (ơ, ư)
      hasBaseAccent = true;
      putPx(cx + gw - 3, cy + 2, 2, 2);
    }
  }

  const toneY = hasBaseAccent ? topY - 3 : topY - 1;
  for (const m of marks) {
    if (m === '\u0301') {
      // Acute ´
      putPx(mx, toneY + 1, 1, 1);
      putPx(mx + 1, toneY, 2, 1);
    } else if (m === '\u0300') {
      // Grave `
      putPx(mx - 2, toneY, 2, 1);
      putPx(mx - 1, toneY + 1, 1, 1);
    } else if (m === '\u0309') {
      // Hook above ̉
      putPx(mx - 1, toneY, 2, 1);
      putPx(mx + 1, toneY + 1, 1, 1);
      putPx(mx, toneY + 2, 1, 1);
    } else if (m === '\u0303') {
      // Tilde ~
      putPx(mx - 2, toneY + 1, 2, 1);
      putPx(mx, toneY, 2, 1);
    } else if (m === '\u0323') {
      // Dot below .
      putPx(mx - 1, cy + gh - 2, 2, 2);
    }
  }
}
