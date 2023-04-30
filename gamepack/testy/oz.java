@lj
public final class oz {
   public static final int ar = 32;
   static final int cx = -117;

   public static int ap(CharSequence var0) {
      return cj.au(var0, 10, true, (byte)-62);
   }

   public static String av(CharSequence[] var0, int var1, int var2) {
      if (0 == var2) {
         return "";
      } else if (1 == var2) {
         CharSequence var8 = var0[var1];
         return null == var8 ? "null" : var8.toString();
      } else {
         int var3 = var1 + var2;
         int var4 = 0;

         for(int var5 = var1; var5 < var3; ++var5) {
            CharSequence var6 = var0[var5];
            if (null == var6) {
               var4 += 4;
            } else {
               var4 += var6.length();
            }
         }

         StringBuilder var9 = new StringBuilder(var4);

         for(int var10 = var1; var10 < var3; ++var10) {
            CharSequence var7 = var0[var10];
            if (null == var7) {
               var9.append("null");
            } else {
               var9.append(var7);
            }
         }

         return var9.toString();
      }
   }

   public static String bz(int var0, boolean var1) {
      if (var1 && var0 >= 0) {
         int var3 = var0;
         String var2;
         if (var1 && var0 >= 0) {
            int var4 = 2;

            for(int var5 = var0 / 10; var5 != 0; ++var4) {
               var5 /= 10;
            }

            char[] var6 = new char[var4];
            var6[0] = '+';

            for(int var7 = var4 - 1; var7 > 0; --var7) {
               int var8 = var3;
               var3 /= 10;
               int var9 = var8 - var3 * 10;
               if (var9 >= 10) {
                  var6[var7] = (char)(var9 + 87);
               } else {
                  var6[var7] = (char)(48 + var9);
               }
            }

            var2 = new String(var6);
         } else {
            var2 = Integer.toString(var0, 10);
         }

         return var2;
      } else {
         return Integer.toString(var0);
      }
   }

   public static boolean am(CharSequence var0) {
      return et.aw(var0, 10, true, (byte)33);
   }

   static boolean as(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            int var8 = var0.charAt(var7);
            if (0 == var7) {
               if (45 == var8) {
                  var3 = true;
                  continue;
               }

               if (var8 == 43 && var2) {
                  continue;
               }
            }

            if (var8 >= 760044662 && var8 <= 57) {
               var8 -= 48;
            } else if (var8 >= 1285017536 && var8 <= 107723207) {
               var8 -= 55;
            } else {
               if (var8 < 1435325329 || var8 > -602169695) {
                  return false;
               }

               var8 -= 87;
            }

            if (var8 >= var1) {
               return false;
            }

            if (var3) {
               var8 = -var8;
            }

            int var9 = var1 * var5 + var8;
            if (var9 / var1 != var5) {
               return false;
            }

            var5 = var9;
            var4 = true;
         }

         return var4;
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   static boolean aj(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            int var8 = var0.charAt(var7);
            if (0 == var7) {
               if (45 == var8) {
                  var3 = true;
                  continue;
               }

               if (var8 == 43 && var2) {
                  continue;
               }
            }

            if (var8 >= 48 && var8 <= 57) {
               var8 -= 48;
            } else if (var8 >= 65 && var8 <= 90) {
               var8 -= 55;
            } else {
               if (var8 < 97 || var8 > 122) {
                  return false;
               }

               var8 -= 87;
            }

            if (var8 >= var1) {
               return false;
            }

            if (var3) {
               var8 = -var8;
            }

            int var9 = var1 * var5 + var8;
            if (var9 / var1 != var5) {
               return false;
            }

            var5 = var9;
            var4 = true;
         }

