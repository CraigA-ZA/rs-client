public class AudioFilter {
   static float al;
   static float[][] ab = new float[2][8];
   static int at;
   static int[][] aq = new int[2][8];
   int[] af = new int[2];
   int[] au = new int[2];
   int[][][] ac = new int[2][2][4];
   int[][][] aw = new int[2][2][4];

   AudioFilter() {
   }

   float af(int var1, int var2, float var3) {
      float var4 = (float)this.ac[var1][0][var2] + var3 * (float)(this.ac[var1][1][var2] - this.ac[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0, (double)(-var4 / 20.0F));
   }

   static float an(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }

   float aw(int var1, int var2, float var3) {
      float var4 = (float)this.aw[var1][0][var2] + var3 * (float)(this.aw[var1][1][var2] - this.aw[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return an(var4);
   }

   int ac(int var1, float var2) {
      float var3;
      if (var1 == 0) {
         var3 = (float)this.au[0] + (float)(this.au[1] - this.au[0]) * var2;
         var3 *= 0.0030517578F;
         al = (float)Math.pow(0.1, (double)(var3 / 20.0F));
         at = (int)(al * 65536.0F);
      }

      if (this.af[var1] == 0) {
         return 0;
      } else {
         var3 = this.af(var1, 0, var2);
         ab[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.aw(var1, 0, var2));
         ab[var1][1] = var3 * var3;

         float[] var10000;
         int var4;
         for(var4 = 1; var4 < this.af[var1]; ++var4) {
            var3 = this.af(var1, var4, var2);
            float var5 = -2.0F * var3 * (float)Math.cos((double)this.aw(var1, var4, var2));
            float var6 = var3 * var3;
            ab[var1][var4 * 2 + 1] = ab[var1][var4 * 2 - 1] * var6;
            ab[var1][var4 * 2] = ab[var1][var4 * 2 - 1] * var5 + ab[var1][var4 * 2 - 2] * var6;

            for(int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
               var10000 = ab[var1];
               var10000[var7] += ab[var1][var7 - 1] * var5 + ab[var1][var7 - 2] * var6;
            }

            var10000 = ab[var1];
            var10000[1] += ab[var1][0] * var5 + var6;
            var10000 = ab[var1];
            var10000[0] += var5;
         }

         if (var1 == 0) {
            for(var4 = 0; var4 < this.af[0] * 2; ++var4) {
               var10000 = ab[0];
               var10000[var4] *= al;
            }
         }

         for(var4 = 0; var4 < this.af[var1] * 2; ++var4) {
            aq[var1][var4] = (int)(ab[var1][var4] * 65536.0F);
         }

         return this.af[var1] * 2;
      }
   }

   final void au(Packet var1, SoundEnvelope var2) {
      int var3 = var1.g1();
      this.af[0] = var3 >> 4;
      this.af[1] = var3 & 15;
      if (var3 != 0) {
         this.au[0] = var1.cl();
         this.au[1] = var1.cl();
         int var4 = var1.g1();

         int var5;
         int var6;
         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.af[var5]; ++var6) {
               this.aw[var5][0][var6] = var1.cl();
               this.ac[var5][0][var6] = var1.cl();
            }
         }

         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.af[var5]; ++var6) {
               if ((var4 & 1 << var5 * 4 << var6) != 0) {
                  this.aw[var5][1][var6] = var1.cl();
                  this.ac[var5][1][var6] = var1.cl();
               } else {
                  this.aw[var5][1][var6] = this.aw[var5][0][var6];
                  this.ac[var5][1][var6] = this.ac[var5][0][var6];
               }
            }
         }

         if (var4 != 0 || this.au[1] != this.au[0]) {
            var2.decodeSegments(var1);
         }
      } else {
         int[] var13 = this.au;
         this.au[1] = 0;
         var13[0] = 0;
      }

   }
}
