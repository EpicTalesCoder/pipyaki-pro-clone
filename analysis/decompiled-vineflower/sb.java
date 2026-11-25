public final class sb {
   public boolean b;
   public byte c;
   public byte d;
   private q[] e;
   private long f;
   private byte h;
   public boolean i;
   public byte j;
   private byte k;
   private byte l;
   private byte m;
   public byte n;
   public byte o;
   private byte p;
   public byte q;
   public nb r;
   public int s;
   public int t;
   private boolean u;
   private boolean v;
   private boolean w;

   public sb(
      byte var1,
      byte var2,
      byte var3,
      byte var4,
      byte var5,
      byte var6,
      byte var7,
      byte var8,
      boolean var9,
      byte var10,
      boolean var11,
      boolean var12,
      boolean var13
   ) {
      label35: {
         boolean var14 = ab.xc;
         super();
         this.e = null;
         this.q = 0;
         this.c = var1;
         this.d = var2;
         this.j = var3;
         this.h = this.k = var4;
         this.l = var5;
         this.m = var6;
         this.n = var7;
         this.o = var8;
         if (this.o == 0) {
            this.i = true;
            if (!var14) {
               break label35;
            }
         }

         if (this.o == 1) {
            this.o = -1;
            if (!var14) {
               break label35;
            }
         }

         this.o = (byte)(this.o - 2);
      }

      if (this.l > 0) {
         this.e = new q[this.l];
      }

      if (this.o != 0 && this.j != 2) {
         this.q = this.k;
      }

      this.b = !var9;
      this.p = var10;
      this.u = var11;
      this.v = var12;
      this.w = var13;
      this.f = 0L;
      fb.ae.addElement(this);
   }

   public static sb[] b(byte var0, byte var1) {
      boolean var7 = ab.xc;
      sb[] var2 = null;
      if (fb.Zd != null) {
         int var5 = 0;

         while (var5 < 2) {
            int var3 = 0;
            int var6 = 0;

            while (true) {
               if (var6 < fb.ae.size()) {
                  sb var4;
                  if ((var4 = (sb)fb.ae.elementAt(var6)) != null && var4.c == var0 && var4.d == var1) {
                     if (var5 == 1) {
                        var2[var3] = var4;
                     }

                     var3++;
                  }

                  var6++;
                  if (!var7) {
                     continue;
                  }
               }

               if (var5 != 0) {
                  return var2;
               }

               if (var3 <= 0) {
                  return null;
               }

               var2 = new sb[var3];
               if (var7) {
                  return null;
               }

               var5++;
               if (var7) {
                  return null;
               }
               break;
            }
         }
      }

      return null;
   }

   public final void b() {
      boolean var5 = ab.xc;
      if (this.b && this.r != null) {
         this.r.c();
      }

      if (this.b && this.h != 0) {
         if (this.f > 0L) {
            this.f--;
         }

         if (fb.df || fb.kb % 10L == 0L) {
            q var10000;
            label119: {
               boolean var1 = true;
               if (this.e != null) {
                  var1 = false;
                  byte var2 = 0;

                  while (var2 < this.e.length) {
                     var10000 = this.e[var2];
                     if (var5) {
                        break label119;
                     }

                     if (var10000 != null && this.e[var2].V) {
                        this.e[var2] = null;
                     }

                     if (this.e[var2] == null) {
                        var1 = true;
                        if (!var5) {
                           break;
                        }
                     }

                     var2++;
                     if (var5) {
                        break;
                     }
                  }
               }

               if (!fb.df && this.f != 0L) {
                  var1 = false;
               }

               if (!var1) {
                  return;
               }

               var10000 = new q(this.j, this.o);
            }

            q var8 = var10000;
            var10000.lc = true;
            var8.Cc = new y(var8, this.p);
            var8.Cc.b(this.n, this.c, this.d, this.u, this.v);
            boolean var6 = fb.df;
            if (!fb.df) {
               fb.df = this.w;
            }

            var8.b(this.c, this.d, true);
            fb.df = var6;
            label84:
            if (this.r != null) {
               if (this.k - this.h == 0) {
                  this.r.b(new byte[]{1, 2, 3, 4, 5}, false, false, (byte)5);
                  if (!var5) {
                     break label84;
                  }
               }

               if (this.h == 1) {
                  this.r.b(new byte[]{5, 4, 3, 2, 1, 0}, false, false, (byte)5);
               }
            }

            label78: {
               label77: {
                  q var3 = var8;
                  sb var7 = this;
                  if (this.e != null) {
                     byte var4 = 0;

                     while (var4 < var7.e.length) {
                        var10000 = var7.e[var4];
                        if (var5) {
                           break label78;
                        }

                        if (var10000 == null) {
                           var7.e[var4] = var3;
                           boolean var10 = true;
                           break label77;
                        }

                        var4++;
                        if (var5) {
                           break;
                        }
                     }
                  }

                  boolean var11 = false;
               }

               this.f = this.m * 25;
               this.h--;
               var10000 = var8;
            }

            if (var10000.Cc.f()) {
               this.h = 0;
            }

            if (this.h < 0) {
               this.h = 0;
            }
         }
      }
   }
}
