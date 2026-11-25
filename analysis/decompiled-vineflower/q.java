import javax.microedition.lcdui.Graphics;

public final class q extends o {
   public byte r;
   private static int t = 40;
   private static int u = 20;
   private static int v = 30;
   public byte w;
   public byte x;
   public String y;
   public String z;
   public int A;
   public int B;
   public int C;
   private int D;
   private int E;
   private static int F = 80;
   private static int G = 3;
   public static byte[] H = new byte[]{0, 3, 6, 9};
   public static byte[][] I = new byte[][]{{12, 13, 14, 15, 16}, {12, 13, 14, 15}, {0, 1, 2, 3, 4, 5}};
   public static byte[][] J = new byte[][]{{17, 18, 19, 20, 21}, {16, 17, 18, 19}, {0, 1, 2, 3, 4, 5}};
   public static byte[][] K = new byte[][]{{22, 23, 24, 25, 26}, {20, 21, 22, 23}, {0, 1, 2, 3, 4, 5}};
   public static byte[][] L = new byte[][]{{27, 28, 29, 30, 31}, {24, 25, 26, 27}, {0, 1, 2, 3, 4, 5}};
   private byte M;
   private byte N;
   private byte O;
   private static byte[] P = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8};
   private static byte[] Q = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
   private static byte[] R = new byte[]{8, 7, 6, 5, 4, 3, 2, 1, 0};
   private byte S;
   private static byte T = 0;
   public boolean U;
   public boolean V;
   public static int W = 0;
   public int X;
   public boolean Y;
   private int Z;
   private byte ab;
   private int bb;
   private int cb;
   private boolean db;
   private boolean eb;
   public boolean fb;
   private int gb;
   private boolean hb;
   public boolean ib;
   private int jb;
   public boolean kb;
   private int lb;
   public byte mb;
   public byte nb;
   public byte ob;
   private long pb;
   public byte qb;
   private boolean rb;
   private byte sb;
   private byte tb;
   public byte ub;
   public int vb;
   private int wb;
   private int xb;
   private byte yb;
   private int zb;
   private byte Ab;
   public boolean Bb;
   private int Cb;
   private int Db;
   private boolean Eb;
   private byte Fb;
   public int Gb;
   public int Hb;
   public int Ib;
   private boolean Jb;
   public boolean Kb;
   public boolean Lb;
   private byte Mb;
   public boolean Nb;
   private int Ob;
   public byte Pb;
   private boolean Qb;
   private byte Rb;
   private byte Sb;
   public boolean Tb;
   private byte Ub;
   private long Vb;
   public boolean Wb;
   private int Xb;
   public int[] Yb;
   private long[] Zb;
   public int[] ac;
   public int bc;
   public int cc;
   public int[] dc;
   private static int[] ec = new int[]{-1, -1, -1, -1, -1, -1};
   private byte fc;
   public boolean gc;
   public boolean hc;
   public long ic;
   public long jc;
   private long kc;
   public boolean lc;
   public int mc;
   public int nc;
   private boolean oc;
   private int pc;
   public byte qc;
   private int rc;
   private int sc;
   private int tc;
   private boolean uc;
   private boolean vc;
   private boolean wc;
   private boolean xc;
   private w yc;
   private w zc;
   private r Ac;
   public boolean Bc;
   public y Cc;
   public boolean Dc;
   public boolean Ec;
   public boolean Fc;
   public nb Gc;
   private nb Hc;
   private nb Ic;
   private nb Jc;
   private nb Kc;
   public l Lc;
   private l Mc;
   private int Nc;
   private int Oc;
   private boolean Pc;
   private boolean Qc;
   private long Rc;
   private byte[] Sc;
   private byte[] Tc;
   private byte[] Uc;
   public static byte[][] Vc;

   public q(byte var1, byte var2) {
      boolean var4 = ab.xc;
      super((byte)-1, (byte)-1, 0, 0);
      this.C = 0;
      this.M = 0;
      this.U = true;
      this.X = 0;
      this.ab = 5;
      this.Pb = 0;
      this.Qb = false;
      this.Xb = 0;
      this.bc = 0;
      this.cc = -1;
      this.fc = 0;
      this.kc = 125L;
      this.Bc = false;
      this.Sc = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
      this.Tc = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
      this.Uc = new byte[]{2, 2, 2, -1, -1, -1, -1, -1, -1};
      this.r = var1;
      this.x = var2;
      this.y = "";
      this.z = "";
      this.C = 0;
      if (Vc == null) {
         Vc = new byte[fb.Pe][fb.Qe];
      }

      switch (this.r) {
         case 0:
            this.Gc = new nb(fb.xb);
            this.Hc = new nb(fb.Wb);
            if (!var4) {
               break;
            }
         case 1:
         case 5:
         case 6:
         case 7:
         case 8:
            this.Gc = new nb(fb.fd);
            this.Hc = new nb(fb.dd);
            if (!var4) {
               break;
            }
         case 2:
            this.Gc = new nb(fb.yd);
            if (!var4) {
               break;
            }
         case 3:
            this.Gc = new nb(fb.ld);
            if (!var4) {
               break;
            }
         case 4:
            this.Gc = new nb(fb.md);
            if (!var4) {
               break;
            }
         case 9:
            this.Gc = new nb(fb.ud);
      }

      this.Dc = true;
      this.Ec = false;
      this.Fc = true;
      this.mb = -1;
      this.hc = true;
      this.ic = 0L;
      this.jc = 0L;
      q var5 = this;
      var2 = 1;

      q var10000;
      while (true) {
         label34:
         if (var2 < 127) {
            var10000 = d(var2);
            if (var4) {
               break;
            }

            if (var10000 == null) {
               fb.Qd.addElement(var5);
               var5.w = var2;
               if (!var4) {
                  break label34;
               }
            }

            var2++;
            if (!var4) {
               continue;
            }
         }

         this.Ic = new nb(fb.dc);
         this.Jc = new nb(fb.ec);
         this.Kc = new nb(fb.fc);
         var10000 = this;
         break;
      }

      if (var10000.o()) {
         this.Yb = new int[14];
         this.Zb = new long[14];
         this.ac = new int[11];
         this.dc = new int[6];
      }

      this.mc = this.v();
      this.nc = this.mc;
   }

   public final void a() {
      this.V = true;
   }

   public final void b(int[] var1, int[] var2, int[] var3, int var4) {
      boolean var5 = ab.xc;
      this.C = var4;
      var4 = 0;

      while (true) {
         if (var4 < 14) {
            this.Yb[var4] = var1[var4];
            var4++;
            if (var5) {
               break;
            }

            if (!var5) {
               continue;
            }
         }

         if (this == fb.Pd && fb.I != null && fb.Pd.bc != -1) {
            fb.I.c(hb.b(fb.Pd.bc) + fb.Pd.Yb[fb.Pd.bc]);
         }
         break;
      }

      var4 = 0;

      while (true) {
         if (var4 < 11) {
            this.ac[var4] = var2[var4];
            var4++;
            if (var5) {
               break;
            }

            if (!var5) {
               continue;
            }
         }

         var4 = 0;
         break;
      }

      while (true) {
         if (var4 < 6) {
            this.dc[var4] = var3[var4];
            var4++;
            if (var5) {
               break;
            }

            if (!var5) {
               continue;
            }
         }

         this.mc = this.v();
         break;
      }
   }

   public final void b(byte var1, byte var2, boolean var3) {
      boolean var10 = ab.xc;
      if (var1 >= 0 && var2 >= 0) {
         this.mb = (byte)(fb.df ? 0 : 1);
         this.O = 1;
         this.Rb = -1;
         this.rb = false;
         this.Kb = true;
         if (this == fb.Pd && fb.i()) {
            this.Ec = true;
         }

         if (var3) {
            this.b((byte)-1);
            if (this.fb && this.gb != -2) {
               this.e((byte)-1, false);
            }

            if (this.ib) {
               this.g((byte)-1, false);
            }

            if (this.Y) {
               this.b(0, 0, 0, false, false, false);
            }

            if (this.kb) {
               this.f((byte)-1, false);
            }

            boolean var6 = false;
            byte var5 = 0;
            this.b(var5, var6, true);
         }

         this.ub = 0;
         this.d(var1, (byte)var2);
         this.j();
         if (var3) {
            this.nc = this.mc;
            this.uc = false;
            this.Nc = super.c / 10;
            this.Oc = super.d / 10;
            this.Pc = false;
            this.b(false);
         }

         q var10000;
         label126: {
            if (this.r == 0) {
               this.N = 0;
               this.wb = t;
               this.M = 0;
               this.pc = 25;
               this.Hc.j = 0;
               if (!fb.df) {
                  var2 = 320;
                  q var11 = this;
                  this.Jb = true;
                  var11.Gb = 3200;
                  var11.Ib = 320;
               }

               if (fb.M || fb.i() && fb.Pd == this) {
                  this.jc = fb.kb;
               }
            } else if (this.p()) {
               this.N = 0;
               this.wb = t;
               this.M = 0;
               this.pc = 25;
               this.Hc.j = 0;
               q var15 = this;
               byte var4 = this.h;
               byte var14 = this.g;
               q var12 = this;
               q[] var16;
               if ((fb.M || fb.i()) && fb.bf != null && (var16 = b(var12.g, var12.h, 0, null)) != null && var16.length != 0) {
                  byte var7 = (byte)ab.oc.nextInt(4);
                  int var9 = 0;

                  while (var9 < var16.length) {
                     q var8;
                     var10000 = var8 = var16[var9];
                     if (var10) {
                        break label126;
                     }

                     label105:
                     if (var10000 != var15) {
                        var16[var9].b(var14, var4, var7, (byte)6, true, false, true, (byte)0, var12.w, (byte)3, (byte)1);
                        if (var16[var9].qb != 3) {
                           var16[var9].b(var14, var4, y.d(var7), (byte)6, true, false, true, (byte)0, var15.w, (byte)3, (byte)1);
                        }

                        if (var16[var9].qb == 3) {
                           var16[var9].Cb = 30;
                           if (!var10) {
                              break label105;
                           }
                        }

                        var16[var9].b(30, var12.w, -1, false);
                     }

                     var9++;
                     if (var10) {
                        break;
                     }
                  }
               }
            } else {
               label140: {
                  if (this.r == 2) {
                     this.N = 2;
                     this.wb = u;
                     this.M = 0;
                     this.pc = 50;
                     this.mb = 0;
                     this.hc = false;
                     this.e((byte)-2, false);
                     if (!var10) {
                        break label140;
                     }
                  }

                  if (this.r == 3) {
                     this.N = 2;
                     this.wb = v;
                     this.M = 1;
                     this.pc = 15;
                     this.mb = 0;
                     this.hc = false;
                     if (!var10) {
                        break label140;
                     }
                  }

                  if (this.r == 4) {
                     this.O = 2;
                     this.N = 2;
                     this.wb = 0;
                     this.M = 0;
                     this.pc = 25;
                     this.mb = 0;
                     this.hc = false;
                     if (!var10) {
                        break label140;
                     }
                  }

                  if (this.r == 9) {
                     this.O = 0;
                     this.N = 0;
                     this.wb = v;
                     this.M = 2;
                     this.pc = 15;
                     this.mb = 0;
                     this.hc = false;
                  }
               }
            }

            var10000 = this;
         }

         if (var10000.Cc != null && var3) {
            this.Ec = true;
            this.Cc.b();
         }
      }
   }

   public static void b(byte[] var0) {
      boolean var3 = ab.xc;
      int var2 = 0;

      while (var2 < var0.length / 3) {
         q var1;
         (var1 = new q((byte)0, var0[var2 * 3 + 2])).b(var0[var2 * 3], var0[var2 * 3 + 1], true);
         var1.B = var1.w;
         var2++;
         if (var3) {
            break;
         }
      }
   }

   public static byte[] b(int var0) {
      boolean var6 = ab.xc;
      byte[] var1 = new byte[var0 * 3];
      byte var2 = -1;
      int var5 = 0;

      while (var5 < var0) {
         label53: {
            if (ab.g()) {
               if (ab.fc == 0) {
                  var2 = (byte)(var5 % 2);
               }

               label48:
               if (ab.fc == 1) {
                  if (fb.I.e((byte)(var5 + 1))) {
                     var2 = var5 == 0 ? ab.ec : fb.I.O.b((byte)(var5 + 1));
                     if (!var6) {
                        break label48;
                     }
                  }

                  var2 = (byte)(var5 % 2);
               }

               if (ab.fc != 2) {
                  break label53;
               }

               if (fb.I.e((byte)(var5 + 1))) {
                  var2 = 0;
                  if (!var6) {
                     break label53;
                  }
               }

               var2 = 1;
               if (!var6) {
                  break label53;
               }
            }

            var2++;
         }

         q var3;
         label34: {
            byte[] var4;
            if ((var4 = b(var3 = new q((byte)0, var2))) != null) {
               var1[var5 * 3] = var4[0];
               var1[var5 * 3 + 1] = var4[1];
               if (!var6) {
                  break label34;
               }
            }

            var1[var5 * 3] = -1;
            var1[var5 * 3 + 1] = -1;
         }

         var1[var5 * 3 + 2] = var3.x;
         var3.B = var3.w;
         var5++;
         if (var6) {
            break;
         }
      }

      return var1;
   }

   public static byte[] b(q var0) {
      boolean var17 = ab.xc;
      int var10001 = ab.g();
      boolean var18 = true;
      byte var1 = (byte)var10001;
      var0 = var0;
      if (var0 != null) {
         boolean var5 = false;
         int var6 = 0;
         int var8 = 0;

         do {
            boolean var21;
            label85: {
               if (var8 >= 2) {
                  var21 = var5;
                  if (var17) {
                     break label85;
                  }

                  if (!var5) {
                     break;
                  }
               }

               var21 = var5;
            }

            if (var21) {
               var8 = 3;
            }

            int var3 = 0;
            int var4 = 0;
            int var2 = 0;

            label162: {
               label161:
               while (true) {
                  var21 = var2;
                  var10001 = fb.ae.size();

                  label159:
                  while (true) {
                     if (var21 >= var10001) {
                        break label161;
                     }

                     sb var7 = (sb)fb.ae.elementAt(var2);
                     var21 = var1;
                     if (var17) {
                        break label162;
                     }

                     if (var1 != 0 ? var7.o == var0.x && (!fb.i() || var0 != fb.Pd || var7.i) : var7.o != -1 || var0.x == -1) {
                        var4++;
                        if (b(var7.c, var7.d, 0, null) == null) {
                           if (var8 == 1 && ++var3 == var6) {
                              var0.b(var7.c, var7.d, true);
                              return new byte[]{var7.c, var7.d};
                           }
                        } else if (var5) {
                           label143: {
                              label187: {
                                 byte var10 = var7.d;
                                 byte var9 = var7.c;
                                 if ((fb.M || fb.i()) && fb.bf != null) {
                                    q[] var11;
                                    if ((var11 = b(var9, var10, 0, null)) == null) {
                                       break label187;
                                    }

                                    byte var12 = 0;
                                    byte var13 = 0;

                                    label134: {
                                       while (var13 < 4) {
                                          var24 = y.b((int)y.b(var13, var9), (int)y.c(var13, var10));
                                          if (var17) {
                                             break label134;
                                          }

                                          if (var24 != 0) {
                                             var12++;
                                          }

                                          var13++;
                                          if (var17) {
                                             break;
                                          }
                                       }

                                       var24 = var12;
                                    }

                                    if (var24 != 0) {
                                       byte var15 = 0;

                                       while (true) {
                                          if (var15 >= var11.length) {
                                             break label187;
                                          }

                                          var21 = var11[var15].mb;
                                          var10001 = 1;
                                          if (var17) {
                                             continue label159;
                                          }

                                          if (var11[var15].mb == 1) {
                                             break;
                                          }

                                          var13 = (byte)ab.oc.nextInt(var12);
                                          byte var14 = 0;
                                          byte var16 = 0;

                                          while (true) {
                                             label113:
                                             if (var16 < 4) {
                                                var25 = y.b((int)y.b(var16, var9), (int)y.c(var16, var10));
                                                if (var17) {
                                                   break;
                                                }

                                                if (var25 != 0) {
                                                   if (var14 == var13) {
                                                      var11[var15].b(var9, var10, var16, (byte)5, false, false, false, (byte)0, (byte)-1, (byte)0, (byte)0);
                                                      if (!var17) {
                                                         break label113;
                                                      }
                                                   }

                                                   var14++;
                                                }

                                                var16++;
                                                if (!var17) {
                                                   continue;
                                                }
                                             }

                                             var25 = (byte)(var15 + 1);
                                             break;
                                          }

                                          var15 = var25;
                                          if (var17) {
                                             break label187;
                                          }
                                       }
                                    }
                                 }

                                 var26 = false;
                                 break label143;
                              }

                              var26 = true;
                           }

                           if (var26) {
                              var0.b(var7.c, var7.d, true);
                              return new byte[]{var7.c, var7.d};
                           }

                           var0.ic = fb.kb + 50L;
                        }
                     }

                     var2++;
                     if (var17) {
                        break label161;
                     }
                     break;
                  }
               }

               var21 = var8;
            }

            label173: {
               if (var21 == 0) {
                  if (var3 == 0) {
                     if (var4 == 0) {
                        break label173;
                     }

                     var8 = 3;
                     var5 = true;
                     var6 = 0;
                     if (!var17) {
                        break label173;
                     }
                  }

                  var6 = 1 + ab.oc.nextInt(var3);
                  if (!var17) {
                     break label173;
                  }
               }

               if (var8 == 3) {
                  break;
               }
            }

            var8++;
         } while (!var17);
      }

      return null;
   }

   private void b() {
      boolean var3 = ab.xc;
      if (Vc != null) {
         byte var1 = 0;

         while (var1 < Vc.length) {
            byte var2 = 0;

            byte var10000;
            byte var10001;
            label30: {
               while (var2 < Vc[0].length) {
                  var10000 = Vc[var1][var2];
                  var10001 = this.w;
                  if (var3) {
                     break label30;
                  }

                  if (var10000 == this.w) {
                     Vc[var1][var2] = 0;
                  }

                  var2++;
                  if (var3) {
                     break;
                  }
               }

               var10000 = var1;
               var10001 = 1;
            }

            var1 = (byte)(var10000 + var10001);
            if (var3) {
               break;
            }
         }
      }
   }

   private void c() {
      if (Vc != null) {
         if (this.g == -1 && this.h == -1) {
            this.b();
            return;
         }

         byte var1 = y.b(this.ub, this.g);
         byte var2 = y.c(this.ub, this.h);
         this.b();
         if (b(var1, var2) && Vc[var1][var2] == 0) {
            Vc[var1][var2] = this.w;
         }
      }
   }

   public final void b(int var1, int var2, int var3, boolean var4) {
      if (!fb.M && !fb.i() || (!fb.M || this.r != 0) && (!fb.i() || this != fb.Pd) || fb.kb - this.jc > this.kc) {
         if (this.r == 4 && var3 == 12) {
            var1 <<= 1;
         }

         if ((this.fb || this.kb) && var1 > 1) {
            var1 /= 2;
         }

         if (var1 > 0) {
            this.b(this.nc - var1, var2, var3, true, false);
            this.xc = var4;
            if (this.Cc != null) {
               this.Cc.g();
            }
         }
      }
   }

   public final void b(int var1, int var2, int var3, boolean var4, boolean var5) {
      this.rc = var1;
      this.sc = var2;
      this.tc = var3;
      this.vc = var4;
      this.wc = var5;
      this.xc = false;
      this.uc = true;
   }

   public final void b(byte var1, byte var2, boolean var3, boolean var4) {
      boolean var11 = ab.xc;
      if (this.n()) {
         this.nc = 0;
         this.rc = 0;
         this.uc = false;
         this.b(true);
         if ((fb.i() || fb.M) && fb.M) {
            fb.I.b(this.w, super.c / 10, super.d / 10, (byte)var1, (byte)var2, var3, var4);
            if (this.Cc == null && var1 != -1 && var1 != this.w && fb.I.e((byte)var1)) {
               var1 = -1;
               var2 = 0;
               q var14 = this;
               int[] var18 = new int[2];
               int var5 = -1;
               int var6 = -1;
               int var7 = 0;
               byte var8 = 0;
               int var9 = 0;

               int var10000;
               label169: {
                  while (var9 < 2) {
                     var10000 = 0;
                     if (var11) {
                        break label169;
                     }

                     int var10 = 0;

                     while (true) {
                        label163:
                        if (var10 < var14.Yb.length) {
                           var10000 = var14.Yb[var10];
                           if (var11) {
                              break;
                           }

                           if (var10000 > 0 && var10 != 0) {
                              if (var9 == 1 && var8 == ++var7) {
                                 var5 = var10;
                                 var6 = var14.Yb[var10];
                                 if (!var11) {
                                    break label163;
                                 }
                              }
                           }

                           var10++;
                           if (!var11) {
                              continue;
                           }
                        }

                        var10000 = var9;
                        break;
                     }

                     if (var10000 == 0) {
                        if (var7 == 0) {
                           break;
                        }

                        var8 = 1;
                        var7 = 0;
                     }

                     var9++;
                     if (var11) {
                        break;
                     }
                  }

                  var9 = -1;
                  var10000 = var5;
               }

               if (var10000 != -1 && var6 != -1) {
                  if ((var9 = var6 / 2) * hb.d[var5] / hb.b[var5] > 100) {
                     var9 = 100 * hb.b[var5] / hb.d[var5];
                  }

                  if (var9 > var6) {
                     var9 = var6;
                  }

                  var14.b((byte)var5, var14.Yb[var5] - var9, false);
               }

               var18[0] = var5;
               var18[1] = var9;
               int[] var15 = var18;
               if (var18 != null) {
                  var1 = var15[0];
                  var2 = var15[1];
               }

               if (var1 != -1 && var2 > 0) {
                  s var16;
                  (var16 = new s((byte)16, this.g, this.h, false)).K = var1;
                  var16.L = var2;
                  fb.I.d((byte)16, this.g, this.h);
                  ab.b(var1, -var2);
               }
            }
         }

         this.hc = true;
         if (fb.Pd == this) {
            fb.I.e();
            if (fb.i()) {
               this.nb = this.g;
               this.ob = this.h;
            }
         }

         if (fb.Pd == this) {
            fb.b((o)null, fb.i());
         }

         this.Gc.b();
         this.S = 0;
         this.mb = -1;
         q var17 = this;
         if (this.S != -1) {
            if (var17.r == 0 && var17.S == 0) {
               new w(fb.yb, var17.c / 10, var17.d / 10, (byte)2, false, 2);
            }

            if (var17.p() && var17.S == 0) {
               new w(fb.gd, var17.c / 10, var17.d / 10, (byte)2, false, 2);
            }

            if (var17.r == 3 && fb.Tc != null) {
               new w(fb.Tc, var17.c / 10, var17.d / 10, (byte)2, false, 2);
            }

            if (var17.r == 4) {
               if (fb.Gc != null) {
                  new w(fb.Gc, var17.c / 10, var17.d / 10, (byte)2, false, 1);
               }

               if (fb.Jc != null) {
                  new w(fb.Jc, var17.c / 10, var17.d / 10 - 10, (byte)2, false, 2);
               }

               if (fb.nd != null) {
                  new d(fb.nd, (byte)ab.oc.nextInt(fb.nd.h), var17.c / 10, var17.d / 10, ab.rc);
               }

               if (fb.Lc != null) {
                  new r(null, var17.c / 10, var17.d / 10 - 10, 0, 0, 10, 50, new t((byte)0, fb.Lc, 5, 0, 0, 4, 0));
               }
            }

            if (var17.r == 9 && fb.td != null) {
               new w(fb.td, var17.c / 10, var17.d / 10, (byte)2, false, 2);
            }

            if (fb.zc != null) {
               new d(fb.zc, (byte)0, var17.c / 10, var17.d / 10, ab.sc);
            }

            if (ab.Jb) {
            }
         }

         this.g();
         this.ic = fb.kb;
         label135:
         if (o.c(this.g, this.h) && this.f()) {
            if (ab.oc.nextInt(2) == 0) {
               ab.G.b(ab.L, 0);
               if (!var11) {
                  break label135;
               }
            }

            ab.G.b(ab.M, 0);
         }

         if (fb.i() && this.lc) {
            if (this.x != 0 && this.r != 2) {
               W++;
            }

            this.V = true;
         } else {
            this.X++;
         }
      }
   }

   private boolean f() {
      return this.r != 4;
   }

   public final void g() {
      this.d((byte)-1, (byte)-1);
      this.b();
   }

   private void c(int var1) {
      boolean var2 = ab.xc;
      if (!ab.w) {
         this.Rc = fb.kb + var1;
         this.Pc = true;
         this.Ic.b((byte)0, (byte)1);
         this.Jc.b((byte)0, (byte)1);
         this.Kc.b((byte)0, (byte)1);
         byte var3 = 0;

         while (var3 < this.Sc.length) {
            label23: {
               if (this.Uc[var3] == 2) {
                  this.Tc[var3] = 7;
                  this.Sc[var3] = 0;
                  if (!var2) {
                     break label23;
                  }
               }

               if (this.Uc[var3] == 1) {
                  this.Tc[var3] = 15;
                  this.Sc[var3] = 8;
               }
            }

            var3++;
            if (var2) {
               break;
            }
         }
      }
   }

   private void b(boolean var1) {
      boolean var10 = ab.xc;
      if (ab.w) {
         var1 = 0;
      }

      int var2;
      if ((var2 = this.nc - this.mc) < 0) {
         var2 = 0;
      }

      int var3 = 30;
      int var4;
      if ((var4 = this.mc / 30) < 2) {
         var4 = 2;
         if ((var3 = this.mc / 2) == 0) {
            var3 = 1;
         }
      }

      byte[] var5 = null;
      if (var1) {
         var5 = new byte[this.Uc.length];
      }

      int var6 = this.nc / var3;
      boolean var7 = this.nc % var3 != 0;
      int var8 = var2 / 30;
      boolean var9 = var2 % var3 != 0;
      var3 = 0;

      boolean var10000;
      while (true) {
         if (var3 < this.Uc.length) {
            var10000 = (boolean)var1;
            if (var10) {
               break;
            }

            if (var1) {
               var5[var3] = this.Uc[var3];
            }

            label157: {
               if (var3 < var4) {
                  if (var6 > 0) {
                     this.Uc[var3] = 2;
                     var6--;
                     if (!var10) {
                        break label157;
                     }
                  }

                  if (var7) {
                     this.Uc[var3] = 1;
                     var7 = false;
                     if (!var10) {
                        break label157;
                     }
                  }

                  this.Uc[var3] = 0;
                  if (!var10) {
                     break label157;
                  }
               }

               if (var3 >= 6 && var2 > 0) {
                  if (var8 > 0) {
                     this.Uc[var3] = 2;
                     var8--;
                     if (!var10) {
                        break label157;
                     }
                  }

                  if (var9) {
                     this.Uc[var3] = 1;
                     var9 = false;
                     if (!var10) {
                        break label157;
                     }
                  }

                  this.Uc[var3] = 0;
                  if (!var10) {
                     break label157;
                  }
               }

               this.Uc[var3] = -1;
            }

            var3++;
            if (!var10) {
               continue;
            }
         }

         var10000 = (boolean)var1;
         break;
      }

      if (var10000 && var5 != null) {
         var3 = 0;

         while (var3 < var5.length) {
            var1 = (byte)(var5[var3] - this.Uc[var3]);
            if (var5[var3] == -1 && var5[var3] != this.Uc[var3]) {
               if (var1 == -2) {
                  var1 = -1;
               }

               if (var1 == -3) {
                  var1 = -2;
               }
            }

            if (this.Uc[var3] == -1 && var5[var3] != this.Uc[var3]) {
               if (var1 == 2) {
                  var1 = 1;
               }

               if (var1 == 3) {
                  var1 = 2;
               }
            }

            if (var1 == 2) {
               this.a(var3, false);
               this.Tc[var3] = -1;
               this.Sc[var3] = -1;
            }

            if (var1 == 1) {
               label111: {
                  this.a(var3, true);
                  if (this.Uc[var3] == 0) {
                     this.Tc[var3] = -1;
                     if (!var10) {
                        break label111;
                     }
                  }

                  this.Tc[var3] = 8;
               }

               this.Sc[var3] = -1;
            }

            label106:
            if (var1 == -1) {
               if (this.Uc[var3] == 2) {
                  var1 = -2;
                  if (!var10) {
                     break label106;
                  }
               }

               this.Tc[var3] = 15;
               this.Sc[var3] = 8;
            }

            if (var1 == -2) {
               this.Tc[var3] = 7;
               this.Sc[var3] = 0;
            }

            var3++;
            if (var10) {
               break;
            }
         }
      }
   }

   private void a(int var1, boolean var2) {
      boolean var5;
      boolean var6;
      int var10000;
      int var10001;
      label47: {
         byte var4;
         label51: {
            boolean var7 = ab.xc;
            var4 = 0;
            var5 = this.Uc[6] != -1;
            var6 = false;
            if (var1 >= 6) {
               var4 = 3;
               var1 -= 6;
               var6 = true;
               if (!var7) {
                  break label51;
               }
            }

            int var3 = 0;

            while (var3 < this.Uc.length) {
               var10000 = this.Uc[var3];
               var10001 = -1;
               if (var7) {
                  break label47;
               }

               if (var10000 != -1) {
                  var4++;
               }

               var3++;
               if (var7) {
                  break;
               }
            }
         }

         var10000 = this.Nc;
         var10001 = (var1 - var4 / 2) * 7;
      }

      int var9 = var10000 + var10001;
      w var8 = new w(fb.hc, var9, this.Oc + (var5 ? 5 * (var6 ? 1 : -1) : 0), (byte)0, true, 1);
      if (var2) {
         var8.h.j = 8;
      }
   }

   public final boolean b(byte var1, byte var2, byte var3) {
      boolean var4 = ab.xc;
      if (this.r == 4) {
         return false;
      }

      switch (var3) {
         case 0:
            var2++;
            if (!var4) {
               break;
            }
         case 1:
            var1--;
            if (!var4) {
               break;
            }
         case 2:
            var2--;
            if (!var4) {
               break;
            }
         case 3:
            var1++;
      }

      if (!this.Fc || var1 > 0 && var2 > 0 && var1 < fb.Pe - 1 && var2 < fb.Qe - 1) {
         if (this.Dc && fb.Re != null && fb.Re[var1][var2].d != null) {
            return false;
         }

         if (this.Ec && Vc != null && Vc[var1][var2] != 0 && Vc[var1][var2] != this.w) {
            if (this.r != 9) {
               if (!fb.i()) {
                  return false;
               }

               var3 = 0;

               boolean var10000;
               while (true) {
                  if (var3 < 4) {
                     this.nb = y.b(var3, this.g);
                     this.ob = y.c(var3, this.h);
                     var10000 = b(this.nb, this.ob);
                     if (var4) {
                        break;
                     }

                     if (var10000 && Vc[this.nb][this.ob] == 0 && !j.c(this.nb, this.ob)) {
                        return false;
                     }

                     var3++;
                     if (!var4) {
                        continue;
                     }
                  }

                  var10000 = true;
                  break;
               }

               return var10000;
            }

            q var5;
            if (this.Cc != null && (var5 = d(Vc[var1][var2])) != null && !this.Cc.b(var5)) {
               return false;
            }
         }

         q var6;
         return Vc == null || Vc[var1][var2] == 0 || Vc[var1][var2] == this.w || (var6 = d(Vc[var1][var2])) == null || var6.r != 4;
      } else {
         return false;
      }
   }

   public final boolean b(byte var1, boolean var2) {
      boolean var4 = ab.xc;
      if (this.hc) {
         return false;
      }

      if (var1 < 0 || var1 > 3) {
         return false;
      }

      if (this.qb != 0) {
         return false;
      }

      boolean var3;
      label58: {
         var3 = false;
         if (var2) {
            this.vb = this.wb;
            if (!var4) {
               break label58;
            }
         }

         this.vb = 0;
      }

      if (var1 != this.ub) {
         this.a(var1);
         this.ub = var1;
         if (!var2) {
            this.qb = 1;
            return true;
         }

         var3 = true;
      }

      if (this.b(this.g, this.h, this.ub)) {
         this.D = this.g + ab.gb[var1];
         this.E = this.h + ab.hb[var1];
         if (!var2) {
            this.rb = false;
         }

         label49: {
            this.qb = 2;
            if (!var2) {
               this.Nb = true;
               if (!var4) {
                  break label49;
               }
            }

            this.Nb = false;
         }

         this.c();
         if (fb.Pd == this && s.B != null) {
            var1 = y.b(this.ub, this.g);
            var2 = y.c(this.ub, this.h);
            if (b(var1, var2) && s.B[var1][var2] == 1 && s.b(var1, var2) != null && this.b(false, var1, var2, false, true)) {
               return false;
            }
         }

         return true;
      } else {
         return var3;
      }
   }

   private void a(byte var1) {
      if (this.ub != var1 && this.r != 9) {
         byte var2 = (byte)(4 * G);
         boolean var3 = Math.abs(var1 - this.ub) / (var1 - this.ub) == -1;
         if ((var1 = (byte)(Math.abs(var1 - this.ub) * G)) == G * 3) {
            var1 = (byte)G;
            var3 = !var3;
         }

         this.Gc.b(null, this.Gc.j, (byte)0, (byte)(var2 - 1), var1, false, var3, this.O);
      }
   }

   public final void i() {
      this.rb = true;
   }

   public final void j() {
      boolean var1 = ab.xc;
      this.xb = 0;
      this.d(this.g, this.h);
      if (this.qb == 3) {
         this.wb = this.zb;
         if (!this.Tb) {
            this.hc = false;
         }

         if (fb.M || fb.i()) {
            this.gc = false;
            if (this.Cb != 0) {
               this.b(this.Cb, this.Db, -1, false);
               this.Cb = 0;
            }
         }
      }

      this.vb = this.l = this.m = 0;
      this.qb = 0;
      this.Gc.b();
      switch (this.ub) {
         case 0:
            this.Gc.j = 0;
            if (!var1) {
               break;
            }
         case 1:
            this.Gc.j = 3;
            if (!var1) {
               break;
            }
         case 2:
            this.Gc.j = 6;
            if (!var1) {
               break;
            }
         case 3:
            this.Gc.j = 9;
      }

      this.rb = false;
   }

   public final void d(byte var1, byte var2) {
      this.D = var1;
      this.E = var2;
      if (Vc != null) {
         this.b();
         if (b(var1, var2) && Vc[var1][var2] == 0) {
            Vc[var1][var2] = this.w;
         }
      }

      super.d(var1, var2);
   }

   public final void c(byte var1, boolean var2) {
      this.ub = var1;
      if (var2 && this.n() && this.Gc != null) {
         this.Gc.j = H[var1];
      }
   }

   public final byte k() {
      return this.qb == 3 ? this.yb : this.ub;
   }

   public final byte l() {
      if (this.Gc.j < 3) {
         return 0;
      } else if (this.Gc.j < 6) {
         return 1;
      } else if (this.Gc.j < 9) {
         return 2;
      } else if (this.Gc.j < 12) {
         return 3;
      } else if (this.Gc.j < 17) {
         return 0;
      } else if (this.Gc.j < 22) {
         return 1;
      } else if (this.Gc.j < 27) {
         return 2;
      } else {
         return (byte)(this.Gc.j < 32 ? 3 : 0);
      }
   }

   public static q b(int var0, int var1, q var2, int var3, int var4) {
      boolean var7 = ab.xc;
      var2 = null;
      if (fb.Qd != null && fb.Qd.size() != 0) {
         var3 = var4 == -1 ? 999999999 : var4;
         int var6 = 0;

         while (var6 < fb.Qd.size()) {
            q var5;
            q var10000 = var5 = (q)fb.Qd.elementAt(var6);
            if (var7) {
               return var10000;
            }

            if (var10000 != null && var5.n() && !var5.r() && (var4 = o.b(var0, var1, var5.c / 10, var5.d / 10)) < var3) {
               var2 = var5;
               var3 = var4;
            }

            var6++;
            if (var7) {
               break;
            }
         }
      }

      return var2;
   }

   public static q d(int var0) {
      boolean var3 = ab.xc;
      if (fb.Qd != null) {
         int var2 = 0;

         while (var2 < fb.Qd.size()) {
            q var1;
            if ((var1 = (q)fb.Qd.elementAt(var2)).w == var0) {
               return var1;
            }

            var2++;
            if (var3) {
               break;
            }
         }
      }

      return null;
   }

   public static q[] b(int var0, int var1, int var2, q var3) {
      boolean var9 = ab.xc;
      if (fb.Qd == null) {
         return null;
      }

      q[] var4 = null;
      byte var7 = 0;
      byte var8 = 0;

      while (var8 < 2) {
         var7 = 0;
         byte var6 = 0;

         while (var6 < fb.Qd.size()) {
            q var5;
            label71:
            if ((var5 = (q)fb.Qd.elementAt(var6)) != null && var5.g == var0 && var5.h == var1) {
               switch (var2) {
                  case 1:
                     if (!var5.n()) {
                        break label71;
                     }
                     break;
                  case 2:
                  case 3:
                     if (!var5.n() || var5.r() || var3 != null && var3 != var5 && (!ab.n || fb.i()) && (var5.x == var3.x || var5.ib && var2 == 3)) {
                        break label71;
                     }
               }

               if (var8 == 1) {
                  var4[var7] = var5;
               }

               var7++;
            }

            var6++;
            if (var9) {
               break;
            }
         }

         if (var8 == 0) {
            if (var7 == 0) {
               return null;
            }

            var4 = new q[var7];
         }

         var8++;
         if (var9) {
            break;
         }
      }

      return var4;
   }

   public final void b(byte var1, byte var2, byte var3, byte var4, boolean var5, boolean var6, boolean var7, byte var8, byte var9, byte var10, byte var11) {
      boolean var15 = ab.xc;
      if (var4 > 0) {
         byte var10000;
         byte var10001;
         label168: {
            var4 = var4;
            label148:
            if (fb.M || fb.i()) {
               if (var5) {
                  while (true) {
                     if (var4 > 0) {
                        boolean var13 = false;
                        var10000 = var1;
                        var10001 = var2;
                        if (var15) {
                           break label168;
                        }

                        byte[] var12;
                        if ((var12 = fb.b(var1, var2, var3, var4)) == null) {
                           return;
                        }

                        g var14;
                        if ((var14 = g.b(var12[0], var12[1])) != null && var14.d == 6) {
                           var13 = true;
                        }

                        if (!var13 && !this.b(var12[0], var12[1], (byte)-1)) {
                           var4--;
                           if (var15) {
                              return;
                           }
                           continue;
                        }
                     }

                     if (!var15) {
                        break label148;
                     }
                     break;
                  }
               }

               if (!this.b(this.g, this.h, var3)) {
                  return;
               }
            }

            if (var4 <= 0) {
               return;
            }

            label120: {
               this.j();
               this.Gb = 0;
               this.Hb = 0;
               this.Ib = 0;
               this.d(var1, var2);
               this.zb = this.wb;
               this.yb = var3;
               this.Eb = this.r == 9 ? false : var7;
               this.wb = F;
               if (var5) {
                  if (var4 >= 17) {
                     break label120;
                  }

                  byte var18 = 5;
                  if (var6) {
                     var18 = 9;
                  }

                  this.wb = var18 * (var4 + 1);
                  if (!var15) {
                     break label120;
                  }
               }

               this.wb += var8 * 10;
            }

            if (var5) {
               this.c(var3, false);
            }

            this.Bb = var5;
            this.Ab = var4;
            this.Db = var9;
            this.Gb = 0;
            if (var5) {
               int var20;
               if ((var20 = var4 * 10 * 30 / this.wb) <= 0) {
                  var20 = 1;
               }

               int var17 = var20 * 3 / 2;
               this.b(var17, 3);
            }

            label169: {
               this.qb = 3;
               if (fb.M || fb.i()) {
                  label170: {
                     if (this.Cc != null || fb.Pd == this) {
                        this.hc = true;
                        if (!var15) {
                           break label170;
                        }
                     }

                     this.gc = true;
                  }

                  if (!fb.M) {
                     break label169;
                  }

                  fb.I.b(this.w, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                  if (!var15) {
                     break label169;
                  }
               }

               if (fb.Pd == this) {
                  this.hc = true;
               }

               s var19;
               if ((var19 = s.b(var1, var2)) != null && var19.u == 1) {
                  var19.t.b(false, false, (byte)2);
               }
            }

            var10000 = this.g;
            var10001 = this.h;
         }

         label91:
         if (o.c(var10000, var10001)) {
            if (var10 == 1) {
               ab.G.b(ab.N, 0);
               if (!var15) {
                  break label91;
               }
            }

            if (var10 == 2) {
               ab.G.b(ab.P, 0);
               if (!var15) {
                  break label91;
               }
            }

            if (var10 == 2) {
               ab.G.b(ab.P, 0);
            }
         }

         if (var11 == 1) {
            this.hb = true;
         } else {
            if (var11 == 2) {
               this.Fb = 2;
            }
         }
      }
   }

   public final void a(byte var1, byte var2) {
      if (b(var1, var2) && y.b((int)var1, (int)var2)) {
         this.mb = 2;
         this.nb = var1;
         this.ob = var2;
         this.O = 1;
         this.Rb = -1;
         this.ub = 0;
         this.N = 0;
         this.wb = t;
         this.M = 0;
         this.pc = 25;
         this.Hc.j = 8;
         this.Qb = true;
         this.pb = fb.kb;
      }
   }

   public final boolean m() {
      return this.mb == -1;
   }

   public final boolean n() {
      return this.mb == 0;
   }

   private boolean o() {
      return this.r == 0 || this.p();
   }

   private boolean p() {
      return this.r == 1 || this.r == 7 || this.r == 5 || this.r == 6 || this.r == 8;
   }

   public final boolean q() {
      boolean var5 = ab.xc;
      rc.k = false;
      int var1 = y.b(this.ub, this.g);
      byte var2 = y.c(this.ub, this.h);
      if (!o.b((byte)var1, var2)) {
         return false;
      }

      byte var3 = 0;
      if (fb.Re == null) {
         return false;
      }

      label101:
      if (fb.Re[var1][var2].d != null) {
         if (fb.Re[var1][var2].d.A) {
            var3 = fb.Re[var1][var2].d.N;
         }

         if (b((byte)(var1 - 1), var2) && fb.Re[var1 - 1][var2].d != null && fb.Re[var1 - 1][var2].d.D) {
            var3 = fb.Re[var1 - 1][var2].d.N;
            rc.k = true;
            if (!var5) {
               break label101;
            }
         }

         if (fb.Re[var1][var2].d.D) {
            var3 = fb.Re[var1][var2].d.N;
            rc.k = true;
            if (!var5) {
               break label101;
            }
         }

         rc.k = false;
      }

      label88:
      if (var3 == 0 && var3 == 0 && b((byte)(var1 - 1), (byte)(var2 - 1)) && b((byte)(var1 - 2), (byte)(var2 - 1))) {
         if (fb.Re[var1 - 1][var2 - 1].d != null && fb.Re[var1 - 1][var2 - 1].d.C) {
            var3 = fb.Re[var1 - 1][var2 - 1].d.N;
            if (!var5) {
               break label88;
            }
         }

         if (fb.Re[var1 - 2][var2 - 1].d != null && fb.Re[var1 - 2][var2 - 1].d.C) {
            var3 = fb.Re[var1 - 2][var2 - 1].d.N;
         }
      }

      s var4;
      if (var3 == 0
         && (var4 = s.b((byte)var1, var2)) != null
         && var4.y
         && (var4.u == 4 || var4.u == 10 || var4.u == 7)
         && (fb.Re[var1][var2].d == null || fb.Re[var1][var2].d.c == -1)) {
         var3 = 1;
      }

      hb[] var7;
      if (var3 == 0 && (var7 = hb.b(var1, var2)) != null) {
         var1 = 0;

         while (var1 < var7.length) {
            if (var5) {
               return (boolean)var7[var1].o;
            }

            if (var7[var1].o == 11) {
               var3 = 1;
               if (!var5) {
                  break;
               }
            }

            var1++;
            if (var5) {
               break;
            }
         }
      }

      return (boolean)var3;
   }

   public final boolean b(boolean var1, byte var2, byte var3, boolean var4, boolean var5) {
      boolean var10;
      label312: {
         var10 = ab.xc;
         if (var1 == 0 && var2 == -1 && var3 == -1) {
            var2 = y.b(this.ub, this.g);
            var3 = y.c(this.ub, this.h);
            if (!var10) {
               break label312;
            }
         }

         var2 = var2;
         var3 = var3;
      }

      if (!o.b(var2, var3)) {
         return false;
      }

      boolean var6 = false;
      if (fb.M || fb.i()) {
         var6 = true;
         var1 = 1;
         if (fb.Zd != null) {
            int var8 = 0;

            while (var8 < fb.Zd.size()) {
               v var7;
               if ((var7 = (v)fb.Zd.elementAt(var8)) != null && !var7.q && var7.v && var7.b(var2, var3) && var7.d(this)) {
                  var7.b(this);
               }

               var8++;
               if (var10) {
                  break;
               }
            }
         }
      }

      boolean var11;
      byte var10000;
      label289: {
         var11 = false;
         if (var4) {
            if (hb.Q != null) {
               if (!hb.Q[var2][var3]) {
                  return false;
               }

               hb[] var12;
               label207:
               if ((var12 = hb.c((int)var2, (int)var3)) != null) {
                  if (var1 != 0) {
                     if (fb.M && (var2 != this.g || var3 != this.h)) {
                        this.d(var2, var3);
                     }

                     byte var9 = 0;

                     while (var9 < var12.length) {
                        var12[var9].z = this;
                        var12[var9].b(var2, var3, true);
                        var9++;
                        if (var10) {
                           break label207;
                        }

                        if (var10) {
                           break;
                        }
                     }
                  }

                  var11 = true;
               }

               if (var10) {
                  return false;
               }
            }
         } else {
            if (fb.Re == null) {
               return false;
            }

            boolean var15 = true;
            int var13 = 1;
            if (var5) {
               var15 = false;
               var13 = 0;
            }

            if (var15) {
               label283:
               if (fb.Re[var2][var3].d != null) {
                  if (fb.Re[var2][var3].d.A) {
                     var11 = fb.Re[var2][var3].d.b(this, var1 == 0, var1 != 0 ? !var6 : false);
                     if ((var1 == 0 || fb.i() || fb.M) && fb.Pd == this && !var11 && fb.Re[var2][var3].d.N && !this.Pc) {
                        this.c(50);
                     }
                  }

                  if (b((byte)(var2 - 1), var3) && fb.Re[var2 - 1][var3].d != null && fb.Re[var2 - 1][var3].d.D) {
                     var11 = fb.Re[var2 - 1][var3].d.b(this, var1 == 0, var1 != 0 ? !var6 : false);
                     if (!var10) {
                        break label283;
                     }
                  }

                  if (fb.Re[var2][var3].d.D) {
                     var11 = fb.Re[var2][var3].d.b(this, var1 == 0, var1 != 0 ? !var6 : false);
                  }
               }

               label264:
               if (!var11 && !var11 && b((byte)(var2 - 1), (byte)(var3 - 1)) && b((byte)(var2 - 2), (byte)(var3 - 1))) {
                  if (fb.Re[var2 - 1][var3 - 1].d != null && fb.Re[var2 - 1][var3 - 1].d.C) {
                     var11 = fb.Re[var2 - 1][var3 - 1].d.b(this, var1 == 0, var1 != 0 ? !var6 : false);
                     if (!var10) {
                        break label264;
                     }
                  }

                  if (fb.Re[var2 - 2][var3 - 1].d != null && fb.Re[var2 - 2][var3 - 1].d.C) {
                     var11 = fb.Re[var2 - 2][var3 - 1].d.b(this, var1 == 0, var1 != 0 ? !var6 : false);
                  }
               }
            }

            s var16;
            if (!var11 && (var16 = s.b(var2, var3)) != null) {
               var11 = var16.b(this);
               if (!fb.M && !fb.i() && var1 != 0) {
                  var16.g();
               }
            }

            hb[] var17;
            if (var13 && !var11 && (var17 = hb.b((int)var2, (int)var3)) != null) {
               var13 = 0;

               while (var13 < var17.length) {
                  var10000 = var17[var13].o;
                  if (var10) {
                     break label289;
                  }

                  if (var17[var13].o == 11) {
                     label362: {
                        if (fb.M || fb.i()) {
                           this.b(var17[var13].o, this.Yb[var17[var13].o] + 1, true);
                           if (fb.M && fb.Pd != null && fb.Pd != this) {
                              fb.I.c(this.w, var17[var13].o, this.Yb[var17[var13].o]);
                           }

                           var17[var13].f();
                           if (!var10) {
                              break label362;
                           }
                        }

                        if (var1 != 0) {
                           var17[var13].f();
                        }
                     }

                     var11 = true;
                     if (!var10) {
                        break;
                     }
                  }

                  var13++;
                  if (var10) {
                     break;
                  }
               }
            }
         }

         var10000 = var1;
      }

      if ((var10000 == 0 || var1 != 0 && var6) && !fb.i() && var11) {
         fb.I.b(this.w, var2, var3, var4, var5);
      }

      return var11;
   }

   public final void e(int var1) {
      int var2;
      label30: {
         boolean var3 = ab.xc;
         var2 = 0;
         if (this.o()) {
            var2 = t;
            if (!this.fb) {
               break label30;
            }

            var2 += 20;
            if (!var3) {
               break label30;
            }
         }

         switch (this.r) {
            case 2:
               var2 = u;
               if (!var3) {
                  break;
               }
            case 3:
               var2 = v;
               if (!var3) {
                  break;
               }
            case 9:
               var2 = t;
         }
      }

      if ((var1 = var2 + var1 * 10) > 120) {
         var1 = 120;
      }

      if (this.qb == 3) {
         this.zb = var1;
      } else {
         this.wb = var1;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public final int b(byte var1, boolean var2, byte var3, byte var4, byte[] var5) {
      boolean var21 = ab.xc;
      if (this.fb) {
         return 1;
      }

      if (this.qb == 1) {
         return 1;
      }

      if (this == fb.Pd && !var2 || (fb.M || fb.i()) && this.Cc != null) {
         byte var7 = var1;
         q var6 = this;
         byte var23;
         if ((
                  var23 = (byte)(var7 == 2
                     ? 30 - 12 * var6.ac[3]
                     : (
                        var7 == 5 || var7 == 6
                           ? 80 - 16 * var6.ac[5]
                           : (
                              var7 == 3 || var7 == 4
                                 ? 30 - 6 * var6.ac[4]
                                 : (var7 == 9 ? 80 - 40 * var6.ac[7] : (var7 != 7 && var7 != 8 ? 0 : 60 - 9 * var6.ac[6]))
                           )
                     ))
               )
               > 0
            && fb.kb - this.Zb[var1] < var23) {
            return 1;
         }

         this.Zb[var1] = fb.kb;
      }

      byte[] var24 = var5;
      if (!var2 || fb.M) {
         if (hb.d(var1)) {
            if (this.Jb) {
               return 1;
            }
         } else if (hb.b(var3, var4) || hb.c(var3, var4)) {
            return 1;
         }

         if (this.Yb[var1] == 0) {
            return 1;
         }

         if (this.Yb[var1] != -1) {
            this.Yb[var1]--;
            if (!var2) {
               ab.b(var1, -1);
            }
         }
      }

      var22 = hb.d(var1);
      label643:
      if (o.c(this.g, this.h)) {
         if (hb.d(var1)) {
            ab.G.b(ab.Y, 0);
            if (!var21) {
               break label643;
            }
         }

         ab.G.b(ab.V, 0);
      }

      if (var1 == 0) {
         hb.b((byte)0, var3, var4, this, null);
      }

      if (var1 == 12) {
         hb.b((byte)12, var3, var4, this, null);
      }

      if (var1 == 7) {
         byte var25 = 8;
         byte var8 = var3;
         byte var9 = var4;
         byte var11 = 1;

         byte var10000;
         label631: {
            while (var11 < var25) {
               var8 = y.b(this.ub, var8);
               var9 = y.c(this.ub, var9);
               var10000 = o.b(var8, var9);
               if (var21) {
                  break label631;
               }

               if (var10000 == 0) {
                  break;
               }

               label627: {
                  q[] var10;
                  if (fb.bf[var8][var9] != 0 && (var10 = b(var8, var9, 2, this)) != null) {
                     int var12 = 0;

                     while (var12 < var10.length) {
                        var10000 = y.b(var10[var12], this);
                        if (var21) {
                           break label627;
                        }

                        if (var10000 != 0) {
                           var25 = var11;
                           if (!var21) {
                              break;
                           }
                        }

                        var12++;
                        if (var21) {
                           break;
                        }
                     }
                  }

                  var10000 = (byte)(var11 + 1);
               }

               var11 = var10000;
               if (var21) {
                  break;
               }
            }

            var25++;
            var10000 = 7;
         }

         hb.b(var10000, var3, var4, this, new byte[]{var25});
      }

      if (var1 == 8) {
         byte var26 = 8;
         byte var31 = var3;
         byte var33 = var4;
         byte var36 = 0;
         byte var42 = 1;

         byte var63;
         label600: {
            while (var42 < var26) {
               var31 = y.b(this.ub, var31);
               var33 = y.c(this.ub, var33);
               var63 = o.b(var31, var33);
               if (var21) {
                  break label600;
               }

               if (var63 == 0) {
                  break;
               }

               label596: {
                  q[] var39;
                  if (fb.bf[var31][var33] != 0 && (var39 = b(var31, var33, 2, this)) != null) {
                     int var13 = 0;

                     while (var13 < var39.length) {
                        var63 = y.b(var39[var13], this);
                        if (var21) {
                           break label596;
                        }

                        if (var63 != 0) {
                           var26 = var42;
                           var36 = var39[var13].w;
                           if (!var21) {
                              break;
                           }
                        }

                        var13++;
                        if (var21) {
                           break;
                        }
                     }
                  }

                  var63 = (byte)(var42 + 1);
               }

               var42 = var63;
               if (var21) {
                  break;
               }
            }

            var26++;
            var63 = 8;
         }

         hb.b(var63, var3, var4, this, new byte[]{var26, var36});
      }

      if (var1 == 11) {
         hb.b((byte)11, var3, var4, this, null);
      }

      if (var1 == 2) {
         hb.b((byte)2, var3, var4, this, null);
      }

      if (var1 == 3) {
         hb.b((byte)3, var3, var4, this, null);
      }

      label568: {
         int var32;
         Object var66;
         label741: {
            if (var1 == 5) {
               if (!var2 && fb.bf != null) {
                  byte[] var27 = new byte[]{-1, -1, -1, -1, -1};
                  byte var37 = 0;
                  byte var40 = this.ub;
                  byte var43 = this.g;
                  byte var45 = this.h;

                  label563:
                  while (true) {
                     var43 = y.b(var40, var43);
                     var45 = y.c(var40, var45);
                     byte var65 = o.b(var43, var45);

                     do {
                        if (var65 != 0) {
                           if (fb.bf[var43][var45] == 0) {
                              var43 = y.d(var40, var43);
                              var45 = y.e(var40, var45);
                              boolean var34 = false;
                              var32 = 0;
                              byte var14 = y.b(y.b(var40), var43);
                              byte var15 = y.c(y.b(var40), var45);
                              if (o.b(var14, var15) && fb.bf[var14][var15] != 0) {
                                 var32 = 1;
                              }

                              var14 = y.b(y.c(var40), var43);
                              var15 = y.c(y.c(var40), var45);
                              if (o.b(var14, var15) && fb.bf[var14][var15] != 0) {
                                 var34 = true;
                              }

                              boolean var16 = false;
                              if (var32 == 0) {
                                 this.fc = 0;
                              } else if (!var34) {
                                 this.fc = 0;
                              } else {
                                 byte var20 = 0;

                                 label550:
                                 while (var20 <= 2) {
                                    var66 = fb.bf;
                                    if (var21) {
                                       break label741;
                                    }

                                    if (fb.bf == null || Vc == null) {
                                       break;
                                    }

                                    byte var19;
                                    if (var20 == 0) {
                                       var19 = y.b(var40);
                                       if (var21) {
                                          var19 = y.c(var40);
                                       }
                                    } else {
                                       var19 = y.c(var40);
                                    }

                                    var14 = var43;
                                    var15 = var45;

                                    label548:
                                    while (true) {
                                       var14 = y.b(var19, var14);
                                       var15 = y.c(var19, var15);
                                       byte var67 = o.b(var14, var15);

                                       do {
                                          if (var67) {
                                             label542: {
                                                q[] var17;
                                                if (Vc[var14][var15] != 0 && (var17 = b(var14, var15, 2, this)) != null) {
                                                   byte var18 = 0;

                                                   while (var18 < var17.length) {
                                                      var67 = y.b(var17[var18], this);
                                                      if (var21) {
                                                         break label542;
                                                      }

                                                      if (var67 != 0) {
                                                         var40 = var19;
                                                         var16 = true;
                                                         if (!var21) {
                                                            break;
                                                         }
                                                      }

                                                      var18++;
                                                      if (var21) {
                                                         break;
                                                      }
                                                   }
                                                }

                                                var67 = fb.bf[var14][var15];
                                             }

                                             if (var67 != 0) {
                                                continue label548;
                                             }
                                          }

                                          var67 = var16;
                                       } while (var21);

                                       if (var16) {
                                          break label550;
                                       }

                                       var20++;
                                       if (var21) {
                                          break label550;
                                       }
                                       break;
                                    }
                                 }

                                 label493:
                                 if (!var16) {
                                    label509: {
                                       if (this.fc != 0) {
                                          if (this.fc == 1) {
                                             if (ab.oc.nextInt(6) != 0) {
                                                var34 = false;
                                                if (!var21) {
                                                   break label509;
                                                }
                                             }

                                             var32 = 0;
                                             if (!var21) {
                                                break label509;
                                             }
                                          }

                                          if (ab.oc.nextInt(6) != 0) {
                                             var32 = 0;
                                             break label509;
                                          }

                                          var34 = false;
                                          if (!var21) {
                                             break label509;
                                          }
                                       }

                                       if (ab.oc.nextInt(2) != 0) {
                                          var34 = false;
                                          if (var21) {
                                             var32 = 0;
                                          }
                                       } else {
                                          var32 = 0;
                                       }
                                    }

                                    if (var34) {
                                       this.fc = 1;
                                       if (!var21) {
                                          break label493;
                                       }
                                    }

                                    this.fc = -1;
                                    if (var21) {
                                       this.fc = 0;
                                    }
                                 }
                              }

                              label486:
                              if (!var16) {
                                 if (var32 != 0) {
                                    var40 = y.b(var40);
                                    if (!var21) {
                                       break label486;
                                    }
                                 }

                                 if (var34) {
                                    var40 = y.c(var40);
                                    if (var21) {
                                       var40 = y.d(var40);
                                    }
                                 } else {
                                    var40 = y.d(var40);
                                 }
                              }

                              var27[var37++] = var40;
                           }

                           if (var37 < var27.length) {
                              continue label563;
                           }
                        }

                        var65 = var37;
                     } while (var21);

                     if (var37 > 0) {
                        var24 = var27;
                     }
                     break;
                  }
               }

               hb.b((byte)5, var3, var4, this, var24);
            }

            if (var1 == 10) {
               hb.b((byte)10, var3, var4, this, null);
            }

            if (var1 == 9) {
               hb.b((byte)9, var3, var4, this, null);
            }

            if (var1 == 13) {
               hb.b((byte)13, var3, var4, this, null);
            }

            if (var1 == 1) {
               hb.b((byte)1, var3, var4, this, null);
            }

            if (var1 == 4) {
               hb.b((byte)4, var3, var4, this, null);
            }

            if (var1 == 6) {
               if (!var2 && fb.bf != null) {
                  byte[] var28 = new byte[]{-1, -1, -1, -1, -1};
                  byte var38 = 0;
                  byte var41 = this.ub;
                  byte var44 = this.g;
                  byte var46 = this.h;

                  label464:
                  while (true) {
                     var44 = y.b(var41, var44);
                     var46 = y.c(var41, var46);
                     byte var69 = o.b(var44, var46);

                     do {
                        if (var69 != 0) {
                           if (fb.bf[var44][var46] == 0) {
                              var44 = y.d(var41, var44);
                              var46 = y.e(var41, var46);
                              boolean var35 = false;
                              var32 = 0;
                              byte var49 = y.b(y.b(var41), var44);
                              byte var54 = y.c(y.b(var41), var46);
                              if (o.b(var49, var54) && fb.bf[var49][var54] != 0) {
                                 var32 = 1;
                              }

                              var49 = y.b(y.c(var41), var44);
                              var54 = y.c(y.c(var41), var46);
                              if (o.b(var49, var54) && fb.bf[var49][var54] != 0) {
                                 var35 = true;
                              }

                              boolean var57 = false;
                              if (var32 == 0) {
                                 this.fc = 0;
                              } else if (!var35) {
                                 this.fc = 0;
                              } else {
                                 byte var61 = 0;

                                 label451:
                                 while (var61 <= 2) {
                                    var66 = fb.bf;
                                    if (var21) {
                                       break label741;
                                    }

                                    if (fb.bf == null || Vc == null) {
                                       break;
                                    }

                                    byte var60;
                                    if (var61 == 0) {
                                       var60 = y.b(var41);
                                       if (var21) {
                                          var60 = y.c(var41);
                                       }
                                    } else {
                                       var60 = y.c(var41);
                                    }

                                    var49 = var44;
                                    var54 = var46;

                                    label449:
                                    while (true) {
                                       var49 = y.b(var60, var49);
                                       var54 = y.c(var60, var54);
                                       byte var70 = o.b(var49, var54);

                                       do {
                                          if (var70) {
                                             label443: {
                                                q[] var58;
                                                if (Vc[var49][var54] != 0 && (var58 = b(var49, var54, 2, this)) != null) {
                                                   byte var59 = 0;

                                                   while (var59 < var58.length) {
                                                      var70 = y.b(var58[var59], this);
                                                      if (var21) {
                                                         break label443;
                                                      }

                                                      if (var70 != 0) {
                                                         var41 = var60;
                                                         var57 = true;
                                                         if (!var21) {
                                                            break;
                                                         }
                                                      }

                                                      var59++;
                                                      if (var21) {
                                                         break;
                                                      }
                                                   }
                                                }

                                                var70 = fb.bf[var49][var54];
                                             }

                                             if (var70 != 0) {
                                                continue label449;
                                             }
                                          }

                                          var70 = var57;
                                       } while (var21);

                                       if (var57) {
                                          break label451;
                                       }

                                       var61++;
                                       if (var21) {
                                          break label451;
                                       }
                                       break;
                                    }
                                 }

                                 label394:
                                 if (!var57) {
                                    label410: {
                                       if (this.fc != 0) {
                                          if (this.fc == 1) {
                                             if (ab.oc.nextInt(6) != 0) {
                                                var35 = false;
                                                if (!var21) {
                                                   break label410;
                                                }
                                             }

                                             var32 = 0;
                                             if (!var21) {
                                                break label410;
                                             }
                                          }

                                          if (ab.oc.nextInt(6) != 0) {
                                             var32 = 0;
                                             break label410;
                                          }

                                          var35 = false;
                                          if (!var21) {
                                             break label410;
                                          }
                                       }

                                       if (ab.oc.nextInt(2) != 0) {
                                          var35 = false;
                                          if (var21) {
                                             var32 = 0;
                                          }
                                       } else {
                                          var32 = 0;
                                       }
                                    }

                                    if (var35) {
                                       this.fc = 1;
                                       if (!var21) {
                                          break label394;
                                       }
                                    }

                                    this.fc = -1;
                                    if (var21) {
                                       this.fc = 0;
                                    }
                                 }
                              }

                              label387:
                              if (!var57) {
                                 if (var32 != 0) {
                                    var41 = y.b(var41);
                                    if (!var21) {
                                       break label387;
                                    }
                                 }

                                 if (var35) {
                                    var41 = y.c(var41);
                                    if (var21) {
                                       var41 = y.d(var41);
                                    }
                                 } else {
                                    var41 = y.d(var41);
                                 }
                              }

                              var28[var38++] = var41;
                           }

                           if (var38 < var28.length) {
                              continue label464;
                           }
                        }

                        var69 = var38;
                     } while (var21);

                     if (var38 > 0) {
                        var24 = var28;
                     }
                     break;
                  }
               }

               hb.b((byte)6, var3, var4, this, var24);
            }

            if (var22) {
               this.b(40, 8);
               hb[] var29;
               if ((var29 = hb.b((int)var3, (int)var4)) != null) {
                  var32 = 0;

                  while (var32 < var29.length) {
                     var66 = var29[var32];
                     if (var21) {
                        break label741;
                     }

                     label363:
                     if (var66 != null) {
                        if (var29[var32].R) {
                           if (var29[var32].E) {
                              break label363;
                           }

                           var29[var32].F = true;
                           if (!var21) {
                              break label363;
                           }
                        }

                        if (var29[var32].S) {
                           var29[var32].F = true;
                        }
                     }

                     var32++;
                     if (var21) {
                        break;
                     }
                  }
               }
            }

            if (!fb.M && !fb.i() || fb.Zd == null) {
               break label568;
            }

            var32 = 0;
            if (var32 >= fb.Zd.size()) {
               break label568;
            }

            var66 = fb.Zd.elementAt(var32);
         }

         while (true) {
            v var30;
            if ((var30 = (v)var66) != null && !var30.q && var30.u && var30.b(var3, var4) && var30.d(this)) {
               var30.b(this);
            }

            if (var21 || ++var32 >= fb.Zd.size()) {
               break;
            }

            var66 = fb.Zd.elementAt(var32);
         }
      }

      if (!var2 && !fb.i()) {
         fb.I.b(this.w, var3, var4, var1, var24);
      }

      return 0;
   }

   public final void b(byte var1, int var2, boolean var3) {
      if (this.Yb[var1] != -1 && var2 != this.Yb[var1]) {
         int var4;
         if ((var4 = var2 - this.Yb[var1]) > 0) {
            String var5;
            label38: {
               if (var2 > this.Yb[var1]) {
                  fb.c(100, this.w);
                  var5 = "+";
                  if (!ab.xc) {
                     break label38;
                  }
               }

               var5 = "";
            }

            (new w(null, super.c / 10, super.d / 10 - 25, (byte)8, true, 0)).i = var5 + var4 + hb.b((int)var1);
         }

         this.Yb[var1] = var2;
         if (this == fb.Pd && var1 == this.bc) {
            fb.I.c(hb.b(this.bc) + this.Yb[this.bc]);
         }

         if (o.c(this.g, this.h)) {
            ab.G.b(ab.S, 0);
         }

         if (fb.M && fb.Pd != null && fb.Pd != this) {
            fb.I.c(this.w, var1, this.Yb[var1]);
         }

         if (var3) {
            ab.b(var1, var4);
         }
      }
   }

   public final void b(int var1, boolean var2) {
      if (var1 != this.C) {
         int var3;
         if ((var3 = var1 - this.C) > 0) {
            String var5;
            if (var1 > this.C) {
               if (this == fb.Pd && fb.i()) {
                  fb.f += var3;
               }

               if (var2) {
                  fb.c(100, this.w);
               }

               var5 = "+";
            } else {
               var5 = "";
            }

            (new w(null, super.c / 10, super.d / 10 - 25, (byte)8, true, 0)).i = var5 + var3 + "^41~";
         }

         this.C = var1;
         if (fb.I != null && fb.Pd == this) {
            fb.I.j = "^41~" + this.C;
         }

         if (o.c(this.g, this.h)) {
            ab.G.b(ab.S, 0);
         }

         if (fb.M && fb.Pd != null && fb.Pd != this) {
            fb.I.b(this.w, this.C);
         }
      }
   }

   public final boolean d(byte var1, boolean var2) {
      if (!var2 || fb.M) {
         if (this.dc[var1] == 0) {
            return false;
         }

         if (this.dc[var1] != -1) {
            this.dc[var1]--;
            if (!var2) {
               ab.c(var1, -1);
            }
         }

         if (fb.M || fb.i()) {
            if (var1 == 1) {
               if (!var2 && (this.fb || this.ib || this.kb)) {
                  return false;
               }

               q var3 = this;
               this.e((byte)(30 + 15 * var3.ac[9]), true);
            }

            if (var1 == 2) {
               if (!var2 && (this.fb || this.ib || this.kb)) {
                  return false;
               }

               this.g((byte)this.x(), true);
            }

            if (var1 == 3) {
               if (!var2 && (this.fb || this.ib || this.kb)) {
                  return false;
               }

               this.f((byte)30, true);
            }

            if (var1 == 0) {
               this.b((byte)10, this.Yb[10] + 1, true);
               this.b(this.nc + this.v() / 2, -1, -1, true, false);
            }

            if (var1 == 4) {
               this.b(this.mc + 90, -1, -1, true, true);
            }
         }
      }

      if (!var2 && !fb.i()) {
         fb.I.c(this.w, var1);
      }

      return true;
   }

   public final void c(byte var1, int var2, boolean var3) {
      if (var2 == -1) {
         this.dc[var1] = -1;
      }

      if (this.dc[var1] != -1 && var2 != this.dc[var1]) {
         if (var2 > ec[var1] && ec[var1] != -1) {
            var2 = ec[var1];
         }

         int var4;
         if ((var4 = var2 - this.dc[var1]) != 0) {
            String var5;
            label48: {
               if (var2 > this.dc[var1]) {
                  var5 = "+";
                  fb.c(150, this.w);
                  if (!ab.xc) {
                     break label48;
                  }
               }

               var5 = "";
            }

            (new w(null, super.c / 10, super.d / 10 - 25, (byte)8, true, 0)).i = var5 + var4 + hb.c((int)var1);
         }

         this.dc[var1] = var2;
         if (this == fb.Pd && this.dc[var1] != 0 && fb.i()) {
            ab.Zb[var1] = true;
         }

         if (o.c(this.g, this.h)) {
            ab.G.b(ab.S, 0);
         }

         if (fb.M && fb.Pd != null && fb.Pd != this) {
            fb.I.d(this.w, var1, this.dc[var1]);
         }

         if (var3) {
            ab.c(var1, var4);
         }
      }
   }

   public final boolean b(int var1, int var2) {
      int var3 = var1;
      q var4 = this;
      if (var3 > 0) {
         var4.Jb = true;
         var4.Hb = var3;
      }

      this.Ob = var2;
      if (this.Ob <= 0) {
         this.Ob = 1;
      }

      return true;
   }

   public final boolean r() {
      return this.Gb / 10 >= 20;
   }

   public final void b(byte var1, byte[] var2) {
      switch (var1) {
         case 0:
            this.b(var2[0]);
            if (var2[0] != -1) {
               this.j();
               this.d(var2[1], var2[2]);
               return;
            }
            break;
         case 1:
            this.e(var2[0], true);
            return;
         case 2:
            this.g(var2[0], true);
            return;
         case 3:
            this.b(var2[0], 0, 0, var2[0] == 2, false, true);
            return;
         case 4:
         default:
            break;
         case 5:
            this.f(var2[0], true);
      }
   }

   public final void b(byte var1) {
      boolean var2 = ab.xc;
      if (this.r != 4) {
         if (this.r == 2) {
            if (this.Cc == null) {
               return;
            }

            if (this.Cc.k > 0) {
               return;
            }
         } else if (this.fb || this.kb) {
            return;
         }

         if (var1 != -1) {
            if (this.yc != null) {
               this.yc.c();
            }

            label102: {
               this.yc = new w(fb.mc, 0, 0, (byte)9, true, 0);
               this.yc.b(this, 0, -this.pc);
               this.yc.s = -1;
               if (fb.M || fb.i()) {
                  this.Ub = var1;
                  if (this.e()) {
                     break label102;
                  }

                  this.s();
                  if (!var2) {
                     break label102;
                  }
               }

               this.Tb = true;
               if (fb.Pd == this) {
                  this.hc = true;
               }
            }

            if (fb.Pd == this) {
               fb.b(10, 10);
            }

            this.Rb = 0;
            this.Sb = 1;
         } else {
            label103: {
               if (fb.M || fb.i()) {
                  this.Tb = false;
                  this.Ub = 0;
                  this.Wb = false;
                  if (this.Cc != null) {
                     this.Cc.b();
                  }

                  if (this.Cc != null || fb.Pd == this) {
                     this.hc = false;
                  }

                  if (!fb.M) {
                     break label103;
                  }

                  this.gc = false;
                  if (!var2) {
                     break label103;
                  }
               }

               this.Tb = false;
               if (fb.Pd == this) {
                  this.hc = false;
               }
            }

            if (this.yc != null) {
               this.yc.s = 0;
               this.yc = null;
            }

            if (this.zc != null) {
               this.zc.c();
               this.zc = null;
            }
         }
      }
   }

   private void s() {
      if (fb.M || fb.i()) {
         if (this.Ub > 0) {
            this.Tb = true;
            if (this.Cc != null || fb.Pd == this) {
               this.hc = true;
            }

            this.Wb = false;
            if (fb.M) {
               this.gc = true;
               fb.I.c(this.w, this.g, this.h);
               fb.I.b(this.w, (byte)0, new byte[]{this.Ub, this.g, this.h});
            }

            this.Vb = fb.kb + this.Ub * 25;
         }

         this.Ub = 0;
      }
   }

   public final void b(int var1, int var2, int var3, boolean var4, boolean var5, boolean var6) {
      if (this.r != 4) {
         if (this.Ac != null) {
            this.Ac.z = true;
         }

         if (var1 > 0) {
            this.Y = true;
            this.Z = var1;
            this.cb = var2;
            this.bb = var3;
            this.db = var5;
            this.eb = var4;
            if (var4) {
               var5 = true;
               byte var7 = 3;
               this.b(var7, var5, true);
            }

            if (fb.Mc != null) {
               this.Ac = new r(this, 0, 0, 0, 0, 15, -1, new t((byte)0, fb.Mc, 15, 0, 0, 0, 0));
            }

            if (o.c(this.g, this.h)) {
               ab.G.b(ab.U, 0);
            }
         } else {
            this.Y = false;
            this.db = false;
            this.Z = 0;
            this.cb = 0;
            this.bb = 0;
            if (this.eb) {
               var5 = false;
               byte var8 = 3;
               this.b(var8, var5, true);
            }

            this.eb = false;
         }

         if (fb.M && var6) {
            fb.I.b(this.w, (byte)3, new byte[]{(byte)(var1 != 0 ? (var4 ? 2 : 1) : 0)});
         }
      }
   }

   public final void e(byte var1, boolean var2) {
      label21: {
         if (var1 != -1) {
            this.fb = true;
            this.gb = var1 * 25;
            if (fb.Rb != null) {
               w var3;
               (var3 = new w(fb.Rb, super.c / 10, super.d / 10, (byte)2, false, 1)).b(this, 0, 0);
               var3.h.e = false;
               var3.h.b(p.r, false, false, (byte)1);
            }

            boolean var5 = true;
            byte var4 = 1;
            this.b(var4, var5, true);
            if (!ab.xc) {
               break label21;
            }
         }

         this.fb = false;
         this.gb = 0;
         this.b((byte)1, false, var2);
      }

      if (fb.M && var2) {
         fb.I.b(this.w, (byte)1, new byte[]{var1});
      }
   }

   public final void f(byte var1, boolean var2) {
      label17: {
         if (var1 != -1) {
            this.kb = true;
            this.lb = var1 * 25;
            boolean var5 = true;
            byte var4 = 5;
            this.b(var4, var5, true);
            if (!ab.xc) {
               break label17;
            }
         }

         this.kb = false;
         this.lb = 0;
         this.b((byte)5, false, var2);
      }

      if (fb.M && var2) {
         fb.I.b(this.w, (byte)5, new byte[]{var1});
      }
   }

   public final void g(byte var1, boolean var2) {
      label21: {
         if (var1 != -1) {
            this.ib = true;
            this.jb = var1 * 25;
            if (fb.Sb != null) {
               w var3;
               (var3 = new w(fb.Sb, super.c / 10, super.d / 10, (byte)2, false, 1)).b(this, 0, 0);
               var3.h.e = false;
               var3.h.b(p.r, false, false, (byte)1);
            }

            boolean var5 = true;
            byte var4 = 2;
            this.b(var4, var5, true);
            if (!ab.xc) {
               break label21;
            }
         }

         this.ib = false;
         this.jb = 0;
         this.b((byte)2, false, var2);
      }

      if (fb.M && var2) {
         fb.I.b(this.w, (byte)2, new byte[]{var1});
      }
   }

   public final void h() {
      boolean var6 = ab.xc;
      if (this.Jb) {
         label1092: {
            if (this.Ob == 0) {
               this.Hb = this.Hb - (u.s << 2);
               if (!var6) {
                  break label1092;
               }
            }

            this.Hb = this.Hb - this.Ob;
         }

         this.Gb = this.Gb + this.Hb;
         if (this.Gb <= 0) {
            this.Hb = 0;
            this.Gb = 0;
            this.Ob = 0;
            this.Jb = false;
         }

         this.Ib = this.Gb / 10;
      }

      if (this.uc) {
         q var1 = this;
         if (this.nc == -1) {
            boolean var10000 = false;
         } else {
            int var2 = var1.nc - var1.rc;
            if (var1.rc < 0) {
               var1.rc = 0;
            }

            label1081:
            if (var1.rc - var1.nc > 0) {
               if (var1.wc) {
                  if (var1.rc > var1.mc) {
                     var1.oc = true;
                     if (!var6) {
                        break label1081;
                     }
                  }

                  var1.oc = false;
                  if (!var6) {
                     break label1081;
                  }
               }

               label1073:
               if (var1.rc > var1.mc) {
                  if (!var1.oc) {
                     var1.rc = var1.mc;
                     if (!var6) {
                        break label1073;
                     }
                  }

                  var1.rc = var1.nc;
               }
            }

            if (var1.rc > var1.mc << 1) {
               var1.rc = var1.mc << 1;
            }

            label1066: {
               int var3;
               if ((var3 = var1.rc - var1.nc) < 0) {
                  if (Math.abs(var3) >= 10) {
                     if (fb.Pd == var1) {
                        rc.b(200, 0);
                     }

                     if (o.c(var1.g, var1.h) && var1.f() && var1.rc > 0) {
                        label1061: {
                           if (ab.oc.nextInt(2) == 0) {
                              ab.G.b(ab.J, 0);
                              if (!var6) {
                                 break label1061;
                              }
                           }

                           ab.G.b(ab.K, 0);
                        }

                        if (ab.cc && fb.zc != null && var2 >= var1.mc / 4) {
                           var1.Xb = 8;
                           (new d(new nb(fb.zc), var1.c / 10, var1.d / 10, ab.rc, true)).e.b(new byte[]{0, 0, 1, 1, 2, 3}, false, false, (byte)2);
                        }
                     }
                  }

                  if (ab.cc && var1.rc > 0 && fb.Dc != null) {
                     (new w(fb.Dc, var1.c / 10, var1.d / 10 - 8, (byte)12, true, 1)).h.b(new byte[]{0, 1, 2, 3, 4, 5}, false, false, (byte)1);
                  }

                  if (ab.bc != 0 && var1.r != 0 && fb.Pd != null && fb.L == 0) {
                     fb.c(var3, var1.sc);
                     if (var1.rc <= 0 && fb.b) {
                        q var5 = var1;
                        fb.Pd
                           .b(
                              fb.Pd.C
                                 + (
                                    var1.r == 3
                                       ? ab.oc.nextInt(5) + 3
                                       : (var5.r == 9 ? ab.oc.nextInt(3) + 2 : (var5.r == 4 ? ab.oc.nextInt(8) + 12 : ab.oc.nextInt(6) + 7))
                                 ),
                              false
                           );
                        fb.c(var1.mc / 2, var1.sc);
                     }
                  }

                  var1.Pb = 4;
                  if (!var6) {
                     break label1066;
                  }
               }

               if (var3 > 0) {
                  if (o.c(var1.g, var1.h)) {
                     ab.G.b(ab.T, 0);
                  }

                  if (var1.vc) {
                     new w(fb.mc, var1.c / 10, var1.d / 10, (byte)10, true, 0).b(var1, 0, 0);
                     if (fb.Sb != null) {
                        w var4;
                        (var4 = new w(fb.Sb, var1.c / 10, var1.d / 10, (byte)2, false, 1)).b(var1, 0, 0);
                        var4.h.e = false;
                        var4.h.b(p.s, false, false, (byte)1);
                     }
                  }
               }
            }

            var1.nc = var1.rc;
            if (var1.nc <= var1.mc) {
               var1.oc = false;
            }

            label1041: {
               if (var1.nc > 0) {
                  var1.c(125);
                  var1.Qc = true;
                  if (!var6) {
                     break label1041;
                  }
               }

               var1.Qc = false;
               var1.b(true);
            }

            label1035:
            if (fb.M || fb.i()) {
               if (var1.nc > 0) {
                  if (!fb.M) {
                     break label1035;
                  }

                  fb.I.b(var1.w, var1.nc, var1.vc, var1.wc);
                  if (!var6) {
                     break label1035;
                  }
               }

               var1.b((byte)var1.sc, (byte)var1.tc, var2 >= var1.mc / 2, var1.xc);
            }
         }

         this.uc = false;
      }

      label1181: {
         if (this.mb == 1 || this.mb == 2) {
            if (this.Hc == null) {
               break label1181;
            }

            this.Hc.c();
            if (this.r == 0) {
               if (this.Jb || this.Hc.e) {
                  break label1181;
               }

               if (this.Hc.j >= fb.Wb.h - 1) {
                  this.mb = 0;
                  this.hc = false;
                  q var7 = this;
                  if (fb.Xb != null) {
                     new d(fb.Xb, (byte)0, var7.c / 10, var7.d / 10, ab.rc);
                  }

                  if (o.c(var7.g, var7.h)) {
                     ab.G.b(ab.Q, 0);
                  }

                  if (fb.M || fb.i() || fb.Pd != this) {
                     break label1181;
                  }

                  fb.I.n();
                  if (!var6) {
                     break label1181;
                  }
               }

               this.Hc.b(new byte[]{1, 1, 2}, false, false, (byte)0);
               if (fb.Pd != this) {
                  break label1181;
               }

               fb.b(20, 20);
               if (!var6) {
                  break label1181;
               }
            }

            if (!this.p() || this.Hc.e) {
               break label1181;
            }

            if (this.Hc.j >= fb.dd.h - 1) {
               if (this.mb == 2) {
                  this.Hc.b(R, false, false, (byte)1);
                  if (!var6) {
                     break label1181;
                  }
               }

               this.mb = 0;
               this.hc = false;
               if (fb.ed != null) {
                  new d(fb.ed, (byte)0, super.c / 10, super.d / 10, ab.qc);
               }

               if (fb.M || fb.i() || fb.Pd != this) {
                  break label1181;
               }

               fb.I.n();
               if (!var6) {
                  break label1181;
               }
            }

            if (this.mb == 2) {
               if (fb.kb - this.pb < 20L) {
                  break label1181;
               }

               this.b(this.nb, this.ob, false);
               if (!var6) {
                  break label1181;
               }
            }

            this.Hc.b(this.Qb ? Q : P, false, false, (byte)1);
            this.Qb = false;
            if (!var6) {
               break label1181;
            }
         }

         if (this.mb == 0) {
            if (fb.Pd != null && fb.Pd.mb == 0 && c(this.g, this.h) && !ab.w) {
               this.Bc = true;
            }

            if (this.qc > 0) {
               this.qc = (byte)(this.qc / 2);
               if (this.qc < 2) {
                  this.qc = 0;
               }
            }

            if (this.qb != 3 && this.hb) {
               this.hb = false;
            }

            if (this.Lb) {
               this.Mb--;
               if (this.Mb <= 0) {
                  this.Lb = false;
               }
            }

            if ((fb.M || fb.i()) && this != fb.Pd && this.Cc != null && !this.hc) {
               this.Cc.h();
            }

            if ((fb.M || fb.i()) && !this.r() && fb.j() == 2 && fb.ib != null && fb.jb != null) {
               if (fb.ib.H == null && this.g == fb.ib.g && this.h == fb.ib.h) {
                  fb.ib.b(this);
               }

               if (fb.jb.H == null && this.g == fb.jb.g && this.h == fb.jb.h) {
                  fb.jb.b(this);
               }
            }

            if (this.yc != null && this.yc.f) {
               this.yc = null;
            }

            if (this.zc != null && this.zc.f) {
               this.zc = null;
            }

            if (this.hb && fb.kb % 2L == 0L) {
               w var8;
               (var8 = new w(
                     fb.mc, super.c / 10 + (ab.oc.nextInt(15) - ab.oc.nextInt(15)), super.d / 10 + (ab.oc.nextInt(15) - ab.oc.nextInt(15)), (byte)2, false, 0
                  ))
                  .h
                  .j = (byte)(10 + ab.oc.nextInt(5));
               var8.l = this.Gb;
            }

            label1107: {
               label948: {
                  q var45;
                  q var10001;
                  label1183: {
                     if (fb.M || fb.i()) {
                        label941: {
                           if (this.Tb) {
                              if (fb.kb - this.Vb < 0L) {
                                 break label941;
                              }

                              this.b((byte)0, new byte[]{-1});
                              if (fb.M) {
                                 fb.I.b(this.w, (byte)0, new byte[]{-1});
                              }

                              this.Vb = fb.kb + 100L;
                              if (!var6) {
                                 break label941;
                              }
                           }

                           if (!this.Wb && fb.kb - this.Vb >= 0L) {
                              this.Wb = true;
                              this.Vb = 0L;
                           }
                        }

                        if (this.Y && fb.kb % 25L == 0L) {
                           int var9;
                           label931: {
                              var9 = this.ab;
                              if (this.Z <= var9) {
                                 var9 = this.Z;
                                 if (!var6) {
                                    break label931;
                                 }
                              }

                              this.Z -= var9;
                           }

                           if (!this.db) {
                              this.b(var9, this.cb, this.bb, false);
                           }

                           if (this.Z <= var9) {
                              this.b(0, 0, 0, false, false, true);
                           }
                        }

                        label885:
                        if (this.fb) {
                           this.gb--;
                           if (this.gb == 0) {
                              this.e((byte)-1, true);
                              if (!var6) {
                                 break label885;
                              }
                           }

                           byte var10 = this.qb == 2 || this.r == 2 && this.qb == 1;
                           if (Vc != null && var10) {
                              byte var21 = y.b(this.ub, this.g);
                              var10 = y.c(this.ub, this.h);
                              q[] var30;
                              if (o.b(var21, var10) && Vc[var21][var10] != 0 && (var30 = b(var21, var10, 2, this)) != null) {
                                 byte var36 = 0;

                                 while (var36 < var30.length) {
                                    var45 = var30[var36];
                                    var10001 = this;
                                    if (var6) {
                                       break label1183;
                                    }

                                    label908:
                                    if (var45 != this
                                       && var30[var36].r != 2
                                       && var30[var36].r != 4
                                       && (this.r != 2 || this.Cc == null || this.Cc.B || var30[var36].x == 0)
                                       && (var30[var36].qb == 0 || var30[var36].qb == 2 || var30[var36].qb == 1)) {
                                       var30[var36].b(var21, var10, this.ub, (byte)6, true, false, true, (byte)0, this.w, (byte)3, (byte)1);
                                       if (var30[var36].qb != 3) {
                                          var30[var36].b(var21, var10, y.d(this.ub), (byte)6, true, false, true, (byte)0, this.w, (byte)3, (byte)1);
                                       }

                                       int var40;
                                       if ((var40 = var30[var36].mc / 2 + this.w()) < 50) {
                                          var40 = 50;
                                       }

                                       if (var30[var36].qb == 3) {
                                          var30[var36].Cb = var40;
                                          if (!var6) {
                                             break label908;
                                          }
                                       }

                                       var30[var36].b(var40, this.w, -1, false);
                                    }

                                    var36++;
                                    if (var6) {
                                       break;
                                    }
                                 }
                              }
                           }
                        }

                        if (this.ib) {
                           this.jb--;
                           if (this.jb <= 0) {
                              this.g((byte)-1, true);
                           }
                        }

                        if (this.kb) {
                           this.lb--;
                           if (this.lb <= 0) {
                              this.f((byte)-1, true);
                           }
                        }
                     }

                     if (this.qb == 0) {
                        if (this.Rb == -1) {
                           break label1107;
                        }

                        this.qb = 1;
                        this.a(this.Rb);
                        this.ub = this.Rb;
                        this.Rb = -1;
                        if (!var6) {
                           break label1107;
                        }
                     }

                     if (this.qb == 1) {
                        if (this.Gc.e) {
                           break label1107;
                        }

                        this.qb = 0;
                        if (this.Sb == 0) {
                           break label1107;
                        }

                        if (this.zc != null) {
                           this.zc.c();
                           this.zc = null;
                        }

                        switch (this.Sb) {
                           case 1:
                              label862:
                              if (this.ub == 0) {
                                 if (this.r == 0) {
                                    if (fb.tc == null || this.ib) {
                                       break label862;
                                    }

                                    this.zc = new w(fb.tc, 0, 0, (byte)4, false, 2);
                                    this.zc.b(this, 0, -4);
                                    this.zc.g = true;
                                    if (!var6) {
                                       break label862;
                                    }
                                 }

                                 if (this.r == 1 && fb.hd != null && !this.ib) {
                                    this.zc = new w(fb.hd, 0, 0, (byte)4, false, 2);
                                    this.zc.b(this, 0, -1);
                                    this.zc.g = true;
                                 }
                              }
                           default:
                              this.Sb = 0;
                              if (!var6) {
                                 break label1107;
                              }
                        }
                     }

                     if (this.qb != 2 && this.qb != 3) {
                        break label1107;
                     }

                     label841:
                     if (!this.Gc.e) {
                        byte var12 = this.N;
                        boolean var22 = false;
                        if (this.qb == 3 && !this.Bb) {
                           var22 = true;
                           var12 = 2;
                        }

                        if (this.qb == 2 || var22) {
                           switch (this.ub) {
                              case 0:
                                 this.Gc.b(I[this.M], true, var22, var12);
                                 if (!var6) {
                                    break label841;
                                 }
                              case 1:
                                 this.Gc.b(J[this.M], true, var22, var12);
                                 if (!var6) {
                                    break label841;
                                 }
                              case 2:
                                 this.Gc.b(K[this.M], true, var22, var12);
                                 if (!var6) {
                                    break label841;
                                 }
                              case 3:
                                 this.Gc.b(L[this.M], true, var22, var12);
                              default:
                                 if (!var6) {
                                    break label841;
                                 }
                           }
                        }

                        if (this.qb == 3 && this.Eb) {
                           this.Gc.b(null, (byte)0, (byte)0, (byte)11, (byte)11, true, ab.oc.nextInt(2) == 0, (byte)0);
                           if (!var6) {
                              break label841;
                           }
                        }

                        if (this.qb == 3 && this.r == 9) {
                           switch (this.ub) {
                              case 0:
                                 this.Gc.b(null, (byte)6, (byte)0, (byte)6, (byte)1, true, false, (byte)0);
                                 if (!var6) {
                                    break;
                                 }
                              case 1:
                                 this.Gc.b(null, (byte)7, (byte)0, (byte)7, (byte)1, true, false, (byte)0);
                                 if (!var6) {
                                    break;
                                 }
                              case 2:
                                 this.Gc.b(null, (byte)8, (byte)0, (byte)8, (byte)1, true, false, (byte)0);
                                 if (!var6) {
                                    break;
                                 }
                              case 3:
                                 this.Gc.b(null, (byte)9, (byte)0, (byte)9, (byte)1, true, false, (byte)0);
                           }
                        }
                     }

                     if (this.g()) {
                        if (this.qb == 2) {
                           this.e(fb.b(this.g, this.h));
                           if (fb.Pd == this) {
                              ab.G.b(ab.X, 0);
                           }
                        }

                        if (this.Lb) {
                           this.Lb = false;
                        }

                        if (this.qb == 3 && this.Bb) {
                           this.Lb = true;
                           this.Mb = 25;
                        }

                        if (this.Cc != null) {
                           this.Cc.h = true;
                        }

                        if ((fb.Pd == this || this.Cc != null) && !this.r() && s.B != null && s.B[this.g][this.h] != 1) {
                           this.b(false, this.g, this.h, false, true);
                        }

                        label772:
                        if (this.qb != 3 && ab.cc) {
                           if (this.Xb == 0) {
                              label803: {
                                 byte var23 = this.h;
                                 byte var13 = this.g;
                                 if (fb.Wd != null) {
                                    int var37 = 0;

                                    while (var37 < fb.Wd.size()) {
                                       d var31;
                                       var46 = (var31 = (d)fb.Wd.elementAt(var37)).h;
                                       if (var6) {
                                          break label803;
                                       }

                                       if (var46 && var31.b / 30 == var13 && var31.c / 30 == var23) {
                                          var46 = true;
                                          break label803;
                                       }

                                       var37++;
                                       if (var6) {
                                          break;
                                       }
                                    }
                                 }

                                 var46 = false;
                              }

                              if (!var46) {
                                 break label772;
                              }

                              this.Xb = 8;
                              if (!var6) {
                                 break label772;
                              }
                           }

                           if (fb.Ec != null) {
                              byte var14;
                              label1122: {
                                 var14 = -1;
                                 if (this.ub == 2) {
                                    var14 = 4;
                                    if (!var6) {
                                       break label1122;
                                    }
                                 }

                                 if (this.ub == 0) {
                                    var14 = 0;
                                    if (!var6) {
                                       break label1122;
                                    }
                                 }

                                 if (this.ub == 1) {
                                    var14 = 2;
                                    if (!var6) {
                                       break label1122;
                                    }
                                 }

                                 if (this.ub == 3) {
                                    var14 = 6;
                                 }
                              }

                              if (var14 >= 0) {
                                 if (this.Xb < 5) {
                                    var14 = (byte)(var14 + 8);
                                 }

                                 this.Xb--;
                                 (new d(new nb(fb.Ec), super.c / 10 - 1 + ab.oc.nextInt(3) - 8, super.d / 10 + 10 + ab.oc.nextInt(5), ab.qc, false))
                                    .e
                                    .b(new byte[]{var14}, false, false, (byte)1);
                                 var14++;
                                 (new d(new nb(fb.Ec), super.c / 10 - 1 + ab.oc.nextInt(3) + 8, super.d / 10 + 4 + ab.oc.nextInt(5), ab.qc, false))
                                    .e
                                    .b(new byte[]{var14}, false, false, (byte)1);
                              }
                           }
                        }
                     }

                     label763:
                     if ((fb.M || fb.i()) && this.Lb && this.Gb / 10 <= 2 && s.B != null && b(this.g, this.h) && s.B[this.g][this.h] == 1) {
                        this.Lb = false;
                        byte var32 = this.h;
                        byte var24 = this.g;
                        q var16 = this;
                        g var38 = g.b(var24, var32);
                        boolean var41 = true;
                        if (var38 != null) {
                           if (var38.d == 2) {
                              s var44;
                              if ((var44 = s.b(var24, var32)) != null && var44.u == 1) {
                                 var44.t.b(false, false, (byte)2);
                              }

                              if (fb.M || fb.i()) {
                                 var16.b(var24, var32, var38.e[0], var38.e[1], true, false, true, (byte)0, (byte)-1, (byte)1, (byte)0);
                              }
                              break label763;
                           }

                           var41 = false;
                           if (!var6) {
                              break label763;
                           }
                        }

                        var41 = false;
                     }

                     if (this.qb == 2) {
                        if (this.vb < this.wb) {
                           this.vb = this.vb + this.wb / 10;
                           if (this.vb < this.wb) {
                              break label948;
                           }
                        } else {
                           if (this.vb <= this.wb) {
                              break label948;
                           }

                           this.vb = this.vb - this.wb / 10;
                           if (this.vb > this.wb) {
                              break label948;
                           }
                        }
                     }

                     var45 = this;
                     var10001 = this;
                  }

                  var45.vb = var10001.wb;
               }

               byte var17 = this.ub;
               if (this.qb == 3) {
                  var17 = this.yb;
               }

               switch (var17) {
                  case 0:
                     this.l = 0;
                     this.m = this.vb;
                     if (!var6) {
                        break;
                     }
                  case 1:
                     this.l = -this.vb;
                     this.m = 0;
                     if (!var6) {
                        break;
                     }
                  case 2:
                     this.l = 0;
                     this.m = -this.vb;
                     if (!var6) {
                        break;
                     }
                  case 3:
                     this.l = this.vb;
                     this.m = 0;
               }

               this.xb = this.xb + this.vb;
               label651:
               if (this.xb > 300) {
                  if (this.Kb) {
                     this.Kb = false;
                  }

                  label723:
                  if (this.qb == 3) {
                     this.Ab--;
                     if (this.Ab <= 0) {
                        this.rb = true;
                        if (!var6) {
                           break label723;
                        }
                     }

                     this.rb = false;
                  }

                  if (!this.rb) {
                     this.rb = !this.b(this.g, this.h, var17);
                  }

                  label716:
                  if (this.qb == 3 && this.Ab > 0) {
                     if (this.Bb) {
                        this.rb = false;
                        if (!var6) {
                           break label716;
                        }
                     }

                     if (this.rb) {
                        byte var25 = y.b(this.yb, this.g);
                        var17 = y.c(this.yb, this.h);
                        g var33;
                        if ((var33 = g.b(var25, var17)) != null && var33.d == 6) {
                           this.rb = false;
                        }

                        if (this.rb && (fb.M || fb.i()) && o.b(var25, var17) && fb.Re[var25][var17].d != null && this.Fb != 0) {
                           this.Cb = 15;
                           this.b(this.Fb);
                           this.Fb = 0;
                        }
                     }
                  }

                  if ((this.qb == 2 || this.qb == 3 && !this.Bb) && s.B != null) {
                     byte var26;
                     var17 = y.b(var26 = this.qb == 3 ? this.yb : this.ub, this.g);
                     byte var34 = y.c(var26, this.h);
                     if (b(var17, var34) && s.B[var17][var34] == 1) {
                        boolean var39;
                        label1126: {
                           var39 = true;
                           if (!fb.M && !fb.i()) {
                              if (fb.Pd != this || this.hc) {
                                 var39 = false;
                              }

                              if (!var39) {
                                 break label1126;
                              }

                              fb.I.c(this.w, this.g, this.h);
                              if (!var6) {
                                 break label1126;
                              }
                           }

                           if ((fb.M || fb.i()) && !this.hc) {
                              var39 = false;
                              if (fb.Pd == this || this.Cc != null) {
                                 var39 = true;
                              }
                           }
                        }

                        if (this.qb == 2 && this.rb) {
                           var39 = false;
                        }

                        if (var39 && s.b(var17, var34) != null) {
                           this.b(false, var17, var34, false, true);
                        }
                     }
                  }

                  if (this.sb != -1 && this.g == this.sb && this.h == this.tb) {
                     this.sb = this.tb = -1;
                     this.rb = true;
                  }

                  if (this.qb == 2 && this.hc && !this.rb) {
                     if (fb.Pd == this) {
                        fb.I.e();
                     }

                     this.rb = true;
                  }

                  if ((fb.M || fb.i()) && this.Ub > 0) {
                     this.rb = true;
                  }

                  if (this.Nb && !this.rb) {
                     this.Nb = false;
                  }

                  if (this.rb) {
                     this.j();
                     if (this.Ub > 0) {
                        this.s();
                        if (!var6) {
                           break label651;
                        }
                     }

                     if (fb.i() || fb.Pd != this && this.Cc == null) {
                        break label651;
                     }

                     fb.I.c(this.w, this.g, this.h);
                     if (!var6) {
                        break label651;
                     }
                  }

                  this.D = this.D + ab.gb[this.ub];
                  this.E = this.E + ab.hb[this.ub];
                  this.xb -= 300;
                  if (this.qb == 2 || this.qb == 3 && !this.Bb) {
                     this.c();
                  }
               }
            }

            super.h();
            this.Gc.c();
         }
      }

      q var20;
      q var47;
      label631: {
         var20 = this;
         this.Ic.c();
         var20.Jc.c();
         var20.Kc.c();
         if (fb.kb % 2L == 0L) {
            int var27 = 0;

            while (var27 < var20.Sc.length) {
               var47 = var20;
               if (var6) {
                  break label631;
               }

               if (var20.Sc[var27] != -1) {
                  if (var20.Tc[var27] > var20.Sc[var27]) {
                     var20.Tc[var27]--;
                  }

                  if (var20.Tc[var27] < var20.Sc[var27]) {
                     var20.Tc[var27]++;
                  }

                  if (var20.Tc[var27] == var20.Sc[var27]) {
                     var20.Sc[var27] = -1;
                  }
               }

               var27++;
               if (var6) {
                  break;
               }
            }
         }

         var47 = var20;
      }

      int var35;
      label618: {
         int var28 = var47.c / 10 - var20.Nc;
         var35 = var20.d / 10 - var20.Oc - 30 - var20.Ib;
         if (Math.abs(var28) < 3) {
            var20.Nc = var20.c / 10;
            if (!var6) {
               break label618;
            }
         }

         var20.Nc += var28 / 3;
      }

      label613: {
         if (Math.abs(var35) < 3) {
            var20.Oc = var20.d / 10 - 30 - var20.Ib;
            if (!var6) {
               break label613;
            }
         }

         var20.Oc += var35 / 3;
      }

      label1173: {
         if (var20.Pc) {
            if (fb.kb - var20.Rc < 0L) {
               if (var20.Ic.j == 0 && var20.Qc) {
                  var20.Qc = false;
                  var20.b(true);
               }
            } else if (!var20.Ic.e) {
               if (var20.Ic.j != 0) {
                  break label1173;
               }

               var20.Ic.b((byte)7, (byte)3);
               var20.Jc.b((byte)7, (byte)3);
               var20.Kc.b((byte)7, (byte)3);
               int var29 = 0;

               while (var29 < var20.Sc.length) {
                  label603: {
                     if (var20.Uc[var29] == 2) {
                        var20.Sc[var29] = 7;
                        if (!var6) {
                           break label603;
                        }
                     }

                     var20.Sc[var29] = 15;
                  }

                  var29++;
                  if (var6) {
                     break label1173;
                  }
               }
            }
         }

         return;
      }

      var20.Pc = false;
   }

   public final void b(Graphics var1) {
      boolean var5 = ab.xc;
      if (this.mb != 0 || this.r() || fb.Re[this.g][this.h].d == null) {
         if (!this.ib || this.ib && fb.Pd == this) {
            pb var2 = fb.Ob;
            if (this.r == 2) {
               var2 = fb.Qb;
            }

            if (this.r == 3) {
               var2 = fb.Pb;
            }

            if (var2 != null) {
               byte var3;
               if ((var3 = (byte)(this.Ib / 20)) > 3) {
                  var3 = 3;
               }

               if (this.ib) {
                  var3 = 3;
               }

               var2.b = var3;
               var2.b(super.c / 10 - fb.Ge - var2.d / 2, super.d / 10 + 7 - var2.e / 2 - fb.He);
               var2.b(var1);
            }
         }

         if (this.mb == 0) {
            byte var6 = 0;
            byte var7 = 0;
            if (this.qc != 0) {
               switch (this.ub) {
                  case 0:
                     var7 = (byte)(-this.qc);
                     if (!var5) {
                        break;
                     }
                  case 1:
                     var6 = this.qc;
                     if (!var5) {
                        break;
                     }
                  case 2:
                     var7 = this.qc;
                     if (!var5) {
                        break;
                     }
                  case 3:
                     var6 = (byte)(-this.qc);
               }
            }

            if (this.o() && this.fb && fb.Rb != null && this.Ib < 20) {
               fb.Rb.b = 0;
               fb.Rb.b(super.c / 10 - fb.Ge - fb.Rb.d / 2, super.d / 10 - fb.Rb.e / 2 + 5 - fb.He);
               fb.Rb.b(var1);
            }

            if (!this.ib || this.ib && fb.Pd == this) {
               if (!this.ib) {
                  this.Gc.b(var1, super.c / 10 - fb.Ge + var6, super.d / 10 - fb.He - this.Ib + var7);
               }

               if (this.o()) {
                  if (this.zc != null && this.zc.g) {
                     this.zc.b(var1);
                  }

                  label100:
                  if (this.r == 0 && this.nc >= 0) {
                     if (fb.fe != null && fb.ge != null) {
                        if (this.nc >= 2 * this.mc / 3) {
                           break label100;
                        }

                        fb.fe.b(var1, this);
                        if (this.nc >= this.mc / 2) {
                           break label100;
                        }

                        fb.ge.b(var1, this);
                        if (!var5) {
                           break label100;
                        }
                     }

                     if (fb.fe != null && this.nc < this.mc / 2) {
                        fb.fe.b(var1, this);
                     }
                  }

                  if (!this.ib && this.Mc != null) {
                     this.Mc.b(var1, this);
                  }

                  if (this.Lc != null) {
                     this.Lc.b(var1, this);
                  }
               }
            }
         } else {
            if ((this.mb == 1 || this.mb == 2) && this.Hc != null) {
               this.Hc.b(var1, super.c / 10 - fb.Ge, super.d / 10 - fb.He - this.Ib);
            }
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public final void a(Graphics var1) {
      boolean var6 = ab.xc;
      if (this.r == 0 && this.mb == 0 && fb.kb - this.jc <= this.kc && !this.Pc) {
         this.c(1);
      }

      int var12;
      label137: {
         label136:
         if (this.Pc && this.mb == 0 && this.Uc != null) {
            byte var2 = 0;
            byte var4 = 0;
            byte var3 = 0;

            int var10001;
            label131: {
               while (var3 < this.Uc.length) {
                  var12 = this.Uc[var3];
                  var10001 = -1;
                  if (var6) {
                     break label131;
                  }

                  label127:
                  if (var12 != -1) {
                     if (var3 < 6) {
                        var2++;
                        if (!var6) {
                           break label127;
                        }
                     }

                     var4 = 5;
                     if (!var6) {
                        break;
                     }
                  }

                  var3++;
                  if (var6) {
                     break;
                  }
               }

               var12 = var2 - 2;
               var10001 = this.Jc.c;
            }

            int var5 = var12 * var10001;
            this.Ic.b(var1, this.Nc - fb.Ge + 1 - var5 / 2 - this.Ic.c / 2 - 1, this.Oc - fb.He - var4);
            var3 = 0;

            label113: {
               while (var3 < var2 - 2) {
                  this.Jc.b(var1, this.Nc - fb.Ge + 1 - var5 / 2 + this.Jc.c / 2 + var3 * this.Jc.c, this.Oc - fb.He - var4);
                  var3++;
                  if (var6) {
                     break label113;
                  }

                  if (var6) {
                     break;
                  }
               }

               this.Kc.b(var1, this.Nc - fb.Ge + 1 + var5 / 2 + this.Ic.c / 2, this.Oc - fb.He - var4);
            }

            label144: {
               if (var2 > 0) {
                  var9 = fb.gc;
                  var3 = 0;

                  while (var3 < 6) {
                     var11 = this.Tc[var3];
                     var10001 = -1;
                     if (var6) {
                        break label144;
                     }

                     if (var11 == -1) {
                        break;
                     }

                     if (this.Uc[var3] == 1 || this.Uc[var3] == 2) {
                        var9.b = this.Tc[var3];
                        var9.b(this.Nc + 1 - fb.Ge - var2 * this.Jc.c / 2 + var3 * 6, this.Oc - fb.He - var9.e / 2 - var4);
                        var9.b(var1);
                     }

                     var3++;
                     if (var6) {
                        break;
                     }
                  }
               }

               if (var4 == 0) {
                  break label136;
               }

               var5 = this.Jc.c;
               this.Ic.b(var1, this.Nc - fb.Ge + 1 - var5 / 2 - this.Ic.c / 2 - 1, this.Oc - fb.He + var4);
               this.Jc.b(var1, this.Nc - fb.Ge + 1 - var5 / 2 + this.Jc.c / 2, this.Oc - fb.He + var4);
               this.Kc.b(var1, this.Nc - fb.Ge + 1 + var5 / 2 + this.Ic.c / 2, this.Oc - fb.He + var4);
               var9 = fb.ic;
               var3 = 6;
               var11 = var3;
               var10001 = this.Uc.length;
            }

            while (var11 < var10001) {
               var12 = this.Tc[var3];
               if (var6) {
                  break label137;
               }

               if (var12 == -1) {
                  break;
               }

               if (this.Uc[var3] == 1 || this.Uc[var3] == 2) {
                  var9.b = this.Tc[var3];
                  var9.b(this.Nc + 1 - fb.Ge - this.Jc.c / 2 + (var3 - 7) * 6, this.Oc - fb.He - var9.e / 2 + var4);
                  var9.b(var1);
               }

               var3++;
               if (var6) {
                  break;
               }

               var11 = var3;
               var10001 = this.Uc.length;
            }
         }

         var12 = fb.I.kf;
      }

      if (var12 != 0) {
         var1.setColor(16777215);
         var1.drawString(
            "hp=" + this.nc + "/" + this.mc + "; p=" + (this.Y ? 1 : 0) + "; f=" + (this.Tb ? 1 : 0), super.c / 10 - fb.Ge, super.d / 10 - fb.He - 50, 17
         );
      }
   }

   private void b(byte var1, boolean var2, boolean var3) {
      boolean var4 = ab.xc;
      if (this.r == 6) {
         this.Lc = null;
         this.Mc = fb.ie;
      } else if (this.r == 7) {
         this.Lc = null;
         this.Mc = fb.je;
      } else if (this.r == 5) {
         this.Lc = null;
         this.Mc = fb.ke;
      } else if (var1 == 0) {
         this.Lc = null;
         this.Mc = null;
      } else {
         label104:
         if (var1 == 1) {
            if (var2) {
               if (this.ib) {
                  return;
               }

               this.Lc = fb.ce;
               if (!var4) {
                  break label104;
               }
            }

            if (var3) {
               this.Lc = null;
            }

            if (this.ib) {
               var1 = 2;
               var2 = true;
            }

            if (this.Y && this.eb) {
               var1 = 3;
               var2 = true;
            }
         }

         label97:
         if (var1 == 2) {
            if (var2) {
               if (this.fb) {
                  return;
               }

               this.Lc = fb.de;
               if (!var4) {
                  break label97;
               }
            }

            if (var3) {
               this.Lc = null;
            }

            if (this.Y && this.eb) {
               var1 = 3;
               var2 = true;
            }
         }

         label88:
         if (var1 == 5) {
            if (var2) {
               if (this.fb || this.ib) {
                  return;
               }

               this.Lc = fb.he;
               if (!var4) {
                  break label88;
               }
            }

            if (var3) {
               this.Lc = null;
            }

            if (this.Y && this.eb) {
               var1 = 3;
               var2 = true;
            }
         }

         if (var1 == 3) {
            if (var2) {
               if (this.Lc != null) {
                  return;
               }

               this.Lc = fb.ee;
               return;
            }

            if (this.Lc == fb.ee) {
               this.Lc = null;
            }
         }
      }
   }

   public final void b(String var1) {
      this.y = ab.c(var1);
      this.z = ab.b(var1, ab.D - 80, ab.C);
   }

   public final int t() {
      if (ab.g()) {
         return this.x == 0 ? 7 : 2;
      } else {
         return this.x % 9;
      }
   }

   public final String u() {
      return "^" + this.t() + "~ ";
   }

   public final int v() {
      int var1;
      label67: {
         boolean var2 = ab.xc;
         if (this.r == 0) {
            var1 = 90 + 30 * this.ac[0];
            if (!var2) {
               break label67;
            }
         }

         if (this.r == 1) {
            var1 = 90;
            if (!var2) {
               break label67;
            }
         }

         if (this.r == 3) {
            var1 = 50;
            if (!var2) {
               break label67;
            }
         }

         if (this.r != 2) {
            if (this.r == 4) {
               var1 = 240;
               if (!var2) {
                  break label67;
               }
            }

            if (this.r == 5) {
               var1 = 90;
               if (!var2) {
                  break label67;
               }
            }

            if (this.r == 6) {
               var1 = 120;
               if (!var2) {
                  break label67;
               }
            }

            if (this.r == 7) {
               var1 = 90;
               if (!var2) {
                  break label67;
               }
            }

            if (this.r == 8) {
               var1 = 90;
               if (!var2) {
                  break label67;
               }
            }

            if (this.r == 9) {
               var1 = 30;
               if (!var2) {
                  break label67;
               }
            }
         }

         var1 = -1;
      }

      if (var1 != -1 && fb.i() && this != fb.Pd) {
         var1 = var1 * (100 + ab.s * 15) / 100;
      }

      return var1;
   }

   public static int b(q var0, int var1) {
      int var2;
      label145: {
         boolean var3 = ab.xc;
         var2 = 0;
         if (var1 == 0) {
            var2 = 90;
            if (var0 == null) {
               break label145;
            }

            var2 = 90 + 25 * var0.ac[2];
            if (!var3) {
               break label145;
            }
         }

         if (var1 == 1) {
            var2 = 120;
            if (var0 == null) {
               break label145;
            }

            var2 = 120 + 30 * var0.ac[2];
            if (!var3) {
               break label145;
            }
         }

         if (var1 == 3) {
            var2 = 40;
            if (var0 == null) {
               break label145;
            }

            var2 = 40 + 10 * var0.ac[4];
            if (!var3) {
               break label145;
            }
         }

         if (var1 == 4) {
            var2 = 50;
            if (var0 == null) {
               break label145;
            }

            var2 = 50 + 15 * var0.ac[4];
            if (!var3) {
               break label145;
            }
         }

         if (var1 == 5) {
            var2 = 60;
            if (var0 == null) {
               break label145;
            }

            var2 = 60 + 15 * var0.ac[5];
            if (!var3) {
               break label145;
            }
         }

         if (var1 == 6) {
            var2 = 90;
            if (var0 == null) {
               break label145;
            }

            var2 = 90 + 20 * var0.ac[5];
            if (!var3) {
               break label145;
            }
         }

         if (var1 == 2) {
            var2 = 15;
            if (var0 == null) {
               break label145;
            }

            var2 = 15 + 15 * var0.ac[3];
            if (!var3) {
               break label145;
            }
         }

         if (var1 == 11) {
            var2 = 60;
            if (var0 == null) {
               break label145;
            }

            var2 = 60 + 60 * var0.ac[8];
            if (!var3) {
               break label145;
            }
         }

         if (var1 == 9) {
            var2 = 90;
            if (var0 == null) {
               break label145;
            }

            var2 = 90 + 45 * var0.ac[7];
            if (!var3) {
               break label145;
            }
         }

         if (var1 == 7) {
            var2 = 90;
            if (var0 == null) {
               break label145;
            }

            var2 = 90 + 25 * var0.ac[6];
            if (!var3) {
               break label145;
            }
         }

         if (var1 == 8) {
            var2 = 120;
            if (var0 == null) {
               break label145;
            }

            var2 = 120 + 30 * var0.ac[6];
            if (!var3) {
               break label145;
            }
         }

         if (var1 == 12) {
            var2 = 90;
            if (!var3) {
               break label145;
            }
         }

         if (var1 == 13) {
            var2 = 60;
            if (!var3) {
               break label145;
            }
         }

         if (var1 == -4) {
            var2 = 5;
            if (!var3) {
               break label145;
            }
         }

         if (var1 == -5) {
            var2 = 30;
            if (!var3) {
               break label145;
            }
         }

         if (var1 == -6) {
            var2 = 45;
            if (!var3) {
               break label145;
            }
         }

         if (var1 == 10) {
            var2 = 6;
         }
      }

      if (fb.i() && var0 != fb.Pd) {
         var2 = (10 + ab.s) * var2 / 10;
      }

      return var2;
   }

   public static int c(q var0) {
      int var1 = 2;
      if (var0 != null) {
         var1 = 2 + 2 * var0.ac[8];
      }

      return var1;
   }

   public static int c(q var0, int var1) {
      if (var1 == 2) {
         var1 = 6;
         if (var0 != null) {
            var1 = 6 + 3 * var0.ac[3];
         }

         return var1;
      } else {
         return 0;
      }
   }

   private int w() {
      try {
         return 0 + 30 * this.ac[9];
      } catch (Exception var1) {
         return 0;
      }
   }

   public final int x() {
      return 30 + 30 * this.ac[10];
   }

   static {
      byte[] var10000 = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
   }
}
