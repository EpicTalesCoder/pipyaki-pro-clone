# Pipyaki Pro (`pipyaki-pro.jar`) — Class Responsibilities & Architecture Analysis

- **Original JAR**: `games/pipyaki-pro/original/pipyaki-pro.jar` (`660,797` bytes, SHA-256 `f6821a9a38f4cd30bec5b999c79a5d5fc8f9d526956ff9db15ee70cb003348b0`)
- **MIDlet**: `midlet` (`Pipyaki Pro`, DaSuppaStudios Ltd., Vietnamese waptai.com mod, logical canvas `240x320`)
- **Decompiled Classes**: 82 total (`javap`, `decompiled-vineflower/`, `decompiled-cfr/`)
- **Recovered Assets**: 229 `.png`, 34 `.map` (25 campaign `map0..map24.map` + 9 MP/Skirmish `maps/*.map` listed in `maps/list`), 17 `.txt` (UTF-8 Vietnamese `lang.txt`, `lang_help.txt`, `lang_workshop.txt`, `lang_map*.txt`, `font/font.txt`, `info.txt`, `reg.txt`), 3 `.mid` (`midi/music_menu.mid`, `midi/music_game0.mid`, `midi/music_game1.mid`), 1 `.cfg` (`font/font.cfg` = 94 glyph widths).

---

## 1. Core Class Inventory & Responsibilities

