/*
 * Decompiled with CFR 0.152.
 */
final class nc
extends Thread {
    private final qb b;

    nc(qb qb2) {
        this.b = qb2;
    }

    public final void run() {
        block8: {
            block7: {
                if (qb.f(this.b)) {
                    ab.A.c();
                }
                qb.g(this.b).d();
                qb.g(this.b).f();
                ab.A.N = null;
                ab.A = null;
                qb.b(this.b, null);
                System.gc();
                if (qb.h(this.b)) {
                    this.b.F();
                }
                if (!qb.i(this.b)) break block7;
                this.b.Rb = 70;
                qb.b(this.b, false);
                this.b.i(13);
                this.b.Wb = 1;
                this.b.Kb = -1;
                if (!ab.xc) break block8;
            }
            if (qb.j(this.b)) {
                this.b.Rb = 71;
                qb.b(this.b, false);
                this.b.i(0);
                this.b.Wb = 1;
                this.b.Kb = -1;
            }
        }
        qb.c(this.b, false);
        qb.d(this.b, false);
        ab.o = false;
        if (qb.f(this.b)) {
            this.b.c(true);
        }
    }
}

