/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Font
 *  javax.microedition.lcdui.Image
 *  javax.microedition.midlet.MIDlet
 */
import java.util.Random;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;

public final class ab {
    public static boolean b = false;
    public static boolean c = false;
    public static boolean d = true;
    public static boolean e;
    public static String f;
    public static boolean g;
    public static String h;
    public static String i;
    public static String j;
    public static long k;
    public static int l;
    public static byte m;
    public static boolean n;
    public static boolean o;
    public static boolean p;
    public static int q;
    public static final int[] r;
    public static byte s;
    public static int t;
    public static int u;
    public static boolean v;
    public static boolean w;
    public static int x;
    public static int y;
    public static rc z;
    public static fb A;
    public static qb B;
    public static b C;
    public static int D;
    public static int E;
    public static Font F;
    public static ub G;
    public static int H;
    public static int I;
    public static int J;
    public static int K;
    public static int L;
    public static int M;
    public static int N;
    public static int O;
    public static int P;
    public static int Q;
    public static int R;
    public static int S;
    public static int T;
    public static int U;
    public static int V;
    public static int W;
    public static int X;
    public static int Y;
    public static int Z;
    public static int ab;
    public static int bb;
    public static int cb;
    public static int db;
    private static int eb;
    private static int fb;
    public static final byte[] gb;
    public static final byte[] hb;
    public static int ib;
    public static int jb;
    public static int kb;
    public static int lb;
    public static int mb;
    public static int nb;
    public static int ob;
    public static int pb;
    public static int qb;
    public static int rb;
    public static int sb;
    public static int tb;
    public static int ub;
    public static int vb;
    public static int wb;
    public static int xb;
    public static boolean yb;
    public static long zb;
    public static String Ab;
    public static String Bb;
    public static boolean Cb;
    public static boolean Db;
    public static int Eb;
    public static int Fb;
    public static boolean Gb;
    public static boolean Hb;
    public static boolean Ib;
    public static boolean Jb;
    public static String Kb;
    public static int Lb;
    public static int Mb;
    public static int Nb;
    public static byte Ob;
    public static byte Pb;
    public static int Qb;
    public static int Rb;
    public static long Sb;
    public static byte Tb;
    public static byte Ub;
    public static int[] Vb;
    public static int[] Wb;
    public static int[] Xb;
    public static boolean[] Yb;
    public static boolean[] Zb;
    public static int bc;
    public static boolean cc;
    public static byte dc;
    public static byte ec;
    public static byte fc;
    public static boolean gc;
    public static boolean hc;
    public static int ic;
    public static int[] jc;
    public static int[] kc;
    public static int[] lc;
    public static int mc;
    public static boolean nc;
    public static Random oc;
    public static int pc;
    public static int qc;
    public static int rc;
    public static int sc;
    public static byte tc;
    public static byte uc;
    public static byte vc;
    private static String wc;
    public static boolean xc;

    public static void b() {
        C = new b("/font/font.png", "/font/font.txt", "/font/font.cfg", null);
        new b("/font/font.png", "/font/font.txt", "/font/font.cfg", null).d = "`1~";
        ab.C.c = "`0~";
        b.m = ab.b("font/numbers_big.png", 14, 17);
        b.b();
    }

    public static void c() {
        bb = (int)Runtime.getRuntime().totalMemory() / 1000;
        if (bb - (cb = (int)Runtime.getRuntime().freeMemory() / 1000) > db) {
            db = bb - cb;
        }
        if (eb == 0) {
            eb = Display.getDisplay((MIDlet)midlet.a).numColors();
        }
        if (fb == 0) {
            fb = Display.getDisplay((MIDlet)midlet.a).numAlphaLevels();
        }
    }

