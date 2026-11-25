/*
 * Decompiled with CFR 0.152.
 */
final class mc
extends Thread {
    mc() {
    }

    public final void run() {
        boolean bl = ab.xc;
        while (wb.v >= 0 || ab.p) {
            ab.z.repaint();
            try {
                Thread.sleep(50L);
            }
            catch (Exception exception) {}
            Thread.yield();
            if (!bl) continue;
        }
    }
}