| Class | Size | Role | Key Lines & Mechanics |
|---|---:|---|---|
| `midlet` | 1.3 KB | MIDlet lifecycle entry | Initializes `ab.z = new rc()`, calls `wb.c()`, sets `ab.l = 2` (intro), `ab.G = new ub()`, `hb.g()`, `qb.n()`, `wb.b()`. (`midlet.java:15-42`) |
| `rc` | 5.6 KB | `Canvas` shell, input router, progress bar | Sets `ab.D/E` (`240x320`); dispatches `paint()` on `ab.l` (`0` gameplay `fb`, `1` menu `qb`, `2` intro `wb`); routes keypad (`-6/-21` LSK, `-7/-22` RSK, `0..9`, `*`, `#`) & touch `pointerPressed/Released/Dragged` to menus, softkeys, and 4 quick-action touch slots `fb.Id/Jd[0..3]`. (`rc.java:43-387`) |
| `ab` | 11.6 KB | Global constants, state, inventory, helpers | Player persistent inventory `Vb[14]` (weapons, `Vb[0]=50`), `Wb[11]` (skills), `Xb[6]` (items, `Xb[5]=3` eggs/lives), campaign coins `Qb`, BT coins `Rb`, campaign level `Tb`/`Ub`, `bc` active map index, `gb={0,-1,0,1}` / `hb={1,0,-1,0}` directional deltas (`0=down,1=left,2=up,3=right`), sound name table `ab.h()`, Cyrillic-to-ASCII nick translit `ab.c(String)`. (`ab.java:105-758`) |
| `wb` / `x` / `dc` / `mc` | 8.8 KB | Intro parallax animation & music prompt | Multi-layer parallax clouds (`cloud_b1..3`, `cloud_s1..3`), hills (`hills1..5`), falling leaf (`leaf1..2`), star glint, dropping title letters (`w1..w32`), `bombaka_house_v1`, `pro_blood_short`, music-on/off softkey prompt -> transitions to `ab.l = 1` (`qb`). (`wb.java:1-876`) |
| `qb` | 56.3 KB | Main menu, zoom-pan canvas, shop/workshop, pause, credits | Renders 2x zoom-able tiled menu backdrop (`gb` nodes), hierarchical state machine `Rb` (`0` main, `34` 3x3 quick weapon/item selector, `42` Workshop, `15` Credits, `33` `bb` virtual keyboard), saves via `n` RMS (`settings`, `autosave`, `btautosave`). (`qb.java:1-5727`) |
| `gb` | 19.4 KB | Zoomable spatial menu graph node | Animated node sprites & label offsets inside `qb` menu world. (`gb.java:1-1709`) |
| `bb` | 3.9 KB | Onscreen virtual keyboard (`Rb==33`) | Multi-row Cyrillic/Latin glyph grid for player name & custom entry. (`bb.java:1-317`) |
| `tb` | 5.1 KB | Rich scrolling dialog / briefing / endgame modal | Wraps bitmap/UTF-8 text with icons/colors (`^id~`, `` `0~ ``/`` `1~ ``), campaign briefings (`lang_map*.txt`), mission win/loss stats (`fb.c(boolean, boolean)`), Help/Workshop manuals. (`tb.java:1-419`) |
| `fb` | 79.6 KB | World & gameplay controller (`Runnable`) | Loads map/sprites (`fb.a(String)`, `fb.e(int)`), runs tick loop `fb.o()`, camera follow/pan/shake `Be`/`Ge`/`He`/`Ie`/`Je`, Y-sorted multi-pass tile & entity renderer (`fb.b(Graphics)` bytecode `5200-8951`), HUD counters, killfeed `h`/`m`, weather & blood, Skirmish/CTF scores `hb[0..1]`, win/loss progression `fb.c()`, BT host/client binary opcodes `1..23`, `101`. (`fb.java:1-9969`) |
| `q` | 49.7 KB | Player & NPC character entity | Subclasses `o`; manages stats (`mc`/`nc` max/cur HP, `oc`/`rc` pending HP), velocity/step grid snapping (`300` sub-units/tile = `30px`), primary/secondary attack charging (`Tb`/`Ub`/`Vb`), dashing/rolling (`qb==3`, `Bb` invincible dash, `Yb` roll dir), armor/item buffs (`fb` berserker/kaska, `ib` invisibility, `kb` shield, `Y`/`db`/`eb` poison/sloth/egg-hurt), skills `ac[0..10]`, inventory `Yb[14]`/`dc[6]`, HP/armor floating bar (`q.a(Graphics)`), respawning. (`q.java:1-5160`) |
| `y` | 20.6 KB | Bot AI & CTF BFS pathfinding | Difficulty skills `k` (`0..8`), line-of-sight scan `y.b(x,y,sight,range,self)`, tactical weapon picking (`g` + `Yb` counts), dodging incoming `hb` bombs, campaign boss/monster behaviors (`r=1` ally/bot, `2` spider, `3` shooter, `4` cannon, `5` kamikaze, `6` rocketman, `8` miner, `9` snail/ulityaka), CTF flag BFS gradient grids `O`/`P`. (`y.java:1-2263`) |
| `hb` | 20.1 KB | Weapons, projectiles, mines & environmental hazards | Static shop/ammo tables `b[14], c[6], d[14], e[6], f[14], g[14], h[6]`; physics bodies for 14 weapons (`0..13`) + NPC hazards (`-1..-6`): grenades/melons, bouncy rubber melons, clustered pineapples, landmines, rakes, bricks, stinky socks, banana peels, bombs, carrier rockets. (`hb.java:1-1854`) |
| `u` / `o` / `lb` | 9.1 KB | Base physics body (`u`), positioned entity (`o`), map tile (`lb`) | `o` holds tile coords `g,h` and subpixel coords `c,d` (`10x` px); `u` adds `z`-height `O/P/Q` bounce `C` and friction `B`; `lb` holds `b` (ground frame), `c` (tile type `1..16`), `d` (obstacle `j`), `e[]` (bg prop idx), `f[]` (fg prop idx). (`u.java:1-308`, `o.java:1-193`, `lb.java:1-116`) |
| `j` | 6.8 KB | Destructible & static map cell obstacles | Wood/brick crates & barriers, wide gates (`type==2`), houses (`house_bottom/top`, `bombaka_house_bottom/top`), healing well (`bd`/`cd`), escape rocket (`type==8`), tree trunks + crowns `Yc`/`Ab`. (`j.java:1-542`, `fb.java:759-835`) |
| `s` | 9.9 KB | Pickups, trampolines & CTF flags | `u==1` trampoline launchpad, `u==2..17` coin/weapon/medkit/egg/armor pickups, `u==6` Red/Blue CTF flags (`fb.ib`, `fb.jb`) with carry/drop/home-reset logic & timers. (`s.java:1-800`) |
| `p` | 9.6 KB | Explosion, poison & gas wave propagation | Flood-fills blast damage across walkability `fb.bf`, applies damage + knockback + crater decals `d` + fire/smoke `w`. (`p.java:1-884`) |
| `v` / `g` | 7.5 KB | Map trigger zones (`v`) & map markers (`g`) | 25 trigger actions (win `3`, lose `4`, boss dialog `5`, mission text `6`, camera pan/lock `16/18/23`, hints `21`, barrier open/close, spawner activation). `g` stores CTF flag bases `d==4/5`, objective pointers, trampoline destinations `d==2`. (`v.java:1-759`, `g.java:1-37`) |
| `sb` | 2.7 KB | Enemy spawner / capsule hatch | Wave quota `q`, max concurrent, respawn timer, active toggle, rush flag, character archetype (`params[0]`, remaps `2->3`). (`sb.java:1-261`) |
| `r` / `t` / `w` / `d` | 10.6 KB | Particle emitters, clouds, floating VFX & persistent decals | `r` spawns `t` smoke/fire/rain/blood/spark clouds; `w` renders explosions, floating `+damage`/`+item^id~` text, stars; `d` stamps blood pools, footprints (`bm_foots`), craters (`bomb_crater`, `melon_crater`, `walls_craters`). (`r.java:1-117`, `t.java:1-108`, `w.java:1-605`, `d.java:1-74`) |
| `k` | 14.3 KB | `.map` binary v2 parser & prop lookup tables | Decodes `0xA9`, version `>=2`, map dimensions `(Pe, Qe)`, sections `0..4` (`ground`, `overlay`, `obstacles j`, `props o` using `k.b`/`k.c`, `spawners/items/triggers`), and chunk 2 metadata (music idx, weather/theme `ab.s`, special cutscene flag `ab.v`). (`k.java:1-1599`, `decompiled-cfr/k.java:1-674`) |
| `b` / `ib` | 13.1 KB | Bitmap/Unicode font & localization loader | Loads `/font/font.png`, `/font/font.txt` (94 chars), `/font/font.cfg` (94 widths), `menu/digits.png` (`8x11`), `font/numbers_big.png` (`14x17`), `/font/icons/ico0..43.png` (`^id~`), color switches `` `0~ ``/`` `1~ ``; `ib` loads UTF-8 `;`-delimited strings from `/lang*.txt`, sets `ib.c=true` for accented Vietnamese. (`b.java:1-807`, `ib.java:1-49`) |
| `pb` / `nb` | 3.6 KB | Sprite strip & sequence animator | `pb`: horizontal strip of `h` frames size `d x e`; `nb`: sequence player with frame list `g`, loop `k`, reverse `l`, tick divider `p`, repeat `q`. (`pb.java:1-54`, `nb.java:1-232`) |
| `ub` / `z` / `sc` | 8.2 KB | Audio MIDI/SFX manager | Plays `/midi/music_menu.mid` and `/midi/music_game0..1.mid`; defines 20 SFX slots `ab.J..ab.db` (`c=false` and `.wav` stripped in JAR, so web port plays decoded `.mid` via Web Audio + crisp SFX synths). (`ub.java:1-286`, `ab.java:536-573`) |
| `n` | 5.4 KB | RMS Save Store | Stores `settings`, `autosave`, `btautosave`, `registration` with checksum validation (`n.java:1-373`). |
| `db` / `f` / `e` / `cb` / `jb` / `kb` / `ic`/`jc`/`kc`/`ec`/`xb` | ~30 KB | Legacy J2ME Bluetooth stack | JSR-82 BT server (`f`) and client (`db`) over `btspp://`. Replaced in Web Port by `multiplayer.js` (Quad Transport 2–4 player online MP) while reusing `fb` gameplay MP state/rules (`fb.b`, `L=1`, DM/Team/CTF). (`db.java:1-416`, `f.java:1-249`) |
| `dc` / `gc` / `i` / `wfree.*` | ~11 KB | Anti-tamper & SMS registration nagware | Checks `MIDlet-1` suffix (`dc`) and SMS unlock gates (`ab.Ab`, blocking free progression after map 5 & BT). **Cleanly bypassed/removed in web port** (`isRegistered = true`, all 25 maps progression-unlocked, MP unlocked, SMS coin buy removed). (`dc.java:1-99`, `i.java:1-38`, `qb.java` SMS states `13,14,52,53,55,63`) |

