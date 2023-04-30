public final class kc {
   final int[] an;

   kc() {
      this.an = new int[4096];
   }

   public static String af_renamed(CharSequence[] var0, int var1, int var2) {
      if (0 == var2) {
         return "";
      } else if (1 == var2) {
         CharSequence var12 = var0[var1];
         return null == var12 ? "null" : var12.toString();
      } else {
         int var4 = var1 + var2;
         int var5 = 0;

         for(int var6 = var1; var6 < var4; ++var6) {
            CharSequence var7 = var0[var6];
            if (null == var7) {
               var5 += 4;
            } else {
               var5 += var7.length();
            }
         }

         StringBuilder var13 = new StringBuilder(var5);

         for(int var14 = var1; var14 < var4; ++var14) {
            CharSequence var8 = var0[var14];
            if (null == var8) {
               var13.append("null");
            } else {
               var13.append(var8);
            }
         }

         return var13.toString();
      }
   }

   kc(int[] var1) {
      this.an = var1;
   }

   final int af(int var1, int var2) {
      return this.an[64 * var2 + var1];
   }

   public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
      int var6 = var2 - var1;

      for(int var7 = 0; var7 < var6; ++var7) {
         char var8 = var0.charAt(var7 + var1);
         if ((var8 <= 0 || var8 >= 128) && (var8 < 160 || var8 > 255)) {
            if (var8 == 8364) {
               var3[var7 + var4] = -128;
            } else if (var8 == 8218) {
               var3[var4 + var7] = -126;
            } else if (402 == var8) {
               var3[var7 + var4] = -125;
            } else if (var8 == 8222) {
               var3[var4 + var7] = -124;
            } else if (var8 == 8230) {
               var3[var7 + var4] = -123;
            } else if (8224 == var8) {
               var3[var7 + var4] = -122;
            } else if (var8 == 8225) {
               var3[var7 + var4] = -121;
            } else if (710 == var8) {
               var3[var4 + var7] = -120;
            } else if (8240 == var8) {
               var3[var7 + var4] = -119;
            } else if (352 == var8) {
               var3[var7 + var4] = -118;
            } else if (8249 == var8) {
               var3[var7 + var4] = -117;
            } else if (338 == var8) {
               var3[var4 + var7] = -116;
            } else if (381 == var8) {
               var3[var4 + var7] = -114;
            } else if (var8 == 8216) {
               var3[var4 + var7] = -111;
            } else if (8217 == var8) {
               var3[var7 + var4] = -110;
            } else if (8220 == var8) {
               var3[var7 + var4] = -109;
            } else if (var8 == 8221) {
               var3[var7 + var4] = -108;
            } else if (8226 == var8) {
               var3[var4 + var7] = -107;
            } else if (var8 == 8211) {
               var3[var7 + var4] = -106;
            } else if (8212 == var8) {
               var3[var7 + var4] = -105;
            } else if (732 == var8) {
               var3[var7 + var4] = -104;
            } else if (var8 == 8482) {
               var3[var7 + var4] = -103;
            } else if (var8 == 353) {
               var3[var7 + var4] = -102;
            } else if (var8 == 8250) {
               var3[var4 + var7] = -101;
            } else if (var8 == 339) {
               var3[var4 + var7] = -100;
            } else if (382 == var8) {
               var3[var7 + var4] = -98;
            } else if (var8 == 376) {
               var3[var7 + var4] = -97;
            } else {
               var3[var4 + var7] = 63;
            }
         } else {
            var3[var7 + var4] = (byte)var8;
         }
      }

      return var6;
   }
}
