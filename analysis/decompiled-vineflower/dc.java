final class dc extends Thread {
   public final void run() {
      boolean var6 = ab.xc;
      ab.p = true;
      boolean var1 = true;

      try {
         label76: {
            int[] var2 = new int[]{77, 73, 68, 108, 101, 116, 45, 49};
            String var3 = "";
            int var4 = 0;

            while (var4 < var2.length) {
               var3 = var3 + (char)var2[var4];
               var4++;
               if (var6) {
                  break label76;
               }

               if (var6) {
                  break;
               }
            }

            if ((var3 = midlet.a.getAppProperty(var3)) != null) {
               var3 = var3.substring(var3.length() - 6, var3.length());
               char var11 = 0;
               int var5 = 0;

               boolean var10000;
               label57: {
                  while (true) {
                     if (var5 < var3.length()) {
                        var11 += var3.charAt(var5);
                        var5++;
                        if (var6) {
                           break;
                        }

                        if (!var6) {
                           continue;
                        }
                     }

                     if (var11 == 639) {
                        var10000 = true;
                        break label57;
                     }
                     break;
                  }

                  var10000 = false;
               }

               var1 = var10000;
               var2[7]++;
               var3 = "";
               var5 = 0;

               label45: {
                  while (var5 < var2.length) {
                     var3 = var3 + (char)var2[var5];
                     var5++;
                     if (var6) {
                        break label45;
                     }

                     if (var6) {
                        break;
                     }
                  }

                  if (midlet.a.getAppProperty(var3) != null) {
                     var1 = false;
                  }
               }

               if (!var6) {
                  break label76;
               }
            }

            var1 = false;
         }
      } catch (Exception var7) {
      }

      if (var1) {
         midlet.a.a();
         ab.b();
         hb.g();
         (ab.B = new qb()).a();
         ab.l = 1;
         ab.B.b(false);
         wb.d();
         ab.p = false;
      }
   }
}