---

## 2. State Machine (`ab.l` & `qb.Rb`)

- `ab.l = 2`: **Intro** (`wb`) — sky gradient, scrolling parallax hills (`hills1..5`), drifting clouds, windblown leaf, winking star, dropping logo tiles `w1..w32`, `pro_blood_short`, sound toggle prompt (LSK Yes / RSK No) -> fades to Main Menu (`ab.l = 1`).
- `ab.l = 1`: **Menu & Shop World** (`qb`) — camera zooms smoothly between menu panels (`gb`) plus overlays:
  - Main Menu: Chơi mới (New Campaign), Tiếp tục (Continue), Đấu đội / Chơi qua BT -> Online Multiplayer & Skirmish Arena (2–4 players: Deathmatch / Team / CTF), Xưởng chế tạo (Workshop / Shop between or outside missions), Cài đặt (Settings: Music, SFX, Blood/Gore `ab.cc`, Light mode `ab.Jb`), Hướng dẫn (Help), Giới thiệu (Credits `Rb=15`), Thoát.
  - `Rb == 34`: **In-Game Quick Weapon & Equipment Selector** (`#` opens over frozen `fb` gameplay; `3x3` sprite grid, `#` cycles Weapons / Items pages, `Fire/5` assigns Primary `Pd.bc`, `Star/*` assigns Secondary `Pd.cc`, `#`/RSK closes).
  - `Rb == 42`: **Workshop (`lang_workshop.txt`)** — buy 14 weapons (batches of 5), 6 gear items (`banana`, `berserker`, `invisible`, `kaska`, `carrot`, `egg`), and 11 passive skill upgrades (`mb`: Max HP, Mission Bonus %, Melon dmg, Rubber Melon dmg/bounce, Sticky Melon dmg, Pineapple dmg, Mine radius/dmg, Stinky Sock duration, Rake duration, Berserk duration, Invisible duration).
