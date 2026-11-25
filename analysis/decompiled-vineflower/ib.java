import java.io.DataInputStream;

public final class ib {
   private static char b = ";".charAt(0);
   public static boolean c = true;
   private static String[] d;
   public static int e = -1;

   public static void b() {
      d = b("/lang.txt");
   }

   private static String[] b(String var0) {
      try {
         DataInputStream var4;
         byte[] var1 = new byte[(var4 = new DataInputStream(midlet.a.getClass().getResourceAsStream(var0))).available() - 3];
         var4.read();
         var4.read();
         var4.read();
         var4.read(var1);

         try {
            var4.close();
         } catch (Exception var2) {
         }

         return rb.b(new String(var1, "UTF-8"), b);
      } catch (Exception var3) {
         return null;
      }
   }

   public static String b(int var0) {
      return d != null ? d[var0] : "";
   }

   public static String c(int var0) {
      return d != null ? d[var0 + 64] : "";
   }

   public static String b(String var0, int var1) {
      String[] var2;
      if ((var2 = b(var0)) == null) {
         return "";
      } else {
         return var1 >= 0 && var1 < var2.length ? var2[var1] : "";
      }
   }
}
