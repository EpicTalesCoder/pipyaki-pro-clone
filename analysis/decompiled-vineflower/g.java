public final class g {
   public byte b;
   public byte c;
   public byte d;
   public byte[] e;

   public g(byte var1, byte var2, byte var3, byte[] var4) {
      this.d = var1;
      this.b = var2;
      this.c = var3;
      this.e = var4;
      if (this.d == 3) {
         fb.h++;
      }
   }

   public static g b(byte var0, byte var1) {
      boolean var3 = ab.xc;
      if (fb.Sd != null && fb.Sd.size() > 0) {
         int var2 = 0;

         while (var2 < fb.Sd.size()) {
            if (((g)fb.Sd.elementAt(var2)).b == var0 && ((g)fb.Sd.elementAt(var2)).c == var1) {
               return (g)fb.Sd.elementAt(var2);
            }

            var2++;
            if (var3) {
               break;
            }
         }
      }

      return null;
   }
}
