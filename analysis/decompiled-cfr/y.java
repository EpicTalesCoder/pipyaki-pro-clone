/*
 * Decompiled with CFR 0.152.
 */
public final class y {
    public static boolean b;
    private static String[] c;
    private q d;
    private long e;
    private boolean f;
    private long g;
    public boolean h;
    private boolean i;
    private byte j;
    public int k;
    private byte l;
    private long m;
    private boolean n;
    private int o;
    private int p;
    public byte q;
    public byte r;
    private byte s;
    private static byte t;
    private byte u;
    private byte v;
    private byte w;
    private byte x;
    private int y;
    public int z;
    private boolean A;
    public boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    public boolean F;
    private boolean G;
    private q H;
    private byte I;
    private byte J;
    private boolean K;
    private long L;
    private short M;
    public static int[] N;
    public static short[][] O;
    public static short[][] P;
    private static g Q;
    private static g R;
    public static byte S;
    public static byte T;
    public static byte U;
    public static byte V;
    private int W;
    private int X;
    private short[][] Y;
    private boolean Z;
    private int ab;
    private static boolean bb;

    public y(q object, int n2) {
        block28: {
            block29: {
                block30: {
                    int n3;
                    boolean bl;
                    block26: {
                        block24: {
                            bl = ab.xc;
                            this.A = true;
                            this.B = true;
                            this.C = true;
                            this.D = true;
                            this.E = true;
                            this.Z = false;
                            this.ab = -1;
                            this.d = object;
                            this.k = n2;
                            this.d.y = "";
                            this.d.z = "";
                            if (!fb.i()) {
                                int n4;
                                object = new String[fb.Qd.size()];
                                for (n2 = 0; n2 < fb.Qd.size(); ++n2) {
                                    object[n2] = ((q)fb.Qd.elementAt((int)n2)).y;
                                    if (!bl) {
                                        if (!bl) continue;
                                    }
                                    break block24;
                                }
                                String string = "";
                                int n5 = (1 + this.k / 3) * c.length / 3 - c.length / 3;
                                int n6 = 999;
                                block1: while (true) {
                                    int n7 = n6;
                                    block2: while (n7 > 0) {
                                        int n8;
                                        int n9;
                                        block25: {
                                            n9 = n5 + ab.oc.nextInt(c.length / 3);
                                            string = c[n9];
                                            for (n9 = 0; n9 < ((String[])object).length; ++n9) {
                                                n8 = object[n9].startsWith(string) ? 1 : 0;
                                                if (!bl) {
                                                    if (n8 == 0) continue;
                                                    n9 = -1;
                                                    if (!bl) break;
                                                    if (!bl) continue;
                                                }
                                                break block25;
                                            }
                                            n8 = n9;
                                        }
                                        if (n8 != -1) break block1;
                                        if (--n6 != 0) continue block1;
                                        n3 = 0;
                                        if (bl) break block26;
                                        for (int i2 = v249075; i2 < c.length / 3; ++i2) {
                                            int n10;
                                            block27: {
                                                n9 = n5 + i2;
                                                n7 = 0;
                                                if (bl) continue block2;
                                                for (int i3 = v248979; i3 < ((String[])object).length; ++i3) {
                                                    n10 = object[i3].startsWith(string) ? 1 : 0;
                                                    if (!bl) {
                                                        if (n10 == 0) continue;
                                                        n9 = -1;
                                                        if (!bl) break;
                                                        if (!bl) continue;
                                                    }
                                                    break block27;
                                                }
                                                n10 = n9;
                                            }
                                            if (n10 != -1) break;
                                            if (!bl) continue;
                                        }
                                        if (bl) break block1;
                                        continue block1;
                                    }
                                    break;
                                }
                                this.d.y = string;
                                this.d.y = this.d.y + ((n4 = this.k) >= 3 && n4 <= 5 ? "^25~" : (n4 >= 6 ? "^26~" : "^24~"));
                                this.d.b(this.d.y);
                                if (this.k == 8) {
                                    this.F = true;
                                }
                                y.c(this.d);
                            }
                            this.l = (byte)8;
                            this.z = 0;
                        }
                        n3 = this.e();
                    }
                    if (n3 == 0 && !fb.i()) break block28;
                    object = this;
                    this.l = (byte)8;
                    object.z = 2;
                    object.M = (short)25;
                    if (object.d.r != 1 && object.d.r != 0) break block29;
                    y.c(object.d);
                    if (object.d.r != 1) break block30;
                    object.d.bc = 12;
                    if (!bl) break block29;
                }
                if (object.d.r == 0) {
                    object.d.bc = 0;
                    if (object.k >= 6) {
                        object.d.bc = 1;
                    }
                }
            }
            if (object.d.r == 3) {
                object.M = (short)50;
            }
            if (object.d.r == 4) {
                object.M = (short)25;
            }
            if (object.d.r == 5) {
                object.M = 0;
            }
            if (object.d.r == 7) {
                y.c(object.d);
                object.d.cc = 13;
            }
            if (object.d.r == 6) {
                object.M = (short)100;
            }
            if (object.d.r == 9) {
                object.M = (short)50;
            }
            object.d.mc = object.d.v();
        }
        this.b();
        b = true;
    }

    public static byte b(byte by, byte by2) {
        byte by3 = by2;
        switch (by) {
            case 1: {
                by3 = (byte)(by2 - 1);
                if (!ab.xc) break;
            }
            case 3: {
                by3 = (byte)(by2 + 1);
            }
        }
        return by3;
    }

    public static byte c(byte by, byte by2) {
        byte by3 = by2;
        switch (by) {
            case 0: {
                by3 = (byte)(by2 + 1);
                if (!ab.xc) break;
            }
            case 2: {
                by3 = (byte)(by2 - 1);
            }
        }
        return by3;
    }

    public static byte d(byte by, byte by2) {
        byte by3 = by2;
        switch (by) {
            case 1: {
                by3 = (byte)(by2 + 1);
                if (!ab.xc) break;
            }
            case 3: {
                by3 = (byte)(by2 - 1);
            }
        }
        return by3;
    }

    public static byte e(byte by, byte by2) {
        byte by3 = by2;
        switch (by) {
            case 0: {
                by3 = (byte)(by2 - 1);
                if (!ab.xc) break;
            }
            case 2: {
                by3 = (byte)(by2 + 1);
            }
        }
        return by3;
    }

    private static byte b(byte by, byte by2, byte by3) {
        byte by4 = by2;
        switch (by) {
            case 1: {
                by4 = (byte)(by2 - by3);
                if (!ab.xc) break;
            }
            case 3: {
                by4 = (byte)(by2 + by3);
            }
        }
        return by4;
    }

    private static byte c(byte by, byte by2, byte by3) {
        byte by4 = by2;
        switch (by) {
            case 0: {
                by4 = (byte)(by2 + by3);
                if (!ab.xc) break;
            }
            case 2: {
                by4 = (byte)(by2 - by3);
            }
        }
        return by4;
    }

    public static byte b(byte by, byte by2, byte by3, byte by4) {
        if (by > by3) {
            return 1;
        }
        if (by3 > by) {
            return 3;
        }
        if (by2 > by4) {
            return 2;
        }
        if (by4 > by2) {
            return 0;
        }
        return -1;
    }

