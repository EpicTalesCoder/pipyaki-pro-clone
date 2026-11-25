/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class t
extends o {
    public static int r = 0;
    private static byte[] s = new byte[]{4, 5, 6, 7};
    private static byte[] t = new byte[]{0, 1, 2, 3, 4};
    public byte u;
    private byte v;
    private byte w;
    public nb x;
    private int y;
    public int z;
    public int A;
    private int B;
    public boolean C;
    public boolean D;

    public t(byte by, pb pb2, int n2, int n3, int n4, int n5, int n6) {
        super((byte)-1, (byte)-1, n3, n4);
        this.u = by;
        this.l = n5;
        this.m = n6;
        this.B = 0;
        this.y = -1;
        switch (this.u) {
            case 0: {
                this.x = new nb(pb2);
                this.x.b((byte)4, (byte)2);
                this.v = 0;
                this.z = n2 + ab.oc.nextInt(25);
                this.B = 10;
                this.w = (byte)3;
                if (!ab.xc) break;
            }
            case 1: {
                this.x = new nb(pb2);
                this.x.b(t, true, false, (byte)1);
                this.v = 0;
                this.y = this.z = n2;
                this.B = 1;
                this.w = (byte)2;
            }
        }
        if (fb.Vd != null) {
            fb.Vd.addElement(this);
            ++r;
        }
    }

    public final void h() {
        boolean bl;
        block12: {
            block11: {
                super.h();
                this.x.c();
                bl = false;
                if (this.y != -1) {
                    --this.y;
                    if (this.y < 0) {
                        this.y = 0;
                    }
                }
                if (this.u != 0) break block11;
                if (this.v == 0 && !this.x.e) {
                    this.x.b(s, true, false, this.w);
                    this.v = 1;
                    this.y = this.z;
                }
                if (this.v == 1 && this.y == 0) {
                    this.x.b();
                    this.x.b((byte)(this.x.b.h - 1), this.w);
                    this.v = (byte)2;
                }
                if (this.v != 2 || this.x.e) break block12;
                bl = true;
                if (!ab.xc) break block12;
            }
            if (this.u == 1) {
                if (this.v == 0 && this.y == 0) {
                    this.x.b();
                    this.x.b((byte)(this.x.b.h - 1), this.w);
                    this.v = 1;
                }
                if (this.v == 1 && !this.x.e) {
                    bl = true;
                }
            }
        }
        this.A += this.B;
        if (bl) {
            t t2 = this;
            this.C = true;
        }
    }

    public final void b(Graphics object) {
        Graphics graphics = object;
        t t2 = this;
        object = t2;
        object = this;
        this.x.b(graphics, t2.c / 10 - fb.Ge, object.d / 10 - this.A / 10 - fb.He);
    }
}

