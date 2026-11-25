/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.bluetooth.ServiceRecord
 *  javax.microedition.io.Connection
 *  javax.microedition.io.StreamConnection
 *  javax.microedition.io.StreamConnectionNotifier
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.bluetooth.ServiceRecord;
import javax.microedition.io.Connection;
import javax.microedition.io.StreamConnection;
import javax.microedition.io.StreamConnectionNotifier;
import wfree.C;

final class ic
extends Thread {
    private final db b;

    ic(db db2) {
        this.b = db2;
    }

    public final void run() {
        boolean bl = ab.xc;
        this.b.b = 4;
        try {
            db.b(this.b, (StreamConnectionNotifier)C.open("btspp://localhost:" + f.g.toString()));
            this.b.t = db.k(this.b).getRecord((Connection)db.j(this.b)).getConnectionURL(0, false);
            String cfr_ignored_0 = "myurl='" + this.b.t + "'";
        }
        catch (Exception exception) {
            String cfr_ignored_1 = "cts notif ex " + exception;
            db.d(this.b, true);
            db.l(this.b).b(4);
            return;
        }
        boolean bl2 = false;
        StreamConnection streamConnection = null;
        for (int i2 = db.m(this.b).size() - 1; i2 >= 0; --i2) {
            Object object = (ServiceRecord)db.m(this.b).elementAt(i2);
            String cfr_ignored_2 = "cts rec" + i2;
            try {
                object = object.getConnectionURL(0, false);
                String cfr_ignored_3 = "cts url='" + (String)object + "'";
                streamConnection = (StreamConnection)C.open((String)object);
                if (db.e(this.b)) {
                    try {
                        streamConnection.close();
                        return;
                    }
                    catch (Exception exception) {
                        return;
                    }
                }
                object = streamConnection.openOutputStream();
                InputStream inputStream = streamConnection.openInputStream();
                ((OutputStream)object).write(ab.b(4));
                byte[] byArray = new byte[1];
                byte[] byArray2 = byArray;
                byArray[0] = (byte)this.b.t.length();
                ((OutputStream)object).write(byArray2);
                ((OutputStream)object).write(this.b.t.getBytes());
                byArray2[0] = ab.ec;
                ((OutputStream)object).write(byArray2);
                ((OutputStream)object).flush();
                byArray2 = new byte[4];
                inputStream.read(byArray2);
                if (db.e(this.b)) {
                    return;
                }
                int n2 = ab.b(byArray2[0], byArray2[1], byArray2[2], byArray2[3]);
                String cfr_ignored_4 = "rd ver=" + n2;
                if (n2 != 0) {
                    if (n2 > 4) {
                        db.d(this.b, true);
                        db.l(this.b).b(9);
                        return;
                    }
                    if (n2 < 4) {
                        db.d(this.b, true);
                        db.l(this.b).b(10);
                        return;
                    }
                }
                Thread.sleep(3000L);
                bl2 = true;
                break;
            }
            catch (IOException iOException) {
                String cfr_ignored_5 = "cts conn ex " + iOException;
                continue;
            }
            catch (Exception exception) {
                String cfr_ignored_6 = "cts conn ex " + exception;
                db.d(this.b, true);
                db.l(this.b).b(4);
                return;
            }
        }
        try {
            streamConnection.close();
        }
        catch (Exception exception) {}
        if (bl2) {
            this.b.b = 5;
            while (!db.e(this.b) && this.b.b == 5) {
                block27: {
                    try {
                        streamConnection = db.j(this.b).acceptAndOpen();
                        if (!db.e(this.b) && this.b.b == 5) break block27;
                        try {
                            streamConnection.close();
                        }
                        catch (Exception exception) {}
                        db.n(this.b);
                        return;
                    }
                    catch (Exception exception) {
                        if (!db.e(this.b)) {
                            String cfr_ignored_7 = "cts acpt ex " + exception;
                            Thread.yield();
                            if (!bl) continue;
                        }
                        break;
                    }
                }
                try {
                    InputStream inputStream = streamConnection.openInputStream();
                    OutputStream outputStream = streamConnection.openOutputStream();
                    this.b.d = new kb(db.o(this.b), inputStream, outputStream);
                }
                catch (Exception exception) {
                    String cfr_ignored_8 = "cts CC ex " + exception;
                    try {
                        streamConnection.close();
                    }
                    catch (Exception exception2) {}
                    Thread.yield();
                    continue;
                }
                db.b(this.b, streamConnection);
                db.n(this.b);
                return;
            }
        } else {
            db.i(this.b);
        }
    }
}

