import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;

public final class rc extends Canvas {
   public static rc b;
   public static Display c;
   private static boolean d;
   public static boolean e = false;
   public static long f = 0L;
   public static boolean g = true;
   public static int h = 3;
   public static int i = 0;
   public static int j = -1;
   public static boolean k = false;
   public static boolean l = false;
   private static int m = 0;
   public boolean n = false;
   private int o = 0;
   private static boolean p = false;
   private static int q;
   private static int r;
   private static int s;

   public rc() {
      try {
         (c = Display.getDisplay(midlet.a)).setCurrent(this);
         d = true;
         this.setFullScreenMode(true);
         this.b();
         e = this.hasPointerEvents();
         b = this;
      } catch (Exception var1) {
         midlet.a.b();
      }
   }

   public final void paint(Graphics var1) {
      boolean var2 = ab.xc;
      if (!this.n) {
         label34: {
            this.n = true;
            var1.setFont(ab.F);
            if (ab.l == 0 && ab.A != null) {
               ab.A.b(var1);
               ab.A.p();
               if (!var2) {
                  break label34;
               }
            }

            if (ab.l == 1 && ab.B != null) {
               ab.B.b(var1);
               if (!var2) {
                  break label34;
               }
            }

            if (ab.l == 2) {
               wb.b(var1);
               if (!var2) {
                  break label34;
               }
            }

            b(var1);
         }

         this.n = false;
      }
   }

   public static void b(Graphics var0) {
      ab.c();
      var0.setColor(0);
      var0.fillRect(0, 0, ab.D, ab.E);
      if (ab.q > 0 && qb.M != null) {
         qb.M.b = m % 12;
         qb.M.b(ab.D - qb.M.d - 12, 12);
         qb.M.b(var0);
         m++;
      }
   }

   public final void keyPressed(int var1) {
      if (d) {
         if (var1 == -20) {
            var1 = ab.kb;
         }

         if (var1 == -21) {
            return;
         }

         if (ab.l == 0 && ab.A != null) {
            ab.A.c(var1);
            return;
         }

         if (ab.l == 1 && ab.B != null) {
            ab.B.j(var1);
            return;
         }

         if (ab.l == 2) {
            wb.b(var1);
         }
      }
   }

   public final void keyReleased(int var1) {
      if (var1 == -20) {
         var1 = ab.kb;
      }

      if (var1 != -21) {
         if (ab.l == 0 && ab.A != null) {
            ab.A.d(var1);
         } else {
            if (ab.l == 1 && ab.B != null) {
               ab.B.k(var1);
            }
         }
      }
   }

