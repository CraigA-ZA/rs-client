public class ParamType extends DualNode {
   static EvictingDualNodeHashTable ParamType_cached = new EvictingDualNodeHashTable(64);
   static AbstractArchive af;
   static Sprite aa;
   boolean autodisable = true;
   char type;
   public int defaultint;
   public String defaultstr;

   ParamType() {
   }

   public static boolean af_renamed(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, MidiPcmStream var3) {
      ly.af = var0;
      ly.an = var1;
      ly.aw = var2;
      sa.midiPcmStream = var3;
      return true;
   }

   void postDecode() {
   }

   void decode(Packet var1) {
      while(true) {
         int var3 = var1.g1();
         if (var3 == 0) {
            return;
         }

         this.decode0(var1, var3);
      }
   }

   void decode0(Packet var1, int var2) {
      if (1 == var2) {
         byte var5 = var1.g1s();
         int var6 = var5 & 255;
         if (0 == var6) {
            throw new IllegalArgumentException("" + Integer.toString(var6, 16));
         }

         if (var6 >= 128 && var6 < 160) {
            char var7 = od.af[var6 - 128];
            if (var7 == 0) {
               var7 = '?';
            }

            var6 = var7;
         }

         char var4 = (char)var6;
         this.type = var4;
      } else if (var2 == 2) {
         this.defaultint = var1.g4s() * 1057254681;
      } else if (var2 == 4) {
         this.autodisable = false;
      } else if (var2 == 5) {
         this.defaultstr = var1.cw();
      }

   }

   public boolean isString() {
      return this.type == 's';
   }

   static void ac_renamed(ek var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (var0 != null) {
         float var10 = var4 - var1;
         if (0.0 != (double)var10) {
            float var11 = var2 - var1;
            float var12 = var3 - var1;
            float[] var13 = new float[]{var11 / var10, var12 / var10};
            var0.ab = var13[0] == 0.33333334F && 0.6666667F == var13[1];
            float var14 = var13[0];
            float var15 = var13[1];
            if ((double)var13[0] < 0.0) {
               var13[0] = 0.0F;
            }

            if ((double)var13[1] > 1.0) {
               var13[1] = 1.0F;
            }

            float var16;
            if ((double)var13[0] > 1.0 || var13[1] < -1.0F) {
               var13[1] = 1.0F - var13[1];
               if (var13[0] < 0.0F) {
                  var13[0] = 0.0F;
               }

               if (var13[1] < 0.0F) {
                  var13[1] = 0.0F;
               }

               if (var13[0] > 1.0F || var13[1] > 1.0F) {
                  var16 = (float)(1.0 + (double)var13[1] * ((double)var13[1] - 2.0) + (double)((var13[0] - 2.0F + var13[1]) * var13[0]));
                  if (em.ac + var16 > 0.0F) {
                     UrlRequester.au_renamed(var13);
                  }
               }

               var13[1] = 1.0F - var13[1];
            }

            if (var14 != var13[0]) {
               float var10000 = var1 + var10 * var13[0];
               if ((double)var14 != 0.0) {
                  var6 = var5 + var13[0] * (var6 - var5) / var14;
               }
            }

            if (var13[1] != var15) {
               var3 = var10 * var13[1] + var1;
               if ((double)var15 != 1.0) {
                  var7 = (float)((double)var8 - (double)(var8 - var7) * (1.0 - (double)var13[1]) / (1.0 - (double)var15));
               }
            }

            var0.aq = var1;
            var0.al = var4;
            fg.ab_renamed(0.0F, var13[0], var13[1], 1.0F, var0);
            var16 = var6 - var5;
            float var17 = var7 - var6;
            float var18 = var8 - var7;
            float var19 = var17 - var16;
            var0.ah = var18 - var17 - var19;
            var0.ag = var19 + var19 + var19;
            var0.ai = var16 + var16 + var16;
            var0.ax = var5;
         }
      }
   }
}
