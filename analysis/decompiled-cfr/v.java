/*
 * Decompiled with CFR 0.152.
 */
public final class v {
    private byte a;
    private byte b;
    private byte c;
    public byte d;
    private byte f;
    private byte g;
    private byte h;
    private byte i;
    private byte j;
    private byte k;
    private byte l;
    private byte m;
    private byte n;
    private boolean o;
    private q p;
    public boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    public boolean u;
    public boolean v;
    private boolean w;
    public boolean x;
    public long y;
    public q z;
    private boolean A;

    public v(byte by, byte by2, byte by3, byte by4, byte by5, byte by6, byte by7, byte by8, byte by9, byte by10, boolean bl, boolean bl2, boolean bl3, byte by11, byte by12, boolean bl4, byte by13) {
        block9: {
            block8: {
                this.a = by;
                this.b = by2;
                this.c = by3;
                this.d = by6;
                if (!fb.i() && this.d == 0) {
                    this.d = (byte)3;
                }
                this.f = by4;
                this.g = by5;
                this.h = by7;
                this.i = by8;
                if (!(o.b(this.h, this.i) || this.c != 1 && this.c != 2 && this.c != 5)) {
                    this.q = true;
                }
                this.j = by11;
                this.k = by12;
                if (o.b(this.j, this.k)) {
                    this.s = true;
                }
                this.t = bl4;
                this.o = bl;
                this.u = bl2;
                this.v = bl3;
                this.l = by9;
                if (this.l == 0) {
                    this.w = true;
                }
                this.m = by10;
                this.y = this.m * 25;
                this.x = false;
                this.n = by13;
                this.p = null;
                if (this.c != 3) break block8;
                fb.ff = true;
                if (!ab.xc) break block9;
            }
            if (this.c == 19 || this.c == 24) {
                this.A = true;
            }
        }
        fb.Zd.addElement(this);
    }

