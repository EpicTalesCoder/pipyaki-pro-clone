import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Vector;

final class vb {
   public String b;
   public byte c;
   public String d = "";
   public byte e;

   public vb(n var1, String var2) {
      this.b = var2;
   }

   public final void b(byte var1) {
      this.e = 0;
      this.c = var1;
   }

   public vb(n var1, Vector var2, ByteArrayInputStream var3) {
      int var4;
      if ((var4 = var3.read()) <= 0) {
         throw new IOException();
      }

      label16: {
         byte[] var5 = new byte[var4];
         var3.read(var5);
         this.b = new String(var5);
         this.e = (byte)var3.read();
         if (this.e == 0) {
            this.c = (byte)var3.read();
            if (!ab.xc) {
               break label16;
            }
         }

         if (this.e == 1) {
            byte[] var6 = new byte[var3.read()];
            var3.read(var6);
            this.d = new String(var6);
         }
      }

      var2.addElement(this);
   }

   static String b(vb var0) {
      if ((var0 = var0).e == 0) {
         return "" + var0.c;
      } else {
         return var0.e == 1 ? var0.d : "";
      }
   }
}
