# Pipyaki Pro (`Pipyaki Pro`) — Standalone Clone

- **Vendor**: DaSuppaStudios
- **Resolution**: `240×320`
- **Genre**: Hành động đặt bom / Bắn dưa · J2ME Port

- 1:1 J2ME 240×320 Engine: Intro parallax `wb`, Menu xoay phóng to/nhỏ `qb`/`gb`, Bitmap font VI có dấu (`font.png`+`font.cfg`) & MIDI gốc
- 25 màn Chiến dịch cốt truyện đầy đủ + Cửa hàng 14 vũ khí (Dưa hấu, Gạch ngói, Dứa rừng, Tất thối, Bừa cào, Bom bẫy...), 6 trang bị & 11 kỹ năng nâng cấp
- Chế độ Đấu trường (Deathmatch, Team Match, Capture the Flag) trên 9 bản đồ gốc cùng AI Bots
- Chơi nhiều người 2–4 người Online / LAN / Đa Tab (?mp=PKxxxx, Host-authoritative 25Hz + BroadcastChannel / API / WSS)

## Project Layout

- `original/` — Original untouched J2ME `.jar`
- `analysis/` — Decompiled Java sources, `javap` bytecode dumps, and decoded binary tables/assets
- `web-port/` — HTML5 Canvas/WebGL + ES Modules web port & Node unit tests
- `api/mp.mjs` — Same-origin multiplayer relay (`/api/mp`) for Vercel & Discord Activity
- `tools/build-dist.py` — Packages `web-port/` to `dist/` with cache-busting `?v=<timestamp>`
- `tools/verify-port-parity.py` — Runs syntax, unit tests, and decompilation parity checks


## Run, Test & Deploy

```bash
# Run unit tests
npm test

# Run parity checks
python3 tools/verify-port-parity.py

# Build dist/ and preview locally
npm run build
npm start
```
