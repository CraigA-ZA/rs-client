import accessors.RSSprite;

public final class tq extends th implements RSSprite {
   public int aq;
   public int an;
   public int[] af;
   public int ac;
   int au;
   public int ab;
   public int aw;
   static final int al = 4;
   static final int at = 15;
   static final int aa = 8;
   static final int ay = 12;
   static final int ao = 4095;

   public void ep(int var1, int var2, int var3, int var4) {
      this.bo(this.ab << 3, this.aq << 3, var1 << 4, var2 << 4, var3, var4);
   }

   public void al() {
      int[] var1 = new int[this.an * this.aw];
      int var2 = 0;

      for(int var3 = this.aw - 1; var3 >= 0; --var3) {
         for(int var4 = 0; var4 < this.an; ++var4) {
            var1[var2++] = this.af[var4 + var3 * this.an];
         }
      }

      this.af = var1;
      this.au = this.aq - this.aw - this.au;
   }

   public void be(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
      try {
         int var11 = -var3 / 2;
         int var12 = -var4 / 2;
         int var13 = (int)(Math.sin((double)var7 / 326.11) * 65536.0);
         int var14 = (int)(Math.cos((double)var7 / 326.11) * 65536.0);
         var13 = var13 * var8 >> 8;
         var14 = var14 * var8 >> 8;
         int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
         int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
         int var17 = var1 + var2 * ae;

         for(var2 = 0; var2 < var4; ++var2) {
            int var18 = var9[var2];
            int var19 = var17 + var18;
            int var20 = var15 + var14 * var18;
            int var21 = var16 - var13 * var18;

            for(var1 = -var10[var2]; var1 < 0; ++var1) {
               ad[var19++] = this.af[(var20 >> 16) + (var21 >> 16) * this.an];
               var20 += var14;
               var21 -= var13;
            }

            var15 += var13;
            var16 += var14;
            var17 += ae;
         }
      } catch (Exception var22) {
      }

   }

   public tq af() {
      tq var1 = new tq(this.an, this.aw);
      var1.ab = this.ab;
      var1.aq = this.aq;
      var1.ac = this.ab - this.an - this.ac;
      var1.au = this.au;

      for(int var2 = 0; var2 < this.aw; ++var2) {
         for(int var3 = 0; var3 < this.an; ++var3) {
            var1.af[var2 * this.an + var3] = this.af[var2 * this.an + this.an - 1 - var3];
         }
      }

      return var1;
   }

   public tq an() {
      tq var1 = new tq(this.an, this.aw);
      var1.ab = this.ab;
      var1.aq = this.aq;
      var1.ac = this.ac;
      var1.au = this.au;
      int var2 = this.af.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.af[var3] = this.af[var3];
      }

