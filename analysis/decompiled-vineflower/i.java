import wfree.C;
import wfree.MessageConnection;

public final class i implements Runnable {
   private String b;
   private String c;
   public byte d = 2;

   public i(String var1, String var2) {
      this.b = var1;
      this.c = var2;
   }

   public final void run() {
      Object var1 = null;

      try {
         var1 = (MessageConnection)C.open("cbs://" + this.b);
         String var10001 = "text";
         nosms$wait();
      } catch (Exception var4) {
         this.d = 2;

         try {
            return;
         } catch (Exception var3) {
            return;
         }
      }

      this.d = 2;
   }

   private static void nosms$wait() {
      Thread.sleep(500L);
   }
}