- `ab.l = 0`: **Gameplay (`fb`)**:
  - `fb.L == 0`: **Campaign** — 25 levels (`maps/campaign/map0.map .. map24.map`) with briefings (`lang_map*.txt`), shop between maps, spawners `sb`, triggers `v`, destructibles `j`, escape rocket / objective markers, Victory/Defeat modal `tb`.
  - `fb.L != 0`: **Skirmish & Online Multiplayer** — `ab.m` = `0` Deathmatch, `1` Team Deathmatch, `2` Capture The Flag (`fb.ib`, `fb.jb` flags + BFS AI pathfinding `y.O`/`y.P`), 2–4 active slots (humans + `1..3` bots with configurable difficulty `ab.dc` `0..3`), leaderboard overlay on `9` or respawn wait.

---

## 3. Binary `.map` Format (`k.java:87-1599`, `decompiled-cfr/k.java:1-674`)

1. **Header**: `int8 magic == -87 (0xA9)`, `int8 version (>= 2)`, `int32 reserved`, `int8 width = Pe`, `int8 height = Qe`. Each cell is `30 x 30` logical px (`300 x 300` sub-units).
2. **Chunk 1 (`int32 len1`)**: Tagged sections read until EOF:
   - `sec == 0`: `Pe * Qe` bytes ground layer (`> 0` randomly maps to `ground_grass` frames `1..6` (75%) or `28..36` (25%); `0` stays empty/frame `0`).
   - `sec == 1`: `Pe * Qe` bytes terrain overlay (`> 0` sets `lb.b = v + 6`, `lb.c = v`, walkability speed `ab.vc` when `1..16` else `ab.uc`).
   - `sec == 2`: `int16 count` obstacles -> `(s8 tx, s8 ty, s8 type, [if type != -1: s8 frame, s8 extra])`. Handles wide gate `type == 2` spanning `(tx,ty)` and `(tx+2,ty)`, skips map bugs `(map 7: 5,29)` and `(map 17: 10,10)`.
   - `sec == 3`: `int32 count` decorative props -> `(s16 px, s16 py, s8 objType, s8 objSub)` using `k.c[objType][objSub]` `[active, layer]` and placing `o` onto `lb.f` (foreground if `py%30>=22` or foreground flag) or `lb.e` (background).
   - `sec == 4`: `int32 count` dynamic entities -> `(s8 kind, s8 tx, s8 ty, s8 paramLen, byte[paramLen])`:
     - `0`: Spawner `sb` (`charType`, `quota`, `maxAlive`, `respawnSec`, `minRange`, `team`, `inactive`, `skill`, `guardX`, `guardY`, `rush`).
     - `1`: Initial weapon trap (`5` melon, `10` sock, `11` rake, `13` trap).
     - `2`: Trampoline pad (`s` type `1`) + target marker.
     - `3`: Pickup (`s` types `2..17`).
     - `4,5`: Skirmish/MP spawn points.
     - `6`: Environmental hazard `hb` `-1..-3`.
     - `7`: Trigger zone `v` (15-byte spec).
     - `8`: Particle emitter `r`.
     - Else: Marker `g` (`d=3` increments `fb.h` secret/objective total, `d=4/5` CTF Red/Blue flag bases).
