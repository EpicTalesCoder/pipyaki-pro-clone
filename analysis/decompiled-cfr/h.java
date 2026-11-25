/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class h {
    public int b = 1;
    public Vector c = new Vector();
    private int d;

    public h() {
        this.d = ab.C.c() + ab.C.w;
    }

    public final void b(Graphics graphics) {
        boolean bl = ab.xc;
        int n2 = this.b;
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            m m2 = (m)this.c.elementAt(i2);
            ab.C.b(graphics, m2.b, ab.D / 2, n2, -1, 2);
            n2 += this.d;
            if (!bl) continue;
        }
    }

    public final void b(String string) {
        if (this.c.size() == 3) {
            this.c.removeElementAt(0);
        }
        this.b -= this.d;
        this.c.insertElementAt(new m(this, string), 0);
    }
}

