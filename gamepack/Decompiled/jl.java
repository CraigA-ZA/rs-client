public class jl {
   final int af;
   final int an;
   final int aw;

   jl(int var1, int var2, int var3) {
      this.af = 1358143841 * var1;
      this.an = var2 * 1865707777;
      this.aw = var3 * 1079176927;
   }

   static final void ij_renamed(String var0, boolean var1) {
      if (Client.mj) {
         byte var3 = 4;
         int var4 = var3 + 6;
         int var5 = var3 + 6;
         int var6 = WallDecoration.io.lineWidth(var0, 250);
         int var7 = WallDecoration.io.lineCount(var0, 250) * 13;
         Rasterizer2D.Rasterizer2D_fillRectangle(var4 - var3, var5 - var3, var3 + var3 + var6, var3 + var3 + var7, 0);
         Rasterizer2D.Rasterizer2D_drawRectangle(var4 - var3, var5 - var3, var6 + var3 + var3, var7 + var3 + var3, 16777215);
         WallDecoration.io.drawLines(var0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
         int var8 = var4 - var3;
         int var9 = var5 - var3;
         int var10 = var6 + var3 + var3;
         int var11 = var3 + var7 + var3;

         for(int var12 = 0; var12 < -356793645 * Client.rr; ++var12) {
            if (Client.ra[var12] + Client.rh[var12] > var8 && Client.rh[var12] < var10 + var8 && Client.rb[var12] + Client.ri[var12] > var9 && Client.rb[var12] < var9 + var11) {
               Client.rf[var12] = true;
            }
         }

         if (var1) {
            ia.bn.drawFull(0, 0);
         } else {
            ClanChat.ki_renamed(var4, var5, var6, var7);
         }

      }
   }
}
