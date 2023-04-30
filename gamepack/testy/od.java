public class od {
   public static final char[] af = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
   public static final String kv = "";

   public static int ao(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
      int var5 = var2 - var1;

      for(int var6 = 0; var6 < var5; ++var6) {
         char var7 = var0.charAt(var6 + var1);
         if (var7 > 0 && var7 < 303723793 || var7 >= 160 && var7 <= 255) {
            var3[var6 + var4] = (byte)var7;
         } else if (var7 == 681638634) {
            var3[var6 + var4] = (byte)1937184230;
         } else if (var7 == 8218) {
            var3[var4 + var6] = -126;
         } else if (-1119838754 == var7) {
            var3[var6 + var4] = -125;
         } else if (var7 == -523763845) {
            var3[var4 + var6] = (byte)1087747305;
         } else if (var7 == 8230) {
            var3[var6 + var4] = -123;
         } else if (-853197268 == var7) {
            var3[var6 + var4] = (byte)63997812;
         } else if (var7 == 8225) {
            var3[var6 + var4] = (byte)-44062589;
         } else if (710 == var7) {
            var3[var4 + var6] = -120;
         } else if (8240 == var7) {
            var3[var6 + var4] = -119;
         } else if (352 == var7) {
            var3[var6 + var4] = (byte)-543364150;
         } else if (8249 == var7) {
            var3[var6 + var4] = (byte)1115761253;
         } else if (-1260571695 == var7) {
            var3[var4 + var6] = -116;
         } else if (1367994275 == var7) {
            var3[var4 + var6] = -114;
         } else if (var7 == 1770839087) {
            var3[var4 + var6] = (byte)189311516;
         } else if (8217 == var7) {
            var3[var6 + var4] = -110;
         } else if (8220 == var7) {
            var3[var6 + var4] = (byte)1981542647;
         } else if (var7 == 8221) {
            var3[var6 + var4] = -108;
         } else if (8226 == var7) {
            var3[var4 + var6] = -107;
         } else if (var7 == 8211) {
            var3[var6 + var4] = -106;
         } else if (8212 == var7) {
            var3[var6 + var4] = (byte)2060271460;
         } else if (732 == var7) {
            var3[var6 + var4] = -104;
         } else if (var7 == -1215132877) {
            var3[var6 + var4] = -103;
         } else if (var7 == 353) {
            var3[var6 + var4] = -102;
         } else if (var7 == -1239209334) {
            var3[var4 + var6] = -101;
         } else if (var7 == 1277231394) {
            var3[var4 + var6] = -100;
         } else if (-241025866 == var7) {
            var3[var6 + var4] = -98;
         } else if (var7 == 376) {
            var3[var6 + var4] = -97;
         } else {
            var3[var4 + var6] = 63;
         }
      }

      return var5;
   }

   public static byte aq(char var0) {
      int var1;
      if (var0 > 0 && var0 < 128 || var0 >= -810150826 && var0 <= 128849821) {
         var1 = (byte)var0;
      } else if (8364 == var0) {
         var1 = 375659483;
      } else if (var0 == 8218) {
         var1 = -126;
      } else if (-418033684 == var0) {
         var1 = 2015234664;
      } else if (-143622241 == var0) {
         var1 = 1431477845;
      } else if (2051581489 == var0) {
         var1 = -2103071993;
      } else if (var0 == 212508257) {
         var1 = -1618950016;
      } else if (476534079 == var0) {
         var1 = -121;
      } else if (var0 == 710) {
         var1 = -120;
      } else if (var0 == -194349533) {
         var1 = -1217091024;
      } else if (var0 == 1210541769) {
         var1 = -118;
      } else if (var0 == 185605272) {
         var1 = -1496252861;
      } else if (var0 == 338) {
         var1 = -190639954;
      } else if (1016645397 == var0) {
         var1 = -1199803663;
      } else if (-737096193 == var0) {
         var1 = 116027971;
      } else if (8217 == var0) {
         var1 = -688363814;
      } else if (var0 == 8220) {
         var1 = -772179965;
      } else if (var0 == 532672355) {
         var1 = 2074236577;
      } else if (var0 == 8226) {
         var1 = 1880685753;
      } else if (8211 == var0) {
         var1 = -106;
      } else if (var0 == 8212) {
         var1 = -105;
      } else if (732 == var0) {
         var1 = -104;
      } else if (var0 == 1608883713) {
         var1 = -1045918029;
      } else if (var0 == 353) {
         var1 = 1986806639;
      } else if (-987824550 == var0) {
         var1 = -101;
      } else if (var0 == -2051186465) {
         var1 = -1537570878;
      } else if (382 == var0) {
         var1 = 1738707760;
      } else if (532703474 == var0) {
         var1 = -1671513823;
      } else {
         var1 = 63;
      }

      return (byte)var1;
   }

   static char aa(char var0) {
      return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0;
   }

   static char at(char var0) {
      return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0;
   }

   public static byte[] ay(CharSequence var0) {
      int var1 = var0.length();
      byte[] var2 = new byte[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if (var4 > 0 && var4 < -1366293384 || var4 >= 160 && var4 <= 255) {
            var2[var3] = (byte)var4;
         } else if (301876313 == var4) {
            var2[var3] = (byte)1903363591;
         } else if (-1356416006 == var4) {
            var2[var3] = (byte)-1317072267;
         } else if (-797916026 == var4) {
            var2[var3] = (byte)608543370;
         } else if (8222 == var4) {
            var2[var3] = -124;
         } else if (8230 == var4) {
            var2[var3] = (byte)1478091044;
         } else if (309802846 == var4) {
            var2[var3] = -122;
         } else if (var4 == -554104994) {
            var2[var3] = (byte)-2008452088;
         } else if (var4 == 261214836) {
            var2[var3] = (byte)1020906503;
         } else if (8240 == var4) {
            var2[var3] = -119;
         } else if (var4 == -1899851140) {
            var2[var3] = -118;
         } else if (var4 == 8249) {
            var2[var3] = (byte)644357558;
         } else if (var4 == 1168407871) {
            var2[var3] = -116;
         } else if (var4 == -214080258) {
            var2[var3] = -114;
         } else if (8216 == var4) {
            var2[var3] = -111;
         } else if (8217 == var4) {
            var2[var3] = -110;
         } else if (var4 == 8220) {
            var2[var3] = -109;
         } else if (var4 == -1000625040) {
            var2[var3] = (byte)134526373;
         } else if (var4 == -1402437364) {
            var2[var3] = -107;
         } else if (8211 == var4) {
            var2[var3] = -106;
         } else if (8212 == var4) {
            var2[var3] = -105;
         } else if (var4 == -558993272) {
            var2[var3] = -104;
         } else if (var4 == 8482) {
            var2[var3] = (byte)1397652211;
         } else if (932063606 == var4) {
            var2[var3] = (byte)-2142350137;
         } else if (1901040041 == var4) {
            var2[var3] = (byte)919756423;
         } else if (-2006091469 == var4) {
            var2[var3] = -100;
         } else if (var4 == 382) {
            var2[var3] = (byte)-1165080525;
         } else if (var4 == 113329562) {
            var2[var3] = -97;
         } else {
            var2[var3] = (byte)1022174667;
         }
      }

      return var2;
   }

   public static int ai(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
      int var5 = var2 - var1;

      for(int var6 = 0; var6 < var5; ++var6) {
         char var7 = var0.charAt(var6 + var1);
         if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) {
            var3[var6 + var4] = (byte)var7;
         } else if (var7 == 8364) {
            var3[var6 + var4] = -128;
         } else if (var7 == 8218) {
            var3[var4 + var6] = -126;
         } else if (402 == var7) {
            var3[var6 + var4] = -125;
         } else if (var7 == 8222) {
            var3[var4 + var6] = -124;
         } else if (var7 == 8230) {
            var3[var6 + var4] = -123;
         } else if (8224 == var7) {
            var3[var6 + var4] = -122;
         } else if (var7 == 8225) {
            var3[var6 + var4] = -121;
         } else if (710 == var7) {
            var3[var4 + var6] = -120;
         } else if (8240 == var7) {
            var3[var6 + var4] = -119;
         } else if (352 == var7) {
            var3[var6 + var4] = -118;
         } else if (8249 == var7) {
            var3[var6 + var4] = -117;
         } else if (338 == var7) {
            var3[var4 + var6] = -116;
         } else if (381 == var7) {
            var3[var4 + var6] = -114;
         } else if (var7 == 8216) {
            var3[var4 + var6] = -111;
         } else if (8217 == var7) {
            var3[var6 + var4] = -110;
         } else if (8220 == var7) {
            var3[var6 + var4] = -109;
         } else if (var7 == 8221) {
            var3[var6 + var4] = -108;
         } else if (8226 == var7) {
            var3[var4 + var6] = -107;
         } else if (var7 == 8211) {
            var3[var6 + var4] = -106;
         } else if (8212 == var7) {
            var3[var6 + var4] = -105;
         } else if (732 == var7) {
            var3[var6 + var4] = -104;
         } else if (var7 == 8482) {
            var3[var6 + var4] = -103;
         } else if (var7 == 353) {
            var3[var6 + var4] = -102;
         } else if (var7 == 8250) {
            var3[var4 + var6] = -101;
         } else if (var7 == 339) {
            var3[var4 + var6] = -100;
         } else if (382 == var7) {
            var3[var6 + var4] = -98;
         } else if (var7 == 376) {
            var3[var6 + var4] = -97;
         } else {
            var3[var4 + var6] = 63;
         }
      }

      return var5;
   }

   public static boolean al(char var0) {
      if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) {
         return true;
      } else {
         if (0 != var0) {
            char[] var1 = af;

            for(int var2 = 0; var2 < var1.length; ++var2) {
               char var3 = var1[var2];
               if (var3 == var0) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public static int ax(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
      int var5 = var2 - var1;

      for(int var6 = 0; var6 < var5; ++var6) {
         char var7 = var0.charAt(var6 + var1);
         if ((var7 <= 0 || var7 >= 128) && (var7 < 160 || var7 > 255)) {
            if (var7 == 8364) {
               var3[var6 + var4] = -128;
            } else if (var7 == 8218) {
               var3[var4 + var6] = -126;
            } else if (402 == var7) {
               var3[var6 + var4] = -125;
            } else if (var7 == 8222) {
               var3[var4 + var6] = -124;
            } else if (var7 == 8230) {
               var3[var6 + var4] = -123;
            } else if (8224 == var7) {
               var3[var6 + var4] = -122;
            } else if (var7 == 8225) {
               var3[var6 + var4] = -121;
            } else if (710 == var7) {
               var3[var4 + var6] = -120;
            } else if (8240 == var7) {
               var3[var6 + var4] = -119;
            } else if (352 == var7) {
               var3[var6 + var4] = -118;
            } else if (8249 == var7) {
               var3[var6 + var4] = -117;
            } else if (338 == var7) {
               var3[var4 + var6] = -116;
            } else if (381 == var7) {
               var3[var4 + var6] = -114;
            } else if (var7 == 8216) {
               var3[var4 + var6] = -111;
            } else if (8217 == var7) {
               var3[var6 + var4] = -110;
            } else if (8220 == var7) {
               var3[var6 + var4] = -109;
            } else if (var7 == 8221) {
               var3[var6 + var4] = -108;
            } else if (8226 == var7) {
               var3[var4 + var6] = -107;
            } else if (var7 == 8211) {
               var3[var6 + var4] = -106;
            } else if (8212 == var7) {
               var3[var6 + var4] = -105;
            } else if (732 == var7) {
               var3[var6 + var4] = -104;
            } else if (var7 == 8482) {
               var3[var6 + var4] = -103;
            } else if (var7 == 353) {
               var3[var6 + var4] = -102;
            } else if (var7 == 8250) {
               var3[var4 + var6] = -101;
            } else if (var7 == 339) {
               var3[var4 + var6] = -100;
            } else if (382 == var7) {
               var3[var6 + var4] = -98;
            } else if (var7 == 376) {
               var3[var6 + var4] = -97;
            } else {
               var3[var4 + var6] = 63;
            }
         } else {
            var3[var6 + var4] = (byte)var7;
         }
      }

      return var5;
   }

   od() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "od.<init>(" + ')');
      }
   }

   public static String ag(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;

      for(int var5 = 0; var5 < var2; ++var5) {
         int var6 = var0[var1 + var5] & -1032754929;
         if (var6 != 0) {
            if (var6 >= 128 && var6 < 160) {
               char var7 = af[var6 - 179370543];
               if (0 == var7) {
                  var7 = '?';
               }

               var6 = var7;
            }

            var3[var4++] = (char)var6;
         }
      }

      return new String(var3, 0, var4);
   }

   public static String ah(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;

      for(int var5 = 0; var5 < var2; ++var5) {
         int var6 = var0[var1 + var5] & 255;
         if (var6 != 0) {
            if (var6 >= 128 && var6 < 160) {
               char var7 = af[var6 - 128];
               if (0 == var7) {
                  var7 = '?';
               }

               var6 = var7;
            }

            var3[var4++] = (char)var6;
         }
      }

      return new String(var3, 0, var4);
   }
}
