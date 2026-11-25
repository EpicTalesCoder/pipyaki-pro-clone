/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.bluetooth.LocalDevice
 *  javax.microedition.rms.RecordStore
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Vector;
import javax.bluetooth.LocalDevice;
import javax.microedition.rms.RecordStore;

public final class n {
    private String b;
    private Vector c;

    public n(String object, boolean bl) {
        block9: {
            this.b = object;
            this.c = new Vector();
            if (bl) {
                try {
                    RecordStore recordStore = RecordStore.openRecordStore((String)this.b, (boolean)false);
                    object = new ByteArrayInputStream(recordStore.getRecord(1));
                    recordStore.closeRecordStore();
                }
                catch (Exception exception) {
                    String cfr_ignored_0 = "r err: " + exception;
                    return;
                }
                try {
                    while (true) {
                        new vb(this, this.c, (ByteArrayInputStream)object);
                    }
                }
                catch (Exception exception) {
                    String cfr_ignored_1 = "size=" + this.c.size();
                    if (this.c.size() <= 0) break block9;
                    object = this;
                    try {
                        if (super.g().equals(((n)object).f(" "))) {
                            return;
                        }
                    }
                    catch (Exception exception2) {}
                    ((n)object).c.removeAllElements();
                }
            }
        }
    }

