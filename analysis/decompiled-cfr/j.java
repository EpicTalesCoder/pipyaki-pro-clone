/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class j {
    public boolean b;
    public byte c;
    public byte d;
    public pb e;
    public int f;
    public int g;
    private int h;
    public int i;
    private byte j;
    private byte k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private boolean v;
    public byte w;
    private boolean x;
    public boolean y;
    public boolean z;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    private byte E;
    private byte F;
    private int G;
    public int H;
    public byte I;
    public static byte J = 0;
    private static byte K = 1;
    public static byte L = (byte)2;
    public long M;
    public boolean N;
    private nb O;

    public j(byte by, byte by2, byte by3, byte by4, byte by5) {
        block27: {
            block21: {
                block25: {
                    block26: {
                        boolean bl;
                        block22: {
                            block23: {
                                block24: {
                                    bl = ab.xc;
                                    this.c = by;
                                    this.d = by2;
                                    this.I = 0;
                                    if (by == -1) break block21;
                                    if (this.c == 0) {
                                        this.e = fb.rb;
                                        this.x = true;
                                    }
                                    if (this.c == 1) {
                                        this.e = fb.Uc;
                                        this.x = true;
                                    }
                                    if (this.c == 2) {
                                        this.e = fb.Wc;
                                        this.y = true;
                                    }
                                    if (this.c == 3) {
                                        this.e = fb.Xc;
                                        if (by5 == 1) {
                                            this.e = fb.Zc;
                                        }
                                        this.z = true;
                                    }
                                    if (this.c == 4) {
                                        this.e = fb.sb;
                                        this.B = true;
                                    }
                                    if (this.c == 5) {
                                        this.e = fb.bd;
                                        this.A = true;
                                    }
                                    if (this.c == 6) {
                                        this.C = true;
                                    }
                                    if (this.c == 7) {
                                        this.e = fb.vd;
                                        this.D = true;
                                    }
                                    this.f = by3 * 30;
                                    this.g = by4 * 30;
                                    this.h = k.b[this.c][0];
                                    this.i = k.b[this.c][1];
                                    this.w = by5;
                                    if (!this.x) break block22;
                                    this.j = (byte)(this.j + (ab.oc.nextInt(2) - 1));
                                    this.k = (byte)(this.k + (ab.oc.nextInt(2) - 1));
                                    if (this.c != 0) break block23;
                                    this.G = 240;
                                    if (this.d < 5 || this.d > 8) break block24;
                                    this.E = (byte)5;
                                    this.F = (byte)ab.oc.nextInt(3);
                                    this.I = K;
                                    this.H = this.G / 4 * (9 - this.d);
                                    if (!bl) break block22;
                                }
                                if (this.d < 9 || this.d > 12) break block22;
                                this.E = (byte)9;
                                this.F = (byte)ab.oc.nextInt(3);
                                this.I = K;
                                this.H = this.G / 4 * (13 - this.d);
                                if (!bl) break block22;
                            }
                            if (this.c == 1) {
                                this.E = (byte)-1;
                                this.G = 30;
                                this.H = 30;
                                this.F = (byte)ab.oc.nextInt(3);
                                this.I = L;
                            }
                        }
                        if (this.B) {
                            this.j = (byte)(this.j + (ab.oc.nextInt(10) - 5));
                            this.k = (byte)(this.k + (ab.oc.nextInt(10) - 5));
                        }
                        if (!this.A) break block25;
                        this.N = true;
                        this.O = new nb(fb.cd);
                        if (!this.N) break block26;
                        this.O.j = (byte)(fb.cd.h - 1);
                        if (!bl) break block25;
                    }
                    this.O.j = 0;
                }
                if (this.C) {
                    this.N = true;
                }
                if (this.D) {
                    this.N = true;
                    return;
                }
                break block27;
            }
            this.c = (byte)-1;
            this.d = (byte)-1;
        }
    }

    public final void b() {
        block22: {
            block24: {
                block23: {
                    boolean bl;
                    block25: {
                        bl = ab.xc;
                        if (this.d == -1) break block22;
                        if (!this.A) break block23;
                        this.O.c();
                        if (this.M > 0L) {
                            --this.M;
                        }
                        if (this.N || this.M > 0L || !fb.M || fb.i() || this.O.e) break block24;
                        if (this.O.j != 0) break block25;
                        this.O.b(false, false, (byte)2);
                        if (!bl) break block24;
                    }
                    this.N = true;
                    if (!bl) break block24;
                }
                if (this.C) {
                    q q2;
                    int n2;
                    int n3;
                    if (fb.kb % 17L == 0L && o.c(n3 = this.f + 58, n2 = this.g + 48, 30, 20) && (q2 = q.b(n3, n2, null, -1, 90)) != null) {
                        q q3 = q2;
                        if (q3.d / 10 > n2) {
                            q3 = q2;
                            n2 = 2 - (n3 = q3.c / 10 - n3) / 30;
                            if (n2 < 0) {
                                n2 = 0;
                            }
                            if (n2 > 4) {
                                n2 = 4;
                            }
                            this.O.b();
                            this.O.j = (byte)n2;
                        }
                    }
                    this.O.c();
                }
            }
            if (this.x && this.v) {
                if (this.r) {
                    this.n += this.p / 15;
                }
                if (this.s) {
                    this.o += this.q / 15;
                }
                if (this.r) {
                    this.l += this.n;
                    if (this.n > 0 && this.l > 0 || this.n < 0 && this.l < 0) {
                        this.n = 0;
                        this.l = 0;
                        this.r = false;
                    }
                }
                if (this.s) {
                    this.m += this.o;
                    if (this.o > 0 && this.m > 0 || this.o < 0 && this.m < 0) {
                        this.o = 0;
                        this.m = 0;
                        this.s = false;
                    }
                }
                if (!this.r && !this.s) {
                    this.v = false;
                }
                this.t = this.l / 10;
                this.u = this.m / 10;
            }
            if (this.z && this.N) {
                if (this.M > 0L) {
                    --this.M;
                    if (fb.rd == null) {
                        fb.rd = ab.b("weapons/np/rocket_sparks.png", 30, 30);
                        this.O = new nb(fb.rd);
                        this.O.b(true, false, (byte)1);
                        return;
                    }
                } else {
                    this.O.c();
                    ++this.o;
                    this.i -= this.o / 25;
                }
            }
        }
    }

    public final void b(Graphics graphics) {
        if (this.c != -1) {
            int n2 = -fb.Ge;
            int n3 = -fb.He;
            if (this.C) {
                this.O.b(graphics, this.f + n2 + 58, this.g + n3 + 48);
            }
            if (this.z && this.N && this.O != null && this.M <= 0L) {
                this.O.b(graphics, this.f + this.h + n2 + 48, this.g + this.i + n3 + 135 + 15);
                this.O.b(graphics, this.f + this.h + n2 + 101, this.g + this.i + n3 + 133 + 15);
                this.O.b(graphics, this.f + this.h + n2 + 125, this.g + this.i + n3 + 96 + 15);
            }
            if (this.z && this.w == 1 && fb.zb != null) {
                fb.zb.b(this.f + this.j + n2 - 25, this.g + this.k + n3);
                fb.zb.b(graphics);
            }
            this.e.b = this.d;
            this.e.b(this.f + this.j + n2 + this.h + this.t, this.g + this.k + n3 + this.i + this.u);
            this.e.b(graphics);
            if (this.A) {
                this.O.b(graphics, this.f + n2 + 5, this.g + n3 + 15);
            }
        }
    }

    public final void b(int n2, int n3) {
        boolean bl = ab.xc;
        while (j2.x && !j2.v) {
            j2.v = true;
            byte by = 1;
            if (Math.abs(n2) > 10 && Math.abs(n3) > 10) {
                by = 3;
            }
            j2.n = 0;
            j2.o = 0;
            j2.p = -n2 / by;
            j2.q = -n3 / by;
            j2.l = n2 / by;
            j2.m = n3 / by;
            if (Math.abs(n2) > 10) {
                j2.r = true;
            }
            if (Math.abs(n3) > 10) {
                j2.s = true;
            }
            by = j2.f / 30;
            int n4 = j2.g / 30;
            if (n2 != 0 && (by += Math.abs(n2) / n2) >= 0 && by < fb.Pe && fb.Re != null && fb.Re[by][n4].d != null) {
                fb.Re[by][n4].d.b(n2 / 2, 0);
            }
            by = j2.f / 30;
            n4 = j2.g / 30;
            if (n3 == 0 || (n4 += Math.abs(n3) / n3) < 0 || n4 >= fb.Qe || fb.Re == null || fb.Re[by][n4].d == null) break;
            n3 /= 2;
            n2 = 0;
            j j2 = fb.Re[by][n4].d;
            if (!bl) continue;
        }
    }

    public final int c() {
        return this.f + 15 + this.j;
    }

    public final int d() {
        return this.g + 15 + this.k;
    }

    public final boolean e() {
        if (this.c == -1) {
            return false;
        }
        return o.c(this.f + this.h + this.t + this.e.d / 2, this.g + this.i + this.u + this.e.e / 2, this.e.d, this.e.e);
    }

    public static void b(Graphics graphics, j j2) {
        int n2 = -fb.Ge;
        int n3 = -fb.He;
        if (j2.w == 0) {
            fb.Yc.b = 0;
            fb.Yc.b(j2.f + j2.h + n2, j2.g + j2.i + n3);
            fb.Yc.b(graphics);
            return;
        }
        if (j2.w == 1) {
            fb.ad.b = 0;
            fb.ad.b(j2.f + j2.h + n2, j2.g + j2.i + n3);
            fb.ad.b(graphics);
        }
    }

    public final void b(int n2) {
        if (this.I != 0) {
            this.c(this.H - n2);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void c(int var1_1) {
        block15: {
            block19: {
                block16: {
                    block18: {
                        block17: {
                            var2_2 = ab.xc;
                            this.H = var1_1;
                            if (this.H <= 0) break block16;
                            if (this.G != 0) break block17;
                            var1_1 = 99;
                            if (!var2_2) break block18;
                        }
                        var1_1 = 100 * this.H / this.G - 1;
                    }
                    if (this.E != -1) {
                        this.d = (byte)(this.E + (3 - var1_1 / 25));
                        if (fb.Kc != null) {
                            for (var1_1 = 0; var1_1 <= 2; ++var1_1) {
                                new t(1, fb.Kc, 5, this.c() + ((ab.oc.nextInt(10) << 1) - (ab.oc.nextInt(10) << 1)), this.d() + ((ab.oc.nextInt(10) << 1) - (ab.oc.nextInt(10) << 1)), 0, 1);
                                if (!var2_2) {
                                    if (!var2_2) continue;
                                }
                                break block15;
                            }
                        }
                    }
                    if (!var2_2) break block15;
                }
                if (this.I != j.K) break block19;
                if (fb.tb == null) ** GOTO lbl-1000
                new d(fb.tb, this.F, this.c(), this.d(), ab.sc);
                if (!var2_2) ** GOTO lbl-1000
            }
            if (this.I != j.L) ** GOTO lbl-1000
            if (fb.Vc != null) {
                new d(fb.Vc, this.F, this.c(), this.d(), ab.sc);
            }
            if (fb.Kc != null) {
                for (var1_1 = 0; var1_1 <= 3; ++var1_1) {
                    new t(1, fb.Kc, 5, this.c() + ((ab.oc.nextInt(10) << 1) - (ab.oc.nextInt(10) << 1)), this.d() + ((ab.oc.nextInt(10) << 1) - (ab.oc.nextInt(10) << 1)), 0, 1);
                    if (!var2_2) {
                        if (!var2_2) continue;
                    }
                    break;
                }
            } else lbl-1000:
            // 6 sources

            {
                this.f();
            }
            this.H = 0;
        }
        if (fb.M) {
            fb.I.b((byte)(this.f / 30), (byte)(this.g / 30), this.H);
        }
    }

    public final void f() {
        if (fb.Re != null && fb.Re[this.f / 30][this.g / 30].d != null) {
            fb.Re[this.f / 30][this.g / 30].d = null;
            fb.k();
        }
    }

    public final boolean b(q object, boolean bl, boolean bl2) {
        if (!this.N && !bl2) {
            return false;
        }
        if (this.A) {
            if (bl2) {
                this.g();
                return true;
            }
            if (((q)object).r == 0) {
                if (((q)object).nc >= ((q)object).mc) {
                    return false;
                }
                if (bl) {
                    return true;
                }
                if (fb.M || fb.i()) {
                    ((q)object).b(((q)object).mc, -1, -1, true, false);
                }
                this.g();
                return true;
            }
        }
        if (this.C) {
            object = new w(null, this.f + 45, this.g + 30, 8, true, 0);
            new w(null, this.f + 45, this.g + 30, 8, true, 0).i = "Use the Force, Pipyaka! :)";
        }
        if (this.D && fb.Pd != null) {
            ab.B.b(fb.Pd, false, !fb.i(), true, -1);
        }
        return false;
    }

    private void g() {
        if (this.A) {
            this.M = 375L;
            this.O.b(false, true, (byte)1);
            this.N = false;
        }
    }

    public static boolean c(int n2, int n3) {
        if (o.b((byte)n2, (byte)n3)) {
            return fb.Re[n2][n3].d != null;
        }
        return true;
    }
}

