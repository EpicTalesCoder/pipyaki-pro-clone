import javax.microedition.lcdui.Graphics;

public final class gb {
   private static int[] b = new int[]{16, 9, 3, 0, 0, 4, 10, 17, 24, 28};
   private static int[] c = new int[]{29, 28, 24, 18, 10, 4, 0, 0, 3, 9};
   public boolean d = false;
   private int e;
   private int f;
   private int g;
   public int h;
   public int i;
   public int j;
   public int k;
   public int l;
   public int m;
   public int n;
   public int o;
   private qb p;
   public int q;
   public int r;
   public int s;
   public int t;
   public String u = "";
   public boolean v;
   public int w;
   private int x;
   private int y;
   private boolean z;
   public boolean A;
   public int B;
   private int C;
   private int D;

   public gb(int var1, qb var2, int var3, int var4, String var5) {
      this.n = var1;
      this.p = var2;
      this.o = var3;
      this.q = 0;
      this.u = var5;
      this.a();
   }

   public gb(int var1, qb var2, int var3, int var4) {
      this.n = var1;
      this.p = var2;
      this.o = var3;
      this.q = var4;
      this.a();
   }

   private void a() {
      label177: {
         boolean var1 = ab.xc;
         if (this.o == 10) {
            this.l = ab.j() / 10;
            if (!var1) {
               break label177;
            }
         }

         if (this.o == 24) {
            this.l = ab.i() / 10;
            if (!var1) {
               break label177;
            }
         }

         if (this.o == 11) {
            if (ab.Ib) {
               this.l = 1;
               if (!var1) {
                  break label177;
               }
            }

            this.l = 0;
            if (!var1) {
               break label177;
            }
         }

         if (this.o == 37) {
            if (ab.Db) {
               this.l = 1;
               if (!var1) {
                  break label177;
               }
            }

            this.l = 0;
            if (!var1) {
               break label177;
            }
         }

         if (this.o == 18) {
            if (ab.Jb) {
               this.l = 0;
               if (!var1) {
                  break label177;
               }
            }

            this.l = 1;
            if (!var1) {
               break label177;
            }
         }

         if (this.o == 60) {
            this.l = ab.hc ? 1 : 0;
            if (!var1) {
               break label177;
            }
         }

         if (this.o == 29) {
            this.l = ab.Nb;
            if (!var1) {
               break label177;
            }
         }

         if (this.o == 28) {
            this.l = ab.Mb;
            if (!var1) {
               break label177;
            }
         }

         if (this.o == 27) {
            this.l = ab.Lb;
            if (!var1) {
               break label177;
            }
         }

         if (this.o == 33) {
            this.u = ab.Kb;
            if (!var1) {
               break label177;
            }
         }

         if (this.o == 39) {
            this.u = "SMS = " + this.p.I() + "^41~";
            if (!var1) {
               break label177;
            }
         }

         if (this.o == 17) {
            this.l = ab.Ub;
            if (!var1) {
               break label177;
            }
         }

         if (this.o == 47) {
            if (ab.cc) {
               this.l = 1;
               if (!var1) {
                  break label177;
               }
            }

            this.l = 0;
            if (!var1) {
               break label177;
            }
         }

         if (this.o == 43) {
            if (ab.Cb) {
               this.l = 1;
               if (!var1) {
                  break label177;
               }
            }

            this.l = 0;
            if (!var1) {
               break label177;
            }
         }

         if (this.o == 30) {
            if (ab.gc) {
               this.l = 1;
               if (!var1) {
                  break label177;
               }
            }

            this.l = 0;
            if (!var1) {
               break label177;
            }
         }

         if (this.o == 58) {
            this.l = ab.ec;
            if (!var1) {
               break label177;
            }
         }

         if (this.o == 59) {
            this.l = ab.fc;
            if (!var1) {
               break label177;
            }
         }

         if (this.o == 57) {
            this.l = ab.dc;
         }
      }

      if (this.f()) {
         this.D = 18;
         if (this.D < ab.F.getHeight() + 4) {
            this.D = ab.F.getHeight() + 4;
         }

         this.C = 120;
      } else if (this.o == 51) {
         this.C = qb.S.d;
         this.D = qb.S.e;
      } else if (this.o == 54) {
         this.C = ab.D - 14;
         if (this.p.G && this.p.yc >= 0) {
            this.D = b.c(this.u, this.b()) + 10;
         } else {
            this.D = ab.C.b(this.u, this.b()) + 10;
         }
      } else if (this.o == 21) {
         this.C = qb.R.d;
         this.D = qb.R.e;
      } else if (this.o == 34) {
         this.C = qb.V.d;
         this.D = qb.V.e;
      } else {
         this.C = this.p.wb;
         this.D = this.p.xb;
      }
   }

