import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class pb {
   public int b = 0;
   public int c = 0;
   public int d;
   public int e;
   public int f;
   public int g;
   public int h;
   private int[] i;
   private Image j;

   public final void b(Graphics var1) {
      if (this.b < this.i.length) {
         var1.drawRegion(this.j, this.i[this.b], 0, this.d, this.e, this.c, this.f, this.g, 0);
      }
   }

   public final void b(int var1, int var2) {
      this.f = var1;
      this.g = var2;
   }

   public pb(Image var1, int var2, int var3) {
      this.j = var1;
      this.d = var2;
      this.e = var3;
      this.b();
   }

   private void b() {
      boolean var2 = ab.xc;
      this.h = this.j.getWidth() / this.d;
      this.i = new int[this.h];
      int var1 = 0;

      while (var1 < this.h) {
         this.i[var1] = var1 * this.d;
         var1++;
         if (var2) {
            break;
         }
      }
   }

   public pb(Image var1) {
      this.j = var1;
      this.d = this.j.getWidth();
      this.e = this.j.getHeight();
      this.b();
   }
}
