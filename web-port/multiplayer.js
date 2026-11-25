/**
 * Real-Time 2-4 Player Online Multiplayer Engine for Pipyaki Pro.
 * Quad Transport (cross-network, LAN, Vercel, Discord Activity, Local Multi-Tab):
 *  1) BroadcastChannel ('pk-mp-room-<code>', <2ms local multi-tab)
 *  2) SameOriginHttpRelay (/api/mp on Vercel / local server / Discord Activity)
 *  3) NtfyHttpsRelay (HTTPS/WSS fallback)
 *  4) MqttWssRelay (MQTT-over-WSS cross-instance bridge)
 */

export const ROOM_PREFIX = 'PK';
export const MAX_PLAYERS = 4;

const WSS_BROKERS = [
  'wss://broker.emqx.io:8084/mqtt',
  'wss://broker.hivemq.com:8884/mqtt',
];

function isDiscordActivity() {
  if (typeof window === 'undefined' || !window.location) return false;
  const host = window.location.hostname || '';
  return host.endsWith('.discordsays.com') || (window.location.search || '').includes('frame_id=');
}

function getMqttBrokers() {
  if (isDiscordActivity()) {
    const host = window.location.host;
    return [
      `wss://${host}/emqx/mqtt`,
      `wss://${host}/.proxy/emqx/mqtt`,
      `wss://${host}/hivemq/mqtt`,
    ];
  }
  return WSS_BROKERS;
}

function getNtfyEndpoints() {
  if (isDiscordActivity()) {
    return {
      httpBase: `${window.location.origin}/ntfy`,
      wsBase: `wss://${window.location.host}/ntfy`,
    };
  }
  return { httpBase: 'https://ntfy.sh', wsBase: 'wss://ntfy.sh' };
}

function mqttEncodeRemLen(len) {
  const out = [];
  do {
    let b = len % 128;
    len = Math.floor(len / 128);
    if (len > 0) b |= 0x80;
    out.push(b);
  } while (len > 0);
  return out;
}

function mqttEncodeStr(str) {
  const bytes = new TextEncoder().encode(str);
  return [(bytes.length >> 8) & 0xff, bytes.length & 0xff, ...bytes];
}

function mqttConnectPacket(clientId) {
  const vh = [...mqttEncodeStr('MQTT'), 4, 0x02, 0, 45];
  const pl = mqttEncodeStr(clientId);
  return new Uint8Array([0x10, ...mqttEncodeRemLen(vh.length + pl.length), ...vh, ...pl]);
}

function mqttSubscribePacket(pid, topic) {
  const vh = [(pid >> 8) & 0xff, pid & 0xff];
  const pl = [...mqttEncodeStr(topic), 0];
  return new Uint8Array([0x82, ...mqttEncodeRemLen(vh.length + pl.length), ...vh, ...pl]);
}

function mqttPublishPacket(topic, text) {
  const t = mqttEncodeStr(topic);
  const p = Array.from(new TextEncoder().encode(text));
  return new Uint8Array([0x30, ...mqttEncodeRemLen(t.length + p.length), ...t, ...p]);
}

class MqttSingleBroker {
  constructor(url, subTopic, pubTopic, { onReady, onMessage } = {}) {
    this.url = url;
    this.subTopic = subTopic;
    this.pubTopic = pubTopic;
    this.onReady = onReady;
    this.onMessage = onMessage;
    this.ws = null;
    this.ready = false;
    this.closed = false;
    this.pingTimer = null;
    this.retryTimer = null;
    this.nextPid = 1;
    this._connect();
  }

  _connect() {
    if (this.closed || typeof WebSocket === 'undefined') return;
    this.ready = false;
    let ws;
    try {
      ws = new WebSocket(this.url, 'mqtt');
      ws.binaryType = 'arraybuffer';
    } catch {
      this._scheduleRetry();
      return;
    }
    this.ws = ws;
    ws.onopen = () => {
      if (this.closed || this.ws !== ws) return;
      const cid = `pk_${Math.random().toString(36).slice(2, 10)}`;
      try {
        ws.send(mqttConnectPacket(cid));
      } catch {
        this._scheduleRetry();
      }
    };
    ws.onmessage = (ev) => {
      if (this.closed || this.ws !== ws) return;
      const u8 = ev.data instanceof ArrayBuffer ? new Uint8Array(ev.data) : null;
      if (!u8 || u8.length < 2) return;
      let offset = 0;
      while (offset + 2 <= u8.length) {
        const header = u8[offset];
        const pktType = header >> 4;
        let mult = 1;
        let rem = 0;
        let idx = offset + 1;
        let lenDone = false;
        while (idx < u8.length) {
          const b = u8[idx++];
          rem += (b & 127) * mult;
          if ((b & 128) === 0) {
            lenDone = true;
            break;
          }
          mult *= 128;
        }
        if (!lenDone || idx + rem > u8.length) break;
        if (pktType === 2) {
          ws.send(mqttSubscribePacket(this.nextPid++, this.subTopic));
          this.ready = true;
          this.onReady?.();
          if (this.pingTimer) clearInterval(this.pingTimer);
          this.pingTimer = setInterval(() => {
            if (!this.closed && this.ws === ws && ws.readyState === WebSocket.OPEN) {
              try { ws.send(new Uint8Array([0xc0, 0x00])); } catch {}
            }
          }, 22000);
        } else if (pktType === 3) {
          const tLen = (u8[idx] << 8) | u8[idx + 1];
          const qos = (header >> 1) & 3;
          const pStart = idx + 2 + tLen + (qos > 0 ? 2 : 0);
          const pEnd = idx + rem;
          if (pStart <= pEnd) {
            const payload = new TextDecoder().decode(u8.subarray(pStart, pEnd));
            try {
              this.onMessage?.(JSON.parse(payload));
            } catch {}
          }
        }
        offset = idx + rem;
      }
    };
    ws.onerror = () => {};
    ws.onclose = () => {
      this.ready = false;
      if (this.pingTimer) { clearInterval(this.pingTimer); this.pingTimer = null; }
      if (!this.closed && this.ws === ws) this._scheduleRetry();
    };
  }

