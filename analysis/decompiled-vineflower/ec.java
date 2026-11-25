final class ec extends Thread {
   private final f b;

   ec(f var1) {
      this.b = var1;
   }

   public final void run() {
      boolean var2 = ab.xc;

      f var10000;
      while (true) {
         if (f.c(this.b).size() > 0) {
            var10000 = this.b;
            if (var2) {
               break;
            }

            if (f.d(this.b)) {
               try {
                  sleep(5000L);
               } catch (Exception var3) {
               }
            }

            if (this.b.c) {
               return;
            }

            label38: {
               f.b(this.b, true);
               eb var1 = (eb)f.c(this.b).elementAt(0);
               f.c(this.b).removeElementAt(0);
               if (!this.b.b(var1)) {
                  if (this.b.c) {
                     return;
                  }

                  f.e(this.b);
                  if (f.f(this.b) <= 3) {
                     f.c(this.b).insertElementAt(var1, f.c(this.b).size());
                     if (!var2) {
                        break label38;
                     }
                  }

                  f.b(this.b, 0);
                  if (!var2) {
                     break label38;
                  }
               }

               f.b(this.b, 0);
            }

            Thread.yield();
            if (!var2) {
               continue;
            }
         }

         this.b.b = 4;
         var10000 = this.b;
         break;
      }

      var10000.f.b(1, true);
   }
}
