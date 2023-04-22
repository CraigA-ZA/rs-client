public class fq extends fu {
   static int menuX;
   int af;
   static gj av;
   // $FF: synthetic field
   final gr this$0;

   fq(gr var1) {
      this.this$0 = var1;
      this.af = 1937399629;
   }

   void af(Packet var1) {
      this.af = var1.cl() * -1937399629;
      var1.g1();
      if (var1.g1() != 255) {
         var1.index -= -1516355947;
         var1.g8s();
      }

   }

   void an(gj var1) {
      var1.aw(-1141502341 * this.af);
   }

   static final void at_renamed(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
      Packet var6 = new Packet(var0);
      int var7 = -1;

      while(true) {
         int var8 = var6.dw();
         if (var8 == 0) {
            return;
         }

         var7 += var8;
         int var9 = 0;

         while(true) {
            int var10 = var6.cd();
            if (var10 == 0) {
               break;
            }

            var9 += var10 - 1;
            int var11 = var9 & 63;
            int var12 = var9 >> 6 & 63;
            int var13 = var9 >> 12;
            int var14 = var6.g1();
            int var15 = var14 >> 2;
            int var16 = var14 & 3;
            int var17 = var12 + var1;
            int var18 = var11 + var2;
            if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
               int var19 = var13;
               if (2 == (Tiles.Tiles_renderFlags[1][var17][var18] & 2)) {
                  var19 = var13 - 1;
               }

               CollisionMap var20 = null;
               if (var19 >= 0) {
                  var20 = var4[var19];
               }

               hy.ay_renamed(var13, var17, var18, var7, var16, var15, var3, var20);
            }
         }
      }
   }

   static final int getTileHeight(int var0, int var1, int var2) {
      int var4 = var0 >> 7;
      int var5 = var1 >> 7;
      if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
         int var6 = var2;
         if (var2 < 3 && 2 == (Tiles.Tiles_renderFlags[1][var4][var5] & 2)) {
            var6 = var2 + 1;
         }

         int var7 = var0 & 127;
         int var8 = var1 & 127;
         int var9 = var7 * Tiles.Tiles_heights[var6][1 + var4][var5] + Tiles.Tiles_heights[var6][var4][var5] * (128 - var7) >> 7;
         int var10 = var7 * Tiles.Tiles_heights[var6][var4 + 1][var5 + 1] + Tiles.Tiles_heights[var6][var4][1 + var5] * (128 - var7) >> 7;
         return var8 * var10 + var9 * (128 - var8) >> 7;
      } else {
         return 0;
      }
   }
}
