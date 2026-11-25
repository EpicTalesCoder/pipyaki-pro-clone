/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class nb {
    public pb b;
    public int c;
    public int d;
    public boolean e;
    private long f;
    public byte[] g;
    public byte h;
    public byte i;
    public byte j;
    private boolean k;
    private boolean l;
    private byte m;
    private byte n;
    private byte o;
    public short p;
    public byte q;

    public nb(pb pb2) {
        this.b = pb2;
        this.c = this.b.d;
        this.d = this.b.e;
        this.q = (byte)-1;
    }

    public final void b(byte[] byArray, byte by, byte by2, byte by3, byte by4, boolean bl, boolean bl2, byte by5) {
        block4: {
            block8: {
                block5: {
                    boolean bl3;
                    block7: {
                        block6: {
                            bl3 = ab.xc;
                            if (this.e) break block4;
                            this.k = bl;
                            this.l = bl2;
                            this.p = by5;
                            if (byArray == null) break block5;
                            this.g = byArray;
                            if (this.l) break block6;
                            this.i = 0;
                            if (!bl3) break block7;
                        }
                        this.i = (byte)(this.g.length - 1);
                    }
                    this.h = (byte)this.g.length;
                    this.j = this.g[this.i];
                    if (!bl3) break block8;
                }
                this.g = null;
                this.m = by;
                this.n = by2;
                this.o = by3;
                this.h = by4;
                this.j = this.m;
                this.i = 0;
            }
            this.f = fb.kb;
            this.e = true;
        }
    }

    public final void b(byte[] byArray, boolean bl, boolean bl2, byte by) {
        this.b(byArray, (byte)0, (byte)0, (byte)0, (byte)0, bl, bl2, by);
    }

    public final void b(boolean bl, boolean bl2, byte by) {
        this.b(null, bl2 ? (byte)(this.b.h - 1) : (byte)0, (byte)-1, (byte)-1, (byte)this.b.h, bl, bl2, by);
    }

    public final void b(byte by, byte by2) {
        if (by == this.j) {
            return;
        }
        this.e = false;
        boolean bl = by - this.j < 0;
        this.b(null, this.j, bl ? by : (byte)-1, (byte)-1, !bl ? (byte)(by + 1) : (byte)this.b.h, false, bl, by2);
    }

    public final void b() {
        this.e = false;
        this.g = null;
        this.q = (byte)-1;
    }

    public final void b(Graphics graphics, int n2, int n3) {
        this.b.b = this.j;
        this.b.b(n2 - this.c / 2, n3 - this.d / 2);
        this.b.b(graphics);
    }

    public final void c() {
        block30: {
            block37: {
                block39: {
                    block38: {
                        boolean bl;
                        block36: {
                            block35: {
                                block31: {
                                    block32: {
                                        block33: {
                                            block34: {
                                                bl = ab.xc;
                                                if (this.p == -1) {
                                                    return;
                                                }
                                                if (!this.e || fb.kb - this.f < (long)this.p) break block30;
                                                this.f = fb.kb;
                                                if (this.g == null) break block31;
                                                if (this.i < this.g.length && this.i >= 0) break block32;
                                                if (this.k && this.q >= 0) {
                                                    this.q = (byte)(this.q - 1);
                                                    if (this.q == 0 || this.q == -1) {
                                                        this.k = false;
                                                    }
                                                }
                                                if (!this.k) break block33;
                                                if (this.i >= 0) break block34;
                                                this.i = (byte)(this.g.length - 1);
                                                if (!bl) break block32;
                                            }
                                            this.i = 0;
                                            if (!bl) break block32;
                                        }
                                        this.b();
                                        return;
                                    }
                                    this.j = this.g[this.i];
                                    if (this.l) {
                                        this.i = (byte)(this.i - 1);
                                        return;
                                    }
                                    this.i = (byte)(this.i + 1);
                                    return;
                                }
                                if (!this.l) break block35;
                                this.j = (byte)(this.j - 1);
                                if (!bl) break block36;
                            }
                            this.j = (byte)(this.j + 1);
                        }
                        if (this.o == -1) break block37;
                        if (this.j <= this.o) break block38;
                        this.j = this.n;
                        if (!bl) break block39;
                    }
                    if (this.j < this.n) {
                        this.j = this.o;
                    }
                }
                this.i = (byte)(this.i + 1);
                if (this.i >= this.h) {
                    if (this.k && this.q >= 0) {
                        this.q = (byte)(this.q - 1);
                        if (this.q == 0 || this.q == -1) {
                            this.k = false;
                        }
                    }
                    if (this.k) {
                        this.j = this.m;
                        this.i = 0;
                        return;
                    }
                    this.i = 0;
                    this.b();
                    return;
                }
                break block30;
            }
            if (this.j >= this.h) {
                if (this.k && this.q >= 0) {
                    this.q = (byte)(this.q - 1);
                    if (this.q == 0 || this.q == -1) {
                        this.k = false;
                    }
                }
                if (this.k) {
                    if (this.n != -1) {
                        this.j = this.n;
                        return;
                    }
                    this.j = this.m;
                    return;
                }
                this.j = (byte)(this.j - 1);
                this.b();
                return;
            }
            if (this.j < (this.n != -1 ? this.n : (byte)0)) {
                if (this.k && this.q >= 0) {
                    this.q = (byte)(this.q - 1);
                    if (this.q == 0 || this.q == -1) {
                        this.k = false;
                    }
                }
                if (this.k) {
                    this.j = (byte)(this.h - 1);
                    return;
                }
                this.j = (byte)(this.j + 1);
                this.b();
            }
        }
    }
}

