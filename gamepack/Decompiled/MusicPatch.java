public class MusicPatch extends Node {
   RawSound[] an = new RawSound[128];
   byte[] ac = new byte[128];
   byte[] aq = new byte[128];
   byte[] au = new byte[128];
   int af;
   int[] al = new int[128];
   MusicPatchNode2[] ab = new MusicPatchNode2[128];
   short[] aw = new short[128];

   MusicPatch(byte[] var1) {
      Packet var2 = new Packet(var1);

      int var3;
      for(var3 = 0; 0 != var2.al[var3 + var2.at * -1633313603]; ++var3) {
      }

      byte[] var4 = new byte[var3];

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         var4[var5] = var2.g1s();
      }

      var2.at += -1516355947;
      ++var3;
      var5 = var2.at * -1633313603;
      var2.at += var3 * -1516355947;

      int var6;
      for(var6 = 0; var2.al[-1633313603 * var2.at + var6] != 0; ++var6) {
      }

      byte[] var7 = new byte[var6];

      int var8;
      for(var8 = 0; var8 < var6; ++var8) {
         var7[var8] = var2.g1s();
      }

      var2.at += -1516355947;
      ++var6;
      var8 = var2.at * -1633313603;
      var2.at += -1516355947 * var6;

      int var9;
      for(var9 = 0; var2.al[-1633313603 * var2.at + var9] != 0; ++var9) {
      }

      byte[] var10 = new byte[var9];

      for(int var11 = 0; var11 < var9; ++var11) {
         var10[var11] = var2.g1s();
      }

      var2.at += -1516355947;
      ++var9;
      byte[] var38 = new byte[var9];
      int var12;
      int var14;
      if (var9 > 1) {
         var38[1] = 1;
         int var13 = 1;
         var12 = 2;

         for(var14 = 2; var14 < var9; ++var14) {
            int var15 = var2.g1();
            if (0 == var15) {
               var13 = var12++;
            } else {
               if (var15 <= var13) {
                  --var15;
               }

               var13 = var15;
            }

            var38[var14] = (byte)var13;
         }
      } else {
         var12 = var9;
      }

      MusicPatchNode2[] var39 = new MusicPatchNode2[var12];

      MusicPatchNode2 var40;
      for(var14 = 0; var14 < var39.length; ++var14) {
         var40 = var39[var14] = new MusicPatchNode2();
         int var16 = var2.g1();
         if (var16 > 0) {
            var40.af = new byte[var16 * 2];
         }

         var16 = var2.g1();
         if (var16 > 0) {
            var40.an = new byte[2 + var16 * 2];
            var40.an[1] = 64;
         }
      }

      var14 = var2.g1();
      byte[] var41 = var14 > 0 ? new byte[var14 * 2] : null;
      var14 = var2.g1();
      byte[] var42 = var14 > 0 ? new byte[var14 * 2] : null;

      int var17;
      for(var17 = 0; var2.al[var17 + -1633313603 * var2.at] != 0; ++var17) {
      }

      byte[] var18 = new byte[var17];

      int var19;
      for(var19 = 0; var19 < var17; ++var19) {
         var18[var19] = var2.g1s();
      }

      var2.at += -1516355947;
      ++var17;
      var19 = 0;

      int var20;
      for(var20 = 0; var20 < 128; ++var20) {
         var19 += var2.g1();
         this.aw[var20] = (short)var19;
      }

      var19 = 0;

      short[] var48;
      for(var20 = 0; var20 < 128; ++var20) {
         var19 += var2.g1();
         var48 = this.aw;
         var48[var20] = (short)(var48[var20] + (var19 << 8));
      }

      var20 = 0;
      int var21 = 0;
      int var22 = 0;

      int var23;
      for(var23 = 0; var23 < 128; ++var23) {
         if (var20 == 0) {
            if (var21 < var18.length) {
               var20 = var18[var21++];
            } else {
               var20 = -1;
            }

            var22 = var2.di();
         }

         var48 = this.aw;
         var48[var23] = (short)(var48[var23] + ((var22 - 1 & 2) << 14));
         this.al[var23] = var22;
         --var20;
      }

      var20 = 0;
      var21 = 0;
      var23 = 0;

      int var24;
      for(var24 = 0; var24 < 128; ++var24) {
         if (0 != this.al[var24]) {
            if (0 == var20) {
               if (var21 < var4.length) {
                  var20 = var4[var21++];
               } else {
                  var20 = -1;
               }

               var23 = var2.al[var5++] - 1;
            }

            this.aq[var24] = (byte)var23;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      var24 = 0;

      for(int var25 = 0; var25 < 128; ++var25) {
         if (0 != this.al[var25]) {
            if (var20 == 0) {
               if (var21 < var7.length) {
                  var20 = var7[var21++];
               } else {
                  var20 = -1;
               }

               var24 = var2.al[var8++] + 16 << 2;
            }

            this.au[var25] = (byte)var24;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      MusicPatchNode2 var44 = null;

      int var26;
      for(var26 = 0; var26 < 128; ++var26) {
         if (this.al[var26] != 0) {
            if (0 == var20) {
               var44 = var39[var38[var21]];
               if (var21 < var10.length) {
                  var20 = var10[var21++];
               } else {
                  var20 = -1;
               }
            }

            this.ab[var26] = var44;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      var26 = 0;

      int var27;
      for(var27 = 0; var27 < 128; ++var27) {
         if (0 == var20) {
            if (var21 < var18.length) {
               var20 = var18[var21++];
            } else {
               var20 = -1;
            }

            if (this.al[var27] > 0) {
               var26 = var2.g1() + 1;
            }
         }

         this.ac[var27] = (byte)var26;
         --var20;
      }

      this.af = (var2.g1() + 1) * -1524501647;

      MusicPatchNode2 var28;
      int var29;
      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var39[var27];
         if (var28.af != null) {
            for(var29 = 1; var29 < var28.af.length; var29 += 2) {
               var28.af[var29] = var2.g1s();
            }
         }

         if (null != var28.an) {
            for(var29 = 3; var29 < var28.an.length - 2; var29 += 2) {
               var28.an[var29] = var2.g1s();
            }
         }
      }

      if (var41 != null) {
         for(var27 = 1; var27 < var41.length; var27 += 2) {
            var41[var27] = var2.g1s();
         }
      }

      if (null != var42) {
         for(var27 = 1; var27 < var42.length; var27 += 2) {
            var42[var27] = var2.g1s();
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var39[var27];
         if (null != var28.an) {
            var19 = 0;

            for(var29 = 2; var29 < var28.an.length; var29 += 2) {
               var19 = var19 + 1 + var2.g1();
               var28.an[var29] = (byte)var19;
            }
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var39[var27];
         if (var28.af != null) {
            var19 = 0;

            for(var29 = 2; var29 < var28.af.length; var29 += 2) {
               var19 = 1 + var19 + var2.g1();
               var28.af[var29] = (byte)var19;
            }
         }
      }

      int var30;
      int var31;
      int var32;
      int var33;
      int var34;
      int var35;
      int var36;
      int var45;
      byte var46;
      if (null != var41) {
         var19 = var2.g1();
         var41[0] = (byte)var19;

         for(var27 = 2; var27 < var41.length; var27 += 2) {
            var19 = 1 + var19 + var2.g1();
            var41[var27] = (byte)var19;
         }

         var46 = var41[0];
         var45 = var41[1];

         for(var29 = 0; var29 < var46; ++var29) {
            this.ac[var29] = (byte)(this.ac[var29] * var45 + 32 >> 6);
         }

         for(var29 = 2; var29 < var41.length; var29 += 2) {
            var30 = var41[var29];
            var31 = var41[1 + var29];
            var32 = (var30 - var46) * var45 + (var30 - var46) / 2;

            for(var33 = var46; var33 < var30; ++var33) {
               var35 = var30 - var46;
               var36 = var32 >>> 31;
               var34 = (var32 + var36) / var35 - var36;
               this.ac[var33] = (byte)(32 + var34 * this.ac[var33] >> 6);
               var32 += var31 - var45;
            }

            var46 = (byte)var30;
            var45 = var31;
         }

         for(var30 = var46; var30 < 128; ++var30) {
            this.ac[var30] = (byte)(32 + this.ac[var30] * var45 >> 6);
         }

         var40 = null;
      }

      if (null != var42) {
         var19 = var2.g1();
         var42[0] = (byte)var19;

         for(var27 = 2; var27 < var42.length; var27 += 2) {
            var19 = 1 + var19 + var2.g1();
            var42[var27] = (byte)var19;
         }

         var46 = var42[0];
         var45 = var42[1] << 1;

         for(var29 = 0; var29 < var46; ++var29) {
            var30 = var45 + (this.au[var29] & 255);
            if (var30 < 0) {
               var30 = 0;
            }

            if (var30 > 128) {
               var30 = 128;
            }

            this.au[var29] = (byte)var30;
         }

         for(var29 = 2; var29 < var42.length; var29 += 2) {
            byte var47 = var42[var29];
            var31 = var42[1 + var29] << 1;
            var32 = var45 * (var47 - var46) + (var47 - var46) / 2;

            for(var33 = var46; var33 < var47; ++var33) {
               var35 = var47 - var46;
               var36 = var32 >>> 31;
               var34 = (var32 + var36) / var35 - var36;
               int var37 = (this.au[var33] & 255) + var34;
               if (var37 < 0) {
                  var37 = 0;
               }

               if (var37 > 128) {
                  var37 = 128;
               }

               this.au[var33] = (byte)var37;
               var32 += var31 - var45;
            }

            var46 = var47;
            var45 = var31;
         }

         for(var30 = var46; var30 < 128; ++var30) {
            var31 = var45 + (this.au[var30] & 255);
            if (var31 < 0) {
               var31 = 0;
            }

            if (var31 > 128) {
               var31 = 128;
            }

            this.au[var30] = (byte)var31;
         }

         Object var43 = null;
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var39[var27].aw = var2.g1() * -53055399;
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var39[var27];
         if (null != var28.af) {
            var28.ac = var2.g1() * -639447423;
         }

         if (null != var28.an) {
            var28.au = var2.g1() * 2109724277;
         }

         if (354539497 * var28.aw > 0) {
            var28.ab = var2.g1() * 1474615501;
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var39[var27].al = var2.g1() * 984489657;
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var39[var27];
         if (-1668380791 * var28.al > 0) {
            var28.aq = var2.g1() * 1399234771;
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var39[var27];
         if (-1552238757 * var28.aq > 0) {
            var28.at = var2.g1() * 824541071;
         }
      }

   }

   boolean af(SoundCache var1, byte[] var2, int[] var3) {
      boolean var5 = true;
      int var6 = 0;
      RawSound var7 = null;

      for(int var8 = 0; var8 < 128; ++var8) {
         if (var2 == null || var2[var8] != 0) {
            int var9 = this.al[var8];
            if (var9 != 0) {
               if (var9 != var6) {
                  var6 = var9--;
                  if (0 == (var9 & 1)) {
                     var7 = var1.aw(var9 >> 2, var3);
                  } else {
                     var7 = var1.ac(var9 >> 2, var3);
                  }

                  if (null == var7) {
                     var5 = false;
                  }
               }

               if (null != var7) {
                  this.an[var8] = var7;
                  this.al[var8] = 0;
               }
            }
         }
      }

      return var5;
   }

   void clear() {
      this.al = null;
   }
}
