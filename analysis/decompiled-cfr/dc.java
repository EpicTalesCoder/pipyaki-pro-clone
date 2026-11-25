/*
 * Decompiled with CFR 0.152.
 */
final class dc
extends Thread {
    dc() {
    }

    /*
     * Unable to fully structure code
     */
    public final void run() {
        block13: {
            var6_1 = ab.xc;
            ab.p = true;
            var1_2 = true;
            try {
                block15: {
                    block14: {
                        var2_3 = new int[]{77, 73, 68, 108, 101, 116, 45, 49};
                        var3_4 = "";
                        for (var4_5 = 0; var4_5 < var2_3.length; ++var4_5) {
                            var3_4 = var3_4 + (char)var2_3[var4_5];
                            if (!var6_1) {
                                if (!var6_1) continue;
                            }
                            break block13;
                        }
                        if ((var3_4 = midlet.a.getAppProperty(var3_4)) == null) break block15;
                        var3_4 = var3_4.substring(var3_4.length() - 6, var3_4.length());
                        var4_5 = 0;
                        for (var5_6 = 0; var5_6 < var3_4.length(); ++var5_6) {
                            var4_5 += var3_4.charAt(var5_6);
                            if (!var6_1) {
                                if (!var6_1) continue;
                            }
                            ** GOTO lbl-1000
                        }
                        if (var4_5 == 639) {
                            v0 = true;
                        } else lbl-1000:
                        // 2 sources

                        {
                            v0 = false;
                        }
                        var1_2 = v0;
                        var2_3[7] = var2_3[7] + 1;
                        var3_4 = "";
                        for (var5_6 = 0; var5_6 < var2_3.length; ++var5_6) {
                            var3_4 = var3_4 + (char)var2_3[var5_6];
                            if (!var6_1) {
                                if (!var6_1) continue;
                            }
                            break block14;
                        }
                        if ((var3_4 = midlet.a.getAppProperty(var3_4)) != null) {
                            var1_2 = false;
                        }
                    }
                    if (!var6_1) break block13;
                }
                var1_2 = false;
            }
            catch (Exception v1) {}
        }
        if (var1_2) {
            midlet.a.a();
            ab.b();
            hb.g();
            ab.B = new qb();
            ab.B.a();
            ab.l = 1;
            ab.B.b(false);
            wb.d();
            ab.p = false;
        }
    }
}

