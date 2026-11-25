/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;

public final class rc
extends Canvas {
    public static rc b;
    public static Display c;
    private static boolean d;
    public static boolean e;
    public static long f;
    public static boolean g;
    public static int h;
    public static int i;
    public static int j;
    public static boolean k;
    public static boolean l;
    private static int m;
    public boolean n = false;
    private int o = 0;
    private static boolean p;
    private static int q;
    private static int r;
    private static int s;

    public rc() {
        try {
            c = Display.getDisplay((MIDlet)midlet.a);
            c.setCurrent((Displayable)this);
            d = true;
            this.setFullScreenMode(true);
            this.b();
            e = this.hasPointerEvents();
            b = this;
            return;
        }
        catch (Exception exception) {
            midlet.a.b();
            return;
        }
    }

    public final void paint(Graphics graphics) {
        block5: {
            block7: {
                boolean bl;
                block6: {
                    block4: {
                        bl = ab.xc;
                        if (this.n) {
                            return;
                        }
                        this.n = true;
                        graphics.setFont(ab.F);
                        if (ab.l != 0 || ab.A == null) break block4;
                        ab.A.b(graphics);
                        ab.A.p();
                        if (!bl) break block5;
                    }
                    if (ab.l != 1 || ab.B == null) break block6;
                    ab.B.b(graphics);
                    if (!bl) break block5;
                }
                if (ab.l != 2) break block7;
                wb.b(graphics);
                if (!bl) break block5;
            }
            rc.b(graphics);
        }
        this.n = false;
    }

    public static void b(Graphics graphics) {
        ab.c();
        graphics.setColor(0);
        graphics.fillRect(0, 0, ab.D, ab.E);
        if (ab.q > 0 && qb.M != null) {
            qb.M.b = m % 12;
            qb.M.b(ab.D - qb.M.d - 12, 12);
            qb.M.b(graphics);
            ++m;
        }
    }

    public final void keyPressed(int n2) {
        if (d) {
            if (n2 == -20) {
                n2 = ab.kb;
            }
            if (n2 == -21) {
                return;
            }
            if (ab.l == 0 && ab.A != null) {
                ab.A.c(n2);
                return;
            }
            if (ab.l == 1 && ab.B != null) {
                ab.B.j(n2);
                return;
            }
            if (ab.l == 2) {
                wb.b(n2);
            }
        }
    }

    public final void keyReleased(int n2) {
        if (n2 == -20) {
            n2 = ab.kb;
        }
        if (n2 == -21) {
            return;
        }
        if (ab.l == 0 && ab.A != null) {
            ab.A.d(n2);
            return;
        }
        if (ab.l == 1 && ab.B != null) {
            ab.B.k(n2);
        }
    }

    public final void pointerPressed(int n2, int n3) {
        block19: {
            int n4;
            boolean bl;
            block20: {
                block27: {
                    block28: {
                        block25: {
                            block26: {
                                block23: {
                                    block24: {
                                        block21: {
                                            block22: {
                                                bl = ab.xc;
                                                if (!e) break block19;
                                                if (ab.l == 0 && fb.I != null && fb.I.i != null) {
                                                    if (fb.I.i.g && n3 > ab.E - 2 - qb.b.e) {
                                                        if (n2 < ab.D / 2) {
                                                            fb.I.i.b(ab.jb);
                                                            return;
                                                        }
                                                        fb.I.i.b(ab.kb);
                                                    }
                                                    return;
                                                }
                                                if (ab.l == 1 && ab.B != null && ab.B.c != null) {
                                                    if (ab.B.c.g && n3 > ab.E - 2 - qb.b.e) {
                                                        if (n2 < ab.D / 2) {
                                                            ab.B.c.b(ab.jb);
                                                            return;
                                                        }
                                                        ab.B.c.b(ab.kb);
                                                    }
                                                    return;
                                                }
                                                q = n2;
                                                r = n3;
                                                if (g) {
                                                    f = fb.kb + 50L;
                                                    g = false;
                                                    i = 0;
                                                    h = 2;
                                                    j = -1;
                                                }
                                                n4 = 0;
                                                if (ab.l != 0 && (ab.l != 1 || ab.B.Rb != 34)) break block20;
                                                if (n2 < fb.Id[0] || n2 > fb.Id[0] + ab.D / 2 || n3 < fb.Jd[0] || n3 > 2 * fb.Jd[0] - fb.Jd[1]) break block21;
                                                if (ab.l != 1 || ab.B.Rb != 34) break block22;
                                                n4 = ab.rb;
                                                j = -2;
                                                if (!bl) break block20;
                                            }
                                            n4 = 48;
                                            int n5 = j = !k ? 4 : 0;
                                            if (!bl) break block20;
                                        }
                                        if (fb.i() || n2 < fb.Id[1] || n2 > fb.Id[1] + ab.D / 2 || n3 < fb.Jd[1] || n3 > fb.Jd[0]) break block23;
                                        if (ab.l != 1 || ab.B.Rb != 34) break block24;
                                        n4 = ab.rb;
                                        j = -2;
                                        if (!bl) break block20;
                                    }
                                    n4 = 57;
                                    j = 1;
                                    if (!bl) break block20;
                                }
                                if (n2 < fb.Id[2] || n2 > fb.Id[2] + ab.D / 2 || n3 < fb.Jd[2] || n3 > fb.Jd[2] + fb.Jd[0] - fb.Jd[1]) break block25;
                                if (ab.l != 1 || ab.B.Rb != 34 || n2 < fb.Kd || n2 > fb.Kd + fb.Md || n3 < fb.Ld || n3 > fb.Ld + fb.Nd) break block26;
                                j = -2;
                                if (!bl) break block20;
                            }
                            n4 = 42;
                            j = 2;
                            if (!bl) break block20;
                        }
                        if (n2 < fb.Id[3] || n2 > fb.Id[3] + ab.D / 2 || n3 < fb.Jd[3] || n3 > fb.Jd[3] + fb.Jd[0] - fb.Jd[1]) break block27;
                        if (ab.l != 1 || ab.B.Rb != 34 || n2 < fb.Kd || n2 > fb.Kd + fb.Md || n3 < fb.Ld || n3 > fb.Ld + fb.Nd) break block28;
                        j = -2;
                        if (!bl) break block20;
                    }
                    n4 = 35;
                    j = 3;
                    if (!bl) break block20;
                }
                if (ab.l == 1 && ab.B.Rb == 34) {
                    n4 = ab.rb;
                    j = -2;
                }
            }
            if (ab.l == 1) {
                for (int i2 = 0; i2 < ab.B.Db.length; ++i2) {
                    gb gb2 = ab.B.Db[i2];
                    if (gb2 == null || !gb2.j() || gb2.r() || gb2.o == 54 || gb2.n > ab.B.Cb) continue;
                    if (n2 >= gb2.j && n2 <= gb2.j + gb2.b() && n3 >= gb2.k && n3 <= gb2.k + gb2.c()) {
                        if (gb2.n == ab.B.Kb) {
                            n4 = ab.rb;
                            if (!bl) break;
                        }
                        ab.B.c(gb2.n);
                        n4 = 0;
                        if (!bl) break;
                    }
                    if (n2 >= gb2.j - ab.B.Pb && n2 <= gb2.j && n3 >= gb2.k && n3 <= gb2.k + gb2.c() && (ab.l != 1 || ab.B.Rb != 34)) {
                        if (gb2.n != ab.B.Kb) continue;
                        n4 = ab.ob;
                        if (!bl) break;
                    }
                    if (n2 >= gb2.j + gb2.b() && n2 <= gb2.j + gb2.b() + ab.B.Pb && n3 >= gb2.k && n3 <= gb2.k + gb2.c() && (ab.l != 1 || ab.B.Rb != 34)) {
                        if (gb2.n != ab.B.Kb) continue;
                        n4 = ab.qb;
                        if (!bl) break;
                    }
                    if (n2 >= gb2.j && n2 <= gb2.j + gb2.b() && n3 >= gb2.k - ab.B.Qb && n3 <= gb2.k && (ab.l != 1 || ab.B.Rb != 34)) {
                        if (gb2.n != ab.B.Kb) continue;
                        n4 = ab.pb;
                        if (!bl) break;
                    }
                    if (n2 < gb2.j || n2 > gb2.j + gb2.b() || n3 < gb2.k + gb2.c() || n3 > gb2.k + gb2.c() + ab.B.Qb || ab.l == 1 && ab.B.Rb == 34 || gb2.n != ab.B.Kb) continue;
                    n4 = ab.nb;
                    if (!bl) break;
                    if (!bl) continue;
                }
            }
            this.o = n4;
            if (this.o != 0) {
                this.keyPressed(this.o);
            }
        }
    }

    public final void pointerReleased(int n2, int n3) {
        if (e) {
            if (this.o != 0) {
                this.keyReleased(this.o);
            }
            p = false;
            s = 0;
        }
    }

    public final void pointerDragged(int n2, int n3) {
        if (e) {
            int n4 = n2 - q;
            int n5 = n3 - r;
            if (!(p || n4 == 0 && n5 == 0 || (s += Math.abs(n4) + Math.abs(n5)) <= 25)) {
                p = true;
                s = 0;
            }
            q = n2;
            r = n3;
        }
    }

    public static void b(int n2, int n3) {
        if (ab.Ib && !l && n3 == ab.l) {
            try {
                c.vibrate(n2);
                return;
            }
            catch (Exception exception) {}
        }
    }

    public final void b() {
        ab.D = this.getWidth();
        ab.E = this.getHeight();
    }

    public final void showNotify() {
        if (!l || ab.o) {
            return;
        }
        l = false;
        if (ab.G != null) {
            ab.G.h();
        }
        if (ab.l == 0) {
            ab.A.b(false, false);
        }
    }

    public final void hideNotify() {
        if (l || ab.o) {
            return;
        }
        l = true;
        if (ab.G != null) {
            ab.G.g();
        }
        if (ab.l == 0 && ab.A != null) {
            ab.A.b();
        }
    }

    static {
        e = false;
        f = 0L;
        g = true;
        h = 3;
        i = 0;
        j = -1;
        k = false;
        l = false;
        m = 0;
        p = false;
    }
}

