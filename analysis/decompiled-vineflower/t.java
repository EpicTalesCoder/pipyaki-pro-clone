import javax.microedition.lcdui.Graphics;

public final class t extends o {
   public static int r = 0;
   private static byte[] s = new byte[]{4, 5, 6, 7};
   private static byte[] t = new byte[]{0, 1, 2, 3, 4};
   public byte u;
   private byte v;
   private byte w;
   public nb x;
   private int y;
   public int z;
   public int A;
   private int B;
   public boolean C;
   public boolean D;

   public t(byte var1, pb var2, int var3, int var4, int var5, int var6, int var7) {
      super((byte)-1, (byte)-1, var4, var5);
      this.u = var1;
      this.l = var6;
      this.m = var7;
      this.B = 0;
      this.y = -1;
      switch (this.u) {
         case 0:
            this.x = new nb(var2);
            this.x.b((byte)4, (byte)2);
            this.v = 0;
            this.z = var3 + ab.oc.nextInt(25);
            this.B = 10;
            this.w = 3;
            if (!ab.xc) {
               break;
            }
         case 1:
            this.x = new nb(var2);
            this.x.b(t, true, false, (byte)1);
            this.v = 0;
            this.y = this.z = var3;
            this.B = 1;
            this.w = 2;
      }

      if (fb.Vd != null) {
         fb.Vd.addElement(this);
         r++;
      }
   }

   public final void h() {
      super.h();
      this.x.c();
      boolean var1 = false;
      if (this.y != -1) {
         this.y--;
         if (this.y < 0) {
            this.y = 0;
         }
      }

      label50: {
         if (this.u == 0) {
            if (this.v == 0 && !this.x.e) {
               this.x.b(s, true, false, this.w);
               this.v = 1;
               this.y = this.z;
            }

            if (this.v == 1 && this.y == 0) {
               this.x.b();
               this.x.b((byte)(this.x.b.h - 1), this.w);
               this.v = 2;
            }

            if (this.v != 2 || this.x.e) {
               break label50;
            }

            var1 = true;
            if (!ab.xc) {
               break label50;
            }
         }

         if (this.u == 1) {
            if (this.v == 0 && this.y == 0) {
               this.x.b();
               this.x.b((byte)(this.x.b.h - 1), this.w);
               this.v = 1;
            }

            if (this.v == 1 && !this.x.e) {
               var1 = true;
            }
         }
      }

      this.A = this.A + this.B;
      if (var1) {
         this.C = true;
      }
   }

   public final void b(Graphics var1) {
      this.x.b(var1, super.c / 10 - fb.Ge, super.d / 10 - this.A / 10 - fb.He);
   }
}
