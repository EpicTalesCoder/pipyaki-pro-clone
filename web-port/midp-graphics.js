/**
 * MIDP lcdui.Graphics + Sprite Strip (pb.java) + Sequence Animator (nb.java)
 * Faithful 1:1 canvas 2D implementation of Pipyaki Pro J2ME rendering primitives.
 */

export const TOP = 16;
export const LEFT = 4;
export const RIGHT = 8;
export const BOTTOM = 32;
export const HCENTER = 1;
export const VCENTER = 2;

export const TRANS_NONE = 0;
export const TRANS_MIRROR_ROT180 = 1;
export const TRANS_MIRROR = 2;
export const TRANS_ROT180 = 3;
export const TRANS_MIRROR_ROT270 = 4;
export const TRANS_ROT90 = 5;
export const TRANS_ROT270 = 6;
export const TRANS_MIRROR_ROT90 = 7;

/**
 * Port of midp Graphics wrapper around 240x320 CanvasRenderingContext2D.
 */
export class MidpGraphics {
  constructor(ctx, width = 240, height = 320) {
    this.ctx = ctx;
    this.width = width;
    this.height = height;
    this.color = '#000000';
    this.clipped = false;
  }

  setColor(rOrRgb, g, b) {
    if (arguments.length === 1) {
      const rgb = (rOrRgb >>> 0) & 0xffffff;
      const r = (rgb >> 16) & 0xff;
      const gg = (rgb >> 8) & 0xff;
      const bb = rgb & 0xff;
      this.color = `rgb(${r},${gg},${bb})`;
    } else {
      this.color = `rgb(${rOrRgb & 255},${g & 255},${b & 255})`;
    }
    this.ctx.fillStyle = this.color;
    this.ctx.strokeStyle = this.color;
  }

  setAlphaColor(r, g, b, a) {
    this.color = `rgba(${r & 255},${g & 255},${b & 255},${a})`;
    this.ctx.fillStyle = this.color;
    this.ctx.strokeStyle = this.color;
  }

  reset() {
    this.setClip(0, 0, this.width, this.height);
    this.ctx.imageSmoothingEnabled = false;
  }

  drawRectMIDP(x, y, w, h) {
    const rx = Math.round(x);
    const ry = Math.round(y);
    const rw = Math.round(w);
    const rh = Math.round(h);
    if (rw <= 0 || rh <= 0) return;
    this.ctx.fillStyle = this.color;
    this.ctx.fillRect(rx, ry, rw, 1);
    this.ctx.fillRect(rx, ry + rh - 1, rw, 1);
    this.ctx.fillRect(rx, ry, 1, rh);
    this.ctx.fillRect(rx + rw - 1, ry, 1, rh);
  }

  fillRect(x, y, w, h) {
    if (w <= 0 || h <= 0) return;
    this.ctx.fillStyle = this.color;
    this.ctx.fillRect(Math.round(x), Math.round(y), Math.round(w), Math.round(h));
  }

  drawLine(x1, y1, x2, y2) {
    this.ctx.fillStyle = this.color;
    const rx1 = Math.round(x1);
    const ry1 = Math.round(y1);
    const rx2 = Math.round(x2);
    const ry2 = Math.round(y2);
    if (ry1 === ry2) {
      const lx = Math.min(rx1, rx2);
      const lw = Math.abs(rx2 - rx1) + 1;
      this.ctx.fillRect(lx, ry1, lw, 1);
      return;
    }
    if (rx1 === rx2) {
      const ty = Math.min(ry1, ry2);
      const lh = Math.abs(ry2 - ry1) + 1;
      this.ctx.fillRect(rx1, ty, 1, lh);
      return;
    }
    this.ctx.strokeStyle = this.color;
    this.ctx.lineWidth = 1;
    this.ctx.beginPath();
    this.ctx.moveTo(rx1 + 0.5, ry1 + 0.5);
    this.ctx.lineTo(rx2 + 0.5, ry2 + 0.5);
    this.ctx.stroke();
  }

  setClip(x, y, w, h) {
    if (this.clipped) {
      this.ctx.restore();
      this.clipped = false;
    }
    if (x <= 0 && y <= 0 && w >= this.width && h >= this.height) {
      return;
    }
    this.ctx.save();
    this.clipped = true;
    this.ctx.beginPath();
    this.ctx.rect(Math.round(x), Math.round(y), Math.round(w), Math.round(h));
    this.ctx.clip();
  }

  drawImage(img, x, y, anchor = 0) {
    if (!img) return;
    const w = img.width || 0;
    const h = img.height || 0;
    if (w <= 0 || h <= 0) return;
    let dx = Math.round(x);
    let dy = Math.round(y);
    if (anchor & HCENTER) dx -= (w >> 1);
    else if (anchor & RIGHT) dx -= w;
    if (anchor & VCENTER) dy -= (h >> 1);
    else if (anchor & BOTTOM) dy -= h;
    this.ctx.drawImage(img, dx, dy);
  }

