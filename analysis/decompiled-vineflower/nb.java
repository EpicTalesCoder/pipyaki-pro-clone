import javax.microedition.lcdui.Graphics;

public final class nb {
   public pb b;
   public int c;
   public int d;
   public boolean e;
   private long f;
   public byte[] g;
   public byte h;
   public byte i;
   public byte j;
   private boolean k;
   private boolean l;
   private byte m;
   private byte n;
   private byte o;
   public short p;
   public byte q;

   public nb(pb var1) {
      this.b = var1;
      this.c = this.b.d;
      this.d = this.b.e;
      this.q = -1;
   }

   public final void b(byte[] var1, byte var2, byte var3, byte var4, byte var5, boolean var6, boolean var7, byte var8) {
      boolean var9 = ab.xc;
      if (!this.e) {
         label21: {
            this.k = var6;
            this.l = var7;
            this.p = var8;
            if (var1 != null) {
               label18: {
                  this.g = var1;
                  if (!this.l) {
                     this.i = 0;
                     if (!var9) {
                        break label18;
                     }
                  }

                  this.i = (byte)(this.g.length - 1);
               }

               this.h = (byte)this.g.length;
               this.j = this.g[this.i];
               if (!var9) {
                  break label21;
               }
            }

            this.g = null;
            this.m = var2;
            this.n = var3;
            this.o = var4;
            this.h = var5;
            this.j = this.m;
            this.i = 0;
         }

         this.f = fb.kb;
         this.e = true;
      }
   }

   public final void b(byte[] var1, boolean var2, boolean var3, byte var4) {
      this.b(var1, (byte)0, (byte)0, (byte)0, (byte)0, var2, var3, var4);
   }

   public final void b(boolean var1, boolean var2, byte var3) {
      this.b(null, var2 ? (byte)(this.b.h - 1) : 0, (byte)-1, (byte)-1, (byte)this.b.h, var1, var2, var3);
   }

   public final void b(byte var1, byte var2) {
      if (var1 != this.j) {
         this.e = false;
         boolean var3 = var1 - this.j < 0;
         this.b(null, this.j, var3 ? var1 : -1, (byte)-1, !var3 ? (byte)(var1 + 1) : (byte)this.b.h, false, var3, var2);
      }
   }

   public final void b() {
      this.e = false;
      this.g = null;
      this.q = -1;
   }

   public final void b(Graphics var1, int var2, int var3) {
      this.b.b = this.j;
      this.b.b(var2 - this.c / 2, var3 - this.d / 2);
      this.b.b(var1);
   }

   public final void c() {
      boolean var1 = ab.xc;
      if (this.p != -1) {
         if (this.e && fb.kb - this.f >= this.p) {
            this.f = fb.kb;
            if (this.g != null) {
               label160: {
                  label88:
                  if (this.i >= this.g.length || this.i < 0) {
                     if (this.k && this.q >= 0) {
                        this.q--;
                        if (this.q == 0 || this.q == -1) {
                           this.k = false;
                        }
                     }

                     if (!this.k) {
                        break label160;
                     }

                     if (this.i < 0) {
                        this.i = (byte)(this.g.length - 1);
                        if (!var1) {
                           break label88;
                        }
                     }

                     this.i = 0;
                     if (var1) {
                        break label160;
                     }
                  }

                  this.j = this.g[this.i];
                  if (this.l) {
                     this.i--;
                     return;
                  }

                  this.i++;
                  return;
               }

               this.b();
               return;
            }

            label138: {
               if (this.l) {
                  this.j--;
                  if (!var1) {
                     break label138;
                  }
               }

               this.j++;
            }

            if (this.o != -1) {
               label119: {
                  if (this.j > this.o) {
                     this.j = this.n;
                     if (!var1) {
                        break label119;
                     }
                  }

                  if (this.j < this.n) {
                     this.j = this.o;
                  }
               }

               this.i++;
               if (this.i >= this.h) {
                  if (this.k && this.q >= 0) {
                     this.q--;
                     if (this.q == 0 || this.q == -1) {
                        this.k = false;
                     }
                  }

                  if (this.k) {
                     this.j = this.m;
                     this.i = 0;
                     return;
                  }

                  this.i = 0;
                  this.b();
                  return;
               }
            } else {
               if (this.j >= this.h) {
                  if (this.k && this.q >= 0) {
                     this.q--;
                     if (this.q == 0 || this.q == -1) {
                        this.k = false;
                     }
                  }

                  if (this.k) {
                     if (this.n != -1) {
                        this.j = this.n;
                        return;
                     }

                     this.j = this.m;
                     return;
                  }

                  this.j--;
                  this.b();
                  return;
               }

               if (this.j < (this.n != -1 ? this.n : 0)) {
                  if (this.k && this.q >= 0) {
                     this.q--;
                     if (this.q == 0 || this.q == -1) {
                        this.k = false;
                     }
                  }

                  if (this.k) {
                     this.j = (byte)(this.h - 1);
                     return;
                  }

                  this.j++;
                  this.b();
               }
            }
         }
      }
   }
}
