import java.io.DataInputStream;
import java.util.Vector;
import javax.bluetooth.LocalDevice;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;
import wfree.P;

public final class qb implements ob, Runnable {
   private boolean a;
   public static pb b;
   public tb c = null;
   private int d = -1;
   private int e;
   private int f;
   private int g;
   public static int[] h;
   public static int[] i;
   public static int[] j;
   public static int k;
   private int l;
   public static boolean m;
   private static boolean n = true;
   public static int o;
   private boolean p;
   public int q = 0;
   private static final int[][] r = new int[][]{{24, 4}, {28, 14}, {24, 24}, {14, 28}, {4, 24}, {0, 14}, {4, 4}};
   private boolean s = true;
   private int t;
   private int u = 3;
   private int v;
   private int w;
   public int x = -1;
   private int y = 0;
   private int z = -1;
   private int A = -1;
   private int B;
   private int C = 0;
   private int D;
   private int E;
   public int F;
   public boolean G = false;
   public i H = null;
   private rb I = null;
   private boolean J = false;
   public static pb K;
   public static pb L;
   public static pb M;
   private static pb N;
   private static pb O;
   private static pb P;
   public static pb Q;
   public static pb R;
   public static pb S;
   private static pb T;
   private static pb U;
   public static pb V;
   public static pb W;
   public static Image X;
   private static Image Y;
   private static Image Z;
   public static Image ab;
   public static Image bb;
   public static Image cb;
   public static Image db;
   public static Image eb;
   public static pb fb;
   public static pb gb;
   public static Image hb;
   public static Image ib;
   public static Image jb;
   public static Image kb;
   public static Image lb;
   public static Image mb;
   public static pb nb;
   public static int ob;
   public static int pb;
   public boolean qb;
   private boolean rb;
   private boolean sb;
   public static boolean tb;
   private int ub;
   private int vb;
   public int wb;
   public int xb;
   public int yb;
   public int zb;
   public int Ab;
   public int Bb;
   public int Cb;
   public gb[] Db;
   private int Eb;
   private int Fb;
   private int Gb;
   public int Hb;
   private int Ib;
   private int Jb;
   public int Kb = -1;
   private boolean Lb;
   private int Mb;
   private int Nb;
   private Thread Ob;
   public int Pb;
   public int Qb;
   public int Rb;
   private boolean Sb;
   private gb Tb;
   private boolean Ub;
   private gb Vb;
   public int Wb;
   private cb Xb;
   public e Yb;
   private int Zb;
   public String[] ac;
   public q bc;
   private int cc;
   private boolean dc = false;
   private int ec = 0;
   private boolean fc = false;
   private boolean gc = false;
   private int hc;
   private String ic;
   private boolean jc;
   public static int kc;
   public static int lc;
   private boolean mc;
   private int nc;
   private int oc;
   public int pc;
   private boolean qc;
   private boolean rc;
   private boolean sc;
   private boolean tc;
   public boolean uc;
   public int vc;
   private int wc;
   private Vector xc;
   public int yc;
   private String[] zc;
   private static String[] Ac = new String[]{"b", "d", "f", "g", "h", "k", "l", "m", "n", "p", "s", "t", "v", "z"};
   private static String[] Bc = new String[]{"a", "e", "i", "o", "u"};
   private int Cc = 0;

   public final void a() {
      boolean var13 = ab.xc;
      this.ub = ab.D / 6;
      this.vb = ab.E / 6;
      qb var1 = this;
      DataInputStream var2 = null;

      try {
         byte[] var21 = new byte[(var2 = new DataInputStream(var1.getClass().getResourceAsStream("/info.txt"))).available()];
         var2.read(var21);
         String[] var22;
         ab.h = (var22 = rb.b(new String(var21, "UTF-8"), ";".charAt(0)))[0];
         ab.i = var22[3];
         ab.k = Long.parseLong(var22[4]);
         ab.c = (ab.j = var22[5]).indexOf("NOR") != -1;
      } catch (Exception var20) {
         new StringBuffer().append("load info err ").append(var20).toString();
      }

      long var11;
      label148: {
         if (ab.zb > ab.k) {
            var11 = ab.zb;
            if (!var13) {
               break label148;
            }
         }

         var11 = ab.k;
      }

      if (System.currentTimeMillis() - var11 > 2592000000L) {
         ab.yb = true;
      }

      try {
         var2.close();
      } catch (Exception var19) {
      }

      ib.b();
      p();
      q();
      ab.h();
      ab.e = false;
      this.ic = "Pipyaki "
         + ab.C.c
         + "PRO\n"
         + ab.C.d
         + "version "
         + ab.f
         + "\n"
         + ab.h
         + "\n\n"
         + ab.C.c
         + "Directed by:"
         + ab.C.b
         + "\nPluschevsky Dmitry\nSlobodenyuk Sasha\n\n"
         + ab.C.c
         + "Produced by:"
         + ab.C.b
         + "\nPershakov Sergey\n\n"
         + ab.C.c
         + "Programmed by:"
         + ab.C.b
         + "\nRusyakin Vasily\nPershakov Sergey\nKarpushina Maria\n\n"
         + ab.C.c
         + "Art by:"
         + ab.C.b
         + "\nLyukshin Alexey\nOrlov Maxim\n\n"
         + ab.C.c
         + "Music by:"
         + ab.C.b
         + "\nDJ Paul Mira\nwww.paulmira.com\n\n"
         + ab.C.c
         + "Marketing by:"
         + ab.C.b
         + "\nKovalev Leonid\n\n"
         + ab.C.c
         + "Level design by:"
         + ab.C.b
         + "\nRusyakin Vasily\nKarpushina Maria\n\nhello@pipyakas.com\npipyaki.ru\nm.pipyaki.ru\n\n(c) 2010\nDaSuppaStudios Ltd.";
      var1 = this;
      b = ab.b("sscrbuttons.png", 20, 20);

      try {
         W = ab.b("menu/menu_cursor.png", 14, 26);
         fb = ab.b("menu/skills_shevron.png", 11, 10);
         Y = Image.createImage("/menu/transparent.png");
         S = ab.b("char_arrows.png", 20, 20);
         T = ab.b("menu/small_arrows.png", 5, 5);
         Z = Image.createImage("/menu/line.png");
         X = Image.createImage("/menu/fragswin.png");

         try {
            V = new pb(Image.createImage("/menu/weapons.png"), 44, 44);
         } catch (Exception var17) {
         }

         N = ab.b("menu/status.png", 22, 22);
         O = ab.b("menu/status_bt1.png", 34, 34);
         P = ab.b("menu/status_bt2.png", 6, 6);
         Q = ab.b("menu/big_icons.png", 38, 38);
         bb = Image.createImage("/menu/big_icons_circle.png");
         cb = Image.createImage("/menu/icon_tw.png");
         R = ab.b("menu/phone.png", 22, 30);

         try {
            K = new pb(Image.createImage("/menu/icons.png"), 34, 34);
         } catch (Exception var16) {
         }

         db = Image.createImage("/menu/menu_icons.png");
         ab = Image.createImage("/menu/inf.png");
         eb = Image.createImage("/menu/menu_arrows.png");
         ob = X.getWidth() / 3;
         pb = X.getHeight() / 3;
         var1.wb = db.getWidth() / 2;
         var1.xb = db.getHeight();
         var1.yb = (var1.wb - 34) / 2;
         var1.zb = (var1.xb - 34) / 2;
         if (V != null) {
            var1.Ab = (var1.wb - V.d) / 2;
            var1.Bb = (var1.xb - V.e) / 2;
         }

         var1.Pb = eb.getWidth() / 4;
         var1.Qb = eb.getHeight();
         U = ab.b("menu/pages.png", 6, 6);
         L = ab.b("menu/signs.png", 12, 12);
         gb = ab.b("menu/icons_bot.png", 18, 18);
         nb = ab.b("menu/weapons_ps.png", 10, 10);
         hb = Image.createImage("/menu/icons_ff.png");
         Image.createImage("/menu/icons_play.png");
         ib = Image.createImage("/menu/icons_tb.png");
         jb = Image.createImage("/menu/icons_tip-off.png");
         kb = Image.createImage("/menu/icons_vibro.png");
         lb = Image.createImage("/menu/icons_vol-dot.png");
         mb = Image.createImage("/menu/icons_vol-off.png");
      } catch (Exception var18) {
      }

      bb.b(this);
      this.Zb = -1;
      this.l();
      this.Wb = 1;
      n var24 = new n("settings", true);

      try {
         ab.Ab = var24.f("rk");
      } catch (Exception var15) {
         ab.Ab = "";
      }

      if (ab.Ab == null) {
         ab.Ab = "";
      }

      String var26 = ab.Bb;
      String var3 = "";
      String var4 = "";
      int var5 = 0;

      int var10000;
      while (true) {
         if (var5 < var26.length()) {
            var10000 = var5 % 2;
            if (var13) {
               break;
            }

            if (var10000 == 0) {
               var3 = var3 + (9 - Integer.parseInt(var26.substring(var5, var5 + 1)));
            }

            var5++;
            if (!var13) {
               continue;
            }
         }

         var10000 = 0;
         break;
      }

      var5 = var10000;

      while (true) {
         if (var5 < var3.length()) {
            var31 = var4 + (9 - Integer.parseInt(var3.substring(var3.length() - 1 - var5, var3.length() - var5)));
            if (var13) {
               break;
            }

            var4 = var31;
            var5++;
            if (!var13) {
               continue;
            }
         }

         var31 = d(var4);
         break;
      }

      String var30 = var31;
      var3 = "";
      int var27 = 0;

      byte var10001;
      while (true) {
         if (var27 < ab.Ab.length()) {
            var10000 = ab.Ab.charAt(var27);
            var10001 = 32;
            if (var13) {
               break;
            }

            if (var10000 != 32) {
               var3 = var3 + ab.Ab.charAt(var27);
            }

            var27++;
            if (!var13) {
               continue;
            }
         }

         label114: {
            if (var30.equals(var3)) {
               this.s = false;
               if (!var13) {
                  break label114;
               }
            }

            this.s = true;
         }

         try {
            var24.c();
         } catch (Exception var14) {
         }

         this.Db = new gb[50];
         var10000 = ib.e = -1;
         var10001 = -1;
         break;
      }

      label109: {
         if (var10000 == var10001) {
            this.Lb = true;
            this.d();
            if (!var13) {
               break label109;
            }
         }

         if (ib.e != -2) {
            int var25 = ib.e;
            ab.xb = ib.e;
            this.Lb = true;
            this.d();
         }
      }

      ab.o = false;
   }

   private void c() {
      this.Mb = (this.Eb - this.Gb) * 5;
      this.Nb = (this.Fb - this.Hb) * 5;
   }

   public final void d() {
      boolean var6 = ab.xc;

      try {
         Class.forName("javax.bluetooth.LocalDevice");
         LocalDevice.getLocalDevice().getFriendlyName();
      } catch (Throwable var7) {
         tb = true;
      }

      this.Rb = 0;
      this.Sb = false;
      this.Ub = false;
      this.qb = false;
      this.yc = -1;
      this.Db[0] = new gb(0, this, -1, -1);
      int var1 = 3;
      this.Db[1] = new gb(1, this, 1, 0);
      this.Db[2] = new gb(2, this, 3, 0);
      if (ab.Tb > 0) {
         this.Db[3] = new gb(3, this, 17, 1);
         var1++;
      }

      this.C = -1;
      if (this.s && !ab.c) {
         this.Db[var1] = new gb(var1, this, 14, 0);
         this.C = var1++;
      }

      int var2 = var1;
      this.Db[var1] = new gb(var1, this, 9, 0);
      int var3 = ++var1;
      this.Db[var1] = new gb(var1, this, 38, 0);
      this.Db[++var1] = new gb(var1, this, 10, var2);
      this.Db[++var1] = new gb(var1, this, 11, var2);
      int var4 = ++var1;
      this.Db[var1] = new gb(var1, this, 26, 2);
      this.f = ++var1;
      this.Db[var1] = new gb(var1, this, 5, 2);
      this.l = ++var1;
      this.Db[var1] = new gb(var1, this, 64, 2);
      this.Db[++var1] = new gb(var1, this, 33, 2);
      this.F = ++var1;
      this.Db[var1] = new gb(var1, this, 15, var3);
      this.Db[++var1] = new gb(var1, this, 35, var3);
      var1++;
      if (ab.j.indexOf("NOUPD") == -1) {
         this.Db[var1] = new gb(var1, this, 13, var3);
         var1++;
      }

      this.Db[var1] = new gb(var1, this, 29, var4);
      this.Db[++var1] = new gb(var1, this, 28, var4);
      int var5 = ++var1;
      this.Db[var1] = new gb(var1, this, 56, var4);
      this.Db[++var1] = new gb(var1, this, 16, 0);
      this.Db[++var1] = new gb(var1, this, 37, var2);
      this.Db[++var1] = new gb(var1, this, 25, var2);
      var1++;
      if (ab.j.indexOf("NOF") == -1 && !ab.i.equals("")) {
         this.Db[var1] = new gb(var1, this, 55, var3);
         var1++;
      }

      this.e = var1;
      this.Db[var1] = new gb(var1, this, 4, var4);
      this.Db[var1 + 1] = new gb(var1 + 1, this, 58, 2);
      this.Db[var1 + 2] = new gb(var1 + 2, this, 27, var5);
      this.Db[var1 + 3] = new gb(var1 + 3, this, 57, var5);
      this.Db[var1 + 4] = new gb(var1 + 4, this, 59, var5);
      this.Db[var1 + 5] = new gb(var1 + 5, this, 30, var5);
      var1 += 6;
      this.Cb = var1 - 1;
      new StringBuffer().append("ITMS = ").append(this.Cb).toString();
      this.Kb = -1;
      this.Ib = 0;
      this.Jb = 0;
      var1 = 0;

      while (true) {
         if (var1 <= this.Cb) {
            this.a(var1, true);
            var1++;
            if (var6) {
               break;
            }

            if (!var6) {
               continue;
            }

            o.q = !o.q;
         }

         if (this.Wb > 0) {
            this.c(this.Wb);
         }

         this.c();
         break;
      }
   }

   private void a(int var1, boolean var2) {
      if (this.Db != null) {
         if (var1 >= 0) {
            if (this.Db[var1] != null) {
               if (this.Db[var1].q >= 0 && var2) {
                  this.Db[var1].s = this.Db[this.Db[var1].q].s + 1;
               }

               if (this.Db[var1].s != 0 && this.Db[var1].q >= 0) {
                  if (this.Db[var1].s % 2 == 1) {
                     this.Db[var1].h = this.Db[this.Db[var1].q].h;
                     if (this.Db[this.Db[var1].q].t == 0) {
                        this.Db[this.Db[var1].q].t = this.Db[this.Db[var1].q].d() / 2 + 8;
                     }

                     this.Db[var1].i = this.Db[this.Db[var1].q].i + this.Db[this.Db[var1].q].t + this.Db[var1].d() / 2;
                     this.Db[this.Db[var1].q].r++;
                     this.Db[this.Db[var1].q].t = this.Db[this.Db[var1].q].t + this.Db[var1].d() + -4;
                  } else {
                     this.Db[var1].i = this.Db[this.Db[var1].q].i;
                     if (this.Db[this.Db[var1].q].t == 0) {
                        this.Db[this.Db[var1].q].t = this.Db[this.Db[var1].q].b() / 2 + 8;
                     }

                     this.Db[var1].h = this.Db[this.Db[var1].q].h + this.Db[this.Db[var1].q].t + this.Db[var1].b() / 2;
                     this.Db[this.Db[var1].q].r++;
                     this.Db[this.Db[var1].q].t = this.Db[this.Db[var1].q].t + this.Db[var1].b() + -4;
                  }
               } else {
                  this.Db[var1].h = 0;
                  this.Db[var1].i = 0;
               }
            }
         }
      }
   }