  _scheduleRetry() {
    if (this.closed) return;
    if (this.retryTimer) clearTimeout(this.retryTimer);
    this.retryTimer = setTimeout(() => this._connect(), 2600);
  }

  send(packet) {
    if (!this.ready || !this.ws || this.ws.readyState !== WebSocket.OPEN) return false;
    try {
      this.ws.send(mqttPublishPacket(this.pubTopic, JSON.stringify(packet)));
      return true;
    } catch {
      return false;
    }
  }

  close() {
    this.closed = true;
    this.ready = false;
    if (this.pingTimer) { clearInterval(this.pingTimer); this.pingTimer = null; }
    if (this.retryTimer) { clearTimeout(this.retryTimer); this.retryTimer = null; }
    try { this.ws?.close(); } catch {}
    this.ws = null;
  }
}

class MqttWssRelay {
  constructor(subTopic, pubTopic, { onReady, onMessage } = {}) {
    this.closed = false;
    this.seen = new Set();
    let notified = false;
    const handleMsg = (pkt) => {
      if (!pkt || this.closed) return;
      const key = `${pkt._from || ''}:${pkt._seq || 0}:${pkt.type || ''}`;
      if (this.seen.has(key)) return;
      this.seen.add(key);
      if (this.seen.size > 400) {
        this.seen.delete(this.seen.values().next().value);
      }
      onMessage?.(pkt);
    };
    this.brokers = getMqttBrokers().map((url) =>
      new MqttSingleBroker(url, subTopic, pubTopic, {
        onReady: () => {
          if (!notified) {
            notified = true;
            onReady?.();
          }
        },
        onMessage: handleMsg,
      })
    );
  }

  get ready() {
    return this.brokers.some((b) => b.ready);
  }

  send(packet) {
    let ok = false;
    for (const b of this.brokers) {
      if (b.send(packet)) ok = true;
    }
    return ok;
  }

  close() {
    this.closed = true;
    for (const b of this.brokers) b.close();
  }
}

class NtfyHttpsRelay {
  constructor(subTopic, pubTopic, { onReady, onMessage } = {}) {
    this.subTopic = subTopic;
    this.pubTopic = pubTopic;
    this.onReady = onReady;
    this.onMessage = onMessage;
    this.ws = null;
    this.ready = false;
    this.closed = false;
    this.retryTimer = null;
    this.endpoints = getNtfyEndpoints();
    this._connect();
  }

  _connect() {
    if (this.closed || typeof WebSocket === 'undefined') return;
    this.ready = false;
    let ws;
    try {
      ws = new WebSocket(`${this.endpoints.wsBase}/${encodeURIComponent(this.subTopic)}/ws`);
    } catch {
      this._scheduleRetry();
      return;
    }
    this.ws = ws;
    ws.onopen = () => {
      if (this.closed || this.ws !== ws) return;
      this.ready = true;
      this.onReady?.();
    };
    ws.onmessage = (ev) => {
      if (this.closed || this.ws !== ws) return;
      try {
        const frame = JSON.parse(String(ev.data || ''));
        if (frame?.event === 'message' && typeof frame.message === 'string') {
          this.onMessage?.(JSON.parse(frame.message));
        }
      } catch {}
    };
    ws.onerror = () => {};
    ws.onclose = () => {
      this.ready = false;
      if (!this.closed && this.ws === ws) this._scheduleRetry();
    };
  }

  _scheduleRetry() {
    if (this.closed) return;
    if (this.retryTimer) clearTimeout(this.retryTimer);
    this.retryTimer = setTimeout(() => this._connect(), 2600);
  }

  send(packet) {
    if (this.closed || typeof fetch === 'undefined') return false;
    try {
      fetch(`${this.endpoints.httpBase}/${encodeURIComponent(this.pubTopic)}`, {
        method: 'POST',
        body: JSON.stringify(packet),
      }).catch(() => {});
      return true;
    } catch {
      return false;
    }
  }

  close() {
    this.closed = true;
    this.ready = false;
    if (this.retryTimer) { clearTimeout(this.retryTimer); this.retryTimer = null; }
    try { this.ws?.close(); } catch {}
    this.ws = null;
  }
}

class SameOriginHttpRelay {
  constructor(roomCode, subDir, pubDir, clientId, { onReady, onMessage } = {}) {
    this.roomCode = roomCode;
    this.subDir = subDir;
    this.pubDir = pubDir;
    this.clientId = clientId;
    this.onReady = onReady;
    this.onMessage = onMessage;
    this.ready = false;
    this.closed = false;
    this.afterSeq = 0;
    this.afterSnapSeq = 0;
    this.pollTimer = null;
    this.endpoints =
      typeof window !== 'undefined' && window.location?.origin?.startsWith('http')
        ? (isDiscordActivity()
          ? [`${window.location.origin}/api/mp`, `${window.location.origin}/.proxy/api/mp`]
          : [`${window.location.origin}/api/mp`])
        : [];
    this.endpointIdx = 0;
    this.endpoint = this.endpoints[0] || '';
    if (this.endpoint && typeof fetch !== 'undefined') this._poll();
  }