   public final int b() {
      return this.o == 53 && this.p.Rb == this.o ? this.p.wb : this.C;
   }

   public final int c() {
      return this.o == 53 && this.p.Rb == this.o ? this.p.xb : this.D;
   }

   public final int d() {
      return this.f() ? this.c() + 6 : this.c();
   }

   private boolean f() {
      return this.o == 49 || this.o == 50 || this.o == 52 || this.o == 53 && this.p.Rb != this.o;
   }

   public final void b(Graphics var1, int var2, int var3) {
      boolean var15 = ab.xc;
      int var4 = this.f;
      int var5 = this.g;
      if (this.r()) {
         var4 = ab.D / 2 - var2;
      }

      int var6 = var4 + var2 - this.b() / 2;
      int var7 = var5 + var3 - this.c() / 2;
      this.j = var4 + var2;
      this.k = var5 + var3;
      int var10 = var3;
      int var9 = var2;
      gb var8 = this;
      int var10002 = ab.D;
      int var10003 = ab.E;
      int var10004 = var8.f + var9 - var8.b() / 2;
      int var10005 = var8.g + var10 - var8.c() / 2;
      int var14 = var8.c();
      int var13 = var8.b();
      int var12 = var10005;
      int var11 = var10004;
      var10 = var10003;
      var9 = var10002;
      boolean var16 = false;
      boolean var17 = false;
      if (0 < var13 + var11 && var9 > var11 && var14 + var12 > 0 && var12 < var10) {
         if (this.o == 54) {
            if (this.p.G && this.p.yc >= 0) {
               String var26 = "";
               if (this.u.indexOf("\n") + 1 >= 0 && this.u.lastIndexOf(10) >= 0 && this.u.indexOf("\n") != this.u.lastIndexOf(10)) {
                  var26 = this.u.substring(this.u.indexOf("\n") + 1, this.u.lastIndexOf(10));
               }

               var1.setColor(255, 255, 255);
               if (!var26.equals("") && var26.indexOf("ppy") >= 0) {
                  String var34 = this.u.substring(0, this.u.indexOf("\n"));
                  String var39 = this.u.substring(this.u.lastIndexOf(10) + 1, this.u.length());
                  b.c(var1, var34, var4 + var2, var7, this.b(), 2);
                  var11 = b.c(var34, this.b());
                  var1.setColor(-8323328);
                  b.c(var1, var26, var4 + var2, var7 + var11 - 1, this.b(), 2);
                  var11 = var11 - 1 + b.c(var26, this.b());
                  var1.setColor(255, 255, 255);
                  b.c(var1, var39, var4 + var2, var7 + var11 - 1, this.b(), 2);
               } else {
                  b.c(var1, this.u, var4 + var2, var7, this.b(), 2);
               }

               this.j = var4 + var2;
               this.k = var7;
            } else {
               ab.C.b(var1, this.u, var4 + var2 - 2, var7, this.b(), 2);
               this.j = var4 + var2 - 2;
               this.k = var7;
            }
         } else if (this.f()) {
            String var25 = this.u;
            if (!this.u.equals("")) {
               if (this.p.G && this.p.yc >= 0) {
                  if (this.n == this.p.Kb) {
                     this.b(var1, var25, var5 + var3, this.D);
                  }

                  var1.setColor(255, 255, 255);
                  b.c(var1, var25, (ab.D - ab.F.stringWidth(var25)) / 2, var5 + 3 + var3, -1, 0);
                  this.j = (ab.D - ab.F.stringWidth(var25)) / 2;
                  this.k = var5 + var3 + 3;
                  return;
               }

               label686: {
                  var9 = ab.C.b(var25);
                  if (this.p.Kb != this.n || this.v || !this.h()) {
                     var25 = ab.C.d + "~" + var25;
                     if (!var15) {
                        break label686;
                     }
                  }

                  if (this.n == this.p.Kb) {
                     this.b(var1, var25, var5 + var3, this.D);
                  }
               }

               ab.C.b(var1, var25, (ab.D - var9) / 2, var5 + 3 + var3, -1, 0);
               this.j = (ab.D - var9) / 2;
               this.k = var5 + var3 + 3;
            }
         } else if (this.o == 21) {
            qb.R.b = this.p.Kb == this.n ? 0 : 2 + this.l;
            qb.R.b(var6, var7);
            qb.R.b(var1);
            this.j = var6;
            this.k = var7;
            String var24;
            if (!(var24 = this.q()).equals("")) {
               if (this.p.Kb != this.n || this.v || !this.h()) {
                  var24 = ab.C.d + "~" + var24;
               }

               ab.C.b(var1, var24, var6 + this.b() + 4, var5 - ab.C.c() / 2 + var3, -1, 0);
               this.j = var6 + this.b() + 4;
               this.k = var5 - ab.C.c() / 2 + var3;
            }
         } else if (this.o == 34) {
            label335: {
               int var23 = this.g();
               qb.V.b(var4 + var2, var5 + var3);
               qb.V.b = var23 - 3;
               qb.V.b(var1);
               this.j = var4 + var2;
               this.k = var5 + var3;
               if (this.n <= 14 && this.p.bc.bc == this.n - 1) {
                  qb.nb.b(var4 + var2, var5 + var3);
                  qb.nb.b = 0;
                  qb.nb.b(var1);
                  if (!var15) {
                     break label335;
                  }
               }

               if (this.p.bc.cc == this.n - 1) {
                  qb.nb.b(var4 + var2, var5 + var3);
                  qb.nb.b = 1;
                  qb.nb.b(var1);
               }
            }

            if (this.l != 0) {
               if (this.l == -1) {
                  var1.drawImage(qb.ab, var4 + var2 + 39 - qb.ab.getWidth(), var5 + var3 + 30, 0);
                  return;
               }

               b.b(var1, "" + this.l, var4 + var2 + 39, var5 + var3 + 30, 1);
            }
         } else if (this.o == 51) {
            qb.S.b = 22;
            qb.S.c = 0;
            qb.S.b(var6, var7);
            qb.S.b(var1);
            qb.S.c = 0;
            this.j = var6;
            this.k = var7;
         } else {
            var18 = 4;
            label638:
            if (!this.r()) {
               if (this.v) {
                  if ((var18 = 3 - this.w) >= 0) {
                     break label638;
                  }

                  var18 = 0;
                  if (!var15) {
                     break label638;
                  }
               }

               if (this.p.Kb == this.n) {
                  label627:
                  if (this.k()) {
                     if (this.s % 2 == 1) {
                        this.b(var1, 1, var4 + var2 - this.y - this.p.Pb, var5 + var3 - this.p.Qb / 2);
                        this.b(var1, 3, var4 + var2 + this.x, var5 + var3 - this.p.Qb / 2);
                        if (!var15) {
                           break label627;
                        }
                     }

                     this.b(var1, 4, var4 + var2 - this.p.Pb / 2, var5 + var3 - this.x - this.p.Qb);
                     this.b(var1, 2, var4 + var2 - this.p.Pb / 2, var5 + var3 + this.y);
                  }

                  var18 = 5;
                  if (!var15) {
                     break label638;
                  }
               }

               if (this.B > 0) {
                  var18 = this.B + 5;
               }
            }

            label619: {
               if (var18 == 5) {
                  var19 = 1;
                  if (!var15) {
                     break label619;
                  }
               }

               var19 = 0;
            }

            label614: {
               label688: {
                  var1.drawRegion(qb.db, var19 * this.b(), 0, this.b(), this.c(), 0, var6, var7, 0);
                  label611:
                  if (this.o != 42 && this.o != 36) {
                     label694: {
                        var9 = -1;
                        if (this.o == 1) {
                           var9 = 0;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 31) {
                           var9 = this.p.Rb == 42 && qb.m ? 11 : 0;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 3) {
                           var9 = 1;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 26) {
                           var9 = 2;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 29) {
                           var9 = this.l + 3;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 28) {
                           var9 = 6;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 27 || this.o == 57) {
                           var9 = 7;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 58) {
                           var9 = this.l == 0 ? 9 : 8;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 59 && this.l == 2) {
                           var9 = 29;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 59) {
                           var9 = 10;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 4) {
                           var9 = 11;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 23) {
                           if (this.p.Yb.b == 1 && this.p.Yb.b() > 0) {
                              var9 = 11;
                              if (!var15) {
                                 break label694;
                              }
                           }

                           var9 = 36;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 5) {
                           var9 = 12;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 33) {
                           var9 = 13;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 56) {
                           var9 = 14;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 30) {
                           var9 = 15;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 9) {
                           var9 = 16;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 10) {
                           var9 = 17;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 11) {
                           var9 = 18;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 25 || this.o == 0 && this.p.Rb == 25) {
                           var9 = 19;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 37) {
                           var9 = 37;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 38) {
                           var9 = 20;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 35) {
                           var9 = 21;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 13 || this.o == 20) {
                           var9 = 22;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 15) {
                           var9 = 23;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 16) {
                           var9 = 24;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 0 && (this.p.Rb == 45 || this.p.Rb == 46)) {
                           var9 = 0;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 19 || this.o == 22) {
                           var9 = 26;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 2) {
                           var9 = 25;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 32) {
                           var9 = this.p.Rb == 63 ? 25 : 27;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 0) {
                           var9 = 27;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 14) {
                           var9 = 30;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 61) {
                           var9 = 31;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 62) {
                           var9 = 32;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 53) {
                           var9 = 33;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 55) {
                           var9 = 34;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 39) {
                           var9 = 38;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 40) {
                           var9 = 40;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 41) {
                           var9 = 39;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 17) {
                           var9 = 35;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 44) {
                           var9 = 41;
                           if (!var15) {
                              break label694;
                           }
                        }

                        if (this.o == 64) {
                           var9 = 47;
                        }
                     }

                     var10 = var6 + this.p.yb;
                     var11 = var7 + this.p.zb;
                     this.j = var6;
                     this.k = var7;
                     if (var9 != -1) {
                        qb.K.b = var9;
                        qb.K.b(var10, var11);
                        qb.K.b(var1);
                     }

                     if (this.o == 57) {
                        qb.gb.b = this.l;
                        qb.gb.b(var10 + 14, var11 + 14);
                        qb.gb.b(var1);
                        if (!var15) {
                           break label611;
                        }
                     }

                     if (this.o == 30 && this.l == 1) {
                        var1.drawImage(qb.hb, var10 + 18, var11 + 8, 0);
                        if (!var15) {
                           break label611;
                        }
                     }

                     label422:
                     if (this.o != 31) {
                        if (this.o == 59 && this.l == 1) {
                           var1.drawImage(qb.ib, var10, var11 + 15, 0);
                           if (!var15) {
                              break label422;
                           }
                        }

                        if (this.o == 37 && this.l == 0) {
                           var1.drawImage(qb.jb, var10 + 10, var11 + 7, 0);
                           if (!var15) {
                              break label422;
                           }
                        }

                        if (this.o == 11 && this.l == 0) {
                           var1.drawImage(qb.kb, var10 + 18, var11 + 23, 0);
                           if (!var15) {
                              break label422;
                           }
                        }

                        label406:
                        if (this.o == 10) {
                           if (this.l == 0) {
                              var1.drawImage(qb.mb, var10 + 21, var11 + 17, 0);
                              if (!var15) {
                                 break label406;
                              }
                           }

                           int var22 = 0;

                           while (var22 < this.l) {
                              var1.drawImage(qb.lb, var10 + b[var22], var11 + c[var22], 0);
                              var22++;
                              if (var15) {
                                 break label688;
                              }

                              if (var15) {
                                 break;
                              }
                           }
                        }
                     }
                  } else {
                     label607: {
                        if (this.o == 42) {
                           var9 = this.g();
                           if (!var15) {
                              break label607;
                           }
                        }

                        var9 = mb.b[this.n - qb.lc];
                     }

                     if (var9 != -1) {
                        qb.V.b = var9 - 3;
                        qb.V.b(var6 + this.p.Ab, var7 + this.p.Bb);
                        qb.V.b(var1);
                        this.j = var6 + this.p.Ab;
                        this.k = var7 + this.p.Bb;
                     }

                     if (this.o == 36) {
                        label600: {
                           if (this.p.Kb != this.n) {
                              qb.fb.b = 1;
                              if (!var15) {
                                 break label600;
                              }
                           }

                           qb.fb.b = 0;
                        }

                        qb.fb.b(var6 + 32, var7 + 36);
                        qb.fb.b(var1);
                        this.j = var6 + 32;
                        this.k = var7 + 36;
                        if (!this.v) {
                           label594: {
                              var10 = this.n - qb.lc;
                              if (this.k() && this.p.Kb == this.n) {
                                 if ((var20 = this.x - 5) >= -10) {
                                    break label594;
                                 }

                                 var20 = -10;
                                 if (!var15) {
                                    break label594;
                                 }
                              }

                              var20 = -5;
                           }

                           int var21 = var20 + this.b() + var6;
                           ab.C.b(var1, "" + this.l + "/" + mb.c(var10), var21 + 3, this.g + var3 - ab.C.c() / 2, -1, 0);
                           this.j = var6 + 3;
                           this.k = this.g + var3 - this.D / 2;
                        }
                     }
                  }

                  if (this.o == 27) {
                     String var31 = "" + this.l;
                     if (this.p.Kb != this.n || this.v || !this.h()) {
                        var31 = ab.C.d + "~" + var31;
                     }

                     ab.C.b(var1, var31, var4 + var2 + 6, var5 + var3, -1, 2);
                     break label614;
                  }
               }

               if (this.o == 17) {
                  String var30 = "" + this.l;
                  if (this.p.Kb != this.n || this.v || !this.h()) {
                     var30 = ab.C.d + "~" + var30;
                  }

                  ab.C.b(var1, var30, var4 + var2 - 1, var5 + var3 - 5, -1, 2);
               }
            }

            label665: {
               if (!this.h() && !this.v && this.o != 42 && this.o != 36) {
                  qb.L.b = 1;
                  qb.L.b(var6, var7);
                  qb.L.b(var1);
                  if (!var15) {
                     break label665;
                  }
               }

               if ((this.o == 38 || this.o == 13) && ab.yb && !this.v) {
                  qb.L.b = 0;
                  qb.L.b(var6, var7);
                  qb.L.b(var1);
               }
            }

            if (!this.v) {
               String var32 = this.q();
               if (this.o == 53) {
                  var32 = this.u;
               }

               if (!var32.equals("")) {
                  if (this.p.Kb != this.n || this.v || !this.h()) {
                     var32 = ab.C.d + "~" + var32;
                  }

                  label355: {
                     if (this.k() && this.p.Kb == this.n) {
                        if ((var10 = this.x - 5) >= -10) {
                           break label355;
                        }

                        var10 = -10;
                        if (!var15) {
                           break label355;
                        }
                     }

                     var10 = -5;
                  }

                  if (this.s % 2 == 0 || this.o == 53) {
                     ab.C.b(var1, var32, var4 + var2 + 2, var7 + this.c() + var10 + 5, -1, 2);
                     return;
                  }

                  ab.C.b(var1, var32, var6 + this.b() + var10, var5 - ab.C.c() / 2 + var3, -1, 0);
               }
            }
         }
      }
   }

