import javax.microedition.lcdui.Graphics;

public final class w {
   private static byte[] b = new byte[]{17, 18, 19, 20};
   private o c;
   private int d;
   private int e;
   public boolean f;
   public boolean g;
   public nb h;
   public String i;
   public int j;
   public int k;
   public int l;
   private nb[] m;
   private int[] n;
   private int[] o;
   private int[] p;
   private byte[] q;
   private byte r;
   public int s;
   public boolean t;

   public w(pb var1, int var2, int var3, byte var4, boolean var5, int var6) {
      label85: {
         label88: {
            boolean var13 = ab.xc;
            super();
            this.j = var2 * 10;
            this.k = var3 * 10;
            this.r = (byte)var4;
            switch (this.r) {
               case 0:
                  this.h = new nb(var1);
                  if (!var13) {
                     break label85;
                  }
               case 1:
                  this.h = new nb(var1);
                  this.h.j = (byte)var6;
                  if (!var13) {
                     break label85;
                  }
               case 2:
                  this.h = new nb(var1);
                  this.h.b(false, false, (byte)var6);
                  if (!var13) {
                     break label85;
                  }
               case 3:
                  this.h = new nb(var1);
                  this.h.b(false, false, (byte)var6);
                  if (!var13) {
                     break label85;
                  }
               case 4:
                  this.h = new nb(var1);
                  this.h.b(true, false, (byte)var6);
                  if (!var13) {
                     break label85;
                  }
               case 5:
                  this.h = new nb(var1);
                  this.h.b(true, false, (byte)var6);
                  if (!var13) {
                     break label85;
                  }
               case 6:
                  this.h = new nb(var1);
                  this.h.b((byte)4, (byte)2);
                  if (!var13) {
                     break label85;
                  }
               case 8:
                  if (!var13) {
                     break label85;
                  }
               case 9:
                  this.m = new nb[6];
                  this.n = new int[6];
                  this.o = new int[6];
                  this.q = new byte[6];
                  byte var14 = 0;

                  label77: {
                     while (var14 < 6) {
                        this.m[var14] = new nb(var1);
                        this.q[var14] = -1;
                        var14++;
                        if (var13) {
                           break label77;
                        }

                        if (var13) {
                           break;
                        }
                     }

                     this.s = 50;
                  }

                  if (!var13) {
                     break label85;
                  }
               case 10:
                  this.m = new nb[12];
                  this.n = new int[12];
                  this.o = new int[12];
                  this.p = new int[12];
                  this.q = new byte[12];
                  byte var15 = 0;

                  while (var15 < 12) {
                     this.m[var15] = new nb(var1);
                     this.p[var15] = -(var15 << 2);
                     this.q[var15] = -1;
                     var15++;
                     if (var13) {
                        return;
                     }

                     if (var13) {
                        break;
                     }
                  }

                  if (var13) {
                     break;
                  }
               case 7:
               default:
                  break label85;
               case 11:
                  break;
               case 12:
                  break label88;
            }

            this.m = new nb[35];
            this.n = new int[35];
            this.o = new int[35];
            this.p = new int[35];
            this.q = new byte[175];
            byte var20 = 0;

            while (var20 < 35) {
               this.m[var20] = new nb(var1);
               var2 = var20 * 36 % 360;
               double var11;
               var2 = (int)(Math.cos(var11 = 0.017444444444444446 * var2) * (35 - var20) / 2.0);
               var3 = (int)(Math.sin(var11) * (35 - var20) / 2.0);
               var4 = var20 / 3;
               this.q[var20 * 5] = (byte)var2;
               this.q[var20 * 5 + 1] = (byte)var3;
               this.q[var20 * 5 + 2] = (byte)var4;
               this.q[var20 * 5 + 3] = (byte)(15 + var20 / 3);
               if (var13) {
                  return;
               }

               if (var20 > 0) {
                  this.p[var20] = 35 / var20;
               }

               this.m[var20].b(null, (byte)0, (byte)0, (byte)16, (byte)17, true, false, (byte)0);
               this.m[var20].j = (byte)ab.oc.nextInt(17);
               this.m[var20].i = (byte)ab.oc.nextInt(17);
               var20++;
               if (var13) {
                  break;
               }
            }

            if (!var13) {
               break label85;
            }
         }

         this.h = new nb(var1);
      }

      this.t = var5;
      fb.Xd.addElement(this);
   }

   public final void b(o var1, int var2, int var3) {
      this.c = var1;
      this.d = 0;
      this.e = var3;
   }

