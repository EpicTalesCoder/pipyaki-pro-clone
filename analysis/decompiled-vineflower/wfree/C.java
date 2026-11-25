package wfree;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import javax.microedition.io.Connection;
import javax.microedition.io.Connector;

public class C implements MessageConnection {
   public static final int READ = 1;
   public static final int WRITE = 2;
   public static final int READ_WRITE = 3;
   boolean c;

   public static boolean m(String var0) {
      if (var0 != null) {
         var0 = var0.trim().toLowerCase();
         if (var0.startsWith("sms:") || var0.startsWith("mms:") || var0.startsWith("cbs:") || var0.startsWith("smsto:") || var0.startsWith("mmsto:")) {
            return true;
         }
      }

      return false;
   }

   public static Connection open(String var0) {
      return m(var0) ? new C() : Connector.open(var0);
   }

   public static Connection open(String var0, int var1) {
      return m(var0) ? new C() : Connector.open(var0, var1);
   }

   public static Connection open(String var0, int var1, boolean var2) {
      return m(var0) ? new C() : Connector.open(var0, var1, var2);
   }

   public static DataInputStream openDataInputStream(String var0) {
      return Connector.openDataInputStream(var0);
   }

   public static DataOutputStream openDataOutputStream(String var0) {
      return Connector.openDataOutputStream(var0);
   }

   public static InputStream openInputStream(String var0) {
      return Connector.openInputStream(var0);
   }

   public static OutputStream openOutputStream(String var0) {
      return Connector.openOutputStream(var0);
   }

   public synchronized void close() {
      this.c = true;
      this.notifyAll();
   }

   public Message newMessage(String var1) {
      return new M();
   }

   public Message newMessage(String var1, String var2) {
      M var10000 = new M();
      var10000.setAddress(var2);
      return var10000;
   }

   public int numberOfSegments(Message var1) {
      return 1;
   }

   public synchronized Message receive() {
      while (!this.c) {
         this.wait();
      }

      throw new InterruptedIOException();
   }

   public void send(Message var1) {
      Thread.sleep(500L);
   }

   public void setMessageListener(MessageListener var1) {
   }
}
