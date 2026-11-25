import javax.microedition.lcdui.Graphics;

public final class hb {
   public static int[] b;
   public static int[] c;
   public static int[] d;
   public static int[] e;
   public static final int[] f = new int[]{1, 4, 3, 6, 5, 8, 7, 2, 9, 12, 0, 13, 11, 10};
   public static int[] g;
   public static int[] h;
   private static int i = 37;
   private static byte[] j = new byte[]{10, 13};
   private static byte[] k = new byte[]{12, 11, 10, 9, 8, 7, 6, 5, 4, 6, 6, 6, 5, 4};
   private static byte[] l = new byte[]{8, 8, 9, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 0, 0, 1, 1, 2, 7};
   private static int m = 250;
   private static int n = 20;
   public byte o;
   public boolean p;
   public byte q;
   public byte r;
   private byte s;
   private byte t;
   private boolean u;
   private u v;
   private nb w;
   public q x;
   private q y;
   public q z;
   private boolean A;
   private boolean B;
   private boolean C;
   private int D;
   public boolean E;
   public boolean F;
   private byte[] G;
   private byte H;
   private boolean I;
   private boolean J;
   private int K;
   private int L;
   private int M;
   private byte N;
   private byte O;
   private boolean P;
   public static boolean[][] Q;
   public boolean R;
   public boolean S;
   private boolean T;
   private r U;

