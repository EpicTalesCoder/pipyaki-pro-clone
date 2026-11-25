/*
 * Decompiled with CFR 0.152.
 */
public final class r
extends o {
    private o r;
    private int s;
    private int t;
    private byte u;
    private byte v;
    private int w;
    private o x;
    private boolean y;
    public boolean z;
    public boolean A;
    private int B;

    public r(o o2, int n2, int n3, int n4, int n5, int n6, int n7, o o3) {
        super((byte)-1, (byte)-1, n2, n3);
        this.r = o2;
        this.s = n4;
        this.t = n5;
        this.v = this.u = (byte)n6;
        this.w = n7;
        this.x = o3;
        this.y = true;
        if (fb.be != null) {
            fb.be.addElement(this);
        }
    }

    public static r[] b(byte by, byte by2) {
        boolean bl = ab.xc;
        r[] rArray = null;
        for (int i2 = 0; i2 < 2; ++i2) {
            int n2 = 0;
            for (int i3 = 0; i3 < fb.be.size(); ++i3) {
                r r2 = (r)fb.be.elementAt(i3);
                if (r2 == null || r2.z || r2.g != by || r2.h != by2) continue;
                if (i2 == 1) {
                    rArray[n2] = r2;
                }
                ++n2;
                if (!bl) continue;
            }
            if (i2 != 0) continue;
            rArray = new r[n2];
            if (!bl) continue;
        }
        return rArray;
    }

    public final void h() {
        r r2;
        block11: {
            block12: {
                if (this.A) {
                    return;
                }
                if (this.w != -1) {
                    --this.w;
                    if (this.w <= 0) {
                        r2 = this;
                        this.z = true;
                    }
                }
                super.h();
                if (this.r == null) break block11;
                this.c = this.r.c;
                this.d = this.r.d;
                if (!(this.r instanceof q)) break block12;
                this.B = ((q)this.r).Gb;
                if (!ab.xc) break block11;
            }
            if (this.r instanceof u) {
                this.B = ((u)this.r).P;
            }
        }
        this.v = (byte)(this.v - 1);
        if (this.v <= 0) {
            r2 = this;
            int n2 = r2.c / 10 + this.s;
            r2 = this;
            int n3 = r2.d / 10 - this.B / 10 + this.t;
            if (this.x != null && this.x instanceof t) {
                t t2 = (t)this.x;
                int n4 = t2.z;
                if (this.y && n4 >= 4) {
                    n4 -= ab.oc.nextInt(n4 / 2);
                }
                int n5 = t2.l;
                int n6 = t2.m;
                if (Math.abs(n5) > 2) {
                    n5 = Math.abs(n5);
                    n5 = ab.oc.nextInt(n5 + 1) - ab.oc.nextInt(n5 + 1);
                }
                new t(t2.u, t2.x.b, n4, n2, n3, n5, n6);
            }
            this.v = this.u;
        }
    }
}

