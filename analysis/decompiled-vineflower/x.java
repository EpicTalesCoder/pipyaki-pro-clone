import javax.microedition.lcdui.Graphics;

public final class x {
   public int b;
   public int c;
   private int d;
   public int e;
   private int f;
   private int g;
   public int h;
   public int i;

   public x(int var1, int var2, int var3) {
      label83: {
         boolean var4 = ab.xc;
         super();
         this.b = var1;
         this.c = var2;
         this.d = var3;
         this.g = 0;
         if (this.b == 0) {
            if (wb.v == 1 && wb.P) {
               wb.P = false;
               wb.v = 2;
               x var5 = new x(4, this.c, wb.y);
               wb.z.addElement(var5);
               this.c = this.c + var5.e;
               wb.c(this.c);
               this.g = 4;
               break label83;
            }

            if (wb.v == 3 && wb.P) {
               wb.P = false;
               wb.v = 4;
               wb.c(this.c);
               this.g = 4;
               if (!var4) {
                  break label83;
               }
            }

            if (wb.v == 5 && wb.P) {
               wb.P = false;
               wb.v = 6;
               wb.c(this.c);
               this.g = 4;
               if (!var4) {
                  break label83;
               }
            }

            label76: {
               while (this.g == wb.J) {
                  this.g = ab.oc.nextInt(4);
                  if (var4) {
                     break label76;
                  }

                  if (var4) {
                     break;
                  }
               }

               wb.J = this.g;
            }

            if (wb.v < 2) {
               break label83;
            }

            if (wb.v == 7) {
               wb.b = true;
            }

            wb.P = true;
            if (!var4) {
               break label83;
            }
         }

         if (this.b == 3) {
            this.i = ab.oc.nextInt(18);
            this.g = ab.oc.nextInt(2);
            this.h = ab.oc.nextInt(wb.K) + 2;
            if (!var4) {
               break label83;
            }
         }

         if (this.b != 4) {
            this.g = ab.oc.nextInt(3);
         }
      }

      if (this.b == 0) {
         this.e = wb.A[this.g].getWidth();
         this.f = wb.A[this.g].getHeight();
         this.d = this.d - this.f;
      } else if (this.b == 1) {
         this.e = wb.B[this.g].getWidth();
         this.f = wb.B[this.g].getHeight();
      } else if (this.b == 2) {
         this.e = wb.C[this.g].getWidth();
         this.f = wb.C[this.g].getHeight();
      } else if (this.b == 3) {
         this.e = wb.E[this.g].d;
         this.f = wb.E[this.g].e;
      } else {
         if (this.b == 4) {
            this.e = wb.F.getWidth();
            this.f = wb.F.getHeight();
            this.d = this.d - this.f;
            this.i = 0;
         }
      }
   }

   public final void b(Graphics var1) {
      int var2 = this.c + wb.w;
      int var3 = this.d + wb.x / 10;
      if (this.b == 0) {
         var1.drawImage(wb.A[this.g], var2, var3, 0);
      } else if (this.b == 1) {
         var1.drawImage(wb.B[this.g], var2, var3, 0);
      } else if (this.b == 2) {
         var1.drawImage(wb.C[this.g], var2, var3, 0);
      } else if (this.b == 3) {
         wb.E[this.g].b = this.i / 3;
         wb.E[this.g].b(var2, var3);
         wb.E[this.g].b(var1);
      } else {
         if (this.b == 4) {
            var1.drawImage(wb.F, var2, var3, 0);
         }
      }
   }
}
