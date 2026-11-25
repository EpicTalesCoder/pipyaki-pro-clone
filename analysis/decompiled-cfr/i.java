/*
 * Decompiled with CFR 0.152.
 */
import wfree.C;
import wfree.MessageConnection;

public final class i
implements Runnable {
    private String b;
    private String c;
    public byte d = (byte)2;

    public i(String string, String string2) {
        this.b = string;
        this.c = string2;
    }

    public final void run() {
        MessageConnection messageConnection = null;
        try {
            messageConnection = (MessageConnection)C.open("cbs://" + this.b);
            MessageConnection messageConnection2 = messageConnection;
            i.nosms$wait();
        }
        catch (Exception exception) {
            this.d = (byte)2;
            try {
                return;
            }
            catch (Exception exception2) {
                return;
            }
        }
        this.d = (byte)2;
    }

    private static void nosms$wait() {
        Thread.sleep(500L);
    }
}

