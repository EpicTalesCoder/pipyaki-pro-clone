/*
 * Decompiled with CFR 0.152.
 */
final class ac
extends Thread {
    private final qb b;

    ac(qb qb2) {
        this.b = qb2;
    }

    public final void run() {
        this.b.Yb.f();
        try {
            Thread.sleep(2000L);
        }
        catch (Exception exception) {}
        this.b.b(true, this.b.pc == -3);
    }
}

