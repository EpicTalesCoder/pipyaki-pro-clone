import javax.microedition.lcdui.Graphics;

public final class u extends o {
   public boolean r = false;
   public static byte s = 3;
   public static byte t = 1;
   public static byte u = 2;
   private static byte v = 3;
   public boolean w;
   public nb x;
   private int y;
   private int z;
   private int A;
   private int B;
   private int C;
   public boolean D;
   public byte E;
   private boolean F;
   public boolean G;
   public byte H;
   public byte I;
   private int J;
   public byte K;
   public boolean L;
   public boolean M;
   public boolean N;
   public int O;
   public int P;
   public int Q;
   public byte R;
   private boolean S;
   private boolean T;

   public u(pb var1, byte var2, byte var3, byte var4, int var5, int var6, int var7, int var8, int var9, boolean var10, boolean var11, boolean var12) {
      super((byte)-1, (byte)-1, var5, var6);
      this.e = -1;
      this.f = -1;
      this.A = var7;
      if (this.A <= 0) {
         this.A = 1;
      }

      this.C = var8;
      if (this.C <= 0) {
         this.C = 1;
      }

      if (this.C > 100) {
         this.C = 100;
      }

      this.B = var9;
      if (this.B < 0) {
         this.B = 0;
      }

      if (this.B > 100) {
         this.B = 100;
      }

      this.D = var11;
      this.F = var12;
      if (var1 != null) {
         this.e = -1;
         this.f = -1;
         this.x = new nb(var1);
         this.x.j = var2;
         this.y = this.x.c;
         this.z = this.x.d;
      }

      this.J = -1;
   }

   public final void b(int var1, int var2, int var3) {
      this.l = var1;
      this.m = var2;
      if (var3 != 0) {
         this.N = true;
         this.Q = var3;
      }

      if (this.K > 0) {
         this.l /= 10;
         this.m /= 10;
         this.Q /= 10;
      }

      this.S = true;
   }

   public final void b(int var1) {
      this.N = true;
      this.P = var1 * 10;
      this.S = true;
   }

   public final boolean e() {
      return super.e() | this.N;
   }

   public final boolean d() {
      return o.c(super.c / 10, super.d / 10 - this.O, this.y, this.z);
   }

   public final void h() {
      boolean var4 = ab.xc;
      if (this.J != -1) {
         this.J--;
         if (this.J < 0) {
            this.J = 0;
         }
      }

      if (this.S) {
         if (!this.T && this.g()) {
            this.T = true;
         }

         if (this.D) {
            this.H = this.g;
            this.I = this.h;
         }

         if (this.N) {
            this.Q = this.Q - s;
            this.P = this.P + this.Q;
            if (this.P <= 0) {
               this.Q = (-this.Q - s) * this.C / 100;
               this.P = 0;
               this.G = true;
               if (this.Q == 0) {
                  this.N = false;
               }
            }

            this.O = this.P / 10;
         }

         label131: {
            if (this.O >= 5) {
               this.w = true;
               if (!var4) {
                  break label131;
               }
            }

            this.w = false;
         }

         label141: {
            if (this.K > 0) {
               if (fb.kb % this.K != 0L) {
                  break label141;
               }

               if (this.l != 0) {
                  this.l = this.l - this.l / Math.abs(this.l);
                  if (Math.abs(this.l) <= 1) {
                     this.l = 0;
                  }
               }

               if (this.m == 0) {
                  break label141;
               }

               this.m = this.m - this.m / Math.abs(this.m);
               if (Math.abs(this.m) > 1) {
                  break label141;
               }

               this.m = 0;
               if (!var4) {
                  break label141;
               }
            }

            if (!this.M || this.M && this.P < 15) {
               if (this.l != 0) {
                  this.l = this.l - this.l * this.B / 100;
                  if (Math.abs(this.l) <= 10) {
                     this.l = 0;
                  }
               }

               if (this.m != 0) {
                  this.m = this.m - this.m * this.B / 100;
                  if (Math.abs(this.m) <= 10) {
                     this.m = 0;
                  }
               }
            }
         }

         if (this.x != null) {
            this.x.c();
         }

         super.h();
         if (this.D) {
            byte var10000;
            label105: {
               u var1 = this;
               byte var2 = this.g;
               byte var3 = var1.h;
               if (b(var2, var3)) {
                  if (var1.H != var2) {
                     if (fb.Re[var2][var3].d != null) {
                        var10000 = 1;
                        break label105;
                     }

                     if (var1.L && fb.bf != null && fb.bf[var2][var3] == 0) {
                        var10000 = 1;
                        break label105;
                     }
                  }

                  if (var1.I != var3) {
                     if (fb.Re[var2][var3].d != null) {
                        var10000 = 2;
                        break label105;
                     }

                     if (var1.L && fb.bf != null && fb.bf[var2][var3] == 0) {
                        var10000 = 2;
                        break label105;
                     }
                  }

                  if (fb.Re[var2][var3].d != null) {
                     var10000 = 3;
                     break label105;
                  }
               }

               var10000 = 0;
            }

            byte var5 = var10000;
            if (var10000 != 0) {
               this.c = this.c - this.l;
               this.d = this.d - this.m;
               if (var5 == 1) {
                  this.l = -this.l * this.C / 100;
               }

               if (var5 == 2) {
                  this.m = -this.m * this.C / 100;
               }

               this.E = var5;
            }
         }
      }
   }

   public final void b(Graphics var1) {
      boolean var5 = ab.xc;
      label39:
      if (this.R != 0) {
         if (this.R == t) {
            if (fb.Nb == null) {
               break label39;
            }

            fb.Nb.b(super.c / 10 - fb.Nb.d / 2 - fb.Ge, super.d / 10 - fb.Nb.e / 2 + 5 - fb.He);
            fb.Nb.b(var1);
            if (!var5) {
               break label39;
            }
         }

         if (this.R == u) {
            if (fb.Ob == null) {
               break label39;
            }

            fb.Ob.b = 2;
            fb.Ob.b(super.c / 10 - fb.Ob.d / 2 - fb.Ge, super.d / 10 - fb.Ob.e / 2 + 8 - fb.He);
            fb.Ob.b(var1);
            if (!var5) {
               break label39;
            }
         }

         if (this.R == v && fb.Pb != null) {
            fb.Pb.b = 2;
            fb.Pb.b(super.c / 10 - fb.Pb.d / 2 - fb.Ge, super.d / 10 - fb.Pb.e / 2 + 8 - fb.He);
            fb.Pb.b(var1);
         }
      }

      if (this.x == null) {
         super.b(var1);
      } else {
         int var2 = -fb.Ge;
         int var3 = -fb.He;
         this.x.b(var1, super.c / 10 + var2, super.d / 10 + var3 - this.O);
         if (this.r && fb.rd != null) {
            fb.rd.b = (int)(fb.kb % 5L);
            fb.rd.b(super.c / 10 + var2 - 15, super.d / 10 + var3 - this.O - 3 + this.x.d / 2);
            fb.rd.b(var1);
         }
      }
   }
}
