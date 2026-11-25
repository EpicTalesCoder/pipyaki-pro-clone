/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

abstract class e {
    public int b = 0;
    public boolean c;
    protected Vector d = new Vector();
    protected c e;
    protected ob f;

    public e(c c2, ob ob2) {
        this.e = c2;
        this.f = ob2;
    }

    public int b() {
        return this.d.size();
    }

    abstract void d();

    public final void f() {
        byte[] byArray = new byte[]{110};
        this.b(byArray);
        this.i();
    }

    public final void g() {
        boolean bl = ab.xc;
        for (int i2 = 0; i2 < this.d.size(); ++i2) {
            jb jb2 = (jb)this.d.elementAt(i2);
            jb2.k();
            if (!bl) continue;
        }
    }

    public final void h() {
        boolean bl = ab.xc;
        for (int i2 = 0; i2 < this.d.size(); ++i2) {
            jb jb2 = (jb)this.d.elementAt(i2);
            jb2.l();
            if (!bl) continue;
        }
    }

    public final byte b(byte by) {
        jb jb2 = (jb)this.d.elementAt(by - 2);
        return jb2.c;
    }

    public final void i() {
        boolean bl = ab.xc;
        for (int i2 = 0; i2 < this.d.size(); ++i2) {
            jb jb2 = (jb)this.d.elementAt(i2);
            jb2.g();
            if (!bl) continue;
        }
    }

    public final void j() {
        boolean bl = ab.xc;
        for (int i2 = 0; i2 < this.d.size(); ++i2) {
            jb jb2 = (jb)this.d.elementAt(i2);
            jb2.h();
            if (!bl) continue;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected final void k() {
        boolean bl = ab.xc;
        e e2 = this;
        synchronized (e2) {
            this.notify();
            while (this.d.size() != 0) {
                kb kb2 = (kb)this.d.elementAt(0);
                this.d.removeElementAt(0);
                kb2.b();
                if (!bl) {
                    if (!bl) continue;
                }
                break;
            }
            return;
        }
    }

    abstract void b(jb var1, byte[] var2);

    abstract void b(byte[] var1);

    abstract void b(byte[] var1, byte var2);

    abstract void b(int var1, byte[] var2);

    public void l() {
    }

    public void b(String string, int n2, byte[] byArray, byte by, boolean bl, boolean bl2) {
    }

    public final int m() {
        boolean bl = ab.xc;
        if (this.d != null) {
            int n2;
            block3: {
                int n3 = 0;
                for (int i2 = 0; i2 < this.d.size(); ++i2) {
                    n2 = n3 + ((jb)this.d.elementAt((int)i2)).h.size();
                    if (!bl) {
                        n3 = n2;
                        if (!bl) continue;
                    }
                    break block3;
                }
                n2 = n3;
            }
            return n2;
        }
        return 0;
    }
}