  async _poll() {
    if (this.closed || !this.endpoint) return;
    let nextDelay = 120;
    try {
      const url = `${this.endpoint}?room=${encodeURIComponent(this.roomCode)}&dir=${this.subDir}&after=${this.afterSeq}&afterSnap=${this.afterSnapSeq}&from=${encodeURIComponent(this.clientId)}`;
      const res = await fetch(url, { cache: 'no-store' });
      if (this.closed) return;
      if (res.ok) {
        const data = await res.json();
        if (data?.ok) {
          if (!this.ready) {
            this.ready = true;
            this.onReady?.();
          }
          if (Array.isArray(data.msgs)) {
            for (const m of data.msgs) {
              if (m.seq > this.afterSeq) this.afterSeq = m.seq;
              if (m.packet) this.onMessage?.(m.packet);
            }
          }
          if (data.snap && data.snap.seq > this.afterSnapSeq) {
            this.afterSnapSeq = data.snap.seq;
            if (data.snap.packet) this.onMessage?.(data.snap.packet);
          }
        }
      } else {
        if (this.endpointIdx + 1 < this.endpoints.length) {
          this.endpointIdx++;
          this.endpoint = this.endpoints[this.endpointIdx];
          nextDelay = 150;
        } else {
          nextDelay = 1800;
        }
      }
    } catch {
      nextDelay = 1800;
    }
    if (!this.closed) {
      this.pollTimer = setTimeout(() => this._poll(), nextDelay);
    }
  }

  send(packet) {
    if (this.closed || !this.endpoint || typeof fetch === 'undefined') return false;
    try {
      fetch(this.endpoint, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({
          room: this.roomCode,
          dir: this.pubDir,
          from: this.clientId,
          packet,
        }),
      }).catch(() => {});
      return true;
    } catch {
      return false;
    }
  }

  close() {
    this.closed = true;
    this.ready = false;
    if (this.pollTimer) { clearTimeout(this.pollTimer); this.pollTimer = null; }
  }
}

export function generateRoomCode() {
  return `${ROOM_PREFIX}${1000 + Math.floor(Math.random() * 9000)}`;
}

export function normalizeRoomCode(raw) {
  const clean = String(raw || '').toUpperCase().replace(/[^0-9A-Z]/g, '');
  if (!clean) return '';
  if (/^\d{4}$/.test(clean)) return `${ROOM_PREFIX}${clean}`;
  if (clean.length >= 4 && clean.length <= 8) return clean;
  return '';
}

export class MultiplayerClient {
  constructor(callbacks = {}) {
    this.callbacks = callbacks;
    this.clientId = `pk_${Math.random().toString(36).slice(2, 10)}`;
    this.role = null; // 'host' | 'guest' | null
    this.roomCode = '';
    this.connected = false;
    this.transport = '';
    this.statusNote = '';

    this.bc = null;
    this.apiRelay = null;
    this.ntfyRelay = null;
    this.relay = null;
    this._seqOut = 0;
    this._seenMsgs = new Set();
    this._hostBeaconTimer = null;
    this._joinRetryTimer = null;
    this._countdownTimer = null;
    this._lastRelaySnapAt = 0;
    this._lastApiSnapAt = 0;
    this._lastNtfySnapAt = 0;

    this.lobby = {
      roomCode: '',
      mode: 0, // 0=DM, 1=TM, 2=CTF
      mapIdx: 0,
      mapName: 'dm_crossroad',
      botCount: 2,
      botDifficulty: 1,
      scoreLimit: 10,
      friendlyFire: false,
      players: [],
      status: 'idle', // 'idle' | 'lobby' | 'countdown' | 'playing'
      countdown: 0,
    };
  }

  getMyPlayer() {
    return this.lobby.players.find((p) => p.clientId === this.clientId) || null;
  }

  getLocalActorId() {
    const me = this.getMyPlayer();
    return me ? me.slot + 1 : 1;
  }

  isRoomActive() {
    return this.role === 'host' || this.role === 'guest';
  }

  emitLobby() {
    this.callbacks.onLobbyChange?.({
      ...this.lobby,
      players: this.lobby.players.map((p) => ({ ...p })),
      role: this.role,
      clientId: this.clientId,
      connected: this.connected,
      transport: this.transport,
      statusNote: this.statusNote,
    });
  }

  sendRaw(msg) {
    const packet = { ...msg, _from: this.clientId, _role: this.role, _seq: ++this._seqOut };
    let sent = false;
    if (this.bc) {
      try { this.bc.postMessage(packet); sent = true; } catch {}
    }
    if (this.relay?.ready) {
      if (msg.type === 'snap') {
        const now = Date.now();
        if (now - this._lastRelaySnapAt >= 65) {
          this._lastRelaySnapAt = now;
          if (this.relay.send(packet)) sent = true;
        }
      } else if (this.relay.send(packet)) {
        sent = true;
      }
    }
    if (this.apiRelay?.ready) {
      if (msg.type === 'snap') {
        const now = Date.now();
        if (now - this._lastApiSnapAt >= 75) {
          this._lastApiSnapAt = now;
          if (this.apiRelay.send(packet)) sent = true;
        }
      } else if (this.apiRelay.send(packet)) {
        sent = true;
      }
    }
    if (this.ntfyRelay && !this.ntfyRelay.closed) {
      if (msg.type === 'snap') {
        const now = Date.now();
        if (now - this._lastNtfySnapAt >= 200) {
          this._lastNtfySnapAt = now;
          if (this.ntfyRelay.send(packet)) sent = true;
        }
      } else if (this.ntfyRelay.send(packet)) {
        sent = true;
      }
    }
    return sent;
  }

