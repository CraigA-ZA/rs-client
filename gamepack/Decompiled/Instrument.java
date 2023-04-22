import java.util.Random;

public class Instrument {
   int[] oscillatorVolume = new int[]{0, 0, 0, 0, 0};
   SoundEnvelope an;
   SoundEnvelope aw;
   SoundEnvelope ac;
   SoundEnvelope au;
   SoundEnvelope ab;
   SoundEnvelope aq;
   SoundEnvelope al;
   int duration = 500;
   int[] oscillatorPitch = new int[]{0, 0, 0, 0, 0};
   int offset = 0;
   int delayTime = 0;
   int delayDecay = 100;
   static int[] Instrument_pitchSteps;
   static int[] Instrument_samples;
   static int[] Instrument_noise = new int['耀'];
   int[] oscillatorDelays = new int[]{0, 0, 0, 0, 0};
   SoundEnvelope ag;
   SoundEnvelope af;
   static int[] Instrument_sine;
   AudioFilter filter;
   static int[] Instrument_delays;
   static int[] Instrument_volumeSteps;
   static int[] Instrument_phases;
   static int[] Instrument_pitchBaseSteps;

   final int[] synthesize(int var1, int var2) {
      op.clearIntArray(Instrument_samples, 0, var1);
      if (var2 < 10) {
         return Instrument_samples;
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
            var5 = (int)((double)(this.aw.end - this.aw.start) * 32.768 / var3);
            var6 = (int)((double)this.aw.start * 32.768 / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.au != null) {
            this.au.reset();
            this.ab.reset();
            var8 = (int)((double)(this.au.end - this.au.start) * 32.768 / var3);
            var9 = (int)((double)this.au.start * 32.768 / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if (this.oscillatorVolume[var11] != 0) {
               Instrument_phases[var11] = 0;
               Instrument_delays[var11] = (int)((double)this.oscillatorDelays[var11] * var3);
               Instrument_volumeSteps[var11] = (this.oscillatorVolume[var11] << 14) / 100;
               Instrument_pitchSteps[var11] = (int)((double)(this.af.end - this.af.start) * 32.768 * Math.pow(1.0057929410678534, (double)this.oscillatorPitch[var11]) / var3);
               Instrument_pitchBaseSteps[var11] = (int)((double)this.af.start * 32.768 / var3);
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
               var12 += this.evaluateWave(var7, var15, this.aw.form) >> 1;
               var7 += (var14 * var5 >> 16) + var6;
            }

            if (this.au != null) {
               var14 = this.au.doStep(var1);
               var15 = this.ab.doStep(var1);
               var13 = var13 * ((this.evaluateWave(var10, var15, this.au.form) >> 1) + '耀') >> 15;
               var10 += (var14 * var8 >> 16) + var9;
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if (this.oscillatorVolume[var14] != 0) {
                  var15 = var11 + Instrument_delays[var14];
                  if (var15 < var1) {
                     var10000 = Instrument_samples;
                     var10000[var15] += this.evaluateWave(Instrument_phases[var14], var13 * Instrument_volumeSteps[var14] >> 15, this.af.form);
                     var10000 = Instrument_phases;
                     var10000[var14] += (var12 * Instrument_pitchSteps[var14] >> 16) + Instrument_pitchBaseSteps[var14];
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
                  var12 = this.aq.start + ((this.aq.end - this.aq.start) * var15 >> 8);
               } else {
                  var12 = this.aq.start + ((this.aq.end - this.aq.start) * var16 >> 8);
               }

               var11 += 256;
               if (var11 >= var12) {
                  var11 = 0;
                  var23 = !var23;
               }

               if (var23) {
                  Instrument_samples[var14] = 0;
               }
            }
         }

         if (this.delayTime > 0 && this.delayDecay > 0) {
            var11 = (int)((double)this.delayTime * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               var10000 = Instrument_samples;
               var10000[var12] += Instrument_samples[var12 - var11] * this.delayDecay / 100;
            }
         }

         if (this.filter.af[0] > 0 || this.filter.af[1] > 0) {
            this.ag.reset();
            var11 = this.ag.doStep(var1 + 1);
            var12 = this.filter.ac(0, (float)var11 / 65536.0F);
            var13 = this.filter.ac(1, (float)var11 / 65536.0F);
            if (var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if (var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)Instrument_samples[var14 + var12] * (long)AudioFilter.at >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)Instrument_samples[var14 + var12 - 1 - var17] * (long)AudioFilter.aq[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)Instrument_samples[var14 - 1 - var17] * (long)AudioFilter.aq[1][var17] >> 16);
                  }

                  Instrument_samples[var14] = var16;
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
                     var17 = (int)((long)Instrument_samples[var14 + var12] * (long)AudioFilter.at >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)Instrument_samples[var14 + var12 - 1 - var18] * (long)AudioFilter.aq[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)Instrument_samples[var14 - 1 - var18] * (long)AudioFilter.aq[1][var18] >> 16);
                     }

                     Instrument_samples[var14] = var17;
                     var11 = this.ag.doStep(var1 + 1);
                     ++var14;
                  }

