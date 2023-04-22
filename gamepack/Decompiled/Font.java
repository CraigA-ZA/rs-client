public final class Font extends AbstractFont {
   final void drawGlyphAlpha(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var2 + var3 * ae;
      int var9 = ae - var4;
      int var10 = 0;
      int var11 = 0;
      int var12;
      if (var3 < bi) {
         var12 = bi - var3;
         var5 -= var12;
         var3 = bi;
         var11 += var12 * var4;
         var8 += var12 * ae;
      }

      if (var3 + var5 > be) {
         var5 -= var3 + var5 - be;
      }

      if (var2 < bk) {
         var12 = bk - var2;
         var4 -= var12;
         var2 = bk;
         var11 += var12;
         var8 += var12;
         var10 += var12;
         var9 += var12;
      }

      if (var2 + var4 > bx) {
         var12 = var2 + var4 - bx;
         var4 -= var12;
         var10 += var12;
         var9 += var12;
      }

      if (var4 > 0 && var5 > 0) {
         bt_renamed(ad, var1, var6, var11, var8, var4, var5, var9, var10, var7);
      }
   }

   public Font(byte[] var1) {
      super(var1);
   }

   final void drawGlyph(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var2 + var3 * ae;
      int var8 = ae - var4;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var3 < bi) {
         var11 = bi - var3;
         var5 -= var11;
         var3 = bi;
         var10 += var11 * var4;
         var7 += var11 * ae;
      }

      if (var3 + var5 > be) {
         var5 -= var3 + var5 - be;
      }

      if (var2 < bk) {
         var11 = bk - var2;
         var4 -= var11;
         var2 = bk;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (var2 + var4 > bx) {
         var11 = var2 + var4 - bx;
         var4 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var4 > 0 && var5 > 0) {
         bm_renamed(ad, var1, var6, var10, var7, var4, var5, var8, var9);
      }
   }

   public Font(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }
}
