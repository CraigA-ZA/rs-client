import accessors.RSScene;

public class ie implements RSScene {
   static int bo = 0;
   public static final int cn = 9;
   int aw;
   int ac;
   int[][][] au;
   is[][][] ab;
   int al = 0;
   public static boolean af = true;
   jj[] at = new jj[5000];
   int[][][] aa;
   static final int ax = 25;
   static final int ao = 64;
   static final int[] bw;
   static ip[] bq;
   int aq = 0;
   static int ah = 0;
   static int av;
   static int ar;
   static int am;
   static int as;
   static int aj;
   static int ak;
   static int az;
   static final int[] bh;
   static final int[] ce;
   static int ap;
   static final int ay = 128;
   static int ae;
   static int bi;
   static int be;
   static jj[] bk = new jj[100];
   public static final int cs = 383;
   int[][] ca = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
   static int bz = 0;
   static int bm = 0;
   public static int bd = -1;
   public static int bt = -1;
   static boolean bj = false;
   static final int bn = 32;
   static final int[] bp;
   static int br = 4;
   static int[] bg;
   static ip[][] bu;
   static boolean bx = false;
   static int bb;
   static nh ba;
   static final int[] bv;
   static final int[] bl;
   static int by;
   static final int[] bc;
   static final int bs = 128;
   static int ad;
   static int cr;
   public static final int ci = 128;
   static final int ai = 50;
   public static final int cc = 32;
   static int ag = 0;
   static int bf;
   int[][] cu = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
   static boolean[][][][] ck;
   static boolean[][] cq;
   static int cm;
   static int cf;
   static int cl;
   static int cg;
   int an;
   static int cy;

