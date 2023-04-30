public class of {
   static final int au = 2;

   static final void aq(sg var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      try {
         boolean var10000;
         label155: {
            if (var1 >= 0 && var1 < 4 && var2 >= 0) {
               if (var7 >= 40) {
                  throw new IllegalStateException();
               }

               if (var2 < 104) {
                  if (var7 >= 40) {
                     throw new IllegalStateException();
                  }

                  if (var3 >= 0) {
                     if (var7 >= 40) {
                        return;
                     }

                     if (var3 < 104) {
                        var10000 = true;
                        break label155;
                     }
                  }
               }
            }

            var10000 = false;
         }

         boolean var8 = var10000;
         int var9;
         if (var8) {
            if (var7 >= 40) {
               throw new IllegalStateException();
            }

            cd.an[var1][var2][var3] = 0;

            while(true) {
               var9 = var0.cl(689796545);
               if (0 == var9) {
                  if (var7 >= 40) {
                     throw new IllegalStateException();
                  }

                  if (0 == var1) {
                     if (var7 >= 40) {
                        throw new IllegalStateException();
                     }

                     int[] var17 = cd.af[0][var2];
                     int var13 = var4 + 932731;
                     int var14 = var5 + 556238;
                     int var15 = dy.ai('넵' + var13, 91923 + var14, 4, (byte)-9) - 128 + (dy.ai(10294 + var13, '鎽' + var14, 2, (byte)-51) - 128 >> 1) + (dy.ai(var13, var14, 1, (byte)-84) - 128 >> 2);
                     var15 = 35 + (int)((double)var15 * 0.3);
                     if (var15 < 10) {
                        if (var7 >= 40) {
                           throw new IllegalStateException();
                        }

                        var15 = 10;
                     } else if (var15 > 60) {
                        if (var7 >= 40) {
                           return;
                        }

                        var15 = 60;
                     }

                     var17[var3] = 8 * -var15;
                  } else {
                     cd.af[var1][var2][var3] = cd.af[var1 - 1][var2][var3] - 240;
                  }
                  break;
               }

               if (var9 == 1) {
                  if (var7 >= 40) {
                     return;
                  }

                  int var10 = var0.cm((byte)7);
                  if (var10 == 1) {
                     var10 = 0;
                  }

                  if (0 == var1) {
                     if (var7 >= 40) {
                        throw new IllegalStateException();
                     }

                     cd.af[0][var2][var3] = 8 * -var10;
                  } else {
                     cd.af[var1][var2][var3] = cd.af[var1 - 1][var2][var3] - 8 * var10;
                  }
                  break;
               }

               if (var9 <= 49) {
                  if (var7 >= 40) {
                     throw new IllegalStateException();
                  }

                  cd.au[var1][var2][var3] = (short)var0.cg((byte)-108);
                  cd.ab[var1][var2][var3] = (byte)((var9 - 2) / 4);
                  cd.aq[var1][var2][var3] = (byte)(var6 + (var9 - 2) & 3);
               } else if (var9 <= 81) {
                  if (var7 >= 40) {
                     return;
                  }

                  cd.an[var1][var2][var3] = (byte)(var9 - 49);
               } else {
                  hu.ac[var1][var2][var3] = (short)(var9 - 81);
               }
            }
         } else {
            while(true) {
               var9 = var0.cl(-443898580);
               if (0 == var9) {
                  if (var7 >= 40) {
                     throw new IllegalStateException();
                  }
                  break;
               }

               if (1 == var9) {
                  if (var7 >= 40) {
                     return;
                  }

                  var0.cm((byte)7);
                  break;
               }

               if (var9 <= 49) {
                  var0.cg((byte)-17);
               }
            }
         }

      } catch (RuntimeException var16) {
         throw db.an(var16, "of.aq(" + ')');
      }
   }

   public static int au(CharSequence var0, CharSequence var1, nx var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;

      int var9;
      int var10;
      int var11;
      while(var5 - var7 < var3 || var6 - var8 < var4) {
         if (var5 - var7 >= var3) {
            return -1;
         }

         if (var6 - var8 >= var4) {
            return 1;
         }

         if (var7 != 0) {
            var9 = var7;
            boolean var14 = false;
         } else {
            var9 = var0.charAt(var5++);
         }

         if (0 != var8) {
            var10 = var8;
            boolean var15 = false;
         } else {
            var10 = var1.charAt(var6++);
         }

         if (198 == var9) {
            var11 = 69;
         } else if (1945106352 == var9) {
            var11 = -1212140784;
         } else if (-745853887 == var9) {
            var11 = 962928149;
         } else if (var9 == 338) {
            var11 = -2013172350;
         } else if (339 == var9) {
            var11 = -291909971;
         } else {
            var11 = 0;
         }

         var7 = var11;
         int var12;
         if (var10 == 272832507) {
            var12 = 69;
         } else if (var10 == -102076367) {
            var12 = -1513723783;
         } else if (223 == var10) {
            var12 = -1390481815;
         } else if (-1713997472 == var10) {
            var12 = 69;
         } else if (var10 == 339) {
            var12 = 101;
         } else {
            var12 = 0;
         }

         var8 = var12;
         char var16 = nm.an((char)var9, var2, (byte)-22);
         char var17 = nm.an((char)var10, var2, (byte)-51);
         if (var16 != var17 && Character.toUpperCase(var16) != Character.toUpperCase(var17)) {
            var16 = Character.toLowerCase(var16);
            var17 = Character.toLowerCase(var17);
            if (var16 != var17) {
               return nd.aw(var16, var2, 412473035) - nd.aw(var17, var2, -839287356);
            }
         }
      }

      var9 = Math.min(var3, var4);

      char var19;
      for(var10 = 0; var10 < var9; ++var10) {
         if (nx.aw == var2) {
            var5 = var3 - 1 - var10;
            var6 = var4 - 1 - var10;
         } else {
            var6 = var10;
            var5 = var10;
         }

         char var18 = var0.charAt(var5);
         var19 = var1.charAt(var6);
         if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
            var18 = Character.toLowerCase(var18);
            var19 = Character.toLowerCase(var19);
            if (var19 != var18) {
               return nd.aw(var18, var2, 2111522597) - nd.aw(var19, var2, -1856723365);
            }
         }
      }

      var10 = var3 - var4;
      if (0 != var10) {
         return var10;
      } else {
         for(var11 = 0; var11 < var9; ++var11) {
            var19 = var0.charAt(var11);
            char var13 = var1.charAt(var11);
            if (var13 != var19) {
               return nd.aw(var19, var2, 958649927) - nd.aw(var13, var2, 816681642);
            }
         }

         return 0;
      }
   }

   static char aq(char var0, nx var1) {
      if (var0 >= 192 && var0 <= 255) {
         if (var0 >= 192 && var0 <= 198) {
            return 'A';
         }

         if (var0 == 199) {
            return 'C';
         }

         if (var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if (var0 >= 204 && var0 <= 207) {
            return 'I';
         }

         if (209 == var0 && nx.ab != var1) {
            return 'N';
         }

         if (var0 >= 210 && var0 <= 214) {
            return 'O';
         }

         if (var0 >= 217 && var0 <= 220) {
            return 'U';
         }

         if (var0 == 221) {
            return 'Y';
         }

         if (var0 == 223) {
            return 's';
         }

         if (var0 >= 224 && var0 <= 230) {
            return 'a';
         }

         if (231 == var0) {
            return 'c';
         }

         if (var0 >= 232 && var0 <= 235) {
            return 'e';
         }

         if (var0 >= 236 && var0 <= 239) {
            return 'i';
         }

         if (241 == var0 && var1 != nx.ab) {
            return 'n';
         }

         if (var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if (var0 >= 249 && var0 <= 252) {
            return 'u';
         }

         if (var0 == 253 || var0 == 255) {
            return 'y';
         }
      }

      if (var0 == 338) {
         return 'O';
      } else if (339 == var0) {
         return 'o';
      } else if (376 == var0) {
         return 'Y';
      } else {
         return var0;
      }
   }

   public static int ab(CharSequence var0, CharSequence var1, nx var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      int var5 = 0;
      int var6 = 0;
      byte var7 = 0;
      byte var8 = 0;

      int var9;
      int var10;
      int var11;
      char var12;
      while(var5 - var7 < var3 || var6 - var8 < var4) {
         if (var5 - var7 >= var3) {
            return -1;
         }

         if (var6 - var8 >= var4) {
            return 1;
         }

         if (var7 != 0) {
            var9 = var7;
            boolean var14 = false;
         } else {
            var9 = var0.charAt(var5++);
         }

         if (0 != var8) {
            var10 = var8;
            boolean var15 = false;
         } else {
            var10 = var1.charAt(var6++);
         }

         if (198 == var9) {
            var11 = 69;
         } else if (230 == var9) {
            var11 = 101;
         } else if (223 == var9) {
            var11 = 115;
         } else if (var9 == 338) {
            var11 = 69;
         } else if (339 == var9) {
            var11 = 101;
         } else {
            var11 = 0;
         }

         var7 = (byte)var11;
         if (var10 == 198) {
            var12 = 'E';
         } else if (var10 == 230) {
            var12 = 'e';
         } else if (223 == var10) {
            var12 = 's';
         } else if (338 == var10) {
            var12 = 'E';
         } else if (var10 == 339) {
            var12 = 'e';
         } else {
            var12 = 0;
         }

         var8 = (byte)var12;
         var9 = nm.an((char)var9, var2, (byte)11);
         var10 = nm.an((char)var10, var2, (byte)-121);
         if (var9 != var10 && Character.toUpperCase((char)var9) != Character.toUpperCase((char)var10)) {
            var9 = Character.toLowerCase((char)var9);
            var10 = Character.toLowerCase((char)var10);
            if (var9 != var10) {
               return nd.aw((char)var9, var2, 1667245100) - nd.aw((char)var10, var2, -2034517584);
            }
         }
      }

      var9 = Math.min(var3, var4);

      for(var10 = 0; var10 < var9; ++var10) {
         if (nx.aw == var2) {
            var5 = var3 - 1 - var10;
            var6 = var4 - 1 - var10;
         } else {
            var6 = var10;
            var5 = var10;
         }

         var11 = var0.charAt(var5);
         var12 = var1.charAt(var6);
         if (var11 != var12 && Character.toUpperCase((char)var11) != Character.toUpperCase(var12)) {
            var11 = Character.toLowerCase((char)var11);
            var12 = Character.toLowerCase(var12);
            if (var12 != var11) {
               return nd.aw((char)var11, var2, 1252792960) - nd.aw(var12, var2, 70825482);
            }
         }
      }

      var10 = var3 - var4;
      if (0 != var10) {
         return var10;
      } else {
         for(var11 = 0; var11 < var9; ++var11) {
            var12 = var0.charAt(var11);
            char var13 = var1.charAt(var11);
            if (var13 != var12) {
               return nd.aw(var12, var2, -959957324) - nd.aw(var13, var2, 411321981);
            }
         }

         return 0;
      }
   }

   public static int ac(CharSequence var0, CharSequence var1, nx var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      int var5 = 0;
      int var6 = 0;
      byte var7 = 0;
      byte var8 = 0;

      int var9;
      int var10;
      int var11;
      char var12;
      while(var5 - var7 < var3 || var6 - var8 < var4) {
         if (var5 - var7 >= var3) {
            return -1;
         }

         if (var6 - var8 >= var4) {
            return 1;
         }

         if (var7 != 0) {
            var9 = var7;
            boolean var14 = false;
         } else {
            var9 = var0.charAt(var5++);
         }

         if (0 != var8) {
            var10 = var8;
            boolean var15 = false;
         } else {
            var10 = var1.charAt(var6++);
         }

         if (198 == var9) {
            var11 = 69;
         } else if (230 == var9) {
            var11 = 101;
         } else if (223 == var9) {
            var11 = 115;
         } else if (var9 == 338) {
            var11 = 69;
         } else if (339 == var9) {
            var11 = 101;
         } else {
            var11 = 0;
         }

         var7 = (byte)var11;
         if (var10 == 198) {
            var12 = 'E';
         } else if (var10 == 230) {
            var12 = 'e';
         } else if (223 == var10) {
            var12 = 's';
         } else if (338 == var10) {
            var12 = 'E';
         } else if (var10 == 339) {
            var12 = 'e';
         } else {
            var12 = 0;
         }

         var8 = (byte)var12;
         var9 = nm.an((char)var9, var2, (byte)-84);
         var10 = nm.an((char)var10, var2, (byte)44);
         if (var9 != var10 && Character.toUpperCase((char)var9) != Character.toUpperCase((char)var10)) {
            var9 = Character.toLowerCase((char)var9);
            var10 = Character.toLowerCase((char)var10);
            if (var9 != var10) {
               return nd.aw((char)var9, var2, 2061686937) - nd.aw((char)var10, var2, 1746795082);
            }
         }
      }

      var9 = Math.min(var3, var4);

      for(var10 = 0; var10 < var9; ++var10) {
         if (nx.aw == var2) {
            var5 = var3 - 1 - var10;
            var6 = var4 - 1 - var10;
         } else {
            var6 = var10;
            var5 = var10;
         }

         var11 = var0.charAt(var5);
         var12 = var1.charAt(var6);
         if (var11 != var12 && Character.toUpperCase((char)var11) != Character.toUpperCase(var12)) {
            var11 = Character.toLowerCase((char)var11);
            var12 = Character.toLowerCase(var12);
            if (var12 != var11) {
               return nd.aw((char)var11, var2, 731839886) - nd.aw(var12, var2, 1452546374);
            }
         }
      }

      var10 = var3 - var4;
      if (0 != var10) {
         return var10;
      } else {
         for(var11 = 0; var11 < var9; ++var11) {
            var12 = var0.charAt(var11);
            char var13 = var1.charAt(var11);
            if (var13 != var12) {
               return nd.aw(var12, var2, 493774300) - nd.aw(var13, var2, 1761783271);
            }
         }

         return 0;
      }
   }

   static char al(char var0, nx var1) {
      if (var0 >= 192 && var0 <= 255) {
         if (var0 >= 192 && var0 <= 198) {
            return 'A';
         }

         if (var0 == 199) {
            return 'C';
         }

         if (var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if (var0 >= 204 && var0 <= 207) {
            return 'I';
         }

         if (209 == var0 && nx.ab != var1) {
            return 'N';
         }

         if (var0 >= 210 && var0 <= 214) {
            return 'O';
         }

         if (var0 >= 217 && var0 <= 220) {
            return 'U';
         }

         if (var0 == 221) {
            return 'Y';
         }

         if (var0 == 223) {
            return 's';
         }

         if (var0 >= 224 && var0 <= 230) {
            return 'a';
         }

         if (231 == var0) {
            return 'c';
         }

         if (var0 >= 232 && var0 <= 235) {
            return 'e';
         }

         if (var0 >= 236 && var0 <= 239) {
            return 'i';
         }

         if (241 == var0 && var1 != nx.ab) {
            return 'n';
         }

         if (var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if (var0 >= 249 && var0 <= 252) {
            return 'u';
         }

         if (var0 == 253 || var0 == 255) {
            return 'y';
         }
      }

      if (var0 == 338) {
         return 'O';
      } else if (339 == var0) {
         return 'o';
      } else if (376 == var0) {
         return 'Y';
      } else {
         return var0;
      }
   }

   static int at(char var0, nx var1) {
      int var2 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = (var0 << 4) + 1;
      }

      if (var0 == 241 && var1 == nx.ab) {
         var2 = 1762;
      }

      return var2;
   }

   static int aa(char var0, nx var1) {
      int var2 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = (var0 << 4) + 1;
      }

      if (var0 == -365325905 && var1 == nx.ab) {
         var2 = 1762;
      }

      return var2;
   }

   of() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "of.<init>(" + ')');
      }
   }
}
