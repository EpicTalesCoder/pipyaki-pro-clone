/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.media.Control
 *  javax.microedition.media.protocol.ContentDescriptor
 *  javax.microedition.media.protocol.SourceStream
 */
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import javax.microedition.media.Control;
import javax.microedition.media.protocol.ContentDescriptor;
import javax.microedition.media.protocol.SourceStream;

public final class z
implements SourceStream {
    public long b;
    private long c;
    private ContentDescriptor d;
    private byte[] e;

    public z(String string, String object) {
        boolean bl = ab.xc;
        this.b = 0L;
        this.c = 0L;
        this.e = null;
        try {
            block5: {
                int n2;
                this.d = new ContentDescriptor((String)object);
                object = this.getClass().getResourceAsStream(string);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] byArray = new byte[128];
                if (object == null) {
                    String cfr_ignored_0 = "!!! not found: " + string;
                }
                while ((n2 = ((InputStream)object).read(byArray)) > 0) {
                    byteArrayOutputStream.write(byArray, 0, n2);
                    if (!bl) {
                        if (!bl) continue;
                    }
                    break block5;
                }
                this.e = byteArrayOutputStream.toByteArray();
                this.c = this.e.length;
                this.b = 0L;
                String cfr_ignored_1 = "stream created. size = " + this.c;
            }
            return;
        }
        catch (Exception exception) {
            String cfr_ignored_2 = "MS in const " + exception;
            return;
        }
    }

    public final ContentDescriptor getContentDescriptor() {
        return this.d;
    }

    public final long getContentLength() {
        return this.c;
    }

    public final int read(byte[] byArray, int n2, int n3) {
        if (byArray == null) {
            throw new NullPointerException();
        }
        if (n2 < 0 || n3 < 0 || n2 + n3 > byArray.length) {
            throw new IndexOutOfBoundsException();
        }
        if (n3 == 0) {
            return 0;
        }
        if (this.b + (long)n3 > this.c) {
            n3 = (int)(this.c - this.b);
            if (ab.xc) {
                // empty if block
            }
        }
        if (n3 <= 0) {
            return -1;
        }
        System.arraycopy(this.e, (int)this.b, byArray, n2, n3);
        this.b += (long)n3;
        return n3;
    }

    public final Control getControl(String string) {
        return null;
    }

    public final Control[] getControls() {
        return null;
    }

    public final int getTransferSize() {
        return -1;
    }

    public final long seek(long l2) {
        if (l2 >= this.c) {
            l2 = this.c - 1L;
        }
        if (l2 < 0L) {
            l2 = 0L;
        }
        this.b = l2;
        return this.b;
    }

    public final long tell() {
        return this.b;
    }

    public final int getSeekType() {
        return 2;
    }
}

