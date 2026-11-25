/*
 * Decompiled with CFR 0.152.
 */
final class qc
extends Thread {
    qc() {
    }

    public final void run() {
        block8: {
            int n2;
            n n3;
            boolean bl;
            block7: {
                block6: {
                    bl = ab.xc;
                    n3 = new n("autosave", false);
                    n3.b("levels completed", ab.Tb);
                    n3.b("cur level", ab.Ub);
                    n3.b("xpn", ab.Sb);
                    n3.b("coins", ab.Qb);
                    n3.b("wtypes", (byte)14);
                    for (n2 = 0; n2 < 14; ++n2) {
                        n3.b("wcount" + n2, ab.Vb[n2]);
                        n3.b("wknown" + n2, ab.Yb[n2]);
                        if (!bl) {
                            if (!bl) continue;
                        }
                        break block6;
                    }
                    n3.b("sks", (byte)11);
                }
                for (n2 = 0; n2 < 11; ++n2) {
                    n3.b("sk" + n2, ab.Wb[n2]);
                    if (!bl) {
                        if (!bl) continue;
                    }
                    break block7;
                }
                n3.b("pitypes", (byte)6);
            }
            for (n2 = 0; n2 < 6; ++n2) {
                n3.b("picount" + n2, ab.Xb[n2]);
                n3.b("piknown" + n2, ab.Zb[n2]);
                if (!bl) {
                    if (!bl) continue;
                }
                break block8;
            }
            n3.b("primr", ab.Ob);
            n3.b("secnd", ab.Pb);
            n3.b("lc", ab.ic);
            n3.b();
            n3.c();
        }
    }
}

