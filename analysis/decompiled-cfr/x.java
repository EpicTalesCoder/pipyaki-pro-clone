/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class x {
    public int b;
    public int c;
    private int d;
    public int e;
    private int f;
    private int g;
    public int h;
    public int i;

    public x(int n2, int n3, int n4) {
        block16: {
            block19: {
                boolean bl;
                block14: {
                    block13: {
                        block18: {
                            block17: {
                                block15: {
                                    bl = ab.xc;
                                    this.b = n2;
                                    this.c = n3;
                                    this.d = n4;
                                    this.g = 0;
                                    if (this.b != 0) break block14;
                                    if (wb.v != 1 || !wb.P) break block15;
                                    wb.P = false;
                                    wb.v = 2;
                                    x x2 = new x(4, this.c, wb.y);
                                    wb.z.addElement(x2);
                                    this.c += x2.e;
                                    wb.c(this.c);
                                    this.g = 4;
                                    break block16;
                                }
                                if (wb.v != 3 || !wb.P) break block17;
                                wb.P = false;
                                wb.v = 4;
                                wb.c(this.c);
                                this.g = 4;
                                if (!bl) break block16;
                            }
                            if (wb.v != 5 || !wb.P) break block18;
                            wb.P = false;
                            wb.v = 6;
                            wb.c(this.c);
                            this.g = 4;
                            if (!bl) break block16;
                        }
                        while (this.g == wb.J) {
                            this.g = ab.oc.nextInt(4);
                            if (!bl) {
                                if (!bl) continue;
                            }
                            break block13;
                        }
                        wb.J = this.g;
                    }
                    if (wb.v < 2) break block16;
                    if (wb.v == 7) {
                        wb.b = true;
                    }
                    wb.P = true;
                    if (!bl) break block16;
                }
                if (this.b != 3) break block19;
                this.i = ab.oc.nextInt(18);
                this.g = ab.oc.nextInt(2);
                this.h = ab.oc.nextInt(wb.K) + 2;
                if (!bl) break block16;
            }
            if (this.b != 4) {
                this.g = ab.oc.nextInt(3);
            }
        }
        if (this.b == 0) {
            this.e = wb.A[this.g].getWidth();
            this.f = wb.A[this.g].getHeight();
            this.d -= this.f;
            return;
        }
        if (this.b == 1) {
            this.e = wb.B[this.g].getWidth();
            this.f = wb.B[this.g].getHeight();
            return;
        }
        if (this.b == 2) {
            this.e = wb.C[this.g].getWidth();
            this.f = wb.C[this.g].getHeight();
            return;
        }
        if (this.b == 3) {
            this.e = wb.E[this.g].d;
            this.f = wb.E[this.g].e;
            return;
        }
        if (this.b == 4) {
            this.e = wb.F.getWidth();
            this.f = wb.F.getHeight();
            this.d -= this.f;
            this.i = 0;
        }
    }

    public final void b(Graphics graphics) {
        int n2 = this.c + wb.w;
        int n3 = this.d + wb.x / 10;
        if (this.b == 0) {
            graphics.drawImage(wb.A[this.g], n2, n3, 0);
            return;
        }
        if (this.b == 1) {
            graphics.drawImage(wb.B[this.g], n2, n3, 0);
            return;
        }
        if (this.b == 2) {
            graphics.drawImage(wb.C[this.g], n2, n3, 0);
            return;
        }
        if (this.b == 3) {
            wb.E[this.g].b = this.i / 3;
            wb.E[this.g].b(n2, n3);
            wb.E[this.g].b(graphics);
            return;
        }
        if (this.b == 4) {
            graphics.drawImage(wb.F, n2, n3, 0);
        }
    }
}

