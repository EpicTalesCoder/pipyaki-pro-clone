import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class h {
   public int b;
   public Vector c = new Vector();
   private int d;

   public h() {
      this.b = 1;
      this.d = ab.C.c() + ab.C.w;
   }

   public final void b(Graphics var1) {
      boolean var5 = ab.xc;
      int var3 = this.b;
      int var2 = 0;

      while (var2 < this.c.size()) {
         m var4 = (m)this.c.elementAt(var2);
         ab.C.b(var1, var4.b, ab.D / 2, var3, -1, 2);
         var3 += this.d;
         var2++;
         if (var5) {
            break;
         }
      }
   }

   public final void b(String var1) {
      if (this.c.size() == 3) {
         this.c.removeElementAt(0);
      }

      this.b = this.b - this.d;
      this.c.insertElementAt(new m(this, var1), 0);
   }
}