    public static byte b(byte by) {
        return (byte)(Math.abs(by - 1 + 4) % 4);
    }

    public static byte c(byte by) {
        return (byte)(Math.abs(by + 1) % 4);
    }

    public static byte d(byte by) {
        return (byte)(Math.abs(by + 2) % 4);
    }

    public static boolean b(int n2, int n3) {
        return o.b((byte)n2, (byte)n3) && fb.bf[n2][n3] != 0;
    }

    private static boolean f(byte by, byte by2) {
        if (!o.b(by, by2)) {
            return false;
        }
        return s.B != null && (by = s.B[by][by2]) == 1;
    }

    private void a() {
        this.s = 0;
        this.u = (byte)-1;
        this.v = (byte)-1;
        this.w = (byte)-1;
        this.x = 0;
    }

    public final void b() {
        block7: {
            block6: {
                if (!this.e()) break block6;
                if (this.d.r == 2) {
                    this.B = false;
                }
                if (this.d.r != 4) break block7;
                this.D = false;
                this.A = false;
                if (!ab.xc) break block7;
            }
            if (!fb.i()) {
                this.d(0);
            }
        }
        this.a();
        this.b(10);
        this.h = true;
        if (this.E && ab.m == 2 && !fb.i()) {
            this.d.Ec = false;
            this.b(true);
        }
    }

    private void b(int n2) {
        if (n2 <= 0) {
            return;
        }
        this.e = fb.kb + (long)n2;
    }

    private void c(int n2) {
        if (n2 <= 0) {
            return;
        }
        this.m = fb.kb + (long)n2;
    }

    private boolean e(byte by) {
        boolean bl = false;
        if (by != this.d.ub && this.k <= 5) {
            bl = true;
            if (this.k >= 3) {
                bl = ab.oc.nextInt(6 - this.k) == 0;
            }
        }
        return this.b(by, bl);
    }

    private boolean b(byte by, boolean bl) {
        block6: {
            block8: {
                block7: {
                    if (this.d.hc) break block6;
                    if (this.d.ub == by) break block7;
                    this.c();
                    if (!bl) break block8;
                    this.g = 0L;
                    if (!ab.xc) break block8;
                }
                if (!this.A) {
                    return false;
                }
            }
            this.f = false;
            if (System.currentTimeMillis() - this.g < 300L) {
                this.g = System.currentTimeMillis();
                this.f = true;
            }
            bl = this.d.b(by, this.f);
            if (fb.M && bl) {
                fb.I.b(this.d.w, this.d.g, this.d.h, by, this.f);
            }
            return bl;
        }
        return false;
    }

    private void c() {
        if (this.d != null && !this.d.hc) {
            this.g = System.currentTimeMillis();
            this.d.i();
        }
    }

    private void f(byte by) {
        if (this.d != null && !this.d.hc && this.d.ub != by && this.d.qb != 1) {
            this.b(by, true);
            this.g = 0L;
        }
    }

    public final boolean b(byte by, int n2) {
        int n3;
        block5: {
            y y2;
            block6: {
                if (n2 == -1) {
                    return false;
                }
                n3 = this.d.b((byte)n2, false, this.d.g, this.d.h, null);
                if (n3 != 0 || by == -1 || !hb.b((byte)n2) || !this.d(this.d.g, this.d.h, by)) break block5;
                n2 = by;
                y2 = this;
                this.s = t;
                y2.u = y2.d.g;
                y2.v = y2.d.h;
                y2.w = (byte)n2;
                y2.x = 0;
                if (!fb.i()) break block6;
                y2.c();
                y2.b(4);
                if (!ab.xc) break block5;
            }
            if (y2.k <= 2) {
                y2.c();
                y2.b(3 - y2.k);
            }
        }
        return n3 == 0;
    }

    public final boolean d() {
        q q2;
        boolean bl = ab.xc;
        if (this.d.r == 2) {
            return false;
        }
        if (fb.kb - this.L < 0L || this.d.qb == 1) {
            return false;
        }
        if (this.d.r == 3) {
            hb.b((byte)-4, this.d.g, this.d.h, this.d, null);
            this.d.b(30, 8);
        }
        if (this.d.r == 4) {
            hb.b((byte)-5, this.d.g, this.d.h, this.d, null);
            this.d.qc = (byte)10;
            if (fb.Kc != null) {
                int n2 = 0;
                int n3 = 0;
                int n4 = 0;
                int n5 = 0;
                switch (this.d.ub) {
                    case 0: {
                        n2 = 0;
                        n3 = 15;
                        n4 = 0;
                        n5 = 10;
                        if (!bl) break;
                    }
                    case 1: {
                        n2 = -20;
                        n3 = 0;
                        n4 = -10;
                        n5 = 0;
                        if (!bl) break;
                    }
                    case 2: {
                        n2 = 0;
                        n3 = -20;
                        n4 = 0;
                        n5 = -10;
                        if (!bl) break;
                    }
                    case 3: {
                        n2 = 20;
                        n3 = 0;
                        n4 = 10;
                        n5 = 0;
                    }
                }
                q q3 = this.d;
                q2 = q3;
                q2 = this.d;
                t t2 = new t(1, fb.Kc, 0, q3.c / 10 + n2, q2.d / 10 + n3, n4, n5);
                new t(1, fb.Kc, 0, q3.c / 10 + n2, q2.d / 10 + n3, n4, n5).A = 50;
                if (this.d.ub == 1) {
                    t2.D = true;
                }
            }
        }
        if (this.d.r == 5) {
            q q4 = this.d;
            q2 = q4;
            q2 = this.d;
            p.b((byte)6, (byte)3, q4.c / 10 + 10, q2.d / 10 + 5, 0, this.d.mc, null, null, -1);
            if (o.c(this.d.g, this.d.h)) {
                ab.G.b(ab.R, 0);
            }
            if (fb.Hc != null) {
                new d(fb.Hc, (byte)ab.oc.nextInt(fb.Hc.h), (int)this.d.h, (int)this.d.g, ab.rc);
            }
        }
        if (this.d.r == 6) {
            hb.b((byte)-6, (byte)this.d.g, (byte)this.d.h, (q)this.d, null).z = this.H;
        }
        if (this.d.r == 8) {
            this.d.a(fb.Pd.g, fb.Pd.h);
        }
        if (this.d.r == 9) {
            this.d.b(this.d.g, this.d.h, this.J, this.I, true, true, false, (byte)3, (byte)-1, (byte)0, (byte)0);
        }
        this.L = fb.kb + (long)this.M;
        return true;
    }

    public final boolean e() {
        return this.d.r == 2 || this.d.r == 3 || this.d.r == 6 || this.d.r == 5 || this.d.r == 8 || this.d.r == 9;
    }

    public final boolean f() {
        return this.d.r == 4;
    }

    public final boolean b(q q2) {
        return y.b(q2, this.d);
    }

    public static boolean b(q q2, q q3) {
        if (q3 == null) {
            return true;
        }
        if (ab.g()) {
            if (q2.x == -1) {
                if (q2.Cc != null && q2.r == 2 && q2.Cc.B) {
                    return true;
                }
                if (q2.r == 3) {
                    return q3.x != -1;
                }
                return false;
            }
            return q3.x != q2.x;
        }
        return true;
    }

