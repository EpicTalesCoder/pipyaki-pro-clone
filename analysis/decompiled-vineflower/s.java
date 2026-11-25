import javax.microedition.lcdui.Graphics;

public final class s extends o {
   public boolean r;
   public boolean s;
   public nb t;
   public byte u;
   private boolean v;
   private byte w;
   private byte x;
   public boolean y;
   private boolean z;
   private boolean A;
   public static byte[][] B;
   private boolean C;
   public int D;
   public int E;
   private int F;
   public byte G;
   public q H;
   private int[] I;
   public boolean J;
   public int K;
   public int L;

   public s(byte var1, byte var2, byte var3, boolean var4) {
      boolean var5 = ab.xc;
      super((byte)-1, (byte)-1, var2 * 30 + 15, var3 * 30 + 15);
      this.C = true;
      this.K = 0;
      this.L = 0;
      this.u = var1;
      boolean var6 = false;
      this.z = (boolean)var4;
      switch (this.u) {
         case -1:
            this.t = new nb(fb.Sc);
            this.t.j = 0;
            this.I = new int[10];
            this.J = true;
            if (!var5) {
               break;
            }
         case 1:
            this.t = new nb(fb.Rc);
            this.w = -7;
            this.x = -2;
            if (!var5) {
               break;
            }
         case 2:
            this.t = new nb(fb.oc);
            var4 = ab.oc.nextInt(4);
            this.t.j = var4 < 2 ? (byte)var4 : (byte)(this.t.b.h - 1 - (var4 - 2));
            this.w = (byte)ab.oc.nextInt(10);
            this.s = true;
            if (!var5) {
               break;
            }
         case 3:
            this.t = new nb(fb.pc);
            var4 = ab.oc.nextInt(4);
            this.t.j = var4 < 2 ? (byte)var4 : (byte)(this.t.b.h - 1 - (var4 - 2));
            this.w = (byte)ab.oc.nextInt(10);
            this.s = true;
            if (!var5) {
               break;
            }
         case 12:
            this.t = new nb(fb.nc);
            var4 = ab.oc.nextInt(4);
            this.t.j = var4 < 2 ? (byte)var4 : (byte)(this.t.b.h - 1 - (var4 - 2));
            this.w = (byte)ab.oc.nextInt(10);
            this.s = true;
            if (!var5) {
               break;
            }
         case 4:
            this.t = new nb(fb.uc);
            this.t.j = (byte)ab.oc.nextInt(this.t.b.h);
            this.w = (byte)ab.oc.nextInt(10);
            this.s = true;
            if (!var5) {
               break;
            }
         case 5:
            this.t = new nb(fb.wc);
            this.t.j = (byte)ab.oc.nextInt(this.t.b.h);
            this.w = (byte)ab.oc.nextInt(10);
            this.s = true;
            if (!var5) {
               break;
            }
         case 6:
            this.t = new nb(fb.Ac);
            var6 = true;
            this.I = new int[10];
            if (!var5) {
               break;
            }
         case 7:
            this.t = new nb(fb.kc);
            this.t.j = (byte)ab.oc.nextInt(this.t.b.h);
            this.w = (byte)ab.oc.nextInt(10);
            this.s = true;
            if (!var5) {
               break;
            }
         case 8:
            this.t = new nb(fb.Cb);
            this.t.j = (byte)ab.oc.nextInt(3);
            this.w = (byte)ab.oc.nextInt(10);
            this.s = true;
            if (!var5) {
               break;
            }
         case 11:
            this.t = new nb(fb.Bb);
            this.t.j = (byte)(2 + ab.oc.nextInt(3));
            this.w = (byte)ab.oc.nextInt(10);
            this.s = true;
            if (!var5) {
               break;
            }
         case 17:
            this.t = new nb(fb.pb);
            var4 = ab.oc.nextInt(4);
            this.t.j = var4 < 2 ? (byte)var4 : (byte)(this.t.b.h - 1 - (var4 - 2));
            this.w = (byte)ab.oc.nextInt(10);
            this.s = true;
            this.t.b(true, false, (byte)1);
            if (!var5) {
               break;
            }
         case 9:
            this.t = new nb(fb.Fb);
            this.t.j = (byte)ab.oc.nextInt(3);
            this.w = (byte)ab.oc.nextInt(10);
            this.s = true;
            if (!var5) {
               break;
            }
         case 10:
            this.t = new nb(fb.yc);
            this.t.j = (byte)ab.oc.nextInt(this.t.b.h);
            this.w = (byte)ab.oc.nextInt(10);
            this.s = true;
            if (!var5) {
               break;
            }
         case 13:
            this.t = new nb(fb.Gb);
            this.t.j = 0;
            this.w = (byte)ab.oc.nextInt(10);
            this.s = true;
            if (!var5) {
               break;
            }
         case 14:
            this.t = new nb(fb.Fc);
            this.t.j = 1;
            this.w = (byte)ab.oc.nextInt(10);
            this.s = true;
            if (!var5) {
               break;
            }
         case 15:
            this.t = new nb(fb.Pc);
            this.w = (byte)ab.oc.nextInt(10);
            this.s = true;
            if (!var5) {
               break;
            }
         case 16:
            this.t = new nb(fb.Sc);
            this.t.j = (byte)ab.oc.nextInt(this.t.b.h);
            this.w = 0;
         case 0:
      }

      if (fb.Yd != null && !var6) {
         if (B == null) {
            B = new byte[fb.Pe][fb.Qe];
         }

         B[var2][var3] = this.u;
         fb.Yd.addElement(this);
      }

      label98: {
         if (this.u == 4) {
            b(this.g, this.h, 3, 1);
            if (!var5) {
               break label98;
            }
         }

         if (this.u == 7) {
            b(this.g, this.h, 4, 1);
            if (!var5) {
               break label98;
            }
         }

         if (this.u == 10) {
            b(this.g, this.h, 5, 1);
         }
      }

      q[] var7;
      if ((var7 = q.b(this.g, this.h, 1, null)) != null && var7.length > 0) {
         this.A = true;
      }
   }

