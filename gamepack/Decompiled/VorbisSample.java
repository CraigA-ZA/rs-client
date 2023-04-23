public class VorbisSample extends Node {
   static VorbisMapping[] ag;
   static VorbisFloor[] ax;
   static boolean ar = false;
   static boolean[] ah;
   static VorbisResidue[] ai;
   static VorbisCodebook[] ao;
   static byte[] aq;
   static float[] ad;
   static float[] ae;
   static float[] ap;
   static float[] az;
   static float[] bb;
   static float[] bi;
   static float[] by;
   static int aa;
   static int al;
   static int at;
   static int ay;
   static int[] av;
   static int[] be;
   static int[] bk;
   boolean ab;
   boolean ak;
   byte[] bx;
   byte[][] af;
   float[] am;
   int ac;
   int aj;
   int an;
   int as;
   int au;
   int aw;
   int bo;
   int bz;

   static float af_renamed(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0, (double)(var3 - 788)));
   }

   static void VorbisSample_setStream(byte[] var0, int var1) {
      aq = var0;
      al = var1;
      at = 0;
   }

   static int VorbisSample_readBit() {
      int var0 = aq[al] >> at & 1;
      ++at;
      al += at >> 3;
      at &= 7;
      return var0;
   }

   static int VorbisSample_readBits(int var0) {
      int var1 = 0;

      int var2;
      int var3;
      for(var2 = 0; var0 >= 8 - at; var0 -= var3) {
         var3 = 8 - at;
         int var4 = (1 << var3) - 1;
         var1 += (aq[al] >> at & var4) << var2;
         at = 0;
         ++al;
         var2 += var3;
      }

      if (var0 > 0) {
         var3 = (1 << var0) - 1;
         var1 += (aq[al] >> at & var3) << var2;
         at += var0;
      }

      return var1;
   }

   void decodeMeta(byte[] var1) {
      Packet var2 = new Packet(var1);
      this.an = var2.g4s();
      this.aw = var2.g4s();
      this.ac = var2.g4s();
      this.au = var2.g4s();
      if (this.au < 0) {
         this.au = ~this.au;
         this.ab = true;
      }

      int var3 = var2.g4s();
      this.af = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.g1();
            var5 += var6;
         } while(var6 >= 255);

         byte[] var9 = new byte[var5];
         var2.ct(var9, 0, var5);
         this.af[var4] = var9;
      }

   }

   static void VorbisSample_decodeSetupHeader(byte[] var0) {
      VorbisSample_setStream(var0, 0);
      aa = 1 << VorbisSample_readBits(4);
      ay = 1 << VorbisSample_readBits(4);
      az = new float[ay];

      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      for(var1 = 0; var1 < 2; ++var1) {
         var2 = var1 != 0 ? ay : aa;
         var3 = var2 >> 1;
         var4 = var2 >> 2;
         var5 = var2 >> 3;
         float[] var6 = new float[var3];

         for(int var7 = 0; var7 < var4; ++var7) {
            var6[2 * var7] = (float)Math.cos((double)(4 * var7) * Math.PI / (double)var2);
            var6[2 * var7 + 1] = -((float)Math.sin((double)(4 * var7) * Math.PI / (double)var2));
         }

         float[] var19 = new float[var3];

         for(int var8 = 0; var8 < var4; ++var8) {
            var19[2 * var8] = (float)Math.cos((double)(2 * var8 + 1) * Math.PI / (double)(2 * var2));
            var19[2 * var8 + 1] = (float)Math.sin((double)(2 * var8 + 1) * Math.PI / (double)(2 * var2));
         }

         float[] var20 = new float[var4];

         for(int var9 = 0; var9 < var5; ++var9) {
            var20[2 * var9] = (float)Math.cos((double)(4 * var9 + 2) * Math.PI / (double)var2);
            var20[2 * var9 + 1] = -((float)Math.sin((double)(4 * var9 + 2) * Math.PI / (double)var2));
         }

         int[] var21 = new int[var5];
         int var10 = LoginProt.aq_renamed(var5 - 1);

         for(int var11 = 0; var11 < var5; ++var11) {
            int var15 = var11;
            int var16 = var10;

            int var17;
            for(var17 = 0; var16 > 0; --var16) {
               var17 = var17 << 1 | var15 & 1;
               var15 >>>= 1;
            }

            var21[var11] = var17;
         }

         if (var1 != 0) {
            by = var6;
            bb = var19;
            bi = var20;
            bk = var21;
         } else {
            ad = var6;
            ae = var19;
            ap = var20;
            be = var21;
         }
      }

      var1 = VorbisSample_readBits(8) + 1;
      ao = new VorbisCodebook[var1];

      for(var2 = 0; var2 < var1; ++var2) {
         ao[var2] = new VorbisCodebook();
      }

      var2 = VorbisSample_readBits(6) + 1;

      for(var3 = 0; var3 < var2; ++var3) {
         VorbisSample_readBits(16);
      }

      var2 = VorbisSample_readBits(6) + 1;
      ax = new VorbisFloor[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         ax[var3] = new VorbisFloor();
      }

      var3 = VorbisSample_readBits(6) + 1;
      ai = new VorbisResidue[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         ai[var4] = new VorbisResidue();
      }

      var4 = VorbisSample_readBits(6) + 1;
      ag = new VorbisMapping[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         ag[var5] = new VorbisMapping();
      }

      var5 = VorbisSample_readBits(6) + 1;
      ah = new boolean[var5];
      av = new int[var5];

      for(int var18 = 0; var18 < var5; ++var18) {
         ah[var18] = VorbisSample_readBit() != 0;
         VorbisSample_readBits(16);
         VorbisSample_readBits(16);
         av[var18] = VorbisSample_readBits(8);
      }

   }

   float[] decodeAudio(int var1) {
      VorbisSample_setStream(this.af[var1], 0);
      VorbisSample_readBit();
      int var2 = VorbisSample_readBits(LoginProt.aq_renamed(av.length - 1));
      boolean var3 = ah[var2];
      int var4 = var3 ? ay : aa;
      boolean var5 = false;
      boolean var6 = false;
      if (var3) {
         var5 = VorbisSample_readBit() != 0;
         var6 = VorbisSample_readBit() != 0;
      }

      int var7 = var4 >> 1;
      int var8;
      int var9;
      int var10;
      if (var3 && !var5) {
         var8 = (var4 >> 2) - (aa >> 2);
         var9 = (var4 >> 2) + (aa >> 2);
         var10 = aa >> 1;
      } else {
         var8 = 0;
         var9 = var7;
         var10 = var4 >> 1;
      }

      int var11;
      int var12;
      int var13;
      if (var3 && !var6) {
         var11 = var4 - (var4 >> 2) - (aa >> 2);
         var12 = var4 - (var4 >> 2) + (aa >> 2);
         var13 = aa >> 1;
      } else {
         var11 = var7;
         var12 = var4;
         var13 = var4 >> 1;
      }

      VorbisMapping var14 = ag[av[var2]];
      int var16 = var14.an;
      int var17 = var14.aw[var16];
      boolean var15 = !ax[var17].ab();
      boolean var40 = var15;

      for(var17 = 0; var17 < var14.af; ++var17) {
         VorbisResidue var18 = ai[var14.ac[var17]];
         float[] var19 = az;
         var18.af(var19, var4 >> 1, var40);
      }

      int var41;
      if (!var15) {
         var17 = var14.an;
         var41 = var14.aw[var17];
         ax[var41].aq(az, var4 >> 1);
      }

      int var42;
      if (var15) {
         for(var17 = var4 >> 1; var17 < var4; ++var17) {
            az[var17] = 0.0F;
         }
      } else {
         var17 = var4 >> 1;
         var41 = var4 >> 2;
         var42 = var4 >> 3;
         float[] var20 = az;

         int var21;
         for(var21 = 0; var21 < var17; ++var21) {
            var20[var21] *= 0.5F;
         }

         for(var21 = var17; var21 < var4; ++var21) {
            var20[var21] = -var20[var4 - var21 - 1];
         }

         float[] var46 = var3 ? by : ad;
         float[] var22 = var3 ? bb : ae;
         float[] var23 = var3 ? bi : ap;
         int[] var24 = var3 ? bk : be;

         int var25;
         float var26;
         float var27;
         float var28;
         float var29;
         for(var25 = 0; var25 < var41; ++var25) {
            var26 = var20[4 * var25] - var20[var4 - 4 * var25 - 1];
            var27 = var20[4 * var25 + 2] - var20[var4 - 4 * var25 - 3];
            var28 = var46[2 * var25];
            var29 = var46[2 * var25 + 1];
            var20[var4 - 4 * var25 - 1] = var26 * var28 - var27 * var29;
            var20[var4 - 4 * var25 - 3] = var26 * var29 + var27 * var28;
         }

         float var30;
         float var31;
         for(var25 = 0; var25 < var42; ++var25) {
            var26 = var20[var17 + 3 + 4 * var25];
            var27 = var20[var17 + 1 + 4 * var25];
            var28 = var20[4 * var25 + 3];
            var29 = var20[4 * var25 + 1];
            var20[var17 + 3 + 4 * var25] = var26 + var28;
            var20[var17 + 1 + 4 * var25] = var27 + var29;
            var30 = var46[var17 - 4 - 4 * var25];
            var31 = var46[var17 - 3 - 4 * var25];
            var20[4 * var25 + 3] = (var26 - var28) * var30 - (var27 - var29) * var31;
            var20[4 * var25 + 1] = (var27 - var29) * var30 + (var26 - var28) * var31;
         }

         var25 = LoginProt.aq_renamed(var4 - 1);

         int var47;
         int var48;
         int var49;
         int var50;
         for(var47 = 0; var47 < var25 - 3; ++var47) {
            var48 = var4 >> var47 + 2;
            var49 = 8 << var47;

            for(var50 = 0; var50 < 2 << var47; ++var50) {
               int var51 = var4 - var48 * 2 * var50;
               int var52 = var4 - var48 * (2 * var50 + 1);

               for(int var32 = 0; var32 < var4 >> var47 + 4; ++var32) {
                  int var33 = 4 * var32;
                  float var34 = var20[var51 - 1 - var33];
                  float var35 = var20[var51 - 3 - var33];
                  float var36 = var20[var52 - 1 - var33];
                  float var37 = var20[var52 - 3 - var33];
                  var20[var51 - 1 - var33] = var34 + var36;
                  var20[var51 - 3 - var33] = var35 + var37;
                  float var38 = var46[var32 * var49];
                  float var39 = var46[var32 * var49 + 1];
                  var20[var52 - 1 - var33] = (var34 - var36) * var38 - (var35 - var37) * var39;
                  var20[var52 - 3 - var33] = (var35 - var37) * var38 + (var34 - var36) * var39;
               }
            }
         }

         for(var47 = 1; var47 < var42 - 1; ++var47) {
            var48 = var24[var47];
            if (var47 < var48) {
               var49 = 8 * var47;
               var50 = 8 * var48;
               var30 = var20[var49 + 1];
               var20[var49 + 1] = var20[var50 + 1];
               var20[var50 + 1] = var30;
               var30 = var20[var49 + 3];
               var20[var49 + 3] = var20[var50 + 3];
               var20[var50 + 3] = var30;
               var30 = var20[var49 + 5];
               var20[var49 + 5] = var20[var50 + 5];
               var20[var50 + 5] = var30;
               var30 = var20[var49 + 7];
               var20[var49 + 7] = var20[var50 + 7];
               var20[var50 + 7] = var30;
            }
         }

         for(var47 = 0; var47 < var17; ++var47) {
            var20[var47] = var20[2 * var47 + 1];
         }

         for(var47 = 0; var47 < var42; ++var47) {
            var20[var4 - 1 - 2 * var47] = var20[4 * var47];
            var20[var4 - 2 - 2 * var47] = var20[4 * var47 + 1];
            var20[var4 - var41 - 1 - 2 * var47] = var20[4 * var47 + 2];
            var20[var4 - var41 - 2 - 2 * var47] = var20[4 * var47 + 3];
         }

         for(var47 = 0; var47 < var42; ++var47) {
            var27 = var23[2 * var47];
            var28 = var23[2 * var47 + 1];
            var29 = var20[var17 + 2 * var47];
            var30 = var20[var17 + 2 * var47 + 1];
            var31 = var20[var4 - 2 - 2 * var47];
            float var53 = var20[var4 - 1 - 2 * var47];
            float var54 = var28 * (var29 - var31) + var27 * (var30 + var53);
            var20[var17 + 2 * var47] = (var29 + var31 + var54) * 0.5F;
            var20[var4 - 2 - 2 * var47] = (var29 + var31 - var54) * 0.5F;
            var54 = var28 * (var30 + var53) - var27 * (var29 - var31);
            var20[var17 + 2 * var47 + 1] = (var30 - var53 + var54) * 0.5F;
            var20[var4 - 1 - 2 * var47] = (-var30 + var53 + var54) * 0.5F;
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var47] = var20[2 * var47 + var17] * var22[2 * var47] + var20[2 * var47 + 1 + var17] * var22[2 * var47 + 1];
            var20[var17 - 1 - var47] = var20[2 * var47 + var17] * var22[2 * var47 + 1] - var20[2 * var47 + 1 + var17] * var22[2 * var47];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var4 - var41 + var47] = -var20[var47];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var47] = var20[var41 + var47];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var41 + var47] = -var20[var41 - var47 - 1];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var17 + var47] = var20[var4 - var47 - 1];
         }

         float[] var10000;
         for(var47 = var8; var47 < var9; ++var47) {
            var27 = (float)Math.sin(((double)(var47 - var8) + 0.5) / (double)var10 * 0.5 * Math.PI);
            var10000 = az;
            var10000[var47] *= (float)Math.sin(1.5707963267948966 * (double)var27 * (double)var27);
         }

         for(var47 = var11; var47 < var12; ++var47) {
            var27 = (float)Math.sin(((double)(var47 - var11) + 0.5) / (double)var13 * 0.5 * Math.PI + 1.5707963267948966);
            var10000 = az;
            var10000[var47] *= (float)Math.sin(1.5707963267948966 * (double)var27 * (double)var27);
         }
      }

      float[] var43 = null;
      if (this.as > 0) {
         var41 = this.as + var4 >> 2;
         var43 = new float[var41];
         int var45;
         if (!this.ak) {
            for(var42 = 0; var42 < this.aj; ++var42) {
               var45 = (this.as >> 1) + var42;
               var43[var42] += this.am[var45];
            }
         }

         if (!var15) {
            for(var42 = var8; var42 < var4 >> 1; ++var42) {
               var45 = var43.length - (var4 >> 1) + var42;
               var43[var45] += az[var42];
            }
         }
      }

      float[] var44 = this.am;
      this.am = az;
      az = var44;
      this.as = var4;
      this.aj = var12 - (var4 >> 1);
      this.ak = var15;
      return var43;
   }

   static boolean VorbisSample_loadSetupHeader(AbstractArchive var0) {
      if (!ar) {
         byte[] var1 = var0.takeFile(0, 0);
         if (var1 == null) {
            return false;
         }

         VorbisSample_decodeSetupHeader(var1);
         ar = true;
      }

      return true;
   }

   static VorbisSample readVorbisSample(AbstractArchive var0, int var1, int var2) {
      if (!VorbisSample_loadSetupHeader(var0)) {
         var0.tryLoadFile(var1, var2);
         return null;
      } else {
         byte[] var3 = var0.takeFile(var1, var2);
         return var3 == null ? null : new VorbisSample(var3);
      }
   }

   VorbisSample(byte[] var1) {
      this.decodeMeta(var1);
   }

   RawSound toRawSound(int[] var1) {
      if (var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if (this.bx == null) {
            this.as = 0;
            this.am = new float[ay];
            this.bx = new byte[this.aw];
            this.bo = 0;
            this.bz = 0;
         }

         for(; this.bz < this.af.length; ++this.bz) {
            if (var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.decodeAudio(this.bz);
            if (var2 != null) {
               int var3 = this.bo;
               int var4 = var2.length;
               if (var4 > this.aw - var3) {
                  var4 = this.aw - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if ((var6 & -256) != 0) {
                     var6 = ~var6 >> 31;
                  }

                  this.bx[var3++] = (byte)(var6 - 128);
               }

               if (var1 != null) {
                  var1[0] -= var3 - this.bo;
               }

               this.bo = var3;
            }
         }

         this.am = null;
         byte[] var11 = this.bx;
         this.bx = null;
         return new RawSound(this.an, var11, this.ac, this.au, this.ab);
      }
   }
}
