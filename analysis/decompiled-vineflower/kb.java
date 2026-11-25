import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class kb extends jb {
   private InputStream p;
   private OutputStream q;
   private boolean r;

   public kb(c var1, InputStream var2, OutputStream var3) {
      label34: {
         boolean var4 = ab.xc;
         super(var1);
         this.r = false;
         this.p = var2;
         this.q = var3;
         this.a();
         if (!var1.b()) {
            this.c();
            if (!var4) {
               break label34;
            }
         }

         if (this.d != 0) {
            label28: {
               var6 = -1;
               if (this.d < 4) {
                  var6 = 9;
                  if (!var4) {
                     break label28;
                  }
               }

               if (this.d > 4) {
                  var6 = 10;
               }
            }

            if (var6 != -1) {
               this.b(new byte[]{111, var6});

               try {
                  this.d();
               } catch (IOException var5) {
               }

               this.j();
            }
         }
      }

      var1.b("c");
   }

   public final void b() {
      this.g = false;

      try {
         this.p.close();
      } catch (Exception var2) {
      }

      try {
         this.q.close();
      } catch (Exception var1) {
      }
   }

   protected final void d() {
      boolean var3 = ab.xc;
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();

      while (true) {
         if (this.h.size() > 0) {
            byte[] var1 = (byte[])this.h.elementAt(0);
            this.h.removeElementAt(0);
            if (var1.length <= 0) {
               continue;
            }

            var2.write(ab.b(var1.length));
            var2.write(var1);
            if (var3) {
               break;
            }

            if (!var3) {
               continue;
            }
         }

         if (var2.size() > 0) {
            this.q.write(var2.toByteArray());
            this.q.flush();
         }
         break;
      }
   }

   protected final void e() {
      if (!this.r) {
         this.r = true;
         byte[] var1 = new byte[4];
         this.a(var1);
         var1 = new byte[ab.b(var1)];
         this.a(var1);
         this.c(var1);
         this.r = false;
      }
   }

   private void a(byte[] var1) {
      int var2 = 0;
      byte[] var4 = new byte[1];

      do {
         if (this.p.read(var4) > 0) {
            var1[var2] = var4[0];
            var2++;
         }
      } while (var2 != var1.length);
   }
}
