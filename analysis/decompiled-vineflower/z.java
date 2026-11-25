import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import javax.microedition.media.Control;
import javax.microedition.media.protocol.ContentDescriptor;
import javax.microedition.media.protocol.SourceStream;

public final class z implements SourceStream {
   public long b;
   private long c;
   private ContentDescriptor d;
   private byte[] e;

   public z(String var1, String var2) {
      boolean var5 = ab.xc;
      super();
      this.b = 0L;
      this.c = 0L;
      this.e = null;

      try {
         this.d = new ContentDescriptor(var2);
         InputStream var8 = this.getClass().getResourceAsStream(var1);
         ByteArrayOutputStream var3 = new ByteArrayOutputStream();
         byte[] var4 = new byte[128];
         if (var8 == null) {
            new StringBuffer().append("!!! not found: ").append(var1).toString();
         }

         while (true) {
            int var7;
            if ((var7 = var8.read(var4)) > 0) {
               var3.write(var4, 0, var7);
               if (var5) {
                  break;
               }

               if (!var5) {
                  continue;
               }
            }

            this.e = var3.toByteArray();
            this.c = this.e.length;
            this.b = 0L;
            new StringBuffer().append("stream created. size = ").append(this.c).toString();
            break;
         }
      } catch (Exception var6) {
         new StringBuffer().append("MS in const ").append(var6).toString();
      }
   }

   public final ContentDescriptor getContentDescriptor() {
      return this.d;
   }

   public final long getContentLength() {
      return this.c;
   }

   public final int read(byte[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new NullPointerException();
      }

      if (var2 < 0 || var3 < 0 || var2 + var3 > var1.length) {
         throw new IndexOutOfBoundsException();
      }

      if (var3 == 0) {
         return 0;
      }

      label25: {
         if (this.b + var3 > this.c) {
            var3 = (int)(this.c - this.b);
            if (!ab.xc) {
               break label25;
            }
         }

         var3 = var3;
      }

      if (var3 <= 0) {
         return -1;
      }

      System.arraycopy(this.e, (int)this.b, var1, var2, var3);
      this.b += var3;
      return var3;
   }

   public final Control getControl(String var1) {
      return null;
   }

   public final Control[] getControls() {
      return null;
   }

   public final int getTransferSize() {
      return -1;
   }

   public final long seek(long var1) {
      if (var1 >= this.c) {
         var1 = this.c - 1L;
      }

      if (var1 < 0L) {
         var1 = 0L;
      }

      this.b = var1;
      return this.b;
   }

   public final long tell() {
      return this.b;
   }

   public final int getSeekType() {
      return 2;
   }
}