   public final void b(Graphics var1) {
      boolean var8 = ab.xc;
      if (ab.o) {
         ab.nc = true;
         rc.b(var1);
      } else if (this.c != null) {
         this.c.b(var1);
      } else if (this.Rb == 34) {
         ab.A.b(var1);
         int var28 = this.Fb;
         int var21 = 1;

         int var31;
         while (true) {
            if (var21 <= this.Jb) {
               int var25 = this.Eb;
               var31 = 1;
               if (var8) {
                  break;
               }

               int var13 = 1;

               int var10001;
               label292: {
                  while (var13 <= this.Ib) {
                     var31 = var13;
                     var10001 = 1;
                     if (var8) {
                        break label292;
                     }

                     int var30;
                     label490: {
                        if (var13 == 1) {
                           var30 = 0;
                           if (!var8) {
                              break label490;
                           }
                        }

                        if (var13 == this.Ib) {
                           var30 = ob << 1;
                           if (!var8) {
                              break label490;
                           }
                        }

                        var30 = ob;
                     }

                     int var7;
                     label491: {
                        if (var21 == 1) {
                           var7 = 0;
                           if (!var8) {
                              break label491;
                           }
                        }

                        if (var21 == this.Jb) {
                           var7 = pb << 1;
                           if (!var8) {
                              break label491;
                           }
                        }

                        var7 = pb;
                     }

                     var1.drawRegion(X, var30, var7, ob, pb, 0, var25, var28, 0);
                     if (var13 == this.Ib && var21 == this.Jb) {
                        fb.Kd = this.Eb;
                        fb.Ld = this.Fb;
                        fb.Md = var25 - ob;
                        fb.Nd = var28 - var7 - pb;
                     }

                     var25 += ob;
                     var13++;
                     if (var8) {
                        break;
                     }
                  }

                  var31 = var28;
                  var10001 = pb;
               }

               var28 = var31 + var10001;
               var21++;
               if (!var8) {
                  continue;
               }
            }

            var31 = this.Kb;
            break;
         }

         if (var31 != -1) {
            V.b = 0;
            V.b(this.v + this.Eb - this.Gb, this.w + this.Fb - this.Hb);
            V.b(var1);
         }

         int var14 = 1;

         int var34;
         while (true) {
            if (var14 <= this.Cb) {
               var31 = var14;
               var34 = this.t * 9 + 1;
               if (var8) {
                  break;
               }

               if (var14 >= var34 && var14 <= this.t * 9 + 9 && this.Db[var14].j()) {
                  this.Db[var14].b(var1, this.Eb - this.Gb, this.Fb - this.Hb);
               }

               var14++;
               if (!var8) {
                  continue;
               }
            }

            var31 = this.Eb;
            var34 = (this.Ib * ob - U.d * this.u - this.u + 1) / 2;
            break;
         }

         int var26 = var31 + var34;
         if ((var28 = this.Fb + this.Jb * pb - U.e - 10) + U.e + 1 > ab.E) {
            var28 = ab.E - U.e - 1;
         }

         var14 = 0;

         while (var14 < this.u) {
            U.b = var14 == this.t ? 0 : 1;
            U.b(var26, var28);
            U.b(var1);
            var26 += U.d + 1;
            var14++;
            if (var8) {
               break;
            }
         }
      } else {
         var1.setColor(0);
         var1.fillRect(0, 0, ab.D, ab.E);
         if (this.Rb != 33 && this.Rb != 53 && (this.Rb != 55 || this.H != null)) {
            if (this.Rb == 15) {
               this.hc = ab.C.b(var1, this.ic, ab.D / 2, this.cc, ab.D - 4, 2);
               if (this.hc < 0) {
                  this.cc = ab.E - 1;
               }
            } else {
               boolean var10000;
               label470: {
                  if (this.Kb != -1) {
                     if (ab.nc) {
                        ab.nc = false;
                     }

                     int var2 = 1;

                     while (var2 <= this.Cb) {
                        var10000 = this.Db[var2].j();
                        if (var8) {
                           break label470;
                        }

                        if (var10000) {
                           this.Db[var2].b(var1, this.Eb, this.Fb);
                        }

                        var2++;
                        if (var8) {
                           break;
                        }
                     }
                  }

                  var10000 = this.Sb;
               }

               if (var10000) {
                  this.Tb.b(var1, 0, 0);
               }

               if (this.Ub) {
                  this.Vb.b(var1, 0, 0);
               }

               byte var9;
               label516: {
                  var9 = -1;
                  if ((this.Rb == 5 || this.Rb == 8) && this.Xb != null) {
                     if (this.Xb.c) {
                        break label516;
                     }

                     switch (this.Xb.b) {
                        case 1:
                           var9 = 0;
                           if (!var8) {
                              break label516;
                           }
                        case 3:
                        case 4:
                           var9 = 1;
                           if (!var8) {
                              break label516;
                           }
                        case 5:
                           var9 = 2;
                        case 2:
                        default:
                           if (!var8) {
                              break label516;
                           }
                     }
                  }

                  if (this.Rb == 4 && this.Yb != null) {
                     e var3 = this.Yb;
                     if (this.Yb.c) {
                        break label516;
                     }

                     int var16 = -1;
                     this.A++;
                     if (this.A > 4) {
                        this.A = 0;
                     }

                     int var4 = this.A;
                     switch (this.Yb.b) {
                        case 0:
                        case 1:
                           if ((var16 = this.Yb.b()) <= 7) {
                              break;
                           }

                           var16 = 7;
                           if (!var8) {
                              break;
                           }
                        case 3:
                        case 4:
                           if ((var16 = this.Yb.b()) > 7) {
                              var16 = 7;
                           }
                        case 2:
                     }

                     if (var16 != -1) {
                        int var5 = ab.D - O.d - 12;
                        O.b = var16;
                        O.b(var5, 12);
                        O.b(var1);
                        if (var16 != 7) {
                           P.b = var4;
                           P.b(var5 + r[var16][0], 12 + r[var16][1]);
                           P.b(var1);
                        }
                     }

                     if (ab.Db && this.Yb.b == 1) {
                        if (ib.c) {
                           var1.setColor(255, 255, 255);
                           b.c(var1, ib.c(15) + "\n" + ib.c(16) + " " + this.Yb.b(), 6, 22 + M.e, ab.D - 12, 0);
                           if (!var8) {
                              break label516;
                           }
                        }

                        ab.C.b(var1, ib.c(15) + "\n" + ib.c(16) + " " + this.Yb.b(), 6, 22 + M.e, ab.D - 12, 0);
                     }

                     if (!var8) {
                        break label516;
                     }
                  }

                  if (this.Rb == 13 && this.Zb == -1) {
                     var9 = 4;
                     if (!var8) {
                        break label516;
                     }
                  }

                  if (this.Rb == 14 && this.Zb == -1 && this.I != null) {
                     var9 = 4;
                     if (!var8) {
                        break label516;
                     }
                  }

                  if ((this.Rb == 52 || this.Rb == 55 && this.H != null) && this.Zb == -1) {
                     var9 = 6;
                     if (!var8) {
                        break label516;
                     }
                  }

                  if (this.Rb == 70) {
                     b(var1, 1, "Old version! Please update (menu or wap.pipyaki.ru)", true);
                     if (!var8) {
                        break label516;
                     }
                  }

                  if (this.Rb == 71) {
                     b(var1, 1, "Server is old! Please update it (menu or wap.pipyaki.ru)", true);
                     if (!var8) {
                        break label516;
                     }
                  }

                  if (this.Rb == 32) {
                     b(var1, 0, ib.c(24), ab.Db);
                     if (!var8) {
                        break label516;
                     }
                  }

                  if (this.Rb == 25) {
                     b(var1, 0, ib.c(37), true);
                     if (!var8) {
                        break label516;
                     }
                  }

                  if (this.Rb == 63) {
                     b(var1, 4, ib.c(20), ab.Db);
                     if (!var8) {
                        break label516;
                     }
                  }

                  if (this.Rb == 46) {
                     b(var1, 3, ib.c(22), ab.Db);
                     if (!var8) {
                        break label516;
                     }
                  }

                  if (this.Rb == 45) {
                     if (this.vc == 2) {
                        b(var1, 1, ib.c(23), ab.Db);
                        if (!var8) {
                           break label516;
                        }
                     }

                     b(var1, 3, ib.c(21), ab.Db);
                     if (!var8) {
                        break label516;
                     }
                  }

                  if (this.Rb == 42 && this.yc == 7) {
                     var9 = 10;
                  }
               }

               if (var9 != -1) {
                  this.A++;
                  if (this.A > 11) {
                     this.A = 0;
                  }

                  M.b = this.A;
                  M.b(ab.D - M.d - 12, 12);
                  M.b(var1);
                  if (var9 != 10) {
                     N.b = var9;
                     N.b(ab.D - M.d - 12 + (M.d - N.d) / 2, 12 + (M.e - N.e) / 2);
                     N.b(var1);
                  }

                  label362:
                  if (ab.Db && this.Rb == 5 && this.Xb != null && !this.Xb.c && this.Xb.b == 1 && this.Xb.e() == 0) {
                     if (ib.c) {
                        var1.setColor(255, 255, 255);
                        b.c(var1, ib.c(17), ab.D / 2, 22 + M.e, ab.D - 12, 2);
                        if (!var8) {
                           break label362;
                        }
                     }

                     ab.C.b(var1, ib.c(17), ab.D / 2, 22 + M.e, ab.D - 12, 2);
                  }
               }

               if (this.Zb != -1) {
                  label514: {
                     if (this.Zb == 0 || this.Zb == 1 || this.Zb == 2 || this.Zb == 3 || this.Zb == 4 || this.Zb == 5) {
                        var9 = (byte)3;
                        if (!var8) {
                           break label514;
                        }
                     }

                     if (this.Zb == 6 || this.Zb == 7) {
                        var9 = (byte)5;
                        if (!var8) {
                           break label514;
                        }
                     }

                     if (this.Zb == 9) {
                        var9 = (byte)9;
                        if (!var8) {
                           break label514;
                        }
                     }

                     if (this.Zb == 12) {
                        var9 = (byte)7;
                        if (!var8) {
                           break label514;
                        }
                     }

                     if (this.Zb == 10) {
                        var9 = (byte)8;
                        if (!var8) {
                           break label514;
                        }
                     }

                     var9 = (byte)10;
                  }

                  this.A++;
                  if (this.A > 11) {
                     this.A = 0;
                  }

                  N.b = var9;
                  N.b(ab.D - M.d - 12 + (M.d - N.d) / 2, 12 + (M.e - N.e) / 2);
                  N.b(var1);
               }

               if (this.C()) {
                  T.b = 0;
                  T.b(ab.D - 6, 1);
                  T.b(var1);
                  T.b = 1;
                  T.b(ab.D - 6, ab.E - 6);
                  T.b(var1);
               }

               if (this.Kb > 0) {
                  if (this.Rb == 42 && this.yc == 0) {
                     String var18 = "^40~" + this.H();
                     int var24 = Z.getWidth() / 3;
                     int var27 = ib.c ? b.c(var18, var24) : ab.C.b(var18, var24);
                     b(var1, var24, ab.C.c() + 8);
                     b.c(var1, var18, 4, ab.E - var27 - 2, 0);
                     if (this.D > 0) {
                        var18 = "^41~" + ab.C.d + "+" + this.D;
                        ab.C.b(var1, var18, 4, ab.E - ab.C.c() - 2 - this.E, -1, 0);
                     }

                     var18 = "";
                     label315:
                     if (this.Db[this.Kb].h()) {
                        if (this.Db[this.Kb].o == 42) {
                           if (this.Kb < 14 + kc) {
                              var9 = this.Kb - kc;
                              if (ab.D > 132) {
                                 var18 = hb.b[var9] + hb.b(var9) + " = " + hb.d[var9] + "^41~";
                                 if (!var8) {
                                    break label315;
                                 }
                              }

                              var18 = hb.d[var9] + "^41~";
                              if (!var8) {
                                 break label315;
                              }
                           }

                           var9 = this.Kb - kc - 14;
                           if (ab.D > 132) {
                              var18 = hb.c[var9] + hb.c(var9) + " = " + hb.e[var9] + "^41~";
                              if (!var8) {
                                 break label315;
                              }
                           }

                           var18 = hb.e[var9] + "^41~";
                           if (!var8) {
                              break label315;
                           }
                        }

                        if (this.Db[this.Kb].o == 36) {
                           int var6 = this.Kb - lc;
                           var18 = mb.b(var6) + "^41~";
                        }
                     }

                     if (this.Db[this.Kb].o == 39) {
                        var18 = "+^41~";
                     }

                     if (!var18.equals("")) {
                        ab.C.b(var1, var18, ab.D - 4, ab.E - ab.C.c() - 2, -1, 1);
                     }

                     return;
                  }

                  String var17;
                  if (ab.Db && !(var17 = this.Db[this.Kb].s()).equals("") && !var17.equals("_")) {
                     if (ib.c) {
                        int var23 = ab.F.getHeight();
                        b(var1, 0, var23 + 8);
                        var1.setColor(255, 255, 255);
                        var1.drawString(var17, ab.D / 2, ab.E - var23 - 2, 17);
                        return;
                     }

                     int var22 = ab.C.c();
                     b(var1, 0, var22 + 8);
                     ab.C.b(var1, var17, ab.D / 2, ab.E - var22 - 2, -1, 2);
                  }
               }
            }
         } else {
            bb.b.b(var1, this.Eb, this.Fb);
            bb.b(var1);
         }
      }
   }

