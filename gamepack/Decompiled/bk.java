import javax.imageio.ImageIO;

public class bk {
   static {
      ImageIO.setUseCache(false);
   }

   bk() throws Throwable {
      throw new Error();
   }

   public static String aw_renamed(CharSequence var0, LoginType var1) {
      if (null == var0) {
         return null;
      } else {
         int var3 = 0;

         int var4;
         for(var4 = var0.length(); var3 < var4 && MouseRecorder.isUsernameWhiteSpace(var0.charAt(var3)); ++var3) {
         }

         while(var4 > var3 && MouseRecorder.isUsernameWhiteSpace(var0.charAt(var4 - 1))) {
            --var4;
         }

         int var5 = var4 - var3;
         if (var5 >= 1 && var5 <= kn.af_renamed(var1)) {
            StringBuilder var6 = new StringBuilder(var5);

            for(int var7 = var3; var7 < var4; ++var7) {
               char var8 = var0.charAt(var7);
               boolean var9;
               if (Character.isISOControl(var8)) {
                  var9 = false;
               } else if (MiniMenuEntry.ay_renamed(var8)) {
                  var9 = true;
               } else {
                  char[] var10 = sd.aw;
                  int var11 = 0;

                  label104:
                  while(true) {
                     char var12;
                     if (var11 >= var10.length) {
                        var10 = sd.ac;

                        for(var11 = 0; var11 < var10.length; ++var11) {
                           var12 = var10[var11];
                           if (var12 == var8) {
                              var9 = true;
                              break label104;
                           }
                        }

                        var9 = false;
                        break;
                     }

                     var12 = var10[var11];
                     if (var12 == var8) {
                        var9 = true;
                        break;
                     }

                     ++var11;
                  }
               }

               if (var9) {
                  char var18;
                  switch (var8) {
                     case ' ':
                     case '-':
                     case '_':
                     case ' ':
                        var18 = '_';
                        break;
                     case '#':
                     case '[':
                     case ']':
                        var18 = var8;
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
                        var18 = 'a';
                        break;
                     case 'Ç':
                     case 'ç':
                        var18 = 'c';
                        break;
                     case 'È':
                     case 'É':
                     case 'Ê':
                     case 'Ë':
                     case 'è':
                     case 'é':
                     case 'ê':
                     case 'ë':
                        var18 = 'e';
                        break;
                     case 'Í':
                     case 'Î':
                     case 'Ï':
                     case 'í':
                     case 'î':
                     case 'ï':
                        var18 = 'i';
                        break;
                     case 'Ñ':
                     case 'ñ':
                        var18 = 'n';
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
                        var18 = 'o';
                        break;
                     case 'Ù':
                     case 'Ú':
                     case 'Û':
                     case 'Ü':
                     case 'ù':
                     case 'ú':
                     case 'û':
                     case 'ü':
                        var18 = 'u';
                        break;
                     case 'ß':
                        var18 = 'b';
                        break;
                     case 'ÿ':
                     case 'Ÿ':
                        var18 = 'y';
                        break;
                     default:
                        var18 = Character.toLowerCase(var8);
                  }

                  if (var18 != 0) {
                     var6.append(var18);
                  }
               }
            }

            if (var6.length() == 0) {
               return null;
            } else {
               return var6.toString();
            }
         } else {
            return null;
         }
      }
   }

   public static long ac_renamed(int var0) {
      return ViewportMouse.ag[var0];
   }

   static final void kt_renamed(PacketBit var0) {
      var0.importIndex();
      int var2 = var0.gBit(8);
      int var3;
      if (var2 < Client.npcCount * 265474485) {
         for(var3 = var2; var3 < 265474485 * Client.npcCount; ++var3) {
            Client.nz[(Client.mb += -1359666311) * 216061641 - 1] = Client.npcIndices[var3];
         }
      }

      if (var2 > Client.npcCount * 265474485) {
         throw new RuntimeException("");
      } else {
         Client.npcCount = 0;

         for(var3 = 0; var3 < var2; ++var3) {
            int var4 = Client.npcIndices[var3];
            Npc var5 = Client.npcs[var4];
            int var6 = var0.gBit(1);
            if (var6 == 0) {
               Client.npcIndices[(Client.npcCount += 1796101277) * 265474485 - 1] = var4;
               var5.dg = -1014023335 * Client.ep;
            } else {
               int var7 = var0.gBit(2);
               if (0 == var7) {
                  Client.npcIndices[(Client.npcCount += 1796101277) * 265474485 - 1] = var4;
                  var5.dg = Client.ep * -1014023335;
                  Client.ih[(Client.ig += 1487412345) * 606834121 - 1] = var4;
               } else {
                  int var8;
                  int var9;
                  if (var7 == 1) {
                     Client.npcIndices[(Client.npcCount += 1796101277) * 265474485 - 1] = var4;
                     var5.dg = Client.ep * -1014023335;
                     var8 = var0.gBit(3);
                     var5.aa(var8, MoveSpeed.walk);
                     var9 = var0.gBit(1);
                     if (1 == var9) {
                        Client.ih[(Client.ig += 1487412345) * 606834121 - 1] = var4;
                     }
                  } else if (var7 == 2) {
                     Client.npcIndices[(Client.npcCount += 1796101277) * 265474485 - 1] = var4;
                     var5.dg = -1014023335 * Client.ep;
                     if (var0.gBit(1) == 1) {
                        var8 = var0.gBit(3);
                        var5.aa(var8, MoveSpeed.run);
                        var9 = var0.gBit(3);
                        var5.aa(var9, MoveSpeed.run);
                     } else {
                        var8 = var0.gBit(3);
                        var5.aa(var8, MoveSpeed.crawl);
                     }

                     var8 = var0.gBit(1);
                     if (var8 == 1) {
                        Client.ih[(Client.ig += 1487412345) * 606834121 - 1] = var4;
                     }
                  } else if (var7 == 3) {
                     Client.nz[(Client.mb += -1359666311) * 216061641 - 1] = var4;
                  }
               }
            }
         }

      }
   }
}
