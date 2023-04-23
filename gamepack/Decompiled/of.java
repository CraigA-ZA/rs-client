public class of {
   of() throws Throwable {
      throw new Error();
   }

   static final void loadTerrain(Packet var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var8 = var1 >= 0 && var1 < 4 && var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104;
      int var9;
      if (var8) {
         Tiles.Tiles_renderFlags[var1][var2][var3] = 0;

         while(true) {
            var9 = var0.cl();
            if (0 == var9) {
               if (0 == var1) {
                  int[] var16 = Tiles.Tiles_heights[0][var2];
                  int var13 = var4 + 932731;
                  int var14 = var5 + 556238;
                  int var15 = dy.ai_renamed('넵' + var13, 91923 + var14, 4) - 128 + (dy.ai_renamed(10294 + var13, '鎽' + var14, 2) - 128 >> 1) + (dy.ai_renamed(var13, var14, 1) - 128 >> 2);
                  var15 = 35 + (int)((double)var15 * 0.3);
                  if (var15 < 10) {
                     var15 = 10;
                  } else if (var15 > 60) {
                     var15 = 60;
                  }

                  var16[var3] = 8 * -var15;
               } else {
                  Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240;
               }
               break;
            }

            if (var9 == 1) {
               int var10 = var0.g1();
               if (var10 == 1) {
                  var10 = 0;
               }

               if (0 == var1) {
                  Tiles.Tiles_heights[0][var2][var3] = 8 * -var10;
               } else {
                  Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 8 * var10;
               }
               break;
            }

            if (var9 <= 49) {
               Tiles.au[var1][var2][var3] = (short)var0.cg();
               Tiles.ab[var1][var2][var3] = (byte)((var9 - 2) / 4);
               Tiles.aq[var1][var2][var3] = (byte)(var6 + (var9 - 2) & 3);
            } else if (var9 <= 81) {
               Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var9 - 49);
            } else {
               hu.ac[var1][var2][var3] = (short)(var9 - 81);
            }
         }
      } else {
         while(true) {
            var9 = var0.cl();
            if (0 == var9) {
               break;
            }

            if (1 == var9) {
               var0.g1();
               break;
            }

            if (var9 <= 49) {
               var0.cg();
            }
         }
      }

   }
}
