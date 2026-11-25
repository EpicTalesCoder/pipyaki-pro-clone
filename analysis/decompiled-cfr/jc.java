/*
 * Decompiled with CFR 0.152.
 */
final class jc
extends Thread {
    private final db b;

    jc(db db2) {
        this.b = db2;
    }

    public final void run() {
        try {
            Thread.yield();
            Thread.sleep(5000L);
        }
        catch (Exception exception) {}
        if (!db.b(this.b)) {
            db.c(this.b);
        }
    }
}