    public static void d() {
        block11: {
            String string;
            String string2;
            boolean bl;
            block10: {
                bl = xc;
                g = true;
                e = true;
                jb = -6;
                kb = -7;
                lb = -21;
                mb = -22;
                nb = 56;
                ob = 52;
                pb = 50;
                qb = 54;
                rb = 53;
                ub = 48;
                vb = 48;
                sb = 42;
                tb = 42;
                ib = 49;
                Ib = true;
                Nb = 0;
                m = 0;
                n = false;
                Lb = 0;
                Mb = 0;
                Db = true;
                ec = 0;
                dc = 1;
                gc = false;
                fc = 0;
                Eb = 40;
                Fb = 40;
                Gb = true;
                Hb = true;
                cc = false;
                wb = -1;
                xb = -1;
                yb = false;
                zb = 0L;
                Ab = "";
                string2 = "11111111111111";
                if ("11111111111111".equals("")) {
                    string2 = "" + System.currentTimeMillis();
                }
                if (string2.length() > 14) {
                    string2 = string2.substring(string2.length() - 14, string2.length());
                }
                while (string2.length() < 14) {
                    string = "0" + string2;
                    if (!bl) {
                        string2 = string;
                        if (!bl) continue;
                    }
                    break block10;
                }
                string = "";
            }
            String string3 = string;
            for (int i2 = string2.length() - 1; i2 >= 0; --i2) {
                string3 = string3 + string2.charAt(i2);
                if (!bl) {
                    if (!bl) continue;
                }
                break block11;
            }
            Bb = string3;
            Jb = false;
        }
        try {
            boolean bl = System.getProperty("microedition.platform").toLowerCase().indexOf("ericsson") != -1;
            hc = bl;
            Cb = bl;
            if (bl) {
                Cb = true;
            }
        }
        catch (Exception exception) {
            hc = false;
            Cb = false;
        }
        Jb = true;
        hc = false;
        Cb = false;
        Kb = n.e();
        Kb = ab.c(Kb);
        if (Kb.equals("")) {
            Kb = "Player";
        }
        Kb = Kb.substring(0, 1).toUpperCase() + Kb.substring(1, Kb.length()).toLowerCase();
        ab.e();
        ab.f();
    }

    public static void e() {
        block8: {
            int n2;
            boolean bl;
            block7: {
                block6: {
                    bl = xc;
                    Tb = 0;
                    Ub = 0;
                    Sb = 0L;
                    Vb = new int[14];
                    Yb = new boolean[14];
                    for (n2 = 0; n2 < 14; ++n2) {
                        ab.Vb[n2] = 0;
                        ab.Yb[n2] = false;
                        if (!bl) {
                            if (!bl) continue;
                        }
                        break block6;
                    }
                    ab.Vb[0] = 50;
                    ab.Yb[0] = true;
                    ic = 200;
                    Qb = 0;
                    Wb = new int[11];
                }
                for (n2 = 0; n2 < 11; ++n2) {
                    ab.Wb[n2] = 0;
                    if (!bl) {
                        if (!bl) continue;
                    }
                    break block7;
                }
                Xb = new int[6];
                Zb = new boolean[6];
            }
            for (n2 = 0; n2 < 6; ++n2) {
                ab.Xb[n2] = 0;
                ab.Zb[n2] = false;
                if (!bl) {
                    if (!bl) continue;
                }
                break block8;
            }
            ab.Xb[5] = 3;
            ab.Zb[5] = true;
            Ob = 0;
            Pb = (byte)-1;
            qb.o();
        }
    }

    public static void f() {
        int n2;
        boolean bl;
        block6: {
            block5: {
                bl = xc;
                qb.h = new int[14];
                qb.i = new int[6];
                qb.j = new int[11];
                Rb = 0;
                qb.k = 0;
                jc = new int[14];
                for (n2 = 0; n2 < 14; ++n2) {
                    qb.h[n2] = hb.g[n2];
                    ab.jc[n2] = hb.g[n2];
                    if (!bl) {
                        if (!bl) continue;
                    }
                    break block5;
                }
                mc = 0;
                kc = new int[11];
            }
            for (n2 = 0; n2 < 11; ++n2) {
                ab.kc[n2] = 0;
                qb.j[n2] = 0;
                if (!bl) {
                    if (!bl) continue;
                }
                break block6;
            }
            lc = new int[6];
        }
        for (n2 = 0; n2 < 6; ++n2) {
            qb.i[n2] = hb.h[n2];
            ab.lc[n2] = hb.h[n2];
            if (!bl) continue;
        }
    }

    public static boolean g() {
        if (fb.L == 0) {
            return true;
        }
        return m == 1 || m == 2;
    }

    public static byte[] b(int n2) {
        byte[] byArray = new byte[4];
        byte[] byArray2 = byArray;
        byArray[3] = (byte)n2;
        byArray2[2] = (byte)(n2 >> 8 & 0xFF);
        byArray2[1] = (byte)(n2 >> 16 & 0xFF);
        byArray2[0] = n2 >> 24;
        return byArray2;
    }

    public static int b(byte[] byArray) {
        return ab.b(byArray[0], byArray[1], byArray[2], byArray[3]);
    }

    public static int b(byte by, byte by2, byte by3, byte by4) {
        int[] nArray = new int[4];
        int[] nArray2 = nArray;
        nArray[0] = by & 0xFF;
        nArray2[1] = by2 & 0xFF;
        nArray2[2] = by3 & 0xFF;
        nArray2[3] = by4 & 0xFF;
        int n2 = (nArray2[0] << 24) + (nArray2[1] << 16) + (nArray2[2] << 8) + nArray2[3];
        by = (byte)n2;
        return n2;
    }