   private boolean f() {
      if (this.u == 4) {
         return fb.b((int)this.g, (int)this.h, (int)3) != null;
      } else if (this.u == 7) {
         return fb.b((int)this.g, (int)this.h, (int)4) != null;
      } else {
         return this.u == 10 ? fb.b((int)this.g, (int)this.h, (int)5) != null : false;
      }
   }

   private static void b(int var0, int var1, int var2, int var3) {
      o var4;
      if ((var4 = fb.b(var0, var1, var2)) != null) {
         if (var3 == 0 && var4.f < 2) {
            var4.f = (byte)(var4.f + 2);
            return;
         }

         if (var3 > 0 && var4.f > 1) {
            var4.f = (byte)(var4.f - 2);
         }
      }
   }

   public final boolean b(q var1) {
      if (var1 == null || this.r || this.u == -1) {
         return true;
      }

      if (fb.i() && var1 != fb.Pd && this.u != 1) {
         return false;
      }

      switch (this.u) {
         case 1:
            byte var2 = y.b(var1.g, var1.h, this.g, this.h);
            if (fb.M || fb.i()) {
               byte var7 = var1.l();
               boolean var8 = false;
               if (var7 != var2) {
                  var8 = true;
               }

               var1.d(y.d(var2, this.g), y.e(var2, this.h));
               var1.b(var1.g, var1.h, var2, (byte)1, true, true, var8, (byte)1, (byte)-1, (byte)0, (byte)0);
               this.g();
               if (!ab.xc) {
                  return true;
               }
            }

            if (fb.Pd == var1) {
               var1.d(y.d(var2, this.g), y.e(var2, this.h));
            }

            return true;
         case 2:
            if (!var1.fb && !var1.ib && !var1.kb) {
               if (fb.M || fb.i()) {
                  var1.e((byte)30, true);
                  fb.e++;
                  this.g();
               }

               return true;
            }

            return false;
         case 3:
            if (!var1.fb && !var1.ib && !var1.kb) {
               if (fb.M || fb.i()) {
                  var1.g((byte)var1.x(), true);
                  fb.e++;
                  this.g();
               }

               return true;
            }

            return false;
         case 4:
            if (fb.M || fb.i()) {
               var1.c((byte)0, var1.dc[0] + 1 + (this.f() ? 2 : 0), true);
               fb.e++;
               this.g();
            }

            return true;
         case 5:
            if (fb.M || fb.i()) {
               var1.b((byte)9, var1.Yb[9] + 1 + ab.oc.nextInt(5), true);
               fb.e++;
               this.g();
            }

            return true;
         case 6:
            if (this.H == null) {
               if (var1.x != this.G) {
                  if (fb.M || fb.i()) {
                     fb.I.b(this.G, (byte)2, var1.w, this.g, this.h, (byte)1);
                  }

                  return true;
               }

               if (fb.b(var1) != -1 && fb.c(var1.x)) {
                  if (fb.M || fb.i()) {
                     fb.I.b(fb.b(var1), (byte)0, var1.w, this.g, this.h, (byte)2);
                  }

                  return true;
               }

               if (!fb.c(var1.x)) {
                  if (fb.M || fb.i()) {
                     fb.I.b(var1.x, (byte)0, var1.w, this.g, this.h, (byte)3);
                  }

                  return true;
               }
            }

            return false;
         case 7:
            if (fb.M || fb.i()) {
               var1.b((byte)2, var1.Yb[2] + (5 + ab.oc.nextInt(6)) * (this.f() ? 2 : 1), true);
               fb.e++;
               this.g();
            }

            return true;
         case 8:
            if (fb.M || fb.i()) {
               var1.b((byte)5, var1.Yb[5] + 5 + ab.oc.nextInt(11), true);
               fb.e++;
               this.g();
            }

            return true;
         case 9:
            if (fb.M || fb.i()) {
               var1.b((byte)3, var1.Yb[3] + 10 + ab.oc.nextInt(11), true);
               fb.e++;
               this.g();
            }

            return true;
         case 10:
            if (fb.M || fb.i()) {
               var1.c((byte)4, var1.dc[4] + 1, true);
               fb.e++;
               this.g();
            }

            return true;
         case 11:
            if (fb.M || fb.i()) {
               int var6 = 8 + ab.oc.nextInt(7);
               var1.b((byte)0, var1.Yb[0] + var6, false);
               fb.e++;
               this.g();
            }

            return true;
         case 12:
            if (!var1.fb && !var1.ib && !var1.kb) {
               if (fb.M || fb.i()) {
                  var1.f((byte)30, true);
                  fb.e++;
                  this.g();
               }

               return true;
            }

            return false;
         case 13:
            if (fb.M || fb.i()) {
               var1.b((byte)7, var1.Yb[7] + 5 + ab.oc.nextInt(11), true);
               fb.e++;
               this.g();
            }

            return true;
         case 14:
            if (fb.M || fb.i()) {
               var1.b((byte)12, var1.Yb[12] + 10 + ab.oc.nextInt(11), true);
               fb.e++;
               this.g();
            }

            return true;
         case 15:
            if (fb.M || fb.i()) {
               var1.b((byte)13, var1.Yb[13] + 5 + ab.oc.nextInt(11), true);
               fb.e++;
               this.g();
            }

            return true;
         case 16:
            if (fb.M || fb.i()) {
               int var5 = this.L;
               byte var4 = (byte)this.K;
               var1.b(var4, var1.Yb[var4] + var5, true);
               this.g();
            }

            return true;
         case 17:
            if (fb.M || fb.i()) {
               int var3 = 8 + ab.oc.nextInt(7);
               var1.b(var1.C + var3, true);
               fb.e++;
               this.g();
            }

            return true;
         default:
            return false;
      }
   }

