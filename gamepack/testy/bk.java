import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class bk {
   static final String aw = "_";
   public static final int ay = 9;
   static final int cl = 20;
   static final int af = 9;
   static final int ao = 7;

   public static final tq an(byte[] var0) {
      BufferedImage var1 = null;

      try {
         Class var2 = ImageIO.class;
         synchronized(ImageIO.class) {
            var1 = ImageIO.read(new ByteArrayInputStream(var0));
         }

         int var9 = var1.getWidth();
         int var3 = var1.getHeight();
         int[] var4 = new int[var9 * var3];
         PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var9, var3, var4, 0, var9);
         var5.grabPixels();
         return new tq(var4, var9, var3);
      } catch (IOException var7) {
      } catch (InterruptedException var8) {
      }

      return new tq(0, 0);
   }

   static {
      ImageIO.setUseCache(false);
   }

   public static long ac(int var0, int var1) {
      try {
         return ix.ag[var0];
      } catch (RuntimeException var2) {
         throw db.an(var2, "bk.ac(" + ')');
      }
   }

   public static final tq aw(byte[] var0) {
      BufferedImage var1 = null;

      try {
         Class var2 = ImageIO.class;
         synchronized(ImageIO.class) {
            var1 = ImageIO.read(new ByteArrayInputStream(var0));
         }

         int var9 = var1.getWidth();
         int var3 = var1.getHeight();
         int[] var4 = new int[var9 * var3];
         PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var9, var3, var4, 0, var9);
         var5.grabPixels();
         return new tq(var4, var9, var3);
      } catch (IOException var7) {
      } catch (InterruptedException var8) {
      }

      return new tq(0, 0);
   }

   static final void kt(sq var0, int var1) {
      try {
         var0.al((byte)-29);
         int var2 = var0.at(8, -1490965572);
         int var3;
         if (var2 < client.iw * 265474485) {
            if (var1 != 900654741) {
               throw new IllegalStateException();
            }

            for(var3 = var2; var3 < 265474485 * client.iw; ++var3) {
               if (var1 != 900654741) {
                  throw new IllegalStateException();
               }

               client.nz[(client.mb += -1359666311) * 216061641 - 1] = client.iy[var3];
            }
         }

         if (var2 > client.iw * 265474485) {
            if (var1 == 900654741) {
               throw new RuntimeException("");
            }
         } else {
            client.iw = 0;

            for(var3 = 0; var3 < var2; ++var3) {
               if (var1 != 900654741) {
                  throw new IllegalStateException();
               }

               int var4 = client.iy[var3];
               df var5 = client.iu[var4];
               int var6 = var0.at(1, -1544607869);
               if (var6 == 0) {
                  if (var1 != 900654741) {
                     throw new IllegalStateException();
                  }

                  client.iy[(client.iw += 1796101277) * 265474485 - 1] = var4;
                  var5.dg = -1014023335 * client.ep;
               } else {
                  int var7 = var0.at(2, -944837087);
                  if (0 == var7) {
                     if (var1 != 900654741) {
                        return;
                     }

                     client.iy[(client.iw += 1796101277) * 265474485 - 1] = var4;
                     var5.dg = client.ep * -1014023335;
                     client.ih[(client.ig += 1487412345) * 606834121 - 1] = var4;
                  } else {
                     int var8;
                     int var9;
                     if (var7 == 1) {
                        if (var1 != 900654741) {
                           throw new IllegalStateException();
                        }

                        client.iy[(client.iw += 1796101277) * 265474485 - 1] = var4;
                        var5.dg = client.ep * -1014023335;
                        var8 = var0.at(3, -1551952341);
                        var5.aa(var8, iu.aw, (byte)110);
                        var9 = var0.at(1, -1834997927);
                        if (1 == var9) {
                           if (var1 != 900654741) {
                              throw new IllegalStateException();
                           }

                           client.ih[(client.ig += 1487412345) * 606834121 - 1] = var4;
                        }
                     } else if (var7 == 2) {
                        if (var1 != 900654741) {
                           throw new IllegalStateException();
                        }

                        client.iy[(client.iw += 1796101277) * 265474485 - 1] = var4;
                        var5.dg = -1014023335 * client.ep;
                        if (var0.at(1, -1318741814) == 1) {
                           if (var1 != 900654741) {
                              return;
                           }

                           var8 = var0.at(3, -1702575344);
                           var5.aa(var8, iu.ac, (byte)125);
                           var9 = var0.at(3, -411910904);
                           var5.aa(var9, iu.ac, (byte)126);
                        } else {
                           var8 = var0.at(3, -1825320482);
                           var5.aa(var8, iu.an, (byte)124);
                        }

                        var8 = var0.at(1, -1696706191);
                        if (var8 == 1) {
                           if (var1 != 900654741) {
                              throw new IllegalStateException();
                           }

                           client.ih[(client.ig += 1487412345) * 606834121 - 1] = var4;
                        }
                     } else if (var7 == 3) {
                        if (var1 != 900654741) {
                           throw new IllegalStateException();
                        }

                        client.nz[(client.mb += -1359666311) * 216061641 - 1] = var4;
                     }
                  }
               }
            }

         }
      } catch (RuntimeException var10) {
         throw db.an(var10, "bk.kt(" + ')');
      }
   }

   bk() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "bk.<init>(" + ')');
      }
   }

   public static String aw(CharSequence var0, sw var1, byte var2) {
      try {
         if (null == var0) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int var3 = 0;

            int var4;
            for(var4 = var0.length(); var3 < var4 && dl.an(var0.charAt(var3), 1929251930); ++var3) {
               if (var2 >= 1) {
                  throw new IllegalStateException();
               }
            }

            while(var4 > var3) {
               if (var2 >= 1) {
                  throw new IllegalStateException();
               }

               if (!dl.an(var0.charAt(var4 - 1), 2100090869)) {
                  break;
               }

               --var4;
            }

            int var5 = var4 - var3;
            if (var5 >= 1) {
               if (var2 >= 1) {
                  throw new IllegalStateException();
               }

               if (var5 <= kn.af(var1, -740837934)) {
                  StringBuilder var6 = new StringBuilder(var5);

                  for(int var7 = var3; var7 < var4; ++var7) {
                     char var8 = var0.charAt(var7);
                     boolean var9;
                     if (Character.isISOControl(var8)) {
                        if (var2 >= 1) {
                           throw new IllegalStateException();
                        }

                        var9 = false;
                     } else if (cb.ay(var8, -2123095492)) {
                        if (var2 >= 1) {
                           throw new IllegalStateException();
                        }

                        var9 = true;
                     } else {
                        label188: {
                           char[] var10 = sd.aw;

                           int var11;
                           char var12;
                           for(var11 = 0; var11 < var10.length; ++var11) {
                              if (var2 >= 1) {
                                 throw new IllegalStateException();
                              }

                              var12 = var10[var11];
                              if (var12 == var8) {
                                 if (var2 >= 1) {
                                    throw new IllegalStateException();
                                 }

                                 var9 = true;
                                 break label188;
                              }
                           }

                           var10 = sd.ac;

                           for(var11 = 0; var11 < var10.length; ++var11) {
                              if (var2 >= 1) {
                                 throw new IllegalStateException();
                              }

                              var12 = var10[var11];
                              if (var12 == var8) {
                                 if (var2 >= 1) {
                                    throw new IllegalStateException();
                                 }

                                 var9 = true;
                                 break label188;
                              }
                           }

                           var9 = false;
                        }
                     }

                     if (!var9) {
                        if (var2 >= 1) {
                           throw new IllegalStateException();
                        }
                     } else {
                        char var14;
                        switch (var8) {
                           case ' ':
                           case '-':
                           case '_':
                           case ' ':
                              var14 = '_';
                              break;
                           case '#':
                           case '[':
                           case ']':
                              var14 = var8;
                              break;
                           case 'À':
                           case 'Á':
                           case 'Â':
                           case 'Ã':
                           case 'Ä':
                           case 'à':
                           case 'á':
                           case 'â':
                           case 'ã':
                           case 'ä':
                              var14 = 'a';
                              break;
                           case 'Ç':
                           case 'ç':
                              var14 = 'c';
                              break;
                           case 'È':
                           case 'É':
                           case 'Ê':
                           case 'Ë':
                           case 'è':
                           case 'é':
                           case 'ê':
                           case 'ë':
                              var14 = 'e';
                              break;
                           case 'Í':
                           case 'Î':
                           case 'Ï':
                           case 'í':
                           case 'î':
                           case 'ï':
                              var14 = 'i';
                              break;
                           case 'Ñ':
                           case 'ñ':
                              var14 = 'n';
                              break;
                           case 'Ò':
                           case 'Ó':
                           case 'Ô':
                           case 'Õ':
                           case 'Ö':
                           case 'ò':
                           case 'ó':
                           case 'ô':
                           case 'õ':
                           case 'ö':
                              var14 = 'o';
                              break;
                           case 'Ù':
                           case 'Ú':
                           case 'Û':
                           case 'Ü':
                           case 'ù':
                           case 'ú':
                           case 'û':
                           case 'ü':
                              var14 = 'u';
                              break;
                           case 'ß':
                              var14 = 'b';
                              break;
                           case 'ÿ':
                           case 'Ÿ':
                              var14 = 'y';
                              break;
                           default:
                              var14 = Character.toLowerCase(var8);
                        }

                        if (var14 != 0) {
                           var6.append(var14);
                        }
                     }
                  }

                  if (var6.length() == 0) {
                     if (var2 >= 1) {
                        throw new IllegalStateException();
                     }

                     return null;
                  }

                  return var6.toString();
               }

               if (var2 >= 1) {
                  throw new IllegalStateException();
               }
            }

            return null;
         }
      } catch (RuntimeException var13) {
         throw db.an(var13, "bk.aw(" + ')');
      }
   }
}
