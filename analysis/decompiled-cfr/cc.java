/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

final class cc
extends Thread {
    private final jb b;

    cc(jb jb2) {
        this.b = jb2;
    }

    public final void run() {
        boolean bl = ab.xc;
        while (this.b.g) {
            try {
                this.b.e();
            }
            catch (IOException iOException) {
                String cfr_ignored_0 = "R Exception " + iOException;
                if (ab.B != null) {
                    String cfr_ignored_1 = "READ: " + iOException;
                }
                this.b.i();
            }
            try {
                cc.yield();
                cc.sleep(1L);
            }
            catch (Exception exception) {
                if (!bl) continue;
            }
        }
    }
}