   private hb(byte var1, byte var2, byte var3, q var4, byte[] var5) {
      boolean var7 = ab.xc;
      super();
      this.o = (byte)var1;
      this.s = this.q = var2;
      this.t = this.r = var3;
      var1 = var2 * 30 + 15;
      int var6 = var3 * 30 + 15;
      if (Q == null) {
         Q = new boolean[fb.Pe][fb.Qe];
      }

      label167: {
         label162: {
            label168: {
               label169: {
                  label170: {
                     label171: {
                        label172: {
                           label173: {
                              this.x = var4;
                              this.y = var4;
                              this.G = var5;
                              this.D = this.L = -1;
                              this.M = q.b(this.x, this.o);
                              switch (this.o) {
                                 case -2:
                                 default:
                                    break label167;
                                 case -1:
                                    this.S = true;
                                    this.B = true;
                                    this.N = -1;
                                    if (!var7) {
                                       break label167;
                                    }
                                 case -3:
                                    this.S = true;
                                    this.B = true;
                                    if (!var7) {
                                       break label167;
                                    }
                                 case -4:
                                    this.v = new u(fb.id, (byte)0, (byte)-1, (byte)-1, var1, var6, 20, 0, 5, false, true, true);
                                    this.K = 150;
                                    this.N = 0;
                                    if (this.x != null) {
                                       this.b(this.x.k(), this.x);
                                    }

                                    this.T = true;
                                    this.J = true;
                                    if (!var7) {
                                       break label167;
                                    }
                                 case -5:
                                    this.v = new u(fb.od, (byte)0, (byte)-1, (byte)-1, var1, var6, 500, 0, 100, false, true, false);
                                    this.v.R = u.u;
                                    this.v.M = true;
                                    this.K = 100;
                                    this.D = this.L = -1;
                                    this.N = 2;
                                    this.O = 4;
                                    if (this.x != null) {
                                       this.b(this.x.k(), this.x);
                                    }

                                    this.T = true;
                                    if (!var7) {
                                       break label167;
                                    }
                                 case -6:
                                    this.v = new u(fb.qd, (byte)0, (byte)-1, (byte)-1, var1, var6, 1, 1, 1, false, false, false);
                                    this.v.M = true;
                                    this.B = false;
                                    this.C = false;
                                    this.v.R = u.t;
                                    this.O = 6;
                                    this.N = 3;
                                    this.u = true;
                                    this.D = this.L = -1;
                                    if (this.x == null) {
                                       break label167;
                                    }

                                    this.b(this.x.k(), this.x);
                                    if (!var7) {
                                       break label167;
                                    }
                                 case 0:
                                    this.v = new u(fb.Bb, (byte)2, (byte)-1, (byte)-1, var1, var6, 200, 1, 10, false, true, false);
                                    this.v.R = u.u;
                                    this.K = 160;
                                    this.D = this.L = 75;
                                    this.N = 5;
                                    this.O = 1;
                                    this.R = true;
                                    if (!var7) {
                                       break label167;
                                    }
                                 case 1:
                                    this.v = new u(fb.Ib, (byte)2, (byte)-1, (byte)-1, var1, var6, 200, 100, 0, false, true, false);
                                    this.v.R = u.u;
                                    this.K = 100;
                                    this.D = this.L = 75;
                                    this.N = 5;
                                    this.O = 8;
                                    this.R = true;
                                    if (!var7) {
                                       break label167;
                                    }
                                 case 3:
                                    this.v = new u(fb.Fb, (byte)2, (byte)-1, (byte)-1, var1, var6, 100, 0, 1, false, true, false);
                                    this.v.R = u.u;
                                    this.K = 150;
                                    this.D = this.L = -1;
                                    this.N = 2;
                                    this.O = 1;
                                    if (this.x != null) {
                                       this.b(this.x.k(), this.x);
                                    }

                                    this.T = true;
                                    if (!var7) {
                                       break label167;
                                    }
                                 case 4:
                                    this.v = new u(fb.Jb, (byte)2, (byte)-1, (byte)-1, var1, var6, 100, 0, 1, false, true, false);
                                    this.v.R = u.u;
                                    this.K = 150;
                                    this.D = this.L = -1;
                                    this.N = 2;
                                    this.B = true;
                                    this.O = 8;
                                    if (this.x != null) {
                                       this.b(this.x.k(), this.x);
                                    }

                                    this.T = true;
                                    if (!var7) {
                                       break label167;
                                    }
                                 case 5:
                                    label144: {
                                       this.v = new u(fb.Cb, (byte)2, (byte)-1, (byte)-1, var1, var6, 200, 100, 0, false, true, false);
                                       this.v.R = u.u;
                                       this.v.L = true;
                                       this.K = 50;
                                       this.N = 5;
                                       this.O = 1;
                                       if (this.x != null) {
                                          this.b(this.x.k(), this.x);
                                          if (!var7) {
                                             break label144;
                                          }
                                       }

                                       this.b((byte)0, null);
                                    }

                                    this.T = true;
                                    if (!var7) {
                                       break label167;
                                    }
                                 case 6:
                                    this.v = new u(fb.Kb, (byte)2, (byte)-1, (byte)-1, var1, var6, 200, 100, 0, false, true, false);
                                    this.v.R = u.u;
                                    this.v.L = true;
                                    this.K = 60;
                                    this.N = 5;
                                    this.L = 1;
                                    this.D = 0;
                                    this.O = 8;
                                    if (this.x != null) {
                                       this.b(this.x.k(), this.x);
                                    }

                                    this.T = true;
                                    if (!var7) {
                                       break label167;
                                    }
                                    break;
                                 case 2:
                                    break label172;
                                 case 7:
                                    break;
                                 case 8:
                                    break label173;
                                 case 9:
                                    break label169;
                                 case 10:
                                    break label170;
                                 case 11:
                                    break label171;
                                 case 12:
                                    break label168;
                                 case 13:
                                    break label162;
                              }

                              label137: {
                                 this.v = new u(fb.Gb, (byte)0, (byte)-1, (byte)-1, var1, var6, 200, 0, 100, false, false, false);
                                 this.v.R = u.u;
                                 if (this.G != null) {
                                    this.K = this.G[0] * 6;
                                    if (!var7) {
                                       break label137;
                                    }
                                 }

                                 this.K = 60;
                              }

                              this.D = this.L = -1;
                              this.N = 5;
                              this.O = 5;
                              if (this.x != null) {
                                 this.b(this.x.k(), this.x);
                              }

                              this.v.M = true;
                              this.T = true;
                              this.u = true;
                              if (!var7) {
                                 break label167;
                              }
                           }

                           label131: {
                              this.v = new u(fb.Lb, (byte)0, (byte)-1, (byte)-1, var1, var6, 200, 0, 100, false, false, false);
                              this.v.R = u.u;
                              if (this.G != null) {
                                 this.K = this.G[0] * 6;
                                 if (!var7) {
                                    break label131;
                                 }
                              }

                              this.K = 60;
                           }

                           this.D = this.L = -1;
                           this.N = 5;
                           this.O = 7;
                           if (this.x != null) {
                              this.b(this.x.k(), this.x);
                           }

                           this.v.M = true;
                           this.T = true;
                           this.u = true;
                           if (!var7) {
                              break label167;
                           }
                        }

                        this.v = new u(fb.kc, (byte)0, (byte)-1, (byte)-1, var1, var6, 300, 0, 1, false, true, false);
                        this.v.R = u.u;
                        this.v.x.j = (byte)ab.oc.nextInt(this.v.x.b.h);
                        this.K = 100;
                        this.N = 1;
                        this.O = 2;
                        if (this.x != null) {
                           this.b(this.x.k(), this.x);
                        }

                        this.T = true;
                        if (!var7) {
                           break label167;
                        }
                     }

                     this.w = new nb(fb.jc);
                     this.O = 0;
                     this.D = this.L = q.c(this.x);
                     this.N = 0;
                     if (var4 == null) {
                        this.B = true;
                     }

                     this.E = false;
                     this.C = true;
                     this.S = true;
                     if (!var7) {
                        break label167;
                     }
                  }

                  this.w = new nb(fb.vc);
                  this.w.j = (byte)ab.oc.nextInt(this.w.b.h);
                  this.N = 0;
                  if (var4 == null) {
                     this.B = true;
                  }

                  this.C = true;
                  this.S = true;
                  if (!var7) {
                     break label167;
                  }
               }

               this.v = new u(fb.xc, (byte)0, (byte)-1, (byte)-1, var1, var6, 50, 0, 5, false, true, false);
               this.v.R = u.t;
               this.v.x.j = (byte)ab.oc.nextInt(this.v.x.b.h);
               this.K = 100;
               this.D = this.L = m;
               this.N = 2;
               this.O = 3;
               if (this.x != null) {
                  this.b(this.x.k(), this.x);
                  this.y = null;
               }

               this.T = true;
               if (!var7) {
                  break label167;
               }
            }

            this.v = new u(fb.Fc, (byte)ab.oc.nextInt(fb.Fc.h), (byte)-1, (byte)-1, var1, var6, 1000, 0, 100, false, true, false);
            this.v.R = u.u;
            this.v.M = true;
            this.K = 100;
            this.D = this.L = 100;
            this.N = 5;
            this.O = 4;
            this.R = true;
            if (!var7) {
               break label167;
            }
         }

         this.w = new nb(fb.Pc);
         this.O = 6;
         this.N = 2;
         if (var4 == null) {
            this.B = true;
         }

         this.E = false;
         this.C = true;
         this.S = true;
      }

      if (this.v != null && this.T && this.o == -5) {
         this.P = this.v.D;
         this.v.D = false;
      }

      if (this.S) {
         a(var2, var3, false);
      }

      if (fb.Ud != null) {
         fb.Ud.addElement(this);
      }
   }

   public static hb b(byte var0, byte var1, byte var2, q var3, byte[] var4) {
      return new hb(var0, var1, var2, var3, var4);
   }

   private static void a(byte var0, byte var1, boolean var2) {
      if (Q != null && o.b(var0, var1) && Q[var0][var1] == var2) {
         Q[var0][var1] = !var2;
      }
   }

   public static boolean b(byte var0) {
      return var0 == 0 || var0 == 12 || var0 == 1;
   }

