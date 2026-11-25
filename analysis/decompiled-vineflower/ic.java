import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.bluetooth.ServiceRecord;
import javax.microedition.io.StreamConnection;
import javax.microedition.io.StreamConnectionNotifier;
import wfree.C;

final class ic extends Thread {
   private final db b;

   ic(db var1) {
      this.b = var1;
   }

   public final void run() {
      boolean var7 = ab.xc;
      this.b.b = 4;

      try {
         db.b(this.b, (StreamConnectionNotifier)C.open("btspp://localhost:" + f.g.toString()));
         this.b.t = db.k(this.b).getRecord(db.j(this.b)).getConnectionURL(0, false);
         new StringBuffer().append("myurl='").append(this.b.t).append("'").toString();
      } catch (Exception var12) {
         new StringBuffer().append("cts notif ex ").append(var12).toString();
         db.d(this.b, true);
         db.l(this.b).b(4);
         return;
      }

      boolean var1 = false;
      StreamConnection var3 = null;
      int var4 = db.m(this.b).size() - 1;

      while (var4 >= 0) {
         ServiceRecord var2 = (ServiceRecord)db.m(this.b).elementAt(var4);
         new StringBuffer().append("cts rec").append(var4).toString();

         try {
            String var17 = var2.getConnectionURL(0, false);
            new StringBuffer().append("cts url='").append(var17).append("'").toString();
            var3 = (StreamConnection)C.open(var17);
            if (db.e(this.b)) {
               try {
                  var3.close();
                  return;
               } catch (Exception var11) {
                  return;
               }
            }

            OutputStream var18 = var3.openOutputStream();
            InputStream var5 = var3.openInputStream();
            var18.write(ab.b(4));
            byte[] var6;
            (var6 = new byte[1])[0] = (byte)this.b.t.length();
            var18.write(var6);
            var18.write(this.b.t.getBytes());
            var6[0] = ab.ec;
            var18.write(var6);
            var18.flush();
            var6 = new byte[4];
            var5.read(var6);
            if (db.e(this.b)) {
               return;
            }

            int var19 = ab.b(var6[0], var6[1], var6[2], var6[3]);
            new StringBuffer().append("rd ver=").append(var19).toString();
            if (var19 != 0) {
               if (var19 > 4) {
                  db.d(this.b, true);
                  db.l(this.b).b(9);
                  return;
               }

               if (var19 < 4) {
                  db.d(this.b, true);
                  db.l(this.b).b(10);
                  return;
               }
            }

            Thread.sleep(3000L);
            var1 = true;
            break;
         } catch (IOException var15) {
            new StringBuffer().append("cts conn ex ").append(var15).toString();
            var4--;
            if (var7) {
               break;
            }
         } catch (Exception var16) {
            new StringBuffer().append("cts conn ex ").append(var16).toString();
            db.d(this.b, true);
            db.l(this.b).b(4);
            return;
         }
      }

      try {
         var3.close();
      } catch (Exception var10) {
      }

      if (!var1) {
         db.i(this.b);
         return;
      }

      this.b.b = 5;

      while (true) {
         while (true) {
            if (db.e(this.b) || this.b.b != 5) {
               return;
            }

            try {
               var3 = db.j(this.b).acceptAndOpen();
               if (db.e(this.b) || this.b.b != 5) {
                  try {
                     var3.close();
                  } catch (Exception var9) {
                  }

                  db.n(this.b);
                  return;
               }
               break;
            } catch (Exception var13) {
               if (db.e(this.b)) {
                  return;
               }

               new StringBuffer().append("cts acpt ex ").append(var13).toString();
               Thread.yield();
               if (var7) {
                  break;
               }
            }
         }

         try {
            InputStream var21 = var3.openInputStream();
            OutputStream var20 = var3.openOutputStream();
            this.b.d = new kb(db.o(this.b), var21, var20);
            break;
         } catch (Exception var14) {
            new StringBuffer().append("cts CC ex ").append(var14).toString();

            try {
               var3.close();
            } catch (Exception var8) {
            }

            Thread.yield();
         }
      }

      db.b(this.b, var3);
      db.n(this.b);
   }
}
