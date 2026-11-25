/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class s
extends o {
    public boolean r;
    public boolean s;
    public nb t;
    public byte u;
    private boolean v;
    private byte w;
    private byte x;
    public boolean y;
    private boolean z;
    private boolean A;
    public static byte[][] B;
    private boolean C;
    public int D;
    public int E;
    private int F;
    public byte G;
    public q H;
    private int[] I;
    public boolean J;
    public int K;
    public int L;

    public s(byte by, byte by2, byte by3, boolean n2) {
        q[] qArray;
        block28: {
            block29: {
                boolean bl;
                block27: {
                    bl = ab.xc;
                    super((byte)-1, (byte)-1, by2 * 30 + 15, by3 * 30 + 15);
                    this.C = true;
                    this.K = 0;
                    this.L = 0;
                    this.u = by;
                    by = 0;
                    this.z = n2;
                    switch (this.u) {
                        case -1: {
                            this.t = new nb(fb.Sc);
                            this.t.j = 0;
                            this.I = new int[10];
                            this.J = true;
                            if (!bl) break;
                        }
                        case 1: {
                            this.t = new nb(fb.Rc);
                            this.w = (byte)-7;
                            this.x = (byte)-2;
                            if (!bl) break;
                        }
                        case 2: {
                            this.t = new nb(fb.oc);
                            n2 = ab.oc.nextInt(4);
                            this.t.j = n2 < 2 ? (byte)n2 : (byte)(this.t.b.h - 1 - (n2 - 2));
                            this.w = (byte)ab.oc.nextInt(10);
                            this.s = true;
                            if (!bl) break;
                        }
                        case 3: {
                            this.t = new nb(fb.pc);
                            n2 = ab.oc.nextInt(4);
                            this.t.j = n2 < 2 ? (byte)n2 : (byte)(this.t.b.h - 1 - (n2 - 2));
                            this.w = (byte)ab.oc.nextInt(10);
                            this.s = true;
                            if (!bl) break;
                        }
                        case 12: {
                            this.t = new nb(fb.nc);
                            n2 = ab.oc.nextInt(4);
                            this.t.j = n2 < 2 ? (byte)n2 : (byte)(this.t.b.h - 1 - (n2 - 2));
                            this.w = (byte)ab.oc.nextInt(10);
                            this.s = true;
                            if (!bl) break;
                        }
                        case 4: {
                            this.t = new nb(fb.uc);
                            this.t.j = (byte)ab.oc.nextInt(this.t.b.h);
                            this.w = (byte)ab.oc.nextInt(10);
                            this.s = true;
                            if (!bl) break;
                        }
                        case 5: {
                            this.t = new nb(fb.wc);
                            this.t.j = (byte)ab.oc.nextInt(this.t.b.h);
                            this.w = (byte)ab.oc.nextInt(10);
                            this.s = true;
                            if (!bl) break;
                        }
                        case 6: {
                            this.t = new nb(fb.Ac);
                            by = 1;
                            this.I = new int[10];
                            if (!bl) break;
                        }
                        case 7: {
                            this.t = new nb(fb.kc);
                            this.t.j = (byte)ab.oc.nextInt(this.t.b.h);
                            this.w = (byte)ab.oc.nextInt(10);
                            this.s = true;
                            if (!bl) break;
                        }
                        case 8: {
                            this.t = new nb(fb.Cb);
                            this.t.j = (byte)ab.oc.nextInt(3);
                            this.w = (byte)ab.oc.nextInt(10);
                            this.s = true;
                            if (!bl) break;
                        }
                        case 11: {
                            this.t = new nb(fb.Bb);
                            this.t.j = (byte)(2 + ab.oc.nextInt(3));
                            this.w = (byte)ab.oc.nextInt(10);
                            this.s = true;
                            if (!bl) break;
                        }
                        case 17: {
                            this.t = new nb(fb.pb);
                            n2 = ab.oc.nextInt(4);
                            this.t.j = n2 < 2 ? (byte)n2 : (byte)(this.t.b.h - 1 - (n2 - 2));
                            this.w = (byte)ab.oc.nextInt(10);
                            this.s = true;
                            this.t.b(true, false, (byte)1);
                            if (!bl) break;
                        }
                        case 9: {
                            this.t = new nb(fb.Fb);
                            this.t.j = (byte)ab.oc.nextInt(3);
                            this.w = (byte)ab.oc.nextInt(10);
                            this.s = true;
                            if (!bl) break;
                        }
                        case 10: {
                            this.t = new nb(fb.yc);
                            this.t.j = (byte)ab.oc.nextInt(this.t.b.h);
                            this.w = (byte)ab.oc.nextInt(10);
                            this.s = true;
                            if (!bl) break;
                        }
                        case 13: {
                            this.t = new nb(fb.Gb);
                            this.t.j = 0;
                            this.w = (byte)ab.oc.nextInt(10);
                            this.s = true;
                            if (!bl) break;
                        }
                        case 14: {
                            this.t = new nb(fb.Fc);
                            this.t.j = 1;
                            this.w = (byte)ab.oc.nextInt(10);
                            this.s = true;
                            if (!bl) break;
                        }
                        case 15: {
                            this.t = new nb(fb.Pc);
                            this.w = (byte)ab.oc.nextInt(10);
                            this.s = true;
                            if (!bl) break;
                        }
                        case 16: {
                            this.t = new nb(fb.Sc);
                            this.t.j = (byte)ab.oc.nextInt(this.t.b.h);
                            this.w = 0;
                        }
                    }
                    if (fb.Yd != null && by == 0) {
                        if (B == null) {
                            B = new byte[fb.Pe][fb.Qe];
                        }
                        s.B[by2][by3] = this.u;
                        fb.Yd.addElement(this);
                    }
                    if (this.u != 4) break block27;
                    s.b(this.g, this.h, 3, 1);
                    if (!bl) break block28;
                }
                if (this.u != 7) break block29;
                s.b(this.g, this.h, 4, 1);
                if (!bl) break block28;
            }
            if (this.u == 10) {
                s.b(this.g, this.h, 5, 1);
            }
        }
        if ((qArray = q.b((int)this.g, (int)this.h, 1, null)) != null && qArray.length > 0) {
            this.A = true;
        }
    }

    private boolean f() {
        if (this.u == 4) {
            return fb.b((int)this.g, (int)this.h, 3) != null;
        }
        if (this.u == 7) {
            return fb.b((int)this.g, (int)this.h, 4) != null;
        }
        if (this.u == 10) {
            return fb.b((int)this.g, (int)this.h, 5) != null;
        }
        return false;
    }

    private static void b(int n2, int n3, int n4, int n5) {
        o o2 = fb.b(n2, n3, n4);
        if (o2 != null) {
            if (n5 == 0 && o2.f < 2) {
                o2.f = (byte)(o2.f + 2);
                return;
            }
            if (n5 > 0 && o2.f > 1) {
                o2.f = (byte)(o2.f - 2);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean b(q q2) {
        if (q2 == null || this.r || this.u == -1) {
            return true;
        }
        if (fb.i() && q2 != fb.Pd && this.u != 1) {
            return false;
        }
        switch (this.u) {
            case 1: {
                byte by = y.b(q2.g, q2.h, this.g, this.h);
                if (fb.M || fb.i()) {
                    byte by2 = q2.l();
                    boolean bl = false;
                    if (by2 != by) {
                        bl = true;
                    }
                    q2.d(y.d(by, this.g), y.e(by, this.h));
                    q2.b(q2.g, q2.h, by, (byte)1, true, true, bl, (byte)1, (byte)-1, (byte)0, (byte)0);
                    this.g();
                    if (!ab.xc) return true;
                }
                if (fb.Pd != q2) return true;
                q2.d(y.d(by, this.g), y.e(by, this.h));
                return true;
            }
            case 2: {
                if (q2.fb || q2.ib || q2.kb) {
                    return false;
                }
                if (!fb.M && !fb.i()) return true;
                q2.e((byte)30, true);
                ++fb.e;
                this.g();
                return true;
            }
            case 3: {
                if (q2.fb || q2.ib || q2.kb) {
                    return false;
                }
                if (!fb.M && !fb.i()) return true;
                q2.g((byte)q2.x(), true);
                ++fb.e;
                this.g();
                return true;
            }
            case 12: {
                if (q2.fb || q2.ib || q2.kb) {
                    return false;
                }
                if (!fb.M && !fb.i()) return true;
                q2.f((byte)30, true);
                ++fb.e;
                this.g();
                return true;
            }
            case 4: {
                if (!fb.M && !fb.i()) return true;
                q2.c((byte)0, q2.dc[0] + 1 + (this.f() ? 2 : 0), true);
                ++fb.e;
                this.g();
                return true;
            }
            case 5: {
                if (!fb.M && !fb.i()) return true;
                q2.b((byte)9, q2.Yb[9] + 1 + ab.oc.nextInt(5), true);
                ++fb.e;
                this.g();
                return true;
            }
            case 6: {
                if (this.H != null) return false;
                if (q2.x != this.G) {
                    if (!fb.M && !fb.i()) return true;
                    fb.I.b(this.G, (byte)2, q2.w, this.g, this.h, (byte)1);
                    return true;
                }
                if (fb.b(q2) != -1 && fb.c(q2.x)) {
                    if (!fb.M && !fb.i()) return true;
                    fb.I.b(fb.b(q2), (byte)0, q2.w, this.g, this.h, (byte)2);
                    return true;
                }
                if (fb.c(q2.x)) return false;
                if (!fb.M && !fb.i()) return true;
                fb.I.b(q2.x, (byte)0, q2.w, this.g, this.h, (byte)3);
                return true;
            }
            case 7: {
                if (!fb.M && !fb.i()) return true;
                q2.b((byte)2, q2.Yb[2] + (5 + ab.oc.nextInt(6)) * (this.f() ? 2 : 1), true);
                ++fb.e;
                this.g();
                return true;
            }
            case 8: {
                if (!fb.M && !fb.i()) return true;
                q2.b((byte)5, q2.Yb[5] + 5 + ab.oc.nextInt(11), true);
                ++fb.e;
                this.g();
                return true;
            }
            case 11: {
                if (!fb.M && !fb.i()) return true;
                int n2 = 8 + ab.oc.nextInt(7);
                q2.b((byte)0, q2.Yb[0] + n2, false);
                ++fb.e;
                this.g();
                return true;
            }
            case 17: {
                if (!fb.M && !fb.i()) return true;
                int n3 = 8 + ab.oc.nextInt(7);
                q2.b(q2.C + n3, true);
                ++fb.e;
                this.g();
                return true;
            }
            case 9: {
                if (!fb.M && !fb.i()) return true;
                q2.b((byte)3, q2.Yb[3] + 10 + ab.oc.nextInt(11), true);
                ++fb.e;
                this.g();
                return true;
            }
            case 10: {
                if (!fb.M && !fb.i()) return true;
                q2.c((byte)4, q2.dc[4] + 1, true);
                ++fb.e;
                this.g();
                return true;
            }
            case 13: {
                if (!fb.M && !fb.i()) return true;
                q2.b((byte)7, q2.Yb[7] + 5 + ab.oc.nextInt(11), true);
                ++fb.e;
                this.g();
                return true;
            }
            case 14: {
                if (!fb.M && !fb.i()) return true;
                q2.b((byte)12, q2.Yb[12] + 10 + ab.oc.nextInt(11), true);
                ++fb.e;
                this.g();
                return true;
            }
            case 15: {
                if (!fb.M && !fb.i()) return true;
                q2.b((byte)13, q2.Yb[13] + 5 + ab.oc.nextInt(11), true);
                ++fb.e;
                this.g();
                return true;
            }
            case 16: {
                if (!fb.M && !fb.i()) return true;
                int n4 = this.L;
                byte by = (byte)this.K;
                q2.b(by, q2.Yb[by] + n4, true);
                this.g();
                return true;
            }
        }
        return false;
    }

    public static s b(byte by, byte by2) {
        boolean bl = ab.xc;
        if (fb.Yd != null && fb.Yd.size() > 0) {
            for (int i2 = 0; i2 < fb.Yd.size(); ++i2) {
                if (((s)fb.Yd.elementAt((int)i2)).g != by || ((s)fb.Yd.elementAt((int)i2)).h != by2) continue;
                return (s)fb.Yd.elementAt(i2);
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void h() {
        block47: {
            block40: {
                block58: {
                    block61: {
                        block59: {
                            block60: {
                                block56: {
                                    block57: {
                                        block54: {
                                            block55: {
                                                block52: {
                                                    block50: {
                                                        block53: {
                                                            block51: {
                                                                block49: {
                                                                    block48: {
                                                                        block43: {
                                                                            block46: {
                                                                                block44: {
                                                                                    block45: {
                                                                                        block41: {
                                                                                            block42: {
                                                                                                var7_1 = ab.xc;
                                                                                                if (fb.Re != null && !this.a()) {
                                                                                                    this.y = true;
                                                                                                    return;
                                                                                                }
                                                                                                super.h();
                                                                                                if (this.A && (var1_2 = q.b((int)this.g, (int)this.h, 1, null)) != null && var1_2.length > 0) {
                                                                                                    this.b(var1_2[0]);
                                                                                                }
                                                                                                if (fb.Re == null || !this.a()) break block41;
                                                                                                if (this.u != 6) break block42;
                                                                                                v0 = this;
                                                                                                ** GOTO lbl-1000
                                                                                            }
                                                                                            v0 = this;
                                                                                            if (fb.Re[this.g][this.h].d != null && !this.z) {
                                                                                                v1 = true;
                                                                                            } else lbl-1000:
                                                                                            // 2 sources

                                                                                            {
                                                                                                v1 = v0.y = false;
                                                                                            }
                                                                                            if (this.y) {
                                                                                                return;
                                                                                            }
                                                                                        }
                                                                                        if (this.t != null) {
                                                                                            this.t.c();
                                                                                        }
                                                                                        if (this.u == 6 || this.u == 1 || this.u == 16 || this.u == -1) break block43;
                                                                                        v2 = this.C = this.C == false;
                                                                                        if (!this.C) break block43;
                                                                                        if (this.v) break block44;
                                                                                        if (this.w >= 10) break block45;
                                                                                        this.w = (byte)(this.w + 1);
                                                                                        if (!var7_1) break block43;
                                                                                    }
                                                                                    this.v = true;
                                                                                    if (!var7_1) break block43;
                                                                                }
                                                                                if (this.w <= 5) break block46;
                                                                                this.w = (byte)(this.w - 1);
                                                                                if (!var7_1) break block43;
                                                                            }
                                                                            this.v = false;
                                                                        }
                                                                        if (this.u != 6 && this.u != -1) break block47;
                                                                        if (this.u == -1) break block48;
                                                                        if (!fb.M && !fb.i() || this.H == null || !this.H.m()) break block49;
                                                                        fb.I.b(this.G, (byte)1, this.H.w, this.g, this.h, (byte)0);
                                                                        if (!var7_1) break block49;
                                                                    }
                                                                    if (this.J && this.H != null && this.H.V) {
                                                                        this.g();
                                                                        return;
                                                                    }
                                                                }
                                                                var4_4 = 0;
                                                                var5_5 = 0;
                                                                if (this.H == null) break block50;
                                                                v3 = this.H;
                                                                var6_6 /* !! */  = v3;
                                                                var6_6 /* !! */  = this.H;
                                                                this.b(v3.c / 10, var6_6 /* !! */ .d / 10);
                                                                var6_6 /* !! */  = this;
                                                                var1_3 = var6_6 /* !! */ .c / 10 - this.D;
                                                                var6_6 /* !! */  = this;
                                                                var2_7 = var6_6 /* !! */ .d / 10 - this.E;
                                                                if (this.J) break block51;
                                                                var3_8 = 40 - s.b(0, 0, var1_3, var2_7) + this.H.Ib - this.F + 5;
                                                                if (!var7_1) break block52;
                                                            }
                                                            var3_8 = 0;
                                                            if (this.H.vb == 0) break block52;
                                                            if (this.H.ub % 2 != 0) break block53;
                                                            var4_4 = 1;
                                                            if (!var7_1) break block52;
                                                        }
                                                        var5_5 = 1;
                                                        if (!var7_1) break block52;
                                                    }
                                                    var1_3 = this.g * 30 + 15 - this.D;
                                                    var2_7 = this.h * 30 + 15 - this.E;
                                                    var3_8 = 30 - this.F;
                                                }
                                                if (var1_3 == 0) break block54;
                                                if (Math.abs(var1_3) <= 30) break block55;
                                                var6_6 /* !! */  = this;
                                                this.D = var6_6 /* !! */ .c / 10 - Math.abs(var1_3) / var1_3 * 30;
                                                if (!var7_1) break block54;
                                            }
                                            if (!this.J || var4_4 != 0) {
                                                this.x = (byte)10;
                                                if (var1_3 / this.x == 0) {
                                                    this.x = (byte)Math.abs(var1_3);
                                                }
                                                this.D += var1_3 / this.x;
                                            }
                                        }
                                        if (var2_7 == 0) break block56;
                                        if (Math.abs(var2_7) <= 30) break block57;
                                        var6_6 /* !! */  = this;
                                        this.E = var6_6 /* !! */ .d / 10 - Math.abs(var2_7) / var2_7 * 30;
                                        if (!var7_1) break block56;
                                    }
                                    if (!this.J || var5_5 != 0) {
                                        this.x = (byte)10;
                                        if (var2_7 / this.x == 0) {
                                            this.x = (byte)Math.abs(var2_7);
                                        }
                                        this.E += var2_7 / this.x;
                                    }
                                }
                                if (var3_8 != 0) {
                                    this.F += var3_8 / 5;
                                }
                                if (this.J || this.H != null && (this.H == null || this.H.r())) break block58;
                                v4 = var3_8 = s.b(0, 0, var1_3, var2_7) > 30 ? 1 : 0;
                                if (fb.kb % 5L != 0L && var3_8 == 0) break block58;
                                if (this.v) break block59;
                                if (this.w >= (var3_8 != 0 ? 4 : 5)) break block60;
                                this.w = (byte)(this.w + (var3_8 != 0 ? 2 : 1));
                                if (!var7_1) break block58;
                            }
                            this.v = true;
                            if (!var7_1) break block58;
                        }
                        if (this.w <= -(var3_8 != 0 ? 4 : 5)) break block61;
                        this.w = (byte)(this.w - (var3_8 != 0 ? 2 : 1));
                        if (!var7_1) break block58;
                    }
                    this.v = false;
                }
                if (this.J) {
                    this.w = (byte)(this.w + this.t.d / 2);
                }
                var3_8 = this.D;
                var4_4 = this.E - this.F - this.w + 10;
                for (var5_5 = 0; var5_5 < this.I.length / 2; var5_5 = (int)((byte)(var5_5 + 1))) {
                    this.I[var5_5 << 1] = var3_8 * 10 + var1_3 * 10 / (this.I.length / 2 + 2) * var5_5;
                    v5 = this;
                    if (!var7_1) {
                        v5.I[(var5_5 << 1) + 1] = var4_4 * 10 + (var2_7 - (this.H == null ? 0 : this.H.Ib)) * 10 / (this.I.length / 2 + 2) * var5_5 + (this.F + this.w - 15) * 10 / (this.I.length / 2 + 2) * var5_5;
                        if (!var7_1) continue;
                    }
                    break block40;
                }
                v5 = this;
            }
            if (v5.J) {
                this.w = 0;
            }
        }
    }

    public final void b(Graphics graphics) {
        s s2;
        boolean bl;
        block14: {
            block13: {
                bl = ab.xc;
                if (this.y) {
                    return;
                }
                if (this.u != 2 && this.u != 3 && this.u != 8 && this.u != 7 && this.u != 12 && this.u != 13 && this.u != 14 && this.u != 15 && this.u != 11 && this.u != 9 && this.u != 4 && this.u != 10 && this.u != 5 && this.u != 17) break block13;
                if (fb.Ob == null) break block14;
                fb.Ob.b = 2;
                s s3 = this;
                s2 = s3;
                s2 = this;
                fb.Ob.b(s3.c / 10 - fb.Ob.d / 2 - fb.Ge, s2.d / 10 - fb.Ob.e / 2 + 8 - fb.He);
                fb.Ob.b(graphics);
                if (!bl) break block14;
            }
            if (this.u == 6) {
                this.t.j = this.G;
            }
        }
        if (this.u != 6 && this.u != -1) {
            if (this.t != null) {
                s s4 = this;
                s2 = s4;
                s2 = this;
                this.t.b(graphics, s4.c / 10 - fb.Ge + this.x, s2.d / 10 - fb.He - this.w);
                return;
            }
        } else if (this.I != null) {
            for (int n2 = 0; n2 < this.I.length / 2; n2 = (int)((byte)(n2 + 1))) {
                graphics.drawImage(fb.Cc, this.I[n2 << 1] / 10 - fb.Ge, this.I[(n2 << 1) + 1] / 10 - fb.He, 0);
                if (!bl) {
                    if (!bl) continue;
                }
                break;
            }
        } else {
            this.t.b(graphics, this.D - fb.Ge, this.E - fb.He - this.w - this.F);
        }
    }

    public final void g() {
        block10: {
            block11: {
                boolean bl;
                block9: {
                    bl = ab.xc;
                    if (this.u == 6) {
                        this.H = null;
                        fb.b(this.G);
                        return;
                    }
                    if (this.u != 4) break block9;
                    s.b(this.g, this.h, 3, 0);
                    if (!bl) break block10;
                }
                if (this.u != 7) break block11;
                s.b(this.g, this.h, 4, 0);
                if (!bl) break block10;
            }
            if (this.u == 10) {
                s.b(this.g, this.h, 5, 0);
            }
        }
        if (this.u != 1) {
            if (o.c(this.g, this.h)) {
                ab.G.b(ab.S, 0);
            }
            if (fb.Yd != null) {
                if (B != null) {
                    s.B[this.g][this.h] = 0;
                }
                this.r = true;
            }
        }
    }
}