    private boolean g(byte by) {
        if (by < 0) {
            return false;
        }
        return this.d.Yb[by] != 0;
    }

    private boolean b(byte by, byte by2, boolean bl) {
        boolean bl2;
        block5: {
            boolean bl3 = ab.xc;
            if (this.d.g != by && this.d.h != by2) {
                return false;
            }
            byte by3 = (byte)o.b(by, by2, this.d.g, this.d.h);
            if (by3 <= 1) {
                return true;
            }
            if (bl && by3 > this.l) {
                return false;
            }
            by = y.b(this.d.g, this.d.h, by, by2);
            for (by2 = 1; by2 < by3; by2 = (byte)(by2 + 1)) {
                bl2 = y.b((int)y.b(by, this.d.g, by2), (int)y.c(by, this.d.h, by2));
                if (!bl3) {
                    if (bl2) continue;
                    return false;
                }
                break block5;
            }
            bl2 = true;
        }
        return bl2;
    }

    private boolean d(byte by, byte by2, byte by3) {
        block11: {
            block10: {
                if (by3 < 0 || by3 > 3 || !this.A) {
                    return false;
                }
                if ((by = (byte)o.b(by, by2, this.d.g, this.d.h)) > 1) {
                    return false;
                }
                if (by != 0) break block10;
                by = y.b(y.d(by3), this.d.g);
                by2 = y.c(y.d(by3), this.d.h);
                if (this.d.b(this.d.g, this.d.h, y.d(by3))) {
                    if (this.k >= 2) {
                        if (!y.f(by, by2)) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
                if (!ab.xc) break block11;
            }
            return true;
        }
        return false;
    }

    private byte[] g(byte by, byte by2) {
        boolean bl;
        byte[] byArray;
        block7: {
            boolean bl2 = ab.xc;
            if (fb.bf == null) {
                return null;
            }
            if (!o.b(by, by2)) {
                return null;
            }
            byArray = new byte[4];
            boolean bl3 = true;
            for (byte by3 = 0; by3 < 4; by3 = (byte)(by3 + 1)) {
                byte by4 = y.b(by3, by);
                byte by5 = y.c(by3, by2);
                byArray[by3] = 0;
                bl = o.b(by4, by5);
                if (!bl2) {
                    if (!bl) continue;
                    boolean bl4 = false;
                    if (this.d.b(by, by2, by3) && (this.k <= 1 || !y.f(by4, by5))) {
                        bl4 = true;
                    }
                    if (this.y == 5 && o.b(by4, by5, this.q, this.r) > this.o) {
                        bl4 = false;
                    }
                    byte by6 = byArray[by3] = bl4 ? ab.uc : (byte)0;
                    if (byArray[by3] == 0) continue;
                    bl3 = false;
                    if (!bl2) continue;
                }
                break block7;
            }
            bl = bl3;
        }
        if (bl) {
            return null;
        }
        return byArray;
    }

    public final void g() {
        if (this.e() && this.d.r == 2) {
            this.L = 250L;
            this.B = true;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void h() {
        block187: {
            block190: {
                block188: {
                    block189: {
                        block179: {
                            block180: {
                                block185: {
                                    block186: {
                                        block183: {
                                            block184: {
                                                block182: {
                                                    block125: {
                                                        block181: {
                                                            block177: {
                                                                block178: {
                                                                    block172: {
                                                                        block176: {
                                                                            block173: {
                                                                                block175: {
                                                                                    block174: {
                                                                                        block168: {
                                                                                            block171: {
                                                                                                block169: {
                                                                                                    block170: {
                                                                                                        block124: {
                                                                                                            block147: {
                                                                                                                block167: {
                                                                                                                    block166: {
                                                                                                                        block165: {
                                                                                                                            block162: {
                                                                                                                                block164: {
                                                                                                                                    block163: {
                                                                                                                                        block156: {
                                                                                                                                            block157: {
                                                                                                                                                block160: {
                                                                                                                                                    block161: {
                                                                                                                                                        block158: {
                                                                                                                                                            block159: {
                                                                                                                                                                block155: {
                                                                                                                                                                    block154: {
                                                                                                                                                                        block151: {
                                                                                                                                                                            block153: {
                                                                                                                                                                                block152: {
                                                                                                                                                                                    block148: {
                                                                                                                                                                                        block150: {
                                                                                                                                                                                            block149: {
                                                                                                                                                                                                block144: {
                                                                                                                                                                                                    block145: {
                                                                                                                                                                                                        block146: {
                                                                                                                                                                                                            block140: {
                                                                                                                                                                                                                block141: {
                                                                                                                                                                                                                    block143: {
                                                                                                                                                                                                                        block142: {
                                                                                                                                                                                                                            block130: {
                                                                                                                                                                                                                                block131: {
                                                                                                                                                                                                                                    block139: {
                                                                                                                                                                                                                                        block138: {
                                                                                                                                                                                                                                            block137: {
                                                                                                                                                                                                                                                block136: {
                                                                                                                                                                                                                                                    block132: {
                                                                                                                                                                                                                                                        block135: {
                                                                                                                                                                                                                                                            block134: {
                                                                                                                                                                                                                                                                block133: {
                                                                                                                                                                                                                                                                    block126: {
                                                                                                                                                                                                                                                                        block129: {
                                                                                                                                                                                                                                                                            block128: {
                                                                                                                                                                                                                                                                                block127: {
                                                                                                                                                                                                                                                                                    var10_1 = ab.xc;
                                                                                                                                                                                                                                                                                    if (this.y != -1) break block126;
                                                                                                                                                                                                                                                                                    if (this.d.g >= this.q) break block127;
                                                                                                                                                                                                                                                                                    this.e((byte)3);
                                                                                                                                                                                                                                                                                    if (!var10_1) break block126;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                if (this.d.g <= this.q) break block128;
                                                                                                                                                                                                                                                                                this.e((byte)1);
                                                                                                                                                                                                                                                                                if (!var10_1) break block126;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            if (this.d.h >= this.r) break block129;
                                                                                                                                                                                                                                                                            this.e((byte)0);
                                                                                                                                                                                                                                                                            if (!var10_1) break block126;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        if (this.d.h > this.r) {
                                                                                                                                                                                                                                                                            this.e((byte)2);
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    if (fb.kb - this.e < 0L) {
                                                                                                                                                                                                                                                                        return;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    if (this.s == 0) break block130;
                                                                                                                                                                                                                                                                    var1_2 = this;
                                                                                                                                                                                                                                                                    if (var1_2.s != y.t) break block131;
                                                                                                                                                                                                                                                                    if (var1_2.x != 0) break block132;
                                                                                                                                                                                                                                                                    if (var1_2.k > 2 && !fb.i()) break block133;
                                                                                                                                                                                                                                                                    var1_2.b(y.d(var1_2.w), true);
                                                                                                                                                                                                                                                                    if (!var10_1) break block134;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                var1_2.e(y.d(var1_2.w));
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            if (var1_2.d.g == var1_2.u && var1_2.d.h == var1_2.v) break block131;
                                                                                                                                                                                                                                                            var1_2.x = 1;
                                                                                                                                                                                                                                                            var1_2.c();
                                                                                                                                                                                                                                                            if (!fb.i()) break block135;
                                                                                                                                                                                                                                                            var1_2.c();
                                                                                                                                                                                                                                                            var1_2.b(3);
                                                                                                                                                                                                                                                            if (!var10_1) break block131;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        if (var1_2.k > 6) break block131;
                                                                                                                                                                                                                                                        var1_2.b(6 - var1_2.k);
                                                                                                                                                                                                                                                        if (!var10_1) break block131;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    if (var1_2.x != 1) break block131;
                                                                                                                                                                                                                                                    if (var1_2.k > 2) break block136;
                                                                                                                                                                                                                                                    var1_2.b(var1_2.w, true);
                                                                                                                                                                                                                                                    if (!var10_1) break block137;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                var1_2.e(var1_2.w);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            if (var1_2.d.g != var1_2.u || var1_2.d.h != var1_2.v) break block138;
                                                                                                                                                                                                                                            var1_2.c();
                                                                                                                                                                                                                                            if (!var10_1) break block139;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        if ((var1_2.d.g == var1_2.u || var1_2.d.h == var1_2.v) && Math.abs(var1_2.d.g - var1_2.u) <= 1 && Math.abs(var1_2.d.h - var1_2.v) <= 1) break block131;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    var1_2.a();
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                var1_2.h = false;
                                                                                                                                                                                                                                return;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            if (!this.e()) break block140;
                                                                                                                                                                                                                            var1_3 = this;
                                                                                                                                                                                                                            if (var1_3.d.r != 2) break block141;
                                                                                                                                                                                                                            if (var1_3.L <= 0L) break block142;
                                                                                                                                                                                                                            --var1_3.L;
                                                                                                                                                                                                                            if (!var10_1) break block143;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        var1_3.B = false;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (!var1_3.B) break block140;
                                                                                                                                                                                                                    var1_3.d.e(3);
                                                                                                                                                                                                                    if (!var10_1) break block140;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (var1_3.d.r == 9) {
                                                                                                                                                                                                                    for (var2_5 = 0; var2_5 < fb.Qd.size(); ++var2_5) {
                                                                                                                                                                                                                        v0 = (q)fb.Qd.elementAt(var2_5);
                                                                                                                                                                                                                        if (!var10_1) {
                                                                                                                                                                                                                            if (v0 == null || var3_6.x == var1_3.d.x || var1_3.d.g != var3_6.g || var1_3.d.h != var3_6.h) continue;
                                                                                                                                                                                                                            p.b((byte)0, (byte)0, var1_3.d.g * 30 + 15, var1_3.d.h * 30 + 15, 0, 30, var1_3.d, var1_3.d, -1);
                                                                                                                                                                                                                            var1_3.d.b((byte)-1, (byte)-1, false, false);
                                                                                                                                                                                                                            if (!o.c(var1_3.d.g, var1_3.d.h)) continue;
                                                                                                                                                                                                                            ab.G.b(ab.R, 0);
                                                                                                                                                                                                                            if (!var10_1) continue;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        break block124;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (this.f() && this.y != 4) {
                                                                                                                                                                                                                this.d(4);
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (!this.B || fb.kb - this.m < 0L) break block144;
                                                                                                                                                                                                            this.H = y.b(this.d.g, this.d.h, true, this.l, this.d);
                                                                                                                                                                                                            if (this.H == null) break block145;
                                                                                                                                                                                                            this.I = (byte)o.b(this.H.g, this.H.h, this.d.g, this.d.h);
                                                                                                                                                                                                            this.J = y.b(this.d.g, this.d.h, this.H.g, this.H.h);
                                                                                                                                                                                                            if (!this.C) break block146;
                                                                                                                                                                                                            this.G = true;
                                                                                                                                                                                                            if (!var10_1) break block144;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        this.G = false;
                                                                                                                                                                                                        if (!var10_1) break block144;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    this.I = 0;
                                                                                                                                                                                                    this.G = false;
                                                                                                                                                                                                    this.c(3);
                                                                                                                                                                                                }
                                                                                                                                                                                                if (!this.G) break block147;
                                                                                                                                                                                                if (!this.e()) break block148;
                                                                                                                                                                                                var1_3 = this;
                                                                                                                                                                                                var2_5 = 0;
                                                                                                                                                                                                var3_7 = 0;
                                                                                                                                                                                                if (var1_3.H == null || var1_3.d.r == 8 || var1_3.d.r == 6 || var1_3.b(var1_3.H.g, var1_3.H.h, true)) break block149;
                                                                                                                                                                                                super.i();
                                                                                                                                                                                                if (!var10_1) break block147;
                                                                                                                                                                                            }
                                                                                                                                                                                            var1_3.d(var1_3.z);
                                                                                                                                                                                            if (var1_3.d.r == 3) {
                                                                                                                                                                                                var2_5 = 1;
                                                                                                                                                                                                var3_7 = 5;
                                                                                                                                                                                            }
                                                                                                                                                                                            if (var1_3.d.r == 5) {
                                                                                                                                                                                                var2_5 = 1;
                                                                                                                                                                                                var3_7 = 1;
                                                                                                                                                                                            }
                                                                                                                                                                                            if (var1_3.d.r == 6 || var1_3.d.r == 8) {
                                                                                                                                                                                                var2_5 = 1;
                                                                                                                                                                                                var3_7 = 7;
                                                                                                                                                                                            }
                                                                                                                                                                                            if (var1_3.d.r == 9) {
                                                                                                                                                                                                var2_5 = 1;
                                                                                                                                                                                                var3_7 = 3;
                                                                                                                                                                                            }
                                                                                                                                                                                            if (var1_3.d.ub == var1_3.J) break block150;
                                                                                                                                                                                            super.f(var1_3.J);
                                                                                                                                                                                            if (!var10_1) break block147;
                                                                                                                                                                                        }
                                                                                                                                                                                        if (var1_3.y == 2) {
                                                                                                                                                                                            var1_3.o = var3_7;
                                                                                                                                                                                        }
                                                                                                                                                                                        if (var2_5 != 0 && var1_3.I <= var3_7) {
                                                                                                                                                                                            var1_3.d();
                                                                                                                                                                                        }
                                                                                                                                                                                        if (!var10_1) break block147;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (!this.f()) break block151;
                                                                                                                                                                                    var1_3 = this;
                                                                                                                                                                                    if (var1_3.H == null || var1_3.b(var1_3.H.g, var1_3.H.h, true)) break block152;
                                                                                                                                                                                    var1_3.G = false;
                                                                                                                                                                                    if (!var10_1) break block147;
                                                                                                                                                                                }
                                                                                                                                                                                if (var1_3.d.ub == var1_3.J) break block153;
                                                                                                                                                                                var1_3.f(var1_3.J);
                                                                                                                                                                                if (!var10_1) break block147;
                                                                                                                                                                            }
                                                                                                                                                                            var1_3.d();
                                                                                                                                                                            if (!var10_1) break block147;
                                                                                                                                                                        }
                                                                                                                                                                        var1_3 = this;
                                                                                                                                                                        if (var1_3.H == null) break block147;
                                                                                                                                                                        if (var1_3.d.g == var1_3.H.g || var1_3.d.h == var1_3.H.h) break block154;
                                                                                                                                                                        var1_3.i();
                                                                                                                                                                        if (!var10_1) break block147;
                                                                                                                                                                    }
                                                                                                                                                                    if (var1_3.J != -1) break block155;
                                                                                                                                                                    var1_3.i();
                                                                                                                                                                    if (!var10_1) break block147;
                                                                                                                                                                }
                                                                                                                                                                var4_12 = var1_3;
                                                                                                                                                                if (var4_12.H == null) ** GOTO lbl-1000
                                                                                                                                                                var6_14 = (byte)(Math.abs(var4_12.H.g - var4_12.d.g) + Math.abs(var4_12.H.h - var4_12.d.h));
                                                                                                                                                                var2_5 = var4_12.J;
                                                                                                                                                                var3_8 = var4_12.d(var4_12.d.g, var4_12.d.h, var2_5);
                                                                                                                                                                var7_15 = var4_12.b(var4_12.H.g, var4_12.H.h, false);
                                                                                                                                                                var8_16 = var4_12.H.Tb;
                                                                                                                                                                var9_17 = false;
                                                                                                                                                                var5_18 = (byte)var4_12.d.bc;
                                                                                                                                                                if (!var4_12.g(var5_18)) break block156;
                                                                                                                                                                if (!var7_15) break block157;
                                                                                                                                                                if (!hb.b(var5_18)) break block158;
                                                                                                                                                                if (!var8_16 || var6_14 > 3) break block159;
                                                                                                                                                                var9_17 = true;
                                                                                                                                                                var4_12.K = false;
                                                                                                                                                                if (!var10_1) break block160;
                                                                                                                                                            }
                                                                                                                                                            if (!var3_8) break block160;
                                                                                                                                                            if (var6_14 >= 2 || var4_12.F) {
                                                                                                                                                                var9_17 = true;
                                                                                                                                                                var4_12.K = true;
                                                                                                                                                            }
                                                                                                                                                            if (var5_18 != 0 || var6_14 <= 4) break block160;
                                                                                                                                                            var9_17 = false;
                                                                                                                                                            if (!var10_1) break block160;
                                                                                                                                                        }
                                                                                                                                                        if (!hb.d(var5_18)) break block160;
                                                                                                                                                        if (!hb.e(var5_18)) break block161;
                                                                                                                                                        if (var6_14 <= 3 && !var4_12.F) break block160;
                                                                                                                                                        var9_17 = true;
                                                                                                                                                        if (!var10_1) break block160;
                                                                                                                                                    }
                                                                                                                                                    if (var6_14 >= 2 || var4_12.F) {
                                                                                                                                                        var9_17 = true;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                if (var4_12.F || !hb.f(var5_18) || var4_12.k < 3 || var6_14 >= 3 || var4_12.H.nc < 25) break block156;
                                                                                                                                                var9_17 = false;
                                                                                                                                                if (!var10_1) break block156;
                                                                                                                                            }
                                                                                                                                            if (hb.e(var5_18)) {
                                                                                                                                                var9_17 = true;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        if (var9_17 || !var4_12.g(var5_18 = (byte)var4_12.d.cc) || !var7_15) break block162;
                                                                                                                                        if (!hb.d(var5_18)) break block163;
                                                                                                                                        var9_17 = true;
                                                                                                                                        if (!var10_1) break block162;
                                                                                                                                    }
                                                                                                                                    if (!hb.c(var5_18) || var4_12.F) break block162;
                                                                                                                                    var9_17 = false;
                                                                                                                                    if (var2_5 != y.d(var4_12.d.ub) || var6_14 > 5) break block162;
                                                                                                                                    if (var6_14 > 0 || ab.oc.nextInt(3) != 0) break block164;
                                                                                                                                    var9_17 = true;
                                                                                                                                    if (!var10_1) break block162;
                                                                                                                                }
                                                                                                                                if (ab.oc.nextInt(var6_14) == 0) {
                                                                                                                                    var9_17 = true;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            if (var9_17) {
                                                                                                                                v1 = var5_18;
                                                                                                                            } else lbl-1000:
                                                                                                                            // 2 sources

                                                                                                                            {
                                                                                                                                v1 = var2_5 = -1;
                                                                                                                            }
                                                                                                                            if (v1 != -1) break block165;
                                                                                                                            super.i();
                                                                                                                            if (!var10_1) break block147;
                                                                                                                        }
                                                                                                                        super.d(var1_3.z);
                                                                                                                        var3_9 = hb.b(var2_5);
                                                                                                                        if (var3_9) break block166;
                                                                                                                        if (var1_3.d.ub == var1_3.J) break block167;
                                                                                                                        super.f(var1_3.J);
                                                                                                                        if (!var10_1) break block147;
                                                                                                                    }
                                                                                                                    super.c();
                                                                                                                }
                                                                                                                var1_3.b(var1_3.K != false ? (byte)var1_3.J : -1, var2_5);
                                                                                                            }
                                                                                                            v0 = this.d;
                                                                                                        }
                                                                                                        if (v0.cc != -1 && this.h && this.g((byte)this.d.cc)) {
                                                                                                            if (ab.oc.nextInt(15) == 0) {
                                                                                                                v2 = this.g(this.d.g, this.d.h);
                                                                                                                var1_3 = v2;
                                                                                                                if (v2[y.b(this.d.ub)] == 0 && var1_3[y.c(this.d.ub)] == false) {
                                                                                                                    this.j();
                                                                                                                }
                                                                                                            }
                                                                                                            if (ab.oc.nextInt(100) == 0) {
                                                                                                                this.j();
                                                                                                            }
                                                                                                        }
                                                                                                        if (ab.m != 2 || fb.i()) break block168;
                                                                                                        if (fb.jb.H != null || fb.c((byte)1) || !this.b(y.S, y.T, true)) break block169;
                                                                                                        if (this.d.g != y.S || this.d.h != y.T) break block170;
                                                                                                        if (this.d.x != 0) break block169;
                                                                                                        this.b(false);
                                                                                                        if (!var10_1) break block169;
                                                                                                    }
                                                                                                    this.e(y.b(this.d.g, this.d.h, y.S, y.T));
                                                                                                    return;
                                                                                                }
                                                                                                if (fb.ib.H != null || fb.c((byte)0) || !this.b(y.U, y.V, true)) break block168;
                                                                                                if (this.d.g != y.U || this.d.h != y.V) break block171;
                                                                                                if (this.d.x != 1) break block168;
                                                                                                this.b(false);
                                                                                                if (!var10_1) break block168;
                                                                                            }
                                                                                            this.e(y.b(this.d.g, this.d.h, y.S, y.T));
                                                                                            return;
                                                                                        }
                                                                                        if (this.G) break block172;
                                                                                        if (this.y == 0) {
                                                                                            this.e(20);
                                                                                        }
                                                                                        if (this.y != 4) break block173;
                                                                                        var1_3 = this;
                                                                                        --var1_3.p;
                                                                                        if (var1_3.p > 0) break block173;
                                                                                        if (ab.bc != 1) break block174;
                                                                                        super.f((byte)(2 + ab.oc.nextInt(2)));
                                                                                        if (!var10_1) break block175;
                                                                                    }
                                                                                    super.f((byte)ab.oc.nextInt(4));
                                                                                }
                                                                                var1_3.p = 25 + ab.oc.nextInt(50);
                                                                            }
                                                                            if (this.y != 5) break block172;
                                                                            var1_3 = this;
                                                                            if (var1_3.p <= 0) break block176;
                                                                            var1_3.e(15);
                                                                            --var1_3.p;
                                                                            if (var1_3.p > 0) break block172;
                                                                            var1_3.p = -(1 + ab.oc.nextInt(50));
                                                                            if (!var10_1) break block172;
                                                                        }
                                                                        if (var1_3.p < 0) {
                                                                            ++var1_3.p;
                                                                            if (var1_3.p >= 0) {
                                                                                var1_3.p = 25 + ab.oc.nextInt(50);
                                                                            }
                                                                        }
                                                                    }
                                                                    if (this.y != 2) break block177;
                                                                    var1_3 = this;
                                                                    var2_5 = 1;
                                                                    var3_10 = false;
                                                                    if (var1_3.H != null && var1_3.b(var1_3.H.g, var1_3.H.h, true)) {
                                                                        var1_3.j = var1_3.J;
                                                                        if (var1_3.I > var1_3.o) {
                                                                            var3_10 = true;
                                                                        }
                                                                        var2_5 = 0;
                                                                    }
                                                                    if (var2_5 != 0) {
                                                                        var1_3.d(0);
                                                                    }
                                                                    if (!var3_10) break block178;
                                                                    super.e(var1_3.j);
                                                                    if (!var10_1) break block177;
                                                                }
                                                                super.c();
                                                                super.f(var1_3.j);
                                                            }
                                                            if (this.y != 6) break block179;
                                                            var1_3 = this;
                                                            if (!var1_3.h) break block180;
                                                            if (var1_3.Y != null) break block181;
                                                            var1_3.d(0);
                                                            if (!var10_1) break block179;
                                                        }
                                                        var2_5 = var1_3.Y[var1_3.d.g][var1_3.d.h];
                                                        var5_18 = -1;
                                                        for (var6_14 = 0; var6_14 < 4; var6_14 = (byte)(var6_14 + 1)) {
                                                            var3_11 = y.b(var6_14, var1_3.d.g);
                                                            var4_13 = y.c(var6_14, var1_3.d.h);
                                                            v3 = (byte)o.b(var3_11, var4_13);
                                                            if (!var10_1) {
                                                                if (v3 == 0 || var1_3.Y[var3_11][var4_13] == 0 || var1_3.Y[var3_11][var4_13] >= var2_5) continue;
                                                                var2_5 = var1_3.Y[var3_11][var4_13];
                                                                var5_18 = var6_14;
                                                                if (!var10_1) continue;
                                                            }
                                                            break block125;
                                                        }
                                                        v3 = var5_18;
                                                    }
                                                    if (v3 == -1) break block182;
                                                    var1_3.j = var5_18;
                                                    if (!var10_1) break block180;
                                                }
                                                if (var1_3.d.g != var1_3.W || var1_3.d.h != var1_3.X) break block180;
                                                var6_14 = var1_3.d.x;
                                                if (!var1_3.Z) break block183;
                                                var6_14 = var1_3.d.x == 0 ? 1 : 0;
                                                if (!fb.c(var6_14)) break block184;
                                                super.b(false);
                                                if (!var10_1) break block185;
                                            }
                                            var1_3.B = true;
                                            var1_3.ab = 50;
                                            super.b(5, 10, var1_3.W, var1_3.X);
                                            if (!var10_1) break block185;
                                        }
                                        if (!fb.c(var6_14)) break block186;
                                        super.b(true);
                                        if (!var10_1) break block185;
                                    }
                                    var1_3.B = true;
                                    var1_3.ab = 125;
                                    super.b(5, 20, var1_3.W, var1_3.X);
                                }
                                var1_3.i = true;
                                if (!var10_1) break block179;
                            }
                            var1_3.e(var1_3.j);
                        }
                        if (ab.m != 2 || !this.E || fb.i() || this.ab == -1 && this.y != 0) break block187;
                        if (this.y == 0) {
                            this.b(this.Z);
                            return;
                        }
                        if (this.ab > 0) {
                            --this.ab;
                        }
                        if (this.ab > 0) break block187;
                        this.ab = -1;
                        var1_4 = this.d.x;
                        if (!this.Z) break block188;
                        var1_4 = this.d.x == 0 ? 1 : 0;
                        if (!y.h(var1_4)) break block189;
                        this.b(true);
                        if (!var10_1) break block187;
                    }
                    this.ab = 125;
                    this.d(-1);
                    this.b(5, 20, this.W, this.X);
                    if (!var10_1) break block187;
                }
                if (!y.h(var1_4)) break block190;
                this.b(false);
                if (!var10_1) break block187;
            }
            this.ab = 50;
            this.b(5, 10, this.W, this.X);
        }
        this.h = this.i;
        this.i = false;
    }

    public static q b(byte by, byte by2, boolean bl, int n2, q q2) {
        byte by3;
        byte by4;
        byte by5;
        byte by6;
        boolean[] blArray;
        boolean bl2;
        block11: {
            byte by7;
            bl2 = ab.xc;
            if (q.Vc == null || bl && fb.bf == null) {
                return null;
            }
            blArray = new boolean[4];
            by6 = 0;
            while (by6 < 4) {
                block12: {
                    byte by8;
                    by7 = 1;
                    if (bl2) break block11;
                    for (by5 = v263101; by5 < n2; by5 = (byte)(by5 + 1)) {
                        by4 = y.b(by6, by, by5);
                        by3 = y.c(by6, by2, by5);
                        by8 = (byte)(o.b(by4, by3) ? 1 : 0);
                        if (!bl2) {
                            if (by8 == 0) continue;
                            if (!bl && fb.bf[by4][by3] == 0) break;
                            if (q.Vc[by4][by3] == 0 || q.Vc[by4][by3] == q2.w) continue;
                            blArray[by6] = true;
                            if (!bl2) break;
                            if (!bl2) continue;
                        }
                        break block12;
                    }
                    by8 = by6 = (byte)(by6 + 1);
                }
                if (!bl2) continue;
            }
            by7 = by5 = 1;
        }
        while (by5 < n2) {
            block13: {
                byte by9;
                by6 = 0;
                while (by6 < 4) {
                    by9 = blArray[by6];
                    if (!bl2) {
                        byte by10;
                        q[] qArray;
                        if (by9 != 0 && o.b(by4 = y.b(by6, by, by5), by3 = y.c(by6, by2, by5)) && (qArray = q.b((int)by4, (int)by3, 3, q2)) != null) {
                            for (by4 = 0; by4 < qArray.length; by4 = (byte)(by4 + 1)) {
                                by10 = (byte)(y.b(qArray[by4], q2) ? 1 : 0);
                                if (!bl2) {
                                    if (by10 == 0 || q2.r == 2 && qArray[by4].r == 4) continue;
                                    return qArray[by4];
                                }
                                break;
                            }
                        } else {
                            by10 = by6 = (byte)(by6 + 1);
                        }
                        if (!bl2) continue;
                    }
                    break block13;
                }
                by9 = by5 = (byte)(by5 + 1);
            }
            if (!bl2) continue;
        }
        return null;
    }

    private void i() {
        this.c(10);
        this.G = false;
        this.H = null;
    }

    private void j() {
        byte by = (byte)this.d.cc;
        if (hb.c(by) && this.g(by)) {
            this.b((byte)-1, by);
        }
    }

    private void b(int n2, int n3, int n4, int n5) {
        boolean bl = ab.xc;
        switch (n2) {
            case -1: {
                this.i();
                this.B = false;
                if (!bl) break;
            }
            case 0: {
                if (!bl) break;
            }
            case 2: {
                if (!this.D) {
                    return;
                }
                this.o = 4;
                if (!bl) break;
            }
            case 4: {
                if (!bl) break;
            }
            case 5: {
                this.o = n3;
                this.q = (byte)n4;
                this.r = (byte)n5;
                this.p = 50;
            }
        }
        this.y = n2;
    }

    private void d(int n2) {
        this.b(n2, 1, -1, -1);
    }

    /*
     * Unable to fully structure code
     */
    private void b(boolean var1_1) {
        block16: {
            block15: {
                block13: {
                    block14: {
                        block12: {
                            block11: {
                                block10: {
                                    var2_3 = ab.xc;
                                    this.Z = var1_1;
                                    if (this.d.x != 1) break block10;
                                    if (var1_1) ** GOTO lbl-1000
                                    v0 = y.Q;
                                    break block11;
                                }
                                if (var1_1) {
                                    v0 = y.Q;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    v0 = var1_2 = y.R;
                                }
                            }
                            if (v0 != y.Q) break block12;
                            this.Y = y.O;
                            if (!var2_3) break block13;
                        }
                        if (var1_2 != y.R) break block14;
                        this.Y = y.P;
                        if (!var2_3) break block13;
                    }
                    return;
                }
                this.W = var1_2.b;
                this.X = var1_2.c;
                if (!this.Z) break block15;
                v1 = this.B = ab.oc.nextInt(2) == 0;
                if (!var2_3) break block16;
            }
            this.B = false;
        }
        this.ab = -1;
        this.y = 6;
        this.i = true;
    }

    /*
     * Unable to fully structure code
     */
    private void e(int var1_1) {
        block26: {
            block23: {
                block25: {
                    block24: {
                        var6_3 = ab.xc;
                        var3_4 = this.d.ub;
                        var2_5 = this;
                        if (var3_4 == -1) ** GOTO lbl-1000
                        if (var2_5.y != 5 || (var4_8 = o.b(y.b(var3_4, var2_5.d.g), y.c(var3_4, var2_5.d.h), var2_5.q, var2_5.r)) <= var2_5.o) break block24;
                        if (var4_8 - var2_5.o == 1) ** GOTO lbl-1000
                        v0 = var4_8 - var2_5.o == 2 ? -1 : -2;
                        break block25;
                    }
                    if (var2_5.d.b(var2_5.d.g, var2_5.d.h, var3_4)) {
                        v0 = 1;
                    } else lbl-1000:
                    // 3 sources

                    {
                        v0 = var2_6 = 0;
                    }
                }
                if (!this.h && var2_6 == true) break block26;
                var3_4 = 0;
                if (var2_6 != 1) {
                    var3_4 = 1;
                    if (var2_6 == -1) {
                        this.f(y.d(this.d.ub));
                        return;
                    }
                    if (var2_6 == -2) {
                        this.d(0);
                        return;
                    }
                } else {
                    if (!this.n) {
                        v1 = this.n = ab.oc.nextInt(var1_1) == 0;
                    }
                    if (this.n) {
                        var3_4 = 1;
                    }
                }
                if (var3_4 == 0) break block26;
                var1_1 = -1;
                var2_7 = this;
                var3_4 = this.d.g;
                var4_8 = this.d.h;
                var1_2 = var2_7.g(var3_4, var4_8);
                if (var1_2 == null) ** GOTO lbl72
                var3_4 = 4;
                if (var1_2[0] == 0) {
                    var3_4 = 3;
                }
                if (var1_2[1] == 0) {
                    var3_4 = (byte)(var3_4 - 1);
                }
                if (var1_2[2] == 0) {
                    var3_4 = (byte)(var3_4 - 1);
                }
                if (var1_2[3] == 0) {
                    var3_4 = (byte)(var3_4 - 1);
                }
                if (var3_4 == 2) {
                    var4_8 = y.d(var2_7.d.ub);
                    v2 = var1_2[0] != 0 && var4_8 != 0 ? 0 : (var1_2[1] != 0 && 1 != var4_8 ? 1 : (var1_2[2] != 0 && 2 != var4_8 ? 2 : (var1_2[3] != 0 && 3 != var4_8 ? 3 : -1)));
                } else if (var3_4 == 1) {
                    for (var4_8 = 0; var4_8 < 4; var4_8 = (byte)((byte)(var4_8 + 1))) {
                        v2 = var1_2[var4_8];
                        if (!var6_3) {
                            if (v2 == 0) continue;
                            v2 = var4_8;
                        }
                        break block23;
                    }
                    v2 = -1;
                } else {
                    if (var3_4 != 0) {
                        var3_4 = (byte)(var3_4 - 1);
                        var5_9 = (byte)ab.oc.nextInt(var3_4);
                        var3_4 = 0;
                        for (var4_8 = 0; var4_8 < 4; var4_8 = (byte)((byte)(var4_8 + 1))) {
                            v2 = var1_2[var4_8];
                            if (var6_3) break block23;
                            if (v2 == 0 || var4_8 == y.d(var2_7.d.ub)) continue;
                            if (var3_4 == var5_9) {
                                v2 = var4_8;
                                break block23;
                            }
                            var3_4 = (byte)(var3_4 + 1);
                            if (!var6_3) continue;
                        }
                    }
lbl72:
                    // 5 sources

                    v2 = -1;
                }
            }
            this.j = v2;
            if (this.j == -1) {
                this.j = this.d.ub;
                this.c();
                this.b(3);
                return;
            }
            if (this.n && this.j != this.d.ub) {
                this.n = false;
            }
        }
        this.e(this.j);
    }

    public static void k() {
        block17: {
            int n2;
            block15: {
                boolean bl = ab.xc;
                if (O == null) {
                    O = new short[fb.Pe][fb.Qe];
                }
                if (P == null) {
                    P = new short[fb.Pe][fb.Qe];
                }
                int n3 = 0;
                while (n3 < O.length) {
                    block16: {
                        n2 = 0;
                        if (bl) break block15;
                        for (int i2 = v266469; i2 < O[0].length; ++i2) {
                            y.O[n3][i2] = 0;
                            y.P[n3][i2] = 0;
                            if (!bl) {
                                if (!bl) continue;
                            }
                            break block16;
                        }
                        ++n3;
                    }
                    if (!bl) continue;
                }
                if (fb.Sd != null) {
                    for (n3 = 0; n3 < fb.Sd.size(); ++n3) {
                        g g2 = (g)fb.Sd.elementAt(n3);
                        n2 = g2.d;
                        if (!bl) {
                            if (n2 == 5) {
                                Q = g2;
                            }
                            if (g2.d != 4) continue;
                            R = g2;
                            if (!bl) continue;
                        }
                        break block15;
                    }
                }
                if (Q != null) {
                    bb = false;
                    y.b(O, (int)y.Q.b, (int)y.Q.c, 0);
                    y.b(O, (int)y.Q.b, (int)y.Q.c, 0);
                    y.b(O, (int)y.Q.b, (int)y.Q.c, 0);
                    y.b(O, (int)y.Q.b, (int)y.Q.c, 0);
                }
                if (R == null) break block17;
                n2 = 0;
            }
            bb = n2;
            y.b(P, (int)y.R.b, (int)y.R.c, 0);
            y.b(P, (int)y.R.b, (int)y.R.c, 0);
            y.b(P, (int)y.R.b, (int)y.R.c, 0);
            y.b(P, (int)y.R.b, (int)y.R.c, 0);
        }
    }

    private static void b(short[][] sArray, int n2, int n3, int n4) {
        boolean bl = ab.xc;
        bb = !bb;
        sArray[n2][n3] = 1;
        byte by = fb.Pe;
        byte by2 = fb.Qe;
        if (!bb) {
            byte by3 = 0;
            while (by3 < by) {
                block15: {
                    byte by4;
                    for (byte by5 = 0; by5 < by2; by5 = (byte)(by5 + 1)) {
                        by4 = (byte)sArray[by3][by5];
                        if (!bl) {
                            if (by4 <= 0) continue;
                            n2 = sArray[by3][by5];
                            if (by3 + 1 < by) {
                                n3 = 0;
                                boolean bl2 = y.b(by3 + 1, (int)by5);
                                n4 = bl2 ? 1 : 0;
                                if (bl2) {
                                    n3 = n2 + 1;
                                }
                                if (sArray[by3 + 1][by5] == 0 || n3 < sArray[by3 + 1][by5]) {
                                    sArray[by3 + 1][by5] = (short)n3;
                                }
                            }
                            if (by5 + 1 >= by2) continue;
                            n3 = 0;
                            boolean bl3 = y.b((int)by3, by5 + 1);
                            n4 = bl3 ? 1 : 0;
                            if (bl3) {
                                n3 = n2 + 1;
                            }
                            if (sArray[by3][by5 + 1] != 0 && n3 >= sArray[by3][by5 + 1]) continue;
                            sArray[by3][by5 + 1] = (short)n3;
                            if (!bl) continue;
                        }
                        break block15;
                    }
                    by4 = by3 = (byte)(by3 + 1);
                }
                if (!bl) continue;
            }
            return;
        }
        int n5 = by - 1;
        block2: while (true) {
            int n6 = n5;
            block3: while (n6 >= 0) {
                for (int i2 = by2 - 1; i2 >= 0; --i2) {
                    n6 = sArray[n5][i2];
                    if (bl) continue block3;
                    if (n6 <= 0) continue;
                    n2 = sArray[n5][i2];
                    if (n5 - 1 >= 0) {
                        n3 = 0;
                        boolean bl4 = y.b(n5 - 1, i2);
                        n4 = bl4 ? 1 : 0;
                        if (bl4) {
                            n3 = n2 + 1;
                        }
                        if (sArray[n5 - 1][i2] == 0 || n3 < sArray[n5 - 1][i2]) {
                            sArray[n5 - 1][i2] = (short)n3;
                        }
                    }
                    if (i2 - 1 < 0) continue;
                    n3 = 0;
                    boolean bl5 = y.b(n5, i2 - 1);
                    n4 = bl5 ? 1 : 0;
                    if (bl5) {
                        n3 = n2 + 1;
                    }
                    if (sArray[n5][i2 - 1] != 0 && n3 >= sArray[n5][i2 - 1]) continue;
                    sArray[n5][i2 - 1] = (short)n3;
                    if (!bl) continue;
                }
                --n5;
                if (!bl) continue block2;
            }
            break;
        }
    }

    private static boolean h(byte by) {
        s s2;
        return fb.c(by) && (s2 = by == 1 ? fb.jb : fb.ib) != null && s2.H == null;
    }

    public final void b(byte by, byte by2, byte by3, boolean bl, boolean bl2) {
        if (by == 0) {
            this.d(0);
        }
        if (by == 1) {
            this.d(-1);
        }
        if (by == 2) {
            this.d(4);
        }
        if (by == 3) {
            this.b(5, 3, by2, by3);
        }
        if (by == 4) {
            this.b(5, 1, by2, by3);
        }
        this.C = bl;
        this.D = bl2;
    }

    public static void c(q q2) {
        boolean bl = ab.xc;
        q2.bc = -1;
        q2.cc = -1;
        for (int i2 = 0; i2 < 14; ++i2) {
            q2.Yb[i2] = -1;
            if (!bl) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void d(q var0) {
        block3: {
            block4: {
                block2: {
                    if (var0.bc != -1) break block2;
                    v0 = var0;
                    v1 = true;
                    break block3;
                }
                if (var0.cc != -1) break block4;
                v0 = var0;
                ** GOTO lbl-1000
            }
            v0 = var0;
            if (ab.oc.nextInt(2) == 0) {
                v1 = true;
            } else lbl-1000:
            // 2 sources

            {
                v1 = false;
            }
        }
        y.b(v0, v1);
    }

    public static boolean f(int n2) {
        return n2 == 0 || n2 == 8 || n2 == 6 || n2 == 1 || n2 == 4 || n2 == 2 || n2 == 5 || n2 == 3 || n2 == 12 || n2 == 7;
    }

    public static void l() {
        boolean bl = ab.xc;
        for (int i2 = 1; i2 < 14; ++i2) {
            int n2 = i2;
            N[n2] = N[n2] + N[i2 - 1];
            if (!bl) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void b(q var0, boolean var1_1) {
        var3_2 = ab.xc;
        if (var0 == null) {
            return;
        }
        block0: do {
            if ((var2_3 = ab.oc.nextInt(14)) == 2 || var2_3 == 7 || var2_3 == 8) {
                v0 = ab.oc.nextInt(3);
lbl7:
                // 2 sources

                while (true) {
                    if (v0 == 0) continue block0;
                    continue block0;
                    break;
                }
            }
            if (var2_3 != 9 && var2_3 != 10 && var2_3 != 11 && var2_3 != 13) continue;
            ab.oc.nextInt(6);
        } while (hb.g[var2_3] == 0);
        v0 = (int)var1_1;
        ** while (var3_2)
lbl16:
        // 1 sources

        if (v0 != 0) {
            var0.bc = var2_3;
            return;
        }
        var0.cc = var2_3;
    }

    static {
        c = new String[]{"Major", "Mr.Pip", "Rookie", "Xxxnator", "Kruger", "pipyaka", "Baba-Jaga", "p10ner", "ProNoob", "Butthead", "General", "Botters", "XYZB0T", "Catchme", "YellowButt", "YellowHead", "Brainless", "Bugman", "Mr.Head", "c001b0t", "Cpt.Death", "HumanKiller", "R.I.P.", "upyachka", "SuppaBOT", "Ikillyou", "iddqd", "headshot!", "ONOTOLE", "DSS-b0t"};
        t = 1;
        N = new int[14];
        bb = false;
    }
}

