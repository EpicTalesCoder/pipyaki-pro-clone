import java.io.IOException;
import java.util.Vector;

abstract class jb {
   private boolean a;
   private boolean b;
   public byte c;
   public int d;
   public int e = -1;
   private long f;
   protected boolean g = false;
   protected Vector h;
   protected Vector i;
   private cc j;
   private c k;
   private boolean l;
   private int[] m = new int[]{0};
   private boolean[] n = new boolean[]{true};
   private boolean[] o = new boolean[]{false};

   public jb(c var1) {
      this.k = var1;
      this.h = new Vector();
      this.i = new Vector();
   }

   public final void a() {
      this.g = true;
      this.j = new cc(this);
      this.j.start();
   }

   public final void b(int var1) {
      boolean var3 = ab.xc;
      this.m = new int[var1 + 1];
      this.n = new boolean[var1 + 1];
      this.o = new boolean[var1 + 1];
      int var2 = 0;

      while (true) {
         if (var2 <= var1) {
            this.m[var2] = 0;
            this.n[var2] = true;
            this.o[var2] = false;
            var2++;
            if (var3) {
               break;
            }

            if (!var3) {
               continue;
            }
         }

         this.l = true;
         break;
      }
   }

   abstract void b();

   public final void b(byte[] var1) {
      if (this.g && var1 != null && var1.length > 0) {
         this.h.addElement(var1);
      }
   }

   protected final void c() {
      this.f = System.currentTimeMillis();
      byte[] var1;
      (var1 = new byte[1])[0] = 102;
      this.b(var1);
   }

   abstract void d();

   abstract void e();

   public final void g() {
      if (this.g) {
         try {
            this.d();
         } catch (IOException var2) {
            if (ab.B != null) {
               new StringBuffer().append("WRITE: ").append(var2).toString();
            }

            new StringBuffer().append("S Exception ").append(var2).toString();
            this.i();
         }
      }
   }

   public final void h() {
      boolean var7 = ab.xc;
      if (this.g) {
         if (this.i.size() != 0) {
            int var2 = 0;
            int var3 = 0;
            byte var4 = 0;

            try {
               var3 = 0;

               label62: {
                  while (var3 < this.n.length) {
                     this.n[var3] = true;
                     var3++;
                     if (var7) {
                        break label62;
                     }

                     if (var7) {
                        break;
                     }
                  }

                  var3 = 0;
               }

               var4 = 1;

               while (var3 < this.i.size()) {
                  byte[] var1;
                  label91: {
                     var1 = (byte[])this.i.elementAt(var3);
                     var4 = 2;
                     if (!this.l) {
                        var2 = 0;
                        if (!var7) {
                           break label91;
                        }
                     }

                     var2 = this.k.c(var1);
                  }

                  var4 = 3;
                  if (var2 >= this.n.length) {
                     var2 = 0;
                  }

                  if (var2 != 0) {
                     if (this.o[var2]) {
                        var4 = 4;
                        if (var1[0] == 15) {
                           this.k.b(var1, false);
                           var4 = 5;
                           this.o[var2] = false;
                           var4 = 6;
                        }

                        this.i.removeElementAt(var3);
                        var4 = 7;
                        if (!var7) {
                           continue;
                        }
                     }

                     if (!this.n[var2]) {
                        var4 = 8;
                        var3++;
                        if (!var7) {
                           continue;
                        }
                     }
                  }

                  label85: {
                     var4 = 9;
                     if (!this.k.b(var1, false)) {
                        var4 = 10;
                        if (var2 != 0) {
                           this.n[var2] = false;
                           if (!this.k.c()) {
                              this.m[var2]++;
                           }

                           var4 = 11;
                           if (this.m[var2] > 50) {
                              label52: {
                                 var4 = 12;
                                 this.m[var2] = 0;
                                 this.o[var2] = true;
                                 var4 = 13;
                                 if (this.k.b()) {
                                    fb.I.b((byte)var2, (byte)var2, (byte)1);
                                    if (!var7) {
                                       break label52;
                                    }
                                 }

                                 byte var5 = (byte)var2;
                                 jb var9 = this;
                                 new StringBuffer().append("S").append(var5).toString();
                                 byte[] var6;
                                 (var6 = new byte[3])[0] = 14;
                                 var6[1] = var5;
                                 var6[2] = (byte)var9.e;
                                 var9.b(var6);
                              }

                              var4 = 14;
                              return;
                           }
                           break label85;
                        }

                        var4 = 15;
                        var3++;
                        if (!var7) {
                           break label85;
                        }
                     }

                     var4 = 16;
                     this.m[var2] = 0;
                     this.i.removeElementAt(var3);
                  }

                  var4 = 17;
                  if (var7) {
                     break;
                  }
               }
            } catch (Exception var8) {
               new StringBuffer().append("!!! ").append(var3).append("/").append(this.i.size()).append(" ").append(var2).append(" ").append(var4).toString();
            }
         }
      }
   }