   public static boolean c(byte var0) {
      return var0 == 10 || var0 == 11 || var0 == -1 || var0 == -3 || var0 == 13;
   }

   public static boolean d(byte var0) {
      return var0 == 2 || var0 == 9 || var0 == 5 || var0 == 3 || var0 == 7 || var0 == 4 || var0 == 6 || var0 == 8 || var0 == -4 || var0 == -5;
   }

   public static boolean e(byte var0) {
      return var0 == 7 || var0 == 8;
   }

   public static boolean f(byte var0) {
      return var0 == 0 || var0 == 5 || var0 == 12 || var0 == 7 || var0 == 1 || var0 == 6 || var0 == 8;
   }

   public final boolean b() {
      return this.u && (this.o == 7 || this.o == 8 || this.o == -6);
   }

   public static hb[] b(int var0, int var1) {
      boolean var6 = ab.xc;
      int var4 = 0;
      int var5 = 0;

      while (var5 < fb.Ud.size()) {
         hb var3;
         if ((var3 = (hb)fb.Ud.elementAt(var5)) != null && var3.q == var0 && var3.r == var1) {
            var4++;
         }

         var5++;
         if (var6) {
            break;
         }
      }

      hb[] var2 = new hb[var4];
      var4 = 0;
      var5 = 0;

      while (var5 < fb.Ud.size()) {
         hb var7;
         if ((var7 = (hb)fb.Ud.elementAt(var5)) != null && var7.q == var0 && var7.r == var1) {
            var2[var4++] = var7;
         }

         var5++;
         if (var6) {
            break;
         }
      }

      return var2;
   }

   public static hb[] c(int var0, int var1) {
      boolean var5 = ab.xc;
      hb[] var6;
      if ((var6 = b(var0, var1)) == null) {
         return null;
      }

      hb[] var2 = null;
      byte var3 = 0;

      while (var3 < 2) {
         var1 = 0;
         byte var4 = 0;

         byte var10000;
         while (true) {
            if (var4 < var6.length) {
               var10000 = var6[var4].S;
               if (var5) {
                  break;
               }

               label43:
               if (var6[var4].S && var6[var4].C) {
                  if (var3 == 0) {
                     var1++;
                     if (!var5) {
                        break label43;
                     }
                  }

                  var2[var1++] = var6[var4];
               }

               var4++;
               if (!var5) {
                  continue;
               }
            }

            var10000 = var3;
            break;
         }

         if (var10000 == 0) {
            if (var1 == 0) {
               return null;
            }

            var2 = new hb[var1];
         }

         var3++;
         if (var5) {
            break;
         }
      }

      return var2;
   }

   public static boolean b(byte var0, byte var1) {
      boolean var2 = ab.xc;
      hb[] var3;
      if ((var3 = b((int)var0, (int)var1)) != null) {
         var1 = 0;

         while (var1 < var3.length) {
            if (var2) {
               return var3[var1].R;
            }

            if (var3[var1].R && !var3[var1].E) {
               return true;
            }

            var1++;
            if (var2) {
               break;
            }
         }
      }

      return false;
   }

   public static boolean c(byte var0, byte var1) {
      boolean var2 = ab.xc;
      hb[] var3;
      if ((var3 = b((int)var0, (int)var1)) != null) {
         var1 = 0;

         while (var1 < var3.length) {
            if (var2) {
               return var3[var1].S;
            }

            if (var3[var1].S) {
               return true;
            }

            var1++;
            if (var2) {
               break;
            }
         }
      }

      return false;
   }

   public final void b(byte var1, q var2) {
      boolean var6 = ab.xc;
      if (!this.E) {
         if (b(this.o) && var2 != null && this.x != var2) {
            boolean var3 = false;
            if (var2.Cc != null && (var2.r == 3 && var2.Cc.k <= 1 || var2.r == 9)) {
               this.N = 1;
               this.M /= 3;
               var3 = true;
            }

            if (var3) {
               this.b(this.q, this.r, false, true);
               return;
            }
         }

         byte var8 = 0;
         if (this.o == -4) {
            var8 = 20;
         }

         if (this.o == -5) {
            var8 = 30;
         }

         if (this.o == -6) {
            var8 = 60;
         }

         if (this.o == 0) {
            var8 = 0;
         }

         if (this.o == 3 || this.o == 4) {
            var8 = 30;
         }

         if (this.o == 2) {
            var8 = 30;
         }

         if (this.o == 5 || this.o == 6) {
            var8 = 40;
         }

         if (this.o == 9) {
            var8 = 30;
         }

         if (this.o == 12) {
            var8 = 30;
         }

         if (this.o == 7 || this.o == 8) {
            var8 = 60;
         }

         if (this.o == 1) {
            var8 = 30;
         }

         if (this.v.N) {
            var8 = 0;
         }

         int var4 = 0;
         int var5 = 0;
         switch (var1) {
            case 0:
               var5 = this.K;
               if (!var6) {
                  break;
               }
            case 1:
               var4 = -this.K;
               if (!var6) {
                  break;
               }
            case 2:
               var5 = -this.K;
               if (!var6) {
                  break;
               }
            case 3:
               var4 = this.K;
         }

         if (this.o == -6) {
            var5 = 0;
            var4 = 0;
         }

         this.v.b(var4, var5, var8);
         this.y = var2;
         if (this.o == 0 || this.o == 3 || this.o == 1 || this.o == 4) {
            label82: {
               var7 = false;
               if (this.v.m > 1) {
                  var7 = true;
                  if (!var6) {
                     break label82;
                  }
               }

               if (this.v.l < 0) {
                  var7 = true;
               }
            }

            this.v.x.b(null, (byte)0, (byte)2, (byte)-1, (byte)this.v.x.b.h, true, var7, (byte)10);
         }

         if (this.o == 2 || this.o == 9 || this.o == 12) {
            this.v.x.b(true, false, (byte)1);
         }

         this.E = true;
      }
   }

