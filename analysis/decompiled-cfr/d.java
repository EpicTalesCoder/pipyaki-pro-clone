/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

public final class d {
    public int b;
    public int c;
    public pb d;
    public nb e;
    public byte f;
    public int g;
    public boolean h;
    public boolean i;

    public d(pb pb2, byte by, int n2, int n3, int n4) {
        Vector vector;
        boolean bl = ab.xc;
        if (j.c(n2 / 30, n3 / 30)) {
            return;
        }
        this.d = pb2;
        this.b = n2;
        this.c = n3;
        this.g = n4;
        this.f = by;
        this.h = false;
        if (fb.Wd != null) {
            int n5 = 0;
            for (by = 0; by < fb.Wd.size(); by = (byte)(by + 1)) {
                vector = fb.Wd;
                if (!bl) {
                    if (((d)vector.elementAt((int)by)).b / 30 != this.b / 30 || ((d)fb.Wd.elementAt((int)by)).c / 30 != this.c / 30 || ++n5 < 2) continue;
                    ((d)fb.Wd.elementAt((int)by)).i = true;
                    if (!bl) continue;
                }
                break;
            }
        } else {
            vector = fb.Wd;
        }
        if (vector != null) {
            fb.Wd.addElement(this);
        }
    }

    public d(nb nb2, int n2, int n3, int n4, boolean bl) {
        this.e = nb2;
        this.b = n2;
        this.c = n3;
        this.g = n4;
        this.h = bl;
        if (fb.Wd != null) {
            fb.Wd.addElement(this);
        }
    }
}

