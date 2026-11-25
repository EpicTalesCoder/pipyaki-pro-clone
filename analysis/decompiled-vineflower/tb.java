import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class tb {
   private Vector b;
   private int c;
   private int d = 0;
   private int e;
   public int f;
   public boolean g = false;
   private int h;
   private int i;
   private int j;
   private boolean k;
   private boolean l;

   public tb() {
      this.b = new Vector();
      this.c = 4;
      this.f = -1;
   }

   public final void b(pb var1) {
      this.b.addElement(var1);
      this.c = this.c + var1.e + 4;
   }

   public final void b(String var1) {
      boolean var11 = ab.xc;
      int var2 = ab.D - 8;
      var1 = var1;
      String var5 = "";
      int var6 = 0;
      String var7 = "";
      int var8 = 0;
      int var9 = ab.F.charWidth(' ');
      Vector var10 = new Vector();
      var1 = var1 + '\r';
      int var3 = 0;

      int var10000;
      while (true) {
         if (var3 < var1.length()) {
            char var4;
            var10000 = var4 = var1.charAt(var3);
            if (var11) {
               break;
            }

            label114: {
               if (var10000 == 13) {
                  label115: {
                     if (var6 + var9 + var8 <= var2) {
                        if (var6 == 0) {
                           if (var8 == 0) {
                              if (var3 == var1.length() - 1) {
                                 break label115;
                              }

                              var10.addElement("");
                              if (!var11) {
                                 break label115;
                              }
                           }

                           var10.addElement(var7);
                           if (!var11) {
                              break label115;
                           }
                        }

                        if (var8 == 0) {
                           var10.addElement(var5);
                           if (!var11) {
                              break label115;
                           }
                        }

                        var10.addElement(var5 + " " + var7);
                        if (!var11) {
                           break label115;
                        }
                     }

                     if (var6 > 0) {
                        var10.addElement(var5);
                     }

                     if (var8 > 0) {
                        var10.addElement(var7);
                     }
                  }

                  var5 = "";
                  var6 = 0;
                  var7 = "";
                  var8 = 0;
                  if (!var11) {
                     break label114;
                  }
               }

               if (var4 == ' ') {
                  label117: {
                     if (var6 + var9 + var8 <= var2) {
                        if (var6 == 0) {
                           if (var8 == 0) {
                              var5 = " ";
                              var6 = var9;
                              if (!var11) {
                                 break label117;
                              }
                           }

                           var5 = var7;
                           var6 = var8;
                           if (!var11) {
                              break label117;
                           }
                        }

                        if (var8 == 0) {
                           var5 = var5 + " ";
                           var6 += var9;
                           if (!var11) {
                              break label117;
                           }
                        }

                        var5 = var5 + " " + var7;
                        var6 += var9 + var8;
                        if (!var11) {
                           break label117;
                        }
                     }

                     if (var6 > 0) {
                        var10.addElement(var5);
                     }

                     var5 = var7;
                     var6 = var8;
                  }

                  var7 = "";
                  var8 = 0;
                  if (!var11) {
                     break label114;
                  }
               }

               if (var4 != '\n') {
                  var7 = var7 + var4;
                  var8 += ab.F.charWidth(var4);
               }
            }

            var3++;
            if (!var11) {
               continue;
            }
         }

         var10000 = var10.size();
         break;
      }

      String[] var14;
      if (var10000 == 0) {
         (var14 = new String[1])[0] = "";
      } else {
         var14 = new String[var10.size()];
         var3 = 0;

         while (var3 < var10.size()) {
            var14[var3] = (String)var10.elementAt(var3);
            var3++;
            if (var11) {
               return;
            }

            if (var11) {
               break;
            }
         }
      }

      String[] var15 = var14;
      this.b.addElement(var15);
      this.c = this.c + var15.length * ab.F.getHeight() + 4;
   }

   public final void b(Graphics var1) {
      boolean var6 = ab.xc;
      var1.setColor(0);
      var1.fillRect(0, 0, ab.D, ab.E);
      if (this.b != null && this.g) {
         var1.setClip(0, 1, ab.D, this.e);
         var1.setColor(16777215);
         var1.setFont(ab.F);
         int var5 = 4 + this.d + 1;
         int var2 = 0;

         int var10000;
         while (true) {
            if (var2 < this.b.size()) {
               Object var3;
               var10000 = (var3 = this.b.elementAt(var2)) instanceof Image;
               if (var6) {
                  break;
               }

               label65: {
                  if (var10000 != 0) {
                     var3 = (Image)var3;
                     var1.drawImage((Image)var3, (ab.D - var3.getWidth()) / 2, var5, 0);
                     var5 += var3.getHeight() + 4;
                     if (!var6) {
                        break label65;
                     }
                  }

                  if (!(var3 instanceof String[])) {
                     if (var3 instanceof pb) {
                        pb var8;
                        (var8 = (pb)var3).b((ab.D - var8.d) / 2, var5);
                        var8.c = 0;
                        var8.b(var1);
                        var5 += var8.e + 4;
                     }
                  } else {
                     label67: {
                        String[] var4 = (String[])var3;
                        int var7 = 0;

                        while (var7 < var4.length) {
                           var1.drawString(var4[var7], (ab.D - ab.F.stringWidth(var4[var7])) / 2, var5, 0);
                           var5 += ab.F.getHeight();
                           var7++;
                           if (var6) {
                              break label67;
                           }

                           if (var6) {
                              break;
                           }
                        }

                        var5 += 4;
                     }
                  }
               }

               var2++;
               if (!var6) {
                  continue;
               }
            }

            var1.setColor(8421504);
            var1.fillRect(ab.D - 3, this.h, 2, this.i);
            var1.setClip(0, 0, ab.D, ab.E);
            var10000 = this.f;
            break;
         }

         if (var10000 == 0 || this.f == 1) {
            qb.b.c = 0;
            qb.b.b = 0;
            qb.b.b(ab.D - 1 - qb.b.d, ab.E - 1 - qb.b.e);
            qb.b.b(var1);
            qb.b.b = 1;
            qb.b.b(1, ab.E - 1 - qb.b.e);
            qb.b.b(var1);
         } else if (this.f == 5) {
            qb.b.c = 0;
            qb.b.b = 2;
            qb.b.b(ab.D - 1 - qb.b.d, ab.E - 1 - qb.b.e);
            qb.b.b(var1);
            qb.b.b = 1;
            qb.b.b(1, ab.E - 1 - qb.b.e);
            qb.b.b(var1);
         } else {
            qb.b.b = 1;
            qb.b.b(ab.D - 1 - qb.b.d, ab.E - 1 - qb.b.e);
            qb.b.c = 2;
            qb.b.b(var1);
         }
      }
   }

   public final void b() {
      label11: {
         this.e = ab.E - 3 - qb.b.e;
         if (this.c > this.e) {
            this.d = 0;
            this.i = this.e * this.e / this.c;
            this.e();
            if (!ab.xc) {
               break label11;
            }
         }

         this.d = (this.e - this.c) / 2;
      }

      this.g = true;
   }

   public final void c() {
      this.g = false;

      try {
         this.b.removeAllElements();
         this.b = null;
      } catch (Exception var1) {
      }
   }

   public final void d() {
      if (this.g) {
         if (this.j != 0 && this.c > this.e) {
            label40: {
               this.d = this.d - this.j;
               if (this.d > 0) {
                  this.d = 0;
                  if (!ab.xc) {
                     break label40;
                  }
               }

               if (this.d < this.e - this.c) {
                  this.d = this.e - this.c;
               }
            }

            this.e();
         }

         if (this.k) {
            this.j += 2;
            if (this.j > 12) {
               this.j = 12;
               return;
            }
         } else if (this.l) {
            this.j -= 2;
            if (this.j < -12) {
               this.j = -12;
               return;
            }
         } else if (this.j > 0) {
            this.j -= 2;
            if (this.j < 0) {
               this.j = 0;
               return;
            }
         } else if (this.j < 0) {
            this.j += 2;
            if (this.j > 0) {
               this.j = 0;
            }
         }
      }
   }

   public final void b(int var1) {
      if (this.g) {
         int var2;
         if ((var2 = rc.b.getGameAction(var1)) != 6 && var1 != ab.nb) {
            if (var2 != 1 && var1 != ab.pb) {
               if (var1 != ab.jb && var1 != ab.lb) {
                  if (var1 == ab.kb || var1 == ab.mb) {
                     if (this.f == 3 || this.f == 7) {
                        ab.B.L();
                        return;
                     }

                     fb.I.b(true);
                  }
               } else if (this.f == 0 || this.f == 1 || this.f == 5) {
                  fb.I.b(false);
                  return;
               }
            } else {
               if (this.j > 0) {
                  this.j = -2;
               }

               this.l = true;
            }
         } else {
            if (this.j < 0) {
               this.j = 2;
            }

            this.k = true;
         }
      }
   }

   public final void c(int var1) {
      if (this.g) {
         int var2;
         if ((var2 = rc.b.getGameAction(var1)) != 6 && var1 != ab.nb) {
            if (var2 == 1 || var1 == ab.pb) {
               this.l = false;
            }
         } else {
            this.k = false;
         }
      }
   }

   private void e() {
      this.h = 1 + (this.e - this.i) * this.d / (this.e - this.c);
   }
}
