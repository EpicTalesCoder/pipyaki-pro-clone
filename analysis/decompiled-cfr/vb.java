/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Vector;

final class vb {
    public String b;
    public byte c;
    public String d;
    public byte e;

    public vb(n n2, String string) {
        this.d = "";
        this.b = string;
    }

    public final void b(byte by) {
        this.e = 0;
        this.c = by;
    }

    public vb(n n2, Vector vector, ByteArrayInputStream byteArrayInputStream) {
        block6: {
            block5: {
                this.d = "";
                int n3 = byteArrayInputStream.read();
                if (n3 <= 0) {
                    throw new IOException();
                }
                byte[] byArray = new byte[n3];
                byteArrayInputStream.read(byArray);
                this.b = new String(byArray);
                this.e = (byte)byteArrayInputStream.read();
                if (this.e != 0) break block5;
                this.c = (byte)byteArrayInputStream.read();
                if (!ab.xc) break block6;
            }
            if (this.e == 1) {
                int n4 = byteArrayInputStream.read();
                byte[] byArray = new byte[n4];
                byteArrayInputStream.read(byArray);
                this.d = new String(byArray);
            }
        }
        vector.addElement(this);
    }

    static String b(vb vb2) {
        if (vb2.e == 0) {
            return "" + vb2.c;
        }
        if (vb2.e == 1) {
            return vb2.d;
        }
        return "";
    }
}

