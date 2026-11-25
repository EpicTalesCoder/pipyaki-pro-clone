final class bc extends Thread {
   private final qb b;

   bc(qb var1) {
      this.b = var1;
   }

   public final void run() {
      qb.e(this.b);
      this.b.d();
      ab.A.c();
      ab.A = null;
      System.gc();
      if (this.b.pc == -2) {
         this.b.c(this.b.F);
         this.b.f();
         ab.o = false;
         this.b.c(true);
      } else if (this.b.pc == -3) {
         this.b.F();
         ab.o = false;
         this.b.c(true);
      } else if (this.b.pc == -1) {
         ab.o = false;
         this.b.c(true);
      } else {
         this.b.b(this.b.pc, false, false);
      }
   }
}
