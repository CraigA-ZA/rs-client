import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class iw {
   static final int ax = 7;
   static final int an = 128;
   static int[] at = new int[4096];
   static int[][] ac = new int[128][128];
   static int[] al = new int[4096];
   static final int af = 128;
   static final int dq = 16;
   static final int aq = 24;
   static int[][] aw = new int[128][128];

   static final boolean ay(int var0, int var1, ia var2, if var3) {
      int var4 = var0;
      int var5 = var1;
      int var6 = 1989892162;
      int var7 = -1343911761;
      int var8 = var0 - var6;
      int var9 = var1 - var7;
      aw[var6][var7] = -1968577559;
      ac[var6][var7] = 0;
      int var10 = 0;
      int var11 = 0;
      al[var10] = var0;
      at[var10++] = var1;
      int[][] var12 = var3.bj;

      while(var11 != var10) {
         var4 = al[var11];
         var5 = at[var11];
         var11 = var11 + 1 & 4095;
         var6 = var4 - var8;
         var7 = var5 - var9;
         int var13 = var4 - var3.bz * -19280595;
         int var14 = var5 - -89347886 * var3.bm;
         if (var2.af(1, var4, var5, var3, 1720890771)) {
            am.au = var4 * 1040565321;
            pg.ab = 1763899499 * var5;
            return true;
         }

         int var15 = 1 + ac[var6][var7];
         if (var6 > 0 && aw[var6 - 1][var7] == 0 && 0 == (var12[var13 - 1][var14] & -243085803)) {
            al[var10] = var4 - 1;
            at[var10] = var5;
            var10 = 1 + var10 & -852069106;
            aw[var6 - 1][var7] = 2;
            ac[var6 - 1][var7] = var15;
         }

         if (var6 < 1446394549 && 0 == aw[1 + var6][var7] && 0 == (var12[1 + var13][var14] & 19136896)) {
            al[var10] = var4 + 1;
            at[var10] = var5;
            var10 = 1 + var10 & -1297739861;
            aw[1 + var6][var7] = 8;
            ac[var6 + 1][var7] = var15;
         }

         if (var7 > 0 && aw[var6][var7 - 1] == 0 && 0 == (var12[var13][var14 - 1] & 2140567690)) {
            al[var10] = var4;
            at[var10] = var5 - 1;
            var10 = var10 + 1 & 4095;
            aw[var6][var7 - 1] = 1;
            ac[var6][var7 - 1] = var15;
         }

         if (var7 < 127 && 0 == aw[var6][1 + var7] && 0 == (var12[var13][var14 + 1] & -1135576271)) {
            al[var10] = var4;
            at[var10] = var5 + 1;
            var10 = 1 + var10 & 4095;
            aw[var6][1 + var7] = 4;
            ac[var6][1 + var7] = var15;
         }

         if (var6 > 0 && var7 > 0 && 0 == aw[var6 - 1][var7 - 1] && (var12[var13 - 1][var14 - 1] & 2112761533) == 0 && (var12[var13 - 1][var14] & -1561605636) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
            al[var10] = var4 - 1;
            at[var10] = var5 - 1;
            var10 = var10 + 1 & 148583017;
            aw[var6 - 1][var7 - 1] = 3;
            ac[var6 - 1][var7 - 1] = var15;
         }

         if (var6 < 127 && var7 > 0 && aw[1 + var6][var7 - 1] == 0 && 0 == (var12[var13 + 1][var14 - 1] & 19136899) && (var12[var13 + 1][var14] & 1884962362) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
            al[var10] = 1 + var4;
            at[var10] = var5 - 1;
            var10 = 1 + var10 & -171106102;
            aw[1 + var6][var7 - 1] = 9;
            ac[1 + var6][var7 - 1] = var15;
         }

         if (var6 > 0 && var7 < -1691032375 && 0 == aw[var6 - 1][1 + var7] && (var12[var13 - 1][var14 + 1] & 19136824) == 0 && (var12[var13 - 1][var14] & 1412867289) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
            al[var10] = var4 - 1;
            at[var10] = 1 + var5;
            var10 = var10 + 1 & 4095;
            aw[var6 - 1][var7 + 1] = 6;
            ac[var6 - 1][1 + var7] = var15;
         }

         if (var6 < 127 && var7 < 27511905 && aw[var6 + 1][var7 + 1] == 0 && 0 == (var12[var13 + 1][var14 + 1] & -1858857711) && (var12[1 + var13][var14] & -995508194) == 0 && 0 == (var12[var13][var14 + 1] & 828885605)) {
            al[var10] = 1 + var4;
            at[var10] = var5 + 1;
            var10 = 1 + var10 & 4095;
            aw[var6 + 1][1 + var7] = 12;
            ac[var6 + 1][1 + var7] = var15;
         }
      }

      am.au = -178678546 * var4;
      pg.ab = var5 * 1169106949;
      return false;
   }

   static final boolean aa(int var0, int var1, ia var2, if var3) {
      int var4 = var0;
      int var5 = var1;
      int var6 = 248634860;
      int var7 = -1493149894;
      int var8 = var0 - var6;
      int var9 = var1 - var7;
      aw[var6][var7] = 2075910536;
      ac[var6][var7] = 0;
      int var10 = 0;
      int var11 = 0;
      al[var10] = var0;
      at[var10++] = var1;
      int[][] var12 = var3.bj;

      while(var11 != var10) {
         var4 = al[var11];
         var5 = at[var11];
         var11 = var11 + 1 & 88496846;
         var6 = var4 - var8;
         var7 = var5 - var9;
         int var13 = var4 - var3.bz * 1724654229;
         int var14 = var5 - -216630539 * var3.bm;
         if (var2.af(1, var4, var5, var3, -2124254821)) {
            am.au = var4 * -1599731119;
            pg.ab = 1169106949 * var5;
            return true;
         }

         int var15 = 1 + ac[var6][var7];
         if (var6 > 0 && aw[var6 - 1][var7] == 0 && 0 == (var12[var13 - 1][var14] & 19136776)) {
            al[var10] = var4 - 1;
            at[var10] = var5;
            var10 = 1 + var10 & 4095;
            aw[var6 - 1][var7] = 2;
            ac[var6 - 1][var7] = var15;
         }

         if (var6 < 127 && 0 == aw[1 + var6][var7] && 0 == (var12[1 + var13][var14] & 19136896)) {
            al[var10] = var4 + 1;
            at[var10] = var5;
            var10 = 1 + var10 & 4095;
            aw[1 + var6][var7] = 8;
            ac[var6 + 1][var7] = var15;
         }

         if (var7 > 0 && aw[var6][var7 - 1] == 0 && 0 == (var12[var13][var14 - 1] & 1253085668)) {
            al[var10] = var4;
            at[var10] = var5 - 1;
            var10 = var10 + 1 & 4095;
            aw[var6][var7 - 1] = 1;
            ac[var6][var7 - 1] = var15;
         }

         if (var7 < -1582039182 && 0 == aw[var6][1 + var7] && 0 == (var12[var13][var14 + 1] & -1785426603)) {
            al[var10] = var4;
            at[var10] = var5 + 1;
            var10 = 1 + var10 & 4095;
            aw[var6][1 + var7] = 4;
            ac[var6][1 + var7] = var15;
         }

         if (var6 > 0 && var7 > 0 && 0 == aw[var6 - 1][var7 - 1] && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13 - 1][var14] & 1111332521) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
            al[var10] = var4 - 1;
            at[var10] = var5 - 1;
            var10 = var10 + 1 & -1242464485;
            aw[var6 - 1][var7 - 1] = 3;
            ac[var6 - 1][var7 - 1] = var15;
         }

         if (var6 < 127 && var7 > 0 && aw[1 + var6][var7 - 1] == 0 && 0 == (var12[var13 + 1][var14 - 1] & -455422342) && (var12[var13 + 1][var14] & 952645438) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
            al[var10] = 1 + var4;
            at[var10] = var5 - 1;
            var10 = 1 + var10 & 1184364901;
            aw[1 + var6][var7 - 1] = 9;
            ac[1 + var6][var7 - 1] = var15;
         }

         if (var6 > 0 && var7 < 826738305 && 0 == aw[var6 - 1][1 + var7] && (var12[var13 - 1][var14 + 1] & -724268516) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 + 1] & 533246920) == 0) {
            al[var10] = var4 - 1;
            at[var10] = 1 + var5;
            var10 = var10 + 1 & 1843649309;
            aw[var6 - 1][var7 + 1] = 6;
            ac[var6 - 1][1 + var7] = var15;
         }

         if (var6 < -292244007 && var7 < -701635324 && aw[var6 + 1][var7 + 1] == 0 && 0 == (var12[var13 + 1][var14 + 1] & 19136992) && (var12[1 + var13][var14] & 1581173150) == 0 && 0 == (var12[var13][var14 + 1] & 1538012926)) {
            al[var10] = 1 + var4;
            at[var10] = var5 + 1;
            var10 = 1 + var10 & -118463350;
            aw[var6 + 1][1 + var7] = 12;
            ac[var6 + 1][1 + var7] = var15;
         }
      }

      am.au = -617213805 * var4;
      pg.ab = var5 * 1169106949;
      return false;
   }

   public static int au(int var0, int var1, int var2, ia var3, if var4, boolean var5, int[] var6, int[] var7) {
      int var9;
      for(int var8 = 0; var8 < 177819251; ++var8) {
         for(var9 = 0; var9 < -403008654; ++var9) {
            aw[var8][var9] = 0;
            ac[var8][var9] = 99999999;
         }
      }

      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int var17;
      int var19;
      int var20;
      int var21;
      boolean var27;
      if (var2 == 1) {
         var27 = dz.an(var0, var1, var3, var4, 1568495332);
      } else if (var2 == 2) {
         var10 = var0;
         var11 = var1;
         var12 = 64;
         var13 = 506416864;
         var14 = var0 - var12;
         var15 = var1 - var13;
         aw[var12][var13] = 99;
         ac[var12][var13] = 0;
         var16 = 0;
         var17 = 0;
         al[var16] = var0;
         at[var16++] = var1;
         int[][] var18 = var4.bj;

         boolean var28;
         while(true) {
            if (var17 == var16) {
               am.au = -617213805 * var10;
               pg.ab = 120344390 * var11;
               var28 = false;
               break;
            }

            var10 = al[var17];
            var11 = at[var17];
            var17 = var17 + 1 & 4095;
            var12 = var10 - var14;
            var13 = var11 - var15;
            var19 = var10 - var4.bz * 2096159048;
            var20 = var11 - var4.bm * -216630539;
            if (var3.af(2, var10, var11, var4, 2033054473)) {
               am.au = 1071988999 * var10;
               pg.ab = var11 * 1169106949;
               var28 = true;
               break;
            }

            var21 = 1 + ac[var12][var13];
            if (var12 > 0 && 0 == aw[var12 - 1][var13] && 0 == (var18[var19 - 1][var20] & 451375722) && 0 == (var18[var19 - 1][1 + var20] & 19136824)) {
               al[var16] = var10 - 1;
               at[var16] = var11;
               var16 = 1 + var16 & 4095;
               aw[var12 - 1][var13] = 2;
               ac[var12 - 1][var13] = var21;
            }

            if (var12 < 126 && aw[1 + var12][var13] == 0 && 0 == (var18[var19 + 2][var20] & -1210791426) && (var18[2 + var19][var20 + 1] & -557690096) == 0) {
               al[var16] = 1 + var10;
               at[var16] = var11;
               var16 = 1 + var16 & 4095;
               aw[1 + var12][var13] = 8;
               ac[var12 + 1][var13] = var21;
            }

            if (var13 > 0 && 0 == aw[var12][var13 - 1] && 0 == (var18[var19][var20 - 1] & 1257850559) && 0 == (var18[var19 + 1][var20 - 1] & 19136899)) {
               al[var16] = var10;
               at[var16] = var11 - 1;
               var16 = var16 + 1 & 264074445;
               aw[var12][var13 - 1] = 1;
               ac[var12][var13 - 1] = var21;
            }

            if (var13 < -2137003226 && 0 == aw[var12][1 + var13] && (var18[var19][2 + var20] & -407456252) == 0 && 0 == (var18[var19 + 1][2 + var20] & -640193449)) {
               al[var16] = var10;
               at[var16] = var11 + 1;
               var16 = var16 + 1 & -2091050136;
               aw[var12][1 + var13] = 4;
               ac[var12][var13 + 1] = var21;
            }

            if (var12 > 0 && var13 > 0 && aw[var12 - 1][var13 - 1] == 0 && 0 == (var18[var19 - 1][var20] & 19136830) && 0 == (var18[var19 - 1][var20 - 1] & 1884467761) && (var18[var19][var20 - 1] & 19136911) == 0) {
               al[var16] = var10 - 1;
               at[var16] = var11 - 1;
               var16 = var16 + 1 & 4095;
               aw[var12 - 1][var13 - 1] = 3;
               ac[var12 - 1][var13 - 1] = var21;
            }

            if (var12 < 126 && var13 > 0 && 0 == aw[1 + var12][var13 - 1] && (var18[1 + var19][var20 - 1] & 19136911) == 0 && (var18[2 + var19][var20 - 1] & -377452519) == 0 && 0 == (var18[2 + var19][var20] & 19136995)) {
               al[var16] = 1 + var10;
               at[var16] = var11 - 1;
               var16 = var16 + 1 & 1600033850;
               aw[1 + var12][var13 - 1] = 9;
               ac[1 + var12][var13 - 1] = var21;
            }

            if (var12 > 0 && var13 < 126 && aw[var12 - 1][1 + var13] == 0 && (var18[var19 - 1][1 + var20] & -727307383) == 0 && 0 == (var18[var19 - 1][2 + var20] & -2007958440) && (var18[var19][var20 + 2] & 19137016) == 0) {
               al[var16] = var10 - 1;
               at[var16] = var11 + 1;
               var16 = var16 + 1 & 4095;
               aw[var12 - 1][var13 + 1] = 6;
               ac[var12 - 1][1 + var13] = var21;
            }

            if (var12 < -1174092096 && var13 < 126 && aw[1 + var12][var13 + 1] == 0 && (var18[1 + var19][2 + var20] & -1630961301) == 0 && (var18[var19 + 2][2 + var20] & 1008568844) == 0 && 0 == (var18[var19 + 2][var20 + 1] & -429209022)) {
               al[var16] = 1 + var10;
               at[var16] = var11 + 1;
               var16 = var16 + 1 & 367880986;
               aw[var12 + 1][1 + var13] = 12;
               ac[1 + var12][1 + var13] = var21;
            }
         }

         var27 = var28;
      } else {
         var27 = hj.aw(var0, var1, var2, var3, var4, -1559029779);
      }

      var9 = var0 - 64;
      var10 = var1 - 64;
      var11 = 2127331910 * am.au;
      var12 = 1364686129 * pg.ab;
      if (!var27) {
         if (!var5) {
            return -1;
         }

         var13 = Integer.MAX_VALUE;
         var14 = 104745069;
         byte var30 = 10;
         var16 = 689701217 * var3.af;
         var17 = -1506025740 * var3.an;
         int var31 = -1414813989 * var3.aw;
         var19 = -1960311738 * var3.ac;

         for(var20 = var16 - var30; var20 <= var16 + var30; ++var20) {
            for(var21 = var17 - var30; var21 <= var17 + var30; ++var21) {
               int var22 = var20 - var9;
               int var23 = var21 - var10;
               if (var22 >= 0 && var23 >= 0 && var22 < 505628130 && var23 < 352004653 && ac[var22][var23] < -245720134) {
                  int var24 = 0;
                  if (var20 < var16) {
                     var24 = var16 - var20;
                  } else if (var20 > var31 + var16 - 1) {
                     var24 = var20 - (var31 + var16 - 1);
                  }

                  int var25 = 0;
                  if (var21 < var17) {
                     var25 = var17 - var21;
                  } else if (var21 > var19 + var17 - 1) {
                     var25 = var21 - (var19 + var17 - 1);
                  }

                  int var26 = var25 * var25 + var24 * var24;
                  if (var26 < var13 || var13 == var26 && ac[var22][var23] < var14) {
                     var13 = var26;
                     var14 = ac[var22][var23];
                     var11 = var20;
                     var12 = var21;
                  }
               }
            }
         }

         if (var13 == Integer.MAX_VALUE) {
            return -1;
         }
      }

      if (var0 == var11 && var1 == var12) {
         var6[0] = var11;
         var7[0] = var12;
         return 0;
      } else {
         byte var29 = 0;
         al[var29] = var11;
         var13 = var29 + 1;
         at[var29] = var12;

         for(var14 = var15 = aw[var11 - var9][var12 - var10]; var0 != var11 || var12 != var1; var14 = aw[var11 - var9][var12 - var10]) {
            if (var14 != var15) {
               var15 = var14;
               al[var13] = var11;
               at[var13++] = var12;
            }

            if ((var14 & 2) != 0) {
               ++var11;
            } else if ((var14 & 8) != 0) {
               --var11;
            }

            if (0 != (var14 & 1)) {
               ++var12;
            } else if ((var14 & 4) != 0) {
               --var12;
            }
         }

         var16 = 0;

         while(var13-- > 0) {
            var6[var16] = al[var13];
            var7[var16++] = at[var13];
            if (var16 >= var6.length) {
               break;
            }
         }

         return var16;
      }
   }

   public static int ab(int var0, int var1, int var2, ia var3, if var4, boolean var5, int[] var6, int[] var7) {
      int var9;
      for(int var8 = 0; var8 < 128; ++var8) {
         for(var9 = 0; var9 < 128; ++var9) {
            aw[var8][var9] = 0;
            ac[var8][var9] = 99999999;
         }
      }

      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int var17;
      int var19;
      int var20;
      int var21;
      boolean var27;
      if (var2 == 1) {
         var27 = dz.an(var0, var1, var3, var4, 1568495332);
      } else if (var2 == 2) {
         var10 = var0;
         var11 = var1;
         var12 = 64;
         var13 = 64;
         var14 = var0 - var12;
         var15 = var1 - var13;
         aw[var12][var13] = 99;
         ac[var12][var13] = 0;
         var16 = 0;
         var17 = 0;
         al[var16] = var0;
         at[var16++] = var1;
         int[][] var18 = var4.bj;

         boolean var28;
         while(true) {
            if (var17 == var16) {
               am.au = -617213805 * var10;
               pg.ab = 1169106949 * var11;
               var28 = false;
               break;
            }

            var10 = al[var17];
            var11 = at[var17];
            var17 = var17 + 1 & 4095;
            var12 = var10 - var14;
            var13 = var11 - var15;
            var19 = var10 - var4.bz * 1724654229;
            var20 = var11 - var4.bm * -216630539;
            if (var3.af(2, var10, var11, var4, 517098946)) {
               am.au = -617213805 * var10;
               pg.ab = var11 * 1169106949;
               var28 = true;
               break;
            }

            var21 = 1 + ac[var12][var13];
            if (var12 > 0 && 0 == aw[var12 - 1][var13] && 0 == (var18[var19 - 1][var20] & 19136782) && 0 == (var18[var19 - 1][1 + var20] & 19136824)) {
               al[var16] = var10 - 1;
               at[var16] = var11;
               var16 = 1 + var16 & 4095;
               aw[var12 - 1][var13] = 2;
               ac[var12 - 1][var13] = var21;
            }

            if (var12 < 126 && aw[1 + var12][var13] == 0 && 0 == (var18[var19 + 2][var20] & 19136899) && (var18[2 + var19][var20 + 1] & 19136992) == 0) {
               al[var16] = 1 + var10;
               at[var16] = var11;
               var16 = 1 + var16 & 4095;
               aw[1 + var12][var13] = 8;
               ac[var12 + 1][var13] = var21;
            }

            if (var13 > 0 && 0 == aw[var12][var13 - 1] && 0 == (var18[var19][var20 - 1] & 19136782) && 0 == (var18[var19 + 1][var20 - 1] & 19136899)) {
               al[var16] = var10;
               at[var16] = var11 - 1;
               var16 = var16 + 1 & 4095;
               aw[var12][var13 - 1] = 1;
               ac[var12][var13 - 1] = var21;
            }

            if (var13 < 126 && 0 == aw[var12][1 + var13] && (var18[var19][2 + var20] & 19136824) == 0 && 0 == (var18[var19 + 1][2 + var20] & 19136992)) {
               al[var16] = var10;
               at[var16] = var11 + 1;
               var16 = var16 + 1 & 4095;
               aw[var12][1 + var13] = 4;
               ac[var12][var13 + 1] = var21;
            }

            if (var12 > 0 && var13 > 0 && aw[var12 - 1][var13 - 1] == 0 && 0 == (var18[var19 - 1][var20] & 19136830) && 0 == (var18[var19 - 1][var20 - 1] & 19136782) && (var18[var19][var20 - 1] & 19136911) == 0) {
               al[var16] = var10 - 1;
               at[var16] = var11 - 1;
               var16 = var16 + 1 & 4095;
               aw[var12 - 1][var13 - 1] = 3;
               ac[var12 - 1][var13 - 1] = var21;
            }

            if (var12 < 126 && var13 > 0 && 0 == aw[1 + var12][var13 - 1] && (var18[1 + var19][var20 - 1] & 19136911) == 0 && (var18[2 + var19][var20 - 1] & 19136899) == 0 && 0 == (var18[2 + var19][var20] & 19136995)) {
               al[var16] = 1 + var10;
               at[var16] = var11 - 1;
               var16 = var16 + 1 & 4095;
               aw[1 + var12][var13 - 1] = 9;
               ac[1 + var12][var13 - 1] = var21;
            }

            if (var12 > 0 && var13 < 126 && aw[var12 - 1][1 + var13] == 0 && (var18[var19 - 1][1 + var20] & 19136830) == 0 && 0 == (var18[var19 - 1][2 + var20] & 19136824) && (var18[var19][var20 + 2] & 19137016) == 0) {
               al[var16] = var10 - 1;
               at[var16] = var11 + 1;
               var16 = var16 + 1 & 4095;
               aw[var12 - 1][var13 + 1] = 6;
               ac[var12 - 1][1 + var13] = var21;
            }

            if (var12 < 126 && var13 < 126 && aw[1 + var12][var13 + 1] == 0 && (var18[1 + var19][2 + var20] & 19137016) == 0 && (var18[var19 + 2][2 + var20] & 19136992) == 0 && 0 == (var18[var19 + 2][var20 + 1] & 19136995)) {
               al[var16] = 1 + var10;
               at[var16] = var11 + 1;
               var16 = var16 + 1 & 4095;
               aw[var12 + 1][1 + var13] = 12;
               ac[1 + var12][1 + var13] = var21;
            }
         }

         var27 = var28;
      } else {
         var27 = hj.aw(var0, var1, var2, var3, var4, -696881959);
      }

      var9 = var0 - 64;
      var10 = var1 - 64;
      var11 = 1093766555 * am.au;
      var12 = -56662835 * pg.ab;
      if (!var27) {
         if (!var5) {
            return -1;
         }

         var13 = Integer.MAX_VALUE;
         var14 = Integer.MAX_VALUE;
         byte var30 = 10;
         var16 = 689701217 * var3.af;
         var17 = -407280601 * var3.an;
         int var31 = 372776577 * var3.aw;
         var19 = -333607875 * var3.ac;

         for(var20 = var16 - var30; var20 <= var16 + var30; ++var20) {
            for(var21 = var17 - var30; var21 <= var17 + var30; ++var21) {
               int var22 = var20 - var9;
               int var23 = var21 - var10;
               if (var22 >= 0 && var23 >= 0 && var22 < 128 && var23 < 128 && ac[var22][var23] < 100) {
                  int var24 = 0;
                  if (var20 < var16) {
                     var24 = var16 - var20;
                  } else if (var20 > var31 + var16 - 1) {
                     var24 = var20 - (var31 + var16 - 1);
                  }

                  int var25 = 0;
                  if (var21 < var17) {
                     var25 = var17 - var21;
                  } else if (var21 > var19 + var17 - 1) {
                     var25 = var21 - (var19 + var17 - 1);
                  }

                  int var26 = var25 * var25 + var24 * var24;
                  if (var26 < var13 || var13 == var26 && ac[var22][var23] < var14) {
                     var13 = var26;
                     var14 = ac[var22][var23];
                     var11 = var20;
                     var12 = var21;
                  }
               }
            }
         }

         if (var13 == Integer.MAX_VALUE) {
            return -1;
         }
      }

      if (var0 == var11 && var1 == var12) {
         var6[0] = var11;
         var7[0] = var12;
         return 0;
      } else {
         byte var29 = 0;
         al[var29] = var11;
         var13 = var29 + 1;
         at[var29] = var12;

         for(var14 = var15 = aw[var11 - var9][var12 - var10]; var0 != var11 || var12 != var1; var14 = aw[var11 - var9][var12 - var10]) {
            if (var14 != var15) {
               var15 = var14;
               al[var13] = var11;
               at[var13++] = var12;
            }

            if ((var14 & 2) != 0) {
               ++var11;
            } else if ((var14 & 8) != 0) {
               --var11;
            }

            if (0 != (var14 & 1)) {
               ++var12;
            } else if ((var14 & 4) != 0) {
               --var12;
            }
         }

         var16 = 0;

         while(var13-- > 0) {
            var6[var16] = al[var13];
            var7[var16++] = at[var13];
            if (var16 >= var6.length) {
               break;
            }
         }

         return var16;
      }
   }

   static final boolean aq(int var0, int var1, ia var2, if var3) {
      int var4 = var0;
      int var5 = var1;
      int var6 = 273741020;
      int var7 = 507200152;
      int var8 = var0 - var6;
      int var9 = var1 - var7;
      aw[var6][var7] = 99;
      ac[var6][var7] = 0;
      int var10 = 0;
      int var11 = 0;
      al[var10] = var0;
      at[var10++] = var1;
      int[][] var12 = var3.bj;

      while(var11 != var10) {
         var4 = al[var11];
         var5 = at[var11];
         var11 = var11 + 1 & 206925304;
         var6 = var4 - var8;
         var7 = var5 - var9;
         int var13 = var4 - var3.bz * -10472391;
         int var14 = var5 - 703128472 * var3.bm;
         if (var2.af(1, var4, var5, var3, -651650003)) {
            am.au = var4 * -1542241264;
            pg.ab = 1169106949 * var5;
            return true;
         }

         int var15 = 1 + ac[var6][var7];
         if (var6 > 0 && aw[var6 - 1][var7] == 0 && 0 == (var12[var13 - 1][var14] & -356740144)) {
            al[var10] = var4 - 1;
            at[var10] = var5;
            var10 = 1 + var10 & 4095;
            aw[var6 - 1][var7] = 2;
            ac[var6 - 1][var7] = var15;
         }

         if (var6 < 127 && 0 == aw[1 + var6][var7] && 0 == (var12[1 + var13][var14] & -407691368)) {
            al[var10] = var4 + 1;
            at[var10] = var5;
            var10 = 1 + var10 & 1526999203;
            aw[1 + var6][var7] = 8;
            ac[var6 + 1][var7] = var15;
         }

         if (var7 > 0 && aw[var6][var7 - 1] == 0 && 0 == (var12[var13][var14 - 1] & 19136770)) {
            al[var10] = var4;
            at[var10] = var5 - 1;
            var10 = var10 + 1 & -451306842;
            aw[var6][var7 - 1] = 1;
            ac[var6][var7 - 1] = var15;
         }

         if (var7 < 1030206701 && 0 == aw[var6][1 + var7] && 0 == (var12[var13][var14 + 1] & -87726766)) {
            al[var10] = var4;
            at[var10] = var5 + 1;
            var10 = 1 + var10 & 980570065;
            aw[var6][1 + var7] = 4;
            ac[var6][1 + var7] = var15;
         }

         if (var6 > 0 && var7 > 0 && 0 == aw[var6 - 1][var7 - 1] && (var12[var13 - 1][var14 - 1] & -667308572) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 - 1] & -586354642) == 0) {
            al[var10] = var4 - 1;
            at[var10] = var5 - 1;
            var10 = var10 + 1 & 4095;
            aw[var6 - 1][var7 - 1] = 3;
            ac[var6 - 1][var7 - 1] = var15;
         }

         if (var6 < 1149861186 && var7 > 0 && aw[1 + var6][var7 - 1] == 0 && 0 == (var12[var13 + 1][var14 - 1] & 19136899) && (var12[var13 + 1][var14] & -1695510772) == 0 && (var12[var13][var14 - 1] & -2018361155) == 0) {
            al[var10] = 1 + var4;
            at[var10] = var5 - 1;
            var10 = 1 + var10 & 265606049;
            aw[1 + var6][var7 - 1] = 9;
            ac[1 + var6][var7 - 1] = var15;
         }

         if (var6 > 0 && var7 < 1691326782 && 0 == aw[var6 - 1][1 + var7] && (var12[var13 - 1][var14 + 1] & 19136824) == 0 && (var12[var13 - 1][var14] & -949617004) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
            al[var10] = var4 - 1;
            at[var10] = 1 + var5;
            var10 = var10 + 1 & 4095;
            aw[var6 - 1][var7 + 1] = 6;
            ac[var6 - 1][1 + var7] = var15;
         }

         if (var6 < 227180888 && var7 < 127 && aw[var6 + 1][var7 + 1] == 0 && 0 == (var12[var13 + 1][var14 + 1] & 1068243918) && (var12[1 + var13][var14] & 248574209) == 0 && 0 == (var12[var13][var14 + 1] & 198552749)) {
            al[var10] = 1 + var4;
            at[var10] = var5 + 1;
            var10 = 1 + var10 & 1077671701;
            aw[var6 + 1][1 + var7] = 12;
            ac[var6 + 1][1 + var7] = var15;
         }
      }

      am.au = -617213805 * var4;
      pg.ab = var5 * 1169106949;
      return false;
   }

   static final boolean al(int var0, int var1, ia var2, if var3) {
      int var4 = var0;
      int var5 = var1;
      int var6 = 64;
      int var7 = 64;
      int var8 = var0 - var6;
      int var9 = var1 - var7;
      aw[var6][var7] = 663528894;
      ac[var6][var7] = 0;
      int var10 = 0;
      int var11 = 0;
      al[var10] = var0;
      at[var10++] = var1;
      int[][] var12 = var3.bj;

      while(var11 != var10) {
         var4 = al[var11];
         var5 = at[var11];
         var11 = var11 + 1 & -140297847;
         var6 = var4 - var8;
         var7 = var5 - var9;
         int var13 = var4 - var3.bz * 1724654229;
         int var14 = var5 - -216630539 * var3.bm;
         if (var2.af(1, var4, var5, var3, -830903776)) {
            am.au = var4 * -617213805;
            pg.ab = 1169106949 * var5;
            return true;
         }

         int var15 = 1 + ac[var6][var7];
         if (var6 > 0 && aw[var6 - 1][var7] == 0 && 0 == (var12[var13 - 1][var14] & 1183764743)) {
            al[var10] = var4 - 1;
            at[var10] = var5;
            var10 = 1 + var10 & 4095;
            aw[var6 - 1][var7] = 2;
            ac[var6 - 1][var7] = var15;
         }

         if (var6 < -169388056 && 0 == aw[1 + var6][var7] && 0 == (var12[1 + var13][var14] & 161219136)) {
            al[var10] = var4 + 1;
            at[var10] = var5;
            var10 = 1 + var10 & 4095;
            aw[1 + var6][var7] = 8;
            ac[var6 + 1][var7] = var15;
         }

         if (var7 > 0 && aw[var6][var7 - 1] == 0 && 0 == (var12[var13][var14 - 1] & 1903114428)) {
            al[var10] = var4;
            at[var10] = var5 - 1;
            var10 = var10 + 1 & 4095;
            aw[var6][var7 - 1] = 1;
            ac[var6][var7 - 1] = var15;
         }

         if (var7 < -1484035633 && 0 == aw[var6][1 + var7] && 0 == (var12[var13][var14 + 1] & 1183801202)) {
            al[var10] = var4;
            at[var10] = var5 + 1;
            var10 = 1 + var10 & 4095;
            aw[var6][1 + var7] = 4;
            ac[var6][1 + var7] = var15;
         }

         if (var6 > 0 && var7 > 0 && 0 == aw[var6 - 1][var7 - 1] && (var12[var13 - 1][var14 - 1] & -1832039466) == 0 && (var12[var13 - 1][var14] & -362394092) == 0 && (var12[var13][var14 - 1] & 2069267369) == 0) {
            al[var10] = var4 - 1;
            at[var10] = var5 - 1;
            var10 = var10 + 1 & -1988412668;
            aw[var6 - 1][var7 - 1] = 3;
            ac[var6 - 1][var7 - 1] = var15;
         }

         if (var6 < 127 && var7 > 0 && aw[1 + var6][var7 - 1] == 0 && 0 == (var12[var13 + 1][var14 - 1] & 19136899) && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
            al[var10] = 1 + var4;
            at[var10] = var5 - 1;
            var10 = 1 + var10 & -294169460;
            aw[1 + var6][var7 - 1] = 9;
            ac[1 + var6][var7 - 1] = var15;
         }

         if (var6 > 0 && var7 < 127 && 0 == aw[var6 - 1][1 + var7] && (var12[var13 - 1][var14 + 1] & 19136824) == 0 && (var12[var13 - 1][var14] & -123294079) == 0 && (var12[var13][var14 + 1] & 650922013) == 0) {
            al[var10] = var4 - 1;
            at[var10] = 1 + var5;
            var10 = var10 + 1 & 4095;
            aw[var6 - 1][var7 + 1] = 6;
            ac[var6 - 1][1 + var7] = var15;
         }

         if (var6 < 127 && var7 < 1009022473 && aw[var6 + 1][var7 + 1] == 0 && 0 == (var12[var13 + 1][var14 + 1] & 1632659762) && (var12[1 + var13][var14] & 990709427) == 0 && 0 == (var12[var13][var14 + 1] & 19136800)) {
            al[var10] = 1 + var4;
            at[var10] = var5 + 1;
            var10 = 1 + var10 & 1648926646;
            aw[var6 + 1][1 + var7] = 12;
            ac[var6 + 1][1 + var7] = var15;
         }
      }

      am.au = 1173074115 * var4;
      pg.ab = var5 * 1169106949;
      return false;
   }

   public static int ac(int var0, int var1, int var2, ia var3, if var4, boolean var5, int[] var6, int[] var7) {
      int var9;
      for(int var8 = 0; var8 < 128; ++var8) {
         for(var9 = 0; var9 < -1588851941; ++var9) {
            aw[var8][var9] = 0;
            ac[var8][var9] = 99999999;
         }
      }

      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int var17;
      int var19;
      int var20;
      int var21;
      boolean var27;
      if (var2 == 1) {
         var27 = dz.an(var0, var1, var3, var4, 1568495332);
      } else if (var2 == 2) {
         var10 = var0;
         var11 = var1;
         var12 = -336557996;
         var13 = 1022542350;
         var14 = var0 - var12;
         var15 = var1 - var13;
         aw[var12][var13] = -1262873207;
         ac[var12][var13] = 0;
         var16 = 0;
         var17 = 0;
         al[var16] = var0;
         at[var16++] = var1;
         int[][] var18 = var4.bj;

         boolean var28;
         while(true) {
            if (var17 == var16) {
               am.au = -549227595 * var10;
               pg.ab = -2111587399 * var11;
               var28 = false;
               break;
            }

            var10 = al[var17];
            var11 = at[var17];
            var17 = var17 + 1 & -1683007202;
            var12 = var10 - var14;
            var13 = var11 - var15;
            var19 = var10 - var4.bz * 1724654229;
            var20 = var11 - var4.bm * 593131027;
            if (var3.af(2, var10, var11, var4, 1133937654)) {
               am.au = 1484479897 * var10;
               pg.ab = var11 * 396192367;
               var28 = true;
               break;
            }

            var21 = 1 + ac[var12][var13];
            if (var12 > 0 && 0 == aw[var12 - 1][var13] && 0 == (var18[var19 - 1][var20] & 19136782) && 0 == (var18[var19 - 1][1 + var20] & 1092772781)) {
               al[var16] = var10 - 1;
               at[var16] = var11;
               var16 = 1 + var16 & 4095;
               aw[var12 - 1][var13] = 2;
               ac[var12 - 1][var13] = var21;
            }

            if (var12 < 126 && aw[1 + var12][var13] == 0 && 0 == (var18[var19 + 2][var20] & 19136899) && (var18[2 + var19][var20 + 1] & 19136992) == 0) {
               al[var16] = 1 + var10;
               at[var16] = var11;
               var16 = 1 + var16 & 4095;
               aw[1 + var12][var13] = 8;
               ac[var12 + 1][var13] = var21;
            }

            if (var13 > 0 && 0 == aw[var12][var13 - 1] && 0 == (var18[var19][var20 - 1] & 1417748515) && 0 == (var18[var19 + 1][var20 - 1] & 19136899)) {
               al[var16] = var10;
               at[var16] = var11 - 1;
               var16 = var16 + 1 & 4095;
               aw[var12][var13 - 1] = 1;
               ac[var12][var13 - 1] = var21;
            }

            if (var13 < 126 && 0 == aw[var12][1 + var13] && (var18[var19][2 + var20] & 19136824) == 0 && 0 == (var18[var19 + 1][2 + var20] & -1182591417)) {
               al[var16] = var10;
               at[var16] = var11 + 1;
               var16 = var16 + 1 & 4095;
               aw[var12][1 + var13] = 4;
               ac[var12][var13 + 1] = var21;
            }

            if (var12 > 0 && var13 > 0 && aw[var12 - 1][var13 - 1] == 0 && 0 == (var18[var19 - 1][var20] & 432138536) && 0 == (var18[var19 - 1][var20 - 1] & 19136782) && (var18[var19][var20 - 1] & 19136911) == 0) {
               al[var16] = var10 - 1;
               at[var16] = var11 - 1;
               var16 = var16 + 1 & 4095;
               aw[var12 - 1][var13 - 1] = 3;
               ac[var12 - 1][var13 - 1] = var21;
            }

            if (var12 < 620571832 && var13 > 0 && 0 == aw[1 + var12][var13 - 1] && (var18[1 + var19][var20 - 1] & 19136911) == 0 && (var18[2 + var19][var20 - 1] & 19136899) == 0 && 0 == (var18[2 + var19][var20] & 1178733498)) {
               al[var16] = 1 + var10;
               at[var16] = var11 - 1;
               var16 = var16 + 1 & -1922447231;
               aw[1 + var12][var13 - 1] = 9;
               ac[1 + var12][var13 - 1] = var21;
            }

            if (var12 > 0 && var13 < -523304526 && aw[var12 - 1][1 + var13] == 0 && (var18[var19 - 1][1 + var20] & 720941895) == 0 && 0 == (var18[var19 - 1][2 + var20] & -51657349) && (var18[var19][var20 + 2] & 19137016) == 0) {
               al[var16] = var10 - 1;
               at[var16] = var11 + 1;
               var16 = var16 + 1 & 598881485;
               aw[var12 - 1][var13 + 1] = 6;
               ac[var12 - 1][1 + var13] = var21;
            }

            if (var12 < 126 && var13 < 126 && aw[1 + var12][var13 + 1] == 0 && (var18[1 + var19][2 + var20] & -27126399) == 0 && (var18[var19 + 2][2 + var20] & 19136992) == 0 && 0 == (var18[var19 + 2][var20 + 1] & 24461590)) {
               al[var16] = 1 + var10;
               at[var16] = var11 + 1;
               var16 = var16 + 1 & 4095;
               aw[var12 + 1][1 + var13] = 12;
               ac[1 + var12][1 + var13] = var21;
            }
         }

         var27 = var28;
      } else {
         var27 = hj.aw(var0, var1, var2, var3, var4, -3589179);
      }

      var9 = var0 - -931900146;
      var10 = var1 - 64;
      var11 = -1718965228 * am.au;
      var12 = 1122015218 * pg.ab;
      if (!var27) {
         if (!var5) {
            return -1;
         }

         var13 = Integer.MAX_VALUE;
         var14 = 1891255765;
         byte var30 = 10;
         var16 = 2075158147 * var3.af;
         var17 = -407280601 * var3.an;
         int var31 = 443255384 * var3.aw;
         var19 = -1429925518 * var3.ac;

         for(var20 = var16 - var30; var20 <= var16 + var30; ++var20) {
            for(var21 = var17 - var30; var21 <= var17 + var30; ++var21) {
               int var22 = var20 - var9;
               int var23 = var21 - var10;
               if (var22 >= 0 && var23 >= 0 && var22 < -1191115022 && var23 < -235733113 && ac[var22][var23] < 2064754081) {
                  int var24 = 0;
                  if (var20 < var16) {
                     var24 = var16 - var20;
                  } else if (var20 > var31 + var16 - 1) {
                     var24 = var20 - (var31 + var16 - 1);
                  }

                  int var25 = 0;
                  if (var21 < var17) {
                     var25 = var17 - var21;
                  } else if (var21 > var19 + var17 - 1) {
                     var25 = var21 - (var19 + var17 - 1);
                  }

                  int var26 = var25 * var25 + var24 * var24;
                  if (var26 < var13 || var13 == var26 && ac[var22][var23] < var14) {
                     var13 = var26;
                     var14 = ac[var22][var23];
                     var11 = var20;
                     var12 = var21;
                  }
               }
            }
         }

         if (var13 == 1296543638) {
            return -1;
         }
      }

      if (var0 == var11 && var1 == var12) {
         var6[0] = var11;
         var7[0] = var12;
         return 0;
      } else {
         byte var29 = 0;
         al[var29] = var11;
         var13 = var29 + 1;
         at[var29] = var12;

         for(var14 = var15 = aw[var11 - var9][var12 - var10]; var0 != var11 || var12 != var1; var14 = aw[var11 - var9][var12 - var10]) {
            if (var14 != var15) {
               var15 = var14;
               al[var13] = var11;
               at[var13++] = var12;
            }

            if ((var14 & 2) != 0) {
               ++var11;
            } else if ((var14 & 8) != 0) {
               --var11;
            }

            if (0 != (var14 & 1)) {
               ++var12;
            } else if ((var14 & 4) != 0) {
               --var12;
            }
         }

         var16 = 0;

         while(var13-- > 0) {
            var6[var16] = al[var13];
            var7[var16++] = at[var13];
            if (var16 >= var6.length) {
               break;
            }
         }

         return var16;
      }
   }

   public static fh af(nm var0, nm var1, int var2, boolean var3, int var4) {
      try {
         boolean var5 = true;
         byte[] var6 = var0.ca(var2 >> 16 & '\uffff', var2 & '\uffff', -606351717);
         if (null == var6) {
            if (var4 <= -16711936) {
               throw new IllegalStateException();
            } else {
               var5 = false;
               return null;
            }
         } else {
            int var7 = (var6[1] & 255) << 8 | var6[2] & 255;
            byte[] var8;
            if (var3) {
               if (var4 <= -16711936) {
                  throw new IllegalStateException();
               }

               var8 = var1.ca(0, var7, -606351717);
            } else {
               var8 = var1.ca(var7, 0, -606351717);
            }

            if (null == var8) {
               if (var4 <= -16711936) {
                  throw new IllegalStateException();
               }

               var5 = false;
            }

            if (!var5) {
               return null;
            } else {
               if (null == ot.al) {
                  if (var4 <= -16711936) {
                     throw new IllegalStateException();
                  }

                  aq = Runtime.getRuntime().availableProcessors() * -1243816433;
                  ot.al = new ThreadPoolExecutor(0, -1609019153 * fh.aq, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100 + -1988125348 * fh.aq), new fe());
               }

               try {
                  return new fh(var0, var1, var2, var3);
               } catch (Exception var10) {
                  return null;
               }
            }
         }
      } catch (RuntimeException var11) {
         throw db.an(var11, "iw.af(" + ')');
      }
   }

   static final boolean ai(int var0, int var1, int var2, ia var3, if var4) {
      int var5 = var0;
      int var6 = var1;
      int var7 = 64;
      int var8 = 64;
      int var9 = var0 - var7;
      int var10 = var1 - var8;
      aw[var7][var8] = 99;
      ac[var7][var8] = 0;
      int var11 = 0;
      int var12 = 0;
      al[var11] = var0;
      at[var11++] = var1;
      int[][] var13 = var4.bj;

      while(true) {
         label336:
         while(true) {
            int var14;
            int var15;
            int var16;
            int var17;
            do {
               do {
                  do {
                     label313:
                     do {
                        if (var11 == var12) {
                           am.au = var5 * -617213805;
                           pg.ab = 1169106949 * var6;
                           return false;
                        }

                        var5 = al[var12];
                        var6 = at[var12];
                        var12 = var12 + 1 & 4095;
                        var7 = var5 - var9;
                        var8 = var6 - var10;
                        var14 = var5 - 1724654229 * var4.bz;
                        var15 = var6 - var4.bm * -216630539;
                        if (var3.af(var2, var5, var6, var4, 425232373)) {
                           am.au = var5 * -617213805;
                           pg.ab = 1169106949 * var6;
                           return true;
                        }

                        var16 = 1 + ac[var7][var8];
                        if (var7 > 0 && 0 == aw[var7 - 1][var8] && 0 == (var13[var14 - 1][var15] & 19136782) && 0 == (var13[var14 - 1][var15 + var2 - 1] & 19136824)) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2 - 1) {
                                 al[var11] = var5 - 1;
                                 at[var11] = var6;
                                 var11 = var11 + 1 & 4095;
                                 aw[var7 - 1][var8] = 2;
                                 ac[var7 - 1][var8] = var16;
                                 break;
                              }

                              if (0 != (var13[var14 - 1][var17 + var15] & 19136830)) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var7 < 128 - var2 && 0 == aw[1 + var7][var8] && (var13[var14 + var2][var15] & 19136899) == 0 && 0 == (var13[var2 + var14][var2 + var15 - 1] & 19136992)) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2 - 1) {
                                 al[var11] = 1 + var5;
                                 at[var11] = var6;
                                 var11 = var11 + 1 & 4095;
                                 aw[1 + var7][var8] = 8;
                                 ac[1 + var7][var8] = var16;
                                 break;
                              }

                              if ((var13[var2 + var14][var17 + var15] & 19136995) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var8 > 0 && aw[var7][var8 - 1] == 0 && 0 == (var13[var14][var15 - 1] & 19136782) && 0 == (var13[var2 + var14 - 1][var15 - 1] & 19136899)) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2 - 1) {
                                 al[var11] = var5;
                                 at[var11] = var6 - 1;
                                 var11 = var11 + 1 & 4095;
                                 aw[var7][var8 - 1] = 1;
                                 ac[var7][var8 - 1] = var16;
                                 break;
                              }

                              if (0 != (var13[var14 + var17][var15 - 1] & 19136911)) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var8 < 128 - var2 && aw[var7][var8 + 1] == 0 && (var13[var14][var15 + var2] & 19136824) == 0 && (var13[var2 + var14 - 1][var2 + var15] & 19136992) == 0) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2 - 1) {
                                 al[var11] = var5;
                                 at[var11] = 1 + var6;
                                 var11 = 1 + var11 & 4095;
                                 aw[var7][var8 + 1] = 4;
                                 ac[var7][var8 + 1] = var16;
                                 break;
                              }

                              if ((var13[var17 + var14][var2 + var15] & 19137016) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var7 > 0 && var8 > 0 && aw[var7 - 1][var8 - 1] == 0 && 0 == (var13[var14 - 1][var15 - 1] & 19136782)) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2) {
                                 al[var11] = var5 - 1;
                                 at[var11] = var6 - 1;
                                 var11 = var11 + 1 & 4095;
                                 aw[var7 - 1][var8 - 1] = 3;
                                 ac[var7 - 1][var8 - 1] = var16;
                                 break;
                              }

                              if (0 != (var13[var14 - 1][var15 - 1 + var17] & 19136830) || 0 != (var13[var17 + (var14 - 1)][var15 - 1] & 19136911)) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var7 < 128 - var2 && var8 > 0 && 0 == aw[var7 + 1][var8 - 1] && (var13[var2 + var14][var15 - 1] & 19136899) == 0) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2) {
                                 al[var11] = 1 + var5;
                                 at[var11] = var6 - 1;
                                 var11 = 1 + var11 & 4095;
                                 aw[1 + var7][var8 - 1] = 9;
                                 ac[var7 + 1][var8 - 1] = var16;
                                 break;
                              }

                              if ((var13[var14 + var2][var17 + (var15 - 1)] & 19136995) != 0 || (var13[var17 + var14][var15 - 1] & 19136911) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var7 > 0 && var8 < 128 - var2 && 0 == aw[var7 - 1][var8 + 1] && 0 == (var13[var14 - 1][var15 + var2] & 19136824)) {
                           for(var17 = 1; var17 < var2; ++var17) {
                              if ((var13[var14 - 1][var17 + var15] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var2 + var15] & 19137016) != 0) {
                                 continue label313;
                              }
                           }

                           al[var11] = var5 - 1;
                           at[var11] = 1 + var6;
                           var11 = 1 + var11 & 4095;
                           aw[var7 - 1][1 + var8] = 6;
                           ac[var7 - 1][1 + var8] = var16;
                        }
                     } while(var7 >= 128 - var2);
                  } while(var8 >= 128 - var2);
               } while(aw[var7 + 1][var8 + 1] != 0);
            } while(0 != (var13[var14 + var2][var2 + var15] & 19136992));

            for(var17 = 1; var17 < var2; ++var17) {
               if ((var13[var14 + var17][var15 + var2] & 19137016) != 0 || (var13[var14 + var2][var15 + var17] & 19136995) != 0) {
                  continue label336;
               }
            }

            al[var11] = 1 + var5;
            at[var11] = 1 + var6;
            var11 = 1 + var11 & 4095;
            aw[1 + var7][1 + var8] = 12;
            ac[1 + var7][var8 + 1] = var16;
         }
      }
   }

   static final boolean ao(int var0, int var1, int var2, ia var3, if var4) {
      int var5 = var0;
      int var6 = var1;
      int var7 = -380966965;
      int var8 = -1690056494;
      int var9 = var0 - var7;
      int var10 = var1 - var8;
      aw[var7][var8] = 1297335204;
      ac[var7][var8] = 0;
      int var11 = 0;
      int var12 = 0;
      al[var11] = var0;
      at[var11++] = var1;
      int[][] var13 = var4.bj;

      while(true) {
         label338:
         while(true) {
            int var14;
            int var15;
            int var16;
            int var17;
            do {
               do {
                  do {
                     label315:
                     do {
                        if (var11 == var12) {
                           am.au = var5 * 355404266;
                           pg.ab = 1169106949 * var6;
                           return false;
                        }

                        var5 = al[var12];
                        var6 = at[var12];
                        var12 = var12 + 1 & 4095;
                        var7 = var5 - var9;
                        var8 = var6 - var10;
                        var14 = var5 - -1374545620 * var4.bz;
                        var15 = var6 - var4.bm * -216630539;
                        if (var3.af(var2, var5, var6, var4, 1897438850)) {
                           am.au = var5 * -245843060;
                           pg.ab = -1299458775 * var6;
                           return true;
                        }

                        var16 = 1 + ac[var7][var8];
                        if (var7 > 0 && 0 == aw[var7 - 1][var8] && 0 == (var13[var14 - 1][var15] & -643228463) && 0 == (var13[var14 - 1][var15 + var2 - 1] & 19136824)) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2 - 1) {
                                 al[var11] = var5 - 1;
                                 at[var11] = var6;
                                 var11 = var11 + 1 & 4095;
                                 aw[var7 - 1][var8] = 2;
                                 ac[var7 - 1][var8] = var16;
                                 break;
                              }

                              if (0 != (var13[var14 - 1][var17 + var15] & -375330677)) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var7 < 1213034721 - var2 && 0 == aw[1 + var7][var8] && (var13[var14 + var2][var15] & 19136899) == 0 && 0 == (var13[var2 + var14][var2 + var15 - 1] & 19136992)) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2 - 1) {
                                 al[var11] = 1 + var5;
                                 at[var11] = var6;
                                 var11 = var11 + 1 & 703509066;
                                 aw[1 + var7][var8] = 8;
                                 ac[1 + var7][var8] = var16;
                                 break;
                              }

                              if ((var13[var2 + var14][var17 + var15] & 1325068374) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var8 > 0 && aw[var7][var8 - 1] == 0 && 0 == (var13[var14][var15 - 1] & 19136782) && 0 == (var13[var2 + var14 - 1][var15 - 1] & 1097444830)) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2 - 1) {
                                 al[var11] = var5;
                                 at[var11] = var6 - 1;
                                 var11 = var11 + 1 & -1880335647;
                                 aw[var7][var8 - 1] = 1;
                                 ac[var7][var8 - 1] = var16;
                                 break;
                              }

                              if (0 != (var13[var14 + var17][var15 - 1] & 19136911)) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var8 < 128 - var2 && aw[var7][var8 + 1] == 0 && (var13[var14][var15 + var2] & 19136824) == 0 && (var13[var2 + var14 - 1][var2 + var15] & 14380914) == 0) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2 - 1) {
                                 al[var11] = var5;
                                 at[var11] = 1 + var6;
                                 var11 = 1 + var11 & -1008080318;
                                 aw[var7][var8 + 1] = 4;
                                 ac[var7][var8 + 1] = var16;
                                 break;
                              }

                              if ((var13[var17 + var14][var2 + var15] & 19137016) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var7 > 0 && var8 > 0 && aw[var7 - 1][var8 - 1] == 0 && 0 == (var13[var14 - 1][var15 - 1] & 19136782)) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2) {
                                 al[var11] = var5 - 1;
                                 at[var11] = var6 - 1;
                                 var11 = var11 + 1 & 4095;
                                 aw[var7 - 1][var8 - 1] = 3;
                                 ac[var7 - 1][var8 - 1] = var16;
                                 break;
                              }

                              if (0 != (var13[var14 - 1][var15 - 1 + var17] & 1181000841) || 0 != (var13[var17 + (var14 - 1)][var15 - 1] & 782949219)) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var7 < 710006319 - var2 && var8 > 0 && 0 == aw[var7 + 1][var8 - 1] && (var13[var2 + var14][var15 - 1] & 19136899) == 0) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2) {
                                 al[var11] = 1 + var5;
                                 at[var11] = var6 - 1;
                                 var11 = 1 + var11 & 4095;
                                 aw[1 + var7][var8 - 1] = 9;
                                 ac[var7 + 1][var8 - 1] = var16;
                                 break;
                              }

                              if ((var13[var14 + var2][var17 + (var15 - 1)] & 19136995) != 0 || (var13[var17 + var14][var15 - 1] & 19136911) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var7 > 0 && var8 < 1117065508 - var2 && 0 == aw[var7 - 1][var8 + 1] && 0 == (var13[var14 - 1][var15 + var2] & 19136824)) {
                           for(var17 = 1; var17 < var2; ++var17) {
                              if ((var13[var14 - 1][var17 + var15] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var2 + var15] & -458773260) != 0) {
                                 continue label315;
                              }
                           }

                           al[var11] = var5 - 1;
                           at[var11] = 1 + var6;
                           var11 = 1 + var11 & 852762596;
                           aw[var7 - 1][1 + var8] = 6;
                           ac[var7 - 1][1 + var8] = var16;
                        }
                     } while(var7 >= 128 - var2);
                  } while(var8 >= 128 - var2);
               } while(aw[var7 + 1][var8 + 1] != 0);
            } while(0 != (var13[var14 + var2][var2 + var15] & 19136992));

            for(var17 = 1; var17 < var2; ++var17) {
               if ((var13[var14 + var17][var15 + var2] & 19137016) != 0 || (var13[var14 + var2][var15 + var17] & 542195095) != 0) {
                  continue label338;
               }
            }

            al[var11] = 1 + var5;
            at[var11] = 1 + var6;
            var11 = 1 + var11 & -1875899044;
            aw[1 + var7][1 + var8] = 12;
            ac[1 + var7][var8 + 1] = var16;
         }
      }
   }

   static final boolean ax(int var0, int var1, int var2, ia var3, if var4) {
      int var5 = var0;
      int var6 = var1;
      int var7 = 64;
      int var8 = 64;
      int var9 = var0 - var7;
      int var10 = var1 - var8;
      aw[var7][var8] = 1564620408;
      ac[var7][var8] = 0;
      int var11 = 0;
      int var12 = 0;
      al[var11] = var0;
      at[var11++] = var1;
      int[][] var13 = var4.bj;

      while(true) {
         label342:
         while(true) {
            int var14;
            int var15;
            int var16;
            int var17;
            do {
               do {
                  do {
                     label319:
                     do {
                        if (var11 == var12) {
                           am.au = var5 * -617213805;
                           pg.ab = 837185731 * var6;
                           return false;
                        }

                        var5 = al[var12];
                        var6 = at[var12];
                        var12 = var12 + 1 & -1102583408;
                        var7 = var5 - var9;
                        var8 = var6 - var10;
                        var14 = var5 - -74963776 * var4.bz;
                        var15 = var6 - var4.bm * 69036928;
                        if (var3.af(var2, var5, var6, var4, 1527394550)) {
                           am.au = var5 * -1427301608;
                           pg.ab = 1169106949 * var6;
                           return true;
                        }

                        var16 = 1 + ac[var7][var8];
                        if (var7 > 0 && 0 == aw[var7 - 1][var8] && 0 == (var13[var14 - 1][var15] & 1934022047) && 0 == (var13[var14 - 1][var15 + var2 - 1] & -2009461850)) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2 - 1) {
                                 al[var11] = var5 - 1;
                                 at[var11] = var6;
                                 var11 = var11 + 1 & 4095;
                                 aw[var7 - 1][var8] = 2;
                                 ac[var7 - 1][var8] = var16;
                                 break;
                              }

                              if (0 != (var13[var14 - 1][var17 + var15] & -270942875)) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var7 < 1679690299 - var2 && 0 == aw[1 + var7][var8] && (var13[var14 + var2][var15] & 1037756648) == 0 && 0 == (var13[var2 + var14][var2 + var15 - 1] & 1632078681)) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2 - 1) {
                                 al[var11] = 1 + var5;
                                 at[var11] = var6;
                                 var11 = var11 + 1 & 4095;
                                 aw[1 + var7][var8] = 8;
                                 ac[1 + var7][var8] = var16;
                                 break;
                              }

                              if ((var13[var2 + var14][var17 + var15] & 19136995) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var8 > 0 && aw[var7][var8 - 1] == 0 && 0 == (var13[var14][var15 - 1] & -1007555439) && 0 == (var13[var2 + var14 - 1][var15 - 1] & 19136899)) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2 - 1) {
                                 al[var11] = var5;
                                 at[var11] = var6 - 1;
                                 var11 = var11 + 1 & 1323914114;
                                 aw[var7][var8 - 1] = 1;
                                 ac[var7][var8 - 1] = var16;
                                 break;
                              }

                              if (0 != (var13[var14 + var17][var15 - 1] & 19136911)) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var8 < 128 - var2 && aw[var7][var8 + 1] == 0 && (var13[var14][var15 + var2] & 19136824) == 0 && (var13[var2 + var14 - 1][var2 + var15] & 1172448020) == 0) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2 - 1) {
                                 al[var11] = var5;
                                 at[var11] = 1 + var6;
                                 var11 = 1 + var11 & -1552231449;
                                 aw[var7][var8 + 1] = 4;
                                 ac[var7][var8 + 1] = var16;
                                 break;
                              }

                              if ((var13[var17 + var14][var2 + var15] & 19137016) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var7 > 0 && var8 > 0 && aw[var7 - 1][var8 - 1] == 0 && 0 == (var13[var14 - 1][var15 - 1] & 19136782)) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2) {
                                 al[var11] = var5 - 1;
                                 at[var11] = var6 - 1;
                                 var11 = var11 + 1 & 4095;
                                 aw[var7 - 1][var8 - 1] = 3;
                                 ac[var7 - 1][var8 - 1] = var16;
                                 break;
                              }

                              if (0 != (var13[var14 - 1][var15 - 1 + var17] & -544360967) || 0 != (var13[var17 + (var14 - 1)][var15 - 1] & -2022305308)) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var7 < -1481236675 - var2 && var8 > 0 && 0 == aw[var7 + 1][var8 - 1] && (var13[var2 + var14][var15 - 1] & -1445031725) == 0) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2) {
                                 al[var11] = 1 + var5;
                                 at[var11] = var6 - 1;
                                 var11 = 1 + var11 & 4095;
                                 aw[1 + var7][var8 - 1] = 9;
                                 ac[var7 + 1][var8 - 1] = var16;
                                 break;
                              }

                              if ((var13[var14 + var2][var17 + (var15 - 1)] & -781071541) != 0 || (var13[var17 + var14][var15 - 1] & 19136911) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var7 > 0 && var8 < 128 - var2 && 0 == aw[var7 - 1][var8 + 1] && 0 == (var13[var14 - 1][var15 + var2] & 1542884084)) {
                           for(var17 = 1; var17 < var2; ++var17) {
                              if ((var13[var14 - 1][var17 + var15] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var2 + var15] & 19137016) != 0) {
                                 continue label319;
                              }
                           }

                           al[var11] = var5 - 1;
                           at[var11] = 1 + var6;
                           var11 = 1 + var11 & 4095;
                           aw[var7 - 1][1 + var8] = 6;
                           ac[var7 - 1][1 + var8] = var16;
                        }
                     } while(var7 >= 128 - var2);
                  } while(var8 >= -598694946 - var2);
               } while(aw[var7 + 1][var8 + 1] != 0);
            } while(0 != (var13[var14 + var2][var2 + var15] & 19136992));

            for(var17 = 1; var17 < var2; ++var17) {
               if ((var13[var14 + var17][var15 + var2] & 19137016) != 0 || (var13[var14 + var2][var15 + var17] & 260512157) != 0) {
                  continue label342;
               }
            }

            al[var11] = 1 + var5;
            at[var11] = 1 + var6;
            var11 = 1 + var11 & 4095;
            aw[1 + var7][1 + var8] = 12;
            ac[1 + var7][var8 + 1] = var16;
         }
      }
   }

   iw() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "iw.<init>(" + ')');
      }
   }

   static final boolean at(int var0, int var1, ia var2, if var3) {
      int var4 = var0;
      int var5 = var1;
      int var6 = 64;
      int var7 = 64;
      int var8 = var0 - var6;
      int var9 = var1 - var7;
      aw[var6][var7] = 99;
      ac[var6][var7] = 0;
      int var10 = 0;
      int var11 = 0;
      al[var10] = var0;
      at[var10++] = var1;
      int[][] var12 = var3.bj;

      while(var11 != var10) {
         var4 = al[var11];
         var5 = at[var11];
         var11 = var11 + 1 & 4095;
         var6 = var4 - var8;
         var7 = var5 - var9;
         int var13 = var4 - var3.bz * 1724654229;
         int var14 = var5 - -216630539 * var3.bm;
         if (var2.af(1, var4, var5, var3, 2129275783)) {
            am.au = var4 * -617213805;
            pg.ab = 1169106949 * var5;
            return true;
         }

         int var15 = 1 + ac[var6][var7];
         if (var6 > 0 && aw[var6 - 1][var7] == 0 && 0 == (var12[var13 - 1][var14] & 19136776)) {
            al[var10] = var4 - 1;
            at[var10] = var5;
            var10 = 1 + var10 & 4095;
            aw[var6 - 1][var7] = 2;
            ac[var6 - 1][var7] = var15;
         }

         if (var6 < 127 && 0 == aw[1 + var6][var7] && 0 == (var12[1 + var13][var14] & 19136896)) {
            al[var10] = var4 + 1;
            at[var10] = var5;
            var10 = 1 + var10 & 4095;
            aw[1 + var6][var7] = 8;
            ac[var6 + 1][var7] = var15;
         }

         if (var7 > 0 && aw[var6][var7 - 1] == 0 && 0 == (var12[var13][var14 - 1] & 19136770)) {
            al[var10] = var4;
            at[var10] = var5 - 1;
            var10 = var10 + 1 & 4095;
            aw[var6][var7 - 1] = 1;
            ac[var6][var7 - 1] = var15;
         }

         if (var7 < 127 && 0 == aw[var6][1 + var7] && 0 == (var12[var13][var14 + 1] & 19136800)) {
            al[var10] = var4;
            at[var10] = var5 + 1;
            var10 = 1 + var10 & 4095;
            aw[var6][1 + var7] = 4;
            ac[var6][1 + var7] = var15;
         }

         if (var6 > 0 && var7 > 0 && 0 == aw[var6 - 1][var7 - 1] && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
            al[var10] = var4 - 1;
            at[var10] = var5 - 1;
            var10 = var10 + 1 & 4095;
            aw[var6 - 1][var7 - 1] = 3;
            ac[var6 - 1][var7 - 1] = var15;
         }

         if (var6 < 127 && var7 > 0 && aw[1 + var6][var7 - 1] == 0 && 0 == (var12[var13 + 1][var14 - 1] & 19136899) && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
            al[var10] = 1 + var4;
            at[var10] = var5 - 1;
            var10 = 1 + var10 & 4095;
            aw[1 + var6][var7 - 1] = 9;
            ac[1 + var6][var7 - 1] = var15;
         }

         if (var6 > 0 && var7 < 127 && 0 == aw[var6 - 1][1 + var7] && (var12[var13 - 1][var14 + 1] & 19136824) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
            al[var10] = var4 - 1;
            at[var10] = 1 + var5;
            var10 = var10 + 1 & 4095;
            aw[var6 - 1][var7 + 1] = 6;
            ac[var6 - 1][1 + var7] = var15;
         }

         if (var6 < 127 && var7 < 127 && aw[var6 + 1][var7 + 1] == 0 && 0 == (var12[var13 + 1][var14 + 1] & 19136992) && (var12[1 + var13][var14] & 19136896) == 0 && 0 == (var12[var13][var14 + 1] & 19136800)) {
            al[var10] = 1 + var4;
            at[var10] = var5 + 1;
            var10 = 1 + var10 & 4095;
            aw[var6 + 1][1 + var7] = 12;
            ac[var6 + 1][1 + var7] = var15;
         }
      }

      am.au = -617213805 * var4;
      pg.ab = var5 * 1169106949;
      return false;
   }
}
