import accessors.RSVorbisResidue;

public class bv implements RSVorbisResidue {
   int au = ce.ac(6) + 1;
   int af = ce.ac(16);
   int aw = ce.ac(24);
   int ac = ce.ac(24) + 1;
   int an = ce.ac(24);
   int ab = ce.ac(8);
   int[] aq;

   void au(float[] var1, int var2, boolean var3) {
      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var1[var4] = 0.0F;
      }

      if (!var3) {
         var4 = ce.ao[this.ab].af;
         int var5 = this.aw - this.an;
         int var6 = var5 / this.ac;
         int[] var7 = new int[var6];

         for(int var8 = 0; var8 < 8; ++var8) {
            int var9 = 0;

            while(var9 < var6) {
               int var10;
               int var11;
               if (var8 == 0) {
                  var10 = ce.ao[this.ab].aw();

                  for(var11 = var4 - 1; var11 >= 0; --var11) {
                     if (var9 + var11 < var6) {
                        var7[var9 + var11] = var10 % this.au;
                     }

                     var10 /= this.au;
                  }
               }

               for(var10 = 0; var10 < var4; ++var10) {
                  var11 = var7[var9];
                  int var12 = this.aq[var11 * 8 + var8];
                  if (var12 >= 0) {
                     int var13 = this.an + var9 * this.ac;
                     bw var14 = ce.ao[var12];
                     int var15;
                     if (this.af == 0) {
                        var15 = this.ac / var14.af;

                        for(int var19 = 0; var19 < var15; ++var19) {
                           float[] var20 = var14.ac();

                           for(int var18 = 0; var18 < var14.af; ++var18) {
                              var1[var13 + var19 + var18 * var15] += var20[var18];
                           }
                        }
                     } else {
                        var15 = 0;

                        while(var15 < this.ac) {
                           float[] var16 = var14.ac();

                           for(int var17 = 0; var17 < var14.af; ++var17) {
                              var1[var13 + var15] += var16[var17];
                              ++var15;
                           }
                        }
                     }
                  }

                  ++var9;
                  if (var9 >= var6) {
                     break;
                  }
               }
            }
         }

      }
   }

   void af(float[] var1, int var2, boolean var3) {
      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var1[var4] = 0.0F;
      }

      if (!var3) {
         var4 = ce.ao[this.ab].af;
         int var5 = this.aw - this.an;
         int var6 = var5 / this.ac;
         int[] var7 = new int[var6];

         for(int var8 = 0; var8 < 8; ++var8) {
            int var9 = 0;

            while(var9 < var6) {
               int var10;
               int var11;
               if (var8 == 0) {
                  var10 = ce.ao[this.ab].aw();

                  for(var11 = var4 - 1; var11 >= 0; --var11) {
                     if (var9 + var11 < var6) {
                        var7[var9 + var11] = var10 % this.au;
                     }

                     var10 /= this.au;
                  }
               }

               for(var10 = 0; var10 < var4; ++var10) {
                  var11 = var7[var9];
                  int var12 = this.aq[var11 * 8 + var8];
                  if (var12 >= 0) {
                     int var13 = this.an + var9 * this.ac;
                     bw var14 = ce.ao[var12];
                     int var15;
                     if (this.af == 0) {
                        var15 = this.ac / var14.af;

                        for(int var19 = 0; var19 < var15; ++var19) {
                           float[] var20 = var14.ac();

                           for(int var18 = 0; var18 < var14.af; ++var18) {
                              var1[var13 + var19 + var18 * var15] += var20[var18];
                           }
                        }
                     } else {
                        var15 = 0;

                        while(var15 < this.ac) {
                           float[] var16 = var14.ac();

                           for(int var17 = 0; var17 < var14.af; ++var17) {
                              var1[var13 + var15] += var16[var17];
                              ++var15;
                           }
                        }
                     }
                  }

                  ++var9;
                  if (var9 >= var6) {
                     break;
                  }
               }
            }
         }

      }
   }

   void an(float[] var1, int var2, boolean var3) {
      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var1[var4] = 0.0F;
      }

      if (!var3) {
         var4 = ce.ao[this.ab].af;
         int var5 = this.aw - this.an;
         int var6 = var5 / this.ac;
         int[] var7 = new int[var6];

         for(int var8 = 0; var8 < 8; ++var8) {
            int var9 = 0;

            while(var9 < var6) {
               int var10;
               int var11;
               if (var8 == 0) {
                  var10 = ce.ao[this.ab].aw();

                  for(var11 = var4 - 1; var11 >= 0; --var11) {
                     if (var9 + var11 < var6) {
                        var7[var9 + var11] = var10 % this.au;
                     }

                     var10 /= this.au;
                  }
               }

               for(var10 = 0; var10 < var4; ++var10) {
                  var11 = var7[var9];
                  int var12 = this.aq[var11 * 8 + var8];
                  if (var12 >= 0) {
                     int var13 = this.an + var9 * this.ac;
                     bw var14 = ce.ao[var12];
                     int var15;
                     if (this.af == 0) {
                        var15 = this.ac / var14.af;

                        for(int var19 = 0; var19 < var15; ++var19) {
                           float[] var20 = var14.ac();

                           for(int var18 = 0; var18 < var14.af; ++var18) {
                              var1[var13 + var19 + var18 * var15] += var20[var18];
                           }
                        }
                     } else {
                        var15 = 0;

                        while(var15 < this.ac) {
                           float[] var16 = var14.ac();

                           for(int var17 = 0; var17 < var14.af; ++var17) {
                              var1[var13 + var15] += var16[var17];
                              ++var15;
                           }
                        }
                     }
                  }

                  ++var9;
                  if (var9 >= var6) {
                     break;
                  }
               }
            }
         }

      }
   }

   bv() {
      int[] var1 = new int[this.au];

      int var2;
      for(var2 = 0; var2 < this.au; ++var2) {
         int var3 = 0;
         int var4 = ce.ac(3);
         boolean var5 = ce.aw() != 0;
         if (var5) {
            var3 = ce.ac(5);
         }

         var1[var2] = var3 << 3 | var4;
      }

      this.aq = new int[this.au * 8];

      for(var2 = 0; var2 < this.au * 8; ++var2) {
         this.aq[var2] = (var1[var2 >> 3] & 1 << (var2 & 7)) != 0 ? ce.ac(8) : -1;
      }

   }

   void ac(float[] var1, int var2, boolean var3) {
      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var1[var4] = 0.0F;
      }

      if (!var3) {
         var4 = ce.ao[this.ab].af;
         int var5 = this.aw - this.an;
         int var6 = var5 / this.ac;
         int[] var7 = new int[var6];

         for(int var8 = 0; var8 < 8; ++var8) {
            int var9 = 0;

            while(var9 < var6) {
               int var10;
               int var11;
               if (var8 == 0) {
                  var10 = ce.ao[this.ab].aw();

                  for(var11 = var4 - 1; var11 >= 0; --var11) {
                     if (var9 + var11 < var6) {
                        var7[var9 + var11] = var10 % this.au;
                     }

                     var10 /= this.au;
                  }
               }

               for(var10 = 0; var10 < var4; ++var10) {
                  var11 = var7[var9];
                  int var12 = this.aq[var11 * 8 + var8];
                  if (var12 >= 0) {
                     int var13 = this.an + var9 * this.ac;
                     bw var14 = ce.ao[var12];
                     int var15;
                     if (this.af == 0) {
                        var15 = this.ac / var14.af;

                        for(int var19 = 0; var19 < var15; ++var19) {
                           float[] var20 = var14.ac();

                           for(int var18 = 0; var18 < var14.af; ++var18) {
                              var1[var13 + var19 + var18 * var15] += var20[var18];
                           }
                        }
                     } else {
                        var15 = 0;

                        while(var15 < this.ac) {
                           float[] var16 = var14.ac();

                           for(int var17 = 0; var17 < var14.af; ++var17) {
                              var1[var13 + var15] += var16[var17];
                              ++var15;
                           }
                        }
                     }
                  }

                  ++var9;
                  if (var9 >= var6) {
                     break;
                  }
               }
            }
         }

      }
   }

   void aw(float[] var1, int var2, boolean var3) {
      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var1[var4] = 0.0F;
      }

      if (!var3) {
         var4 = ce.ao[this.ab].af;
         int var5 = this.aw - this.an;
         int var6 = var5 / this.ac;
         int[] var7 = new int[var6];

         for(int var8 = 0; var8 < 8; ++var8) {
            int var9 = 0;

            while(var9 < var6) {
               int var10;
               int var11;
               if (var8 == 0) {
                  var10 = ce.ao[this.ab].aw();

                  for(var11 = var4 - 1; var11 >= 0; --var11) {
                     if (var9 + var11 < var6) {
                        var7[var9 + var11] = var10 % this.au;
                     }

                     var10 /= this.au;
                  }
               }

               for(var10 = 0; var10 < var4; ++var10) {
                  var11 = var7[var9];
                  int var12 = this.aq[var11 * 8 + var8];
                  if (var12 >= 0) {
                     int var13 = this.an + var9 * this.ac;
                     bw var14 = ce.ao[var12];
                     int var15;
                     if (this.af == 0) {
                        var15 = this.ac / var14.af;

                        for(int var19 = 0; var19 < var15; ++var19) {
                           float[] var20 = var14.ac();

                           for(int var18 = 0; var18 < var14.af; ++var18) {
                              var1[var13 + var19 + var18 * var15] += var20[var18];
                           }
                        }
                     } else {
                        var15 = 0;

                        while(var15 < this.ac) {
                           float[] var16 = var14.ac();

                           for(int var17 = 0; var17 < var14.af; ++var17) {
                              var1[var13 + var15] += var16[var17];
                              ++var15;
                           }
                        }
                     }
                  }

                  ++var9;
                  if (var9 >= var6) {
                     break;
                  }
               }
            }
         }

      }
   }
}
