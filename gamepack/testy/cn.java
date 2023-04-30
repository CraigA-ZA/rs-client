import accessors.RSAudioFilter;

public class cn implements RSAudioFilter {
   int[][][] aw = new int[2][2][4];
   static final int an = 4;
   static float[][] ab = new float[2][8];
   int[][][] ac = new int[2][2][4];
   int[] au = new int[2];
   static final float ao = 32.703197F;
   int[] af = new int[2];
   static float al;
   static int at;
   static final float aa = 100.0F;
   static final float ay = 8.0F;
   static int[][] aq = new int[2][8];

   final void au(sg var1, bf var2) {
      int var3 = var1.cm((byte)7);
      this.af[0] = var3 >> 4;
      this.af[1] = var3 & 15;
      if (var3 != 0) {
         this.au[0] = var1.cl(162386428);
         this.au[1] = var1.cl(-1797054800);
         int var4 = var1.cm((byte)7);

         int var5;
         int var6;
         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.af[var5]; ++var6) {
               this.aw[var5][0][var6] = var1.cl(196506299);
               this.ac[var5][0][var6] = var1.cl(226731756);
            }
         }

         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.af[var5]; ++var6) {
               if ((var4 & 1 << var5 * 4 << var6) != 0) {
                  this.aw[var5][1][var6] = var1.cl(-2081876528);
                  this.ac[var5][1][var6] = var1.cl(-1859123041);
               } else {
                  this.aw[var5][1][var6] = this.aw[var5][0][var6];
                  this.ac[var5][1][var6] = this.ac[var5][0][var6];
               }
            }
         }

         if (var4 != 0 || this.au[1] != this.au[0]) {
            var2.an(var1);
         }
      } else {
         int[] var7 = this.au;
         this.au[1] = 0;
         var7[0] = 0;
      }

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

   float ag(int var1, int var2, float var3) {
      float var4 = (float)this.aw[var1][0][var2] + var3 * (float)(this.aw[var1][1][var2] - this.aw[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return an(var4);
   }

   float ao(int var1, int var2, float var3) {
      float var4 = (float)this.aw[var1][0][var2] + var3 * (float)(this.aw[var1][1][var2] - this.aw[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return an(var4);
   }

   float ab(int var1, int var2, float var3) {
      float var4 = (float)this.ac[var1][0][var2] + var3 * (float)(this.ac[var1][1][var2] - this.ac[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0, (double)(-var4 / 20.0F));
   }

   cn() {
   }

   float al(int var1, int var2, float var3) {
      float var4 = (float)this.ac[var1][0][var2] + var3 * (float)(this.ac[var1][1][var2] - this.ac[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0, (double)(-var4 / 20.0F));
   }

   float aq(int var1, int var2, float var3) {
      float var4 = (float)this.ac[var1][0][var2] + var3 * (float)(this.ac[var1][1][var2] - this.ac[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0, (double)(-var4 / 20.0F));
   }

   static float aa(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }

   static float ay(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }

   int av(int var1, float var2) {
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

   float ax(int var1, int var2, float var3) {
      float var4 = (float)this.aw[var1][0][var2] + var3 * (float)(this.aw[var1][1][var2] - this.aw[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return an(var4);
   }

   float ai(int var1, int var2, float var3) {
      float var4 = (float)this.aw[var1][0][var2] + var3 * (float)(this.aw[var1][1][var2] - this.aw[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return an(var4);
   }

   float at(int var1, int var2, float var3) {
      float var4 = (float)this.ac[var1][0][var2] + var3 * (float)(this.ac[var1][1][var2] - this.ac[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0, (double)(-var4 / 20.0F));
   }

   int ah(int var1, float var2) {
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

   final void ar(sg var1, bf var2) {
      int var3 = var1.cm((byte)7);
      this.af[0] = var3 >> 4;
      this.af[1] = var3 & 15;
      if (var3 != 0) {
         this.au[0] = var1.cl(-69349981);
         this.au[1] = var1.cl(797812762);
         int var4 = var1.cm((byte)7);

         int var5;
         int var6;
         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.af[var5]; ++var6) {
               this.aw[var5][0][var6] = var1.cl(-158863507);
               this.ac[var5][0][var6] = var1.cl(701991103);
            }
         }

         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.af[var5]; ++var6) {
               if ((var4 & 1 << var5 * 4 << var6) != 0) {
                  this.aw[var5][1][var6] = var1.cl(167827019);
                  this.ac[var5][1][var6] = var1.cl(-1618854197);
               } else {
                  this.aw[var5][1][var6] = this.aw[var5][0][var6];
                  this.ac[var5][1][var6] = this.ac[var5][0][var6];
               }
            }
         }

         if (var4 != 0 || this.au[1] != this.au[0]) {
            var2.an(var1);
         }
      } else {
         int[] var7 = this.au;
         this.au[1] = 0;
         var7[0] = 0;
      }

   }
}