   public final void e() {
      boolean var4 = ab.xc;
      if (!ab.o) {
         if (!ab.o && this.c != null) {
            this.c.d();
         } else {
            label402: {
               if (this.Rb == 33 || this.Rb == 53 || this.Rb == 55 && this.H == null) {
                  bb.b.i();
                  bb.b();
                  if (!var4) {
                     break label402;
                  }
               }

               if (this.Rb == 15) {
                  int var1;
                  label397: {
                     if (!this.dc) {
                        this.cc--;
                     } else {
                        label375: {
                           if (this.hc < ab.E) {
                              var1 = (ab.E - this.hc) / 2;
                              if (!var4) {
                                 break label375;
                              }
                           }

                           label376: {
                              if (this.gc && this.ec < 0) {
                                 if (this.ec <= -20) {
                                    break label376;
                                 }

                                 this.ec = this.ec * 3 / 2 - 1;
                                 if (!var4) {
                                    break label376;
                                 }
                              }

                              if (this.fc && this.ec > 0) {
                                 if (this.ec >= 20) {
                                    break label376;
                                 }

                                 this.ec = this.ec * 3 / 2 + 1;
                                 if (!var4) {
                                    break label376;
                                 }
                              }

                              this.ec = (this.ec << 1) / 3;
                              label192:
                              if (this.ec == 0) {
                                 if (this.gc) {
                                    this.ec = -1;
                                    if (!var4) {
                                       break label192;
                                    }
                                 }

                                 if (this.fc) {
                                    this.ec = 1;
                                 }
                              }
                           }

                           this.cc = this.cc + this.ec;
                           if (this.cc + this.hc < ab.E - ab.C.c()) {
                              var1 = ab.E - ab.C.c() - this.hc;
                              if (!var4) {
                                 break label375;
                              }
                           }

                           if (this.cc > ab.C.c()) {
                              var1 = ab.C.c();
                              if (!var4) {
                                 break label375;
                              }
                           }

                           var1 = this.cc;
                           this.jc = true;
                        }

                        if (!this.jc) {
                           break label397;
                        }

                        this.cc = var1;
                        if (var4) {
                           break label397;
                        }
                     }

                     return;
                  }

                  this.cc = (var1 + this.cc) / 2;
                  return;
               }
            }

            int var7 = this.Eb;
            int var2 = this.Fb;
            if (this.Eb != this.Gb) {
               int var3;
               label354:
               if ((var3 = (this.Gb - this.Eb) / 4) == 0) {
                  if (this.Eb > this.Gb) {
                     var3 = -1;
                     if (!var4) {
                        break label354;
                     }
                  }

                  var3 = 1;
               }

               this.Eb += var3;
            }

            if (this.Fb != this.Hb) {
               int var18;
               label345:
               if ((var18 = (this.Hb - this.Fb) / 4) == 0) {
                  if (this.Fb > this.Hb) {
                     var18 = -1;
                     if (!var4) {
                        break label345;
                     }
                  }

                  var18 = 1;
               }

               this.Fb += var18;
            }

            boolean var10000;
            label339: {
               this.Mb = this.Mb + (this.Eb - var7) * 5;
               this.Nb = this.Nb + (this.Fb - var2) * 5;
               if (this.Kb != -1) {
                  int var19 = 1;

                  while (var19 <= this.Cb) {
                     var10000 = this.Db[var19].j();
                     if (var4) {
                        break label339;
                     }

                     if (var10000) {
                        this.Db[var19].i();
                     }

                     var19++;
                     if (var4) {
                        break;
                     }
                  }
               }

               var10000 = this.Sb;
            }

            if (var10000) {
               this.Tb.i();
            }

            if (this.Ub) {
               this.Vb.i();
            }

            label323:
            if (this.C() && this.Eb == this.Gb && this.Fb == this.Hb) {
               label381: {
                  if (this.gc && this.ec < 0) {
                     if (this.ec <= -20) {
                        break label381;
                     }

                     this.ec = this.ec * 3 / 2 - 1;
                     if (!var4) {
                        break label381;
                     }
                  }

                  if (this.fc && this.ec > 0) {
                     if (this.ec >= 20) {
                        break label381;
                     }

                     this.ec = this.ec * 3 / 2 + 1;
                     if (!var4) {
                        break label381;
                     }
                  }

                  this.ec = (this.ec << 1) / 3;
                  label306:
                  if (this.ec == 0) {
                     if (this.gc) {
                        this.ec = -1;
                        if (!var4) {
                           break label306;
                        }
                     }

                     if (this.fc) {
                        this.ec = 1;
                     }
                  }
               }

               this.Hb = this.Hb + this.ec;
               if (this.Hb > 0) {
                  this.Hb = 0;
               }

               if (this.Hb < ab.E - this.D()) {
                  this.Hb = ab.E - this.D();
               }

               this.Fb = this.Hb;
               if (this.ec < 0) {
                  if (this.Kb == 3 || this.Db[3].p() + this.Fb - this.Db[3].c() / 2 >= ab.E) {
                     break label323;
                  }

                  this.Kb = 3;
                  if (!var4) {
                     break label323;
                  }
               }

               if (this.ec > 0 && this.Kb != 2) {
                  this.ec = 0;
                  this.gc = false;
                  this.fc = false;
                  this.Kb = 2;
               }
            }

            if (this.Rb == 13) {
               label288:
               if (this.I != null && this.I.e) {
                  String var8 = this.I.d;
                  this.I = null;
                  this.Sb = false;
                  if (var8 == null) {
                     this.b(7);
                     if (!var4) {
                        break label288;
                     }
                  }

                  ab.zb = System.currentTimeMillis();
                  if (var8.equals("no")) {
                     ab.yb = false;
                     r();
                     this.Rb = 0;
                     this.b(8);
                     if (!var4) {
                        break label288;
                     }
                  }

                  ab.yb = true;
                  r();
                  boolean var9 = true;
                  String var14 = var8;
                  qb var10 = this;

                  try {
                     wfree.P.pr(midlet.a, var14);
                  } catch (Exception var6) {
                     var10.Rb = 0;
                     if (!var4) {
                        break label288;
                     }
                  }

                  var10.g();
               }
            } else if (this.Rb == 14) {
               label272:
               if (this.I != null && this.I.e) {
                  if (this.I.d == null) {
                     this.v();
                     if (!var4) {
                        break label272;
                     }
                  }

                  String var11 = this.I.d;
                  this.I = null;
                  String var15 = var11;
                  var12 = this;
                  this.wc = 0;
                  label265:
                  if (var15 != null) {
                     try {
                        String var16;
                        if (!c(var16 = new String(var15.getBytes(), "UTF-8")) || !var12.b(var16)) {
                           break label265;
                        }
                     } catch (Exception var5) {
                        break label265;
                     }

                     if (!var4) {
                        break label272;
                     }
                  }

                  var12.v();
               }
            } else {
               label385: {
                  if (this.Rb == 52 && this.H != null) {
                     if (this.H.d == 2) {
                        label250: {
                           if (!this.p) {
                              this.yc = 3;
                              if (!var4) {
                                 break label250;
                              }
                           }

                           this.yc = 7;
                        }

                        this.z();
                        if (!var4) {
                           break label385;
                        }
                     }

                     if (this.H.d != 1) {
                        break label385;
                     }

                     label242: {
                        if (this.p) {
                           this.Rb = 42;
                           if (!var4) {
                              break label242;
                           }
                        }

                        this.Rb = 0;
                     }

                     this.H = null;
                     this.b(12);
                     if (!var4) {
                        break label385;
                     }
                  }

                  if (this.Rb == 55 && this.H != null) {
                     if (this.H.d == 0) {
                        break label385;
                     }

                     this.Rb = 0;
                     this.c(this.Kb);
                     if (this.H.d == 1) {
                        this.b(12);
                     }

                     this.H = null;
                     if (!var4) {
                        break label385;
                     }
                  }

                  label226:
                  if (this.Rb == 34 && this.Kb != -1) {
                     label223: {
                        var7 = (this.Db[this.Kb].o() - this.v) / 2;
                        var2 = (this.Db[this.Kb].p() - this.w) / 2;
                        if (var7 == 0) {
                           this.v = this.Db[this.Kb].o();
                           if (!var4) {
                              break label223;
                           }
                        }

                        this.v += var7;
                     }

                     if (var2 == 0) {
                        this.w = this.Db[this.Kb].p();
                        if (!var4) {
                           break label226;
                        }
                     }

                     this.w += var2;
                  }
               }
            }

            if (this.Rb != 34 && this.y > 0) {
               this.y--;
               if (this.y <= 0) {
                  this.y = 4;
                  this.d(this.z, false);
               }
            }

            if (this.Rb == 42 && this.D > 0) {
               this.E++;
               if (this.E > 40) {
                  this.D = 0;
               }
            }
         }
      }
   }

   private void d(int var1, boolean var2) {
      if (this.Kb != -1 && var1 != -1) {
         this.Zb = -1;
         if (this.Db[this.Kb].k()) {
            if (this.Db[this.Kb].s % 2 == 1) {
               if (var1 == 1) {
                  this.Db[this.Kb].b(-1, false);
                  return;
               }

               if (var1 == 3) {
                  this.Db[this.Kb].b(1, false);
                  return;
               }
            } else {
               if (var1 == 2) {
                  this.Db[this.Kb].b(1, false);
                  return;
               }

               if (var1 == 0) {
                  this.Db[this.Kb].b(-1, false);
                  return;
               }
            }
         }

         if (this.Lb) {
            this.c(this.Kb);
         }

         if (this.Rb == 34) {
            ab.G.b(ab.H, 1);
            this.b(ab.gb[var1], ab.hb[var1]);
         } else if (var1 == 2) {
            this.b(-1, 1, var2, this.Kb);
         } else if (var1 == 0) {
            this.b(1, 1, var2, this.Kb);
         } else if (var1 == 1) {
            this.b(-1, 0, var2, this.Kb);
         } else {
            if (var1 == 3) {
               this.b(1, 0, var2, this.Kb);
            }
         }
      }
   }

   private void b(int var1, int var2) {
      int var3 = 1 + this.t * 9;
      int var4 = (this.Kb - var3) % 3 + var1;
      int var5 = (this.Kb - var3) / 3 + var2;
      if (var4 >= 3) {
         var4 = 0;
      }

      if (var5 >= 3) {
         var5 = 0;
      }

      if (var4 < 0) {
         var4 = 2;
      }

      if (var5 < 0) {
         var5 = 2;
      }

      if ((var3 = var5 * 3 + var4 + var3) > 0 && var3 <= this.Cb) {
         if (!this.Db[var3].j()) {
            this.Kb = var3;
            this.b(var1, var2);
         } else {
            this.c(var3);
         }
      }
   }

   private void b(int var1, int var2, boolean var3, int var4) {
      boolean var6 = ab.xc;

      while (true) {
         int var5;
         label119: {
            this.Lb = false;
            int var10000;
            if (this.Db[var4].s % 2 == var2) {
               var10000 = var4;
               if (!var6) {
                  var5 = var4;

                  while (true) {
                     label120: {
                        var5 += var1;
                        if (this.Db[this.Db[var4].q].s == 0) {
                           if (var5 <= 0) {
                              if (var3 == 0) {
                                 return;
                              }

                              var5 = this.Cb;
                              if (!var6) {
                                 break label120;
                              }
                           }

                           if (var5 <= this.Cb) {
                              break label120;
                           }

                           if (var3 == 0) {
                              return;
                           }

                           var5 = 1;
                           if (!var6) {
                              break label120;
                           }
                        }

                        if (var5 <= 0 || var5 > this.Cb) {
                           if (this.Db[var4].q == 0) {
                              if (var3 == 0) {
                                 return;
                              }

                              if (var1 > 0) {
                                 var5 = this.f(this.Db[var4].q);
                                 if (!var6) {
                                    break label119;
                                 }
                              }

                              var5 = this.g(this.Db[var4].q);
                              if (!var6) {
                                 break label119;
                              }
                           }

                           if (var3 == 0 && var5 > this.Cb) {
                              return;
                           }

                           this.A();
                           var5 = this.Db[var4].q;
                           if (!var6) {
                              break label119;
                           }
                        }
                     }

                     if (this.Db[var5].q == this.Db[var4].q) {
                        break label119;
                     }
                  }
               }
            } else {
               var10000 = var3;
            }

            if (var10000 == 0) {
               return;
            }

            label107:
            if (this.Db[var4].r == 0) {
               if (var1 < 0) {
                  if (this.Db[var4].q <= 0) {
                     var5 = this.f(0);
                     if (!var6) {
                        break label107;
                     }
                  }

                  var5 = this.Db[var4].q;
                  if (!var6) {
                     break label107;
                  }
               }

               if (this.Db[var4].q < 0) {
                  break;
               }

               var5 = this.g(this.Db[var4].q);
               if (var6) {
                  break;
               }
            } else {
               label124: {
                  if (var1 > 0) {
                     var5 = this.f(var4);
                     if (!var6) {
                        break label124;
                     }
                  }

                  var5 = this.g(var4);
               }
            }
         }

         if (this.Db[var5].r() || this.Db[var5].o == 54 || !this.Db[var5].j()) {
            var4 = var5;
            var3 = var3;
            var2 = var2;
            var1 = var1;
            this = this;
            if (!var6) {
               continue;
            }
         }

         ab.G.b(ab.H, 1);
         this.c(var5);
         return;
      }
   }

   private void a(int var1) {
      this.Db[var1].b(this.Db[var1].h);
      this.Db[var1].c(this.Db[var1].i);
      if (this.Db[var1].s != 0) {
         if (this.Db[var1].s % 2 == 1) {
            this.Db[var1].c(this.Db[this.Db[var1].q].i + this.Db[this.Db[var1].q].d() + 8);
            return;
         }

         this.Db[var1].b(this.Db[this.Db[var1].q].h + this.Db[this.Db[var1].q].b() + 8);
      }
   }

   public final void c(int var1) {
      boolean var5 = ab.xc;
      if (var1 == -1) {
         this.Kb = var1;
      } else if (this.Rb == 34) {
         this.Kb = var1;
      } else {
         int var2 = 0;
         if (this.Kb > 0 && this.Kb != var1) {
            var2 = 1;

            int var10000;
            int var10001;
            label177: {
               while (var2 <= this.Cb) {
                  var10000 = this.Db[var1].q;
                  var10001 = this.Kb;
                  if (var5) {
                     break label177;
                  }

                  if (this.Db[var1].q != this.Kb && this.Db[var2].q == this.Kb) {
                     int var4 = var2;
                     qb var3 = this;
                     this.Db[var4].w = 0;
                     var3.Db[var4].v = true;
                     var3.Db[var4].h = var3.Db[var3.Db[var4].q].h;
                     var3.Db[var4].i = var3.Db[var3.Db[var4].q].i;
                     label171:
                     if (var3.Db[var4].s != 0) {
                        if (var3.Db[var4].s % 2 == 1) {
                           var3.Db[var4].i = var3.Db[var3.Db[var4].q].i + var3.Db[var3.Db[var4].q].c() + 8;
                           if (!var5) {
                              break label171;
                           }
                        }

                        var3.Db[var4].h = var3.Db[var3.Db[var4].q].h + var3.Db[var3.Db[var4].q].b() + 8;
                     }
                  }

                  this.Db[var2].B = 0;
                  var2++;
                  if (var5) {
                     break;
                  }
               }

               var10000 = this.Db[this.Kb].q;
               var10001 = var1;
            }

            var2 = var10000 == var10001;
         }

         qb var17;
         label159: {
            this.Kb = var1;
            this.Gb = ab.D / 2 - this.Db[this.Kb].h;
            this.Hb = ab.E / 2 - this.Db[this.Kb].i;
            if (!var2) {
               this.Db[this.Kb].r = 0;
               this.Db[this.Kb].t = 0;
               var2 = 1;

               while (var2 <= this.Cb) {
                  var17 = this;
                  if (var5) {
                     break label159;
                  }

                  if (this.Db[var2].q == this.Kb) {
                     this.a(var2, false);
                     this.a(var2);
                  }

                  var2++;
                  if (var5) {
                     break;
                  }
               }
            }

            var17 = this;
         }

         qb var15 = var17;
         var17.Ib = 0;
         var15.Jb = 0;
         int var16 = 1;

         while (true) {
            if (var16 <= var15.Cb) {
               var18 = var15.Db[var16].j();
               if (var5) {
                  break;
               }

               if (var18 != 0) {
                  if (var15.Db[var16].h + var15.Db[var16].b() / 2 > var15.Ib) {
                     var15.Ib = var15.Db[var16].h + var15.Db[var16].b() / 2;
                  }

                  if (var15.Db[var16].i + var15.Db[var16].c() / 2 > var15.Jb) {
                     var15.Jb = var15.Db[var16].i + var15.Db[var16].c() / 2;
                  }
               }

               var16++;
               if (!var5) {
                  continue;
               }
            }

            var16 = var1;
            var15 = this;
            var18 = this.Db[var16].s % 2;
            break;
         }

         label191: {
            if (var18 == 1) {
               if ((var1 = var15.d(var16)) != -1) {
                  var15.Db[var1].B = 2;
               }

               if ((var1 = var15.e(var16)) != -1) {
                  var15.Db[var1].B = 4;
               }

               if ((var1 = var15.f(var16)) == -1) {
                  break label191;
               }

               var15.Db[var1].B = 1;
               if (!var5) {
                  break label191;
               }
            }

            if ((var1 = var15.d(var16)) != -1) {
               var15.Db[var1].B = 3;
            }

            if ((var1 = var15.e(var16)) != -1) {
               var15.Db[var1].B = 1;
            }

            if ((var1 = var15.f(var16)) != -1) {
               var15.Db[var1].B = 4;
            }
         }

         if (this.Rb == 0 || this.Rb == 42) {
            if (this.yc == 2 && this.Ib > ab.D || this.yc != 2) {
               if (this.Ib + this.Gb < ab.D - this.ub) {
                  this.Gb = ab.D - this.ub - this.Ib;
               }

               if (this.Db[1].h + this.Gb - this.Db[1].b() / 2 > this.ub) {
                  this.Gb = this.ub - this.Db[1].h + this.Db[1].b() / 2;
               }
            }

            if (this.Jb + this.Hb < ab.E - this.vb) {
               this.Hb = ab.E - this.vb - this.Jb;
            }

            if (this.Db[1].i + this.Hb - this.Db[1].c() / 2 > this.vb) {
               this.Hb = this.vb - this.Db[1].i + this.Db[1].c() / 2;
            }
         }

         label113: {
            if (this.Db[this.Kb].o == 36) {
               this.Gb -= 30;
               if (this.Db[this.Kb].o() + this.Gb - this.Db[this.Kb].b() / 2 >= 10) {
                  break label113;
               }

               this.Gb = this.Db[this.Kb].b() / 2 - this.Db[this.Kb].o() + 10;
               if (!var5) {
                  break label113;
               }
            }

            String var12;
            if (!(var12 = this.Db[this.Kb].q()).equals("") && this.Db[this.Kb].s % 2 == 1) {
               this.Gb = this.Gb - (ab.C.b(var12) / 2 + 2);
               if (this.Db[this.Kb].k()) {
                  this.Gb -= 12;
               }

               if (this.Db[this.Kb].o() + this.Gb - this.Db[this.Kb].b() / 2 < 10) {
                  this.Gb = this.Db[this.Kb].b() / 2 - this.Db[this.Kb].o() + 10;
               }
            }
         }

         if (this.Db[this.Kb].k()) {
            this.Db[this.Kb].n();
         }
      }
   }

