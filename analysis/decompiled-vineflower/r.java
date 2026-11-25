public final class r extends o {
   private o r;
   private int s;
   private int t;
   private byte u;
   private byte v;
   private int w;
   private o x;
   private boolean y;
   public boolean z;
   public boolean A;
   private int B;

   public r(o var1, int var2, int var3, int var4, int var5, int var6, int var7, o var8) {
      super((byte)-1, (byte)-1, var2, var3);
      this.r = var1;
      this.s = var4;
      this.t = var5;
      this.v = this.u = (byte)var6;
      this.w = var7;
      this.x = var8;
      this.y = true;
      if (fb.be != null) {
         fb.be.addElement(this);
      }
   }

   public static r[] b(byte var0, byte var1) {
      boolean var7 = ab.xc;
      r[] var2 = null;
      int var5 = 0;

      while (var5 < 2) {
         int var3 = 0;
         int var6 = 0;

         while (var6 < fb.be.size()) {
            r var4;
            if ((var4 = (r)fb.be.elementAt(var6)) != null && !var4.z && var4.g == var0 && var4.h == var1) {
               if (var5 == 1) {
                  var2[var3] = var4;
               }

               var3++;
            }

            var6++;
            if (var7) {
               break;
            }
         }

         if (var5 == 0) {
            var2 = new r[var3];
         }

         var5++;
         if (var7) {
            break;
         }
      }

      return var2;
   }

   public final void h() {
      if (!this.A) {
         if (this.w != -1) {
            this.w--;
            if (this.w <= 0) {
               this.z = true;
            }
         }

         super.h();
         label42:
         if (this.r != null) {
            this.c = this.r.c;
            this.d = this.r.d;
            if (this.r instanceof q) {
               this.B = ((q)this.r).Gb;
               if (!ab.xc) {
                  break label42;
               }
            }

            if (this.r instanceof u) {
               this.B = ((u)this.r).P;
            }
         }

         this.v--;
         if (this.v <= 0) {
            int var1 = super.c / 10 + this.s;
            int var2 = super.d / 10 - this.B / 10 + this.t;
            if (this.x != null && this.x instanceof t) {
               t var5;
               int var6 = (var5 = (t)this.x).z;
               if (this.y && var6 >= 4) {
                  var6 -= ab.oc.nextInt(var6 / 2);
               }

               int var3 = var5.l;
               int var4 = var5.m;
               if (Math.abs(var3) > 2) {
                  var3 = Math.abs(var3);
                  var3 = ab.oc.nextInt(var3 + 1) - ab.oc.nextInt(var3 + 1);
               }

               new t(var5.u, var5.x.b, var6, var1, var2, var3, var4);
            }

            this.v = this.u;
         }
      }
   }
}