    public final void b() {
        block24: {
            q q2;
            block21: {
                boolean bl;
                block22: {
                    block23: {
                        bl = ab.xc;
                        if (this.r) {
                            this.b(this.z);
                            this.r = false;
                            return;
                        }
                        if (!this.o || fb.Qd == null) {
                            return;
                        }
                        if (this.c == 24) {
                            for (int i2 = 0; i2 < fb.Ud.size(); ++i2) {
                                hb hb2 = (hb)fb.Ud.elementAt(i2);
                                if (!this.b(hb2.q, hb2.r)) continue;
                                hb2.p = true;
                                if (!bl) continue;
                            }
                            return;
                        }
                        if (this.d == 1) {
                            return;
                        }
                        if (this.d == 7 && !this.x) {
                            this.b(null);
                            return;
                        }
                        if (this.p == null) break block22;
                        if (!this.v) break block23;
                        if (this.c(this.p)) break block22;
                        this.p = null;
                        if (!bl) break block22;
                    }
                    if (!this.b(this.p.g, this.p.h)) {
                        this.p = null;
                    }
                }
                if (this.p == null || this.A) {
                    for (int i3 = 0; i3 < fb.Qd.size(); ++i3) {
                        q2 = (q)fb.Qd.elementAt(i3);
                        if (!bl) {
                            q q3;
                            if (q2 == null || !this.d(q3) || (!this.v ? !this.b(q3.g, q3.h) : !this.c(q3))) continue;
                            this.p = q3;
                            if (this.v || this.u) break;
                            this.b(this.p);
                            if (!bl) break;
                            if (!bl) continue;
                        }
                        break block21;
                    }
                }
                if (!this.b(fb.I.x, fb.I.y)) break block24;
                q2 = this.p;
            }
            if (q2 != null) {
                fb.I.A = true;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void b(q var1_1) {
        block62: {
            var9_2 = ab.xc;
            if (!this.o) {
                return;
            }
            if (this.y > 0L) {
                this.z = var1_1;
                this.x = true;
                return;
            }
            var2_3 = 0;
            var3_6 = 0;
            block0 : switch (this.c) {
                case 0: {
                    if (!var9_2) ** GOTO lbl190
                }
                case 8: {
                    var3_6 = 1;
                }
                case 2: {
                    var2_3 = 1;
                }
                case 1: {
                    if (fb.Zd == null) ** GOTO lbl190
                    for (var5_8 = 0; var5_8 < fb.Zd.size(); ++var5_8) {
                        v0 = (v)fb.Zd.elementAt(var5_8);
                        if (var9_2) break block0;
                        if (v0 == null || var4_12.a != this.h || var4_12.b != this.i) continue;
                        if (var2_3 == 0) ** GOTO lbl29
                        if (var3_6 != 0 && var4_12.y != 0L) {
                            var4_12.y = 0L;
                        }
                        var4_12.r = true;
                        var4_12.z = var1_1;
                        if (!var9_2) ** GOTO lbl190
lbl29:
                        // 2 sources

                        v1 = var4_12.o = var4_12.o == false;
                        if (var9_2) {
                            if (!var9_2) continue;
                        }
                        ** GOTO lbl190
                    }
                    if (!var9_2) ** GOTO lbl190
                }
                case 3: {
                    fb.I.c(true, false);
                    if (!var9_2) ** GOTO lbl190
                }
                case 4: {
                    fb.I.c(false, false);
                    if (!var9_2) ** GOTO lbl190
                }
                case 5: {
                    fb.I.w = 0;
                    fb.I.x = this.h;
                    fb.I.y = this.i;
                    fb.I.z = 0;
                    var3_6 = this.i;
                    var2_3 = this.h;
                    var4_12 = null;
                    if (fb.Zd != null) {
                        for (var7_13 = 0; var7_13 < 2; ++var7_13) {
                            var5_8 = 0;
                            v2 = 0;
                            if (var9_2) break block62;
                            for (var8_15 = v222776; var8_15 < fb.Zd.size(); ++var8_15) {
                                v0 = (v)fb.Zd.elementAt(var8_15);
                                if (var9_2) break block0;
                                if (v0 == null || var6_14.q || !var6_14.b(var2_3, var3_6)) continue;
                                if (var7_13 == 1) {
                                    var4_12[var5_8] = var6_14;
                                }
                                ++var5_8;
                                if (!var9_2) continue;
                            }
                            if (var7_13 == 0) {
                                if (var5_8 > 0) {
                                    var4_12 = new v[var5_8];
                                    if (!var9_2) continue;
                                }
                                v3 = null;
                            } else {
                                v3 = var4_12;
                            }
                            break;
                        }
                    } else {
                        v3 = var4_12 = null;
                    }
                    if (v3 == null) ** GOTO lbl190
                    for (var5_8 = 0; var5_8 < var4_12.length; ++var5_8) {
                        v0 = var4_12[var5_8];
                        if (var9_2) break block0;
                        if (v0 == null) continue;
                        if (!var4_12[var5_8].u && !var4_12[var5_8].v) ** GOTO lbl84
                        if (!var4_12[var5_8].o && (var4_12[var5_8].o || !this.s || var4_12[var5_8].a != this.j || var4_12[var5_8].b != this.k)) continue;
                        if (!var4_12[var5_8].u) ** GOTO lbl81
                        fb.I.w = 1;
                        if (!var9_2) ** GOTO lbl190
lbl81:
                        // 2 sources

                        if (!var4_12[var5_8].v) continue;
                        fb.I.w = 2;
                        if (!var9_2) ** GOTO lbl190
lbl84:
                        // 2 sources

                        if (!this.s || var4_12[var5_8].a != this.j || var4_12[var5_8].b != this.k || var4_12[var5_8].m <= 0) continue;
                        fb.I.w = 3;
                        if (var9_2) {
                            if (!var9_2) continue;
                        }
                        ** GOTO lbl190
                    }
                    if (!var9_2) ** GOTO lbl190
                }
                case 6: {
                    fb.I.w = -1;
                    if (!var9_2) ** GOTO lbl190
                }
                case 7: 
                case 22: {
                    if (var1_1 == null) ** GOTO lbl190
                    var5_8 = var1_1.nc / 2;
                    if (var5_8 == 0) {
                        var5_8 = 1;
                    }
                    if (this.c != 22) ** GOTO lbl102
                    var1_1.nc = var5_8;
                    if (!var9_2) ** GOTO lbl190
lbl102:
                    // 2 sources

                    var1_1.b(var5_8, -1, -1, true, false);
                    if (!var9_2) ** GOTO lbl190
                }
                case 9: {
                    var5_9 = sb.b(this.h, this.i);
                    if (var5_9 == null) ** GOTO lbl190
                    for (var2_3 = 0; var2_3 < var5_9.length; ++var2_3) {
                        if (var5_9[var2_3] == null) continue;
                        var5_9[var2_3].b = true;
                        if (!var9_2) continue;
                    }
                    if (!var9_2) ** GOTO lbl190
                }
                case 10: {
                    var5_9 = sb.b(this.h, this.i);
                    if (var5_9 == null) ** GOTO lbl190
                    for (var2_3 = 0; var2_3 < var5_9.length; ++var2_3) {
                        if (var5_9[var2_3] == null) continue;
                        var5_9[var2_3].b = false;
                        if (!var9_2) continue;
                    }
                    if (!var9_2) ** GOTO lbl190
                }
                case 11: {
                    var2_4 = r.b(this.h, this.i);
                    if (var2_4 == null) ** GOTO lbl190
                    for (var3_6 = 0; var3_6 < var2_4.length; ++var3_6) {
                        if (var2_4[var3_6] == null) continue;
                        var5_10 = var2_4[var3_6].A == false;
                        var4_12 = var2_4[var3_6];
                        var2_4[var3_6].A = var5_10;
                        if (!var9_2) continue;
                        ** GOTO lbl190
                    }
                    ** GOTO lbl190
                }
                case 12: 
                case 13: {
                    var3_7 = g.b(this.h, this.i);
                    if (var3_7 == null) ** GOTO lbl190
                    if (this.c != 12 || var3_7.d != 1) ** GOTO lbl138
                    k.b(var3_7.e, var3_7.b, var3_7.c, false, false);
                    if (!var9_2) ** GOTO lbl190
lbl138:
                    // 2 sources

                    if (this.c == 13 && var3_7.d == 3) {
                        k.c(var3_7.e, var3_7.b, var3_7.c, false, false);
                    }
                    ** GOTO lbl190
                }
                case 14: {
                    if (!o.b(this.h, this.i) || j.c(this.h, this.i)) ** GOTO lbl190
                    fb.Re[this.h][this.i].d = new j(0, (byte)ab.oc.nextInt(3), this.h, this.i, 0);
                    fb.bf[this.h][this.i] = 0;
                    if (!var9_2) ** GOTO lbl190
                }
                case 15: {
                    if (!o.b(this.h, this.i) || !j.c(this.h, this.i)) ** GOTO lbl190
                    fb.Re[this.h][this.i].d.f();
                    fb.Re[this.h][this.i].d = null;
                    fb.bf[this.h][this.i] = -1;
                    if (!var9_2) ** GOTO lbl190
                }
                case 16: 
                case 17: 
                case 23: {
                    fb.Ce = (byte)60;
                    if (fb.De == fb.Pd) {
                        fb.Pd.i();
                        fb.I.e();
                    }
                    if (this.c == 23) {
                        fb.Ce = (byte)10;
                    }
                    ab.w = true;
                    fb.b(null, true);
                    fb.De = null;
                    fb.Ee = fb.Ie = this.h * 30 + 15;
                    fb.Fe = fb.Je = this.i * 30 + 15;
                    if (this.c != 16) ** GOTO lbl190
                    fb.Ge = fb.Ie - ab.D / 2;
                    fb.He = fb.Je - ab.E / 2;
                    if (!var9_2) ** GOTO lbl190
                }
                case 18: {
                    ab.w = false;
                    fb.Ce = (byte)60;
                    fb.I.e();
                    if (fb.De != null || ab.v) ** GOTO lbl190
                    fb.Ie = fb.Ee = fb.Pd.g * 30 + 15 - ab.D / 2;
                    fb.Je = fb.Fe = fb.Pd.h * 30 + 15 - ab.E / 2;
                    fb.b(fb.Pd, false);
                    if (!var9_2) ** GOTO lbl190
                }
                case 19: {
                    var1_1.a();
                    if (!var9_2) ** GOTO lbl190
                }
                case 20: {
                    if (this.l > 1) {
                        this.l = (byte)(this.l - 1);
                        return;
                    } else {
                        ** GOTO lbl186
                    }
                }
                {
lbl186:
                    // 2 sources

                    ** GOTO lbl190
                }
                case 21: {
                    if (this.n >= 0) {
                        fb.I.f((int)this.n);
                    }
                }
lbl190:
                // 40 sources

                default: {
                    v0 = this;
                }
            }
            v2 = v0.s;
        }
        if (v2 != 0 && fb.Zd != null) {
            for (var5_11 = 0; var5_11 < fb.Zd.size(); ++var5_11) {
                v4 = (v)fb.Zd.elementAt(var5_11);
                if (!var9_2) {
                    if (v4 == null || var4_12 == this || var4_12.a != this.j || var4_12.b != this.k) continue;
                    if (this.t) {
                        var4_12.r = true;
                        var4_12.z = var1_1;
                        if (!var9_2) break;
                    }
                    var4_12.o = true;
                    if (!var9_2) break;
                    if (!var9_2) continue;
                }
                break;
            }
        } else {
            v4 = this;
        }
        if (!v4.w) {
            this.l = (byte)(this.l - 1);
            if (this.l <= 0) {
                var2_5 = this;
                this.q = true;
            }
        }
        if (!this.q) {
            this.x = false;
            this.y = this.m * 25;
        }
    }

    private boolean c(q q2) {
        return q2.ub == 0 ? this.b(q2.g, q2.h + 1) : (q2.ub == 2 ? this.b(q2.g, q2.h - 1) : (q2.ub == 1 ? this.b(q2.g - 1, q2.h) : q2.ub == 3 && this.b(q2.g + 1, q2.h)));
    }

    public final boolean d(q q2) {
        if (q2 == null) {
            return false;
        }
        if (q2.mb != 0) {
            return false;
        }
        switch (this.d) {
            case 0: {
                if (q2 != fb.Pd) break;
                return true;
            }
            case 2: {
                if (q2 == null) break;
                return true;
            }
            case 3: {
                if (q2.x < 0) break;
                return true;
            }
            case 4: {
                if (q2.x >= 0) break;
                return true;
            }
            case 5: {
                if (q2.x != 0) break;
                return true;
            }
            case 6: {
                if (q2.x != 1) break;
                return true;
            }
        }
        return false;
    }

    public final boolean b(int n2, int n3) {
        return n2 >= this.a && n3 >= this.b && n2 < this.a + this.f && n3 < this.b + this.g;
    }
}