                  if (var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)Instrument_samples[var14 + var12 - 1 - var18] * (long)AudioFilter.aq[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)Instrument_samples[var14 - 1 - var18] * (long)AudioFilter.aq[1][var18] >> 16);
                        }

                        Instrument_samples[var14] = var17;
                        this.ag.doStep(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.filter.ac(0, (float)var11 / 65536.0F);
                  var13 = this.filter.ac(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if (Instrument_samples[var11] < -32768) {
               Instrument_samples[var11] = -32768;
            }

            if (Instrument_samples[var11] > 32767) {
               Instrument_samples[var11] = 32767;
            }
         }

         return Instrument_samples;
      }
   }

   final int evaluateWave(int var1, int var2, int var3) {
      if (var3 == 1) {
         return (var1 & 32767) < 16384 ? var2 : -var2;
      } else if (var3 == 2) {
         return Instrument_sine[var1 & 32767] * var2 >> 14;
      } else if (var3 == 3) {
         return ((var1 & 32767) * var2 >> 14) - var2;
      } else {
         return var3 == 4 ? Instrument_noise[var1 / 2607 & 32767] * var2 : 0;
      }
   }

   Instrument() {
   }

   static {
      Random var0 = new Random(0L);

      int var1;
      for(var1 = 0; var1 < 32768; ++var1) {
         Instrument_noise[var1] = (var0.nextInt() & 2) - 1;
      }

      Instrument_sine = new int['耀'];

      for(var1 = 0; var1 < 32768; ++var1) {
         Instrument_sine[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
      }

      Instrument_samples = new int[220500];
      Instrument_phases = new int[5];
      Instrument_delays = new int[5];
      Instrument_volumeSteps = new int[5];
      Instrument_pitchSteps = new int[5];
      Instrument_pitchBaseSteps = new int[5];
   }

   final void decode(Packet var1) {
      this.af = new SoundEnvelope();
      this.af.decode(var1);
      this.an = new SoundEnvelope();
      this.an.decode(var1);
      int var2 = var1.g1();
      if (var2 != 0) {
         var1.index -= -1516355947;
         this.aw = new SoundEnvelope();
         this.aw.decode(var1);
         this.ac = new SoundEnvelope();
         this.ac.decode(var1);
      }

      var2 = var1.g1();
      if (var2 != 0) {
         var1.index -= -1516355947;
         this.au = new SoundEnvelope();
         this.au.decode(var1);
         this.ab = new SoundEnvelope();
         this.ab.decode(var1);
      }

      var2 = var1.g1();
      if (var2 != 0) {
         var1.index -= -1516355947;
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

         this.oscillatorVolume[var3] = var4;
         this.oscillatorPitch[var3] = var1.gSmart1or2s();
         this.oscillatorDelays[var3] = var1.cd();
      }

      this.delayTime = var1.cd();
      this.delayDecay = var1.cd();
      this.duration = var1.cl();
      this.offset = var1.cl();
      this.filter = new AudioFilter();
      this.ag = new SoundEnvelope();
      this.filter.au(var1, this.ag);
   }
}
