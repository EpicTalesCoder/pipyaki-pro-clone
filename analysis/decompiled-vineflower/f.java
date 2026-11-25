import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.UUID;
import javax.microedition.io.StreamConnection;
import javax.microedition.io.StreamConnectionNotifier;
import wfree.C;

public final class f extends e {
   private int a;
   public static final UUID g = new UUID("F0E0D0C0B0A000908070605040302010", false);
   public static final UUID[] h = new UUID[]{g};
   private LocalDevice i;
   private StreamConnectionNotifier j;
   public boolean k = false;
   private Vector l = new Vector();
   private Vector m = new Vector();
   private boolean n;
   private StringBuffer o;

   f(c var1, ob var2) {
      super(var1, var2);

      try {
         this.i = LocalDevice.getLocalDevice();
         boolean var4 = this.i.setDiscoverable(10390323);
         new StringBuffer().append("discoverable=").append(var4).toString();
         this.o = new StringBuffer("btspp://");
         this.o.append("localhost").append(':');
         this.o.append(g.toString());
         this.o.append(";name=Ujaki");
      } catch (Exception var3) {
         new StringBuffer().append("run ex ").append(var3).toString();
         this.f.b(2);
         return;
      }

      this.k = true;
      this.b = 1;
      new xb(this).start();
   }

   public final void b() {
      try {
         this.j = (StreamConnectionNotifier)C.open(this.o.toString());
      } catch (Exception var2) {
         new StringBuffer().append("open notif ex ").append(var2).toString();
         this.f.b(2);
      }
   }

   public static String b(String var0) {
      return var0.substring(0, 20);
   }

   public final void l() {
      this.b = 3;
      this.k = false;
      this.c();
      this.a = 0;
      new ec(this).start();
   }

   public final boolean b(eb var1) {
      new StringBuffer().append("C! url='").append(var1.b).append("'").toString();

      try {
         StreamConnection var2;
         InputStream var3 = (var2 = (StreamConnection)C.open(var1.b)).openInputStream();
         OutputStream var4 = var2.openOutputStream();
         kb var7;
         (var7 = new kb(this.e, var3, var4)).d = var1.d;
         var7.c = var1.c;
         this.l.addElement(var2);
         this.d.addElement(var7);
         return true;
      } catch (IOException var5) {
         new StringBuffer().append("C ex ").append(var5).toString();
      } catch (Exception var6) {
         new StringBuffer().append("C ex ").append(var6).toString();
         this.c = true;
         this.f.b(5);
      }

      return false;
   }

   public final int b() {
      return this.b != 0 && this.b != 1 ? this.d.size() : this.m.size();
   }

   public final void b(byte[] var1) {
      boolean var4 = ab.xc;
      int var2 = 0;

      while (var2 < this.d.size()) {
         ((kb)this.d.elementAt(var2)).b(var1);
         var2++;
         if (var4) {
            break;
         }
      }
   }

   public final void b(byte[] var1, byte var2) {
      boolean var5 = ab.xc;
      int var3 = 0;

      while (var3 < this.d.size()) {
         kb var4 = (kb)this.d.elementAt(var3);
         if (var2 != var4.e) {
            var4.b(var1);
         }

         var3++;
         if (var5) {
            break;
         }
      }
   }

   public final void b(int var1, byte[] var2) {
      ((kb)this.d.elementAt(var1)).b(var2);
   }

   public final void d() {
      boolean var2 = ab.xc;
      this.c = true;
      this.k = false;
      this.c();
      this.k();

      while (true) {
         label22:
         if (this.l.size() != 0) {
            StreamConnection var1 = (StreamConnection)this.l.elementAt(0);
            this.l.removeElementAt(0);

            try {
               var1.close();
            } catch (Exception var3) {
               if (!var2) {
                  continue;
               }
               break label22;
            }

            if (!var2) {
               continue;
            }
            break;
         }

         this.m.removeAllElements();
         this.f = null;
         this.e = null;
         break;
      }
   }

   public final void c() {
      if (this.j != null) {
         try {
            this.j.close();
         } catch (Exception var1) {
         }

         this.j = null;
      }
   }

   public final void b(String var1, int var2, byte[] var3, byte var4, boolean var5, boolean var6) {
      boolean var17 = ab.xc;
      this.b = 6;
      var5 = 0;

      while (var5 < this.d.size()) {
         jb var10001 = (jb)this.d.elementAt(var5);
         byte var10002 = (byte)(var5 + 2);
         boolean var15 = var6;
         boolean var14 = false;
         byte var13 = var4;
         byte[] var12 = var3;
         int var11 = var2;
         String var10 = var1;
         byte var9 = var10002;
         jb var8 = var10001;
         f var7 = this;
         var8.b(var11);
         ByteArrayOutputStream var16 = new ByteArrayOutputStream();

         try {
            var16.write(1);
            var16.write(var13);
            var16.write((byte)(var14 ? 1 : 0));
            var16.write((byte)(var15 ? 1 : 0));
            var16.write(var9);
            var16.write((byte)var10.getBytes().length);
            var16.write(var10.getBytes());
            var16.write(var11);
            var16.write(var12);
         } catch (Exception var18) {
         }

         var8.e = var9;
         var7.b(var8, var16.toByteArray());
         var5++;
         if (var17) {
            break;
         }
      }
   }

   public final void b(jb var1, byte[] var2) {
      var1.b(var2);
      var1.g();
   }

   static StreamConnectionNotifier b(f var0) {
      return var0.j;
   }

   static Vector c(f var0) {
      return var0.m;
   }

   static boolean d(f var0) {
      return var0.n;
   }

   static boolean b(f var0, boolean var1) {
      return var0.n = true;
   }

   static int e(f var0) {
      return var0.a++;
   }

   static int f(f var0) {
      return var0.a;
   }

   static int b(f var0, int var1) {
      return var0.a = 0;
   }
}