  _wireRelays(code, isHost, onPacketReady, onJoinBeacon) {
    const subDir = isHost ? 'c2h' : 'h2c';
    const pubDir = isHost ? 'h2c' : 'c2h';
    const inDiscord = isDiscordActivity();

    const acceptMsg = (msg, transportLabel) => {
      if (!msg || msg._from === this.clientId) return;
      if (!isHost && msg._role !== 'host') return;
      const dedupeKey = `${msg._from || ''}:${msg._seq || 0}:${msg.type || ''}`;
      if (this._seenMsgs.has(dedupeKey)) return;
      this._seenMsgs.add(dedupeKey);
      if (this._seenMsgs.size > 600) {
        this._seenMsgs.delete(this._seenMsgs.values().next().value);
      }

      if (!isHost && msg.type === 'hostBeacon') {
        if (!this.connected) onJoinBeacon?.();
        return;
      }
      if (!this.connected) {
        this.connected = true;
        this.transport = this.transport === 'Local Tab' ? 'Local Tab' : transportLabel;
        this.statusNote = '';
        this._clearJoinRetry();
      }
      this.handleMessage(msg);
    };

    if (typeof BroadcastChannel !== 'undefined') {
      this.bc = new BroadcastChannel(`pk-mp-room-${code}`);
      this.bc.onmessage = (ev) => acceptMsg(ev.data, 'Local Tab');
    }

    const apiLabel = inDiscord ? 'Discord API' : 'Cloud API';
    this.apiRelay = new SameOriginHttpRelay(code, subDir, pubDir, this.clientId, {
      onReady: () => {
        this.transport = this.transport || apiLabel;
        onPacketReady?.();
      },
      onMessage: (msg) => acceptMsg(msg, apiLabel),
    });

    const ntfyLabel = inDiscord ? 'Discord HTTPS' : 'Cloud HTTPS';
    this.ntfyRelay = new NtfyHttpsRelay(`pk_v1_${code}_${subDir}`, `pk_v1_${code}_${pubDir}`, {
      onReady: () => {
        this.transport = this.transport || ntfyLabel;
        onPacketReady?.();
      },
      onMessage: (msg) => acceptMsg(msg, ntfyLabel),
    });

    const mqttLabel = inDiscord ? 'Discord WSS' : 'Cloud WSS';
    this.relay = new MqttWssRelay(`bltts/mp/v2/${code}/${subDir}`, `bltts/mp/v2/${code}/${pubDir}`, {
      onReady: () => {
        if (!this.transport || this.transport === ntfyLabel) this.transport = mqttLabel;
        onPacketReady?.();
      },
      onMessage: (msg) => acceptMsg(msg, mqttLabel),
    });
  }

  _clearJoinRetry() {
    if (this._joinRetryTimer) { clearInterval(this._joinRetryTimer); this._joinRetryTimer = null; }
  }

  _clearHostBeacon() {
    if (this._hostBeaconTimer) { clearInterval(this._hostBeaconTimer); this._hostBeaconTimer = null; }
  }

  cancelCountdown() {
    if (this._countdownTimer) {
      clearInterval(this._countdownTimer);
      this._countdownTimer = null;
    }
    if (this.lobby.status === 'countdown') {
      this.lobby.status = 'lobby';
      this.lobby.countdown = 0;
    }
  }

  createRoom(hostName = 'Pipyaka', config = {}) {
    this.leaveRoom();
    const code = generateRoomCode();
    const cleanName = String(hostName || '').trim().slice(0, 12) || 'Pipyaka';
    const mode = Math.max(0, Math.min(2, config.mode ?? 0));
    const mapIdx = Math.max(0, config.mapIdx ?? 0);
    const mapName = config.mapName || 'dm_crossroad';

    this.role = 'host';
    this.roomCode = code;
    this.statusNote = '';
    this.lobby = {
      roomCode: code,
      mode,
      mapIdx,
      mapName,
      botCount: Math.max(0, Math.min(3, config.botCount ?? 2)),
      botDifficulty: Math.max(0, Math.min(2, config.botDifficulty ?? 1)),
      scoreLimit: Math.max(1, Math.min(50, config.scoreLimit ?? (mode === 2 ? 3 : 10))),
      friendlyFire: !!config.friendlyFire,
      players: [{
        clientId: this.clientId,
        name: cleanName,
        team: config.team ?? 0,
        slot: 0,
        ready: false,
        isHost: true,
      }],
      status: 'lobby',
      countdown: 0,
    };

    this._wireRelays(code, true, () => {
      this.sendRaw({ type: 'hostBeacon', roomCode: code });
      if (this.connected) this.sendRaw({ type: 'lobbySync', lobby: this.lobby });
      this.emitLobby();
    });

    this._clearHostBeacon();
    this._hostBeaconTimer = setInterval(() => {
      if (this.role !== 'host' || this.lobby.status !== 'lobby') return;
      this.sendRaw({ type: 'hostBeacon', roomCode: code });
    }, 1500);

    this.emitLobby();
    return code;
  }

