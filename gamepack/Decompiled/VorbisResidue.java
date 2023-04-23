public class VorbisResidue {
   int classbook = VorbisSample.VorbisSample_readBits(8);
   int partitionSize = VorbisSample.VorbisSample_readBits(24) + 1;
   int type = VorbisSample.VorbisSample_readBits(16);
   int begin = VorbisSample.VorbisSample_readBits(24);
   int classifications = VorbisSample.VorbisSample_readBits(6) + 1;
   int end = VorbisSample.VorbisSample_readBits(24);
   int[] cascade;

   VorbisResidue() {
      int[] var1 = new int[this.classifications];

      int var2;
      for(var2 = 0; var2 < this.classifications; ++var2) {
         int var3 = 0;
         int var4 = VorbisSample.VorbisSample_readBits(3);
         boolean var5 = VorbisSample.VorbisSample_readBit() != 0;
         if (var5) {
            var3 = VorbisSample.VorbisSample_readBits(5);
         }

         var1[var2] = var3 << 3 | var4;
      }

      this.cascade = new int[this.classifications * 8];

      for(var2 = 0; var2 < this.classifications * 8; ++var2) {
         this.cascade[var2] = (var1[var2 >> 3] & 1 << (var2 & 7)) != 0 ? VorbisSample.VorbisSample_readBits(8) : -1;
      }

   }

   void af(float[] var1, int var2, boolean var3) {
      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var1[var4] = 0.0F;
      }

      if (!var3) {
         var4 = VorbisSample.VorbisSample_codebooks[this.classbook].dimensions;
         int var5 = this.end - this.begin;
         int var6 = var5 / this.partitionSize;
         int[] var7 = new int[var6];

         for(int var8 = 0; var8 < 8; ++var8) {
            int var9 = 0;

            while(var9 < var6) {
               int var10;
               int var11;
               if (var8 == 0) {
                  var10 = VorbisSample.VorbisSample_codebooks[this.classbook].aw();

                  for(var11 = var4 - 1; var11 >= 0; --var11) {
                     if (var9 + var11 < var6) {
                        var7[var9 + var11] = var10 % this.classifications;
                     }

                     var10 /= this.classifications;
                  }
               }

               for(var10 = 0; var10 < var4; ++var10) {
                  var11 = var7[var9];
                  int var12 = this.cascade[var11 * 8 + var8];
                  if (var12 >= 0) {
                     int var13 = this.begin + var9 * this.partitionSize;
                     VorbisCodebook var14 = VorbisSample.VorbisSample_codebooks[var12];
                     int var15;
                     if (this.type == 0) {
                        var15 = this.partitionSize / var14.dimensions;

                        for(int var22 = 0; var22 < var15; ++var22) {
                           float[] var23 = var14.ac();

                           for(int var18 = 0; var18 < var14.dimensions; ++var18) {
                              var1[var13 + var22 + var18 * var15] += var23[var18];
                           }
                        }
                     } else {
                        var15 = 0;

                        while(var15 < this.partitionSize) {
                           float[] var16 = var14.ac();

                           for(int var17 = 0; var17 < var14.dimensions; ++var17) {
                              var1[var13 + var15] += var16[var17];
                              ++var15;
                           }
                        }
                     }
                  }

                  ++var9;
                  if (var9 >= var6) {
                     break;
                  }
               }
            }
         }

      }
   }
}
