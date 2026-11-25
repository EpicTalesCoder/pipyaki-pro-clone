import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Vector;
import javax.bluetooth.LocalDevice;
import javax.microedition.rms.RecordStore;

public final class n {
   private String b;
   private Vector c;

   public n(String var1, boolean var2) {
      this.b = var1;
      this.c = new Vector();
      if (var2) {
         try {
            RecordStore var8 = RecordStore.openRecordStore(this.b, false);
            var6 = new ByteArrayInputStream(var8.getRecord(1));
            var8.closeRecordStore();
         } catch (Exception var4) {
            new StringBuffer().append("r err: ").append(var4).toString();
            return;
         }

         try {
            while (true) {
               new vb(this, this.c, var6);
            }
         } catch (Exception var5) {
            new StringBuffer().append("size=").append(this.c.size()).toString();
            if (this.c.size() > 0) {
               n var7 = this;

               try {
                  if (var7.g().equals(var7.f(" "))) {
                     return;
                  }
               } catch (Exception var3) {
               }

               var7.c.removeAllElements();
            }
         }
      }
   }

   public final void b() {
      boolean var6 = ab.xc;
      if (this.c.size() > 0) {
         n var4 = this;
         this.b("t", "" + System.currentTimeMillis());
         var4.b(" ", var4.g());
      }

      try {
         RecordStore var2 = RecordStore.openRecordStore(this.b, true);
         ByteArrayOutputStream var3 = new ByteArrayOutputStream();
         int var1 = 0;

         int var10;
         while (true) {
            if (var1 < this.c.size()) {
               vb var10000 = (vb)this.c.elementAt(var1);
               ByteArrayOutputStream var5 = var3;
               vb var9 = var10000;

               try {
                  label54: {
                     var5.write((byte)var9.b.length());
                     var5.write(var9.b.getBytes());
                     var5.write(var9.e);
                     var10 = var9.e;
                     if (var6) {
                        break;
                     }

                     if (var9.e == 0) {
                        var5.write(var9.c);
                        if (!var6) {
                           break label54;
                        }
                     }

                     if (var9.e == 1) {
                        var5.write((byte)var9.d.length());
                        var5.write(var9.d.getBytes());
                     }
                  }
               } catch (IOException var7) {
               }

               var1++;
               if (!var6) {
                  continue;
               }
            }

            var3.flush();
            var10 = var2.getNextRecordID();
            break;
         }

         label31: {
            if (var10 == 1) {
               var2.addRecord(var3.toByteArray(), 0, var3.size());
               if (!var6) {
                  break label31;
               }
            }

            var2.setRecord(1, var3.toByteArray(), 0, var3.size());
         }

         var2.closeRecordStore();
         var3.close();
      } catch (Exception var8) {
      }
   }

   public final void c() {
      try {
         this.c.removeAllElements();
         this.c = null;
      } catch (Exception var1) {
      }
   }

   public final void b(String var1, byte var2) {
      this.c(var1, true).b(var2);
   }

   public final void b(String var1, long var2) {
      this.b(var1, "" + var2);
   }

   public final void b(String var1, String var2) {
      vb var10000 = this.c(var1, true);
      var2 = var2;
      vb var3 = var10000;
      var10000.e = 1;
      var3.d = var2;
   }

   public final void b(String var1, boolean var2) {
      vb var3 = this.c(var1, true);
      if (var2) {
         var3.b((byte)1);
      } else {
         var3.b((byte)0);
      }
   }

   public final byte b(String var1) {
      vb var2;
      if ((var2 = this.c(var1, false)) == null) {
         throw new a();
      } else {
         return var2.c;
      }
   }

   public final int c(String var1) {
      return Integer.parseInt(this.f(var1));
   }

   public final long d(String var1) {
      return Long.parseLong(this.f(var1));
   }

   public final boolean e(String var1) {
      return this.b(var1) == 1;
   }

   public final String f(String var1) {
      vb var2;
      if ((var2 = this.c(var1, false)) == null) {
         throw new a();
      } else {
         return var2.d;
      }
   }