   public final int g() {
      boolean var1;
      int var2;
      label40: {
         boolean var3 = ab.xc;
         var1 = true;
         var2 = 4;
         if (this.o == 34) {
            if (this.n <= 14) {
               if (this.p.bc.Yb[this.n - 1] == 0) {
                  var2 = this.n - 1;
                  if (!ab.Yb[var2]) {
                     var1 = false;
                  }
               }

               var2 = this.n + 4;
               if (!var3) {
                  break label40;
               }
            }

            if (this.p.bc.dc[this.n - 1 - 14] == 0) {
               var2 = this.n - 1 - 14;
               if (!ab.Zb[var2]) {
                  var1 = false;
               }
            }

            var2 = this.n + 4;
            if (!var3) {
               break label40;
            }
         }

         if (this.o == 42) {
            var2 = this.n - qb.kc + 5;
         }
      }

      if ((!ab.d || this.o != 42) && !var1) {
         var2 = 4;
      }

      return var2;
   }

   public final boolean h() {
      if (this.d) {
         return false;
      }

      if ((this.o == 4 || this.o == 5 || this.o == 26) && qb.tb) {
         return false;
      }

      if (this.o == 10 && !ub.b) {
         return false;
      }

      if (this.o == 24 && !ub.c) {
         return false;
      }

      if (this.o == 34 && this.p.bc != null) {
         if (this.n <= 14) {
            if (this.p.bc.Yb[this.n - 1] == 0) {
               return false;
            }
         } else {
            if (this.p.bc.dc[this.n - 1 - 14] == 0) {
               return false;
            }

            if (this.n - 1 - 14 == 0 && this.p.bc.nc >= this.p.bc.mc) {
               return false;
            }
         }
      }

      return true;
   }

