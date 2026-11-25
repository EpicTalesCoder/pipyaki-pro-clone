/*
 * Decompiled with CFR 0.152.
 */
final class zb
extends Thread {
    private final qb b;

    zb(qb qb2) {
        this.b = qb2;
    }

    public final void run() {
        if (qb.b(this.b)) {
            ab.e();
        }
        ab.bc = qb.c(this.b);
        ab.A = new fb();
        fb.M = false;
        fb.L = 0;
        fb.Oe = ab.d(qb.c(this.b));
        qb.r();
        this.b.b(1, false);
    }
}

