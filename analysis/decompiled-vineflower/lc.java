final class lc extends Thread {
   public final void run() {
      boolean var3 = ab.xc;
      n var1;
      (var1 = new n("btautosave", false)).b("btcoins", ab.Rb);
      var1.b("wtypes", (byte)14);
      int var2 = 0;

      while (true) {
         if (var2 < 14) {
            var1.b("wcount" + var2, ab.jc[var2]);
            var2++;
            if (var3) {
               break;
            }

            if (!var3) {
               continue;
            }
         }

         var1.b("sks", (byte)11);
         break;
      }

      var2 = 0;

      while (true) {
         if (var2 < 11) {
            var1.b("sk" + var2, ab.kc[var2]);
            var2++;
            if (var3) {
               break;
            }

            if (!var3) {
               continue;
            }
         }

         var1.b("pitypes", (byte)6);
         break;
      }

      var2 = 0;

      while (true) {
         if (var2 < 6) {
            var1.b("picount" + var2, ab.lc[var2]);
            var2++;
            if (var3) {
               break;
            }

            if (!var3) {
               continue;
            }
         }

         var1.b("bm", ab.mc);
         var1.b();
         var1.c();
         break;
      }
   }
}
