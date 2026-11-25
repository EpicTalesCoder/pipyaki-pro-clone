import javax.microedition.lcdui.Graphics;

public final class j {
   public boolean b;
   public byte c;
   public byte d;
   public pb e;
   public int f;
   public int g;
   private int h;
   public int i;
   private byte j;
   private byte k;
   private int l;
   private int m;
   private int n;
   private int o;
   private int p;
   private int q;
   private boolean r;
   private boolean s;
   private int t;
   private int u;
   private boolean v;
   public byte w;
   private boolean x;
   public boolean y;
   public boolean z;
   public boolean A;
   public boolean B;
   public boolean C;
   public boolean D;
   private byte E;
   private byte F;
   private int G;
   public int H;
   public byte I;
   public static byte J = 0;
   private static byte K = 1;
   public static byte L = 2;
   public long M;
   public boolean N;
   private nb O;

   public j(byte var1, byte var2, byte var3, byte var4, byte var5) {
      boolean var6 = ab.xc;
      super();
      this.c = var1;
      this.d = var2;
      this.I = 0;
      if (var1 != -1) {
         if (this.c == 0) {
            this.e = fb.rb;
            this.x = true;
         }

         if (this.c == 1) {
            this.e = fb.Uc;
            this.x = true;
         }

         if (this.c == 2) {
            this.e = fb.Wc;
            this.y = true;
         }

         if (this.c == 3) {
            this.e = fb.Xc;
            if (var5 == 1) {
               this.e = fb.Zc;
            }

            this.z = true;
         }

         if (this.c == 4) {
            this.e = fb.sb;
            this.B = true;
         }

         if (this.c == 5) {
            this.e = fb.bd;
            this.A = true;
         }

         if (this.c == 6) {
            this.C = true;
         }

         if (this.c == 7) {
            this.e = fb.vd;
            this.D = true;
         }

         this.f = var3 * 30;
         this.g = var4 * 30;
         this.h = k.b[this.c][0];
         this.i = k.b[this.c][1];
         this.w = var5;
         label76:
         if (this.x) {
            this.j = (byte)(this.j + (ab.oc.nextInt(2) - 1));
            this.k = (byte)(this.k + (ab.oc.nextInt(2) - 1));
            if (this.c == 0) {
               this.G = 240;
               if (this.d >= 5 && this.d <= 8) {
                  this.E = 5;
                  this.F = (byte)ab.oc.nextInt(3);
                  this.I = K;
                  this.H = this.G / 4 * (9 - this.d);
                  if (!var6) {
                     break label76;
                  }
               }

               if (this.d < 9 || this.d > 12) {
                  break label76;
               }

               this.E = 9;
               this.F = (byte)ab.oc.nextInt(3);
               this.I = K;
               this.H = this.G / 4 * (13 - this.d);
               if (!var6) {
                  break label76;
               }
            }

            if (this.c == 1) {
               this.E = -1;
               this.H = this.G = 30;
               this.F = (byte)ab.oc.nextInt(3);
               this.I = L;
            }
         }

         if (this.B) {
            this.j = (byte)(this.j + (ab.oc.nextInt(10) - 5));
            this.k = (byte)(this.k + (ab.oc.nextInt(10) - 5));
         }

         label60:
         if (this.A) {
            this.N = true;
            this.O = new nb(fb.cd);
            if (this.N) {
               this.O.j = (byte)(fb.cd.h - 1);
               if (!var6) {
                  break label60;
               }
            }

            this.O.j = 0;
         }

         if (this.C) {
            this.N = true;
         }

         if (this.D) {
            this.N = true;
            return;
         }
      } else {
         this.c = -1;
         this.d = -1;
      }
   }