   public final void pointerPressed(int var1, int var2) {
      boolean var6 = ab.xc;
      if (e) {
         if (ab.l == 0 && fb.I != null && fb.I.i != null) {
            if (fb.I.i.g && var2 > ab.E - 2 - qb.b.e) {
               if (var1 < ab.D / 2) {
                  fb.I.i.b(ab.jb);
                  return;
               }

               fb.I.i.b(ab.kb);
            }

            return;
         }

         if (ab.l == 1 && ab.B != null && ab.B.c != null) {
            if (ab.B.c.g && var2 > ab.E - 2 - qb.b.e) {
               if (var1 < ab.D / 2) {
                  ab.B.c.b(ab.jb);
                  return;
               }

               ab.B.c.b(ab.kb);
            }

            return;
         }

         q = var1;
         r = var2;
         if (g) {
            f = fb.kb + 50L;
            g = false;
            i = 0;
            h = 2;
            j = -1;
         }

         int var3;
         var2 = var2;
         var1 = var1;
         var3 = 0;
         label274:
         if (ab.l == 0 || ab.l == 1 && ab.B.Rb == 34) {
            if (var1 >= fb.Id[0] && var1 <= fb.Id[0] + ab.D / 2 && var2 >= fb.Jd[0] && var2 <= 2 * fb.Jd[0] - fb.Jd[1]) {
               if (ab.l == 1 && ab.B.Rb == 34) {
                  var3 = ab.rb;
                  j = -2;
                  if (!var6) {
                     break label274;
                  }
               }

               var3 = 48;
               j = !k ? 4 : 0;
               if (!var6) {
                  break label274;
               }
            }

            if (!fb.i() && var1 >= fb.Id[1] && var1 <= fb.Id[1] + ab.D / 2 && var2 >= fb.Jd[1] && var2 <= fb.Jd[0]) {
               if (ab.l == 1 && ab.B.Rb == 34) {
                  var3 = ab.rb;
                  j = -2;
                  if (!var6) {
                     break label274;
                  }
               }

               var3 = 57;
               j = 1;
               if (!var6) {
                  break label274;
               }
            }

            if (var1 >= fb.Id[2] && var1 <= fb.Id[2] + ab.D / 2 && var2 >= fb.Jd[2] && var2 <= fb.Jd[2] + fb.Jd[0] - fb.Jd[1]) {
               if (ab.l == 1 && ab.B.Rb == 34 && var1 >= fb.Kd && var1 <= fb.Kd + fb.Md && var2 >= fb.Ld && var2 <= fb.Ld + fb.Nd) {
                  j = -2;
                  if (!var6) {
                     break label274;
                  }
               }

               var3 = 42;
               j = 2;
               if (!var6) {
                  break label274;
               }
            }

            if (var1 >= fb.Id[3] && var1 <= fb.Id[3] + ab.D / 2 && var2 >= fb.Jd[3] && var2 <= fb.Jd[3] + fb.Jd[0] - fb.Jd[1]) {
               if (ab.l == 1 && ab.B.Rb == 34 && var1 >= fb.Kd && var1 <= fb.Kd + fb.Md && var2 >= fb.Ld && var2 <= fb.Ld + fb.Nd) {
                  j = -2;
                  if (!var6) {
                     break label274;
                  }
               }

               var3 = 35;
               j = 3;
               if (!var6) {
                  break label274;
               }
            }

            if (ab.l == 1 && ab.B.Rb == 34) {
               var3 = ab.rb;
               j = -2;
            }
         }

         if (ab.l == 1) {
            int var4 = 0;

            while (var4 < ab.B.Db.length) {
               gb var5;
               label214:
               if ((var5 = ab.B.Db[var4]) != null && var5.j() && !var5.r() && var5.o != 54 && var5.n <= ab.B.Cb) {
                  if (var1 >= var5.j && var1 <= var5.j + var5.b() && var2 >= var5.k && var2 <= var5.k + var5.c()) {
                     if (var5.n == ab.B.Kb) {
                        var3 = ab.rb;
                        if (!var6) {
                           break;
                        }
                     }

                     ab.B.c(var5.n);
                     var3 = 0;
                     if (!var6) {
                        break;
                     }
                  }

                  if (var1 >= var5.j - ab.B.Pb && var1 <= var5.j && var2 >= var5.k && var2 <= var5.k + var5.c() && (ab.l != 1 || ab.B.Rb != 34)) {
                     if (var5.n != ab.B.Kb) {
                        break label214;
                     }

                     var3 = ab.ob;
                     if (!var6) {
                        break;
                     }
                  }

                  if (var1 >= var5.j + var5.b()
                     && var1 <= var5.j + var5.b() + ab.B.Pb
                     && var2 >= var5.k
                     && var2 <= var5.k + var5.c()
                     && (ab.l != 1 || ab.B.Rb != 34)) {
                     if (var5.n != ab.B.Kb) {
                        break label214;
                     }

                     var3 = ab.qb;
                     if (!var6) {
                        break;
                     }
                  }

                  if (var1 >= var5.j && var1 <= var5.j + var5.b() && var2 >= var5.k - ab.B.Qb && var2 <= var5.k && (ab.l != 1 || ab.B.Rb != 34)) {
                     if (var5.n != ab.B.Kb) {
                        break label214;
                     }

                     var3 = ab.pb;
                     if (!var6) {
                        break;
                     }
                  }

                  if (var1 >= var5.j
                     && var1 <= var5.j + var5.b()
                     && var2 >= var5.k + var5.c()
                     && var2 <= var5.k + var5.c() + ab.B.Qb
                     && (ab.l != 1 || ab.B.Rb != 34)
                     && var5.n == ab.B.Kb) {
                     var3 = ab.nb;
                     if (!var6) {
                        break;
                     }
                  }
               }

               var4++;
               if (var6) {
                  break;
               }
            }
         }

         this.o = var3;
         if (this.o != 0) {
            this.keyPressed(this.o);
         }
      }
   }

   public final void pointerReleased(int var1, int var2) {
      if (e) {
         if (this.o != 0) {
            this.keyReleased(this.o);
         }

         p = false;
         s = 0;
      }
   }

   public final void pointerDragged(int var1, int var2) {
      if (e) {
         int var3 = var1 - q;
         int var4 = var2 - r;
         if (!p && (var3 != 0 || var4 != 0) && (s = s + Math.abs(var3) + Math.abs(var4)) > 25) {
            p = true;
            s = 0;
         }

         q = var1;
         r = var2;
      }
   }

   public static void b(int var0, int var1) {
      if (ab.Ib && !l && var1 == ab.l) {
         try {
            c.vibrate(var0);
            return;
         } catch (Exception var2) {
         }
      }
   }

   public final void b() {
      ab.D = this.getWidth();
      ab.E = this.getHeight();
   }

   public final void showNotify() {
      if (l && !ab.o) {
         l = false;
         if (ab.G != null) {
            ab.G.h();
         }

         if (ab.l == 0) {
            ab.A.b(false, false);
         }
      }
   }

   public final void hideNotify() {
      if (!l && !ab.o) {
         l = true;
         if (ab.G != null) {
            ab.G.g();
         }

         if (ab.l == 0 && ab.A != null) {
            ab.A.b();
         }
      }
   }
}
