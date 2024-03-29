public class Texture extends Node {
   static int[] Texture_animatedPixels;
   boolean ab;
   boolean isLoaded = false;
   int animationSpeed;
   int int1;
   int animationDirection;
   int[] aa;
   int[] al;
   int[] files;
   int[] at;
   int[] pixels;

   Texture(Packet var1) {
      this.int1 = var1.cl();
      this.ab = var1.g1() == 1;
      int var2 = var1.g1();
      if (var2 >= 1 && var2 <= 4) {
         this.files = new int[var2];

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            this.files[var3] = var1.cl();
         }

         if (var2 > 1) {
            this.al = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.al[var3] = var1.g1();
            }
         }

         if (var2 > 1) {
            this.at = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.at[var3] = var1.g1();
            }
         }

         this.aa = new int[var2];

         for(var3 = 0; var3 < var2; ++var3) {
            this.aa[var3] = var1.g4s();
         }

         this.animationDirection = var1.g1();
         this.animationSpeed = var1.g1();
         this.pixels = null;
      } else {
         throw new RuntimeException();
      }
   }

   boolean af(double var1, int var3, AbstractArchive var4) {
      int var5;
      for(var5 = 0; var5 < this.files.length; ++var5) {
         if (var4.getFileFlat(this.files[var5]) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.pixels = new int[var5];

      for(int var6 = 0; var6 < this.files.length; ++var6) {
         IndexedSprite var7 = rr.aq_renamed(var4, this.files[var6]);
         var7.normalize();
         byte[] var8 = var7.pixels;
         int[] var9 = var7.palette;
         int var10 = this.aa[var6];
         if ((var10 & -16777216) == 16777216) {
         }

         if ((var10 & -16777216) == 33554432) {
         }

         int var11;
         int var12;
         int var13;
         int var14;
         if ((var10 & -16777216) == 50331648) {
            var11 = var10 & 16711935;
            var12 = var10 >> 8 & 255;

            for(var13 = 0; var13 < var9.length; ++var13) {
               var14 = var9[var13];
               if ((var14 & '\uffff') == var14 >> 8) {
                  var14 &= 255;
                  var9[var13] = var11 * var14 >> 8 & 16711935 | var12 * var14 & '\uff00';
               }
            }
         }

         for(var11 = 0; var11 < var9.length; ++var11) {
            var9[var11] = UrlRequest.ac(var9[var11], var1);
         }

         if (var6 == 0) {
            var11 = 0;
         } else {
            var11 = this.al[var6 - 1];
         }

         if (var11 == 0) {
            if (var7.subWidth == var3) {
               for(var12 = 0; var12 < var5; ++var12) {
                  this.pixels[var12] = var9[var8[var12] & 255];
               }
            } else if (var7.subWidth == 64 && var3 == 128) {
               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.pixels[var12++] = var9[var8[(var14 >> 1) + (var13 >> 1 << 6)] & 255];
                  }
               }
            } else {
               if (var7.subWidth != 128 || var3 != 64) {
                  throw new RuntimeException();
               }

               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.pixels[var12++] = var9[var8[(var14 << 1) + (var13 << 1 << 7)] & 255];
                  }
               }
            }
         }

         if (var11 == 1) {
         }

         if (var11 == 2) {
         }

         if (var11 == 3) {
         }
      }

      return true;
   }

   void reset() {
      this.pixels = null;
   }

   void animate(int var1) {
      if (this.pixels != null) {
         short var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int[] var12;
         if (this.animationDirection == 1 || this.animationDirection == 3) {
            if (Texture_animatedPixels == null || Texture_animatedPixels.length < this.pixels.length) {
               Texture_animatedPixels = new int[this.pixels.length];
            }

            if (this.pixels.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.pixels.length;
            var4 = var2 * var1 * this.animationSpeed;
            var5 = var3 - 1;
            if (this.animationDirection == 1) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; ++var6) {
               var7 = var6 + var4 & var5;
               Texture_animatedPixels[var6] = this.pixels[var7];
            }

            var12 = this.pixels;
            this.pixels = Texture_animatedPixels;
            Texture_animatedPixels = var12;
         }

         if (this.animationDirection == 2 || this.animationDirection == 4) {
            if (Texture_animatedPixels == null || Texture_animatedPixels.length < this.pixels.length) {
               Texture_animatedPixels = new int[this.pixels.length];
            }

            if (this.pixels.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.pixels.length;
            var4 = var1 * this.animationSpeed;
            var5 = var2 - 1;
            if (this.animationDirection == 2) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; var6 += var2) {
               for(var7 = 0; var7 < var2; ++var7) {
                  int var8 = var6 + var7;
                  int var9 = var6 + (var7 + var4 & var5);
                  Texture_animatedPixels[var8] = this.pixels[var9];
               }
            }

            var12 = this.pixels;
            this.pixels = Texture_animatedPixels;
            Texture_animatedPixels = var12;
         }

      }
   }
}