3. **Chunk 2 (`int32 len2`)**: `[0]` MIDI game track (`0` or `1`), `[1]` `ab.s` map weather/difficulty modifier, `[2]` `ab.v` special intro-boss flag.

---

## 4. Weapons, Gear & Upgrades (`hb.java:1735-1853`, `mb.java:1-13`, `q.java:4939-5155`)

- **14 Weapons (`0..13`)**: Prices `d = [10,20,20,15,25,30,45,30,45,40,15,30,10,25]`, shop batch = `5`, shop order `hb.f = [1,4,3,6,5,8,7,2,9,12,0,13,11,10]`, campaign start `hb.g = [50,0,20,20,0,15,0,10,0,2,3,3,0,2]`.
  - Pairings: Normal Melon `0` / Hard Melon `1` (base dmg `90`/`120`), Sticky `3`/`4` (`40`/`50`), Bouncy Rubber `5`/`6` (`60`/`90`), Pineapple Cluster `7`/`8` (`90`/`120`), ThrowBrick `12` (`90`), ThrowMelon/Bomb variants (`2`=`15`+burns/mines, `9` Mine `90`, `10` Sock `6`/stun, `11` Rake `60`/stun, `13` Trap `60`).
- **6 Support Gear (`0..5`)**: Prices `e = [15,30,50,25,30,30]`, campaign start `hb.h = [5,1,0,0,0,0]`, shop order `[2,1,0,4,5,3]`:
  - `0` Banana Fruit (+`50% maxHP` heal + `+1` Stinky Peel weapon `10`), `1` Berserk Aura (`30 + 15*ac[9]` s speed/contact smash), `2` Invisibility (`30 + 30*ac[10]` s), `3` Kaska Shield Helmet (`30` s -50% damage), `4` Carrot (`+90` HP + temp overheal), `5` Easter Egg (`+1` Campaign Extra Life).
- **11 Passive Skills (`mb` / `q.ac[0..10]`)**: Max levels `c = [3,3,2,1,2,2,2,1,1,1,1]`, costs `d = [100,100,60,80,70,80,90,80,50,80,80]`, workshop icon frames `[25,26,5,7,8,10,12,14,16,20,21]`.

---

## 5. Mandatory Web Multiplayer Architecture (`multiplayer.js` + `fb` MP parity)

- Preserve J2ME `fb` MP modes (`0` Deathmatch, `1` Team Deathmatch, `2` Capture The Flag) and maps (`maps/list`, 9 arena maps `maps/canyon_mp.map` .. `maps/waterfall_mp.map`) across **2–4 players** (`PK1000..PK9999` unique 6-char room prefix; max 8 alnum allowed by `api/mp.mjs`).
- Reuse the verified Quad Transport (`BackendApi`, `BroadcastChannel`, `ntfy.sh`, `MQTT-WSS`), `BackgroundHeartbeatWorker`, `#mp-lobby` UI overlay, `#btn-mp-lobby` toolbar trigger, in-game Main Menu Online Multiplayer button, and `?mp=<code>` auto-join URL sharing.
- Host acts as authoritative physics/bot/combat/CTF referee; Guests send edge/held input + quick weapon/gear selection to Host and render compact world/entity/projectile/crater/pickup/CTF-flag/HUD state frames locally using `q.x` / `q.w` slot perspective (`playerId`) so Guest always sees their own HUD HP/ammo/coins/score & win/loss panel accurately!