  joinRoom(codeInput, guestName = 'Khách', team = 1) {
    this.leaveRoom();
    const cleanCode = normalizeRoomCode(codeInput);
    if (!cleanCode) return false;
    const cleanName = String(guestName || '').trim().slice(0, 12) || 'Khách';

    this.role = 'guest';
    this.roomCode = cleanCode;
    this.statusNote = `#${cleanCode}...`;
    this._joinAttempts = 0;
    this.lobby = {
      roomCode: cleanCode,
      mode: 0,
      mapIdx: 0,
      mapName: 'dm_crossroad',
      botCount: 2,
      botDifficulty: 1,
      scoreLimit: 10,
      friendlyFire: false,
      players: [],
      status: 'lobby',
      countdown: 0,
    };

    const announceJoin = () => {
      if (this.role !== 'guest' || this.connected) return;
      this.sendRaw({ type: 'guestJoin', clientId: this.clientId, guestName: cleanName, team });
    };

    this._wireRelays(cleanCode, false, announceJoin, announceJoin);
    setTimeout(announceJoin, 40);

    this._clearJoinRetry();
    this._joinRetryTimer = setInterval(() => {
      if (this.connected || this.role !== 'guest') {
        this._clearJoinRetry();
        return;
      }
      this._joinAttempts++;
      announceJoin();
      if (this._joinAttempts >= 12) {
        this.statusNote = `#${cleanCode} timeout`;
        this.emitLobby();
      }
    }, 850);

    this.emitLobby();
    return true;
  }

  setReady(ready) {
    const val = Boolean(ready);
    const me = this.getMyPlayer();
    if (me) me.ready = val;
    if (this.role === 'host') {
      if (!val) this.cancelCountdown();
      this.sendRaw({ type: 'lobbySync', lobby: this.lobby });
      this.emitLobby();
      this.checkStartCountdown();
    } else if (this.role === 'guest') {
      this.sendRaw({ type: 'guestReady', clientId: this.clientId, ready: val });
      this.emitLobby();
    }
  }

  selectTeam(team) {
    const t = Math.max(0, Math.min(3, team | 0));
    if (this.lobby.status === 'playing' || this.lobby.status === 'countdown') return false;
    if (this.role === 'host') {
      const me = this.getMyPlayer();
      if (!me) return false;
      me.team = t;
      me.ready = false;
      this.cancelCountdown();
      this.sendRaw({ type: 'lobbySync', lobby: this.lobby });
      this.emitLobby();
      return true;
    }
    if (this.role === 'guest') {
      const me = this.getMyPlayer();
      if (me) { me.team = t; me.ready = false; }
      this.sendRaw({ type: 'selectTeam', clientId: this.clientId, team: t });
      this.emitLobby();
      return true;
    }
    return false;
  }

  updateConfig(patch = {}) {
    if (this.role !== 'host' || this.lobby.status === 'playing') return;
    if (typeof patch.mode === 'number') this.lobby.mode = Math.max(0, Math.min(2, patch.mode | 0));
    if (typeof patch.mapIdx === 'number') this.lobby.mapIdx = Math.max(0, patch.mapIdx | 0);
    if (typeof patch.mapName === 'string' && patch.mapName) this.lobby.mapName = patch.mapName;
    if (typeof patch.botCount === 'number') this.lobby.botCount = Math.max(0, Math.min(3, patch.botCount | 0));
    if (typeof patch.botDifficulty === 'number') this.lobby.botDifficulty = Math.max(0, Math.min(2, patch.botDifficulty | 0));
    if (typeof patch.scoreLimit === 'number') this.lobby.scoreLimit = Math.max(1, Math.min(50, patch.scoreLimit | 0));
    if (typeof patch.friendlyFire === 'boolean') this.lobby.friendlyFire = patch.friendlyFire;

    this.cancelCountdown();
    for (const p of this.lobby.players) p.ready = false;
    this.sendRaw({ type: 'lobbySync', lobby: this.lobby });
    this.emitLobby();
  }

  checkStartCountdown() {
    if (this.role !== 'host' || this.lobby.status !== 'lobby') return;
    const minNeeded = 2;
    if (this.lobby.players.length < minNeeded) return;
    if (!this.lobby.players.every((p) => p.ready)) return;
    this.startMatchNow();
  }

  startMatchNow() {
    if (this.role !== 'host' || this.lobby.status === 'playing') return;
    this.cancelCountdown();
    this.lobby.status = 'playing';
    this.lobby.countdown = 0;
    const matchConfig = {
      mode: this.lobby.mode,
      mapIdx: this.lobby.mapIdx,
      mapName: this.lobby.mapName,
      botCount: this.lobby.botCount,
      botDifficulty: this.lobby.botDifficulty,
      scoreLimit: this.lobby.scoreLimit,
      friendlyFire: this.lobby.friendlyFire,
      players: this.lobby.players.map((p) => ({
        id: p.slot + 1,
        clientId: p.clientId,
        name: p.name,
        team: p.team,
        slot: p.slot,
      })),
    };
    this.sendRaw({ type: 'matchStart', lobby: this.lobby, matchConfig });
    this.emitLobby();
    this.callbacks.onMatchStart?.(matchConfig);
  }

  sendInput(input) {
    if (this.role !== 'guest' || !this.connected) return;
    this.sendRaw({ type: 'input', clientId: this.clientId, input });
  }

  sendSnapshot(snap) {
    if (this.role !== 'host' || !this.connected) return;
    this.sendRaw({ type: 'snap', snap });
  }

