/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class q
extends o {
    public byte r;
    private static int t = 40;
    private static int u = 20;
    private static int v = 30;
    public byte w;
    public byte x;
    public String y;
    public String z;
    public int A;
    public int B;
    public int C;
    private int D;
    private int E;
    private static int F = 80;
    private static int G = 3;
    public static byte[] H = new byte[]{0, 3, 6, 9};
    public static byte[][] I = new byte[][]{{12, 13, 14, 15, 16}, {12, 13, 14, 15}, {0, 1, 2, 3, 4, 5}};
    public static byte[][] J = new byte[][]{{17, 18, 19, 20, 21}, {16, 17, 18, 19}, {0, 1, 2, 3, 4, 5}};
    public static byte[][] K = new byte[][]{{22, 23, 24, 25, 26}, {20, 21, 22, 23}, {0, 1, 2, 3, 4, 5}};
    public static byte[][] L = new byte[][]{{27, 28, 29, 30, 31}, {24, 25, 26, 27}, {0, 1, 2, 3, 4, 5}};
    private byte M;
    private byte N;
    private byte O;
    private static byte[] P;
    private static byte[] Q;
    private static byte[] R;
    private byte S;
    private static byte T;
    public boolean U;
    public boolean V;
    public static int W;
    public int X;
    public boolean Y;
    private int Z;
    private byte ab;
    private int bb;
    private int cb;
    private boolean db;
    private boolean eb;
    public boolean fb;
    private int gb;
    private boolean hb;
    public boolean ib;
    private int jb;
    public boolean kb;
    private int lb;
    public byte mb;
    public byte nb;
    public byte ob;
    private long pb;
    public byte qb;
    private boolean rb;
    private byte sb;
    private byte tb;
    public byte ub;
    public int vb;
    private int wb;
    private int xb;
    private byte yb;
    private int zb;
    private byte Ab;
    public boolean Bb;
    private int Cb;
    private int Db;
    private boolean Eb;
    private byte Fb;
    public int Gb;
    public int Hb;
    public int Ib;
    private boolean Jb;
    public boolean Kb;
    public boolean Lb;
    private byte Mb;
    public boolean Nb;
    private int Ob;
    public byte Pb;
    private boolean Qb;
    private byte Rb;
    private byte Sb;
    public boolean Tb;
    private byte Ub;
    private long Vb;
    public boolean Wb;
    private int Xb;
    public int[] Yb;
    private long[] Zb;
    public int[] ac;
    public int bc;
    public int cc;
    public int[] dc;
    private static int[] ec;
    private byte fc;
    public boolean gc;
    public boolean hc;
    public long ic;
    public long jc;
    private long kc;
    public boolean lc;
    public int mc;
    public int nc;
    private boolean oc;
    private int pc;
    public byte qc;
    private int rc;
    private int sc;
    private int tc;
    private boolean uc;
    private boolean vc;
    private boolean wc;
    private boolean xc;
    private w yc;
    private w zc;
    private r Ac;
    public boolean Bc;
    public y Cc;
    public boolean Dc;
    public boolean Ec;
    public boolean Fc;
    public nb Gc;
    private nb Hc;
    private nb Ic;
    private nb Jc;
    private nb Kc;
    public l Lc;
    private l Mc;
    private int Nc;
    private int Oc;
    private boolean Pc;
    private boolean Qc;
    private long Rc;
    private byte[] Sc;
    private byte[] Tc;
    private byte[] Uc;
    public static byte[][] Vc;

    public q(byte by, byte by2) {
        q q2;
        block12: {
            boolean bl = ab.xc;
            super((byte)-1, (byte)-1, 0, 0);
            this.C = 0;
            this.M = 0;
            this.U = true;
            this.X = 0;
            this.ab = (byte)5;
            this.Pb = 0;
            this.Qb = false;
            this.Xb = 0;
            this.bc = 0;
            this.cc = -1;
            this.fc = 0;
            this.kc = 125L;
            this.Bc = false;
            this.Sc = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
            this.Tc = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
            this.Uc = new byte[]{2, 2, 2, -1, -1, -1, -1, -1, -1};
            this.r = by;
            this.x = by2;
            this.y = "";
            this.z = "";
            this.C = 0;
            if (Vc == null) {
                Vc = new byte[fb.Pe][fb.Qe];
            }
            switch (this.r) {
                case 0: {
                    this.Gc = new nb(fb.xb);
                    this.Hc = new nb(fb.Wb);
                    if (!bl) break;
                }
                case 1: 
                case 5: 
                case 6: 
                case 7: 
                case 8: {
                    this.Gc = new nb(fb.fd);
                    this.Hc = new nb(fb.dd);
                    if (!bl) break;
                }
                case 2: {
                    this.Gc = new nb(fb.yd);
                    if (!bl) break;
                }
                case 3: {
                    this.Gc = new nb(fb.ld);
                    if (!bl) break;
                }
                case 4: {
                    this.Gc = new nb(fb.md);
                    if (!bl) break;
                }
                case 9: {
                    this.Gc = new nb(fb.ud);
                }
            }
            this.Dc = true;
            this.Ec = false;
            this.Fc = true;
            this.mb = (byte)-1;
            this.hc = true;
            this.ic = 0L;
            this.jc = 0L;
            q q3 = this;
            for (by2 = 1; by2 < 127; by2 = (byte)(by2 + 1)) {
                q2 = q.d(by2);
                if (!bl) {
                    if (q2 != null) continue;
                    fb.Qd.addElement(q3);
                    q3.w = by2;
                    if (!bl) break;
                    if (!bl) continue;
                }
                break block12;
            }
            this.Ic = new nb(fb.dc);
            this.Jc = new nb(fb.ec);
            this.Kc = new nb(fb.fc);
            q2 = this;
        }
        if (q2.o()) {
            this.Yb = new int[14];
            this.Zb = new long[14];
            this.ac = new int[11];
            this.dc = new int[6];
        }
        this.nc = this.mc = this.v();
    }

    public final void a() {
        this.V = true;
    }

    public final void b(int[] nArray, int[] nArray2, int[] nArray3, int n2) {
        block9: {
            boolean bl;
            block8: {
                block7: {
                    bl = ab.xc;
                    this.C = n2;
                    for (n2 = 0; n2 < 14; ++n2) {
                        this.Yb[n2] = nArray[n2];
                        if (!bl) {
                            if (!bl) continue;
                        }
                        break block7;
                    }
                    if (this == fb.Pd && fb.I != null && fb.Pd.bc != -1) {
                        fb.I.c(hb.b(fb.Pd.bc) + fb.Pd.Yb[fb.Pd.bc]);
                    }
                }
                for (n2 = 0; n2 < 11; ++n2) {
                    this.ac[n2] = nArray2[n2];
                    if (!bl) {
                        if (!bl) continue;
                    }
                    break block8;
                }
                n2 = 0;
            }
            while (n2 < 6) {
                this.dc[n2] = nArray3[n2];
                ++n2;
                if (!bl) {
                    if (!bl) continue;
                }
                break block9;
            }
            this.mc = this.v();
        }
    }

    public final void b(byte by, byte by2, boolean bl) {
        block23: {
            q q2;
            block21: {
                block22: {
                    block28: {
                        boolean bl2;
                        block27: {
                            block26: {
                                block25: {
                                    q[] qArray;
                                    block24: {
                                        q q3;
                                        bl2 = ab.xc;
                                        if (by < 0 || by2 < 0) break block23;
                                        this.mb = fb.df ? (byte)0 : 1;
                                        this.O = 1;
                                        this.Rb = (byte)-1;
                                        this.rb = false;
                                        this.Kb = true;
                                        if (this == fb.Pd && fb.i()) {
                                            this.Ec = true;
                                        }
                                        if (bl) {
                                            this.b((byte)-1);
                                            if (this.fb && this.gb != -2) {
                                                this.e((byte)-1, false);
                                            }
                                            if (this.ib) {
                                                this.g((byte)-1, false);
                                            }
                                            if (this.Y) {
                                                this.b(0, 0, 0, false, false, false);
                                            }
                                            if (this.kb) {
                                                this.f((byte)-1, false);
                                            }
                                            boolean bl3 = false;
                                            byte by3 = 0;
                                            q3 = this;
                                            q3.b(by3, bl3, true);
                                        }
                                        this.ub = 0;
                                        this.d(by, by2);
                                        this.j();
                                        if (bl) {
                                            this.nc = this.mc;
                                            this.uc = false;
                                            q3 = this;
                                            this.Nc = q3.c / 10;
                                            q3 = this;
                                            this.Oc = q3.d / 10;
                                            this.Pc = false;
                                            this.b(false);
                                        }
                                        if (this.r != 0) break block24;
                                        this.N = 0;
                                        this.wb = t;
                                        this.M = 0;
                                        this.pc = 25;
                                        this.Hc.j = 0;
                                        if (!fb.df) {
                                            by2 = (byte)320;
                                            q q4 = this;
                                            this.Jb = true;
                                            q4.Gb = 3200;
                                            q4.Ib = 320;
                                        }
                                        if (fb.M || fb.i() && fb.Pd == this) {
                                            this.jc = fb.kb;
                                        }
                                        break block22;
                                    }
                                    if (!this.p()) break block25;
                                    this.N = 0;
                                    this.wb = t;
                                    this.M = 0;
                                    this.pc = 25;
                                    this.Hc.j = 0;
                                    q q5 = this;
                                    byte by4 = this.h;
                                    by2 = this.g;
                                    q q6 = this;
                                    if ((fb.M || fb.i()) && fb.bf != null && (qArray = q.b((int)q6.g, (int)q6.h, 0, null)) != null && qArray.length != 0) {
                                        byte by5 = (byte)ab.oc.nextInt(4);
                                        for (int i2 = 0; i2 < qArray.length; ++i2) {
                                            q2 = qArray[i2];
                                            if (bl2) break block21;
                                            if (q2 == q5) continue;
                                            qArray[i2].b(by2, by4, by5, (byte)6, true, false, true, (byte)0, q6.w, (byte)3, (byte)1);
                                            if (qArray[i2].qb != 3) {
                                                qArray[i2].b(by2, by4, y.d(by5), (byte)6, true, false, true, (byte)0, q5.w, (byte)3, (byte)1);
                                            }
                                            if (qArray[i2].qb == 3) {
                                                qArray[i2].Cb = 30;
                                                if (!bl2) continue;
                                            }
                                            qArray[i2].b(30, (int)q6.w, -1, false);
                                            if (!bl2) continue;
                                            break block22;
                                        }
                                    }
                                    break block22;
                                }
                                if (this.r != 2) break block26;
                                this.N = (byte)2;
                                this.wb = u;
                                this.M = 0;
                                this.pc = 50;
                                this.mb = 0;
                                this.hc = false;
                                this.e((byte)-2, false);
                                if (!bl2) break block22;
                            }
                            if (this.r != 3) break block27;
                            this.N = (byte)2;
                            this.wb = v;
                            this.M = 1;
                            this.pc = 15;
                            this.mb = 0;
                            this.hc = false;
                            if (!bl2) break block22;
                        }
                        if (this.r != 4) break block28;
                        this.O = (byte)2;
                        this.N = (byte)2;
                        this.wb = 0;
                        this.M = 0;
                        this.pc = 25;
                        this.mb = 0;
                        this.hc = false;
                        if (!bl2) break block22;
                    }
                    if (this.r == 9) {
                        this.O = 0;
                        this.N = 0;
                        this.wb = v;
                        this.M = (byte)2;
                        this.pc = 15;
                        this.mb = 0;
                        this.hc = false;
                    }
                }
                q2 = this;
            }
            if (q2.Cc != null && bl) {
                this.Ec = true;
                this.Cc.b();
            }
        }
    }

    public static void b(byte[] byArray) {
        boolean bl = ab.xc;
        for (int i2 = 0; i2 < byArray.length / 3; ++i2) {
            q q2 = new q(0, byArray[i2 * 3 + 2]);
            q2.b(byArray[i2 * 3], byArray[i2 * 3 + 1], true);
            q2.B = q2.w;
            if (!bl) continue;
        }
    }

    public static byte[] b(int n2) {
        boolean bl = ab.xc;
        byte[] byArray = new byte[n2 * 3];
        byte by = -1;
        for (int i2 = 0; i2 < n2; ++i2) {
            q q2;
            block17: {
                block16: {
                    byte[] byArray2;
                    block14: {
                        block11: {
                            block15: {
                                block12: {
                                    block13: {
                                        if (!ab.g()) break block11;
                                        if (ab.fc == 0) {
                                            by = (byte)(i2 % 2);
                                        }
                                        if (ab.fc != 1) break block12;
                                        if (!fb.I.e((byte)(i2 + 1))) break block13;
                                        byte by2 = by = i2 == 0 ? ab.ec : fb.I.O.b((byte)(i2 + 1));
                                        if (!bl) break block12;
                                    }
                                    by = (byte)(i2 % 2);
                                }
                                if (ab.fc != 2) break block14;
                                if (!fb.I.e((byte)(i2 + 1))) break block15;
                                by = 0;
                                if (!bl) break block14;
                            }
                            by = 1;
                            if (!bl) break block14;
                        }
                        by = (byte)(by + 1);
                    }
                    if ((byArray2 = q.b(q2 = new q(0, by))) == null) break block16;
                    byArray[i2 * 3] = byArray2[0];
                    byArray[i2 * 3 + 1] = byArray2[1];
                    if (!bl) break block17;
                }
                byArray[i2 * 3] = -1;
                byArray[i2 * 3 + 1] = -1;
            }
            byArray[i2 * 3 + 2] = q2.x;
            q2.B = q2.w;
            if (!bl) continue;
        }
        return byArray;
    }

    public static byte[] b(q q2) {
        block26: {
            boolean bl = ab.xc;
            boolean bl2 = true;
            boolean bl3 = ab.g();
            q q3 = q2;
            if (q3 == null) break block26;
            boolean bl4 = false;
            int n2 = 0;
            int n3 = 0;
            do {
                block33: {
                    block31: {
                        int n4;
                        block32: {
                            int n5;
                            int n6;
                            block22: {
                                boolean bl5;
                                if (n3 >= 2) {
                                    bl5 = bl4;
                                    if (!bl) {
                                        if (!bl5) break;
                                    }
                                } else {
                                    bl5 = bl4;
                                }
                                if (bl5) {
                                    n3 = 3;
                                }
                                n4 = 0;
                                n6 = 0;
                                int n7 = 0;
                                block1: while (true) {
                                    int n9 = n7;
                                    n9 = fb.ae.size();
                                    block2: while (n8 < n9) {
                                        block27: {
                                            boolean bl6;
                                            sb sb2;
                                            block30: {
                                                block24: {
                                                    block29: {
                                                        int n10;
                                                        byte by;
                                                        int n11;
                                                        q[] qArray;
                                                        byte by2;
                                                        byte by3;
                                                        block23: {
                                                            block28: {
                                                                sb2 = (sb)fb.ae.elementAt(n7);
                                                                n5 = bl3 ? 1 : 0;
                                                                if (bl) break block22;
                                                                if (n5 == 0 ? sb2.o == -1 && q3.x != -1 : sb2.o != q3.x || fb.i() && q3 == fb.Pd && !sb2.i) break block27;
                                                                ++n6;
                                                                if (q.b((int)sb2.c, (int)sb2.d, 0, null) != null) break block28;
                                                                if (n3 == 1 && ++n4 == n2) {
                                                                    q3.b(sb2.c, sb2.d, true);
                                                                    return new byte[]{sb2.c, sb2.d};
                                                                }
                                                                break block27;
                                                            }
                                                            if (!bl4) break block27;
                                                            by3 = sb2.d;
                                                            by2 = sb2.c;
                                                            if (!fb.M && !fb.i() || fb.bf == null) break block24;
                                                            qArray = q.b((int)by2, (int)by3, 0, null);
                                                            if (qArray == null) break block29;
                                                            n11 = 0;
                                                            for (by = 0; by < 4; by = (byte)(by + 1)) {
                                                                n10 = y.b((int)y.b(by, by2), (int)y.c(by, by3));
                                                                if (!bl) {
                                                                    if (n10 == 0) continue;
                                                                    n11 = (byte)(n11 + 1);
                                                                    if (!bl) continue;
                                                                }
                                                                break block23;
                                                            }
                                                            n10 = n11;
                                                        }
                                                        if (n10 != 0) {
                                                            int n12 = 0;
                                                            while (n12 < qArray.length) {
                                                                byte by4;
                                                                block25: {
                                                                    int n9 = qArray[n12].mb;
                                                                    n9 = 1;
                                                                    if (bl) continue block2;
                                                                    if (n8 == n9) break block24;
                                                                    by = (byte)ab.oc.nextInt(n11);
                                                                    byte by5 = 0;
                                                                    for (byte by6 = 0; by6 < 4; by6 = (byte)(by6 + 1)) {
                                                                        by4 = y.b((int)y.b(by6, by2), (int)y.c(by6, by3)) ? 1 : 0;
                                                                        if (!bl) {
                                                                            if (by4 == 0) continue;
                                                                            if (by5 == by) {
                                                                                qArray[n12].b(by2, by3, by6, (byte)5, false, false, false, (byte)0, (byte)-1, (byte)0, (byte)0);
                                                                                if (!bl) break;
                                                                            }
                                                                            by5 = (byte)(by5 + 1);
                                                                            if (!bl) continue;
                                                                        }
                                                                        break block25;
                                                                    }
                                                                    by4 = (byte)(n12 + 1);
                                                                }
                                                                n12 = by4;
                                                                if (!bl) continue;
                                                            }
                                                        }
                                                        break block24;
                                                    }
                                                    bl6 = true;
                                                    break block30;
                                                }
                                                bl6 = false;
                                            }
                                            if (bl6) {
                                                q3.b(sb2.c, sb2.d, true);
                                                return new byte[]{sb2.c, sb2.d};
                                            }
                                            q3.ic = fb.kb + 50L;
                                        }
                                        ++n7;
                                        if (!bl) continue block1;
                                    }
                                    break;
                                }
                                n5 = n3;
                            }
                            if (n5 != 0) break block31;
                            if (n4 != 0) break block32;
                            if (n6 == 0) break block33;
                            n3 = 3;
                            bl4 = true;
                            n2 = 0;
                            if (!bl) break block33;
                        }
                        n2 = 1 + ab.oc.nextInt(n4);
                        if (!bl) break block33;
                    }
                    if (n3 == 3) break;
                }
                ++n3;
            } while (!bl);
        }
        return null;
    }

    private void b() {
        boolean bl = ab.xc;
        if (Vc != null) {
            int n2 = 0;
            while (n2 < Vc.length) {
                int n3;
                int n4;
                block4: {
                    for (int n5 = 0; n5 < Vc[0].length; n5 = (int)((byte)(n5 + 1))) {
                        n4 = Vc[n2][n5];
                        n3 = this.w;
                        if (!bl) {
                            if (n4 != n3) continue;
                            q.Vc[n2][n5] = 0;
                            if (!bl) continue;
                        }
                        break block4;
                    }
                    n4 = n2;
                    n3 = 1;
                }
                n2 = (byte)(n4 + n3);
                if (!bl) continue;
            }
        }
    }

    private void c() {
        if (Vc != null) {
            if (this.g == -1 && this.h == -1) {
                this.b();
                return;
            }
            byte by = y.b(this.ub, this.g);
            byte by2 = y.c(this.ub, this.h);
            this.b();
            if (q.b(by, by2) && Vc[by][by2] == 0) {
                q.Vc[by][by2] = this.w;
            }
        }
    }

    public final void b(int n2, int n3, int n4, boolean bl) {
        if ((fb.M || fb.i()) && (fb.M && this.r == 0 || fb.i() && this == fb.Pd) && fb.kb - this.jc <= this.kc) {
            return;
        }
        if (this.r == 4 && n4 == 12) {
            n2 <<= 1;
        }
        if ((this.fb || this.kb) && n2 > 1) {
            n2 /= 2;
        }
        if (n2 <= 0) {
            return;
        }
        this.b(this.nc - n2, n3, n4, true, false);
        this.xc = bl;
        if (this.Cc != null) {
            this.Cc.g();
        }
    }

    public final void b(int n2, int n3, int n4, boolean bl, boolean bl2) {
        this.rc = n2;
        this.sc = n3;
        this.tc = n4;
        this.vc = bl;
        this.wc = bl2;
        this.xc = false;
        this.uc = true;
    }

    public final void b(byte object, byte object2, boolean bl, boolean bl2) {
        block35: {
            block36: {
                boolean bl3 = ab.xc;
                if (!this.n()) {
                    return;
                }
                this.nc = 0;
                this.rc = 0;
                this.uc = false;
                this.b(true);
                if ((fb.i() || fb.M) && fb.M) {
                    q q2 = this;
                    q q3 = q2;
                    q3 = this;
                    fb.I.b(this.w, q2.c / 10, q3.d / 10, (byte)object, (byte)object2, bl, bl2);
                    if (this.Cc == null && object != -1 && object != this.w && fb.I.e((byte)object)) {
                        int n2;
                        int n3;
                        int n4;
                        int n5;
                        int[] nArray;
                        Object object3;
                        block33: {
                            object = -1;
                            object2 = 0;
                            object3 = this;
                            nArray = new int[2];
                            n5 = -1;
                            n4 = -1;
                            int n6 = 0;
                            int n7 = 0;
                            for (n3 = 0; n3 < 2; ++n3) {
                                int n8;
                                block34: {
                                    n2 = 0;
                                    if (bl3) break block33;
                                    for (int i2 = v142115; i2 < ((q)object3).Yb.length; ++i2) {
                                        n8 = ((q)object3).Yb[i2];
                                        if (!bl3) {
                                            if (n8 <= 0 || i2 == 0 || n3 != 1 || n7 != ++n6) continue;
                                            n5 = i2;
                                            n4 = ((q)object3).Yb[i2];
                                            if (!bl3) break;
                                            if (!bl3) continue;
                                        }
                                        break block34;
                                    }
                                    n8 = n3;
                                }
                                if (n8 != 0) continue;
                                if (n6 == 0) break;
                                n7 = 1;
                                n6 = 0;
                                if (!bl3) continue;
                            }
                            n3 = -1;
                            n2 = n5;
                        }
                        if (n2 != -1 && n4 != -1) {
                            n3 = n4 / 2;
                            if (n3 * hb.d[n5] / hb.b[n5] > 100) {
                                n3 = 100 * hb.b[n5] / hb.d[n5];
                            }
                            if (n3 > n4) {
                                n3 = n4;
                            }
                            ((q)object3).b((byte)n5, ((q)object3).Yb[n5] - n3, false);
                        }
                        nArray[0] = n5;
                        nArray[1] = n3;
                        object3 = nArray;
                        if (nArray != null) {
                            object = object3[0];
                            object2 = object3[1];
                        }
                        if (object != -1 && object2 > 0) {
                            object3 = new s(16, this.g, this.h, false);
                            new s(16, this.g, this.h, false).K = object;
                            ((s)object3).L = object2;
                            fb.I.d((byte)16, this.g, this.h);
                            ab.b(object, -object2);
                        }
                    }
                }
                this.hc = true;
                if (fb.Pd == this) {
                    fb.I.e();
                    if (fb.i()) {
                        this.nb = this.g;
                        this.ob = this.h;
                    }
                }
                if (fb.Pd == this) {
                    fb.b(null, fb.i());
                }
                this.Gc.b();
                this.S = 0;
                this.mb = (byte)-1;
                q q4 = this;
                if (q4.S != -1) {
                    if (q4.r == 0 && q4.S == 0) {
                        q q5 = q4;
                        q q6 = q5;
                        q6 = q4;
                        new w(fb.yb, q5.c / 10, q6.d / 10, 2, false, 2);
                    }
                    if (q4.p() && q4.S == 0) {
                        q q7 = q4;
                        q q8 = q7;
                        q8 = q4;
                        new w(fb.gd, q7.c / 10, q8.d / 10, 2, false, 2);
                    }
                    if (q4.r == 3 && fb.Tc != null) {
                        q q9 = q4;
                        q q10 = q9;
                        q10 = q4;
                        new w(fb.Tc, q9.c / 10, q10.d / 10, 2, false, 2);
                    }
                    if (q4.r == 4) {
                        if (fb.Gc != null) {
                            q q11 = q4;
                            q q12 = q11;
                            q12 = q4;
                            new w(fb.Gc, q11.c / 10, q12.d / 10, 2, false, 1);
                        }
                        if (fb.Jc != null) {
                            q q13 = q4;
                            q q14 = q13;
                            q14 = q4;
                            new w(fb.Jc, q13.c / 10, q14.d / 10 - 10, 2, false, 2);
                        }
                        if (fb.nd != null) {
                            q q15 = q4;
                            q q16 = q15;
                            q16 = q4;
                            new d(fb.nd, (byte)ab.oc.nextInt(fb.nd.h), q15.c / 10, q16.d / 10, ab.rc);
                        }
                        if (fb.Lc != null) {
                            q q17 = q4;
                            q q18 = q17;
                            q18 = q4;
                            new r(null, q17.c / 10, q18.d / 10 - 10, 0, 0, 10, 50, new t(0, fb.Lc, 5, 0, 0, 4, 0));
                        }
                    }
                    if (q4.r == 9 && fb.td != null) {
                        q q19 = q4;
                        q q20 = q19;
                        q20 = q4;
                        new w(fb.td, q19.c / 10, q20.d / 10, 2, false, 2);
                    }
                    if (fb.zc != null) {
                        q q21 = q4;
                        q q22 = q21;
                        q22 = q4;
                        new d(fb.zc, 0, q21.c / 10, q22.d / 10, ab.sc);
                    }
                    if (ab.Jb) {
                        // empty if block
                    }
                }
                this.g();
                this.ic = fb.kb;
                if (!o.c(this.g, this.h) || !this.f()) break block35;
                if (ab.oc.nextInt(2) != 0) break block36;
                ab.G.b(ab.L, 0);
                if (!bl3) break block35;
            }
            ab.G.b(ab.M, 0);
        }
        if (fb.i() && this.lc) {
            if (this.x != 0 && this.r != 2) {
                ++W;
            }
            q q23 = this;
            this.V = true;
            return;
        }
        ++this.X;
    }

    private boolean f() {
        return this.r != 4;
    }

    public final void g() {
        this.d((byte)-1, (byte)-1);
        this.b();
    }

    private void c(int n2) {
        boolean bl = ab.xc;
        if (ab.w) {
            return;
        }
        this.Rc = fb.kb + (long)n2;
        this.Pc = true;
        this.Ic.b((byte)0, (byte)1);
        this.Jc.b((byte)0, (byte)1);
        this.Kc.b((byte)0, (byte)1);
        for (n2 = 0; n2 < this.Sc.length; n2 = (int)((byte)(n2 + 1))) {
            if (this.Uc[n2] == 2) {
                this.Tc[n2] = 7;
                this.Sc[n2] = 0;
                if (!bl) continue;
            }
            if (this.Uc[n2] != 1) continue;
            this.Tc[n2] = 15;
            this.Sc[n2] = 8;
            if (!bl) continue;
        }
    }

    private void b(boolean n2) {
        block31: {
            int n3;
            byte[] byArray;
            int n4;
            boolean bl;
            block30: {
                int n5;
                bl = ab.xc;
                if (ab.w) {
                    n2 = 0;
                }
                if ((n5 = this.nc - this.mc) < 0) {
                    n5 = 0;
                }
                n4 = 30;
                int n6 = this.mc / 30;
                if (n6 < 2) {
                    n6 = 2;
                    n4 = this.mc / 2;
                    if (n4 == 0) {
                        n4 = 1;
                    }
                }
                byArray = null;
                if (n2 != 0) {
                    byArray = new byte[this.Uc.length];
                }
                int n7 = this.nc / n4;
                boolean bl2 = this.nc % n4 != 0;
                int n8 = n5 / 30;
                boolean bl3 = n5 % n4 != 0;
                for (n4 = 0; n4 < this.Uc.length; ++n4) {
                    n3 = n2;
                    if (!bl) {
                        if (n3 != 0) {
                            byArray[n4] = this.Uc[n4];
                        }
                        if (n4 < n6) {
                            if (n7 > 0) {
                                this.Uc[n4] = 2;
                                --n7;
                                if (!bl) continue;
                            }
                            if (bl2) {
                                this.Uc[n4] = 1;
                                bl2 = false;
                                if (!bl) continue;
                            }
                            this.Uc[n4] = 0;
                            if (!bl) continue;
                        }
                        if (n4 >= 6 && n5 > 0) {
                            if (n8 > 0) {
                                this.Uc[n4] = 2;
                                --n8;
                                if (!bl) continue;
                            }
                            if (bl3) {
                                this.Uc[n4] = 1;
                                bl3 = false;
                                if (!bl) continue;
                            }
                            this.Uc[n4] = 0;
                            if (!bl) continue;
                        }
                        this.Uc[n4] = -1;
                        if (!bl) continue;
                    }
                    break block30;
                }
                n3 = n2;
            }
            if (n3 == 0 || byArray == null) break block31;
            for (n4 = 0; n4 < byArray.length; ++n4) {
                block35: {
                    block36: {
                        block32: {
                            block34: {
                                block33: {
                                    n2 = (byte)(byArray[n4] - this.Uc[n4]);
                                    if (byArray[n4] == -1 && byArray[n4] != this.Uc[n4]) {
                                        if (n2 == -2) {
                                            n2 = -1;
                                        }
                                        if (n2 == -3) {
                                            n2 = -2;
                                        }
                                    }
                                    if (this.Uc[n4] == -1 && byArray[n4] != this.Uc[n4]) {
                                        if (n2 == 2) {
                                            n2 = 1;
                                        }
                                        if (n2 == 3) {
                                            n2 = 2;
                                        }
                                    }
                                    if (n2 == 2) {
                                        this.a(n4, false);
                                        this.Tc[n4] = -1;
                                        this.Sc[n4] = -1;
                                    }
                                    if (n2 != 1) break block32;
                                    this.a(n4, true);
                                    if (this.Uc[n4] != 0) break block33;
                                    this.Tc[n4] = -1;
                                    if (!bl) break block34;
                                }
                                this.Tc[n4] = 8;
                            }
                            this.Sc[n4] = -1;
                        }
                        if (n2 != -1) break block35;
                        if (this.Uc[n4] != 2) break block36;
                        n2 = -2;
                        if (!bl) break block35;
                    }
                    this.Tc[n4] = 15;
                    this.Sc[n4] = 8;
                }
                if (n2 != -2) continue;
                this.Tc[n4] = 7;
                this.Sc[n4] = 0;
                if (!bl) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void a(int var1_1, boolean var2_3) {
        var7_4 = ab.xc;
        var4_5 = 0;
        var5_6 = this.Uc[6] != -1;
        var6_7 = false;
        if (var1_1 < 6) ** GOTO lbl-1000
        var4_5 = 3;
        var1_1 -= 6;
        var6_7 = true;
        if (var7_4) lbl-1000:
        // 4 sources

        {
            for (var3_8 = 0; var3_8 < this.Uc.length; ++var3_8) {
                v0 = this.Uc[var3_8];
                v1 = -1;
                if (!var7_4) {
                    if (v0 == v1) continue;
                    var4_5 = (byte)(var4_5 + 1);
                    if (!var7_4) continue;
                }
                break;
            }
        } else {
            v0 = this.Nc;
            v1 = (var1_1 - var4_5 / 2) * 7;
        }
        var3_8 = v0 + v1;
        var1_2 = new w(fb.hc, var3_8, this.Oc + (var5_6 != false ? 5 * (var6_7 != false ? 1 : -1) : 0), 0, true, 1);
        if (var2_3) {
            var1_2.h.j = (byte)8;
        }
    }

    public final boolean b(byte by, byte by2, byte by3) {
        q q2;
        boolean bl = ab.xc;
        if (this.r == 4) {
            return false;
        }
        switch (by3) {
            case 0: {
                by2 = (byte)(by2 + 1);
                if (!bl) break;
            }
            case 1: {
                by = (byte)(by - 1);
                if (!bl) break;
            }
            case 2: {
                by2 = (byte)(by2 - 1);
                if (!bl) break;
            }
            case 3: {
                by = (byte)(by + 1);
            }
        }
        if (this.Fc && (by <= 0 || by2 <= 0 || by >= fb.Pe - 1 || by2 >= fb.Qe - 1)) {
            return false;
        }
        if (this.Dc && fb.Re != null && fb.Re[by][by2].d != null) {
            return false;
        }
        if (this.Ec && Vc != null && Vc[by][by2] != 0 && Vc[by][by2] != this.w) {
            if (this.r == 9) {
                q q3;
                if (this.Cc != null && (q3 = q.d(Vc[by][by2])) != null && !this.Cc.b(q3)) {
                    return false;
                }
            } else {
                if (fb.i()) {
                    boolean bl2;
                    block16: {
                        for (by3 = 0; by3 < 4; by3 = (byte)(by3 + 1)) {
                            this.nb = y.b(by3, this.g);
                            this.ob = y.c(by3, this.h);
                            bl2 = q.b(this.nb, this.ob);
                            if (!bl) {
                                if (!bl2 || Vc[this.nb][this.ob] != 0 || j.c(this.nb, this.ob)) continue;
                                return false;
                            }
                            break block16;
                        }
                        bl2 = true;
                    }
                    return bl2;
                }
                return false;
            }
        }
        return Vc == null || Vc[by][by2] == 0 || Vc[by][by2] == this.w || (q2 = q.d(Vc[by][by2])) == null || q2.r != 4;
    }

    public final boolean b(byte by, boolean bl) {
        block11: {
            boolean bl2;
            block14: {
                block16: {
                    block15: {
                        boolean bl3;
                        block13: {
                            block12: {
                                bl3 = ab.xc;
                                if (this.hc) {
                                    return false;
                                }
                                if (by < 0 || by > 3) {
                                    return false;
                                }
                                if (this.qb != 0) break block11;
                                bl2 = false;
                                if (!bl) break block12;
                                this.vb = this.wb;
                                if (!bl3) break block13;
                            }
                            this.vb = 0;
                        }
                        if (by != this.ub) {
                            this.a(by);
                            this.ub = by;
                            if (!bl) {
                                this.qb = 1;
                                return true;
                            }
                            bl2 = true;
                        }
                        if (!this.b(this.g, this.h, this.ub)) break block14;
                        this.D = this.g + ab.gb[by];
                        this.E = this.h + ab.hb[by];
                        if (!bl) {
                            this.rb = false;
                        }
                        this.qb = (byte)2;
                        if (bl) break block15;
                        this.Nb = true;
                        if (!bl3) break block16;
                    }
                    this.Nb = false;
                }
                this.c();
                return fb.Pd != this || s.B == null || !q.b(by = y.b(this.ub, this.g), (bl = y.c(this.ub, this.h)) ? 1 : 0) || s.B[by][bl] != 1 || s.b(by, bl ? 1 : 0) == null || !this.b(false, by, bl ? 1 : 0, false, true);
            }
            return bl2;
        }
        return false;
    }

    private void a(byte by) {
        if (this.ub != by && this.r != 9) {
            byte by2 = (byte)(4 * G);
            boolean bl = Math.abs(by - this.ub) / (by - this.ub) == -1;
            if ((by = (byte)(Math.abs(by - this.ub) * G)) == G * 3) {
                by = (byte)G;
                bl = !bl;
            }
            this.Gc.b(null, this.Gc.j, (byte)0, (byte)(by2 - 1), by, false, bl, this.O);
        }
    }

    public final void i() {
        this.rb = true;
    }

    public final void j() {
        boolean bl = ab.xc;
        this.xb = 0;
        this.d(this.g, this.h);
        if (this.qb == 3) {
            this.wb = this.zb;
            if (!this.Tb) {
                this.hc = false;
            }
            if (fb.M || fb.i()) {
                this.gc = false;
                if (this.Cb != 0) {
                    this.b(this.Cb, this.Db, -1, false);
                    this.Cb = 0;
                }
            }
        }
        this.m = 0;
        this.l = 0;
        this.vb = 0;
        this.qb = 0;
        this.Gc.b();
        switch (this.ub) {
            case 0: {
                this.Gc.j = 0;
                if (!bl) break;
            }
            case 1: {
                this.Gc.j = (byte)3;
                if (!bl) break;
            }
            case 2: {
                this.Gc.j = (byte)6;
                if (!bl) break;
            }
            case 3: {
                this.Gc.j = (byte)9;
            }
        }
        this.rb = false;
    }

    public final void d(byte by, byte by2) {
        this.D = by;
        this.E = by2;
        if (Vc != null) {
            this.b();
            if (q.b(by, by2) && Vc[by][by2] == 0) {
                q.Vc[by][by2] = this.w;
            }
        }
        super.d(by, by2);
    }

    public final void c(byte by, boolean bl) {
        this.ub = by;
        if (bl && this.n() && this.Gc != null) {
            this.Gc.j = H[by];
        }
    }

    public final byte k() {
        if (this.qb == 3) {
            return this.yb;
        }
        return this.ub;
    }

    public final byte l() {
        if (this.Gc.j < 3) {
            return 0;
        }
        if (this.Gc.j < 6) {
            return 1;
        }
        if (this.Gc.j < 9) {
            return 2;
        }
        if (this.Gc.j < 12) {
            return 3;
        }
        if (this.Gc.j < 17) {
            return 0;
        }
        if (this.Gc.j < 22) {
            return 1;
        }
        if (this.Gc.j < 27) {
            return 2;
        }
        if (this.Gc.j < 32) {
            return 3;
        }
        return 0;
    }

    public static q b(int n2, int n3, q q2, int n4, int n5) {
        q q3;
        boolean bl = ab.xc;
        q2 = null;
        if (fb.Qd != null && fb.Qd.size() != 0) {
            n4 = n5 == -1 ? 999999999 : n5;
            for (int i2 = 0; i2 < fb.Qd.size(); ++i2) {
                q3 = (q)fb.Qd.elementAt(i2);
                if (!bl) {
                    q q4;
                    if (q3 == null || !q4.n() || q4.r()) continue;
                    q q5 = q4;
                    q q6 = q5;
                    q6 = q4;
                    n5 = o.b(n2, n3, q5.c / 10, q6.d / 10);
                    if (n5 >= n4) continue;
                    q2 = q4;
                    n4 = n5;
                    if (!bl) continue;
                }
                break;
            }
        } else {
            q3 = q2;
        }
        return q3;
    }

    public static q d(int n2) {
        boolean bl = ab.xc;
        if (fb.Qd != null) {
            for (int i2 = 0; i2 < fb.Qd.size(); ++i2) {
                q q2 = (q)fb.Qd.elementAt(i2);
                if (q2.w != n2) continue;
                return q2;
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static q[] b(int n2, int n3, int n4, q q2) {
        boolean bl = ab.xc;
        if (fb.Qd == null) {
            return null;
        }
        q[] qArray = null;
        int n5 = 0;
        for (int n6 = 0; n6 < 2; n6 = (int)((byte)(n6 + 1))) {
            n5 = 0;
            block5: for (int n7 = 0; n7 < fb.Qd.size(); n7 = (int)((byte)(n7 + 1))) {
                q q3 = (q)fb.Qd.elementAt(n7);
                if (q3 == null || q3.g != n2 || q3.h != n3) continue;
                switch (n4) {
                    case 1: {
                        if (q3.n()) break;
                        continue block5;
                    }
                    case 2: 
                    case 3: {
                        if (!q3.n() || q3.r() || q2 != null && q2 != q3 && (!ab.n || fb.i()) && (q3.x == q2.x || q3.ib && n4 == 3)) continue block5;
                    }
                }
                if (n6 == 1) {
                    qArray[n5] = q3;
                }
                n5 = (byte)(n5 + 1);
                if (!bl) continue;
            }
            if (n6 != 0) continue;
            if (n5 == 0) {
                return null;
            }
            qArray = new q[n5];
            if (!bl) continue;
        }
        return qArray;
    }

    public final void b(byte by, byte by2, byte by3, byte by4, boolean bl, boolean bl2, boolean bl3, byte by5, byte by6, byte by7, byte by8) {
        block45: {
            block47: {
                boolean bl4;
                block46: {
                    byte by9;
                    byte by10;
                    block36: {
                        block44: {
                            s s2;
                            block41: {
                                block43: {
                                    block42: {
                                        block40: {
                                            block39: {
                                                int n2;
                                                block37: {
                                                    block38: {
                                                        bl4 = ab.xc;
                                                        if (by4 <= 0) {
                                                            return;
                                                        }
                                                        if (!fb.M && !fb.i()) break block37;
                                                        if (!bl) break block38;
                                                        while (by4 > 0) {
                                                            n2 = 0;
                                                            by10 = by;
                                                            by9 = by2;
                                                            if (!bl4) {
                                                                byte[] byArray = fb.b(by10, by9, by3, by4);
                                                                if (byArray != null) {
                                                                    g g2 = g.b(byArray[0], byArray[1]);
                                                                    if (g2 != null && g2.d == 6) {
                                                                        n2 = 1;
                                                                    }
                                                                    if (n2 != 0 || this.b(byArray[0], byArray[1], (byte)-1)) break;
                                                                    by4 = (byte)(by4 - 1);
                                                                    if (!bl4) continue;
                                                                }
                                                                return;
                                                            }
                                                            break block36;
                                                        }
                                                        if (!bl4) break block37;
                                                    }
                                                    if (!this.b(this.g, this.h, by3)) {
                                                        return;
                                                    }
                                                }
                                                if (by4 <= 0) {
                                                    return;
                                                }
                                                this.j();
                                                this.Gb = 0;
                                                this.Hb = 0;
                                                this.Ib = 0;
                                                this.d(by, by2);
                                                this.zb = this.wb;
                                                this.yb = by3;
                                                this.Eb = this.r == 9 ? false : bl3;
                                                this.wb = F;
                                                if (!bl) break block39;
                                                if (by4 >= 17) break block40;
                                                n2 = 5;
                                                if (bl2) {
                                                    n2 = 9;
                                                }
                                                this.wb = n2 * (by4 + 1);
                                                if (!bl4) break block40;
                                            }
                                            this.wb += by5 * 10;
                                        }
                                        if (bl) {
                                            this.c(by3, false);
                                        }
                                        this.Bb = bl;
                                        this.Ab = by4;
                                        this.Db = by6;
                                        this.Gb = 0;
                                        if (bl) {
                                            int n3 = by4 * 10 * 30 / this.wb;
                                            if (n3 <= 0) {
                                                n3 = 1;
                                            }
                                            int n4 = n3 * 3 / 2;
                                            this.b(n4, 3);
                                        }
                                        this.qb = (byte)3;
                                        if (!fb.M && !fb.i()) break block41;
                                        if (this.Cc == null && fb.Pd != this) break block42;
                                        this.hc = true;
                                        if (!bl4) break block43;
                                    }
                                    this.gc = true;
                                }
                                if (!fb.M) break block44;
                                fb.I.b(this.w, by, by2, by3, by4, bl, bl2, bl3, by5, by6, by7, by8);
                                if (!bl4) break block44;
                            }
                            if (fb.Pd == this) {
                                this.hc = true;
                            }
                            if ((s2 = s.b(by, by2)) != null && s2.u == 1) {
                                s2.t.b(false, false, (byte)2);
                            }
                        }
                        by10 = this.g;
                        by9 = this.h;
                    }
                    if (!o.c(by10, by9)) break block45;
                    if (by7 != 1) break block46;
                    ab.G.b(ab.N, 0);
                    if (!bl4) break block45;
                }
                if (by7 != 2) break block47;
                ab.G.b(ab.P, 0);
                if (!bl4) break block45;
            }
            if (by7 == 2) {
                ab.G.b(ab.P, 0);
            }
        }
        if (by8 == 1) {
            this.hb = true;
            return;
        }
        if (by8 == 2) {
            this.Fb = (byte)2;
        }
    }

    public final void a(byte by, byte by2) {
        if (q.b(by, by2) && y.b((int)by, (int)by2)) {
            this.mb = (byte)2;
            this.nb = by;
            this.ob = by2;
            this.O = 1;
            this.Rb = (byte)-1;
            this.ub = 0;
            this.N = 0;
            this.wb = t;
            this.M = 0;
            this.pc = 25;
            this.Hc.j = (byte)8;
            this.Qb = true;
            this.pb = fb.kb;
        }
    }

    public final boolean m() {
        return this.mb == -1;
    }

    public final boolean n() {
        return this.mb == 0;
    }

    private boolean o() {
        return this.r == 0 || this.p();
    }

    private boolean p() {
        return this.r == 1 || this.r == 7 || this.r == 5 || this.r == 6 || this.r == 8;
    }

    public final boolean q() {
        byte by;
        hb[] hbArray;
        byte by2;
        byte by3;
        int n2;
        boolean bl;
        block20: {
            block21: {
                block17: {
                    block19: {
                        block18: {
                            bl = ab.xc;
                            rc.k = false;
                            n2 = y.b(this.ub, this.g);
                            if (!o.b((byte)n2, by3 = y.c(this.ub, this.h))) {
                                return false;
                            }
                            by2 = 0;
                            if (fb.Re == null) {
                                return false;
                            }
                            if (fb.Re[n2][by3].d == null) break block17;
                            if (fb.Re[n2][by3].d.A) {
                                by2 = fb.Re[n2][by3].d.N;
                            }
                            if (!q.b((byte)(n2 - 1), by3) || fb.Re[n2 - 1][by3].d == null || !fb.Re[n2 - 1][by3].d.D) break block18;
                            by2 = fb.Re[n2 - 1][by3].d.N ? 1 : 0;
                            rc.k = true;
                            if (!bl) break block17;
                        }
                        if (!fb.Re[n2][by3].d.D) break block19;
                        by2 = fb.Re[n2][by3].d.N ? 1 : 0;
                        rc.k = true;
                        if (!bl) break block17;
                    }
                    rc.k = false;
                }
                if (by2 != 0 || by2 != 0 || !q.b((byte)(n2 - 1), (byte)(by3 - 1)) || !q.b((byte)(n2 - 2), (byte)(by3 - 1))) break block20;
                if (fb.Re[n2 - 1][by3 - 1].d == null || !fb.Re[n2 - 1][by3 - 1].d.C) break block21;
                by2 = fb.Re[n2 - 1][by3 - 1].d.N ? 1 : 0;
                if (!bl) break block20;
            }
            if (fb.Re[n2 - 2][by3 - 1].d != null && fb.Re[n2 - 2][by3 - 1].d.C) {
                by2 = fb.Re[n2 - 2][by3 - 1].d.N ? 1 : 0;
            }
        }
        if (!(by2 != 0 || (hbArray = s.b((byte)n2, by3)) == null || !hbArray.y || hbArray.u != 4 && hbArray.u != 10 && hbArray.u != 7 || fb.Re[n2][by3].d != null && fb.Re[n2][by3].d.c != -1)) {
            by2 = 1;
        }
        if (by2 == 0 && (hbArray = hb.b(n2, (int)by3)) != null) {
            for (n2 = 0; n2 < hbArray.length; ++n2) {
                by = hbArray[n2].o;
                if (!bl) {
                    if (by != 11) continue;
                    by2 = 1;
                    if (!bl) break;
                    if (!bl) continue;
                }
                break;
            }
        } else {
            by = by2;
        }
        return by != 0;
    }

    public final boolean b(boolean by, byte by2, byte by3, boolean bl, boolean bl2) {
        byte by4;
        boolean bl3;
        boolean bl4;
        block42: {
            block44: {
                hb[] hbArray;
                s s2;
                int n2;
                boolean bl5;
                block46: {
                    block49: {
                        block47: {
                            block48: {
                                block43: {
                                    block45: {
                                        bl5 = ab.xc;
                                        if (by == 0 && by2 == -1 && by3 == -1) {
                                            by2 = y.b(this.ub, this.g);
                                            by3 = y.c(this.ub, this.h);
                                            if (bl5) {
                                                // empty if block
                                            }
                                        }
                                        if (!o.b(by2, by3)) {
                                            return false;
                                        }
                                        bl4 = false;
                                        if (fb.M || fb.i()) {
                                            bl4 = true;
                                            by = 1;
                                            if (fb.Zd != null) {
                                                for (n2 = 0; n2 < fb.Zd.size(); ++n2) {
                                                    v v2 = (v)fb.Zd.elementAt(n2);
                                                    if (v2 == null || v2.q || !v2.v || !v2.b(by2, by3) || !v2.d(this)) continue;
                                                    v2.b(this);
                                                    if (!bl5) continue;
                                                }
                                            }
                                        }
                                        bl3 = false;
                                        if (!bl) break block43;
                                        if (hb.Q == null) break block44;
                                        if (!hb.Q[by2][by3]) break block45;
                                        hb[] hbArray2 = hb.c((int)by2, (int)by3);
                                        if (hbArray2 != null) {
                                            if (by != 0) {
                                                if (fb.M && (by2 != this.g || by3 != this.h)) {
                                                    this.d(by2, by3);
                                                }
                                                for (int n3 = 0; n3 < hbArray2.length; n3 = (int)((byte)(n3 + 1))) {
                                                    hbArray2[n3].z = this;
                                                    hbArray2[n3].b(by2, by3, true);
                                                    if (!bl5) {
                                                        if (!bl5) continue;
                                                    }
                                                    break;
                                                }
                                            } else {
                                                bl3 = true;
                                            }
                                        }
                                        if (!bl5) break block44;
                                    }
                                    return false;
                                    break block44;
                                }
                                if (fb.Re == null) {
                                    return false;
                                }
                                boolean bl6 = true;
                                n2 = 1;
                                if (bl2) {
                                    bl6 = false;
                                    n2 = 0;
                                }
                                if (!bl6) break block46;
                                if (fb.Re[by2][by3].d == null) break block47;
                                if (fb.Re[by2][by3].d.A) {
                                    bl3 = fb.Re[by2][by3].d.b(this, by == 0, by != 0 ? !bl4 : false);
                                    if ((by == 0 || fb.i() || fb.M) && fb.Pd == this && !bl3 && fb.Re[by2][by3].d.N && !this.Pc) {
                                        this.c(50);
                                    }
                                }
                                if (!q.b((byte)(by2 - 1), by3) || fb.Re[by2 - 1][by3].d == null || !fb.Re[by2 - 1][by3].d.D) break block48;
                                bl3 = fb.Re[by2 - 1][by3].d.b(this, by == 0, by != 0 ? !bl4 : false);
                                if (!bl5) break block47;
                            }
                            if (fb.Re[by2][by3].d.D) {
                                bl3 = fb.Re[by2][by3].d.b(this, by == 0, by != 0 ? !bl4 : false);
                            }
                        }
                        if (bl3 || bl3 || !q.b((byte)(by2 - 1), (byte)(by3 - 1)) || !q.b((byte)(by2 - 2), (byte)(by3 - 1))) break block46;
                        if (fb.Re[by2 - 1][by3 - 1].d == null || !fb.Re[by2 - 1][by3 - 1].d.C) break block49;
                        bl3 = fb.Re[by2 - 1][by3 - 1].d.b(this, by == 0, by != 0 ? !bl4 : false);
                        if (!bl5) break block46;
                    }
                    if (fb.Re[by2 - 2][by3 - 1].d != null && fb.Re[by2 - 2][by3 - 1].d.C) {
                        bl3 = fb.Re[by2 - 2][by3 - 1].d.b(this, by == 0, by != 0 ? !bl4 : false);
                    }
                }
                if (!bl3 && (s2 = s.b(by2, by3)) != null) {
                    bl3 = s2.b(this);
                    if (!fb.M && !fb.i() && by != 0) {
                        s2.g();
                    }
                }
                if (n2 == 0 || bl3 || (hbArray = hb.b((int)by2, (int)by3)) == null) break block44;
                for (n2 = 0; n2 < hbArray.length; ++n2) {
                    block51: {
                        block50: {
                            by4 = hbArray[n2].o;
                            if (bl5) break block42;
                            if (by4 != 11) continue;
                            if (!fb.M && !fb.i()) break block50;
                            this.b(hbArray[n2].o, this.Yb[hbArray[n2].o] + 1, true);
                            if (fb.M && fb.Pd != null && fb.Pd != this) {
                                fb.I.c(this.w, hbArray[n2].o, this.Yb[hbArray[n2].o]);
                            }
                            hbArray[n2].f();
                            if (!bl5) break block51;
                        }
                        if (by != 0) {
                            hbArray[n2].f();
                        }
                    }
                    bl3 = true;
                    if (!bl5) break;
                    if (!bl5) continue;
                }
            }
            by4 = by;
        }
        if ((by4 == 0 || by != 0 && bl4) && !fb.i() && bl3) {
            fb.I.b(this.w, by2, by3, bl, bl2);
        }
        return bl3;
    }

    public final void e(int n2) {
        int n3;
        block11: {
            boolean bl;
            block10: {
                bl = ab.xc;
                n3 = 0;
                if (!this.o()) break block10;
                n3 = t;
                if (!this.fb) break block11;
                n3 += 20;
                if (!bl) break block11;
            }
            switch (this.r) {
                case 2: {
                    n3 = u;
                    if (!bl) break;
                }
                case 3: {
                    n3 = v;
                    if (!bl) break;
                }
                case 9: {
                    n3 = t;
                }
            }
        }
        if ((n2 = n3 + n2 * 10) > 120) {
            n2 = 120;
        }
        if (this.qb == 3) {
            this.zb = n2;
            return;
        }
        this.wb = n2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int b(byte var1_1, boolean var2_2, byte var3_3, byte var4_4, byte[] var5_5) {
        block163: {
            block162: {
                block145: {
                    block146: {
                        block128: {
                            block129: {
                                block126: {
                                    block127: {
                                        var21_7 = ab.xc;
                                        if (this.fb) {
                                            return 1;
                                        }
                                        if (this.qb == 1) {
                                            return 1;
                                        }
                                        if (this == fb.Pd && !var2_2 || (fb.M || fb.i()) && this.Cc != null) {
                                            var7_8 = var1_1;
                                            var6_13 = this;
                                            if ((var7_8 == 2 ? 30 - 12 * var6_13.ac[3] : (var7_8 == 5 || var7_8 == 6 ? 80 - 16 * var6_13.ac[5] : (var7_8 == 3 || var7_8 == 4 ? 30 - 6 * var6_13.ac[4] : (var7_8 == 9 ? 80 - 40 * var6_13.ac[7] : (var6_14 = var7_8 == 7 || var7_8 == 8 ? 60 - 9 * var6_13.ac[6] : 0))))) > 0 && fb.kb - this.Zb[var1_1] < (long)var6_14) {
                                                return 1;
                                            }
                                            this.Zb[var1_1] = fb.kb;
                                        }
                                        var6_15 = var5_5;
                                        if (!var2_2 || fb.M) {
                                            if (hb.d(var1_1) != false ? this.Jb != false : hb.b((byte)var3_3, var4_4) != false || hb.c((byte)var3_3, var4_4) != false) {
                                                return 1;
                                            }
                                            if (this.Yb[var1_1] == 0) {
                                                return 1;
                                            }
                                            if (this.Yb[var1_1] != -1) {
                                                v0 = var1_1;
                                                this.Yb[v0] = this.Yb[v0] - 1;
                                                if (!var2_2) {
                                                    ab.b(var1_1, -1);
                                                }
                                            }
                                        }
                                        var5_6 = hb.d(var1_1);
                                        if (!o.c(this.g, this.h)) break block126;
                                        if (!hb.d(var1_1)) break block127;
                                        ab.G.b(ab.Y, 0);
                                        if (!var21_7) break block126;
                                    }
                                    ab.G.b(ab.V, 0);
                                }
                                if (var1_1 == 0) {
                                    hb.b((byte)0, (byte)var3_3, var4_4, this, null);
                                }
                                if (var1_1 == 12) {
                                    hb.b((byte)12, (byte)var3_3, var4_4, this, null);
                                }
                                if (var1_1 == 7) {
                                    block124: {
                                        var7_8 = 8;
                                        var8_16 = var3_3;
                                        var9_17 = var4_4;
                                        var11_18 = 1;
                                        while (var11_18 < var7_8) {
                                            var8_16 = y.b(this.ub, (byte)var8_16);
                                            var9_17 = y.c(this.ub, var9_17);
                                            v1 = (byte)o.b((byte)var8_16, var9_17);
                                            if (!var21_7) {
                                                if (v1 == 0) break;
                                                if (fb.bf[var8_16][var9_17] != 0 && (var10_22 = q.b(var8_16, (int)var9_17, 2, this)) != null) {
                                                    for (var12_26 = 0; var12_26 < var10_22.length; ++var12_26) {
                                                        v2 = (byte)y.b(var10_22[var12_26], this);
                                                        if (!var21_7) {
                                                            if (v2 == 0) continue;
                                                            var7_8 = var11_18;
                                                            if (!var21_7) break;
                                                            if (!var21_7) continue;
                                                        }
                                                        break;
                                                    }
                                                } else {
                                                    v2 = (byte)(var11_18 + 1);
                                                }
                                                var11_18 = v2;
                                                if (!var21_7) continue;
                                            }
                                            break block124;
                                        }
                                        var7_8 = (byte)(var7_8 + 1);
                                        v1 = 7;
                                    }
                                    hb.b(v1, (byte)var3_3, var4_4, this, new byte[]{var7_8});
                                }
                                if (var1_1 == 8) {
                                    block125: {
                                        var7_8 = 8;
                                        var8_16 = var3_3;
                                        var9_17 = var4_4;
                                        var10_23 = 0;
                                        var12_26 = 1;
                                        while (var12_26 < var7_8) {
                                            var8_16 = y.b(this.ub, (byte)var8_16);
                                            var9_17 = y.c(this.ub, var9_17);
                                            v3 = (byte)o.b((byte)var8_16, var9_17);
                                            if (!var21_7) {
                                                if (v3 == 0) break;
                                                if (fb.bf[var8_16][var9_17] != 0 && (var11_19 = q.b(var8_16, (int)var9_17, 2, this)) != null) {
                                                    for (var13_27 = 0; var13_27 < var11_19.length; ++var13_27) {
                                                        v4 = (byte)y.b(var11_19[var13_27], this);
                                                        if (!var21_7) {
                                                            if (v4 == 0) continue;
                                                            var7_8 = var12_26;
                                                            var10_23 = var11_19[var13_27].w;
                                                            if (!var21_7) break;
                                                            if (!var21_7) continue;
                                                        }
                                                        break;
                                                    }
                                                } else {
                                                    v4 = (byte)(var12_26 + 1);
                                                }
                                                var12_26 = v4;
                                                if (!var21_7) continue;
                                            }
                                            break block125;
                                        }
                                        var7_8 = (byte)(var7_8 + 1);
                                        v3 = 8;
                                    }
                                    hb.b(v3, (byte)var3_3, var4_4, this, new byte[]{var7_8, var10_23});
                                }
                                if (var1_1 == 11) {
                                    hb.b((byte)11, (byte)var3_3, var4_4, this, null);
                                }
                                if (var1_1 == 2) {
                                    hb.b((byte)2, (byte)var3_3, var4_4, this, null);
                                }
                                if (var1_1 == 3) {
                                    hb.b((byte)3, (byte)var3_3, var4_4, this, null);
                                }
                                if (var1_1 != 5) break block128;
                                if (var2_2 || fb.bf == null) break block129;
                                var7_9 = new byte[]{-1, -1, -1, -1, -1};
                                var10_24 = 0;
                                var11_20 = this.ub;
                                var12_26 = this.g;
                                var13_27 = this.h;
                                block4: while (true) {
                                    var12_26 = y.b(var11_20, var12_26);
                                    var13_27 = y.c(var11_20, var13_27);
                                    v5 = o.b(var12_26, var13_27);
                                    do {
                                        block130: {
                                            block131: {
                                                block142: {
                                                    block144: {
                                                        block143: {
                                                            block135: {
                                                                block132: {
                                                                    block141: {
                                                                        block139: {
                                                                            block140: {
                                                                                block136: {
                                                                                    block137: {
                                                                                        block138: {
                                                                                            if (v5 == 0) break block130;
                                                                                            if (fb.bf[var12_26][var13_27] != 0) break block131;
                                                                                            var12_26 = y.d(var11_20, var12_26);
                                                                                            var13_27 = y.e(var11_20, var13_27);
                                                                                            var9_17 = 0;
                                                                                            var8_16 = 0;
                                                                                            var14_28 = y.b(y.b(var11_20), var12_26);
                                                                                            if (o.b(var14_28, var15_29 = y.c(y.b(var11_20), var13_27)) && fb.bf[var14_28][var15_29] != 0) {
                                                                                                var8_16 = 1;
                                                                                            }
                                                                                            if (o.b(var14_28 = y.b(y.c(var11_20), var12_26), var15_29 = y.c(y.c(var11_20), var13_27)) && fb.bf[var14_28][var15_29] != 0) {
                                                                                                var9_17 = 1;
                                                                                            }
                                                                                            var16_30 = false;
                                                                                            if (var8_16 == 0 || var9_17 == 0) break block132;
                                                                                            for (var20_34 = 0; var20_34 <= 2; var20_34 = (int)((byte)(var20_34 + 1))) {
                                                                                                block134: {
                                                                                                    block133: {
                                                                                                        v6 /* !! */  = (E)fb.bf;
                                                                                                        if (var21_7) ** GOTO lbl368
                                                                                                        if (v6 /* !! */  == null || q.Vc == null) break;
                                                                                                        if (var20_34 != 0) break block133;
                                                                                                        var19_33 = y.b(var11_20);
                                                                                                        if (!var21_7) break block134;
                                                                                                    }
                                                                                                    var19_33 = y.c(var11_20);
                                                                                                }
                                                                                                var14_28 = var12_26;
                                                                                                var15_29 = var13_27;
                                                                                                block7: while (true) {
                                                                                                    var14_28 = y.b(var19_33, var14_28);
                                                                                                    var15_29 = y.c(var19_33, var15_29);
                                                                                                    v7 = o.b(var14_28, var15_29);
                                                                                                    do {
                                                                                                        if (v7) {
                                                                                                            if (q.Vc[var14_28][var15_29] != 0 && (var17_31 = q.b((int)var14_28, (int)var15_29, 2, this)) != null) {
                                                                                                                for (var18_32 = 0; var18_32 < var17_31.length; var18_32 = (int)((byte)(var18_32 + 1))) {
                                                                                                                    v8 = (byte)y.b(var17_31[var18_32], this);
                                                                                                                    if (!var21_7) {
                                                                                                                        if (v8 == 0) continue;
                                                                                                                        var11_20 = var19_33;
                                                                                                                        var16_30 = true;
                                                                                                                        if (!var21_7) break;
                                                                                                                        if (!var21_7) continue;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                }
                                                                                                            } else {
                                                                                                                v8 = fb.bf[var14_28][var15_29];
                                                                                                            }
                                                                                                            if (v8 != 0) continue block7;
                                                                                                        }
                                                                                                        v7 = var16_30;
                                                                                                    } while (var21_7);
                                                                                                    break;
                                                                                                }
                                                                                                if (v7) break;
                                                                                                if (!var21_7) continue;
                                                                                            }
                                                                                            if (var16_30) break block135;
                                                                                            if (this.fc == 0) break block136;
                                                                                            if (this.fc != 1) break block137;
                                                                                            if (ab.oc.nextInt(6) == 0) break block138;
                                                                                            var9_17 = 0;
                                                                                            if (!var21_7) break block139;
                                                                                        }
                                                                                        var8_16 = 0;
                                                                                        if (!var21_7) break block139;
                                                                                    }
                                                                                    if (ab.oc.nextInt(6) != 0) break block140;
                                                                                    var9_17 = 0;
                                                                                    if (!var21_7) break block139;
                                                                                }
                                                                                if (ab.oc.nextInt(2) == 0) break block140;
                                                                                var9_17 = 0;
                                                                                if (!var21_7) break block139;
                                                                            }
                                                                            var8_16 = 0;
                                                                        }
                                                                        if (var9_17 == 0) break block141;
                                                                        this.fc = 1;
                                                                        if (!var21_7) break block135;
                                                                    }
                                                                    this.fc = (byte)-1;
                                                                    if (!var21_7) break block135;
                                                                }
                                                                this.fc = 0;
                                                            }
                                                            if (var16_30) break block142;
                                                            if (var8_16 == 0) break block143;
                                                            var11_20 = y.b(var11_20);
                                                            if (!var21_7) break block142;
                                                        }
                                                        if (var9_17 == 0) break block144;
                                                        var11_20 = y.c(var11_20);
                                                        if (!var21_7) break block142;
                                                    }
                                                    var11_20 = y.d(var11_20);
                                                }
                                                v9 = var10_24;
                                                var10_24 = (byte)(var10_24 + 1);
                                                var7_9[v9] = var11_20;
                                            }
                                            if (var10_24 < var7_9.length) continue block4;
                                        }
                                        v5 = var10_24;
                                    } while (var21_7);
                                    break;
                                }
                                if (v5 > 0) {
                                    var6_15 = var7_9;
                                }
                            }
                            hb.b((byte)5, (byte)var3_3, var4_4, this, var6_15);
                        }
                        if (var1_1 == 10) {
                            hb.b((byte)10, (byte)var3_3, var4_4, this, null);
                        }
                        if (var1_1 == 9) {
                            hb.b((byte)9, (byte)var3_3, var4_4, this, null);
                        }
                        if (var1_1 == 13) {
                            hb.b((byte)13, (byte)var3_3, var4_4, this, null);
                        }
                        if (var1_1 == 1) {
                            hb.b((byte)1, (byte)var3_3, var4_4, this, null);
                        }
                        if (var1_1 == 4) {
                            hb.b((byte)4, (byte)var3_3, var4_4, this, null);
                        }
                        if (var1_1 != 6) break block145;
                        if (var2_2 || fb.bf == null) break block146;
                        var7_10 = new byte[]{-1, -1, -1, -1, -1};
                        var10_25 = 0;
                        var11_21 = this.ub;
                        var12_26 = this.g;
                        var13_27 = this.h;
                        block10: while (true) {
                            var12_26 = y.b(var11_21, var12_26);
                            var13_27 = y.c(var11_21, var13_27);
                            v10 = o.b(var12_26, var13_27);
                            do {
                                block147: {
                                    block148: {
                                        block159: {
                                            block161: {
                                                block160: {
                                                    block152: {
                                                        block149: {
                                                            block158: {
                                                                block156: {
                                                                    block157: {
                                                                        block153: {
                                                                            block154: {
                                                                                block155: {
                                                                                    if (v10 == 0) break block147;
                                                                                    if (fb.bf[var12_26][var13_27] != 0) break block148;
                                                                                    var12_26 = y.d(var11_21, var12_26);
                                                                                    var13_27 = y.e(var11_21, var13_27);
                                                                                    var9_17 = 0;
                                                                                    var8_16 = 0;
                                                                                    var14_28 = y.b(y.b(var11_21), var12_26);
                                                                                    if (o.b(var14_28, var15_29 = y.c(y.b(var11_21), var13_27)) && fb.bf[var14_28][var15_29] != 0) {
                                                                                        var8_16 = 1;
                                                                                    }
                                                                                    if (o.b(var14_28 = y.b(y.c(var11_21), var12_26), var15_29 = y.c(y.c(var11_21), var13_27)) && fb.bf[var14_28][var15_29] != 0) {
                                                                                        var9_17 = 1;
                                                                                    }
                                                                                    var16_30 = false;
                                                                                    if (var8_16 == 0 || var9_17 == 0) break block149;
                                                                                    for (var20_34 = 0; var20_34 <= 2; var20_34 = (int)((byte)(var20_34 + 1))) {
                                                                                        block151: {
                                                                                            block150: {
                                                                                                v6 /* !! */  = (E)fb.bf;
                                                                                                if (var21_7) ** GOTO lbl368
                                                                                                if (v6 /* !! */  == null || q.Vc == null) break;
                                                                                                if (var20_34 != 0) break block150;
                                                                                                var19_33 = y.b(var11_21);
                                                                                                if (!var21_7) break block151;
                                                                                            }
                                                                                            var19_33 = y.c(var11_21);
                                                                                        }
                                                                                        var14_28 = var12_26;
                                                                                        var15_29 = var13_27;
                                                                                        block13: while (true) {
                                                                                            var14_28 = y.b(var19_33, var14_28);
                                                                                            var15_29 = y.c(var19_33, var15_29);
                                                                                            v11 = o.b(var14_28, var15_29);
                                                                                            do {
                                                                                                if (v11) {
                                                                                                    if (q.Vc[var14_28][var15_29] != 0 && (var17_31 = q.b((int)var14_28, (int)var15_29, 2, this)) != null) {
                                                                                                        for (var18_32 = 0; var18_32 < var17_31.length; var18_32 = (int)((byte)(var18_32 + 1))) {
                                                                                                            v12 = (byte)y.b(var17_31[var18_32], this);
                                                                                                            if (!var21_7) {
                                                                                                                if (v12 == 0) continue;
                                                                                                                var11_21 = var19_33;
                                                                                                                var16_30 = true;
                                                                                                                if (!var21_7) break;
                                                                                                                if (!var21_7) continue;
                                                                                                            }
                                                                                                            break;
                                                                                                        }
                                                                                                    } else {
                                                                                                        v12 = fb.bf[var14_28][var15_29];
                                                                                                    }
                                                                                                    if (v12 != 0) continue block13;
                                                                                                }
                                                                                                v11 = var16_30;
                                                                                            } while (var21_7);
                                                                                            break;
                                                                                        }
                                                                                        if (v11) break;
                                                                                        if (!var21_7) continue;
                                                                                    }
                                                                                    if (var16_30) break block152;
                                                                                    if (this.fc == 0) break block153;
                                                                                    if (this.fc != 1) break block154;
                                                                                    if (ab.oc.nextInt(6) == 0) break block155;
                                                                                    var9_17 = 0;
                                                                                    if (!var21_7) break block156;
                                                                                }
                                                                                var8_16 = 0;
                                                                                if (!var21_7) break block156;
                                                                            }
                                                                            if (ab.oc.nextInt(6) != 0) break block157;
                                                                            var9_17 = 0;
                                                                            if (!var21_7) break block156;
                                                                        }
                                                                        if (ab.oc.nextInt(2) == 0) break block157;
                                                                        var9_17 = 0;
                                                                        if (!var21_7) break block156;
                                                                    }
                                                                    var8_16 = 0;
                                                                }
                                                                if (var9_17 == 0) break block158;
                                                                this.fc = 1;
                                                                if (!var21_7) break block152;
                                                            }
                                                            this.fc = (byte)-1;
                                                            if (!var21_7) break block152;
                                                        }
                                                        this.fc = 0;
                                                    }
                                                    if (var16_30) break block159;
                                                    if (var8_16 == 0) break block160;
                                                    var11_21 = y.b(var11_21);
                                                    if (!var21_7) break block159;
                                                }
                                                if (var9_17 == 0) break block161;
                                                var11_21 = y.c(var11_21);
                                                if (!var21_7) break block159;
                                            }
                                            var11_21 = y.d(var11_21);
                                        }
                                        v13 = var10_25;
                                        var10_25 = (byte)(var10_25 + 1);
                                        var7_10[v13] = var11_21;
                                    }
                                    if (var10_25 < var7_10.length) continue block10;
                                }
                                v10 = var10_25;
                            } while (var21_7);
                            break;
                        }
                        if (v10 > 0) {
                            var6_15 = var7_10;
                        }
                    }
                    hb.b((byte)6, (byte)var3_3, var4_4, this, var6_15);
                }
                if (!var5_6) break block162;
                this.b(40, 8);
                var7_11 = hb.b(var3_3, (int)var4_4);
                if (var7_11 == null) break block162;
                for (var8_16 = 0; var8_16 < var7_11.length; ++var8_16) {
                    v6 /* !! */  = var7_11[var8_16];
                    if (!var21_7) {
                        if (v6 /* !! */  == null) continue;
                        if (var7_11[var8_16].R) {
                            if (var7_11[var8_16].E) continue;
                            var7_11[var8_16].F = true;
                            if (!var21_7) continue;
                        }
                        if (!var7_11[var8_16].S) continue;
                        var7_11[var8_16].F = true;
                        if (!var21_7) continue;
                    }
                    ** GOTO lbl368
                }
            }
            if (!fb.M && !fb.i() || fb.Zd == null) break block163;
            for (var8_16 = 0; var8_16 < fb.Zd.size(); ++var8_16) {
                v6 /* !! */  = fb.Zd.elementAt(var8_16);
lbl368:
                // 4 sources

                if ((var7_12 = (v)v6 /* !! */ ) == null || var7_12.q || !var7_12.u || !var7_12.b(var3_3, var4_4) || !var7_12.d(this)) continue;
                var7_12.b(this);
                if (!var21_7) continue;
            }
        }
        if (!var2_2 && !fb.i()) {
            fb.I.b(this.w, (byte)var3_3, var4_4, var1_1, var6_15);
        }
        return 0;
    }

    public final void b(byte by, int n2, boolean bl) {
        int n3;
        block8: {
            String string;
            block10: {
                block9: {
                    if (this.Yb[by] == -1 || n2 == this.Yb[by]) {
                        return;
                    }
                    n3 = n2 - this.Yb[by];
                    if (n3 <= 0) break block8;
                    if (n2 <= this.Yb[by]) break block9;
                    fb.c(100, this.w);
                    string = "+";
                    if (!ab.xc) break block10;
                }
                string = "";
            }
            q q2 = this;
            q2 = this;
            new w(null, (int)(this.c / 10), (int)(q2.d / 10 - 25), (byte)8, (boolean)true, (int)0).i = string + n3 + hb.b((int)by);
        }
        this.Yb[by] = n2;
        if (this == fb.Pd && by == this.bc) {
            fb.I.c(hb.b(this.bc) + this.Yb[this.bc]);
        }
        if (o.c(this.g, this.h)) {
            ab.G.b(ab.S, 0);
        }
        if (fb.M && fb.Pd != null && fb.Pd != this) {
            fb.I.c(this.w, by, this.Yb[by]);
        }
        if (bl) {
            ab.b(by, n3);
        }
    }

    public final void b(int n2, boolean bl) {
        if (n2 == this.C) {
            return;
        }
        int n3 = n2 - this.C;
        if (n3 > 0) {
            String string;
            if (n2 > this.C) {
                if (this == fb.Pd && fb.i()) {
                    fb.f += n3;
                }
                if (bl) {
                    fb.c(100, this.w);
                }
                string = "+";
            } else {
                string = "";
            }
            q q2 = this;
            q2 = this;
            new w(null, (int)(this.c / 10), (int)(q2.d / 10 - 25), (byte)8, (boolean)true, (int)0).i = string + n3 + "^41~";
        }
        this.C = n2;
        if (fb.I != null && fb.Pd == this) {
            fb.I.j = "^41~" + this.C;
        }
        if (o.c(this.g, this.h)) {
            ab.G.b(ab.S, 0);
        }
        if (fb.M && fb.Pd != null && fb.Pd != this) {
            fb.I.b(this.w, this.C);
        }
    }

    public final boolean d(byte by, boolean bl) {
        if (!bl || fb.M) {
            if (this.dc[by] == 0) {
                return false;
            }
            if (this.dc[by] != -1) {
                byte by2 = by;
                this.dc[by2] = this.dc[by2] - 1;
                if (!bl) {
                    ab.c(by, -1);
                }
            }
            if (fb.M || fb.i()) {
                q q2;
                if (by == 1) {
                    if (!bl && (this.fb || this.ib || this.kb)) {
                        return false;
                    }
                    q2 = this;
                    this.e((byte)(30 + 15 * q2.ac[9]), true);
                }
                if (by == 2) {
                    if (!bl && (this.fb || this.ib || this.kb)) {
                        return false;
                    }
                    this.g((byte)this.x(), true);
                }
                if (by == 3) {
                    if (!bl && (this.fb || this.ib || this.kb)) {
                        return false;
                    }
                    this.f((byte)30, true);
                }
                if (by == 0) {
                    this.b((byte)10, this.Yb[10] + 1, true);
                    q2 = this;
                    this.b(this.nc + q2.v() / 2, -1, -1, true, false);
                }
                if (by == 4) {
                    this.b(this.mc + 90, -1, -1, true, true);
                }
            }
        }
        if (!bl && !fb.i()) {
            fb.I.c(this.w, by);
        }
        return true;
    }

    public final void c(byte by, int n2, boolean bl) {
        int n3;
        block10: {
            String string;
            block12: {
                block11: {
                    if (n2 == -1) {
                        this.dc[by] = -1;
                    }
                    if (this.dc[by] == -1 || n2 == this.dc[by]) {
                        return;
                    }
                    if (n2 > ec[by] && ec[by] != -1) {
                        n2 = ec[by];
                    }
                    if ((n3 = n2 - this.dc[by]) == 0) break block10;
                    if (n2 <= this.dc[by]) break block11;
                    string = "+";
                    fb.c(150, this.w);
                    if (!ab.xc) break block12;
                }
                string = "";
            }
            q q2 = this;
            q2 = this;
            new w(null, (int)(this.c / 10), (int)(q2.d / 10 - 25), (byte)8, (boolean)true, (int)0).i = string + n3 + hb.c((int)by);
        }
        this.dc[by] = n2;
        if (this == fb.Pd && this.dc[by] != 0 && fb.i()) {
            ab.Zb[by] = true;
        }
        if (o.c(this.g, this.h)) {
            ab.G.b(ab.S, 0);
        }
        if (fb.M && fb.Pd != null && fb.Pd != this) {
            fb.I.d(this.w, by, this.dc[by]);
        }
        if (bl) {
            ab.c(by, n3);
        }
    }

    public final boolean b(int n2, int n3) {
        int n4 = n2;
        q q2 = this;
        if (n4 > 0) {
            q2.Jb = true;
            q2.Hb = n4;
        }
        this.Ob = n3;
        if (this.Ob <= 0) {
            this.Ob = 1;
        }
        return true;
    }

    public final boolean r() {
        return this.Gb / 10 >= 20;
    }

    public final void b(byte by, byte[] byArray) {
        switch (by) {
            case 0: {
                this.b(byArray[0]);
                if (byArray[0] == -1) break;
                this.j();
                this.d(byArray[1], byArray[2]);
                return;
            }
            case 1: {
                this.e(byArray[0], true);
                return;
            }
            case 2: {
                this.g(byArray[0], true);
                return;
            }
            case 3: {
                this.b(byArray[0], 0, 0, byArray[0] == 2, false, true);
                return;
            }
            case 5: {
                this.f(byArray[0], true);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void b(byte by) {
        block24: {
            block23: {
                boolean bl;
                block20: {
                    block22: {
                        block21: {
                            bl = ab.xc;
                            if (this.r == 4) {
                                return;
                            }
                            if (this.r == 2) {
                                if (this.Cc == null) return;
                                if (this.Cc.k > 0) {
                                    return;
                                }
                            } else if (this.fb || this.kb) {
                                return;
                            }
                            if (by == -1) break block20;
                            if (this.yc != null) {
                                this.yc.c();
                            }
                            this.yc = new w(fb.mc, 0, 0, 9, true, 0);
                            this.yc.b(this, 0, -this.pc);
                            this.yc.s = -1;
                            if (!fb.M && !fb.i()) break block21;
                            this.Ub = by;
                            if (this.e()) break block22;
                            this.s();
                            if (!bl) break block22;
                        }
                        this.Tb = true;
                        if (fb.Pd == this) {
                            this.hc = true;
                        }
                    }
                    if (fb.Pd == this) {
                        fb.b(10, 10);
                    }
                    this.Rb = 0;
                    this.Sb = 1;
                    return;
                }
                if (!fb.M && !fb.i()) break block23;
                this.Tb = false;
                this.Ub = 0;
                this.Wb = false;
                if (this.Cc != null) {
                    this.Cc.b();
                }
                if (this.Cc != null || fb.Pd == this) {
                    this.hc = false;
                }
                if (!fb.M) break block24;
                this.gc = false;
                if (!bl) break block24;
            }
            this.Tb = false;
            if (fb.Pd == this) {
                this.hc = false;
            }
        }
        if (this.yc != null) {
            this.yc.s = 0;
            this.yc = null;
        }
        if (this.zc == null) return;
        this.zc.c();
        this.zc = null;
    }

    private void s() {
        if (fb.M || fb.i()) {
            if (this.Ub > 0) {
                this.Tb = true;
                if (this.Cc != null || fb.Pd == this) {
                    this.hc = true;
                }
                this.Wb = false;
                if (fb.M) {
                    this.gc = true;
                    fb.I.c(this.w, this.g, this.h);
                    fb.I.b(this.w, (byte)0, new byte[]{this.Ub, this.g, this.h});
                }
                this.Vb = fb.kb + (long)(this.Ub * 25);
            }
            this.Ub = 0;
        }
    }

    public final void b(int n2, int n3, int n4, boolean bl, boolean bl2, boolean bl3) {
        if (this.r == 4) {
            return;
        }
        if (this.Ac != null) {
            this.Ac.z = true;
        }
        if (n2 > 0) {
            this.Y = true;
            this.Z = n2;
            this.cb = n3;
            this.bb = n4;
            this.db = bl2;
            this.eb = bl;
            if (bl) {
                bl2 = true;
                n4 = 3;
                q q2 = this;
                q2.b((byte)n4, bl2, true);
            }
            if (fb.Mc != null) {
                this.Ac = new r(this, 0, 0, 0, 0, 15, -1, new t(0, fb.Mc, 15, 0, 0, 0, 0));
            }
            if (o.c(this.g, this.h)) {
                ab.G.b(ab.U, 0);
            }
        } else {
            this.Y = false;
            this.db = false;
            this.Z = 0;
            this.cb = 0;
            this.bb = 0;
            if (this.eb) {
                bl2 = false;
                n4 = 3;
                q q3 = this;
                q3.b((byte)n4, bl2, true);
            }
            this.eb = false;
        }
        if (fb.M && bl3) {
            byte[] byArray = new byte[1];
            byArray[0] = n2 != 0 ? (bl ? 2 : 1) : 0;
            fb.I.b(this.w, (byte)3, byArray);
        }
    }

    public final void e(byte by, boolean bl) {
        block6: {
            block5: {
                Object object;
                if (by == -1) break block5;
                this.fb = true;
                this.gb = by * 25;
                if (fb.Rb != null) {
                    q q2 = this;
                    object = q2;
                    object = this;
                    object = new w(fb.Rb, q2.c / 10, ((o)object).d / 10, 2, false, 1);
                    ((w)object).b(this, 0, 0);
                    ((w)object).h.e = false;
                    ((w)object).h.b(p.r, false, false, (byte)1);
                }
                boolean bl2 = true;
                byte by2 = 1;
                object = this;
                ((q)object).b(by2, bl2, true);
                if (!ab.xc) break block6;
            }
            this.fb = false;
            this.gb = 0;
            this.b((byte)1, false, bl);
        }
        if (fb.M && bl) {
            fb.I.b(this.w, (byte)1, new byte[]{by});
        }
    }

    public final void f(byte by, boolean bl) {
        block5: {
            block4: {
                if (by == -1) break block4;
                this.kb = true;
                this.lb = by * 25;
                boolean bl2 = true;
                byte by2 = 5;
                q q2 = this;
                q2.b(by2, bl2, true);
                if (!ab.xc) break block5;
            }
            this.kb = false;
            this.lb = 0;
            this.b((byte)5, false, bl);
        }
        if (fb.M && bl) {
            fb.I.b(this.w, (byte)5, new byte[]{by});
        }
    }

    public final void g(byte by, boolean bl) {
        block6: {
            block5: {
                Object object;
                if (by == -1) break block5;
                this.ib = true;
                this.jb = by * 25;
                if (fb.Sb != null) {
                    q q2 = this;
                    object = q2;
                    object = this;
                    object = new w(fb.Sb, q2.c / 10, ((o)object).d / 10, 2, false, 1);
                    ((w)object).b(this, 0, 0);
                    ((w)object).h.e = false;
                    ((w)object).h.b(p.r, false, false, (byte)1);
                }
                boolean bl2 = true;
                byte by2 = 2;
                object = this;
                ((q)object).b(by2, bl2, true);
                if (!ab.xc) break block6;
            }
            this.ib = false;
            this.jb = 0;
            this.b((byte)2, false, bl);
        }
        if (fb.M && bl) {
            fb.I.b(this.w, (byte)2, new byte[]{by});
        }
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void h() {
        block271: {
            q q2;
            byte by;
            boolean bl;
            block270: {
                byte by2;
                block269: {
                    q q3;
                    block268: {
                        block267: {
                            q q4;
                            block226: {
                                block241: {
                                    block265: {
                                        block266: {
                                            block262: {
                                                boolean bl2;
                                                byte by3;
                                                byte by4;
                                                block264: {
                                                    block263: {
                                                        block260: {
                                                            block261: {
                                                                block258: {
                                                                    block259: {
                                                                        block257: {
                                                                            q q5;
                                                                            block204: {
                                                                                q q6;
                                                                                block255: {
                                                                                    block256: {
                                                                                        block252: {
                                                                                            boolean bl3;
                                                                                            block253: {
                                                                                                block254: {
                                                                                                    block246: {
                                                                                                        byte by5;
                                                                                                        block249: {
                                                                                                            block251: {
                                                                                                                block250: {
                                                                                                                    block248: {
                                                                                                                        block247: {
                                                                                                                            boolean bl4;
                                                                                                                            block205: {
                                                                                                                                block243: {
                                                                                                                                    block245: {
                                                                                                                                        block244: {
                                                                                                                                            block242: {
                                                                                                                                                block240: {
                                                                                                                                                    block232: {
                                                                                                                                                        block238: {
                                                                                                                                                            q[] qArray;
                                                                                                                                                            byte by6;
                                                                                                                                                            block239: {
                                                                                                                                                                block235: {
                                                                                                                                                                    int n2;
                                                                                                                                                                    block237: {
                                                                                                                                                                        block236: {
                                                                                                                                                                            block234: {
                                                                                                                                                                                block233: {
                                                                                                                                                                                    Object object;
                                                                                                                                                                                    Object object2;
                                                                                                                                                                                    block225: {
                                                                                                                                                                                        block231: {
                                                                                                                                                                                            block229: {
                                                                                                                                                                                                block230: {
                                                                                                                                                                                                    block227: {
                                                                                                                                                                                                        block228: {
                                                                                                                                                                                                            block209: {
                                                                                                                                                                                                                block211: {
                                                                                                                                                                                                                    byte by7;
                                                                                                                                                                                                                    block223: {
                                                                                                                                                                                                                        block224: {
                                                                                                                                                                                                                            block222: {
                                                                                                                                                                                                                                block221: {
                                                                                                                                                                                                                                    block220: {
                                                                                                                                                                                                                                        block216: {
                                                                                                                                                                                                                                            block217: {
                                                                                                                                                                                                                                                block219: {
                                                                                                                                                                                                                                                    block218: {
                                                                                                                                                                                                                                                        block212: {
                                                                                                                                                                                                                                                            block215: {
                                                                                                                                                                                                                                                                block213: {
                                                                                                                                                                                                                                                                    block214: {
                                                                                                                                                                                                                                                                        block210: {
                                                                                                                                                                                                                                                                            block206: {
                                                                                                                                                                                                                                                                                block208: {
                                                                                                                                                                                                                                                                                    block207: {
                                                                                                                                                                                                                                                                                        bl = ab.xc;
                                                                                                                                                                                                                                                                                        if (!this.Jb) break block206;
                                                                                                                                                                                                                                                                                        if (this.Ob != 0) break block207;
                                                                                                                                                                                                                                                                                        this.Hb -= u.s << 2;
                                                                                                                                                                                                                                                                                        if (!bl) break block208;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    this.Hb -= this.Ob;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                this.Gb += this.Hb;
                                                                                                                                                                                                                                                                                if (this.Gb <= 0) {
                                                                                                                                                                                                                                                                                    this.Hb = 0;
                                                                                                                                                                                                                                                                                    this.Gb = 0;
                                                                                                                                                                                                                                                                                    this.Ob = 0;
                                                                                                                                                                                                                                                                                    this.Jb = false;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                this.Ib = this.Gb / 10;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            if (!this.uc) break block209;
                                                                                                                                                                                                                                                                            object2 = this;
                                                                                                                                                                                                                                                                            if (((q)object2).nc != -1) break block210;
                                                                                                                                                                                                                                                                            by7 = 0;
                                                                                                                                                                                                                                                                            break block211;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        by = ((q)object2).nc - ((q)object2).rc;
                                                                                                                                                                                                                                                                        if (((q)object2).rc < 0) {
                                                                                                                                                                                                                                                                            ((q)object2).rc = 0;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        if (((q)object2).rc - ((q)object2).nc <= 0) break block212;
                                                                                                                                                                                                                                                                        if (!((q)object2).wc) break block213;
                                                                                                                                                                                                                                                                        if (((q)object2).rc <= ((q)object2).mc) break block214;
                                                                                                                                                                                                                                                                        ((q)object2).oc = true;
                                                                                                                                                                                                                                                                        if (!bl) break block212;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    ((q)object2).oc = false;
                                                                                                                                                                                                                                                                    if (!bl) break block212;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                if (((q)object2).rc <= ((q)object2).mc) break block212;
                                                                                                                                                                                                                                                                if (((q)object2).oc) break block215;
                                                                                                                                                                                                                                                                ((q)object2).rc = ((q)object2).mc;
                                                                                                                                                                                                                                                                if (!bl) break block212;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            ((q)object2).rc = ((q)object2).nc;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        if (((q)object2).rc > ((q)object2).mc << 1) {
                                                                                                                                                                                                                                                            ((q)object2).rc = ((q)object2).mc << 1;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        if ((by2 = ((q)object2).rc - ((q)object2).nc) >= 0) break block216;
                                                                                                                                                                                                                                                        if (Math.abs(by2) < 10) break block217;
                                                                                                                                                                                                                                                        if (fb.Pd == object2) {
                                                                                                                                                                                                                                                            rc.b(200, 0);
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        if (!o.c(((q)object2).g, ((q)object2).h) || !((q)object2).f() || ((q)object2).rc <= 0) break block217;
                                                                                                                                                                                                                                                        if (ab.oc.nextInt(2) != 0) break block218;
                                                                                                                                                                                                                                                        ab.G.b(ab.J, 0);
                                                                                                                                                                                                                                                        if (!bl) break block219;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    ab.G.b(ab.K, 0);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                if (ab.cc && fb.zc != null && by >= ((q)object2).mc / 4) {
                                                                                                                                                                                                                                                    ((q)object2).Xb = 8;
                                                                                                                                                                                                                                                    q q7 = object2;
                                                                                                                                                                                                                                                    object = q7;
                                                                                                                                                                                                                                                    object = object2;
                                                                                                                                                                                                                                                    new d((nb)new nb((pb)fb.zc), (int)(q7.c / 10), (int)(((o)object).d / 10), (int)ab.rc, (boolean)true).e.b(new byte[]{0, 0, 1, 1, 2, 3}, false, false, (byte)2);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            if (ab.cc && ((q)object2).rc > 0 && fb.Dc != null) {
                                                                                                                                                                                                                                                q q8 = object2;
                                                                                                                                                                                                                                                object = q8;
                                                                                                                                                                                                                                                object = object2;
                                                                                                                                                                                                                                                object = new w(fb.Dc, q8.c / 10, ((o)object).d / 10 - 8, 12, true, 1);
                                                                                                                                                                                                                                                ((w)object).h.b(new byte[]{0, 1, 2, 3, 4, 5}, false, false, (byte)1);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            if (ab.bc != 0 && ((q)object2).r != 0 && fb.Pd != null && fb.L == 0) {
                                                                                                                                                                                                                                                fb.c(by2, ((q)object2).sc);
                                                                                                                                                                                                                                                if (((q)object2).rc <= 0 && fb.b) {
                                                                                                                                                                                                                                                    q q9 = object2;
                                                                                                                                                                                                                                                    fb.Pd.b(fb.Pd.C + (q9.r == 3 ? ab.oc.nextInt(5) + 3 : (q9.r == 9 ? ab.oc.nextInt(3) + 2 : (q9.r == 4 ? ab.oc.nextInt(8) + 12 : ab.oc.nextInt(6) + 7))), false);
                                                                                                                                                                                                                                                    fb.c(((q)object2).mc / 2, ((q)object2).sc);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            ((q)object2).Pb = (byte)4;
                                                                                                                                                                                                                                            if (!bl) break block220;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        if (by2 > 0) {
                                                                                                                                                                                                                                            if (o.c(((q)object2).g, ((q)object2).h)) {
                                                                                                                                                                                                                                                ab.G.b(ab.T, 0);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            if (((q)object2).vc) {
                                                                                                                                                                                                                                                q q10 = object2;
                                                                                                                                                                                                                                                object = q10;
                                                                                                                                                                                                                                                object = object2;
                                                                                                                                                                                                                                                new w(fb.mc, q10.c / 10, ((o)object).d / 10, 10, true, 0).b((o)object2, 0, 0);
                                                                                                                                                                                                                                                if (fb.Sb != null) {
                                                                                                                                                                                                                                                    q q11 = object2;
                                                                                                                                                                                                                                                    object = q11;
                                                                                                                                                                                                                                                    object = object2;
                                                                                                                                                                                                                                                    object = new w(fb.Sb, q11.c / 10, ((o)object).d / 10, 2, false, 1);
                                                                                                                                                                                                                                                    ((w)object).b((o)object2, 0, 0);
                                                                                                                                                                                                                                                    ((w)object).h.e = false;
                                                                                                                                                                                                                                                    ((w)object).h.b(p.s, false, false, (byte)1);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    ((q)object2).nc = ((q)object2).rc;
                                                                                                                                                                                                                                    if (((q)object2).nc <= ((q)object2).mc) {
                                                                                                                                                                                                                                        ((q)object2).oc = false;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    if (((q)object2).nc <= 0) break block221;
                                                                                                                                                                                                                                    ((q)object2).c(125);
                                                                                                                                                                                                                                    ((q)object2).Qc = true;
                                                                                                                                                                                                                                    if (!bl) break block222;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                ((q)object2).Qc = false;
                                                                                                                                                                                                                                ((q)object2).b(true);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            if (!fb.M && !fb.i()) break block223;
                                                                                                                                                                                                                            if (((q)object2).nc <= 0) break block224;
                                                                                                                                                                                                                            if (!fb.M) break block223;
                                                                                                                                                                                                                            fb.I.b(((q)object2).w, ((q)object2).nc, ((q)object2).vc, ((q)object2).wc);
                                                                                                                                                                                                                            if (!bl) break block223;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        ((q)object2).b((byte)((q)object2).sc, (byte)((q)object2).tc, by >= ((q)object2).mc / 2, ((q)object2).xc);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    by7 = by2;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                this.uc = false;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (this.mb != 1 && this.mb != 2) break block225;
                                                                                                                                                                                                            if (this.Hc == null) break block226;
                                                                                                                                                                                                            this.Hc.c();
                                                                                                                                                                                                            if (this.r != 0) break block227;
                                                                                                                                                                                                            if (this.Jb || this.Hc.e) break block226;
                                                                                                                                                                                                            if (this.Hc.j < fb.Wb.h - 1) break block228;
                                                                                                                                                                                                            this.mb = 0;
                                                                                                                                                                                                            this.hc = false;
                                                                                                                                                                                                            object2 = this;
                                                                                                                                                                                                            if (fb.Xb != null) {
                                                                                                                                                                                                                q q12 = object2;
                                                                                                                                                                                                                object = q12;
                                                                                                                                                                                                                object = object2;
                                                                                                                                                                                                                new d(fb.Xb, 0, q12.c / 10, ((o)object).d / 10, ab.rc);
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (o.c(((q)object2).g, ((q)object2).h)) {
                                                                                                                                                                                                                ab.G.b(ab.Q, 0);
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (fb.M || fb.i() || fb.Pd != this) break block226;
                                                                                                                                                                                                            fb.I.n();
                                                                                                                                                                                                            if (!bl) break block226;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        this.Hc.b(new byte[]{1, 1, 2}, false, false, (byte)0);
                                                                                                                                                                                                        if (fb.Pd != this) break block226;
                                                                                                                                                                                                        fb.b(20, 20);
                                                                                                                                                                                                        if (!bl) break block226;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (!this.p() || this.Hc.e) break block226;
                                                                                                                                                                                                    if (this.Hc.j < fb.dd.h - 1) break block229;
                                                                                                                                                                                                    if (this.mb != 2) break block230;
                                                                                                                                                                                                    this.Hc.b(R, false, false, (byte)1);
                                                                                                                                                                                                    if (!bl) break block226;
                                                                                                                                                                                                }
                                                                                                                                                                                                this.mb = 0;
                                                                                                                                                                                                this.hc = false;
                                                                                                                                                                                                if (fb.ed != null) {
                                                                                                                                                                                                    q q13 = this;
                                                                                                                                                                                                    object = q13;
                                                                                                                                                                                                    object = this;
                                                                                                                                                                                                    new d(fb.ed, 0, q13.c / 10, ((o)object).d / 10, ab.qc);
                                                                                                                                                                                                }
                                                                                                                                                                                                if (fb.M || fb.i() || fb.Pd != this) break block226;
                                                                                                                                                                                                fb.I.n();
                                                                                                                                                                                                if (!bl) break block226;
                                                                                                                                                                                            }
                                                                                                                                                                                            if (this.mb != 2) break block231;
                                                                                                                                                                                            if (fb.kb - this.pb < 20L) break block226;
                                                                                                                                                                                            this.b(this.nb, this.ob, false);
                                                                                                                                                                                            if (!bl) break block226;
                                                                                                                                                                                        }
                                                                                                                                                                                        this.Hc.b(this.Qb ? Q : P, false, false, (byte)1);
                                                                                                                                                                                        this.Qb = false;
                                                                                                                                                                                        if (!bl) break block226;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (this.mb != 0) break block226;
                                                                                                                                                                                    if (fb.Pd != null && fb.Pd.mb == 0 && q.c(this.g, this.h) && !ab.w) {
                                                                                                                                                                                        this.Bc = true;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (this.qc > 0) {
                                                                                                                                                                                        this.qc = (byte)(this.qc / 2);
                                                                                                                                                                                        if (this.qc < 2) {
                                                                                                                                                                                            this.qc = 0;
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    if (this.qb != 3 && this.hb) {
                                                                                                                                                                                        this.hb = false;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (this.Lb) {
                                                                                                                                                                                        this.Mb = (byte)(this.Mb - 1);
                                                                                                                                                                                        if (this.Mb <= 0) {
                                                                                                                                                                                            this.Lb = false;
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    if ((fb.M || fb.i()) && this != fb.Pd && this.Cc != null && !this.hc) {
                                                                                                                                                                                        this.Cc.h();
                                                                                                                                                                                    }
                                                                                                                                                                                    if ((fb.M || fb.i()) && !this.r() && fb.j() == 2 && fb.ib != null && fb.jb != null) {
                                                                                                                                                                                        if (fb.ib.H == null && this.g == fb.ib.g && this.h == fb.ib.h) {
                                                                                                                                                                                            fb.ib.b(this);
                                                                                                                                                                                        }
                                                                                                                                                                                        if (fb.jb.H == null && this.g == fb.jb.g && this.h == fb.jb.h) {
                                                                                                                                                                                            fb.jb.b(this);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    if (this.yc != null && this.yc.f) {
                                                                                                                                                                                        this.yc = null;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (this.zc != null && this.zc.f) {
                                                                                                                                                                                        this.zc = null;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (this.hb && fb.kb % 2L == 0L) {
                                                                                                                                                                                        q q14 = this;
                                                                                                                                                                                        object = q14;
                                                                                                                                                                                        object = this;
                                                                                                                                                                                        object2 = new w(fb.mc, q14.c / 10 + (ab.oc.nextInt(15) - ab.oc.nextInt(15)), ((o)object).d / 10 + (ab.oc.nextInt(15) - ab.oc.nextInt(15)), 2, false, 0);
                                                                                                                                                                                        new w(fb.mc, q14.c / 10 + (ab.oc.nextInt(15) - ab.oc.nextInt(15)), ((o)object).d / 10 + (ab.oc.nextInt(15) - ab.oc.nextInt(15)), 2, false, 0).h.j = (byte)(10 + ab.oc.nextInt(5));
                                                                                                                                                                                        ((w)object2).l = this.Gb;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (!fb.M && !fb.i()) break block232;
                                                                                                                                                                                    if (!this.Tb) break block233;
                                                                                                                                                                                    if (fb.kb - this.Vb < 0L) break block234;
                                                                                                                                                                                    this.b((byte)0, new byte[]{-1});
                                                                                                                                                                                    if (fb.M) {
                                                                                                                                                                                        fb.I.b(this.w, (byte)0, new byte[]{-1});
                                                                                                                                                                                    }
                                                                                                                                                                                    this.Vb = fb.kb + 100L;
                                                                                                                                                                                    if (!bl) break block234;
                                                                                                                                                                                }
                                                                                                                                                                                if (!this.Wb && fb.kb - this.Vb >= 0L) {
                                                                                                                                                                                    this.Wb = true;
                                                                                                                                                                                    this.Vb = 0L;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            if (!this.Y || fb.kb % 25L != 0L) break block235;
                                                                                                                                                                            n2 = this.ab;
                                                                                                                                                                            if (this.Z > n2) break block236;
                                                                                                                                                                            n2 = this.Z;
                                                                                                                                                                            if (!bl) break block237;
                                                                                                                                                                        }
                                                                                                                                                                        this.Z -= n2;
                                                                                                                                                                    }
                                                                                                                                                                    if (!this.db) {
                                                                                                                                                                        this.b(n2, this.cb, this.bb, false);
                                                                                                                                                                    }
                                                                                                                                                                    if (this.Z <= n2) {
                                                                                                                                                                        this.b(0, 0, 0, false, false, true);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                if (!this.fb) break block238;
                                                                                                                                                                --this.gb;
                                                                                                                                                                if (this.gb != 0) break block239;
                                                                                                                                                                this.e((byte)-1, true);
                                                                                                                                                                if (!bl) break block238;
                                                                                                                                                            }
                                                                                                                                                            byte by8 = by6 = this.qb == 2 || this.r == 2 && this.qb == 1 ? (byte)1 : 0;
                                                                                                                                                            if (Vc != null && by6 != 0 && o.b(by = (byte)y.b(this.ub, this.g), by6 = y.c(this.ub, this.h)) && Vc[by][by6] != 0 && (qArray = q.b((int)by, (int)by6, 2, this)) != null) {
                                                                                                                                                                for (int n3 = 0; n3 < qArray.length; n3 = (int)((byte)(n3 + 1))) {
                                                                                                                                                                    q6 = qArray[n3];
                                                                                                                                                                    q5 = this;
                                                                                                                                                                    if (!bl) {
                                                                                                                                                                        int n4;
                                                                                                                                                                        if (q6 == q5 || qArray[n3].r == 2 || qArray[n3].r == 4 || this.r == 2 && this.Cc != null && !this.Cc.B && qArray[n3].x != 0 || qArray[n3].qb != 0 && qArray[n3].qb != 2 && qArray[n3].qb != 1) continue;
                                                                                                                                                                        qArray[n3].b(by, by6, this.ub, (byte)6, true, false, true, (byte)0, this.w, (byte)3, (byte)1);
                                                                                                                                                                        if (qArray[n3].qb != 3) {
                                                                                                                                                                            qArray[n3].b(by, by6, y.d(this.ub), (byte)6, true, false, true, (byte)0, this.w, (byte)3, (byte)1);
                                                                                                                                                                        }
                                                                                                                                                                        if ((n4 = qArray[n3].mc / 2 + this.w()) < 50) {
                                                                                                                                                                            n4 = 50;
                                                                                                                                                                        }
                                                                                                                                                                        if (qArray[n3].qb == 3) {
                                                                                                                                                                            qArray[n3].Cb = n4;
                                                                                                                                                                            if (!bl) continue;
                                                                                                                                                                        }
                                                                                                                                                                        qArray[n3].b(n4, (int)this.w, -1, false);
                                                                                                                                                                        if (!bl) continue;
                                                                                                                                                                    }
                                                                                                                                                                    break block204;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        if (this.ib) {
                                                                                                                                                            --this.jb;
                                                                                                                                                            if (this.jb <= 0) {
                                                                                                                                                                this.g((byte)-1, true);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        if (this.kb) {
                                                                                                                                                            --this.lb;
                                                                                                                                                            if (this.lb <= 0) {
                                                                                                                                                                this.f((byte)-1, true);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    if (this.qb != 0) break block240;
                                                                                                                                                    if (this.Rb == -1) break block241;
                                                                                                                                                    this.qb = 1;
                                                                                                                                                    this.a(this.Rb);
                                                                                                                                                    this.ub = this.Rb;
                                                                                                                                                    this.Rb = (byte)-1;
                                                                                                                                                    if (!bl) break block241;
                                                                                                                                                }
                                                                                                                                                if (this.qb != 1) break block242;
                                                                                                                                                if (this.Gc.e) break block241;
                                                                                                                                                this.qb = 0;
                                                                                                                                                if (this.Sb == 0) break block241;
                                                                                                                                                if (this.zc != null) {
                                                                                                                                                    this.zc.c();
                                                                                                                                                    this.zc = null;
                                                                                                                                                }
                                                                                                                                                switch (this.Sb) {
                                                                                                                                                    case 1: {
                                                                                                                                                        if (this.ub != 0) break;
                                                                                                                                                        if (this.r == 0) {
                                                                                                                                                            if (fb.tc == null || this.ib) break;
                                                                                                                                                            this.zc = new w(fb.tc, 0, 0, 4, false, 2);
                                                                                                                                                            this.zc.b(this, 0, -4);
                                                                                                                                                            this.zc.g = true;
                                                                                                                                                            if (!bl) break;
                                                                                                                                                        }
                                                                                                                                                        if (this.r != 1 || fb.hd == null || this.ib) break;
                                                                                                                                                        this.zc = new w(fb.hd, 0, 0, 4, false, 2);
                                                                                                                                                        this.zc.b(this, 0, -1);
                                                                                                                                                        this.zc.g = true;
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                this.Sb = 0;
                                                                                                                                                if (!bl) break block241;
                                                                                                                                            }
                                                                                                                                            if (this.qb != 2 && this.qb != 3) break block241;
                                                                                                                                            if (this.Gc.e) break block243;
                                                                                                                                            byte by9 = this.N;
                                                                                                                                            by = 0;
                                                                                                                                            if (this.qb == 3 && !this.Bb) {
                                                                                                                                                by = 1;
                                                                                                                                                by9 = 2;
                                                                                                                                            }
                                                                                                                                            if (this.qb != 2 && by == 0) break block244;
                                                                                                                                            switch (this.ub) {
                                                                                                                                                case 0: {
                                                                                                                                                    this.Gc.b(I[this.M], true, by != 0, by9);
                                                                                                                                                    if (!bl) break block243;
                                                                                                                                                }
                                                                                                                                                case 1: {
                                                                                                                                                    this.Gc.b(J[this.M], true, by != 0, by9);
                                                                                                                                                    if (!bl) break block243;
                                                                                                                                                }
                                                                                                                                                case 2: {
                                                                                                                                                    this.Gc.b(K[this.M], true, by != 0, by9);
                                                                                                                                                    if (!bl) break block243;
                                                                                                                                                }
                                                                                                                                                case 3: {
                                                                                                                                                    this.Gc.b(L[this.M], true, by != 0, by9);
                                                                                                                                                }
                                                                                                                                                default: {
                                                                                                                                                    if (!bl) break block243;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        if (this.qb != 3 || !this.Eb) break block245;
                                                                                                                                        this.Gc.b(null, (byte)0, (byte)0, (byte)11, (byte)11, true, ab.oc.nextInt(2) == 0, (byte)0);
                                                                                                                                        if (!bl) break block243;
                                                                                                                                    }
                                                                                                                                    if (this.qb == 3 && this.r == 9) {
                                                                                                                                        switch (this.ub) {
                                                                                                                                            case 0: {
                                                                                                                                                this.Gc.b(null, (byte)6, (byte)0, (byte)6, (byte)1, true, false, (byte)0);
                                                                                                                                                if (!bl) break;
                                                                                                                                            }
                                                                                                                                            case 1: {
                                                                                                                                                this.Gc.b(null, (byte)7, (byte)0, (byte)7, (byte)1, true, false, (byte)0);
                                                                                                                                                if (!bl) break;
                                                                                                                                            }
                                                                                                                                            case 2: {
                                                                                                                                                this.Gc.b(null, (byte)8, (byte)0, (byte)8, (byte)1, true, false, (byte)0);
                                                                                                                                                if (!bl) break;
                                                                                                                                            }
                                                                                                                                            case 3: {
                                                                                                                                                this.Gc.b(null, (byte)9, (byte)0, (byte)9, (byte)1, true, false, (byte)0);
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (!this.g()) break block246;
                                                                                                                                if (this.qb == 2) {
                                                                                                                                    this.e(fb.b(this.g, this.h));
                                                                                                                                    if (fb.Pd == this) {
                                                                                                                                        ab.G.b(ab.X, 0);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (this.Lb) {
                                                                                                                                    this.Lb = false;
                                                                                                                                }
                                                                                                                                if (this.qb == 3 && this.Bb) {
                                                                                                                                    this.Lb = true;
                                                                                                                                    this.Mb = (byte)25;
                                                                                                                                }
                                                                                                                                if (this.Cc != null) {
                                                                                                                                    this.Cc.h = true;
                                                                                                                                }
                                                                                                                                if (!(fb.Pd != this && this.Cc == null || this.r() || s.B == null || s.B[this.g][this.h] == 1)) {
                                                                                                                                    this.b(false, this.g, this.h, false, true);
                                                                                                                                }
                                                                                                                                if (this.qb == 3 || !ab.cc) break block246;
                                                                                                                                if (this.Xb != 0) break block247;
                                                                                                                                by = this.h;
                                                                                                                                byte by10 = this.g;
                                                                                                                                if (fb.Wd != null) {
                                                                                                                                    for (int i2 = 0; i2 < fb.Wd.size(); ++i2) {
                                                                                                                                        d d2 = (d)fb.Wd.elementAt(i2);
                                                                                                                                        bl4 = d2.h;
                                                                                                                                        if (!bl) {
                                                                                                                                            if (!bl4 || d2.b / 30 != by10 || d2.c / 30 != by) continue;
                                                                                                                                            bl4 = true;
                                                                                                                                        }
                                                                                                                                        break block205;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                bl4 = false;
                                                                                                                            }
                                                                                                                            if (!bl4) break block246;
                                                                                                                            this.Xb = 8;
                                                                                                                            if (!bl) break block246;
                                                                                                                        }
                                                                                                                        if (fb.Ec == null) break block246;
                                                                                                                        by5 = -1;
                                                                                                                        if (this.ub != 2) break block248;
                                                                                                                        by5 = 4;
                                                                                                                        if (!bl) break block249;
                                                                                                                    }
                                                                                                                    if (this.ub != 0) break block250;
                                                                                                                    by5 = 0;
                                                                                                                    if (!bl) break block249;
                                                                                                                }
                                                                                                                if (this.ub != 1) break block251;
                                                                                                                by5 = 2;
                                                                                                                if (!bl) break block249;
                                                                                                            }
                                                                                                            if (this.ub == 3) {
                                                                                                                by5 = 6;
                                                                                                            }
                                                                                                        }
                                                                                                        if (by5 >= 0) {
                                                                                                            if (this.Xb < 5) {
                                                                                                                by5 = (byte)(by5 + 8);
                                                                                                            }
                                                                                                            --this.Xb;
                                                                                                            q q15 = this;
                                                                                                            q q16 = q15;
                                                                                                            q16 = this;
                                                                                                            new d((nb)new nb((pb)fb.Ec), (int)(q15.c / 10 - 1 + ab.oc.nextInt((int)3) - 8), (int)(q16.d / 10 + 10 + ab.oc.nextInt((int)5)), (int)ab.qc, (boolean)false).e.b(new byte[]{by5}, false, false, (byte)1);
                                                                                                            by5 = (byte)(by5 + 1);
                                                                                                            q q17 = this;
                                                                                                            q16 = q17;
                                                                                                            q16 = this;
                                                                                                            new d((nb)new nb((pb)fb.Ec), (int)(q17.c / 10 - 1 + ab.oc.nextInt((int)3) + 8), (int)(q16.d / 10 + 4 + ab.oc.nextInt((int)5)), (int)ab.qc, (boolean)false).e.b(new byte[]{by5}, false, false, (byte)1);
                                                                                                        }
                                                                                                    }
                                                                                                    if (!fb.M && !fb.i() || !this.Lb || this.Gb / 10 > 2 || s.B == null || !q.b(this.g, this.h) || s.B[this.g][this.h] != 1) break block252;
                                                                                                    this.Lb = false;
                                                                                                    by2 = this.h;
                                                                                                    by = this.g;
                                                                                                    q q18 = this;
                                                                                                    g g2 = g.b(by, by2);
                                                                                                    bl3 = true;
                                                                                                    if (g2 == null) break block253;
                                                                                                    if (g2.d != 2) break block254;
                                                                                                    s s2 = s.b(by, by2);
                                                                                                    if (s2 != null && s2.u == 1) {
                                                                                                        s2.t.b(false, false, (byte)2);
                                                                                                    }
                                                                                                    if (fb.M || fb.i()) {
                                                                                                        q18.b(by, by2, g2.e[0], g2.e[1], true, false, true, (byte)0, (byte)-1, (byte)1, (byte)0);
                                                                                                    }
                                                                                                    break block252;
                                                                                                }
                                                                                                bl3 = false;
                                                                                                if (!bl) break block252;
                                                                                            }
                                                                                            bl3 = false;
                                                                                        }
                                                                                        if (this.qb != 2) break block255;
                                                                                        if (this.vb >= this.wb) break block256;
                                                                                        this.vb += this.wb / 10;
                                                                                        if (this.vb < this.wb) break block257;
                                                                                        break block255;
                                                                                    }
                                                                                    if (this.vb <= this.wb) break block257;
                                                                                    this.vb -= this.wb / 10;
                                                                                    if (this.vb > this.wb) break block257;
                                                                                }
                                                                                q6 = this;
                                                                                q5 = this;
                                                                            }
                                                                            q6.vb = q5.wb;
                                                                        }
                                                                        by4 = this.ub;
                                                                        if (this.qb == 3) {
                                                                            by4 = this.yb;
                                                                        }
                                                                        switch (by4) {
                                                                            case 0: {
                                                                                this.l = 0;
                                                                                this.m = this.vb;
                                                                                if (!bl) break;
                                                                            }
                                                                            case 1: {
                                                                                this.l = -this.vb;
                                                                                this.m = 0;
                                                                                if (!bl) break;
                                                                            }
                                                                            case 2: {
                                                                                this.l = 0;
                                                                                this.m = -this.vb;
                                                                                if (!bl) break;
                                                                            }
                                                                            case 3: {
                                                                                this.l = this.vb;
                                                                                this.m = 0;
                                                                                break;
                                                                            }
                                                                        }
                                                                        this.xb += this.vb;
                                                                        if (this.xb <= 300) break block241;
                                                                        if (this.Kb) {
                                                                            this.Kb = false;
                                                                        }
                                                                        if (this.qb != 3) break block258;
                                                                        this.Ab = (byte)(this.Ab - 1);
                                                                        if (this.Ab > 0) break block259;
                                                                        this.rb = true;
                                                                        if (!bl) break block258;
                                                                    }
                                                                    this.rb = false;
                                                                }
                                                                if (!this.rb) {
                                                                    boolean bl5 = this.rb = !this.b(this.g, this.h, by4);
                                                                }
                                                                if (this.qb != 3 || this.Ab <= 0) break block260;
                                                                if (!this.Bb) break block261;
                                                                this.rb = false;
                                                                if (!bl) break block260;
                                                            }
                                                            if (this.rb) {
                                                                by = y.b(this.yb, this.g);
                                                                g g3 = g.b(by, by4 = y.c(this.yb, this.h));
                                                                if (g3 != null && g3.d == 6) {
                                                                    this.rb = false;
                                                                }
                                                                if (this.rb && (fb.M || fb.i()) && o.b(by, by4) && fb.Re[by][by4].d != null && this.Fb != 0) {
                                                                    this.Cb = 15;
                                                                    this.b(this.Fb);
                                                                    this.Fb = 0;
                                                                }
                                                            }
                                                        }
                                                        if (this.qb != 2 && (this.qb != 3 || this.Bb) || s.B == null || !q.b(by4 = y.b(by = this.qb == 3 ? this.yb : this.ub, this.g), by3 = y.c(by, this.h)) || s.B[by4][by3] != 1) break block262;
                                                        bl2 = true;
                                                        if (fb.M || fb.i()) break block263;
                                                        if (fb.Pd != this || this.hc) {
                                                            bl2 = false;
                                                        }
                                                        if (!bl2) break block264;
                                                        fb.I.c(this.w, this.g, this.h);
                                                        if (!bl) break block264;
                                                    }
                                                    if ((fb.M || fb.i()) && !this.hc) {
                                                        bl2 = false;
                                                        if (fb.Pd == this || this.Cc != null) {
                                                            bl2 = true;
                                                        }
                                                    }
                                                }
                                                if (this.qb == 2 && this.rb) {
                                                    bl2 = false;
                                                }
                                                if (bl2 && s.b(by4, by3) != null) {
                                                    this.b(false, by4, by3, false, true);
                                                }
                                            }
                                            if (this.sb != -1 && this.g == this.sb && this.h == this.tb) {
                                                this.tb = (byte)-1;
                                                this.sb = (byte)-1;
                                                this.rb = true;
                                            }
                                            if (this.qb == 2 && this.hc && !this.rb) {
                                                if (fb.Pd == this) {
                                                    fb.I.e();
                                                }
                                                this.rb = true;
                                            }
                                            if ((fb.M || fb.i()) && this.Ub > 0) {
                                                this.rb = true;
                                            }
                                            if (this.Nb && !this.rb) {
                                                this.Nb = false;
                                            }
                                            if (!this.rb) break block265;
                                            this.j();
                                            if (this.Ub <= 0) break block266;
                                            this.s();
                                            if (!bl) break block241;
                                        }
                                        if (fb.i() || fb.Pd != this && this.Cc == null) break block241;
                                        fb.I.c(this.w, this.g, this.h);
                                        if (!bl) break block241;
                                    }
                                    this.D += ab.gb[this.ub];
                                    this.E += ab.hb[this.ub];
                                    this.xb -= 300;
                                    if (this.qb == 2 || this.qb == 3 && !this.Bb) {
                                        this.c();
                                    }
                                }
                                super.h();
                                this.Gc.c();
                            }
                            q2 = this;
                            q2.Ic.c();
                            q2.Jc.c();
                            q2.Kc.c();
                            if (fb.kb % 2L == 0L) {
                                for (by = 0; by < q2.Sc.length; ++by) {
                                    q4 = q2;
                                    if (!bl) {
                                        if (q4.Sc[by] == -1) continue;
                                        if (q2.Tc[by] > q2.Sc[by]) {
                                            byte by11 = by;
                                            q2.Tc[by11] = (byte)(q2.Tc[by11] - 1);
                                        }
                                        if (q2.Tc[by] < q2.Sc[by]) {
                                            byte by12 = by;
                                            q2.Tc[by12] = (byte)(q2.Tc[by12] + 1);
                                        }
                                        if (q2.Tc[by] != q2.Sc[by]) continue;
                                        q2.Sc[by] = -1;
                                        if (!bl) continue;
                                    }
                                    break;
                                }
                            } else {
                                q4 = q2;
                            }
                            q3 = q4;
                            by = q4.c / 10 - q2.Nc;
                            q3 = q2;
                            by2 = q3.d / 10 - q2.Oc - 30 - q2.Ib;
                            if (Math.abs(by) >= 3) break block267;
                            q3 = q2;
                            q2.Nc = q3.c / 10;
                            if (!bl) break block268;
                        }
                        q2.Nc += by / 3;
                    }
                    if (Math.abs(by2) >= 3) break block269;
                    q3 = q2;
                    q2.Oc = q3.d / 10 - 30 - q2.Ib;
                    if (!bl) break block270;
                }
                q2.Oc += by2 / 3;
            }
            if (!q2.Pc) return;
            if (fb.kb - q2.Rc < 0L) {
                if (q2.Ic.j != 0) return;
                if (!q2.Qc) return;
                q2.Qc = false;
                q2.b(true);
                return;
            }
            if (q2.Ic.e) return;
            if (q2.Ic.j != 0) break block271;
            q2.Ic.b((byte)7, (byte)3);
            q2.Jc.b((byte)7, (byte)3);
            q2.Kc.b((byte)7, (byte)3);
            by = 0;
            do {
                block273: {
                    block272: {
                        if (by >= q2.Sc.length) return;
                        if (q2.Uc[by] != 2) break block272;
                        q2.Sc[by] = 7;
                        if (!bl) break block273;
                    }
                    q2.Sc[by] = 15;
                }
                ++by;
            } while (!bl);
        }
        q2.Pc = false;
    }

    public final void b(Graphics graphics) {
        q q2;
        block24: {
            block25: {
                block26: {
                    block27: {
                        int n2;
                        boolean bl = ab.xc;
                        if (this.mb == 0 && !this.r() && fb.Re[this.g][this.h].d != null) {
                            return;
                        }
                        if (!this.ib || this.ib && fb.Pd == this) {
                            pb pb2 = fb.Ob;
                            if (this.r == 2) {
                                pb2 = fb.Qb;
                            }
                            if (this.r == 3) {
                                pb2 = fb.Pb;
                            }
                            if (pb2 != null) {
                                n2 = this.Ib / 20;
                                if (n2 > 3) {
                                    n2 = 3;
                                }
                                if (this.ib) {
                                    n2 = 3;
                                }
                                pb2.b = n2;
                                q q3 = this;
                                q2 = q3;
                                q2 = this;
                                pb2.b(q3.c / 10 - fb.Ge - pb2.d / 2, q2.d / 10 + 7 - pb2.e / 2 - fb.He);
                                pb2.b(graphics);
                            }
                        }
                        if (this.mb != 0) break block24;
                        byte by = 0;
                        n2 = 0;
                        if (this.qc != 0) {
                            switch (this.ub) {
                                case 0: {
                                    n2 = -this.qc;
                                    if (!bl) break;
                                }
                                case 1: {
                                    by = this.qc;
                                    if (!bl) break;
                                }
                                case 2: {
                                    n2 = this.qc;
                                    if (!bl) break;
                                }
                                case 3: {
                                    by = -this.qc;
                                }
                            }
                        }
                        if (this.o() && this.fb && fb.Rb != null && this.Ib < 20) {
                            fb.Rb.b = 0;
                            q q4 = this;
                            q2 = q4;
                            q2 = this;
                            fb.Rb.b(q4.c / 10 - fb.Ge - fb.Rb.d / 2, q2.d / 10 - fb.Rb.e / 2 + 5 - fb.He);
                            fb.Rb.b(graphics);
                        }
                        if (this.ib && (!this.ib || fb.Pd != this)) break block25;
                        if (!this.ib) {
                            q q5 = this;
                            q2 = q5;
                            q2 = this;
                            this.Gc.b(graphics, q5.c / 10 - fb.Ge + by, q2.d / 10 - fb.He - this.Ib + n2);
                        }
                        if (!this.o()) break block25;
                        if (this.zc != null && this.zc.g) {
                            this.zc.b(graphics);
                        }
                        if (this.r != 0 || this.nc < 0) break block26;
                        if (fb.fe == null || fb.ge == null) break block27;
                        if (this.nc >= 2 * this.mc / 3) break block26;
                        fb.fe.b(graphics, this);
                        if (this.nc >= this.mc / 2) break block26;
                        fb.ge.b(graphics, this);
                        if (!bl) break block26;
                    }
                    if (fb.fe != null && this.nc < this.mc / 2) {
                        fb.fe.b(graphics, this);
                    }
                }
                if (!this.ib && this.Mc != null) {
                    this.Mc.b(graphics, this);
                }
                if (this.Lc != null) {
                    this.Lc.b(graphics, this);
                }
            }
            return;
        }
        if ((this.mb == 1 || this.mb == 2) && this.Hc != null) {
            q q6 = this;
            q2 = q6;
            q2 = this;
            this.Hc.b(graphics, q6.c / 10 - fb.Ge, q2.d / 10 - fb.He - this.Ib);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(Graphics var1_1) {
        block14: {
            block15: {
                block16: {
                    block13: {
                        block12: {
                            var6_2 = ab.xc;
                            if (this.r == 0 && this.mb == 0 && fb.kb - this.jc <= this.kc && !this.Pc) {
                                this.c(1);
                            }
                            if (!this.Pc || this.mb != 0 || this.Uc == null) break block15;
                            var2_3 = 0;
                            var4_4 = 0;
                            for (var3_5 = 0; var3_5 < this.Uc.length; var3_5 = (int)((byte)(var3_5 + 1))) {
                                v0 = this.Uc[var3_5];
                                v1 = -1;
                                if (!var6_2) {
                                    if (v0 == v1) continue;
                                    if (var3_5 < 6) {
                                        var2_3 = (byte)(var2_3 + 1);
                                        if (!var6_2) continue;
                                    }
                                    var4_4 = 5;
                                    if (!var6_2) break;
                                    if (!var6_2) continue;
                                }
                                break block12;
                            }
                            v0 = var2_3 - 2;
                            v1 = this.Jc.c;
                        }
                        var5_6 = v0 * v1;
                        this.Ic.b(var1_1 /* !! */ , this.Nc - fb.Ge + 1 - var5_6 / 2 - this.Ic.c / 2 - 1, this.Oc - fb.He - var4_4);
                        for (var3_5 = 0; var3_5 < var2_3 - 2; var3_5 = (int)((byte)(var3_5 + 1))) {
                            this.Jc.b(var1_1 /* !! */ , this.Nc - fb.Ge + 1 - var5_6 / 2 + this.Jc.c / 2 + var3_5 * this.Jc.c, this.Oc - fb.He - var4_4);
                            if (!var6_2) {
                                if (!var6_2) continue;
                            }
                            break block13;
                        }
                        this.Kc.b(var1_1 /* !! */ , this.Nc - fb.Ge + 1 + var5_6 / 2 + this.Ic.c / 2, this.Oc - fb.He - var4_4);
                    }
                    if (var2_3 <= 0) break block16;
                    var5_7 = fb.gc;
                    for (var3_5 = 0; var3_5 < 6; var3_5 = (int)((byte)(var3_5 + 1))) {
                        v2 = this.Tc[var3_5];
                        v3 = -1;
                        if (!var6_2) {
                            if (v2 == v3) break;
                            if (this.Uc[var3_5] != 1 && this.Uc[var3_5] != 2) continue;
                            var5_7.b = this.Tc[var3_5];
                            var5_7.b(this.Nc + 1 - fb.Ge - var2_3 * this.Jc.c / 2 + var3_5 * 6, this.Oc - fb.He - var5_7.e / 2 - var4_4);
                            var5_7.b(var1_1 /* !! */ );
                            if (!var6_2) continue;
                        }
                        ** GOTO lbl55
                    }
                }
                if (var4_4 == 0) break block15;
                var5_6 = this.Jc.c;
                this.Ic.b(var1_1 /* !! */ , this.Nc - fb.Ge + 1 - var5_6 / 2 - this.Ic.c / 2 - 1, this.Oc - fb.He + var4_4);
                this.Jc.b(var1_1 /* !! */ , this.Nc - fb.Ge + 1 - var5_6 / 2 + this.Jc.c / 2, this.Oc - fb.He + var4_4);
                this.Kc.b(var1_1 /* !! */ , this.Nc - fb.Ge + 1 + var5_6 / 2 + this.Ic.c / 2, this.Oc - fb.He + var4_4);
                var5_7 = fb.ic;
                var3_5 = 6;
                do {
                    v2 = var3_5;
                    v3 = this.Uc.length;
lbl55:
                    // 2 sources

                    if (v2 >= v3) break;
                    v4 = this.Tc[var3_5];
                    if (var6_2) break block14;
                    if (v4 == -1) break;
                    if (this.Uc[var3_5] == 1 || this.Uc[var3_5] == 2) {
                        var5_7.b = this.Tc[var3_5];
                        var5_7.b(this.Nc + 1 - fb.Ge - this.Jc.c / 2 + (var3_5 - 7) * 6, this.Oc - fb.He - var5_7.e / 2 + var4_4);
                        var5_7.b(var1_1 /* !! */ );
                    }
                    var3_5 = (byte)(var3_5 + 1);
                } while (!var6_2);
            }
            v4 = fb.I.kf;
        }
        if (v4 != 0) {
            var1_1 /* !! */ .setColor(0xFFFFFF);
            v5 = var1_1 /* !! */ ;
            v6 = this;
            var1_1 /* !! */  = v6;
            var1_1 /* !! */  = this;
            v5.drawString("hp=" + this.nc + "/" + this.mc + "; p=" + (this.Y != false ? 1 : 0) + "; f=" + (this.Tb != false ? 1 : 0), v6.c / 10 - fb.Ge, var1_1 /* !! */ .d / 10 - fb.He - 50, 17);
        }
    }

    private void b(byte by, boolean bl, boolean bl2) {
        block31: {
            block32: {
                boolean bl3;
                block29: {
                    block30: {
                        block27: {
                            block28: {
                                bl3 = ab.xc;
                                if (this.r == 6) {
                                    this.Lc = null;
                                    this.Mc = fb.ie;
                                    return;
                                }
                                if (this.r == 7) {
                                    this.Lc = null;
                                    this.Mc = fb.je;
                                    return;
                                }
                                if (this.r == 5) {
                                    this.Lc = null;
                                    this.Mc = fb.ke;
                                    return;
                                }
                                if (by == 0) {
                                    this.Lc = null;
                                    this.Mc = null;
                                    return;
                                }
                                if (by != 1) break block27;
                                if (!bl) break block28;
                                if (this.ib) {
                                    return;
                                }
                                this.Lc = fb.ce;
                                if (!bl3) break block27;
                            }
                            if (bl2) {
                                this.Lc = null;
                            }
                            if (this.ib) {
                                by = (byte)2;
                                bl = true;
                            }
                            if (this.Y && this.eb) {
                                by = (byte)3;
                                bl = true;
                            }
                        }
                        if (by != 2) break block29;
                        if (!bl) break block30;
                        if (this.fb) {
                            return;
                        }
                        this.Lc = fb.de;
                        if (!bl3) break block29;
                    }
                    if (bl2) {
                        this.Lc = null;
                    }
                    if (this.Y && this.eb) {
                        by = (byte)3;
                        bl = true;
                    }
                }
                if (by != 5) break block31;
                if (!bl) break block32;
                if (this.fb || this.ib) {
                    return;
                }
                this.Lc = fb.he;
                if (!bl3) break block31;
            }
            if (bl2) {
                this.Lc = null;
            }
            if (this.Y && this.eb) {
                by = (byte)3;
                bl = true;
            }
        }
        if (by == 3) {
            if (bl) {
                if (this.Lc != null) {
                    return;
                }
                this.Lc = fb.ee;
                return;
            }
            if (this.Lc == fb.ee) {
                this.Lc = null;
            }
        }
    }

    public final void b(String string) {
        this.y = ab.c(string);
        this.z = ab.b(string, ab.D - 80, ab.C);
    }

    public final int t() {
        if (ab.g()) {
            if (this.x == 0) {
                return 7;
            }
            return 2;
        }
        return this.x % 9;
    }

    public final String u() {
        return "^" + this.t() + "~ ";
    }

    public final int v() {
        int n2;
        block5: {
            block8: {
                boolean bl;
                block13: {
                    block12: {
                        block11: {
                            block10: {
                                block9: {
                                    block7: {
                                        block6: {
                                            block4: {
                                                bl = ab.xc;
                                                if (this.r != 0) break block4;
                                                n2 = 90 + 30 * this.ac[0];
                                                if (!bl) break block5;
                                            }
                                            if (this.r != 1) break block6;
                                            n2 = 90;
                                            if (!bl) break block5;
                                        }
                                        if (this.r != 3) break block7;
                                        n2 = 50;
                                        if (!bl) break block5;
                                    }
                                    if (this.r == 2) break block8;
                                    if (this.r != 4) break block9;
                                    n2 = 240;
                                    if (!bl) break block5;
                                }
                                if (this.r != 5) break block10;
                                n2 = 90;
                                if (!bl) break block5;
                            }
                            if (this.r != 6) break block11;
                            n2 = 120;
                            if (!bl) break block5;
                        }
                        if (this.r != 7) break block12;
                        n2 = 90;
                        if (!bl) break block5;
                    }
                    if (this.r != 8) break block13;
                    n2 = 90;
                    if (!bl) break block5;
                }
                if (this.r != 9) break block8;
                n2 = 30;
                if (!bl) break block5;
            }
            n2 = -1;
        }
        if (n2 != -1 && fb.i() && this != fb.Pd) {
            n2 = n2 * (100 + ab.s * 15) / 100;
        }
        return n2;
    }

    public static int b(q q2, int n2) {
        int n3;
        block6: {
            block21: {
                boolean bl;
                block20: {
                    block19: {
                        block18: {
                            block17: {
                                block16: {
                                    block15: {
                                        block14: {
                                            block13: {
                                                block12: {
                                                    block11: {
                                                        block10: {
                                                            block9: {
                                                                block8: {
                                                                    block7: {
                                                                        block5: {
                                                                            bl = ab.xc;
                                                                            n3 = 0;
                                                                            if (n2 != 0) break block5;
                                                                            n3 = 90;
                                                                            if (q2 == null) break block6;
                                                                            n3 = 90 + 25 * q2.ac[2];
                                                                            if (!bl) break block6;
                                                                        }
                                                                        if (n2 != 1) break block7;
                                                                        n3 = 120;
                                                                        if (q2 == null) break block6;
                                                                        n3 = 120 + 30 * q2.ac[2];
                                                                        if (!bl) break block6;
                                                                    }
                                                                    if (n2 != 3) break block8;
                                                                    n3 = 40;
                                                                    if (q2 == null) break block6;
                                                                    n3 = 40 + 10 * q2.ac[4];
                                                                    if (!bl) break block6;
                                                                }
                                                                if (n2 != 4) break block9;
                                                                n3 = 50;
                                                                if (q2 == null) break block6;
                                                                n3 = 50 + 15 * q2.ac[4];
                                                                if (!bl) break block6;
                                                            }
                                                            if (n2 != 5) break block10;
                                                            n3 = 60;
                                                            if (q2 == null) break block6;
                                                            n3 = 60 + 15 * q2.ac[5];
                                                            if (!bl) break block6;
                                                        }
                                                        if (n2 != 6) break block11;
                                                        n3 = 90;
                                                        if (q2 == null) break block6;
                                                        n3 = 90 + 20 * q2.ac[5];
                                                        if (!bl) break block6;
                                                    }
                                                    if (n2 != 2) break block12;
                                                    n3 = 15;
                                                    if (q2 == null) break block6;
                                                    n3 = 15 + 15 * q2.ac[3];
                                                    if (!bl) break block6;
                                                }
                                                if (n2 != 11) break block13;
                                                n3 = 60;
                                                if (q2 == null) break block6;
                                                n3 = 60 + 60 * q2.ac[8];
                                                if (!bl) break block6;
                                            }
                                            if (n2 != 9) break block14;
                                            n3 = 90;
                                            if (q2 == null) break block6;
                                            n3 = 90 + 45 * q2.ac[7];
                                            if (!bl) break block6;
                                        }
                                        if (n2 != 7) break block15;
                                        n3 = 90;
                                        if (q2 == null) break block6;
                                        n3 = 90 + 25 * q2.ac[6];
                                        if (!bl) break block6;
                                    }
                                    if (n2 != 8) break block16;
                                    n3 = 120;
                                    if (q2 == null) break block6;
                                    n3 = 120 + 30 * q2.ac[6];
                                    if (!bl) break block6;
                                }
                                if (n2 != 12) break block17;
                                n3 = 90;
                                if (!bl) break block6;
                            }
                            if (n2 != 13) break block18;
                            n3 = 60;
                            if (!bl) break block6;
                        }
                        if (n2 != -4) break block19;
                        n3 = 5;
                        if (!bl) break block6;
                    }
                    if (n2 != -5) break block20;
                    n3 = 30;
                    if (!bl) break block6;
                }
                if (n2 != -6) break block21;
                n3 = 45;
                if (!bl) break block6;
            }
            if (n2 == 10) {
                n3 = 6;
            }
        }
        if (fb.i() && q2 != fb.Pd) {
            n3 = (10 + ab.s) * n3 / 10;
        }
        return n3;
    }

    public static int c(q q2) {
        int n2 = 2;
        if (q2 != null) {
            n2 = 2 + 2 * q2.ac[8];
        }
        return n2;
    }

    public static int c(q q2, int n2) {
        if (n2 == 2) {
            n2 = 6;
            if (q2 != null) {
                n2 = 6 + 3 * q2.ac[3];
            }
            return n2;
        }
        return 0;
    }

    private int w() {
        try {
            return 0 + 30 * this.ac[9];
        }
        catch (Exception exception) {
            return 0;
        }
    }

    public final int x() {
        return 30 + 30 * this.ac[10];
    }

    static {
        byte[] byArray = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        P = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8};
        Q = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        R = new byte[]{8, 7, 6, 5, 4, 3, 2, 1, 0};
        T = 0;
        W = 0;
        ec = new int[]{-1, -1, -1, -1, -1, -1};
    }
}

