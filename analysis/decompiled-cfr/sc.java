/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.media.Control
 *  javax.microedition.media.protocol.DataSource
 *  javax.microedition.media.protocol.SourceStream
 */
import javax.microedition.media.Control;
import javax.microedition.media.protocol.DataSource;
import javax.microedition.media.protocol.SourceStream;

public final class sc
extends DataSource {
    private String b;
    private String c;
    private z[] d;
    public int e;
    public int f;

    public sc(String string, String string2) {
        super(string);
        this.c = string;
        this.b = string2;
        this.d = new z[1];
        this.d[0] = new z(this.c, this.b);
    }

    public final void connect() {
    }

    public final void disconnect() {
    }

    public final void start() {
    }

    public final void stop() {
    }

    public final Control getControl(String string) {
        return null;
    }

    public final Control[] getControls() {
        return null;
    }

    public final SourceStream[] getStreams() {
        return this.d;
    }

    public final String getContentType() {
        return this.b;
    }

    public final void b() {
        this.d[0].b = 0L;
    }
}

