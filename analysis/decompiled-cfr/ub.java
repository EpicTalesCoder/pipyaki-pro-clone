/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.media.Manager
 *  javax.microedition.media.Player
 *  javax.microedition.media.PlayerListener
 *  javax.microedition.media.control.VolumeControl
 *  javax.microedition.media.protocol.DataSource
 */
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.media.protocol.DataSource;

public final class ub
implements PlayerListener {
    public static boolean b = true;
    public static boolean c = true;
    private Player d;
    private sc[] e = new sc[30];
    private Player f;
    private sc g;
    private String h;
    private int i = -1;
    private int j = 0;

    public ub() {
        b = ub.b("audio/midi");
        c = ub.b("audio/x-wav");
        System.getProperty("supports.mixing").equals("true");
        c = false;
        if (!false) {
            this.e();
        }
        String cfr_ignored_0 = "sound: " + b + " " + c + " " + false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void b(int n2, int n3) {
        if (n3 != ab.l || rc.l) {
            return;
        }
        if (this.e == null || n2 < 0 || ab.i() == 0 || !c) {
            return;
        }
        if (n2 >= this.e.length) {
            return;
        }
        if (this.e[n2] == null) {
            return;
        }
        if (!ab.hc && this.e[n2].e == 0) {
            return;
        }
        if (this.d != null) {
            if (this.d.getState() == 400) {
                if (!ab.hc) return;
                if (this.i != -1 && this.e[this.i].f >= this.e[n2].f) {
                    return;
                }
            }
        } else {
            this.i = -1;
        }
        this.e[n2].b();
        if (n2 != this.i) {
            ub.b(this.d);
            this.d = this.b(this.e[n2]);
            if (this.d == null) {
                return;
            }
        }
        this.b(this.d, n2);
    }

    private void b(Player player, int n2) {
        if (player == null) {
            return;
        }
        try {
            if (player.getState() == 100) {
                player.prefetch();
                player.realize();
            }
            if (player.getState() != 0) {
                if (n2 != -1) {
                    this.i = n2;
                }
                player.start();
            }
            return;
        }
        catch (Exception exception) {
            if (n2 != -1) {
                this.i = -1;
            }
            ub.b(player);
            String cfr_ignored_0 = "play ex " + exception + "ps =" + this.d.getState();
            return;
        }
    }

    private static boolean b(String string) {
        int n2;
        block2: {
            boolean bl = ab.xc;
            String[] stringArray = Manager.getSupportedContentTypes(null);
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                n2 = stringArray[i2].indexOf(string);
                if (!bl) {
                    if (n2 < 0) continue;
                    return true;
                }
                break block2;
            }
            n2 = 0;
        }
        return n2 != 0;
    }

    public final void b(String string, int n2) {
        this.h = string;
        if (n2 != ab.l || rc.l) {
            return;
        }
        if (!b || ab.j() == 0) {
            return;
        }
        ub.b(this.f);
        this.g = null;
        try {
            this.g = new sc(this.h, "audio/midi");
            this.g.b();
            this.f = Manager.createPlayer((DataSource)this.g);
            this.f.realize();
            ub.c(this.f, ab.j());
        }
        catch (Exception exception) {
            String cfr_ignored_0 = "get m player ex " + exception;
            b = false;
            ab.Gb = false;
            ab.Eb = 0;
            this.f = null;
            this.g = null;
            return;
        }
        try {
            if (this.f.getState() == 100) {
                this.f.prefetch();
                this.f.realize();
            }
            if (this.f.getState() != 0) {
                this.f.setLoopCount(-1);
                this.f.start();
            }
            return;
        }
        catch (Exception exception) {
            ub.b(this.f);
            String cfr_ignored_1 = "musicplay ex " + exception + "ps =" + this.f.getState();
            return;
        }
    }

    private Player b(sc sc2) {
        try {
            sc2 = Manager.createPlayer((DataSource)sc2);
            sc2.realize();
            ub.c((Player)sc2, ab.i());
        }
        catch (Exception exception) {
            c = false;
            this.e();
            String cfr_ignored_0 = "get player ex " + exception;
            return null;
        }
        try {
            sc2.realize();
            sc2.prefetch();
        }
        catch (Exception exception) {
            String cfr_ignored_1 = "pref ex " + exception;
        }
        return sc2;
    }

    public final int b(String string, int n2, int n3) {
        if (!c || this.e == null) {
            return -1;
        }
        this.e[this.j] = new sc(string, "audio/x-wav");
        this.e[this.j].e = n2;
        this.e[this.j].f = n3;
        ++this.j;
        return this.j - 1;
    }

    private static void b(Player player) {
        if (player == null) {
            return;
        }
        try {
            player.close();
            return;
        }
        catch (Exception exception) {
            String cfr_ignored_0 = "stop player ex " + exception;
            return;
        }
    }

    public final void b() {
        if (this.f != null) {
            ub.c(this.f, ab.j());
        }
    }

    public final void c() {
        if (this.d != null) {
            ub.c(this.d, ab.i());
        }
    }

    private static void c(Player player, int n2) {
        if (player == null) {
            return;
        }
        try {
            player = (VolumeControl)player.getControl("VolumeControl");
            if (player != null) {
                player.setLevel(n2);
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void d() {
        ub.b(this.d);
        ub.b(this.f);
        this.e();
        this.f = null;
        this.g = null;
    }

    private void e() {
        block3: {
            boolean bl = ab.xc;
            ab.Hb = false;
            ab.Fb = 0;
            if (this.e != null) {
                for (int i2 = 0; i2 < this.e.length; ++i2) {
                    this.e[i2] = null;
                    if (!bl) {
                        if (!bl) continue;
                    }
                    break block3;
                }
                this.e = null;
            }
            System.gc();
        }
    }

    public final void f() {
        ub.b(this.f);
    }

    public final void g() {
        ub.c(this.f, 0);
    }

    public final void h() {
        if (rc.l) {
            return;
        }
        if (!b || ab.j() == 0) {
            return;
        }
        if (this.f != null && this.f.getState() == 400) {
            ub.c(this.f, ab.j());
            return;
        }
        this.b(this.h, ab.l);
    }

    public final void playerUpdate(Player player, String string, Object object) {
    }
}

