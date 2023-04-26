public final class FloorDecoration {
   int flags;
   int tileHeight;
   int x;
   int y;
   public Entity entity;
   public long tag;

   FloorDecoration() {
   }

   static final int aw_renamed(int var0, int var1) {
      var1 = (var0 & 127) * var1 >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   static void am_renamed(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      Rasterizer3D.aq.at(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
   }

   static void iq_renamed(Player var0, int var1, int var2) {
      if (-1372355773 * var0.ct == var1 && var1 != -1) {
         int var4 = Inventory.getSeqType(var1).be * 789159225;
         if (1 == var4) {
            var0.cp = 0;
            var0.cd = 0;
            var0.dm = var2 * -401806131;
            var0.dw = 0;
         }

         if (2 == var4) {
            var0.dw = 0;
         }
      } else if (-1 == var1 || var0.ct * -1372355773 == -1 || Inventory.getSeqType(var1).az * -1932560049 >= Inventory.getSeqType(-1372355773 * var0.ct).az * -1932560049) {
         var0.ct = var1 * -1690721941;
         var0.cp = 0;
         var0.cd = 0;
         var0.dm = var2 * -401806131;
         var0.dw = 0;
         var0.eo = var0.dn * -1718989897;
      }

   }
}
