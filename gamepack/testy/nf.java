import java.util.HashMap;

public class nf {
   static final int ab = 256;
   qu an;
   int[] aw;
   final HashMap af;
   int au;
   int[] ac;
   static bq aa;

   void am(tq var1, tq var2, qu var3) {
      if (0 != var3.aw * 944313703 && var3.ac * -1376251093 != 0) {
         int var4 = 0;
         int var5 = 0;
         if (0 == -844906645 * var3.af) {
            var4 = var1.an - 944313703 * var3.aw;
         }

         if (0 == 1864020389 * var3.an) {
            var5 = var1.aw - var3.ac * -1376251093;
         }

         int var6 = var1.an * var5 + var4;
         int var7 = var3.an * 1864020389 * var2.an + var3.af * -844906645;

         for(int var8 = 0; var8 < -1376251093 * var3.ac; ++var8) {
            for(int var9 = 0; var9 < var3.aw * 944313703; ++var9) {
               int[] var10000 = var2.af;
               int var10001 = var7++;
               var10000[var10001] += var1.af[var6++];
            }

            var6 += var1.an - 944313703 * var3.aw;
            var7 += var2.an - 944313703 * var3.aw;
         }

      }
   }

   void af(int var1, byte var2) {
      try {
         int var3 = 1 + 2 * var1;
         double var5 = (double)((float)var1 / 3.0F);
         int var7 = 2 * var1 + 1;
         double[] var8 = new double[var7];
         int var9 = -var1;

         for(int var10 = 0; var9 <= var1; ++var10) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            var8[var10] = ap.an((double)var9, 0.0, var5);
            ++var9;
         }

         double[] var16 = var8;
         double var17 = var8[var1] * var8[var1];
         int[] var18 = new int[var3 * var3];
         boolean var11 = false;

         for(int var12 = 0; var12 < var3; ++var12) {
            for(int var13 = 0; var13 < var3; ++var13) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               int var14 = var18[var13 + var12 * var3] = (int)(var16[var12] * var16[var13] / var17 * 256.0);
               if (!var11) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (var14 > 0) {
                     var11 = true;
                  }
               }
            }
         }

         tq var19 = new tq(var18, var3, var3);
         this.af.put(var1, var19);
      } catch (RuntimeException var15) {
         throw db.an(var15, "nf.af(" + ')');
      }
   }

   tq an(int var1, int var2) {
      try {
         if (!this.af.containsKey(var1)) {
            if (var2 == 1896581481) {
               throw new IllegalStateException();
            }

            this.af(var1, (byte)-95);
         }

         return (tq)this.af.get(var1);
      } catch (RuntimeException var3) {
         throw db.an(var3, "nf.an(" + ')');
      }
   }

   public final void aw(int var1, int var2, short var3) {
      try {
         if (this.au * -674420889 >= this.aw.length) {
            if (var3 >= 152) {
               throw new IllegalStateException();
            }
         } else {
            this.aw[-674420889 * this.au] = var1;
            this.ac[this.au * -674420889] = var2;
            this.au += 1304822871;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "nf.aw(" + ')');
      }
   }

   void ab(tq var1, tq var2, qu var3, byte var4) {
      try {
         if (0 != var3.aw * 944313703) {
            if (var4 <= 10) {
               return;
            }

            if (var3.ac * -1376251093 != 0) {
               int var5 = 0;
               int var6 = 0;
               if (0 == -844906645 * var3.af) {
                  var5 = var1.an - 944313703 * var3.aw;
               }

               if (0 == 1864020389 * var3.an) {
                  if (var4 <= 10) {
                     throw new IllegalStateException();
                  }

                  var6 = var1.aw - var3.ac * -1376251093;
               }

               int var7 = var1.an * var6 + var5;
               int var8 = var3.an * 1864020389 * var2.an + var3.af * -844906645;

               for(int var9 = 0; var9 < -1376251093 * var3.ac; ++var9) {
                  if (var4 <= 10) {
                     throw new IllegalStateException();
                  }

                  for(int var10 = 0; var10 < var3.aw * 944313703; ++var10) {
                     if (var4 <= 10) {
                        throw new IllegalStateException();
                     }

                     int[] var10000 = var2.af;
                     int var10001 = var8++;
                     var10000[var10001] += var1.af[var7++];
                  }

                  var7 += var1.an - 944313703 * var3.aw;
                  var8 += var2.an - 944313703 * var3.aw;
               }

               return;
            }

            if (var4 <= 10) {
               throw new IllegalStateException();
            }
         }

      } catch (RuntimeException var11) {
         throw db.an(var11, "nf.ab(" + ')');
      }
   }

   void al(int var1) {
      int var2 = 1 + 2 * var1;
      double var4 = (double)((float)var1 / 3.0F);
      int var6 = 2 * var1 + 1;
      double[] var7 = new double[var6];
      int var8 = -var1;

      for(int var9 = 0; var8 <= var1; ++var9) {
         var7[var9] = ap.an((double)var8, 0.0, var4);
         ++var8;
      }

      double[] var14 = var7;
      double var15 = var7[var1] * var7[var1];
      int[] var16 = new int[var2 * var2];
      boolean var10 = false;

      for(int var11 = 0; var11 < var2; ++var11) {
         for(int var12 = 0; var12 < var2; ++var12) {
            int var13 = var16[var12 + var11 * var2] = (int)(var14[var11] * var14[var12] / var15 * 256.0);
            if (!var10 && var13 > 0) {
               var10 = true;
            }
         }
      }

      tq var17 = new tq(var16, var2, var2);
      this.af.put(var1, var17);
   }

   void at(int var1) {
      int var2 = 1 + 2 * var1;
      double var4 = (double)((float)var1 / 3.0F);
      int var6 = 2 * var1 + 1;
      double[] var7 = new double[var6];
      int var8 = -var1;

      for(int var9 = 0; var8 <= var1; ++var9) {
         var7[var9] = ap.an((double)var8, 0.0, var4);
         ++var8;
      }

      double[] var14 = var7;
      double var15 = var7[var1] * var7[var1];
      int[] var16 = new int[var2 * var2];
      boolean var10 = false;

      for(int var11 = 0; var11 < var2; ++var11) {
         for(int var12 = 0; var12 < var2; ++var12) {
            int var13 = var16[var12 + var11 * var2] = (int)(var14[var11] * var14[var12] / var15 * 256.0);
            if (!var10 && var13 > 0) {
               var10 = true;
            }
         }
      }

      tq var17 = new tq(var16, var2, var2);
      this.af.put(var1, var17);
   }

   public nf() {
      try {
         super();
         this.af = new HashMap();
         this.an = new qu(0, 0);
         this.aw = new int[2048];
         this.ac = new int[2048];
         this.au = 0;
         dt.at = new int[2000];
         int var1 = 0;
         int var2 = 240;

         int var3;
         int var4;
         for(var3 = 12; var1 < 16; var2 -= var3) {
            var4 = eu.af((double)((float)var2 / 360.0F), 0.9998999834060669, (double)((float)var1 * 0.425F / 16.0F + 0.075F));
            dt.at[var1] = var4;
            ++var1;
         }

         var2 = 48;

         for(var3 = var2 / 6; var1 < dt.at.length; var2 -= var3) {
            var4 = var1 * 2;

            for(int var5 = eu.af((double)((float)var2 / 360.0F), 0.9998999834060669, 0.5); var1 < var4 && var1 < dt.at.length; ++var1) {
               dt.at[var1] = var5;
            }
         }

      } catch (RuntimeException var6) {
         throw db.an(var6, "nf.<init>(" + ')');
      }
   }

   public final void au(int var1, int var2, tq var3, float var4, int var5) {
      try {
         int var6 = (int)(18.0F * var4);
         tq var7 = this.an(var6, 1414918358);
         int var8 = 1 + 2 * var6;
         qu var9 = new qu(0, 0, var3.an, var3.aw);
         qu var10 = new qu(0, 0);
         this.an.an(var8, var8, (byte)23);
         System.nanoTime();

         int var11;
         int var12;
         int var13;
         for(var11 = 0; var11 < -674420889 * this.au; ++var11) {
            var12 = this.aw[var11];
            var13 = this.ac[var11];
            int var14 = (int)((float)(var12 - var1) * var4) - var6;
            int var15 = (int)((float)var3.aw - var4 * (float)(var13 - var2)) - var6;
            this.an.af(var14, var15, (byte)15);
            this.an.ac(var9, var10, -1323788808);
            this.ab(var7, var3, var10, (byte)75);
         }

         System.nanoTime();
         System.nanoTime();

         for(var11 = 0; var11 < var3.af.length; ++var11) {
            if (var5 >= 749939492) {
               return;
            }

            if (0 == var3.af[var11]) {
               if (var5 >= 749939492) {
                  throw new IllegalStateException();
               }

               var3.af[var11] = -16777216;
            } else {
               var12 = (var3.af[var11] + 64 - 1) / 256;
               if (var12 <= 0) {
                  if (var5 >= 749939492) {
                     throw new IllegalStateException();
                  }

                  var3.af[var11] = -16777216;
               } else {
                  if (var12 > dt.at.length) {
                     if (var5 >= 749939492) {
                        return;
                     }

                     var12 = dt.at.length;
                  }

                  var13 = dt.at[var12 - 1];
                  var3.af[var11] = -16777216 | var13;
               }
            }
         }

         System.nanoTime();
      } catch (RuntimeException var16) {
         throw db.an(var16, "nf.au(" + ')');
      }
   }

   public final void ac(int var1) {
      try {
         this.au = 0;
      } catch (RuntimeException var2) {
         throw db.an(var2, "nf.ac(" + ')');
      }
   }

   tq aa(int var1) {
      if (!this.af.containsKey(var1)) {
         this.af(var1, (byte)-42);
      }

      return (tq)this.af.get(var1);
   }

   tq ay(int var1) {
      if (!this.af.containsKey(var1)) {
         this.af(var1, (byte)-16);
      }

      return (tq)this.af.get(var1);
   }

   tq ao(int var1) {
      if (!this.af.containsKey(var1)) {
         this.af(var1, (byte)-1);
      }

      return (tq)this.af.get(var1);
   }

   public final void ax(int var1, int var2) {
      if (this.au * -488732209 < this.aw.length) {
         this.aw[-674420889 * this.au] = var1;
         this.ac[this.au * 428141091] = var2;
         this.au += -1912798808;
      }
   }

   public final void ai(int var1, int var2, tq var3, float var4) {
      int var5 = (int)(18.0F * var4);
      tq var6 = this.an(var5, 1479772202);
      int var7 = 1 + 2 * var5;
      qu var8 = new qu(0, 0, var3.an, var3.aw);
      qu var9 = new qu(0, 0);
      this.an.an(var7, var7, (byte)-24);
      System.nanoTime();

      int var10;
      int var11;
      int var12;
      for(var10 = 0; var10 < -674420889 * this.au; ++var10) {
         var11 = this.aw[var10];
         var12 = this.ac[var10];
         int var13 = (int)((float)(var11 - var1) * var4) - var5;
         int var14 = (int)((float)var3.aw - var4 * (float)(var12 - var2)) - var5;
         this.an.af(var13, var14, (byte)-14);
         this.an.ac(var8, var9, -1323788808);
         this.ab(var6, var3, var9, (byte)62);
      }

      System.nanoTime();
      System.nanoTime();

      for(var10 = 0; var10 < var3.af.length; ++var10) {
         if (0 == var3.af[var10]) {
            var3.af[var10] = -16777216;
         } else {
            var11 = (var3.af[var10] + 64 - 1) / 256;
            if (var11 <= 0) {
               var3.af[var10] = -16777216;
            } else {
               if (var11 > dt.at.length) {
                  var11 = dt.at.length;
               }

               var12 = dt.at[var11 - 1];
               var3.af[var10] = -16777216 | var12;
            }
         }
      }

      System.nanoTime();
   }

   public final void ag(int var1, int var2, tq var3, float var4) {
      int var5 = (int)(18.0F * var4);
      tq var6 = this.an(var5, 1010040485);
      int var7 = 1 + 2 * var5;
      qu var8 = new qu(0, 0, var3.an, var3.aw);
      qu var9 = new qu(0, 0);
      this.an.an(var7, var7, (byte)-14);
      System.nanoTime();

      int var10;
      int var11;
      int var12;
      for(var10 = 0; var10 < -674420889 * this.au; ++var10) {
         var11 = this.aw[var10];
         var12 = this.ac[var10];
         int var13 = (int)((float)(var11 - var1) * var4) - var5;
         int var14 = (int)((float)var3.aw - var4 * (float)(var12 - var2)) - var5;
         this.an.af(var13, var14, (byte)13);
         this.an.ac(var8, var9, -1323788808);
         this.ab(var6, var3, var9, (byte)62);
      }

      System.nanoTime();
      System.nanoTime();

      for(var10 = 0; var10 < var3.af.length; ++var10) {
         if (0 == var3.af[var10]) {
            var3.af[var10] = -16777216;
         } else {
            var11 = (var3.af[var10] + 1064462380 - 1) / 256;
            if (var11 <= 0) {
               var3.af[var10] = -1562274073;
            } else {
               if (var11 > dt.at.length) {
                  var11 = dt.at.length;
               }

               var12 = dt.at[var11 - 1];
               var3.af[var10] = -16777216 | var12;
            }
         }
      }

      System.nanoTime();
   }

   public final void ah(int var1, int var2, tq var3, float var4) {
      int var5 = (int)(18.0F * var4);
      tq var6 = this.an(var5, 421472806);
      int var7 = 1 + 2 * var5;
      qu var8 = new qu(0, 0, var3.an, var3.aw);
      qu var9 = new qu(0, 0);
      this.an.an(var7, var7, (byte)12);
      System.nanoTime();

      int var10;
      int var11;
      int var12;
      for(var10 = 0; var10 < -674420889 * this.au; ++var10) {
         var11 = this.aw[var10];
         var12 = this.ac[var10];
         int var13 = (int)((float)(var11 - var1) * var4) - var5;
         int var14 = (int)((float)var3.aw - var4 * (float)(var12 - var2)) - var5;
         this.an.af(var13, var14, (byte)-47);
         this.an.ac(var8, var9, -1323788808);
         this.ab(var6, var3, var9, (byte)67);
      }

      System.nanoTime();
      System.nanoTime();

      for(var10 = 0; var10 < var3.af.length; ++var10) {
         if (0 == var3.af[var10]) {
            var3.af[var10] = -16777216;
         } else {
            var11 = (var3.af[var10] + 64 - 1) / 256;
            if (var11 <= 0) {
               var3.af[var10] = -16777216;
            } else {
               if (var11 > dt.at.length) {
                  var11 = dt.at.length;
               }

               var12 = dt.at[var11 - 1];
               var3.af[var10] = -16777216 | var12;
            }
         }
      }

      System.nanoTime();
   }

   public final void av(int var1, int var2, tq var3, float var4) {
      int var5 = (int)(18.0F * var4);
      tq var6 = this.an(var5, -2050405019);
      int var7 = 1 + 2 * var5;
      qu var8 = new qu(0, 0, var3.an, var3.aw);
      qu var9 = new qu(0, 0);
      this.an.an(var7, var7, (byte)-2);
      System.nanoTime();

      int var10;
      int var11;
      int var12;
      for(var10 = 0; var10 < -674420889 * this.au; ++var10) {
         var11 = this.aw[var10];
         var12 = this.ac[var10];
         int var13 = (int)((float)(var11 - var1) * var4) - var5;
         int var14 = (int)((float)var3.aw - var4 * (float)(var12 - var2)) - var5;
         this.an.af(var13, var14, (byte)66);
         this.an.ac(var8, var9, -1323788808);
         this.ab(var6, var3, var9, (byte)88);
      }

      System.nanoTime();
      System.nanoTime();

      for(var10 = 0; var10 < var3.af.length; ++var10) {
         if (0 == var3.af[var10]) {
            var3.af[var10] = -16777216;
         } else {
            var11 = (var3.af[var10] + 64 - 1) / 256;
            if (var11 <= 0) {
               var3.af[var10] = -16777216;
            } else {
               if (var11 > dt.at.length) {
                  var11 = dt.at.length;
               }

               var12 = dt.at[var11 - 1];
               var3.af[var10] = -16777216 | var12;
            }
         }
      }

      System.nanoTime();
   }

   void aq(int var1) {
      int var2 = 1 + 2 * var1;
      double var4 = (double)((float)var1 / 3.0F);
      int var6 = 2 * var1 + 1;
      double[] var7 = new double[var6];
      int var8 = -var1;

      for(int var9 = 0; var8 <= var1; ++var9) {
         var7[var9] = ap.an((double)var8, 0.0, var4);
         ++var8;
      }

      double[] var14 = var7;
      double var15 = var7[var1] * var7[var1];
      int[] var16 = new int[var2 * var2];
      boolean var10 = false;

      for(int var11 = 0; var11 < var2; ++var11) {
         for(int var12 = 0; var12 < var2; ++var12) {
            int var13 = var16[var12 + var11 * var2] = (int)(var14[var11] * var14[var12] / var15 * 256.0);
            if (!var10 && var13 > 0) {
               var10 = true;
            }
         }
      }

      tq var17 = new tq(var16, var2, var2);
      this.af.put(var1, var17);
   }

   void ar(tq var1, tq var2, qu var3) {
      if (0 != var3.aw * 1806322502 && var3.ac * -1376251093 != 0) {
         int var4 = 0;
         int var5 = 0;
         if (0 == -1873479640 * var3.af) {
            var4 = var1.an - -1622415041 * var3.aw;
         }

         if (0 == 1864020389 * var3.an) {
            var5 = var1.aw - var3.ac * 483765316;
         }

         int var6 = var1.an * var5 + var4;
         int var7 = var3.an * 1864020389 * var2.an + var3.af * -844906645;

         for(int var8 = 0; var8 < 72423830 * var3.ac; ++var8) {
            for(int var9 = 0; var9 < var3.aw * 944313703; ++var9) {
               int[] var10000 = var2.af;
               int var10001 = var7++;
               var10000[var10001] += var1.af[var6++];
            }

            var6 += var1.an - 944313703 * var3.aw;
            var7 += var2.an - 944313703 * var3.aw;
         }

      }
   }

   void as(tq var1, tq var2, qu var3) {
      if (0 != var3.aw * 944313703 && var3.ac * -1376251093 != 0) {
         int var4 = 0;
         int var5 = 0;
         if (0 == 187523718 * var3.af) {
            var4 = var1.an - -1421582077 * var3.aw;
         }

         if (0 == -191287717 * var3.an) {
            var5 = var1.aw - var3.ac * -953831622;
         }

         int var6 = var1.an * var5 + var4;
         int var7 = var3.an * 1864020389 * var2.an + var3.af * -844906645;

         for(int var8 = 0; var8 < -1376251093 * var3.ac; ++var8) {
            for(int var9 = 0; var9 < var3.aw * 944313703; ++var9) {
               int[] var10000 = var2.af;
               int var10001 = var7++;
               var10000[var10001] += var1.af[var6++];
            }

            var6 += var1.an - 324403335 * var3.aw;
            var7 += var2.an - 944313703 * var3.aw;
         }

      }
   }

   public static hw an(int var0, int var1) {
      try {
         return var0 >= 0 && var0 < hw.an.length && hw.an[var0] != null ? hw.an[var0] : new hw(var0);
      } catch (RuntimeException var2) {
         throw db.an(var2, "nf.an(" + ')');
      }
   }
}