   public final void b() {
      boolean var5 = ab.xc;
      if (this.d != -1) {
         label123: {
            if (this.A) {
               this.O.c();
               if (this.M > 0L) {
                  this.M--;
               }

               if (this.N || this.M > 0L || !fb.M || fb.i() || this.O.e) {
                  break label123;
               }

               if (this.O.j == 0) {
                  this.O.b(false, false, (byte)2);
                  if (!var5) {
                     break label123;
                  }
               }

               this.N = true;
               if (!var5) {
                  break label123;
               }
            }

            if (this.C) {
               if (fb.kb % 17L == 0L) {
                  int var1 = this.f + 58;
                  int var2 = this.g + 48;
                  q var3;
                  if (o.c(var1, var2, 30, 20) && (var3 = q.b(var1, var2, null, -1, 90)) != null && var3.d / 10 > var2) {
                     var1 = var3.c / 10 - var1;
                     if ((var2 = 2 - var1 / 30) < 0) {
                        var2 = 0;
                     }

                     if (var2 > 4) {
                        var2 = 4;
                     }

                     this.O.b();
                     this.O.j = (byte)var2;
                  }
               }

               this.O.c();
            }
         }

         if (this.x && this.v) {
            if (this.r) {
               this.n = this.n + this.p / 15;
            }

            if (this.s) {
               this.o = this.o + this.q / 15;
            }

            if (this.r) {
               this.l = this.l + this.n;
               if (this.n > 0 && this.l > 0 || this.n < 0 && this.l < 0) {
                  this.n = 0;
                  this.l = 0;
                  this.r = false;
               }
            }

            if (this.s) {
               this.m = this.m + this.o;
               if (this.o > 0 && this.m > 0 || this.o < 0 && this.m < 0) {
                  this.o = 0;
                  this.m = 0;
                  this.s = false;
               }
            }

            if (!this.r && !this.s) {
               this.v = false;
            }

            this.t = this.l / 10;
            this.u = this.m / 10;
         }

         if (this.z && this.N) {
            if (this.M > 0L) {
               this.M--;
               if (fb.rd == null) {
                  fb.rd = ab.b("weapons/np/rocket_sparks.png", 30, 30);
                  this.O = new nb(fb.rd);
                  this.O.b(true, false, (byte)1);
                  return;
               }
            } else {
               this.O.c();
               this.o++;
               this.i = this.i - this.o / 25;
            }
         }
      }
   }

   public final void b(Graphics var1) {
      if (this.c != -1) {
         int var2 = -fb.Ge;
         int var3 = -fb.He;
         if (this.C) {
            this.O.b(var1, this.f + var2 + 58, this.g + var3 + 48);
         }

         if (this.z && this.N && this.O != null && this.M <= 0L) {
            this.O.b(var1, this.f + this.h + var2 + 48, this.g + this.i + var3 + 135 + 15);
            this.O.b(var1, this.f + this.h + var2 + 101, this.g + this.i + var3 + 133 + 15);
            this.O.b(var1, this.f + this.h + var2 + 125, this.g + this.i + var3 + 96 + 15);
         }

         if (this.z && this.w == 1 && fb.zb != null) {
            fb.zb.b(this.f + this.j + var2 - 25, this.g + this.k + var3);
            fb.zb.b(var1);
         }

         this.e.b = this.d;
         this.e.b(this.f + this.j + var2 + this.h + this.t, this.g + this.k + var3 + this.i + this.u);
         this.e.b(var1);
         if (this.A) {
            this.O.b(var1, this.f + var2 + 5, this.g + var3 + 15);
         }
      }
   }

   public final void b(int var1, int var2) {
      boolean var5 = ab.xc;

      while (this.x && !this.v) {
         this.v = true;
         int var3 = 1;
         if (Math.abs(var1) > 10 && Math.abs(var2) > 10) {
            var3 = 3;
         }

         this.n = 0;
         this.o = 0;
         this.p = -var1 / var3;
         this.q = -var2 / var3;
         this.l = var1 / var3;
         this.m = var2 / var3;
         if (Math.abs(var1) > 10) {
            this.r = true;
         }

         if (Math.abs(var2) > 10) {
            this.s = true;
         }

         var3 = this.f / 30;
         int var4 = this.g / 30;
         if (var1 != 0 && (var3 = var3 + Math.abs(var1) / var1) >= 0 && var3 < fb.Pe && fb.Re != null && fb.Re[var3][var4].d != null) {
            fb.Re[var3][var4].d.b(var1 / 2, 0);
         }

         var3 = this.f / 30;
         var4 = this.g / 30;
         if (var2 == 0 || (var4 = var4 + Math.abs(var2) / var2) < 0 || var4 >= fb.Qe || fb.Re == null || fb.Re[var3][var4].d == null) {
            break;
         }

         var2 /= 2;
         var1 = 0;
         this = fb.Re[var3][var4].d;
         if (var5) {
            break;
         }
      }
   }

   public final int c() {
      return this.f + 15 + this.j;
   }

   public final int d() {
      return this.g + 15 + this.k;
   }

