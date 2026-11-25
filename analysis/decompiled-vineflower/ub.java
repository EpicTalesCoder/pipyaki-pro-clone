import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

public final class ub implements PlayerListener {
   public static boolean b = true;
   public static boolean c = true;
   private Player d;
   private sc[] e;
   private Player f;
   private sc g;
   private String h;
   private int i = -1;
   private int j = 0;

   public ub() {
      this.e = new sc[30];
      b = b("audio/midi");
      c = b("audio/x-wav");
      System.getProperty("supports.mixing").equals("true");
      c = false;
      if (true) {
         this.e();
      }

      new StringBuffer().append("sound: ").append(b).append(" ").append(c).append(" ").append(false).toString();
   }

   public final void b(int var1, int var2) {
      if (var2 == ab.l && !rc.l) {
         if (this.e != null && var1 >= 0 && ab.i() != 0 && c) {
            if (var1 < this.e.length) {
               if (this.e[var1] != null) {
                  if (ab.hc || this.e[var1].e != 0) {
                     if (this.d != null) {
                        if (this.d.getState() == 400) {
                           if (!ab.hc) {
                              return;
                           }

                           if (this.i != -1 && this.e[this.i].f >= this.e[var1].f) {
                              return;
                           }
                        }
                     } else {
                        this.i = -1;
                     }

                     this.e[var1].b();
                     if (var1 != this.i) {
                        b(this.d);
                        this.d = this.b(this.e[var1]);
                        if (this.d == null) {
                           return;
                        }
                     }

                     this.b(this.d, var1);
                  }
               }
            }
         }
      }
   }

   private void b(Player var1, int var2) {
      if (var1 != null) {
         try {
            if (var1.getState() == 100) {
               var1.prefetch();
               var1.realize();
            }

            if (var1.getState() != 0) {
               if (var2 != -1) {
                  this.i = var2;
               }

               var1.start();
            }
         } catch (Exception var4) {
            if (var2 != -1) {
               this.i = -1;
            }

            b(var1);
            new StringBuffer().append("play ex ").append(var4).append("ps =").append(this.d.getState()).toString();
         }
      }
   }

   private static boolean b(String var0) {
      boolean var3 = ab.xc;
      String[] var1 = Manager.getSupportedContentTypes(null);
      int var2 = 0;

      int var10000;
      while (true) {
         if (var2 < var1.length) {
            var10000 = var1[var2].indexOf(var0);
            if (var3) {
               break;
            }

            if (var10000 >= 0) {
               return true;
            }

            var2++;
            if (!var3) {
               continue;
            }
         }

         var10000 = 0;
         break;
      }

      return (boolean)var10000;
   }

   public final void b(String var1, int var2) {
      this.h = var1;
      if (var2 == ab.l && !rc.l) {
         if (b && ab.j() != 0) {
            b(this.f);
            this.g = null;

            try {
               this.g = new sc(this.h, "audio/midi");
               this.g.b();
               this.f = Manager.createPlayer(this.g);
               this.f.realize();
               c(this.f, ab.j());
            } catch (Exception var4) {
               new StringBuffer().append("get m player ex ").append(var4).toString();
               b = false;
               ab.Gb = false;
               ab.Eb = 0;
               this.f = null;
               this.g = null;
               return;
            }

            try {
               if (this.f.getState() == 100) {
                  this.f.prefetch();
                  this.f.realize();
               }

               if (this.f.getState() != 0) {
                  this.f.setLoopCount(-1);
                  this.f.start();
               }
            } catch (Exception var3) {
               b(this.f);
               new StringBuffer().append("musicplay ex ").append(var3).append("ps =").append(this.f.getState()).toString();
            }
         }
      }
   }

   private Player b(sc var1) {
      try {
         (var5 = Manager.createPlayer(var1)).realize();
         c(var5, ab.i());
      } catch (Exception var4) {
         c = false;
         this.e();
         new StringBuffer().append("get player ex ").append(var4).toString();
         return null;
      }

      try {
         var5.realize();
         var5.prefetch();
      } catch (Exception var3) {
         new StringBuffer().append("pref ex ").append(var3).toString();
      }

      return var5;
   }

   public final int b(String var1, int var2, int var3) {
      if (c && this.e != null) {
         this.e[this.j] = new sc(var1, "audio/x-wav");
         this.e[this.j].e = var2;
         this.e[this.j].f = var3;
         this.j++;
         return this.j - 1;
      } else {
         return -1;
      }
   }

   private static void b(Player var0) {
      if (var0 != null) {
         try {
            var0.close();
         } catch (Exception var1) {
            new StringBuffer().append("stop player ex ").append(var1).toString();
         }
      }
   }

   public final void b() {
      if (this.f != null) {
         c(this.f, ab.j());
      }
   }

   public final void c() {
      if (this.d != null) {
         c(this.d, ab.i());
      }
   }

   private static void c(Player var0, int var1) {
      if (var0 != null) {
         try {
            VolumeControl var3;
            if ((var3 = (VolumeControl)var0.getControl("VolumeControl")) != null) {
               var3.setLevel(var1);
            }
         } catch (Exception var2) {
         }
      }
   }

   public final void d() {
      b(this.d);
      b(this.f);
      this.e();
      this.f = null;
      this.g = null;
   }

   private void e() {
      boolean var2 = ab.xc;
      ab.Hb = false;
      ab.Fb = 0;
      if (this.e != null) {
         int var1 = 0;

         while (var1 < this.e.length) {
            this.e[var1] = null;
            var1++;
            if (var2) {
               return;
            }

            if (var2) {
               break;
            }
         }

         this.e = null;
      }

      System.gc();
   }

   public final void f() {
      b(this.f);
   }

   public final void g() {
      c(this.f, 0);
   }

   public final void h() {
      if (!rc.l) {
         if (b && ab.j() != 0) {
            if (this.f != null && this.f.getState() == 400) {
               c(this.f, ab.j());
            } else {
               this.b(this.h, ab.l);
            }
         }
      }
   }

   public final void playerUpdate(Player var1, String var2, Object var3) {
   }
}
