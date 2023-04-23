public final class IndexedSprite extends Rasterizer2D {
   public byte[] af;
   public int ab;
   public int ac;
   public int al;
   public int aq;
   public int au;
   public int aw;
   public int[] an;

   IndexedSprite() {
   }

   public void normalize() {
      if (this.aw != this.aq || this.ac != this.al) {
         byte[] var1 = new byte[this.aq * this.al];
         int var2 = 0;

         for(int var3 = 0; var3 < this.ac; ++var3) {
            for(int var4 = 0; var4 < this.aw; ++var4) {
               var1[var4 + this.au + (var3 + this.ab) * this.aq] = this.af[var2++];
            }
         }

         this.af = var1;
         this.aw = this.aq;
         this.ac = this.al;
         this.au = 0;
         this.ab = 0;
      }
   }

   public void shiftColors(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.an.length; ++var4) {
         int var5 = this.an[var4] >> 16 & 255;
         var5 += var1;
         if (var5 < 0) {
            var5 = 0;
         } else if (var5 > 255) {
            var5 = 255;
         }

         int var6 = this.an[var4] >> 8 & 255;
         var6 += var2;
         if (var6 < 0) {
            var6 = 0;
         } else if (var6 > 255) {
            var6 = 255;
         }

         int var7 = this.an[var4] & 255;
         var7 += var3;
         if (var7 < 0) {
            var7 = 0;
         } else if (var7 > 255) {
            var7 = 255;
         }

         this.an[var4] = (var5 << 16) + (var6 << 8) + var7;
      }

   }

   public void aw(int var1, int var2) {
      var1 += this.au;
      var2 += this.ab;
      int var3 = var1 + var2 * ae;
      int var4 = 0;
      int var5 = this.ac;
      int var6 = this.aw;
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
         ac_renamed(ad, this.af, this.an, var4, var3, var6, var5, var7, var8);
      }
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

   public void au(int var1, int var2, int var3, int var4) {
      int var5 = this.aw;
      int var6 = this.ac;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.aq;
      int var10 = this.al;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if (this.au > 0) {
         var13 = ((this.au << 16) + var11 - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (this.au << 16);
      }

      if (this.ab > 0) {
         var13 = ((this.ab << 16) + var12 - 1) / var12;
         var2 += var13;
         var8 += var13 * var12 - (this.ab << 16);
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

      ab_renamed(ad, this.af, this.an, var7, var8, var13, var14, var3, var4, var11, var12, var5);
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
}
