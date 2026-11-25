import java.util.Random;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Image;

public final class ab {
   public static boolean b = false;
   public static boolean c = false;
   public static boolean d = true;
   public static boolean e;
   public static String f = "";
   public static boolean g;
   public static String h;
   public static String i;
   public static String j;
   public static long k;
   public static int l;
   public static byte m = 0;
   public static boolean n;
   public static boolean o = true;
   public static boolean p = false;
   public static int q = 0;
   public static final int[] r = new int[]{91, 109};
   public static byte s = 1;
   public static int t = -1;
   public static int u = -1;
   public static boolean v = false;
   public static boolean w = false;
   public static int x = 0;
   public static int y = 0;
   public static rc z;
   public static fb A;
   public static qb B;
   public static b C;
   public static int D;
   public static int E;
   public static Font F = null;
   public static ub G;
   public static int H;
   public static int I;
   public static int J;
   public static int K;
   public static int L;
   public static int M;
   public static int N;
   public static int O;
   public static int P;
   public static int Q;
   public static int R;
   public static int S;
   public static int T;
   public static int U;
   public static int V;
   public static int W;
   public static int X;
   public static int Y;
   public static int Z;
   public static int ab;
   public static int bb = 0;
   public static int cb = 0;
   public static int db = 0;
   private static int eb = 0;
   private static int fb = 0;
   public static final byte[] gb = new byte[]{0, -1, 0, 1};
   public static final byte[] hb = new byte[]{1, 0, -1, 0};
   public static int ib;
   public static int jb;
   public static int kb;
   public static int lb;
   public static int mb;
   public static int nb;
   public static int ob;
   public static int pb;
   public static int qb;
   public static int rb;
   public static int sb;
   public static int tb;
   public static int ub;
   public static int vb;
   public static int wb;
   public static int xb;
   public static boolean yb;
   public static long zb;
   public static String Ab;
   public static String Bb;
   public static boolean Cb;
   public static boolean Db;
   public static int Eb;
   public static int Fb;
   public static boolean Gb;
   public static boolean Hb;
   public static boolean Ib;
   public static boolean Jb;
   public static String Kb;
   public static int Lb;
   public static int Mb;
   public static int Nb;
   public static byte Ob;
   public static byte Pb;
   public static int Qb;
   public static int Rb;
   public static long Sb;
   public static byte Tb;
   public static byte Ub;
   public static int[] Vb;
   public static int[] Wb;
   public static int[] Xb;
   public static boolean[] Yb;
   public static boolean[] Zb;
   public static int bc = 0;
   public static boolean cc;
   public static byte dc;
   public static byte ec;
   public static byte fc;
   public static boolean gc;
   public static boolean hc;
   public static int ic;
   public static int[] jc;
   public static int[] kc;
   public static int[] lc;
   public static int mc;
   public static boolean nc = false;
   public static Random oc;
   public static int pc;
   public static int qc;
   public static int rc;
   public static int sc;
   public static byte tc = 0;
   public static byte uc = 2;
   public static byte vc = 3;
   private static String wc = "";
   public static boolean xc;

   public static void b() {
      (C = new b("/font/font.png", "/font/font.txt", "/font/font.cfg", null)).d = "`1~";
      C.c = "`0~";
      b.m = b("font/numbers_big.png", 14, 17);
      b.b();
   }

   public static void c() {
      bb = (int)Runtime.getRuntime().totalMemory() / 1000;
      cb = (int)Runtime.getRuntime().freeMemory() / 1000;
      if (bb - cb > db) {
         db = bb - cb;
      }

      if (eb == 0) {
         eb = Display.getDisplay(midlet.a).numColors();
      }

      if (fb == 0) {
         fb = Display.getDisplay(midlet.a).numAlphaLevels();
      }
   }

