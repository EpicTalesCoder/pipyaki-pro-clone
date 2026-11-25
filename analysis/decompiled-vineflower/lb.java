public class lb {
   public int b;
   public int c;
   public j d;
   public int[] e;
   public int[] f;

   public lb(fb var1) {
   }

   public lb() {
   }

   public static String b() {
      try {
         String var0;
         if ((var0 = System.getProperty("microedition.platform")).indexOf("Nokia") != -1) {
            return "nokia";
         }

         if (var0.indexOf("SonyEricsson") != -1) {
            return "sonyericsson";
         }
      } catch (Exception var4) {
      }

      try {
         Class.forName("com.samsung.util.Vibration");
         return "samsung";
      } catch (Exception var14) {
         try {
            Class.forName("com.motorola.multimedia.Vibrator");
            return "motorola";
         } catch (Exception var13) {
            try {
               Class.forName("com.motorola.graphics.j3d.Effect3D");
               return "motorola";
            } catch (Exception var12) {
               try {
                  Class.forName("com.motorola.multimedia.Lighting");
                  return "motorola";
               } catch (Exception var11) {
                  try {
                     Class.forName("com.motorola.multimedia.FunLight");
                     return "motorola";
                  } catch (Exception var10) {
                     if (ab.z != null) {
                        try {
                           if (ab.z.getKeyName(-21).toUpperCase().indexOf("SOFT") >= 0) {
                              return "motorola";
                           }
                        } catch (Exception var3) {
                           try {
                              if (ab.z.getKeyName(21).toUpperCase().indexOf("SOFT") >= 0) {
                                 return "motorola";
                              }
                           } catch (Exception var2) {
                              try {
                                 if (ab.z.getKeyName(-20).toUpperCase().indexOf("SOFT") >= 0) {
                                    return "motorola";
                                 }
                              } catch (Exception var1) {
                              }
                           }
                        }
                     }

                     try {
                        Class.forName("com.siemens.mp.io.File");
                        return "siemens";
                     } catch (Exception var9) {
                        try {
                           Class.forName("mmpp.media.MediaPlayer");
                           return "lg";
                        } catch (Exception var8) {
                           try {
                              Class.forName("mmpp.phone.Phone");
                              return "lg";
                           } catch (Exception var7) {
                              try {
                                 Class.forName("mmpp.lang.MathFP");
                                 return "lg";
                              } catch (Exception var6) {
                                 try {
                                    Class.forName("mmpp.media.BackLight");
                                    return "lg";
                                 } catch (Exception var5) {
                                    String var15;
                                    if ((var15 = System.getProperty("microedition.platform")) != null && var15.equals("j2me")) {
                                       var15 = null;
                                    }

                                    return var15;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public static String c() {
      String var0;
      if ((var0 = System.getProperty("microedition.platform")) != null && var0.equals("j2me")) {
         var0 = null;
      }

      String var1 = System.getProperty("device.model");
      String var2;
      return var2 = var0 == null ? var1 : var0;
   }
}
