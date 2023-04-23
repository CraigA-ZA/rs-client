public class ArchiveLoader {
   static int menuY;
   int ac = 0;
   final int aw;
   final Archive archive;

   ArchiveLoader(Archive var1, String var2) {
      this.archive = var1;
      this.aw = var1.cm() * -1548488391;
   }

   boolean af() {
      this.ac = 0;

      for(int var2 = 0; var2 < -17715959 * this.aw; ++var2) {
         if (!this.archive.ao(var2) || this.archive.ay(var2)) {
            this.ac += 1412973495;
         }
      }

      return -1464399353 * this.ac >= this.aw * -17715959;
   }

   static final int lx_renamed(Component var0, int var1) {
      if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) {
         try {
            int[] var3 = var0.cs1Instructions[var1];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;

            while(true) {
               int var7 = var3[var5++];
               int var8 = 0;
               byte var9 = 0;
               if (0 == var7) {
                  return var4;
               }

               if (1 == var7) {
                  var8 = Client.ng[var3[var5++]];
               }

               if (2 == var7) {
                  var8 = Client.ny[var3[var5++]];
               }

               if (3 == var7) {
                  var8 = Client.nu[var3[var5++]];
               }

               int var10;
               Component var11;
               int var12;
               int var13;
               if (4 == var7) {
                  var10 = var3[var5++] << 16;
                  var10 += var3[var5++];
                  var11 = gh.an_renamed(var10);
                  var12 = var3[var5++];
                  if (var12 != -1 && (!HeadbarUpdate.getObjType(var12).members || Client.ca)) {
                     for(var13 = 0; var13 < var11.gb.length; ++var13) {
                        if (var11.gb[var13] == var12 + 1) {
                           var8 += var11.gp[var13];
                        }
                     }
                  }
               }

               if (var7 == 5) {
                  var8 = Varps.Varps_main[var3[var5++]];
               }

               if (6 == var7) {
                  var8 = Skills.aw[Client.ny[var3[var5++]] - 1];
               }

               if (var7 == 7) {
                  var8 = Varps.Varps_main[var3[var5++]] * 100 / '뜛';
               }

               if (8 == var7) {
                  var8 = 1302967875 * MusicPatchNode.localPlayer.combatLevel;
               }

               if (9 == var7) {
                  for(var10 = 0; var10 < 25; ++var10) {
                     if (Skills.Skills_enabled[var10]) {
                        var8 += Client.ny[var10];
                     }
                  }
               }

               if (10 == var7) {
                  var10 = var3[var5++] << 16;
                  var10 += var3[var5++];
                  var11 = gh.an_renamed(var10);
                  var12 = var3[var5++];
                  if (-1 != var12 && (!HeadbarUpdate.getObjType(var12).members || Client.ca)) {
                     for(var13 = 0; var13 < var11.gb.length; ++var13) {
                        if (var11.gb[var13] == var12 + 1) {
                           var8 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if (var7 == 11) {
                  var8 = -365416549 * Client.pk;
               }

               if (12 == var7) {
                  var8 = Client.pj * -1940722149;
               }

               if (13 == var7) {
                  var10 = Varps.Varps_main[var3[var5++]];
                  int var15 = var3[var5++];
                  var8 = (var10 & 1 << var15) != 0 ? 1 : 0;
               }

               if (var7 == 14) {
                  var10 = var3[var5++];
                  var8 = WorldMapSection1.af_renamed(var10);
               }

               if (15 == var7) {
                  var9 = 1;
               }

               if (var7 == 16) {
                  var9 = 2;
               }

               if (17 == var7) {
                  var9 = 3;
               }

               if (var7 == 18) {
                  var8 = -1232093375 * jm.ib + (MusicPatchNode.localPlayer.bx * 1144428983 >> 7);
               }

               if (19 == var7) {
                  var8 = Scenery.jc * 827352769 + (-411750205 * MusicPatchNode.localPlayer.bo >> 7);
               }

               if (20 == var7) {
                  var8 = var3[var5++];
               }

               if (0 == var9) {
                  if (var6 == 0) {
                     var4 += var8;
                  }

                  if (1 == var6) {
                     var4 -= var8;
                  }

                  if (2 == var6 && 0 != var8) {
                     var4 /= var8;
                  }

                  if (var6 == 3) {
                     var4 *= var8;
                  }

                  var6 = 0;
               } else {
                  var6 = var9;
               }
            }
         } catch (Exception var14) {
            return -1;
         }
      } else {
         return -2;
      }
   }
}