   public final void b(byte var1, byte var2, boolean var3) {
      this.b(var1, var2, var3, false);
   }

   private void b(byte var1, byte var2, boolean var3, boolean var4) {
      boolean var6 = ab.xc;
      if (this.S && !var3) {
         if (fb.M && this.z != null) {
            if (fb.I.d(this.z.w)) {
               return;
            }

            this.z.b(false, var1, var2, true, false);
         }

         if (!fb.M && !fb.i()) {
            if (fb.Pd == this.z) {
               this.z.b(false, var1, var2, true, false);
            }

            return;
         }
      }

      if (this.z != null) {
         if (this.o == -1 || this.o == -2) {
            if (fb.M || fb.i()) {
               this.z.b(0, 0, 0, false, false);
            }

            return;
         }

         if (this.o == -3) {
            if ((fb.M || fb.i()) && !this.z.Nb) {
               this.z.b(0, 0, 0, false, false);
            }

            return;
         }

         if (this.o == 11) {
            if (!this.C) {
               return;
            }

            if (this.z.Kb) {
               return;
            }

            if (this.z.r == 2) {
               this.D = 0;
            }

            label251: {
               if (this.z.Lb) {
                  this.M = this.z.nc;
                  this.D = 0;
                  if (!var6) {
                     break label251;
                  }
               }

               this.u = true;
               this.w.e = false;
               this.w.b(j, false, false, (byte)0);
            }

            if (!fb.i() && !y.b(this.z, this.x)) {
               this.M /= 2;
            }

            this.D--;
            if (this.D <= 0) {
               this.f();
            }

            this.C = false;
            this.E = true;
            if (o.c(var1, var2)) {
               ab.G.b(ab.W, 0);
               if (var6) {
                  return;
               }
            }
         } else {
            if (this.o == 10) {
               if (fb.M || fb.i()) {
                  if (this.z.r == 2) {
                     return;
                  }

                  var3 = (byte)2;
                  var4 = (byte)-1;
                  if (this.x != null) {
                     var4 = this.x.w;
                  }

                  byte var5 = fb.b(this.q, this.r);
                  if (!fb.i() && !ab.n && !y.b(this.z, this.x)) {
                     var3 = (byte)0;
                  }

                  this.z.b(this.q, this.r, this.z.ub, (byte)this.M, false, false, false, var5, var4, (byte)2, var3);
               }

               this.f();
               return;
            }

            if (this.o == 13 && !fb.i() && !ab.n && !y.b(this.z, this.x)) {
               return;
            }
         }
      }

      if (!this.A) {
         this.A = true;
         if (this.o == 11) {
            this.A = false;
         }

         if ((this.o == 0 || this.o == 12 || this.o == 1) && this.E) {
            this.M = (this.M << 1) / 3;
            this.N = 3;
         }

         var3 = var1 * 30 + 15;
         var4 = var2 * 30 + 15;
         int var22 = 0;
         if (this.v != null) {
            u var12 = this.v;
            var3 = this.v.c / 10;
            u var13 = this.v;
            var4 = this.v.d / 10;
            var22 = this.v.O;
            if (this.o == 2) {
               var22 -= 5;
            }
         }

         p var9;
         if (this.M != 0 && (var9 = p.b(this.O, this.N, var3, var4, var22, this.M, this.x, this.y, this.o)) != null) {
            if (this.o == 2) {
               if (o.c(var1, var2)) {
                  ab.G.b(ab.W, 0);
               }

               var9.G = (byte)q.c(this.x, this.o);
               if (fb.i()) {
                  var9.G = (byte)(var9.G << 1);
               }
            }

            if (this.o == 9) {
               var9.b(m, this.y);
            }

            if (this.o == 13) {
               var9.x = (byte)(var9.y.h - 1);
            }
         }

         if (o.b(var1, var2)) {
            if (this.o == 0
               || this.o == 5
               || this.o == 3
               || this.o == 12
               || this.o == 7
               || this.o == -6
               || this.o == 1
               || this.o == 4
               || this.o == 6
               || this.o == 8) {
               if (o.c(var1, var2)) {
                  ab.G.b(ab.R, 0);
               }

               if (this.o != 12 && this.o != 7 && this.o != -6 && this.o != -5 && this.o != 8) {
                  if (fb.Eb != null) {
                     pb var23 = fb.Eb;
                     byte var25 = (byte)ab.oc.nextInt(fb.Eb.h);
                     u var16 = this.v;
                     int var28 = this.v.c / 10;
                     u var17 = this.v;
                     new d(var23, var25, var28, this.v.d / 10, ab.rc);
                  }
               } else if (fb.Hc != null) {
                  pb var10001 = fb.Hc;
                  byte var10002 = (byte)ab.oc.nextInt(fb.Hc.h);
                  u var14 = this.v;
                  int var10003 = this.v.c / 10;
                  u var15 = this.v;
                  new d(var10001, var10002, var10003, this.v.d / 10, ab.rc);
               }
            }

            if (this.o == 9 && this.y == null) {
               this.v.x.b();
               this.v.b(0, 0, 0);
               if (fb.Mc != null) {
                  u var18 = this.v;
                  int var26 = this.v.c / 10;
                  u var19 = this.v;
                  new r(null, var26, this.v.d / 10, 0, 0, 20, m, new t((byte)0, fb.Mc, 15, 0, 0, 0, 0));
               }

               pb var24 = fb.wc;
               byte var27 = (byte)ab.oc.nextInt(fb.wc.h);
               u var20 = this.v;
               int var29 = this.v.c / 10;
               u var21 = this.v;
               new d(var24, var27, var29, this.v.d / 10, this.L);
            }
         }

         if (this.o != 11) {
            if (this.o == 6 && this.D != 0) {
               this.D = 0;
            } else {
               this.f();
            }
         } else {
            if (this.z == fb.Pd) {
               fb.b(20, 10);
            }
         }
      }
   }

