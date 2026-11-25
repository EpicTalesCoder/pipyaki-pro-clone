/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class w {
    private static byte[] b = new byte[]{17, 18, 19, 20};
    private o c;
    private int d;
    private int e;
    public boolean f;
    public boolean g;
    public nb h;
    public String i;
    public int j;
    public int k;
    public int l;
    private nb[] m;
    private int[] n;
    private int[] o;
    private int[] p;
    private byte[] q;
    private byte r;
    public int s;
    public boolean t;

    /*
     * Unable to fully structure code
     */
    public w(pb var1_1, int var2_2, int var3_3, byte var4_4, boolean var5_5, int var6_6) {
        var13_7 = ab.xc;
        super();
        this.j = var2_2 * 10;
        this.k = var3_3 * 10;
        this.r = var4_4;
        block0 : switch (this.r) {
            case 0: {
                this.h = new nb(var1_1);
                if (!var13_7) ** GOTO lbl89
            }
            case 1: {
                this.h = new nb(var1_1);
                this.h.j = (byte)var6_6;
                if (!var13_7) ** GOTO lbl89
            }
            case 2: {
                this.h = new nb(var1_1);
                this.h.b(false, false, (byte)var6_6);
                if (!var13_7) ** GOTO lbl89
            }
            case 3: {
                this.h = new nb(var1_1);
                this.h.b(false, false, (byte)var6_6);
                if (!var13_7) ** GOTO lbl89
            }
            case 4: {
                this.h = new nb(var1_1);
                this.h.b(true, false, (byte)var6_6);
                if (!var13_7) ** GOTO lbl89
            }
            case 5: {
                this.h = new nb(var1_1);
                this.h.b(true, false, (byte)var6_6);
                if (!var13_7) ** GOTO lbl89
            }
            case 6: {
                this.h = new nb(var1_1);
                this.h.b((byte)4, (byte)2);
                if (!var13_7) ** GOTO lbl89
            }
            case 8: {
                if (!var13_7) ** GOTO lbl89
            }
            case 9: {
                this.m = new nb[6];
                this.n = new int[6];
                this.o = new int[6];
                this.q = new byte[6];
                for (var2_2 = 0; var2_2 < 6; var2_2 = (int)((byte)(var2_2 + 1))) {
                    this.m[var2_2] = new nb(var1_1);
                    this.q[var2_2] = -1;
                    if (!var13_7) {
                        if (!var13_7) continue;
                    }
                    ** GOTO lbl48
                }
                this.s = 50;
lbl48:
                // 2 sources

                if (!var13_7) ** GOTO lbl89
            }
            case 10: {
                this.m = new nb[12];
                this.n = new int[12];
                this.o = new int[12];
                this.p = new int[12];
                this.q = new byte[12];
                for (var2_2 = 0; var2_2 < 12; var2_2 = (int)((byte)(var2_2 + 1))) {
                    this.m[var2_2] = new nb(var1_1);
                    this.p[var2_2] = -(var2_2 << 2);
                    this.q[var2_2] = -1;
                    if (var13_7) break block0;
                    if (!var13_7) continue;
                }
                if (!var13_7) ** GOTO lbl89
            }
            case 11: {
                this.m = new nb[35];
                this.n = new int[35];
                this.o = new int[35];
                this.p = new int[35];
                this.q = new byte[175];
                for (var6_6 = 0; var6_6 < 35; var6_6 = (int)((byte)(var6_6 + 1))) {
                    this.m[var6_6] = new nb(var1_1);
                    var2_2 = var6_6 * 36 % 360;
                    var11_8 = 0.017444444444444446 * (double)var2_2;
                    var2_2 = (int)(Math.cos(var11_8) * (double)(35 - var6_6) / 2.0);
                    var3_3 = (int)(Math.sin(var11_8) * (double)(35 - var6_6) / 2.0);
                    var4_4 = (byte)(var6_6 / 3);
                    this.q[var6_6 * 5] = (byte)var2_2;
                    this.q[var6_6 * 5 + 1] = (byte)var3_3;
                    this.q[var6_6 * 5 + 2] = var4_4;
                    this.q[var6_6 * 5 + 3] = (byte)(15 + var6_6 / 3);
                    if (var13_7) break block0;
                    if (var6_6 > 0) {
                        this.p[var6_6] = 35 / var6_6;
                    }
                    this.m[var6_6].b(null, (byte)0, (byte)0, (byte)16, (byte)17, true, false, (byte)0);
                    this.m[var6_6].j = (byte)ab.oc.nextInt(17);
                    this.m[var6_6].i = (byte)ab.oc.nextInt(17);
                    if (!var13_7) continue;
                }
                if (!var13_7) ** GOTO lbl89
            }
            case 12: {
                this.h = new nb(var1_1);
            }
lbl89:
            // 13 sources

            default: {
                this.t = var5_5;
                fb.Xd.addElement(this);
            }
        }
    }

    public final void b(o o2, int n2, int n3) {
        this.c = o2;
        this.d = 0;
        this.e = n3;
    }

    public final void b() {
        block46: {
            Object object;
            block47: {
                block66: {
                    block67: {
                        block70: {
                            w w2;
                            block44: {
                                boolean bl;
                                block59: {
                                    block60: {
                                        block65: {
                                            w w3;
                                            block43: {
                                                block54: {
                                                    block55: {
                                                        block58: {
                                                            w w4;
                                                            block42: {
                                                                int n2;
                                                                block53: {
                                                                    block50: {
                                                                        block52: {
                                                                            block51: {
                                                                                block49: {
                                                                                    block48: {
                                                                                        block45: {
                                                                                            bl = ab.xc;
                                                                                            if (this.r != 1 && this.h != null) {
                                                                                                this.h.c();
                                                                                            }
                                                                                            if (this.c != null) {
                                                                                                object = this.c;
                                                                                                this.j = ((o)object).c / 10 * 10;
                                                                                                object = this.c;
                                                                                                this.k = ((o)object).d / 10 * 10;
                                                                                                if (this.c instanceof q && ((q)this.c).m()) {
                                                                                                    this.c = null;
                                                                                                    object = this;
                                                                                                    this.f = true;
                                                                                                }
                                                                                            }
                                                                                            if (this.r != 0) break block45;
                                                                                            this.k -= 10;
                                                                                            ++this.s;
                                                                                            if (this.s == 50) {
                                                                                                if (this.h.j == 0) {
                                                                                                    this.h.b((byte)7, (byte)1);
                                                                                                }
                                                                                                if (this.h.j == 8) {
                                                                                                    this.h.b((byte)15, (byte)1);
                                                                                                }
                                                                                            }
                                                                                            if (this.s <= 50 || this.h.e) break block46;
                                                                                            break block47;
                                                                                        }
                                                                                        if (this.r != 2) break block48;
                                                                                        if (this.h.e) break block46;
                                                                                        break block47;
                                                                                    }
                                                                                    if (this.r != 3 && this.r != 5 && this.r != 1) break block49;
                                                                                    --this.s;
                                                                                    if (this.s > 0) break block46;
                                                                                    break block47;
                                                                                }
                                                                                if (this.r != 6) break block50;
                                                                                --this.s;
                                                                                if (this.s != 5) break block51;
                                                                                this.h.b();
                                                                                this.h.j = (byte)(this.h.b.h - 4);
                                                                                this.h.b((byte)(this.h.b.h - 1), (byte)2);
                                                                                if (!bl) break block52;
                                                                            }
                                                                            if (!this.h.e) {
                                                                                this.h.b(new byte[]{4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}, true, false, (byte)2);
                                                                            }
                                                                        }
                                                                        if (this.s > 0) break block46;
                                                                        break block47;
                                                                    }
                                                                    if (this.r != 8) break block53;
                                                                    this.l += 10;
                                                                    ++this.s;
                                                                    if (this.s <= 75) break block46;
                                                                    break block47;
                                                                }
                                                                if (this.r != 9) break block54;
                                                                if (this.m == null || this.n == null || this.o == null || this.q == null) break block55;
                                                                this.l += 5;
                                                                if (this.l >= 360) {
                                                                    this.l = 0;
                                                                }
                                                                if (this.s > 0) {
                                                                    --this.s;
                                                                }
                                                                if (this.s == 0 && fb.kb % 5L == 0L) {
                                                                    for (n2 = this.m.length - 1; n2 >= 0; --n2) {
                                                                        if (this.m[n2] == null || this.q[n2] != 0) continue;
                                                                        this.q[n2] = 1;
                                                                        this.m[n2].b();
                                                                        this.m[n2].b(b, false, false, (byte)0);
                                                                        if (!bl) break;
                                                                        if (!bl) continue;
                                                                    }
                                                                }
                                                                n2 = 1;
                                                                for (int n3 = 0; n3 < this.m.length; n3 = (int)((byte)(n3 + 1))) {
                                                                    block57: {
                                                                        block56: {
                                                                            w4 = this;
                                                                            if (bl) break block42;
                                                                            if (w4.m[n3] == null) continue;
                                                                            if (this.q[n3] != -1) break block56;
                                                                            this.m[n3].b(null, (byte)ab.oc.nextInt(17), (byte)0, (byte)16, (byte)17, true, false, (byte)0);
                                                                            this.q[n3] = 0;
                                                                            if (!bl) break block57;
                                                                        }
                                                                        if (this.q[n3] == 1 && !this.m[n3].e) {
                                                                            this.m[n3] = null;
                                                                            if (!bl) continue;
                                                                        }
                                                                    }
                                                                    int n4 = (360 / this.m.length * n3 + this.l) % 360;
                                                                    double d2 = 0.017444444444444446 * (double)n4;
                                                                    this.n[n3] = (int)(Math.cos(d2) * 20.0);
                                                                    this.o[n3] = (int)(Math.sin(d2) * 10.0);
                                                                    if (this.m == null) continue;
                                                                    n2 = 0;
                                                                    this.m[n3].c();
                                                                    if (!bl) continue;
                                                                }
                                                                if (n2 == 0) break block58;
                                                                w4 = this;
                                                            }
                                                            w w5 = w4;
                                                            w4.f = true;
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    object = this;
                                                    this.f = true;
                                                    return;
                                                }
                                                if (this.r != 10) break block59;
                                                if (this.m == null || this.n == null || this.o == null || this.p == null || this.q == null) break block60;
                                                this.l -= 10;
                                                if (this.l <= 0) {
                                                    this.l = 360;
                                                }
                                                boolean bl2 = true;
                                                for (int n5 = 0; n5 < this.m.length; n5 = (int)((byte)(n5 + 1))) {
                                                    block62: {
                                                        block64: {
                                                            block63: {
                                                                block61: {
                                                                    w3 = this;
                                                                    if (bl) break block43;
                                                                    if (w3.m[n5] == null) continue;
                                                                    int n6 = (n5 * 60 + this.l) % 360;
                                                                    double d3 = n6 != 0 ? 0.017444444444444446 * (double)n6 : 0.0;
                                                                    this.n[n5] = (int)(Math.cos(d3) * 20.0);
                                                                    this.o[n5] = (int)(Math.sin(d3) * 15.0);
                                                                    int n7 = n5;
                                                                    this.p[n7] = this.p[n7] + 2;
                                                                    if (this.q[n5] != -1) break block61;
                                                                    if (this.p[n5] < 0 || this.m[n5].e) break block62;
                                                                    this.m[n5].b(b, false, true, (byte)0);
                                                                    this.q[n5] = 0;
                                                                    if (!bl) break block62;
                                                                }
                                                                if (this.q[n5] != 0) break block63;
                                                                if (this.m[n5].e) break block62;
                                                                this.m[n5].b(null, (byte)0, (byte)0, (byte)16, (byte)17, true, false, (byte)0);
                                                                this.m[n5].q = 1;
                                                                this.q[n5] = 1;
                                                                if (!bl) break block62;
                                                            }
                                                            if (this.q[n5] != 1) break block64;
                                                            if (this.m[n5].e) break block62;
                                                            this.m[n5].b(b, false, false, (byte)0);
                                                            this.q[n5] = 2;
                                                            if (!bl) break block62;
                                                        }
                                                        if (!this.m[n5].e) {
                                                            this.m[n5] = null;
                                                        }
                                                    }
                                                    if (this.m[n5] == null) continue;
                                                    bl2 = false;
                                                    this.m[n5].c();
                                                    if (!bl) continue;
                                                }
                                                if (!bl2) break block65;
                                                w3 = this;
                                            }
                                            w w6 = w3;
                                            w3.f = true;
                                            return;
                                        }
                                        return;
                                    }
                                    object = this;
                                    this.f = true;
                                    return;
                                }
                                if (this.r != 11) break block66;
                                if (this.m == null || this.n == null || this.o == null || this.p == null || this.q == null) break block67;
                                boolean bl3 = true;
                                for (int n8 = 0; n8 < this.m.length; n8 = (int)((byte)(n8 + 1))) {
                                    block69: {
                                        block68: {
                                            w2 = this;
                                            if (bl) break block44;
                                            if (w2.m[n8] == null) continue;
                                            int n9 = n8;
                                            this.n[n9] = this.n[n9] + this.q[n8 * 5];
                                            int n10 = n8;
                                            this.o[n10] = this.o[n10] + this.q[n8 * 5 + 1];
                                            int n11 = n8;
                                            this.p[n11] = this.p[n11] + this.q[n8 * 5 + 2];
                                            int n12 = n8 * 5 + 3;
                                            this.q[n12] = (byte)(this.q[n12] - 1);
                                            if (this.q[n8 * 5 + 4] != 0) break block68;
                                            if (this.q[n8 * 5 + 3] > 5) break block69;
                                            this.q[n8 * 5 + 4] = 1;
                                            this.m[n8].b();
                                            this.m[n8].b(b, false, false, (byte)0);
                                            if (!bl) break block69;
                                        }
                                        if (this.q[n8 * 5 + 3] <= 0) {
                                            this.m[n8] = null;
                                        }
                                    }
                                    if (this.m[n8] == null) continue;
                                    bl3 = false;
                                    this.m[n8].c();
                                    if (!bl) continue;
                                }
                                if (!bl3) break block70;
                                w2 = this;
                            }
                            w w7 = w2;
                            w2.f = true;
                            return;
                        }
                        return;
                    }
                    object = this;
                    this.f = true;
                    return;
                }
                if (this.r != 12 || this.h != null && this.h.e) break block46;
            }
            object = this;
            this.f = true;
        }
    }

    public final void b(Graphics graphics) {
        int n2;
        int n3;
        int n4;
        boolean bl;
        block12: {
            block11: {
                bl = ab.xc;
                if (this.c == null) break block11;
                n4 = 0;
                if (this.c instanceof u) {
                    n4 = ((u)this.c).O;
                }
                o o2 = this.c;
                n3 = o2.c / 10 - fb.Ge;
                o2 = this.c;
                n2 = o2.d / 10 - n4 - fb.He;
                n3 += this.d;
                n2 += this.e;
                if (this.c instanceof q) {
                    n2 -= ((q)this.c).Gb / 10;
                }
                if (!bl) break block12;
            }
            n3 = this.j / 10 - fb.Ge;
            n2 = this.k / 10 - fb.He;
        }
        if (this.h != null) {
            this.h.b(graphics, n3, n2 - this.l / 10);
        }
        if (this.i != null) {
            ab.C.b(graphics, this.i, n3, n2 - this.l / 10, -1, 2);
        }
        if (this.m != null && this.n != null && this.o != null) {
            for (n4 = 0; n4 < this.m.length; n4 = (int)((byte)(n4 + 1))) {
                int n5;
                int n6;
                int n7;
                Graphics graphics2;
                nb nb2;
                if (this.m[n4] == null || (this.p == null || this.p[n4] < 0) && this.p != null) continue;
                if (this.r == 11) {
                    nb2 = this.m[n4];
                    graphics2 = graphics;
                    n7 = n3 + this.n[n4] / 5;
                    n6 = n2 + this.o[n4] / 5;
                    n5 = this.p[n4] / 5;
                } else {
                    nb2 = this.m[n4];
                    graphics2 = graphics;
                    n7 = n3 + this.n[n4];
                    n6 = n2 + this.o[n4];
                    n5 = this.p != null ? this.p[n4] : 0;
                }
                nb2.b(graphics2, n7, n6 - n5);
                if (!bl) continue;
            }
        }
    }

    public final void c() {
        this.f = true;
    }
}

