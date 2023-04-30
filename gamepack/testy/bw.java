import accessors.RSVorbisCodebook;

public class bw implements RSVorbisCodebook {
   int[] aw;
   int af;
   float[][] au;
   int[] ac;
   int an;
   int[] ab;

   int aw() {
      int var1;
      for(var1 = 0; this.ab[var1] >= 0; var1 = ce.aw() != 0 ? this.ab[var1] : var1 + 1) {
      }

      return ~this.ab[var1];
   }

   bw() {
      ce.ac(24);
      this.af = ce.ac(16);
      this.an = ce.ac(24);
      this.aw = new int[this.an];
      boolean var1 = ce.aw() != 0;
      int var2;
      int var3;
      int var5;
      if (var1) {
         var2 = 0;

         for(var3 = ce.ac(5) + 1; var2 < this.an; ++var3) {
            int var4 = ce.ac(lf.aq(this.an - var2, -1603575130));

            for(var5 = 0; var5 < var4; ++var5) {
               this.aw[var2++] = var3;
            }
         }
      } else {
         boolean var14 = ce.aw() != 0;

         for(var3 = 0; var3 < this.an; ++var3) {
            if (var14 && ce.aw() == 0) {
               this.aw[var3] = 0;
            } else {
               this.aw[var3] = ce.ac(5) + 1;
            }
         }
      }

      this.an();
      var2 = ce.ac(4);
      if (var2 > 0) {
         float var15 = ce.af(ce.ac(32));
         float var16 = ce.af(ce.ac(32));
         var5 = ce.ac(4) + 1;
         boolean var6 = ce.aw() != 0;
         int var7;
         if (var2 == 1) {
            var7 = af(this.an, this.af);
         } else {
            var7 = this.an * this.af;
         }

         this.ac = new int[var7];

         int var8;
         for(var8 = 0; var8 < var7; ++var8) {
            this.ac[var8] = ce.ac(var5);
         }

         this.au = new float[this.an][this.af];
         float var9;
         int var10;
         int var11;
         if (var2 == 1) {
            for(var8 = 0; var8 < this.an; ++var8) {
               var9 = 0.0F;
               var10 = 1;

               for(var11 = 0; var11 < this.af; ++var11) {
                  int var12 = var8 / var10 % var7;
                  float var13 = (float)this.ac[var12] * var16 + var15 + var9;
                  this.au[var8][var11] = var13;
                  if (var6) {
                     var9 = var13;
                  }

                  var10 *= var7;
               }
            }
         } else {
            for(var8 = 0; var8 < this.an; ++var8) {
               var9 = 0.0F;
               var10 = var8 * this.af;

               for(var11 = 0; var11 < this.af; ++var11) {
                  float var17 = (float)this.ac[var10] * var16 + var15 + var9;
                  this.au[var8][var11] = var17;
                  if (var6) {
                     var9 = var17;
                  }

                  ++var10;
               }
            }
         }
      }

   }

   void an() {
      int[] var1 = new int[this.an];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var10;
      for(var3 = 0; var3 < this.an; ++var3) {
         var4 = this.aw[var3];
         if (var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            int var9;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var9 = var2[var8];
                  if (var9 != var6) {
                     break;
                  }

                  var10 = 1 << 32 - var8;
                  if ((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= 32; ++var8) {
               var9 = var2[var8];
               if (var9 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.ab = new int[8];
      int var11 = 0;

      for(var3 = 0; var3 < this.an; ++var3) {
         var4 = this.aw[var3];
         if (var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = Integer.MIN_VALUE >>> var7;
               if ((var5 & var8) != 0) {
                  if (this.ab[var6] == 0) {
                     this.ab[var6] = var11;
                  }

                  var6 = this.ab[var6];
               } else {
                  ++var6;
               }

               if (var6 >= this.ab.length) {
                  int[] var12 = new int[this.ab.length * 2];

                  for(var10 = 0; var10 < this.ab.length; ++var10) {
                     var12[var10] = this.ab[var10];
                  }

                  this.ab = var12;
               }

               var8 >>>= 1;
            }

            this.ab[var6] = ~var3;
            if (var6 >= var11) {
               var11 = var6 + 1;
            }
         }
      }

   }

   float[] ao() {
      return this.au[this.aw()];
   }

   float[] ac() {
      return this.au[this.aw()];
   }

   static int au(int var0, int var1) {
      int var2;
      for(var2 = (int)Math.pow((double)var0, 1.0 / (double)var1) + 1; ch.af(var2, var1, -1816092383) > var0; --var2) {
      }

      return var2;
   }

   void ab() {
      int[] var1 = new int[this.an];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var10;
      for(var3 = 0; var3 < this.an; ++var3) {
         var4 = this.aw[var3];
         if (var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            int var9;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var9 = var2[var8];
                  if (var9 != var6) {
                     break;
                  }

                  var10 = 1 << 32 - var8;
                  if ((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= 32; ++var8) {
               var9 = var2[var8];
               if (var9 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.ab = new int[8];
      int var11 = 0;

      for(var3 = 0; var3 < this.an; ++var3) {
         var4 = this.aw[var3];
         if (var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = Integer.MIN_VALUE >>> var7;
               if ((var5 & var8) != 0) {
                  if (this.ab[var6] == 0) {
                     this.ab[var6] = var11;
                  }

                  var6 = this.ab[var6];
               } else {
                  ++var6;
               }

               if (var6 >= this.ab.length) {
                  int[] var12 = new int[this.ab.length * 2];

                  for(var10 = 0; var10 < this.ab.length; ++var10) {
                     var12[var10] = this.ab[var10];
                  }

                  this.ab = var12;
               }

               var8 >>>= 1;
            }

            this.ab[var6] = ~var3;
            if (var6 >= var11) {
               var11 = var6 + 1;
            }
         }
      }

   }

   int al() {
      int var1;
      for(var1 = 0; this.ab[var1] >= 0; var1 = ce.aw() != 0 ? this.ab[var1] : var1 + 1) {
      }

      return ~this.ab[var1];
   }

   static int af(int var0, int var1) {
      int var2;
      for(var2 = (int)Math.pow((double)var0, 1.0 / (double)var1) + 1; ch.af(var2, var1, -2065195027) > var0; --var2) {
      }

      return var2;
   }

   int at() {
      int var1;
      for(var1 = 0; this.ab[var1] >= 0; var1 = ce.aw() != 0 ? this.ab[var1] : var1 + 1) {
      }

      return ~this.ab[var1];
   }

   int aq() {
      int var1;
      for(var1 = 0; this.ab[var1] >= 0; var1 = ce.aw() != 0 ? this.ab[var1] : var1 + 1) {
      }

      return ~this.ab[var1];
   }

   float[] ay() {
      return this.au[this.aw()];
   }

   float[] aa() {
      return this.au[this.aw()];
   }
}