   private vb c(String var1, boolean var2) {
      boolean var5 = ab.xc;
      int var4 = 0;

      boolean var10000;
      while (true) {
         if (var4 < this.c.size()) {
            vb var3;
            var10000 = (var3 = (vb)this.c.elementAt(var4)).b.equals(var1);
            if (var5) {
               break;
            }

            if (var10000) {
               return var3;
            }

            var4++;
            if (!var5) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      if (var10000) {
         vb var6 = new vb(this, var1);
         this.c.addElement(var6);
         return var6;
      } else {
         return null;
      }
   }

   public static String d() {
      boolean var4 = ab.xc;
      String var0 = null;

      String var1;
      try {
         var1 = System.getProperty("microedition.platform");
      } catch (Exception var7) {
         var1 = null;
      }

      if (var1 != null) {
         try {
            if (var1.indexOf("Sony") >= 0) {
               var0 = System.getProperty("com.sonyericsson.imei");
            } else if (var1.indexOf("Samsung") >= 0) {
               var0 = System.getProperty("com.samsung.imei");
            } else if (var1.indexOf("Moto") >= 0) {
               var0 = System.getProperty("com.motorola.IMEI");
            } else if (var1.indexOf("Nokia") >= 0) {
               if ((var0 = System.getProperty("phone.imei")) == null) {
                  var0 = System.getProperty("com.nokia.IMEI");
               }

               if (var0 == null) {
                  var0 = System.getProperty("com.nokia.mid.imei");
               }
            } else if (var1.indexOf("Siemens") >= 0) {
               var0 = System.getProperty("com.siemens.imei");
            }
         } catch (Exception var6) {
            var0 = null;
         }
      }

      if (var0 == null) {
         var0 = "";
      }

      if (var0.equals("")) {
         try {
            var0 = System.getProperty("IMEI");
         } catch (Exception var5) {
            var0 = null;
         }
      }

      if (var0 == null) {
         var0 = "";
      }

      if (!var0.equals("")) {
         String var2 = "";
         int var8 = 0;

         String var10000;
         label72: {
            while (var8 < var0.length()) {
               var10000 = var0;
               if (var4) {
                  break label72;
               }

               char var3;
               if ((var3 = var0.charAt(var8)) >= '0' && var3 <= '9') {
                  var2 = var2 + var3;
               }

               var8++;
               if (var4) {
                  break;
               }
            }

            var10000 = var2;
         }

         var0 = var10000;
      }

      return var0;
   }

   public static String e() {
      try {
         Class.forName("javax.bluetooth.LocalDevice");
         String var0;
         if ((var0 = LocalDevice.getLocalDevice().getFriendlyName()) == null) {
            var0 = "";
         }

         return var0;
      } catch (Throwable var1) {
         return "";
      }
   }

   private String f() {
      try {
         return this.f("t");
      } catch (Exception var1) {
         return " ";
      }
   }

   private String g() {
      boolean var6 = ab.xc;
      String var1 = d() + this.f();
      String var2 = "";
      int var3 = 0;

      String var10000;
      while (true) {
         if (var3 < this.c.size()) {
            vb var4;
            var10000 = (var4 = (vb)this.c.elementAt(var3)).b;
            if (var6) {
               break;
            }

            if (!var10000.equals(" ")) {
               var2 = var2 + vb.b(var4);
            }

            var3++;
            if (!var6) {
               continue;
            }
         }

         var10000 = var1;
         break;
      }

      byte[] var7 = var10000.getBytes();
      byte[] var8 = var2.getBytes();
      byte[] var10 = new byte[var7.length];
      var3 = 0;
      int var5 = 0;

      while (var5 < var8.length) {
         var10[var3] = (byte)(var7[var3] + var8[var3] + var3 - var5);
         if (++var3 == var7.length) {
            var3 = 0;
         }

         var5++;
         if (var6) {
            break;
         }
      }

      return new String(var10);
   }
}