   private int d(int var1) {
      boolean var3 = ab.xc;
      int var2 = var1 - 1;

      int var10000;
      while (true) {
         if (var2 > 0) {
            var10000 = this.Db[var1].q;
            if (var3) {
               break;
            }

            if (this.Db[var1].q == this.Db[var2].q) {
               return var2;
            }

            var2--;
            if (!var3) {
               continue;
            }
         }

         var10000 = this.Db[var1].q;
         break;
      }

      return var10000;
   }

   private int e(int var1) {
      boolean var3 = ab.xc;
      int var2 = var1 + 1;

      int var10000;
      while (true) {
         if (var2 <= this.Cb) {
            var10000 = this.Db[var1].q;
            if (var3) {
               break;
            }

            if (this.Db[var1].q == this.Db[var2].q) {
               return var2;
            }

            var2++;
            if (!var3) {
               continue;
            }
         }

         var10000 = -1;
         break;
      }

      return var10000;
   }

   private int f(int var1) {
      boolean var3 = ab.xc;
      int var2 = 1;

      int var10000;
      while (true) {
         if (var2 <= this.Cb) {
            var10000 = this.Db[var2].q;
            if (var3) {
               break;
            }

            if (this.Db[var2].q == var1 && this.Db[var2].j() && !this.Db[var2].r()) {
               return var2;
            }

            var2++;
            if (!var3) {
               continue;
            }
         }

         var10000 = -1;
         break;
      }

      return var10000;
   }

   private int g(int var1) {
      boolean var3 = ab.xc;
      int var2 = this.Cb;

      int var10000;
      while (true) {
         if (var2 > 0) {
            var10000 = this.Db[var2].q;
            if (var3) {
               break;
            }

            if (this.Db[var2].q == var1 && this.Db[var2].j() && !this.Db[var2].r()) {
               return var2;
            }

            var2--;
            if (!var3) {
               continue;
            }
         }

         var10000 = -1;
         break;
      }

      return var10000;
   }

   public final void f() {
      this.fc = false;
      this.gc = false;
      this.ec = 0;
      if (this.Kb != -1) {
         this.b(this.Db[this.Kb]);
      }
   }

   private void g() {
      ab.o = true;
      this.j();
      s();
      midlet.a.b();
   }

   public final void b(int var1, boolean var2, boolean var3) {
      boolean var7 = ab.xc;
      if (ab.Ub >= 5) {
         n var10 = new n("settings", true);

         try {
            ab.Ab = var10.f("rk");
         } catch (Exception var9) {
            ab.Ab = "";
         }

         if (ab.Ab == null) {
            ab.Ab = "";
         }

         String var11 = ab.Bb;
         String var4 = "";
         String var5 = "";
         int var6 = 0;

         int var10000;
         label81: {
            while (var6 < var11.length()) {
               var10000 = var6 % 2;
               if (var7) {
                  break label81;
               }

               if (var10000 == 0) {
                  var4 = var4 + (9 - Integer.parseInt(var11.substring(var6, var6 + 1)));
               }

               var6++;
               if (var7) {
                  break;
               }
            }

            var10000 = 0;
         }

         var6 = var10000;

         label69: {
            while (var6 < var4.length()) {
               var16 = var5 + (9 - Integer.parseInt(var4.substring(var4.length() - 1 - var6, var4.length() - var6)));
               if (var7) {
                  break label69;
               }

               var5 = var16;
               var6++;
               if (var7) {
                  break;
               }
            }

            var16 = d(var5);
         }

         String var15 = var16;
         var4 = "";
         var3 = 0;

         label89: {
            while (var3 < ab.Ab.length()) {
               var17 = ab.Ab.charAt(var3);
               if (var7) {
                  break label89;
               }

               if (var17 != ' ') {
                  var4 = var4 + ab.Ab.charAt(var3);
               }

               var3++;
               if (var7) {
                  break;
               }
            }

            try {
               var10.c();
            } catch (Exception var8) {
            }

            var17 = var15.equals(var4);
         }

         if (var17 == 0) {
            this.F();
            return;
         }
      }

      ab.o = true;
      ab.z.repaint();
      this.nc = var1;
      this.mc = false;
      new zb(this).start();
   }

   private void b(gb var1) {
      int var2;
      boolean var8;
      label355: {
         var8 = ab.xc;
         if (var1 != null) {
            if (!var1.h()) {
               ab.G.b(ab.Z, 1);
               return;
            }

            this.sb = false;
            this.Zb = -1;
            if (var1.o == 10) {
               if (var1.l != 0) {
                  var1.l = 0;
                  ab.Gb = false;
                  var1.A = true;
                  ab.G.f();
                  return;
               }

               label236: {
                  ab.Gb = true;
                  if (ab.Eb == 0) {
                     var1.b(1, true);
                     if (!var8) {
                        break label236;
                     }
                  }

                  var1.b(ab.Eb / 10, true);
               }

               this.B();
               return;
            }

            if (var1.o == 24) {
               label247: {
                  if (var1.l == 0) {
                     ab.Hb = true;
                     if (ab.Fb == 0) {
                        var1.b(1, true);
                        if (!var8) {
                           break label247;
                        }
                     }

                     var1.b(ab.Fb / 10, true);
                     if (!var8) {
                        break label247;
                     }
                  }

                  var1.l = 0;
                  ab.Hb = false;
                  var1.A = true;
                  if (ab.G != null) {
                     ab.G.c();
                  }
               }

               if (ab.G != null && ab.i() > 0) {
                  ab.G.b(ab.I, 1);
               }

               return;
            }

            if (var1.o == 42 || var1.o == 36) {
               gb var19 = var1;
               qb var16 = this;
               ab.o = true;
               var16.Wb = var19.n;
               var16.c = new tb();
               var16.c.f = 3;
               if (var19.o == 42) {
                  int var24 = var19.g();
                  V.b = var24 - 3;
                  var16.c.b(V);
                  if (var19.n < 14 + kc) {
                     var2 = var19.n - kc;
                     var16.c.b(ib.b("/lang_workshop.txt", var2 + 1));
                     var16.c.b("");
                     var16.c.b(ib.c(58) + hb.d[var2] + ib.c(59) + hb.b[var2] + ib.c(60));
                  } else {
                     var2 = var19.n - kc - 14;
                     var16.c.b(ib.b("/lang_workshop.txt", var2 + 15));
                     var16.c.b("");
                     var16.c.b(ib.c(58) + hb.e[var2] + ib.c(59) + hb.c[var2] + ib.c(60));
                  }
               } else if (var19.o == 36) {
                  int var25 = var19.n - lc;
                  byte var22 = mb.b[var25];
                  V.b = var22 - 3;
                  var16.c.b(V);
                  var16.c.b(ib.b("/lang_workshop.txt", var25 + 21));
                  var16.c.b("");
                  var16.c.b(ib.c(61) + mb.c(var25));
                  var16.c.b(ib.c(62) + mb.b(var25) + ib.c(63));
               }

               var16.c.b();
               ab.o = false;
               return;
            }

            if (var1.o != 17 && var1.k()) {
               ab.G.b(ab.I, 1);
               var1.b(1, true);
               return;
            }

            ab.G.b(ab.I, 1);
            if (this.Lb) {
               this.Lb = false;
            }

            var2 = var1.o;
            if (!var8) {
               break label355;
            }
         }

         var2 = this.d;
      }

      switch (var2) {
         case 0:
            if (this.Rb == 70 || this.Rb == 71) {
               this.Sb = false;
               this.Ub = false;
               this.Rb = 0;
               this.c(this.Wb);
               return;
            }

            if (this.Rb == 25) {
               qb var14 = this;
               ab.o = true;
               rc.b.repaint();
               new hc(var14).start();
               ab.o = false;
               qb var15 = this;
               ab.o = true;
               rc.b.repaint();
               new fc(var15).start();
               ab.o = false;
               this.Rb = 0;
               return;
            }

            if (this.Rb == 32) {
               this.Wb = 1;
               this.l(-1);
               return;
            }

            if (this.Rb == 45) {
               this.K();
               return;
            }

            if (this.Rb == 46) {
               this.l(-2);
               return;
            }
            break;
         case 1:
         case 17:
            byte var13 = ab.Ub;
            p();
            ab.Ub = var13;
            this.b(ab.Ub, false, false);
            return;
         case 2:
            this.Rb = 0;
            this.Sb = false;
            this.Ub = false;
            this.c(this.Wb);
            return;
         case 3:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 18:
         case 24:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 34:
         case 36:
         case 37:
         case 38:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         case 48:
         case 49:
         case 54:
         case 56:
         case 57:
         case 58:
         case 59:
         case 60:
         case 61:
         case 62:
         case 63:
         default:
            break;
         case 4:
            n var18 = new n("settings", true);

            try {
               ab.Ab = var18.f("rk");
               var18.c();
            } catch (Exception var12) {
               ab.Ab = "";
            }

            if (ab.Ab == null) {
               ab.Ab = "";
            }

            String var23 = ab.Bb;
            String var27 = "";
            String var29 = "";
            int var30 = 0;

            int var38;
            while (true) {
               if (var30 < var23.length()) {
                  var38 = var30 % 2;
                  if (var8) {
                     break;
                  }

                  if (var38 == 0) {
                     var27 = var27 + (9 - Integer.parseInt(var23.substring(var30, var30 + 1)));
                  }

                  var30++;
                  if (!var8) {
                     continue;
                  }
               }

               var38 = 0;
               break;
            }

            var30 = var38;

            while (true) {
               if (var30 < var27.length()) {
                  var39 = var29 + (9 - Integer.parseInt(var27.substring(var27.length() - 1 - var30, var27.length() - var30)));
                  if (var8) {
                     break;
                  }

                  var29 = var39;
                  var30++;
                  if (!var8) {
                     continue;
                  }
               }

               var39 = d(var29);
               break;
            }

            String var32 = var39;
            var27 = "";
            int var35 = 0;

            while (true) {
               if (var35 < ab.Ab.length()) {
                  var40 = ab.Ab.charAt(var35);
                  if (var8) {
                     break;
                  }

                  if (var40 != ' ') {
                     var27 = var27 + ab.Ab.charAt(var35);
                  }

                  var35++;
                  if (!var8) {
                     continue;
                  }
               }

               var40 = var32.equals(var27);
               break;
            }

            label299: {
               if (var40 != 0) {
                  if (var1 != null) {
                     this.g = var1.n;
                     this.b(null, false, true, false, 4);
                     if (!var8) {
                        break label299;
                     }
                  }

                  this.Rb = 4;
                  this.h(22);
                  this.i(23);
                  this.Wb = this.e;
                  this.i();
                  ab.A = new fb();
                  fb.Oe = this.ac[ab.Mb] + ".map";
                  fb.M = true;
                  fb.L = 1;
                  r();
                  this.Yb = new f(ab.A, this);
                  ab.A.O = this.Yb;
                  if (!var8) {
                     break label299;
                  }
               }

               this.M();
            }

            try {
               var18.c();
               return;
            } catch (Exception var11) {
               return;
            }
         case 5:
            n var17 = new n("settings", true);

            try {
               ab.Ab = var17.f("rk");
               var17.c();
            } catch (Exception var10) {
               ab.Ab = "";
            }

            if (ab.Ab == null) {
               ab.Ab = "";
            }

            String var3 = ab.Bb;
            String var4 = "";
            String var5 = "";
            int var7 = 0;

            int var10000;
            while (true) {
               if (var7 < var3.length()) {
                  var10000 = var7 % 2;
                  if (var8) {
                     break;
                  }

                  if (var10000 == 0) {
                     var4 = var4 + (9 - Integer.parseInt(var3.substring(var7, var7 + 1)));
                  }

                  var7++;
                  if (!var8) {
                     continue;
                  }
               }

               var10000 = 0;
               break;
            }

            var7 = var10000;

            while (true) {
               if (var7 < var4.length()) {
                  var36 = var5 + (9 - Integer.parseInt(var4.substring(var4.length() - 1 - var7, var4.length() - var7)));
                  if (var8) {
                     break;
                  }

                  var5 = var36;
                  var7++;
                  if (!var8) {
                     continue;
                  }
               }

               var36 = d(var5);
               break;
            }

            String var6 = var36;
            var4 = "";
            var7 = 0;

            while (true) {
               if (var7 < ab.Ab.length()) {
                  var37 = ab.Ab.charAt(var7);
                  if (var8) {
                     break;
                  }

                  if (var37 != ' ') {
                     var4 = var4 + ab.Ab.charAt(var7);
                  }

                  var7++;
                  if (!var8) {
                     continue;
                  }
               }

               var37 = var6.equals(var4);
               break;
            }

            label262: {
               if (var37 != 0) {
                  if (var1 != null) {
                     this.g = var1.n;
                     this.b(null, false, true, false, 5);
                     if (!var8) {
                        break label262;
                     }
                  }

                  this.Rb = 5;
                  this.h(19);
                  this.Wb = this.f;
                  this.i();
                  ab.A = new fb();
                  fb.M = false;
                  fb.L = 1;
                  r();
                  this.Xb = new db(ab.A, this);
                  ab.A.N = this.Xb;
                  if (!var8) {
                     break label262;
                  }
               }

               this.M();
            }

            try {
               var17.c();
               return;
            } catch (Exception var9) {
               return;
            }
         case 13:
            this.Rb = 13;
            System.out
               .println(
                  "http://get.pipyakas.com/pipyaka/pipyaka.php?p=4&dn="
                     + ab.h
                     + "&vr="
                     + ab.f
                     + "&build=0"
                     + "&manufacturer="
                     + lb.b()
                     + "&model="
                     + lb.c()
                     + "&level_completed="
                     + ab.Tb
                     + "&hasPointerEvents="
                     + rc.e
                     + "&cps="
                     + fb.s
                     + "&fps="
                     + fb.p
               );
            this.I = new rb(
               "http://get.pipyakas.com/pipyaka/pipyaka.php?p=4&dn="
                  + ab.h
                  + "&vr="
                  + ab.f
                  + "&build=0"
                  + "&manufacturer="
                  + lb.b()
                  + "&model="
                  + lb.c()
                  + "&level_completed="
                  + ab.Tb
                  + "&hasPointerEvents="
                  + rc.e
                  + "&cps="
                  + fb.s
                  + "&fps="
                  + fb.p,
               120000L
            );
            return;
         case 14:
            this.h(false);
            return;
         case 15:
            this.cc = ab.E - 1;
            this.Rb = 15;
            return;
         case 16:
            this.g();
            return;
         case 19:
            this.a(false, false);
            return;
         case 20:
            this.Ub = false;
            this.i();
            this.Xb.c();
            return;
         case 21:
            this.Ub = false;
            this.sb = true;
            this.x = this.Kb;
            this.Xb.b(this.Kb - 1);
            return;
         case 22:
            this.b(false, false);
            return;
         case 23:
            this.Sb = false;
            this.Ub = false;
            this.Yb.l();
            return;
         case 25:
            this.Rb = 25;
            this.h(2);
            this.i(0);
            this.Wb = this.Kb;
            this.Kb = -1;
            return;
         case 31:
            this.h();
            return;
         case 32:
            if (this.Rb == 63) {
               this.Rb = 0;
               this.Sb = false;
               this.Ub = false;
               this.c(this.C);
               this.c();
               return;
            }

            this.Rb = 32;
            this.h(2);
            this.i(0);
            this.Wb = this.Kb;
            this.Kb = -1;
            return;
         case 33:
         case 53:
         case 55:
            if (var1.o == 53) {
               var1.u = "";
            }

            this.Rb = var1.o;
            this.Gb = ab.D / 2 - this.Db[this.Kb].h;
            this.Hb = this.Db[this.Kb].c() / 2 - this.Db[this.Kb].i;
            if (ab.E <= 132) {
               this.Hb -= 20;
            }

            bb.b(var1, var1.o == 55);
            return;
         case 35:
            ab.o = true;
            this.Wb = var1.n;
            this.c = new tb();
            this.c.f = 3;
            Q.b = 0;
            this.c.b(Q);
            this.c.b(ib.b("/lang_help.txt", 0));
            this.c.b();
            ab.o = false;
            return;
         case 39:
            this.h(true);
            break;
         case 50:
            label254: {
               this.B = var1.n;
               this.zc = rb.b((String)this.xc.elementAt(var1.n - 2), ";".charAt(0));
               if (this.p) {
                  this.yc = 6;
                  if (!var8) {
                     break label254;
                  }
               }

               this.yc = 2;
            }

            this.z();
            return;
         case 51:
            if (this.yc == 2) {
               if (this.xc.size() == 1) {
                  this.d();
                  return;
               }

               this.yc = 1;
               this.z();
               return;
            }

            if (this.yc == 1) {
               if (this.p) {
                  this.G();
                  return;
               }

               this.d();
               return;
            }

            if (this.yc == 6) {
               this.G();
               return;
            }

            if (this.yc == 4) {
               this.Wb = 1;
            }

            this.d();
            return;
         case 52:
            this.Rb = 52;
            if (this.p) {
               this.H = new i(this.zc[6], this.zc[4] + " " + n(2));
               return;
            }

            this.H = new i(this.zc[5], this.zc[3] + " " + n(1));
            return;
         case 64:
            if (var1 != null) {
               this.g = var1.n;
            }

            q();
            this.b(null, false, true, false, -1);
            return;
      }
   }