   public final void i() {
      boolean var5 = ab.xc;
      byte var1 = 4;
      if (this.v) {
         var1 = 2;
      }

      if (this.w > 0) {
         this.w++;
         if (this.w > 3) {
            this.v = false;
         }
      }

      int var2 = this.h;
      int var3 = this.i;
      if (this.f != var2) {
         int var4;
         label87:
         if ((var4 = (var2 - this.f) / var1) == 0) {
            if (this.f > var2) {
               var4 = -1;
               if (!var5) {
                  break label87;
               }
            }

            var4 = 1;
         }

         this.f += var4;
      }

      if (this.g != var3) {
         int var6;
         label78:
         if ((var6 = (var3 - this.g) / var1) == 0) {
            if (this.g > var3) {
               var6 = -1;
               if (!var5) {
                  break label78;
               }
            }

            var6 = 1;
         }

         this.g += var6;
      }

      int var7;
      label72: {
         if (this.s % 2 == 1) {
            var7 = this.b() / 2 - 14;
            if (!var5) {
               break label72;
            }
         }

         var7 = this.c() / 2 - 14;
      }

      label67: {
         if (this.z) {
            if (this.x <= 0) {
               break label67;
            }

            this.x -= 4;
            if (!var5) {
               break label67;
            }
         }

         if (this.x < var7) {
            this.x += 4;
         }
      }

      label60: {
         if (this.A) {
            if (this.y <= 0) {
               break label60;
            }

            this.y -= 4;
            if (!var5) {
               break label60;
            }
         }

         if (this.y < var7) {
            this.y += 4;
         }
      }

      if (this.w == 0 && this.f == var2 && this.g == var3) {
         this.w = 1;
      }

      if (this.p.Kb == this.n) {
         this.e = 0;
      } else {
         this.e++;
         if (this.e > 9) {
            this.e = 9;
         }
      }
   }

