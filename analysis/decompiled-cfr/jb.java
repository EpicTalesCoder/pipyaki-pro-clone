/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.Vector;

abstract class jb {
    private boolean a;
    private boolean b;
    public byte c;
    public int d;
    public int e = -1;
    private long f;
    protected boolean g = false;
    protected Vector h;
    protected Vector i;
    private cc j;
    private c k;
    private boolean l;
    private int[] m = new int[]{0};
    private boolean[] n = new boolean[]{true};
    private boolean[] o = new boolean[]{false};

    public jb(c c2) {
        this.k = c2;
        this.h = new Vector();
        this.i = new Vector();
    }

    public final void a() {
        this.g = true;
        this.j = new cc(this);
        this.j.start();
    }

    public final void b(int n2) {
        block2: {
            boolean bl = ab.xc;
            this.m = new int[n2 + 1];
            this.n = new boolean[n2 + 1];
            this.o = new boolean[n2 + 1];
            for (int i2 = 0; i2 <= n2; ++i2) {
                this.m[i2] = 0;
                this.n[i2] = true;
                this.o[i2] = false;
                if (!bl) {
                    if (!bl) continue;
                }
                break block2;
            }
            this.l = true;
        }
    }

    abstract void b();

    public final void b(byte[] byArray) {
        if (this.g && byArray != null && byArray.length > 0) {
            this.h.addElement(byArray);
        }
    }

    protected final void c() {
        this.f = System.currentTimeMillis();
        byte[] byArray = new byte[1];
        byte[] byArray2 = byArray;
        byArray[0] = 102;
        this.b(byArray2);
    }

    abstract void d();

    abstract void e();

    public final void g() {
        if (!this.g) {
            return;
        }
        try {
            this.d();
            return;
        }
        catch (IOException iOException) {
            if (ab.B != null) {
                String cfr_ignored_0 = "WRITE: " + iOException;
            }
            String cfr_ignored_1 = "S Exception " + iOException;
            this.i();
            return;
        }
    }

    public final void h() {
        boolean bl = ab.xc;
        if (!this.g) {
            return;
        }
        if (this.i.size() == 0) {
            return;
        }
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        try {
            block29: {
                block28: {
                    for (n3 = 0; n3 < this.n.length; ++n3) {
                        this.n[n3] = true;
                        if (!bl) {
                            if (!bl) continue;
                        }
                        break block28;
                    }
                    n3 = 0;
                }
                n4 = 1;
                while (n3 < this.i.size()) {
                    block34: {
                        block32: {
                            block33: {
                                Object object;
                                block31: {
                                    block30: {
                                        object = (byte[])this.i.elementAt(n3);
                                        n4 = 2;
                                        if (this.l) break block30;
                                        n2 = 0;
                                        if (!bl) break block31;
                                    }
                                    n2 = this.k.c((byte[])object);
                                }
                                n4 = 3;
                                if (n2 >= this.n.length) {
                                    n2 = 0;
                                }
                                if (n2 != 0) {
                                    if (this.o[n2]) {
                                        n4 = 4;
                                        if (object[0] == 15) {
                                            this.k.b((byte[])object, false);
                                            n4 = 5;
                                            this.o[n2] = false;
                                            n4 = 6;
                                        }
                                        this.i.removeElementAt(n3);
                                        n4 = 7;
                                        if (!bl) continue;
                                    }
                                    if (!this.n[n2]) {
                                        n4 = 8;
                                        ++n3;
                                        if (!bl) continue;
                                    }
                                }
                                n4 = 9;
                                if (this.k.b((byte[])object, false)) break block32;
                                n4 = 10;
                                if (n2 == 0) break block33;
                                this.n[n2] = false;
                                if (!this.k.c()) {
                                    int n5 = n2;
                                    this.m[n5] = this.m[n5] + 1;
                                }
                                n4 = 11;
                                if (this.m[n2] > 50) {
                                    n4 = 12;
                                    this.m[n2] = 0;
                                    this.o[n2] = true;
                                    n4 = 13;
                                    if (this.k.b()) {
                                        fb.I.b((byte)n2, (byte)n2, (byte)1);
                                        if (!bl) break block29;
                                    }
                                    byte by = (byte)n2;
                                    object = this;
                                    String cfr_ignored_0 = "S" + by;
                                    byte[] byArray = new byte[3];
                                    byte[] byArray2 = byArray;
                                    byArray[0] = 14;
                                    byArray2[1] = by;
                                    byArray2[2] = (byte)((jb)object).e;
                                    ((jb)object).b(byArray2);
                                    break block29;
                                }
                                break block34;
                            }
                            n4 = 15;
                            ++n3;
                            if (!bl) break block34;
                        }
                        n4 = 16;
                        this.m[n2] = 0;
                        this.i.removeElementAt(n3);
                    }
                    n4 = 17;
                    if (!bl) continue;
                }
                return;
            }
            n4 = 14;
        }
        catch (Exception exception) {
            String cfr_ignored_1 = "!!! " + n3 + "/" + this.i.size() + " " + n2 + " " + n4;
        }
    }

