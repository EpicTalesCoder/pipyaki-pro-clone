/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class l {
    public static byte[][] b = new byte[][]{{0, -13, 0, 1}, {0, -19, 0, 1}, {0, -9, 0, 1}, {0, -10, 0, 1}, {0, -12, 0, 1}, {0, -2, 0, 1}, {0, -10, 0, 1}, {0, -2, 0, 1}, {0, -2, 0, 1}, {0, 0, 0, 1}, {0, -2, 0, 1}, {0, 0, 0, 0}, {0, -6, 0, 1}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
    private byte c;
    private pb d;
    private byte e;
    private byte f;
    private boolean g;

    public l(byte by, pb pb2, byte[] byArray) {
        this.c = by;
        this.d = pb2;
        switch (this.c) {
            case 0: {
                this.e = byArray[0];
                this.f = byArray[1];
                this.g = byArray[2] == 1;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void b(Graphics var1_1, q var2_2) {
        var9_3 = ab.xc;
        switch (this.c) {
            case 0: {
                v0 = var1_1 /* !! */ ;
                v1 = var2_2;
                var1_1 /* !! */  = v1;
                var1_1 /* !! */  = var2_2;
                var5_4 = var2_2.Gc;
                var4_6 = var1_1 /* !! */ .d / 10 - fb.He - var2_2.Ib;
                var3_8 = v1.c / 10 - fb.Ge;
                var2_2 = v0;
                var1_1 /* !! */  = this;
                var6_10 = var5_4.j;
                var7_12 = var1_1 /* !! */ .e;
                var8_13 = var1_1 /* !! */ .f;
                if (var1_1 /* !! */ .g) ** GOTO lbl47
                if (var5_4.g != q.I[0]) ** GOTO lbl24
                var6_10 = q.H[0];
                if (var5_4.j - 12 == 2) {
                    var7_12 = (byte)(var7_12 - 1);
                }
                if (var5_4.j - 12 != 3) ** GOTO lbl47
                var7_12 = (byte)(var7_12 - 1);
                if (!var9_3) ** GOTO lbl47
lbl24:
                // 2 sources

                if (var5_4.g != q.J[0]) ** GOTO lbl32
                var6_10 = q.H[1];
                if (var5_4.j - 17 == 2) {
                    var8_13 = (byte)(var8_13 - 1);
                }
                if (var5_4.j - 17 == 3) {
                    var8_13 = (byte)(var8_13 - 1);
                }
                var7_12 = (byte)(var7_12 + 2);
                if (!var9_3) ** GOTO lbl47
lbl32:
                // 2 sources

                if (var5_4.g != q.K[0]) ** GOTO lbl40
                var6_10 = q.H[2];
                if (var5_4.j - 22 == 2) {
                    var7_12 = (byte)(var7_12 - 1);
                }
                if (var5_4.j - 22 == 3) {
                    var7_12 = (byte)(var7_12 - 1);
                }
                var8_13 = (byte)(var8_13 + 2);
                if (!var9_3) ** GOTO lbl47
lbl40:
                // 2 sources

                if (var5_4.g == q.L[0]) {
                    var6_10 = q.H[3];
                    if (var5_4.j - 27 == 0) {
                        var8_13 = (byte)(var8_13 - 1);
                    }
                    if (var5_4.j - 27 == 1) {
                        var8_13 = (byte)(var8_13 - 1);
                    }
                    var7_12 = (byte)(var7_12 - 2);
                }
lbl47:
                // 8 sources

                var1_1 /* !! */ .d.b = var6_10;
                var1_1 /* !! */ .d.b(var3_8 - var1_1 /* !! */ .d.d / 2 + var7_12, var4_6 - var1_1 /* !! */ .d.e / 2 + var8_13);
                var1_1 /* !! */ .d.b((Graphics)var2_2);
                return;
            }
            case 1: {
                v2 = var1_1 /* !! */ ;
                v3 = var2_2;
                var1_1 /* !! */  = v3;
                var1_1 /* !! */  = var2_2;
                var5_5 = var2_2.Gc;
                var4_7 = var1_1 /* !! */ .d / 10 - fb.He - var2_2.Ib;
                var3_9 = v3.c / 10 - fb.Ge;
                var2_2 = v2;
                var1_1 /* !! */  = this;
                var6_11 = var5_5.j;
                var1_1 /* !! */ .d.b = var6_11;
                var1_1 /* !! */ .d.b(var3_9 - var1_1 /* !! */ .d.d / 2, var4_7 - var1_1 /* !! */ .d.e / 2);
                var1_1 /* !! */ .d.b((Graphics)var2_2);
            }
        }
    }
}