   public final boolean j() {
      if (this.o == 21 && this.p.x != -1 && this.p.x != this.n) {
         return false;
      } else if (this.p.Kb != -1 && this.p.Db[this.p.Kb] != null && this.p.Db[this.p.Kb].q != -1) {
         boolean var1;
         return (var1 = this.v || this.q == this.p.Db[this.p.Kb].q || this.q == this.p.Db[this.p.Db[this.p.Kb].q].q || this.q == this.p.Kb)
               || this.p.Db[this.p.Db[this.p.Kb].q].q == -1
            ? var1
            : this.q == this.p.Db[this.p.Db[this.p.Db[this.p.Kb].q].q].q;
      } else {
         return false;
      }
   }

   public final boolean k() {
      return !this.h()
         ? false
         : this.o == 10
            || this.o == 24
            || this.o == 47
            || this.o == 43
            || this.o == 11
            || this.o == 18
            || this.o == 37
            || this.o == 27
            || this.o == 29
            || this.o == 28
            || this.o == 42
            || this.o == 36
            || this.o == 58
            || this.o == 59
            || this.o == 57
            || this.o == 30
            || this.o == 60
            || this.o == 17;
   }

   private int l() {
      if (this.o == 10 || this.o == 24) {
         return 10;
      }

      if (this.o == 11 || this.o == 47 || this.o == 58 || this.o == 30 || this.o == 60 || this.o == 37 || this.o == 43) {
         return 1;
      }

      if (this.o == 18) {
         return 1;
      }

      if (this.o == 27) {
         return 10;
      }

      if (this.o == 28) {
         return this.p.ac.length - 1;
      }

      if (this.o == 29 || this.o == 59) {
         return 2;
      }

      if (this.o == 42) {
         if (this.l != -1) {
            if (this.n < 14 + qb.kc) {
               if (this.p.H() / hb.d[this.n - qb.kc] > 0) {
                  return this.l + 1;
               }
            } else if (this.p.H() / hb.e[this.n - qb.kc - 14] > 0) {
               return this.l + 1;
            }
         }

         return this.l;
      } else if (this.o == 36) {
         int var1;
         if (mb.c(var1 = this.n - qb.lc) <= this.l) {
            return this.l;
         } else {
            return this.p.H() / mb.b(var1) > 0 ? mb.c(var1) : this.l;
         }
      } else if (this.o == 17) {
         return qb.o;
      } else {
         return this.o == 57 ? 3 : 0;
      }
   }

