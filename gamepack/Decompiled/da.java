public class da {
   static final da aa = new da(9);
   static final da ab = new da(5);
   static final da ac = new da(3);
   static final da af = new da(0);
   static final da ag = new da(14);
   static final da ah = new da(15);
   static final da ai = new da(13);
   static final da al = new da(7);
   static final da an = new da(1);
   static final da ao = new da(11);
   static final da aq = new da(6);
   static final da at = new da(8);
   static final da au = new da(4);
   static final da aw = new da(2);
   static final da ax = new da(12);
   static final da ay = new da(10);
   int av;

   public static int af_renamed(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
      float var8 = 0.0F;

      for(int var9 = 0; var9 < var1 + 1; ++var9) {
         var8 += Math.abs(var0[var9]);
      }

      float var22 = (Math.abs(var2) + Math.abs(var4)) * (float)(1 + var1) * em.ac;
      if (var8 <= var22) {
         return -1;
      } else {
         float[] var10 = new float[1 + var1];

         int var11;
         for(var11 = 0; var11 < var1 + 1; ++var11) {
            var10[var11] = 1.0F / var8 * var0[var11];
         }

         while(Math.abs(var10[var1]) < var22) {
            --var1;
         }

         var11 = 0;
         if (0 == var1) {
            return var11;
         } else if (var1 == 1) {
            var6[0] = -var10[0] / var10[1];
            boolean var23 = var3 ? var2 < var22 + var6[0] : var2 < var6[0] - var22;
            boolean var24 = var5 ? var4 > var6[0] - var22 : var4 > var22 + var6[0];
            var11 = var23 && var24 ? 1 : 0;
            if (var11 > 0) {
               if (var3 && var6[0] < var2) {
                  var6[0] = var2;
               } else if (var5 && var6[0] > var4) {
                  var6[0] = var4;
               }
            }

            return var11;
         } else {
            qs var12 = new qs(var10, var1);
            float[] var13 = new float[1 + var1];

            for(int var14 = 1; var14 <= var1; ++var14) {
               var13[var14 - 1] = (float)var14 * var10[var14];
            }

            float[] var25 = new float[1 + var1];
            int var15 = af_renamed(var13, var1 - 1, var2, false, var4, false, var25);
            if (-1 == var15) {
               return 0;
            } else {
               boolean var16 = false;
               float var18 = 0.0F;
               float var19 = 0.0F;
               float var20 = 0.0F;

               for(int var21 = 0; var21 <= var15; ++var21) {
                  if (var11 > var1) {
                     return var11;
                  }

                  float var17;
                  if (var21 == 0) {
                     var17 = var2;
                     var19 = qx.an_renamed(var10, var1, var2);
                     if (Math.abs(var19) <= var22 && var3) {
                        var6[var11++] = var2;
                     }
                  } else {
                     var17 = var20;
                     var19 = var18;
                  }

                  if (var21 == var15) {
                     var20 = var4;
                     var16 = false;
                  } else {
                     var20 = var25[var21];
                  }

                  var18 = qx.an_renamed(var10, var1, var20);
                  if (var16) {
                     var16 = false;
                  } else if (Math.abs(var18) < var22) {
                     if (var21 != var15 || var5) {
                        var6[var11++] = var20;
                        var16 = true;
                     }
                  } else if (var19 < 0.0F && var18 > 0.0F || var19 > 0.0F && var18 < 0.0F) {
                     var6[var11++] = AnimFrameset.aw_renamed(var12, var17, var20, 0.0F);
                     if (var11 > 1 && var6[var11 - 2] >= var6[var11 - 1] - var22) {
                        var6[var11 - 2] = (var6[var11 - 1] + var6[var11 - 2]) * 0.5F;
                        --var11;
                     }
                  }
               }

               return var11;
            }
         }
      }
   }

   public static sh an_renamed(int var0) {
      int var2 = st.an[var0];
      if (var2 == 1) {
         return sh.af;
      } else if (2 == var2) {
         return sh.aw;
      } else {
         return 3 == var2 ? sh.an : null;
      }
   }

   da(int var1) {
      this.av = var1 * 1355363989;
   }

   static final void le_renamed(int var0, int var1, int var2, int var3, int var4) {
      Headbar.scrollBarSprites[0].aw(var0, var1);
      Headbar.scrollBarSprites[1].aw(var0, var3 + var1 - 16);
      Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.kq * 40021093);
      int var6 = (var3 - 32) * var3 / var4;
      if (var6 < 8) {
         var6 = 8;
      }

      int var7 = var2 * (var3 - 32 - var6) / (var4 - var3);
      Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16 + var7, 16, var6, 992783339 * Client.kw);
      Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, 16 + var1 + var7, var6, 1881503647 * Client.kj);
      Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var7 + var1 + 16, var6, Client.kj * 1881503647);
      Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var7 + var1 + 16, 16, Client.kj * 1881503647);
      Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, 17 + var1 + var7, 16, 1881503647 * Client.kj);
      Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, 16 + var1 + var7, var6, Client.kk * 1155936455);
      Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, 17 + var1 + var7, var6 - 1, 1155936455 * Client.kk);
      Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + 15 + var1 + var7, 16, Client.kk * 1155936455);
      Rasterizer2D.Rasterizer2D_drawHorizontalLine(1 + var0, 14 + var1 + var7 + var6, 15, 1155936455 * Client.kk);
   }

   static final int mh_renamed() {
      float var1 = 200.0F * ((float)aj.clientPreferences.av() - 0.5F);
      return 100 - Math.round(var1);
   }
}
