import javax.microedition.lcdui.Graphics;

public final class l {
   public static byte[][] b = new byte[][]{
      {0, -13, 0, 1},
      {0, -19, 0, 1},
      {0, -9, 0, 1},
      {0, -10, 0, 1},
      {0, -12, 0, 1},
      {0, -2, 0, 1},
      {0, -10, 0, 1},
      {0, -2, 0, 1},
      {0, -2, 0, 1},
      {0, 0, 0, 1},
      {0, -2, 0, 1},
      {0, 0, 0, 0},
      {0, -6, 0, 1},
      {0, 0, 0, 0},
      {0, 0, 0, 0},
      {0, 0, 0, 0},
      {0, 0, 0, 0},
      {0, 0, 0, 0}
   };
   private byte c;
   private pb d;
   private byte e;
   private byte f;
   private boolean g;

   public l(byte var1, pb var2, byte[] var3) {
      this.c = var1;
      this.d = var2;
      switch (this.c) {
         case 0:
            this.e = var3[0];
            this.f = var3[1];
            this.g = var3[2] == 1;
      }
   }

   public final void b(Graphics var1, q var2) {
      boolean var9 = ab.xc;
      switch (this.c) {
         case 0:
            byte var7;
            byte var8;
            int var14;
            int var15;
            byte var17;
            int var18 = var2.c / 10 - fb.Ge;
            int var19 = var2.d / 10 - fb.He - var2.Ib;
            nb var16 = var2.Gc;
            var15 = var19;
            var14 = var18;
            var13 = var1;
            var11 = this;
            var17 = var16.j;
            var7 = var11.e;
            var8 = var11.f;
            label63:
            if (!var11.g) {
               if (var16.g == q.I[0]) {
                  var17 = q.H[0];
                  if (var16.j - 12 == 2) {
                     var7--;
                  }

                  if (var16.j - 12 != 3) {
                     break label63;
                  }

                  var7--;
                  if (!var9) {
                     break label63;
                  }
               }

               if (var16.g == q.J[0]) {
                  var17 = q.H[1];
                  if (var16.j - 17 == 2) {
                     var8--;
                  }

                  if (var16.j - 17 == 3) {
                     var8--;
                  }

                  var7 = (byte)(var7 + 2);
                  if (!var9) {
                     break label63;
                  }
               }

               if (var16.g == q.K[0]) {
                  var17 = q.H[2];
                  if (var16.j - 22 == 2) {
                     var7--;
                  }

                  if (var16.j - 22 == 3) {
                     var7--;
                  }

                  var8 = (byte)(var8 + 2);
                  if (!var9) {
                     break label63;
                  }
               }

               if (var16.g == q.L[0]) {
                  var17 = q.H[3];
                  if (var16.j - 27 == 0) {
                     var8--;
                  }

                  if (var16.j - 27 == 1) {
                     var8--;
                  }

                  var7 = (byte)(var7 - 2);
               }
            }

            var11.d.b = var17;
            var11.d.b(var14 - var11.d.d / 2 + var7, var15 - var11.d.e / 2 + var8);
            var11.d.b(var13);
            return;
         case 1:
            int var10002 = var2.c / 10 - fb.Ge;
            int var10003 = var2.d / 10 - fb.He - var2.Ib;
            nb var5 = var2.Gc;
            int var4 = var10003;
            int var3 = var10002;
            Graphics var12 = var1;
            l var10 = this;
            byte var6 = var5.j;
            var10.d.b = var6;
            var10.d.b(var3 - var10.d.d / 2, var4 - var10.d.e / 2);
            var10.d.b(var12);
      }
   }
}
