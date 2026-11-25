public final class y {
   public static boolean b;
   private static String[] c = new String[]{
      "Major",
      "Mr.Pip",
      "Rookie",
      "Xxxnator",
      "Kruger",
      "pipyaka",
      "Baba-Jaga",
      "p10ner",
      "ProNoob",
      "Butthead",
      "General",
      "Botters",
      "XYZB0T",
      "Catchme",
      "YellowButt",
      "YellowHead",
      "Brainless",
      "Bugman",
      "Mr.Head",
      "c001b0t",
      "Cpt.Death",
      "HumanKiller",
      "R.I.P.",
      "upyachka",
      "SuppaBOT",
      "Ikillyou",
      "iddqd",
      "headshot!",
      "ONOTOLE",
      "DSS-b0t"
   };
   private q d;
   private long e;
   private boolean f;
   private long g;
   public boolean h;
   private boolean i;
   private byte j;
   public int k;
   private byte l;
   private long m;
   private boolean n;
   private int o;
   private int p;
   public byte q;
   public byte r;
   private byte s;
   private static byte t = 1;
   private byte u;
   private byte v;
   private byte w;
   private byte x;
   private int y;
   public int z;
   private boolean A;
   public boolean B;
   private boolean C;
   private boolean D;
   private boolean E;
   public boolean F;
   private boolean G;
   private q H;
   private byte I;
   private byte J;
   private boolean K;
   private long L;
   private short M;
   public static int[] N = new int[14];
   public static short[][] O;
   public static short[][] P;
   private static g Q;
   private static g R;
   public static byte S;
   public static byte T;
   public static byte U;
   public static byte V;
   private int W;
   private int X;
   private short[][] Y;
   private boolean Z;
   private int ab;
   private static boolean bb = false;

   public y(q var1, int var2) {
      boolean var8;
      int var17;
      label173: {
         label172: {
            var8 = ab.xc;
            super();
            this.A = true;
            this.B = true;
            this.C = true;
            this.D = true;
            this.E = true;
            this.Z = false;
            this.ab = -1;
            this.d = var1;
            this.k = var2;
            this.d.y = "";
            this.d.z = "";
            if (!fb.i()) {
               String[] var9 = new String[fb.Qd.size()];
               var2 = 0;

               while (var2 < fb.Qd.size()) {
                  var9[var2] = ((q)fb.Qd.elementAt(var2)).y;
                  var2++;
                  if (var8) {
                     break label172;
                  }

                  if (var8) {
                     break;
                  }
               }

               String var13 = "";
               int var3 = (1 + this.k / 3) * c.length / 3 - c.length / 3;
               int var5 = 999;

               label160:
               while (true) {
                  var17 = var5;

                  label156:
                  while (true) {
                     if (var17 <= 0) {
                        break label160;
                     }

                     int var4 = var3 + ab.oc.nextInt(c.length / 3);
                     var13 = c[var4];
                     var4 = 0;

                     label133: {
                        while (var4 < var9.length) {
                           var17 = var9[var4].startsWith(var13);
                           if (var8) {
                              break label133;
                           }

                           if (var17 != 0) {
                              var4 = -1;
                              if (!var8) {
                                 break;
                              }
                           }

                           var4++;
                           if (var8) {
                              break;
                           }
                        }

                        var17 = var4;
                     }

                     if (var17 != -1) {
                        break label160;
                     }

                     if (--var5 != 0) {
                        continue label160;
                     }

                     var17 = 0;
                     if (var8) {
                        break label173;
                     }

                     int var6 = 0;

                     while (true) {
                        if (var6 >= c.length / 3) {
                           break label156;
                        }

                        var4 = var3 + var6;
                        var17 = 0;
                        if (var8) {
                           break;
                        }

                        int var7 = 0;

                        label151: {
                           while (var7 < var9.length) {
                              var17 = var9[var7].startsWith(var13);
                              if (var8) {
                                 break label151;
                              }

                              if (var17 != 0) {
                                 var4 = -1;
                                 if (!var8) {
                                    break;
                                 }
                              }

                              var7++;
                              if (var8) {
                                 break;
                              }
                           }

                           var17 = var4;
                        }

                        if (var17 != -1) {
                           break label156;
                        }

                        var6++;
                        if (var8) {
                           break label156;
                        }
                     }
                  }

                  if (var8) {
                     break;
                  }
               }

               this.d.y = var13;
               StringBuffer var10001 = new StringBuffer();
               q var19 = this.d;
               var10001 = var10001.append(this.d.y);
               int var10 = this.k;
               var19.y = var10001.append(this.k >= 3 && var10 <= 5 ? "^25~" : (var10 >= 6 ? "^26~" : "^24~")).toString();
               this.d.b(this.d.y);
               if (this.k == 8) {
                  this.F = true;
               }

               c(this.d);
            }

            this.l = 8;
            this.z = 0;
         }

         var17 = this.e();
      }

      if (var17 || fb.i()) {
         var11 = this;
         this.l = 8;
         var11.z = 2;
         var11.M = 25;
         label91:
         if (var11.d.r == 1 || var11.d.r == 0) {
            c(var11.d);
            if (var11.d.r == 1) {
               var11.d.bc = 12;
               if (!var8) {
                  break label91;
               }
            }

            if (var11.d.r == 0) {
               var11.d.bc = 0;
               if (var11.k >= 6) {
                  var11.d.bc = 1;
               }
            }
         }

         if (var11.d.r == 3) {
            var11.M = 50;
         }

         if (var11.d.r == 4) {
            var11.M = 25;
         }

         if (var11.d.r == 5) {
            var11.M = 0;
         }

         if (var11.d.r == 7) {
            c(var11.d);
            var11.d.cc = 13;
         }

         if (var11.d.r == 6) {
            var11.M = 100;
         }

         if (var11.d.r == 9) {
            var11.M = 50;
         }

         var11.d.mc = var11.d.v();
      }

      this.b();
      b = true;
   }

   public static byte b(byte var0, byte var1) {
      byte var2 = var1;
      switch (var0) {
         case 1:
            var2 = (byte)(var1 - 1);
            if (!ab.xc) {
               break;
            }
         case 3:
            var2 = (byte)(var1 + 1);
      }

      return var2;
   }

   public static byte c(byte var0, byte var1) {
      byte var2 = var1;
      switch (var0) {
         case 0:
            var2 = (byte)(var1 + 1);
            if (!ab.xc) {
               break;
            }
         case 2:
            var2 = (byte)(var1 - 1);
      }

      return var2;
   }

   public static byte d(byte var0, byte var1) {
      byte var2 = var1;
      switch (var0) {
         case 1:
            var2 = (byte)(var1 + 1);
            if (!ab.xc) {
               break;
            }
         case 3:
            var2 = (byte)(var1 - 1);
      }

      return var2;
   }

   public static byte e(byte var0, byte var1) {
      byte var2 = var1;
      switch (var0) {
         case 0:
            var2 = (byte)(var1 - 1);
            if (!ab.xc) {
               break;
            }
         case 2:
            var2 = (byte)(var1 + 1);
      }

      return var2;
   }

   private static byte b(byte var0, byte var1, byte var2) {
      byte var3 = var1;
      switch (var0) {
         case 1:
            var3 = (byte)(var1 - var2);
            if (!ab.xc) {
               break;
            }
         case 3:
            var3 = (byte)(var1 + var2);
      }

      return var3;
   }

   private static byte c(byte var0, byte var1, byte var2) {
      byte var3 = var1;
      switch (var0) {
         case 0:
            var3 = (byte)(var1 + var2);
            if (!ab.xc) {
               break;
            }
         case 2:
            var3 = (byte)(var1 - var2);
      }

      return var3;
   }

   public static byte b(byte var0, byte var1, byte var2, byte var3) {
      if (var0 > var2) {
         return 1;
      } else if (var2 > var0) {
         return 3;
      } else if (var1 > var3) {
         return 2;
      } else {
         return (byte)(var3 > var1 ? 0 : -1);
      }
   }

   public static byte b(byte var0) {
      return (byte)(Math.abs(var0 - 1 + 4) % 4);
   }

   public static byte c(byte var0) {
      return (byte)(Math.abs(var0 + 1) % 4);
   }

   public static byte d(byte var0) {
      return (byte)(Math.abs(var0 + 2) % 4);
   }

   public static boolean b(int var0, int var1) {
      return o.b((byte)var0, (byte)var1) && fb.bf[var0][var1] != 0;
   }

   private static boolean f(byte var0, byte var1) {
      return !o.b(var0, var1) ? false : s.B != null && s.B[var0][var1] == 1;
   }

   private void a() {
      this.s = 0;
      this.u = -1;
      this.v = -1;
      this.w = -1;
      this.x = 0;
   }

   public final void b() {
      label28: {
         if (this.e()) {
            if (this.d.r == 2) {
               this.B = false;
            }

            if (this.d.r != 4) {
               break label28;
            }

            this.D = false;
            this.A = false;
            if (!ab.xc) {
               break label28;
            }
         }

         if (!fb.i()) {
            this.d(0);
         }
      }

      this.a();
      this.b(10);
      this.h = true;
      if (this.E && ab.m == 2 && !fb.i()) {
         this.d.Ec = false;
         this.b(true);
      }
   }

   private void b(int var1) {
      if (var1 > 0) {
         this.e = fb.kb + var1;
      }
   }

   private void c(int var1) {
      if (var1 > 0) {
         this.m = fb.kb + var1;
      }
   }

   private boolean e(byte var1) {
      boolean var2 = false;
      if (var1 != this.d.ub && this.k <= 5) {
         var2 = true;
         if (this.k >= 3) {
            var2 = ab.oc.nextInt(6 - this.k) == 0;
         }
      }

      return this.b(var1, var2);
   }

   private boolean b(byte var1, boolean var2) {
      if (this.d.hc) {
         return false;
      }

      label29: {
         if (this.d.ub != var1) {
            this.c();
            if (!var2) {
               break label29;
            }

            this.g = 0L;
            if (!ab.xc) {
               break label29;
            }
         }

         if (!this.A) {
            return false;
         }
      }

      this.f = false;
      if (System.currentTimeMillis() - this.g < 300L) {
         this.g = System.currentTimeMillis();
         this.f = true;
      }

      var2 = this.d.b(var1, this.f);
      if (fb.M && var2) {
         fb.I.b(this.d.w, this.d.g, this.d.h, var1, this.f);
      }

      return var2;
   }

   private void c() {
      if (this.d != null && !this.d.hc) {
         this.g = System.currentTimeMillis();
         this.d.i();
      }
   }

   private void f(byte var1) {
      if (this.d != null && !this.d.hc && this.d.ub != var1 && this.d.qb != 1) {
         this.b(var1, true);
         this.g = 0L;
      }
   }

   public final boolean b(byte var1, int var2) {
      if (var2 == -1) {
         return false;
      }

      int var3;
      if ((var3 = this.d.b((byte)var2, false, this.d.g, this.d.h, null)) == 0 && var1 != -1 && hb.b((byte)var2) && this.d(this.d.g, this.d.h, var1)) {
         byte var5 = var1;
         y var4 = this;
         this.s = t;
         var4.u = var4.d.g;
         var4.v = var4.d.h;
         var4.w = var5;
         var4.x = 0;
         if (fb.i()) {
            var4.c();
            var4.b(4);
            if (!ab.xc) {
               return var3 == 0;
            }
         }

         if (var4.k <= 2) {
            var4.c();
            var4.b(3 - var4.k);
         }
      }

      return var3 == 0;
   }

   public final boolean d() {
      boolean var6 = ab.xc;
      if (this.d.r == 2) {
         return false;
      }

      if (fb.kb - this.L >= 0L && this.d.qb != 1) {
         if (this.d.r == 3) {
            hb.b((byte)-4, this.d.g, this.d.h, this.d, null);
            this.d.b(30, 8);
         }

         if (this.d.r == 4) {
            hb.b((byte)-5, this.d.g, this.d.h, this.d, null);
            this.d.qc = 10;
            if (fb.Kc != null) {
               byte var1 = 0;
               byte var2 = 0;
               byte var3 = 0;
               byte var4 = 0;
               switch (this.d.ub) {
                  case 0:
                     var1 = 0;
                     var2 = 15;
                     var3 = 0;
                     var4 = 10;
                     if (!var6) {
                        break;
                     }
                  case 1:
                     var1 = -20;
                     var2 = 0;
                     var3 = -10;
                     var4 = 0;
                     if (!var6) {
                        break;
                     }
                  case 2:
                     var1 = 0;
                     var2 = -20;
                     var3 = 0;
                     var4 = -10;
                     if (!var6) {
                        break;
                     }
                  case 3:
                     var1 = 20;
                     var2 = 0;
                     var3 = 10;
                     var4 = 0;
               }

               q var5 = this.d;
               int var10005 = this.d.c / 10 + var1;
               var5 = this.d;
               t var7;
               (var7 = new t((byte)1, fb.Kc, 0, var10005, this.d.d / 10 + var2, var3, var4)).A = 50;
               if (this.d.ub == 1) {
                  var7.D = true;
               }
            }
         }

         if (this.d.r == 5) {
            q var9 = this.d;
            int var10002 = this.d.c / 10 + 10;
            var9 = this.d;
            p.b((byte)6, (byte)3, var10002, this.d.d / 10 + 5, 0, this.d.mc, null, null, -1);
            if (o.c(this.d.g, this.d.h)) {
               ab.G.b(ab.R, 0);
            }

            if (fb.Hc != null) {
               new d(fb.Hc, (byte)ab.oc.nextInt(fb.Hc.h), this.d.h, this.d.g, ab.rc);
            }
         }

         if (this.d.r == 6) {
            hb.b((byte)-6, this.d.g, this.d.h, this.d, null).z = this.H;
         }

         if (this.d.r == 8) {
            this.d.a(fb.Pd.g, fb.Pd.h);
         }

         if (this.d.r == 9) {
            this.d.b(this.d.g, this.d.h, this.J, this.I, true, true, false, (byte)3, (byte)-1, (byte)0, (byte)0);
         }

         this.L = fb.kb + this.M;
         return true;
      } else {
         return false;
      }
   }

   public final boolean e() {
      return this.d.r == 2 || this.d.r == 3 || this.d.r == 6 || this.d.r == 5 || this.d.r == 8 || this.d.r == 9;
   }

   public final boolean f() {
      return this.d.r == 4;
   }

   public final boolean b(q var1) {
      return b(var1, this.d);
   }

   public static boolean b(q var0, q var1) {
      if (var1 == null) {
         return true;
      }

      if (ab.g()) {
         if (var0.x == -1) {
            if (var0.Cc != null && var0.r == 2 && var0.Cc.B) {
               return true;
            } else {
               return var0.r == 3 ? var1.x != -1 : false;
            }
         } else {
            return var1.x != var0.x;
         }
      } else {
         return true;
      }
   }

   private boolean g(byte var1) {
      return var1 < 0 ? false : this.d.Yb[var1] != 0;
   }

   private boolean b(byte var1, byte var2, boolean var3) {
      boolean var5 = ab.xc;
      if (this.d.g != var1 && this.d.h != var2) {
         return false;
      }

      byte var4;
      if ((var4 = (byte)o.b(var1, var2, this.d.g, this.d.h)) <= 1) {
         return true;
      }

      if (var3 && var4 > this.l) {
         return false;
      }

      var1 = b(this.d.g, this.d.h, var1, var2);
      var2 = 1;

      boolean var10000;
      while (true) {
         if (var2 < var4) {
            var10000 = b((int)b(var1, this.d.g, var2), (int)c(var1, this.d.h, var2));
            if (var5) {
               break;
            }

            if (!var10000) {
               return false;
            }

            var2++;
            if (!var5) {
               continue;
            }
         }

         var10000 = true;
         break;
      }

      return var10000;
   }

   private boolean d(byte var1, byte var2, byte var3) {
      if (var3 >= 0 && var3 <= 3 && this.A) {
         if ((var1 = (byte)o.b(var1, var2, this.d.g, this.d.h)) > 1) {
            return false;
         }

         if (var1 == 0) {
            var1 = b(d(var3), this.d.g);
            var2 = c(d(var3), this.d.h);
            if (this.d.b(this.d.g, this.d.h, d(var3))) {
               if (this.k < 2) {
                  return true;
               }

               if (!f(var1, var2)) {
                  return true;
               }
            }

            if (!ab.xc) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private byte[] g(byte var1, byte var2) {
      boolean var9 = ab.xc;
      if (fb.bf == null) {
         return null;
      }

      if (!o.b(var1, var2)) {
         return null;
      }

      byte[] var3 = new byte[4];
      boolean var4 = true;
      byte var8 = 0;

      boolean var10000;
      while (true) {
         if (var8 < 4) {
            byte var6 = b(var8, var1);
            byte var7 = c(var8, var2);
            var3[var8] = 0;
            var10000 = o.b(var6, var7);
            if (var9) {
               break;
            }

            if (var10000) {
               boolean var5 = false;
               if (this.d.b(var1, var2, var8) && (this.k <= 1 || !f(var6, var7))) {
                  var5 = true;
               }

               if (this.y == 5 && o.b(var6, var7, this.q, this.r) > this.o) {
                  var5 = false;
               }

               var3[var8] = var5 ? ab.uc : 0;
               if (var3[var8] != 0) {
                  var4 = false;
               }
            }

            var8++;
            if (!var9) {
               continue;
            }
         }

         var10000 = var4;
         break;
      }

      return var10000 ? null : var3;
   }

   public final void g() {
      if (this.e() && this.d.r == 2) {
         this.L = 250L;
         this.B = true;
      }
   }

   public final void h() {
      boolean var10;
      var10 = ab.xc;
      label656:
      if (this.y == -1) {
         if (this.d.g < this.q) {
            this.e((byte)3);
            if (!var10) {
               break label656;
            }
         }

         if (this.d.g > this.q) {
            this.e((byte)1);
            if (!var10) {
               break label656;
            }
         }

         if (this.d.h < this.r) {
            this.e((byte)0);
            if (!var10) {
               break label656;
            }
         }

         if (this.d.h > this.r) {
            this.e((byte)2);
         }
      }

      if (fb.kb - this.e >= 0L) {
         if (this.s != 0) {
            y var20;
            var20 = this;
            label345:
            if (this.s == t) {
               if (var20.x == 0) {
                  label716: {
                     if (var20.k <= 2 || fb.i()) {
                        var20.b(d(var20.w), true);
                        if (!var10) {
                           break label716;
                        }
                     }

                     var20.e(d(var20.w));
                  }

                  if (var20.d.g == var20.u && var20.d.h == var20.v) {
                     break label345;
                  }

                  var20.x = 1;
                  var20.c();
                  if (fb.i()) {
                     var20.c();
                     var20.b(3);
                     if (!var10) {
                        break label345;
                     }
                  }

                  if (var20.k > 6) {
                     break label345;
                  }

                  var20.b(6 - var20.k);
                  if (!var10) {
                     break label345;
                  }
               }

               label324:
               if (var20.x == 1) {
                  label322: {
                     if (var20.k <= 2) {
                        var20.b(var20.w, true);
                        if (!var10) {
                           break label322;
                        }
                     }

                     var20.e(var20.w);
                  }

                  label662: {
                     if (var20.d.g == var20.u && var20.d.h == var20.v) {
                        var20.c();
                        if (!var10) {
                           break label662;
                        }
                     }

                     if ((var20.d.g == var20.u || var20.d.h == var20.v) && Math.abs(var20.d.g - var20.u) <= 1 && Math.abs(var20.d.h - var20.v) <= 1) {
                        break label324;
                     }
                  }

                  var20.a();
               }
            }

            var20.h = false;
         } else {
            q var10000;
            label711: {
               label640:
               if (this.e()) {
                  y var1 = this;
                  if (this.d.r == 2) {
                     label636: {
                        if (var1.L > 0L) {
                           var1.L--;
                           if (!var10) {
                              break label636;
                           }
                        }

                        var1.B = false;
                     }

                     if (!var1.B) {
                        break label640;
                     }

                     var1.d.e(3);
                     if (!var10) {
                        break label640;
                     }
                  }

                  if (var1.d.r == 9) {
                     int var2 = 0;

                     while (var2 < fb.Qd.size()) {
                        q var3;
                        var10000 = var3 = (q)fb.Qd.elementAt(var2);
                        if (var10) {
                           break label711;
                        }

                        if (var10000 != null && var3.x != var1.d.x && var1.d.g == var3.g && var1.d.h == var3.h) {
                           p.b((byte)0, (byte)0, var1.d.g * 30 + 15, var1.d.h * 30 + 15, 0, 30, var1.d, var1.d, -1);
                           var1.d.b((byte)-1, (byte)-1, false, false);
                           if (o.c(var1.d.g, var1.d.h)) {
                              ab.G.b(ab.R, 0);
                           }
                        }

                        var2++;
                        if (var10) {
                           break;
                        }
                     }
                  }
               }

               if (this.f() && this.y != 4) {
                  this.d(4);
               }

               label614:
               if (this.B && fb.kb - this.m >= 0L) {
                  this.H = b(this.d.g, this.d.h, true, this.l, this.d);
                  if (this.H != null) {
                     this.I = (byte)o.b(this.H.g, this.H.h, this.d.g, this.d.h);
                     this.J = b(this.d.g, this.d.h, this.H.g, this.H.h);
                     if (this.C) {
                        this.G = true;
                        if (!var10) {
                           break label614;
                        }
                     }

                     this.G = false;
                     if (!var10) {
                        break label614;
                     }
                  }

                  this.I = 0;
                  this.G = false;
                  this.c(3);
               }

               label502:
               if (this.G) {
                  if (this.e()) {
                     y var11 = this;
                     boolean var21 = false;
                     byte var26 = 0;
                     if (var11.H != null && var11.d.r != 8 && var11.d.r != 6 && !var11.b(var11.H.g, var11.H.h, true)) {
                        var11.i();
                        if (!var10) {
                           break label502;
                        }
                     }

                     var11.d(var11.z);
                     if (var11.d.r == 3) {
                        var21 = true;
                        var26 = 5;
                     }

                     if (var11.d.r == 5) {
                        var21 = true;
                        var26 = 1;
                     }

                     if (var11.d.r == 6 || var11.d.r == 8) {
                        var21 = true;
                        var26 = 7;
                     }

                     if (var11.d.r == 9) {
                        var21 = true;
                        var26 = 3;
                     }

                     if (var11.d.ub != var11.J) {
                        var11.f(var11.J);
                        if (!var10) {
                           break label502;
                        }
                     }

                     if (var11.y == 2) {
                        var11.o = var26;
                     }

                     if (var21 && var11.I <= var26) {
                        var11.d();
                     }

                     if (!var10) {
                        break label502;
                     }
                  }

                  if (this.f()) {
                     y var12 = this;
                     if (this.H != null && !var12.b(var12.H.g, var12.H.h, true)) {
                        var12.G = false;
                        if (!var10) {
                           break label502;
                        }
                     }

                     if (var12.d.ub != var12.J) {
                        var12.f(var12.J);
                        if (!var10) {
                           break label502;
                        }
                     }

                     var12.d();
                     if (!var10) {
                        break label502;
                     }
                  }

                  y var13 = this;
                  label480:
                  if (this.H != null) {
                     if (var13.d.g != var13.H.g && var13.d.h != var13.H.h) {
                        var13.i();
                        if (!var10) {
                           break label480;
                        }
                     }

                     if (var13.J == -1) {
                        var13.i();
                        if (!var10) {
                           break label480;
                        }
                     }

                     label584: {
                        y var4 = var13;
                        if (var13.H != null) {
                           byte var5;
                           byte var6;
                           boolean var7;
                           boolean var9;
                           byte var22;
                           var6 = (byte)(Math.abs(var4.H.g - var4.d.g) + Math.abs(var4.H.h - var4.d.h));
                           var22 = var4.J;
                           boolean var27 = var4.d(var4.d.g, var4.d.h, var22);
                           var7 = var4.b(var4.H.g, var4.H.h, false);
                           boolean var8 = var4.H.Tb;
                           var9 = false;
                           var5 = (byte)var4.d.bc;
                           label547:
                           if (var4.g(var5)) {
                              if (var7) {
                                 label673: {
                                    if (hb.b(var5)) {
                                       if (var8 && var6 <= 3) {
                                          var9 = true;
                                          var4.K = false;
                                          if (!var10) {
                                             break label673;
                                          }
                                       }

                                       if (!var27) {
                                          break label673;
                                       }

                                       if (var6 >= 2 || var4.F) {
                                          var9 = true;
                                          var4.K = true;
                                       }

                                       if (var5 != 0 || var6 <= 4) {
                                          break label673;
                                       }

                                       var9 = false;
                                       if (!var10) {
                                          break label673;
                                       }
                                    }

                                    label558:
                                    if (hb.d(var5)) {
                                       if (hb.e(var5)) {
                                          if (var6 <= 3 && !var4.F) {
                                             break label558;
                                          }

                                          var9 = true;
                                          if (!var10) {
                                             break label558;
                                          }
                                       }

                                       if (var6 >= 2 || var4.F) {
                                          var9 = true;
                                       }
                                    }
                                 }

                                 if (var4.F || !hb.f(var5) || var4.k < 3 || var6 >= 3 || var4.H.nc < 25) {
                                    break label547;
                                 }

                                 var9 = false;
                                 if (!var10) {
                                    break label547;
                                 }
                              }

                              if (hb.e(var5)) {
                                 var9 = true;
                              }
                           }

                           if (!var9) {
                              var5 = (byte)var4.d.cc;
                              label530:
                              if (var4.g(var5) && var7) {
                                 if (hb.d(var5)) {
                                    var9 = true;
                                    if (!var10) {
                                       break label530;
                                    }
                                 }

                                 if (hb.c(var5) && !var4.F) {
                                    var9 = false;
                                    label519:
                                    if (var22 == d(var4.d.ub) && var6 <= 5) {
                                       if (var6 <= 0 && ab.oc.nextInt(3) == 0) {
                                          var9 = true;
                                          if (!var10) {
                                             break label519;
                                          }
                                       }

                                       if (ab.oc.nextInt(var6) == 0) {
                                          var9 = true;
                                       }
                                    }
                                 }
                              }
                           }

                           if (var9) {
                              var34 = var5;
                              break label584;
                           }
                        }

                        var34 = -1;
                     }

                     byte var23 = var34;
                     if (var34 == -1) {
                        var13.i();
                        if (!var10) {
                           break label480;
                        }
                     }

                     label507: {
                        var13.d(var13.z);
                        if (!hb.b(var23)) {
                           if (var13.d.ub == var13.J) {
                              break label507;
                           }

                           var13.f(var13.J);
                           if (!var10) {
                              break label480;
                           }
                        }

                        var13.c();
                     }

                     var13.b(var13.K ? var13.J : -1, (int)var23);
                  }
               }

               var10000 = this.d;
            }

            if (var10000.cc != -1 && this.h && this.g((byte)this.d.cc)) {
               byte[] var14;
               if (ab.oc.nextInt(15) == 0 && (var14 = this.g(this.d.g, this.d.h))[b(this.d.ub)] == 0 && var14[c(this.d.ub)] == 0) {
                  this.j();
               }

               if (ab.oc.nextInt(100) == 0) {
                  this.j();
               }
            }

            label676: {
               if (ab.m == 2 && !fb.i()) {
                  if (fb.jb.H == null && !fb.c((byte)1) && this.b(S, T, true)) {
                     if (this.d.g != S || this.d.h != T) {
                        break label676;
                     }

                     if (this.d.x == 0) {
                        this.b(false);
                        if (var10) {
                           break label676;
                        }
                     }
                  }

                  label464:
                  if (fb.ib.H == null && !fb.c((byte)0) && this.b(U, V, true)) {
                     if (this.d.g == U && this.d.h == V) {
                        if (this.d.x != 1) {
                           break label464;
                        }

                        this.b(false);
                        if (!var10) {
                           break label464;
                        }
                     }

                     this.e(b(this.d.g, this.d.h, S, T));
                     return;
                  }
               }

               if (!this.G) {
                  if (this.y == 0) {
                     this.e(20);
                  }

                  if (this.y == 4) {
                     y var15 = this;
                     this.p--;
                     if (var15.p <= 0) {
                        label435: {
                           if (ab.bc == 1) {
                              var15.f((byte)(2 + ab.oc.nextInt(2)));
                              if (!var10) {
                                 break label435;
                              }
                           }

                           var15.f((byte)ab.oc.nextInt(4));
                        }

                        var15.p = 25 + ab.oc.nextInt(50);
                     }
                  }

                  label427:
                  if (this.y == 5) {
                     y var16 = this;
                     if (this.p > 0) {
                        var16.e(15);
                        var16.p--;
                        if (var16.p > 0) {
                           break label427;
                        }

                        var16.p = -(1 + ab.oc.nextInt(50));
                        if (!var10) {
                           break label427;
                        }
                     }

                     if (var16.p < 0) {
                        var16.p++;
                        if (var16.p >= 0) {
                           var16.p = 25 + ab.oc.nextInt(50);
                        }
                     }
                  }
               }

               label419:
               if (this.y == 2) {
                  y var17 = this;
                  boolean var24 = true;
                  boolean var28 = false;
                  if (var17.H != null && var17.b(var17.H.g, var17.H.h, true)) {
                     var17.j = var17.J;
                     if (var17.I > var17.o) {
                        var28 = true;
                     }

                     var24 = false;
                  }

                  if (var24) {
                     var17.d(0);
                  }

                  if (var28) {
                     var17.e(var17.j);
                     if (!var10) {
                        break label419;
                     }
                  }

                  var17.c();
                  var17.f(var17.j);
               }

               label410:
               if (this.y == 6) {
                  y var18;
                  var18 = this;
                  label408:
                  if (this.h) {
                     if (var18.Y == null) {
                        var18.d(0);
                        if (!var10) {
                           break label410;
                        }
                     }

                     short var25 = var18.Y[var18.d.g][var18.d.h];
                     byte var31 = -1;
                     byte var32 = 0;

                     label405: {
                        while (var32 < 4) {
                           byte var29 = b(var32, var18.d.g);
                           byte var30 = c(var32, var18.d.h);
                           var35 = o.b(var29, var30);
                           if (var10) {
                              break label405;
                           }

                           if (var35 != 0 && var18.Y[var29][var30] != 0 && var18.Y[var29][var30] < var25) {
                              var25 = var18.Y[var29][var30];
                              var31 = var32;
                           }

                           var32++;
                           if (var10) {
                              break;
                           }
                        }

                        var35 = var31;
                     }

                     if (var35 != -1) {
                        var18.j = var31;
                        if (!var10) {
                           break label408;
                        }
                     }

                     if (var18.d.g == var18.W && var18.d.h == var18.X) {
                        label684: {
                           var32 = var18.d.x;
                           if (var18.Z) {
                              if (fb.c(var32 = (byte)(var18.d.x == 0 ? 1 : 0))) {
                                 var18.b(false);
                                 if (!var10) {
                                    break label684;
                                 }
                              }

                              var18.B = true;
                              var18.ab = 50;
                              var18.b(5, 10, var18.W, var18.X);
                              if (!var10) {
                                 break label684;
                              }
                           }

                           if (fb.c(var32)) {
                              var18.b(true);
                              if (!var10) {
                                 break label684;
                              }
                           }

                           var18.B = true;
                           var18.ab = 125;
                           var18.b(5, 20, var18.W, var18.X);
                        }

                        var18.i = true;
                        if (!var10) {
                           break label410;
                        }
                     }
                  }

                  var18.e(var18.j);
               }

               if (ab.m == 2 && this.E && !fb.i() && (this.ab != -1 || this.y == 0)) {
                  if (this.y == 0) {
                     this.b(this.Z);
                     return;
                  }

                  if (this.ab > 0) {
                     this.ab--;
                  }

                  label361:
                  if (this.ab <= 0) {
                     this.ab = -1;
                     byte var19 = this.d.x;
                     if (this.Z) {
                        if (h(var19 = (byte)(this.d.x == 0 ? 1 : 0))) {
                           this.b(true);
                           if (!var10) {
                              break label361;
                           }
                        }

                        this.ab = 125;
                        this.d(-1);
                        this.b(5, 20, this.W, this.X);
                        if (!var10) {
                           break label361;
                        }
                     }

                     if (h(var19)) {
                        this.b(false);
                        if (!var10) {
                           break label361;
                        }
                     }

                     this.ab = 50;
                     this.b(5, 10, this.W, this.X);
                  }
               }

               this.h = this.i;
               this.i = false;
               return;
            }

            this.e(b(this.d.g, this.d.h, S, T));
         }
      }
   }

   public static q b(byte var0, byte var1, boolean var2, int var3, q var4) {
      boolean var10 = ab.xc;
      if (q.Vc != null && (!var2 || fb.bf != null)) {
         boolean[] var9 = new boolean[4];
         byte var8 = 0;

         byte var10000;
         while (true) {
            if (var8 < 4) {
               var10000 = 1;
               if (var10) {
                  break;
               }

               byte var7 = 1;

               label105: {
                  while (var7 < var3) {
                     byte var5 = b(var8, var0, var7);
                     byte var6 = c(var8, var1, var7);
                     var10000 = o.b(var5, var6);
                     if (var10) {
                        break label105;
                     }

                     if (var10000 != 0) {
                        if (!var2 && fb.bf[var5][var6] == 0) {
                           break;
                        }

                        if (q.Vc[var5][var6] != 0 && q.Vc[var5][var6] != var4.w) {
                           var9[var8] = true;
                           if (!var10) {
                              break;
                           }
                        }
                     }

                     var7++;
                     if (var10) {
                        break;
                     }
                  }

                  var10000 = (byte)(var8 + 1);
               }

               var8 = var10000;
               if (!var10) {
                  continue;
               }
            }

            var10000 = 1;
            break;
         }

         byte var15 = var10000;

         while (var15 < var3) {
            var8 = 0;

            while (true) {
               if (var8 < 4) {
                  var10000 = var9[var8];
                  if (var10) {
                     break;
                  }

                  label73: {
                     if (var10000 != 0) {
                        byte var12 = b(var8, var0, var15);
                        byte var14 = c(var8, var1, var15);
                        q[] var11;
                        if (o.b(var12, var14) && (var11 = q.b(var12, var14, 3, var4)) != null) {
                           var12 = 0;

                           while (var12 < var11.length) {
                              var10000 = b(var11[var12], var4);
                              if (var10) {
                                 break label73;
                              }

                              if (var10000 != 0 && (var4.r != 2 || var11[var12].r != 4)) {
                                 return var11[var12];
                              }

                              var12++;
                              if (var10) {
                                 break;
                              }
                           }
                        }
                     }

                     var10000 = (byte)(var8 + 1);
                  }

                  var8 = var10000;
                  if (!var10) {
                     continue;
                  }
               }

               var10000 = (byte)(var15 + 1);
               break;
            }

            var15 = var10000;
            if (var10) {
               break;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private void i() {
      this.c(10);
      this.G = false;
      this.H = null;
   }

   private void j() {
      byte var1;
      if (hb.c(var1 = (byte)this.d.cc) && this.g(var1)) {
         this.b((byte)-1, (int)var1);
      }
   }

   private void b(int var1, int var2, int var3, int var4) {
      boolean var5 = ab.xc;
      switch (var1) {
         case -1:
            this.i();
            this.B = false;
            if (!var5) {
               break;
            }
         case 0:
            if (!var5) {
               break;
            }
         case 2:
            if (!this.D) {
               return;
            }

            this.o = 4;
            if (!var5) {
               break;
            }
         case 4:
            if (!var5) {
               break;
            }
         case 5:
            this.o = var2;
            this.q = (byte)var3;
            this.r = (byte)var4;
            this.p = 50;
         case 1:
         case 3:
      }

      this.y = var1;
   }

   private void d(int var1) {
      this.b(var1, 1, -1, -1);
   }

   private void b(boolean var1) {
      boolean var2;
      g var10000;
      label44: {
         var2 = ab.xc;
         this.Z = var1;
         if (this.d.x == 1) {
            if (!var1) {
               var10000 = Q;
               break label44;
            }
         } else if (var1) {
            var10000 = Q;
            break label44;
         }

         var10000 = R;
      }

      label48: {
         var3 = var10000;
         if (var10000 == Q) {
            this.Y = O;
            if (!var2) {
               break label48;
            }
         }

         if (var3 != R) {
            return;
         }

         this.Y = P;
         if (var2) {
            return;
         }
      }

      label27: {
         this.W = var3.b;
         this.X = var3.c;
         if (this.Z) {
            this.B = ab.oc.nextInt(2) == 0;
            if (!var2) {
               break label27;
            }
         }

         this.B = false;
      }

      this.ab = -1;
      this.y = 6;
      this.i = true;
   }

   private void e(int var1) {
      boolean var6;
      byte var10000;
      label160: {
         var6 = ab.xc;
         byte var3 = this.d.ub;
         y var2 = this;
         if (var3 != -1) {
            int var4;
            if (var2.y == 5 && (var4 = o.b(b(var3, var2.d.g), c(var3, var2.d.h), var2.q, var2.r)) > var2.o) {
               if (var4 - var2.o != 1) {
                  var10000 = (byte)(var4 - var2.o == 2 ? -1 : -2);
                  break label160;
               }
            } else if (var2.d.b(var2.d.g, var2.d.h, var3)) {
               var10000 = 1;
               break label160;
            }
         }

         var10000 = 0;
      }

      byte var9 = var10000;
      if (this.h || var9 != 1) {
         byte var11 = 0;
         if (var9 != 1) {
            var11 = 1;
            if (var9 == -1) {
               this.f(d(this.d.ub));
               return;
            }

            if (var9 == -2) {
               this.d(0);
               return;
            }
         } else {
            if (!this.n) {
               this.n = ab.oc.nextInt(var1) == 0;
            }

            if (this.n) {
               var11 = 1;
            }
         }

         if (var11) {
            byte var10001;
            label143: {
               byte var7 = -1;
               byte var16 = this.d.h;
               var11 = this.d.g;
               y var10 = this;
               byte[] var8;
               if ((var8 = this.g(var11, var16)) != null) {
                  var11 = 4;
                  if (var8[0] == 0) {
                     var11 = 3;
                  }

                  if (var8[1] == 0) {
                     var11--;
                  }

                  if (var8[2] == 0) {
                     var11--;
                  }

                  if (var8[3] == 0) {
                     var11--;
                  }

                  if (var11 == 2) {
                     var16 = d(var10.d.ub);
                     if (var8[0] != 0 && var16 != 0) {
                        var10001 = 0;
                        break label143;
                     }

                     if (var8[1] != 0 && 1 != var16) {
                        var10001 = 1;
                        break label143;
                     }

                     if (var8[2] != 0 && 2 != var16) {
                        var10001 = 2;
                        break label143;
                     }

                     if (var8[3] != 0 && 3 != var16) {
                        var10001 = 3;
                        break label143;
                     }

                     var10001 = -1;
                     break label143;
                  }

                  if (var11 == 1) {
                     var16 = 0;

                     while (var16 < 4) {
                        var10001 = var8[var16];
                        if (var6) {
                           break label143;
                        }

                        if (var10001 != 0) {
                           var10001 = var16;
                           break label143;
                        }

                        var16++;
                        if (var6) {
                           break;
                        }
                     }

                     var10001 = -1;
                     break label143;
                  }

                  if (var11 != 0) {
                     byte var5 = (byte)ab.oc.nextInt(--var11);
                     var11 = 0;
                     var16 = 0;

                     while (var16 < 4) {
                        var10001 = var8[var16];
                        if (var6) {
                           break label143;
                        }

                        if (var10001 != 0 && var16 != d(var10.d.ub)) {
                           if (var11 == var5) {
                              var10001 = var16;
                              break label143;
                           }

                           var11++;
                        }

                        var16++;
                        if (var6) {
                           break;
                        }
                     }
                  }
               }

               var10001 = -1;
            }

            this.j = var10001;
            if (this.j == -1) {
               this.j = this.d.ub;
               this.c();
               this.b(3);
               return;
            }

            if (this.n && this.j != this.d.ub) {
               this.n = false;
            }
         }
      }

      this.e(this.j);
   }

   public static void k() {
      boolean var2 = ab.xc;
      if (O == null) {
         O = new short[fb.Pe][fb.Qe];
      }

      if (P == null) {
         P = new short[fb.Pe][fb.Qe];
      }

      int var0 = 0;

      byte var10000;
      label73:
      while (true) {
         if (var0 < O.length) {
            var10000 = 0;
            if (var2) {
               break;
            }

            int var1 = 0;

            label68: {
               while (var1 < O[0].length) {
                  O[var0][var1] = 0;
                  P[var0][var1] = 0;
                  var1++;
                  if (var2) {
                     break label68;
                  }

                  if (var2) {
                     break;
                  }
               }

               var0++;
            }

            if (!var2) {
               continue;
            }
         }

         if (fb.Sd != null) {
            var0 = 0;

            while (var0 < fb.Sd.size()) {
               g var4;
               var10000 = (var4 = (g)fb.Sd.elementAt(var0)).d;
               if (var2) {
                  break label73;
               }

               if (var10000 == 5) {
                  Q = var4;
               }

               if (var4.d == 4) {
                  R = var4;
               }

               var0++;
               if (var2) {
                  break;
               }
            }
         }

         if (Q != null) {
            bb = false;
            b(O, Q.b, Q.c, 0);
            b(O, Q.b, Q.c, 0);
            b(O, Q.b, Q.c, 0);
            b(O, Q.b, Q.c, 0);
         }

         if (R == null) {
            return;
         }

         var10000 = 0;
         break;
      }

      bb = (boolean)var10000;
      b(P, R.b, R.c, 0);
      b(P, R.b, R.c, 0);
      b(P, R.b, R.c, 0);
      b(P, R.b, R.c, 0);
   }

   private static void b(short[][] var0, int var1, int var2, int var3) {
      boolean var8 = ab.xc;
      bb = !bb;
      var0[var1][var2] = 1;
      byte var4 = fb.Pe;
      byte var5 = fb.Qe;
      if (!bb) {
         short var15 = 0;

         while (var15 < var4) {
            byte var16 = 0;

            short var17;
            while (true) {
               if (var16 < var5) {
                  var17 = var0[var15][var16];
                  if (var8) {
                     break;
                  }

                  if (var17 > 0) {
                     short var10 = var0[var15][var16];
                     if (var15 + 1 < var4) {
                        var2 = 0;
                        if (b(var15 + 1, var16)) {
                           var2 = var10 + 1;
                        }

                        if (var0[var15 + 1][var16] == 0 || var2 < var0[var15 + 1][var16]) {
                           var0[var15 + 1][var16] = (short)var2;
                        }
                     }

                     if (var16 + 1 < var5) {
                        var2 = 0;
                        if (b(var15, var16 + 1)) {
                           var2 = var10 + 1;
                        }

                        if (var0[var15][var16 + 1] == 0 || var2 < var0[var15][var16 + 1]) {
                           var0[var15][var16 + 1] = (short)var2;
                        }
                     }
                  }

                  var16++;
                  if (!var8) {
                     continue;
                  }
               }

               var17 = (byte)(var15 + 1);
               break;
            }

            var15 = var17;
            if (var8) {
               break;
            }
         }
      } else {
         int var6 = var4 - 1;

         label126:
         while (true) {
            int var10000 = var6;

            label124:
            while (var10000 >= 0) {
               int var7 = var5 - 1;

               while (var7 >= 0) {
                  var10000 = var0[var6][var7];
                  if (var8) {
                     continue label124;
                  }

                  if (var10000 > 0) {
                     short var9 = var0[var6][var7];
                     if (var6 - 1 >= 0) {
                        var2 = 0;
                        if (b(var6 - 1, var7)) {
                           var2 = var9 + 1;
                        }

                        if (var0[var6 - 1][var7] == 0 || var2 < var0[var6 - 1][var7]) {
                           var0[var6 - 1][var7] = (short)var2;
                        }
                     }

                     if (var7 - 1 >= 0) {
                        var2 = 0;
                        if (b(var6, var7 - 1)) {
                           var2 = var9 + 1;
                        }

                        if (var0[var6][var7 - 1] == 0 || var2 < var0[var6][var7 - 1]) {
                           var0[var6][var7 - 1] = (short)var2;
                        }
                     }
                  }

                  var7--;
                  if (var8) {
                     break;
                  }
               }

               var6--;
               if (var8) {
                  return;
               }
               continue label126;
            }

            return;
         }
      }
   }

   private static boolean h(byte var0) {
      s var1;
      return fb.c(var0) && (var1 = var0 == 1 ? fb.jb : fb.ib) != null && var1.H == null;
   }

   public final void b(byte var1, byte var2, byte var3, boolean var4, boolean var5) {
      if (var1 == 0) {
         this.d(0);
      }

      if (var1 == 1) {
         this.d(-1);
      }

      if (var1 == 2) {
         this.d(4);
      }

      if (var1 == 3) {
         this.b(5, 3, var2, var3);
      }

      if (var1 == 4) {
         this.b(5, 1, var2, var3);
      }

      this.C = var4;
      this.D = var5;
   }

   public static void c(q var0) {
      boolean var2 = ab.xc;
      var0.bc = -1;
      var0.cc = -1;
      int var1 = 0;

      while (var1 < 14) {
         var0.Yb[var1] = -1;
         var1++;
         if (var2) {
            break;
         }
      }
   }

   public static void d(q var0) {
      q var10000;
      boolean var10001;
      if (var0.bc == -1) {
         var10000 = var0;
         var10001 = true;
      } else {
         label15: {
            if (var0.cc == -1) {
               var10000 = var0;
            } else {
               var10000 = var0;
               if (ab.oc.nextInt(2) == 0) {
                  var10001 = true;
                  break label15;
               }
            }

            var10001 = false;
         }
      }

      b(var10000, var10001);
   }

   public static boolean f(int var0) {
      return var0 == 0 || var0 == 8 || var0 == 6 || var0 == 1 || var0 == 4 || var0 == 2 || var0 == 5 || var0 == 3 || var0 == 12 || var0 == 7;
   }

   public static void l() {
      boolean var1 = ab.xc;
      int var0 = 1;

      while (var0 < 14) {
         N[var0] = N[var0] + N[var0 - 1];
         var0++;
         if (var1) {
            break;
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private static void b(q var0, boolean var1) {
      boolean var3 = ab.xc;
      if (var0 != null) {
         while (true) {
            int var2;
            if ((var2 = ab.oc.nextInt(14)) != 2 && var2 != 7 && var2 != 8) {
               if (var2 == 9 || var2 == 10 || var2 == 11 || var2 == 13) {
                  ab.oc.nextInt(6);
               }
            } else if (ab.oc.nextInt(3) != 0) {
            }

            while (hb.g[var2] != 0) {
               if (!var3) {
                  if (var1) {
                     var0.bc = var2;
                     return;
                  }

                  var0.cc = var2;
                  return;
               }

               if (var1) {
               }
            }
         }
      }
   }
}
