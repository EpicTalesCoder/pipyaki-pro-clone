package wfree;

import java.util.Date;

public class M implements TextMessage, BinaryMessage, MultipartMessage {
   String a;
   String t;
   byte[] d;

   public String getAddress() {
      return this.a;
   }

   public void setAddress(String var1) {
      this.a = var1;
   }

   public String getPayloadText() {
      return this.t;
   }

   public void setPayloadText(String var1) {
      this.t = var1;
   }

   public byte[] getPayloadData() {
      return this.d;
   }

   public void setPayloadData(byte[] var1) {
      this.d = var1;
   }

   public Date getTimestamp() {
      return null;
   }

   public boolean addAddress(String var1, String var2) {
      return true;
   }

   public void addMessagePart(MessagePart var1) {
   }

   public String[] getAddresses(String var1) {
      return null;
   }

   public String getHeader(String var1) {
      return null;
   }

   public MessagePart getMessagePart(String var1) {
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

   public boolean removeAddress(String var1, String var2) {
      return false;
   }

   public void removeAddresses() {
   }

   public void removeAddresses(String var1) {
   }

   public boolean removeMessagePart(MessagePart var1) {
      return false;
   }

   public boolean removeMessagePartId(String var1) {
      return false;
   }

   public boolean removeMessagePartLocation(String var1) {
      return false;
   }

   public void setHeader(String var1, String var2) {
   }

   public void setStartContentId(String var1) {
   }

   public void setSubject(String var1) {
   }
}
