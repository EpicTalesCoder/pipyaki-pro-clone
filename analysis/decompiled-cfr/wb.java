/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class wb {
    public static boolean b = false;
    private static boolean d = false;
    private static boolean e = false;
    private static boolean f = false;
    private static int g = 2;
    private static int h = 3 * g;
    private static boolean i = false;
    private static int j = 0;
    private static int k;
    private static int l;
    private static int[] m;
    private static int[] n;
    private static int[] o;
    private static int[] p;
    private static int[] q;
    private static int[] r;
    private static int[] s;
    private static int[] t;
    private static int u;
    public static int v;
    public static int w;
    public static int x;
    public static int y;
    public static Vector z;
    public static Image[] A;
    public static Image[] B;
    public static Image[] C;
    private static Image[] D;
    public static pb[] E;
    public static Image F;
    private static pb G;
    private static pb H;
    private static pb I;
    public static int J;
    public static int K;
    public static int L;
    public static int M;
    private static int N;
    private static int O;
    public static boolean P;
    private static int Q;
    private static int R;
    private static int S;
    private static int T;
    private static int U;

    public static void b() {
        new mc().start();
    }

    /*
     * Unable to fully structure code
     */
    public static void c() {
        block17: {
            block16: {
                block15: {
                    var2 = ab.xc;
                    try {
                        wb.A = new Image[5];
                        wb.B = new Image[3];
                        wb.C = new Image[3];
                        for (var0_1 = 0; var0_1 < 5; ++var0_1) {
                            wb.A[var0_1] = Image.createImage((String)("/intro/hills" + (var0_1 + 1) + ".png"));
                            v0 = var0_1;
                            v1 = 3;
                            if (!var2) {
                                if (v0 >= v1) continue;
                                wb.B[var0_1] = Image.createImage((String)("/intro/cloud_b" + (var0_1 + 1) + ".png"));
                                wb.C[var0_1] = Image.createImage((String)("/intro/cloud_s" + (var0_1 + 1) + ".png"));
                                if (!var2) continue;
                            }
                            ** GOTO lbl21
                        }
                        wb.D = new Image[wb.m.length];
                        var0_1 = 0;
                        do {
                            v0 = var0_1;
                            v1 = wb.m.length;
lbl21:
                            // 2 sources

                            if (v0 >= v1) break;
                            wb.D[var0_1] = Image.createImage((String)("/intro/w" + (var0_1 + 1) + ".png"));
                            ++var0_1;
                            if (var2) break block15;
                        } while (!var2);
                        v2 = new pb[2];
                        wb.E = v2;
                        v2[0] = new pb(Image.createImage((String)"/intro/leaf1.png"), 6, 6);
                        wb.E[1] = new pb(Image.createImage((String)"/intro/leaf2.png"), 8, 8);
                        wb.F = Image.createImage((String)"/intro/star.png");
                        wb.G = ab.b("intro/skip.png", 28, 28);
                        wb.H = ab.b("intro/bombaka_house_v1.png", 63, 63);
                        wb.S = -wb.H.d;
                        wb.T = 5 + ab.E / 8;
                        wb.I = ab.b("intro/pro_blood_short.png", 100, 73);
                        qb.M = ab.b("menu/loading.png", 34, 34);
                    }
                    catch (Exception v3) {}
                }
                wb.K = ab.D / 60 + 1;
                wb.L = ab.D / 180 + 1;
                wb.M = ab.D / 90 + 1;
                wb.z = new Vector<E>();
                wb.v = 0;
                wb.y = (ab.E << 1) / 3;
                wb.x = -wb.y * 10;
                wb.w = 0;
                var0_1 = 0;
                while (var0_1 < ab.D) {
                    var0_2 = new x(0, var0_1 + ab.oc.nextInt(ab.D / 8 + 20), wb.y);
                    wb.z.addElement(var0_2);
                    var0_1 = var0_2.c + var0_2.e;
                    if (!var2) {
                        if (!var2) continue;
                    }
                    break block16;
                }
                var0_1 = 0;
            }
            while (var0_1 < ab.D) {
                v4 = wb.y - wb.A[0].getHeight() - wb.B[0].getHeight() + 30;
                v5 = 2;
                if (!var2) {
                    if (v4 < v5) {
                        var1_5 = 2;
                    }
                    var0_3 = new x(1, var0_1 + ab.oc.nextInt(ab.D / 5), ab.oc.nextInt(var1_5) - 30);
                    wb.z.addElement(var0_3);
                    var0_1 = var0_3.c + var0_3.e;
                    if (!var2) continue;
                }
                ** GOTO lbl73
            }
            var0_1 = 0;
            do {
                v4 = var0_1;
                v5 = ab.D;
lbl73:
                // 2 sources

                if (v4 >= v5) break;
                v6 = wb.y / 2 - wb.C[0].getHeight();
                v7 = 2;
                if (var2) ** GOTO lbl87
                if (v6 < v7) {
                    var1_5 = 2;
                }
                var0_4 = new x(2, var0_1 + ab.oc.nextInt(ab.D / 4), ab.oc.nextInt(var1_5) + wb.y / 2);
                wb.z.addElement(var0_4);
                var0_1 = var0_4.c + var0_4.e;
            } while (!var2);
            var0_1 = 0;
            do {
                v6 = var0_1;
                v7 = ab.E / 40;
lbl87:
                // 2 sources

                if (v6 >= v7) break;
                v8 = wb.y - 20;
                if (var2) break block17;
                if (v8 < 2) {
                    var1_5 = 2;
                }
                wb.z.addElement(new x(3, ab.D + ab.oc.nextInt(ab.D / 2), ab.oc.nextInt(var1_5)));
                ++var0_1;
            } while (!var2);
            wb.P = true;
            v8 = 1;
        }
        wb.d = v8;
    }

    public static void d() {
        block14: {
            int n2;
            boolean bl;
            block13: {
                block12: {
                    block11: {
                        block10: {
                            bl = ab.xc;
                            z.removeAllElements();
                            z = null;
                            for (n2 = 0; n2 < A.length; ++n2) {
                                wb.A[n2] = null;
                                if (!bl) {
                                    if (!bl) continue;
                                }
                                break block10;
                            }
                            A = null;
                        }
                        for (n2 = 0; n2 < B.length; ++n2) {
                            wb.B[n2] = null;
                            if (!bl) {
                                if (!bl) continue;
                            }
                            break block11;
                        }
                        B = null;
                    }
                    for (n2 = 0; n2 < C.length; ++n2) {
                        wb.C[n2] = null;
                        if (!bl) {
                            if (!bl) continue;
                        }
                        break block12;
                    }
                    C = null;
                }
                for (n2 = 0; n2 < D.length; ++n2) {
                    wb.D[n2] = null;
                    if (!bl) {
                        if (!bl) continue;
                    }
                    break block13;
                }
                D = null;
            }
            for (n2 = 0; n2 < E.length; ++n2) {
                wb.E[n2] = null;
                if (!bl) {
                    if (!bl) continue;
                }
                break block14;
            }
            E = null;
            F = null;
            G = null;
            H = null;
            I = null;
            System.gc();
        }
    }

    public static void b(int n2) {
        if (ab.p || b || !d || v <= 0 || i) {
            return;
        }
        if (e) {
            if (n2 == ab.jb || n2 == ab.kb || n2 == ab.lb || n2 == ab.mb) {
                f = true;
                return;
            }
        } else {
            if (n2 == ab.jb || n2 == ab.lb) {
                f = true;
                ab.Gb = true;
                ab.Eb = 50;
                ab.Hb = true;
                ab.Fb = 50;
                ab.G.b("/midi/music_menu.mid", 2);
                return;
            }
            if (n2 == ab.kb || n2 == ab.mb) {
                ab.Gb = false;
                ab.Eb = 0;
                ab.Hb = false;
                ab.Fb = 0;
                ab.G.f();
                f = true;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void b(Graphics var0) {
        block73: {
            block69: {
                block68: {
                    block67: {
                        block66: {
                            var8_4 = ab.xc;
                            if (wb.Q > 240) {
                                wb.Q = 240;
                            }
                            var1_5 = 160 + 80 * wb.Q / 240;
                            var2_9 = 240 - 220 * wb.Q / 240;
                            var3_15 = 60 - 60 * wb.Q / 240;
                            var4_17 = 30 + 30 * wb.Q / 240;
                            var5_18 = 60 - 60 * wb.Q / 240;
                            var0.setColor(0);
                            var0.fillRect(0, 0, ab.D, ab.E);
                            if (!wb.d) {
                                return;
                            }
                            if (wb.v < 0) break block68;
                            var6_19 = wb.x / 10;
                            if (wb.y + var6_19 > 0) {
                                for (var7_20 = 0; var7_20 < wb.y; var7_20 += 2) {
                                    var0.setColor(var1_5 - (var1_5 - var4_17) * var7_20 / wb.y, var2_9 - (var2_9 - var5_18) * var7_20 / wb.y, var3_15 - var3_15 * var7_20 / wb.y);
                                    var0.fillRect(0, wb.y + var6_19 - var7_20 - 2, ab.D, 2);
                                    if (!var8_4) {
                                        if (!var8_4) continue;
                                    }
                                    break block66;
                                }
                            }
                            if (wb.z == null) break block66;
                            for (var7_20 = 0; var7_20 < wb.z.size(); ++var7_20) {
                                var1_6 = (x)wb.z.elementAt(var7_20);
                                v0 = var1_6.b;
                                v1 = 2;
                                if (!var8_4) {
                                    if (v0 != v1) continue;
                                    var1_6.b(var0);
                                    if (!var8_4) continue;
                                }
                                ** GOTO lbl36
                            }
                            var7_20 = 0;
                            do {
                                v0 = var7_20;
                                v1 = wb.z.size();
lbl36:
                                // 2 sources

                                if (v0 >= v1) break;
                                var1_7 = (x)wb.z.elementAt(var7_20);
                                v2 = var1_7.b;
                                v3 = 1;
                                if (var8_4) ** GOTO lbl49
                                if (v2 == v3) {
                                    var1_7.b(var0);
                                }
                                ++var7_20;
                            } while (!var8_4);
                            var7_20 = 0;
                            do {
                                v2 = var7_20;
                                v3 = wb.z.size();
lbl49:
                                // 2 sources

                                if (v2 >= v3) break;
                                var1_8 = (x)wb.z.elementAt(var7_20);
                                v4 = var1_8.b;
                                v5 = 1;
                                if (var8_4) break block67;
                                if (v4 != v5 && var1_8.b != 2) {
                                    var1_8.b(var0);
                                }
                                ++var7_20;
                            } while (!var8_4);
                        }
                        v4 = wb.v;
                        v5 = 2;
                    }
                    if (v4 > v5) {
                        wb.H.b(wb.S, wb.T + var6_19);
                        var7_20 = wb.U / 3;
                        if (var7_20 > 8) {
                            var7_20 = 8;
                        }
                        wb.H.b = var7_20;
                        wb.H.b(var0);
                    }
                    if (wb.v >= 2) {
                        for (var7_20 = 0; var7_20 < wb.m.length; ++var7_20) {
                            var0.drawImage(wb.D[var7_20], wb.o[var7_20] + wb.w, wb.p[var7_20] / 100 + var6_19, 0);
                            if (!var8_4) {
                                if (!var8_4) continue;
                            }
                            break block68;
                        }
                    }
                    if (wb.b || wb.v <= 0 || ab.p) break block68;
                    try {
                        block72: {
                            block71: {
                                if (!wb.e) break block71;
                                if (wb.f && wb.h < 3 * wb.g) {
                                    ++wb.h;
                                }
                                if (!wb.f && wb.h > 0) {
                                    --wb.h;
                                }
                                wb.G.b = 6 + wb.h / wb.g;
                                if (!var8_4) break block72;
                            }
                            if (!wb.i) {
                                if (wb.f && wb.h < 3 * wb.g) {
                                    ++wb.h;
                                }
                                if (!wb.f && wb.h > 0) {
                                    --wb.h;
                                }
                                wb.G.b = 0 + wb.h / wb.g;
                                wb.G.b(2, ab.E - 2 - wb.G.e);
                                wb.G.b(var0);
                                wb.G.b = 3 + wb.h / wb.g;
                            }
                        }
                        if (!wb.i) {
                            wb.G.b(ab.D - 2 - wb.G.d, ab.E - 2 - wb.G.e);
                            wb.G.b(var0);
                        }
                        if (wb.f && wb.h >= 3 * wb.g - 1 && ab.e) {
                            wb.i = true;
                        }
                        if (!(!wb.f || wb.h < 3 * wb.g - 1 || wb.e && wb.b || ab.e)) {
                            if (!wb.b && wb.e) {
                                wb.b = true;
                            }
                            if (!wb.e) {
                                wb.e = true;
                            }
                            wb.h = 3 * wb.g;
                            wb.f = false;
                        }
                    }
                    catch (Exception v6) {}
                }
                if (wb.b && wb.v == -1) {
                    if (++wb.j > 11) {
                        wb.j = 0;
                    }
                    qb.M.b = wb.j;
                    qb.M.b(ab.D - qb.M.d - 12, 12);
                    qb.M.b(var0);
                }
                if (wb.v >= 7 || wb.b) {
                    if ((var6_19 = ++wb.R / 2) > 4) {
                        var6_19 = 4;
                    }
                    wb.I.b((ab.D - wb.I.d) / 2, (ab.E - wb.I.e) / 2);
                    wb.I.b = var6_19;
                    wb.I.b(var0);
                }
                if (ab.p || !wb.d) {
                    return;
                }
                ++wb.Q;
                if (wb.v == -1) {
                    ab.k();
                    return;
                }
                wb.w -= wb.K;
                if (wb.v == 0 && (wb.x += ab.E / 30 - ab.E * wb.x * 3 / (30 * wb.y)) >= 0) {
                    wb.x = 0;
                    wb.v = 1;
                }
                if ((wb.v > 2 || wb.b) && (wb.S += wb.U / 12 + 2) > -30) {
                    ++wb.U;
                }
                if (wb.b) {
                    if (wb.x <= -wb.y * 10) {
                        var0_1 = wb.k;
                        var1_5 = wb.l;
                        wb.k = (0 + wb.k) / 2;
                        wb.l = (0 + wb.l) / 2;
                        if (var0_1 == wb.k && var1_5 == wb.l) {
                            wb.v = -1;
                            rc.b.repaint();
                            return;
                        }
                    } else {
                        wb.x -= ab.E / 30 - (ab.E * wb.x << 1) / (15 * wb.y);
                    }
                }
                var1_5 = -1;
                if (wb.z == null) break block73;
                for (var0_2 = 0; var0_2 < wb.z.size(); ++var0_2) {
                    block75: {
                        block77: {
                            block76: {
                                block74: {
                                    var3_16 = var2_10 = (x)wb.z.elementAt(var0_2);
                                    v7 = var2_10.b;
                                    v8 = 1;
                                    if (var8_4) break block69;
                                    if (v7 != v8) break block74;
                                    var3_16.c += wb.L;
                                    if (!var8_4) break block75;
                                }
                                if (var3_16.b != 2) break block76;
                                var3_16.c += wb.M;
                                if (!var8_4) break block75;
                            }
                            if (var3_16.b != 3) break block77;
                            var3_16.c -= var3_16.h;
                            ++var3_16.i;
                            if (var3_16.i <= 17) break block75;
                            var3_16.i = 0;
                            if (!var8_4) break block75;
                        }
                        if (var3_16.b == 4) {
                            ++var3_16.i;
                            if (var3_16.i > 9) {
                                var3_16.i = 0;
                            }
                        }
                    }
                    if (!(var3_16.c + wb.w >= -var3_16.e)) {
                        wb.z.removeElementAt(var0_2);
                        --var0_2;
                        if (var2_10.b == 1) {
                            var2_11 = wb.y - wb.A[0].getHeight() - wb.B[0].getHeight() + 30;
                            if (var2_11 < 2) {
                                var2_11 = 2;
                            }
                            wb.z.addElement(new x(1, ab.D - wb.w, ab.oc.nextInt(var2_11) - 30));
                            continue;
                        }
                        if (var2_10.b == 2) {
                            var2_12 = wb.y / 2 - wb.C[0].getHeight();
                            if (var2_12 < 2) {
                                var2_12 = 2;
                            }
                            wb.z.addElement(new x(2, ab.D - wb.w, ab.oc.nextInt(var2_12) + wb.y / 2));
                            continue;
                        }
                        if (var2_10.b != 3) continue;
                        var2_13 = wb.y - 20;
                        if (var2_13 < 2) {
                            var2_13 = 2;
                        }
                        wb.z.addElement(new x(3, ab.D - wb.w + ab.oc.nextInt(ab.D / 2), ab.oc.nextInt(var2_13)));
                        continue;
                    }
                    if (var2_10.b != 0) continue;
                    var1_5 = var0_2;
                    if (!var8_4) continue;
                }
                v7 = var1_5;
                v8 = -1;
            }
            if (v7 != v8 && (var2_14 = (x)wb.z.elementAt(var1_5)) != null && var2_14.b == 0 && var2_14.c + wb.w + var2_14.e < ab.D) {
                wb.z.addElement(new x(0, ab.D - wb.w + ab.oc.nextInt(ab.D / 8 + 20), wb.y));
            }
        }
        if (wb.v == 2 || wb.v == 4 || wb.v == 6) {
            block70: {
                var2_9 = 0;
                for (var0_3 = wb.N; var0_3 < wb.N + wb.O; ++var0_3) {
                    v9 = wb.r[var0_3];
                    if (!var8_4) {
                        if (v9 != 0) {
                            var2_9 = 1;
                            v10 = var0_3;
                            wb.p[v10] = wb.p[v10] + wb.q[var0_3];
                            v11 = var0_3;
                            wb.r[v11] = wb.r[v11] - 1;
                            if (!var8_4) continue;
                        }
                        if (wb.s[var0_3] >= wb.t.length) continue;
                        var2_9 = 1;
                        v12 = var0_3;
                        wb.p[v12] = wb.p[v12] - wb.t[wb.s[var0_3]] * 100;
                        v13 = var0_3;
                        wb.s[v13] = wb.s[v13] + 1;
                        if (!var8_4) continue;
                    }
                    break block70;
                }
                v9 = var2_9;
            }
            if (v9 == 0) {
                if (wb.b) {
                    wb.v = 10;
                    return;
                }
                ++wb.v;
            }
        }
    }

    public static void c(int n2) {
        int n3;
        boolean bl;
        block15: {
            block16: {
                block14: {
                    block13: {
                        block12: {
                            bl = ab.xc;
                            n3 = 240 - ab.D;
                            if (n3 <= 0) break block12;
                            n3 /= 10;
                            if (!bl) break block13;
                        }
                        n3 = 0;
                    }
                    if (v != 2) break block14;
                    u = n3 + 21;
                    N = 0;
                    O = 14;
                    if (!bl) break block15;
                }
                if (v != 4) break block16;
                if (n3 >= 2) {
                    n3 -= 2;
                }
                u = n3 + 17;
                N = 14;
                O = 9;
                if (!bl) break block15;
            }
            if (v == 6) {
                u = n3 + 19;
                N = 23;
                O = 9;
            }
        }
        n3 = N;
        while (n3 < N + O) {
            block18: {
                int n4;
                block17: {
                    wb.o[n3] = n2 + m[n3];
                    n4 = y - n[n3] - D[n3].getHeight();
                    if (n3 != 22 && n3 != 31) break block17;
                    wb.r[n3] = 0;
                    wb.s[n3] = t.length;
                    wb.p[n3] = n4;
                    if (!bl) break block18;
                }
                wb.p[n3] = -D[n3].getHeight() - 20 * (n3 - N);
                wb.o[n3] = n2 + m[n3];
                wb.r[n3] = u + ab.oc.nextInt(7);
                wb.q[n3] = (n4 - p[n3]) * 100 / r[n3];
            }
            int n5 = n3++;
            p[n5] = p[n5] * 100;
            if (!bl) continue;
        }
    }

    static {
        m = new int[]{2, 15, 31, 43, 53, 62, 72, 88, 99, 106, 116, 126, 130, 140, 9, 20, 28, 37, 45, 54, 64, 71, 119, 26, 43, 49, 61, 70, 83, 95, 107, 132};
        n = new int[]{1, 5, 9, 11, 11, 10, 8, 8, 10, 12, 14, 15, 15, 14, 3, 6, 8, 10, 11, 11, 10, 9, 4, 8, 11, 11, 10, 8, 8, 9, 12, 5};
        o = new int[m.length];
        p = new int[m.length];
        q = new int[m.length];
        r = new int[m.length];
        s = new int[m.length];
        t = new int[]{5, 4, 3, 1, 0, 0, 0, 0, -1, -3, -4, -5, 2, 1, 0, -1, -2};
        J = -1;
        Q = 0;
        R = -1;
        U = 0;
    }
}