   boolean gj(int var1, int var2, int var3) {
      int var4 = this.aa[var1][var2][var3];
      if (var4 == -av) {
         return false;
      } else if (var4 == av) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.ce(var5 + 1, this.au[var1][var2][var3], var6 + 1) && this.ce(var5 + 128 - 1, this.au[var1][var2 + 1][var3], var6 + 1) && this.ce(var5 + 658257598 - 1, this.au[var1][var2 + 1][var3 + 1], var6 + -2054709403 - 1) && this.ce(var5 + 1, this.au[var1][var2][var3 + 1], var6 + -332476788 - 1)) {
            this.aa[var1][var2][var3] = av;
            return true;
         } else {
            this.aa[var1][var2][var3] = -av;
            return false;
         }
      }
   }

   public boolean ax(int var1, int var2, int var3, int var4, int var5, iv var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null ? true : this.ai(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   public void dj(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      if (var4 != null) {
         var4.aa = null;
      }
   }

   boolean bp(int var1, int var2, int var3) {
      int var4 = this.aa[var1][var2][var3];
      if (var4 == -av) {
         return false;
      } else if (var4 == av) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.ce(var5 + 1, this.au[var1][var2][var3], var6 + 1) && this.ce(var5 + 128 - 1, this.au[var1][var2 + 1][var3], var6 + 1) && this.ce(var5 + 128 - 1, this.au[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.ce(var5 + 1, this.au[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.aa[var1][var2][var3] = av;
            return true;
         } else {
            this.aa[var1][var2][var3] = -av;
            return false;
         }
      }
   }

   public static void ac(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      ip var8 = new ip();
      var8.af = var2 / 128 * 2125806217;
      var8.an = var3 / 128 * -2141622931;
      var8.aw = var4 / 128 * -1507898379;
      var8.ac = var5 / 128 * 1022688161;
      var8.au = var1 * -1065960575;
      var8.ab = var2 * 2126671529;
      var8.aq = var3 * 385880973;
      var8.al = var4 * 582998597;
      var8.at = var5 * 495746131;
      var8.aa = var6 * 903512679;
      var8.ay = var7 * -1329473239;
      bu[var0][bg[var0]++] = var8;
   }

   public void au(int var1, int var2, int var3, int var4) {
      is var5 = this.ab[var1][var2][var3];
      if (var5 != null) {
         this.ab[var1][var2][var3].ag = var4 * -2078731195;
      }
   }

   public void ab(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      jc var21;
      int var22;
      if (var4 == 0) {
         var21 = new jc(var11, var12, var13, var14, -1, var19, false);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.ab[var22][var2][var3] == null) {
               this.ab[var22][var2][var3] = new is(var22, var2, var3);
            }
         }

         this.ab[var1][var2][var3].au = var21;
      } else if (var4 != 1) {
         ij var23 = new ij(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.ab[var22][var2][var3] == null) {
               this.ab[var22][var2][var3] = new is(var22, var2, var3);
            }
         }

         this.ab[var1][var2][var3].ab = var23;
      } else {
         var21 = new jc(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.ab[var22][var2][var3] == null) {
               this.ab[var22][var2][var3] = new is(var22, var2, var3);
            }
         }

         this.ab[var1][var2][var3].au = var21;
      }
   }

   public void aq(int var1, int var2, int var3, int var4, iv var5, long var6, int var8) {
      if (var5 != null) {
         ig var9 = new ig();
         var9.ac = var5;
         var9.an = var2 * -1191266432 + -595633216;
         var9.aw = var3 * -136012928 + -68006464;
         var9.af = var4 * -317230161;
         var9.au = var6 * -4945803534983804595L;
         var9.ab = var8 * 1624352991;
         if (this.ab[var1][var2][var3] == null) {
            this.ab[var1][var2][var3] = new is(var1, var2, var3);
         }

         this.ab[var1][var2][var3].at = var9;
      }
   }

   public long es(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      if (var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.ay * -422028371; ++var5) {
            jj var6 = var4.ao[var5];
            if (eg.an(var6.ax * 5016412888503339625L) && var6.an * -1399711478 == var2 && var6.at * 2004902003 == var3) {
               return var6.ax * 5016412888503339625L;
            }
         }

         return 0L;
      }
   }

   public void at(int var1, int var2, int var3, int var4, iv var5, iv var6, int var7, int var8, long var9, int var11) {
      if (var5 != null || var6 != null) {
         jk var12 = new jk();
         var12.al = var9 * -1417919518333993033L;
         var12.at = var11 * -2009432563;
         var12.an = var2 * -1436186496 + 1429390400;
         var12.aw = var3 * 430510720 + 215255360;
         var12.af = var4 * 1266004207;
         var12.ab = var5;
         var12.aq = var6;
         var12.ac = var7 * 1547196561;
         var12.au = var8 * 185156955;

         for(int var13 = var1; var13 >= 0; --var13) {
            if (this.ab[var13][var2][var3] == null) {
               this.ab[var13][var2][var3] = new is(var13, var2, var3);
            }
         }

         this.ab[var1][var2][var3].aq = var12;
      }
   }

   public void aa(int var1, int var2, int var3, int var4, iv var5, iv var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      if (var5 != null) {
         je var14 = new je();
         var14.aa = var11 * -5837374244328004387L;
         var14.ay = var13 * -486021893;
         var14.aw = var2 * 571975552 + 285987776;
         var14.ac = var3 * 1599256960 + 799628480;
         var14.af = var4 * -33433415;
         var14.al = var5;
         var14.at = var6;
         var14.au = var7 * -1230454197;
         var14.ab = var8 * 1035196391;
         var14.an = var9 * -1372050943;
         var14.aq = var10 * -965136487;

         for(int var15 = var1; var15 >= 0; --var15) {
            if (this.ab[var15][var2][var3] == null) {
               this.ab[var15][var2][var3] = new is(var15, var2, var3);
            }
         }

         this.ab[var1][var2][var3].al = var14;
      }
   }

   public void cv(int var1, int var2, int var3, int var4, iv var5, long var6, int var8) {
      if (var5 != null) {
         ig var9 = new ig();
         var9.ac = var5;
         var9.an = var2 * -1191266432 + -595633216;
         var9.aw = var3 * -136012928 + -68006464;
         var9.af = var4 * -317230161;
         var9.au = var6 * -4945803534983804595L;
         var9.ab = var8 * 1624352991;
         if (this.ab[var1][var2][var3] == null) {
            this.ab[var1][var2][var3] = new is(var1, var2, var3);
         }

         this.ab[var1][var2][var3].at = var9;
      }
   }

   public boolean ao(int var1, int var2, int var3, int var4, int var5, iv var6, int var7, long var8, boolean var10) {
      if (var6 == null) {
         return true;
      } else {
         int var11 = var2 - var5;
         int var12 = var3 - var5;
         int var13 = var2 + var5;
         int var14 = var3 + var5;
         if (var10) {
            if (var7 > 640 && var7 < 1408) {
               var14 += 128;
            }

            if (var7 > 1152 && var7 < 1920) {
               var13 += 128;
            }

            if (var7 > 1664 || var7 < 384) {
               var12 -= 128;
            }

            if (var7 > 128 && var7 < 896) {
               var11 -= 128;
            }
         }

         var11 /= 128;
         var12 /= 128;
         var13 /= 128;
         var14 /= 128;
         return this.ai(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   static final int ft(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > -1820941636) {
         var1 = 126;
      }

      return (var0 & -1673542237) + var1;
   }

   boolean ai(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, iv var9, int var10, boolean var11, long var12, int var14) {
      int var16;
      for(int var15 = var2; var15 < var2 + var4; ++var15) {
         for(var16 = var3; var16 < var3 + var5; ++var16) {
            if (var15 < 0 || var16 < 0 || var15 >= this.aw || var16 >= this.ac) {
               return false;
            }

            is var17 = this.ab[var1][var15][var16];
            if (var17 != null && var17.ay * -422028371 >= 5) {
               return false;
            }
         }
      }

      jj var21 = new jj();
      var21.ax = var12 * 8415652607842018777L;
      var21.ai = var14 * -287536779;
      var21.af = var1 * -1695101227;
      var21.ac = var6 * -299460585;
      var21.au = var7 * -521982365;
      var21.aw = var8 * 1244562195;
      var21.ab = var9;
      var21.aq = var10 * -1843325159;
      var21.an = var2 * 843140103;
      var21.at = var3 * -700889925;
      var21.al = (var2 + var4 - 1) * 1300873191;
      var21.aa = (var3 + var5 - 1) * -1083409309;

      for(var16 = var2; var16 < var2 + var4; ++var16) {
         for(int var22 = var3; var22 < var3 + var5; ++var22) {
            int var18 = 0;
            if (var16 > var2) {
               ++var18;
            }

            if (var16 < var2 + var4 - 1) {
               var18 += 4;
            }

            if (var22 > var3) {
               var18 += 8;
            }

            if (var22 < var3 + var5 - 1) {
               var18 += 2;
            }

            for(int var19 = var1; var19 >= 0; --var19) {
               if (this.ab[var19][var16][var22] == null) {
                  this.ab[var19][var16][var22] = new is(var19, var16, var22);
               }
            }

            is var23 = this.ab[var1][var16][var22];
            var23.ao[var23.ay * -422028371] = var21;
            var23.ax[var23.ay * -422028371] = var18;
            var23.ai = (var23.ai * -1639156513 | var18) * -1238612193;
            var23.ay += 1425915941;
         }
      }

      if (var11) {
         this.at[this.al++] = var21;
      }

      return true;
   }

   public void ag() {
      for(int var1 = 0; var1 < this.al; ++var1) {
         jj var2 = this.at[var1];
         this.ah(var2);
         this.at[var1] = null;
      }

      this.al = 0;
   }

   void ah(jj var1) {
      for(int var2 = var1.an * 626811319; var2 <= var1.al * -1242897449; ++var2) {
         for(int var3 = var1.at * 2004902003; var3 <= var1.aa * -80616117; ++var3) {
            is var4 = this.ab[var1.af * -872547715][var2][var3];
            if (var4 != null) {
               int var5;
               for(var5 = 0; var5 < var4.ay * -422028371; ++var5) {
                  if (var4.ao[var5] == var1) {
                     var4.ay -= 1425915941;

                     for(int var6 = var5; var6 < var4.ay * -422028371; ++var6) {
                        var4.ao[var6] = var4.ao[var6 + 1];
                        var4.ax[var6] = var4.ax[var6 + 1];
                     }

                     var4.ao[var4.ay * -422028371] = null;
                     break;
                  }
               }

               var4.ai = 0;

               for(var5 = 0; var5 < var4.ay * -422028371; ++var5) {
                  var4.ai = (var4.ai * -1639156513 | var4.ax[var5]) * -1238612193;
               }
            }
         }
      }

   }

   public void aj(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      if (var4 != null) {
         var4.at = null;
      }
   }

   public void bg(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 >= this.aw * 128) {
         var1 = this.aw * 128 - 1;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 >= this.ac * 128) {
         var3 = this.ac * 128 - 1;
      }

      if (var4 < 128) {
         var4 = 128;
      } else if (var4 > 383) {
         var4 = 383;
      }

      ++av;
      by = in.ac[var4];
      bb = in.au[var4];
      bi = in.ac[var5];
      be = in.au[var5];
      cq = ck[(var4 - 128) / 32][var5 / 64];
      ad = var1;
      ae = var2;
      ap = var3;
      ak = var1 / 128;
      az = var3 / 128;
      ah = var6;
      ar = ak - 25;
      if (ar < 0) {
         ar = 0;
      }

      as = az - 25;
      if (as < 0) {
         as = 0;
      }

      am = ak + 25;
      if (am > this.aw) {
         am = this.aw;
      }

      aj = az + 25;
      if (aj > this.ac) {
         aj = this.ac;
      }

      this.bl();
      ag = 0;

      int var7;
      is[][] var8;
      int var9;
      int var10;
      for(var7 = this.aq; var7 < this.an; ++var7) {
         var8 = this.ab[var7];

         for(var9 = ar; var9 < am; ++var9) {
            for(var10 = as; var10 < aj; ++var10) {
               is var11 = var8[var9][var10];
               if (var11 != null) {
                  if (var11.ag * 65855117 > var6 || !cq[var9 - ak + 25][var10 - az + 25] && this.au[var7][var9][var10] - var2 < 2000) {
                     var11.ah = false;
                     var11.av = false;
                     var11.am = 0;
                  } else {
                     var11.ah = true;
                     var11.av = true;
                     if (var11.ay * -422028371 > 0) {
                        var11.ar = true;
                     } else {
                        var11.ar = false;
                     }

                     ++ag;
                  }
               }
            }
         }
      }

      int var12;
      int var13;
      int var14;
      is var15;
      int var16;
      for(var7 = this.aq; var7 < this.an; ++var7) {
         var8 = this.ab[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = ak + var9;
            var16 = ak - var9;
            if (var10 >= ar || var16 < am) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = az + var12;
                  var14 = az - var12;
                  if (var10 >= ar) {
                     if (var13 >= as) {
                        var15 = var8[var10][var13];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, true);
                        }
                     }

                     if (var14 < aj) {
                        var15 = var8[var10][var14];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, true);
                        }
                     }
                  }

                  if (var16 < am) {
                     if (var13 >= as) {
                        var15 = var8[var16][var13];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, true);
                        }
                     }

                     if (var14 < aj) {
                        var15 = var8[var16][var14];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, true);
                        }
                     }
                  }

                  if (ag == 0) {
                     bx = false;
                     return;
                  }
               }
            }
         }
      }

      for(var7 = this.aq; var7 < this.an; ++var7) {
         var8 = this.ab[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = ak + var9;
            var16 = ak - var9;
            if (var10 >= ar || var16 < am) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = az + var12;
                  var14 = az - var12;
                  if (var10 >= ar) {
                     if (var13 >= as) {
                        var15 = var8[var10][var13];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, false);
                        }
                     }

                     if (var14 < aj) {
                        var15 = var8[var10][var14];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, false);
                        }
                     }
                  }

                  if (var16 < am) {
                     if (var13 >= as) {
                        var15 = var8[var16][var13];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, false);
                        }
                     }

                     if (var14 < aj) {
                        var15 = var8[var16][var14];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, false);
                        }
                     }
                  }

                  if (ag == 0) {
                     bx = false;
                     return;
                  }
               }
            }
         }
      }

      bx = false;
   }

   public void bn() {
      bj = true;
   }

   public void as(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      if (var4 != null) {
         for(int var5 = 0; var5 < var4.ay * -422028371; ++var5) {
            jj var6 = var4.ao[var5];
            if (eg.an(var6.ax * 5016412888503339625L) && var6.an * 626811319 == var2 && var6.at * 2004902003 == var3) {
               this.ah(var6);
               return;
            }
         }

      }
   }

   boolean do(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, iv var9, int var10, boolean var11, long var12, int var14) {
      int var16;
      for(int var15 = var2; var15 < var2 + var4; ++var15) {
         for(var16 = var3; var16 < var3 + var5; ++var16) {
            if (var15 < 0 || var16 < 0 || var15 >= this.aw || var16 >= this.ac) {
               return false;
            }

            is var17 = this.ab[var1][var15][var16];
            if (var17 != null && var17.ay * -422028371 >= 5) {
               return false;
            }
         }
      }

      jj var21 = new jj();
      var21.ax = var12 * 8415652607842018777L;
      var21.ai = var14 * 1038925846;
      var21.af = var1 * -1695101227;
      var21.ac = var6 * -299460585;
      var21.au = var7 * -521982365;
      var21.aw = var8 * 1244562195;
      var21.ab = var9;
      var21.aq = var10 * -1843325159;
      var21.an = var2 * 843140103;
      var21.at = var3 * -700889925;
      var21.al = (var2 + var4 - 1) * 1300873191;
      var21.aa = (var3 + var5 - 1) * 1392281520;

      for(var16 = var2; var16 < var2 + var4; ++var16) {
         for(int var22 = var3; var22 < var3 + var5; ++var22) {
            int var18 = 0;
            if (var16 > var2) {
               ++var18;
            }

            if (var16 < var2 + var4 - 1) {
               var18 += 4;
            }

            if (var22 > var3) {
               var18 += 8;
            }

            if (var22 < var3 + var5 - 1) {
               var18 += 2;
            }

            for(int var19 = var1; var19 >= 0; --var19) {
               if (this.ab[var19][var16][var22] == null) {
                  this.ab[var19][var16][var22] = new is(var19, var16, var22);
               }
            }

            is var23 = this.ab[var1][var16][var22];
            var23.ao[var23.ay * 1046194590] = var21;
            var23.ax[var23.ay * -422028371] = var18;
            var23.ai = (var23.ai * -1639156513 | var18) * 498115489;
            var23.ay += 1425915941;
         }
      }

      if (var11) {
         this.at[this.al++] = var21;
      }

      return true;
   }

   public void dz(int var1, int var2, int var3, int var4) {
      is var5 = this.ab[var1][var2][var3];
      if (var5 != null) {
         je var6 = var5.al;
         if (var6 != null) {
            var6.an = var6.an * 1353438721 * var4 / 16 * -1372050943;
            var6.aq = var6.aq * 1573434537 * var4 / 16 * -965136487;
         }
      }
   }

   public jk az(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      return var4 == null ? null : var4.aq;
   }

   public je ad(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      return var4 == null ? null : var4.al;
   }

   void dt(jj var1) {
      for(int var2 = var1.an * 626811319; var2 <= var1.al * 1113773819; ++var2) {
         for(int var3 = var1.at * 2004902003; var3 <= var1.aa * -80616117; ++var3) {
            is var4 = this.ab[var1.af * -872547715][var2][var3];
            if (var4 != null) {
               int var5;
               for(var5 = 0; var5 < var4.ay * -422028371; ++var5) {
                  if (var4.ao[var5] == var1) {
                     var4.ay -= 1425915941;

                     for(int var6 = var5; var6 < var4.ay * -422028371; ++var6) {
                        var4.ao[var6] = var4.ao[var6 + 1];
                        var4.ax[var6] = var4.ax[var6 + 1];
                     }

                     var4.ao[var4.ay * -422028371] = null;
                     break;
                  }
               }

               var4.ai = 0;

               for(var5 = 0; var5 < var4.ay * -422028371; ++var5) {
                  var4.ai = (var4.ai * -1639156513 | var4.ax[var5]) * -213696756;
               }
            }
         }
      }

   }

   public ig ap(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      return var4 != null && var4.at != null ? var4.at : null;
   }

   public long by(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      return var4 != null && var4.aq != null ? var4.aq.al * -4009183385476919801L : 0L;
   }

   public long bb(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      return var4 != null && var4.al != null ? var4.al.aa * -4691380879163567243L : 0L;
   }

   public long bi(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      if (var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.ay * -422028371; ++var5) {
            jj var6 = var4.ao[var5];
            if (eg.an(var6.ax * 5016412888503339625L) && var6.an * 626811319 == var2 && var6.at * 2004902003 == var3) {
               return var6.ax * 5016412888503339625L;
            }
         }

         return 0L;
      }
   }

   public long be(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      return var4 != null && var4.at != null ? var4.at.au * 3423223696102332293L : 0L;
   }

   public jj ep(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      if (var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.ay * -422028371; ++var5) {
            jj var6 = var4.ao[var5];
            if (eg.an(var6.ax * 5016412888503339625L) && var6.an * -920887576 == var2 && var6.at * 541799336 == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   boolean gd(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < bf; ++var4) {
         ip var5 = bq[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if (var5.ao * -1146201804 == 1) {
            var6 = var5.ab * -1074260583 - var1;
            if (var6 > 0) {
               var7 = var5.al * 2051012724 + (var5.ag * 761956642 * var6 >> 8);
               var8 = var5.at * 1383802843 + (var5.ah * 1571181857 * var6 >> 8);
               var9 = var5.aa * 690846039 + (var5.av * -847323611 * var6 >> 8);
               var10 = var5.ay * 1879954201 + (var5.ar * -1860573287 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ao * 1250451487 == 2) {
            var6 = var1 - var5.ab * -98747816;
            if (var6 > 0) {
               var7 = var5.al * -1443747699 + (var5.ag * 1478538176 * var6 >> 8);
               var8 = var5.at * -1745415859 + (var5.ah * 1030915821 * var6 >> 8);
               var9 = var5.aa * 690846039 + (var5.av * -1283364048 * var6 >> 8);
               var10 = var5.ay * 1879954201 + (var5.ar * -283662079 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ao * -221071853 == 3) {
            var6 = var5.al * -1443747699 - var3;
            if (var6 > 0) {
               var7 = var5.ab * -956786524 + (var5.ax * 339968772 * var6 >> 8);
               var8 = var5.aq * -614027138 + (var5.ai * 382481141 * var6 >> 8);
               var9 = var5.aa * -870324701 + (var5.av * -847323611 * var6 >> 8);
               var10 = var5.ay * 1879954201 + (var5.ar * -283662079 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ao * -2053431965 == 4) {
            var6 = var3 - var5.al * -190482153;
            if (var6 > 0) {
               var7 = var5.ab * -1074260583 + (var5.ax * 998029161 * var6 >> 8);
               var8 = var5.aq * -975270845 + (var5.ai * -282079264 * var6 >> 8);
               var9 = var5.aa * 690846039 + (var5.av * -847323611 * var6 >> 8);
               var10 = var5.ay * 1879954201 + (var5.ar * 569233632 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ao * -221071853 == 5) {
            var6 = var2 - var5.aa * -2127231006;
            if (var6 > 0) {
               var7 = var5.ab * -1074260583 + (var5.ax * 679038114 * var6 >> 8);
               var8 = var5.aq * -875468987 + (var5.ai * 1202806695 * var6 >> 8);
               var9 = var5.al * -1443747699 + (var5.ag * -371961737 * var6 >> 8);
               var10 = var5.at * 1383802843 + (var5.ah * -1677346480 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   void bo(iz var1, int var2, int var3, int var4) {
      is var5;
      iz var6;
      if (var3 < this.aw) {
         var5 = this.ab[var2][var3 + 1][var4];
         if (var5 != null && var5.at != null && var5.at.ac instanceof iz) {
            var6 = (iz)var5.at.ac;
            iz.by(var1, var6, 128, 0, 0, true);
         }
      }

      if (var4 < this.aw) {
         var5 = this.ab[var2][var3][var4 + 1];
         if (var5 != null && var5.at != null && var5.at.ac instanceof iz) {
            var6 = (iz)var5.at.ac;
            iz.by(var1, var6, 0, 0, 128, true);
         }
      }

      if (var3 < this.aw && var4 < this.ac) {
         var5 = this.ab[var2][var3 + 1][var4 + 1];
         if (var5 != null && var5.at != null && var5.at.ac instanceof iz) {
            var6 = (iz)var5.at.ac;
            iz.by(var1, var6, 128, 0, 128, true);
         }
      }

      if (var3 < this.aw && var4 > 0) {
         var5 = this.ab[var2][var3 + 1][var4 - 1];
         if (var5 != null && var5.at != null && var5.at.ac instanceof iz) {
            var6 = (iz)var5.at.ac;
            iz.by(var1, var6, 128, 0, -128, true);
         }
      }

   }

   void bz(iz var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if (var12 != this.an) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if (var13 >= 0 && var13 < this.aw) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if (var14 >= 0 && var14 < this.ac && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
                        is var15 = this.ab[var12][var13][var14];
                        if (var15 != null) {
                           int var16 = (this.au[var12][var13][var14] + this.au[var12][var13 + 1][var14] + this.au[var12][var13][var14 + 1] + this.au[var12][var13 + 1][var14 + 1]) / 4 - (this.au[var2][var3][var4] + this.au[var2][var3 + 1][var4] + this.au[var2][var3][var4 + 1] + this.au[var2][var3 + 1][var4 + 1]) / 4;
                           jk var17 = var15.aq;
                           if (var17 != null) {
                              iz var18;
                              if (var17.ab instanceof iz) {
                                 var18 = (iz)var17.ab;
                                 iz.by(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }

                              if (var17.aq instanceof iz) {
                                 var18 = (iz)var17.aq;
                                 iz.by(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }
                           }

                           for(int var23 = 0; var23 < var15.ay * -422028371; ++var23) {
                              jj var19 = var15.ao[var23];
                              if (var19 != null && var19.ab instanceof iz) {
                                 iz var20 = (iz)var19.ab;
                                 int var21 = var19.al * -1242897449 - var19.an * 626811319 + 1;
                                 int var22 = var19.aa * -80616117 - var19.at * 2004902003 + 1;
                                 iz.by(var1, var20, (var19.an * 626811319 - var3) * 128 + (var21 - var5) * 64, var16, (var19.at * 2004902003 - var4) * 128 + (var22 - var6) * 64, var7);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   public void cj(int var1, int var2, int var3, int var4, iv var5, iv var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      if (var5 != null) {
         je var14 = new je();
         var14.aa = var11 * -5837374244328004387L;
         var14.ay = var13 * -486021893;
         var14.aw = var2 * 571975552 + 285987776;
         var14.ac = var3 * 1599256960 + 799628480;
         var14.af = var4 * -33433415;
         var14.al = var5;
         var14.at = var6;
         var14.au = var7 * -1230454197;
         var14.ab = var8 * 1035196391;
         var14.an = var9 * -1372050943;
         var14.aq = var10 * -965136487;

         for(int var15 = var1; var15 >= 0; --var15) {
            if (this.ab[var15][var2][var3] == null) {
               this.ab[var15][var2][var3] = new is(var15, var2, var3);
            }
         }

         this.ab[var1][var2][var3].al = var14;
      }
   }

   public static void bd(int[] var0, int var1, int var2, int var3, int var4) {
      cl = 0;
      cg = 0;
      cr = var3;
      cy = var4;
      cm = var3 / 2;
      cf = var4 / 2;
      boolean[][][][] var5 = new boolean[var0.length][32][53][53];

      int var6;
      int var7;
      int var8;
      int var9;
      int var11;
      int var12;
      for(var6 = 128; var6 <= 383; var6 += 32) {
         for(var7 = 0; var7 < 2048; var7 += 64) {
            by = in.ac[var6];
            bb = in.au[var6];
            bi = in.ac[var7];
            be = in.au[var7];
            var8 = (var6 - 128) / 32;
            var9 = var7 / 64;

            for(int var10 = -26; var10 < 26; ++var10) {
               for(var11 = -26; var11 < 26; ++var11) {
                  var12 = var10 * 128;
                  int var13 = var11 * 128;
                  boolean var14 = false;

                  for(int var15 = -var1; var15 <= var2; var15 += 128) {
                     if (bt(var12, var0[var8] + var15, var13)) {
                        var14 = true;
                        break;
                     }
                  }

                  var5[var8][var9][var10 + 25 + 1][var11 + 25 + 1] = var14;
               }
            }
         }
      }

      for(var6 = 0; var6 < 8; ++var6) {
         for(var7 = 0; var7 < 32; ++var7) {
            for(var8 = -25; var8 < 25; ++var8) {
               for(var9 = -25; var9 < 25; ++var9) {
                  boolean var16 = false;

                  label103:
                  for(var11 = -1; var11 <= 1; ++var11) {
                     for(var12 = -1; var12 <= 1; ++var12) {
                        if (var5[var6][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label103;
                        }

                        if (var5[var6][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label103;
                        }

                        if (var5[var6 + 1][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label103;
                        }

                        if (var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label103;
                        }
                     }
                  }

                  ck[var6][var7][var8 + 25][var9 + 25] = var16;
               }
            }
         }
      }

   }

   public void av(int var1, int var2, int var3, int var4) {
      is var5 = this.ab[var1][var2][var3];
      if (var5 != null) {
         je var6 = var5.al;
         if (var6 != null) {
            var6.an = var6.an * 1353438721 * var4 / 16 * -1372050943;
            var6.aq = var6.aq * 1573434537 * var4 / 16 * -965136487;
         }
      }
   }

   public void bj(int var1, int var2, int var3, boolean var4) {
      if (!bs() || var4) {
         bx = true;
         bj = var4;
         bo = var1;
         bz = var2;
         bm = var3;
         bd = -1;
         bt = -1;
      }
   }

   boolean gs(int var1, int var2, int var3) {
      int var4 = this.aa[var1][var2][var3];
      if (var4 == -av) {
         return false;
      } else if (var4 == av) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.ce(var5 + 1, this.au[var1][var2][var3], var6 + 1) && this.ce(var5 + -894430347 - 1, this.au[var1][var2 + 1][var3], var6 + 1) && this.ce(var5 + 1597882084 - 1, this.au[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.ce(var5 + 1, this.au[var1][var2][var3 + 1], var6 + -1940424982 - 1)) {
            this.aa[var1][var2][var3] = av;
            return true;
         } else {
            this.aa[var1][var2][var3] = -av;
            return false;
         }
      }
   }

   public je dy(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      return var4 == null ? null : var4.al;
   }

   public static void br() {
      bd = -1;
      bj = false;
   }

   public static boolean bs() {
      return bj && bd != -1;
   }

   void bu(is var1, boolean var2) {
      ba.an(var1);

      while(true) {
         is var3;
         int var4;
         int var5;
         int var6;
         int var7;
         is[][] var8;
         is var9;
         int var11;
         int var14;
         int var15;
         int var16;
         int var24;
         int var26;
         do {
            do {
               do {
                  do {
                     do {
                        do {
                           while(true) {
                              jk var10;
                              jj var12;
                              int var17;
                              int var18;
                              int var21;
                              boolean var22;
                              is var33;
                              while(true) {
                                 do {
                                    var3 = (is)ba.au();
                                    if (var3 == null) {
                                       return;
                                    }
                                 } while(!var3.av);

                                 var4 = var3.an * -464760837;
                                 var5 = var3.aw * -1812849043;
                                 var6 = var3.af * 1527994869;
                                 var7 = var3.ac * 1520539719;
                                 var8 = this.ab[var6];
                                 if (!var3.ah) {
                                    break;
                                 }

                                 if (var2) {
                                    if (var6 > 0) {
                                       var9 = this.ab[var6 - 1][var4][var5];
                                       if (var9 != null && var9.av) {
                                          continue;
                                       }
                                    }

                                    if (var4 <= ak && var4 > ar) {
                                       var9 = var8[var4 - 1][var5];
                                       if (var9 != null && var9.av && (var9.ah || (var3.ai * -1639156513 & 1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var4 >= ak && var4 < am - 1) {
                                       var9 = var8[var4 + 1][var5];
                                       if (var9 != null && var9.av && (var9.ah || (var3.ai * -1639156513 & 4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 <= az && var5 > as) {
                                       var9 = var8[var4][var5 - 1];
                                       if (var9 != null && var9.av && (var9.ah || (var3.ai * -1639156513 & 8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 >= az && var5 < aj - 1) {
                                       var9 = var8[var4][var5 + 1];
                                       if (var9 != null && var9.av && (var9.ah || (var3.ai * -1639156513 & 2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    var2 = true;
                                 }

                                 var3.ah = false;
                                 if (var3.az != null) {
                                    var9 = var3.az;
                                    if (var9.au != null) {
                                       if (!this.bp(0, var4, var5)) {
                                          this.bf(var9.au, 0, by, bb, bi, be, var4, var5);
                                       }
                                    } else if (var9.ab != null && !this.bp(0, var4, var5)) {
                                       this.bq(var9.ab, by, bb, bi, be, var4, var5);
                                    }

                                    var10 = var9.aq;
                                    if (var10 != null) {
                                       var10.ab.df(0, by, bb, bi, be, var10.an * -1998748175 - ad, var10.af * 1061912079 - ae, var10.aw * -1171883603 - ap, var10.al * -4009183385476919801L);
                                    }

                                    for(var11 = 0; var11 < var9.ay * -422028371; ++var11) {
                                       var12 = var9.ao[var11];
                                       if (var12 != null) {
                                          var12.ab.df(var12.aq * -1521986263, by, bb, bi, be, var12.ac * -1546117209 - ad, var12.aw * 1042267931 - ae, var12.au * 1463075659 - ap, var12.ax * 5016412888503339625L);
                                       }
                                    }
                                 }

                                 var22 = false;
                                 if (var3.au != null) {
                                    if (!this.bp(var7, var4, var5)) {
                                       var22 = true;
                                       if (var3.au.aw * -1667175185 != 12345678 || bx && var6 <= bo) {
                                          this.bf(var3.au, var7, by, bb, bi, be, var4, var5);
                                       }
                                    }
                                 } else if (var3.ab != null && !this.bp(var7, var4, var5)) {
                                    var22 = true;
                                    this.bq(var3.ab, by, bb, bi, be, var4, var5);
                                 }

                                 var21 = 0;
                                 var11 = 0;
                                 jk var23 = var3.aq;
                                 je var13 = var3.al;
                                 if (var23 != null || var13 != null) {
                                    if (ak == var4) {
                                       ++var21;
                                    } else if (ak < var4) {
                                       var21 += 2;
                                    }

                                    if (az == var5) {
                                       var21 += 3;
                                    } else if (az > var5) {
                                       var21 += 6;
                                    }

                                    var11 = bv[var21];
                                    var3.ak = bp[var21] * 1933576483;
                                 }

                                 if (var23 != null) {
                                    if ((var23.ac * -137992079 & bl[var21]) != 0) {
                                       if (var23.ac * -137992079 == 16) {
                                          var3.am = -875132571;
                                          var3.as = bc[var21] * 1761397621;
                                          var3.aj = 520035649 - var3.as * 1049420895;
                                       } else if (var23.ac * -137992079 == 32) {
                                          var3.am = -1750265142;
                                          var3.as = bh[var21] * 1761397621;
                                          var3.aj = 1040071298 - var3.as * 1049420895;
                                       } else if (var23.ac * -137992079 == 64) {
                                          var3.am = 794437012;
                                          var3.as = bw[var21] * 1761397621;
                                          var3.aj = 2080142596 - var3.as * 1049420895;
                                       } else {
                                          var3.am = 1669569583;
                                          var3.as = ce[var21] * 1761397621;
                                          var3.aj = 1560106947 - var3.as * 1049420895;
                                       }
                                    } else {
                                       var3.am = 0;
                                    }

                                    if ((var23.ac * -137992079 & var11) != 0 && !this.bc(var7, var4, var5, var23.ac * -137992079)) {
                                       var23.ab.df(0, by, bb, bi, be, var23.an * -1998748175 - ad, var23.af * 1061912079 - ae, var23.aw * -1171883603 - ap, var23.al * -4009183385476919801L);
                                    }

                                    if ((var23.au * 379413203 & var11) != 0 && !this.bc(var7, var4, var5, var23.au * 379413203)) {
                                       var23.aq.df(0, by, bb, bi, be, var23.an * -1998748175 - ad, var23.af * 1061912079 - ae, var23.aw * -1171883603 - ap, var23.al * -4009183385476919801L);
                                    }
                                 }

                                 if (var13 != null && !this.bh(var7, var4, var5, var13.al.et * 1550732737)) {
                                    if ((var13.au * -607881373 & var11) != 0) {
                                       var13.al.df(0, by, bb, bi, be, var13.aw * 1346340783 - ad + var13.an * 1353438721, var13.af * 452898185 - ae, var13.ac * 1328351163 - ap + var13.aq * 1573434537, var13.aa * -4691380879163567243L);
                                    } else if (var13.au * -607881373 == 256) {
                                       var14 = var13.aw * 1346340783 - ad;
                                       var15 = var13.af * 452898185 - ae;
                                       var16 = var13.ac * 1328351163 - ap;
                                       var17 = var13.ab * -1711060009;
                                       if (var17 != 1 && var17 != 2) {
                                          var18 = var14;
                                       } else {
                                          var18 = -var14;
                                       }

                                       int var19;
                                       if (var17 != 2 && var17 != 3) {
                                          var19 = var16;
                                       } else {
                                          var19 = -var16;
                                       }

                                       if (var19 < var18) {
                                          var13.al.df(0, by, bb, bi, be, var14 + var13.an * 1353438721, var15, var16 + var13.aq * 1573434537, var13.aa * -4691380879163567243L);
                                       } else if (var13.at != null) {
                                          var13.at.df(0, by, bb, bi, be, var14, var15, var16, var13.aa * -4691380879163567243L);
                                       }
                                    }
                                 }

                                 if (var22) {
                                    ig var27 = var3.at;
                                    if (var27 != null) {
                                       var27.ac.df(0, by, bb, bi, be, var27.an * 487195023 - ad, var27.af * 1777058639 - ae, var27.aw * -1480835961 - ap, var27.au * 3423223696102332293L);
                                    }

                                    iy var31 = var3.aa;
                                    if (var31 != null && var31.al * -1118938495 == 0) {
                                       if (var31.au != null) {
                                          var31.au.df(0, by, bb, bi, be, var31.an * -1473635399 - ad, var31.af * 2064997173 - ae, var31.aw * -1839139071 - ap, var31.aq * -8562400470617197071L);
                                       }

                                       if (var31.ab != null) {
                                          var31.ab.df(0, by, bb, bi, be, var31.an * -1473635399 - ad, var31.af * 2064997173 - ae, var31.aw * -1839139071 - ap, var31.aq * -8562400470617197071L);
                                       }

                                       if (var31.ac != null) {
                                          var31.ac.df(0, by, bb, bi, be, var31.an * -1473635399 - ad, var31.af * 2064997173 - ae, var31.aw * -1839139071 - ap, var31.aq * -8562400470617197071L);
                                       }
                                    }
                                 }

                                 var14 = var3.ai * -1639156513;
                                 if (var14 != 0) {
                                    if (var4 < ak && (var14 & 4) != 0) {
                                       var33 = var8[var4 + 1][var5];
                                       if (var33 != null && var33.av) {
                                          ba.an(var33);
                                       }
                                    }

                                    if (var5 < az && (var14 & 2) != 0) {
                                       var33 = var8[var4][var5 + 1];
                                       if (var33 != null && var33.av) {
                                          ba.an(var33);
                                       }
                                    }

                                    if (var4 > ak && (var14 & 1) != 0) {
                                       var33 = var8[var4 - 1][var5];
                                       if (var33 != null && var33.av) {
                                          ba.an(var33);
                                       }
                                    }

                                    if (var5 > az && (var14 & 8) != 0) {
                                       var33 = var8[var4][var5 - 1];
                                       if (var33 != null && var33.av) {
                                          ba.an(var33);
                                       }
                                    }
                                 }
                                 break;
                              }

                              if (var3.am * 1223983431 != 0) {
                                 var22 = true;

                                 for(var21 = 0; var21 < var3.ay * -422028371; ++var21) {
                                    if (var3.ao[var21].ao * -1033646519 != av && (var3.ax[var21] & var3.am * 1223983431) == var3.as * -1655477027) {
                                       var22 = false;
                                       break;
                                    }
                                 }

                                 if (var22) {
                                    var10 = var3.aq;
                                    if (!this.bc(var7, var4, var5, var10.ac * -137992079)) {
                                       var10.ab.df(0, by, bb, bi, be, var10.an * -1998748175 - ad, var10.af * 1061912079 - ae, var10.aw * -1171883603 - ap, var10.al * -4009183385476919801L);
                                    }

                                    var3.am = 0;
                                 }
                              }

                              if (!var3.ar) {
                                 break;
                              }

                              try {
                                 int var25 = var3.ay * -422028371;
                                 var3.ar = false;
                                 var21 = 0;

                                 label563:
                                 for(var11 = 0; var11 < var25; ++var11) {
                                    var12 = var3.ao[var11];
                                    if (var12.ao * -1033646519 != av) {
                                       for(var26 = var12.an * 626811319; var26 <= var12.al * -1242897449; ++var26) {
                                          for(var14 = var12.at * 2004902003; var14 <= var12.aa * -80616117; ++var14) {
                                             var33 = var8[var26][var14];
                                             if (var33.ah) {
                                                var3.ar = true;
                                                continue label563;
                                             }

                                             if (var33.am * 1223983431 != 0) {
                                                var16 = 0;
                                                if (var26 > var12.an * 626811319) {
                                                   ++var16;
                                                }

                                                if (var26 < var12.al * -1242897449) {
                                                   var16 += 4;
                                                }

                                                if (var14 > var12.at * 2004902003) {
                                                   var16 += 8;
                                                }

                                                if (var14 < var12.aa * -80616117) {
                                                   var16 += 2;
                                                }

                                                if ((var16 & var33.am * 1223983431) == var3.aj * 485316675) {
                                                   var3.ar = true;
                                                   continue label563;
                                                }
                                             }
                                          }
                                       }

                                       bk[var21++] = var12;
                                       var26 = ak - var12.an * 626811319;
                                       var14 = var12.al * -1242897449 - ak;
                                       if (var14 > var26) {
                                          var26 = var14;
                                       }

                                       var15 = az - var12.at * 2004902003;
                                       var16 = var12.aa * -80616117 - az;
                                       if (var16 > var15) {
                                          var12.ay = (var26 + var16) * -1266251803;
                                       } else {
                                          var12.ay = (var26 + var15) * -1266251803;
                                       }
                                    }
                                 }

                                 while(var21 > 0) {
                                    var11 = -50;
                                    var24 = -1;

                                    for(var26 = 0; var26 < var21; ++var26) {
                                       jj var34 = bk[var26];
                                       if (var34.ao * -1033646519 != av) {
                                          if (var34.ay * 308174317 > var11) {
                                             var11 = var34.ay * 308174317;
                                             var24 = var26;
                                          } else if (var34.ay * 308174317 == var11) {
                                             var15 = var34.ac * -1546117209 - ad;
                                             var16 = var34.au * 1463075659 - ap;
                                             var17 = bk[var24].ac * -1546117209 - ad;
                                             var18 = bk[var24].au * 1463075659 - ap;
                                             if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
                                                var24 = var26;
                                             }
                                          }
                                       }
                                    }

                                    if (var24 == -1) {
                                       break;
                                    }

                                    jj var35 = bk[var24];
                                    var35.ao = av * -76184583;
                                    if (!this.bw(var7, var35.an * 626811319, var35.al * -1242897449, var35.at * 2004902003, var35.aa * -80616117, var35.ab.et * 1550732737)) {
                                       var35.ab.df(var35.aq * -1521986263, by, bb, bi, be, var35.ac * -1546117209 - ad, var35.aw * 1042267931 - ae, var35.au * 1463075659 - ap, var35.ax * 5016412888503339625L);
                                    }

                                    for(var14 = var35.an * 626811319; var14 <= var35.al * -1242897449; ++var14) {
                                       for(var15 = var35.at * 2004902003; var15 <= var35.aa * -80616117; ++var15) {
                                          is var36 = var8[var14][var15];
                                          if (var36.am * 1223983431 != 0) {
                                             ba.an(var36);
                                          } else if ((var14 != var4 || var15 != var5) && var36.av) {
                                             ba.an(var36);
                                          }
                                       }
                                    }
                                 }

                                 if (!var3.ar) {
                                    break;
                                 }
                              } catch (Exception var20) {
                                 var3.ar = false;
                                 break;
                              }
                           }
                        } while(!var3.av);
                     } while(var3.am * 1223983431 != 0);

                     if (var4 > ak || var4 <= ar) {
                        break;
                     }

                     var9 = var8[var4 - 1][var5];
                  } while(var9 != null && var9.av);

                  if (var4 < ak || var4 >= am - 1) {
                     break;
                  }

                  var9 = var8[var4 + 1][var5];
               } while(var9 != null && var9.av);

               if (var5 > az || var5 <= as) {
                  break;
               }

               var9 = var8[var4][var5 - 1];
            } while(var9 != null && var9.av);

            if (var5 < az || var5 >= aj - 1) {
               break;
            }

            var9 = var8[var4][var5 + 1];
         } while(var9 != null && var9.av);

         var3.av = false;
         --ag;
         iy var29 = var3.aa;
         if (var29 != null && var29.al * -1118938495 != 0) {
            if (var29.au != null) {
               var29.au.df(0, by, bb, bi, be, var29.an * -1473635399 - ad, var29.af * 2064997173 - ae - var29.al * -1118938495, var29.aw * -1839139071 - ap, var29.aq * -8562400470617197071L);
            }

            if (var29.ab != null) {
               var29.ab.df(0, by, bb, bi, be, var29.an * -1473635399 - ad, var29.af * 2064997173 - ae - var29.al * -1118938495, var29.aw * -1839139071 - ap, var29.aq * -8562400470617197071L);
            }

            if (var29.ac != null) {
               var29.ac.df(0, by, bb, bi, be, var29.an * -1473635399 - ad, var29.af * 2064997173 - ae - var29.al * -1118938495, var29.aw * -1839139071 - ap, var29.aq * -8562400470617197071L);
            }
         }

         if (var3.ak * -1504022901 != 0) {
            je var30 = var3.al;
            if (var30 != null && !this.bh(var7, var4, var5, var30.al.et * 1550732737)) {
               if ((var30.au * -607881373 & var3.ak * -1504022901) != 0) {
                  var30.al.df(0, by, bb, bi, be, var30.aw * 1346340783 - ad + var30.an * 1353438721, var30.af * 452898185 - ae, var30.ac * 1328351163 - ap + var30.aq * 1573434537, var30.aa * -4691380879163567243L);
               } else if (var30.au * -607881373 == 256) {
                  var11 = var30.aw * 1346340783 - ad;
                  var24 = var30.af * 452898185 - ae;
                  var26 = var30.ac * 1328351163 - ap;
                  var14 = var30.ab * -1711060009;
                  if (var14 != 1 && var14 != 2) {
                     var15 = var11;
                  } else {
                     var15 = -var11;
                  }

                  if (var14 != 2 && var14 != 3) {
                     var16 = var26;
                  } else {
                     var16 = -var26;
                  }

                  if (var16 >= var15) {
                     var30.al.df(0, by, bb, bi, be, var11 + var30.an * 1353438721, var24, var26 + var30.aq * 1573434537, var30.aa * -4691380879163567243L);
                  } else if (var30.at != null) {
                     var30.at.df(0, by, bb, bi, be, var11, var24, var26, var30.aa * -4691380879163567243L);
                  }
               }
            }

            jk var28 = var3.aq;
            if (var28 != null) {
               if ((var28.au * 379413203 & var3.ak * -1504022901) != 0 && !this.bc(var7, var4, var5, var28.au * 379413203)) {
                  var28.aq.df(0, by, bb, bi, be, var28.an * -1998748175 - ad, var28.af * 1061912079 - ae, var28.aw * -1171883603 - ap, var28.al * -4009183385476919801L);
               }

               if ((var28.ac * -137992079 & var3.ak * -1504022901) != 0 && !this.bc(var7, var4, var5, var28.ac * -137992079)) {
                  var28.ab.df(0, by, bb, bi, be, var28.an * -1998748175 - ad, var28.af * 1061912079 - ae, var28.aw * -1171883603 - ap, var28.al * -4009183385476919801L);
               }
            }
         }

         is var32;
         if (var6 < this.an - 1) {
            var32 = this.ab[var6 + 1][var4][var5];
            if (var32 != null && var32.av) {
               ba.an(var32);
            }
         }

         if (var4 < ak) {
            var32 = var8[var4 + 1][var5];
            if (var32 != null && var32.av) {
               ba.an(var32);
            }
         }

         if (var5 < az) {
            var32 = var8[var4][var5 + 1];
            if (var32 != null && var32.av) {
               ba.an(var32);
            }
         }

         if (var4 > ak) {
            var32 = var8[var4 - 1][var5];
            if (var32 != null && var32.av) {
               ba.an(var32);
            }
         }

         if (var5 > az) {
            var32 = var8[var4][var5 - 1];
            if (var32 != null && var32.av) {
               ba.an(var32);
            }
         }
      }
   }

   void bf(jc var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10 = var9 = (var7 << 7) - ad;
      int var11;
      int var12 = var11 = (var8 << 7) - ap;
      int var13;
      int var14 = var13 = var10 + 128;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = this.au[var2][var7][var8] - ae;
      int var18 = this.au[var2][var7 + 1][var8] - ae;
      int var19 = this.au[var2][var7 + 1][var8 + 1] - ae;
      int var20 = this.au[var2][var7][var8 + 1] - ae;
      int var21 = var12 * var5 + var10 * var6 >> 16;
      var12 = var12 * var6 - var10 * var5 >> 16;
      var10 = var21;
      var21 = var17 * var4 - var12 * var3 >> 16;
      var12 = var17 * var3 + var12 * var4 >> 16;
      var17 = var21;
      if (var12 >= 50) {
         var21 = var11 * var5 + var14 * var6 >> 16;
         var11 = var11 * var6 - var14 * var5 >> 16;
         var14 = var21;
         var21 = var18 * var4 - var11 * var3 >> 16;
         var11 = var18 * var3 + var11 * var4 >> 16;
         var18 = var21;
         if (var11 >= 50) {
            var21 = var16 * var5 + var13 * var6 >> 16;
            var16 = var16 * var6 - var13 * var5 >> 16;
            var13 = var21;
            var21 = var19 * var4 - var16 * var3 >> 16;
            var16 = var19 * var3 + var16 * var4 >> 16;
            var19 = var21;
            if (var16 >= 50) {
               var21 = var15 * var5 + var9 * var6 >> 16;
               var15 = var15 * var6 - var9 * var5 >> 16;
               var9 = var21;
               var21 = var20 * var4 - var15 * var3 >> 16;
               var15 = var20 * var3 + var15 * var4 >> 16;
               if (var15 >= 50) {
                  int var22 = gd.au(975897823) + var10 * eu.at(942663302) / var12;
                  int var23 = ax.ab(654067374) + var17 * eu.at(779085808) / var12;
                  int var24 = gd.au(62115852) + var14 * eu.at(-1218165539) / var11;
                  int var25 = ax.ab(1643359629) + var18 * eu.at(330772873) / var11;
                  int var26 = gd.au(-30238737) + var13 * eu.at(-286126791) / var16;
                  int var27 = ax.ab(1082157854) + var19 * eu.at(1052473091) / var16;
                  int var28 = gd.au(-1828344934) + var9 * eu.at(-108183317) / var15;
                  int var29 = ax.ab(1327367321) + var21 * eu.at(-1849392626) / var15;
                  float var30 = df.au(var12, 1143489771);
                  float var31 = df.au(var11, 1894163730);
                  float var32 = df.au(var16, 999210585);
                  float var33 = df.au(var15, 770981161);
                  in.ab.aw = 0;
                  int var34;
                  int var35;
                  if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
                     in.ab.af = false;
                     var34 = aq.aa(1349662061);
                     if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > var34 || var28 > var34 || var24 > var34) {
                        in.ab.af = true;
                     }

                     if (bx && bv(bz, bm, var27, var29, var25, var26, var28, var24)) {
                        bd = var7;
                        bt = var8;
                     }

                     if (var1.au * 412494011 == -1) {
                        if (var1.aw * -1667175185 != 12345678) {
                           jk.ah(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.aw * -1667175185, var1.ac * 890568309, var1.an * 40257399, -428480375);
                        }
                     } else if (!af) {
                        if (var1.ab) {
                           ig.am(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.aw * -1667175185, var1.ac * 890568309, var1.an * 40257399, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.au * 412494011, (byte)12);
                        } else {
                           ig.am(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.aw * -1667175185, var1.ac * 890568309, var1.an * 40257399, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.au * 412494011, (byte)12);
                        }
                     } else {
                        var35 = in.ab.aq.ac(var1.au * 412494011, 498361460);
                        jk.ah(var27, var29, var25, var26, var28, var24, var32, var33, var31, ba(var35, var1.aw * -1667175185), ba(var35, var1.ac * 890568309), ba(var35, var1.an * 40257399), -428480375);
                     }
                  }

                  if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                     in.ab.af = false;
                     var34 = aq.aa(-560489151);
                     if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > var34 || var24 > var34 || var28 > var34) {
                        in.ab.af = true;
                     }

                     if (bx && bv(bz, bm, var23, var25, var29, var22, var24, var28)) {
                        bd = var7;
                        bt = var8;
                     }

                     if (var1.au * 412494011 == -1) {
                        if (var1.af * 1860851959 != 12345678) {
                           jk.ah(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.af * 1860851959, var1.an * 40257399, var1.ac * 890568309, -428480375);
                        }
                     } else if (!af) {
                        ig.am(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.af * 1860851959, var1.an * 40257399, var1.ac * 890568309, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.au * 412494011, (byte)12);
                     } else {
                        var35 = in.ab.aq.ac(var1.au * 412494011, 1755564541);
                        jk.ah(var23, var25, var29, var22, var24, var28, var30, var31, var33, ba(var35, var1.af * 1860851959), ba(var35, var1.an * 40257399), ba(var35, var1.ac * 890568309), -428480375);
                     }
                  }

               }
            }
         }
      }
   }

   public void du(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      if (var4 != null) {
         for(int var5 = 0; var5 < var4.ay * -422028371; ++var5) {
            jj var6 = var4.ao[var5];
            if (eg.an(var6.ax * 5016412888503339625L) && var6.an * 626811319 == var2 && var6.at * 2004902003 == var3) {
               this.ah(var6);
               return;
            }
         }

      }
   }

   static final int ba(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   public void dx(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      if (var4 != null) {
         var4.aa = null;
      }
   }

   void bl() {
      int var1 = bg[ah];
      ip[] var2 = bu[ah];
      bf = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         ip var4 = var2[var3];
         int var5;
         int var6;
         int var7;
         int var9;
         boolean var13;
         if (var4.au * -33717119 == 1) {
            var5 = var4.af * -219522119 - ak + 25;
            if (var5 >= 0 && var5 <= 50) {
               var6 = var4.aw * 1910687837 - az + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.ac * 506177633 - az + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (cq[var5][var6++]) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = ad - var4.ab * -1074260583;
                  if (var9 > 32) {
                     var4.ao = 455574555;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.ao = 911149110;
                     var9 = -var9;
                  }

                  var4.ag = (var4.al * -1443747699 - ap << 8) / var9 * -220034745;
                  var4.ah = (var4.at * 1383802843 - ap << 8) / var9 * -1665480987;
                  var4.av = (var4.aa * 690846039 - ae << 8) / var9 * -1186198099;
                  var4.ar = (var4.ay * 1879954201 - ae << 8) / var9 * 628709121;
                  bq[bf++] = var4;
               }
            }
         } else if (var4.au * -33717119 == 2) {
            var5 = var4.aw * 1910687837 - az + 25;
            if (var5 >= 0 && var5 <= 50) {
               var6 = var4.af * -219522119 - ak + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.an * -1873370011 - ak + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (cq[var6++][var5]) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = ap - var4.al * -1443747699;
                  if (var9 > 32) {
                     var4.ao = 1366723665;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.ao = 1822298220;
                     var9 = -var9;
                  }

                  var4.ax = (var4.ab * -1074260583 - ad << 8) / var9 * -1619986937;
                  var4.ai = (var4.aq * -875468987 - ad << 8) / var9 * 528722083;
                  var4.av = (var4.aa * 690846039 - ae << 8) / var9 * -1186198099;
                  var4.ar = (var4.ay * 1879954201 - ae << 8) / var9 * 628709121;
                  bq[bf++] = var4;
               }
            }
         } else if (var4.au * -33717119 == 4) {
            var5 = var4.aa * 690846039 - ae;
            if (var5 > 128) {
               var6 = var4.aw * 1910687837 - az + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.ac * 506177633 - az + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               if (var6 <= var7) {
                  int var8 = var4.af * -219522119 - ak + 25;
                  if (var8 < 0) {
                     var8 = 0;
                  }

                  var9 = var4.an * -1873370011 - ak + 25;
                  if (var9 > 50) {
                     var9 = 50;
                  }

                  boolean var10 = false;

                  label194:
                  for(int var11 = var8; var11 <= var9; ++var11) {
                     for(int var12 = var6; var12 <= var7; ++var12) {
                        if (cq[var11][var12]) {
                           var10 = true;
                           break label194;
                        }
                     }
                  }

                  if (var10) {
                     var4.ao = -2017094521;
                     var4.ax = (var4.ab * -1074260583 - ad << 8) / var5 * -1619986937;
                     var4.ai = (var4.aq * -875468987 - ad << 8) / var5 * 528722083;
                     var4.ag = (var4.al * -1443747699 - ap << 8) / var5 * -220034745;
                     var4.ah = (var4.at * 1383802843 - ap << 8) / var5 * -1665480987;
                     bq[bf++] = var4;
                  }
               }
            }
         }
      }

   }

   public jk dn(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      return var4 == null ? null : var4.aq;
   }

   boolean bc(int var1, int var2, int var3, int var4) {
      if (!this.bp(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.au[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if (var4 < 16) {
            if (var4 == 1) {
               if (var5 > ad) {
                  if (!this.ce(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.ce(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.ce(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.ce(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.ce(var5, var9, var6)) {
                  return false;
               }

               if (!this.ce(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 2) {
               if (var6 < ap) {
                  if (!this.ce(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if (!this.ce(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.ce(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if (!this.ce(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.ce(var5, var9, var6 + 128)) {
                  return false;
               }

               if (!this.ce(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 4) {
               if (var5 < ad) {
                  if (!this.ce(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if (!this.ce(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.ce(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if (!this.ce(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.ce(var5 + 128, var9, var6)) {
                  return false;
               }

               if (!this.ce(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 8) {
               if (var6 > ap) {
                  if (!this.ce(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.ce(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.ce(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.ce(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if (!this.ce(var5, var9, var6)) {
                  return false;
               }

               if (!this.ce(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         if (!this.ce(var5 + 64, var10, var6 + 64)) {
            return false;
         } else if (var4 == 16) {
            return this.ce(var5, var9, var6 + 128);
         } else if (var4 == 32) {
            return this.ce(var5 + 128, var9, var6 + 128);
         } else if (var4 == 64) {
            return this.ce(var5 + 128, var9, var6);
         } else if (var4 == 128) {
            return this.ce(var5, var9, var6);
         } else {
            return true;
         }
      }
   }

   boolean bh(int var1, int var2, int var3, int var4) {
      if (!this.bp(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.ce(var5 + 1, this.au[var1][var2][var3] - var4, var6 + 1) && this.ce(var5 + 128 - 1, this.au[var1][var2 + 1][var3] - var4, var6 + 1) && this.ce(var5 + 128 - 1, this.au[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.ce(var5 + 1, this.au[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   boolean bw(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if (var2 == var3 && var4 == var5) {
         if (!this.bp(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.ce(var7 + 1, this.au[var1][var2][var4] - var6, var8 + 1) && this.ce(var7 + 128 - 1, this.au[var1][var2 + 1][var4] - var6, var8 + 1) && this.ce(var7 + 128 - 1, this.au[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.ce(var7 + 1, this.au[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if (this.aa[var1][var7][var8] == -av) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.au[var1][var2][var4] - var6;
         if (!this.ce(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if (!this.ce(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if (!this.ce(var7, var9, var11)) {
                  return false;
               } else if (!this.ce(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   boolean ce(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < bf; ++var4) {
         ip var5 = bq[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if (var5.ao * -221071853 == 1) {
            var6 = var5.ab * -1074260583 - var1;
            if (var6 > 0) {
               var7 = var5.al * -1443747699 + (var5.ag * -371961737 * var6 >> 8);
               var8 = var5.at * 1383802843 + (var5.ah * 1030915821 * var6 >> 8);
               var9 = var5.aa * 690846039 + (var5.av * -847323611 * var6 >> 8);
               var10 = var5.ay * 1879954201 + (var5.ar * -283662079 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ao * -221071853 == 2) {
            var6 = var1 - var5.ab * -1074260583;
            if (var6 > 0) {
               var7 = var5.al * -1443747699 + (var5.ag * -371961737 * var6 >> 8);
               var8 = var5.at * 1383802843 + (var5.ah * 1030915821 * var6 >> 8);
               var9 = var5.aa * 690846039 + (var5.av * -847323611 * var6 >> 8);
               var10 = var5.ay * 1879954201 + (var5.ar * -283662079 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ao * -221071853 == 3) {
            var6 = var5.al * -1443747699 - var3;
            if (var6 > 0) {
               var7 = var5.ab * -1074260583 + (var5.ax * 1498322871 * var6 >> 8);
               var8 = var5.aq * -875468987 + (var5.ai * 542133003 * var6 >> 8);
               var9 = var5.aa * 690846039 + (var5.av * -847323611 * var6 >> 8);
               var10 = var5.ay * 1879954201 + (var5.ar * -283662079 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ao * -221071853 == 4) {
            var6 = var3 - var5.al * -1443747699;
            if (var6 > 0) {
               var7 = var5.ab * -1074260583 + (var5.ax * 1498322871 * var6 >> 8);
               var8 = var5.aq * -875468987 + (var5.ai * 542133003 * var6 >> 8);
               var9 = var5.aa * 690846039 + (var5.av * -847323611 * var6 >> 8);
               var10 = var5.ay * 1879954201 + (var5.ar * -283662079 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ao * -221071853 == 5) {
            var6 = var2 - var5.aa * 690846039;
            if (var6 > 0) {
               var7 = var5.ab * -1074260583 + (var5.ax * 1498322871 * var6 >> 8);
               var8 = var5.aq * -875468987 + (var5.ai * 542133003 * var6 >> 8);
               var9 = var5.al * -1443747699 + (var5.ag * -371961737 * var6 >> 8);
               var10 = var5.at * 1383802843 + (var5.ah * 1030915821 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   static {
      bg = new int[br];
      bu = new ip[br][500];
      bf = 0;
      bq = new ip[500];
      ba = new nh();
      bv = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
      bl = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
      bp = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
      bc = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
      bh = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
      bw = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
      ce = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
      ck = new boolean[8][32][51][51];
   }

   public void ci() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.an; ++var1) {
         for(var2 = 0; var2 < this.aw; ++var2) {
            for(int var3 = 0; var3 < this.ac; ++var3) {
               this.ab[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < br; ++var1) {
         for(var2 = 0; var2 < bg[var1]; ++var2) {
            bu[var1][var2] = null;
         }

         bg[var1] = 0;
      }

      for(var1 = 0; var1 < this.al; ++var1) {
         this.at[var1] = null;
      }

      this.al = 0;

      for(var1 = 0; var1 < bk.length; ++var1) {
         bk[var1] = null;
      }

   }

   public void cs() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.an; ++var1) {
         for(var2 = 0; var2 < this.aw; ++var2) {
            for(int var3 = 0; var3 < this.ac; ++var3) {
               this.ab[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < br; ++var1) {
         for(var2 = 0; var2 < bg[var1]; ++var2) {
            bu[var1][var2] = null;
         }

         bg[var1] = 0;
      }

      for(var1 = 0; var1 < this.al; ++var1) {
         this.at[var1] = null;
      }

      this.al = 0;

      for(var1 = 0; var1 < bk.length; ++var1) {
         bk[var1] = null;
      }

   }

   public void cc(int var1) {
      this.aq = var1;

      for(int var2 = 0; var2 < this.aw; ++var2) {
         for(int var3 = 0; var3 < this.ac; ++var3) {
            if (this.ab[var1][var2][var3] == null) {
               this.ab[var1][var2][var3] = new is(var1, var2, var3);
            }
         }
      }

   }

   public void cn(int var1) {
      this.aq = var1;

      for(int var2 = 0; var2 < this.aw; ++var2) {
         for(int var3 = 0; var3 < this.ac; ++var3) {
            if (this.ab[var1][var2][var3] == null) {
               this.ab[var1][var2][var3] = new is(var1, var2, var3);
            }
         }
      }

   }

   public void ca(int var1) {
      this.aq = var1;

      for(int var2 = 0; var2 < this.aw; ++var2) {
         for(int var3 = 0; var3 < this.ac; ++var3) {
            if (this.ab[var1][var2][var3] == null) {
               this.ab[var1][var2][var3] = new is(var1, var2, var3);
            }
         }
      }

   }

   public void cu(int var1, int var2) {
      is var3 = this.ab[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         is var5 = this.ab[var4][var1][var2] = this.ab[var4 + 1][var1][var2];
         if (var5 != null) {
            var5.af -= -1846949283;

            for(int var6 = 0; var6 < var5.ay * -422028371; ++var6) {
               jj var7 = var5.ao[var6];
               if (eg.an(var7.ax * 5016412888503339625L) && var7.an * 626811319 == var1 && var7.at * 2004902003 == var2) {
                  var7.af -= -1695101227;
               }
            }
         }
      }

      if (this.ab[0][var1][var2] == null) {
         this.ab[0][var1][var2] = new is(0, var1, var2);
      }

      this.ab[0][var1][var2].az = var3;
      this.ab[3][var1][var2] = null;
   }

   public void ck(int var1, int var2) {
      is var3 = this.ab[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         is var5 = this.ab[var4][var1][var2] = this.ab[var4 + 1][var1][var2];
         if (var5 != null) {
            var5.af -= 322652401;

            for(int var6 = 0; var6 < var5.ay * -422028371; ++var6) {
               jj var7 = var5.ao[var6];
               if (eg.an(var7.ax * 5016412888503339625L) && var7.an * 626811319 == var1 && var7.at * 1188311898 == var2) {
                  var7.af -= 1454447389;
               }
            }
         }
      }

      if (this.ab[0][var1][var2] == null) {
         this.ab[0][var1][var2] = new is(0, var1, var2);
      }

      this.ab[0][var1][var2].az = var3;
      this.ab[3][var1][var2] = null;
   }

   public static void cq(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      ip var8 = new ip();
      var8.af = var2 / 128 * 2125806217;
      var8.an = var3 / 128 * -2141622931;
      var8.aw = var4 / 128 * -1507898379;
      var8.ac = var5 / 128 * 1022688161;
      var8.au = var1 * -1065960575;
      var8.ab = var2 * 2126671529;
      var8.aq = var3 * 385880973;
      var8.al = var4 * 582998597;
      var8.at = var5 * 495746131;
      var8.aa = var6 * 903512679;
      var8.ay = var7 * -1329473239;
      bu[var0][bg[var0]++] = var8;
   }

   public static void cm(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      ip var8 = new ip();
      var8.af = var2 / 1524129845 * 2125806217;
      var8.an = var3 / 128 * -2141622931;
      var8.aw = var4 / 197075732 * 504400698;
      var8.ac = var5 / -717087822 * -181559381;
      var8.au = var1 * -1065960575;
      var8.ab = var2 * 2126671529;
      var8.aq = var3 * 502296058;
      var8.al = var4 * 1924352080;
      var8.at = var5 * 495746131;
      var8.aa = var6 * 484712818;
      var8.ay = var7 * -1329473239;
      bu[var0][bg[var0]++] = var8;
   }

   public static void cf(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      ip var8 = new ip();
      var8.af = var2 / 128 * 2125806217;
      var8.an = var3 / -780061399 * -2141622931;
      var8.aw = var4 / 128 * -1507898379;
      var8.ac = var5 / 550319898 * -488871713;
      var8.au = var1 * -1754960543;
      var8.ab = var2 * 2126671529;
      var8.aq = var3 * 1275203202;
      var8.al = var4 * 1701298053;
      var8.at = var5 * 495746131;
      var8.aa = var6 * -1861867895;
      var8.ay = var7 * 1709878522;
      bu[var0][bg[var0]++] = var8;
   }

   public void cl(int var1, int var2, int var3, int var4) {
      is var5 = this.ab[var1][var2][var3];
      if (var5 != null) {
         this.ab[var1][var2][var3].ag = var4 * -242961580;
      }
   }

   public void cg(int var1, int var2, int var3, int var4) {
      is var5 = this.ab[var1][var2][var3];
      if (var5 != null) {
         this.ab[var1][var2][var3].ag = var4 * -2078731195;
      }
   }

   public void cr(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      jc var21;
      int var22;
      if (var4 == 0) {
         var21 = new jc(var11, var12, var13, var14, -1, var19, false);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.ab[var22][var2][var3] == null) {
               this.ab[var22][var2][var3] = new is(var22, var2, var3);
            }
         }

         this.ab[var1][var2][var3].au = var21;
      } else if (var4 != 1) {
         ij var23 = new ij(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.ab[var22][var2][var3] == null) {
               this.ab[var22][var2][var3] = new is(var22, var2, var3);
            }
         }

         this.ab[var1][var2][var3].ab = var23;
      } else {
         var21 = new jc(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.ab[var22][var2][var3] == null) {
               this.ab[var22][var2][var3] = new is(var22, var2, var3);
            }
         }

         this.ab[var1][var2][var3].au = var21;
      }
   }

   boolean gh(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if (var2 == var3 && var4 == var5) {
         if (!this.bp(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.ce(var7 + 1, this.au[var1][var2][var4] - var6, var8 + 1) && this.ce(var7 + 128 - 1, this.au[var1][var2 + 1][var4] - var6, var8 + 1) && this.ce(var7 + 128 - 1, this.au[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.ce(var7 + 1, this.au[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if (this.aa[var1][var7][var8] == -av) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.au[var1][var2][var4] - var6;
         if (!this.ce(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if (!this.ce(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if (!this.ce(var7, var9, var11)) {
                  return false;
               } else if (!this.ce(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   public void cx(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      jc var21;
      int var22;
      if (var4 == 0) {
         var21 = new jc(var11, var12, var13, var14, -1, var19, false);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.ab[var22][var2][var3] == null) {
               this.ab[var22][var2][var3] = new is(var22, var2, var3);
            }
         }

         this.ab[var1][var2][var3].au = var21;
      } else if (var4 != 1) {
         ij var23 = new ij(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.ab[var22][var2][var3] == null) {
               this.ab[var22][var2][var3] = new is(var22, var2, var3);
            }
         }

         this.ab[var1][var2][var3].ab = var23;
      } else {
         var21 = new jc(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.ab[var22][var2][var3] == null) {
               this.ab[var22][var2][var3] = new is(var22, var2, var3);
            }
         }

         this.ab[var1][var2][var3].au = var21;
      }
   }

   public void bx(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.an; ++var4) {
         for(int var5 = 0; var5 < this.aw; ++var5) {
            for(int var6 = 0; var6 < this.ac; ++var6) {
               is var7 = this.ab[var4][var5][var6];
               if (var7 != null) {
                  jk var8 = var7.aq;
                  iz var10;
                  if (var8 != null && var8.ab instanceof iz) {
                     iz var9 = (iz)var8.ab;
                     this.bz(var9, var4, var5, var6, 1, 1);
                     if (var8.aq instanceof iz) {
                        var10 = (iz)var8.aq;
                        this.bz(var10, var4, var5, var6, 1, 1);
                        iz.by(var9, var10, 0, 0, 0, false);
                        var8.aq = var10.bb(var10.bo, var10.bz, var1, var2, var3);
                     }

                     var8.ab = var9.bb(var9.bo, var9.bz, var1, var2, var3);
                  }

                  for(int var12 = 0; var12 < var7.ay * -422028371; ++var12) {
                     jj var14 = var7.ao[var12];
                     if (var14 != null && var14.ab instanceof iz) {
                        iz var11 = (iz)var14.ab;
                        this.bz(var11, var4, var5, var6, var14.al * -1242897449 - var14.an * 626811319 + 1, var14.aa * -80616117 - var14.at * 2004902003 + 1);
                        var14.ab = var11.bb(var11.bo, var11.bz, var1, var2, var3);
                     }
                  }

                  ig var13 = var7.at;
                  if (var13 != null && var13.ac instanceof iz) {
                     var10 = (iz)var13.ac;
                     this.bo(var10, var4, var5, var6);
                     var13.ac = var10.bb(var10.bo, var10.bz, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   public void an(int var1) {
      this.aq = var1;

      for(int var2 = 0; var2 < this.aw; ++var2) {
         for(int var3 = 0; var3 < this.ac; ++var3) {
            if (this.ab[var1][var2][var3] == null) {
               this.ab[var1][var2][var3] = new is(var1, var2, var3);
            }
         }
      }

   }

   public void co(int var1, int var2, int var3, int var4, iv var5, iv var6, int var7, int var8, long var9, int var11) {
      if (var5 != null || var6 != null) {
         jk var12 = new jk();
         var12.al = var9 * -1417919518333993033L;
         var12.at = var11 * -2009432563;
         var12.an = var2 * -1436186496 + 1429390400;
         var12.aw = var3 * 430510720 + 215255360;
         var12.af = var4 * 1266004207;
         var12.ab = var5;
         var12.aq = var6;
         var12.ac = var7 * 1547196561;
         var12.au = var8 * 185156955;

         for(int var13 = var1; var13 >= 0; --var13) {
            if (this.ab[var13][var2][var3] == null) {
               this.ab[var13][var2][var3] = new is(var13, var2, var3);
            }
         }

         this.ab[var1][var2][var3].aq = var12;
      }
   }

   public void cz(int var1, int var2, int var3, int var4, iv var5, iv var6, int var7, int var8, long var9, int var11) {
      if (var5 != null || var6 != null) {
         jk var12 = new jk();
         var12.al = var9 * -1417919518333993033L;
         var12.at = var11 * -2009432563;
         var12.an = var2 * 636049255 + 1429390400;
         var12.aw = var3 * 937743245 + 215255360;
         var12.af = var4 * 1266004207;
         var12.ab = var5;
         var12.aq = var6;
         var12.ac = var7 * 1547196561;
         var12.au = var8 * -1139747265;

         for(int var13 = var1; var13 >= 0; --var13) {
            if (this.ab[var13][var2][var3] == null) {
               this.ab[var13][var2][var3] = new is(var13, var2, var3);
            }
         }

         this.ab[var1][var2][var3].aq = var12;
      }
   }

   public void cw(int var1, int var2, int var3, int var4, iv var5, iv var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      if (var5 != null) {
         je var14 = new je();
         var14.aa = var11 * -5837374244328004387L;
         var14.ay = var13 * -950429517;
         var14.aw = var2 * 1048590514 + -103901814;
         var14.ac = var3 * -119805042 + 799628480;
         var14.af = var4 * -33433415;
         var14.al = var5;
         var14.at = var6;
         var14.au = var7 * -1230454197;
         var14.ab = var8 * 1035196391;
         var14.an = var9 * 573665649;
         var14.aq = var10 * 94816048;

         for(int var15 = var1; var15 >= 0; --var15) {
            if (this.ab[var15][var2][var3] == null) {
               this.ab[var15][var2][var3] = new is(var15, var2, var3);
            }
         }

         this.ab[var1][var2][var3].al = var14;
      }
   }

   void bq(ij var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.af.length;

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.af[var9] - ad;
         var11 = var1.an[var9] - ae;
         var12 = var1.aw[var9] - ap;
         var13 = var12 * var4 + var10 * var5 >> 16;
         var12 = var12 * var5 - var10 * var4 >> 16;
         var10 = var13;
         var13 = var11 * var3 - var12 * var2 >> 16;
         var12 = var11 * var2 + var12 * var3 >> 16;
         if (var12 < 50) {
            return;
         }

         if (var1.aa != null) {
            ij.am[var9] = var10;
            ij.as[var9] = var13;
            ij.aj[var9] = var12;
         }

         ij.ah[var9] = gd.au(-1281475703) + var10 * eu.at(-262239897) / var12;
         ij.av[var9] = ax.ab(1099303209) + var13 * eu.at(467950564) / var12;
         ij.ar[var9] = df.au(var12, 1377339840);
      }

      in.ab.aw = 0;
      var8 = var1.aq.length;

      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.aq[var9];
         var11 = var1.al[var9];
         var12 = var1.at[var9];
         var13 = ij.ah[var10];
         int var14 = ij.ah[var11];
         int var15 = ij.ah[var12];
         int var16 = ij.av[var10];
         int var17 = ij.av[var11];
         int var18 = ij.av[var12];
         float var19 = ij.ar[var10];
         float var20 = ij.ar[var11];
         float var21 = ij.ar[var12];
         if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
            in.ab.af = false;
            int var22 = aq.aa(1359824041);
            if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > var22 || var14 > var22 || var15 > var22) {
               in.ab.af = true;
            }

            if (bx && bv(bz, bm, var16, var17, var18, var13, var14, var15)) {
               bd = var6;
               bt = var7;
            }

            if (var1.aa != null && var1.aa[var9] != -1) {
               if (!af) {
                  if (var1.ay) {
                     ig.am(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.ac[var9], var1.au[var9], var1.ab[var9], ij.am[0], ij.am[1], ij.am[3], ij.as[0], ij.as[1], ij.as[3], ij.aj[0], ij.aj[1], ij.aj[3], var1.aa[var9], (byte)12);
                  } else {
                     ig.am(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.ac[var9], var1.au[var9], var1.ab[var9], ij.am[var10], ij.am[var11], ij.am[var12], ij.as[var10], ij.as[var11], ij.as[var12], ij.aj[var10], ij.aj[var11], ij.aj[var12], var1.aa[var9], (byte)12);
                  }
               } else {
                  int var23 = in.ab.aq.ac(var1.aa[var9], -53407378);
                  jk.ah(var16, var17, var18, var13, var14, var15, var19, var20, var21, ba(var23, var1.ac[var9]), ba(var23, var1.au[var9]), ba(var23, var1.ab[var9]), -428480375);
               }
            } else if (var1.ac[var9] != 12345678) {
               jk.ah(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.ac[var9], var1.au[var9], var1.ab[var9], -428480375);
            }
         }
      }

   }

   static boolean ei(int var0, int var1, int var2) {
      int var3 = var2 * bi + var0 * be >> 16;
      int var4 = var2 * be - var0 * bi >> 16;
      int var5 = var1 * by + var4 * bb >> 16;
      int var6 = var1 * bb - var4 * by >> 16;
      if (var5 >= 50 && var5 <= 3500) {
         int var7 = cm + var3 * 128 / var5;
         int var8 = cf + var6 * 128 / var5;
         return var7 >= cl && var7 <= cr && var8 >= cg && var8 <= cy;
      } else {
         return false;
      }
   }

   public boolean ct(int var1, int var2, int var3, int var4, int var5, int var6, iv var7, int var8, long var9, int var11) {
      if (var7 == null) {
         return true;
      } else {
         int var12 = var2 * 128 + 64 * var5;
         int var13 = var3 * 128 + 64 * var6;
         return this.ai(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   boolean go(int var1, int var2, int var3) {
      int var4 = this.aa[var1][var2][var3];
      if (var4 == -av) {
         return false;
      } else if (var4 == av) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.ce(var5 + 1, this.au[var1][var2][var3], var6 + 1) && this.ce(var5 + 774467254 - 1, this.au[var1][var2 + 1][var3], var6 + 1) && this.ce(var5 + 128 - 1, this.au[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.ce(var5 + 1, this.au[var1][var2][var3 + 1], var6 + -345357968 - 1)) {
            this.aa[var1][var2][var3] = av;
            return true;
         } else {
            this.aa[var1][var2][var3] = -av;
            return false;
         }
      }
   }

   public boolean cd(int var1, int var2, int var3, int var4, int var5, iv var6, int var7, long var8, boolean var10) {
      if (var6 == null) {
         return true;
      } else {
         int var11 = var2 - var5;
         int var12 = var3 - var5;
         int var13 = var2 + var5;
         int var14 = var3 + var5;
         if (var10) {
            if (var7 > -705313121 && var7 < -1789666215) {
               var14 += 128;
            }

            if (var7 > 1152 && var7 < 1920) {
               var13 += 128;
            }

            if (var7 > 1664 || var7 < 384) {
               var12 -= 128;
            }

            if (var7 > 128 && var7 < 896) {
               var11 -= 128;
            }
         }

         var11 /= 128;
         var12 /= 128;
         var13 /= -300699903;
         var14 /= -756331864;
         return this.ai(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   public jj ae(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      if (var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.ay * -422028371; ++var5) {
            jj var6 = var4.ao[var5];
            if (eg.an(var6.ax * 5016412888503339625L) && var6.an * 626811319 == var2 && var6.at * 2004902003 == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   boolean dw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, iv var9, int var10, boolean var11, long var12, int var14) {
      int var16;
      for(int var15 = var2; var15 < var2 + var4; ++var15) {
         for(var16 = var3; var16 < var3 + var5; ++var16) {
            if (var15 < 0 || var16 < 0 || var15 >= this.aw || var16 >= this.ac) {
               return false;
            }

            is var17 = this.ab[var1][var15][var16];
            if (var17 != null && var17.ay * -422028371 >= 5) {
               return false;
            }
         }
      }

      jj var21 = new jj();
      var21.ax = var12 * 8415652607842018777L;
      var21.ai = var14 * -287536779;
      var21.af = var1 * -1695101227;
      var21.ac = var6 * -299460585;
      var21.au = var7 * -521982365;
      var21.aw = var8 * 1244562195;
      var21.ab = var9;
      var21.aq = var10 * -1843325159;
      var21.an = var2 * 843140103;
      var21.at = var3 * -700889925;
      var21.al = (var2 + var4 - 1) * 1300873191;
      var21.aa = (var3 + var5 - 1) * -1083409309;

      for(var16 = var2; var16 < var2 + var4; ++var16) {
         for(int var22 = var3; var22 < var3 + var5; ++var22) {
            int var18 = 0;
            if (var16 > var2) {
               ++var18;
            }

            if (var16 < var2 + var4 - 1) {
               var18 += 4;
            }

            if (var22 > var3) {
               var18 += 8;
            }

            if (var22 < var3 + var5 - 1) {
               var18 += 2;
            }

            for(int var19 = var1; var19 >= 0; --var19) {
               if (this.ab[var19][var16][var22] == null) {
                  this.ab[var19][var16][var22] = new is(var19, var16, var22);
               }
            }

            is var23 = this.ab[var1][var16][var22];
            var23.ao[var23.ay * -422028371] = var21;
            var23.ax[var23.ay * -422028371] = var18;
            var23.ai = (var23.ai * -1639156513 | var18) * -1238612193;
            var23.ay += 1425915941;
         }
      }

      if (var11) {
         this.at[this.al++] = var21;
      }

      return true;
   }

   public long eb(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      if (var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.ay * -422028371; ++var5) {
            jj var6 = var4.ao[var5];
            if (eg.an(var6.ax * 5016412888503339625L) && var6.an * 626811319 == var2 && var6.at * 2004902003 == var3) {
               return var6.ax * 5016412888503339625L;
            }
         }

         return 0L;
      }
   }

   static boolean ec(int var0, int var1, int var2) {
      int var3 = var2 * bi + var0 * be >> 16;
      int var4 = var2 * be - var0 * bi >> 16;
      int var5 = var1 * by + var4 * bb >> 16;
      int var6 = var1 * bb - var4 * by >> 16;
      if (var5 >= 50 && var5 <= 3500) {
         int var7 = cm + var3 * 128 / var5;
         int var8 = cf + var6 * 1922589476 / var5;
         return var7 >= cl && var7 <= cr && var8 >= cg && var8 <= cy;
      } else {
         return false;
      }
   }

   static boolean bv(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if (var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if (var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if (var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         int var9 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
         int var10 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
         if (var8 == 0) {
            if (var9 != 0) {
               return var9 < 0 ? var10 <= 0 : var10 >= 0;
            } else {
               return true;
            }
         } else {
            return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0;
         }
      }
   }

   public void dr() {
      for(int var1 = 0; var1 < this.al; ++var1) {
         jj var2 = this.at[var1];
         this.ah(var2);
         this.at[var1] = null;
      }

      this.al = 0;
   }

   public void dl() {
      for(int var1 = 0; var1 < this.al; ++var1) {
         jj var2 = this.at[var1];
         this.ah(var2);
         this.at[var1] = null;
      }

      this.al = 0;
   }

   void dk(jj var1) {
      for(int var2 = var1.an * 626811319; var2 <= var1.al * -1242897449; ++var2) {
         for(int var3 = var1.at * 2004902003; var3 <= var1.aa * -80616117; ++var3) {
            is var4 = this.ab[var1.af * -872547715][var2][var3];
            if (var4 != null) {
               int var5;
               for(var5 = 0; var5 < var4.ay * -422028371; ++var5) {
                  if (var4.ao[var5] == var1) {
                     var4.ay -= 1425915941;

                     for(int var6 = var5; var6 < var4.ay * -422028371; ++var6) {
                        var4.ao[var6] = var4.ao[var6 + 1];
                        var4.ax[var6] = var4.ax[var6 + 1];
                     }

                     var4.ao[var4.ay * -422028371] = null;
                     break;
                  }
               }

               var4.ai = 0;

               for(var5 = 0; var5 < var4.ay * -422028371; ++var5) {
                  var4.ai = (var4.ai * -1639156513 | var4.ax[var5]) * -1238612193;
               }
            }
         }
      }

   }

   public void cb(int var1, int var2, int var3, int var4, iv var5, long var6, iv var8, iv var9) {
      iy var10 = new iy();
      var10.ac = var5;
      var10.an = var2 * 1690125440 + 727966298;
      var10.aw = var3 * 1860701938 + -553669456;
      var10.af = var4 * -1407136659;
      var10.aq = var6 * 1651765281680972561L;
      var10.au = var8;
      var10.ab = var9;
      int var11 = 0;
      is var12 = this.ab[var1][var2][var3];
      if (var12 != null) {
         for(int var13 = 0; var13 < var12.ay * -422028371; ++var13) {
            if ((var12.ao[var13].ai * -72925475 & 256) == 946126479 && var12.ao[var13].ab instanceof it) {
               it var14 = (it)var12.ao[var13].ab;
               var14.ai();
               if (var14.et * -1655790643 > var11) {
                  var11 = var14.et * -1703861186;
               }
            }
         }
      }

      var10.al = var11 * -1223694975;
      if (this.ab[var1][var2][var3] == null) {
         this.ab[var1][var2][var3] = new is(var1, var2, var3);
      }

      this.ab[var1][var2][var3].aa = var10;
   }

   void fc(jc var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10 = var9 = (var7 << 7) - ad;
      int var11;
      int var12 = var11 = (var8 << 7) - ap;
      int var13;
      int var14 = var13 = var10 + 128;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = this.au[var2][var7][var8] - ae;
      int var18 = this.au[var2][var7 + 1][var8] - ae;
      int var19 = this.au[var2][var7 + 1][var8 + 1] - ae;
      int var20 = this.au[var2][var7][var8 + 1] - ae;
      int var21 = var12 * var5 + var10 * var6 >> 16;
      var12 = var12 * var6 - var10 * var5 >> 16;
      var10 = var21;
      var21 = var17 * var4 - var12 * var3 >> 16;
      var12 = var17 * var3 + var12 * var4 >> 16;
      var17 = var21;
      if (var12 >= 50) {
         var21 = var11 * var5 + var14 * var6 >> 16;
         var11 = var11 * var6 - var14 * var5 >> 16;
         var14 = var21;
         var21 = var18 * var4 - var11 * var3 >> 16;
         var11 = var18 * var3 + var11 * var4 >> 16;
         var18 = var21;
         if (var11 >= 50) {
            var21 = var16 * var5 + var13 * var6 >> 16;
            var16 = var16 * var6 - var13 * var5 >> 16;
            var13 = var21;
            var21 = var19 * var4 - var16 * var3 >> 16;
            var16 = var19 * var3 + var16 * var4 >> 16;
            var19 = var21;
            if (var16 >= 50) {
               var21 = var15 * var5 + var9 * var6 >> 16;
               var15 = var15 * var6 - var9 * var5 >> 16;
               var9 = var21;
               var21 = var20 * var4 - var15 * var3 >> 16;
               var15 = var20 * var3 + var15 * var4 >> 16;
               if (var15 >= 50) {
                  int var22 = gd.au(152327105) + var10 * eu.at(1709959539) / var12;
                  int var23 = ax.ab(-1799784725) + var17 * eu.at(-458868132) / var12;
                  int var24 = gd.au(224215122) + var14 * eu.at(-1551163317) / var11;
                  int var25 = ax.ab(-1677472546) + var18 * eu.at(207399840) / var11;
                  int var26 = gd.au(1031332055) + var13 * eu.at(1747134710) / var16;
                  int var27 = ax.ab(-339580575) + var19 * eu.at(1381353604) / var16;
                  int var28 = gd.au(1071045917) + var9 * eu.at(1669417007) / var15;
                  int var29 = ax.ab(-2035104323) + var21 * eu.at(-667411762) / var15;
                  float var30 = df.au(var12, -205271252);
                  float var31 = df.au(var11, 206487084);
                  float var32 = df.au(var16, 877264301);
                  float var33 = df.au(var15, 1574369892);
                  in.ab.aw = 0;
                  int var34;
                  int var35;
                  if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
                     in.ab.af = false;
                     var34 = aq.aa(1858940787);
                     if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > var34 || var28 > var34 || var24 > var34) {
                        in.ab.af = true;
                     }

                     if (bx && bv(bz, bm, var27, var29, var25, var26, var28, var24)) {
                        bd = var7;
                        bt = var8;
                     }

                     if (var1.au * 412494011 == -1) {
                        if (var1.aw * -1667175185 != 12345678) {
                           jk.ah(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.aw * -1667175185, var1.ac * 890568309, var1.an * 40257399, -428480375);
                        }
                     } else if (!af) {
                        if (var1.ab) {
                           ig.am(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.aw * -1667175185, var1.ac * 890568309, var1.an * 40257399, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.au * 412494011, (byte)12);
                        } else {
                           ig.am(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.aw * -1667175185, var1.ac * 890568309, var1.an * 40257399, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.au * 412494011, (byte)12);
                        }
                     } else {
                        var35 = in.ab.aq.ac(var1.au * 412494011, 511783233);
                        jk.ah(var27, var29, var25, var26, var28, var24, var32, var33, var31, ba(var35, var1.aw * -1667175185), ba(var35, var1.ac * 890568309), ba(var35, var1.an * 40257399), -428480375);
                     }
                  }

                  if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                     in.ab.af = false;
                     var34 = aq.aa(-1179959407);
                     if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > var34 || var24 > var34 || var28 > var34) {
                        in.ab.af = true;
                     }

                     if (bx && bv(bz, bm, var23, var25, var29, var22, var24, var28)) {
                        bd = var7;
                        bt = var8;
                     }

                     if (var1.au * 412494011 == -1) {
                        if (var1.af * 1860851959 != 12345678) {
                           jk.ah(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.af * 1860851959, var1.an * 40257399, var1.ac * 890568309, -428480375);
                        }
                     } else if (!af) {
                        ig.am(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.af * 1860851959, var1.an * 40257399, var1.ac * 890568309, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.au * 412494011, (byte)12);
                     } else {
                        var35 = in.ab.aq.ac(var1.au * 412494011, -1066026485);
                        jk.ah(var23, var25, var29, var22, var24, var28, var30, var31, var33, ba(var35, var1.af * 1860851959), ba(var35, var1.an * 40257399), ba(var35, var1.ac * 890568309), -428480375);
                     }
                  }

               }
            }
         }
      }
   }

   public static void ey(int[] var0, int var1, int var2, int var3, int var4) {
      cl = 0;
      cg = 0;
      cr = var3;
      cy = var4;
      cm = var3 / 2;
      cf = var4 / 2;
      boolean[][][][] var5 = new boolean[var0.length][27098421][53][53];

      int var6;
      int var7;
      int var8;
      int var9;
      int var11;
      int var12;
      for(var6 = 128; var6 <= 383; var6 += 32) {
         for(var7 = 0; var7 < 2048; var7 += 64) {
            by = in.ac[var6];
            bb = in.au[var6];
            bi = in.ac[var7];
            be = in.au[var7];
            var8 = (var6 - 128) / 32;
            var9 = var7 / 64;

            for(int var10 = -1437970101; var10 < 26; ++var10) {
               for(var11 = -26; var11 < 26; ++var11) {
                  var12 = var10 * 128;
                  int var13 = var11 * -2117711592;
                  boolean var14 = false;

                  for(int var15 = -var1; var15 <= var2; var15 += 128) {
                     if (bt(var12, var0[var8] + var15, var13)) {
                        var14 = true;
                        break;
                     }
                  }

                  var5[var8][var9][var10 + 25 + 1][var11 + 25 + 1] = var14;
               }
            }
         }
      }

      for(var6 = 0; var6 < 8; ++var6) {
         for(var7 = 0; var7 < 32; ++var7) {
            for(var8 = -25; var8 < 25; ++var8) {
               for(var9 = 1081702798; var9 < 25; ++var9) {
                  boolean var16 = false;

                  label105:
                  for(var11 = -1; var11 <= 1; ++var11) {
                     for(var12 = -1; var12 <= 1; ++var12) {
                        if (var5[var6][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label105;
                        }

                        if (var5[var6][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label105;
                        }

                        if (var5[var6 + 1][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label105;
                        }

                        if (var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label105;
                        }
                     }
                  }

                  ck[var6][var7][var8 + 25][var9 + 25] = var16;
               }
            }
         }
      }

   }

   public void dg(int var1, int var2, int var3, int var4) {
      is var5 = this.ab[var1][var2][var3];
      if (var5 != null) {
         je var6 = var5.al;
         if (var6 != null) {
            var6.an = var6.an * 1353438721 * var4 / 16 * -1372050943;
            var6.aq = var6.aq * 1573434537 * var4 / 16 * -965136487;
         }
      }
   }

   public void de(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      if (var4 != null) {
         var4.aq = null;
      }
   }

   public void dh(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      if (var4 != null) {
         var4.aq = null;
      }
   }

   public void dp(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      if (var4 != null) {
         var4.al = null;
      }
   }

   public void cy(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      jc var21;
      int var22;
      if (var4 == 0) {
         var21 = new jc(var11, var12, var13, var14, -1, var19, false);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.ab[var22][var2][var3] == null) {
               this.ab[var22][var2][var3] = new is(var22, var2, var3);
            }
         }

         this.ab[var1][var2][var3].au = var21;
      } else if (var4 != 1) {
         ij var23 = new ij(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.ab[var22][var2][var3] == null) {
               this.ab[var22][var2][var3] = new is(var22, var2, var3);
            }
         }

         this.ab[var1][var2][var3].ab = var23;
      } else {
         var21 = new jc(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.ab[var22][var2][var3] == null) {
               this.ab[var22][var2][var3] = new is(var22, var2, var3);
            }
         }

         this.ab[var1][var2][var3].au = var21;
      }
   }

   public void ev(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.an; ++var4) {
         for(int var5 = 0; var5 < this.aw; ++var5) {
            for(int var6 = 0; var6 < this.ac; ++var6) {
               is var7 = this.ab[var4][var5][var6];
               if (var7 != null) {
                  jk var8 = var7.aq;
                  iz var10;
                  if (var8 != null && var8.ab instanceof iz) {
                     iz var9 = (iz)var8.ab;
                     this.bz(var9, var4, var5, var6, 1, 1);
                     if (var8.aq instanceof iz) {
                        var10 = (iz)var8.aq;
                        this.bz(var10, var4, var5, var6, 1, 1);
                        iz.by(var9, var10, 0, 0, 0, false);
                        var8.aq = var10.bb(var10.bo, var10.bz, var1, var2, var3);
                     }

                     var8.ab = var9.bb(var9.bo, var9.bz, var1, var2, var3);
                  }

                  for(int var12 = 0; var12 < var7.ay * -422028371; ++var12) {
                     jj var14 = var7.ao[var12];
                     if (var14 != null && var14.ab instanceof iz) {
                        iz var11 = (iz)var14.ab;
                        this.bz(var11, var4, var5, var6, var14.al * -1242897449 - var14.an * 626811319 + 1, var14.aa * -80616117 - var14.at * 2004902003 + 1);
                        var14.ab = var11.bb(var11.bo, var11.bz, var1, var2, var3);
                     }
                  }

                  ig var13 = var7.at;
                  if (var13 != null && var13.ac instanceof iz) {
                     var10 = (iz)var13.ac;
                     this.bo(var10, var4, var5, var6);
                     var13.ac = var10.bb(var10.bo, var10.bz, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   public void ak(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      if (var4 != null) {
         var4.aa = null;
      }
   }

   public void dq(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      if (var4 != null) {
         for(int var5 = 0; var5 < var4.ay * -422028371; ++var5) {
            jj var6 = var4.ao[var5];
            if (eg.an(var6.ax * 5016412888503339625L) && var6.an * 626811319 == var2 && var6.at * 2004902003 == var3) {
               this.ah(var6);
               return;
            }
         }

      }
   }

   public void dd(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      if (var4 != null) {
         var4.at = null;
      }
   }

   public void af() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.an; ++var1) {
         for(var2 = 0; var2 < this.aw; ++var2) {
            for(int var3 = 0; var3 < this.ac; ++var3) {
               this.ab[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < br; ++var1) {
         for(var2 = 0; var2 < bg[var1]; ++var2) {
            bu[var1][var2] = null;
         }

         bg[var1] = 0;
      }

      for(var1 = 0; var1 < this.al; ++var1) {
         this.at[var1] = null;
      }

      this.al = 0;

      for(var1 = 0; var1 < bk.length; ++var1) {
         bk[var1] = null;
      }

   }

   public void am(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      if (var4 != null) {
         var4.al = null;
      }
   }

   public void ar(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      if (var4 != null) {
         var4.aq = null;
      }
   }

   public static boolean fb() {
      return bj && bd != -1;
   }

   public je ds(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      return var4 == null ? null : var4.al;
   }

   public jj da(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      if (var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.ay * -422028371; ++var5) {
            jj var6 = var4.ao[var5];
            if (eg.an(var6.ax * 5016412888503339625L) && var6.an * 626811319 == var2 && var6.at * 2004902003 == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   public void al(int var1, int var2, int var3, int var4, iv var5, long var6, iv var8, iv var9) {
      iy var10 = new iy();
      var10.ac = var5;
      var10.an = var2 * 1690125440 + 845062720;
      var10.aw = var3 * 2013560960 + 1006780480;
      var10.af = var4 * -1773379811;
      var10.aq = var6 * 1651765281680972561L;
      var10.au = var8;
      var10.ab = var9;
      int var11 = 0;
      is var12 = this.ab[var1][var2][var3];
      if (var12 != null) {
         for(int var13 = 0; var13 < var12.ay * -422028371; ++var13) {
            if ((var12.ao[var13].ai * -72925475 & 256) == 256 && var12.ao[var13].ab instanceof it) {
               it var14 = (it)var12.ao[var13].ab;
               var14.ai();
               if (var14.et * 1550732737 > var11) {
                  var11 = var14.et * 1550732737;
               }
            }
         }
      }

      var10.al = var11 * -1223694975;
      if (this.ab[var1][var2][var3] == null) {
         this.ab[var1][var2][var3] = new is(var1, var2, var3);
      }

      this.ab[var1][var2][var3].aa = var10;
   }

   public jj eo(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      if (var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.ay * -422028371; ++var5) {
            jj var6 = var4.ao[var5];
            if (eg.an(var6.ax * 5016412888503339625L) && var6.an * -1013298122 == var2 && var6.at * 549147291 == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   public ig eq(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      return var4 != null && var4.at != null ? var4.at : null;
   }

   public ig et(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      return var4 != null && var4.at != null ? var4.at : null;
   }

   public ig ef(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      return var4 != null && var4.at != null ? var4.at : null;
   }

   boolean dc(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, iv var9, int var10, boolean var11, long var12, int var14) {
      int var16;
      for(int var15 = var2; var15 < var2 + var4; ++var15) {
         for(var16 = var3; var16 < var3 + var5; ++var16) {
            if (var15 < 0 || var16 < 0 || var15 >= this.aw || var16 >= this.ac) {
               return false;
            }

            is var17 = this.ab[var1][var15][var16];
            if (var17 != null && var17.ay * -422028371 >= 5) {
               return false;
            }
         }
      }

      jj var21 = new jj();
      var21.ax = var12 * 8415652607842018777L;
      var21.ai = var14 * -287536779;
      var21.af = var1 * -1695101227;
      var21.ac = var6 * -299460585;
      var21.au = var7 * -521982365;
      var21.aw = var8 * 1244562195;
      var21.ab = var9;
      var21.aq = var10 * -1843325159;
      var21.an = var2 * 843140103;
      var21.at = var3 * -700889925;
      var21.al = (var2 + var4 - 1) * 1300873191;
      var21.aa = (var3 + var5 - 1) * -1083409309;

      for(var16 = var2; var16 < var2 + var4; ++var16) {
         for(int var22 = var3; var22 < var3 + var5; ++var22) {
            int var18 = 0;
            if (var16 > var2) {
               ++var18;
            }

            if (var16 < var2 + var4 - 1) {
               var18 += 4;
            }

            if (var22 > var3) {
               var18 += 8;
            }

            if (var22 < var3 + var5 - 1) {
               var18 += 2;
            }

            for(int var19 = var1; var19 >= 0; --var19) {
               if (this.ab[var19][var16][var22] == null) {
                  this.ab[var19][var16][var22] = new is(var19, var16, var22);
               }
            }

            is var23 = this.ab[var1][var16][var22];
            var23.ao[var23.ay * -422028371] = var21;
            var23.ax[var23.ay * -422028371] = var18;
            var23.ai = (var23.ai * -1639156513 | var18) * -1238612193;
            var23.ay += 1425915941;
         }
      }

      if (var11) {
         this.at[this.al++] = var21;
      }

      return true;
   }

   public long ej(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      return var4 != null && var4.aq != null ? var4.aq.al * -4009183385476919801L : 0L;
   }

   public long ea(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      return var4 != null && var4.al != null ? var4.al.aa * -4691380879163567243L : 0L;
   }

   public long eu(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      return var4 != null && var4.al != null ? var4.al.aa * -4691380879163567243L : 0L;
   }

   public void bm(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      is var7 = this.ab[var4][var5][var6];
      if (var7 != null) {
         jc var8 = var7.au;
         int var10;
         if (var8 != null) {
            int var18 = var8.aq * -2143818661;
            if (var18 != 0) {
               for(var10 = 0; var10 < 4; ++var10) {
                  var1[var2] = var18;
                  var1[var2 + 1] = var18;
                  var1[var2 + 2] = var18;
                  var1[var2 + 3] = var18;
                  var2 += var3;
               }

            }
         } else {
            ij var9 = var7.ab;
            if (var9 != null) {
               var10 = var9.ao;
               int var11 = var9.ax;
               int var12 = var9.ai;
               int var13 = var9.ag;
               int[] var14 = this.ca[var10];
               int[] var15 = this.cu[var11];
               int var16 = 0;
               int var17;
               if (var12 != 0) {
                  for(var17 = 0; var17 < 4; ++var17) {
                     var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var2 += var3;
                  }
               } else {
                  for(var17 = 0; var17 < 4; ++var17) {
                     if (var14[var15[var16++]] != 0) {
                        var1[var2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 1] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 3] = var13;
                     }

                     var2 += var3;
                  }
               }

            }
         }
      }
   }

   public void dv(int var1, int var2, int var3, int var4) {
      is var5 = this.ab[var1][var2][var3];
      if (var5 != null) {
         je var6 = var5.al;
         if (var6 != null) {
            var6.an = var6.an * 1353438721 * var4 / 16 * -1372050943;
            var6.aq = var6.aq * 1573434537 * var4 / 16 * -965136487;
         }
      }
   }

   public long el(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      return var4 != null && var4.at != null ? var4.at.au * 3423223696102332293L : 0L;
   }

   public long en(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      return var4 != null && var4.at != null ? var4.at.au * 3423223696102332293L : 0L;
   }

   public long er(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      return var4 != null && var4.at != null ? var4.at.au * 3423223696102332293L : 0L;
   }

   public void aw(int var1, int var2) {
      is var3 = this.ab[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         is var5 = this.ab[var4][var1][var2] = this.ab[var4 + 1][var1][var2];
         if (var5 != null) {
            var5.af -= -1846949283;

            for(int var6 = 0; var6 < var5.ay * -422028371; ++var6) {
               jj var7 = var5.ao[var6];
               if (eg.an(var7.ax * 5016412888503339625L) && var7.an * 626811319 == var1 && var7.at * 2004902003 == var2) {
                  var7.af -= -1695101227;
               }
            }
         }
      }

      if (this.ab[0][var1][var2] == null) {
         this.ab[0][var1][var2] = new is(0, var1, var2);
      }

      this.ab[0][var1][var2].az = var3;
      this.ab[3][var1][var2] = null;
   }

   public ie(int var1, int var2, int var3, int[][][] var4) {
      this.an = var1;
      this.aw = var2;
      this.ac = var3;
      this.ab = new is[var1][var2][var3];
      this.aa = new int[var1][var2 + 1][var3 + 1];
      this.au = var4;
      this.af();
   }

   boolean di(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, iv var9, int var10, boolean var11, long var12, int var14) {
      int var16;
      for(int var15 = var2; var15 < var2 + var4; ++var15) {
         for(var16 = var3; var16 < var3 + var5; ++var16) {
            if (var15 < 0 || var16 < 0 || var15 >= this.aw || var16 >= this.ac) {
               return false;
            }

            is var17 = this.ab[var1][var15][var16];
            if (var17 != null && var17.ay * -422028371 >= 5) {
               return false;
            }
         }
      }

      jj var21 = new jj();
      var21.ax = var12 * 8415652607842018777L;
      var21.ai = var14 * -287536779;
      var21.af = var1 * 612685000;
      var21.ac = var6 * -299460585;
      var21.au = var7 * -521982365;
      var21.aw = var8 * 1244562195;
      var21.ab = var9;
      var21.aq = var10 * -1954495765;
      var21.an = var2 * -88162564;
      var21.at = var3 * 2046923899;
      var21.al = (var2 + var4 - 1) * -252275479;
      var21.aa = (var3 + var5 - 1) * -2096755578;

      for(var16 = var2; var16 < var2 + var4; ++var16) {
         for(int var22 = var3; var22 < var3 + var5; ++var22) {
            int var18 = 0;
            if (var16 > var2) {
               ++var18;
            }

            if (var16 < var2 + var4 - 1) {
               var18 += 4;
            }

            if (var22 > var3) {
               var18 += 8;
            }

            if (var22 < var3 + var5 - 1) {
               var18 += 2;
            }

            for(int var19 = var1; var19 >= 0; --var19) {
               if (this.ab[var19][var16][var22] == null) {
                  this.ab[var19][var16][var22] = new is(var19, var16, var22);
               }
            }

            is var23 = this.ab[var1][var16][var22];
            var23.ao[var23.ay * -500956505] = var21;
            var23.ax[var23.ay * 2051205013] = var18;
            var23.ai = (var23.ai * -1639156513 | var18) * -1103643925;
            var23.ay += -1906808367;
         }
      }

      if (var11) {
         this.at[this.al++] = var21;
      }

      return true;
   }

   public void em(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.an; ++var4) {
         for(int var5 = 0; var5 < this.aw; ++var5) {
            for(int var6 = 0; var6 < this.ac; ++var6) {
               is var7 = this.ab[var4][var5][var6];
               if (var7 != null) {
                  jk var8 = var7.aq;
                  iz var10;
                  if (var8 != null && var8.ab instanceof iz) {
                     iz var9 = (iz)var8.ab;
                     this.bz(var9, var4, var5, var6, 1, 1);
                     if (var8.aq instanceof iz) {
                        var10 = (iz)var8.aq;
                        this.bz(var10, var4, var5, var6, 1, 1);
                        iz.by(var9, var10, 0, 0, 0, false);
                        var8.aq = var10.bb(var10.bo, var10.bz, var1, var2, var3);
                     }

                     var8.ab = var9.bb(var9.bo, var9.bz, var1, var2, var3);
                  }

                  for(int var12 = 0; var12 < var7.ay * -422028371; ++var12) {
                     jj var14 = var7.ao[var12];
                     if (var14 != null && var14.ab instanceof iz) {
                        iz var11 = (iz)var14.ab;
                        this.bz(var11, var4, var5, var6, var14.al * -1242897449 - var14.an * 626811319 + 1, var14.aa * -80616117 - var14.at * 2004902003 + 1);
                        var14.ab = var11.bb(var11.bo, var11.bz, var1, var2, var3);
                     }
                  }

                  ig var13 = var7.at;
                  if (var13 != null && var13.ac instanceof iz) {
                     var10 = (iz)var13.ac;
                     this.bo(var10, var4, var5, var6);
                     var13.ac = var10.bb(var10.bo, var10.bz, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   void fv(is var1, boolean var2) {
      ba.an(var1);

      while(true) {
         is var3;
         int var4;
         int var5;
         int var6;
         int var7;
         is[][] var8;
         is var9;
         int var11;
         int var14;
         int var15;
         int var16;
         int var24;
         int var26;
         do {
            do {
               do {
                  do {
                     do {
                        do {
                           while(true) {
                              jk var10;
                              jj var12;
                              int var17;
                              int var18;
                              int var21;
                              boolean var22;
                              is var33;
                              while(true) {
                                 do {
                                    var3 = (is)ba.au();
                                    if (var3 == null) {
                                       return;
                                    }
                                 } while(!var3.av);

                                 var4 = var3.an * -464760837;
                                 var5 = var3.aw * -1812849043;
                                 var6 = var3.af * 1527994869;
                                 var7 = var3.ac * 1520539719;
                                 var8 = this.ab[var6];
                                 if (!var3.ah) {
                                    break;
                                 }

                                 if (var2) {
                                    if (var6 > 0) {
                                       var9 = this.ab[var6 - 1][var4][var5];
                                       if (var9 != null && var9.av) {
                                          continue;
                                       }
                                    }

                                    if (var4 <= ak && var4 > ar) {
                                       var9 = var8[var4 - 1][var5];
                                       if (var9 != null && var9.av && (var9.ah || (var3.ai * -1639156513 & 1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var4 >= ak && var4 < am - 1) {
                                       var9 = var8[var4 + 1][var5];
                                       if (var9 != null && var9.av && (var9.ah || (var3.ai * -1639156513 & 4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 <= az && var5 > as) {
                                       var9 = var8[var4][var5 - 1];
                                       if (var9 != null && var9.av && (var9.ah || (var3.ai * -1639156513 & 8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 >= az && var5 < aj - 1) {
                                       var9 = var8[var4][var5 + 1];
                                       if (var9 != null && var9.av && (var9.ah || (var3.ai * -1639156513 & 2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    var2 = true;
                                 }

                                 var3.ah = false;
                                 if (var3.az != null) {
                                    var9 = var3.az;
                                    if (var9.au != null) {
                                       if (!this.bp(0, var4, var5)) {
                                          this.bf(var9.au, 0, by, bb, bi, be, var4, var5);
                                       }
                                    } else if (var9.ab != null && !this.bp(0, var4, var5)) {
                                       this.bq(var9.ab, by, bb, bi, be, var4, var5);
                                    }

                                    var10 = var9.aq;
                                    if (var10 != null) {
                                       var10.ab.df(0, by, bb, bi, be, var10.an * -1998748175 - ad, var10.af * 1061912079 - ae, var10.aw * -1171883603 - ap, var10.al * -4009183385476919801L);
                                    }

                                    for(var11 = 0; var11 < var9.ay * -422028371; ++var11) {
                                       var12 = var9.ao[var11];
                                       if (var12 != null) {
                                          var12.ab.df(var12.aq * -1521986263, by, bb, bi, be, var12.ac * -1546117209 - ad, var12.aw * 1042267931 - ae, var12.au * 1463075659 - ap, var12.ax * 5016412888503339625L);
                                       }
                                    }
                                 }

                                 var22 = false;
                                 if (var3.au != null) {
                                    if (!this.bp(var7, var4, var5)) {
                                       var22 = true;
                                       if (var3.au.aw * -1667175185 != 12345678 || bx && var6 <= bo) {
                                          this.bf(var3.au, var7, by, bb, bi, be, var4, var5);
                                       }
                                    }
                                 } else if (var3.ab != null && !this.bp(var7, var4, var5)) {
                                    var22 = true;
                                    this.bq(var3.ab, by, bb, bi, be, var4, var5);
                                 }

                                 var21 = 0;
                                 var11 = 0;
                                 jk var23 = var3.aq;
                                 je var13 = var3.al;
                                 if (var23 != null || var13 != null) {
                                    if (ak == var4) {
                                       ++var21;
                                    } else if (ak < var4) {
                                       var21 += 2;
                                    }

                                    if (az == var5) {
                                       var21 += 3;
                                    } else if (az > var5) {
                                       var21 += 6;
                                    }

                                    var11 = bv[var21];
                                    var3.ak = bp[var21] * 1933576483;
                                 }

                                 if (var23 != null) {
                                    if ((var23.ac * -137992079 & bl[var21]) != 0) {
                                       if (var23.ac * -137992079 == 16) {
                                          var3.am = -875132571;
                                          var3.as = bc[var21] * 1761397621;
                                          var3.aj = 520035649 - var3.as * 1049420895;
                                       } else if (var23.ac * -137992079 == 32) {
                                          var3.am = -1750265142;
                                          var3.as = bh[var21] * 1761397621;
                                          var3.aj = 1040071298 - var3.as * 1049420895;
                                       } else if (var23.ac * -137992079 == 64) {
                                          var3.am = 794437012;
                                          var3.as = bw[var21] * 1761397621;
                                          var3.aj = 2080142596 - var3.as * 1049420895;
                                       } else {
                                          var3.am = 1669569583;
                                          var3.as = ce[var21] * 1761397621;
                                          var3.aj = 1560106947 - var3.as * 1049420895;
                                       }
                                    } else {
                                       var3.am = 0;
                                    }

                                    if ((var23.ac * -137992079 & var11) != 0 && !this.bc(var7, var4, var5, var23.ac * -137992079)) {
                                       var23.ab.df(0, by, bb, bi, be, var23.an * -1998748175 - ad, var23.af * 1061912079 - ae, var23.aw * -1171883603 - ap, var23.al * -4009183385476919801L);
                                    }

                                    if ((var23.au * 379413203 & var11) != 0 && !this.bc(var7, var4, var5, var23.au * 379413203)) {
                                       var23.aq.df(0, by, bb, bi, be, var23.an * -1998748175 - ad, var23.af * 1061912079 - ae, var23.aw * -1171883603 - ap, var23.al * -4009183385476919801L);
                                    }
                                 }

                                 if (var13 != null && !this.bh(var7, var4, var5, var13.al.et * 1550732737)) {
                                    if ((var13.au * -607881373 & var11) != 0) {
                                       var13.al.df(0, by, bb, bi, be, var13.aw * 1346340783 - ad + var13.an * 1353438721, var13.af * 452898185 - ae, var13.ac * 1328351163 - ap + var13.aq * 1573434537, var13.aa * -4691380879163567243L);
                                    } else if (var13.au * -607881373 == 256) {
                                       var14 = var13.aw * 1346340783 - ad;
                                       var15 = var13.af * 452898185 - ae;
                                       var16 = var13.ac * 1328351163 - ap;
                                       var17 = var13.ab * -1711060009;
                                       if (var17 != 1 && var17 != 2) {
                                          var18 = var14;
                                       } else {
                                          var18 = -var14;
                                       }

                                       int var19;
                                       if (var17 != 2 && var17 != 3) {
                                          var19 = var16;
                                       } else {
                                          var19 = -var16;
                                       }

                                       if (var19 < var18) {
                                          var13.al.df(0, by, bb, bi, be, var14 + var13.an * 1353438721, var15, var16 + var13.aq * 1573434537, var13.aa * -4691380879163567243L);
                                       } else if (var13.at != null) {
                                          var13.at.df(0, by, bb, bi, be, var14, var15, var16, var13.aa * -4691380879163567243L);
                                       }
                                    }
                                 }

                                 if (var22) {
                                    ig var27 = var3.at;
                                    if (var27 != null) {
                                       var27.ac.df(0, by, bb, bi, be, var27.an * 487195023 - ad, var27.af * 1777058639 - ae, var27.aw * -1480835961 - ap, var27.au * 3423223696102332293L);
                                    }

                                    iy var31 = var3.aa;
                                    if (var31 != null && var31.al * -1118938495 == 0) {
                                       if (var31.au != null) {
                                          var31.au.df(0, by, bb, bi, be, var31.an * -1473635399 - ad, var31.af * 2064997173 - ae, var31.aw * -1839139071 - ap, var31.aq * -8562400470617197071L);
                                       }

                                       if (var31.ab != null) {
                                          var31.ab.df(0, by, bb, bi, be, var31.an * -1473635399 - ad, var31.af * 2064997173 - ae, var31.aw * -1839139071 - ap, var31.aq * -8562400470617197071L);
                                       }

                                       if (var31.ac != null) {
                                          var31.ac.df(0, by, bb, bi, be, var31.an * -1473635399 - ad, var31.af * 2064997173 - ae, var31.aw * -1839139071 - ap, var31.aq * -8562400470617197071L);
                                       }
                                    }
                                 }

                                 var14 = var3.ai * -1639156513;
                                 if (var14 != 0) {
                                    if (var4 < ak && (var14 & 4) != 0) {
                                       var33 = var8[var4 + 1][var5];
                                       if (var33 != null && var33.av) {
                                          ba.an(var33);
                                       }
                                    }

                                    if (var5 < az && (var14 & 2) != 0) {
                                       var33 = var8[var4][var5 + 1];
                                       if (var33 != null && var33.av) {
                                          ba.an(var33);
                                       }
                                    }

                                    if (var4 > ak && (var14 & 1) != 0) {
                                       var33 = var8[var4 - 1][var5];
                                       if (var33 != null && var33.av) {
                                          ba.an(var33);
                                       }
                                    }

                                    if (var5 > az && (var14 & 8) != 0) {
                                       var33 = var8[var4][var5 - 1];
                                       if (var33 != null && var33.av) {
                                          ba.an(var33);
                                       }
                                    }
                                 }
                                 break;
                              }

                              if (var3.am * 1223983431 != 0) {
                                 var22 = true;

                                 for(var21 = 0; var21 < var3.ay * -422028371; ++var21) {
                                    if (var3.ao[var21].ao * -1033646519 != av && (var3.ax[var21] & var3.am * 1223983431) == var3.as * -1655477027) {
                                       var22 = false;
                                       break;
                                    }
                                 }

                                 if (var22) {
                                    var10 = var3.aq;
                                    if (!this.bc(var7, var4, var5, var10.ac * -137992079)) {
                                       var10.ab.df(0, by, bb, bi, be, var10.an * -1998748175 - ad, var10.af * 1061912079 - ae, var10.aw * -1171883603 - ap, var10.al * -4009183385476919801L);
                                    }

                                    var3.am = 0;
                                 }
                              }

                              if (!var3.ar) {
                                 break;
                              }

                              try {
                                 int var25 = var3.ay * -422028371;
                                 var3.ar = false;
                                 var21 = 0;

                                 label563:
                                 for(var11 = 0; var11 < var25; ++var11) {
                                    var12 = var3.ao[var11];
                                    if (var12.ao * -1033646519 != av) {
                                       for(var26 = var12.an * 626811319; var26 <= var12.al * -1242897449; ++var26) {
                                          for(var14 = var12.at * 2004902003; var14 <= var12.aa * -80616117; ++var14) {
                                             var33 = var8[var26][var14];
                                             if (var33.ah) {
                                                var3.ar = true;
                                                continue label563;
                                             }

                                             if (var33.am * 1223983431 != 0) {
                                                var16 = 0;
                                                if (var26 > var12.an * 626811319) {
                                                   ++var16;
                                                }

                                                if (var26 < var12.al * -1242897449) {
                                                   var16 += 4;
                                                }

                                                if (var14 > var12.at * 2004902003) {
                                                   var16 += 8;
                                                }

                                                if (var14 < var12.aa * -80616117) {
                                                   var16 += 2;
                                                }

                                                if ((var16 & var33.am * 1223983431) == var3.aj * 485316675) {
                                                   var3.ar = true;
                                                   continue label563;
                                                }
                                             }
                                          }
                                       }

                                       bk[var21++] = var12;
                                       var26 = ak - var12.an * 626811319;
                                       var14 = var12.al * -1242897449 - ak;
                                       if (var14 > var26) {
                                          var26 = var14;
                                       }

                                       var15 = az - var12.at * 2004902003;
                                       var16 = var12.aa * -80616117 - az;
                                       if (var16 > var15) {
                                          var12.ay = (var26 + var16) * -1266251803;
                                       } else {
                                          var12.ay = (var26 + var15) * -1266251803;
                                       }
                                    }
                                 }

                                 while(var21 > 0) {
                                    var11 = -50;
                                    var24 = -1;

                                    for(var26 = 0; var26 < var21; ++var26) {
                                       jj var34 = bk[var26];
                                       if (var34.ao * -1033646519 != av) {
                                          if (var34.ay * 308174317 > var11) {
                                             var11 = var34.ay * 308174317;
                                             var24 = var26;
                                          } else if (var34.ay * 308174317 == var11) {
                                             var15 = var34.ac * -1546117209 - ad;
                                             var16 = var34.au * 1463075659 - ap;
                                             var17 = bk[var24].ac * -1546117209 - ad;
                                             var18 = bk[var24].au * 1463075659 - ap;
                                             if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
                                                var24 = var26;
                                             }
                                          }
                                       }
                                    }

                                    if (var24 == -1) {
                                       break;
                                    }

                                    jj var35 = bk[var24];
                                    var35.ao = av * -76184583;
                                    if (!this.bw(var7, var35.an * 626811319, var35.al * -1242897449, var35.at * 2004902003, var35.aa * -80616117, var35.ab.et * 1550732737)) {
                                       var35.ab.df(var35.aq * -1521986263, by, bb, bi, be, var35.ac * -1546117209 - ad, var35.aw * 1042267931 - ae, var35.au * 1463075659 - ap, var35.ax * 5016412888503339625L);
                                    }

                                    for(var14 = var35.an * 626811319; var14 <= var35.al * -1242897449; ++var14) {
                                       for(var15 = var35.at * 2004902003; var15 <= var35.aa * -80616117; ++var15) {
                                          is var36 = var8[var14][var15];
                                          if (var36.am * 1223983431 != 0) {
                                             ba.an(var36);
                                          } else if ((var14 != var4 || var15 != var5) && var36.av) {
                                             ba.an(var36);
                                          }
                                       }
                                    }
                                 }

                                 if (!var3.ar) {
                                    break;
                                 }
                              } catch (Exception var20) {
                                 var3.ar = false;
                                 break;
                              }
                           }
                        } while(!var3.av);
                     } while(var3.am * 1223983431 != 0);

                     if (var4 > ak || var4 <= ar) {
                        break;
                     }

                     var9 = var8[var4 - 1][var5];
                  } while(var9 != null && var9.av);

                  if (var4 < ak || var4 >= am - 1) {
                     break;
                  }

                  var9 = var8[var4 + 1][var5];
               } while(var9 != null && var9.av);

               if (var5 > az || var5 <= as) {
                  break;
               }

               var9 = var8[var4][var5 - 1];
            } while(var9 != null && var9.av);

            if (var5 < az || var5 >= aj - 1) {
               break;
            }

            var9 = var8[var4][var5 + 1];
         } while(var9 != null && var9.av);

         var3.av = false;
         --ag;
         iy var29 = var3.aa;
         if (var29 != null && var29.al * -1118938495 != 0) {
            if (var29.au != null) {
               var29.au.df(0, by, bb, bi, be, var29.an * -1473635399 - ad, var29.af * 2064997173 - ae - var29.al * -1118938495, var29.aw * -1839139071 - ap, var29.aq * -8562400470617197071L);
            }

            if (var29.ab != null) {
               var29.ab.df(0, by, bb, bi, be, var29.an * -1473635399 - ad, var29.af * 2064997173 - ae - var29.al * -1118938495, var29.aw * -1839139071 - ap, var29.aq * -8562400470617197071L);
            }

            if (var29.ac != null) {
               var29.ac.df(0, by, bb, bi, be, var29.an * -1473635399 - ad, var29.af * 2064997173 - ae - var29.al * -1118938495, var29.aw * -1839139071 - ap, var29.aq * -8562400470617197071L);
            }
         }

         if (var3.ak * -1504022901 != 0) {
            je var30 = var3.al;
            if (var30 != null && !this.bh(var7, var4, var5, var30.al.et * 1550732737)) {
               if ((var30.au * -607881373 & var3.ak * -1504022901) != 0) {
                  var30.al.df(0, by, bb, bi, be, var30.aw * 1346340783 - ad + var30.an * 1353438721, var30.af * 452898185 - ae, var30.ac * 1328351163 - ap + var30.aq * 1573434537, var30.aa * -4691380879163567243L);
               } else if (var30.au * -607881373 == 256) {
                  var11 = var30.aw * 1346340783 - ad;
                  var24 = var30.af * 452898185 - ae;
                  var26 = var30.ac * 1328351163 - ap;
                  var14 = var30.ab * -1711060009;
                  if (var14 != 1 && var14 != 2) {
                     var15 = var11;
                  } else {
                     var15 = -var11;
                  }

                  if (var14 != 2 && var14 != 3) {
                     var16 = var26;
                  } else {
                     var16 = -var26;
                  }

                  if (var16 >= var15) {
                     var30.al.df(0, by, bb, bi, be, var11 + var30.an * 1353438721, var24, var26 + var30.aq * 1573434537, var30.aa * -4691380879163567243L);
                  } else if (var30.at != null) {
                     var30.at.df(0, by, bb, bi, be, var11, var24, var26, var30.aa * -4691380879163567243L);
                  }
               }
            }

            jk var28 = var3.aq;
            if (var28 != null) {
               if ((var28.au * 379413203 & var3.ak * -1504022901) != 0 && !this.bc(var7, var4, var5, var28.au * 379413203)) {
                  var28.aq.df(0, by, bb, bi, be, var28.an * -1998748175 - ad, var28.af * 1061912079 - ae, var28.aw * -1171883603 - ap, var28.al * -4009183385476919801L);
               }

               if ((var28.ac * -137992079 & var3.ak * -1504022901) != 0 && !this.bc(var7, var4, var5, var28.ac * -137992079)) {
                  var28.ab.df(0, by, bb, bi, be, var28.an * -1998748175 - ad, var28.af * 1061912079 - ae, var28.aw * -1171883603 - ap, var28.al * -4009183385476919801L);
               }
            }
         }

         is var32;
         if (var6 < this.an - 1) {
            var32 = this.ab[var6 + 1][var4][var5];
            if (var32 != null && var32.av) {
               ba.an(var32);
            }
         }

         if (var4 < ak) {
            var32 = var8[var4 + 1][var5];
            if (var32 != null && var32.av) {
               ba.an(var32);
            }
         }

         if (var5 < az) {
            var32 = var8[var4][var5 + 1];
            if (var32 != null && var32.av) {
               ba.an(var32);
            }
         }

         if (var4 > ak) {
            var32 = var8[var4 - 1][var5];
            if (var32 != null && var32.av) {
               ba.an(var32);
            }
         }

         if (var5 > az) {
            var32 = var8[var4][var5 - 1];
            if (var32 != null && var32.av) {
               ba.an(var32);
            }
         }
      }
   }

   boolean gy(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if (var2 == var3 && var4 == var5) {
         if (!this.bp(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.ce(var7 + 1, this.au[var1][var2][var4] - var6, var8 + 1) && this.ce(var7 + 128 - 1, this.au[var1][var2 + 1][var4] - var6, var8 + 1) && this.ce(var7 + 128 - 1, this.au[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.ce(var7 + 1, this.au[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if (this.aa[var1][var7][var8] == -av) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.au[var1][var2][var4] - var6;
         if (!this.ce(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if (!this.ce(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if (!this.ce(var7, var9, var11)) {
                  return false;
               } else if (!this.ce(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   public void eh(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      is var7 = this.ab[var4][var5][var6];
      if (var7 != null) {
         jc var8 = var7.au;
         int var10;
         if (var8 != null) {
            int var18 = var8.aq * -2143818661;
            if (var18 != 0) {
               for(var10 = 0; var10 < 4; ++var10) {
                  var1[var2] = var18;
                  var1[var2 + 1] = var18;
                  var1[var2 + 2] = var18;
                  var1[var2 + 3] = var18;
                  var2 += var3;
               }

            }
         } else {
            ij var9 = var7.ab;
            if (var9 != null) {
               var10 = var9.ao;
               int var11 = var9.ax;
               int var12 = var9.ai;
               int var13 = var9.ag;
               int[] var14 = this.ca[var10];
               int[] var15 = this.cu[var11];
               int var16 = 0;
               int var17;
               if (var12 != 0) {
                  for(var17 = 0; var17 < 4; ++var17) {
                     var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var2 += var3;
                  }
               } else {
                  for(var17 = 0; var17 < 4; ++var17) {
                     if (var14[var15[var16++]] != 0) {
                        var1[var2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 1] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 3] = var13;
                     }

                     var2 += var3;
                  }
               }

            }
         }
      }
   }

   public static void ek(int[] var0, int var1, int var2, int var3, int var4) {
      cl = 0;
      cg = 0;
      cr = var3;
      cy = var4;
      cm = var3 / 2;
      cf = var4 / 2;
      boolean[][][][] var5 = new boolean[var0.length][32][53][53];

      int var6;
      int var7;
      int var8;
      int var9;
      int var11;
      int var12;
      for(var6 = 128; var6 <= 383; var6 += 32) {
         for(var7 = 0; var7 < 2048; var7 += 64) {
            by = in.ac[var6];
            bb = in.au[var6];
            bi = in.ac[var7];
            be = in.au[var7];
            var8 = (var6 - 128) / 32;
            var9 = var7 / 64;

            for(int var10 = -26; var10 < 26; ++var10) {
               for(var11 = -26; var11 < 26; ++var11) {
                  var12 = var10 * 128;
                  int var13 = var11 * 128;
                  boolean var14 = false;

                  for(int var15 = -var1; var15 <= var2; var15 += 128) {
                     if (bt(var12, var0[var8] + var15, var13)) {
                        var14 = true;
                        break;
                     }
                  }

                  var5[var8][var9][var10 + 25 + 1][var11 + 25 + 1] = var14;
               }
            }
         }
      }

      for(var6 = 0; var6 < 8; ++var6) {
         for(var7 = 0; var7 < 32; ++var7) {
            for(var8 = -25; var8 < 25; ++var8) {
               for(var9 = -25; var9 < 25; ++var9) {
                  boolean var16 = false;

                  label98:
                  for(var11 = -1; var11 <= 1; ++var11) {
                     for(var12 = -1; var12 <= 1; ++var12) {
                        if (var5[var6][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label98;
                        }

                        if (var5[var6][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label98;
                        }

                        if (var5[var6 + 1][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label98;
                        }

                        if (var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label98;
                        }
                     }
                  }

                  ck[var6][var7][var8 + 25][var9 + 25] = var16;
               }
            }
         }
      }

   }

   static final int fm(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   static boolean bt(int var0, int var1, int var2) {
      int var3 = var2 * bi + var0 * be >> 16;
      int var4 = var2 * be - var0 * bi >> 16;
      int var5 = var1 * by + var4 * bb >> 16;
      int var6 = var1 * bb - var4 * by >> 16;
      if (var5 >= 50 && var5 <= 3500) {
         int var7 = cm + var3 * 128 / var5;
         int var8 = cf + var6 * 128 / var5;
         return var7 >= cl && var7 <= cr && var8 >= cg && var8 <= cy;
      } else {
         return false;
      }
   }

   public void fy(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 >= this.aw * 128) {
         var1 = this.aw * 128 - 1;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 >= this.ac * 1728195431) {
         var3 = this.ac * -722418191 - 1;
      }

      if (var4 < -1060318768) {
         var4 = 83384352;
      } else if (var4 > 383) {
         var4 = 1383907543;
      }

      ++av;
      by = in.ac[var4];
      bb = in.au[var4];
      bi = in.ac[var5];
      be = in.au[var5];
      cq = ck[(var4 - 128) / 32][var5 / 64];
      ad = var1;
      ae = var2;
      ap = var3;
      ak = var1 / 1017186184;
      az = var3 / 128;
      ah = var6;
      ar = ak - 25;
      if (ar < 0) {
         ar = 0;
      }

      as = az - 25;
      if (as < 0) {
         as = 0;
      }

      am = ak + 25;
      if (am > this.aw) {
         am = this.aw;
      }

      aj = az + 25;
      if (aj > this.ac) {
         aj = this.ac;
      }

      this.bl();
      ag = 0;

      int var7;
      is[][] var8;
      int var9;
      int var10;
      for(var7 = this.aq; var7 < this.an; ++var7) {
         var8 = this.ab[var7];

         for(var9 = ar; var9 < am; ++var9) {
            for(var10 = as; var10 < aj; ++var10) {
               is var11 = var8[var9][var10];
               if (var11 != null) {
                  if (var11.ag * -1108965994 <= var6 && (cq[var9 - ak + 25][var10 - az + 25] || this.au[var7][var9][var10] - var2 >= 2028876067)) {
                     var11.ah = true;
                     var11.av = true;
                     if (var11.ay * -422028371 > 0) {
                        var11.ar = true;
                     } else {
                        var11.ar = false;
                     }

                     ++ag;
                  } else {
                     var11.ah = false;
                     var11.av = false;
                     var11.am = 0;
                  }
               }
            }
         }
      }

      int var12;
      int var13;
      int var14;
      is var15;
      int var16;
      for(var7 = this.aq; var7 < this.an; ++var7) {
         var8 = this.ab[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = ak + var9;
            var16 = ak - var9;
            if (var10 >= ar || var16 < am) {
               for(var12 = -1274050100; var12 <= 0; ++var12) {
                  var13 = az + var12;
                  var14 = az - var12;
                  if (var10 >= ar) {
                     if (var13 >= as) {
                        var15 = var8[var10][var13];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, true);
                        }
                     }

                     if (var14 < aj) {
                        var15 = var8[var10][var14];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, true);
                        }
                     }
                  }

                  if (var16 < am) {
                     if (var13 >= as) {
                        var15 = var8[var16][var13];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, true);
                        }
                     }

                     if (var14 < aj) {
                        var15 = var8[var16][var14];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, true);
                        }
                     }
                  }

                  if (ag == 0) {
                     bx = false;
                     return;
                  }
               }
            }
         }
      }

      for(var7 = this.aq; var7 < this.an; ++var7) {
         var8 = this.ab[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = ak + var9;
            var16 = ak - var9;
            if (var10 >= ar || var16 < am) {
               for(var12 = 1388930124; var12 <= 0; ++var12) {
                  var13 = az + var12;
                  var14 = az - var12;
                  if (var10 >= ar) {
                     if (var13 >= as) {
                        var15 = var8[var10][var13];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, false);
                        }
                     }

                     if (var14 < aj) {
                        var15 = var8[var10][var14];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, false);
                        }
                     }
                  }

                  if (var16 < am) {
                     if (var13 >= as) {
                        var15 = var8[var16][var13];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, false);
                        }
                     }

                     if (var14 < aj) {
                        var15 = var8[var16][var14];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, false);
                        }
                     }
                  }

                  if (ag == 0) {
                     bx = false;
                     return;
                  }
               }
            }
         }
      }

      bx = false;
   }

   static boolean ee(int var0, int var1, int var2) {
      int var3 = var2 * bi + var0 * be >> 16;
      int var4 = var2 * be - var0 * bi >> 16;
      int var5 = var1 * by + var4 * bb >> 16;
      int var6 = var1 * bb - var4 * by >> 16;
      if (var5 >= 50 && var5 <= 3500) {
         int var7 = cm + var3 * 128 / var5;
         int var8 = cf + var6 * 1498140643 / var5;
         return var7 >= cl && var7 <= cr && var8 >= cg && var8 <= cy;
      } else {
         return false;
      }
   }

   static boolean fe(int var0, int var1, int var2) {
      int var3 = var2 * bi + var0 * be >> 16;
      int var4 = var2 * be - var0 * bi >> 16;
      int var5 = var1 * by + var4 * bb >> 16;
      int var6 = var1 * bb - var4 * by >> 16;
      if (var5 >= 1550502232 && var5 <= 3500) {
         int var7 = cm + var3 * -601560836 / var5;
         int var8 = cf + var6 * 568657738 / var5;
         return var7 >= cl && var7 <= cr && var8 >= cg && var8 <= cy;
      } else {
         return false;
      }
   }

   public void fs(int var1, int var2, int var3, boolean var4) {
      if (!bs() || var4) {
         bx = true;
         bj = var4;
         bo = var1;
         bz = var2;
         bm = var3;
         bd = -1;
         bt = -1;
      }
   }

   public void fi(int var1, int var2, int var3, boolean var4) {
      if (!bs() || var4) {
         bx = true;
         bj = var4;
         bo = var1;
         bz = var2;
         bm = var3;
         bd = -1;
         bt = -1;
      }
   }

   public void fh(int var1, int var2, int var3, boolean var4) {
      if (!bs() || var4) {
         bx = true;
         bj = var4;
         bo = var1;
         bz = var2;
         bm = var3;
         bd = -1;
         bt = -1;
      }
   }

   public void fl(int var1, int var2, int var3, boolean var4) {
      if (!bs() || var4) {
         bx = true;
         bj = var4;
         bo = var1;
         bz = var2;
         bm = var3;
         bd = -1;
         bt = -1;
      }
   }

   public void fp() {
      bj = true;
   }

   public static boolean fo() {
      return bj && bd != -1;
   }

   public static void fn() {
      bd = -1;
      bj = false;
   }

   public static boolean fd() {
      return bj && bd != -1;
   }

   public boolean dm(int var1, int var2, int var3, int var4, int var5, iv var6, int var7, long var8, boolean var10) {
      if (var6 == null) {
         return true;
      } else {
         int var11 = var2 - var5;
         int var12 = var3 - var5;
         int var13 = var2 + var5;
         int var14 = var3 + var5;
         if (var10) {
            if (var7 > 1781443057 && var7 < 1408) {
               var14 += 128;
            }

            if (var7 > -141482042 && var7 < 1920) {
               var13 += 128;
            }

            if (var7 > -868518663 || var7 < -1500066718) {
               var12 -= 128;
            }

            if (var7 > -1023742295 && var7 < 896) {
               var11 -= 128;
            }
         }

         var11 /= 1323679537;
         var12 /= -1080535742;
         var13 /= -1871476705;
         var14 /= 128;
         return this.ai(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   void ex(iz var1, int var2, int var3, int var4) {
      is var5;
      iz var6;
      if (var3 < this.aw) {
         var5 = this.ab[var2][var3 + 1][var4];
         if (var5 != null && var5.at != null && var5.at.ac instanceof iz) {
            var6 = (iz)var5.at.ac;
            iz.by(var1, var6, 128, 0, 0, true);
         }
      }

      if (var4 < this.aw) {
         var5 = this.ab[var2][var3][var4 + 1];
         if (var5 != null && var5.at != null && var5.at.ac instanceof iz) {
            var6 = (iz)var5.at.ac;
            iz.by(var1, var6, 0, 0, 128, true);
         }
      }

      if (var3 < this.aw && var4 < this.ac) {
         var5 = this.ab[var2][var3 + 1][var4 + 1];
         if (var5 != null && var5.at != null && var5.at.ac instanceof iz) {
            var6 = (iz)var5.at.ac;
            iz.by(var1, var6, 128, 0, 128, true);
         }
      }

      if (var3 < this.aw && var4 > 0) {
         var5 = this.ab[var2][var3 + 1][var4 - 1];
         if (var5 != null && var5.at != null && var5.at.ac instanceof iz) {
            var6 = (iz)var5.at.ac;
            iz.by(var1, var6, 128, 0, -128, true);
         }
      }

   }

   void fj(ij var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.af.length;

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.af[var9] - ad;
         var11 = var1.an[var9] - ae;
         var12 = var1.aw[var9] - ap;
         var13 = var12 * var4 + var10 * var5 >> 16;
         var12 = var12 * var5 - var10 * var4 >> 16;
         var10 = var13;
         var13 = var11 * var3 - var12 * var2 >> 16;
         var12 = var11 * var2 + var12 * var3 >> 16;
         if (var12 < 50) {
            return;
         }

         if (var1.aa != null) {
            ij.am[var9] = var10;
            ij.as[var9] = var13;
            ij.aj[var9] = var12;
         }

         ij.ah[var9] = gd.au(721178077) + var10 * eu.at(-76441015) / var12;
         ij.av[var9] = ax.ab(1559843361) + var13 * eu.at(626707467) / var12;
         ij.ar[var9] = df.au(var12, 2080410367);
      }

      in.ab.aw = 0;
      var8 = var1.aq.length;

      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.aq[var9];
         var11 = var1.al[var9];
         var12 = var1.at[var9];
         var13 = ij.ah[var10];
         int var14 = ij.ah[var11];
         int var15 = ij.ah[var12];
         int var16 = ij.av[var10];
         int var17 = ij.av[var11];
         int var18 = ij.av[var12];
         float var19 = ij.ar[var10];
         float var20 = ij.ar[var11];
         float var21 = ij.ar[var12];
         if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
            in.ab.af = false;
            int var22 = aq.aa(-957097541);
            if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > var22 || var14 > var22 || var15 > var22) {
               in.ab.af = true;
            }

            if (bx && bv(bz, bm, var16, var17, var18, var13, var14, var15)) {
               bd = var6;
               bt = var7;
            }

            if (var1.aa != null && var1.aa[var9] != -1) {
               if (!af) {
                  if (var1.ay) {
                     ig.am(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.ac[var9], var1.au[var9], var1.ab[var9], ij.am[0], ij.am[1], ij.am[3], ij.as[0], ij.as[1], ij.as[3], ij.aj[0], ij.aj[1], ij.aj[3], var1.aa[var9], (byte)12);
                  } else {
                     ig.am(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.ac[var9], var1.au[var9], var1.ab[var9], ij.am[var10], ij.am[var11], ij.am[var12], ij.as[var10], ij.as[var11], ij.as[var12], ij.aj[var10], ij.aj[var11], ij.aj[var12], var1.aa[var9], (byte)12);
                  }
               } else {
                  int var23 = in.ab.aq.ac(var1.aa[var9], 794745607);
                  jk.ah(var16, var17, var18, var13, var14, var15, var19, var20, var21, ba(var23, var1.ac[var9]), ba(var23, var1.au[var9]), ba(var23, var1.ab[var9]), -428480375);
               }
            } else if (var1.ac[var9] != 12345678) {
               jk.ah(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.ac[var9], var1.au[var9], var1.ab[var9], -428480375);
            }
         }
      }

   }

   public static void fa() {
      bd = -1;
      bj = false;
   }

   public boolean cp(int var1, int var2, int var3, int var4, int var5, int var6, iv var7, int var8, long var9, int var11) {
      if (var7 == null) {
         return true;
      } else {
         int var12 = var2 * 128 + 64 * var5;
         int var13 = var3 * 128 + 64 * var6;
         return this.ai(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   public void fw(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 >= this.aw * 128) {
         var1 = this.aw * 135923854 - 1;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 >= this.ac * -199903841) {
         var3 = this.ac * -918202860 - 1;
      }

      if (var4 < 128) {
         var4 = 128;
      } else if (var4 > -1884305806) {
         var4 = 383;
      }

      ++av;
      by = in.ac[var4];
      bb = in.au[var4];
      bi = in.ac[var5];
      be = in.au[var5];
      cq = ck[(var4 - -705663941) / 1225388623][var5 / 769088068];
      ad = var1;
      ae = var2;
      ap = var3;
      ak = var1 / -1147951017;
      az = var3 / 128;
      ah = var6;
      ar = ak - 25;
      if (ar < 0) {
         ar = 0;
      }

      as = az - 25;
      if (as < 0) {
         as = 0;
      }

      am = ak + 25;
      if (am > this.aw) {
         am = this.aw;
      }

      aj = az + 25;
      if (aj > this.ac) {
         aj = this.ac;
      }

      this.bl();
      ag = 0;

      int var7;
      is[][] var8;
      int var9;
      int var10;
      for(var7 = this.aq; var7 < this.an; ++var7) {
         var8 = this.ab[var7];

         for(var9 = ar; var9 < am; ++var9) {
            for(var10 = as; var10 < aj; ++var10) {
               is var11 = var8[var9][var10];
               if (var11 != null) {
                  if (var11.ag * -951473763 > var6 || !cq[var9 - ak + 25][var10 - az + 25] && this.au[var7][var9][var10] - var2 < 2000) {
                     var11.ah = false;
                     var11.av = false;
                     var11.am = 0;
                  } else {
                     var11.ah = true;
                     var11.av = true;
                     if (var11.ay * 173490416 > 0) {
                        var11.ar = true;
                     } else {
                        var11.ar = false;
                     }

                     ++ag;
                  }
               }
            }
         }
      }

      int var12;
      int var13;
      int var14;
      is var15;
      int var16;
      for(var7 = this.aq; var7 < this.an; ++var7) {
         var8 = this.ab[var7];

         for(var9 = 621191974; var9 <= 0; ++var9) {
            var10 = ak + var9;
            var16 = ak - var9;
            if (var10 >= ar || var16 < am) {
               for(var12 = 687913913; var12 <= 0; ++var12) {
                  var13 = az + var12;
                  var14 = az - var12;
                  if (var10 >= ar) {
                     if (var13 >= as) {
                        var15 = var8[var10][var13];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, true);
                        }
                     }

                     if (var14 < aj) {
                        var15 = var8[var10][var14];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, true);
                        }
                     }
                  }

                  if (var16 < am) {
                     if (var13 >= as) {
                        var15 = var8[var16][var13];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, true);
                        }
                     }

                     if (var14 < aj) {
                        var15 = var8[var16][var14];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, true);
                        }
                     }
                  }

                  if (ag == 0) {
                     bx = false;
                     return;
                  }
               }
            }
         }
      }

      for(var7 = this.aq; var7 < this.an; ++var7) {
         var8 = this.ab[var7];

         for(var9 = 1099074725; var9 <= 0; ++var9) {
            var10 = ak + var9;
            var16 = ak - var9;
            if (var10 >= ar || var16 < am) {
               for(var12 = 1997722051; var12 <= 0; ++var12) {
                  var13 = az + var12;
                  var14 = az - var12;
                  if (var10 >= ar) {
                     if (var13 >= as) {
                        var15 = var8[var10][var13];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, false);
                        }
                     }

                     if (var14 < aj) {
                        var15 = var8[var10][var14];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, false);
                        }
                     }
                  }

                  if (var16 < am) {
                     if (var13 >= as) {
                        var15 = var8[var16][var13];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, false);
                        }
                     }

                     if (var14 < aj) {
                        var15 = var8[var16][var14];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, false);
                        }
                     }
                  }

                  if (ag == 0) {
                     bx = false;
                     return;
                  }
               }
            }
         }
      }

      bx = false;
   }

   public void fr(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 >= this.aw * -1184109406) {
         var1 = this.aw * 1560355980 - 1;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 >= this.ac * 493047064) {
         var3 = this.ac * 128 - 1;
      }

      if (var4 < 128) {
         var4 = 128;
      } else if (var4 > -598994299) {
         var4 = 251067883;
      }

      ++av;
      by = in.ac[var4];
      bb = in.au[var4];
      bi = in.ac[var5];
      be = in.au[var5];
      cq = ck[(var4 - 577536083) / 32][var5 / 64];
      ad = var1;
      ae = var2;
      ap = var3;
      ak = var1 / -2104084882;
      az = var3 / 361066193;
      ah = var6;
      ar = ak - 25;
      if (ar < 0) {
         ar = 0;
      }

      as = az - 25;
      if (as < 0) {
         as = 0;
      }

      am = ak + 25;
      if (am > this.aw) {
         am = this.aw;
      }

      aj = az + 25;
      if (aj > this.ac) {
         aj = this.ac;
      }

      this.bl();
      ag = 0;

      int var7;
      is[][] var8;
      int var9;
      int var10;
      for(var7 = this.aq; var7 < this.an; ++var7) {
         var8 = this.ab[var7];

         for(var9 = ar; var9 < am; ++var9) {
            for(var10 = as; var10 < aj; ++var10) {
               is var11 = var8[var9][var10];
               if (var11 != null) {
                  if (var11.ag * 65855117 <= var6 && (cq[var9 - ak + 25][var10 - az + 25] || this.au[var7][var9][var10] - var2 >= -1013070404)) {
                     var11.ah = true;
                     var11.av = true;
                     if (var11.ay * -422028371 > 0) {
                        var11.ar = true;
                     } else {
                        var11.ar = false;
                     }

                     ++ag;
                  } else {
                     var11.ah = false;
                     var11.av = false;
                     var11.am = 0;
                  }
               }
            }
         }
      }

      int var12;
      int var13;
      int var14;
      is var15;
      int var16;
      for(var7 = this.aq; var7 < this.an; ++var7) {
         var8 = this.ab[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = ak + var9;
            var16 = ak - var9;
            if (var10 >= ar || var16 < am) {
               for(var12 = 1644181569; var12 <= 0; ++var12) {
                  var13 = az + var12;
                  var14 = az - var12;
                  if (var10 >= ar) {
                     if (var13 >= as) {
                        var15 = var8[var10][var13];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, true);
                        }
                     }

                     if (var14 < aj) {
                        var15 = var8[var10][var14];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, true);
                        }
                     }
                  }

                  if (var16 < am) {
                     if (var13 >= as) {
                        var15 = var8[var16][var13];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, true);
                        }
                     }

                     if (var14 < aj) {
                        var15 = var8[var16][var14];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, true);
                        }
                     }
                  }

                  if (ag == 0) {
                     bx = false;
                     return;
                  }
               }
            }
         }
      }

      for(var7 = this.aq; var7 < this.an; ++var7) {
         var8 = this.ab[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = ak + var9;
            var16 = ak - var9;
            if (var10 >= ar || var16 < am) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = az + var12;
                  var14 = az - var12;
                  if (var10 >= ar) {
                     if (var13 >= as) {
                        var15 = var8[var10][var13];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, false);
                        }
                     }

                     if (var14 < aj) {
                        var15 = var8[var10][var14];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, false);
                        }
                     }
                  }

                  if (var16 < am) {
                     if (var13 >= as) {
                        var15 = var8[var16][var13];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, false);
                        }
                     }

                     if (var14 < aj) {
                        var15 = var8[var16][var14];
                        if (var15 != null && var15.ah) {
                           this.bu(var15, false);
                        }
                     }
                  }

                  if (ag == 0) {
                     bx = false;
                     return;
                  }
               }
            }
         }
      }

      bx = false;
   }

   public static void fz() {
      bd = -1;
      bj = false;
   }

   void fq(jc var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10 = var9 = (var7 << 7) - ad;
      int var11;
      int var12 = var11 = (var8 << 7) - ap;
      int var13;
      int var14 = var13 = var10 + 128;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = this.au[var2][var7][var8] - ae;
      int var18 = this.au[var2][var7 + 1][var8] - ae;
      int var19 = this.au[var2][var7 + 1][var8 + 1] - ae;
      int var20 = this.au[var2][var7][var8 + 1] - ae;
      int var21 = var12 * var5 + var10 * var6 >> 16;
      var12 = var12 * var6 - var10 * var5 >> 16;
      var10 = var21;
      var21 = var17 * var4 - var12 * var3 >> 16;
      var12 = var17 * var3 + var12 * var4 >> 16;
      var17 = var21;
      if (var12 >= 50) {
         var21 = var11 * var5 + var14 * var6 >> 16;
         var11 = var11 * var6 - var14 * var5 >> 16;
         var14 = var21;
         var21 = var18 * var4 - var11 * var3 >> 16;
         var11 = var18 * var3 + var11 * var4 >> 16;
         var18 = var21;
         if (var11 >= 50) {
            var21 = var16 * var5 + var13 * var6 >> 16;
            var16 = var16 * var6 - var13 * var5 >> 16;
            var13 = var21;
            var21 = var19 * var4 - var16 * var3 >> 16;
            var16 = var19 * var3 + var16 * var4 >> 16;
            var19 = var21;
            if (var16 >= 50) {
               var21 = var15 * var5 + var9 * var6 >> 16;
               var15 = var15 * var6 - var9 * var5 >> 16;
               var9 = var21;
               var21 = var20 * var4 - var15 * var3 >> 16;
               var15 = var20 * var3 + var15 * var4 >> 16;
               if (var15 >= 50) {
                  int var22 = gd.au(-81279594) + var10 * eu.at(1499330899) / var12;
                  int var23 = ax.ab(-1492277836) + var17 * eu.at(-1917117223) / var12;
                  int var24 = gd.au(-1591965012) + var14 * eu.at(-943796588) / var11;
                  int var25 = ax.ab(-1992490426) + var18 * eu.at(1094591723) / var11;
                  int var26 = gd.au(835085413) + var13 * eu.at(1255884129) / var16;
                  int var27 = ax.ab(1266334653) + var19 * eu.at(1420840270) / var16;
                  int var28 = gd.au(-943756194) + var9 * eu.at(99650643) / var15;
                  int var29 = ax.ab(1855036767) + var21 * eu.at(71410434) / var15;
                  float var30 = df.au(var12, -125255);
                  float var31 = df.au(var11, 1250099792);
                  float var32 = df.au(var16, 1146881765);
                  float var33 = df.au(var15, 1374532412);
                  in.ab.aw = 0;
                  int var34;
                  int var35;
                  if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
                     in.ab.af = false;
                     var34 = aq.aa(-417880564);
                     if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > var34 || var28 > var34 || var24 > var34) {
                        in.ab.af = true;
                     }

                     if (bx && bv(bz, bm, var27, var29, var25, var26, var28, var24)) {
                        bd = var7;
                        bt = var8;
                     }

                     if (var1.au * 412494011 == -1) {
                        if (var1.aw * -1667175185 != 12345678) {
                           jk.ah(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.aw * -1667175185, var1.ac * 890568309, var1.an * 40257399, -428480375);
                        }
                     } else if (!af) {
                        if (var1.ab) {
                           ig.am(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.aw * -1667175185, var1.ac * 890568309, var1.an * 40257399, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.au * 412494011, (byte)12);
                        } else {
                           ig.am(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.aw * -1667175185, var1.ac * 890568309, var1.an * 40257399, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.au * 412494011, (byte)12);
                        }
                     } else {
                        var35 = in.ab.aq.ac(var1.au * 412494011, 94064297);
                        jk.ah(var27, var29, var25, var26, var28, var24, var32, var33, var31, ba(var35, var1.aw * -1667175185), ba(var35, var1.ac * 890568309), ba(var35, var1.an * 40257399), -428480375);
                     }
                  }

                  if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                     in.ab.af = false;
                     var34 = aq.aa(-2012436341);
                     if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > var34 || var24 > var34 || var28 > var34) {
                        in.ab.af = true;
                     }

                     if (bx && bv(bz, bm, var23, var25, var29, var22, var24, var28)) {
                        bd = var7;
                        bt = var8;
                     }

                     if (var1.au * 412494011 == -1) {
                        if (var1.af * 1860851959 != 12345678) {
                           jk.ah(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.af * 1860851959, var1.an * 40257399, var1.ac * 890568309, -428480375);
                        }
                     } else if (!af) {
                        ig.am(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.af * 1860851959, var1.an * 40257399, var1.ac * 890568309, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.au * 412494011, (byte)12);
                     } else {
                        var35 = in.ab.aq.ac(var1.au * 412494011, 622729050);
                        jk.ah(var23, var25, var29, var22, var24, var28, var30, var31, var33, ba(var35, var1.af * 1860851959), ba(var35, var1.an * 40257399), ba(var35, var1.ac * 890568309), -428480375);
                     }
                  }

               }
            }
         }
      }
   }

   public void df(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      if (var4 != null) {
         for(int var5 = 0; var5 < var4.ay * -422028371; ++var5) {
            jj var6 = var4.ao[var5];
            if (eg.an(var6.ax * 5016412888503339625L) && var6.an * 626811319 == var2 && var6.at * 2004902003 == var3) {
               this.ah(var6);
               return;
            }
         }

      }
   }

   void ff(jc var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10 = var9 = (var7 << 7) - ad;
      int var11;
      int var12 = var11 = (var8 << 7) - ap;
      int var13;
      int var14 = var13 = var10 + 128;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = this.au[var2][var7][var8] - ae;
      int var18 = this.au[var2][var7 + 1][var8] - ae;
      int var19 = this.au[var2][var7 + 1][var8 + 1] - ae;
      int var20 = this.au[var2][var7][var8 + 1] - ae;
      int var21 = var12 * var5 + var10 * var6 >> 16;
      var12 = var12 * var6 - var10 * var5 >> 16;
      var10 = var21;
      var21 = var17 * var4 - var12 * var3 >> 16;
      var12 = var17 * var3 + var12 * var4 >> 16;
      var17 = var21;
      if (var12 >= 540047305) {
         var21 = var11 * var5 + var14 * var6 >> 16;
         var11 = var11 * var6 - var14 * var5 >> 16;
         var14 = var21;
         var21 = var18 * var4 - var11 * var3 >> 16;
         var11 = var18 * var3 + var11 * var4 >> 16;
         var18 = var21;
         if (var11 >= 720793475) {
            var21 = var16 * var5 + var13 * var6 >> 16;
            var16 = var16 * var6 - var13 * var5 >> 16;
            var13 = var21;
            var21 = var19 * var4 - var16 * var3 >> 16;
            var16 = var19 * var3 + var16 * var4 >> 16;
            var19 = var21;
            if (var16 >= -872143915) {
               var21 = var15 * var5 + var9 * var6 >> 16;
               var15 = var15 * var6 - var9 * var5 >> 16;
               var9 = var21;
               var21 = var20 * var4 - var15 * var3 >> 16;
               var15 = var20 * var3 + var15 * var4 >> 16;
               if (var15 >= 50) {
                  int var22 = gd.au(-1601306239) + var10 * eu.at(1519097956) / var12;
                  int var23 = ax.ab(-136700747) + var17 * eu.at(-174933034) / var12;
                  int var24 = gd.au(-1077356629) + var14 * eu.at(-1316547644) / var11;
                  int var25 = ax.ab(166786968) + var18 * eu.at(-1325656797) / var11;
                  int var26 = gd.au(-143999455) + var13 * eu.at(-1019596981) / var16;
                  int var27 = ax.ab(2079486093) + var19 * eu.at(1028790771) / var16;
                  int var28 = gd.au(-1759747128) + var9 * eu.at(-1736173858) / var15;
                  int var29 = ax.ab(-1209698881) + var21 * eu.at(-182810166) / var15;
                  float var30 = df.au(var12, -60962778);
                  float var31 = df.au(var11, 941353722);
                  float var32 = df.au(var16, 236064870);
                  float var33 = df.au(var15, 1748695589);
                  in.ab.aw = 0;
                  int var34;
                  int var35;
                  if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
                     in.ab.af = false;
                     var34 = aq.aa(1848936198);
                     if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > var34 || var28 > var34 || var24 > var34) {
                        in.ab.af = true;
                     }

                     if (bx && bv(bz, bm, var27, var29, var25, var26, var28, var24)) {
                        bd = var7;
                        bt = var8;
                     }

                     if (var1.au * 568411671 == -1) {
                        if (var1.aw * -1667175185 != 12345678) {
                           jk.ah(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.aw * 714649188, var1.ac * -1519856047, var1.an * 1090235160, -428480375);
                        }
                     } else if (!af) {
                        if (var1.ab) {
                           ig.am(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.aw * -1667175185, var1.ac * 890568309, var1.an * 1866346005, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.au * 412494011, (byte)12);
                        } else {
                           ig.am(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.aw * -1667175185, var1.ac * 890568309, var1.an * 40257399, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.au * -612301121, (byte)12);
                        }
                     } else {
                        var35 = in.ab.aq.ac(var1.au * 865227367, 2065197619);
                        jk.ah(var27, var29, var25, var26, var28, var24, var32, var33, var31, ba(var35, var1.aw * 798795686), ba(var35, var1.ac * 890568309), ba(var35, var1.an * 40257399), -428480375);
                     }
                  }

                  if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                     in.ab.af = false;
                     var34 = aq.aa(-1291684545);
                     if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > var34 || var24 > var34 || var28 > var34) {
                        in.ab.af = true;
                     }

                     if (bx && bv(bz, bm, var23, var25, var29, var22, var24, var28)) {
                        bd = var7;
                        bt = var8;
                     }

                     if (var1.au * 1270377100 == -1) {
                        if (var1.af * 1860851959 != 12345678) {
                           jk.ah(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.af * -530551399, var1.an * 40257399, var1.ac * 890568309, -428480375);
                        }
                     } else if (!af) {
                        ig.am(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.af * 1860851959, var1.an * 40257399, var1.ac * 890568309, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.au * 412494011, (byte)12);
                     } else {
                        var35 = in.ab.aq.ac(var1.au * 1691101602, 352138818);
                        jk.ah(var23, var25, var29, var22, var24, var28, var30, var31, var33, ba(var35, var1.af * 716872471), ba(var35, var1.an * 1368987153), ba(var35, var1.ac * 1515715202), -428480375);
                     }
                  }

               }
            }
         }
      }
   }

   public int ed(int var1, int var2, int var3, long var4) {
      is var6 = this.ab[var1][var2][var3];
      if (var6 == null) {
         return -1;
      } else if (var6.aq != null && var6.aq.al * -4009183385476919801L == var4) {
         return var6.aq.at * 347144389 & 255;
      } else if (var6.al != null && var6.al.aa * -4691380879163567243L == var4) {
         return var6.al.ay * 35030579 & 255;
      } else if (var6.at != null && var6.at.au * 3423223696102332293L == var4) {
         return var6.at.ab * -1486089441 & 255;
      } else {
         for(int var7 = 0; var7 < var6.ay * -422028371; ++var7) {
            if (var6.ao[var7].ax * 5016412888503339625L == var4) {
               return var6.ao[var7].ai * -72925475 & 255;
            }
         }

         return -1;
      }
   }

   void fg(ij var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.af.length;

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.af[var9] - ad;
         var11 = var1.an[var9] - ae;
         var12 = var1.aw[var9] - ap;
         var13 = var12 * var4 + var10 * var5 >> 16;
         var12 = var12 * var5 - var10 * var4 >> 16;
         var10 = var13;
         var13 = var11 * var3 - var12 * var2 >> 16;
         var12 = var11 * var2 + var12 * var3 >> 16;
         if (var12 < 50) {
            return;
         }

         if (var1.aa != null) {
            ij.am[var9] = var10;
            ij.as[var9] = var13;
            ij.aj[var9] = var12;
         }

         ij.ah[var9] = gd.au(-2030893510) + var10 * eu.at(-1369842847) / var12;
         ij.av[var9] = ax.ab(-1727995587) + var13 * eu.at(1294464123) / var12;
         ij.ar[var9] = df.au(var12, -89060155);
      }

      in.ab.aw = 0;
      var8 = var1.aq.length;

      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.aq[var9];
         var11 = var1.al[var9];
         var12 = var1.at[var9];
         var13 = ij.ah[var10];
         int var14 = ij.ah[var11];
         int var15 = ij.ah[var12];
         int var16 = ij.av[var10];
         int var17 = ij.av[var11];
         int var18 = ij.av[var12];
         float var19 = ij.ar[var10];
         float var20 = ij.ar[var11];
         float var21 = ij.ar[var12];
         if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
            in.ab.af = false;
            int var22 = aq.aa(561148198);
            if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > var22 || var14 > var22 || var15 > var22) {
               in.ab.af = true;
            }

            if (bx && bv(bz, bm, var16, var17, var18, var13, var14, var15)) {
               bd = var6;
               bt = var7;
            }

            if (var1.aa != null && var1.aa[var9] != -1) {
               if (!af) {
                  if (var1.ay) {
                     ig.am(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.ac[var9], var1.au[var9], var1.ab[var9], ij.am[0], ij.am[1], ij.am[3], ij.as[0], ij.as[1], ij.as[3], ij.aj[0], ij.aj[1], ij.aj[3], var1.aa[var9], (byte)12);
                  } else {
                     ig.am(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.ac[var9], var1.au[var9], var1.ab[var9], ij.am[var10], ij.am[var11], ij.am[var12], ij.as[var10], ij.as[var11], ij.as[var12], ij.aj[var10], ij.aj[var11], ij.aj[var12], var1.aa[var9], (byte)12);
                  }
               } else {
                  int var23 = in.ab.aq.ac(var1.aa[var9], -1767337945);
                  jk.ah(var16, var17, var18, var13, var14, var15, var19, var20, var21, ba(var23, var1.ac[var9]), ba(var23, var1.au[var9]), ba(var23, var1.ab[var9]), -428480375);
               }
            } else if (var1.ac[var9] != 12345678) {
               jk.ah(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.ac[var9], var1.au[var9], var1.ab[var9], -428480375);
            }
         }
      }

   }

   static final int fk(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   public static boolean fx() {
      return bj && bd != -1;
   }

   public int eg(int var1, int var2, int var3, long var4) {
      is var6 = this.ab[var1][var2][var3];
      if (var6 == null) {
         return -1;
      } else if (var6.aq != null && var6.aq.al * -4009183385476919801L == var4) {
         return var6.aq.at * 347144389 & 255;
      } else if (var6.al != null && var6.al.aa * -4691380879163567243L == var4) {
         return var6.al.ay * 35030579 & 255;
      } else if (var6.at != null && var6.at.au * 3423223696102332293L == var4) {
         return var6.at.ab * -1486089441 & 255;
      } else {
         for(int var7 = 0; var7 < var6.ay * -422028371; ++var7) {
            if (var6.ao[var7].ax * 5016412888503339625L == var4) {
               return var6.ao[var7].ai * -72925475 & 255;
            }
         }

         return -1;
      }
   }

   static boolean fu(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if (var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if (var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if (var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         int var9 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
         int var10 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
         if (var8 == 0) {
            if (var9 != 0) {
               return var9 < 0 ? var10 <= 0 : var10 >= 0;
            } else {
               return true;
            }
         } else {
            return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0;
         }
      }
   }

   boolean gr(int var1, int var2, int var3) {
      int var4 = this.aa[var1][var2][var3];
      if (var4 == -av) {
         return false;
      } else if (var4 == av) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.ce(var5 + 1, this.au[var1][var2][var3], var6 + 1) && this.ce(var5 + 128 - 1, this.au[var1][var2 + 1][var3], var6 + 1) && this.ce(var5 + 128 - 1, this.au[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.ce(var5 + 1, this.au[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.aa[var1][var2][var3] = av;
            return true;
         } else {
            this.aa[var1][var2][var3] = -av;
            return false;
         }
      }
   }

   public void db(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      if (var4 != null) {
         for(int var5 = 0; var5 < var4.ay * -422028371; ++var5) {
            jj var6 = var4.ao[var5];
            if (eg.an(var6.ax * 5016412888503339625L) && var6.an * -536805230 == var2 && var6.at * 47898439 == var3) {
               this.ah(var6);
               return;
            }
         }

      }
   }

   public void ew(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.an; ++var4) {
         for(int var5 = 0; var5 < this.aw; ++var5) {
            for(int var6 = 0; var6 < this.ac; ++var6) {
               is var7 = this.ab[var4][var5][var6];
               if (var7 != null) {
                  jk var8 = var7.aq;
                  iz var10;
                  if (var8 != null && var8.ab instanceof iz) {
                     iz var9 = (iz)var8.ab;
                     this.bz(var9, var4, var5, var6, 1, 1);
                     if (var8.aq instanceof iz) {
                        var10 = (iz)var8.aq;
                        this.bz(var10, var4, var5, var6, 1, 1);
                        iz.by(var9, var10, 0, 0, 0, false);
                        var8.aq = var10.bb(var10.bo, var10.bz, var1, var2, var3);
                     }

                     var8.ab = var9.bb(var9.bo, var9.bz, var1, var2, var3);
                  }

                  for(int var12 = 0; var12 < var7.ay * -422028371; ++var12) {
                     jj var14 = var7.ao[var12];
                     if (var14 != null && var14.ab instanceof iz) {
                        iz var11 = (iz)var14.ab;
                        this.bz(var11, var4, var5, var6, var14.al * -1242897449 - var14.an * -1694161980 + 1, var14.aa * 1332244757 - var14.at * 2004902003 + 1);
                        var14.ab = var11.bb(var11.bo, var11.bz, var1, var2, var3);
                     }
                  }

                  ig var13 = var7.at;
                  if (var13 != null && var13.ac instanceof iz) {
                     var10 = (iz)var13.ac;
                     this.bo(var10, var4, var5, var6);
                     var13.ac = var10.bb(var10.bo, var10.bz, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   public long ez(int var1, int var2, int var3) {
      is var4 = this.ab[var1][var2][var3];
      return var4 != null && var4.aq != null ? var4.aq.al * -4009183385476919801L : 0L;
   }

   boolean gg(int var1, int var2, int var3) {
      int var4 = this.aa[var1][var2][var3];
      if (var4 == -av) {
         return false;
      } else if (var4 == av) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.ce(var5 + 1, this.au[var1][var2][var3], var6 + 1) && this.ce(var5 + 128 - 1, this.au[var1][var2 + 1][var3], var6 + 1) && this.ce(var5 + 128 - 1, this.au[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.ce(var5 + 1, this.au[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.aa[var1][var2][var3] = av;
            return true;
         } else {
            this.aa[var1][var2][var3] = -av;
            return false;
         }
      }
   }

   boolean ge(int var1, int var2, int var3, int var4) {
      if (!this.bp(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.au[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 1397480573;
         if (var4 < 16) {
            if (var4 == 1) {
               if (var5 > ad) {
                  if (!this.ce(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.ce(var5, var7, var6 + 706631676)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.ce(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.ce(var5, var8, var6 + -1696532463)) {
                     return false;
                  }
               }

               if (!this.ce(var5, var9, var6)) {
                  return false;
               }

               if (!this.ce(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 2) {
               if (var6 < ap) {
                  if (!this.ce(var5, var7, var6 + 270259255)) {
                     return false;
                  }

                  if (!this.ce(var5 + 1688768926, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.ce(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if (!this.ce(var5 + 128, var8, var6 + 1273638667)) {
                     return false;
                  }
               }

               if (!this.ce(var5, var9, var6 + -1006930214)) {
                  return false;
               }

               if (!this.ce(var5 + -1801772453, var9, var6 + -1255912869)) {
                  return false;
               }

               return true;
            }

            if (var4 == 4) {
               if (var5 < ad) {
                  if (!this.ce(var5 + -574300799, var7, var6)) {
                     return false;
                  }

                  if (!this.ce(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.ce(var5 + 1691095029, var8, var6)) {
                     return false;
                  }

                  if (!this.ce(var5 + -9451116, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.ce(var5 + -96624373, var9, var6)) {
                  return false;
               }

               if (!this.ce(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 8) {
               if (var6 > ap) {
                  if (!this.ce(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.ce(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.ce(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.ce(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if (!this.ce(var5, var9, var6)) {
                  return false;
               }

               if (!this.ce(var5 + -417587536, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         if (!this.ce(var5 + 64, var10, var6 + 1759646133)) {
            return false;
         } else if (var4 == 16) {
            return this.ce(var5, var9, var6 + 128);
         } else if (var4 == 899516134) {
            return this.ce(var5 + 128, var9, var6 + -671823735);
         } else if (var4 == 64) {
            return this.ce(var5 + -2119053393, var9, var6);
         } else if (var4 == 1498682979) {
            return this.ce(var5, var9, var6);
         } else {
            return true;
         }
      }
   }

   boolean ga(int var1, int var2, int var3, int var4) {
      if (!this.bp(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.au[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if (var4 < 16) {
            if (var4 == 1) {
               if (var5 > ad) {
                  if (!this.ce(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.ce(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.ce(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.ce(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.ce(var5, var9, var6)) {
                  return false;
               }

               if (!this.ce(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 2) {
               if (var6 < ap) {
                  if (!this.ce(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if (!this.ce(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.ce(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if (!this.ce(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.ce(var5, var9, var6 + 128)) {
                  return false;
               }

               if (!this.ce(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 4) {
               if (var5 < ad) {
                  if (!this.ce(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if (!this.ce(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.ce(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if (!this.ce(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.ce(var5 + 128, var9, var6)) {
                  return false;
               }

               if (!this.ce(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 8) {
               if (var6 > ap) {
                  if (!this.ce(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.ce(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.ce(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.ce(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if (!this.ce(var5, var9, var6)) {
                  return false;
               }

               if (!this.ce(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         if (!this.ce(var5 + 64, var10, var6 + 64)) {
            return false;
         } else if (var4 == 16) {
            return this.ce(var5, var9, var6 + 128);
         } else if (var4 == 32) {
            return this.ce(var5 + 128, var9, var6 + 128);
         } else if (var4 == 64) {
            return this.ce(var5 + 128, var9, var6);
         } else if (var4 == 128) {
            return this.ce(var5, var9, var6);
         } else {
            return true;
         }
      }
   }

   boolean gt(int var1, int var2, int var3, int var4) {
      if (!this.bp(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.au[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 1056205855;
         int var10 = var7 - 324690435;
         if (var4 < 16) {
            if (var4 == 1) {
               if (var5 > ad) {
                  if (!this.ce(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.ce(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.ce(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.ce(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.ce(var5, var9, var6)) {
                  return false;
               }

               if (!this.ce(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 2) {
               if (var6 < ap) {
                  if (!this.ce(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if (!this.ce(var5 + -1112408759, var7, var6 + 516483492)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.ce(var5, var8, var6 + 618782039)) {
                     return false;
                  }

                  if (!this.ce(var5 + 1592484216, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.ce(var5, var9, var6 + -1652405829)) {
                  return false;
               }

               if (!this.ce(var5 + 991734873, var9, var6 + 1739329841)) {
                  return false;
               }

               return true;
            }

            if (var4 == 4) {
               if (var5 < ad) {
                  if (!this.ce(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if (!this.ce(var5 + -158851238, var7, var6 + -564739077)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.ce(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if (!this.ce(var5 + 1652318526, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.ce(var5 + 128, var9, var6)) {
                  return false;
               }

               if (!this.ce(var5 + 2103691965, var9, var6 + 377597831)) {
                  return false;
               }

               return true;
            }

            if (var4 == 8) {
               if (var6 > ap) {
                  if (!this.ce(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.ce(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.ce(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.ce(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if (!this.ce(var5, var9, var6)) {
                  return false;
               }

               if (!this.ce(var5 + 2056431234, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         if (!this.ce(var5 + 64, var10, var6 + 64)) {
            return false;
         } else if (var4 == 16) {
            return this.ce(var5, var9, var6 + 128);
         } else if (var4 == 1969228210) {
            return this.ce(var5 + 677473693, var9, var6 + 128);
         } else if (var4 == 341951978) {
            return this.ce(var5 + 701299207, var9, var6);
         } else if (var4 == 110807593) {
            return this.ce(var5, var9, var6);
         } else {
            return true;
         }
      }
   }

   boolean gu(int var1, int var2, int var3, int var4) {
      if (!this.bp(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.ce(var5 + 1, this.au[var1][var2][var3] - var4, var6 + 1) && this.ce(var5 + 128 - 1, this.au[var1][var2 + 1][var3] - var4, var6 + 1) && this.ce(var5 + 128 - 1, this.au[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.ce(var5 + 1, this.au[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   public int bk(int var1, int var2, int var3, long var4) {
      is var6 = this.ab[var1][var2][var3];
      if (var6 == null) {
         return -1;
      } else if (var6.aq != null && var6.aq.al * -4009183385476919801L == var4) {
         return var6.aq.at * 347144389 & 255;
      } else if (var6.al != null && var6.al.aa * -4691380879163567243L == var4) {
         return var6.al.ay * 35030579 & 255;
      } else if (var6.at != null && var6.at.au * 3423223696102332293L == var4) {
         return var6.at.ab * -1486089441 & 255;
      } else {
         for(int var7 = 0; var7 < var6.ay * -422028371; ++var7) {
            if (var6.ao[var7].ax * 5016412888503339625L == var4) {
               return var6.ao[var7].ai * -72925475 & 255;
            }
         }

         return -1;
      }
   }

   public boolean ay(int var1, int var2, int var3, int var4, int var5, int var6, iv var7, int var8, long var9, int var11) {
      if (var7 == null) {
         return true;
      } else {
         int var12 = var2 * 128 + 64 * var5;
         int var13 = var3 * 128 + 64 * var6;
         return this.ai(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   public boolean ch(int var1, int var2, int var3, int var4, int var5, int var6, iv var7, int var8, long var9, int var11) {
      if (var7 == null) {
         return true;
      } else {
         int var12 = var2 * -1699591015 + 64 * var5;
         int var13 = var3 * -1045979899 + 64 * var6;
         return this.ai(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   boolean gw(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < bf; ++var4) {
         ip var5 = bq[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if (var5.ao * -221071853 == 1) {
            var6 = var5.ab * -1074260583 - var1;
            if (var6 > 0) {
               var7 = var5.al * -1443747699 + (var5.ag * -371961737 * var6 >> 8);
               var8 = var5.at * 1383802843 + (var5.ah * 1030915821 * var6 >> 8);
               var9 = var5.aa * 690846039 + (var5.av * -847323611 * var6 >> 8);
               var10 = var5.ay * 1879954201 + (var5.ar * -283662079 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ao * -221071853 == 2) {
            var6 = var1 - var5.ab * -1074260583;
            if (var6 > 0) {
               var7 = var5.al * -1443747699 + (var5.ag * -371961737 * var6 >> 8);
               var8 = var5.at * 1383802843 + (var5.ah * 1030915821 * var6 >> 8);
               var9 = var5.aa * 690846039 + (var5.av * -847323611 * var6 >> 8);
               var10 = var5.ay * 1879954201 + (var5.ar * -283662079 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ao * -221071853 == 3) {
            var6 = var5.al * -1443747699 - var3;
            if (var6 > 0) {
               var7 = var5.ab * -1074260583 + (var5.ax * 1498322871 * var6 >> 8);
               var8 = var5.aq * -875468987 + (var5.ai * 542133003 * var6 >> 8);
               var9 = var5.aa * 690846039 + (var5.av * -847323611 * var6 >> 8);
               var10 = var5.ay * 1879954201 + (var5.ar * -283662079 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ao * -221071853 == 4) {
            var6 = var3 - var5.al * -1443747699;
            if (var6 > 0) {
               var7 = var5.ab * -1074260583 + (var5.ax * 1498322871 * var6 >> 8);
               var8 = var5.aq * -875468987 + (var5.ai * 542133003 * var6 >> 8);
               var9 = var5.aa * 690846039 + (var5.av * -847323611 * var6 >> 8);
               var10 = var5.ay * 1879954201 + (var5.ar * -283662079 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ao * -221071853 == 5) {
            var6 = var2 - var5.aa * 690846039;
            if (var6 > 0) {
               var7 = var5.ab * -1074260583 + (var5.ax * 1498322871 * var6 >> 8);
               var8 = var5.aq * -875468987 + (var5.ai * 542133003 * var6 >> 8);
               var9 = var5.al * -1443747699 + (var5.ag * -371961737 * var6 >> 8);
               var10 = var5.at * 1383802843 + (var5.ah * 1030915821 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   boolean gc(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < bf; ++var4) {
         ip var5 = bq[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if (var5.ao * -2039344564 == 1) {
            var6 = var5.ab * -1074260583 - var1;
            if (var6 > 0) {
               var7 = var5.al * 866996366 + (var5.ag * 1730229589 * var6 >> 8);
               var8 = var5.at * 1383802843 + (var5.ah * 1817468171 * var6 >> 8);
               var9 = var5.aa * -1235262168 + (var5.av * -847323611 * var6 >> 8);
               var10 = var5.ay * 1879954201 + (var5.ar * 942492695 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ao * -221071853 == 2) {
            var6 = var1 - var5.ab * 914504115;
            if (var6 > 0) {
               var7 = var5.al * -1606046257 + (var5.ag * -878325167 * var6 >> 8);
               var8 = var5.at * 1383802843 + (var5.ah * 1030915821 * var6 >> 8);
               var9 = var5.aa * 2128672667 + (var5.av * -1265494299 * var6 >> 8);
               var10 = var5.ay * 1879954201 + (var5.ar * -283662079 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ao * 1539156813 == 3) {
            var6 = var5.al * 1790203987 - var3;
            if (var6 > 0) {
               var7 = var5.ab * 659637312 + (var5.ax * 1498322871 * var6 >> 8);
               var8 = var5.aq * -875468987 + (var5.ai * 542133003 * var6 >> 8);
               var9 = var5.aa * -2051131174 + (var5.av * -847323611 * var6 >> 8);
               var10 = var5.ay * 1879954201 + (var5.ar * -283662079 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ao * -1151754725 == 4) {
            var6 = var3 - var5.al * 685943707;
            if (var6 > 0) {
               var7 = var5.ab * -1074260583 + (var5.ax * 1498322871 * var6 >> 8);
               var8 = var5.aq * -1376916846 + (var5.ai * -1372354417 * var6 >> 8);
               var9 = var5.aa * -102299133 + (var5.av * -847323611 * var6 >> 8);
               var10 = var5.ay * -622418525 + (var5.ar * 1873380357 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ao * -221071853 == 5) {
            var6 = var2 - var5.aa * 690846039;
            if (var6 > 0) {
               var7 = var5.ab * -403713189 + (var5.ax * -332583373 * var6 >> 8);
               var8 = var5.aq * 1083278282 + (var5.ai * 542133003 * var6 >> 8);
               var9 = var5.al * -1443747699 + (var5.ag * -371961737 * var6 >> 8);
               var10 = var5.at * 1809803121 + (var5.ah * -227684920 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   boolean gf(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < bf; ++var4) {
         ip var5 = bq[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if (var5.ao * -221071853 == 1) {
            var6 = var5.ab * -1074260583 - var1;
            if (var6 > 0) {
               var7 = var5.al * -1443747699 + (var5.ag * -371961737 * var6 >> 8);
               var8 = var5.at * 1383802843 + (var5.ah * 1030915821 * var6 >> 8);
               var9 = var5.aa * 690846039 + (var5.av * -847323611 * var6 >> 8);
               var10 = var5.ay * 1879954201 + (var5.ar * -283662079 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ao * -221071853 == 2) {
            var6 = var1 - var5.ab * -1074260583;
            if (var6 > 0) {
               var7 = var5.al * -1443747699 + (var5.ag * -371961737 * var6 >> 8);
               var8 = var5.at * 1383802843 + (var5.ah * 1030915821 * var6 >> 8);
               var9 = var5.aa * 690846039 + (var5.av * -847323611 * var6 >> 8);
               var10 = var5.ay * 1879954201 + (var5.ar * -283662079 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ao * -221071853 == 3) {
            var6 = var5.al * -1443747699 - var3;
            if (var6 > 0) {
               var7 = var5.ab * -1074260583 + (var5.ax * 1498322871 * var6 >> 8);
               var8 = var5.aq * -875468987 + (var5.ai * 542133003 * var6 >> 8);
               var9 = var5.aa * 690846039 + (var5.av * -847323611 * var6 >> 8);
               var10 = var5.ay * 1879954201 + (var5.ar * -283662079 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ao * -221071853 == 4) {
            var6 = var3 - var5.al * -1443747699;
            if (var6 > 0) {
               var7 = var5.ab * -1074260583 + (var5.ax * 1498322871 * var6 >> 8);
               var8 = var5.aq * -875468987 + (var5.ai * 542133003 * var6 >> 8);
               var9 = var5.aa * 690846039 + (var5.av * -847323611 * var6 >> 8);
               var10 = var5.ay * 1879954201 + (var5.ar * -283662079 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.ao * -221071853 == 5) {
            var6 = var2 - var5.aa * 690846039;
            if (var6 > 0) {
               var7 = var5.ab * -1074260583 + (var5.ax * 1498322871 * var6 >> 8);
               var8 = var5.aq * -875468987 + (var5.ai * 542133003 * var6 >> 8);
               var9 = var5.al * -1443747699 + (var5.ag * -371961737 * var6 >> 8);
               var10 = var5.at * 1383802843 + (var5.ah * 1030915821 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }
}
