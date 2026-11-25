/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class p
extends o {
    public static byte[] r = new byte[]{3, 2, 1, 0, 0, 0, 0, 1, 2, 3, 3};
    public static byte[] s = new byte[]{3, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 3, 3};
    public boolean t;
    private q u;
    private q v;
    private byte w;
    public byte x;
    public nb y;
    private nb z;
    private int A;
    private int B;
    private int C;
    private byte D;
    private int E;
    private int F;
    public byte G;
    private boolean H;
    private long I;

    private p(byte by, byte by2, int n2, int n3, int n4, int n5, q q2, q q3, int n6) {
        boolean bl = ab.xc;
        super((byte)-1, (byte)-1, n2, n3);
        this.w = by;
        this.A = n4;
        switch (this.w) {
            case 1: {
                this.y = new nb(fb.Db);
                this.y.b(false, false, (byte)0);
                if (fb.Rb != null) {
                    this.z = new nb(fb.Rb);
                    this.z.b(r, false, false, (byte)0);
                }
                this.x = 0;
                if (n5 < 30) {
                    this.F = 10;
                    if (!bl) break;
                }
                this.F = 20;
                if (!bl) break;
            }
            case 2: {
                if (fb.lc != null) {
                    this.y = new nb(fb.lc);
                    this.y.b(false, false, (byte)1);
                }
                if (fb.Ob != null) {
                    this.z = new nb(fb.Ob);
                    this.z.b(new byte[]{2}, false, false, (byte)3);
                    this.B = 8;
                }
                this.x = 0;
                this.F = 10;
                if (!bl) break;
            }
            case 3: {
                this.H = true;
                if (!bl) break;
            }
            case 4: 
            case 6: {
                this.y = new nb(fb.Gc);
                this.y.b(false, false, (byte)1);
                if (fb.Ub != null) {
                    this.z = new nb(fb.Ub);
                    this.z.b(r, false, false, (byte)0);
                }
                if (fb.Jc != null) {
                    p p2 = this;
                    p2 = this;
                    new w((pb)fb.Jc, (int)(this.c / 10), (int)(p2.d / 10 - 10), (byte)2, (boolean)false, (int)2).l = this.A * 10;
                }
                this.x = 0;
                if (n5 < 30) {
                    this.F = 10;
                    if (!bl) break;
                }
                this.F = 20;
                break;
            }
            case 5: {
                this.y = new nb(fb.Hb);
                this.y.b(false, false, (byte)0);
                if (fb.Rb != null) {
                    this.z = new nb(fb.Rb);
                    this.z.b(r, false, false, (byte)0);
                }
                this.x = 0;
                this.F = 14;
                if (!bl) break;
            }
            case 7: {
                this.y = new nb(fb.Hb);
                this.y.b(false, false, (byte)0);
                if (fb.Rb != null) {
                    this.z = new nb(fb.Rb);
                    this.z.b(r, false, false, (byte)0);
                }
                this.x = 0;
                this.F = 14;
                if (!bl) break;
            }
            case 8: {
                this.y = new nb(fb.Mb);
                this.y.b(false, false, (byte)0);
                if (fb.Rb != null) {
                    this.z = new nb(fb.Rb);
                    this.z.b(r, false, false, (byte)0);
                }
                this.x = 0;
                if (n5 < 30) {
                    this.F = 10;
                    if (!bl) break;
                }
                this.F = 20;
            }
        }
        this.D = by2;
        if (this.D <= 0) {
            this.D = 1;
        }
        this.E = n5;
        this.u = q2;
        this.v = q3;
        this.C = n6;
        if (fb.Td != null) {
            fb.Td.addElement(this);
        }
    }

    public static p b(byte by, byte by2, int n2, int n3, int n4, int n5, q q2, q q3, int n6) {
        if (p.b((byte)(n2 / 30), (byte)(n3 / 30))) {
            return new p(by, by2, n2, n3, n4, n5, q2, q3, n6);
        }
        return null;
    }

    public final void h() {
        block94: {
            boolean bl;
            block73: {
                block87: {
                    int n2;
                    int n3;
                    int n4;
                    int n5;
                    int n6;
                    int n7;
                    int[][] nArray;
                    int n8;
                    boolean bl2;
                    block72: {
                        block71: {
                            int n9;
                            block88: {
                                block74: {
                                    block77: {
                                        block75: {
                                            block76: {
                                                bl2 = ab.xc;
                                                if (this.t) {
                                                    return;
                                                }
                                                if (!this.H) break block74;
                                                if (!fb.M && !fb.i()) break block75;
                                                --this.I;
                                                if (this.v != null) {
                                                    if (!this.v.n()) {
                                                        p p2 = this;
                                                        this.t = true;
                                                        return;
                                                    }
                                                    this.d(this.v.g, this.v.h);
                                                    if (this.v.r()) {
                                                        return;
                                                    }
                                                }
                                                if (this.I < 0L) break block76;
                                                if (q.Vc == null) break block77;
                                                int n10 = -(this.D - 1);
                                                while (n10 < this.D) {
                                                    int n11;
                                                    int n12;
                                                    block69: {
                                                        byte by = (byte)(-(this.D - 1));
                                                        while (by < this.D) {
                                                            block70: {
                                                                byte by2;
                                                                block78: {
                                                                    q[] qArray;
                                                                    n12 = Math.abs(n10) + Math.abs(by);
                                                                    n11 = this.D;
                                                                    if (bl2) break block69;
                                                                    if (n12 > n11 || !o.b((byte)(this.g + n10), (byte)(this.h + by)) || q.Vc[this.g + n10][this.h + by] == 0 || (qArray = q.b((int)((byte)(this.g + n10)), (int)((byte)(this.h + by)), 2, null)) == null) break block78;
                                                                    for (int n13 = 0; n13 < qArray.length; n13 = (int)((byte)(n13 + 1))) {
                                                                        boolean bl3;
                                                                        boolean bl4;
                                                                        boolean bl5;
                                                                        byte by3;
                                                                        block84: {
                                                                            block86: {
                                                                                block85: {
                                                                                    block83: {
                                                                                        block80: {
                                                                                            block82: {
                                                                                                block81: {
                                                                                                    block79: {
                                                                                                        by3 = 0;
                                                                                                        by2 = ab.g() ? 1 : 0;
                                                                                                        if (bl2) break block70;
                                                                                                        if (by2 == 0) break block79;
                                                                                                        if (this.u == null) break block80;
                                                                                                        by3 = this.u.w;
                                                                                                        if (!bl2) break block80;
                                                                                                    }
                                                                                                    if (this.v != qArray[n13]) break block81;
                                                                                                    if (this.u == null) break block80;
                                                                                                    by3 = this.u.w;
                                                                                                    if (!bl2) break block80;
                                                                                                }
                                                                                                if (this.v == null) break block82;
                                                                                                by3 = this.v.w;
                                                                                                if (!bl2) break block80;
                                                                                            }
                                                                                            if (this.u != null) {
                                                                                                by3 = this.u.w;
                                                                                            }
                                                                                        }
                                                                                        if (qArray[n13].Y) continue;
                                                                                        bl5 = true;
                                                                                        bl4 = false;
                                                                                        bl3 = false;
                                                                                        if (this.v != qArray[n13]) break block83;
                                                                                        bl4 = true;
                                                                                        if (!bl2) break block84;
                                                                                    }
                                                                                    if (this.u != null && this.u.x == qArray[n13].x) {
                                                                                        bl3 = true;
                                                                                    }
                                                                                    if (this.u != qArray[n13]) break block85;
                                                                                    bl5 = false;
                                                                                    if (!bl2) break block84;
                                                                                }
                                                                                if (!ab.g()) break block84;
                                                                                if (this.v == null) break block86;
                                                                                if (qArray[n13].x == this.v.x) break block84;
                                                                                bl5 = false;
                                                                                if (!bl2) break block84;
                                                                            }
                                                                            if (this.u != null && qArray[n13].x == this.u.x) {
                                                                                bl5 = false;
                                                                            }
                                                                        }
                                                                        if (!bl5) continue;
                                                                        qArray[n13].b(this.E, by3, this.C, bl4, bl3, true);
                                                                        if (!bl2) continue;
                                                                    }
                                                                }
                                                                by2 = by = (byte)(by + 1);
                                                            }
                                                            if (!bl2) continue;
                                                        }
                                                        n12 = n10;
                                                        n11 = 1;
                                                    }
                                                    n10 = (byte)(n12 + n11);
                                                    if (!bl2) continue;
                                                }
                                                return;
                                            }
                                            p p3 = this;
                                            this.t = true;
                                            return;
                                        }
                                        p p4 = this;
                                        this.t = true;
                                    }
                                    return;
                                }
                                if (this.x != 0 && (this.y == null || this.y.j != this.x)) break block87;
                                this.x = (byte)-1;
                                p p5 = this;
                                p p6 = p5;
                                p6 = this;
                                int n14 = p.b(fb.Ge + ab.D / 2, fb.He + ab.E / 2, p5.c / 10, p6.d / 10);
                                int n15 = p.b(0, 0, ab.D, ab.E);
                                n8 = this.F;
                                if (n14 < n15 && n15 != 0) {
                                    n8 = n8 * (100 - n14 * 100 / n15) / 100;
                                    fb.b(n8, n8);
                                }
                                if (this.D != 1) break block88;
                                this.b(this.g, this.h, this.E, true, this.C, true);
                                if (!bl2) break block87;
                            }
                            boolean[] blArray = new boolean[4];
                            nArray = new int[this.D << 1][this.D << 1];
                            nArray[this.D][this.D] = this.E;
                            n7 = 1;
                            block3: while (true) {
                                int n16 = n7;
                                block4: while (n16 < this.D) {
                                    n9 = 0;
                                    if (bl2) break block71;
                                    for (n6 = v138837; n6 < 4; ++n6) {
                                        block89: {
                                            block90: {
                                                n16 = blArray[n6];
                                                if (bl2) continue block4;
                                                if (n16 != 0) continue;
                                                n5 = this.g;
                                                n4 = this.h;
                                                if (n6 == 0) {
                                                    n4 += n7;
                                                }
                                                if (n6 == 1) {
                                                    n5 -= n7;
                                                }
                                                if (n6 == 2) {
                                                    n4 -= n7;
                                                }
                                                if (n6 == 3) {
                                                    n5 += n7;
                                                }
                                                if (!p.b((byte)n5, (byte)n4) || fb.Re == null) break block89;
                                                if (fb.Re[n5][n4].d == null) {
                                                    if (n7 == 1) {
                                                        nArray[this.D + n5 - this.g][this.D + n4 - this.h] = this.E;
                                                        if (!bl2) continue;
                                                    }
                                                    nArray[this.D + n5 - this.g][this.D + n4 - this.h] = (this.D + 1 - n7) * ((this.E - this.E * 25 / 100) / this.D);
                                                    if (!bl2) continue;
                                                }
                                                if (n7 != 1) break block90;
                                                nArray[this.D + n5 - this.g][this.D + n4 - this.h] = this.E;
                                                if (!bl2) break block89;
                                            }
                                            nArray[this.D + n5 - this.g][this.D + n4 - this.h] = (this.D + 1 - n7) * ((this.E - this.E * 25 / 100) / this.D);
                                        }
                                        blArray[n6] = true;
                                        if (!bl2) continue;
                                    }
                                    ++n7;
                                    if (!bl2) continue block3;
                                }
                                break;
                            }
                            n9 = n3 = 0;
                        }
                        if (this.D > 5) {
                            n3 = 1;
                        }
                        n7 = -1;
                        block6: while (true) {
                            int n17 = n7;
                            block7: while (n17 <= 1) {
                                n2 = -1;
                                if (bl2) break block72;
                                for (n6 = v139073; n6 <= 1; n6 += 2) {
                                    n5 = this.g + n7;
                                    n4 = this.h + n6;
                                    n17 = p.b((byte)n5, (byte)n4) ? 1 : 0;
                                    if (bl2) continue block7;
                                    if (n17 == 0 || fb.Re == null) continue;
                                    if (fb.Re[n5][n4].d == null) {
                                        nArray[this.D + n5 - this.g][this.D + n4 - this.h] = (this.D - 1) * ((this.E - this.E * 25 / 100) / this.D);
                                        if (n3 == 0) continue;
                                        n5 = this.g + (n7 << 1);
                                        n4 = this.h + n6;
                                        if (p.b((byte)n5, (byte)n4) && fb.Re != null && fb.Re[n5][n4].d == null) {
                                            nArray[this.D + n5 - this.g][this.D + n4 - this.h] = (this.D - 2) * ((this.E - this.E * 25 / 100) / this.D);
                                        }
                                        if (!p.b((byte)(n5 = this.g + n7), (byte)(n4 = this.h + (n6 << 1))) || fb.Re == null || fb.Re[n5][n4].d != null) continue;
                                        nArray[this.D + n5 - this.g][this.D + n4 - this.h] = (this.D - 2) * ((this.E - this.E * 25 / 100) / this.D);
                                        if (!bl2) continue;
                                    }
                                    if (n7 == 1) {
                                        nArray[this.D + n5 - this.g][this.D + n4 - this.h] = this.E;
                                        if (!bl2) continue;
                                    }
                                    nArray[this.D + n5 - this.g][this.D + n4 - this.h] = (this.D + 1 - n7) * ((this.E - this.E * 25 / 100) / this.D);
                                    if (!bl2) continue;
                                }
                                n7 += 2;
                                if (!bl2) continue block6;
                            }
                            break;
                        }
                        n2 = 0;
                    }
                    n7 = n2;
                    block9: while (true) {
                        int n18 = n7;
                        block10: while (n18 < this.D << 1) {
                            bl = false;
                            if (bl2) break block73;
                            n6 = bl ? 1 : 0;
                            block11: while (true) {
                                int n19 = n6;
                                block12: while (n19 < this.D << 1) {
                                    block91: {
                                        int n20;
                                        int n21;
                                        hb[] hbArray;
                                        block92: {
                                            block93: {
                                                n18 = nArray[n7][n6];
                                                if (bl2) continue block10;
                                                if (n18 <= 0 || !p.b((byte)(n5 = this.g + n7 - this.D), (byte)(n4 = this.h + n6 - this.D))) break block91;
                                                this.b((byte)n5, (byte)n4, nArray[n7][n6], false, this.C, n7 == this.D && n6 == this.D);
                                                if (fb.Re[n5][n4].d == null) break block92;
                                                if (fb.Re[n5][n4].d.I != 0 && fb.Re[n5][n4].d.I != j.L) break block93;
                                                n3 = n5 - this.g;
                                                n8 = n4 - this.h;
                                                int n22 = 200 / this.D;
                                                if (n3 != 0) {
                                                    n3 = (this.D - Math.abs(n3)) * n22 * (Math.abs(n3) / n3);
                                                }
                                                if (n8 != 0) {
                                                    n8 = (this.D - Math.abs(n8)) * n22 * (Math.abs(n8) / n8);
                                                }
                                                fb.Re[n5][n4].d.b(n3, n8);
                                                if ((fb.M || fb.i()) && fb.Re[n5][n4].d.I != 0) {
                                                    fb.Re[n5][n4].d.b(nArray[n7][n6]);
                                                }
                                                if (!bl2) break block92;
                                            }
                                            if (fb.M || fb.i()) {
                                                fb.Re[n5][n4].d.b(nArray[n7][n6]);
                                            }
                                        }
                                        if ((this.C == 7 || this.C == 8) && n5 == this.g && n4 == this.h && hb.Q != null && hb.Q[n5][n4] && o.b(this.g, this.h, n5, n4) <= 1 && (hbArray = hb.c((int)((byte)n5), (int)((byte)n4))) != null) {
                                            for (n3 = 0; n3 < hbArray.length; ++n3) {
                                                n21 = hbArray[n3].o;
                                                n20 = 13;
                                                if (!bl2) {
                                                    if (n21 != n20) continue;
                                                    hbArray[n3].b(hbArray[n3].q, hbArray[n3].r, false);
                                                    if (!bl2) continue;
                                                }
                                                break;
                                            }
                                        } else {
                                            n21 = this.C;
                                            n20 = 13;
                                        }
                                        if (n21 == n20 && n5 == this.g && n4 == this.h) {
                                            n8 = 0;
                                            while (n8 < 4) {
                                                byte by;
                                                byte by4 = y.b((byte)n8, (byte)n5);
                                                n3 = y.c((byte)n8, (byte)n4);
                                                n19 = o.b(by4, (byte)n3) ? 1 : 0;
                                                if (bl2) continue block12;
                                                if (n19 != 0 && hb.Q[by4][n3]) {
                                                    for (int i2 = 0; i2 < fb.Ud.size(); ++i2) {
                                                        hb hb2 = (hb)fb.Ud.elementAt(i2);
                                                        by = hb2.S ? 1 : 0;
                                                        if (!bl2) {
                                                            if (by == 0 || hb2.o != 13 || hb2.q != by4 || hb2.r != n3) continue;
                                                            hb2.b(hb2.q, hb2.r, false);
                                                            if (!bl2) break;
                                                            if (!bl2) continue;
                                                        }
                                                        break;
                                                    }
                                                } else {
                                                    by = (byte)(n8 + 1);
                                                }
                                                n8 = by;
                                                if (!bl2) continue;
                                            }
                                        }
                                    }
                                    ++n6;
                                    if (!bl2) continue block11;
                                }
                                break;
                            }
                            ++n7;
                            if (!bl2) continue block9;
                        }
                        break;
                    }
                }
                super.h();
                if (this.y != null) {
                    this.y.c();
                }
                if (this.z != null) {
                    this.z.c();
                }
                if (this.y == null) break block94;
                bl = this.y.e;
            }
            if (!(bl || this.z != null && this.z.e)) {
                p p7 = this;
                this.t = true;
                return;
            }
        }
        if (this.y == null && this.z == null) {
            p p8 = this;
            this.t = true;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void b(byte by, byte n2, int n3, boolean bl, int n4, boolean bl2) {
        block26: {
            boolean bl3 = ab.xc;
            if (!fb.M && !fb.i()) break block26;
            if (n3 == 0) {
                return;
            }
            int n5 = 0;
            Vector<q> vector = null;
            if (bl) {
                n5 = 4;
                vector = new Vector<q>();
            }
            for (byte by2 = -1; by2 < n5; by2 = (byte)(by2 + 1)) {
                int n6;
                byte by3;
                if (by2 != -1) {
                    by3 = y.b(by2, by);
                    if (!o.b(by3, (byte)(n6 = (int)y.c(by2, (byte)n2)))) {
                        continue;
                    }
                } else {
                    by3 = by;
                    n6 = n2;
                }
                q[] qArray = this.v != null ? this.v : this.u;
                if ((qArray = q.b((int)by3, n6, 2, (q)qArray)) == null) continue;
                block7: for (n6 = 0; n6 < qArray.length; ++n6) {
                    q q2;
                    block32: {
                        int n7;
                        block29: {
                            block31: {
                                block30: {
                                    block27: {
                                        block28: {
                                            q2 = qArray[n6];
                                            if (q2 == null || (this.C == 3 || this.C == 4) && this.u != null && q2.w == this.u.w) continue;
                                            if (bl) {
                                                switch (by2) {
                                                    case 0: {
                                                        q q3 = q2;
                                                        if (q3.d / 10 % 30 <= 10) break;
                                                        continue block7;
                                                    }
                                                    case 1: {
                                                        q q4 = q2;
                                                        if (q4.c / 10 % 30 >= 20) break;
                                                        continue block7;
                                                    }
                                                    case 2: {
                                                        q q5 = q2;
                                                        if (q5.d / 10 % 30 >= 20) break;
                                                        continue block7;
                                                    }
                                                    case 3: {
                                                        q q6 = q2;
                                                        if (q6.c / 10 % 30 > 10) continue block7;
                                                    }
                                                }
                                                if (vector.indexOf(q2) != -1) continue;
                                            }
                                            n7 = -1;
                                            if (q2 == null || this.v == null) break block27;
                                            if (q2.w != this.v.w) break block28;
                                            n7 = this.u.w;
                                            if (!bl3) break block27;
                                        }
                                        n7 = this.v.w;
                                    }
                                    if (this.G == 0) break block29;
                                    if (q2.Wb) break block30;
                                    q2.b(n3 / 3, n7, n4, false);
                                    if (!bl3) break block31;
                                }
                                q2.b(n3, n7, n4, false);
                            }
                            if (q2.Tb || !q2.Wb) break block32;
                            q2.b(this.G);
                            if (!bl3) break block32;
                        }
                        q2.b(n3, n7, n4, bl2);
                    }
                    if (!bl) continue;
                    vector.addElement(q2);
                    if (!bl3) continue;
                }
                if (!bl3) continue;
            }
        }
    }

    public final void b(int n2, q q2) {
        if (fb.M || fb.i()) {
            this.H = true;
            this.I = n2;
            this.v = q2;
            return;
        }
        p p2 = this;
        this.t = true;
    }

    public final void b(Graphics graphics) {
        p p2;
        if (this.z != null && this.z.e) {
            p p3 = this;
            p2 = p3;
            p2 = this;
            this.z.b(graphics, p3.c / 10 - fb.Ge, p2.d / 10 + this.B - fb.He);
        }
        if (this.y != null && this.y.e) {
            p p4 = this;
            p2 = p4;
            p2 = this;
            this.y.b(graphics, p4.c / 10 - fb.Ge, p2.d / 10 - this.A - fb.He);
        }
    }
}

