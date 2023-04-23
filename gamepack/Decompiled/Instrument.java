import java.util.Random;

public class Instrument {
   static int[] ad;
   static int[] ae;
   static int[] ak;
   static int[] am = new int['耀'];
   static int[] ap;
   static int[] ar;
   static int[] as;
   static int[] az;
   SoundEnvelope ab;
   SoundEnvelope ac;
   SoundEnvelope af;
   SoundEnvelope ag;
   SoundEnvelope al;
   SoundEnvelope an;
   SoundEnvelope aq;
   SoundEnvelope au;
   SoundEnvelope aw;
   AudioFilter ai;
   int ah = 500;
   int ao = 0;
   int av = 0;
   int ax = 100;
   int[] aa = new int[]{0, 0, 0, 0, 0};
   int[] at = new int[]{0, 0, 0, 0, 0};
   int[] ay = new int[]{0, 0, 0, 0, 0};

   static {
      Random var0 = new Random(0L);

      int var1;
      for(var1 = 0; var1 < 32768; ++var1) {
         am[var1] = (var0.nextInt() & 2) - 1;
      }

      as = new int['耀'];

      for(var1 = 0; var1 < 32768; ++var1) {
         as[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
      }

      ar = new int[220500];
      ak = new int[5];
      az = new int[5];
      ad = new int[5];
      ae = new int[5];
      ap = new int[5];
   }

   Instrument() {
   }

   final int[] synthesize(int var1, int var2) {
      op.clearIntArray(ar, 0, var1);
      if (var2 < 10) {
         return ar;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0);
         this.af.reset();
         this.an.reset();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.aw != null) {
            this.aw.reset();
            this.ac.reset();
            var5 = (int)((double)(this.aw.au - this.aw.ac) * 32.768 / var3);
            var6 = (int)((double)this.aw.ac * 32.768 / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.au != null) {
            this.au.reset();
            this.ab.reset();
            var8 = (int)((double)(this.au.au - this.au.ac) * 32.768 / var3);
            var9 = (int)((double)this.au.ac * 32.768 / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if (this.at[var11] != 0) {
               ak[var11] = 0;
               az[var11] = (int)((double)this.ay[var11] * var3);
               ad[var11] = (this.at[var11] << 14) / 100;
               ae[var11] = (int)((double)(this.af.au - this.af.ac) * 32.768 * Math.pow(1.0057929410678534, (double)this.aa[var11]) / var3);
               ap[var11] = (int)((double)this.af.ac * 32.768 / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         int[] var10000;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.af.doStep(var1);
            var13 = this.an.doStep(var1);
            if (this.aw != null) {
               var14 = this.aw.doStep(var1);
               var15 = this.ac.doStep(var1);
               var12 += this.evaluateWave(var7, var15, this.aw.ab) >> 1;
               var7 += (var14 * var5 >> 16) + var6;
            }

            if (this.au != null) {
               var14 = this.au.doStep(var1);
               var15 = this.ab.doStep(var1);
               var13 = var13 * ((this.evaluateWave(var10, var15, this.au.ab) >> 1) + '耀') >> 15;
               var10 += (var14 * var8 >> 16) + var9;
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if (this.at[var14] != 0) {
                  var15 = var11 + az[var14];
                  if (var15 < var1) {
                     var10000 = ar;
                     var10000[var15] += this.evaluateWave(ak[var14], var13 * ad[var14] >> 15, this.af.ab);
                     var10000 = ak;
                     var10000[var14] += (var12 * ae[var14] >> 16) + ap[var14];
                  }
               }
            }
         }

         int var16;
         if (this.aq != null) {
            this.aq.reset();
            this.al.reset();
            var11 = 0;
            boolean var22 = false;
            boolean var23 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.aq.doStep(var1);
               var16 = this.al.doStep(var1);
               if (var23) {
                  var12 = this.aq.ac + ((this.aq.au - this.aq.ac) * var15 >> 8);
               } else {
                  var12 = this.aq.ac + ((this.aq.au - this.aq.ac) * var16 >> 8);
               }

               var11 += 256;
               if (var11 >= var12) {
                  var11 = 0;
                  var23 = !var23;
               }

               if (var23) {
                  ar[var14] = 0;
               }
            }
         }

         if (this.ao > 0 && this.ax > 0) {
            var11 = (int)((double)this.ao * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               var10000 = ar;
               var10000[var12] += ar[var12 - var11] * this.ax / 100;
            }
         }

         if (this.ai.af[0] > 0 || this.ai.af[1] > 0) {
            this.ag.reset();
            var11 = this.ag.doStep(var1 + 1);
            var12 = this.ai.ac(0, (float)var11 / 65536.0F);
            var13 = this.ai.ac(1, (float)var11 / 65536.0F);
            if (var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if (var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)ar[var14 + var12] * (long)AudioFilter.at >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)ar[var14 + var12 - 1 - var17] * (long)AudioFilter.aq[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)ar[var14 - 1 - var17] * (long)AudioFilter.aq[1][var17] >> 16);
                  }

                  ar[var14] = var16;
                  var11 = this.ag.doStep(var1 + 1);
                  ++var14;
               }

               boolean var24 = true;
               var15 = 128;

               while(true) {
                  if (var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  int var18;
                  while(var14 < var15) {
                     var17 = (int)((long)ar[var14 + var12] * (long)AudioFilter.at >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)ar[var14 + var12 - 1 - var18] * (long)AudioFilter.aq[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)ar[var14 - 1 - var18] * (long)AudioFilter.aq[1][var18] >> 16);
                     }

                     ar[var14] = var17;
                     var11 = this.ag.doStep(var1 + 1);
                     ++var14;
                  }

                  if (var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)ar[var14 + var12 - 1 - var18] * (long)AudioFilter.aq[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)ar[var14 - 1 - var18] * (long)AudioFilter.aq[1][var18] >> 16);
                        }

