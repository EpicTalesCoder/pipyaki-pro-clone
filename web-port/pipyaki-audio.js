/**
 * Port of ub.java & ab.h() — Web Audio MIDI Sequencer (MThd/MTrk decoder) + Game SFX Synth.
 * Plays original assets/midi/music_menu.mid, music_game0.mid, music_game1.mid
 * and authentic synthesized SFX for all J2ME sound slots (explosion, throw, pickup, pain, etc.).
 */

// Port of ub.java:1-286, ab.java:536-573
export class PipyakiAudio {
  constructor() {
    this.ctx = null;
    this.musicEnabled = true;
    this.sfxEnabled = true;
    this.musicVolume = 0.5;
    this.sfxVolume = 0.7;
    this.midiBuffers = {};
    this.parsedMidis = {};
    this.activeTrack = null;
    this.loopTimer = null;
    this.schedulerTimer = null;
    this.activeNotes = new Set();
    this.unlocked = false;
  }

  setMidiBuffers(buffers) {
    this.midiBuffers = buffers || {};
  }

  ensureContext() {
    if (this.ctx) {
      if (this.ctx.state === 'suspended') {
        this.ctx.resume().catch(() => {});
      }
      return this.ctx;
    }
    const AC = typeof window !== 'undefined' && (window.AudioContext || window.webkitAudioContext);
    if (!AC) return null;
    try {
      this.ctx = new AC();
      if (this.ctx.state === 'suspended') {
        this.ctx.resume().catch(() => {});
      }
      this.unlocked = true;
      return this.ctx;
    } catch {
      return null;
    }
  }

  unlock() {
    const ctx = this.ensureContext();
    if (ctx && this.activeTrack && !this.schedulerTimer && this.musicEnabled) {
      const t = this.activeTrack;
      this.activeTrack = null;
      this.playMidi(t);
    }
  }

  stopMidi() {
    this.activeTrack = null;
    if (this.schedulerTimer) {
      clearInterval(this.schedulerTimer);
      this.schedulerTimer = null;
    }
    for (const node of this.activeNotes) {
      try {
        node.stop();
        node.disconnect();
      } catch {}
    }
    this.activeNotes.clear();
  }

  playMidi(trackName) {
    if (!trackName || !this.musicEnabled || this.musicVolume <= 0) {
      this.stopMidi();
      this.activeTrack = trackName;
      return;
    }
    if (this.activeTrack === trackName && this.schedulerTimer) return;
    this.stopMidi();
    this.activeTrack = trackName;

    const bytes = this.midiBuffers[trackName];
    if (!bytes || !bytes.length) return;

    const ctx = this.ensureContext();
    if (!ctx) return;

    if (!this.parsedMidis[trackName]) {
      try {
        this.parsedMidis[trackName] = parseStandardMidi(bytes);
      } catch {
        return;
      }
    }
    const midi = this.parsedMidis[trackName];
    if (!midi || midi.events.length === 0) return;

    let cursor = 0;
    let songElapsed = 0;
    let lastTickAt = performance.now();
    const duration = Math.max(2, midi.durationSec);

    const scheduleStep = () => {
      if (!this.musicEnabled || this.activeTrack !== trackName || !this.ctx || this.ctx.state !== 'running') {
        lastTickAt = performance.now();
        return;
      }
      const nowMs = performance.now();
      const dtSec = Math.min(0.25, (nowMs - lastTickAt) / 1000);
      lastTickAt = nowMs;
      songElapsed += dtSec;

      if (songElapsed >= duration) {
        songElapsed %= duration;
        cursor = 0;
      }

      const lookAhead = songElapsed + 0.14;
      while (cursor < midi.events.length && midi.events[cursor].timeSec <= lookAhead) {
        const ev = midi.events[cursor++];
        const offset = Math.max(0, ev.timeSec - songElapsed);
        this.triggerMidiNote(ev, this.ctx.currentTime + offset);
      }
    };

    scheduleStep();
    this.schedulerTimer = setInterval(scheduleStep, 50);
  }