    public static byte[] b(int[] nArray) {
        byte[] byArray;
        block3: {
            boolean bl = xc;
            byte[] byArray2 = new byte[nArray.length << 2];
            int n2 = 0;
            int n3 = 0;
            while (n3 < nArray.length) {
                block4: {
                    byArray = ab.b(nArray[n3]);
                    if (bl) break block3;
                    byte[] byArray3 = byArray;
                    for (int i2 = 0; i2 < 4; ++i2) {
                        byArray2[n2] = byArray3[i2];
                        ++n2;
                        if (!bl) {
                            if (!bl) continue;
                        }
                        break block4;
                    }
                    ++n3;
                }
                if (!bl) continue;
            }
            byArray = byArray2;
        }
        return byArray;
    }

    public static int[] c(byte[] byArray) {
        int[] nArray;
        block2: {
            boolean bl = xc;
            int[] nArray2 = new int[byArray.length / 4];
            int n2 = 0;
            for (int i2 = 0; i2 < nArray2.length; ++i2) {
                nArray = nArray2;
                if (!bl) {
                    nArray[i2] = ab.b(byArray[n2], byArray[n2 + 1], byArray[n2 + 2], byArray[n2 + 3]);
                    n2 += 4;
                    if (!bl) continue;
                }
                break block2;
            }
            nArray = nArray2;
        }
        return nArray;
    }

    public static boolean b(int n2, int n3, int n4, int n5, int n6, int n7) {
        return n2 >= 0 && n3 >= 0 && n2 <= n6 + 0 && n3 <= n7 + 0;
    }

    public static pb b(String string, int n2, int n3) {
        Image image;
        try {
            image = Image.createImage((String)("/" + string));
        }
        catch (Exception exception) {
            String cfr_ignored_0 = "11111111111111" + string;
            return null;
        }
        try {
            pb pb2 = new pb(image, n2, n3);
            return pb2;
        }
        catch (Exception exception) {
            String cfr_ignored_1 = "11111111111111" + string;
            return null;
        }
    }

    public static void h() {
        if (!ub.c) {
            return;
        }
        R = G.b("/explosion.wav", 1, 200);
        N = G.b("/jump.wav", 1, 190);
        T = G.b("/heal.wav", 1, 180);
        I = G.b("/open.wav", 1, 170);
        Z = G.b("/denied.wav", 1, 175);
        Q = G.b("/egg.wav", 0, 160);
        ab = G.b("/thunder.wav", 1, 155);
        V = G.b("/put.wav", 0, 150);
        W = G.b("/rake.wav", 1, 140);
        U = G.b("/infect.wav", 1, 130);
        O = G.b("/buy.wav", 0, 120);
        S = G.b("/get.wav", 0, 110);
        P = G.b("/boink.wav", 0, 100);
        L = G.b("/death1.wav", 0, 70);
        M = G.b("/death2.wav", 0, 70);
        J = G.b("/pain1.wav", 0, 50);
        K = G.b("/pain2.wav", 0, 50);
        Y = G.b("/throw.wav", 0, 30);
        H = G.b("/move.wav", 0, 20);
        X = G.b("/step.wav", 0, 10);
    }

    public static int i() {
        if (Hb) {
            return Fb;
        }
        return 0;
    }

    public static int j() {
        if (Gb) {
            return Eb;
        }
        return 0;
    }

    public static void b(String string) {
        wc = wc + string + " ";
    }

    public static void k() {
        new dc().start();
    }

    public static String b(String string, int n2, b b2) {
        String string2;
        block5: {
            String string3;
            String string4;
            boolean bl = xc;
            if (b2.b(string) <= n2) {
                return string;
            }
            int n3 = string.indexOf(b.g);
            if (n3 < 0) {
                string4 = string;
                string3 = "";
            } else {
                string4 = string.substring(0, n3);
                string3 = string.substring(n3, string.length());
            }
            n2 -= b2.b(string3);
            n2 -= b2.b("...");
            string = "";
            for (int i2 = 0; i2 < string4.length(); ++i2) {
                string2 = string + string4.charAt(i2);
                if (!bl) {
                    string = string2;
                    if (b2.b(string) <= n2) continue;
                    string = string.substring(0, string.length() - 1) + "...";
                    if (!bl) break;
                    if (!bl) continue;
                }
                break block5;
            }
            string2 = string + string3;
        }
        return string2;
    }