   private void b(q var1) {
      if (var1 != null) {
         if (fb.M || fb.i()) {
            var1.b(this.M, -1, this.o, false);
         }

         if (this.o == -4 && fb.kd != null) {
            u var2 = this.v;
            int var10002 = this.v.c / 10;
            var2 = this.v;
            new w(fb.kd, var10002, this.v.d / 10 - 10, (byte)2, false, 1);
         }
      }

      if (var1 == null && this.o == -4 && fb.jd != null) {
         pb var10001 = fb.jd;
         byte var6 = (byte)ab.oc.nextInt(fb.jd.h);
         u var4 = this.v;
         int var10003 = this.v.c / 10;
         var4 = this.v;
         new d(var10001, var6, var10003, this.v.d / 10, ab.qc);
      }

      this.f();
   }

   private void b(byte var1, int var2, int var3) {
      if (fb.kb % 2L == 0L) {
         this.z = q.b(var2, var3, null, -1, -1);
      }
   }

   public final void c() {
      label631: {
         boolean var9 = ab.xc;
         if (b(this.o)) {
            hb var1 = this;
            this.v.h();
            u var4 = var1.v;
            int var2 = var1.v.c / 10;
            var4 = var1.v;
            int var3 = var1.v.d / 10;
            var1.q = var1.v.g;
            var1.r = var1.v.h;
            if (!var1.B) {
               if (var1.F && var1.x != null && var1.x.Ib <= 5 && var1.x.Hb <= 0) {
                  var1.F = false;
                  var1.b(var1.x.k(), var1.x);
               }

               if (var1.x != null) {
                  q var23 = var1.x;
                  int var10000 = var1.x.c / 10;
                  q var24 = var1.x;
                  if (o.b(var10000, var1.x.d / 10, var2, var3) >= n && (var1.x.g != var1.v.g || var1.x.h != var1.v.h)) {
                     var1.B = true;
                  }
               }
            }

            if (var1.B) {
               var1.b((byte)-1, var2, var3);
               label611:
               if (!var1.C && var1.z != null && (var1.o == 0 || var1.o == 12 || var1.o == 1)) {
                  if (!var1.E) {
                     q var25 = var1.z;
                     int var46 = var1.z.c / 10;
                     q var26 = var1.z;
                     if (o.b(var46, var1.z.d / 10, var2, var3) >= n) {
                        break label611;
                     }

                     var1.b(var1.z.k(), var1.z);
                     if (!var9) {
                        break label631;
                     }
                  }

                  q var27 = var1.z;
                  int var47 = var1.z.c / 10;
                  q var28 = var1.z;
                  if (o.b(var47, var1.z.d / 10, var2, var3) > n) {
                     var1.C = true;
                  }
               }

               if (var1.C && var1.z != null) {
                  q var29 = var1.z;
                  int var48 = var1.z.c / 10;
                  q var30 = var1.z;
                  if (o.b(var48, var1.z.d / 10, var2, var3) < n) {
                     var1.b(var1.z.g, var1.z.h, false);
                  }
               }

               if (var1.o == 12 && var1.v != null && var1.v.G) {
                  var1.v.x.b();
                  var1.E = false;
                  var1.C = false;
               }

               var1.e();
               if (var1.D != -1) {
                  var1.D--;
                  if (var1.D <= 0) {
                     var1.b(var1.q, var1.r, false);
                  }
               }
            }

            if (!var9) {
               break label631;
            }
         }

         if (c(this.o)) {
            hb var10 = this;
            if (this.w != null) {
               var10.w.c();
            }

            if (!var10.B) {
               if (var10.F && var10.x != null && var10.x.Ib <= 5 && var10.x.Hb <= 0) {
                  var10.F = false;
                  var10.z = var10.x;
                  var10.b(var10.q, var10.r, false);
                  if (!var9) {
                     break label631;
                  }
               }

               if (var10.x != null && (var10.x.g != var10.q || var10.x.h != var10.r)) {
                  var10.B = true;
               }
            }

            if (var10.B) {
               q[] var13;
               if ((var13 = q.b(var10.q, var10.r, 2, null)) != null) {
                  var10.z = var13[0];
               }

               if (var10.z != null) {
                  if (var10.o == -1) {
                     q var31 = var10.z;
                     int var49 = var10.z.c / 10;
                     var31 = var10.z;
                     if (o.b(var49, var10.z.d / 10, var10.q * 30 + 15, var10.r * 30 + 15) < n) {
                        var10.b(var10.q, var10.r, false);
                        if (!var9) {
                           break label631;
                        }
                     }
                  }

                  if (var10.z.g == var10.q && var10.z.h == var10.r) {
                     var10.b(var10.q, var10.r, false);
                     if (!var9) {
                        break label631;
                     }
                  }
               }

               if (var10.o == 11 && var10.E && q.b(var10.q, var10.r, 2, null) == null) {
                  if (var10.w.j >= 10) {
                     var10.u = false;
                     var10.w.e = false;
                     var10.w.b(k, false, false, (byte)0);
                  }

                  var10.E = false;
                  var10.C = true;
               }
            }

            label570:
            if (var10.o == 11) {
               if (fb.Pd != null) {
                  label575: {
                     var10.u = false;
                     int var14 = var10.q * 30 + 15;
                     int var19 = var10.r * 30 + 15;
                     q var33 = fb.Pd;
                     int var50 = fb.Pd.c / 10;
                     var33 = fb.Pd;
                     if (o.b(var50, fb.Pd.d / 10, var14, var19) < i) {
                        if (var10.w.j != 0) {
                           break label575;
                        }

                        var10.w.b((byte)4, (byte)1);
                        if (!var9) {
                           break label570;
                        }
                     }

                     if (var10.w.j != 0) {
                        var10.w.b((byte)0, (byte)1);
                     }
                  }

                  if (!var9) {
                     break label631;
                  }
               }

               if (var10.w.j != 0) {
                  var10.w.b((byte)0, (byte)1);
               }
            }

            if (!var9) {
               break label631;
            }
         }

         if (d(this.o)) {
            hb var11 = this;
            this.v.h();
            u var35 = var11.v;
            int var15 = var11.v.c / 10;
            var35 = var11.v;
            int var20 = var11.v.d / 10;
            var11.q = var11.v.g;
            var11.r = var11.v.h;
            var11.u = var11.v.w;
            if (var11.o == -5 && (var11.q != var11.s || var11.r != var11.t)) {
               var11.v.D = var11.P;
            }

            if (!var11.C) {
               if (var11.x != null) {
                  q var37 = var11.x;
                  int var51 = var11.x.c / 10;
                  q var38 = var11.x;
                  if (o.b(var51, var11.x.d / 10, var15, var20) >= n && (var11.x.g != var11.q || var11.x.h != var11.r)) {
                     var11.C = true;
                  }
               } else {
                  var11.C = true;
               }
            }

            if (var11.C && var11.o != 7 && var11.o != 8) {
               var11.b((byte)-1, var15, var20);
               if (var11.z != null) {
                  q var39 = var11.z;
                  int var52 = var11.z.c / 10;
                  q var40 = var11.z;
                  int var10001 = var11.z.d / 10;
                  var35 = var11.v;
                  int var10002 = var11.v.c / 10;
                  var35 = var11.v;
                  label518:
                  if (o.b(var52, var10001, var10002, var11.v.d / 10) < n) {
                     if (var11.o == 9 && var11.z != var11.x) {
                        var11.y = var11.z;
                     }

                     if (var11.J) {
                        var11.b(var11.z);
                        if (!var9) {
                           break label518;
                        }
                     }

                     if (var11.o == 6) {
                        if (var11.s == var11.z.g && var11.t == var11.z.h) {
                           break label518;
                        }

                        if (var11.L > 0) {
                           var11.L--;
                           var11.D = 1;
                           var11.s = var11.z.g;
                           var11.t = var11.z.h;
                           var11.b(var11.z.g, var11.z.h, false);
                           var11.A = false;
                           if (!var9) {
                              break label518;
                           }
                        }

                        var11.b(var11.z.g, var11.z.h, false);
                        if (!var9) {
                           break label518;
                        }
                     }

                     var11.b(var11.z.g, var11.z.h, false);
                  }
               }
            }

            if (var11.o != 5 && var11.o != 6 && var11.o != 4 && (var11.C || var11.o != -5) && var11.E && (var11.v.E != 0 || var11.v.G)) {
               label497: {
                  if (var11.J) {
                     var11.b((q)null);
                     if (!var9) {
                        break label497;
                     }
                  }

                  var11.b(var11.q, var11.r, false);
               }

               var11.v.E = 0;
               var11.v.G = false;
            }

            label469:
            if (var11.o == 4) {
               if (var11.B) {
                  if (!var11.C) {
                     break label469;
                  }

                  label476: {
                     if (var11.v.E != 0) {
                        if (var11.H == 0) {
                           var11.B = false;
                           var11.H = 1;
                           if (!var9) {
                              break label476;
                           }
                        }

                        var11.b(var11.q, var11.r, false);
                        if (!var9) {
                           break label476;
                        }
                     }

                     if (var11.v.G && var11.H != 2) {
                        var11.b(var11.q, var11.r, false);
                        var11.v.G = false;
                     }
                  }

                  if (var11.H != 2) {
                     break label469;
                  }

                  var11.H = 0;
                  var11.v.G = false;
                  if (!var9) {
                     break label469;
                  }
               }

               label463:
               if (var11.v.G) {
                  var11.v.G = false;
                  q var16;
                  if ((var16 = y.b(var11.v.g, var11.v.h, false, 5, var11.x)) != null) {
                     var11.E = false;
                     var11.v.K = 0;
                     var11.b(y.b(var11.v.g, var11.v.h, var16.g, var16.h), var11.x);
                     var11.B = true;
                     var11.H = 2;
                     if (!var9) {
                        break label463;
                     }
                  }

                  var11.b(var11.q, var11.r, false);
               }
            }

            if (var11.o == 3 || var11.o == 4) {
               var11.e();
            }

            if ((var11.o == 5 || var11.o == 6) && var11.E) {
               if ((var11.v.E != 0 || var11.v.G) && var11.x != null) {
                  var11.M += 30;
               }

               if (var11.v.E != 0) {
                  if (var11.v.E == 1) {
                     var11.v.c = var11.v.c + var11.v.l / 3;
                  }

                  if (var11.v.E == 2) {
                     var11.v.d = var11.v.d + var11.v.m / 3;
                  }

                  label651: {
                     var17 = false;
                     if (var11.G != null && var11.H < var11.G.length) {
                        var11.E = false;
                        var11.b(var11.G[var11.H], var11.x);
                        var11.H++;
                        var11.I = true;
                        if (!var9) {
                           break label651;
                        }
                     }

                     if (var11.x != null) {
                        var17 = true;
                     } else {
                        var11.E = false;
                        hb var21 = var11;
                        int var53;
                        if (var11.v == null) {
                           var53 = 0;
                        } else {
                           boolean var5;
                           int var6;
                           label653: {
                              var43 = false;
                              var5 = false;
                              if (Math.abs(var21.v.l) > Math.abs(var21.v.m)) {
                                 var6 = var21.v.l > 0 ? 3 : 1;
                                 if (!var9) {
                                    break label653;
                                 }
                              }

                              var6 = var21.v.m > 0 ? 0 : 2;
                           }

                           byte var7 = y.b(y.b((byte)var6), var21.v.H);
                           byte var8 = y.c(y.b((byte)var6), var21.v.I);
                           if (o.b(var7, var8) && fb.bf[var7][var8] != 0) {
                              var43 = true;
                           }

                           var7 = y.b(y.c((byte)var6), var21.v.H);
                           var8 = y.c(y.c((byte)var6), var21.v.I);
                           if (o.b(var7, var8) && fb.bf[var7][var8] != 0) {
                              var5 = true;
                           }

                           label422:
                           if (var43 && var5) {
                              if (ab.oc.nextInt(2) == 0) {
                                 var5 = false;
                                 if (!var9) {
                                    break label422;
                                 }
                              }

                              var43 = false;
                           }

                           label655: {
                              if (var43) {
                                 var6 = y.b((byte)var6);
                                 if (!var9) {
                                    break label655;
                                 }
                              }

                              if (var5) {
                                 var6 = y.c((byte)var6);
                                 if (!var9) {
                                    break label655;
                                 }
                              }

                              var6 = y.d((byte)var6);
                           }

                           var53 = var6;
                        }

                        var11.b((byte)var53, null);
                        var11.I = true;
                     }
                  }

                  if (!var11.C) {
                     var17 = true;
                  }

                  label401: {
                     if (var17) {
                        var11.b(var11.q, var11.r, false);
                        if (!var9) {
                           break label401;
                        }
                     }

                     if (o.c(var11.q, var11.r)) {
                        ab.G.b(ab.P, 0);
                     }
                  }

                  var11.v.E = 0;
               }

               if (var11.v.G) {
                  var11.v.Q = 35;
                  var11.v.G = false;
                  if (!var11.v.x.e) {
                     label395: {
                        var18 = false;
                        if (var11.v.m > 1) {
                           var18 = true;
                           if (!var9) {
                              break label395;
                           }
                        }

                        if (var11.v.l < 0) {
                           var18 = true;
                        }
                     }

                     var11.v.x.b(l, true, var18, (byte)0);
                  }
               }
            }

            label374:
            if (var11.o == 8 && var11.G != null) {
               if (var11.z == null) {
                  var11.z = q.d(var11.G[1]);
                  if (!var9) {
                     break label374;
                  }
               }

               label371:
               if (var11.v != null) {
                  label379: {
                     if (var11.v.c > var11.z.c) {
                        var11.v.c -= 20;
                        if (!var9) {
                           break label379;
                        }
                     }

                     if (var11.v.c > var11.z.c) {
                        var11.v.c += 20;
                     }
                  }

                  if (var11.v.d > var11.z.d) {
                     var11.v.d -= 20;
                     if (!var9) {
                        break label371;
                     }
                  }

                  if (var11.v.d > var11.z.d) {
                     var11.v.d += 20;
                  }
               }
            }

            if (var11.o == 9 && var11.E) {
               if (var11.A && var11.D > 0) {
                  var11.D--;
                  if (var11.D <= 0) {
                     var11.D = -1;
                     var11.f();
                  }
               }

               if (var11.v.E != 0) {
                  if (var11.v.E == 1) {
                     var11.v.c = var11.v.c + var11.v.l / 3;
                  }

                  if (var11.v.E == 2) {
                     var11.v.d = var11.v.d + var11.v.m / 3;
                  }

                  var11.v.b(0, 0, 0);
                  var11.v.E = 0;
               }

               if (var11.v.G) {
                  var11.b(var11.q, var11.r, false);
                  var11.v.G = false;
               }
            }

            label363:
            if (var11.I && var11.v != null) {
               if (Math.abs(var11.v.m) > Math.abs(var11.v.l)) {
                  if (var11.v.c / 10 > var11.v.g * 30 + 15) {
                     var11.v.c -= 5;
                     if (!var9) {
                        break label631;
                     }
                  }

                  if (var11.v.c / 10 >= var11.v.g * 30 + 15) {
                     break label363;
                  }

                  var11.v.c += 5;
                  if (!var9) {
                     break label631;
                  }
               }

               if (var11.v.d / 10 > var11.v.h * 30 + 15) {
                  var11.v.d -= 5;
                  if (!var9) {
                     break label631;
                  }
               }

               if (var11.v.d / 10 < var11.v.h * 30 + 15) {
                  var11.v.d += 5;
               }
            }

            if (!var9) {
               break label631;
            }
         }

         hb var12 = this;
         if (this.v != null) {
            var12.v.h();
         }

         label345:
         if (var12.o == -6 && var12.v != null && var12.E) {
            if (!var12.C) {
               if (!var12.B) {
                  if (var12.v.Q > 10) {
                     break label345;
                  }

                  var12.B = true;
                  var12.v.r = true;
                  if (fb.Kc == null) {
                     break label345;
                  }

                  var12.U = new r(var12.v, 0, 0, 0, 10, 3, -1, new t((byte)0, fb.Kc, 0, 0, 0, 0, 30));
                  if (!var9) {
                     break label345;
                  }
               }

               var12.v.Q += 10;
               var12.v.b(0, 0, var12.v.Q);
               if (var12.v.d()) {
                  break label345;
               }

               var12.v.r = false;
               if (var12.U != null) {
                  var12.U.z = true;
               }

               if (fb.Lc != null) {
                  var12.U = new r(var12.v, 0, 0, 0, -30, 2, -1, new t((byte)0, fb.Lc, 5, 0, 0, 0, -10));
               }

               var12.C = true;
               var12.v.x.j = 1;
               if (var12.z != null) {
                  var12.v.d(var12.z.g, var12.z.h);
               }

               var12.v.b(ab.E + 30);
               var12.v.b(0, 0, -20);
               if (!var9) {
                  break label345;
               }
            }

            if (var12.v.O <= 0) {
               if (var12.U != null) {
                  var12.U.z = true;
                  var12.U = null;
               }

               var12.b(var12.v.g, var12.v.h, false);
            }
         }
      }

      if (!o.b(this.q, this.r)) {
         this.f();
      }
   }

