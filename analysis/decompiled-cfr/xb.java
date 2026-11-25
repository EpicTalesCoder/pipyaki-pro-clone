/*
 * Decompiled with CFR 0.152.
 */
final class xb
extends Thread {
    private final f b;

    xb(f f2) {
        this.b = f2;
    }

    /*
     * Unable to fully structure code
     */
    public final void run() {
        var10_1 = ab.xc;
        this.b.b();
        block10: while (true) lbl-1000:
        // 3 sources

        {
            v0 = this.b.k;
            block11: while (v0 && !this.b.c) {
                try {
                    var1_2 = f.b(this.b).acceptAndOpen();
                }
                catch (Exception var2_4) {
                    block19: {
                        if (!this.b.k || this.b.c) break block19;
                        "lst ex " + var2_4;
                        Thread.yield();
                        if (!var10_1) ** GOTO lbl-1000
                    }
                    return;
                }
                if (this.b.k && !this.b.c) {
                    this.b.c();
                    try {
                        var5_7 = var1_2.openInputStream();
                        var6_9 = var1_2.openOutputStream();
                        var6_9.write(ab.b(4));
                        var6_9.flush();
                        while (true) {
                            var8_12 = new byte[4];
                            var5_7.read(var8_12);
                            if (this.b.c || !this.b.k) {
                                return;
                            }
                            var3_5 = ab.b(var8_12[0], var8_12[1], var8_12[2], var8_12[3]);
                            var7_10 = var3_5 == 4;
                            var8_13 = var5_7.read();
                            "prc len=" + var8_13;
                            if (this.b.c || !this.b.k) {
                                return;
                            }
                            if (var8_13 > 0) {
                                var9_15 = new byte[var8_13];
                                var5_7.read(var9_15);
                                var2_3 = new String(var9_15);
                                var9_15 = new byte[1];
                                var5_7.read(var9_15);
                                var4_6 = var9_15[0];
                                "prc url='" + var2_3 + "'";
                                if (!var10_1) break;
                            }
                            Thread.yield();
                        }
                        Thread.sleep(3000L);
                        if (var7_10) {
                            var8_14 = f.b(var2_3);
                            for (var9_16 = 0; var9_16 < f.c(this.b).size(); ++var9_16) {
                                var7_11 = (eb)f.c(this.b).elementAt(var9_16);
                                v0 = var8_14.equals(f.b(var7_11.b));
                                if (var10_1) continue block11;
                                if (!v0) continue;
                                f.c(this.b).removeElementAt(var9_16);
                                if (!var10_1) break;
                                if (!var10_1) continue;
                            }
                            f.c(this.b).addElement(new eb(this.b, var2_3, var3_5, var4_6));
                        }
                        try {
                            var5_7.close();
                        }
                        catch (Exception v1) {}
                        try {
                            var6_9.close();
                        }
                        catch (Exception v2) {}
                    }
                    catch (Exception var5_8) {
                        "prc ex " + var5_8;
                    }
                    try {
                        var1_2.close();
                    }
                    catch (Exception v3) {}
                    this.b.b();
                }
                Thread.yield();
                if (!var10_1) continue block10;
            }
            break;
        }
    }
}

