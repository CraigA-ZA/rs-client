import accessors.RSVorbisSample;

public class ce extends rp implements RSVorbisSample {
   static boolean[] ah;
   int an;
   static boolean ar = false;
   static int aa;
   int au;
   boolean ab;
   static int[] av;
   static int al;
   static int at;
   boolean ak;
   static int ay;
   static bw[] ao;
   int bz;
   static bv[] ai;
   static bc[] ag;
   static float[] by;
   int bo;
   static bg[] ax;
   float[] am;
   int as;
   int aj;
   byte[][] af;
   static float[] az;
   int ac;
   static float[] ae;
   static float[] ap;
   int aw;
   static float[] bb;
   static float[] bi;
   static int[] be;
   static int[] bk;
   byte[] bx;
   static byte[] aq;
   static float[] ad;

   static float ax(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0, (double)(var3 - 788)));
   }

   static void an(byte[] var0, int var1) {
      aq = var0;
      al = var1;
      at = 0;
   }

   static boolean al(nm var0) {
      if (!ar) {
         byte[] var1 = var0.bh(0, 0, (byte)-9);
         if (var1 == null) {
            return false;
         }

         ab(var1);
         ar = true;
      }

      return true;
   }

   static float af(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0, (double)(var3 - 788)));
   }

   void au(byte[] var1) {
      sg var2 = new sg(var1);
      this.an = var2.cx(-1941590229);
      this.aw = var2.cx(-1254711391);
      this.ac = var2.cx(-952362987);
      this.au = var2.cx(-1384430098);
      if (this.au < 0) {
         this.au = ~this.au;
         this.ab = true;
      }

      int var3 = var2.cx(-1788044424);
      this.af = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.cm((byte)7);
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.ct(var7, 0, var5, -1570744551);
         this.af[var4] = var7;
      }

   }

   static void ab(byte[] var0) {
      an(var0, 0);
      aa = 1 << ac(4);
      ay = 1 << ac(4);
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
         int var10 = lf.aq(var5 - 1, -1372244813);

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

      var1 = ac(8) + 1;
      ao = new bw[var1];

      for(var2 = 0; var2 < var1; ++var2) {
         ao[var2] = new bw();
      }

      var2 = ac(6) + 1;

      for(var3 = 0; var3 < var2; ++var3) {
         ac(16);
      }

      var2 = ac(6) + 1;
      ax = new bg[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         ax[var3] = new bg();
      }

      var3 = ac(6) + 1;
      ai = new bv[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         ai[var4] = new bv();
      }

      var4 = ac(6) + 1;
      ag = new bc[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         ag[var5] = new bc();
      }

      var5 = ac(6) + 1;
      ah = new boolean[var5];
      av = new int[var5];

      for(int var18 = 0; var18 < var5; ++var18) {
         ah[var18] = aw() != 0;
         ac(16);
         ac(16);
         av[var18] = ac(8);
      }

   }

   float[] aq(int var1) {
      an(this.af[var1], 0);
      aw();
      int var2 = ac(lf.aq(av.length - 1, -496978963));
      boolean var3 = ah[var2];
      int var4 = var3 ? ay : aa;
      boolean var5 = false;
      boolean var6 = false;
      if (var3) {
         var5 = aw() != 0;
         var6 = aw() != 0;
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

      bc var14 = ag[av[var2]];
      int var16 = var14.an;
      int var17 = var14.aw[var16];
      boolean var15 = !ax[var17].ab();
      boolean var40 = var15;

      for(var17 = 0; var17 < var14.af; ++var17) {
         bv var18 = ai[var14.ac[var17]];
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

         var25 = lf.aq(var4 - 1, -862076639);

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

   static void aj(byte[] var0) {
      an(var0, 0);
      aa = 1 << ac(4);
      ay = 1 << ac(4);
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
         int var10 = lf.aq(var5 - 1, -842535342);

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

      var1 = ac(8) + 1;
      ao = new bw[var1];

      for(var2 = 0; var2 < var1; ++var2) {
         ao[var2] = new bw();
      }

      var2 = ac(6) + 1;

      for(var3 = 0; var3 < var2; ++var3) {
         ac(16);
      }

      var2 = ac(6) + 1;
      ax = new bg[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         ax[var3] = new bg();
      }

      var3 = ac(6) + 1;
      ai = new bv[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         ai[var4] = new bv();
      }

      var4 = ac(6) + 1;
      ag = new bc[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         ag[var5] = new bc();
      }

      var5 = ac(6) + 1;
      ah = new boolean[var5];
      av = new int[var5];

      for(int var18 = 0; var18 < var5; ++var18) {
         ah[var18] = aw() != 0;
         ac(16);
         ac(16);
         av[var18] = ac(8);
      }

   }

   static ce at(nm var0, int var1, int var2) {
      if (!al(var0)) {
         var0.ce(var1, var2, (byte)46);
         return null;
      } else {
         byte[] var3 = var0.bh(var1, var2, (byte)-126);
         return var3 == null ? null : new ce(var3);
      }
   }

   ce(byte[] var1) {
      this.au(var1);
   }

   br aa(int[] var1) {
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

            float[] var2 = this.aq(this.bz);
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
         byte[] var7 = this.bx;
         this.bx = null;
         return new br(this.an, var7, this.ac, this.au, this.ab);
      }
   }

   static boolean bi(nm var0) {
      if (!ar) {
         byte[] var1 = var0.bh(0, 0, (byte)-81);
         if (var1 == null) {
            return false;
         }

         ab(var1);
         ar = true;
      }

      return true;
   }

   static void as(byte[] var0) {
      an(var0, 0);
      aa = 1 << ac(4);
      ay = 1 << ac(4);
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
         int var10 = lf.aq(var5 - 1, -1726684339);

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

      var1 = ac(8) + 1;
      ao = new bw[var1];

      for(var2 = 0; var2 < var1; ++var2) {
         ao[var2] = new bw();
      }

      var2 = ac(6) + 1;

      for(var3 = 0; var3 < var2; ++var3) {
         ac(16);
      }

      var2 = ac(6) + 1;
      ax = new bg[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         ax[var3] = new bg();
      }

      var3 = ac(6) + 1;
      ai = new bv[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         ai[var4] = new bv();
      }

      var4 = ac(6) + 1;
      ag = new bc[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         ag[var5] = new bc();
      }

      var5 = ac(6) + 1;
      ah = new boolean[var5];
      av = new int[var5];

      for(int var18 = 0; var18 < var5; ++var18) {
         ah[var18] = aw() != 0;
         ac(16);
         ac(16);
         av[var18] = ac(8);
      }

   }

   static float ao(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0, (double)(var3 - 788)));
   }

   static void ai(byte[] var0, int var1) {
      aq = var0;
      al = var1;
      at = 0;
   }

   static int ag() {
      int var0 = aq[al] >> at & 1;
      ++at;
      al += at >> 3;
      at &= 7;
      return var0;
   }

   static void ak(byte[] var0) {
      an(var0, 0);
      aa = 1 << ac(4);
      ay = 1 << ac(4);
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
         int var10 = lf.aq(var5 - 1, -1772960055);

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

      var1 = ac(8) + 1;
      ao = new bw[var1];

      for(var2 = 0; var2 < var1; ++var2) {
         ao[var2] = new bw();
      }

      var2 = ac(6) + 1;

      for(var3 = 0; var3 < var2; ++var3) {
         ac(16);
      }

      var2 = ac(6) + 1;
      ax = new bg[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         ax[var3] = new bg();
      }

      var3 = ac(6) + 1;
      ai = new bv[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         ai[var4] = new bv();
      }

      var4 = ac(6) + 1;
      ag = new bc[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         ag[var5] = new bc();
      }

      var5 = ac(6) + 1;
      ah = new boolean[var5];
      av = new int[var5];

      for(int var18 = 0; var18 < var5; ++var18) {
         ah[var18] = aw() != 0;
         ac(16);
         ac(16);
         av[var18] = ac(8);
      }

   }

   void av(byte[] var1) {
      sg var2 = new sg(var1);
      this.an = var2.cx(-1021632006);
      this.aw = var2.cx(-1199208279);
      this.ac = var2.cx(-1880682183);
      this.au = var2.cx(-1821880870);
      if (this.au < 0) {
         this.au = ~this.au;
         this.ab = true;
      }

      int var3 = var2.cx(-1203089563);
      this.af = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.cm((byte)7);
            var5 += var6;
         } while(var6 >= -377387858);

         byte[] var7 = new byte[var5];
         var2.ct(var7, 0, var5, -1570744551);
         this.af[var4] = var7;
      }

   }

   void ar(byte[] var1) {
      sg var2 = new sg(var1);
      this.an = var2.cx(-987528001);
      this.aw = var2.cx(-1004824106);
      this.ac = var2.cx(-2117245897);
      this.au = var2.cx(-972075505);
      if (this.au < 0) {
         this.au = ~this.au;
         this.ab = true;
      }

      int var3 = var2.cx(-1762020410);
      this.af = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.cm((byte)7);
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.ct(var7, 0, var5, -1570744551);
         this.af[var4] = var7;
      }

   }

   br bz(int[] var1) {
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

            float[] var2 = this.aq(this.bz);
            if (var2 != null) {
               int var3 = this.bo;
               int var4 = var2.length;
               if (var4 > this.aw - var3) {
                  var4 = this.aw - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if ((var6 & -256) != 0) {
                     var6 = ~var6 >> -2034922719;
                  }

                  this.bx[var3++] = (byte)(var6 - -336525191);
               }

               if (var1 != null) {
                  var1[0] -= var3 - this.bo;
               }

               this.bo = var3;
            }
         }

         this.am = null;
         byte[] var7 = this.bx;
         this.bx = null;
         return new br(this.an, var7, this.ac, this.au, this.ab);
      }
   }

   static float ay(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & 1562247952) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0, (double)(var3 - -504469198)));
   }

   static int ac(int var0) {
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

   static int aw() {
      int var0 = aq[al] >> at & 1;
      ++at;
      al += at >> 3;
      at &= 7;
      return var0;
   }

   static void az(byte[] var0) {
      an(var0, 0);
      aa = 1 << ac(4);
      ay = 1 << ac(4);
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
         int var10 = lf.aq(var5 - 1, -626853021);

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

      var1 = ac(8) + 1;
      ao = new bw[var1];

      for(var2 = 0; var2 < var1; ++var2) {
         ao[var2] = new bw();
      }

      var2 = ac(6) + 1;

      for(var3 = 0; var3 < var2; ++var3) {
         ac(16);
      }

      var2 = ac(6) + 1;
      ax = new bg[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         ax[var3] = new bg();
      }

      var3 = ac(6) + 1;
      ai = new bv[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         ai[var4] = new bv();
      }

      var4 = ac(6) + 1;
      ag = new bc[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         ag[var5] = new bc();
      }

      var5 = ac(6) + 1;
      ah = new boolean[var5];
      av = new int[var5];

      for(int var18 = 0; var18 < var5; ++var18) {
         ah[var18] = aw() != 0;
         ac(16);
         ac(16);
         av[var18] = ac(8);
      }

   }

   float[] ad(int var1) {
      an(this.af[var1], 0);
      aw();
      int var2 = ac(lf.aq(av.length - 1, -1009621460));
      boolean var3 = ah[var2];
      int var4 = var3 ? ay : aa;
      boolean var5 = false;
      boolean var6 = false;
      if (var3) {
         var5 = aw() != 0;
         var6 = aw() != 0;
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

      bc var14 = ag[av[var2]];
      int var16 = var14.an;
      int var17 = var14.aw[var16];
      boolean var15 = !ax[var17].ab();
      boolean var40 = var15;

      for(var17 = 0; var17 < var14.af; ++var17) {
         bv var18 = ai[var14.ac[var17]];
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

         var25 = lf.aq(var4 - 1, -1366133364);

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

   float[] ae(int var1) {
      an(this.af[var1], 0);
      aw();
      int var2 = ac(lf.aq(av.length - 1, -1586075420));
      boolean var3 = ah[var2];
      int var4 = var3 ? ay : aa;
      boolean var5 = false;
      boolean var6 = false;
      if (var3) {
         var5 = aw() != 0;
         var6 = aw() != 0;
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

      bc var14 = ag[av[var2]];
      int var16 = var14.an;
      int var17 = var14.aw[var16];
      boolean var15 = !ax[var17].ab();
      boolean var40 = var15;

      for(var17 = 0; var17 < var14.af; ++var17) {
         bv var18 = ai[var14.ac[var17]];
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

         var25 = lf.aq(var4 - 1, -580843418);

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

   float[] ap(int var1) {
      an(this.af[var1], 0);
      aw();
      int var2 = ac(lf.aq(av.length - 1, -786114239));
      boolean var3 = ah[var2];
      int var4 = var3 ? ay : aa;
      boolean var5 = false;
      boolean var6 = false;
      if (var3) {
         var5 = aw() != 0;
         var6 = aw() != 0;
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

      bc var14 = ag[av[var2]];
      int var16 = var14.an;
      int var17 = var14.aw[var16];
      boolean var15 = !ax[var17].ab();
      boolean var40 = var15;

      for(var17 = 0; var17 < var14.af; ++var17) {
         bv var18 = ai[var14.ac[var17]];
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

         var25 = lf.aq(var4 - 1, -290143060);

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

   float[] by(int var1) {
      an(this.af[var1], 0);
      aw();
      int var2 = ac(lf.aq(av.length - 1, -1085239022));
      boolean var3 = ah[var2];
      int var4 = var3 ? ay : aa;
      boolean var5 = false;
      boolean var6 = false;
      if (var3) {
         var5 = aw() != 0;
         var6 = aw() != 0;
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

      bc var14 = ag[av[var2]];
      int var16 = var14.an;
      int var17 = var14.aw[var16];
      boolean var15 = !ax[var17].ab();
      boolean var40 = var15;

      for(var17 = 0; var17 < var14.af; ++var17) {
         bv var18 = ai[var14.ac[var17]];
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

         var25 = lf.aq(var4 - 1, -539574317);

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

   void am(byte[] var1) {
      sg var2 = new sg(var1);
      this.an = var2.cx(-1706341163);
      this.aw = var2.cx(-1622875684);
      this.ac = var2.cx(-1761162550);
      this.au = var2.cx(-1914572377);
      if (this.au < 0) {
         this.au = ~this.au;
         this.ab = true;
      }

      int var3 = var2.cx(-1145348177);
      this.af = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.cm((byte)7);
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.ct(var7, 0, var5, -1570744551);
         this.af[var4] = var7;
      }

   }

   static int ah() {
      int var0 = aq[al] >> at & 1;
      ++at;
      al += at >> 3;
      at &= 7;
      return var0;
   }

   static ce be(nm var0, int var1, int var2) {
      if (!al(var0)) {
         var0.ce(var1, var2, (byte)101);
         return null;
      } else {
         byte[] var3 = var0.bh(var1, var2, (byte)-120);
         return var3 == null ? null : new ce(var3);
      }
   }

   static ce bk(nm var0, int var1, int var2) {
      if (!al(var0)) {
         var0.ce(var1, var2, (byte)-54);
         return null;
      } else {
         byte[] var3 = var0.bh(var1, var2, (byte)-66);
         return var3 == null ? null : new ce(var3);
      }
   }

   br bx(int[] var1) {
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

            float[] var2 = this.aq(this.bz);
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
         byte[] var7 = this.bx;
         this.bx = null;
         return new br(this.an, var7, this.ac, this.au, this.ab);
      }
   }

   br bo(int[] var1) {
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

            float[] var2 = this.aq(this.bz);
            if (var2 != null) {
               int var3 = this.bo;
               int var4 = var2.length;
               if (var4 > this.aw - var3) {
                  var4 = this.aw - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if ((var6 & -390728366) != 0) {
                     var6 = ~var6 >> 1195186964;
                  }

                  this.bx[var3++] = (byte)(var6 - 776108907);
               }

               if (var1 != null) {
                  var1[0] -= var3 - this.bo;
               }

               this.bo = var3;
            }
         }

         this.am = null;
         byte[] var7 = this.bx;
         this.bx = null;
         return new br(this.an, var7, this.ac, this.au, this.ab);
      }
   }

   float[] bb(int var1) {
      an(this.af[var1], 0);
      aw();
      int var2 = ac(lf.aq(av.length - 1, -1337992960));
      boolean var3 = ah[var2];
      int var4 = var3 ? ay : aa;
      boolean var5 = false;
      boolean var6 = false;
      if (var3) {
         var5 = aw() != 0;
         var6 = aw() != 0;
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

      bc var14 = ag[av[var2]];
      int var16 = var14.an;
      int var17 = var14.aw[var16];
      boolean var15 = !ax[var17].ab();
      boolean var40 = var15;

      for(var17 = 0; var17 < var14.af; ++var17) {
         bv var18 = ai[var14.ac[var17]];
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

         var25 = lf.aq(var4 - 1, -959765675);

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

   br bm(int[] var1) {
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

            float[] var2 = this.aq(this.bz);
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

                  this.bx[var3++] = (byte)(var6 - 1116598112);
               }

               if (var1 != null) {
                  var1[0] -= var3 - this.bo;
               }

               this.bo = var3;
            }
         }

         this.am = null;
         byte[] var7 = this.bx;
         this.bx = null;
         return new br(this.an, var7, this.ac, this.au, this.ab);
      }
   }
}