   protected final void c(byte[] var1) {
      System.currentTimeMillis();
      if (var1[0] == 111) {
         ab.B.b(var1[1]);
         this.j();
      } else if (var1[0] == 107) {
         if (this.k.b() && this.e != -1) {
            this.k.b(this.e, false);
         }

         this.a = false;
         if (!this.k.c()) {
            this.b = false;
            new StringBuffer().append("send sync to: ").append(var1[1]).toString();
            fb.I.f(var1[1]);
         }
      } else if (var1[0] == 110) {
         this.k.b(2);
         this.b();
      } else if (var1[0] == 105) {
         this.k.b(1);
         if (!this.k.c()) {
            this.b = false;
            this.m();
         }
      } else if (var1[0] == 104 || var1[0] == 106) {
         label78: {
            this.h.removeAllElements();
            this.i.removeAllElements();
            if (var1[0] == 104) {
               this.k.b(0);
               if (!ab.xc) {
                  break label78;
               }
            }

            if (this.e != -1 && this.k.b()) {
               this.k.b(this.e, true);
            }

            this.a = true;
         }

         this.b = true;
      } else if (var1[0] == 1) {
         this.k.b(var1, false);
      } else if (!this.b) {
         if (var1[0] == 102) {
            (var1 = new byte[1])[0] = 103;
            this.b(var1);
         } else if (var1[0] == 103) {
            long var6 = System.currentTimeMillis() - this.f;
            this.k.b(var6);
            this.c();
         } else {
            byte[] var2 = var1;
            jb var4 = this;
            if (this.g) {
               var4.i.addElement(var2);
            }
         }
      }
   }

   protected final void i() {
      this.k.b("XC");
      this.j();
   }

   public final void j() {
      if (this.g) {
         label17: {
            this.g = false;
            if (this.k.b()) {
               if (this.e < 0) {
                  break label17;
               }

               byte[] var1;
               (var1 = new byte[2])[0] = 101;
               var1[1] = (byte)this.e;
               this.k.b(var1, false);
               this.k.b(var1);
               if (!ab.xc) {
                  break label17;
               }
            }

            this.k.b(2);
         }

         this.b();
      }
   }

   public final void k() {
      jb var1;
      byte[] var2;
      label11: {
         var1 = this;
         var2 = new byte[1];
         if (var1.k.b()) {
            var2[0] = 104;
            if (!ab.xc) {
               break label11;
            }
         }

         var2[0] = 106;
      }

      var1.b(var2);
      this.g();
      this.i.removeAllElements();
      this.b = true;
   }

   public final void l() {
      System.currentTimeMillis();
      if (this.k.b()) {
         byte[] var1;
         (var1 = new byte[1])[0] = 105;
         this.b(var1);
         if (!this.a) {
            this.b = false;
         }

         new StringBuffer().append("send sync to ").append(this.e).toString();
         fb.I.f((byte)this.e);
      } else {
         this.b = false;
         this.m();
      }
   }

   private void m() {
      byte[] var1;
      (var1 = new byte[2])[0] = 107;
      var1[1] = (byte)this.e;
      this.b(var1);
      this.c();
   }
}
