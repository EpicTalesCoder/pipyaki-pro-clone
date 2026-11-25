/*
 * Decompiled with CFR 0.152.
 */
package wfree;

import java.util.Date;
import wfree.BinaryMessage;
import wfree.MessagePart;
import wfree.MultipartMessage;
import wfree.TextMessage;

public class M
implements TextMessage,
BinaryMessage,
MultipartMessage {
    String a;
    String t;
    byte[] d;

    public String getAddress() {
        return this.a;
    }

    public void setAddress(String string) {
        this.a = string;
    }

    public String getPayloadText() {
        return this.t;
    }

    public void setPayloadText(String string) {
        this.t = string;
    }

    public byte[] getPayloadData() {
        return this.d;
    }

    public void setPayloadData(byte[] byArray) {
        this.d = byArray;
    }

    public Date getTimestamp() {
        return null;
    }

    public boolean addAddress(String string, String string2) {
        return true;
    }

    public void addMessagePart(MessagePart messagePart) {
    }

    public String[] getAddresses(String string) {
        return null;
    }

    public String getHeader(String string) {
        return null;
    }

    public MessagePart getMessagePart(String string) {
        return null;
    }

    public MessagePart[] getMessageParts() {
        return null;
    }

    public String getStartContentId() {
        return null;
    }

    public String getSubject() {
        return null;
    }

    public boolean removeAddress(String string, String string2) {
        return false;
    }

    public void removeAddresses() {
    }

    public void removeAddresses(String string) {
    }

    public boolean removeMessagePart(MessagePart messagePart) {
        return false;
    }

    public boolean removeMessagePartId(String string) {
        return false;
    }

    public boolean removeMessagePartLocation(String string) {
        return false;
    }

    public void setHeader(String string, String string2) {
    }

    public void setStartContentId(String string) {
    }

    public void setSubject(String string) {
    }
}