  triggerMidiNote(ev, when) {
    const ctx = this.ctx;
    if (!ctx) return;
    const isDrum = ev.channel === 9;
    const vol = this.musicVolume * (ev.velocity / 127) * (isDrum ? 0.11 : 0.09);
    if (vol <= 0.001) return;

    try {
      if (isDrum) {
        const osc = ctx.createOscillator();
        const gain = ctx.createGain();
        osc.type = ev.note < 40 ? 'sine' : 'triangle';
        const f0 = ev.note < 40 ? 110 : 280;
        osc.frequency.setValueAtTime(f0, when);
        osc.frequency.exponentialRampToValueAtTime(36, when + 0.08);
        gain.gain.setValueAtTime(vol, when);
        gain.gain.exponentialRampToValueAtTime(0.001, when + 0.09);
        osc.connect(gain).connect(ctx.destination);
        this.activeNotes.add(osc);
        osc.onended = () => this.activeNotes.delete(osc);
        osc.start(when);
        osc.stop(when + 0.1);
        return;
      }

      const freq = 440 * Math.pow(2, (ev.note - 69) / 12);
      const osc = ctx.createOscillator();
      const gain = ctx.createGain();
      const prog = ev.program || 0;
      osc.type = prog >= 80 ? 'square' : prog >= 24 && prog < 40 ? 'sawtooth' : 'triangle';
      osc.frequency.setValueAtTime(freq, when);
      const dur = Math.min(0.85, Math.max(0.06, ev.durSec));
      gain.gain.setValueAtTime(0.0005, when);
      gain.gain.linearRampToValueAtTime(vol, when + 0.01);
      gain.gain.exponentialRampToValueAtTime(0.0005, when + dur);
      osc.connect(gain).connect(ctx.destination);
      this.activeNotes.add(osc);
      osc.onended = () => this.activeNotes.delete(osc);
      osc.start(when);
      osc.stop(when + dur + 0.02);
    } catch {}
  }

  playSfx(name) {
    if (!this.sfxEnabled || this.sfxVolume <= 0) return;
    const ctx = this.ensureContext();
    if (!ctx || ctx.state !== 'running') return;
    const t = ctx.currentTime;
    const gVol = this.sfxVolume * 0.18;

    const tone = (type, fStart, fEnd, dur, volMul = 1) => {
      try {
        const o = ctx.createOscillator();
        const g = ctx.createGain();
        o.type = type;
        o.frequency.setValueAtTime(fStart, t);
        if (fEnd !== fStart) o.frequency.exponentialRampToValueAtTime(Math.max(20, fEnd), t + dur);
        g.gain.setValueAtTime(gVol * volMul, t);
        g.gain.exponentialRampToValueAtTime(0.001, t + dur);
        o.connect(g).connect(ctx.destination);
        o.start(t);
        o.stop(t + dur + 0.01);
      } catch {}
    };

    switch (name) {
      case 'menu_move': tone('sine', 520, 620, 0.04, 0.5); break;
      case 'menu_ok': tone('triangle', 580, 880, 0.08, 0.7); break;
      case 'denied': tone('sawtooth', 190, 120, 0.14, 0.7); break;
      case 'throw': tone('triangle', 320, 680, 0.09, 0.7); break;
      case 'bounce': tone('sine', 240, 480, 0.08, 0.6); break;
      case 'pickup': tone('triangle', 660, 1120, 0.12, 0.8); break;
      case 'buy': tone('square', 740, 1320, 0.14, 0.65); break;
      case 'heal': tone('sine', 440, 990, 0.22, 0.75); break;
      case 'pain': tone('sawtooth', 320, 140, 0.14, 0.7); break;
      case 'death': tone('sawtooth', 260, 55, 0.35, 0.85); break;
      case 'jump': tone('sine', 260, 590, 0.12, 0.6); break;
      case 'explosion': {
        try {
          const bufLen = Math.floor(ctx.sampleRate * 0.28);
          const buf = ctx.createBuffer(1, bufLen, ctx.sampleRate);
          const ch = buf.getChannelData(0);
          for (let i = 0; i < bufLen; i++) {
            ch[i] = (Math.random() * 2 - 1) * Math.exp(-i / (bufLen * 0.32));
          }
          const src = ctx.createBufferSource();
          src.buffer = buf;
          const filter = ctx.createBiquadFilter();
          filter.type = 'lowpass';
          filter.frequency.setValueAtTime(750, t);
          filter.frequency.exponentialRampToValueAtTime(90, t + 0.26);
          const g = ctx.createGain();
          g.gain.setValueAtTime(gVol * 1.4, t);
          g.gain.exponentialRampToValueAtTime(0.001, t + 0.28);
          src.connect(filter).connect(g).connect(ctx.destination);
          src.start(t);
        } catch {}
        tone('sine', 130, 38, 0.22, 1.0);
        break;
      }
      case 'step': tone('sine', 140, 90, 0.03, 0.22); break;
      default: tone('triangle', 440, 560, 0.05, 0.4); break;
    }
  }
}