    protected final void c(byte[] object) {
        block16: {
            block18: {
                block17: {
                    System.currentTimeMillis();
                    if (object[0] == 111) {
                        ab.B.b(object[1]);
                        this.j();
                        return;
                    }
                    if (object[0] == 107) {
                        if (this.k.b() && this.e != -1) {
                            this.k.b(this.e, false);
                        }
                        this.a = false;
                        if (!this.k.c()) {
                            this.b = false;
                            String cfr_ignored_0 = "send sync to: " + object[1];
                            fb.I.f(object[1]);
                        }
                        return;
                    }
                    if (object[0] == 110) {
                        this.k.b(2);
                        this.b();
                        return;
                    }
                    if (object[0] == 105) {
                        this.k.b(1);
                        if (!this.k.c()) {
                            this.b = false;
                            this.m();
                        }
                        return;
                    }
                    if (object[0] != 104 && object[0] != 106) break block16;
                    this.h.removeAllElements();
                    this.i.removeAllElements();
                    if (object[0] != 104) break block17;
                    this.k.b(0);
                    if (!ab.xc) break block18;
                }
                if (this.e != -1 && this.k.b()) {
                    this.k.b(this.e, true);
                }
                this.a = true;
            }
            this.b = true;
            return;
        }
        if (object[0] == 1) {
            this.k.b((byte[])object, false);
            return;
        }
        if (this.b) {
            return;
        }
        if (object[0] == 102) {
            byte[] byArray = new byte[1];
            object = byArray;
            byArray[0] = 103;
            this.b((byte[])object);
            return;
        }
        if (object[0] == 103) {
            long l2 = System.currentTimeMillis() - this.f;
            this.k.b(l2);
            this.c();
            return;
        }
        jb jb2 = this;
        byte[] byArray = object;
        object = jb2;
        if (jb2.g) {
            object.i.addElement(byArray);
        }
    }

    protected final void i() {
        this.k.b("XC");
        this.j();
    }

    public final void j() {
        block5: {
            block4: {
                if (!this.g) {
                    return;
                }
                this.g = false;
                if (!this.k.b()) break block4;
                if (this.e < 0) break block5;
                byte[] byArray = new byte[2];
                byte[] byArray2 = byArray;
                byArray[0] = 101;
                byArray2[1] = (byte)this.e;
                this.k.b(byArray2, false);
                this.k.b(byArray2);
                if (!ab.xc) break block5;
            }
            this.k.b(2);
        }
        this.b();
    }

    public final void k() {
        byte[] byArray;
        jb jb2;
        block3: {
            block2: {
                jb2 = this;
                byArray = new byte[1];
                if (!jb2.k.b()) break block2;
                byArray[0] = 104;
                if (!ab.xc) break block3;
            }
            byArray[0] = 106;
        }
        jb2.b(byArray);
        this.g();
        this.i.removeAllElements();
        this.b = true;
    }

    public final void l() {
        System.currentTimeMillis();
        if (this.k.b()) {
            byte[] byArray = new byte[1];
            byte[] byArray2 = byArray;
            byArray[0] = 105;
            this.b(byArray2);
            if (!this.a) {
                this.b = false;
            }
            String cfr_ignored_0 = "send sync to " + this.e;
            fb.I.f((byte)this.e);
            return;
        }
        this.b = false;
        this.m();
    }

    private void m() {
        byte[] byArray = new byte[2];
        byte[] byArray2 = byArray;
        byArray[0] = 107;
        byArray2[1] = (byte)this.e;
        this.b(byArray2);
        this.c();
    }
}

