/*
 * Decompiled with CFR 0.152.
 */
final class ec
extends Thread {
    private final f b;

    ec(f f2) {
        this.b = f2;
    }

    public final void run() {
        f f2;
        block9: {
            boolean bl = ab.xc;
            while (f.c(this.b).size() > 0) {
                block12: {
                    block10: {
                        block11: {
                            f2 = this.b;
                            if (bl) break block9;
                            if (f.d(f2)) {
                                try {
                                    ec.sleep(5000L);
                                }
                                catch (Exception exception) {}
                            }
                            if (this.b.c) {
                                return;
                            }
                            f.b(this.b, true);
                            eb eb2 = (eb)f.c(this.b).elementAt(0);
                            f.c(this.b).removeElementAt(0);
                            if (this.b.b(eb2)) break block10;
                            if (this.b.c) {
                                return;
                            }
                            f.e(this.b);
                            if (f.f(this.b) > 3) break block11;
                            f.c(this.b).insertElementAt(eb2, f.c(this.b).size());
                            if (!bl) break block12;
                        }
                        f.b(this.b, 0);
                        if (!bl) break block12;
                    }
                    f.b(this.b, 0);
                }
                Thread.yield();
                if (!bl) continue;
            }
            this.b.b = 4;
            f2 = this.b;
        }
        f2.f.b(1, true);
    }
}

