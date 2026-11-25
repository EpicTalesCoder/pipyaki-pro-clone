/*
 * Decompiled with CFR 0.152.
 */
package wfree;

import wfree.Message;

public interface BinaryMessage
extends Message {
    public byte[] getPayloadData();

    public void setPayloadData(byte[] var1);
}

