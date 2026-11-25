/*
 * Decompiled with CFR 0.152.
 */
package wfree;

import wfree.Message;
import wfree.MessagePart;

public interface MultipartMessage
extends Message {
    public boolean addAddress(String var1, String var2);

    public void addMessagePart(MessagePart var1);

    public String[] getAddresses(String var1);

    public String getHeader(String var1);

    public MessagePart getMessagePart(String var1);

    public MessagePart[] getMessageParts();

    public String getStartContentId();

    public String getSubject();

    public boolean removeAddress(String var1, String var2);

    public void removeAddresses();

    public void removeAddresses(String var1);

    public boolean removeMessagePart(MessagePart var1);

    public boolean removeMessagePartId(String var1);

    public boolean removeMessagePartLocation(String var1);

    public void setHeader(String var1, String var2);

    public void setStartContentId(String var1);

    public void setSubject(String var1);
}