   private void e() {
      boolean var2 = ab.xc;
      if ((this.o == 0 || this.o == 3 || this.o == 1 || this.o == 4) && this.E) {
         label57:
         if (this.v.x.j > 1) {
            if (this.v.N) {
               if (!this.v.G) {
                  break label57;
               }

               this.v.G = false;
               this.v.x.p = (short)(this.v.x.p + 2);
               if (!var2) {
                  break label57;
               }
            }

            if (this.v.n > 0) {
               this.v.x.p = (byte)(4 / (this.v.n / 100 + 1));
               if (!var2) {
                  break label57;
               }
            }

            this.v.x.p = -1;
         }

         if (this.v.E != 0) {
            this.v.K = 2;
            if (this.v.l != 0) {
               this.v.l = Math.abs(this.v.l) / this.v.l * 10;
            }

            if (this.v.m != 0) {
               this.v.m = Math.abs(this.v.m) / this.v.m * 10;
            }

            this.v.N = true;
            if (Math.abs(this.v.Q) < 20) {
               this.v.Q = 30;
            }

            this.v.x.p = 1;
            this.C = true;
            this.v.E = 0;
         }
      }

      if (this.o == 12 && this.E && this.v.x.e && (this.v.G || this.v.E != 0)) {
         this.v.x.p = 1;
         this.v.x.b();
         if (fb.Kc != null) {
            u var1 = this.v;
            int var10004 = this.v.c / 10 - 2;
            var1 = this.v;
            new t((byte)1, fb.Kc, 3, var10004, this.v.d / 10 - this.v.O + 10, -3, 0);
            var1 = this.v;
            var10004 = this.v.c / 10 + 2;
            var1 = this.v;
            new t((byte)1, fb.Kc, 3, var10004, this.v.d / 10 - this.v.O + 13, 5, 2);
         }
      }
   }

