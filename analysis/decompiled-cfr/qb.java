/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.bluetooth.LocalDevice
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 *  javax.microedition.rms.RecordStore
 */
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.util.Vector;
import javax.bluetooth.LocalDevice;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;
import wfree.P;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class qb
implements ob,
Runnable {
    private boolean a;
    public static pb b;
    public tb c = null;
    private int d = -1;
    private int e;
    private int f;
    private int g;
    public static int[] h;
    public static int[] i;
    public static int[] j;
    public static int k;
    private int l;
    public static boolean m;
    private static boolean n;
    public static int o;
    private boolean p;
    public int q = 0;
    private static final int[][] r;
    private boolean s = true;
    private int t;
    private int u = 3;
    private int v;
    private int w;
    public int x = -1;
    private int y = 0;
    private int z = -1;
    private int A = -1;
    private int B;
    private int C = 0;
    private int D;
    private int E;
    public int F;
    public boolean G = false;
    public i H = null;
    private rb I = null;
    private boolean J = false;
    public static pb K;
    public static pb L;
    public static pb M;
    private static pb N;
    private static pb O;
    private static pb P;
    public static pb Q;
    public static pb R;
    public static pb S;
    private static pb T;
    private static pb U;
    public static pb V;
    public static pb W;
    public static Image X;
    private static Image Y;
    private static Image Z;
    public static Image ab;
    public static Image bb;
    public static Image cb;
    public static Image db;
    public static Image eb;
    public static pb fb;
    public static pb gb;
    public static Image hb;
    public static Image ib;
    public static Image jb;
    public static Image kb;
    public static Image lb;
    public static Image mb;
    public static pb nb;
    public static int ob;
    public static int pb;
    public boolean qb;
    private boolean rb;
    private boolean sb;
    public static boolean tb;
    private int ub;
    private int vb;
    public int wb;
    public int xb;
    public int yb;
    public int zb;
    public int Ab;
    public int Bb;
    public int Cb;
    public gb[] Db;
    private int Eb;
    private int Fb;
    private int Gb;
    public int Hb;
    private int Ib;
    private int Jb;
    public int Kb = -1;
    private boolean Lb;
    private int Mb;
    private int Nb;
    private Thread Ob;
    public int Pb;
    public int Qb;
    public int Rb;
    private boolean Sb;
    private gb Tb;
    private boolean Ub;
    private gb Vb;
    public int Wb;
    private cb Xb;
    public e Yb;
    private int Zb;
    public String[] ac;
    public q bc;
    private int cc;
    private boolean dc = false;
    private int ec = 0;
    private boolean fc = false;
    private boolean gc = false;
    private int hc;
    private String ic;
    private boolean jc;
    public static int kc;
    public static int lc;
    private boolean mc;
    private int nc;
    private int oc;
    public int pc;
    private boolean qc;
    private boolean rc;
    private boolean sc;
    private boolean tc;
    public boolean uc;
    public int vc;
    private int wc;
    private Vector xc;
    public int yc;
    private String[] zc;
    private static String[] Ac;
    private static String[] Bc;
    private int Cc = 0;

    public final void a() {
        block44: {
            block43: {
                int n2;
                int n3;
                boolean bl;
                block38: {
                    Object object;
                    block42: {
                        block41: {
                            String string;
                            String string2;
                            block37: {
                                int n4;
                                String string3;
                                block36: {
                                    int n5;
                                    long l2;
                                    Object object2;
                                    block40: {
                                        block39: {
                                            bl = ab.xc;
                                            this.ub = ab.D / 6;
                                            this.vb = ab.E / 6;
                                            object = this;
                                            object2 = null;
                                            try {
                                                object2 = new DataInputStream(object.getClass().getResourceAsStream("/info.txt"));
                                                object = new byte[((FilterInputStream)object2).available()];
                                                ((DataInputStream)object2).read((byte[])object);
                                                object = rb.b(new String((byte[])object, "UTF-8"), ";".charAt(0));
                                                ab.h = object[0];
                                                ab.i = object[3];
                                                ab.k = Long.parseLong(object[4]);
                                                ab.j = object[5];
                                                ab.c = ab.j.indexOf("NOR") != -1;
                                            }
                                            catch (Exception exception) {
                                                String cfr_ignored_0 = "load info err " + exception;
                                            }
                                            if (ab.zb <= ab.k) break block39;
                                            l2 = ab.zb;
                                            if (!bl) break block40;
                                        }
                                        l2 = ab.k;
                                    }
                                    if (System.currentTimeMillis() - l2 > 2592000000L) {
                                        ab.yb = true;
                                    }
                                    try {
                                        ((FilterInputStream)object2).close();
                                    }
                                    catch (Exception exception) {}
                                    ib.b();
                                    qb.p();
                                    qb.q();
                                    ab.h();
                                    ab.e = false;
                                    this.ic = "Pipyaki " + ab.C.c + "PRO\n" + ab.C.d + "version " + ab.f + "\n" + ab.h + "\n\n" + ab.C.c + "Directed by:" + ab.C.b + "\nPluschevsky Dmitry\nSlobodenyuk Sasha\n\n" + ab.C.c + "Produced by:" + ab.C.b + "\nPershakov Sergey\n\n" + ab.C.c + "Programmed by:" + ab.C.b + "\nRusyakin Vasily\nPershakov Sergey\nKarpushina Maria\n\n" + ab.C.c + "Art by:" + ab.C.b + "\nLyukshin Alexey\nOrlov Maxim\n\n" + ab.C.c + "Music by:" + ab.C.b + "\nDJ Paul Mira\nwww.paulmira.com\n\n" + ab.C.c + "Marketing by:" + ab.C.b + "\nKovalev Leonid\n\n" + ab.C.c + "Level design by:" + ab.C.b + "\nRusyakin Vasily\nKarpushina Maria\n\nhello@pipyakas.com\npipyaki.ru\nm.pipyaki.ru\n\n(c) 2010\nDaSuppaStudios Ltd.";
                                    object = this;
                                    b = ab.b("sscrbuttons.png", 20, 20);
                                    try {
                                        W = ab.b("menu/menu_cursor.png", 14, 26);
                                        fb = ab.b("menu/skills_shevron.png", 11, 10);
                                        Y = Image.createImage((String)"/menu/transparent.png");
                                        S = ab.b("char_arrows.png", 20, 20);
                                        T = ab.b("menu/small_arrows.png", 5, 5);
                                        Z = Image.createImage((String)"/menu/line.png");
                                        X = Image.createImage((String)"/menu/fragswin.png");
                                        try {
                                            V = new pb(Image.createImage((String)"/menu/weapons.png"), 44, 44);
                                        }
                                        catch (Exception exception) {}
                                        N = ab.b("menu/status.png", 22, 22);
                                        O = ab.b("menu/status_bt1.png", 34, 34);
                                        P = ab.b("menu/status_bt2.png", 6, 6);
                                        Q = ab.b("menu/big_icons.png", 38, 38);
                                        bb = Image.createImage((String)"/menu/big_icons_circle.png");
                                        cb = Image.createImage((String)"/menu/icon_tw.png");
                                        R = ab.b("menu/phone.png", 22, 30);
                                        try {
                                            K = new pb(Image.createImage((String)"/menu/icons.png"), 34, 34);
                                        }
                                        catch (Exception exception) {}
                                        db = Image.createImage((String)"/menu/menu_icons.png");
                                        ab = Image.createImage((String)"/menu/inf.png");
                                        eb = Image.createImage((String)"/menu/menu_arrows.png");
                                        ob = X.getWidth() / 3;
                                        pb = X.getHeight() / 3;
                                        ((qb)object).wb = db.getWidth() / 2;
                                        ((qb)object).xb = db.getHeight();
                                        ((qb)object).yb = (((qb)object).wb - 34) / 2;
                                        ((qb)object).zb = (((qb)object).xb - 34) / 2;
                                        if (V != null) {
                                            ((qb)object).Ab = (((qb)object).wb - qb.V.d) / 2;
                                            ((qb)object).Bb = (((qb)object).xb - qb.V.e) / 2;
                                        }
                                        ((qb)object).Pb = eb.getWidth() / 4;
                                        ((qb)object).Qb = eb.getHeight();
                                        U = ab.b("menu/pages.png", 6, 6);
                                        L = ab.b("menu/signs.png", 12, 12);
                                        gb = ab.b("menu/icons_bot.png", 18, 18);
                                        nb = ab.b("menu/weapons_ps.png", 10, 10);
                                        hb = Image.createImage((String)"/menu/icons_ff.png");
                                        Image.createImage((String)"/menu/icons_play.png");
                                        ib = Image.createImage((String)"/menu/icons_tb.png");
                                        jb = Image.createImage((String)"/menu/icons_tip-off.png");
                                        kb = Image.createImage((String)"/menu/icons_vibro.png");
                                        lb = Image.createImage((String)"/menu/icons_vol-dot.png");
                                        mb = Image.createImage((String)"/menu/icons_vol-off.png");
                                    }
                                    catch (Exception exception) {}
                                    bb.b(this);
                                    this.Zb = -1;
                                    this.l();
                                    this.Wb = 1;
                                    object = new n("settings", true);
                                    try {
                                        ab.Ab = ((n)object).f("rk");
                                    }
                                    catch (Exception exception) {
                                        ab.Ab = "";
                                    }
                                    if (ab.Ab == null) {
                                        ab.Ab = "";
                                    }
                                    object2 = ab.Bb;
                                    string2 = "";
                                    string3 = "";
                                    for (n4 = 0; n4 < ((String)object2).length(); ++n4) {
                                        n5 = n4 % 2;
                                        if (!bl) {
                                            if (n5 != 0) continue;
                                            string2 = string2 + (9 - Integer.parseInt(((String)object2).substring(n4, n4 + 1)));
                                            if (!bl) continue;
                                        }
                                        break block36;
                                    }
                                    n5 = n4 = 0;
                                }
                                while (n4 < string2.length()) {
                                    string = string3 + (9 - Integer.parseInt(string2.substring(string2.length() - 1 - n4, string2.length() - n4)));
                                    if (!bl) {
                                        string3 = string;
                                        ++n4;
                                        if (!bl) continue;
                                    }
                                    break block37;
                                }
                                string = qb.d(string3);
                            }
                            String string4 = string;
                            string2 = "";
                            for (int i2 = 0; i2 < ab.Ab.length(); ++i2) {
                                n3 = ab.Ab.charAt(i2);
                                n2 = 32;
                                if (!bl) {
                                    if (n3 == n2) continue;
                                    string2 = string2 + ab.Ab.charAt(i2);
                                    if (!bl) continue;
                                }
                                break block38;
                            }
                            if (!string4.equals(string2)) break block41;
                            this.s = false;
                            if (!bl) break block42;
                        }
                        this.s = true;
                    }
                    try {
                        ((n)object).c();
                    }
                    catch (Exception exception) {}
                    this.Db = new gb[50];
                    n3 = ib.e = -1;
                    n2 = -1;
                }
                if (n3 != n2) break block43;
                this.Lb = true;
                this.d();
                if (!bl) break block44;
            }
            if (ib.e != -2) {
                int n6;
                ab.xb = n6 = ib.e;
                this.Lb = true;
                this.d();
            }
        }
        ab.o = false;
    }

    private void c() {
        this.Mb = (this.Eb - this.Gb) * 5;
        this.Nb = (this.Fb - this.Hb) * 5;
    }

    public final void d() {
        block9: {
            boolean bl = ab.xc;
            try {
                Class.forName("javax.bluetooth.LocalDevice");
                LocalDevice.getLocalDevice().getFriendlyName();
            }
            catch (Throwable throwable) {
                tb = true;
            }
            this.Rb = 0;
            this.Sb = false;
            this.Ub = false;
            this.qb = false;
            this.yc = -1;
            this.Db[0] = new gb(0, this, -1, -1);
            int n2 = 3;
            this.Db[1] = new gb(1, this, 1, 0);
            this.Db[2] = new gb(2, this, 3, 0);
            if (ab.Tb > 0) {
                this.Db[3] = new gb(3, this, 17, 1);
                ++n2;
            }
            this.C = -1;
            if (this.s && !ab.c) {
                this.Db[n2] = new gb(n2, this, 14, 0);
                this.C = n2++;
            }
            int n3 = n2;
            this.Db[n2] = new gb(n2, this, 9, 0);
            int n4 = ++n2;
            this.Db[n2] = new gb(n2, this, 38, 0);
            this.Db[++n2] = new gb(n2, this, 10, n3);
            this.Db[++n2] = new gb(n2, this, 11, n3);
            int n5 = ++n2;
            this.Db[n2] = new gb(n2, this, 26, 2);
            this.f = ++n2;
            this.Db[n2] = new gb(n2, this, 5, 2);
            this.l = ++n2;
            this.Db[n2] = new gb(n2, this, 64, 2);
            this.Db[++n2] = new gb(n2, this, 33, 2);
            this.F = ++n2;
            this.Db[n2] = new gb(n2, this, 15, n4);
            this.Db[++n2] = new gb(n2, this, 35, n4);
            ++n2;
            if (ab.j.indexOf("NOUPD") == -1) {
                this.Db[n2] = new gb(n2, this, 13, n4);
                ++n2;
            }
            this.Db[n2] = new gb(n2, this, 29, n5);
            this.Db[++n2] = new gb(n2, this, 28, n5);
            int n6 = ++n2;
            this.Db[n2] = new gb(n2, this, 56, n5);
            this.Db[++n2] = new gb(n2, this, 16, 0);
            this.Db[++n2] = new gb(n2, this, 37, n3);
            this.Db[++n2] = new gb(n2, this, 25, n3);
            ++n2;
            if (ab.j.indexOf("NOF") == -1 && !ab.i.equals("")) {
                this.Db[n2] = new gb(n2, this, 55, n4);
                ++n2;
            }
            this.e = n2;
            this.Db[n2] = new gb(n2, this, 4, n5);
            this.Db[n2 + 1] = new gb(n2 + 1, this, 58, 2);
            this.Db[n2 + 2] = new gb(n2 + 2, this, 27, n6);
            this.Db[n2 + 3] = new gb(n2 + 3, this, 57, n6);
            this.Db[n2 + 4] = new gb(n2 + 4, this, 59, n6);
            this.Db[n2 + 5] = new gb(n2 + 5, this, 30, n6);
            this.Cb = (n2 += 6) - 1;
            String cfr_ignored_0 = "ITMS = " + this.Cb;
            this.Kb = -1;
            this.Ib = 0;
            this.Jb = 0;
            for (n2 = 0; n2 <= this.Cb; ++n2) {
                this.a(n2, true);
                if (!bl) {
                    if (!bl) continue;
                    boolean bl2 = o.q = !o.q;
                    break;
                }
                break block9;
            }
            if (this.Wb > 0) {
                this.c(this.Wb);
            }
            this.c();
        }
    }

    private void a(int n2, boolean bl) {
        if (this.Db == null) {
            return;
        }
        if (n2 < 0) {
            return;
        }
        if (this.Db[n2] == null) {
            return;
        }
        if (this.Db[n2].q >= 0 && bl) {
            this.Db[n2].s = this.Db[this.Db[n2].q].s + 1;
        }
        if (this.Db[n2].s == 0 || this.Db[n2].q < 0) {
            this.Db[n2].h = 0;
            this.Db[n2].i = 0;
            return;
        }
        if (this.Db[n2].s % 2 == 1) {
            this.Db[n2].h = this.Db[this.Db[n2].q].h;
            if (this.Db[this.Db[n2].q].t == 0) {
                this.Db[this.Db[n2].q].t = this.Db[this.Db[n2].q].d() / 2 + 8;
            }
            this.Db[n2].i = this.Db[this.Db[n2].q].i + this.Db[this.Db[n2].q].t + this.Db[n2].d() / 2;
            ++this.Db[this.Db[n2].q].r;
            this.Db[this.Db[n2].q].t += this.Db[n2].d() + -4;
            return;
        }
        this.Db[n2].i = this.Db[this.Db[n2].q].i;
        if (this.Db[this.Db[n2].q].t == 0) {
            this.Db[this.Db[n2].q].t = this.Db[this.Db[n2].q].b() / 2 + 8;
        }
        this.Db[n2].h = this.Db[this.Db[n2].q].h + this.Db[this.Db[n2].q].t + this.Db[n2].b() / 2;
        ++this.Db[this.Db[n2].q].r;
        this.Db[this.Db[n2].q].t += this.Db[n2].b() + -4;
    }

    public final void b(Graphics graphics) {
        block102: {
            String string;
            int n2;
            block103: {
                String string2;
                block104: {
                    block105: {
                        int n3;
                        boolean bl;
                        block108: {
                            block106: {
                                block107: {
                                    int n4;
                                    block95: {
                                        block97: {
                                            block101: {
                                                block100: {
                                                    block99: {
                                                        block98: {
                                                            block96: {
                                                                block93: {
                                                                    block94: {
                                                                        block78: {
                                                                            block91: {
                                                                                block92: {
                                                                                    block90: {
                                                                                        block89: {
                                                                                            block88: {
                                                                                                block87: {
                                                                                                    block86: {
                                                                                                        block85: {
                                                                                                            block84: {
                                                                                                                block83: {
                                                                                                                    block82: {
                                                                                                                        block79: {
                                                                                                                            block80: {
                                                                                                                                block81: {
                                                                                                                                    block77: {
                                                                                                                                        boolean bl2;
                                                                                                                                        block70: {
                                                                                                                                            int n5;
                                                                                                                                            int n6;
                                                                                                                                            int n7;
                                                                                                                                            int n8;
                                                                                                                                            int n9;
                                                                                                                                            block69: {
                                                                                                                                                int n10;
                                                                                                                                                block67: {
                                                                                                                                                    bl = ab.xc;
                                                                                                                                                    if (ab.o) {
                                                                                                                                                        ab.nc = true;
                                                                                                                                                        rc.b(graphics);
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    if (this.c != null) {
                                                                                                                                                        this.c.b(graphics);
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    if (this.Rb != 34) break block70;
                                                                                                                                                    ab.A.b(graphics);
                                                                                                                                                    n9 = this.Fb;
                                                                                                                                                    for (int i2 = 1; i2 <= this.Jb; ++i2) {
                                                                                                                                                        int n11;
                                                                                                                                                        int n12;
                                                                                                                                                        block68: {
                                                                                                                                                            n8 = this.Eb;
                                                                                                                                                            n10 = 1;
                                                                                                                                                            if (bl) break block67;
                                                                                                                                                            for (n7 = v182925; n7 <= this.Ib; ++n7) {
                                                                                                                                                                int n13;
                                                                                                                                                                int n14;
                                                                                                                                                                block75: {
                                                                                                                                                                    block76: {
                                                                                                                                                                        block74: {
                                                                                                                                                                            block72: {
                                                                                                                                                                                block73: {
                                                                                                                                                                                    block71: {
                                                                                                                                                                                        n12 = n7;
                                                                                                                                                                                        n11 = 1;
                                                                                                                                                                                        if (bl) break block68;
                                                                                                                                                                                        if (n12 != n11) break block71;
                                                                                                                                                                                        n14 = 0;
                                                                                                                                                                                        if (!bl) break block72;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (n7 != this.Ib) break block73;
                                                                                                                                                                                    n14 = ob << 1;
                                                                                                                                                                                    if (!bl) break block72;
                                                                                                                                                                                }
                                                                                                                                                                                n14 = ob;
                                                                                                                                                                            }
                                                                                                                                                                            if (i2 != 1) break block74;
                                                                                                                                                                            n13 = 0;
                                                                                                                                                                            if (!bl) break block75;
                                                                                                                                                                        }
                                                                                                                                                                        if (i2 != this.Jb) break block76;
                                                                                                                                                                        n13 = pb << 1;
                                                                                                                                                                        if (!bl) break block75;
                                                                                                                                                                    }
                                                                                                                                                                    n13 = pb;
                                                                                                                                                                }
                                                                                                                                                                graphics.drawRegion(X, n14, n13, ob, pb, 0, n8, n9, 0);
                                                                                                                                                                if (n7 == this.Ib && i2 == this.Jb) {
                                                                                                                                                                    fb.Kd = this.Eb;
                                                                                                                                                                    fb.Ld = this.Fb;
                                                                                                                                                                    fb.Md = n8 - ob;
                                                                                                                                                                    fb.Nd = n9 - n13 - pb;
                                                                                                                                                                }
                                                                                                                                                                n8 += ob;
                                                                                                                                                                if (!bl) continue;
                                                                                                                                                            }
                                                                                                                                                            n12 = n9;
                                                                                                                                                            n11 = pb;
                                                                                                                                                        }
                                                                                                                                                        n9 = n12 + n11;
                                                                                                                                                        if (!bl) continue;
                                                                                                                                                    }
                                                                                                                                                    n10 = this.Kb;
                                                                                                                                                }
                                                                                                                                                if (n10 != -1) {
                                                                                                                                                    qb.V.b = 0;
                                                                                                                                                    V.b(this.v + this.Eb - this.Gb, this.w + this.Fb - this.Hb);
                                                                                                                                                    V.b(graphics);
                                                                                                                                                }
                                                                                                                                                for (n7 = 1; n7 <= this.Cb; ++n7) {
                                                                                                                                                    n6 = n7;
                                                                                                                                                    n5 = this.t * 9 + 1;
                                                                                                                                                    if (!bl) {
                                                                                                                                                        if (n6 < n5 || n7 > this.t * 9 + 9 || !this.Db[n7].j()) continue;
                                                                                                                                                        this.Db[n7].b(graphics, this.Eb - this.Gb, this.Fb - this.Hb);
                                                                                                                                                        if (!bl) continue;
                                                                                                                                                    }
                                                                                                                                                    break block69;
                                                                                                                                                }
                                                                                                                                                n6 = this.Eb;
                                                                                                                                                n5 = (this.Ib * ob - qb.U.d * this.u - this.u + 1) / 2;
                                                                                                                                            }
                                                                                                                                            n8 = n6 + n5;
                                                                                                                                            n9 = this.Fb + this.Jb * pb - qb.U.e - 10;
                                                                                                                                            if (n9 + qb.U.e + 1 > ab.E) {
                                                                                                                                                n9 = ab.E - qb.U.e - 1;
                                                                                                                                            }
                                                                                                                                            for (n7 = 0; n7 < this.u; ++n7) {
                                                                                                                                                qb.U.b = n7 == this.t ? 0 : 1;
                                                                                                                                                U.b(n8, n9);
                                                                                                                                                U.b(graphics);
                                                                                                                                                n8 += qb.U.d + 1;
                                                                                                                                                if (!bl) continue;
                                                                                                                                            }
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        graphics.setColor(0);
                                                                                                                                        graphics.fillRect(0, 0, ab.D, ab.E);
                                                                                                                                        if (this.Rb == 33 || this.Rb == 53 || this.Rb == 55 && this.H == null) {
                                                                                                                                            bb.b.b(graphics, this.Eb, this.Fb);
                                                                                                                                            bb.b(graphics);
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        if (this.Rb == 15) {
                                                                                                                                            this.hc = ab.C.b(graphics, this.ic, ab.D / 2, this.cc, ab.D - 4, 2);
                                                                                                                                            if (this.hc < 0) {
                                                                                                                                                this.cc = ab.E - 1;
                                                                                                                                            }
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        if (this.Kb != -1) {
                                                                                                                                            if (ab.nc) {
                                                                                                                                                ab.nc = false;
                                                                                                                                            }
                                                                                                                                            for (n3 = 1; n3 <= this.Cb; ++n3) {
                                                                                                                                                bl2 = this.Db[n3].j();
                                                                                                                                                if (!bl) {
                                                                                                                                                    if (!bl2) continue;
                                                                                                                                                    this.Db[n3].b(graphics, this.Eb, this.Fb);
                                                                                                                                                    if (!bl) continue;
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            bl2 = this.Sb;
                                                                                                                                        }
                                                                                                                                        if (bl2) {
                                                                                                                                            this.Tb.b(graphics, 0, 0);
                                                                                                                                        }
                                                                                                                                        if (this.Ub) {
                                                                                                                                            this.Vb.b(graphics, 0, 0);
                                                                                                                                        }
                                                                                                                                        n3 = -1;
                                                                                                                                        if (this.Rb != 5 && this.Rb != 8 || this.Xb == null) break block77;
                                                                                                                                        if (this.Xb.c) break block78;
                                                                                                                                        switch (this.Xb.b) {
                                                                                                                                            case 1: {
                                                                                                                                                n3 = 0;
                                                                                                                                                if (!bl) break block78;
                                                                                                                                            }
                                                                                                                                            case 3: 
                                                                                                                                            case 4: {
                                                                                                                                                n3 = 1;
                                                                                                                                                if (!bl) break block78;
                                                                                                                                            }
                                                                                                                                            case 5: {
                                                                                                                                                n3 = 2;
                                                                                                                                            }
                                                                                                                                            default: {
                                                                                                                                                if (!bl) break block78;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (this.Rb != 4 || this.Yb == null) break block79;
                                                                                                                                    e e2 = this.Yb;
                                                                                                                                    if (e2.c) break block78;
                                                                                                                                    int n15 = -1;
                                                                                                                                    ++this.A;
                                                                                                                                    if (this.A > 4) {
                                                                                                                                        this.A = 0;
                                                                                                                                    }
                                                                                                                                    n2 = this.A;
                                                                                                                                    switch (this.Yb.b) {
                                                                                                                                        case 0: 
                                                                                                                                        case 1: {
                                                                                                                                            n15 = this.Yb.b();
                                                                                                                                            if (n15 <= 7) break;
                                                                                                                                            n15 = 7;
                                                                                                                                            if (!bl) break;
                                                                                                                                        }
                                                                                                                                        case 3: 
                                                                                                                                        case 4: {
                                                                                                                                            n15 = this.Yb.b();
                                                                                                                                            if (n15 <= 7) break;
                                                                                                                                            n15 = 7;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (n15 != -1) {
                                                                                                                                        n4 = ab.D - qb.O.d - 12;
                                                                                                                                        qb.O.b = n15;
                                                                                                                                        O.b(n4, 12);
                                                                                                                                        O.b(graphics);
                                                                                                                                        if (n15 != 7) {
                                                                                                                                            qb.P.b = n2;
                                                                                                                                            P.b(n4 + r[n15][0], 12 + r[n15][1]);
                                                                                                                                            P.b(graphics);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (!ab.Db || this.Yb.b != 1) break block80;
                                                                                                                                    if (!ib.c) break block81;
                                                                                                                                    graphics.setColor(255, 255, 255);
                                                                                                                                    b.c(graphics, ib.c(15) + "\n" + ib.c(16) + " " + this.Yb.b(), 6, 22 + qb.M.e, ab.D - 12, 0);
                                                                                                                                    if (!bl) break block78;
                                                                                                                                }
                                                                                                                                ab.C.b(graphics, ib.c(15) + "\n" + ib.c(16) + " " + this.Yb.b(), 6, 22 + qb.M.e, ab.D - 12, 0);
                                                                                                                            }
                                                                                                                            if (!bl) break block78;
                                                                                                                        }
                                                                                                                        if (this.Rb != 13 || this.Zb != -1) break block82;
                                                                                                                        n3 = 4;
                                                                                                                        if (!bl) break block78;
                                                                                                                    }
                                                                                                                    if (this.Rb != 14 || this.Zb != -1 || this.I == null) break block83;
                                                                                                                    n3 = 4;
                                                                                                                    if (!bl) break block78;
                                                                                                                }
                                                                                                                if (this.Rb != 52 && (this.Rb != 55 || this.H == null) || this.Zb != -1) break block84;
                                                                                                                n3 = 6;
                                                                                                                if (!bl) break block78;
                                                                                                            }
                                                                                                            if (this.Rb != 70) break block85;
                                                                                                            qb.b(graphics, 1, "Old version! Please update (menu or wap.pipyaki.ru)", true);
                                                                                                            if (!bl) break block78;
                                                                                                        }
                                                                                                        if (this.Rb != 71) break block86;
                                                                                                        qb.b(graphics, 1, "Server is old! Please update it (menu or wap.pipyaki.ru)", true);
                                                                                                        if (!bl) break block78;
                                                                                                    }
                                                                                                    if (this.Rb != 32) break block87;
                                                                                                    qb.b(graphics, 0, ib.c(24), ab.Db);
                                                                                                    if (!bl) break block78;
                                                                                                }
                                                                                                if (this.Rb != 25) break block88;
                                                                                                qb.b(graphics, 0, ib.c(37), true);
                                                                                                if (!bl) break block78;
                                                                                            }
                                                                                            if (this.Rb != 63) break block89;
                                                                                            qb.b(graphics, 4, ib.c(20), ab.Db);
                                                                                            if (!bl) break block78;
                                                                                        }
                                                                                        if (this.Rb != 46) break block90;
                                                                                        qb.b(graphics, 3, ib.c(22), ab.Db);
                                                                                        if (!bl) break block78;
                                                                                    }
                                                                                    if (this.Rb != 45) break block91;
                                                                                    if (this.vc != 2) break block92;
                                                                                    qb.b(graphics, 1, ib.c(23), ab.Db);
                                                                                    if (!bl) break block78;
                                                                                }
                                                                                qb.b(graphics, 3, ib.c(21), ab.Db);
                                                                                if (!bl) break block78;
                                                                            }
                                                                            if (this.Rb == 42 && this.yc == 7) {
                                                                                n3 = 10;
                                                                            }
                                                                        }
                                                                        if (n3 == -1) break block93;
                                                                        ++this.A;
                                                                        if (this.A > 11) {
                                                                            this.A = 0;
                                                                        }
                                                                        qb.M.b = this.A;
                                                                        M.b(ab.D - qb.M.d - 12, 12);
                                                                        M.b(graphics);
                                                                        if (n3 != 10) {
                                                                            qb.N.b = n3;
                                                                            N.b(ab.D - qb.M.d - 12 + (qb.M.d - qb.N.d) / 2, 12 + (qb.M.e - qb.N.e) / 2);
                                                                            N.b(graphics);
                                                                        }
                                                                        if (!ab.Db || this.Rb != 5 || this.Xb == null || this.Xb.c || this.Xb.b != 1 || this.Xb.e() != 0) break block93;
                                                                        if (!ib.c) break block94;
                                                                        graphics.setColor(255, 255, 255);
                                                                        b.c(graphics, ib.c(17), ab.D / 2, 22 + qb.M.e, ab.D - 12, 2);
                                                                        if (!bl) break block93;
                                                                    }
                                                                    ab.C.b(graphics, ib.c(17), ab.D / 2, 22 + qb.M.e, ab.D - 12, 2);
                                                                }
                                                                if (this.Zb == -1) break block95;
                                                                if (this.Zb != 0 && this.Zb != 1 && this.Zb != 2 && this.Zb != 3 && this.Zb != 4 && this.Zb != 5) break block96;
                                                                n3 = 3;
                                                                if (!bl) break block97;
                                                            }
                                                            if (this.Zb != 6 && this.Zb != 7) break block98;
                                                            n3 = 5;
                                                            if (!bl) break block97;
                                                        }
                                                        if (this.Zb != 9) break block99;
                                                        n3 = 9;
                                                        if (!bl) break block97;
                                                    }
                                                    if (this.Zb != 12) break block100;
                                                    n3 = 7;
                                                    if (!bl) break block97;
                                                }
                                                if (this.Zb != 10) break block101;
                                                n3 = 8;
                                                if (!bl) break block97;
                                            }
                                            n3 = 10;
                                        }
                                        ++this.A;
                                        if (this.A > 11) {
                                            this.A = 0;
                                        }
                                        qb.N.b = n3;
                                        N.b(ab.D - qb.M.d - 12 + (qb.M.d - qb.N.d) / 2, 12 + (qb.M.e - qb.N.e) / 2);
                                        N.b(graphics);
                                    }
                                    if (this.C()) {
                                        qb.T.b = 0;
                                        T.b(ab.D - 6, 1);
                                        T.b(graphics);
                                        qb.T.b = 1;
                                        T.b(ab.D - 6, ab.E - 6);
                                        T.b(graphics);
                                    }
                                    if (this.Kb <= 0) break block102;
                                    if (this.Rb != 42 || this.yc != 0) break block103;
                                    string2 = "^40~" + this.H();
                                    n2 = Z.getWidth() / 3;
                                    n4 = ib.c ? b.c(string2, n2) : ab.C.b(string2, n2);
                                    qb.b(graphics, n2, ab.C.c() + 8);
                                    b.c(graphics, string2, 4, ab.E - n4 - 2, 0);
                                    if (this.D > 0) {
                                        string2 = "^41~" + ab.C.d + "+" + this.D;
                                        ab.C.b(graphics, string2, 4, ab.E - ab.C.c() - 2 - this.E, -1, 0);
                                    }
                                    string2 = "";
                                    if (!this.Db[this.Kb].h()) break block104;
                                    if (this.Db[this.Kb].o != 42) break block105;
                                    if (this.Kb >= 14 + kc) break block106;
                                    n3 = this.Kb - kc;
                                    if (ab.D <= 132) break block107;
                                    string2 = hb.b[n3] + hb.b(n3) + " = " + hb.d[n3] + "^41~";
                                    if (!bl) break block104;
                                }
                                string2 = hb.d[n3] + "^41~";
                                if (!bl) break block104;
                            }
                            n3 = this.Kb - kc - 14;
                            if (ab.D <= 132) break block108;
                            string2 = hb.c[n3] + hb.c(n3) + " = " + hb.e[n3] + "^41~";
                            if (!bl) break block104;
                        }
                        string2 = hb.e[n3] + "^41~";
                        if (!bl) break block104;
                    }
                    if (this.Db[this.Kb].o == 36) {
                        int n16 = this.Kb - lc;
                        string2 = mb.b(n16) + "^41~";
                    }
                }
                if (this.Db[this.Kb].o == 39) {
                    string2 = "+^41~";
                }
                if (!string2.equals("")) {
                    ab.C.b(graphics, string2, ab.D - 4, ab.E - ab.C.c() - 2, -1, 1);
                }
                return;
            }
            if (ab.Db && !(string = this.Db[this.Kb].s()).equals("") && !string.equals("_")) {
                if (ib.c) {
                    n2 = ab.F.getHeight();
                    qb.b(graphics, 0, n2 + 8);
                    graphics.setColor(255, 255, 255);
                    graphics.drawString(string, ab.D / 2, ab.E - n2 - 2, 17);
                    return;
                }
                n2 = ab.C.c();
                qb.b(graphics, 0, n2 + 8);
                ab.C.b(graphics, string, ab.D / 2, ab.E - n2 - 2, -1, 2);
            }
        }
    }

    public final void e() {
        block79: {
            int n2;
            block119: {
                boolean bl;
                block118: {
                    int n3;
                    block117: {
                        block116: {
                            block110: {
                                block115: {
                                    block114: {
                                        block111: {
                                            block113: {
                                                block112: {
                                                    block108: {
                                                        block109: {
                                                            block105: {
                                                                String string;
                                                                block107: {
                                                                    block106: {
                                                                        block99: {
                                                                            block104: {
                                                                                block101: {
                                                                                    block103: {
                                                                                        block102: {
                                                                                            block100: {
                                                                                                boolean bl2;
                                                                                                int n4;
                                                                                                block96: {
                                                                                                    block97: {
                                                                                                        block98: {
                                                                                                            block93: {
                                                                                                                block94: {
                                                                                                                    block95: {
                                                                                                                        block81: {
                                                                                                                            block92: {
                                                                                                                                block82: {
                                                                                                                                    int n5;
                                                                                                                                    block91: {
                                                                                                                                        block84: {
                                                                                                                                            block90: {
                                                                                                                                                block89: {
                                                                                                                                                    block86: {
                                                                                                                                                        block88: {
                                                                                                                                                            block87: {
                                                                                                                                                                block85: {
                                                                                                                                                                    block83: {
                                                                                                                                                                        block80: {
                                                                                                                                                                            bl = ab.xc;
                                                                                                                                                                            if (ab.o) {
                                                                                                                                                                                return;
                                                                                                                                                                            }
                                                                                                                                                                            if (!ab.o && this.c != null) {
                                                                                                                                                                                this.c.d();
                                                                                                                                                                                return;
                                                                                                                                                                            }
                                                                                                                                                                            if (this.Rb != 33 && this.Rb != 53 && (this.Rb != 55 || this.H != null)) break block80;
                                                                                                                                                                            bb.b.i();
                                                                                                                                                                            bb.b();
                                                                                                                                                                            if (!bl) break block81;
                                                                                                                                                                        }
                                                                                                                                                                        if (this.Rb != 15) break block81;
                                                                                                                                                                        if (!this.dc) break block82;
                                                                                                                                                                        if (this.hc >= ab.E) break block83;
                                                                                                                                                                        n5 = (ab.E - this.hc) / 2;
                                                                                                                                                                        if (!bl) break block84;
                                                                                                                                                                    }
                                                                                                                                                                    if (!this.gc || this.ec >= 0) break block85;
                                                                                                                                                                    if (this.ec <= -20) break block86;
                                                                                                                                                                    this.ec = this.ec * 3 / 2 - 1;
                                                                                                                                                                    if (!bl) break block86;
                                                                                                                                                                }
                                                                                                                                                                if (!this.fc || this.ec <= 0) break block87;
                                                                                                                                                                if (this.ec >= 20) break block86;
                                                                                                                                                                this.ec = this.ec * 3 / 2 + 1;
                                                                                                                                                                if (!bl) break block86;
                                                                                                                                                            }
                                                                                                                                                            this.ec = (this.ec << 1) / 3;
                                                                                                                                                            if (this.ec != 0) break block86;
                                                                                                                                                            if (!this.gc) break block88;
                                                                                                                                                            this.ec = -1;
                                                                                                                                                            if (!bl) break block86;
                                                                                                                                                        }
                                                                                                                                                        if (this.fc) {
                                                                                                                                                            this.ec = 1;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    this.cc += this.ec;
                                                                                                                                                    if (this.cc + this.hc >= ab.E - ab.C.c()) break block89;
                                                                                                                                                    n5 = ab.E - ab.C.c() - this.hc;
                                                                                                                                                    if (!bl) break block84;
                                                                                                                                                }
                                                                                                                                                if (this.cc <= ab.C.c()) break block90;
                                                                                                                                                n5 = ab.C.c();
                                                                                                                                                if (!bl) break block84;
                                                                                                                                            }
                                                                                                                                            n5 = this.cc;
                                                                                                                                            this.jc = true;
                                                                                                                                        }
                                                                                                                                        if (!this.jc) break block91;
                                                                                                                                        this.cc = n5;
                                                                                                                                        if (!bl) break block92;
                                                                                                                                    }
                                                                                                                                    this.cc = (n5 + this.cc) / 2;
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                --this.cc;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        n3 = this.Eb;
                                                                                                                        n2 = this.Fb;
                                                                                                                        if (this.Eb == this.Gb) break block93;
                                                                                                                        n4 = (this.Gb - this.Eb) / 4;
                                                                                                                        if (n4 != 0) break block94;
                                                                                                                        if (this.Eb <= this.Gb) break block95;
                                                                                                                        n4 = -1;
                                                                                                                        if (!bl) break block94;
                                                                                                                    }
                                                                                                                    n4 = 1;
                                                                                                                }
                                                                                                                this.Eb += n4;
                                                                                                            }
                                                                                                            if (this.Fb == this.Hb) break block96;
                                                                                                            n4 = (this.Hb - this.Fb) / 4;
                                                                                                            if (n4 != 0) break block97;
                                                                                                            if (this.Fb <= this.Hb) break block98;
                                                                                                            n4 = -1;
                                                                                                            if (!bl) break block97;
                                                                                                        }
                                                                                                        n4 = 1;
                                                                                                    }
                                                                                                    this.Fb += n4;
                                                                                                }
                                                                                                this.Mb += (this.Eb - n3) * 5;
                                                                                                this.Nb += (this.Fb - n2) * 5;
                                                                                                if (this.Kb != -1) {
                                                                                                    for (n4 = 1; n4 <= this.Cb; ++n4) {
                                                                                                        bl2 = this.Db[n4].j();
                                                                                                        if (!bl) {
                                                                                                            if (!bl2) continue;
                                                                                                            this.Db[n4].i();
                                                                                                            if (!bl) continue;
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                } else {
                                                                                                    bl2 = this.Sb;
                                                                                                }
                                                                                                if (bl2) {
                                                                                                    this.Tb.i();
                                                                                                }
                                                                                                if (this.Ub) {
                                                                                                    this.Vb.i();
                                                                                                }
                                                                                                if (!this.C() || this.Eb != this.Gb || this.Fb != this.Hb) break block99;
                                                                                                if (!this.gc || this.ec >= 0) break block100;
                                                                                                if (this.ec <= -20) break block101;
                                                                                                this.ec = this.ec * 3 / 2 - 1;
                                                                                                if (!bl) break block101;
                                                                                            }
                                                                                            if (!this.fc || this.ec <= 0) break block102;
                                                                                            if (this.ec >= 20) break block101;
                                                                                            this.ec = this.ec * 3 / 2 + 1;
                                                                                            if (!bl) break block101;
                                                                                        }
                                                                                        this.ec = (this.ec << 1) / 3;
                                                                                        if (this.ec != 0) break block101;
                                                                                        if (!this.gc) break block103;
                                                                                        this.ec = -1;
                                                                                        if (!bl) break block101;
                                                                                    }
                                                                                    if (this.fc) {
                                                                                        this.ec = 1;
                                                                                    }
                                                                                }
                                                                                this.Hb += this.ec;
                                                                                if (this.Hb > 0) {
                                                                                    this.Hb = 0;
                                                                                }
                                                                                if (this.Hb < ab.E - this.D()) {
                                                                                    this.Hb = ab.E - this.D();
                                                                                }
                                                                                this.Fb = this.Hb;
                                                                                if (this.ec >= 0) break block104;
                                                                                if (this.Kb == 3 || this.Db[3].p() + this.Fb - this.Db[3].c() / 2 >= ab.E) break block99;
                                                                                this.Kb = 3;
                                                                                if (!bl) break block99;
                                                                            }
                                                                            if (this.ec > 0 && this.Kb != 2) {
                                                                                this.ec = 0;
                                                                                this.gc = false;
                                                                                this.fc = false;
                                                                                this.Kb = 2;
                                                                            }
                                                                        }
                                                                        if (this.Rb != 13) break block105;
                                                                        if (this.I == null || !this.I.e) break block79;
                                                                        string = this.I.d;
                                                                        this.I = null;
                                                                        this.Sb = false;
                                                                        if (string != null) break block106;
                                                                        this.b(7);
                                                                        if (!bl) break block79;
                                                                    }
                                                                    ab.zb = System.currentTimeMillis();
                                                                    if (!string.equals("no")) break block107;
                                                                    ab.yb = false;
                                                                    qb.r();
                                                                    this.Rb = 0;
                                                                    this.b(8);
                                                                    if (!bl) break block79;
                                                                }
                                                                ab.yb = true;
                                                                qb.r();
                                                                boolean bl3 = true;
                                                                String string2 = string;
                                                                qb qb2 = this;
                                                                try {
                                                                    wfree.P.pr(midlet.a, string2);
                                                                }
                                                                catch (Exception exception) {
                                                                    qb2.Rb = 0;
                                                                    if (!bl) break block79;
                                                                }
                                                                qb2.g();
                                                                {
                                                                    break block79;
                                                                }
                                                                break block79;
                                                            }
                                                            if (this.Rb != 14) break block108;
                                                            if (this.I == null || !this.I.e) break block79;
                                                            if (this.I.d != null) break block109;
                                                            this.v();
                                                            if (!bl) break block79;
                                                        }
                                                        Object object = this.I.d;
                                                        this.I = null;
                                                        String string = object;
                                                        object = this;
                                                        this.wc = 0;
                                                        if (string != null) {
                                                            try {
                                                                string = new String(string.getBytes(), "UTF-8");
                                                                if (qb.c(string) && super.b(string) && !bl) break block79;
                                                            }
                                                            catch (Exception exception) {}
                                                        }
                                                        super.v();
                                                        break block79;
                                                    }
                                                    if (this.Rb != 52 || this.H == null) break block110;
                                                    if (this.H.d != 2) break block111;
                                                    if (this.p) break block112;
                                                    this.yc = 3;
                                                    if (!bl) break block113;
                                                }
                                                this.yc = 7;
                                            }
                                            this.z();
                                            if (!bl) break block79;
                                        }
                                        if (this.H.d != 1) break block79;
                                        if (!this.p) break block114;
                                        this.Rb = 42;
                                        if (!bl) break block115;
                                    }
                                    this.Rb = 0;
                                }
                                this.H = null;
                                this.b(12);
                                if (!bl) break block79;
                            }
                            if (this.Rb != 55 || this.H == null) break block116;
                            if (this.H.d == 0) break block79;
                            this.Rb = 0;
                            this.c(this.Kb);
                            if (this.H.d == 1) {
                                this.b(12);
                            }
                            this.H = null;
                            if (!bl) break block79;
                        }
                        if (this.Rb != 34 || this.Kb == -1) break block79;
                        n3 = (this.Db[this.Kb].o() - this.v) / 2;
                        n2 = (this.Db[this.Kb].p() - this.w) / 2;
                        if (n3 != 0) break block117;
                        this.v = this.Db[this.Kb].o();
                        if (!bl) break block118;
                    }
                    this.v += n3;
                }
                if (n2 != 0) break block119;
                this.w = this.Db[this.Kb].p();
                if (!bl) break block79;
            }
            this.w += n2;
        }
        if (this.Rb != 34 && this.y > 0) {
            --this.y;
            if (this.y <= 0) {
                this.y = 4;
                this.d(this.z, false);
            }
        }
        if (this.Rb == 42 && this.D > 0) {
            ++this.E;
            if (this.E > 40) {
                this.D = 0;
            }
        }
    }

    private void d(int n2, boolean bl) {
        if (this.Kb == -1 || n2 == -1) {
            return;
        }
        this.Zb = -1;
        if (this.Db[this.Kb].k()) {
            if (this.Db[this.Kb].s % 2 == 1) {
                if (n2 == 1) {
                    this.Db[this.Kb].b(-1, false);
                    return;
                }
                if (n2 == 3) {
                    this.Db[this.Kb].b(1, false);
                    return;
                }
            } else {
                if (n2 == 2) {
                    this.Db[this.Kb].b(1, false);
                    return;
                }
                if (n2 == 0) {
                    this.Db[this.Kb].b(-1, false);
                    return;
                }
            }
        }
        if (this.Lb) {
            this.c(this.Kb);
        }
        if (this.Rb == 34) {
            ab.G.b(ab.H, 1);
            this.b((int)ab.gb[n2], ab.hb[n2]);
            return;
        }
        if (n2 == 2) {
            this.b(-1, 1, bl, this.Kb);
            return;
        }
        if (n2 == 0) {
            this.b(1, 1, bl, this.Kb);
            return;
        }
        if (n2 == 1) {
            this.b(-1, 0, bl, this.Kb);
            return;
        }
        if (n2 == 3) {
            this.b(1, 0, bl, this.Kb);
        }
    }

    private void b(int n2, int n3) {
        int n4 = 1 + this.t * 9;
        int n5 = (this.Kb - n4) % 3 + n2;
        int n6 = (this.Kb - n4) / 3 + n3;
        if (n5 >= 3) {
            n5 = 0;
        }
        if (n6 >= 3) {
            n6 = 0;
        }
        if (n5 < 0) {
            n5 = 2;
        }
        if (n6 < 0) {
            n6 = 2;
        }
        if ((n4 = n6 * 3 + n5 + n4) <= 0 || n4 > this.Cb) {
            return;
        }
        if (!this.Db[n4].j()) {
            this.Kb = n4;
            this.b(n2, n3);
            return;
        }
        this.c(n4);
    }

    private void b(int n2, int n3, boolean bl, int n4) {
        int n5;
        boolean bl2 = ab.xc;
        do {
            block18: {
                block25: {
                    block21: {
                        block24: {
                            block22: {
                                block23: {
                                    int n6;
                                    block20: {
                                        block19: {
                                            this.Lb = false;
                                            if (this.Db[n4].s % 2 != n3) break block19;
                                            n6 = n4;
                                            if (bl2) break block20;
                                            n5 = n6;
                                            do {
                                                n5 += n2;
                                                if (this.Db[this.Db[n4].q].s == 0) {
                                                    if (n5 <= 0) {
                                                        if (!bl) {
                                                            return;
                                                        }
                                                        n5 = this.Cb;
                                                        if (!bl2) continue;
                                                    }
                                                    if (n5 <= this.Cb) continue;
                                                    if (!bl) {
                                                        return;
                                                    }
                                                    n5 = 1;
                                                    if (!bl2) continue;
                                                }
                                                if (n5 > 0 && n5 <= this.Cb) continue;
                                                if (this.Db[n4].q == 0) {
                                                    if (!bl) {
                                                        return;
                                                    }
                                                    if (n2 > 0) {
                                                        n5 = this.f(this.Db[n4].q);
                                                        if (!bl2) break block18;
                                                    }
                                                    n5 = this.g(this.Db[n4].q);
                                                    if (!bl2) break block18;
                                                }
                                                if (!bl && n5 > this.Cb) {
                                                    return;
                                                }
                                                this.A();
                                                n5 = this.Db[n4].q;
                                                if (!bl2) break block18;
                                            } while (this.Db[n5].q != this.Db[n4].q);
                                            break block18;
                                        }
                                        n6 = bl ? 1 : 0;
                                    }
                                    if (n6 == 0) {
                                        return;
                                    }
                                    if (this.Db[n4].r != 0) break block21;
                                    if (n2 >= 0) break block22;
                                    if (this.Db[n4].q > 0) break block23;
                                    n5 = this.f(0);
                                    if (!bl2) break block18;
                                }
                                n5 = this.Db[n4].q;
                                if (!bl2) break block18;
                            }
                            if (this.Db[n4].q < 0) break block24;
                            n5 = this.g(this.Db[n4].q);
                            if (!bl2) break block18;
                        }
                        return;
                    }
                    if (n2 <= 0) break block25;
                    n5 = this.f(n4);
                    if (!bl2) break block18;
                }
                n5 = this.g(n4);
            }
            if (!this.Db[n5].r() && this.Db[n5].o != 54 && this.Db[n5].j()) break;
            n4 = n5;
        } while (!bl2);
        ab.G.b(ab.H, 1);
        this.c(n5);
    }

    private void a(int n2) {
        this.Db[n2].b(this.Db[n2].h);
        this.Db[n2].c(this.Db[n2].i);
        if (this.Db[n2].s != 0) {
            if (this.Db[n2].s % 2 == 1) {
                this.Db[n2].c(this.Db[this.Db[n2].q].i + this.Db[this.Db[n2].q].d() + 8);
                return;
            }
            this.Db[n2].b(this.Db[this.Db[n2].q].h + this.Db[this.Db[n2].q].b() + 8);
        }
    }

    public final void c(int n2) {
        block45: {
            String string;
            block44: {
                boolean bl;
                block43: {
                    qb qb2;
                    int n3;
                    block42: {
                        int n4;
                        block38: {
                            qb qb3;
                            int n5;
                            block39: {
                                int n6;
                                int n7;
                                block37: {
                                    bl = ab.xc;
                                    if (n2 == -1) {
                                        this.Kb = n2;
                                        return;
                                    }
                                    if (this.Rb == 34) {
                                        this.Kb = n2;
                                        return;
                                    }
                                    n5 = 0;
                                    if (this.Kb <= 0 || this.Kb == n2) break block39;
                                    for (n5 = 1; n5 <= this.Cb; ++n5) {
                                        block40: {
                                            block41: {
                                                n7 = this.Db[n2].q;
                                                n6 = this.Kb;
                                                if (bl) break block37;
                                                if (n7 == n6 || this.Db[n5].q != this.Kb) break block40;
                                                n3 = n5;
                                                qb2 = this;
                                                this.Db[n3].w = 0;
                                                qb2.Db[n3].v = true;
                                                qb2.Db[n3].h = qb2.Db[qb2.Db[n3].q].h;
                                                qb2.Db[n3].i = qb2.Db[qb2.Db[n3].q].i;
                                                if (qb2.Db[n3].s == 0) break block40;
                                                if (qb2.Db[n3].s % 2 != 1) break block41;
                                                qb2.Db[n3].i = qb2.Db[qb2.Db[n3].q].i + qb2.Db[qb2.Db[n3].q].c() + 8;
                                                if (!bl) break block40;
                                            }
                                            qb2.Db[n3].h = qb2.Db[qb2.Db[n3].q].h + qb2.Db[qb2.Db[n3].q].b() + 8;
                                        }
                                        this.Db[n5].B = 0;
                                        if (!bl) continue;
                                    }
                                    n7 = this.Db[this.Kb].q;
                                    n6 = n2;
                                }
                                n5 = n7 == n6 ? 1 : 0;
                            }
                            this.Kb = n2;
                            this.Gb = ab.D / 2 - this.Db[this.Kb].h;
                            this.Hb = ab.E / 2 - this.Db[this.Kb].i;
                            if (n5 == 0) {
                                this.Db[this.Kb].r = 0;
                                this.Db[this.Kb].t = 0;
                                for (n5 = 1; n5 <= this.Cb; ++n5) {
                                    qb3 = this;
                                    if (!bl) {
                                        if (qb3.Db[n5].q != this.Kb) continue;
                                        this.a(n5, false);
                                        this.a(n5);
                                        if (!bl) continue;
                                    }
                                    break;
                                }
                            } else {
                                qb3 = this;
                            }
                            qb2 = qb3;
                            qb3.Ib = 0;
                            qb2.Jb = 0;
                            for (n3 = 1; n3 <= qb2.Cb; ++n3) {
                                n4 = qb2.Db[n3].j();
                                if (!bl) {
                                    if (n4 == 0) continue;
                                    if (qb2.Db[n3].h + qb2.Db[n3].b() / 2 > qb2.Ib) {
                                        qb2.Ib = qb2.Db[n3].h + qb2.Db[n3].b() / 2;
                                    }
                                    if (qb2.Db[n3].i + qb2.Db[n3].c() / 2 <= qb2.Jb) continue;
                                    qb2.Jb = qb2.Db[n3].i + qb2.Db[n3].c() / 2;
                                    if (!bl) continue;
                                }
                                break block38;
                            }
                            n3 = n2;
                            qb2 = this;
                            n4 = qb2.Db[n3].s % 2;
                        }
                        if (n4 != 1) break block42;
                        n2 = qb2.d(n3);
                        if (n2 != -1) {
                            qb2.Db[n2].B = 2;
                        }
                        if ((n2 = qb2.e(n3)) != -1) {
                            qb2.Db[n2].B = 4;
                        }
                        if ((n2 = qb2.f(n3)) == -1) break block43;
                        qb2.Db[n2].B = 1;
                        if (!bl) break block43;
                    }
                    if ((n2 = qb2.d(n3)) != -1) {
                        qb2.Db[n2].B = 3;
                    }
                    if ((n2 = qb2.e(n3)) != -1) {
                        qb2.Db[n2].B = 1;
                    }
                    if ((n2 = qb2.f(n3)) != -1) {
                        qb2.Db[n2].B = 4;
                    }
                }
                if (this.Rb == 0 || this.Rb == 42) {
                    if (this.yc == 2 && this.Ib > ab.D || this.yc != 2) {
                        if (this.Ib + this.Gb < ab.D - this.ub) {
                            this.Gb = ab.D - this.ub - this.Ib;
                        }
                        if (this.Db[1].h + this.Gb - this.Db[1].b() / 2 > this.ub) {
                            this.Gb = this.ub - this.Db[1].h + this.Db[1].b() / 2;
                        }
                    }
                    if (this.Jb + this.Hb < ab.E - this.vb) {
                        this.Hb = ab.E - this.vb - this.Jb;
                    }
                    if (this.Db[1].i + this.Hb - this.Db[1].c() / 2 > this.vb) {
                        this.Hb = this.vb - this.Db[1].i + this.Db[1].c() / 2;
                    }
                }
                if (this.Db[this.Kb].o != 36) break block44;
                this.Gb -= 30;
                if (this.Db[this.Kb].o() + this.Gb - this.Db[this.Kb].b() / 2 >= 10) break block45;
                this.Gb = this.Db[this.Kb].b() / 2 - this.Db[this.Kb].o() + 10;
                if (!bl) break block45;
            }
            if (!(string = this.Db[this.Kb].q()).equals("") && this.Db[this.Kb].s % 2 == 1) {
                this.Gb -= ab.C.b(string) / 2 + 2;
                if (this.Db[this.Kb].k()) {
                    this.Gb -= 12;
                }
                if (this.Db[this.Kb].o() + this.Gb - this.Db[this.Kb].b() / 2 < 10) {
                    this.Gb = this.Db[this.Kb].b() / 2 - this.Db[this.Kb].o() + 10;
                }
            }
        }
        if (this.Db[this.Kb].k()) {
            this.Db[this.Kb].n();
        }
    }

    private int d(int n2) {
        int n3;
        block2: {
            boolean bl = ab.xc;
            for (int i2 = n2 - 1; i2 > 0; --i2) {
                n3 = this.Db[n2].q;
                if (!bl) {
                    if (n3 != this.Db[i2].q) continue;
                    return i2;
                }
                break block2;
            }
            n3 = this.Db[n2].q;
        }
        return n3;
    }

    private int e(int n2) {
        int n3;
        block2: {
            boolean bl = ab.xc;
            for (int i2 = n2 + 1; i2 <= this.Cb; ++i2) {
                n3 = this.Db[n2].q;
                if (!bl) {
                    if (n3 != this.Db[i2].q) continue;
                    return i2;
                }
                break block2;
            }
            n3 = -1;
        }
        return n3;
    }

    private int f(int n2) {
        int n3;
        block2: {
            boolean bl = ab.xc;
            for (int i2 = 1; i2 <= this.Cb; ++i2) {
                n3 = this.Db[i2].q;
                if (!bl) {
                    if (n3 != n2 || !this.Db[i2].j() || this.Db[i2].r()) continue;
                    return i2;
                }
                break block2;
            }
            n3 = -1;
        }
        return n3;
    }

    private int g(int n2) {
        int n3;
        block2: {
            boolean bl = ab.xc;
            for (int i2 = this.Cb; i2 > 0; --i2) {
                n3 = this.Db[i2].q;
                if (!bl) {
                    if (n3 != n2 || !this.Db[i2].j() || this.Db[i2].r()) continue;
                    return i2;
                }
                break block2;
            }
            n3 = -1;
        }
        return n3;
    }

    public final void f() {
        this.fc = false;
        this.gc = false;
        this.ec = 0;
        if (this.Kb != -1) {
            this.b(this.Db[this.Kb]);
        }
    }

    private void g() {
        ab.o = true;
        this.j();
        qb.s();
        midlet.a.b();
    }

    public final void b(int n2, boolean bl, boolean bl2) {
        boolean bl3 = ab.xc;
        if (ab.Ub >= 5) {
            char c2;
            block15: {
                String string;
                String string2;
                n n3;
                block14: {
                    int n4;
                    String string3;
                    block13: {
                        int n5;
                        n3 = new n("settings", true);
                        try {
                            ab.Ab = n3.f("rk");
                        }
                        catch (Exception exception) {
                            ab.Ab = "";
                        }
                        if (ab.Ab == null) {
                            ab.Ab = "";
                        }
                        String string4 = ab.Bb;
                        string2 = "";
                        string3 = "";
                        for (n4 = 0; n4 < string4.length(); ++n4) {
                            n5 = n4 % 2;
                            if (!bl3) {
                                if (n5 != 0) continue;
                                string2 = string2 + (9 - Integer.parseInt(string4.substring(n4, n4 + 1)));
                                if (!bl3) continue;
                            }
                            break block13;
                        }
                        n5 = n4 = 0;
                    }
                    while (n4 < string2.length()) {
                        string = string3 + (9 - Integer.parseInt(string2.substring(string2.length() - 1 - n4, string2.length() - n4)));
                        if (!bl3) {
                            string3 = string;
                            ++n4;
                            if (!bl3) continue;
                        }
                        break block14;
                    }
                    string = qb.d(string3);
                }
                String string5 = string;
                string2 = "";
                for (int i2 = 0; i2 < ab.Ab.length(); ++i2) {
                    c2 = ab.Ab.charAt(i2);
                    if (!bl3) {
                        if (c2 == ' ') continue;
                        string2 = string2 + ab.Ab.charAt(i2);
                        if (!bl3) continue;
                    }
                    break block15;
                }
                try {
                    n3.c();
                }
                catch (Exception exception) {}
                c2 = (char)(string5.equals(string2) ? 1 : 0);
            }
            if (c2 == '\u0000') {
                this.F();
                return;
            }
        }
        ab.o = true;
        ab.z.repaint();
        this.nc = n2;
        this.mc = false;
        new zb(this).start();
    }

    /*
     * Unable to fully structure code
     */
    private void b(gb var1_1) {
        block107: {
            block98: {
                block103: {
                    block106: {
                        block104: {
                            block105: {
                                block99: {
                                    block100: {
                                        block102: {
                                            block101: {
                                                var8_3 = ab.xc;
                                                if (var1_1 == null) break block98;
                                                if (!var1_1.h()) {
                                                    ab.G.b(ab.Z, 1);
                                                    return;
                                                }
                                                this.sb = false;
                                                this.Zb = -1;
                                                if (var1_1.o != 10) break block99;
                                                if (var1_1.l != 0) break block100;
                                                ab.Gb = true;
                                                if (ab.Eb != 0) break block101;
                                                var1_1.b(1, true);
                                                if (!var8_3) break block102;
                                            }
                                            var1_1.b(ab.Eb / 10, true);
                                        }
                                        this.B();
                                        return;
                                    }
                                    var1_1.l = 0;
                                    ab.Gb = false;
                                    var1_1.A = true;
                                    ab.G.f();
                                    return;
                                }
                                if (var1_1.o != 24) break block103;
                                if (var1_1.l != 0) break block104;
                                ab.Hb = true;
                                if (ab.Fb != 0) break block105;
                                var1_1.b(1, true);
                                if (!var8_3) break block106;
                            }
                            var1_1.b(ab.Fb / 10, true);
                            if (!var8_3) break block106;
                        }
                        var1_1.l = 0;
                        ab.Hb = false;
                        var1_1.A = true;
                        if (ab.G != null) {
                            ab.G.c();
                        }
                    }
                    if (ab.G != null && ab.i() > 0) {
                        ab.G.b(ab.I, 1);
                    }
                    return;
                }
                if (var1_1.o == 42 || var1_1.o == 36) {
                    var2_4 = var1_1;
                    var1_1 = this;
                    ab.o = true;
                    var1_1.Wb = var2_4.n;
                    var1_1.c = new tb();
                    var1_1.c.f = 3;
                    if (var2_4.o == 42) {
                        var3_11 = var2_4.g();
                        qb.V.b = var3_11 - 3;
                        var1_1.c.b(qb.V);
                        if (var2_4.n < 14 + qb.kc) {
                            var2_5 = var2_4.n - qb.kc;
                            var1_1.c.b(ib.b("/lang_workshop.txt", var2_5 + 1));
                            var1_1.c.b("");
                            var1_1.c.b(ib.c(58) + hb.d[var2_5] + ib.c(59) + hb.b[var2_5] + ib.c(60));
                        } else {
                            var2_6 = var2_4.n - qb.kc - 14;
                            var1_1.c.b(ib.b("/lang_workshop.txt", var2_6 + 15));
                            var1_1.c.b("");
                            var1_1.c.b(ib.c(58) + hb.e[var2_6] + ib.c(59) + hb.c[var2_6] + ib.c(60));
                        }
                    } else if (var2_4.o == 36) {
                        var3_12 = var2_4.n - qb.lc;
                        var2_7 = mb.b[var3_12];
                        qb.V.b = var2_7 - 3;
                        var1_1.c.b(qb.V);
                        var1_1.c.b(ib.b("/lang_workshop.txt", var3_12 + 21));
                        var1_1.c.b("");
                        var1_1.c.b(ib.c(61) + mb.c(var3_12));
                        var1_1.c.b(ib.c(62) + mb.b(var3_12) + ib.c(63));
                    }
                    var1_1.c.b();
                    ab.o = false;
                    return;
                }
                if (var1_1.o != 17 && var1_1.k()) {
                    ab.G.b(ab.I, 1);
                    var1_1.b(1, true);
                    return;
                }
                ab.G.b(ab.I, 1);
                if (this.Lb) {
                    this.Lb = false;
                }
                var2_8 = var1_1.o;
                if (!var8_3) break block107;
            }
            var2_8 = this.d;
        }
        switch (var2_8) {
            case 64: {
                if (var1_1 != null) {
                    this.g = var1_1.n;
                }
                qb.q();
                this.b(null, false, true, false, -1);
                return;
            }
            case 25: {
                this.Rb = 25;
                this.h(2);
                this.i(0);
                this.Wb = this.Kb;
                this.Kb = -1;
                return;
            }
            case 0: {
                if (this.Rb == 70 || this.Rb == 71) {
                    this.Sb = false;
                    this.Ub = false;
                    this.Rb = 0;
                    this.c(this.Wb);
                    return;
                }
                if (this.Rb == 25) {
                    var1_1 = this;
                    ab.o = true;
                    rc.b.repaint();
                    new hc((qb)var1_1).start();
                    ab.o = false;
                    var1_1 = this;
                    ab.o = true;
                    rc.b.repaint();
                    new fc((qb)var1_1).start();
                    ab.o = false;
                    this.Rb = 0;
                    return;
                }
                if (this.Rb == 32) {
                    this.Wb = 1;
                    this.l(-1);
                    return;
                }
                if (this.Rb == 45) {
                    this.K();
                    return;
                }
                if (this.Rb != 46) break;
                var1_1 = this;
                var1_1.l(-2);
                return;
            }
            case 2: {
                this.Rb = 0;
                this.Sb = false;
                this.Ub = false;
                this.c(this.Wb);
                return;
            }
            case 1: 
            case 17: {
                var1_2 = ab.Ub;
                qb.p();
                ab.Ub = var1_2;
                this.b(ab.Ub, false, false);
                return;
            }
            case 4: {
                var2_9 = new n("settings", true);
                try {
                    ab.Ab = var2_9.f("rk");
                    var2_9.c();
                }
                catch (Exception v0) {
                    ab.Ab = "";
                }
                if (ab.Ab == null) {
                    ab.Ab = "";
                }
                var3_13 = ab.Bb;
                var4_15 = "";
                var5_17 = "";
                for (var6_19 = 0; var6_19 < var3_13.length(); ++var6_19) {
                    v1 = var6_19 % 2;
                    if (!var8_3) {
                        if (v1 != 0) continue;
                        var4_15 = var4_15 + (9 - Integer.parseInt(var3_13.substring(var6_19, var6_19 + 1)));
                        if (!var8_3) continue;
                    }
                    ** GOTO lbl170
                }
                v1 = var6_19 = 0;
lbl170:
                // 3 sources

                while (var6_19 < var4_15.length()) {
                    v2 = var5_17 + (9 - Integer.parseInt(var4_15.substring(var4_15.length() - 1 - var6_19, var4_15.length() - var6_19)));
                    if (!var8_3) {
                        var5_17 = v2;
                        ++var6_19;
                        if (!var8_3) continue;
                    }
                    ** GOTO lbl178
                }
                v2 = qb.d(var5_17);
lbl178:
                // 2 sources

                var6_20 = v2;
                var4_15 = "";
                for (var7_22 = 0; var7_22 < ab.Ab.length(); ++var7_22) {
                    v3 = ab.Ab.charAt(var7_22);
                    if (!var8_3) {
                        if (v3 == ' ') continue;
                        var4_15 = var4_15 + ab.Ab.charAt(var7_22);
                        if (!var8_3) continue;
                    }
                    ** GOTO lbl188
                }
                v3 = (char)var6_20.equals(var4_15);
lbl188:
                // 2 sources

                if (v3 == '\u0000') ** GOTO lbl205
                if (var1_1 == null) ** GOTO lbl193
                this.g = var1_1.n;
                this.b(null, false, true, false, 4);
                if (!var8_3) ** GOTO lbl206
lbl193:
                // 2 sources

                this.Rb = 4;
                this.h(22);
                this.i(23);
                this.Wb = this.e;
                this.i();
                ab.A = new fb();
                fb.Oe = this.ac[ab.Mb] + ".map";
                fb.M = true;
                fb.L = 1;
                qb.r();
                ab.A.O = this.Yb = new f(ab.A, this);
                if (!var8_3) ** GOTO lbl206
lbl205:
                // 2 sources

                this.M();
lbl206:
                // 3 sources

                try {
                    var2_9.c();
                    return;
                }
                catch (Exception v4) {
                    return;
                }
            }
            case 5: {
                var2_10 = new n("settings", true);
                try {
                    ab.Ab = var2_10.f("rk");
                    var2_10.c();
                }
                catch (Exception v5) {
                    ab.Ab = "";
                }
                if (ab.Ab == null) {
                    ab.Ab = "";
                }
                var3_14 = ab.Bb;
                var4_16 = "";
                var5_18 = "";
                for (var7_23 = 0; var7_23 < var3_14.length(); ++var7_23) {
                    v6 = var7_23 % 2;
                    if (!var8_3) {
                        if (v6 != 0) continue;
                        var4_16 = var4_16 + (9 - Integer.parseInt(var3_14.substring(var7_23, var7_23 + 1)));
                        if (!var8_3) continue;
                    }
                    ** GOTO lbl232
                }
                v6 = var7_23 = 0;
lbl232:
                // 3 sources

                while (var7_23 < var4_16.length()) {
                    v7 = var5_18 + (9 - Integer.parseInt(var4_16.substring(var4_16.length() - 1 - var7_23, var4_16.length() - var7_23)));
                    if (!var8_3) {
                        var5_18 = v7;
                        ++var7_23;
                        if (!var8_3) continue;
                    }
                    ** GOTO lbl240
                }
                v7 = qb.d(var5_18);
lbl240:
                // 2 sources

                var6_21 = v7;
                var4_16 = "";
                for (var7_23 = 0; var7_23 < ab.Ab.length(); ++var7_23) {
                    v8 = ab.Ab.charAt(var7_23);
                    if (!var8_3) {
                        if (v8 == ' ') continue;
                        var4_16 = var4_16 + ab.Ab.charAt(var7_23);
                        if (!var8_3) continue;
                    }
                    ** GOTO lbl250
                }
                v8 = (char)var6_21.equals(var4_16);
lbl250:
                // 2 sources

                if (v8 == '\u0000') ** GOTO lbl265
                if (var1_1 == null) ** GOTO lbl255
                this.g = var1_1.n;
                this.b(null, false, true, false, 5);
                if (!var8_3) ** GOTO lbl266
lbl255:
                // 2 sources

                this.Rb = 5;
                this.h(19);
                this.Wb = this.f;
                this.i();
                ab.A = new fb();
                fb.M = false;
                fb.L = 1;
                qb.r();
                ab.A.N = this.Xb = new db(ab.A, this);
                if (!var8_3) ** GOTO lbl266
lbl265:
                // 2 sources

                this.M();
lbl266:
                // 3 sources

                try {
                    var2_10.c();
                    return;
                }
                catch (Exception v9) {
                    return;
                }
            }
            case 16: {
                this.g();
                return;
            }
            case 19: {
                this.a(false, false);
                return;
            }
            case 20: {
                this.Ub = false;
                this.i();
                this.Xb.c();
                return;
            }
            case 21: {
                this.Ub = false;
                this.sb = true;
                this.x = this.Kb;
                this.Xb.b(this.Kb - 1);
                return;
            }
            case 22: {
                this.b(false, false);
                return;
            }
            case 23: {
                this.Sb = false;
                this.Ub = false;
                this.Yb.l();
                return;
            }
            case 31: {
                this.h();
                return;
            }
            case 32: {
                if (this.Rb == 63) {
                    this.Rb = 0;
                    this.Sb = false;
                    this.Ub = false;
                    this.c(this.C);
                    this.c();
                    return;
                }
                this.Rb = 32;
                this.h(2);
                this.i(0);
                this.Wb = this.Kb;
                this.Kb = -1;
                return;
            }
            case 33: 
            case 53: 
            case 55: {
                if (var1_1.o == 53) {
                    var1_1.u = "";
                }
                this.Rb = var1_1.o;
                this.Gb = ab.D / 2 - this.Db[this.Kb].h;
                this.Hb = this.Db[this.Kb].c() / 2 - this.Db[this.Kb].i;
                if (ab.E <= 132) {
                    this.Hb -= 20;
                }
                bb.b((gb)var1_1, var1_1.o == 55);
                return;
            }
            case 35: {
                ab.o = true;
                this.Wb = var1_1.n;
                this.c = new tb();
                this.c.f = 3;
                qb.Q.b = 0;
                this.c.b(qb.Q);
                this.c.b(ib.b("/lang_help.txt", 0));
                this.c.b();
                ab.o = false;
                return;
            }
            case 13: {
                this.Rb = 13;
                System.out.println("http://get.pipyakas.com/pipyaka/pipyaka.php?p=4&dn=" + ab.h + "&vr=" + ab.f + "&build=0" + "&manufacturer=" + lb.b() + "&model=" + lb.c() + "&level_completed=" + ab.Tb + "&hasPointerEvents=" + rc.e + "&cps=" + fb.s + "&fps=" + fb.p);
                this.I = new rb("http://get.pipyakas.com/pipyaka/pipyaka.php?p=4&dn=" + ab.h + "&vr=" + ab.f + "&build=0" + "&manufacturer=" + lb.b() + "&model=" + lb.c() + "&level_completed=" + ab.Tb + "&hasPointerEvents=" + rc.e + "&cps=" + fb.s + "&fps=" + fb.p, 120000L);
                return;
            }
            case 15: {
                this.cc = ab.E - 1;
                this.Rb = 15;
                return;
            }
            case 14: {
                this.h(false);
                return;
            }
            case 50: {
                this.B = var1_1.n;
                this.zc = rb.b((String)this.xc.elementAt(var1_1.n - 2), ";".charAt(0));
                if (!this.p) ** GOTO lbl352
                this.yc = 6;
                if (!var8_3) ** GOTO lbl353
lbl352:
                // 2 sources

                this.yc = 2;
lbl353:
                // 2 sources

                this.z();
                return;
            }
            case 51: {
                if (this.yc == 2) {
                    if (this.xc.size() == 1) {
                        this.d();
                        return;
                    }
                    this.yc = 1;
                    this.z();
                    return;
                }
                if (this.yc == 1) {
                    if (this.p) {
                        this.G();
                        return;
                    }
                    this.d();
                    return;
                }
                if (this.yc == 6) {
                    this.G();
                    return;
                }
                if (this.yc == 4) {
                    this.Wb = 1;
                }
                this.d();
                return;
            }
            case 52: {
                this.Rb = 52;
                if (this.p) {
                    this.H = new i(this.zc[6], this.zc[4] + " " + qb.n(2));
                    return;
                }
                this.H = new i(this.zc[5], this.zc[3] + " " + qb.n(1));
                return;
            }
            case 39: {
                this.h(true);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void h() {
        block14: {
            block12: {
                block13: {
                    boolean bl;
                    block11: {
                        n n2;
                        bl = ab.xc;
                        if (this.Rb == 34 && fb.L != 0) {
                            ab.l = 0;
                            return;
                        }
                        if (this.Rb != 42) break block12;
                        if (!fb.i() || m) break block13;
                        ab.l = 0;
                        int n3 = ab.Qb + this.q;
                        if (m) {
                            ab.Rb = n3;
                            n2 = new n("btautosave", true);
                            try {
                                n2.b("btcoins", n3);
                                n2.b();
                                n2.c();
                                break block11;
                            }
                            catch (Exception exception) {
                                if (!bl) break block11;
                            }
                        }
                        ab.Qb = n3;
                        n2 = new n("autosave", true);
                        try {
                            n2.b("coins", n3);
                            n2.b();
                            n2.c();
                        }
                        catch (Exception exception) {}
                    }
                    this.bc.nc += this.bc.v() - this.bc.mc;
                    this.bc.mc = this.bc.v();
                    if (!bl) break block14;
                }
                if (this.qb) {
                    ab.l = 0;
                    qb.d(this.bc);
                    this.bc.nc += this.bc.v() - this.bc.mc;
                    this.bc.mc = this.bc.v();
                    if (fb.M) return;
                    fb.I.b(this.bc.w, this.bc);
                    return;
                }
                if (this.d != -1) {
                    this.b((gb)null);
                    return;
                }
                qb.d(null);
                this.Wb = this.l;
                this.d();
                return;
            }
            ab.l = 0;
            if (this.qb && this.Rb != 34) {
                ab.G.h();
            }
        }
        ab.A.b(false, false);
    }

    private void i() {
        this.Kb = -1;
        this.Cb = 0;
        this.Db[0] = new gb(0, this, -1, -1);
        this.c();
    }

    private void h(int n2) {
        this.Tb = new gb(-2, this, n2, -1);
        this.Tb.h = 2 + this.Tb.b() / 2;
        this.Tb.i = ab.E - this.Tb.c() / 2 - 2;
        this.Tb.b(this.Tb.b() / 2);
        this.Tb.c(ab.E + this.Tb.c() / 2);
        this.Sb = true;
    }

    public final void i(int n2) {
        this.Vb = new gb(-2, this, n2, -1);
        this.Vb.h = ab.D - 2 - this.Vb.b() / 2;
        this.Vb.i = ab.E - 2 - this.Vb.c() / 2;
        this.Vb.b(ab.D + this.Vb.b() / 2);
        this.Vb.c(ab.E + this.Vb.c() / 2);
        this.Ub = true;
    }

    public final void b(boolean bl) {
        if (bl) {
            ab.G.b("/midi/music_menu.mid", 1);
        }
        this.rb = true;
        this.Ob = new Thread(this);
        this.Ob.start();
    }

    public final void run() {
        boolean bl = ab.xc;
        long l2 = 0L;
        long l3 = 0L;
        while (this.rb) {
            if (System.currentTimeMillis() - l2 >= 40L) {
                this.e();
                rc.b.repaint();
                l2 = System.currentTimeMillis();
            }
            if (System.currentTimeMillis() - l3 >= 8000L) {
                l3 = System.currentTimeMillis();
            }
            Thread.yield();
            if (this.I == null || this.I.e) continue;
            try {
                Thread.sleep(100L);
            }
            catch (Exception exception) {
                if (!bl) continue;
            }
        }
    }

    public final void j() {
        this.rb = false;
        try {
            this.Ob = null;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void j(int n2) {
        this.A();
        if (ab.o || this.a) {
            return;
        }
        if (this.c != null) {
            this.c.b(n2);
            return;
        }
        if (this.Rb == 33 || this.Rb == 53 || this.Rb == 55 && this.H == null) {
            bb.b(n2);
            return;
        }
        if (this.Rb == 13 || this.Rb == 14) {
            if ((n2 == ab.jb || n2 == ab.lb) && this.Sb) {
                this.b(this.Tb);
            }
            return;
        }
        if (this.Rb == 52 || this.Rb == 55) {
            return;
        }
        if (this.Rb == 34 && n2 == 35) {
            ab.G.b(ab.H, 1);
            ++this.t;
            if (this.t >= this.u) {
                this.t = 0;
            }
            this.c(this.t * 9 + 1);
            return;
        }
        if (n2 == ab.ib && this.Rb == 42 && this.yc == 0) {
            if (!m || this.qb) {
                this.h();
            }
            return;
        }
        int n3 = rc.b.getGameAction(n2);
        if (n3 == 8 || n2 == ab.rb) {
            if (this.Rb == 34) {
                this.f(true);
                return;
            }
            if (this.Rb == 15) {
                ab.G.b(ab.I, 1);
                this.k();
                return;
            }
            if (!this.sb) {
                this.f();
                return;
            }
        } else if (n2 == ab.jb || n2 == ab.lb) {
            if (this.Rb == 15) {
                this.k();
                return;
            }
            if (this.Sb) {
                this.b(this.Tb);
                return;
            }
            if (!(this.Ub || !this.qb && this.Rb != 42 || this.Rb == 42 && this.yc != 0)) {
                if (!this.qb) {
                    this.Wb = this.g;
                    this.d();
                    return;
                }
                this.h();
                return;
            }
        } else if (n2 == ab.kb || n2 == ab.mb) {
            if (this.Rb == 15) {
                this.k();
                return;
            }
            if (this.Ub) {
                this.b(this.Vb);
                return;
            }
            if (!(this.Sb || !this.qb && this.Rb != 42 || this.Rb == 46 || this.Rb == 45 || this.Rb == 42 && this.yc != 0)) {
                if (!this.qb) {
                    this.Wb = this.g;
                    this.d();
                    return;
                }
                this.h();
                return;
            }
        } else if (n2 == ab.sb || n2 == ab.tb) {
            if (this.Rb == 34) {
                this.f(false);
                return;
            }
        } else {
            n2 = qb.c(n3, n2);
            if (this.Rb == 15 || this.C()) {
                if (n2 == 0) {
                    this.fc = false;
                    this.gc = true;
                    return;
                }
                if (n2 == 2) {
                    this.gc = false;
                    this.fc = true;
                    return;
                }
            } else if (!this.sb) {
                if (n2 == 0 || n2 == 2 || n2 == 1 || n2 == 3) {
                    this.z = n2;
                    this.y = 8;
                }
                this.d(n2, true);
            }
        }
    }

    public final void k(int n2) {
        this.A();
        if (ab.o || this.a) {
            return;
        }
        if (this.c != null) {
            this.c.c(n2);
            return;
        }
        int n3 = rc.b.getGameAction(n2);
        byte by = qb.c(n3, n2);
        n2 = by;
        if (by == 0) {
            this.gc = false;
            return;
        }
        if (n2 == 2) {
            this.fc = false;
        }
    }

    private void k() {
        this.jc = false;
        if (this.dc) {
            this.dc = false;
            this.Rb = 0;
            this.c(this.Kb);
            return;
        }
        this.dc = true;
        this.ec = 0;
    }

    private static byte c(int n2, int n3) {
        byte by = -1;
        if (n2 == 6 || n3 == 56) {
            by = 0;
        }
        if (n2 == 2 || n3 == 52) {
            by = 1;
        }
        if (n2 == 1 || n3 == 50) {
            by = 2;
        }
        if (n2 == 5 || n3 == 54) {
            by = 3;
        }
        return by;
    }

    public final void b(String string) {
        if (this.Rb != 5) {
            return;
        }
        ++this.Cb;
        this.Db[this.Cb] = new gb(this.Cb, this, 21, 0, string);
        this.a(this.Cb, true);
        this.a(this.Cb);
        this.Ib = this.Db[this.Cb].h + this.Db[this.Cb].b() / 2;
        this.Jb = this.Db[this.Cb].i + this.Db[this.Cb].c() / 2;
        if (this.Kb == -1) {
            this.c(this.Cb);
        }
    }

    public final void b() {
        if (this.Rb != 5) {
            return;
        }
        this.i(20);
    }

    public final void b(int n2, boolean bl) {
        ab.q = 0;
        ab.o = true;
        this.x = -1;
        if (bl) {
            qb.p();
        }
        this.oc = (byte)n2;
        ab.l = 0;
        ab.z.repaint();
        new yb(this).start();
    }

    public final void b(int n2) {
        this.Zb = n2;
        this.sb = false;
        int n3 = this.x;
        this.x = -1;
        if (n2 == 0) {
            tb = true;
            this.a(false, false);
            return;
        }
        if (n2 == 1) {
            this.Db[n3].l = 1;
            this.i(20);
            return;
        }
        if (n2 == 2) {
            tb = true;
            this.b(false, false);
            return;
        }
        if (n2 == 3) {
            this.b(false, false);
            return;
        }
        if (n2 == 4) {
            tb = true;
            this.a(false, false);
            return;
        }
        if (n2 == 9) {
            this.sc = true;
            this.Zb = -1;
            this.a(false, false);
            return;
        }
        if (n2 == 10) {
            this.tc = true;
            this.Zb = -1;
            this.a(false, false);
            return;
        }
        if (n2 == 5) {
            tb = true;
            this.b(false, false);
            return;
        }
        if (n2 == 8 || n2 == 7 || n2 == 11) {
            this.Sb = false;
            this.Rb = 0;
        }
    }

    public final void l(int n2) {
        ab.o = true;
        this.pc = n2;
        ab.z.repaint();
        if (fb.L == 0) {
            new bc(this).start();
            return;
        }
        if (ab.A.b()) {
            new ac(this).start();
            return;
        }
        this.a(true, this.pc == -3);
    }

    public final void c(boolean bl) {
        this.b(true);
    }

    private void a(boolean bl, boolean bl2) {
        this.qc = bl;
        this.rc = bl2 && !ab.c;
        this.x = -1;
        this.Xb.c = true;
        this.E();
        this.d();
        new nc(this).start();
    }

    public final void b(boolean bl, boolean bl2) {
        this.qc = bl;
        this.rc = bl2 && !ab.c;
        this.Yb.c = true;
        this.E();
        this.d();
        new oc(this).start();
    }

    public final void l() {
        block2: {
            qb qb2;
            boolean bl = ab.xc;
            for (int i2 = 1; i2 <= this.Cb; ++i2) {
                qb2 = this;
                if (!bl) {
                    if (qb2.Db[i2].o != 28) continue;
                    this.Db[i2].l = 0;
                    if (!bl) continue;
                }
                break block2;
            }
            qb2 = this;
        }
        qb2.ac = qb.m(ab.Nb);
    }

    private static String[] m(int n2) {
        boolean bl = ab.xc;
        FilterInputStream filterInputStream = null;
        boolean bl2 = false;
        Vector<String> vector = null;
        try {
            filterInputStream = new DataInputStream(((Object)((Object)midlet.a)).getClass().getResourceAsStream("/maps/list"));
            String string = k.b((DataInputStream)filterInputStream);
            if (!string.equals("[XXXYAKAS]")) {
                throw new Exception();
            }
            vector = new Vector<String>();
            while ((string = k.b((DataInputStream)filterInputStream)) != null) {
                if (!bl2) {
                    if (n2 == 0) {
                        if (!string.equals("[DM]") && !string.equals("[TM]") && !string.equals("[CTF]")) continue;
                        bl2 = true;
                        if (!bl) continue;
                    }
                    if (n2 == 1) {
                        if (!string.equals("[TM]") && !string.equals("[CTF]")) continue;
                        bl2 = true;
                        if (!bl) continue;
                    }
                    if (n2 != 2 || !string.equals("[CTF]")) continue;
                    bl2 = true;
                    if (!bl) continue;
                }
                if (string.equals("end")) {
                    bl2 = false;
                    if (!bl) continue;
                }
                if (string.equals("")) continue;
                vector.addElement(string);
                if (!bl && !bl) continue;
                break;
            }
        }
        catch (Exception exception) {
            try {
                if (filterInputStream != null) {
                    filterInputStream.close();
                }
            }
            catch (Exception exception2) {}
            String cfr_ignored_0 = "ERROR: get maps list at type " + n2;
        }
        try {
            if (filterInputStream != null) {
                filterInputStream.close();
            }
        }
        catch (Exception exception) {}
        if (vector != null && vector.size() > 0) {
            String[] stringArray;
            block18: {
                String[] stringArray2 = new String[vector.size()];
                for (int i2 = 0; i2 < vector.size(); ++i2) {
                    stringArray = stringArray2;
                    if (!bl) {
                        stringArray[i2] = (String)vector.elementAt(i2);
                        if (!bl) continue;
                    }
                    break block18;
                }
                stringArray = stringArray2;
            }
            return stringArray;
        }
        return new String[]{"no map"};
    }

    public final void m() {
        block3: {
            boolean bl = ab.xc;
            this.qb = true;
            ab.l = 1;
            ab.A.b();
            ab.G.g();
            ab.o = true;
            this.Rb = 0;
            this.Sb = false;
            this.Ub = false;
            this.sb = false;
            this.Zb = -1;
            this.Wb = 1;
            this.Db[0] = new gb(0, this, -1, -1);
            this.Db[1] = new gb(1, this, 31, 0);
            this.Db[2] = new gb(2, this, 9, 0);
            this.Db[3] = new gb(3, this, 32, 0);
            this.Db[4] = new gb(4, this, 10, 2);
            this.Db[5] = new gb(5, this, 11, 2);
            this.Db[6] = new gb(6, this, 37, 2);
            this.Cb = 5;
            this.Kb = -1;
            this.Ib = 0;
            this.Jb = 0;
            for (int i2 = 0; i2 <= this.Cb; ++i2) {
                this.a(i2, true);
                if (!bl) {
                    if (!bl) continue;
                }
                break block3;
            }
            if (this.Wb > 0) {
                this.c(this.Wb);
            }
            this.c();
            ab.o = false;
        }
    }

    public final void d(boolean bl) {
        block21: {
            String string;
            block22: {
                boolean bl2;
                block23: {
                    block25: {
                        block24: {
                            char c2;
                            block18: {
                                String string2;
                                String string3;
                                block17: {
                                    int n2;
                                    String string4;
                                    block16: {
                                        int n3;
                                        block19: {
                                            block20: {
                                                bl2 = ab.xc;
                                                bb.b = null;
                                                if (this.Rb != 33) break block19;
                                                if (!bl) break block20;
                                                ab.Kb = this.Db[this.Kb].u;
                                                if (!bl2) break block21;
                                            }
                                            this.Db[this.Kb].u = ab.Kb;
                                            if (!bl2) break block21;
                                        }
                                        if (this.Rb != 53) break block22;
                                        string = this.Db[this.Kb].u;
                                        this.Db[this.Kb].u = ib.c(30);
                                        if (!bl) break block23;
                                        this.Rb = 0;
                                        String string5 = ab.Bb;
                                        string3 = "";
                                        string4 = "";
                                        for (n2 = 0; n2 < string5.length(); ++n2) {
                                            n3 = n2 % 2;
                                            if (!bl2) {
                                                if (n3 != 0) continue;
                                                string3 = string3 + (9 - Integer.parseInt(string5.substring(n2, n2 + 1)));
                                                if (!bl2) continue;
                                            }
                                            break block16;
                                        }
                                        n3 = n2 = 0;
                                    }
                                    while (n2 < string3.length()) {
                                        string2 = string4 + (9 - Integer.parseInt(string3.substring(string3.length() - 1 - n2, string3.length() - n2)));
                                        if (!bl2) {
                                            string4 = string2;
                                            ++n2;
                                            if (!bl2) continue;
                                        }
                                        break block17;
                                    }
                                    string2 = qb.d(string4);
                                }
                                String string6 = string2;
                                string3 = "";
                                for (int i2 = 0; i2 < string.length(); ++i2) {
                                    c2 = string.charAt(i2);
                                    if (!bl2) {
                                        if (c2 == ' ') continue;
                                        string3 = string3 + string.charAt(i2);
                                        if (!bl2) continue;
                                    }
                                    break block18;
                                }
                                c2 = (char)(string6.equals(string3) ? 1 : 0);
                            }
                            if (c2 == '\u0000') break block24;
                            ab.Ab = string;
                            qb.r();
                            this.s = false;
                            this.yc = 4;
                            if (!bl2) break block25;
                        }
                        this.s = true;
                        this.yc = 5;
                    }
                    this.z();
                    return;
                }
                this.Sb = true;
                if (!bl2) break block21;
            }
            if (this.Rb == 55) {
                string = this.Db[this.Kb].u;
                this.Db[this.Kb].u = "";
                if (bl) {
                    this.H = new i("+" + string, ib.c(38) + ab.i);
                    return;
                }
            }
        }
        this.Rb = 0;
        this.c(this.Kb);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void b(q var1_1, boolean var2_3, boolean var3_4, boolean var4_5, int var5_6) {
        block22: {
            block21: {
                block24: {
                    block23: {
                        var6_7 = ab.xc;
                        this.uc = ab.b;
                        ab.b = false;
                        qb.m = var3_4;
                        this.qb = var4_5;
                        this.d = var5_6;
                        ab.l = 1;
                        if (!var2_3 && fb.L == 0 && this.qb) {
                            ab.A.b();
                        }
                        ab.o = true;
                        if (qb.m && var1_1 != null && !var2_3) {
                            qb.d(var1_1);
                        }
                        qb.n = false;
                        this.v();
                        qb.n = true;
                        this.Rb = 42;
                        this.Sb = false;
                        this.Ub = false;
                        this.sb = false;
                        this.Zb = -1;
                        this.Wb = 1;
                        this.D = 0;
                        this.yc = 0;
                        if (!var2_3) {
                            this.q = 0;
                        }
                        this.bc = var1_1;
                        this.Cb = 36;
                        this.Db[0] = new gb(0, this, -1, -1);
                        this.Db[0].s = 1;
                        if (ab.c) break block23;
                        this.Db[1] = new gb(1, this, 39, 0);
                        this.Db[2] = new gb(2, this, 40, 0);
                        this.Db[3] = new gb(3, this, 41, 0);
                        this.Db[4] = new gb(4, this, 44, 0);
                        this.Db[5] = new gb(5, this, 31, 0);
                        this.Wb = 1;
                        var2_3 = 2;
                        var3_4 = 3;
                        var4_5 = 4;
                        qb.kc = 6;
                        if (!var6_7) break block24;
                    }
                    this.Db[1] = new gb(1, this, 40, 0);
                    this.Db[2] = new gb(2, this, 41, 0);
                    this.Db[3] = new gb(3, this, 44, 0);
                    this.Db[4] = new gb(4, this, 31, 0);
                    this.Wb = 1;
                    qb.kc = 5;
                    var2_3 = true;
                    var3_4 = 2;
                    var4_5 = 3;
                    --this.Cb;
                }
                for (var1_2 = 0; var1_2 < 14; ++var1_2) {
                    this.Db[qb.kc + var1_2] = new gb(qb.kc + var1_2, this, 42, (int)var2_3);
                    v0 = this.bc;
                    if (!var6_7) {
                        if (v0 != null) {
                            this.Db[qb.kc + var1_2].l = this.bc.Yb[var1_2];
                            this.Db[qb.kc + var1_2].m = this.bc.Yb[var1_2];
                            if (ab.d || this.bc.Yb[var1_2] != 0 || ab.Yb[var1_2]) continue;
                            this.Db[qb.kc + var1_2].d = true;
                            if (!var6_7) continue;
                        }
                        this.Db[qb.kc + var1_2].l = qb.h[var1_2];
                        this.Db[qb.kc + var1_2].m = qb.h[var1_2];
                        if (!var6_7) continue;
                    }
                    ** GOTO lbl88
                }
                for (var1_2 = 0; var1_2 < 6; ++var1_2) {
                    this.Db[qb.kc + 14 + var1_2] = new gb(qb.kc + 14 + var1_2, this, 42, (int)var3_4);
                    v0 = this.bc;
                    if (!var6_7) {
                        if (v0 != null) {
                            this.Db[qb.kc + 14 + var1_2].l = this.bc.dc[var1_2];
                            this.Db[qb.kc + 14 + var1_2].m = this.bc.dc[var1_2];
                            if (ab.d || this.bc.dc[var1_2] != 0 || ab.Zb[var1_2]) continue;
                            this.Db[qb.kc + 14 + var1_2].d = true;
                            if (!var6_7) continue;
                        }
                        this.Db[qb.kc + 14 + var1_2].l = qb.i[var1_2];
                        this.Db[qb.kc + 14 + var1_2].m = qb.i[var1_2];
                        if (!var6_7) continue;
                    }
                    ** GOTO lbl88
                }
                qb.lc = qb.kc + 14 + 6;
                for (var1_2 = 0; var1_2 < 11; ++var1_2) {
                    this.Db[qb.lc + var1_2] = new gb(qb.lc + var1_2, this, 36, (int)var4_5);
                    v1 = this;
                    if (var6_7) break block21;
                    v0 = v1.bc;
lbl88:
                    // 3 sources

                    if (v0 != null) {
                        this.Db[qb.lc + var1_2].l = this.bc.ac[var1_2];
                        this.Db[qb.lc + var1_2].m = this.bc.ac[var1_2];
                        if (!var6_7) continue;
                    }
                    this.Db[qb.lc + var1_2].l = qb.j[var1_2];
                    this.Db[qb.lc + var1_2].m = qb.j[var1_2];
                    if (!var6_7) continue;
                }
                this.Kb = -1;
                this.Ib = 0;
                v1 = this;
            }
            v1.Jb = 0;
            for (var1_2 = 0; var1_2 <= this.Cb; ++var1_2) {
                this.a(var1_2, true);
                if (!var6_7) {
                    if (!var6_7) continue;
                }
                break block22;
            }
            if (this.Wb > 0) {
                this.c(this.Wb);
            }
            this.c();
        }
        if (ab.g) {
            this.c = new tb();
            this.c.f = 3;
            qb.Q.b = 0;
            this.c.b(qb.Q);
            this.c.b(ib.b("/lang_workshop.txt", 0));
            this.c.b();
        }
        ab.g = false;
        ab.o = false;
    }

    public final void b(q q2) {
        int n2;
        block9: {
            boolean bl;
            block11: {
                block10: {
                    bl = ab.xc;
                    this.bc = q2;
                    this.qb = true;
                    ab.l = 1;
                    if (!fb.i()) break block10;
                    ab.A.b();
                    if (!bl) break block11;
                }
                qb.d(q2);
            }
            this.Rb = 34;
            this.Sb = false;
            this.Ub = false;
            this.sb = false;
            this.Zb = -1;
            this.Wb = q2.bc + 1;
            if (this.Wb == 0) {
                this.Wb = 1;
            }
            this.Cb = 20;
            this.Db[0] = new gb(0, this, -1, -1);
            this.t = 0;
            this.Ib = 8;
            this.Jb = 8;
            this.Gb = (ab.D - this.Ib * ob) / 2;
            this.Hb = (ab.E - this.Jb * pb) / 2;
            this.Eb = this.Gb;
            this.Fb = this.Hb;
            int n3 = (this.Ib * ob - qb.V.d * 3) / 2 + 1;
            int n4 = (this.Jb * pb - qb.V.e * 3) / 2 + 1;
            for (int i2 = 1; i2 <= this.Cb; ++i2) {
                int n5 = (i2 - 1) % 9;
                this.Db[i2] = new gb(i2, this, 34, 0);
                int n6 = n5 % 3;
                this.Db[i2].h = this.Gb + n3 + (qb.V.d - 2) * n6;
                this.Db[i2].i = this.Hb + n4 + (qb.V.e - 2) * (n5 /= 3);
                this.Db[i2].b(this.Db[i2].h);
                this.Db[i2].c(this.Db[i2].i);
                n2 = i2;
                if (!bl) {
                    if (n2 <= 14) {
                        this.Db[i2].l = q2.Yb[i2 - 1];
                        if (!bl) continue;
                    }
                    this.Db[i2].l = q2.dc[i2 - 1 - 14];
                    if (!bl) continue;
                }
                break block9;
            }
            n2 = this.t = (this.Wb - 1) / 9;
        }
        if (n2 < 0) {
            this.t = 0;
        }
        this.c(this.Wb);
        this.v = this.Db[this.Kb].o();
        this.w = this.Db[this.Kb].p();
        ab.o = false;
    }

    private void f(boolean bl) {
        block8: {
            block9: {
                byte by;
                boolean bl2;
                block6: {
                    block7: {
                        bl2 = ab.xc;
                        if (this.Kb <= 0) {
                            return;
                        }
                        if (this.Db[this.Kb].l == 0) {
                            ab.G.b(ab.Z, 1);
                            return;
                        }
                        if (this.Kb > 14) break block6;
                        ab.G.b(ab.I, 1);
                        if (!bl) break block7;
                        this.bc.bc = this.Kb - 1;
                        fb.I.c(hb.b(this.bc.bc) + this.bc.Yb[this.bc.bc]);
                        if (!bl2) break block8;
                    }
                    this.bc.cc = this.Kb - 1;
                    if (!bl2) break block8;
                }
                if ((by = (byte)(this.Kb - 1 - 14)) == 5) {
                    return;
                }
                ab.G.b(ab.I, 1);
                if (!bl) break block9;
                this.bc.d(by, false);
                if (!bl2) break block8;
            }
            this.bc.cc = this.Kb - 1;
        }
        this.h();
    }

    public static void n() {
        ab.d();
        n n2 = new n("settings", true);
        try {
            ab.e = n2.e("first");
            ab.Eb = n2.c("music volume");
            ab.Fb = n2.c("sfx volume");
            ab.Ib = n2.e("vibra");
            ab.Jb = n2.e("gfx level");
            ab.Jb = true;
            ab.Kb = n2.f("nickname");
            ab.Lb = n2.c("bots");
            ab.Mb = n2.c("map id");
            ab.Nb = n2.c("mp mode");
            ab.m = (byte)ab.Nb;
            ab.n = ab.gc;
            ab.Gb = n2.e("music on");
            ab.Hb = n2.e("sfx on");
            ab.cc = n2.e("blood");
            ab.wb = n2.c("country");
            ab.xb = n2.c("lang");
            ab.yb = n2.e("need update");
            ab.zb = n2.d("last update");
            String string = n2.f("version");
            ab.Ab = n2.f("rk");
            ab.Bb = n2.f("gk");
            ab.ec = n2.b("team color");
            ab.dc = n2.b("bots level");
            ab.gc = n2.e("friendly fire");
            ab.fc = n2.b("team balance");
            ab.hc = n2.e("sound detail");
            ab.Db = n2.e("tips");
            ab.Cb = n2.e("weather");
            ab.g = n2.e("wshelp");
            if (!string.equals(ab.f)) {
                ab.yb = false;
            }
            n2.c();
        }
        catch (Exception exception) {
            ab.d();
            qb.r();
        }
        if (ab.Bb == null) {
            ab.Bb = "";
        }
        if (ab.Bb.equals("")) {
            ab.d();
            qb.r();
        }
    }

    public static void o() {
        boolean bl = ab.xc;
        o = ab.Tb;
        while (!ab.e(o)) {
            --o;
            if (!bl) continue;
        }
    }

    private static void p() {
        boolean bl = ab.xc;
        ab.e();
        n n2 = new n("autosave", true);
        try {
            block11: {
                int n3;
                int n4;
                block10: {
                    block9: {
                        ab.Tb = n2.b("levels completed");
                        ab.Ub = n2.b("cur level");
                        ab.Sb = n2.d("xpn");
                        qb.o();
                        ab.Qb = n2.c("coins");
                        n4 = n2.b("wtypes");
                        for (n3 = 0; n3 < n4; ++n3) {
                            ab.Vb[n3] = n2.c("wcount" + n3);
                            ab.Yb[n3] = n2.e("wknown" + n3);
                            if (!bl) {
                                if (!bl) continue;
                            }
                            break block9;
                        }
                        n4 = n2.b("sks");
                    }
                    for (n3 = 0; n3 < n4; ++n3) {
                        ab.Wb[n3] = n2.c("sk" + n3);
                        if (!bl) {
                            if (!bl) continue;
                        }
                        break block10;
                    }
                    n4 = n2.b("pitypes");
                }
                for (n3 = 0; n3 < n4; ++n3) {
                    ab.Xb[n3] = n2.c("picount" + n3);
                    ab.Zb[n3] = n2.e("piknown" + n3);
                    if (!bl) {
                        if (!bl) continue;
                    }
                    break block11;
                }
                ab.Ob = n2.b("primr");
                ab.Pb = n2.b("secnd");
                ab.ic = n2.b("lc");
                n2.c();
            }
            return;
        }
        catch (a a2) {
            n2.c();
            return;
        }
        catch (Exception exception) {
            ab.e();
            qb.t();
            return;
        }
    }

    private static void q() {
        boolean bl = ab.xc;
        ab.f();
        n n2 = new n("btautosave", true);
        try {
            block11: {
                int n3;
                int n4;
                block10: {
                    block9: {
                        k = ab.Rb = n2.c("btcoins");
                        n4 = n2.b("wtypes");
                        for (n3 = 0; n3 < n4; ++n3) {
                            ab.jc[n3] = n2.c("wcount" + n3);
                            qb.h[n3] = ab.jc[n3];
                            if (!bl) {
                                if (!bl) continue;
                            }
                            break block9;
                        }
                        n4 = n2.b("sks");
                    }
                    for (n3 = 0; n3 < n4; ++n3) {
                        ab.kc[n3] = n2.c("sk" + n3);
                        qb.j[n3] = ab.kc[n3];
                        if (!bl) {
                            if (!bl) continue;
                        }
                        break block10;
                    }
                    n4 = n2.b("pitypes");
                }
                for (n3 = 0; n3 < n4; ++n3) {
                    ab.lc[n3] = n2.c("picount" + n3);
                    qb.i[n3] = ab.lc[n3];
                    if (!bl) {
                        if (!bl) continue;
                    }
                    break block11;
                }
                ab.mc = n2.c("bm");
                n2.c();
            }
            return;
        }
        catch (a a2) {
            n2.c();
            return;
        }
        catch (Exception exception) {
            ab.f();
            qb.u();
            return;
        }
    }

    public static void r() {
        new pc().start();
    }

    private static void s() {
        n n2 = new n("settings", false);
        n2.b("first", ab.e);
        n2.b("music volume", ab.Eb);
        n2.b("sfx volume", ab.Fb);
        n2.b("vibra", ab.Ib);
        n2.b("gfx level", ab.Jb);
        n2.b("nickname", ab.Kb);
        n2.b("bots", ab.Lb);
        n2.b("map id", ab.Mb);
        n2.b("mp mode", ab.Nb);
        n2.b("music on", ab.Gb);
        n2.b("sfx on", ab.Hb);
        n2.b("blood", ab.cc);
        n2.b("country", ab.wb);
        n2.b("lang", ab.xb);
        n2.b("need update", ab.yb);
        n2.b("last update", ab.zb);
        n2.b("version", ab.f);
        n2.b("rk", "bogesobe");
        n2.b("gk", ab.Bb);
        n2.b("team color", ab.ec);
        n2.b("bots level", ab.dc);
        n2.b("friendly fire", ab.gc);
        n2.b("team balance", ab.fc);
        n2.b("sound detail", ab.hc);
        n2.b("tips", ab.Db);
        n2.b("weather", ab.Cb);
        n2.b("wshelp", ab.g);
        n2.b();
        n2.c();
    }

    public static void c(q q2) {
        block9: {
            int n2;
            boolean bl;
            block8: {
                block7: {
                    bl = ab.xc;
                    if (ab.l != 0) {
                        return;
                    }
                    for (n2 = 0; n2 < 14; ++n2) {
                        ab.Vb[n2] = q2.Yb[n2];
                        if (!bl) {
                            if (!bl) continue;
                        }
                        break block7;
                    }
                    n2 = 0;
                }
                while (n2 < 11) {
                    ab.Wb[n2] = q2.ac[n2];
                    ++n2;
                    if (!bl) {
                        if (!bl) continue;
                    }
                    break block8;
                }
                n2 = 0;
            }
            while (n2 < 6) {
                ab.Xb[n2] = q2.dc[n2];
                ++n2;
                if (!bl) {
                    if (!bl) continue;
                }
                break block9;
            }
            ab.Ob = (byte)q2.bc;
            ab.Pb = (byte)q2.cc;
            ab.Qb = q2.C;
            qb.t();
        }
    }

    public static void d(q q2) {
        q q3;
        block10: {
            int n2;
            boolean bl = ab.xc;
            for (n2 = 0; n2 < 14; ++n2) {
                q3 = q2;
                if (!bl) {
                    if (q3 != null) {
                        qb.h[n2] = q2.Yb[n2];
                    }
                    ab.jc[n2] = h[n2];
                    if (!bl) continue;
                }
                break block10;
            }
            for (n2 = 0; n2 < 11; ++n2) {
                q3 = q2;
                if (!bl) {
                    if (q3 != null) {
                        qb.j[n2] = q2.ac[n2];
                    }
                    ab.kc[n2] = j[n2];
                    if (!bl) continue;
                }
                break block10;
            }
            for (n2 = 0; n2 < 6; ++n2) {
                q3 = q2;
                if (!bl) {
                    if (q3 != null) {
                        qb.i[n2] = q2.dc[n2];
                    }
                    ab.lc[n2] = i[n2];
                    if (!bl) continue;
                }
                break block10;
            }
            q3 = q2;
        }
        if (q3 != null) {
            k = q2.C;
        }
        ab.Rb = k;
        qb.u();
    }

    public static void t() {
        new qc().start();
    }

    public static void u() {
        new lc().start();
    }

    private void v() {
        this.wc = 1;
        String string = qb.x();
        if (string != null && qb.c(string) && this.b(string)) {
            return;
        }
        this.w();
    }

    private void w() {
        this.wc = 2;
        String string = this.y();
        if (string != null && qb.c(string) && this.b(string)) {
            return;
        }
        if (n) {
            this.b(11);
        }
    }

    private static String x() {
        try {
            RecordStore recordStore = RecordStore.openRecordStore((String)"registration", (boolean)false);
            String string = new String(recordStore.getRecord(1), "UTF-8");
            recordStore.closeRecordStore();
            return string;
        }
        catch (Exception exception) {
            return null;
        }
    }

    private String y() {
        try {
            DataInputStream dataInputStream = new DataInputStream(this.getClass().getResourceAsStream("/reg.txt"));
            byte[] byArray = new byte[dataInputStream.available()];
            dataInputStream.read(byArray);
            return new String(byArray, "UTF-8");
        }
        catch (Exception exception) {
            return null;
        }
    }

    private boolean b(String object) {
        block26: {
            boolean bl = ab.xc;
            Object object2 = rb.b((String)object, '\r');
            int n2 = -1;
            this.xc = new Vector();
            try {
                block31: {
                    block29: {
                        block30: {
                            qb qb2;
                            block25: {
                                boolean bl2;
                                int n3;
                                block24: {
                                    for (n3 = 0; n3 < ((String[])object2).length; ++n3) {
                                        String string = object2[n3];
                                        bl2 = string.equals("");
                                        if (!bl) {
                                            if (bl2) continue;
                                            if (n2 == -1) {
                                                if (string.indexOf("[GameInfo]") != -1) {
                                                    n2 = 0;
                                                    if (!bl) continue;
                                                }
                                                if (string.indexOf("[Countries]") == -1) continue;
                                                n2 = 1;
                                                if (!bl) continue;
                                            }
                                            if (string.indexOf("[end]") != -1) {
                                                n2 = -1;
                                                if (!bl) continue;
                                            }
                                            if (n2 == 0) {
                                                if (this.wc != 0) continue;
                                                if (string.indexOf("no") != -1) {
                                                    ab.yb = false;
                                                    if (!bl) continue;
                                                }
                                                if (string.indexOf("yes") == -1) continue;
                                                ab.yb = true;
                                                if (!bl) continue;
                                            }
                                            if (n2 != 1) continue;
                                            this.xc.addElement(string);
                                            if (!bl) continue;
                                        }
                                        break block24;
                                    }
                                    bl2 = n;
                                }
                                if (bl2) {
                                    ab.zb = System.currentTimeMillis();
                                    qb.r();
                                }
                                if (this.xc.size() == 0) {
                                    return false;
                                }
                                this.B = 0;
                                for (n3 = 0; n3 < this.xc.size(); ++n3) {
                                    qb2 = this;
                                    if (!bl) {
                                        object2 = (String)qb2.xc.elementAt(n3);
                                        if ((object2 = rb.b((String)object2, ";".charAt(0))) != null && (((String[])object2).length >= 10 || this.wc == 3)) {
                                            if (Integer.parseInt(object2[1]) != ab.wb) continue;
                                            this.B = n3 + 2;
                                            if (!bl) continue;
                                        }
                                        this.xc.removeElementAt(n3);
                                        --n3;
                                        if (!bl) continue;
                                    }
                                    break block25;
                                }
                                if (!n) break block26;
                                qb2 = this;
                            }
                            object2 = object;
                            object = qb2;
                            try {
                                RecordStore recordStore;
                                block28: {
                                    block27: {
                                        recordStore = RecordStore.openRecordStore((String)"registration", (boolean)true);
                                        object2 = object2.getBytes("UTF-8");
                                        if (recordStore.getNextRecordID() != 1) break block27;
                                        recordStore.addRecord((byte[])object2, 0, ((String[])object2).length);
                                        if (!bl) break block28;
                                    }
                                    recordStore.setRecord(1, (byte[])object2, 0, ((String[])object2).length);
                                }
                                recordStore.closeRecordStore();
                                ((qb)object).J = true;
                            }
                            catch (Exception exception) {}
                            if (this.xc.size() != 1) break block29;
                            this.zc = rb.b((String)this.xc.elementAt(0), ";".charAt(0));
                            if (this.p) break block30;
                            this.yc = 2;
                            if (!bl) break block31;
                        }
                        this.yc = 6;
                        if (!bl) break block31;
                    }
                    this.yc = 1;
                }
                this.z();
            }
            catch (Exception exception) {
                return false;
            }
        }
        return true;
    }

    private void z() {
        block30: {
            int n2;
            boolean bl;
            block35: {
                Object object;
                block42: {
                    block44: {
                        String string;
                        block43: {
                            block41: {
                                block40: {
                                    block39: {
                                        block36: {
                                            block38: {
                                                String string2;
                                                block37: {
                                                    block33: {
                                                        block34: {
                                                            block29: {
                                                                block32: {
                                                                    block31: {
                                                                        bl = ab.xc;
                                                                        ab.o = true;
                                                                        if (!this.p) break block31;
                                                                        this.Rb = 42;
                                                                        if (!bl) break block32;
                                                                    }
                                                                    this.Rb = 0;
                                                                }
                                                                this.H = null;
                                                                n2 = 1;
                                                                this.Db[0] = new gb(0, this, -1, -1);
                                                                if (this.yc != 1) break block33;
                                                                this.G = true;
                                                                this.Cb = this.xc.size() + 2;
                                                                for (int i2 = 0; i2 < this.xc.size(); ++i2) {
                                                                    n2 = ";".charAt(0);
                                                                    object = (String)this.xc.elementAt(i2);
                                                                    String[] stringArray = rb.b((String)object, (char)n2);
                                                                    this.Db[i2 + 2] = new gb(i2 + 2, this, 50, 0, stringArray[0]);
                                                                    if (!bl) {
                                                                        if (!bl) continue;
                                                                    }
                                                                    break block29;
                                                                }
                                                                if (this.B <= 0) break block29;
                                                                n2 = this.B;
                                                                if (!bl) break block34;
                                                            }
                                                            n2 = 2;
                                                        }
                                                        this.Db[1] = new gb(1, this, 62, 0);
                                                        if (!bl) break block35;
                                                    }
                                                    if (this.yc != 2) break block36;
                                                    this.G = ib.c || this.zc[2].equals("1");
                                                    string2 = ".";
                                                    if (this.zc[7].substring(this.zc[7].length() - 1, this.zc[7].length()).equals(".")) {
                                                        string2 = "";
                                                    }
                                                    this.Cb = 4;
                                                    if (!this.G) break block37;
                                                    this.Db[1] = new gb(1, this, 54, 0, ib.c(25) + " \n" + this.zc[3] + " " + qb.n(1) + "\n " + ib.c(26) + " " + this.zc[5] + ". " + ib.c(27) + " " + this.zc[7] + string2);
                                                    if (!bl) break block38;
                                                }
                                                this.Db[1] = new gb(1, this, 54, 0, ib.c(25) + "\n " + ab.C.c + this.zc[3] + " " + qb.n(1) + "\n" + ab.C.b + " " + ib.c(26) + ab.C.c + " " + this.zc[5] + ab.C.b + ". " + ib.c(27) + " " + this.zc[7] + string2);
                                            }
                                            this.Db[2] = new gb(2, this, 52, 0, ib.c(29));
                                            this.Db[3] = new gb(3, this, 53, 0, ib.c(30));
                                            n2 = 2;
                                            if (!bl) break block35;
                                        }
                                        if (this.yc != 3) break block39;
                                        ab.wb = Integer.parseInt(this.zc[1]);
                                        qb.r();
                                        this.Cb = 3;
                                        this.Db[1] = new gb(1, this, 54, 0, ib.c(28) + "\n" + ib.c(34));
                                        this.Db[2] = new gb(2, this, 53, 0, ib.c(30));
                                        n2 = 2;
                                        if (!bl) break block35;
                                    }
                                    if (this.yc != 4) break block40;
                                    this.Cb = 2;
                                    this.Db[1] = new gb(1, this, 54, 0, ib.c(31));
                                    n2 = 1;
                                    if (!bl) break block35;
                                }
                                if (this.yc != 5) break block41;
                                this.Cb = 3;
                                this.Db[1] = new gb(1, this, 54, 0, ib.c(32));
                                this.Db[2] = new gb(2, this, 53, 0, ib.c(30));
                                n2 = 2;
                                if (!bl) break block35;
                            }
                            if (this.yc != 6) break block42;
                            this.G = ib.c || this.zc[2].equals("1");
                            string = ".";
                            if (this.zc[7].substring(this.zc[7].length() - 1, this.zc[7].length()).equals(".")) {
                                string = "";
                            }
                            this.Cb = 3;
                            if (!this.G) break block43;
                            this.Db[1] = new gb(1, this, 54, 0, ib.c(35) + " " + this.I() + " " + ib.c(36) + ib.c(27) + " " + this.zc[8] + string);
                            if (!bl) break block44;
                        }
                        this.Db[1] = new gb(1, this, 54, 0, ib.c(35) + " " + this.I() + " " + ib.c(36) + ib.c(27) + " " + this.zc[8] + string);
                    }
                    this.Db[2] = new gb(2, this, 52, 0, ib.c(29));
                    n2 = 2;
                    if (!bl) break block35;
                }
                if (this.yc == 7) {
                    this.Cb = 2;
                    this.Db[1] = new gb(1, this, 54, 0, ib.c(28) + "\n" + ib.c(33));
                    n2 = 1;
                    this.Sb = false;
                    object = this;
                    this.a = true;
                    new gc((qb)object).start();
                }
            }
            --this.Cb;
            if (this.yc != 7) {
                this.h(51);
            }
            this.Ib = 0;
            this.Jb = 0;
            for (int i3 = 0; i3 <= this.Cb; ++i3) {
                this.a(i3, true);
                if (!bl) {
                    if (!bl) continue;
                }
                break block30;
            }
            this.Kb = -1;
            ab.o = false;
            this.c(n2);
        }
        if (this.C()) {
            this.Fb = 0;
            this.Hb = 0;
        }
        this.c();
    }

    private static boolean c(String stringArray) {
        int n2;
        block12: {
            boolean bl = ab.xc;
            String cfr_ignored_0 = "str=" + (String)stringArray;
            try {
                long l2;
                Object object;
                Object object2;
                block13: {
                    Object object3;
                    if (stringArray.equals("")) {
                        return false;
                    }
                    stringArray = rb.b((String)stringArray, '\r');
                    object2 = "";
                    for (object = 0; object < stringArray.length; ++object) {
                        n2 = stringArray[object].indexOf(";");
                        if (!bl) {
                            if (n2 == -1) continue;
                            object2 = (String)object2 + stringArray[object].substring(0, stringArray[object].length() - 10);
                            if (!bl) continue;
                        }
                        break block12;
                    }
                    object2 = ((String)object2).getBytes("UTF-8");
                    l2 = 0L;
                    for (object = 0; object < ((Object)object2).length; ++object) {
                        reference var3_5;
                        block15: {
                            block14: {
                                object3 = object2[object];
                                if (bl) break block13;
                                if (object3 >= 0) break block14;
                                var3_5 = object2[object] + 256;
                                if (!bl) break block15;
                            }
                            var3_5 = object2[object];
                        }
                        l2 += (long)(var3_5 + 719 % var3_5 + object);
                        if (!bl) continue;
                    }
                    l2 = 479001599L % l2;
                    String cfr_ignored_1 = "k=" + (l2 %= 987654321L);
                    object3 = false;
                }
                for (object = (Object)(v205648); object < stringArray.length; ++object) {
                    n2 = stringArray[object].indexOf(";");
                    if (!bl) {
                        if (n2 == -1 || l2 != Long.parseLong((String)(object2 = stringArray[object].substring(stringArray[object].length() - 10, stringArray[object].length())))) continue;
                        return true;
                    }
                    break block12;
                }
            }
            catch (Exception exception) {}
            n2 = 0;
        }
        return n2 != 0;
    }

    private static String n(int n2) {
        int n3;
        String string;
        String string2;
        block12: {
            block11: {
                int n4;
                boolean bl;
                block10: {
                    String string3;
                    block9: {
                        bl = ab.xc;
                        string2 = ab.h;
                        if (string2.length() > 5) {
                            string2 = string2.substring(0, 5);
                        }
                        while (string2.length() < 5) {
                            string3 = "0" + string2;
                            if (!bl) {
                                string2 = string3;
                                if (!bl) continue;
                            }
                            break block9;
                        }
                        string3 = ab.Bb;
                    }
                    String string4 = string3;
                    string = "";
                    for (n3 = 0; n3 < string4.length(); ++n3) {
                        n4 = n3 % 2;
                        if (!bl) {
                            if (n4 != 0) continue;
                            string = string + (9 - Integer.parseInt(string4.substring(n3, n3 + 1)));
                            if (!bl) continue;
                        }
                        break block10;
                    }
                    n4 = m;
                }
                if (n4 == 0) break block11;
                n3 = 2;
                if (!bl) break block12;
            }
            n3 = 1;
        }
        return "bogesobe" + qb.d("" + string2 + n3 + n2) + "r " + qb.d(string);
    }

    private static String d(String object) {
        String string;
        block8: {
            Vector<Integer> vector;
            Vector<Integer> vector2;
            int n2;
            boolean bl;
            block7: {
                bl = ab.xc;
                if (object == null) {
                    return "";
                }
                if (((String)object).equals("")) {
                    return "";
                }
                n2 = Ac.length * Bc.length;
                vector2 = new Vector<Integer>();
                for (long i2 = Long.parseLong((String)object); i2 > 0L; i2 /= (long)n2) {
                    long l2 = i2 % (long)n2;
                    vector = vector2;
                    if (!bl) {
                        vector.addElement(new Integer((int)l2));
                        if (!bl) continue;
                    }
                    break block7;
                }
                vector = vector2;
            }
            object = new int[vector.size()];
            for (n2 = 0; n2 < vector2.size(); ++n2) {
                object[n2] = (Integer)vector2.elementAt(vector2.size() - n2 - 1);
                if (!bl && !bl) continue;
            }
            String string2 = "";
            for (int i3 = 0; i3 < ((Object)object).length; ++i3) {
                string = string2 + Ac[object[i3] / Bc.length] + Bc[object[i3] % Bc.length];
                if (!bl) {
                    string2 = string;
                    if (!bl) continue;
                }
                break block8;
            }
            string = string2;
        }
        return string;
    }

    private void A() {
        this.z = -1;
        this.y = 0;
    }

    public static void b(Graphics graphics, int n2, String string, boolean bl) {
        int n3;
        block6: {
            block5: {
                if (string.equals("") || !bl || ab.D > 132 || ab.E >= 160) break block5;
                n3 = 20;
                if (!ab.xc) break block6;
            }
            int n4 = bb.getWidth() << 1;
            n3 = (ab.E - n4) / 2 - 20;
            int n5 = (ab.D - (bb.getHeight() << 1)) / 2;
            graphics.drawRegion(bb, 0, 0, bb.getWidth(), bb.getWidth(), 0, n5, n3, 0);
            graphics.drawRegion(bb, 0, 0, bb.getWidth(), bb.getWidth(), 5, n5 + bb.getWidth(), n3, 0);
            graphics.drawRegion(bb, 0, 0, bb.getWidth(), bb.getWidth(), 6, n5, n3 + bb.getHeight(), 0);
            graphics.drawRegion(bb, 0, 0, bb.getWidth(), bb.getWidth(), 3, n5 + bb.getWidth(), n3 + bb.getHeight(), 0);
            qb.Q.b = n2;
            Q.b((ab.D - qb.Q.d) / 2, (ab.E - qb.Q.e) / 2 - 20);
            Q.b(graphics);
            n3 += n4 + 4;
        }
        if (!string.equals("") && bl) {
            if (ib.c) {
                graphics.setColor(255, 255, 255);
                b.c(graphics, string, ab.D / 2, n3, ab.D - 12, 2);
                return;
            }
            ab.C.b(graphics, string, ab.D / 2, n3, ab.D - 12, 2);
        }
    }

    public final void B() {
        if (!this.qb) {
            ab.G.b("/midi/music_menu.mid", 1);
        }
    }

    private boolean C() {
        return this.yc == 2 && this.Rb == 0 && this.Jb > ab.E;
    }

    private int D() {
        return this.Jb + this.vb;
    }

    private void E() {
        n n2;
        block19: {
            block18: {
                char c2;
                boolean bl;
                block17: {
                    String string;
                    String string2;
                    block16: {
                        int n3;
                        String string3;
                        block15: {
                            int n4;
                            bl = ab.xc;
                            n2 = new n("settings", true);
                            try {
                                ab.Ab = n2.f("rk");
                            }
                            catch (Exception exception) {
                                ab.Ab = "";
                            }
                            if (ab.Ab == null) {
                                ab.Ab = "";
                            }
                            String string4 = ab.Bb;
                            string2 = "";
                            string3 = "";
                            for (n3 = 0; n3 < string4.length(); ++n3) {
                                n4 = n3 % 2;
                                if (!bl) {
                                    if (n4 != 0) continue;
                                    string2 = string2 + (9 - Integer.parseInt(string4.substring(n3, n3 + 1)));
                                    if (!bl) continue;
                                }
                                break block15;
                            }
                            n4 = n3 = 0;
                        }
                        while (n3 < string2.length()) {
                            string = string3 + (9 - Integer.parseInt(string2.substring(string2.length() - 1 - n3, string2.length() - n3)));
                            if (!bl) {
                                string3 = string;
                                ++n3;
                                if (!bl) continue;
                            }
                            break block16;
                        }
                        string = qb.d(string3);
                    }
                    String string5 = string;
                    string2 = "";
                    for (int i2 = 0; i2 < ab.Ab.length(); ++i2) {
                        c2 = ab.Ab.charAt(i2);
                        if (!bl) {
                            if (c2 == ' ') continue;
                            string2 = string2 + ab.Ab.charAt(i2);
                            if (!bl) continue;
                        }
                        break block17;
                    }
                    c2 = (char)(string5.equals(string2) ? 1 : 0);
                }
                if (c2 == '\u0000') break block18;
                this.s = false;
                if (!bl) break block19;
            }
            this.s = true;
        }
        try {
            n2.c();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void g(boolean bl) {
        ab.l = 1;
        ab.A.b();
        this.sb = false;
        this.Zb = -1;
        this.l(-1);
    }

    public final void F() {
        this.Rb = 63;
        this.i(14);
        this.h(32);
        this.Wb = this.C;
        this.Kb = -1;
    }

    private static void b(Graphics graphics, int n2, int n3) {
        boolean bl = ab.xc;
        int n4 = Y.getWidth();
        int n5 = Y.getHeight();
        int n6 = 0;
        while (n6 < ab.D) {
            block3: {
                for (int i2 = ab.E - n3; i2 < ab.E; i2 += n5) {
                    graphics.drawImage(Y, n6, i2, 0);
                    if (!bl) {
                        if (!bl) continue;
                    }
                    break block3;
                }
                n6 += n4;
            }
            if (!bl) continue;
        }
        graphics.drawImage(Z, (ab.D - Z.getWidth()) / 2 + n2, ab.E - n3 - Z.getHeight(), 0);
    }

    private void h(boolean bl) {
        block42: {
            block37: {
                String string;
                qb qb2;
                block41: {
                    boolean bl2;
                    boolean bl3;
                    block34: {
                        block38: {
                            int n2;
                            String string2;
                            block33: {
                                block36: {
                                    block35: {
                                        bl3 = ab.xc;
                                        this.Rb = 14;
                                        this.Sb = false;
                                        this.Ub = false;
                                        this.p = bl;
                                        if (this.p) break block35;
                                        this.Wb = this.C;
                                        if (!bl3) break block36;
                                    }
                                    this.Wb = 2;
                                }
                                if (ab.j.indexOf("JAD") == -1) break block37;
                                qb2 = this;
                                this.wc = 3;
                                bl2 = true;
                                string = "";
                                string2 = "country1";
                                if (midlet.a.getAppProperty(string2) == null) break block38;
                                n2 = 0;
                                while (midlet.a.getAppProperty(string2 = "country" + (n2 + 1)) != null) {
                                    ++n2;
                                    if (!bl3) {
                                        if (!bl3) continue;
                                    }
                                    break block33;
                                }
                                if (n2 == 0) {
                                    bl2 = false;
                                }
                            }
                            for (int i2 = 0; i2 < n2; ++i2) {
                                block40: {
                                    int n3;
                                    block39: {
                                        string2 = "country" + (i2 + 1);
                                        if (bl3) break block34;
                                        if ((string2 = midlet.a.getAppProperty(string2)) == null) {
                                            bl2 = false;
                                            if (!bl3) break block34;
                                        }
                                        if ((n3 = string2.indexOf(";")) != -1) break block39;
                                        string = string + string2.trim();
                                        if (!bl3) break block40;
                                    }
                                    string = string + string2.substring(0, n3).trim();
                                }
                                string = string + ";" + i2 + ";1;";
                                string2 = "country" + (i2 + 1) + "_text1";
                                if ((string2 = midlet.a.getAppProperty(string2)) == null) {
                                    bl2 = false;
                                    if (!bl3) break block34;
                                }
                                string = string + string2.trim() + " ;";
                                string2 = "country" + (i2 + 1) + "_text2";
                                if ((string2 = midlet.a.getAppProperty(string2)) == null) {
                                    bl2 = false;
                                    if (!bl3) break block34;
                                }
                                string = string + string2.trim() + " ;";
                                string2 = "country" + (i2 + 1) + "_number1";
                                if ((string2 = midlet.a.getAppProperty(string2)) == null) {
                                    bl2 = false;
                                    if (!bl3) break block34;
                                }
                                string = string + string2.trim() + ";";
                                string2 = "country" + (i2 + 1) + "_number2";
                                if ((string2 = midlet.a.getAppProperty(string2)) == null) {
                                    bl2 = false;
                                    if (!bl3) break block34;
                                }
                                string = string + string2.trim() + ";";
                                string2 = "country" + (i2 + 1) + "_cost1";
                                if ((string2 = midlet.a.getAppProperty(string2)) == null) {
                                    bl2 = false;
                                    if (!bl3) break block34;
                                }
                                string = string + string2.trim() + ";";
                                string2 = "country" + (i2 + 1) + "_cost2";
                                if ((string2 = midlet.a.getAppProperty(string2)) == null) {
                                    bl2 = false;
                                    if (!bl3) break block34;
                                }
                                string = string + string2.trim() + ";";
                                string = string + "225;";
                                string = string + '\r';
                                if (!bl3) continue;
                            }
                            if (!bl3) break block34;
                        }
                        bl2 = false;
                    }
                    if (bl2) break block41;
                    qb2.w();
                    if (!bl3) break block42;
                }
                if (!qb2.b("[Countries]\r" + string + "[end]" + '\r')) {
                    qb2.w();
                }
                return;
            }
            if (this.J || ab.j.indexOf("NOGPRS") != -1) {
                this.v();
                return;
            }
            this.I = new rb("http://get.pipyakas.com/pipyaka/pipyaka.php?p=4&dn=" + ab.h + "&vr=" + ab.f + "&build=0" + "&manufacturer=" + lb.b() + "&model=" + lb.c() + "&level_completed=" + ab.Tb + "&hasPointerEvents=" + rc.e + "&cps=" + fb.s + "&fps=" + fb.p, 120000L);
        }
    }

    public final void G() {
        this.b(this.bc, true, m, this.qb, this.d);
    }

    public final int H() {
        if (m && !this.qb) {
            return k;
        }
        return this.bc.C;
    }

    public final void o(int n2) {
        if (m && !this.qb) {
            k += n2;
            return;
        }
        this.bc.C += n2;
        fb.I.j = "^41~" + this.bc.C;
    }

    public final int I() {
        int n2;
        try {
            n2 = Integer.parseInt(this.zc[9]);
        }
        catch (Exception exception) {
            n2 = ab.ic;
        }
        if (n2 == 0) {
            n2 = 200;
        }
        this.Cc = n2;
        try {
            block10: {
                block9: {
                    if (!m) break block9;
                    if (ab.Rb < 700) break block10;
                    n2 += ab.Rb / 50 * 5;
                    if (!ab.xc) break block10;
                }
                if (ab.Qb >= 700) {
                    n2 += ab.Qb / 50 * 5;
                }
            }
            return n2;
        }
        catch (Exception exception) {
            return n2;
        }
    }

    public final void J() {
        this.l(-2);
    }

    public final void K() {
        block15: {
            block17: {
                block18: {
                    char c2;
                    boolean bl;
                    block16: {
                        int n2;
                        String string;
                        String string2;
                        n n3;
                        block14: {
                            int n4;
                            bl = ab.xc;
                            if (ab.Ub < 5) break block17;
                            n3 = new n("settings", true);
                            try {
                                ab.Ab = n3.f("rk");
                                n3.c();
                            }
                            catch (Exception exception) {
                                ab.Ab = "";
                            }
                            if (ab.Ab == null) {
                                ab.Ab = "";
                            }
                            String string3 = ab.Bb;
                            string2 = "";
                            string = "";
                            for (n2 = 0; n2 < string3.length(); ++n2) {
                                n4 = n2 % 2;
                                if (!bl) {
                                    if (n4 != 0) continue;
                                    string2 = string2 + (9 - Integer.parseInt(string3.substring(n2, n2 + 1)));
                                    if (!bl) continue;
                                }
                                break block14;
                            }
                            n4 = n2 = 0;
                        }
                        while (n2 < string2.length()) {
                            string = string + (9 - Integer.parseInt(string2.substring(string2.length() - 1 - n2, string2.length() - n2)));
                            ++n2;
                            if (!bl) {
                                if (!bl) continue;
                            }
                            break block15;
                        }
                        String string4 = qb.d(string);
                        string2 = "";
                        for (int i2 = 0; i2 < ab.Ab.length(); ++i2) {
                            c2 = ab.Ab.charAt(i2);
                            if (!bl) {
                                if (c2 == ' ') continue;
                                string2 = string2 + ab.Ab.charAt(i2);
                                if (!bl) continue;
                            }
                            break block16;
                        }
                        try {
                            n3.c();
                        }
                        catch (Exception exception) {}
                        c2 = (char)(string4.equals(string2) ? 1 : 0);
                    }
                    if (c2 == '\u0000') break block18;
                    this.l(ab.Ub);
                    if (!bl) break block15;
                }
                this.l(-3);
                return;
            }
            this.l(ab.Ub);
        }
    }

    public final void L() {
        int n2 = this.c.f;
        this.c.c();
        this.c = null;
        if (n2 == 3) {
            this.c(this.Wb);
            return;
        }
        if (n2 == 7) {
            this.h(false);
        }
    }

    private void M() {
        ab.o = true;
        this.c = new tb();
        this.c.f = 7;
        qb.Q.b = 4;
        this.c.b(Q);
        this.c.b(ib.c(64));
        this.c.b();
        ab.o = false;
    }

    static boolean b(qb qb2) {
        return qb2.mc;
    }

    static int c(qb qb2) {
        return qb2.nc;
    }

    static int d(qb qb2) {
        return qb2.oc;
    }

    static void e(qb qb2) {
        qb2.E();
    }

    static boolean f(qb qb2) {
        return qb2.qc;
    }

    static cb g(qb qb2) {
        return qb2.Xb;
    }

    static cb b(qb qb2, cb cb2) {
        qb2.Xb = null;
        return null;
    }

    static boolean h(qb qb2) {
        return qb2.rc;
    }

    static boolean i(qb qb2) {
        return qb2.sc;
    }

    static boolean b(qb qb2, boolean bl) {
        qb2.Sb = false;
        return false;
    }

    static boolean j(qb qb2) {
        return qb2.tc;
    }

    static boolean c(qb qb2, boolean bl) {
        qb2.sc = false;
        return false;
    }

    static boolean d(qb qb2, boolean bl) {
        qb2.tc = false;
        return false;
    }

    static void N() {
        qb.s();
    }

    static int b(qb qb2, int n2) {
        qb2.D = n2;
        return qb2.D;
    }

    static int k(qb qb2) {
        return qb2.Cc;
    }

    static int c(qb qb2, int n2) {
        qb2.E = 0;
        return 0;
    }

    static boolean e(qb qb2, boolean bl) {
        qb2.a = false;
        return false;
    }

    static {
        n = true;
        r = new int[][]{{24, 4}, {28, 14}, {24, 24}, {14, 28}, {4, 24}, {0, 14}, {4, 4}};
        Ac = new String[]{"b", "d", "f", "g", "h", "k", "l", "m", "n", "p", "s", "t", "v", "z"};
        Bc = new String[]{"a", "e", "i", "o", "u"};
    }
}

