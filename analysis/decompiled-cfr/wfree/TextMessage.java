/*
 * Decompiled with CFR 0.152.
 */
package wfree;

import wfree.Message;

public interface TextMessage
extends Message {
    public String getPayloadText();

    public void setPayloadText(String var1);
}