  handleMessage(msg) {
    if (!msg || typeof msg !== 'object') return;

    if (this.role === 'host') {
      if (msg.type === 'guestJoin') {
        const cid = msg.clientId || msg._from;
        if (!cid) return;
        let existing = this.lobby.players.find((p) => p.clientId === cid);
        if (!existing) {
          if (this.lobby.players.length >= MAX_PLAYERS) {
            this.sendRaw({ type: 'roomFull', target: cid });
            return;
          }
          const usedSlots = new Set(this.lobby.players.map((p) => p.slot));
          let freeSlot = 1;
          while (usedSlots.has(freeSlot) && freeSlot < MAX_PLAYERS) freeSlot++;
          existing = {
            clientId: cid,
            name: String(msg.guestName || `P${freeSlot + 1}`).trim().slice(0, 12),
            team: msg.team ?? (freeSlot % 2),
            slot: freeSlot,
            ready: false,
            isHost: false,
          };
          this.lobby.players.push(existing);
        }
        this.connected = true;
        this.cancelCountdown();
        this.sendRaw({ type: 'lobbySync', lobby: this.lobby });
        this.emitLobby();
      } else if (msg.type === 'guestReady') {
        const p = this.lobby.players.find((x) => x.clientId === msg.clientId);
        if (p) {
          p.ready = Boolean(msg.ready);
          if (!p.ready) this.cancelCountdown();
          this.sendRaw({ type: 'lobbySync', lobby: this.lobby });
          this.emitLobby();
          this.checkStartCountdown();
        }
      } else if (msg.type === 'selectTeam') {
        const p = this.lobby.players.find((x) => x.clientId === msg.clientId);
        if (p) {
          p.team = Math.max(0, Math.min(3, msg.team | 0));
          p.ready = false;
          this.cancelCountdown();
          this.sendRaw({ type: 'lobbySync', lobby: this.lobby });
          this.emitLobby();
        }
      } else if (msg.type === 'input') {
        const p = this.lobby.players.find((x) => x.clientId === msg.clientId);
        if (p && msg.input) {
          this.callbacks.onRemoteInput?.(p.slot + 1, msg.input);
        }
      }
      return;
    }

    if (this.role === 'guest') {
      if (msg.type === 'roomFull' && msg.target === this.clientId) {
        this.statusNote = 'Phòng đã đủ 4 người!';
        this.emitLobby();
      } else if (msg.type === 'lobbySync' && msg.lobby) {
        this.lobby = { ...this.lobby, ...msg.lobby };
        this.emitLobby();
      } else if (msg.type === 'matchStart' && msg.matchConfig) {
        if (msg.lobby) this.lobby = { ...this.lobby, ...msg.lobby };
        this.lobby.status = 'playing';
        this.emitLobby();
        this.callbacks.onMatchStart?.(msg.matchConfig);
      } else if (msg.type === 'snap' && msg.snap) {
        this.callbacks.onSnapshot?.(msg.snap);
      }
    }
  }

  leaveRoom() {
    this._clearHostBeacon();
    this._clearJoinRetry();
    this.cancelCountdown();
    try { this.bc?.close(); } catch {}
    try { this.relay?.close(); } catch {}
    try { this.apiRelay?.close(); } catch {}
    try { this.ntfyRelay?.close(); } catch {}
    this.bc = null;
    this.relay = null;
    this.apiRelay = null;
    this.ntfyRelay = null;
    this.role = null;
    this.roomCode = '';
    this.connected = false;
    this.transport = '';
    this.statusNote = '';
    this._seenMsgs.clear();
    this.lobby = {
      roomCode: '',
      mode: 0,
      mapIdx: 0,
      mapName: 'dm_crossroad',
      botCount: 2,
      botDifficulty: 1,
      scoreLimit: 10,
      friendlyFire: false,
      players: [],
      status: 'idle',
      countdown: 0,
    };
    this.emitLobby();
  }
}

