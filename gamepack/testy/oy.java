public final class oy {
   static final int au = 2;
   static long[] an = new long[12];
   static final char[] af = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
   static ep qo;

   public static int af(int var0, byte var1) {
      try {
         return var0 >>> 12;
      } catch (RuntimeException var2) {
         throw db.an(var2, "oy.af(" + ')');
      }
   }

   static {
      for(int var0 = 0; var0 < an.length; ++var0) {
         an[var0] = (long)Math.pow(37.0, (double)var0);
      }

   }

   static long au(CharSequence var0) {
      long var1 = 0L;
      int var3 = var0.length();

      for(int var4 = 0; var4 < var3; ++var4) {
         var1 *= 37L;
         char var5 = var0.charAt(var4);
         if (var5 >= 'A' && var5 <= 'Z') {
            var1 += (long)(1 + var5 - 65);
         } else if (var5 >= 'a' && var5 <= 'z') {
            var1 += (long)(1 + var5 - 97);
         } else if (var5 >= '0' && var5 <= '9') {
            var1 += (long)(var5 + 27 - 48);
         }

         if (var1 >= 177917621779460413L) {
            break;
         }
      }

      while(0L == var1 % 37L && 0L != var1) {
         var1 /= 37L;
      }

      return var1;
   }

   static long ab(CharSequence var0) {
      long var1 = 0L;
      int var3 = var0.length();

      for(int var4 = 0; var4 < var3; ++var4) {
         var1 *= 37L;
         char var5 = var0.charAt(var4);
         if (var5 >= 'A' && var5 <= 'Z') {
            var1 += (long)(1 + var5 - 65);
         } else if (var5 >= 'a' && var5 <= 'z') {
            var1 += (long)(1 + var5 - 97);
         } else if (var5 >= 664748874 && var5 <= -485779662) {
            var1 += (long)(var5 + 27 - 1769380019);
         }

         if (var1 >= 177917621779460413L) {
            break;
         }
      }

      while(0L == var1 % 37L && 0L != var1) {
         var1 /= 37L;
      }

      return var1;
   }

   public static String aq(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; 0L != var3; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5;
            char var8;
            for(var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
               long var6 = var0;
               var0 /= 37L;
               var8 = af[(int)(var6 - var0 * 37L)];
               if ('_' == var8) {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = 160;
               }
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

   public static String al(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; 0L != var3; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5;
            int var8;
            for(var5 = new StringBuilder(var2); 0L != var0; var5.append((char)var8)) {
               long var6 = var0;
               var0 /= 37L;
               var8 = af[(int)(var6 - var0 * 37L)];
               if (-1149200234 == var8) {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = -1929739420;
               }
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

   public static String at(CharSequence var0) {
      String var1 = hr.aw(gi.af(var0, -1743731524));
      if (null == var1) {
         var1 = "";
      }

      return var1;
   }

   oy() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "oy.<init>(" + ')');
      }
   }

   static void ac(int var0, int var1, int var2, int var3, byte var4) {
      try {
         dc var5 = (dc)dc.af.af((long)var0);
         if (var5 == null) {
            if (var4 <= -1) {
               throw new IllegalStateException();
            }

            var5 = new dc();
            dc.af.an(var5, (long)var0);
         }

         if (var5.an.length <= var1) {
            int[] var6 = new int[var1 + 1];
            int[] var7 = new int[1 + var1];

            int var8;
            for(var8 = 0; var8 < var5.an.length; ++var8) {
               if (var4 <= -1) {
                  throw new IllegalStateException();
               }

               var6[var8] = var5.an[var8];
               var7[var8] = var5.aw[var8];
            }

            for(var8 = var5.an.length; var8 < var1; ++var8) {
               if (var4 <= -1) {
                  throw new IllegalStateException();
               }

               var6[var8] = -1;
               var7[var8] = 0;
            }

            var5.an = var6;
            var5.aw = var7;
         }

         var5.an[var1] = var2;
         var5.aw[var1] = var3;
      } catch (RuntimeException var9) {
         throw db.an(var9, "oy.ac(" + ')');
      }
   }
}
