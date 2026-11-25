import java.io.IOException;
import java.util.Vector;
import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;
import javax.microedition.io.StreamConnection;
import javax.microedition.io.StreamConnectionNotifier;

public final class db extends cb implements Runnable, DiscoveryListener {
   private boolean a;
   private int e;
   private LocalDevice f;
   private DiscoveryAgent g;
   private StreamConnectionNotifier h = null;
   private StreamConnection i;
   private RemoteDevice j;
   private boolean k;
   private Vector l = new Vector();
   private Vector m = new Vector();
   private Vector n = new Vector();
   private int o;
   private c p;
   private ob q;
   private boolean r;
   private db s;
   public String t;
   private boolean u;

   db(c var1, ob var2) {
      this.q = var2;
      this.p = var1;
      this.s = this;
      new Thread(this).start();
   }

   public final void run() {
      boolean var4 = ab.xc;

      try {
         this.f = LocalDevice.getLocalDevice();
         this.g = this.f.getDiscoveryAgent();
      } catch (Exception var5) {
         this.q.b(0);
         this.k = true;
         return;
      }

      db var1 = this;
      this.b = 1;
      RemoteDevice[] var2;
      if ((var2 = var1.g.retrieveDevices(0)) == null) {
         var1.e();
      } else if (var2.length == 0) {
         var1.e();
      } else {
         int var3 = 0;

         while (true) {
            if (var3 < var2.length) {
               var1.b(var2[var3]);
               var3++;
               if (var4) {
                  break;
               }

               if (!var4) {
                  continue;
               }
            }

            var1.b = 2;
            var1.q.b();
            break;
         }
      }
   }

   private void e() {
      this.p.b("i");
      this.b = 1;
      this.l.removeAllElements();
      this.m.removeAllElements();

      try {
         this.g.startInquiry(10390323, this);
         this.p.b("I");
      } catch (Exception var1) {
         this.j();
      }
   }

   private void j() {
      this.q.b(0);
      this.k = true;
   }

   public final void deviceDiscovered(RemoteDevice var1, DeviceClass var2) {
      if (this.b == 1 && !this.k) {
         this.b(var1);
      }
   }

   private void b(RemoteDevice var1) {
      if (!this.k) {
         if (this.l.indexOf(var1) == -1) {
            this.l.addElement(var1);
            String var2 = null;

            try {
               var2 = var1.getFriendlyName(false);
            } catch (IOException var3) {
            }

            if (var2 == null) {
               var2 = "";
            }

            label28: {
               if (var2.equals("")) {
                  var2 = "Unknown device";
                  if (!ab.xc) {
                     break label28;
                  }
               }

               var2 = ab.c(var2);
            }

            this.m.addElement(var2);
            this.q.b(var2);
         }
      }
   }

   public final void inquiryCompleted(int var1) {
      boolean var2 = ab.xc;
      if (!this.k && this.b == 3 && this.j != null) {
         this.k();
      } else if (this.b == 1 && !this.k) {
         label29: {
            switch (var1) {
               case 5:
                  this.p.b("t");
                  if (!var2) {
                     break;
                  }
               case 0:
                  this.p.b("q");
                  if (var2) {
                     break label29;
                  }
                  break;
               case 7:
                  this.p.b("e");
                  this.j();
                  return;
               default:
                  break label29;
            }

            this.b = 2;
            this.q.b();
            return;
         }

         this.p.b("E");
         this.j();
      }
   }

   public final void c() {
      this.p.b("r");
      if (this.b == 2) {
         this.e();
      }
   }

   public final void d() {
      if (!this.k) {
         this.b = 2;

         try {
            this.g.cancelInquiry(this.s);
         } catch (Exception var1) {
         }
      }
   }

   public final void b(int var1) {
      if (this.b == 2 || this.b == 1) {
         this.a = false;
         this.e = 0;
         this.r = false;
         if (var1 < this.m.size()) {
            this.j = (RemoteDevice)this.l.elementAt(var1);
            if (this.b == 1) {
               try {
                  this.b = 3;
                  this.g.cancelInquiry(this);
                  new jc(this).start();
                  return;
               } catch (Exception var2) {
               }
            }

            this.k();
         }
      }
   }

   private void k() {
      if (!this.u) {
         this.a = true;
         this.b = 3;
         this.n.removeAllElements();
         new kc(this).start();
      }
   }

   public final void servicesDiscovered(int var1, ServiceRecord[] var2) {
      boolean var3 = ab.xc;
      if (this.b == 3 && !this.k) {
         var1 = 0;

         while (var1 < var2.length) {
            this.n.addElement(var2[var1]);
            var1++;
            if (var3) {
               break;
            }
         }
      }
   }

   public final void serviceSearchCompleted(int var1, int var2) {
      this.u = false;
      if (this.b == 3 && !this.k) {
         if (this.n.size() > 0) {
            db var3 = this;
            new ic(var3).start();
         } else {
            new StringBuffer().append("ssc no services ").append(var2).toString();
            this.l();
         }
      }
   }

   private void l() {
      if (!this.k) {
         this.e++;
         if (this.e <= 3) {
            this.p.b("R!");
            this.k();
            return;
         }

         this.b = 2;
         this.q.b(1);
      }
   }

   private void m() {
      try {
         this.h.close();
      } catch (Exception var1) {
      }

      this.h = null;
   }

   public final void f() {
      this.k = true;
      this.b = 7;

      try {
         this.g.cancelInquiry(this);
      } catch (Exception var8) {
      }

      try {
         this.g.cancelServiceSearch(this.o);
      } catch (Exception var7) {
      }

      try {
         this.l.removeAllElements();
      } catch (Exception var6) {
      }

      try {
         this.m.removeAllElements();
      } catch (Exception var5) {
      }

      try {
         this.n.removeAllElements();
      } catch (Exception var4) {
      }

      this.m();
      db var1 = this;

      try {
         var1.d.b();
      } catch (Exception var3) {
      }

      var1.d = null;

      try {
         var1.i.close();
      } catch (Exception var2) {
      }

      var1.i = null;
      this.j = null;
      this.s = null;
      this.p = null;
      this.q = null;
   }

   public final int e() {
      return this.m.size();
   }

   public final void a() {
      this.d.k();
   }

   public final void b() {
      this.d.l();
   }

   static boolean b(db var0) {
      return var0.a;
   }

   static void c(db var0) {
      var0.k();
   }

   static boolean d(db var0) {
      return var0.r;
   }

   static boolean e(db var0) {
      return var0.k;
   }

   static boolean b(db var0, boolean var1) {
      return var0.r = true;
   }

   static int b(db var0, int var1) {
      return var0.o = var1;
   }

   static RemoteDevice f(db var0) {
      return var0.j;
   }

   static db g(db var0) {
      return var0.s;
   }

   static DiscoveryAgent h(db var0) {
      return var0.g;
   }

   static boolean c(db var0, boolean var1) {
      return var0.u = true;
   }

   static void i(db var0) {
      var0.l();
   }

   static StreamConnectionNotifier b(db var0, StreamConnectionNotifier var1) {
      return var0.h = var1;
   }

   static StreamConnectionNotifier j(db var0) {
      return var0.h;
   }

   static LocalDevice k(db var0) {
      return var0.f;
   }

   static boolean d(db var0, boolean var1) {
      return var0.k = true;
   }

   static ob l(db var0) {
      return var0.q;
   }

   static Vector m(db var0) {
      return var0.n;
   }

   static void n(db var0) {
      var0.m();
   }

   static c o(db var0) {
      return var0.p;
   }

   static StreamConnection b(db var0, StreamConnection var1) {
      return var0.i = var1;
   }
}
