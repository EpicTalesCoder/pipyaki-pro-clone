/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class bb {
    public static gb b;
    private static int c;
    private static int d;
    private static int e;
    private static int f;
    private static int g;
    private static int h;
    private static int i;
    private static int j;
    private static int k;
    private static int l;
    private static int m;
    private static int n;
    private static pb o;
    private static pb p;
    private static qb q;
    private static int r;
    private static int s;
    private static int t;
    private static int u;
    private static int v;
    private static int w;
    private static boolean x;

    public static void b(qb qb2) {
        q = qb2;
        try {
            qb2 = Image.createImage((String)"/menu/keyboard.png");
            o = new pb((Image)qb2);
            qb2 = Image.createImage((String)"/menu/keyb2.png");
            p = new pb((Image)qb2, 65, 37);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void b(int n2) {
        String string;
        boolean bl;
        block19: {
            block29: {
                boolean bl2;
                block27: {
                    block28: {
                        int n3;
                        block25: {
                            block26: {
                                block22: {
                                    block24: {
                                        block23: {
                                            block20: {
                                                block21: {
                                                    block17: {
                                                        block18: {
                                                            bl2 = ab.xc;
                                                            n3 = rc.b.getGameAction(n2);
                                                            bl = false;
                                                            string = bb.b.u;
                                                            if (n3 != 1 && n2 != 50) break block17;
                                                            if (d != 39) break block18;
                                                            d = 35;
                                                            if (!bl2) break block19;
                                                        }
                                                        if ((d -= 10) >= 0) break block19;
                                                        d = 0;
                                                        if (!bl2) break block19;
                                                    }
                                                    if (n3 != 6 && n2 != 56) break block20;
                                                    if (d != 29) break block21;
                                                    d = 38;
                                                    if (!bl2) break block19;
                                                }
                                                if ((d += 10) <= e) break block19;
                                                d = e;
                                                if (!bl2) break block19;
                                            }
                                            if (n3 != 2 && n2 != 52) break block22;
                                            if (d != 39) break block23;
                                            d = 31;
                                            if (!bl2) break block19;
                                        }
                                        if (d != 0) break block24;
                                        d = 1;
                                        if (!bl2) break block19;
                                    }
                                    if (--d >= 0) break block19;
                                    d = 0;
                                    if (!bl2) break block19;
                                }
                                if (n3 != 5 && n2 != 54) break block25;
                                if (d != 38) break block26;
                                d = 30;
                                if (!bl2) break block19;
                            }
                            if (++d <= e) break block19;
                            d = e;
                            if (!bl2) break block19;
                        }
                        if (n3 != 8 && n2 != 53) break block27;
                        if (d != 0) break block28;
                        bl = true;
                        if (!bl2) break block19;
                    }
                    if (d == 30) {
                        if (string.length() >= g) {
                            q.d(true);
                            return;
                        }
                    } else if (string.length() < f || bb.q.Rb != 33) {
                        String string2 = "_1234567890qwertyuiopasdfghjkl_zxcvbnm- ";
                        if (!x || d <= 10) {
                            string = string.concat(string2.charAt(d) + "");
                        }
                    }
                    break block19;
                }
                if (n2 != c) break block29;
                bl = true;
                if (!bl2) break block19;
            }
            if (n2 == ab.jb || n2 == ab.kb || n2 == ab.lb || n2 == ab.mb) {
                q.d(false);
                return;
            }
        }
        bb.a();
        if (bl && string.length() > 0) {
            string = string.substring(0, string.length() - 1);
        }
        if (string.equals("") || bb.q.Rb != 33) {
            bb.b.u = string;
            return;
        }
        if (string.length() == 1) {
            bb.b.u = string.toUpperCase();
            return;
        }
        bb.b.u = string.substring(0, 1).toUpperCase() + string.substring(1, string.length());
    }

    public static void b(gb gb2, boolean bl) {
        b = gb2;
        x = bl;
        int n2 = ab.E > 132 ? (ab.E - bb.o.e - b.c()) / 3 : (ab.E - bb.o.e - b.c() + 20) / 3;
        bb.q.Hb += n2;
        u = ab.E - bb.o.e - n2;
        t = (ab.D - bb.o.d) / 2;
        s = ab.E;
        r = t;
        v = 0;
        w = 0;
        d = 1;
        bb.a();
        h = j;
        i = k;
    }

    private static void a() {
        int n2;
        int n3;
        block6: {
            int n4;
            block11: {
                boolean bl;
                block10: {
                    block9: {
                        block8: {
                            block7: {
                                block5: {
                                    bl = ab.xc;
                                    n3 = u;
                                    n2 = n4 = t;
                                    n = 0;
                                    if (d <= 0 || d > 10) break block5;
                                    n2 = n4 + (d - 1) * 13;
                                    n3 += 13;
                                    if (!bl) break block6;
                                }
                                if (d < 11 || d > 20) break block7;
                                n2 = n4 + (d - 11) * 13;
                                n3 += 26;
                                if (!bl) break block6;
                            }
                            if (d < 21 || d > 29) break block8;
                            n2 = n4 + (d - 21) * 13 + 3;
                            n3 += 39;
                            if (!bl) break block6;
                        }
                        if (d < 31 || d > 38) break block9;
                        n2 = n4 + (d - 31) * 13 + 6;
                        n3 += 52;
                        if (!bl) break block6;
                    }
                    if (d != 30) break block10;
                    n2 = n4 + 104 + 7;
                    n3 += 39;
                    n = 3;
                    if (!bl) break block6;
                }
                if (d != 39) break block11;
                n2 = n4 + (d - 36) * 13;
                n3 += 66;
                n = 1;
                if (!bl) break block6;
            }
            if (d == 0) {
                n2 = n4 + 104;
                --n3;
                n = 2;
            }
        }
        j = n2 - 4;
        k = n3 - 1;
        l = Math.abs(h - j) / 3;
        m = Math.abs(i - k) / 3;
        if (t < 0) {
            n3 = j;
            w = (ab.D / 2 - n3) * 24 / (ab.D / 2);
        }
    }

    public static void b(Graphics graphics) {
        bb.o.b = 0;
        o.b(r + v, s);
        o.b(graphics);
        bb.p.b = n;
        p.b(h + v, i);
        p.b(graphics);
    }

    public static void b() {
        block10: {
            block9: {
                r = (t + r) / 2;
                s = (u + s) / 2;
                v = (v * 3 + w) / 4;
                if (h >= j) break block9;
                if ((h += l) < j) break block10;
                h = j;
                if (!ab.xc) break block10;
            }
            if (h > j && (h -= l) <= j) {
                h = j;
            }
        }
        if (i < k) {
            if ((i += m) >= k) {
                i = k;
                return;
            }
        } else if (i > k && (i -= m) <= k) {
            i = k;
        }
    }

    static {
        c = -8;
        e = 39;
        f = 15;
        g = 1;
        o = null;
        p = null;
    }
}