                        ar[var14] = var17;
                        this.ag.doStep(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.ai.ac(0, (float)var11 / 65536.0F);
                  var13 = this.ai.ac(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if (ar[var11] < -32768) {
               ar[var11] = -32768;
            }

            if (ar[var11] > 32767) {
               ar[var11] = 32767;
            }
         }

         return ar;
      }
   }

   final int evaluateWave(int var1, int var2, int var3) {
      if (var3 == 1) {
         return (var1 & 32767) < 16384 ? var2 : -var2;
      } else if (var3 == 2) {
         return as[var1 & 32767] * var2 >> 14;
      } else if (var3 == 3) {
         return ((var1 & 32767) * var2 >> 14) - var2;
      } else {
         return var3 == 4 ? am[var1 / 2607 & 32767] * var2 : 0;
      }
   }

   final void decode(Packet var1) {
      this.af = new SoundEnvelope();
      this.af.decode(var1);
      this.an = new SoundEnvelope();
      this.an.decode(var1);
      int var2 = var1.g1();
      if (var2 != 0) {
         var1.at -= -1516355947;
         this.aw = new SoundEnvelope();
         this.aw.decode(var1);
         this.ac = new SoundEnvelope();
         this.ac.decode(var1);
      }

      var2 = var1.g1();
      if (var2 != 0) {
         var1.at -= -1516355947;
         this.au = new SoundEnvelope();
         this.au.decode(var1);
         this.ab = new SoundEnvelope();
         this.ab.decode(var1);
      }

      var2 = var1.g1();
      if (var2 != 0) {
         var1.at -= -1516355947;
         this.aq = new SoundEnvelope();
         this.aq.decode(var1);
         this.al = new SoundEnvelope();
         this.al.decode(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.cd();
         if (var4 == 0) {
            break;
         }

         this.at[var3] = var4;
         this.aa[var3] = var1.gSmart1or2s();
         this.ay[var3] = var1.cd();
      }

      this.ao = var1.cd();
      this.ax = var1.cd();
      this.ah = var1.cl();
      this.av = var1.cl();
      this.ai = new AudioFilter();
      this.ag = new SoundEnvelope();
      this.ai.au(var1, this.ag);
   }
}
