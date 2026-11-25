/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.bluetooth.LocalDevice
 *  javax.bluetooth.UUID
 *  javax.microedition.io.StreamConnection
 *  javax.microedition.io.StreamConnectionNotifier
 */
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.UUID;
import javax.microedition.io.StreamConnection;
import javax.microedition.io.StreamConnectionNotifier;
import wfree.C;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class f
extends e {
    private int a;
    public static final UUID g = new UUID("F0E0D0C0B0A000908070605040302010", false);
    public static final UUID[] h = new UUID[]{g};
    private LocalDevice i;
    private StreamConnectionNotifier j;
    public boolean k = false;
    private Vector l = new Vector();
    private Vector m = new Vector();
    private boolean n;
    private StringBuffer o;

    f(c c2, ob ob2) {
        super(c2, ob2);
        try {
            this.i = LocalDevice.getLocalDevice();
            boolean bl = this.i.setDiscoverable(10390323);
            String cfr_ignored_0 = "discoverable=" + bl;
            this.o = new StringBuffer("btspp://");
            this.o.append("localhost").append(':');
            this.o.append(g.toString());
            this.o.append(";name=Ujaki");
        }
        catch (Exception exception) {
            String cfr_ignored_1 = "run ex " + exception;
            this.f.b(2);
            return;
        }
        this.k = true;
        this.b = 1;
        xb xb2 = new xb(this);
        xb2.start();
    }

    public final void b() {
        try {
            this.j = (StreamConnectionNotifier)C.open(this.o.toString());
            return;
        }
        catch (Exception exception) {
            String cfr_ignored_0 = "open notif ex " + exception;
            this.f.b(2);
            return;
        }
    }

    public static String b(String string) {
        return string.substring(0, 20);
    }

    public final void l() {
        this.b = 3;
        this.k = false;
        this.c();
        this.a = 0;
        new ec(this).start();
    }

    public final boolean b(eb eb2) {
        String cfr_ignored_0 = "C! url='" + eb2.b + "'";
        try {
            StreamConnection streamConnection = (StreamConnection)C.open(eb2.b);
            Object object = streamConnection.openInputStream();
            OutputStream outputStream = streamConnection.openOutputStream();
            object = new kb(this.e, (InputStream)object, outputStream);
            v0.d = eb2.d;
            ((kb)object).c = eb2.c;
            this.l.addElement(streamConnection);
            this.d.addElement(object);
            return true;
        }
        catch (IOException iOException) {
            String cfr_ignored_1 = "C ex " + iOException;
        }
        catch (Exception exception) {
            String cfr_ignored_2 = "C ex " + exception;
            this.c = true;
            this.f.b(5);
        }
        return false;
    }

    public final int b() {
        if (this.b == 0 || this.b == 1) {
            return this.m.size();
        }
        return this.d.size();
    }

    public final void b(byte[] byArray) {
        boolean bl = ab.xc;
        for (int i2 = 0; i2 < this.d.size(); ++i2) {
            kb kb2 = (kb)this.d.elementAt(i2);
            kb2.b(byArray);
            if (!bl) continue;
        }
    }

    public final void b(byte[] byArray, byte by) {
        boolean bl = ab.xc;
        for (int i2 = 0; i2 < this.d.size(); ++i2) {
            kb kb2 = (kb)this.d.elementAt(i2);
            if (by == kb2.e) continue;
            kb2.b(byArray);
            if (!bl) continue;
        }
    }

    public final void b(int n2, byte[] byArray) {
        kb kb2 = (kb)this.d.elementAt(n2);
        kb2.b(byArray);
    }

    public final void d() {
        block4: {
            boolean bl = ab.xc;
            this.c = true;
            this.k = false;
            this.c();
            this.k();
            while (this.l.size() != 0) {
                StreamConnection streamConnection = (StreamConnection)this.l.elementAt(0);
                this.l.removeElementAt(0);
                try {
                    streamConnection.close();
                    if (!bl) {
                        continue;
                    }
                    break block4;
                }
                catch (Exception exception) {
                    if (!bl) continue;
                }
            }
            this.m.removeAllElements();
            this.f = null;
            this.e = null;
        }
    }

    public final void c() {
        if (this.j != null) {
            try {
                this.j.close();
            }
            catch (Exception exception) {}
            this.j = null;
        }
    }

    public final void b(String string, int n2, byte[] byArray, byte by, boolean n3, boolean bl) {
        boolean bl2 = ab.xc;
        this.b = 6;
        for (n3 = 0; n3 < this.d.size(); ++n3) {
            boolean bl3 = bl;
            boolean bl4 = false;
            byte by2 = by;
            byte[] byArray2 = byArray;
            int n4 = n2;
            String string2 = string;
            byte by3 = (byte)(n3 + 2);
            jb jb2 = (jb)this.d.elementAt(n3);
            f f2 = this;
            jb2.b(n4);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(1);
                byteArrayOutputStream.write(by2);
                byteArrayOutputStream.write((byte)(bl4 ? 1 : 0));
                byteArrayOutputStream.write((byte)(bl3 ? 1 : 0));
                byteArrayOutputStream.write(by3);
                byteArrayOutputStream.write((byte)string2.getBytes().length);
                byteArrayOutputStream.write(string2.getBytes());
                byteArrayOutputStream.write(n4);
                byteArrayOutputStream.write(byArray2);
            }
            catch (Exception exception) {}
            jb2.e = by3;
            ((e)f2).b(jb2, byteArrayOutputStream.toByteArray());
            if (!bl2) continue;
        }
    }

    public final void b(jb jb2, byte[] byArray) {
        jb2.b(byArray);
        jb2.g();
    }

    static StreamConnectionNotifier b(f f2) {
        return f2.j;
    }

    static Vector c(f f2) {
        return f2.m;
    }

    static boolean d(f f2) {
        return f2.n;
    }

    static boolean b(f f2, boolean bl) {
        f2.n = true;
        return true;
    }

    static int e(f f2) {
        return f2.a++;
    }

    static int f(f f2) {
        return f2.a;
    }

    static int b(f f2, int n2) {
        f2.a = 0;
        return 0;
    }
}

