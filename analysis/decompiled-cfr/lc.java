/*
 * Decompiled with CFR 0.152.
 */
final class lc
extends Thread {
    lc() {
    }

    public final void run() {
        block8: {
            int n2;
            n n3;
            boolean bl;
            block7: {
                block6: {
                    bl = ab.xc;
                    n3 = new n("btautosave", false);
                    n3.b("btcoins", ab.Rb);
                    n3.b("wtypes", (byte)14);
                    for (n2 = 0; n2 < 14; ++n2) {
                        n3.b("wcount" + n2, ab.jc[n2]);
                        if (!bl) {
                            if (!bl) continue;
                        }
                        break block6;
                    }
                    n3.b("sks", (byte)11);
                }
                for (n2 = 0; n2 < 11; ++n2) {
                    n3.b("sk" + n2, ab.kc[n2]);
                    if (!bl) {
                        if (!bl) continue;
                    }
                    break block7;
                }
                n3.b("pitypes", (byte)6);
            }
            for (n2 = 0; n2 < 6; ++n2) {
                n3.b("picount" + n2, ab.lc[n2]);
                if (!bl) {
                    if (!bl) continue;
                }
                break block8;
            }
            n3.b("bm", ab.mc);
            n3.b();
            n3.c();
        }
    }
}