   public final void b(Graphics var1) {
      if (this.v != null) {
         this.v.b(var1);
         if (this.o == 12) {
            u var2 = this.v;
            int var10001 = this.v.c / 10 + 1 - fb.Ge - fb.Ic.d / 2;
            var2 = this.v;
            fb.Ic.b(var10001, this.v.d / 10 - 15 - fb.He - fb.Ic.e / 2 - this.v.O);
            if (fb.Vb != null) {
               pb var5 = fb.Vb;
               int var3 = fb.Vb.d;
               var2 = this.v;
               var10001 = this.v.c / 10 + 1 - fb.Ge - var3 / 2;
               var2 = this.v;
               fb.Vb.b(var10001, this.v.d / 10 - 15 - fb.He - fb.Vb.e / 2 - this.v.O);
               fb.Vb.b(var1);
            }

            fb.Ic.b(var1);
         }
      }

      if (this.w != null) {
         byte var8 = 0;
         byte var9 = 0;
         if (this.o == 11) {
            var8 = 10;
            var9 = 5;
         }

         this.w.b(var1, this.q * 30 + 15 - fb.Ge + var8, this.r * 30 + 15 - fb.He + var9);
      }
   }

   public final void f() {
      if (this.S) {
         a(this.q, this.r, true);
      }

      this.p = true;
   }

