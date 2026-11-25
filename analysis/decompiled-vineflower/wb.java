import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class wb {
   public static boolean b = false;
   private static boolean d = false;
   private static boolean e = false;
   private static boolean f = false;
   private static int g = 2;
   private static int h = 3 * g;
   private static boolean i = false;
   private static int j = 0;
   private static int k;
   private static int l;
   private static int[] m = new int[]{
      2, 15, 31, 43, 53, 62, 72, 88, 99, 106, 116, 126, 130, 140, 9, 20, 28, 37, 45, 54, 64, 71, 119, 26, 43, 49, 61, 70, 83, 95, 107, 132
   };
   private static int[] n = new int[]{1, 5, 9, 11, 11, 10, 8, 8, 10, 12, 14, 15, 15, 14, 3, 6, 8, 10, 11, 11, 10, 9, 4, 8, 11, 11, 10, 8, 8, 9, 12, 5};
   private static int[] o = new int[m.length];
   private static int[] p = new int[m.length];
   private static int[] q = new int[m.length];
   private static int[] r = new int[m.length];
   private static int[] s = new int[m.length];
   private static int[] t = new int[]{5, 4, 3, 1, 0, 0, 0, 0, -1, -3, -4, -5, 2, 1, 0, -1, -2};
   private static int u;
   public static int v;
   public static int w;
   public static int x;
   public static int y;
   public static Vector z;
   public static Image[] A;
   public static Image[] B;
   public static Image[] C;
   private static Image[] D;
   public static pb[] E;
   public static Image F;
   private static pb G;
   private static pb H;
   private static pb I;
   public static int J = -1;
   public static int K;
   public static int L;
   public static int M;
   private static int N;
   private static int O;
   public static boolean P;
   private static int Q = 0;
   private static int R = -1;
   private static int S;
   private static int T;
   private static int U = 0;

   public static void b() {
      new mc().start();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void c() {
      boolean var2 = ab.xc;

      try {
         label124: {
            A = new Image[5];
            B = new Image[3];
            C = new Image[3];
            int var0 = 0;

            int var10000;
            int var10001;
            while (true) {
               if (var0 < 5) {
                  A[var0] = Image.createImage("/intro/hills" + (var0 + 1) + ".png");
                  var10000 = var0;
                  var10001 = 3;
                  if (var2) {
                     break;
                  }

                  if (var0 < 3) {
                     B[var0] = Image.createImage("/intro/cloud_b" + (var0 + 1) + ".png");
                     C[var0] = Image.createImage("/intro/cloud_s" + (var0 + 1) + ".png");
                  }

                  var0++;
                  if (!var2) {
                     continue;
                  }
               }

               D = new Image[m.length];
               var0 = 0;
               var10000 = var0;
               var10001 = m.length;
               break;
            }

            while (var10000 < var10001) {
               D[var0] = Image.createImage("/intro/w" + (var0 + 1) + ".png");
               var0++;
               if (var2) {
                  break label124;
               }

               if (var2) {
                  break;
               }

               var10000 = var0;
               var10001 = m.length;
            }

            (E = new pb[2])[0] = new pb(Image.createImage("/intro/leaf1.png"), 6, 6);
            E[1] = new pb(Image.createImage("/intro/leaf2.png"), 8, 8);
            F = Image.createImage("/intro/star.png");
            G = ab.b("intro/skip.png", 28, 28);
            S = -(H = ab.b("intro/bombaka_house_v1.png", 63, 63)).d;
            T = 5 + ab.E / 8;
            I = ab.b("intro/pro_blood_short.png", 100, 73);
            qb.M = ab.b("menu/loading.png", 34, 34);
         }
      } catch (Exception var3) {
      }

      K = ab.D / 60 + 1;
      L = ab.D / 180 + 1;
      M = ab.D / 90 + 1;
      z = new Vector();
      v = 0;
      x = -(y = (ab.E << 1) / 3) * 10;
      w = 0;
      int var4 = 0;

      while (true) {
         if (var4 < ab.D) {
            x var5 = new x(0, var4 + ab.oc.nextInt(ab.D / 8 + 20), y);
            z.addElement(var5);
            var4 = var5.c + var5.e;
            if (var2) {
               break;
            }

            if (!var2) {
               continue;
            }
         }

         var4 = 0;
         break;
      }

      int var12;
      label87: {
         label86:
         while (true) {
            int var13;
            if (var4 < ab.D) {
               int var1;
               var12 = var1 = y - A[0].getHeight() - B[0].getHeight() + 30;
               var13 = 2;
               if (!var2) {
                  if (var12 < 2) {
                     var1 = 2;
                  }

                  x var6 = new x(1, var4 + ab.oc.nextInt(ab.D / 5), ab.oc.nextInt(var1) - 30);
                  z.addElement(var6);
                  var4 = var6.c + var6.e;
                  if (!var2) {
                     continue;
                  }

                  var4 = 0;
                  var12 = var4;
                  var13 = ab.D;
               }
            } else {
               var4 = 0;
               var12 = var4;
               var13 = ab.D;
            }

            while (true) {
               label75: {
                  if (var12 < var13) {
                     int var8;
                     var12 = var8 = y / 2 - C[0].getHeight();
                     var13 = 2;
                     if (var2) {
                        break label75;
                     }

                     if (var12 < 2) {
                        var8 = 2;
                     }

                     x var7 = new x(2, var4 + ab.oc.nextInt(ab.D / 4), ab.oc.nextInt(var8) + y / 2);
                     z.addElement(var7);
                     var4 = var7.c + var7.e;
                     if (!var2) {
                        var12 = var4;
                        var13 = ab.D;
                        continue;
                     }

                     var4 = 0;
                  } else {
                     var4 = 0;
                  }

                  var12 = var4;
                  var13 = ab.E / 40;
               }

               while (true) {
                  if (var12 >= var13) {
                     break label86;
                  }

                  int var9;
                  var12 = var9 = y - 20;
                  if (var2) {
                     break label87;
                  }

                  if (var12 < 2) {
                     var9 = 2;
                  }

                  z.addElement(new x(3, ab.D + ab.oc.nextInt(ab.D / 2), ab.oc.nextInt(var9)));
                  var4++;
                  if (var2) {
                     break label86;
                  }

                  var12 = var4;
                  var13 = ab.E / 40;
               }
            }
         }

         P = true;
         var12 = 1;
      }

      d = (boolean)var12;
   }

   public static void d() {
      boolean var1 = ab.xc;
      z.removeAllElements();
      z = null;
      int var0 = 0;

      while (true) {
         if (var0 < A.length) {
            A[var0] = null;
            var0++;
            if (var1) {
               break;
            }

            if (!var1) {
               continue;
            }
         }

         A = null;
         break;
      }

      var0 = 0;

      while (true) {
         if (var0 < B.length) {
            B[var0] = null;
            var0++;
            if (var1) {
               break;
            }

            if (!var1) {
               continue;
            }
         }

         B = null;
         break;
      }

      var0 = 0;

      while (true) {
         if (var0 < C.length) {
            C[var0] = null;
            var0++;
            if (var1) {
               break;
            }

            if (!var1) {
               continue;
            }
         }

         C = null;
         break;
      }

      var0 = 0;

      while (true) {
         if (var0 < D.length) {
            D[var0] = null;
            var0++;
            if (var1) {
               break;
            }

            if (!var1) {
               continue;
            }
         }

         D = null;
         break;
      }

      var0 = 0;

      while (true) {
         if (var0 < E.length) {
            E[var0] = null;
            var0++;
            if (var1) {
               break;
            }

            if (!var1) {
               continue;
            }
         }

         E = null;
         F = null;
         G = null;
         H = null;
         I = null;
         System.gc();
         break;
      }
   }

   public static void b(int var0) {
      if (!ab.p && !b && d && v > 0 && !i) {
         if (e) {
            if (var0 == ab.jb || var0 == ab.kb || var0 == ab.lb || var0 == ab.mb) {
               f = true;
               return;
            }
         } else {
            if (var0 == ab.jb || var0 == ab.lb) {
               f = true;
               ab.Gb = true;
               ab.Eb = 50;
               ab.Hb = true;
               ab.Fb = 50;
               ab.G.b("/midi/music_menu.mid", 2);
               return;
            }

            if (var0 == ab.kb || var0 == ab.mb) {
               ab.Gb = false;
               ab.Eb = 0;
               ab.Hb = false;
               ab.Fb = 0;
               ab.G.f();
               f = true;
            }
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void b(Graphics var0) {
      boolean var8 = ab.xc;
      if (Q > 240) {
         Q = 240;
      }

      int var1 = 160 + 80 * Q / 240;
      int var2 = 240 - 220 * Q / 240;
      int var3 = 60 - 60 * Q / 240;
      int var4 = 30 + 30 * Q / 240;
      int var5 = 60 - 60 * Q / 240;
      var0.setColor(0);
      var0.fillRect(0, 0, ab.D, ab.E);
      if (d) {
         label389:
         if (v >= 0) {
            int var6;
            int var30;
            int var34;
            label387: {
               label386: {
                  var6 = x / 10;
                  if (y + var6 > 0) {
                     byte var7 = 0;

                     while (var7 < y) {
                        var0.setColor(var1 - (var1 - var4) * var7 / y, var2 - (var2 - var5) * var7 / y, var3 - var3 * var7 / y);
                        var0.fillRect(0, y + var6 - var7 - 2, ab.D, 2);
                        var7 += 2;
                        if (var8) {
                           break label386;
                        }

                        if (var8) {
                           break;
                        }
                     }
                  }

                  if (z != null) {
                     int var26 = 0;

                     while (true) {
                        if (var26 < z.size()) {
                           x var13;
                           var30 = (var13 = (x)z.elementAt(var26)).b;
                           var34 = 2;
                           if (var8) {
                              break;
                           }

                           if (var30 == 2) {
                              var13.b(var0);
                           }

                           var26++;
                           if (!var8) {
                              continue;
                           }

                           var26 = 0;
                        } else {
                           var26 = 0;
                        }

                        var30 = var26;
                        var34 = z.size();
                        break;
                     }

                     label366:
                     while (true) {
                        label360: {
                           if (var30 < var34) {
                              x var14;
                              var30 = (var14 = (x)z.elementAt(var26)).b;
                              var34 = 1;
                              if (var8) {
                                 break label360;
                              }

                              if (var30 == 1) {
                                 var14.b(var0);
                              }

                              var26++;
                              if (!var8) {
                                 var30 = var26;
                                 var34 = z.size();
                                 continue;
                              }

                              var26 = 0;
                           } else {
                              var26 = 0;
                           }

                           var30 = var26;
                           var34 = z.size();
                        }

                        while (true) {
                           if (var30 >= var34) {
                              break label366;
                           }

                           x var15;
                           var30 = (var15 = (x)z.elementAt(var26)).b;
                           var34 = 1;
                           if (var8) {
                              break label387;
                           }

                           if (var30 != 1 && var15.b != 2) {
                              var15.b(var0);
                           }

                           var26++;
                           if (var8) {
                              break label366;
                           }

                           var30 = var26;
                           var34 = z.size();
                        }
                     }
                  }
               }

               var30 = v;
               var34 = 2;
            }

            if (var30 > var34) {
               H.b(S, T + var6);
               int var27;
               if ((var27 = U / 3) > 8) {
                  var27 = 8;
               }

               H.b = var27;
               H.b(var0);
            }

            if (v >= 2) {
               int var28 = 0;

               while (var28 < m.length) {
                  var0.drawImage(D[var28], o[var28] + w, p[var28] / 100 + var6, 0);
                  var28++;
                  if (var8) {
                     break label389;
                  }

                  if (var8) {
                     break;
                  }
               }
            }

            if (!b && v > 0 && !ab.p) {
               try {
                  label319: {
                     if (e) {
                        if (f && h < 3 * g) {
                           h++;
                        }

                        if (!f && h > 0) {
                           h--;
                        }

                        G.b = 6 + h / g;
                        if (!var8) {
                           break label319;
                        }
                     }

                     if (!i) {
                        if (f && h < 3 * g) {
                           h++;
                        }

                        if (!f && h > 0) {
                           h--;
                        }

                        G.b = 0 + h / g;
                        G.b(2, ab.E - 2 - G.e);
                        G.b(var0);
                        G.b = 3 + h / g;
                     }
                  }

                  if (!i) {
                     G.b(ab.D - 2 - G.d, ab.E - 2 - G.e);
                     G.b(var0);
                  }

                  if (f && h >= 3 * g - 1 && ab.e) {
                     i = true;
                  }

                  if (f && h >= 3 * g - 1 && (!e || !b) && !ab.e) {
                     if (!b && e) {
                        b = true;
                     }

                     if (!e) {
                        e = true;
                     }

                     h = 3 * g;
                     f = false;
                  }
               } catch (Exception var9) {
               }
            }
         }

         if (b && v == -1) {
            if (++j > 11) {
               j = 0;
            }

            qb.M.b = j;
            qb.M.b(ab.D - qb.M.d - 12, 12);
            qb.M.b(var0);
         }

         if (v >= 7 || b) {
            int var25;
            if ((var25 = ++R / 2) > 4) {
               var25 = 4;
            }

            I.b((ab.D - I.d) / 2, (ab.E - I.e) / 2);
            I.b = var25;
            I.b(var0);
         }

         if (!ab.p && d) {
            Q++;
            if (v == -1) {
               ab.k();
            } else {
               w = w - K;
               if (v == 0 && (x = x + (ab.E / 30 - ab.E * x * 3 / (30 * y))) >= 0) {
                  x = 0;
                  v = 1;
               }

               if ((v > 2 || b) && (S = S + U / 12 + 2) > -30) {
                  U++;
               }

               if (b) {
                  if (x <= -y * 10) {
                     int var10 = k;
                     var1 = l;
                     k = (0 + k) / 2;
                     l = (0 + l) / 2;
                     if (var10 == k && var1 == l) {
                        v = -1;
                        rc.b.repaint();
                        return;
                     }
                  } else {
                     x = x - (ab.E / 30 - (ab.E * x << 1) / (15 * y));
                  }
               }

               var1 = -1;
               if (z != null) {
                  int var11 = 0;

                  int var31;
                  byte var35;
                  label281: {
                     while (var11 < z.size()) {
                        x var18;
                        x var24;
                        var31 = (var24 = var18 = (x)z.elementAt(var11)).b;
                        var35 = 1;
                        if (var8) {
                           break label281;
                        }

                        label410: {
                           if (var31 == 1) {
                              var24.c = var24.c + L;
                              if (!var8) {
                                 break label410;
                              }
                           }

                           if (var24.b == 2) {
                              var24.c = var24.c + M;
                              if (!var8) {
                                 break label410;
                              }
                           }

                           if (var24.b == 3) {
                              var24.c = var24.c - var24.h;
                              var24.i++;
                              if (var24.i <= 17) {
                                 break label410;
                              }

                              var24.i = 0;
                              if (!var8) {
                                 break label410;
                              }
                           }

                           if (var24.b == 4) {
                              var24.i++;
                              if (var24.i > 9) {
                                 var24.i = 0;
                              }
                           }
                        }

                        if (var24.c + w < -var24.e) {
                           z.removeElementAt(var11);
                           var11--;
                           if (var18.b == 1) {
                              if ((var2 = y - A[0].getHeight() - B[0].getHeight() + 30) < 2) {
                                 var2 = 2;
                              }

                              z.addElement(new x(1, ab.D - w, ab.oc.nextInt(var2) - 30));
                           } else if (var18.b == 2) {
                              if ((var2 = y / 2 - C[0].getHeight()) < 2) {
                                 var2 = 2;
                              }

                              z.addElement(new x(2, ab.D - w, ab.oc.nextInt(var2) + y / 2));
                           } else if (var18.b == 3) {
                              if ((var2 = y - 20) < 2) {
                                 var2 = 2;
                              }

                              z.addElement(new x(3, ab.D - w + ab.oc.nextInt(ab.D / 2), ab.oc.nextInt(var2)));
                           }
                        } else if (var18.b == 0) {
                           var1 = var11;
                        }

                        var11++;
                        if (var8) {
                           break;
                        }
                     }

                     var31 = var1;
                     var35 = -1;
                  }

                  x var22;
                  if (var31 != var35 && (var22 = (x)z.elementAt(var1)) != null && var22.b == 0 && var22.c + w + var22.e < ab.D) {
                     z.addElement(new x(0, ab.D - w + ab.oc.nextInt(ab.D / 8 + 20), y));
                  }
               }

               if (v == 2 || v == 4 || v == 6) {
                  byte var23 = 0;
                  int var12 = N;

                  int var32;
                  label248: {
                     while (var12 < N + O) {
                        var32 = r[var12];
                        if (var8) {
                           break label248;
                        }

                        label244: {
                           if (var32 != 0) {
                              var23 = 1;
                              p[var12] = p[var12] + q[var12];
                              r[var12]--;
                              if (!var8) {
                                 break label244;
                              }
                           }

                           if (s[var12] < t.length) {
                              var23 = 1;
                              p[var12] = p[var12] - t[s[var12]] * 100;
                              s[var12]++;
                           }
                        }

                        var12++;
                        if (var8) {
                           break;
                        }
                     }

                     var32 = var23;
                  }

                  if (var32 == 0) {
                     if (b) {
                        v = 10;
                        return;
                     }

                     v++;
                  }
               }
            }
         }
      }
   }

   public static void c(int var0) {
      boolean var3;
      int var4;
      label53: {
         var3 = ab.xc;
         if ((var4 = 240 - ab.D) > 0) {
            var4 /= 10;
            if (!var3) {
               break label53;
            }
         }

         var4 = 0;
      }

      label56: {
         if (v == 2) {
            u = var4 + 21;
            N = 0;
            O = 14;
            if (!var3) {
               break label56;
            }
         }

         if (v == 4) {
            if (var4 >= 2) {
               var4 -= 2;
            }

            u = var4 + 17;
            N = 14;
            O = 9;
            if (!var3) {
               break label56;
            }
         }

         if (v == 6) {
            u = var4 + 19;
            N = 23;
            O = 9;
         }
      }

      var4 = N;

      while (var4 < N + O) {
         label58: {
            o[var4] = var0 + m[var4];
            int var2 = y - n[var4] - D[var4].getHeight();
            if (var4 == 22 || var4 == 31) {
               r[var4] = 0;
               s[var4] = t.length;
               p[var4] = var2;
               if (!var3) {
                  break label58;
               }
            }

            p[var4] = -D[var4].getHeight() - 20 * (var4 - N);
            o[var4] = var0 + m[var4];
            r[var4] = u + ab.oc.nextInt(7);
            q[var4] = (var2 - p[var4]) * 100 / r[var4];
         }

         p[var4] = p[var4] * 100;
         var4++;
         if (var3) {
            break;
         }
      }
   }
}