    public static void c(int n2) {
        if (ab.j() != 0 && ub.b) {
            if (n2 == 0 || n2 > 2) {
                G.b("/midi/music_game" + oc.nextInt(2) + ".mid", 0);
                return;
            }
            G.b("/midi/music_game" + (n2 - 1) + ".mid", 0);
        }
    }

    public static String c(String string) {
        String string2;
        block2: {
            boolean bl = xc;
            String string3 = "";
            for (int i2 = 0; i2 < string.length(); ++i2) {
                string2 = string;
                if (!bl) {
                    char c2 = string2.charAt(i2);
                    String string4 = c2 == '\u0430' || c2 == '\u0410' ? "a" : (c2 == '\u0431' || c2 == '\u0411' ? "b" : (c2 == '\u0432' || c2 == '\u0412' ? "v" : (c2 == '\u0433' || c2 == '\u0413' ? "g" : (c2 == '\u0434' || c2 == '\u0414' ? "d" : (c2 == '\u0435' || c2 == '\u0415' ? "e" : (c2 == '\u0451' || c2 == '\u0401' ? "e" : (c2 == '\u0436' || c2 == '\u0416' ? "zh" : (c2 == '\u0437' || c2 == '\u0417' ? "z" : (c2 == '\u0438' || c2 == '\u0418' ? "i" : (c2 == '\u0439' || c2 == '\u0419' ? "j" : (c2 == '\u043a' || c2 == '\u041a' ? "k" : (c2 == '\u043b' || c2 == '\u041b' ? "l" : (c2 == '\u043c' || c2 == '\u041c' ? "m" : (c2 == '\u043d' || c2 == '\u041d' ? "n" : (c2 == '\u043e' || c2 == '\u041e' ? "o" : (c2 == '\u043f' || c2 == '\u041f' ? "p" : (c2 == '\u0440' || c2 == '\u0420' ? "r" : (c2 == '\u0441' || c2 == '\u0421' ? "s" : (c2 == '\u0442' || c2 == '\u0422' ? "t" : (c2 == '\u0443' || c2 == '\u0423' ? "u" : (c2 == '\u0444' || c2 == '\u0424' ? "f" : (c2 == '\u0445' || c2 == '\u0425' ? "h" : (c2 == '\u0446' || c2 == '\u0426' ? "ts" : (c2 == '\u0447' || c2 == '\u0427' ? "ch" : (c2 == '\u0448' || c2 == '\u0428' ? "sh" : (c2 == '\u0449' || c2 == '\u0429' ? "sch" : (c2 == '\u044a' || c2 == '\u042a' ? "" : (c2 == '\u044b' || c2 == '\u042b' ? "y" : (c2 == '\u044c' || c2 == '\u042c' ? "'" : (c2 == '\u044d' || c2 == '\u042d' ? "e" : (c2 == '\u044e' || c2 == '\u042e' ? "ju" : (c2 == '\u044f' || c2 == '\u042f' ? "ja" : "" + c2))))))))))))))))))))))))))))))));
                    string3 = string3 + string4;
                    if (!bl) continue;
                }
                break block2;
            }
            string2 = string3;
        }
        return string2;
    }

    public static String d(int n2) {
        return "campaign/map" + n2 + ".map";
    }

    public static boolean e(int n2) {
        try {
            n2 = ((Object)((Object)midlet.a)).getClass().getResourceAsStream("/maps/" + ab.d(n2)).available() != 0 ? 1 : 0;
        }
        catch (Exception exception) {
            return false;
        }
        return n2 != 0;
    }

    public static void b(int n2, int n3) {
        if (!fb.i() && fb.M && (mc -= n3 * 10 * hb.d[n2] / hb.b[n2]) < 0) {
            mc = 0;
        }
    }

    public static void c(int n2, int n3) {
        if (!fb.i() && fb.M && (mc -= n3 * 10 * hb.e[n2] / hb.c[n2]) < 0) {
            mc = 0;
        }
    }

    public static void f(int n2) {
        if ((mc += n2 * 500) < 0) {
            mc = 0;
        }
    }

    static {
        f = "";
        m = 0;
        o = true;
        p = false;
        q = 0;
        r = new int[]{91, 109};
        s = 1;
        t = -1;
        u = -1;
        v = false;
        w = false;
        x = 0;
        y = 0;
        F = null;
        bb = 0;
        cb = 0;
        db = 0;
        eb = 0;
        fb = 0;
        gb = new byte[]{0, -1, 0, 1};
        hb = new byte[]{1, 0, -1, 0};
        bc = 0;
        nc = false;
        tc = 0;
        uc = (byte)2;
        vc = (byte)3;
        wc = "";
    }
}

