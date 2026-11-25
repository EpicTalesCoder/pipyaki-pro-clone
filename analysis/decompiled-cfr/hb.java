/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class hb {
    public static int[] b;
    public static int[] c;
    public static int[] d;
    public static int[] e;
    public static final int[] f;
    public static int[] g;
    public static int[] h;
    private static int i;
    private static byte[] j;
    private static byte[] k;
    private static byte[] l;
    private static int m;
    private static int n;
    public byte o;
    public boolean p;
    public byte q;
    public byte r;
    private byte s;
    private byte t;
    private boolean u;
    private u v;
    private nb w;
    public q x;
    private q y;
    public q z;
    private boolean A;
    private boolean B;
    private boolean C;
    private int D;
    public boolean E;
    public boolean F;
    private byte[] G;
    private byte H;
    private boolean I;
    private boolean J;
    private int K;
    private int L;
    private int M;
    private byte N;
    private byte O;
    private boolean P;
    public static boolean[][] Q;
    public boolean R;
    public boolean S;
    private boolean T;
    private r U;

    /*
     * Unable to fully structure code
     */
    private hb(byte var1_1, byte var2_2, byte var3_3, q var4_4, byte[] var5_5) {
        var7_6 = ab.xc;
        super();
        this.o = var1_1;
        this.s = this.q = var2_2;
        this.t = this.r = var3_3;
        var1_1 = (byte)(var2_2 * 30 + 15);
        var6_7 = var3_3 * 30 + 15;
        if (hb.Q == null) {
            hb.Q = new boolean[fb.Pe][fb.Qe];
        }
        this.x = var4_4;
        this.y = var4_4;
        this.G = var5_5;
        this.L = -1;
        this.D = -1;
        this.M = q.b(this.x, (int)this.o);
        switch (this.o) {
            case -1: {
                this.S = true;
                this.B = true;
                this.N = (byte)-1;
                if (!var7_6) break;
            }
            case -3: {
                this.S = true;
                this.B = true;
                if (!var7_6) break;
            }
            case -4: {
                this.v = new u(fb.id, 0, -1, -1, var1_1, var6_7, 20, 0, 5, false, true, true);
                this.K = 150;
                this.N = 0;
                if (this.x != null) {
                    this.b(this.x.k(), this.x);
                }
                this.T = true;
                this.J = true;
                if (!var7_6) break;
            }
            case -5: {
                this.v = new u(fb.od, 0, -1, -1, var1_1, var6_7, 500, 0, 100, false, true, false);
                this.v.R = u.u;
                this.v.M = true;
                this.K = 100;
                this.L = -1;
                this.D = -1;
                this.N = (byte)2;
                this.O = (byte)4;
                if (this.x != null) {
                    this.b(this.x.k(), this.x);
                }
                this.T = true;
                if (!var7_6) break;
            }
            case -6: {
                this.v = new u(fb.qd, 0, -1, -1, var1_1, var6_7, 1, 1, 1, false, false, false);
                this.v.M = true;
                this.B = false;
                this.C = false;
                this.v.R = u.t;
                this.O = (byte)6;
                this.N = (byte)3;
                this.u = true;
                this.L = -1;
                this.D = -1;
                if (this.x == null) break;
                this.b(this.x.k(), this.x);
                if (!var7_6) break;
            }
            case 0: {
                this.v = new u(fb.Bb, 2, -1, -1, var1_1, var6_7, 200, 1, 10, false, true, false);
                this.v.R = u.u;
                this.K = 160;
                this.L = 75;
                this.D = 75;
                this.N = (byte)5;
                this.O = 1;
                this.R = true;
                if (!var7_6) break;
            }
            case 1: {
                this.v = new u(fb.Ib, 2, -1, -1, var1_1, var6_7, 200, 100, 0, false, true, false);
                this.v.R = u.u;
                this.K = 100;
                this.L = 75;
                this.D = 75;
                this.N = (byte)5;
                this.O = (byte)8;
                this.R = true;
                if (!var7_6) break;
            }
            case 3: {
                this.v = new u(fb.Fb, 2, -1, -1, var1_1, var6_7, 100, 0, 1, false, true, false);
                this.v.R = u.u;
                this.K = 150;
                this.L = -1;
                this.D = -1;
                this.N = (byte)2;
                this.O = 1;
                if (this.x != null) {
                    this.b(this.x.k(), this.x);
                }
                this.T = true;
                if (!var7_6) break;
            }
            case 4: {
                this.v = new u(fb.Jb, 2, -1, -1, var1_1, var6_7, 100, 0, 1, false, true, false);
                this.v.R = u.u;
                this.K = 150;
                this.L = -1;
                this.D = -1;
                this.N = (byte)2;
                this.B = true;
                this.O = (byte)8;
                if (this.x != null) {
                    this.b(this.x.k(), this.x);
                }
                this.T = true;
                if (!var7_6) break;
            }
            case 5: {
                this.v = new u(fb.Cb, 2, -1, -1, var1_1, var6_7, 200, 100, 0, false, true, false);
                this.v.R = u.u;
                this.v.L = true;
                this.K = 50;
                this.N = (byte)5;
                this.O = 1;
                if (this.x == null) ** GOTO lbl117
                this.b(this.x.k(), this.x);
                if (!var7_6) ** GOTO lbl118
lbl117:
                // 2 sources

                this.b((byte)0, null);
lbl118:
                // 2 sources

                this.T = true;
                if (!var7_6) break;
            }
            case 6: {
                this.v = new u(fb.Kb, 2, -1, -1, var1_1, var6_7, 200, 100, 0, false, true, false);
                this.v.R = u.u;
                this.v.L = true;
                this.K = 60;
                this.N = (byte)5;
                this.L = 1;
                this.D = 0;
                this.O = (byte)8;
                if (this.x != null) {
                    this.b(this.x.k(), this.x);
                }
                this.T = true;
                if (!var7_6) break;
            }
            case 7: {
                this.v = new u(fb.Gb, 0, -1, -1, var1_1, var6_7, 200, 0, 100, false, false, false);
                this.v.R = u.u;
                if (this.G == null) ** GOTO lbl139
                this.K = this.G[0] * 6;
                if (!var7_6) ** GOTO lbl140
lbl139:
                // 2 sources

                this.K = 60;
lbl140:
                // 2 sources

                this.L = -1;
                this.D = -1;
                this.N = (byte)5;
                this.O = (byte)5;
                if (this.x != null) {
                    this.b(this.x.k(), this.x);
                }
                this.v.M = true;
                this.T = true;
                this.u = true;
                if (!var7_6) break;
            }
            case 8: {
                this.v = new u(fb.Lb, 0, -1, -1, var1_1, var6_7, 200, 0, 100, false, false, false);
                this.v.R = u.u;
                if (this.G == null) ** GOTO lbl156
                this.K = this.G[0] * 6;
                if (!var7_6) ** GOTO lbl157
lbl156:
                // 2 sources

                this.K = 60;
lbl157:
                // 2 sources

                this.L = -1;
                this.D = -1;
                this.N = (byte)5;
                this.O = (byte)7;
                if (this.x != null) {
                    this.b(this.x.k(), this.x);
                }
                this.v.M = true;
                this.T = true;
                this.u = true;
                if (!var7_6) break;
            }
            case 2: {
                this.v = new u(fb.kc, 0, -1, -1, var1_1, var6_7, 300, 0, 1, false, true, false);
                this.v.R = u.u;
                this.v.x.j = (byte)ab.oc.nextInt(this.v.x.b.h);
                this.K = 100;
                this.N = 1;
                this.O = (byte)2;
                if (this.x != null) {
                    this.b(this.x.k(), this.x);
                }
                this.T = true;
                if (!var7_6) break;
            }
            case 11: {
                this.w = new nb(fb.jc);
                this.O = 0;
                this.D = this.L = q.c(this.x);
                this.N = 0;
                if (var4_4 == null) {
                    this.B = true;
                }
                this.E = false;
                this.C = true;
                this.S = true;
                if (!var7_6) break;
            }
            case 10: {
                this.w = new nb(fb.vc);
                this.w.j = (byte)ab.oc.nextInt(this.w.b.h);
                this.N = 0;
                if (var4_4 == null) {
                    this.B = true;
                }
                this.C = true;
                this.S = true;
                if (!var7_6) break;
            }
            case 9: {
                this.v = new u(fb.xc, 0, -1, -1, var1_1, var6_7, 50, 0, 5, false, true, false);
                this.v.R = u.t;
                this.v.x.j = (byte)ab.oc.nextInt(this.v.x.b.h);
                this.K = 100;
                this.D = this.L = hb.m;
                this.N = (byte)2;
                this.O = (byte)3;
                if (this.x != null) {
                    this.b(this.x.k(), this.x);
                    this.y = null;
                }
                this.T = true;
                if (!var7_6) break;
            }
            case 12: {
                this.v = new u(fb.Fc, (byte)ab.oc.nextInt(fb.Fc.h), -1, -1, var1_1, var6_7, 1000, 0, 100, false, true, false);
                this.v.R = u.u;
                this.v.M = true;
                this.K = 100;
                this.L = 100;
                this.D = 100;
                this.N = (byte)5;
                this.O = (byte)4;
                this.R = true;
                if (!var7_6) break;
            }
            case 13: {
                this.w = new nb(fb.Pc);
                this.O = (byte)6;
                this.N = (byte)2;
                if (var4_4 == null) {
                    this.B = true;
                }
                this.E = false;
                this.C = true;
                this.S = true;
            }
        }
        if (this.v != null && this.T && this.o == -5) {
            this.P = this.v.D;
            this.v.D = false;
        }
        if (this.S) {
            hb.a(var2_2, var3_3, false);
        }
        if (fb.Ud != null) {
            fb.Ud.addElement(this);
        }
    }

    public static hb b(byte by, byte by2, byte by3, q q2, byte[] byArray) {
        hb hb2 = new hb(by, by2, by3, q2, byArray);
        return hb2;
    }

    private static void a(byte by, byte by2, boolean bl) {
        if (Q != null && o.b(by, by2) && Q[by][by2] == bl) {
            hb.Q[by][by2] = !bl;
        }
    }

    public static boolean b(byte by) {
        return by == 0 || by == 12 || by == 1;
    }

    public static boolean c(byte by) {
        return by == 10 || by == 11 || by == -1 || by == -3 || by == 13;
    }

    public static boolean d(byte by) {
        return by == 2 || by == 9 || by == 5 || by == 3 || by == 7 || by == 4 || by == 6 || by == 8 || by == -4 || by == -5;
    }

    public static boolean e(byte by) {
        return by == 7 || by == 8;
    }

    public static boolean f(byte by) {
        return by == 0 || by == 5 || by == 12 || by == 7 || by == 1 || by == 6 || by == 8;
    }

    public final boolean b() {
        return this.u && (this.o == 7 || this.o == 8 || this.o == -6);
    }

    public static hb[] b(int n2, int n3) {
        hb hb2;
        int n4;
        boolean bl = ab.xc;
        int n5 = 0;
        for (n4 = 0; n4 < fb.Ud.size(); ++n4) {
            hb2 = (hb)fb.Ud.elementAt(n4);
            if (hb2 == null || hb2.q != n2 || hb2.r != n3) continue;
            ++n5;
            if (!bl) continue;
        }
        hb[] hbArray = new hb[n5];
        n5 = 0;
        for (n4 = 0; n4 < fb.Ud.size(); ++n4) {
            hb2 = (hb)fb.Ud.elementAt(n4);
            if (hb2 == null || hb2.q != n2 || hb2.r != n3) continue;
            hbArray[n5++] = hb2;
            if (!bl) continue;
        }
        return hbArray;
    }

    public static hb[] c(int n2, int n3) {
        boolean bl = ab.xc;
        hb[] hbArray = hb.b(n2, n3);
        if (hbArray != null) {
            hb[] hbArray2 = null;
            for (int n4 = 0; n4 < 2; n4 = (int)((byte)(n4 + 1))) {
                int n5;
                block6: {
                    n3 = 0;
                    for (int n6 = 0; n6 < hbArray.length; n6 = (int)((byte)(n6 + 1))) {
                        n5 = hbArray[n6].S ? 1 : 0;
                        if (!bl) {
                            if (n5 == 0 || !hbArray[n6].C) continue;
                            if (n4 == 0) {
                                ++n3;
                                if (!bl) continue;
                            }
                            hbArray2[n3++] = hbArray[n6];
                            if (!bl) continue;
                        }
                        break block6;
                    }
                    n5 = n4;
                }
                if (n5 != 0) continue;
                if (n3 == 0) {
                    return null;
                }
                hbArray2 = new hb[n3];
                if (!bl) continue;
            }
            return hbArray2;
        }
        return null;
    }

    public static boolean b(byte by, byte by2) {
        boolean bl;
        boolean bl2 = ab.xc;
        hb[] hbArray = hb.b((int)by, (int)by2);
        if (hbArray != null) {
            for (by2 = 0; by2 < hbArray.length; by2 = (byte)(by2 + 1)) {
                bl = hbArray[by2].R;
                if (!bl2) {
                    if (!bl || hbArray[by2].E) continue;
                    return true;
                }
                break;
            }
        } else {
            bl = false;
        }
        return bl;
    }

    public static boolean c(byte by, byte by2) {
        boolean bl;
        boolean bl2 = ab.xc;
        hb[] hbArray = hb.b((int)by, (int)by2);
        if (hbArray != null) {
            for (by2 = 0; by2 < hbArray.length; by2 = (byte)(by2 + 1)) {
                bl = hbArray[by2].S;
                if (!bl2) {
                    if (!bl) continue;
                    return true;
                }
                break;
            }
        } else {
            bl = false;
        }
        return bl;
    }

    public final void b(byte by, q q2) {
        block28: {
            block30: {
                block29: {
                    int n2;
                    boolean bl = ab.xc;
                    if (this.E) {
                        return;
                    }
                    if (hb.b(this.o) && q2 != null && this.x != q2) {
                        n2 = 0;
                        if (q2.Cc != null && (q2.r == 3 && q2.Cc.k <= 1 || q2.r == 9)) {
                            this.N = 1;
                            this.M /= 3;
                            n2 = 1;
                        }
                        if (n2 != 0) {
                            this.b(this.q, this.r, false, true);
                            return;
                        }
                    }
                    n2 = 0;
                    if (this.o == -4) {
                        n2 = 20;
                    }
                    if (this.o == -5) {
                        n2 = 30;
                    }
                    if (this.o == -6) {
                        n2 = 60;
                    }
                    if (this.o == 0) {
                        n2 = 0;
                    }
                    if (this.o == 3 || this.o == 4) {
                        n2 = 30;
                    }
                    if (this.o == 2) {
                        n2 = 30;
                    }
                    if (this.o == 5 || this.o == 6) {
                        n2 = 40;
                    }
                    if (this.o == 9) {
                        n2 = 30;
                    }
                    if (this.o == 12) {
                        n2 = 30;
                    }
                    if (this.o == 7 || this.o == 8) {
                        n2 = 60;
                    }
                    if (this.o == 1) {
                        n2 = 30;
                    }
                    if (this.v.N) {
                        n2 = 0;
                    }
                    int n3 = 0;
                    int n4 = 0;
                    switch (by) {
                        case 0: {
                            n4 = this.K;
                            if (!bl) break;
                        }
                        case 1: {
                            n3 = -this.K;
                            if (!bl) break;
                        }
                        case 2: {
                            n4 = -this.K;
                            if (!bl) break;
                        }
                        case 3: {
                            n3 = this.K;
                        }
                    }
                    if (this.o == -6) {
                        n4 = 0;
                        n3 = 0;
                    }
                    this.v.b(n3, n4, n2);
                    this.y = q2;
                    if (this.o != 0 && this.o != 3 && this.o != 1 && this.o != 4) break block28;
                    by = 0;
                    if (this.v.m <= 1) break block29;
                    by = 1;
                    if (!bl) break block30;
                }
                if (this.v.l < 0) {
                    by = 1;
                }
            }
            this.v.x.b(null, (byte)0, (byte)2, (byte)-1, (byte)this.v.x.b.h, true, by != 0, (byte)10);
        }
        if (this.o == 2 || this.o == 9 || this.o == 12) {
            this.v.x.b(true, false, (byte)1);
        }
        this.E = true;
    }

    public final void b(byte by, byte by2, boolean bl) {
        this.b(by, by2, bl, false);
    }

    /*
     * WARNING - void declaration
     */
    private void b(byte by, byte by2, boolean bl, boolean bl2) {
        void var4_16;
        p p2;
        int n2;
        block50: {
            block51: {
                block52: {
                    boolean bl3;
                    block54: {
                        block53: {
                            bl3 = ab.xc;
                            if (this.S && !bl) {
                                if (fb.M && this.z != null) {
                                    if (fb.I.d(this.z.w)) {
                                        return;
                                    }
                                    this.z.b(false, by, by2, true, false);
                                }
                                if (!fb.M && !fb.i()) {
                                    if (fb.Pd == this.z) {
                                        this.z.b(false, by, by2, true, false);
                                    }
                                    return;
                                }
                            }
                            if (this.z == null) break block50;
                            if (this.o == -1 || this.o == -2) {
                                if (fb.M || fb.i()) {
                                    this.z.b(0, 0, 0, false, false);
                                }
                                return;
                            }
                            if (this.o == -3) {
                                if ((fb.M || fb.i()) && !this.z.Nb) {
                                    this.z.b(0, 0, 0, false, false);
                                }
                                return;
                            }
                            if (this.o != 11) break block51;
                            if (!this.C) {
                                return;
                            }
                            if (this.z.Kb) break block52;
                            if (this.z.r == 2) {
                                this.D = 0;
                            }
                            if (!this.z.Lb) break block53;
                            this.M = this.z.nc;
                            this.D = 0;
                            if (!bl3) break block54;
                        }
                        this.u = true;
                        this.w.e = false;
                        this.w.b(j, false, false, (byte)0);
                    }
                    if (!fb.i() && !y.b(this.z, this.x)) {
                        this.M /= 2;
                    }
                    --this.D;
                    if (this.D <= 0) {
                        this.f();
                    }
                    this.C = false;
                    this.E = true;
                    if (!o.c(by, by2)) break block50;
                    ab.G.b(ab.W, 0);
                    if (!bl3) break block50;
                }
                return;
            }
            if (this.o == 10) {
                if (fb.M || fb.i()) {
                    byte by3;
                    byte by4;
                    if (this.z.r == 2) {
                        return;
                    }
                    int p22 = 2;
                    int u10 = -1;
                    if (this.x != null) {
                        by4 = this.x.w;
                    }
                    byte by5 = fb.b(this.q, this.r);
                    if (!(fb.i() || ab.n || y.b(this.z, this.x))) {
                        by3 = 0;
                    }
                    this.z.b(this.q, this.r, this.z.ub, (byte)this.M, false, false, false, by5, by4, (byte)2, by3);
                }
                this.f();
                return;
            }
            if (!(this.o != 13 || fb.i() || ab.n || y.b(this.z, this.x))) {
                return;
            }
        }
        if (this.A) {
            return;
        }
        this.A = true;
        if (this.o == 11) {
            this.A = false;
        }
        if ((this.o == 0 || this.o == 12 || this.o == 1) && this.E) {
            this.M = (this.M << 1) / 3;
            this.N = (byte)3;
        }
        int n3 = by * 30 + 15;
        int n4 = by2 * 30 + 15;
        int n5 = 0;
        if (this.v != null) {
            u u2 = this.v;
            n2 = u2.c / 10;
            u u3 = this.v;
            int n6 = u3.d / 10;
            n5 = this.v.O;
            if (this.o == 2) {
                n5 -= 5;
            }
        }
        if (this.M != 0 && (p2 = p.b(this.O, this.N, n2, (int)var4_16, n5, this.M, this.x, this.y, this.o)) != null) {
            if (this.o == 2) {
                if (o.c(by, by2)) {
                    ab.G.b(ab.W, 0);
                }
                p2.G = (byte)q.c(this.x, (int)this.o);
                if (fb.i()) {
                    p2.G = (byte)(p2.G << 1);
                }
            }
            if (this.o == 9) {
                p2.b(m, this.y);
            }
            if (this.o == 13) {
                p2.x = (byte)(p2.y.h - 1);
            }
        }
        if (o.b(by, by2)) {
            if (this.o == 0 || this.o == 5 || this.o == 3 || this.o == 12 || this.o == 7 || this.o == -6 || this.o == 1 || this.o == 4 || this.o == 6 || this.o == 8) {
                if (o.c(by, by2)) {
                    ab.G.b(ab.R, 0);
                }
                if (this.o == 12 || this.o == 7 || this.o == -6 || this.o == -5 || this.o == 8) {
                    if (fb.Hc != null) {
                        u u5 = this.v;
                        u5 = this.v;
                        new d(fb.Hc, (byte)ab.oc.nextInt(fb.Hc.h), u4.c / 10, u5.d / 10, ab.rc);
                    }
                } else if (fb.Eb != null) {
                    u u7 = this.v;
                    u7 = this.v;
                    new d(fb.Eb, (byte)ab.oc.nextInt(fb.Eb.h), u6.c / 10, u7.d / 10, ab.rc);
                }
            }
            if (this.o == 9 && this.y == null) {
                this.v.x.b();
                this.v.b(0, 0, 0);
                if (fb.Mc != null) {
                    u u9 = this.v;
                    u9 = this.v;
                    new r(null, u8.c / 10, u9.d / 10, 0, 0, 20, m, new t(0, fb.Mc, 15, 0, 0, 0, 0));
                }
                u u11 = this.v;
                u11 = this.v;
                new d(fb.wc, (byte)ab.oc.nextInt(fb.wc.h), u10.c / 10, u11.d / 10, this.L);
            }
        }
        if (this.o != 11) {
            if (this.o == 6 && this.D != 0) {
                this.D = 0;
                return;
            }
            this.f();
            return;
        }
        if (this.z == fb.Pd) {
            fb.b(20, 10);
        }
    }

    private void b(q q2) {
        u u2;
        if (q2 != null) {
            if (fb.M || fb.i()) {
                q2.b(this.M, -1, this.o, false);
            }
            if (this.o == -4 && fb.kd != null) {
                u u3 = this.v;
                u2 = u3;
                u2 = this.v;
                new w(fb.kd, u3.c / 10, u2.d / 10 - 10, 2, false, 1);
            }
        }
        if (q2 == null && this.o == -4 && fb.jd != null) {
            u u4 = this.v;
            u2 = u4;
            u2 = this.v;
            new d(fb.jd, (byte)ab.oc.nextInt(fb.jd.h), u4.c / 10, u2.d / 10, ab.qc);
        }
        this.f();
    }

    private void b(byte by, int n2, int n3) {
        if (fb.kb % 2L == 0L) {
            this.z = q.b(n2, n3, null, -1, -1);
        }
    }

    public final void c() {
        block102: {
            hb hb2;
            block154: {
                boolean bl;
                block155: {
                    block113: {
                        block150: {
                            block153: {
                                block151: {
                                    block152: {
                                        block145: {
                                            block149: {
                                                block148: {
                                                    block147: {
                                                        block146: {
                                                            block127: {
                                                                boolean bl2;
                                                                block144: {
                                                                    block143: {
                                                                        block128: {
                                                                            block142: {
                                                                                block141: {
                                                                                    boolean bl3;
                                                                                    block130: {
                                                                                        block131: {
                                                                                            byte by;
                                                                                            block133: {
                                                                                                byte by2;
                                                                                                block139: {
                                                                                                    block140: {
                                                                                                        boolean bl4;
                                                                                                        block138: {
                                                                                                            boolean bl5;
                                                                                                            block136: {
                                                                                                                block137: {
                                                                                                                    byte by3;
                                                                                                                    byte by4;
                                                                                                                    hb hb3;
                                                                                                                    block135: {
                                                                                                                        block134: {
                                                                                                                            block132: {
                                                                                                                                block129: {
                                                                                                                                    block121: {
                                                                                                                                        block126: {
                                                                                                                                            block122: {
                                                                                                                                                block125: {
                                                                                                                                                    block123: {
                                                                                                                                                        block124: {
                                                                                                                                                            block118: {
                                                                                                                                                                block120: {
                                                                                                                                                                    block119: {
                                                                                                                                                                        block114: {
                                                                                                                                                                            block116: {
                                                                                                                                                                                block117: {
                                                                                                                                                                                    block115: {
                                                                                                                                                                                        int n2;
                                                                                                                                                                                        int n3;
                                                                                                                                                                                        o o2;
                                                                                                                                                                                        block103: {
                                                                                                                                                                                            block109: {
                                                                                                                                                                                                block110: {
                                                                                                                                                                                                    block112: {
                                                                                                                                                                                                        block111: {
                                                                                                                                                                                                            block106: {
                                                                                                                                                                                                                block107: {
                                                                                                                                                                                                                    block108: {
                                                                                                                                                                                                                        block104: {
                                                                                                                                                                                                                            block105: {
                                                                                                                                                                                                                                block98: {
                                                                                                                                                                                                                                    block99: {
                                                                                                                                                                                                                                        block100: {
                                                                                                                                                                                                                                            block101: {
                                                                                                                                                                                                                                                bl = ab.xc;
                                                                                                                                                                                                                                                if (!hb.b(this.o)) break block98;
                                                                                                                                                                                                                                                hb2 = this;
                                                                                                                                                                                                                                                hb2.v.h();
                                                                                                                                                                                                                                                o2 = hb2.v;
                                                                                                                                                                                                                                                n3 = o2.c / 10;
                                                                                                                                                                                                                                                o2 = hb2.v;
                                                                                                                                                                                                                                                n2 = o2.d / 10;
                                                                                                                                                                                                                                                hb2.q = hb2.v.g;
                                                                                                                                                                                                                                                hb2.r = hb2.v.h;
                                                                                                                                                                                                                                                if (!hb2.B) {
                                                                                                                                                                                                                                                    if (hb2.F && hb2.x != null && hb2.x.Ib <= 5 && hb2.x.Hb <= 0) {
                                                                                                                                                                                                                                                        hb2.F = false;
                                                                                                                                                                                                                                                        hb2.b(hb2.x.k(), hb2.x);
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    if (hb2.x != null) {
                                                                                                                                                                                                                                                        q q2 = hb2.x;
                                                                                                                                                                                                                                                        o2 = q2;
                                                                                                                                                                                                                                                        o2 = hb2.x;
                                                                                                                                                                                                                                                        if (o.b(q2.c / 10, o2.d / 10, n3, n2) >= n && (hb2.x.g != hb2.v.g || hb2.x.h != hb2.v.h)) {
                                                                                                                                                                                                                                                            hb2.B = true;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                if (!hb2.B) break block99;
                                                                                                                                                                                                                                                hb2.b((byte)-1, n3, n2);
                                                                                                                                                                                                                                                if (hb2.C || hb2.z == null || hb2.o != 0 && hb2.o != 12 && hb2.o != 1) break block100;
                                                                                                                                                                                                                                                if (hb2.E) break block101;
                                                                                                                                                                                                                                                q q3 = hb2.z;
                                                                                                                                                                                                                                                o2 = q3;
                                                                                                                                                                                                                                                o2 = hb2.z;
                                                                                                                                                                                                                                                if (o.b(q3.c / 10, o2.d / 10, n3, n2) >= n) break block100;
                                                                                                                                                                                                                                                hb2.b(hb2.z.k(), hb2.z);
                                                                                                                                                                                                                                                if (!bl) break block102;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            q q4 = hb2.z;
                                                                                                                                                                                                                                            o2 = q4;
                                                                                                                                                                                                                                            o2 = hb2.z;
                                                                                                                                                                                                                                            if (o.b(q4.c / 10, o2.d / 10, n3, n2) > n) {
                                                                                                                                                                                                                                                hb2.C = true;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        if (hb2.C && hb2.z != null) {
                                                                                                                                                                                                                                            q q5 = hb2.z;
                                                                                                                                                                                                                                            o2 = q5;
                                                                                                                                                                                                                                            o2 = hb2.z;
                                                                                                                                                                                                                                            if (o.b(q5.c / 10, o2.d / 10, n3, n2) < n) {
                                                                                                                                                                                                                                                hb2.b(hb2.z.g, hb2.z.h, false);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        if (hb2.o == 12 && hb2.v != null && hb2.v.G) {
                                                                                                                                                                                                                                            hb2.v.x.b();
                                                                                                                                                                                                                                            hb2.E = false;
                                                                                                                                                                                                                                            hb2.C = false;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        hb2.e();
                                                                                                                                                                                                                                        if (hb2.D != -1) {
                                                                                                                                                                                                                                            --hb2.D;
                                                                                                                                                                                                                                            if (hb2.D <= 0) {
                                                                                                                                                                                                                                                hb2.b(hb2.q, hb2.r, false);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    if (!bl) break block102;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if (!hb.c(this.o)) break block103;
                                                                                                                                                                                                                                hb2 = this;
                                                                                                                                                                                                                                if (hb2.w != null) {
                                                                                                                                                                                                                                    hb2.w.c();
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if (hb2.B) break block104;
                                                                                                                                                                                                                                if (!hb2.F || hb2.x == null || hb2.x.Ib > 5 || hb2.x.Hb > 0) break block105;
                                                                                                                                                                                                                                hb2.F = false;
                                                                                                                                                                                                                                hb2.z = hb2.x;
                                                                                                                                                                                                                                hb2.b(hb2.q, hb2.r, false);
                                                                                                                                                                                                                                if (!bl) break block102;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            if (hb2.x != null && (hb2.x.g != hb2.q || hb2.x.h != hb2.r)) {
                                                                                                                                                                                                                                hb2.B = true;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        if (!hb2.B) break block106;
                                                                                                                                                                                                                        q[] qArray = q.b((int)hb2.q, (int)hb2.r, 2, null);
                                                                                                                                                                                                                        if (qArray != null) {
                                                                                                                                                                                                                            hb2.z = qArray[0];
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        if (hb2.z == null) break block107;
                                                                                                                                                                                                                        if (hb2.o != -1) break block108;
                                                                                                                                                                                                                        q q6 = hb2.z;
                                                                                                                                                                                                                        o2 = q6;
                                                                                                                                                                                                                        o2 = hb2.z;
                                                                                                                                                                                                                        if (o.b(q6.c / 10, o2.d / 10, hb2.q * 30 + 15, hb2.r * 30 + 15) >= n) break block108;
                                                                                                                                                                                                                        hb2.b(hb2.q, hb2.r, false);
                                                                                                                                                                                                                        if (!bl) break block102;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (hb2.z.g != hb2.q || hb2.z.h != hb2.r) break block107;
                                                                                                                                                                                                                    hb2.b(hb2.q, hb2.r, false);
                                                                                                                                                                                                                    if (!bl) break block102;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (hb2.o == 11 && hb2.E && q.b((int)hb2.q, (int)hb2.r, 2, null) == null) {
                                                                                                                                                                                                                    if (hb2.w.j >= 10) {
                                                                                                                                                                                                                        hb2.u = false;
                                                                                                                                                                                                                        hb2.w.e = false;
                                                                                                                                                                                                                        hb2.w.b(k, false, false, (byte)0);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    hb2.E = false;
                                                                                                                                                                                                                    hb2.C = true;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (hb2.o != 11) break block109;
                                                                                                                                                                                                            if (fb.Pd == null) break block110;
                                                                                                                                                                                                            hb2.u = false;
                                                                                                                                                                                                            n3 = hb2.q * 30 + 15;
                                                                                                                                                                                                            n2 = hb2.r * 30 + 15;
                                                                                                                                                                                                            q q7 = fb.Pd;
                                                                                                                                                                                                            o2 = q7;
                                                                                                                                                                                                            o2 = fb.Pd;
                                                                                                                                                                                                            if (o.b(q7.c / 10, o2.d / 10, n3, n2) >= i) break block111;
                                                                                                                                                                                                            if (hb2.w.j != 0) break block112;
                                                                                                                                                                                                            hb2.w.b((byte)4, (byte)1);
                                                                                                                                                                                                            if (!bl) break block109;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        if (hb2.w.j != 0) {
                                                                                                                                                                                                            hb2.w.b((byte)0, (byte)1);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (!bl) break block102;
                                                                                                                                                                                                }
                                                                                                                                                                                                if (hb2.w.j != 0) {
                                                                                                                                                                                                    hb2.w.b((byte)0, (byte)1);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            if (!bl) break block102;
                                                                                                                                                                                        }
                                                                                                                                                                                        if (!hb.d(this.o)) break block113;
                                                                                                                                                                                        hb2 = this;
                                                                                                                                                                                        hb2.v.h();
                                                                                                                                                                                        o2 = hb2.v;
                                                                                                                                                                                        n3 = o2.c / 10;
                                                                                                                                                                                        o2 = hb2.v;
                                                                                                                                                                                        n2 = o2.d / 10;
                                                                                                                                                                                        hb2.q = hb2.v.g;
                                                                                                                                                                                        hb2.r = hb2.v.h;
                                                                                                                                                                                        hb2.u = hb2.v.w;
                                                                                                                                                                                        if (hb2.o == -5 && (hb2.q != hb2.s || hb2.r != hb2.t)) {
                                                                                                                                                                                            hb2.v.D = hb2.P;
                                                                                                                                                                                        }
                                                                                                                                                                                        if (!hb2.C) {
                                                                                                                                                                                            if (hb2.x != null) {
                                                                                                                                                                                                q q8 = hb2.x;
                                                                                                                                                                                                o2 = q8;
                                                                                                                                                                                                o2 = hb2.x;
                                                                                                                                                                                                if (o.b(q8.c / 10, o2.d / 10, n3, n2) >= n && (hb2.x.g != hb2.q || hb2.x.h != hb2.r)) {
                                                                                                                                                                                                    hb2.C = true;
                                                                                                                                                                                                }
                                                                                                                                                                                            } else {
                                                                                                                                                                                                hb2.C = true;
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        if (!hb2.C || hb2.o == 7 || hb2.o == 8) break block114;
                                                                                                                                                                                        hb2.b((byte)-1, n3, n2);
                                                                                                                                                                                        if (hb2.z == null) break block114;
                                                                                                                                                                                        q q9 = hb2.z;
                                                                                                                                                                                        o2 = q9;
                                                                                                                                                                                        q q10 = hb2.z;
                                                                                                                                                                                        o2 = q10;
                                                                                                                                                                                        u u2 = hb2.v;
                                                                                                                                                                                        o2 = u2;
                                                                                                                                                                                        o2 = hb2.v;
                                                                                                                                                                                        if (o.b(q9.c / 10, q10.d / 10, u2.c / 10, o2.d / 10) >= n) break block114;
                                                                                                                                                                                        if (hb2.o == 9 && hb2.z != hb2.x) {
                                                                                                                                                                                            hb2.y = hb2.z;
                                                                                                                                                                                        }
                                                                                                                                                                                        if (!hb2.J) break block115;
                                                                                                                                                                                        hb2.b(hb2.z);
                                                                                                                                                                                        if (!bl) break block114;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (hb2.o != 6) break block116;
                                                                                                                                                                                    if (hb2.s == hb2.z.g && hb2.t == hb2.z.h) break block114;
                                                                                                                                                                                    if (hb2.L <= 0) break block117;
                                                                                                                                                                                    --hb2.L;
                                                                                                                                                                                    hb2.D = 1;
                                                                                                                                                                                    hb2.s = hb2.z.g;
                                                                                                                                                                                    hb2.t = hb2.z.h;
                                                                                                                                                                                    hb2.b(hb2.z.g, hb2.z.h, false);
                                                                                                                                                                                    hb2.A = false;
                                                                                                                                                                                    if (!bl) break block114;
                                                                                                                                                                                }
                                                                                                                                                                                hb2.b(hb2.z.g, hb2.z.h, false);
                                                                                                                                                                                if (!bl) break block114;
                                                                                                                                                                            }
                                                                                                                                                                            hb2.b(hb2.z.g, hb2.z.h, false);
                                                                                                                                                                        }
                                                                                                                                                                        if (hb2.o == 5 || hb2.o == 6 || hb2.o == 4 || !hb2.C && hb2.o == -5 || !hb2.E || hb2.v.E == 0 && !hb2.v.G) break block118;
                                                                                                                                                                        if (!hb2.J) break block119;
                                                                                                                                                                        hb2.b((q)null);
                                                                                                                                                                        if (!bl) break block120;
                                                                                                                                                                    }
                                                                                                                                                                    hb2.b(hb2.q, hb2.r, false);
                                                                                                                                                                }
                                                                                                                                                                hb2.v.E = 0;
                                                                                                                                                                hb2.v.G = false;
                                                                                                                                                            }
                                                                                                                                                            if (hb2.o != 4) break block121;
                                                                                                                                                            if (!hb2.B) break block122;
                                                                                                                                                            if (!hb2.C) break block121;
                                                                                                                                                            if (hb2.v.E == 0) break block123;
                                                                                                                                                            if (hb2.H != 0) break block124;
                                                                                                                                                            hb2.B = false;
                                                                                                                                                            hb2.H = 1;
                                                                                                                                                            if (!bl) break block125;
                                                                                                                                                        }
                                                                                                                                                        hb2.b(hb2.q, hb2.r, false);
                                                                                                                                                        if (!bl) break block125;
                                                                                                                                                    }
                                                                                                                                                    if (hb2.v.G && hb2.H != 2) {
                                                                                                                                                        hb2.b(hb2.q, hb2.r, false);
                                                                                                                                                        hb2.v.G = false;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                if (hb2.H != 2) break block121;
                                                                                                                                                hb2.H = 0;
                                                                                                                                                hb2.v.G = false;
                                                                                                                                                if (!bl) break block121;
                                                                                                                                            }
                                                                                                                                            if (!hb2.v.G) break block121;
                                                                                                                                            hb2.v.G = false;
                                                                                                                                            q q11 = y.b(hb2.v.g, hb2.v.h, false, 5, hb2.x);
                                                                                                                                            if (q11 == null) break block126;
                                                                                                                                            hb2.E = false;
                                                                                                                                            hb2.v.K = 0;
                                                                                                                                            hb2.b(y.b(hb2.v.g, hb2.v.h, q11.g, q11.h), hb2.x);
                                                                                                                                            hb2.B = true;
                                                                                                                                            hb2.H = (byte)2;
                                                                                                                                            if (!bl) break block121;
                                                                                                                                        }
                                                                                                                                        hb2.b(hb2.q, hb2.r, false);
                                                                                                                                    }
                                                                                                                                    if (hb2.o == 3 || hb2.o == 4) {
                                                                                                                                        hb2.e();
                                                                                                                                    }
                                                                                                                                    if (hb2.o != 5 && hb2.o != 6 || !hb2.E) break block127;
                                                                                                                                    if ((hb2.v.E != 0 || hb2.v.G) && hb2.x != null) {
                                                                                                                                        hb2.M += 30;
                                                                                                                                    }
                                                                                                                                    if (hb2.v.E == 0) break block128;
                                                                                                                                    if (hb2.v.E == 1) {
                                                                                                                                        hb2.v.c += hb2.v.l / 3;
                                                                                                                                    }
                                                                                                                                    if (hb2.v.E == 2) {
                                                                                                                                        hb2.v.d += hb2.v.m / 3;
                                                                                                                                    }
                                                                                                                                    bl3 = false;
                                                                                                                                    if (hb2.G == null || hb2.H >= hb2.G.length) break block129;
                                                                                                                                    hb2.E = false;
                                                                                                                                    hb2.b(hb2.G[hb2.H], hb2.x);
                                                                                                                                    hb2.H = (byte)(hb2.H + 1);
                                                                                                                                    hb2.I = true;
                                                                                                                                    if (!bl) break block130;
                                                                                                                                }
                                                                                                                                if (hb2.x != null) break block131;
                                                                                                                                hb2.E = false;
                                                                                                                                hb3 = hb2;
                                                                                                                                if (hb3.v != null) break block132;
                                                                                                                                by = 0;
                                                                                                                                break block133;
                                                                                                                            }
                                                                                                                            bl5 = false;
                                                                                                                            bl4 = false;
                                                                                                                            if (Math.abs(hb3.v.l) <= Math.abs(hb3.v.m)) break block134;
                                                                                                                            byte by5 = by2 = hb3.v.l > 0 ? (byte)3 : 1;
                                                                                                                            if (!bl) break block135;
                                                                                                                        }
                                                                                                                        byte by6 = by2 = hb3.v.m > 0 ? (byte)0 : 2;
                                                                                                                    }
                                                                                                                    if (o.b(by4 = y.b(y.b(by2), hb3.v.H), by3 = y.c(y.b(by2), hb3.v.I)) && fb.bf[by4][by3] != 0) {
                                                                                                                        bl5 = true;
                                                                                                                    }
                                                                                                                    if (o.b(by4 = y.b(y.c(by2), hb3.v.H), by3 = y.c(y.c(by2), hb3.v.I)) && fb.bf[by4][by3] != 0) {
                                                                                                                        bl4 = true;
                                                                                                                    }
                                                                                                                    if (!bl5 || !bl4) break block136;
                                                                                                                    if (ab.oc.nextInt(2) != 0) break block137;
                                                                                                                    bl4 = false;
                                                                                                                    if (!bl) break block136;
                                                                                                                }
                                                                                                                bl5 = false;
                                                                                                            }
                                                                                                            if (!bl5) break block138;
                                                                                                            by2 = y.b(by2);
                                                                                                            if (!bl) break block139;
                                                                                                        }
                                                                                                        if (!bl4) break block140;
                                                                                                        by2 = y.c(by2);
                                                                                                        if (!bl) break block139;
                                                                                                    }
                                                                                                    by2 = y.d(by2);
                                                                                                }
                                                                                                by = by2;
                                                                                            }
                                                                                            hb2.b(by, null);
                                                                                            hb2.I = true;
                                                                                            break block130;
                                                                                        }
                                                                                        bl3 = true;
                                                                                    }
                                                                                    if (!hb2.C) {
                                                                                        bl3 = true;
                                                                                    }
                                                                                    if (!bl3) break block141;
                                                                                    hb2.b(hb2.q, hb2.r, false);
                                                                                    if (!bl) break block142;
                                                                                }
                                                                                if (o.c(hb2.q, hb2.r)) {
                                                                                    ab.G.b(ab.P, 0);
                                                                                }
                                                                            }
                                                                            hb2.v.E = 0;
                                                                        }
                                                                        if (!hb2.v.G) break block127;
                                                                        hb2.v.Q = 35;
                                                                        hb2.v.G = false;
                                                                        if (hb2.v.x.e) break block127;
                                                                        bl2 = false;
                                                                        if (hb2.v.m <= 1) break block143;
                                                                        bl2 = true;
                                                                        if (!bl) break block144;
                                                                    }
                                                                    if (hb2.v.l < 0) {
                                                                        bl2 = true;
                                                                    }
                                                                }
                                                                hb2.v.x.b(l, true, bl2, (byte)0);
                                                            }
                                                            if (hb2.o != 8 || hb2.G == null) break block145;
                                                            if (hb2.z != null) break block146;
                                                            hb2.z = q.d(hb2.G[1]);
                                                            if (!bl) break block145;
                                                        }
                                                        if (hb2.v == null) break block145;
                                                        if (hb2.v.c <= hb2.z.c) break block147;
                                                        hb2.v.c -= 20;
                                                        if (!bl) break block148;
                                                    }
                                                    if (hb2.v.c > hb2.z.c) {
                                                        hb2.v.c += 20;
                                                    }
                                                }
                                                if (hb2.v.d <= hb2.z.d) break block149;
                                                hb2.v.d -= 20;
                                                if (!bl) break block145;
                                            }
                                            if (hb2.v.d > hb2.z.d) {
                                                hb2.v.d += 20;
                                            }
                                        }
                                        if (hb2.o == 9 && hb2.E) {
                                            if (hb2.A && hb2.D > 0) {
                                                --hb2.D;
                                                if (hb2.D <= 0) {
                                                    hb2.D = -1;
                                                    hb2.f();
                                                }
                                            }
                                            if (hb2.v.E != 0) {
                                                if (hb2.v.E == 1) {
                                                    hb2.v.c += hb2.v.l / 3;
                                                }
                                                if (hb2.v.E == 2) {
                                                    hb2.v.d += hb2.v.m / 3;
                                                }
                                                hb2.v.b(0, 0, 0);
                                                hb2.v.E = 0;
                                            }
                                            if (hb2.v.G) {
                                                hb2.b(hb2.q, hb2.r, false);
                                                hb2.v.G = false;
                                            }
                                        }
                                        if (!hb2.I || hb2.v == null) break block150;
                                        if (Math.abs(hb2.v.m) <= Math.abs(hb2.v.l)) break block151;
                                        if (hb2.v.c / 10 <= hb2.v.g * 30 + 15) break block152;
                                        hb2.v.c -= 5;
                                        if (!bl) break block102;
                                    }
                                    if (hb2.v.c / 10 >= hb2.v.g * 30 + 15) break block150;
                                    hb2.v.c += 5;
                                    if (!bl) break block102;
                                }
                                if (hb2.v.d / 10 <= hb2.v.h * 30 + 15) break block153;
                                hb2.v.d -= 5;
                                if (!bl) break block102;
                            }
                            if (hb2.v.d / 10 < hb2.v.h * 30 + 15) {
                                hb2.v.d += 5;
                            }
                        }
                        if (!bl) break block102;
                    }
                    hb2 = this;
                    if (hb2.v != null) {
                        hb2.v.h();
                    }
                    if (hb2.o != -6 || hb2.v == null || !hb2.E) break block102;
                    if (hb2.C) break block154;
                    if (hb2.B) break block155;
                    if (hb2.v.Q > 10) break block102;
                    hb2.B = true;
                    hb2.v.r = true;
                    if (fb.Kc == null) break block102;
                    hb2.U = new r(hb2.v, 0, 0, 0, 10, 3, -1, new t(0, fb.Kc, 0, 0, 0, 0, 30));
                    if (!bl) break block102;
                }
                hb2.v.Q += 10;
                hb2.v.b(0, 0, hb2.v.Q);
                if (hb2.v.d()) break block102;
                hb2.v.r = false;
                if (hb2.U != null) {
                    hb2.U.z = true;
                }
                if (fb.Lc != null) {
                    hb2.U = new r(hb2.v, 0, 0, 0, -30, 2, -1, new t(0, fb.Lc, 5, 0, 0, 0, -10));
                }
                hb2.C = true;
                hb2.v.x.j = 1;
                if (hb2.z != null) {
                    hb2.v.d(hb2.z.g, hb2.z.h);
                }
                hb2.v.b(ab.E + 30);
                hb2.v.b(0, 0, -20);
                if (!bl) break block102;
            }
            if (hb2.v.O <= 0) {
                if (hb2.U != null) {
                    hb2.U.z = true;
                    hb2.U = null;
                }
                hb2.b(hb2.v.g, hb2.v.h, false);
            }
        }
        if (!o.b(this.q, this.r)) {
            this.f();
        }
    }

    private void e() {
        block9: {
            block10: {
                block12: {
                    boolean bl;
                    block11: {
                        bl = ab.xc;
                        if (this.o != 0 && this.o != 3 && this.o != 1 && this.o != 4 || !this.E) break block9;
                        if (this.v.x.j <= 1) break block10;
                        if (!this.v.N) break block11;
                        if (!this.v.G) break block10;
                        this.v.G = false;
                        this.v.x.p = (short)(this.v.x.p + 2);
                        if (!bl) break block10;
                    }
                    if (this.v.n <= 0) break block12;
                    this.v.x.p = (byte)(4 / (this.v.n / 100 + 1));
                    if (!bl) break block10;
                }
                this.v.x.p = (short)-1;
            }
            if (this.v.E != 0) {
                this.v.K = (byte)2;
                if (this.v.l != 0) {
                    this.v.l = Math.abs(this.v.l) / this.v.l * 10;
                }
                if (this.v.m != 0) {
                    this.v.m = Math.abs(this.v.m) / this.v.m * 10;
                }
                this.v.N = true;
                if (Math.abs(this.v.Q) < 20) {
                    this.v.Q = 30;
                }
                this.v.x.p = 1;
                this.C = true;
                this.v.E = 0;
            }
        }
        if (this.o == 12 && this.E && this.v.x.e && (this.v.G || this.v.E != 0)) {
            this.v.x.p = 1;
            this.v.x.b();
            if (fb.Kc != null) {
                u u2 = this.v;
                u u3 = u2;
                u3 = this.v;
                new t(1, fb.Kc, 3, u2.c / 10 - 2, u3.d / 10 - this.v.O + 10, -3, 0);
                u u4 = this.v;
                u3 = u4;
                u3 = this.v;
                new t(1, fb.Kc, 3, u4.c / 10 + 2, u3.d / 10 - this.v.O + 13, 5, 2);
            }
        }
    }

    public final void b(Graphics graphics) {
        int n2;
        if (this.v != null) {
            this.v.b(graphics);
            if (this.o == 12) {
                u u2 = this.v;
                Object object = u2;
                object = this.v;
                fb.Ic.b(u2.c / 10 + 1 - fb.Ge - fb.Ic.d / 2, ((o)object).d / 10 - 15 - fb.He - fb.Ic.e / 2 - this.v.O);
                if (fb.Vb != null) {
                    object = fb.Vb;
                    n2 = ((pb)object).d;
                    u u3 = this.v;
                    object = u3;
                    object = this.v;
                    fb.Vb.b(u3.c / 10 + 1 - fb.Ge - n2 / 2, ((o)object).d / 10 - 15 - fb.He - fb.Vb.e / 2 - this.v.O);
                    fb.Vb.b(graphics);
                }
                fb.Ic.b(graphics);
            }
        }
        if (this.w != null) {
            int n3 = 0;
            n2 = 0;
            if (this.o == 11) {
                n3 = 10;
                n2 = 5;
            }
            this.w.b(graphics, this.q * 30 + 15 - fb.Ge + n3, this.r * 30 + 15 - fb.He + n2);
        }
    }

    public final void f() {
        if (this.S) {
            hb.a(this.q, this.r, true);
        }
        this.p = true;
    }

    public static String b(int n2) {
        if (n2 == 0) {
            return "^10~";
        }
        if (n2 == 11) {
            return "^11~";
        }
        if (n2 == 2) {
            return "^12~";
        }
        if (n2 == 5) {
            return "^13~";
        }
        if (n2 == 10) {
            return "^14~";
        }
        if (n2 == 9) {
            return "^15~";
        }
        if (n2 == 3) {
            return "^21~";
        }
        if (n2 == 12) {
            return "^32~";
        }
        if (n2 == 7) {
            return "^34~";
        }
        if (n2 == 1) {
            return "^36~";
        }
        if (n2 == 6) {
            return "^37~";
        }
        if (n2 == 4) {
            return "^38~";
        }
        if (n2 == 8) {
            return "^30~";
        }
        if (n2 == 13) {
            return "^35~";
        }
        return "^9~";
    }

    public static String c(int n2) {
        if (n2 == 2) {
            return "^28~";
        }
        if (n2 == 1) {
            return "^29~";
        }
        if (n2 == 0) {
            return "^22~";
        }
        if (n2 == 4) {
            return "^23~";
        }
        if (n2 == 5) {
            return "^43~";
        }
        if (n2 == 3) {
            return "^31~";
        }
        return "";
    }

    public static void g() {
        boolean bl = ab.xc;
        b = new int[14];
        d = new int[14];
        c = new int[6];
        e = new int[6];
        hb.b[0] = 5;
        hb.b[11] = 5;
        hb.b[2] = 5;
        hb.b[5] = 5;
        hb.b[10] = 5;
        hb.b[9] = 5;
        hb.b[3] = 5;
        hb.b[12] = 5;
        hb.b[7] = 5;
        hb.b[13] = 5;
        hb.b[1] = 5;
        hb.b[6] = 5;
        hb.b[4] = 5;
        hb.b[8] = 5;
        hb.d[0] = 10;
        hb.d[1] = 20;
        hb.d[12] = 10;
        hb.d[3] = 15;
        hb.d[4] = 25;
        hb.d[2] = 20;
        hb.d[5] = 30;
        hb.d[6] = 45;
        hb.d[7] = 30;
        hb.d[8] = 45;
        hb.d[9] = 40;
        hb.d[11] = 30;
        hb.d[13] = 25;
        hb.d[10] = 15;
        hb.c[2] = 1;
        hb.c[1] = 1;
        hb.c[0] = 1;
        hb.c[4] = 1;
        hb.c[5] = 1;
        hb.c[3] = 1;
        hb.e[2] = 50;
        hb.e[1] = 30;
        hb.e[0] = 15;
        hb.e[4] = 30;
        hb.e[5] = 30;
        hb.e[3] = 25;
        g = new int[14];
        h = new int[6];
        hb.g[0] = 50;
        hb.g[11] = 3;
        hb.g[2] = 20;
        hb.g[5] = 15;
        hb.g[10] = 3;
        hb.g[9] = 2;
        hb.g[3] = 20;
        hb.g[12] = 0;
        hb.g[7] = 10;
        hb.g[13] = 2;
        hb.g[1] = 0;
        hb.g[6] = 0;
        hb.g[4] = 0;
        hb.g[8] = 0;
        hb.h[2] = 0;
        hb.h[1] = 1;
        hb.h[0] = 5;
        hb.h[4] = 0;
        hb.h[3] = 0;
        if (o.q) {
            ab.xc = !bl;
        }
    }

    static {
        f = new int[]{1, 4, 3, 6, 5, 8, 7, 2, 9, 12, 0, 13, 11, 10};
        i = 37;
        j = new byte[]{10, 13};
        k = new byte[]{12, 11, 10, 9, 8, 7, 6, 5, 4, 6, 6, 6, 5, 4};
        l = new byte[]{8, 8, 9, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 0, 0, 1, 1, 2, 7};
        m = 250;
        n = 20;
    }
}

