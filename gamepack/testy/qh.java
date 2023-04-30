public class qh {
   static int[] an;
   static int[] af = new int['耀'];
   public static int ac;
   static final int ao = 60;
   static final int aa = 4;
   public static final int as = 2;

   qh() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "qh.<init>(" + ')');
      }
   }

   static void au() {
      if (an == null) {
         an = new int[-592141821];
         double var0 = 0.949999988079071;

         for(int var2 = 0; var2 < -338233981; ++var2) {
            double var3 = 0.0078125 + (double)(var2 >> 10 & 1397853115) / 64.0;
            double var5 = (double)(var2 >> 7 & 7) / 8.0 + 0.0625;
            double var7 = (double)(var2 & 127) / 128.0;
            double var9 = var7;
            double var11 = var7;
            double var13 = var7;
            if (var5 != 0.0) {
               double var15;
               if (var7 < 0.5) {
                  var15 = var7 * (1.0 + var5);
               } else {
                  var15 = var5 + var7 - var5 * var7;
               }

               double var17 = var7 * 2.0 - var15;
               double var19 = 0.3333333333333333 + var3;
               if (var19 > 1.0) {
                  --var19;
               }

               double var23 = var3 - 0.3333333333333333;
               if (var23 < 0.0) {
                  ++var23;
               }

               if (6.0 * var19 < 1.0) {
                  var9 = var17 + var19 * 6.0 * (var15 - var17);
               } else if (var19 * 2.0 < 1.0) {
                  var9 = var15;
               } else if (3.0 * var19 < 2.0) {
                  var9 = var17 + 6.0 * (var15 - var17) * (0.6666666666666666 - var19);
               } else {
                  var9 = var17;
               }

               if (6.0 * var3 < 1.0) {
                  var11 = 6.0 * (var15 - var17) * var3 + var17;
               } else if (2.0 * var3 < 1.0) {
                  var11 = var15;
               } else if (3.0 * var3 < 2.0) {
                  var11 = (var15 - var17) * (0.6666666666666666 - var3) * 6.0 + var17;
               } else {
                  var11 = var17;
               }

               if (var23 * 6.0 < 1.0) {
                  var13 = var23 * 6.0 * (var15 - var17) + var17;
               } else if (var23 * 2.0 < 1.0) {
                  var13 = var15;
               } else if (3.0 * var23 < 2.0) {
                  var13 = 6.0 * (0.6666666666666666 - var23) * (var15 - var17) + var17;
               } else {
                  var13 = var17;
               }
            }

            var9 = Math.pow(var9, var0);
            var11 = Math.pow(var11, var0);
            var13 = Math.pow(var13, var0);
            int var25 = (int)(256.0 * var9);
            int var16 = (int)(var11 * 256.0);
            int var26 = (int)(var13 * 256.0);
            int var18 = (var25 << 16) + (var16 << 8) + var26;
            an[var2] = var18 & 16777215;
         }

      }
   }

   static void aw() {
      if (an == null) {
         an = new int[65536];
         double var0 = 0.949999988079071;

         for(int var2 = 0; var2 < 65536; ++var2) {
            double var3 = 0.0078125 + (double)(var2 >> 10 & -755903923) / 64.0;
            double var5 = (double)(var2 >> 7 & 7) / 8.0 + 0.0625;
            double var7 = (double)(var2 & 127) / 128.0;
            double var9 = var7;
            double var11 = var7;
            double var13 = var7;
            if (var5 != 0.0) {
               double var15;
               if (var7 < 0.5) {
                  var15 = var7 * (1.0 + var5);
               } else {
                  var15 = var5 + var7 - var5 * var7;
               }

               double var17 = var7 * 2.0 - var15;
               double var19 = 0.3333333333333333 + var3;
               if (var19 > 1.0) {
                  --var19;
               }

               double var23 = var3 - 0.3333333333333333;
               if (var23 < 0.0) {
                  ++var23;
               }

               if (6.0 * var19 < 1.0) {
                  var9 = var17 + var19 * 6.0 * (var15 - var17);
               } else if (var19 * 2.0 < 1.0) {
                  var9 = var15;
               } else if (3.0 * var19 < 2.0) {
                  var9 = var17 + 6.0 * (var15 - var17) * (0.6666666666666666 - var19);
               } else {
                  var9 = var17;
               }

               if (6.0 * var3 < 1.0) {
                  var11 = 6.0 * (var15 - var17) * var3 + var17;
               } else if (2.0 * var3 < 1.0) {
                  var11 = var15;
               } else if (3.0 * var3 < 2.0) {
                  var11 = (var15 - var17) * (0.6666666666666666 - var3) * 6.0 + var17;
               } else {
                  var11 = var17;
               }

               if (var23 * 6.0 < 1.0) {
                  var13 = var23 * 6.0 * (var15 - var17) + var17;
               } else if (var23 * 2.0 < 1.0) {
                  var13 = var15;
               } else if (3.0 * var23 < 2.0) {
                  var13 = 6.0 * (0.6666666666666666 - var23) * (var15 - var17) + var17;
               } else {
                  var13 = var17;
               }
            }

            var9 = Math.pow(var9, var0);
            var11 = Math.pow(var11, var0);
            var13 = Math.pow(var13, var0);
            int var25 = (int)(256.0 * var9);
            int var16 = (int)(var11 * 256.0);
            int var26 = (int)(var13 * 256.0);
            int var18 = (var25 << 16) + (var16 << 8) + var26;
            an[var2] = var18 & 16777215;
         }

      }
   }

   static void ac() {
      if (an == null) {
         an = new int[65536];
         double var0 = 0.949999988079071;

         for(int var2 = 0; var2 < 65536; ++var2) {
            double var3 = 0.0078125 + (double)(var2 >> 10 & 63) / 64.0;
            double var5 = (double)(var2 >> 7 & 7) / 8.0 + 0.0625;
            double var7 = (double)(var2 & 127) / 128.0;
            double var9 = var7;
            double var11 = var7;
            double var13 = var7;
            if (var5 != 0.0) {
               double var15;
               if (var7 < 0.5) {
                  var15 = var7 * (1.0 + var5);
               } else {
                  var15 = var5 + var7 - var5 * var7;
               }

               double var17 = var7 * 2.0 - var15;
               double var19 = 0.3333333333333333 + var3;
               if (var19 > 1.0) {
                  --var19;
               }

               double var23 = var3 - 0.3333333333333333;
               if (var23 < 0.0) {
                  ++var23;
               }

               if (6.0 * var19 < 1.0) {
                  var9 = var17 + var19 * 6.0 * (var15 - var17);
               } else if (var19 * 2.0 < 1.0) {
                  var9 = var15;
               } else if (3.0 * var19 < 2.0) {
                  var9 = var17 + 6.0 * (var15 - var17) * (0.6666666666666666 - var19);
               } else {
                  var9 = var17;
               }

               if (6.0 * var3 < 1.0) {
                  var11 = 6.0 * (var15 - var17) * var3 + var17;
               } else if (2.0 * var3 < 1.0) {
                  var11 = var15;
               } else if (3.0 * var3 < 2.0) {
                  var11 = (var15 - var17) * (0.6666666666666666 - var3) * 6.0 + var17;
               } else {
                  var11 = var17;
               }

               if (var23 * 6.0 < 1.0) {
                  var13 = var23 * 6.0 * (var15 - var17) + var17;
               } else if (var23 * 2.0 < 1.0) {
                  var13 = var15;
               } else if (3.0 * var23 < 2.0) {
                  var13 = 6.0 * (0.6666666666666666 - var23) * (var15 - var17) + var17;
               } else {
                  var13 = var17;
               }
            }

            var9 = Math.pow(var9, var0);
            var11 = Math.pow(var11, var0);
            var13 = Math.pow(var13, var0);
            int var25 = (int)(256.0 * var9);
            int var16 = (int)(var11 * 256.0);
            int var26 = (int)(var13 * 256.0);
            int var18 = (var25 << 16) + (var16 << 8) + var26;
            an[var2] = var18 & 16777215;
         }

      }
   }

   static {
      for(int var0 = 0; var0 < 32768; ++var0) {
         int[] var1 = af;
         double var4 = (double)(var0 >> 10 & 31) / 31.0;
         double var6 = (double)(var0 >> 5 & 31) / 31.0;
         double var8 = (double)(var0 & 31) / 31.0;
         double var10 = var4;
         if (var6 < var4) {
            var10 = var6;
         }

         if (var8 < var10) {
            var10 = var8;
         }

         double var12 = var4;
         if (var6 > var4) {
            var12 = var6;
         }

         if (var8 > var12) {
            var12 = var8;
         }

         double var14 = 0.0;
         double var16 = 0.0;
         double var18 = (var10 + var12) / 2.0;
         if (var10 != var12) {
            if (var18 < 0.5) {
               var16 = (var12 - var10) / (var10 + var12);
            }

            if (var18 >= 0.5) {
               var16 = (var12 - var10) / (2.0 - var12 - var10);
            }

            if (var4 == var12) {
               var14 = (var6 - var8) / (var12 - var10);
            } else if (var6 == var12) {
               var14 = 2.0 + (var8 - var4) / (var12 - var10);
            } else if (var12 == var8) {
               var14 = (var4 - var6) / (var12 - var10) + 4.0;
            }
         }

         int var20 = (int)(var14 * 256.0 / 6.0);
         var20 &= 255;
         double var21 = var16 * 256.0;
         if (var21 < 0.0) {
            var21 = 0.0;
         } else if (var21 > 255.0) {
            var21 = 255.0;
         }

         if (var18 > 0.7) {
            var21 /= 2.0;
            var21 = Math.floor(var21);
         }

         if (var18 > 0.75) {
            var21 /= 2.0;
            var21 = Math.floor(var21);
         }

         if (var18 > 0.85) {
            var21 /= 2.0;
            var21 = Math.floor(var21);
         }

         if (var18 > 0.95) {
            var21 /= 2.0;
            var21 = Math.floor(var21);
         }

         if (var18 > 0.995) {
            var18 = 0.995;
         }

         int var23 = (int)(var21 / 32.0 + (double)(var20 / 4 * 8));
         int var3 = (int)(var18 * 128.0) + (var23 << 7);
         var1[var0] = var3;
      }

      el.af(-798861149);
   }

   public static int ab(int var0) {
      return 255 - (var0 & 255);
   }

   public static int aq(int var0) {
      return -807600199 - (var0 & 894051046);
   }
}
