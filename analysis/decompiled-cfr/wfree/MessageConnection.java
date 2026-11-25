/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connection
 */
package wfree;

import javax.microedition.io.Connection;
import wfree.Message;
import wfree.MessageListener;

public interface MessageConnection
extends Connection {
    public static final String TEXT_MESSAGE = "text";
    public static final String BINARY_MESSAGE = "binary";
    public static final String MULTIPART_MESSAGE = "multipart";

    public Message newMessage(String var1);

    public Message newMessage(String var1, String var2);

    public int numberOfSegments(Message var1);

    public Message receive();

    public void send(Message var1);

    public void setMessageListener(MessageListener var1);
}

