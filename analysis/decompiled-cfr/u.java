/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class u
extends o {
    public boolean r = false;
    public static byte s = (byte)3;
    public static byte t = 1;
    public static byte u = (byte)2;
    private static byte v = (byte)3;
    public boolean w;
    public nb x;
    private int y;
    private int z;
    private int A;
    private int B;
    private int C;
    public boolean D;
    public byte E;
    private boolean F;
    public boolean G;
    public byte H;
    public byte I;
    private int J;
    public byte K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public byte R;
    private boolean S;
    private boolean T;

    public u(pb pb2, byte by, byte by2, byte by3, int n2, int n3, int n4, int n5, int n6, boolean bl, boolean bl2, boolean bl3) {
        super((byte)-1, (byte)-1, n2, n3);
        this.e = (byte)-1;
        this.f = (byte)-1;
        this.A = n4;
        if (this.A <= 0) {
            this.A = 1;
        }
        this.C = n5;
        if (this.C <= 0) {
            this.C = 1;
        }
        if (this.C > 100) {
            this.C = 100;
        }
        this.B = n6;
        if (this.B < 0) {
            this.B = 0;
        }
        if (this.B > 100) {
            this.B = 100;
        }
        this.D = bl2;
        this.F = bl3;
        if (pb2 != null) {
            this.e = (byte)-1;
            this.f = (byte)-1;
            this.x = new nb(pb2);
            this.x.j = by;
            this.y = this.x.c;
            this.z = this.x.d;
        }
        this.J = -1;
    }

    public final void b(int n2, int n3, int n4) {
        this.l = n2;
        this.m = n3;
        if (n4 != 0) {
            this.N = true;
            this.Q = n4;
        }
        if (this.K > 0) {
            this.l /= 10;
            this.m /= 10;
            this.Q /= 10;
        }
        this.S = true;
    }

    public final void b(int n2) {
        this.N = true;
        this.P = n2 * 10;
        this.S = true;
    }

    public final boolean e() {
        return super.e() | this.N;
    }

    public final boolean d() {
        u u2 = this;
        u u3 = u2;
        u3 = this;
        return o.c(u2.c / 10, u3.d / 10 - this.O, this.y, this.z);
    }

    /*
     * Unable to fully structure code
     */
    public final void h() {
        block35: {
            block38: {
                block36: {
                    block37: {
                        block34: {
                            block33: {
                                block32: {
                                    block31: {
                                        var4_1 = ab.xc;
                                        if (this.J != -1) {
                                            --this.J;
                                            if (this.J < 0) {
                                                this.J = 0;
                                            }
                                        }
                                        if (!this.S) {
                                            return;
                                        }
                                        if (!this.T && this.g()) {
                                            this.T = true;
                                        }
                                        if (this.D) {
                                            this.H = this.g;
                                            this.I = this.h;
                                        }
                                        if (this.N) {
                                            this.Q -= u.s;
                                            this.P += this.Q;
                                            if (this.P <= 0) {
                                                this.Q = (-this.Q - u.s) * this.C / 100;
                                                this.P = 0;
                                                this.G = true;
                                                if (this.Q == 0) {
                                                    this.N = false;
                                                }
                                            }
                                            this.O = this.P / 10;
                                        }
                                        if (this.O < 5) break block31;
                                        this.w = true;
                                        if (!var4_1) break block32;
                                    }
                                    this.w = false;
                                }
                                if (this.K <= 0) break block33;
                                if (fb.kb % (long)this.K != 0L) break block34;
                                if (this.l != 0) {
                                    this.l -= this.l / Math.abs(this.l);
                                    if (Math.abs(this.l) <= 1) {
                                        this.l = 0;
                                    }
                                }
                                if (this.m == 0) break block34;
                                this.m -= this.m / Math.abs(this.m);
                                if (Math.abs(this.m) > 1) break block34;
                                this.m = 0;
                                if (!var4_1) break block34;
                            }
                            if (!this.M || this.M && this.P < 15) {
                                if (this.l != 0) {
                                    this.l -= this.l * this.B / 100;
                                    if (Math.abs(this.l) <= 10) {
                                        this.l = 0;
                                    }
                                }
                                if (this.m != 0) {
                                    this.m -= this.m * this.B / 100;
                                    if (Math.abs(this.m) <= 10) {
                                        this.m = 0;
                                    }
                                }
                            }
                        }
                        if (this.x != null) {
                            this.x.c();
                        }
                        super.h();
                        if (!this.D) break block35;
                        var1_2 = this;
                        var2_4 = var1_2.g;
                        var3_5 = var1_2.h;
                        if (!u.b(var2_4, var3_5)) ** GOTO lbl-1000
                        if (var1_2.H == var2_4) break block36;
                        if (fb.Re[var2_4][var3_5].d == null) break block37;
                        v0 = 1;
                        break block38;
                    }
                    if (!var1_2.L || fb.bf == null || fb.bf[var2_4][var3_5] != 0) break block36;
                    v0 = 1;
                    break block38;
                }
                if (var1_2.I == var3_5) ** GOTO lbl-1000
                if (fb.Re[var2_4][var3_5].d != null) {
                    v0 = 2;
                } else if (var1_2.L && fb.bf != null && fb.bf[var2_4][var3_5] == 0) {
                    v0 = 2;
                } else if (fb.Re[var2_4][var3_5].d != null) {
                    v0 = 3;
                } else lbl-1000:
                // 2 sources

                {
                    v0 = var1_3 = 0;
                }
            }
            if (v0 != 0) {
                this.c -= this.l;
                this.d -= this.m;
                if (var1_3 == 1) {
                    this.l = -this.l * this.C / 100;
                }
                if (var1_3 == 2) {
                    this.m = -this.m * this.C / 100;
                }
                this.E = (byte)var1_3;
            }
        }
    }

    public final void b(Graphics graphics) {
        u u2;
        block6: {
            block8: {
                boolean bl;
                block7: {
                    bl = ab.xc;
                    if (this.R == 0) break block6;
                    if (this.R != t) break block7;
                    if (fb.Nb == null) break block6;
                    u u3 = this;
                    u2 = u3;
                    u2 = this;
                    fb.Nb.b(u3.c / 10 - fb.Nb.d / 2 - fb.Ge, u2.d / 10 - fb.Nb.e / 2 + 5 - fb.He);
                    fb.Nb.b(graphics);
                    if (!bl) break block6;
                }
                if (this.R != u) break block8;
                if (fb.Ob == null) break block6;
                fb.Ob.b = 2;
                u u4 = this;
                u2 = u4;
                u2 = this;
                fb.Ob.b(u4.c / 10 - fb.Ob.d / 2 - fb.Ge, u2.d / 10 - fb.Ob.e / 2 + 8 - fb.He);
                fb.Ob.b(graphics);
                if (!bl) break block6;
            }
            if (this.R == v && fb.Pb != null) {
                fb.Pb.b = 2;
                u u5 = this;
                u2 = u5;
                u2 = this;
                fb.Pb.b(u5.c / 10 - fb.Pb.d / 2 - fb.Ge, u2.d / 10 - fb.Pb.e / 2 + 8 - fb.He);
                fb.Pb.b(graphics);
            }
        }
        if (this.x == null) {
            super.b(graphics);
            return;
        }
        int n2 = -fb.Ge;
        int n3 = -fb.He;
        u u6 = this;
        u2 = u6;
        u2 = this;
        this.x.b(graphics, u6.c / 10 + n2, u2.d / 10 + n3 - this.O);
        if (this.r && fb.rd != null) {
            fb.rd.b = (int)(fb.kb % 5L);
            u u7 = this;
            u2 = u7;
            u2 = this;
            fb.rd.b(u7.c / 10 + n2 - 15, u2.d / 10 + n3 - this.O - 3 + this.x.d / 2);
            fb.rd.b(graphics);
        }
    }
}

