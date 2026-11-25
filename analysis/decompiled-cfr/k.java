/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FilterInputStream;

public final class k {
    public static final int[][] b = new int[][]{{-10, -12, 45}, {-12, -10, 55}, {-10, -37, 110}, {-30, -30, 150}, {-10, -25, 50}, {5, -20, 81}, {-12, -25, 140}, {0, -18, 60}};
    private static int[][][] c = new int[][][]{new int[][]{{0, 2, 400, 30}, {0, 2, 350, 30}, {0, 2, 200, 30}, {0, 2, 200, 30}, {0, 2, 350, 30}, {0, 2, 300, 30}, {0, 2, 500, 30}, {0, 2, 150, 30}, {0, 2, 200, 30}, {0, 2, 200, 30}, {0, 2, 150, 30}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {0, 2, 20, 80}, {0, 2, 20, 80}, {0, 2, 20, 80}, {0, 2, 20, 80}, {0, 2, 20, 80}, {0, 2, 60, 90}, {0, 2, 60, 90}, {0, 0, 0, 0}}, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 2, 1000, 30}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {0, 2, 30, 80}, {0, 2, 30, 80}, {0, 2, 30, 80}, {0, 2, 30, 80}, {0, 2, 30, 80}, {0, 2, 70, 80}, {0, 2, 70, 80}, {0, 2, 70, 80}, {0, 2, 60, 80}, {0, 2, 60, 80}, {0, 0, 0, 0}, {0, 0, 0, 0}}, new int[][]{{1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}}, new int[][]{{1, 1, 0, 0}, {1, 1, 0, 0}}, new int[][]{{1, 1, 0, 0}, {1, 1, 0, 0}}, new int[][]{{1, 1, 0, 0}, {1, 1, 0, 0}}, new int[][]{{1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}}};
    private static Class d;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static boolean b(byte[] var0, boolean var1_5) {
        block99: {
            block94: {
                block95: {
                    var17_6 = ab.xc;
                    var2_7 = null;
                    var3_8 = null;
                    var4_9 = null;
                    var5_10 = null;
                    y.N = new int[14];
                    var2_7 = new ByteArrayInputStream(var0);
                    var3_8 = new DataInputStream(var2_7);
                    if (var3_8.readByte() != -87) break block94;
                    var0_1 = var3_8.readByte();
                    if (var0_1 >= 2) break block95;
                    System.out.println("OLD MAP FORMAT!");
                    try {
                        var3_8.close();
                        var2_7.close();
                    }
                    catch (Exception v0) {}
                    return false;
                }
                var3_8.readInt();
                fb.Pe = var3_8.readByte();
                fb.Qe = var3_8.readByte();
                ab.A.d();
                var0_1 = var3_8.readInt();
                var6_11 = new byte[var0_1];
                var3_8.read(var6_11, 0, var0_1);
                var5_10 = new ByteArrayInputStream(var6_11);
                var4_9 = new DataInputStream(var5_10);
                var0_1 = var3_8.readInt();
                var6_11 = new byte[var0_1];
                var3_8.read(var6_11, 0, var0_1);
                ab.c(var6_11[0]);
                ab.s = var6_11[1];
                ab.v = false;
                if (fb.i()) {
                    ab.v = var6_11[2] == 1;
                }
                block16: while (true) {
                    try {
                        v1 = var4_9.readByte();
lbl45:
                        // 5 sources

                        while (true) {
                            var0_2 = v1;
                            break;
                        }
                    }
                    catch (Exception v2) {
                        break;
                    }
                    v3 = var0_2;
                    do {
                        block111: {
                            block96: {
                                block100: {
                                    if (v3 != 0) break block100;
                                    var0_2 = 0;
                                    do {
                                        v4 = var0_2;
                                        block20: while (true) {
                                            if (v4 >= fb.Pe) continue block16;
                                            v1 = 0;
                                            if (var17_6) ** GOTO lbl45
                                            for (var6_12 = v118884; var6_12 < fb.Qe; ++var6_12) {
                                                block101: {
                                                    block103: {
                                                        block102: {
                                                            v4 = (byte)var4_9.readByte();
                                                            if (var17_6) continue block20;
                                                            if (v4 <= 0) break block101;
                                                            if (ab.oc.nextInt(4) != 0) break block102;
                                                            var7_14 = ab.oc.nextInt(9) + 27;
                                                            if (!var17_6) break block103;
                                                        }
                                                        var7_14 = ab.oc.nextInt(6);
                                                    }
                                                    ++var7_14;
                                                }
                                                fb.Re[var0_2][var6_12].b = var7_14;
                                                if (!var17_6) continue;
                                            }
                                            break;
                                        }
                                        ++var0_2;
                                    } while (!var17_6);
                                }
                                v5 = var0_2;
                                v6 = 1;
                                block22: while (true) {
                                    block104: {
                                        if (v5 != v6) break block104;
                                        var0_2 = 0;
                                        do {
                                            v7 = var0_2;
                                            block24: while (true) {
                                                if (v7 >= fb.Pe) continue block16;
                                                v1 = 0;
                                                if (var17_6) ** GOTO lbl45
                                                for (var6_12 = v118884; var6_12 < fb.Qe; ++var6_12) {
                                                    v7 = (byte)var4_9.readByte();
                                                    if (var17_6) continue block24;
                                                    if (v7 > 0) {
                                                        fb.Re[var0_2][var6_12].b = var7_14 + 6;
                                                    }
                                                    fb.Re[var0_2][var6_12].c = var7_14;
                                                    if (!var17_6) continue;
                                                }
                                                break;
                                            }
                                            ++var0_2;
                                        } while (!var17_6);
                                    }
                                    if (var0_2 != 2) break block96;
                                    var9_16 = var4_9.readShort();
                                    for (var11_20 = 0; var11_20 < var9_16; ++var11_20) {
                                        block108: {
                                            block110: {
                                                block109: {
                                                    block107: {
                                                        block106: {
                                                            block105: {
                                                                var0_2 = var4_9.readByte();
                                                                var6_12 = var4_9.readByte();
                                                                v5 = var4_9.readByte();
                                                                v6 = -1;
                                                                if (var17_6) continue block22;
                                                                if (v5 == v6) break block105;
                                                                var7_14 = var4_9.readByte();
                                                                var10_19 = var4_9.readByte();
                                                                if (!var17_6) break block106;
                                                            }
                                                            var7_14 = 0;
                                                            var10_19 = 0;
                                                        }
                                                        if (var8_15 != 1) break block107;
                                                        fb.e(0);
                                                        if (!var17_6) break block108;
                                                    }
                                                    if (var8_15 != 3) break block109;
                                                    fb.e(2);
                                                    if (!var17_6) break block108;
                                                }
                                                if (var8_15 != 5) break block110;
                                                fb.e(3);
                                                if (!var17_6) break block108;
                                            }
                                            if (var8_15 == 7) {
                                                fb.e(4);
                                            }
                                        }
                                        if (var8_15 == 2) {
                                            fb.Re[var0_2][var6_12].d = new j(0, 0, (byte)var0_2, var6_12, var10_19);
                                            fb.Re[var0_2 + 2][var6_12].d = new j(0, 0, (byte)(var0_2 + 2), var6_12, var10_19);
                                            if (!var17_6) continue;
                                        }
                                        if (var8_15 == -1 && fb.Re[var0_2][var6_12].d != null || (ab.bc != 7 ? ab.bc == 17 && var0_2 == 10 && var6_12 == 10 : var0_2 == 5 && var6_12 == 29)) continue;
                                        fb.Re[var0_2][var6_12].d = new j(var8_15, (byte)var7_14, (byte)var0_2, var6_12, var10_19);
                                        if (!var17_6) continue;
                                    }
                                    break;
                                }
                                if (!var17_6) continue block16;
                            }
                            if (var0_2 != 3) break block111;
                            var13_23 = var4_9.readInt();
                            var12_22 = 0;
                            block27: while (true) {
                                v8 = var12_22;
                                v9 = var13_23;
                                block28: while (v8 < v9) {
                                    var0_2 = var4_9.readShort();
                                    var6_12 = (byte)var4_9.readShort();
                                    var8_15 = var4_9.readByte();
                                    var7_14 = var4_9.readByte();
                                    var11_20 = var0_2 / 30;
                                    var14_25 = var6_12 / 30;
                                    var10_19 = k.c[var8_15][var7_14][0];
                                    var9_16 = k.c[var8_15][var7_14][1];
                                    v1 = var10_19;
                                    if (var17_6) ** GOTO lbl45
                                    if (v1 == 0) {
                                        if (ab.Jb) {
                                            // empty if block
                                        }
                                    } else if (!(var10_19 != 1 || ab.Jb && var8_15 != 3 && var8_15 != 4 && var8_15 != 5 && var8_15 != 2)) {
                                        var15_27 = 0;
                                        if ((var9_16 == 1 || var9_16 == 3) && fb.Re[var11_20][var14_25].d == null) {
                                            fb.Re[var11_20][var14_25].d = new j(-1, 0, (byte)var11_20, (byte)var14_25, 0);
                                            var15_27 = 1;
                                        }
                                        if (var6_12 % 30 >= 22 || var15_27 != 0) {
                                            if (fb.Re[var11_20][var14_25].f == null) {
                                                var9_17 = fb.Re[var11_20][var14_25];
                                                fb.Re[var11_20][var14_25].f = new int[]{-1, -1, -1};
                                            }
                                            for (var16_28 = 0; var16_28 < fb.Re[var11_20][var14_25].f.length; ++var16_28) {
                                                v8 = fb.Re[var11_20][var14_25].f[var16_28];
                                                v9 = -1;
                                                if (var17_6) continue block28;
                                                if (v8 != v9) continue;
                                                k.b(var8_15);
                                                fb.Rd.addElement(new o(var8_15, (byte)var7_14, var0_2, var6_12));
                                                fb.Re[var11_20][var14_25].f[var16_28] = fb.Rd.size() - 1;
                                                if (!var17_6) break;
                                                if (!var17_6) continue;
                                                break;
                                            }
                                        } else {
                                            if (fb.Re[var11_20][var14_25].e == null) {
                                                var9_18 = fb.Re[var11_20][var14_25];
                                                fb.Re[var11_20][var14_25].e = new int[]{-1, -1, -1};
                                            }
                                            for (var16_28 = 0; var16_28 < fb.Re[var11_20][var14_25].e.length; ++var16_28) {
                                                v8 = fb.Re[var11_20][var14_25].e[var16_28];
                                                v9 = -1;
                                                if (var17_6) continue block28;
                                                if (v8 != v9) continue;
                                                k.b(var8_15);
                                                fb.Rd.addElement(new o(var8_15, (byte)var7_14, var0_2, var6_12));
                                                fb.Re[var11_20][var14_25].e[var16_28] = fb.Rd.size() - 1;
                                                if (var17_6) {
                                                    if (!var17_6) continue;
                                                }
                                                break;
                                            }
                                        }
                                    }
                                    ++var12_22;
                                    if (!var17_6) continue block27;
                                }
                                break;
                            }
                            if (!var17_6) continue block16;
                        }
                        if (var0_2 != 4) continue block16;
                        var9_16 = var4_9.readInt();
                        v3 = 0;
                    } while (var17_6);
                    for (var10_19 = v118885; var10_19 < var9_16; ++var10_19) {
                        block122: {
                            block126: {
                                block128: {
                                    block127: {
                                        block125: {
                                            block124: {
                                                block123: {
                                                    block121: {
                                                        block98: {
                                                            block113: {
                                                                block120: {
                                                                    block119: {
                                                                        block118: {
                                                                            block117: {
                                                                                block116: {
                                                                                    block115: {
                                                                                        block114: {
                                                                                            block112: {
                                                                                                var7_14 = var4_9.readByte();
                                                                                                var0_2 = var4_9.readByte();
                                                                                                var6_13 = var4_9.readByte();
                                                                                                v10 = var4_9.readByte();
                                                                                                var11_20 = v10;
                                                                                                var13_24 = new byte[v10];
                                                                                                v1 = 0;
                                                                                                if (var17_6) ** continue;
                                                                                                for (var12_22 = v118884; var12_22 < var11_20; var12_22 = (int)((byte)(var12_22 + 1))) {
                                                                                                    var13_24[var12_22] = var4_9.readByte();
                                                                                                    if (!var17_6) {
                                                                                                        if (!var17_6) continue;
                                                                                                    }
                                                                                                    break block98;
                                                                                                }
                                                                                                if (var7_14 != 0) break block98;
                                                                                                if (var13_24[0] == 2) {
                                                                                                    var13_24[0] = 3;
                                                                                                }
                                                                                                if (var13_24[0] != 1) break block112;
                                                                                                fb.e(6);
                                                                                                if (!var17_6) break block113;
                                                                                            }
                                                                                            if (var13_24[0] != 4) break block114;
                                                                                            fb.e(7);
                                                                                            if (!var17_6) break block113;
                                                                                        }
                                                                                        if (var13_24[0] != 8) break block115;
                                                                                        fb.e(6);
                                                                                        if (!var17_6) break block113;
                                                                                    }
                                                                                    if (var13_24[0] != 5) break block116;
                                                                                    fb.e(6);
                                                                                    fb.e(8);
                                                                                    if (!var17_6) break block113;
                                                                                }
                                                                                if (var13_24[0] != 7) break block117;
                                                                                fb.e(6);
                                                                                fb.e(9);
                                                                                if (!var17_6) break block113;
                                                                            }
                                                                            if (var13_24[0] != 6) break block118;
                                                                            fb.e(6);
                                                                            fb.e(10);
                                                                            if (!var17_6) break block113;
                                                                        }
                                                                        if (var13_24[0] != 2) break block119;
                                                                        fb.e(11);
                                                                        if (!var17_6) break block113;
                                                                    }
                                                                    if (var13_24[0] != 3) break block120;
                                                                    fb.e(12);
                                                                    if (!var17_6) break block113;
                                                                }
                                                                if (var13_24[0] == 9) {
                                                                    fb.e(18);
                                                                }
                                                            }
                                                            var11_21 = new sb((byte)var0_2, var6_13, var13_24[0], var13_24[1], var13_24[2], var13_24[3], var13_24[4], var13_24[5], var13_24[6] == 1, var13_24[7], var13_24[8] == 1, var13_24[9] == 1, var13_24[10] == 1);
                                                            if (var13_24[0] != 9 || j.c(var0_2, var6_13)) continue;
                                                            fb.Re[var0_2][var6_13].d = new j(-1, (byte)var7_14, (byte)var0_2, var6_13, 0);
                                                            var11_21.r = new nb(fb.sd);
                                                            var11_21.s = var0_2;
                                                            var11_21.t = var6_13;
                                                            continue;
                                                        }
                                                        if (var7_14 != 1) break block121;
                                                        k.b(var13_24, var0_2, var6_13, var1_5, true);
                                                        if (!var17_6) break block122;
                                                    }
                                                    if (var7_14 != 3) break block123;
                                                    k.c(var13_24, var0_2, var6_13, var1_5, true);
                                                    if (var1_5 && !ab.v) {
                                                        continue;
                                                    }
                                                    break block122;
                                                }
                                                if (var7_14 != 2) break block124;
                                                if (var13_24[0] >= 4) break block122;
                                                new s(1, (byte)var0_2, var6_13, false);
                                                if (!var17_6) break block122;
                                            }
                                            if (var7_14 != 4 && var7_14 != 5) break block125;
                                            if (fb.j() != 2) {
                                                continue;
                                            }
                                            break block122;
                                        }
                                        if (var7_14 != 6) break block126;
                                        if (var13_24[0] != 0) break block127;
                                        hb.b((byte)-1, (byte)var0_2, var6_13, null, null);
                                        if (!var17_6) break block122;
                                    }
                                    if (var13_24[0] != 1) break block128;
                                    hb.b((byte)-2, (byte)var0_2, var6_13, null, null);
                                    if (!var17_6) break block122;
                                }
                                if (var13_24[0] != 2) break block122;
                                hb.b((byte)-3, (byte)var0_2, var6_13, null, null);
                                if (!var17_6) break block122;
                            }
                            if (var7_14 == 7) {
                                if (!fb.i() && (var13_24[0] == 3 || var13_24[0] == 4)) continue;
                                if (var13_24[0] == 5) {
                                    fb.e(17);
                                }
                                new v((byte)var0_2, var6_13, var13_24[0], var13_24[1], var13_24[2], var13_24[3], var13_24[4], var13_24[5], var13_24[6], var13_24[7], var13_24[8] == 1, var13_24[9] == 1, var13_24[10] == 1, var13_24[11], var13_24[12], var13_24[13] == 1, var13_24[14]);
                                if (!var17_6) continue;
                            }
                            if (var7_14 == 8) {
                                var11_20 = 5;
                                var14_26 = null;
                                if (var13_24[0] == 0 && fb.Lc != null) {
                                    var14_26 = new t(0, fb.Lc, 10, 0, 0, 0, -5);
                                    var11_20 = 10;
                                }
                                if (var14_26 == null) continue;
                                var7_14 = var13_24[4] > 0 ? var13_24[4] * 25 : -1;
                                var15_27 = var13_24[1];
                                var16_28 = var13_24[2];
                                v11 = new r(null, var0_2 * 30 + 15, var6_13 * 30 + 15, var15_27, var16_28, var11_20, var7_14, var14_26);
                                var6_13 = var13_24[3] == 0 ? 1 : 0;
                                var0_3 = v11;
                                v11.A = var6_13;
                                continue;
                            }
                        }
                        fb.Sd.addElement(new g((byte)var7_14, (byte)var0_2, var6_13, var13_24));
                        if (!var17_6) continue;
                    }
                    if (var17_6) break;
                }
                var5_10.close();
                var4_9.close();
                y.l();
                try {
                    var4_9.close();
                    var5_10.close();
                    var3_8.close();
                    var2_7.close();
                }
                catch (Exception v12) {}
                return true;
            }
            try {
                var3_8.close();
                var2_7.close();
            }
            catch (Exception v13) {}
            break block99;
            catch (Exception v14) {
                try {
                    if (var4_9 != null) {
                        var4_9.close();
                    }
                    if (var5_10 != null) {
                        var5_10.close();
                    }
                    if (var3_8 != null) {
                        var3_8.close();
                    }
                    if (var2_7 != null) {
                        var2_7.close();
                    }
                    break block99;
                }
                catch (Exception v15) {}
                break block99;
            }
            catch (Throwable var0_4) {
                try {
                    if (var4_9 != null) {
                        var4_9.close();
                    }
                    if (var5_10 != null) {
                        var5_10.close();
                    }
                    if (var3_8 != null) {
                        var3_8.close();
                    }
                    if (var2_7 != null) {
                        var2_7.close();
                    }
                }
                catch (Exception v16) {}
                throw var0_4;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean b(String object, boolean bl) {
        FilterInputStream filterInputStream = null;
        boolean bl2 = false;
        try {
            filterInputStream = new DataInputStream((d == null ? (d = k.b("midlet")) : d).getResourceAsStream((String)object));
            object = new byte[filterInputStream.available()];
            ((DataInputStream)filterInputStream).readFully((byte[])object);
            bl2 = k.b((byte[])object, bl);
        }
        catch (Exception exception) {
            try {
                if (filterInputStream == null) return bl2;
                filterInputStream.close();
                return bl2;
            }
            catch (Exception exception2) {
                return bl2;
            }
        }
        catch (Throwable throwable) {
            try {
                if (filterInputStream == null) throw throwable;
                filterInputStream.close();
                throw throwable;
            }
            catch (Exception exception) {}
            throw throwable;
        }
        try {
            filterInputStream.close();
            return bl2;
        }
        catch (Exception exception) {
            return bl2;
        }
    }

    public static String b(DataInputStream dataInputStream) {
        boolean bl = ab.xc;
        String string = "";
        while (true) {
            int n2;
            block10: {
                block12: {
                    block11: {
                        int n3;
                        int n4;
                        block9: {
                            block8: {
                                if ((n2 = dataInputStream.read()) == -1) break block8;
                                n4 = n2;
                                n3 = 13;
                                if (bl) break block9;
                                if (n4 != n3 && n2 != 59) break block10;
                            }
                            n4 = n2;
                            n3 = 13;
                        }
                        if (n4 != n3) break block11;
                        dataInputStream.read();
                        if (!bl) break block12;
                    }
                    if (n2 == 59) {
                        while ((n2 = dataInputStream.read()) != -1 && n2 != 13 && n2 != 59) {
                        }
                    } else if (n2 == -1 && string.equals("")) {
                        return null;
                    }
                }
                return string.trim();
            }
            string = string + (char)n2;
        }
    }

    private static void b(int n2) {
        if (n2 == 3) {
            fb.e(13);
            return;
        }
        if (n2 == 4) {
            fb.e(14);
            return;
        }
        if (n2 == 5) {
            fb.e(15);
        }
    }

    public static void b(byte[] byArray, int n2, int n3, boolean bl, boolean bl2) {
        boolean bl3 = true;
        if (bl2 && byArray[1] == 0) {
            bl3 = false;
        }
        if (!bl2 && byArray[1] == 1) {
            bl3 = false;
        }
        if (byArray[0] == 0 && !bl && bl3) {
            hb.b((byte)11, (byte)n2, (byte)n3, null, null);
            y.N[11] = y.N[11] + 1;
        }
        if (byArray[0] == 1 && bl3) {
            hb.b((byte)10, (byte)n2, (byte)n3, null, null);
            y.N[10] = y.N[10] + 1;
        }
        if (byArray[0] == 2 && bl3) {
            hb.b((byte)13, (byte)n2, (byte)n3, null, null);
        }
        if ((byArray[0] == 3 || byArray[0] == 4 || byArray[0] == 5 || byArray[0] == 6) && bl3) {
            hb hb2 = hb.b((byte)5, (byte)n2, (byte)n3, null, null);
            if (byArray[0] > 3) {
                hb2.E = false;
                hb2.b((byte)(byArray[0] - 3), null);
            }
        }
    }

    public static void c(byte[] byArray, int n2, int n3, boolean bl, boolean bl2) {
        boolean bl3 = true;
        if (bl2 && byArray[2] == 0) {
            bl3 = false;
        }
        if (!bl2 && byArray[2] == 1) {
            bl3 = false;
        }
        if (byArray[0] == 0 && !bl && bl3) {
            new s(2, (byte)n2, (byte)n3, byArray[1] == 1);
        }
        if (byArray[0] == 1 && !bl && bl3) {
            new s(3, (byte)n2, (byte)n3, byArray[1] == 1);
        }
        if (byArray[0] == 2 && !bl && bl3) {
            new s(4, (byte)n2, (byte)n3, byArray[1] == 1);
        }
        if (byArray[0] == 3 && !bl && bl3) {
            new s(5, (byte)n2, (byte)n3, byArray[1] == 1);
        }
        if (byArray[0] == 4) {
            if (!bl && bl3) {
                new s(7, (byte)n2, (byte)n3, byArray[1] == 1);
            }
            y.N[2] = y.N[2] + 1;
        }
        if (byArray[0] == 5) {
            if (!bl && bl3) {
                new s(8, (byte)n2, (byte)n3, byArray[1] == 1);
            }
            y.N[5] = y.N[5] + 1;
        }
        if (byArray[0] == 6) {
            if (!bl && bl3) {
                new s(9, (byte)n2, (byte)n3, byArray[1] == 1);
            }
            y.N[3] = y.N[3] + 1;
        }
        if (byArray[0] == 7 && !bl && bl3) {
            new s(10, (byte)n2, (byte)n3, byArray[1] == 1);
        }
        if (byArray[0] == 8) {
            if (!bl && bl3) {
                new s(11, (byte)n2, (byte)n3, byArray[1] == 1);
            }
            y.N[0] = y.N[0] + 1;
        }
        if (byArray[0] == 9 && !bl && bl3) {
            new s(12, (byte)n2, (byte)n3, byArray[1] == 1);
        }
        if (byArray[0] == 10) {
            if (!bl && bl3) {
                new s(13, (byte)n2, (byte)n3, byArray[1] == 1);
            }
            y.N[7] = y.N[7] + 1;
        }
        if (byArray[0] == 11) {
            if (!bl && bl3) {
                new s(14, (byte)n2, (byte)n3, byArray[1] == 1);
            }
            y.N[12] = y.N[12] + 1;
        }
        if (byArray[0] == 12) {
            if (!bl && bl3) {
                new s(15, (byte)n2, (byte)n3, byArray[1] == 1);
            }
            y.N[13] = y.N[13] + 1;
        }
        if (byArray[0] == 13 && !bl && bl3) {
            new s(17, (byte)n2, (byte)n3, byArray[1] == 1);
        }
    }

    private static Class b(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError(classNotFoundException.getMessage());
        }
    }
}