   private int m() {
      if (this.o == 42) {
         return this.l == -1 ? this.l : this.m;
      } else {
         return this.o == 36 ? this.m : 0;
      }
   }

   public final void b(int var1, boolean var2) {
      boolean var4 = ab.xc;
      if (this.o == 42) {
         if (this.n < 14 + qb.kc) {
            var2 = this.n - qb.kc;
            if ((var1 <= 0 || this.p.H() < hb.d[var2] * var1) && (var1 >= 0 || this.l <= this.m())) {
               return;
            }

            label228: {
               this.p.o(-hb.d[var2] * var1);
               if (qb.m && !this.p.qb) {
                  qb.h[var2] = qb.h[var2] + hb.b[var2] * var1;
                  if (!var4) {
                     break label228;
                  }
               }

               this.p.bc.Yb[var2] = this.p.bc.Yb[var2] + hb.b[var2] * var1;
               if (var2 == this.p.bc.bc) {
                  fb.I.c(hb.b(this.p.bc.bc) + this.p.bc.Yb[this.p.bc.bc]);
               }
            }

            this.l = this.l + hb.b[var2] * var1;
            ab.G.b(ab.O, 1);
            if (var4) {
               return;
            }
         } else {
            var2 = this.n - qb.kc - 14;
            if ((var1 <= 0 || this.p.H() < hb.e[var2] * var1) && (var1 >= 0 || this.l <= this.m())) {
               return;
            }

            label240: {
               this.p.o(-hb.e[var2] * var1);
               if (qb.m && !this.p.qb) {
                  qb.i[var2] = qb.i[var2] + hb.c[var2] * var1;
                  if (!var4) {
                     break label240;
                  }
               }

               this.p.bc.dc[var2] = this.p.bc.dc[var2] + hb.c[var2] * var1;
            }

            this.l = this.l + hb.c[var2] * var1;
            ab.G.b(ab.O, 1);
            if (var4) {
               return;
            }
         }
      } else {
         label222:
         if (this.o != 36) {
            if (var2) {
               this.l += var1;
               if (this.l < this.m()) {
                  this.l = this.l();
                  if (!var4) {
                     break label222;
                  }
               }

               if (this.l <= this.l()) {
                  break label222;
               }

               this.l = this.m();
               if (!var4) {
                  break label222;
               }
            }

            if (this.l == this.m() && var1 < 0) {
               return;
            }

            if (this.l == this.l() && var1 > 0) {
               return;
            }

            this.l += var1;
         } else {
            int var3 = mb.b(var2 = this.n - qb.lc) * var1;
            if ((var1 <= 0 || this.p.H() < var3 || this.l + var1 > this.l()) && (var1 >= 0 || this.l <= this.m())) {
               return;
            }

            label252: {
               this.p.o(-var3);
               if (qb.m && !this.p.qb) {
                  qb.j[var2] = qb.j[var2] + var1;
                  if (!var4) {
                     break label252;
                  }
               }

               this.p.bc.ac[var2] = this.p.bc.ac[var2] + var1;
            }

            ab.f(var1);
            this.l += var1;
            ab.G.b(ab.O, 1);
            if (var4) {
               return;
            }
         }
      }

      label293: {
         this.z = this.l == this.l();
         this.A = this.l == this.m();
         if (this.o == 10) {
            var2 = ab.j();
            ab.Eb = this.l * 10;
            if (var2 == 0 && ab.Eb != 0) {
               ab.Gb = true;
               this.p.B();
               if (!var4) {
                  return;
               }
            }

            if (ab.j() != 0) {
               break label293;
            }

            ab.G.f();
            if (var4) {
               break label293;
            }
         } else if (this.o == 24) {
            ab.Fb = this.l * 10;
            if (this.l > 0) {
               ab.Hb = true;
            }

            if (ab.G != null) {
               ab.G.c();
               if (ab.i() > 0) {
                  ab.G.b(ab.I, 1);
                  return;
               }
            }
         } else if (this.o == 11) {
            if (ab.Ib = this.l == 1) {
               rc.b(200, 1);
               return;
            }
         } else {
            if (this.o == 37) {
               ab.Db = this.l == 1;
               return;
            }

            if (this.o == 18) {
               ab.Jb = this.l == 0;
               ab.Jb = true;
               return;
            }

            if (this.o == 60) {
               ab.hc = this.l == 1;
               return;
            }

            if (this.o == 27) {
               ab.Lb = this.l;
               return;
            }

            if (this.o == 29) {
               ab.Nb = this.l;
               ab.m = (byte)this.l;
               ab.Mb = 0;
               this.p.l();
               return;
            }

            if (this.o == 28) {
               ab.Mb = this.l;
               return;
            }

            if (this.o == 47) {
               ab.cc = this.l == 1;
               return;
            }

            if (this.o == 43) {
               ab.Cb = this.l == 1;
               return;
            }

            if (this.o == 58) {
               ab.ec = (byte)this.l;
               return;
            }

            if (this.o == 57) {
               ab.dc = (byte)this.l;
               return;
            }

            if (this.o == 30) {
               ab.gc = this.l == 1;
               ab.n = this.l == 1;
               return;
            }

            if (this.o == 59) {
               ab.fc = (byte)this.l;
               return;
            }

            if (this.o == 17) {
               ab.Ub = (byte)this.l;
            }
         }

         return;
      }

      ab.G.b();
   }

