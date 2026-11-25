import java.util.Random;
import javax.microedition.lcdui.Font;
import javax.microedition.midlet.MIDlet;

public class midlet extends MIDlet {
   public static midlet a;
   public static boolean b;

   protected void startApp() {
      if (!b) {
         b = true;
         a = this;
         ab.oc = new Random();
         ab.F = Font.getFont(0, 0, 8);
         ab.z = new rc();
         wb.c();
         ab.l = 2;
         ab.G = new ub();
         hb.g();
         qb.n();
         wb.b();
      }
   }

   protected void pauseApp() {
   }

   protected void destroyApp(boolean var1) {
      ab.o = true;
      rc.c.setCurrent(null);
      ab.A = null;
      if (ab.G != null) {
         ab.G.d();
      }
   }

   public void a() {
      if ((ab.f = this.getAppProperty("MIDlet-Version")) == null) {
         ab.f = "";
      }

      ab.c();
   }

   public void b() {
      this.notifyDestroyed();
      this.destroyApp(true);
   }
}
