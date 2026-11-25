import java.util.Vector;

public final class d {
   public int b;
   public int c;
   public pb d;
   public nb e;
   public byte f;
   public int g;
   public boolean h;
   public boolean i;

   public d(pb var1, byte var2, int var3, int var4, int var5) {
      boolean var6 = ab.xc;
      super();
      if (!j.c(var3 / 30, var4 / 30)) {
         Vector var10000;
         label36: {
            this.d = var1;
            this.b = var3;
            this.c = var4;
            this.g = var5;
            this.f = (byte)var2;
            this.h = false;
            if (fb.Wd != null) {
               int var7 = 0;
               var2 = 0;

               while (var2 < fb.Wd.size()) {
                  var10000 = fb.Wd;
                  if (var6) {
                     break label36;
                  }

                  if (((d)fb.Wd.elementAt(var2)).b / 30 == this.b / 30 && ((d)fb.Wd.elementAt(var2)).c / 30 == this.c / 30) {
                     if (++var7 >= 2) {
                        ((d)fb.Wd.elementAt(var2)).i = true;
                     }
                  }

                  var2++;
                  if (var6) {
                     break;
                  }
               }
            }

            var10000 = fb.Wd;
         }

         if (var10000 != null) {
            fb.Wd.addElement(this);
         }
      }
   }

   public d(nb var1, int var2, int var3, int var4, boolean var5) {
      this.e = var1;
      this.b = var2;
      this.c = var3;
      this.g = var4;
      this.h = var5;
      if (fb.Wd != null) {
         fb.Wd.addElement(this);
      }
   }
}
