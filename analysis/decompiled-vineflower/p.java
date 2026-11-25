import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class p extends o {
   public static byte[] r = new byte[]{3, 2, 1, 0, 0, 0, 0, 1, 2, 3, 3};
   public static byte[] s = new byte[]{
      3, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 3, 3
   };
   public boolean t;
   private q u;
   private q v;
   private byte w;
   public byte x;
   public nb y;
   private nb z;
   private int A;
   private int B;
   private int C;
   private byte D;
   private int E;
   private int F;
   public byte G;
   private boolean H;
   private long I;

   private p(byte var1, byte var2, int var3, int var4, int var5, int var6, q var7, q var8, int var9) {
      boolean var10 = ab.xc;
      super((byte)-1, (byte)-1, var3, var4);
      this.w = var1;
      this.A = var5;
      switch (this.w) {
         case 1:
            this.y = new nb(fb.Db);
            this.y.b(false, false, (byte)0);
            if (fb.Rb != null) {
               this.z = new nb(fb.Rb);
               this.z.b(r, false, false, (byte)0);
            }

            this.x = 0;
            if (var6 < 30) {
               this.F = 10;
               if (!var10) {
                  break;
               }
            }

            this.F = 20;
            if (!var10) {
               break;
            }
         case 2:
            if (fb.lc != null) {
               this.y = new nb(fb.lc);
               this.y.b(false, false, (byte)1);
            }

            if (fb.Ob != null) {
               this.z = new nb(fb.Ob);
               this.z.b(new byte[]{2}, false, false, (byte)3);
               this.B = 8;
            }

            this.x = 0;
            this.F = 10;
            if (!var10) {
               break;
            }
         case 3:
            this.H = true;
            if (!var10) {
               break;
            }
         case 4:
         case 6:
            this.y = new nb(fb.Gc);
            this.y.b(false, false, (byte)1);
            if (fb.Ub != null) {
               this.z = new nb(fb.Ub);
               this.z.b(r, false, false, (byte)0);
            }

            if (fb.Jc != null) {
               (new w(fb.Jc, super.c / 10, super.d / 10 - 10, (byte)2, false, 2)).l = this.A * 10;
            }

            this.x = 0;
            if (var6 < 30) {
               this.F = 10;
               if (!var10) {
                  break;
               }
            }

            this.F = 20;
            break;
         case 5:
            this.y = new nb(fb.Hb);
            this.y.b(false, false, (byte)0);
            if (fb.Rb != null) {
               this.z = new nb(fb.Rb);
               this.z.b(r, false, false, (byte)0);
            }

            this.x = 0;
            this.F = 14;
            if (!var10) {
               break;
            }
         case 7:
            this.y = new nb(fb.Hb);
            this.y.b(false, false, (byte)0);
            if (fb.Rb != null) {
               this.z = new nb(fb.Rb);
               this.z.b(r, false, false, (byte)0);
            }

            this.x = 0;
            this.F = 14;
            if (!var10) {
               break;
            }
         case 8:
            label80: {
               this.y = new nb(fb.Mb);
               this.y.b(false, false, (byte)0);
               if (fb.Rb != null) {
                  this.z = new nb(fb.Rb);
                  this.z.b(r, false, false, (byte)0);
               }

               this.x = 0;
               if (var6 < 30) {
                  this.F = 10;
                  if (!var10) {
                     break label80;
                  }
               }

               this.F = 20;
            }
      }

      this.D = var2;
      if (this.D <= 0) {
         this.D = 1;
      }

      this.E = var6;
      this.u = var7;
      this.v = var8;
      this.C = var9;
      if (fb.Td != null) {
         fb.Td.addElement(this);
      }
   }

   public static p b(byte var0, byte var1, int var2, int var3, int var4, int var5, q var6, q var7, int var8) {
      return b((byte)(var2 / 30), (byte)(var3 / 30)) ? new p(var0, var1, var2, var3, var4, var5, var6, var7, var8) : null;
   }

   public final void h() {
      boolean var11 = ab.xc;
      if (!this.t) {
         if (this.H) {
            if (!fb.M && !fb.i()) {
               this.t = true;
            } else {
               this.I--;
               if (this.v != null) {
                  if (!this.v.n()) {
                     this.t = true;
                     return;
                  }

                  this.d(this.v.g, this.v.h);
                  if (this.v.r()) {
                     return;
                  }
               }

               if (this.I < 0L) {
                  this.t = true;
                  return;
               }

               if (q.Vc != null) {
                  byte var19 = (byte)(-(this.D - 1));

                  while (var19 < this.D) {
                     byte var23 = (byte)(-(this.D - 1));

                     int var49;
                     byte var51;
                     while (true) {
                        if (var23 < this.D) {
                           var49 = Math.abs(var19) + Math.abs(var23);
                           var51 = this.D;
                           if (var11) {
                              break;
                           }

                           label291: {
                              q[] var17;
                              if (var49 <= this.D
                                 && o.b((byte)(this.g + var19), (byte)(this.h + var23))
                                 && q.Vc[this.g + var19][this.h + var23] != 0
                                 && (var17 = q.b((byte)(this.g + var19), (byte)(this.h + var23), 2, null)) != null) {
                                 byte var26 = 0;

                                 while (var26 < var17.length) {
                                    byte var29 = 0;
                                    var50 = ab.g();
                                    if (var11) {
                                       break label291;
                                    }

                                    label545: {
                                       if (var50 != 0) {
                                          if (this.u == null) {
                                             break label545;
                                          }

                                          var29 = this.u.w;
                                          if (!var11) {
                                             break label545;
                                          }
                                       }

                                       if (this.v == var17[var26]) {
                                          if (this.u == null) {
                                             break label545;
                                          }

                                          var29 = this.u.w;
                                          if (!var11) {
                                             break label545;
                                          }
                                       }

                                       if (this.v != null) {
                                          var29 = this.v.w;
                                          if (!var11) {
                                             break label545;
                                          }
                                       }

                                       if (this.u != null) {
                                          var29 = this.u.w;
                                       }
                                    }

                                    if (!var17[var26].Y) {
                                       boolean var32;
                                       boolean var36;
                                       boolean var40;
                                       label546: {
                                          var32 = true;
                                          var36 = false;
                                          var40 = false;
                                          if (this.v == var17[var26]) {
                                             var36 = true;
                                             if (!var11) {
                                                break label546;
                                             }
                                          }

                                          if (this.u != null && this.u.x == var17[var26].x) {
                                             var40 = true;
                                          }

                                          if (this.u == var17[var26]) {
                                             var32 = false;
                                             if (!var11) {
                                                break label546;
                                             }
                                          }

                                          label255:
                                          if (ab.g()) {
                                             if (this.v != null) {
                                                if (var17[var26].x == this.v.x) {
                                                   break label255;
                                                }

                                                var32 = false;
                                                if (!var11) {
                                                   break label255;
                                                }
                                             }

                                             if (this.u != null && var17[var26].x == this.u.x) {
                                                var32 = false;
                                             }
                                          }
                                       }

                                       if (var32) {
                                          var17[var26].b(this.E, var29, this.C, var36, var40, true);
                                       }
                                    }

                                    var26++;
                                    if (var11) {
                                       break;
                                    }
                                 }
                              }

                              var50 = (byte)(var23 + 1);
                           }

                           var23 = var50;
                           if (!var11) {
                              continue;
                           }
                        }

                        var49 = var19;
                        var51 = 1;
                        break;
                     }

                     var19 = (byte)(var49 + var51);
                     if (var11) {
                        break;
                     }
                  }

                  return;
               }
            }
         } else {
            label535: {
               int var45;
               label580: {
                  label532:
                  if (this.x == 0 || this.y != null && this.y.j == this.x) {
                     this.x = -1;
                     int var1 = b(fb.Ge + ab.D / 2, fb.He + ab.E / 2, super.c / 10, super.d / 10);
                     int var2 = b(0, 0, ab.D, ab.E);
                     int var3 = this.F;
                     if (var1 < var2 && var2 != 0) {
                        int var20;
                        fb.b(var20 = var3 * (100 - var1 * 100 / var2) / 100, var20);
                     }

                     if (this.D == 1) {
                        this.b(this.g, this.h, this.E, true, this.C, true);
                        if (!var11) {
                           break label532;
                        }
                     }

                     boolean[] var12 = new boolean[4];
                     int[][] var18;
                     (var18 = new int[this.D << 1][this.D << 1])[this.D][this.D] = this.E;
                     int var5 = 1;

                     label520: {
                        label519:
                        while (true) {
                           var45 = var5;

                           label517:
                           while (true) {
                              if (var45 >= this.D) {
                                 break label519;
                              }

                              var45 = (boolean)0;
                              if (var11) {
                                 break label520;
                              }

                              int var6 = 0;

                              while (var6 < 4) {
                                 var45 = var12[var6];
                                 if (var11) {
                                    continue label517;
                                 }

                                 label511:
                                 if (var45 == 0) {
                                    int var7 = this.g;
                                    int var8 = this.h;
                                    if (var6 == 0) {
                                       var8 += var5;
                                    }

                                    if (var6 == 1) {
                                       var7 -= var5;
                                    }

                                    if (var6 == 2) {
                                       var8 -= var5;
                                    }

                                    if (var6 == 3) {
                                       var7 += var5;
                                    }

                                    label503:
                                    if (b((byte)var7, (byte)var8) && fb.Re != null) {
                                       if (fb.Re[var7][var8].d == null) {
                                          if (var5 == 1) {
                                             var18[this.D + var7 - this.g][this.D + var8 - this.h] = this.E;
                                             if (!var11) {
                                                break label511;
                                             }
                                          }

                                          var18[this.D + var7 - this.g][this.D + var8 - this.h] = (this.D + 1 - var5) * ((this.E - this.E * 25 / 100) / this.D);
                                          if (!var11) {
                                             break label511;
                                          }
                                       }

                                       if (var5 == 1) {
                                          var18[this.D + var7 - this.g][this.D + var8 - this.h] = this.E;
                                          if (!var11) {
                                             break label503;
                                          }
                                       }

                                       var18[this.D + var7 - this.g][this.D + var8 - this.h] = (this.D + 1 - var5) * ((this.E - this.E * 25 / 100) / this.D);
                                    }

                                    var12[var6] = true;
                                 }

                                 var6++;
                                 if (var11) {
                                    break;
                                 }
                              }

                              var5++;
                              if (var11) {
                                 break label519;
                              }
                              break;
                           }
                        }

                        var45 = (boolean)0;
                     }

                     int var13 = var45;
                     if (this.D > 5) {
                        var13 = 1;
                     }

                     int var27 = -1;

                     label475: {
                        label474:
                        while (true) {
                           byte var42 = (byte)var27;

                           label472:
                           while (true) {
                              if (var42 > 1) {
                                 break label474;
                              }

                              var43 = -1;
                              if (var11) {
                                 break label475;
                              }

                              byte var30 = -1;

                              while (var30 <= 1) {
                                 int var33 = this.g + var27;
                                 int var37 = this.h + var30;
                                 var42 = b((byte)var33, (byte)var37);
                                 if (var11) {
                                    continue label472;
                                 }

                                 label466:
                                 if (var42 != 0 && fb.Re != null) {
                                    if (fb.Re[var33][var37].d == null) {
                                       var18[this.D + var33 - this.g][this.D + var37 - this.h] = (this.D - 1) * ((this.E - this.E * 25 / 100) / this.D);
                                       if (!var13) {
                                          break label466;
                                       }

                                       var33 = this.g + (var27 << 1);
                                       var37 = this.h + var30;
                                       if (b((byte)var33, (byte)var37) && fb.Re != null && fb.Re[var33][var37].d == null) {
                                          var18[this.D + var33 - this.g][this.D + var37 - this.h] = (this.D - 2) * ((this.E - this.E * 25 / 100) / this.D);
                                       }

                                       var33 = this.g + var27;
                                       var37 = this.h + (var30 << 1);
                                       if (!b((byte)var33, (byte)var37) || fb.Re == null || fb.Re[var33][var37].d != null) {
                                          break label466;
                                       }

                                       var18[this.D + var33 - this.g][this.D + var37 - this.h] = (this.D - 2) * ((this.E - this.E * 25 / 100) / this.D);
                                       if (!var11) {
                                          break label466;
                                       }
                                    }

                                    if (var27 == 1) {
                                       var18[this.D + var33 - this.g][this.D + var37 - this.h] = this.E;
                                       if (!var11) {
                                          break label466;
                                       }
                                    }

                                    var18[this.D + var33 - this.g][this.D + var37 - this.h] = (this.D + 1 - var27) * ((this.E - this.E * 25 / 100) / this.D);
                                 }

                                 var30 += 2;
                                 if (var11) {
                                    break;
                                 }
                              }

                              var27 += 2;
                              if (var11) {
                                 break label474;
                              }
                              break;
                           }
                        }

                        var43 = 0;
                     }

                     var27 = var43;

                     label433:
                     do {
                        var45 = var27;

                        label430:
                        while (true) {
                           if (var45 >= this.D << 1) {
                              break label433;
                           }

                           var45 = 0;
                           if (var11) {
                              break label580;
                           }

                           int var31 = 0;

                           while (true) {
                              var45 = var31;

                              label425:
                              while (true) {
                                 if (var45 >= this.D << 1) {
                                    break label430;
                                 }

                                 var45 = var18[var27][var31];
                                 if (var11) {
                                    continue label430;
                                 }

                                 if (var45 <= 0) {
                                    break;
                                 }

                                 int var35 = this.g + var27 - this.D;
                                 int var39 = this.h + var31 - this.D;
                                 if (!b((byte)var35, (byte)var39)) {
                                    break;
                                 }

                                 this.b((byte)var35, (byte)var39, var18[var27][var31], false, this.C, var27 == this.D && var31 == this.D);
                                 label361:
                                 if (fb.Re[var35][var39].d != null) {
                                    if (fb.Re[var35][var39].d.I == 0 || fb.Re[var35][var39].d.I == j.L) {
                                       var13 = var35 - this.g;
                                       var3 = var39 - this.h;
                                       int var4 = 200 / this.D;
                                       if (var13 != 0) {
                                          var13 = (this.D - Math.abs(var13)) * var4 * (Math.abs(var13) / var13);
                                       }

                                       if (var3 != 0) {
                                          var3 = (this.D - Math.abs(var3)) * var4 * (Math.abs(var3) / var3);
                                       }

                                       fb.Re[var35][var39].d.b(var13, var3);
                                       if ((fb.M || fb.i()) && fb.Re[var35][var39].d.I != 0) {
                                          fb.Re[var35][var39].d.b(var18[var27][var31]);
                                       }

                                       if (!var11) {
                                          break label361;
                                       }
                                    }

                                    if (fb.M || fb.i()) {
                                       fb.Re[var35][var39].d.b(var18[var27][var31]);
                                    }
                                 }

                                 byte var10001;
                                 label577: {
                                    hb[] var24;
                                    if ((this.C == 7 || this.C == 8)
                                       && var35 == this.g
                                       && var39 == this.h
                                       && hb.Q != null
                                       && hb.Q[var35][var39]
                                       && o.b(this.g, this.h, var35, var39) <= 1
                                       && (var24 = hb.c((int)((byte)var35), (int)((byte)var39))) != null) {
                                       var13 = 0;

                                       while (var13 < var24.length) {
                                          var45 = var24[var13].o;
                                          var10001 = 13;
                                          if (var11) {
                                             break label577;
                                          }

                                          if (var24[var13].o == 13) {
                                             var24[var13].b(var24[var13].q, var24[var13].r, false);
                                          }

                                          var13++;
                                          if (var11) {
                                             break;
                                          }
                                       }
                                    }

                                    var45 = this.C;
                                    var10001 = 13;
                                 }

                                 if (var45 != var10001 || var35 != this.g || var39 != this.h) {
                                    break;
                                 }

                                 byte var22 = 0;

                                 while (true) {
                                    if (var22 >= 4) {
                                       break label425;
                                    }

                                    byte var25 = y.b(var22, (byte)var35);
                                    byte var16 = y.c(var22, (byte)var39);
                                    var45 = o.b(var25, var16);
                                    if (var11) {
                                       break;
                                    }

                                    label420: {
                                       if (var45 != 0 && hb.Q[var25][var16]) {
                                          int var10 = 0;

                                          while (var10 < fb.Ud.size()) {
                                             hb var9;
                                             var48 = (var9 = (hb)fb.Ud.elementAt(var10)).S;
                                             if (var11) {
                                                break label420;
                                             }

                                             if (var48 != 0 && var9.o == 13 && var9.q == var25 && var9.r == var16) {
                                                var9.b(var9.q, var9.r, false);
                                                if (!var11) {
                                                   break;
                                                }
                                             }

                                             var10++;
                                             if (var11) {
                                                break;
                                             }
                                          }
                                       }

                                       var48 = (byte)(var22 + 1);
                                    }

                                    var22 = var48;
                                    if (var11) {
                                       break label425;
                                    }
                                 }
                              }

                              var31++;
                              if (var11) {
                                 break label430;
                              }
                           }
                        }

                        var27++;
                     } while (!var11);
                  }

                  super.h();
                  if (this.y != null) {
                     this.y.c();
                  }

                  if (this.z != null) {
                     this.z.c();
                  }

                  if (this.y == null) {
                     break label535;
                  }

                  var45 = this.y.e;
               }

               if (!var45 && (this.z == null || !this.z.e)) {
                  this.t = true;
                  return;
               }
            }

            if (this.y == null && this.z == null) {
               this.t = true;
            }
         }
      }
   }

   private void b(byte var1, byte var2, int var3, boolean var4, int var5, boolean var6) {
      boolean var14 = ab.xc;
      if (fb.M || fb.i()) {
         if (var3 == 0) {
            return;
         }

         byte var7 = 0;
         Vector var8 = null;
         if (var4) {
            var7 = 4;
            var8 = new Vector();
         }

         byte var12 = -1;

         while (var12 < var7) {
            label131: {
               byte var10;
               byte var11;
               if (var12 != -1) {
                  var10 = y.b(var12, var1);
                  var11 = y.c(var12, var2);
                  if (!o.b((byte)var10, (byte)var11)) {
                     break label131;
                  }
               } else {
                  var10 = var1;
                  var11 = var2;
               }

               q var9 = this.v != null ? this.v : this.u;
               q[] var15;
               if ((var15 = q.b(var10, var11, 2, var9)) != null) {
                  var11 = 0;

                  while (var11 < var15.length) {
                     q var16;
                     label117:
                     if ((var16 = var15[var11]) != null && (this.C != 3 && this.C != 4 || this.u == null || var16.w != this.u.w)) {
                        if (var4) {
                           switch (var12) {
                              case 0:
                                 if (var16.d / 10 % 30 > 10) {
                                    break label117;
                                 }
                                 break;
                              case 1:
                                 if (var16.c / 10 % 30 < 20) {
                                    break label117;
                                 }
                                 break;
                              case 2:
                                 if (var16.d / 10 % 30 < 20) {
                                    break label117;
                                 }
                                 break;
                              case 3:
                                 if (var16.c / 10 % 30 > 10) {
                                    break label117;
                                 }
                           }

                           if (var8.indexOf(var16) != -1) {
                              break label117;
                           }
                        }

                        byte var13;
                        var13 = -1;
                        label95:
                        if (var16 != null && this.v != null) {
                           if (var16.w == this.v.w) {
                              var13 = this.u.w;
                              if (!var14) {
                                 break label95;
                              }
                           }

                           var13 = this.v.w;
                        }

                        label87: {
                           if (this.G != 0) {
                              label84: {
                                 if (!var16.Wb) {
                                    var16.b(var3 / 3, var13, var5, false);
                                    if (!var14) {
                                       break label84;
                                    }
                                 }

                                 var16.b(var3, var13, var5, false);
                              }

                              if (var16.Tb || !var16.Wb) {
                                 break label87;
                              }

                              var16.b(this.G);
                              if (!var14) {
                                 break label87;
                              }
                           }

                           var16.b(var3, var13, var5, var6);
                        }

                        if (var4) {
                           var8.addElement(var16);
                        }
                     }

                     var11++;
                     if (var14) {
                        break;
                     }
                  }
               }
            }

            var12++;
            if (var14) {
               break;
            }
         }
      }
   }

   public final void b(int var1, q var2) {
      if (!fb.M && !fb.i()) {
         this.t = true;
      } else {
         this.H = true;
         this.I = var1;
         this.v = var2;
      }
   }

   public final void b(Graphics var1) {
      if (this.z != null && this.z.e) {
         this.z.b(var1, super.c / 10 - fb.Ge, super.d / 10 + this.B - fb.He);
      }

      if (this.y != null && this.y.e) {
         this.y.b(var1, super.c / 10 - fb.Ge, super.d / 10 - this.A - fb.He);
      }
   }
}
