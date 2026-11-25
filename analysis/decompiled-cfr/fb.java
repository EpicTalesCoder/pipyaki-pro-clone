/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class fb
implements c,
Runnable {
    public static boolean b;
    private boolean c = false;
    private long d = 0L;
    public static int e;
    public static int f;
    private static int g;
    public static int h;
    public tb i = null;
    public String j = "";
    private long k = 0L;
    private long l = 0L;
    private static final byte[][] m;
    private long n;
    private long o;
    public static int p;
    private int q;
    private int r;
    public static int s;
    private int t;
    private int u;
    private boolean v;
    public int w = -1;
    public byte x;
    public byte y;
    public int z;
    public boolean A;
    private int[] B = new int[4];
    private int C;
    private String D;
    private long E = 0L;
    private boolean F;
    private boolean G;
    private boolean H;
    public static fb I;
    private int J;
    private Thread K;
    public static int L;
    public static boolean M;
    public cb N;
    public e O;
    private byte[] P;
    private h Q;
    private boolean R;
    private int S = ab.oc.nextInt(200) + 100;
    private int T = 0;
    private int U = 0;
    private int V = -1;
    private static int W;
    private static int X;
    private static int Y;
    private static int Z;
    private int ab;
    private int bb;
    private boolean cb;
    private int db;
    private byte eb;
    private int fb;
    private int gb;
    private int[] hb = new int[]{0, 0};
    public static s ib;
    public static s jb;
    public static long kb;
    private static byte lb;
    private static int mb;
    private static long nb;
    private static boolean ob;
    public static pb pb;
    private static pb qb;
    public static pb rb;
    public static pb sb;
    public static pb tb;
    public static pb ub;
    public static pb vb;
    public static pb wb;
    public static pb xb;
    public static pb yb;
    public static pb zb;
    private static pb Ab;
    public static pb Bb;
    public static pb Cb;
    public static pb Db;
    public static pb Eb;
    public static pb Fb;
    public static pb Gb;
    public static pb Hb;
    public static pb Ib;
    public static pb Jb;
    public static pb Kb;
    public static pb Lb;
    public static pb Mb;
    public static pb Nb;
    public static pb Ob;
    public static pb Pb;
    public static pb Qb;
    public static pb Rb;
    public static pb Sb;
    public static pb Tb;
    public static pb Ub;
    public static pb Vb;
    public static pb Wb;
    public static pb Xb;
    private static pb Yb;
    private static pb Zb;
    private static pb ac;
    private static pb bc;
    private static pb cc;
    public static pb dc;
    public static pb ec;
    public static pb fc;
    public static pb gc;
    public static pb hc;
    public static pb ic;
    public static pb jc;
    public static pb kc;
    public static pb lc;
    public static pb mc;
    public static pb nc;
    public static pb oc;
    public static pb pc;
    private static pb qc;
    private static pb rc;
    private static pb sc;
    public static pb tc;
    public static pb uc;
    public static pb vc;
    public static pb wc;
    public static pb xc;
    public static pb yc;
    public static pb zc;
    public static pb Ac;
    private static pb Bc;
    public static Image Cc;
    public static pb Dc;
    public static pb Ec;
    public static pb Fc;
    public static pb Gc;
    public static pb Hc;
    public static pb Ic;
    public static pb Jc;
    public static pb Kc;
    public static pb Lc;
    public static pb Mc;
    private static pb Nc;
    private static pb[] Oc;
    public static pb Pc;
    private static pb[] Qc;
    public static pb Rc;
    public static pb Sc;
    public static pb Tc;
    public static pb Uc;
    public static pb Vc;
    public static pb Wc;
    public static pb Xc;
    public static pb Yc;
    public static pb Zc;
    public static pb ad;
    public static pb bd;
    public static pb cd;
    public static pb dd;
    public static pb ed;
    public static pb fd;
    public static pb gd;
    public static pb hd;
    public static pb id;
    public static pb jd;
    public static pb kd;
    public static pb ld;
    public static pb md;
    public static pb nd;
    public static pb od;
    private static pb pd;
    public static pb qd;
    public static pb rd;
    public static pb sd;
    public static pb td;
    public static pb ud;
    public static pb vd;
    private static pb wd;
    private static pb xd;
    public static pb yd;
    public static pb zd;
    public static pb Ad;
    public static pb Bd;
    private static pb Cd;
    private static pb Dd;
    private static Image Ed;
    private static pb Fd;
    private static int[] Gd;
    private static int[] Hd;
    public static int[] Id;
    public static int[] Jd;
    public static int Kd;
    public static int Ld;
    public static int Md;
    public static int Nd;
    private static Image Od;
    public static q Pd;
    public static Vector Qd;
    public static Vector Rd;
    public static Vector Sd;
    public static Vector Td;
    public static Vector Ud;
    public static Vector Vd;
    public static Vector Wd;
    public static Vector Xd;
    public static Vector Yd;
    public static Vector Zd;
    public static Vector ae;
    public static Vector be;
    public static l ce;
    public static l de;
    public static l ee;
    public static l fe;
    public static l ge;
    public static l he;
    public static l ie;
    public static l je;
    public static l ke;
    private byte le;
    private byte me;
    private byte ne;
    private byte oe;
    private byte pe;
    private byte qe;
    private byte re;
    private boolean se;
    private String te = "";
    private long ue;
    private static byte ve;
    private static byte we;
    private static byte xe;
    private static byte ye;
    private static byte ze;
    private static byte Ae;
    private static byte Be;
    public static byte Ce;
    public static o De;
    public static int Ee;
    public static int Fe;
    public static int Ge;
    public static int He;
    public static int Ie;
    public static int Je;
    private static int Ke;
    private static int Le;
    private static int Me;
    private static int Ne;
    public static String Oe;
    public static byte Pe;
    public static byte Qe;
    public static lb[][] Re;
    public static byte Se;
    public static byte Te;
    public static byte Ue;
    public static byte Ve;
    public static byte We;
    public static byte Xe;
    public static byte Ye;
    public static byte Ze;
    private static byte af;
    public static byte[][] bf;
    private static int cf;
    public static boolean df;
    private static boolean ef;
    public static boolean ff;
    private static int gf;
    private String hf = "";
    private long jf;
    public byte kf;
    private boolean lf;
    private int mf;
    private byte nf;
    private String of = "-";

    public fb() {
        I = this;
        fb fb2 = this;
        this.n = 0L;
        fb2.o = 0L;
        p = 0;
        fb2.q = 0;
        fb2.r = 0;
        s = 0;
        fb2.t = 0;
        fb2.u = 25;
        fb2.v = false;
    }

    public final boolean c() {
        return ab.o || this.F || this.G || this.H;
    }

    public final void b(boolean bl, boolean bl2) {
        block6: {
            block7: {
                String cfr_ignored_0 = "gp start " + bl + "," + bl2;
                String cfr_ignored_1 = "" + this.F + "," + this.G + "," + this.H;
                this.e();
                if (bl) {
                    this.J = 0;
                    this.K = new Thread(this);
                    this.K.start();
                    return;
                }
                this.F = false;
                if (this.c()) break block6;
                if (!M) break block7;
                this.O.h();
                if (!ab.xc) break block6;
            }
            if (!fb.i()) {
                this.N.b();
            }
        }
        if (ab.B.uc) {
            ab.B.uc = false;
            this.c(false, false);
        }
    }

    public final void b() {
        block6: {
            block7: {
                if (!fb.i() && Pd != null) {
                    qb.d(Pd);
                }
                System.gc();
                if (Pd != null) {
                    Pd.i();
                }
                if (this.c()) break block6;
                if (!M) break block7;
                this.O.g();
                if (!ab.xc) break block6;
            }
            if (!fb.i()) {
                this.N.a();
            }
        }
        this.F = true;
        this.e();
    }

    private static void a(int n2) {
        try {
            Thread.yield();
            Thread.sleep(50L);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void c() {
        block9: {
            int n2;
            boolean bl;
            block7: {
                bl = ab.xc;
                this.J = 1;
                this.K = null;
                this.Q = null;
                I = null;
                this.P = null;
                Cd = null;
                Ed = null;
                Dd = null;
                qb = null;
                vd = null;
                ad = null;
                Zc = null;
                bd = null;
                sb = null;
                Xc = null;
                Wc = null;
                Uc = null;
                rb = null;
                Bd = null;
                Ad = null;
                zd = null;
                wb = null;
                vb = null;
                ub = null;
                ud = null;
                md = null;
                ld = null;
                yd = null;
                fd = null;
                xb = null;
                ed = null;
                dd = null;
                td = null;
                sd = null;
                nd = null;
                gd = null;
                yb = null;
                Tc = null;
                Yc = null;
                cd = null;
                Ab = null;
                zb = null;
                Mb = null;
                Lb = null;
                Kb = null;
                Jb = null;
                Ib = null;
                Hb = null;
                Gb = null;
                Fb = null;
                Eb = null;
                Db = null;
                Cb = null;
                Bb = null;
                Qb = null;
                Pb = null;
                Ob = null;
                Nb = null;
                Vb = null;
                Ub = null;
                Tb = null;
                Sb = null;
                Rb = null;
                Xb = null;
                Wb = null;
                bc = null;
                ac = null;
                Zb = null;
                Yb = null;
                cc = null;
                ic = null;
                hc = null;
                gc = null;
                fc = null;
                ec = null;
                dc = null;
                Vc = null;
                tb = null;
                jc = null;
                lc = null;
                kc = null;
                mc = null;
                wd = null;
                xd = null;
                pd = null;
                nc = null;
                sc = null;
                rc = null;
                qc = null;
                pc = null;
                oc = null;
                hd = null;
                tc = null;
                Rc = null;
                Sc = null;
                vc = null;
                uc = null;
                xc = null;
                wc = null;
                yc = null;
                Bc = null;
                Ac = null;
                Cc = null;
                zc = null;
                kd = null;
                jd = null;
                id = null;
                Ec = null;
                Dc = null;
                Hc = null;
                Gc = null;
                Fc = null;
                Jc = null;
                Ic = null;
                Mc = null;
                Lc = null;
                Kc = null;
                rd = null;
                qd = null;
                od = null;
                Pc = null;
                Od = null;
                try {
                    for (n2 = 0; n2 < 3; ++n2) {
                        null[n2] = null;
                        if (bl) break block7;
                        if (!bl) continue;
                        break;
                    }
                }
                catch (Exception exception) {}
                Oc = null;
                Nc = null;
            }
            try {
                for (n2 = 0; n2 < 3; ++n2) {
                    null[n2] = null;
                    if (bl) break block9;
                    if (!bl) continue;
                    break;
                }
            }
            catch (Exception exception) {}
            Qc = null;
            Pd = null;
            Qd = null;
            Rd = null;
            Sd = null;
            Td = null;
            Ud = null;
            Vd = null;
            Wd = null;
            Xd = null;
            Yd = null;
            Zd = null;
            ae = null;
            be = null;
            je = null;
            ke = null;
            ie = null;
            he = null;
            ge = null;
            fe = null;
            ee = null;
            de = null;
            ce = null;
            jb = null;
            ib = null;
            this.te = null;
            Oe = null;
            Re = null;
            bf = null;
            s.B = null;
            q.Vc = null;
            hb.Q = null;
            y.P = null;
            y.O = null;
            q.W = 0;
        }
        if (Pd != null) {
            fb.Pd.X = 0;
        }
        rc.f = 0L;
        rc.g = true;
        rc.h = 3;
        rc.i = 0;
        rc.j = -1;
    }

    private static void b(int n2, int n3, o o2) {
        block15: {
            block14: {
                boolean bl = ab.xc;
                if (o2 == null) break block14;
                De = o2;
                o o3 = o2;
                n2 = o3.c / 10;
                o3 = o2;
                n3 = o3.d / 10;
                if (De == Pd) {
                    switch (((q)fb.De).ub) {
                        case 0: {
                            n3 += ab.E / 4;
                            if (!bl) break;
                        }
                        case 1: {
                            n2 -= ab.D / 4;
                            if (!bl) break;
                        }
                        case 2: {
                            n3 -= ab.E / 4;
                            if (!bl) break;
                        }
                        case 3: {
                            n2 += ab.D / 4;
                        }
                    }
                }
                Ie = n2;
                Je = n3;
                if (!bl) break block15;
            }
            Ie = n2;
            Je = n3;
        }
        Je -= ab.E / 2;
        if ((Ie -= ab.D / 2) < 0) {
            Ie = 0;
        }
        if (Ie + ab.D > Pe * 30) {
            Ie = Pe * 30 - ab.D;
        }
        if (Je < 0) {
            Je = 0;
        }
        if (Je + ab.E > Qe * 30) {
            Je = Qe * 30 - ab.E;
        }
    }

    public final void d() {
        int n2;
        block3: {
            boolean bl = ab.xc;
            Qd = new Vector();
            Rd = new Vector();
            Sd = new Vector();
            Td = new Vector();
            Ud = new Vector();
            Vd = new Vector();
            Wd = new Vector();
            Xd = new Vector();
            Yd = new Vector();
            Zd = new Vector();
            ae = new Vector();
            be = new Vector();
            Re = new lb[Pe][Qe];
            bf = new byte[Pe][Qe];
            int n3 = 0;
            while (n3 < Pe) {
                block4: {
                    n2 = 0;
                    if (bl) break block3;
                    for (int i2 = v8386; i2 < Qe; ++i2) {
                        fb.Re[n3][i2] = new lb(this);
                        fb.bf[n3][i2] = 0;
                        if (!bl) {
                            if (!bl) continue;
                        }
                        break block4;
                    }
                    ++n3;
                }
                if (!bl) continue;
            }
            Ke = 0;
            Le = 0;
            Ne = 0;
            n2 = 0;
        }
        Me = n2;
    }

    public static void b(o o2, boolean bl) {
        if (o2 != null) {
            boolean bl2 = true;
            if (o2 instanceof q && ((q)o2).m()) {
                bl2 = false;
            }
            if (bl2) {
                Be = 0;
                De = o2;
                return;
            }
        }
        Be = we;
        if (bl) {
            Be = xe;
        }
        Ee = Ge + ab.D / 2;
        Fe = He + ab.E / 2;
        De = null;
    }

    public static void b(int n2, int n3) {
        if (n3 < 5) {
            n3 = 5;
        }
        int n4 = n2;
        if (n2 < 0) {
            n4 = Math.abs(n2);
        }
        if (n4 == 0) {
            return;
        }
        Ke = ab.oc.nextInt(n4) - ab.oc.nextInt(n4);
        Le = ab.oc.nextInt(n4) - ab.oc.nextInt(n4);
        Me = n4;
        Ne = n3;
    }

    public final void e() {
        this.le = 0;
        this.me = 0;
        this.ne = 0;
        this.oe = 0;
        this.pe = 0;
        this.se = false;
    }

    private static void b(Graphics graphics, j object) {
        block13: {
            int n2;
            int n3;
            int n4;
            int n5;
            block17: {
                block16: {
                    boolean bl;
                    block15: {
                        block14: {
                            bl = ab.xc;
                            if (((j)object).w <= 0) break block13;
                            n5 = 0;
                            n4 = 12;
                            n3 = 0;
                            if (!ab.Jb) break block14;
                            n4 -= 3;
                            if (!bl) break block15;
                        }
                        if (((j)object).d == 0) {
                            n4 += 5;
                        }
                        if (((j)object).w - 1 == 7 || ((j)object).w - 1 == 8) {
                            if (((j)object).w - 1 == 7) {
                                --n5;
                            }
                            n4 -= 12;
                            if (((j)object).d != 0) {
                                n4 -= 5;
                            }
                        }
                        if (((j)object).w - 1 == 0) {
                            n4 += 5;
                        }
                        if (zb != null && ((j)object).w - 1 < 7) {
                            n3 = 4;
                            if (o.c(((j)object).c(), ((j)object).d(), fb.zb.d, fb.zb.e)) {
                                zb.b(((j)object).c() - fb.zb.d / 2 - Ge, ((j)object).d() - fb.zb.e / 2 - He);
                                zb.b(graphics);
                            }
                        }
                    }
                    if (!o.c(((j)object).c() + n5, ((j)object).d() - ((j)object).e.e + n4, fb.Ab.d, fb.Ab.e)) break block13;
                    n2 = ((j)object).w - 1;
                    if (n2 != 7 && n2 != 8) break block16;
                    n2 = 1;
                    if (!bl) break block17;
                }
                n2 = 0;
            }
            n4 = ((j)object).d() - ((j)object).e.e + n4;
            n5 = ((j)object).c() + n5;
            object = Ab;
            int n6 = ab.D / 2 - (n5 - Ge);
            int n7 = ab.E / 2 - (n4 - He);
            n6 = n6 * n3 * 3 / (ab.D / 2);
            n7 = n7 * n3 * 3 / (ab.E / 2);
            ((pb)object).b = n2;
            ((pb)object).b(n5 - n6 - ((pb)object).d / 2 - Ge, n4 - n7 - ((pb)object).e / 2 - He);
            ((pb)object).b(graphics);
        }
    }

    private void f() {
        block12: {
            block11: {
                int n2;
                boolean bl = ab.xc;
                if (Qd == null) {
                    return;
                }
                int n3 = Qd.size();
                if (ab.g()) {
                    ++n3;
                }
                Y = ab.D / qb.ob;
                int n4 = 0;
                for (n2 = 0; n2 < Qd.size(); ++n2) {
                    int n5;
                    Object object = (q)Qd.elementAt(n2);
                    if (object == null || (object = ((q)object).z) == null || ((String)object).equals("") || (n5 = ab.C.b((String)object)) <= n4) continue;
                    n4 = n5;
                    if (!bl) continue;
                }
                n2 = n4 / qb.ob + 1;
                if (ab.g()) {
                    ++n2;
                }
                if (n2 * qb.ob < n4) {
                    ++n2;
                }
                if (Y > n2 + 3) {
                    Y = n2 + 3;
                }
                W = (ab.D - qb.ob * Y) / 2;
                Z = ab.E / qb.pb;
                if (Z > n3 + 1) {
                    Z = n3 + 1;
                }
                if ((X = (ab.E - qb.pb * Z) / 2) == 0) {
                    --Z;
                    X += qb.pb / 2;
                }
                if (Z >= n3 + 1) break block11;
                this.bb = (n3 - Z + 1) * qb.pb;
                if (!bl) break block12;
            }
            this.bb = 0;
        }
        this.ab = 0;
    }

    private void g() {
        if (!this.R) {
            return;
        }
        this.R = true;
        this.eb = (byte)-1;
        if (this.gb == 0) {
            this.gb = 1;
        }
    }

    private void h() {
        this.ab = 0;
        this.cb = false;
        this.db = 40;
        this.eb = 1;
        this.gb = this.fb;
    }

    private void a(Graphics graphics) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        boolean bl;
        block14: {
            bl = ab.xc;
            n6 = X;
            for (int i2 = 1; i2 <= Z; ++i2) {
                int n7;
                int n8;
                block15: {
                    n5 = W;
                    n4 = 1;
                    if (bl) break block14;
                    for (n3 = v8837; n3 <= Y; ++n3) {
                        int n9;
                        block20: {
                            block21: {
                                block19: {
                                    block17: {
                                        block18: {
                                            block16: {
                                                n8 = n3;
                                                n7 = 1;
                                                if (bl) break block15;
                                                if (n8 != n7) break block16;
                                                n2 = 0;
                                                if (!bl) break block17;
                                            }
                                            if (n3 != Y) break block18;
                                            n2 = qb.ob << 1;
                                            if (!bl) break block17;
                                        }
                                        n2 = qb.ob;
                                    }
                                    if (i2 != 1) break block19;
                                    n9 = 0;
                                    if (!bl) break block20;
                                }
                                if (i2 != Z) break block21;
                                n9 = qb.pb << 1;
                                if (!bl) break block20;
                            }
                            n9 = qb.pb;
                        }
                        graphics.drawRegion(qb.X, n2, n9, qb.ob, qb.pb, 0, n5, n6 + this.gb, 0);
                        n5 += qb.ob;
                        if (!bl) continue;
                    }
                    n8 = n6;
                    n7 = qb.pb;
                }
                n6 = n8 + n7;
                if (!bl) continue;
            }
            n5 = W + 12;
            n4 = (qb.pb - ab.C.c()) / 2;
        }
        n2 = n4;
        graphics.setClip(0, this.gb + X + qb.pb / 2, ab.D, qb.pb * (Z - 1));
        for (n3 = 0; n3 < Qd.size(); ++n3) {
            q q2 = (q)Qd.elementAt(n3);
            if (q2 == null) continue;
            n6 = this.gb + X + qb.pb * q2.B + n2 - this.ab - qb.pb / 2;
            if (ab.g()) {
                n6 += qb.pb;
            }
            String string = q2.u() + q2.z;
            if (fb.j() == 2) {
                if (ib != null && fb.ib.H == q2) {
                    string = string + "^16~";
                }
                if (jb != null && fb.jb.H == q2) {
                    string = string + "^18~";
                }
            }
            ab.C.b(graphics, string, n5 - 5, n6, -1, 0);
            ab.C.b(graphics, "" + q2.A, ab.D - n5, n6, -1, 1);
            if (!bl) continue;
        }
        if (ab.g()) {
            n6 = this.gb + X + qb.pb + n2 - this.ab - qb.pb / 2;
            graphics.setColor(0xFFFFFF);
            graphics.drawLine(n5, n6 + qb.pb - 4, ab.D - n5, n6 + qb.pb - 4);
            ab.C.b(graphics, "^7~" + this.hb[0], n5 - 5, n6, -1, 0);
            ab.C.b(graphics, "^2~" + this.hb[1], ab.D - n5, n6, -1, 1);
        }
        graphics.setClip(0, 0, ab.D, ab.E);
    }

    private void b(byte by, byte by2, byte by3, boolean bl) {
        block8: {
            block9: {
                q q2;
                boolean bl2;
                block11: {
                    block10: {
                        bl2 = ab.xc;
                        if (by == -1) break block8;
                        q2 = q.d(by);
                        if (q2 == null) break block9;
                        if (!bl) break block10;
                        q2.A += 5;
                        if (!bl2) break block11;
                    }
                    ++q2.A;
                    if (ab.m == 1) {
                        byte by4 = q2.x;
                        this.hb[by4] = this.hb[by4] + 1;
                    }
                    q q3 = q.d(by2);
                    this.Q.b(q2.u() + q2.y + " (" + q2.A + ")" + hb.b((int)by3) + q3.u() + q3.y);
                }
                if (q2.B == 1) {
                    return;
                }
                by3 = 1;
                while (by3 != 0) {
                    by3 = 0;
                    for (by2 = 0; by2 < Qd.size(); by2 = (byte)(by2 + 1)) {
                        q q4 = (q)Qd.elementAt(by2);
                        if (q4 == null || q2.A <= q4.A || q2.B <= q4.B) continue;
                        by3 = (byte)q4.B;
                        q4.B = q2.B;
                        q2.B = by3;
                        by3 = 1;
                        if (!bl2) continue;
                    }
                }
            }
            return;
        }
        q q5 = q.d(by2);
        if (q5 != null) {
            this.Q.b(q5.u() + q5.y + "^9~");
        }
    }

    public static boolean i() {
        return L == 0;
    }

    public static byte j() {
        if (fb.i()) {
            return 1;
        }
        return ab.m;
    }

    public static void k() {
        boolean bl = ab.xc;
        if (bf != null) {
            for (byte by = 0; by < Pe; by = (byte)(by + 1)) {
                for (byte by2 = 0; by2 < Qe; by2 = (byte)(by2 + 1)) {
                    if (fb.Re[by][by2].d != null || by == 0 || by2 == 0 || by == Pe - 1 || by2 == Qe - 1) {
                        fb.bf[by][by2] = 0;
                        if (!bl) continue;
                    }
                    if (fb.Re[by][by2].c > 0 && fb.Re[by][by2].c <= 16) {
                        fb.bf[by][by2] = ab.vc;
                        if (!bl) continue;
                    }
                    fb.bf[by][by2] = ab.uc;
                    if (!bl) continue;
                }
                if (!bl) continue;
            }
        }
    }

    public static void b(byte by) {
        boolean bl = ab.xc;
        if (Sd != null) {
            for (int i2 = 0; i2 < Sd.size(); ++i2) {
                g g2 = (g)Sd.elementAt(i2);
                if ((by != 0 || g2.d != 4) && (by != 1 || g2.d != 5)) continue;
                if (by == 0) {
                    ib.d(g2.b, g2.c);
                    if (!bl) continue;
                }
                jb.d(g2.b, g2.c);
                if (!bl) continue;
            }
        }
    }

    public static boolean c(byte by) {
        byte by2;
        boolean bl = ab.xc;
        if (Sd != null) {
            for (int i2 = 0; i2 < Sd.size(); ++i2) {
                g g2 = (g)Sd.elementAt(i2);
                by2 = by;
                if (!bl) {
                    if ((by2 != 0 || g2.d != 4) && (by != 1 || g2.d != 5) || !(by == 0 ? fb.ib.g == g2.b && fb.ib.h == g2.c : fb.jb.g == g2.b && fb.jb.h == g2.c)) continue;
                    return true;
                }
                break;
            }
        } else {
            by2 = 0;
        }
        return by2 != 0;
    }

    public static byte b(q q2) {
        if (ib != null && jb != null) {
            if (fb.ib.H == q2) {
                return 0;
            }
            if (fb.jb.H == q2) {
                return 1;
            }
        }
        return -1;
    }

    public final void b(byte by, byte by2, byte by3, byte by4, byte by5, byte by6) {
        byte by7;
        Object object;
        block13: {
            block14: {
                block18: {
                    boolean bl;
                    block17: {
                        s s2;
                        block15: {
                            block16: {
                                bl = ab.xc;
                                s2 = by == 0 ? ib : jb;
                                object = q.d(by3);
                                String cfr_ignored_0 = "" + by + "," + by2 + "," + by3 + "," + by4 + "," + by5 + "," + by6;
                                if (s2 == null) break block14;
                                if (by2 == 0) {
                                    s2.g();
                                }
                                if (by2 == 1) {
                                    s2.H = null;
                                    s2.d(by4, by5);
                                }
                                if (object != null && by2 == 2) {
                                    s2.H = object;
                                }
                                if (object == null || by6 == 0) break block14;
                                if (by6 != 1) break block15;
                                if (by != 0) break block16;
                                this.Q.b(((q)object).u() + ((q)object).y + " (" + ((q)object).A + ")" + "^16~");
                                if (!bl) break block14;
                            }
                            this.Q.b(((q)object).u() + ((q)object).y + " (" + ((q)object).A + ")" + "^18~");
                            if (!bl) break block14;
                        }
                        if (by6 != 2) break block17;
                        byte by8 = ((q)object).x;
                        this.hb[by8] = this.hb[by8] + 1;
                        this.b(((q)object).w, (byte)0, (byte)0, true);
                        this.Q.b(((q)object).u() + ((q)object).y + " (" + ((q)object).A + ")" + "^20~");
                        if (Sd != null) {
                            for (int i2 = 0; i2 < Sd.size(); ++i2) {
                                object = (g)Sd.elementAt(i2);
                                by7 = s2.G;
                                if (bl) break block13;
                                if ((by7 != 0 || ((g)object).d != 5) && (s2.G != 1 || ((g)object).d != 4)) continue;
                                new w(mc, ((g)object).b * 30 + 15, ((g)object).c * 30 + 15, 11, true, 0);
                                if (bl) {
                                    if (!bl) continue;
                                }
                                break block14;
                            }
                        }
                        break block14;
                    }
                    if (by6 != 3) break block14;
                    if (((q)object).x != 0) break block18;
                    this.Q.b(((q)object).u() + ((q)object).y + " (" + ((q)object).A + ")" + "^17~");
                    if (!bl) break block14;
                }
                this.Q.b(((q)object).u() + ((q)object).y + " (" + ((q)object).A + ")" + "^19~");
            }
            by7 = M;
        }
        if (by7 != 0) {
            byte by9 = by6;
            by6 = by5;
            by5 = by4;
            by4 = by3;
            by3 = by2;
            by2 = by;
            fb fb2 = this;
            byte[] byArray = new byte[7];
            object = byArray;
            byArray[0] = 20;
            object[1] = by2;
            object[2] = by3;
            object[3] = by4;
            object[4] = by5;
            object[5] = by6;
            object[6] = by9;
            fb2.a((byte[])object);
        }
    }

    public static byte b(byte by, byte by2) {
        if (Re != null && o.b(by, by2)) {
            if (fb.Re[by][by2].c == 0) {
                return 0;
            }
            if (fb.Re[by][by2].c > 0 && fb.Re[by][by2].c <= 16) {
                return 3;
            }
        }
        return 0;
    }

    public static byte[] b(byte by, byte by2, byte by3, byte by4) {
        boolean bl = ab.xc;
        byte by5 = by;
        byte by6 = by2;
        switch (by3) {
            case 0: {
                by6 = (byte)(by2 + by4);
                if (!bl) break;
            }
            case 1: {
                by5 = (byte)(by - by4);
                if (!bl) break;
            }
            case 2: {
                by6 = (byte)(by2 - by4);
                if (!bl) break;
            }
            case 3: {
                by5 = (byte)(by + by4);
            }
        }
        return new byte[]{by5, by6};
    }

    private static void l() {
        int n2 = ab.oc.nextInt(ab.D) + Ge;
        int n3 = ab.oc.nextInt(ab.E) + He;
        w w2 = new w(null, n2, n3, 12, true, 1);
        w2.h.b(new byte[]{0, 1, 2, 3, 4}, false, false, (byte)1);
    }

    public final void b(byte[] byArray) {
        this.O.b(byArray);
    }

    public final void b(long l2) {
        this.jf = l2;
    }

    public final boolean b() {
        return M;
    }

    public final boolean d(byte by) {
        fb fb2 = this;
        if (M && by > 1) {
            return by <= this.O.b() + 1;
        }
        return false;
    }

    public final boolean e(byte by) {
        fb fb2 = this;
        if (M) {
            if (by == 1) {
                return true;
            }
            if (this.d(by)) {
                return true;
            }
        }
        return false;
    }

    public final void b(int n2) {
        if (ab.o) {
            String cfr_ignored_0 = "serv=" + n2;
        }
        if (n2 == 2) {
            fb.b(null, false);
            this.R = true;
            this.h();
            this.H = true;
            if (Pd != null) {
                qb.d(Pd);
                return;
            }
        } else if (n2 == 0) {
            this.G = true;
            if (Pd != null) {
                qb.d(Pd);
                return;
            }
        } else if (n2 == 1) {
            this.G = false;
        }
    }

    public final void b(String string) {
        this.of = this.of + string;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void b(byte var1_1, String var2_4) {
        block57: {
            block44: {
                block56: {
                    block43: {
                        block55: {
                            block54: {
                                block53: {
                                    block52: {
                                        block42: {
                                            block50: {
                                                block51: {
                                                    block45: {
                                                        var6_7 = ab.xc;
                                                        ab.q += 3;
                                                        this.Q = new h();
                                                        ++ab.q;
                                                        "starting level " + ab.bc;
                                                        fb.ef = false;
                                                        fb.ff = false;
                                                        fb.gf = -1;
                                                        fb.h = 0;
                                                        fb.e = 0;
                                                        ab.w = false;
                                                        this.a((String)var2_4);
                                                        if (fb.M && ab.m == 2) {
                                                            y.k();
                                                        }
                                                        fb.q();
                                                        ++ab.q;
                                                        if (!fb.M) break block45;
                                                        var3_8 = this.O.b() + 1;
                                                        var4_14 = ab.Lb;
                                                        this.O.b((String)var2_4, var3_8 += var4_14, q.b(var3_8), ab.m, false, ab.n);
                                                        var2_4 = q.d(1);
                                                        var2_4.b(ab.Kb);
                                                        var5_18 = 0;
                                                        for (var2_5 = var3_8 - var4_14; var2_5 < var3_8; ++var2_5) {
                                                            block47: {
                                                                block49: {
                                                                    block48: {
                                                                        block46: {
                                                                            var4_15 = (q)fb.Qd.elementAt(var2_5);
                                                                            v0 = ab.dc;
                                                                            if (var6_7) break block42;
                                                                            if (v0 != 0) break block46;
                                                                            var5_18 = ab.oc.nextInt(9);
                                                                            if (!var6_7) break block47;
                                                                        }
                                                                        if (ab.dc != 1) break block48;
                                                                        var5_18 = ab.oc.nextInt(3);
                                                                        if (!var6_7) break block47;
                                                                    }
                                                                    if (ab.dc != 2) break block49;
                                                                    var5_18 = ab.oc.nextInt(3) + 3;
                                                                    if (!var6_7) break block47;
                                                                }
                                                                if (ab.dc == 3) {
                                                                    var5_18 = ab.oc.nextInt(3) + 6;
                                                                }
                                                            }
                                                            var4_15.Cc = new y(var4_15, (byte)var5_18);
                                                            this.b((int)var4_15.w, var4_15.y);
                                                            if (!var6_7) continue;
                                                        }
                                                        this.b(1, ab.Kb);
                                                        break block50;
                                                    }
                                                    if (!fb.i()) break block51;
                                                    new q(0, 0);
                                                    if (!var6_7) break block50;
                                                }
                                                q.b(this.P);
                                                this.N.c(this.P.length / 3);
                                            }
                                            ab.q += 5;
                                            fb.Be = 0;
                                            fb.Pd = q.d(var1_1);
                                            v0 = fb.i();
                                        }
                                        if (v0 == 0) break block52;
                                        fb.Pd.b(ab.Vb, ab.Wb, ab.Xb, ab.Qb);
                                        if (!var6_7) break block53;
                                    }
                                    fb.Pd.b(ab.jc, ab.kc, ab.lc, ab.Rb);
                                }
                                this.j = "^41~" + fb.Pd.C;
                                this.a(true);
                                this.a(false);
                                if (!fb.i()) {
                                    this.b(var1_1, fb.Pd);
                                }
                                fb.b(fb.Pd, false);
                                if (fb.De != null) break block54;
                                fb.Ge = fb.Ee = fb.Pe * 30 / 2 - ab.D / 2;
                                fb.He = fb.Fe = fb.Qe * 30 / 2 - ab.E / 2;
                                if (!fb.i()) break block55;
                                var4_16 = 0;
                                block1: for (var2_6 = 0; var2_6 < 2; ++var2_6) {
                                    v1 = var4_16;
                                    if (var6_7) break block43;
                                    if (v1 != 0) break;
                                    for (var5_18 = 0; var5_18 < fb.ae.size(); ++var5_18) {
                                        v2 /* !! */  = (sb)fb.ae.elementAt(var5_18);
                                        if (!var6_7) {
                                            if (v2 /* !! */  == null || (var2_6 != 0 || !var3_9.i) && (var2_6 != 1 || var3_9.o != 0)) continue;
                                            fb.Ge = fb.Ee = var3_9.c * 30 + 15;
                                            fb.He = fb.Fe = var3_9.d * 30 + 15;
                                            var4_16 = 1;
                                            if (var2_6 != 1) continue block1;
                                            fb.Be = fb.xe;
                                            if (!var6_7) continue block1;
                                            if (!var6_7) continue;
                                        }
                                        ** GOTO lbl131
                                    }
                                    if (!var6_7) continue;
                                }
                                if (!var6_7) break block55;
                            }
                            var1_2 = fb.De;
                            fb.Ge = fb.Ee = var1_2.c / 10 - ab.D / 2;
                            var1_2 = fb.De;
                            fb.He = fb.Fe = var1_2.d / 10 - ab.E / 2;
                        }
                        this.f();
                        v1 = (ab.q += 2) + 1;
                    }
                    ab.q = v1;
                    this.gb = this.fb = ab.E - fb.X;
                    this.eb = 1;
                    this.R = true;
                    if (this.K != null) {
                        "loading done " + this.K.isAlive();
                    }
                    fb.g = 0;
                    for (var3_10 = 0; var3_10 < fb.ae.size(); ++var3_10) {
                        var4_17 = (sb)fb.ae.elementAt(var3_10);
                        v3 = var4_17.j;
                        v4 = 2;
                        if (!var6_7) {
                            if (v3 == v4 || var4_17.n == 1) continue;
                            fb.g += var4_17.q;
                            if (!var6_7) continue;
                        }
                        break block44;
                    }
                    this.d = System.currentTimeMillis();
                    fb.f = 0;
                    "loaded = " + ab.q;
                    ab.q = 0;
                    if (fb.Zd == null) break block56;
                    for (var4_16 = 0; var4_16 < fb.Zd.size(); ++var4_16) {
                        v2 /* !! */  = fb.Zd.elementAt(var4_16);
lbl131:
                        // 2 sources

                        var3_11 = (v)v2 /* !! */ ;
                        v3 = var3_11.d;
                        v4 = 7;
                        if (!var6_7) {
                            if (v3 != v4) continue;
                            var3_11.b(null);
                            if (!var6_7) continue;
                        }
                        break block44;
                    }
                }
                if (fb.i()) {
                    fb.df = true;
                    if (fb.ae != null) {
                        for (var3_12 = 0; var3_12 < fb.ae.size(); ++var3_12) {
                            ((sb)fb.ae.elementAt(var3_12)).b();
                            if (!var6_7) {
                                if (!var6_7) continue;
                            }
                            break;
                        }
                    } else {
                        if (!ab.v && fb.Pd != null) {
                            q.b(fb.Pd);
                            fb.Pd.jc = 0L;
                            fb.b(fb.Pd, false);
                        }
                        ab.y = ab.E * 10 / 100;
                        ab.x = 1;
                    }
                    if (ab.v) {
                        ab.w = true;
                        if (ab.bc == 0) {
                            var1_3 = q.d(2);
                            q.d(2).nc = -1;
                            var1_3.bc = 1;
                            var1_3.Cc.z = 0;
                            fb.b(var1_3, true);
                            var1_3.Cc.F = true;
                            y.c(var1_3);
                        }
                    }
                }
                ab.t = -1;
                if (!fb.i()) break block57;
                v3 = ab.bc;
                v4 = 8;
            }
            if (v3 != v4 && (var3_13 = ib.b("/lang_map" + ab.bc + ".txt", 0)) != null && !var3_13.equals("")) {
                this.i = new tb();
                this.i.f = 4;
                qb.Q.b = 0;
                this.i.b(fb.xb);
                this.i.b(var3_13);
                this.i.b();
            }
        }
        ab.o = false;
    }

    private static boolean m() {
        return ab.Cb && L == 0 && !ab.Jb;
    }

    public final void c(boolean n2, boolean n3) {
        block29: {
            block30: {
                boolean bl;
                block22: {
                    block26: {
                        block28: {
                            block27: {
                                block25: {
                                    boolean bl2;
                                    int n4;
                                    block24: {
                                        block23: {
                                            block21: {
                                                block20: {
                                                    bl = ab.xc;
                                                    n4 = ab.Ub;
                                                    if (n2 != 0 && this.c && n3 == 0) {
                                                        return;
                                                    }
                                                    bl2 = false;
                                                    this.e();
                                                    this.w = -1;
                                                    if (n2 != 0 && ab.t == -1 && n3 == 0) {
                                                        ab.t = 35;
                                                        ab.u = 35;
                                                        return;
                                                    }
                                                    ab.o = true;
                                                    ab.w = false;
                                                    n3 = 0;
                                                    if (n2 == 0) break block20;
                                                    if ((ab.Ub = (byte)(ab.Ub + 1)) > ab.Tb) {
                                                        bl2 = true;
                                                        ab.Tb = ab.Ub;
                                                        qb.o();
                                                    }
                                                    if (!ab.e(ab.Ub)) {
                                                        ab.Ub = (byte)(ab.Ub - 1);
                                                        n3 = 1;
                                                    }
                                                    qb.c(Pd);
                                                    if (!bl) break block21;
                                                }
                                                n3 = 2;
                                            }
                                            if (n3 == 0 && ab.Ub == 1) {
                                                ab.o = true;
                                                ab.l = 1;
                                                ab.B.vc = 0;
                                                ab.A.b();
                                                ab.z.repaint();
                                                ab.B.K();
                                                return;
                                            }
                                            this.i = new tb();
                                            this.i.f = n3;
                                            if (n3 != 0 && n3 != 1) break block22;
                                            qb.Q.b = 3;
                                            this.i.b(qb.Q);
                                            if (n3 != 1) break block23;
                                            this.i.b(ib.c(22));
                                            this.i.b("");
                                            this.i.b(ib.c(40) + n4 + ":");
                                            if (!bl) break block24;
                                        }
                                        this.i.b(ib.c(21));
                                        this.i.b("");
                                        this.i.b(ib.c(40) + n4 + ":");
                                    }
                                    this.i.b(ib.c(41) + q.W + "/" + g);
                                    this.i.b(ib.c(42) + e + "/" + h);
                                    this.i.b(ib.c(43) + f);
                                    if (bl2) {
                                        n2 = (fb.r() * f + 50) / 100;
                                        Pd.b(fb.Pd.C + n2, false);
                                        qb.c(Pd);
                                        this.i.b(ib.c(44) + " (" + fb.r() + "%): " + n2);
                                    }
                                    this.i.b(ib.c(45) + ab.Qb);
                                    StringBuffer stringBuffer = new StringBuffer().append(ib.c(46));
                                    long l2 = System.currentTimeMillis() - this.d;
                                    n2 = (int)((l2 /= 1000L) % 60L);
                                    n3 = (int)((l2 /= 60L) % 60L);
                                    n4 = (int)(l2 / 60L);
                                    String string = "" + n4 + ":";
                                    if (n3 < 10) {
                                        string = string + "0";
                                    }
                                    string = string + n3 + ":";
                                    if (n2 < 10) {
                                        string = string + "0";
                                    }
                                    string = string + n2;
                                    this.i.b(stringBuffer.append(string).toString());
                                    if (g != 0 || h != 0) break block25;
                                    n2 = 100;
                                    if (!bl) break block26;
                                }
                                if (g != 0) break block27;
                                n2 = e * 100 / h;
                                if (!bl) break block26;
                            }
                            if (h != 0) break block28;
                            n2 = q.W * 100 / g;
                            if (!bl) break block26;
                        }
                        n2 = (q.W * 100 / g + e * 100 / h) / 2;
                    }
                    this.i.b(ib.c(47) + n2 + "%");
                    break block29;
                }
                qb.Q.b = 1;
                this.i.b(qb.Q);
                this.i.b(ib.c(23));
                this.i.b("");
                if (fb.Pd.dc[5] > 0) break block30;
                this.i.f = 5;
                this.i.b(ib.c(48));
                this.i.b(ib.c(49));
                if (!bl) break block29;
            }
            fb.Pd.dc[5] = fb.Pd.dc[5] - 1;
            this.i.b(ib.c(50 + ab.oc.nextInt(7)));
            this.i.b("");
            this.i.b(ib.c(57) + fb.Pd.dc[5]);
        }
        this.i.b();
        ab.o = false;
    }

    public final int c(byte[] byArray) {
        if (byArray == null) {
            return 0;
        }
        if (byArray.length < 2) {
            return 0;
        }
        if (byArray[0] == 3 || byArray[0] == 4 || byArray[0] == 5 || byArray[0] == 15 || byArray[0] == 2 || byArray[0] == 8) {
            return byArray[1];
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean b(byte[] var1_1, boolean var2_4) {
        block146: {
            block156: {
                block155: {
                    block167: {
                        block154: {
                            block175: {
                                block168: {
                                    block164: {
                                        block166: {
                                            block165: {
                                                block160: {
                                                    block161: {
                                                        block163: {
                                                            block162: {
                                                                block147: {
                                                                    block144: {
                                                                        block145: {
                                                                            block157: {
                                                                                var11_25 = ab.xc;
                                                                                if (ab.o && var1_1 /* !! */ [0] != 1) {
                                                                                    return false;
                                                                                }
                                                                                ++this.mf;
                                                                                this.nf = var1_1 /* !! */ [0];
                                                                                if (var1_1 /* !! */ [0] == 1) {
                                                                                    if (this.N.b == 6) {
                                                                                        return true;
                                                                                    }
                                                                                    var2_5 = new ByteArrayInputStream(var1_1 /* !! */ );
                                                                                    var2_5.read();
                                                                                    ab.m = (byte)var2_5.read();
                                                                                    var2_5.read();
                                                                                    ab.n = (byte)var2_5.read() == 1;
                                                                                    var3_26 = (byte)var2_5.read();
                                                                                    this.N.d(var3_26);
                                                                                    var4_34 = var2_5.read();
                                                                                    var5_40 = new byte[var4_34];
                                                                                    var2_5.read(var5_40);
                                                                                    fb.Oe = new String(var5_40);
                                                                                    var4_34 = var2_5.read();
                                                                                    var5_40 = new byte[var4_34 * 3];
                                                                                    var2_5.read(var5_40);
                                                                                    this.P = var5_40;
                                                                                    this.b((int)var3_26, ab.Kb);
                                                                                    ab.B.b((int)var3_26, true);
                                                                                    this.N.b = 6;
                                                                                    return true;
                                                                                }
                                                                                if (var1_1 /* !! */ [0] != 13) break block144;
                                                                                var2_6 = new ByteArrayInputStream(var1_1 /* !! */ );
                                                                                var2_6.read();
                                                                                var3_27 = (byte)var2_6.read();
                                                                                var4_35 = var2_6.read();
                                                                                var5_41 = new byte[var4_35];
                                                                                var2_6.read(var5_41);
                                                                                var6_45 = new String(var5_41);
                                                                                if (!fb.M) break block157;
                                                                                var7_48 = q.d(var3_27);
                                                                                if (var7_48 != null) {
                                                                                    var7_48.b(var6_45);
                                                                                }
                                                                                var8_51 = 0;
                                                                                for (var9_53 = 0; var9_53 < fb.Qd.size(); ++var9_53) {
                                                                                    block159: {
                                                                                        block158: {
                                                                                            v0 = (q)fb.Qd.elementAt(var9_53);
                                                                                            if (var11_25) break block145;
                                                                                            if (v0 == null) continue;
                                                                                            if (var8_51 != 0) break block158;
                                                                                            var1_1 /* !! */  = (byte[])var6_45;
                                                                                            if (!var11_25) break block159;
                                                                                        }
                                                                                        var1_1 /* !! */  = var6_45 + "_" + var8_51;
                                                                                    }
                                                                                    if (!var1_1 /* !! */ .equals(var7_48.y)) continue;
                                                                                    ++var8_51;
                                                                                    if (!var11_25) continue;
                                                                                }
                                                                                if (var8_51 > 0) {
                                                                                    var6_45 = var6_45 + "_" + var8_51;
                                                                                }
                                                                            }
                                                                            v0 = var7_48 = q.d(var3_27);
                                                                        }
                                                                        if (v0 != null) {
                                                                            var7_48.b(var6_45);
                                                                            if (fb.M) {
                                                                                this.b((int)var3_27, var6_45);
                                                                            }
                                                                            this.f();
                                                                            return true;
                                                                        }
                                                                        return false;
                                                                    }
                                                                    if (var1_1 /* !! */ [0] == 9) {
                                                                        var2_7 = q.d(var1_1 /* !! */ [1]);
                                                                        if (var2_7 == null) {
                                                                            return false;
                                                                        }
                                                                        var3_28 = var1_1 /* !! */ [2];
                                                                        var4_36 = var1_1 /* !! */ [3];
                                                                        var5_42 = var1_1 /* !! */ [4];
                                                                        var6_46 = new ByteArrayInputStream(var1_1 /* !! */ );
                                                                        var7_49 /* !! */  = new byte[5];
                                                                        var6_46.read(var7_49 /* !! */ );
                                                                        var7_49 /* !! */  = new byte[var3_28 * 4];
                                                                        var6_46.read(var7_49 /* !! */ );
                                                                        var2_7.Yb = ab.c(var7_49 /* !! */ );
                                                                        if (var2_7 == fb.Pd && fb.Pd.bc != -1) {
                                                                            var7_49 /* !! */  = (byte[])(hb.b(fb.Pd.bc) + fb.Pd.Yb[fb.Pd.bc]);
                                                                            var3_29 = this;
                                                                            this.D = var7_49 /* !! */ ;
                                                                        }
                                                                        var7_49 /* !! */  = new byte[var5_42 * 4];
                                                                        var6_46.read(var7_49 /* !! */ );
                                                                        var2_7.ac = ab.c(var7_49 /* !! */ );
                                                                        var7_49 /* !! */  = new byte[var4_36 * 4];
                                                                        var6_46.read(var7_49 /* !! */ );
                                                                        var2_7.dc = ab.c(var7_49 /* !! */ );
                                                                        var2_7.nc += var2_7.v() - var2_7.mc;
                                                                        var2_7.mc = var2_7.v();
                                                                        if (fb.M) {
                                                                            this.O.b(var1_1 /* !! */ , (byte)var1_1 /* !! */ [1]);
                                                                        }
                                                                        return true;
                                                                    }
                                                                    if (var1_1 /* !! */ [0] == 2) {
                                                                        var2_8 = q.d(var1_1 /* !! */ [1]);
                                                                        if (var2_8 != null) {
                                                                            var2_8.b(var1_1 /* !! */ [2], var1_1 /* !! */ [3], true);
                                                                            if (var1_1 /* !! */ [1] == fb.Pd.w) {
                                                                                fb.b(fb.Pd, false);
                                                                            }
                                                                            var2_8.U = true;
                                                                        }
                                                                        break block146;
                                                                    }
                                                                    if (var1_1 /* !! */ [0] == 10) {
                                                                        var2_9 = q.d(var1_1 /* !! */ [1]);
                                                                        if (var2_9 != null) {
                                                                            var2_9.gc = false;
                                                                        }
                                                                        return true;
                                                                    }
                                                                    if (var1_1 /* !! */ [0] != 4) ** GOTO lbl137
                                                                    var2_10 = q.d(var1_1 /* !! */ [1]);
                                                                    if (var2_10 == null) ** GOTO lbl136
                                                                    if (var2_10.gc) {
                                                                        return true;
                                                                    }
                                                                    if (!var2_10.U) {
                                                                        return true;
                                                                    }
                                                                    if (var1_1 /* !! */ [4] == var2_10.g && var1_1 /* !! */ [5] == var2_10.h) {
                                                                        if (!var2_10.b(var1_1 /* !! */ [2], var1_1 /* !! */ [3] == 1)) {
                                                                            return false;
                                                                        }
                                                                        break block147;
                                                                    }
                                                                    return false;
                                                                }
                                                                if (fb.M) {
                                                                    this.O.b(var1_1 /* !! */ , (byte)var1_1 /* !! */ [1]);
                                                                }
lbl136:
                                                                // 4 sources

                                                                return true;
lbl137:
                                                                // 1 sources

                                                                if (var1_1 /* !! */ [0] != 3) break block160;
                                                                if (fb.Pd != null && fb.Pd.w == var1_1 /* !! */ [1]) {
                                                                    return true;
                                                                }
                                                                var2_11 = q.d(var1_1 /* !! */ [1]);
                                                                if (var2_11 == null) break block161;
                                                                if (var2_11.gc) {
                                                                    return true;
                                                                }
                                                                if (!var2_11.U) {
                                                                    return true;
                                                                }
                                                                var3_30 = fb.b(var2_11.ub, var2_11.g, var2_11.h, var1_1 /* !! */ [2], var1_1 /* !! */ [3]);
                                                                if ((var2_11.g != var1_1 /* !! */ [2] || var2_11.h != var1_1 /* !! */ [3]) && !var3_30) break block162;
                                                                var2_11.j();
                                                                var2_11.d((byte)var1_1 /* !! */ [2], (byte)var1_1 /* !! */ [3]);
                                                                if (!var11_25) break block163;
                                                            }
                                                            return false;
                                                        }
                                                        if (fb.M) {
                                                            this.O.b(var1_1 /* !! */ , (byte)var1_1 /* !! */ [1]);
                                                        }
                                                    }
                                                    return true;
                                                }
                                                if (var1_1 /* !! */ [0] == 5) {
                                                    if (fb.Pd != null && fb.Pd.w == var1_1 /* !! */ [1]) {
                                                        return true;
                                                    }
                                                    var2_12 = q.d(var1_1 /* !! */ [1]);
                                                    if (var2_12 != null) {
                                                        if (var2_12.gc) {
                                                            return true;
                                                        }
                                                        if (!var2_12.U) {
                                                            return true;
                                                        }
                                                        var3_31 = var2_12.g == var1_1 /* !! */ [2] && var2_12.h == var1_1 /* !! */ [3];
                                                        if (!var3_31) {
                                                            var3_31 = fb.b(var2_12.ub, var2_12.g, var2_12.h, (int)var1_1 /* !! */ [2], (int)var1_1 /* !! */ [3]);
                                                        }
                                                        if (!var3_31) {
                                                            return false;
                                                        }
                                                        var4_37 = null;
                                                        if (var1_1 /* !! */ [5] != false) {
                                                            var4_37 = new byte[var1_1 /* !! */ [5]];
                                                            for (var5_43 = 0; var5_43 < var1_1 /* !! */ [5]; var5_43 = (int)((byte)(var5_43 + 1))) {
                                                                var4_37[var5_43] = (byte)var1_1 /* !! */ [var5_43 + 6];
                                                                if (!var11_25) {
                                                                    if (!var11_25) continue;
                                                                }
                                                                break;
                                                            }
                                                        } else {
                                                            var2_12.b((byte)var1_1 /* !! */ [4], true, (byte)var1_1 /* !! */ [2], (byte)var1_1 /* !! */ [3], var4_37);
                                                        }
                                                        if (fb.M) {
                                                            this.O.b(var1_1 /* !! */ , (byte)var1_1 /* !! */ [1]);
                                                        }
                                                    }
                                                    return true;
                                                }
                                                if (var1_1 /* !! */ [0] == 6) {
                                                    var2_13 = q.d(var1_1 /* !! */ [1]);
                                                    if (var2_13 != null) {
                                                        var2_13.b(ab.b(var1_1 /* !! */ [2], var1_1 /* !! */ [3], var1_1 /* !! */ [4], var1_1 /* !! */ [5]), -1, -1, var1_1 /* !! */ [6] == true, var1_1 /* !! */ [7] == true);
                                                    }
                                                    return true;
                                                }
                                                if (var1_1 /* !! */ [0] == 7) {
                                                    var2_14 = q.d(var1_1 /* !! */ [1]);
                                                    if (var2_14 != null) {
                                                        var2_14.b(ab.b(var1_1 /* !! */ [2], var1_1 /* !! */ [3], var1_1 /* !! */ [4], (byte)var1_1 /* !! */ [5]), ab.b((byte)var1_1 /* !! */ [6], (byte)var1_1 /* !! */ [7], (byte)var1_1 /* !! */ [8], (byte)var1_1 /* !! */ [9]));
                                                        this.b((byte)var1_1 /* !! */ [10], (byte)var1_1 /* !! */ [1], (byte)var1_1 /* !! */ [11], false);
                                                        var2_14.b((byte)-1, (byte)-1, var1_1 /* !! */ [12] == true, var1_1 /* !! */ [13] == true);
                                                        var2_14.U = false;
                                                    }
                                                    return true;
                                                }
                                                if (var1_1 /* !! */ [0] == 8) {
                                                    var2_15 = q.d(var1_1 /* !! */ [1]);
                                                    if (var2_15 != null) {
                                                        if (!var2_15.U) {
                                                            return true;
                                                        }
                                                        var2_15.b(var1_1 /* !! */ [2], (byte)var1_1 /* !! */ [3], (byte)var1_1 /* !! */ [4], (byte)var1_1 /* !! */ [5], var1_1 /* !! */ [6] == true, var1_1 /* !! */ [7] == true, var1_1 /* !! */ [8] == true, (byte)var1_1 /* !! */ [9], (byte)var1_1 /* !! */ [10], (byte)var1_1 /* !! */ [11], (byte)var1_1 /* !! */ [12]);
                                                    }
                                                    return true;
                                                }
                                                if (var1_1 /* !! */ [0] == 101) {
                                                    var2_16 = q.d(var1_1 /* !! */ [1]);
                                                    if (var2_16 != null) {
                                                        var2_16.g();
                                                    }
                                                    break block146;
                                                }
                                                if (var1_1 /* !! */ [0] == 11) {
                                                    var2_17 = q.d(var1_1 /* !! */ [1]);
                                                    if (var2_17 != null) {
                                                        var2_17.b(true, (byte)var1_1 /* !! */ [2], (byte)var1_1 /* !! */ [3], var1_1 /* !! */ [4] == true, var1_1 /* !! */ [5] == true);
                                                    }
                                                    return true;
                                                }
                                                if (var1_1 /* !! */ [0] == 12) {
                                                    if (o.b((byte)var1_1 /* !! */ [1], (byte)var1_1 /* !! */ [2]) && fb.Re[var1_1 /* !! */ [1]][var1_1 /* !! */ [2]].d != null) {
                                                        fb.Re[var1_1 /* !! */ [1]][var1_1 /* !! */ [2]].d.c(ab.b((byte)var1_1 /* !! */ [3], (byte)var1_1 /* !! */ [4], (byte)var1_1 /* !! */ [5], (byte)var1_1 /* !! */ [6]));
                                                    }
                                                    return true;
                                                }
                                                if (var1_1 /* !! */ [0] != 14) break block164;
                                                if (var1_1 /* !! */ [1] != false) break block165;
                                                this.f((byte)var1_1 /* !! */ [2]);
                                                if (!var11_25) break block166;
                                            }
                                            "Req" + (int)var1_1 /* !! */ [1] + " to " + (int)var1_1 /* !! */ [2];
                                            this.b((byte)var1_1 /* !! */ [1], (byte)var1_1 /* !! */ [2], (byte)0);
                                        }
                                        return true;
                                    }
                                    if (var1_1 /* !! */ [0] != 15) break block167;
                                    "R" + (int)var1_1 /* !! */ [1];
                                    if (var1_1 /* !! */ [1] != false) break block168;
                                    var2_18 = new ByteArrayInputStream(var1_1 /* !! */ );
                                    var8_52 = new byte[1];
                                    var9_54 = new byte[4];
                                    var1_1 /* !! */  = new byte[5];
                                    try {
                                        block153: {
                                            block152: {
                                                block151: {
                                                    block150: {
                                                        block149: {
                                                            block148: {
                                                                var2_18.read();
                                                                var2_18.read();
                                                                var2_18.read(var9_54);
                                                                var10_55 = ab.b(var9_54);
                                                                if (fb.Yd != null) {
                                                                    fb.Yd.removeAllElements();
                                                                }
                                                                fb.Yd = new Vector<E>();
                                                                for (var3_32 = 0; var3_32 < var10_55; ++var3_32) {
                                                                    var2_18.read(var9_54);
                                                                    var4_38 = new s(var9_54[0], var9_54[1], var9_54[2], false);
                                                                    fb.Yd.addElement(var4_38);
                                                                    if (!var11_25) {
                                                                        if (!var11_25) continue;
                                                                    }
                                                                    break block148;
                                                                }
                                                                var2_18.read(var9_54);
                                                                var10_55 = ab.b(var9_54);
                                                            }
                                                            if (fb.Ud != null) {
                                                                fb.Ud.removeAllElements();
                                                            }
                                                            fb.Ud = new Vector<E>();
                                                            for (var3_32 = 0; var3_32 < var10_55; ++var3_32) {
                                                                var2_18.read(var1_1 /* !! */ );
                                                                v1 = var1_1 /* !! */ [3];
                                                                if (!var11_25) {
                                                                    if (v1 == -1) {
                                                                        hb.b(var1_1 /* !! */ [0], var1_1 /* !! */ [1], var1_1 /* !! */ [2], null, null);
                                                                        if (!var11_25) continue;
                                                                    }
                                                                    hb.b(var1_1 /* !! */ [0], var1_1 /* !! */ [1], var1_1 /* !! */ [2], q.d(var1_1 /* !! */ [3]), null);
                                                                    if (!var11_25) continue;
                                                                }
                                                                break block149;
                                                            }
                                                            if (fb.Re == null) {
                                                                return false;
                                                            }
                                                            v1 = var5_44 = 0;
                                                        }
                                                        while (var5_44 < fb.Re.length) {
                                                            v2 = 0;
                                                            if (var11_25) break block150;
                                                            for (var6_47 = v16446; var6_47 < fb.Re[0].length; ++var6_47) {
                                                                v3 = fb.Re[var5_44][var6_47].d;
                                                                if (!var11_25) {
                                                                    if (v3 == null) continue;
                                                                    fb.Re[var5_44][var6_47].d.b = fb.Re[var5_44][var6_47].d.A == false && fb.Re[var5_44][var6_47].d.I == 0;
                                                                    if (!var11_25) continue;
                                                                }
                                                                ** GOTO lbl341
                                                            }
                                                            ++var5_44;
                                                            if (!var11_25) continue;
                                                        }
                                                        var2_18.read(var9_54);
                                                        var10_55 = ab.b(var9_54);
                                                        v2 = var3_32 = 0;
                                                    }
                                                    while (var3_32 < var10_55) {
                                                        block170: {
                                                            block169: {
                                                                var2_18.read(var8_52);
                                                                var5_44 = var8_52[0];
                                                                var2_18.read(var8_52);
                                                                var6_47 = var8_52[0];
                                                                var2_18.read(var8_52);
                                                                v4 = var8_52[0];
                                                                if (var11_25) break block151;
                                                                if (v4 != 0) break block169;
                                                                var2_18.read(var8_52);
                                                                var1_2 = var8_52[0] == 1;
                                                                var2_18.read(var8_52);
                                                                var4_38 = new byte[var8_52[0]];
                                                                var2_18.read((byte[])var4_38);
                                                                if (fb.Re[var5_44][var6_47].d == null) break block170;
                                                                fb.Re[var5_44][var6_47].d.N = var1_2;
                                                                fb.Re[var5_44][var6_47].d.M = Long.parseLong(new String((byte[])var4_38));
                                                                fb.Re[var5_44][var6_47].d.b = true;
                                                                if (!var11_25) break block170;
                                                            }
                                                            var2_18.read(var9_54);
                                                            if (fb.Re[var5_44][var6_47].d != null) {
                                                                fb.Re[var5_44][var6_47].d.c(ab.b(var9_54));
                                                                fb.Re[var5_44][var6_47].d.b = true;
                                                            }
                                                        }
                                                        ++var3_32;
                                                        if (!var11_25) continue;
                                                    }
                                                    v4 = var5_44 = 0;
                                                }
                                                while (var5_44 < fb.Re.length) {
                                                    v5 = 0;
                                                    if (var11_25) break block152;
                                                    for (var6_47 = v16597; var6_47 < fb.Re[0].length; ++var6_47) {
                                                        v3 = fb.Re[var5_44][var6_47].d;
lbl341:
                                                        // 2 sources

                                                        if (v3 == null || fb.Re[var5_44][var6_47].d.b) continue;
                                                        fb.Re[var5_44][var6_47].d.f();
                                                        if (!var11_25) continue;
                                                    }
                                                    ++var5_44;
                                                    if (!var11_25) continue;
                                                }
                                                var2_18.read(var9_54);
                                                this.hb[0] = ab.b(var9_54);
                                                var2_18.read(var9_54);
                                                this.hb[1] = ab.b(var9_54);
                                                var2_18.read(var8_52);
                                                var10_55 = var8_52[0];
                                                v5 = var3_32 = 0;
                                            }
                                            while (var3_32 < var10_55) {
                                                block172: {
                                                    block171: {
                                                        var2_18.read(var8_52);
                                                        var7_50 = q.d(var8_52[0]);
                                                        var2_18.read(var9_54);
                                                        if (var11_25) break block153;
                                                        if (var7_50 != null) {
                                                            var7_50.A = ab.b(var9_54);
                                                        }
                                                        var2_18.read(var8_52);
                                                        if (var7_50 != null) {
                                                            var7_50.B = var8_52[0];
                                                        }
                                                        var2_18.read(var9_54);
                                                        if (var7_50 != null) {
                                                            var7_50.b(ab.b(var9_54), -1, -1, false, true);
                                                        }
                                                        var2_18.read(var8_52);
                                                        if (var8_52[0] != 0) {
                                                            var4_38 = new byte[var8_52[0]];
                                                            var2_18.read((byte[])var4_38);
                                                            if (var7_50 != null) {
                                                                var7_50.b(new String((byte[])var4_38));
                                                            }
                                                        }
                                                        var2_18.read(var8_52);
                                                        if (var7_50 != null) {
                                                            var7_50.b(var8_52[0], 0, 0, var8_52[0] == 2, false, false);
                                                        }
                                                        var2_18.read(var8_52);
                                                        if (var7_50 != null) {
                                                            var7_50.e((byte)(var8_52[0] - 1), false);
                                                        }
                                                        var2_18.read(var8_52);
                                                        if (var7_50 != null) {
                                                            var7_50.g((byte)(var8_52[0] - 1), false);
                                                        }
                                                        var2_18.read(var8_52);
                                                        if (var7_50 != null) {
                                                            var7_50.f((byte)(var8_52[0] - 1), false);
                                                        }
                                                        var2_18.read(var8_52);
                                                        if (var7_50 != null) {
                                                            var7_50.hc = var8_52[0] == 1;
                                                        }
                                                        var2_18.read(var8_52);
                                                        if (var8_52[0] != -1) break block171;
                                                        if (var7_50 == null) break block172;
                                                        var7_50.g();
                                                        if (!var11_25) break block172;
                                                    }
                                                    if (var7_50 != null) {
                                                        var7_50.mb = var8_52[0];
                                                    }
                                                    var2_18.read(var9_54);
                                                    if (var7_50 != null) {
                                                        var7_50.j();
                                                    }
                                                    if (var7_50 != null) {
                                                        var7_50.d(var9_54[0], var9_54[1]);
                                                    }
                                                    if (var7_50 != null) {
                                                        var7_50.c(var9_54[2], true);
                                                    }
                                                    if (var9_54[3] == 1 && var7_50 != null) {
                                                        var7_50.b(var7_50.ub, false);
                                                    }
                                                }
                                                ++var3_32;
                                                if (!var11_25) continue;
                                            }
                                            var3_32 = 0;
                                        }
                                        while (var3_32 < 2) {
                                            block174: {
                                                block173: {
                                                    var2_18.read(var8_52);
                                                    v6 = var8_52[0];
                                                    if (var11_25) break block154;
                                                    if (v6 == -3) break;
                                                    if (var8_52[0] != -1) break block173;
                                                    var2_18.read(var8_52);
                                                    var5_44 = var8_52[0];
                                                    var2_18.read(var8_52);
                                                    var6_47 = var8_52[0];
                                                    this.b((byte)var3_32, (byte)1, (byte)-1, (byte)var5_44, (byte)var6_47, (byte)-1);
                                                    if (!var11_25) break block174;
                                                }
                                                this.b((byte)var3_32, (byte)2, var8_52[0], (byte)0, (byte)0, (byte)-1);
                                            }
                                            ++var3_32;
                                            if (!var11_25) continue;
                                        }
                                        this.f();
                                    }
                                    catch (Exception var1_3) {
                                        "rec sync " + var1_3;
                                    }
                                    this.b((int)fb.Pd.w, ab.Kb);
                                    this.b(fb.Pd.w, fb.Pd);
                                    break block175;
                                }
                                var2_19 = q.d((int)var1_1 /* !! */ [1]);
                                if (var2_19 != null) {
                                    var2_19.j();
                                    var2_19.d((byte)var1_1 /* !! */ [2], var1_1 /* !! */ [3]);
                                    var2_19.c(var1_1 /* !! */ [4], true);
                                    if (var1_1 /* !! */ [5] == 1) {
                                        var2_19.b(var2_19.ub, false);
                                    }
                                }
                                if (var1_1 /* !! */ [6] == true && !fb.M) {
                                    this.a(var1_1 /* !! */ );
                                }
                            }
                            v6 = 1;
                        }
                        return (boolean)v6;
                    }
                    if (var1_1 /* !! */ [0] != 16) break block155;
                    var2_20 = q.d((int)var1_1 /* !! */ [1]);
                    if (var2_20 != null) {
                        var2_20.b((byte)var1_1 /* !! */ [2], ab.b((byte)var1_1 /* !! */ [3], (byte)var1_1 /* !! */ [4], (byte)var1_1 /* !! */ [5], (byte)var1_1 /* !! */ [6]), false);
                        if (fb.M) {
                            this.O.b(var1_1 /* !! */ , var1_1 /* !! */ [1]);
                        }
                        return true;
                    }
                    return false;
                }
                if (var1_1 /* !! */ [0] != 23) break block156;
                var2_21 = q.d((int)var1_1 /* !! */ [1]);
                if (var2_21 != null) {
                    var2_21.b(ab.b((byte)var1_1 /* !! */ [2], (byte)var1_1 /* !! */ [3], (byte)var1_1 /* !! */ [4], var1_1 /* !! */ [5]), false);
                    if (fb.M) {
                        this.O.b(var1_1 /* !! */ , var1_1 /* !! */ [1]);
                    }
                    return true;
                }
                return false;
            }
            try {
                if (var1_1 /* !! */ [0] == 17) {
                    var2_22 = q.d((int)var1_1 /* !! */ [1]);
                    if (var2_22 != null) {
                        var3_33 = null;
                        if (var1_1 /* !! */ [3] != false) {
                            var3_33 = new byte[var1_1 /* !! */ [3]];
                            for (var4_39 = 0; var4_39 < var1_1 /* !! */ [3]; var4_39 = (byte)(var4_39 + 1)) {
                                var3_33[var4_39] = var1_1 /* !! */ [var4_39 + 4];
                                if (!var11_25) {
                                    if (!var11_25) continue;
                                }
                                break;
                            }
                        } else {
                            var2_22.b(var1_1 /* !! */ [2], var3_33);
                        }
                    }
                    return true;
                }
                if (var1_1 /* !! */ [0] == 18) {
                    new s((byte)var1_1 /* !! */ [1], (byte)var1_1 /* !! */ [2], var1_1 /* !! */ [3], false);
                    return true;
                }
                if (var1_1 /* !! */ [0] == 19) {
                    hb.b((byte)var1_1 /* !! */ [1], var1_1 /* !! */ [2], var1_1 /* !! */ [3], null, null);
                    return true;
                }
                if (var1_1 /* !! */ [0] == 20) {
                    this.b(var1_1 /* !! */ [1], var1_1 /* !! */ [2], var1_1 /* !! */ [3], var1_1 /* !! */ [4], var1_1 /* !! */ [5], var1_1 /* !! */ [6]);
                    return true;
                }
                if (var1_1 /* !! */ [0] == 21) {
                    var2_23 = q.d(var1_1 /* !! */ [1]);
                    if (var2_23 != null) {
                        var2_23.d(var1_1 /* !! */ [2], true);
                    }
                    return true;
                }
                if (var1_1 /* !! */ [0] == 22) {
                    var2_24 = q.d(var1_1 /* !! */ [1]);
                    if (var2_24 != null) {
                        var2_24.c(var1_1 /* !! */ [2], ab.b(var1_1 /* !! */ [3], var1_1 /* !! */ [4], var1_1 /* !! */ [5], var1_1 /* !! */ [6]), false);
                        if (fb.M) {
                            this.O.b(var1_1 /* !! */ , var1_1 /* !! */ [1]);
                        }
                        return true;
                    }
                    return false;
                }
            }
            catch (Exception v7) {}
        }
        return true;
    }

    private static boolean b(int n2, int n3, int n4, int n5, int n6) {
        switch (n2) {
            case 0: {
                if (n4 <= n6) break;
                return true;
            }
            case 1: {
                if (n3 >= n5) break;
                return true;
            }
            case 2: {
                if (n4 >= n6) break;
                return true;
            }
            case 3: {
                if (n3 <= n5) break;
                return true;
            }
        }
        return false;
    }

    private void a(byte[] byArray) {
        if (M) {
            this.b(byArray);
            return;
        }
        this.N.b(byArray);
    }

    public final void b(byte by, q q2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byArray = new byte[]{9, by, 14, 6, 11};
        try {
            byteArrayOutputStream.write(byArray);
            byteArrayOutputStream.write(ab.b(q2.Yb));
            byteArrayOutputStream.write(ab.b(q2.ac));
            byteArrayOutputStream.write(ab.b(q2.dc));
        }
        catch (Exception exception) {}
        this.a(byteArrayOutputStream.toByteArray());
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void f(byte var1_1) {
        block39: {
            var8_2 = ab.xc;
            var2_3 = new ByteArrayOutputStream();
            try {
                block52: {
                    block48: {
                        block51: {
                            block50: {
                                block49: {
                                    block38: {
                                        block47: {
                                            block37: {
                                                block46: {
                                                    block36: {
                                                        block43: {
                                                            block35: {
                                                                block42: {
                                                                    block41: {
                                                                        block40: {
                                                                            var2_3.write(15);
                                                                            var2_3.write(0);
                                                                            if (fb.Yd != null) break block40;
                                                                            var2_3.write(ab.b(0));
                                                                            if (!var8_2) break block41;
                                                                        }
                                                                        var2_3.write(ab.b(fb.Yd.size()));
                                                                        for (var3_4 = 0; var3_4 < fb.Yd.size(); ++var3_4) {
                                                                            var4_5 = (s)fb.Yd.elementAt(var3_4);
                                                                            var2_3.write(var4_5.u);
                                                                            var2_3.write(var4_5.g);
                                                                            var2_3.write(var4_5.h);
                                                                            var2_3.write(0);
                                                                            if (!var8_2) {
                                                                                if (!var8_2) continue;
                                                                            }
                                                                            break block35;
                                                                        }
                                                                    }
                                                                    if (fb.Ud != null) break block42;
                                                                    var2_3.write(ab.b(0));
                                                                    if (!var8_2) break block43;
                                                                }
                                                                var2_3.write(ab.b(fb.Ud.size()));
                                                            }
                                                            for (var3_4 = 0; var3_4 < fb.Ud.size(); ++var3_4) {
                                                                block45: {
                                                                    block44: {
                                                                        var4_5 = (hb)fb.Ud.elementAt(var3_4);
                                                                        var2_3.write(var4_5.o);
                                                                        var2_3.write(var4_5.q);
                                                                        v0 = var2_3;
                                                                        if (var8_2) break block36;
                                                                        v0.write(var4_5.r);
                                                                        if (var4_5.x != null) break block44;
                                                                        var2_3.write(-1);
                                                                        if (!var8_2) break block45;
                                                                    }
                                                                    var2_3.write(var4_5.x.w);
                                                                }
                                                                var2_3.write(0);
                                                                if (!var8_2) continue;
                                                            }
                                                        }
                                                        v0 = new ByteArrayOutputStream();
                                                    }
                                                    var6_8 = v0;
                                                    var7_10 = 0;
                                                    if (fb.Re == null) break block46;
                                                    for (var3_4 = 0; var3_4 < fb.Re.length; ++var3_4) {
                                                        v1 = 0;
                                                        if (var8_2) break block37;
                                                        for (var4_6 = v34704; var4_6 < fb.Re[0].length; ++var4_6) {
                                                            v2 /* !! */  = fb.Re[var3_4][var4_6].d;
                                                            if (!var8_2) {
                                                                if (v2 /* !! */  == null) continue;
                                                                if (fb.Re[var3_4][var4_6].d.A) {
                                                                    ++var7_10;
                                                                    var6_8.write((byte)var3_4);
                                                                    var6_8.write((byte)var4_6);
                                                                    var6_8.write(0);
                                                                    var6_8.write((byte)(fb.Re[var3_4][var4_6].d.N != false));
                                                                    var5_11 = "" + fb.Re[var3_4][var4_6].d.M;
                                                                    var6_8.write((byte)var5_11.length());
                                                                    var6_8.write(var5_11.getBytes());
                                                                    if (!var8_2) continue;
                                                                }
                                                                if (fb.Re[var3_4][var4_6].d.I == 0) continue;
                                                                ++var7_10;
                                                                var6_8.write((byte)var3_4);
                                                                var6_8.write((byte)var4_6);
                                                                var6_8.write(1);
                                                                var6_8.write(ab.b(fb.Re[var3_4][var4_6].d.H));
                                                                if (!var8_2) continue;
                                                            }
                                                            ** GOTO lbl87
                                                        }
                                                        if (!var8_2) continue;
                                                    }
                                                }
                                                var2_3.write(ab.b(var7_10));
                                                v1 = var7_10;
                                            }
                                            if (v1 > 0) {
                                                var2_3.write(var6_8.toByteArray());
                                            }
                                            var2_3.write(ab.b(this.hb[0]));
                                            var2_3.write(ab.b(this.hb[1]));
                                            var6_8 = new ByteArrayOutputStream();
                                            var7_10 = 0;
                                            if (fb.Qd == null) break block47;
                                            for (var3_4 = 0; var3_4 < fb.Qd.size(); ++var3_4) {
                                                v2 /* !! */  = fb.Qd.elementAt(var3_4);
lbl87:
                                                // 2 sources

                                                v3 = (q)v2 /* !! */ ;
                                                if (!var8_2) {
                                                    if (v3 == null) continue;
                                                    ++var7_10;
                                                    var6_8.write(var4_7.w);
                                                    var6_8.write(ab.b(var4_7.A));
                                                    var6_8.write((byte)var4_7.B);
                                                    var6_8.write(ab.b(var4_7.nc));
                                                    var6_8.write((byte)var4_7.y.length());
                                                    var6_8.write(var4_7.y.getBytes());
                                                    var6_8.write(var4_7.Y ? (var4_7.Lc == fb.ee ? 2 : 1) : 0);
                                                    var6_8.write(var4_7.fb != false ? 1 : 0);
                                                    var6_8.write(var4_7.ib != false ? 1 : 0);
                                                    var6_8.write(var4_7.kb != false ? 1 : 0);
                                                    var6_8.write(var4_7.hc != false ? 1 : 0);
                                                    var6_8.write(var4_7.mb);
                                                    if (var4_7.mb == -1) continue;
                                                    var6_8.write(var4_7.g);
                                                    var6_8.write(var4_7.h);
                                                    var6_8.write(var4_7.ub);
                                                    var6_8.write(var4_7.e() != false ? 1 : 0);
                                                    if (!var8_2) continue;
                                                }
                                                break block38;
                                            }
                                        }
                                        var2_3.write((byte)var7_10);
                                        if (var7_10 > 0) {
                                            var2_3.write(var6_8.toByteArray());
                                        }
                                        if (fb.ib == null || fb.jb == null) break block48;
                                        v3 = fb.ib.H;
                                    }
                                    if (v3 == null) break block49;
                                    var2_3.write(fb.ib.H.w);
                                    if (!var8_2) break block50;
                                }
                                var2_3.write(-1);
                                var2_3.write(fb.ib.g);
                                var2_3.write(fb.ib.h);
                            }
                            if (fb.jb.H == null) break block51;
                            var2_3.write(fb.jb.H.w);
                            if (!var8_2) break block52;
                        }
                        var2_3.write(-1);
                        var2_3.write(fb.jb.g);
                        var2_3.write(fb.jb.h);
                        if (!var8_2) break block52;
                    }
                    var2_3.write(-3);
                }
                if (var1_1 > 0) {
                    this.O.b(var1_1 - 2, var2_3.toByteArray());
                    if (!var8_2) break block39;
                }
                this.a(var2_3.toByteArray());
                return;
            }
            catch (Exception var6_9) {
                "sync ex " + var6_9;
            }
        }
    }

    public final void b(byte by, byte by2, byte by3) {
        byte[] byArray;
        block3: {
            block2: {
                byte[] byArray2 = new byte[7];
                byArray = byArray2;
                byArray2[0] = 15;
                byArray[1] = by;
                q q2 = q.d(by);
                byArray[2] = q2.g;
                byArray[3] = q2.h;
                byArray[4] = q2.ub;
                if (!q2.e()) break block2;
                byArray[5] = 1;
                if (!ab.xc) break block3;
            }
            byArray[5] = 0;
        }
        byArray[6] = by3;
        this.O.b(by2 - 2, byArray);
    }

    private void b(int n2, String string) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(13);
            byteArrayOutputStream.write((byte)n2);
            byteArrayOutputStream.write((byte)string.getBytes().length);
            byteArrayOutputStream.write(string.getBytes());
        }
        catch (Exception exception) {}
        this.a(byteArrayOutputStream.toByteArray());
    }

    public final void b(byte by, byte by2, byte by3, byte by4, boolean bl) {
        byte[] byArray = new byte[6];
        byte[] byArray2 = byArray;
        byArray[0] = 4;
        byArray2[1] = by;
        byArray2[2] = by4;
        byArray2[3] = bl ? (byte)1 : 0;
        byArray2[4] = by2;
        byArray2[5] = by3;
        this.a(byArray2);
    }

    public final void c(byte by, byte by2, byte by3) {
        byte[] byArray = new byte[4];
        byte[] byArray2 = byArray;
        byArray[0] = 3;
        byArray2[1] = by;
        byArray2[2] = by2;
        byArray2[3] = by3;
        this.a(byArray2);
    }

    public final void b(byte by, byte by2, byte by3, byte by4, byte[] byArray) {
        boolean bl = ab.xc;
        byte by5 = byArray != null ? (byte)byArray.length : (byte)0;
        byte[] byArray2 = new byte[by5 + 6];
        byte[] byArray3 = byArray2;
        byArray2[0] = 5;
        byArray3[1] = by;
        byArray3[2] = by2;
        byArray3[3] = by3;
        byArray3[4] = by4;
        byArray3[5] = by5;
        if (byArray != null) {
            for (by = 0; by < by5; by = (byte)(by + 1)) {
                byArray3[by + 6] = byArray[by];
                if (!bl) {
                    if (!bl) continue;
                }
                break;
            }
        } else {
            this.a(byArray3);
        }
    }

    public final void b(byte by, int n2, boolean bl, boolean bl2) {
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = 6;
        byArray2[1] = by;
        byte[] byArray3 = ab.b(n2);
        byArray2[2] = byArray3[0];
        byArray2[3] = byArray3[1];
        byArray2[4] = byArray3[2];
        byArray2[5] = byArray3[3];
        byArray2[6] = bl ? (byte)1 : 0;
        byArray2[7] = bl2 ? (byte)1 : 0;
        this.a(byArray2);
    }

    public final void b(byte by, int n2, int n3, byte by2, byte by3, boolean bl, boolean bl2) {
        Object object = q.d(by);
        if (object != null) {
            ((q)object).gc = true;
        }
        if (by == by2) {
            by2 = (byte)-1;
        }
        this.b(by2, by, by3, false);
        byte[] byArray = new byte[14];
        object = byArray;
        byArray[0] = 7;
        object[1] = by;
        byte[] byArray2 = ab.b(n2);
        object[2] = byArray2[0];
        object[3] = byArray2[1];
        object[4] = byArray2[2];
        object[5] = byArray2[3];
        byArray2 = ab.b(n3);
        object[6] = byArray2[0];
        object[7] = byArray2[1];
        object[8] = byArray2[2];
        object[9] = byArray2[3];
        object[10] = by2;
        object[11] = by3;
        object[12] = bl ? (byte)1 : 0;
        object[13] = bl2 ? (byte)1 : 0;
        this.a((byte[])object);
    }

    public final void b(byte by, byte by2, byte by3, byte by4, byte by5, boolean bl, boolean bl2, boolean bl3, byte by6, byte by7, byte by8, byte by9) {
        byte[] byArray = new byte[13];
        byte[] byArray2 = byArray;
        byArray[0] = 8;
        byArray2[1] = by;
        byArray2[2] = by2;
        byArray2[3] = by3;
        byArray2[4] = by4;
        byArray2[5] = by5;
        byArray2[6] = bl ? (byte)1 : 0;
        byArray2[7] = bl2 ? (byte)1 : 0;
        byArray2[8] = bl3 ? (byte)1 : 0;
        byArray2[9] = by6;
        byArray2[10] = by7;
        byArray2[11] = by8;
        byArray2[12] = by9;
        this.a(byArray2);
    }

    public final void n() {
        if (Pd != null) {
            byte[] byArray = new byte[2];
            byte[] byArray2 = byArray;
            byArray[0] = 10;
            byArray2[1] = fb.Pd.w;
            this.a(byArray2);
        }
    }

    public final void b(byte by, byte by2, byte by3, boolean bl, boolean bl2) {
        byte[] byArray = new byte[6];
        byte[] byArray2 = byArray;
        byArray[0] = 11;
        byArray2[1] = by;
        byArray2[2] = by2;
        byArray2[3] = by3;
        byArray2[4] = bl ? (byte)1 : 0;
        byArray2[5] = bl2 ? (byte)1 : 0;
        this.a(byArray2);
    }

    public final void b(byte by, byte by2, int n2) {
        byte[] byArray = new byte[7];
        byte[] byArray2 = byArray;
        byArray[0] = 12;
        byArray2[1] = by;
        byArray2[2] = by2;
        byte[] byArray3 = ab.b(n2);
        byArray2[3] = byArray3[0];
        byArray2[4] = byArray3[1];
        byArray2[5] = byArray3[2];
        byArray2[6] = byArray3[3];
        this.a(byArray2);
    }

    public final void c(byte by, byte by2, int n2) {
        byte[] byArray = new byte[7];
        byte[] byArray2 = byArray;
        byArray[0] = 16;
        byArray2[1] = by;
        byArray2[2] = by2;
        byte[] byArray3 = ab.b(n2);
        byArray2[3] = byArray3[0];
        byArray2[4] = byArray3[1];
        byArray2[5] = byArray3[2];
        byArray2[6] = byArray3[3];
        if (M) {
            this.O.b(by - 2, byArray2);
            return;
        }
        this.N.b(byArray2);
    }

    public final void b(byte by, int n2) {
        byte[] byArray = new byte[6];
        byte[] byArray2 = byArray;
        byArray[0] = 23;
        byArray2[1] = by;
        byte[] byArray3 = ab.b(n2);
        byArray2[2] = byArray3[0];
        byArray2[3] = byArray3[1];
        byArray2[4] = byArray3[2];
        byArray2[5] = byArray3[3];
        if (M) {
            this.O.b(by - 2, byArray2);
            return;
        }
        this.N.b(byArray2);
    }

    public final void b(byte by, byte by2, byte[] byArray) {
        boolean bl = ab.xc;
        byte[] byArray2 = new byte[4 + (byArray == null ? 0 : byArray.length)];
        byte[] byArray3 = byArray2;
        byArray2[0] = 17;
        byArray3[1] = by;
        byArray3[2] = by2;
        byte by3 = byArray3[3] = byArray == null ? (byte)0 : (byte)byArray.length;
        if (byArray3[3] != 0 && byArray != null) {
            for (by = 0; by < byArray.length; by = (byte)(by + 1)) {
                byArray3[by + 4] = byArray[by];
                if (!bl) {
                    if (!bl) continue;
                }
                break;
            }
        } else {
            this.a(byArray3);
        }
    }

    public final void d(byte by, byte by2, byte by3) {
        byte[] byArray = new byte[4];
        byte[] byArray2 = byArray;
        byArray[0] = 18;
        byArray2[1] = by;
        byArray2[2] = by2;
        byArray2[3] = by3;
        this.a(byArray2);
    }

    public final void c(byte by, byte by2) {
        byte[] byArray = new byte[3];
        byte[] byArray2 = byArray;
        byArray[0] = 21;
        byArray2[1] = by;
        byArray2[2] = by2;
        this.a(byArray2);
    }

    public final void d(byte by, byte by2, int n2) {
        byte[] byArray = new byte[7];
        byte[] byArray2 = byArray;
        byArray[0] = 22;
        byArray2[1] = by;
        byArray2[2] = by2;
        byte[] byArray3 = ab.b(n2);
        byArray2[3] = byArray3[0];
        byArray2[4] = byArray3[1];
        byArray2[5] = byArray3[2];
        byArray2[6] = byArray3[3];
        if (M) {
            this.O.b(by - 2, byArray2);
            return;
        }
        this.N.b(byArray2);
    }

    private void a(String string) {
        block49: {
            block50: {
                int n2;
                int n3;
                boolean bl = ab.xc;
                try {
                    int n4;
                    String string2;
                    block48: {
                        block47: {
                            String string3 = string2 = ab.cc && !ab.Jb ? "_bm" : "";
                            if (!ab.Jb) break block47;
                            ab.pc = 0;
                            ab.qc = 25;
                            ab.rc = 50;
                            ab.sc = 75;
                            if (!bl) break block48;
                        }
                        ab.pc = 4;
                        ab.qc = 100;
                        ab.rc = 200;
                        ab.sc = 300;
                    }
                    ++ab.q;
                    System.gc();
                    fb.a(50);
                    ++ab.q;
                    pb = ab.b("items/coin.png", 20, 20);
                    if (rc.e && Fd == null) {
                        Fd = ab.b("menu/icons_ts.png", 48, 48);
                        Gd = new int[fb.Fd.h];
                        Hd = new int[fb.Fd.h];
                        Id = new int[fb.Fd.h >> 1];
                        Jd = new int[fb.Fd.h >> 1];
                        block15: for (int i2 = 0; i2 < fb.Fd.h; ++i2) {
                            n4 = i2;
                            if (!bl) {
                                switch (n4) {
                                    case 0: {
                                        fb.Id[i2] = 0;
                                        fb.Jd[i2] = 2 * (ab.E - 20 - 40) / 3 - fb.Fd.e / 2 + 20;
                                        fb.Gd[i2] = (i2 + 1) * (ab.D / 5) - fb.Fd.d / 2;
                                        if (!bl) continue block15;
                                    }
                                    case 1: {
                                        fb.Id[i2] = 0;
                                        fb.Jd[i2] = (ab.E - 20 - 40) / 3 - fb.Fd.e / 2 + 20;
                                        fb.Gd[i2] = i2 * (ab.D / 5) - fb.Fd.d / 2;
                                        if (!bl) continue block15;
                                    }
                                    case 2: {
                                        fb.Id[i2] = ab.D >> 1;
                                        fb.Jd[i2] = 2 * (ab.E - 20 - 40) / 3 - fb.Fd.e / 2 + 20;
                                        fb.Gd[i2] = (i2 + 2) * (ab.D / 5) - fb.Fd.d / 2;
                                        fb.Hd[i2] = Jd[i2] + (Jd[0] - Jd[1] - fb.Fd.e >> 1);
                                        fb.Hd[0] = Hd[i2];
                                        if (!bl) continue block15;
                                    }
                                    case 3: {
                                        fb.Id[i2] = ab.D >> 1;
                                        fb.Jd[i2] = (ab.E - 20 - 40) / 3 - fb.Fd.e / 2 + 20;
                                        fb.Gd[i2] = (i2 + 1) * (ab.D / 5) - fb.Fd.d / 2;
                                        fb.Hd[i2] = Jd[i2] + (Jd[0] - Jd[1] - fb.Fd.e >> 1);
                                        fb.Hd[1] = Hd[i2];
                                        if (!bl) continue block15;
                                    }
                                    case 4: {
                                        fb.Id[i2] = 0;
                                        fb.Jd[i2] = 2 * (ab.E - 20 - 40) / 3 - fb.Fd.e / 2 + 20;
                                    }
                                    case 5: 
                                    case 9: {
                                        fb.Gd[i2] = Gd[0];
                                        fb.Hd[i2] = Hd[0];
                                        if (!bl) continue block15;
                                    }
                                    case 6: {
                                        fb.Gd[i2] = Gd[1];
                                        fb.Hd[i2] = Hd[1];
                                        if (!bl) continue block15;
                                    }
                                    case 7: {
                                        fb.Gd[i2] = Gd[2];
                                        fb.Hd[i2] = Hd[2];
                                        if (!bl) continue block15;
                                    }
                                    case 8: {
                                        fb.Gd[i2] = Gd[3];
                                        fb.Hd[i2] = Hd[3];
                                    }
                                }
                                if (!bl) continue;
                            }
                            break;
                        }
                    } else {
                        rb = ab.b("walls.png", 45, 55);
                        sb = ab.b("tree_stubs.png", 50, 60);
                        ++ab.q;
                        n4 = ab.Jb;
                    }
                    if (n4 == 0) {
                        ub = ab.b("stones_20.png", 20, 20);
                        ++ab.q;
                        vb = ab.b("stones_30.png", 30, 30);
                        ++ab.q;
                    }
                    wb = ab.b("bushes_big.png", 55, 55);
                    ++ab.q;
                    xb = ab.b("chars/pipyaka.png", 30, 30);
                    ++ab.q;
                    yb = ab.b("chars/death/pipyaka_explosion.png", 60, 60);
                    ++ab.q;
                    if (!ab.Jb) {
                        ab.b("chars/death/pipyaka_skulls" + string2 + ".png", 40, 34);
                        ++ab.q;
                        ab.b("chars/death/pipyaka_tortilla" + string2 + ".png", 36, 36);
                        ++ab.q;
                        ab.b("chars/death/pipyaka_parts" + string2 + ".png", 23, 23);
                        ++ab.q;
                    }
                    oc = ab.b("items/berserker.png", 35, 35);
                    ++ab.q;
                    nc = ab.b("items/kaska.png", 36, 36);
                    ++ab.q;
                    pc = ab.b("items/invisible.png", 35, 35);
                    ++ab.q;
                    qc = ab.b("chars/skins/sock_helm.png", 36, 36);
                    ++ab.q;
                    uc = ab.b("items/banana.png", 22, 18);
                    ++ab.q;
                    wc = ab.b("items/sock.png", 28, 18);
                    ++ab.q;
                    yc = ab.b("items/carrot.png", 22, 29);
                    rc = ab.b("fx/pipyaka_hurt1" + string2 + ".png", 30, 30);
                    ++ab.q;
                    if (!ab.Jb) {
                        sc = ab.b("fx/pipyaka_hurt2" + string2 + ".png", 30, 30);
                        ++ab.q;
                        if (ab.cc) {
                            ab.b("chars/death/pipyaka_parts1_bm.png", 23, 23);
                            Dc = ab.b("fx/bm_splashes.png", 25, 25);
                            ab.b("fx/bm_fountain.png", 24, 44);
                            Ec = ab.b("fx/bm_foots.png", 16, 16);
                        }
                    }
                    tc = ab.b("fx/pipyaka_eyes_rolling.png", 18, 11);
                    ++ab.q;
                    System.gc();
                    fb.a(50);
                    ++ab.q;
                    Bb = ab.b("weapons/melon.png", 20, 20);
                    ++ab.q;
                    Fb = ab.b("weapons/melon_thr.png", 20, 20);
                    ++ab.q;
                    Gb = ab.b("weapons/ananas.png", 40, 40);
                    ++ab.q;
                    Cb = ab.b("weapons/rabber_melon.png", 30, 30);
                    ++ab.q;
                    Db = ab.b("weapons/melon_explosion.png", 60, 60);
                    ++ab.q;
                    Hb = ab.b("weapons/ananas_exploding.png", 60, 60);
                    ++ab.q;
                    Pc = ab.b("weapons/mine.png", 16, 14);
                    Ib = ab.b("weapons/melon_hard.png", 20, 20);
                    Jb = ab.b("weapons/melon_thr_hard.png", 20, 20);
                    Kb = ab.b("weapons/rabber_melon_hard.png", 30, 30);
                    Lb = ab.b("weapons/ananas_hard.png", 40, 40);
                    Mb = ab.b("weapons/melon_explosion_hard.png", 60, 60);
                    Hc = ab.b("weapons/bomb_crater.png", 40, 40);
                    Eb = ab.b("weapons/melon_crater.png", 35, 35);
                    if (ab.pc != 0) {
                        ab.b("weapons/melon_parts.png", 20, 20);
                        ab.b("weapons/melon_parts_hard.png", 20, 20);
                    }
                    ++ab.q;
                    if (ab.pc != 0) {
                        ab.b("weapons/ananas_parts.png", 26, 26);
                        ab.b("weapons/ananas_parts_hard.png", 26, 26);
                    }
                    ++ab.q;
                    if (!ab.Jb) {
                        tb = ab.b("walls_craters.png", 35, 35);
                        ++ab.q;
                        if (ab.cc) {
                            zc = ab.b("fx/bm_blood_pool.png", 60, 60);
                        }
                        ++ab.q;
                    }
                    zc = ab.b("fx/bm_blood_pool.png", 44, 25);
                    Wb = ab.b("fx/egg.png", 60, 49);
                    ++ab.q;
                    Xb = ab.b("fx/egg_parts.png", 30, 30);
                    ++ab.q;
                    cc = ab.b("fx/team_pods.png", 36, 24);
                    ++ab.q;
                    dc = ab.b("fx/hp_pod_l.png", 7, 9);
                    ec = ab.b("fx/hp_pod_m.png", 6, 9);
                    fc = ab.b("fx/hp_pod_r.png", 7, 9);
                    ++ab.q;
                    gc = ab.b("fx/hp_scores.png", 5, 6);
                    ic = ab.b("fx/hp_scores_extra.png", 5, 6);
                    ++ab.q;
                    Fc = ab.b("weapons/bomb.png", 30, 30);
                    if (ab.pc != 0) {
                        ab.b("weapons/bomb_parts.png", 22, 22);
                    }
                    Gc = ab.b("weapons/bomb_explosion.png", 60, 60);
                    Ic = ab.b("fx/spark.png", 22, 22);
                    Lc = ab.b("fx/cloud_black_medium.png", 30, 30);
                    if (!ab.Jb) {
                        Kc = ab.b("fx/cloud_white_small.png", 24, 24);
                    }
                    System.gc();
                    fb.a(50);
                    ++ab.q;
                    if (!ab.Jb) {
                        Rb = ab.b("fx/flash_red.png", 120, 100);
                        ++ab.q;
                        Sb = ab.b("fx/flash_blue.png", 120, 100);
                        ++ab.q;
                        Tb = ab.b("fx/flash_yellow_small.png", 60, 50);
                        ++ab.q;
                        Ub = ab.b("fx/flash_yellow.png", 120, 100);
                        Vb = ab.b("fx/flash_yellow_very_small.png", 25, 21);
                    }
                    Jc = ab.b("fx/explosion_fire.png", 60, 60);
                    if (!ab.Jb) {
                        Nb = ab.b("fx/shadows/shadow_small.png", 20, 15);
                        ++ab.q;
                        Ob = ab.b("fx/shadows/shadow_medium.png", 34, 18);
                        Pb = ab.b("fx/shadows/shadow_medium2.png", 47, 25);
                        ++ab.q;
                        Qb = ab.b("fx/shadows/shadow_big.png", 68, 36);
                        ++ab.q;
                        zb = ab.b("tree_shadow.png", 150, 105);
                        ++ab.q;
                    }
                    hc = ab.b("fx/hp_flow.png", 8, 9);
                    ab.b("fx/hp_flow_extra.png", 8, 9);
                    ++ab.q;
                    jc = ab.b("weapons/rake.png", 42, 48);
                    ++ab.q;
                    kc = ab.b("weapons/brick.png", 20, 17);
                    ++ab.q;
                    lc = ab.b("weapons/brick_explosion.png", 45, 45);
                    ++ab.q;
                    mc = ab.b("fx/stars_white.png", 15, 15);
                    ++ab.q;
                    vc = ab.b("weapons/banana_skin.png", 30, 30);
                    ++ab.q;
                    xc = ab.b("weapons/sock.png", 20, 20);
                    ++ab.q;
                    Mc = ab.b("fx/cloud_green_medium.png", 30, 30);
                    ++ab.q;
                    Cc = Image.createImage((String)"/fx/ctf_flag_thread.png");
                    if (fb.j() == 2) {
                        Ac = ab.b("fx/ctf_flag.png", 17, 20);
                        Bc = ab.b("fx/ctf_flag_base.png", 40, 40);
                    }
                    Ab = ab.b("tree_crowns.png", 105, 92);
                    ab.q += 3;
                    System.gc();
                    fb.a(50);
                    ++ab.q;
                    Rc = ab.b("trampoline.png", 40, 35);
                    Sc = ab.b("items/bag.png", 30, 30);
                    ++ab.q;
                }
                catch (Exception exception) {}
                b = ab.Tb <= ab.Ub;
                k.b("/maps/" + string, L == 0 && !b);
                ab.q += 5;
                qb = ab.b("ground_grass.png", 30, 30);
                ++ab.q;
                fb.b(0, 0, null);
                Be = 0;
                Ve = 0;
                Ue = 0;
                Te = 0;
                Se = 0;
                Ze = 0;
                Ye = 0;
                Xe = 0;
                We = 0;
                ++ab.q;
                fb.k();
                ++ab.q;
                ++ab.q;
                y.b = false;
                ++ab.q;
                ce = new l(0, oc, l.b[0]);
                de = new l(0, pc, l.b[1]);
                he = new l(0, nc, l.b[12]);
                ee = new l(0, qc, l.b[8]);
                if (rc != null) {
                    fe = new l(0, rc, l.b[9]);
                }
                if (sc != null) {
                    ge = new l(0, sc, l.b[10]);
                }
                ie = new l(1, pd, l.b[15]);
                je = new l(1, xd, l.b[16]);
                ke = new l(1, wd, l.b[17]);
                ++ab.q;
                if (fb.j() != 2) break block49;
                int n5 = 0;
                if (Sd != null) {
                    for (int i3 = 0; i3 < Sd.size(); ++i3) {
                        g g2 = (g)Sd.elementAt(i3);
                        n3 = g2.d;
                        n2 = 4;
                        if (!bl) {
                            if (n3 != n2 && g2.d != 5) continue;
                            n5 = (byte)(n5 + 1);
                            if (!bl) continue;
                        }
                        break;
                    }
                } else {
                    n3 = n5;
                    n2 = 2;
                }
                if (n3 != n2) break block50;
                ib = new s(6, -1, -1, false);
                new s(6, -1, -1, false).G = 0;
                ib.g();
                jb = new s(6, -1, -1, false);
                new s(6, -1, -1, false).G = 1;
                jb.g();
                if (!bl) break block49;
            }
            ab.m = 1;
        }
        if (fb.i()) {
            try {
                Od = Image.createImage((String)"/transparent10.png");
            }
            catch (Exception exception) {}
        }
        ab.c();
        ++ab.q;
        System.gc();
        fb.a(50);
        ++ab.q;
    }

    public final void run() {
        boolean bl = ab.xc;
        this.v = false;
        long l2 = System.currentTimeMillis();
        long l3 = 0L;
        long l4 = l2;
        while (this.J == 0) {
            block18: {
                block20: {
                    long l5;
                    block24: {
                        block23: {
                            block22: {
                                block21: {
                                    long l6;
                                    block19: {
                                        l5 = System.currentTimeMillis();
                                        if (ab.l != 0 || this.c()) {
                                            long l7;
                                            this.o();
                                            if (this.o % 2L == 0L) {
                                                rc.b.repaint();
                                                rc.b.serviceRepaints();
                                            }
                                            if ((l7 = 41L - (System.currentTimeMillis() - l5)) > 0L) {
                                                try {
                                                    Thread.sleep(l7);
                                                }
                                                catch (Exception exception) {}
                                            }
                                            Thread.yield();
                                            if (!bl) continue;
                                        }
                                        if (l3 > 0L && l5 - l3 > 100L) {
                                            l3 = 0L;
                                            this.v = false;
                                            rc.b.n = false;
                                        }
                                        if (this.v || rc.b.n) break block18;
                                        if (l5 >= l4 + (long)this.u) {
                                            this.o();
                                            ++this.t;
                                            l4 = System.currentTimeMillis();
                                        }
                                        if ((l6 = l5 - l2) <= 0L || l6 >= 1000L) break block19;
                                        this.b((long)(this.t * 1000) / l6, false);
                                        if (!bl) break block20;
                                    }
                                    if (l6 < 1000L) break block20;
                                    if (p != 0) break block21;
                                    p = this.q;
                                    if (!bl) break block22;
                                }
                                p = (p + this.q) / 2;
                            }
                            this.q = 0;
                            if (s != 0) break block23;
                            s = this.t;
                            if (!bl) break block24;
                        }
                        s = (s + this.t) / 2;
                    }
                    this.t = 0;
                    this.b((long)s, true);
                    l2 = l5;
                }
                boolean bl2 = true;
                if (this.r > 0 && m[this.r - 1][(int)(this.n % 12L)] == 0) {
                    bl2 = false;
                }
                ++this.n;
                if (bl2) {
                    l3 = System.currentTimeMillis();
                    this.v = true;
                    rc.b.repaint();
                    rc.b.serviceRepaints();
                }
            }
            Thread.yield();
            if (!bl) continue;
        }
    }

    private void o() {
        block227: {
            block258: {
                block259: {
                    fb fb2;
                    block265: {
                        block264: {
                            boolean bl;
                            block260: {
                                j j2;
                                block218: {
                                    int n2;
                                    int n3;
                                    block221: {
                                        block222: {
                                            block263: {
                                                int n4;
                                                int n5;
                                                block223: {
                                                    int n6;
                                                    block262: {
                                                        block261: {
                                                            block220: {
                                                                int n7;
                                                                int n8;
                                                                int n9;
                                                                Object object;
                                                                byte by;
                                                                Object[] objectArray;
                                                                block217: {
                                                                    int n10;
                                                                    boolean bl2;
                                                                    int n11;
                                                                    block255: {
                                                                        block256: {
                                                                            block257: {
                                                                                block251: {
                                                                                    block254: {
                                                                                        block253: {
                                                                                            block252: {
                                                                                                byte by2;
                                                                                                int n12;
                                                                                                int n13;
                                                                                                block216: {
                                                                                                    block240: {
                                                                                                        block241: {
                                                                                                            block248: {
                                                                                                                block250: {
                                                                                                                    block249: {
                                                                                                                        block242: {
                                                                                                                            block246: {
                                                                                                                                block247: {
                                                                                                                                    block243: {
                                                                                                                                        block244: {
                                                                                                                                            int n14;
                                                                                                                                            block245: {
                                                                                                                                                block239: {
                                                                                                                                                    block234: {
                                                                                                                                                        int n15;
                                                                                                                                                        int n16;
                                                                                                                                                        block235: {
                                                                                                                                                            long l2;
                                                                                                                                                            block238: {
                                                                                                                                                                block237: {
                                                                                                                                                                    block236: {
                                                                                                                                                                        block228: {
                                                                                                                                                                            block233: {
                                                                                                                                                                                block232: {
                                                                                                                                                                                    block230: {
                                                                                                                                                                                        block231: {
                                                                                                                                                                                            block229: {
                                                                                                                                                                                                block226: {
                                                                                                                                                                                                    block224: {
                                                                                                                                                                                                        block225: {
                                                                                                                                                                                                            bl = ab.xc;
                                                                                                                                                                                                            ++this.o;
                                                                                                                                                                                                            ++kb;
                                                                                                                                                                                                            if (fb.i()) break block224;
                                                                                                                                                                                                            if (!M) break block225;
                                                                                                                                                                                                            this.O.j();
                                                                                                                                                                                                            if (!bl) break block224;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        this.N.h();
                                                                                                                                                                                                    }
                                                                                                                                                                                                    fb2 = this;
                                                                                                                                                                                                    nb = System.currentTimeMillis();
                                                                                                                                                                                                    if (ab.l == 1 && !ab.o) {
                                                                                                                                                                                                        ab.B.e();
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (ab.o || fb2.i == null) break block226;
                                                                                                                                                                                                    fb2.i.d();
                                                                                                                                                                                                    if (!bl) break block227;
                                                                                                                                                                                                }
                                                                                                                                                                                                if (!fb2.R || ab.o) break block228;
                                                                                                                                                                                                if (fb2.db <= 0) break block229;
                                                                                                                                                                                                --fb2.db;
                                                                                                                                                                                                if (fb2.db != 0) break block230;
                                                                                                                                                                                                boolean bl3 = fb2.cb = !fb2.cb;
                                                                                                                                                                                                if (!bl) break block230;
                                                                                                                                                                                            }
                                                                                                                                                                                            if (!fb2.cb) break block231;
                                                                                                                                                                                            if (fb2.ab < fb2.bb) {
                                                                                                                                                                                                ++fb2.ab;
                                                                                                                                                                                            }
                                                                                                                                                                                            if (fb2.ab < fb2.bb) break block230;
                                                                                                                                                                                            fb2.db = 40;
                                                                                                                                                                                            if (!bl) break block230;
                                                                                                                                                                                        }
                                                                                                                                                                                        if (fb2.ab > 0) {
                                                                                                                                                                                            --fb2.ab;
                                                                                                                                                                                        }
                                                                                                                                                                                        if (fb2.ab <= 0) {
                                                                                                                                                                                            fb2.db = 40;
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    if (fb2.eb != -1) break block232;
                                                                                                                                                                                    if (fb2.gb == 0) {
                                                                                                                                                                                        fb2.gb = 1;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (fb2.gb >= fb2.fb) break block228;
                                                                                                                                                                                    fb2.gb <<= 1;
                                                                                                                                                                                    if (fb2.gb <= fb2.fb) break block228;
                                                                                                                                                                                    fb2.gb = fb2.fb;
                                                                                                                                                                                    fb2.eb = 0;
                                                                                                                                                                                    fb2.R = false;
                                                                                                                                                                                    if (!bl) break block228;
                                                                                                                                                                                }
                                                                                                                                                                                if (fb2.eb != 1) break block228;
                                                                                                                                                                                if (fb2.gb <= 0) break block233;
                                                                                                                                                                                fb2.gb /= 2;
                                                                                                                                                                                if (!bl) break block228;
                                                                                                                                                                            }
                                                                                                                                                                            fb2.eb = 0;
                                                                                                                                                                        }
                                                                                                                                                                        if (fb2.c()) break block234;
                                                                                                                                                                        if (fb.i()) break block235;
                                                                                                                                                                        l2 = System.currentTimeMillis();
                                                                                                                                                                        if (fb2.k == 0L) break block236;
                                                                                                                                                                        if (l2 - fb2.k <= 24999L) break block237;
                                                                                                                                                                        if (Pd != null) {
                                                                                                                                                                            qb.d(Pd);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    fb2.k = l2;
                                                                                                                                                                }
                                                                                                                                                                if (!M) break block235;
                                                                                                                                                                if (fb2.l == 0L) break block238;
                                                                                                                                                                if (l2 - fb2.l <= 4999L) break block235;
                                                                                                                                                                if (ab.mc >= 140) {
                                                                                                                                                                    int n17;
                                                                                                                                                                    int n18 = 0;
                                                                                                                                                                    int n19 = -1;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        if (++n18 > 10) {
                                                                                                                                                                            n17 = -1;
                                                                                                                                                                            if (!bl) break;
                                                                                                                                                                        }
                                                                                                                                                                        n17 = (byte)(2 + ab.oc.nextInt(Pe - 4));
                                                                                                                                                                        n19 = (byte)(2 + ab.oc.nextInt(Qe - 4));
                                                                                                                                                                        if (Re != null && fb.Re[n17][n19].d != null || s.b((byte)n17, (byte)n19) != null) continue;
                                                                                                                                                                        int n12 = n17;
                                                                                                                                                                        n12 = n19;
                                                                                                                                                                        by2 = 1;
                                                                                                                                                                        if (!bl) {
                                                                                                                                                                            objectArray = q.b(n13, n12, (int)by2, null);
                                                                                                                                                                            if (objectArray == null) break;
                                                                                                                                                                            continue;
                                                                                                                                                                        }
                                                                                                                                                                        break block216;
                                                                                                                                                                        break;
                                                                                                                                                                    }
                                                                                                                                                                    if (n17 != -1) {
                                                                                                                                                                        ab.mc -= 140;
                                                                                                                                                                        new s(17, (byte)n17, (byte)n19, false);
                                                                                                                                                                        fb2.d((byte)17, (byte)n17, (byte)n19);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            fb2.l = l2;
                                                                                                                                                        }
                                                                                                                                                        if (fb2.Q != null) {
                                                                                                                                                            h h2 = fb2.Q;
                                                                                                                                                            if (h2.b <= 0) {
                                                                                                                                                                ++h2.b;
                                                                                                                                                            }
                                                                                                                                                            for (int i2 = 0; i2 < h2.c.size(); ++i2) {
                                                                                                                                                                m m2;
                                                                                                                                                                m m3 = m2 = (m)h2.c.elementAt(i2);
                                                                                                                                                                ++m2.c;
                                                                                                                                                                int n15 = m3.c;
                                                                                                                                                                n15 = 60;
                                                                                                                                                                if (!bl) {
                                                                                                                                                                    if (n16 < n15) continue;
                                                                                                                                                                    h2.c.removeElementAt(i2);
                                                                                                                                                                    --i2;
                                                                                                                                                                    if (!bl) continue;
                                                                                                                                                                }
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            if (fb2.C > 0) {
                                                                                                                                                                --fb2.C;
                                                                                                                                                            }
                                                                                                                                                            int n15 = ++fb2.z;
                                                                                                                                                            n15 = 11;
                                                                                                                                                        }
                                                                                                                                                        if (n16 <= n15) break block239;
                                                                                                                                                        fb2.z = 0;
                                                                                                                                                        if (!bl) break block239;
                                                                                                                                                    }
                                                                                                                                                    fb2.k = System.currentTimeMillis();
                                                                                                                                                    fb2.l = System.currentTimeMillis();
                                                                                                                                                }
                                                                                                                                                if (Be != 0) break block240;
                                                                                                                                                if (fb2.c()) break block227;
                                                                                                                                                if (Pd == null || !Pd.n() || fb.Pd.hc) break block241;
                                                                                                                                                byte by3 = -1;
                                                                                                                                                if (fb2.le != 0) {
                                                                                                                                                    by3 = 0;
                                                                                                                                                    if (fb2.le == 1) {
                                                                                                                                                        fb2.le = 0;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                if (fb2.ne != 0) {
                                                                                                                                                    by3 = 2;
                                                                                                                                                    if (fb2.ne == 1) {
                                                                                                                                                        fb2.ne = 0;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                if (fb2.oe != 0) {
                                                                                                                                                    by3 = 3;
                                                                                                                                                    if (fb2.oe == 1) {
                                                                                                                                                        fb2.oe = 0;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                if (fb2.me != 0) {
                                                                                                                                                    by3 = 1;
                                                                                                                                                    if (fb2.me == 1) {
                                                                                                                                                        fb2.me = 0;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                if (by3 != -1) {
                                                                                                                                                    boolean bl4 = false;
                                                                                                                                                    if (System.currentTimeMillis() - fb2.ue < 300L) {
                                                                                                                                                        fb2.ue = System.currentTimeMillis();
                                                                                                                                                        bl4 = true;
                                                                                                                                                    }
                                                                                                                                                    if (Pd.b(by3, bl4) && !fb.i()) {
                                                                                                                                                        fb2.b(fb.Pd.w, fb.Pd.g, fb.Pd.h, by3, bl4);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                if (fb2.pe == 0) break block242;
                                                                                                                                                if (fb.Pd.Cc != null) break block243;
                                                                                                                                                if (fb.Pd.bc == -1) break block244;
                                                                                                                                                n14 = Pd.b((byte)fb.Pd.bc, false, fb.Pd.g, fb.Pd.h, null);
                                                                                                                                                if (n14 != 2) break block245;
                                                                                                                                                if (kb - fb2.E < 75L) break block244;
                                                                                                                                                q q2 = Pd;
                                                                                                                                                q2 = Pd;
                                                                                                                                                new w(null, (int)(Pd.c / 10), (int)(q2.d / 10 - 25), (byte)8, (boolean)true, (int)0).i = "^27~";
                                                                                                                                                fb2.E = kb;
                                                                                                                                                if (!bl) break block244;
                                                                                                                                            }
                                                                                                                                            if (n14 == 0 && fb.Pd.Yb[fb.Pd.bc] != -1) {
                                                                                                                                                String string = hb.b(fb.Pd.bc) + fb.Pd.Yb[fb.Pd.bc];
                                                                                                                                                fb fb3 = fb2;
                                                                                                                                                fb2.D = string;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        fb2.a(true);
                                                                                                                                        if (!bl) break block246;
                                                                                                                                    }
                                                                                                                                    if (!fb.Pd.Cc.e() && !fb.Pd.Cc.f()) break block247;
                                                                                                                                    fb.Pd.Cc.d();
                                                                                                                                    if (!bl) break block246;
                                                                                                                                }
                                                                                                                                if (fb.Pd.bc != -1) {
                                                                                                                                    fb.Pd.Cc.b((byte)-1, fb.Pd.bc);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            fb2.pe = 0;
                                                                                                                            if (!bl) break block248;
                                                                                                                        }
                                                                                                                        if (fb2.qe == 0 || fb.Pd.cc == -1) break block248;
                                                                                                                        if (fb.Pd.cc >= 14) break block249;
                                                                                                                        int n20 = Pd.b((byte)fb.Pd.cc, false, fb.Pd.g, fb.Pd.h, null);
                                                                                                                        if (n20 == 2 && kb - fb2.E >= 75L) {
                                                                                                                            q q3 = Pd;
                                                                                                                            q3 = Pd;
                                                                                                                            new w(null, (int)(Pd.c / 10), (int)(q3.d / 10 - 25), (byte)8, (boolean)true, (int)0).i = "^27~";
                                                                                                                            fb2.E = kb;
                                                                                                                        }
                                                                                                                        if (!bl) break block250;
                                                                                                                    }
                                                                                                                    Pd.d((byte)(fb.Pd.cc - 14), false);
                                                                                                                }
                                                                                                                fb2.a(false);
                                                                                                                fb2.qe = 0;
                                                                                                            }
                                                                                                            if (fb2.re != 0) {
                                                                                                                Pd.b(false, (byte)-1, (byte)-1, false, false);
                                                                                                                fb2.re = 0;
                                                                                                            }
                                                                                                            if (!bl) break block251;
                                                                                                        }
                                                                                                        fb2.e();
                                                                                                        if (!bl) break block251;
                                                                                                    }
                                                                                                    if (Be != we) break block251;
                                                                                                    if (fb2.le != 0) {
                                                                                                        Fe += ye;
                                                                                                        if (fb2.le == 1) {
                                                                                                            fb2.le = 0;
                                                                                                        }
                                                                                                    }
                                                                                                    if (fb2.me != 0) {
                                                                                                        Ee -= ye;
                                                                                                        if (fb2.me == 1) {
                                                                                                            fb2.me = 0;
                                                                                                        }
                                                                                                    }
                                                                                                    if (fb2.ne != 0) {
                                                                                                        Fe -= ye;
                                                                                                        if (fb2.ne == 1) {
                                                                                                            fb2.ne = 0;
                                                                                                        }
                                                                                                    }
                                                                                                    if (fb2.oe != 0) {
                                                                                                        Ee += ye;
                                                                                                        if (fb2.oe == 1) {
                                                                                                            fb2.oe = 0;
                                                                                                        }
                                                                                                    }
                                                                                                    int n12 = Ee;
                                                                                                    n12 = ab.D / 2;
                                                                                                    by2 = Ae;
                                                                                                }
                                                                                                if (n13 >= n12 + by2) break block252;
                                                                                                Ee = ab.D / 2 + Ae;
                                                                                                if (!bl) break block253;
                                                                                            }
                                                                                            if (Ee > Pe * 30 - ab.D / 2 - Ae) {
                                                                                                Ee = Pe * 30 - ab.D / 2 - Ae;
                                                                                            }
                                                                                        }
                                                                                        if (Fe >= ab.E / 2 + Ae) break block254;
                                                                                        Fe = ab.E / 2 + Ae;
                                                                                        if (!bl) break block251;
                                                                                    }
                                                                                    if (Fe > Qe * 30 - ab.E / 2 - Ae) {
                                                                                        Fe = Qe * 30 - ab.E / 2 - Ae;
                                                                                    }
                                                                                }
                                                                                fb.b(Ee, Fe, De);
                                                                                by = Ce;
                                                                                if (Be == we) {
                                                                                    by = ze;
                                                                                }
                                                                                if ((object = Ie - Ge) > by) {
                                                                                    object = by;
                                                                                }
                                                                                if ((n11 = Je - He) > by) {
                                                                                    n11 = by;
                                                                                }
                                                                                Ge += object / 5;
                                                                                He += n11 / 5;
                                                                                if (Ne < 0) break block255;
                                                                                if (--Ne <= 0) break block256;
                                                                                if (Ne < 3) {
                                                                                    Me /= 2;
                                                                                }
                                                                                if (Me <= 0) break block257;
                                                                                Ke = ab.oc.nextInt(Me) - ab.oc.nextInt(Me);
                                                                                Le = ab.oc.nextInt(Me) - ab.oc.nextInt(Me);
                                                                                if (!bl) break block256;
                                                                            }
                                                                            Ne = 0;
                                                                        }
                                                                        if (Ne == 0) {
                                                                            Ne = -1;
                                                                            Ke = 0;
                                                                            Le = 0;
                                                                        }
                                                                        Ge += Ke;
                                                                        He += Le;
                                                                    }
                                                                    if (Ge < Ae) {
                                                                        Ge = Ae;
                                                                    }
                                                                    if (Ge + ab.D > Pe * 30 - Ae) {
                                                                        Ge = Pe * 30 - ab.D - Ae;
                                                                    }
                                                                    if (He < Ae) {
                                                                        He = Ae;
                                                                    }
                                                                    if (He + ab.E > Qe * 30 - Ae) {
                                                                        He = Qe * 30 - ab.E - Ae;
                                                                    }
                                                                    Se = (byte)Math.abs(Ge / 30);
                                                                    Te = (byte)Math.abs(He / 30);
                                                                    Ue = (byte)(ab.D / 30 + 2);
                                                                    Ve = (byte)(ab.E / 30 + 2);
                                                                    if (Se < 0) {
                                                                        Se = 0;
                                                                    }
                                                                    if (Te < 0) {
                                                                        Te = 0;
                                                                    }
                                                                    if (Se + Ue > Pe) {
                                                                        Ue = (byte)(Pe - Se);
                                                                    }
                                                                    if (Te + Ve > Qe) {
                                                                        Ve = (byte)(Qe - Te);
                                                                    }
                                                                    We = (byte)(Se - af);
                                                                    Xe = (byte)(Te - af);
                                                                    Ye = (byte)(Ue + (af << 1));
                                                                    Ze = (byte)(Ve + (af << 1));
                                                                    if (We < 0) {
                                                                        Ye = (byte)(Ye + We);
                                                                        We = 0;
                                                                    }
                                                                    if (Xe < 0) {
                                                                        Ze = (byte)(Ze + Xe);
                                                                        Xe = 0;
                                                                    }
                                                                    if (We + Ye > Pe) {
                                                                        Ye = (byte)(Pe - We);
                                                                    }
                                                                    if (Xe + Ze > Qe) {
                                                                        Ze = (byte)(Qe - Xe);
                                                                    }
                                                                    if (fb2.c()) break block227;
                                                                    if (Qd != null) {
                                                                        for (n11 = 0; n11 < Qd.size(); ++n11) {
                                                                            bl2 = ((q)fb.Qd.elementAt((int)n11)).V;
                                                                            if (!bl) {
                                                                                if (bl2) {
                                                                                    Qd.removeElementAt(n11);
                                                                                    --n11;
                                                                                    if (!bl) continue;
                                                                                }
                                                                                ((q)Qd.elementAt(n11)).h();
                                                                                if (!bl) continue;
                                                                            }
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        bl2 = fb.i();
                                                                    }
                                                                    if ((bl2 || M) && Zd != null && kb % 2L == 0L) {
                                                                        fb2.A = false;
                                                                        for (n11 = 0; n11 < Zd.size(); ++n11) {
                                                                            v v2 = (v)Zd.elementAt(n11);
                                                                            n10 = v2.q ? 1 : 0;
                                                                            if (!bl) {
                                                                                if (n10 != 0) {
                                                                                    Zd.removeElementAt(n11);
                                                                                    --n11;
                                                                                    if (!bl) continue;
                                                                                }
                                                                                if (v2.x) {
                                                                                    v2.y -= 2L;
                                                                                    if (v2.y > 0L) continue;
                                                                                    v2.b(v2.z);
                                                                                    if (!bl) continue;
                                                                                }
                                                                                v2.b();
                                                                                if (!bl) continue;
                                                                            }
                                                                            break;
                                                                        }
                                                                    } else if (be != null) {
                                                                        for (n11 = 0; n11 < be.size(); ++n11) {
                                                                            n10 = ((r)fb.be.elementAt((int)n11)).z;
                                                                            if (!bl) {
                                                                                if (n10 != 0) {
                                                                                    be.removeElementAt(n11);
                                                                                    --n11;
                                                                                    if (!bl) continue;
                                                                                }
                                                                                ((r)be.elementAt(n11)).h();
                                                                                if (!bl) continue;
                                                                            }
                                                                            break;
                                                                        }
                                                                    } else if (Xd != null) {
                                                                        for (n11 = 0; n11 < Xd.size(); ++n11) {
                                                                            n10 = ((w)fb.Xd.elementAt((int)n11)).f;
                                                                            if (!bl) {
                                                                                if (n10 != 0) {
                                                                                    Xd.removeElementAt(n11);
                                                                                    --n11;
                                                                                    if (!bl) continue;
                                                                                }
                                                                                ((w)Xd.elementAt(n11)).b();
                                                                                if (!bl) continue;
                                                                            }
                                                                            break;
                                                                        }
                                                                    } else if (Ud != null) {
                                                                        for (n11 = 0; n11 < Ud.size(); ++n11) {
                                                                            n10 = ((hb)fb.Ud.elementAt((int)n11)).p;
                                                                            if (!bl) {
                                                                                if (n10 != 0) {
                                                                                    Ud.removeElementAt(n11);
                                                                                    --n11;
                                                                                    if (!bl) continue;
                                                                                }
                                                                                ((hb)Ud.elementAt(n11)).c();
                                                                                if (!bl) continue;
                                                                            }
                                                                            break;
                                                                        }
                                                                    } else if (Td != null) {
                                                                        for (n6 = 0; n6 < Td.size(); ++n6) {
                                                                            n10 = ((p)fb.Td.elementAt((int)n6)).t ? 1 : 0;
                                                                            if (!bl) {
                                                                                if (n10 != 0) {
                                                                                    Td.removeElementAt(n6);
                                                                                    --n6;
                                                                                    if (!bl) continue;
                                                                                }
                                                                                ((p)Td.elementAt(n6)).h();
                                                                                if (!bl) continue;
                                                                            }
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        if (Ic != null) {
                                                                            pb pb2 = Ic;
                                                                            ++pb2.b;
                                                                            if (pb2.b >= pb2.h) {
                                                                                pb2.b = 0;
                                                                            }
                                                                        }
                                                                        if (Vd != null) {
                                                                            for (n6 = 0; n6 < Vd.size(); ++n6) {
                                                                                n10 = ((t)fb.Vd.elementAt((int)n6)).C ? 1 : 0;
                                                                                if (!bl) {
                                                                                    if (n10 != 0) {
                                                                                        --t.r;
                                                                                        Vd.removeElementAt(n6);
                                                                                        --n6;
                                                                                        if (!bl) continue;
                                                                                    }
                                                                                    ((t)Vd.elementAt(n6)).h();
                                                                                    if (!bl) continue;
                                                                                }
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            n10 = n9 = 0;
                                                                        }
                                                                    }
                                                                    while (n9 < Qe) {
                                                                        n8 = 0;
                                                                        if (bl) break block217;
                                                                        for (int i3 = v43622; i3 < Pe; ++i3) {
                                                                            j2 = fb.Re[i3][n9].d;
                                                                            if (!bl) {
                                                                                if (j2 == null) continue;
                                                                                fb.Re[i3][n9].d.b();
                                                                                if (!bl) continue;
                                                                            }
                                                                            break block218;
                                                                        }
                                                                        ++n9;
                                                                        if (!bl) continue;
                                                                    }
                                                                    if (Wd != null) {
                                                                        for (n6 = 0; n6 < Wd.size(); ++n6) {
                                                                            d d2 = (d)Wd.elementAt(n6);
                                                                            n8 = d2.g--;
                                                                            if (!bl) {
                                                                                int n21;
                                                                                if (n8 > 0) {
                                                                                    // empty if block
                                                                                }
                                                                                if (d2.e != null) {
                                                                                    d2.e.c();
                                                                                }
                                                                                if (((d)fb.Wd.elementAt((int)n6)).g != 0 || o.c((byte)(n21 = ((d)fb.Wd.elementAt((int)n6)).b / 30), (byte)(n9 = ((d)fb.Wd.elementAt((int)n6)).c / 30)) && !((d)fb.Wd.elementAt((int)n6)).i) continue;
                                                                                Wd.removeElementAt(n6);
                                                                                --n6;
                                                                                if (!bl) continue;
                                                                            }
                                                                            break block217;
                                                                        }
                                                                    }
                                                                    if (Yd != null) {
                                                                        byte by3;
                                                                        block219: {
                                                                            for (int i4 = 0; i4 < Yd.size(); ++i4) {
                                                                                by3 = ((s)fb.Yd.elementAt((int)i4)).r ? 1 : 0;
                                                                                if (!bl) {
                                                                                    if (by3 != 0) {
                                                                                        Yd.removeElementAt(i4);
                                                                                        --i4;
                                                                                        if (!bl) continue;
                                                                                    }
                                                                                    ((s)Yd.elementAt(i4)).h();
                                                                                    if (!bl) continue;
                                                                                }
                                                                                break block219;
                                                                            }
                                                                            by3 = fb.j();
                                                                        }
                                                                        if (by3 == 2 && ib != null && jb != null) {
                                                                            if (++cf >= 19) {
                                                                                cf = 0;
                                                                            }
                                                                            ib.h();
                                                                            jb.h();
                                                                            if (!ib.b()) {
                                                                                I.b((byte)0, (byte)0, (byte)-1, (byte)0, (byte)0, (byte)0);
                                                                            }
                                                                            if (!jb.b()) {
                                                                                I.b((byte)1, (byte)0, (byte)-1, (byte)0, (byte)0, (byte)0);
                                                                            }
                                                                        }
                                                                    }
                                                                    n8 = M;
                                                                }
                                                                if (n8 == 0 && !fb.i()) break block258;
                                                                if (M) {
                                                                    n9 = 0;
                                                                    if (y.b && kb % 375L == 0L) {
                                                                        n9 = 1;
                                                                    }
                                                                    for (n6 = 0; n6 < Qd.size(); ++n6) {
                                                                        q q4 = (q)Qd.elementAt(n6);
                                                                        n7 = n9;
                                                                        if (!bl) {
                                                                            if (n7 != 0 && q4.Cc != null && q4.Yb != null) {
                                                                                y.d(q4);
                                                                            }
                                                                            if (!q4.m() || q4.ic == -1L || kb - q4.ic < 200L) continue;
                                                                            byte[] byArray = q.b((q)Qd.elementAt(n6));
                                                                            objectArray = byArray;
                                                                            if (byArray == null) continue;
                                                                            if (Pd != null && ((q)fb.Qd.elementAt((int)n6)).w == fb.Pd.w) {
                                                                                fb.b(Pd, false);
                                                                            }
                                                                            if (!M) continue;
                                                                            q q5 = objectArray[1];
                                                                            object = objectArray[0];
                                                                            by = ((q)fb.Qd.elementAt((int)n6)).w;
                                                                            fb fb4 = fb2;
                                                                            byte[] byArray2 = new byte[4];
                                                                            objectArray = byArray2;
                                                                            byArray2[0] = 2;
                                                                            objectArray[1] = (q)by;
                                                                            objectArray[2] = (q)object;
                                                                            objectArray[3] = q5;
                                                                            fb4.a((byte[])objectArray);
                                                                            if (!bl) continue;
                                                                        }
                                                                        break;
                                                                    }
                                                                } else {
                                                                    n7 = fb.i();
                                                                }
                                                                if (n7 == 0) break block259;
                                                                if (ae != null) {
                                                                    for (int i5 = 0; i5 < ae.size(); ++i5) {
                                                                        ((sb)ae.elementAt(i5)).b();
                                                                        if (!bl) {
                                                                            if (!bl) continue;
                                                                        }
                                                                        break block220;
                                                                    }
                                                                    df = false;
                                                                }
                                                            }
                                                            if (!ab.v && Pd != null && Pd.m() && fb.Pd.ic != -1L && kb - fb.Pd.ic >= 50L) {
                                                                fb2.c(false, false);
                                                            }
                                                            if (!ab.v && !ab.w) break block260;
                                                            if (ab.bc != 0) break block261;
                                                            q q6 = q.d(2);
                                                            if (kb % 15L == 0L) {
                                                                block15: while (true) {
                                                                    int n17 = ab.oc.nextInt(14);
                                                                    do {
                                                                        if (n17 == 12) continue block15;
                                                                        n17 = y.f(n6) ? 1 : 0;
                                                                    } while (bl);
                                                                    if (n17 != 0) break;
                                                                }
                                                                q6.bc = n6;
                                                            }
                                                            for (n6 = 0; n6 < Qd.size(); ++n6) {
                                                                q6 = (q)Qd.elementAt(n6);
                                                                int n2 = q6.g;
                                                                n2 = 20;
                                                                if (bl) break block221;
                                                                if (n3 <= n2) continue;
                                                                if (q6.g == 29 && (q6.h == 3 || q6.h == 4)) {
                                                                    q6.Cc.q = (byte)30;
                                                                    q6.Cc.r = 1;
                                                                    q6.Ec = false;
                                                                    if (!bl) continue;
                                                                }
                                                                if (q6.g == 30 && q6.h == 1) {
                                                                    q6.Cc.q = (byte)30;
                                                                    q6.Cc.r = (byte)5;
                                                                    if (!q6.Fc) continue;
                                                                    s s2 = new s(-1, q6.g, q6.h, false);
                                                                    new s(-1, q6.g, q6.h, false).H = q6;
                                                                    s2.J = true;
                                                                    q6.Fc = false;
                                                                    if (!bl) continue;
                                                                }
                                                                if (q6.g != 30 || q6.h != 5) continue;
                                                                q6.Cc.q = (byte)34;
                                                                q6.Cc.r = (byte)5;
                                                                if (!bl) continue;
                                                                break block222;
                                                            }
                                                            break block222;
                                                        }
                                                        if (ab.bc != 2) break block262;
                                                        for (n6 = 0; n6 < Qd.size(); ++n6) {
                                                            q q7 = (q)Qd.elementAt(n6);
                                                            int n2 = q7.r;
                                                            n2 = 1;
                                                            if (bl) break block221;
                                                            if (n3 != n2 || q7.g < 17 || q7.h < 10 || q7.g > 23 || q7.h > 15) continue;
                                                            q7.Cc.q = (byte)24;
                                                            q7.Cc.r = (byte)14;
                                                            q7.Ec = false;
                                                            if (!q7.Fc) continue;
                                                            s s3 = new s(-1, q7.g, q7.h, false);
                                                            new s(-1, q7.g, q7.h, false).H = q7;
                                                            s3.J = true;
                                                            q7.Fc = false;
                                                            if (!bl) continue;
                                                            break block222;
                                                        }
                                                        break block222;
                                                    }
                                                    if (ab.bc != 4) break block222;
                                                    for (n6 = 0; n6 < Qd.size(); ++n6) {
                                                        q q8 = (q)Qd.elementAt(n6);
                                                        int n4 = q8.g;
                                                        n4 = 8;
                                                        if (!bl) {
                                                            if (n5 != n4 || q8.h != 6) continue;
                                                            q8.Cc.q = (byte)16;
                                                            q8.Cc.r = (byte)2;
                                                            if (!q8.Ec) continue;
                                                            s s4 = new s(-1, q8.g, q8.h, false);
                                                            new s(-1, q8.g, q8.h, false).H = q8;
                                                            s4.J = true;
                                                            q8.Ec = false;
                                                            if (!bl) continue;
                                                        }
                                                        break block223;
                                                    }
                                                    int n4 = fb.Pd.g;
                                                    n4 = 10;
                                                }
                                                if (n5 != n4 || fb.Pd.h != 6 || fb.Re[15][1].d == null) break block222;
                                                if (fb.Re[15][1].d.N) break block263;
                                                fb.Re[15][3].d.f();
                                                fb.Re[15][3].d = null;
                                                fb.Re[15][2].d.f();
                                                fb.Re[15][2].d = null;
                                                fb.Re[16][1].d.f();
                                                fb.Re[16][1].d = null;
                                                fb.Re[17][1].d.f();
                                                fb.Re[17][1].d = null;
                                                fb.Re[17][3].d.f();
                                                fb.Re[17][3].d = null;
                                                fb.Re[17][2].d.f();
                                                fb.Re[17][2].d = null;
                                                fb.Re[15][1].d.z = true;
                                                fb.Re[15][1].d.N = true;
                                                fb.Re[15][1].d.M = 40L;
                                                r[] rArray = r.b((byte)15, (byte)2);
                                                r r2 = rArray[0];
                                                rArray[0].z = true;
                                                if (!bl) break block222;
                                            }
                                            if (fb.Re[15][1].d.i < -300) {
                                                fb.Re[15][1].d.f();
                                                fb.Re[15][1].d = null;
                                                fb.k();
                                            }
                                        }
                                        int n2 = ab.bc;
                                        n2 = 24;
                                    }
                                    if (n3 != n2) break block260;
                                    j2 = fb.Re[3][2].d;
                                }
                                if (!j2.N) {
                                    fb.Re[3][2].d.z = true;
                                    fb.Re[3][2].d.N = true;
                                    fb.Re[3][2].d.M = 40L;
                                }
                            }
                            if (!ab.w) break block264;
                            if (ab.x >= ab.y || (ab.x += 2) <= ab.y) break block265;
                            ab.x = ab.y;
                            if (!bl) break block265;
                        }
                        if (ab.x > 0 && (ab.x -= 2) < 0) {
                            ab.x = 0;
                        }
                    }
                    if (ab.t >= 0) {
                        if (kb % 2L == 0L) {
                            --ab.t;
                        }
                        if (ab.t <= 0) {
                            ab.t = 0;
                            fb2.c(true, false);
                        }
                    }
                    if ((ef = g - q.W == 0) && !ff && gf == -1) {
                        gf = 125;
                    }
                    if (gf > 0 && --gf <= 0) {
                        fb2.c(true, false);
                    }
                }
                if (!fb.i() && ab.m == 2) {
                    y.S = fb.jb.g;
                    y.T = fb.jb.h;
                    y.U = fb.ib.g;
                    y.V = fb.ib.h;
                }
            }
            nb = System.currentTimeMillis() - nb;
        }
        if (!fb.i()) {
            if (M) {
                this.O.i();
                return;
            }
            this.N.g();
        }
    }

    public final void p() {
        ++this.q;
        this.v = false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void b(long l2, boolean bl) {
        if (l2 > 24L) {
            if (this.r > 0) {
                if (!bl) return;
                --this.r;
                return;
            }
            ++this.u;
            return;
        }
        if (l2 >= 24L) return;
        if (this.u < 2) {
            this.u = 0;
            if (this.r >= 8 || !bl) return;
            ++this.r;
            return;
        }
        --this.u;
    }

    public final void c(String string) {
        this.D = string;
    }

    /*
     * Exception decompiling
     */
    public final void b(Graphics var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [20[DOLOOP]], but top level block is 29[FORLOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private void d(Graphics graphics) {
        int n2;
        int n3;
        boolean bl = ab.xc;
        if (this.lf) {
            for (n3 = Se; n3 < Se + Ue; ++n3) {
                n2 = Te;
                if (!bl) {
                    for (int i2 = v80263; i2 < Te + Ve; ++i2) {
                        if (bf != null && bf[n3][i2] == 0) {
                            graphics.setColor(0xFF0000);
                            graphics.drawLine(n3 * 30 + 15 - Ge - 5, i2 * 30 + 15 - He - 5, n3 * 30 + 15 - Ge + 5, i2 * 30 + 15 - He + 5);
                            graphics.drawLine(n3 * 30 + 15 - Ge + 5, i2 * 30 + 15 - He - 5, n3 * 30 + 15 - Ge - 5, i2 * 30 + 15 - He + 5);
                        }
                        if (q.Vc != null && q.Vc[n3][i2] != 0) {
                            graphics.setColor(0xFFFFFF);
                            graphics.drawString("c" + q.Vc[n3][i2], n3 * 30 + 3 - Ge, i2 * 30 + 3 - He, 0);
                        }
                        if (y.O == null) continue;
                        graphics.setColor(0xFFAAAA);
                        graphics.drawString(y.O[n3][i2] != 0 ? "" + y.O[n3][i2] : "", n3 * 30 + 5 - Ge, i2 * 30 + 5 - He, 0);
                        graphics.setColor(0xAAAAFF);
                        graphics.drawString(y.P[n3][i2] != 0 ? "" + y.P[n3][i2] : "", n3 * 30 + 15 - Ge, i2 * 30 + 15 - He, 0);
                        if (!bl) continue;
                    }
                    if (!bl) continue;
                }
                break;
            }
        } else {
            n2 = this.kf;
        }
        if (n2 != 0) {
            graphics.setColor(0xFFFFFF);
            if (this.kf == 1) {
                graphics.drawString("OcM: " + (ab.bb - ab.cb) + "/" + ab.bb + "kb (" + ab.db + "kb)", 3, ab.E - (ab.F.getHeight() << 1) - 2, 0);
                graphics.drawString("FPS: " + p + "/" + s + "(" + this.r + ")", 3, ab.E - ab.F.getHeight() - 2, 0);
                return;
            }
            if (this.kf == 2) {
                graphics.drawString("Ping: " + this.jf + " RcvFnc: " + this.mf + "(" + this.nf + ")", 3, ab.E - ab.F.getHeight() - 2, 0);
                graphics.drawString("Thds: " + Thread.activeCount(), 3, ab.E - (ab.F.getHeight() << 1) - 2, 0);
                if (!fb.i()) {
                    graphics.drawString("Queue: " + (M ? this.O.m() : this.N.i()), 3, ab.E - ab.F.getHeight() * 3 - 2, 0);
                    return;
                }
            } else if (this.kf == 3) {
                n3 = 1;
                if (Pd != null) {
                    n3 = 2;
                    graphics.drawString("X: " + fb.Pd.g + " Y: " + fb.Pd.h, 3, ab.E - ab.F.getHeight() * 1 - 2, 0);
                }
                int n4 = n3;
                n3 = (byte)(n3 + 1);
                graphics.drawString("Phys: " + 0 + " (" + 0 + ") [" + 0 + "]", 3, ab.E - ab.F.getHeight() * n4 - 2, 0);
                int n5 = n3;
                n3 = (byte)(n3 + 1);
                graphics.drawString("Clds: " + t.r, 3, ab.E - ab.F.getHeight() * n5 - 2, 0);
                graphics.drawString("Dbg: " + this.hf, 3, ab.E - ab.F.getHeight() * n3 - 2, 0);
            }
        }
    }

    public final void c(int n2) {
        int n3;
        block43: {
            block48: {
                block49: {
                    boolean bl;
                    block46: {
                        block47: {
                            block44: {
                                block45: {
                                    block30: {
                                        block32: {
                                            block42: {
                                                block41: {
                                                    block40: {
                                                        block39: {
                                                            block38: {
                                                                block37: {
                                                                    block36: {
                                                                        block35: {
                                                                            block34: {
                                                                                block33: {
                                                                                    block31: {
                                                                                        bl = ab.xc;
                                                                                        if (ab.o) {
                                                                                            this.e();
                                                                                            return;
                                                                                        }
                                                                                        if (this.i != null) {
                                                                                            this.i.b(n2);
                                                                                            return;
                                                                                        }
                                                                                        if (n2 == ab.jb || n2 == ab.lb) {
                                                                                            rc.b.b();
                                                                                            if (this.H) {
                                                                                                ab.B.g(false);
                                                                                                return;
                                                                                            }
                                                                                            ab.B.m();
                                                                                            return;
                                                                                        }
                                                                                        if (n2 == ab.kb || n2 == ab.mb) {
                                                                                            rc.b.b();
                                                                                            if (this.c && fb.Pd.nc > 0) {
                                                                                                this.c(true, true);
                                                                                                return;
                                                                                            }
                                                                                            if (this.H) {
                                                                                                ab.B.g(false);
                                                                                                return;
                                                                                            }
                                                                                            if (!this.se) {
                                                                                                this.se = true;
                                                                                                return;
                                                                                            }
                                                                                        }
                                                                                        if (!this.se) break block30;
                                                                                        if ((n2 == ab.kb || n2 == ab.mb) && this.se) {
                                                                                            this.d(n2);
                                                                                            return;
                                                                                        }
                                                                                        if (n2 != 49) break block31;
                                                                                        this.te = this.te + "1";
                                                                                        if (!bl) break block32;
                                                                                    }
                                                                                    if (n2 != 50) break block33;
                                                                                    this.te = this.te + "2";
                                                                                    if (!bl) break block32;
                                                                                }
                                                                                if (n2 != 51) break block34;
                                                                                this.te = this.te + "3";
                                                                                if (!bl) break block32;
                                                                            }
                                                                            if (n2 != 52) break block35;
                                                                            this.te = this.te + "4";
                                                                            if (!bl) break block32;
                                                                        }
                                                                        if (n2 != 53) break block36;
                                                                        this.te = this.te + "5";
                                                                        if (!bl) break block32;
                                                                    }
                                                                    if (n2 != 54) break block37;
                                                                    this.te = this.te + "6";
                                                                    if (!bl) break block32;
                                                                }
                                                                if (n2 != 55) break block38;
                                                                this.te = this.te + "7";
                                                                if (!bl) break block32;
                                                            }
                                                            if (n2 != 56) break block39;
                                                            this.te = this.te + "8";
                                                            if (!bl) break block32;
                                                        }
                                                        if (n2 != 57) break block40;
                                                        this.te = this.te + "9";
                                                        if (!bl) break block32;
                                                    }
                                                    if (n2 != 48) break block41;
                                                    this.te = this.te + "0";
                                                    if (!bl) break block32;
                                                }
                                                if (n2 != 42) break block42;
                                                this.te = this.te + "*";
                                                if (!bl) break block32;
                                            }
                                            if (n2 == 35) {
                                                this.te = this.te + "#";
                                            }
                                        }
                                        if (this.te.length() > 30) {
                                            this.se = false;
                                            this.te = "";
                                        }
                                        return;
                                    }
                                    n3 = rc.b.getGameAction(n2);
                                    if (this.H && (n3 == 8 || n2 == ab.rb)) {
                                        ab.B.g(false);
                                        return;
                                    }
                                    if (this.c()) break block43;
                                    if (n2 != 57 || fb.i() || this.eb != 0) break block44;
                                    boolean bl2 = this.R = !this.R;
                                    if (!this.R) break block45;
                                    this.h();
                                    if (!bl) break block44;
                                }
                                this.R = true;
                                this.g();
                            }
                            if (n2 == 35 && !ab.w && Pd != null) {
                                this.g();
                                ab.B.b(Pd);
                                return;
                            }
                            if (n3 != 8 && n2 != ab.rb) break block46;
                            if (!this.R || fb.i()) break block47;
                            this.g();
                            if (!bl) break block46;
                        }
                        this.pe = (byte)2;
                    }
                    if (n2 != ab.sb && n2 != ab.tb) break block48;
                    if (!this.R || fb.i()) break block49;
                    this.g();
                    if (!bl) break block48;
                }
                this.qe = (byte)2;
            }
            if (n2 == ab.ub || n2 == ab.vb) {
                this.re = (byte)2;
            }
        }
        if (n3 == 6 || n2 == ab.nb) {
            this.le = (byte)2;
        }
        if (n3 == 2 || n2 == ab.ob) {
            this.me = (byte)2;
        }
        if (n3 == 1 || n2 == ab.pb) {
            this.ne = (byte)2;
        }
        if (n3 == 5 || n2 == ab.qb) {
            this.oe = (byte)2;
        }
    }

    public final void d(int n2) {
        block48: {
            block49: {
                block46: {
                    boolean bl = ab.xc;
                    if (ab.o) {
                        this.e();
                        return;
                    }
                    if (this.i != null) {
                        this.i.c(n2);
                        return;
                    }
                    if (n2 != ab.kb && n2 != ab.mb) break block48;
                    this.se = false;
                    fb fb2 = this;
                    if (fb2.te == null) break block49;
                    try {
                        int n3;
                        block53: {
                            block55: {
                                q q2;
                                block54: {
                                    block50: {
                                        block52: {
                                            block51: {
                                                if (fb2.te.length() <= 0) {
                                                    fb2.te = "";
                                                    return;
                                                }
                                                if (fb2.te.equals("#*")) {
                                                    fb2.kf = fb2.kf != 0 ? (byte)0 : 1;
                                                    fb2.te = "";
                                                }
                                                if (fb2.kf == 0) break block46;
                                                if (fb2.te.equals("*")) {
                                                    fb2.kf = (byte)(fb2.kf + 1);
                                                    if (fb2.kf > 3) {
                                                        fb2.kf = 1;
                                                    }
                                                    fb2.te = "";
                                                }
                                                if (fb2.te.equals("#")) {
                                                    fb2.lf = !fb2.lf;
                                                    fb2.te = "";
                                                }
                                                if (!fb2.te.startsWith("321456987")) break block50;
                                                if (!fb2.te.equals("321456987")) break block51;
                                                ob = false;
                                                if (!bl) break block52;
                                            }
                                            ob = true;
                                            n3 = Integer.parseInt(fb2.te.substring(9, fb2.te.length()), 10);
                                            if (n3 < 5) {
                                                ob = false;
                                            }
                                            if (n3 > 20) {
                                                ob = false;
                                            }
                                            if (ob) {
                                                lb = (byte)(n3 / 4);
                                                mb = 1000 / (lb << 2);
                                            }
                                        }
                                        if (!ob) {
                                            lb = (byte)6;
                                            mb = 1000 / (lb << 2);
                                        }
                                        fb2.te = "";
                                    }
                                    if (!M && !fb.i() || !fb2.te.startsWith("2580789")) break block53;
                                    if (!fb2.te.equals("2580789")) break block54;
                                    Pd = (q)Qd.elementAt(0);
                                    fb.b(Pd, false);
                                    if (!bl) break block55;
                                }
                                if ((q2 = q.d((byte)(n3 = Integer.parseInt(fb2.te.substring(7, fb2.te.length()), 10)))) != null && q2.Cc != null) {
                                    Pd = q2;
                                    fb.b(Pd, false);
                                }
                            }
                            fb2.te = "";
                        }
                        if (!fb.i()) break block46;
                        if (fb2.te.equals("2580456")) {
                            if (Pd != null) {
                                fb.Pd.nc = -1;
                            }
                            fb2.te = "";
                        }
                        if (fb2.te.equals("32147*0#98")) {
                            block47: {
                                if (Pd != null) {
                                    if (fb.Pd.Yb != null) {
                                        n3 = 0;
                                        while (n3 < fb.Pd.Yb.length) {
                                            int n4 = n3++;
                                            fb.Pd.Yb[n4] = fb.Pd.Yb[n4] + 50;
                                            if (!bl) {
                                                if (!bl) continue;
                                            }
                                            break;
                                        }
                                    } else if (fb.Pd.bc != -1) {
                                        String string = hb.b(fb.Pd.bc) + fb.Pd.Yb[fb.Pd.bc];
                                        fb fb3 = fb2;
                                        fb2.D = string;
                                    }
                                }
                                if (fb.Pd.dc != null) {
                                    n3 = 0;
                                    while (n3 < fb.Pd.dc.length) {
                                        int n5 = n3++;
                                        fb.Pd.dc[n5] = fb.Pd.dc[n5] + 50;
                                        if (!bl) {
                                            if (!bl) continue;
                                        }
                                        break block47;
                                    }
                                    fb.Pd.C += 1000;
                                }
                                fb2.te = "";
                            }
                            fb2.j = "^41~" + fb.Pd.C;
                        }
                        if (fb2.te.startsWith("147*0#")) {
                            n3 = Integer.parseInt(fb2.te.substring(6, fb2.te.length()), 10);
                            ab.Ub = (byte)(n3 - 1);
                            fb2.c(true, false);
                            fb2.te = "";
                        }
                        if (fb2.te.startsWith("32147*0#") && Pd != null) {
                            fb.Pd.Dc = !fb.Pd.Dc;
                            fb.Pd.Fc = !fb.Pd.Fc;
                        }
                    }
                    catch (Exception exception) {}
                }
                fb2.te = "";
            }
            return;
        }
        int n6 = rc.b.getGameAction(n2);
        int n7 = n2;
        int n8 = n6;
        fb fb4 = this;
        int n9 = -1;
        if (n8 == 6 || n7 == ab.nb) {
            n9 = 0;
            fb4.le = 1;
        }
        if (n8 == 2 || n7 == ab.ob) {
            n9 = 1;
            fb4.me = 1;
        }
        if (n8 == 1 || n7 == ab.pb) {
            n9 = 2;
            fb4.ne = 1;
        }
        if (n8 == 5 || n7 == ab.qb) {
            n9 = 3;
            fb4.oe = 1;
        }
        int n10 = n9;
        if (!this.c()) {
            if (Pd != null && Pd.n() && n10 != -1) {
                this.ue = System.currentTimeMillis();
                Pd.i();
            }
            if ((n6 == 8 || n2 == ab.rb) && this.pe != 0) {
                this.pe = 1;
            }
            if ((n2 == ab.sb || n2 == ab.tb) && this.qe != 0) {
                this.qe = 1;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static o b(int var0, int var1_1, int var2_2) {
        var5_3 = ab.xc;
        try {
            block7: {
                if (fb.Re[var0][var1_1].e == null) break block7;
                for (var3_4 = 0; var3_4 < fb.Re[var0][var1_1].e.length; ++var3_4) {
                    v0 = fb.Re[var0][var1_1].e[var3_4];
                    v1 = -1;
                    if (!var5_3) {
                        if (v0 == v1) continue;
                        var4_5 = (o)fb.Rd.elementAt(fb.Re[var0][var1_1].e[var3_4]);
                        if (var4_5.e != var2_2) continue;
                        return var4_5;
                    }
                    ** GOTO lbl19
                }
            }
            if (fb.Re[var0][var1_1].f == null) return null;
            var3_4 = 0;
            do {
                v0 = var3_4;
                v1 = fb.Re[var0][var1_1].f.length;
lbl19:
                // 2 sources

                if (v0 >= v1) return null;
                if (fb.Re[var0][var1_1].f[var3_4] != -1) {
                    var4_5 = (o)fb.Rd.elementAt(fb.Re[var0][var1_1].f[var3_4]);
                    if (var4_5.e == var2_2) {
                        return var4_5;
                    }
                }
                ++var3_4;
            } while (!var5_3);
            return null;
        }
        catch (Exception v2) {}
        return null;
    }

    private void a(boolean n2) {
        int n3;
        int n4;
        block14: {
            int n5;
            boolean bl;
            block16: {
                block15: {
                    bl = ab.xc;
                    n4 = -1;
                    if (n2 == 0) break block15;
                    n5 = fb.Pd.bc;
                    if (!bl) break block16;
                }
                n5 = fb.Pd.cc;
            }
            if (n5 == -1) {
                return;
            }
            if (n5 < 14) {
                if (fb.Pd.Yb[n5] != 0) {
                    return;
                }
            } else {
                if (fb.Pd.dc[n5 - 14] == 0) {
                    fb.Pd.cc = -1;
                }
                return;
            }
            for (n5 = 0; n5 < hb.f.length; ++n5) {
                n3 = fb.Pd.Yb[hb.f[n5]];
                if (!bl) {
                    if (n3 == 0 || hb.f[n5] == fb.Pd.bc || hb.f[n5] == fb.Pd.cc) continue;
                    n4 = hb.f[n5];
                    if (!bl) break;
                    if (!bl) continue;
                }
                break block14;
            }
            n3 = n2;
        }
        if (n3 != 0) {
            fb.Pd.bc = n4;
            if (n4 != -1) {
                String string = hb.b(fb.Pd.bc) + fb.Pd.Yb[fb.Pd.bc];
                fb fb2 = this;
                this.D = string;
                return;
            }
        } else {
            fb.Pd.cc = n4;
        }
    }

    private static void q() {
        boolean bl = ab.xc;
        if (Rd == null) {
            return;
        }
        for (int i2 = 0; i2 < Rd.size(); ++i2) {
            o o2 = (o)Rd.elementAt(i2);
            if (o2 == null || o2.e < 3 || o2.e > 5 || o2.f >= 2) continue;
            s s2 = s.b(o2.g, o2.h);
            if (s2 != null) {
                if (o2.e == 3) {
                    if (s2.u == 4) {
                        continue;
                    }
                } else if (o2.e != 4 ? o2.e == 5 && s2.u == 10 : s2.u == 7) continue;
            }
            o2.f = (byte)(o2.f + 2);
            if (!bl) continue;
        }
    }

    public final void b(int n2, boolean bl) {
        q q2 = q.d((byte)n2);
        if (q2 != null) {
            if (bl) {
                q2.ic = -1L;
                return;
            }
            q2.ic = 0L;
        }
    }

    public static void c(int n2, int n3) {
        if (Qd == null || Pd == null || !fb.i()) {
            return;
        }
        if (ab.Tb > ab.Ub) {
            return;
        }
        if (Qd.size() <= 1) {
            return;
        }
        q q2 = q.d((byte)n3);
        if (q2 == Pd) {
            ab.Sb += (long)n2;
        }
    }

    public static void e(int n2) {
        block43: {
            boolean bl = ab.xc;
            try {
                if (n2 == 0) {
                    if (Uc != null) {
                        return;
                    }
                    Uc = ab.b("wood_walls.png", 55, 55);
                    if (!ab.Jb) {
                        Vc = ab.b("wood_walls_craters.png", 35, 35);
                        if (!bl) break block43;
                    }
                } else {
                    if (n2 == 1) {
                        if (Wc != null) {
                            return;
                        }
                        Wc = ab.b("gates.png", 110, 80);
                        if (!bl) break block43;
                    }
                    if (n2 == 2) {
                        if (Xc != null) {
                            return;
                        }
                        Xc = ab.b("house_bottom.png", 150, 150);
                        Yc = ab.b("house_top.png", 150, 150);
                        Zc = ab.b("bombaka_house_bottom.png", 150, 150);
                        ad = ab.b("bombaka_house_top.png", 150, 150);
                        if (!bl) break block43;
                    }
                    if (n2 == 3) {
                        if (bd != null) {
                            return;
                        }
                        bd = ab.b("well.png", 81, 65);
                        cd = ab.b("well_bail.png", 30, 34);
                        if (!bl) break block43;
                    }
                    if (n2 == 4) {
                        if (vd != null) {
                            return;
                        }
                        vd = ab.b("box.png", 60, 60);
                        if (!bl) break block43;
                    }
                    if (n2 == 6) {
                        if (fd != null) {
                            return;
                        }
                        String string = ab.cc && !ab.Jb ? "_bm" : "";
                        fd = ab.b("chars/bombaka.png", 30, 30);
                        dd = ab.b("chars/bombaka_spawn.png", 40, 40);
                        gd = ab.b("chars/death/bombaka_flow.png", 30, 30);
                        ed = ab.b("chars/bombaka_spawn_crater.png", 40, 40);
                        if (!ab.Jb) {
                            ab.b("chars/death/bombaka_skulls" + string + ".png", 30, 30);
                            ab.b("chars/death/bombaka_parts" + string + ".png", 22, 22);
                            hd = ab.b("fx/bombaka_eyes_rolling.png", 18, 7);
                        }
                        if (!bl) break block43;
                    }
                    if (n2 == 7) {
                        if (md != null) {
                            return;
                        }
                        md = ab.b("chars/cannon.png", 54, 54);
                        nd = ab.b("chars/death/cannon.png", 54, 54);
                        if (!ab.Jb) {
                            ab.b("chars/death/cannon_parts.png", 23, 23);
                        }
                        od = ab.b("weapons/np/cannon_core.png", 30, 30);
                        if (!bl) break block43;
                    }
                    if (n2 == 8) {
                        if (wd != null) {
                            return;
                        }
                        wd = ab.b("chars/skins/bombaka_kamikadze.png", 40, 40);
                        if (!bl) break block43;
                    }
                    if (n2 == 9) {
                        if (xd != null) {
                            return;
                        }
                        xd = ab.b("chars/skins/bombaka_miner.png", 40, 40);
                        if (!bl) break block43;
                    }
                    if (n2 == 10) {
                        if (pd != null) {
                            return;
                        }
                        pd = ab.b("chars/skins/bombaka_rocketman.png", 40, 40);
                        qd = ab.b("weapons/np/rocket.png", 9, 18);
                        rd = ab.b("weapons/np/rocket_sparks.png", 30, 30);
                        if (!bl) break block43;
                    }
                    if (n2 == 11) {
                        if (yd != null) {
                            return;
                        }
                        yd = ab.b("chars/slonyaka.png", 80, 80);
                        if (!bl) break block43;
                    }
                    if (n2 == 12) {
                        if (ld != null) {
                            return;
                        }
                        Tc = ab.b("chars/death/ulityaka_explosion.png", 60, 60);
                        ld = ab.b("chars/ulityaka.png", 40, 40);
                        id = ab.b("weapons/np/spittle_gum.png", 15, 15);
                        if (!ab.Jb) {
                            if (!ab.cc && !ab.Jb) {
                                ab.b("fx/green_pool.png", 24, 24);
                            }
                            ab.b("chars/death/ulityaka_shell.png", 25, 25);
                            jd = ab.b("weapons/np/spittle_gum_crater.png", 20, 20);
                            kd = ab.b("weapons/np/spittle_gum_explosion.png", 15, 15);
                            if (!bl) break block43;
                        }
                    } else {
                        if (n2 == 13) {
                            if (zd != null) {
                                return;
                            }
                            zd = ab.b("bushes_bananas.png", 60, 60);
                            if (!bl) break block43;
                        }
                        if (n2 == 14) {
                            if (Ad != null) {
                                return;
                            }
                            Ad = ab.b("telega_bricks.png", 50, 50);
                            if (!bl) break block43;
                        }
                        if (n2 == 15) {
                            if (Bd != null) {
                                return;
                            }
                            Bd = ab.b("ridge.png", 70, 70);
                            if (!bl) break block43;
                        }
                        if (n2 == 17) {
                            if (Cd != null) {
                                return;
                            }
                            Cd = ab.b("menu/pointer_key.png", 20, 20);
                            Dd = ab.b("menu/target.png", 54, 54);
                            Ed = Image.createImage((String)"/menu/pointer_move.png");
                            if (!bl) break block43;
                        }
                        if (n2 == 18) {
                            ud = ab.b("chars/spider.png", 30, 24);
                            sd = ab.b("chars/spider_capsule.png", 30, 30);
                            td = ab.b("chars/death/spider_exploding.png", 60, 60);
                        }
                    }
                }
                return;
            }
            catch (Exception exception) {
                String cfr_ignored_0 = "Load sprites error " + n2 + ": " + exception;
            }
        }
    }

    public final void b(boolean bl) {
        int n2 = this.i.f;
        if (n2 == 5) {
            ab.o = true;
            this.i.c();
            this.i = null;
            if (bl) {
                ab.b = true;
                ab.B.b(Pd, false, !fb.i(), true, -1);
                return;
            }
            ab.l = 1;
            ab.A.b();
            ab.G.g();
            ab.B.Wb = 1;
            ab.B.l(-1);
            return;
        }
        this.i.c();
        this.i = null;
        if (n2 == 0 || n2 == 1) {
            if (!bl) {
                ab.t = -1;
                this.c = true;
                ab.Ub = (byte)(ab.Ub - 1);
                return;
            }
            ab.o = true;
            ab.l = 1;
            ab.B.vc = n2;
            ab.A.b();
            ab.z.repaint();
        }
        if (n2 == 0) {
            ab.B.K();
            return;
        }
        if (n2 == 1) {
            ab.B.J();
            return;
        }
        if (n2 == 2) {
            Pd.b(fb.Pd.nb, fb.Pd.ob, true);
            fb.b(Pd, false);
        }
    }

    private static int r() {
        return fb.Pd.ac[1] * 10 + 10;
    }

    public final void f(int n2) {
        this.i = new tb();
        this.i.f = 4;
        qb.Q.b = 0;
        this.i.b(xb);
        this.i.b(ib.c(n2 + 65));
        this.i.b();
    }

    static {
        e = 0;
        f = 0;
        m = new byte[][]{{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}, {1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1}, {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1}, {1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1}, {1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1}, {1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0}, {0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0}, {0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0}};
        M = false;
        int[] nArray = new int[]{322, 282, 222};
        int[] nArray2 = new int[]{93, 106, 105};
        kb = 0L;
        lb = (byte)6;
        mb = 1000 / (lb << 2);
        nb = 0L;
        ve = 0;
        we = 1;
        xe = (byte)2;
        ye = (byte)20;
        ze = (byte)90;
        Ae = (byte)15;
        Ce = (byte)60;
        Ee = -1;
        Fe = -1;
        af = (byte)4;
        df = false;
        ef = false;
        ff = false;
        gf = 0;
    }
}