   public static s b(byte var0, byte var1) {
      boolean var3 = ab.xc;
      if (fb.Yd != null && fb.Yd.size() > 0) {
         int var2 = 0;

         while (var2 < fb.Yd.size()) {
            if (((s)fb.Yd.elementAt(var2)).g == var0 && ((s)fb.Yd.elementAt(var2)).h == var1) {
               return (s)fb.Yd.elementAt(var2);
            }

            var2++;
            if (var3) {
               break;
            }
         }
      }

      return null;
   }

   public final void h() {
      boolean var7 = ab.xc;
      if (fb.Re != null && !this.a()) {
         this.y = true;
      } else {
         super.h();
         q[] var1;
         if (this.A && (var1 = q.b(this.g, this.h, 1, null)) != null && var1.length > 0) {
            this.b(var1[0]);
         }

         if (fb.Re != null && this.a()) {
            s var10000;
            boolean var10001;
            label253: {
               if (this.u == 6) {
                  var10000 = this;
               } else {
                  var10000 = this;
                  if (fb.Re[this.g][this.h].d != null && !this.z) {
                     var10001 = true;
                     break label253;
                  }
               }

               var10001 = false;
            }

            var10000.y = var10001;
            if (this.y) {
               return;
            }
         }

         if (this.t != null) {
            this.t.c();
         }

         if (this.u != 6 && this.u != 1 && this.u != 16 && this.u != -1) {
            this.C = !this.C;
            label241:
            if (this.C) {
               if (!this.v) {
                  if (this.w < 10) {
                     this.w++;
                     if (!var7) {
                        break label241;
                     }
                  }

                  this.v = true;
                  if (!var7) {
                     break label241;
                  }
               }

               if (this.w > 5) {
                  this.w--;
                  if (!var7) {
                     break label241;
                  }
               }

               this.v = false;
            }
         }

         if (this.u == 6 || this.u == -1) {
            label223: {
               if (this.u != -1) {
                  if (!fb.M && !fb.i() || this.H == null || !this.H.m()) {
                     break label223;
                  }

                  fb.I.b(this.G, (byte)1, this.H.w, this.g, this.h, (byte)0);
                  if (!var7) {
                     break label223;
                  }
               }

               if (this.J && this.H != null && this.H.V) {
                  this.g();
                  return;
               }
            }

            int var2;
            int var3;
            boolean var4;
            boolean var5;
            label211: {
               var4 = 0;
               var5 = 0;
               if (this.H != null) {
                  q var6 = this.H;
                  int var15 = this.H.c / 10;
                  var6 = this.H;
                  this.b(var15, this.H.d / 10);
                  var8 = super.c / 10 - this.D;
                  var2 = super.d / 10 - this.E;
                  if (!this.J) {
                     var3 = 40 - b(0, 0, var8, var2) + this.H.Ib - this.F + 5;
                     if (!var7) {
                        break label211;
                     }
                  }

                  var3 = 0;
                  if (this.H.vb == 0) {
                     break label211;
                  }

                  if (this.H.ub % 2 == 0) {
                     var4 = 1;
                     if (!var7) {
                        break label211;
                     }
                  }

                  var5 = 1;
                  if (!var7) {
                     break label211;
                  }
               }

               var8 = this.g * 30 + 15 - this.D;
               var2 = this.h * 30 + 15 - this.E;
               var3 = 30 - this.F;
            }

            label197:
            if (var8 != 0) {
               if (Math.abs(var8) > 30) {
                  this.D = super.c / 10 - Math.abs(var8) / var8 * 30;
                  if (!var7) {
                     break label197;
                  }
               }

               if (!this.J || var4) {
                  this.x = 10;
                  if (var8 / this.x == 0) {
                     this.x = (byte)Math.abs(var8);
                  }

                  this.D = this.D + var8 / this.x;
               }
            }

            label187:
            if (var2 != 0) {
               if (Math.abs(var2) > 30) {
                  this.E = super.d / 10 - Math.abs(var2) / var2 * 30;
                  if (!var7) {
                     break label187;
                  }
               }

               if (!this.J || var5) {
                  this.x = 10;
                  if (var2 / this.x == 0) {
                     this.x = (byte)Math.abs(var2);
                  }

                  this.E = this.E + var2 / this.x;
               }
            }

            if (var3 != 0) {
               this.F += var3 / 5;
            }

            if (!this.J && (this.H == null || this.H != null && !this.H.r())) {
               boolean var9 = b(0, 0, var8, var2) > 30;
               label168:
               if (fb.kb % 5L == 0L || var9) {
                  if (!this.v) {
                     if (this.w < (var9 ? 4 : 5)) {
                        this.w = (byte)(this.w + (var9 ? 2 : 1));
                        if (!var7) {
                           break label168;
                        }
                     }

                     this.v = true;
                     if (!var7) {
                        break label168;
                     }
                  }

                  if (this.w > -(var9 ? 4 : 5)) {
                     this.w = (byte)(this.w - (var9 ? 2 : 1));
                     if (!var7) {
                        break label168;
                     }
                  }

                  this.v = false;
               }
            }

            if (this.J) {
               this.w = (byte)(this.w + this.t.d / 2);
            }

            var3 = this.D;
            var4 = this.E - this.F - this.w + 10;
            var5 = 0;

            s var14;
            label150: {
               while (var5 < this.I.length / 2) {
                  this.I[var5 << 1] = var3 * 10 + var8 * 10 / (this.I.length / 2 + 2) * var5;
                  var14 = this;
                  if (var7) {
                     break label150;
                  }

                  this.I[(var5 << 1) + 1] = var4 * 10
                     + (var2 - (this.H == null ? 0 : this.H.Ib)) * 10 / (this.I.length / 2 + 2) * var5
                     + (this.F + this.w - 15) * 10 / (this.I.length / 2 + 2) * var5;
                  var5++;
                  if (var7) {
                     break;
                  }
               }

               var14 = this;
            }

            if (var14.J) {
               this.w = 0;
            }
         }
      }
   }

