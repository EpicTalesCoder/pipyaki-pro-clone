/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public class o {
    private pb b;
    public int c;
    public int d;
    protected byte e;
    protected byte f;
    public byte g;
    public byte h;
    private byte i;
    private byte j;
    private boolean k;
    public int l;
    public int m;
    public int n;
    private int o;
    private int p;
    public static boolean q;

    public o(byte by, byte by2, int n2, int n3) {
        this.e = by;
        this.f = by2;
        this.c = n2 * 10;
        this.d = n3 * 10;
        this.g = (byte)(n2 / 30);
        this.h = (byte)(n3 / 30);
        this.o = -1;
        this.p = -1;
        if (this.e != -1 && this.f != -1) {
            if (this.e == 0) {
                this.b = fb.ub;
            }
            if (this.e == 1) {
                this.b = fb.vb;
            }
            if (this.e == 2) {
                this.b = fb.wb;
            }
            if (this.e == 3) {
                this.b = fb.zd;
            }
            if (this.e == 4) {
                this.b = fb.Ad;
            }
            if (this.e == 5) {
                this.b = fb.Bd;
            }
            if (this.b != null) {
                this.o = this.b.d;
                this.p = this.b.e;
                return;
            }
            System.out.println("ogr=" + this.e);
        }
    }

    public static int b(int n2, int n3, int n4, int n5) {
        return (int)Math.sqrt((n4 - n2) * (n4 - n2) + (n5 - n3) * (n5 - n3));
    }

    public static boolean b(byte by, byte by2) {
        return by >= 0 && by < fb.Pe && by2 >= 0 && by2 < fb.Qe;
    }

    public final boolean a() {
        return o.b(this.g, this.h);
    }

    public final boolean b() {
        return this.g > 0 && this.g < fb.Pe - 1 && this.h > 0 && this.h < fb.Qe - 1;
    }

    public static boolean c(byte by, byte by2) {
        return by >= fb.Se && by <= fb.Se + fb.Ue && by2 >= fb.Te && by2 <= fb.Te + fb.Ve;
    }

    public final boolean c() {
        byte by = this.h;
        byte by2 = this.g;
        return by2 >= fb.We && by2 <= fb.We + fb.Ye && by >= fb.Xe && by <= fb.Xe + fb.Ze;
    }

    public static boolean c(int n2, int n3, int n4, int n5) {
        if (ab.b(n2 -= fb.Ge, n3 -= fb.He, 0, 0, ab.D, ab.E)) {
            return true;
        }
        if (ab.b(n2 - n4 / 2, n3 - n5 / 2, 0, 0, ab.D, ab.E)) {
            return true;
        }
        if (ab.b(n2 + n4 / 2, n3 - n5 / 2, 0, 0, ab.D, ab.E)) {
            return true;
        }
        if (ab.b(n2 + n4 / 2, n3 + n5 / 2, 0, 0, ab.D, ab.E)) {
            return true;
        }
        if (ab.b(n2 - n4 / 2, n3 + n5 / 2, 0, 0, ab.D, ab.E)) {
            return true;
        }
        if (n4 >= ab.D || n5 >= ab.E) {
            if (n3 - n5 / 2 >= 0 && n3 - n5 / 2 <= ab.E && n2 - n4 / 2 <= 0 && n2 + n4 / 2 >= ab.D) {
                return true;
            }
            if (n3 + n5 / 2 >= 0 && n3 + n5 / 2 <= ab.E && n2 - n4 / 2 <= 0 && n2 + n4 / 2 >= ab.D) {
                return true;
            }
            if (n2 - n4 / 2 >= 0 && n2 - n4 / 2 <= ab.D && n3 - n5 / 2 <= 0 && n3 + n5 / 2 >= ab.E) {
                return true;
            }
            if (n2 + n4 / 2 >= 0 && n2 + n4 / 2 <= ab.D && n3 - n5 / 2 <= 0 && n3 + n5 / 2 >= ab.E) {
                return true;
            }
        }
        return false;
    }

    public boolean d() {
        Object object;
        if (this.o == -1 || this.p == -1) {
            try {
                throw new Exception("ERROR: only object class can use this function. u can initialize w & h params in subclass constructor of object");
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
            }
        }
        o o2 = this;
        object = o2;
        object = this;
        return o.c(o2.c / 10, ((o)object).d / 10, this.o, this.p);
    }

    public boolean e() {
        return this.l != 0 || this.m != 0;
    }

    public final boolean g() {
        boolean bl = this.k;
        this.k = false;
        return bl;
    }

    public final void b(int n2, int n3) {
        this.c = n2 * 10;
        this.d = n3 * 10;
    }

    public void d(byte by, byte by2) {
        this.g = by;
        this.h = by2;
        this.b(by * 30 + 15, by2 * 30 + 15);
    }

    public void h() {
        this.c += this.l;
        this.d += this.m;
        if (fb.kb % 3L == 0L) {
            this.n = (int)Math.sqrt(this.l * this.l + this.m * this.m);
        }
        this.g = (byte)(this.c / 10 / 30);
        this.h = (byte)(this.d / 10 / 30);
        if (this.i != this.g || this.j != this.h) {
            this.k = true;
            this.i = this.g;
            this.j = this.h;
        }
    }

    public void b(Graphics graphics) {
        int n2 = -fb.Ge;
        int n3 = -fb.He;
        if (this.b != null) {
            this.b.b = this.f;
            o o2 = this;
            o o3 = o2;
            o3 = this;
            this.b.b(o2.c / 10 - this.o / 2 + n2, o3.d / 10 - this.p / 2 + n3);
            this.b.b(graphics);
        }
    }
}