   public static void d() {
      boolean var3 = xc;
      g = true;
      e = true;
      jb = -6;
      kb = -7;
      lb = -21;
      mb = -22;
      nb = 56;
      ob = 52;
      pb = 50;
      qb = 54;
      rb = 53;
      ub = 48;
      vb = 48;
      sb = 42;
      tb = 42;
      ib = 49;
      Ib = true;
      Nb = 0;
      m = 0;
      n = false;
      Lb = 0;
      Mb = 0;
      Db = true;
      ec = 0;
      dc = 1;
      gc = false;
      fc = 0;
      Eb = 40;
      Fb = 40;
      Gb = true;
      Hb = true;
      cc = false;
      wb = -1;
      xb = -1;
      yb = false;
      zb = 0L;
      Ab = "";
      String var0 = "11111111111111";
      if ("11111111111111".equals("")) {
         var0 = "" + System.currentTimeMillis();
      }

      if (var0.length() > 14) {
         var0 = var0.substring(var0.length() - 14, var0.length());
      }

      String var10000;
      while (true) {
         if (var0.length() < 14) {
            var10000 = "0" + var0;
            if (var3) {
               break;
            }

            var0 = var10000;
            if (!var3) {
               continue;
            }
         }

         var10000 = "";
         break;
      }

      String var1 = var10000;
      int var2 = var0.length() - 1;

      while (true) {
         if (var2 >= 0) {
            var1 = var1 + var0.charAt(var2);
            var2--;
            if (var3) {
               break;
            }

            if (!var3) {
               continue;
            }
         }

         Bb = var1;
         Jb = false;
         break;
      }

      try {
         boolean var5;
         hc = var5 = System.getProperty("microedition.platform").toLowerCase().indexOf("ericsson") != -1;
         Cb = var5;
         if (var5) {
            Cb = true;
         }
      } catch (Exception var4) {
         hc = false;
         Cb = false;
      }

      Jb = true;
      hc = false;
      Cb = false;
      if ((Kb = c(Kb = n.e())).equals("")) {
         Kb = "Player";
      }

      Kb = Kb.substring(0, 1).toUpperCase() + Kb.substring(1, Kb.length()).toLowerCase();
      e();
      f();
   }

   public static void e() {
      boolean var1 = xc;
      Tb = 0;
      Ub = 0;
      Sb = 0L;
      Vb = new int[14];
      Yb = new boolean[14];
      int var0 = 0;

      while (true) {
         if (var0 < 14) {
            Vb[var0] = 0;
            Yb[var0] = false;
            var0++;
            if (var1) {
               break;
            }

            if (!var1) {
               continue;
            }
         }

         Vb[0] = 50;
         Yb[0] = true;
         ic = 200;
         Qb = 0;
         Wb = new int[11];
         break;
      }

      var0 = 0;

      while (true) {
         if (var0 < 11) {
            Wb[var0] = 0;
            var0++;
            if (var1) {
               break;
            }

            if (!var1) {
               continue;
            }
         }

         Xb = new int[6];
         Zb = new boolean[6];
         break;
      }

      var0 = 0;

      while (true) {
         if (var0 < 6) {
            Xb[var0] = 0;
            Zb[var0] = false;
            var0++;
            if (var1) {
               break;
            }

            if (!var1) {
               continue;
            }
         }

         Xb[5] = 3;
         Zb[5] = true;
         Ob = 0;
         Pb = -1;
         qb.o();
         break;
      }
   }

   public static void f() {
      boolean var1 = xc;
      qb.h = new int[14];
      qb.i = new int[6];
      qb.j = new int[11];
      Rb = 0;
      qb.k = 0;
      jc = new int[14];
      int var0 = 0;

      while (true) {
         if (var0 < 14) {
            qb.h[var0] = hb.g[var0];
            jc[var0] = hb.g[var0];
            var0++;
            if (var1) {
               break;
            }

            if (!var1) {
               continue;
            }
         }

         mc = 0;
         kc = new int[11];
         break;
      }

      var0 = 0;

      while (true) {
         if (var0 < 11) {
            kc[var0] = 0;
            qb.j[var0] = 0;
            var0++;
            if (var1) {
               break;
            }

            if (!var1) {
               continue;
            }
         }

         lc = new int[6];
         break;
      }

      var0 = 0;

      while (var0 < 6) {
         qb.i[var0] = hb.h[var0];
         lc[var0] = hb.h[var0];
         var0++;
         if (var1) {
            break;
         }
      }
   }

   public static boolean g() {
      return fb.L == 0 ? true : m == 1 || m == 2;
   }

   public static byte[] b(int var0) {
      byte[] var1;
      (var1 = new byte[4])[3] = (byte)var0;
      var1[2] = (byte)(var0 >> 8 & 0xFF);
      var1[1] = (byte)(var0 >> 16 & 0xFF);
      var1[0] = (byte)(var0 >> 24);
      return var1;
   }

   public static int b(byte[] var0) {
      return b(var0[0], var0[1], var0[2], var0[3]);
   }

   public static int b(byte var0, byte var1, byte var2, byte var3) {
      int[] var4;
      (var4 = new int[4])[0] = var0 & 255;
      var4[1] = var1 & 255;
      var4[2] = var2 & 255;
      var4[3] = var3 & 255;
      return (var4[0] << 24) + (var4[1] << 16) + (var4[2] << 8) + var4[3];
   }