  drawRegion(img, sx, sy, sw, sh, transform, dx, dy, anchor = 0) {
    if (!img || sw <= 0 || sh <= 0) return;
    const iw = img.width || 0;
    const ih = img.height || 0;
    if (sx < 0 || sy < 0 || sx + sw > iw || sy + sh > ih) return;
    const rx = Math.round(dx);
    const ry = Math.round(dy);
    const outW = transform >= 4 ? sh : sw;
    const outH = transform >= 4 ? sw : sh;
    let ox = rx;
    let oy = ry;
    if (anchor & HCENTER) ox -= (outW >> 1);
    else if (anchor & RIGHT) ox -= outW;
    if (anchor & VCENTER) oy -= (outH >> 1);
    else if (anchor & BOTTOM) oy -= outH;

    if (transform === TRANS_NONE) {
      this.ctx.drawImage(img, sx, sy, sw, sh, ox, oy, sw, sh);
      return;
    }

    const ctx = this.ctx;
    ctx.save();
    ctx.translate(ox + outW / 2, oy + outH / 2);
    switch (transform) {
      case TRANS_MIRROR:
        ctx.scale(-1, 1);
        break;
      case TRANS_ROT180:
        ctx.rotate(Math.PI);
        break;
      case TRANS_MIRROR_ROT180:
        ctx.scale(1, -1);
        break;
      case TRANS_ROT90:
        ctx.rotate(Math.PI / 2);
        break;
      case TRANS_ROT270:
        ctx.rotate(-Math.PI / 2);
        break;
      case TRANS_MIRROR_ROT90:
        ctx.scale(-1, 1);
        ctx.rotate(Math.PI / 2);
        break;
      case TRANS_MIRROR_ROT270:
        ctx.scale(-1, 1);
        ctx.rotate(-Math.PI / 2);
        break;
      default:
        break;
    }
    ctx.drawImage(img, sx, sy, sw, sh, -sw / 2, -sh / 2, sw, sh);
    ctx.restore();
  }
}

/**
 * Port of pb.java — Horizontal / 2D Sprite Strip.
 */
export class SpriteStrip {
  constructor(img, frameW, frameH) {
    this.a = img;
    this.d = frameW || (img ? img.width : 0);
    this.e = frameH || (img ? img.height : 0);
    this.b = 0; // current frame index
    this.c = 0; // Sprite transform
    this.f = 0; // draw x
    this.g = 0; // draw y
    if (img && this.d > 0 && this.e > 0) {
      this.cols = Math.max(1, Math.floor(img.width / this.d));
      this.rows = Math.max(1, Math.floor(img.height / this.e));
      this.h = this.cols * this.rows;
    } else {
      this.cols = 1;
      this.rows = 1;
      this.h = 1;
    }
  }

  setPos(x, y) {
    this.f = Math.round(x);
    this.g = Math.round(y);
  }

  draw(g, frameOverride = null) {
    if (!this.a || this.d <= 0 || this.e <= 0) return;
    const fIdx = Math.max(0, Math.min(this.h - 1, (frameOverride !== null ? frameOverride : this.b) | 0));
    const col = fIdx % this.cols;
    const row = Math.floor(fIdx / this.cols);
    g.drawRegion(
      this.a,
      col * this.d,
      row * this.e,
      this.d,
      this.e,
      this.c,
      this.f,
      this.g,
      0
    );
  }
}

/**
 * Port of nb.java — Sequence Frame Animator.
 */
export class SpriteAnim {
  constructor(strip) {
    this.b = strip;
    this.c = strip ? strip.d : 0;
    this.d = strip ? strip.e : 0;
    this.e = false; // playing
    this.f = 0; // tick accum
    this.g = null; // frame sequence
    this.h = false; // loop
    this.i = 0; // seq index
    this.j = 0; // current frame
    this.k = false; // alternate/bounce reverse flag
    this.l = false; // playing backwards
    this.m = false; // mirror/alt transform
    this.n = false; // bounce mode
    this.o = false; // pingpong dir
    this.p = 0; // frame delay in ticks
    this.q = 1; // step dir (+1 / -1)
    this.r = 0; // extra repeat counter
  }

  playRange(from, to, loop = false, reverse = false, delay = 0) {
    const start = from | 0;
    const end = to | 0;
    const len = Math.abs(end - start) + 1;
    const seq = new Array(len);
    const step = end >= start ? 1 : -1;
    for (let i = 0; i < len; i++) {
      seq[i] = start + i * step;
    }
    this.playSeq(seq, loop, reverse, delay);
  }

  playSeq(seq, loop = false, reverse = false, delay = 0) {
    if (!seq || seq.length === 0) return;
    this.g = seq;
    this.h = !!loop;
    this.n = false;
    this.l = !!reverse;
    this.p = delay | 0;
    this.f = 0;
    this.i = reverse ? seq.length - 1 : 0;
    this.j = seq[this.i];
    this.e = true;
  }

  playCustom(seq, from, to, startIdx, endIdx, loop, reverse, delay) {
    if (seq) {
      this.playSeq(seq, loop, reverse, delay);
    } else {
      this.playRange(startIdx, endIdx, loop, reverse, delay);
    }
  }

  stop() {
    this.e = false;
    this.f = 0;
  }

  tick() {
    if (!this.e || !this.g || this.g.length === 0) return;
    if (this.p > 0) {
      this.f++;
      if (this.f < this.p) return;
      this.f = 0;
    }
    if (this.l) {
      this.i--;
      if (this.i < 0) {
        if (this.h) {
          this.i = this.g.length - 1;
        } else {
          this.i = 0;
          this.e = false;
        }
      }
    } else {
      this.i++;
      if (this.i >= this.g.length) {
        if (this.h) {
          this.i = 0;
        } else {
          this.i = this.g.length - 1;
          this.e = false;
        }
      }
    }
    this.j = this.g[this.i];
  }

  draw(g, cx, cy, centered = true) {
    if (!this.b) return;
    this.b.b = this.j;
    this.b.c = 0;
    const dx = centered ? Math.round(cx - this.c / 2) : Math.round(cx);
    const dy = centered ? Math.round(cy - this.d / 2) : Math.round(cy);
    this.b.setPos(dx, dy);
    this.b.draw(g);
  }
}
