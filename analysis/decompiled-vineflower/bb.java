import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class bb {
   public static gb b;
   private static int c = -8;
   private static int d;
   private static int e = 39;
   private static int f = 15;
   private static int g = 1;
   private static int h;
   private static int i;
   private static int j;
   private static int k;
   private static int l;
   private static int m;
   private static int n;
   private static pb o = null;
   private static pb p = null;
   private static qb q;
   private static int r;
   private static int s;
   private static int t;
   private static int u;
   private static int v;
   private static int w;
   private static boolean x;

   public static void b(qb var0) {
      q = var0;

      try {
         Image var2 = Image.createImage("/menu/keyboard.png");
         o = new pb(var2);
         Image var3 = Image.createImage("/menu/keyb2.png");
         p = new pb(var3, 65, 37);
      } catch (Exception var1) {
      }
   }

   public static void b(int var0) {
      boolean var2;
      String var3;
      label160: {
         boolean var4 = ab.xc;
         int var1 = rc.b.getGameAction(var0);
         var2 = false;
         var3 = b.u;
         if (var1 == 1 || var0 == 50) {
            if (d == 39) {
               d = 35;
               if (!var4) {
                  break label160;
               }
            }

            if ((d -= 10) >= 0) {
               break label160;
            }

            d = 0;
            if (!var4) {
               break label160;
            }
         }

         if (var1 == 6 || var0 == 56) {
            if (d == 29) {
               d = 38;
               if (!var4) {
                  break label160;
               }
            }

            if ((d += 10) <= e) {
               break label160;
            }

            d = e;
            if (!var4) {
               break label160;
            }
         }

         if (var1 == 2 || var0 == 52) {
            if (d == 39) {
               d = 31;
               if (!var4) {
                  break label160;
               }
            }

            if (d == 0) {
               d = 1;
               if (!var4) {
                  break label160;
               }
            }

            if (--d >= 0) {
               break label160;
            }

            d = 0;
            if (!var4) {
               break label160;
            }
         }

         if (var1 == 5 || var0 == 54) {
            if (d == 38) {
               d = 30;
               if (!var4) {
                  break label160;
               }
            }

            if (++d <= e) {
               break label160;
            }

            d = e;
            if (!var4) {
               break label160;
            }
         }

         label94:
         if (var1 != 8 && var0 != 53) {
            if (var0 == c) {
               var2 = true;
               if (!var4) {
                  break label94;
               }
            }

            if (var0 == ab.jb || var0 == ab.kb || var0 == ab.lb || var0 == ab.mb) {
               q.d(false);
               return;
            }
         } else {
            label158: {
               if (d == 0) {
                  var2 = true;
                  if (!var4) {
                     break label158;
                  }
               }

               if (d == 30) {
                  if (var3.length() >= g) {
                     q.d(true);
                     return;
                  }
               } else if (var3.length() < f || q.Rb != 33) {
                  String var5 = "_1234567890qwertyuiopasdfghjkl_zxcvbnm- ";
                  if (!x || d <= 10) {
                     var3 = var3.concat(var5.charAt(d) + "");
                  }
               }
            }
         }
      }

      a();
      if (var2 && var3.length() > 0) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      if (var3.equals("") || q.Rb != 33) {
         b.u = var3;
      } else if (var3.length() == 1) {
         b.u = var3.toUpperCase();
      } else {
         b.u = var3.substring(0, 1).toUpperCase() + var3.substring(1, var3.length());
      }
   }

   public static void b(gb var0, boolean var1) {
      b = var0;
      x = var1;
      int var2;
      if (ab.E > 132) {
         var2 = (ab.E - o.e - b.c()) / 3;
      } else {
         var2 = (ab.E - o.e - b.c() + 20) / 3;
      }

      q.Hb += var2;
      u = ab.E - o.e - var2;
      t = (ab.D - o.d) / 2;
      s = ab.E;
      r = t;
      v = 0;
      w = 0;
      d = 1;
      a();
      h = j;
      i = k;
   }

   private static void a() {
      int var0;
      int var2;
      label58: {
         boolean var3 = ab.xc;
         var0 = u;
         int var1 = t;
         var2 = t;
         n = 0;
         if (d > 0 && d <= 10) {
            var2 = var1 + (d - 1) * 13;
            var0 += 13;
            if (!var3) {
               break label58;
            }
         }

         if (d >= 11 && d <= 20) {
            var2 = var1 + (d - 11) * 13;
            var0 += 26;
            if (!var3) {
               break label58;
            }
         }

         if (d >= 21 && d <= 29) {
            var2 = var1 + (d - 21) * 13 + 3;
            var0 += 39;
            if (!var3) {
               break label58;
            }
         }

         if (d >= 31 && d <= 38) {
            var2 = var1 + (d - 31) * 13 + 6;
            var0 += 52;
            if (!var3) {
               break label58;
            }
         }

         if (d == 30) {
            var2 = var1 + 104 + 7;
            var0 += 39;
            n = 3;
            if (!var3) {
               break label58;
            }
         }

         if (d == 39) {
            var2 = var1 + (d - 36) * 13;
            var0 += 66;
            n = 1;
            if (!var3) {
               break label58;
            }
         }

         if (d == 0) {
            var2 = var1 + 104;
            var0--;
            n = 2;
         }
      }

      j = var2 - 4;
      k = var0 - 1;
      l = Math.abs(h - j) / 3;
      m = Math.abs(i - k) / 3;
      if (t < 0) {
         var0 = j;
         w = (ab.D / 2 - var0) * 24 / (ab.D / 2);
      }
   }

   public static void b(Graphics var0) {
      o.b = 0;
      o.b(r + v, s);
      o.b(var0);
      p.b = n;
      p.b(h + v, i);
      p.b(var0);
   }

   public static void b() {
      label29: {
         r = (t + r) / 2;
         s = (u + s) / 2;
         v = (v * 3 + w) / 4;
         if (h < j) {
            if ((h = h + l) < j) {
               break label29;
            }

            h = j;
            if (!ab.xc) {
               break label29;
            }
         }

         if (h > j && (h = h - l) <= j) {
            h = j;
         }
      }

      if (i < k) {
         if ((i = i + m) >= k) {
            i = k;
            return;
         }
      } else if (i > k && (i = i - m) <= k) {
         i = k;
      }
   }
}