/**
 * Lightweight Standard MIDI File (SMF Type 0 / Type 1) decoder returning sorted note events with wall-clock seconds.
 */
export function parseStandardMidi(bytes) {
  const u8 = bytes instanceof Uint8Array ? bytes : new Uint8Array(bytes);
  const view = new DataView(u8.buffer, u8.byteOffset, u8.byteLength);
  let pos = 0;
  const readStr = (n) => {
    let s = '';
    for (let i = 0; i < n; i++) s += String.fromCharCode(u8[pos + i]);
    pos += n;
    return s;
  };
  const readU32 = () => {
    const v = view.getUint32(pos, false);
    pos += 4;
    return v;
  };
  const readU16 = () => {
    const v = view.getUint16(pos, false);
    pos += 2;
    return v;
  };
  const readVarLen = (end) => {
    let val = 0;
    while (pos < end) {
      const b = u8[pos++];
      val = (val << 7) | (b & 0x7f);
      if (!(b & 0x80)) break;
    }
    return val;
  };

  if (readStr(4) !== 'MThd') return { events: [], durationSec: 0 };
  const hdrLen = readU32();
  const format = readU16();
  const nTracks = readU16();
  const division = readU16();
  pos = 8 + hdrLen;
  const tpq = division & 0x7fff || 120;

  const rawMsgs = [];
  for (let t = 0; t < nTracks && pos + 8 <= u8.length; t++) {
    const id = readStr(4);
    const len = readU32();
    const trackEnd = Math.min(u8.length, pos + len);
    if (id !== 'MTrk') {
      pos = trackEnd;
      continue;
    }
    let tick = 0;
    let runningStatus = 0;
    while (pos < trackEnd) {
      tick += readVarLen(trackEnd);
      if (pos >= trackEnd) break;
      let status = u8[pos];
      if (status < 0x80) {
        status = runningStatus;
      } else {
        pos++;
        if (status < 0xf0) runningStatus = status;
      }
      const cmd = status & 0xf0;
      const ch = status & 0x0f;
      if (status === 0xff) {
        const metaType = u8[pos++];
        const mLen = readVarLen(trackEnd);
        if (metaType === 0x51 && mLen === 3 && pos + 3 <= trackEnd) {
          const usPerBeat = (u8[pos] << 16) | (u8[pos + 1] << 8) | u8[pos + 2];
          rawMsgs.push({ tick, type: 'tempo', usPerBeat });
        }
        pos += mLen;
      } else if (status === 0xf0 || status === 0xf7) {
        const sLen = readVarLen(trackEnd);
        pos += sLen;
      } else if (cmd === 0xc0 || cmd === 0xd0) {
        const d1 = u8[pos++];
        if (cmd === 0xc0) rawMsgs.push({ tick, type: 'prog', channel: ch, program: d1 });
      } else {
        const d1 = u8[pos++];
        const d2 = u8[pos++];
        if (cmd === 0x90 && d2 > 0) {
          rawMsgs.push({ tick, type: 'on', channel: ch, note: d1, velocity: d2 });
        } else if (cmd === 0x80 || (cmd === 0x90 && d2 === 0)) {
          rawMsgs.push({ tick, type: 'off', channel: ch, note: d1 });
        }
      }
    }
    pos = trackEnd;
  }

  rawMsgs.sort((a, b) => a.tick - b.tick);
  let usPerBeat = 500000;
  let lastTick = 0;
  let timeSec = 0;
  const chanProg = new Array(16).fill(0);
  const openNotes = new Map();
  const noteEvents = [];

  for (const m of rawMsgs) {
    if (m.tick > lastTick) {
      timeSec += ((m.tick - lastTick) / tpq) * (usPerBeat / 1_000_000);
      lastTick = m.tick;
    }
    if (m.type === 'tempo') {
      usPerBeat = m.usPerBeat;
    } else if (m.type === 'prog') {
      chanProg[m.channel] = m.program;
    } else if (m.type === 'on') {
      const key = `${m.channel}:${m.note}`;
      const ev = {
        timeSec,
        durSec: 0.25,
        channel: m.channel,
        note: m.note,
        velocity: m.velocity,
        program: chanProg[m.channel],
      };
      openNotes.set(key, ev);
      noteEvents.push(ev);
    } else if (m.type === 'off') {
      const key = `${m.channel}:${m.note}`;
      const prev = openNotes.get(key);
      if (prev) {
        prev.durSec = Math.max(0.05, timeSec - prev.timeSec);
        openNotes.delete(key);
      }
    }
  }

  return { format, events: noteEvents, durationSec: timeSec + 0.25 };
}