   public final void b() {
      boolean var5 = ab.xc;
      if (this.r != 1 && this.h != null) {
         this.h.c();
      }

      if (this.c != null) {
         o var1 = this.c;
         this.j = this.c.c / 10 * 10;
         var1 = this.c;
         this.k = this.c.d / 10 * 10;
         if (this.c instanceof q && ((q)this.c).m()) {
            this.c = null;
            this.f = true;
         }
      }

      if (this.r == 0) {
         this.k -= 10;
         this.s++;
         if (this.s == 50) {
            if (this.h.j == 0) {
               this.h.b((byte)7, (byte)1);
            }

            if (this.h.j == 8) {
               this.h.b((byte)15, (byte)1);
            }
         }

         if (this.s <= 50 || this.h.e) {
            return;
         }
      } else if (this.r == 2) {
         if (this.h.e) {
            return;
         }
      } else if (this.r == 3 || this.r == 5 || this.r == 1) {
         this.s--;
         if (this.s > 0) {
            return;
         }
      } else if (this.r == 6) {
         label291: {
            this.s--;
            if (this.s == 5) {
               this.h.b();
               this.h.j = (byte)(this.h.b.h - 4);
               this.h.b((byte)(this.h.b.h - 1), (byte)2);
               if (!var5) {
                  break label291;
               }
            }

            if (!this.h.e) {
               this.h.b(new byte[]{4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}, true, false, (byte)2);
            }
         }

         if (this.s > 0) {
            return;
         }
      } else if (this.r == 8) {
         this.l += 10;
         this.s++;
         if (this.s <= 75) {
            return;
         }
      } else {
         if (this.r == 9) {
            if (this.m != null && this.n != null && this.o != null && this.q != null) {
               this.l += 5;
               if (this.l >= 360) {
                  this.l = 0;
               }

               if (this.s > 0) {
                  this.s--;
               }

               if (this.s == 0 && fb.kb % 5L == 0L) {
                  int var12 = this.m.length - 1;

                  while (var12 >= 0) {
                     if (this.m[var12] != null && this.q[var12] == 0) {
                        this.q[var12] = 1;
                        this.m[var12].b();
                        this.m[var12].b(b, false, false, (byte)0);
                        if (!var5) {
                           break;
                        }
                     }

                     var12--;
                     if (var5) {
                        break;
                     }
                  }
               }

               boolean var13 = true;
               byte var14 = 0;

               w var16;
               while (true) {
                  if (var14 < this.m.length) {
                     var16 = this;
                     if (var5) {
                        break;
                     }

                     label166:
                     if (this.m[var14] != null) {
                        label170: {
                           if (this.q[var14] == -1) {
                              this.m[var14].b(null, (byte)ab.oc.nextInt(17), (byte)0, (byte)16, (byte)17, true, false, (byte)0);
                              this.q[var14] = 0;
                              if (!var5) {
                                 break label170;
                              }
                           }

                           if (this.q[var14] == 1 && !this.m[var14].e) {
                              this.m[var14] = null;
                              if (!var5) {
                                 break label166;
                              }
                           }
                        }

                        int var10 = (360 / this.m.length * var14 + this.l) % 360;
                        double var11 = 0.017444444444444446 * var10;
                        this.n[var14] = (int)(Math.cos(var11) * 20.0);
                        this.o[var14] = (int)(Math.sin(var11) * 10.0);
                        if (this.m != null) {
                           var13 = false;
                           this.m[var14].c();
                        }
                     }

                     var14++;
                     if (!var5) {
                        continue;
                     }
                  }

                  if (!var13) {
                     return;
                  }

                  var16 = this;
                  break;
               }

               var16.f = true;
               return;
            }

            this.f = true;
            return;
         }

         if (this.r == 10) {
            if (this.m != null && this.n != null && this.o != null && this.p != null && this.q != null) {
               this.l -= 10;
               if (this.l <= 0) {
                  this.l = 360;
               }

               boolean var3 = true;
               byte var4 = 0;

               w var15;
               while (true) {
                  if (var4 < this.m.length) {
                     var15 = this;
                     if (var5) {
                        break;
                     }

                     if (this.m[var4] != null) {
                        int var8;
                        double var9;
                        if ((var8 = (var4 * 60 + this.l) % 360) != 0) {
                           var9 = 0.017444444444444446 * var8;
                        } else {
                           var9 = 0.0;
                        }

                        label318: {
                           this.n[var4] = (int)(Math.cos(var9) * 20.0);
                           this.o[var4] = (int)(Math.sin(var9) * 15.0);
                           this.p[var4] = this.p[var4] + 2;
                           if (this.q[var4] == -1) {
                              if (this.p[var4] < 0 || this.m[var4].e) {
                                 break label318;
                              }

                              this.m[var4].b(b, false, true, (byte)0);
                              this.q[var4] = 0;
                              if (!var5) {
                                 break label318;
                              }
                           }

                           if (this.q[var4] == 0) {
                              if (this.m[var4].e) {
                                 break label318;
                              }

                              this.m[var4].b(null, (byte)0, (byte)0, (byte)16, (byte)17, true, false, (byte)0);
                              this.m[var4].q = 1;
                              this.q[var4] = 1;
                              if (!var5) {
                                 break label318;
                              }
                           }

                           if (this.q[var4] == 1) {
                              if (this.m[var4].e) {
                                 break label318;
                              }

                              this.m[var4].b(b, false, false, (byte)0);
                              this.q[var4] = 2;
                              if (!var5) {
                                 break label318;
                              }
                           }

                           if (!this.m[var4].e) {
                              this.m[var4] = null;
                           }
                        }

                        if (this.m[var4] != null) {
                           var3 = false;
                           this.m[var4].c();
                        }
                     }

                     var4++;
                     if (!var5) {
                        continue;
                     }
                  }

                  if (!var3) {
                     return;
                  }

                  var15 = this;
                  break;
               }

               var15.f = true;
               return;
            }

            this.f = true;
            return;
         }

         if (this.r == 11) {
            if (this.m != null && this.n != null && this.o != null && this.p != null && this.q != null) {
               boolean var7 = true;
               byte var2 = 0;

               w var10000;
               while (true) {
                  if (var2 < this.m.length) {
                     var10000 = this;
                     if (var5) {
                        break;
                     }

                     if (this.m[var2] != null) {
                        label255: {
                           this.n[var2] = this.n[var2] + this.q[var2 * 5];
                           this.o[var2] = this.o[var2] + this.q[var2 * 5 + 1];
                           this.p[var2] = this.p[var2] + this.q[var2 * 5 + 2];
                           this.q[var2 * 5 + 3]--;
                           if (this.q[var2 * 5 + 4] == 0) {
                              if (this.q[var2 * 5 + 3] > 5) {
                                 break label255;
                              }

                              this.q[var2 * 5 + 4] = 1;
                              this.m[var2].b();
                              this.m[var2].b(b, false, false, (byte)0);
                              if (!var5) {
                                 break label255;
                              }
                           }

                           if (this.q[var2 * 5 + 3] <= 0) {
                              this.m[var2] = null;
                           }
                        }

                        if (this.m[var2] != null) {
                           var7 = false;
                           this.m[var2].c();
                        }
                     }

                     var2++;
                     if (!var5) {
                        continue;
                     }
                  }

                  if (!var7) {
                     return;
                  }

                  var10000 = this;
                  break;
               }

               var10000.f = true;
               return;
            }

            this.f = true;
            return;
         }

         if (this.r != 12 || this.h != null && this.h.e) {
            return;
         }
      }

      this.f = true;
   }

