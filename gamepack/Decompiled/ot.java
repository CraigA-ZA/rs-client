import java.util.concurrent.ThreadPoolExecutor;

public class ot extends RuntimeException {
   static ThreadPoolExecutor al;

   public ot(String var1, Object[] var2) {
      super(String.format(var1, var2));
   }

   static final void worldToScreen(int var0, int var1, int var2) {
      if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
         int var4 = fq.getTileHeight(var0, var1, -1727408401 * GameShell.plane) - var2;
         var0 -= bt.kx * -2100544359;
         var4 -= gk.kv * 1772923873;
         var1 -= ly.ke * -91399205;
         int var5 = Rasterizer3D.ac[1897923909 * WorldMapSectionType.ky];
         int var6 = Rasterizer3D.au[WorldMapSectionType.ky * 1897923909];
         int var7 = Rasterizer3D.ac[-1010818347 * ek.kh];
         int var8 = Rasterizer3D.au[-1010818347 * ek.kh];
         int var9 = var8 * var0 + var7 * var1 >> 16;
         var1 = var1 * var8 - var7 * var0 >> 16;
         var0 = var9;
         var9 = var6 * var4 - var5 * var1 >> 16;
         var1 = var1 * var6 + var4 * var5 >> 16;
         if (var1 >= 50) {
            Client.mz = (433849721 * Client.viewportWidth / 2 + var0 * Client.viewportZoom * -1114517553 / var1) * -846498395;
            Client.mu = -1610031701 * (Client.viewportHeight * 2042096749 / 2 + var9 * -1114517553 * Client.viewportZoom / var1);
         } else {
            Client.mz = 846498395;
            Client.mu = 1610031701;
         }

      } else {
         Client.mz = 846498395;
         Client.mu = 1610031701;
      }
   }
}