export function bindMultiplayerLobby({
  client,
  getLang,
  getMapsList,
  onSyncLobbyUi,
  getDefaultNickname,
}) {
  const overlay = document.getElementById('mp-lobby');
  if (!overlay) return { openLobby() {}, closeLobby() {}, refresh() {} };

  const els = {
    title: document.getElementById('mp-title'),
    subtitle: document.getElementById('mp-subtitle'),
    btnClose: document.getElementById('btn-mp-close'),
    homeView: document.getElementById('mp-home-view'),
    roomView: document.getElementById('mp-room-view'),
    nameLabel: document.getElementById('mp-name-label'),
    nameInput: document.getElementById('mp-name-input'),
    btnCreate: document.getElementById('btn-mp-create'),
    orLabel: document.getElementById('mp-or-label'),
    codeInput: document.getElementById('mp-code-input'),
    btnJoin: document.getElementById('btn-mp-join'),
    homeError: document.getElementById('mp-home-error'),
    codeLabel: document.getElementById('mp-code-label'),
    roomCode: document.getElementById('mp-room-code'),
    transportBadge: document.getElementById('mp-transport-badge'),
    btnCopy: document.getElementById('btn-mp-copy'),
    btnTab2: document.getElementById('btn-mp-tab2'),
    modeLabel: document.getElementById('mp-mode-label'),
    modeSelect: document.getElementById('mp-mode-select'),
    levelLabel: document.getElementById('mp-level-label'),
    levelSelect: document.getElementById('mp-level-select'),
    botsLabel: document.getElementById('mp-bots-label'),
    botsSelect: document.getElementById('mp-bots-select'),
    limitLabel: document.getElementById('mp-limit-label'),
    limitInput: document.getElementById('mp-limit-input'),
    teamBtns: Array.from(document.querySelectorAll('.mp-team-btn')),
    playersList: document.getElementById('mp-players-list'),
    btnReady: document.getElementById('btn-mp-ready'),
    btnStartNow: document.getElementById('btn-mp-start-now'),
    btnLeave: document.getElementById('btn-mp-leave'),
  };

  if (els.nameInput && getDefaultNickname) {
    els.nameInput.value = getDefaultNickname();
  }

  function populateModesAndMaps(mode, selectedMap) {
    const lang = getLang();
    const modes = lang === 'en'
      ? ['Deathmatch (FFA)', 'Team Match (TDM)', 'Capture the Flag (CTF)']
      : ['Tử chiến (DM)', 'Đấu đội (TDM)', 'Cướp cờ (CTF)'];
    if (els.modeSelect) {
      els.modeSelect.innerHTML = modes.map((m, i) => `<option value="${i}" ${i === mode ? 'selected' : ''}>${m}</option>`).join('');
    }
    const list = getMapsList();
    const bucket = mode === 1 ? list.tm : mode === 2 ? list.ctf : list.dm;
    if (els.levelSelect) {
      els.levelSelect.innerHTML = bucket.map((m, i) => `<option value="${i}" ${m === selectedMap ? 'selected' : ''}>${m}</option>`).join('');
    }
  }

  function render(state) {
    const lang = getLang();
    const isEn = lang === 'en';
    if (els.title) els.title.textContent = isEn ? '⚔️ PIPYAKI MULTIPLAYER (2-4P)' : '⚔️ ĐẤU TRƯỜNG PIPYAKI (2–4P)';
    if (els.subtitle) els.subtitle.textContent = isEn ? '2-4 Players · Online / LAN / Multi-Tab' : '2–4 người chơi · Online / Cùng mạng / Đa Tab';
    if (els.nameLabel) els.nameLabel.textContent = isEn ? 'PLAYER NICKNAME' : 'TÊN NHÂN VẬT';
    if (els.btnCreate) els.btnCreate.textContent = isEn ? '⚔️ CREATE ROOM' : '⚔️ TẠO PHÒNG MỚI';
    if (els.orLabel) els.orLabel.textContent = isEn ? 'OR JOIN BY ROOM CODE' : 'HOẶC VÀO PHÒNG CÓ SẴN';
    if (els.btnJoin) els.btnJoin.textContent = isEn ? 'JOIN ROOM' : 'VÀO PHÒNG';
    if (els.codeLabel) els.codeLabel.textContent = isEn ? 'ROOM:' : 'MÃ PHÒNG:';
    if (els.btnCopy) els.btnCopy.textContent = isEn ? '📋 Copy Invite' : '📋 Copy Link';
    if (els.btnTab2) els.btnTab2.textContent = isEn ? '↗️ Open Tab 2' : '↗️ Mở Tab 2';
    if (els.modeLabel) els.modeLabel.textContent = isEn ? 'MODE' : 'CHẾ ĐỘ';
    if (els.levelLabel) els.levelLabel.textContent = isEn ? 'ARENA' : 'BẢN ĐỒ';
    if (els.botsLabel) els.botsLabel.textContent = isEn ? 'AI BOTS' : 'BOT AI';
    if (els.limitLabel) els.limitLabel.textContent = isEn ? 'TARGET SCORE' : 'MỤC TIÊU';
    if (els.btnLeave) els.btnLeave.textContent = isEn ? 'Leave Room' : 'Rời phòng';

    const inRoom = Boolean(state?.role);
    if (els.homeView) els.homeView.hidden = inRoom;
    if (els.roomView) els.roomView.hidden = !inRoom;
    if (!inRoom) return;

    const isHost = state.role === 'host';
    if (els.roomCode) els.roomCode.textContent = state.roomCode || 'PK0000';
    if (els.transportBadge) {
      els.transportBadge.textContent = state.transport || (state.statusNote || (isEn ? 'Waiting...' : 'Đang kết nối...'));
    }

    populateModesAndMaps(state.mode, state.mapName);
    if (els.modeSelect) els.modeSelect.disabled = !isHost;
    if (els.levelSelect) els.levelSelect.disabled = !isHost;
    if (els.botsSelect) {
      els.botsSelect.value = String(state.botCount ?? 2);
      els.botsSelect.disabled = !isHost;
    }
    if (els.limitInput) {
      els.limitInput.value = String(state.scoreLimit ?? 10);
      els.limitInput.disabled = !isHost;
    }

    const me = state.players.find((p) => p.clientId === state.clientId);
    for (const btn of els.teamBtns) {
      const t = Number(btn.dataset.team || 0);
      btn.classList.toggle('active', me ? me.team === t : false);
    }

    if (els.playersList) {
      const slotsHtml = [];
      for (let slot = 0; slot < MAX_PLAYERS; slot++) {
        const p = state.players.find((x) => x.slot === slot);
        if (!p) {
          slotsHtml.push(`<div class="mp-slot is-empty"><span>Slot ${slot + 1} · ${isEn ? 'Open / Bot fill' : 'Trống (hoặc Bot)'}</span></div>`);
        } else {
          const teamNames = isEn ? ['Blue', 'Red', 'Green', 'Gold'] : ['Xanh', 'Đỏ', 'Lá', 'Vàng'];
          const tCls = `t${p.team % 4}`;
          const tag = p.isHost ? 'HOST' : `P${p.slot + 1}`;
          const readyLbl = p.ready ? (isEn ? 'READY' : 'SẴN SÀNG') : (isEn ? 'WAITING' : 'CHỜ');
          slotsHtml.push(
            `<div class="mp-slot"><div class="mp-slot-left"><span class="mp-char-tag ${tCls}">${tag} · ${teamNames[p.team % 4]}</span><strong>${p.name}</strong></div><span class="mp-ready-pill ${p.ready ? 'ready' : ''}">${readyLbl}</span></div>`
          );
        }
      }
      els.playersList.innerHTML = slotsHtml.join('');
    }

    if (els.btnReady) {
      const myReady = Boolean(me?.ready);
      els.btnReady.classList.toggle('is-ready', myReady);
      els.btnReady.textContent = myReady
        ? (isEn ? '✓ READY (Cancel)' : '✓ ĐÃ SẴN SÀNG')
        : (isEn ? 'READY' : 'SẴN SÀNG');
    }
    if (els.btnStartNow) {
      els.btnStartNow.hidden = !isHost;
      els.btnStartNow.textContent = isEn ? '▶ START NOW' : '▶ BẮT ĐẦU NGAY';
    }
    onSyncLobbyUi?.(state);
  }

  function showError(msg) {
    if (!els.homeError) return;
    els.homeError.textContent = msg;
    els.homeError.hidden = !msg;
  }

  els.btnClose?.addEventListener('click', () => { overlay.hidden = true; });
  els.btnCreate?.addEventListener('click', () => {
    showError('');
    const list = getMapsList();
    const name = els.nameInput?.value || 'Pipyaka';
    client.createRoom(name, { mode: 0, mapIdx: 0, mapName: list.dm[0] || 'dm_crossroad', botCount: 2 });
  });
  els.btnJoin?.addEventListener('click', () => {
    showError('');
    const code = normalizeRoomCode(els.codeInput?.value || '');
    if (!code) {
      showError(getLang() === 'en' ? 'Invalid room code (e.g. PK4829).' : 'Mã phòng không hợp lệ (VD: PK4829).');
      return;
    }
    const name = els.nameInput?.value || 'Khách';
    client.joinRoom(code, name, 1);
  });
  els.btnLeave?.addEventListener('click', () => client.leaveRoom());
  els.btnReady?.addEventListener('click', () => {
    const me = client.getMyPlayer();
    client.setReady(!me?.ready);
  });
  els.btnStartNow?.addEventListener('click', () => client.startMatchNow());

  els.modeSelect?.addEventListener('change', () => {
    const m = Number(els.modeSelect.value || 0);
    const list = getMapsList();
    const bucket = m === 1 ? list.tm : m === 2 ? list.ctf : list.dm;
    client.updateConfig({ mode: m, mapIdx: 0, mapName: bucket[0] || 'dm_crossroad', scoreLimit: m === 2 ? 3 : 10 });
  });
  els.levelSelect?.addEventListener('change', () => {
    const idx = Number(els.levelSelect.value || 0);
    const m = client.lobby.mode;
    const list = getMapsList();
    const bucket = m === 1 ? list.tm : m === 2 ? list.ctf : list.dm;
    client.updateConfig({ mapIdx: idx, mapName: bucket[idx] || bucket[0] || 'dm_crossroad' });
  });
  els.botsSelect?.addEventListener('change', () => {
    client.updateConfig({ botCount: Number(els.botsSelect.value || 0) });
  });
  els.limitInput?.addEventListener('change', () => {
    client.updateConfig({ scoreLimit: Number(els.limitInput.value || 10) });
  });
  for (const btn of els.teamBtns) {
    btn.addEventListener('click', () => client.selectTeam(Number(btn.dataset.team || 0)));
  }

  els.btnCopy?.addEventListener('click', async () => {
    if (!client.roomCode) return;
    const url = new URL(window.location.href);
    url.searchParams.set('mp', client.roomCode);
    try {
      await navigator.clipboard.writeText(url.toString());
      els.btnCopy.textContent = getLang() === 'en' ? '✓ Copied!' : '✓ Đã copy!';
      setTimeout(() => render({ ...client.lobby, role: client.role, clientId: client.clientId, transport: client.transport }), 1400);
    } catch {}
  });

  els.btnTab2?.addEventListener('click', () => {
    if (!client.roomCode) return;
    const url = new URL(window.location.href);
    url.searchParams.set('mp', client.roomCode);
    url.searchParams.set('guest', '1');
    window.open(url.toString(), '_blank');
  });

  return {
    openLobby() {
      overlay.hidden = false;
      render({
        ...client.lobby,
        role: client.role,
        clientId: client.clientId,
        connected: client.connected,
        transport: client.transport,
        statusNote: client.statusNote,
      });
    },
    closeLobby() {
      overlay.hidden = true;
    },
    refresh(state) {
      render(state);
    },
    autoJoinFromUrl() {
      if (typeof window === 'undefined') return false;
      const params = new URLSearchParams(window.location.search || '');
      const mpCode = normalizeRoomCode(params.get('mp') || '');
      if (!mpCode) return false;
      overlay.hidden = false;
      if (els.codeInput) els.codeInput.value = mpCode;
      const guestName = els.nameInput?.value || (params.get('guest') ? 'Player 2' : 'Khách');
      client.joinRoom(mpCode, guestName, 1);
      return true;
    },
  };
}
