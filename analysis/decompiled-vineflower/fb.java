import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class fb implements c, Runnable {
   public static boolean b;
   private boolean c = false;
   private long d = 0L;
   public static int e = 0;
   public static int f = 0;
   private static int g;
   public static int h;
   public tb i = null;
   public String j = "";
   private long k = 0L;
   private long l = 0L;
   private static final byte[][] m = new byte[][]{
      {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
      {1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1},
      {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1},
      {1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1},
      {1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1},
      {1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0},
      {0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0},
      {0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0}
   };
   private long n;
   private long o;
   public static int p;
   private int q;
   private int r;
   public static int s;
   private int t;
   private int u;
   private boolean v;
   public int w = -1;
   public byte x;
   public byte y;
   public int z;
   public boolean A;
   private int[] B = new int[4];
   private int C;
   private String D;
   private long E = 0L;
   private boolean F;
   private boolean G;
   private boolean H;
   public static fb I;
   private int J;
   private Thread K;
   public static int L;
   public static boolean M = false;
   public cb N;
   public e O;
   private byte[] P;
   private h Q;
   private boolean R;
   private int S = ab.oc.nextInt(200) + 100;
   private int T = 0;
   private int U = 0;
   private int V = -1;
   private static int W;
   private static int X;
   private static int Y;
   private static int Z;
   private int ab;
   private int bb;
   private boolean cb;
   private int db;
   private byte eb;
   private int fb;
   private int gb;
   private int[] hb = new int[]{0, 0};
   public static s ib;
   public static s jb;
   public static long kb = 0L;
   private static byte lb = 6;
   private static int mb = 1000 / (lb << 2);
   private static long nb = 0L;
   private static boolean ob;
   public static pb pb;
   private static pb qb;
   public static pb rb;
   public static pb sb;
   public static pb tb;
   public static pb ub;
   public static pb vb;
   public static pb wb;
   public static pb xb;
   public static pb yb;
   public static pb zb;
   private static pb Ab;
   public static pb Bb;
   public static pb Cb;
   public static pb Db;
   public static pb Eb;
   public static pb Fb;
   public static pb Gb;
   public static pb Hb;
   public static pb Ib;
   public static pb Jb;
   public static pb Kb;
   public static pb Lb;
   public static pb Mb;
   public static pb Nb;
   public static pb Ob;
   public static pb Pb;
   public static pb Qb;
   public static pb Rb;
   public static pb Sb;
   public static pb Tb;
   public static pb Ub;
   public static pb Vb;
   public static pb Wb;
   public static pb Xb;
   private static pb Yb;
   private static pb Zb;
   private static pb ac;
   private static pb bc;
   private static pb cc;
   public static pb dc;
   public static pb ec;
   public static pb fc;
   public static pb gc;
   public static pb hc;
   public static pb ic;
   public static pb jc;
   public static pb kc;
   public static pb lc;
   public static pb mc;
   public static pb nc;
   public static pb oc;
   public static pb pc;
   private static pb qc;
   private static pb rc;
   private static pb sc;
   public static pb tc;
   public static pb uc;
   public static pb vc;
   public static pb wc;
   public static pb xc;
   public static pb yc;
   public static pb zc;
   public static pb Ac;
   private static pb Bc;
   public static Image Cc;
   public static pb Dc;
   public static pb Ec;
   public static pb Fc;
   public static pb Gc;
   public static pb Hc;
   public static pb Ic;
   public static pb Jc;
   public static pb Kc;
   public static pb Lc;
   public static pb Mc;
   private static pb Nc;
   private static pb[] Oc;
   public static pb Pc;
   private static pb[] Qc;
   public static pb Rc;
   public static pb Sc;
   public static pb Tc;
   public static pb Uc;
   public static pb Vc;
   public static pb Wc;
   public static pb Xc;
   public static pb Yc;
   public static pb Zc;
   public static pb ad;
   public static pb bd;
   public static pb cd;
   public static pb dd;
   public static pb ed;
   public static pb fd;
   public static pb gd;
   public static pb hd;
   public static pb id;
   public static pb jd;
   public static pb kd;
   public static pb ld;
   public static pb md;
   public static pb nd;
   public static pb od;
   private static pb pd;
   public static pb qd;
   public static pb rd;
   public static pb sd;
   public static pb td;
   public static pb ud;
   public static pb vd;
   private static pb wd;
   private static pb xd;
   public static pb yd;
   public static pb zd;
   public static pb Ad;
   public static pb Bd;
   private static pb Cd;
   private static pb Dd;
   private static Image Ed;
   private static pb Fd;
   private static int[] Gd;
   private static int[] Hd;
   public static int[] Id;
   public static int[] Jd;
   public static int Kd;
   public static int Ld;
   public static int Md;
   public static int Nd;
   private static Image Od;
   public static q Pd;
   public static Vector Qd;
   public static Vector Rd;
   public static Vector Sd;
   public static Vector Td;
   public static Vector Ud;
   public static Vector Vd;
   public static Vector Wd;
   public static Vector Xd;
   public static Vector Yd;
   public static Vector Zd;
   public static Vector ae;
   public static Vector be;
   public static l ce;
   public static l de;
   public static l ee;
   public static l fe;
   public static l ge;
   public static l he;
   public static l ie;
   public static l je;
   public static l ke;
   private byte le;
   private byte me;
   private byte ne;
   private byte oe;
   private byte pe;
   private byte qe;
   private byte re;
   private boolean se;
   private String te = "";
   private long ue;
   private static byte ve = 0;
   private static byte we = 1;
   private static byte xe = 2;
   private static byte ye = 20;
   private static byte ze = 90;
   private static byte Ae = 15;
   private static byte Be;
   public static byte Ce = 60;
   public static o De;
   public static int Ee = -1;
   public static int Fe = -1;
   public static int Ge;
   public static int He;
   public static int Ie;
   public static int Je;
   private static int Ke;
   private static int Le;
   private static int Me;
   private static int Ne;
   public static String Oe;
   public static byte Pe;
   public static byte Qe;
   public static lb[][] Re;
   public static byte Se;
   public static byte Te;
   public static byte Ue;
   public static byte Ve;
   public static byte We;
   public static byte Xe;
   public static byte Ye;
   public static byte Ze;
   private static byte af = 4;
   public static byte[][] bf;
   private static int cf;
   public static boolean df = false;
   private static boolean ef = false;
   public static boolean ff = false;
   private static int gf = 0;
   private String hf = "";
   private long jf;
   public byte kf;
   private boolean lf;
   private int mf;
   private byte nf;
   private String of = "-";

   public fb() {
      I = this;
      fb var1 = this;
      this.n = 0L;
      var1.o = 0L;
      p = 0;
      var1.q = 0;
      var1.r = 0;
      s = 0;
      var1.t = 0;
      var1.u = 25;
      var1.v = false;
   }

   public final boolean c() {
      return ab.o || this.F || this.G || this.H;
   }

   public final void b(boolean var1, boolean var2) {
      new StringBuffer().append("gp start ").append(var1).append(",").append(var2).toString();
      new StringBuffer().append("").append(this.F).append(",").append(this.G).append(",").append(this.H).toString();
      this.e();
      if (var1) {
         this.J = 0;
         this.K = new Thread(this);
         this.K.start();
      } else {
         this.F = false;
         label22:
         if (!this.c()) {
            if (M) {
               this.O.h();
               if (!ab.xc) {
                  break label22;
               }
            }

            if (!i()) {
               this.N.b();
            }
         }

         if (ab.B.uc) {
            ab.B.uc = false;
            this.c(false, false);
         }
      }
   }

   public final void b() {
      if (!i() && Pd != null) {
         qb.d(Pd);
      }

      System.gc();
      if (Pd != null) {
         Pd.i();
      }

      label22:
      if (!this.c()) {
         if (M) {
            this.O.g();
            if (!ab.xc) {
               break label22;
            }
         }

         if (!i()) {
            this.N.a();
         }
      }

      this.F = true;
      this.e();
   }

   private static void a(int var0) {
      try {
         Thread.yield();
         Thread.sleep(50L);
      } catch (Exception var1) {
      }
   }

   public final void c() {
      boolean var2 = ab.xc;
      this.J = 1;
      this.K = null;
      this.Q = null;
      I = null;
      this.P = null;
      Cd = null;
      Ed = null;
      Dd = null;
      qb = null;
      vd = null;
      ad = null;
      Zc = null;
      bd = null;
      sb = null;
      Xc = null;
      Wc = null;
      Uc = null;
      rb = null;
      Bd = null;
      Ad = null;
      zd = null;
      wb = null;
      vb = null;
      ub = null;
      ud = null;
      md = null;
      ld = null;
      yd = null;
      fd = null;
      xb = null;
      ed = null;
      dd = null;
      td = null;
      sd = null;
      nd = null;
      gd = null;
      yb = null;
      Tc = null;
      Yc = null;
      cd = null;
      Ab = null;
      zb = null;
      Mb = null;
      Lb = null;
      Kb = null;
      Jb = null;
      Ib = null;
      Hb = null;
      Gb = null;
      Fb = null;
      Eb = null;
      Db = null;
      Cb = null;
      Bb = null;
      Qb = null;
      Pb = null;
      Ob = null;
      Nb = null;
      Vb = null;
      Ub = null;
      Tb = null;
      Sb = null;
      Rb = null;
      Xb = null;
      Wb = null;
      bc = null;
      ac = null;
      Zb = null;
      Yb = null;
      cc = null;
      ic = null;
      hc = null;
      gc = null;
      fc = null;
      ec = null;
      dc = null;
      Vc = null;
      tb = null;
      jc = null;
      lc = null;
      kc = null;
      mc = null;
      wd = null;
      xd = null;
      pd = null;
      nc = null;
      sc = null;
      rc = null;
      qc = null;
      pc = null;
      oc = null;
      hd = null;
      tc = null;
      Rc = null;
      Sc = null;
      vc = null;
      uc = null;
      xc = null;
      wc = null;
      yc = null;
      Bc = null;
      Ac = null;
      Cc = null;
      zc = null;
      kd = null;
      jd = null;
      id = null;
      Ec = null;
      Dc = null;
      Hc = null;
      Gc = null;
      Fc = null;
      Jc = null;
      Ic = null;
      Mc = null;
      Lc = null;
      Kc = null;
      rd = null;
      qd = null;
      od = null;
      Pc = null;
      Od = null;

      label49: {
         try {
            int var1 = 0;

            while (var1 < 3) {
               ((Object[])null)[var1] = null;
               var1++;
               if (var2) {
                  break label49;
               }

               if (var2) {
                  break;
               }
            }
         } catch (Exception var4) {
         }

         Oc = null;
         Nc = null;
      }

      label37: {
         try {
            int var5 = 0;

            while (var5 < 3) {
               ((Object[])null)[var5] = null;
               var5++;
               if (var2) {
                  break label37;
               }

               if (var2) {
                  break;
               }
            }
         } catch (Exception var3) {
         }

         Qc = null;
         Pd = null;
         Qd = null;
         Rd = null;
         Sd = null;
         Td = null;
         Ud = null;
         Vd = null;
         Wd = null;
         Xd = null;
         Yd = null;
         Zd = null;
         ae = null;
         be = null;
         je = null;
         ke = null;
         ie = null;
         he = null;
         ge = null;
         fe = null;
         ee = null;
         de = null;
         ce = null;
         jb = null;
         ib = null;
         this.te = null;
         Oe = null;
         Re = null;
         bf = null;
         s.B = null;
         q.Vc = null;
         hb.Q = null;
         y.P = null;
         y.O = null;
         q.W = 0;
      }

      if (Pd != null) {
         Pd.X = 0;
      }

      rc.f = 0L;
      rc.g = true;
      rc.h = 3;
      rc.i = 0;
      rc.j = -1;
   }

   private static void b(int var0, int var1, o var2) {
      label42: {
         boolean var3 = ab.xc;
         if (var2 != null) {
            De = var2;
            var0 = var2.c / 10;
            var1 = var2.d / 10;
            if (De == Pd) {
               switch (((q)De).ub) {
                  case 0:
                     var1 += ab.E / 4;
                     if (!var3) {
                        break;
                     }
                  case 1:
                     var0 -= ab.D / 4;
                     if (!var3) {
                        break;
                     }
                  case 2:
                     var1 -= ab.E / 4;
                     if (!var3) {
                        break;
                     }
                  case 3:
                     var0 += ab.D / 4;
               }
            }

            Ie = var0;
            Je = var1;
            if (!var3) {
               break label42;
            }
         }

         Ie = var0;
         Je = var1;
      }

      Ie = Ie - ab.D / 2;
      Je = Je - ab.E / 2;
      if (Ie < 0) {
         Ie = 0;
      }

      if (Ie + ab.D > Pe * 30) {
         Ie = Pe * 30 - ab.D;
      }

      if (Je < 0) {
         Je = 0;
      }

      if (Je + ab.E > Qe * 30) {
         Je = Qe * 30 - ab.E;
      }
   }

   public final void d() {
      boolean var3 = ab.xc;
      Qd = new Vector();
      Rd = new Vector();
      Sd = new Vector();
      Td = new Vector();
      Ud = new Vector();
      Vd = new Vector();
      Wd = new Vector();
      Xd = new Vector();
      Yd = new Vector();
      Zd = new Vector();
      ae = new Vector();
      be = new Vector();
      Re = new lb[Pe][Qe];
      bf = new byte[Pe][Qe];
      int var1 = 0;

      byte var10000;
      while (true) {
         if (var1 < Pe) {
            var10000 = 0;
            if (var3) {
               break;
            }

            int var2 = 0;

            label27: {
               while (var2 < Qe) {
                  Re[var1][var2] = new lb(this);
                  bf[var1][var2] = 0;
                  var2++;
                  if (var3) {
                     break label27;
                  }

                  if (var3) {
                     break;
                  }
               }

               var1++;
            }

            if (!var3) {
               continue;
            }
         }

         Ke = 0;
         Le = 0;
         Ne = 0;
         var10000 = 0;
         break;
      }

      Me = var10000;
   }

   public static void b(o var0, boolean var1) {
      if (var0 != null) {
         boolean var2 = true;
         if (var0 instanceof q && ((q)var0).m()) {
            var2 = false;
         }

         if (var2) {
            Be = 0;
            De = var0;
            return;
         }
      }

      Be = we;
      if (var1) {
         Be = xe;
      }

      Ee = Ge + ab.D / 2;
      Fe = He + ab.E / 2;
      De = null;
   }

   public static void b(int var0, int var1) {
      if (var1 < 5) {
         var1 = 5;
      }

      int var2 = var0;
      if (var0 < 0) {
         var2 = Math.abs(var0);
      }

      if (var2 != 0) {
         Ke = ab.oc.nextInt(var2) - ab.oc.nextInt(var2);
         Le = ab.oc.nextInt(var2) - ab.oc.nextInt(var2);
         Me = var2;
         Ne = var1;
      }
   }

   public final void e() {
      this.le = 0;
      this.me = 0;
      this.ne = 0;
      this.oe = 0;
      this.pe = 0;
      this.se = false;
   }

   private static void b(Graphics var0, j var1) {
      boolean var8 = ab.xc;
      if (var1.w > 0) {
         int var3;
         byte var4;
         byte var5;
         label63: {
            var3 = 0;
            var4 = 12;
            var5 = 0;
            if (ab.Jb) {
               var4 -= 3;
               if (!var8) {
                  break label63;
               }
            }

            if (var1.d == 0) {
               var4 += 5;
            }

            if (var1.w - 1 == 7 || var1.w - 1 == 8) {
               if (var1.w - 1 == 7) {
                  var3--;
               }

               var4 -= 12;
               if (var1.d != 0) {
                  var4 -= 5;
               }
            }

            if (var1.w - 1 == 0) {
               var4 += 5;
            }

            if (zb != null && var1.w - 1 < 7) {
               var5 = 4;
               if (o.c(var1.c(), var1.d(), zb.d, zb.e)) {
                  zb.b(var1.c() - zb.d / 2 - Ge, var1.d() - zb.e / 2 - He);
                  zb.b(var0);
               }
            }
         }

         if (o.c(var1.c() + var3, var1.d() - var1.e.e + var4, Ab.d, Ab.e)) {
            int var11;
            label61: {
               if ((var11 = var1.w - 1) == 7 || var11 == 8) {
                  var11 = 1;
                  if (!var8) {
                     break label61;
                  }
               }

               var11 = 0;
            }

            pb var10001 = Ab;
            int var10003 = var1.c() + var3;
            int var10004 = var1.d() - var1.e.e + var4;
            var5 = var5;
            var4 = var10004;
            var3 = var10003;
            byte var12 = (byte)var11;
            pb var10 = var10001;
            var0 = var0;
            int var6 = ab.D / 2 - (var3 - Ge);
            int var7 = ab.E / 2 - (var4 - He);
            var6 = var6 * var5 * 3 / (ab.D / 2);
            var7 = var7 * var5 * 3 / (ab.E / 2);
            var10.b = var12;
            var10.b(var3 - var6 - var10.d / 2 - Ge, var4 - var7 - var10.e / 2 - He);
            var10.b(var0);
         }
      }
   }

   private void f() {
      boolean var5 = ab.xc;
      if (Qd != null) {
         int var1 = Qd.size();
         if (ab.g()) {
            var1++;
         }

         Y = ab.D / qb.ob;
         int var2 = 0;
         int var4 = 0;

         while (var4 < Qd.size()) {
            q var3;
            String var6;
            int var7;
            if ((var3 = (q)Qd.elementAt(var4)) != null && (var6 = var3.z) != null && !var6.equals("") && (var7 = ab.C.b(var6)) > var2) {
               var2 = var7;
            }

            var4++;
            if (var5) {
               break;
            }
         }

         var4 = var2 / qb.ob + 1;
         if (ab.g()) {
            var4++;
         }

         if (var4 * qb.ob < var2) {
            var4++;
         }

         if (Y > var4 + 3) {
            Y = var4 + 3;
         }

         W = (ab.D - qb.ob * Y) / 2;
         if ((Z = ab.E / qb.pb) > var1 + 1) {
            Z = var1 + 1;
         }

         if ((X = (ab.E - qb.pb * Z) / 2) == 0) {
            Z--;
            X = X + qb.pb / 2;
         }

         label44: {
            if (Z < var1 + 1) {
               this.bb = (var1 - Z + 1) * qb.pb;
               if (!var5) {
                  break label44;
               }
            }

            this.bb = 0;
         }

         this.ab = 0;
      }
   }

   private void g() {
      if (this.R) {
         this.R = true;
         this.eb = -1;
         if (this.gb == 0) {
            this.gb = 1;
         }
      }
   }

   private void h() {
      this.ab = 0;
      this.cb = false;
      this.db = 40;
      this.eb = 1;
      this.gb = this.fb;
   }

   private void a(Graphics var1) {
      boolean var8 = ab.xc;
      int var5 = X;
      int var3 = 1;

      int var4;
      int var10000;
      while (true) {
         if (var3 <= Z) {
            var4 = W;
            var10000 = 1;
            if (var8) {
               break;
            }

            int var2 = 1;

            int var10001;
            label91: {
               while (var2 <= Y) {
                  var10000 = var2;
                  var10001 = 1;
                  if (var8) {
                     break label91;
                  }

                  int var6;
                  label102: {
                     if (var2 == 1) {
                        var6 = 0;
                        if (!var8) {
                           break label102;
                        }
                     }

                     if (var2 == Y) {
                        var6 = qb.ob << 1;
                        if (!var8) {
                           break label102;
                        }
                     }

                     var6 = qb.ob;
                  }

                  int var7;
                  label103: {
                     if (var3 == 1) {
                        var7 = 0;
                        if (!var8) {
                           break label103;
                        }
                     }

                     if (var3 == Z) {
                        var7 = qb.pb << 1;
                        if (!var8) {
                           break label103;
                        }
                     }

                     var7 = qb.pb;
                  }

                  var1.drawRegion(qb.X, var6, var7, qb.ob, qb.pb, 0, var4, var5 + this.gb, 0);
                  var4 += qb.ob;
                  var2++;
                  if (var8) {
                     break;
                  }
               }

               var10000 = var5;
               var10001 = qb.pb;
            }

            var5 = var10000 + var10001;
            var3++;
            if (!var8) {
               continue;
            }
         }

         var4 = W + 12;
         var10000 = (qb.pb - ab.C.c()) / 2;
         break;
      }

      int var13 = var10000;
      var1.setClip(0, this.gb + X + qb.pb / 2, ab.D, qb.pb * (Z - 1));
      int var9 = 0;

      while (var9 < Qd.size()) {
         q var10;
         if ((var10 = (q)Qd.elementAt(var9)) != null) {
            var5 = this.gb + X + qb.pb * var10.B + var13 - this.ab - qb.pb / 2;
            if (ab.g()) {
               var5 += qb.pb;
            }

            String var14 = var10.u() + var10.z;
            if (j() == 2) {
               if (ib != null && ib.H == var10) {
                  var14 = var14 + "^16~";
               }

               if (jb != null && jb.H == var10) {
                  var14 = var14 + "^18~";
               }
            }

            ab.C.b(var1, var14, var4 - 5, var5, -1, 0);
            ab.C.b(var1, "" + var10.A, ab.D - var4, var5, -1, 1);
         }

         var9++;
         if (var8) {
            break;
         }
      }

      if (ab.g()) {
         var5 = this.gb + X + qb.pb + var13 - this.ab - qb.pb / 2;
         var1.setColor(16777215);
         var1.drawLine(var4, var5 + qb.pb - 4, ab.D - var4, var5 + qb.pb - 4);
         ab.C.b(var1, "^7~" + this.hb[0], var4 - 5, var5, -1, 0);
         ab.C.b(var1, "^2~" + this.hb[1], ab.D - var4, var5, -1, 1);
      }

      var1.setClip(0, 0, ab.D, ab.E);
   }

   private void b(byte var1, byte var2, byte var3, boolean var4) {
      boolean var5 = ab.xc;
      if (var1 == -1) {
         q var7;
         if ((var7 = q.d(var2)) != null) {
            this.Q.b(var7.u() + var7.y + "^9~");
         }
      } else {
         q var6;
         if ((var6 = q.d(var1)) != null) {
            label58: {
               if (var4) {
                  var6.A += 5;
                  if (!var5) {
                     break label58;
                  }
               }

               var6.A++;
               if (ab.m == 1) {
                  this.hb[var6.x]++;
               }

               q var8 = q.d(var2);
               this.Q.b(var6.u() + var6.y + " (" + var6.A + ")" + hb.b((int)var3) + var8.u() + var8.y);
            }

            if (var6.B == 1) {
               return;
            }

            int var10 = 1;

            while (var10) {
               var10 = 0;
               var2 = 0;

               while (var2 < Qd.size()) {
                  q var12;
                  if ((var12 = (q)Qd.elementAt(var2)) != null && var6.A > var12.A && var6.B > var12.B) {
                     var10 = var12.B;
                     var12.B = var6.B;
                     var6.B = var10;
                     var10 = 1;
                  }

                  var2++;
                  if (var5) {
                     return;
                  }
               }
            }
         }
      }
   }

   public static boolean i() {
      return L == 0;
   }

   public static byte j() {
      return i() ? 1 : ab.m;
   }

   public static void k() {
      boolean var2 = ab.xc;
      if (bf != null) {
         byte var0 = 0;

         while (var0 < Pe) {
            byte var1 = 0;

            while (var1 < Qe) {
               label57: {
                  if (Re[var0][var1].d != null || var0 == 0 || var1 == 0 || var0 == Pe - 1 || var1 == Qe - 1) {
                     bf[var0][var1] = 0;
                     if (!var2) {
                        break label57;
                     }
                  }

                  if (Re[var0][var1].c > 0 && Re[var0][var1].c <= 16) {
                     bf[var0][var1] = ab.vc;
                     if (!var2) {
                        break label57;
                     }
                  }

                  bf[var0][var1] = ab.uc;
               }

               var1++;
               if (var2) {
                  break;
               }
            }

            var0++;
            if (var2) {
               break;
            }
         }
      }
   }

   public static void b(byte var0) {
      boolean var3 = ab.xc;
      if (Sd != null) {
         int var2 = 0;

         while (var2 < Sd.size()) {
            g var1 = (g)Sd.elementAt(var2);
            label30:
            if (var0 == 0 && var1.d == 4 || var0 == 1 && var1.d == 5) {
               if (var0 == 0) {
                  ib.d(var1.b, var1.c);
                  if (!var3) {
                     break label30;
                  }
               }

               jb.d(var1.b, var1.c);
            }

            var2++;
            if (var3) {
               break;
            }
         }
      }
   }

   public static boolean c(byte var0) {
      boolean var3 = ab.xc;
      if (Sd != null) {
         int var2 = 0;

         while (var2 < Sd.size()) {
            g var1 = (g)Sd.elementAt(var2);
            if (var3) {
               return (boolean)var0;
            }

            if (var0 == 0 && var1.d == 4 || var0 == 1 && var1.d == 5) {
               if (var0 == 0) {
                  if (ib.g == var1.b && ib.h == var1.c) {
                     return true;
                  }
               } else if (jb.g == var1.b && jb.h == var1.c) {
                  return true;
               }
            }

            var2++;
            if (var3) {
               break;
            }
         }
      }

      return false;
   }

   public static byte b(q var0) {
      if (ib != null && jb != null) {
         if (ib.H == var0) {
            return 0;
         }

         if (jb.H == var0) {
            return 1;
         }
      }

      return -1;
   }

   public final void b(byte var1, byte var2, byte var3, byte var4, byte var5, byte var6) {
      byte var10000;
      label89: {
         boolean var10 = ab.xc;
         s var7 = var1 == 0 ? ib : jb;
         q var8 = q.d(var3);
         new StringBuffer()
            .append("")
            .append(var1)
            .append(",")
            .append(var2)
            .append(",")
            .append(var3)
            .append(",")
            .append(var4)
            .append(",")
            .append(var5)
            .append(",")
            .append(var6)
            .toString();
         if (var7 != null) {
            if (var2 == 0) {
               var7.g();
            }

            if (var2 == 1) {
               var7.H = null;
               var7.d(var4, var5);
            }

            if (var8 != null && var2 == 2) {
               var7.H = var8;
            }

            label83:
            if (var8 != null && var6 != 0) {
               if (var6 == 1) {
                  if (var1 == 0) {
                     this.Q.b(var8.u() + var8.y + " (" + var8.A + ")" + "^16~");
                     if (!var10) {
                        break label83;
                     }
                  }

                  this.Q.b(var8.u() + var8.y + " (" + var8.A + ")" + "^18~");
                  if (!var10) {
                     break label83;
                  }
               }

               if (var6 == 2) {
                  this.hb[var8.x]++;
                  this.b(var8.w, (byte)0, (byte)0, true);
                  this.Q.b(var8.u() + var8.y + " (" + var8.A + ")" + "^20~");
                  if (Sd != null) {
                     int var9 = 0;

                     while (var9 < Sd.size()) {
                        g var18 = (g)Sd.elementAt(var9);
                        var10000 = var7.G;
                        if (var10) {
                           break label89;
                        }

                        if (var7.G == 0 && var18.d == 5 || var7.G == 1 && var18.d == 4) {
                           new w(mc, var18.b * 30 + 15, var18.c * 30 + 15, (byte)11, true, 0);
                           if (!var10) {
                              break;
                           }
                        }

                        var9++;
                        if (var10) {
                           break;
                        }
                     }
                  }
               } else {
                  label53:
                  if (var6 == 3) {
                     if (var8.x == 0) {
                        this.Q.b(var8.u() + var8.y + " (" + var8.A + ")" + "^17~");
                        if (!var10) {
                           break label53;
                        }
                     }

                     this.Q.b(var8.u() + var8.y + " (" + var8.A + ")" + "^19~");
                  }
               }
            }
         }

         var10000 = M;
      }

      if (var10000 != 0) {
         byte var17 = var6;
         var6 = var5;
         var5 = var4;
         var4 = var3;
         var3 = var2;
         var2 = var1;
         fb var11 = this;
         byte[] var19;
         (var19 = new byte[7])[0] = 20;
         var19[1] = var2;
         var19[2] = var3;
         var19[3] = var4;
         var19[4] = var5;
         var19[5] = var6;
         var19[6] = var17;
         var11.a(var19);
      }
   }

   public static byte b(byte var0, byte var1) {
      if (Re != null && o.b(var0, var1)) {
         if (Re[var0][var1].c == 0) {
            return 0;
         }

         if (Re[var0][var1].c > 0 && Re[var0][var1].c <= 16) {
            return 3;
         }
      }

      return 0;
   }

   public static byte[] b(byte var0, byte var1, byte var2, byte var3) {
      boolean var6 = ab.xc;
      byte var4 = var0;
      byte var5 = var1;
      switch (var2) {
         case 0:
            var5 = (byte)(var1 + var3);
            if (!var6) {
               break;
            }
         case 1:
            var4 = (byte)(var0 - var3);
            if (!var6) {
               break;
            }
         case 2:
            var5 = (byte)(var1 - var3);
            if (!var6) {
               break;
            }
         case 3:
            var4 = (byte)(var0 + var3);
      }

      return new byte[]{var4, var5};
   }

   private static void l() {
      int var0 = ab.oc.nextInt(ab.D) + Ge;
      int var1 = ab.oc.nextInt(ab.E) + He;
      (new w(null, var0, var1, (byte)12, true, 1)).h.b(new byte[]{0, 1, 2, 3, 4}, false, false, (byte)1);
   }

   public final void b(byte[] var1) {
      this.O.b(var1);
   }

   public final void b(long var1) {
      this.jf = var1;
   }

   public final boolean b() {
      return M;
   }

   public final boolean d(byte var1) {
      return M && var1 > 1 ? var1 <= this.O.b() + 1 : false;
   }

   public final boolean e(byte var1) {
      if (M) {
         if (var1 == 1) {
            return true;
         }

         if (this.d(var1)) {
            return true;
         }
      }

      return false;
   }

   public final void b(int var1) {
      if (ab.o) {
         new StringBuffer().append("serv=").append(var1).toString();
      }

      if (var1 == 2) {
         b((o)null, false);
         this.R = true;
         this.h();
         this.H = true;
         if (Pd != null) {
            qb.d(Pd);
            return;
         }
      } else if (var1 == 0) {
         this.G = true;
         if (Pd != null) {
            qb.d(Pd);
            return;
         }
      } else if (var1 == 1) {
         this.G = false;
      }
   }

   public final void b(String var1) {
      this.of = this.of + var1;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public final void b(byte var1, String var2) {
      boolean var6 = ab.xc;
      ab.q += 3;
      this.Q = new h();
      ab.q++;
      new StringBuffer().append("starting level ").append(ab.bc).toString();
      ef = false;
      ff = false;
      gf = -1;
      h = 0;
      e = 0;
      ab.w = false;
      this.a(var2);
      if (M && ab.m == 2) {
         y.k();
      }

      byte var10000;
      label270: {
         q();
         ab.q++;
         if (M) {
            int var3 = this.O.b() + 1;
            int var4 = ab.Lb;
            var3 += var4;
            this.O.b(var2, var3, q.b(var3), ab.m, false, ab.n);
            q.d(1).b(ab.Kb);
            int var5 = 0;
            int var11 = var3 - var4;

            while (var11 < var3) {
               q var20 = (q)Qd.elementAt(var11);
               var10000 = ab.dc;
               if (var6) {
                  break label270;
               }

               label276: {
                  if (ab.dc == 0) {
                     var5 = ab.oc.nextInt(9);
                     if (!var6) {
                        break label276;
                     }
                  }

                  if (ab.dc == 1) {
                     var5 = ab.oc.nextInt(3);
                     if (!var6) {
                        break label276;
                     }
                  }

                  if (ab.dc == 2) {
                     var5 = ab.oc.nextInt(3) + 3;
                     if (!var6) {
                        break label276;
                     }
                  }

                  if (ab.dc == 3) {
                     var5 = ab.oc.nextInt(3) + 6;
                  }
               }

               var20.Cc = new y(var20, (byte)var5);
               this.b((int)var20.w, var20.y);
               var11++;
               if (var6) {
                  break;
               }
            }

            this.b(1, ab.Kb);
         } else {
            label246: {
               if (i()) {
                  new q((byte)0, (byte)0);
                  if (!var6) {
                     break label246;
                  }
               }

               q.b(this.P);
               this.N.c(this.P.length / 3);
            }
         }

         ab.q += 5;
         Be = 0;
         Pd = q.d(var1);
         var10000 = i();
      }

      label239: {
         if (var10000 != 0) {
            Pd.b(ab.Vb, ab.Wb, ab.Xb, ab.Qb);
            if (!var6) {
               break label239;
            }
         }

         Pd.b(ab.jc, ab.kc, ab.lc, ab.Rb);
      }

      this.j = "^41~" + Pd.C;
      this.a(true);
      this.a(false);
      if (!i()) {
         this.b(var1, Pd);
      }

      label233: {
         byte var10001;
         label295: {
            label231: {
               int var21;
               label278: {
                  label229: {
                     label228: {
                        b(Pd, false);
                        if (De == null) {
                           Ge = Ee = Pe * 30 / 2 - ab.D / 2;
                           He = Fe = Qe * 30 / 2 - ab.E / 2;
                           if (!i()) {
                              break label228;
                           }

                           var21 = 0;
                           int var12 = 0;

                           while (var12 < 2) {
                              var10000 = var21;
                              if (var6) {
                                 break label229;
                              }

                              if (var21 != 0) {
                                 break;
                              }

                              int var23 = 0;

                              while (var23 < ae.size()) {
                                 sb var14;
                                 var25 = var14 = (sb)ae.elementAt(var23);
                                 if (var6) {
                                    break label278;
                                 }

                                 if (var25 != null && (var12 == 0 && var14.i || var12 == 1 && var14.o == 0)) {
                                    Ge = Ee = var14.c * 30 + 15;
                                    He = Fe = var14.d * 30 + 15;
                                    var21 = 1;
                                    if (var12 != 1) {
                                       break;
                                    }

                                    Be = xe;
                                    if (!var6) {
                                       break;
                                    }
                                 }

                                 var23++;
                                 if (var6) {
                                    break;
                                 }
                              }

                              var12++;
                              if (var6) {
                                 break;
                              }
                           }

                           if (!var6) {
                              break label228;
                           }
                        }

                        o var7 = De;
                        Ge = Ee = De.c / 10 - ab.D / 2;
                        o var8 = De;
                        He = Fe = De.d / 10 - ab.E / 2;
                     }

                     ab.q += 2;
                     this.f();
                     var10000 = ab.q + 1;
                  }

                  ab.q = var10000;
                  this.fb = ab.E - X;
                  this.gb = this.fb;
                  this.eb = 1;
                  this.R = true;
                  if (this.K != null) {
                     new StringBuffer().append("loading done ").append(this.K.isAlive()).toString();
                  }

                  g = 0;
                  int var15 = 0;

                  while (var15 < ae.size()) {
                     sb var22;
                     var10000 = (var22 = (sb)ae.elementAt(var15)).j;
                     var10001 = 2;
                     if (var6) {
                        break label295;
                     }

                     if (var10000 != 2 && var22.n != 1) {
                        g = g + var22.q;
                     }

                     var15++;
                     if (var6) {
                        break;
                     }
                  }

                  this.d = System.currentTimeMillis();
                  f = 0;
                  new StringBuffer().append("loaded = ").append(ab.q).toString();
                  ab.q = 0;
                  if (Zd == null) {
                     if (i()) {
                        label287: {
                           df = true;
                           if (ae != null) {
                              var15 = 0;

                              while (var15 < ae.size()) {
                                 ((sb)ae.elementAt(var15)).b();
                                 var15++;
                                 if (var6) {
                                    break label287;
                                 }

                                 if (var6) {
                                    break;
                                 }
                              }
                           }

                           if (!ab.v && Pd != null) {
                              q.b(Pd);
                              Pd.jc = 0L;
                              b(Pd, false);
                           }

                           ab.y = ab.E * 10 / 100;
                           ab.x = 1;
                        }

                        if (ab.v) {
                           ab.w = true;
                           if (ab.bc == 0) {
                              q var10;
                              (var10 = q.d(2)).nc = -1;
                              var10.bc = 1;
                              var10.Cc.z = 0;
                              b(var10, true);
                              var10.Cc.F = true;
                              y.c(var10);
                           }
                        }
                     }

                     ab.t = -1;
                     if (!i()) {
                        break label233;
                     }

                     var10000 = ab.bc;
                     var10001 = 8;
                     break label295;
                  }

                  var21 = 0;
                  if (var21 >= Zd.size()) {
                     break label231;
                  }

                  var25 = Zd.elementAt(var21);
               }

               while (true) {
                  v var16;
                  var10000 = (var16 = (v)var25).d;
                  var10001 = 7;
                  if (var6) {
                     break label295;
                  }

                  if (var10000 == 7) {
                     var16.b(null);
                  }

                  if (var6 || ++var21 >= Zd.size()) {
                     break;
                  }

                  var25 = Zd.elementAt(var21);
               }
            }

            if (i()) {
               label291: {
                  df = true;
                  if (ae != null) {
                     int var17 = 0;

                     while (var17 < ae.size()) {
                        ((sb)ae.elementAt(var17)).b();
                        var17++;
                        if (var6) {
                           break label291;
                        }

                        if (var6) {
                           break;
                        }
                     }
                  }

                  if (!ab.v && Pd != null) {
                     q.b(Pd);
                     Pd.jc = 0L;
                     b(Pd, false);
                  }

                  ab.y = ab.E * 10 / 100;
                  ab.x = 1;
               }

               if (ab.v) {
                  ab.w = true;
                  if (ab.bc == 0) {
                     q var9;
                     (var9 = q.d(2)).nc = -1;
                     var9.bc = 1;
                     var9.Cc.z = 0;
                     b(var9, true);
                     var9.Cc.F = true;
                     y.c(var9);
                  }
               }
            }

            ab.t = -1;
            if (!i()) {
               break label233;
            }

            var10000 = ab.bc;
            var10001 = 8;
         }

         String var19;
         if (var10000 != var10001 && (var19 = ib.b("/lang_map" + ab.bc + ".txt", 0)) != null && !var19.equals("")) {
            this.i = new tb();
            this.i.f = 4;
            qb.Q.b = 0;
            this.i.b(xb);
            this.i.b(var19);
            this.i.b();
         }
      }

      ab.o = false;
   }

   private static boolean m() {
      return ab.Cb && L == 0 && !ab.Jb;
   }

   public final void c(boolean var1, boolean var2) {
      boolean var10 = ab.xc;
      int var3 = ab.Ub;
      if (!var1 || !this.c || var2) {
         boolean var4 = false;
         this.e();
         this.w = -1;
         if (var1 && ab.t == -1 && !var2) {
            ab.t = 35;
            ab.u = 35;
         } else {
            label93: {
               ab.o = true;
               ab.w = false;
               var2 = (byte)0;
               if (var1) {
                  if (++ab.Ub > ab.Tb) {
                     var4 = true;
                     ab.Tb = ab.Ub;
                     qb.o();
                  }

                  if (!ab.e(ab.Ub)) {
                     ab.Ub--;
                     var2 = (byte)1;
                  }

                  qb.c(Pd);
                  if (!var10) {
                     break label93;
                  }
               }

               var2 = (byte)2;
            }

            if (var2 == 0 && ab.Ub == 1) {
               ab.o = true;
               ab.l = 1;
               ab.B.vc = 0;
               ab.A.b();
               ab.z.repaint();
               ab.B.K();
            } else {
               this.i = new tb();
               this.i.f = var2;
               label83:
               if (var2 != 0 && var2 != 1) {
                  qb.Q.b = 1;
                  this.i.b(qb.Q);
                  this.i.b(ib.c(23));
                  this.i.b("");
                  if (Pd.dc[5] <= 0) {
                     this.i.f = 5;
                     this.i.b(ib.c(48));
                     this.i.b(ib.c(49));
                     if (!var10) {
                        break label83;
                     }
                  }

                  Pd.dc[5]--;
                  this.i.b(ib.c(50 + ab.oc.nextInt(7)));
                  this.i.b("");
                  this.i.b(ib.c(57) + Pd.dc[5]);
               } else {
                  label79: {
                     qb.Q.b = 3;
                     this.i.b(qb.Q);
                     if (var2 == 1) {
                        this.i.b(ib.c(22));
                        this.i.b("");
                        this.i.b(ib.c(40) + var3 + ":");
                        if (!var10) {
                           break label79;
                        }
                     }

                     this.i.b(ib.c(21));
                     this.i.b("");
                     this.i.b(ib.c(40) + var3 + ":");
                  }

                  this.i.b(ib.c(41) + q.W + "/" + g);
                  this.i.b(ib.c(42) + e + "/" + h);
                  this.i.b(ib.c(43) + f);
                  if (var4) {
                     var1 = (r() * f + 50) / 100;
                     Pd.b(Pd.C + var1, false);
                     qb.c(Pd);
                     this.i.b(ib.c(44) + " (" + r() + "%): " + var1);
                  }

                  this.i.b(ib.c(45) + ab.Qb);
                  tb var10000 = this.i;
                  StringBuffer var10001 = new StringBuffer().append(ib.c(46));
                  long var8;
                  var1 = (int)((var8 = (System.currentTimeMillis() - this.d) / 1000L) % 60L);
                  long var19;
                  var2 = (int)((var19 = var8 / 60L) % 60L);
                  var3 = (int)(var19 / 60L);
                  String var17 = "" + var3 + ":";
                  if (var2 < 10) {
                     var17 = var17 + "0";
                  }

                  String var18 = var17 + var2 + ":";
                  if (var1 < 10) {
                     var18 = var18 + "0";
                  }

                  label101: {
                     var10000.b(var10001.append(var18 + var1).toString());
                     if (g == 0 && h == 0) {
                        var1 = 100;
                        if (!var10) {
                           break label101;
                        }
                     }

                     if (g == 0) {
                        var1 = e * 100 / h;
                        if (!var10) {
                           break label101;
                        }
                     }

                     if (h == 0) {
                        var1 = q.W * 100 / g;
                        if (!var10) {
                           break label101;
                        }
                     }

                     var1 = (q.W * 100 / g + e * 100 / h) / 2;
                  }

                  this.i.b(ib.c(47) + var1 + "%");
               }

               this.i.b();
               ab.o = false;
            }
         }
      }
   }

   public final int c(byte[] var1) {
      if (var1 == null) {
         return 0;
      } else if (var1.length < 2) {
         return 0;
      } else {
         return var1[0] != 3 && var1[0] != 4 && var1[0] != 5 && var1[0] != 15 && var1[0] != 2 && var1[0] != 8 ? 0 : var1[1];
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Irreducible bytecode has more than 5 nodes in sequence and was not entirely decomposed
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public final boolean b(byte[] var1, boolean var2) {
      boolean var11 = ab.xc;

      try {
         if (ab.o && var1[0] != 1) {
            return false;
         }

         this.mf++;
         this.nf = var1[0];
         if (var1[0] == 1) {
            if (this.N.b == 6) {
               return true;
            }

            ByteArrayInputStream var36;
            (var36 = new ByteArrayInputStream(var1)).read();
            ab.m = (byte)var36.read();
            var36.read();
            ab.n = (byte)var36.read() == 1;
            byte var45 = (byte)var36.read();
            this.N.d(var45);
            byte[] var56 = new byte[var36.read()];
            var36.read(var56);
            Oe = new String(var56);
            var56 = new byte[var36.read() * 3];
            var36.read(var56);
            this.P = var56;
            this.b((int)var45, ab.Kb);
            ab.B.b(var45, true);
            this.N.b = 6;
            return true;
         }

         if (var1[0] == 13) {
            byte var44;
            String var62;
            q var69;
            q var76;
            label867: {
               ByteArrayInputStream var35;
               (var35 = new ByteArrayInputStream(var1)).read();
               var44 = (byte)var35.read();
               byte[] var55 = new byte[var35.read()];
               var35.read(var55);
               var62 = new String(var55);
               if (M) {
                  if ((var69 = q.d(var44)) != null) {
                     var69.b(var62);
                  }

                  int var70 = 0;
                  int var71 = 0;

                  while (var71 < Qd.size()) {
                     var76 = var69 = (q)Qd.elementAt(var71);
                     if (var11) {
                        break label867;
                     }

                     if (var76 != null) {
                        label858: {
                           if (var70 == 0) {
                              var16 = var62;
                              if (!var11) {
                                 break label858;
                              }
                           }

                           var16 = var62 + "_" + var70;
                        }

                        if (var16.equals(var69.y)) {
                           var70++;
                        }
                     }

                     var71++;
                     if (var11) {
                        break;
                     }
                  }

                  if (var70 > 0) {
                     var62 = var62 + "_" + var70;
                  }
               }

               var76 = var69 = q.d(var44);
            }

            if (var76 != null) {
               var69.b(var62);
               if (M) {
                  this.b((int)var44, var62);
               }

               this.f();
               return true;
            }

            return false;
         }

         if (var1[0] == 9) {
            q var34;
            if ((var34 = q.d(var1[1])) == null) {
               return false;
            }

            byte var43 = var1[2];
            byte var50 = var1[3];
            byte var54 = var1[4];
            ByteArrayInputStream var61 = new ByteArrayInputStream(var1);
            byte[] var63 = new byte[5];
            var61.read(var63);
            var63 = new byte[var43 * 4];
            var61.read(var63);
            var34.Yb = ab.c(var63);
            if (var34 == Pd && Pd.bc != -1) {
               String var65 = hb.b(Pd.bc) + Pd.Yb[Pd.bc];
               this.D = var65;
            }

            var63 = new byte[var54 * 4];
            var61.read(var63);
            var34.ac = ab.c(var63);
            var63 = new byte[var50 * 4];
            var61.read(var63);
            var34.dc = ab.c(var63);
            var34.nc = var34.nc + (var34.v() - var34.mc);
            var34.mc = var34.v();
            if (M) {
               this.O.b(var1, var1[1]);
            }

            return true;
         }

         if (var1[0] == 2) {
            q var17;
            if ((var17 = q.d(var1[1])) != null) {
               var17.b(var1[2], var1[3], true);
               if (var1[1] == Pd.w) {
                  b(Pd, false);
               }

               var17.U = true;
            }
         } else {
            if (var1[0] == 10) {
               q var33;
               if ((var33 = q.d(var1[1])) != null) {
                  var33.gc = false;
               }

               return true;
            }

            if (var1[0] == 4) {
               q var32;
               if ((var32 = q.d(var1[1])) != null) {
                  if (var32.gc) {
                     return true;
                  }

                  if (!var32.U) {
                     return true;
                  }

                  if (var1[4] != var32.g || var1[5] != var32.h) {
                     return false;
                  }

                  if (!var32.b(var1[2], var1[3] == 1)) {
                     return false;
                  }

                  if (M) {
                     this.O.b(var1, var1[1]);
                  }
               }

               return true;
            }

            if (var1[0] == 3) {
               if (Pd != null && Pd.w == var1[1]) {
                  return true;
               }

               q var31;
               if ((var31 = q.d(var1[1])) != null) {
                  if (var31.gc) {
                     return true;
                  }

                  if (!var31.U) {
                     return true;
                  }

                  boolean var42 = b(var31.ub, var31.g, var31.h, var1[2], var1[3]);
                  if ((var31.g != var1[2] || var31.h != var1[3]) && !var42) {
                     return false;
                  }

                  var31.j();
                  var31.d(var1[2], var1[3]);
                  if (var11) {
                     return false;
                  }

                  if (M) {
                     this.O.b(var1, var1[1]);
                  }
               }

               return true;
            }

            if (var1[0] == 5) {
               if (Pd != null && Pd.w == var1[1]) {
                  return true;
               }

               q var30;
               if ((var30 = q.d(var1[1])) != null) {
                  if (var30.gc) {
                     return true;
                  }

                  if (!var30.U) {
                     return true;
                  }

                  boolean var41;
                  if (!(var41 = var30.g == var1[2] && var30.h == var1[3])) {
                     var41 = b(var30.ub, var30.g, var30.h, var1[2], var1[3]);
                  }

                  if (!var41) {
                     return false;
                  }

                  label787: {
                     byte[] var49 = null;
                     if (var1[5] != 0) {
                        var49 = new byte[var1[5]];
                        byte var53 = 0;

                        while (var53 < var1[5]) {
                           var49[var53] = var1[var53 + 6];
                           var53++;
                           if (var11) {
                              break label787;
                           }

                           if (var11) {
                              break;
                           }
                        }
                     }

                     var30.b(var1[4], true, var1[2], var1[3], var49);
                  }

                  if (M) {
                     this.O.b(var1, var1[1]);
                  }
               }

               return true;
            }

            if (var1[0] == 6) {
               q var29;
               if ((var29 = q.d(var1[1])) != null) {
                  var29.b(ab.b(var1[2], var1[3], var1[4], var1[5]), -1, -1, var1[6] == 1, var1[7] == 1);
               }

               return true;
            }

            if (var1[0] == 7) {
               q var28;
               if ((var28 = q.d(var1[1])) != null) {
                  var28.b(ab.b(var1[2], var1[3], var1[4], var1[5]), ab.b(var1[6], var1[7], var1[8], var1[9]));
                  this.b(var1[10], var1[1], var1[11], false);
                  var28.b((byte)-1, (byte)-1, var1[12] == 1, var1[13] == 1);
                  var28.U = false;
               }

               return true;
            }

            if (var1[0] == 8) {
               q var27;
               if ((var27 = q.d(var1[1])) != null) {
                  if (!var27.U) {
                     return true;
                  }

                  var27.b(var1[2], var1[3], var1[4], var1[5], var1[6] == 1, var1[7] == 1, var1[8] == 1, var1[9], var1[10], var1[11], var1[12]);
               }

               return true;
            }

            if (var1[0] == 101) {
               q var18;
               if ((var18 = q.d(var1[1])) != null) {
                  var18.g();
               }
            } else {
               if (var1[0] == 11) {
                  q var26;
                  if ((var26 = q.d(var1[1])) != null) {
                     var26.b(true, var1[2], var1[3], var1[4] == 1, var1[5] == 1);
                  }

                  return true;
               }

               if (var1[0] == 12) {
                  if (o.b(var1[1], var1[2]) && Re[var1[1]][var1[2]].d != null) {
                     Re[var1[1]][var1[2]].d.c(ab.b(var1[3], var1[4], var1[5], var1[6]));
                  }

                  return true;
               }

               if (var1[0] == 14) {
                  if (var1[1] == 0) {
                     this.f(var1[2]);
                     if (!var11) {
                        return true;
                     }
                  }

                  new StringBuffer().append("Req").append(var1[1]).append(" to ").append(var1[2]).toString();
                  this.b(var1[1], var1[2], (byte)0);
                  return true;
               }

               if (var1[0] == 15) {
                  new StringBuffer().append("R").append(var1[1]).toString();
                  if (var1[1] == 0) {
                     ByteArrayInputStream var24 = new ByteArrayInputStream(var1);
                     byte[] var8 = new byte[1];
                     byte[] var9 = new byte[4];
                     var1 = new byte[5];

                     try {
                        var24.read();
                        var24.read();
                        var24.read(var9);
                        int var10 = ab.b(var9);
                        if (Yd != null) {
                           Yd.removeAllElements();
                        }

                        Yd = new Vector();
                        int var37 = 0;

                        label584: {
                           while (var37 < var10) {
                              var24.read(var9);
                              s var46 = new s(var9[0], var9[1], var9[2], false);
                              Yd.addElement(var46);
                              var37++;
                              if (var11) {
                                 break label584;
                              }

                              if (var11) {
                                 break;
                              }
                           }

                           var24.read(var9);
                           var10 = ab.b(var9);
                        }

                        if (Ud != null) {
                           Ud.removeAllElements();
                        }

                        Ud = new Vector();
                        var37 = 0;

                        byte var10000;
                        label899: {
                           while (var37 < var10) {
                              var24.read(var1);
                              var10000 = var1[3];
                              if (var11) {
                                 break label899;
                              }

                              label596: {
                                 if (var10000 == -1) {
                                    hb.b(var1[0], var1[1], var1[2], null, null);
                                    if (!var11) {
                                       break label596;
                                    }
                                 }

                                 hb.b(var1[0], var1[1], var1[2], q.d(var1[3]), null);
                              }

                              var37++;
                              if (var11) {
                                 break;
                              }
                           }

                           if (Re == null) {
                              return false;
                           }

                           var10000 = 0;
                        }

                        int var5 = var10000;

                        label704: {
                           label703: {
                              int var6;
                              label901: {
                                 label701:
                                 while (true) {
                                    if (var5 < Re.length) {
                                       var10000 = 0;
                                       if (var11) {
                                          break;
                                       }

                                       var6 = 0;

                                       while (var6 < Re[0].length) {
                                          if (var11) {
                                             if (Re[var5][var6].d != null && !Re[var5][var6].d.b) {
                                                Re[var5][var6].d.f();
                                             }

                                             var6++;
                                             if (var11) {
                                                if (var11 || ++var5 >= Re.length) {
                                                   break label703;
                                                }

                                                var10000 = 0;
                                                if (var11) {
                                                   break label704;
                                                }

                                                var6 = 0;
                                             }
                                             break label901;
                                          }

                                          if (Re[var5][var6].d != null) {
                                             Re[var5][var6].d.b = !Re[var5][var6].d.A ? Re[var5][var6].d.I == 0 : false;
                                          }

                                          var6++;
                                          if (var11) {
                                             var5++;
                                             if (!var11) {
                                                continue label701;
                                             }

                                             var24.read(var9);
                                             var10 = ab.b(var9);
                                             var10000 = 0;
                                             break label701;
                                          }
                                       }

                                       var5++;
                                       if (!var11) {
                                          continue;
                                       }

                                       var24.read(var9);
                                       var10 = ab.b(var9);
                                       var10000 = 0;
                                       break;
                                    }

                                    var24.read(var9);
                                    var10 = ab.b(var9);
                                    var10000 = 0;
                                    break;
                                 }

                                 var37 = var10000;

                                 label627: {
                                    while (var37 < var10) {
                                       var24.read(var8);
                                       byte var51 = var8[0];
                                       var24.read(var8);
                                       byte var59 = var8[0];
                                       var24.read(var8);
                                       var10000 = var8[0];
                                       if (var11) {
                                          break label627;
                                       }

                                       label623: {
                                          if (var10000 == 0) {
                                             var24.read(var8);
                                             boolean var15 = var8[0] == 1;
                                             var24.read(var8);
                                             byte[] var47 = new byte[var8[0]];
                                             var24.read(var47);
                                             if (Re[var51][var59].d == null) {
                                                break label623;
                                             }

                                             Re[var51][var59].d.N = var15;
                                             Re[var51][var59].d.M = Long.parseLong(new String(var47));
                                             Re[var51][var59].d.b = true;
                                             if (!var11) {
                                                break label623;
                                             }
                                          }

                                          var24.read(var9);
                                          if (Re[var51][var59].d != null) {
                                             Re[var51][var59].d.c(ab.b(var9));
                                             Re[var51][var59].d.b = true;
                                          }
                                       }

                                       var37++;
                                       if (var11) {
                                          break;
                                       }
                                    }

                                    var10000 = 0;
                                 }

                                 var5 = var10000;
                                 if (var5 >= Re.length) {
                                    break label703;
                                 }

                                 var10000 = 0;
                                 if (var11) {
                                    break label704;
                                 }

                                 var6 = 0;
                              }

                              label686:
                              while (true) {
                                 while (var6 >= Re[0].length) {
                                    if (var11 || ++var5 >= Re.length) {
                                       break label686;
                                    }

                                    var10000 = 0;
                                    if (var11) {
                                       break label704;
                                    }

                                    var6 = 0;
                                 }

                                 if (Re[var5][var6].d != null && !Re[var5][var6].d.b) {
                                    Re[var5][var6].d.f();
                                 }

                                 var6++;
                                 if (var11) {
                                    if (var11 || ++var5 >= Re.length) {
                                       break;
                                    }

                                    var10000 = 0;
                                    if (var11) {
                                       break label704;
                                    }

                                    var6 = 0;
                                 }
                              }
                           }

                           var24.read(var9);
                           this.hb[0] = ab.b(var9);
                           var24.read(var9);
                           this.hb[1] = ab.b(var9);
                           var24.read(var8);
                           var10 = var8[0];
                           var10000 = 0;
                        }

                        var37 = var10000;

                        label735: {
                           while (var37 < var10) {
                              var24.read(var8);
                              q var7 = q.d(var8[0]);
                              var24.read(var9);
                              if (var11) {
                                 break label735;
                              }

                              if (var7 != null) {
                                 var7.A = ab.b(var9);
                              }

                              var24.read(var8);
                              if (var7 != null) {
                                 var7.B = var8[0];
                              }

                              var24.read(var9);
                              if (var7 != null) {
                                 var7.b(ab.b(var9), -1, -1, false, true);
                              }

                              var24.read(var8);
                              if (var8[0] != 0) {
                                 byte[] var48 = new byte[var8[0]];
                                 var24.read(var48);
                                 if (var7 != null) {
                                    var7.b(new String(var48));
                                 }
                              }

                              var24.read(var8);
                              if (var7 != null) {
                                 var7.b(var8[0], 0, 0, var8[0] == 2, false, false);
                              }

                              var24.read(var8);
                              if (var7 != null) {
                                 var7.e((byte)(var8[0] - 1), false);
                              }

                              var24.read(var8);
                              if (var7 != null) {
                                 var7.g((byte)(var8[0] - 1), false);
                              }

                              var24.read(var8);
                              if (var7 != null) {
                                 var7.f((byte)(var8[0] - 1), false);
                              }

                              var24.read(var8);
                              if (var7 != null) {
                                 var7.hc = var8[0] == 1;
                              }

                              label911: {
                                 var24.read(var8);
                                 if (var8[0] == -1) {
                                    if (var7 == null) {
                                       break label911;
                                    }

                                    var7.g();
                                    if (!var11) {
                                       break label911;
                                    }
                                 }

                                 if (var7 != null) {
                                    var7.mb = var8[0];
                                 }

                                 var24.read(var9);
                                 if (var7 != null) {
                                    var7.j();
                                 }

                                 if (var7 != null) {
                                    var7.d(var9[0], var9[1]);
                                 }

                                 if (var7 != null) {
                                    var7.c(var9[2], true);
                                 }

                                 if (var9[3] == 1 && var7 != null) {
                                    var7.b(var7.ub, false);
                                 }
                              }

                              var37++;
                              if (var11) {
                                 break;
                              }
                           }

                           var37 = 0;
                        }

                        while (var37 < 2) {
                           var24.read(var8);
                           var10000 = var8[0];
                           if (var11) {
                              return (boolean)var10000;
                           }

                           if (var10000 == -3) {
                              break;
                           }

                           label747: {
                              if (var8[0] == -1) {
                                 var24.read(var8);
                                 byte var52 = var8[0];
                                 var24.read(var8);
                                 byte var60 = var8[0];
                                 this.b((byte)var37, (byte)1, (byte)-1, (byte)var52, (byte)var60, (byte)-1);
                                 if (!var11) {
                                    break label747;
                                 }
                              }

                              this.b((byte)var37, (byte)2, var8[0], (byte)0, (byte)0, (byte)-1);
                           }

                           var37++;
                           if (var11) {
                              break;
                           }
                        }

                        this.f();
                     } catch (Exception var12) {
                        new StringBuffer().append("rec sync ").append(var12).toString();
                     }

                     this.b((int)Pd.w, ab.Kb);
                     this.b(Pd.w, Pd);
                  } else {
                     q var25;
                     if ((var25 = q.d(var1[1])) != null) {
                        var25.j();
                        var25.d(var1[2], var1[3]);
                        var25.c(var1[4], true);
                        if (var1[5] == 1) {
                           var25.b(var25.ub, false);
                        }
                     }

                     if (var1[6] == 1 && !M) {
                        this.a(var1);
                     }
                  }

                  return true;
               }

               if (var1[0] == 16) {
                  q var23;
                  if ((var23 = q.d(var1[1])) != null) {
                     var23.b(var1[2], ab.b(var1[3], var1[4], var1[5], var1[6]), false);
                     if (M) {
                        this.O.b(var1, var1[1]);
                     }

                     return true;
                  }

                  return false;
               }

               if (var1[0] == 23) {
                  q var22;
                  if ((var22 = q.d(var1[1])) != null) {
                     var22.b(ab.b(var1[2], var1[3], var1[4], var1[5]), false);
                     if (M) {
                        this.O.b(var1, var1[1]);
                     }

                     return true;
                  }

                  return false;
               }

               if (var1[0] == 17) {
                  q var21;
                  if ((var21 = q.d(var1[1])) != null) {
                     byte[] var3 = null;
                     if (var1[3] != 0) {
                        var3 = new byte[var1[3]];
                        byte var4 = 0;

                        while (var4 < var1[3]) {
                           var3[var4] = var1[var4 + 4];
                           var4++;
                           if (var11) {
                              return true;
                           }

                           if (var11) {
                              break;
                           }
                        }
                     }

                     var21.b(var1[2], var3);
                  }

                  return true;
               }

               if (var1[0] == 18) {
                  new s(var1[1], var1[2], var1[3], false);
                  return true;
               }

               if (var1[0] == 19) {
                  hb.b(var1[1], var1[2], var1[3], null, null);
                  return true;
               }

               if (var1[0] == 20) {
                  this.b(var1[1], var1[2], var1[3], var1[4], var1[5], var1[6]);
                  return true;
               }

               if (var1[0] == 21) {
                  q var20;
                  if ((var20 = q.d(var1[1])) != null) {
                     var20.d(var1[2], true);
                  }

                  return true;
               }

               if (var1[0] == 22) {
                  q var19;
                  if ((var19 = q.d(var1[1])) != null) {
                     var19.c(var1[2], ab.b(var1[3], var1[4], var1[5], var1[6]), false);
                     if (M) {
                        this.O.b(var1, var1[1]);
                     }

                     return true;
                  }

                  return false;
               }
            }
         }
      } catch (Exception var13) {
      }

      return true;
   }

   private static boolean b(int var0, int var1, int var2, int var3, int var4) {
      switch (var0) {
         case 0:
            if (var2 > var4) {
               return true;
            }
            break;
         case 1:
            if (var1 < var3) {
               return true;
            }
            break;
         case 2:
            if (var2 < var4) {
               return true;
            }
            break;
         case 3:
            if (var1 > var3) {
               return true;
            }
      }

      return false;
   }

   private void a(byte[] var1) {
      if (M) {
         this.b(var1);
      } else {
         this.N.b(var1);
      }
   }

   public final void b(byte var1, q var2) {
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      byte[] var5 = new byte[]{9, var1, 14, 6, 11};

      try {
         var3.write(var5);
         var3.write(ab.b(var2.Yb));
         var3.write(ab.b(var2.ac));
         var3.write(ab.b(var2.dc));
      } catch (Exception var4) {
      }

      this.a(var3.toByteArray());
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public final void f(byte var1) {
      boolean var8 = ab.xc;
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();

      try {
         ByteArrayOutputStream var10000;
         label144: {
            label236: {
               label237: {
                  label238: {
                     var2.write(15);
                     var2.write(0);
                     if (Yd == null) {
                        var2.write(ab.b(0));
                        if (!var8) {
                           break label238;
                        }
                     }

                     var2.write(ab.b(Yd.size()));
                     int var3 = 0;

                     while (var3 < Yd.size()) {
                        s var4 = (s)Yd.elementAt(var3);
                        var2.write(var4.u);
                        var2.write(var4.g);
                        var2.write(var4.h);
                        var2.write(0);
                        var3++;
                        if (var8) {
                           break label237;
                        }

                        if (var8) {
                           break;
                        }
                     }
                  }

                  if (Ud == null) {
                     var2.write(ab.b(0));
                     if (!var8) {
                        break label236;
                     }
                  }

                  var2.write(ab.b(Ud.size()));
               }

               int var10 = 0;

               while (var10 < Ud.size()) {
                  hb var12 = (hb)Ud.elementAt(var10);
                  var2.write(var12.o);
                  var2.write(var12.q);
                  var10000 = var2;
                  if (var8) {
                     break label144;
                  }

                  label120: {
                     var2.write(var12.r);
                     if (var12.x == null) {
                        var2.write(-1);
                        if (!var8) {
                           break label120;
                        }
                     }

                     var2.write(var12.x.w);
                  }

                  var2.write(0);
                  var10++;
                  if (var8) {
                     break;
                  }
               }
            }

            var10000 = new ByteArrayOutputStream();
         }

         label223: {
            label241: {
               label242: {
                  ByteArrayOutputStream var6;
                  int var7;
                  label220: {
                     int var11;
                     label243: {
                        label218: {
                           var6 = var10000;
                           var7 = 0;
                           if (Re != null) {
                              var11 = 0;

                              while (var11 < Re.length) {
                                 var15 = 0;
                                 if (var8) {
                                    break label218;
                                 }

                                 int var13 = 0;

                                 while (var13 < Re[0].length) {
                                    var16 = Re[var11][var13].d;
                                    if (var8) {
                                       break label243;
                                    }

                                    label209:
                                    if (Re[var11][var13].d != null) {
                                       if (Re[var11][var13].d.A) {
                                          var7++;
                                          var6.write((byte)var11);
                                          var6.write((byte)var13);
                                          var6.write(0);
                                          var6.write((byte)(Re[var11][var13].d.N ? 1 : 0));
                                          String var5 = "" + Re[var11][var13].d.M;
                                          var6.write((byte)var5.length());
                                          var6.write(var5.getBytes());
                                          if (!var8) {
                                             break label209;
                                          }
                                       }

                                       if (Re[var11][var13].d.I != 0) {
                                          var7++;
                                          var6.write((byte)var11);
                                          var6.write((byte)var13);
                                          var6.write(1);
                                          var6.write(ab.b(Re[var11][var13].d.H));
                                       }
                                    }

                                    var13++;
                                    if (var8) {
                                       break;
                                    }
                                 }

                                 var11++;
                                 if (var8) {
                                    break;
                                 }
                              }
                           }

                           var2.write(ab.b(var7));
                           var15 = var7;
                        }

                        if (var15 > 0) {
                           var2.write(var6.toByteArray());
                        }

                        var2.write(ab.b(this.hb[0]));
                        var2.write(ab.b(this.hb[1]));
                        var6 = new ByteArrayOutputStream();
                        var7 = 0;
                        if (Qd == null) {
                           var2.write((byte)var7);
                           if (var7 > 0) {
                              var2.write(var6.toByteArray());
                           }

                           if (ib == null || jb == null) {
                              break label241;
                           }

                           var17 = ib.H;
                           break label242;
                        }

                        var11 = 0;
                        if (var11 >= Qd.size()) {
                           break label220;
                        }

                        var16 = Qd.elementAt(var11);
                     }

                     while (true) {
                        q var14;
                        var17 = var14 = (q)var16;
                        if (var8) {
                           break label242;
                        }

                        if (var17 != null) {
                           var7++;
                           var6.write(var14.w);
                           var6.write(ab.b(var14.A));
                           var6.write((byte)var14.B);
                           var6.write(ab.b(var14.nc));
                           var6.write((byte)var14.y.length());
                           var6.write(var14.y.getBytes());
                           var6.write(var14.Y ? (var14.Lc == ee ? 2 : 1) : 0);
                           var6.write(var14.fb ? 1 : 0);
                           var6.write(var14.ib ? 1 : 0);
                           var6.write(var14.kb ? 1 : 0);
                           var6.write(var14.hc ? 1 : 0);
                           var6.write(var14.mb);
                           if (var14.mb != -1) {
                              var6.write(var14.g);
                              var6.write(var14.h);
                              var6.write(var14.ub);
                              var6.write(var14.e() ? 1 : 0);
                           }
                        }

                        if (var8 || ++var11 >= Qd.size()) {
                           break;
                        }

                        var16 = Qd.elementAt(var11);
                     }
                  }

                  var2.write((byte)var7);
                  if (var7 > 0) {
                     var2.write(var6.toByteArray());
                  }

                  if (ib == null || jb == null) {
                     break label241;
                  }

                  var17 = ib.H;
               }

               label153: {
                  if (var17 != null) {
                     var2.write(ib.H.w);
                     if (!var8) {
                        break label153;
                     }
                  }

                  var2.write(-1);
                  var2.write(ib.g);
                  var2.write(ib.h);
               }

               if (jb.H != null) {
                  var2.write(jb.H.w);
                  if (!var8) {
                     break label223;
                  }
               }

               var2.write(-1);
               var2.write(jb.g);
               var2.write(jb.h);
               if (!var8) {
                  break label223;
               }
            }

            var2.write(-3);
         }

         if (var1 > 0) {
            this.O.b(var1 - 2, var2.toByteArray());
            if (!var8) {
               return;
            }
         }

         this.a(var2.toByteArray());
      } catch (Exception var9) {
         new StringBuffer().append("sync ex ").append(var9).toString();
      }
   }

   public final void b(byte var1, byte var2, byte var3) {
      byte[] var4;
      label11: {
         (var4 = new byte[7])[0] = 15;
         var4[1] = var1;
         q var5 = q.d(var1);
         var4[2] = var5.g;
         var4[3] = var5.h;
         var4[4] = var5.ub;
         if (var5.e()) {
            var4[5] = 1;
            if (!ab.xc) {
               break label11;
            }
         }

         var4[5] = 0;
      }

      var4[6] = var3;
      this.O.b(var2 - 2, var4);
   }

   private void b(int var1, String var2) {
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();

      try {
         var3.write(13);
         var3.write((byte)var1);
         var3.write((byte)var2.getBytes().length);
         var3.write(var2.getBytes());
      } catch (Exception var4) {
      }

      this.a(var3.toByteArray());
   }

   public final void b(byte var1, byte var2, byte var3, byte var4, boolean var5) {
      byte[] var6;
      (var6 = new byte[6])[0] = 4;
      var6[1] = var1;
      var6[2] = var4;
      var6[3] = (byte)(var5 ? 1 : 0);
      var6[4] = var2;
      var6[5] = var3;
      this.a(var6);
   }

   public final void c(byte var1, byte var2, byte var3) {
      byte[] var4;
      (var4 = new byte[4])[0] = 3;
      var4[1] = var1;
      var4[2] = var2;
      var4[3] = var3;
      this.a(var4);
   }

   public final void b(byte var1, byte var2, byte var3, byte var4, byte[] var5) {
      boolean var8 = ab.xc;
      byte var6 = var5 != null ? (byte)var5.length : 0;
      byte[] var7;
      (var7 = new byte[var6 + 6])[0] = 5;
      var7[1] = var1;
      var7[2] = var2;
      var7[3] = var3;
      var7[4] = var4;
      var7[5] = var6;
      if (var5 != null) {
         var1 = 0;

         while (var1 < var6) {
            var7[var1 + 6] = var5[var1];
            var1++;
            if (var8) {
               return;
            }

            if (var8) {
               break;
            }
         }
      }

      this.a(var7);
   }

   public final void b(byte var1, int var2, boolean var3, boolean var4) {
      byte[] var5;
      (var5 = new byte[8])[0] = 6;
      var5[1] = var1;
      byte[] var6 = ab.b(var2);
      var5[2] = var6[0];
      var5[3] = var6[1];
      var5[4] = var6[2];
      var5[5] = var6[3];
      var5[6] = (byte)(var3 ? 1 : 0);
      var5[7] = (byte)(var4 ? 1 : 0);
      this.a(var5);
   }

   public final void b(byte var1, int var2, int var3, byte var4, byte var5, boolean var6, boolean var7) {
      q var8;
      if ((var8 = q.d(var1)) != null) {
         var8.gc = true;
      }

      if (var1 == var4) {
         var4 = -1;
      }

      this.b(var4, var1, var5, false);
      byte[] var11;
      (var11 = new byte[14])[0] = 7;
      var11[1] = var1;
      byte[] var9 = ab.b(var2);
      var11[2] = var9[0];
      var11[3] = var9[1];
      var11[4] = var9[2];
      var11[5] = var9[3];
      byte[] var10 = ab.b(var3);
      var11[6] = var10[0];
      var11[7] = var10[1];
      var11[8] = var10[2];
      var11[9] = var10[3];
      var11[10] = var4;
      var11[11] = var5;
      var11[12] = (byte)(var6 ? 1 : 0);
      var11[13] = (byte)(var7 ? 1 : 0);
      this.a(var11);
   }

   public final void b(
      byte var1, byte var2, byte var3, byte var4, byte var5, boolean var6, boolean var7, boolean var8, byte var9, byte var10, byte var11, byte var12
   ) {
      byte[] var13;
      (var13 = new byte[13])[0] = 8;
      var13[1] = var1;
      var13[2] = var2;
      var13[3] = var3;
      var13[4] = var4;
      var13[5] = var5;
      var13[6] = (byte)(var6 ? 1 : 0);
      var13[7] = (byte)(var7 ? 1 : 0);
      var13[8] = (byte)(var8 ? 1 : 0);
      var13[9] = var9;
      var13[10] = var10;
      var13[11] = var11;
      var13[12] = var12;
      this.a(var13);
   }

   public final void n() {
      if (Pd != null) {
         byte[] var1;
         (var1 = new byte[2])[0] = 10;
         var1[1] = Pd.w;
         this.a(var1);
      }
   }

   public final void b(byte var1, byte var2, byte var3, boolean var4, boolean var5) {
      byte[] var6;
      (var6 = new byte[6])[0] = 11;
      var6[1] = var1;
      var6[2] = var2;
      var6[3] = var3;
      var6[4] = (byte)(var4 ? 1 : 0);
      var6[5] = (byte)(var5 ? 1 : 0);
      this.a(var6);
   }

   public final void b(byte var1, byte var2, int var3) {
      byte[] var4;
      (var4 = new byte[7])[0] = 12;
      var4[1] = var1;
      var4[2] = var2;
      byte[] var5 = ab.b(var3);
      var4[3] = var5[0];
      var4[4] = var5[1];
      var4[5] = var5[2];
      var4[6] = var5[3];
      this.a(var4);
   }

   public final void c(byte var1, byte var2, int var3) {
      byte[] var4;
      (var4 = new byte[7])[0] = 16;
      var4[1] = var1;
      var4[2] = var2;
      byte[] var5 = ab.b(var3);
      var4[3] = var5[0];
      var4[4] = var5[1];
      var4[5] = var5[2];
      var4[6] = var5[3];
      if (M) {
         this.O.b(var1 - 2, var4);
      } else {
         this.N.b(var4);
      }
   }

   public final void b(byte var1, int var2) {
      byte[] var3;
      (var3 = new byte[6])[0] = 23;
      var3[1] = var1;
      byte[] var4 = ab.b(var2);
      var3[2] = var4[0];
      var3[3] = var4[1];
      var3[4] = var4[2];
      var3[5] = var4[3];
      if (M) {
         this.O.b(var1 - 2, var3);
      } else {
         this.N.b(var3);
      }
   }

   public final void b(byte var1, byte var2, byte[] var3) {
      boolean var5 = ab.xc;
      byte[] var4;
      (var4 = new byte[4 + (var3 == null ? 0 : var3.length)])[0] = 17;
      var4[1] = var1;
      var4[2] = var2;
      var4[3] = var3 == null ? 0 : (byte)var3.length;
      if (var4[3] != 0 && var3 != null) {
         var1 = 0;

         while (var1 < var3.length) {
            var4[var1 + 4] = var3[var1];
            var1++;
            if (var5) {
               return;
            }

            if (var5) {
               break;
            }
         }
      }

      this.a(var4);
   }

   public final void d(byte var1, byte var2, byte var3) {
      byte[] var4;
      (var4 = new byte[4])[0] = 18;
      var4[1] = var1;
      var4[2] = var2;
      var4[3] = var3;
      this.a(var4);
   }

   public final void c(byte var1, byte var2) {
      byte[] var3;
      (var3 = new byte[3])[0] = 21;
      var3[1] = var1;
      var3[2] = var2;
      this.a(var3);
   }

   public final void d(byte var1, byte var2, int var3) {
      byte[] var4;
      (var4 = new byte[7])[0] = 22;
      var4[1] = var1;
      var4[2] = var2;
      byte[] var5 = ab.b(var3);
      var4[3] = var5[0];
      var4[4] = var5[1];
      var4[5] = var5[2];
      var4[6] = var5[3];
      if (M) {
         this.O.b(var1 - 2, var4);
      } else {
         this.N.b(var4);
      }
   }

   private void a(String var1) {
      boolean var4 = ab.xc;

      try {
         String var2;
         label180: {
            var2 = ab.cc && !ab.Jb ? "_bm" : "";
            if (ab.Jb) {
               ab.pc = 0;
               ab.qc = 25;
               ab.rc = 50;
               ab.sc = 75;
               if (!var4) {
                  break label180;
               }
            }

            ab.pc = 4;
            ab.qc = 100;
            ab.rc = 200;
            ab.sc = 300;
         }

         int var10000;
         label175: {
            ab.q++;
            System.gc();
            a(50);
            ab.q++;
            pb = ab.b("items/coin.png", 20, 20);
            if (rc.e && Fd == null) {
               Gd = new int[(Fd = ab.b("menu/icons_ts.png", 48, 48)).h];
               Hd = new int[Fd.h];
               Id = new int[Fd.h >> 1];
               Jd = new int[Fd.h >> 1];
               int var3 = 0;

               while (var3 < Fd.h) {
                  var10000 = var3;
                  if (var4) {
                     break label175;
                  }

                  switch (var3) {
                     case 0:
                        Id[var3] = 0;
                        Jd[var3] = 2 * (ab.E - 20 - 40) / 3 - Fd.e / 2 + 20;
                        Gd[var3] = (var3 + 1) * (ab.D / 5) - Fd.d / 2;
                        if (!var4) {
                           break;
                        }
                     case 1:
                        Id[var3] = 0;
                        Jd[var3] = (ab.E - 20 - 40) / 3 - Fd.e / 2 + 20;
                        Gd[var3] = var3 * (ab.D / 5) - Fd.d / 2;
                        if (!var4) {
                           break;
                        }
                     case 2:
                        Id[var3] = ab.D >> 1;
                        Jd[var3] = 2 * (ab.E - 20 - 40) / 3 - Fd.e / 2 + 20;
                        Gd[var3] = (var3 + 2) * (ab.D / 5) - Fd.d / 2;
                        Hd[var3] = Jd[var3] + (Jd[0] - Jd[1] - Fd.e >> 1);
                        Hd[0] = Hd[var3];
                        if (!var4) {
                           break;
                        }
                     case 3:
                        Id[var3] = ab.D >> 1;
                        Jd[var3] = (ab.E - 20 - 40) / 3 - Fd.e / 2 + 20;
                        Gd[var3] = (var3 + 1) * (ab.D / 5) - Fd.d / 2;
                        Hd[var3] = Jd[var3] + (Jd[0] - Jd[1] - Fd.e >> 1);
                        Hd[1] = Hd[var3];
                        if (!var4) {
                           break;
                        }
                     case 4:
                        Id[var3] = 0;
                        Jd[var3] = 2 * (ab.E - 20 - 40) / 3 - Fd.e / 2 + 20;
                     case 5:
                     case 9:
                        Gd[var3] = Gd[0];
                        Hd[var3] = Hd[0];
                        if (!var4) {
                           break;
                        }
                     case 6:
                        Gd[var3] = Gd[1];
                        Hd[var3] = Hd[1];
                        if (!var4) {
                           break;
                        }
                     case 7:
                        Gd[var3] = Gd[2];
                        Hd[var3] = Hd[2];
                        if (!var4) {
                           break;
                        }
                     case 8:
                        Gd[var3] = Gd[3];
                        Hd[var3] = Hd[3];
                  }

                  var3++;
                  if (var4) {
                     break;
                  }
               }
            }

            rb = ab.b("walls.png", 45, 55);
            sb = ab.b("tree_stubs.png", 50, 60);
            ab.q++;
            var10000 = ab.Jb;
         }

         if (var10000 == 0) {
            ub = ab.b("stones_20.png", 20, 20);
            ab.q++;
            vb = ab.b("stones_30.png", 30, 30);
            ab.q++;
         }

         wb = ab.b("bushes_big.png", 55, 55);
         ab.q++;
         xb = ab.b("chars/pipyaka.png", 30, 30);
         ab.q++;
         yb = ab.b("chars/death/pipyaka_explosion.png", 60, 60);
         ab.q++;
         if (!ab.Jb) {
            ab.b("chars/death/pipyaka_skulls" + var2 + ".png", 40, 34);
            ab.q++;
            ab.b("chars/death/pipyaka_tortilla" + var2 + ".png", 36, 36);
            ab.q++;
            ab.b("chars/death/pipyaka_parts" + var2 + ".png", 23, 23);
            ab.q++;
         }

         oc = ab.b("items/berserker.png", 35, 35);
         ab.q++;
         nc = ab.b("items/kaska.png", 36, 36);
         ab.q++;
         pc = ab.b("items/invisible.png", 35, 35);
         ab.q++;
         qc = ab.b("chars/skins/sock_helm.png", 36, 36);
         ab.q++;
         uc = ab.b("items/banana.png", 22, 18);
         ab.q++;
         wc = ab.b("items/sock.png", 28, 18);
         ab.q++;
         yc = ab.b("items/carrot.png", 22, 29);
         rc = ab.b("fx/pipyaka_hurt1" + var2 + ".png", 30, 30);
         ab.q++;
         if (!ab.Jb) {
            sc = ab.b("fx/pipyaka_hurt2" + var2 + ".png", 30, 30);
            ab.q++;
            if (ab.cc) {
               ab.b("chars/death/pipyaka_parts1_bm.png", 23, 23);
               Dc = ab.b("fx/bm_splashes.png", 25, 25);
               ab.b("fx/bm_fountain.png", 24, 44);
               Ec = ab.b("fx/bm_foots.png", 16, 16);
            }
         }

         tc = ab.b("fx/pipyaka_eyes_rolling.png", 18, 11);
         ab.q++;
         System.gc();
         a(50);
         ab.q++;
         Bb = ab.b("weapons/melon.png", 20, 20);
         ab.q++;
         Fb = ab.b("weapons/melon_thr.png", 20, 20);
         ab.q++;
         Gb = ab.b("weapons/ananas.png", 40, 40);
         ab.q++;
         Cb = ab.b("weapons/rabber_melon.png", 30, 30);
         ab.q++;
         Db = ab.b("weapons/melon_explosion.png", 60, 60);
         ab.q++;
         Hb = ab.b("weapons/ananas_exploding.png", 60, 60);
         ab.q++;
         Pc = ab.b("weapons/mine.png", 16, 14);
         Ib = ab.b("weapons/melon_hard.png", 20, 20);
         Jb = ab.b("weapons/melon_thr_hard.png", 20, 20);
         Kb = ab.b("weapons/rabber_melon_hard.png", 30, 30);
         Lb = ab.b("weapons/ananas_hard.png", 40, 40);
         Mb = ab.b("weapons/melon_explosion_hard.png", 60, 60);
         Hc = ab.b("weapons/bomb_crater.png", 40, 40);
         Eb = ab.b("weapons/melon_crater.png", 35, 35);
         if (ab.pc != 0) {
            ab.b("weapons/melon_parts.png", 20, 20);
            ab.b("weapons/melon_parts_hard.png", 20, 20);
         }

         ab.q++;
         if (ab.pc != 0) {
            ab.b("weapons/ananas_parts.png", 26, 26);
            ab.b("weapons/ananas_parts_hard.png", 26, 26);
         }

         ab.q++;
         if (!ab.Jb) {
            tb = ab.b("walls_craters.png", 35, 35);
            ab.q++;
            if (ab.cc) {
               zc = ab.b("fx/bm_blood_pool.png", 60, 60);
            }

            ab.q++;
         }

         zc = ab.b("fx/bm_blood_pool.png", 44, 25);
         Wb = ab.b("fx/egg.png", 60, 49);
         ab.q++;
         Xb = ab.b("fx/egg_parts.png", 30, 30);
         ab.q++;
         cc = ab.b("fx/team_pods.png", 36, 24);
         ab.q++;
         dc = ab.b("fx/hp_pod_l.png", 7, 9);
         ec = ab.b("fx/hp_pod_m.png", 6, 9);
         fc = ab.b("fx/hp_pod_r.png", 7, 9);
         ab.q++;
         gc = ab.b("fx/hp_scores.png", 5, 6);
         ic = ab.b("fx/hp_scores_extra.png", 5, 6);
         ab.q++;
         Fc = ab.b("weapons/bomb.png", 30, 30);
         if (ab.pc != 0) {
            ab.b("weapons/bomb_parts.png", 22, 22);
         }

         Gc = ab.b("weapons/bomb_explosion.png", 60, 60);
         Ic = ab.b("fx/spark.png", 22, 22);
         Lc = ab.b("fx/cloud_black_medium.png", 30, 30);
         if (!ab.Jb) {
            Kc = ab.b("fx/cloud_white_small.png", 24, 24);
         }

         System.gc();
         a(50);
         ab.q++;
         if (!ab.Jb) {
            Rb = ab.b("fx/flash_red.png", 120, 100);
            ab.q++;
            Sb = ab.b("fx/flash_blue.png", 120, 100);
            ab.q++;
            Tb = ab.b("fx/flash_yellow_small.png", 60, 50);
            ab.q++;
            Ub = ab.b("fx/flash_yellow.png", 120, 100);
            Vb = ab.b("fx/flash_yellow_very_small.png", 25, 21);
         }

         Jc = ab.b("fx/explosion_fire.png", 60, 60);
         if (!ab.Jb) {
            Nb = ab.b("fx/shadows/shadow_small.png", 20, 15);
            ab.q++;
            Ob = ab.b("fx/shadows/shadow_medium.png", 34, 18);
            Pb = ab.b("fx/shadows/shadow_medium2.png", 47, 25);
            ab.q++;
            Qb = ab.b("fx/shadows/shadow_big.png", 68, 36);
            ab.q++;
            zb = ab.b("tree_shadow.png", 150, 105);
            ab.q++;
         }

         hc = ab.b("fx/hp_flow.png", 8, 9);
         ab.b("fx/hp_flow_extra.png", 8, 9);
         ab.q++;
         jc = ab.b("weapons/rake.png", 42, 48);
         ab.q++;
         kc = ab.b("weapons/brick.png", 20, 17);
         ab.q++;
         lc = ab.b("weapons/brick_explosion.png", 45, 45);
         ab.q++;
         mc = ab.b("fx/stars_white.png", 15, 15);
         ab.q++;
         vc = ab.b("weapons/banana_skin.png", 30, 30);
         ab.q++;
         xc = ab.b("weapons/sock.png", 20, 20);
         ab.q++;
         Mc = ab.b("fx/cloud_green_medium.png", 30, 30);
         ab.q++;
         Cc = Image.createImage("/fx/ctf_flag_thread.png");
         if (j() == 2) {
            Ac = ab.b("fx/ctf_flag.png", 17, 20);
            Bc = ab.b("fx/ctf_flag_base.png", 40, 40);
         }

         Ab = ab.b("tree_crowns.png", 105, 92);
         ab.q += 3;
         System.gc();
         a(50);
         ab.q++;
         Rc = ab.b("trampoline.png", 40, 35);
         Sc = ab.b("items/bag.png", 30, 30);
         ab.q++;
      } catch (Exception var6) {
      }

      b = ab.Tb <= ab.Ub;
      k.b("/maps/" + var1, L == 0 && !b);
      ab.q += 5;
      qb = ab.b("ground_grass.png", 30, 30);
      ab.q++;
      b(0, 0, null);
      Be = 0;
      Ve = 0;
      Ue = 0;
      Te = 0;
      Se = 0;
      Ze = 0;
      Ye = 0;
      Xe = 0;
      We = 0;
      ab.q++;
      k();
      ab.q = ++ab.q + 1;
      y.b = false;
      ab.q++;
      ce = new l((byte)0, oc, l.b[0]);
      de = new l((byte)0, pc, l.b[1]);
      he = new l((byte)0, nc, l.b[12]);
      ee = new l((byte)0, qc, l.b[8]);
      if (rc != null) {
         fe = new l((byte)0, rc, l.b[9]);
      }

      if (sc != null) {
         ge = new l((byte)0, sc, l.b[10]);
      }

      ie = new l((byte)1, pd, l.b[15]);
      je = new l((byte)1, xd, l.b[16]);
      ke = new l((byte)1, wd, l.b[17]);
      ab.q++;
      label141:
      if (j() == 2) {
         byte var10;
         byte var10001;
         label139: {
            byte var8 = 0;
            if (Sd != null) {
               int var7 = 0;

               while (var7 < Sd.size()) {
                  g var9;
                  var10 = (var9 = (g)Sd.elementAt(var7)).d;
                  var10001 = 4;
                  if (var4) {
                     break label139;
                  }

                  if (var10 == 4 || var9.d == 5) {
                     var8++;
                  }

                  var7++;
                  if (var4) {
                     break;
                  }
               }
            }

            var10 = var8;
            var10001 = 2;
         }

         if (var10 == var10001) {
            (ib = new s((byte)6, (byte)-1, (byte)-1, false)).G = 0;
            ib.g();
            (jb = new s((byte)6, (byte)-1, (byte)-1, false)).G = 1;
            jb.g();
            if (!var4) {
               break label141;
            }
         }

         ab.m = 1;
      }

      if (i()) {
         try {
            Od = Image.createImage("/transparent10.png");
         } catch (Exception var5) {
         }
      }

      ab.c();
      ab.q++;
      System.gc();
      a(50);
      ab.q++;
   }

   public final void run() {
      boolean var14 = ab.xc;
      this.v = false;
      long var3 = System.currentTimeMillis();
      long var5 = 0L;
      long var9 = var3;

      while (this.J == 0) {
         long var1 = System.currentTimeMillis();
         if (ab.l != 0 || this.c()) {
            this.o();
            if (this.o % 2L == 0L) {
               rc.b.repaint();
               rc.b.serviceRepaints();
            }

            long var12;
            if ((var12 = 41L - (System.currentTimeMillis() - var1)) > 0L) {
               try {
                  Thread.sleep(var12);
               } catch (Exception var15) {
               }
            }

            Thread.yield();
            if (!var14) {
               continue;
            }
         }

         if (var5 > 0L && var1 - var5 > 100L) {
            var5 = 0L;
            this.v = false;
            rc.b.n = false;
         }

         if (!this.v && !rc.b.n) {
            if (var1 >= var9 + this.u) {
               this.o();
               this.t++;
               var9 = System.currentTimeMillis();
            }

            label94: {
               long var7;
               if ((var7 = var1 - var3) > 0L && var7 < 1000L) {
                  this.b(this.t * 1000 / var7, false);
                  if (!var14) {
                     break label94;
                  }
               }

               if (var7 >= 1000L) {
                  label70: {
                     if (p == 0) {
                        p = this.q;
                        if (!var14) {
                           break label70;
                        }
                     }

                     p = (p + this.q) / 2;
                  }

                  label65: {
                     this.q = 0;
                     if (s == 0) {
                        s = this.t;
                        if (!var14) {
                           break label65;
                        }
                     }

                     s = (s + this.t) / 2;
                  }

                  this.t = 0;
                  this.b((long)s, true);
                  var3 = var1;
               }
            }

            boolean var16 = true;
            if (this.r > 0 && m[this.r - 1][(int)(this.n % 12L)] == 0) {
               var16 = false;
            }

            this.n++;
            if (var16) {
               var5 = System.currentTimeMillis();
               this.v = true;
               rc.b.repaint();
               rc.b.serviceRepaints();
            }
         }

         Thread.yield();
         if (var14) {
            break;
         }
      }
   }

   private void o() {
      boolean var9;
      var9 = ab.xc;
      this.o++;
      kb++;
      label1071:
      if (!i()) {
         if (M) {
            this.O.j();
            if (!var9) {
               break label1071;
            }
         }

         this.N.h();
      }

      fb var1 = this;
      nb = System.currentTimeMillis();
      if (ab.l == 1 && !ab.o) {
         ab.B.e();
      }

      label1135: {
         if (!ab.o && var1.i != null) {
            var1.i.d();
            if (!var9) {
               break label1135;
            }
         }

         label1041:
         if (var1.R && !ab.o) {
            label1076: {
               if (var1.db > 0) {
                  var1.db--;
                  if (var1.db != 0) {
                     break label1076;
                  }

                  var1.cb = !var1.cb;
                  if (!var9) {
                     break label1076;
                  }
               }

               if (var1.cb) {
                  if (var1.ab < var1.bb) {
                     var1.ab++;
                  }

                  if (var1.ab < var1.bb) {
                     break label1076;
                  }

                  var1.db = 40;
                  if (!var9) {
                     break label1076;
                  }
               }

               if (var1.ab > 0) {
                  var1.ab--;
               }

               if (var1.ab <= 0) {
                  var1.db = 40;
               }
            }

            if (var1.eb == -1) {
               if (var1.gb == 0) {
                  var1.gb = 1;
               }

               if (var1.gb >= var1.fb) {
                  break label1041;
               }

               var1.gb <<= 1;
               if (var1.gb <= var1.fb) {
                  break label1041;
               }

               var1.gb = var1.fb;
               var1.eb = 0;
               var1.R = false;
               if (!var9) {
                  break label1041;
               }
            }

            label1030:
            if (var1.eb == 1) {
               if (var1.gb > 0) {
                  var1.gb /= 2;
                  if (!var9) {
                     break label1030;
                  }
               }

               var1.eb = 0;
            }
         }

         label1080: {
            int var10000;
            int var10001;
            byte var10002;
            label1136: {
               label1022: {
                  if (!var1.c()) {
                     if (!i()) {
                        long var5;
                        label1017: {
                           var5 = System.currentTimeMillis();
                           if (var1.k != 0L) {
                              if (var5 - var1.k <= 24999L) {
                                 break label1017;
                              }

                              if (Pd != null) {
                                 qb.d(Pd);
                              }
                           }

                           var1.k = var5;
                        }

                        label992:
                        if (M) {
                           if (var1.l != 0L) {
                              if (var5 - var1.l <= 4999L) {
                                 break label992;
                              }

                              if (ab.mc >= 140) {
                                 int var2 = 0;
                                 byte var7 = -1;

                                 byte var3;
                                 while (true) {
                                    if (++var2 > 10) {
                                       var3 = -1;
                                       if (!var9) {
                                          break;
                                       }
                                    }

                                    var3 = (byte)(2 + ab.oc.nextInt(Pe - 4));
                                    var7 = (byte)(2 + ab.oc.nextInt(Qe - 4));
                                    if ((Re == null || Re[var3][var7].d == null) && s.b(var3, var7) == null) {
                                       var10000 = var3;
                                       var10001 = var7;
                                       var10002 = 1;
                                       if (var9) {
                                          break label1136;
                                       }

                                       if (q.b(var3, var7, 1, null) == null) {
                                          break;
                                       }
                                    }
                                 }

                                 if (var3 != -1) {
                                    ab.mc -= 140;
                                    new s((byte)17, var3, var7, false);
                                    var1.d((byte)17, var3, var7);
                                 }
                              }
                           }

                           var1.l = var5;
                        }
                     }

                     label1086: {
                        if (var1.Q != null) {
                           h var10 = var1.Q;
                           if (var1.Q.b <= 0) {
                              var10.b++;
                           }

                           int var43 = 0;

                           while (var43 < var10.c.size()) {
                              m var50;
                              (var50 = (m)var10.c.elementAt(var43)).c++;
                              var10000 = var50.c;
                              var68 = 60;
                              if (var9) {
                                 break label1086;
                              }

                              if (var50.c >= 60) {
                                 var10.c.removeElementAt(var43);
                                 var43--;
                              }

                              var43++;
                              if (var9) {
                                 break;
                              }
                           }
                        }

                        if (var1.C > 0) {
                           var1.C--;
                        }

                        var1.z++;
                        var10000 = var1.z;
                        var68 = 11;
                     }

                     if (var10000 <= var68) {
                        break label1022;
                     }

                     var1.z = 0;
                     if (!var9) {
                        break label1022;
                     }
                  }

                  var1.k = System.currentTimeMillis();
                  var1.l = System.currentTimeMillis();
               }

               if (Be == 0) {
                  if (var1.c()) {
                     break label1135;
                  }

                  if (Pd != null && Pd.n() && !Pd.hc) {
                     byte var44 = -1;
                     if (var1.le != 0) {
                        var44 = 0;
                        if (var1.le == 1) {
                           var1.le = 0;
                        }
                     }

                     if (var1.ne != 0) {
                        var44 = 2;
                        if (var1.ne == 1) {
                           var1.ne = 0;
                        }
                     }

                     if (var1.oe != 0) {
                        var44 = 3;
                        if (var1.oe == 1) {
                           var1.oe = 0;
                        }
                     }

                     if (var1.me != 0) {
                        var44 = 1;
                        if (var1.me == 1) {
                           var1.me = 0;
                        }
                     }

                     if (var44 != -1) {
                        boolean var6 = false;
                        if (System.currentTimeMillis() - var1.ue < 300L) {
                           var1.ue = System.currentTimeMillis();
                           var6 = true;
                        }

                        if (Pd.b(var44, var6) && !i()) {
                           var1.b(Pd.w, Pd.g, Pd.h, var44, var6);
                        }
                     }

                     label956: {
                        if (var1.pe != 0) {
                           label1141: {
                              if (Pd.Cc == null) {
                                 label949:
                                 if (Pd.bc != -1) {
                                    int var47;
                                    if ((var47 = Pd.b((byte)Pd.bc, false, Pd.g, Pd.h, null)) == 2) {
                                       if (kb - var1.E < 75L) {
                                          break label949;
                                       }

                                       q var11 = Pd;
                                       int var10003 = Pd.c / 10;
                                       var11 = Pd;
                                       (new w(null, var10003, Pd.d / 10 - 25, (byte)8, true, 0)).i = "^27~";
                                       var1.E = kb;
                                       if (!var9) {
                                          break label949;
                                       }
                                    }

                                    if (var47 == 0 && Pd.Yb[Pd.bc] != -1) {
                                       String var28 = hb.b(Pd.bc) + Pd.Yb[Pd.bc];
                                       var1.D = var28;
                                    }
                                 }

                                 var1.a(true);
                                 if (!var9) {
                                    break label1141;
                                 }
                              }

                              if (Pd.Cc.e() || Pd.Cc.f()) {
                                 Pd.Cc.d();
                                 if (!var9) {
                                    break label1141;
                                 }
                              }

                              if (Pd.bc != -1) {
                                 Pd.Cc.b((byte)-1, Pd.bc);
                              }
                           }

                           var1.pe = 0;
                           if (!var9) {
                              break label956;
                           }
                        }

                        if (var1.qe != 0 && Pd.cc != -1) {
                           label926: {
                              if (Pd.cc < 14) {
                                 if (Pd.b((byte)Pd.cc, false, Pd.g, Pd.h, null) == 2 && kb - var1.E >= 75L) {
                                    q var13 = Pd;
                                    int var72 = Pd.c / 10;
                                    var13 = Pd;
                                    (new w(null, var72, Pd.d / 10 - 25, (byte)8, true, 0)).i = "^27~";
                                    var1.E = kb;
                                 }

                                 if (!var9) {
                                    break label926;
                                 }
                              }

                              Pd.d((byte)(Pd.cc - 14), false);
                           }

                           var1.a(false);
                           var1.qe = 0;
                        }
                     }

                     if (var1.re != 0) {
                        Pd.b(false, (byte)-1, (byte)-1, false, false);
                        var1.re = 0;
                     }

                     if (!var9) {
                        break label1080;
                     }
                  }

                  var1.e();
                  if (!var9) {
                     break label1080;
                  }
               }

               if (Be != we) {
                  break label1080;
               }

               if (var1.le != 0) {
                  Fe = Fe + ye;
                  if (var1.le == 1) {
                     var1.le = 0;
                  }
               }

               if (var1.me != 0) {
                  Ee = Ee - ye;
                  if (var1.me == 1) {
                     var1.me = 0;
                  }
               }

               if (var1.ne != 0) {
                  Fe = Fe - ye;
                  if (var1.ne == 1) {
                     var1.ne = 0;
                  }
               }

               if (var1.oe != 0) {
                  Ee = Ee + ye;
                  if (var1.oe == 1) {
                     var1.oe = 0;
                  }
               }

               var10000 = Ee;
               var10001 = ab.D / 2;
               var10002 = Ae;
            }

            label913: {
               if (var10000 < var10001 + var10002) {
                  Ee = ab.D / 2 + Ae;
                  if (!var9) {
                     break label913;
                  }
               }

               if (Ee > Pe * 30 - ab.D / 2 - Ae) {
                  Ee = Pe * 30 - ab.D / 2 - Ae;
               }
            }

            if (Fe < ab.E / 2 + Ae) {
               Fe = ab.E / 2 + Ae;
               if (!var9) {
                  break label1080;
               }
            }

            if (Fe > Qe * 30 - ab.E / 2 - Ae) {
               Fe = Qe * 30 - ab.E / 2 - Ae;
            }
         }

         b(Ee, Fe, De);
         byte var45 = Ce;
         if (Be == we) {
            var45 = ze;
         }

         int var48;
         if ((var48 = Ie - Ge) > var45) {
            var48 = var45;
         }

         int var15;
         if ((var15 = Je - He) > var45) {
            var15 = var45;
         }

         Ge += var48 / 5;
         He += var15 / 5;
         if (Ne >= 0) {
            label896:
            if (--Ne > 0) {
               if (Ne < 3) {
                  Me /= 2;
               }

               if (Me > 0) {
                  Ke = ab.oc.nextInt(Me) - ab.oc.nextInt(Me);
                  Le = ab.oc.nextInt(Me) - ab.oc.nextInt(Me);
                  if (!var9) {
                     break label896;
                  }
               }

               Ne = 0;
            }

            if (Ne == 0) {
               Ne = -1;
               Ke = 0;
               Le = 0;
            }

            Ge = Ge + Ke;
            He = He + Le;
         }

         if (Ge < Ae) {
            Ge = Ae;
         }

         if (Ge + ab.D > Pe * 30 - Ae) {
            Ge = Pe * 30 - ab.D - Ae;
         }

         if (He < Ae) {
            He = Ae;
         }

         if (He + ab.E > Qe * 30 - Ae) {
            He = Qe * 30 - ab.E - Ae;
         }

         Se = (byte)Math.abs(Ge / 30);
         Te = (byte)Math.abs(He / 30);
         Ue = (byte)(ab.D / 30 + 2);
         Ve = (byte)(ab.E / 30 + 2);
         if (Se < 0) {
            Se = 0;
         }

         if (Te < 0) {
            Te = 0;
         }

         if (Se + Ue > Pe) {
            Ue = (byte)(Pe - Se);
         }

         if (Te + Ve > Qe) {
            Ve = (byte)(Qe - Te);
         }

         We = (byte)(Se - af);
         Xe = (byte)(Te - af);
         Ye = (byte)(Ue + (af << 1));
         Ze = (byte)(Ve + (af << 1));
         if (We < 0) {
            Ye = (byte)(Ye + We);
            We = 0;
         }

         if (Xe < 0) {
            Ze = (byte)(Ze + Xe);
            Xe = 0;
         }

         if (We + Ye > Pe) {
            Ye = (byte)(Pe - We);
         }

         if (Xe + Ze > Qe) {
            Ze = (byte)(Qe - Xe);
         }

         if (!var1.c()) {
            boolean var59;
            label868: {
               if (Qd != null) {
                  var15 = 0;

                  while (var15 < Qd.size()) {
                     var59 = ((q)Qd.elementAt(var15)).V;
                     if (var9) {
                        break label868;
                     }

                     label862: {
                        if (var59) {
                           Qd.removeElementAt(var15);
                           var15--;
                           if (!var9) {
                              break label862;
                           }
                        }

                        ((q)Qd.elementAt(var15)).h();
                     }

                     var15++;
                     if (var9) {
                        break;
                     }
                  }
               }

               var59 = i();
            }

            label1142: {
               if ((var59 || M) && Zd != null && kb % 2L == 0L) {
                  var1.A = false;
                  var15 = 0;

                  while (var15 < Zd.size()) {
                     v var51;
                     var59 = (var51 = (v)Zd.elementAt(var15)).q;
                     if (var9) {
                        break label1142;
                     }

                     label1099: {
                        if (var59 != 0) {
                           Zd.removeElementAt(var15);
                           var15--;
                           if (!var9) {
                              break label1099;
                           }
                        }

                        if (var51.x) {
                           var51.y -= 2L;
                           if (var51.y > 0L) {
                              break label1099;
                           }

                           var51.b(var51.z);
                           if (!var9) {
                              break label1099;
                           }
                        }

                        var51.b();
                     }

                     var15++;
                     if (var9) {
                        break;
                     }
                  }
               }

               if (be != null) {
                  var15 = 0;

                  while (var15 < be.size()) {
                     var59 = ((r)be.elementAt(var15)).z;
                     if (var9) {
                        break label1142;
                     }

                     label818: {
                        if (var59 != 0) {
                           be.removeElementAt(var15);
                           var15--;
                           if (!var9) {
                              break label818;
                           }
                        }

                        ((r)be.elementAt(var15)).h();
                     }

                     var15++;
                     if (var9) {
                        break;
                     }
                  }
               }

               if (Xd != null) {
                  var15 = 0;

                  while (var15 < Xd.size()) {
                     var59 = ((w)Xd.elementAt(var15)).f;
                     if (var9) {
                        break label1142;
                     }

                     label803: {
                        if (var59 != 0) {
                           Xd.removeElementAt(var15);
                           var15--;
                           if (!var9) {
                              break label803;
                           }
                        }

                        ((w)Xd.elementAt(var15)).b();
                     }

                     var15++;
                     if (var9) {
                        break;
                     }
                  }
               }

               if (Ud != null) {
                  var15 = 0;

                  while (var15 < Ud.size()) {
                     var59 = ((hb)Ud.elementAt(var15)).p;
                     if (var9) {
                        break label1142;
                     }

                     label788: {
                        if (var59 != 0) {
                           Ud.removeElementAt(var15);
                           var15--;
                           if (!var9) {
                              break label788;
                           }
                        }

                        ((hb)Ud.elementAt(var15)).c();
                     }

                     var15++;
                     if (var9) {
                        break;
                     }
                  }
               }

               if (Td != null) {
                  int var4 = 0;

                  while (var4 < Td.size()) {
                     var59 = ((p)Td.elementAt(var4)).t;
                     if (var9) {
                        break label1142;
                     }

                     label773: {
                        if (var59 != 0) {
                           Td.removeElementAt(var4);
                           var4--;
                           if (!var9) {
                              break label773;
                           }
                        }

                        ((p)Td.elementAt(var4)).h();
                     }

                     var4++;
                     if (var9) {
                        break;
                     }
                  }
               }

               if (Ic != null) {
                  pb var21 = Ic;
                  Ic.b++;
                  if (var21.b >= var21.h) {
                     var21.b = 0;
                  }
               }

               if (Vd != null) {
                  int var36 = 0;

                  while (var36 < Vd.size()) {
                     var59 = ((t)Vd.elementAt(var36)).C;
                     if (var9) {
                        break label1142;
                     }

                     label757: {
                        if (var59 != 0) {
                           t.r--;
                           Vd.removeElementAt(var36);
                           var36--;
                           if (!var9) {
                              break label757;
                           }
                        }

                        ((t)Vd.elementAt(var36)).h();
                     }

                     var36++;
                     if (var9) {
                        break;
                     }
                  }
               }

               var59 = (byte)0;
            }

            int var29 = var59;

            label739: {
               label1105: {
                  label737: {
                     label1106: {
                        label735:
                        while (true) {
                           if (var29 < Qe) {
                              var59 = 0;
                              if (var9) {
                                 break;
                              }

                              var15 = 0;

                              while (var15 < Pe) {
                                 var62 = Re[var15][var29].d;
                                 if (var9) {
                                    break label1106;
                                 }

                                 if (Re[var15][var29].d != null) {
                                    Re[var15][var29].d.b();
                                 }

                                 var15++;
                                 if (var9) {
                                    break;
                                 }
                              }

                              var29++;
                              if (!var9) {
                                 continue;
                              }
                           }

                           if (Wd != null) {
                              int var37 = 0;

                              while (var37 < Wd.size()) {
                                 d var23;
                                 var59 = (var23 = (d)Wd.elementAt(var37)).g;
                                 if (var9) {
                                    break label735;
                                 }

                                 if (var59 > 0) {
                                    var23.g--;
                                 }

                                 if (var23.e != null) {
                                    var23.e.c();
                                 }

                                 if (((d)Wd.elementAt(var37)).g == 0) {
                                    var15 = ((d)Wd.elementAt(var37)).b / 30;
                                    var29 = ((d)Wd.elementAt(var37)).c / 30;
                                    if (!o.c((byte)var15, (byte)var29) || ((d)Wd.elementAt(var37)).i) {
                                       Wd.removeElementAt(var37);
                                       var37--;
                                    }
                                 }

                                 var37++;
                                 if (var9) {
                                    break;
                                 }
                              }
                           }

                           if (Yd != null) {
                              var15 = 0;

                              while (true) {
                                 if (var15 < Yd.size()) {
                                    var63 = ((s)Yd.elementAt(var15)).r;
                                    if (var9) {
                                       break;
                                    }

                                    label692: {
                                       if (var63 != 0) {
                                          Yd.removeElementAt(var15);
                                          var15--;
                                          if (!var9) {
                                             break label692;
                                          }
                                       }

                                       ((s)Yd.elementAt(var15)).h();
                                    }

                                    var15++;
                                    if (!var9) {
                                       continue;
                                    }
                                 }

                                 var63 = j();
                                 break;
                              }

                              if (var63 == 2 && ib != null && jb != null) {
                                 if (++cf >= 19) {
                                    cf = 0;
                                 }

                                 ib.h();
                                 jb.h();
                                 if (!ib.b()) {
                                    I.b((byte)0, (byte)0, (byte)-1, (byte)0, (byte)0, (byte)0);
                                 }

                                 if (!jb.b()) {
                                    I.b((byte)1, (byte)0, (byte)-1, (byte)0, (byte)0, (byte)0);
                                 }
                              }
                           }

                           var59 = M;
                           break;
                        }

                        if (var59 == 0 && !i()) {
                           break label739;
                        }

                        label677: {
                           if (M) {
                              boolean var31 = false;
                              if (y.b && kb % 375L == 0L) {
                                 var31 = true;
                              }

                              int var38 = 0;

                              while (var38 < Qd.size()) {
                                 q var52 = (q)Qd.elementAt(var38);
                                 var64 = var31;
                                 if (var9) {
                                    break label677;
                                 }

                                 if (var31 && var52.Cc != null && var52.Yb != null) {
                                    y.d(var52);
                                 }

                                 byte[] var8;
                                 if (var52.m() && var52.ic != -1L && kb - var52.ic >= 200L && (var8 = q.b((q)Qd.elementAt(var38))) != null) {
                                    if (Pd != null && ((q)Qd.elementAt(var38)).w == Pd.w) {
                                       b(Pd, false);
                                    }

                                    if (M) {
                                       byte var71 = var8[0];
                                       byte var53 = var8[1];
                                       byte var49 = var71;
                                       var45 = ((q)Qd.elementAt(var38)).w;
                                       fb var26 = var1;
                                       (var8 = new byte[4])[0] = 2;
                                       var8[1] = var45;
                                       var8[2] = var49;
                                       var8[3] = var53;
                                       var26.a(var8);
                                    }
                                 }

                                 var38++;
                                 if (var9) {
                                    break;
                                 }
                              }
                           }

                           var64 = i();
                        }

                        if (!var64) {
                           break label1105;
                        }

                        if (ae != null) {
                           var15 = 0;

                           while (true) {
                              if (var15 < ae.size()) {
                                 ((sb)ae.elementAt(var15)).b();
                                 var15++;
                                 if (var9) {
                                    break;
                                 }

                                 if (!var9) {
                                    continue;
                                 }
                              }

                              df = false;
                              break;
                           }
                        }

                        if (!ab.v && Pd != null && Pd.m() && Pd.ic != -1L && kb - Pd.ic >= 50L) {
                           var1.c(false, false);
                        }

                        if (!ab.v && !ab.w) {
                           break label737;
                        }

                        byte var69;
                        label658: {
                           if (ab.bc == 0) {
                              q var32 = q.d(2);
                              if (kb % 15L == 0L) {
                                 label654:
                                 while (true) {
                                    int var39;
                                    var59 = var39 = ab.oc.nextInt(14);

                                    while (var59 != 12) {
                                       var59 = y.f(var39);
                                       if (!var9) {
                                          if (var59 != 0) {
                                             var32.bc = var39;
                                             break label654;
                                          }
                                          break;
                                       }
                                    }
                                 }
                              }

                              int var40 = 0;

                              while (var40 < Qd.size()) {
                                 q var33;
                                 var59 = (var33 = (q)Qd.elementAt(var40)).g;
                                 var69 = 20;
                                 if (var9) {
                                    break label658;
                                 }

                                 label638:
                                 if (var59 > 20) {
                                    if (var33.g == 29 && (var33.h == 3 || var33.h == 4)) {
                                       var33.Cc.q = 30;
                                       var33.Cc.r = 1;
                                       var33.Ec = false;
                                       if (!var9) {
                                          break label638;
                                       }
                                    }

                                    if (var33.g == 30 && var33.h == 1) {
                                       var33.Cc.q = 30;
                                       var33.Cc.r = 5;
                                       if (!var33.Fc) {
                                          break label638;
                                       }

                                       s var54;
                                       (var54 = new s((byte)-1, var33.g, var33.h, false)).H = var33;
                                       var54.J = true;
                                       var33.Fc = false;
                                       if (!var9) {
                                          break label638;
                                       }
                                    }

                                    if (var33.g == 30 && var33.h == 5) {
                                       var33.Cc.q = 34;
                                       var33.Cc.r = 5;
                                    }
                                 }

                                 var40++;
                                 if (var9) {
                                    break;
                                 }
                              }
                           } else if (ab.bc == 2) {
                              int var41 = 0;

                              while (var41 < Qd.size()) {
                                 q var34;
                                 var59 = (var34 = (q)Qd.elementAt(var41)).r;
                                 var69 = 1;
                                 if (var9) {
                                    break label658;
                                 }

                                 if (var59 == 1 && var34.g >= 17 && var34.h >= 10 && var34.g <= 23 && var34.h <= 15) {
                                    var34.Cc.q = 24;
                                    var34.Cc.r = 14;
                                    var34.Ec = false;
                                    if (var34.Fc) {
                                       s var55;
                                       (var55 = new s((byte)-1, var34.g, var34.h, false)).H = var34;
                                       var55.J = true;
                                       var34.Fc = false;
                                    }
                                 }

                                 var41++;
                                 if (var9) {
                                    break;
                                 }
                              }
                           } else if (ab.bc == 4) {
                              int var42 = 0;

                              label606: {
                                 while (var42 < Qd.size()) {
                                    q var35;
                                    var67 = (var35 = (q)Qd.elementAt(var42)).g;
                                    var69 = 8;
                                    if (var9) {
                                       break label606;
                                    }

                                    if (var67 == 8 && var35.h == 6) {
                                       var35.Cc.q = 16;
                                       var35.Cc.r = 2;
                                       if (var35.Ec) {
                                          s var56;
                                          (var56 = new s((byte)-1, var35.g, var35.h, false)).H = var35;
                                          var56.J = true;
                                          var35.Ec = false;
                                       }
                                    }

                                    var42++;
                                    if (var9) {
                                       break;
                                    }
                                 }

                                 var67 = Pd.g;
                                 var69 = 10;
                              }

                              label596:
                              if (var67 == var69 && Pd.h == 6 && Re[15][1].d != null) {
                                 if (!Re[15][1].d.N) {
                                    Re[15][3].d.f();
                                    Re[15][3].d = null;
                                    Re[15][2].d.f();
                                    Re[15][2].d = null;
                                    Re[16][1].d.f();
                                    Re[16][1].d = null;
                                    Re[17][1].d.f();
                                    Re[17][1].d = null;
                                    Re[17][3].d.f();
                                    Re[17][3].d = null;
                                    Re[17][2].d.f();
                                    Re[17][2].d = null;
                                    Re[15][1].d.z = true;
                                    Re[15][1].d.N = true;
                                    Re[15][1].d.M = 40L;
                                    r.b((byte)15, (byte)2)[0].z = true;
                                    if (!var9) {
                                       break label596;
                                    }
                                 }

                                 if (Re[15][1].d.i < -300) {
                                    Re[15][1].d.f();
                                    Re[15][1].d = null;
                                    k();
                                 }
                              }
                           }

                           var59 = ab.bc;
                           var69 = 24;
                        }

                        if (var59 != var69) {
                           break label737;
                        }

                        var62 = Re[3][2].d;
                     }

                     if (!var62.N) {
                        Re[3][2].d.z = true;
                        Re[3][2].d.N = true;
                        Re[3][2].d.M = 40L;
                     }
                  }

                  label567: {
                     if (ab.w) {
                        if (ab.x >= ab.y || (ab.x += 2) <= ab.y) {
                           break label567;
                        }

                        ab.x = ab.y;
                        if (!var9) {
                           break label567;
                        }
                     }

                     if (ab.x > 0 && (ab.x -= 2) < 0) {
                        ab.x = 0;
                     }
                  }

                  if (ab.t >= 0) {
                     if (kb % 2L == 0L) {
                        ab.t--;
                     }

                     if (ab.t <= 0) {
                        ab.t = 0;
                        var1.c(true, false);
                     }
                  }

                  if ((ef = g - q.W == 0) && !ff && gf == -1) {
                     gf = 125;
                  }

                  if (gf > 0 && --gf <= 0) {
                     var1.c(true, false);
                  }
               }

               if (!i() && ab.m == 2) {
                  y.S = jb.g;
                  y.T = jb.h;
                  y.U = ib.g;
                  y.V = ib.h;
               }
            }

            nb = System.currentTimeMillis() - nb;
         }
      }

      if (!i()) {
         if (M) {
            this.O.i();
            return;
         }

         this.N.g();
      }
   }

   public final void p() {
      this.q++;
      this.v = false;
   }

   private void b(long var1, boolean var3) {
      if (var1 > 24L) {
         if (this.r <= 0) {
            this.u++;
            return;
         }

         if (var3) {
            this.r--;
            return;
         }
      } else if (var1 < 24L) {
         if (this.u < 2) {
            this.u = 0;
            if (this.r < 8 && var3) {
               this.r++;
               return;
            }
         } else {
            this.u--;
         }
      }
   }

   public final void c(String var1) {
      this.D = var1;
   }

   public final void b(Graphics param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 0000: getstatic ab.xc Z
      // 0003: istore 8
      // 0005: getstatic ab.o Z
      // 0008: ifeq 0010
      // 000b: aload 1
      // 000c: invokestatic rc.b (Ljavax/microedition/lcdui/Graphics;)V
      // 000f: return
      // 0010: aload 0
      // 0011: getfield fb.F Z
      // 0014: ifeq 002a
      // 0017: getstatic ab.l I
      // 001a: bipush 1
      // 001b: if_icmpne 002a
      // 001e: getstatic ab.B Lqb;
      // 0021: getfield qb.Rb I
      // 0024: bipush 34
      // 0026: if_icmpeq 002a
      // 0029: return
      // 002a: aload 0
      // 002b: getfield fb.i Ltb;
      // 002e: ifnull 003a
      // 0031: aload 0
      // 0032: getfield fb.i Ltb;
      // 0035: aload 1
      // 0036: invokevirtual tb.b (Ljavax/microedition/lcdui/Graphics;)V
      // 0039: return
      // 003a: getstatic ab.t I
      // 003d: bipush -1
      // 003e: if_icmpeq 0087
      // 0041: getstatic ab.u I
      // 0044: getstatic ab.t I
      // 0047: if_icmpeq 0086
      // 004a: bipush 0
      // 004b: istore 2
      // 004c: iload 2
      // 004d: getstatic ab.D I
      // 0050: if_icmpge 0080
      // 0053: bipush 0
      // 0054: iload 8
      // 0056: ifne 0083
      // 0059: istore 3
      // 005a: iload 3
      // 005b: getstatic ab.E I
      // 005e: if_icmpge 0078
      // 0061: aload 1
      // 0062: getstatic fb.Od Ljavax/microedition/lcdui/Image;
      // 0065: iload 2
      // 0066: iload 3
      // 0067: bipush 0
      // 0068: invokevirtual javax/microedition/lcdui/Graphics.drawImage (Ljavax/microedition/lcdui/Image;III)V
      // 006b: iinc 3 30
      // 006e: iload 8
      // 0070: ifne 007b
      // 0073: iload 8
      // 0075: ifeq 005a
      // 0078: iinc 2 30
      // 007b: iload 8
      // 007d: ifeq 004c
      // 0080: getstatic ab.t I
      // 0083: putstatic ab.u I
      // 0086: return
      // 0087: getstatic fb.Te B
      // 008a: istore 3
      // 008b: iload 3
      // 008c: getstatic fb.Te B
      // 008f: getstatic fb.Ve B
      // 0092: iadd
      // 0093: if_icmpge 00f7
      // 0096: getstatic fb.Se B
      // 0099: iload 8
      // 009b: ifne 02b1
      // 009e: istore 2
      // 009f: iload 2
      // 00a0: getstatic fb.Se B
      // 00a3: getstatic fb.Ue B
      // 00a6: iadd
      // 00a7: if_icmpge 00ef
      // 00aa: getstatic fb.Re [[Llb;
      // 00ad: iload 2
      // 00ae: aaload
      // 00af: iload 3
      // 00b0: aaload
      // 00b1: getfield lb.b I
      // 00b4: dup
      // 00b5: istore 5
      // 00b7: iload 8
      // 00b9: ifne 008c
      // 00bc: ifle 00e7
      // 00bf: iinc 5 -1
      // 00c2: getstatic fb.qb Lpb;
      // 00c5: iload 5
      // 00c7: putfield pb.b I
      // 00ca: getstatic fb.qb Lpb;
      // 00cd: iload 2
      // 00ce: bipush 30
      // 00d0: imul
      // 00d1: getstatic fb.Ge I
      // 00d4: isub
      // 00d5: iload 3
      // 00d6: bipush 30
      // 00d8: imul
      // 00d9: getstatic fb.He I
      // 00dc: isub
      // 00dd: invokevirtual pb.b (II)V
      // 00e0: getstatic fb.qb Lpb;
      // 00e3: aload 1
      // 00e4: invokevirtual pb.b (Ljavax/microedition/lcdui/Graphics;)V
      // 00e7: iinc 2 1
      // 00ea: iload 8
      // 00ec: ifeq 009f
      // 00ef: iinc 3 1
      // 00f2: iload 8
      // 00f4: ifeq 008b
      // 00f7: getstatic fb.Wd Ljava/util/Vector;
      // 00fa: ifnull 01be
      // 00fd: bipush 0
      // 00fe: istore 4
      // 0100: iload 4
      // 0102: getstatic fb.Wd Ljava/util/Vector;
      // 0105: invokevirtual java/util/Vector.size ()I
      // 0108: if_icmpge 01be
      // 010b: getstatic fb.Wd Ljava/util/Vector;
      // 010e: iload 4
      // 0110: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 0113: checkcast d
      // 0116: dup
      // 0117: astore 5
      // 0119: getfield d.b I
      // 011c: bipush 30
      // 011e: idiv
      // 011f: istore 2
      // 0120: aload 5
      // 0122: getfield d.c I
      // 0125: bipush 30
      // 0127: idiv
      // 0128: istore 3
      // 0129: iload 2
      // 012a: i2b
      // 012b: iload 3
      // 012c: i2b
      // 012d: invokestatic o.c (BB)Z
      // 0130: iload 8
      // 0132: ifne 02b1
      // 0135: ifeq 01b6
      // 0138: aload 5
      // 013a: aload 1
      // 013b: astore 6
      // 013d: dup
      // 013e: astore 5
      // 0140: getfield d.d Lpb;
      // 0143: ifnull 0192
      // 0146: aload 5
      // 0148: getfield d.d Lpb;
      // 014b: aload 5
      // 014d: getfield d.f B
      // 0150: putfield pb.b I
      // 0153: aload 5
      // 0155: getfield d.d Lpb;
      // 0158: aload 5
      // 015a: getfield d.b I
      // 015d: getstatic fb.Ge I
      // 0160: isub
      // 0161: aload 5
      // 0163: getfield d.d Lpb;
      // 0166: getfield pb.d I
      // 0169: bipush 2
      // 016a: idiv
      // 016b: isub
      // 016c: aload 5
      // 016e: getfield d.c I
      // 0171: getstatic fb.He I
      // 0174: isub
      // 0175: aload 5
      // 0177: getfield d.d Lpb;
      // 017a: getfield pb.e I
      // 017d: bipush 2
      // 017e: idiv
      // 017f: isub
      // 0180: invokevirtual pb.b (II)V
      // 0183: aload 5
      // 0185: getfield d.d Lpb;
      // 0188: aload 6
      // 018a: invokevirtual pb.b (Ljavax/microedition/lcdui/Graphics;)V
      // 018d: iload 8
      // 018f: ifeq 01b6
      // 0192: aload 5
      // 0194: getfield d.e Lnb;
      // 0197: ifnull 01b6
      // 019a: aload 5
      // 019c: getfield d.e Lnb;
      // 019f: aload 6
      // 01a1: aload 5
      // 01a3: getfield d.b I
      // 01a6: getstatic fb.Ge I
      // 01a9: isub
      // 01aa: aload 5
      // 01ac: getfield d.c I
      // 01af: getstatic fb.He I
      // 01b2: isub
      // 01b3: invokevirtual nb.b (Ljavax/microedition/lcdui/Graphics;II)V
      // 01b6: iinc 4 1
      // 01b9: iload 8
      // 01bb: ifeq 0100
      // 01be: getstatic fb.Qd Ljava/util/Vector;
      // 01c1: ifnull 02ae
      // 01c4: bipush 0
      // 01c5: istore 4
      // 01c7: iload 4
      // 01c9: getstatic fb.Qd Ljava/util/Vector;
      // 01cc: invokevirtual java/util/Vector.size ()I
      // 01cf: if_icmpge 02ae
      // 01d2: getstatic fb.Qd Ljava/util/Vector;
      // 01d5: iload 4
      // 01d7: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 01da: checkcast q
      // 01dd: dup
      // 01de: astore 5
      // 01e0: getfield q.ib Z
      // 01e3: iload 8
      // 01e5: ifne 02b1
      // 01e8: ifeq 01fb
      // 01eb: aload 5
      // 01ed: getfield q.ib Z
      // 01f0: ifeq 02a6
      // 01f3: getstatic fb.Pd Lq;
      // 01f6: aload 5
      // 01f8: if_acmpne 02a6
      // 01fb: aload 5
      // 01fd: getfield q.mb B
      // 0200: ifne 02a6
      // 0203: aload 5
      // 0205: getfield q.g B
      // 0208: aload 5
      // 020a: getfield q.h B
      // 020d: invokestatic o.c (BB)Z
      // 0210: ifeq 02a6
      // 0213: getstatic fb.Re [[Llb;
      // 0216: aload 5
      // 0218: getfield q.g B
      // 021b: aaload
      // 021c: aload 5
      // 021e: getfield q.h B
      // 0221: aaload
      // 0222: getfield lb.d Lj;
      // 0225: ifnonnull 02a6
      // 0228: aload 5
      // 022a: getfield q.x B
      // 022d: iflt 02a6
      // 0230: aload 5
      // 0232: getfield q.qb B
      // 0235: bipush 3
      // 0236: if_icmpeq 0243
      // 0239: aload 5
      // 023b: getfield q.Ib I
      // 023e: bipush 20
      // 0240: if_icmplt 024b
      // 0243: aload 5
      // 0245: getfield q.Bb Z
      // 0248: ifne 02a6
      // 024b: getstatic fb.cc Lpb;
      // 024e: invokestatic fb.i ()Z
      // 0251: ifeq 025f
      // 0254: bipush 9
      // 0256: aload 5
      // 0258: getfield q.x B
      // 025b: iadd
      // 025c: goto 0264
      // 025f: aload 5
      // 0261: invokevirtual q.t ()I
      // 0264: putfield pb.b I
      // 0267: getstatic fb.cc Lpb;
      // 026a: aload 5
      // 026c: dup
      // 026d: astore 7
      // 026f: getfield o.c I
      // 0272: bipush 10
      // 0274: idiv
      // 0275: getstatic fb.cc Lpb;
      // 0278: getfield pb.d I
      // 027b: bipush 2
      // 027c: idiv
      // 027d: isub
      // 027e: getstatic fb.Ge I
      // 0281: isub
      // 0282: aload 5
      // 0284: dup
      // 0285: astore 7
      // 0287: getfield o.d I
      // 028a: bipush 10
      // 028c: idiv
      // 028d: getstatic fb.cc Lpb;
      // 0290: getfield pb.e I
      // 0293: bipush 3
      // 0294: idiv
      // 0295: isub
      // 0296: bipush 2
      // 0297: iadd
      // 0298: getstatic fb.He I
      // 029b: isub
      // 029c: invokevirtual pb.b (II)V
      // 029f: getstatic fb.cc Lpb;
      // 02a2: aload 1
      // 02a3: invokevirtual pb.b (Ljavax/microedition/lcdui/Graphics;)V
      // 02a6: iinc 4 1
      // 02a9: iload 8
      // 02ab: ifeq 01c7
      // 02ae: invokestatic fb.j ()B
      // 02b1: bipush 2
      // 02b2: if_icmpne 04ec
      // 02b5: getstatic fb.Sd Ljava/util/Vector;
      // 02b8: ifnull 04ec
      // 02bb: bipush 0
      // 02bc: istore 4
      // 02be: iload 4
      // 02c0: getstatic fb.Sd Ljava/util/Vector;
      // 02c3: invokevirtual java/util/Vector.size ()I
      // 02c6: if_icmpge 04ec
      // 02c9: getstatic fb.Sd Ljava/util/Vector;
      // 02cc: iload 4
      // 02ce: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 02d1: checkcast g
      // 02d4: dup
      // 02d5: astore 5
      // 02d7: getfield g.d B
      // 02da: bipush 4
      // 02db: iload 8
      // 02dd: ifne 04f8
      // 02e0: if_icmpeq 02ec
      // 02e3: aload 5
      // 02e5: getfield g.d B
      // 02e8: bipush 5
      // 02e9: if_icmpne 04e4
      // 02ec: getstatic fb.Bc Lpb;
      // 02ef: ifnull 03b0
      // 02f2: aload 5
      // 02f4: getfield g.b B
      // 02f7: bipush 30
      // 02f9: imul
      // 02fa: bipush 15
      // 02fc: iadd
      // 02fd: aload 5
      // 02ff: getfield g.c B
      // 0302: bipush 30
      // 0304: imul
      // 0305: bipush 15
      // 0307: iadd
      // 0308: getstatic fb.Bc Lpb;
      // 030b: getfield pb.d I
      // 030e: getstatic fb.Bc Lpb;
      // 0311: getfield pb.e I
      // 0314: invokestatic o.c (IIII)Z
      // 0317: ifeq 03b0
      // 031a: aload 5
      // 031c: getfield g.d B
      // 031f: bipush 4
      // 0320: if_icmpne 036c
      // 0323: getstatic fb.Bc Lpb;
      // 0326: bipush 0
      // 0327: putfield pb.b I
      // 032a: getstatic fb.Bc Lpb;
      // 032d: aload 5
      // 032f: getfield g.b B
      // 0332: bipush 30
      // 0334: imul
      // 0335: bipush 15
      // 0337: iadd
      // 0338: getstatic fb.Bc Lpb;
      // 033b: getfield pb.d I
      // 033e: bipush 2
      // 033f: idiv
      // 0340: isub
      // 0341: getstatic fb.Ge I
      // 0344: isub
      // 0345: aload 5
      // 0347: getfield g.c B
      // 034a: bipush 30
      // 034c: imul
      // 034d: bipush 15
      // 034f: iadd
      // 0350: getstatic fb.Bc Lpb;
      // 0353: getfield pb.e I
      // 0356: bipush 2
      // 0357: idiv
      // 0358: isub
      // 0359: getstatic fb.He I
      // 035c: isub
      // 035d: invokevirtual pb.b (II)V
      // 0360: getstatic fb.Bc Lpb;
      // 0363: aload 1
      // 0364: invokevirtual pb.b (Ljavax/microedition/lcdui/Graphics;)V
      // 0367: iload 8
      // 0369: ifeq 03b0
      // 036c: getstatic fb.Bc Lpb;
      // 036f: bipush 1
      // 0370: putfield pb.b I
      // 0373: getstatic fb.Bc Lpb;
      // 0376: aload 5
      // 0378: getfield g.b B
      // 037b: bipush 30
      // 037d: imul
      // 037e: bipush 15
      // 0380: iadd
      // 0381: getstatic fb.Bc Lpb;
      // 0384: getfield pb.d I
      // 0387: bipush 2
      // 0388: idiv
      // 0389: isub
      // 038a: getstatic fb.Ge I
      // 038d: isub
      // 038e: aload 5
      // 0390: getfield g.c B
      // 0393: bipush 30
      // 0395: imul
      // 0396: bipush 15
      // 0398: iadd
      // 0399: getstatic fb.Bc Lpb;
      // 039c: getfield pb.e I
      // 039f: bipush 2
      // 03a0: idiv
      // 03a1: isub
      // 03a2: getstatic fb.He I
      // 03a5: isub
      // 03a6: invokevirtual pb.b (II)V
      // 03a9: getstatic fb.Bc Lpb;
      // 03ac: aload 1
      // 03ad: invokevirtual pb.b (Ljavax/microedition/lcdui/Graphics;)V
      // 03b0: getstatic fb.Rb Lpb;
      // 03b3: ifnull 04e4
      // 03b6: aload 5
      // 03b8: getfield g.b B
      // 03bb: bipush 30
      // 03bd: imul
      // 03be: bipush 15
      // 03c0: iadd
      // 03c1: aload 5
      // 03c3: getfield g.c B
      // 03c6: bipush 30
      // 03c8: imul
      // 03c9: bipush 15
      // 03cb: iadd
      // 03cc: getstatic fb.Rb Lpb;
      // 03cf: getfield pb.d I
      // 03d2: getstatic fb.Rb Lpb;
      // 03d5: getfield pb.e I
      // 03d8: invokestatic o.c (IIII)Z
      // 03db: ifeq 04e4
      // 03de: aload 5
      // 03e0: getfield g.d B
      // 03e3: bipush 4
      // 03e4: if_icmpne 0468
      // 03e7: getstatic fb.Sb Lpb;
      // 03ea: ifnull 04e4
      // 03ed: getstatic fb.Sb Lpb;
      // 03f0: aload 5
      // 03f2: getfield g.b B
      // 03f5: bipush 30
      // 03f7: imul
      // 03f8: bipush 15
      // 03fa: iadd
      // 03fb: getstatic fb.Sb Lpb;
      // 03fe: getfield pb.d I
      // 0401: bipush 2
      // 0402: idiv
      // 0403: isub
      // 0404: getstatic fb.Ge I
      // 0407: isub
      // 0408: aload 5
      // 040a: getfield g.c B
      // 040d: bipush 30
      // 040f: imul
      // 0410: bipush 15
      // 0412: iadd
      // 0413: getstatic fb.Sb Lpb;
      // 0416: getfield pb.e I
      // 0419: bipush 2
      // 041a: idiv
      // 041b: isub
      // 041c: getstatic fb.He I
      // 041f: isub
      // 0420: invokevirtual pb.b (II)V
      // 0423: bipush 0
      // 0424: invokestatic fb.c (B)Z
      // 0427: ifeq 0455
      // 042a: getstatic fb.Sb Lpb;
      // 042d: bipush 0
      // 042e: putfield pb.b I
      // 0431: getstatic fb.Sb Lpb;
      // 0434: aload 1
      // 0435: invokevirtual pb.b (Ljavax/microedition/lcdui/Graphics;)V
      // 0438: getstatic fb.Sb Lpb;
      // 043b: getstatic fb.cf I
      // 043e: bipush 5
      // 043f: idiv
      // 0440: bipush 3
      // 0441: if_icmpne 0448
      // 0444: bipush 1
      // 0445: goto 044d
      // 0448: getstatic fb.cf I
      // 044b: bipush 5
      // 044c: idiv
      // 044d: putfield pb.b I
      // 0450: iload 8
      // 0452: ifeq 045c
      // 0455: getstatic fb.Sb Lpb;
      // 0458: bipush 1
      // 0459: putfield pb.b I
      // 045c: getstatic fb.Sb Lpb;
      // 045f: aload 1
      // 0460: invokevirtual pb.b (Ljavax/microedition/lcdui/Graphics;)V
      // 0463: iload 8
      // 0465: ifeq 04e4
      // 0468: getstatic fb.Rb Lpb;
      // 046b: ifnull 04e4
      // 046e: getstatic fb.Rb Lpb;
      // 0471: aload 5
      // 0473: getfield g.b B
      // 0476: bipush 30
      // 0478: imul
      // 0479: bipush 15
      // 047b: iadd
      // 047c: getstatic fb.Rb Lpb;
      // 047f: getfield pb.d I
      // 0482: bipush 2
      // 0483: idiv
      // 0484: isub
      // 0485: getstatic fb.Ge I
      // 0488: isub
      // 0489: aload 5
      // 048b: getfield g.c B
      // 048e: bipush 30
      // 0490: imul
      // 0491: bipush 15
      // 0493: iadd
      // 0494: getstatic fb.Rb Lpb;
      // 0497: getfield pb.e I
      // 049a: bipush 2
      // 049b: idiv
      // 049c: isub
      // 049d: getstatic fb.He I
      // 04a0: isub
      // 04a1: invokevirtual pb.b (II)V
      // 04a4: bipush 1
      // 04a5: invokestatic fb.c (B)Z
      // 04a8: ifeq 04d6
      // 04ab: getstatic fb.Rb Lpb;
      // 04ae: bipush 0
      // 04af: putfield pb.b I
      // 04b2: getstatic fb.Rb Lpb;
      // 04b5: aload 1
      // 04b6: invokevirtual pb.b (Ljavax/microedition/lcdui/Graphics;)V
      // 04b9: getstatic fb.Rb Lpb;
      // 04bc: getstatic fb.cf I
      // 04bf: bipush 5
      // 04c0: idiv
      // 04c1: bipush 3
      // 04c2: if_icmpne 04c9
      // 04c5: bipush 1
      // 04c6: goto 04ce
      // 04c9: getstatic fb.cf I
      // 04cc: bipush 5
      // 04cd: idiv
      // 04ce: putfield pb.b I
      // 04d1: iload 8
      // 04d3: ifeq 04dd
      // 04d6: getstatic fb.Rb Lpb;
      // 04d9: bipush 1
      // 04da: putfield pb.b I
      // 04dd: getstatic fb.Rb Lpb;
      // 04e0: aload 1
      // 04e1: invokevirtual pb.b (Ljavax/microedition/lcdui/Graphics;)V
      // 04e4: iinc 4 1
      // 04e7: iload 8
      // 04e9: ifeq 02be
      // 04ec: getstatic fb.Te B
      // 04ef: istore 3
      // 04f0: iload 3
      // 04f1: getstatic fb.Te B
      // 04f4: getstatic fb.Ve B
      // 04f7: iadd
      // 04f8: if_icmpge 05b8
      // 04fb: getstatic fb.Se B
      // 04fe: iload 8
      // 0500: ifne 05bb
      // 0503: istore 2
      // 0504: iload 2
      // 0505: getstatic fb.Se B
      // 0508: getstatic fb.Ue B
      // 050b: iadd
      // 050c: if_icmpge 05b0
      // 050f: getstatic fb.Yd Ljava/util/Vector;
      // 0512: iload 8
      // 0514: ifne 0c0f
      // 0517: ifnull 05a8
      // 051a: bipush 0
      // 051b: istore 4
      // 051d: iload 4
      // 051f: getstatic fb.Yd Ljava/util/Vector;
      // 0522: invokevirtual java/util/Vector.size ()I
      // 0525: if_icmpge 05a8
      // 0528: getstatic fb.Yd Ljava/util/Vector;
      // 052b: iload 4
      // 052d: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 0530: checkcast s
      // 0533: dup
      // 0534: astore 5
      // 0536: getfield s.g B
      // 0539: iload 2
      // 053a: iload 8
      // 053c: ifne 050c
      // 053f: if_icmpne 05a0
      // 0542: aload 5
      // 0544: getfield s.h B
      // 0547: iload 3
      // 0548: if_icmpne 05a0
      // 054b: aload 5
      // 054d: aload 1
      // 054e: astore 6
      // 0550: dup
      // 0551: astore 5
      // 0553: getfield s.y Z
      // 0556: ifne 05a0
      // 0559: getstatic fb.Tb Lpb;
      // 055c: ifnull 05a0
      // 055f: getstatic fb.Tb Lpb;
      // 0562: aload 5
      // 0564: dup
      // 0565: astore 7
      // 0567: getfield o.c I
      // 056a: bipush 10
      // 056c: idiv
      // 056d: getstatic fb.Tb Lpb;
      // 0570: getfield pb.d I
      // 0573: bipush 2
      // 0574: idiv
      // 0575: isub
      // 0576: getstatic fb.Ge I
      // 0579: isub
      // 057a: aload 5
      // 057c: dup
      // 057d: astore 7
      // 057f: getfield o.d I
      // 0582: bipush 10
      // 0584: idiv
      // 0585: getstatic fb.Tb Lpb;
      // 0588: getfield pb.e I
      // 058b: bipush 2
      // 058c: idiv
      // 058d: isub
      // 058e: bipush 8
      // 0590: iadd
      // 0591: getstatic fb.He I
      // 0594: isub
      // 0595: invokevirtual pb.b (II)V
      // 0598: getstatic fb.Tb Lpb;
      // 059b: aload 6
      // 059d: invokevirtual pb.b (Ljavax/microedition/lcdui/Graphics;)V
      // 05a0: iinc 4 1
      // 05a3: iload 8
      // 05a5: ifeq 051d
      // 05a8: iinc 2 1
      // 05ab: iload 8
      // 05ad: ifeq 0504
      // 05b0: iinc 3 1
      // 05b3: iload 8
      // 05b5: ifeq 04f0
      // 05b8: invokestatic fb.j ()B
      // 05bb: bipush 2
      // 05bc: if_icmpne 065d
      // 05bf: getstatic fb.Ob Lpb;
      // 05c2: ifnull 065d
      // 05c5: getstatic fb.ib Ls;
      // 05c8: ifnull 065d
      // 05cb: getstatic fb.jb Ls;
      // 05ce: ifnull 065d
      // 05d1: getstatic fb.ib Ls;
      // 05d4: invokevirtual s.c ()Z
      // 05d7: ifeq 0617
      // 05da: getstatic fb.Ob Lpb;
      // 05dd: bipush 2
      // 05de: putfield pb.b I
      // 05e1: getstatic fb.Ob Lpb;
      // 05e4: getstatic fb.ib Ls;
      // 05e7: getfield s.D I
      // 05ea: getstatic fb.Ob Lpb;
      // 05ed: getfield pb.d I
      // 05f0: bipush 2
      // 05f1: idiv
      // 05f2: isub
      // 05f3: getstatic fb.Ge I
      // 05f6: isub
      // 05f7: getstatic fb.ib Ls;
      // 05fa: getfield s.E I
      // 05fd: getstatic fb.Ob Lpb;
      // 0600: getfield pb.e I
      // 0603: bipush 2
      // 0604: idiv
      // 0605: isub
      // 0606: bipush 8
      // 0608: iadd
      // 0609: getstatic fb.He I
      // 060c: isub
      // 060d: invokevirtual pb.b (II)V
      // 0610: getstatic fb.Ob Lpb;
      // 0613: aload 1
      // 0614: invokevirtual pb.b (Ljavax/microedition/lcdui/Graphics;)V
      // 0617: getstatic fb.jb Ls;
      // 061a: invokevirtual s.c ()Z
      // 061d: ifeq 065d
      // 0620: getstatic fb.Ob Lpb;
      // 0623: bipush 2
      // 0624: putfield pb.b I
      // 0627: getstatic fb.Ob Lpb;
      // 062a: getstatic fb.jb Ls;
      // 062d: getfield s.D I
      // 0630: getstatic fb.Ob Lpb;
      // 0633: getfield pb.d I
      // 0636: bipush 2
      // 0637: idiv
      // 0638: isub
      // 0639: getstatic fb.Ge I
      // 063c: isub
      // 063d: getstatic fb.jb Ls;
      // 0640: getfield s.E I
      // 0643: getstatic fb.Ob Lpb;
      // 0646: getfield pb.e I
      // 0649: bipush 2
      // 064a: idiv
      // 064b: isub
      // 064c: bipush 8
      // 064e: iadd
      // 064f: getstatic fb.He I
      // 0652: isub
      // 0653: invokevirtual pb.b (II)V
      // 0656: getstatic fb.Ob Lpb;
      // 0659: aload 1
      // 065a: invokevirtual pb.b (Ljavax/microedition/lcdui/Graphics;)V
      // 065d: getstatic fb.Xe B
      // 0660: istore 3
      // 0661: iload 3
      // 0662: getstatic fb.Xe B
      // 0665: getstatic fb.Ze B
      // 0668: iadd
      // 0669: if_icmpge 0c0c
      // 066c: getstatic fb.We B
      // 066f: iload 8
      // 0671: ifne 0c98
      // 0674: istore 2
      // 0675: iload 2
      // 0676: getstatic fb.We B
      // 0679: getstatic fb.Ye B
      // 067c: iadd
      // 067d: if_icmpge 077c
      // 0680: iload 2
      // 0681: bipush 1
      // 0682: iload 8
      // 0684: ifne 0788
      // 0687: if_icmpeq 06a1
      // 068a: iload 2
      // 068b: getstatic fb.Pe B
      // 068e: bipush 2
      // 068f: isub
      // 0690: if_icmpeq 06a1
      // 0693: iload 3
      // 0694: bipush 1
      // 0695: if_icmpeq 06a1
      // 0698: iload 3
      // 0699: getstatic fb.Qe B
      // 069c: bipush 2
      // 069d: isub
      // 069e: if_icmpne 0774
      // 06a1: bipush 0
      // 06a2: istore 4
      // 06a4: iload 3
      // 06a5: bipush 1
      // 06a6: if_icmpne 06b1
      // 06a9: bipush 0
      // 06aa: istore 4
      // 06ac: iload 8
      // 06ae: ifeq 06db
      // 06b1: iload 2
      // 06b2: getstatic fb.Pe B
      // 06b5: bipush 2
      // 06b6: isub
      // 06b7: if_icmpne 06c2
      // 06ba: bipush 1
      // 06bb: istore 4
      // 06bd: iload 8
      // 06bf: ifeq 06db
      // 06c2: iload 3
      // 06c3: getstatic fb.Qe B
      // 06c6: bipush 2
      // 06c7: isub
      // 06c8: if_icmpne 06d3
      // 06cb: bipush 2
      // 06cc: istore 4
      // 06ce: iload 8
      // 06d0: ifeq 06db
      // 06d3: iload 2
      // 06d4: bipush 1
      // 06d5: if_icmpne 06db
      // 06d8: bipush 3
      // 06d9: istore 4
      // 06db: iload 2
      // 06dc: i2b
      // 06dd: iload 3
      // 06de: i2b
      // 06df: invokestatic o.c (BB)Z
      // 06e2: ifeq 0774
      // 06e5: aload 1
      // 06e6: iload 2
      // 06e7: i2b
      // 06e8: iload 3
      // 06e9: i2b
      // 06ea: iload 4
      // 06ec: i2b
      // 06ed: istore 4
      // 06ef: istore 4
      // 06f1: istore 4
      // 06f3: astore 7
      // 06f5: iload 2
      // 06f6: bipush 1
      // 06f7: if_icmpne 0712
      // 06fa: iload 3
      // 06fb: bipush 1
      // 06fc: if_icmpne 0712
      // 06ff: aload 1
      // 0700: iload 2
      // 0701: i2b
      // 0702: iload 3
      // 0703: i2b
      // 0704: bipush 3
      // 0705: istore 4
      // 0707: istore 4
      // 0709: istore 4
      // 070b: astore 7
      // 070d: iload 8
      // 070f: ifeq 0774
      // 0712: iload 2
      // 0713: bipush 1
      // 0714: if_icmpne 0733
      // 0717: iload 3
      // 0718: getstatic fb.Qe B
      // 071b: bipush 2
      // 071c: isub
      // 071d: if_icmpne 0733
      // 0720: aload 1
      // 0721: iload 2
      // 0722: i2b
      // 0723: iload 3
      // 0724: i2b
      // 0725: bipush 3
      // 0726: istore 4
      // 0728: istore 4
      // 072a: istore 4
      // 072c: astore 7
      // 072e: iload 8
      // 0730: ifeq 0774
      // 0733: iload 2
      // 0734: getstatic fb.Pe B
      // 0737: bipush 2
      // 0738: isub
      // 0739: if_icmpne 0754
      // 073c: iload 3
      // 073d: bipush 1
      // 073e: if_icmpne 0754
      // 0741: aload 1
      // 0742: iload 2
      // 0743: i2b
      // 0744: iload 3
      // 0745: i2b
      // 0746: bipush 1
      // 0747: istore 4
      // 0749: istore 4
      // 074b: istore 4
      // 074d: astore 7
      // 074f: iload 8
      // 0751: ifeq 0774
      // 0754: iload 2
      // 0755: getstatic fb.Pe B
      // 0758: bipush 2
      // 0759: isub
      // 075a: if_icmpne 0774
      // 075d: iload 3
      // 075e: getstatic fb.Qe B
      // 0761: bipush 2
      // 0762: isub
      // 0763: if_icmpne 0774
      // 0766: aload 1
      // 0767: iload 2
      // 0768: i2b
      // 0769: iload 3
      // 076a: i2b
      // 076b: bipush 2
      // 076c: istore 4
      // 076e: istore 4
      // 0770: istore 4
      // 0772: astore 7
      // 0774: iinc 2 1
      // 0777: iload 8
      // 0779: ifeq 0675
      // 077c: getstatic fb.We B
      // 077f: istore 2
      // 0780: iload 2
      // 0781: getstatic fb.We B
      // 0784: getstatic fb.Ye B
      // 0787: iadd
      // 0788: if_icmpge 07e5
      // 078b: getstatic fb.Yd Ljava/util/Vector;
      // 078e: iload 8
      // 0790: ifne 0c0f
      // 0793: ifnull 07dd
      // 0796: bipush 0
      // 0797: istore 4
      // 0799: iload 4
      // 079b: getstatic fb.Yd Ljava/util/Vector;
      // 079e: invokevirtual java/util/Vector.size ()I
      // 07a1: if_icmpge 07dd
      // 07a4: getstatic fb.Yd Ljava/util/Vector;
      // 07a7: iload 4
      // 07a9: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 07ac: checkcast s
      // 07af: dup
      // 07b0: astore 5
      // 07b2: getfield s.s Z
      // 07b5: iload 8
      // 07b7: ifne 0781
      // 07ba: ifne 07d5
      // 07bd: aload 5
      // 07bf: getfield s.g B
      // 07c2: iload 2
      // 07c3: if_icmpne 07d5
      // 07c6: aload 5
      // 07c8: getfield s.h B
      // 07cb: iload 3
      // 07cc: if_icmpne 07d5
      // 07cf: aload 5
      // 07d1: aload 1
      // 07d2: invokevirtual s.b (Ljavax/microedition/lcdui/Graphics;)V
      // 07d5: iinc 4 1
      // 07d8: iload 8
      // 07da: ifeq 0799
      // 07dd: iinc 2 1
      // 07e0: iload 8
      // 07e2: ifeq 0780
      // 07e5: getstatic fb.We B
      // 07e8: istore 2
      // 07e9: iload 2
      // 07ea: getstatic fb.We B
      // 07ed: getstatic fb.Ye B
      // 07f0: iadd
      // 07f1: if_icmpge 0bad
      // 07f4: getstatic fb.Re [[Llb;
      // 07f7: iload 2
      // 07f8: aaload
      // 07f9: iload 3
      // 07fa: aaload
      // 07fb: iload 8
      // 07fd: ifne 11c5
      // 0800: getfield lb.e [I
      // 0803: ifnull 0877
      // 0806: bipush 0
      // 0807: istore 4
      // 0809: iload 4
      // 080b: getstatic fb.Re [[Llb;
      // 080e: iload 2
      // 080f: aaload
      // 0810: iload 3
      // 0811: aaload
      // 0812: getfield lb.e [I
      // 0815: arraylength
      // 0816: if_icmpge 0877
      // 0819: getstatic fb.Re [[Llb;
      // 081c: iload 2
      // 081d: aaload
      // 081e: iload 3
      // 081f: aaload
      // 0820: getfield lb.e [I
      // 0823: iload 4
      // 0825: iaload
      // 0826: bipush -1
      // 0827: iload 8
      // 0829: ifne 087b
      // 082c: if_icmpeq 086f
      // 082f: getstatic fb.Re [[Llb;
      // 0832: iload 2
      // 0833: aaload
      // 0834: iload 3
      // 0835: aaload
      // 0836: getfield lb.e [I
      // 0839: iload 4
      // 083b: iaload
      // 083c: getstatic fb.Rd Ljava/util/Vector;
      // 083f: invokevirtual java/util/Vector.size ()I
      // 0842: if_icmpge 086f
      // 0845: getstatic fb.Rd Ljava/util/Vector;
      // 0848: getstatic fb.Re [[Llb;
      // 084b: iload 2
      // 084c: aaload
      // 084d: iload 3
      // 084e: aaload
      // 084f: getfield lb.e [I
      // 0852: iload 4
      // 0854: iaload
      // 0855: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 0858: checkcast o
      // 085b: dup
      // 085c: astore 5
      // 085e: ifnull 086f
      // 0861: aload 5
      // 0863: invokevirtual o.d ()Z
      // 0866: ifeq 086f
      // 0869: aload 5
      // 086b: aload 1
      // 086c: invokevirtual o.b (Ljavax/microedition/lcdui/Graphics;)V
      // 086f: iinc 4 1
      // 0872: iload 8
      // 0874: ifeq 0809
      // 0877: iload 2
      // 0878: i2b
      // 0879: iload 3
      // 087a: i2b
      // 087b: invokestatic o.c (BB)Z
      // 087e: ifeq 0aec
      // 0881: getstatic fb.Ud Ljava/util/Vector;
      // 0884: ifnull 08ce
      // 0887: bipush 0
      // 0888: istore 4
      // 088a: iload 4
      // 088c: getstatic fb.Ud Ljava/util/Vector;
      // 088f: invokevirtual java/util/Vector.size ()I
      // 0892: if_icmpge 08ce
      // 0895: getstatic fb.Ud Ljava/util/Vector;
      // 0898: iload 4
      // 089a: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 089d: checkcast hb
      // 08a0: dup
      // 08a1: astore 5
      // 08a3: invokevirtual hb.b ()Z
      // 08a6: iload 8
      // 08a8: ifne 0a47
      // 08ab: ifne 08c6
      // 08ae: aload 5
      // 08b0: getfield hb.q B
      // 08b3: iload 2
      // 08b4: if_icmpne 08c6
      // 08b7: aload 5
      // 08b9: getfield hb.r B
      // 08bc: iload 3
      // 08bd: if_icmpne 08c6
      // 08c0: aload 5
      // 08c2: aload 1
      // 08c3: invokevirtual hb.b (Ljavax/microedition/lcdui/Graphics;)V
      // 08c6: iinc 4 1
      // 08c9: iload 8
      // 08cb: ifeq 088a
      // 08ce: getstatic fb.Qd Ljava/util/Vector;
      // 08d1: ifnull 0929
      // 08d4: bipush 0
      // 08d5: istore 4
      // 08d7: iload 4
      // 08d9: getstatic fb.Qd Ljava/util/Vector;
      // 08dc: invokevirtual java/util/Vector.size ()I
      // 08df: if_icmpge 0929
      // 08e2: getstatic fb.Qd Ljava/util/Vector;
      // 08e5: iload 4
      // 08e7: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 08ea: checkcast o
      // 08ed: dup
      // 08ee: astore 5
      // 08f0: getfield o.g B
      // 08f3: iload 2
      // 08f4: iload 8
      // 08f6: ifne 0a48
      // 08f9: if_icmpne 0921
      // 08fc: aload 5
      // 08fe: getfield o.h B
      // 0901: iload 3
      // 0902: if_icmpne 0921
      // 0905: aload 5
      // 0907: instanceof q
      // 090a: ifeq 0921
      // 090d: aload 5
      // 090f: checkcast q
      // 0912: invokevirtual q.r ()Z
      // 0915: ifne 0921
      // 0918: aload 5
      // 091a: checkcast q
      // 091d: aload 1
      // 091e: invokevirtual q.b (Ljavax/microedition/lcdui/Graphics;)V
      // 0921: iinc 4 1
      // 0924: iload 8
      // 0926: ifeq 08d7
      // 0929: getstatic fb.ae Ljava/util/Vector;
      // 092c: ifnull 09ad
      // 092f: bipush 0
      // 0930: istore 5
      // 0932: iload 5
      // 0934: getstatic fb.ae Ljava/util/Vector;
      // 0937: invokevirtual java/util/Vector.size ()I
      // 093a: if_icmpge 09ad
      // 093d: getstatic fb.ae Ljava/util/Vector;
      // 0940: iload 8
      // 0942: ifne 09b0
      // 0945: iload 5
      // 0947: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 094a: checkcast sb
      // 094d: dup
      // 094e: astore 6
      // 0950: getfield sb.r Lnb;
      // 0953: ifnull 09a5
      // 0956: aload 6
      // 0958: getfield sb.s I
      // 095b: iload 2
      // 095c: if_icmpne 09a5
      // 095f: aload 6
      // 0961: getfield sb.t I
      // 0964: iload 3
      // 0965: if_icmpne 09a5
      // 0968: aload 6
      // 096a: getfield sb.r Lnb;
      // 096d: aload 1
      // 096e: aload 6
      // 0970: getfield sb.s I
      // 0973: bipush 30
      // 0975: imul
      // 0976: aload 6
      // 0978: getfield sb.r Lnb;
      // 097b: getfield nb.b Lpb;
      // 097e: getfield pb.e I
      // 0981: bipush 2
      // 0982: idiv
      // 0983: iadd
      // 0984: getstatic fb.Ge I
      // 0987: isub
      // 0988: aload 6
      // 098a: getfield sb.t I
      // 098d: bipush 30
      // 098f: imul
      // 0990: aload 6
      // 0992: getfield sb.r Lnb;
      // 0995: getfield nb.b Lpb;
      // 0998: getfield pb.e I
      // 099b: bipush 2
      // 099c: idiv
      // 099d: iadd
      // 099e: getstatic fb.He I
      // 09a1: isub
      // 09a2: invokevirtual nb.b (Ljavax/microedition/lcdui/Graphics;II)V
      // 09a5: iinc 5 1
      // 09a8: iload 8
      // 09aa: ifeq 0932
      // 09ad: getstatic fb.Yd Ljava/util/Vector;
      // 09b0: ifnull 09fa
      // 09b3: bipush 0
      // 09b4: istore 4
      // 09b6: iload 4
      // 09b8: getstatic fb.Yd Ljava/util/Vector;
      // 09bb: invokevirtual java/util/Vector.size ()I
      // 09be: if_icmpge 09fa
      // 09c1: getstatic fb.Yd Ljava/util/Vector;
      // 09c4: iload 4
      // 09c6: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 09c9: checkcast s
      // 09cc: dup
      // 09cd: astore 5
      // 09cf: getfield s.s Z
      // 09d2: iload 8
      // 09d4: ifne 0a47
      // 09d7: ifeq 09f2
      // 09da: aload 5
      // 09dc: getfield s.g B
      // 09df: iload 2
      // 09e0: if_icmpne 09f2
      // 09e3: aload 5
      // 09e5: getfield s.h B
      // 09e8: iload 3
      // 09e9: if_icmpne 09f2
      // 09ec: aload 5
      // 09ee: aload 1
      // 09ef: invokevirtual s.b (Ljavax/microedition/lcdui/Graphics;)V
      // 09f2: iinc 4 1
      // 09f5: iload 8
      // 09f7: ifeq 09b6
      // 09fa: getstatic fb.Td Ljava/util/Vector;
      // 09fd: ifnull 0a44
      // 0a00: bipush 0
      // 0a01: istore 4
      // 0a03: iload 4
      // 0a05: getstatic fb.Td Ljava/util/Vector;
      // 0a08: invokevirtual java/util/Vector.size ()I
      // 0a0b: if_icmpge 0a44
      // 0a0e: getstatic fb.Td Ljava/util/Vector;
      // 0a11: iload 4
      // 0a13: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 0a16: checkcast p
      // 0a19: dup
      // 0a1a: astore 5
      // 0a1c: iload 8
      // 0a1e: ifne 1594
      // 0a21: ifnull 0a3c
      // 0a24: aload 5
      // 0a26: getfield p.g B
      // 0a29: iload 2
      // 0a2a: if_icmpne 0a3c
      // 0a2d: aload 5
      // 0a2f: getfield p.h B
      // 0a32: iload 3
      // 0a33: if_icmpne 0a3c
      // 0a36: aload 5
      // 0a38: aload 1
      // 0a39: invokevirtual p.b (Ljavax/microedition/lcdui/Graphics;)V
      // 0a3c: iinc 4 1
      // 0a3f: iload 8
      // 0a41: ifeq 0a03
      // 0a44: invokestatic fb.j ()B
      // 0a47: bipush 2
      // 0a48: if_icmpne 0a9f
      // 0a4b: getstatic fb.ib Ls;
      // 0a4e: ifnull 0a9f
      // 0a51: getstatic fb.jb Ls;
      // 0a54: ifnull 0a9f
      // 0a57: getstatic fb.ib Ls;
      // 0a5a: getfield s.g B
      // 0a5d: iload 2
      // 0a5e: if_icmpne 0a7b
      // 0a61: getstatic fb.ib Ls;
      // 0a64: getfield s.h B
      // 0a67: iload 3
      // 0a68: if_icmpne 0a7b
      // 0a6b: getstatic fb.ib Ls;
      // 0a6e: invokevirtual s.c ()Z
      // 0a71: ifeq 0a7b
      // 0a74: getstatic fb.ib Ls;
      // 0a77: aload 1
      // 0a78: invokevirtual s.b (Ljavax/microedition/lcdui/Graphics;)V
      // 0a7b: getstatic fb.jb Ls;
      // 0a7e: getfield s.g B
      // 0a81: iload 2
      // 0a82: if_icmpne 0a9f
      // 0a85: getstatic fb.jb Ls;
      // 0a88: getfield s.h B
      // 0a8b: iload 3
      // 0a8c: if_icmpne 0a9f
      // 0a8f: getstatic fb.jb Ls;
      // 0a92: invokevirtual s.c ()Z
      // 0a95: ifeq 0a9f
      // 0a98: getstatic fb.jb Ls;
      // 0a9b: aload 1
      // 0a9c: invokevirtual s.b (Ljavax/microedition/lcdui/Graphics;)V
      // 0a9f: getstatic fb.Vd Ljava/util/Vector;
      // 0aa2: ifnull 0aec
      // 0aa5: bipush 0
      // 0aa6: istore 4
      // 0aa8: iload 4
      // 0aaa: getstatic fb.Vd Ljava/util/Vector;
      // 0aad: invokevirtual java/util/Vector.size ()I
      // 0ab0: if_icmpge 0aec
      // 0ab3: getstatic fb.Vd Ljava/util/Vector;
      // 0ab6: iload 4
      // 0ab8: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 0abb: checkcast t
      // 0abe: dup
      // 0abf: astore 5
      // 0ac1: getfield t.D Z
      // 0ac4: iload 8
      // 0ac6: ifne 07ea
      // 0ac9: ifne 0ae4
      // 0acc: aload 5
      // 0ace: getfield t.g B
      // 0ad1: iload 2
      // 0ad2: if_icmpne 0ae4
      // 0ad5: aload 5
      // 0ad7: getfield t.h B
      // 0ada: iload 3
      // 0adb: if_icmpne 0ae4
      // 0ade: aload 5
      // 0ae0: aload 1
      // 0ae1: invokevirtual t.b (Ljavax/microedition/lcdui/Graphics;)V
      // 0ae4: iinc 4 1
      // 0ae7: iload 8
      // 0ae9: ifeq 0aa8
      // 0aec: getstatic fb.Re [[Llb;
      // 0aef: iload 2
      // 0af0: aaload
      // 0af1: iload 3
      // 0af2: aaload
      // 0af3: getfield lb.d Lj;
      // 0af6: ifnull 0b27
      // 0af9: getstatic fb.Re [[Llb;
      // 0afc: iload 2
      // 0afd: aaload
      // 0afe: iload 3
      // 0aff: aaload
      // 0b00: getfield lb.d Lj;
      // 0b03: getfield j.y Z
      // 0b06: ifne 0b27
      // 0b09: getstatic fb.Re [[Llb;
      // 0b0c: iload 2
      // 0b0d: aaload
      // 0b0e: iload 3
      // 0b0f: aaload
      // 0b10: getfield lb.d Lj;
      // 0b13: invokevirtual j.e ()Z
      // 0b16: ifeq 0b27
      // 0b19: getstatic fb.Re [[Llb;
      // 0b1c: iload 2
      // 0b1d: aaload
      // 0b1e: iload 3
      // 0b1f: aaload
      // 0b20: getfield lb.d Lj;
      // 0b23: aload 1
      // 0b24: invokevirtual j.b (Ljavax/microedition/lcdui/Graphics;)V
      // 0b27: getstatic fb.Re [[Llb;
      // 0b2a: iload 2
      // 0b2b: aaload
      // 0b2c: iload 3
      // 0b2d: aaload
      // 0b2e: getfield lb.f [I
      // 0b31: ifnull 0ba5
      // 0b34: bipush 0
      // 0b35: istore 4
      // 0b37: iload 4
      // 0b39: getstatic fb.Re [[Llb;
      // 0b3c: iload 2
      // 0b3d: aaload
      // 0b3e: iload 3
      // 0b3f: aaload
      // 0b40: getfield lb.f [I
      // 0b43: arraylength
      // 0b44: if_icmpge 0ba5
      // 0b47: getstatic fb.Re [[Llb;
      // 0b4a: iload 2
      // 0b4b: aaload
      // 0b4c: iload 3
      // 0b4d: aaload
      // 0b4e: getfield lb.f [I
      // 0b51: iload 4
      // 0b53: iaload
      // 0b54: bipush -1
      // 0b55: iload 8
      // 0b57: ifne 07f1
      // 0b5a: if_icmpeq 0b9d
      // 0b5d: getstatic fb.Re [[Llb;
      // 0b60: iload 2
      // 0b61: aaload
      // 0b62: iload 3
      // 0b63: aaload
      // 0b64: getfield lb.f [I
      // 0b67: iload 4
      // 0b69: iaload
      // 0b6a: getstatic fb.Rd Ljava/util/Vector;
      // 0b6d: invokevirtual java/util/Vector.size ()I
      // 0b70: if_icmpge 0b9d
      // 0b73: getstatic fb.Rd Ljava/util/Vector;
      // 0b76: getstatic fb.Re [[Llb;
      // 0b79: iload 2
      // 0b7a: aaload
      // 0b7b: iload 3
      // 0b7c: aaload
      // 0b7d: getfield lb.f [I
      // 0b80: iload 4
      // 0b82: iaload
      // 0b83: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 0b86: checkcast o
      // 0b89: dup
      // 0b8a: astore 5
      // 0b8c: ifnull 0b9d
      // 0b8f: aload 5
      // 0b91: invokevirtual o.d ()Z
      // 0b94: ifeq 0b9d
      // 0b97: aload 5
      // 0b99: aload 1
      // 0b9a: invokevirtual o.b (Ljavax/microedition/lcdui/Graphics;)V
      // 0b9d: iinc 4 1
      // 0ba0: iload 8
      // 0ba2: ifeq 0b37
      // 0ba5: iinc 2 1
      // 0ba8: iload 8
      // 0baa: ifeq 07e9
      // 0bad: getstatic fb.We B
      // 0bb0: istore 2
      // 0bb1: iload 2
      // 0bb2: getstatic fb.We B
      // 0bb5: getstatic fb.Ye B
      // 0bb8: iadd
      // 0bb9: if_icmpge 0c04
      // 0bbc: getstatic fb.Re [[Llb;
      // 0bbf: iload 2
      // 0bc0: aaload
      // 0bc1: iload 3
      // 0bc2: aaload
      // 0bc3: getfield lb.d Lj;
      // 0bc6: iload 8
      // 0bc8: ifne 11c8
      // 0bcb: ifnull 0bfc
      // 0bce: getstatic fb.Re [[Llb;
      // 0bd1: iload 2
      // 0bd2: aaload
      // 0bd3: iload 3
      // 0bd4: aaload
      // 0bd5: getfield lb.d Lj;
      // 0bd8: getfield j.y Z
      // 0bdb: ifeq 0bfc
      // 0bde: getstatic fb.Re [[Llb;
      // 0be1: iload 2
      // 0be2: aaload
      // 0be3: iload 3
      // 0be4: aaload
      // 0be5: getfield lb.d Lj;
      // 0be8: invokevirtual j.e ()Z
      // 0beb: ifeq 0bfc
      // 0bee: getstatic fb.Re [[Llb;
      // 0bf1: iload 2
      // 0bf2: aaload
      // 0bf3: iload 3
      // 0bf4: aaload
      // 0bf5: getfield lb.d Lj;
      // 0bf8: aload 1
      // 0bf9: invokevirtual j.b (Ljavax/microedition/lcdui/Graphics;)V
      // 0bfc: iinc 2 1
      // 0bff: iload 8
      // 0c01: ifeq 0bb1
      // 0c04: iinc 3 1
      // 0c07: iload 8
      // 0c09: ifeq 0661
      // 0c0c: getstatic fb.Xd Ljava/util/Vector;
      // 0c0f: ifnull 0c95
      // 0c12: bipush 0
      // 0c13: istore 4
      // 0c15: iload 4
      // 0c17: getstatic fb.Xd Ljava/util/Vector;
      // 0c1a: invokevirtual java/util/Vector.size ()I
      // 0c1d: if_icmpge 0c95
      // 0c20: getstatic fb.Xd Ljava/util/Vector;
      // 0c23: iload 4
      // 0c25: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 0c28: checkcast w
      // 0c2b: dup
      // 0c2c: astore 5
      // 0c2e: getfield w.g Z
      // 0c31: iload 8
      // 0c33: ifne 0c98
      // 0c36: ifne 0c8d
      // 0c39: aload 5
      // 0c3b: getfield w.t Z
      // 0c3e: ifne 0c8d
      // 0c41: bipush 20
      // 0c43: istore 6
      // 0c45: bipush 20
      // 0c47: istore 7
      // 0c49: aload 5
      // 0c4b: getfield w.h Lnb;
      // 0c4e: ifnull 0c65
      // 0c51: aload 5
      // 0c53: getfield w.h Lnb;
      // 0c56: getfield nb.c I
      // 0c59: istore 6
      // 0c5b: aload 5
      // 0c5d: getfield w.h Lnb;
      // 0c60: getfield nb.d I
      // 0c63: istore 7
      // 0c65: aload 5
      // 0c67: getfield w.j I
      // 0c6a: bipush 10
      // 0c6c: idiv
      // 0c6d: aload 5
      // 0c6f: getfield w.k I
      // 0c72: bipush 10
      // 0c74: idiv
      // 0c75: aload 5
      // 0c77: getfield w.l I
      // 0c7a: bipush 5
      // 0c7b: idiv
      // 0c7c: isub
      // 0c7d: iload 6
      // 0c7f: iload 7
      // 0c81: invokestatic o.c (IIII)Z
      // 0c84: ifeq 0c8d
      // 0c87: aload 5
      // 0c89: aload 1
      // 0c8a: invokevirtual w.b (Ljavax/microedition/lcdui/Graphics;)V
      // 0c8d: iinc 4 1
      // 0c90: iload 8
      // 0c92: ifeq 0c15
      // 0c95: getstatic fb.Xe B
      // 0c98: istore 3
      // 0c99: iload 3
      // 0c9a: getstatic fb.Xe B
      // 0c9d: getstatic fb.Ze B
      // 0ca0: iadd
      // 0ca1: if_icmpge 0e4a
      // 0ca4: getstatic fb.We B
      // 0ca7: iload 8
      // 0ca9: ifne 0ed6
      // 0cac: istore 2
      // 0cad: iload 2
      // 0cae: getstatic fb.We B
      // 0cb1: getstatic fb.Ye B
      // 0cb4: iadd
      // 0cb5: if_icmpge 0e42
      // 0cb8: getstatic fb.Re [[Llb;
      // 0cbb: iload 2
      // 0cbc: aaload
      // 0cbd: iload 3
      // 0cbe: aaload
      // 0cbf: getfield lb.d Lj;
      // 0cc2: iload 8
      // 0cc4: ifne 11c8
      // 0cc7: ifnull 0d22
      // 0cca: getstatic fb.Re [[Llb;
      // 0ccd: iload 2
      // 0cce: aaload
      // 0ccf: iload 3
      // 0cd0: aaload
      // 0cd1: getfield lb.d Lj;
      // 0cd4: getfield j.z Z
      // 0cd7: ifeq 0d22
      // 0cda: getstatic fb.Re [[Llb;
      // 0cdd: iload 2
      // 0cde: aaload
      // 0cdf: iload 3
      // 0ce0: aaload
      // 0ce1: getfield lb.d Lj;
      // 0ce4: getfield j.f I
      // 0ce7: bipush 45
      // 0ce9: iadd
      // 0cea: istore 4
      // 0cec: getstatic fb.Re [[Llb;
      // 0cef: iload 2
      // 0cf0: aaload
      // 0cf1: iload 3
      // 0cf2: aaload
      // 0cf3: getfield lb.d Lj;
      // 0cf6: getfield j.g I
      // 0cf9: bipush 45
      // 0cfb: iadd
      // 0cfc: istore 5
      // 0cfe: iload 4
      // 0d00: iload 5
      // 0d02: getstatic fb.Yc Lpb;
      // 0d05: getfield pb.d I
      // 0d08: getstatic fb.Yc Lpb;
      // 0d0b: getfield pb.e I
      // 0d0e: invokestatic o.c (IIII)Z
      // 0d11: ifeq 0d22
      // 0d14: aload 1
      // 0d15: getstatic fb.Re [[Llb;
      // 0d18: iload 2
      // 0d19: aaload
      // 0d1a: iload 3
      // 0d1b: aaload
      // 0d1c: getfield lb.d Lj;
      // 0d1f: invokestatic j.b (Ljavax/microedition/lcdui/Graphics;Lj;)V
      // 0d22: getstatic fb.Re [[Llb;
      // 0d25: iload 2
      // 0d26: aaload
      // 0d27: iload 3
      // 0d28: aaload
      // 0d29: getfield lb.d Lj;
      // 0d2c: ifnull 0d4d
      // 0d2f: getstatic fb.Re [[Llb;
      // 0d32: iload 2
      // 0d33: aaload
      // 0d34: iload 3
      // 0d35: aaload
      // 0d36: getfield lb.d Lj;
      // 0d39: getfield j.B Z
      // 0d3c: ifeq 0d4d
      // 0d3f: aload 1
      // 0d40: getstatic fb.Re [[Llb;
      // 0d43: iload 2
      // 0d44: aaload
      // 0d45: iload 3
      // 0d46: aaload
      // 0d47: getfield lb.d Lj;
      // 0d4a: invokestatic fb.b (Ljavax/microedition/lcdui/Graphics;Lj;)V
      // 0d4d: getstatic fb.Qd Ljava/util/Vector;
      // 0d50: ifnull 0da0
      // 0d53: bipush 0
      // 0d54: istore 4
      // 0d56: iload 4
      // 0d58: getstatic fb.Qd Ljava/util/Vector;
      // 0d5b: invokevirtual java/util/Vector.size ()I
      // 0d5e: if_icmpge 0da0
      // 0d61: getstatic fb.Qd Ljava/util/Vector;
      // 0d64: iload 4
      // 0d66: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 0d69: checkcast q
      // 0d6c: dup
      // 0d6d: astore 5
      // 0d6f: getfield q.g B
      // 0d72: iload 2
      // 0d73: iload 8
      // 0d75: ifne 0cb5
      // 0d78: if_icmpne 0d98
      // 0d7b: aload 5
      // 0d7d: getfield q.h B
      // 0d80: iload 3
      // 0d81: if_icmpne 0d98
      // 0d84: aload 5
      // 0d86: aload 1
      // 0d87: invokevirtual q.a (Ljavax/microedition/lcdui/Graphics;)V
      // 0d8a: aload 5
      // 0d8c: invokevirtual q.r ()Z
      // 0d8f: ifeq 0d98
      // 0d92: aload 5
      // 0d94: aload 1
      // 0d95: invokevirtual q.b (Ljavax/microedition/lcdui/Graphics;)V
      // 0d98: iinc 4 1
      // 0d9b: iload 8
      // 0d9d: ifeq 0d56
      // 0da0: getstatic fb.Ud Ljava/util/Vector;
      // 0da3: ifnull 0ded
      // 0da6: bipush 0
      // 0da7: istore 4
      // 0da9: iload 4
      // 0dab: getstatic fb.Ud Ljava/util/Vector;
      // 0dae: invokevirtual java/util/Vector.size ()I
      // 0db1: if_icmpge 0ded
      // 0db4: getstatic fb.Ud Ljava/util/Vector;
      // 0db7: iload 4
      // 0db9: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 0dbc: checkcast hb
      // 0dbf: dup
      // 0dc0: astore 5
      // 0dc2: invokevirtual hb.b ()Z
      // 0dc5: iload 8
      // 0dc7: ifne 0cae
      // 0dca: ifeq 0de5
      // 0dcd: aload 5
      // 0dcf: getfield hb.q B
      // 0dd2: iload 2
      // 0dd3: if_icmpne 0de5
      // 0dd6: aload 5
      // 0dd8: getfield hb.r B
      // 0ddb: iload 3
      // 0ddc: if_icmpne 0de5
      // 0ddf: aload 5
      // 0de1: aload 1
      // 0de2: invokevirtual hb.b (Ljavax/microedition/lcdui/Graphics;)V
      // 0de5: iinc 4 1
      // 0de8: iload 8
      // 0dea: ifeq 0da9
      // 0ded: getstatic fb.Vd Ljava/util/Vector;
      // 0df0: ifnull 0e3a
      // 0df3: bipush 0
      // 0df4: istore 4
      // 0df6: iload 4
      // 0df8: getstatic fb.Vd Ljava/util/Vector;
      // 0dfb: invokevirtual java/util/Vector.size ()I
      // 0dfe: if_icmpge 0e3a
      // 0e01: getstatic fb.Vd Ljava/util/Vector;
      // 0e04: iload 4
      // 0e06: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 0e09: checkcast t
      // 0e0c: dup
      // 0e0d: astore 5
      // 0e0f: getfield t.D Z
      // 0e12: iload 8
      // 0e14: ifne 0cae
      // 0e17: ifeq 0e32
      // 0e1a: aload 5
      // 0e1c: getfield t.g B
      // 0e1f: iload 2
      // 0e20: if_icmpne 0e32
      // 0e23: aload 5
      // 0e25: getfield t.h B
      // 0e28: iload 3
      // 0e29: if_icmpne 0e32
      // 0e2c: aload 5
      // 0e2e: aload 1
      // 0e2f: invokevirtual t.b (Ljavax/microedition/lcdui/Graphics;)V
      // 0e32: iinc 4 1
      // 0e35: iload 8
      // 0e37: ifeq 0df6
      // 0e3a: iinc 2 1
      // 0e3d: iload 8
      // 0e3f: ifeq 0cad
      // 0e42: iinc 3 1
      // 0e45: iload 8
      // 0e47: ifeq 0c99
      // 0e4a: getstatic fb.Xd Ljava/util/Vector;
      // 0e4d: ifnull 0ed3
      // 0e50: bipush 0
      // 0e51: istore 4
      // 0e53: iload 4
      // 0e55: getstatic fb.Xd Ljava/util/Vector;
      // 0e58: invokevirtual java/util/Vector.size ()I
      // 0e5b: if_icmpge 0ed3
      // 0e5e: getstatic fb.Xd Ljava/util/Vector;
      // 0e61: iload 4
      // 0e63: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 0e66: checkcast w
      // 0e69: dup
      // 0e6a: astore 5
      // 0e6c: getfield w.g Z
      // 0e6f: iload 8
      // 0e71: ifne 0ed6
      // 0e74: ifne 0ecb
      // 0e77: aload 5
      // 0e79: getfield w.t Z
      // 0e7c: ifeq 0ecb
      // 0e7f: bipush 20
      // 0e81: istore 6
      // 0e83: bipush 20
      // 0e85: istore 7
      // 0e87: aload 5
      // 0e89: getfield w.h Lnb;
      // 0e8c: ifnull 0ea3
      // 0e8f: aload 5
      // 0e91: getfield w.h Lnb;
      // 0e94: getfield nb.c I
      // 0e97: istore 6
      // 0e99: aload 5
      // 0e9b: getfield w.h Lnb;
      // 0e9e: getfield nb.d I
      // 0ea1: istore 7
      // 0ea3: aload 5
      // 0ea5: getfield w.j I
      // 0ea8: bipush 10
      // 0eaa: idiv
      // 0eab: aload 5
      // 0ead: getfield w.k I
      // 0eb0: bipush 10
      // 0eb2: idiv
      // 0eb3: aload 5
      // 0eb5: getfield w.l I
      // 0eb8: bipush 5
      // 0eb9: idiv
      // 0eba: isub
      // 0ebb: iload 6
      // 0ebd: iload 7
      // 0ebf: invokestatic o.c (IIII)Z
      // 0ec2: ifeq 0ecb
      // 0ec5: aload 5
      // 0ec7: aload 1
      // 0ec8: invokevirtual w.b (Ljavax/microedition/lcdui/Graphics;)V
      // 0ecb: iinc 4 1
      // 0ece: iload 8
      // 0ed0: ifeq 0e53
      // 0ed3: invokestatic fb.m ()Z
      // 0ed6: ifeq 1077
      // 0ed9: aload 0
      // 0eda: getfield fb.U I
      // 0edd: ifeq 0fb5
      // 0ee0: aload 0
      // 0ee1: invokevirtual fb.c ()Z
      // 0ee4: ifne 0ef1
      // 0ee7: aload 0
      // 0ee8: dup
      // 0ee9: getfield fb.T I
      // 0eec: bipush 1
      // 0eed: iadd
      // 0eee: putfield fb.T I
      // 0ef1: aload 0
      // 0ef2: getfield fb.T I
      // 0ef5: bipush 7
      // 0ef7: if_icmple 0eff
      // 0efa: aload 0
      // 0efb: bipush 0
      // 0efc: putfield fb.T I
      // 0eff: aload 0
      // 0f00: getfield fb.T I
      // 0f03: bipush 2
      // 0f04: idiv
      // 0f05: istore 5
      // 0f07: aload 0
      // 0f08: getfield fb.U I
      // 0f0b: bipush 1
      // 0f0c: if_icmpeq 0f17
      // 0f0f: aload 0
      // 0f10: getfield fb.U I
      // 0f13: bipush 5
      // 0f14: if_icmpne 0f1f
      // 0f17: bipush 0
      // 0f18: istore 6
      // 0f1a: iload 8
      // 0f1c: ifeq 0f32
      // 0f1f: aload 0
      // 0f20: getfield fb.U I
      // 0f23: bipush 3
      // 0f24: if_icmpne 0f2f
      // 0f27: bipush 2
      // 0f28: istore 6
      // 0f2a: iload 8
      // 0f2c: ifeq 0f32
      // 0f2f: bipush 1
      // 0f30: istore 6
      // 0f32: getstatic fb.Ge I
      // 0f35: ineg
      // 0f36: aconst_null
      // 0f37: getfield pb.d I
      // 0f3a: irem
      // 0f3b: istore 2
      // 0f3c: iload 2
      // 0f3d: getstatic ab.D I
      // 0f40: if_icmpge 0f93
      // 0f43: getstatic fb.He I
      // 0f46: ineg
      // 0f47: aconst_null
      // 0f48: getfield pb.e I
      // 0f4b: irem
      // 0f4c: iload 8
      // 0f4e: ifne 0f97
      // 0f51: istore 3
      // 0f52: iload 3
      // 0f53: getstatic ab.E I
      // 0f56: if_icmpge 0f87
      // 0f59: aconst_null
      // 0f5a: iload 5
      // 0f5c: putfield pb.b I
      // 0f5f: aconst_null
      // 0f60: iload 2
      // 0f61: iload 3
      // 0f62: invokevirtual pb.b (II)V
      // 0f65: aconst_null
      // 0f66: aload 1
      // 0f67: invokevirtual pb.b (Ljavax/microedition/lcdui/Graphics;)V
      // 0f6a: iinc 5 1
      // 0f6d: iload 5
      // 0f6f: bipush 3
      // 0f70: iload 8
      // 0f72: ifne 0f8c
      // 0f75: if_icmple 0f7b
      // 0f78: bipush 0
      // 0f79: istore 5
      // 0f7b: iload 3
      // 0f7c: aconst_null
      // 0f7d: getfield pb.e I
      // 0f80: iadd
      // 0f81: istore 3
      // 0f82: iload 8
      // 0f84: ifeq 0f52
      // 0f87: iload 2
      // 0f88: aconst_null
      // 0f89: getfield pb.d I
      // 0f8c: iadd
      // 0f8d: istore 2
      // 0f8e: iload 8
      // 0f90: ifeq 0f3c
      // 0f93: aload 0
      // 0f94: invokevirtual fb.c ()Z
      // 0f97: ifne 0fb5
      // 0f9a: getstatic ab.oc Ljava/util/Random;
      // 0f9d: bipush 3
      // 0f9e: iload 6
      // 0fa0: isub
      // 0fa1: invokevirtual java/util/Random.nextInt (I)I
      // 0fa4: ifne 0fb5
      // 0fa7: invokestatic fb.l ()V
      // 0faa: aload 0
      // 0fab: getfield fb.U I
      // 0fae: bipush 3
      // 0faf: if_icmpne 0fb5
      // 0fb2: invokestatic fb.l ()V
      // 0fb5: aload 0
      // 0fb6: invokevirtual fb.c ()Z
      // 0fb9: ifne 1077
      // 0fbc: aload 0
      // 0fbd: dup
      // 0fbe: getfield fb.S I
      // 0fc1: bipush 1
      // 0fc2: isub
      // 0fc3: putfield fb.S I
      // 0fc6: aload 0
      // 0fc7: getfield fb.S I
      // 0fca: ifge 1041
      // 0fcd: aload 0
      // 0fce: getfield fb.U I
      // 0fd1: bipush 5
      // 0fd2: if_icmpne 0feb
      // 0fd5: aload 0
      // 0fd6: getstatic ab.oc Ljava/util/Random;
      // 0fd9: sipush 600
      // 0fdc: invokevirtual java/util/Random.nextInt (I)I
      // 0fdf: sipush 300
      // 0fe2: iadd
      // 0fe3: putfield fb.S I
      // 0fe6: iload 8
      // 0fe8: ifeq 102a
      // 0feb: aload 0
      // 0fec: getfield fb.U I
      // 0fef: bipush 2
      // 0ff0: if_icmpne 1009
      // 0ff3: aload 0
      // 0ff4: getstatic ab.oc Ljava/util/Random;
      // 0ff7: sipush 350
      // 0ffa: invokevirtual java/util/Random.nextInt (I)I
      // 0ffd: sipush 150
      // 1000: iadd
      // 1001: putfield fb.S I
      // 1004: iload 8
      // 1006: ifeq 102a
      // 1009: aload 0
      // 100a: getfield fb.U I
      // 100d: bipush 1
      // 100e: if_icmpeq 1019
      // 1011: aload 0
      // 1012: getfield fb.U I
      // 1015: bipush 3
      // 1016: if_icmpne 1024
      // 1019: aload 0
      // 101a: bipush 30
      // 101c: putfield fb.S I
      // 101f: iload 8
      // 1021: ifeq 102a
      // 1024: aload 0
      // 1025: bipush 20
      // 1027: putfield fb.S I
      // 102a: aload 0
      // 102b: dup
      // 102c: getfield fb.U I
      // 102f: bipush 1
      // 1030: iadd
      // 1031: putfield fb.U I
      // 1034: aload 0
      // 1035: getfield fb.U I
      // 1038: bipush 5
      // 1039: if_icmple 1041
      // 103c: aload 0
      // 103d: bipush 0
      // 103e: putfield fb.U I
      // 1041: aload 0
      // 1042: getfield fb.U I
      // 1045: bipush 3
      // 1046: if_icmpne 1077
      // 1049: aload 0
      // 104a: getfield fb.V I
      // 104d: bipush -1
      // 104e: if_icmpne 1077
      // 1051: aload 0
      // 1052: getfield fb.S I
      // 1055: bipush 10
      // 1057: if_icmple 1077
      // 105a: getstatic ab.oc Ljava/util/Random;
      // 105d: bipush 50
      // 105f: invokevirtual java/util/Random.nextInt (I)I
      // 1062: ifne 1077
      // 1065: aload 0
      // 1066: getstatic ab.oc Ljava/util/Random;
      // 1069: aload 0
      // 106a: getfield fb.S I
      // 106d: bipush 5
      // 106e: isub
      // 106f: invokevirtual java/util/Random.nextInt (I)I
      // 1072: bipush 5
      // 1073: iadd
      // 1074: putfield fb.V I
      // 1077: invokestatic fb.m ()Z
      // 107a: ifeq 10da
      // 107d: aload 0
      // 107e: getfield fb.V I
      // 1081: bipush -1
      // 1082: if_icmpeq 10da
      // 1085: aload 0
      // 1086: getfield fb.U I
      // 1089: bipush 3
      // 108a: if_icmpne 10da
      // 108d: aload 0
      // 108e: getfield fb.S I
      // 1091: aload 0
      // 1092: getfield fb.V I
      // 1095: if_icmpeq 10a5
      // 1098: aload 0
      // 1099: getfield fb.S I
      // 109c: aload 0
      // 109d: getfield fb.V I
      // 10a0: bipush 2
      // 10a1: isub
      // 10a2: if_icmpne 10da
      // 10a5: aload 1
      // 10a6: sipush 255
      // 10a9: sipush 255
      // 10ac: sipush 255
      // 10af: invokevirtual javax/microedition/lcdui/Graphics.setColor (III)V
      // 10b2: aload 1
      // 10b3: bipush 0
      // 10b4: bipush 0
      // 10b5: getstatic ab.D I
      // 10b8: getstatic ab.E I
      // 10bb: invokevirtual javax/microedition/lcdui/Graphics.fillRect (IIII)V
      // 10be: aload 0
      // 10bf: getfield fb.S I
      // 10c2: aload 0
      // 10c3: getfield fb.V I
      // 10c6: bipush 2
      // 10c7: isub
      // 10c8: if_icmpne 10da
      // 10cb: aload 0
      // 10cc: bipush -1
      // 10cd: putfield fb.V I
      // 10d0: getstatic ab.G Lub;
      // 10d3: getstatic ab.ab I
      // 10d6: bipush 0
      // 10d7: invokevirtual ub.b (II)V
      // 10da: getstatic ab.x I
      // 10dd: ifle 1107
      // 10e0: aload 1
      // 10e1: astore 7
      // 10e3: aload 1
      // 10e4: bipush 0
      // 10e5: invokevirtual javax/microedition/lcdui/Graphics.setColor (I)V
      // 10e8: aload 1
      // 10e9: bipush 0
      // 10ea: bipush 0
      // 10eb: getstatic ab.D I
      // 10ee: getstatic ab.x I
      // 10f1: invokevirtual javax/microedition/lcdui/Graphics.fillRect (IIII)V
      // 10f4: aload 1
      // 10f5: bipush 0
      // 10f6: getstatic ab.E I
      // 10f9: getstatic ab.x I
      // 10fc: isub
      // 10fd: getstatic ab.D I
      // 1100: getstatic ab.x I
      // 1103: invokevirtual javax/microedition/lcdui/Graphics.fillRect (IIII)V
      // 1106: return
      // 1107: getstatic fb.Pd Lq;
      // 110a: ifnull 1168
      // 110d: getstatic fb.Pd Lq;
      // 1110: getfield q.Pb B
      // 1113: bipush 1
      // 1114: if_icmpeq 1121
      // 1117: getstatic fb.Pd Lq;
      // 111a: getfield q.Pb B
      // 111d: bipush 4
      // 111e: if_icmpne 1139
      // 1121: aload 1
      // 1122: bipush 3
      // 1123: istore 4
      // 1125: astore 7
      // 1127: getstatic fb.Pd Lq;
      // 112a: dup
      // 112b: getfield q.Pb B
      // 112e: bipush 1
      // 112f: isub
      // 1130: i2b
      // 1131: putfield q.Pb B
      // 1134: iload 8
      // 1136: ifeq 1168
      // 1139: getstatic fb.Pd Lq;
      // 113c: getfield q.Pb B
      // 113f: bipush 2
      // 1140: if_icmpeq 114d
      // 1143: getstatic fb.Pd Lq;
      // 1146: getfield q.Pb B
      // 1149: bipush 3
      // 114a: if_icmpne 1165
      // 114d: aload 1
      // 114e: bipush 2
      // 114f: istore 4
      // 1151: astore 7
      // 1153: getstatic fb.Pd Lq;
      // 1156: dup
      // 1157: getfield q.Pb B
      // 115a: bipush 1
      // 115b: isub
      // 115c: i2b
      // 115d: putfield q.Pb B
      // 1160: iload 8
      // 1162: ifeq 1168
      // 1165: aload 1
      // 1166: astore 7
      // 1168: aload 0
      // 1169: getfield fb.w I
      // 116c: bipush -1
      // 116d: if_icmpeq 1559
      // 1170: aload 0
      // 1171: getfield fb.x B
      // 1174: bipush 30
      // 1176: imul
      // 1177: istore 2
      // 1178: aload 0
      // 1179: getfield fb.y B
      // 117c: bipush 30
      // 117e: imul
      // 117f: istore 3
      // 1180: iload 2
      // 1181: bipush 15
      // 1183: iadd
      // 1184: iload 3
      // 1185: bipush 15
      // 1187: iadd
      // 1188: bipush 30
      // 118a: bipush 30
      // 118c: invokestatic o.c (IIII)Z
      // 118f: ifeq 12f2
      // 1192: iload 2
      // 1193: getstatic fb.Ge I
      // 1196: ineg
      // 1197: bipush 30
      // 1199: getstatic fb.Dd Lpb;
      // 119c: getfield pb.d I
      // 119f: isub
      // 11a0: bipush 2
      // 11a1: idiv
      // 11a2: iadd
      // 11a3: iadd
      // 11a4: istore 2
      // 11a5: iload 3
      // 11a6: getstatic fb.He I
      // 11a9: ineg
      // 11aa: bipush 30
      // 11ac: getstatic fb.Dd Lpb;
      // 11af: getfield pb.e I
      // 11b2: isub
      // 11b3: bipush 2
      // 11b4: idiv
      // 11b5: iadd
      // 11b6: iadd
      // 11b7: istore 3
      // 11b8: getstatic fb.Re [[Llb;
      // 11bb: aload 0
      // 11bc: getfield fb.x B
      // 11bf: aaload
      // 11c0: aload 0
      // 11c1: getfield fb.y B
      // 11c4: aaload
      // 11c5: getfield lb.d Lj;
      // 11c8: ifnull 11e4
      // 11cb: getstatic fb.Re [[Llb;
      // 11ce: aload 0
      // 11cf: getfield fb.x B
      // 11d2: aaload
      // 11d3: aload 0
      // 11d4: getfield fb.y B
      // 11d7: aaload
      // 11d8: getfield lb.d Lj;
      // 11db: getfield j.A Z
      // 11de: ifeq 11e4
      // 11e1: iinc 2 -10
      // 11e4: getstatic fb.Dd Lpb;
      // 11e7: getstatic fb.kb J
      // 11ea: ldc2_w 2
      // 11ed: ldiv
      // 11ee: ldc2_w 3
      // 11f1: lrem
      // 11f2: l2i
      // 11f3: putfield pb.b I
      // 11f6: getstatic fb.Dd Lpb;
      // 11f9: iload 2
      // 11fa: iload 3
      // 11fb: invokevirtual pb.b (II)V
      // 11fe: getstatic fb.Dd Lpb;
      // 1201: aload 1
      // 1202: invokevirtual pb.b (Ljavax/microedition/lcdui/Graphics;)V
      // 1205: iload 3
      // 1206: aload 0
      // 1207: getfield fb.z I
      // 120a: bipush 5
      // 120b: if_icmpgt 1218
      // 120e: aload 0
      // 120f: getfield fb.z I
      // 1212: bipush 10
      // 1214: isub
      // 1215: goto 121f
      // 1218: aload 0
      // 1219: getfield fb.z I
      // 121c: ineg
      // 121d: bipush 1
      // 121e: isub
      // 121f: iadd
      // 1220: istore 3
      // 1221: iload 2
      // 1222: bipush 30
      // 1224: getstatic fb.Dd Lpb;
      // 1227: getfield pb.d I
      // 122a: isub
      // 122b: bipush 2
      // 122c: idiv
      // 122d: isub
      // 122e: istore 2
      // 122f: getstatic qb.S Lpb;
      // 1232: bipush 0
      // 1233: putfield pb.b I
      // 1236: getstatic qb.S Lpb;
      // 1239: bipush 0
      // 123a: putfield pb.c I
      // 123d: getstatic qb.S Lpb;
      // 1240: iload 2
      // 1241: bipush 30
      // 1243: getstatic qb.S Lpb;
      // 1246: getfield pb.d I
      // 1249: isub
      // 124a: bipush 2
      // 124b: idiv
      // 124c: iadd
      // 124d: iload 3
      // 124e: invokevirtual pb.b (II)V
      // 1251: getstatic qb.S Lpb;
      // 1254: aload 1
      // 1255: invokevirtual pb.b (Ljavax/microedition/lcdui/Graphics;)V
      // 1258: aload 0
      // 1259: getfield fb.w I
      // 125c: bipush 1
      // 125d: if_icmpeq 1268
      // 1260: aload 0
      // 1261: getfield fb.w I
      // 1264: bipush 2
      // 1265: if_icmpne 12a2
      // 1268: aload 0
      // 1269: getfield fb.A Z
      // 126c: ifeq 1559
      // 126f: getstatic fb.Cd Lpb;
      // 1272: aload 0
      // 1273: getfield fb.w I
      // 1276: bipush 1
      // 1277: isub
      // 1278: putfield pb.b I
      // 127b: getstatic fb.Cd Lpb;
      // 127e: iload 2
      // 127f: bipush 30
      // 1281: getstatic fb.Cd Lpb;
      // 1284: getfield pb.d I
      // 1287: isub
      // 1288: bipush 2
      // 1289: idiv
      // 128a: iadd
      // 128b: iload 3
      // 128c: getstatic fb.Cd Lpb;
      // 128f: getfield pb.e I
      // 1292: isub
      // 1293: invokevirtual pb.b (II)V
      // 1296: getstatic fb.Cd Lpb;
      // 1299: aload 1
      // 129a: invokevirtual pb.b (Ljavax/microedition/lcdui/Graphics;)V
      // 129d: iload 8
      // 129f: ifeq 1559
      // 12a2: aload 0
      // 12a3: getfield fb.w I
      // 12a6: bipush 3
      // 12a7: if_icmpne 1559
      // 12aa: aload 0
      // 12ab: getfield fb.x B
      // 12ae: getstatic fb.Pd Lq;
      // 12b1: getfield q.g B
      // 12b4: if_icmpne 1559
      // 12b7: aload 0
      // 12b8: getfield fb.y B
      // 12bb: getstatic fb.Pd Lq;
      // 12be: getfield q.h B
      // 12c1: if_icmpne 1559
      // 12c4: getstatic fb.Cd Lpb;
      // 12c7: bipush 2
      // 12c8: putfield pb.b I
      // 12cb: getstatic fb.Cd Lpb;
      // 12ce: iload 2
      // 12cf: bipush 30
      // 12d1: getstatic fb.Cd Lpb;
      // 12d4: getfield pb.d I
      // 12d7: isub
      // 12d8: bipush 2
      // 12d9: idiv
      // 12da: iadd
      // 12db: iload 3
      // 12dc: getstatic fb.Cd Lpb;
      // 12df: getfield pb.e I
      // 12e2: isub
      // 12e3: invokevirtual pb.b (II)V
      // 12e6: getstatic fb.Cd Lpb;
      // 12e9: aload 1
      // 12ea: invokevirtual pb.b (Ljavax/microedition/lcdui/Graphics;)V
      // 12ed: iload 8
      // 12ef: ifeq 1559
      // 12f2: getstatic fb.kb J
      // 12f5: ldc2_w 8
      // 12f8: lrem
      // 12f9: l2i
      // 12fa: dup
      // 12fb: istore 6
      // 12fd: bipush 4
      // 12fe: if_icmple 1308
      // 1301: bipush 8
      // 1303: iload 6
      // 1305: isub
      // 1306: istore 6
      // 1308: iload 6
      // 130a: bipush -3
      // 130c: iadd
      // 130d: istore 5
      // 130f: iload 2
      // 1310: getstatic fb.Ge I
      // 1313: ineg
      // 1314: bipush 15
      // 1316: iadd
      // 1317: iadd
      // 1318: istore 2
      // 1319: iload 3
      // 131a: getstatic fb.He I
      // 131d: ineg
      // 131e: bipush 15
      // 1320: iadd
      // 1321: iadd
      // 1322: istore 3
      // 1323: bipush 0
      // 1324: istore 4
      // 1326: iload 2
      // 1327: ifge 13db
      // 132a: getstatic qb.S Lpb;
      // 132d: getfield pb.d I
      // 1330: bipush 7
      // 1332: isub
      // 1333: istore 7
      // 1335: iload 3
      // 1336: ifge 1365
      // 1339: getstatic qb.S Lpb;
      // 133c: bipush 10
      // 133e: putfield pb.b I
      // 1341: getstatic qb.S Lpb;
      // 1344: bipush 0
      // 1345: putfield pb.c I
      // 1348: getstatic qb.S Lpb;
      // 134b: iload 5
      // 134d: iload 5
      // 134f: invokevirtual pb.b (II)V
      // 1352: getstatic qb.S Lpb;
      // 1355: getfield pb.e I
      // 1358: bipush 15
      // 135a: isub
      // 135b: istore 4
      // 135d: iinc 7 -3
      // 1360: iload 8
      // 1362: ifeq 1538
      // 1365: iload 3
      // 1366: getstatic ab.E I
      // 1369: if_icmple 13a5
      // 136c: getstatic qb.S Lpb;
      // 136f: bipush 10
      // 1371: putfield pb.b I
      // 1374: getstatic qb.S Lpb;
      // 1377: bipush 6
      // 1379: putfield pb.c I
      // 137c: getstatic qb.S Lpb;
      // 137f: iload 5
      // 1381: getstatic ab.E I
      // 1384: getstatic qb.S Lpb;
      // 1387: getfield pb.e I
      // 138a: isub
      // 138b: iload 5
      // 138d: isub
      // 138e: invokevirtual pb.b (II)V
      // 1391: getstatic fb.Ed Ljavax/microedition/lcdui/Image;
      // 1394: invokevirtual javax/microedition/lcdui/Image.getHeight ()I
      // 1397: ineg
      // 1398: bipush 8
      // 139a: iadd
      // 139b: istore 4
      // 139d: iinc 7 -8
      // 13a0: iload 8
      // 13a2: ifeq 1538
      // 13a5: getstatic qb.S Lpb;
      // 13a8: bipush 0
      // 13a9: putfield pb.b I
      // 13ac: getstatic qb.S Lpb;
      // 13af: bipush 5
      // 13b0: putfield pb.c I
      // 13b3: getstatic qb.S Lpb;
      // 13b6: iload 5
      // 13b8: iload 3
      // 13b9: getstatic qb.S Lpb;
      // 13bc: getfield pb.e I
      // 13bf: bipush 2
      // 13c0: idiv
      // 13c1: isub
      // 13c2: invokevirtual pb.b (II)V
      // 13c5: getstatic qb.S Lpb;
      // 13c8: getfield pb.e I
      // 13cb: getstatic fb.Ed Ljavax/microedition/lcdui/Image;
      // 13ce: invokevirtual javax/microedition/lcdui/Image.getHeight ()I
      // 13d1: isub
      // 13d2: bipush 2
      // 13d3: idiv
      // 13d4: istore 4
      // 13d6: iload 8
      // 13d8: ifeq 1538
      // 13db: iload 2
      // 13dc: getstatic ab.D I
      // 13df: if_icmple 14b5
      // 13e2: getstatic fb.Ed Ljavax/microedition/lcdui/Image;
      // 13e5: invokevirtual javax/microedition/lcdui/Image.getWidth ()I
      // 13e8: ineg
      // 13e9: bipush 7
      // 13eb: iadd
      // 13ec: istore 7
      // 13ee: iload 3
      // 13ef: ifge 1429
      // 13f2: getstatic qb.S Lpb;
      // 13f5: bipush 10
      // 13f7: putfield pb.b I
      // 13fa: getstatic qb.S Lpb;
      // 13fd: bipush 5
      // 13fe: putfield pb.c I
      // 1401: getstatic qb.S Lpb;
      // 1404: getstatic ab.D I
      // 1407: getstatic qb.S Lpb;
      // 140a: getfield pb.d I
      // 140d: isub
      // 140e: iload 5
      // 1410: isub
      // 1411: iload 5
      // 1413: invokevirtual pb.b (II)V
      // 1416: getstatic qb.S Lpb;
      // 1419: getfield pb.e I
      // 141c: bipush 10
      // 141e: isub
      // 141f: istore 4
      // 1421: iinc 7 8
      // 1424: iload 8
      // 1426: ifeq 1538
      // 1429: iload 3
      // 142a: getstatic ab.E I
      // 142d: if_icmple 1473
      // 1430: getstatic qb.S Lpb;
      // 1433: bipush 10
      // 1435: putfield pb.b I
      // 1438: getstatic qb.S Lpb;
      // 143b: bipush 3
      // 143c: putfield pb.c I
      // 143f: getstatic qb.S Lpb;
      // 1442: getstatic ab.D I
      // 1445: getstatic qb.S Lpb;
      // 1448: getfield pb.d I
      // 144b: isub
      // 144c: iload 5
      // 144e: isub
      // 144f: getstatic ab.E I
      // 1452: getstatic qb.S Lpb;
      // 1455: getfield pb.e I
      // 1458: isub
      // 1459: iload 5
      // 145b: isub
      // 145c: invokevirtual pb.b (II)V
      // 145f: getstatic fb.Ed Ljavax/microedition/lcdui/Image;
      // 1462: invokevirtual javax/microedition/lcdui/Image.getHeight ()I
      // 1465: ineg
      // 1466: bipush 11
      // 1468: iadd
      // 1469: istore 4
      // 146b: iinc 7 4
      // 146e: iload 8
      // 1470: ifeq 1538
      // 1473: getstatic qb.S Lpb;
      // 1476: bipush 0
      // 1477: putfield pb.b I
      // 147a: getstatic qb.S Lpb;
      // 147d: bipush 6
      // 147f: putfield pb.c I
      // 1482: getstatic qb.S Lpb;
      // 1485: getstatic ab.D I
      // 1488: getstatic qb.S Lpb;
      // 148b: getfield pb.d I
      // 148e: isub
      // 148f: iload 5
      // 1491: isub
      // 1492: iload 3
      // 1493: getstatic qb.S Lpb;
      // 1496: getfield pb.e I
      // 1499: bipush 2
      // 149a: idiv
      // 149b: isub
      // 149c: invokevirtual pb.b (II)V
      // 149f: getstatic qb.S Lpb;
      // 14a2: getfield pb.e I
      // 14a5: getstatic fb.Ed Ljavax/microedition/lcdui/Image;
      // 14a8: invokevirtual javax/microedition/lcdui/Image.getHeight ()I
      // 14ab: isub
      // 14ac: bipush 2
      // 14ad: idiv
      // 14ae: istore 4
      // 14b0: iload 8
      // 14b2: ifeq 1538
      // 14b5: getstatic qb.S Lpb;
      // 14b8: getfield pb.d I
      // 14bb: getstatic fb.Ed Ljavax/microedition/lcdui/Image;
      // 14be: invokevirtual javax/microedition/lcdui/Image.getWidth ()I
      // 14c1: isub
      // 14c2: bipush 2
      // 14c3: idiv
      // 14c4: istore 7
      // 14c6: iload 3
      // 14c7: ifge 14fa
      // 14ca: getstatic qb.S Lpb;
      // 14cd: bipush 0
      // 14ce: putfield pb.b I
      // 14d1: getstatic qb.S Lpb;
      // 14d4: bipush 3
      // 14d5: putfield pb.c I
      // 14d8: getstatic qb.S Lpb;
      // 14db: iload 2
      // 14dc: getstatic qb.S Lpb;
      // 14df: getfield pb.d I
      // 14e2: bipush 2
      // 14e3: idiv
      // 14e4: isub
      // 14e5: iload 5
      // 14e7: invokevirtual pb.b (II)V
      // 14ea: getstatic qb.S Lpb;
      // 14ed: getfield pb.e I
      // 14f0: bipush 7
      // 14f2: isub
      // 14f3: istore 4
      // 14f5: iload 8
      // 14f7: ifeq 1538
      // 14fa: iload 3
      // 14fb: getstatic ab.E I
      // 14fe: if_icmple 1538
      // 1501: getstatic qb.S Lpb;
      // 1504: bipush 0
      // 1505: putfield pb.b I
      // 1508: getstatic qb.S Lpb;
      // 150b: bipush 0
      // 150c: putfield pb.c I
      // 150f: getstatic qb.S Lpb;
      // 1512: iload 2
      // 1513: getstatic qb.S Lpb;
      // 1516: getfield pb.d I
      // 1519: bipush 2
      // 151a: idiv
      // 151b: isub
      // 151c: getstatic ab.E I
      // 151f: getstatic qb.S Lpb;
      // 1522: getfield pb.e I
      // 1525: isub
      // 1526: iload 5
      // 1528: isub
      // 1529: invokevirtual pb.b (II)V
      // 152c: getstatic fb.Ed Ljavax/microedition/lcdui/Image;
      // 152f: invokevirtual javax/microedition/lcdui/Image.getHeight ()I
      // 1532: ineg
      // 1533: bipush 7
      // 1535: iadd
      // 1536: istore 4
      // 1538: getstatic qb.S Lpb;
      // 153b: aload 1
      // 153c: invokevirtual pb.b (Ljavax/microedition/lcdui/Graphics;)V
      // 153f: aload 1
      // 1540: getstatic fb.Ed Ljavax/microedition/lcdui/Image;
      // 1543: iload 7
      // 1545: getstatic qb.S Lpb;
      // 1548: getfield pb.f I
      // 154b: iadd
      // 154c: iload 4
      // 154e: getstatic qb.S Lpb;
      // 1551: getfield pb.g I
      // 1554: iadd
      // 1555: bipush 0
      // 1556: invokevirtual javax/microedition/lcdui/Graphics.drawImage (Ljavax/microedition/lcdui/Image;III)V
      // 1559: getstatic fb.Qd Ljava/util/Vector;
      // 155c: ifnull 17ea
      // 155f: bipush 0
      // 1560: istore 4
      // 1562: iload 4
      // 1564: bipush 4
      // 1565: if_icmpge 157e
      // 1568: aload 0
      // 1569: getfield fb.B [I
      // 156c: iload 4
      // 156e: bipush -3
      // 1570: iastore
      // 1571: iinc 4 1
      // 1574: iload 8
      // 1576: ifne 1581
      // 1579: iload 8
      // 157b: ifeq 1562
      // 157e: bipush 0
      // 157f: istore 4
      // 1581: iload 4
      // 1583: getstatic fb.Qd Ljava/util/Vector;
      // 1586: invokevirtual java/util/Vector.size ()I
      // 1589: if_icmpge 17ea
      // 158c: getstatic fb.Qd Ljava/util/Vector;
      // 158f: iload 4
      // 1591: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 1594: checkcast q
      // 1597: dup
      // 1598: astore 5
      // 159a: getstatic fb.Pd Lq;
      // 159d: if_acmpeq 17e2
      // 15a0: aload 5
      // 15a2: getfield q.Bc Z
      // 15a5: ifeq 17e2
      // 15a8: aload 5
      // 15aa: getfield q.mb B
      // 15ad: ifne 17e2
      // 15b0: aload 5
      // 15b2: getfield q.g B
      // 15b5: ifle 17e2
      // 15b8: aload 5
      // 15ba: dup
      // 15bb: astore 7
      // 15bd: getfield o.c I
      // 15c0: bipush 10
      // 15c2: idiv
      // 15c3: getstatic fb.Ge I
      // 15c6: isub
      // 15c7: istore 2
      // 15c8: aload 5
      // 15ca: dup
      // 15cb: astore 7
      // 15cd: getfield o.d I
      // 15d0: bipush 10
      // 15d2: idiv
      // 15d3: getstatic fb.He I
      // 15d6: isub
      // 15d7: istore 3
      // 15d8: aload 5
      // 15da: getfield q.x B
      // 15dd: bipush -1
      // 15de: if_icmpne 15fd
      // 15e1: aload 5
      // 15e3: getstatic fb.Pd Lq;
      // 15e6: invokestatic y.b (Lq;Lq;)Z
      // 15e9: ifeq 15f4
      // 15ec: bipush 2
      // 15ed: istore 6
      // 15ef: iload 8
      // 15f1: ifeq 1604
      // 15f4: bipush 9
      // 15f6: istore 6
      // 15f8: iload 8
      // 15fa: ifeq 1604
      // 15fd: aload 5
      // 15ff: invokevirtual q.t ()I
      // 1602: istore 6
      // 1604: iload 2
      // 1605: ifge 16af
      // 1608: iload 3
      // 1609: ifge 1641
      // 160c: getstatic qb.S Lpb;
      // 160f: iload 6
      // 1611: bipush 9
      // 1613: iadd
      // 1614: bipush 1
      // 1615: iadd
      // 1616: putfield pb.b I
      // 1619: getstatic qb.S Lpb;
      // 161c: bipush 0
      // 161d: putfield pb.c I
      // 1620: getstatic qb.S Lpb;
      // 1623: aload 0
      // 1624: getfield fb.B [I
      // 1627: bipush 0
      // 1628: iaload
      // 1629: aload 0
      // 162a: getfield fb.B [I
      // 162d: bipush 0
      // 162e: iaload
      // 162f: invokevirtual pb.b (II)V
      // 1632: aload 0
      // 1633: getfield fb.B [I
      // 1636: bipush 0
      // 1637: dup2
      // 1638: iaload
      // 1639: bipush 3
      // 163a: iadd
      // 163b: iastore
      // 163c: iload 8
      // 163e: ifeq 17db
      // 1641: iload 3
      // 1642: getstatic ab.E I
      // 1645: if_icmple 1689
      // 1648: getstatic qb.S Lpb;
      // 164b: iload 6
      // 164d: bipush 9
      // 164f: iadd
      // 1650: bipush 1
      // 1651: iadd
      // 1652: putfield pb.b I
      // 1655: getstatic qb.S Lpb;
      // 1658: bipush 6
      // 165a: putfield pb.c I
      // 165d: getstatic qb.S Lpb;
      // 1660: aload 0
      // 1661: getfield fb.B [I
      // 1664: bipush 1
      // 1665: iaload
      // 1666: getstatic ab.E I
      // 1669: getstatic qb.S Lpb;
      // 166c: getfield pb.e I
      // 166f: isub
      // 1670: aload 0
      // 1671: getfield fb.B [I
      // 1674: bipush 1
      // 1675: iaload
      // 1676: isub
      // 1677: invokevirtual pb.b (II)V
      // 167a: aload 0
      // 167b: getfield fb.B [I
      // 167e: bipush 1
      // 167f: dup2
      // 1680: iaload
      // 1681: bipush 3
      // 1682: iadd
      // 1683: iastore
      // 1684: iload 8
      // 1686: ifeq 17db
      // 1689: getstatic qb.S Lpb;
      // 168c: iload 6
      // 168e: putfield pb.b I
      // 1691: getstatic qb.S Lpb;
      // 1694: bipush 5
      // 1695: putfield pb.c I
      // 1698: getstatic qb.S Lpb;
      // 169b: bipush -3
      // 169d: iload 3
      // 169e: getstatic qb.S Lpb;
      // 16a1: getfield pb.e I
      // 16a4: bipush 2
      // 16a5: idiv
      // 16a6: isub
      // 16a7: invokevirtual pb.b (II)V
      // 16aa: iload 8
      // 16ac: ifeq 17db
      // 16af: iload 2
      // 16b0: getstatic ab.D I
      // 16b3: if_icmple 177e
      // 16b6: iload 3
      // 16b7: ifge 16fa
      // 16ba: getstatic qb.S Lpb;
      // 16bd: iload 6
      // 16bf: bipush 9
      // 16c1: iadd
      // 16c2: bipush 1
      // 16c3: iadd
      // 16c4: putfield pb.b I
      // 16c7: getstatic qb.S Lpb;
      // 16ca: bipush 5
      // 16cb: putfield pb.c I
      // 16ce: getstatic qb.S Lpb;
      // 16d1: getstatic ab.D I
      // 16d4: getstatic qb.S Lpb;
      // 16d7: getfield pb.d I
      // 16da: isub
      // 16db: aload 0
      // 16dc: getfield fb.B [I
      // 16df: bipush 2
      // 16e0: iaload
      // 16e1: isub
      // 16e2: aload 0
      // 16e3: getfield fb.B [I
      // 16e6: bipush 2
      // 16e7: iaload
      // 16e8: invokevirtual pb.b (II)V
      // 16eb: aload 0
      // 16ec: getfield fb.B [I
      // 16ef: bipush 2
      // 16f0: dup2
      // 16f1: iaload
      // 16f2: bipush 3
      // 16f3: iadd
      // 16f4: iastore
      // 16f5: iload 8
      // 16f7: ifeq 17db
      // 16fa: iload 3
      // 16fb: getstatic ab.E I
      // 16fe: if_icmple 174c
      // 1701: getstatic qb.S Lpb;
      // 1704: iload 6
      // 1706: bipush 9
      // 1708: iadd
      // 1709: bipush 1
      // 170a: iadd
      // 170b: putfield pb.b I
      // 170e: getstatic qb.S Lpb;
      // 1711: bipush 3
      // 1712: putfield pb.c I
      // 1715: getstatic qb.S Lpb;
      // 1718: getstatic ab.D I
      // 171b: getstatic qb.S Lpb;
      // 171e: getfield pb.d I
      // 1721: isub
      // 1722: aload 0
      // 1723: getfield fb.B [I
      // 1726: bipush 3
      // 1727: iaload
      // 1728: isub
      // 1729: getstatic ab.E I
      // 172c: getstatic qb.S Lpb;
      // 172f: getfield pb.e I
      // 1732: isub
      // 1733: aload 0
      // 1734: getfield fb.B [I
      // 1737: bipush 3
      // 1738: iaload
      // 1739: isub
      // 173a: invokevirtual pb.b (II)V
      // 173d: aload 0
      // 173e: getfield fb.B [I
      // 1741: bipush 3
      // 1742: dup2
      // 1743: iaload
      // 1744: bipush 3
      // 1745: iadd
      // 1746: iastore
      // 1747: iload 8
      // 1749: ifeq 17db
      // 174c: getstatic qb.S Lpb;
      // 174f: iload 6
      // 1751: putfield pb.b I
      // 1754: getstatic qb.S Lpb;
      // 1757: bipush 6
      // 1759: putfield pb.c I
      // 175c: getstatic qb.S Lpb;
      // 175f: getstatic ab.D I
      // 1762: getstatic qb.S Lpb;
      // 1765: getfield pb.d I
      // 1768: isub
      // 1769: bipush -3
      // 176b: isub
      // 176c: iload 3
      // 176d: getstatic qb.S Lpb;
      // 1770: getfield pb.e I
      // 1773: bipush 2
      // 1774: idiv
      // 1775: isub
      // 1776: invokevirtual pb.b (II)V
      // 1779: iload 8
      // 177b: ifeq 17db
      // 177e: iload 3
      // 177f: ifge 17a8
      // 1782: getstatic qb.S Lpb;
      // 1785: iload 6
      // 1787: putfield pb.b I
      // 178a: getstatic qb.S Lpb;
      // 178d: bipush 3
      // 178e: putfield pb.c I
      // 1791: getstatic qb.S Lpb;
      // 1794: iload 2
      // 1795: getstatic qb.S Lpb;
      // 1798: getfield pb.d I
      // 179b: bipush 2
      // 179c: idiv
      // 179d: isub
      // 179e: bipush -3
      // 17a0: invokevirtual pb.b (II)V
      // 17a3: iload 8
      // 17a5: ifeq 17db
      // 17a8: iload 3
      // 17a9: getstatic ab.E I
      // 17ac: if_icmple 17e2
      // 17af: getstatic qb.S Lpb;
      // 17b2: iload 6
      // 17b4: putfield pb.b I
      // 17b7: getstatic qb.S Lpb;
      // 17ba: bipush 0
      // 17bb: putfield pb.c I
      // 17be: getstatic qb.S Lpb;
      // 17c1: iload 2
      // 17c2: getstatic qb.S Lpb;
      // 17c5: getfield pb.d I
      // 17c8: bipush 2
      // 17c9: idiv
      // 17ca: isub
      // 17cb: getstatic ab.E I
      // 17ce: getstatic qb.S Lpb;
      // 17d1: getfield pb.e I
      // 17d4: isub
      // 17d5: bipush -3
      // 17d7: isub
      // 17d8: invokevirtual pb.b (II)V
      // 17db: getstatic qb.S Lpb;
      // 17de: aload 1
      // 17df: invokevirtual pb.b (Ljavax/microedition/lcdui/Graphics;)V
      // 17e2: iinc 4 1
      // 17e5: iload 8
      // 17e7: ifeq 1581
      // 17ea: invokestatic fb.j ()B
      // 17ed: bipush 2
      // 17ee: if_icmpne 199a
      // 17f1: getstatic qb.S Lpb;
      // 17f4: bipush 0
      // 17f5: putfield pb.c I
      // 17f8: bipush 0
      // 17f9: istore 4
      // 17fb: iload 4
      // 17fd: bipush 2
      // 17fe: if_icmpge 199a
      // 1801: iload 4
      // 1803: iload 8
      // 1805: ifne 19af
      // 1808: ifne 1815
      // 180b: getstatic fb.ib Ls;
      // 180e: astore 6
      // 1810: iload 8
      // 1812: ifeq 181a
      // 1815: getstatic fb.jb Ls;
      // 1818: astore 6
      // 181a: aload 6
      // 181c: ifnull 1992
      // 181f: getstatic qb.S Lpb;
      // 1822: iload 4
      // 1824: bipush 20
      // 1826: iadd
      // 1827: putfield pb.b I
      // 182a: aload 6
      // 182c: dup
      // 182d: astore 7
      // 182f: getfield o.c I
      // 1832: bipush 10
      // 1834: idiv
      // 1835: getstatic fb.Ge I
      // 1838: isub
      // 1839: istore 2
      // 183a: aload 6
      // 183c: dup
      // 183d: astore 7
      // 183f: getfield o.d I
      // 1842: bipush 10
      // 1844: idiv
      // 1845: getstatic fb.He I
      // 1848: isub
      // 1849: istore 3
      // 184a: iload 2
      // 184b: ifge 18bc
      // 184e: iload 3
      // 184f: ifge 1873
      // 1852: getstatic qb.S Lpb;
      // 1855: aload 0
      // 1856: getfield fb.B [I
      // 1859: bipush 0
      // 185a: iaload
      // 185b: aload 0
      // 185c: getfield fb.B [I
      // 185f: bipush 0
      // 1860: iaload
      // 1861: invokevirtual pb.b (II)V
      // 1864: aload 0
      // 1865: getfield fb.B [I
      // 1868: bipush 0
      // 1869: dup2
      // 186a: iaload
      // 186b: bipush 3
      // 186c: iadd
      // 186d: iastore
      // 186e: iload 8
      // 1870: ifeq 198b
      // 1873: iload 3
      // 1874: getstatic ab.E I
      // 1877: if_icmple 18a6
      // 187a: getstatic qb.S Lpb;
      // 187d: aload 0
      // 187e: getfield fb.B [I
      // 1881: bipush 1
      // 1882: iaload
      // 1883: getstatic ab.E I
      // 1886: getstatic qb.S Lpb;
      // 1889: getfield pb.e I
      // 188c: isub
      // 188d: aload 0
      // 188e: getfield fb.B [I
      // 1891: bipush 1
      // 1892: iaload
      // 1893: isub
      // 1894: invokevirtual pb.b (II)V
      // 1897: aload 0
      // 1898: getfield fb.B [I
      // 189b: bipush 1
      // 189c: dup2
      // 189d: iaload
      // 189e: bipush 3
      // 189f: iadd
      // 18a0: iastore
      // 18a1: iload 8
      // 18a3: ifeq 198b
      // 18a6: getstatic qb.S Lpb;
      // 18a9: bipush 0
      // 18aa: iload 3
      // 18ab: getstatic qb.S Lpb;
      // 18ae: getfield pb.e I
      // 18b1: bipush 2
      // 18b2: idiv
      // 18b3: isub
      // 18b4: invokevirtual pb.b (II)V
      // 18b7: iload 8
      // 18b9: ifeq 198b
      // 18bc: iload 2
      // 18bd: getstatic ab.D I
      // 18c0: if_icmple 1950
      // 18c3: iload 3
      // 18c4: ifge 18f3
      // 18c7: getstatic qb.S Lpb;
      // 18ca: getstatic ab.D I
      // 18cd: getstatic qb.S Lpb;
      // 18d0: getfield pb.d I
      // 18d3: isub
      // 18d4: aload 0
      // 18d5: getfield fb.B [I
      // 18d8: bipush 2
      // 18d9: iaload
      // 18da: isub
      // 18db: aload 0
      // 18dc: getfield fb.B [I
      // 18df: bipush 2
      // 18e0: iaload
      // 18e1: invokevirtual pb.b (II)V
      // 18e4: aload 0
      // 18e5: getfield fb.B [I
      // 18e8: bipush 2
      // 18e9: dup2
      // 18ea: iaload
      // 18eb: bipush 3
      // 18ec: iadd
      // 18ed: iastore
      // 18ee: iload 8
      // 18f0: ifeq 198b
      // 18f3: iload 3
      // 18f4: getstatic ab.E I
      // 18f7: if_icmple 1931
      // 18fa: getstatic qb.S Lpb;
      // 18fd: getstatic ab.D I
      // 1900: getstatic qb.S Lpb;
      // 1903: getfield pb.d I
      // 1906: isub
      // 1907: aload 0
      // 1908: getfield fb.B [I
      // 190b: bipush 3
      // 190c: iaload
      // 190d: isub
      // 190e: getstatic ab.E I
      // 1911: getstatic qb.S Lpb;
      // 1914: getfield pb.e I
      // 1917: isub
      // 1918: aload 0
      // 1919: getfield fb.B [I
      // 191c: bipush 3
      // 191d: iaload
      // 191e: isub
      // 191f: invokevirtual pb.b (II)V
      // 1922: aload 0
      // 1923: getfield fb.B [I
      // 1926: bipush 3
      // 1927: dup2
      // 1928: iaload
      // 1929: bipush 3
      // 192a: iadd
      // 192b: iastore
      // 192c: iload 8
      // 192e: ifeq 198b
      // 1931: getstatic qb.S Lpb;
      // 1934: getstatic ab.D I
      // 1937: getstatic qb.S Lpb;
      // 193a: getfield pb.d I
      // 193d: isub
      // 193e: iload 3
      // 193f: getstatic qb.S Lpb;
      // 1942: getfield pb.e I
      // 1945: bipush 2
      // 1946: idiv
      // 1947: isub
      // 1948: invokevirtual pb.b (II)V
      // 194b: iload 8
      // 194d: ifeq 198b
      // 1950: iload 3
      // 1951: ifge 196a
      // 1954: getstatic qb.S Lpb;
      // 1957: iload 2
      // 1958: getstatic qb.S Lpb;
      // 195b: getfield pb.d I
      // 195e: bipush 2
      // 195f: idiv
      // 1960: isub
      // 1961: bipush 0
      // 1962: invokevirtual pb.b (II)V
      // 1965: iload 8
      // 1967: ifeq 198b
      // 196a: iload 3
      // 196b: getstatic ab.E I
      // 196e: if_icmple 1992
      // 1971: getstatic qb.S Lpb;
      // 1974: iload 2
      // 1975: getstatic qb.S Lpb;
      // 1978: getfield pb.d I
      // 197b: bipush 2
      // 197c: idiv
      // 197d: isub
      // 197e: getstatic ab.E I
      // 1981: getstatic qb.S Lpb;
      // 1984: getfield pb.e I
      // 1987: isub
      // 1988: invokevirtual pb.b (II)V
      // 198b: getstatic qb.S Lpb;
      // 198e: aload 1
      // 198f: invokevirtual pb.b (Ljavax/microedition/lcdui/Graphics;)V
      // 1992: iinc 4 1
      // 1995: iload 8
      // 1997: ifeq 17fb
      // 199a: aload 0
      // 199b: getfield fb.Q Lh;
      // 199e: ifnull 19a9
      // 19a1: aload 0
      // 19a2: getfield fb.Q Lh;
      // 19a5: aload 1
      // 19a6: invokevirtual h.b (Ljavax/microedition/lcdui/Graphics;)V
      // 19a9: getstatic ab.E I
      // 19ac: bipush 20
      // 19ae: isub
      // 19af: istore 6
      // 19b1: aload 0
      // 19b2: getfield fb.c Z
      // 19b5: ifeq 19fa
      // 19b8: getstatic qb.b Lpb;
      // 19bb: bipush 0
      // 19bc: putfield pb.b I
      // 19bf: getstatic qb.b Lpb;
      // 19c2: bipush 0
      // 19c3: putfield pb.c I
      // 19c6: getstatic qb.b Lpb;
      // 19c9: getstatic ab.D I
      // 19cc: bipush 1
      // 19cd: isub
      // 19ce: getstatic qb.b Lpb;
      // 19d1: getfield pb.d I
      // 19d4: isub
      // 19d5: getstatic ab.E I
      // 19d8: getstatic qb.b Lpb;
      // 19db: getfield pb.e I
      // 19de: isub
      // 19df: bipush 1
      // 19e0: isub
      // 19e1: invokevirtual pb.b (II)V
      // 19e4: getstatic qb.b Lpb;
      // 19e7: aload 1
      // 19e8: invokevirtual pb.b (Ljavax/microedition/lcdui/Graphics;)V
      // 19eb: getstatic ab.E I
      // 19ee: getstatic qb.b Lpb;
      // 19f1: getfield pb.e I
      // 19f4: isub
      // 19f5: bipush 21
      // 19f7: isub
      // 19f8: istore 6
      // 19fa: getstatic fb.Pd Lq;
      // 19fd: getfield q.bc I
      // 1a00: bipush -1
      // 1a01: if_icmpeq 1a19
      // 1a04: getstatic ab.C Lb;
      // 1a07: aload 1
      // 1a08: aload 0
      // 1a09: getfield fb.D Ljava/lang/String;
      // 1a0c: getstatic ab.D I
      // 1a0f: bipush 1
      // 1a10: isub
      // 1a11: iload 6
      // 1a13: bipush -1
      // 1a14: bipush 1
      // 1a15: invokevirtual b.b (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;IIII)I
      // 1a18: pop
      // 1a19: getstatic ab.E I
      // 1a1c: bipush 20
      // 1a1e: isub
      // 1a1f: istore 6
      // 1a21: getstatic ab.C Lb;
      // 1a24: aload 1
      // 1a25: aload 0
      // 1a26: getfield fb.j Ljava/lang/String;
      // 1a29: bipush 1
      // 1a2a: iload 6
      // 1a2c: bipush -1
      // 1a2d: bipush 0
      // 1a2e: invokevirtual b.b (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;IIII)I
      // 1a31: pop
      // 1a32: getstatic ab.C Lb;
      // 1a35: aload 1
      // 1a36: new java/lang/StringBuffer
      // 1a39: dup
      // 1a3a: invokespecial java/lang/StringBuffer.<init> ()V
      // 1a3d: ldc "^43~"
      // 1a3f: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1a42: getstatic fb.Pd Lq;
      // 1a45: getfield q.dc [I
      // 1a48: bipush 5
      // 1a49: iaload
      // 1a4a: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 1a4d: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 1a50: bipush 1
      // 1a51: iload 6
      // 1a53: bipush 20
      // 1a55: isub
      // 1a56: bipush -1
      // 1a57: bipush 0
      // 1a58: invokevirtual b.b (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;IIII)I
      // 1a5b: pop
      // 1a5c: invokestatic fb.i ()Z
      // 1a5f: ifne 1a6e
      // 1a62: aload 0
      // 1a63: getfield fb.R Z
      // 1a66: ifeq 1a6e
      // 1a69: aload 0
      // 1a6a: aload 1
      // 1a6b: invokespecial fb.a (Ljavax/microedition/lcdui/Graphics;)V
      // 1a6e: invokestatic fb.i ()Z
      // 1a71: ifeq 1ac4
      // 1a74: getstatic fb.ef Z
      // 1a77: ifeq 1ac4
      // 1a7a: getstatic fb.g I
      // 1a7d: getstatic q.W I
      // 1a80: isub
      // 1a81: ifeq 1ac4
      // 1a84: new java/lang/StringBuffer
      // 1a87: dup
      // 1a88: invokespecial java/lang/StringBuffer.<init> ()V
      // 1a8b: bipush -1
      // 1a8c: invokestatic hb.b (I)Ljava/lang/String;
      // 1a8f: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1a92: ldc ""
      // 1a94: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1a97: getstatic fb.g I
      // 1a9a: getstatic q.W I
      // 1a9d: isub
      // 1a9e: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 1aa1: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 1aa4: astore 7
      // 1aa6: getstatic ab.C Lb;
      // 1aa9: aload 1
      // 1aaa: aload 7
      // 1aac: getstatic ab.D I
      // 1aaf: aload 7
      // 1ab1: invokevirtual java/lang/String.length ()I
      // 1ab4: getstatic ab.C Lb;
      // 1ab7: getfield b.x I
      // 1aba: imul
      // 1abb: isub
      // 1abc: bipush 12
      // 1abe: bipush -1
      // 1abf: bipush 2
      // 1ac0: invokevirtual b.b (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;IIII)I
      // 1ac3: pop
      // 1ac4: getstatic rc.e Z
      // 1ac7: ifeq 1af7
      // 1aca: getstatic fb.Pd Lq;
      // 1acd: invokevirtual q.q ()Z
      // 1ad0: ifeq 1af7
      // 1ad3: getstatic rc.k Z
      // 1ad6: ifne 1add
      // 1ad9: bipush 4
      // 1ada: goto 1ade
      // 1add: bipush 0
      // 1ade: putstatic rc.j I
      // 1ae1: getstatic fb.kb J
      // 1ae4: ldc2_w 50
      // 1ae7: ladd
      // 1ae8: putstatic rc.f J
      // 1aeb: bipush 0
      // 1aec: putstatic rc.g Z
      // 1aef: bipush 0
      // 1af0: putstatic rc.i I
      // 1af3: bipush 2
      // 1af4: putstatic rc.h I
      // 1af7: getstatic rc.e Z
      // 1afa: ifeq 1ba8
      // 1afd: getstatic rc.f J
      // 1b00: lconst_0
      // 1b01: lcmp
      // 1b02: ifeq 1ba8
      // 1b05: getstatic fb.kb J
      // 1b08: getstatic rc.f J
      // 1b0b: lcmp
      // 1b0c: ifgt 1ba8
      // 1b0f: bipush 1
      // 1b10: putstatic rc.g Z
      // 1b13: getstatic fb.kb J
      // 1b16: getstatic rc.f J
      // 1b19: getstatic rc.h I
      // 1b1c: i2l
      // 1b1d: lsub
      // 1b1e: lcmp
      // 1b1f: iflt 1b2e
      // 1b22: bipush 5
      // 1b23: putstatic rc.i I
      // 1b26: getstatic rc.h I
      // 1b29: bipush 1
      // 1b2a: isub
      // 1b2b: putstatic rc.h I
      // 1b2e: bipush 3
      // 1b2f: istore 4
      // 1b31: iload 4
      // 1b33: iflt 1ba8
      // 1b36: getstatic rc.k Z
      // 1b39: iload 8
      // 1b3b: ifne 1bab
      // 1b3e: ifne 1b54
      // 1b41: bipush 3
      // 1b42: iload 4
      // 1b44: isub
      // 1b45: ifne 1b54
      // 1b48: getstatic rc.i I
      // 1b4b: bipush 4
      // 1b4c: iadd
      // 1b4d: istore 7
      // 1b4f: iload 8
      // 1b51: ifeq 1b5e
      // 1b54: getstatic rc.i I
      // 1b57: bipush 3
      // 1b58: iadd
      // 1b59: iload 4
      // 1b5b: isub
      // 1b5c: istore 7
      // 1b5e: invokestatic fb.i ()Z
      // 1b61: ifeq 1b6c
      // 1b64: bipush 3
      // 1b65: iload 4
      // 1b67: isub
      // 1b68: bipush 1
      // 1b69: if_icmpeq 1ba0
      // 1b6c: getstatic rc.j I
      // 1b6f: bipush -1
      // 1b70: if_icmpeq 1b7f
      // 1b73: getstatic rc.j I
      // 1b76: iload 7
      // 1b78: getstatic rc.i I
      // 1b7b: isub
      // 1b7c: if_icmpne 1ba0
      // 1b7f: getstatic fb.Fd Lpb;
      // 1b82: iload 7
      // 1b84: putfield pb.b I
      // 1b87: getstatic fb.Fd Lpb;
      // 1b8a: getstatic fb.Gd [I
      // 1b8d: iload 7
      // 1b8f: iaload
      // 1b90: getstatic fb.Hd [I
      // 1b93: iload 7
      // 1b95: iaload
      // 1b96: invokevirtual pb.b (II)V
      // 1b99: getstatic fb.Fd Lpb;
      // 1b9c: aload 1
      // 1b9d: invokevirtual pb.b (Ljavax/microedition/lcdui/Graphics;)V
      // 1ba0: iinc 4 -1
      // 1ba3: iload 8
      // 1ba5: ifeq 1b31
      // 1ba8: invokestatic fb.j ()B
      // 1bab: bipush 2
      // 1bac: if_icmpne 1c4c
      // 1baf: aload 0
      // 1bb0: getfield fb.R Z
      // 1bb3: ifne 1c4c
      // 1bb6: bipush 0
      // 1bb7: invokestatic fb.c (B)Z
      // 1bba: ifeq 1bc6
      // 1bbd: ldc "^17~"
      // 1bbf: astore 7
      // 1bc1: iload 8
      // 1bc3: ifeq 1bca
      // 1bc6: ldc "^16~"
      // 1bc8: astore 7
      // 1bca: new java/lang/StringBuffer
      // 1bcd: dup
      // 1bce: invokespecial java/lang/StringBuffer.<init> ()V
      // 1bd1: aload 7
      // 1bd3: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1bd6: getstatic ab.C Lb;
      // 1bd9: getfield b.d Ljava/lang/String;
      // 1bdc: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1bdf: ldc "~ "
      // 1be1: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1be4: aload 0
      // 1be5: getfield fb.hb [I
      // 1be8: bipush 0
      // 1be9: iaload
      // 1bea: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 1bed: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 1bf0: astore 7
      // 1bf2: getstatic ab.C Lb;
      // 1bf5: aload 1
      // 1bf6: aload 7
      // 1bf8: bipush 1
      // 1bf9: bipush 30
      // 1bfb: bipush -1
      // 1bfc: bipush 0
      // 1bfd: invokevirtual b.b (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;IIII)I
      // 1c00: pop
      // 1c01: bipush 1
      // 1c02: invokestatic fb.c (B)Z
      // 1c05: ifeq 1c11
      // 1c08: ldc "^19~"
      // 1c0a: astore 7
      // 1c0c: iload 8
      // 1c0e: ifeq 1c15
      // 1c11: ldc "^18~"
      // 1c13: astore 7
      // 1c15: new java/lang/StringBuffer
      // 1c18: dup
      // 1c19: invokespecial java/lang/StringBuffer.<init> ()V
      // 1c1c: aload 7
      // 1c1e: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1c21: getstatic ab.C Lb;
      // 1c24: getfield b.d Ljava/lang/String;
      // 1c27: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1c2a: ldc "~ "
      // 1c2c: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1c2f: aload 0
      // 1c30: getfield fb.hb [I
      // 1c33: bipush 1
      // 1c34: iaload
      // 1c35: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 1c38: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 1c3b: astore 7
      // 1c3d: getstatic ab.C Lb;
      // 1c40: aload 1
      // 1c41: aload 7
      // 1c43: bipush 1
      // 1c44: bipush 50
      // 1c46: bipush -1
      // 1c47: bipush 0
      // 1c48: invokevirtual b.b (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;IIII)I
      // 1c4b: pop
      // 1c4c: invokestatic fb.i ()Z
      // 1c4f: ifne 1dea
      // 1c52: aload 0
      // 1c53: getfield fb.R Z
      // 1c56: ifne 1dea
      // 1c59: new java/lang/StringBuffer
      // 1c5c: dup
      // 1c5d: invokespecial java/lang/StringBuffer.<init> ()V
      // 1c60: ldc "^9~"
      // 1c62: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1c65: getstatic ab.C Lb;
      // 1c68: getfield b.d Ljava/lang/String;
      // 1c6b: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1c6e: ldc "~ "
      // 1c70: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1c73: getstatic fb.Pd Lq;
      // 1c76: getfield q.A I
      // 1c79: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 1c7c: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 1c7f: astore 7
      // 1c81: getstatic ab.C Lb;
      // 1c84: new java/lang/StringBuffer
      // 1c87: dup
      // 1c88: invokespecial java/lang/StringBuffer.<init> ()V
      // 1c8b: ldc "^9~~ "
      // 1c8d: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1c90: getstatic fb.Pd Lq;
      // 1c93: getfield q.A I
      // 1c96: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 1c99: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 1c9c: invokevirtual b.b (Ljava/lang/String;)I
      // 1c9f: bipush 1
      // 1ca0: iadd
      // 1ca1: dup
      // 1ca2: istore 4
      // 1ca4: getstatic ab.C Lb;
      // 1ca7: new java/lang/StringBuffer
      // 1caa: dup
      // 1cab: invokespecial java/lang/StringBuffer.<init> ()V
      // 1cae: ldc "^39~~ "
      // 1cb0: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1cb3: getstatic fb.Pd Lq;
      // 1cb6: getfield q.X I
      // 1cb9: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 1cbc: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 1cbf: invokevirtual b.b (Ljava/lang/String;)I
      // 1cc2: bipush 1
      // 1cc3: iadd
      // 1cc4: if_icmple 1ccc
      // 1cc7: iload 4
      // 1cc9: goto 1cec
      // 1ccc: getstatic ab.C Lb;
      // 1ccf: new java/lang/StringBuffer
      // 1cd2: dup
      // 1cd3: invokespecial java/lang/StringBuffer.<init> ()V
      // 1cd6: ldc "^9~~ "
      // 1cd8: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1cdb: getstatic fb.Pd Lq;
      // 1cde: getfield q.X I
      // 1ce1: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 1ce4: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 1ce7: invokevirtual b.b (Ljava/lang/String;)I
      // 1cea: bipush 1
      // 1ceb: iadd
      // 1cec: istore 4
      // 1cee: invokestatic ab.g ()Z
      // 1cf1: ifeq 1d4a
      // 1cf4: iload 4
      // 1cf6: getstatic ab.C Lb;
      // 1cf9: new java/lang/StringBuffer
      // 1cfc: dup
      // 1cfd: invokespecial java/lang/StringBuffer.<init> ()V
      // 1d00: ldc "^20~~ "
      // 1d02: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1d05: aload 0
      // 1d06: getfield fb.hb [I
      // 1d09: getstatic fb.Pd Lq;
      // 1d0c: getfield q.x B
      // 1d0f: iaload
      // 1d10: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 1d13: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 1d16: invokevirtual b.b (Ljava/lang/String;)I
      // 1d19: bipush 1
      // 1d1a: iadd
      // 1d1b: if_icmple 1d23
      // 1d1e: iload 4
      // 1d20: goto 1d48
      // 1d23: getstatic ab.C Lb;
      // 1d26: new java/lang/StringBuffer
      // 1d29: dup
      // 1d2a: invokespecial java/lang/StringBuffer.<init> ()V
      // 1d2d: ldc "^20~~ "
      // 1d2f: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1d32: aload 0
      // 1d33: getfield fb.hb [I
      // 1d36: getstatic fb.Pd Lq;
      // 1d39: getfield q.x B
      // 1d3c: iaload
      // 1d3d: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 1d40: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 1d43: invokevirtual b.b (Ljava/lang/String;)I
      // 1d46: bipush 1
      // 1d47: iadd
      // 1d48: istore 4
      // 1d4a: getstatic ab.C Lb;
      // 1d4d: aload 1
      // 1d4e: aload 7
      // 1d50: getstatic ab.D I
      // 1d53: iload 4
      // 1d55: isub
      // 1d56: bipush 30
      // 1d58: bipush -1
      // 1d59: bipush 0
      // 1d5a: invokevirtual b.b (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;IIII)I
      // 1d5d: pop
      // 1d5e: new java/lang/StringBuffer
      // 1d61: dup
      // 1d62: invokespecial java/lang/StringBuffer.<init> ()V
      // 1d65: ldc "^39~"
      // 1d67: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1d6a: getstatic ab.C Lb;
      // 1d6d: getfield b.d Ljava/lang/String;
      // 1d70: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1d73: ldc "~ "
      // 1d75: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1d78: getstatic fb.Pd Lq;
      // 1d7b: getfield q.X I
      // 1d7e: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 1d81: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 1d84: astore 7
      // 1d86: getstatic ab.C Lb;
      // 1d89: aload 1
      // 1d8a: aload 7
      // 1d8c: getstatic ab.D I
      // 1d8f: iload 4
      // 1d91: isub
      // 1d92: bipush 50
      // 1d94: iload 4
      // 1d96: bipush 0
      // 1d97: invokevirtual b.b (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;IIII)I
      // 1d9a: pop
      // 1d9b: invokestatic fb.j ()B
      // 1d9e: bipush 2
      // 1d9f: if_icmpeq 1dea
      // 1da2: invokestatic ab.g ()Z
      // 1da5: ifeq 1dea
      // 1da8: new java/lang/StringBuffer
      // 1dab: dup
      // 1dac: invokespecial java/lang/StringBuffer.<init> ()V
      // 1daf: ldc "^20~"
      // 1db1: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1db4: getstatic ab.C Lb;
      // 1db7: getfield b.d Ljava/lang/String;
      // 1dba: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1dbd: ldc "~ "
      // 1dbf: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1dc2: aload 0
      // 1dc3: getfield fb.hb [I
      // 1dc6: getstatic fb.Pd Lq;
      // 1dc9: getfield q.x B
      // 1dcc: iaload
      // 1dcd: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 1dd0: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 1dd3: astore 7
      // 1dd5: getstatic ab.C Lb;
      // 1dd8: aload 1
      // 1dd9: aload 7
      // 1ddb: getstatic ab.D I
      // 1dde: iload 4
      // 1de0: isub
      // 1de1: bipush 70
      // 1de3: iload 4
      // 1de5: bipush 0
      // 1de6: invokevirtual b.b (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;IIII)I
      // 1de9: pop
      // 1dea: aload 0
      // 1deb: getfield fb.H Z
      // 1dee: ifne 1f12
      // 1df1: aload 0
      // 1df2: getfield fb.G Z
      // 1df5: ifeq 1e05
      // 1df8: aload 1
      // 1df9: bipush 2
      // 1dfa: ldc ""
      // 1dfc: bipush 0
      // 1dfd: invokestatic qb.b (Ljavax/microedition/lcdui/Graphics;ILjava/lang/String;Z)V
      // 1e00: iload 8
      // 1e02: ifeq 1f2a
      // 1e05: getstatic fb.Pd Lq;
      // 1e08: ifnull 1f12
      // 1e0b: getstatic fb.Pd Lq;
      // 1e0e: getfield q.nc I
      // 1e11: ifne 1f12
      // 1e14: aload 1
      // 1e15: bipush 1
      // 1e16: ldc ""
      // 1e18: bipush 0
      // 1e19: invokestatic qb.b (Ljavax/microedition/lcdui/Graphics;ILjava/lang/String;Z)V
      // 1e1c: invokestatic fb.i ()Z
      // 1e1f: ifne 1f12
      // 1e22: getstatic fb.Pd Lq;
      // 1e25: getfield q.ic J
      // 1e28: ldc2_w -1
      // 1e2b: lcmp
      // 1e2c: ifeq 1f12
      // 1e2f: getstatic fb.kb J
      // 1e32: getstatic fb.Pd Lq;
      // 1e35: getfield q.ic J
      // 1e38: lsub
      // 1e39: ldc2_w 200
      // 1e3c: lcmp
      // 1e3d: ifgt 1f12
      // 1e40: getstatic ab.D I
      // 1e43: sipush 132
      // 1e46: if_icmpgt 1e5b
      // 1e49: getstatic ab.E I
      // 1e4c: sipush 160
      // 1e4f: if_icmpge 1e5b
      // 1e52: bipush 20
      // 1e54: istore 7
      // 1e56: iload 8
      // 1e58: ifeq 1e7a
      // 1e5b: getstatic qb.bb Ljavax/microedition/lcdui/Image;
      // 1e5e: invokevirtual javax/microedition/lcdui/Image.getWidth ()I
      // 1e61: bipush 1
      // 1e62: ishl
      // 1e63: istore 4
      // 1e65: getstatic ab.E I
      // 1e68: iload 4
      // 1e6a: isub
      // 1e6b: bipush 2
      // 1e6c: idiv
      // 1e6d: bipush 20
      // 1e6f: isub
      // 1e70: dup
      // 1e71: istore 7
      // 1e73: iload 4
      // 1e75: bipush 4
      // 1e76: iadd
      // 1e77: iadd
      // 1e78: istore 7
      // 1e7a: bipush 0
      // 1e7b: istore 4
      // 1e7d: ldc2_w 3
      // 1e80: getstatic fb.kb J
      // 1e83: getstatic fb.Pd Lq;
      // 1e86: getfield q.ic J
      // 1e89: lsub
      // 1e8a: ldc2_w 50
      // 1e8d: ldiv
      // 1e8e: lsub
      // 1e8f: l2i
      // 1e90: istore 2
      // 1e91: iload 2
      // 1e92: iflt 1f12
      // 1e95: iload 2
      // 1e96: i2l
      // 1e97: ldc2_w 3
      // 1e9a: getstatic fb.kb J
      // 1e9d: getstatic fb.Pd Lq;
      // 1ea0: getfield q.ic J
      // 1ea3: lsub
      // 1ea4: ldc2_w 50
      // 1ea7: ldiv
      // 1ea8: lsub
      // 1ea9: lcmp
      // 1eaa: ifne 1ed5
      // 1ead: getstatic fb.kb J
      // 1eb0: getstatic fb.Pd Lq;
      // 1eb3: getfield q.ic J
      // 1eb6: lsub
      // 1eb7: ldc2_w 13
      // 1eba: ldiv
      // 1ebb: ldc2_w 2
      // 1ebe: lrem
      // 1ebf: lconst_0
      // 1ec0: lcmp
      // 1ec1: ifne 1ed8
      // 1ec4: iload 4
      // 1ec6: ifne 1ecd
      // 1ec9: bipush 1
      // 1eca: goto 1ece
      // 1ecd: bipush 0
      // 1ece: istore 4
      // 1ed0: iload 8
      // 1ed2: ifeq 1ed8
      // 1ed5: bipush 0
      // 1ed6: istore 4
      // 1ed8: iload 4
      // 1eda: ifne 1f0a
      // 1edd: aload 1
      // 1ede: getstatic qb.cb Ljavax/microedition/lcdui/Image;
      // 1ee1: getstatic ab.D I
      // 1ee4: getstatic qb.cb Ljavax/microedition/lcdui/Image;
      // 1ee7: invokevirtual javax/microedition/lcdui/Image.getWidth ()I
      // 1eea: bipush 6
      // 1eec: imul
      // 1eed: isub
      // 1eee: bipush 1
      // 1eef: ishr
      // 1ef0: getstatic qb.cb Ljavax/microedition/lcdui/Image;
      // 1ef3: invokevirtual javax/microedition/lcdui/Image.getWidth ()I
      // 1ef6: iload 2
      // 1ef7: bipush 1
      // 1ef8: iadd
      // 1ef9: imul
      // 1efa: iadd
      // 1efb: iload 7
      // 1efd: getstatic qb.cb Ljavax/microedition/lcdui/Image;
      // 1f00: invokevirtual javax/microedition/lcdui/Image.getHeight ()I
      // 1f03: bipush 2
      // 1f04: ishr
      // 1f05: iadd
      // 1f06: bipush 0
      // 1f07: invokevirtual javax/microedition/lcdui/Graphics.drawImage (Ljavax/microedition/lcdui/Image;III)V
      // 1f0a: iinc 2 -1
      // 1f0d: iload 8
      // 1f0f: ifeq 1e91
      // 1f12: goto 1f2a
      // 1f15: astore 2
      // 1f16: new java/lang/StringBuffer
      // 1f19: dup
      // 1f1a: invokespecial java/lang/StringBuffer.<init> ()V
      // 1f1d: ldc "ex paint "
      // 1f1f: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1f22: aload 2
      // 1f23: invokevirtual java/lang/StringBuffer.append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
      // 1f26: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 1f29: pop
      // 1f2a: aload 0
      // 1f2b: aload 1
      // 1f2c: invokespecial fb.d (Ljavax/microedition/lcdui/Graphics;)V
      // 1f2f: return
      // try (2 -> 6): 3723 java/lang/Exception
      // try (7 -> 17): 3723 java/lang/Exception
      // try (18 -> 25): 3723 java/lang/Exception
      // try (26 -> 60): 3723 java/lang/Exception
      // try (61 -> 2016): 3723 java/lang/Exception
      // try (2017 -> 3722): 3723 java/lang/Exception
   }

   private void d(Graphics var1) {
      byte var10000;
      label81: {
         boolean var4 = ab.xc;
         if (this.lf) {
            int var2 = Se;

            while (var2 < Se + Ue) {
               var10000 = Te;
               if (var4) {
                  break label81;
               }

               int var3 = Te;

               while (var3 < Te + Ve) {
                  if (bf != null && bf[var2][var3] == 0) {
                     var1.setColor(16711680);
                     var1.drawLine(var2 * 30 + 15 - Ge - 5, var3 * 30 + 15 - He - 5, var2 * 30 + 15 - Ge + 5, var3 * 30 + 15 - He + 5);
                     var1.drawLine(var2 * 30 + 15 - Ge + 5, var3 * 30 + 15 - He - 5, var2 * 30 + 15 - Ge - 5, var3 * 30 + 15 - He + 5);
                  }

                  if (q.Vc != null && q.Vc[var2][var3] != 0) {
                     var1.setColor(16777215);
                     var1.drawString("c" + q.Vc[var2][var3], var2 * 30 + 3 - Ge, var3 * 30 + 3 - He, 0);
                  }

                  if (y.O != null) {
                     var1.setColor(16755370);
                     var1.drawString(y.O[var2][var3] != 0 ? "" + y.O[var2][var3] : "", var2 * 30 + 5 - Ge, var3 * 30 + 5 - He, 0);
                     var1.setColor(11184895);
                     var1.drawString(y.P[var2][var3] != 0 ? "" + y.P[var2][var3] : "", var2 * 30 + 15 - Ge, var3 * 30 + 15 - He, 0);
                  }

                  var3++;
                  if (var4) {
                     break;
                  }
               }

               var2++;
               if (var4) {
                  break;
               }
            }
         }

         var10000 = this.kf;
      }

      if (var10000 != 0) {
         var1.setColor(16777215);
         if (this.kf == 1) {
            var1.drawString("OcM: " + (ab.bb - ab.cb) + "/" + ab.bb + "kb (" + ab.db + "kb)", 3, ab.E - (ab.F.getHeight() << 1) - 2, 0);
            var1.drawString("FPS: " + p + "/" + s + "(" + this.r + ")", 3, ab.E - ab.F.getHeight() - 2, 0);
            return;
         }

         if (this.kf == 2) {
            var1.drawString("Ping: " + this.jf + " RcvFnc: " + this.mf + "(" + this.nf + ")", 3, ab.E - ab.F.getHeight() - 2, 0);
            var1.drawString("Thds: " + Thread.activeCount(), 3, ab.E - (ab.F.getHeight() << 1) - 2, 0);
            if (!i()) {
               var1.drawString("Queue: " + (M ? this.O.m() : this.N.i()), 3, ab.E - ab.F.getHeight() * 3 - 2, 0);
               return;
            }
         } else if (this.kf == 3) {
            byte var5 = 1;
            if (Pd != null) {
               String var10001 = "X: " + Pd.g + " Y: " + Pd.h;
               int var10003 = ab.E;
               int var10004 = ab.F.getHeight();
               var5 = 2;
               var1.drawString(var10001, 3, var10003 - var10004 * 1 - 2, 0);
            }

            var1.drawString("Phys: " + 0 + " (" + 0 + ") [" + 0 + "]", 3, ab.E - ab.F.getHeight() * var5++ - 2, 0);
            var1.drawString("Clds: " + t.r, 3, ab.E - ab.F.getHeight() * var5++ - 2, 0);
            var1.drawString("Dbg: " + this.hf, 3, ab.E - ab.F.getHeight() * var5 - 2, 0);
         }
      }
   }

   public final void c(int var1) {
      boolean var3 = ab.xc;
      if (ab.o) {
         this.e();
      } else if (this.i != null) {
         this.i.b(var1);
      } else if (var1 != ab.jb && var1 != ab.lb) {
         if (var1 == ab.kb || var1 == ab.mb) {
            rc.b.b();
            if (this.c && Pd.nc > 0) {
               this.c(true, true);
               return;
            }

            if (this.H) {
               ab.B.g(false);
               return;
            }

            if (!this.se) {
               this.se = true;
               return;
            }
         }

         if (this.se) {
            if ((var1 == ab.kb || var1 == ab.mb) && this.se) {
               this.d(var1);
            } else {
               label249: {
                  if (var1 == 49) {
                     this.te = this.te + "1";
                     if (!var3) {
                        break label249;
                     }
                  }

                  if (var1 == 50) {
                     this.te = this.te + "2";
                     if (!var3) {
                        break label249;
                     }
                  }

                  if (var1 == 51) {
                     this.te = this.te + "3";
                     if (!var3) {
                        break label249;
                     }
                  }

                  if (var1 == 52) {
                     this.te = this.te + "4";
                     if (!var3) {
                        break label249;
                     }
                  }

                  if (var1 == 53) {
                     this.te = this.te + "5";
                     if (!var3) {
                        break label249;
                     }
                  }

                  if (var1 == 54) {
                     this.te = this.te + "6";
                     if (!var3) {
                        break label249;
                     }
                  }

                  if (var1 == 55) {
                     this.te = this.te + "7";
                     if (!var3) {
                        break label249;
                     }
                  }

                  if (var1 == 56) {
                     this.te = this.te + "8";
                     if (!var3) {
                        break label249;
                     }
                  }

                  if (var1 == 57) {
                     this.te = this.te + "9";
                     if (!var3) {
                        break label249;
                     }
                  }

                  if (var1 == 48) {
                     this.te = this.te + "0";
                     if (!var3) {
                        break label249;
                     }
                  }

                  if (var1 == 42) {
                     this.te = this.te + "*";
                     if (!var3) {
                        break label249;
                     }
                  }

                  if (var1 == 35) {
                     this.te = this.te + "#";
                  }
               }

               if (this.te.length() > 30) {
                  this.se = false;
                  this.te = "";
               }
            }
         } else {
            int var2 = rc.b.getGameAction(var1);
            if (!this.H || var2 != 8 && var1 != ab.rb) {
               if (!this.c()) {
                  label220:
                  if (var1 == 57 && !i() && this.eb == 0) {
                     this.R = !this.R;
                     if (this.R) {
                        this.h();
                        if (!var3) {
                           break label220;
                        }
                     }

                     this.R = true;
                     this.g();
                  }

                  if (var1 == 35 && !ab.w && Pd != null) {
                     this.g();
                     ab.B.b(Pd);
                     return;
                  }

                  label207:
                  if (var2 == 8 || var1 == ab.rb) {
                     if (this.R && !i()) {
                        this.g();
                        if (!var3) {
                           break label207;
                        }
                     }

                     this.pe = 2;
                  }

                  label198:
                  if (var1 == ab.sb || var1 == ab.tb) {
                     if (this.R && !i()) {
                        this.g();
                        if (!var3) {
                           break label198;
                        }
                     }

                     this.qe = 2;
                  }

                  if (var1 == ab.ub || var1 == ab.vb) {
                     this.re = 2;
                  }
               }

               if (var2 == 6 || var1 == ab.nb) {
                  this.le = 2;
               }

               if (var2 == 2 || var1 == ab.ob) {
                  this.me = 2;
               }

               if (var2 == 1 || var1 == ab.pb) {
                  this.ne = 2;
               }

               if (var2 == 5 || var1 == ab.qb) {
                  this.oe = 2;
               }
            } else {
               ab.B.g(false);
            }
         }
      } else {
         rc.b.b();
         if (this.H) {
            ab.B.g(false);
         } else {
            ab.B.m();
         }
      }
   }

   public final void d(int var1) {
      boolean var7 = ab.xc;
      if (ab.o) {
         this.e();
      } else if (this.i != null) {
         this.i.c(var1);
      } else if (var1 != ab.kb && var1 != ab.mb) {
         int var9 = rc.b.getGameAction(var1);
         int var15 = var1;
         int var14 = var9;
         fb var10 = this;
         byte var6 = -1;
         if (var14 == 6 || var15 == ab.nb) {
            var6 = 0;
            var10.le = 1;
         }

         if (var14 == 2 || var15 == ab.ob) {
            var6 = 1;
            var10.me = 1;
         }

         if (var14 == 1 || var15 == ab.pb) {
            var6 = 2;
            var10.ne = 1;
         }

         if (var14 == 5 || var15 == ab.qb) {
            var6 = 3;
            var10.oe = 1;
         }

         byte var11 = var6;
         if (!this.c()) {
            if (Pd != null && Pd.n() && var11 != -1) {
               this.ue = System.currentTimeMillis();
               Pd.i();
            }

            if ((var9 == 8 || var1 == ab.rb) && this.pe != 0) {
               this.pe = 1;
            }

            if ((var1 == ab.sb || var1 == ab.tb) && this.qe != 0) {
               this.qe = 1;
            }
         }
      } else {
         this.se = false;
         fb var3 = this;
         if (this.te != null) {
            try {
               if (var3.te.length() <= 0) {
                  var3.te = "";
                  return;
               }

               if (var3.te.equals("#*")) {
                  var3.kf = (byte)(var3.kf != 0 ? 0 : 1);
                  var3.te = "";
               }

               if (var3.kf != 0) {
                  if (var3.te.equals("*")) {
                     var3.kf++;
                     if (var3.kf > 3) {
                        var3.kf = 1;
                     }

                     var3.te = "";
                  }

                  if (var3.te.equals("#")) {
                     var3.lf = !var3.lf;
                     var3.te = "";
                  }

                  if (var3.te.startsWith("321456987")) {
                     label264: {
                        if (var3.te.equals("321456987")) {
                           ob = false;
                           if (!var7) {
                              break label264;
                           }
                        }

                        ob = true;
                        int var4;
                        if ((var4 = Integer.parseInt(var3.te.substring(9, var3.te.length()), 10)) < 5) {
                           ob = false;
                        }

                        if (var4 > 20) {
                           ob = false;
                        }

                        if (ob) {
                           lb = (byte)(var4 / 4);
                           mb = 1000 / (lb << 2);
                        }
                     }

                     if (!ob) {
                        lb = 6;
                        mb = 1000 / (lb << 2);
                     }

                     var3.te = "";
                  }

                  if ((M || i()) && var3.te.startsWith("2580789")) {
                     label228: {
                        if (var3.te.equals("2580789")) {
                           b(Pd = (q)Qd.elementAt(0), false);
                           if (!var7) {
                              break label228;
                           }
                        }

                        q var5;
                        if ((var5 = q.d((byte)Integer.parseInt(var3.te.substring(7, var3.te.length()), 10))) != null && var5.Cc != null) {
                           Pd = var5;
                           b(var5, false);
                        }
                     }

                     var3.te = "";
                  }

                  if (i()) {
                     if (var3.te.equals("2580456")) {
                        if (Pd != null) {
                           Pd.nc = -1;
                        }

                        var3.te = "";
                     }

                     if (var3.te.equals("32147*0#98")) {
                        label216:
                        if (Pd != null) {
                           if (Pd.Yb != null) {
                              int var12 = 0;

                              while (var12 < Pd.Yb.length) {
                                 Pd.Yb[var12] = Pd.Yb[var12] + 50;
                                 var12++;
                                 if (var7) {
                                    break label216;
                                 }

                                 if (var7) {
                                    break;
                                 }
                              }
                           }

                           if (Pd.bc != -1) {
                              String var2 = hb.b(Pd.bc) + Pd.Yb[Pd.bc];
                              var3.D = var2;
                           }
                        }

                        label203: {
                           if (Pd.dc != null) {
                              int var13 = 0;

                              while (var13 < Pd.dc.length) {
                                 Pd.dc[var13] = Pd.dc[var13] + 50;
                                 var13++;
                                 if (var7) {
                                    break label203;
                                 }

                                 if (var7) {
                                    break;
                                 }
                              }

                              Pd.C += 1000;
                           }

                           var3.te = "";
                        }

                        var3.j = "^41~" + Pd.C;
                     }

                     if (var3.te.startsWith("147*0#")) {
                        ab.Ub = (byte)(Integer.parseInt(var3.te.substring(6, var3.te.length()), 10) - 1);
                        var3.c(true, false);
                        var3.te = "";
                     }

                     if (var3.te.startsWith("32147*0#") && Pd != null) {
                        Pd.Dc = !Pd.Dc;
                        Pd.Fc = !Pd.Fc;
                     }
                  }
               }
            } catch (Exception var8) {
            }

            var3.te = "";
         }
      }
   }

   public static o b(int param0, int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic ab.xc Z
      // 03: istore 5
      // 05: getstatic fb.Re [[Llb;
      // 08: iload 0
      // 09: aaload
      // 0a: iload 1
      // 0b: aaload
      // 0c: getfield lb.e [I
      // 0f: ifnull 62
      // 12: bipush 0
      // 13: istore 3
      // 14: iload 3
      // 15: getstatic fb.Re [[Llb;
      // 18: iload 0
      // 19: aaload
      // 1a: iload 1
      // 1b: aaload
      // 1c: getfield lb.e [I
      // 1f: arraylength
      // 20: if_icmpge 62
      // 23: getstatic fb.Re [[Llb;
      // 26: iload 0
      // 27: aaload
      // 28: iload 1
      // 29: aaload
      // 2a: getfield lb.e [I
      // 2d: iload 3
      // 2e: iaload
      // 2f: bipush -1
      // 30: iload 5
      // 32: ifne 7d
      // 35: if_icmpeq 5a
      // 38: getstatic fb.Rd Ljava/util/Vector;
      // 3b: getstatic fb.Re [[Llb;
      // 3e: iload 0
      // 3f: aaload
      // 40: iload 1
      // 41: aaload
      // 42: getfield lb.e [I
      // 45: iload 3
      // 46: iaload
      // 47: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 4a: checkcast o
      // 4d: dup
      // 4e: astore 4
      // 50: getfield o.e B
      // 53: iload 2
      // 54: if_icmpne 5a
      // 57: aload 4
      // 59: areturn
      // 5a: iinc 3 1
      // 5d: iload 5
      // 5f: ifeq 14
      // 62: getstatic fb.Re [[Llb;
      // 65: iload 0
      // 66: aaload
      // 67: iload 1
      // 68: aaload
      // 69: getfield lb.f [I
      // 6c: ifnull ba
      // 6f: bipush 0
      // 70: istore 3
      // 71: iload 3
      // 72: getstatic fb.Re [[Llb;
      // 75: iload 0
      // 76: aaload
      // 77: iload 1
      // 78: aaload
      // 79: getfield lb.f [I
      // 7c: arraylength
      // 7d: if_icmpge ba
      // 80: getstatic fb.Re [[Llb;
      // 83: iload 0
      // 84: aaload
      // 85: iload 1
      // 86: aaload
      // 87: getfield lb.f [I
      // 8a: iload 3
      // 8b: iaload
      // 8c: bipush -1
      // 8d: if_icmpeq b2
      // 90: getstatic fb.Rd Ljava/util/Vector;
      // 93: getstatic fb.Re [[Llb;
      // 96: iload 0
      // 97: aaload
      // 98: iload 1
      // 99: aaload
      // 9a: getfield lb.f [I
      // 9d: iload 3
      // 9e: iaload
      // 9f: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // a2: checkcast o
      // a5: dup
      // a6: astore 4
      // a8: getfield o.e B
      // ab: iload 2
      // ac: if_icmpne b2
      // af: aload 4
      // b1: areturn
      // b2: iinc 3 1
      // b5: iload 5
      // b7: ifeq 71
      // ba: goto be
      // bd: pop
      // be: aconst_null
      // bf: areturn
      // try (2 -> 49): 103 java/lang/Exception
      // try (50 -> 98): 103 java/lang/Exception
   }

   private void a(boolean var1) {
      int var2;
      int var3;
      boolean var4;
      label58: {
         var4 = ab.xc;
         var3 = -1;
         if (var1 != 0) {
            var2 = Pd.bc;
            if (!var4) {
               break label58;
            }
         }

         var2 = Pd.cc;
      }

      if (var2 != -1) {
         if (var2 >= 14) {
            if (Pd.dc[var2 - 14] == 0) {
               Pd.cc = -1;
            }
         } else if (Pd.Yb[var2] == 0) {
            var2 = 0;

            int var10000;
            while (true) {
               label50:
               if (var2 < hb.f.length) {
                  var10000 = Pd.Yb[hb.f[var2]];
                  if (var4) {
                     break;
                  }

                  if (var10000 != 0 && hb.f[var2] != Pd.bc && hb.f[var2] != Pd.cc) {
                     var3 = hb.f[var2];
                     if (!var4) {
                        break label50;
                     }
                  }

                  var2++;
                  if (!var4) {
                     continue;
                  }
               }

               var10000 = var1;
               break;
            }

            if (var10000 != 0) {
               Pd.bc = var3;
               if (var3 != -1) {
                  String var6 = hb.b(Pd.bc) + Pd.Yb[Pd.bc];
                  this.D = var6;
                  return;
               }
            } else {
               Pd.cc = var3;
            }
         }
      }
   }

   private static void q() {
      boolean var3 = ab.xc;
      if (Rd != null) {
         int var0 = 0;

         while (var0 < Rd.size()) {
            o var1;
            s var2;
            if ((var1 = (o)Rd.elementAt(var0)) != null
               && var1.e >= 3
               && var1.e <= 5
               && var1.f < 2
               && ((var2 = s.b(var1.g, var1.h)) == null || (var1.e == 3 ? var2.u != 4 : (var1.e == 4 ? var2.u != 7 : var1.e != 5 || var2.u != 10)))) {
               var1.f = (byte)(var1.f + 2);
            }

            var0++;
            if (var3) {
               break;
            }
         }
      }
   }

   public final void b(int var1, boolean var2) {
      q var3;
      if ((var3 = q.d((byte)var1)) != null) {
         if (var2) {
            var3.ic = -1L;
            return;
         }

         var3.ic = 0L;
      }
   }

   public static void c(int var0, int var1) {
      if (Qd != null && Pd != null && i()) {
         if (ab.Tb <= ab.Ub) {
            if (Qd.size() > 1) {
               if (q.d((byte)var1) == Pd) {
                  ab.Sb += var0;
               }
            }
         }
      }
   }

   public static void e(int var0) {
      boolean var2 = ab.xc;

      try {
         if (var0 == 0) {
            if (Uc != null) {
               return;
            }

            Uc = ab.b("wood_walls.png", 55, 55);
            if (ab.Jb) {
               return;
            }

            Vc = ab.b("wood_walls_craters.png", 35, 35);
            if (!var2) {
               return;
            }
         }

         if (var0 == 1) {
            if (Wc != null) {
               return;
            }

            Wc = ab.b("gates.png", 110, 80);
            if (!var2) {
               return;
            }
         }

         if (var0 == 2) {
            if (Xc != null) {
               return;
            }

            Xc = ab.b("house_bottom.png", 150, 150);
            Yc = ab.b("house_top.png", 150, 150);
            Zc = ab.b("bombaka_house_bottom.png", 150, 150);
            ad = ab.b("bombaka_house_top.png", 150, 150);
            if (!var2) {
               return;
            }
         }

         if (var0 == 3) {
            if (bd != null) {
               return;
            }

            bd = ab.b("well.png", 81, 65);
            cd = ab.b("well_bail.png", 30, 34);
            if (!var2) {
               return;
            }
         }

         if (var0 == 4) {
            if (vd != null) {
               return;
            }

            vd = ab.b("box.png", 60, 60);
            if (!var2) {
               return;
            }
         }

         if (var0 == 6) {
            if (fd != null) {
               return;
            }

            String var1 = ab.cc && !ab.Jb ? "_bm" : "";
            fd = ab.b("chars/bombaka.png", 30, 30);
            dd = ab.b("chars/bombaka_spawn.png", 40, 40);
            gd = ab.b("chars/death/bombaka_flow.png", 30, 30);
            ed = ab.b("chars/bombaka_spawn_crater.png", 40, 40);
            if (!ab.Jb) {
               ab.b("chars/death/bombaka_skulls" + var1 + ".png", 30, 30);
               ab.b("chars/death/bombaka_parts" + var1 + ".png", 22, 22);
               hd = ab.b("fx/bombaka_eyes_rolling.png", 18, 7);
            }

            if (!var2) {
               return;
            }
         }

         if (var0 == 7) {
            if (md != null) {
               return;
            }

            md = ab.b("chars/cannon.png", 54, 54);
            nd = ab.b("chars/death/cannon.png", 54, 54);
            if (!ab.Jb) {
               ab.b("chars/death/cannon_parts.png", 23, 23);
            }

            od = ab.b("weapons/np/cannon_core.png", 30, 30);
            if (!var2) {
               return;
            }
         }

         if (var0 == 8) {
            if (wd != null) {
               return;
            }

            wd = ab.b("chars/skins/bombaka_kamikadze.png", 40, 40);
            if (!var2) {
               return;
            }
         }

         if (var0 == 9) {
            if (xd != null) {
               return;
            }

            xd = ab.b("chars/skins/bombaka_miner.png", 40, 40);
            if (!var2) {
               return;
            }
         }

         if (var0 == 10) {
            if (pd != null) {
               return;
            }

            pd = ab.b("chars/skins/bombaka_rocketman.png", 40, 40);
            qd = ab.b("weapons/np/rocket.png", 9, 18);
            rd = ab.b("weapons/np/rocket_sparks.png", 30, 30);
            if (!var2) {
               return;
            }
         }

         if (var0 == 11) {
            if (yd != null) {
               return;
            }

            yd = ab.b("chars/slonyaka.png", 80, 80);
            if (!var2) {
               return;
            }
         }

         if (var0 == 12) {
            if (ld != null) {
               return;
            }

            Tc = ab.b("chars/death/ulityaka_explosion.png", 60, 60);
            ld = ab.b("chars/ulityaka.png", 40, 40);
            id = ab.b("weapons/np/spittle_gum.png", 15, 15);
            if (ab.Jb) {
               return;
            }

            if (!ab.cc && !ab.Jb) {
               ab.b("fx/green_pool.png", 24, 24);
            }

            ab.b("chars/death/ulityaka_shell.png", 25, 25);
            jd = ab.b("weapons/np/spittle_gum_crater.png", 20, 20);
            kd = ab.b("weapons/np/spittle_gum_explosion.png", 15, 15);
            if (!var2) {
               return;
            }
         }

         if (var0 == 13) {
            if (zd != null) {
               return;
            }

            zd = ab.b("bushes_bananas.png", 60, 60);
            if (!var2) {
               return;
            }
         }

         if (var0 == 14) {
            if (Ad != null) {
               return;
            }

            Ad = ab.b("telega_bricks.png", 50, 50);
            if (!var2) {
               return;
            }
         }

         if (var0 == 15) {
            if (Bd != null) {
               return;
            }

            Bd = ab.b("ridge.png", 70, 70);
            if (!var2) {
               return;
            }
         }

         if (var0 == 17) {
            if (Cd != null) {
               return;
            }

            Cd = ab.b("menu/pointer_key.png", 20, 20);
            Dd = ab.b("menu/target.png", 54, 54);
            Ed = Image.createImage("/menu/pointer_move.png");
            if (!var2) {
               return;
            }
         }

         if (var0 == 18) {
            ud = ab.b("chars/spider.png", 30, 24);
            sd = ab.b("chars/spider_capsule.png", 30, 30);
            td = ab.b("chars/death/spider_exploding.png", 60, 60);
         }
      } catch (Exception var3) {
         new StringBuffer().append("Load sprites error ").append(var0).append(": ").append(var3).toString();
      }
   }

   public final void b(boolean var1) {
      int var2 = this.i.f;
      if (this.i.f == 5) {
         ab.o = true;
         this.i.c();
         this.i = null;
         if (var1) {
            ab.b = true;
            ab.B.b(Pd, false, !i(), true, -1);
         } else {
            ab.l = 1;
            ab.A.b();
            ab.G.g();
            ab.B.Wb = 1;
            ab.B.l(-1);
         }
      } else {
         this.i.c();
         this.i = null;
         if (var2 == 0 || var2 == 1) {
            if (!var1) {
               ab.t = -1;
               this.c = true;
               ab.Ub--;
               return;
            }

            ab.o = true;
            ab.l = 1;
            ab.B.vc = var2;
            ab.A.b();
            ab.z.repaint();
         }

         if (var2 == 0) {
            ab.B.K();
         } else if (var2 == 1) {
            ab.B.J();
         } else {
            if (var2 == 2) {
               Pd.b(Pd.nb, Pd.ob, true);
               b(Pd, false);
            }
         }
      }
   }

   private static int r() {
      return Pd.ac[1] * 10 + 10;
   }

   public final void f(int var1) {
      this.i = new tb();
      this.i.f = 4;
      qb.Q.b = 0;
      this.i.b(xb);
      this.i.b(ib.c(var1 + 65));
      this.i.b();
   }

   static {
      int[] var10000 = new int[]{322, 282, 222};
      var10000 = new int[]{93, 106, 105};
   }
}
