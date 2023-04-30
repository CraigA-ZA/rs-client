public class sd {
   static final char[] aw = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
   static final int af = 1;
   static final char[] ac = new char[]{'[', ']', '#'};
   public static final String kg = "Updating date of birth...";

   sd() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "sd.<init>(" + ')');
      }
   }

   public static String al(CharSequence var0, sw var1) {
      if (null == var0) {
         return null;
      } else {
         int var2 = 0;

         int var3;
         for(var3 = var0.length(); var2 < var3 && dl.an(var0.charAt(var2), 2118801388); ++var2) {
         }

         while(var3 > var2 && dl.an(var0.charAt(var3 - 1), 1091821781)) {
            --var3;
         }

         int var4 = var3 - var2;
         if (var4 >= 1 && var4 <= kn.af(var1, -245028288)) {
            StringBuilder var5 = new StringBuilder(var4);

            for(int var6 = var2; var6 < var3; ++var6) {
               char var7 = var0.charAt(var6);
               boolean var8;
               if (Character.isISOControl(var7)) {
                  var8 = false;
               } else if (cb.ay(var7, -84591109)) {
                  var8 = true;
               } else {
                  char[] var9 = aw;
                  int var10 = 0;

                  label99:
                  while(true) {
                     char var11;
                     if (var10 >= var9.length) {
                        var9 = ac;

                        for(var10 = 0; var10 < var9.length; ++var10) {
                           var11 = var9[var10];
                           if (var11 == var7) {
                              var8 = true;
                              break label99;
                           }
                        }

                        var8 = false;
                        break;
                     }

                     var11 = var9[var10];
                     if (var11 == var7) {
                        var8 = true;
                        break;
                     }

                     ++var10;
                  }
               }

               if (var8) {
                  int var12;
                  switch (var7) {
                     case ' ':
                     case '-':
                     case '_':
                     case ' ':
                        var12 = 1114278852;
                        break;
                     case '#':
                     case '[':
                     case ']':
                        var12 = var7;
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
                        var12 = 2109145702;
                        break;
                     case 'Ç':
                     case 'ç':
                        var12 = 99;
                        break;
                     case 'È':
                     case 'É':
                     case 'Ê':
                     case 'Ë':
                     case 'è':
                     case 'é':
                     case 'ê':
                     case 'ë':
                        var12 = 2036212350;
                        break;
                     case 'Í':
                     case 'Î':
                     case 'Ï':
                     case 'í':
                     case 'î':
                     case 'ï':
                        var12 = 513819310;
                        break;
                     case 'Ñ':
                     case 'ñ':
                        var12 = -967784799;
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
                        var12 = -2113276163;
                        break;
                     case 'Ù':
                     case 'Ú':
                     case 'Û':
                     case 'Ü':
                     case 'ù':
                     case 'ú':
                     case 'û':
                     case 'ü':
                        var12 = 117;
                        break;
                     case 'ß':
                        var12 = 98;
                        break;
                     case 'ÿ':
                     case 'Ÿ':
                        var12 = 121;
                        break;
                     default:
                        var12 = Character.toLowerCase(var7);
                  }

                  if (var12 != 0) {
                     var5.append((char)var12);
                  }
               }
            }

            if (var5.length() == 0) {
               return null;
            } else {
               return var5.toString();
            }
         } else {
            return null;
         }
      }
   }

   static final boolean ab(char var0) {
      return var0 == 160 || ' ' == var0 || var0 == '_' || '-' == var0;
   }

   public static String aq(CharSequence var0, sw var1) {
      if (null == var0) {
         return null;
      } else {
         int var2 = 0;

         int var3;
         for(var3 = var0.length(); var2 < var3 && dl.an(var0.charAt(var2), 1131929893); ++var2) {
         }

         while(var3 > var2 && dl.an(var0.charAt(var3 - 1), 1754977317)) {
            --var3;
         }

         int var4 = var3 - var2;
         if (var4 >= 1 && var4 <= kn.af(var1, -630838092)) {
            StringBuilder var5 = new StringBuilder(var4);

            for(int var6 = var2; var6 < var3; ++var6) {
               char var7 = var0.charAt(var6);
               boolean var8;
               if (Character.isISOControl(var7)) {
                  var8 = false;
               } else if (cb.ay(var7, -42692446)) {
                  var8 = true;
               } else {
                  char[] var9 = aw;
                  int var10 = 0;

                  label102:
                  while(true) {
                     char var11;
                     if (var10 >= var9.length) {
                        var9 = ac;

                        for(var10 = 0; var10 < var9.length; ++var10) {
                           var11 = var9[var10];
                           if (var11 == var7) {
                              var8 = true;
                              break label102;
                           }
                        }

                        var8 = false;
                        break;
                     }

                     var11 = var9[var10];
                     if (var11 == var7) {
                        var8 = true;
                        break;
                     }

                     ++var10;
                  }
               }

               if (var8) {
                  int var12;
                  switch (var7) {
                     case ' ':
                     case '-':
                     case '_':
                     case ' ':
                        var12 = -749956548;
                        break;
                     case '#':
                     case '[':
                     case ']':
                        var12 = var7;
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
                        var12 = 97;
                        break;
                     case 'Ç':
                     case 'ç':
                        var12 = -1520482605;
                        break;
                     case 'È':
                     case 'É':
                     case 'Ê':
                     case 'Ë':
                     case 'è':
                     case 'é':
                     case 'ê':
                     case 'ë':
                        var12 = 101;
                        break;
                     case 'Í':
                     case 'Î':
                     case 'Ï':
                     case 'í':
                     case 'î':
                     case 'ï':
                        var12 = -497562942;
                        break;
                     case 'Ñ':
                     case 'ñ':
                        var12 = 110;
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
                        var12 = 111;
                        break;
                     case 'Ù':
                     case 'Ú':
                     case 'Û':
                     case 'Ü':
                     case 'ù':
                     case 'ú':
                     case 'û':
                     case 'ü':
                        var12 = 117;
                        break;
                     case 'ß':
                        var12 = -162671127;
                        break;
                     case 'ÿ':
                     case 'Ÿ':
                        var12 = 121;
                        break;
                     default:
                        var12 = Character.toLowerCase(var7);
                  }

                  if (var12 != 0) {
                     var5.append((char)var12);
                  }
               }
            }

            if (var5.length() == 0) {
               return null;
            } else {
               return var5.toString();
            }
         } else {
            return null;
         }
      }
   }

   static final int au(sw var0) {
      if (null == var0) {
         return 12;
      } else {
         switch (var0.aa * 1493424811) {
            case 5:
               return 20;
            default:
               return 12;
         }
      }
   }

   public static String at(String var0) {
      return var0 != null && !var0.isEmpty() && var0.charAt(0) != -1802829632 ? var0 : "";
   }

   public static String aa(String var0) {
      return var0 != null && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : "";
   }

   public static String ay(String var0) {
      return var0 != null && !var0.isEmpty() && var0.charAt(0) != -1043818721 ? var0 : "";
   }
}