   private void h() {
      boolean var3 = ab.xc;
      if (this.Rb == 34 && fb.L != 0) {
         ab.l = 0;
      } else {
         if (this.Rb != 42) {
            ab.l = 0;
            if (this.qb && this.Rb != 34) {
               ab.G.h();
            }
         } else {
            label74: {
               if (fb.i() && !m) {
                  label67: {
                     ab.l = 0;
                     int var1 = ab.Qb + this.q;
                     if (m) {
                        ab.Rb = var1;
                        n var2 = new n("btautosave", true);

                        try {
                           var2.b("btcoins", var1);
                           var2.b();
                           var2.c();
                           break label67;
                        } catch (Exception var5) {
                           if (!var3) {
                              break label67;
                           }
                        }
                     }

                     ab.Qb = var1;
                     n var6 = new n("autosave", true);

                     try {
                        var6.b("coins", var1);
                        var6.b();
                        var6.c();
                     } catch (Exception var4) {
                     }
                  }

                  this.bc.nc = this.bc.nc + (this.bc.v() - this.bc.mc);
                  this.bc.mc = this.bc.v();
                  if (!var3) {
                     break label74;
                  }
               }

               if (!this.qb) {
                  if (this.d != -1) {
                     this.b((gb)null);
                     return;
                  }

                  d((q)null);
                  this.Wb = this.l;
                  this.d();
                  return;
               }

               ab.l = 0;
               d(this.bc);
               this.bc.nc = this.bc.nc + (this.bc.v() - this.bc.mc);
               this.bc.mc = this.bc.v();
               if (!fb.M) {
                  fb.I.b(this.bc.w, this.bc);
                  return;
               }

               return;
            }
         }

         ab.A.b(false, false);
      }
   }

   private void i() {
      this.Kb = -1;
      this.Cb = 0;
      this.Db[0] = new gb(0, this, -1, -1);
      this.c();
   }

   private void h(int var1) {
      this.Tb = new gb(-2, this, var1, -1);
      this.Tb.h = 2 + this.Tb.b() / 2;
      this.Tb.i = ab.E - this.Tb.c() / 2 - 2;
      this.Tb.b(this.Tb.b() / 2);
      this.Tb.c(ab.E + this.Tb.c() / 2);
      this.Sb = true;
   }

   public final void i(int var1) {
      this.Vb = new gb(-2, this, var1, -1);
      this.Vb.h = ab.D - 2 - this.Vb.b() / 2;
      this.Vb.i = ab.E - 2 - this.Vb.c() / 2;
      this.Vb.b(ab.D + this.Vb.b() / 2);
      this.Vb.c(ab.E + this.Vb.c() / 2);
      this.Ub = true;
   }

   public final void b(boolean var1) {
      if (var1) {
         ab.G.b("/midi/music_menu.mid", 1);
      }

      this.rb = true;
      this.Ob = new Thread(this);
      this.Ob.start();
   }

   public final void run() {
      boolean var5 = ab.xc;
      long var1 = 0L;
      long var3 = 0L;

      while (this.rb) {
         if (System.currentTimeMillis() - var1 >= 40L) {
            this.e();
            rc.b.repaint();
            var1 = System.currentTimeMillis();
         }

         if (System.currentTimeMillis() - var3 >= 8000L) {
            var3 = System.currentTimeMillis();
         }

         Thread.yield();
         if (this.I != null && !this.I.e) {
            try {
               Thread.sleep(100L);
            } catch (Exception var6) {
               if (var5) {
                  break;
               }
            }
         }
      }
   }

   public final void j() {
      this.rb = false;

      try {
         this.Ob = null;
      } catch (Exception var1) {
      }
   }

   public final void j(int var1) {
      this.A();
      if (!ab.o && !this.a) {
         if (this.c != null) {
            this.c.b(var1);
         } else if (this.Rb != 33 && this.Rb != 53 && (this.Rb != 55 || this.H != null)) {
            if (this.Rb != 13 && this.Rb != 14) {
               if (this.Rb != 52 && this.Rb != 55) {
                  if (this.Rb == 34 && var1 == 35) {
                     ab.G.b(ab.H, 1);
                     this.t++;
                     if (this.t >= this.u) {
                        this.t = 0;
                     }

                     this.c(this.t * 9 + 1);
                  } else if (var1 == ab.ib && this.Rb == 42 && this.yc == 0) {
                     if (!m || this.qb) {
                        this.h();
                     }
                  } else {
                     int var2;
                     if ((var2 = rc.b.getGameAction(var1)) != 8 && var1 != ab.rb) {
                        if (var1 != ab.jb && var1 != ab.lb) {
                           if (var1 != ab.kb && var1 != ab.mb) {
                              if (var1 != ab.sb && var1 != ab.tb) {
                                 byte var3 = c(var2, var1);
                                 if (this.Rb != 15 && !this.C()) {
                                    if (!this.sb) {
                                       if (var3 == 0 || var3 == 2 || var3 == 1 || var3 == 3) {
                                          this.z = var3;
                                          this.y = 8;
                                       }

                                       this.d(var3, true);
                                    }
                                 } else {
                                    if (var3 == 0) {
                                       this.fc = false;
                                       this.gc = true;
                                       return;
                                    }

                                    if (var3 == 2) {
                                       this.gc = false;
                                       this.fc = true;
                                       return;
                                    }
                                 }
                              } else if (this.Rb == 34) {
                                 this.f(false);
                                 return;
                              }
                           } else {
                              if (this.Rb == 15) {
                                 this.k();
                                 return;
                              }

                              if (this.Ub) {
                                 this.b(this.Vb);
                                 return;
                              }

                              if (!this.Sb && (this.qb || this.Rb == 42) && this.Rb != 46 && this.Rb != 45 && (this.Rb != 42 || this.yc == 0)) {
                                 if (!this.qb) {
                                    this.Wb = this.g;
                                    this.d();
                                    return;
                                 }

                                 this.h();
                                 return;
                              }
                           }
                        } else {
                           if (this.Rb == 15) {
                              this.k();
                              return;
                           }

                           if (this.Sb) {
                              this.b(this.Tb);
                              return;
                           }

                           if (!this.Ub && (this.qb || this.Rb == 42) && (this.Rb != 42 || this.yc == 0)) {
                              if (!this.qb) {
                                 this.Wb = this.g;
                                 this.d();
                                 return;
                              }

                              this.h();
                              return;
                           }
                        }
                     } else {
                        if (this.Rb == 34) {
                           this.f(true);
                           return;
                        }

                        if (this.Rb == 15) {
                           ab.G.b(ab.I, 1);
                           this.k();
                           return;
                        }

                        if (!this.sb) {
                           this.f();
                           return;
                        }
                     }
                  }
               }
            } else {
               if ((var1 == ab.jb || var1 == ab.lb) && this.Sb) {
                  this.b(this.Tb);
               }
            }
         } else {
            bb.b(var1);
         }
      }
   }

   public final void k(int var1) {
      this.A();
      if (!ab.o && !this.a) {
         if (this.c != null) {
            this.c.c(var1);
         } else {
            byte var3;
            if ((var3 = c(rc.b.getGameAction(var1), var1)) == 0) {
               this.gc = false;
            } else {
               if (var3 == 2) {
                  this.fc = false;
               }
            }
         }
      }
   }

   private void k() {
      this.jc = false;
      if (this.dc) {
         this.dc = false;
         this.Rb = 0;
         this.c(this.Kb);
      } else {
         this.dc = true;
         this.ec = 0;
      }
   }

   private static byte c(int var0, int var1) {
      byte var2 = -1;
      if (var0 == 6 || var1 == 56) {
         var2 = 0;
      }

      if (var0 == 2 || var1 == 52) {
         var2 = 1;
      }

      if (var0 == 1 || var1 == 50) {
         var2 = 2;
      }

      if (var0 == 5 || var1 == 54) {
         var2 = 3;
      }

      return var2;
   }

   public final void b(String var1) {
      if (this.Rb == 5) {
         this.Cb++;
         this.Db[this.Cb] = new gb(this.Cb, this, 21, 0, var1);
         this.a(this.Cb, true);
         this.a(this.Cb);
         this.Ib = this.Db[this.Cb].h + this.Db[this.Cb].b() / 2;
         this.Jb = this.Db[this.Cb].i + this.Db[this.Cb].c() / 2;
         if (this.Kb == -1) {
            this.c(this.Cb);
         }
      }
   }

   public final void b() {
      if (this.Rb == 5) {
         this.i(20);
      }
   }

   public final void b(int var1, boolean var2) {
      ab.q = 0;
      ab.o = true;
      this.x = -1;
      if (var2) {
         p();
      }

      this.oc = (byte)var1;
      ab.l = 0;
      ab.z.repaint();
      new yb(this).start();
   }

   public final void b(int var1) {
      this.Zb = var1;
      this.sb = false;
      int var2 = this.x;
      this.x = -1;
      if (var1 == 0) {
         tb = true;
         this.a(false, false);
      } else if (var1 == 1) {
         this.Db[var2].l = 1;
         this.i(20);
      } else if (var1 == 2) {
         tb = true;
         this.b(false, false);
      } else if (var1 == 3) {
         this.b(false, false);
      } else if (var1 == 4) {
         tb = true;
         this.a(false, false);
      } else if (var1 == 9) {
         this.sc = true;
         this.Zb = -1;
         this.a(false, false);
      } else if (var1 == 10) {
         this.tc = true;
         this.Zb = -1;
         this.a(false, false);
      } else if (var1 == 5) {
         tb = true;
         this.b(false, false);
      } else {
         if (var1 == 8 || var1 == 7 || var1 == 11) {
            this.Sb = false;
            this.Rb = 0;
         }
      }
   }

   public final void l(int var1) {
      ab.o = true;
      this.pc = var1;
      ab.z.repaint();
      if (fb.L == 0) {
         new bc(this).start();
      } else if (ab.A.b()) {
         new ac(this).start();
      } else {
         this.a(true, this.pc == -3);
      }
   }

   public final void c(boolean var1) {
      this.b(true);
   }

   private void a(boolean var1, boolean var2) {
      this.qc = var1;
      this.rc = var2 && !ab.c;
      this.x = -1;
      this.Xb.c = true;
      this.E();
      this.d();
      new nc(this).start();
   }

   public final void b(boolean var1, boolean var2) {
      this.qc = var1;
      this.rc = var2 && !ab.c;
      this.Yb.c = true;
      this.E();
      this.d();
      new oc(this).start();
   }

   public final void l() {
      boolean var2 = ab.xc;
      int var1 = 1;

      qb var10000;
      while (true) {
         if (var1 <= this.Cb) {
            var10000 = this;
            if (var2) {
               break;
            }

            if (this.Db[var1].o == 28) {
               this.Db[var1].l = 0;
            }

            var1++;
            if (!var2) {
               continue;
            }
         }

         var10000 = this;
         break;
      }

      var10000.ac = m(ab.Nb);
   }

   private static String[] m(int var0) {
      boolean var5 = ab.xc;
      DataInputStream var2 = null;
      boolean var3 = false;
      Vector var4 = null;

      try {
         if (!k.b(var2 = new DataInputStream(midlet.a.getClass().getResourceAsStream("/maps/list"))).equals("[XXXYAKAS]")) {
            throw new Exception();
         }

         var4 = new Vector();

         String var1;
         while ((var1 = k.b(var2)) != null) {
            if (!var3) {
               if (var0 == 0) {
                  if (!var1.equals("[DM]") && !var1.equals("[TM]") && !var1.equals("[CTF]")) {
                     continue;
                  }

                  var3 = true;
                  if (!var5) {
                     continue;
                  }
               }

               if (var0 == 1) {
                  if (!var1.equals("[TM]") && !var1.equals("[CTF]")) {
                     continue;
                  }

                  var3 = true;
                  if (!var5) {
                     continue;
                  }
               }

               if (var0 != 2 || !var1.equals("[CTF]")) {
                  continue;
               }

               var3 = true;
               if (!var5) {
                  continue;
               }
            }

            if (var1.equals("end")) {
               var3 = false;
               if (!var5) {
                  continue;
               }
            }

            if (!var1.equals("")) {
               var4.addElement(var1);
               if (var5 || var5) {
                  break;
               }
            }
         }
      } catch (Exception var8) {
         try {
            if (var2 != null) {
               var2.close();
            }
         } catch (Exception var7) {
         }

         new StringBuffer().append("ERROR: get maps list at type ").append(var0).toString();
      }

      try {
         if (var2 != null) {
            var2.close();
         }
      } catch (Exception var6) {
      }

      if (var4 != null && var4.size() > 0) {
         String[] var9 = new String[var4.size()];
         int var10 = 0;

         String[] var10000;
         while (true) {
            if (var10 < var4.size()) {
               var10000 = var9;
               if (var5) {
                  break;
               }

               var9[var10] = (String)var4.elementAt(var10);
               var10++;
               if (!var5) {
                  continue;
               }
            }

            var10000 = var9;
            break;
         }

         return var10000;
      } else {
         return new String[]{"no map"};
      }
   }

