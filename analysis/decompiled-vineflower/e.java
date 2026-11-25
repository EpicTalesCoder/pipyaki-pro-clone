import java.util.Vector;

abstract class e {
   public int b = 0;
   public boolean c;
   protected Vector d = new Vector();
   protected c e;
   protected ob f;

   public e(c var1, ob var2) {
      this.e = var1;
      this.f = var2;
   }

   public int b() {
      return this.d.size();
   }

   abstract void d();

   public final void f() {
      byte[] var1 = new byte[]{110};
      this.b(var1);
      this.i();
   }

   public final void g() {
      boolean var3 = ab.xc;
      int var1 = 0;

      while (var1 < this.d.size()) {
         ((jb)this.d.elementAt(var1)).k();
         var1++;
         if (var3) {
            break;
         }
      }
   }

   public final void h() {
      boolean var3 = ab.xc;
      int var1 = 0;

      while (var1 < this.d.size()) {
         ((jb)this.d.elementAt(var1)).l();
         var1++;
         if (var3) {
            break;
         }
      }
   }

   public final byte b(byte var1) {
      return ((jb)this.d.elementAt(var1 - 2)).c;
   }

   public final void i() {
      boolean var3 = ab.xc;
      int var1 = 0;

      while (var1 < this.d.size()) {
         ((jb)this.d.elementAt(var1)).g();
         var1++;
         if (var3) {
            break;
         }
      }
   }

   public final void j() {
      boolean var3 = ab.xc;
      int var1 = 0;

      while (var1 < this.d.size()) {
         ((jb)this.d.elementAt(var1)).h();
         var1++;
         if (var3) {
            break;
         }
      }
   }

   protected final void k() {
      boolean var3 = ab.xc;
      synchronized (this) {
         this.notify();

         while (this.d.size() != 0) {
            kb var1 = (kb)this.d.elementAt(0);
            this.d.removeElementAt(0);
            var1.b();
            if (!var3 && !var3) {
               continue;
            }
            break;
         }
      }
   }

   abstract void b(jb var1, byte[] var2);

   abstract void b(byte[] var1);

   abstract void b(byte[] var1, byte var2);

   abstract void b(int var1, byte[] var2);

   public void l() {
   }

   public void b(String var1, int var2, byte[] var3, byte var4, boolean var5, boolean var6) {
   }

   public final int m() {
      boolean var3 = ab.xc;
      if (this.d == null) {
         return 0;
      }

      int var1 = 0;
      int var2 = 0;

      int var10000;
      while (true) {
         if (var2 < this.d.size()) {
            var10000 = var1 + ((jb)this.d.elementAt(var2)).h.size();
            if (var3) {
               break;
            }

            var1 = var10000;
            var2++;
            if (!var3) {
               continue;
            }
         }

         var10000 = var1;
         break;
      }

      return var10000;
   }
}
