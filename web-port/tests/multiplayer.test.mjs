import test from 'node:test';
import assert from 'node:assert/strict';

import { generateRoomCode, MultiplayerClient, normalizeRoomCode, ROOM_PREFIX } from '../multiplayer.js';

test('uses isolated PKxxxx room code namespace', () => {
  assert.equal(ROOM_PREFIX, 'PK');
  for (let i = 0; i < 20; i++) {
    const code = generateRoomCode();
    assert.match(code, /^PK\d{4}$/);
  }
  assert.equal(normalizeRoomCode('4829'), 'PK4829');
  assert.equal(normalizeRoomCode('pk9102'), 'PK9102');
  assert.equal(normalizeRoomCode(''), '');
});

test('assigns up to 4 human slots on Host and rejects 5th join', () => {
  const events = [];
  const host = new MultiplayerClient({
    onMatchStart(cfg) {
      events.push(cfg);
    },
  });
  // Disable external sockets/HTTP inside Node test
  host._wireRelays = () => {};
  const code = host.createRoom('ChuPhong', { mode: 2, mapName: 'ctf_headphones', botCount: 0 });
  assert.match(code, /^PK\d{4}$/);
  assert.equal(host.lobby.players.length, 1);

  for (let i = 2; i <= 4; i++) {
    host.handleMessage({ type: 'guestJoin', clientId: `g_${i}`, guestName: `Ban_${i}`, team: i - 1 });
  }
  assert.equal(host.lobby.players.length, 4);
  assert.deepEqual(host.lobby.players.map((p) => p.slot), [0, 1, 2, 3]);

  // 5th player must NOT overflow 4 slots
  host.handleMessage({ type: 'guestJoin', clientId: 'g_5', guestName: 'Extra', team: 0 });
  assert.equal(host.lobby.players.length, 4);

  host.startMatchNow();
  assert.equal(events.length, 1);
  assert.equal(events[0].players.length, 4);
  assert.equal(events[0].mapName, 'ctf_headphones');
  assert.equal(events[0].mode, 2);
  host.leaveRoom();
});

test('Guest binds local actor slot from Host lobbySync and receives snapshots', () => {
  let guestStart = null;
  let guestSnap = null;
  const guest = new MultiplayerClient({
    onMatchStart(cfg) { guestStart = cfg; },
    onSnapshot(s) { guestSnap = s; },
  });
  guest._wireRelays = () => {};
  assert.equal(guest.joinRoom('PK7777', 'Khach', 1), true);
  assert.equal(guest.role, 'guest');

  guest.handleMessage({
    type: 'lobbySync',
    lobby: {
      roomCode: 'PK7777',
      mode: 0,
      mapName: 'dm_crossroad',
      botCount: 2,
      scoreLimit: 10,
      players: [
        { clientId: 'host_1', name: 'Host', team: 0, slot: 0, ready: true, isHost: true },
        { clientId: guest.clientId, name: 'Khach', team: 1, slot: 1, ready: false, isHost: false },
      ],
      status: 'lobby',
    },
  });

  assert.equal(guest.getLocalActorId(), 2);

  guest.handleMessage({
    type: 'matchStart',
    matchConfig: {
      mode: 0,
      mapName: 'dm_crossroad',
      botCount: 2,
      scoreLimit: 10,
      players: [
        { id: 1, clientId: 'host_1', name: 'Host', team: 0, slot: 0 },
        { id: 2, clientId: guest.clientId, name: 'Khach', team: 1, slot: 1 },
      ],
    },
  });
  assert.ok(guestStart);
  guest.handleMessage({ type: 'snap', snap: { t: 42, a: [], b: [] } });
  assert.equal(guestSnap.t, 42);
  guest.leaveRoom();
});
