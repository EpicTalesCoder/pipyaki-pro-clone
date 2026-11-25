final class mc extends Thread {
   public final void run() {
      boolean var1 = ab.xc;

      while (wb.v >= 0 || ab.p) {
         ab.z.repaint();

         try {
            Thread.sleep(50L);
         } catch (Exception var2) {
         }

         Thread.yield();
         if (var1) {
            break;
         }
      }
   }
}
