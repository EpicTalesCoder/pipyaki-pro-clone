/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class kb
extends jb {
    private InputStream p;
    private OutputStream q;
    private boolean r;

    public kb(c c2, InputStream inputStream, OutputStream outputStream) {
        block9: {
            byte by;
            block11: {
                block10: {
                    boolean bl;
                    block8: {
                        bl = ab.xc;
                        super(c2);
                        this.r = false;
                        this.p = inputStream;
                        this.q = outputStream;
                        this.a();
                        if (c2.b()) break block8;
                        this.c();
                        if (!bl) break block9;
                    }
                    if (this.d == 0) break block9;
                    by = -1;
                    if (this.d >= 4) break block10;
                    by = 9;
                    if (!bl) break block11;
                }
                if (this.d > 4) {
                    by = 10;
                }
            }
            if (by != -1) {
                this.b(new byte[]{111, by});
                try {
                    this.d();
                }
                catch (IOException iOException) {}
                this.j();
            }
        }
        c2.b("c");
    }

    public final void b() {
        this.g = false;
        try {
            this.p.close();
        }
        catch (Exception exception) {}
        try {
            this.q.close();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    protected final void d() {
        block3: {
            boolean bl = ab.xc;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (this.h.size() > 0) {
                byte[] byArray = (byte[])this.h.elementAt(0);
                this.h.removeElementAt(0);
                if (byArray.length <= 0) continue;
                byteArrayOutputStream.write(ab.b(byArray.length));
                byteArrayOutputStream.write(byArray);
                if (!bl) {
                    if (!bl) continue;
                }
                break block3;
            }
            if (byteArrayOutputStream.size() > 0) {
                this.q.write(byteArrayOutputStream.toByteArray());
                this.q.flush();
            }
        }
    }

    protected final void e() {
        if (this.r) {
            return;
        }
        this.r = true;
        byte[] byArray = new byte[4];
        this.a(byArray);
        byArray = new byte[ab.b(byArray)];
        this.a(byArray);
        this.c(byArray);
        this.r = false;
    }

    private void a(byte[] byArray) {
        int n2 = 0;
        byte[] byArray2 = new byte[1];
        do {
            int n3;
            if ((n3 = this.p.read(byArray2)) <= 0) continue;
            byArray[n2] = byArray2[0];
            ++n2;
        } while (n2 != byArray.length);
    }
}