   public final void b(Graphics var1) {
      boolean var5;
      int var6;
      int var9;
      label66: {
         var5 = ab.xc;
         if (this.c != null) {
            int var4 = 0;
            if (this.c instanceof u) {
               var4 = ((u)this.c).O;
            }

            o var3 = this.c;
            var6 = this.c.c / 10 - fb.Ge;
            o var7 = this.c;
            var9 = this.c.d / 10 - var4 - fb.He;
            var6 += this.d;
            var9 += this.e;
            if (this.c instanceof q) {
               var9 -= ((q)this.c).Gb / 10;
            }

            if (!var5) {
               break label66;
            }
         }

         var6 = this.j / 10 - fb.Ge;
         var9 = this.k / 10 - fb.He;
      }

      if (this.h != null) {
         this.h.b(var1, var6, var9 - this.l / 10);
      }

      if (this.i != null) {
         ab.C.b(var1, this.i, var6, var9 - this.l / 10, -1, 2);
      }

      if (this.m != null && this.n != null && this.o != null) {
         byte var10 = 0;

         while (var10 < this.m.length) {
            if (this.m[var10] != null && (this.p != null && this.p[var10] >= 0 || this.p == null)) {
               nb var10000;
               Graphics var10001;
               int var10002;
               int var10003;
               int var10004;
               if (this.r == 11) {
                  var10000 = this.m[var10];
                  var10001 = var1;
                  var10002 = var6 + this.n[var10] / 5;
                  var10003 = var9 + this.o[var10] / 5;
                  var10004 = this.p[var10] / 5;
               } else {
                  var10000 = this.m[var10];
                  var10001 = var1;
                  var10002 = var6 + this.n[var10];
                  var10003 = var9 + this.o[var10];
                  var10004 = this.p != null ? this.p[var10] : 0;
               }

               var10000.b(var10001, var10002, var10003 - var10004);
            }

            var10++;
            if (var5) {
               break;
            }
         }
      }
   }

   public final void c() {
      this.f = true;
   }
}