   public static String b(int var0) {
      if (var0 == 0) {
         return "^10~";
      } else if (var0 == 11) {
         return "^11~";
      } else if (var0 == 2) {
         return "^12~";
      } else if (var0 == 5) {
         return "^13~";
      } else if (var0 == 10) {
         return "^14~";
      } else if (var0 == 9) {
         return "^15~";
      } else if (var0 == 3) {
         return "^21~";
      } else if (var0 == 12) {
         return "^32~";
      } else if (var0 == 7) {
         return "^34~";
      } else if (var0 == 1) {
         return "^36~";
      } else if (var0 == 6) {
         return "^37~";
      } else if (var0 == 4) {
         return "^38~";
      } else if (var0 == 8) {
         return "^30~";
      } else {
         return var0 == 13 ? "^35~" : "^9~";
      }
   }

   public static String c(int var0) {
      if (var0 == 2) {
         return "^28~";
      } else if (var0 == 1) {
         return "^29~";
      } else if (var0 == 0) {
         return "^22~";
      } else if (var0 == 4) {
         return "^23~";
      } else if (var0 == 5) {
         return "^43~";
      } else {
         return var0 == 3 ? "^31~" : "";
      }
   }

   public static void g() {
      boolean var0 = ab.xc;
      b = new int[14];
      d = new int[14];
      c = new int[6];
      e = new int[6];
      b[0] = 5;
      b[11] = 5;
      b[2] = 5;
      b[5] = 5;
      b[10] = 5;
      b[9] = 5;
      b[3] = 5;
      b[12] = 5;
      b[7] = 5;
      b[13] = 5;
      b[1] = 5;
      b[6] = 5;
      b[4] = 5;
      b[8] = 5;
      d[0] = 10;
      d[1] = 20;
      d[12] = 10;
      d[3] = 15;
      d[4] = 25;
      d[2] = 20;
      d[5] = 30;
      d[6] = 45;
      d[7] = 30;
      d[8] = 45;
      d[9] = 40;
      d[11] = 30;
      d[13] = 25;
      d[10] = 15;
      c[2] = 1;
      c[1] = 1;
      c[0] = 1;
      c[4] = 1;
      c[5] = 1;
      c[3] = 1;
      e[2] = 50;
      e[1] = 30;
      e[0] = 15;
      e[4] = 30;
      e[5] = 30;
      e[3] = 25;
      g = new int[14];
      h = new int[6];
      g[0] = 50;
      g[11] = 3;
      g[2] = 20;
      g[5] = 15;
      g[10] = 3;
      g[9] = 2;
      g[3] = 20;
      g[12] = 0;
      g[7] = 10;
      g[13] = 2;
      g[1] = 0;
      g[6] = 0;
      g[4] = 0;
      g[8] = 0;
      h[2] = 0;
      h[1] = 1;
      h[0] = 5;
      h[4] = 0;
      h[3] = 0;
      if (o.q) {
         ab.xc = !var0;
      }
   }
}