   public final void m() {
      boolean var2 = ab.xc;
      this.qb = true;
      ab.l = 1;
      ab.A.b();
      ab.G.g();
      ab.o = true;
      this.Rb = 0;
      this.Sb = false;
      this.Ub = false;
      this.sb = false;
      this.Zb = -1;
      this.Wb = 1;
      this.Db[0] = new gb(0, this, -1, -1);
      this.Db[1] = new gb(1, this, 31, 0);
      this.Db[2] = new gb(2, this, 9, 0);
      this.Db[3] = new gb(3, this, 32, 0);
      this.Db[4] = new gb(4, this, 10, 2);
      this.Db[5] = new gb(5, this, 11, 2);
      this.Db[6] = new gb(6, this, 37, 2);
      this.Cb = 5;
      this.Kb = -1;
      this.Ib = 0;
      this.Jb = 0;
      int var1 = 0;

      while (true) {
         if (var1 <= this.Cb) {
            this.a(var1, true);
            var1++;
            if (var2) {
               break;
            }

            if (!var2) {
               continue;
            }
         }

         if (this.Wb > 0) {
            this.c(this.Wb);
         }

         this.c();
         ab.o = false;
         break;
      }
   }

   public final void d(boolean var1) {
      label90: {
         boolean var6 = ab.xc;
         bb.b = null;
         if (this.Rb == 33) {
            if (var1) {
               ab.Kb = this.Db[this.Kb].u;
               if (!var6) {
                  break label90;
               }
            }

            this.Db[this.Kb].u = ab.Kb;
            if (!var6) {
               break label90;
            }
         }

         if (this.Rb == 53) {
            String var2 = this.Db[this.Kb].u;
            this.Db[this.Kb].u = ib.c(30);
            if (var1) {
               this.Rb = 0;
               String var7 = ab.Bb;
               String var3 = "";
               String var4 = "";
               int var5 = 0;

               int var10000;
               while (true) {
                  if (var5 < var7.length()) {
                     var10000 = var5 % 2;
                     if (var6) {
                        break;
                     }

                     if (var10000 == 0) {
                        var3 = var3 + (9 - Integer.parseInt(var7.substring(var5, var5 + 1)));
                     }

                     var5++;
                     if (!var6) {
                        continue;
                     }
                  }

                  var10000 = 0;
                  break;
               }

               var5 = var10000;

               while (true) {
                  if (var5 < var3.length()) {
                     var13 = var4 + (9 - Integer.parseInt(var3.substring(var3.length() - 1 - var5, var3.length() - var5)));
                     if (var6) {
                        break;
                     }

                     var4 = var13;
                     var5++;
                     if (!var6) {
                        continue;
                     }
                  }

                  var13 = d(var4);
                  break;
               }

               String var12 = var13;
               var3 = "";
               var1 = 0;

               while (true) {
                  if (var1 < var2.length()) {
                     var14 = var2.charAt(var1);
                     if (var6) {
                        break;
                     }

                     if (var14 != ' ') {
                        var3 = var3 + var2.charAt(var1);
                     }

                     var1++;
                     if (!var6) {
                        continue;
                     }
                  }

                  var14 = var12.equals(var3);
                  break;
               }

               label45: {
                  if (var14 != 0) {
                     ab.Ab = var2;
                     r();
                     this.s = false;
                     this.yc = 4;
                     if (!var6) {
                        break label45;
                     }
                  }

                  this.s = true;
                  this.yc = 5;
               }

               this.z();
               return;
            }

            this.Sb = true;
            if (!var6) {
               break label90;
            }
         }

         if (this.Rb == 55) {
            String var9 = this.Db[this.Kb].u;
            this.Db[this.Kb].u = "";
            if (var1) {
               this.H = new i("+" + var9, ib.c(38) + ab.i);
               return;
            }
         }
      }

      this.Rb = 0;
      this.c(this.Kb);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public final void b(q var1, boolean var2, boolean var3, boolean var4, int var5) {
      boolean var6 = ab.xc;
      this.uc = ab.b;
      ab.b = false;
      m = (boolean)var3;
      this.qb = (boolean)var4;
      this.d = var5;
      ab.l = 1;
      if (!var2 && fb.L == 0 && this.qb) {
         ab.A.b();
      }

      ab.o = true;
      if (m && var1 != null && !var2) {
         d(var1);
      }

      n = false;
      this.v();
      n = true;
      this.Rb = 42;
      this.Sb = false;
      this.Ub = false;
      this.sb = false;
      this.Zb = -1;
      this.Wb = 1;
      this.D = 0;
      this.yc = 0;
      if (!var2) {
         this.q = 0;
      }

      label147: {
         this.bc = var1;
         this.Cb = 36;
         this.Db[0] = new gb(0, this, -1, -1);
         this.Db[0].s = 1;
         if (!ab.c) {
            this.Db[1] = new gb(1, this, 39, 0);
            this.Db[2] = new gb(2, this, 40, 0);
            this.Db[3] = new gb(3, this, 41, 0);
            this.Db[4] = new gb(4, this, 44, 0);
            this.Db[5] = new gb(5, this, 31, 0);
            this.Wb = 1;
            var2 = 2;
            var3 = 3;
            var4 = 4;
            kc = 6;
            if (!var6) {
               break label147;
            }
         }

         this.Db[1] = new gb(1, this, 40, 0);
         this.Db[2] = new gb(2, this, 41, 0);
         this.Db[3] = new gb(3, this, 44, 0);
         this.Db[4] = new gb(4, this, 31, 0);
         this.Wb = 1;
         kc = 5;
         var2 = 1;
         var3 = 2;
         var4 = 3;
         this.Cb--;
      }

      int var7 = 0;

      qb var12;
      label141: {
         label140: {
            label139:
            while (true) {
               if (var7 < 14) {
                  this.Db[kc + var7] = new gb(kc + var7, this, 42, var2);
                  var10000 = this.bc;
                  if (var6) {
                     break;
                  }

                  label100: {
                     if (this.bc != null) {
                        this.Db[kc + var7].l = this.bc.Yb[var7];
                        this.Db[kc + var7].m = this.bc.Yb[var7];
                        if (ab.d || this.bc.Yb[var7] != 0 || ab.Yb[var7]) {
                           break label100;
                        }

                        this.Db[kc + var7].d = true;
                        if (!var6) {
                           break label100;
                        }
                     }

                     this.Db[kc + var7].l = h[var7];
                     this.Db[kc + var7].m = h[var7];
                  }

                  var7++;
                  if (!var6) {
                     continue;
                  }

                  var7 = 0;
               } else {
                  var7 = 0;
               }

               while (var7 < 6) {
                  this.Db[kc + 14 + var7] = new gb(kc + 14 + var7, this, 42, var3);
                  var10000 = this.bc;
                  if (var6) {
                     break label139;
                  }

                  if (this.bc != null) {
                     this.Db[kc + 14 + var7].l = this.bc.dc[var7];
                     this.Db[kc + 14 + var7].m = this.bc.dc[var7];
                     if (!ab.d && this.bc.dc[var7] == 0 && !ab.Zb[var7]) {
                        this.Db[kc + 14 + var7].d = true;
                        if (var6) {
                           this.Db[kc + 14 + var7].l = i[var7];
                           this.Db[kc + 14 + var7].m = i[var7];
                        }
                     }
                  } else {
                     this.Db[kc + 14 + var7].l = i[var7];
                     this.Db[kc + 14 + var7].m = i[var7];
                  }

                  var7++;
                  if (var6) {
                     lc = kc + 14 + 6;
                     var7 = 0;
                     if (var7 >= 11) {
                        break label140;
                     }

                     this.Db[lc + var7] = new gb(lc + var7, this, 36, var4);
                     var12 = this;
                     if (var6) {
                        break label141;
                     }

                     var10000 = this.bc;
                     break label139;
                  }
               }

               lc = kc + 14 + 6;
               var7 = 0;
               if (var7 >= 11) {
                  break label140;
               }

               this.Db[lc + var7] = new gb(lc + var7, this, 36, var4);
               var12 = this;
               if (var6) {
                  break label141;
               }

               var10000 = this.bc;
               break;
            }

            while (true) {
               label87: {
                  if (var10000 != null) {
                     this.Db[lc + var7].l = this.bc.ac[var7];
                     this.Db[lc + var7].m = this.bc.ac[var7];
                     if (!var6) {
                        break label87;
                     }
                  }

                  this.Db[lc + var7].l = j[var7];
                  this.Db[lc + var7].m = j[var7];
               }

               if (var6 || ++var7 >= 11) {
                  break;
               }

               this.Db[lc + var7] = new gb(lc + var7, this, 36, var4);
               var12 = this;
               if (var6) {
                  break label141;
               }

               var10000 = this.bc;
            }
         }

         this.Kb = -1;
         this.Ib = 0;
         var12 = this;
      }

      var12.Jb = 0;
      int var8 = 0;

      while (true) {
         if (var8 <= this.Cb) {
            this.a(var8, true);
            var8++;
            if (var6) {
               break;
            }

            if (!var6) {
               continue;
            }
         }

         if (this.Wb > 0) {
            this.c(this.Wb);
         }

         this.c();
         break;
      }

      if (ab.g) {
         this.c = new tb();
         this.c.f = 3;
         Q.b = 0;
         this.c.b(Q);
         this.c.b(ib.b("/lang_workshop.txt", 0));
         this.c.b();
      }

      ab.g = false;
      ab.o = false;
   }

   public final void b(q var1) {
      boolean var7;
      label41: {
         var7 = ab.xc;
         this.bc = var1;
         this.qb = true;
         ab.l = 1;
         if (fb.i()) {
            ab.A.b();
            if (!var7) {
               break label41;
            }
         }

         d(var1);
      }

      this.Rb = 34;
      this.Sb = false;
      this.Ub = false;
      this.sb = false;
      this.Zb = -1;
      this.Wb = var1.bc + 1;
      if (this.Wb == 0) {
         this.Wb = 1;
      }

      this.Cb = 20;
      this.Db[0] = new gb(0, this, -1, -1);
      this.t = 0;
      this.Ib = 8;
      this.Jb = 8;
      this.Gb = (ab.D - this.Ib * ob) / 2;
      this.Hb = (ab.E - this.Jb * pb) / 2;
      this.Eb = this.Gb;
      this.Fb = this.Hb;
      int var3 = (this.Ib * ob - V.d * 3) / 2 + 1;
      int var4 = (this.Jb * pb - V.e * 3) / 2 + 1;
      int var2 = 1;

      int var10000;
      while (true) {
         if (var2 <= this.Cb) {
            int var6 = (var2 - 1) % 9;
            this.Db[var2] = new gb(var2, this, 34, 0);
            int var5 = var6 % 3;
            var6 /= 3;
            this.Db[var2].h = this.Gb + var3 + (V.d - 2) * var5;
            this.Db[var2].i = this.Hb + var4 + (V.e - 2) * var6;
            this.Db[var2].b(this.Db[var2].h);
            this.Db[var2].c(this.Db[var2].i);
            var10000 = var2;
            if (var7) {
               break;
            }

            label30: {
               if (var2 <= 14) {
                  this.Db[var2].l = var1.Yb[var2 - 1];
                  if (!var7) {
                     break label30;
                  }
               }

               this.Db[var2].l = var1.dc[var2 - 1 - 14];
            }

            var2++;
            if (!var7) {
               continue;
            }
         }

         this.t = (this.Wb - 1) / 9;
         var10000 = this.t;
         break;
      }

      if (var10000 < 0) {
         this.t = 0;
      }

      this.c(this.Wb);
      this.v = this.Db[this.Kb].o();
      this.w = this.Db[this.Kb].p();
      ab.o = false;
   }

   private void f(boolean var1) {
      boolean var3 = ab.xc;
      if (this.Kb > 0) {
         if (this.Db[this.Kb].l == 0) {
            ab.G.b(ab.Z, 1);
         } else {
            label37: {
               if (this.Kb <= 14) {
                  ab.G.b(ab.I, 1);
                  if (var1) {
                     this.bc.bc = this.Kb - 1;
                     fb.I.c(hb.b(this.bc.bc) + this.bc.Yb[this.bc.bc]);
                     if (!var3) {
                        break label37;
                     }
                  }

                  this.bc.cc = this.Kb - 1;
                  if (!var3) {
                     break label37;
                  }
               }

               byte var2;
               if ((var2 = (byte)(this.Kb - 1 - 14)) == 5) {
                  return;
               }

               ab.G.b(ab.I, 1);
               if (var1) {
                  this.bc.d(var2, false);
                  if (!var3) {
                     break label37;
                  }
               }

               this.bc.cc = this.Kb - 1;
            }

            this.h();
         }
      }
   }

   public static void n() {
      ab.d();
      n var0 = new n("settings", true);

      try {
         ab.e = var0.e("first");
         ab.Eb = var0.c("music volume");
         ab.Fb = var0.c("sfx volume");
         ab.Ib = var0.e("vibra");
         ab.Jb = var0.e("gfx level");
         ab.Jb = true;
         ab.Kb = var0.f("nickname");
         ab.Lb = var0.c("bots");
         ab.Mb = var0.c("map id");
         ab.m = (byte)(ab.Nb = var0.c("mp mode"));
         ab.n = ab.gc;
         ab.Gb = var0.e("music on");
         ab.Hb = var0.e("sfx on");
         ab.cc = var0.e("blood");
         ab.wb = var0.c("country");
         ab.xb = var0.c("lang");
         ab.yb = var0.e("need update");
         ab.zb = var0.d("last update");
         String var1 = var0.f("version");
         ab.Ab = var0.f("rk");
         ab.Bb = var0.f("gk");
         ab.ec = var0.b("team color");
         ab.dc = var0.b("bots level");
         ab.gc = var0.e("friendly fire");
         ab.fc = var0.b("team balance");
         ab.hc = var0.e("sound detail");
         ab.Db = var0.e("tips");
         ab.Cb = var0.e("weather");
         ab.g = var0.e("wshelp");
         if (!var1.equals(ab.f)) {
            ab.yb = false;
         }

         var0.c();
      } catch (Exception var2) {
         ab.d();
         r();
      }

      if (ab.Bb == null) {
         ab.Bb = "";
      }

      if (ab.Bb.equals("")) {
         ab.d();
         r();
      }
   }

   public static void o() {
      boolean var0 = ab.xc;
      o = ab.Tb;

      while (!ab.e(o)) {
         o--;
         if (var0) {
            break;
         }
      }
   }

   private static void p() {
      boolean var3 = ab.xc;
      ab.e();
      n var0 = new n("autosave", true);

      try {
         ab.Tb = var0.b("levels completed");
         ab.Ub = var0.b("cur level");
         ab.Sb = var0.d("xpn");
         o();
         ab.Qb = var0.c("coins");
         byte var2 = var0.b("wtypes");
         int var1 = 0;

         while (true) {
            if (var1 < var2) {
               ab.Vb[var1] = var0.c("wcount" + var1);
               ab.Yb[var1] = var0.e("wknown" + var1);
               var1++;
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            var2 = var0.b("sks");
            break;
         }

         var1 = 0;

         while (true) {
            if (var1 < var2) {
               ab.Wb[var1] = var0.c("sk" + var1);
               var1++;
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            var2 = var0.b("pitypes");
            break;
         }

         var1 = 0;

         while (true) {
            if (var1 < var2) {
               ab.Xb[var1] = var0.c("picount" + var1);
               ab.Zb[var1] = var0.e("piknown" + var1);
               var1++;
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ab.Ob = var0.b("primr");
            ab.Pb = var0.b("secnd");
            ab.ic = var0.b("lc");
            var0.c();
            break;
         }
      } catch (a var4) {
         var0.c();
      } catch (Exception var5) {
         ab.e();
         t();
      }
   }

   private static void q() {
      boolean var3 = ab.xc;
      ab.f();
      n var0 = new n("btautosave", true);

      try {
         k = ab.Rb = var0.c("btcoins");
         byte var2 = var0.b("wtypes");
         int var1 = 0;

         while (true) {
            if (var1 < var2) {
               ab.jc[var1] = var0.c("wcount" + var1);
               h[var1] = ab.jc[var1];
               var1++;
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            var2 = var0.b("sks");
            break;
         }

         var1 = 0;

         while (true) {
            if (var1 < var2) {
               ab.kc[var1] = var0.c("sk" + var1);
               j[var1] = ab.kc[var1];
               var1++;
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            var2 = var0.b("pitypes");
            break;
         }

         var1 = 0;

         while (true) {
            if (var1 < var2) {
               ab.lc[var1] = var0.c("picount" + var1);
               i[var1] = ab.lc[var1];
               var1++;
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ab.mc = var0.c("bm");
            var0.c();
            break;
         }
      } catch (a var4) {
         var0.c();
      } catch (Exception var5) {
         ab.f();
         u();
      }
   }

   public static void r() {
      new pc().start();
   }

   private static void s() {
      n var0;
      (var0 = new n("settings", false)).b("first", ab.e);
      var0.b("music volume", ab.Eb);
      var0.b("sfx volume", ab.Fb);
      var0.b("vibra", ab.Ib);
      var0.b("gfx level", ab.Jb);
      var0.b("nickname", ab.Kb);
      var0.b("bots", ab.Lb);
      var0.b("map id", ab.Mb);
      var0.b("mp mode", ab.Nb);
      var0.b("music on", ab.Gb);
      var0.b("sfx on", ab.Hb);
      var0.b("blood", ab.cc);
      var0.b("country", ab.wb);
      var0.b("lang", ab.xb);
      var0.b("need update", ab.yb);
      var0.b("last update", ab.zb);
      var0.b("version", ab.f);
      var0.b("rk", "bogesobe");
      var0.b("gk", ab.Bb);
      var0.b("team color", ab.ec);
      var0.b("bots level", ab.dc);
      var0.b("friendly fire", ab.gc);
      var0.b("team balance", ab.fc);
      var0.b("sound detail", ab.hc);
      var0.b("tips", ab.Db);
      var0.b("weather", ab.Cb);
      var0.b("wshelp", ab.g);
      var0.b();
      var0.c();
   }

   public static void c(q var0) {
      boolean var2 = ab.xc;
      if (ab.l == 0) {
         int var1 = 0;

         while (true) {
            if (var1 < 14) {
               ab.Vb[var1] = var0.Yb[var1];
               var1++;
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            }

            var1 = 0;
            break;
         }

         while (true) {
            if (var1 < 11) {
               ab.Wb[var1] = var0.ac[var1];
               var1++;
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            }

            var1 = 0;
            break;
         }

         while (true) {
            if (var1 < 6) {
               ab.Xb[var1] = var0.dc[var1];
               var1++;
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            }

            ab.Ob = (byte)var0.bc;
            ab.Pb = (byte)var0.cc;
            ab.Qb = var0.C;
            t();
            break;
         }
      }
   }

   public static void d(q var0) {
      boolean var2 = ab.xc;
      int var1 = 0;

      q var10000;
      label60:
      while (true) {
         if (var1 < 14) {
            var10000 = var0;
            if (var2) {
               break;
            }

            if (var0 != null) {
               h[var1] = var0.Yb[var1];
            }

            ab.jc[var1] = h[var1];
            var1++;
            if (!var2) {
               continue;
            }
         }

         var1 = 0;

         while (var1 < 11) {
            var10000 = var0;
            if (var2) {
               break label60;
            }

            if (var0 != null) {
               j[var1] = var0.ac[var1];
            }

            ab.kc[var1] = j[var1];
            var1++;
            if (var2) {
               break;
            }
         }

         var1 = 0;

         while (var1 < 6) {
            var10000 = var0;
            if (var2) {
               break label60;
            }

            if (var0 != null) {
               i[var1] = var0.dc[var1];
            }

            ab.lc[var1] = i[var1];
            var1++;
            if (var2) {
               break;
            }
         }

         var10000 = var0;
         break;
      }

      if (var10000 != null) {
         k = var0.C;
      }

      ab.Rb = k;
      u();
   }

   public static void t() {
      new qc().start();
   }

   public static void u() {
      new lc().start();
   }

   private void v() {
      this.wc = 1;
      String var1;
      if ((var1 = x()) == null || !c(var1) || !this.b(var1)) {
         this.w();
      }
   }

   private void w() {
      this.wc = 2;
      String var1;
      if ((var1 = this.y()) == null || !c(var1) || !this.b(var1)) {
         if (n) {
            this.b(11);
         }
      }
   }

   private static String x() {
      try {
         RecordStore var0 = RecordStore.openRecordStore("registration", false);
         String var1 = new String(var0.getRecord(1), "UTF-8");
         var0.closeRecordStore();
         return var1;
      } catch (Exception var2) {
         return null;
      }
   }

   private String y() {
      try {
         DataInputStream var1;
         byte[] var2 = new byte[(var1 = new DataInputStream(this.getClass().getResourceAsStream("/reg.txt"))).available()];
         var1.read(var2);
         return new String(var2, "UTF-8");
      } catch (Exception var3) {
         return null;
      }
   }

   private boolean b(String var1) {
      boolean var6 = ab.xc;
      String[] var2 = rb.b(var1, '\r');
      byte var4 = -1;
      this.xc = new Vector();

      try {
         int var3 = 0;

         boolean var10000;
         while (true) {
            if (var3 < var2.length) {
               String var5;
               var10000 = (var5 = var2[var3]).equals("");
               if (var6) {
                  break;
               }

               label133:
               if (!var10000) {
                  if (var4 == -1) {
                     if (var5.indexOf("[GameInfo]") != -1) {
                        var4 = 0;
                        if (!var6) {
                           break label133;
                        }
                     }

                     if (var5.indexOf("[Countries]") == -1) {
                        break label133;
                     }

                     var4 = 1;
                     if (!var6) {
                        break label133;
                     }
                  }

                  if (var5.indexOf("[end]") != -1) {
                     var4 = -1;
                     if (!var6) {
                        break label133;
                     }
                  }

                  if (var4 == 0) {
                     if (this.wc != 0) {
                        break label133;
                     }

                     if (var5.indexOf("no") != -1) {
                        ab.yb = false;
                        if (!var6) {
                           break label133;
                        }
                     }

                     if (var5.indexOf("yes") == -1) {
                        break label133;
                     }

                     ab.yb = true;
                     if (!var6) {
                        break label133;
                     }
                  }

                  if (var4 == 1) {
                     this.xc.addElement(var5);
                  }
               }

               var3++;
               if (!var6) {
                  continue;
               }
            }

            var10000 = n;
            break;
         }

         if (var10000) {
            ab.zb = System.currentTimeMillis();
            r();
         }

         if (this.xc.size() == 0) {
            return false;
         }

         this.B = 0;
         var3 = 0;

         while (true) {
            if (var3 < this.xc.size()) {
               var15 = this;
               if (var6) {
                  break;
               }

               label99: {
                  if ((var2 = rb.b((String)this.xc.elementAt(var3), ";".charAt(0))) != null && (var2.length >= 10 || this.wc == 3)) {
                     if (Integer.parseInt(var2[1]) != ab.wb) {
                        break label99;
                     }

                     this.B = var3 + 2;
                     if (!var6) {
                        break label99;
                     }
                  }

                  this.xc.removeElementAt(var3);
                  var3--;
               }

               var3++;
               if (!var6) {
                  continue;
               }
            }

            if (!n) {
               return true;
            }

            var15 = this;
            break;
         }

         String var11 = var1;
         qb var9 = var15;

         try {
            label79: {
               var14 = RecordStore.openRecordStore("registration", true);
               byte[] var12 = var11.getBytes("UTF-8");
               if (var14.getNextRecordID() == 1) {
                  var14.addRecord(var12, 0, var12.length);
                  if (!var6) {
                     break label79;
                  }
               }

               var14.setRecord(1, var12, 0, var12.length);
            }

            var14.closeRecordStore();
            var9.J = true;
         } catch (Exception var7) {
         }

         label74: {
            if (this.xc.size() == 1) {
               this.zc = rb.b((String)this.xc.elementAt(0), ";".charAt(0));
               if (!this.p) {
                  this.yc = 2;
                  if (!var6) {
                     break label74;
                  }
               }

               this.yc = 6;
               if (!var6) {
                  break label74;
               }
            }

            this.yc = 1;
         }

         this.z();
         return true;
      } catch (Exception var8) {
         return false;
      }
   }

   private void z() {
      boolean var4;
      label135: {
         var4 = ab.xc;
         ab.o = true;
         if (this.p) {
            this.Rb = 42;
            if (!var4) {
               break label135;
            }
         }

         this.Rb = 0;
      }

      int var2;
      label138: {
         this.H = null;
         var2 = 1;
         this.Db[0] = new gb(0, this, -1, -1);
         if (this.yc == 1) {
            this.G = true;
            this.Cb = this.xc.size() + 2;
            int var1 = 0;

            label126: {
               while (true) {
                  if (var1 < this.xc.size()) {
                     gb[] var10000 = this.Db;
                     int var10001 = var1 + 2;
                     int var10004 = var1 + 2;
                     String var10008 = (String)this.xc.elementAt(var1);
                     char var8 = ";".charAt(0);
                     var10000[var10001] = new gb(var10004, this, 50, 0, rb.b(var10008, var8)[0]);
                     var1++;
                     if (var4) {
                        break;
                     }

                     if (!var4) {
                        continue;
                     }
                  }

                  if (this.B > 0) {
                     var2 = this.B;
                     if (!var4) {
                        break label126;
                     }
                  }
                  break;
               }

               var2 = 2;
            }

            this.Db[1] = new gb(1, this, 62, 0);
            if (!var4) {
               break label138;
            }
         }

         if (this.yc == 2) {
            this.G = ib.c || this.zc[2].equals("1");
            String var5 = ".";
            if (this.zc[7].substring(this.zc[7].length() - 1, this.zc[7].length()).equals(".")) {
               var5 = "";
            }

            label104: {
               this.Cb = 4;
               if (this.G) {
                  this.Db[1] = new gb(
                     1,
                     this,
                     54,
                     0,
                     ib.c(25) + " \n" + this.zc[3] + " " + n(1) + "\n " + ib.c(26) + " " + this.zc[5] + ". " + ib.c(27) + " " + this.zc[7] + var5
                  );
                  if (!var4) {
                     break label104;
                  }
               }

               this.Db[1] = new gb(
                  1,
                  this,
                  54,
                  0,
                  ib.c(25)
                     + "\n "
                     + ab.C.c
                     + this.zc[3]
                     + " "
                     + n(1)
                     + "\n"
                     + ab.C.b
                     + " "
                     + ib.c(26)
                     + ab.C.c
                     + " "
                     + this.zc[5]
                     + ab.C.b
                     + ". "
                     + ib.c(27)
                     + " "
                     + this.zc[7]
                     + var5
               );
            }

            this.Db[2] = new gb(2, this, 52, 0, ib.c(29));
            this.Db[3] = new gb(3, this, 53, 0, ib.c(30));
            var2 = 2;
            if (!var4) {
               break label138;
            }
         }

         if (this.yc == 3) {
            ab.wb = Integer.parseInt(this.zc[1]);
            r();
            this.Cb = 3;
            this.Db[1] = new gb(1, this, 54, 0, ib.c(28) + "\n" + ib.c(34));
            this.Db[2] = new gb(2, this, 53, 0, ib.c(30));
            var2 = 2;
            if (!var4) {
               break label138;
            }
         }

         if (this.yc == 4) {
            this.Cb = 2;
            this.Db[1] = new gb(1, this, 54, 0, ib.c(31));
            var2 = 1;
            if (!var4) {
               break label138;
            }
         }

         if (this.yc == 5) {
            this.Cb = 3;
            this.Db[1] = new gb(1, this, 54, 0, ib.c(32));
            this.Db[2] = new gb(2, this, 53, 0, ib.c(30));
            var2 = 2;
            if (!var4) {
               break label138;
            }
         }

         if (this.yc == 6) {
            this.G = ib.c || this.zc[2].equals("1");
            String var6 = ".";
            if (this.zc[7].substring(this.zc[7].length() - 1, this.zc[7].length()).equals(".")) {
               var6 = "";
            }

            label77: {
               this.Cb = 3;
               if (this.G) {
                  this.Db[1] = new gb(1, this, 54, 0, ib.c(35) + " " + this.I() + " " + ib.c(36) + ib.c(27) + " " + this.zc[8] + var6);
                  if (!var4) {
                     break label77;
                  }
               }

               this.Db[1] = new gb(1, this, 54, 0, ib.c(35) + " " + this.I() + " " + ib.c(36) + ib.c(27) + " " + this.zc[8] + var6);
            }

            this.Db[2] = new gb(2, this, 52, 0, ib.c(29));
            var2 = 2;
            if (!var4) {
               break label138;
            }
         }

         if (this.yc == 7) {
            this.Cb = 2;
            this.Db[1] = new gb(1, this, 54, 0, ib.c(28) + "\n" + ib.c(33));
            var2 = 1;
            this.Sb = false;
            qb var3 = this;
            this.a = true;
            new gc(var3).start();
         }
      }

      this.Cb--;
      if (this.yc != 7) {
         this.h(51);
      }

      this.Ib = 0;
      this.Jb = 0;
      int var7 = 0;

      while (true) {
         if (var7 <= this.Cb) {
            this.a(var7, true);
            var7++;
            if (var4) {
               break;
            }

            if (!var4) {
               continue;
            }
         }

         this.Kb = -1;
         ab.o = false;
         this.c(var2);
         break;
      }

      if (this.C()) {
         this.Fb = 0;
         this.Hb = 0;
      }

      this.c();
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static boolean c(String var0) {
      boolean var7 = ab.xc;
      new StringBuffer().append("str=").append(var0).toString();

      try {
         if (var0.equals("")) {
            return false;
         }
      } catch (Exception var10) {
         return false;
      }

      long var5;
      int var13;
      try {
         var0 = rb.b(var0, '\r');
         String var2 = "";
         var13 = 0;

         while (var13 < var0.length) {
            int var10000 = var0[var13].indexOf(";");
            if (var7) {
               return (boolean)var10000;
            }

            if (var10000 != -1) {
               var2 = var2 + var0[var13].substring(0, var0[var13].length() - 10);
            }

            var13++;
            if (var7) {
               break;
            }
         }

         byte[] var14 = var2.getBytes("UTF-8");
         var5 = 0L;
         var13 = 0;

         byte var17;
         label72: {
            while (var13 < var14.length) {
               var17 = var14[var13];
               if (var7) {
                  break label72;
               }

               int var3;
               label68: {
                  if (var17 < 0) {
                     var3 = var14[var13] + 256;
                     if (!var7) {
                        break label68;
                     }
                  }

                  var3 = var14[var13];
               }

               var5 += var3 + 719 % var3 + var13;
               var13++;
               if (var7) {
                  break;
               }
            }

            long var16;
            var5 = (var16 = 479001599L % var5) % 987654321L;
            new StringBuffer().append("k=").append(var5).toString();
            var17 = 0;
         }

         var13 = var17;
      } catch (Exception var9) {
         return false;
      }

      do {
         try {
            if (var13 >= var0.length) {
               break;
            }

            int var18 = var0[var13].indexOf(";");
            if (var7) {
               return (boolean)var18;
            }

            if (var18 != -1) {
               String var15 = var0[var13].substring(var0[var13].length() - 10, var0[var13].length());
               if (var5 == Long.parseLong(var15)) {
                  return true;
               }
            }
         } catch (Exception var8) {
            break;
         }

         var13++;
      } while (!var7);

      return false;
   }

   private static String n(int var0) {
      boolean var5 = ab.xc;
      String var1 = ab.h;
      if (ab.h.length() > 5) {
         var1 = var1.substring(0, 5);
      }

      String var10000;
      while (true) {
         if (var1.length() < 5) {
            var10000 = "0" + var1;
            if (var5) {
               break;
            }

            var1 = var10000;
            if (!var5) {
               continue;
            }
         }

         var10000 = ab.Bb;
         break;
      }

      String var2 = var10000;
      String var3 = "";
      int var4 = 0;

      while (true) {
         if (var4 < var2.length()) {
            var7 = var4 % 2;
            if (var5) {
               break;
            }

            if (var7 == 0) {
               var3 = var3 + (9 - Integer.parseInt(var2.substring(var4, var4 + 1)));
            }

            var4++;
            if (!var5) {
               continue;
            }
         }

         var7 = m;
         break;
      }

      if (var7 != 0) {
         byte var6 = 2;
         if (!var5) {
            return "bogesobe" + d("" + var1 + var6 + var0) + "r " + d(var3);
         }
      }

      byte var8 = 1;
      return "bogesobe" + d("" + var1 + var8 + var0) + "r " + d(var3);
   }

   private static String d(String var0) {
      boolean var11 = ab.xc;
      if (var0 == null) {
         return "";
      }

      if (var0.equals("")) {
         return "";
      }

      int var1 = Ac.length * Bc.length;
      var0 = var0;
      Vector var2 = new Vector();
      long var7 = Long.parseLong(var0);

      Vector var10000;
      while (true) {
         if (var7 > 0L) {
            long var9 = var7 % var1;
            var7 /= var1;
            var10000 = var2;
            if (var11) {
               break;
            }

            var2.addElement(new Integer((int)var9));
            if (!var11) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      int[] var13 = new int[var10000.size()];
      var1 = 0;

      while (true) {
         if (var1 < var2.size()) {
            var13[var1] = (Integer)var2.elementAt(var2.size() - var1 - 1);
            var1++;
            if (var11) {
               break;
            }

            if (!var11) {
               continue;
            }
         }

         var13 = var13;
         break;
      }

      String var15 = "";
      int var16 = 0;

      while (true) {
         if (var16 < var13.length) {
            var17 = var15 + Ac[var13[var16] / Bc.length] + Bc[var13[var16] % Bc.length];
            if (var11) {
               break;
            }

            var15 = var17;
            var16++;
            if (!var11) {
               continue;
            }
         }

         var17 = var15;
         break;
      }

      return var17;
   }

   private void A() {
      this.z = -1;
      this.y = 0;
   }

   public static void b(Graphics var0, int var1, String var2, boolean var3) {
      int var4;
      label27: {
         if (!var2.equals("") && var3 && ab.D <= 132 && ab.E < 160) {
            var4 = 20;
            if (!ab.xc) {
               break label27;
            }
         }

         int var5 = bb.getWidth() << 1;
         var4 = (ab.E - var5) / 2 - 20;
         int var6 = (ab.D - (bb.getHeight() << 1)) / 2;
         var0.drawRegion(bb, 0, 0, bb.getWidth(), bb.getWidth(), 0, var6, var4, 0);
         var0.drawRegion(bb, 0, 0, bb.getWidth(), bb.getWidth(), 5, var6 + bb.getWidth(), var4, 0);
         var0.drawRegion(bb, 0, 0, bb.getWidth(), bb.getWidth(), 6, var6, var4 + bb.getHeight(), 0);
         var0.drawRegion(bb, 0, 0, bb.getWidth(), bb.getWidth(), 3, var6 + bb.getWidth(), var4 + bb.getHeight(), 0);
         Q.b = var1;
         Q.b((ab.D - Q.d) / 2, (ab.E - Q.e) / 2 - 20);
         Q.b(var0);
         var4 += var5 + 4;
      }

      if (!var2.equals("") && var3) {
         if (ib.c) {
            var0.setColor(255, 255, 255);
            b.c(var0, var2, ab.D / 2, var4, ab.D - 12, 2);
            return;
         }

         ab.C.b(var0, var2, ab.D / 2, var4, ab.D - 12, 2);
      }
   }

   public final void B() {
      if (!this.qb) {
         ab.G.b("/midi/music_menu.mid", 1);
      }
   }

   private boolean C() {
      return this.yc == 2 && this.Rb == 0 && this.Jb > ab.E;
   }

   private int D() {
      return this.Jb + this.vb;
   }

   private void E() {
      boolean var6 = ab.xc;
      n var1 = new n("settings", true);

      try {
         ab.Ab = var1.f("rk");
      } catch (Exception var8) {
         ab.Ab = "";
      }

      if (ab.Ab == null) {
         ab.Ab = "";
      }

      String var2 = ab.Bb;
      String var3 = "";
      String var4 = "";
      int var5 = 0;

      int var10000;
      while (true) {
         if (var5 < var2.length()) {
            var10000 = var5 % 2;
            if (var6) {
               break;
            }

            if (var10000 == 0) {
               var3 = var3 + (9 - Integer.parseInt(var2.substring(var5, var5 + 1)));
            }

            var5++;
            if (!var6) {
               continue;
            }
         }

         var10000 = 0;
         break;
      }

      var5 = var10000;

      while (true) {
         if (var5 < var3.length()) {
            var13 = var4 + (9 - Integer.parseInt(var3.substring(var3.length() - 1 - var5, var3.length() - var5)));
            if (var6) {
               break;
            }

            var4 = var13;
            var5++;
            if (!var6) {
               continue;
            }
         }

         var13 = d(var4);
         break;
      }

      String var12 = var13;
      var3 = "";
      int var9 = 0;

      while (true) {
         if (var9 < ab.Ab.length()) {
            var14 = ab.Ab.charAt(var9);
            if (var6) {
               break;
            }

            if (var14 != ' ') {
               var3 = var3 + ab.Ab.charAt(var9);
            }

            var9++;
            if (!var6) {
               continue;
            }
         }

         var14 = var12.equals(var3);
         break;
      }

      label49: {
         if (var14 != 0) {
            this.s = false;
            if (!var6) {
               break label49;
            }
         }

         this.s = true;
      }

      try {
         var1.c();
      } catch (Exception var7) {
      }
   }

   public final void g(boolean var1) {
      ab.l = 1;
      ab.A.b();
      this.sb = false;
      this.Zb = -1;
      this.l(-1);
   }

   public final void F() {
      this.Rb = 63;
      this.i(14);
      this.h(32);
      this.Wb = this.C;
      this.Kb = -1;
   }

   private static void b(Graphics var0, int var1, int var2) {
      boolean var7 = ab.xc;
      int var5 = Y.getWidth();
      int var6 = Y.getHeight();
      int var3 = 0;

      while (var3 < ab.D) {
         int var4 = ab.E - var2;

         while (true) {
            if (var4 < ab.E) {
               var0.drawImage(Y, var3, var4, 0);
               var4 += var6;
               if (var7) {
                  break;
               }

               if (!var7) {
                  continue;
               }
            }

            var3 += var5;
            break;
         }

         if (var7) {
            break;
         }
      }

      var0.drawImage(Z, (ab.D - Z.getWidth()) / 2 + var1, ab.E - var2 - Z.getHeight(), 0);
   }

   private void h(boolean var1) {
      boolean var8;
      label120: {
         var8 = ab.xc;
         this.Rb = 14;
         this.Sb = false;
         this.Ub = false;
         this.p = var1;
         if (!this.p) {
            this.Wb = this.C;
            if (!var8) {
               break label120;
            }
         }

         this.Wb = 2;
      }

      if (ab.j.indexOf("JAD") == -1) {
         if (this.J || ab.j.indexOf("NOGPRS") != -1) {
            this.v();
         } else {
            this.I = new rb(
               "http://get.pipyakas.com/pipyaka/pipyaka.php?p=4&dn="
                  + ab.h
                  + "&vr="
                  + ab.f
                  + "&build=0"
                  + "&manufacturer="
                  + lb.b()
                  + "&model="
                  + lb.c()
                  + "&level_completed="
                  + ab.Tb
                  + "&hasPointerEvents="
                  + rc.e
                  + "&cps="
                  + fb.s
                  + "&fps="
                  + fb.p,
               120000L
            );
         }
      } else {
         boolean var2;
         String var3;
         label112: {
            var9 = this;
            this.wc = 3;
            var2 = true;
            var3 = "";
            String var5 = "country1";
            if (midlet.a.getAppProperty(var5) != null) {
               int var4 = 0;

               label108: {
                  do {
                     var5 = "country" + (var4 + 1);
                     if (midlet.a.getAppProperty(var5) == null) {
                        break;
                     }

                     var4++;
                     if (var8) {
                        break label108;
                     }
                  } while (!var8);

                  if (var4 == 0) {
                     var2 = false;
                  }
               }

               int var7 = 0;

               while (var7 < var4) {
                  var5 = "country" + (var7 + 1);
                  if (var8) {
                     break label112;
                  }

                  if ((var5 = midlet.a.getAppProperty(var5)) == null) {
                     var2 = false;
                     if (!var8) {
                        break label112;
                     }
                  }

                  label94: {
                     int var6;
                     if ((var6 = var5.indexOf(";")) == -1) {
                        var3 = var3 + var5.trim();
                        if (!var8) {
                           break label94;
                        }
                     }

                     var3 = var3 + var5.substring(0, var6).trim();
                  }

                  var3 = var3 + ";" + var7 + ";1;";
                  var5 = "country" + (var7 + 1) + "_text1";
                  if ((var5 = midlet.a.getAppProperty(var5)) == null) {
                     var2 = false;
                     if (!var8) {
                        break label112;
                     }
                  }

                  var3 = var3 + var5.trim() + " ;";
                  var5 = "country" + (var7 + 1) + "_text2";
                  if ((var5 = midlet.a.getAppProperty(var5)) == null) {
                     var2 = false;
                     if (!var8) {
                        break label112;
                     }
                  }

                  var3 = var3 + var5.trim() + " ;";
                  var5 = "country" + (var7 + 1) + "_number1";
                  if ((var5 = midlet.a.getAppProperty(var5)) == null) {
                     var2 = false;
                     if (!var8) {
                        break label112;
                     }
                  }

                  var3 = var3 + var5.trim() + ";";
                  var5 = "country" + (var7 + 1) + "_number2";
                  if ((var5 = midlet.a.getAppProperty(var5)) == null) {
                     var2 = false;
                     if (!var8) {
                        break label112;
                     }
                  }

                  var3 = var3 + var5.trim() + ";";
                  var5 = "country" + (var7 + 1) + "_cost1";
                  if ((var5 = midlet.a.getAppProperty(var5)) == null) {
                     var2 = false;
                     if (!var8) {
                        break label112;
                     }
                  }

                  var3 = var3 + var5.trim() + ";";
                  var5 = "country" + (var7 + 1) + "_cost2";
                  if ((var5 = midlet.a.getAppProperty(var5)) == null) {
                     var2 = false;
                     if (!var8) {
                        break label112;
                     }
                  }

                  var3 = var3 + var5.trim() + ";";
                  var3 = var3 + "225;";
                  var3 = var3 + '\r';
                  var7++;
                  if (var8) {
                     break;
                  }
               }

               if (!var8) {
                  break label112;
               }
            }

            var2 = false;
         }

         if (!var2) {
            var9.w();
            if (!var8) {
               return;
            }
         }

         if (!var9.b("[Countries]\r" + var3 + "[end]" + '\r')) {
            var9.w();
         }
      }
   }

   public final void G() {
      this.b(this.bc, true, m, this.qb, this.d);
   }

   public final int H() {
      return m && !this.qb ? k : this.bc.C;
   }

   public final void o(int var1) {
      if (m && !this.qb) {
         k += var1;
      } else {
         this.bc.C += var1;
         fb.I.j = "^41~" + this.bc.C;
      }
   }

   public final int I() {
      int var1;
      try {
         var1 = Integer.parseInt(this.zc[9]);
      } catch (Exception var2) {
         var1 = ab.ic;
      }

      if (var1 == 0) {
         var1 = 200;
      }

      this.Cc = var1;

      try {
         if (m) {
            if (ab.Rb < 700) {
               return var1;
            }

            var1 += ab.Rb / 50 * 5;
            if (!ab.xc) {
               return var1;
            }
         }

         if (ab.Qb >= 700) {
            var1 += ab.Qb / 50 * 5;
         }

         return var1;
      } catch (Exception var3) {
         return var1;
      }
   }

   public final void J() {
      this.l(-2);
   }

   public final void K() {
      label94: {
         boolean var6 = ab.xc;
         if (ab.Ub < 5) {
            this.l(ab.Ub);
         } else {
            n var1 = new n("settings", true);

            try {
               ab.Ab = var1.f("rk");
               var1.c();
            } catch (Exception var8) {
               ab.Ab = "";
            }

            if (ab.Ab == null) {
               ab.Ab = "";
            }

            String var2 = ab.Bb;
            String var3 = "";
            String var4 = "";
            int var5 = 0;

            int var10000;
            while (true) {
               if (var5 < var2.length()) {
                  var10000 = var5 % 2;
                  if (var6) {
                     break;
                  }

                  if (var10000 == 0) {
                     var3 = var3 + (9 - Integer.parseInt(var2.substring(var5, var5 + 1)));
                  }

                  var5++;
                  if (!var6) {
                     continue;
                  }
               }

               var10000 = 0;
               break;
            }

            var5 = var10000;

            while (var5 < var3.length()) {
               var4 = var4 + (9 - Integer.parseInt(var3.substring(var3.length() - 1 - var5, var3.length() - var5)));
               var5++;
               if (var6) {
                  return;
               }

               if (var6) {
                  break;
               }
            }

            String var12 = d(var4);
            var3 = "";
            int var9 = 0;

            while (true) {
               if (var9 < ab.Ab.length()) {
                  var13 = ab.Ab.charAt(var9);
                  if (var6) {
                     break;
                  }

                  if (var13 != ' ') {
                     var3 = var3 + ab.Ab.charAt(var9);
                  }

                  var9++;
                  if (!var6) {
                     continue;
                  }
               }

               try {
                  var1.c();
               } catch (Exception var7) {
               }

               var13 = var12.equals(var3);
               break;
            }

            if (var13 == 0) {
               break label94;
            }

            this.l(ab.Ub);
            if (var6) {
               break label94;
            }
         }

         return;
      }

      this.l(-3);
   }

   public final void L() {
      int var1 = this.c.f;
      this.c.c();
      this.c = null;
      if (var1 == 3) {
         this.c(this.Wb);
      } else {
         if (var1 == 7) {
            this.h(false);
         }
      }
   }

   private void M() {
      ab.o = true;
      this.c = new tb();
      this.c.f = 7;
      Q.b = 4;
      this.c.b(Q);
      this.c.b(ib.c(64));
      this.c.b();
      ab.o = false;
   }

   static boolean b(qb var0) {
      return var0.mc;
   }

   static int c(qb var0) {
      return var0.nc;
   }

   static int d(qb var0) {
      return var0.oc;
   }

   static void e(qb var0) {
      var0.E();
   }

   static boolean f(qb var0) {
      return var0.qc;
   }

   static cb g(qb var0) {
      return var0.Xb;
   }

   static cb b(qb var0, cb var1) {
      return var0.Xb = null;
   }

   static boolean h(qb var0) {
      return var0.rc;
   }

   static boolean i(qb var0) {
      return var0.sc;
   }

   static boolean b(qb var0, boolean var1) {
      return var0.Sb = false;
   }

   static boolean j(qb var0) {
      return var0.tc;
   }

   static boolean c(qb var0, boolean var1) {
      return var0.sc = false;
   }

   static boolean d(qb var0, boolean var1) {
      return var0.tc = false;
   }

   static void N() {
      s();
   }

   static int b(qb var0, int var1) {
      return var0.D = var1;
   }

   static int k(qb var0) {
      return var0.Cc;
   }

   static int c(qb var0, int var1) {
      return var0.E = 0;
   }

   static boolean e(qb var0, boolean var1) {
      return var0.a = false;
   }
}
