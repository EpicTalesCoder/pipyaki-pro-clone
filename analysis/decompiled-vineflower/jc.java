final class jc extends Thread {
   private final db b;

   jc(db var1) {
      this.b = var1;
   }

   public final void run() {
      try {
         Thread.yield();
         Thread.sleep(5000L);
      } catch (Exception var1) {
      }

      if (!db.b(this.b)) {
         db.c(this.b);
      }
   }
}
