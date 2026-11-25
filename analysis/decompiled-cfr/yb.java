/*
 * Decompiled with CFR 0.152.
 */
final class yb
extends Thread {
    private final qb b;

    yb(qb qb2) {
        this.b = qb2;
    }

    public final void run() {
        this.b.j();
        ++ab.q;
        ab.A.b(true, true);
        ab.q += 2;
        ab.A.b((byte)qb.d(this.b), fb.Oe);
        if (ab.Ub > 1 && fb.L == 0) {
            this.b.b(fb.Pd, false, false, true, -1);
        }
    }
}

