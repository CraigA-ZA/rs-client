public class ji extends ii {
   ji(jg var1) {
      super(var1);
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

               if (var2 != var3 && var11 < var12 || var2 == var3 && var11 > var13) {
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

   void al(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.al.aq.load(var22);
      int var24;
      if (var23 == null) {
         var24 = this.al.aq.ac(var22);
         this.ab(var1, var2, var3, var4, var5, var6, var7, var8, var9, FloorDecoration.aw_renamed(var24, var10), FloorDecoration.aw_renamed(var24, var11), FloorDecoration.aw_renamed(var24, var12));
      } else {
         this.an = this.al.aq.isLowDetail(var22);
         this.af = this.al.aq.au(var22);
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

   void at(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.al.aq.load(var22);
      int var24;
      if (var23 == null) {
         var24 = this.al.aq.ac(var22);
         this.ab(var1, var2, var3, var4, var5, var6, var7, var8, var9, FloorDecoration.aw_renamed(var24, var10), FloorDecoration.aw_renamed(var24, var11), FloorDecoration.aw_renamed(var24, var12));
      } else {
         this.an = this.al.aq.isLowDetail(var22);
         this.af = this.al.aq.au(var22);
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
}
