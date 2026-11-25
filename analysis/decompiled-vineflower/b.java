import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class b {
   public String b;
   public String c;
   public String d;
   private static final char e = " ".charAt(0);
   private static final char f = "\n".charAt(0);
   public static final char g = "^".charAt(0);
   private static final char h = "0".charAt(0);
   private static final char i = "9".charAt(0);
   private static final char j = "`".charAt(0);
   private static final char k = "~".charAt(0);
   private static pb l = null;
   public static pb m = null;
   private byte[] n;
   private int o;
   private int[] p;
   private Image q;
   private int[] r;
   private static Vector s;
   private static int[] t;
   private static int[] u;
   private int v;
   public int w;
   public int x;
   private static int y = -1;
   private int z;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public b(String var1, String var2, String var3, int[] var4) {
      boolean var6 = ab.xc;
      super();
      this.b = "`0~";
      this.c = "`0~";
      this.d = "`0~";
      this.v = -2;
      this.w = 1;
      this.x = 5;
      this.z = 0;
      if (l == null) {
         l = ab.b("menu/digits.png", 8, 11);
      }

      try {
         this.q = Image.createImage(var1);
      } catch (Exception var8) {
         new StringBuffer().append("font img: ").append(var8).toString();
         return;
      }

      try {
         InputStream var12;
         (var12 = this.getClass().getResourceAsStream(var2)).read();
         var12.read();
         var12.read();
         ByteArrayOutputStream var14 = new ByteArrayOutputStream();
         byte[] var5 = new byte[128];

         while ((var10 = var12.read(var5)) > 2) {
            var14.write(var5, 0, var10 - 2);
            if (var6) {
               break;
            }
         }

         var1 = new String(var14.toByteArray(), "UTF-8");
         var12.close();
      } catch (Exception var9) {
         new StringBuffer().append("font chars: ").append(var9).toString();
         return;
      }

      int var13 = var1.length();
      this.n = new byte[var13];

      try {
         InputStream var15;
         (var15 = this.getClass().getResourceAsStream(var3)).read(this.n);
         var15.close();
      } catch (Exception var7) {
         new StringBuffer().append("font widths: ").append(var7).toString();
         return;
      }

      this.p = new int[256];
      int var16 = 0;

      while (true) {
         if (var16 < this.p.length) {
            this.p[var16] = -1;
            var16++;
            if (var6) {
               break;
            }

            if (!var6) {
               continue;
            }
         }

         var16 = 0;
         break;
      }

      int var10000;
      int var10001;
      while (true) {
         label62:
         if (var16 < var13) {
            int var17;
            var10000 = var17 = b(var1.charAt(var16));
            var10001 = 255;
            if (var6) {
               break;
            }

            if (var10000 > 255) {
               new StringBuffer().append("").append(var17).append(": ").append(var1.charAt(var16)).append(" ").append((int)var1.charAt(var16)).toString();
               if (!var6) {
                  var16++;
                  if (!var6) {
                     continue;
                  }
                  break label62;
               }
            }

            this.p[var17] = var16++;
            if (!var6) {
               continue;
            }
         }

         this.o = this.q.getHeight();
         this.r = new int[this.n.length];
         this.r[0] = 0;
         var16 = 1;
         var10000 = var16;
         var10001 = this.n.length;
         break;
      }

      while (var10000 < var10001) {
         this.r[var16] = this.r[var16 - 1] + this.n[var16 - 1];
         var16++;
         if (var6) {
            break;
         }

         var10000 = var16;
         var10001 = this.n.length;
      }
   }

   public static void b() {
      boolean var2 = ab.xc;
      s = new Vector();

      try {
         int var4 = 0;

         while (true) {
            Image var5 = Image.createImage("/font/icons/ico" + var4 + ".png");
            s.addElement(var5);
            var4++;
         }
      } catch (Exception var3) {
         if (s.size() > 0) {
            t = new int[s.size()];
            u = new int[s.size()];
            int var0 = 0;

            while (var0 < s.size()) {
               Image var1 = (Image)s.elementAt(var0);
               t[var0] = var1.getWidth();
               u[var0] = var1.getHeight();
               var0++;
               if (var2) {
                  break;
               }
            }
         }
      }
   }

   public final int c() {
      return this.o;
   }

   private static int b(char var0) {
      return var0 >= 1025 ? var0 + 128 - 1025 : var0;
   }

   private int c(char var1) {
      int var2;
      return (var2 = b(var1)) >= 0 && var2 <= 255 ? this.p[var2] : -1;
   }

   public final int b(String var1) {
      boolean var5 = ab.xc;
      int var4 = 0;
      int var2 = 0;

      int var10000;
      while (true) {
         if (var2 < var1.length()) {
            int var3;
            var10000 = var3 = this.c(var1.charAt(var2));
            if (var5) {
               break;
            }

            if (var10000 != -1) {
               var4 += this.n[var3] + this.v;
            }

            var2++;
            if (!var5) {
               continue;
            }
         }

         var10000 = var4;
         break;
      }

      return var10000;
   }

   private boolean b(Graphics var1, String var2, int var3, int var4, int var5, int var6, boolean var7) {
      boolean var12 = ab.xc;
      if (var4 + this.o >= 0 && var4 <= ab.E) {
         label87: {
            if (var6 == 1) {
               var3 -= var5;
               if (!var12) {
                  break label87;
               }
            }

            if (var6 == 2) {
               var3 -= var5 / 2;
            }
         }

         if (!var7) {
            var5 = var4;
            var4 = var3;
            String var15 = var2;
            Graphics var14 = var1;
            b var13 = this;
            boolean var9 = false;
            boolean var10 = false;
            String var11 = "";
            var6 = 0;

            while (var6 < var15.length()) {
               char var8 = var15.charAt(var6);
               if (var12) {
                  return var9;
               }

               label98: {
                  if (var9) {
                     if (var8 >= h && var8 <= i) {
                        var11 = var11 + var8;
                        if (var6 < var15.length() - 1) {
                           break label98;
                        }
                     }

                     var7 = Integer.parseInt(var11);
                     if (var10 && var7 < s.size()) {
                        var14.drawImage((Image)s.elementAt(var7), var4, var5 - (u[var7] - var13.o) / 2 - 1, 0);
                        var4 += t[var7] + var13.v;
                     }

                     var9 = false;
                     if (var6 >= var15.length() - 1 || var8 == k) {
                        break label98;
                     }

                     var6--;
                     if (!var12) {
                        break label98;
                     }
                  }

                  if (var8 == g || var8 == j) {
                     var10 = var8 == g;
                     var9 = true;
                     var11 = "";
                     if (!var12) {
                        break label98;
                     }
                  }

                  if (var8 == e) {
                     var4 += var13.x;
                     if (!var12) {
                        break label98;
                     }
                  }

                  if (var8 != k && (var7 = var13.c(var8)) != -1) {
                     var14.drawRegion(var13.q, var13.r[var7], 0, var13.n[var7], var13.o, 0, var4, var5, 0);
                     var4 += var13.n[var7] + var13.v;
                  }
               }

               var6++;
               if (var12) {
                  break;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public final int b(Graphics var1, String var2, int var3, int var4, int var5, int var6) {
      return this.c(var1, var2, var3, var4, var5, var6, false);
   }

   private int c(Graphics var1, String var2, int var3, int var4, int var5, int var6, boolean var7) {
      boolean var21 = ab.xc;
      String var11 = "";
      String var12 = "";
      int var13 = 0;
      int var14 = 0;
      int var15 = this.o;
      boolean var16 = false;
      byte var17 = 0;
      boolean var18 = false;
      boolean var19 = false;
      String var20 = "";
      int var8 = 0;

      int var10000;
      while (true) {
         if (var8 < var2.length()) {
            int var10 = var2.charAt(var8);
            var10000 = var17;
            if (var21) {
               break;
            }

            label306: {
               if (var17 != 0) {
                  if (var10 >= h && var10 <= i) {
                     var20 = var20 + var10;
                     if (var8 < var2.length() - 1) {
                        break label306;
                     }
                  }

                  label267: {
                     int var9 = Integer.parseInt(var20);
                     if (var18) {
                        if (var9 >= s.size()) {
                           break label267;
                        }

                        if (var13 > 0) {
                           var13 += this.v;
                        }

                        var13 += t[var9];
                        var11 = var11 + g + var20 + k;
                        if (!var21) {
                           break label267;
                        }
                     }

                     var11 = var11 + j + var20 + k;
                  }

                  var17 = 0;
                  if (var8 >= var2.length() - 1 || var10 == k) {
                     break label306;
                  }

                  var8--;
                  if (!var21) {
                     break label306;
                  }
               }

               if (var10 == e) {
                  if (var13 == 0) {
                     var12 = var12 + var10;
                     if (var14 > 0) {
                        var14 += this.v;
                     }

                     var14 += this.x;
                     var16 = false;
                     if (!var21) {
                        break label306;
                     }
                  }

                  label256: {
                     if (var14 > 0) {
                        String var23;
                        label253: {
                           var10 = var14 + var13 + this.v;
                           if (var16) {
                              var10 += this.x + this.v;
                              var23 = var12 + " " + var11;
                              if (!var21) {
                                 break label253;
                              }
                           }

                           var23 = var12 + var11;
                        }

                        if (var5 >= 0 && var10 > var5) {
                           boolean var24 = this.b(var1, var12, var3, var4, var14, var6, var7);
                           var19 = var19 || var24;
                           var4 += this.o + this.w;
                           var15 += this.o + this.w;
                        } else {
                           var12 = var23;
                           var14 = var10;
                           if (!var21) {
                              break label256;
                           }
                        }
                     }

                     var12 = var11;
                     var14 = var13;
                  }

                  var16 = true;
                  var11 = "";
                  var13 = 0;
                  if (!var21) {
                     break label306;
                  }
               }

               if (var10 == f) {
                  label308: {
                     if (var13 == 0) {
                        boolean var25 = this.b(var1, var12, var3, var4, var14, var6, var7);
                        var19 = var19 || var25;
                        if (!var21) {
                           break label308;
                        }
                     }

                     if (var14 > 0) {
                        String var26;
                        label225: {
                           var10 = var14 + var13 + this.v;
                           if (var16) {
                              var10 += this.x + this.v;
                              var26 = var12 + " " + var11;
                              if (!var21) {
                                 break label225;
                              }
                           }

                           var26 = var12 + var11;
                        }

                        if (var5 >= 0 && var10 > var5) {
                           boolean var29 = this.b(var1, var12, var3, var4, var14, var6, var7);
                           var19 = var19 || var29;
                           var4 += this.o + this.w;
                           var15 += this.o + this.w;
                           boolean var30 = this.b(var1, var11, var3, var4, var13, var6, var7);
                           var19 = var19 || var30;
                           break label308;
                        }

                        boolean var27 = this.b(var1, var26, var3, var4, var10, var6, var7);
                        var19 = var19 || var27;
                        if (!var21) {
                           break label308;
                        }
                     }

                     boolean var28 = this.b(var1, var11, var3, var4, var13, var6, var7);
                     var19 = var19 || var28;
                  }

                  var4 += this.o + this.w;
                  var15 += this.o + this.w;
                  var12 = "";
                  var14 = 0;
                  var11 = "";
                  var13 = 0;
                  var16 = false;
                  if (!var21) {
                     break label306;
                  }
               }

               if (var10 == g || var10 == j) {
                  var18 = var10 == g;
                  var17 = 1;
                  var20 = "";
                  if (!var21) {
                     break label306;
                  }
               }

               int var31;
               if (var10 != k && (var31 = this.c((char)var10)) != -1) {
                  var11 = var11 + var10;
                  if (var13 > 0) {
                     var13 += this.v;
                  }

                  var13 += this.n[var31];
               }
            }

            var8++;
            if (!var21) {
               continue;
            }
         }

         var10000 = var13;
         break;
      }

      if (var10000 == 0) {
         boolean var32 = this.b(var1, var12, var3, var4, var14, var6, var7);
         var19 = var19 || var32;
         if (!var21) {
            return !var19 && !var7 ? -1 : var15;
         }
      }

      if (var14 > 0) {
         String var33;
         int var38;
         label158: {
            var38 = var14 + var13 + this.v;
            if (var16) {
               var38 += this.x + this.v;
               var33 = var12 + " " + var11;
               if (!var21) {
                  break label158;
               }
            }

            var33 = var12 + var11;
         }

         if (var5 >= 0 && var38 > var5) {
            boolean var36 = this.b(var1, var12, var3, var4, var14, var6, var7);
            var19 = var19 || var36;
            var4 += this.o + this.w;
            var15 += this.o + this.w;
            boolean var37 = this.b(var1, var11, var3, var4, var13, var6, var7);
            var19 = var19 || var37;
            return !var19 && !var7 ? -1 : var15;
         }

         boolean var34 = this.b(var1, var33, var3, var4, var38, var6, var7);
         var19 = var19 || var34;
         if (!var21) {
            return !var19 && !var7 ? -1 : var15;
         }
      }

      boolean var35 = this.b(var1, var11, var3, var4, var13, var6, var7);
      var19 = var19 || var35;
      return !var19 && !var7 ? -1 : var15;
   }

   public final int b(String var1, int var2) {
      return this.c(null, var1, 0, 0, var2, 0, true);
   }

   private static int d(Graphics var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
      boolean var16 = ab.xc;
      Font var7 = ab.F;
      int var17;
      var5 = (var17 = var5) == 2 ? 17 : (var17 == 1 ? 24 : 0);
      String var8 = "";
      String var10 = "";
      int var12 = var7.getHeight();
      int var9 = 0;
      int var14 = 0;
      int var15 = 0;

      int var10000;
      while (true) {
         if (var15 <= var1.length()) {
            var10000 = var15;
            if (var16) {
               break;
            }

            char var11;
            label73: {
               if (var15 == var1.length()) {
                  var11 = f;
                  if (!var16) {
                     break label73;
                  }
               }

               var11 = var1.charAt(var15);
            }

            label88: {
               if (var11 == e || var11 == f) {
                  int var13 = var14 + var9;
                  String var19;
                  if (var14 != 0 && var9 != 0) {
                     var13 += var7.charWidth(e);
                     var19 = var8 + " " + var10;
                  } else {
                     var19 = var8 + var10;
                  }

                  if (var13 > var4 && var4 > 0) {
                     if (!var6) {
                        var0.drawString(var8, var2, var3, var5);
                     }

                     var3 += var7.getHeight() + y;
                     var12 += var7.getHeight() + y;
                     var8 = var10;
                     var9 = var14;
                  } else {
                     var8 = var19;
                     var9 = var13;
                  }

                  if (var11 == f) {
                     if (!var6) {
                        var0.drawString(var8, var2, var3, var5);
                     }

                     if (var15 != var1.length()) {
                        var3 += var7.getHeight() + y;
                        var12 += var7.getHeight() + y;
                     }

                     var8 = "";
                     var9 = 0;
                  }

                  var10 = "";
                  var14 = 0;
                  if (!var16) {
                     break label88;
                  }
               }

               var10 = var10 + var11;
               var14 += var7.charWidth(var11);
            }

            var15++;
            if (!var16) {
               continue;
            }
         }

         var10000 = var12;
         break;
      }

      return var10000;
   }

   public static void c(Graphics var0, String var1, int var2, int var3, int var4, int var5) {
      d(var0, var1, var2, var3, var4, var5, false);
   }

   public static int c(String var0, int var1) {
      return d(null, var0, 0, 0, var1, 0, true);
   }

   public static int c(String var0) {
      return ab.F.stringWidth(var0);
   }

   public static void b(Graphics var0, String var1, int var2, int var3, int var4) {
      boolean var7 = ab.xc;
      var2 -= var1.length() * l.d - (var1.length() - 1 << 1);
      var4 = 0;

      while (var4 < var1.length()) {
         int var5;
         label45: {
            char var6 = var1.charAt(var4);
            var5 = -1;
            if (var6 >= '0' && var6 <= '9') {
               var5 = var6 - '0';
               if (!var7) {
                  break label45;
               }
            }

            if (var6 == '+') {
               var5 = 10;
               if (!var7) {
                  break label45;
               }
            }

            if (var6 == '-') {
               var5 = 11;
               if (!var7) {
                  break label45;
               }
            }

            if (var6 == '/') {
               var5 = 12;
            }
         }

         if (var5 != -1) {
            l.b = var5;
            l.b(var2, var3);
            l.b(var0);
            pb var10 = l;
            var5 = l.d;
            var2 += var5 - 2;
         }

         var4++;
         if (var7) {
            break;
         }
      }
   }

   public static void c(Graphics var0, String var1, int var2, int var3, int var4) {
      boolean var8 = ab.xc;
      boolean var5 = false;
      String var6 = "";
      int var7 = 0;

      while (var7 < var1.length()) {
         label34: {
            char var10;
            if ((var10 = var1.charAt(var7)) == g) {
               var5 = true;
               if (!var8) {
                  break label34;
               }
            }

            if (var10 == k) {
               var5 = false;
               Image var11 = (Image)s.elementAt(Integer.parseInt(var6));
               var3 -= var11.getHeight() >> 1;
               var0.drawImage(var11, var2, var3, 0);
               var2 += var11.getWidth();
               var3 += m.e >> 1;
            } else {
               label29: {
                  if (!var5) {
                     label26: {
                        if (var10 == h) {
                           m.b = 9;
                           if (!var8) {
                              break label26;
                           }
                        }

                        m.b = var10 - '1';
                     }

                     m.b(var2, var3);
                     m.b(var0);
                     var2 += m.d - 4;
                     if (!var8) {
                        break label29;
                     }
                  }

                  var6 = var6 + var10;
               }
            }
         }

         var7++;
         if (var8) {
            break;
         }
      }
   }
}
