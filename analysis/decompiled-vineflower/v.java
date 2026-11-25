public final class v {
   private byte a;
   private byte b;
   private byte c;
   public byte d;
   private byte f;
   private byte g;
   private byte h;
   private byte i;
   private byte j;
   private byte k;
   private byte l;
   private byte m;
   private byte n;
   private boolean o;
   private q p;
   public boolean q;
   private boolean r;
   private boolean s;
   private boolean t;
   public boolean u;
   public boolean v;
   private boolean w;
   public boolean x;
   public long y;
   public q z;
   private boolean A;

   public v(
      byte var1,
      byte var2,
      byte var3,
      byte var4,
      byte var5,
      byte var6,
      byte var7,
      byte var8,
      byte var9,
      byte var10,
      boolean var11,
      boolean var12,
      boolean var13,
      byte var14,
      byte var15,
      boolean var16,
      byte var17
   ) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var6;
      if (!fb.i() && this.d == 0) {
         this.d = 3;
      }

      this.f = var4;
      this.g = var5;
      this.h = var7;
      this.i = var8;
      if (!o.b(this.h, this.i) && (this.c == 1 || this.c == 2 || this.c == 5)) {
         this.q = true;
      }

      this.j = var14;
      this.k = var15;
      if (o.b(this.j, this.k)) {
         this.s = true;
      }

      this.t = var16;
      this.o = var11;
      this.u = var12;
      this.v = var13;
      this.l = var9;
      if (this.l == 0) {
         this.w = true;
      }

      label46: {
         this.m = var10;
         this.y = this.m * 25;
         this.x = false;
         this.n = var17;
         this.p = null;
         if (this.c == 3) {
            fb.ff = true;
            if (!ab.xc) {
               break label46;
            }
         }

         if (this.c == 19 || this.c == 24) {
            this.A = true;
         }
      }

      fb.Zd.addElement(this);
   }

   public final void b() {
      boolean var3 = ab.xc;
      if (this.r) {
         this.b(this.z);
         this.r = false;
      } else if (this.o && fb.Qd != null) {
         if (this.c == 24) {
            int var5 = 0;

            while (var5 < fb.Ud.size()) {
               hb var4 = (hb)fb.Ud.elementAt(var5);
               if (this.b(var4.q, var4.r)) {
                  var4.p = true;
               }

               var5++;
               if (var3) {
                  break;
               }
            }
         } else if (this.d != 1) {
            if (this.d == 7 && !this.x) {
               this.b(null);
            } else {
               label101:
               if (this.p != null) {
                  if (this.v) {
                     if (this.c(this.p)) {
                        break label101;
                     }

                     this.p = null;
                     if (!var3) {
                        break label101;
                     }
                  }

                  if (!this.b(this.p.g, this.p.h)) {
                     this.p = null;
                  }
               }

               q var10000;
               label125: {
                  if (this.p == null || this.A) {
                     int var1 = 0;

                     while (var1 < fb.Qd.size()) {
                        q var2;
                        var10000 = var2 = (q)fb.Qd.elementAt(var1);
                        if (var3) {
                           break label125;
                        }

                        if (var10000 != null && this.d(var2) && (this.v ? this.c(var2) : this.b(var2.g, var2.h))) {
                           this.p = var2;
                           if (this.v || this.u) {
                              break;
                           }

                           this.b(this.p);
                           if (!var3) {
                              break;
                           }
                        }

                        var1++;
                        if (var3) {
                           break;
                        }
                     }
                  }

                  if (!this.b(fb.I.x, fb.I.y)) {
                     return;
                  }

                  var10000 = this.p;
               }

               if (var10000 != null) {
                  fb.I.A = true;
               }
            }
         }
      }
   }

   public final void b(q var1) {
      boolean var9 = ab.xc;
      if (this.o) {
         if (this.y > 0L) {
            this.z = var1;
            this.x = true;
         } else {
            boolean var27;
            label416: {
               label455: {
                  label456: {
                     label411: {
                        label410: {
                           label422: {
                              label423: {
                                 label424: {
                                    label425: {
                                       label426: {
                                          label427: {
                                             label457: {
                                                label429: {
                                                   label400: {
                                                      boolean var2 = false;
                                                      boolean var3 = false;
                                                      switch (this.c) {
                                                         case 0:
                                                            if (!var9) {
                                                               break label456;
                                                            }
                                                         case 8:
                                                            var3 = true;
                                                         case 2:
                                                            var2 = true;
                                                         case 1:
                                                            if (fb.Zd == null) {
                                                               break label456;
                                                            }

                                                            int var5 = 0;

                                                            while (var5 < fb.Zd.size()) {
                                                               v var4;
                                                               var10000 = var4 = (v)fb.Zd.elementAt(var5);
                                                               if (var9) {
                                                                  break label455;
                                                               }

                                                               if (var10000 != null && var4.a == this.h && var4.b == this.i) {
                                                                  if (var2) {
                                                                     if (var3 && var4.y != 0L) {
                                                                        var4.y = 0L;
                                                                     }

                                                                     var4.r = true;
                                                                     var4.z = var1;
                                                                     if (!var9) {
                                                                        break label456;
                                                                     }
                                                                  }

                                                                  var4.o = !var4.o;
                                                                  if (!var9) {
                                                                     break label456;
                                                                  }
                                                               }

                                                               var5++;
                                                               if (var9) {
                                                                  break;
                                                               }
                                                            }

                                                            if (!var9) {
                                                               break label456;
                                                            }
                                                         case 3:
                                                            fb.I.c(true, false);
                                                            if (!var9) {
                                                               break label456;
                                                            }
                                                         case 4:
                                                            break;
                                                         case 5:
                                                            break label400;
                                                         case 6:
                                                            break label429;
                                                         case 7:
                                                         case 22:
                                                            break label427;
                                                         case 9:
                                                            break label425;
                                                         case 10:
                                                            break label423;
                                                         case 11:
                                                            break label410;
                                                         case 12:
                                                         case 13:
                                                            g var14;
                                                            if ((var14 = g.b(this.h, this.i)) != null) {
                                                               if (this.c == 12 && var14.d == 1) {
                                                                  k.b(var14.e, var14.b, var14.c, false, false);
                                                                  if (!var9) {
                                                                     break label456;
                                                                  }
                                                               }

                                                               if (this.c == 13 && var14.d == 3) {
                                                                  k.c(var14.e, var14.b, var14.c, false, false);
                                                               }
                                                            }
                                                            break label456;
                                                         case 14:
                                                            if (!o.b(this.h, this.i) || j.c(this.h, this.i)) {
                                                               break label456;
                                                            }

                                                            fb.Re[this.h][this.i].d = new j((byte)0, (byte)ab.oc.nextInt(3), this.h, this.i, (byte)0);
                                                            fb.bf[this.h][this.i] = 0;
                                                            if (!var9) {
                                                               break label456;
                                                            }
                                                         case 15:
                                                            break label457;
                                                         case 16:
                                                         case 17:
                                                         case 23:
                                                            break label426;
                                                         case 18:
                                                            break label424;
                                                         case 19:
                                                            break label422;
                                                         case 20:
                                                            break label411;
                                                         case 21:
                                                            if (this.n >= 0) {
                                                               fb.I.f((int)this.n);
                                                            }
                                                         case 24:
                                                         default:
                                                            break label456;
                                                      }

                                                      fb.I.c(false, false);
                                                      if (!var9) {
                                                         break label456;
                                                      }
                                                   }

                                                   label368: {
                                                      label449: {
                                                         fb.I.w = 0;
                                                         fb.I.x = this.h;
                                                         fb.I.y = this.i;
                                                         fb.I.z = 0;
                                                         byte var15 = this.i;
                                                         byte var10 = this.h;
                                                         v[] var17 = null;
                                                         if (fb.Zd != null) {
                                                            int var7 = 0;

                                                            label365:
                                                            while (var7 < 2) {
                                                               int var20 = 0;
                                                               var27 = false;
                                                               if (var9) {
                                                                  break label416;
                                                               }

                                                               int var8 = 0;

                                                               while (true) {
                                                                  if (var8 < fb.Zd.size()) {
                                                                     v var6;
                                                                     var10000 = var6 = (v)fb.Zd.elementAt(var8);
                                                                     if (var9) {
                                                                        break label455;
                                                                     }

                                                                     if (var10000 != null && !var6.q && var6.b(var10, var15)) {
                                                                        if (var7 == 1) {
                                                                           var17[var20] = var6;
                                                                        }

                                                                        var20++;
                                                                     }

                                                                     var8++;
                                                                     if (!var9) {
                                                                        continue;
                                                                     }
                                                                  }

                                                                  if (var7 != 0) {
                                                                     var28 = var17;
                                                                     break label368;
                                                                  }

                                                                  if (var20 <= 0) {
                                                                     break label449;
                                                                  }

                                                                  var17 = new v[var20];
                                                                  if (var9) {
                                                                     break label449;
                                                                  }

                                                                  var7++;
                                                                  if (var9) {
                                                                     break label365;
                                                                  }
                                                                  break;
                                                               }
                                                            }
                                                         }

                                                         var28 = null;
                                                         break label368;
                                                      }

                                                      var28 = null;
                                                   }

                                                   v[] var18 = var28;
                                                   if (var28 == null) {
                                                      break label456;
                                                   }

                                                   int var21 = 0;

                                                   while (var21 < var18.length) {
                                                      var10000 = var18[var21];
                                                      if (var9) {
                                                         break label455;
                                                      }

                                                      label338:
                                                      if (var10000 != null) {
                                                         if (var18[var21].u || var18[var21].v) {
                                                            if (!var18[var21].o
                                                               && (var18[var21].o || !this.s || var18[var21].a != this.j || var18[var21].b != this.k)) {
                                                               break label338;
                                                            }

                                                            if (var18[var21].u) {
                                                               fb.I.w = 1;
                                                               if (!var9) {
                                                                  break label456;
                                                               }
                                                            }

                                                            if (!var18[var21].v) {
                                                               break label338;
                                                            }

                                                            fb.I.w = 2;
                                                            if (!var9) {
                                                               break label456;
                                                            }
                                                         }

                                                         if (this.s && var18[var21].a == this.j && var18[var21].b == this.k && var18[var21].m > 0) {
                                                            fb.I.w = 3;
                                                            if (!var9) {
                                                               break label456;
                                                            }
                                                         }
                                                      }

                                                      var21++;
                                                      if (var9) {
                                                         break;
                                                      }
                                                   }

                                                   if (!var9) {
                                                      break label456;
                                                   }
                                                }

                                                fb.I.w = -1;
                                                if (!var9) {
                                                   break label456;
                                                }
                                                break label427;
                                             }

                                             if (!o.b(this.h, this.i) || !j.c(this.h, this.i)) {
                                                break label456;
                                             }

                                             fb.Re[this.h][this.i].d.f();
                                             fb.Re[this.h][this.i].d = null;
                                             fb.bf[this.h][this.i] = -1;
                                             if (!var9) {
                                                break label456;
                                             }
                                             break label426;
                                          }

                                          if (var1 == null) {
                                             break label456;
                                          }

                                          int var22;
                                          if ((var22 = var1.nc / 2) == 0) {
                                             var22 = 1;
                                          }

                                          if (this.c == 22) {
                                             var1.nc = var22;
                                             if (!var9) {
                                                break label456;
                                             }
                                          }

                                          var1.b(var22, -1, -1, true, false);
                                          if (!var9) {
                                             break label456;
                                          }
                                          break label425;
                                       }

                                       fb.Ce = 60;
                                       if (fb.De == fb.Pd) {
                                          fb.Pd.i();
                                          fb.I.e();
                                       }

                                       if (this.c == 23) {
                                          fb.Ce = 10;
                                       }

                                       ab.w = true;
                                       fb.b((o)null, true);
                                       fb.De = null;
                                       fb.Ee = fb.Ie = this.h * 30 + 15;
                                       fb.Fe = fb.Je = this.i * 30 + 15;
                                       if (this.c != 16) {
                                          break label456;
                                       }

                                       fb.Ge = fb.Ie - ab.D / 2;
                                       fb.He = fb.Je - ab.E / 2;
                                       if (!var9) {
                                          break label456;
                                       }
                                       break label424;
                                    }

                                    sb[] var23;
                                    if ((var23 = sb.b(this.h, this.i)) == null) {
                                       break label456;
                                    }

                                    int var11 = 0;

                                    while (var11 < var23.length) {
                                       if (var23[var11] != null) {
                                          var23[var11].b = true;
                                       }

                                       var11++;
                                       if (var9) {
                                          break;
                                       }
                                    }

                                    if (!var9) {
                                       break label456;
                                    }
                                    break label423;
                                 }

                                 ab.w = false;
                                 fb.Ce = 60;
                                 fb.I.e();
                                 if (fb.De != null || ab.v) {
                                    break label456;
                                 }

                                 fb.Ie = fb.Ee = fb.Pd.g * 30 + 15 - ab.D / 2;
                                 fb.Je = fb.Fe = fb.Pd.h * 30 + 15 - ab.E / 2;
                                 fb.b(fb.Pd, false);
                                 if (!var9) {
                                    break label456;
                                 }
                                 break label422;
                              }

                              sb[] var24;
                              if ((var24 = sb.b(this.h, this.i)) == null) {
                                 break label456;
                              }

                              int var12 = 0;

                              while (var12 < var24.length) {
                                 if (var24[var12] != null) {
                                    var24[var12].b = false;
                                 }

                                 var12++;
                                 if (var9) {
                                    break;
                                 }
                              }

                              if (!var9) {
                                 break label456;
                              }
                              break label410;
                           }

                           var1.a();
                           if (!var9) {
                              break label456;
                           }
                           break label411;
                        }

                        r[] var13;
                        if ((var13 = r.b(this.h, this.i)) != null) {
                           int var16 = 0;

                           while (var16 < var13.length) {
                              if (var13[var16] != null) {
                                 boolean var25 = !var13[var16].A;
                                 var13[var16].A = var25;
                              }

                              var16++;
                              if (var9) {
                                 break label456;
                              }
                           }
                        }
                        break label456;
                     }

                     if (this.l > 1) {
                        this.l--;
                        return;
                     }
                  }

                  var10000 = this;
               }

               var27 = ((v)var10000).s;
            }

            label201: {
               if (var27 && fb.Zd != null) {
                  int var26 = 0;

                  while (var26 < fb.Zd.size()) {
                     v var19;
                     var29 = var19 = (v)fb.Zd.elementAt(var26);
                     if (var9) {
                        break label201;
                     }

                     if (var29 != null && var19 != this && var19.a == this.j && var19.b == this.k) {
                        if (this.t) {
                           var19.r = true;
                           var19.z = var1;
                           if (!var9) {
                              break;
                           }
                        }

                        var19.o = true;
                        if (!var9) {
                           break;
                        }
                     }

                     var26++;
                     if (var9) {
                        break;
                     }
                  }
               }

               var29 = this;
            }

            if (!var29.w) {
               this.l--;
               if (this.l <= 0) {
                  this.q = true;
               }
            }

            if (!this.q) {
               this.x = false;
               this.y = this.m * 25;
            }
         }
      }
   }

   private boolean c(q var1) {
      if (var1.ub == 0) {
         if (this.b(var1.g, var1.h + 1)) {
            return true;
         }
      } else if (var1.ub == 2) {
         if (this.b(var1.g, var1.h - 1)) {
            return true;
         }
      } else if (var1.ub == 1) {
         if (this.b(var1.g - 1, var1.h)) {
            return true;
         }
      } else if (var1.ub == 3 && this.b(var1.g + 1, var1.h)) {
         return true;
      }

      return false;
   }

   public final boolean d(q var1) {
      if (var1 == null) {
         return false;
      }

      if (var1.mb != 0) {
         return false;
      }

      switch (this.d) {
         case 0:
            if (var1 == fb.Pd) {
               return true;
            }
         case 1:
         default:
            break;
         case 2:
            if (var1 != null) {
               return true;
            }
            break;
         case 3:
            if (var1.x >= 0) {
               return true;
            }
            break;
         case 4:
            if (var1.x < 0) {
               return true;
            }
            break;
         case 5:
            if (var1.x == 0) {
               return true;
            }
            break;
         case 6:
            if (var1.x == 1) {
               return true;
            }
      }

      return false;
   }

   public final boolean b(int var1, int var2) {
      return var1 >= this.a && var2 >= this.b && var1 < this.a + this.f && var2 < this.b + this.g;
   }
}
