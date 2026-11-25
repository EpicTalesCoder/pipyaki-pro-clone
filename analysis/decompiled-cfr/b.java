/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Font
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayOutputStream;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class b {
    public String b;
    public String c;
    public String d;
    private static final char e = " ".charAt(0);
    private static final char f = "\n".charAt(0);
    public static final char g = "^".charAt(0);
    private static final char h = "0".charAt(0);
    private static final char i = "9".charAt(0);
    private static final char j = "`".charAt(0);
    private static final char k = "~".charAt(0);
    private static pb l = null;
    public static pb m = null;
    private byte[] n;
    private int o;
    private int[] p;
    private Image q;
    private int[] r;
    private static Vector s;
    private static int[] t;
    private static int[] u;
    private int v;
    public int w;
    public int x;
    private static int y;
    private int z;

    /*
     * Unable to fully structure code
     */
    public b(String var1_1, String var2_5, String var3_8, int[] var4_9) {
        block16: {
            var6_12 = ab.xc;
            super();
            this.b = "`0~";
            this.c = "`0~";
            this.d = "`0~";
            this.v = -2;
            this.w = 1;
            this.x = 5;
            this.z = 0;
            if (b.l == null) {
                b.l = ab.b("menu/digits.png", 8, 11);
            }
            try {
                this.q = Image.createImage((String)var1_1);
            }
            catch (Exception var1_2) {
                "font img: " + var1_2;
                return;
            }
            try {
                var2_5 = this.getClass().getResourceAsStream((String)var2_5);
                var2_5.read();
                var2_5.read();
                var2_5.read();
                var4_9 = new ByteArrayOutputStream();
                var5_13 = new byte[128];
                while ((var1_3 = var2_5.read(var5_13)) > 2) {
                    var4_9.write(var5_13, 0, var1_3 - 2);
                    if (!var6_12) continue;
                }
                var1_4 = new String(var4_9.toByteArray(), "UTF-8");
                var2_5.close();
            }
            catch (Exception var2_6) {
                "font chars: " + var2_6;
                return;
            }
            var2_7 = var1_4.length();
            this.n = new byte[var2_7];
            try {
                var4_9 = this.getClass().getResourceAsStream(var3_8);
                var4_9.read(this.n);
                var4_9.close();
            }
            catch (Exception var4_10) {
                "font widths: " + var4_10;
                return;
            }
            this.p = new int[256];
            for (var4_11 = 0; var4_11 < this.p.length; ++var4_11) {
                this.p[var4_11] = -1;
                if (!var6_12) {
                    if (!var6_12) continue;
                }
                break block16;
            }
            var4_11 = 0;
        }
        while (var4_11 < var2_7) {
            block18: {
                block17: {
                    v0 = b.b(var1_4.charAt(var4_11));
                    v1 = 255;
                    if (var6_12) ** GOTO lbl79
                    if (v0 <= v1) break block17;
                    "" + var5_14 + ": " + var1_4.charAt(var4_11) + " " + var1_4.charAt(var4_11);
                    if (!var6_12) break block18;
                }
                this.p[var5_14] = var4_11;
            }
            ++var4_11;
            if (!var6_12) continue;
        }
        this.o = this.q.getHeight();
        this.r = new int[this.n.length];
        this.r[0] = 0;
        var4_11 = 1;
        do {
            v0 = var4_11;
            v1 = this.n.length;
lbl79:
            // 2 sources

            if (v0 >= v1) break;
            this.r[var4_11] = this.r[var4_11 - 1] + this.n[var4_11 - 1];
            ++var4_11;
        } while (!var6_12);
    }

    public static void b() {
        boolean bl = ab.xc;
        s = new Vector();
        try {
            int n2 = 0;
            while (true) {
                Image image = Image.createImage((String)("/font/icons/ico" + n2 + ".png"));
                s.addElement(image);
                ++n2;
            }
        }
        catch (Exception exception) {
            if (s.size() > 0) {
                t = new int[s.size()];
                u = new int[s.size()];
                for (int i2 = 0; i2 < s.size(); ++i2) {
                    Image image = (Image)s.elementAt(i2);
                    b.t[i2] = image.getWidth();
                    b.u[i2] = image.getHeight();
                    if (!bl) continue;
                }
            }
            return;
        }
    }

    public final int c() {
        return this.o;
    }

    private static int b(char c2) {
        if (c2 >= '\u0401') {
            return c2 + 128 - 1025;
        }
        return c2;
    }

    private int c(char c2) {
        int n2 = b.b(c2);
        c2 = (char)n2;
        if (n2 < 0 || c2 > '\u00ff') {
            return -1;
        }
        return this.p[c2];
    }

    public final int b(String string) {
        int n2;
        block2: {
            boolean bl = ab.xc;
            int n3 = 0;
            for (int i2 = 0; i2 < string.length(); ++i2) {
                n2 = this.c(string.charAt(i2));
                if (!bl) {
                    int n4;
                    if (n2 == -1) continue;
                    n3 += this.n[n4] + this.v;
                    if (!bl) continue;
                }
                break block2;
            }
            n2 = n3;
        }
        return n2;
    }

    private boolean b(Graphics object, String string, int n2, int n3, int n4, int n5, boolean n6) {
        boolean bl;
        boolean bl2;
        block16: {
            block15: {
                bl2 = ab.xc;
                b b2 = this;
                if (n3 + b2.o < 0 || n3 > ab.E) {
                    return false;
                }
                if (n5 != 1) break block15;
                n2 -= n4;
                if (!bl2) break block16;
            }
            if (n5 == 2) {
                n2 -= n4 / 2;
            }
        }
        if (n6 == 0) {
            n4 = n3;
            n3 = n2;
            String string2 = string;
            string = object;
            object = this;
            boolean bl3 = false;
            boolean bl4 = false;
            String string3 = "";
            for (n5 = 0; n5 < string2.length(); ++n5) {
                char c2 = string2.charAt(n5);
                bl = bl3;
                if (!bl2) {
                    if (bl) {
                        if (c2 >= h && c2 <= i) {
                            string3 = string3 + c2;
                            if (n5 < string2.length() - 1) continue;
                        }
                        n6 = Integer.parseInt(string3);
                        if (bl4 && n6 < s.size()) {
                            string.drawImage((Image)s.elementAt(n6), n3, n4 - (u[n6] - ((b)object).o) / 2 - 1, 0);
                            n3 += t[n6] + ((b)object).v;
                        }
                        bl3 = false;
                        if (n5 >= string2.length() - 1 || c2 == k) continue;
                        --n5;
                        if (!bl2) continue;
                    }
                    if (c2 == g || c2 == j) {
                        bl4 = c2 == g;
                        bl3 = true;
                        string3 = "";
                        if (!bl2) continue;
                    }
                    if (c2 == e) {
                        n3 += ((b)object).x;
                        if (!bl2) continue;
                    }
                    if (c2 == k || (n6 = super.c(c2)) == -1) continue;
                    string.drawRegion(((b)object).q, ((b)object).r[n6], 0, (int)((b)object).n[n6], ((b)object).o, 0, n3, n4, 0);
                    n3 += ((b)object).n[n6] + ((b)object).v;
                    if (!bl2) continue;
                }
                break;
            }
        } else {
            bl = true;
        }
        return bl;
    }

    public final int b(Graphics graphics, String string, int n2, int n3, int n4, int n5) {
        return this.c(graphics, string, n2, n3, n4, n5, false);
    }

    private int c(Graphics graphics, String string, int n2, int n3, int n4, int n5, boolean bl) {
        boolean bl2;
        int n6;
        block47: {
            int n7;
            int n8;
            String string2;
            block48: {
                String string3;
                int n9;
                boolean bl3;
                block51: {
                    int n10;
                    String string4;
                    block50: {
                        block49: {
                            boolean bl4;
                            block46: {
                                int n11;
                                block29: {
                                    bl3 = ab.xc;
                                    string2 = "";
                                    string4 = "";
                                    n8 = 0;
                                    n10 = 0;
                                    n6 = this.o;
                                    bl4 = false;
                                    int n12 = 0;
                                    boolean bl5 = false;
                                    bl2 = false;
                                    String string5 = "";
                                    for (int i2 = 0; i2 < string.length(); ++i2) {
                                        block39: {
                                            block41: {
                                                block42: {
                                                    String string6;
                                                    block45: {
                                                        block44: {
                                                            block43: {
                                                                block40: {
                                                                    block33: {
                                                                        block38: {
                                                                            block34: {
                                                                                String string7;
                                                                                block37: {
                                                                                    block36: {
                                                                                        block35: {
                                                                                            block30: {
                                                                                                block32: {
                                                                                                    block31: {
                                                                                                        n9 = string.charAt(i2);
                                                                                                        n11 = n12;
                                                                                                        if (bl3) break block29;
                                                                                                        if (n11 == 0) break block30;
                                                                                                        if (n9 >= h && n9 <= i) {
                                                                                                            string5 = string5 + (char)n9;
                                                                                                            if (i2 < string.length() - 1) continue;
                                                                                                        }
                                                                                                        n7 = Integer.parseInt(string5);
                                                                                                        if (!bl5) break block31;
                                                                                                        if (n7 >= s.size()) break block32;
                                                                                                        if (n8 > 0) {
                                                                                                            n8 += this.v;
                                                                                                        }
                                                                                                        n8 += t[n7];
                                                                                                        string2 = string2 + g + string5 + k;
                                                                                                        if (!bl3) break block32;
                                                                                                    }
                                                                                                    string2 = string2 + j + string5 + k;
                                                                                                }
                                                                                                n12 = 0;
                                                                                                if (i2 >= string.length() - 1 || n9 == k) continue;
                                                                                                --i2;
                                                                                                if (!bl3) continue;
                                                                                            }
                                                                                            if (n9 != e) break block33;
                                                                                            if (n8 == 0) {
                                                                                                string4 = string4 + (char)n9;
                                                                                                if (n10 > 0) {
                                                                                                    n10 += this.v;
                                                                                                }
                                                                                                n10 += this.x;
                                                                                                bl4 = false;
                                                                                                if (!bl3) continue;
                                                                                            }
                                                                                            if (n10 <= 0) break block34;
                                                                                            n9 = n10 + n8 + this.v;
                                                                                            if (!bl4) break block35;
                                                                                            n9 += this.x + this.v;
                                                                                            string7 = string4 + " " + string2;
                                                                                            if (!bl3) break block36;
                                                                                        }
                                                                                        string7 = string4 + string2;
                                                                                    }
                                                                                    if (n4 < 0 || n9 <= n4) break block37;
                                                                                    boolean bl6 = this.b(graphics, string4, n2, n3, n10, n5, bl);
                                                                                    bl2 = bl2 || bl6;
                                                                                    n3 += this.o + this.w;
                                                                                    n6 += this.o + this.w;
                                                                                    break block34;
                                                                                }
                                                                                string4 = string7;
                                                                                n10 = n9;
                                                                                if (!bl3) break block38;
                                                                            }
                                                                            string4 = string2;
                                                                            n10 = n8;
                                                                        }
                                                                        bl4 = true;
                                                                        string2 = "";
                                                                        n8 = 0;
                                                                        if (!bl3) continue;
                                                                    }
                                                                    if (n9 != f) break block39;
                                                                    if (n8 != 0) break block40;
                                                                    n7 = this.b(graphics, string4, n2, n3, n10, n5, bl) ? 1 : 0;
                                                                    boolean bl7 = bl2 = bl2 || n7 != 0;
                                                                    if (!bl3) break block41;
                                                                }
                                                                if (n10 <= 0) break block42;
                                                                n9 = n10 + n8 + this.v;
                                                                if (!bl4) break block43;
                                                                n9 += this.x + this.v;
                                                                string6 = string4 + " " + string2;
                                                                if (!bl3) break block44;
                                                            }
                                                            string6 = string4 + string2;
                                                        }
                                                        if (n4 < 0 || n9 <= n4) break block45;
                                                        n7 = this.b(graphics, string4, n2, n3, n10, n5, bl) ? 1 : 0;
                                                        bl2 = bl2 || n7 != 0;
                                                        n6 += this.o + this.w;
                                                        n7 = this.b(graphics, string2, n2, n3 += this.o + this.w, n8, n5, bl) ? 1 : 0;
                                                        bl2 = bl2 || n7 != 0;
                                                        break block41;
                                                    }
                                                    n7 = this.b(graphics, string6, n2, n3, n9, n5, bl) ? 1 : 0;
                                                    boolean bl8 = bl2 = bl2 || n7 != 0;
                                                    if (!bl3) break block41;
                                                }
                                                n7 = this.b(graphics, string2, n2, n3, n8, n5, bl) ? 1 : 0;
                                                bl2 = bl2 || n7 != 0;
                                            }
                                            n3 += this.o + this.w;
                                            n6 += this.o + this.w;
                                            string4 = "";
                                            n10 = 0;
                                            string2 = "";
                                            n8 = 0;
                                            bl4 = false;
                                            if (!bl3) continue;
                                        }
                                        if (n9 == g || n9 == j) {
                                            bl5 = n9 == g;
                                            n12 = 1;
                                            string5 = "";
                                            if (!bl3) continue;
                                        }
                                        if (n9 == k || (n7 = this.c((char)n9)) == -1) continue;
                                        string2 = string2 + (char)n9;
                                        if (n8 > 0) {
                                            n8 += this.v;
                                        }
                                        n8 += this.n[n7];
                                        if (!bl3) continue;
                                    }
                                    n11 = n8;
                                }
                                if (n11 != 0) break block46;
                                n7 = this.b(graphics, string4, n2, n3, n10, n5, bl);
                                boolean bl9 = bl2 = bl2 || n7 != 0;
                                if (!bl3) break block47;
                            }
                            if (n10 <= 0) break block48;
                            n9 = n10 + n8 + this.v;
                            if (!bl4) break block49;
                            n9 += this.x + this.v;
                            string3 = string4 + " " + string2;
                            if (!bl3) break block50;
                        }
                        string3 = string4 + string2;
                    }
                    if (n4 < 0 || n9 <= n4) break block51;
                    boolean bl10 = this.b(graphics, string4, n2, n3, n10, n5, bl);
                    bl2 = bl2 || bl10;
                    n6 += this.o + this.w;
                    bl10 = this.b(graphics, string2, n2, n3 += this.o + this.w, n8, n5, bl);
                    bl2 = bl2 || bl10;
                    break block47;
                }
                boolean bl11 = this.b(graphics, string3, n2, n3, n9, n5, bl);
                boolean bl12 = bl2 = bl2 || bl11;
                if (!bl3) break block47;
            }
            n7 = this.b(graphics, string2, n2, n3, n8, n5, bl) ? 1 : 0;
            boolean bl13 = bl2 = bl2 || n7 != 0;
        }
        if (bl2 || bl) {
            return n6;
        }
        return -1;
    }

    public final int b(String string, int n2) {
        return this.c(null, string, 0, 0, n2, 0, true);
    }

    private static int d(Graphics graphics, String string, int n2, int n3, int n4, int n5, boolean bl) {
        int n6;
        block13: {
            boolean bl2 = ab.xc;
            Font font = ab.F;
            n5 = n5 == 2 ? 17 : (n5 == 1 ? 24 : 0);
            String string2 = "";
            String string3 = "";
            int n7 = font.getHeight();
            int n8 = 0;
            int n9 = 0;
            for (int i2 = 0; i2 <= string.length(); ++i2) {
                char c2;
                block15: {
                    block14: {
                        n6 = i2;
                        if (bl2) break block13;
                        if (n6 != string.length()) break block14;
                        c2 = f;
                        if (!bl2) break block15;
                    }
                    c2 = string.charAt(i2);
                }
                if (c2 == e || c2 == f) {
                    String string4;
                    int n10 = n9 + n8;
                    if (n9 != 0 && n8 != 0) {
                        n10 += font.charWidth(e);
                        string4 = string2 + " " + string3;
                    } else {
                        string4 = string2 + string3;
                    }
                    if (n10 > n4 && n4 > 0) {
                        if (!bl) {
                            graphics.drawString(string2, n2, n3, n5);
                        }
                        n3 += font.getHeight() + y;
                        n7 += font.getHeight() + y;
                        string2 = string3;
                        n8 = n9;
                    } else {
                        string2 = string4;
                        n8 = n10;
                    }
                    if (c2 == f) {
                        if (!bl) {
                            graphics.drawString(string2, n2, n3, n5);
                        }
                        if (i2 != string.length()) {
                            n3 += font.getHeight() + y;
                            n7 += font.getHeight() + y;
                        }
                        string2 = "";
                        n8 = 0;
                    }
                    string3 = "";
                    n9 = 0;
                    if (!bl2) continue;
                }
                string3 = string3 + c2;
                n9 += font.charWidth(c2);
                if (!bl2) continue;
            }
            n6 = n7;
        }
        return n6;
    }

    public static void c(Graphics graphics, String string, int n2, int n3, int n4, int n5) {
        b.d(graphics, string, n2, n3, n4, n5, false);
    }

    public static int c(String string, int n2) {
        return b.d(null, string, 0, 0, n2, 0, true);
    }

    public static int c(String string) {
        return ab.F.stringWidth(string);
    }

    public static void b(Graphics graphics, String string, int n2, int n3, int n4) {
        boolean bl = ab.xc;
        n2 -= string.length() * b.l.d - (string.length() - 1 << 1);
        for (n4 = 0; n4 < string.length(); ++n4) {
            int n5;
            block6: {
                char c2;
                block8: {
                    block7: {
                        block5: {
                            c2 = string.charAt(n4);
                            n5 = -1;
                            if (c2 < '0' || c2 > '9') break block5;
                            n5 = c2 - 48;
                            if (!bl) break block6;
                        }
                        if (c2 != '+') break block7;
                        n5 = 10;
                        if (!bl) break block6;
                    }
                    if (c2 != '-') break block8;
                    n5 = 11;
                    if (!bl) break block6;
                }
                if (c2 == '/') {
                    n5 = 12;
                }
            }
            if (n5 == -1) continue;
            b.l.b = n5;
            l.b(n2, n3);
            l.b(graphics);
            pb pb2 = l;
            n5 = pb2.d;
            n2 += n5 - 2;
            if (!bl) continue;
        }
    }

    public static void c(Graphics graphics, String string, int n2, int n3, int n4) {
        boolean bl = ab.xc;
        boolean bl2 = false;
        String string2 = "";
        for (int i2 = 0; i2 < string.length(); ++i2) {
            block6: {
                block8: {
                    block7: {
                        char c2 = string.charAt(i2);
                        n4 = c2;
                        if (c2 == g) {
                            bl2 = true;
                            if (!bl) continue;
                        }
                        if (n4 == k) {
                            bl2 = false;
                            Image image = (Image)s.elementAt(Integer.parseInt(string2));
                            graphics.drawImage(image, n2, n3 -= image.getHeight() >> 1, 0);
                            n2 += image.getWidth();
                            n3 += b.m.e >> 1;
                            continue;
                        }
                        if (bl2) break block6;
                        if (n4 != h) break block7;
                        b.m.b = 9;
                        if (!bl) break block8;
                    }
                    b.m.b = n4 - 49;
                }
                m.b(n2, n3);
                m.b(graphics);
                n2 += b.m.d - 4;
                if (!bl) continue;
            }
            string2 = string2 + (char)n4;
            if (!bl) continue;
        }
    }

    static {
        y = -1;
    }
}

