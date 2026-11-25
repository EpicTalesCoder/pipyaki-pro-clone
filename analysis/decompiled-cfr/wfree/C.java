/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connection
 *  javax.microedition.io.Connector
 */
package wfree;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import javax.microedition.io.Connection;
import javax.microedition.io.Connector;
import wfree.M;
import wfree.Message;
import wfree.MessageConnection;
import wfree.MessageListener;

public class C
implements MessageConnection {
    public static final int READ = 1;
    public static final int WRITE = 2;
    public static final int READ_WRITE = 3;
    boolean c;

    public static boolean m(String string) {
        return string != null && ((string = string.trim().toLowerCase()).startsWith("sms:") || string.startsWith("mms:") || string.startsWith("cbs:") || string.startsWith("smsto:") || string.startsWith("mmsto:"));
    }

    public static Connection open(String string) {
        if (C.m(string)) {
            return new C();
        }
        return Connector.open((String)string);
    }

    public static Connection open(String string, int n2) {
        if (C.m(string)) {
            return new C();
        }
        return Connector.open((String)string, (int)n2);
    }

    public static Connection open(String string, int n2, boolean bl) {
        if (C.m(string)) {
            return new C();
        }
        return Connector.open((String)string, (int)n2, (boolean)bl);
    }

    public static DataInputStream openDataInputStream(String string) {
        return Connector.openDataInputStream((String)string);
    }

    public static DataOutputStream openDataOutputStream(String string) {
        return Connector.openDataOutputStream((String)string);
    }

    public static InputStream openInputStream(String string) {
        return Connector.openInputStream((String)string);
    }

    public static OutputStream openOutputStream(String string) {
        return Connector.openOutputStream((String)string);
    }

    public synchronized void close() {
        this.c = true;
        this.notifyAll();
    }

    public Message newMessage(String string) {
        return new M();
    }

    public Message newMessage(String string, String string2) {
        M m2 = new M();
        m2.setAddress(string2);
        return m2;
    }

    public int numberOfSegments(Message message) {
        return 1;
    }

    public synchronized Message receive() {
        while (!this.c) {
            this.wait();
        }
        throw new InterruptedIOException();
    }

    public void send(Message message) {
        Thread.sleep(500L);
    }

    public void setMessageListener(MessageListener messageListener) {
    }
}

