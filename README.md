# BRImo Prank APK

Aplikasi Android ringan untuk prank: saat ikon dibuka, aplikasi tidak menampilkan layar penuh melainkan langsung memunculkan popup sistem:

> **Your phone can't open this app.**

Ketika pengguna menekan **OK** (atau menutup popup), aplikasi langsung keluar dan tidak muncul di recent apps.

## Build dari Source

```bash
cd android
./gradlew assembleRelease
```

File APK hasil build akan berada di `build/app/outputs/apk/release/app-release.apk`.
