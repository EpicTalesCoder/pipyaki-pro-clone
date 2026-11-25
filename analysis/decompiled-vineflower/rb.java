import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import javax.microedition.io.HttpConnection;
import wfree.C;

public final class rb implements Runnable {
   private Thread b;
   private String c;
   public String d;
   public boolean e;
   private HttpConnection f = null;
   private InputStream g = null;
   private ByteArrayOutputStream h = null;

   public rb(String var1, long var2) {
      this.c = var1;
      this.b = new Thread(this);
      this.b.start();
      System.currentTimeMillis();
   }

   public final void run() {
      boolean var2 = ab.xc;
      this.e = false;

      try {
         this.f = (HttpConnection)C.open(this.c);
         this.g = this.f.openInputStream();
         this.h = new ByteArrayOutputStream();
         ab.b("networkConnector: sent = " + this.c);
         if (this.f == null || this.g == null || this.h == null) {
            throw new Exception();
         }

         while (true) {
            int var1;
            if ((var1 = this.g.read()) != -1) {
               this.h.write(var1);
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            }

            this.d = this.h.toString();
            this.h.toByteArray();
            break;
         }

         if (this.h != null) {
            this.h.close();
         }

         if (this.g != null) {
            this.g.close();
         }

         if (this.f != null) {
            this.f.close();
         }

         ab.b("networkConnector: received = " + this.d);
      } catch (Exception var4) {
         try {
            if (this.h != null) {
               this.h.close();
            }

            if (this.g != null) {
               this.g.close();
            }

            if (this.f != null) {
               this.f.close();
            }
         } catch (Exception var3) {
         }

         this.d = null;
         ab.b("networkConnector: fail " + var4);
      }

      this.e = true;
   }

   public static String[] b(String var0, char var1) {
      boolean var5 = ab.xc;
      if (var0 == null) {
         return null;
      }

      int var3 = 1;
      int var2 = 0;

      int var10000;
      while (true) {
         if (var2 < var0.length()) {
            var10000 = var0.charAt(var2);
            if (var5) {
               break;
            }

            if (var10000 == var1) {
               var3++;
            }

            var2++;
            if (!var5) {
               continue;
            }
         }

         var10000 = var3;
         break;
      }

      String[] var4 = new String[var10000];
      var2 = 0;

      while (true) {
         if (var2 < var4.length) {
            var4[var2] = "";
            var2++;
            if (var5) {
               break;
            }

            if (!var5) {
               continue;
            }
         }

         var3 = 0;
         break;
      }

      var2 = 0;

      while (var2 < var0.length()) {
         label39: {
            if (var0.charAt(var2) == var1) {
               if (var2 == 0) {
                  break label39;
               }

               var3++;
               if (!var5) {
                  break label39;
               }
            }

            if (var0.charAt(var2) != '\n') {
               var4[var3] = var4[var3] + "" + var0.charAt(var2);
            }
         }

         var2++;
         if (var5) {
            break;
         }
      }

      return var4;
   }
}
