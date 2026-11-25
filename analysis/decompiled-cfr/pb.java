/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class pb {
    public int b = 0;
    public int c = 0;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    private int[] i;
    private Image j;

    public final void b(Graphics graphics) {
        if (this.b < this.i.length) {
            graphics.drawRegion(this.j, this.i[this.b], 0, this.d, this.e, this.c, this.f, this.g, 0);
        }
    }

    public final void b(int n2, int n3) {
        this.f = n2;
        this.g = n3;
    }

    public pb(Image image, int n2, int n3) {
        this.j = image;
        this.d = n2;
        this.e = n3;
        this.b();
    }

    private void b() {
        boolean bl = ab.xc;
        this.h = this.j.getWidth() / this.d;
        this.i = new int[this.h];
        for (int i2 = 0; i2 < this.h; ++i2) {
            this.i[i2] = i2 * this.d;
            if (!bl) continue;
        }
    }

    public pb(Image image) {
        this.j = image;
        this.d = this.j.getWidth();
        this.e = this.j.getHeight();
        this.b();
    }
}

