/*
 * Decompiled with CFR 0.152.
 */
public final class sb {
    public boolean b;
    public byte c;
    public byte d;
    private q[] e;
    private long f;
    private byte h;
    public boolean i;
    public byte j;
    private byte k;
    private byte l;
    private byte m;
    public byte n;
    public byte o;
    private byte p;
    public byte q;
    public nb r;
    public int s;
    public int t;
    private boolean u;
    private boolean v;
    private boolean w;

    public sb(byte by, byte by2, byte by3, byte by4, byte by5, byte by6, byte by7, byte by8, boolean bl, byte by9, boolean bl2, boolean bl3, boolean bl4) {
        block6: {
            block7: {
                boolean bl5;
                block5: {
                    bl5 = ab.xc;
                    this.e = null;
                    this.q = 0;
                    this.c = by;
                    this.d = by2;
                    this.j = by3;
                    this.h = this.k = by4;
                    this.l = by5;
                    this.m = by6;
                    this.n = by7;
                    this.o = by8;
                    if (this.o != 0) break block5;
                    this.i = true;
                    if (!bl5) break block6;
                }
                if (this.o != 1) break block7;
                this.o = (byte)-1;
                if (!bl5) break block6;
            }
            this.o = (byte)(this.o - 2);
        }
        if (this.l > 0) {
            this.e = new q[this.l];
        }
        if (this.o != 0 && this.j != 2) {
            this.q = this.k;
        }
        this.b = !bl;
        this.p = by9;
        this.u = bl2;
        this.v = bl3;
        this.w = bl4;
        this.f = 0L;
        fb.ae.addElement(this);
    }

    public static sb[] b(byte by, byte by2) {
        boolean bl = ab.xc;
        sb[] sbArray = null;
        if (fb.Zd != null) {
            for (int i2 = 0; i2 < 2; ++i2) {
                int n2 = 0;
                for (int i3 = 0; i3 < fb.ae.size(); ++i3) {
                    sb sb2 = (sb)fb.ae.elementAt(i3);
                    if (sb2 == null || sb2.c != by || sb2.d != by2) continue;
                    if (i2 == 1) {
                        sbArray[n2] = sb2;
                    }
                    ++n2;
                    if (!bl) continue;
                }
                if (i2 == 0) {
                    if (n2 > 0) {
                        sbArray = new sb[n2];
                        if (!bl) continue;
                    }
                    return null;
                }
                return sbArray;
            }
        }
        return null;
    }

    public final void b() {
        block23: {
            q q2;
            block21: {
                q q3;
                block22: {
                    boolean bl;
                    boolean bl2;
                    block24: {
                        block25: {
                            q q4;
                            boolean bl3;
                            block20: {
                                bl2 = ab.xc;
                                if (this.b && this.r != null) {
                                    this.r.c();
                                }
                                if (!this.b || this.h == 0) {
                                    return;
                                }
                                if (this.f > 0L) {
                                    --this.f;
                                }
                                if (!fb.df && fb.kb % 10L != 0L) {
                                    return;
                                }
                                bl3 = true;
                                if (this.e != null) {
                                    bl3 = false;
                                    for (int n2 = 0; n2 < this.e.length; n2 = (int)((byte)(n2 + 1))) {
                                        q4 = this.e[n2];
                                        if (!bl2) {
                                            if (q4 != null && this.e[n2].V) {
                                                this.e[n2] = null;
                                            }
                                            if (this.e[n2] != null) continue;
                                            bl3 = true;
                                            if (!bl2) break;
                                            if (!bl2) continue;
                                        }
                                        break block20;
                                    }
                                }
                                if (!fb.df && this.f != 0L) {
                                    bl3 = false;
                                }
                                if (!bl3) break block23;
                                q4 = new q(this.j, this.o);
                            }
                            q3 = q4;
                            q4.lc = true;
                            q3.Cc = new y(q3, this.p);
                            q3.Cc.b(this.n, this.c, this.d, this.u, this.v);
                            bl3 = fb.df;
                            if (!fb.df) {
                                fb.df = this.w;
                            }
                            q3.b(this.c, this.d, true);
                            fb.df = bl3;
                            if (this.r == null) break block24;
                            if (this.k - this.h != 0) break block25;
                            this.r.b(new byte[]{1, 2, 3, 4, 5}, false, false, (byte)5);
                            if (!bl2) break block24;
                        }
                        if (this.h == 1) {
                            this.r.b(new byte[]{5, 4, 3, 2, 1, 0}, false, false, (byte)5);
                        }
                    }
                    q q5 = q3;
                    sb sb2 = this;
                    if (sb2.e != null) {
                        for (int n3 = 0; n3 < sb2.e.length; n3 = (int)((byte)(n3 + 1))) {
                            q2 = sb2.e[n3];
                            if (bl2) break block21;
                            if (q2 != null) continue;
                            sb2.e[n3] = q5;
                            bl = true;
                            break block22;
                        }
                    }
                    bl = false;
                }
                this.f = this.m * 25;
                this.h = (byte)(this.h - 1);
                q2 = q3;
            }
            if (q2.Cc.f()) {
                this.h = 0;
            }
            if (this.h < 0) {
                this.h = 0;
            }
        }
    }
}