    public final void b() {
        Object object;
        boolean bl = ab.xc;
        if (this.c.size() > 0) {
            object = this;
            ((n)object).b("t", "" + System.currentTimeMillis());
            ((n)object).b(" ", ((n)object).g());
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream;
            RecordStore recordStore;
            block14: {
                block13: {
                    int n2;
                    block12: {
                        recordStore = RecordStore.openRecordStore((String)this.b, (boolean)true);
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        for (int i2 = 0; i2 < this.c.size(); ++i2) {
                            object = (vb)this.c.elementAt(i2);
                            ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                            try {
                                byteArrayOutputStream2.write((byte)((vb)object).b.length());
                                byteArrayOutputStream2.write(((vb)object).b.getBytes());
                                byteArrayOutputStream2.write(((vb)object).e);
                                n2 = ((vb)object).e;
                                if (!bl) {
                                    if (n2 == 0) {
                                        byteArrayOutputStream2.write(((vb)object).c);
                                        if (!bl) continue;
                                    }
                                    if (((vb)object).e != 1) continue;
                                    byteArrayOutputStream2.write((byte)((vb)object).d.length());
                                    byteArrayOutputStream2.write(((vb)object).d.getBytes());
                                    continue;
                                }
                                break block12;
                            }
                            catch (IOException iOException) {}
                            if (!bl) continue;
                        }
                        byteArrayOutputStream.flush();
                        n2 = recordStore.getNextRecordID();
                    }
                    if (n2 != 1) break block13;
                    recordStore.addRecord(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                    if (!bl) break block14;
                }
                recordStore.setRecord(1, byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
            }
            recordStore.closeRecordStore();
            byteArrayOutputStream.close();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void c() {
        try {
            this.c.removeAllElements();
            this.c = null;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void b(String object, byte by) {
        object = this.c((String)object, true);
        ((vb)object).b(by);
    }

    public final void b(String string, long l2) {
        this.b(string, "" + l2);
    }

    public final void b(String object, String string) {
        vb vb2 = this.c((String)object, true);
        object = vb2;
        object = vb2;
        vb2.e = 1;
        ((vb)object).d = string;
    }

    public final void b(String object, boolean bl) {
        object = this.c((String)object, true);
        if (bl) {
            ((vb)object).b((byte)1);
            return;
        }
        ((vb)object).b((byte)0);
    }

    public final byte b(String object) {
        if ((object = this.c((String)object, false)) == null) {
            throw new a();
        }
        return ((vb)object).c;
    }

    public final int c(String string) {
        string = this.f(string);
        return Integer.parseInt(string);
    }

    public final long d(String string) {
        string = this.f(string);
        return Long.parseLong(string);
    }

    public final boolean e(String string) {
        byte by = this.b(string);
        return by == 1;
    }

    public final String f(String object) {
        if ((object = this.c((String)object, false)) == null) {
            throw new a();
        }
        return ((vb)object).d;
    }

    private vb c(String string, boolean bl) {
        boolean bl2;
        vb vb2;
        block3: {
            boolean bl3 = ab.xc;
            for (int i2 = 0; i2 < this.c.size(); ++i2) {
                vb2 = (vb)this.c.elementAt(i2);
                bl2 = vb2.b.equals(string);
                if (!bl3) {
                    if (!bl2) continue;
                    return vb2;
                }
                break block3;
            }
            bl2 = bl;
        }
        if (bl2) {
            vb2 = new vb(this, string);
            this.c.addElement(vb2);
            return vb2;
        }
        return null;
    }

    public static String d() {
        String string;
        boolean bl = ab.xc;
        String string2 = null;
        try {
            string = System.getProperty("microedition.platform");
        }
        catch (Exception exception) {
            string = null;
        }
        if (string != null) {
            try {
                if (string.indexOf("Sony") >= 0) {
                    string2 = System.getProperty("com.sonyericsson.imei");
                } else if (string.indexOf("Samsung") >= 0) {
                    string2 = System.getProperty("com.samsung.imei");
                } else if (string.indexOf("Moto") >= 0) {
                    string2 = System.getProperty("com.motorola.IMEI");
                } else if (string.indexOf("Nokia") >= 0) {
                    string2 = System.getProperty("phone.imei");
                    if (string2 == null) {
                        string2 = System.getProperty("com.nokia.IMEI");
                    }
                    if (string2 == null) {
                        string2 = System.getProperty("com.nokia.mid.imei");
                    }
                } else if (string.indexOf("Siemens") >= 0) {
                    string2 = System.getProperty("com.siemens.imei");
                }
            }
            catch (Exception exception) {
                string2 = null;
            }
        }
        if (string2 == null) {
            string2 = "";
        }
        if (string2.equals("")) {
            try {
                string2 = System.getProperty("IMEI");
            }
            catch (Exception exception) {
                string2 = null;
            }
        }
        if (string2 == null) {
            string2 = "";
        }
        if (!string2.equals("")) {
            String string3;
            block24: {
                String string4 = "";
                for (int i2 = 0; i2 < string2.length(); ++i2) {
                    string3 = string2;
                    if (!bl) {
                        char c2 = string3.charAt(i2);
                        if (c2 < '0' || c2 > '9') continue;
                        string4 = string4 + c2;
                        if (!bl) continue;
                    }
                    break block24;
                }
                string3 = string4;
            }
            string2 = string3;
        }
        return string2;
    }

    public static String e() {
        try {
            Class.forName("javax.bluetooth.LocalDevice");
            String string = LocalDevice.getLocalDevice().getFriendlyName();
            if (string == null) {
                string = "";
            }
            return string;
        }
        catch (Throwable throwable) {
            return "";
        }
    }

    private String f() {
        try {
            return this.f("t");
        }
        catch (Exception exception) {
            return " ";
        }
    }

    private String g() {
        String string;
        Object object;
        int n2;
        Object object2;
        Object object3;
        boolean bl;
        block3: {
            bl = ab.xc;
            object3 = n.d() + this.f();
            object2 = "";
            for (n2 = 0; n2 < this.c.size(); ++n2) {
                object = (vb)this.c.elementAt(n2);
                string = ((vb)object).b;
                if (!bl) {
                    if (string.equals(" ")) continue;
                    object2 = (String)object2 + vb.b((vb)object);
                    if (!bl) continue;
                }
                break block3;
            }
            string = object3;
        }
        object3 = string.getBytes();
        object2 = ((String)object2).getBytes();
        object = new byte[((Object)object3).length];
        n2 = 0;
        for (int i2 = 0; i2 < ((Object)object2).length; ++i2) {
            object[n2] = (byte)(object3[n2] + object2[n2] + n2 - i2);
            if (++n2 != ((Object)object3).length) continue;
            n2 = 0;
            if (!bl) continue;
        }
        return new String((byte[])object);
    }
}

