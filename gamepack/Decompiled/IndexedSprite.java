public final class IndexedSprite extends Rasterizer2D {
   public int width;
   public int[] palette;
   public int subWidth;
   public int subHeight;
   public byte[] pixels;
   public int yOffset;
   public int height;
   public int xOffset;

   public void shiftColors(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.palette.length; ++var4) {
         int var5 = this.palette[var4] >> 16 & 255;
         var5 += var1;
         if (var5 < 0) {
            var5 = 0;
         } else if (var5 > 255) {
            var5 = 255;
         }

         int var6 = this.palette[var4] >> 8 & 255;
         var6 += var2;
         if (var6 < 0) {
            var6 = 0;
         } else if (var6 > 255) {
            var6 = 255;
         }

         int var7 = this.palette[var4] & 255;
         var7 += var3;
         if (var7 < 0) {
            var7 = 0;
         } else if (var7 > 255) {
            var7 = 255;
         }

         this.palette[var4] = (var5 << 16) + (var6 << 8) + var7;
      }

   }

   public void aw(int var1, int var2) {
      var1 += this.xOffset;
      var2 += this.yOffset;
      int var3 = var1 + var2 * ae;
      int var4 = 0;
      int var5 = this.subHeight;
      int var6 = this.subWidth;
      int var7 = ae - var6;
      int var8 = 0;
      int var9;
      if (var2 < bi) {
         var9 = bi - var2;
         var5 -= var9;
         var2 = bi;
         var4 += var9 * var6;
         var3 += var9 * ae;
      }

      if (var2 + var5 > be) {
         var5 -= var2 + var5 - be;
      }

      if (var1 < bk) {
         var9 = bk - var1;
         var6 -= var9;
         var1 = bk;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var1 + var6 > bx) {
         var9 = var1 + var6 - bx;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         ac_renamed(ad, this.pixels, this.palette, var4, var3, var6, var5, var7, var8);
      }
   }

   static void ab_renamed(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = (var4 >> 16) * var11;

         for(int var15 = -var7; var15 < 0; ++var15) {
            byte var16 = var1[(var3 >> 16) + var14];
            if (var16 != 0) {
               var0[var5++] = var2[var16 & 255];
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var12;
         var5 += var6;
      }

   }

   IndexedSprite() {
   }

   public void au(int var1, int var2, int var3, int var4) {
      int var5 = this.subWidth;
      int var6 = this.subHeight;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.width;
      int var10 = this.height;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if (this.xOffset > 0) {
         var13 = ((this.xOffset << 16) + var11 - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (this.xOffset << 16);
      }

      if (this.yOffset > 0) {
         var13 = ((this.yOffset << 16) + var12 - 1) / var12;
         var2 += var13;
         var8 += var13 * var12 - (this.yOffset << 16);
      }

      if (var5 < var9) {
         var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
      }

      if (var6 < var10) {
         var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
      }

      var13 = var1 + var2 * ae;
      int var14 = ae - var3;
      if (var2 + var4 > be) {
         var4 -= var2 + var4 - be;
      }

      int var15;
      if (var2 < bi) {
         var15 = bi - var2;
         var4 -= var15;
         var13 += var15 * ae;
         var8 += var12 * var15;
      }

      if (var1 + var3 > bx) {
         var15 = var1 + var3 - bx;
         var3 -= var15;
         var14 += var15;
      }

      if (var1 < bk) {
         var15 = bk - var1;
         var3 -= var15;
         var13 += var15;
         var7 += var11 * var15;
         var14 += var15;
      }

      ab_renamed(ad, this.pixels, this.palette, var7, var8, var13, var14, var3, var4, var11, var12, var5);
   }

   static void ac_renamed(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         byte var12;
         for(var11 = var9; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   public void normalize() {
      if (this.subWidth != this.width || this.subHeight != this.height) {
         byte[] var1 = new byte[this.width * this.height];
         int var2 = 0;

         for(int var3 = 0; var3 < this.subHeight; ++var3) {
            for(int var4 = 0; var4 < this.subWidth; ++var4) {
               var1[var4 + this.xOffset + (var3 + this.yOffset) * this.width] = this.pixels[var2++];
            }
         }

         this.pixels = var1;
         this.subWidth = this.width;
         this.subHeight = this.height;
         this.xOffset = 0;
         this.yOffset = 0;
      }
   }
}
