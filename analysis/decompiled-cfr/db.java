/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.bluetooth.DeviceClass
 *  javax.bluetooth.DiscoveryAgent
 *  javax.bluetooth.DiscoveryListener
 *  javax.bluetooth.LocalDevice
 *  javax.bluetooth.RemoteDevice
 *  javax.bluetooth.ServiceRecord
 *  javax.microedition.io.StreamConnection
 *  javax.microedition.io.StreamConnectionNotifier
 */
import java.io.IOException;
import java.util.Vector;
import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;
import javax.microedition.io.StreamConnection;
import javax.microedition.io.StreamConnectionNotifier;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class db
extends cb
implements Runnable,
DiscoveryListener {
    private boolean a;
    private int e;
    private LocalDevice f;
    private DiscoveryAgent g;
    private StreamConnectionNotifier h = null;
    private StreamConnection i;
    private RemoteDevice j;
    private boolean k;
    private Vector l = new Vector();
    private Vector m = new Vector();
    private Vector n = new Vector();
    private int o;
    private c p;
    private ob q;
    private boolean r;
    private db s;
    public String t;
    private boolean u;

    db(c object, ob ob2) {
        this.q = ob2;
        this.p = object;
        this.s = this;
        object = new Thread(this);
        ((Thread)object).start();
    }

    public final void run() {
        block6: {
            boolean bl = ab.xc;
            try {
                this.f = LocalDevice.getLocalDevice();
                this.g = this.f.getDiscoveryAgent();
            }
            catch (Exception exception) {
                this.q.b(0);
                this.k = true;
                return;
            }
            db db2 = this;
            this.b = 1;
            RemoteDevice[] remoteDeviceArray = db2.g.retrieveDevices(0);
            if (remoteDeviceArray == null) {
                db2.e();
                return;
            }
            if (remoteDeviceArray.length == 0) {
                db2.e();
                return;
            }
            for (int i2 = 0; i2 < remoteDeviceArray.length; ++i2) {
                db2.b(remoteDeviceArray[i2]);
                if (!bl) {
                    if (!bl) continue;
                }
                break block6;
            }
            db2.b = 2;
            db2.q.b();
        }
    }

    private void e() {
        this.p.b("i");
        this.b = 1;
        this.l.removeAllElements();
        this.m.removeAllElements();
        try {
            this.g.startInquiry(10390323, (DiscoveryListener)this);
            this.p.b("I");
            return;
        }
        catch (Exception exception) {
            this.j();
            return;
        }
    }

    private void j() {
        this.q.b(0);
        this.k = true;
    }

    public final void deviceDiscovered(RemoteDevice remoteDevice, DeviceClass deviceClass) {
        if (this.b != 1 || this.k) {
            return;
        }
        this.b(remoteDevice);
    }

    private void b(RemoteDevice remoteDevice) {
        block7: {
            String string;
            block9: {
                block8: {
                    if (this.k) {
                        return;
                    }
                    if (this.l.indexOf(remoteDevice) != -1) break block7;
                    this.l.addElement(remoteDevice);
                    string = null;
                    try {
                        string = remoteDevice.getFriendlyName(false);
                    }
                    catch (IOException iOException) {}
                    if (string == null) {
                        string = "";
                    }
                    if (!string.equals("")) break block8;
                    string = "Unknown device";
                    if (!ab.xc) break block9;
                }
                string = ab.c(string);
            }
            this.m.addElement(string);
            this.q.b(string);
        }
    }

    public final void inquiryCompleted(int n2) {
        boolean bl = ab.xc;
        if (!this.k && this.b == 3 && this.j != null) {
            this.k();
            return;
        }
        if (this.b != 1 || this.k) {
            return;
        }
        switch (n2) {
            case 7: {
                this.p.b("e");
                this.j();
                return;
            }
            case 5: {
                this.p.b("t");
                if (!bl) break;
            }
            case 0: {
                this.p.b("q");
                if (!bl) break;
            }
            default: {
                this.p.b("E");
                this.j();
                return;
            }
        }
        this.b = 2;
        this.q.b();
    }

    public final void c() {
        this.p.b("r");
        if (this.b == 2) {
            this.e();
        }
    }

    public final void d() {
        if (this.k) {
            return;
        }
        this.b = 2;
        try {
            this.g.cancelInquiry((DiscoveryListener)this.s);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void b(int n2) {
        if (this.b != 2 && this.b != 1) {
            return;
        }
        this.a = false;
        this.e = 0;
        this.r = false;
        if (n2 < this.m.size()) {
            this.j = (RemoteDevice)this.l.elementAt(n2);
            if (this.b == 1) {
                try {
                    this.b = 3;
                    this.g.cancelInquiry((DiscoveryListener)this);
                    new jc(this).start();
                    return;
                }
                catch (Exception exception) {}
            }
            this.k();
        }
    }

    private void k() {
        if (this.u) {
            return;
        }
        this.a = true;
        this.b = 3;
        this.n.removeAllElements();
        new kc(this).start();
    }

    public final void servicesDiscovered(int n2, ServiceRecord[] serviceRecordArray) {
        boolean bl = ab.xc;
        if (this.b != 3 || this.k) {
            return;
        }
        for (n2 = 0; n2 < serviceRecordArray.length; ++n2) {
            this.n.addElement(serviceRecordArray[n2]);
            if (!bl) continue;
        }
    }

    public final void serviceSearchCompleted(int n2, int n3) {
        this.u = false;
        if (this.b != 3 || this.k) {
            return;
        }
        if (this.n.size() > 0) {
            db db2 = this;
            new ic(db2).start();
            return;
        }
        String cfr_ignored_0 = "ssc no services " + n3;
        this.l();
    }

    private void l() {
        if (!this.k) {
            ++this.e;
            if (this.e <= 3) {
                this.p.b("R!");
                this.k();
                return;
            }
            this.b = 2;
            this.q.b(1);
        }
    }

    private void m() {
        try {
            this.h.close();
        }
        catch (Exception exception) {}
        this.h = null;
    }

    public final void f() {
        this.k = true;
        this.b = 7;
        try {
            this.g.cancelInquiry((DiscoveryListener)this);
        }
        catch (Exception exception) {}
        try {
            this.g.cancelServiceSearch(this.o);
        }
        catch (Exception exception) {}
        try {
            this.l.removeAllElements();
        }
        catch (Exception exception) {}
        try {
            this.m.removeAllElements();
        }
        catch (Exception exception) {}
        try {
            this.n.removeAllElements();
        }
        catch (Exception exception) {}
        this.m();
        db db2 = this;
        try {
            db2.d.b();
        }
        catch (Exception exception) {}
        db2.d = null;
        try {
            db2.i.close();
        }
        catch (Exception exception) {}
        db2.i = null;
        this.j = null;
        this.s = null;
        this.p = null;
        this.q = null;
    }

    public final int e() {
        return this.m.size();
    }

    public final void a() {
        this.d.k();
    }

    public final void b() {
        this.d.l();
    }

    static boolean b(db db2) {
        return db2.a;
    }

    static void c(db db2) {
        db2.k();
    }

    static boolean d(db db2) {
        return db2.r;
    }

    static boolean e(db db2) {
        return db2.k;
    }

    static boolean b(db db2, boolean bl) {
        db2.r = true;
        return true;
    }

    static int b(db db2, int n2) {
        db2.o = n2;
        return db2.o;
    }

    static RemoteDevice f(db db2) {
        return db2.j;
    }

    static db g(db db2) {
        return db2.s;
    }

    static DiscoveryAgent h(db db2) {
        return db2.g;
    }

    static boolean c(db db2, boolean bl) {
        db2.u = true;
        return true;
    }

    static void i(db db2) {
        db2.l();
    }

    static StreamConnectionNotifier b(db db2, StreamConnectionNotifier streamConnectionNotifier) {
        db2.h = streamConnectionNotifier;
        return db2.h;
    }

    static StreamConnectionNotifier j(db db2) {
        return db2.h;
    }

    static LocalDevice k(db db2) {
        return db2.f;
    }

    static boolean d(db db2, boolean bl) {
        db2.k = true;
        return true;
    }

    static ob l(db db2) {
        return db2.q;
    }

    static Vector m(db db2) {
        return db2.n;
    }

    static void n(db db2) {
        db2.m();
    }

    static c o(db db2) {
        return db2.p;
    }

    static StreamConnection b(db db2, StreamConnection streamConnection) {
        db2.i = streamConnection;
        return db2.i;
    }
}