   public final void n() {
      this.x = 0;
      this.y = 0;
      this.z = this.l == this.l();
      this.A = this.l == this.m();
   }

   private void b(Graphics var1, int var2, int var3, int var4) {
      var1.drawRegion(qb.eb, (var2 - 1) * this.p.Pb, 0, this.p.Pb, this.p.Qb, 0, var3, var4, 0);
   }

   private void b(Graphics var1, String var2, int var3, int var4) {
      boolean var5 = ab.xc;
      var3 -= qb.W.e - var4 >> 1;
      int var6;
      if (this.p.G && this.p.yc >= 2) {
         var6 = b.c(var2);
         var3++;
      } else {
         var6 = ab.C.b(var2);
         if (!this.p.G) {
            var3--;
         }
      }

      var4 = 0;

      while (true) {
         if (var4 <= var6) {
            var4 += qb.W.d;
            if (var5) {
               break;
            }

            if (!var5) {
               continue;
            }
         }

         var6 = (ab.D - var4) / 2 - qb.W.d;
         qb.W.b = 0;
         qb.W.b(var6, var3);
         qb.W.b(var1);
         break;
      }

      int var7 = var6 + qb.W.d;

      while (true) {
         if (var7 < (ab.D + var4) / 2) {
            qb.W.b = 1;
            qb.W.b(var7, var3);
            qb.W.b(var1);
            var7 += qb.W.d;
            if (var5) {
               break;
            }

            if (!var5) {
               continue;
            }
         }

         qb.W.b = 2;
         qb.W.b(var7, var3);
         qb.W.b(var1);
         break;
      }
   }