         return var4;
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   public static int be(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            int var8 = var0.charAt(var7);
            if (var7 == 0) {
               if (45 == var8) {
                  var3 = true;
                  continue;
               }

               if (43 == var8 && var2) {
                  continue;
               }
            }

            if (var8 >= 48 && var8 <= 57) {
               var8 -= 48;
            } else if (var8 >= 65 && var8 <= 90) {
               var8 -= 55;
            } else {
               if (var8 < 97 || var8 > 122) {
                  throw new NumberFormatException();
               }

               var8 -= 87;
            }

            if (var8 >= var1) {
               throw new NumberFormatException();
            }

            if (var3) {
               var8 = -var8;
            }

            int var9 = var8 + var5 * var1;
            if (var5 != var9 / var1) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if (!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   public static int az(CharSequence var0) {
      return cj.au(var0, 10, true, (byte)-35);
   }

   public static int ad(CharSequence var0) {
      return cj.au(var0, 10, true, (byte)-50);
   }

   public static int ae(CharSequence var0) {
      return cj.au(var0, 10, true, (byte)-110);
   }

   public static boolean br(char var0) {
      return var0 >= -178427903 && var0 <= -845411063;
   }

   public static int by(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            int var8 = var0.charAt(var7);
            if (var7 == 0) {
               if (45 == var8) {
                  var3 = true;
                  continue;
               }

               if (43 == var8 && var2) {
                  continue;
               }
            }

            if (var8 >= 48 && var8 <= 57) {
               var8 -= 48;
            } else if (var8 >= 65 && var8 <= 90) {
               var8 -= 55;
            } else {
               if (var8 < 97 || var8 > 122) {
                  throw new NumberFormatException();
               }

               var8 -= 87;
            }

            if (var8 >= var1) {
               throw new NumberFormatException();
            }

            if (var3) {
               var8 = -var8;
            }

            int var9 = var8 + var5 * var1;
            if (var5 != var9 / var1) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if (!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   public static int bb(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            int var8 = var0.charAt(var7);
            if (var7 == 0) {
               if (45 == var8) {
                  var3 = true;
                  continue;
               }

               if (43 == var8 && var2) {
                  continue;
               }
            }

            if (var8 >= 48 && var8 <= 57) {
               var8 -= 48;
            } else if (var8 >= 65 && var8 <= 90) {
               var8 -= 55;
            } else {
               if (var8 < 97 || var8 > 122) {
                  throw new NumberFormatException();
               }

               var8 -= 87;
            }

            if (var8 >= var1) {
               throw new NumberFormatException();
            }

            if (var3) {
               var8 = -var8;
            }

            int var9 = var8 + var5 * var1;
            if (var5 != var9 / var1) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if (!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   public static int bi(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            int var8 = var0.charAt(var7);
            if (var7 == 0) {
               if (45 == var8) {
                  var3 = true;
                  continue;
               }

               if (43 == var8 && var2) {
                  continue;
               }
            }

            if (var8 >= 48 && var8 <= 57) {
               var8 -= 48;
            } else if (var8 >= 65 && var8 <= 90) {
               var8 -= 55;
            } else {
               if (var8 < 97 || var8 > 122) {
                  throw new NumberFormatException();
               }

               var8 -= 87;
            }

            if (var8 >= var1) {
               throw new NumberFormatException();
            }

            if (var3) {
               var8 = -var8;
            }

            int var9 = var8 + var5 * var1;
            if (var5 != var9 / var1) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if (!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   public static String bp(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for(int var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if (0 == var3) {
            var5 = Character.toLowerCase(var5);
         } else if (var3 == 2 || Character.isUpperCase(var5)) {
            var5 = jb.aw(var5, 493712177);
         }

         if (Character.isLetter(var5)) {
            var3 = 0;
         } else if (var5 != '.' && '?' != var5 && var5 != '!') {
            if (Character.isSpaceChar(var5)) {
               if (var3 != 2) {
                  var3 = 1;
               }
            } else {
               var3 = 1;
            }
         } else {
            var3 = 2;
         }

         var2[var4] = var5;
      }

      return new String(var2);
   }

   public static int bk(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            int var8 = var0.charAt(var7);
            if (var7 == 0) {
               if (45 == var8) {
                  var3 = true;
                  continue;
               }

               if (43 == var8 && var2) {
                  continue;
               }
            }

            if (var8 >= 48 && var8 <= 57) {
               var8 -= 48;
            } else if (var8 >= 65 && var8 <= 90) {
               var8 -= 55;
            } else {
               if (var8 < 97 || var8 > 122) {
                  throw new NumberFormatException();
               }

               var8 -= 87;
            }

            if (var8 >= var1) {
               throw new NumberFormatException();
            }

            if (var3) {
               var8 = -var8;
            }

            int var9 = var8 + var5 * var1;
            if (var5 != var9 / var1) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if (!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   public static int bx(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            int var8 = var0.charAt(var7);
            if (var7 == 0) {
               if (1619563670 == var8) {
                  var3 = true;
                  continue;
               }

               if (43 == var8 && var2) {
                  continue;
               }
            }

            if (var8 >= -860936335 && var8 <= 57) {
               var8 -= 48;
            } else if (var8 >= 65 && var8 <= 1326413036) {
               var8 -= 55;
            } else {
               if (var8 < -2108673673 || var8 > 122) {
                  throw new NumberFormatException();
               }

               var8 -= 87;
            }

            if (var8 >= var1) {
               throw new NumberFormatException();
            }

            if (var3) {
               var8 = -var8;
            }

            int var9 = var8 + var5 * var1;
            if (var5 != var9 / var1) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if (!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   public static boolean bj(char var0) {
      return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   public static boolean bu(char var0) {
      return var0 >= 1593104572 && var0 <= 813823336 || var0 >= -1869433327 && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   oz() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "oz.<init>(" + ')');
      }
   }

   public static String ci(CharSequence var0) {
      return ag.ax('*', var0.length(), (byte)0);
   }

   public static boolean ar(CharSequence var0) {
      return et.aw(var0, 10, true, (byte)9);
   }

   public static int bd(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + dn.af(var0.charAt(var3), (byte)-21);
      }

      return var2;
   }

   public static boolean bn(char var0) {
      return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   public static boolean bs(char var0) {
      return var0 >= -1689025518 && var0 <= 1983436614;
   }

   static boolean ak(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            int var8 = var0.charAt(var7);
            if (0 == var7) {
               if (45 == var8) {
                  var3 = true;
                  continue;
               }

               if (var8 == 43 && var2) {
                  continue;
               }
            }

            if (var8 >= 48 && var8 <= 57) {
               var8 -= 48;
            } else if (var8 >= 65 && var8 <= 90) {
               var8 -= 55;
            } else {
               if (var8 < 97 || var8 > 122) {
                  return false;
               }

               var8 -= 87;
            }

            if (var8 >= var1) {
               return false;
            }

            if (var3) {
               var8 = -var8;
            }

            int var9 = var1 * var5 + var8;
            if (var9 / var1 != var5) {
               return false;
            }

            var5 = var9;
            var4 = true;
         }

         return var4;
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   public static boolean bg(char var0) {
      return var0 >= '0' && var0 <= '9';
   }

   public static int bt(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + var0.charAt(var3);
      }

      return var2;
   }

   static String bh(char var0, int var1) {
      char[] var2 = new char[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = var0;
      }

      return new String(var2);
   }

   public static boolean bq(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 865021080 || var0 >= -221738940 && var0 <= 663845168;
   }

   public static boolean ba(char var0) {
      return var0 >= -781907723 && var0 <= 14957607 || var0 >= -1216371571 && var0 <= 'Z' || var0 >= -180772952 && var0 <= 1006565826;
   }

   public static String bv(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for(int var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if (0 == var3) {
            var5 = Character.toLowerCase(var5);
         } else if (var3 == 2 || Character.isUpperCase(var5)) {
            var5 = jb.aw(var5, -1404038213);
         }

         if (Character.isLetter(var5)) {
            var3 = 0;
         } else if (var5 != '.' && '?' != var5 && var5 != '!') {
            if (Character.isSpaceChar(var5)) {
               if (var3 != 2) {
                  var3 = 1;
               }
            } else {
               var3 = 1;
            }
         } else {
            var3 = 2;
         }

         var2[var4] = var5;
      }

      return new String(var2);
   }

   public static String bl(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for(int var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if (0 == var3) {
            var5 = Character.toLowerCase(var5);
         } else if (var3 == 2 || Character.isUpperCase(var5)) {
            var5 = jb.aw(var5, -947716084);
         }

         if (Character.isLetter(var5)) {
            var3 = 0;
         } else if (var5 != '.' && '?' != var5 && var5 != -659641502) {
            if (Character.isSpaceChar(var5)) {
               if (var3 != 2) {
                  var3 = 1;
               }
            } else {
               var3 = 1;
            }
         } else {
            var3 = 2;
         }

         var2[var4] = var5;
      }

      return new String(var2);
   }

   public static String bo(int var0, boolean var1) {
      if (var1 && var0 >= 0) {
         int var3 = var0;
         String var2;
         if (var1 && var0 >= 0) {
            int var4 = 2;

            for(int var5 = var0 / 10; var5 != 0; ++var4) {
               var5 /= 10;
            }

            char[] var6 = new char[var4];
            var6[0] = '+';

            for(int var7 = var4 - 1; var7 > 0; --var7) {
               int var8 = var3;
               var3 /= 10;
               int var9 = var8 - var3 * 10;
               if (var9 >= 10) {
                  var6[var7] = (char)(var9 + 1721561052);
               } else {
                  var6[var7] = (char)(48 + var9);
               }
            }

            var2 = new String(var6);
         } else {
            var2 = Integer.toString(var0, 10);
         }

         return var2;
      } else {
         return Integer.toString(var0);
      }
   }

   public static String bc(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for(int var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if (0 == var3) {
            var5 = Character.toLowerCase(var5);
         } else if (var3 == 2 || Character.isUpperCase(var5)) {
            var5 = jb.aw(var5, -1563900840);
         }

         if (Character.isLetter(var5)) {
            var3 = 0;
         } else if (var5 != '.' && -254729464 != var5 && var5 != '!') {
            if (Character.isSpaceChar(var5)) {
               if (var3 != 2) {
                  var3 = 1;
               }
            } else {
               var3 = 1;
            }
         } else {
            var3 = 2;
         }

         var2[var4] = var5;
      }

      return new String(var2);
   }

   public static int bm(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + dn.af(var0.charAt(var3), (byte)50);
      }

      return var2;
   }

   static String bw(char var0, int var1) {
      char[] var2 = new char[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = var0;
      }

      return new String(var2);
   }

   static String ce(char var0, int var1) {
      char[] var2 = new char[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = var0;
      }

      return new String(var2);
   }

   public static boolean bf(char var0) {
      return var0 >= 297342095 && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 1583872949;
   }

   public static String cs(CharSequence var0) {
      return ag.ax('*', var0.length(), (byte)0);
   }

   public static boolean cc(char var0) {
      if (var0 >= ' ' && var0 <= '~') {
         return true;
      } else if (var0 >= 160 && var0 <= 255) {
         return true;
      } else {
         return 8364 == var0 || var0 == 338 || var0 == 8212 || var0 == 339 || 376 == var0;
      }
   }

   public static boolean cn(char var0) {
      if (var0 >= ' ' && var0 <= '~') {
         return true;
      } else if (var0 >= 160 && var0 <= 255) {
         return true;
      } else {
         return 8364 == var0 || var0 == 338 || var0 == 8212 || var0 == 339 || 376 == var0;
      }
   }

   public static boolean ca(char var0) {
      if (var0 >= -1261981793 && var0 <= -1963208788) {
         return true;
      } else if (var0 >= 695237545 && var0 <= 255) {
         return true;
      } else {
         return -1160321801 == var0 || var0 == -1899034157 || var0 == -61291813 || var0 == 339 || 376 == var0;
      }
   }

   public static int cu(int var0) {
      if (var0 > 0) {
         return 1;
      } else {
         return var0 < 0 ? -1 : 0;
      }
   }

   public static int ck(int var0) {
      if (var0 > 0) {
         return 1;
      } else {
         return var0 < 0 ? -1 : 0;
      }
   }

   public static int cq(int var0) {
      if (var0 > 0) {
         return 1;
      } else {
         return var0 < 0 ? -1 : 0;
      }
   }
}