   public final void b(Graphics var1) {
      boolean var3 = ab.xc;
      if (!this.y) {
         label85: {
            if (this.u == 2
               || this.u == 3
               || this.u == 8
               || this.u == 7
               || this.u == 12
               || this.u == 13
               || this.u == 14
               || this.u == 15
               || this.u == 11
               || this.u == 9
               || this.u == 4
               || this.u == 10
               || this.u == 5
               || this.u == 17) {
               if (fb.Ob == null) {
                  break label85;
               }

               fb.Ob.b = 2;
               fb.Ob.b(super.c / 10 - fb.Ob.d / 2 - fb.Ge, super.d / 10 - fb.Ob.e / 2 + 8 - fb.He);
               fb.Ob.b(var1);
               if (!var3) {
                  break label85;
               }
            }

            if (this.u == 6) {
               this.t.j = this.G;
            }
         }

         if (this.u != 6 && this.u != -1) {
            if (this.t != null) {
               this.t.b(var1, super.c / 10 - fb.Ge + this.x, super.d / 10 - fb.He - this.w);
               return;
            }
         } else {
            if (this.I != null) {
               byte var2 = 0;

               while (var2 < this.I.length / 2) {
                  var1.drawImage(fb.Cc, this.I[var2 << 1] / 10 - fb.Ge, this.I[(var2 << 1) + 1] / 10 - fb.He, 0);
                  var2++;
                  if (var3) {
                     return;
                  }

                  if (var3) {
                     break;
                  }
               }
            }

            this.t.b(var1, this.D - fb.Ge, this.E - fb.He - this.w - this.F);
         }
      }
   }

   public final void g() {
      boolean var1 = ab.xc;
      if (this.u == 6) {
         this.H = null;
         fb.b(this.G);
      } else {
         label40: {
            if (this.u == 4) {
               b(this.g, this.h, 3, 0);
               if (!var1) {
                  break label40;
               }
            }

            if (this.u == 7) {
               b(this.g, this.h, 4, 0);
               if (!var1) {
                  break label40;
               }
            }

            if (this.u == 10) {
               b(this.g, this.h, 5, 0);
            }
         }

         if (this.u != 1) {
            if (o.c(this.g, this.h)) {
               ab.G.b(ab.S, 0);
            }

            if (fb.Yd != null) {
               if (B != null) {
                  B[this.g][this.h] = 0;
               }

               this.r = true;
            }
         }
      }
   }
}