   public static byte[] b(int[] var0) {
      boolean var6 = xc;
      byte[] var1 = new byte[var0.length << 2];
      int var4 = 0;
      int var2 = 0;

      byte[] var10000;
      while (true) {
         if (var2 < var0.length) {
            var10000 = b(var0[var2]);
            if (var6) {
               break;
            }

            byte[] var5 = var10000;
            int var3 = 0;

            label27: {
               while (var3 < 4) {
                  var1[var4] = var5[var3];
                  var4++;
                  var3++;
                  if (var6) {
                     break label27;
                  }

                  if (var6) {
                     break;
                  }
               }

               var2++;
            }

            if (!var6) {
               continue;
            }
         }

         var10000 = var1;
         break;
      }

      return var10000;
   }

   public static int[] c(byte[] var0) {
      boolean var4 = xc;
      int[] var1 = new int[var0.length / 4];
      byte var2 = 0;
      int var3 = 0;

      int[] var10000;
      while (true) {
         if (var3 < var1.length) {
            var10000 = var1;
            if (var4) {
               break;
            }

            var1[var3] = b(var0[var2], var0[var2 + 1], var0[var2 + 2], var0[var2 + 3]);
            var2 += 4;
            var3++;
            if (!var4) {
               continue;
            }
         }

         var10000 = var1;
         break;
      }

      return var10000;
   }

   public static boolean b(int var0, int var1, int var2, int var3, int var4, int var5) {
      return var0 >= 0 && var1 >= 0 && var0 <= var4 + 0 && var1 <= var5 + 0;
   }

   public static pb b(String var0, int var1, int var2) {
      Image var3;
      try {
         var3 = Image.createImage("/" + var0);
      } catch (Exception var5) {
         new StringBuffer().append("11111111111111").append(var0).toString();
         return null;
      }

      try {
         return new pb(var3, var1, var2);
      } catch (Exception var4) {
         new StringBuffer().append("11111111111111").append(var0).toString();
         return null;
      }
   }

   public static void h() {
      if (ub.c) {
         R = G.b("/explosion.wav", 1, 200);
         N = G.b("/jump.wav", 1, 190);
         T = G.b("/heal.wav", 1, 180);
         I = G.b("/open.wav", 1, 170);
         Z = G.b("/denied.wav", 1, 175);
         Q = G.b("/egg.wav", 0, 160);
         ab = G.b("/thunder.wav", 1, 155);
         V = G.b("/put.wav", 0, 150);
         W = G.b("/rake.wav", 1, 140);
         U = G.b("/infect.wav", 1, 130);
         O = G.b("/buy.wav", 0, 120);
         S = G.b("/get.wav", 0, 110);
         P = G.b("/boink.wav", 0, 100);
         L = G.b("/death1.wav", 0, 70);
         M = G.b("/death2.wav", 0, 70);
         J = G.b("/pain1.wav", 0, 50);
         K = G.b("/pain2.wav", 0, 50);
         Y = G.b("/throw.wav", 0, 30);
         H = G.b("/move.wav", 0, 20);
         X = G.b("/step.wav", 0, 10);
      }
   }

   public static int i() {
      return Hb ? Fb : 0;
   }

   public static int j() {
      return Gb ? Eb : 0;
   }

   public static void b(String var0) {
      wc = wc + var0 + " ";
   }

   public static void k() {
      new dc().start();
   }

   public static String b(String var0, int var1, b var2) {
      boolean var6 = xc;
      if (var2.b(var0) <= var1) {
         return var0;
      }

      int var3;
      String var4;
      String var9;
      if ((var3 = var0.indexOf(b.g)) < 0) {
         var4 = var0;
         var9 = "";
      } else {
         var4 = var0.substring(0, var3);
         var9 = var0.substring(var3, var0.length());
      }

      var1 = var1 - var2.b(var9) - var2.b("...");
      var0 = "";
      int var5 = 0;

      String var10000;
      while (true) {
         label29:
         if (var5 < var4.length()) {
            var10000 = var0 + var4.charAt(var5);
            if (var6) {
               break;
            }

            var0 = var10000;
            if (var2.b(var0) > var1) {
               var0 = var0.substring(0, var0.length() - 1) + "...";
               if (!var6) {
                  break label29;
               }
            }

            var5++;
            if (!var6) {
               continue;
            }
         }

         var10000 = var0 + var9;
         break;
      }

      return var10000;
   }

