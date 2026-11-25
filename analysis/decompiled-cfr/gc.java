/*
 * Decompiled with CFR 0.152.
 */
final class gc
extends Thread {
    private final qb b;

    gc(qb qb2) {
        this.b = qb2;
    }

    public final void run() {
        try {
            Thread.sleep(ab.oc.nextInt(10000) + 10000);
        }
        catch (Exception exception) {}
        rc.b(500, 1);
        this.b.G();
        this.b.o(this.b.I());
        qb.b(this.b, this.b.I());
        this.b.q += this.b.I();
        ab.ic = qb.k(this.b);
        qb.c(this.b, 0);
        this.b.yc = 0;
        qb.e(this.b, false);
    }
}

