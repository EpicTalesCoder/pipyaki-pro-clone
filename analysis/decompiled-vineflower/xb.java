import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.io.StreamConnection;

final class xb extends Thread {
   private final f b;

   xb(f var1) {
      this.b = var1;
   }

   public final void run() {
      boolean var10 = ab.xc;
      this.b.b();

      label126:
      while (true) {
         boolean var10000 = this.b.k;

         label123:
         while (var10000 && !this.b.c) {
            StreamConnection var1;
            try {
               var1 = f.b(this.b).acceptAndOpen();
            } catch (Exception var14) {
               if (this.b.k && !this.b.c) {
                  new StringBuffer().append("lst ex ").append(var14).toString();
                  Thread.yield();
                  if (!var10) {
                     continue label126;
                  }
               }

               return;
            }

            if (this.b.k && !this.b.c) {
               this.b.c();

               try {
                  InputStream var5 = var1.openInputStream();
                  OutputStream var6;
                  (var6 = var1.openOutputStream()).write(ab.b(4));
                  var6.flush();

                  while (true) {
                     byte[] var8 = new byte[4];
                     var5.read(var8);
                     if (!this.b.c && this.b.k) {
                        int var3;
                        boolean var7 = (var3 = ab.b(var8[0], var8[1], var8[2], var8[3])) == 4;
                        int var17 = var5.read();
                        new StringBuffer().append("prc len=").append(var17).toString();
                        if (!this.b.c && this.b.k) {
                           if (var17 > 0) {
                              byte[] var9 = new byte[var17];
                              var5.read(var9);
                              String var2 = new String(var9);
                              var9 = new byte[1];
                              var5.read(var9);
                              byte var4 = var9[0];
                              new StringBuffer().append("prc url='").append(var2).append("'").toString();
                              if (!var10) {
                                 Thread.sleep(3000L);
                                 if (var7) {
                                    String var18 = f.b(var2);
                                    int var20 = 0;

                                    while (var20 < f.c(this.b).size()) {
                                       eb var16 = (eb)f.c(this.b).elementAt(var20);
                                       var10000 = var18.equals(f.b(var16.b));
                                       if (var10) {
                                          continue label123;
                                       }

                                       if (var10000) {
                                          f.c(this.b).removeElementAt(var20);
                                          if (!var10) {
                                             break;
                                          }
                                       }

                                       var20++;
                                       if (var10) {
                                          break;
                                       }
                                    }

                                    f.c(this.b).addElement(new eb(this.b, var2, var3, var4));
                                 }

                                 try {
                                    var5.close();
                                 } catch (Exception var13) {
                                 }

                                 try {
                                    var6.close();
                                 } catch (Exception var12) {
                                 }
                                 break;
                              }
                           }

                           Thread.yield();
                           continue;
                        }

                        return;
                     }

                     return;
                  }
               } catch (Exception var15) {
                  new StringBuffer().append("prc ex ").append(var15).toString();
               }

               try {
                  var1.close();
               } catch (Exception var11) {
               }

               this.b.b();
            }

            Thread.yield();
            if (!var10) {
               continue label126;
            }
            break;
         }

         return;
      }
   }
}
