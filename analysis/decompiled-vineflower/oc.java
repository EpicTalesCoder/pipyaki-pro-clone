final class oc extends Thread {
   private final qb b;

   oc(qb var1) {
      this.b = var1;
   }

   public final void run() {
      if (qb.f(this.b)) {
         ab.A.c();
      }

      this.b.Yb.d();
      ab.A.O = null;
      ab.A = null;
      this.b.Yb = null;
      System.gc();
      if (qb.h(this.b)) {
         this.b.F();
      }

      ab.o = false;
      if (qb.f(this.b)) {
         this.b.c(true);
      }
   }
}