      return var1;
   }

   public tq aw() {
      tq var1 = new tq(this.ab, this.aq);

      for(int var2 = 0; var2 < this.aw; ++var2) {
         for(int var3 = 0; var3 < this.an; ++var3) {
            var1.af[(var2 + this.au) * this.ab + var3 + this.ac] = this.af[var2 * this.an + var3];
         }
      }

      return var1;
   }

   public void ac() {
      ea(this.af, this.an, this.aw, (float[])null);
   }

   public void au() {
      if (this.an != this.ab || this.aw != this.aq) {
         int[] var1 = new int[this.ab * this.aq];

         for(int var2 = 0; var2 < this.aw; ++var2) {
            for(int var3 = 0; var3 < this.an; ++var3) {
               var1[(var2 + this.au) * this.ab + var3 + this.ac] = this.af[var2 * this.an + var3];
            }
         }

         this.af = var1;
         this.an = this.ab;
         this.aw = this.aq;
         this.ac = 0;
         this.au = 0;
      }
   }

   public void ab(int var1) {
      if (this.an != this.ab || this.aw != this.aq) {
         int var2 = var1;
         if (var1 > this.ac) {
            var2 = this.ac;
         }

         int var3 = var1;
         if (var1 + this.ac + this.an > this.ab) {
            var3 = this.ab - this.ac - this.an;
         }

         int var4 = var1;
         if (var1 > this.au) {
            var4 = this.au;
         }

         int var5 = var1;
         if (var1 + this.au + this.aw > this.aq) {
            var5 = this.aq - this.au - this.aw;
         }

         int var6 = this.an + var2 + var3;
         int var7 = this.aw + var4 + var5;
         int[] var8 = new int[var6 * var7];

         for(int var9 = 0; var9 < this.aw; ++var9) {
            for(int var10 = 0; var10 < this.an; ++var10) {
               var8[(var9 + var4) * var6 + var10 + var2] = this.af[var9 * this.an + var10];
            }
         }

         this.af = var8;
         this.an = var6;
         this.aw = var7;
         this.ac -= var2;
         this.au -= var4;
      }
   }

   public void ap(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.an;
         int var7 = this.aw;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.ab;
         int var11 = this.aq;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if (this.ac > 0) {
            var14 = ((this.ac << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.ac << 16);
         }

         if (this.au > 0) {
            var14 = ((this.au << 16) + var13 - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.au << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         var14 = var1 + var2 * ae;
         int var15 = ae - var3;
         if (var2 + var4 > be) {
            var4 -= var2 + var4 - be;
         }

         int var16;
         if (var2 < bi) {
            var16 = bi - var2;
            var4 -= var16;
            var14 += var16 * ae;
            var9 += var13 * var16;
         }

         if (var1 + var3 > bx) {
            var16 = var1 + var3 - bx;
            var3 -= var16;
            var15 += var16;
         }

         if (var1 < bk) {
            var16 = bk - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         if (var5 == 256) {
            by(0, 0, 0, var8, this.af, ad, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6);
         } else {
            bb(0, 0, 0, var8, this.af, ad, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6, var5);
         }

      }
   }

   public void df(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
      try {
         int var11 = -var3 / 2;
         int var12 = -var4 / 2;
         int var13 = (int)(Math.sin((double)var7 / 326.11) * 65536.0);
         int var14 = (int)(Math.cos((double)var7 / 326.11) * 65536.0);
         var13 = var13 * var8 >> 8;
         var14 = var14 * var8 >> 8;
         int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
         int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
         int var17 = var1 + var2 * ae;

         for(var2 = 0; var2 < var4; ++var2) {
            int var18 = var9[var2];
            int var19 = var17 + var18;
            int var20 = var15 + var14 * var18;
            int var21 = var16 - var13 * var18;

            for(var1 = -var10[var2]; var1 < 0; ++var1) {
               ad[var19++] = this.af[(var20 >> 16) + (var21 >> 16) * this.an];
               var20 += var14;
               var21 -= var13;
            }

            var15 += var13;
            var16 += var14;
            var17 += ae;
         }
      } catch (Exception var22) {
      }

   }

   public void at(int var1) {
      int[] var2 = new int[this.an * this.aw];
      int var3 = 0;

      for(int var4 = 0; var4 < this.aw; ++var4) {
         for(int var5 = 0; var5 < this.an; ++var5) {
            int var6 = this.af[var3];
            if (var6 == 0) {
               if (var5 > 0 && this.af[var3 - 1] != 0) {
                  var6 = var1;
               } else if (var4 > 0 && this.af[var3 - this.an] != 0) {
                  var6 = var1;
               } else if (var5 < this.an - 1 && this.af[var3 + 1] != 0) {
                  var6 = var1;
               } else if (var4 < this.aw - 1 && this.af[var3 + this.an] != 0) {
                  var6 = var1;
               }
            }

            var2[var3++] = var6;
         }
      }

      this.af = var2;
   }

   public void bi(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      int var9 = var2 < 0 ? -var2 : 0;
      int var10 = var2 + this.aw <= var6 ? this.aw : var6 - var2;
      int var11 = var1 < 0 ? -var1 : 0;
      int var10000;
      if (var1 + this.an <= var5) {
         var10000 = this.an;
      } else {
         var10000 = var5 - var1;
      }

      int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * ae;
      int var14 = var2 + var9;

      for(int var15 = var9; var15 < var10; ++var15) {
         int var16 = var7[var14];
         int var17 = var8[var14++];
         int var18 = var13;
         int var19;
         if (var1 < var16) {
            var19 = var16 - var1;
            var18 = var13 + (var19 - var11);
         } else {
            var19 = var11;
         }

         int var12;
         if (var1 + this.an <= var16 + var17) {
            var12 = this.an;
         } else {
            var12 = var16 + var17 - var1;
         }

         for(int var20 = var19; var20 < var12; ++var20) {
            int var21 = this.af[var20 + var15 * this.an];
            if (var21 != 0) {
               ad[var18++] = var21;
            } else {
               ++var18;
            }
         }

         var13 += ae;
      }

   }

   public void ay(int var1, int var2) {
      var1 += this.ac;
      var2 += this.au;
      int var3 = var1 + var2 * ae;
      int var4 = 0;
      int var5 = this.aw;
      int var6 = this.an;
      int var7 = ae - var6;
      int var8 = 0;
      int var9;
      if (var2 < bi) {
         var9 = bi - var2;
         var5 -= var9;
         var2 = bi;
         var4 += var9 * var6;
         var3 += var9 * ae;
      }

      if (var2 + var5 > be) {
         var5 -= var2 + var5 - be;
      }

      if (var1 < bk) {
         var9 = bk - var1;
         var6 -= var9;
         var1 = bk;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var1 + var6 > bx) {
         var9 = var1 + var6 - bx;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         ao(ad, this.af, var4, var3, var6, var5, var7, var8);
      }
   }

   public void ez(int var1, int var2, int var3, int var4) {
      if (var3 <= this.ab && var4 <= this.aq) {
         int var5 = var1 + this.ac * var3 / this.ab;
         int var6 = var1 + ((this.ac + this.an) * var3 + this.ab - 1) / this.ab;
         int var7 = var2 + this.au * var4 / this.aq;
         int var8 = var2 + ((this.au + this.aw) * var4 + this.aq - 1) / this.aq;
         if (var5 < bk) {
            var5 = bk;
         }

         if (var6 > bx) {
            var6 = bx;
         }

         if (var7 < bi) {
            var7 = bi;
         }

         if (var8 > be) {
            var8 = be;
         }

         if (var5 < var6 && var7 < var8) {
            int var9 = var7 * ae + var5;
            int var10 = ae - (var6 - var5);
            if (var9 < ad.length) {
               for(int var11 = var7; var11 < var8; ++var11) {
                  for(int var12 = var5; var12 < var6; ++var12) {
                     int var13 = var12 - var1 << 4;
                     int var14 = var11 - var2 << 4;
                     int var15 = var13 * this.ab / var3 - (this.ac << 4);
                     int var16 = (var13 + 16) * this.ab / var3 - (this.ac << 4);
                     int var17 = var14 * this.aq / var4 - (this.au << 4);
                     int var18 = (var14 + 16) * this.aq / var4 - (this.au << 4);
                     int var19 = (var16 - var15) * (var18 - var17) >> 1;
                     if (var19 != 0) {
                        if (var15 < 0) {
                           var15 = 0;
                        }

                        if (var16 >= this.an << 4) {
                           var16 = this.an << 4;
                        }

                        if (var17 < 0) {
                           var17 = 0;
                        }

                        if (var18 >= this.aw << 4) {
                           var18 = this.aw << 4;
                        }

                        --var16;
                        --var18;
                        int var20 = 16 - (var15 & 15);
                        int var21 = (var16 & 15) + 1;
                        int var22 = 16 - (var17 & 15);
                        int var23 = (var18 & 15) + 1;
                        var15 >>= 4;
                        var16 >>= 4;
                        var17 >>= 4;
                        var18 >>= 4;
                        int var24 = 0;
                        int var25 = 0;
                        int var26 = 0;
                        int var27 = 0;

                        int var28;
                        for(var28 = var17; var28 <= var18; ++var28) {
                           int var29 = 16;
                           if (var28 == var17) {
                              var29 = var22;
                           }

                           if (var28 == var18) {
                              var29 = var23;
                           }

                           for(int var30 = var15; var30 <= var16; ++var30) {
                              int var31 = this.af[var28 * this.an + var30];
                              if (var31 != 0) {
                                 int var32;
                                 if (var30 == var15) {
                                    var32 = var29 * var20;
                                 } else if (var30 == var16) {
                                    var32 = var29 * var21;
                                 } else {
                                    var32 = var29 << 4;
                                 }

                                 var27 += var32;
                                 var24 += (var31 >> 16 & 255) * var32;
                                 var25 += (var31 >> 8 & 255) * var32;
                                 var26 += (var31 & 255) * var32;
                              }
                           }
                        }

                        if (var27 >= var19) {
                           var28 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
                           if (var28 == 0) {
                              var28 = 1;
                           }

                           ad[var9] = var28;
                        }

                        ++var9;
                     }
                  }

                  var9 += var10;
               }

            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void ax(int var1, int var2) {
      var1 += this.ac;
      var2 += this.au;
      int var3 = var1 + var2 * ae;
      int var4 = 0;
      int var5 = this.aw;
      int var6 = this.an;
      int var7 = ae - var6;
      int var8 = 0;
      int var9;
      if (var2 < bi) {
         var9 = bi - var2;
         var5 -= var9;
         var2 = bi;
         var4 += var9 * var6;
         var3 += var9 * ae;
      }

      if (var2 + var5 > be) {
         var5 -= var2 + var5 - be;
      }

      if (var1 < bk) {
         var9 = bk - var1;
         var6 -= var9;
         var1 = bk;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var1 + var6 > bx) {
         var9 = var1 + var6 - bx;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         ai(ad, this.af, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   static void ai(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   public void ag(int var1, int var2, int var3, int var4) {
      if (var3 > 0 && var4 > 0) {
         int var5 = this.an;
         int var6 = this.aw;
         int var7 = 0;
         int var8 = 0;
         int var9 = this.ab;
         int var10 = this.aq;
         int var11 = (var9 << 16) / var3;
         int var12 = (var10 << 16) / var4;
         int var13;
         if (this.ac > 0) {
            var13 = ((this.ac << 16) + var11 - 1) / var11;
            var1 += var13;
            var7 += var13 * var11 - (this.ac << 16);
         }

         if (this.au > 0) {
            var13 = ((this.au << 16) + var12 - 1) / var12;
            var2 += var13;
            var8 += var13 * var12 - (this.au << 16);
         }

         if (var5 < var9) {
            var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
         }

         if (var6 < var10) {
            var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         var13 = var1 + var2 * ae;
         int var14 = ae - var3;
         if (var2 + var4 > be) {
            var4 -= var2 + var4 - be;
         }

         int var15;
         if (var2 < bi) {
            var15 = bi - var2;
            var4 -= var15;
            var13 += var15 * ae;
            var8 += var12 * var15;
         }

         if (var1 + var3 > bx) {
            var15 = var1 + var3 - bx;
            var3 -= var15;
            var14 += var15;
         }

         if (var1 < bk) {
            var15 = bk - var1;
            var3 -= var15;
            var13 += var15;
            var7 += var11 * var15;
            var14 += var15;
         }

         ah(ad, this.af, 0, var7, var8, var13, var14, var3, var4, var11, var12, var5);
      }
   }

   static void ah(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = (var4 >> 16) * var11;

         for(int var15 = -var7; var15 < 0; ++var15) {
            var2 = var1[(var3 >> 16) + var14];
            if (var2 != 0) {
               var0[var5++] = var2;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var12;
         var5 += var6;
      }

   }

   public void cn(int var1) {
      for(int var2 = this.aw - 1; var2 > 0; --var2) {
         int var3 = var2 * this.an;

         for(int var4 = this.an - 1; var4 > 0; --var4) {
            if (this.af[var4 + var3] == 0 && this.af[var4 + var3 - 1 - this.an] != 0) {
               this.af[var4 + var3] = var1;
            }
         }
      }

   }

   static void ar(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      int var11 = 256 - var9;
      int var12 = (var10 & 16711935) * var11 & -16711936;
      int var13 = (var10 & '\uff00') * var11 & 16711680;
      var10 = (var12 | var13) >>> 8;

      for(int var14 = -var6; var14 < 0; ++var14) {
         for(int var15 = -var5; var15 < 0; ++var15) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var12 = (var2 & 16711935) * var9 & -16711936;
               var13 = (var2 & '\uff00') * var9 & 16711680;
               var0[var4++] = ((var12 | var13) >>> 8) + var10;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   public void am(int var1, int var2, int var3) {
      var1 += this.ac;
      var2 += this.au;
      int var4 = var1 + var2 * ae;
      int var5 = 0;
      int var6 = this.aw;
      int var7 = this.an;
      int var8 = ae - var7;
      int var9 = 0;
      int var10;
      if (var2 < bi) {
         var10 = bi - var2;
         var6 -= var10;
         var2 = bi;
         var5 += var10 * var7;
         var4 += var10 * ae;
      }

      if (var2 + var6 > be) {
         var6 -= var2 + var6 - be;
      }

      if (var1 < bk) {
         var10 = bk - var1;
         var7 -= var10;
         var1 = bk;
         var5 += var10;
         var4 += var10;
         var9 += var10;
         var8 += var10;
      }

      if (var1 + var7 > bx) {
         var10 = var1 + var7 - bx;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if (var7 > 0 && var6 > 0) {
         as(ad, this.af, 0, var5, var4, var7, var6, var8, var9, var3);
      }
   }

   static void by(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      for(int var16 = var3; var8 < 0; ++var8) {
         var7 = (var9 >> 16) * var15;

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if (var0 != 0) {
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var16;
         var10 += var11;
      }

   }

   public tq(int[] var1, int var2, int var3) {
      this.af = var1;
      this.an = this.ab = var2;
      this.aw = this.aq = var3;
      this.au = 0;
      this.ac = 0;
   }

   static void cw(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 256 - var9;

      for(int var11 = -var6; var11 < 0; ++var11) {
         for(int var12 = -var5; var12 < 0; ++var12) {
            var2 = var1[var3++];
            if (var2 != 0) {
               int var13 = var0[var4];
               var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936) + ((var2 & '\uff00') * var9 + (var13 & '\uff00') * var10 & 16711680) >> 8;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   public tq br() {
      tq var1 = new tq(this.an, this.aw);
      var1.ab = this.ab;
      var1.aq = this.aq;
      var1.ac = this.ac;
      var1.au = this.au;
      int var2 = this.af.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.af[var3] = this.af[var3];
      }

      return var1;
   }

   static void ad(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      for(var8 = -var10; var8 < 0; ++var8) {
         for(var6 = -var9; var6 < 0; ++var6) {
            var0 = var4[var5++];
            if (var0 != 0) {
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var7;
            }
         }

         var7 += var11;
         var5 += var12;
      }

   }

   static void ae(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
      for(var8 = -var10; var8 < 0; ++var8) {
         for(var6 = -var9; var6 < 0; ++var6) {
            var0 = var4[var5++];
            if (var0 != 0) {
               var1 = (var0 & 16711935) * var13;
               var0 = (var1 & -16711936) + (var0 * var13 - var1 & 16711680) >>> 8;
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var7;
            }
         }

         var7 += var11;
         var5 += var12;
      }

   }

   public tq(int var1, int var2) {
      this(new int[var1 * var2], var1, var2);
   }

   static void dg(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      for(int var16 = var3; var8 < 0; ++var8) {
         var7 = (var9 >> 16) * var15;

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if (var0 != 0) {
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var16;
         var10 += var11;
      }

   }

   static void ct(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 256 - var9;

      for(int var11 = -var6; var11 < 0; ++var11) {
         for(int var12 = -var5; var12 < 0; ++var12) {
            var2 = var1[var3++];
            if (var2 != 0) {
               int var13 = var0[var4];
               var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936) + ((var2 & '\uff00') * var9 + (var13 & '\uff00') * var10 & 16711680) >> 8;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   public void av(int var1, int var2, int var3, int var4) {
      if (var3 == 256) {
         this.ax(var1, var2);
      } else {
         var1 += this.ac;
         var2 += this.au;
         int var5 = var1 + var2 * ae;
         int var6 = 0;
         int var7 = this.aw;
         int var8 = this.an;
         int var9 = ae - var8;
         int var10 = 0;
         int var11;
         if (var2 < bi) {
            var11 = bi - var2;
            var7 -= var11;
            var2 = bi;
            var6 += var11 * var8;
            var5 += var11 * ae;
         }

         if (var2 + var7 > be) {
            var7 -= var2 + var7 - be;
         }

         if (var1 < bk) {
            var11 = bk - var1;
            var8 -= var11;
            var1 = bk;
            var6 += var11;
            var5 += var11;
            var10 += var11;
            var9 += var11;
         }

         if (var1 + var8 > bx) {
            var11 = var1 + var8 - bx;
            var8 -= var11;
            var10 += var11;
            var9 += var11;
         }

         if (var8 > 0 && var7 > 0) {
            ar(ad, this.af, 0, var6, var5, var8, var7, var9, var10, var3, var4);
         }
      }
   }

   public void do(int var1, int var2, int var3) {
      var1 += this.ac;
      var2 += this.au;
      int var4 = var1 + var2 * ae;
      int var5 = 0;
      int var6 = this.aw;
      int var7 = this.an;
      int var8 = ae - var7;
      int var9 = 0;
      int var10;
      if (var2 < bi) {
         var10 = bi - var2;
         var6 -= var10;
         var2 = bi;
         var5 += var10 * var7;
         var4 += var10 * ae;
      }

      if (var2 + var6 > be) {
         var6 -= var2 + var6 - be;
      }

      if (var1 < bk) {
         var10 = bk - var1;
         var7 -= var10;
         var1 = bk;
         var5 += var10;
         var4 += var10;
         var9 += var10;
         var8 += var10;
      }

      if (var1 + var7 > bx) {
         var10 = var1 + var7 - bx;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if (var7 > 0 && var6 > 0) {
         if (var3 == 256) {
            ad(0, 0, 0, ad, this.af, var5, 0, var4, 0, var7, var6, var8, var9);
         } else {
            ae(0, 0, 0, ad, this.af, var5, 0, var4, 0, var7, var6, var8, var9, var3);
         }

      }
   }

   public void bk(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         int var10 = -var3 / 2;
         int var11 = -var4 / 2;
         int var12 = (int)(Math.sin(var7) * 65536.0);
         int var13 = (int)(Math.cos(var7) * 65536.0);
         var12 = var12 * var9 >> 8;
         var13 = var13 * var9 >> 8;
         int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
         int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
         int var16 = var1 + var2 * ae;

         for(var2 = 0; var2 < var4; ++var2) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for(var1 = -var3; var1 < 0; ++var1) {
               int var20 = this.af[(var18 >> 16) + (var19 >> 16) * this.an];
               if (var20 != 0) {
                  ad[var17++] = var20;
               } else {
                  ++var17;
               }

               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += ae;
         }
      } catch (Exception var21) {
      }

   }

   static void ak(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      int var13 = 256 - var12;
      int var14 = var3;

      for(int var15 = -var8; var15 < 0; ++var15) {
         int var16 = (var4 >> 16) * var11;

         for(int var17 = -var7; var17 < 0; ++var17) {
            var2 = var1[(var3 >> 16) + var16];
            if (var2 != 0) {
               int var18 = var0[var5];
               var0[var5++] = ((var2 & 16711935) * var12 + (var18 & 16711935) * var13 & -16711936) + ((var2 & '\uff00') * var12 + (var18 & '\uff00') * var13 & 16711680) >> 8;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var14;
         var5 += var6;
      }

   }

   void bo(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 != 0) {
         var1 -= this.ac << 4;
         var2 -= this.au << 4;
         double var7 = (double)(var5 & '\uffff') * 9.587379924285257E-5;
         int var9 = (int)Math.floor(Math.sin(var7) * (double)var6 + 0.5);
         int var10 = (int)Math.floor(Math.cos(var7) * (double)var6 + 0.5);
         int var11 = -var1 * var10 + -var2 * var9;
         int var12 = -(-var1) * var9 + -var2 * var10;
         int var13 = ((this.an << 4) - var1) * var10 + -var2 * var9;
         int var14 = -((this.an << 4) - var1) * var9 + -var2 * var10;
         int var15 = -var1 * var10 + ((this.aw << 4) - var2) * var9;
         int var16 = -(-var1) * var9 + ((this.aw << 4) - var2) * var10;
         int var17 = ((this.an << 4) - var1) * var10 + ((this.aw << 4) - var2) * var9;
         int var18 = -((this.an << 4) - var1) * var9 + ((this.aw << 4) - var2) * var10;
         int var19;
         int var20;
         if (var11 < var13) {
            var19 = var11;
            var20 = var13;
         } else {
            var19 = var13;
            var20 = var11;
         }

         if (var15 < var19) {
            var19 = var15;
         }

         if (var17 < var19) {
            var19 = var17;
         }

         if (var15 > var20) {
            var20 = var15;
         }

         if (var17 > var20) {
            var20 = var17;
         }

         int var21;
         int var22;
         if (var12 < var14) {
            var21 = var12;
            var22 = var14;
         } else {
            var21 = var14;
            var22 = var12;
         }

         if (var16 < var21) {
            var21 = var16;
         }

         if (var18 < var21) {
            var21 = var18;
         }

         if (var16 > var22) {
            var22 = var16;
         }

         if (var18 > var22) {
            var22 = var18;
         }

         var19 >>= 12;
         var20 = var20 + 4095 >> 12;
         var21 >>= 12;
         var22 = var22 + 4095 >> 12;
         var19 += var3;
         var20 += var3;
         var21 += var4;
         var22 += var4;
         var19 >>= 4;
         var20 = var20 + 15 >> 4;
         var21 >>= 4;
         var22 = var22 + 15 >> 4;
         if (var19 < bk) {
            var19 = bk;
         }

         if (var20 > bx) {
            var20 = bx;
         }

         if (var21 < bi) {
            var21 = bi;
         }

         if (var22 > be) {
            var22 = be;
         }

         var20 = var19 - var20;
         if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
               int var23 = var21 * ae + var19;
               double var24 = 1.6777216E7 / (double)var6;
               int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
               int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
               int var28 = (var19 << 4) + 8 - var3;
               int var29 = (var21 << 4) + 8 - var4;
               int var30 = (var1 << 8) - (var29 * var26 >> 4);
               int var31 = (var2 << 8) + (var29 * var27 >> 4);
               int var32;
               int var33;
               int var34;
               int var35;
               int var36;
               int var37;
               int var38;
               if (var27 == 0) {
                  if (var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += ae) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31;
                        var37 = var20;
                        if (var30 >= 0 && var31 >= 0 && var30 - (this.an << 12) < 0 && var31 - (this.aw << 12) < 0) {
                           for(; var37 < 0; ++var37) {
                              var38 = this.af[(var36 >> 12) * this.an + (var35 >> 12)];
                              if (var38 != 0) {
                                 ad[var34++] = var38;
                              } else {
                                 ++var34;
                              }
                           }
                        }

                        ++var33;
                     }
                  } else if (var26 < 0) {
                     for(var33 = var22; var33 < 0; var23 += ae) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if (var30 >= 0 && var30 - (this.an << 12) < 0) {
                           if ((var32 = var36 - (this.aw << 12)) >= 0) {
                              var32 = (var26 - var32) / var26;
                              var37 = var20 + var32;
                              var36 += var26 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (var36 - var26) / var26) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.af[(var36 >> 12) * this.an + (var35 >> 12)];
                              if (var38 != 0) {
                                 ad[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var36 += var26;
                              ++var37;
                           }
                        }

                        ++var33;
                        var30 -= var26;
                     }
                  } else {
                     for(var33 = var22; var33 < 0; var23 += ae) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if (var30 >= 0 && var30 - (this.an << 12) < 0) {
                           if (var36 < 0) {
                              var32 = (var26 - 1 - var36) / var26;
                              var37 = var20 + var32;
                              var36 += var26 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (1 + var36 - (this.aw << 12) - var26) / var26) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.af[(var36 >> 12) * this.an + (var35 >> 12)];
                              if (var38 != 0) {
                                 ad[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var36 += var26;
                              ++var37;
                           }
                        }

                        ++var33;
                        var30 -= var26;
                     }
                  }
               } else if (var27 < 0) {
                  if (var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += ae) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31;
                        var37 = var20;
                        if (var31 >= 0 && var31 - (this.aw << 12) < 0) {
                           if ((var32 = var35 - (this.an << 12)) >= 0) {
                              var32 = (var27 - var32) / var27;
                              var37 = var20 + var32;
                              var35 += var27 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (var35 - var27) / var27) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.af[(var36 >> 12) * this.an + (var35 >> 12)];
                              if (var38 != 0) {
                                 ad[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var35 += var27;
                              ++var37;
                           }
                        }

                        ++var33;
                        var31 += var27;
                     }
                  } else if (var26 < 0) {
                     for(var33 = var22; var33 < 0; var23 += ae) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if ((var32 = var35 - (this.an << 12)) >= 0) {
                           var32 = (var27 - var32) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (var35 - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        if ((var32 = var36 - (this.aw << 12)) >= 0) {
                           var32 = (var26 - var32) / var26;
                           var37 += var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 += var32;
                        }

                        if ((var32 = (var36 - var26) / var26) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.af[(var36 >> 12) * this.an + (var35 >> 12)];
                           if (var38 != 0) {
                              ad[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           var36 += var26;
                           ++var37;
                        }

                        ++var33;
                        var30 -= var26;
                        var31 += var27;
                     }
                  } else {
                     for(var33 = var22; var33 < 0; var23 += ae) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if ((var32 = var35 - (this.an << 12)) >= 0) {
                           var32 = (var27 - var32) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (var35 - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        if (var36 < 0) {
                           var32 = (var26 - 1 - var36) / var26;
                           var37 += var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 += var32;
                        }

                        if ((var32 = (1 + var36 - (this.aw << 12) - var26) / var26) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.af[(var36 >> 12) * this.an + (var35 >> 12)];
                           if (var38 != 0) {
                              ad[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           var36 += var26;
                           ++var37;
                        }

                        ++var33;
                        var30 -= var26;
                        var31 += var27;
                     }
                  }
               } else if (var26 == 0) {
                  for(var33 = var22; var33 < 0; var23 += ae) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31;
                     var37 = var20;
                     if (var31 >= 0 && var31 - (this.aw << 12) < 0) {
                        if (var35 < 0) {
                           var32 = (var27 - 1 - var35) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (1 + var35 - (this.an << 12) - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.af[(var36 >> 12) * this.an + (var35 >> 12)];
                           if (var38 != 0) {
                              ad[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           ++var37;
                        }
                     }

                     ++var33;
                     var31 += var27;
                  }
               } else if (var26 < 0) {
                  for(var33 = var22; var33 < 0; var23 += ae) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31 + (var28 * var26 >> 4);
                     var37 = var20;
                     if (var35 < 0) {
                        var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     if ((var32 = (1 + var35 - (this.an << 12) - var27) / var27) > var37) {
                        var37 = var32;
                     }

                     if ((var32 = var36 - (this.aw << 12)) >= 0) {
                        var32 = (var26 - var32) / var26;
                        var37 += var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 += var32;
                     }

                     if ((var32 = (var36 - var26) / var26) > var37) {
                        var37 = var32;
                     }

                     while(var37 < 0) {
                        var38 = this.af[(var36 >> 12) * this.an + (var35 >> 12)];
                        if (var38 != 0) {
                           ad[var34++] = var38;
                        } else {
                           ++var34;
                        }

                        var35 += var27;
                        var36 += var26;
                        ++var37;
                     }

                     ++var33;
                     var30 -= var26;
                     var31 += var27;
                  }
               } else {
                  for(var33 = var22; var33 < 0; var23 += ae) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31 + (var28 * var26 >> 4);
                     var37 = var20;
                     if (var35 < 0) {
                        var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     if ((var32 = (1 + var35 - (this.an << 12) - var27) / var27) > var37) {
                        var37 = var32;
                     }

                     if (var36 < 0) {
                        var32 = (var26 - 1 - var36) / var26;
                        var37 += var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 += var32;
                     }

                     if ((var32 = (1 + var36 - (this.aw << 12) - var26) / var26) > var37) {
                        var37 = var32;
                     }

                     while(var37 < 0) {
                        var38 = this.af[(var36 >> 12) * this.an + (var35 >> 12)];
                        if (var38 != 0) {
                           ad[var34++] = var38;
                        } else {
                           ++var34;
                        }

                        var35 += var27;
                        var36 += var26;
                        ++var37;
                     }

                     ++var33;
                     var30 -= var26;
                     var31 += var27;
                  }
               }

            }
         }
      }
   }

   public void bz(int var1, int var2, int var3, int var4) {
      if (var3 <= this.ab && var4 <= this.aq) {
         int var5 = var1 + this.ac * var3 / this.ab;
         int var6 = var1 + ((this.ac + this.an) * var3 + this.ab - 1) / this.ab;
         int var7 = var2 + this.au * var4 / this.aq;
         int var8 = var2 + ((this.au + this.aw) * var4 + this.aq - 1) / this.aq;
         if (var5 < bk) {
            var5 = bk;
         }

         if (var6 > bx) {
            var6 = bx;
         }

         if (var7 < bi) {
            var7 = bi;
         }

         if (var8 > be) {
            var8 = be;
         }

         if (var5 < var6 && var7 < var8) {
            int var9 = var7 * ae + var5;
            int var10 = ae - (var6 - var5);
            if (var9 < ad.length) {
               for(int var11 = var7; var11 < var8; ++var11) {
                  for(int var12 = var5; var12 < var6; ++var12) {
                     int var13 = var12 - var1 << 4;
                     int var14 = var11 - var2 << 4;
                     int var15 = var13 * this.ab / var3 - (this.ac << 4);
                     int var16 = (var13 + 16) * this.ab / var3 - (this.ac << 4);
                     int var17 = var14 * this.aq / var4 - (this.au << 4);
                     int var18 = (var14 + 16) * this.aq / var4 - (this.au << 4);
                     int var19 = (var16 - var15) * (var18 - var17) >> 1;
                     if (var19 != 0) {
                        if (var15 < 0) {
                           var15 = 0;
                        }

                        if (var16 >= this.an << 4) {
                           var16 = this.an << 4;
                        }

                        if (var17 < 0) {
                           var17 = 0;
                        }

                        if (var18 >= this.aw << 4) {
                           var18 = this.aw << 4;
                        }

                        --var16;
                        --var18;
                        int var20 = 16 - (var15 & 15);
                        int var21 = (var16 & 15) + 1;
                        int var22 = 16 - (var17 & 15);
                        int var23 = (var18 & 15) + 1;
                        var15 >>= 4;
                        var16 >>= 4;
                        var17 >>= 4;
                        var18 >>= 4;
                        int var24 = 0;
                        int var25 = 0;
                        int var26 = 0;
                        int var27 = 0;

                        int var28;
                        for(var28 = var17; var28 <= var18; ++var28) {
                           int var29 = 16;
                           if (var28 == var17) {
                              var29 = var22;
                           }

                           if (var28 == var18) {
                              var29 = var23;
                           }

                           for(int var30 = var15; var30 <= var16; ++var30) {
                              int var31 = this.af[var28 * this.an + var30];
                              if (var31 != 0) {
                                 int var32;
                                 if (var30 == var15) {
                                    var32 = var29 * var20;
                                 } else if (var30 == var16) {
                                    var32 = var29 * var21;
                                 } else {
                                    var32 = var29 << 4;
                                 }

                                 var27 += var32;
                                 var24 += (var31 >> 16 & 255) * var32;
                                 var25 += (var31 >> 8 & 255) * var32;
                                 var26 += (var31 & 255) * var32;
                              }
                           }
                        }

                        if (var27 >= var19) {
                           var28 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
                           if (var28 == 0) {
                              var28 = 1;
                           }

                           ad[var9] = var28;
                        }

                        ++var9;
                     }
                  }

                  var9 += var10;
               }

            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public tq bm() {
      tq var1 = new tq(this.an, this.aw);
      var1.ab = this.ab;
      var1.aq = this.aq;
      var1.ac = this.ab - this.an - this.ac;
      var1.au = this.au;

      for(int var2 = 0; var2 < this.aw; ++var2) {
         for(int var3 = 0; var3 < this.an; ++var3) {
            var1.af[var2 * this.an + var3] = this.af[var2 * this.an + this.an - 1 - var3];
         }
      }

      return var1;
   }

   public tq bd() {
      tq var1 = new tq(this.an, this.aw);
      var1.ab = this.ab;
      var1.aq = this.aq;
      var1.ac = this.ab - this.an - this.ac;
      var1.au = this.au;

      for(int var2 = 0; var2 < this.aw; ++var2) {
         for(int var3 = 0; var3 < this.an; ++var3) {
            var1.af[var2 * this.an + var3] = this.af[var2 * this.an + this.an - 1 - var3];
         }
      }

      return var1;
   }

   public tq bt() {
      tq var1 = new tq(this.an, this.aw);
      var1.ab = this.ab;
      var1.aq = this.aq;
      var1.ac = this.ab - this.an - this.ac;
      var1.au = this.au;

      for(int var2 = 0; var2 < this.aw; ++var2) {
         for(int var3 = 0; var3 < this.an; ++var3) {
            var1.af[var2 * this.an + var3] = this.af[var2 * this.an + this.an - 1 - var3];
         }
      }

      return var1;
   }

   public tq bj() {
      tq var1 = new tq(this.an, this.aw);
      var1.ab = this.ab;
      var1.aq = this.aq;
      var1.ac = this.ab - this.an - this.ac;
      var1.au = this.au;

      for(int var2 = 0; var2 < this.aw; ++var2) {
         for(int var3 = 0; var3 < this.an; ++var3) {
            var1.af[var2 * this.an + var3] = this.af[var2 * this.an + this.an - 1 - var3];
         }
      }

      return var1;
   }

   public tq bn() {
      tq var1 = new tq(this.an, this.aw);
      var1.ab = this.ab;
      var1.aq = this.aq;
      var1.ac = this.ac;
      var1.au = this.au;
      int var2 = this.af.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.af[var3] = this.af[var3];
      }

      return var1;
   }

   public tq bs() {
      tq var1 = new tq(this.an, this.aw);
      var1.ab = this.ab;
      var1.aq = this.aq;
      var1.ac = this.ac;
      var1.au = this.au;
      int var2 = this.af.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.af[var3] = this.af[var3];
      }

      return var1;
   }

   public void dy(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         int var10 = -var3 / 2;
         int var11 = -var4 / 2;
         int var12 = (int)(Math.sin(var7) * 65536.0);
         int var13 = (int)(Math.cos(var7) * 65536.0);
         var12 = var12 * var9 >> 8;
         var13 = var13 * var9 >> 8;
         int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
         int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
         int var16 = var1 + var2 * ae;

         for(var2 = 0; var2 < var4; ++var2) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for(var1 = -var3; var1 < 0; ++var1) {
               int var20 = this.af[(var18 >> 16) + (var19 >> 16) * this.an];
               if (var20 != 0) {
                  ad[var17++] = var20;
               } else {
                  ++var17;
               }

               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += ae;
         }
      } catch (Exception var21) {
      }

   }

   public tq bg() {
      tq var1 = new tq(this.an, this.aw);
      var1.ab = this.ab;
      var1.aq = this.aq;
      var1.ac = this.ac;
      var1.au = this.au;
      int var2 = this.af.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.af[var3] = this.af[var3];
      }

      return var1;
   }

   public tq bu() {
      tq var1 = new tq(this.ab, this.aq);

      for(int var2 = 0; var2 < this.aw; ++var2) {
         for(int var3 = 0; var3 < this.an; ++var3) {
            var1.af[(var2 + this.au) * this.ab + var3 + this.ac] = this.af[var2 * this.an + var3];
         }
      }

      return var1;
   }

   public void bv(int var1) {
      if (this.an != this.ab || this.aw != this.aq) {
         int var2 = var1;
         if (var1 > this.ac) {
            var2 = this.ac;
         }

         int var3 = var1;
         if (var1 + this.ac + this.an > this.ab) {
            var3 = this.ab - this.ac - this.an;
         }

         int var4 = var1;
         if (var1 > this.au) {
            var4 = this.au;
         }

         int var5 = var1;
         if (var1 + this.au + this.aw > this.aq) {
            var5 = this.aq - this.au - this.aw;
         }

         int var6 = this.an + var2 + var3;
         int var7 = this.aw + var4 + var5;
         int[] var8 = new int[var6 * var7];

         for(int var9 = 0; var9 < this.aw; ++var9) {
            for(int var10 = 0; var10 < this.an; ++var10) {
               var8[(var9 + var4) * var6 + var10 + var2] = this.af[var9 * this.an + var10];
            }
         }

         this.af = var8;
         this.an = var6;
         this.aw = var7;
         this.ac -= var2;
         this.au -= var4;
      }
   }

   public void bq() {
      ea(this.af, this.an, this.aw, (float[])null);
   }

   public void ba() {
      if (this.an != this.ab || this.aw != this.aq) {
         int[] var1 = new int[this.ab * this.aq];

         for(int var2 = 0; var2 < this.aw; ++var2) {
            for(int var3 = 0; var3 < this.an; ++var3) {
               var1[(var2 + this.au) * this.ab + var3 + this.ac] = this.af[var2 * this.an + var3];
            }
         }

         this.af = var1;
         this.an = this.ab;
         this.aw = this.aq;
         this.ac = 0;
         this.au = 0;
      }
   }

   static void ao(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = -var5; var8 < 0; ++var8) {
         int var9;
         for(var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
         }

         for(var9 += 3; var3 < var9; var0[var3++] = var1[var2++]) {
         }

         var3 += var6;
         var2 += var7;
      }

   }

   public void bl() {
      int[] var1 = new int[this.an * this.aw];
      int var2 = 0;

      for(int var3 = 0; var3 < this.aw; ++var3) {
         for(int var4 = this.an - 1; var4 >= 0; --var4) {
            var1[var2++] = this.af[var4 + var3 * this.an];
         }
      }

      this.af = var1;
      this.ac = this.ab - this.an - this.ac;
   }

   public void bp() {
      int[] var1 = new int[this.an * this.aw];
      int var2 = 0;

      for(int var3 = 0; var3 < this.aw; ++var3) {
         for(int var4 = this.an - 1; var4 >= 0; --var4) {
            var1[var2++] = this.af[var4 + var3 * this.an];
         }
      }

      this.af = var1;
      this.ac = this.ab - this.an - this.ac;
   }

   public void bc() {
      int[] var1 = new int[this.an * this.aw];
      int var2 = 0;

      for(int var3 = 0; var3 < this.aw; ++var3) {
         for(int var4 = this.an - 1; var4 >= 0; --var4) {
            var1[var2++] = this.af[var4 + var3 * this.an];
         }
      }

      this.af = var1;
      this.ac = this.ab - this.an - this.ac;
   }

   public void bh() {
      int[] var1 = new int[this.an * this.aw];
      int var2 = 0;

      for(int var3 = 0; var3 < this.aw; ++var3) {
         for(int var4 = this.an - 1; var4 >= 0; --var4) {
            var1[var2++] = this.af[var4 + var3 * this.an];
         }
      }

      this.af = var1;
      this.ac = this.ab - this.an - this.ac;
   }

   public void bw() {
      int[] var1 = new int[this.an * this.aw];
      int var2 = 0;

      for(int var3 = 0; var3 < this.aw; ++var3) {
         for(int var4 = this.an - 1; var4 >= 0; --var4) {
            var1[var2++] = this.af[var4 + var3 * this.an];
         }
      }

      this.af = var1;
      this.ac = this.ab - this.an - this.ac;
   }

   public void ce() {
      int[] var1 = new int[this.an * this.aw];
      int var2 = 0;

      for(int var3 = this.aw - 1; var3 >= 0; --var3) {
         for(int var4 = 0; var4 < this.an; ++var4) {
            var1[var2++] = this.af[var4 + var3 * this.an];
         }
      }

      this.af = var1;
      this.au = this.aq - this.aw - this.au;
   }

   public void ci() {
      int[] var1 = new int[this.an * this.aw];
      int var2 = 0;

      for(int var3 = this.aw - 1; var3 >= 0; --var3) {
         for(int var4 = 0; var4 < this.an; ++var4) {
            var1[var2++] = this.af[var4 + var3 * this.an];
         }
      }

      this.af = var1;
      this.au = this.aq - this.aw - this.au;
   }

   public void aj(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.an;
         int var7 = this.aw;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.ab;
         int var11 = this.aq;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if (this.ac > 0) {
            var14 = ((this.ac << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.ac << 16);
         }

         if (this.au > 0) {
            var14 = ((this.au << 16) + var13 - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.au << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         var14 = var1 + var2 * ae;
         int var15 = ae - var3;
         if (var2 + var4 > be) {
            var4 -= var2 + var4 - be;
         }

         int var16;
         if (var2 < bi) {
            var16 = bi - var2;
            var4 -= var16;
            var14 += var16 * ae;
            var9 += var13 * var16;
         }

         if (var1 + var3 > bx) {
            var16 = var1 + var3 - bx;
            var3 -= var16;
            var15 += var16;
         }

         if (var1 < bk) {
            var16 = bk - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         ak(ad, this.af, 0, var8, var9, var14, var15, var3, var4, var12, var13, var6, var5);
      }
   }

   static void bb(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
      for(int var17 = var3; var8 < 0; ++var8) {
         var7 = (var9 >> 16) * var15;

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if (var0 != 0) {
               var1 = (var0 & 16711935) * var16;
               var0 = (var1 & -16711936) + (var0 * var16 - var1 & 16711680) >>> 8;
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var17;
         var10 += var11;
      }

   }

   public void aq() {
      int[] var1 = new int[this.an * this.aw];
      int var2 = 0;

      for(int var3 = 0; var3 < this.aw; ++var3) {
         for(int var4 = this.an - 1; var4 >= 0; --var4) {
            var1[var2++] = this.af[var4 + var3 * this.an];
         }
      }

      this.af = var1;
      this.ac = this.ab - this.an - this.ac;
   }

   public void dt(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.an;
         int var7 = this.aw;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.ab;
         int var11 = this.aq;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if (this.ac > 0) {
            var14 = ((this.ac << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.ac << 16);
         }

         if (this.au > 0) {
            var14 = ((this.au << 16) + var13 - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.au << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         var14 = var1 + var2 * ae;
         int var15 = ae - var3;
         if (var2 + var4 > be) {
            var4 -= var2 + var4 - be;
         }

         int var16;
         if (var2 < bi) {
            var16 = bi - var2;
            var4 -= var16;
            var14 += var16 * ae;
            var9 += var13 * var16;
         }

         if (var1 + var3 > bx) {
            var16 = var1 + var3 - bx;
            var3 -= var16;
            var15 += var16;
         }

         if (var1 < bk) {
            var16 = bk - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         if (var5 == 256) {
            by(0, 0, 0, var8, this.af, ad, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6);
         } else {
            bb(0, 0, 0, var8, this.af, ad, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6, var5);
         }

      }
   }

   public void cg(int var1, int var2, int var3, int var4) {
      if (var3 > 0 && var4 > 0) {
         int var5 = this.an;
         int var6 = this.aw;
         int var7 = 0;
         int var8 = 0;
         int var9 = this.ab;
         int var10 = this.aq;
         int var11 = (var9 << 16) / var3;
         int var12 = (var10 << 16) / var4;
         int var13;
         if (this.ac > 0) {
            var13 = ((this.ac << 16) + var11 - 1) / var11;
            var1 += var13;
            var7 += var13 * var11 - (this.ac << 16);
         }

         if (this.au > 0) {
            var13 = ((this.au << 16) + var12 - 1) / var12;
            var2 += var13;
            var8 += var13 * var12 - (this.au << 16);
         }

         if (var5 < var9) {
            var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
         }

         if (var6 < var10) {
            var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         var13 = var1 + var2 * ae;
         int var14 = ae - var3;
         if (var2 + var4 > be) {
            var4 -= var2 + var4 - be;
         }

         int var15;
         if (var2 < bi) {
            var15 = bi - var2;
            var4 -= var15;
            var13 += var15 * ae;
            var8 += var12 * var15;
         }

         if (var1 + var3 > bx) {
            var15 = var1 + var3 - bx;
            var3 -= var15;
            var14 += var15;
         }

         if (var1 < bk) {
            var15 = bk - var1;
            var3 -= var15;
            var13 += var15;
            var7 += var11 * var15;
            var14 += var15;
         }

         ah(ad, this.af, 0, var7, var8, var13, var14, var3, var4, var11, var12, var5);
      }
   }

   static void ck(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = -var5; var8 < 0; ++var8) {
         int var9;
         for(var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
         }

         for(var9 += 3; var3 < var9; var0[var3++] = var1[var2++]) {
         }

         var3 += var6;
         var2 += var7;
      }

   }

   public void aa(int var1) {
      for(int var2 = this.aw - 1; var2 > 0; --var2) {
         int var3 = var2 * this.an;

         for(int var4 = this.an - 1; var4 > 0; --var4) {
            if (this.af[var4 + var3] == 0 && this.af[var4 + var3 - 1 - this.an] != 0) {
               this.af[var4 + var3] = var1;
            }
         }
      }

   }

   public void cm(int var1, int var2) {
      var1 += this.ac;
      var2 += this.au;
      int var3 = var1 + var2 * ae;
      int var4 = 0;
      int var5 = this.aw;
      int var6 = this.an;
      int var7 = ae - var6;
      int var8 = 0;
      int var9;
      if (var2 < bi) {
         var9 = bi - var2;
         var5 -= var9;
         var2 = bi;
         var4 += var9 * var6;
         var3 += var9 * ae;
      }

      if (var2 + var5 > be) {
         var5 -= var2 + var5 - be;
      }

      if (var1 < bk) {
         var9 = bk - var1;
         var6 -= var9;
         var1 = bk;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var1 + var6 > bx) {
         var9 = var1 + var6 - bx;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         ai(ad, this.af, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   static void cf(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   public void cl(int var1, int var2, int var3, int var4) {
      if (var3 > 0 && var4 > 0) {
         int var5 = this.an;
         int var6 = this.aw;
         int var7 = 0;
         int var8 = 0;
         int var9 = this.ab;
         int var10 = this.aq;
         int var11 = (var9 << 16) / var3;
         int var12 = (var10 << 16) / var4;
         int var13;
         if (this.ac > 0) {
            var13 = ((this.ac << 16) + var11 - 1) / var11;
            var1 += var13;
            var7 += var13 * var11 - (this.ac << 16);
         }

         if (this.au > 0) {
            var13 = ((this.au << 16) + var12 - 1) / var12;
            var2 += var13;
            var8 += var13 * var12 - (this.au << 16);
         }

         if (var5 < var9) {
            var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
         }

         if (var6 < var10) {
            var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         var13 = var1 + var2 * ae;
         int var14 = ae - var3;
         if (var2 + var4 > be) {
            var4 -= var2 + var4 - be;
         }

         int var15;
         if (var2 < bi) {
            var15 = bi - var2;
            var4 -= var15;
            var13 += var15 * ae;
            var8 += var12 * var15;
         }

         if (var1 + var3 > bx) {
            var15 = var1 + var3 - bx;
            var3 -= var15;
            var14 += var15;
         }

         if (var1 < bk) {
            var15 = bk - var1;
            var3 -= var15;
            var13 += var15;
            var7 += var11 * var15;
            var14 += var15;
         }

         ah(ad, this.af, 0, var7, var8, var13, var14, var3, var4, var11, var12, var5);
      }
   }

   static void as(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 256 - var9;

      for(int var11 = -var6; var11 < 0; ++var11) {
         for(int var12 = -var5; var12 < 0; ++var12) {
            var2 = var1[var3++];
            if (var2 != 0) {
               int var13 = var0[var4];
               var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936) + ((var2 & '\uff00') * var9 + (var13 & '\uff00') * var10 & 16711680) >> 8;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   public void cr(int var1, int var2, int var3, int var4) {
      if (var3 > 0 && var4 > 0) {
         int var5 = this.an;
         int var6 = this.aw;
         int var7 = 0;
         int var8 = 0;
         int var9 = this.ab;
         int var10 = this.aq;
         int var11 = (var9 << 16) / var3;
         int var12 = (var10 << 16) / var4;
         int var13;
         if (this.ac > 0) {
            var13 = ((this.ac << 16) + var11 - 1) / var11;
            var1 += var13;
            var7 += var13 * var11 - (this.ac << 16);
         }

         if (this.au > 0) {
            var13 = ((this.au << 16) + var12 - 1) / var12;
            var2 += var13;
            var8 += var13 * var12 - (this.au << 16);
         }

         if (var5 < var9) {
            var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
         }

         if (var6 < var10) {
            var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         var13 = var1 + var2 * ae;
         int var14 = ae - var3;
         if (var2 + var4 > be) {
            var4 -= var2 + var4 - be;
         }

         int var15;
         if (var2 < bi) {
            var15 = bi - var2;
            var4 -= var15;
            var13 += var15 * ae;
            var8 += var12 * var15;
         }

         if (var1 + var3 > bx) {
            var15 = var1 + var3 - bx;
            var3 -= var15;
            var14 += var15;
         }

         if (var1 < bk) {
            var15 = bk - var1;
            var3 -= var15;
            var13 += var15;
            var7 += var11 * var15;
            var14 += var15;
         }

         ah(ad, this.af, 0, var7, var8, var13, var14, var3, var4, var11, var12, var5);
      }
   }

   static void cy(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = (var4 >> 16) * var11;

         for(int var15 = -var7; var15 < 0; ++var15) {
            var2 = var1[(var3 >> 16) + var14];
            if (var2 != 0) {
               var0[var5++] = var2;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var12;
         var5 += var6;
      }

   }

   public void cx(int var1, int var2, int var3, int var4) {
      if (var3 == 256) {
         this.ax(var1, var2);
      } else {
         var1 += this.ac;
         var2 += this.au;
         int var5 = var1 + var2 * ae;
         int var6 = 0;
         int var7 = this.aw;
         int var8 = this.an;
         int var9 = ae - var8;
         int var10 = 0;
         int var11;
         if (var2 < bi) {
            var11 = bi - var2;
            var7 -= var11;
            var2 = bi;
            var6 += var11 * var8;
            var5 += var11 * ae;
         }

         if (var2 + var7 > be) {
            var7 -= var2 + var7 - be;
         }

         if (var1 < bk) {
            var11 = bk - var1;
            var8 -= var11;
            var1 = bk;
            var6 += var11;
            var5 += var11;
            var10 += var11;
            var9 += var11;
         }

         if (var1 + var8 > bx) {
            var11 = var1 + var8 - bx;
            var8 -= var11;
            var10 += var11;
            var9 += var11;
         }

         if (var8 > 0 && var7 > 0) {
            ar(ad, this.af, 0, var6, var5, var8, var7, var9, var10, var3, var4);
         }
      }
   }

   static void cv(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      int var11 = 1969567913 - var9;
      int var12 = (var10 & 16711935) * var11 & -16711936;
      int var13 = (var10 & -414595869) * var11 & 786833970;
      var10 = (var12 | var13) >>> 8;

      for(int var14 = -var6; var14 < 0; ++var14) {
         for(int var15 = -var5; var15 < 0; ++var15) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var12 = (var2 & 1689590223) * var9 & -16711936;
               var13 = (var2 & '\uff00') * var9 & -2039790824;
               var0[var4++] = ((var12 | var13) >>> 8) + var10;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   public void cb(int var1, int var2, int var3) {
      var1 += this.ac;
      var2 += this.au;
      int var4 = var1 + var2 * ae;
      int var5 = 0;
      int var6 = this.aw;
      int var7 = this.an;
      int var8 = ae - var7;
      int var9 = 0;
      int var10;
      if (var2 < bi) {
         var10 = bi - var2;
         var6 -= var10;
         var2 = bi;
         var5 += var10 * var7;
         var4 += var10 * ae;
      }

      if (var2 + var6 > be) {
         var6 -= var2 + var6 - be;
      }

      if (var1 < bk) {
         var10 = bk - var1;
         var7 -= var10;
         var1 = bk;
         var5 += var10;
         var4 += var10;
         var9 += var10;
         var8 += var10;
      }

      if (var1 + var7 > bx) {
         var10 = var1 + var7 - bx;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if (var7 > 0 && var6 > 0) {
         as(ad, this.af, 0, var5, var4, var7, var6, var8, var9, var3);
      }
   }

   public void ca(int var1, int var2) {
      var1 += this.ac;
      var2 += this.au;
      int var3 = var1 + var2 * ae;
      int var4 = 0;
      int var5 = this.aw;
      int var6 = this.an;
      int var7 = ae - var6;
      int var8 = 0;
      int var9;
      if (var2 < bi) {
         var9 = bi - var2;
         var5 -= var9;
         var2 = bi;
         var4 += var9 * var6;
         var3 += var9 * ae;
      }

      if (var2 + var5 > be) {
         var5 -= var2 + var5 - be;
      }

      if (var1 < bk) {
         var9 = bk - var1;
         var6 -= var9;
         var1 = bk;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var1 + var6 > bx) {
         var9 = var1 + var6 - bx;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         ao(ad, this.af, var4, var3, var6, var5, var7, var8);
      }
   }

   static void cz(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = -1595484277 - var9;

      for(int var11 = -var6; var11 < 0; ++var11) {
         for(int var12 = -var5; var12 < 0; ++var12) {
            var2 = var1[var3++];
            if (var2 != 0) {
               int var13 = var0[var4];
               var0[var4++] = ((var2 & 16711935) * var9 + (var13 & -33477152) * var10 & 1786503356) + ((var2 & 1379437909) * var9 + (var13 & '\uff00') * var10 & 1586094030) >> 8;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   public void cu(int var1, int var2) {
      var1 += this.ac;
      var2 += this.au;
      int var3 = var1 + var2 * ae;
      int var4 = 0;
      int var5 = this.aw;
      int var6 = this.an;
      int var7 = ae - var6;
      int var8 = 0;
      int var9;
      if (var2 < bi) {
         var9 = bi - var2;
         var5 -= var9;
         var2 = bi;
         var4 += var9 * var6;
         var3 += var9 * ae;
      }

      if (var2 + var5 > be) {
         var5 -= var2 + var5 - be;
      }

      if (var1 < bk) {
         var9 = bk - var1;
         var6 -= var9;
         var1 = bk;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var1 + var6 > bx) {
         var9 = var1 + var6 - bx;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         ao(ad, this.af, var4, var3, var6, var5, var7, var8);
      }
   }

   static void cj(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 256 - var9;

      for(int var11 = -var6; var11 < 0; ++var11) {
         for(int var12 = -var5; var12 < 0; ++var12) {
            var2 = var1[var3++];
            if (var2 != 0) {
               int var13 = var0[var4];
               var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936) + ((var2 & '\uff00') * var9 + (var13 & '\uff00') * var10 & 16711680) >> 8;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void ch(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = -298475141 - var9;

      for(int var11 = -var6; var11 < 0; ++var11) {
         for(int var12 = -var5; var12 < 0; ++var12) {
            var2 = var1[var3++];
            if (var2 != 0) {
               int var13 = var0[var4];
               var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -778675362) + ((var2 & -409032646) * var9 + (var13 & '\uff00') * var10 & 16711680) >> 8;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   public void az(int var1, int var2, int var3) {
      var1 += this.ac;
      var2 += this.au;
      int var4 = var1 + var2 * ae;
      int var5 = 0;
      int var6 = this.aw;
      int var7 = this.an;
      int var8 = ae - var7;
      int var9 = 0;
      int var10;
      if (var2 < bi) {
         var10 = bi - var2;
         var6 -= var10;
         var2 = bi;
         var5 += var10 * var7;
         var4 += var10 * ae;
      }

      if (var2 + var6 > be) {
         var6 -= var2 + var6 - be;
      }

      if (var1 < bk) {
         var10 = bk - var1;
         var7 -= var10;
         var1 = bk;
         var5 += var10;
         var4 += var10;
         var9 += var10;
         var8 += var10;
      }

      if (var1 + var7 > bx) {
         var10 = var1 + var7 - bx;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if (var7 > 0 && var6 > 0) {
         if (var3 == 256) {
            ad(0, 0, 0, ad, this.af, var5, 0, var4, 0, var7, var6, var8, var9);
         } else {
            ae(0, 0, 0, ad, this.af, var5, 0, var4, 0, var7, var6, var8, var9, var3);
         }

      }
   }

   public void dk(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.an;
         int var7 = this.aw;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.ab;
         int var11 = this.aq;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if (this.ac > 0) {
            var14 = ((this.ac << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.ac << 16);
         }

         if (this.au > 0) {
            var14 = ((this.au << 16) + var13 - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.au << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         var14 = var1 + var2 * ae;
         int var15 = ae - var3;
         if (var2 + var4 > be) {
            var4 -= var2 + var4 - be;
         }

         int var16;
         if (var2 < bi) {
            var16 = bi - var2;
            var4 -= var16;
            var14 += var16 * ae;
            var9 += var13 * var16;
         }

         if (var1 + var3 > bx) {
            var16 = var1 + var3 - bx;
            var3 -= var16;
            var15 += var16;
         }

         if (var1 < bk) {
            var16 = bk - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         if (var5 == 256) {
            by(0, 0, 0, var8, this.af, ad, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6);
         } else {
            bb(0, 0, 0, var8, this.af, ad, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6, var5);
         }

      }
   }

   public void cs(int var1) {
      int[] var2 = new int[this.an * this.aw];
      int var3 = 0;

      for(int var4 = 0; var4 < this.aw; ++var4) {
         for(int var5 = 0; var5 < this.an; ++var5) {
            int var6 = this.af[var3];
            if (var6 == 0) {
               if (var5 > 0 && this.af[var3 - 1] != 0) {
                  var6 = var1;
               } else if (var4 > 0 && this.af[var3 - this.an] != 0) {
                  var6 = var1;
               } else if (var5 < this.an - 1 && this.af[var3 + 1] != 0) {
                  var6 = var1;
               } else if (var4 < this.aw - 1 && this.af[var3 + this.an] != 0) {
                  var6 = var1;
               }
            }

            var2[var3++] = var6;
         }
      }

      this.af = var2;
   }

   public void dm(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.an;
         int var7 = this.aw;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.ab;
         int var11 = this.aq;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if (this.ac > 0) {
            var14 = ((this.ac << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.ac << 16);
         }

         if (this.au > 0) {
            var14 = ((this.au << 16) + var13 - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.au << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         var14 = var1 + var2 * ae;
         int var15 = ae - var3;
         if (var2 + var4 > be) {
            var4 -= var2 + var4 - be;
         }

         int var16;
         if (var2 < bi) {
            var16 = bi - var2;
            var4 -= var16;
            var14 += var16 * ae;
            var9 += var13 * var16;
         }

         if (var1 + var3 > bx) {
            var16 = var1 + var3 - bx;
            var3 -= var16;
            var15 += var16;
         }

         if (var1 < bk) {
            var16 = bk - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         ak(ad, this.af, 0, var8, var9, var14, var15, var3, var4, var12, var13, var6, var5);
      }
   }

   static void dw(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      int var13 = 256 - var12;
      int var14 = var3;

      for(int var15 = -var8; var15 < 0; ++var15) {
         int var16 = (var4 >> 16) * var11;

         for(int var17 = -var7; var17 < 0; ++var17) {
            var2 = var1[(var3 >> 16) + var16];
            if (var2 != 0) {
               int var18 = var0[var5];
               var0[var5++] = ((var2 & 950234970) * var12 + (var18 & 215555887) * var13 & -16711936) + ((var2 & 1725651113) * var12 + (var18 & 1196311017) * var13 & -49098736) >> 8;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var14;
         var5 += var6;
      }

   }

   static void dc(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      int var13 = 256 - var12;
      int var14 = var3;

      for(int var15 = -var8; var15 < 0; ++var15) {
         int var16 = (var4 >> 16) * var11;

         for(int var17 = -var7; var17 < 0; ++var17) {
            var2 = var1[(var3 >> 16) + var16];
            if (var2 != 0) {
               int var18 = var0[var5];
               var0[var5++] = ((var2 & 16711935) * var12 + (var18 & 16711935) * var13 & -16711936) + ((var2 & '\uff00') * var12 + (var18 & -98257742) * var13 & 16711680) >> 8;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var14;
         var5 += var6;
      }

   }

   static void dr(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
      for(var8 = -var10; var8 < 0; ++var8) {
         for(var6 = -var9; var6 < 0; ++var6) {
            var0 = var4[var5++];
            if (var0 != 0) {
               var1 = (var0 & 16711935) * var13;
               var0 = (var1 & 1090434385) + (var0 * var13 - var1 & 16711680) >>> 8;
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 397399283) + (var1 & -1219773065);
               var1 = (var0 & 16777472) + (var2 - var0 & -1871631272);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var7;
            }
         }

         var7 += var11;
         var5 += var12;
      }

   }

   public void co(int var1, int var2, int var3) {
      var1 += this.ac;
      var2 += this.au;
      int var4 = var1 + var2 * ae;
      int var5 = 0;
      int var6 = this.aw;
      int var7 = this.an;
      int var8 = ae - var7;
      int var9 = 0;
      int var10;
      if (var2 < bi) {
         var10 = bi - var2;
         var6 -= var10;
         var2 = bi;
         var5 += var10 * var7;
         var4 += var10 * ae;
      }

      if (var2 + var6 > be) {
         var6 -= var2 + var6 - be;
      }

      if (var1 < bk) {
         var10 = bk - var1;
         var7 -= var10;
         var1 = bk;
         var5 += var10;
         var4 += var10;
         var9 += var10;
         var8 += var10;
      }

      if (var1 + var7 > bx) {
         var10 = var1 + var7 - bx;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if (var7 > 0 && var6 > 0) {
         as(ad, this.af, 0, var5, var4, var7, var6, var8, var9, var3);
      }
   }

   static void di(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
      for(var8 = -var10; var8 < 0; ++var8) {
         for(var6 = -var9; var6 < 0; ++var6) {
            var0 = var4[var5++];
            if (var0 != 0) {
               var1 = (var0 & 16711935) * var13;
               var0 = (var1 & -16711936) + (var0 * var13 - var1 & 16711680) >>> 8;
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 6383731);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var7;
            }
         }

         var7 += var11;
         var5 += var12;
      }

   }

   public void cd(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.an;
         int var7 = this.aw;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.ab;
         int var11 = this.aq;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if (this.ac > 0) {
            var14 = ((this.ac << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.ac << 16);
         }

         if (this.au > 0) {
            var14 = ((this.au << 16) + var13 - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.au << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         var14 = var1 + var2 * ae;
         int var15 = ae - var3;
         if (var2 + var4 > be) {
            var4 -= var2 + var4 - be;
         }

         int var16;
         if (var2 < bi) {
            var16 = bi - var2;
            var4 -= var16;
            var14 += var16 * ae;
            var9 += var13 * var16;
         }

         if (var1 + var3 > bx) {
            var16 = var1 + var3 - bx;
            var3 -= var16;
            var15 += var16;
         }

         if (var1 < bk) {
            var16 = bk - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         ak(ad, this.af, 0, var8, var9, var14, var15, var3, var4, var12, var13, var6, var5);
      }
   }

   public tq bf() {
      tq var1 = new tq(this.ab, this.aq);

      for(int var2 = 0; var2 < this.aw; ++var2) {
         for(int var3 = 0; var3 < this.an; ++var3) {
            var1.af[(var2 + this.au) * this.ab + var3 + this.ac] = this.af[var2 * this.an + var3];
         }
      }

      return var1;
   }

   public void cq(int var1, int var2) {
      var1 += this.ac;
      var2 += this.au;
      int var3 = var1 + var2 * ae;
      int var4 = 0;
      int var5 = this.aw;
      int var6 = this.an;
      int var7 = ae - var6;
      int var8 = 0;
      int var9;
      if (var2 < bi) {
         var9 = bi - var2;
         var5 -= var9;
         var2 = bi;
         var4 += var9 * var6;
         var3 += var9 * ae;
      }

      if (var2 + var5 > be) {
         var5 -= var2 + var5 - be;
      }

      if (var1 < bk) {
         var9 = bk - var1;
         var6 -= var9;
         var1 = bk;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var1 + var6 > bx) {
         var9 = var1 + var6 - bx;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         ai(ad, this.af, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   static void dv(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      for(int var16 = var3; var8 < 0; ++var8) {
         var7 = (var9 >> 16) * var15;

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if (var0 != 0) {
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var16;
         var10 += var11;
      }

   }

   static void cp(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 256 - var9;

      for(int var11 = -var6; var11 < 0; ++var11) {
         for(int var12 = -var5; var12 < 0; ++var12) {
            var2 = var1[var3++];
            if (var2 != 0) {
               int var13 = var0[var4];
               var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936) + ((var2 & '\uff00') * var9 + (var13 & '\uff00') * var10 & 16711680) >> 8;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   tq() {
   }

   static void de(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
      for(int var17 = var3; var8 < 0; ++var8) {
         var7 = (var9 >> 16) * var15;

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if (var0 != 0) {
               var1 = (var0 & 16711935) * var16;
               var0 = (var1 & -16711936) + (var0 * var16 - var1 & 16711680) >>> 8;
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var17;
         var10 += var11;
      }

   }

   static void dh(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
      for(int var17 = var3; var8 < 0; ++var8) {
         var7 = (var9 >> 16) * var15;

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if (var0 != 0) {
               var1 = (var0 & 16711935) * var16;
               var0 = (var1 & -16711936) + (var0 * var16 - var1 & -2030392979) >>> 8;
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & -1864292801) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var17;
         var10 += var11;
      }

   }

   public void dp(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      int var9 = var2 < 0 ? -var2 : 0;
      int var10 = var2 + this.aw <= var6 ? this.aw : var6 - var2;
      int var11 = var1 < 0 ? -var1 : 0;
      int var10000;
      if (var1 + this.an <= var5) {
         var10000 = this.an;
      } else {
         var10000 = var5 - var1;
      }

      int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * ae;
      int var14 = var2 + var9;

      for(int var15 = var9; var15 < var10; ++var15) {
         int var16 = var7[var14];
         int var17 = var8[var14++];
         int var18 = var13;
         int var19;
         if (var1 < var16) {
            var19 = var16 - var1;
            var18 = var13 + (var19 - var11);
         } else {
            var19 = var11;
         }

         int var12;
         if (var1 + this.an <= var16 + var17) {
            var12 = this.an;
         } else {
            var12 = var16 + var17 - var1;
         }

         for(int var20 = var19; var20 < var12; ++var20) {
            int var21 = this.af[var20 + var15 * this.an];
            if (var21 != 0) {
               ad[var18++] = var21;
            } else {
               ++var18;
            }
         }

         var13 += ae;
      }

   }

   public void dl(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.an;
         int var7 = this.aw;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.ab;
         int var11 = this.aq;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if (this.ac > 0) {
            var14 = ((this.ac << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.ac << 16);
         }

         if (this.au > 0) {
            var14 = ((this.au << 16) + var13 - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.au << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         var14 = var1 + var2 * ae;
         int var15 = ae - var3;
         if (var2 + var4 > be) {
            var4 -= var2 + var4 - be;
         }

         int var16;
         if (var2 < bi) {
            var16 = bi - var2;
            var4 -= var16;
            var14 += var16 * ae;
            var9 += var13 * var16;
         }

         if (var1 + var3 > bx) {
            var16 = var1 + var3 - bx;
            var3 -= var16;
            var15 += var16;
         }

         if (var1 < bk) {
            var16 = bk - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         if (var5 == 256) {
            by(0, 0, 0, var8, this.af, ad, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6);
         } else {
            bb(0, 0, 0, var8, this.af, ad, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6, var5);
         }

      }
   }

   public void db(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      int var9 = var2 < 0 ? -var2 : 0;
      int var10 = var2 + this.aw <= var6 ? this.aw : var6 - var2;
      int var11 = var1 < 0 ? -var1 : 0;
      int var10000;
      if (var1 + this.an <= var5) {
         var10000 = this.an;
      } else {
         var10000 = var5 - var1;
      }

      int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * ae;
      int var14 = var2 + var9;

      for(int var15 = var9; var15 < var10; ++var15) {
         int var16 = var7[var14];
         int var17 = var8[var14++];
         int var18 = var13;
         int var19;
         if (var1 < var16) {
            var19 = var16 - var1;
            var18 = var13 + (var19 - var11);
         } else {
            var19 = var11;
         }

         int var12;
         if (var1 + this.an <= var16 + var17) {
            var12 = this.an;
         } else {
            var12 = var16 + var17 - var1;
         }

         for(int var20 = var19; var20 < var12; ++var20) {
            int var21 = this.af[var20 + var15 * this.an];
            if (var21 != 0) {
               ad[var18++] = var21;
            } else {
               ++var18;
            }
         }

         var13 += ae;
      }

   }

   public void cc(int var1) {
      int[] var2 = new int[this.an * this.aw];
      int var3 = 0;

      for(int var4 = 0; var4 < this.aw; ++var4) {
         for(int var5 = 0; var5 < this.an; ++var5) {
            int var6 = this.af[var3];
            if (var6 == 0) {
               if (var5 > 0 && this.af[var3 - 1] != 0) {
                  var6 = var1;
               } else if (var4 > 0 && this.af[var3 - this.an] != 0) {
                  var6 = var1;
               } else if (var5 < this.an - 1 && this.af[var3 + 1] != 0) {
                  var6 = var1;
               } else if (var4 < this.aw - 1 && this.af[var3 + this.an] != 0) {
                  var6 = var1;
               }
            }

            var2[var3++] = var6;
         }
      }

      this.af = var2;
   }

   public void dq(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
      try {
         int var11 = -var3 / 2;
         int var12 = -var4 / 2;
         int var13 = (int)(Math.sin((double)var7 / 326.11) * 65536.0);
         int var14 = (int)(Math.cos((double)var7 / 326.11) * 65536.0);
         var13 = var13 * var8 >> 8;
         var14 = var14 * var8 >> 8;
         int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
         int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
         int var17 = var1 + var2 * ae;

         for(var2 = 0; var2 < var4; ++var2) {
            int var18 = var9[var2];
            int var19 = var17 + var18;
            int var20 = var15 + var14 * var18;
            int var21 = var16 - var13 * var18;

            for(var1 = -var10[var2]; var1 < 0; ++var1) {
               ad[var19++] = this.af[(var20 >> 16) + (var21 >> 16) * this.an];
               var20 += var14;
               var21 -= var13;
            }

            var15 += var13;
            var16 += var14;
            var17 += ae;
         }
      } catch (Exception var22) {
      }

   }

   public void dd(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
      try {
         int var11 = -var3 / 2;
         int var12 = -var4 / 2;
         int var13 = (int)(Math.sin((double)var7 / 326.11) * 65536.0);
         int var14 = (int)(Math.cos((double)var7 / 326.11) * 65536.0);
         var13 = var13 * var8 >> 8;
         var14 = var14 * var8 >> 8;
         int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
         int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
         int var17 = var1 + var2 * ae;

         for(var2 = 0; var2 < var4; ++var2) {
            int var18 = var9[var2];
            int var19 = var17 + var18;
            int var20 = var15 + var14 * var18;
            int var21 = var16 - var13 * var18;

            for(var1 = -var10[var2]; var1 < 0; ++var1) {
               ad[var19++] = this.af[(var20 >> 16) + (var21 >> 16) * this.an];
               var20 += var14;
               var21 -= var13;
            }

            var15 += var13;
            var16 += var14;
            var17 += ae;
         }
      } catch (Exception var22) {
      }

   }

   public void dj(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
      try {
         int var11 = -var3 / 2;
         int var12 = -var4 / 2;
         int var13 = (int)(Math.sin((double)var7 / 326.11) * 65536.0);
         int var14 = (int)(Math.cos((double)var7 / 326.11) * 65536.0);
         var13 = var13 * var8 >> 8;
         var14 = var14 * var8 >> 8;
         int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
         int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
         int var17 = var1 + var2 * ae;

         for(var2 = 0; var2 < var4; ++var2) {
            int var18 = var9[var2];
            int var19 = var17 + var18;
            int var20 = var15 + var14 * var18;
            int var21 = var16 - var13 * var18;

            for(var1 = -var10[var2]; var1 < 0; ++var1) {
               ad[var19++] = this.af[(var20 >> 16) + (var21 >> 16) * this.an];
               var20 += var14;
               var21 -= var13;
            }

            var15 += var13;
            var16 += var14;
            var17 += ae;
         }
      } catch (Exception var22) {
      }

   }

   public void dx(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
      try {
         int var11 = -var3 / 2;
         int var12 = -var4 / 2;
         int var13 = (int)(Math.sin((double)var7 / 326.11) * 65536.0);
         int var14 = (int)(Math.cos((double)var7 / 326.11) * 65536.0);
         var13 = var13 * var8 >> 8;
         var14 = var14 * var8 >> 8;
         int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
         int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
         int var17 = var1 + var2 * ae;

         for(var2 = 0; var2 < var4; ++var2) {
            int var18 = var9[var2];
            int var19 = var17 + var18;
            int var20 = var15 + var14 * var18;
            int var21 = var16 - var13 * var18;

            for(var1 = -var10[var2]; var1 < 0; ++var1) {
               ad[var19++] = this.af[(var20 >> 16) + (var21 >> 16) * this.an];
               var20 += var14;
               var21 -= var13;
            }

            var15 += var13;
            var16 += var14;
            var17 += ae;
         }
      } catch (Exception var22) {
      }

   }

   public void dn(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         int var10 = -var3 / 2;
         int var11 = -var4 / 2;
         int var12 = (int)(Math.sin(var7) * 65536.0);
         int var13 = (int)(Math.cos(var7) * 65536.0);
         var12 = var12 * var9 >> 8;
         var13 = var13 * var9 >> 8;
         int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
         int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
         int var16 = var1 + var2 * ae;

         for(var2 = 0; var2 < var4; ++var2) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for(var1 = -var3; var1 < 0; ++var1) {
               int var20 = this.af[(var18 >> 16) + (var19 >> 16) * this.an];
               if (var20 != 0) {
                  ad[var17++] = var20;
               } else {
                  ++var17;
               }

               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += ae;
         }
      } catch (Exception var21) {
      }

   }

   public void bx(int var1, int var2, int var3, int var4) {
      this.bo(this.ab << 3, this.aq << 3, var1 << 4, var2 << 4, var3, var4);
   }

   public void ds(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         int var10 = -var3 / 2;
         int var11 = -var4 / 2;
         int var12 = (int)(Math.sin(var7) * 65536.0);
         int var13 = (int)(Math.cos(var7) * 65536.0);
         var12 = var12 * var9 >> 8;
         var13 = var13 * var9 >> 8;
         int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
         int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
         int var16 = var1 + var2 * ae;

         for(var2 = 0; var2 < var4; ++var2) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for(var1 = -var3; var1 < 0; ++var1) {
               int var20 = this.af[(var18 >> 16) + (var19 >> 16) * this.an];
               if (var20 != 0) {
                  ad[var17++] = var20;
               } else {
                  ++var17;
               }

               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += ae;
         }
      } catch (Exception var21) {
      }

   }

   public void da(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         int var10 = -var3 / 2;
         int var11 = -var4 / 2;
         int var12 = (int)(Math.sin(var7) * 65536.0);
         int var13 = (int)(Math.cos(var7) * 65536.0);
         var12 = var12 * var9 >> 8;
         var13 = var13 * var9 >> 8;
         int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
         int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
         int var16 = var1 + var2 * ae;

         for(var2 = 0; var2 < var4; ++var2) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for(var1 = -var3; var1 < 0; ++var1) {
               int var20 = this.af[(var18 >> 16) + (var19 >> 16) * this.an];
               if (var20 != 0) {
                  ad[var17++] = var20;
               } else {
                  ++var17;
               }

               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += ae;
         }
      } catch (Exception var21) {
      }

   }

   public void du(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      int var9 = var2 < 0 ? -var2 : 0;
      int var10 = var2 + this.aw <= var6 ? this.aw : var6 - var2;
      int var11 = var1 < 0 ? -var1 : 0;
      int var10000;
      if (var1 + this.an <= var5) {
         var10000 = this.an;
      } else {
         var10000 = var5 - var1;
      }

      int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * ae;
      int var14 = var2 + var9;

      for(int var15 = var9; var15 < var10; ++var15) {
         int var16 = var7[var14];
         int var17 = var8[var14++];
         int var18 = var13;
         int var19;
         if (var1 < var16) {
            var19 = var16 - var1;
            var18 = var13 + (var19 - var11);
         } else {
            var19 = var11;
         }

         int var12;
         if (var1 + this.an <= var16 + var17) {
            var12 = this.an;
         } else {
            var12 = var16 + var17 - var1;
         }

         for(int var20 = var19; var20 < var12; ++var20) {
            int var21 = this.af[var20 + var15 * this.an];
            if (var21 != 0) {
               ad[var18++] = var21;
            } else {
               ++var18;
            }
         }

         var13 += ae;
      }

   }

   static void dz(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      for(int var16 = var3; var8 < 0; ++var8) {
         var7 = (var9 >> 16) * var15;

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if (var0 != 0) {
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var16;
         var10 += var11;
      }

   }

   void eq(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 != 0) {
         var1 -= this.ac << 4;
         var2 -= this.au << 4;
         double var7 = (double)(var5 & '\uffff') * 9.587379924285257E-5;
         int var9 = (int)Math.floor(Math.sin(var7) * (double)var6 + 0.5);
         int var10 = (int)Math.floor(Math.cos(var7) * (double)var6 + 0.5);
         int var11 = -var1 * var10 + -var2 * var9;
         int var12 = -(-var1) * var9 + -var2 * var10;
         int var13 = ((this.an << 4) - var1) * var10 + -var2 * var9;
         int var14 = -((this.an << 4) - var1) * var9 + -var2 * var10;
         int var15 = -var1 * var10 + ((this.aw << 4) - var2) * var9;
         int var16 = -(-var1) * var9 + ((this.aw << 4) - var2) * var10;
         int var17 = ((this.an << 4) - var1) * var10 + ((this.aw << 4) - var2) * var9;
         int var18 = -((this.an << 4) - var1) * var9 + ((this.aw << 4) - var2) * var10;
         int var19;
         int var20;
         if (var11 < var13) {
            var19 = var11;
            var20 = var13;
         } else {
            var19 = var13;
            var20 = var11;
         }

         if (var15 < var19) {
            var19 = var15;
         }

         if (var17 < var19) {
            var19 = var17;
         }

         if (var15 > var20) {
            var20 = var15;
         }

         if (var17 > var20) {
            var20 = var17;
         }

         int var21;
         int var22;
         if (var12 < var14) {
            var21 = var12;
            var22 = var14;
         } else {
            var21 = var14;
            var22 = var12;
         }

         if (var16 < var21) {
            var21 = var16;
         }

         if (var18 < var21) {
            var21 = var18;
         }

         if (var16 > var22) {
            var22 = var16;
         }

         if (var18 > var22) {
            var22 = var18;
         }

         var19 >>= 12;
         var20 = var20 + 4095 >> 12;
         var21 >>= 12;
         var22 = var22 + 4095 >> 12;
         var19 += var3;
         var20 += var3;
         var21 += var4;
         var22 += var4;
         var19 >>= 4;
         var20 = var20 + 15 >> 4;
         var21 >>= 4;
         var22 = var22 + 15 >> 4;
         if (var19 < bk) {
            var19 = bk;
         }

         if (var20 > bx) {
            var20 = bx;
         }

         if (var21 < bi) {
            var21 = bi;
         }

         if (var22 > be) {
            var22 = be;
         }

         var20 = var19 - var20;
         if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
               int var23 = var21 * ae + var19;
               double var24 = 1.6777216E7 / (double)var6;
               int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
               int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
               int var28 = (var19 << 4) + 8 - var3;
               int var29 = (var21 << 4) + 8 - var4;
               int var30 = (var1 << 8) - (var29 * var26 >> 4);
               int var31 = (var2 << 8) + (var29 * var27 >> 4);
               int var32;
               int var33;
               int var34;
               int var35;
               int var36;
               int var37;
               int var38;
               if (var27 == 0) {
                  if (var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += ae) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31;
                        var37 = var20;
                        if (var30 >= 0 && var31 >= 0 && var30 - (this.an << 12) < 0 && var31 - (this.aw << 12) < 0) {
                           for(; var37 < 0; ++var37) {
                              var38 = this.af[(var36 >> 12) * this.an + (var35 >> 12)];
                              if (var38 != 0) {
                                 ad[var34++] = var38;
                              } else {
                                 ++var34;
                              }
                           }
                        }

                        ++var33;
                     }
                  } else if (var26 < 0) {
                     for(var33 = var22; var33 < 0; var23 += ae) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if (var30 >= 0 && var30 - (this.an << 12) < 0) {
                           if ((var32 = var36 - (this.aw << 12)) >= 0) {
                              var32 = (var26 - var32) / var26;
                              var37 = var20 + var32;
                              var36 += var26 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (var36 - var26) / var26) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.af[(var36 >> 12) * this.an + (var35 >> 12)];
                              if (var38 != 0) {
                                 ad[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var36 += var26;
                              ++var37;
                           }
                        }

                        ++var33;
                        var30 -= var26;
                     }
                  } else {
                     for(var33 = var22; var33 < 0; var23 += ae) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if (var30 >= 0 && var30 - (this.an << 12) < 0) {
                           if (var36 < 0) {
                              var32 = (var26 - 1 - var36) / var26;
                              var37 = var20 + var32;
                              var36 += var26 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (1 + var36 - (this.aw << 12) - var26) / var26) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.af[(var36 >> 12) * this.an + (var35 >> 12)];
                              if (var38 != 0) {
                                 ad[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var36 += var26;
                              ++var37;
                           }
                        }

                        ++var33;
                        var30 -= var26;
                     }
                  }
               } else if (var27 < 0) {
                  if (var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += ae) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31;
                        var37 = var20;
                        if (var31 >= 0 && var31 - (this.aw << 12) < 0) {
                           if ((var32 = var35 - (this.an << 12)) >= 0) {
                              var32 = (var27 - var32) / var27;
                              var37 = var20 + var32;
                              var35 += var27 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (var35 - var27) / var27) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.af[(var36 >> 12) * this.an + (var35 >> 12)];
                              if (var38 != 0) {
                                 ad[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var35 += var27;
                              ++var37;
                           }
                        }

                        ++var33;
                        var31 += var27;
                     }
                  } else if (var26 < 0) {
                     for(var33 = var22; var33 < 0; var23 += ae) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if ((var32 = var35 - (this.an << 12)) >= 0) {
                           var32 = (var27 - var32) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (var35 - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        if ((var32 = var36 - (this.aw << 12)) >= 0) {
                           var32 = (var26 - var32) / var26;
                           var37 += var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 += var32;
                        }

                        if ((var32 = (var36 - var26) / var26) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.af[(var36 >> 12) * this.an + (var35 >> 12)];
                           if (var38 != 0) {
                              ad[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           var36 += var26;
                           ++var37;
                        }

                        ++var33;
                        var30 -= var26;
                        var31 += var27;
                     }
                  } else {
                     for(var33 = var22; var33 < 0; var23 += ae) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if ((var32 = var35 - (this.an << 12)) >= 0) {
                           var32 = (var27 - var32) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (var35 - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        if (var36 < 0) {
                           var32 = (var26 - 1 - var36) / var26;
                           var37 += var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 += var32;
                        }

                        if ((var32 = (1 + var36 - (this.aw << 12) - var26) / var26) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.af[(var36 >> 12) * this.an + (var35 >> 12)];
                           if (var38 != 0) {
                              ad[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           var36 += var26;
                           ++var37;
                        }

                        ++var33;
                        var30 -= var26;
                        var31 += var27;
                     }
                  }
               } else if (var26 == 0) {
                  for(var33 = var22; var33 < 0; var23 += ae) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31;
                     var37 = var20;
                     if (var31 >= 0 && var31 - (this.aw << 12) < 0) {
                        if (var35 < 0) {
                           var32 = (var27 - 1 - var35) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (1 + var35 - (this.an << 12) - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.af[(var36 >> 12) * this.an + (var35 >> 12)];
                           if (var38 != 0) {
                              ad[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           ++var37;
                        }
                     }

                     ++var33;
                     var31 += var27;
                  }
               } else if (var26 < 0) {
                  for(var33 = var22; var33 < 0; var23 += ae) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31 + (var28 * var26 >> 4);
                     var37 = var20;
                     if (var35 < 0) {
                        var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     if ((var32 = (1 + var35 - (this.an << 12) - var27) / var27) > var37) {
                        var37 = var32;
                     }

                     if ((var32 = var36 - (this.aw << 12)) >= 0) {
                        var32 = (var26 - var32) / var26;
                        var37 += var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 += var32;
                     }

                     if ((var32 = (var36 - var26) / var26) > var37) {
                        var37 = var32;
                     }

                     while(var37 < 0) {
                        var38 = this.af[(var36 >> 12) * this.an + (var35 >> 12)];
                        if (var38 != 0) {
                           ad[var34++] = var38;
                        } else {
                           ++var34;
                        }

                        var35 += var27;
                        var36 += var26;
                        ++var37;
                     }

                     ++var33;
                     var30 -= var26;
                     var31 += var27;
                  }
               } else {
                  for(var33 = var22; var33 < 0; var23 += ae) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31 + (var28 * var26 >> 4);
                     var37 = var20;
                     if (var35 < 0) {
                        var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     if ((var32 = (1 + var35 - (this.an << 12) - var27) / var27) > var37) {
                        var37 = var32;
                     }

                     if (var36 < 0) {
                        var32 = (var26 - 1 - var36) / var26;
                        var37 += var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 += var32;
                     }

                     if ((var32 = (1 + var36 - (this.aw << 12) - var26) / var26) > var37) {
                        var37 = var32;
                     }

                     while(var37 < 0) {
                        var38 = this.af[(var36 >> 12) * this.an + (var35 >> 12)];
                        if (var38 != 0) {
                           ad[var34++] = var38;
                        } else {
                           ++var34;
                        }

                        var35 += var27;
                        var36 += var26;
                        ++var37;
                     }

                     ++var33;
                     var30 -= var26;
                     var31 += var27;
                  }
               }

            }
         }
      }
   }

   void et(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 != 0) {
         var1 -= this.ac << 4;
         var2 -= this.au << 4;
         double var7 = (double)(var5 & 1066722367) * 9.587379924285257E-5;
         int var9 = (int)Math.floor(Math.sin(var7) * (double)var6 + 0.5);
         int var10 = (int)Math.floor(Math.cos(var7) * (double)var6 + 0.5);
         int var11 = -var1 * var10 + -var2 * var9;
         int var12 = -(-var1) * var9 + -var2 * var10;
         int var13 = ((this.an << 4) - var1) * var10 + -var2 * var9;
         int var14 = -((this.an << 4) - var1) * var9 + -var2 * var10;
         int var15 = -var1 * var10 + ((this.aw << 4) - var2) * var9;
         int var16 = -(-var1) * var9 + ((this.aw << 4) - var2) * var10;
         int var17 = ((this.an << 4) - var1) * var10 + ((this.aw << 4) - var2) * var9;
         int var18 = -((this.an << 4) - var1) * var9 + ((this.aw << 4) - var2) * var10;
         int var19;
         int var20;
         if (var11 < var13) {
            var19 = var11;
            var20 = var13;
         } else {
            var19 = var13;
            var20 = var11;
         }

         if (var15 < var19) {
            var19 = var15;
         }

         if (var17 < var19) {
            var19 = var17;
         }

         if (var15 > var20) {
            var20 = var15;
         }

         if (var17 > var20) {
            var20 = var17;
         }

         int var21;
         int var22;
         if (var12 < var14) {
            var21 = var12;
            var22 = var14;
         } else {
            var21 = var14;
            var22 = var12;
         }

         if (var16 < var21) {
            var21 = var16;
         }

         if (var18 < var21) {
            var21 = var18;
         }

         if (var16 > var22) {
            var22 = var16;
         }

         if (var18 > var22) {
            var22 = var18;
         }

         var19 >>= 12;
         var20 = var20 + 4095 >> 12;
         var21 >>= 12;
         var22 = var22 + -457404483 >> 12;
         var19 += var3;
         var20 += var3;
         var21 += var4;
         var22 += var4;
         var19 >>= 4;
         var20 = var20 + 15 >> 4;
         var21 >>= 4;
         var22 = var22 + 15 >> 4;
         if (var19 < bk) {
            var19 = bk;
         }

         if (var20 > bx) {
            var20 = bx;
         }

         if (var21 < bi) {
            var21 = bi;
         }

         if (var22 > be) {
            var22 = be;
         }

         var20 = var19 - var20;
         if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
               int var23 = var21 * ae + var19;
               double var24 = 1.6777216E7 / (double)var6;
               int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
               int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
               int var28 = (var19 << 4) + 8 - var3;
               int var29 = (var21 << 4) + 8 - var4;
               int var30 = (var1 << 8) - (var29 * var26 >> 4);
               int var31 = (var2 << 8) + (var29 * var27 >> 4);
               int var32;
               int var33;
               int var34;
               int var35;
               int var36;
               int var37;
               int var38;
               if (var27 == 0) {
                  if (var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += ae) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31;
                        var37 = var20;
                        if (var30 >= 0 && var31 >= 0 && var30 - (this.an << 12) < 0 && var31 - (this.aw << 12) < 0) {
                           for(; var37 < 0; ++var37) {
                              var38 = this.af[(var36 >> 12) * this.an + (var35 >> 12)];
                              if (var38 != 0) {
                                 ad[var34++] = var38;
                              } else {
                                 ++var34;
                              }
                           }
                        }

                        ++var33;
                     }
                  } else if (var26 < 0) {
                     for(var33 = var22; var33 < 0; var23 += ae) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if (var30 >= 0 && var30 - (this.an << 12) < 0) {
                           if ((var32 = var36 - (this.aw << 12)) >= 0) {
                              var32 = (var26 - var32) / var26;
                              var37 = var20 + var32;
                              var36 += var26 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (var36 - var26) / var26) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.af[(var36 >> 12) * this.an + (var35 >> 12)];
                              if (var38 != 0) {
                                 ad[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var36 += var26;
                              ++var37;
                           }
                        }

                        ++var33;
                        var30 -= var26;
                     }
                  } else {
                     for(var33 = var22; var33 < 0; var23 += ae) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if (var30 >= 0 && var30 - (this.an << 12) < 0) {
                           if (var36 < 0) {
                              var32 = (var26 - 1 - var36) / var26;
                              var37 = var20 + var32;
                              var36 += var26 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (1 + var36 - (this.aw << 12) - var26) / var26) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.af[(var36 >> 12) * this.an + (var35 >> 12)];
                              if (var38 != 0) {
                                 ad[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var36 += var26;
                              ++var37;
                           }
                        }

                        ++var33;
                        var30 -= var26;
                     }
                  }
               } else if (var27 < 0) {
                  if (var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += ae) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31;
                        var37 = var20;
                        if (var31 >= 0 && var31 - (this.aw << 12) < 0) {
                           if ((var32 = var35 - (this.an << 12)) >= 0) {
                              var32 = (var27 - var32) / var27;
                              var37 = var20 + var32;
                              var35 += var27 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (var35 - var27) / var27) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.af[(var36 >> 12) * this.an + (var35 >> 12)];
                              if (var38 != 0) {
                                 ad[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var35 += var27;
                              ++var37;
                           }
                        }

                        ++var33;
                        var31 += var27;
                     }
                  } else if (var26 < 0) {
                     for(var33 = var22; var33 < 0; var23 += ae) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if ((var32 = var35 - (this.an << 12)) >= 0) {
                           var32 = (var27 - var32) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (var35 - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        if ((var32 = var36 - (this.aw << 12)) >= 0) {
                           var32 = (var26 - var32) / var26;
                           var37 += var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 += var32;
                        }

                        if ((var32 = (var36 - var26) / var26) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.af[(var36 >> 12) * this.an + (var35 >> 12)];
                           if (var38 != 0) {
                              ad[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           var36 += var26;
                           ++var37;
                        }

                        ++var33;
                        var30 -= var26;
                        var31 += var27;
                     }
                  } else {
                     for(var33 = var22; var33 < 0; var23 += ae) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if ((var32 = var35 - (this.an << 12)) >= 0) {
                           var32 = (var27 - var32) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (var35 - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        if (var36 < 0) {
                           var32 = (var26 - 1 - var36) / var26;
                           var37 += var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 += var32;
                        }

                        if ((var32 = (1 + var36 - (this.aw << 12) - var26) / var26) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.af[(var36 >> 12) * this.an + (var35 >> 12)];
                           if (var38 != 0) {
                              ad[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           var36 += var26;
                           ++var37;
                        }

                        ++var33;
                        var30 -= var26;
                        var31 += var27;
                     }
                  }
               } else if (var26 == 0) {
                  for(var33 = var22; var33 < 0; var23 += ae) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31;
                     var37 = var20;
                     if (var31 >= 0 && var31 - (this.aw << 12) < 0) {
                        if (var35 < 0) {
                           var32 = (var27 - 1 - var35) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (1 + var35 - (this.an << 12) - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.af[(var36 >> 12) * this.an + (var35 >> 12)];
                           if (var38 != 0) {
                              ad[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           ++var37;
                        }
                     }

                     ++var33;
                     var31 += var27;
                  }
               } else if (var26 < 0) {
                  for(var33 = var22; var33 < 0; var23 += ae) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31 + (var28 * var26 >> 4);
                     var37 = var20;
                     if (var35 < 0) {
                        var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     if ((var32 = (1 + var35 - (this.an << 12) - var27) / var27) > var37) {
                        var37 = var32;
                     }

                     if ((var32 = var36 - (this.aw << 12)) >= 0) {
                        var32 = (var26 - var32) / var26;
                        var37 += var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 += var32;
                     }

                     if ((var32 = (var36 - var26) / var26) > var37) {
                        var37 = var32;
                     }

                     while(var37 < 0) {
                        var38 = this.af[(var36 >> 12) * this.an + (var35 >> 12)];
                        if (var38 != 0) {
                           ad[var34++] = var38;
                        } else {
                           ++var34;
                        }

                        var35 += var27;
                        var36 += var26;
                        ++var37;
                     }

                     ++var33;
                     var30 -= var26;
                     var31 += var27;
                  }
               } else {
                  for(var33 = var22; var33 < 0; var23 += ae) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31 + (var28 * var26 >> 4);
                     var37 = var20;
                     if (var35 < 0) {
                        var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     if ((var32 = (1 + var35 - (this.an << 12) - var27) / var27) > var37) {
                        var37 = var32;
                     }

                     if (var36 < 0) {
                        var32 = (var26 - 1 - var36) / var26;
                        var37 += var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 += var32;
                     }

                     if ((var32 = (1 + var36 - (this.aw << 12) - var26) / var26) > var37) {
                        var37 = var32;
                     }

                     while(var37 < 0) {
                        var38 = this.af[(var36 >> 12) * this.an + (var35 >> 12)];
                        if (var38 != 0) {
                           ad[var34++] = var38;
                        } else {
                           ++var34;
                        }

                        var35 += var27;
                        var36 += var26;
                        ++var37;
                     }

                     ++var33;
                     var30 -= var26;
                     var31 += var27;
                  }
               }

            }
         }
      }
   }

   public void ef(int var1, int var2, int var3, int var4) {
      if (var3 <= this.ab && var4 <= this.aq) {
         int var5 = var1 + this.ac * var3 / this.ab;
         int var6 = var1 + ((this.ac + this.an) * var3 + this.ab - 1) / this.ab;
         int var7 = var2 + this.au * var4 / this.aq;
         int var8 = var2 + ((this.au + this.aw) * var4 + this.aq - 1) / this.aq;
         if (var5 < bk) {
            var5 = bk;
         }

         if (var6 > bx) {
            var6 = bx;
         }

         if (var7 < bi) {
            var7 = bi;
         }

         if (var8 > be) {
            var8 = be;
         }

         if (var5 < var6 && var7 < var8) {
            int var9 = var7 * ae + var5;
            int var10 = ae - (var6 - var5);
            if (var9 < ad.length) {
               for(int var11 = var7; var11 < var8; ++var11) {
                  for(int var12 = var5; var12 < var6; ++var12) {
                     int var13 = var12 - var1 << 4;
                     int var14 = var11 - var2 << 4;
                     int var15 = var13 * this.ab / var3 - (this.ac << 4);
                     int var16 = (var13 + 16) * this.ab / var3 - (this.ac << 4);
                     int var17 = var14 * this.aq / var4 - (this.au << 4);
                     int var18 = (var14 + 16) * this.aq / var4 - (this.au << 4);
                     int var19 = (var16 - var15) * (var18 - var17) >> 1;
                     if (var19 != 0) {
                        if (var15 < 0) {
                           var15 = 0;
                        }

                        if (var16 >= this.an << 4) {
                           var16 = this.an << 4;
                        }

                        if (var17 < 0) {
                           var17 = 0;
                        }

                        if (var18 >= this.aw << 4) {
                           var18 = this.aw << 4;
                        }

                        --var16;
                        --var18;
                        int var20 = 16 - (var15 & 15);
                        int var21 = (var16 & 15) + 1;
                        int var22 = 16 - (var17 & 15);
                        int var23 = (var18 & 15) + 1;
                        var15 >>= 4;
                        var16 >>= 4;
                        var17 >>= 4;
                        var18 >>= 4;
                        int var24 = 0;
                        int var25 = 0;
                        int var26 = 0;
                        int var27 = 0;

                        int var28;
                        for(var28 = var17; var28 <= var18; ++var28) {
                           int var29 = 16;
                           if (var28 == var17) {
                              var29 = var22;
                           }

                           if (var28 == var18) {
                              var29 = var23;
                           }

                           for(int var30 = var15; var30 <= var16; ++var30) {
                              int var31 = this.af[var28 * this.an + var30];
                              if (var31 != 0) {
                                 int var32;
                                 if (var30 == var15) {
                                    var32 = var29 * var20;
                                 } else if (var30 == var16) {
                                    var32 = var29 * var21;
                                 } else {
                                    var32 = var29 << 4;
                                 }

                                 var27 += var32;
                                 var24 += (var31 >> 16 & 255) * var32;
                                 var25 += (var31 >> 8 & 255) * var32;
                                 var26 += (var31 & 255) * var32;
                              }
                           }
                        }

                        if (var27 >= var19) {
                           var28 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
                           if (var28 == 0) {
                              var28 = 1;
                           }

                           ad[var9] = var28;
                        }

                        ++var9;
                     }
                  }

                  var9 += var10;
               }

            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void eo(int var1, int var2, int var3, int var4) {
      this.bo(this.ab << 3, this.aq << 3, var1 << 4, var2 << 4, var3, var4);
   }
}
