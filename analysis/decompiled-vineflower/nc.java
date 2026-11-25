final class nc extends Thread {
   private final qb b;

   nc(qb var1) {
      this.b = var1;
   }

   public final void run() {
      if (qb.f(this.b)) {
         ab.A.c();
      }

      qb.g(this.b).d();
      qb.g(this.b).f();
      ab.A.N = null;
      ab.A = null;
      qb.b(this.b, null);
      System.gc();
      if (qb.h(this.b)) {
         this.b.F();
      }

      label22: {
         if (qb.i(this.b)) {
            this.b.Rb = 70;
            qb.b(this.b, false);
            this.b.i(13);
            this.b.Wb = 1;
            this.b.Kb = -1;
            if (!ab.xc) {
               break label22;
            }
         }

         if (qb.j(this.b)) {
            this.b.Rb = 71;
            qb.b(this.b, false);
            this.b.i(0);
            this.b.Wb = 1;
            this.b.Kb = -1;
         }
      }

      qb.c(this.b, false);
      qb.d(this.b, false);
      ab.o = false;
      if (qb.f(this.b)) {
         this.b.c(true);
      }
   }
}
