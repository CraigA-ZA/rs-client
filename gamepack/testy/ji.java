public class ji extends ii {
   void bl(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      if (this.al.af) {
         if (var7 > this.al.ag * 571147771) {
            var7 = this.al.ag * 571147771;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         int var18 = var7 - var6;
         int var16;
         int var10000;
         int var17;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         int var24;
         if (this.an) {
            var24 = var6 - this.al.ax * 93675259;
            var10 += (var13 >> 3) * var24;
            var11 += (var14 >> 3) * var24;
            var12 += (var15 >> 3) * var24;
            var23 = var12 >> 12;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
               if (var19 < 0) {
                  var19 = 0;
               } else if (var19 > 4032) {
                  var19 = 4032;
               }
            } else {
               var19 = 0;
               var20 = 0;
            }

            var10 += var13;
            var11 += var14;
            var12 += var15;
            var23 = var12 >> 12;
            if (var23 != 0) {
               var21 = var10 / var23;
               var22 = var11 / var23;
               if (var21 < 0) {
                  var21 = 0;
               } else if (var21 > 4032) {
                  var21 = 4032;
               }
            } else {
               var21 = 0;
               var22 = 0;
            }

            var3 = (var19 << 20) + var20;
            var17 = (var21 - var19 >> 3 << 20) + (var22 - var20 >> 3);
            var18 >>= 3;
            var9 <<= 3;
            var16 = var8 >> 8;
            if (this.af) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var10000 = var3 + var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 12;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 4032) {
                           var21 = 4032;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 20) + var20;
                     var17 = (var21 - var19 >> 3 << 20) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var10000 = var3 + var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 12;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 4032) {
                           var21 = 4032;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 20) + var20;
                     var17 = (var21 - var19 >> 3 << 20) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            }
         } else {
            var24 = var6 - this.al.ax * 93675259;
            var10 += (var13 >> 3) * var24;
            var11 += (var14 >> 3) * var24;
            var12 += (var15 >> 3) * var24;
            var23 = var12 >> 14;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
               if (var19 < 0) {
                  var19 = 0;
               } else if (var19 > 16256) {
                  var19 = 16256;
               }
            } else {
               var19 = 0;
               var20 = 0;
            }

            var10 += var13;
            var11 += var14;
            var12 += var15;
            var23 = var12 >> 14;
            if (var23 != 0) {
               var21 = var10 / var23;
               var22 = var11 / var23;
               if (var21 < 0) {
                  var21 = 0;
               } else if (var21 > 16256) {
                  var21 = 16256;
               }
            } else {
               var21 = 0;
               var22 = 0;
            }

            var3 = (var19 << 18) + var20;
            var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
            var18 >>= 3;
            var9 <<= 3;
            var16 = var8 >> 8;
            if (this.af) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var10000 = var3 + var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 14;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 16256) {
                           var21 = 16256;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 18) + var20;
                     var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var10000 = var3 + var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 14;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 16256) {
                           var21 = 16256;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 18) + var20;
                     var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            }
         }

      }
   }

   void ab(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      int var13 = var5 - var4;
      int var14 = var2 - var1;
      int var15 = var6 - var4;
      int var16 = var3 - var1;
      int var17 = var11 - var10;
      int var18 = var12 - var10;
      int var19;
      if (var3 != var2) {
         var19 = (var6 - var5 << 14) / (var3 - var2);
      } else {
         var19 = 0;
      }

      int var20;
      if (var2 != var1) {
         var20 = (var13 << 14) / var14;
      } else {
         var20 = 0;
      }

      int var21;
      if (var3 != var1) {
         var21 = (var15 << 14) / var16;
      } else {
         var21 = 0;
      }

      int var22 = var13 * var16 - var15 * var14;
      if (var22 != 0) {
         int var23 = (var17 * var16 - var18 * var14 << 8) / var22;
         int var24 = (var18 * var13 - var17 * var15 << 8) / var22;
         int[] var25 = this.al.aj;
         int var26 = this.al.ah * -1347859351;
         if (var1 <= var2 && var1 <= var3) {
            if (var1 < var26) {
               if (var2 > var26) {
                  var2 = var26;
               }

               if (var3 > var26) {
                  var3 = var26;
               }

               var10 = (var10 << 8) - var23 * var4 + var23;
               if (var2 < var3) {
                  var6 = var4 <<= 14;
                  if (var1 < 0) {
                     var6 -= var21 * var1;
                     var4 -= var20 * var1;
                     var10 -= var24 * var1;
                     var1 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var19 * var2;
                     var2 = 0;
                  }

                  if ((var1 == var2 || var21 >= var20) && (var1 != var2 || var21 <= var19)) {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bj(ad, var1, 0, 0, var5 >> 14, var6 >> 14, var10, var23);
                              var6 += var21;
                              var5 += var19;
                              var10 += var24;
                              var1 += ae;
                           }
                        }

                        this.bj(ad, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23);
                        var6 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += ae;
                     }
                  } else {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bj(ad, var1, 0, 0, var6 >> 14, var5 >> 14, var10, var23);
                              var6 += var21;
                              var5 += var19;
                              var10 += var24;
                              var1 += ae;
                           }
                        }

                        this.bj(ad, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23);
                        var6 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += ae;
                     }
                  }
               } else {
                  var5 = var4 <<= 14;
                  if (var1 < 0) {
                     var5 -= var21 * var1;
                     var4 -= var20 * var1;
                     var10 -= var24 * var1;
                     var1 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var19 * var3;
                     var3 = 0;
                  }

                  if ((var1 == var3 || var21 >= var20) && (var1 != var3 || var19 <= var20)) {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bj(ad, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23);
                              var6 += var19;
                              var4 += var20;
                              var10 += var24;
                              var1 += ae;
                           }
                        }

                        this.bj(ad, var1, 0, 0, var4 >> 14, var5 >> 14, var10, var23);
                        var5 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += ae;
                     }
                  } else {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bj(ad, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23);
                              var6 += var19;
                              var4 += var20;
                              var10 += var24;
                              var1 += ae;
                           }
                        }

                        this.bj(ad, var1, 0, 0, var5 >> 14, var4 >> 14, var10, var23);
                        var5 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += ae;
                     }
                  }
               }
            }
         } else if (var2 <= var3) {
            if (var2 < var26) {
               if (var3 > var26) {
                  var3 = var26;
               }

               if (var1 > var26) {
                  var1 = var26;
               }

               var11 = (var11 << 8) - var23 * var5 + var23;
               if (var3 < var1) {
                  var4 = var5 <<= 14;
                  if (var2 < 0) {
                     var4 -= var20 * var2;
                     var5 -= var19 * var2;
                     var11 -= var24 * var2;
                     var2 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var21 * var3;
                     var3 = 0;
                  }

                  if (var2 != var3 && var20 < var19 || var2 == var3 && var20 > var21) {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bj(ad, var2, 0, 0, var4 >> 14, var6 >> 14, var11, var23);
                              var4 += var20;
                              var6 += var21;
                              var11 += var24;
                              var2 += ae;
                           }
                        }

                        this.bj(ad, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23);
                        var4 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += ae;
                     }
                  } else {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bj(ad, var2, 0, 0, var6 >> 14, var4 >> 14, var11, var23);
                              var4 += var20;
                              var6 += var21;
                              var11 += var24;
                              var2 += ae;
                           }
                        }

                        this.bj(ad, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23);
                        var4 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += ae;
                     }
                  }
               } else {
                  var6 = var5 <<= 14;
                  if (var2 < 0) {
                     var6 -= var20 * var2;
                     var5 -= var19 * var2;
                     var11 -= var24 * var2;
                     var2 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var21 * var1;
                     var1 = 0;
                  }

                  if (var20 < var19) {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bj(ad, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23);
                              var4 += var21;
                              var5 += var19;
                              var11 += var24;
                              var2 += ae;
                           }
                        }

                        this.bj(ad, var2, 0, 0, var6 >> 14, var5 >> 14, var11, var23);
                        var6 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += ae;
                     }
                  } else {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bj(ad, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23);
                              var4 += var21;
                              var5 += var19;
                              var11 += var24;
                              var2 += ae;
                           }
                        }

                        this.bj(ad, var2, 0, 0, var5 >> 14, var6 >> 14, var11, var23);
                        var6 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += ae;
                     }
                  }
               }
            }
         } else if (var3 < var26) {
            if (var1 > var26) {
               var1 = var26;
            }

            if (var2 > var26) {
               var2 = var26;
            }

            var12 = (var12 << 8) - var23 * var6 + var23;
            if (var1 < var2) {
               var5 = var6 <<= 14;
               if (var3 < 0) {
                  var5 -= var19 * var3;
                  var6 -= var21 * var3;
                  var12 -= var24 * var3;
                  var3 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var20 * var1;
                  var1 = 0;
               }

               if (var19 < var21) {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bj(ad, var3, 0, 0, var5 >> 14, var4 >> 14, var12, var23);
                           var5 += var19;
                           var4 += var20;
                           var12 += var24;
                           var3 += ae;
                        }
                     }

                     this.bj(ad, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23);
                     var5 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += ae;
                  }
               } else {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bj(ad, var3, 0, 0, var4 >> 14, var5 >> 14, var12, var23);
                           var5 += var19;
                           var4 += var20;
                           var12 += var24;
                           var3 += ae;
                        }
                     }

                     this.bj(ad, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23);
                     var5 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += ae;
                  }
               }
            } else {
               var4 = var6 <<= 14;
               if (var3 < 0) {
                  var4 -= var19 * var3;
                  var6 -= var21 * var3;
                  var12 -= var24 * var3;
                  var3 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var20 * var2;
                  var2 = 0;
               }

               if (var19 < var21) {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bj(ad, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23);
                           var5 += var20;
                           var6 += var21;
                           var12 += var24;
                           var3 += ae;
                        }
                     }

                     this.bj(ad, var3, 0, 0, var4 >> 14, var6 >> 14, var12, var23);
                     var4 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += ae;
                  }
               } else {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bj(ad, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23);
                           var5 += var20;
                           var6 += var21;
                           var12 += var24;
                           var3 += ae;
                        }
                     }

                     this.bj(ad, var3, 0, 0, var6 >> 14, var4 >> 14, var12, var23);
                     var4 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += ae;
                  }
               }
            }
         }
      }
   }

   void bs(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      if (this.al.af) {
         if (var7 > this.al.ag * 571147771) {
            var7 = this.al.ag * 571147771;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         int var18 = var7 - var6;
         int var16;
         int var10000;
         int var17;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         int var24;
         if (this.an) {
            var24 = var6 - this.al.ax * 93675259;
            var10 += (var13 >> 3) * var24;
            var11 += (var14 >> 3) * var24;
            var12 += (var15 >> 3) * var24;
            var23 = var12 >> 12;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
               if (var19 < 0) {
                  var19 = 0;
               } else if (var19 > 4032) {
                  var19 = 4032;
               }
            } else {
               var19 = 0;
               var20 = 0;
            }

            var10 += var13;
            var11 += var14;
            var12 += var15;
            var23 = var12 >> 12;
            if (var23 != 0) {
               var21 = var10 / var23;
               var22 = var11 / var23;
               if (var21 < 0) {
                  var21 = 0;
               } else if (var21 > 4032) {
                  var21 = 4032;
               }
            } else {
               var21 = 0;
               var22 = 0;
            }

            var3 = (var19 << 20) + var20;
            var17 = (var21 - var19 >> 3 << 20) + (var22 - var20 >> 3);
            var18 >>= 3;
            var9 <<= 3;
            var16 = var8 >> 8;
            if (this.af) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var10000 = var3 + var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 12;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 4032) {
                           var21 = 4032;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 20) + var20;
                     var17 = (var21 - var19 >> 3 << 20) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var10000 = var3 + var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 12;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 4032) {
                           var21 = 4032;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 20) + var20;
                     var17 = (var21 - var19 >> 3 << 20) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            }
         } else {
            var24 = var6 - this.al.ax * 93675259;
            var10 += (var13 >> 3) * var24;
            var11 += (var14 >> 3) * var24;
            var12 += (var15 >> 3) * var24;
            var23 = var12 >> 14;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
               if (var19 < 0) {
                  var19 = 0;
               } else if (var19 > 16256) {
                  var19 = 16256;
               }
            } else {
               var19 = 0;
               var20 = 0;
            }

            var10 += var13;
            var11 += var14;
            var12 += var15;
            var23 = var12 >> 14;
            if (var23 != 0) {
               var21 = var10 / var23;
               var22 = var11 / var23;
               if (var21 < 0) {
                  var21 = 0;
               } else if (var21 > 16256) {
                  var21 = 16256;
               }
            } else {
               var21 = 0;
               var22 = 0;
            }

            var3 = (var19 << 18) + var20;
            var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
            var18 >>= 3;
            var9 <<= 3;
            var16 = var8 >> 8;
            if (this.af) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var10000 = var3 + var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 14;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 16256) {
                           var21 = 16256;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 18) + var20;
                     var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var10000 = var3 + var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 14;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 16256) {
                           var21 = 16256;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 18) + var20;
                     var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            }
         }

      }
   }

   void aq(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10) {
      int var11 = 0;
      if (var2 != var1) {
         var11 = (var5 - var4 << 14) / (var2 - var1);
      }

      int var12 = 0;
      if (var3 != var2) {
         var12 = (var6 - var5 << 14) / (var3 - var2);
      }

      int var13 = 0;
      if (var3 != var1) {
         var13 = (var4 - var6 << 14) / (var1 - var3);
      }

      int[] var14 = this.al.aj;
      int var15 = this.al.ah * -1347859351;
      if (var1 <= var2 && var1 <= var3) {
         if (var1 < var15) {
            if (var2 > var15) {
               var2 = var15;
            }

            if (var3 > var15) {
               var3 = var15;
            }

            if (var2 < var3) {
               var6 = var4 <<= 14;
               if (var1 < 0) {
                  var6 -= var13 * var1;
                  var4 -= var11 * var1;
                  var1 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var12 * var2;
                  var2 = 0;
               }

               if ((var1 == var2 || var13 >= var11) && (var1 != var2 || var13 <= var12)) {
                  var3 -= var2;
                  var2 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bn(ad, var1, var10, 0, var5 >> 14, var6 >> 14);
                           var6 += var13;
                           var5 += var12;
                           var1 += ae;
                        }
                     }

                     this.bn(ad, var1, var10, 0, var4 >> 14, var6 >> 14);
                     var6 += var13;
                     var4 += var11;
                     var1 += ae;
                  }
               } else {
                  var3 -= var2;
                  var2 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bn(ad, var1, var10, 0, var6 >> 14, var5 >> 14);
                           var6 += var13;
                           var5 += var12;
                           var1 += ae;
                        }
                     }

                     this.bn(ad, var1, var10, 0, var6 >> 14, var4 >> 14);
                     var6 += var13;
                     var4 += var11;
                     var1 += ae;
                  }
               }
            } else {
               var5 = var4 <<= 14;
               if (var1 < 0) {
                  var5 -= var13 * var1;
                  var4 -= var11 * var1;
                  var1 = 0;
               }

               var6 <<= 14;
               if (var3 < 0) {
                  var6 -= var12 * var3;
                  var3 = 0;
               }

               if (var1 != var3 && var13 < var11 || var1 == var3 && var12 > var11) {
                  var2 -= var3;
                  var3 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bn(ad, var1, var10, 0, var6 >> 14, var4 >> 14);
                           var6 += var12;
                           var4 += var11;
                           var1 += ae;
                        }
                     }

                     this.bn(ad, var1, var10, 0, var5 >> 14, var4 >> 14);
                     var5 += var13;
                     var4 += var11;
                     var1 += ae;
                  }
               } else {
                  var2 -= var3;
                  var3 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bn(ad, var1, var10, 0, var4 >> 14, var6 >> 14);
                           var6 += var12;
                           var4 += var11;
                           var1 += ae;
                        }
                     }

                     this.bn(ad, var1, var10, 0, var4 >> 14, var5 >> 14);
                     var5 += var13;
                     var4 += var11;
                     var1 += ae;
                  }
               }
            }
         }
      } else if (var2 <= var3) {
         if (var2 < var15) {
            if (var3 > var15) {
               var3 = var15;
            }

            if (var1 > var15) {
               var1 = var15;
            }

            if (var3 < var1) {
               var4 = var5 <<= 14;
               if (var2 < 0) {
                  var4 -= var11 * var2;
                  var5 -= var12 * var2;
                  var2 = 0;
               }

               var6 <<= 14;
               if (var3 < 0) {
                  var6 -= var13 * var3;
                  var3 = 0;
               }

               if ((var2 == var3 || var11 >= var12) && (var2 != var3 || var11 <= var13)) {
                  var1 -= var3;
                  var3 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bn(ad, var2, var10, 0, var6 >> 14, var4 >> 14);
                           var4 += var11;
                           var6 += var13;
                           var2 += ae;
                        }
                     }

                     this.bn(ad, var2, var10, 0, var5 >> 14, var4 >> 14);
                     var4 += var11;
                     var5 += var12;
                     var2 += ae;
                  }
               } else {
                  var1 -= var3;
                  var3 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bn(ad, var2, var10, 0, var4 >> 14, var6 >> 14);
                           var4 += var11;
                           var6 += var13;
                           var2 += ae;
                        }
                     }

                     this.bn(ad, var2, var10, 0, var4 >> 14, var5 >> 14);
                     var4 += var11;
                     var5 += var12;
                     var2 += ae;
                  }
               }
            } else {
               var6 = var5 <<= 14;
               if (var2 < 0) {
                  var6 -= var11 * var2;
                  var5 -= var12 * var2;
                  var2 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var13 * var1;
                  var1 = 0;
               }

               if (var11 < var12) {
                  var3 -= var1;
                  var1 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bn(ad, var2, var10, 0, var4 >> 14, var5 >> 14);
                           var4 += var13;
                           var5 += var12;
                           var2 += ae;
                        }
                     }

                     this.bn(ad, var2, var10, 0, var6 >> 14, var5 >> 14);
                     var6 += var11;
                     var5 += var12;
                     var2 += ae;
                  }
               } else {
                  var3 -= var1;
                  var1 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bn(ad, var2, var10, 0, var5 >> 14, var4 >> 14);
                           var4 += var13;
                           var5 += var12;
                           var2 += ae;
                        }
                     }

                     this.bn(ad, var2, var10, 0, var5 >> 14, var6 >> 14);
                     var6 += var11;
                     var5 += var12;
                     var2 += ae;
                  }
               }
            }
         }
      } else if (var3 < var15) {
         if (var1 > var15) {
            var1 = var15;
         }

         if (var2 > var15) {
            var2 = var15;
         }

         if (var1 < var2) {
            var5 = var6 <<= 14;
            if (var3 < 0) {
               var5 -= var12 * var3;
               var6 -= var13 * var3;
               var3 = 0;
            }

            var4 <<= 14;
            if (var1 < 0) {
               var4 -= var11 * var1;
               var1 = 0;
            }

            if (var12 < var13) {
               var2 -= var1;
               var1 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           return;
                        }

                        this.bn(ad, var3, var10, 0, var5 >> 14, var4 >> 14);
                        var5 += var12;
                        var4 += var11;
                        var3 += ae;
                     }
                  }

                  this.bn(ad, var3, var10, 0, var5 >> 14, var6 >> 14);
                  var5 += var12;
                  var6 += var13;
                  var3 += ae;
               }
            } else {
               var2 -= var1;
               var1 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           return;
                        }

                        this.bn(ad, var3, var10, 0, var4 >> 14, var5 >> 14);
                        var5 += var12;
                        var4 += var11;
                        var3 += ae;
                     }
                  }

                  this.bn(ad, var3, var10, 0, var6 >> 14, var5 >> 14);
                  var5 += var12;
                  var6 += var13;
                  var3 += ae;
               }
            }
         } else {
            var4 = var6 <<= 14;
            if (var3 < 0) {
               var4 -= var12 * var3;
               var6 -= var13 * var3;
               var3 = 0;
            }

            var5 <<= 14;
            if (var2 < 0) {
               var5 -= var11 * var2;
               var2 = 0;
            }

            if (var12 < var13) {
               var1 -= var2;
               var2 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        this.bn(ad, var3, var10, 0, var5 >> 14, var6 >> 14);
                        var5 += var11;
                        var6 += var13;
                        var3 += ae;
                     }
                  }

                  this.bn(ad, var3, var10, 0, var4 >> 14, var6 >> 14);
                  var4 += var12;
                  var6 += var13;
                  var3 += ae;
               }
            } else {
               var1 -= var2;
               var2 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        this.bn(ad, var3, var10, 0, var6 >> 14, var5 >> 14);
                        var5 += var11;
                        var6 += var13;
                        var3 += ae;
                     }
                  }

                  this.bn(ad, var3, var10, 0, var6 >> 14, var4 >> 14);
                  var4 += var12;
                  var6 += var13;
                  var3 += ae;
               }
            }
         }
      }
   }

   void bn(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.al.af) {
         if (var6 > this.al.ag * 571147771) {
            var6 = this.al.ag * 571147771;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var4 = var6 - var5 >> 2;
         if (this.al.aw * 918495667 != 0) {
            if (this.al.aw * 918495667 == 254) {
               while(true) {
                  --var4;
                  if (var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if (var4 < 0) {
                           return;
                        }

                        var1[var2++] = var1[var2];
                     }
                  }

                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
               }
            } else {
               int var7 = this.al.aw * 918495667;
               int var8 = 256 - this.al.aw * 918495667;
               var3 = ((var3 & 16711935) * var8 >> 8 & 16711935) + ((var3 & '\uff00') * var8 >> 8 & '\uff00');

               while(true) {
                  --var4;
                  int var9;
                  if (var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if (var4 < 0) {
                           return;
                        }

                        var9 = var1[var2];
                        var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & '\uff00') * var7 >> 8 & '\uff00');
                     }
                  }

                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & '\uff00') * var7 >> 8 & '\uff00');
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & '\uff00') * var7 >> 8 & '\uff00');
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & '\uff00') * var7 >> 8 & '\uff00');
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & '\uff00') * var7 >> 8 & '\uff00');
               }
            }
         } else {
            while(true) {
               --var4;
               if (var4 < 0) {
                  var4 = var6 - var5 & 3;

                  while(true) {
                     --var4;
                     if (var4 < 0) {
                        return;
                     }

                     var1[var2++] = var3;
                  }
               }

               var1[var2++] = var3;
               var1[var2++] = var3;
               var1[var2++] = var3;
               var1[var2++] = var3;
            }
         }
      }
   }

   void bp(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      if (this.al.af) {
         if (var7 > this.al.ag * -610507072) {
            var7 = this.al.ag * 571147771;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         int var18 = var7 - var6;
         int var16;
         int var17;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         int var24;
         if (this.an) {
            var24 = var6 - this.al.ax * 93675259;
            var10 += var13 * var24;
            var11 += var14 * var24;
            var12 += var15 * var24;
            var23 = var12 >> 12;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
            } else {
               var19 = 0;
               var20 = 0;
            }

            var10 += var13 * var18;
            var11 += var14 * var18;
            var12 += var15 * var18;
            var23 = var12 >> 12;
            if (var23 != 0) {
               var21 = var10 / var23;
               var22 = var11 / var23;
            } else {
               var21 = 0;
               var22 = 0;
            }

            var3 = (var19 << 20) + var20;
            var17 = ((var21 - var19) / var18 << 20) + (var22 - var20) / var18;
            var18 >>= 3;
            var9 <<= 3;
            var16 = var8 >> 8;
            if (this.af) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & -1363554176) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & -178934254) * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -1664283360) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 672847333) * var16 & -16711936) + ((var4 & -697817395) * var16 & 495672666) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -738005961) + ((var4 & '\uff00') * var16 & -932435053) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & -2055672930) * var16 & -1705422220) + ((var4 & -1140881232) * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & 1213636963) + ((var4 & -1352566606) * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 1961179554) * var16 & -1807651810) + ((var4 & '\uff00') * var16 & 1429511501) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & -253992063) * var16 & 1800350749) + ((var4 & 2010922613) * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 924559826) * var16 & -1019470695) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & 1233234703) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 24110496) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 689575727) * var16 & 193386364) + ((var4 & 1007699290) * var16 & -1626025788) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & -412610415) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & -1324533985) * var16 & -1238269748) + ((var4 & 135315497) * var16 & -1728512975) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & -635367029) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 145427587) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & -2036317781) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -156249836) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 301911742) * var16 & -906031652) + ((var4 & '\uff00') * var16 & 1011474354) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & -918912975) * var16 & -16711936) + ((var4 & '\uff00') * var16 & -1150515451) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & -1125442281) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            }
         } else {
            var24 = var6 - this.al.ax * 93675259;
            var10 += var13 * var24;
            var11 += var14 * var24;
            var12 += var15 * var24;
            var23 = var12 >> 14;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
            } else {
               var19 = 0;
               var20 = 0;
            }

            var10 += var13 * var18;
            var11 += var14 * var18;
            var12 += var15 * var18;
            var23 = var12 >> 14;
            if (var23 != 0) {
               var21 = var10 / var23;
               var22 = var11 / var23;
            } else {
               var21 = 0;
               var22 = 0;
            }

            var3 = (var19 << 18) + var20;
            var17 = ((var21 - var19) / var18 << 18) + (var22 - var20) / var18;
            var18 >>= 3;
            var9 <<= 3;
            var16 = var8 >> 8;
            if (this.af) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & -361863667) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -1195179886) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 946068965) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & 664435493) + ((var4 & '\uff00') * var16 & 983527870) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -1862872556) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -1264216934) + ((var4 & 26550507) * var16 & 791956007) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & -366562837) * var16 & -16711936) + ((var4 & -1094720364) * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -462351185) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & -2100859467) * var16 & -16711936) + ((var4 & -1886419552) * var16 & 1754976407) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -2136891803) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 151068141) * var16 & -16711936) + ((var4 & -630114689) * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 1328129028) >> 8;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & -974506840) * var16 & -1662921964) + ((var4 & -126168331) * var16 & 721055552) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & -365632992) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & 1965223903) + ((var4 & -1959950388) * var16 & -1614313174) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & -770785548) * var16 & -16711936) + ((var4 & 811998054) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & -695500300) * var16 & -16711936) + ((var4 & 1230154800) * var16 & 930514118) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & -414343496) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & -2027626524) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & -1260545465) * var16 & -1051766944) + ((var4 & 1074365380) * var16 & -1352442052) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -2014496535) + ((var4 & 1364449960) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -955337551) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 1704664589) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 1829913989) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & -803787768) * var16 & 1760798109) + ((var4 & '\uff00') * var16 & -1851215002) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            }
         }

      }
   }

   void al(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.al.aq.aw(var22, -1186733304);
      int var24;
      if (var23 == null) {
         var24 = this.al.aq.ac(var22, -585148039);
         this.ab(var1, var2, var3, var4, var5, var6, var7, var8, var9, ig.aw(var24, var10, 769773533), ig.aw(var24, var11, 769773533), ig.aw(var24, var12, 769773533));
      } else {
         this.an = this.al.aq.ab(var22, -407888071);
         this.af = this.al.aq.au(var22, (byte)-49);
         var24 = var5 - var4;
         int var25 = var2 - var1;
         int var26 = var6 - var4;
         int var27 = var3 - var1;
         int var28 = var11 - var10;
         int var29 = var12 - var10;
         int var30 = 0;
         if (var2 != var1) {
            var30 = (var5 - var4 << 14) / (var2 - var1);
         }

         int var31 = 0;
         if (var3 != var2) {
            var31 = (var6 - var5 << 14) / (var3 - var2);
         }

         int var32 = 0;
         if (var3 != var1) {
            var32 = (var4 - var6 << 14) / (var1 - var3);
         }

         int var33 = var24 * var27 - var26 * var25;
         if (var33 != 0) {
            int var34 = (var28 * var27 - var29 * var25 << 9) / var33;
            int var35 = (var29 * var24 - var28 * var26 << 9) / var33;
            int var36 = this.al.ab * -1734758735;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var37 = var15 * var16 - var18 * var13 << 14;
            int var38 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / (long)var36);
            int var39 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / (long)var36);
            int var40 = var14 * var16 - var17 * var13 << 14;
            int var41 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / (long)var36);
            int var42 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / (long)var36);
            int var43 = var17 * var15 - var14 * var18 << 14;
            int var44 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / (long)var36);
            int var45 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / (long)var36);
            int[] var46 = this.al.aj;
            int var47 = this.al.ah * -1347859351;
            int var48;
            if (var1 <= var2 && var1 <= var3) {
               if (var1 < var47) {
                  if (var2 > var47) {
                     var2 = var47;
                  }

                  if (var3 > var47) {
                     var3 = var47;
                  }

                  var10 = (var10 << 9) - var34 * var4 + var34;
                  if (var2 < var3) {
                     var6 = var4 <<= 14;
                     if (var1 < 0) {
                        var6 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var31 * var2;
                        var2 = 0;
                     }

                     var48 = var1 - this.al.ai * 1666539507;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if (var1 != var2 && var32 < var30 || var1 == var2 && var32 > var31) {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var5 = var4 <<= 14;
                     if (var1 < 0) {
                        var5 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var31 * var3;
                        var3 = 0;
                     }

                     var48 = var1 - this.al.ai * 1666539507;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if ((var1 == var3 || var32 >= var30) && (var1 != var3 || var31 <= var30)) {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var2 <= var3) {
               if (var2 < var47) {
                  if (var3 > var47) {
                     var3 = var47;
                  }

                  if (var1 > var47) {
                     var1 = var47;
                  }

                  var11 = (var11 << 9) - var34 * var5 + var34;
                  if (var3 < var1) {
                     var4 = var5 <<= 14;
                     if (var2 < 0) {
                        var4 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var32 * var3;
                        var3 = 0;
                     }

                     var48 = var2 - this.al.ai * 1666539507;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if (var2 != var3 && var30 < var31 || var2 == var3 && var30 > var32) {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var6 = var5 <<= 14;
                     if (var2 < 0) {
                        var6 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var4 <<= 14;
                     if (var1 < 0) {
                        var4 -= var32 * var1;
                        var1 = 0;
                     }

                     var48 = var2 - this.al.ai * 1666539507;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if (var30 < var31) {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var3 < var47) {
               if (var1 > var47) {
                  var1 = var47;
               }

               if (var2 > var47) {
                  var2 = var47;
               }

               var12 = (var12 << 9) - var34 * var6 + var34;
               if (var1 < var2) {
                  var5 = var6 <<= 14;
                  if (var3 < 0) {
                     var5 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var30 * var1;
                     var1 = 0;
                  }

                  var48 = var3 - this.al.ai * 1666539507;
                  var37 += var39 * var48;
                  var40 += var42 * var48;
                  var43 += var45 * var48;
                  if (var31 < var32) {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bs(ad, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bs(ad, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bs(ad, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bs(ad, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               } else {
                  var4 = var6 <<= 14;
                  if (var3 < 0) {
                     var4 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var30 * var2;
                     var2 = 0;
                  }

                  var48 = var3 - this.al.ai * 1666539507;
                  var37 += var39 * var48;
                  var40 += var42 * var48;
                  var43 += var45 * var48;
                  if (var31 < var32) {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bs(ad, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bs(ad, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bs(ad, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bs(ad, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               }
            }
         }
      }
   }

   final void bj(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.al.af) {
         if (var6 > this.al.ag * 571147771) {
            var6 = this.al.ag * 571147771;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var7 += var8 * var5;
         int var9;
         int var10;
         int var11;
         int var12;
         if (this.al.an) {
            var4 = var6 - var5 >> 2;
            var8 <<= 2;
            if (this.al.aw * 918495667 == 0) {
               if (var4 > 0) {
                  do {
                     var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.aq[var9];
                     var7 += var8;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.aq[var9];

                  do {
                     var1[var2++] = var3;
                     --var4;
                  } while(var4 > 0);
               }
            } else {
               var9 = this.al.aw * 918495667;
               var10 = 256 - this.al.aw * 918495667;
               if (var4 > 0) {
                  do {
                     var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.aq[var11];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.aq[var11];
                  var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & '\uff00');

                  do {
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                     --var4;
                  } while(var4 > 0);
               }
            }

         } else {
            var4 = var6 - var5;
            if (this.al.aw * 918495667 == 0) {
               do {
                  var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var1[var2++] = this.aq[var9];
                  var7 += var8;
                  --var4;
               } while(var4 > 0);
            } else {
               var9 = this.al.aw * 918495667;
               var10 = 256 - this.al.aw * 918495667;

               do {
                  var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.aq[var11];
                  var7 += var8;
                  var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & '\uff00');
                  var12 = var1[var2];
                  var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                  --var4;
               } while(var4 > 0);
            }

         }
      }
   }

   void br(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      if (this.al.af) {
         if (var7 > this.al.ag * 571147771) {
            var7 = this.al.ag * 571147771;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         int var18 = var7 - var6;
         int var16;
         int var17;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         int var24;
         if (this.an) {
            var24 = var6 - this.al.ax * 93675259;
            var10 += var13 * var24;
            var11 += var14 * var24;
            var12 += var15 * var24;
            var23 = var12 >> 12;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
            } else {
               var19 = 0;
               var20 = 0;
            }

            var10 += var13 * var18;
            var11 += var14 * var18;
            var12 += var15 * var18;
            var23 = var12 >> 12;
            if (var23 != 0) {
               var21 = var10 / var23;
               var22 = var11 / var23;
            } else {
               var21 = 0;
               var22 = 0;
            }

            var3 = (var19 << 20) + var20;
            var17 = ((var21 - var19) / var18 << 20) + (var22 - var20) / var18;
            var18 >>= 3;
            var9 <<= 3;
            var16 = var8 >> 8;
            if (this.af) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            }
         } else {
            var24 = var6 - this.al.ax * 93675259;
            var10 += var13 * var24;
            var11 += var14 * var24;
            var12 += var15 * var24;
            var23 = var12 >> 14;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
            } else {
               var19 = 0;
               var20 = 0;
            }

            var10 += var13 * var18;
            var11 += var14 * var18;
            var12 += var15 * var18;
            var23 = var12 >> 14;
            if (var23 != 0) {
               var21 = var10 / var23;
               var22 = var11 / var23;
            } else {
               var21 = 0;
               var22 = 0;
            }

            var3 = (var19 << 18) + var20;
            var17 = ((var21 - var19) / var18 << 18) + (var22 - var20) / var18;
            var18 >>= 3;
            var9 <<= 3;
            var16 = var8 >> 8;
            if (this.af) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            }
         }

      }
   }

   void at(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.al.aq.aw(var22, -1596513386);
      int var24;
      if (var23 == null) {
         var24 = this.al.aq.ac(var22, -1399904528);
         this.ab(var1, var2, var3, var4, var5, var6, var7, var8, var9, ig.aw(var24, var10, 769773533), ig.aw(var24, var11, 769773533), ig.aw(var24, var12, 769773533));
      } else {
         this.an = this.al.aq.ab(var22, -407888071);
         this.af = this.al.aq.au(var22, (byte)-101);
         var24 = var5 - var4;
         int var25 = var2 - var1;
         int var26 = var6 - var4;
         int var27 = var3 - var1;
         int var28 = var11 - var10;
         int var29 = var12 - var10;
         int var30 = 0;
         if (var2 != var1) {
            var30 = (var5 - var4 << 14) / (var2 - var1);
         }

         int var31 = 0;
         if (var3 != var2) {
            var31 = (var6 - var5 << 14) / (var3 - var2);
         }

         int var32 = 0;
         if (var3 != var1) {
            var32 = (var4 - var6 << 14) / (var1 - var3);
         }

         int var33 = var24 * var27 - var26 * var25;
         if (var33 != 0) {
            int var34 = (var28 * var27 - var29 * var25 << 9) / var33;
            int var35 = (var29 * var24 - var28 * var26 << 9) / var33;
            int var36 = this.al.ab * -1734758735;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var37 = var15 * var16 - var18 * var13 << 14;
            int var38 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / (long)var36);
            int var39 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / (long)var36);
            int var40 = var14 * var16 - var17 * var13 << 14;
            int var41 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / (long)var36);
            int var42 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / (long)var36);
            int var43 = var17 * var15 - var14 * var18 << 14;
            int var44 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / (long)var36);
            int var45 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / (long)var36);
            int[] var46 = this.al.aj;
            int var47 = this.al.ah * -1347859351;
            int var48 = this.al.ai * 1666539507;
            int var49;
            if (var1 <= var2 && var1 <= var3) {
               if (var1 < var47) {
                  if (var2 > var47) {
                     var2 = var47;
                  }

                  if (var3 > var47) {
                     var3 = var47;
                  }

                  var10 = (var10 << 9) - var34 * var4 + var34;
                  if (var2 < var3) {
                     var6 = var4 <<= 14;
                     if (var1 < 0) {
                        var6 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var31 * var2;
                        var2 = 0;
                     }

                     var49 = var1 - var48;
                     var37 += var39 * var49;
                     var40 += var42 * var49;
                     var43 += var45 * var49;
                     if ((var1 == var2 || var32 >= var30) && (var1 != var2 || var32 <= var31)) {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.br(ad, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.br(ad, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.br(ad, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.br(ad, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var5 = var4 <<= 14;
                     if (var1 < 0) {
                        var5 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var31 * var3;
                        var3 = 0;
                     }

                     var49 = var1 - var48;
                     var37 += var39 * var49;
                     var40 += var42 * var49;
                     var43 += var45 * var49;
                     if (var1 != var3 && var32 < var30 || var1 == var3 && var31 > var30) {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.br(ad, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.br(ad, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.br(ad, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.br(ad, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var2 <= var3) {
               if (var2 < var47) {
                  if (var3 > var47) {
                     var3 = var47;
                  }

                  if (var1 > var47) {
                     var1 = var47;
                  }

                  var11 = (var11 << 9) - var34 * var5 + var34;
                  if (var3 < var1) {
                     var4 = var5 <<= 14;
                     if (var2 < 0) {
                        var4 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var32 * var3;
                        var3 = 0;
                     }

                     var49 = var2 - var48;
                     var37 += var39 * var49;
                     var40 += var42 * var49;
                     var43 += var45 * var49;
                     if ((var2 == var3 || var30 >= var31) && (var2 != var3 || var30 <= var32)) {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.br(ad, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.br(ad, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.br(ad, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.br(ad, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var6 = var5 <<= 14;
                     if (var2 < 0) {
                        var6 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var4 <<= 14;
                     if (var1 < 0) {
                        var4 -= var32 * var1;
                        var1 = 0;
                     }

                     var49 = var2 - var48;
                     var37 += var39 * var49;
                     var40 += var42 * var49;
                     var43 += var45 * var49;
                     if (var30 < var31) {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.br(ad, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.br(ad, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.br(ad, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.br(ad, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var3 < var47) {
               if (var1 > var47) {
                  var1 = var47;
               }

               if (var2 > var47) {
                  var2 = var47;
               }

               var12 = (var12 << 9) - var34 * var6 + var34;
               if (var1 < var2) {
                  var5 = var6 <<= 14;
                  if (var3 < 0) {
                     var5 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var30 * var1;
                     var1 = 0;
                  }

                  var49 = var3 - var48;
                  var37 += var39 * var49;
                  var40 += var42 * var49;
                  var43 += var45 * var49;
                  if (var31 < var32) {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.br(ad, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.br(ad, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.br(ad, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.br(ad, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               } else {
                  var4 = var6 <<= 14;
                  if (var3 < 0) {
                     var4 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var30 * var2;
                     var2 = 0;
                  }

                  var49 = var3 - var48;
                  var37 += var39 * var49;
                  var40 += var42 * var49;
                  var43 += var45 * var49;
                  if (var31 < var32) {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.br(ad, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.br(ad, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.br(ad, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.br(ad, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               }
            }
         }
      }
   }

   void by(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      int var13 = var5 - var4;
      int var14 = var2 - var1;
      int var15 = var6 - var4;
      int var16 = var3 - var1;
      int var17 = var11 - var10;
      int var18 = var12 - var10;
      int var19;
      if (var3 != var2) {
         var19 = (var6 - var5 << 14) / (var3 - var2);
      } else {
         var19 = 0;
      }

      int var20;
      if (var2 != var1) {
         var20 = (var13 << 14) / var14;
      } else {
         var20 = 0;
      }

      int var21;
      if (var3 != var1) {
         var21 = (var15 << 14) / var16;
      } else {
         var21 = 0;
      }

      int var22 = var13 * var16 - var15 * var14;
      if (var22 != 0) {
         int var23 = (var17 * var16 - var18 * var14 << 8) / var22;
         int var24 = (var18 * var13 - var17 * var15 << 8) / var22;
         int[] var25 = this.al.aj;
         int var26 = this.al.ah * -1347859351;
         if (var1 <= var2 && var1 <= var3) {
            if (var1 < var26) {
               if (var2 > var26) {
                  var2 = var26;
               }

               if (var3 > var26) {
                  var3 = var26;
               }

               var10 = (var10 << 8) - var23 * var4 + var23;
               if (var2 < var3) {
                  var6 = var4 <<= 14;
                  if (var1 < 0) {
                     var6 -= var21 * var1;
                     var4 -= var20 * var1;
                     var10 -= var24 * var1;
                     var1 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var19 * var2;
                     var2 = 0;
                  }

                  if (var1 != var2 && var21 < var20 || var1 == var2 && var21 > var19) {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bj(ad, var1, 0, 0, var6 >> 14, var5 >> 14, var10, var23);
                              var6 += var21;
                              var5 += var19;
                              var10 += var24;
                              var1 += ae;
                           }
                        }

                        this.bj(ad, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23);
                        var6 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += ae;
                     }
                  } else {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bj(ad, var1, 0, 0, var5 >> 14, var6 >> 14, var10, var23);
                              var6 += var21;
                              var5 += var19;
                              var10 += var24;
                              var1 += ae;
                           }
                        }

                        this.bj(ad, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23);
                        var6 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += ae;
                     }
                  }
               } else {
                  var5 = var4 <<= 14;
                  if (var1 < 0) {
                     var5 -= var21 * var1;
                     var4 -= var20 * var1;
                     var10 -= var24 * var1;
                     var1 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var19 * var3;
                     var3 = 0;
                  }

                  if (var1 != var3 && var21 < var20 || var1 == var3 && var19 > var20) {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bj(ad, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23);
                              var6 += var19;
                              var4 += var20;
                              var10 += var24;
                              var1 += ae;
                           }
                        }

                        this.bj(ad, var1, 0, 0, var5 >> 14, var4 >> 14, var10, var23);
                        var5 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += ae;
                     }
                  } else {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bj(ad, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23);
                              var6 += var19;
                              var4 += var20;
                              var10 += var24;
                              var1 += ae;
                           }
                        }

                        this.bj(ad, var1, 0, 0, var4 >> 14, var5 >> 14, var10, var23);
                        var5 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += ae;
                     }
                  }
               }
            }
         } else if (var2 <= var3) {
            if (var2 < var26) {
               if (var3 > var26) {
                  var3 = var26;
               }

               if (var1 > var26) {
                  var1 = var26;
               }

               var11 = (var11 << 8) - var23 * var5 + var23;
               if (var3 < var1) {
                  var4 = var5 <<= 14;
                  if (var2 < 0) {
                     var4 -= var20 * var2;
                     var5 -= var19 * var2;
                     var11 -= var24 * var2;
                     var2 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var21 * var3;
                     var3 = 0;
                  }

                  if (var2 != var3 && var20 < var19 || var2 == var3 && var20 > var21) {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bj(ad, var2, 0, 0, var4 >> 14, var6 >> 14, var11, var23);
                              var4 += var20;
                              var6 += var21;
                              var11 += var24;
                              var2 += ae;
                           }
                        }

                        this.bj(ad, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23);
                        var4 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += ae;
                     }
                  } else {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bj(ad, var2, 0, 0, var6 >> 14, var4 >> 14, var11, var23);
                              var4 += var20;
                              var6 += var21;
                              var11 += var24;
                              var2 += ae;
                           }
                        }

                        this.bj(ad, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23);
                        var4 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += ae;
                     }
                  }
               } else {
                  var6 = var5 <<= 14;
                  if (var2 < 0) {
                     var6 -= var20 * var2;
                     var5 -= var19 * var2;
                     var11 -= var24 * var2;
                     var2 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var21 * var1;
                     var1 = 0;
                  }

                  if (var20 < var19) {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bj(ad, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23);
                              var4 += var21;
                              var5 += var19;
                              var11 += var24;
                              var2 += ae;
                           }
                        }

                        this.bj(ad, var2, 0, 0, var6 >> 14, var5 >> 14, var11, var23);
                        var6 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += ae;
                     }
                  } else {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bj(ad, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23);
                              var4 += var21;
                              var5 += var19;
                              var11 += var24;
                              var2 += ae;
                           }
                        }

                        this.bj(ad, var2, 0, 0, var5 >> 14, var6 >> 14, var11, var23);
                        var6 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += ae;
                     }
                  }
               }
            }
         } else if (var3 < var26) {
            if (var1 > var26) {
               var1 = var26;
            }

            if (var2 > var26) {
               var2 = var26;
            }

            var12 = (var12 << 8) - var23 * var6 + var23;
            if (var1 < var2) {
               var5 = var6 <<= 14;
               if (var3 < 0) {
                  var5 -= var19 * var3;
                  var6 -= var21 * var3;
                  var12 -= var24 * var3;
                  var3 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var20 * var1;
                  var1 = 0;
               }

               if (var19 < var21) {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bj(ad, var3, 0, 0, var5 >> 14, var4 >> 14, var12, var23);
                           var5 += var19;
                           var4 += var20;
                           var12 += var24;
                           var3 += ae;
                        }
                     }

                     this.bj(ad, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23);
                     var5 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += ae;
                  }
               } else {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bj(ad, var3, 0, 0, var4 >> 14, var5 >> 14, var12, var23);
                           var5 += var19;
                           var4 += var20;
                           var12 += var24;
                           var3 += ae;
                        }
                     }

                     this.bj(ad, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23);
                     var5 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += ae;
                  }
               }
            } else {
               var4 = var6 <<= 14;
               if (var3 < 0) {
                  var4 -= var19 * var3;
                  var6 -= var21 * var3;
                  var12 -= var24 * var3;
                  var3 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var20 * var2;
                  var2 = 0;
               }

               if (var19 < var21) {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bj(ad, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23);
                           var5 += var20;
                           var6 += var21;
                           var12 += var24;
                           var3 += ae;
                        }
                     }

                     this.bj(ad, var3, 0, 0, var4 >> 14, var6 >> 14, var12, var23);
                     var4 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += ae;
                  }
               } else {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bj(ad, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23);
                           var5 += var20;
                           var6 += var21;
                           var12 += var24;
                           var3 += ae;
                        }
                     }

                     this.bj(ad, var3, 0, 0, var6 >> 14, var4 >> 14, var12, var23);
                     var4 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += ae;
                  }
               }
            }
         }
      }
   }

   void bb(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      int var13 = var5 - var4;
      int var14 = var2 - var1;
      int var15 = var6 - var4;
      int var16 = var3 - var1;
      int var17 = var11 - var10;
      int var18 = var12 - var10;
      int var19;
      if (var3 != var2) {
         var19 = (var6 - var5 << 14) / (var3 - var2);
      } else {
         var19 = 0;
      }

      int var20;
      if (var2 != var1) {
         var20 = (var13 << 14) / var14;
      } else {
         var20 = 0;
      }

      int var21;
      if (var3 != var1) {
         var21 = (var15 << 14) / var16;
      } else {
         var21 = 0;
      }

      int var22 = var13 * var16 - var15 * var14;
      if (var22 != 0) {
         int var23 = (var17 * var16 - var18 * var14 << 8) / var22;
         int var24 = (var18 * var13 - var17 * var15 << 8) / var22;
         int[] var25 = this.al.aj;
         int var26 = this.al.ah * -1347859351;
         if (var1 <= var2 && var1 <= var3) {
            if (var1 < var26) {
               if (var2 > var26) {
                  var2 = var26;
               }

               if (var3 > var26) {
                  var3 = var26;
               }

               var10 = (var10 << 8) - var23 * var4 + var23;
               if (var2 < var3) {
                  var6 = var4 <<= 14;
                  if (var1 < 0) {
                     var6 -= var21 * var1;
                     var4 -= var20 * var1;
                     var10 -= var24 * var1;
                     var1 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var19 * var2;
                     var2 = 0;
                  }

                  if (var1 != var2 && var21 < var20 || var1 == var2 && var21 > var19) {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bj(ad, var1, 0, 0, var6 >> 14, var5 >> 14, var10, var23);
                              var6 += var21;
                              var5 += var19;
                              var10 += var24;
                              var1 += ae;
                           }
                        }

                        this.bj(ad, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23);
                        var6 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += ae;
                     }
                  } else {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bj(ad, var1, 0, 0, var5 >> 14, var6 >> 14, var10, var23);
                              var6 += var21;
                              var5 += var19;
                              var10 += var24;
                              var1 += ae;
                           }
                        }

                        this.bj(ad, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23);
                        var6 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += ae;
                     }
                  }
               } else {
                  var5 = var4 <<= 14;
                  if (var1 < 0) {
                     var5 -= var21 * var1;
                     var4 -= var20 * var1;
                     var10 -= var24 * var1;
                     var1 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var19 * var3;
                     var3 = 0;
                  }

                  if ((var1 == var3 || var21 >= var20) && (var1 != var3 || var19 <= var20)) {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bj(ad, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23);
                              var6 += var19;
                              var4 += var20;
                              var10 += var24;
                              var1 += ae;
                           }
                        }

                        this.bj(ad, var1, 0, 0, var4 >> 14, var5 >> 14, var10, var23);
                        var5 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += ae;
                     }
                  } else {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bj(ad, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23);
                              var6 += var19;
                              var4 += var20;
                              var10 += var24;
                              var1 += ae;
                           }
                        }

                        this.bj(ad, var1, 0, 0, var5 >> 14, var4 >> 14, var10, var23);
                        var5 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += ae;
                     }
                  }
               }
            }
         } else if (var2 <= var3) {
            if (var2 < var26) {
               if (var3 > var26) {
                  var3 = var26;
               }

               if (var1 > var26) {
                  var1 = var26;
               }

               var11 = (var11 << 8) - var23 * var5 + var23;
               if (var3 < var1) {
                  var4 = var5 <<= 14;
                  if (var2 < 0) {
                     var4 -= var20 * var2;
                     var5 -= var19 * var2;
                     var11 -= var24 * var2;
                     var2 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var21 * var3;
                     var3 = 0;
                  }

                  if (var2 != var3 && var20 < var19 || var2 == var3 && var20 > var21) {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bj(ad, var2, 0, 0, var4 >> 14, var6 >> 14, var11, var23);
                              var4 += var20;
                              var6 += var21;
                              var11 += var24;
                              var2 += ae;
                           }
                        }

                        this.bj(ad, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23);
                        var4 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += ae;
                     }
                  } else {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bj(ad, var2, 0, 0, var6 >> 14, var4 >> 14, var11, var23);
                              var4 += var20;
                              var6 += var21;
                              var11 += var24;
                              var2 += ae;
                           }
                        }

                        this.bj(ad, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23);
                        var4 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += ae;
                     }
                  }
               } else {
                  var6 = var5 <<= 14;
                  if (var2 < 0) {
                     var6 -= var20 * var2;
                     var5 -= var19 * var2;
                     var11 -= var24 * var2;
                     var2 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var21 * var1;
                     var1 = 0;
                  }

                  if (var20 < var19) {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bj(ad, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23);
                              var4 += var21;
                              var5 += var19;
                              var11 += var24;
                              var2 += ae;
                           }
                        }

                        this.bj(ad, var2, 0, 0, var6 >> 14, var5 >> 14, var11, var23);
                        var6 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += ae;
                     }
                  } else {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bj(ad, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23);
                              var4 += var21;
                              var5 += var19;
                              var11 += var24;
                              var2 += ae;
                           }
                        }

                        this.bj(ad, var2, 0, 0, var5 >> 14, var6 >> 14, var11, var23);
                        var6 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += ae;
                     }
                  }
               }
            }
         } else if (var3 < var26) {
            if (var1 > var26) {
               var1 = var26;
            }

            if (var2 > var26) {
               var2 = var26;
            }

            var12 = (var12 << 8) - var23 * var6 + var23;
            if (var1 < var2) {
               var5 = var6 <<= 14;
               if (var3 < 0) {
                  var5 -= var19 * var3;
                  var6 -= var21 * var3;
                  var12 -= var24 * var3;
                  var3 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var20 * var1;
                  var1 = 0;
               }

               if (var19 < var21) {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bj(ad, var3, 0, 0, var5 >> 14, var4 >> 14, var12, var23);
                           var5 += var19;
                           var4 += var20;
                           var12 += var24;
                           var3 += ae;
                        }
                     }

                     this.bj(ad, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23);
                     var5 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += ae;
                  }
               } else {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bj(ad, var3, 0, 0, var4 >> 14, var5 >> 14, var12, var23);
                           var5 += var19;
                           var4 += var20;
                           var12 += var24;
                           var3 += ae;
                        }
                     }

                     this.bj(ad, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23);
                     var5 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += ae;
                  }
               }
            } else {
               var4 = var6 <<= 14;
               if (var3 < 0) {
                  var4 -= var19 * var3;
                  var6 -= var21 * var3;
                  var12 -= var24 * var3;
                  var3 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var20 * var2;
                  var2 = 0;
               }

               if (var19 < var21) {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bj(ad, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23);
                           var5 += var20;
                           var6 += var21;
                           var12 += var24;
                           var3 += ae;
                        }
                     }

                     this.bj(ad, var3, 0, 0, var4 >> 14, var6 >> 14, var12, var23);
                     var4 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += ae;
                  }
               } else {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bj(ad, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23);
                           var5 += var20;
                           var6 += var21;
                           var12 += var24;
                           var3 += ae;
                        }
                     }

                     this.bj(ad, var3, 0, 0, var6 >> 14, var4 >> 14, var12, var23);
                     var4 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += ae;
                  }
               }
            }
         }
      }
   }

   void bi(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      int var13 = var5 - var4;
      int var14 = var2 - var1;
      int var15 = var6 - var4;
      int var16 = var3 - var1;
      int var17 = var11 - var10;
      int var18 = var12 - var10;
      int var19;
      if (var3 != var2) {
         var19 = (var6 - var5 << 14) / (var3 - var2);
      } else {
         var19 = 0;
      }

      int var20;
      if (var2 != var1) {
         var20 = (var13 << 14) / var14;
      } else {
         var20 = 0;
      }

      int var21;
      if (var3 != var1) {
         var21 = (var15 << 14) / var16;
      } else {
         var21 = 0;
      }

      int var22 = var13 * var16 - var15 * var14;
      if (var22 != 0) {
         int var23 = (var17 * var16 - var18 * var14 << 8) / var22;
         int var24 = (var18 * var13 - var17 * var15 << 8) / var22;
         int[] var25 = this.al.aj;
         int var26 = this.al.ah * -669972161;
         if (var1 <= var2 && var1 <= var3) {
            if (var1 < var26) {
               if (var2 > var26) {
                  var2 = var26;
               }

               if (var3 > var26) {
                  var3 = var26;
               }

               var10 = (var10 << 8) - var23 * var4 + var23;
               if (var2 < var3) {
                  var6 = var4 <<= 14;
                  if (var1 < 0) {
                     var6 -= var21 * var1;
                     var4 -= var20 * var1;
                     var10 -= var24 * var1;
                     var1 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var19 * var2;
                     var2 = 0;
                  }

                  if (var1 != var2 && var21 < var20 || var1 == var2 && var21 > var19) {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bj(ad, var1, 0, 0, var6 >> 14, var5 >> 14, var10, var23);
                              var6 += var21;
                              var5 += var19;
                              var10 += var24;
                              var1 += ae;
                           }
                        }

                        this.bj(ad, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23);
                        var6 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += ae;
                     }
                  } else {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bj(ad, var1, 0, 0, var5 >> 14, var6 >> 14, var10, var23);
                              var6 += var21;
                              var5 += var19;
                              var10 += var24;
                              var1 += ae;
                           }
                        }

                        this.bj(ad, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23);
                        var6 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += ae;
                     }
                  }
               } else {
                  var5 = var4 <<= 14;
                  if (var1 < 0) {
                     var5 -= var21 * var1;
                     var4 -= var20 * var1;
                     var10 -= var24 * var1;
                     var1 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var19 * var3;
                     var3 = 0;
                  }

                  if ((var1 == var3 || var21 >= var20) && (var1 != var3 || var19 <= var20)) {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bj(ad, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23);
                              var6 += var19;
                              var4 += var20;
                              var10 += var24;
                              var1 += ae;
                           }
                        }

                        this.bj(ad, var1, 0, 0, var4 >> 14, var5 >> 14, var10, var23);
                        var5 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += ae;
                     }
                  } else {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bj(ad, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23);
                              var6 += var19;
                              var4 += var20;
                              var10 += var24;
                              var1 += ae;
                           }
                        }

                        this.bj(ad, var1, 0, 0, var5 >> 14, var4 >> 14, var10, var23);
                        var5 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += ae;
                     }
                  }
               }
            }
         } else if (var2 <= var3) {
            if (var2 < var26) {
               if (var3 > var26) {
                  var3 = var26;
               }

               if (var1 > var26) {
                  var1 = var26;
               }

               var11 = (var11 << 8) - var23 * var5 + var23;
               if (var3 < var1) {
                  var4 = var5 <<= 14;
                  if (var2 < 0) {
                     var4 -= var20 * var2;
                     var5 -= var19 * var2;
                     var11 -= var24 * var2;
                     var2 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var21 * var3;
                     var3 = 0;
                  }

                  if (var2 != var3 && var20 < var19 || var2 == var3 && var20 > var21) {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bj(ad, var2, 0, 0, var4 >> 14, var6 >> 14, var11, var23);
                              var4 += var20;
                              var6 += var21;
                              var11 += var24;
                              var2 += ae;
                           }
                        }

                        this.bj(ad, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23);
                        var4 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += ae;
                     }
                  } else {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bj(ad, var2, 0, 0, var6 >> 14, var4 >> 14, var11, var23);
                              var4 += var20;
                              var6 += var21;
                              var11 += var24;
                              var2 += ae;
                           }
                        }

                        this.bj(ad, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23);
                        var4 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += ae;
                     }
                  }
               } else {
                  var6 = var5 <<= 14;
                  if (var2 < 0) {
                     var6 -= var20 * var2;
                     var5 -= var19 * var2;
                     var11 -= var24 * var2;
                     var2 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var21 * var1;
                     var1 = 0;
                  }

                  if (var20 < var19) {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bj(ad, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23);
                              var4 += var21;
                              var5 += var19;
                              var11 += var24;
                              var2 += ae;
                           }
                        }

                        this.bj(ad, var2, 0, 0, var6 >> 14, var5 >> 14, var11, var23);
                        var6 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += ae;
                     }
                  } else {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bj(ad, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23);
                              var4 += var21;
                              var5 += var19;
                              var11 += var24;
                              var2 += ae;
                           }
                        }

                        this.bj(ad, var2, 0, 0, var5 >> 14, var6 >> 14, var11, var23);
                        var6 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += ae;
                     }
                  }
               }
            }
         } else if (var3 < var26) {
            if (var1 > var26) {
               var1 = var26;
            }

            if (var2 > var26) {
               var2 = var26;
            }

            var12 = (var12 << 8) - var23 * var6 + var23;
            if (var1 < var2) {
               var5 = var6 <<= 14;
               if (var3 < 0) {
                  var5 -= var19 * var3;
                  var6 -= var21 * var3;
                  var12 -= var24 * var3;
                  var3 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var20 * var1;
                  var1 = 0;
               }

               if (var19 < var21) {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bj(ad, var3, 0, 0, var5 >> 14, var4 >> 14, var12, var23);
                           var5 += var19;
                           var4 += var20;
                           var12 += var24;
                           var3 += ae;
                        }
                     }

                     this.bj(ad, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23);
                     var5 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += ae;
                  }
               } else {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bj(ad, var3, 0, 0, var4 >> 14, var5 >> 14, var12, var23);
                           var5 += var19;
                           var4 += var20;
                           var12 += var24;
                           var3 += ae;
                        }
                     }

                     this.bj(ad, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23);
                     var5 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += ae;
                  }
               }
            } else {
               var4 = var6 <<= 14;
               if (var3 < 0) {
                  var4 -= var19 * var3;
                  var6 -= var21 * var3;
                  var12 -= var24 * var3;
                  var3 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var20 * var2;
                  var2 = 0;
               }

               if (var19 < var21) {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bj(ad, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23);
                           var5 += var20;
                           var6 += var21;
                           var12 += var24;
                           var3 += ae;
                        }
                     }

                     this.bj(ad, var3, 0, 0, var4 >> 14, var6 >> 14, var12, var23);
                     var4 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += ae;
                  }
               } else {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bj(ad, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23);
                           var5 += var20;
                           var6 += var21;
                           var12 += var24;
                           var3 += ae;
                        }
                     }

                     this.bj(ad, var3, 0, 0, var6 >> 14, var4 >> 14, var12, var23);
                     var4 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += ae;
                  }
               }
            }
         }
      }
   }

   void be(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10) {
      int var11 = 0;
      if (var2 != var1) {
         var11 = (var5 - var4 << 14) / (var2 - var1);
      }

      int var12 = 0;
      if (var3 != var2) {
         var12 = (var6 - var5 << 14) / (var3 - var2);
      }

      int var13 = 0;
      if (var3 != var1) {
         var13 = (var4 - var6 << 14) / (var1 - var3);
      }

      int[] var14 = this.al.aj;
      int var15 = this.al.ah * -1347859351;
      if (var1 <= var2 && var1 <= var3) {
         if (var1 < var15) {
            if (var2 > var15) {
               var2 = var15;
            }

            if (var3 > var15) {
               var3 = var15;
            }

            if (var2 < var3) {
               var6 = var4 <<= 14;
               if (var1 < 0) {
                  var6 -= var13 * var1;
                  var4 -= var11 * var1;
                  var1 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var12 * var2;
                  var2 = 0;
               }

               if ((var1 == var2 || var13 >= var11) && (var1 != var2 || var13 <= var12)) {
                  var3 -= var2;
                  var2 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bn(ad, var1, var10, 0, var5 >> 14, var6 >> 14);
                           var6 += var13;
                           var5 += var12;
                           var1 += ae;
                        }
                     }

                     this.bn(ad, var1, var10, 0, var4 >> 14, var6 >> 14);
                     var6 += var13;
                     var4 += var11;
                     var1 += ae;
                  }
               } else {
                  var3 -= var2;
                  var2 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bn(ad, var1, var10, 0, var6 >> 14, var5 >> 14);
                           var6 += var13;
                           var5 += var12;
                           var1 += ae;
                        }
                     }

                     this.bn(ad, var1, var10, 0, var6 >> 14, var4 >> 14);
                     var6 += var13;
                     var4 += var11;
                     var1 += ae;
                  }
               }
            } else {
               var5 = var4 <<= 14;
               if (var1 < 0) {
                  var5 -= var13 * var1;
                  var4 -= var11 * var1;
                  var1 = 0;
               }

               var6 <<= 14;
               if (var3 < 0) {
                  var6 -= var12 * var3;
                  var3 = 0;
               }

               if (var1 != var3 && var13 < var11 || var1 == var3 && var12 > var11) {
                  var2 -= var3;
                  var3 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bn(ad, var1, var10, 0, var6 >> 14, var4 >> 14);
                           var6 += var12;
                           var4 += var11;
                           var1 += ae;
                        }
                     }

                     this.bn(ad, var1, var10, 0, var5 >> 14, var4 >> 14);
                     var5 += var13;
                     var4 += var11;
                     var1 += ae;
                  }
               } else {
                  var2 -= var3;
                  var3 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bn(ad, var1, var10, 0, var4 >> 14, var6 >> 14);
                           var6 += var12;
                           var4 += var11;
                           var1 += ae;
                        }
                     }

                     this.bn(ad, var1, var10, 0, var4 >> 14, var5 >> 14);
                     var5 += var13;
                     var4 += var11;
                     var1 += ae;
                  }
               }
            }
         }
      } else if (var2 <= var3) {
         if (var2 < var15) {
            if (var3 > var15) {
               var3 = var15;
            }

            if (var1 > var15) {
               var1 = var15;
            }

            if (var3 < var1) {
               var4 = var5 <<= 14;
               if (var2 < 0) {
                  var4 -= var11 * var2;
                  var5 -= var12 * var2;
                  var2 = 0;
               }

               var6 <<= 14;
               if (var3 < 0) {
                  var6 -= var13 * var3;
                  var3 = 0;
               }

               if ((var2 == var3 || var11 >= var12) && (var2 != var3 || var11 <= var13)) {
                  var1 -= var3;
                  var3 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bn(ad, var2, var10, 0, var6 >> 14, var4 >> 14);
                           var4 += var11;
                           var6 += var13;
                           var2 += ae;
                        }
                     }

                     this.bn(ad, var2, var10, 0, var5 >> 14, var4 >> 14);
                     var4 += var11;
                     var5 += var12;
                     var2 += ae;
                  }
               } else {
                  var1 -= var3;
                  var3 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bn(ad, var2, var10, 0, var4 >> 14, var6 >> 14);
                           var4 += var11;
                           var6 += var13;
                           var2 += ae;
                        }
                     }

                     this.bn(ad, var2, var10, 0, var4 >> 14, var5 >> 14);
                     var4 += var11;
                     var5 += var12;
                     var2 += ae;
                  }
               }
            } else {
               var6 = var5 <<= 14;
               if (var2 < 0) {
                  var6 -= var11 * var2;
                  var5 -= var12 * var2;
                  var2 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var13 * var1;
                  var1 = 0;
               }

               if (var11 < var12) {
                  var3 -= var1;
                  var1 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bn(ad, var2, var10, 0, var4 >> 14, var5 >> 14);
                           var4 += var13;
                           var5 += var12;
                           var2 += ae;
                        }
                     }

                     this.bn(ad, var2, var10, 0, var6 >> 14, var5 >> 14);
                     var6 += var11;
                     var5 += var12;
                     var2 += ae;
                  }
               } else {
                  var3 -= var1;
                  var1 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bn(ad, var2, var10, 0, var5 >> 14, var4 >> 14);
                           var4 += var13;
                           var5 += var12;
                           var2 += ae;
                        }
                     }

                     this.bn(ad, var2, var10, 0, var5 >> 14, var6 >> 14);
                     var6 += var11;
                     var5 += var12;
                     var2 += ae;
                  }
               }
            }
         }
      } else if (var3 < var15) {
         if (var1 > var15) {
            var1 = var15;
         }

         if (var2 > var15) {
            var2 = var15;
         }

         if (var1 < var2) {
            var5 = var6 <<= 14;
            if (var3 < 0) {
               var5 -= var12 * var3;
               var6 -= var13 * var3;
               var3 = 0;
            }

            var4 <<= 14;
            if (var1 < 0) {
               var4 -= var11 * var1;
               var1 = 0;
            }

            if (var12 < var13) {
               var2 -= var1;
               var1 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           return;
                        }

                        this.bn(ad, var3, var10, 0, var5 >> 14, var4 >> 14);
                        var5 += var12;
                        var4 += var11;
                        var3 += ae;
                     }
                  }

                  this.bn(ad, var3, var10, 0, var5 >> 14, var6 >> 14);
                  var5 += var12;
                  var6 += var13;
                  var3 += ae;
               }
            } else {
               var2 -= var1;
               var1 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           return;
                        }

                        this.bn(ad, var3, var10, 0, var4 >> 14, var5 >> 14);
                        var5 += var12;
                        var4 += var11;
                        var3 += ae;
                     }
                  }

                  this.bn(ad, var3, var10, 0, var6 >> 14, var5 >> 14);
                  var5 += var12;
                  var6 += var13;
                  var3 += ae;
               }
            }
         } else {
            var4 = var6 <<= 14;
            if (var3 < 0) {
               var4 -= var12 * var3;
               var6 -= var13 * var3;
               var3 = 0;
            }

            var5 <<= 14;
            if (var2 < 0) {
               var5 -= var11 * var2;
               var2 = 0;
            }

            if (var12 < var13) {
               var1 -= var2;
               var2 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        this.bn(ad, var3, var10, 0, var5 >> 14, var6 >> 14);
                        var5 += var11;
                        var6 += var13;
                        var3 += ae;
                     }
                  }

                  this.bn(ad, var3, var10, 0, var4 >> 14, var6 >> 14);
                  var4 += var12;
                  var6 += var13;
                  var3 += ae;
               }
            } else {
               var1 -= var2;
               var2 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        this.bn(ad, var3, var10, 0, var6 >> 14, var5 >> 14);
                        var5 += var11;
                        var6 += var13;
                        var3 += ae;
                     }
                  }

                  this.bn(ad, var3, var10, 0, var6 >> 14, var4 >> 14);
                  var4 += var12;
                  var6 += var13;
                  var3 += ae;
               }
            }
         }
      }
   }

   void bk(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10) {
      int var11 = 0;
      if (var2 != var1) {
         var11 = (var5 - var4 << 14) / (var2 - var1);
      }

      int var12 = 0;
      if (var3 != var2) {
         var12 = (var6 - var5 << 14) / (var3 - var2);
      }

      int var13 = 0;
      if (var3 != var1) {
         var13 = (var4 - var6 << 14) / (var1 - var3);
      }

      int[] var14 = this.al.aj;
      int var15 = this.al.ah * 1944150617;
      if (var1 <= var2 && var1 <= var3) {
         if (var1 < var15) {
            if (var2 > var15) {
               var2 = var15;
            }

            if (var3 > var15) {
               var3 = var15;
            }

            if (var2 < var3) {
               var6 = var4 <<= 14;
               if (var1 < 0) {
                  var6 -= var13 * var1;
                  var4 -= var11 * var1;
                  var1 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var12 * var2;
                  var2 = 0;
               }

               if (var1 != var2 && var13 < var11 || var1 == var2 && var13 > var12) {
                  var3 -= var2;
                  var2 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bn(ad, var1, var10, 0, var6 >> 14, var5 >> 14);
                           var6 += var13;
                           var5 += var12;
                           var1 += ae;
                        }
                     }

                     this.bn(ad, var1, var10, 0, var6 >> 14, var4 >> 14);
                     var6 += var13;
                     var4 += var11;
                     var1 += ae;
                  }
               } else {
                  var3 -= var2;
                  var2 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bn(ad, var1, var10, 0, var5 >> 14, var6 >> 14);
                           var6 += var13;
                           var5 += var12;
                           var1 += ae;
                        }
                     }

                     this.bn(ad, var1, var10, 0, var4 >> 14, var6 >> 14);
                     var6 += var13;
                     var4 += var11;
                     var1 += ae;
                  }
               }
            } else {
               var5 = var4 <<= 14;
               if (var1 < 0) {
                  var5 -= var13 * var1;
                  var4 -= var11 * var1;
                  var1 = 0;
               }

               var6 <<= 14;
               if (var3 < 0) {
                  var6 -= var12 * var3;
                  var3 = 0;
               }

               if (var1 != var3 && var13 < var11 || var1 == var3 && var12 > var11) {
                  var2 -= var3;
                  var3 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bn(ad, var1, var10, 0, var6 >> 14, var4 >> 14);
                           var6 += var12;
                           var4 += var11;
                           var1 += ae;
                        }
                     }

                     this.bn(ad, var1, var10, 0, var5 >> 14, var4 >> 14);
                     var5 += var13;
                     var4 += var11;
                     var1 += ae;
                  }
               } else {
                  var2 -= var3;
                  var3 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bn(ad, var1, var10, 0, var4 >> 14, var6 >> 14);
                           var6 += var12;
                           var4 += var11;
                           var1 += ae;
                        }
                     }

                     this.bn(ad, var1, var10, 0, var4 >> 14, var5 >> 14);
                     var5 += var13;
                     var4 += var11;
                     var1 += ae;
                  }
               }
            }
         }
      } else if (var2 <= var3) {
         if (var2 < var15) {
            if (var3 > var15) {
               var3 = var15;
            }

            if (var1 > var15) {
               var1 = var15;
            }

            if (var3 < var1) {
               var4 = var5 <<= 14;
               if (var2 < 0) {
                  var4 -= var11 * var2;
                  var5 -= var12 * var2;
                  var2 = 0;
               }

               var6 <<= 14;
               if (var3 < 0) {
                  var6 -= var13 * var3;
                  var3 = 0;
               }

               if ((var2 == var3 || var11 >= var12) && (var2 != var3 || var11 <= var13)) {
                  var1 -= var3;
                  var3 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bn(ad, var2, var10, 0, var6 >> 14, var4 >> 14);
                           var4 += var11;
                           var6 += var13;
                           var2 += ae;
                        }
                     }

                     this.bn(ad, var2, var10, 0, var5 >> 14, var4 >> 14);
                     var4 += var11;
                     var5 += var12;
                     var2 += ae;
                  }
               } else {
                  var1 -= var3;
                  var3 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bn(ad, var2, var10, 0, var4 >> 14, var6 >> 14);
                           var4 += var11;
                           var6 += var13;
                           var2 += ae;
                        }
                     }

                     this.bn(ad, var2, var10, 0, var4 >> 14, var5 >> 14);
                     var4 += var11;
                     var5 += var12;
                     var2 += ae;
                  }
               }
            } else {
               var6 = var5 <<= 14;
               if (var2 < 0) {
                  var6 -= var11 * var2;
                  var5 -= var12 * var2;
                  var2 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var13 * var1;
                  var1 = 0;
               }

               if (var11 < var12) {
                  var3 -= var1;
                  var1 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bn(ad, var2, var10, 0, var4 >> 14, var5 >> 14);
                           var4 += var13;
                           var5 += var12;
                           var2 += ae;
                        }
                     }

                     this.bn(ad, var2, var10, 0, var6 >> 14, var5 >> 14);
                     var6 += var11;
                     var5 += var12;
                     var2 += ae;
                  }
               } else {
                  var3 -= var1;
                  var1 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bn(ad, var2, var10, 0, var5 >> 14, var4 >> 14);
                           var4 += var13;
                           var5 += var12;
                           var2 += ae;
                        }
                     }

                     this.bn(ad, var2, var10, 0, var5 >> 14, var6 >> 14);
                     var6 += var11;
                     var5 += var12;
                     var2 += ae;
                  }
               }
            }
         }
      } else if (var3 < var15) {
         if (var1 > var15) {
            var1 = var15;
         }

         if (var2 > var15) {
            var2 = var15;
         }

         if (var1 < var2) {
            var5 = var6 <<= 14;
            if (var3 < 0) {
               var5 -= var12 * var3;
               var6 -= var13 * var3;
               var3 = 0;
            }

            var4 <<= 14;
            if (var1 < 0) {
               var4 -= var11 * var1;
               var1 = 0;
            }

            if (var12 < var13) {
               var2 -= var1;
               var1 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           return;
                        }

                        this.bn(ad, var3, var10, 0, var5 >> 14, var4 >> 14);
                        var5 += var12;
                        var4 += var11;
                        var3 += ae;
                     }
                  }

                  this.bn(ad, var3, var10, 0, var5 >> 14, var6 >> 14);
                  var5 += var12;
                  var6 += var13;
                  var3 += ae;
               }
            } else {
               var2 -= var1;
               var1 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           return;
                        }

                        this.bn(ad, var3, var10, 0, var4 >> 14, var5 >> 14);
                        var5 += var12;
                        var4 += var11;
                        var3 += ae;
                     }
                  }

                  this.bn(ad, var3, var10, 0, var6 >> 14, var5 >> 14);
                  var5 += var12;
                  var6 += var13;
                  var3 += ae;
               }
            }
         } else {
            var4 = var6 <<= 14;
            if (var3 < 0) {
               var4 -= var12 * var3;
               var6 -= var13 * var3;
               var3 = 0;
            }

            var5 <<= 14;
            if (var2 < 0) {
               var5 -= var11 * var2;
               var2 = 0;
            }

            if (var12 < var13) {
               var1 -= var2;
               var2 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        this.bn(ad, var3, var10, 0, var5 >> 14, var6 >> 14);
                        var5 += var11;
                        var6 += var13;
                        var3 += ae;
                     }
                  }

                  this.bn(ad, var3, var10, 0, var4 >> 14, var6 >> 14);
                  var4 += var12;
                  var6 += var13;
                  var3 += ae;
               }
            } else {
               var1 -= var2;
               var2 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        this.bn(ad, var3, var10, 0, var6 >> 14, var5 >> 14);
                        var5 += var11;
                        var6 += var13;
                        var3 += ae;
                     }
                  }

                  this.bn(ad, var3, var10, 0, var6 >> 14, var4 >> 14);
                  var4 += var12;
                  var6 += var13;
                  var3 += ae;
               }
            }
         }
      }
   }

   void bx(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.al.aq.aw(var22, 619046308);
      int var24;
      if (var23 == null) {
         var24 = this.al.aq.ac(var22, 1560094582);
         this.ab(var1, var2, var3, var4, var5, var6, var7, var8, var9, ig.aw(var24, var10, 769773533), ig.aw(var24, var11, 769773533), ig.aw(var24, var12, 769773533));
      } else {
         this.an = this.al.aq.ab(var22, -407888071);
         this.af = this.al.aq.au(var22, (byte)-109);
         var24 = var5 - var4;
         int var25 = var2 - var1;
         int var26 = var6 - var4;
         int var27 = var3 - var1;
         int var28 = var11 - var10;
         int var29 = var12 - var10;
         int var30 = 0;
         if (var2 != var1) {
            var30 = (var5 - var4 << 14) / (var2 - var1);
         }

         int var31 = 0;
         if (var3 != var2) {
            var31 = (var6 - var5 << 14) / (var3 - var2);
         }

         int var32 = 0;
         if (var3 != var1) {
            var32 = (var4 - var6 << 14) / (var1 - var3);
         }

         int var33 = var24 * var27 - var26 * var25;
         if (var33 != 0) {
            int var34 = (var28 * var27 - var29 * var25 << 9) / var33;
            int var35 = (var29 * var24 - var28 * var26 << 9) / var33;
            int var36 = this.al.ab * -1734758735;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var37 = var15 * var16 - var18 * var13 << 14;
            int var38 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / (long)var36);
            int var39 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / (long)var36);
            int var40 = var14 * var16 - var17 * var13 << 14;
            int var41 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / (long)var36);
            int var42 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / (long)var36);
            int var43 = var17 * var15 - var14 * var18 << 14;
            int var44 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / (long)var36);
            int var45 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / (long)var36);
            int[] var46 = this.al.aj;
            int var47 = this.al.ah * -1364265139;
            int var48;
            if (var1 <= var2 && var1 <= var3) {
               if (var1 < var47) {
                  if (var2 > var47) {
                     var2 = var47;
                  }

                  if (var3 > var47) {
                     var3 = var47;
                  }

                  var10 = (var10 << 9) - var34 * var4 + var34;
                  if (var2 < var3) {
                     var6 = var4 <<= 14;
                     if (var1 < 0) {
                        var6 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var31 * var2;
                        var2 = 0;
                     }

                     var48 = var1 - this.al.ai * -61648321;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if ((var1 == var2 || var32 >= var30) && (var1 != var2 || var32 <= var31)) {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var5 = var4 <<= 14;
                     if (var1 < 0) {
                        var5 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var31 * var3;
                        var3 = 0;
                     }

                     var48 = var1 - this.al.ai * 1666539507;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if (var1 != var3 && var32 < var30 || var1 == var3 && var31 > var30) {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var2 <= var3) {
               if (var2 < var47) {
                  if (var3 > var47) {
                     var3 = var47;
                  }

                  if (var1 > var47) {
                     var1 = var47;
                  }

                  var11 = (var11 << 9) - var34 * var5 + var34;
                  if (var3 < var1) {
                     var4 = var5 <<= 14;
                     if (var2 < 0) {
                        var4 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var32 * var3;
                        var3 = 0;
                     }

                     var48 = var2 - this.al.ai * 1666539507;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if ((var2 == var3 || var30 >= var31) && (var2 != var3 || var30 <= var32)) {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var6 = var5 <<= 14;
                     if (var2 < 0) {
                        var6 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var4 <<= 14;
                     if (var1 < 0) {
                        var4 -= var32 * var1;
                        var1 = 0;
                     }

                     var48 = var2 - this.al.ai * 1666539507;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if (var30 < var31) {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var3 < var47) {
               if (var1 > var47) {
                  var1 = var47;
               }

               if (var2 > var47) {
                  var2 = var47;
               }

               var12 = (var12 << 9) - var34 * var6 + var34;
               if (var1 < var2) {
                  var5 = var6 <<= 14;
                  if (var3 < 0) {
                     var5 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var30 * var1;
                     var1 = 0;
                  }

                  var48 = var3 - this.al.ai * 1666539507;
                  var37 += var39 * var48;
                  var40 += var42 * var48;
                  var43 += var45 * var48;
                  if (var31 < var32) {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bs(ad, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bs(ad, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bs(ad, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bs(ad, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               } else {
                  var4 = var6 <<= 14;
                  if (var3 < 0) {
                     var4 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var30 * var2;
                     var2 = 0;
                  }

                  var48 = var3 - this.al.ai * 111358205;
                  var37 += var39 * var48;
                  var40 += var42 * var48;
                  var43 += var45 * var48;
                  if (var31 < var32) {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bs(ad, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bs(ad, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bs(ad, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bs(ad, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               }
            }
         }
      }
   }

   void bo(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.al.aq.aw(var22, 956939118);
      int var24;
      if (var23 == null) {
         var24 = this.al.aq.ac(var22, 206894700);
         this.ab(var1, var2, var3, var4, var5, var6, var7, var8, var9, ig.aw(var24, var10, 769773533), ig.aw(var24, var11, 769773533), ig.aw(var24, var12, 769773533));
      } else {
         this.an = this.al.aq.ab(var22, -407888071);
         this.af = this.al.aq.au(var22, (byte)-70);
         var24 = var5 - var4;
         int var25 = var2 - var1;
         int var26 = var6 - var4;
         int var27 = var3 - var1;
         int var28 = var11 - var10;
         int var29 = var12 - var10;
         int var30 = 0;
         if (var2 != var1) {
            var30 = (var5 - var4 << 14) / (var2 - var1);
         }

         int var31 = 0;
         if (var3 != var2) {
            var31 = (var6 - var5 << 14) / (var3 - var2);
         }

         int var32 = 0;
         if (var3 != var1) {
            var32 = (var4 - var6 << 14) / (var1 - var3);
         }

         int var33 = var24 * var27 - var26 * var25;
         if (var33 != 0) {
            int var34 = (var28 * var27 - var29 * var25 << 9) / var33;
            int var35 = (var29 * var24 - var28 * var26 << 9) / var33;
            int var36 = this.al.ab * -796146298;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var37 = var15 * var16 - var18 * var13 << 14;
            int var38 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / (long)var36);
            int var39 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / (long)var36);
            int var40 = var14 * var16 - var17 * var13 << 14;
            int var41 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / (long)var36);
            int var42 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / (long)var36);
            int var43 = var17 * var15 - var14 * var18 << 14;
            int var44 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / (long)var36);
            int var45 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / (long)var36);
            int[] var46 = this.al.aj;
            int var47 = this.al.ah * -150615273;
            int var48;
            if (var1 <= var2 && var1 <= var3) {
               if (var1 < var47) {
                  if (var2 > var47) {
                     var2 = var47;
                  }

                  if (var3 > var47) {
                     var3 = var47;
                  }

                  var10 = (var10 << 9) - var34 * var4 + var34;
                  if (var2 < var3) {
                     var6 = var4 <<= 14;
                     if (var1 < 0) {
                        var6 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var31 * var2;
                        var2 = 0;
                     }

                     var48 = var1 - this.al.ai * 355006748;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if (var1 != var2 && var32 < var30 || var1 == var2 && var32 > var31) {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var5 = var4 <<= 14;
                     if (var1 < 0) {
                        var5 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var31 * var3;
                        var3 = 0;
                     }

                     var48 = var1 - this.al.ai * 1666539507;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if (var1 != var3 && var32 < var30 || var1 == var3 && var31 > var30) {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var2 <= var3) {
               if (var2 < var47) {
                  if (var3 > var47) {
                     var3 = var47;
                  }

                  if (var1 > var47) {
                     var1 = var47;
                  }

                  var11 = (var11 << 9) - var34 * var5 + var34;
                  if (var3 < var1) {
                     var4 = var5 <<= 14;
                     if (var2 < 0) {
                        var4 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var32 * var3;
                        var3 = 0;
                     }

                     var48 = var2 - this.al.ai * 1235172375;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if (var2 != var3 && var30 < var31 || var2 == var3 && var30 > var32) {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var6 = var5 <<= 14;
                     if (var2 < 0) {
                        var6 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var4 <<= 14;
                     if (var1 < 0) {
                        var4 -= var32 * var1;
                        var1 = 0;
                     }

                     var48 = var2 - this.al.ai * 1666539507;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if (var30 < var31) {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var3 < var47) {
               if (var1 > var47) {
                  var1 = var47;
               }

               if (var2 > var47) {
                  var2 = var47;
               }

               var12 = (var12 << 9) - var34 * var6 + var34;
               if (var1 < var2) {
                  var5 = var6 <<= 14;
                  if (var3 < 0) {
                     var5 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var30 * var1;
                     var1 = 0;
                  }

                  var48 = var3 - this.al.ai * 1666539507;
                  var37 += var39 * var48;
                  var40 += var42 * var48;
                  var43 += var45 * var48;
                  if (var31 < var32) {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bs(ad, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bs(ad, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bs(ad, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bs(ad, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               } else {
                  var4 = var6 <<= 14;
                  if (var3 < 0) {
                     var4 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var30 * var2;
                     var2 = 0;
                  }

                  var48 = var3 - this.al.ai * 1666539507;
                  var37 += var39 * var48;
                  var40 += var42 * var48;
                  var43 += var45 * var48;
                  if (var31 < var32) {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bs(ad, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bs(ad, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bs(ad, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bs(ad, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               }
            }
         }
      }
   }

   void ap(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      int var13 = var5 - var4;
      int var14 = var2 - var1;
      int var15 = var6 - var4;
      int var16 = var3 - var1;
      int var17 = var11 - var10;
      int var18 = var12 - var10;
      int var19;
      if (var3 != var2) {
         var19 = (var6 - var5 << 14) / (var3 - var2);
      } else {
         var19 = 0;
      }

      int var20;
      if (var2 != var1) {
         var20 = (var13 << 14) / var14;
      } else {
         var20 = 0;
      }

      int var21;
      if (var3 != var1) {
         var21 = (var15 << 14) / var16;
      } else {
         var21 = 0;
      }

      int var22 = var13 * var16 - var15 * var14;
      if (var22 != 0) {
         int var23 = (var17 * var16 - var18 * var14 << 8) / var22;
         int var24 = (var18 * var13 - var17 * var15 << 8) / var22;
         int[] var25 = this.al.aj;
         int var26 = this.al.ah * -1347859351;
         if (var1 <= var2 && var1 <= var3) {
            if (var1 < var26) {
               if (var2 > var26) {
                  var2 = var26;
               }

               if (var3 > var26) {
                  var3 = var26;
               }

               var10 = (var10 << 8) - var23 * var4 + var23;
               if (var2 < var3) {
                  var6 = var4 <<= 14;
                  if (var1 < 0) {
                     var6 -= var21 * var1;
                     var4 -= var20 * var1;
                     var10 -= var24 * var1;
                     var1 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var19 * var2;
                     var2 = 0;
                  }

                  if (var1 != var2 && var21 < var20 || var1 == var2 && var21 > var19) {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bj(ad, var1, 0, 0, var6 >> 14, var5 >> 14, var10, var23);
                              var6 += var21;
                              var5 += var19;
                              var10 += var24;
                              var1 += ae;
                           }
                        }

                        this.bj(ad, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23);
                        var6 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += ae;
                     }
                  } else {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bj(ad, var1, 0, 0, var5 >> 14, var6 >> 14, var10, var23);
                              var6 += var21;
                              var5 += var19;
                              var10 += var24;
                              var1 += ae;
                           }
                        }

                        this.bj(ad, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23);
                        var6 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += ae;
                     }
                  }
               } else {
                  var5 = var4 <<= 14;
                  if (var1 < 0) {
                     var5 -= var21 * var1;
                     var4 -= var20 * var1;
                     var10 -= var24 * var1;
                     var1 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var19 * var3;
                     var3 = 0;
                  }

                  if ((var1 == var3 || var21 >= var20) && (var1 != var3 || var19 <= var20)) {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bj(ad, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23);
                              var6 += var19;
                              var4 += var20;
                              var10 += var24;
                              var1 += ae;
                           }
                        }

                        this.bj(ad, var1, 0, 0, var4 >> 14, var5 >> 14, var10, var23);
                        var5 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += ae;
                     }
                  } else {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bj(ad, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23);
                              var6 += var19;
                              var4 += var20;
                              var10 += var24;
                              var1 += ae;
                           }
                        }

                        this.bj(ad, var1, 0, 0, var5 >> 14, var4 >> 14, var10, var23);
                        var5 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += ae;
                     }
                  }
               }
            }
         } else if (var2 <= var3) {
            if (var2 < var26) {
               if (var3 > var26) {
                  var3 = var26;
               }

               if (var1 > var26) {
                  var1 = var26;
               }

               var11 = (var11 << 8) - var23 * var5 + var23;
               if (var3 < var1) {
                  var4 = var5 <<= 14;
                  if (var2 < 0) {
                     var4 -= var20 * var2;
                     var5 -= var19 * var2;
                     var11 -= var24 * var2;
                     var2 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var21 * var3;
                     var3 = 0;
                  }

                  if (var2 != var3 && var20 < var19 || var2 == var3 && var20 > var21) {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bj(ad, var2, 0, 0, var4 >> 14, var6 >> 14, var11, var23);
                              var4 += var20;
                              var6 += var21;
                              var11 += var24;
                              var2 += ae;
                           }
                        }

                        this.bj(ad, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23);
                        var4 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += ae;
                     }
                  } else {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bj(ad, var2, 0, 0, var6 >> 14, var4 >> 14, var11, var23);
                              var4 += var20;
                              var6 += var21;
                              var11 += var24;
                              var2 += ae;
                           }
                        }

                        this.bj(ad, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23);
                        var4 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += ae;
                     }
                  }
               } else {
                  var6 = var5 <<= 14;
                  if (var2 < 0) {
                     var6 -= var20 * var2;
                     var5 -= var19 * var2;
                     var11 -= var24 * var2;
                     var2 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var21 * var1;
                     var1 = 0;
                  }

                  if (var20 < var19) {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bj(ad, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23);
                              var4 += var21;
                              var5 += var19;
                              var11 += var24;
                              var2 += ae;
                           }
                        }

                        this.bj(ad, var2, 0, 0, var6 >> 14, var5 >> 14, var11, var23);
                        var6 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += ae;
                     }
                  } else {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bj(ad, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23);
                              var4 += var21;
                              var5 += var19;
                              var11 += var24;
                              var2 += ae;
                           }
                        }

                        this.bj(ad, var2, 0, 0, var5 >> 14, var6 >> 14, var11, var23);
                        var6 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += ae;
                     }
                  }
               }
            }
         } else if (var3 < var26) {
            if (var1 > var26) {
               var1 = var26;
            }

            if (var2 > var26) {
               var2 = var26;
            }

            var12 = (var12 << 8) - var23 * var6 + var23;
            if (var1 < var2) {
               var5 = var6 <<= 14;
               if (var3 < 0) {
                  var5 -= var19 * var3;
                  var6 -= var21 * var3;
                  var12 -= var24 * var3;
                  var3 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var20 * var1;
                  var1 = 0;
               }

               if (var19 < var21) {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bj(ad, var3, 0, 0, var5 >> 14, var4 >> 14, var12, var23);
                           var5 += var19;
                           var4 += var20;
                           var12 += var24;
                           var3 += ae;
                        }
                     }

                     this.bj(ad, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23);
                     var5 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += ae;
                  }
               } else {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bj(ad, var3, 0, 0, var4 >> 14, var5 >> 14, var12, var23);
                           var5 += var19;
                           var4 += var20;
                           var12 += var24;
                           var3 += ae;
                        }
                     }

                     this.bj(ad, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23);
                     var5 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += ae;
                  }
               }
            } else {
               var4 = var6 <<= 14;
               if (var3 < 0) {
                  var4 -= var19 * var3;
                  var6 -= var21 * var3;
                  var12 -= var24 * var3;
                  var3 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var20 * var2;
                  var2 = 0;
               }

               if (var19 < var21) {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bj(ad, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23);
                           var5 += var20;
                           var6 += var21;
                           var12 += var24;
                           var3 += ae;
                        }
                     }

                     this.bj(ad, var3, 0, 0, var4 >> 14, var6 >> 14, var12, var23);
                     var4 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += ae;
                  }
               } else {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bj(ad, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23);
                           var5 += var20;
                           var6 += var21;
                           var12 += var24;
                           var3 += ae;
                        }
                     }

                     this.bj(ad, var3, 0, 0, var6 >> 14, var4 >> 14, var12, var23);
                     var4 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += ae;
                  }
               }
            }
         }
      }
   }

   void bm(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.al.aq.aw(var22, -1408519430);
      int var24;
      if (var23 == null) {
         var24 = this.al.aq.ac(var22, -534074802);
         this.ab(var1, var2, var3, var4, var5, var6, var7, var8, var9, ig.aw(var24, var10, 769773533), ig.aw(var24, var11, 769773533), ig.aw(var24, var12, 769773533));
      } else {
         this.an = this.al.aq.ab(var22, -407888071);
         this.af = this.al.aq.au(var22, (byte)-15);
         var24 = var5 - var4;
         int var25 = var2 - var1;
         int var26 = var6 - var4;
         int var27 = var3 - var1;
         int var28 = var11 - var10;
         int var29 = var12 - var10;
         int var30 = 0;
         if (var2 != var1) {
            var30 = (var5 - var4 << 14) / (var2 - var1);
         }

         int var31 = 0;
         if (var3 != var2) {
            var31 = (var6 - var5 << 14) / (var3 - var2);
         }

         int var32 = 0;
         if (var3 != var1) {
            var32 = (var4 - var6 << 14) / (var1 - var3);
         }

         int var33 = var24 * var27 - var26 * var25;
         if (var33 != 0) {
            int var34 = (var28 * var27 - var29 * var25 << 9) / var33;
            int var35 = (var29 * var24 - var28 * var26 << 9) / var33;
            int var36 = this.al.ab * -1734758735;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var37 = var15 * var16 - var18 * var13 << 14;
            int var38 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / (long)var36);
            int var39 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / (long)var36);
            int var40 = var14 * var16 - var17 * var13 << 14;
            int var41 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / (long)var36);
            int var42 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / (long)var36);
            int var43 = var17 * var15 - var14 * var18 << 14;
            int var44 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / (long)var36);
            int var45 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / (long)var36);
            int[] var46 = this.al.aj;
            int var47 = this.al.ah * -1463510850;
            int var48;
            if (var1 <= var2 && var1 <= var3) {
               if (var1 < var47) {
                  if (var2 > var47) {
                     var2 = var47;
                  }

                  if (var3 > var47) {
                     var3 = var47;
                  }

                  var10 = (var10 << 9) - var34 * var4 + var34;
                  if (var2 < var3) {
                     var6 = var4 <<= 14;
                     if (var1 < 0) {
                        var6 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var31 * var2;
                        var2 = 0;
                     }

                     var48 = var1 - this.al.ai * -691637532;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if (var1 != var2 && var32 < var30 || var1 == var2 && var32 > var31) {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var5 = var4 <<= 14;
                     if (var1 < 0) {
                        var5 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var31 * var3;
                        var3 = 0;
                     }

                     var48 = var1 - this.al.ai * 309220092;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if ((var1 == var3 || var32 >= var30) && (var1 != var3 || var31 <= var30)) {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var2 <= var3) {
               if (var2 < var47) {
                  if (var3 > var47) {
                     var3 = var47;
                  }

                  if (var1 > var47) {
                     var1 = var47;
                  }

                  var11 = (var11 << 9) - var34 * var5 + var34;
                  if (var3 < var1) {
                     var4 = var5 <<= 14;
                     if (var2 < 0) {
                        var4 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var32 * var3;
                        var3 = 0;
                     }

                     var48 = var2 - this.al.ai * 1666539507;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if (var2 != var3 && var30 < var31 || var2 == var3 && var30 > var32) {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var6 = var5 <<= 14;
                     if (var2 < 0) {
                        var6 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var4 <<= 14;
                     if (var1 < 0) {
                        var4 -= var32 * var1;
                        var1 = 0;
                     }

                     var48 = var2 - this.al.ai * 2010572938;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if (var30 < var31) {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var3 < var47) {
               if (var1 > var47) {
                  var1 = var47;
               }

               if (var2 > var47) {
                  var2 = var47;
               }

               var12 = (var12 << 9) - var34 * var6 + var34;
               if (var1 < var2) {
                  var5 = var6 <<= 14;
                  if (var3 < 0) {
                     var5 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var30 * var1;
                     var1 = 0;
                  }

                  var48 = var3 - this.al.ai * -1785815594;
                  var37 += var39 * var48;
                  var40 += var42 * var48;
                  var43 += var45 * var48;
                  if (var31 < var32) {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bs(ad, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bs(ad, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bs(ad, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bs(ad, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               } else {
                  var4 = var6 <<= 14;
                  if (var3 < 0) {
                     var4 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var30 * var2;
                     var2 = 0;
                  }

                  var48 = var3 - this.al.ai * 557014065;
                  var37 += var39 * var48;
                  var40 += var42 * var48;
                  var43 += var45 * var48;
                  if (var31 < var32) {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bs(ad, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bs(ad, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bs(ad, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bs(ad, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               }
            }
         }
      }
   }

   void bd(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.al.aq.aw(var22, 1929109193);
      int var24;
      if (var23 == null) {
         var24 = this.al.aq.ac(var22, 759976976);
         this.ab(var1, var2, var3, var4, var5, var6, var7, var8, var9, ig.aw(var24, var10, 769773533), ig.aw(var24, var11, 769773533), ig.aw(var24, var12, 769773533));
      } else {
         this.an = this.al.aq.ab(var22, -407888071);
         this.af = this.al.aq.au(var22, (byte)-109);
         var24 = var5 - var4;
         int var25 = var2 - var1;
         int var26 = var6 - var4;
         int var27 = var3 - var1;
         int var28 = var11 - var10;
         int var29 = var12 - var10;
         int var30 = 0;
         if (var2 != var1) {
            var30 = (var5 - var4 << 14) / (var2 - var1);
         }

         int var31 = 0;
         if (var3 != var2) {
            var31 = (var6 - var5 << 14) / (var3 - var2);
         }

         int var32 = 0;
         if (var3 != var1) {
            var32 = (var4 - var6 << 14) / (var1 - var3);
         }

         int var33 = var24 * var27 - var26 * var25;
         if (var33 != 0) {
            int var34 = (var28 * var27 - var29 * var25 << 9) / var33;
            int var35 = (var29 * var24 - var28 * var26 << 9) / var33;
            int var36 = this.al.ab * -1734758735;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var37 = var15 * var16 - var18 * var13 << 14;
            int var38 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / (long)var36);
            int var39 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / (long)var36);
            int var40 = var14 * var16 - var17 * var13 << 14;
            int var41 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / (long)var36);
            int var42 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / (long)var36);
            int var43 = var17 * var15 - var14 * var18 << 14;
            int var44 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / (long)var36);
            int var45 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / (long)var36);
            int[] var46 = this.al.aj;
            int var47 = this.al.ah * -1347859351;
            int var48 = this.al.ai * 1666539507;
            int var49;
            if (var1 <= var2 && var1 <= var3) {
               if (var1 < var47) {
                  if (var2 > var47) {
                     var2 = var47;
                  }

                  if (var3 > var47) {
                     var3 = var47;
                  }

                  var10 = (var10 << 9) - var34 * var4 + var34;
                  if (var2 < var3) {
                     var6 = var4 <<= 14;
                     if (var1 < 0) {
                        var6 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var31 * var2;
                        var2 = 0;
                     }

                     var49 = var1 - var48;
                     var37 += var39 * var49;
                     var40 += var42 * var49;
                     var43 += var45 * var49;
                     if (var1 != var2 && var32 < var30 || var1 == var2 && var32 > var31) {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.br(ad, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.br(ad, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.br(ad, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.br(ad, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var5 = var4 <<= 14;
                     if (var1 < 0) {
                        var5 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var31 * var3;
                        var3 = 0;
                     }

                     var49 = var1 - var48;
                     var37 += var39 * var49;
                     var40 += var42 * var49;
                     var43 += var45 * var49;
                     if (var1 != var3 && var32 < var30 || var1 == var3 && var31 > var30) {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.br(ad, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.br(ad, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.br(ad, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.br(ad, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var2 <= var3) {
               if (var2 < var47) {
                  if (var3 > var47) {
                     var3 = var47;
                  }

                  if (var1 > var47) {
                     var1 = var47;
                  }

                  var11 = (var11 << 9) - var34 * var5 + var34;
                  if (var3 < var1) {
                     var4 = var5 <<= 14;
                     if (var2 < 0) {
                        var4 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var32 * var3;
                        var3 = 0;
                     }

                     var49 = var2 - var48;
                     var37 += var39 * var49;
                     var40 += var42 * var49;
                     var43 += var45 * var49;
                     if (var2 != var3 && var30 < var31 || var2 == var3 && var30 > var32) {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.br(ad, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.br(ad, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.br(ad, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.br(ad, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var6 = var5 <<= 14;
                     if (var2 < 0) {
                        var6 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var4 <<= 14;
                     if (var1 < 0) {
                        var4 -= var32 * var1;
                        var1 = 0;
                     }

                     var49 = var2 - var48;
                     var37 += var39 * var49;
                     var40 += var42 * var49;
                     var43 += var45 * var49;
                     if (var30 < var31) {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.br(ad, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.br(ad, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.br(ad, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.br(ad, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var3 < var47) {
               if (var1 > var47) {
                  var1 = var47;
               }

               if (var2 > var47) {
                  var2 = var47;
               }

               var12 = (var12 << 9) - var34 * var6 + var34;
               if (var1 < var2) {
                  var5 = var6 <<= 14;
                  if (var3 < 0) {
                     var5 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var30 * var1;
                     var1 = 0;
                  }

                  var49 = var3 - var48;
                  var37 += var39 * var49;
                  var40 += var42 * var49;
                  var43 += var45 * var49;
                  if (var31 < var32) {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.br(ad, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.br(ad, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.br(ad, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.br(ad, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               } else {
                  var4 = var6 <<= 14;
                  if (var3 < 0) {
                     var4 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var30 * var2;
                     var2 = 0;
                  }

                  var49 = var3 - var48;
                  var37 += var39 * var49;
                  var40 += var42 * var49;
                  var43 += var45 * var49;
                  if (var31 < var32) {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.br(ad, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.br(ad, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.br(ad, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.br(ad, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               }
            }
         }
      }
   }

   void bt(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.al.aq.aw(var22, 965077563);
      int var24;
      if (var23 == null) {
         var24 = this.al.aq.ac(var22, -368749300);
         this.ab(var1, var2, var3, var4, var5, var6, var7, var8, var9, ig.aw(var24, var10, 769773533), ig.aw(var24, var11, 769773533), ig.aw(var24, var12, 769773533));
      } else {
         this.an = this.al.aq.ab(var22, -407888071);
         this.af = this.al.aq.au(var22, (byte)-51);
         var24 = var5 - var4;
         int var25 = var2 - var1;
         int var26 = var6 - var4;
         int var27 = var3 - var1;
         int var28 = var11 - var10;
         int var29 = var12 - var10;
         int var30 = 0;
         if (var2 != var1) {
            var30 = (var5 - var4 << 14) / (var2 - var1);
         }

         int var31 = 0;
         if (var3 != var2) {
            var31 = (var6 - var5 << 14) / (var3 - var2);
         }

         int var32 = 0;
         if (var3 != var1) {
            var32 = (var4 - var6 << 14) / (var1 - var3);
         }

         int var33 = var24 * var27 - var26 * var25;
         if (var33 != 0) {
            int var34 = (var28 * var27 - var29 * var25 << 9) / var33;
            int var35 = (var29 * var24 - var28 * var26 << 9) / var33;
            int var36 = this.al.ab * -1734758735;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var37 = var15 * var16 - var18 * var13 << 14;
            int var38 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / (long)var36);
            int var39 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / (long)var36);
            int var40 = var14 * var16 - var17 * var13 << 14;
            int var41 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / (long)var36);
            int var42 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / (long)var36);
            int var43 = var17 * var15 - var14 * var18 << 14;
            int var44 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / (long)var36);
            int var45 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / (long)var36);
            int[] var46 = this.al.aj;
            int var47 = this.al.ah * -1347859351;
            int var48 = this.al.ai * 1666539507;
            int var49;
            if (var1 <= var2 && var1 <= var3) {
               if (var1 < var47) {
                  if (var2 > var47) {
                     var2 = var47;
                  }

                  if (var3 > var47) {
                     var3 = var47;
                  }

                  var10 = (var10 << 9) - var34 * var4 + var34;
                  if (var2 < var3) {
                     var6 = var4 <<= 14;
                     if (var1 < 0) {
                        var6 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var31 * var2;
                        var2 = 0;
                     }

                     var49 = var1 - var48;
                     var37 += var39 * var49;
                     var40 += var42 * var49;
                     var43 += var45 * var49;
                     if ((var1 == var2 || var32 >= var30) && (var1 != var2 || var32 <= var31)) {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.br(ad, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.br(ad, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.br(ad, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.br(ad, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var5 = var4 <<= 14;
                     if (var1 < 0) {
                        var5 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var31 * var3;
                        var3 = 0;
                     }

                     var49 = var1 - var48;
                     var37 += var39 * var49;
                     var40 += var42 * var49;
                     var43 += var45 * var49;
                     if (var1 != var3 && var32 < var30 || var1 == var3 && var31 > var30) {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.br(ad, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.br(ad, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.br(ad, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.br(ad, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var2 <= var3) {
               if (var2 < var47) {
                  if (var3 > var47) {
                     var3 = var47;
                  }

                  if (var1 > var47) {
                     var1 = var47;
                  }

                  var11 = (var11 << 9) - var34 * var5 + var34;
                  if (var3 < var1) {
                     var4 = var5 <<= 14;
                     if (var2 < 0) {
                        var4 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var32 * var3;
                        var3 = 0;
                     }

                     var49 = var2 - var48;
                     var37 += var39 * var49;
                     var40 += var42 * var49;
                     var43 += var45 * var49;
                     if ((var2 == var3 || var30 >= var31) && (var2 != var3 || var30 <= var32)) {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.br(ad, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.br(ad, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.br(ad, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.br(ad, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var6 = var5 <<= 14;
                     if (var2 < 0) {
                        var6 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var4 <<= 14;
                     if (var1 < 0) {
                        var4 -= var32 * var1;
                        var1 = 0;
                     }

                     var49 = var2 - var48;
                     var37 += var39 * var49;
                     var40 += var42 * var49;
                     var43 += var45 * var49;
                     if (var30 < var31) {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.br(ad, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.br(ad, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.br(ad, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.br(ad, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var3 < var47) {
               if (var1 > var47) {
                  var1 = var47;
               }

               if (var2 > var47) {
                  var2 = var47;
               }

               var12 = (var12 << 9) - var34 * var6 + var34;
               if (var1 < var2) {
                  var5 = var6 <<= 14;
                  if (var3 < 0) {
                     var5 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var30 * var1;
                     var1 = 0;
                  }

                  var49 = var3 - var48;
                  var37 += var39 * var49;
                  var40 += var42 * var49;
                  var43 += var45 * var49;
                  if (var31 < var32) {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.br(ad, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.br(ad, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.br(ad, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.br(ad, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               } else {
                  var4 = var6 <<= 14;
                  if (var3 < 0) {
                     var4 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var30 * var2;
                     var2 = 0;
                  }

                  var49 = var3 - var48;
                  var37 += var39 * var49;
                  var40 += var42 * var49;
                  var43 += var45 * var49;
                  if (var31 < var32) {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.br(ad, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.br(ad, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.br(ad, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.br(ad, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               }
            }
         }
      }
   }

   ji(jg var1) {
      super(var1);
   }

   final void bu(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.al.af) {
         if (var6 > this.al.ag * 1941613376) {
            var6 = this.al.ag * -1693557958;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var7 += var8 * var5;
         int var9;
         int var10;
         int var11;
         int var12;
         if (this.al.an) {
            var4 = var6 - var5 >> 2;
            var8 <<= 2;
            if (this.al.aw * 161727876 == 0) {
               if (var4 > 0) {
                  do {
                     var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.aq[var9];
                     var7 += var8;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.aq[var9];

                  do {
                     var1[var2++] = var3;
                     --var4;
                  } while(var4 > 0);
               }
            } else {
               var9 = this.al.aw * -1142269168;
               var10 = 2076993673 - this.al.aw * -273754215;
               if (var4 > 0) {
                  do {
                     var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.aq[var11];
                     var7 += var8;
                     var3 = ((var3 & -1629541376) * var10 >> 8 & -1392338518) + ((var3 & '\uff00') * var10 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 794823796) * var9 >> 8 & -1276558571) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 1830954135) + ((var12 & -1707823301) * var9 >> 8 & -1274290481);
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & -138271435) * var9 >> 8 & 16711935) + ((var12 & 45957004) * var9 >> 8 & -1155995790);
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & -750882774) * var9 >> 8 & '\uff00');
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.aq[var11];
                  var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & '\uff00');

                  do {
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 1573069813) * var9 >> 8 & 247860658) + ((var12 & 1442332589) * var9 >> 8 & '\uff00');
                     --var4;
                  } while(var4 > 0);
               }
            }

         } else {
            var4 = var6 - var5;
            if (this.al.aw * -350669271 == 0) {
               do {
                  var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var1[var2++] = this.aq[var9];
                  var7 += var8;
                  --var4;
               } while(var4 > 0);
            } else {
               var9 = this.al.aw * -1697966593;
               var10 = 256 - this.al.aw * 918495667;

               do {
                  var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.aq[var11];
                  var7 += var8;
                  var3 = ((var3 & -1042360376) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & '\uff00');
                  var12 = var1[var2];
                  var1[var2++] = var3 + ((var12 & -1191675631) * var9 >> 8 & -1726023625) + ((var12 & -1737636828) * var9 >> 8 & -2010363836);
                  --var4;
               } while(var4 > 0);
            }

         }
      }
   }

   final void bf(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.al.af) {
         if (var6 > this.al.ag * 571147771) {
            var6 = this.al.ag * 571147771;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var7 += var8 * var5;
         int var9;
         int var10;
         int var11;
         int var12;
         if (this.al.an) {
            var4 = var6 - var5 >> 2;
            var8 <<= 2;
            if (this.al.aw * 918495667 == 0) {
               if (var4 > 0) {
                  do {
                     var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.aq[var9];
                     var7 += var8;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.aq[var9];

                  do {
                     var1[var2++] = var3;
                     --var4;
                  } while(var4 > 0);
               }
            } else {
               var9 = this.al.aw * 918495667;
               var10 = 256 - this.al.aw * 918495667;
               if (var4 > 0) {
                  do {
                     var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.aq[var11];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.aq[var11];
                  var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & '\uff00');

                  do {
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                     --var4;
                  } while(var4 > 0);
               }
            }

         } else {
            var4 = var6 - var5;
            if (this.al.aw * 918495667 == 0) {
               do {
                  var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var1[var2++] = this.aq[var9];
                  var7 += var8;
                  --var4;
               } while(var4 > 0);
            } else {
               var9 = this.al.aw * 918495667;
               var10 = 256 - this.al.aw * 918495667;

               do {
                  var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.aq[var11];
                  var7 += var8;
                  var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & '\uff00');
                  var12 = var1[var2];
                  var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                  --var4;
               } while(var4 > 0);
            }

         }
      }
   }

   final void bq(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.al.af) {
         if (var6 > this.al.ag * 571147771) {
            var6 = this.al.ag * 571147771;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var7 += var8 * var5;
         int var9;
         int var10;
         int var11;
         int var12;
         if (this.al.an) {
            var4 = var6 - var5 >> 2;
            var8 <<= 2;
            if (this.al.aw * 918495667 == 0) {
               if (var4 > 0) {
                  do {
                     var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.aq[var9];
                     var7 += var8;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.aq[var9];

                  do {
                     var1[var2++] = var3;
                     --var4;
                  } while(var4 > 0);
               }
            } else {
               var9 = this.al.aw * 918495667;
               var10 = 256 - this.al.aw * 918495667;
               if (var4 > 0) {
                  do {
                     var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.aq[var11];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.aq[var11];
                  var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & '\uff00');

                  do {
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                     --var4;
                  } while(var4 > 0);
               }
            }

         } else {
            var4 = var6 - var5;
            if (this.al.aw * 918495667 == 0) {
               do {
                  var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var1[var2++] = this.aq[var9];
                  var7 += var8;
                  --var4;
               } while(var4 > 0);
            } else {
               var9 = this.al.aw * 918495667;
               var10 = 256 - this.al.aw * 918495667;

               do {
                  var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.aq[var11];
                  var7 += var8;
                  var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & '\uff00');
                  var12 = var1[var2];
                  var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                  --var4;
               } while(var4 > 0);
            }

         }
      }
   }

   void ba(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.al.af) {
         if (var6 > this.al.ag * 571147771) {
            var6 = this.al.ag * 571147771;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var4 = var6 - var5 >> 2;
         if (this.al.aw * 918495667 != 0) {
            if (this.al.aw * 918495667 == 254) {
               while(true) {
                  --var4;
                  if (var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if (var4 < 0) {
                           return;
                        }

                        var1[var2++] = var1[var2];
                     }
                  }

                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
               }
            } else {
               int var7 = this.al.aw * 918495667;
               int var8 = 256 - this.al.aw * 918495667;
               var3 = ((var3 & 16711935) * var8 >> 8 & 16711935) + ((var3 & '\uff00') * var8 >> 8 & '\uff00');

               while(true) {
                  --var4;
                  int var9;
                  if (var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if (var4 < 0) {
                           return;
                        }

                        var9 = var1[var2];
                        var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & '\uff00') * var7 >> 8 & '\uff00');
                     }
                  }

                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & '\uff00') * var7 >> 8 & '\uff00');
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & '\uff00') * var7 >> 8 & '\uff00');
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & '\uff00') * var7 >> 8 & '\uff00');
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & '\uff00') * var7 >> 8 & '\uff00');
               }
            }
         } else {
            while(true) {
               --var4;
               if (var4 < 0) {
                  var4 = var6 - var5 & 3;

                  while(true) {
                     --var4;
                     if (var4 < 0) {
                        return;
                     }

                     var1[var2++] = var3;
                  }
               }

               var1[var2++] = var3;
               var1[var2++] = var3;
               var1[var2++] = var3;
               var1[var2++] = var3;
            }
         }
      }
   }

   void bv(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.al.af) {
         if (var6 > this.al.ag * 571147771) {
            var6 = this.al.ag * -28488785;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var4 = var6 - var5 >> 2;
         if (this.al.aw * 918495667 != 0) {
            if (this.al.aw * -2146691711 == 254) {
               while(true) {
                  --var4;
                  if (var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if (var4 < 0) {
                           return;
                        }

                        var1[var2++] = var1[var2];
                     }
                  }

                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
               }
            } else {
               int var7 = this.al.aw * 750310053;
               int var8 = 256 - this.al.aw * -447916541;
               var3 = ((var3 & 2111317832) * var8 >> 8 & 429983528) + ((var3 & '\uff00') * var8 >> 8 & '\uff00');

               while(true) {
                  --var4;
                  int var9;
                  if (var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if (var4 < 0) {
                           return;
                        }

                        var9 = var1[var2];
                        var1[var2++] = var3 + ((var9 & 771490252) * var7 >> 8 & 2092713590) + ((var9 & -78803665) * var7 >> 8 & -794904544);
                     }
                  }

                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 1535029436) * var7 >> 8 & 16711935) + ((var9 & '\uff00') * var7 >> 8 & 1716965168);
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & -921567573) + ((var9 & '\uff00') * var7 >> 8 & 1995471120);
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 1440768940) * var7 >> 8 & 16711935) + ((var9 & '\uff00') * var7 >> 8 & '\uff00');
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 1778570851) + ((var9 & '\uff00') * var7 >> 8 & -868932405);
               }
            }
         } else {
            while(true) {
               --var4;
               if (var4 < 0) {
                  var4 = var6 - var5 & 3;

                  while(true) {
                     --var4;
                     if (var4 < 0) {
                        return;
                     }

                     var1[var2++] = var3;
                  }
               }

               var1[var2++] = var3;
               var1[var2++] = var3;
               var1[var2++] = var3;
               var1[var2++] = var3;
            }
         }
      }
   }

   void bz(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.al.aq.aw(var22, -633915150);
      int var24;
      if (var23 == null) {
         var24 = this.al.aq.ac(var22, -1717731009);
         this.ab(var1, var2, var3, var4, var5, var6, var7, var8, var9, ig.aw(var24, var10, 769773533), ig.aw(var24, var11, 769773533), ig.aw(var24, var12, 769773533));
      } else {
         this.an = this.al.aq.ab(var22, -407888071);
         this.af = this.al.aq.au(var22, (byte)-126);
         var24 = var5 - var4;
         int var25 = var2 - var1;
         int var26 = var6 - var4;
         int var27 = var3 - var1;
         int var28 = var11 - var10;
         int var29 = var12 - var10;
         int var30 = 0;
         if (var2 != var1) {
            var30 = (var5 - var4 << 14) / (var2 - var1);
         }

         int var31 = 0;
         if (var3 != var2) {
            var31 = (var6 - var5 << 14) / (var3 - var2);
         }

         int var32 = 0;
         if (var3 != var1) {
            var32 = (var4 - var6 << 14) / (var1 - var3);
         }

         int var33 = var24 * var27 - var26 * var25;
         if (var33 != 0) {
            int var34 = (var28 * var27 - var29 * var25 << 9) / var33;
            int var35 = (var29 * var24 - var28 * var26 << 9) / var33;
            int var36 = this.al.ab * -1734758735;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var37 = var15 * var16 - var18 * var13 << 14;
            int var38 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / (long)var36);
            int var39 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / (long)var36);
            int var40 = var14 * var16 - var17 * var13 << 14;
            int var41 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / (long)var36);
            int var42 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / (long)var36);
            int var43 = var17 * var15 - var14 * var18 << 14;
            int var44 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / (long)var36);
            int var45 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / (long)var36);
            int[] var46 = this.al.aj;
            int var47 = this.al.ah * -84838240;
            int var48;
            if (var1 <= var2 && var1 <= var3) {
               if (var1 < var47) {
                  if (var2 > var47) {
                     var2 = var47;
                  }

                  if (var3 > var47) {
                     var3 = var47;
                  }

                  var10 = (var10 << 9) - var34 * var4 + var34;
                  if (var2 < var3) {
                     var6 = var4 <<= 14;
                     if (var1 < 0) {
                        var6 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var31 * var2;
                        var2 = 0;
                     }

                     var48 = var1 - this.al.ai * 1666539507;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if (var1 != var2 && var32 < var30 || var1 == var2 && var32 > var31) {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var5 = var4 <<= 14;
                     if (var1 < 0) {
                        var5 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var31 * var3;
                        var3 = 0;
                     }

                     var48 = var1 - this.al.ai * 1666539507;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if ((var1 == var3 || var32 >= var30) && (var1 != var3 || var31 <= var30)) {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var2 <= var3) {
               if (var2 < var47) {
                  if (var3 > var47) {
                     var3 = var47;
                  }

                  if (var1 > var47) {
                     var1 = var47;
                  }

                  var11 = (var11 << 9) - var34 * var5 + var34;
                  if (var3 < var1) {
                     var4 = var5 <<= 14;
                     if (var2 < 0) {
                        var4 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var32 * var3;
                        var3 = 0;
                     }

                     var48 = var2 - this.al.ai * 817110518;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if (var2 != var3 && var30 < var31 || var2 == var3 && var30 > var32) {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var6 = var5 <<= 14;
                     if (var2 < 0) {
                        var6 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var4 <<= 14;
                     if (var1 < 0) {
                        var4 -= var32 * var1;
                        var1 = 0;
                     }

                     var48 = var2 - this.al.ai * 1666539507;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if (var30 < var31) {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bs(ad, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += ae;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bs(ad, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += ae;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var3 < var47) {
               if (var1 > var47) {
                  var1 = var47;
               }

               if (var2 > var47) {
                  var2 = var47;
               }

               var12 = (var12 << 9) - var34 * var6 + var34;
               if (var1 < var2) {
                  var5 = var6 <<= 14;
                  if (var3 < 0) {
                     var5 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var30 * var1;
                     var1 = 0;
                  }

                  var48 = var3 - this.al.ai * 1666539507;
                  var37 += var39 * var48;
                  var40 += var42 * var48;
                  var43 += var45 * var48;
                  if (var31 < var32) {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bs(ad, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bs(ad, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bs(ad, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bs(ad, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               } else {
                  var4 = var6 <<= 14;
                  if (var3 < 0) {
                     var4 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var30 * var2;
                     var2 = 0;
                  }

                  var48 = var3 - this.al.ai * 1666539507;
                  var37 += var39 * var48;
                  var40 += var42 * var48;
                  var43 += var45 * var48;
                  if (var31 < var32) {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bs(ad, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bs(ad, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bs(ad, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += ae;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bs(ad, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += ae;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               }
            }
         }
      }
   }

   final void bg(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.al.af) {
         if (var6 > this.al.ag * 86205242) {
            var6 = this.al.ag * -688124233;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var7 += var8 * var5;
         int var9;
         int var10;
         int var11;
         int var12;
         if (this.al.an) {
            var4 = var6 - var5 >> 2;
            var8 <<= 2;
            if (this.al.aw * -1572850985 == 0) {
               if (var4 > 0) {
                  do {
                     var9 = (var7 & (var7 >> -342136592 & 1) - 1) >> 8;
                     var3 = this.aq[var9];
                     var7 += var8;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  var9 = (var7 & (var7 >> -2102478851 & 1) - 1) >> 8;
                  var3 = this.aq[var9];

                  do {
                     var1[var2++] = var3;
                     --var4;
                  } while(var4 > 0);
               }
            } else {
               var9 = this.al.aw * 918495667;
               var10 = 256 - this.al.aw * 918495667;
               if (var4 > 0) {
                  do {
                     var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.aq[var11];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var10 >> 8 & 651027085) + ((var3 & 1394250772) * var10 >> 8 & -1330323498);
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 400693167) * var9 >> 8 & -2083695974);
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & -2027371333) * var9 >> 8 & -524797492);
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & -1851170754) + ((var12 & '\uff00') * var9 >> 8 & -776341009);
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & -2078785744);
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  var11 = (var7 & (var7 >> 540786338 & 1) - 1) >> 8;
                  var3 = this.aq[var11];
                  var3 = ((var3 & 16711935) * var10 >> 8 & 1801273049) + ((var3 & 1703412954) * var10 >> 8 & '\uff00');

                  do {
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 1838893858) + ((var12 & 1744593307) * var9 >> 8 & -799891712);
                     --var4;
                  } while(var4 > 0);
               }
            }

         } else {
            var4 = var6 - var5;
            if (this.al.aw * 1185830490 == 0) {
               do {
                  var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var1[var2++] = this.aq[var9];
                  var7 += var8;
                  --var4;
               } while(var4 > 0);
            } else {
               var9 = this.al.aw * -39546851;
               var10 = 256 - this.al.aw * 918495667;

               do {
                  var11 = (var7 & (var7 >> -38613872 & 1) - 1) >> 8;
                  var3 = this.aq[var11];
                  var7 += var8;
                  var3 = ((var3 & 16711935) * var10 >> 8 & -726469612) + ((var3 & 608688940) * var10 >> 8 & 1563509402);
                  var12 = var1[var2];
                  var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 1647363408) * var9 >> 8 & '\uff00');
                  --var4;
               } while(var4 > 0);
            }

         }
      }
   }

   void bc(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      if (this.al.af) {
         if (var7 > this.al.ag * 192653861) {
            var7 = this.al.ag * -1525644360;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         int var18 = var7 - var6;
         int var16;
         int var17;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         int var24;
         if (this.an) {
            var24 = var6 - this.al.ax * 93675259;
            var10 += var13 * var24;
            var11 += var14 * var24;
            var12 += var15 * var24;
            var23 = var12 >> 12;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
            } else {
               var19 = 0;
               var20 = 0;
            }

            var10 += var13 * var18;
            var11 += var14 * var18;
            var12 += var15 * var18;
            var23 = var12 >> 12;
            if (var23 != 0) {
               var21 = var10 / var23;
               var22 = var11 / var23;
            } else {
               var21 = 0;
               var22 = 0;
            }

            var3 = (var19 << 20) + var20;
            var17 = ((var21 - var19) / var18 << 20) + (var22 - var20) / var18;
            var18 >>= 3;
            var9 <<= 3;
            var16 = var8 >> 8;
            if (this.af) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & -1424664364) * var16 & -283193175) + ((var4 & 1899025523) * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -1898831026) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & -876568872) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 1031177394) * var16 & -1412295906) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -1157295734) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -1321449783) + ((var4 & 1273865420) * var16 & -1475154996) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & 778309720) + ((var4 & -1198339387) * var16 & 2061682482) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -870928321) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -928826366) + ((var4 & 691575483) * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 1051947500) * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 1170489485) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & 967782174) + ((var4 & -1257492837) * var16 & 16711680) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 1561997420) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & 402239066) + ((var4 & '\uff00') * var16 & 193635771) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 1191636347) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & -1597979856) * var16 & -16711936) + ((var4 & 433728462) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & -28331746) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 1482467889) * var16 & -152964617) + ((var4 & -1510799027) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & 31554191) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & -1785967639) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -413942994) + ((var4 & -1013408959) * var16 & 1130066535) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & -2088791286) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & -87019402) * var16 & 337055433) + ((var4 & 201136676) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & 1180182937) + ((var4 & -1419641241) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & -1818374387) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 597164369) * var16 & 1865933730) + ((var4 & -1252874360) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 683308304) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & 1145297386) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            }
         } else {
            var24 = var6 - this.al.ax * 93675259;
            var10 += var13 * var24;
            var11 += var14 * var24;
            var12 += var15 * var24;
            var23 = var12 >> 14;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
            } else {
               var19 = 0;
               var20 = 0;
            }

            var10 += var13 * var18;
            var11 += var14 * var18;
            var12 += var15 * var18;
            var23 = var12 >> 14;
            if (var23 != 0) {
               var21 = var10 / var23;
               var22 = var11 / var23;
            } else {
               var21 = 0;
               var22 = 0;
            }

            var3 = (var19 << 18) + var20;
            var17 = ((var21 - var19) / var18 << 18) + (var22 - var20) / var18;
            var18 >>= 3;
            var9 <<= 3;
            var16 = var8 >> 8;
            if (this.af) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & 1141928469) + ((var4 & 1512865804) * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 1996813064) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 1655854692) * var16 & 1803363807) + ((var4 & 1564193329) * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -43143595) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -2118030091) + ((var4 & -1979737184) * var16 & 164111439) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -1930898291) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & -1490853352) * var16 & -465247490) + ((var4 & '\uff00') * var16 & -195669313) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -1775946143) + ((var4 & '\uff00') * var16 & -47308136) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -1408248997) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 1163277479) * var16 & -1087965014) + ((var4 & -364434590) * var16 & 1754642712) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -1977726987) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & -177613452) * var16 & 1035426306) + ((var4 & 1673487816) * var16 & 16711680) >> 8;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 226502569) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & 1381662868) + ((var4 & 189799262) * var16 & 1480587855) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & 1562665537) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 324360643) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 1277429837) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & 158181590) + ((var4 & '\uff00') * var16 & 723655337) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 1632723005) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & -1295485632) * var16 & -869870225) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 387648514) * var16 & -1451758313) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & -1260278243) * var16 & 1765533056) + ((var4 & '\uff00') * var16 & -1614016259) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 1595885891) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & -159290930) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & 1440714611) + ((var4 & -213413985) * var16 & 1538890322) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & -1123597808) * var16 & -16711936) + ((var4 & 457380805) * var16 & 1713714478) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            }
         }

      }
   }
}
