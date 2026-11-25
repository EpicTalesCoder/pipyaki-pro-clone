final class kc extends Thread {
   private final db b;

   kc(db var1) {
      this.b = var1;
   }

   public final void run() {
      if (db.d(this.b)) {
         try {
            sleep(5000L);
         } catch (Exception var3) {
         }
      }

      if (!db.e(this.b)) {
         db.b(this.b, true);

         try {
            db.b(this.b, db.h(this.b).searchServices(null, f.h, db.f(this.b), db.g(this.b)));
            db.c(this.b, true);
         } catch (Exception var2) {
            new StringBuffer().append("ss ex ").append(var2).toString();
            db.i(this.b);
         }
      }
   }
}