   public final void b(int var1) {
      this.f = var1;
   }

   public final void c(int var1) {
      this.g = var1;
   }

   public final int o() {
      return this.f;
   }

   public final int p() {
      return this.g;
   }

   public final String q() {
      if (this.o == 33 || this.o == 39) {
         return this.u;
      } else if (this.o == 28) {
         return this.p.ac[this.l];
      } else if (this.o == 21) {
         return this.u;
      } else if (this.o == 55 && this.p.Rb == this.o && this.p.H == null) {
         return "+" + this.u;
      } else {
         return this.o == 42 ? "" + this.l : "";
      }
   }

   public final boolean r() {
      return this.o == 61 || this.o == 62;
   }

   public final String s() {
      boolean var2 = ab.xc;
      if (this.p.Rb == 49) {
         return "";
      }

      if (this.o == 29) {
         return ib.c(this.l);
      }

      if (this.o == 64) {
         return ib.c(39);
      }

      if (this.o == 59) {
         return ib.c(this.l + 3);
      }

      String var1 = ib.b(this.o);
      if (this.o == 10 || this.o == 24) {
         if (this.l == 0) {
            var1 = var1 + ": " + ib.c(7);
            if (!var2) {
               return var1;
            }
         }

         var1 = var1 + ": " + this.l;
         if (!var2) {
            return var1;
         }
      }

      if (this.o == 47 || this.o == 11 || this.o == 37 || this.o == 43) {
         if (this.l == 0) {
            var1 = var1 + ": " + ib.c(7);
            if (!var2) {
               return var1;
            }
         }

         var1 = var1 + ": " + ib.c(6);
         if (!var2) {
            return var1;
         }
      }

      if (this.o == 18) {
         if (this.l == 0) {
            var1 = var1 + ": " + ib.c(8);
            if (!var2) {
               return var1;
            }
         }

         var1 = var1 + ": " + ib.c(10);
         if (!var2) {
            return var1;
         }
      }

      if (this.o == 58) {
         var1 = var1 + ": " + ib.c(12 + this.l);
         if (!var2) {
            return var1;
         }
      }

      if (this.o == 57) {
         if (this.l == 0) {
            var1 = var1 + ": " + ib.c(14);
            if (!var2) {
               return var1;
            }
         }

         var1 = var1 + ": " + ib.c(7 + this.l);
         if (!var2) {
            return var1;
         }
      }

      if (this.o == 60) {
         if (this.l == 0) {
            var1 = var1 + ": " + ib.c(8);
            if (!var2) {
               return var1;
            }
         }

         var1 = var1 + ": " + ib.c(10);
         if (!var2) {
            return var1;
         }
      }

      if (this.o == 30) {
         if (this.l == 1) {
            var1 = var1 + ": " + ib.c(6);
            if (!var2) {
               return var1;
            }
         }

         var1 = var1 + ": " + ib.c(7);
      }

      return var1;
   }
}
