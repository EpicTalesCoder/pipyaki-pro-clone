/*
 * Decompiled with CFR 0.152.
 */
public final class g {
    public byte b;
    public byte c;
    public byte d;
    public byte[] e;

    public g(byte by, byte by2, byte by3, byte[] byArray) {
        this.d = by;
        this.b = by2;
        this.c = by3;
        this.e = byArray;
        if (this.d == 3) {
            ++fb.h;
        }
    }

    public static g b(byte by, byte by2) {
        boolean bl = ab.xc;
        if (fb.Sd != null && fb.Sd.size() > 0) {
            for (int i2 = 0; i2 < fb.Sd.size(); ++i2) {
                if (((g)fb.Sd.elementAt((int)i2)).b != by || ((g)fb.Sd.elementAt((int)i2)).c != by2) continue;
                return (g)fb.Sd.elementAt(i2);
            }
        }
        return null;
    }
}