   public static void c(int var0) {
      if (j() != 0 && ub.b) {
         if (var0 == 0 || var0 > 2) {
            G.b("/midi/music_game" + oc.nextInt(2) + ".mid", 0);
            return;
         }

         G.b("/midi/music_game" + (var0 - 1) + ".mid", 0);
      }
   }

   public static String c(String var0) {
      boolean var4 = xc;
      String var3 = "";
      int var1 = 0;

      String var10000;
      while (true) {
         if (var1 < var0.length()) {
            var10000 = var0;
            if (var4) {
               break;
            }

            char var2;
            String var5;
            if ((var2 = var0.charAt(var1)) == 1072 || var2 == 1040) {
               var5 = "a";
            } else if (var2 == 1073 || var2 == 1041) {
               var5 = "b";
            } else if (var2 == 1074 || var2 == 1042) {
               var5 = "v";
            } else if (var2 == 1075 || var2 == 1043) {
               var5 = "g";
            } else if (var2 == 1076 || var2 == 1044) {
               var5 = "d";
            } else if (var2 == 1077 || var2 == 1045) {
               var5 = "e";
            } else if (var2 == 1105 || var2 == 1025) {
               var5 = "e";
            } else if (var2 == 1078 || var2 == 1046) {
               var5 = "zh";
            } else if (var2 == 1079 || var2 == 1047) {
               var5 = "z";
            } else if (var2 == 1080 || var2 == 1048) {
               var5 = "i";
            } else if (var2 == 1081 || var2 == 1049) {
               var5 = "j";
            } else if (var2 == 1082 || var2 == 1050) {
               var5 = "k";
            } else if (var2 == 1083 || var2 == 1051) {
               var5 = "l";
            } else if (var2 == 1084 || var2 == 1052) {
               var5 = "m";
            } else if (var2 == 1085 || var2 == 1053) {
               var5 = "n";
            } else if (var2 == 1086 || var2 == 1054) {
               var5 = "o";
            } else if (var2 == 1087 || var2 == 1055) {
               var5 = "p";
            } else if (var2 == 1088 || var2 == 1056) {
               var5 = "r";
            } else if (var2 == 1089 || var2 == 1057) {
               var5 = "s";
            } else if (var2 == 1090 || var2 == 1058) {
               var5 = "t";
            } else if (var2 == 1091 || var2 == 1059) {
               var5 = "u";
            } else if (var2 == 1092 || var2 == 1060) {
               var5 = "f";
            } else if (var2 == 1093 || var2 == 1061) {
               var5 = "h";
            } else if (var2 == 1094 || var2 == 1062) {
               var5 = "ts";
            } else if (var2 == 1095 || var2 == 1063) {
               var5 = "ch";
            } else if (var2 == 1096 || var2 == 1064) {
               var5 = "sh";
            } else if (var2 == 1097 || var2 == 1065) {
               var5 = "sch";
            } else if (var2 == 1098 || var2 == 1066) {
               var5 = "";
            } else if (var2 == 1099 || var2 == 1067) {
               var5 = "y";
            } else if (var2 == 1100 || var2 == 1068) {
               var5 = "'";
            } else if (var2 == 1101 || var2 == 1069) {
               var5 = "e";
            } else if (var2 == 1102 || var2 == 1070) {
               var5 = "ju";
            } else if (var2 != 1103 && var2 != 1071) {
               var5 = "" + var2;
            } else {
               var5 = "ja";
            }

            var3 = var3 + var5;
            var1++;
            if (!var4) {
               continue;
            }
         }

         var10000 = var3;
         break;
      }

      return var10000;
   }

   public static String d(int var0) {
      return "campaign/map" + var0 + ".map";
   }

   public static boolean e(int var0) {
      try {
         return midlet.a.getClass().getResourceAsStream("/maps/" + d(var0)).available() != 0;
      } catch (Exception var1) {
         return false;
      }
   }

   public static void b(int var0, int var1) {
      if (!fb.i() && fb.M && (mc = mc - var1 * 10 * hb.d[var0] / hb.b[var0]) < 0) {
         mc = 0;
      }
   }

   public static void c(int var0, int var1) {
      if (!fb.i() && fb.M && (mc = mc - var1 * 10 * hb.e[var0] / hb.c[var0]) < 0) {
         mc = 0;
      }
   }

   public static void f(int var0) {
      if ((mc += var0 * 500) < 0) {
         mc = 0;
      }
   }
}
