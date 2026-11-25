import javax.microedition.lcdui.Graphics;

public class o {
   private pb b;
   public int c;
   public int d;
   protected byte e;
   protected byte f;
   public byte g;
   public byte h;
   private byte i;
   private byte j;
   private boolean k;
   public int l;
   public int m;
   public int n;
   private int o;
   private int p;
   public static boolean q;

   public o(byte var1, byte var2, int var3, int var4) {
      this.e = var1;
      this.f = var2;
      this.c = var3 * 10;
      this.d = var4 * 10;
      this.g = (byte)(var3 / 30);
      this.h = (byte)(var4 / 30);
      this.o = -1;
      this.p = -1;
      if (this.e != -1 && this.f != -1) {
         if (this.e == 0) {
            this.b = fb.ub;
         }

         if (this.e == 1) {
            this.b = fb.vb;
         }

         if (this.e == 2) {
            this.b = fb.wb;
         }

         if (this.e == 3) {
            this.b = fb.zd;
         }

         if (this.e == 4) {
            this.b = fb.Ad;
         }

         if (this.e == 5) {
            this.b = fb.Bd;
         }

         if (this.b != null) {
            this.o = this.b.d;
            this.p = this.b.e;
            return;
         }

         System.out.println("ogr=" + this.e);
      }
   }

   public static int b(int var0, int var1, int var2, int var3) {
      return (int)Math.sqrt((var2 - var0) * (var2 - var0) + (var3 - var1) * (var3 - var1));
   }

   public static boolean b(byte var0, byte var1) {
      return var0 >= 0 && var0 < fb.Pe && var1 >= 0 && var1 < fb.Qe;
   }

   public final boolean a() {
      return b(this.g, this.h);
   }

   public final boolean b() {
      return this.g > 0 && this.g < fb.Pe - 1 && this.h > 0 && this.h < fb.Qe - 1;
   }

   public static boolean c(byte var0, byte var1) {
      return var0 >= fb.Se && var0 <= fb.Se + fb.Ue && var1 >= fb.Te && var1 <= fb.Te + fb.Ve;
   }

   public final boolean c() {
      byte var2 = this.h;
      byte var1 = this.g;
      return this.g >= fb.We && var1 <= fb.We + fb.Ye && var2 >= fb.Xe && var2 <= fb.Xe + fb.Ze;
   }

   public static boolean c(int var0, int var1, int var2, int var3) {
      var0 -= fb.Ge;
      var1 -= fb.He;
      if (ab.b(var0, var1, 0, 0, ab.D, ab.E)) {
         return true;
      }

      if (ab.b(var0 - var2 / 2, var1 - var3 / 2, 0, 0, ab.D, ab.E)) {
         return true;
      }

      if (ab.b(var0 + var2 / 2, var1 - var3 / 2, 0, 0, ab.D, ab.E)) {
         return true;
      }

      if (ab.b(var0 + var2 / 2, var1 + var3 / 2, 0, 0, ab.D, ab.E)) {
         return true;
      }

      if (ab.b(var0 - var2 / 2, var1 + var3 / 2, 0, 0, ab.D, ab.E)) {
         return true;
      }

      if (var2 >= ab.D || var3 >= ab.E) {
         if (var1 - var3 / 2 >= 0 && var1 - var3 / 2 <= ab.E && var0 - var2 / 2 <= 0 && var0 + var2 / 2 >= ab.D) {
            return true;
         }

         if (var1 + var3 / 2 >= 0 && var1 + var3 / 2 <= ab.E && var0 - var2 / 2 <= 0 && var0 + var2 / 2 >= ab.D) {
            return true;
         }

         if (var0 - var2 / 2 >= 0 && var0 - var2 / 2 <= ab.D && var1 - var3 / 2 <= 0 && var1 + var3 / 2 >= ab.E) {
            return true;
         }

         if (var0 + var2 / 2 >= 0 && var0 + var2 / 2 <= ab.D && var1 - var3 / 2 <= 0 && var1 + var3 / 2 >= ab.E) {
            return true;
         }
      }

      return false;
   }

   public boolean d() {
      if (this.o == -1 || this.p == -1) {
         try {
            throw new Exception("ERROR: only object class can use this function. u can initialize w & h params in subclass constructor of object");
         } catch (Exception var2) {
            var2.printStackTrace();
         }
      }

      return c(this.c / 10, this.d / 10, this.o, this.p);
   }

   public boolean e() {
      return this.l != 0 || this.m != 0;
   }

   public final boolean g() {
      boolean var1 = this.k;
      this.k = false;
      return var1;
   }

   public final void b(int var1, int var2) {
      this.c = var1 * 10;
      this.d = var2 * 10;
   }

   public void d(byte var1, byte var2) {
      this.g = var1;
      this.h = var2;
      this.b(var1 * 30 + 15, var2 * 30 + 15);
   }

   public void h() {
      this.c = this.c + this.l;
      this.d = this.d + this.m;
      if (fb.kb % 3L == 0L) {
         this.n = (int)Math.sqrt(this.l * this.l + this.m * this.m);
      }

      this.g = (byte)(this.c / 10 / 30);
      this.h = (byte)(this.d / 10 / 30);
      if (this.i != this.g || this.j != this.h) {
         this.k = true;
         this.i = this.g;
         this.j = this.h;
      }
   }

   public void b(Graphics var1) {
      int var2 = -fb.Ge;
      int var3 = -fb.He;
      if (this.b != null) {
         this.b.b = this.f;
         this.b.b(this.c / 10 - this.o / 2 + var2, this.d / 10 - this.p / 2 + var3);
         this.b.b(var1);
      }
   }
}
