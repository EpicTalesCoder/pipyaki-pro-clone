import java.io.IOException;

final class cc extends Thread {
   private final jb b;

   cc(jb var1) {
      this.b = var1;
   }

   public final void run() {
      boolean var2 = ab.xc;

      while (this.b.g) {
         try {
            this.b.e();
         } catch (IOException var4) {
            new StringBuffer().append("R Exception ").append(var4).toString();
            if (ab.B != null) {
               new StringBuffer().append("READ: ").append(var4).toString();
            }

            this.b.i();
         }

         try {
            yield();
            sleep(1L);
         } catch (Exception var3) {
            if (var2) {
               break;
            }
         }
      }
   }
}
