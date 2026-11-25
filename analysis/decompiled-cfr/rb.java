/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.HttpConnection
 */
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import javax.microedition.io.HttpConnection;
import wfree.C;

public final class rb
implements Runnable {
    private Thread b;
    private String c;
    public String d;
    public boolean e;
    private HttpConnection f = null;
    private InputStream g = null;
    private ByteArrayOutputStream h = null;

    public rb(String string, long l2) {
        this.c = string;
        this.b = new Thread(this);
        this.b.start();
        System.currentTimeMillis();
    }

    public final void run() {
        boolean bl = ab.xc;
        this.e = false;
        try {
            block13: {
                int n2;
                this.f = (HttpConnection)C.open(this.c);
                this.g = this.f.openInputStream();
                this.h = new ByteArrayOutputStream();
                ab.b("networkConnector: sent = " + this.c);
                if (this.f == null || this.g == null || this.h == null) {
                    throw new Exception();
                }
                while ((n2 = this.g.read()) != -1) {
                    this.h.write(n2);
                    if (!bl) {
                        if (!bl) continue;
                    }
                    break block13;
                }
                this.d = this.h.toString();
                this.h.toByteArray();
            }
            if (this.h != null) {
                this.h.close();
            }
            if (this.g != null) {
                this.g.close();
            }
            if (this.f != null) {
                this.f.close();
            }
            ab.b("networkConnector: received = " + this.d);
        }
        catch (Exception exception) {
            try {
                if (this.h != null) {
                    this.h.close();
                }
                if (this.g != null) {
                    this.g.close();
                }
                if (this.f != null) {
                    this.f.close();
                }
            }
            catch (Exception exception2) {}
            this.d = null;
            ab.b("networkConnector: fail " + exception);
        }
        this.e = true;
    }

    public static String[] b(String string, char n2) {
        boolean bl = ab.xc;
        if (string != null) {
            String[] stringArray;
            int n3;
            int n4;
            block8: {
                int n5;
                block7: {
                    n4 = 1;
                    for (n3 = 0; n3 < string.length(); ++n3) {
                        n5 = string.charAt(n3);
                        if (!bl) {
                            if (n5 != n2) continue;
                            ++n4;
                            if (!bl) continue;
                        }
                        break block7;
                    }
                    n5 = n4;
                }
                stringArray = new String[n5];
                for (n3 = 0; n3 < stringArray.length; ++n3) {
                    stringArray[n3] = "";
                    if (!bl) {
                        if (!bl) continue;
                    }
                    break block8;
                }
                n4 = 0;
            }
            for (n3 = 0; n3 < string.length(); ++n3) {
                if (string.charAt(n3) == n2) {
                    if (n3 == 0) continue;
                    ++n4;
                    if (!bl) continue;
                }
                if (string.charAt(n3) == '\n') continue;
                int n6 = n4;
                stringArray[n6] = stringArray[n6] + "" + string.charAt(n3);
                if (!bl) continue;
            }
            return stringArray;
        }
        return null;
    }
}