   public final boolean e() {
      return this.c == -1 ? false : o.c(this.f + this.h + this.t + this.e.d / 2, this.g + this.i + this.u + this.e.e / 2, this.e.d, this.e.e);
   }

   public static void b(Graphics var0, j var1) {
      int var2 = -fb.Ge;
      int var3 = -fb.He;
      if (var1.w == 0) {
         fb.Yc.b = 0;
         fb.Yc.b(var1.f + var1.h + var2, var1.g + var1.i + var3);
         fb.Yc.b(var0);
      } else {
         if (var1.w == 1) {
            fb.ad.b = 0;
            fb.ad.b(var1.f + var1.h + var2, var1.g + var1.i + var3);
            fb.ad.b(var0);
         }
      }
   }

   public final void b(int var1) {
      if (this.I != 0) {
         this.c(this.H - var1);
      }
   }

   public final void c(int var1) {
      label78: {
         boolean var2 = ab.xc;
         this.H = var1;
         if (this.H > 0) {
            label72: {
               if (this.G == 0) {
                  var1 = 99;
                  if (!var2) {
                     break label72;
                  }
               }

               var1 = 100 * this.H / this.G - 1;
            }

            if (this.E != -1) {
               this.d = (byte)(this.E + (3 - var1 / 25));
               if (fb.Kc != null) {
                  var1 = 0;

                  while (var1 <= 2) {
                     new t(
                        (byte)1,
                        fb.Kc,
                        5,
                        this.c() + ((ab.oc.nextInt(10) << 1) - (ab.oc.nextInt(10) << 1)),
                        this.d() + ((ab.oc.nextInt(10) << 1) - (ab.oc.nextInt(10) << 1)),
                        0,
                        1
                     );
                     var1++;
                     if (var2) {
                        break label78;
                     }

                     if (var2) {
                        break;
                     }
                  }
               }
            }

            if (!var2) {
               break label78;
            }
         }

         label52: {
            label51: {
               if (this.I == K) {
                  if (fb.tb == null) {
                     break label51;
                  }

                  new d(fb.tb, this.F, this.c(), this.d(), ab.sc);
                  if (!var2) {
                     break label51;
                  }
               }

               if (this.I == L) {
                  if (fb.Vc != null) {
                     new d(fb.Vc, this.F, this.c(), this.d(), ab.sc);
                  }

                  if (fb.Kc != null) {
                     var1 = 0;

                     while (var1 <= 3) {
                        new t(
                           (byte)1,
                           fb.Kc,
                           5,
                           this.c() + ((ab.oc.nextInt(10) << 1) - (ab.oc.nextInt(10) << 1)),
                           this.d() + ((ab.oc.nextInt(10) << 1) - (ab.oc.nextInt(10) << 1)),
                           0,
                           1
                        );
                        var1++;
                        if (var2) {
                           break label52;
                        }

                        if (var2) {
                           break;
                        }
                     }
                  }
               }
            }

            this.f();
         }

         this.H = 0;
      }

      if (fb.M) {
         fb.I.b((byte)(this.f / 30), (byte)(this.g / 30), this.H);
      }
   }

   public final void f() {
      if (fb.Re != null && fb.Re[this.f / 30][this.g / 30].d != null) {
         fb.Re[this.f / 30][this.g / 30].d = null;
         fb.k();
      }
   }

   public final boolean b(q var1, boolean var2, boolean var3) {
      if (!this.N && !var3) {
         return false;
      }

      if (this.A) {
         if (var3) {
            this.g();
            return true;
         }

         if (var1.r == 0) {
            if (var1.nc >= var1.mc) {
               return false;
            }

            if (var2) {
               return true;
            }

            if (fb.M || fb.i()) {
               var1.b(var1.mc, -1, -1, true, false);
            }

            this.g();
            return true;
         }
      }

      if (this.C) {
         (new w(null, this.f + 45, this.g + 30, (byte)8, true, 0)).i = "Use the Force, Pipyaka! :)";
      }

      if (this.D && fb.Pd != null) {
         ab.B.b(fb.Pd, false, !fb.i(), true, -1);
      }

      return false;
   }

   private void g() {
      if (this.A) {
         this.M = 375L;
         this.O.b(false, true, (byte)1);
         this.N = false;
      }
   }

   public static boolean c(int var0, int var1) {
      return o.b((byte)var0, (byte)var1) ? fb.Re[var0][var1].d != null : true;
   }
}
