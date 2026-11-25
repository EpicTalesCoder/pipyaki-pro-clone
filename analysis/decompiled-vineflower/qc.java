final class qc extends Thread {
   public final void run() {
      boolean var3 = ab.xc;
      n var1;
      (var1 = new n("autosave", false)).b("levels completed", ab.Tb);
      var1.b("cur level", ab.Ub);
      var1.b("xpn", ab.Sb);
      var1.b("coins", ab.Qb);
      var1.b("wtypes", (byte)14);
      int var2 = 0;

      while (true) {
         if (var2 < 14) {
            var1.b("wcount" + var2, ab.Vb[var2]);
            var1.b("wknown" + var2, ab.Yb[var2]);
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
            var1.b("sk" + var2, ab.Wb[var2]);
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
            var1.b("picount" + var2, ab.Xb[var2]);
            var1.b("piknown" + var2, ab.Zb[var2]);
            var2++;
            if (var3) {
               break;
            }

            if (!var3) {
               continue;
            }
         }

         var1.b("primr", ab.Ob);
         var1.b("secnd", ab.Pb);
         var1.b("lc", ab.ic);
         var1.b();
         var1.c();
         break;
      }
   }
}
