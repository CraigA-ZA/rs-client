public final class Bzip2Decompressor {
   static Bzip2State Bzip2Decompressor_state = new Bzip2State();

   Bzip2Decompressor() throws Throwable {
      throw new Error();
   }

   public static int Bzip2Decompressor_decompress(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      synchronized(Bzip2Decompressor_state) {
         Bzip2Decompressor_state.aq = var2;
         Bzip2Decompressor_state.al = var4 * -294994265;
         Bzip2Decompressor_state.aa = var0;
         Bzip2Decompressor_state.ay = 0;
         Bzip2Decompressor_state.ao = var1 * -1652051505;
         Bzip2Decompressor_state.av = 0;
         Bzip2Decompressor_state.ah = 0;
         Bzip2Decompressor_state.at = 0;
         Bzip2Decompressor_state.ax = 0;
         aw(Bzip2Decompressor_state);
         var1 -= Bzip2Decompressor_state.ao * -1452165841;
         Bzip2Decompressor_state.aq = null;
         Bzip2Decompressor_state.aa = null;
         return var1;
      }
   }

   static void an(Bzip2State var0) {
      byte var2 = var0.ai;
      int var3 = var0.ag * -845006579;
      int var4 = var0.az * -1752794807;
      int var5 = var0.aj * -152862273;
      int[] var6 = hf.ae;
      int var7 = var0.as * 1540039981;
      byte[] var8 = var0.aa;
      int var9 = var0.ay * -642536903;
      int var10 = var0.ao * -1452165841;
      int var12 = var0.bn * 311916497 + 1;

      label106:
      while(true) {
         if (var3 > 0) {
            while(true) {
               if (var10 == 0) {
                  break label106;
               }

               if (var3 == 1) {
                  if (var10 == 0) {
                     var3 = 1;
                     break label106;
                  }

                  var8[var9] = var2;
                  ++var9;
                  --var10;
                  break;
               }

               var8[var9] = var2;
               --var3;
               ++var9;
               --var10;
            }
         }

         while(var4 != var12) {
            var2 = (byte)var5;
            var7 = var6[var7];
            byte var1 = (byte)var7;
            var7 >>= 8;
            ++var4;
            if (var1 != var5) {
               var5 = var1;
               if (var10 == 0) {
                  var3 = 1;
                  break label106;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
            } else {
               if (var4 != var12) {
                  var3 = 2;
                  var7 = var6[var7];
                  var1 = (byte)var7;
                  var7 >>= 8;
                  ++var4;
                  if (var4 != var12) {
                     if (var1 != var5) {
                        var5 = var1;
                     } else {
                        var3 = 3;
                        var7 = var6[var7];
                        var1 = (byte)var7;
                        var7 >>= 8;
                        ++var4;
                        if (var4 != var12) {
                           if (var1 != var5) {
                              var5 = var1;
                           } else {
                              var7 = var6[var7];
                              var1 = (byte)var7;
                              var7 >>= 8;
                              ++var4;
                              var3 = (var1 & 255) + 4;
                              var7 = var6[var7];
                              var5 = (byte)var7;
                              var7 >>= 8;
                              ++var4;
                           }
                        }
                     }
                  }
                  continue label106;
               }

               if (var10 == 0) {
                  var3 = 1;
                  break label106;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
            }
         }

         var3 = 0;
         break;
      }

      int var13 = var0.ax * -1259159999;
      var0.ax += (var10 - var10) * 1808552385;
      if (var0.ax * -1259159999 < var13) {
      }

      var0.ai = var2;
      var0.ag = var3 * 1012547013;
      var0.az = var4 * 1591462137;
      var0.aj = var5 * 1585278527;
      hf.ae = var6;
      var0.as = var7 * -445680987;
      var0.aa = var8;
      var0.ay = var9 * -1766382583;
      var0.ao = var10 * -1652051505;
   }

   static void aw(Bzip2State var0) {
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = false;
      boolean var16 = false;
      boolean var17 = false;
      boolean var18 = false;
      boolean var19 = false;
      boolean var20 = false;
      boolean var21 = false;
      int var22 = 0;
      int[] var23 = null;
      int[] var24 = null;
      int[] var25 = null;
      var0.ar = -240280401;
      if (hf.ae == null) {
         hf.ae = new int[var0.ar * -2133275808];
      }

      boolean var26 = true;

      while(true) {
         while(var26) {
            byte var1 = ac(var0);
            if (var1 == 23) {
               return;
            }

            var1 = ac(var0);
            var1 = ac(var0);
            var1 = ac(var0);
            var1 = ac(var0);
            var1 = ac(var0);
            var1 = ac(var0);
            var1 = ac(var0);
            var1 = ac(var0);
            var1 = ac(var0);
            var1 = au(var0);
            if (var1 != 0) {
            }

            var0.am = 0;
            var1 = ac(var0);
            var0.am = (var0.am * 463465659 << 8 | var1 & 255) * -301762445;
            var1 = ac(var0);
            var0.am = (var0.am * 463465659 << 8 | var1 & 255) * -301762445;
            var1 = ac(var0);
            var0.am = (var0.am * 463465659 << 8 | var1 & 255) * -301762445;

            int var36;
            for(var36 = 0; var36 < 16; ++var36) {
               var1 = au(var0);
               if (var1 == 1) {
                  var0.bb[var36] = true;
               } else {
                  var0.bb[var36] = false;
               }
            }

            for(var36 = 0; var36 < 256; ++var36) {
               var0.by[var36] = false;
            }

            int var37;
            for(var36 = 0; var36 < 16; ++var36) {
               if (var0.bb[var36]) {
                  for(var37 = 0; var37 < 16; ++var37) {
                     var1 = au(var0);
                     if (var1 == 1) {
                        var0.by[var36 * 16 + var37] = true;
                     }
                  }
               }
            }

            aq(var0);
            int var39 = var0.ap * -1198613029 + 2;
            int var40 = ab(3, var0);
            int var41 = ab(15, var0);

            for(var36 = 0; var36 < var41; ++var36) {
               var37 = 0;

               while(true) {
                  var1 = au(var0);
                  if (var1 == 0) {
                     var0.bo[var36] = (byte)var37;
                     break;
                  }

                  ++var37;
               }
            }

            byte[] var27 = new byte[6];

            int var29;
            for(var29 = 0; var29 < var40; var29 = (byte)(var29 + 1)) {
               var27[var29] = (byte)var29;
            }

            int var28;
            for(var36 = 0; var36 < var41; ++var36) {
               var29 = var0.bo[var36];

               for(var28 = var27[var29]; var29 > 0; var29 = (byte)(var29 - 1)) {
                  var27[var29] = var27[var29 - 1];
               }

               var27[0] = (byte)var28;
               var0.bx[var36] = (byte)var28;
            }

            int var38;
            for(var38 = 0; var38 < var40; ++var38) {
               int var49 = ab(5, var0);

               for(var36 = 0; var36 < var39; ++var36) {
                  while(true) {
                     var1 = au(var0);
                     if (var1 == 0) {
                        var0.bz[var38][var36] = (byte)var49;
                        break;
                     }

                     var1 = au(var0);
                     if (var1 == 0) {
                        ++var49;
                     } else {
                        --var49;
                     }
                  }
               }
            }

            for(var38 = 0; var38 < var40; ++var38) {
               byte var2 = 32;
               byte var3 = 0;

               for(var36 = 0; var36 < var39; ++var36) {
                  if (var0.bz[var38][var36] > var3) {
                     var3 = var0.bz[var38][var36];
                  }

                  if (var0.bz[var38][var36] < var2) {
                     var2 = var0.bz[var38][var36];
                  }
               }

               al_renamed(var0.bm[var38], var0.bd[var38], var0.bt[var38], var0.bz[var38], var2, var3, var39);
               var0.bj[var38] = var2;
            }

            int var42 = var0.ap * -1198613029 + 1;
            int var43 = -1;
            int var44 = 0;

            for(var36 = 0; var36 <= 255; ++var36) {
               var0.ak[var36] = 0;
            }

            var29 = 4095;

            int var54;
            for(var54 = 15; var54 >= 0; --var54) {
               for(var28 = 15; var28 >= 0; --var28) {
                  var0.be[var29] = (byte)(var54 * 16 + var28);
                  --var29;
               }

               var0.bk[var54] = var29 + 1;
            }

            int var46 = 0;
            byte var53;
            if (var44 == 0) {
               ++var43;
               var44 = 50;
               var53 = var0.bx[var43];
               var22 = var0.bj[var53];
               var23 = var0.bm[var53];
               var25 = var0.bt[var53];
               var24 = var0.bd[var53];
            }

            --var44;
            int var50 = var22;

            int var51;
            byte var52;
            for(var51 = ab(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
               ++var50;
               var52 = au(var0);
            }

            int var45 = var25[var51 - var24[var50]];

            while(true) {
               int[] var10000;
               int var10002;
               while(var45 != var42) {
                  if (var45 != 0 && var45 != 1) {
                     int var33 = var45 - 1;
                     int var30;
                     if (var33 < 16) {
                        var30 = var0.bk[0];

                        for(var1 = var0.be[var30 + var33]; var33 > 3; var33 -= 4) {
                           int var34 = var30 + var33;
                           var0.be[var34] = var0.be[var34 - 1];
                           var0.be[var34 - 1] = var0.be[var34 - 2];
                           var0.be[var34 - 2] = var0.be[var34 - 3];
                           var0.be[var34 - 3] = var0.be[var34 - 4];
                        }

                        while(var33 > 0) {
                           var0.be[var30 + var33] = var0.be[var30 + var33 - 1];
                           --var33;
                        }

                        var0.be[var30] = var1;
                     } else {
                        int var31 = var33 / 16;
                        int var32 = var33 % 16;
                        var30 = var0.bk[var31] + var32;

                        for(var1 = var0.be[var30]; var30 > var0.bk[var31]; --var30) {
                           var0.be[var30] = var0.be[var30 - 1];
                        }

                        for(var10002 = var0.bk[var31]++; var31 > 0; --var31) {
                           var10002 = var0.bk[var31]--;
                           var0.be[var0.bk[var31]] = var0.be[var0.bk[var31 - 1] + 16 - 1];
                        }

                        var10002 = var0.bk[0]--;
                        var0.be[var0.bk[0]] = var1;
                        if (var0.bk[0] == 0) {
                           var29 = 4095;

                           for(var54 = 15; var54 >= 0; --var54) {
                              for(var28 = 15; var28 >= 0; --var28) {
                                 var0.be[var29] = var0.be[var0.bk[var54] + var28];
                                 --var29;
                              }

                              var0.bk[var54] = var29 + 1;
                           }
                        }
                     }

                     var10002 = var0.ak[var0.bi[var1 & 255] & 255]++;
                     hf.ae[var46] = var0.bi[var1 & 255] & 255;
                     ++var46;
                     if (var44 == 0) {
                        ++var43;
                        var44 = 50;
                        var53 = var0.bx[var43];
                        var22 = var0.bj[var53];
                        var23 = var0.bm[var53];
                        var25 = var0.bt[var53];
                        var24 = var0.bd[var53];
                     }

                     --var44;
                     var50 = var22;

                     for(var51 = ab(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                        ++var50;
                        var52 = au(var0);
                     }

                     var45 = var25[var51 - var24[var50]];
                  } else {
                     int var47 = -1;
                     int var48 = 1;

                     do {
                        if (var45 == 0) {
                           var47 += 1 * var48;
                        } else if (var45 == 1) {
                           var47 += 2 * var48;
                        }

                        var48 *= 2;
                        if (var44 == 0) {
                           ++var43;
                           var44 = 50;
                           var53 = var0.bx[var43];
                           var22 = var0.bj[var53];
                           var23 = var0.bm[var53];
                           var25 = var0.bt[var53];
                           var24 = var0.bd[var53];
                        }

                        --var44;
                        var50 = var22;

                        for(var51 = ab(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                           ++var50;
                           var52 = au(var0);
                        }

                        var45 = var25[var51 - var24[var50]];
                     } while(var45 == 0 || var45 == 1);

                     ++var47;
                     var1 = var0.bi[var0.be[var0.bk[0]] & 255];
                     var10000 = var0.ak;

                     for(var10000[var1 & 255] += var47; var47 > 0; --var47) {
                        hf.ae[var46] = var1 & 255;
                        ++var46;
                     }
                  }
               }

               var0.ag = 0;
               var0.ai = 0;
               var0.ad[0] = 0;

               for(var36 = 1; var36 <= 256; ++var36) {
                  var0.ad[var36] = var0.ak[var36 - 1];
               }

               for(var36 = 1; var36 <= 256; ++var36) {
                  var10000 = var0.ad;
                  var10000[var36] += var0.ad[var36 - 1];
               }

               for(var36 = 0; var36 < var46; ++var36) {
                  var1 = (byte)(hf.ae[var36] & 255);
                  var10000 = hf.ae;
                  int var10001 = var0.ad[var1 & 255];
                  var10000[var10001] |= var36 << 8;
                  var10002 = var0.ad[var1 & 255]++;
               }

               var0.as = (hf.ae[var0.am * 463465659] >> 8) * -445680987;
               var0.az = 0;
               var0.as = hf.ae[var0.as * 1540039981] * -445680987;
               var0.aj = (byte)(var0.as * 1540039981 & 255) * 1585278527;
               var0.as = (var0.as * 1540039981 >> 8) * -445680987;
               var0.az += 1591462137;
               var0.bn = var46 * 1035354417;
               an(var0);
               if (var0.az * -1752794807 == var0.bn * 311916497 + 1 && var0.ag * -845006579 == 0) {
                  var26 = true;
                  break;
               }

               var26 = false;
               break;
            }
         }

         return;
      }
   }

   static byte ac(Bzip2State var0) {
      return (byte)ab(8, var0);
   }

   static byte au(Bzip2State var0) {
      return (byte)ab(1, var0);
   }

   static int ab(int var0, Bzip2State var1) {
      while(var1.av * -208048185 < var0) {
         var1.ah = (var1.ah * -993525011 << 8 | var1.aq[var1.al * 1648560407] & 255) * -348869915;
         var1.av += -394457160;
         var1.al += -294994265;
         var1.at += -806810571;
         if (var1.at * -1956977123 == 0) {
         }
      }

      int var2 = var1.ah * -993525011 >> var1.av * -208048185 - var0 & (1 << var0) - 1;
      var1.av -= var0 * -1123048969;
      return var2;
   }

   static void aq(Bzip2State var0) {
      var0.ap = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if (var0.by[var1]) {
            var0.bi[var0.ap * -1198613029] = (byte)var1;
            var0.ap += -1808394669;
         }
      }

   }

   static void al_renamed(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      int var8;
      for(var8 = var4; var8 <= var5; ++var8) {
         for(int var9 = 0; var9 < var6; ++var9) {
            if (var3[var9] == var8) {
               var2[var7] = var9;
               ++var7;
            }
         }
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var1[var8] = 0;
      }

      for(var8 = 0; var8 < var6; ++var8) {
         ++var1[var3[var8] + 1];
      }

      for(var8 = 1; var8 < 23; ++var8) {
         var1[var8] += var1[var8 - 1];
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var0[var8] = 0;
      }

      int var10 = 0;

      for(var8 = var4; var8 <= var5; ++var8) {
         var10 += var1[var8 + 1] - var1[var8];
         var0[var8] = var10 - 1;
         var10 <<= 1;
      }

      for(var8 = var4 + 1; var8 <= var5; ++var8) {
         var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
      }

   }
}
