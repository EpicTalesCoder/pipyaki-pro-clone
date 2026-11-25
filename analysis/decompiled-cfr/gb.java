/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class gb {
    private static int[] b = new int[]{16, 9, 3, 0, 0, 4, 10, 17, 24, 28};
    private static int[] c = new int[]{29, 28, 24, 18, 10, 4, 0, 0, 3, 9};
    public boolean d = false;
    private int e;
    private int f;
    private int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    private qb p;
    public int q;
    public int r;
    public int s;
    public int t;
    public String u = "";
    public boolean v;
    public int w;
    private int x;
    private int y;
    private boolean z;
    public boolean A;
    public int B;
    private int C;
    private int D;

    public gb(int n2, qb qb2, int n3, int n4, String string) {
        this.n = n2;
        this.p = qb2;
        this.o = n3;
        this.q = 0;
        this.u = string;
        this.a();
    }

    public gb(int n2, qb qb2, int n3, int n4) {
        this.n = n2;
        this.p = qb2;
        this.o = n3;
        this.q = n4;
        this.a();
    }

    private void a() {
        block12: {
            block34: {
                boolean bl;
                block33: {
                    block31: {
                        block32: {
                            block29: {
                                block30: {
                                    block27: {
                                        block28: {
                                            block26: {
                                                block25: {
                                                    block24: {
                                                        block23: {
                                                            block22: {
                                                                block21: {
                                                                    block20: {
                                                                        block18: {
                                                                            block19: {
                                                                                block16: {
                                                                                    block17: {
                                                                                        block14: {
                                                                                            block15: {
                                                                                                block13: {
                                                                                                    block11: {
                                                                                                        bl = ab.xc;
                                                                                                        if (this.o != 10) break block11;
                                                                                                        this.l = ab.j() / 10;
                                                                                                        if (!bl) break block12;
                                                                                                    }
                                                                                                    if (this.o != 24) break block13;
                                                                                                    this.l = ab.i() / 10;
                                                                                                    if (!bl) break block12;
                                                                                                }
                                                                                                if (this.o != 11) break block14;
                                                                                                if (!ab.Ib) break block15;
                                                                                                this.l = 1;
                                                                                                if (!bl) break block12;
                                                                                            }
                                                                                            this.l = 0;
                                                                                            if (!bl) break block12;
                                                                                        }
                                                                                        if (this.o != 37) break block16;
                                                                                        if (!ab.Db) break block17;
                                                                                        this.l = 1;
                                                                                        if (!bl) break block12;
                                                                                    }
                                                                                    this.l = 0;
                                                                                    if (!bl) break block12;
                                                                                }
                                                                                if (this.o != 18) break block18;
                                                                                if (!ab.Jb) break block19;
                                                                                this.l = 0;
                                                                                if (!bl) break block12;
                                                                            }
                                                                            this.l = 1;
                                                                            if (!bl) break block12;
                                                                        }
                                                                        if (this.o != 60) break block20;
                                                                        int n2 = this.l = ab.hc ? 1 : 0;
                                                                        if (!bl) break block12;
                                                                    }
                                                                    if (this.o != 29) break block21;
                                                                    this.l = ab.Nb;
                                                                    if (!bl) break block12;
                                                                }
                                                                if (this.o != 28) break block22;
                                                                this.l = ab.Mb;
                                                                if (!bl) break block12;
                                                            }
                                                            if (this.o != 27) break block23;
                                                            this.l = ab.Lb;
                                                            if (!bl) break block12;
                                                        }
                                                        if (this.o != 33) break block24;
                                                        this.u = ab.Kb;
                                                        if (!bl) break block12;
                                                    }
                                                    if (this.o != 39) break block25;
                                                    this.u = "SMS = " + this.p.I() + "^41~";
                                                    if (!bl) break block12;
                                                }
                                                if (this.o != 17) break block26;
                                                this.l = ab.Ub;
                                                if (!bl) break block12;
                                            }
                                            if (this.o != 47) break block27;
                                            if (!ab.cc) break block28;
                                            this.l = 1;
                                            if (!bl) break block12;
                                        }
                                        this.l = 0;
                                        if (!bl) break block12;
                                    }
                                    if (this.o != 43) break block29;
                                    if (!ab.Cb) break block30;
                                    this.l = 1;
                                    if (!bl) break block12;
                                }
                                this.l = 0;
                                if (!bl) break block12;
                            }
                            if (this.o != 30) break block31;
                            if (!ab.gc) break block32;
                            this.l = 1;
                            if (!bl) break block12;
                        }
                        this.l = 0;
                        if (!bl) break block12;
                    }
                    if (this.o != 58) break block33;
                    this.l = ab.ec;
                    if (!bl) break block12;
                }
                if (this.o != 59) break block34;
                this.l = ab.fc;
                if (!bl) break block12;
            }
            if (this.o == 57) {
                this.l = ab.dc;
            }
        }
        if (this.f()) {
            this.D = 18;
            if (this.D < ab.F.getHeight() + 4) {
                this.D = ab.F.getHeight() + 4;
            }
            this.C = 120;
            return;
        }
        if (this.o == 51) {
            this.C = qb.S.d;
            this.D = qb.S.e;
            return;
        }
        if (this.o == 54) {
            this.C = ab.D - 14;
            if (this.p.G && this.p.yc >= 0) {
                this.D = b.c(this.u, this.b()) + 10;
                return;
            }
            this.D = ab.C.b(this.u, this.b()) + 10;
            return;
        }
        if (this.o == 21) {
            this.C = qb.R.d;
            this.D = qb.R.e;
            return;
        }
        if (this.o == 34) {
            this.C = qb.V.d;
            this.D = qb.V.e;
            return;
        }
        this.C = this.p.wb;
        this.D = this.p.xb;
    }

    public final int b() {
        if (this.o == 53 && this.p.Rb == this.o) {
            return this.p.wb;
        }
        return this.C;
    }

    public final int c() {
        if (this.o == 53 && this.p.Rb == this.o) {
            return this.p.xb;
        }
        return this.D;
    }

    public final int d() {
        if (this.f()) {
            return this.c() + 6;
        }
        return this.c();
    }

    private boolean f() {
        return this.o == 49 || this.o == 50 || this.o == 52 || this.o == 53 && this.p.Rb != this.o;
    }

    /*
     * Unable to fully structure code
     */
    public final void b(Graphics var1_1, int var2_2, int var3_3) {
        block149: {
            block151: {
                block150: {
                    block148: {
                        block147: {
                            block93: {
                                block146: {
                                    block145: {
                                        block144: {
                                            block143: {
                                                block142: {
                                                    block141: {
                                                        block99: {
                                                            block140: {
                                                                block139: {
                                                                    block138: {
                                                                        block137: {
                                                                            block136: {
                                                                                block135: {
                                                                                    block134: {
                                                                                        block133: {
                                                                                            block132: {
                                                                                                block131: {
                                                                                                    block130: {
                                                                                                        block129: {
                                                                                                            block128: {
                                                                                                                block127: {
                                                                                                                    block126: {
                                                                                                                        block125: {
                                                                                                                            block124: {
                                                                                                                                block123: {
                                                                                                                                    block122: {
                                                                                                                                        block121: {
                                                                                                                                            block120: {
                                                                                                                                                block119: {
                                                                                                                                                    block118: {
                                                                                                                                                        block117: {
                                                                                                                                                            block116: {
                                                                                                                                                                block115: {
                                                                                                                                                                    block114: {
                                                                                                                                                                        block113: {
                                                                                                                                                                            block112: {
                                                                                                                                                                                block110: {
                                                                                                                                                                                    block111: {
                                                                                                                                                                                        block109: {
                                                                                                                                                                                            block108: {
                                                                                                                                                                                                block107: {
                                                                                                                                                                                                    block106: {
                                                                                                                                                                                                        block105: {
                                                                                                                                                                                                            block104: {
                                                                                                                                                                                                                block103: {
                                                                                                                                                                                                                    block102: {
                                                                                                                                                                                                                        block101: {
                                                                                                                                                                                                                            block100: {
                                                                                                                                                                                                                                block98: {
                                                                                                                                                                                                                                    block90: {
                                                                                                                                                                                                                                        block97: {
                                                                                                                                                                                                                                            block96: {
                                                                                                                                                                                                                                                block95: {
                                                                                                                                                                                                                                                    block94: {
                                                                                                                                                                                                                                                        block92: {
                                                                                                                                                                                                                                                            block91: {
                                                                                                                                                                                                                                                                block89: {
                                                                                                                                                                                                                                                                    block88: {
                                                                                                                                                                                                                                                                        block83: {
                                                                                                                                                                                                                                                                            block85: {
                                                                                                                                                                                                                                                                                block86: {
                                                                                                                                                                                                                                                                                    block87: {
                                                                                                                                                                                                                                                                                        block84: {
                                                                                                                                                                                                                                                                                            block80: {
                                                                                                                                                                                                                                                                                                block82: {
                                                                                                                                                                                                                                                                                                    block81: {
                                                                                                                                                                                                                                                                                                        block76: {
                                                                                                                                                                                                                                                                                                            block77: {
                                                                                                                                                                                                                                                                                                                block79: {
                                                                                                                                                                                                                                                                                                                    block78: {
                                                                                                                                                                                                                                                                                                                        var15_4 = ab.xc;
                                                                                                                                                                                                                                                                                                                        var11_5 = this;
                                                                                                                                                                                                                                                                                                                        var4_8 = var11_5.f;
                                                                                                                                                                                                                                                                                                                        var11_5 = this;
                                                                                                                                                                                                                                                                                                                        var5_9 = var11_5.g;
                                                                                                                                                                                                                                                                                                                        if (this.r()) {
                                                                                                                                                                                                                                                                                                                            var4_8 = ab.D / 2 - var2_2;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        var6_10 = var4_8 + var2_2 - this.b() / 2;
                                                                                                                                                                                                                                                                                                                        var7_11 = var5_9 + var3_3 - this.c() / 2;
                                                                                                                                                                                                                                                                                                                        this.j = var4_8 + var2_2;
                                                                                                                                                                                                                                                                                                                        this.k = var5_9 + var3_3;
                                                                                                                                                                                                                                                                                                                        var10_12 = var3_3;
                                                                                                                                                                                                                                                                                                                        var9_14 = var2_2;
                                                                                                                                                                                                                                                                                                                        v0 = var8_19 = this;
                                                                                                                                                                                                                                                                                                                        var11_5 = v0;
                                                                                                                                                                                                                                                                                                                        var11_5 = var8_19;
                                                                                                                                                                                                                                                                                                                        var14_24 = var8_19.c();
                                                                                                                                                                                                                                                                                                                        var13_25 = var8_19.b();
                                                                                                                                                                                                                                                                                                                        var12_26 = var11_5.g + var10_12 - var8_19.c() / 2;
                                                                                                                                                                                                                                                                                                                        var11_6 = v0.f + var9_14 - var8_19.b() / 2;
                                                                                                                                                                                                                                                                                                                        var10_12 = ab.E;
                                                                                                                                                                                                                                                                                                                        var9_14 = ab.D;
                                                                                                                                                                                                                                                                                                                        var8_20 = 0;
                                                                                                                                                                                                                                                                                                                        var8_20 = 0;
                                                                                                                                                                                                                                                                                                                        if (!(0 < var13_25 + var11_6 && var9_14 > var11_6 && var14_24 + var12_26 > 0 && var12_26 < var10_12)) {
                                                                                                                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        if (this.o == 54) {
                                                                                                                                                                                                                                                                                                                            if (this.p.G && this.p.yc >= 0) {
                                                                                                                                                                                                                                                                                                                                var8_21 = "";
                                                                                                                                                                                                                                                                                                                                if (this.u.indexOf("\n") + 1 >= 0 && this.u.lastIndexOf(10) >= 0 && this.u.indexOf("\n") != this.u.lastIndexOf(10)) {
                                                                                                                                                                                                                                                                                                                                    var8_21 = this.u.substring(this.u.indexOf("\n") + 1, this.u.lastIndexOf(10));
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                var1_1.setColor(255, 255, 255);
                                                                                                                                                                                                                                                                                                                                if (!var8_21.equals("") && var8_21.indexOf("ppy") >= 0) {
                                                                                                                                                                                                                                                                                                                                    var9_15 = this.u.substring(0, this.u.indexOf("\n"));
                                                                                                                                                                                                                                                                                                                                    var10_13 = this.u.substring(this.u.lastIndexOf(10) + 1, this.u.length());
                                                                                                                                                                                                                                                                                                                                    b.c(var1_1, var9_15, var4_8 + var2_2, var7_11, this.b(), 2);
                                                                                                                                                                                                                                                                                                                                    var11_6 = b.c(var9_15, this.b());
                                                                                                                                                                                                                                                                                                                                    var1_1.setColor(-8323328);
                                                                                                                                                                                                                                                                                                                                    b.c(var1_1, var8_21, var4_8 + var2_2, var7_11 + var11_6 - 1, this.b(), 2);
                                                                                                                                                                                                                                                                                                                                    var11_6 = var11_6 - 1 + b.c(var8_21, this.b());
                                                                                                                                                                                                                                                                                                                                    var1_1.setColor(255, 255, 255);
                                                                                                                                                                                                                                                                                                                                    b.c(var1_1, var10_13, var4_8 + var2_2, var7_11 + var11_6 - 1, this.b(), 2);
                                                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                                                    b.c(var1_1, this.u, var4_8 + var2_2, var7_11, this.b(), 2);
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                this.j = var4_8 + var2_2;
                                                                                                                                                                                                                                                                                                                                this.k = var7_11;
                                                                                                                                                                                                                                                                                                                                return;
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            ab.C.b(var1_1, this.u, var4_8 + var2_2 - 2, var7_11, this.b(), 2);
                                                                                                                                                                                                                                                                                                                            this.j = var4_8 + var2_2 - 2;
                                                                                                                                                                                                                                                                                                                            this.k = var7_11;
                                                                                                                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        if (!this.f()) break block76;
                                                                                                                                                                                                                                                                                                                        var8_22 = this.u;
                                                                                                                                                                                                                                                                                                                        if (var8_22.equals("")) break block77;
                                                                                                                                                                                                                                                                                                                        if (this.p.G && this.p.yc >= 0) {
                                                                                                                                                                                                                                                                                                                            if (this.n == this.p.Kb) {
                                                                                                                                                                                                                                                                                                                                this.b(var1_1, var8_22, var5_9 + var3_3, this.D);
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            var1_1.setColor(255, 255, 255);
                                                                                                                                                                                                                                                                                                                            b.c(var1_1, var8_22, (ab.D - ab.F.stringWidth(var8_22)) / 2, var5_9 + 3 + var3_3, -1, 0);
                                                                                                                                                                                                                                                                                                                            this.j = (ab.D - ab.F.stringWidth(var8_22)) / 2;
                                                                                                                                                                                                                                                                                                                            this.k = var5_9 + var3_3 + 3;
                                                                                                                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        var9_14 = ab.C.b(var8_22);
                                                                                                                                                                                                                                                                                                                        if (this.p.Kb == this.n && !this.v && this.h()) break block78;
                                                                                                                                                                                                                                                                                                                        var8_22 = ab.C.d + "~" + var8_22;
                                                                                                                                                                                                                                                                                                                        if (!var15_4) break block79;
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                    if (this.n == this.p.Kb) {
                                                                                                                                                                                                                                                                                                                        this.b(var1_1, var8_22, var5_9 + var3_3, this.D);
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                ab.C.b(var1_1, var8_22, (ab.D - var9_14) / 2, var5_9 + 3 + var3_3, -1, 0);
                                                                                                                                                                                                                                                                                                                this.j = (ab.D - var9_14) / 2;
                                                                                                                                                                                                                                                                                                                this.k = var5_9 + var3_3 + 3;
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        if (this.o == 21) {
                                                                                                                                                                                                                                                                                                            qb.R.b = this.p.Kb == this.n ? 0 : 2 + this.l;
                                                                                                                                                                                                                                                                                                            qb.R.b(var6_10, var7_11);
                                                                                                                                                                                                                                                                                                            qb.R.b(var1_1);
                                                                                                                                                                                                                                                                                                            this.j = var6_10;
                                                                                                                                                                                                                                                                                                            this.k = var7_11;
                                                                                                                                                                                                                                                                                                            var8_23 = this.q();
                                                                                                                                                                                                                                                                                                            if (!var8_23.equals("")) {
                                                                                                                                                                                                                                                                                                                if (this.p.Kb != this.n || this.v || !this.h()) {
                                                                                                                                                                                                                                                                                                                    var8_23 = ab.C.d + "~" + var8_23;
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                ab.C.b(var1_1, var8_23, var6_10 + this.b() + 4, var5_9 - ab.C.c() / 2 + var3_3, -1, 0);
                                                                                                                                                                                                                                                                                                                this.j = var6_10 + this.b() + 4;
                                                                                                                                                                                                                                                                                                                this.k = var5_9 - ab.C.c() / 2 + var3_3;
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        if (this.o != 34) break block80;
                                                                                                                                                                                                                                                                                                        var8_20 = this.g();
                                                                                                                                                                                                                                                                                                        qb.V.b(var4_8 + var2_2, var5_9 + var3_3);
                                                                                                                                                                                                                                                                                                        qb.V.b = var8_20 - 3;
                                                                                                                                                                                                                                                                                                        qb.V.b(var1_1);
                                                                                                                                                                                                                                                                                                        this.j = var4_8 + var2_2;
                                                                                                                                                                                                                                                                                                        this.k = var5_9 + var3_3;
                                                                                                                                                                                                                                                                                                        if (this.n > 14 || this.p.bc.bc != this.n - 1) break block81;
                                                                                                                                                                                                                                                                                                        qb.nb.b(var4_8 + var2_2, var5_9 + var3_3);
                                                                                                                                                                                                                                                                                                        qb.nb.b = 0;
                                                                                                                                                                                                                                                                                                        qb.nb.b(var1_1);
                                                                                                                                                                                                                                                                                                        if (!var15_4) break block82;
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                    if (this.p.bc.cc == this.n - 1) {
                                                                                                                                                                                                                                                                                                        qb.nb.b(var4_8 + var2_2, var5_9 + var3_3);
                                                                                                                                                                                                                                                                                                        qb.nb.b = 1;
                                                                                                                                                                                                                                                                                                        qb.nb.b(var1_1);
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                if (this.l != 0) {
                                                                                                                                                                                                                                                                                                    if (this.l == -1) {
                                                                                                                                                                                                                                                                                                        var1_1.drawImage(qb.ab, var4_8 + var2_2 + 39 - qb.ab.getWidth(), var5_9 + var3_3 + 30, 0);
                                                                                                                                                                                                                                                                                                        return;
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                    b.b(var1_1, "" + this.l, var4_8 + var2_2 + 39, var5_9 + var3_3 + 30, 1);
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                return;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            if (this.o == 51) {
                                                                                                                                                                                                                                                                                                qb.S.b = 22;
                                                                                                                                                                                                                                                                                                qb.S.c = 0;
                                                                                                                                                                                                                                                                                                qb.S.b(var6_10, var7_11);
                                                                                                                                                                                                                                                                                                qb.S.b(var1_1);
                                                                                                                                                                                                                                                                                                qb.S.c = 0;
                                                                                                                                                                                                                                                                                                this.j = var6_10;
                                                                                                                                                                                                                                                                                                this.k = var7_11;
                                                                                                                                                                                                                                                                                                return;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            var8_20 = 4;
                                                                                                                                                                                                                                                                                            if (this.r()) break block83;
                                                                                                                                                                                                                                                                                            if (!this.v) break block84;
                                                                                                                                                                                                                                                                                            var8_20 = 3 - this.w;
                                                                                                                                                                                                                                                                                            if (var8_20 >= 0) break block83;
                                                                                                                                                                                                                                                                                            var8_20 = 0;
                                                                                                                                                                                                                                                                                            if (!var15_4) break block83;
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        if (this.p.Kb != this.n) break block85;
                                                                                                                                                                                                                                                                                        if (!this.k()) break block86;
                                                                                                                                                                                                                                                                                        if (this.s % 2 != 1) break block87;
                                                                                                                                                                                                                                                                                        this.b(var1_1, 1, var4_8 + var2_2 - this.y - this.p.Pb, var5_9 + var3_3 - this.p.Qb / 2);
                                                                                                                                                                                                                                                                                        this.b(var1_1, 3, var4_8 + var2_2 + this.x, var5_9 + var3_3 - this.p.Qb / 2);
                                                                                                                                                                                                                                                                                        if (!var15_4) break block86;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    this.b(var1_1, 4, var4_8 + var2_2 - this.p.Pb / 2, var5_9 + var3_3 - this.x - this.p.Qb);
                                                                                                                                                                                                                                                                                    this.b(var1_1, 2, var4_8 + var2_2 - this.p.Pb / 2, var5_9 + var3_3 + this.y);
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                var8_20 = 5;
                                                                                                                                                                                                                                                                                if (!var15_4) break block83;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            if (this.B > 0) {
                                                                                                                                                                                                                                                                                var8_20 = this.B + 5;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        if (var8_20 != 5) break block88;
                                                                                                                                                                                                                                                                        var8_20 = 1;
                                                                                                                                                                                                                                                                        if (!var15_4) break block89;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    var8_20 = 0;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                var1_1.drawRegion(qb.db, var8_20 * this.b(), 0, this.b(), this.c(), 0, var6_10, var7_11, 0);
                                                                                                                                                                                                                                                                if (this.o != 42 && this.o != 36) break block90;
                                                                                                                                                                                                                                                                if (this.o != 42) break block91;
                                                                                                                                                                                                                                                                var9_14 = this.g();
                                                                                                                                                                                                                                                                if (!var15_4) break block92;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            var9_14 = mb.b[this.n - qb.lc];
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        if (var9_14 != -1) {
                                                                                                                                                                                                                                                            qb.V.b = var9_14 - 3;
                                                                                                                                                                                                                                                            qb.V.b(var6_10 + this.p.Ab, var7_11 + this.p.Bb);
                                                                                                                                                                                                                                                            qb.V.b(var1_1);
                                                                                                                                                                                                                                                            this.j = var6_10 + this.p.Ab;
                                                                                                                                                                                                                                                            this.k = var7_11 + this.p.Bb;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        if (this.o != 36) break block93;
                                                                                                                                                                                                                                                        if (this.p.Kb == this.n) break block94;
                                                                                                                                                                                                                                                        qb.fb.b = 1;
                                                                                                                                                                                                                                                        if (!var15_4) break block95;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    qb.fb.b = 0;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                qb.fb.b(var6_10 + 32, var7_11 + 36);
                                                                                                                                                                                                                                                qb.fb.b(var1_1);
                                                                                                                                                                                                                                                this.j = var6_10 + 32;
                                                                                                                                                                                                                                                this.k = var7_11 + 36;
                                                                                                                                                                                                                                                if (this.v) break block93;
                                                                                                                                                                                                                                                var10_12 = this.n - qb.lc;
                                                                                                                                                                                                                                                if (!this.k() || this.p.Kb != this.n) break block96;
                                                                                                                                                                                                                                                var8_20 = this.x - 5;
                                                                                                                                                                                                                                                if (var8_20 >= -10) break block97;
                                                                                                                                                                                                                                                var8_20 = -10;
                                                                                                                                                                                                                                                if (!var15_4) break block97;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            var8_20 = -5;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        var11_7 = this;
                                                                                                                                                                                                                                        ab.C.b(var1_1, "" + this.l + "/" + mb.c(var10_12), (var8_20 += this.b() + var6_10) + 3, var11_7.g + var3_3 - ab.C.c() / 2, -1, 0);
                                                                                                                                                                                                                                        this.j = var6_10 + 3;
                                                                                                                                                                                                                                        var11_7 = this;
                                                                                                                                                                                                                                        this.k = var11_7.g + var3_3 - this.D / 2;
                                                                                                                                                                                                                                        break block93;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    var9_14 = -1;
                                                                                                                                                                                                                                    if (this.o != 1) break block98;
                                                                                                                                                                                                                                    var9_14 = 0;
                                                                                                                                                                                                                                    if (!var15_4) break block99;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if (this.o != 31) break block100;
                                                                                                                                                                                                                                v1 = var9_14 = this.p.Rb == 42 && qb.m != false ? 11 : 0;
                                                                                                                                                                                                                                if (!var15_4) break block99;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            if (this.o != 3) break block101;
                                                                                                                                                                                                                            var9_14 = 1;
                                                                                                                                                                                                                            if (!var15_4) break block99;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        if (this.o != 26) break block102;
                                                                                                                                                                                                                        var9_14 = 2;
                                                                                                                                                                                                                        if (!var15_4) break block99;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (this.o != 29) break block103;
                                                                                                                                                                                                                    var9_14 = this.l + 3;
                                                                                                                                                                                                                    if (!var15_4) break block99;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (this.o != 28) break block104;
                                                                                                                                                                                                                var9_14 = 6;
                                                                                                                                                                                                                if (!var15_4) break block99;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (this.o != 27 && this.o != 57) break block105;
                                                                                                                                                                                                            var9_14 = 7;
                                                                                                                                                                                                            if (!var15_4) break block99;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        if (this.o != 58) break block106;
                                                                                                                                                                                                        v2 = var9_14 = this.l == 0 ? 9 : 8;
                                                                                                                                                                                                        if (!var15_4) break block99;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (this.o != 59 || this.l != 2) break block107;
                                                                                                                                                                                                    var9_14 = 29;
                                                                                                                                                                                                    if (!var15_4) break block99;
                                                                                                                                                                                                }
                                                                                                                                                                                                if (this.o != 59) break block108;
                                                                                                                                                                                                var9_14 = 10;
                                                                                                                                                                                                if (!var15_4) break block99;
                                                                                                                                                                                            }
                                                                                                                                                                                            if (this.o != 4) break block109;
                                                                                                                                                                                            var9_14 = 11;
                                                                                                                                                                                            if (!var15_4) break block99;
                                                                                                                                                                                        }
                                                                                                                                                                                        if (this.o != 23) break block110;
                                                                                                                                                                                        if (this.p.Yb.b != 1 || this.p.Yb.b() <= 0) break block111;
                                                                                                                                                                                        var9_14 = 11;
                                                                                                                                                                                        if (!var15_4) break block99;
                                                                                                                                                                                    }
                                                                                                                                                                                    var9_14 = 36;
                                                                                                                                                                                    if (!var15_4) break block99;
                                                                                                                                                                                }
                                                                                                                                                                                if (this.o != 5) break block112;
                                                                                                                                                                                var9_14 = 12;
                                                                                                                                                                                if (!var15_4) break block99;
                                                                                                                                                                            }
                                                                                                                                                                            if (this.o != 33) break block113;
                                                                                                                                                                            var9_14 = 13;
                                                                                                                                                                            if (!var15_4) break block99;
                                                                                                                                                                        }
                                                                                                                                                                        if (this.o != 56) break block114;
                                                                                                                                                                        var9_14 = 14;
                                                                                                                                                                        if (!var15_4) break block99;
                                                                                                                                                                    }
                                                                                                                                                                    if (this.o != 30) break block115;
                                                                                                                                                                    var9_14 = 15;
                                                                                                                                                                    if (!var15_4) break block99;
                                                                                                                                                                }
                                                                                                                                                                if (this.o != 9) break block116;
                                                                                                                                                                var9_14 = 16;
                                                                                                                                                                if (!var15_4) break block99;
                                                                                                                                                            }
                                                                                                                                                            if (this.o != 10) break block117;
                                                                                                                                                            var9_14 = 17;
                                                                                                                                                            if (!var15_4) break block99;
                                                                                                                                                        }
                                                                                                                                                        if (this.o != 11) break block118;
                                                                                                                                                        var9_14 = 18;
                                                                                                                                                        if (!var15_4) break block99;
                                                                                                                                                    }
                                                                                                                                                    if (this.o != 25 && (this.o != 0 || this.p.Rb != 25)) break block119;
                                                                                                                                                    var9_14 = 19;
                                                                                                                                                    if (!var15_4) break block99;
                                                                                                                                                }
                                                                                                                                                if (this.o != 37) break block120;
                                                                                                                                                var9_14 = 37;
                                                                                                                                                if (!var15_4) break block99;
                                                                                                                                            }
                                                                                                                                            if (this.o != 38) break block121;
                                                                                                                                            var9_14 = 20;
                                                                                                                                            if (!var15_4) break block99;
                                                                                                                                        }
                                                                                                                                        if (this.o != 35) break block122;
                                                                                                                                        var9_14 = 21;
                                                                                                                                        if (!var15_4) break block99;
                                                                                                                                    }
                                                                                                                                    if (this.o != 13 && this.o != 20) break block123;
                                                                                                                                    var9_14 = 22;
                                                                                                                                    if (!var15_4) break block99;
                                                                                                                                }
                                                                                                                                if (this.o != 15) break block124;
                                                                                                                                var9_14 = 23;
                                                                                                                                if (!var15_4) break block99;
                                                                                                                            }
                                                                                                                            if (this.o != 16) break block125;
                                                                                                                            var9_14 = 24;
                                                                                                                            if (!var15_4) break block99;
                                                                                                                        }
                                                                                                                        if (this.o != 0 || this.p.Rb != 45 && this.p.Rb != 46) break block126;
                                                                                                                        var9_14 = 0;
                                                                                                                        if (!var15_4) break block99;
                                                                                                                    }
                                                                                                                    if (this.o != 19 && this.o != 22) break block127;
                                                                                                                    var9_14 = 26;
                                                                                                                    if (!var15_4) break block99;
                                                                                                                }
                                                                                                                if (this.o != 2) break block128;
                                                                                                                var9_14 = 25;
                                                                                                                if (!var15_4) break block99;
                                                                                                            }
                                                                                                            if (this.o != 32) break block129;
                                                                                                            v3 = var9_14 = this.p.Rb == 63 ? 25 : 27;
                                                                                                            if (!var15_4) break block99;
                                                                                                        }
                                                                                                        if (this.o != 0) break block130;
                                                                                                        var9_14 = 27;
                                                                                                        if (!var15_4) break block99;
                                                                                                    }
                                                                                                    if (this.o != 14) break block131;
                                                                                                    var9_14 = 30;
                                                                                                    if (!var15_4) break block99;
                                                                                                }
                                                                                                if (this.o != 61) break block132;
                                                                                                var9_14 = 31;
                                                                                                if (!var15_4) break block99;
                                                                                            }
                                                                                            if (this.o != 62) break block133;
                                                                                            var9_14 = 32;
                                                                                            if (!var15_4) break block99;
                                                                                        }
                                                                                        if (this.o != 53) break block134;
                                                                                        var9_14 = 33;
                                                                                        if (!var15_4) break block99;
                                                                                    }
                                                                                    if (this.o != 55) break block135;
                                                                                    var9_14 = 34;
                                                                                    if (!var15_4) break block99;
                                                                                }
                                                                                if (this.o != 39) break block136;
                                                                                var9_14 = 38;
                                                                                if (!var15_4) break block99;
                                                                            }
                                                                            if (this.o != 40) break block137;
                                                                            var9_14 = 40;
                                                                            if (!var15_4) break block99;
                                                                        }
                                                                        if (this.o != 41) break block138;
                                                                        var9_14 = 39;
                                                                        if (!var15_4) break block99;
                                                                    }
                                                                    if (this.o != 17) break block139;
                                                                    var9_14 = 35;
                                                                    if (!var15_4) break block99;
                                                                }
                                                                if (this.o != 44) break block140;
                                                                var9_14 = 41;
                                                                if (!var15_4) break block99;
                                                            }
                                                            if (this.o == 64) {
                                                                var9_14 = 47;
                                                            }
                                                        }
                                                        var10_12 = var6_10 + this.p.yb;
                                                        var11_6 = var7_11 + this.p.zb;
                                                        this.j = var6_10;
                                                        this.k = var7_11;
                                                        if (var9_14 != -1) {
                                                            qb.K.b = var9_14;
                                                            qb.K.b(var10_12, var11_6);
                                                            qb.K.b(var1_1);
                                                        }
                                                        if (this.o != 57) break block141;
                                                        qb.gb.b = this.l;
                                                        qb.gb.b(var10_12 + 14, var11_6 + 14);
                                                        qb.gb.b(var1_1);
                                                        if (!var15_4) break block93;
                                                    }
                                                    if (this.o != 30 || this.l != 1) break block142;
                                                    var1_1.drawImage(qb.hb, var10_12 + 18, var11_6 + 8, 0);
                                                    if (!var15_4) break block93;
                                                }
                                                if (this.o == 31) break block93;
                                                if (this.o != 59 || this.l != 1) break block143;
                                                var1_1.drawImage(qb.ib, var10_12, var11_6 + 15, 0);
                                                if (!var15_4) break block93;
                                            }
                                            if (this.o != 37 || this.l != 0) break block144;
                                            var1_1.drawImage(qb.jb, var10_12 + 10, var11_6 + 7, 0);
                                            if (!var15_4) break block93;
                                        }
                                        if (this.o != 11 || this.l != 0) break block145;
                                        var1_1.drawImage(qb.kb, var10_12 + 18, var11_6 + 23, 0);
                                        if (!var15_4) break block93;
                                    }
                                    if (this.o != 10) break block93;
                                    if (this.l != 0) break block146;
                                    var1_1.drawImage(qb.mb, var10_12 + 21, var11_6 + 17, 0);
                                    if (!var15_4) break block93;
                                }
                                for (var8_20 = 0; var8_20 < this.l; ++var8_20) {
                                    var1_1.drawImage(qb.lb, var10_12 + gb.b[var8_20], var11_6 + gb.c[var8_20], 0);
                                    if (!var15_4) {
                                        if (!var15_4) continue;
                                    }
                                    ** GOTO lbl-1000
                                }
                            }
                            if (this.o == 27) {
                                var9_16 = "" + this.l;
                                if (this.p.Kb != this.n || this.v || !this.h()) {
                                    var9_16 = ab.C.d + "~" + var9_16;
                                }
                                ab.C.b(var1_1, var9_16, var4_8 + var2_2 + 6, var5_9 + var3_3, -1, 2);
                            } else if (this.o == 17) {
                                var9_17 = "" + this.l;
                                if (this.p.Kb != this.n || this.v || !this.h()) {
                                    var9_17 = ab.C.d + "~" + var9_17;
                                }
                                ab.C.b(var1_1, var9_17, var4_8 + var2_2 - 1, var5_9 + var3_3 - 5, -1, 2);
                            }
                            if (this.h() || this.v || this.o == 42 || this.o == 36) break block147;
                            qb.L.b = 1;
                            qb.L.b(var6_10, var7_11);
                            qb.L.b(var1_1);
                            if (!var15_4) break block148;
                        }
                        if ((this.o == 38 || this.o == 13) && ab.yb && !this.v) {
                            qb.L.b = 0;
                            qb.L.b(var6_10, var7_11);
                            qb.L.b(var1_1);
                        }
                    }
                    if (this.v) break block149;
                    var9_18 = this.q();
                    if (this.o == 53) {
                        var9_18 = this.u;
                    }
                    if (var9_18.equals("")) break block149;
                    if (this.p.Kb != this.n || this.v || !this.h()) {
                        var9_18 = ab.C.d + "~" + var9_18;
                    }
                    if (!this.k() || this.p.Kb != this.n) break block150;
                    var10_12 = this.x - 5;
                    if (var10_12 >= -10) break block151;
                    var10_12 = -10;
                    if (!var15_4) break block151;
                }
                var10_12 = -5;
            }
            if (this.s % 2 == 0 || this.o == 53) {
                ab.C.b(var1_1, var9_18, var4_8 + var2_2 + 2, var7_11 + this.c() + var10_12 + 5, -1, 2);
                return;
            }
            ab.C.b(var1_1, var9_18, var6_10 + this.b() + var10_12, var5_9 - ab.C.c() / 2 + var3_3, -1, 0);
        }
    }

    public final int g() {
        int n2;
        boolean bl;
        block9: {
            block7: {
                boolean bl2;
                block8: {
                    bl2 = ab.xc;
                    bl = true;
                    n2 = 4;
                    if (this.o != 34) break block7;
                    if (this.n > 14) break block8;
                    if (this.p.bc.Yb[this.n - 1] == 0 && !ab.Yb[n2 = this.n - 1]) {
                        bl = false;
                    }
                    n2 = this.n + 4;
                    if (!bl2) break block9;
                }
                if (this.p.bc.dc[this.n - 1 - 14] == 0 && !ab.Zb[n2 = this.n - 1 - 14]) {
                    bl = false;
                }
                n2 = this.n + 4;
                if (!bl2) break block9;
            }
            if (this.o == 42) {
                n2 = this.n - qb.kc + 5;
            }
        }
        if (!(ab.d && this.o == 42 || bl)) {
            n2 = 4;
        }
        return n2;
    }

    public final boolean h() {
        if (this.d) {
            return false;
        }
        if ((this.o == 4 || this.o == 5 || this.o == 26) && qb.tb) {
            return false;
        }
        if (this.o == 10 && !ub.b) {
            return false;
        }
        if (this.o == 24 && !ub.c) {
            return false;
        }
        if (this.o == 34 && this.p.bc != null) {
            if (this.n <= 14) {
                if (this.p.bc.Yb[this.n - 1] == 0) {
                    return false;
                }
            } else {
                if (this.p.bc.dc[this.n - 1 - 14] == 0) {
                    return false;
                }
                if (this.n - 1 - 14 == 0 && this.p.bc.nc >= this.p.bc.mc) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void i() {
        int n2;
        int n3;
        block34: {
            int n4;
            block33: {
                boolean bl;
                block32: {
                    block31: {
                        block30: {
                            block29: {
                                block26: {
                                    block27: {
                                        block28: {
                                            int n5;
                                            block23: {
                                                block24: {
                                                    block25: {
                                                        bl = ab.xc;
                                                        n5 = 4;
                                                        if (this.v) {
                                                            n5 = 2;
                                                        }
                                                        if (this.w > 0) {
                                                            ++this.w;
                                                            if (this.w > 3) {
                                                                this.v = false;
                                                            }
                                                        }
                                                        n3 = this.h;
                                                        n2 = this.i;
                                                        if (this.f == n3) break block23;
                                                        n4 = (n3 - this.f) / n5;
                                                        if (n4 != 0) break block24;
                                                        if (this.f <= n3) break block25;
                                                        n4 = -1;
                                                        if (!bl) break block24;
                                                    }
                                                    n4 = 1;
                                                }
                                                this.f += n4;
                                            }
                                            if (this.g == n2) break block26;
                                            n4 = (n2 - this.g) / n5;
                                            if (n4 != 0) break block27;
                                            if (this.g <= n2) break block28;
                                            n4 = -1;
                                            if (!bl) break block27;
                                        }
                                        n4 = 1;
                                    }
                                    this.g += n4;
                                }
                                if (this.s % 2 != 1) break block29;
                                n4 = this.b() / 2 - 14;
                                if (!bl) break block30;
                            }
                            n4 = this.c() / 2 - 14;
                        }
                        if (!this.z) break block31;
                        if (this.x <= 0) break block32;
                        this.x -= 4;
                        if (!bl) break block32;
                    }
                    if (this.x < n4) {
                        this.x += 4;
                    }
                }
                if (!this.A) break block33;
                if (this.y <= 0) break block34;
                this.y -= 4;
                if (!bl) break block34;
            }
            if (this.y < n4) {
                this.y += 4;
            }
        }
        if (this.w == 0 && this.f == n3 && this.g == n2) {
            this.w = 1;
        }
        if (this.p.Kb == this.n) {
            this.e = 0;
            return;
        }
        ++this.e;
        if (this.e > 9) {
            this.e = 9;
        }
    }

    public final boolean j() {
        if (this.o == 21 && this.p.x != -1 && this.p.x != this.n) {
            return false;
        }
        if (this.p.Kb == -1 || this.p.Db[this.p.Kb] == null || this.p.Db[this.p.Kb].q == -1) {
            return false;
        }
        boolean bl = this.v || this.q == this.p.Db[this.p.Kb].q || this.q == this.p.Db[this.p.Db[this.p.Kb].q].q || this.q == this.p.Kb;
        if (!bl && this.p.Db[this.p.Db[this.p.Kb].q].q != -1) {
            return this.q == this.p.Db[this.p.Db[this.p.Db[this.p.Kb].q].q].q;
        }
        return bl;
    }

    public final boolean k() {
        if (!this.h()) {
            return false;
        }
        return this.o == 10 || this.o == 24 || this.o == 47 || this.o == 43 || this.o == 11 || this.o == 18 || this.o == 37 || this.o == 27 || this.o == 29 || this.o == 28 || this.o == 42 || this.o == 36 || this.o == 58 || this.o == 59 || this.o == 57 || this.o == 30 || this.o == 60 || this.o == 17;
    }

    private int l() {
        if (this.o == 10 || this.o == 24) {
            return 10;
        }
        if (this.o == 11 || this.o == 47 || this.o == 58 || this.o == 30 || this.o == 60 || this.o == 37 || this.o == 43) {
            return 1;
        }
        if (this.o == 18) {
            return 1;
        }
        if (this.o == 27) {
            return 10;
        }
        if (this.o == 28) {
            return this.p.ac.length - 1;
        }
        if (this.o == 29 || this.o == 59) {
            return 2;
        }
        if (this.o == 42) {
            if (this.l != -1 && (this.n < 14 + qb.kc ? this.p.H() / hb.d[this.n - qb.kc] > 0 : this.p.H() / hb.e[this.n - qb.kc - 14] > 0)) {
                return this.l + 1;
            }
            return this.l;
        }
        if (this.o == 36) {
            int n2 = this.n - qb.lc;
            if (mb.c(n2) <= this.l) {
                return this.l;
            }
            if (this.p.H() / mb.b(n2) > 0) {
                return mb.c(n2);
            }
            return this.l;
        }
        if (this.o == 17) {
            return qb.o;
        }
        if (this.o == 57) {
            return 3;
        }
        return 0;
    }

    private int m() {
        if (this.o == 42) {
            if (this.l == -1) {
                return this.l;
            }
            return this.m;
        }
        if (this.o == 36) {
            return this.m;
        }
        return 0;
    }

    public final void b(int n2, boolean n3) {
        block73: {
            block71: {
                block74: {
                    boolean bl;
                    block72: {
                        block61: {
                            block69: {
                                block70: {
                                    block65: {
                                        block66: {
                                            block68: {
                                                block67: {
                                                    block56: {
                                                        block62: {
                                                            block64: {
                                                                block63: {
                                                                    block57: {
                                                                        block58: {
                                                                            block60: {
                                                                                block59: {
                                                                                    bl = ab.xc;
                                                                                    if (this.o != 42) break block56;
                                                                                    if (this.n >= 14 + qb.kc) break block57;
                                                                                    n3 = this.n - qb.kc;
                                                                                    if ((n2 <= 0 || this.p.H() < hb.d[n3] * n2) && (n2 >= 0 || this.l <= this.m())) break block58;
                                                                                    this.p.o(-hb.d[n3] * n2);
                                                                                    if (!qb.m || this.p.qb) break block59;
                                                                                    int n4 = n3;
                                                                                    qb.h[n4] = qb.h[n4] + hb.b[n3] * n2;
                                                                                    if (!bl) break block60;
                                                                                }
                                                                                int n5 = n3;
                                                                                this.p.bc.Yb[n5] = this.p.bc.Yb[n5] + hb.b[n3] * n2;
                                                                                if (n3 == this.p.bc.bc) {
                                                                                    fb.I.c(hb.b(this.p.bc.bc) + this.p.bc.Yb[this.p.bc.bc]);
                                                                                }
                                                                            }
                                                                            this.l += hb.b[n3] * n2;
                                                                            ab.G.b(ab.O, 1);
                                                                            if (!bl) break block61;
                                                                        }
                                                                        return;
                                                                    }
                                                                    n3 = this.n - qb.kc - 14;
                                                                    if ((n2 <= 0 || this.p.H() < hb.e[n3] * n2) && (n2 >= 0 || this.l <= this.m())) break block62;
                                                                    this.p.o(-hb.e[n3] * n2);
                                                                    if (!qb.m || this.p.qb) break block63;
                                                                    int n6 = n3;
                                                                    qb.i[n6] = qb.i[n6] + hb.c[n3] * n2;
                                                                    if (!bl) break block64;
                                                                }
                                                                int n7 = n3;
                                                                this.p.bc.dc[n7] = this.p.bc.dc[n7] + hb.c[n3] * n2;
                                                            }
                                                            this.l += hb.c[n3] * n2;
                                                            ab.G.b(ab.O, 1);
                                                            if (!bl) break block61;
                                                        }
                                                        return;
                                                    }
                                                    if (this.o != 36) break block65;
                                                    n3 = this.n - qb.lc;
                                                    int n8 = mb.b(n3) * n2;
                                                    if ((n2 <= 0 || this.p.H() < n8 || this.l + n2 > this.l()) && (n2 >= 0 || this.l <= this.m())) break block66;
                                                    this.p.o(-n8);
                                                    if (!qb.m || this.p.qb) break block67;
                                                    int n9 = n3;
                                                    qb.j[n9] = qb.j[n9] + n2;
                                                    if (!bl) break block68;
                                                }
                                                int n10 = n3;
                                                this.p.bc.ac[n10] = this.p.bc.ac[n10] + n2;
                                            }
                                            ab.f(n2);
                                            this.l += n2;
                                            ab.G.b(ab.O, 1);
                                            if (!bl) break block61;
                                        }
                                        return;
                                    }
                                    if (n3 == 0) break block69;
                                    this.l += n2;
                                    if (this.l >= this.m()) break block70;
                                    this.l = this.l();
                                    if (!bl) break block61;
                                }
                                if (this.l <= this.l()) break block61;
                                this.l = this.m();
                                if (!bl) break block61;
                            }
                            if (this.l == this.m() && n2 < 0) {
                                return;
                            }
                            if (this.l == this.l() && n2 > 0) {
                                return;
                            }
                            this.l += n2;
                        }
                        this.z = this.l == this.l();
                        boolean bl2 = this.A = this.l == this.m();
                        if (this.o != 10) break block71;
                        n3 = ab.j();
                        ab.Eb = this.l * 10;
                        if (n3 != 0 || ab.Eb == 0) break block72;
                        ab.Gb = true;
                        this.p.B();
                        if (!bl) break block73;
                    }
                    if (ab.j() != 0) break block74;
                    ab.G.f();
                    if (!bl) break block73;
                }
                ab.G.b();
                return;
            }
            if (this.o == 24) {
                ab.Fb = this.l * 10;
                if (this.l > 0) {
                    ab.Hb = true;
                }
                if (ab.G != null) {
                    ab.G.c();
                    if (ab.i() > 0) {
                        ab.G.b(ab.I, 1);
                        return;
                    }
                }
            } else if (this.o == 11) {
                ab.Ib = this.l == 1;
                if (ab.Ib) {
                    rc.b(200, 1);
                    return;
                }
            } else {
                if (this.o == 37) {
                    ab.Db = this.l == 1;
                    return;
                }
                if (this.o == 18) {
                    ab.Jb = this.l == 0;
                    ab.Jb = true;
                    return;
                }
                if (this.o == 60) {
                    ab.hc = this.l == 1;
                    return;
                }
                if (this.o == 27) {
                    ab.Lb = this.l;
                    return;
                }
                if (this.o == 29) {
                    ab.Nb = this.l;
                    ab.m = (byte)this.l;
                    ab.Mb = 0;
                    this.p.l();
                    return;
                }
                if (this.o == 28) {
                    ab.Mb = this.l;
                    return;
                }
                if (this.o == 47) {
                    ab.cc = this.l == 1;
                    return;
                }
                if (this.o == 43) {
                    ab.Cb = this.l == 1;
                    return;
                }
                if (this.o == 58) {
                    ab.ec = (byte)this.l;
                    return;
                }
                if (this.o == 57) {
                    ab.dc = (byte)this.l;
                    return;
                }
                if (this.o == 30) {
                    ab.gc = this.l == 1;
                    ab.n = this.l == 1;
                    return;
                }
                if (this.o == 59) {
                    ab.fc = (byte)this.l;
                    return;
                }
                if (this.o == 17) {
                    ab.Ub = (byte)this.l;
                }
            }
        }
    }

    public final void n() {
        this.x = 0;
        this.y = 0;
        this.z = this.l == this.l();
        this.A = this.l == this.m();
    }

    private void b(Graphics graphics, int n2, int n3, int n4) {
        graphics.drawRegion(qb.eb, (n2 - 1) * this.p.Pb, 0, this.p.Pb, this.p.Qb, 0, n3, n4, 0);
    }

    private void b(Graphics graphics, String string, int n2, int n3) {
        block8: {
            int n4;
            boolean bl;
            block7: {
                bl = ab.xc;
                n2 -= qb.W.e - n3 >> 1;
                if (this.p.G && this.p.yc >= 2) {
                    n4 = b.c(string);
                    ++n2;
                } else {
                    n4 = ab.C.b(string);
                    if (!this.p.G) {
                        --n2;
                    }
                }
                for (n3 = 0; n3 <= n4; n3 += qb.W.d) {
                    if (!bl) {
                        if (!bl) continue;
                    }
                    break block7;
                }
                n4 = (ab.D - n3) / 2 - qb.W.d;
                qb.W.b = 0;
                qb.W.b(n4, n2);
                qb.W.b(graphics);
            }
            n4 += qb.W.d;
            while (n4 < (ab.D + n3) / 2) {
                qb.W.b = 1;
                qb.W.b(n4, n2);
                qb.W.b(graphics);
                n4 += qb.W.d;
                if (!bl) {
                    if (!bl) continue;
                }
                break block8;
            }
            qb.W.b = 2;
            qb.W.b(n4, n2);
            qb.W.b(graphics);
        }
    }

    public final void b(int n2) {
        this.f = n2;
    }

    public final void c(int n2) {
        this.g = n2;
    }

    public final int o() {
        return this.f;
    }

    public final int p() {
        return this.g;
    }

    public final String q() {
        if (this.o == 33 || this.o == 39) {
            return this.u;
        }
        if (this.o == 28) {
            return this.p.ac[this.l];
        }
        if (this.o == 21) {
            return this.u;
        }
        if (this.o == 55 && this.p.Rb == this.o && this.p.H == null) {
            return "+" + this.u;
        }
        if (this.o == 42) {
            return "" + this.l;
        }
        return "";
    }

    public final boolean r() {
        return this.o == 61 || this.o == 62;
    }

    public final String s() {
        String string;
        block9: {
            block19: {
                boolean bl;
                block17: {
                    block18: {
                        block15: {
                            block16: {
                                block14: {
                                    block12: {
                                        block13: {
                                            block10: {
                                                block11: {
                                                    block7: {
                                                        block8: {
                                                            bl = ab.xc;
                                                            if (this.p.Rb == 49) {
                                                                return "";
                                                            }
                                                            if (this.o == 29) {
                                                                return ib.c(this.l);
                                                            }
                                                            if (this.o == 64) {
                                                                return ib.c(39);
                                                            }
                                                            if (this.o == 59) {
                                                                return ib.c(this.l + 3);
                                                            }
                                                            string = ib.b(this.o);
                                                            if (this.o != 10 && this.o != 24) break block7;
                                                            if (this.l != 0) break block8;
                                                            string = string + ": " + ib.c(7);
                                                            if (!bl) break block9;
                                                        }
                                                        string = string + ": " + this.l;
                                                        if (!bl) break block9;
                                                    }
                                                    if (this.o != 47 && this.o != 11 && this.o != 37 && this.o != 43) break block10;
                                                    if (this.l != 0) break block11;
                                                    string = string + ": " + ib.c(7);
                                                    if (!bl) break block9;
                                                }
                                                string = string + ": " + ib.c(6);
                                                if (!bl) break block9;
                                            }
                                            if (this.o != 18) break block12;
                                            if (this.l != 0) break block13;
                                            string = string + ": " + ib.c(8);
                                            if (!bl) break block9;
                                        }
                                        string = string + ": " + ib.c(10);
                                        if (!bl) break block9;
                                    }
                                    if (this.o != 58) break block14;
                                    string = string + ": " + ib.c(12 + this.l);
                                    if (!bl) break block9;
                                }
                                if (this.o != 57) break block15;
                                if (this.l != 0) break block16;
                                string = string + ": " + ib.c(14);
                                if (!bl) break block9;
                            }
                            string = string + ": " + ib.c(7 + this.l);
                            if (!bl) break block9;
                        }
                        if (this.o != 60) break block17;
                        if (this.l != 0) break block18;
                        string = string + ": " + ib.c(8);
                        if (!bl) break block9;
                    }
                    string = string + ": " + ib.c(10);
                    if (!bl) break block9;
                }
                if (this.o != 30) break block9;
                if (this.l != 1) break block19;
                string = string + ": " + ib.c(6);
                if (!bl) break block9;
            }
            string = string + ": " + ib.c(7);
        }
        return string;
    }
}

