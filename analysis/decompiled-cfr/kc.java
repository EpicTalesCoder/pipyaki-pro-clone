/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.bluetooth.DiscoveryListener
 */
import javax.bluetooth.DiscoveryListener;

final class kc
extends Thread {
    private final db b;

    kc(db db2) {
        this.b = db2;
    }

    public final void run() {
        if (db.d(this.b)) {
            try {
                kc.sleep(5000L);
            }
            catch (Exception exception) {}
        }
        if (db.e(this.b)) {
            return;
        }
        db.b(this.b, true);
        try {
            db.b(this.b, db.h(this.b).searchServices(null, f.h, db.f(this.b), (DiscoveryListener)db.g(this.b)));
            db.c(this.b, true);
            return;
        }
        catch (Exception exception) {
            String cfr_ignored_0 = "ss ex " + exception;
            db.i(this.b);
            return;
        }
    }
}

