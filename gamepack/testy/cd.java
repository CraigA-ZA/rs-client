import accessors.RSTiles;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class cd implements RSTiles {
   static byte[][][] al;
   static final int[] am = new int[]{1, 2, 4, 8};
   static int[][] at;
   static short[][][] au;
   static int aw = -256673141;
   static byte[][][] aq;
   static final int av = 1170;
   static int[][][] af = new int[4][105][105];
   static int[] ay;
   static final int[] ak = new int[]{0, -1, 0, 1};
   static final int ar = 2340;
   static byte[][][] an = new byte[4][104][104];
   static final int[] as = new int[]{16, 32, 64, 128};
   static final int[] aj = new int[]{1, 0, -1, 0};
   static byte[][][] ab;
   static final int[] az = new int[]{1, -1, -1, 1};
   static final int[] ad = new int[]{-1, -1, 1, 1};
   static int ae = ((int)(Math.random() * 17.0) - 8) * 1514061769;
   static int ap = ((int)(Math.random() * 33.0) - 16) * 1193325609;
   public static final String kl = "Date not valid.";

   static final void bb(byte[] var0, int var1, int var2, int var3, int var4, if[] var5) {
      int var7;
      int var8;
      for(int var6 = 0; var6 < 4; ++var6) {
         for(var7 = 0; var7 < 64; ++var7) {
            for(var8 = 0; var8 < -1639355144; ++var8) {
               if (var1 + var7 > 0 && var1 + var7 < 103 && var8 + var2 > 0 && var8 + var2 < 103) {
                  int[] var10000 = var5[var6].bj[var1 + var7];
                  var10000[var2 + var8] &= 1179721669;
               }
            }
         }
      }

      sg var12 = new sg(var0);

      for(var7 = 0; var7 < 4; ++var7) {
         for(var8 = 0; var8 < 2089286541; ++var8) {
            for(int var9 = 0; var9 < -556902433; ++var9) {
               int var10 = var1 + var8;
               int var11 = var2 + var9;
               of.aq(var12, var7, var10, var11, var3 + var10, var4 + var11, 0, (byte)-18);
            }
         }
      }

   }

   static final void aa(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, ie var8, if[] var9) {
      sg var10 = new sg(var0);
      int var11 = -1;

      while(true) {
         int var12 = var10.dw((byte)-110);
         if (var12 == 0) {
            return;
         }

         var11 += var12;
         int var13 = 0;

         while(true) {
            int var14 = var10.cd(-880220130);
            if (var14 == 0) {
               break;
            }

            var13 += var14 - 1;
            int var15 = var13 & 63;
            int var16 = var13 >> 6 & 63;
            int var17 = var13 >> 12;
            int var18 = var10.cm((byte)7);
            int var19 = var18 >> 2;
            int var20 = var18 & 3;
            if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
               hq var21 = fw.an(var11, (short)28406);
               int var24 = var16 & 7;
               int var25 = var15 & 7;
               int var27 = -1339930361 * var21.av;
               int var28 = -1659393955 * var21.ar;
               int var29;
               if (1 == (var20 & 1)) {
                  var29 = var27;
                  var27 = var28;
                  var28 = var29;
               }

               int var26 = var7 & 3;
               int var23;
               if (var26 == 0) {
                  var23 = var24;
               } else if (var26 == 1) {
                  var23 = var25;
               } else if (2 == var26) {
                  var23 = 7 - var24 - (var27 - 1);
               } else {
                  var23 = 7 - var25 - (var28 - 1);
               }

               var29 = var2 + var23;
               int var32 = var16 & 7;
               int var33 = var15 & 7;
               int var35 = -1339930361 * var21.av;
               int var36 = -1659393955 * var21.ar;
               int var37;
               if (1 == (var20 & 1)) {
                  var37 = var35;
                  var35 = var36;
                  var36 = var37;
               }

               int var34 = var7 & 3;
               int var31;
               if (var34 == 0) {
                  var31 = var33;
               } else if (var34 == 1) {
                  var31 = 7 - var32 - (var35 - 1);
               } else if (2 == var34) {
                  var31 = 7 - var33 - (var36 - 1);
               } else {
                  var31 = var32;
               }

               var37 = var3 + var31;
               if (var29 > 0 && var37 > 0 && var29 < 103 && var37 < 103) {
                  int var38 = var1;
                  if (2 == (an[1][var29][var37] & 2)) {
                     var38 = var1 - 1;
                  }

                  if var39 = null;
                  if (var38 >= 0) {
                     var39 = var9[var38];
                  }

                  hy.ay(var1, var29, var37, var11, var20 + var7 & 3, var19, var8, var39, -574590608);
               }
            }
         }
      }
   }

   static void az() {
      aw = -256673141;
      hu.ac = new short[4][104][104];
      au = new short[4][104][104];
      ab = new byte[4][104][104];
      aq = new byte[4][104][104];
      ge.ag = new int[4][105][105];
      al = new byte[4][105][105];
      at = new int[105][105];
      gm.aa = new int[104];
      ay = new int[104];
      kn.ao = new int[104];
      ej.ax = new int[104];
      bx.ai = new int[104];
   }

   static int bw(int var0, int var1, int var2) {
      if ((an[var0][var1][var2] & 8) != 0) {
         return 0;
      } else {
         return var0 > 0 && 0 != (an[1][var1][var2] & 2) ? var0 - 1 : var0;
      }
   }

   static void ae() {
      hu.ac = (short[][][])null;
      au = (short[][][])null;
      ab = (byte[][][])null;
      aq = (byte[][][])null;
      ge.ag = (int[][][])null;
      al = (byte[][][])null;
      at = (int[][])null;
      gm.aa = null;
      ay = null;
      kn.ao = null;
      ej.ax = null;
      bx.ai = null;
   }

   static final int cl(int var0, int var1) {
      if (var0 == -1) {
         return 1084751990;
      } else {
         var1 = (var0 & -738138245) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   static final void by(int var0, int var1, int var2, int var3) {
      for(int var4 = var1; var4 <= var1 + var3; ++var4) {
         for(int var5 = var0; var5 <= var2 + var0; ++var5) {
            if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
               al[0][var5][var4] = 127;
               if (var5 == var0 && var5 > 0) {
                  af[0][var5][var4] = af[0][var5 - 1][var4];
               }

               if (var0 + var2 == var5 && var5 < 103) {
                  af[0][var5][var4] = af[0][var5 + 1][var4];
               }

               if (var4 == var1 && var4 > 0) {
                  af[0][var5][var4] = af[0][var5][var4 - 1];
               }

               if (var4 == var1 + var3 && var4 < 103) {
                  af[0][var5][var4] = af[0][var5][1 + var4];
               }
            }
         }
      }

   }

   static final boolean cw(int var0, int var1) {
      hq var2 = fw.an(var0, (short)17249);
      if (11 == var1) {
         var1 = 10;
      }

      if (var1 >= 5 && var1 <= 8) {
         var1 = 4;
      }

      return var2.ab(var1, -1775888671);
   }

   static final void bi(byte[] var0, int var1, int var2, int var3, int var4, if[] var5) {
      int var7;
      int var8;
      for(int var6 = 0; var6 < 4; ++var6) {
         for(var7 = 0; var7 < -794122473; ++var7) {
            for(var8 = 0; var8 < 64; ++var8) {
               if (var1 + var7 > 0 && var1 + var7 < 103 && var8 + var2 > 0 && var8 + var2 < 103) {
                  int[] var10000 = var5[var6].bj[var1 + var7];
                  var10000[var2 + var8] &= -1917044179;
               }
            }
         }
      }

      sg var12 = new sg(var0);

      for(var7 = 0; var7 < 4; ++var7) {
         for(var8 = 0; var8 < 1465252457; ++var8) {
            for(int var9 = 0; var9 < 1066537347; ++var9) {
               int var10 = var1 + var8;
               int var11 = var2 + var9;
               of.aq(var12, var7, var10, var11, var3 + var10, var4 + var11, 0, (byte)11);
            }
         }
      }

   }

   static final void be(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, if[] var10) {
      int var12;
      for(int var11 = 0; var11 < 8; ++var11) {
         for(var12 = 0; var12 < 8; ++var12) {
            if (var2 + var11 > 0 && var11 + var2 < 103 && var3 + var12 > 0 && var3 + var12 < 103) {
               int[] var10000 = var10[var1].bj[var11 + var2];
               var10000[var12 + var3] &= -16777217;
            }
         }
      }

      sg var24 = new sg(var0);

      for(var12 = 0; var12 < 4; ++var12) {
         for(int var13 = 0; var13 < 64; ++var13) {
            for(int var14 = 0; var14 < 64; ++var14) {
               if (var4 == var12 && var13 >= var5 && var13 < 8 + var5 && var14 >= var6 && var14 < var6 + 8) {
                  int var15 = var2 + ll.af(var13 & 7, var14 & 7, var7, 575322475);
                  int var18 = var13 & 7;
                  int var19 = var14 & 7;
                  int var20 = var7 & 3;
                  int var17;
                  if (0 == var20) {
                     var17 = var19;
                  } else if (var20 == 1) {
                     var17 = 7 - var18;
                  } else if (2 == var20) {
                     var17 = 7 - var19;
                  } else {
                     var17 = var18;
                  }

                  int var21 = var3 + var17;
                  int var22 = (var13 & 7) + var8 + var2;
                  int var23 = (var14 & 7) + var9 + var3;
                  of.aq(var24, var1, var15, var21, var22, var23, var7, (byte)-64);
               } else {
                  of.aq(var24, 0, -1, -1, 0, 0, 0, (byte)-24);
               }
            }
         }
      }

   }

   static final void bx(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, if[] var10) {
      int var12;
      for(int var11 = 0; var11 < 8; ++var11) {
         for(var12 = 0; var12 < 8; ++var12) {
            if (var2 + var11 > 0 && var11 + var2 < 103 && var3 + var12 > 0 && var3 + var12 < 103) {
               int[] var10000 = var10[var1].bj[var11 + var2];
               var10000[var12 + var3] &= 452724615;
            }
         }
      }

      sg var24 = new sg(var0);

      for(var12 = 0; var12 < 4; ++var12) {
         for(int var13 = 0; var13 < 64; ++var13) {
            for(int var14 = 0; var14 < 64; ++var14) {
               if (var4 == var12 && var13 >= var5 && var13 < 8 + var5 && var14 >= var6 && var14 < var6 + 8) {
                  int var15 = var2 + ll.af(var13 & 7, var14 & 7, var7, 575322475);
                  int var18 = var13 & 7;
                  int var19 = var14 & 7;
                  int var20 = var7 & 3;
                  int var17;
                  if (0 == var20) {
                     var17 = var19;
                  } else if (var20 == 1) {
                     var17 = 7 - var18;
                  } else if (2 == var20) {
                     var17 = 7 - var19;
                  } else {
                     var17 = var18;
                  }

                  int var21 = var3 + var17;
                  int var22 = (var13 & 7) + var8 + var2;
                  int var23 = (var14 & 7) + var9 + var3;
                  of.aq(var24, var1, var15, var21, var22, var23, var7, (byte)-46);
               } else {
                  of.aq(var24, 0, -1, -1, 0, 0, 0, (byte)23);
               }
            }
         }
      }

   }

   cd() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "cd.<init>(" + ')');
      }
   }

   static final void bo(int var0, int var1, int var2) {
      int var3;
      for(var3 = 0; var3 < 8; ++var3) {
         for(int var4 = 0; var4 < 8; ++var4) {
            af[var0][var1 + var3][var2 + var4] = 0;
         }
      }

      if (var1 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            af[var0][var1][var2 + var3] = af[var0][var1 - 1][var2 + var3];
         }
      }

      if (var2 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            af[var0][var1 + var3][var2] = af[var0][var1 + var3][var2 - 1];
         }
      }

      if (var1 > 0 && af[var0][var1 - 1][var2] != 0) {
         af[var0][var1][var2] = af[var0][var1 - 1][var2];
      } else if (var2 > 0 && af[var0][var1][var2 - 1] != 0) {
         af[var0][var1][var2] = af[var0][var1][var2 - 1];
      } else if (var1 > 0 && var2 > 0 && af[var0][var1 - 1][var2 - 1] != 0) {
         af[var0][var1][var2] = af[var0][var1 - 1][var2 - 1];
      }

   }

   static final void ap(int var0, int var1, int var2, int var3) {
      for(int var4 = var1; var4 <= var1 + var3; ++var4) {
         for(int var5 = var0; var5 <= var2 + var0; ++var5) {
            if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
               al[0][var5][var4] = 127;
               if (var5 == var0 && var5 > 0) {
                  af[0][var5][var4] = af[0][var5 - 1][var4];
               }

               if (var0 + var2 == var5 && var5 < 103) {
                  af[0][var5][var4] = af[0][var5 + 1][var4];
               }

               if (var4 == var1 && var4 > 0) {
                  af[0][var5][var4] = af[0][var5][var4 - 1];
               }

               if (var4 == var1 + var3 && var4 < 103) {
                  af[0][var5][var4] = af[0][var5][1 + var4];
               }
            }
         }
      }

   }

   static final void bm(int var0, int var1, int var2) {
      int var3;
      for(var3 = 0; var3 < 8; ++var3) {
         for(int var4 = 0; var4 < 8; ++var4) {
            af[var0][var1 + var3][var2 + var4] = 0;
         }
      }

      if (var1 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            af[var0][var1][var2 + var3] = af[var0][var1 - 1][var2 + var3];
         }
      }

      if (var2 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            af[var0][var1 + var3][var2] = af[var0][var1 + var3][var2 - 1];
         }
      }

      if (var1 > 0 && af[var0][var1 - 1][var2] != 0) {
         af[var0][var1][var2] = af[var0][var1 - 1][var2];
      } else if (var2 > 0 && af[var0][var1][var2 - 1] != 0) {
         af[var0][var1][var2] = af[var0][var1][var2 - 1];
      } else if (var1 > 0 && var2 > 0 && af[var0][var1 - 1][var2 - 1] != 0) {
         af[var0][var1][var2] = af[var0][var1 - 1][var2 - 1];
      }

   }

   static final void bd(sg var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = var1 >= 0 && var1 < 4 && var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104;
      int var8;
      if (var7) {
         an[var1][var2][var3] = 0;

         while(true) {
            var8 = var0.cl(-875132070);
            if (0 == var8) {
               if (0 == var1) {
                  int[] var15 = af[0][var2];
                  int var12 = var4 + 932731;
                  int var13 = var5 + 556238;
                  int var14 = dy.ai('넵' + var12, 91923 + var13, 4, (byte)-13) - 128 + (dy.ai(10294 + var12, '鎽' + var13, 2, (byte)-44) - 128 >> 1) + (dy.ai(var12, var13, 1, (byte)-1) - 128 >> 2);
                  var14 = 35 + (int)((double)var14 * 0.3);
                  if (var14 < 10) {
                     var14 = 10;
                  } else if (var14 > 60) {
                     var14 = 60;
                  }

                  var15[var3] = 8 * -var14;
               } else {
                  af[var1][var2][var3] = af[var1 - 1][var2][var3] - 240;
               }
               break;
            }

            if (var8 == 1) {
               int var9 = var0.cm((byte)7);
               if (var9 == 1) {
                  var9 = 0;
               }

               if (0 == var1) {
                  af[0][var2][var3] = 8 * -var9;
               } else {
                  af[var1][var2][var3] = af[var1 - 1][var2][var3] - 8 * var9;
               }
               break;
            }

            if (var8 <= 49) {
               au[var1][var2][var3] = (short)var0.cg((byte)-127);
               ab[var1][var2][var3] = (byte)((var8 - 2) / 4);
               aq[var1][var2][var3] = (byte)(var6 + (var8 - 2) & 3);
            } else if (var8 <= 81) {
               an[var1][var2][var3] = (byte)(var8 - 49);
            } else {
               hu.ac[var1][var2][var3] = (short)(var8 - 81);
            }
         }
      } else {
         while(true) {
            var8 = var0.cl(-2056455188);
            if (0 == var8) {
               break;
            }

            if (1 == var8) {
               var0.cm((byte)7);
               break;
            }

            if (var8 <= 49) {
               var0.cg((byte)-10);
            }
         }
      }

   }

   static final void bu(int var0, int var1, int var2, int var3, int var4, int var5, ie var6, if var7) {
      if (!client.cu || 0 != (an[0][var1][var2] & 2) || (an[var0][var1][var2] & 16) == 0) {
         if (var0 < 1401144457 * aw) {
            aw = -1087180359 * var0;
         }

         hq var8 = fw.an(var3, (short)19820);
         int var9;
         int var10;
         if (var4 != 1 && var4 != 3) {
            var9 = var8.av * -1339930361;
            var10 = -1659393955 * var8.ar;
         } else {
            var9 = -1659393955 * var8.ar;
            var10 = -1339930361 * var8.av;
         }

         int var11;
         int var12;
         if (var1 + var9 <= 104) {
            var11 = var1 + (var9 >> 1);
            var12 = (1 + var9 >> 1) + var1;
         } else {
            var11 = var1;
            var12 = 1 + var1;
         }

         int var13;
         int var14;
         if (var10 + var2 <= 104) {
            var13 = var2 + (var10 >> 1);
            var14 = (1 + var10 >> 1) + var2;
         } else {
            var13 = var2;
            var14 = 1 + var2;
         }

         int[][] var15 = af[var0];
         int var16 = var15[var12][var14] + var15[var11][var14] + var15[var11][var13] + var15[var12][var13] >> 2;
         int var17 = (var9 << 6) + (var1 << 7);
         int var18 = (var2 << 7) + (var10 << 6);
         long var19 = ir.aa(var1, var2, 2, 0 == 415653149 * var8.aj, var3, 1278598650);
         int var21 = var5 + (var4 << 6);
         if (-1850643527 * var8.bg == 1) {
            var21 += 256;
         }

         if (var8.ah(-1944955521)) {
            bm.ac(var0, var1, var2, var8, var4, (byte)-119);
         }

         Object var22;
         if (22 == var5) {
            if (!client.cu || 0 != var8.aj * 415653149 || 1 == var8.am * -973955889 || var8.bs) {
               if (-1 == 1292954189 * var8.ae && null == var8.bu) {
                  var22 = var8.al(22, var4, var15, var17, var16, var18, (byte)-102);
               } else {
                  var22 = new ct(var3, 22, var4, var0, var1, var2, 1292954189 * var8.ae, var8.bh, (iv)null);
               }

               var6.aq(var0, var1, var2, var16, (iv)var22, var19, var21);
               if (var8.am * -973955889 == 1 && var7 != null) {
                  var7.au(var1, var2, 993069783);
               }

            }
         } else {
            int var23;
            if (10 != var5 && var5 != 11) {
               int[] var10000;
               if (var5 >= 12) {
                  if (var8.ae * 1292954189 == -1 && null == var8.bu) {
                     var22 = var8.al(var5, var4, var15, var17, var16, var18, (byte)-92);
                  } else {
                     var22 = new ct(var3, var5, var4, var0, var1, var2, var8.ae * 1292954189, var8.bh, (iv)null);
                  }

                  var6.ay(var0, var1, var2, var16, 1, 1, (iv)var22, 0, var19, var21);
                  if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                     var10000 = ge.ag[var0][var1];
                     var10000[var2] |= 2340;
                  }

                  if (0 != var8.am * -973955889 && null != var7) {
                     var7.aw(var1, var2, var9, var10, var8.as, (byte)-46);
                  }

               } else if (var5 == 0) {
                  if (-1 == var8.ae * 1292954189 && var8.bu == null) {
                     var22 = var8.al(0, var4, var15, var17, var16, var18, (byte)-108);
                  } else {
                     var22 = new ct(var3, 0, var4, var0, var1, var2, 1292954189 * var8.ae, var8.bh, (iv)null);
                  }

                  var6.at(var0, var1, var2, var16, (iv)var22, (iv)null, am[var4], 0, var19, var21);
                  if (0 == var4) {
                     if (var8.bo) {
                        al[var0][var1][var2] = 50;
                        al[var0][var1][var2 + 1] = 50;
                     }

                     if (var8.ad) {
                        var10000 = ge.ag[var0][var1];
                        var10000[var2] |= 585;
                     }
                  } else if (1 == var4) {
                     if (var8.bo) {
                        al[var0][var1][1 + var2] = 50;
                        al[var0][var1 + 1][1 + var2] = 50;
                     }

                     if (var8.ad) {
                        var10000 = ge.ag[var0][var1];
                        var10000[1 + var2] |= 1170;
                     }
                  } else if (2 == var4) {
                     if (var8.bo) {
                        al[var0][1 + var1][var2] = 50;
                        al[var0][1 + var1][1 + var2] = 50;
                     }

                     if (var8.ad) {
                        var10000 = ge.ag[var0][1 + var1];
                        var10000[var2] |= 585;
                     }
                  } else if (3 == var4) {
                     if (var8.bo) {
                        al[var0][var1][var2] = 50;
                        al[var0][var1 + 1][var2] = 50;
                     }

                     if (var8.ad) {
                        var10000 = ge.ag[var0][var1];
                        var10000[var2] |= 1170;
                     }
                  }

                  if (var8.am * -973955889 != 0 && null != var7) {
                     var7.an(var1, var2, var5, var4, var8.as, -2067452311);
                  }

                  if (16 != -89408815 * var8.ap) {
                     var6.av(var0, var1, var2, -89408815 * var8.ap);
                  }

               } else if (var5 == 1) {
                  if (1292954189 * var8.ae == -1 && var8.bu == null) {
                     var22 = var8.al(1, var4, var15, var17, var16, var18, (byte)-106);
                  } else {
                     var22 = new ct(var3, 1, var4, var0, var1, var2, 1292954189 * var8.ae, var8.bh, (iv)null);
                  }

                  var6.at(var0, var1, var2, var16, (iv)var22, (iv)null, as[var4], 0, var19, var21);
                  if (var8.bo) {
                     if (var4 == 0) {
                        al[var0][var1][var2 + 1] = 50;
                     } else if (1 == var4) {
                        al[var0][var1 + 1][1 + var2] = 50;
                     } else if (2 == var4) {
                        al[var0][var1 + 1][var2] = 50;
                     } else if (var4 == 3) {
                        al[var0][var1][var2] = 50;
                     }
                  }

                  if (-973955889 * var8.am != 0 && var7 != null) {
                     var7.an(var1, var2, var5, var4, var8.as, -2067452311);
                  }

               } else {
                  int var28;
                  if (var5 == 2) {
                     var28 = 1 + var4 & 3;
                     Object var30;
                     Object var31;
                     if (1292954189 * var8.ae == -1 && null == var8.bu) {
                        var31 = var8.al(2, var4 + 4, var15, var17, var16, var18, (byte)-78);
                        var30 = var8.al(2, var28, var15, var17, var16, var18, (byte)-52);
                     } else {
                        var31 = new ct(var3, 2, 4 + var4, var0, var1, var2, var8.ae * 1292954189, var8.bh, (iv)null);
                        var30 = new ct(var3, 2, var28, var0, var1, var2, 1292954189 * var8.ae, var8.bh, (iv)null);
                     }

                     var6.at(var0, var1, var2, var16, (iv)var31, (iv)var30, am[var4], am[var28], var19, var21);
                     if (var8.ad) {
                        if (var4 == 0) {
                           var10000 = ge.ag[var0][var1];
                           var10000[var2] |= 585;
                           var10000 = ge.ag[var0][var1];
                           var10000[var2 + 1] |= 1170;
                        } else if (1 == var4) {
                           var10000 = ge.ag[var0][var1];
                           var10000[1 + var2] |= 1170;
                           var10000 = ge.ag[var0][1 + var1];
                           var10000[var2] |= 585;
                        } else if (var4 == 2) {
                           var10000 = ge.ag[var0][var1 + 1];
                           var10000[var2] |= 585;
                           var10000 = ge.ag[var0][var1];
                           var10000[var2] |= 1170;
                        } else if (var4 == 3) {
                           var10000 = ge.ag[var0][var1];
                           var10000[var2] |= 1170;
                           var10000 = ge.ag[var0][var1];
                           var10000[var2] |= 585;
                        }
                     }

                     if (var8.am * -973955889 != 0 && null != var7) {
                        var7.an(var1, var2, var5, var4, var8.as, -2067452311);
                     }

                     if (16 != var8.ap * -89408815) {
                        var6.av(var0, var1, var2, var8.ap * -89408815);
                     }

                  } else if (var5 == 3) {
                     if (-1 == 1292954189 * var8.ae && var8.bu == null) {
                        var22 = var8.al(3, var4, var15, var17, var16, var18, (byte)-100);
                     } else {
                        var22 = new ct(var3, 3, var4, var0, var1, var2, var8.ae * 1292954189, var8.bh, (iv)null);
                     }

                     var6.at(var0, var1, var2, var16, (iv)var22, (iv)null, as[var4], 0, var19, var21);
                     if (var8.bo) {
                        if (0 == var4) {
                           al[var0][var1][1 + var2] = 50;
                        } else if (1 == var4) {
                           al[var0][var1 + 1][var2 + 1] = 50;
                        } else if (2 == var4) {
                           al[var0][var1 + 1][var2] = 50;
                        } else if (var4 == 3) {
                           al[var0][var1][var2] = 50;
                        }
                     }

                     if (0 != var8.am * -973955889 && null != var7) {
                        var7.an(var1, var2, var5, var4, var8.as, -2067452311);
                     }

                  } else if (9 == var5) {
                     if (-1 == var8.ae * 1292954189 && var8.bu == null) {
                        var22 = var8.al(var5, var4, var15, var17, var16, var18, (byte)-19);
                     } else {
                        var22 = new ct(var3, var5, var4, var0, var1, var2, 1292954189 * var8.ae, var8.bh, (iv)null);
                     }

                     var6.ay(var0, var1, var2, var16, 1, 1, (iv)var22, 0, var19, var21);
                     if (var8.am * -973955889 != 0 && var7 != null) {
                        var7.aw(var1, var2, var9, var10, var8.as, (byte)-79);
                     }

                     if (-89408815 * var8.ap != 16) {
                        var6.av(var0, var1, var2, -89408815 * var8.ap);
                     }

                  } else if (var5 == 4) {
                     if (1292954189 * var8.ae == -1 && null == var8.bu) {
                        var22 = var8.al(4, var4, var15, var17, var16, var18, (byte)-101);
                     } else {
                        var22 = new ct(var3, 4, var4, var0, var1, var2, var8.ae * 1292954189, var8.bh, (iv)null);
                     }

                     var6.aa(var0, var1, var2, var16, (iv)var22, (iv)null, am[var4], 0, 0, 0, var19, var21);
                  } else {
                     long var29;
                     Object var32;
                     if (5 == var5) {
                        var28 = 16;
                        var29 = var6.by(var0, var1, var2);
                        if (0L != var29) {
                           var28 = fw.an(di.at(var29), (short)25535).ap * -89408815;
                        }

                        if (var8.ae * 1292954189 == -1 && null == var8.bu) {
                           var32 = var8.al(4, var4, var15, var17, var16, var18, (byte)-47);
                        } else {
                           var32 = new ct(var3, 4, var4, var0, var1, var2, var8.ae * 1292954189, var8.bh, (iv)null);
                        }

                        var6.aa(var0, var1, var2, var16, (iv)var32, (iv)null, am[var4], 0, aj[var4] * var28, var28 * ak[var4], var19, var21);
                     } else if (var5 == 6) {
                        var28 = 8;
                        var29 = var6.by(var0, var1, var2);
                        if (0L != var29) {
                           var28 = fw.an(di.at(var29), (short)577).ap * -89408815 / 2;
                        }

                        if (-1 == 1292954189 * var8.ae && null == var8.bu) {
                           var32 = var8.al(4, 4 + var4, var15, var17, var16, var18, (byte)-4);
                        } else {
                           var32 = new ct(var3, 4, 4 + var4, var0, var1, var2, var8.ae * 1292954189, var8.bh, (iv)null);
                        }

                        var6.aa(var0, var1, var2, var16, (iv)var32, (iv)null, 256, var4, az[var4] * var28, var28 * ad[var4], var19, var21);
                     } else if (var5 == 7) {
                        var23 = 2 + var4 & 3;
                        if (var8.ae * 1292954189 == -1 && var8.bu == null) {
                           var22 = var8.al(4, 4 + var23, var15, var17, var16, var18, (byte)-112);
                        } else {
                           var22 = new ct(var3, 4, var23 + 4, var0, var1, var2, 1292954189 * var8.ae, var8.bh, (iv)null);
                        }

                        var6.aa(var0, var1, var2, var16, (iv)var22, (iv)null, 256, var23, 0, 0, var19, var21);
                     } else if (8 == var5) {
                        var28 = 8;
                        var29 = var6.by(var0, var1, var2);
                        if (0L != var29) {
                           var28 = fw.an(di.at(var29), (short)22870).ap * -89408815 / 2;
                        }

                        int var27 = 2 + var4 & 3;
                        Object var26;
                        if (var8.ae * 1292954189 == -1 && null == var8.bu) {
                           var32 = var8.al(4, var4 + 4, var15, var17, var16, var18, (byte)-83);
                           var26 = var8.al(4, 4 + var27, var15, var17, var16, var18, (byte)-15);
                        } else {
                           var32 = new ct(var3, 4, var4 + 4, var0, var1, var2, 1292954189 * var8.ae, var8.bh, (iv)null);
                           var26 = new ct(var3, 4, var27 + 4, var0, var1, var2, var8.ae * 1292954189, var8.bh, (iv)null);
                        }

                        var6.aa(var0, var1, var2, var16, (iv)var32, (iv)var26, 256, var4, az[var4] * var28, var28 * ad[var4], var19, var21);
                     }
                  }
               }
            } else {
               if (-1 == var8.ae * 1292954189 && var8.bu == null) {
                  var22 = var8.al(10, var4, var15, var17, var16, var18, (byte)-39);
               } else {
                  var22 = new ct(var3, 10, var4, var0, var1, var2, var8.ae * 1292954189, var8.bh, (iv)null);
               }

               if (null != var22 && var6.ay(var0, var1, var2, var16, var9, var10, (iv)var22, 11 == var5 ? 256 : 0, var19, var21) && var8.bo) {
                  var23 = 15;
                  if (var22 instanceof it) {
                     var23 = ((it)var22).ah() / 4;
                     if (var23 > 30) {
                        var23 = 30;
                     }
                  }

                  for(int var24 = 0; var24 <= var9; ++var24) {
                     for(int var25 = 0; var25 <= var10; ++var25) {
                        if (var23 > al[var0][var1 + var24][var2 + var25]) {
                           al[var0][var1 + var24][var25 + var2] = (byte)var23;
                        }
                     }
                  }
               }

               if (0 != var8.am * -973955889 && var7 != null) {
                  var7.aw(var1, var2, var9, var10, var8.as, (byte)-105);
               }

            }
         }
      }
   }

   static final int cy(int var0, int var1) {
      if (-212386821 == var0) {
         return 627458336;
      } else if (-1 == var0) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > -814764422) {
            var1 = -1109069028;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = -1844335637;
         }

         return (var0 & -1449886603) + var1;
      }
   }

   static final boolean bn(byte[] var0, int var1, int var2) {
      boolean var3 = true;
      sg var4 = new sg(var0);
      int var5 = -1;

      label80:
      while(true) {
         int var6 = var4.dw((byte)-40);
         if (0 == var6) {
            return var3;
         }

         var5 += var6;
         int var7 = 0;
         boolean var8 = false;

         while(true) {
            int var9;
            while(!var8) {
               var9 = var4.cd(-990221354);
               if (var9 == 0) {
                  continue label80;
               }

               var7 += var9 - 1;
               int var10 = var7 & 63;
               int var11 = var7 >> 6 & 63;
               int var12 = var4.cm((byte)7) >> 2;
               int var13 = var11 + var1;
               int var14 = var2 + var10;
               if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
                  hq var15 = fw.an(var5, (short)23434);
                  if (var12 != 22 || !client.cu || 0 != var15.aj * 415653149 || -973955889 * var15.am == 1 || var15.bs) {
                     if (!var15.aq(-1541274389)) {
                        client.jk += 1441978033;
                        var3 = false;
                     }

                     var8 = true;
                  }
               }
            }

            var9 = var4.cd(-2123840856);
            if (0 == var9) {
               break;
            }

            var4.cm((byte)7);
         }
      }
   }

   static final boolean bs(byte[] var0, int var1, int var2) {
      boolean var3 = true;
      sg var4 = new sg(var0);
      int var5 = -1;

      label77:
      while(true) {
         int var6 = var4.dw((byte)-11);
         if (0 == var6) {
            return var3;
         }

         var5 += var6;
         int var7 = 0;
         boolean var8 = false;

         while(true) {
            int var9;
            while(!var8) {
               var9 = var4.cd(-1068101804);
               if (var9 == 0) {
                  continue label77;
               }

               var7 += var9 - 1;
               int var10 = var7 & -690513448;
               int var11 = var7 >> 6 & 63;
               int var12 = var4.cm((byte)7) >> 2;
               int var13 = var11 + var1;
               int var14 = var2 + var10;
               if (var13 > 0 && var14 > 0 && var13 < -1738618958 && var14 < -757813750) {
                  hq var15 = fw.an(var5, (short)9922);
                  if (var12 != 22 || !client.cu || 0 != var15.aj * 415653149 || -973955889 * var15.am == 1 || var15.bs) {
                     if (!var15.aq(-1344435480)) {
                        client.jk += -1606078750;
                        var3 = false;
                     }

                     var8 = true;
                  }
               }
            }

            var9 = var4.cd(-936152514);
            if (0 == var9) {
               break;
            }

            var4.cm((byte)7);
         }
      }
   }

   static final void br(byte[] var0, int var1, int var2, ie var3, if[] var4) {
      sg var5 = new sg(var0);
      int var6 = -1;

      while(true) {
         int var7 = var5.dw((byte)-56);
         if (var7 == 0) {
            return;
         }

         var6 += var7;
         int var8 = 0;

         while(true) {
            int var9 = var5.cd(-1915365703);
            if (var9 == 0) {
               break;
            }

            var8 += var9 - 1;
            int var10 = var8 & 63;
            int var11 = var8 >> 6 & 63;
            int var12 = var8 >> 12;
            int var13 = var5.cm((byte)7);
            int var14 = var13 >> 2;
            int var15 = var13 & 3;
            int var16 = var11 + var1;
            int var17 = var10 + var2;
            if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
               int var18 = var12;
               if (2 == (an[1][var16][var17] & 2)) {
                  var18 = var12 - 1;
               }

               if var19 = null;
               if (var18 >= 0) {
                  var19 = var4[var18];
               }

               hy.ay(var12, var16, var17, var6, var15, var14, var3, var19, -1023592493);
            }
         }
      }
   }

   static final boolean bj(byte[] var0, int var1, int var2) {
      boolean var3 = true;
      sg var4 = new sg(var0);
      int var5 = -1;

      label74:
      while(true) {
         int var6 = var4.dw((byte)-20);
         if (0 == var6) {
            return var3;
         }

         var5 += var6;
         int var7 = 0;
         boolean var8 = false;

         while(true) {
            int var9;
            while(!var8) {
               var9 = var4.cd(-1916955617);
               if (var9 == 0) {
                  continue label74;
               }

               var7 += var9 - 1;
               int var10 = var7 & 63;
               int var11 = var7 >> 6 & 63;
               int var12 = var4.cm((byte)7) >> 2;
               int var13 = var11 + var1;
               int var14 = var2 + var10;
               if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
                  hq var15 = fw.an(var5, (short)19667);
                  if (var12 != 22 || !client.cu || 0 != var15.aj * 415653149 || -973955889 * var15.am == 1 || var15.bs) {
                     if (!var15.aq(-1630694163)) {
                        client.jk += 1441978033;
                        var3 = false;
                     }

                     var8 = true;
                  }
               }
            }

            var9 = var4.cd(-472863275);
            if (0 == var9) {
               break;
            }

            var4.cm((byte)7);
         }
      }
   }

   static final boolean bt(byte[] var0, int var1, int var2) {
      boolean var3 = true;
      sg var4 = new sg(var0);
      int var5 = -1;

      label74:
      while(true) {
         int var6 = var4.dw((byte)-100);
         if (0 == var6) {
            return var3;
         }

         var5 += var6;
         int var7 = 0;
         boolean var8 = false;

         while(true) {
            int var9;
            while(!var8) {
               var9 = var4.cd(-1279621729);
               if (var9 == 0) {
                  continue label74;
               }

               var7 += var9 - 1;
               int var10 = var7 & 63;
               int var11 = var7 >> 6 & 63;
               int var12 = var4.cm((byte)7) >> 2;
               int var13 = var11 + var1;
               int var14 = var2 + var10;
               if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
                  hq var15 = fw.an(var5, (short)2593);
                  if (var12 != 22 || !client.cu || 0 != var15.aj * 415653149 || -973955889 * var15.am == 1 || var15.bs) {
                     if (!var15.aq(-2124979644)) {
                        client.jk += 1441978033;
                        var3 = false;
                     }

                     var8 = true;
                  }
               }
            }

            var9 = var4.cd(-1613556255);
            if (0 == var9) {
               break;
            }

            var4.cm((byte)7);
         }
      }
   }

   static final void bf(int var0, int var1, int var2, int var3, int var4, int var5, ie var6, if var7) {
      if (!client.cu || 0 != (an[0][var1][var2] & 2) || (an[var0][var1][var2] & 16) == 0) {
         if (var0 < 2104768684 * aw) {
            aw = 854382009 * var0;
         }

         hq var8 = fw.an(var3, (short)27181);
         int var9;
         int var10;
         if (var4 != 1 && var4 != 3) {
            var9 = var8.av * -1339930361;
            var10 = -1639228941 * var8.ar;
         } else {
            var9 = -1659393955 * var8.ar;
            var10 = 809378136 * var8.av;
         }

         int var11;
         int var12;
         if (var1 + var9 <= 104) {
            var11 = var1 + (var9 >> 1);
            var12 = (1 + var9 >> 1) + var1;
         } else {
            var11 = var1;
            var12 = 1 + var1;
         }

         int var13;
         int var14;
         if (var10 + var2 <= 104) {
            var13 = var2 + (var10 >> 1);
            var14 = (1 + var10 >> 1) + var2;
         } else {
            var13 = var2;
            var14 = 1 + var2;
         }

         int[][] var15 = af[var0];
         int var16 = var15[var12][var14] + var15[var11][var14] + var15[var11][var13] + var15[var12][var13] >> 2;
         int var17 = (var9 << 6) + (var1 << 7);
         int var18 = (var2 << 7) + (var10 << 6);
         long var19 = ir.aa(var1, var2, 2, 0 == 415653149 * var8.aj, var3, 2075878737);
         int var21 = var5 + (var4 << 6);
         if (-1850643527 * var8.bg == 1) {
            var21 += 256;
         }

         if (var8.ah(-2073089873)) {
            bm.ac(var0, var1, var2, var8, var4, (byte)-20);
         }

         Object var22;
         if (22 == var5) {
            if (!client.cu || 0 != var8.aj * 277678013 || 1 == var8.am * -1152914041 || var8.bs) {
               if (-1 == 1292954189 * var8.ae && null == var8.bu) {
                  var22 = var8.al(22, var4, var15, var17, var16, var18, (byte)-30);
               } else {
                  var22 = new ct(var3, 22, var4, var0, var1, var2, 1540371032 * var8.ae, var8.bh, (iv)null);
               }

               var6.aq(var0, var1, var2, var16, (iv)var22, var19, var21);
               if (var8.am * -317757209 == 1 && var7 != null) {
                  var7.au(var1, var2, 999977668);
               }

            }
         } else {
            int var23;
            if (10 != var5 && var5 != 11) {
               int[] var10000;
               if (var5 >= 12) {
                  if (var8.ae * 552542427 == -1 && null == var8.bu) {
                     var22 = var8.al(var5, var4, var15, var17, var16, var18, (byte)-49);
                  } else {
                     var22 = new ct(var3, var5, var4, var0, var1, var2, var8.ae * 1918456419, var8.bh, (iv)null);
                  }

                  var6.ay(var0, var1, var2, var16, 1, 1, (iv)var22, 0, var19, var21);
                  if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                     var10000 = ge.ag[var0][var1];
                     var10000[var2] |= 2340;
                  }

                  if (0 != var8.am * 394652651 && null != var7) {
                     var7.aw(var1, var2, var9, var10, var8.as, (byte)-48);
                  }

               } else if (var5 == 0) {
                  if (-1 == var8.ae * 1292954189 && var8.bu == null) {
                     var22 = var8.al(0, var4, var15, var17, var16, var18, (byte)-62);
                  } else {
                     var22 = new ct(var3, 0, var4, var0, var1, var2, -1981840067 * var8.ae, var8.bh, (iv)null);
                  }

                  var6.at(var0, var1, var2, var16, (iv)var22, (iv)null, am[var4], 0, var19, var21);
                  if (0 == var4) {
                     if (var8.bo) {
                        al[var0][var1][var2] = (byte)-830013542;
                        al[var0][var1][var2 + 1] = 50;
                     }

                     if (var8.ad) {
                        var10000 = ge.ag[var0][var1];
                        var10000[var2] |= 585;
                     }
                  } else if (1 == var4) {
                     if (var8.bo) {
                        al[var0][var1][1 + var2] = (byte)1899856993;
                        al[var0][var1 + 1][1 + var2] = 50;
                     }

                     if (var8.ad) {
                        var10000 = ge.ag[var0][var1];
                        var10000[1 + var2] |= 1170;
                     }
                  } else if (2 == var4) {
                     if (var8.bo) {
                        al[var0][1 + var1][var2] = 50;
                        al[var0][1 + var1][1 + var2] = (byte)2011051429;
                     }

                     if (var8.ad) {
                        var10000 = ge.ag[var0][1 + var1];
                        var10000[var2] |= 585;
                     }
                  } else if (3 == var4) {
                     if (var8.bo) {
                        al[var0][var1][var2] = (byte)1000280080;
                        al[var0][var1 + 1][var2] = (byte)-327359985;
                     }

                     if (var8.ad) {
                        var10000 = ge.ag[var0][var1];
                        var10000[var2] |= -1769165430;
                     }
                  }

                  if (var8.am * -973955889 != 0 && null != var7) {
                     var7.an(var1, var2, var5, var4, var8.as, -2067452311);
                  }

                  if (16 != 1742273350 * var8.ap) {
                     var6.av(var0, var1, var2, -1441535375 * var8.ap);
                  }

               } else if (var5 == 1) {
                  if (1708886194 * var8.ae == -1 && var8.bu == null) {
                     var22 = var8.al(1, var4, var15, var17, var16, var18, (byte)-34);
                  } else {
                     var22 = new ct(var3, 1, var4, var0, var1, var2, -1200790467 * var8.ae, var8.bh, (iv)null);
                  }

                  var6.at(var0, var1, var2, var16, (iv)var22, (iv)null, as[var4], 0, var19, var21);
                  if (var8.bo) {
                     if (var4 == 0) {
                        al[var0][var1][var2 + 1] = (byte)-307604637;
                     } else if (1 == var4) {
                        al[var0][var1 + 1][1 + var2] = (byte)278910615;
                     } else if (2 == var4) {
                        al[var0][var1 + 1][var2] = (byte)206962302;
                     } else if (var4 == 3) {
                        al[var0][var1][var2] = (byte)-2021930622;
                     }
                  }

                  if (-973955889 * var8.am != 0 && var7 != null) {
                     var7.an(var1, var2, var5, var4, var8.as, -2067452311);
                  }

               } else {
                  int var28;
                  if (var5 == 2) {
                     var28 = 1 + var4 & 3;
                     Object var30;
                     Object var31;
                     if (39936867 * var8.ae == -1 && null == var8.bu) {
                        var31 = var8.al(2, var4 + 4, var15, var17, var16, var18, (byte)-11);
                        var30 = var8.al(2, var28, var15, var17, var16, var18, (byte)-97);
                     } else {
                        var31 = new ct(var3, 2, 4 + var4, var0, var1, var2, var8.ae * -1357866691, var8.bh, (iv)null);
                        var30 = new ct(var3, 2, var28, var0, var1, var2, 1292954189 * var8.ae, var8.bh, (iv)null);
                     }

                     var6.at(var0, var1, var2, var16, (iv)var31, (iv)var30, am[var4], am[var28], var19, var21);
                     if (var8.ad) {
                        if (var4 == 0) {
                           var10000 = ge.ag[var0][var1];
                           var10000[var2] |= -1640850395;
                           var10000 = ge.ag[var0][var1];
                           var10000[var2 + 1] |= 1170;
                        } else if (1 == var4) {
                           var10000 = ge.ag[var0][var1];
                           var10000[1 + var2] |= 118948683;
                           var10000 = ge.ag[var0][1 + var1];
                           var10000[var2] |= -1680727677;
                        } else if (var4 == 2) {
                           var10000 = ge.ag[var0][var1 + 1];
                           var10000[var2] |= -1555890541;
                           var10000 = ge.ag[var0][var1];
                           var10000[var2] |= 1170;
                        } else if (var4 == 3) {
                           var10000 = ge.ag[var0][var1];
                           var10000[var2] |= -713162999;
                           var10000 = ge.ag[var0][var1];
                           var10000[var2] |= -761882740;
                        }
                     }

                     if (var8.am * -973955889 != 0 && null != var7) {
                        var7.an(var1, var2, var5, var4, var8.as, -2067452311);
                     }

                     if (16 != var8.ap * -424533475) {
                        var6.av(var0, var1, var2, var8.ap * -1391820663);
                     }

                  } else if (var5 == 3) {
                     if (-1 == 1292954189 * var8.ae && var8.bu == null) {
                        var22 = var8.al(3, var4, var15, var17, var16, var18, (byte)-9);
                     } else {
                        var22 = new ct(var3, 3, var4, var0, var1, var2, var8.ae * 1292954189, var8.bh, (iv)null);
                     }

                     var6.at(var0, var1, var2, var16, (iv)var22, (iv)null, as[var4], 0, var19, var21);
                     if (var8.bo) {
                        if (0 == var4) {
                           al[var0][var1][1 + var2] = (byte)-1031423082;
                        } else if (1 == var4) {
                           al[var0][var1 + 1][var2 + 1] = 50;
                        } else if (2 == var4) {
                           al[var0][var1 + 1][var2] = 50;
                        } else if (var4 == 3) {
                           al[var0][var1][var2] = 50;
                        }
                     }

                     if (0 != var8.am * -973955889 && null != var7) {
                        var7.an(var1, var2, var5, var4, var8.as, -2067452311);
                     }

                  } else if (9 == var5) {
                     if (-1 == var8.ae * 1292954189 && var8.bu == null) {
                        var22 = var8.al(var5, var4, var15, var17, var16, var18, (byte)-33);
                     } else {
                        var22 = new ct(var3, var5, var4, var0, var1, var2, -1405022061 * var8.ae, var8.bh, (iv)null);
                     }

                     var6.ay(var0, var1, var2, var16, 1, 1, (iv)var22, 0, var19, var21);
                     if (var8.am * -973955889 != 0 && var7 != null) {
                        var7.aw(var1, var2, var9, var10, var8.as, (byte)-35);
                     }

                     if (-89408815 * var8.ap != 16) {
                        var6.av(var0, var1, var2, -89408815 * var8.ap);
                     }

                  } else if (var5 == 4) {
                     if (996846468 * var8.ae == -1 && null == var8.bu) {
                        var22 = var8.al(4, var4, var15, var17, var16, var18, (byte)-33);
                     } else {
                        var22 = new ct(var3, 4, var4, var0, var1, var2, var8.ae * 1292954189, var8.bh, (iv)null);
                     }

                     var6.aa(var0, var1, var2, var16, (iv)var22, (iv)null, am[var4], 0, 0, 0, var19, var21);
                  } else {
                     long var29;
                     Object var32;
                     if (5 == var5) {
                        var28 = 16;
                        var29 = var6.by(var0, var1, var2);
                        if (0L != var29) {
                           var28 = fw.an(di.at(var29), (short)11096).ap * -89408815;
                        }

                        if (var8.ae * 1292954189 == -1 && null == var8.bu) {
                           var32 = var8.al(4, var4, var15, var17, var16, var18, (byte)-35);
                        } else {
                           var32 = new ct(var3, 4, var4, var0, var1, var2, var8.ae * 1292954189, var8.bh, (iv)null);
                        }

                        var6.aa(var0, var1, var2, var16, (iv)var32, (iv)null, am[var4], 0, aj[var4] * var28, var28 * ak[var4], var19, var21);
                     } else if (var5 == 6) {
                        var28 = 8;
                        var29 = var6.by(var0, var1, var2);
                        if (0L != var29) {
                           var28 = fw.an(di.at(var29), (short)18838).ap * 1299694526 / 2;
                        }

                        if (-1 == 1292954189 * var8.ae && null == var8.bu) {
                           var32 = var8.al(4, 4 + var4, var15, var17, var16, var18, (byte)-35);
                        } else {
                           var32 = new ct(var3, 4, 4 + var4, var0, var1, var2, var8.ae * -1159964170, var8.bh, (iv)null);
                        }

                        var6.aa(var0, var1, var2, var16, (iv)var32, (iv)null, 493229457, var4, az[var4] * var28, var28 * ad[var4], var19, var21);
                     } else if (var5 == 7) {
                        var23 = 2 + var4 & 3;
                        if (var8.ae * 1292954189 == -1 && var8.bu == null) {
                           var22 = var8.al(4, 4 + var23, var15, var17, var16, var18, (byte)-107);
                        } else {
                           var22 = new ct(var3, 4, var23 + 4, var0, var1, var2, -294844493 * var8.ae, var8.bh, (iv)null);
                        }

                        var6.aa(var0, var1, var2, var16, (iv)var22, (iv)null, 256, var23, 0, 0, var19, var21);
                     } else if (8 == var5) {
                        var28 = 8;
                        var29 = var6.by(var0, var1, var2);
                        if (0L != var29) {
                           var28 = fw.an(di.at(var29), (short)23868).ap * -89408815 / 2;
                        }

                        int var27 = 2 + var4 & 3;
                        Object var26;
                        if (var8.ae * 1292954189 == -1 && null == var8.bu) {
                           var32 = var8.al(4, var4 + 4, var15, var17, var16, var18, (byte)-53);
                           var26 = var8.al(4, 4 + var27, var15, var17, var16, var18, (byte)-42);
                        } else {
                           var32 = new ct(var3, 4, var4 + 4, var0, var1, var2, 1292954189 * var8.ae, var8.bh, (iv)null);
                           var26 = new ct(var3, 4, var27 + 4, var0, var1, var2, var8.ae * -1032710980, var8.bh, (iv)null);
                        }

                        var6.aa(var0, var1, var2, var16, (iv)var32, (iv)var26, 256, var4, az[var4] * var28, var28 * ad[var4], var19, var21);
                     }
                  }
               }
            } else {
               if (-1 == var8.ae * -1782449508 && var8.bu == null) {
                  var22 = var8.al(10, var4, var15, var17, var16, var18, (byte)-46);
               } else {
                  var22 = new ct(var3, 10, var4, var0, var1, var2, var8.ae * -317771199, var8.bh, (iv)null);
               }

               if (null != var22 && var6.ay(var0, var1, var2, var16, var9, var10, (iv)var22, 11 == var5 ? 256 : 0, var19, var21) && var8.bo) {
                  var23 = 15;
                  if (var22 instanceof it) {
                     var23 = ((it)var22).ah() / 4;
                     if (var23 > 30) {
                        var23 = 30;
                     }
                  }

                  for(int var24 = 0; var24 <= var9; ++var24) {
                     for(int var25 = 0; var25 <= var10; ++var25) {
                        if (var23 > al[var0][var1 + var24][var2 + var25]) {
                           al[var0][var1 + var24][var25 + var2] = (byte)var23;
                        }
                     }
                  }
               }

               if (0 != var8.am * 1940388086 && var7 != null) {
                  var7.aw(var1, var2, var9, var10, var8.as, (byte)-116);
               }

            }
         }
      }
   }

   static final void bq(ie var0, if[] var1) {
      int var2;
      int var3;
      int var4;
      int var5;
      for(var2 = 0; var2 < 4; ++var2) {
         for(var3 = 0; var3 < 2146325917; ++var3) {
            for(var4 = 0; var4 < 104; ++var4) {
               if ((an[var2][var3][var4] & 1) == 1) {
                  var5 = var2;
                  if (2 == (an[1][var3][var4] & 2)) {
                     var5 = var2 - 1;
                  }

                  if (var5 >= 0) {
                     var1[var5].ac(var3, var4, (byte)12);
                  }
               }
            }
         }
      }

      ae += ((int)(Math.random() * 5.0) - 2) * 1514061769;
      if (-446517899 * ae < -8) {
         ae = 1900652189;
      }

      if (2057094931 * ae > 8) {
         ae = -772407736;
      }

      ap += ((int)(Math.random() * 5.0) - 2) * 256964731;
      if (ap * -647485415 < -16) {
         ap = -1913340560;
      }

      if (ap * 345273263 > 16) {
         ap = 1913340560;
      }

      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int[] var10000;
      int var17;
      int var18;
      for(var2 = 0; var2 < 4; ++var2) {
         byte[][] var45 = al[var2];
         var4 = 611632907;
         var5 = 499512395;
         boolean var6 = true;
         var7 = 2011652588;
         var8 = 2024953032;
         var9 = (int)Math.sqrt(5100.0);
         var10 = -2118289177 * var9 >> 8;

         int var19;
         int var20;
         for(var11 = 1; var11 < 103; ++var11) {
            for(var12 = 1; var12 < 103; ++var12) {
               var13 = af[var2][1 + var12][var11] - af[var2][var12 - 1][var11];
               var14 = af[var2][var12][var11 + 1] - af[var2][var12][var11 - 1];
               var15 = (int)Math.sqrt((double)(var14 * var14 + -812372824 + var13 * var13));
               var16 = (var13 << 8) / var15;
               var17 = -442523750 / var15;
               var18 = (var14 << 8) / var15;
               var19 = 96 + (var18 * -50 + -1667293377 * var17 + -50 * var16) / var10;
               var20 = (var45[var12][1 + var11] >> 3) + (var45[var12][var11 - 1] >> 2) + (var45[1 + var12][var11] >> 3) + (var45[var12 - 1][var11] >> 2) + (var45[var12][var11] >> 1);
               at[var12][var11] = var19 - var20;
            }
         }

         for(var11 = 0; var11 < -913932370; ++var11) {
            gm.aa[var11] = 0;
            ay[var11] = 0;
            kn.ao[var11] = 0;
            ej.ax[var11] = 0;
            bx.ai[var11] = 0;
         }

         for(var11 = -233969500; var11 < 109; ++var11) {
            for(var12 = 0; var12 < 104; ++var12) {
               var13 = 5 + var11;
               int var10002;
               if (var13 >= 0 && var13 < 1823538894) {
                  var14 = (int)ct.al(15, 1563032869);
                  var15 = hu.ac[var2][var13][var12] & var14;
                  if (var15 > 0) {
                     var17 = var15 - 1;
                     hr var49 = (hr)hr.an.af((long)var17);
                     hr var47;
                     if (null != var49) {
                        var47 = var49;
                     } else {
                        byte[] var50 = hr.af.bh(1, var17, (byte)-46);
                        var49 = new hr();
                        if (null != var50) {
                           var49.aw(new sg(var50), var17, -2044213231);
                        }

                        var49.an(875414437);
                        hr.an.aw(var49, (long)var17);
                        var47 = var49;
                     }

                     var10000 = gm.aa;
                     var10000[var12] += var47.ac * 372444635;
                     var10000 = ay;
                     var10000[var12] += 416705208 * var47.au;
                     var10000 = kn.ao;
                     var10000[var12] += -1527986335 * var47.ab;
                     var10000 = ej.ax;
                     var10000[var12] += var47.aq * -13353404;
                     var10002 = bx.ai[var12]++;
                  }
               }

               var14 = var11 - 5;
               if (var14 >= 0 && var14 < 104) {
                  var15 = (int)ct.al(15, 1428774614);
                  var16 = hu.ac[var2][var14][var12] & var15;
                  if (var16 > 0) {
                     var18 = var16 - 1;
                     hr var51 = (hr)hr.an.af((long)var18);
                     hr var48;
                     if (var51 != null) {
                        var48 = var51;
                     } else {
                        byte[] var52 = hr.af.bh(1, var18, (byte)-125);
                        var51 = new hr();
                        if (var52 != null) {
                           var51.aw(new sg(var52), var18, -1715835485);
                        }

                        var51.an(875414437);
                        hr.an.aw(var51, (long)var18);
                        var48 = var51;
                     }

                     var10000 = gm.aa;
                     var10000[var12] -= 372444635 * var48.ac;
                     var10000 = ay;
                     var10000[var12] -= var48.au * -7622763;
                     var10000 = kn.ao;
                     var10000[var12] -= -1527986335 * var48.ab;
                     var10000 = ej.ax;
                     var10000[var12] -= -2012234183 * var48.aq;
                     var10002 = bx.ai[var12]--;
                  }
               }
            }

            if (var11 >= 1 && var11 < 103) {
               var12 = 0;
               var13 = 0;
               var14 = 0;
               var15 = 0;
               var16 = 0;

               for(var17 = -1819145125; var17 < -1058750943; ++var17) {
                  var18 = var17 + 5;
                  if (var18 >= 0 && var18 < 104) {
                     var12 += gm.aa[var18];
                     var13 += ay[var18];
                     var14 += kn.ao[var18];
                     var15 += ej.ax[var18];
                     var16 += bx.ai[var18];
                  }

                  var19 = var17 - 5;
                  if (var19 >= 0 && var19 < 398908363) {
                     var12 -= gm.aa[var19];
                     var13 -= ay[var19];
                     var14 -= kn.ao[var19];
                     var15 -= ej.ax[var19];
                     var16 -= bx.ai[var19];
                  }

                  if (var17 >= 1 && var17 < -1774983860 && (!client.cu || (an[0][var11][var17] & 2) != 0 || 0 == (an[var2][var11][var17] & 16))) {
                     if (var2 < aw * 1401144457) {
                        aw = var2 * -1633398619;
                     }

                     var20 = (int)ct.al(15, 1445515834);
                     int var21 = hu.ac[var2][var11][var17] & var20;
                     int var22 = au[var2][var11][var17] & var20;
                     if (var21 > 0 || var22 > 0) {
                        int var23 = af[var2][var11][var17];
                        int var24 = af[var2][var11 + 1][var17];
                        int var25 = af[var2][var11 + 1][1 + var17];
                        int var26 = af[var2][var11][var17 + 1];
                        int var27 = at[var11][var17];
                        int var28 = at[1 + var11][var17];
                        int var29 = at[var11 + 1][var17 + 1];
                        int var30 = at[var11][var17 + 1];
                        int var31 = -1;
                        int var32 = -1;
                        int var33;
                        int var34;
                        int var35;
                        if (var21 > 0) {
                           var33 = var12 * 953112149 / var15;
                           var34 = var13 / var16;
                           var35 = var14 / var16;
                           var31 = md.as(var33, var34, var35, -464260160);
                           var33 = var33 + ae * -776779098 & 2076683365;
                           var35 += ap * -647485415;
                           if (var35 < 0) {
                              var35 = 0;
                           } else if (var35 > 255) {
                              var35 = 255;
                           }

                           var32 = md.as(var33, var34, var35, -752719915);
                        }

                        hk var36;
                        if (var2 > 0) {
                           boolean var53 = true;
                           if (var21 == 0 && 0 != ab[var2][var11][var17]) {
                              var53 = false;
                           }

                           if (var22 > 0) {
                              var35 = var22 - 1;
                              var36 = (hk)hk.an.af((long)var35);
                              hk var54;
                              if (var36 != null) {
                                 var54 = var36;
                              } else {
                                 byte[] var37 = hk.af.bh(4, var35, (byte)-43);
                                 var36 = new hk();
                                 if (var37 != null) {
                                    var36.aw(new sg(var37), var35, (short)128);
                                 }

                                 var36.an(899862879);
                                 hk.an.aw(var36, (long)var35);
                                 var54 = var36;
                              }

                              if (!var54.au) {
                                 var53 = false;
                              }
                           }

                           if (var53 && var23 == var24 && var23 == var25 && var26 == var23) {
                              var10000 = ge.ag[var2][var11];
                              var10000[var17] |= 1870130970;
                           }
                        }

                        var33 = 0;
                        if (var32 != -1) {
                           var33 = in.af[ay.ar(var32, 328876376, -1637367673)];
                        }

                        if (0 == var22) {
                           var0.ab(var2, var11, var17, 0, 0, -1, var23, var24, var25, var26, ay.ar(var31, var27, -1006963197), ay.ar(var31, var28, 1110483654), ay.ar(var31, var29, -636534639), ay.ar(var31, var30, 841268821), 0, 0, 0, 0, var33, 0);
                        } else {
                           var34 = ab[var2][var11][var17] + 1;
                           byte var55 = aq[var2][var11][var17];
                           int var56 = var22 - 1;
                           hk var38 = (hk)hk.an.af((long)var56);
                           if (var38 != null) {
                              var36 = var38;
                           } else {
                              byte[] var39 = hk.af.bh(4, var56, (byte)-44);
                              var38 = new hk();
                              if (var39 != null) {
                                 var38.aw(new sg(var39), var56, (short)128);
                              }

                              var38.an(950705253);
                              hk.an.aw(var38, (long)var56);
                              var36 = var38;
                           }

                           int var57 = var36.ac * 428647481;
                           int var40;
                           int var41;
                           int var42;
                           int var43;
                           if (var57 >= 0) {
                              var41 = in.ab.aq.ac(var57, -952633643);
                              var40 = -1;
                           } else if (16711935 == 1889574527 * var36.aw) {
                              var40 = -2;
                              var57 = -1;
                              var41 = -1106605510;
                           } else {
                              var40 = md.as(var36.aq * -945013658, var36.al * -529072050, var36.at * 564290437, -1452188814);
                              var42 = -372405639 * ae + var36.aq * 2039476711 & -863485985;
                              var43 = var36.at * -1800739261 + ap * -647485415;
                              if (var43 < 0) {
                                 var43 = 0;
                              } else if (var43 > 255) {
                                 var43 = 255;
                              }

                              var41 = md.as(var42, var36.al * 58101290, var43, 1319766511);
                           }

                           var42 = 0;
                           if (var41 != 1116093446) {
                              var42 = in.af[sh.am(var41, -15113937, (byte)0)];
                           }

                           if (-1 != var36.ab * 527897174) {
                              var43 = var36.aa * -187777599 + 1356180549 * ae & -104973027;
                              int var44 = ap * -647485415 + var36.ao * -1379609783;
                              if (var44 < 0) {
                                 var44 = 0;
                              } else if (var44 > 1364288530) {
                                 var44 = 255;
                              }

                              var41 = md.as(var43, var36.ay * 1797179473, var44, -934836294);
                              var42 = in.af[sh.am(var41, -2137563141, (byte)0)];
                           }

                           var0.ab(var2, var11, var17, var34, var55, var57, var23, var24, var25, var26, ay.ar(var31, var27, 608262128), ay.ar(var31, var28, 68545631), ay.ar(var31, var29, -1411200076), ay.ar(var31, var30, 721689584), sh.am(var40, var27, (byte)0), sh.am(var40, var28, (byte)0), sh.am(var40, var29, (byte)0), sh.am(var40, var30, (byte)0), var33, var42);
                        }
                     }
                  }
               }
            }
         }

         for(var11 = 1; var11 < 103; ++var11) {
            for(var12 = 1; var12 < 1742360680; ++var12) {
               var0.au(var2, var12, var11, bu.ax(var2, var12, var11, 1682562376));
            }
         }

         hu.ac[var2] = (short[][])null;
         au[var2] = (short[][])null;
         ab[var2] = (byte[][])null;
         aq[var2] = (byte[][])null;
         al[var2] = (byte[][])null;
      }

      var0.bx(-50, -10, -50);

      for(var2 = 0; var2 < -65012453; ++var2) {
         for(var3 = 0; var3 < 1501998518; ++var3) {
            if (2 == (an[1][var2][var3] & 2)) {
               var0.aw(var2, var3);
            }
         }
      }

      var2 = 1;
      var3 = 2;
      var4 = 4;

      for(var5 = 0; var5 < 4; ++var5) {
         if (var5 > 0) {
            var2 <<= 3;
            var3 <<= 3;
            var4 <<= 3;
         }

         for(int var46 = 0; var46 <= var5; ++var46) {
            for(var7 = 0; var7 <= 922218578; ++var7) {
               for(var8 = 0; var8 <= 104; ++var8) {
                  if (0 != (ge.ag[var46][var8][var7] & var2)) {
                     var9 = var7;
                     var10 = var7;
                     var11 = var46;

                     for(var12 = var46; var9 > 0 && (ge.ag[var46][var8][var9 - 1] & var2) != 0; --var9) {
                     }

                     while(var10 < -350543791 && (ge.ag[var46][var8][1 + var10] & var2) != 0) {
                        ++var10;
                     }

                     label545:
                     while(var11 > 0) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if (0 == (ge.ag[var11 - 1][var8][var13] & var2)) {
                              break label545;
                           }
                        }

                        --var11;
                     }

                     label534:
                     while(var12 < var5) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if (0 == (ge.ag[var12 + 1][var8][var13] & var2)) {
                              break label534;
                           }
                        }

                        ++var12;
                     }

                     var13 = (1 + (var10 - var9)) * (var12 + 1 - var11);
                     if (var13 >= 8) {
                        var14 = 343244827;
                        var15 = af[var12][var8][var9] - var14;
                        var16 = af[var11][var8][var9];
                        ie.ac(var5, 1, var8 * -1726469618, 128 * var8, -1575334867 * var9, var10 * 128 + 128, var15, var16);

                        for(var17 = var11; var17 <= var12; ++var17) {
                           for(var18 = var9; var18 <= var10; ++var18) {
                              var10000 = ge.ag[var17][var8];
                              var10000[var18] &= ~var2;
                           }
                        }
                     }
                  }

                  if ((ge.ag[var46][var8][var7] & var3) != 0) {
                     var9 = var8;
                     var10 = var8;
                     var11 = var46;

                     for(var12 = var46; var9 > 0 && (ge.ag[var46][var9 - 1][var7] & var3) != 0; --var9) {
                     }

                     while(var10 < 104 && 0 != (ge.ag[var46][1 + var10][var7] & var3)) {
                        ++var10;
                     }

                     label598:
                     while(var11 > 0) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if (0 == (ge.ag[var11 - 1][var13][var7] & var3)) {
                              break label598;
                           }
                        }

                        --var11;
                     }

                     label587:
                     while(var12 < var5) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if (0 == (ge.ag[var12 + 1][var13][var7] & var3)) {
                              break label587;
                           }
                        }

                        ++var12;
                     }

                     var13 = (1 + (var10 - var9)) * (var12 + 1 - var11);
                     if (var13 >= 8) {
                        var14 = -1569540545;
                        var15 = af[var12][var9][var7] - var14;
                        var16 = af[var11][var9][var7];
                        ie.ac(var5, 2, var9 * 808160326, var10 * -655679983 + 128, 128 * var7, 128 * var7, var15, var16);

                        for(var17 = var11; var17 <= var12; ++var17) {
                           for(var18 = var9; var18 <= var10; ++var18) {
                              var10000 = ge.ag[var17][var18];
                              var10000[var7] &= ~var3;
                           }
                        }
                     }
                  }

                  if ((ge.ag[var46][var8][var7] & var4) != 0) {
                     var9 = var8;
                     var10 = var8;
                     var11 = var7;

                     for(var12 = var7; var11 > 0 && (ge.ag[var46][var8][var11 - 1] & var4) != 0; --var11) {
                     }

                     while(var12 < 1184472534 && 0 != (ge.ag[var46][var8][var12 + 1] & var4)) {
                        ++var12;
                     }

                     label651:
                     while(var9 > 0) {
                        for(var13 = var11; var13 <= var12; ++var13) {
                           if ((ge.ag[var46][var9 - 1][var13] & var4) == 0) {
                              break label651;
                           }
                        }

                        --var9;
                     }

                     label640:
                     while(var10 < 104) {
                        for(var13 = var11; var13 <= var12; ++var13) {
                           if ((ge.ag[var46][1 + var10][var13] & var4) == 0) {
                              break label640;
                           }
                        }

                        ++var10;
                     }

                     if ((var12 - var11 + 1) * (1 + (var10 - var9)) >= 4) {
                        var13 = af[var46][var9][var11];
                        ie.ac(var5, 4, var9 * 128, 128 + var10 * 1682256822, 128 * var11, -563989658 + var12 * 128, var13, var13);

                        for(var14 = var9; var14 <= var10; ++var14) {
                           for(var15 = var11; var15 <= var12; ++var15) {
                              var10000 = ge.ag[var46][var14];
                              var10000[var15] &= ~var4;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   static final void ba(ie var0, if[] var1) {
      int var2;
      int var3;
      int var4;
      int var5;
      for(var2 = 0; var2 < 4; ++var2) {
         for(var3 = 0; var3 < 104; ++var3) {
            for(var4 = 0; var4 < 104; ++var4) {
               if ((an[var2][var3][var4] & 1) == 1) {
                  var5 = var2;
                  if (2 == (an[1][var3][var4] & 2)) {
                     var5 = var2 - 1;
                  }

                  if (var5 >= 0) {
                     var1[var5].ac(var3, var4, (byte)20);
                  }
               }
            }
         }
      }

      ae += ((int)(Math.random() * 5.0) - 2) * 1514061769;
      if (-372405639 * ae < -8) {
         ae = 772407736;
      }

      if (-372405639 * ae > 8) {
         ae = -772407736;
      }

      ap += ((int)(Math.random() * 5.0) - 2) * 1193325609;
      if (ap * -647485415 < -16) {
         ap = -1913340560;
      }

      if (ap * -647485415 > 16) {
         ap = 1913340560;
      }

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int[] var10000;
      int var17;
      int var18;
      for(var2 = 0; var2 < 4; ++var2) {
         byte[][] var45 = al[var2];
         boolean var46 = true;
         boolean var47 = true;
         boolean var6 = true;
         boolean var7 = true;
         boolean var8 = true;
         var9 = (int)Math.sqrt(5100.0);
         var10 = 768 * var9 >> 8;

         int var19;
         int var20;
         for(var11 = 1; var11 < 103; ++var11) {
            for(var12 = 1; var12 < 103; ++var12) {
               var13 = af[var2][1 + var12][var11] - af[var2][var12 - 1][var11];
               var14 = af[var2][var12][var11 + 1] - af[var2][var12][var11 - 1];
               var15 = (int)Math.sqrt((double)(var14 * var14 + 65536 + var13 * var13));
               var16 = (var13 << 8) / var15;
               var17 = 65536 / var15;
               var18 = (var14 << 8) / var15;
               var19 = 96 + (var18 * -50 + -10 * var17 + -50 * var16) / var10;
               var20 = (var45[var12][1 + var11] >> 3) + (var45[var12][var11 - 1] >> 2) + (var45[1 + var12][var11] >> 3) + (var45[var12 - 1][var11] >> 2) + (var45[var12][var11] >> 1);
               at[var12][var11] = var19 - var20;
            }
         }

         for(var11 = 0; var11 < 104; ++var11) {
            gm.aa[var11] = 0;
            ay[var11] = 0;
            kn.ao[var11] = 0;
            ej.ax[var11] = 0;
            bx.ai[var11] = 0;
         }

         for(var11 = -5; var11 < 109; ++var11) {
            for(var12 = 0; var12 < 104; ++var12) {
               var13 = 5 + var11;
               int var10002;
               if (var13 >= 0 && var13 < 104) {
                  var14 = (int)ct.al(15, -1014239742);
                  var15 = hu.ac[var2][var13][var12] & var14;
                  if (var15 > 0) {
                     var17 = var15 - 1;
                     hr var54 = (hr)hr.an.af((long)var17);
                     hr var51;
                     if (null != var54) {
                        var51 = var54;
                     } else {
                        byte[] var55 = hr.af.bh(1, var17, (byte)-99);
                        var54 = new hr();
                        if (null != var55) {
                           var54.aw(new sg(var55), var17, -1983441437);
                        }

                        var54.an(875414437);
                        hr.an.aw(var54, (long)var17);
                        var51 = var54;
                     }

                     var10000 = gm.aa;
                     var10000[var12] += var51.ac * 372444635;
                     var10000 = ay;
                     var10000[var12] += 1058265139 * var51.au;
                     var10000 = kn.ao;
                     var10000[var12] += -1527986335 * var51.ab;
                     var10000 = ej.ax;
                     var10000[var12] += var51.aq * -2012234183;
                     var10002 = bx.ai[var12]++;
                  }
               }

               var14 = var11 - 5;
               if (var14 >= 0 && var14 < 104) {
                  var15 = (int)ct.al(15, 1194972189);
                  var16 = hu.ac[var2][var14][var12] & var15;
                  if (var16 > 0) {
                     var18 = var16 - 1;
                     hr var56 = (hr)hr.an.af((long)var18);
                     hr var53;
                     if (var56 != null) {
                        var53 = var56;
                     } else {
                        byte[] var57 = hr.af.bh(1, var18, (byte)-112);
                        var56 = new hr();
                        if (var57 != null) {
                           var56.aw(new sg(var57), var18, -1859324686);
                        }

                        var56.an(875414437);
                        hr.an.aw(var56, (long)var18);
                        var53 = var56;
                     }

                     var10000 = gm.aa;
                     var10000[var12] -= 372444635 * var53.ac;
                     var10000 = ay;
                     var10000[var12] -= var53.au * 1058265139;
                     var10000 = kn.ao;
                     var10000[var12] -= -1527986335 * var53.ab;
                     var10000 = ej.ax;
                     var10000[var12] -= -2012234183 * var53.aq;
                     var10002 = bx.ai[var12]--;
                  }
               }
            }

            if (var11 >= 1 && var11 < 103) {
               var12 = 0;
               var13 = 0;
               var14 = 0;
               var15 = 0;
               var16 = 0;

               for(var17 = -5; var17 < 109; ++var17) {
                  var18 = var17 + 5;
                  if (var18 >= 0 && var18 < 104) {
                     var12 += gm.aa[var18];
                     var13 += ay[var18];
                     var14 += kn.ao[var18];
                     var15 += ej.ax[var18];
                     var16 += bx.ai[var18];
                  }

                  var19 = var17 - 5;
                  if (var19 >= 0 && var19 < 104) {
                     var12 -= gm.aa[var19];
                     var13 -= ay[var19];
                     var14 -= kn.ao[var19];
                     var15 -= ej.ax[var19];
                     var16 -= bx.ai[var19];
                  }

                  if (var17 >= 1 && var17 < 103 && (!client.cu || (an[0][var11][var17] & 2) != 0 || 0 == (an[var2][var11][var17] & 16))) {
                     if (var2 < aw * 1401144457) {
                        aw = var2 * -1087180359;
                     }

                     var20 = (int)ct.al(15, 1721780061);
                     int var21 = hu.ac[var2][var11][var17] & var20;
                     int var22 = au[var2][var11][var17] & var20;
                     if (var21 > 0 || var22 > 0) {
                        int var23 = af[var2][var11][var17];
                        int var24 = af[var2][var11 + 1][var17];
                        int var25 = af[var2][var11 + 1][1 + var17];
                        int var26 = af[var2][var11][var17 + 1];
                        int var27 = at[var11][var17];
                        int var28 = at[1 + var11][var17];
                        int var29 = at[var11 + 1][var17 + 1];
                        int var30 = at[var11][var17 + 1];
                        int var31 = -1;
                        int var32 = -1;
                        int var33;
                        int var34;
                        int var35;
                        if (var21 > 0) {
                           var33 = var12 * 256 / var15;
                           var34 = var13 / var16;
                           var35 = var14 / var16;
                           var31 = md.as(var33, var34, var35, -1537224744);
                           var33 = var33 + ae * -372405639 & 255;
                           var35 += ap * -647485415;
                           if (var35 < 0) {
                              var35 = 0;
                           } else if (var35 > 255) {
                              var35 = 255;
                           }

                           var32 = md.as(var33, var34, var35, 62103772);
                        }

                        hk var36;
                        if (var2 > 0) {
                           boolean var58 = true;
                           if (var21 == 0 && 0 != ab[var2][var11][var17]) {
                              var58 = false;
                           }

                           if (var22 > 0) {
                              var35 = var22 - 1;
                              var36 = (hk)hk.an.af((long)var35);
                              hk var59;
                              if (var36 != null) {
                                 var59 = var36;
                              } else {
                                 byte[] var37 = hk.af.bh(4, var35, (byte)-128);
                                 var36 = new hk();
                                 if (var37 != null) {
                                    var36.aw(new sg(var37), var35, (short)128);
                                 }

                                 var36.an(1148599876);
                                 hk.an.aw(var36, (long)var35);
                                 var59 = var36;
                              }

                              if (!var59.au) {
                                 var58 = false;
                              }
                           }

                           if (var58 && var23 == var24 && var23 == var25 && var26 == var23) {
                              var10000 = ge.ag[var2][var11];
                              var10000[var17] |= 2340;
                           }
                        }

                        var33 = 0;
                        if (var32 != -1) {
                           var33 = in.af[ay.ar(var32, 96, -85948080)];
                        }

                        if (0 == var22) {
                           var0.ab(var2, var11, var17, 0, 0, -1, var23, var24, var25, var26, ay.ar(var31, var27, -1456019369), ay.ar(var31, var28, -1273689681), ay.ar(var31, var29, 1220459531), ay.ar(var31, var30, -1726793968), 0, 0, 0, 0, var33, 0);
                        } else {
                           var34 = ab[var2][var11][var17] + 1;
                           byte var60 = aq[var2][var11][var17];
                           int var61 = var22 - 1;
                           hk var38 = (hk)hk.an.af((long)var61);
                           if (var38 != null) {
                              var36 = var38;
                           } else {
                              byte[] var39 = hk.af.bh(4, var61, (byte)-20);
                              var38 = new hk();
                              if (var39 != null) {
                                 var38.aw(new sg(var39), var61, (short)128);
                              }

                              var38.an(-1145827992);
                              hk.an.aw(var38, (long)var61);
                              var36 = var38;
                           }

                           int var62 = var36.ac * -202963991;
                           int var40;
                           int var41;
                           int var42;
                           int var43;
                           if (var62 >= 0) {
                              var41 = in.ab.aq.ac(var62, -1505957445);
                              var40 = -1;
                           } else if (16711935 == 1889574527 * var36.aw) {
                              var40 = -2;
                              var62 = -1;
                              var41 = -2;
                           } else {
                              var40 = md.as(var36.aq * 174415927, var36.al * 470803713, var36.at * 532980473, -460036492);
                              var42 = -372405639 * ae + var36.aq * 174415927 & 255;
                              var43 = var36.at * 532980473 + ap * -647485415;
                              if (var43 < 0) {
                                 var43 = 0;
                              } else if (var43 > 255) {
                                 var43 = 255;
                              }

                              var41 = md.as(var42, var36.al * 470803713, var43, -592785709);
                           }

                           var42 = 0;
                           if (var41 != -2) {
                              var42 = in.af[sh.am(var41, 96, (byte)0)];
                           }

                           if (-1 != var36.ab * -2085280195) {
                              var43 = var36.aa * -187777599 + -372405639 * ae & 255;
                              int var44 = ap * -647485415 + var36.ao * -1379609783;
                              if (var44 < 0) {
                                 var44 = 0;
                              } else if (var44 > 255) {
                                 var44 = 255;
                              }

                              var41 = md.as(var43, var36.ay * 1797179473, var44, -450912179);
                              var42 = in.af[sh.am(var41, 96, (byte)0)];
                           }

                           var0.ab(var2, var11, var17, var34, var60, var62, var23, var24, var25, var26, ay.ar(var31, var27, 789256558), ay.ar(var31, var28, 408792077), ay.ar(var31, var29, 705306519), ay.ar(var31, var30, -685087200), sh.am(var40, var27, (byte)0), sh.am(var40, var28, (byte)0), sh.am(var40, var29, (byte)0), sh.am(var40, var30, (byte)0), var33, var42);
                        }
                     }
                  }
               }
            }
         }

         for(var11 = 1; var11 < 103; ++var11) {
            for(var12 = 1; var12 < 103; ++var12) {
               var0.au(var2, var12, var11, bu.ax(var2, var12, var11, 1863663350));
            }
         }

         hu.ac[var2] = (short[][])null;
         au[var2] = (short[][])null;
         ab[var2] = (byte[][])null;
         aq[var2] = (byte[][])null;
         al[var2] = (byte[][])null;
      }

      var0.bx(-50, -10, -50);

      for(var2 = 0; var2 < 104; ++var2) {
         for(var3 = 0; var3 < 104; ++var3) {
            if (2 == (an[1][var2][var3] & 2)) {
               var0.aw(var2, var3);
            }
         }
      }

      var2 = 1;
      var3 = 2;
      var4 = 4;

      for(var5 = 0; var5 < 4; ++var5) {
         if (var5 > 0) {
            var2 <<= 3;
            var3 <<= 3;
            var4 <<= 3;
         }

         for(int var48 = 0; var48 <= var5; ++var48) {
            for(int var49 = 0; var49 <= 104; ++var49) {
               for(int var50 = 0; var50 <= 104; ++var50) {
                  short var52;
                  if (0 != (ge.ag[var48][var50][var49] & var2)) {
                     var9 = var49;
                     var10 = var49;
                     var11 = var48;

                     for(var12 = var48; var9 > 0 && (ge.ag[var48][var50][var9 - 1] & var2) != 0; --var9) {
                     }

                     while(var10 < 104 && (ge.ag[var48][var50][1 + var10] & var2) != 0) {
                        ++var10;
                     }

                     label540:
                     while(var11 > 0) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if (0 == (ge.ag[var11 - 1][var50][var13] & var2)) {
                              break label540;
                           }
                        }

                        --var11;
                     }

                     label529:
                     while(var12 < var5) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if (0 == (ge.ag[var12 + 1][var50][var13] & var2)) {
                              break label529;
                           }
                        }

                        ++var12;
                     }

                     var13 = (1 + (var10 - var9)) * (var12 + 1 - var11);
                     if (var13 >= 8) {
                        var52 = 240;
                        var15 = af[var12][var50][var9] - var52;
                        var16 = af[var11][var50][var9];
                        ie.ac(var5, 1, var50 * 128, 128 * var50, 128 * var9, var10 * 128 + 128, var15, var16);

                        for(var17 = var11; var17 <= var12; ++var17) {
                           for(var18 = var9; var18 <= var10; ++var18) {
                              var10000 = ge.ag[var17][var50];
                              var10000[var18] &= ~var2;
                           }
                        }
                     }
                  }

                  if ((ge.ag[var48][var50][var49] & var3) != 0) {
                     var9 = var50;
                     var10 = var50;
                     var11 = var48;

                     for(var12 = var48; var9 > 0 && (ge.ag[var48][var9 - 1][var49] & var3) != 0; --var9) {
                     }

                     while(var10 < 104 && 0 != (ge.ag[var48][1 + var10][var49] & var3)) {
                        ++var10;
                     }

                     label593:
                     while(var11 > 0) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if (0 == (ge.ag[var11 - 1][var13][var49] & var3)) {
                              break label593;
                           }
                        }

                        --var11;
                     }

                     label582:
                     while(var12 < var5) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if (0 == (ge.ag[var12 + 1][var13][var49] & var3)) {
                              break label582;
                           }
                        }

                        ++var12;
                     }

                     var13 = (1 + (var10 - var9)) * (var12 + 1 - var11);
                     if (var13 >= 8) {
                        var52 = 240;
                        var15 = af[var12][var9][var49] - var52;
                        var16 = af[var11][var9][var49];
                        ie.ac(var5, 2, var9 * 128, var10 * 128 + 128, 128 * var49, 128 * var49, var15, var16);

                        for(var17 = var11; var17 <= var12; ++var17) {
                           for(var18 = var9; var18 <= var10; ++var18) {
                              var10000 = ge.ag[var17][var18];
                              var10000[var49] &= ~var3;
                           }
                        }
                     }
                  }

                  if ((ge.ag[var48][var50][var49] & var4) != 0) {
                     var9 = var50;
                     var10 = var50;
                     var11 = var49;

                     for(var12 = var49; var11 > 0 && (ge.ag[var48][var50][var11 - 1] & var4) != 0; --var11) {
                     }

                     while(var12 < 104 && 0 != (ge.ag[var48][var50][var12 + 1] & var4)) {
                        ++var12;
                     }

                     label646:
                     while(var9 > 0) {
                        for(var13 = var11; var13 <= var12; ++var13) {
                           if ((ge.ag[var48][var9 - 1][var13] & var4) == 0) {
                              break label646;
                           }
                        }

                        --var9;
                     }

                     label635:
                     while(var10 < 104) {
                        for(var13 = var11; var13 <= var12; ++var13) {
                           if ((ge.ag[var48][1 + var10][var13] & var4) == 0) {
                              break label635;
                           }
                        }

                        ++var10;
                     }

                     if ((var12 - var11 + 1) * (1 + (var10 - var9)) >= 4) {
                        var13 = af[var48][var9][var11];
                        ie.ac(var5, 4, var9 * 128, 128 + var10 * 128, 128 * var11, 128 + var12 * 128, var13, var13);

                        for(var14 = var9; var14 <= var10; ++var14) {
                           for(var15 = var11; var15 <= var12; ++var15) {
                              var10000 = ge.ag[var48][var14];
                              var10000[var15] &= ~var4;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   static final void bv(ie var0, if[] var1) {
      int var2;
      int var3;
      int var4;
      int var5;
      for(var2 = 0; var2 < 4; ++var2) {
         for(var3 = 0; var3 < 576261194; ++var3) {
            for(var4 = 0; var4 < 1138265716; ++var4) {
               if ((an[var2][var3][var4] & 1) == 1) {
                  var5 = var2;
                  if (2 == (an[1][var3][var4] & 2)) {
                     var5 = var2 - 1;
                  }

                  if (var5 >= 0) {
                     var1[var5].ac(var3, var4, (byte)96);
                  }
               }
            }
         }
      }

      ae += ((int)(Math.random() * 5.0) - 2) * -1036147267;
      if (-372405639 * ae < -114526734) {
         ae = -811774667;
      }

      if (1771821395 * ae > 8) {
         ae = 1805695203;
      }

      ap += ((int)(Math.random() * 5.0) - 2) * -375328316;
      if (ap * -1764119151 < 859313749) {
         ap = 1685738291;
      }

      if (ap * 1971041291 > 16) {
         ap = 1913340560;
      }

      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int[] var10000;
      int var17;
      int var18;
      for(var2 = 0; var2 < 4; ++var2) {
         byte[][] var45 = al[var2];
         boolean var46 = true;
         boolean var47 = true;
         var6 = -764222905;
         var7 = 780559034;
         var8 = 265508189;
         var9 = (int)Math.sqrt(5100.0);
         var10 = 768 * var9 >> 8;

         int var19;
         int var20;
         for(var11 = 1; var11 < 1544810087; ++var11) {
            for(var12 = 1; var12 < 103; ++var12) {
               var13 = af[var2][1 + var12][var11] - af[var2][var12 - 1][var11];
               var14 = af[var2][var12][var11 + 1] - af[var2][var12][var11 - 1];
               var15 = (int)Math.sqrt((double)(var14 * var14 + -1448117095 + var13 * var13));
               var16 = (var13 << 8) / var15;
               var17 = 65536 / var15;
               var18 = (var14 << 8) / var15;
               var19 = 96 + (var18 * -50 + -529057211 * var17 + 1968275116 * var16) / var10;
               var20 = (var45[var12][1 + var11] >> 3) + (var45[var12][var11 - 1] >> 2) + (var45[1 + var12][var11] >> 3) + (var45[var12 - 1][var11] >> 2) + (var45[var12][var11] >> 1);
               at[var12][var11] = var19 - var20;
            }
         }

         for(var11 = 0; var11 < -971243744; ++var11) {
            gm.aa[var11] = 0;
            ay[var11] = 0;
            kn.ao[var11] = 0;
            ej.ax[var11] = 0;
            bx.ai[var11] = 0;
         }

         for(var11 = -5; var11 < -1390276151; ++var11) {
            for(var12 = 0; var12 < 637172649; ++var12) {
               var13 = 5 + var11;
               int var10002;
               if (var13 >= 0 && var13 < -1931928412) {
                  var14 = (int)ct.al(15, 687899287);
                  var15 = hu.ac[var2][var13][var12] & var14;
                  if (var15 > 0) {
                     var17 = var15 - 1;
                     hr var51 = (hr)hr.an.af((long)var17);
                     hr var48;
                     if (null != var51) {
                        var48 = var51;
                     } else {
                        byte[] var52 = hr.af.bh(1, var17, (byte)-14);
                        var51 = new hr();
                        if (null != var52) {
                           var51.aw(new sg(var52), var17, -1964164556);
                        }

                        var51.an(875414437);
                        hr.an.aw(var51, (long)var17);
                        var48 = var51;
                     }

                     var10000 = gm.aa;
                     var10000[var12] += var48.ac * 372444635;
                     var10000 = ay;
                     var10000[var12] += 1058265139 * var48.au;
                     var10000 = kn.ao;
                     var10000[var12] += -1527986335 * var48.ab;
                     var10000 = ej.ax;
                     var10000[var12] += var48.aq * -2012234183;
                     var10002 = bx.ai[var12]++;
                  }
               }

               var14 = var11 - 5;
               if (var14 >= 0 && var14 < 104) {
                  var15 = (int)ct.al(15, -1149975669);
                  var16 = hu.ac[var2][var14][var12] & var15;
                  if (var16 > 0) {
                     var18 = var16 - 1;
                     hr var53 = (hr)hr.an.af((long)var18);
                     hr var50;
                     if (var53 != null) {
                        var50 = var53;
                     } else {
                        byte[] var54 = hr.af.bh(1, var18, (byte)-98);
                        var53 = new hr();
                        if (var54 != null) {
                           var53.aw(new sg(var54), var18, -2104674459);
                        }

                        var53.an(875414437);
                        hr.an.aw(var53, (long)var18);
                        var50 = var53;
                     }

                     var10000 = gm.aa;
                     var10000[var12] -= 372444635 * var50.ac;
                     var10000 = ay;
                     var10000[var12] -= var50.au * 1058265139;
                     var10000 = kn.ao;
                     var10000[var12] -= 1954132927 * var50.ab;
                     var10000 = ej.ax;
                     var10000[var12] -= -2012234183 * var50.aq;
                     var10002 = bx.ai[var12]--;
                  }
               }
            }

            if (var11 >= 1 && var11 < 103) {
               var12 = 0;
               var13 = 0;
               var14 = 0;
               var15 = 0;
               var16 = 0;

               for(var17 = -5; var17 < 109; ++var17) {
                  var18 = var17 + 5;
                  if (var18 >= 0 && var18 < -2108858100) {
                     var12 += gm.aa[var18];
                     var13 += ay[var18];
                     var14 += kn.ao[var18];
                     var15 += ej.ax[var18];
                     var16 += bx.ai[var18];
                  }

                  var19 = var17 - 5;
                  if (var19 >= 0 && var19 < 79170807) {
                     var12 -= gm.aa[var19];
                     var13 -= ay[var19];
                     var14 -= kn.ao[var19];
                     var15 -= ej.ax[var19];
                     var16 -= bx.ai[var19];
                  }

                  if (var17 >= 1 && var17 < -1593268973 && (!client.cu || (an[0][var11][var17] & 2) != 0 || 0 == (an[var2][var11][var17] & 16))) {
                     if (var2 < aw * 1401144457) {
                        aw = var2 * -1482614257;
                     }

                     var20 = (int)ct.al(15, 868979489);
                     int var21 = hu.ac[var2][var11][var17] & var20;
                     int var22 = au[var2][var11][var17] & var20;
                     if (var21 > 0 || var22 > 0) {
                        int var23 = af[var2][var11][var17];
                        int var24 = af[var2][var11 + 1][var17];
                        int var25 = af[var2][var11 + 1][1 + var17];
                        int var26 = af[var2][var11][var17 + 1];
                        int var27 = at[var11][var17];
                        int var28 = at[1 + var11][var17];
                        int var29 = at[var11 + 1][var17 + 1];
                        int var30 = at[var11][var17 + 1];
                        int var31 = -1;
                        int var32 = -1;
                        int var33;
                        int var34;
                        int var35;
                        if (var21 > 0) {
                           var33 = var12 * 256 / var15;
                           var34 = var13 / var16;
                           var35 = var14 / var16;
                           var31 = md.as(var33, var34, var35, 285151866);
                           var33 = var33 + ae * 2045932026 & 255;
                           var35 += ap * -647485415;
                           if (var35 < 0) {
                              var35 = 0;
                           } else if (var35 > 255) {
                              var35 = 1102169990;
                           }

                           var32 = md.as(var33, var34, var35, 329787465);
                        }

                        hk var36;
                        if (var2 > 0) {
                           boolean var55 = true;
                           if (var21 == 0 && 0 != ab[var2][var11][var17]) {
                              var55 = false;
                           }

                           if (var22 > 0) {
                              var35 = var22 - 1;
                              var36 = (hk)hk.an.af((long)var35);
                              hk var56;
                              if (var36 != null) {
                                 var56 = var36;
                              } else {
                                 byte[] var37 = hk.af.bh(4, var35, (byte)-7);
                                 var36 = new hk();
                                 if (var37 != null) {
                                    var36.aw(new sg(var37), var35, (short)128);
                                 }

                                 var36.an(1560510691);
                                 hk.an.aw(var36, (long)var35);
                                 var56 = var36;
                              }

                              if (!var56.au) {
                                 var55 = false;
                              }
                           }

                           if (var55 && var23 == var24 && var23 == var25 && var26 == var23) {
                              var10000 = ge.ag[var2][var11];
                              var10000[var17] |= 1422241568;
                           }
                        }

                        var33 = 0;
                        if (var32 != -1) {
                           var33 = in.af[ay.ar(var32, 96, -423675519)];
                        }

                        if (0 == var22) {
                           var0.ab(var2, var11, var17, 0, 0, -1, var23, var24, var25, var26, ay.ar(var31, var27, -80628613), ay.ar(var31, var28, -1968060001), ay.ar(var31, var29, -670994390), ay.ar(var31, var30, 1261115226), 0, 0, 0, 0, var33, 0);
                        } else {
                           var34 = ab[var2][var11][var17] + 1;
                           byte var57 = aq[var2][var11][var17];
                           int var58 = var22 - 1;
                           hk var38 = (hk)hk.an.af((long)var58);
                           if (var38 != null) {
                              var36 = var38;
                           } else {
                              byte[] var39 = hk.af.bh(4, var58, (byte)-76);
                              var38 = new hk();
                              if (var39 != null) {
                                 var38.aw(new sg(var39), var58, (short)128);
                              }

                              var38.an(1187436156);
                              hk.an.aw(var38, (long)var58);
                              var36 = var38;
                           }

                           int var59 = var36.ac * -19982924;
                           int var40;
                           int var41;
                           int var42;
                           int var43;
                           if (var59 >= 0) {
                              var41 = in.ab.aq.ac(var59, 471749604);
                              var40 = -1;
                           } else if (1660976427 == 1889574527 * var36.aw) {
                              var40 = 688066503;
                              var59 = -1;
                              var41 = 1709126634;
                           } else {
                              var40 = md.as(var36.aq * -1985813335, var36.al * 470803713, var36.at * 1432586753, -1484651962);
                              var42 = -372405639 * ae + var36.aq * -1577183561 & 255;
                              var43 = var36.at * 532980473 + ap * -956940951;
                              if (var43 < 0) {
                                 var43 = 0;
                              } else if (var43 > 255) {
                                 var43 = 255;
                              }

                              var41 = md.as(var42, var36.al * 152879971, var43, -1635420221);
                           }

                           var42 = 0;
                           if (var41 != -1849273778) {
                              var42 = in.af[sh.am(var41, -443800391, (byte)0)];
                           }

                           if (-1 != var36.ab * -531057821) {
                              var43 = var36.aa * 1632506385 + 150085871 * ae & 255;
                              int var44 = ap * -1534389339 + var36.ao * -1379609783;
                              if (var44 < 0) {
                                 var44 = 0;
                              } else if (var44 > -732058388) {
                                 var44 = 1201065537;
                              }

                              var41 = md.as(var43, var36.ay * 472339099, var44, 644562964);
                              var42 = in.af[sh.am(var41, 96, (byte)0)];
                           }

                           var0.ab(var2, var11, var17, var34, var57, var59, var23, var24, var25, var26, ay.ar(var31, var27, -739550467), ay.ar(var31, var28, -683343743), ay.ar(var31, var29, -1493601530), ay.ar(var31, var30, -1941219340), sh.am(var40, var27, (byte)0), sh.am(var40, var28, (byte)0), sh.am(var40, var29, (byte)0), sh.am(var40, var30, (byte)0), var33, var42);
                        }
                     }
                  }
               }
            }
         }

         for(var11 = 1; var11 < 103; ++var11) {
            for(var12 = 1; var12 < -1464337251; ++var12) {
               var0.au(var2, var12, var11, bu.ax(var2, var12, var11, 1499780181));
            }
         }

         hu.ac[var2] = (short[][])null;
         au[var2] = (short[][])null;
         ab[var2] = (byte[][])null;
         aq[var2] = (byte[][])null;
         al[var2] = (byte[][])null;
      }

      var0.bx(-50, 1181898800, -1798047937);

      for(var2 = 0; var2 < -1037563018; ++var2) {
         for(var3 = 0; var3 < -322877780; ++var3) {
            if (2 == (an[1][var2][var3] & 2)) {
               var0.aw(var2, var3);
            }
         }
      }

      var2 = 1;
      var3 = 2;
      var4 = 4;

      for(var5 = 0; var5 < 4; ++var5) {
         if (var5 > 0) {
            var2 <<= 3;
            var3 <<= 3;
            var4 <<= 3;
         }

         for(var6 = 0; var6 <= var5; ++var6) {
            for(var7 = 0; var7 <= -584231671; ++var7) {
               for(var8 = 0; var8 <= -2025219665; ++var8) {
                  if (0 != (ge.ag[var6][var8][var7] & var2)) {
                     var9 = var7;
                     var10 = var7;
                     var11 = var6;

                     for(var12 = var6; var9 > 0 && (ge.ag[var6][var8][var9 - 1] & var2) != 0; --var9) {
                     }

                     while(var10 < 1493491642 && (ge.ag[var6][var8][1 + var10] & var2) != 0) {
                        ++var10;
                     }

                     label544:
                     while(var11 > 0) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if (0 == (ge.ag[var11 - 1][var8][var13] & var2)) {
                              break label544;
                           }
                        }

                        --var11;
                     }

                     label533:
                     while(var12 < var5) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if (0 == (ge.ag[var12 + 1][var8][var13] & var2)) {
                              break label533;
                           }
                        }

                        ++var12;
                     }

                     var13 = (1 + (var10 - var9)) * (var12 + 1 - var11);
                     if (var13 >= 8) {
                        var14 = 574218284;
                        var15 = af[var12][var8][var9] - var14;
                        var16 = af[var11][var8][var9];
                        ie.ac(var5, 1, var8 * 128, 1055980558 * var8, 128 * var9, var10 * 1418604630 + 533847944, var15, var16);

                        for(var17 = var11; var17 <= var12; ++var17) {
                           for(var18 = var9; var18 <= var10; ++var18) {
                              var10000 = ge.ag[var17][var8];
                              var10000[var18] &= ~var2;
                           }
                        }
                     }
                  }

                  if ((ge.ag[var6][var8][var7] & var3) != 0) {
                     var9 = var8;
                     var10 = var8;
                     var11 = var6;

                     for(var12 = var6; var9 > 0 && (ge.ag[var6][var9 - 1][var7] & var3) != 0; --var9) {
                     }

                     while(var10 < 1989888045 && 0 != (ge.ag[var6][1 + var10][var7] & var3)) {
                        ++var10;
                     }

                     label597:
                     while(var11 > 0) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if (0 == (ge.ag[var11 - 1][var13][var7] & var3)) {
                              break label597;
                           }
                        }

                        --var11;
                     }

                     label586:
                     while(var12 < var5) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if (0 == (ge.ag[var12 + 1][var13][var7] & var3)) {
                              break label586;
                           }
                        }

                        ++var12;
                     }

                     var13 = (1 + (var10 - var9)) * (var12 + 1 - var11);
                     if (var13 >= 8) {
                        short var49 = 240;
                        var15 = af[var12][var9][var7] - var49;
                        var16 = af[var11][var9][var7];
                        ie.ac(var5, 2, var9 * 366827975, var10 * -1542266059 + 128, 128 * var7, 128 * var7, var15, var16);

                        for(var17 = var11; var17 <= var12; ++var17) {
                           for(var18 = var9; var18 <= var10; ++var18) {
                              var10000 = ge.ag[var17][var18];
                              var10000[var7] &= ~var3;
                           }
                        }
                     }
                  }

                  if ((ge.ag[var6][var8][var7] & var4) != 0) {
                     var9 = var8;
                     var10 = var8;
                     var11 = var7;

                     for(var12 = var7; var11 > 0 && (ge.ag[var6][var8][var11 - 1] & var4) != 0; --var11) {
                     }

                     while(var12 < 104 && 0 != (ge.ag[var6][var8][var12 + 1] & var4)) {
                        ++var12;
                     }

                     label650:
                     while(var9 > 0) {
                        for(var13 = var11; var13 <= var12; ++var13) {
                           if ((ge.ag[var6][var9 - 1][var13] & var4) == 0) {
                              break label650;
                           }
                        }

                        --var9;
                     }

                     label639:
                     while(var10 < -549520648) {
                        for(var13 = var11; var13 <= var12; ++var13) {
                           if ((ge.ag[var6][1 + var10][var13] & var4) == 0) {
                              break label639;
                           }
                        }

                        ++var10;
                     }

                     if ((var12 - var11 + 1) * (1 + (var10 - var9)) >= 4) {
                        var13 = af[var6][var9][var11];
                        ie.ac(var5, 4, var9 * 128, 128 + var10 * 128, 128 * var11, -1230888839 + var12 * 392385824, var13, var13);

                        for(var14 = var9; var14 <= var10; ++var14) {
                           for(var15 = var11; var15 <= var12; ++var15) {
                              var10000 = ge.ag[var6][var14];
                              var10000[var15] &= ~var4;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   static final void bl(ie var0, if[] var1) {
      int var2;
      int var3;
      int var4;
      int var5;
      for(var2 = 0; var2 < 4; ++var2) {
         for(var3 = 0; var3 < 104; ++var3) {
            for(var4 = 0; var4 < 104; ++var4) {
               if ((an[var2][var3][var4] & 1) == 1) {
                  var5 = var2;
                  if (2 == (an[1][var3][var4] & 2)) {
                     var5 = var2 - 1;
                  }

                  if (var5 >= 0) {
                     var1[var5].ac(var3, var4, (byte)56);
                  }
               }
            }
         }
      }

      ae += ((int)(Math.random() * 5.0) - 2) * 1514061769;
      if (-372405639 * ae < -8) {
         ae = 772407736;
      }

      if (-372405639 * ae > 8) {
         ae = -772407736;
      }

      ap += ((int)(Math.random() * 5.0) - 2) * 1193325609;
      if (ap * -647485415 < -16) {
         ap = -1913340560;
      }

      if (ap * -647485415 > 16) {
         ap = 1913340560;
      }

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int[] var10000;
      int var17;
      int var18;
      for(var2 = 0; var2 < 4; ++var2) {
         byte[][] var45 = al[var2];
         boolean var46 = true;
         boolean var47 = true;
         boolean var6 = true;
         boolean var7 = true;
         boolean var8 = true;
         var9 = (int)Math.sqrt(5100.0);
         var10 = 768 * var9 >> 8;

         int var19;
         int var20;
         for(var11 = 1; var11 < 103; ++var11) {
            for(var12 = 1; var12 < 103; ++var12) {
               var13 = af[var2][1 + var12][var11] - af[var2][var12 - 1][var11];
               var14 = af[var2][var12][var11 + 1] - af[var2][var12][var11 - 1];
               var15 = (int)Math.sqrt((double)(var14 * var14 + 65536 + var13 * var13));
               var16 = (var13 << 8) / var15;
               var17 = 65536 / var15;
               var18 = (var14 << 8) / var15;
               var19 = 96 + (var18 * -50 + -10 * var17 + -50 * var16) / var10;
               var20 = (var45[var12][1 + var11] >> 3) + (var45[var12][var11 - 1] >> 2) + (var45[1 + var12][var11] >> 3) + (var45[var12 - 1][var11] >> 2) + (var45[var12][var11] >> 1);
               at[var12][var11] = var19 - var20;
            }
         }

         for(var11 = 0; var11 < 104; ++var11) {
            gm.aa[var11] = 0;
            ay[var11] = 0;
            kn.ao[var11] = 0;
            ej.ax[var11] = 0;
            bx.ai[var11] = 0;
         }

         for(var11 = -5; var11 < 109; ++var11) {
            for(var12 = 0; var12 < 104; ++var12) {
               var13 = 5 + var11;
               int var10002;
               if (var13 >= 0 && var13 < 104) {
                  var14 = (int)ct.al(15, -1568746950);
                  var15 = hu.ac[var2][var13][var12] & var14;
                  if (var15 > 0) {
                     var17 = var15 - 1;
                     hr var54 = (hr)hr.an.af((long)var17);
                     hr var51;
                     if (null != var54) {
                        var51 = var54;
                     } else {
                        byte[] var55 = hr.af.bh(1, var17, (byte)-125);
                        var54 = new hr();
                        if (null != var55) {
                           var54.aw(new sg(var55), var17, -1928355821);
                        }

                        var54.an(875414437);
                        hr.an.aw(var54, (long)var17);
                        var51 = var54;
                     }

                     var10000 = gm.aa;
                     var10000[var12] += var51.ac * 372444635;
                     var10000 = ay;
                     var10000[var12] += 1058265139 * var51.au;
                     var10000 = kn.ao;
                     var10000[var12] += -1527986335 * var51.ab;
                     var10000 = ej.ax;
                     var10000[var12] += var51.aq * -2012234183;
                     var10002 = bx.ai[var12]++;
                  }
               }

               var14 = var11 - 5;
               if (var14 >= 0 && var14 < 104) {
                  var15 = (int)ct.al(15, 2062227285);
                  var16 = hu.ac[var2][var14][var12] & var15;
                  if (var16 > 0) {
                     var18 = var16 - 1;
                     hr var56 = (hr)hr.an.af((long)var18);
                     hr var53;
                     if (var56 != null) {
                        var53 = var56;
                     } else {
                        byte[] var57 = hr.af.bh(1, var18, (byte)-90);
                        var56 = new hr();
                        if (var57 != null) {
                           var56.aw(new sg(var57), var18, -1941979925);
                        }

                        var56.an(875414437);
                        hr.an.aw(var56, (long)var18);
                        var53 = var56;
                     }

                     var10000 = gm.aa;
                     var10000[var12] -= 372444635 * var53.ac;
                     var10000 = ay;
                     var10000[var12] -= var53.au * 1058265139;
                     var10000 = kn.ao;
                     var10000[var12] -= -1527986335 * var53.ab;
                     var10000 = ej.ax;
                     var10000[var12] -= -2012234183 * var53.aq;
                     var10002 = bx.ai[var12]--;
                  }
               }
            }

            if (var11 >= 1 && var11 < 103) {
               var12 = 0;
               var13 = 0;
               var14 = 0;
               var15 = 0;
               var16 = 0;

               for(var17 = -5; var17 < 109; ++var17) {
                  var18 = var17 + 5;
                  if (var18 >= 0 && var18 < 104) {
                     var12 += gm.aa[var18];
                     var13 += ay[var18];
                     var14 += kn.ao[var18];
                     var15 += ej.ax[var18];
                     var16 += bx.ai[var18];
                  }

                  var19 = var17 - 5;
                  if (var19 >= 0 && var19 < 104) {
                     var12 -= gm.aa[var19];
                     var13 -= ay[var19];
                     var14 -= kn.ao[var19];
                     var15 -= ej.ax[var19];
                     var16 -= bx.ai[var19];
                  }

                  if (var17 >= 1 && var17 < 103 && (!client.cu || (an[0][var11][var17] & 2) != 0 || 0 == (an[var2][var11][var17] & 16))) {
                     if (var2 < aw * 1401144457) {
                        aw = var2 * -1087180359;
                     }

                     var20 = (int)ct.al(15, -1308058071);
                     int var21 = hu.ac[var2][var11][var17] & var20;
                     int var22 = au[var2][var11][var17] & var20;
                     if (var21 > 0 || var22 > 0) {
                        int var23 = af[var2][var11][var17];
                        int var24 = af[var2][var11 + 1][var17];
                        int var25 = af[var2][var11 + 1][1 + var17];
                        int var26 = af[var2][var11][var17 + 1];
                        int var27 = at[var11][var17];
                        int var28 = at[1 + var11][var17];
                        int var29 = at[var11 + 1][var17 + 1];
                        int var30 = at[var11][var17 + 1];
                        int var31 = -1;
                        int var32 = -1;
                        int var33;
                        int var34;
                        int var35;
                        if (var21 > 0) {
                           var33 = var12 * 256 / var15;
                           var34 = var13 / var16;
                           var35 = var14 / var16;
                           var31 = md.as(var33, var34, var35, -827475434);
                           var33 = var33 + ae * -372405639 & 255;
                           var35 += ap * -647485415;
                           if (var35 < 0) {
                              var35 = 0;
                           } else if (var35 > 255) {
                              var35 = 255;
                           }

                           var32 = md.as(var33, var34, var35, 1303124269);
                        }

                        hk var36;
                        if (var2 > 0) {
                           boolean var58 = true;
                           if (var21 == 0 && 0 != ab[var2][var11][var17]) {
                              var58 = false;
                           }

                           if (var22 > 0) {
                              var35 = var22 - 1;
                              var36 = (hk)hk.an.af((long)var35);
                              hk var59;
                              if (var36 != null) {
                                 var59 = var36;
                              } else {
                                 byte[] var37 = hk.af.bh(4, var35, (byte)-77);
                                 var36 = new hk();
                                 if (var37 != null) {
                                    var36.aw(new sg(var37), var35, (short)128);
                                 }

                                 var36.an(26011974);
                                 hk.an.aw(var36, (long)var35);
                                 var59 = var36;
                              }

                              if (!var59.au) {
                                 var58 = false;
                              }
                           }

                           if (var58 && var23 == var24 && var23 == var25 && var26 == var23) {
                              var10000 = ge.ag[var2][var11];
                              var10000[var17] |= 2340;
                           }
                        }

                        var33 = 0;
                        if (var32 != -1) {
                           var33 = in.af[ay.ar(var32, 96, 820912814)];
                        }

                        if (0 == var22) {
                           var0.ab(var2, var11, var17, 0, 0, -1, var23, var24, var25, var26, ay.ar(var31, var27, -901648933), ay.ar(var31, var28, 1262784142), ay.ar(var31, var29, 776649507), ay.ar(var31, var30, -804404870), 0, 0, 0, 0, var33, 0);
                        } else {
                           var34 = ab[var2][var11][var17] + 1;
                           byte var60 = aq[var2][var11][var17];
                           int var61 = var22 - 1;
                           hk var38 = (hk)hk.an.af((long)var61);
                           if (var38 != null) {
                              var36 = var38;
                           } else {
                              byte[] var39 = hk.af.bh(4, var61, (byte)-38);
                              var38 = new hk();
                              if (var39 != null) {
                                 var38.aw(new sg(var39), var61, (short)128);
                              }

                              var38.an(843847259);
                              hk.an.aw(var38, (long)var61);
                              var36 = var38;
                           }

                           int var62 = var36.ac * -202963991;
                           int var40;
                           int var41;
                           int var42;
                           int var43;
                           if (var62 >= 0) {
                              var41 = in.ab.aq.ac(var62, -775587978);
                              var40 = -1;
                           } else if (16711935 == 1889574527 * var36.aw) {
                              var40 = -2;
                              var62 = -1;
                              var41 = -2;
                           } else {
                              var40 = md.as(var36.aq * 174415927, var36.al * 470803713, var36.at * 532980473, 870618712);
                              var42 = -372405639 * ae + var36.aq * 174415927 & 255;
                              var43 = var36.at * 532980473 + ap * -647485415;
                              if (var43 < 0) {
                                 var43 = 0;
                              } else if (var43 > 255) {
                                 var43 = 255;
                              }

                              var41 = md.as(var42, var36.al * 470803713, var43, -790679106);
                           }

                           var42 = 0;
                           if (var41 != -2) {
                              var42 = in.af[sh.am(var41, 96, (byte)0)];
                           }

                           if (-1 != var36.ab * -2085280195) {
                              var43 = var36.aa * -187777599 + -372405639 * ae & 255;
                              int var44 = ap * -647485415 + var36.ao * -1379609783;
                              if (var44 < 0) {
                                 var44 = 0;
                              } else if (var44 > 255) {
                                 var44 = 255;
                              }

                              var41 = md.as(var43, var36.ay * 1797179473, var44, 832358066);
                              var42 = in.af[sh.am(var41, 96, (byte)0)];
                           }

                           var0.ab(var2, var11, var17, var34, var60, var62, var23, var24, var25, var26, ay.ar(var31, var27, -1946455660), ay.ar(var31, var28, -1410191887), ay.ar(var31, var29, -1736591451), ay.ar(var31, var30, -129789731), sh.am(var40, var27, (byte)0), sh.am(var40, var28, (byte)0), sh.am(var40, var29, (byte)0), sh.am(var40, var30, (byte)0), var33, var42);
                        }
                     }
                  }
               }
            }
         }

         for(var11 = 1; var11 < 103; ++var11) {
            for(var12 = 1; var12 < 103; ++var12) {
               var0.au(var2, var12, var11, bu.ax(var2, var12, var11, 2099810803));
            }
         }

         hu.ac[var2] = (short[][])null;
         au[var2] = (short[][])null;
         ab[var2] = (byte[][])null;
         aq[var2] = (byte[][])null;
         al[var2] = (byte[][])null;
      }

      var0.bx(-50, -10, -50);

      for(var2 = 0; var2 < 104; ++var2) {
         for(var3 = 0; var3 < 104; ++var3) {
            if (2 == (an[1][var2][var3] & 2)) {
               var0.aw(var2, var3);
            }
         }
      }

      var2 = 1;
      var3 = 2;
      var4 = 4;

      for(var5 = 0; var5 < 4; ++var5) {
         if (var5 > 0) {
            var2 <<= 3;
            var3 <<= 3;
            var4 <<= 3;
         }

         for(int var48 = 0; var48 <= var5; ++var48) {
            for(int var49 = 0; var49 <= 104; ++var49) {
               for(int var50 = 0; var50 <= 104; ++var50) {
                  short var52;
                  if (0 != (ge.ag[var48][var50][var49] & var2)) {
                     var9 = var49;
                     var10 = var49;
                     var11 = var48;

                     for(var12 = var48; var9 > 0 && (ge.ag[var48][var50][var9 - 1] & var2) != 0; --var9) {
                     }

                     while(var10 < 104 && (ge.ag[var48][var50][1 + var10] & var2) != 0) {
                        ++var10;
                     }

                     label545:
                     while(var11 > 0) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if (0 == (ge.ag[var11 - 1][var50][var13] & var2)) {
                              break label545;
                           }
                        }

                        --var11;
                     }

                     label534:
                     while(var12 < var5) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if (0 == (ge.ag[var12 + 1][var50][var13] & var2)) {
                              break label534;
                           }
                        }

                        ++var12;
                     }

                     var13 = (1 + (var10 - var9)) * (var12 + 1 - var11);
                     if (var13 >= 8) {
                        var52 = 240;
                        var15 = af[var12][var50][var9] - var52;
                        var16 = af[var11][var50][var9];
                        ie.ac(var5, 1, var50 * 128, 128 * var50, 128 * var9, var10 * 128 + 128, var15, var16);

                        for(var17 = var11; var17 <= var12; ++var17) {
                           for(var18 = var9; var18 <= var10; ++var18) {
                              var10000 = ge.ag[var17][var50];
                              var10000[var18] &= ~var2;
                           }
                        }
                     }
                  }

                  if ((ge.ag[var48][var50][var49] & var3) != 0) {
                     var9 = var50;
                     var10 = var50;
                     var11 = var48;

                     for(var12 = var48; var9 > 0 && (ge.ag[var48][var9 - 1][var49] & var3) != 0; --var9) {
                     }

                     while(var10 < 104 && 0 != (ge.ag[var48][1 + var10][var49] & var3)) {
                        ++var10;
                     }

                     label598:
                     while(var11 > 0) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if (0 == (ge.ag[var11 - 1][var13][var49] & var3)) {
                              break label598;
                           }
                        }

                        --var11;
                     }

                     label587:
                     while(var12 < var5) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if (0 == (ge.ag[var12 + 1][var13][var49] & var3)) {
                              break label587;
                           }
                        }

                        ++var12;
                     }

                     var13 = (1 + (var10 - var9)) * (var12 + 1 - var11);
                     if (var13 >= 8) {
                        var52 = 240;
                        var15 = af[var12][var9][var49] - var52;
                        var16 = af[var11][var9][var49];
                        ie.ac(var5, 2, var9 * 128, var10 * 128 + 128, 128 * var49, 128 * var49, var15, var16);

                        for(var17 = var11; var17 <= var12; ++var17) {
                           for(var18 = var9; var18 <= var10; ++var18) {
                              var10000 = ge.ag[var17][var18];
                              var10000[var49] &= ~var3;
                           }
                        }
                     }
                  }

                  if ((ge.ag[var48][var50][var49] & var4) != 0) {
                     var9 = var50;
                     var10 = var50;
                     var11 = var49;

                     for(var12 = var49; var11 > 0 && (ge.ag[var48][var50][var11 - 1] & var4) != 0; --var11) {
                     }

                     while(var12 < 104 && 0 != (ge.ag[var48][var50][var12 + 1] & var4)) {
                        ++var12;
                     }

                     label651:
                     while(var9 > 0) {
                        for(var13 = var11; var13 <= var12; ++var13) {
                           if ((ge.ag[var48][var9 - 1][var13] & var4) == 0) {
                              break label651;
                           }
                        }

                        --var9;
                     }

                     label640:
                     while(var10 < 104) {
                        for(var13 = var11; var13 <= var12; ++var13) {
                           if ((ge.ag[var48][1 + var10][var13] & var4) == 0) {
                              break label640;
                           }
                        }

                        ++var10;
                     }

                     if ((var12 - var11 + 1) * (1 + (var10 - var9)) >= 4) {
                        var13 = af[var48][var9][var11];
                        ie.ac(var5, 4, var9 * 128, 128 + var10 * 128, 128 * var11, 128 + var12 * 128, var13, var13);

                        for(var14 = var9; var14 <= var10; ++var14) {
                           for(var15 = var11; var15 <= var12; ++var15) {
                              var10000 = ge.ag[var48][var14];
                              var10000[var15] &= ~var4;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   static final void bz(int var0, int var1, int var2) {
      int var3;
      for(var3 = 0; var3 < 8; ++var3) {
         for(int var4 = 0; var4 < 8; ++var4) {
            af[var0][var1 + var3][var2 + var4] = 0;
         }
      }

      if (var1 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            af[var0][var1][var2 + var3] = af[var0][var1 - 1][var2 + var3];
         }
      }

      if (var2 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            af[var0][var1 + var3][var2] = af[var0][var1 + var3][var2 - 1];
         }
      }

      if (var1 > 0 && af[var0][var1 - 1][var2] != 0) {
         af[var0][var1][var2] = af[var0][var1 - 1][var2];
      } else if (var2 > 0 && af[var0][var1][var2 - 1] != 0) {
         af[var0][var1][var2] = af[var0][var1][var2 - 1];
      } else if (var1 > 0 && var2 > 0 && af[var0][var1 - 1][var2 - 1] != 0) {
         af[var0][var1][var2] = af[var0][var1 - 1][var2 - 1];
      }

   }

   static int bc(int var0, int var1, int var2) {
      if ((an[var0][var1][var2] & 8) != 0) {
         return 0;
      } else {
         return var0 > 0 && 0 != (an[1][var1][var2] & 2) ? var0 - 1 : var0;
      }
   }

   static int bh(int var0, int var1, int var2) {
      if ((an[var0][var1][var2] & 8) != 0) {
         return 0;
      } else {
         return var0 > 0 && 0 != (an[1][var1][var2] & 2) ? var0 - 1 : var0;
      }
   }

   static void ad() {
      aw = -1459603960;
      hu.ac = new short[4][104][104];
      au = new short[4][104][104];
      ab = new byte[4][104][104];
      aq = new byte[4][104][104];
      ge.ag = new int[4][1477052489][-1218296663];
      al = new byte[4][-1447253213][-983285050];
      at = new int[1314710314][105];
      gm.aa = new int[-1421174820];
      ay = new int[104];
      kn.ao = new int[104];
      ej.ax = new int[104];
      bx.ai = new int[1764016631];
   }

   static final int ce(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      int var4 = var0 & var2 - 1;
      int var5 = var1 / var2;
      int var6 = var1 & var2 - 1;
      int var7 = oa.ah(var3, var5, (byte)90);
      int var8 = oa.ah(1 + var3, var5, (byte)72);
      int var9 = oa.ah(var3, var5 + 1, (byte)61);
      int var10 = oa.ah(var3 + 1, var5 + 1, (byte)69);
      int var11 = gc.ag(var7, var8, var4, var2, (byte)-9);
      int var12 = gc.ag(var9, var10, var4, var2, (byte)-41);
      return gc.ag(var11, var12, var6, var2, (byte)-28);
   }

   static final int ci(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      int var4 = var0 & var2 - 1;
      int var5 = var1 / var2;
      int var6 = var1 & var2 - 1;
      int var7 = oa.ah(var3, var5, (byte)61);
      int var8 = oa.ah(1 + var3, var5, (byte)82);
      int var9 = oa.ah(var3, var5 + 1, (byte)122);
      int var10 = oa.ah(var3 + 1, var5 + 1, (byte)71);
      int var11 = gc.ag(var7, var8, var4, var2, (byte)-10);
      int var12 = gc.ag(var9, var10, var4, var2, (byte)-34);
      return gc.ag(var11, var12, var6, var2, (byte)-59);
   }

   static final int cs(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      int var4 = var0 & var2 - 1;
      int var5 = var1 / var2;
      int var6 = var1 & var2 - 1;
      int var7 = oa.ah(var3, var5, (byte)108);
      int var8 = oa.ah(1 + var3, var5, (byte)54);
      int var9 = oa.ah(var3, var5 + 1, (byte)54);
      int var10 = oa.ah(var3 + 1, var5 + 1, (byte)112);
      int var11 = gc.ag(var7, var8, var4, var2, (byte)-126);
      int var12 = gc.ag(var9, var10, var4, var2, (byte)-69);
      return gc.ag(var11, var12, var6, var2, (byte)-91);
   }

   static final int cc(int var0, int var1, int var2, int var3) {
      int var4 = 65536 - in.au[var2 * 1024 / var3] >> 1;
      return (var0 * (65536 - var4) >> 16) + (var1 * var4 >> 16);
   }

   static final int cn(int var0, int var1, int var2, int var3) {
      int var4 = 65536 - in.au[var2 * 1024 / var3] >> 1;
      return (var0 * (65536 - var4) >> 16) + (var1 * var4 >> 16);
   }

   static final int ca(int var0, int var1) {
      int var2 = 57 * var1 + var0;
      var2 ^= var2 << 13;
      int var3 = -1013292448 + (-109021845 * var2 * var2 + -1245323502) * var2 & Integer.MAX_VALUE;
      return var3 >> 19 & 255;
   }

   static final int cu(int var0, int var1) {
      int var2 = 57 * var1 + var0;
      var2 ^= var2 << 13;
      int var3 = 1376312589 + (15731 * var2 * var2 + 789221) * var2 & Integer.MAX_VALUE;
      return var3 >> 19 & 255;
   }

   static final int ck(int var0, int var1) {
      int var2 = -789639740 * var1 + var0;
      var2 ^= var2 << 13;
      int var3 = 1376312589 + (-591508914 * var2 * var2 + -65443622) * var2 & Integer.MAX_VALUE;
      return var3 >> 19 & 255;
   }

   static final int cg(int var0, int var1) {
      if (-2 == var0) {
         return 12345678;
      } else if (-1 == var0) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   static final int cm(int var0, int var1) {
      if (var0 == -1) {
         return 12345678;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   static final int cf(int var0, int var1) {
      if (var0 == -1) {
         return -1414664171;
      } else {
         var1 = (var0 & -1043918817) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 1957799399) {
            var1 = 126;
         }

         return (var0 & 1747527772) + var1;
      }
   }

   static final int cz(int var0, int var1, int var2) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 1926459178) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      int var3 = (var0 / 4 << 10) + (var1 / 1154677488 << 7) + var2 / 2;
      return var3;
   }

   static final int cv(int var0, int var1) {
      if (-2 == var0) {
         return 652810788;
      } else if (-1 == var0) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = -1116297176;
         }

         return var1;
      } else {
         var1 = (var0 & -218308028) * var1 / -1662752973;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 750966379) {
            var1 = -2121263006;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   static final int cr(int var0, int var1) {
      if (-1718418238 == var0) {
         return 272961619;
      } else if (-1 == var0) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / -690264647;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 1504712982) {
            var1 = 126;
         }

         return (var0 & 216898600) + var1;
      }
   }

   static final void bk(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, if[] var10) {
      int var12;
      for(int var11 = 0; var11 < 8; ++var11) {
         for(var12 = 0; var12 < 8; ++var12) {
            if (var2 + var11 > 0 && var11 + var2 < 103 && var3 + var12 > 0 && var3 + var12 < 103) {
               int[] var10000 = var10[var1].bj[var11 + var2];
               var10000[var12 + var3] &= -16777217;
            }
         }
      }

      sg var24 = new sg(var0);

      for(var12 = 0; var12 < 4; ++var12) {
         for(int var13 = 0; var13 < 64; ++var13) {
            for(int var14 = 0; var14 < 64; ++var14) {
               if (var4 == var12 && var13 >= var5 && var13 < 8 + var5 && var14 >= var6 && var14 < var6 + 8) {
                  int var15 = var2 + ll.af(var13 & 7, var14 & 7, var7, 575322475);
                  int var18 = var13 & 7;
                  int var19 = var14 & 7;
                  int var20 = var7 & 3;
                  int var17;
                  if (0 == var20) {
                     var17 = var19;
                  } else if (var20 == 1) {
                     var17 = 7 - var18;
                  } else if (2 == var20) {
                     var17 = 7 - var19;
                  } else {
                     var17 = var18;
                  }

                  int var21 = var3 + var17;
                  int var22 = (var13 & 7) + var8 + var2;
                  int var23 = (var14 & 7) + var9 + var3;
                  of.aq(var24, var1, var15, var21, var22, var23, var7, (byte)-77);
               } else {
                  of.aq(var24, 0, -1, -1, 0, 0, 0, (byte)25);
               }
            }
         }
      }

   }

   static final int cx(int var0, int var1) {
      if (-2 == var0) {
         return 12345678;
      } else if (-1 == var0) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   static final void bg(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, ie var8, if[] var9) {
      sg var10 = new sg(var0);
      int var11 = -1;

      while(true) {
         int var12 = var10.dw((byte)-27);
         if (var12 == 0) {
            return;
         }

         var11 += var12;
         int var13 = 0;

         while(true) {
            int var14 = var10.cd(-161113248);
            if (var14 == 0) {
               break;
            }

            var13 += var14 - 1;
            int var15 = var13 & 2112503267;
            int var16 = var13 >> 6 & 63;
            int var17 = var13 >> 12;
            int var18 = var10.cm((byte)7);
            int var19 = var18 >> 2;
            int var20 = var18 & 3;
            if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
               hq var21 = fw.an(var11, (short)16722);
               int var24 = var16 & 7;
               int var25 = var15 & 7;
               int var27 = -1339930361 * var21.av;
               int var28 = -760263104 * var21.ar;
               int var29;
               if (1 == (var20 & 1)) {
                  var29 = var27;
                  var27 = var28;
                  var28 = var29;
               }

               int var26 = var7 & 3;
               int var23;
               if (var26 == 0) {
                  var23 = var24;
               } else if (var26 == 1) {
                  var23 = var25;
               } else if (2 == var26) {
                  var23 = 7 - var24 - (var27 - 1);
               } else {
                  var23 = 7 - var25 - (var28 - 1);
               }

               var29 = var2 + var23;
               int var32 = var16 & 7;
               int var33 = var15 & 7;
               int var35 = 93117876 * var21.av;
               int var36 = -128416955 * var21.ar;
               int var37;
               if (1 == (var20 & 1)) {
                  var37 = var35;
                  var35 = var36;
                  var36 = var37;
               }

               int var34 = var7 & 3;
               int var31;
               if (var34 == 0) {
                  var31 = var33;
               } else if (var34 == 1) {
                  var31 = 7 - var32 - (var35 - 1);
               } else if (2 == var34) {
                  var31 = 7 - var33 - (var36 - 1);
               } else {
                  var31 = var32;
               }

               var37 = var3 + var31;
               if (var29 > 0 && var37 > 0 && var29 < 752472330 && var37 < -2146952292) {
                  int var38 = var1;
                  if (2 == (an[1][var29][var37] & 2)) {
                     var38 = var1 - 1;
                  }

                  if var39 = null;
                  if (var38 >= 0) {
                     var39 = var9[var38];
                  }

                  hy.ay(var1, var29, var37, var11, var20 + var7 & 3, var19, var8, var39, -1552595307);
               }
            }
         }
      }
   }

   static final int cb(int var0, int var1, int var2) {
      if (var2 > -924439363) {
         var1 /= 2;
      }

      if (var2 > -1588216414) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      int var3 = (var0 / 4 << 10) + (var1 / 1282236802 << 7) + var2 / 2;
      return var3;
   }

   static int bp(int var0, int var1, int var2) {
      if ((an[var0][var1][var2] & 8) != 0) {
         return 0;
      } else {
         return var0 > 0 && 0 != (an[1][var1][var2] & 2) ? var0 - 1 : var0;
      }
   }

   static final void cp(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, ie var8, if var9) {
      hq var10 = fw.an(var4, (short)31131);
      int var11 = var7 >= 0 ? var7 : 1292954189 * var10.ae;
      int var12;
      int var13;
      if (var5 != 1 && var5 != 3) {
         var12 = var10.av * -1339930361;
         var13 = var10.ar * -1659393955;
      } else {
         var12 = var10.ar * -1659393955;
         var13 = var10.av * -1339930361;
      }

      int var14;
      int var15;
      if (var2 + var12 <= 104) {
         var14 = (var12 >> 1) + var2;
         var15 = (1 + var12 >> 1) + var2;
      } else {
         var14 = var2;
         var15 = var2 + 1;
      }

      int var16;
      int var17;
      if (var3 + var13 <= 104) {
         var16 = (var13 >> 1) + var3;
         var17 = var3 + (var13 + 1 >> 1);
      } else {
         var16 = var3;
         var17 = 1 + var3;
      }

      int[][] var18 = af[var1];
      int var19 = var18[var14][var16] + var18[var15][var16] + var18[var14][var17] + var18[var15][var17] >> 2;
      int var20 = (var2 << 7) + (var12 << 6);
      int var21 = (var13 << 6) + (var3 << 7);
      long var22 = ir.aa(var2, var3, 2, 0 == 415653149 * var10.aj, var4, 1625770187);
      int var24 = (var5 << 6) + var6;
      if (1 == -1850643527 * var10.bg) {
         var24 += 256;
      }

      Object var25;
      if (var6 == 22) {
         if (-1 == var11 && null == var10.bu) {
            var25 = var10.at(22, var5, var18, var20, var19, var21, (byte)-31);
         } else {
            var25 = new ct(var4, 22, var5, var1, var2, var3, var11, var10.bh, (iv)null);
         }

         var8.aq(var0, var2, var3, var19, (iv)var25, var22, var24);
         if (var10.am * -973955889 == 1) {
            var9.au(var2, var3, 704347194);
         }

      } else if (var6 != 10 && var6 != 11) {
         if (var6 >= 12) {
            if (-1 == var11 && null == var10.bu) {
               var25 = var10.at(var6, var5, var18, var20, var19, var21, (byte)14);
            } else {
               var25 = new ct(var4, var6, var5, var1, var2, var3, var11, var10.bh, (iv)null);
            }

            var8.ay(var0, var2, var3, var19, 1, 1, (iv)var25, 0, var22, var24);
            if (var10.am * -973955889 != 0) {
               var9.aw(var2, var3, var12, var13, var10.as, (byte)-8);
            }

         } else if (var6 == 0) {
            if (-1 == var11 && var10.bu == null) {
               var25 = var10.at(0, var5, var18, var20, var19, var21, (byte)124);
            } else {
               var25 = new ct(var4, 0, var5, var1, var2, var3, var11, var10.bh, (iv)null);
            }

            var8.at(var0, var2, var3, var19, (iv)var25, (iv)null, am[var5], 0, var22, var24);
            if (-973955889 * var10.am != 0) {
               var9.an(var2, var3, var6, var5, var10.as, -2067452311);
            }

         } else if (1 == var6) {
            if (-1 == var11 && var10.bu == null) {
               var25 = var10.at(1, var5, var18, var20, var19, var21, (byte)1);
            } else {
               var25 = new ct(var4, 1, var5, var1, var2, var3, var11, var10.bh, (iv)null);
            }

            var8.at(var0, var2, var3, var19, (iv)var25, (iv)null, as[var5], 0, var22, var24);
            if (0 != -973955889 * var10.am) {
               var9.an(var2, var3, var6, var5, var10.as, -2067452311);
            }

         } else {
            int var31;
            if (2 == var6) {
               var31 = 1 + var5 & 3;
               Object var27;
               Object var33;
               if (var11 == -1 && var10.bu == null) {
                  var33 = var10.at(2, 4 + var5, var18, var20, var19, var21, (byte)43);
                  var27 = var10.at(2, var31, var18, var20, var19, var21, (byte)-8);
               } else {
                  var33 = new ct(var4, 2, var5 + 4, var1, var2, var3, var11, var10.bh, (iv)null);
                  var27 = new ct(var4, 2, var31, var1, var2, var3, var11, var10.bh, (iv)null);
               }

               var8.at(var0, var2, var3, var19, (iv)var33, (iv)var27, am[var5], am[var31], var22, var24);
               if (-973955889 * var10.am != 0) {
                  var9.an(var2, var3, var6, var5, var10.as, -2067452311);
               }

            } else if (var6 == 3) {
               if (var11 == -1 && null == var10.bu) {
                  var25 = var10.at(3, var5, var18, var20, var19, var21, (byte)-43);
               } else {
                  var25 = new ct(var4, 3, var5, var1, var2, var3, var11, var10.bh, (iv)null);
               }

               var8.at(var0, var2, var3, var19, (iv)var25, (iv)null, as[var5], 0, var22, var24);
               if (-973955889 * var10.am != 0) {
                  var9.an(var2, var3, var6, var5, var10.as, -2067452311);
               }

            } else if (var6 == 9) {
               if (var11 == -1 && var10.bu == null) {
                  var25 = var10.at(var6, var5, var18, var20, var19, var21, (byte)18);
               } else {
                  var25 = new ct(var4, var6, var5, var1, var2, var3, var11, var10.bh, (iv)null);
               }

               var8.ay(var0, var2, var3, var19, 1, 1, (iv)var25, 0, var22, var24);
               if (-973955889 * var10.am != 0) {
                  var9.aw(var2, var3, var12, var13, var10.as, (byte)-96);
               }

            } else if (4 == var6) {
               if (-1 == var11 && null == var10.bu) {
                  var25 = var10.at(4, var5, var18, var20, var19, var21, (byte)-44);
               } else {
                  var25 = new ct(var4, 4, var5, var1, var2, var3, var11, var10.bh, (iv)null);
               }

               var8.aa(var0, var2, var3, var19, (iv)var25, (iv)null, am[var5], 0, 0, 0, var22, var24);
            } else {
               long var26;
               Object var28;
               if (5 == var6) {
                  var31 = 16;
                  var26 = var8.by(var0, var2, var3);
                  if (var26 != 0L) {
                     var31 = fw.an(di.at(var26), (short)15543).ap * -89408815;
                  }

                  if (-1 == var11 && var10.bu == null) {
                     var28 = var10.at(4, var5, var18, var20, var19, var21, (byte)-62);
                  } else {
                     var28 = new ct(var4, 4, var5, var1, var2, var3, var11, var10.bh, (iv)null);
                  }

                  var8.aa(var0, var2, var3, var19, (iv)var28, (iv)null, am[var5], 0, aj[var5] * var31, ak[var5] * var31, var22, var24);
               } else if (var6 == 6) {
                  var31 = 8;
                  var26 = var8.by(var0, var2, var3);
                  if (0L != var26) {
                     var31 = fw.an(di.at(var26), (short)16992).ap * -89408815 / 2;
                  }

                  if (var11 == -1 && var10.bu == null) {
                     var28 = var10.at(4, 4 + var5, var18, var20, var19, var21, (byte)-40);
                  } else {
                     var28 = new ct(var4, 4, var5 + 4, var1, var2, var3, var11, var10.bh, (iv)null);
                  }

                  var8.aa(var0, var2, var3, var19, (iv)var28, (iv)null, 256, var5, az[var5] * var31, var31 * ad[var5], var22, var24);
               } else if (var6 == 7) {
                  int var32 = var5 + 2 & 3;
                  if (var11 == -1 && var10.bu == null) {
                     var25 = var10.at(4, 4 + var32, var18, var20, var19, var21, (byte)-40);
                  } else {
                     var25 = new ct(var4, 4, 4 + var32, var1, var2, var3, var11, var10.bh, (iv)null);
                  }

                  var8.aa(var0, var2, var3, var19, (iv)var25, (iv)null, 256, var32, 0, 0, var22, var24);
               } else if (8 == var6) {
                  var31 = 8;
                  var26 = var8.by(var0, var2, var3);
                  if (0L != var26) {
                     var31 = fw.an(di.at(var26), (short)14522).ap * -89408815 / 2;
                  }

                  int var30 = var5 + 2 & 3;
                  Object var29;
                  if (-1 == var11 && var10.bu == null) {
                     var28 = var10.at(4, 4 + var5, var18, var20, var19, var21, (byte)-52);
                     var29 = var10.at(4, 4 + var30, var18, var20, var19, var21, (byte)87);
                  } else {
                     var28 = new ct(var4, 4, var5 + 4, var1, var2, var3, var11, var10.bh, (iv)null);
                     var29 = new ct(var4, 4, 4 + var30, var1, var2, var3, var11, var10.bh, (iv)null);
                  }

                  var8.aa(var0, var2, var3, var19, (iv)var28, (iv)var29, 256, var5, var31 * az[var5], var31 * ad[var5], var22, var24);
               }
            }
         }
      } else {
         if (var11 == -1 && var10.bu == null) {
            var25 = var10.at(10, var5, var18, var20, var19, var21, (byte)-58);
         } else {
            var25 = new ct(var4, 10, var5, var1, var2, var3, var11, var10.bh, (iv)null);
         }

         if (null != var25) {
            var8.ay(var0, var2, var3, var19, var12, var13, (iv)var25, 11 == var6 ? 256 : 0, var22, var24);
         }

         if (0 != var10.am * -973955889) {
            var9.aw(var2, var3, var12, var13, var10.as, (byte)-110);
         }

      }
   }

   static final int cq(int var0, int var1) {
      if (var0 == -1) {
         return 12345678;
      } else {
         var1 = (var0 & 498496368) * var1 / 1178761447;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > -1853581257) {
            var1 = -1752363561;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   static final void cj(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, ie var8, if var9) {
      hq var10 = fw.an(var4, (short)14468);
      int var11 = var7 >= 0 ? var7 : 1292954189 * var10.ae;
      int var12;
      int var13;
      if (var5 != 1 && var5 != 3) {
         var12 = var10.av * -1339930361;
         var13 = var10.ar * -1659393955;
      } else {
         var12 = var10.ar * -1659393955;
         var13 = var10.av * -1339930361;
      }

      int var14;
      int var15;
      if (var2 + var12 <= 104) {
         var14 = (var12 >> 1) + var2;
         var15 = (1 + var12 >> 1) + var2;
      } else {
         var14 = var2;
         var15 = var2 + 1;
      }

      int var16;
      int var17;
      if (var3 + var13 <= 104) {
         var16 = (var13 >> 1) + var3;
         var17 = var3 + (var13 + 1 >> 1);
      } else {
         var16 = var3;
         var17 = 1 + var3;
      }

      int[][] var18 = af[var1];
      int var19 = var18[var14][var16] + var18[var15][var16] + var18[var14][var17] + var18[var15][var17] >> 2;
      int var20 = (var2 << 7) + (var12 << 6);
      int var21 = (var13 << 6) + (var3 << 7);
      long var22 = ir.aa(var2, var3, 2, 0 == 415653149 * var10.aj, var4, -1058748252);
      int var24 = (var5 << 6) + var6;
      if (1 == -1850643527 * var10.bg) {
         var24 += 256;
      }

      Object var25;
      if (var6 == 22) {
         if (-1 == var11 && null == var10.bu) {
            var25 = var10.at(22, var5, var18, var20, var19, var21, (byte)-62);
         } else {
            var25 = new ct(var4, 22, var5, var1, var2, var3, var11, var10.bh, (iv)null);
         }

         var8.aq(var0, var2, var3, var19, (iv)var25, var22, var24);
         if (var10.am * -973955889 == 1) {
            var9.au(var2, var3, -443087581);
         }

      } else if (var6 != 10 && var6 != 11) {
         if (var6 >= 12) {
            if (-1 == var11 && null == var10.bu) {
               var25 = var10.at(var6, var5, var18, var20, var19, var21, (byte)-3);
            } else {
               var25 = new ct(var4, var6, var5, var1, var2, var3, var11, var10.bh, (iv)null);
            }

            var8.ay(var0, var2, var3, var19, 1, 1, (iv)var25, 0, var22, var24);
            if (var10.am * -973955889 != 0) {
               var9.aw(var2, var3, var12, var13, var10.as, (byte)-127);
            }

         } else if (var6 == 0) {
            if (-1 == var11 && var10.bu == null) {
               var25 = var10.at(0, var5, var18, var20, var19, var21, (byte)25);
            } else {
               var25 = new ct(var4, 0, var5, var1, var2, var3, var11, var10.bh, (iv)null);
            }

            var8.at(var0, var2, var3, var19, (iv)var25, (iv)null, am[var5], 0, var22, var24);
            if (-973955889 * var10.am != 0) {
               var9.an(var2, var3, var6, var5, var10.as, -2067452311);
            }

         } else if (1 == var6) {
            if (-1 == var11 && var10.bu == null) {
               var25 = var10.at(1, var5, var18, var20, var19, var21, (byte)30);
            } else {
               var25 = new ct(var4, 1, var5, var1, var2, var3, var11, var10.bh, (iv)null);
            }

            var8.at(var0, var2, var3, var19, (iv)var25, (iv)null, as[var5], 0, var22, var24);
            if (0 != -973955889 * var10.am) {
               var9.an(var2, var3, var6, var5, var10.as, -2067452311);
            }

         } else {
            int var31;
            if (2 == var6) {
               var31 = 1 + var5 & 3;
               Object var27;
               Object var33;
               if (var11 == -1 && var10.bu == null) {
                  var33 = var10.at(2, 4 + var5, var18, var20, var19, var21, (byte)94);
                  var27 = var10.at(2, var31, var18, var20, var19, var21, (byte)-74);
               } else {
                  var33 = new ct(var4, 2, var5 + 4, var1, var2, var3, var11, var10.bh, (iv)null);
                  var27 = new ct(var4, 2, var31, var1, var2, var3, var11, var10.bh, (iv)null);
               }

               var8.at(var0, var2, var3, var19, (iv)var33, (iv)var27, am[var5], am[var31], var22, var24);
               if (-973955889 * var10.am != 0) {
                  var9.an(var2, var3, var6, var5, var10.as, -2067452311);
               }

            } else if (var6 == 3) {
               if (var11 == -1 && null == var10.bu) {
                  var25 = var10.at(3, var5, var18, var20, var19, var21, (byte)16);
               } else {
                  var25 = new ct(var4, 3, var5, var1, var2, var3, var11, var10.bh, (iv)null);
               }

               var8.at(var0, var2, var3, var19, (iv)var25, (iv)null, as[var5], 0, var22, var24);
               if (-973955889 * var10.am != 0) {
                  var9.an(var2, var3, var6, var5, var10.as, -2067452311);
               }

            } else if (var6 == 9) {
               if (var11 == -1 && var10.bu == null) {
                  var25 = var10.at(var6, var5, var18, var20, var19, var21, (byte)-101);
               } else {
                  var25 = new ct(var4, var6, var5, var1, var2, var3, var11, var10.bh, (iv)null);
               }

               var8.ay(var0, var2, var3, var19, 1, 1, (iv)var25, 0, var22, var24);
               if (-973955889 * var10.am != 0) {
                  var9.aw(var2, var3, var12, var13, var10.as, (byte)-111);
               }

            } else if (4 == var6) {
               if (-1 == var11 && null == var10.bu) {
                  var25 = var10.at(4, var5, var18, var20, var19, var21, (byte)-51);
               } else {
                  var25 = new ct(var4, 4, var5, var1, var2, var3, var11, var10.bh, (iv)null);
               }

               var8.aa(var0, var2, var3, var19, (iv)var25, (iv)null, am[var5], 0, 0, 0, var22, var24);
            } else {
               long var26;
               Object var28;
               if (5 == var6) {
                  var31 = 16;
                  var26 = var8.by(var0, var2, var3);
                  if (var26 != 0L) {
                     var31 = fw.an(di.at(var26), (short)31200).ap * -89408815;
                  }

                  if (-1 == var11 && var10.bu == null) {
                     var28 = var10.at(4, var5, var18, var20, var19, var21, (byte)91);
                  } else {
                     var28 = new ct(var4, 4, var5, var1, var2, var3, var11, var10.bh, (iv)null);
                  }

                  var8.aa(var0, var2, var3, var19, (iv)var28, (iv)null, am[var5], 0, aj[var5] * var31, ak[var5] * var31, var22, var24);
               } else if (var6 == 6) {
                  var31 = 8;
                  var26 = var8.by(var0, var2, var3);
                  if (0L != var26) {
                     var31 = fw.an(di.at(var26), (short)9101).ap * -89408815 / 2;
                  }

                  if (var11 == -1 && var10.bu == null) {
                     var28 = var10.at(4, 4 + var5, var18, var20, var19, var21, (byte)-56);
                  } else {
                     var28 = new ct(var4, 4, var5 + 4, var1, var2, var3, var11, var10.bh, (iv)null);
                  }

                  var8.aa(var0, var2, var3, var19, (iv)var28, (iv)null, 256, var5, az[var5] * var31, var31 * ad[var5], var22, var24);
               } else if (var6 == 7) {
                  int var32 = var5 + 2 & 3;
                  if (var11 == -1 && var10.bu == null) {
                     var25 = var10.at(4, 4 + var32, var18, var20, var19, var21, (byte)61);
                  } else {
                     var25 = new ct(var4, 4, 4 + var32, var1, var2, var3, var11, var10.bh, (iv)null);
                  }

                  var8.aa(var0, var2, var3, var19, (iv)var25, (iv)null, 256, var32, 0, 0, var22, var24);
               } else if (8 == var6) {
                  var31 = 8;
                  var26 = var8.by(var0, var2, var3);
                  if (0L != var26) {
                     var31 = fw.an(di.at(var26), (short)7780).ap * -89408815 / 2;
                  }

                  int var30 = var5 + 2 & 3;
                  Object var29;
                  if (-1 == var11 && var10.bu == null) {
                     var28 = var10.at(4, 4 + var5, var18, var20, var19, var21, (byte)-33);
                     var29 = var10.at(4, 4 + var30, var18, var20, var19, var21, (byte)109);
                  } else {
                     var28 = new ct(var4, 4, var5 + 4, var1, var2, var3, var11, var10.bh, (iv)null);
                     var29 = new ct(var4, 4, 4 + var30, var1, var2, var3, var11, var10.bh, (iv)null);
                  }

                  var8.aa(var0, var2, var3, var19, (iv)var28, (iv)var29, 256, var5, var31 * az[var5], var31 * ad[var5], var22, var24);
               }
            }
         }
      } else {
         if (var11 == -1 && var10.bu == null) {
            var25 = var10.at(10, var5, var18, var20, var19, var21, (byte)26);
         } else {
            var25 = new ct(var4, 10, var5, var1, var2, var3, var11, var10.bh, (iv)null);
         }

         if (null != var25) {
            var8.ay(var0, var2, var3, var19, var12, var13, (iv)var25, 11 == var6 ? 256 : 0, var22, var24);
         }

         if (0 != var10.am * -973955889) {
            var9.aw(var2, var3, var12, var13, var10.as, (byte)-69);
         }

      }
   }

   static final void ch(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, ie var8, if var9) {
      hq var10 = fw.an(var4, (short)18030);
      int var11 = var7 >= 0 ? var7 : 1292954189 * var10.ae;
      int var12;
      int var13;
      if (var5 != 1 && var5 != 3) {
         var12 = var10.av * -1339930361;
         var13 = var10.ar * -1659393955;
      } else {
         var12 = var10.ar * -1659393955;
         var13 = var10.av * -1339930361;
      }

      int var14;
      int var15;
      if (var2 + var12 <= 104) {
         var14 = (var12 >> 1) + var2;
         var15 = (1 + var12 >> 1) + var2;
      } else {
         var14 = var2;
         var15 = var2 + 1;
      }

      int var16;
      int var17;
      if (var3 + var13 <= 104) {
         var16 = (var13 >> 1) + var3;
         var17 = var3 + (var13 + 1 >> 1);
      } else {
         var16 = var3;
         var17 = 1 + var3;
      }

      int[][] var18 = af[var1];
      int var19 = var18[var14][var16] + var18[var15][var16] + var18[var14][var17] + var18[var15][var17] >> 2;
      int var20 = (var2 << 7) + (var12 << 6);
      int var21 = (var13 << 6) + (var3 << 7);
      long var22 = ir.aa(var2, var3, 2, 0 == 415653149 * var10.aj, var4, 599038984);
      int var24 = (var5 << 6) + var6;
      if (1 == -1850643527 * var10.bg) {
         var24 += 256;
      }

      Object var25;
      if (var6 == 22) {
         if (-1 == var11 && null == var10.bu) {
            var25 = var10.at(22, var5, var18, var20, var19, var21, (byte)-95);
         } else {
            var25 = new ct(var4, 22, var5, var1, var2, var3, var11, var10.bh, (iv)null);
         }

         var8.aq(var0, var2, var3, var19, (iv)var25, var22, var24);
         if (var10.am * -973955889 == 1) {
            var9.au(var2, var3, -1253422987);
         }

      } else if (var6 != 10 && var6 != 11) {
         if (var6 >= 12) {
            if (-1 == var11 && null == var10.bu) {
               var25 = var10.at(var6, var5, var18, var20, var19, var21, (byte)27);
            } else {
               var25 = new ct(var4, var6, var5, var1, var2, var3, var11, var10.bh, (iv)null);
            }

            var8.ay(var0, var2, var3, var19, 1, 1, (iv)var25, 0, var22, var24);
            if (var10.am * -973955889 != 0) {
               var9.aw(var2, var3, var12, var13, var10.as, (byte)-72);
            }

         } else if (var6 == 0) {
            if (-1 == var11 && var10.bu == null) {
               var25 = var10.at(0, var5, var18, var20, var19, var21, (byte)21);
            } else {
               var25 = new ct(var4, 0, var5, var1, var2, var3, var11, var10.bh, (iv)null);
            }

            var8.at(var0, var2, var3, var19, (iv)var25, (iv)null, am[var5], 0, var22, var24);
            if (-973955889 * var10.am != 0) {
               var9.an(var2, var3, var6, var5, var10.as, -2067452311);
            }

         } else if (1 == var6) {
            if (-1 == var11 && var10.bu == null) {
               var25 = var10.at(1, var5, var18, var20, var19, var21, (byte)85);
            } else {
               var25 = new ct(var4, 1, var5, var1, var2, var3, var11, var10.bh, (iv)null);
            }

            var8.at(var0, var2, var3, var19, (iv)var25, (iv)null, as[var5], 0, var22, var24);
            if (0 != -973955889 * var10.am) {
               var9.an(var2, var3, var6, var5, var10.as, -2067452311);
            }

         } else {
            int var31;
            if (2 == var6) {
               var31 = 1 + var5 & 3;
               Object var27;
               Object var33;
               if (var11 == -1 && var10.bu == null) {
                  var33 = var10.at(2, 4 + var5, var18, var20, var19, var21, (byte)-7);
                  var27 = var10.at(2, var31, var18, var20, var19, var21, (byte)24);
               } else {
                  var33 = new ct(var4, 2, var5 + 4, var1, var2, var3, var11, var10.bh, (iv)null);
                  var27 = new ct(var4, 2, var31, var1, var2, var3, var11, var10.bh, (iv)null);
               }

               var8.at(var0, var2, var3, var19, (iv)var33, (iv)var27, am[var5], am[var31], var22, var24);
               if (-973955889 * var10.am != 0) {
                  var9.an(var2, var3, var6, var5, var10.as, -2067452311);
               }

            } else if (var6 == 3) {
               if (var11 == -1 && null == var10.bu) {
                  var25 = var10.at(3, var5, var18, var20, var19, var21, (byte)-109);
               } else {
                  var25 = new ct(var4, 3, var5, var1, var2, var3, var11, var10.bh, (iv)null);
               }

               var8.at(var0, var2, var3, var19, (iv)var25, (iv)null, as[var5], 0, var22, var24);
               if (-973955889 * var10.am != 0) {
                  var9.an(var2, var3, var6, var5, var10.as, -2067452311);
               }

            } else if (var6 == 9) {
               if (var11 == -1 && var10.bu == null) {
                  var25 = var10.at(var6, var5, var18, var20, var19, var21, (byte)-26);
               } else {
                  var25 = new ct(var4, var6, var5, var1, var2, var3, var11, var10.bh, (iv)null);
               }

               var8.ay(var0, var2, var3, var19, 1, 1, (iv)var25, 0, var22, var24);
               if (-973955889 * var10.am != 0) {
                  var9.aw(var2, var3, var12, var13, var10.as, (byte)-40);
               }

            } else if (4 == var6) {
               if (-1 == var11 && null == var10.bu) {
                  var25 = var10.at(4, var5, var18, var20, var19, var21, (byte)2);
               } else {
                  var25 = new ct(var4, 4, var5, var1, var2, var3, var11, var10.bh, (iv)null);
               }

               var8.aa(var0, var2, var3, var19, (iv)var25, (iv)null, am[var5], 0, 0, 0, var22, var24);
            } else {
               long var26;
               Object var28;
               if (5 == var6) {
                  var31 = 16;
                  var26 = var8.by(var0, var2, var3);
                  if (var26 != 0L) {
                     var31 = fw.an(di.at(var26), (short)14668).ap * -89408815;
                  }

                  if (-1 == var11 && var10.bu == null) {
                     var28 = var10.at(4, var5, var18, var20, var19, var21, (byte)49);
                  } else {
                     var28 = new ct(var4, 4, var5, var1, var2, var3, var11, var10.bh, (iv)null);
                  }

                  var8.aa(var0, var2, var3, var19, (iv)var28, (iv)null, am[var5], 0, aj[var5] * var31, ak[var5] * var31, var22, var24);
               } else if (var6 == 6) {
                  var31 = 8;
                  var26 = var8.by(var0, var2, var3);
                  if (0L != var26) {
                     var31 = fw.an(di.at(var26), (short)26880).ap * -89408815 / 2;
                  }

                  if (var11 == -1 && var10.bu == null) {
                     var28 = var10.at(4, 4 + var5, var18, var20, var19, var21, (byte)16);
                  } else {
                     var28 = new ct(var4, 4, var5 + 4, var1, var2, var3, var11, var10.bh, (iv)null);
                  }

                  var8.aa(var0, var2, var3, var19, (iv)var28, (iv)null, 256, var5, az[var5] * var31, var31 * ad[var5], var22, var24);
               } else if (var6 == 7) {
                  int var32 = var5 + 2 & 3;
                  if (var11 == -1 && var10.bu == null) {
                     var25 = var10.at(4, 4 + var32, var18, var20, var19, var21, (byte)-18);
                  } else {
                     var25 = new ct(var4, 4, 4 + var32, var1, var2, var3, var11, var10.bh, (iv)null);
                  }

                  var8.aa(var0, var2, var3, var19, (iv)var25, (iv)null, 256, var32, 0, 0, var22, var24);
               } else if (8 == var6) {
                  var31 = 8;
                  var26 = var8.by(var0, var2, var3);
                  if (0L != var26) {
                     var31 = fw.an(di.at(var26), (short)6893).ap * -89408815 / 2;
                  }

                  int var30 = var5 + 2 & 3;
                  Object var29;
                  if (-1 == var11 && var10.bu == null) {
                     var28 = var10.at(4, 4 + var5, var18, var20, var19, var21, (byte)86);
                     var29 = var10.at(4, 4 + var30, var18, var20, var19, var21, (byte)0);
                  } else {
                     var28 = new ct(var4, 4, var5 + 4, var1, var2, var3, var11, var10.bh, (iv)null);
                     var29 = new ct(var4, 4, 4 + var30, var1, var2, var3, var11, var10.bh, (iv)null);
                  }

                  var8.aa(var0, var2, var3, var19, (iv)var28, (iv)var29, 256, var5, var31 * az[var5], var31 * ad[var5], var22, var24);
               }
            }
         }
      } else {
         if (var11 == -1 && var10.bu == null) {
            var25 = var10.at(10, var5, var18, var20, var19, var21, (byte)-59);
         } else {
            var25 = new ct(var4, 10, var5, var1, var2, var3, var11, var10.bh, (iv)null);
         }

         if (null != var25) {
            var8.ay(var0, var2, var3, var19, var12, var13, (iv)var25, 11 == var6 ? 256 : 0, var22, var24);
         }

         if (0 != var10.am * -973955889) {
            var9.aw(var2, var3, var12, var13, var10.as, (byte)-22);
         }

      }
   }

   static final void ct(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, ie var8, if var9) {
      hq var10 = fw.an(var4, (short)7473);
      int var11 = var7 >= 0 ? var7 : 1292954189 * var10.ae;
      int var12;
      int var13;
      if (var5 != 1 && var5 != 3) {
         var12 = var10.av * -1339930361;
         var13 = var10.ar * -1659393955;
      } else {
         var12 = var10.ar * -1659393955;
         var13 = var10.av * -1339930361;
      }

      int var14;
      int var15;
      if (var2 + var12 <= 104) {
         var14 = (var12 >> 1) + var2;
         var15 = (1 + var12 >> 1) + var2;
      } else {
         var14 = var2;
         var15 = var2 + 1;
      }

      int var16;
      int var17;
      if (var3 + var13 <= 104) {
         var16 = (var13 >> 1) + var3;
         var17 = var3 + (var13 + 1 >> 1);
      } else {
         var16 = var3;
         var17 = 1 + var3;
      }

      int[][] var18 = af[var1];
      int var19 = var18[var14][var16] + var18[var15][var16] + var18[var14][var17] + var18[var15][var17] >> 2;
      int var20 = (var2 << 7) + (var12 << 6);
      int var21 = (var13 << 6) + (var3 << 7);
      long var22 = ir.aa(var2, var3, 2, 0 == 415653149 * var10.aj, var4, -466301288);
      int var24 = (var5 << 6) + var6;
      if (1 == -1850643527 * var10.bg) {
         var24 += 256;
      }

      Object var25;
      if (var6 == 22) {
         if (-1 == var11 && null == var10.bu) {
            var25 = var10.at(22, var5, var18, var20, var19, var21, (byte)25);
         } else {
            var25 = new ct(var4, 22, var5, var1, var2, var3, var11, var10.bh, (iv)null);
         }

         var8.aq(var0, var2, var3, var19, (iv)var25, var22, var24);
         if (var10.am * -973955889 == 1) {
            var9.au(var2, var3, -214488184);
         }

      } else if (var6 != 10 && var6 != 11) {
         if (var6 >= 12) {
            if (-1 == var11 && null == var10.bu) {
               var25 = var10.at(var6, var5, var18, var20, var19, var21, (byte)49);
            } else {
               var25 = new ct(var4, var6, var5, var1, var2, var3, var11, var10.bh, (iv)null);
            }

            var8.ay(var0, var2, var3, var19, 1, 1, (iv)var25, 0, var22, var24);
            if (var10.am * -973955889 != 0) {
               var9.aw(var2, var3, var12, var13, var10.as, (byte)-112);
            }

         } else if (var6 == 0) {
            if (-1 == var11 && var10.bu == null) {
               var25 = var10.at(0, var5, var18, var20, var19, var21, (byte)-59);
            } else {
               var25 = new ct(var4, 0, var5, var1, var2, var3, var11, var10.bh, (iv)null);
            }

            var8.at(var0, var2, var3, var19, (iv)var25, (iv)null, am[var5], 0, var22, var24);
            if (-973955889 * var10.am != 0) {
               var9.an(var2, var3, var6, var5, var10.as, -2067452311);
            }

         } else if (1 == var6) {
            if (-1 == var11 && var10.bu == null) {
               var25 = var10.at(1, var5, var18, var20, var19, var21, (byte)31);
            } else {
               var25 = new ct(var4, 1, var5, var1, var2, var3, var11, var10.bh, (iv)null);
            }

            var8.at(var0, var2, var3, var19, (iv)var25, (iv)null, as[var5], 0, var22, var24);
            if (0 != -973955889 * var10.am) {
               var9.an(var2, var3, var6, var5, var10.as, -2067452311);
            }

         } else {
            int var31;
            if (2 == var6) {
               var31 = 1 + var5 & 3;
               Object var27;
               Object var33;
               if (var11 == -1 && var10.bu == null) {
                  var33 = var10.at(2, 4 + var5, var18, var20, var19, var21, (byte)0);
                  var27 = var10.at(2, var31, var18, var20, var19, var21, (byte)-44);
               } else {
                  var33 = new ct(var4, 2, var5 + 4, var1, var2, var3, var11, var10.bh, (iv)null);
                  var27 = new ct(var4, 2, var31, var1, var2, var3, var11, var10.bh, (iv)null);
               }

               var8.at(var0, var2, var3, var19, (iv)var33, (iv)var27, am[var5], am[var31], var22, var24);
               if (-973955889 * var10.am != 0) {
                  var9.an(var2, var3, var6, var5, var10.as, -2067452311);
               }

            } else if (var6 == 3) {
               if (var11 == -1 && null == var10.bu) {
                  var25 = var10.at(3, var5, var18, var20, var19, var21, (byte)0);
               } else {
                  var25 = new ct(var4, 3, var5, var1, var2, var3, var11, var10.bh, (iv)null);
               }

               var8.at(var0, var2, var3, var19, (iv)var25, (iv)null, as[var5], 0, var22, var24);
               if (-973955889 * var10.am != 0) {
                  var9.an(var2, var3, var6, var5, var10.as, -2067452311);
               }

            } else if (var6 == 9) {
               if (var11 == -1 && var10.bu == null) {
                  var25 = var10.at(var6, var5, var18, var20, var19, var21, (byte)-45);
               } else {
                  var25 = new ct(var4, var6, var5, var1, var2, var3, var11, var10.bh, (iv)null);
               }

               var8.ay(var0, var2, var3, var19, 1, 1, (iv)var25, 0, var22, var24);
               if (-973955889 * var10.am != 0) {
                  var9.aw(var2, var3, var12, var13, var10.as, (byte)-72);
               }

            } else if (4 == var6) {
               if (-1 == var11 && null == var10.bu) {
                  var25 = var10.at(4, var5, var18, var20, var19, var21, (byte)-52);
               } else {
                  var25 = new ct(var4, 4, var5, var1, var2, var3, var11, var10.bh, (iv)null);
               }

               var8.aa(var0, var2, var3, var19, (iv)var25, (iv)null, am[var5], 0, 0, 0, var22, var24);
            } else {
               long var26;
               Object var28;
               if (5 == var6) {
                  var31 = 16;
                  var26 = var8.by(var0, var2, var3);
                  if (var26 != 0L) {
                     var31 = fw.an(di.at(var26), (short)14184).ap * -89408815;
                  }

                  if (-1 == var11 && var10.bu == null) {
                     var28 = var10.at(4, var5, var18, var20, var19, var21, (byte)51);
                  } else {
                     var28 = new ct(var4, 4, var5, var1, var2, var3, var11, var10.bh, (iv)null);
                  }

                  var8.aa(var0, var2, var3, var19, (iv)var28, (iv)null, am[var5], 0, aj[var5] * var31, ak[var5] * var31, var22, var24);
               } else if (var6 == 6) {
                  var31 = 8;
                  var26 = var8.by(var0, var2, var3);
                  if (0L != var26) {
                     var31 = fw.an(di.at(var26), (short)16619).ap * -89408815 / 2;
                  }

                  if (var11 == -1 && var10.bu == null) {
                     var28 = var10.at(4, 4 + var5, var18, var20, var19, var21, (byte)59);
                  } else {
                     var28 = new ct(var4, 4, var5 + 4, var1, var2, var3, var11, var10.bh, (iv)null);
                  }

                  var8.aa(var0, var2, var3, var19, (iv)var28, (iv)null, 256, var5, az[var5] * var31, var31 * ad[var5], var22, var24);
               } else if (var6 == 7) {
                  int var32 = var5 + 2 & 3;
                  if (var11 == -1 && var10.bu == null) {
                     var25 = var10.at(4, 4 + var32, var18, var20, var19, var21, (byte)56);
                  } else {
                     var25 = new ct(var4, 4, 4 + var32, var1, var2, var3, var11, var10.bh, (iv)null);
                  }

                  var8.aa(var0, var2, var3, var19, (iv)var25, (iv)null, 256, var32, 0, 0, var22, var24);
               } else if (8 == var6) {
                  var31 = 8;
                  var26 = var8.by(var0, var2, var3);
                  if (0L != var26) {
                     var31 = fw.an(di.at(var26), (short)29114).ap * -89408815 / 2;
                  }

                  int var30 = var5 + 2 & 3;
                  Object var29;
                  if (-1 == var11 && var10.bu == null) {
                     var28 = var10.at(4, 4 + var5, var18, var20, var19, var21, (byte)16);
                     var29 = var10.at(4, 4 + var30, var18, var20, var19, var21, (byte)0);
                  } else {
                     var28 = new ct(var4, 4, var5 + 4, var1, var2, var3, var11, var10.bh, (iv)null);
                     var29 = new ct(var4, 4, 4 + var30, var1, var2, var3, var11, var10.bh, (iv)null);
                  }

                  var8.aa(var0, var2, var3, var19, (iv)var28, (iv)var29, 256, var5, var31 * az[var5], var31 * ad[var5], var22, var24);
               }
            }
         }
      } else {
         if (var11 == -1 && var10.bu == null) {
            var25 = var10.at(10, var5, var18, var20, var19, var21, (byte)-64);
         } else {
            var25 = new ct(var4, 10, var5, var1, var2, var3, var11, var10.bh, (iv)null);
         }

         if (null != var25) {
            var8.ay(var0, var2, var3, var19, var12, var13, (iv)var25, 11 == var6 ? 256 : 0, var22, var24);
         }

         if (0 != var10.am * -973955889) {
            var9.aw(var2, var3, var12, var13, var10.as, (byte)-56);
         }

      }
   }

   static final int co(int var0, int var1, int var2) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      int var3 = (var0 / 4 << 10) + (var1 / 32 << 7) + var2 / 2;
      return var3;
   }

   public static void ax(int var0) {
      try {
         in.ab.af((byte)-36);
      } catch (RuntimeException var1) {
         throw db.an(var1, "cd.ax(" + ')');
      }
   }

   public static void aw(byte var0) {
      try {
         try {
            File var1 = new File(hd.az, "random.dat");
            int var3;
            if (var1.exists()) {
               if (var0 != 1) {
                  throw new IllegalStateException();
               }

               gc.ao = new sj(new sy(var1, "rw", 25L), 24, 0);
            } else {
               label56:
               for(int var2 = 0; var2 < dq.ar.length; ++var2) {
                  if (var0 != 1) {
                     return;
                  }

                  for(var3 = 0; var3 < fe.av.length; ++var3) {
                     if (var0 != 1) {
                        throw new IllegalStateException();
                     }

                     File var4 = new File(fe.av[var3] + dq.ar[var2] + File.separatorChar + "random.dat");
                     if (var4.exists()) {
                        if (var0 != 1) {
                           throw new IllegalStateException();
                        }

                        gc.ao = new sj(new sy(var4, "rw", 25L), 24, 0);
                        break label56;
                     }
                  }
               }
            }

            if (gc.ao == null) {
               if (var0 != 1) {
                  return;
               }

               RandomAccessFile var7 = new RandomAccessFile(var1, "rw");
               var3 = var7.read();
               var7.seek(0L);
               var7.write(var3);
               var7.seek(0L);
               var7.close();
               gc.ao = new sj(new sy(var1, "rw", 25L), 24, 0);
            }
         } catch (IOException var5) {
         }

      } catch (RuntimeException var6) {
         throw db.an(var6, "cd.aw(" + ')');
      }
   }
}
