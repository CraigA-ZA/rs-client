public class qs {
   int an;
   float[] af;
   public static final int al = 17;

   static float aa(qs var0, float var1, float var2, float var3) {
      float var4 = qx.an(var0.af, var0.an * -1447439319, var1, -77202778);
      if (Math.abs(var4) < em.ac) {
         return var1;
      } else {
         float var5 = qx.an(var0.af, 439737475 * var0.an, var2, 250695684);
         if (Math.abs(var5) < em.ac) {
            return var2;
         } else {
            float var6 = 0.0F;
            float var7 = 0.0F;
            float var8 = 0.0F;
            float var13 = 0.0F;
            boolean var14 = true;
            boolean var15 = false;

            do {
               var15 = false;
               if (var14) {
                  var6 = var1;
                  var13 = var4;
                  var7 = var2 - var1;
                  var8 = var7;
                  var14 = false;
               }

               if (Math.abs(var13) < Math.abs(var5)) {
                  var1 = var2;
                  var2 = var6;
                  var6 = var1;
                  var4 = var5;
                  var5 = var13;
                  var13 = var4;
               }

               float var16 = em.au * Math.abs(var2) + 0.5F * var3;
               float var17 = 0.5F * (var6 - var2);
               boolean var18 = Math.abs(var17) > var16 && var5 != 0.0F;
               if (var18) {
                  if (!(Math.abs(var8) < var16) && !(Math.abs(var4) <= Math.abs(var5))) {
                     float var12 = var5 / var4;
                     float var9;
                     float var10;
                     if (var6 == var1) {
                        var9 = var12 * 2.0F * var17;
                        var10 = 1.0F - var12;
                     } else {
                        var10 = var4 / var13;
                        float var11 = var5 / var13;
                        var9 = ((var10 - var11) * 2.0F * var17 * var10 - (var2 - var1) * (var11 - 1.0F)) * var12;
                        var10 = (var10 - 1.0F) * (var11 - 1.0F) * (var12 - 1.0F);
                     }

                     if ((double)var9 > 0.0) {
                        var10 = -var10;
                     } else {
                        var9 = -var9;
                     }

                     var12 = var8;
                     var8 = var7;
                     if (var9 * 2.0F < var17 * 3.0F * var10 - Math.abs(var16 * var10) && var9 < Math.abs(var12 * 0.5F * var10)) {
                        var7 = var9 / var10;
                     } else {
                        var7 = var17;
                        var8 = var17;
                     }
                  } else {
                     var7 = var17;
                     var8 = var17;
                  }

                  var1 = var2;
                  var4 = var5;
                  if (Math.abs(var7) > var16) {
                     var2 += var7;
                  } else if ((double)var17 > 0.0) {
                     var2 += var16;
                  } else {
                     var2 -= var16;
                  }

                  var5 = qx.an(var0.af, 754853883 * var0.an, var2, 1056968805);
                  if ((double)(var5 * (var13 / Math.abs(var13))) > 0.0) {
                     var14 = true;
                     var15 = true;
                  } else {
                     var15 = true;
                  }
               }
            } while(var15);

            return var2;
         }
      }
   }

   public static int ac(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
      float var7 = 0.0F;

      for(int var8 = 0; var8 < var1 + 1; ++var8) {
         var7 += Math.abs(var0[var8]);
      }

      float var21 = (Math.abs(var2) + Math.abs(var4)) * (float)(1 + var1) * em.ac;
      if (var7 <= var21) {
         return -1;
      } else {
         float[] var9 = new float[1 + var1];

         int var10;
         for(var10 = 0; var10 < var1 + 1; ++var10) {
            var9[var10] = 1.0F / var7 * var0[var10];
         }

         while(Math.abs(var9[var1]) < var21) {
            --var1;
         }

         var10 = 0;
         if (0 == var1) {
            return var10;
         } else if (var1 == 1) {
            var6[0] = -var9[0] / var9[1];
            boolean var22 = var3 ? var2 < var21 + var6[0] : var2 < var6[0] - var21;
            boolean var23 = var5 ? var4 > var6[0] - var21 : var4 > var21 + var6[0];
            var10 = var22 && var23 ? 1 : 0;
            if (var10 > 0) {
               if (var3 && var6[0] < var2) {
                  var6[0] = var2;
               } else if (var5 && var6[0] > var4) {
                  var6[0] = var4;
               }
            }

            return var10;
         } else {
            qs var11 = new qs(var9, var1);
            float[] var12 = new float[1 + var1];

            for(int var13 = 1; var13 <= var1; ++var13) {
               var12[var13 - 1] = (float)var13 * var9[var13];
            }

            float[] var24 = new float[1 + var1];
            int var14 = da.af(var12, var1 - 1, var2, false, var4, false, var24, (byte)-37);
            if (-1 == var14) {
               return 0;
            } else {
               boolean var15 = false;
               float var17 = 0.0F;
               float var18 = 0.0F;
               float var19 = 0.0F;

               for(int var20 = 0; var20 <= var14; ++var20) {
                  if (var10 > var1) {
                     return var10;
                  }

                  float var16;
                  if (var20 == 0) {
                     var16 = var2;
                     var18 = qx.an(var9, var1, var2, 71137999);
                     if (Math.abs(var18) <= var21 && var3) {
                        var6[var10++] = var2;
                     }
                  } else {
                     var16 = var19;
                     var18 = var17;
                  }

                  if (var20 == var14) {
                     var19 = var4;
                     var15 = false;
                  } else {
                     var19 = var24[var20];
                  }

                  var17 = qx.an(var9, var1, var19, 180182622);
                  if (var15) {
                     var15 = false;
                  } else if (Math.abs(var17) < var21) {
                     if (var20 != var14 || var5) {
                        var6[var10++] = var19;
                        var15 = true;
                     }
                  } else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) {
                     var6[var10++] = io.aw(var11, var16, var19, 0.0F, 556599317);
                     if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var21) {
                        var6[var10 - 2] = (var6[var10 - 1] + var6[var10 - 2]) * 0.5F;
                        --var10;
                     }
                  }
               }

               return var10;
            }
         }
      }
   }

   public static int au(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
      float var7 = 0.0F;

      for(int var8 = 0; var8 < var1 + 1; ++var8) {
         var7 += Math.abs(var0[var8]);
      }

      float var21 = (Math.abs(var2) + Math.abs(var4)) * (float)(1 + var1) * em.ac;
      if (var7 <= var21) {
         return -1;
      } else {
         float[] var9 = new float[1 + var1];

         int var10;
         for(var10 = 0; var10 < var1 + 1; ++var10) {
            var9[var10] = 1.0F / var7 * var0[var10];
         }

         while(Math.abs(var9[var1]) < var21) {
            --var1;
         }

         var10 = 0;
         if (0 == var1) {
            return var10;
         } else if (var1 == 1) {
            var6[0] = -var9[0] / var9[1];
            boolean var22 = var3 ? var2 < var21 + var6[0] : var2 < var6[0] - var21;
            boolean var23 = var5 ? var4 > var6[0] - var21 : var4 > var21 + var6[0];
            var10 = var22 && var23 ? 1 : 0;
            if (var10 > 0) {
               if (var3 && var6[0] < var2) {
                  var6[0] = var2;
               } else if (var5 && var6[0] > var4) {
                  var6[0] = var4;
               }
            }

            return var10;
         } else {
            qs var11 = new qs(var9, var1);
            float[] var12 = new float[1 + var1];

            for(int var13 = 1; var13 <= var1; ++var13) {
               var12[var13 - 1] = (float)var13 * var9[var13];
            }

            float[] var24 = new float[1 + var1];
            int var14 = da.af(var12, var1 - 1, var2, false, var4, false, var24, (byte)-120);
            if (-1 == var14) {
               return 0;
            } else {
               boolean var15 = false;
               float var17 = 0.0F;
               float var18 = 0.0F;
               float var19 = 0.0F;

               for(int var20 = 0; var20 <= var14; ++var20) {
                  if (var10 > var1) {
                     return var10;
                  }

                  float var16;
                  if (var20 == 0) {
                     var16 = var2;
                     var18 = qx.an(var9, var1, var2, 1210257683);
                     if (Math.abs(var18) <= var21 && var3) {
                        var6[var10++] = var2;
                     }
                  } else {
                     var16 = var19;
                     var18 = var17;
                  }

                  if (var20 == var14) {
                     var19 = var4;
                     var15 = false;
                  } else {
                     var19 = var24[var20];
                  }

                  var17 = qx.an(var9, var1, var19, -627943205);
                  if (var15) {
                     var15 = false;
                  } else if (Math.abs(var17) < var21) {
                     if (var20 != var14 || var5) {
                        var6[var10++] = var19;
                        var15 = true;
                     }
                  } else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) {
                     var6[var10++] = io.aw(var11, var16, var19, 0.0F, 98641121);
                     if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var21) {
                        var6[var10 - 2] = (var6[var10 - 1] + var6[var10 - 2]) * 0.5F;
                        --var10;
                     }
                  }
               }

               return var10;
            }
         }
      }
   }

   static float ay(qs var0, float var1, float var2, float var3) {
      float var4 = qx.an(var0.af, var0.an * 754853883, var1, -797969939);
      if (Math.abs(var4) < em.ac) {
         return var1;
      } else {
         float var5 = qx.an(var0.af, 754853883 * var0.an, var2, 1119174826);
         if (Math.abs(var5) < em.ac) {
            return var2;
         } else {
            float var6 = 0.0F;
            float var7 = 0.0F;
            float var8 = 0.0F;
            float var13 = 0.0F;
            boolean var14 = true;
            boolean var15 = false;

            do {
               var15 = false;
               if (var14) {
                  var6 = var1;
                  var13 = var4;
                  var7 = var2 - var1;
                  var8 = var7;
                  var14 = false;
               }

               if (Math.abs(var13) < Math.abs(var5)) {
                  var1 = var2;
                  var2 = var6;
                  var6 = var1;
                  var4 = var5;
                  var5 = var13;
                  var13 = var4;
               }

               float var16 = em.au * Math.abs(var2) + 0.5F * var3;
               float var17 = 0.5F * (var6 - var2);
               boolean var18 = Math.abs(var17) > var16 && var5 != 0.0F;
               if (var18) {
                  if (!(Math.abs(var8) < var16) && !(Math.abs(var4) <= Math.abs(var5))) {
                     float var12 = var5 / var4;
                     float var9;
                     float var10;
                     if (var6 == var1) {
                        var9 = var12 * 2.0F * var17;
                        var10 = 1.0F - var12;
                     } else {
                        var10 = var4 / var13;
                        float var11 = var5 / var13;
                        var9 = ((var10 - var11) * 2.0F * var17 * var10 - (var2 - var1) * (var11 - 1.0F)) * var12;
                        var10 = (var10 - 1.0F) * (var11 - 1.0F) * (var12 - 1.0F);
                     }

                     if ((double)var9 > 0.0) {
                        var10 = -var10;
                     } else {
                        var9 = -var9;
                     }

                     var12 = var8;
                     var8 = var7;
                     if (var9 * 2.0F < var17 * 3.0F * var10 - Math.abs(var16 * var10) && var9 < Math.abs(var12 * 0.5F * var10)) {
                        var7 = var9 / var10;
                     } else {
                        var7 = var17;
                        var8 = var17;
                     }
                  } else {
                     var7 = var17;
                     var8 = var17;
                  }

                  var1 = var2;
                  var4 = var5;
                  if (Math.abs(var7) > var16) {
                     var2 += var7;
                  } else if ((double)var17 > 0.0) {
                     var2 += var16;
                  } else {
                     var2 -= var16;
                  }

                  var5 = qx.an(var0.af, 754853883 * var0.an, var2, 711061171);
                  if ((double)(var5 * (var13 / Math.abs(var13))) > 0.0) {
                     var14 = true;
                     var15 = true;
                  } else {
                     var15 = true;
                  }
               }
            } while(var15);

            return var2;
         }
      }
   }

   static float aq(float[] var0, int var1, float var2) {
      float var3 = var0[var1];

      for(int var4 = var1 - 1; var4 >= 0; --var4) {
         var3 = var0[var4] + var3 * var2;
      }

      return var3;
   }

   static float al(float[] var0, int var1, float var2) {
      float var3 = var0[var1];

      for(int var4 = var1 - 1; var4 >= 0; --var4) {
         var3 = var0[var4] + var3 * var2;
      }

      return var3;
   }

   qs(float[] var1, int var2) {
      try {
         super();
         this.af = var1;
         this.an = var2 * 1021233971;
      } catch (RuntimeException var3) {
         throw db.an(var3, "qs.<init>(" + ')');
      }
   }

   static float at(float[] var0, int var1, float var2) {
      float var3 = var0[var1];

      for(int var4 = var1 - 1; var4 >= 0; --var4) {
         var3 = var0[var4] + var3 * var2;
      }

      return var3;
   }

   static float ab(float[] var0, int var1, float var2) {
      float var3 = var0[var1];

      for(int var4 = var1 - 1; var4 >= 0; --var4) {
         var3 = var0[var4] + var3 * var2;
      }

      return var3;
   }
}
