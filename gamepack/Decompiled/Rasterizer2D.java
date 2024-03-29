public class Rasterizer2D extends DualNode {
   public static float[] by;
   public static int Rasterizer2D_width;
   public static int Rasterizer2D_height;
   public static int Rasterizer2D_yClipEnd = 0;
   public static int Rasterizer2D_yClipStart = 0;
   public static int Rasterizer2D_xClipStart = 0;
   public static int Rasterizer2D_xClipEnd = 0;
   public static int[] Rasterizer2D_pixels;

   protected Rasterizer2D() {
   }

   protected static void Rasterizer2D_replace(int[] var0, int var1, int var2, float[] var3) {
      Rasterizer2D_pixels = var0;
      Rasterizer2D_width = var1;
      Rasterizer2D_height = var2;
      by = var3;
      Rasterizer2D_setClip(0, 0, var1, var2);
   }

   public static void Rasterizer2D_resetClip() {
      Rasterizer2D_xClipStart = 0;
      Rasterizer2D_yClipStart = 0;
      Rasterizer2D_xClipEnd = Rasterizer2D_width;
      Rasterizer2D_yClipEnd = Rasterizer2D_height;
   }

   public static void Rasterizer2D_setClip(int var0, int var1, int var2, int var3) {
      if (var0 < 0) {
         var0 = 0;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > Rasterizer2D_width) {
         var2 = Rasterizer2D_width;
      }

      if (var3 > Rasterizer2D_height) {
         var3 = Rasterizer2D_height;
      }

      Rasterizer2D_xClipStart = var0;
      Rasterizer2D_yClipStart = var1;
      Rasterizer2D_xClipEnd = var2;
      Rasterizer2D_yClipEnd = var3;
   }

   public static void Rasterizer2D_expandClip(int var0, int var1, int var2, int var3) {
      if (Rasterizer2D_xClipStart < var0) {
         Rasterizer2D_xClipStart = var0;
      }

      if (Rasterizer2D_yClipStart < var1) {
         Rasterizer2D_yClipStart = var1;
      }

      if (Rasterizer2D_xClipEnd > var2) {
         Rasterizer2D_xClipEnd = var2;
      }

      if (Rasterizer2D_yClipEnd > var3) {
         Rasterizer2D_yClipEnd = var3;
      }

   }

   public static void Rasterizer2D_getClipArray(int[] var0) {
      var0[0] = Rasterizer2D_xClipStart;
      var0[1] = Rasterizer2D_yClipStart;
      var0[2] = Rasterizer2D_xClipEnd;
      var0[3] = Rasterizer2D_yClipEnd;
   }

   public static void Rasterizer2D_setClipArray(int[] var0) {
      Rasterizer2D_xClipStart = var0[0];
      Rasterizer2D_yClipStart = var0[1];
      Rasterizer2D_xClipEnd = var0[2];
      Rasterizer2D_yClipEnd = var0[3];
   }

   public static void er() {
      int var0 = 0;

      int var1;
      for(var1 = Rasterizer2D_width * Rasterizer2D_height - 7; var0 < var1; Rasterizer2D_pixels[var0++] = 0) {
         Rasterizer2D_pixels[var0++] = 0;
         Rasterizer2D_pixels[var0++] = 0;
         Rasterizer2D_pixels[var0++] = 0;
         Rasterizer2D_pixels[var0++] = 0;
         Rasterizer2D_pixels[var0++] = 0;
         Rasterizer2D_pixels[var0++] = 0;
         Rasterizer2D_pixels[var0++] = 0;
      }

      for(var1 += 7; var0 < var1; Rasterizer2D_pixels[var0++] = 0) {
      }

      fd();
   }

   static void eg_renamed(int var0, int var1, int var2, int var3) {
      if (var2 == 0) {
         Rasterizer2D_setPixel(var0, var1, var3);
      } else {
         if (var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if (var4 < Rasterizer2D_yClipStart) {
            var4 = Rasterizer2D_yClipStart;
         }

         int var5 = var1 + var2 + 1;
         if (var5 > Rasterizer2D_yClipEnd) {
            var5 = Rasterizer2D_yClipEnd;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if (var1 > var5) {
            var1 = var5;
         }

         int var12;
         int var13;
         int var14;
         int var15;
         while(var6 < var1) {
            while(var11 <= var7 || var10 <= var7) {
               var10 += var8 + var8;
               var11 += var8++ + var8;
            }

            var12 = var0 - var8 + 1;
            if (var12 < Rasterizer2D_xClipStart) {
               var12 = Rasterizer2D_xClipStart;
            }

            var13 = var0 + var8;
            if (var13 > Rasterizer2D_xClipEnd) {
               var13 = Rasterizer2D_xClipEnd;
            }

            var14 = var12 + var6 * Rasterizer2D_width;

            for(var15 = var12; var15 < var13; ++var15) {
               Rasterizer2D_pixels[var14++] = var3;
            }

            ++var6;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var9 * var9 + var7;
         var10 = var11 - var2;

         for(var11 -= var9; var6 < var5; var10 += var9++ + var9) {
            while(var11 > var7 && var10 > var7) {
               var11 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            var12 = var0 - var8;
            if (var12 < Rasterizer2D_xClipStart) {
               var12 = Rasterizer2D_xClipStart;
            }

            var13 = var0 + var8;
            if (var13 > Rasterizer2D_xClipEnd - 1) {
               var13 = Rasterizer2D_xClipEnd - 1;
            }

            var14 = var12 + var6 * Rasterizer2D_width;

            for(var15 = var12; var15 <= var13; ++var15) {
               Rasterizer2D_pixels[var14++] = var3;
            }

            ++var6;
            var11 += var9 + var9;
         }

      }
   }

   public static void ed_renamed(int var0, int var1, int var2, int var3, int var4) {
      if (var4 != 0) {
         if (var4 == 256) {
            eg_renamed(var0, var1, var2, var3);
         } else {
            if (var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 255) * var4;
            int var7 = (var3 >> 8 & 255) * var4;
            int var8 = (var3 & 255) * var4;
            int var12 = var1 - var2;
            if (var12 < Rasterizer2D_yClipStart) {
               var12 = Rasterizer2D_yClipStart;
            }

            int var13 = var1 + var2 + 1;
            if (var13 > Rasterizer2D_yClipEnd) {
               var13 = Rasterizer2D_yClipEnd;
            }

            int var14 = var12;
            int var15 = var2 * var2;
            int var16 = 0;
            int var17 = var1 - var12;
            int var18 = var17 * var17;
            int var19 = var18 - var17;
            if (var1 > var13) {
               var1 = var13;
            }

            int var9;
            int var10;
            int var11;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            while(var14 < var1) {
               while(var19 <= var15 || var18 <= var15) {
                  var18 += var16 + var16;
                  var19 += var16++ + var16;
               }

               var20 = var0 - var16 + 1;
               if (var20 < Rasterizer2D_xClipStart) {
                  var20 = Rasterizer2D_xClipStart;
               }

               var21 = var0 + var16;
               if (var21 > Rasterizer2D_xClipEnd) {
                  var21 = Rasterizer2D_xClipEnd;
               }

               var22 = var20 + var14 * Rasterizer2D_width;

               for(var23 = var20; var23 < var21; ++var23) {
                  var9 = (Rasterizer2D_pixels[var22] >> 16 & 255) * var5;
                  var10 = (Rasterizer2D_pixels[var22] >> 8 & 255) * var5;
                  var11 = (Rasterizer2D_pixels[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  Rasterizer2D_pixels[var22++] = var24;
               }

               ++var14;
               var18 -= var17-- + var17;
               var19 -= var17 + var17;
            }

            var16 = var2;
            var17 = -var17;
            var19 = var17 * var17 + var15;
            var18 = var19 - var2;

            for(var19 -= var17; var14 < var13; var18 += var17++ + var17) {
               while(var19 > var15 && var18 > var15) {
                  var19 -= var16-- + var16;
                  var18 -= var16 + var16;
               }

               var20 = var0 - var16;
               if (var20 < Rasterizer2D_xClipStart) {
                  var20 = Rasterizer2D_xClipStart;
               }

               var21 = var0 + var16;
               if (var21 > Rasterizer2D_xClipEnd - 1) {
                  var21 = Rasterizer2D_xClipEnd - 1;
               }

               var22 = var20 + var14 * Rasterizer2D_width;

               for(var23 = var20; var23 <= var21; ++var23) {
                  var9 = (Rasterizer2D_pixels[var22] >> 16 & 255) * var5;
                  var10 = (Rasterizer2D_pixels[var22] >> 8 & 255) * var5;
                  var11 = (Rasterizer2D_pixels[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  Rasterizer2D_pixels[var22++] = var24;
               }

               ++var14;
               var19 += var17 + var17;
            }

         }
      }
   }

   public static void ev_renamed(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 < Rasterizer2D_xClipStart) {
         var2 -= Rasterizer2D_xClipStart - var0;
         var0 = Rasterizer2D_xClipStart;
      }

      if (var1 < Rasterizer2D_yClipStart) {
         var3 -= Rasterizer2D_yClipStart - var1;
         var1 = Rasterizer2D_yClipStart;
      }

      if (var0 + var2 > Rasterizer2D_xClipEnd) {
         var2 = Rasterizer2D_xClipEnd - var0;
      }

      if (var1 + var3 > Rasterizer2D_yClipEnd) {
         var3 = Rasterizer2D_yClipEnd - var1;
      }

      var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & '\uff00') * var5 >> 8 & '\uff00');
      int var6 = 256 - var5;
      int var7 = Rasterizer2D_width - var2;
      int var8 = var0 + var1 * Rasterizer2D_width;

      for(int var9 = 0; var9 < var3; ++var9) {
         for(int var10 = -var2; var10 < 0; ++var10) {
            int var11 = Rasterizer2D_pixels[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & '\uff00') * var6 >> 8 & '\uff00');
            Rasterizer2D_pixels[var8++] = var4 + var11;
         }

         var8 += var7;
      }

   }

   public static void Rasterizer2D_fillRectangle(int var0, int var1, int var2, int var3, int var4) {
      if (var0 < Rasterizer2D_xClipStart) {
         var2 -= Rasterizer2D_xClipStart - var0;
         var0 = Rasterizer2D_xClipStart;
      }

      if (var1 < Rasterizer2D_yClipStart) {
         var3 -= Rasterizer2D_yClipStart - var1;
         var1 = Rasterizer2D_yClipStart;
      }

      if (var0 + var2 > Rasterizer2D_xClipEnd) {
         var2 = Rasterizer2D_xClipEnd - var0;
      }

      if (var1 + var3 > Rasterizer2D_yClipEnd) {
         var3 = Rasterizer2D_yClipEnd - var1;
      }

      int var5 = Rasterizer2D_width - var2;
      int var6 = var0 + var1 * Rasterizer2D_width;

      for(int var7 = -var3; var7 < 0; ++var7) {
         for(int var8 = -var2; var8 < 0; ++var8) {
            Rasterizer2D_pixels[var6++] = var4;
         }

         var6 += var5;
      }

   }

   public static void ew_renamed(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var2 > 0 && var3 > 0) {
         int var6 = 0;
         int var7 = 65536 / var3;
         if (var0 < Rasterizer2D_xClipStart) {
            var2 -= Rasterizer2D_xClipStart - var0;
            var0 = Rasterizer2D_xClipStart;
         }

         if (var1 < Rasterizer2D_yClipStart) {
            var6 += (Rasterizer2D_yClipStart - var1) * var7;
            var3 -= Rasterizer2D_yClipStart - var1;
            var1 = Rasterizer2D_yClipStart;
         }

         if (var0 + var2 > Rasterizer2D_xClipEnd) {
            var2 = Rasterizer2D_xClipEnd - var0;
         }

         if (var1 + var3 > Rasterizer2D_yClipEnd) {
            var3 = Rasterizer2D_yClipEnd - var1;
         }

         int var8 = Rasterizer2D_width - var2;
         int var9 = var0 + var1 * Rasterizer2D_width;

         for(int var10 = -var3; var10 < 0; ++var10) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & '\uff00') * var11 + (var5 & '\uff00') * var12 & 16711680) >>> 8;

            for(int var14 = -var2; var14 < 0; ++var14) {
               Rasterizer2D_pixels[var9++] = var13;
            }

            var9 += var8;
            var6 += var7;
         }

      }
   }

   public static void ex_renamed(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = 65536 / var3;
         if (var0 < Rasterizer2D_xClipStart) {
            var2 -= Rasterizer2D_xClipStart - var0;
            var0 = Rasterizer2D_xClipStart;
         }

         if (var1 < Rasterizer2D_yClipStart) {
            var8 += (Rasterizer2D_yClipStart - var1) * var9;
            var3 -= Rasterizer2D_yClipStart - var1;
            var1 = Rasterizer2D_yClipStart;
         }

         if (var0 + var2 > Rasterizer2D_xClipEnd) {
            var2 = Rasterizer2D_xClipEnd - var0;
         }

         if (var1 + var3 > Rasterizer2D_yClipEnd) {
            var3 = Rasterizer2D_yClipEnd - var1;
         }

         int var10 = Rasterizer2D_width - var2;
         int var11 = var0 + var1 * Rasterizer2D_width;

         for(int var12 = -var3; var12 < 0; ++var12) {
            int var13 = 65536 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (var6 * var13 + var7 * var14 & '\uff00') >>> 8;
            if (var15 == 0) {
               var11 += Rasterizer2D_width;
               var8 += var9;
            } else {
               int var16 = ((var4 & 16711935) * var13 + (var5 & 16711935) * var14 & -16711936) + ((var4 & '\uff00') * var13 + (var5 & '\uff00') * var14 & 16711680) >>> 8;
               int var17 = 255 - var15;
               int var18 = ((var16 & 16711935) * var15 >> 8 & 16711935) + ((var16 & '\uff00') * var15 >> 8 & '\uff00');

               for(int var19 = -var2; var19 < 0; ++var19) {
                  int var20 = Rasterizer2D_pixels[var11];
                  if (var20 == 0) {
                     Rasterizer2D_pixels[var11++] = var18;
                  } else {
                     var20 = ((var20 & 16711935) * var17 >> 8 & 16711935) + ((var20 & '\uff00') * var17 >> 8 & '\uff00');
                     Rasterizer2D_pixels[var11++] = var18 + var20;
                  }
               }

               var11 += var10;
               var8 += var9;
            }
         }

      }
   }

   public static void eh(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      if (var0 + var2 >= 0 && var1 + var3 >= 0) {
         if (var0 < Rasterizer2D_width && var1 < Rasterizer2D_height) {
            int var9 = 0;
            int var10 = 0;
            if (var0 < 0) {
               var9 -= var0;
               var2 += var0;
            }

            if (var1 < 0) {
               var10 -= var1;
               var3 += var1;
            }

            if (var0 + var2 > Rasterizer2D_width) {
               var2 = Rasterizer2D_width - var0;
            }

            if (var1 + var3 > Rasterizer2D_height) {
               var3 = Rasterizer2D_height - var1;
            }

            int var11 = var6.length / var7;
            int var12 = Rasterizer2D_width - var2;
            int var13 = var4 >>> 24;
            int var14 = var5 >>> 24;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            if (!var8 || var13 == 255 && var14 == 255) {
               var15 = (var1 + var10) * Rasterizer2D_width + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     if (var6[var18 * var7 + var19] != 0) {
                        Rasterizer2D_pixels[var15++] = var5;
                     } else {
                        Rasterizer2D_pixels[var15++] = var4;
                     }
                  }

                  var15 += var12;
               }
            } else {
               var15 = (var1 + var10) * Rasterizer2D_width + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     int var20 = var4;
                     if (var6[var18 * var7 + var19] != 0) {
                        var20 = var5;
                     }

                     int var21 = var20 >>> 24;
                     int var22 = 255 - var21;
                     int var23 = Rasterizer2D_pixels[var15];
                     int var24 = ((var20 & 16711935) * var21 + (var23 & 16711935) * var22 & -16711936) + ((var20 & '\uff00') * var21 + (var23 & '\uff00') * var22 & 16711680) >> 8;
                     Rasterizer2D_pixels[var15++] = var24;
                  }

                  var15 += var12;
               }
            }

         }
      }
   }

   public static void Rasterizer2D_drawRectangle(int var0, int var1, int var2, int var3, int var4) {
      Rasterizer2D_drawHorizontalLine(var0, var1, var2, var4);
      Rasterizer2D_drawHorizontalLine(var0, var1 + var3 - 1, var2, var4);
      Rasterizer2D_drawVerticalLine(var0, var1, var3, var4);
      Rasterizer2D_drawVerticalLine(var0 + var2 - 1, var1, var3, var4);
   }

   public static void Rasterizer2D_drawRectangleAlpha(int var0, int var1, int var2, int var3, int var4, int var5) {
      Rasterizer2D_drawHorizontalLineAlpha(var0, var1, var2, var4, var5);
      Rasterizer2D_drawHorizontalLineAlpha(var0, var1 + var3 - 1, var2, var4, var5);
      if (var3 >= 3) {
         Rasterizer2D_drawVerticalLineAlpha(var0, var1 + 1, var3 - 2, var4, var5);
         Rasterizer2D_drawVerticalLineAlpha(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }

   }

   public static void Rasterizer2D_drawHorizontalLine(int var0, int var1, int var2, int var3) {
      if (var1 >= Rasterizer2D_yClipStart && var1 < Rasterizer2D_yClipEnd) {
         if (var0 < Rasterizer2D_xClipStart) {
            var2 -= Rasterizer2D_xClipStart - var0;
            var0 = Rasterizer2D_xClipStart;
         }

         if (var0 + var2 > Rasterizer2D_xClipEnd) {
            var2 = Rasterizer2D_xClipEnd - var0;
         }

         int var4 = var0 + var1 * Rasterizer2D_width;

         for(int var5 = 0; var5 < var2; ++var5) {
            Rasterizer2D_pixels[var4 + var5] = var3;
         }

      }
   }

   static void Rasterizer2D_drawHorizontalLineAlpha(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= Rasterizer2D_yClipStart && var1 < Rasterizer2D_yClipEnd) {
         if (var0 < Rasterizer2D_xClipStart) {
            var2 -= Rasterizer2D_xClipStart - var0;
            var0 = Rasterizer2D_xClipStart;
         }

         if (var0 + var2 > Rasterizer2D_xClipEnd) {
            var2 = Rasterizer2D_xClipEnd - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * Rasterizer2D_width;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (Rasterizer2D_pixels[var12] >> 16 & 255) * var5;
            int var10 = (Rasterizer2D_pixels[var12] >> 8 & 255) * var5;
            int var11 = (Rasterizer2D_pixels[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            Rasterizer2D_pixels[var12++] = var14;
         }

      }
   }

   public static void Rasterizer2D_drawVerticalLine(int var0, int var1, int var2, int var3) {
      if (var0 >= Rasterizer2D_xClipStart && var0 < Rasterizer2D_xClipEnd) {
         if (var1 < Rasterizer2D_yClipStart) {
            var2 -= Rasterizer2D_yClipStart - var1;
            var1 = Rasterizer2D_yClipStart;
         }

         if (var1 + var2 > Rasterizer2D_yClipEnd) {
            var2 = Rasterizer2D_yClipEnd - var1;
         }

         int var4 = var0 + var1 * Rasterizer2D_width;

         for(int var5 = 0; var5 < var2; ++var5) {
            Rasterizer2D_pixels[var4 + var5 * Rasterizer2D_width] = var3;
         }

      }
   }

   static void Rasterizer2D_drawVerticalLineAlpha(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= Rasterizer2D_xClipStart && var0 < Rasterizer2D_xClipEnd) {
         if (var1 < Rasterizer2D_yClipStart) {
            var2 -= Rasterizer2D_yClipStart - var1;
            var1 = Rasterizer2D_yClipStart;
         }

         if (var1 + var2 > Rasterizer2D_yClipEnd) {
            var2 = Rasterizer2D_yClipEnd - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * Rasterizer2D_width;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (Rasterizer2D_pixels[var12] >> 16 & 255) * var5;
            int var10 = (Rasterizer2D_pixels[var12] >> 8 & 255) * var5;
            int var11 = (Rasterizer2D_pixels[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            Rasterizer2D_pixels[var12] = var14;
            var12 += Rasterizer2D_width;
         }

      }
   }

   public static void Rasterizer2D_drawLine(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if (var3 == 0) {
         if (var2 >= 0) {
            Rasterizer2D_drawHorizontalLine(var0, var1, var2 + 1, var4);
         } else {
            Rasterizer2D_drawHorizontalLine(var0 + var2, var1, -var2 + 1, var4);
         }

      } else if (var2 == 0) {
         if (var3 >= 0) {
            Rasterizer2D_drawVerticalLine(var0, var1, var3 + 1, var4);
         } else {
            Rasterizer2D_drawVerticalLine(var0, var1 + var3, -var3 + 1, var4);
         }

      } else {
         if (var2 + var3 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         int var5;
         int var6;
         if (var2 > var3) {
            var1 <<= 16;
            var1 += 32768;
            var3 <<= 16;
            var5 = (int)Math.floor((double)var3 / (double)var2 + 0.5);
            var2 += var0;
            if (var0 < Rasterizer2D_xClipStart) {
               var1 += var5 * (Rasterizer2D_xClipStart - var0);
               var0 = Rasterizer2D_xClipStart;
            }

            if (var2 >= Rasterizer2D_xClipEnd) {
               var2 = Rasterizer2D_xClipEnd - 1;
            }

            while(var0 <= var2) {
               var6 = var1 >> 16;
               if (var6 >= Rasterizer2D_yClipStart && var6 < Rasterizer2D_yClipEnd) {
                  Rasterizer2D_pixels[var0 + var6 * Rasterizer2D_width] = var4;
               }

               var1 += var5;
               ++var0;
            }
         } else {
            var0 <<= 16;
            var0 += 32768;
            var2 <<= 16;
            var5 = (int)Math.floor((double)var2 / (double)var3 + 0.5);
            var3 += var1;
            if (var1 < Rasterizer2D_yClipStart) {
               var0 += var5 * (Rasterizer2D_yClipStart - var1);
               var1 = Rasterizer2D_yClipStart;
            }

            if (var3 >= Rasterizer2D_yClipEnd) {
               var3 = Rasterizer2D_yClipEnd - 1;
            }

            while(var1 <= var3) {
               var6 = var0 >> 16;
               if (var6 >= Rasterizer2D_xClipStart && var6 < Rasterizer2D_xClipEnd) {
                  Rasterizer2D_pixels[var6 + var1 * Rasterizer2D_width] = var4;
               }

               var0 += var5;
               ++var1;
            }
         }

      }
   }

   static void Rasterizer2D_setPixel(int var0, int var1, int var2) {
      if (var0 >= Rasterizer2D_xClipStart && var1 >= Rasterizer2D_yClipStart && var0 < Rasterizer2D_xClipEnd && var1 < Rasterizer2D_yClipEnd) {
         Rasterizer2D_pixels[var0 + var1 * Rasterizer2D_width] = var2;
      }
   }

   public static void fx(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + var1 * Rasterizer2D_width;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            Rasterizer2D_pixels[var6++] = var2;
         }

         var5 += Rasterizer2D_width;
      }

   }

   public static void fd() {
      if (by != null) {
         int var0;
         int var1;
         int var2;
         if (Rasterizer2D_xClipStart == 0 && Rasterizer2D_xClipEnd == Rasterizer2D_width && Rasterizer2D_yClipStart == 0 && Rasterizer2D_yClipEnd == Rasterizer2D_height) {
            var0 = by.length;
            var1 = var0 - (var0 & 7);

            for(var2 = 0; var2 < var1; by[var2++] = 0.0F) {
               by[var2++] = 0.0F;
               by[var2++] = 0.0F;
               by[var2++] = 0.0F;
               by[var2++] = 0.0F;
               by[var2++] = 0.0F;
               by[var2++] = 0.0F;
               by[var2++] = 0.0F;
            }

            while(var2 < var0) {
               by[var2++] = 0.0F;
            }
         } else {
            var0 = Rasterizer2D_xClipEnd - Rasterizer2D_xClipStart;
            var1 = Rasterizer2D_yClipEnd - Rasterizer2D_yClipStart;
            var2 = Rasterizer2D_width - var0;
            int var3 = Rasterizer2D_xClipStart + Rasterizer2D_yClipStart * Rasterizer2D_width;
            int var4 = var0 >> 3;
            int var5 = var0 & 7;
            var0 = var3 - 1;

            for(int var7 = -var1; var7 < 0; ++var7) {
               int var6;
               if (var4 > 0) {
                  var6 = var4;

                  do {
                     ++var0;
                     by[var0] = 0.0F;
                     ++var0;
                     by[var0] = 0.0F;
                     ++var0;
                     by[var0] = 0.0F;
                     ++var0;
                     by[var0] = 0.0F;
                     ++var0;
                     by[var0] = 0.0F;
                     ++var0;
                     by[var0] = 0.0F;
                     ++var0;
                     by[var0] = 0.0F;
                     ++var0;
                     by[var0] = 0.0F;
                     --var6;
                  } while(var6 > 0);
               }

               if (var5 > 0) {
                  var6 = var5;

                  do {
                     ++var0;
                     by[var0] = 0.0F;
                     --var6;
                  } while(var6 > 0);
               }

               var0 += var2;
            }
         }

      }
   }

   public static void fb() {
      if (by != null) {
         int var0 = by.length;

         for(int var1 = 0; var1 < var0; ++var1) {
            if (var1 % Rasterizer2D_width < Rasterizer2D_width / 2 && by[var1] > 0.0F) {
               float var3 = by[var1];
               float var4 = 75.0F;
               float var5 = 10000.0F;
               float var6 = 750000.0F / (10000.0F - 9925.0F * var3);
               float var2 = (var6 - 75.0F) / 9925.0F;
               int var7 = (int)(255.0F * var2);
               Rasterizer2D_pixels[var1] = var7 << 16 | var7 << 8 | var7;
            }
         }

      }
   }
}
