import accessors.RSUnlitModel;

public class iz extends iv implements RSUnlitModel {
   static int[] bq;
   int[][] bb;
   static final int aw = -1;
   int ac = 0;
   int[] au;
   int[] ab;
   int[] aq;
   int al = 0;
   int[] at;
   static final int af = -3;
   int[] ay;
   int[] ad;
   byte[] ax;
   public short bz;
   byte[] ag;
   short[] ah;
   short[] av;
   byte ar = 0;
   int[][] ap;
   byte[] as;
   short[] aj;
   public short bo;
   int bs;
   static int[] bf;
   int[] ae;
   short[] az;
   int[][] by;
   int bj;
   int[][] bi;
   ir[] be;
   ib[] bx;
   byte[] ao;
   int am;
   byte[] ai;
   boolean bm = false;
   int bd;
   int bt;
   short[] ak;
   int bn;
   static final int an = -2;
   static int[] br = new int[10000];
   static int[] bg = new int[10000];
   static int bu = 0;
   ib[] bk;
   int[] aa;

   void ba(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      sg var4 = new sg(var1);
      sg var5 = new sg(var1);
      sg var6 = new sg(var1);
      sg var7 = new sg(var1);
      sg var8 = new sg(var1);
      var4.at = (var1.length - 18) * -1516355947;
      int var9 = var4.cl(-29487235);
      int var10 = var4.cl(-450454515);
      int var11 = var4.cm((byte)7);
      int var12 = var4.cm((byte)7);
      int var13 = var4.cm((byte)7);
      int var14 = var4.cm((byte)7);
      int var15 = var4.cm((byte)7);
      int var16 = var4.cm((byte)7);
      int var17 = var4.cl(-415884032);
      int var18 = var4.cl(-160687620);
      int var19 = var4.cl(-919220778);
      int var20 = var4.cl(508940533);
      int var21 = 0;
      byte var22 = (byte)var21;
      var21 += var9;
      int var23 = var21;
      var21 += var10;
      int var24 = var21;
      if (var13 == -1551595014) {
         var21 += var10;
      }

      int var25 = var21;
      if (var15 == 1) {
         var21 += var10;
      }

      int var26 = var21;
      if (var12 == 1) {
         var21 += var10;
      }

      int var27 = var21;
      if (var16 == 1) {
         var21 += var9;
      }

      int var28 = var21;
      if (var14 == 1) {
         var21 += var10;
      }

      int var29 = var21;
      var21 += var20;
      int var30 = var21;
      var21 += var10 * 2;
      int var31 = var21;
      var21 += var11 * 6;
      int var32 = var21;
      var21 += var17;
      int var33 = var21;
      var21 += var18;
      int var10000 = var21 + var19;
      this.ac = var9;
      this.al = var10;
      this.am = var11;
      this.au = new int[var9];
      this.ab = new int[var9];
      this.aq = new int[var9];
      this.at = new int[var10];
      this.aa = new int[var10];
      this.ay = new int[var10];
      if (var11 > 0) {
         this.as = new byte[var11];
         this.aj = new short[var11];
         this.ak = new short[var11];
         this.az = new short[var11];
      }

      if (var16 == 1) {
         this.ad = new int[var9];
      }

      if (var12 == 1) {
         this.ao = new byte[var10];
         this.ag = new byte[var10];
         this.av = new short[var10];
      }

      if (var13 == 421130645) {
         this.ax = new byte[var10];
      } else {
         this.ar = (byte)var13;
      }

      if (var14 == 1) {
         this.ai = new byte[var10];
      }

      if (var15 == 1) {
         this.ae = new int[var10];
      }

      this.ah = new short[var10];
      var4.at = var22 * 1912423264;
      var5.at = var32 * -1516355947;
      var6.at = var33 * -1516355947;
      var7.at = var21 * -1516355947;
      var8.at = var27 * -1516355947;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.cm((byte)7);
         var40 = 0;
         if ((var39 & 1) != 0) {
            var40 = var5.cp(1653466270);
         }

         var41 = 0;
         if ((var39 & 2) != 0) {
            var41 = var6.cp(1403924388);
         }

         var42 = 0;
         if ((var39 & 4) != 0) {
            var42 = var7.cp(1688085996);
         }

         this.au[var38] = var35 + var40;
         this.ab[var38] = var36 + var41;
         this.aq[var38] = var37 + var42;
         var35 = this.au[var38];
         var36 = this.ab[var38];
         var37 = this.aq[var38];
         if (var16 == 1) {
            this.ad[var38] = var8.cm((byte)7);
         }
      }

      var4.at = var30 * -1198512140;
      var5.at = var26 * 238977688;
      var6.at = var24 * -1516355947;
      var7.at = var28 * -1535341201;
      var8.at = var25 * -310818147;

      for(var38 = 0; var38 < var10; ++var38) {
         this.ah[var38] = (short)var4.cl(-1449086094);
         if (var12 == 1) {
            var39 = var5.cm((byte)7);
            if ((var39 & 1) == 1) {
               this.ao[var38] = 1;
               var2 = true;
            } else {
               this.ao[var38] = 0;
            }

            if ((var39 & 2) == 2) {
               this.ag[var38] = (byte)(var39 >> 2);
               this.av[var38] = this.ah[var38];
               this.ah[var38] = 127;
               if (this.av[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.ag[var38] = -1;
               this.av[var38] = -1;
            }
         }

         if (var13 == 2062803247) {
            this.ax[var38] = var6.cf(435772489);
         }

         if (var14 == 1) {
            this.ai[var38] = var7.cf(435772489);
         }

         if (var15 == 1) {
            this.ae[var38] = var8.cm((byte)7);
         }
      }

      var4.at = var29 * -1477591197;
      var5.at = var23 * -1516355947;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.cm((byte)7);
         if (var43 == 1) {
            var38 = var4.cp(1833099687) + var41;
            var39 = var4.cp(1773026832) + var38;
            var40 = var4.cp(1385219841) + var39;
            var41 = var40;
            this.at[var42] = var38;
            this.aa[var42] = var39;
            this.ay[var42] = var40;
         }

         if (var43 == 2) {
            var39 = var40;
            var40 = var4.cp(1316868143) + var41;
            var41 = var40;
            this.at[var42] = var38;
            this.aa[var42] = var39;
            this.ay[var42] = var40;
         }

         if (var43 == 3) {
            var38 = var40;
            var40 = var4.cp(1926624066) + var41;
            var41 = var40;
            this.at[var42] = var38;
            this.aa[var42] = var39;
            this.ay[var42] = var40;
         }

         if (var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.cp(1497712429) + var41;
            var41 = var40;
            this.at[var42] = var38;
            this.aa[var42] = var44;
            this.ay[var42] = var40;
         }
      }

      var4.at = var31 * 327654495;

      for(var42 = 0; var42 < var11; ++var42) {
         this.as[var42] = 0;
         this.aj[var42] = (short)var4.cl(-1431844839);
         this.ak[var42] = (short)var4.cl(641387189);
         this.az[var42] = (short)var4.cl(815260492);
      }

      if (this.ag != null) {
         boolean var45 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.ag[var43] & 255;
            if (var44 != -994245861) {
               if ((this.aj[var44] & '\uffff') == this.at[var43] && (this.ak[var44] & -88633356) == this.aa[var43] && (this.az[var44] & 1116148083) == this.ay[var43]) {
                  this.ag[var43] = -1;
               } else {
                  var45 = true;
               }
            }
         }

         if (!var45) {
            this.ag = null;
         }
      }

      if (!var3) {
         this.av = null;
      }

      if (!var2) {
         this.ao = null;
      }

   }

   void bt(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      sg var4 = new sg(var1);
      sg var5 = new sg(var1);
      sg var6 = new sg(var1);
      sg var7 = new sg(var1);
      sg var8 = new sg(var1);
      var4.at = (var1.length - 23) * -1516355947;
      int var9 = var4.cl(-1698514121);
      int var10 = var4.cl(-1301931763);
      int var11 = var4.cm((byte)7);
      int var12 = var4.cm((byte)7);
      int var13 = var4.cm((byte)7);
      int var14 = var4.cm((byte)7);
      int var15 = var4.cm((byte)7);
      int var16 = var4.cm((byte)7);
      int var17 = var4.cm((byte)7);
      int var18 = var4.cl(-1340532364);
      int var19 = var4.cl(351486620);
      int var20 = var4.cl(-1244218789);
      int var21 = var4.cl(-545310067);
      int var22 = var4.cl(-481973716);
      int var23 = 0;
      byte var24 = (byte)var23;
      var23 += var9;
      int var25 = var23;
      var23 += var10;
      int var26 = var23;
      if (var13 == 255) {
         var23 += var10;
      }

      int var27 = var23;
      if (var15 == 1) {
         var23 += var10;
      }

      int var28 = var23;
      if (var12 == 1) {
         var23 += var10;
      }

      int var29 = var23;
      var23 += var22;
      int var30 = var23;
      if (var14 == 1) {
         var23 += var10;
      }

      int var31 = var23;
      var23 += var21;
      int var32 = var23;
      var23 += var10 * 2;
      int var33 = var23;
      var23 += var11 * 6;
      int var34 = var23;
      var23 += var18;
      int var35 = var23;
      var23 += var19;
      int var10000 = var23 + var20;
      this.ac = var9;
      this.al = var10;
      this.am = var11;
      this.au = new int[var9];
      this.ab = new int[var9];
      this.aq = new int[var9];
      this.at = new int[var10];
      this.aa = new int[var10];
      this.ay = new int[var10];
      if (var11 > 0) {
         this.as = new byte[var11];
         this.aj = new short[var11];
         this.ak = new short[var11];
         this.az = new short[var11];
      }

      if (var16 == 1) {
         this.ad = new int[var9];
      }

      if (var12 == 1) {
         this.ao = new byte[var10];
         this.ag = new byte[var10];
         this.av = new short[var10];
      }

      if (var13 == 255) {
         this.ax = new byte[var10];
      } else {
         this.ar = (byte)var13;
      }

      if (var14 == 1) {
         this.ai = new byte[var10];
      }

      if (var15 == 1) {
         this.ae = new int[var10];
      }

      if (var17 == 1) {
         this.bb = new int[var9][];
         this.bi = new int[var9][];
      }

      this.ah = new short[var10];
      var4.at = var24 * -1516355947;
      var5.at = var34 * -1516355947;
      var6.at = var35 * -1516355947;
      var7.at = var23 * -1516355947;
      var8.at = var29 * -1516355947;
      int var37 = 0;
      int var38 = 0;
      int var39 = 0;

      int var40;
      int var41;
      int var42;
      int var43;
      int var44;
      for(var40 = 0; var40 < var9; ++var40) {
         var41 = var4.cm((byte)7);
         var42 = 0;
         if ((var41 & 1) != 0) {
            var42 = var5.cp(1291675075);
         }

         var43 = 0;
         if ((var41 & 2) != 0) {
            var43 = var6.cp(1868392237);
         }

         var44 = 0;
         if ((var41 & 4) != 0) {
            var44 = var7.cp(2048793374);
         }

         this.au[var40] = var37 + var42;
         this.ab[var40] = var38 + var43;
         this.aq[var40] = var39 + var44;
         var37 = this.au[var40];
         var38 = this.ab[var40];
         var39 = this.aq[var40];
         if (var16 == 1) {
            this.ad[var40] = var8.cm((byte)7);
         }
      }

      if (var17 == 1) {
         for(var40 = 0; var40 < var9; ++var40) {
            var41 = var8.cm((byte)7);
            this.bb[var40] = new int[var41];
            this.bi[var40] = new int[var41];

            for(var42 = 0; var42 < var41; ++var42) {
               this.bb[var40][var42] = var8.cm((byte)7);
               this.bi[var40][var42] = var8.cm((byte)7);
            }
         }
      }

      var4.at = var32 * -1516355947;
      var5.at = var28 * -1516355947;
      var6.at = var26 * -1516355947;
      var7.at = var30 * -1516355947;
      var8.at = var27 * -1516355947;

      for(var40 = 0; var40 < var10; ++var40) {
         this.ah[var40] = (short)var4.cl(-581184601);
         if (var12 == 1) {
            var41 = var5.cm((byte)7);
            if ((var41 & 1) == 1) {
               this.ao[var40] = 1;
               var2 = true;
            } else {
               this.ao[var40] = 0;
            }

            if ((var41 & 2) == 2) {
               this.ag[var40] = (byte)(var41 >> 2);
               this.av[var40] = this.ah[var40];
               this.ah[var40] = 127;
               if (this.av[var40] != -1) {
                  var3 = true;
               }
            } else {
               this.ag[var40] = -1;
               this.av[var40] = -1;
            }
         }

         if (var13 == 255) {
            this.ax[var40] = var6.cf(435772489);
         }

         if (var14 == 1) {
            this.ai[var40] = var7.cf(435772489);
         }

         if (var15 == 1) {
            this.ae[var40] = var8.cm((byte)7);
         }
      }

      var4.at = var31 * -1516355947;
      var5.at = var25 * -1516355947;
      var40 = 0;
      var41 = 0;
      var42 = 0;
      var43 = 0;

      int var45;
      int var46;
      for(var44 = 0; var44 < var10; ++var44) {
         var45 = var5.cm((byte)7);
         if (var45 == 1) {
            var40 = var4.cp(1766463891) + var43;
            var41 = var4.cp(1598357626) + var40;
            var42 = var4.cp(1521100773) + var41;
            var43 = var42;
            this.at[var44] = var40;
            this.aa[var44] = var41;
            this.ay[var44] = var42;
         }

         if (var45 == 2) {
            var41 = var42;
            var42 = var4.cp(2035142440) + var43;
            var43 = var42;
            this.at[var44] = var40;
            this.aa[var44] = var41;
            this.ay[var44] = var42;
         }

         if (var45 == 3) {
            var40 = var42;
            var42 = var4.cp(1210479953) + var43;
            var43 = var42;
            this.at[var44] = var40;
            this.aa[var44] = var41;
            this.ay[var44] = var42;
         }

         if (var45 == 4) {
            var46 = var40;
            var40 = var41;
            var41 = var46;
            var42 = var4.cp(1837199448) + var43;
            var43 = var42;
            this.at[var44] = var40;
            this.aa[var44] = var46;
            this.ay[var44] = var42;
         }
      }

      var4.at = var33 * -1516355947;

      for(var44 = 0; var44 < var11; ++var44) {
         this.as[var44] = 0;
         this.aj[var44] = (short)var4.cl(583872966);
         this.ak[var44] = (short)var4.cl(-432944193);
         this.az[var44] = (short)var4.cl(774967773);
      }

      if (this.ag != null) {
         boolean var47 = false;

         for(var45 = 0; var45 < var10; ++var45) {
            var46 = this.ag[var45] & 255;
            if (var46 != 255) {
               if ((this.aj[var46] & '\uffff') == this.at[var45] && (this.ak[var46] & '\uffff') == this.aa[var45] && (this.az[var46] & '\uffff') == this.ay[var45]) {
                  this.ag[var45] = -1;
               } else {
                  var47 = true;
               }
            }
         }

         if (!var47) {
            this.ag = null;
         }
      }

      if (!var3) {
         this.av = null;
      }

      if (!var2) {
         this.ao = null;
      }

   }

   iz(byte[] var1) {
      sg var2 = new sg(10);
      var2.bf(-2, (byte)-9);
      if (var1[var1.length - 1] == -3 && var1[var1.length - 2] == -1) {
         this.aw(var1);
      } else if (var1[var1.length - 1] == -2 && var1[var1.length - 2] == -1) {
         this.ac(var1);
      } else if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
         this.at(var1);
      } else {
         this.aa(var1);
      }

   }

   void aw(byte[] var1) {
      sg var2 = new sg(var1);
      sg var3 = new sg(var1);
      sg var4 = new sg(var1);
      sg var5 = new sg(var1);
      sg var6 = new sg(var1);
      sg var7 = new sg(var1);
      sg var8 = new sg(var1);
      var2.at = (var1.length - 26) * -1516355947;
      int var9 = var2.cl(-919984643);
      int var10 = var2.cl(585361335);
      int var11 = var2.cm((byte)7);
      int var12 = var2.cm((byte)7);
      int var13 = var2.cm((byte)7);
      int var14 = var2.cm((byte)7);
      int var15 = var2.cm((byte)7);
      int var16 = var2.cm((byte)7);
      int var17 = var2.cm((byte)7);
      int var18 = var2.cm((byte)7);
      int var19 = var2.cl(-259676);
      int var20 = var2.cl(-537577706);
      int var21 = var2.cl(-1719988220);
      int var22 = var2.cl(-964841651);
      int var23 = var2.cl(329559683);
      int var24 = var2.cl(-7529975);
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28;
      if (var11 > 0) {
         this.as = new byte[var11];
         var2.at = 0;

         for(var28 = 0; var28 < var11; ++var28) {
            byte var29 = this.as[var28] = var2.cf(435772489);
            if (var29 == 0) {
               ++var25;
            }

            if (var29 >= 1 && var29 <= 3) {
               ++var26;
            }

            if (var29 == 2) {
               ++var27;
            }
         }
      }

      var28 = var11 + var9;
      int var30 = var28;
      if (var12 == 1) {
         var28 += var10;
      }

      int var31 = var28;
      var28 += var10;
      int var32 = var28;
      if (var13 == 255) {
         var28 += var10;
      }

      int var33 = var28;
      if (var15 == 1) {
         var28 += var10;
      }

      int var34 = var28;
      var28 += var24;
      int var35 = var28;
      if (var14 == 1) {
         var28 += var10;
      }

      int var36 = var28;
      var28 += var22;
      int var37 = var28;
      if (var16 == 1) {
         var28 += var10 * 2;
      }

      int var38 = var28;
      var28 += var23;
      int var39 = var28;
      var28 += var10 * 2;
      int var40 = var28;
      var28 += var19;
      int var41 = var28;
      var28 += var20;
      int var42 = var28;
      var28 += var21;
      int var43 = var28;
      var28 += var25 * 6;
      int var44 = var28;
      var28 += var26 * 6;
      int var45 = var28;
      var28 += var26 * 6;
      int var46 = var28;
      var28 += var26 * 2;
      int var47 = var28;
      var28 += var26;
      int var48 = var28;
      var28 += var26 * 2 + var27 * 2;
      this.ac = var9;
      this.al = var10;
      this.am = var11;
      this.au = new int[var9];
      this.ab = new int[var9];
      this.aq = new int[var9];
      this.at = new int[var10];
      this.aa = new int[var10];
      this.ay = new int[var10];
      if (var17 == 1) {
         this.ad = new int[var9];
      }

      if (var12 == 1) {
         this.ao = new byte[var10];
      }

      if (var13 == 255) {
         this.ax = new byte[var10];
      } else {
         this.ar = (byte)var13;
      }

      if (var14 == 1) {
         this.ai = new byte[var10];
      }

      if (var15 == 1) {
         this.ae = new int[var10];
      }

      if (var16 == 1) {
         this.av = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.ag = new byte[var10];
      }

      if (var18 == 1) {
         this.bb = new int[var9][];
         this.bi = new int[var9][];
      }

      this.ah = new short[var10];
      if (var11 > 0) {
         this.aj = new short[var11];
         this.ak = new short[var11];
         this.az = new short[var11];
      }

      var2.at = var11 * -1516355947;
      var3.at = var40 * -1516355947;
      var4.at = var41 * -1516355947;
      var5.at = var42 * -1516355947;
      var6.at = var34 * -1516355947;
      int var50 = 0;
      int var51 = 0;
      int var52 = 0;

      int var53;
      int var54;
      int var55;
      int var56;
      int var57;
      for(var53 = 0; var53 < var9; ++var53) {
         var54 = var2.cm((byte)7);
         var55 = 0;
         if ((var54 & 1) != 0) {
            var55 = var3.cp(1984773887);
         }

         var56 = 0;
         if ((var54 & 2) != 0) {
            var56 = var4.cp(1891417419);
         }

         var57 = 0;
         if ((var54 & 4) != 0) {
            var57 = var5.cp(1158704054);
         }

         this.au[var53] = var50 + var55;
         this.ab[var53] = var51 + var56;
         this.aq[var53] = var52 + var57;
         var50 = this.au[var53];
         var51 = this.ab[var53];
         var52 = this.aq[var53];
         if (var17 == 1) {
            this.ad[var53] = var6.cm((byte)7);
         }
      }

      if (var18 == 1) {
         for(var53 = 0; var53 < var9; ++var53) {
            var54 = var6.cm((byte)7);
            this.bb[var53] = new int[var54];
            this.bi[var53] = new int[var54];

            for(var55 = 0; var55 < var54; ++var55) {
               this.bb[var53][var55] = var6.cm((byte)7);
               this.bi[var53][var55] = var6.cm((byte)7);
            }
         }
      }

      var2.at = var39 * -1516355947;
      var3.at = var30 * -1516355947;
      var4.at = var32 * -1516355947;
      var5.at = var35 * -1516355947;
      var6.at = var33 * -1516355947;
      var7.at = var37 * -1516355947;
      var8.at = var38 * -1516355947;

      for(var53 = 0; var53 < var10; ++var53) {
         this.ah[var53] = (short)var2.cl(-1905684193);
         if (var12 == 1) {
            this.ao[var53] = var3.cf(435772489);
         }

         if (var13 == 255) {
            this.ax[var53] = var4.cf(435772489);
         }

         if (var14 == 1) {
            this.ai[var53] = var5.cf(435772489);
         }

         if (var15 == 1) {
            this.ae[var53] = var6.cm((byte)7);
         }

         if (var16 == 1) {
            this.av[var53] = (short)(var7.cl(-1878345076) - 1);
         }

         if (this.ag != null && this.av[var53] != -1) {
            this.ag[var53] = (byte)(var8.cm((byte)7) - 1);
         }
      }

      var2.at = var36 * -1516355947;
      var3.at = var31 * -1516355947;
      var53 = 0;
      var54 = 0;
      var55 = 0;
      var56 = 0;

      int var58;
      for(var57 = 0; var57 < var10; ++var57) {
         var58 = var3.cm((byte)7);
         if (var58 == 1) {
            var53 = var2.cp(1184502579) + var56;
            var54 = var2.cp(1486728131) + var53;
            var55 = var2.cp(2106854967) + var54;
            var56 = var55;
            this.at[var57] = var53;
            this.aa[var57] = var54;
            this.ay[var57] = var55;
         }

         if (var58 == 2) {
            var54 = var55;
            var55 = var2.cp(1334906078) + var56;
            var56 = var55;
            this.at[var57] = var53;
            this.aa[var57] = var54;
            this.ay[var57] = var55;
         }

         if (var58 == 3) {
            var53 = var55;
            var55 = var2.cp(1302283287) + var56;
            var56 = var55;
            this.at[var57] = var53;
            this.aa[var57] = var54;
            this.ay[var57] = var55;
         }

         if (var58 == 4) {
            int var59 = var53;
            var53 = var54;
            var54 = var59;
            var55 = var2.cp(1540794586) + var56;
            var56 = var55;
            this.at[var57] = var53;
            this.aa[var57] = var59;
            this.ay[var57] = var55;
         }
      }

      var2.at = var43 * -1516355947;
      var3.at = var44 * -1516355947;
      var4.at = var45 * -1516355947;
      var5.at = var46 * -1516355947;
      var6.at = var47 * -1516355947;
      var7.at = var48 * -1516355947;

      for(var57 = 0; var57 < var11; ++var57) {
         var58 = this.as[var57] & 255;
         if (var58 == 0) {
            this.aj[var57] = (short)var2.cl(-879847774);
            this.ak[var57] = (short)var2.cl(-20147323);
            this.az[var57] = (short)var2.cl(-1266812844);
         }
      }

      var2.at = var28 * -1516355947;
      var57 = var2.cm((byte)7);
      if (var57 != 0) {
         new jo();
         var2.cl(-1877779192);
         var2.cl(-1352244344);
         var2.cl(-1928849213);
         var2.cx(-985212241);
      }

   }

   public void cx(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.ac; ++var4) {
         int[] var10000 = this.au;
         var10000[var4] += var1;
         var10000 = this.ab;
         var10000[var4] += var2;
         var10000 = this.aq;
         var10000[var4] += var3;
      }

      this.ae();
   }

   void at(byte[] var1) {
      sg var2 = new sg(var1);
      sg var3 = new sg(var1);
      sg var4 = new sg(var1);
      sg var5 = new sg(var1);
      sg var6 = new sg(var1);
      sg var7 = new sg(var1);
      sg var8 = new sg(var1);
      var2.at = (var1.length - 23) * -1516355947;
      int var9 = var2.cl(-1263250796);
      int var10 = var2.cl(-2002030055);
      int var11 = var2.cm((byte)7);
      int var12 = var2.cm((byte)7);
      int var13 = var2.cm((byte)7);
      int var14 = var2.cm((byte)7);
      int var15 = var2.cm((byte)7);
      int var16 = var2.cm((byte)7);
      int var17 = var2.cm((byte)7);
      int var18 = var2.cl(876883841);
      int var19 = var2.cl(-435176740);
      int var20 = var2.cl(-1431584774);
      int var21 = var2.cl(-1021983654);
      int var22 = var2.cl(-769856271);
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if (var11 > 0) {
         this.as = new byte[var11];
         var2.at = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.as[var26] = var2.cf(435772489);
            if (var27 == 0) {
               ++var23;
            }

            if (var27 >= 1 && var27 <= 3) {
               ++var24;
            }

            if (var27 == 2) {
               ++var25;
            }
         }
      }

      var26 = var11 + var9;
      int var28 = var26;
      if (var12 == 1) {
         var26 += var10;
      }

      int var29 = var26;
      var26 += var10;
      int var30 = var26;
      if (var13 == 255) {
         var26 += var10;
      }

      int var31 = var26;
      if (var15 == 1) {
         var26 += var10;
      }

      int var32 = var26;
      if (var17 == 1) {
         var26 += var9;
      }

      int var33 = var26;
      if (var14 == 1) {
         var26 += var10;
      }

      int var34 = var26;
      var26 += var21;
      int var35 = var26;
      if (var16 == 1) {
         var26 += var10 * 2;
      }

      int var36 = var26;
      var26 += var22;
      int var37 = var26;
      var26 += var10 * 2;
      int var38 = var26;
      var26 += var18;
      int var39 = var26;
      var26 += var19;
      int var40 = var26;
      var26 += var20;
      int var41 = var26;
      var26 += var23 * 6;
      int var42 = var26;
      var26 += var24 * 6;
      int var43 = var26;
      var26 += var24 * 6;
      int var44 = var26;
      var26 += var24 * 2;
      int var45 = var26;
      var26 += var24;
      int var46 = var26;
      var26 += var24 * 2 + var25 * 2;
      this.ac = var9;
      this.al = var10;
      this.am = var11;
      this.au = new int[var9];
      this.ab = new int[var9];
      this.aq = new int[var9];
      this.at = new int[var10];
      this.aa = new int[var10];
      this.ay = new int[var10];
      if (var17 == 1) {
         this.ad = new int[var9];
      }

      if (var12 == 1) {
         this.ao = new byte[var10];
      }

      if (var13 == 255) {
         this.ax = new byte[var10];
      } else {
         this.ar = (byte)var13;
      }

      if (var14 == 1) {
         this.ai = new byte[var10];
      }

      if (var15 == 1) {
         this.ae = new int[var10];
      }

      if (var16 == 1) {
         this.av = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.ag = new byte[var10];
      }

      this.ah = new short[var10];
      if (var11 > 0) {
         this.aj = new short[var11];
         this.ak = new short[var11];
         this.az = new short[var11];
      }

      var2.at = var11 * -1516355947;
      var3.at = var38 * -1516355947;
      var4.at = var39 * -1516355947;
      var5.at = var40 * -1516355947;
      var6.at = var32 * -1516355947;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      int var51;
      int var52;
      int var53;
      int var54;
      int var55;
      for(var51 = 0; var51 < var9; ++var51) {
         var52 = var2.cm((byte)7);
         var53 = 0;
         if ((var52 & 1) != 0) {
            var53 = var3.cp(1971231296);
         }

         var54 = 0;
         if ((var52 & 2) != 0) {
            var54 = var4.cp(1612360719);
         }

         var55 = 0;
         if ((var52 & 4) != 0) {
            var55 = var5.cp(1233827137);
         }

         this.au[var51] = var48 + var53;
         this.ab[var51] = var49 + var54;
         this.aq[var51] = var50 + var55;
         var48 = this.au[var51];
         var49 = this.ab[var51];
         var50 = this.aq[var51];
         if (var17 == 1) {
            this.ad[var51] = var6.cm((byte)7);
         }
      }

      var2.at = var37 * -1516355947;
      var3.at = var28 * -1516355947;
      var4.at = var30 * -1516355947;
      var5.at = var33 * -1516355947;
      var6.at = var31 * -1516355947;
      var7.at = var35 * -1516355947;
      var8.at = var36 * -1516355947;

      for(var51 = 0; var51 < var10; ++var51) {
         this.ah[var51] = (short)var2.cl(818831461);
         if (var12 == 1) {
            this.ao[var51] = var3.cf(435772489);
         }

         if (var13 == 255) {
            this.ax[var51] = var4.cf(435772489);
         }

         if (var14 == 1) {
            this.ai[var51] = var5.cf(435772489);
         }

         if (var15 == 1) {
            this.ae[var51] = var6.cm((byte)7);
         }

         if (var16 == 1) {
            this.av[var51] = (short)(var7.cl(-512750476) - 1);
         }

         if (this.ag != null && this.av[var51] != -1) {
            this.ag[var51] = (byte)(var8.cm((byte)7) - 1);
         }
      }

      var2.at = var34 * -1516355947;
      var3.at = var29 * -1516355947;
      var51 = 0;
      var52 = 0;
      var53 = 0;
      var54 = 0;

      int var56;
      for(var55 = 0; var55 < var10; ++var55) {
         var56 = var3.cm((byte)7);
         if (var56 == 1) {
            var51 = var2.cp(2046431705) + var54;
            var52 = var2.cp(2108210038) + var51;
            var53 = var2.cp(1902436320) + var52;
            var54 = var53;
            this.at[var55] = var51;
            this.aa[var55] = var52;
            this.ay[var55] = var53;
         }

         if (var56 == 2) {
            var52 = var53;
            var53 = var2.cp(1971941001) + var54;
            var54 = var53;
            this.at[var55] = var51;
            this.aa[var55] = var52;
            this.ay[var55] = var53;
         }

         if (var56 == 3) {
            var51 = var53;
            var53 = var2.cp(1721982940) + var54;
            var54 = var53;
            this.at[var55] = var51;
            this.aa[var55] = var52;
            this.ay[var55] = var53;
         }

         if (var56 == 4) {
            int var57 = var51;
            var51 = var52;
            var52 = var57;
            var53 = var2.cp(2094378484) + var54;
            var54 = var53;
            this.at[var55] = var51;
            this.aa[var55] = var57;
            this.ay[var55] = var53;
         }
      }

      var2.at = var41 * -1516355947;
      var3.at = var42 * -1516355947;
      var4.at = var43 * -1516355947;
      var5.at = var44 * -1516355947;
      var6.at = var45 * -1516355947;
      var7.at = var46 * -1516355947;

      for(var55 = 0; var55 < var11; ++var55) {
         var56 = this.as[var55] & 255;
         if (var56 == 0) {
            this.aj[var55] = (short)var2.cl(561169310);
            this.ak[var55] = (short)var2.cl(68763571);
            this.az[var55] = (short)var2.cl(103185776);
         }
      }

      var2.at = var26 * -1516355947;
      var55 = var2.cm((byte)7);
      if (var55 != 0) {
         new jo();
         var2.cl(-1770689374);
         var2.cl(-1095546204);
         var2.cl(806373583);
         var2.cx(-1881895983);
      }

   }

   void aa(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      sg var4 = new sg(var1);
      sg var5 = new sg(var1);
      sg var6 = new sg(var1);
      sg var7 = new sg(var1);
      sg var8 = new sg(var1);
      var4.at = (var1.length - 18) * -1516355947;
      int var9 = var4.cl(549285250);
      int var10 = var4.cl(-215634139);
      int var11 = var4.cm((byte)7);
      int var12 = var4.cm((byte)7);
      int var13 = var4.cm((byte)7);
      int var14 = var4.cm((byte)7);
      int var15 = var4.cm((byte)7);
      int var16 = var4.cm((byte)7);
      int var17 = var4.cl(769348209);
      int var18 = var4.cl(57348879);
      int var19 = var4.cl(-353334539);
      int var20 = var4.cl(240591042);
      int var21 = 0;
      byte var22 = (byte)var21;
      var21 += var9;
      int var23 = var21;
      var21 += var10;
      int var24 = var21;
      if (var13 == 255) {
         var21 += var10;
      }

      int var25 = var21;
      if (var15 == 1) {
         var21 += var10;
      }

      int var26 = var21;
      if (var12 == 1) {
         var21 += var10;
      }

      int var27 = var21;
      if (var16 == 1) {
         var21 += var9;
      }

      int var28 = var21;
      if (var14 == 1) {
         var21 += var10;
      }

      int var29 = var21;
      var21 += var20;
      int var30 = var21;
      var21 += var10 * 2;
      int var31 = var21;
      var21 += var11 * 6;
      int var32 = var21;
      var21 += var17;
      int var33 = var21;
      var21 += var18;
      int var10000 = var21 + var19;
      this.ac = var9;
      this.al = var10;
      this.am = var11;
      this.au = new int[var9];
      this.ab = new int[var9];
      this.aq = new int[var9];
      this.at = new int[var10];
      this.aa = new int[var10];
      this.ay = new int[var10];
      if (var11 > 0) {
         this.as = new byte[var11];
         this.aj = new short[var11];
         this.ak = new short[var11];
         this.az = new short[var11];
      }

      if (var16 == 1) {
         this.ad = new int[var9];
      }

      if (var12 == 1) {
         this.ao = new byte[var10];
         this.ag = new byte[var10];
         this.av = new short[var10];
      }

      if (var13 == 255) {
         this.ax = new byte[var10];
      } else {
         this.ar = (byte)var13;
      }

      if (var14 == 1) {
         this.ai = new byte[var10];
      }

      if (var15 == 1) {
         this.ae = new int[var10];
      }

      this.ah = new short[var10];
      var4.at = var22 * -1516355947;
      var5.at = var32 * -1516355947;
      var6.at = var33 * -1516355947;
      var7.at = var21 * -1516355947;
      var8.at = var27 * -1516355947;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.cm((byte)7);
         var40 = 0;
         if ((var39 & 1) != 0) {
            var40 = var5.cp(1752919491);
         }

         var41 = 0;
         if ((var39 & 2) != 0) {
            var41 = var6.cp(1676914976);
         }

         var42 = 0;
         if ((var39 & 4) != 0) {
            var42 = var7.cp(1171264904);
         }

         this.au[var38] = var35 + var40;
         this.ab[var38] = var36 + var41;
         this.aq[var38] = var37 + var42;
         var35 = this.au[var38];
         var36 = this.ab[var38];
         var37 = this.aq[var38];
         if (var16 == 1) {
            this.ad[var38] = var8.cm((byte)7);
         }
      }

      var4.at = var30 * -1516355947;
      var5.at = var26 * -1516355947;
      var6.at = var24 * -1516355947;
      var7.at = var28 * -1516355947;
      var8.at = var25 * -1516355947;

      for(var38 = 0; var38 < var10; ++var38) {
         this.ah[var38] = (short)var4.cl(655994587);
         if (var12 == 1) {
            var39 = var5.cm((byte)7);
            if ((var39 & 1) == 1) {
               this.ao[var38] = 1;
               var2 = true;
            } else {
               this.ao[var38] = 0;
            }

            if ((var39 & 2) == 2) {
               this.ag[var38] = (byte)(var39 >> 2);
               this.av[var38] = this.ah[var38];
               this.ah[var38] = 127;
               if (this.av[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.ag[var38] = -1;
               this.av[var38] = -1;
            }
         }

         if (var13 == 255) {
            this.ax[var38] = var6.cf(435772489);
         }

         if (var14 == 1) {
            this.ai[var38] = var7.cf(435772489);
         }

         if (var15 == 1) {
            this.ae[var38] = var8.cm((byte)7);
         }
      }

      var4.at = var29 * -1516355947;
      var5.at = var23 * -1516355947;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.cm((byte)7);
         if (var43 == 1) {
            var38 = var4.cp(1101044284) + var41;
            var39 = var4.cp(1516522278) + var38;
            var40 = var4.cp(1940828348) + var39;
            var41 = var40;
            this.at[var42] = var38;
            this.aa[var42] = var39;
            this.ay[var42] = var40;
         }

         if (var43 == 2) {
            var39 = var40;
            var40 = var4.cp(2113208017) + var41;
            var41 = var40;
            this.at[var42] = var38;
            this.aa[var42] = var39;
            this.ay[var42] = var40;
         }

         if (var43 == 3) {
            var38 = var40;
            var40 = var4.cp(1462829470) + var41;
            var41 = var40;
            this.at[var42] = var38;
            this.aa[var42] = var39;
            this.ay[var42] = var40;
         }

         if (var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.cp(1413087679) + var41;
            var41 = var40;
            this.at[var42] = var38;
            this.aa[var42] = var44;
            this.ay[var42] = var40;
         }
      }

      var4.at = var31 * -1516355947;

      for(var42 = 0; var42 < var11; ++var42) {
         this.as[var42] = 0;
         this.aj[var42] = (short)var4.cl(-999882445);
         this.ak[var42] = (short)var4.cl(787038244);
         this.az[var42] = (short)var4.cl(704136559);
      }

      if (this.ag != null) {
         boolean var45 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.ag[var43] & 255;
            if (var44 != 255) {
               if ((this.aj[var44] & '\uffff') == this.at[var43] && (this.ak[var44] & '\uffff') == this.aa[var43] && (this.az[var44] & '\uffff') == this.ay[var43]) {
                  this.ag[var43] = -1;
               } else {
                  var45 = true;
               }
            }
         }

         if (!var45) {
            this.ag = null;
         }
      }

      if (!var3) {
         this.av = null;
      }

      if (!var2) {
         this.ao = null;
      }

   }

   public iz(iz[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      this.ac = 0;
      this.al = 0;
      this.am = 0;
      this.ar = -1;

      int var10;
      iz var11;
      for(var10 = 0; var10 < var2; ++var10) {
         var11 = var1[var10];
         if (var11 != null) {
            this.ac += var11.ac;
            this.al += var11.al;
            this.am += var11.am;
            if (var11.ax != null) {
               var4 = true;
            } else {
               if (this.ar == -1) {
                  this.ar = var11.ar;
               }

               if (this.ar != var11.ar) {
                  var4 = true;
               }
            }

            var3 |= var11.ao != null;
            var5 |= var11.ai != null;
            var6 |= var11.ae != null;
            var7 |= var11.av != null;
            var8 |= var11.ag != null;
            var9 |= var11.bb != null;
         }
      }

      this.au = new int[this.ac];
      this.ab = new int[this.ac];
      this.aq = new int[this.ac];
      this.ad = new int[this.ac];
      this.at = new int[this.al];
      this.aa = new int[this.al];
      this.ay = new int[this.al];
      if (var3) {
         this.ao = new byte[this.al];
      }

      if (var4) {
         this.ax = new byte[this.al];
      }

      if (var5) {
         this.ai = new byte[this.al];
      }

      if (var6) {
         this.ae = new int[this.al];
      }

      if (var7) {
         this.av = new short[this.al];
      }

      if (var8) {
         this.ag = new byte[this.al];
      }

      if (var9) {
         this.bb = new int[this.ac][];
         this.bi = new int[this.ac][];
      }

      this.ah = new short[this.al];
      if (this.am > 0) {
         this.as = new byte[this.am];
         this.aj = new short[this.am];
         this.ak = new short[this.am];
         this.az = new short[this.am];
      }

      this.ac = 0;
      this.al = 0;
      this.am = 0;

      for(var10 = 0; var10 < var2; ++var10) {
         var11 = var1[var10];
         if (var11 != null) {
            int var12;
            for(var12 = 0; var12 < var11.al; ++var12) {
               if (var3 && var11.ao != null) {
                  this.ao[this.al] = var11.ao[var12];
               }

               if (var4) {
                  if (var11.ax != null) {
                     this.ax[this.al] = var11.ax[var12];
                  } else {
                     this.ax[this.al] = var11.ar;
                  }
               }

               if (var5 && var11.ai != null) {
                  this.ai[this.al] = var11.ai[var12];
               }

               if (var6 && var11.ae != null) {
                  this.ae[this.al] = var11.ae[var12];
               }

               if (var7) {
                  if (var11.av != null) {
                     this.av[this.al] = var11.av[var12];
                  } else {
                     this.av[this.al] = -1;
                  }
               }

               if (var8) {
                  if (var11.ag != null && var11.ag[var12] != -1) {
                     this.ag[this.al] = (byte)(var11.ag[var12] + this.am);
                  } else {
                     this.ag[this.al] = -1;
                  }
               }

               this.ah[this.al] = var11.ah[var12];
               this.at[this.al] = this.ay(var11, var11.at[var12]);
               this.aa[this.al] = this.ay(var11, var11.aa[var12]);
               this.ay[this.al] = this.ay(var11, var11.ay[var12]);
               ++this.al;
            }

            for(var12 = 0; var12 < var11.am; ++var12) {
               byte var13 = this.as[this.am] = var11.as[var12];
               if (var13 == 0) {
                  this.aj[this.am] = (short)this.ay(var11, var11.aj[var12]);
                  this.ak[this.am] = (short)this.ay(var11, var11.ak[var12]);
                  this.az[this.am] = (short)this.ay(var11, var11.az[var12]);
               }

               ++this.am;
            }
         }
      }

   }

   static final int bi(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   public iz(iz var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.ac = var1.ac;
      this.al = var1.al;
      this.am = var1.am;
      int var6;
      if (var2) {
         this.au = var1.au;
         this.ab = var1.ab;
         this.aq = var1.aq;
      } else {
         this.au = new int[this.ac];
         this.ab = new int[this.ac];
         this.aq = new int[this.ac];

         for(var6 = 0; var6 < this.ac; ++var6) {
            this.au[var6] = var1.au[var6];
            this.ab[var6] = var1.ab[var6];
            this.aq[var6] = var1.aq[var6];
         }
      }

      if (var3) {
         this.ah = var1.ah;
      } else {
         this.ah = new short[this.al];

         for(var6 = 0; var6 < this.al; ++var6) {
            this.ah[var6] = var1.ah[var6];
         }
      }

      if (!var4 && var1.av != null) {
         this.av = new short[this.al];

         for(var6 = 0; var6 < this.al; ++var6) {
            this.av[var6] = var1.av[var6];
         }
      } else {
         this.av = var1.av;
      }

      if (var5) {
         this.ai = var1.ai;
      } else {
         this.ai = new byte[this.al];
         if (var1.ai == null) {
            for(var6 = 0; var6 < this.al; ++var6) {
               this.ai[var6] = 0;
            }
         } else {
            for(var6 = 0; var6 < this.al; ++var6) {
               this.ai[var6] = var1.ai[var6];
            }
         }
      }

      this.at = var1.at;
      this.aa = var1.aa;
      this.ay = var1.ay;
      this.ao = var1.ao;
      this.ax = var1.ax;
      this.ag = var1.ag;
      this.ar = var1.ar;
      this.as = var1.as;
      this.aj = var1.aj;
      this.ak = var1.ak;
      this.az = var1.az;
      this.ad = var1.ad;
      this.ae = var1.ae;
      this.ap = var1.ap;
      this.by = var1.by;
      this.bk = var1.bk;
      this.be = var1.be;
      this.bx = var1.bx;
      this.bb = var1.bb;
      this.bi = var1.bi;
      this.bo = var1.bo;
      this.bz = var1.bz;
   }

   public void cp(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.ac; ++var4) {
         this.au[var4] = this.au[var4] * var1 / 78035716;
         this.ab[var4] = this.ab[var4] * var2 / -768723878;
         this.aq[var4] = this.aq[var4] * var3 / -526983290;
      }

      this.ae();
   }

   public iz ax(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.ap();
      int var7 = var2 + this.bt;
      int var8 = var2 + this.bj;
      int var9 = var4 + this.bs;
      int var10 = var4 + this.bn;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            iz var11;
            if (var5) {
               var11 = new iz();
               var11.ac = this.ac;
               var11.al = this.al;
               var11.am = this.am;
               var11.au = this.au;
               var11.aq = this.aq;
               var11.at = this.at;
               var11.aa = this.aa;
               var11.ay = this.ay;
               var11.ao = this.ao;
               var11.ax = this.ax;
               var11.ai = this.ai;
               var11.ag = this.ag;
               var11.ah = this.ah;
               var11.av = this.av;
               var11.ar = this.ar;
               var11.as = this.as;
               var11.aj = this.aj;
               var11.ak = this.ak;
               var11.az = this.az;
               var11.ad = this.ad;
               var11.ae = this.ae;
               var11.ap = this.ap;
               var11.by = this.by;
               var11.bo = this.bo;
               var11.bz = this.bz;
               var11.ab = new int[var11.ac];
            } else {
               var11 = this;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if (var6 == 0) {
               for(var12 = 0; var12 < var11.ac; ++var12) {
                  var13 = this.au[var12] + var2;
                  var14 = this.aq[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.ab[var12] = this.ab[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.ac; ++var12) {
                  var13 = (-this.ab[var12] << 16) / (this.et * 1550732737);
                  if (var13 < var6) {
                     var14 = this.au[var12] + var2;
                     var15 = this.aq[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.ab[var12] = this.ab[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.ae();
            return var11;
         }
      } else {
         return this;
      }
   }

   public void ck() {
      for(int var1 = 0; var1 < this.ac; ++var1) {
         int var2 = this.aq[var1];
         this.aq[var1] = this.au[var1];
         this.au[var1] = -var2;
      }

      this.ae();
   }

   public void ag() {
      for(int var1 = 0; var1 < this.ac; ++var1) {
         int var2 = this.au[var1];
         this.au[var1] = this.aq[var1];
         this.aq[var1] = -var2;
      }

      this.ae();
   }

   public final it dz(int var1, int var2, int var3, int var4, int var5) {
      this.ad();
      int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      int var7 = var2 * var6 >> 8;
      it var8 = new it();
      var8.ah = new int[this.al];
      var8.av = new int[this.al];
      var8.ar = new int[this.al];
      if (this.am > 0 && this.ag != null) {
         int[] var9 = new int[this.am];

         int var10;
         for(var10 = 0; var10 < this.al; ++var10) {
            if (this.ag[var10] != -1) {
               ++var9[this.ag[var10] & 255];
            }
         }

         var8.ad = 0;

         for(var10 = 0; var10 < this.am; ++var10) {
            if (var9[var10] > 0 && this.as[var10] == 0) {
               ++var8.ad;
            }
         }

         var8.ae = new int[var8.ad];
         var8.ap = new int[var8.ad];
         var8.by = new int[var8.ad];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.am; ++var11) {
            if (var9[var11] > 0 && this.as[var11] == 0) {
               var8.ae[var10] = this.aj[var11] & '\uffff';
               var8.ap[var10] = this.ak[var11] & '\uffff';
               var8.by[var10] = this.az[var11] & '\uffff';
               var9[var11] = var10++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.aj = new byte[this.al];

         for(var11 = 0; var11 < this.al; ++var11) {
            if (this.ag[var11] != -1) {
               var8.aj[var11] = (byte)var9[this.ag[var11] & 255];
            } else {
               var8.aj[var11] = -1;
            }
         }
      }

      for(int var16 = 0; var16 < this.al; ++var16) {
         byte var17;
         if (this.ao == null) {
            var17 = 0;
         } else {
            var17 = this.ao[var16];
         }

         byte var18;
         if (this.ai == null) {
            var18 = 0;
         } else {
            var18 = this.ai[var16];
         }

         short var12;
         if (this.av == null) {
            var12 = -1;
         } else {
            var12 = this.av[var16];
         }

         if (var18 == -2) {
            var17 = 3;
         }

         if (var18 == -1) {
            var17 = 2;
         }

         ib var13;
         int var14;
         ir var19;
         if (var12 == -1) {
            if (var17 != 0) {
               if (var17 == 1) {
                  var19 = this.be[var16];
                  var14 = var1 + (var3 * var19.af * -18074541 + var4 * var19.an * 1542458359 + var5 * var19.aw * -446870673) / (var7 + var7 / 2);
                  var8.ah[var16] = bi(this.ah[var16] & '\uffff', var14);
                  var8.ar[var16] = -1;
               } else if (var17 == 3) {
                  var8.ah[var16] = 128;
                  var8.ar[var16] = -1;
               } else {
                  var8.ar[var16] = -2;
               }
            } else {
               int var15 = this.ah[var16] & '\uffff';
               if (this.bx != null && this.bx[this.at[var16]] != null) {
                  var13 = this.bx[this.at[var16]];
               } else {
                  var13 = this.bk[this.at[var16]];
               }

               var14 = var1 + (var3 * var13.af * -1941999827 + var4 * var13.an * 124229261 + var5 * var13.aw * 2108671835) / (var7 * var13.ac * -1837445001);
               var8.ah[var16] = bi(var15, var14);
               if (this.bx != null && this.bx[this.aa[var16]] != null) {
                  var13 = this.bx[this.aa[var16]];
               } else {
                  var13 = this.bk[this.aa[var16]];
               }

               var14 = var1 + (var3 * var13.af * -1941999827 + var4 * var13.an * 124229261 + var5 * var13.aw * 2108671835) / (var7 * var13.ac * -1837445001);
               var8.av[var16] = bi(var15, var14);
               if (this.bx != null && this.bx[this.ay[var16]] != null) {
                  var13 = this.bx[this.ay[var16]];
               } else {
                  var13 = this.bk[this.ay[var16]];
               }

               var14 = var1 + (var3 * var13.af * -1941999827 + var4 * var13.an * 124229261 + var5 * var13.aw * 2108671835) / (var7 * var13.ac * -1837445001);
               var8.ar[var16] = bi(var15, var14);
            }
         } else if (var17 != 0) {
            if (var17 == 1) {
               var19 = this.be[var16];
               var14 = var1 + (var3 * var19.af * -18074541 + var4 * var19.an * 1542458359 + var5 * var19.aw * -446870673) / (var7 + var7 / 2);
               var8.ah[var16] = be(var14);
               var8.ar[var16] = -1;
            } else {
               var8.ar[var16] = -2;
            }
         } else {
            if (this.bx != null && this.bx[this.at[var16]] != null) {
               var13 = this.bx[this.at[var16]];
            } else {
               var13 = this.bk[this.at[var16]];
            }

            var14 = var1 + (var3 * var13.af * -1941999827 + var4 * var13.an * 124229261 + var5 * var13.aw * 2108671835) / (var7 * var13.ac * -1837445001);
            var8.ah[var16] = be(var14);
            if (this.bx != null && this.bx[this.aa[var16]] != null) {
               var13 = this.bx[this.aa[var16]];
            } else {
               var13 = this.bk[this.aa[var16]];
            }

            var14 = var1 + (var3 * var13.af * -1941999827 + var4 * var13.an * 124229261 + var5 * var13.aw * 2108671835) / (var7 * var13.ac * -1837445001);
            var8.av[var16] = be(var14);
            if (this.bx != null && this.bx[this.ay[var16]] != null) {
               var13 = this.bx[this.ay[var16]];
            } else {
               var13 = this.bk[this.ay[var16]];
            }

            var14 = var1 + (var3 * var13.af * -1941999827 + var4 * var13.an * 124229261 + var5 * var13.aw * 2108671835) / (var7 * var13.ac * -1837445001);
            var8.ar[var16] = be(var14);
         }
      }

      this.ai();
      var8.al = this.ac;
      var8.at = this.au;
      var8.aa = this.ab;
      var8.ay = this.aq;
      var8.ao = this.al;
      var8.ax = this.at;
      var8.ai = this.aa;
      var8.ag = this.ay;
      var8.am = this.ax;
      var8.as = this.ai;
      var8.az = this.ar;
      var8.bb = this.ap;
      var8.bi = this.by;
      var8.ak = this.av;
      var8.be = this.bb;
      var8.bk = this.bi;
      return var8;
   }

   public void av() {
      for(int var1 = 0; var1 < this.ac; ++var1) {
         int var2 = this.aq[var1];
         this.aq[var1] = this.au[var1];
         this.au[var1] = -var2;
      }

      this.ae();
   }

   public void ah() {
      for(int var1 = 0; var1 < this.ac; ++var1) {
         this.au[var1] = -this.au[var1];
         this.aq[var1] = -this.aq[var1];
      }

      this.ae();
   }

   public void am(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.ac; ++var4) {
         int[] var10000 = this.au;
         var10000[var4] += var1;
         var10000 = this.ab;
         var10000[var4] += var2;
         var10000 = this.aq;
         var10000[var4] += var3;
      }

      this.ae();
   }

   public void as(short var1, short var2) {
      for(int var3 = 0; var3 < this.al; ++var3) {
         if (this.ah[var3] == var1) {
            this.ah[var3] = var2;
         }
      }

   }

   void ai() {
      int[] var1;
      int var2;
      int var10002;
      int var3;
      int var4;
      if (this.ad != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.ac; ++var3) {
            var4 = this.ad[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.ap = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.ap[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.ac; this.ap[var4][var1[var4]++] = var3++) {
            var4 = this.ad[var3];
         }

         this.ad = null;
      }

      if (this.ae != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.al; ++var3) {
            var4 = this.ae[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.by = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.by[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.al; this.by[var4][var1[var4]++] = var3++) {
            var4 = this.ae[var3];
         }

         this.ae = null;
      }

   }

   public void ak() {
      int var1;
      for(var1 = 0; var1 < this.ac; ++var1) {
         this.aq[var1] = -this.aq[var1];
      }

      for(var1 = 0; var1 < this.al; ++var1) {
         int var2 = this.at[var1];
         this.at[var1] = this.ay[var1];
         this.ay[var1] = var2;
      }

      this.ae();
   }

   public void az(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.ac; ++var4) {
         this.au[var4] = this.au[var4] * var1 / 128;
         this.ab[var4] = this.ab[var4] * var2 / 128;
         this.aq[var4] = this.aq[var4] * var3 / 128;
      }

      this.ae();
   }

   public void cr(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.ac; ++var4) {
         int[] var10000 = this.au;
         var10000[var4] += var1;
         var10000 = this.ab;
         var10000[var4] += var2;
         var10000 = this.aq;
         var10000[var4] += var3;
      }

      this.ae();
   }

   void ae() {
      this.bk = null;
      this.bx = null;
      this.be = null;
      this.bm = false;
   }

   void ap() {
      if (!this.bm) {
         this.et = 0;
         this.bd = 0;
         this.bt = 999999;
         this.bj = -999999;
         this.bn = -99999;
         this.bs = 99999;

         for(int var1 = 0; var1 < this.ac; ++var1) {
            int var2 = this.au[var1];
            int var3 = this.ab[var1];
            int var4 = this.aq[var1];
            if (var2 < this.bt) {
               this.bt = var2;
            }

            if (var2 > this.bj) {
               this.bj = var2;
            }

            if (var4 < this.bs) {
               this.bs = var4;
            }

            if (var4 > this.bn) {
               this.bn = var4;
            }

            if (-var3 > this.et * 1550732737) {
               this.et = -var3 * -644693439;
            }

            if (var3 > this.bd) {
               this.bd = var3;
            }
         }

         this.bm = true;
      }
   }

   static void by(iz var0, iz var1, int var2, int var3, int var4, boolean var5) {
      var0.ap();
      var0.ad();
      var1.ap();
      var1.ad();
      ++bu;
      int var6 = 0;
      int[] var7 = var1.au;
      int var8 = var1.ac;

      int var9;
      for(var9 = 0; var9 < var0.ac; ++var9) {
         ib var10 = var0.bk[var9];
         if (var10.ac * -1837445001 != 0) {
            int var11 = var0.ab[var9] - var3;
            if (var11 <= var1.bd) {
               int var12 = var0.au[var9] - var2;
               if (var12 >= var1.bt && var12 <= var1.bj) {
                  int var13 = var0.aq[var9] - var4;
                  if (var13 >= var1.bs && var13 <= var1.bn) {
                     for(int var14 = 0; var14 < var8; ++var14) {
                        ib var15 = var1.bk[var14];
                        if (var12 == var7[var14] && var13 == var1.aq[var14] && var11 == var1.ab[var14] && var15.ac * -1837445001 != 0) {
                           if (var0.bx == null) {
                              var0.bx = new ib[var0.ac];
                           }

                           if (var1.bx == null) {
                              var1.bx = new ib[var8];
                           }

                           ib var16 = var0.bx[var9];
                           if (var16 == null) {
                              var16 = var0.bx[var9] = new ib(var10);
                           }

                           ib var17 = var1.bx[var14];
                           if (var17 == null) {
                              var17 = var1.bx[var14] = new ib(var15);
                           }

                           var16.af += var15.af * 1;
                           var16.an += var15.an * 1;
                           var16.aw += var15.aw * 1;
                           var16.ac += var15.ac * 1;
                           var17.af += var10.af * 1;
                           var17.an += var10.an * 1;
                           var17.aw += var10.aw * 1;
                           var17.ac += var10.ac * 1;
                           ++var6;
                           br[var9] = bu;
                           bg[var14] = bu;
                        }
                     }
                  }
               }
            }
         }
      }

      if (var6 >= 3 && var5) {
         for(var9 = 0; var9 < var0.al; ++var9) {
            if (br[var0.at[var9]] == bu && br[var0.aa[var9]] == bu && br[var0.ay[var9]] == bu) {
               if (var0.ao == null) {
                  var0.ao = new byte[var0.al];
               }

               var0.ao[var9] = 2;
            }
         }

         for(var9 = 0; var9 < var1.al; ++var9) {
            if (bg[var1.at[var9]] == bu && bg[var1.aa[var9]] == bu && bg[var1.ay[var9]] == bu) {
               if (var1.ao == null) {
                  var1.ao = new byte[var1.al];
               }

               var1.ao[var9] = 2;
            }
         }

      }
   }

   public final it bb(int var1, int var2, int var3, int var4, int var5) {
      this.ad();
      int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      int var7 = var2 * var6 >> 8;
      it var8 = new it();
      var8.ah = new int[this.al];
      var8.av = new int[this.al];
      var8.ar = new int[this.al];
      if (this.am > 0 && this.ag != null) {
         int[] var9 = new int[this.am];

         int var10;
         for(var10 = 0; var10 < this.al; ++var10) {
            if (this.ag[var10] != -1) {
               ++var9[this.ag[var10] & 255];
            }
         }

         var8.ad = 0;

         for(var10 = 0; var10 < this.am; ++var10) {
            if (var9[var10] > 0 && this.as[var10] == 0) {
               ++var8.ad;
            }
         }

         var8.ae = new int[var8.ad];
         var8.ap = new int[var8.ad];
         var8.by = new int[var8.ad];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.am; ++var11) {
            if (var9[var11] > 0 && this.as[var11] == 0) {
               var8.ae[var10] = this.aj[var11] & '\uffff';
               var8.ap[var10] = this.ak[var11] & '\uffff';
               var8.by[var10] = this.az[var11] & '\uffff';
               var9[var11] = var10++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.aj = new byte[this.al];

         for(var11 = 0; var11 < this.al; ++var11) {
            if (this.ag[var11] != -1) {
               var8.aj[var11] = (byte)var9[this.ag[var11] & 255];
            } else {
               var8.aj[var11] = -1;
            }
         }
      }

      for(int var16 = 0; var16 < this.al; ++var16) {
         byte var17;
         if (this.ao == null) {
            var17 = 0;
         } else {
            var17 = this.ao[var16];
         }

         byte var18;
         if (this.ai == null) {
            var18 = 0;
         } else {
            var18 = this.ai[var16];
         }

         short var12;
         if (this.av == null) {
            var12 = -1;
         } else {
            var12 = this.av[var16];
         }

         if (var18 == -2) {
            var17 = 3;
         }

         if (var18 == -1) {
            var17 = 2;
         }

         ib var13;
         int var14;
         ir var19;
         if (var12 == -1) {
            if (var17 != 0) {
               if (var17 == 1) {
                  var19 = this.be[var16];
                  var14 = var1 + (var3 * var19.af * -18074541 + var4 * var19.an * 1542458359 + var5 * var19.aw * -446870673) / (var7 + var7 / 2);
                  var8.ah[var16] = bi(this.ah[var16] & '\uffff', var14);
                  var8.ar[var16] = -1;
               } else if (var17 == 3) {
                  var8.ah[var16] = 128;
                  var8.ar[var16] = -1;
               } else {
                  var8.ar[var16] = -2;
               }
            } else {
               int var15 = this.ah[var16] & '\uffff';
               if (this.bx != null && this.bx[this.at[var16]] != null) {
                  var13 = this.bx[this.at[var16]];
               } else {
                  var13 = this.bk[this.at[var16]];
               }

               var14 = var1 + (var3 * var13.af * -1941999827 + var4 * var13.an * 124229261 + var5 * var13.aw * 2108671835) / (var7 * var13.ac * -1837445001);
               var8.ah[var16] = bi(var15, var14);
               if (this.bx != null && this.bx[this.aa[var16]] != null) {
                  var13 = this.bx[this.aa[var16]];
               } else {
                  var13 = this.bk[this.aa[var16]];
               }

               var14 = var1 + (var3 * var13.af * -1941999827 + var4 * var13.an * 124229261 + var5 * var13.aw * 2108671835) / (var7 * var13.ac * -1837445001);
               var8.av[var16] = bi(var15, var14);
               if (this.bx != null && this.bx[this.ay[var16]] != null) {
                  var13 = this.bx[this.ay[var16]];
               } else {
                  var13 = this.bk[this.ay[var16]];
               }

               var14 = var1 + (var3 * var13.af * -1941999827 + var4 * var13.an * 124229261 + var5 * var13.aw * 2108671835) / (var7 * var13.ac * -1837445001);
               var8.ar[var16] = bi(var15, var14);
            }
         } else if (var17 != 0) {
            if (var17 == 1) {
               var19 = this.be[var16];
               var14 = var1 + (var3 * var19.af * -18074541 + var4 * var19.an * 1542458359 + var5 * var19.aw * -446870673) / (var7 + var7 / 2);
               var8.ah[var16] = be(var14);
               var8.ar[var16] = -1;
            } else {
               var8.ar[var16] = -2;
            }
         } else {
            if (this.bx != null && this.bx[this.at[var16]] != null) {
               var13 = this.bx[this.at[var16]];
            } else {
               var13 = this.bk[this.at[var16]];
            }

            var14 = var1 + (var3 * var13.af * -1941999827 + var4 * var13.an * 124229261 + var5 * var13.aw * 2108671835) / (var7 * var13.ac * -1837445001);
            var8.ah[var16] = be(var14);
            if (this.bx != null && this.bx[this.aa[var16]] != null) {
               var13 = this.bx[this.aa[var16]];
            } else {
               var13 = this.bk[this.aa[var16]];
            }

            var14 = var1 + (var3 * var13.af * -1941999827 + var4 * var13.an * 124229261 + var5 * var13.aw * 2108671835) / (var7 * var13.ac * -1837445001);
            var8.av[var16] = be(var14);
            if (this.bx != null && this.bx[this.ay[var16]] != null) {
               var13 = this.bx[this.ay[var16]];
            } else {
               var13 = this.bk[this.ay[var16]];
            }

            var14 = var1 + (var3 * var13.af * -1941999827 + var4 * var13.an * 124229261 + var5 * var13.aw * 2108671835) / (var7 * var13.ac * -1837445001);
            var8.ar[var16] = be(var14);
         }
      }

      this.ai();
      var8.al = this.ac;
      var8.at = this.au;
      var8.aa = this.ab;
      var8.ay = this.aq;
      var8.ao = this.al;
      var8.ax = this.at;
      var8.ai = this.aa;
      var8.ag = this.ay;
      var8.am = this.ax;
      var8.as = this.ai;
      var8.az = this.ar;
      var8.bb = this.ap;
      var8.bi = this.by;
      var8.ak = this.av;
      var8.be = this.bb;
      var8.bk = this.bi;
      return var8;
   }

   void dr() {
      this.bk = null;
      this.bx = null;
      this.be = null;
      this.bm = false;
   }

   static final int be(int var0) {
      if (var0 < 2) {
         var0 = 2;
      } else if (var0 > 126) {
         var0 = 126;
      }

      return var0;
   }

   static {
      bf = in.ac;
      bq = in.au;
   }

   public static iz bk(nm var0, int var1, int var2) {
      byte[] var3 = var0.bh(var1, var2, (byte)-49);
      return var3 == null ? null : new iz(var3);
   }

   public static iz bx(nm var0, int var1, int var2) {
      byte[] var3 = var0.bh(var1, var2, (byte)-50);
      return var3 == null ? null : new iz(var3);
   }

   public void cu() {
      for(int var1 = 0; var1 < this.ac; ++var1) {
         int var2 = this.aq[var1];
         this.aq[var1] = this.au[var1];
         this.au[var1] = -var2;
      }

      this.ae();
   }

   public void cz() {
      int var1;
      for(var1 = 0; var1 < this.ac; ++var1) {
         this.aq[var1] = -this.aq[var1];
      }

      for(var1 = 0; var1 < this.al; ++var1) {
         int var2 = this.at[var1];
         this.at[var1] = this.ay[var1];
         this.ay[var1] = var2;
      }

      this.ae();
   }

   void bm(byte[] var1) {
      sg var2 = new sg(var1);
      sg var3 = new sg(var1);
      sg var4 = new sg(var1);
      sg var5 = new sg(var1);
      sg var6 = new sg(var1);
      sg var7 = new sg(var1);
      sg var8 = new sg(var1);
      var2.at = (var1.length - 26) * -1516355947;
      int var9 = var2.cl(37345473);
      int var10 = var2.cl(-174266864);
      int var11 = var2.cm((byte)7);
      int var12 = var2.cm((byte)7);
      int var13 = var2.cm((byte)7);
      int var14 = var2.cm((byte)7);
      int var15 = var2.cm((byte)7);
      int var16 = var2.cm((byte)7);
      int var17 = var2.cm((byte)7);
      int var18 = var2.cm((byte)7);
      int var19 = var2.cl(458693613);
      int var20 = var2.cl(685960598);
      int var21 = var2.cl(-863214153);
      int var22 = var2.cl(-756783308);
      int var23 = var2.cl(-1388484459);
      int var24 = var2.cl(47480243);
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28;
      if (var11 > 0) {
         this.as = new byte[var11];
         var2.at = 0;

         for(var28 = 0; var28 < var11; ++var28) {
            byte var29 = this.as[var28] = var2.cf(435772489);
            if (var29 == 0) {
               ++var25;
            }

            if (var29 >= 1 && var29 <= 3) {
               ++var26;
            }

            if (var29 == 2) {
               ++var27;
            }
         }
      }

      var28 = var11 + var9;
      int var30 = var28;
      if (var12 == 1) {
         var28 += var10;
      }

      int var31 = var28;
      var28 += var10;
      int var32 = var28;
      if (var13 == 255) {
         var28 += var10;
      }

      int var33 = var28;
      if (var15 == 1) {
         var28 += var10;
      }

      int var34 = var28;
      var28 += var24;
      int var35 = var28;
      if (var14 == 1) {
         var28 += var10;
      }

      int var36 = var28;
      var28 += var22;
      int var37 = var28;
      if (var16 == 1) {
         var28 += var10 * 2;
      }

      int var38 = var28;
      var28 += var23;
      int var39 = var28;
      var28 += var10 * 2;
      int var40 = var28;
      var28 += var19;
      int var41 = var28;
      var28 += var20;
      int var42 = var28;
      var28 += var21;
      int var43 = var28;
      var28 += var25 * 6;
      int var44 = var28;
      var28 += var26 * 6;
      int var45 = var28;
      var28 += var26 * 6;
      int var46 = var28;
      var28 += var26 * 2;
      int var47 = var28;
      var28 += var26;
      int var48 = var28;
      var28 += var26 * 2 + var27 * 2;
      this.ac = var9;
      this.al = var10;
      this.am = var11;
      this.au = new int[var9];
      this.ab = new int[var9];
      this.aq = new int[var9];
      this.at = new int[var10];
      this.aa = new int[var10];
      this.ay = new int[var10];
      if (var17 == 1) {
         this.ad = new int[var9];
      }

      if (var12 == 1) {
         this.ao = new byte[var10];
      }

      if (var13 == 255) {
         this.ax = new byte[var10];
      } else {
         this.ar = (byte)var13;
      }

      if (var14 == 1) {
         this.ai = new byte[var10];
      }

      if (var15 == 1) {
         this.ae = new int[var10];
      }

      if (var16 == 1) {
         this.av = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.ag = new byte[var10];
      }

      if (var18 == 1) {
         this.bb = new int[var9][];
         this.bi = new int[var9][];
      }

      this.ah = new short[var10];
      if (var11 > 0) {
         this.aj = new short[var11];
         this.ak = new short[var11];
         this.az = new short[var11];
      }

      var2.at = var11 * -1516355947;
      var3.at = var40 * -1516355947;
      var4.at = var41 * -1516355947;
      var5.at = var42 * -1516355947;
      var6.at = var34 * -1516355947;
      int var50 = 0;
      int var51 = 0;
      int var52 = 0;

      int var53;
      int var54;
      int var55;
      int var56;
      int var57;
      for(var53 = 0; var53 < var9; ++var53) {
         var54 = var2.cm((byte)7);
         var55 = 0;
         if ((var54 & 1) != 0) {
            var55 = var3.cp(1675434208);
         }

         var56 = 0;
         if ((var54 & 2) != 0) {
            var56 = var4.cp(1806841920);
         }

         var57 = 0;
         if ((var54 & 4) != 0) {
            var57 = var5.cp(1796291869);
         }

         this.au[var53] = var50 + var55;
         this.ab[var53] = var51 + var56;
         this.aq[var53] = var52 + var57;
         var50 = this.au[var53];
         var51 = this.ab[var53];
         var52 = this.aq[var53];
         if (var17 == 1) {
            this.ad[var53] = var6.cm((byte)7);
         }
      }

      if (var18 == 1) {
         for(var53 = 0; var53 < var9; ++var53) {
            var54 = var6.cm((byte)7);
            this.bb[var53] = new int[var54];
            this.bi[var53] = new int[var54];

            for(var55 = 0; var55 < var54; ++var55) {
               this.bb[var53][var55] = var6.cm((byte)7);
               this.bi[var53][var55] = var6.cm((byte)7);
            }
         }
      }

      var2.at = var39 * -1516355947;
      var3.at = var30 * -1516355947;
      var4.at = var32 * -1516355947;
      var5.at = var35 * -1516355947;
      var6.at = var33 * -1516355947;
      var7.at = var37 * -1516355947;
      var8.at = var38 * -1516355947;

      for(var53 = 0; var53 < var10; ++var53) {
         this.ah[var53] = (short)var2.cl(-1613738301);
         if (var12 == 1) {
            this.ao[var53] = var3.cf(435772489);
         }

         if (var13 == 255) {
            this.ax[var53] = var4.cf(435772489);
         }

         if (var14 == 1) {
            this.ai[var53] = var5.cf(435772489);
         }

         if (var15 == 1) {
            this.ae[var53] = var6.cm((byte)7);
         }

         if (var16 == 1) {
            this.av[var53] = (short)(var7.cl(-541600847) - 1);
         }

         if (this.ag != null && this.av[var53] != -1) {
            this.ag[var53] = (byte)(var8.cm((byte)7) - 1);
         }
      }

      var2.at = var36 * -1516355947;
      var3.at = var31 * -1516355947;
      var53 = 0;
      var54 = 0;
      var55 = 0;
      var56 = 0;

      int var58;
      for(var57 = 0; var57 < var10; ++var57) {
         var58 = var3.cm((byte)7);
         if (var58 == 1) {
            var53 = var2.cp(1574653195) + var56;
            var54 = var2.cp(1501416094) + var53;
            var55 = var2.cp(1831705081) + var54;
            var56 = var55;
            this.at[var57] = var53;
            this.aa[var57] = var54;
            this.ay[var57] = var55;
         }

         if (var58 == 2) {
            var54 = var55;
            var55 = var2.cp(2111043609) + var56;
            var56 = var55;
            this.at[var57] = var53;
            this.aa[var57] = var54;
            this.ay[var57] = var55;
         }

         if (var58 == 3) {
            var53 = var55;
            var55 = var2.cp(1490786297) + var56;
            var56 = var55;
            this.at[var57] = var53;
            this.aa[var57] = var54;
            this.ay[var57] = var55;
         }

         if (var58 == 4) {
            int var59 = var53;
            var53 = var54;
            var54 = var59;
            var55 = var2.cp(2070804857) + var56;
            var56 = var55;
            this.at[var57] = var53;
            this.aa[var57] = var59;
            this.ay[var57] = var55;
         }
      }

      var2.at = var43 * -1516355947;
      var3.at = var44 * -1516355947;
      var4.at = var45 * -1516355947;
      var5.at = var46 * -1516355947;
      var6.at = var47 * -1516355947;
      var7.at = var48 * -1516355947;

      for(var57 = 0; var57 < var11; ++var57) {
         var58 = this.as[var57] & 255;
         if (var58 == 0) {
            this.aj[var57] = (short)var2.cl(109644972);
            this.ak[var57] = (short)var2.cl(-1553049653);
            this.az[var57] = (short)var2.cl(-58836624);
         }
      }

      var2.at = var28 * -1516355947;
      var57 = var2.cm((byte)7);
      if (var57 != 0) {
         new jo();
         var2.cl(552768155);
         var2.cl(-1574441968);
         var2.cl(-818957072);
         var2.cx(-901661354);
      }

   }

   public iz ao() {
      iz var1 = new iz();
      if (this.ao != null) {
         var1.ao = new byte[this.al];

         for(int var2 = 0; var2 < this.al; ++var2) {
            var1.ao[var2] = this.ao[var2];
         }
      }

      var1.ac = this.ac;
      var1.al = this.al;
      var1.am = this.am;
      var1.au = this.au;
      var1.ab = this.ab;
      var1.aq = this.aq;
      var1.at = this.at;
      var1.aa = this.aa;
      var1.ay = this.ay;
      var1.ax = this.ax;
      var1.ai = this.ai;
      var1.ag = this.ag;
      var1.ah = this.ah;
      var1.av = this.av;
      var1.ar = this.ar;
      var1.as = this.as;
      var1.aj = this.aj;
      var1.ak = this.ak;
      var1.az = this.az;
      var1.ad = this.ad;
      var1.ae = this.ae;
      var1.ap = this.ap;
      var1.by = this.by;
      var1.bk = this.bk;
      var1.be = this.be;
      var1.bo = this.bo;
      var1.bz = this.bz;
      return var1;
   }

   void bd(byte[] var1) {
      sg var2 = new sg(var1);
      sg var3 = new sg(var1);
      sg var4 = new sg(var1);
      sg var5 = new sg(var1);
      sg var6 = new sg(var1);
      sg var7 = new sg(var1);
      sg var8 = new sg(var1);
      var2.at = (var1.length - 26) * -1516355947;
      int var9 = var2.cl(-404369574);
      int var10 = var2.cl(-21305028);
      int var11 = var2.cm((byte)7);
      int var12 = var2.cm((byte)7);
      int var13 = var2.cm((byte)7);
      int var14 = var2.cm((byte)7);
      int var15 = var2.cm((byte)7);
      int var16 = var2.cm((byte)7);
      int var17 = var2.cm((byte)7);
      int var18 = var2.cm((byte)7);
      int var19 = var2.cl(-1855336875);
      int var20 = var2.cl(279627611);
      int var21 = var2.cl(71428512);
      int var22 = var2.cl(708773356);
      int var23 = var2.cl(831094607);
      int var24 = var2.cl(-1123305343);
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28;
      if (var11 > 0) {
         this.as = new byte[var11];
         var2.at = 0;

         for(var28 = 0; var28 < var11; ++var28) {
            byte var29 = this.as[var28] = var2.cf(435772489);
            if (var29 == 0) {
               ++var25;
            }

            if (var29 >= 1 && var29 <= 3) {
               ++var26;
            }

            if (var29 == 2) {
               ++var27;
            }
         }
      }

      var28 = var11 + var9;
      int var30 = var28;
      if (var12 == 1) {
         var28 += var10;
      }

      int var31 = var28;
      var28 += var10;
      int var32 = var28;
      if (var13 == 255) {
         var28 += var10;
      }

      int var33 = var28;
      if (var15 == 1) {
         var28 += var10;
      }

      int var34 = var28;
      var28 += var24;
      int var35 = var28;
      if (var14 == 1) {
         var28 += var10;
      }

      int var36 = var28;
      var28 += var22;
      int var37 = var28;
      if (var16 == 1) {
         var28 += var10 * 2;
      }

      int var38 = var28;
      var28 += var23;
      int var39 = var28;
      var28 += var10 * 2;
      int var40 = var28;
      var28 += var19;
      int var41 = var28;
      var28 += var20;
      int var42 = var28;
      var28 += var21;
      int var43 = var28;
      var28 += var25 * 6;
      int var44 = var28;
      var28 += var26 * 6;
      int var45 = var28;
      var28 += var26 * 6;
      int var46 = var28;
      var28 += var26 * 2;
      int var47 = var28;
      var28 += var26;
      int var48 = var28;
      var28 += var26 * 2 + var27 * 2;
      this.ac = var9;
      this.al = var10;
      this.am = var11;
      this.au = new int[var9];
      this.ab = new int[var9];
      this.aq = new int[var9];
      this.at = new int[var10];
      this.aa = new int[var10];
      this.ay = new int[var10];
      if (var17 == 1) {
         this.ad = new int[var9];
      }

      if (var12 == 1) {
         this.ao = new byte[var10];
      }

      if (var13 == 255) {
         this.ax = new byte[var10];
      } else {
         this.ar = (byte)var13;
      }

      if (var14 == 1) {
         this.ai = new byte[var10];
      }

      if (var15 == 1) {
         this.ae = new int[var10];
      }

      if (var16 == 1) {
         this.av = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.ag = new byte[var10];
      }

      if (var18 == 1) {
         this.bb = new int[var9][];
         this.bi = new int[var9][];
      }

      this.ah = new short[var10];
      if (var11 > 0) {
         this.aj = new short[var11];
         this.ak = new short[var11];
         this.az = new short[var11];
      }

      var2.at = var11 * -1516355947;
      var3.at = var40 * -1516355947;
      var4.at = var41 * -1516355947;
      var5.at = var42 * -1516355947;
      var6.at = var34 * -1516355947;
      int var50 = 0;
      int var51 = 0;
      int var52 = 0;

      int var53;
      int var54;
      int var55;
      int var56;
      int var57;
      for(var53 = 0; var53 < var9; ++var53) {
         var54 = var2.cm((byte)7);
         var55 = 0;
         if ((var54 & 1) != 0) {
            var55 = var3.cp(1583882470);
         }

         var56 = 0;
         if ((var54 & 2) != 0) {
            var56 = var4.cp(1165354604);
         }

         var57 = 0;
         if ((var54 & 4) != 0) {
            var57 = var5.cp(1402432472);
         }

         this.au[var53] = var50 + var55;
         this.ab[var53] = var51 + var56;
         this.aq[var53] = var52 + var57;
         var50 = this.au[var53];
         var51 = this.ab[var53];
         var52 = this.aq[var53];
         if (var17 == 1) {
            this.ad[var53] = var6.cm((byte)7);
         }
      }

      if (var18 == 1) {
         for(var53 = 0; var53 < var9; ++var53) {
            var54 = var6.cm((byte)7);
            this.bb[var53] = new int[var54];
            this.bi[var53] = new int[var54];

            for(var55 = 0; var55 < var54; ++var55) {
               this.bb[var53][var55] = var6.cm((byte)7);
               this.bi[var53][var55] = var6.cm((byte)7);
            }
         }
      }

      var2.at = var39 * -1516355947;
      var3.at = var30 * -1516355947;
      var4.at = var32 * -1516355947;
      var5.at = var35 * -1516355947;
      var6.at = var33 * -1516355947;
      var7.at = var37 * -1516355947;
      var8.at = var38 * -1516355947;

      for(var53 = 0; var53 < var10; ++var53) {
         this.ah[var53] = (short)var2.cl(225569958);
         if (var12 == 1) {
            this.ao[var53] = var3.cf(435772489);
         }

         if (var13 == 255) {
            this.ax[var53] = var4.cf(435772489);
         }

         if (var14 == 1) {
            this.ai[var53] = var5.cf(435772489);
         }

         if (var15 == 1) {
            this.ae[var53] = var6.cm((byte)7);
         }

         if (var16 == 1) {
            this.av[var53] = (short)(var7.cl(-1710399166) - 1);
         }

         if (this.ag != null && this.av[var53] != -1) {
            this.ag[var53] = (byte)(var8.cm((byte)7) - 1);
         }
      }

      var2.at = var36 * -1516355947;
      var3.at = var31 * -1516355947;
      var53 = 0;
      var54 = 0;
      var55 = 0;
      var56 = 0;

      int var58;
      for(var57 = 0; var57 < var10; ++var57) {
         var58 = var3.cm((byte)7);
         if (var58 == 1) {
            var53 = var2.cp(2141651116) + var56;
            var54 = var2.cp(1771847491) + var53;
            var55 = var2.cp(1596238713) + var54;
            var56 = var55;
            this.at[var57] = var53;
            this.aa[var57] = var54;
            this.ay[var57] = var55;
         }

         if (var58 == 2) {
            var54 = var55;
            var55 = var2.cp(1949392498) + var56;
            var56 = var55;
            this.at[var57] = var53;
            this.aa[var57] = var54;
            this.ay[var57] = var55;
         }

         if (var58 == 3) {
            var53 = var55;
            var55 = var2.cp(1725213968) + var56;
            var56 = var55;
            this.at[var57] = var53;
            this.aa[var57] = var54;
            this.ay[var57] = var55;
         }

         if (var58 == 4) {
            int var59 = var53;
            var53 = var54;
            var54 = var59;
            var55 = var2.cp(1831867890) + var56;
            var56 = var55;
            this.at[var57] = var53;
            this.aa[var57] = var59;
            this.ay[var57] = var55;
         }
      }

      var2.at = var43 * -1516355947;
      var3.at = var44 * -1516355947;
      var4.at = var45 * -1516355947;
      var5.at = var46 * -1516355947;
      var6.at = var47 * -1516355947;
      var7.at = var48 * -1516355947;

      for(var57 = 0; var57 < var11; ++var57) {
         var58 = this.as[var57] & 255;
         if (var58 == 0) {
            this.aj[var57] = (short)var2.cl(-1752760209);
            this.ak[var57] = (short)var2.cl(-340546502);
            this.az[var57] = (short)var2.cl(278653064);
         }
      }

      var2.at = var28 * -1516355947;
      var57 = var2.cm((byte)7);
      if (var57 != 0) {
         new jo();
         var2.cl(-23100558);
         var2.cl(-411015027);
         var2.cl(-1384012435);
         var2.cx(-2110875031);
      }

   }

   void bj(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      sg var4 = new sg(var1);
      sg var5 = new sg(var1);
      sg var6 = new sg(var1);
      sg var7 = new sg(var1);
      sg var8 = new sg(var1);
      var4.at = (var1.length - 23) * 1897443165;
      int var9 = var4.cl(-1298125413);
      int var10 = var4.cl(-1436601832);
      int var11 = var4.cm((byte)7);
      int var12 = var4.cm((byte)7);
      int var13 = var4.cm((byte)7);
      int var14 = var4.cm((byte)7);
      int var15 = var4.cm((byte)7);
      int var16 = var4.cm((byte)7);
      int var17 = var4.cm((byte)7);
      int var18 = var4.cl(-22964750);
      int var19 = var4.cl(-814173962);
      int var20 = var4.cl(-1118491014);
      int var21 = var4.cl(-995172451);
      int var22 = var4.cl(-676449922);
      int var23 = 0;
      byte var24 = (byte)var23;
      var23 += var9;
      int var25 = var23;
      var23 += var10;
      int var26 = var23;
      if (var13 == 892724674) {
         var23 += var10;
      }

      int var27 = var23;
      if (var15 == 1) {
         var23 += var10;
      }

      int var28 = var23;
      if (var12 == 1) {
         var23 += var10;
      }

      int var29 = var23;
      var23 += var22;
      int var30 = var23;
      if (var14 == 1) {
         var23 += var10;
      }

      int var31 = var23;
      var23 += var21;
      int var32 = var23;
      var23 += var10 * 2;
      int var33 = var23;
      var23 += var11 * 6;
      int var34 = var23;
      var23 += var18;
      int var35 = var23;
      var23 += var19;
      int var10000 = var23 + var20;
      this.ac = var9;
      this.al = var10;
      this.am = var11;
      this.au = new int[var9];
      this.ab = new int[var9];
      this.aq = new int[var9];
      this.at = new int[var10];
      this.aa = new int[var10];
      this.ay = new int[var10];
      if (var11 > 0) {
         this.as = new byte[var11];
         this.aj = new short[var11];
         this.ak = new short[var11];
         this.az = new short[var11];
      }

      if (var16 == 1) {
         this.ad = new int[var9];
      }

      if (var12 == 1) {
         this.ao = new byte[var10];
         this.ag = new byte[var10];
         this.av = new short[var10];
      }

      if (var13 == 255) {
         this.ax = new byte[var10];
      } else {
         this.ar = (byte)var13;
      }

      if (var14 == 1) {
         this.ai = new byte[var10];
      }

      if (var15 == 1) {
         this.ae = new int[var10];
      }

      if (var17 == 1) {
         this.bb = new int[var9][];
         this.bi = new int[var9][];
      }

      this.ah = new short[var10];
      var4.at = var24 * -1516355947;
      var5.at = var34 * 1842304720;
      var6.at = var35 * -1516355947;
      var7.at = var23 * -1516355947;
      var8.at = var29 * 200795025;
      int var37 = 0;
      int var38 = 0;
      int var39 = 0;

      int var40;
      int var41;
      int var42;
      int var43;
      int var44;
      for(var40 = 0; var40 < var9; ++var40) {
         var41 = var4.cm((byte)7);
         var42 = 0;
         if ((var41 & 1) != 0) {
            var42 = var5.cp(2086691887);
         }

         var43 = 0;
         if ((var41 & 2) != 0) {
            var43 = var6.cp(1612194925);
         }

         var44 = 0;
         if ((var41 & 4) != 0) {
            var44 = var7.cp(2067540771);
         }

         this.au[var40] = var37 + var42;
         this.ab[var40] = var38 + var43;
         this.aq[var40] = var39 + var44;
         var37 = this.au[var40];
         var38 = this.ab[var40];
         var39 = this.aq[var40];
         if (var16 == 1) {
            this.ad[var40] = var8.cm((byte)7);
         }
      }

      if (var17 == 1) {
         for(var40 = 0; var40 < var9; ++var40) {
            var41 = var8.cm((byte)7);
            this.bb[var40] = new int[var41];
            this.bi[var40] = new int[var41];

            for(var42 = 0; var42 < var41; ++var42) {
               this.bb[var40][var42] = var8.cm((byte)7);
               this.bi[var40][var42] = var8.cm((byte)7);
            }
         }
      }

      var4.at = var32 * -1516355947;
      var5.at = var28 * -1516355947;
      var6.at = var26 * 1918413665;
      var7.at = var30 * -933177784;
      var8.at = var27 * 1688810135;

      for(var40 = 0; var40 < var10; ++var40) {
         this.ah[var40] = (short)var4.cl(-148732184);
         if (var12 == 1) {
            var41 = var5.cm((byte)7);
            if ((var41 & 1) == 1) {
               this.ao[var40] = 1;
               var2 = true;
            } else {
               this.ao[var40] = 0;
            }

            if ((var41 & 2) == 2) {
               this.ag[var40] = (byte)(var41 >> 2);
               this.av[var40] = this.ah[var40];
               this.ah[var40] = (short)-600675011;
               if (this.av[var40] != -1) {
                  var3 = true;
               }
            } else {
               this.ag[var40] = -1;
               this.av[var40] = -1;
            }
         }

         if (var13 == -1756734811) {
            this.ax[var40] = var6.cf(435772489);
         }

         if (var14 == 1) {
            this.ai[var40] = var7.cf(435772489);
         }

         if (var15 == 1) {
            this.ae[var40] = var8.cm((byte)7);
         }
      }

      var4.at = var31 * 1292971777;
      var5.at = var25 * -1516355947;
      var40 = 0;
      var41 = 0;
      var42 = 0;
      var43 = 0;

      int var45;
      int var46;
      for(var44 = 0; var44 < var10; ++var44) {
         var45 = var5.cm((byte)7);
         if (var45 == 1) {
            var40 = var4.cp(1790113606) + var43;
            var41 = var4.cp(1972592742) + var40;
            var42 = var4.cp(1870286293) + var41;
            var43 = var42;
            this.at[var44] = var40;
            this.aa[var44] = var41;
            this.ay[var44] = var42;
         }

         if (var45 == 2) {
            var41 = var42;
            var42 = var4.cp(1852961566) + var43;
            var43 = var42;
            this.at[var44] = var40;
            this.aa[var44] = var41;
            this.ay[var44] = var42;
         }

         if (var45 == 3) {
            var40 = var42;
            var42 = var4.cp(2134788758) + var43;
            var43 = var42;
            this.at[var44] = var40;
            this.aa[var44] = var41;
            this.ay[var44] = var42;
         }

         if (var45 == 4) {
            var46 = var40;
            var40 = var41;
            var41 = var46;
            var42 = var4.cp(1913336868) + var43;
            var43 = var42;
            this.at[var44] = var40;
            this.aa[var44] = var46;
            this.ay[var44] = var42;
         }
      }

      var4.at = var33 * -622675180;

      for(var44 = 0; var44 < var11; ++var44) {
         this.as[var44] = 0;
         this.aj[var44] = (short)var4.cl(157433969);
         this.ak[var44] = (short)var4.cl(-1767623883);
         this.az[var44] = (short)var4.cl(-824226202);
      }

      if (this.ag != null) {
         boolean var47 = false;

         for(var45 = 0; var45 < var10; ++var45) {
            var46 = this.ag[var45] & 255;
            if (var46 != 1939300498) {
               if ((this.aj[var46] & -337379429) == this.at[var45] && (this.ak[var46] & '\uffff') == this.aa[var45] && (this.az[var46] & -219126114) == this.ay[var45]) {
                  this.ag[var45] = -1;
               } else {
                  var47 = true;
               }
            }
         }

         if (!var47) {
            this.ag = null;
         }
      }

      if (!var3) {
         this.av = null;
      }

      if (!var2) {
         this.ao = null;
      }

   }

   void bn(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      sg var4 = new sg(var1);
      sg var5 = new sg(var1);
      sg var6 = new sg(var1);
      sg var7 = new sg(var1);
      sg var8 = new sg(var1);
      var4.at = (var1.length - 23) * -564976068;
      int var9 = var4.cl(-1740913932);
      int var10 = var4.cl(-1801450657);
      int var11 = var4.cm((byte)7);
      int var12 = var4.cm((byte)7);
      int var13 = var4.cm((byte)7);
      int var14 = var4.cm((byte)7);
      int var15 = var4.cm((byte)7);
      int var16 = var4.cm((byte)7);
      int var17 = var4.cm((byte)7);
      int var18 = var4.cl(-165341302);
      int var19 = var4.cl(81637524);
      int var20 = var4.cl(-1626630863);
      int var21 = var4.cl(691133078);
      int var22 = var4.cl(-559699642);
      int var23 = 0;
      byte var24 = (byte)var23;
      var23 += var9;
      int var25 = var23;
      var23 += var10;
      int var26 = var23;
      if (var13 == 255) {
         var23 += var10;
      }

      int var27 = var23;
      if (var15 == 1) {
         var23 += var10;
      }

      int var28 = var23;
      if (var12 == 1) {
         var23 += var10;
      }

      int var29 = var23;
      var23 += var22;
      int var30 = var23;
      if (var14 == 1) {
         var23 += var10;
      }

      int var31 = var23;
      var23 += var21;
      int var32 = var23;
      var23 += var10 * 2;
      int var33 = var23;
      var23 += var11 * 6;
      int var34 = var23;
      var23 += var18;
      int var35 = var23;
      var23 += var19;
      int var10000 = var23 + var20;
      this.ac = var9;
      this.al = var10;
      this.am = var11;
      this.au = new int[var9];
      this.ab = new int[var9];
      this.aq = new int[var9];
      this.at = new int[var10];
      this.aa = new int[var10];
      this.ay = new int[var10];
      if (var11 > 0) {
         this.as = new byte[var11];
         this.aj = new short[var11];
         this.ak = new short[var11];
         this.az = new short[var11];
      }

      if (var16 == 1) {
         this.ad = new int[var9];
      }

      if (var12 == 1) {
         this.ao = new byte[var10];
         this.ag = new byte[var10];
         this.av = new short[var10];
      }

      if (var13 == 255) {
         this.ax = new byte[var10];
      } else {
         this.ar = (byte)var13;
      }

      if (var14 == 1) {
         this.ai = new byte[var10];
      }

      if (var15 == 1) {
         this.ae = new int[var10];
      }

      if (var17 == 1) {
         this.bb = new int[var9][];
         this.bi = new int[var9][];
      }

      this.ah = new short[var10];
      var4.at = var24 * -1555996293;
      var5.at = var34 * -1516355947;
      var6.at = var35 * -1516355947;
      var7.at = var23 * -1516355947;
      var8.at = var29 * -1516355947;
      int var37 = 0;
      int var38 = 0;
      int var39 = 0;

      int var40;
      int var41;
      int var42;
      int var43;
      int var44;
      for(var40 = 0; var40 < var9; ++var40) {
         var41 = var4.cm((byte)7);
         var42 = 0;
         if ((var41 & 1) != 0) {
            var42 = var5.cp(1713515672);
         }

         var43 = 0;
         if ((var41 & 2) != 0) {
            var43 = var6.cp(2082882231);
         }

         var44 = 0;
         if ((var41 & 4) != 0) {
            var44 = var7.cp(2056703425);
         }

         this.au[var40] = var37 + var42;
         this.ab[var40] = var38 + var43;
         this.aq[var40] = var39 + var44;
         var37 = this.au[var40];
         var38 = this.ab[var40];
         var39 = this.aq[var40];
         if (var16 == 1) {
            this.ad[var40] = var8.cm((byte)7);
         }
      }

      if (var17 == 1) {
         for(var40 = 0; var40 < var9; ++var40) {
            var41 = var8.cm((byte)7);
            this.bb[var40] = new int[var41];
            this.bi[var40] = new int[var41];

            for(var42 = 0; var42 < var41; ++var42) {
               this.bb[var40][var42] = var8.cm((byte)7);
               this.bi[var40][var42] = var8.cm((byte)7);
            }
         }
      }

      var4.at = var32 * -1516355947;
      var5.at = var28 * -1516355947;
      var6.at = var26 * -1247086320;
      var7.at = var30 * -1516355947;
      var8.at = var27 * -1516355947;

      for(var40 = 0; var40 < var10; ++var40) {
         this.ah[var40] = (short)var4.cl(211901909);
         if (var12 == 1) {
            var41 = var5.cm((byte)7);
            if ((var41 & 1) == 1) {
               this.ao[var40] = 1;
               var2 = true;
            } else {
               this.ao[var40] = 0;
            }

            if ((var41 & 2) == 2) {
               this.ag[var40] = (byte)(var41 >> 2);
               this.av[var40] = this.ah[var40];
               this.ah[var40] = 127;
               if (this.av[var40] != -1) {
                  var3 = true;
               }
            } else {
               this.ag[var40] = -1;
               this.av[var40] = -1;
            }
         }

         if (var13 == -1116545397) {
            this.ax[var40] = var6.cf(435772489);
         }

         if (var14 == 1) {
            this.ai[var40] = var7.cf(435772489);
         }

         if (var15 == 1) {
            this.ae[var40] = var8.cm((byte)7);
         }
      }

      var4.at = var31 * -1516355947;
      var5.at = var25 * -1516355947;
      var40 = 0;
      var41 = 0;
      var42 = 0;
      var43 = 0;

      int var45;
      int var46;
      for(var44 = 0; var44 < var10; ++var44) {
         var45 = var5.cm((byte)7);
         if (var45 == 1) {
            var40 = var4.cp(1629932391) + var43;
            var41 = var4.cp(1887472618) + var40;
            var42 = var4.cp(1770568984) + var41;
            var43 = var42;
            this.at[var44] = var40;
            this.aa[var44] = var41;
            this.ay[var44] = var42;
         }

         if (var45 == 2) {
            var41 = var42;
            var42 = var4.cp(1504041332) + var43;
            var43 = var42;
            this.at[var44] = var40;
            this.aa[var44] = var41;
            this.ay[var44] = var42;
         }

         if (var45 == 3) {
            var40 = var42;
            var42 = var4.cp(1357261566) + var43;
            var43 = var42;
            this.at[var44] = var40;
            this.aa[var44] = var41;
            this.ay[var44] = var42;
         }

         if (var45 == 4) {
            var46 = var40;
            var40 = var41;
            var41 = var46;
            var42 = var4.cp(1298454893) + var43;
            var43 = var42;
            this.at[var44] = var40;
            this.aa[var44] = var46;
            this.ay[var44] = var42;
         }
      }

      var4.at = var33 * -543080197;

      for(var44 = 0; var44 < var11; ++var44) {
         this.as[var44] = 0;
         this.aj[var44] = (short)var4.cl(-852923187);
         this.ak[var44] = (short)var4.cl(-762604894);
         this.az[var44] = (short)var4.cl(-1183019094);
      }

      if (this.ag != null) {
         boolean var47 = false;

         for(var45 = 0; var45 < var10; ++var45) {
            var46 = this.ag[var45] & -1822958812;
            if (var46 != 255) {
               if ((this.aj[var46] & '\uffff') == this.at[var45] && (this.ak[var46] & -1147403601) == this.aa[var45] && (this.az[var46] & 932224408) == this.ay[var45]) {
                  this.ag[var45] = -1;
               } else {
                  var47 = true;
               }
            }
         }

         if (!var47) {
            this.ag = null;
         }
      }

      if (!var3) {
         this.av = null;
      }

      if (!var2) {
         this.ao = null;
      }

   }

   final int ay(iz var1, int var2) {
      int var3 = -1;
      int var4 = var1.au[var2];
      int var5 = var1.ab[var2];
      int var6 = var1.aq[var2];

      for(int var7 = 0; var7 < this.ac; ++var7) {
         if (var4 == this.au[var7] && var5 == this.ab[var7] && var6 == this.aq[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.au[this.ac] = var4;
         this.ab[this.ac] = var5;
         this.aq[this.ac] = var6;
         if (var1.ad != null) {
            this.ad[this.ac] = var1.ad[var2];
         }

         if (var1.bb != null) {
            this.bb[this.ac] = var1.bb[var2];
            this.bi[this.ac] = var1.bi[var2];
         }

         var3 = this.ac++;
      }

      return var3;
   }

   void br(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      sg var4 = new sg(var1);
      sg var5 = new sg(var1);
      sg var6 = new sg(var1);
      sg var7 = new sg(var1);
      sg var8 = new sg(var1);
      var4.at = (var1.length - 23) * -1516355947;
      int var9 = var4.cl(-667046969);
      int var10 = var4.cl(-80793991);
      int var11 = var4.cm((byte)7);
      int var12 = var4.cm((byte)7);
      int var13 = var4.cm((byte)7);
      int var14 = var4.cm((byte)7);
      int var15 = var4.cm((byte)7);
      int var16 = var4.cm((byte)7);
      int var17 = var4.cm((byte)7);
      int var18 = var4.cl(104260321);
      int var19 = var4.cl(-1904330870);
      int var20 = var4.cl(-259049036);
      int var21 = var4.cl(709730654);
      int var22 = var4.cl(-602239247);
      int var23 = 0;
      byte var24 = (byte)var23;
      var23 += var9;
      int var25 = var23;
      var23 += var10;
      int var26 = var23;
      if (var13 == 255) {
         var23 += var10;
      }

      int var27 = var23;
      if (var15 == 1) {
         var23 += var10;
      }

      int var28 = var23;
      if (var12 == 1) {
         var23 += var10;
      }

      int var29 = var23;
      var23 += var22;
      int var30 = var23;
      if (var14 == 1) {
         var23 += var10;
      }

      int var31 = var23;
      var23 += var21;
      int var32 = var23;
      var23 += var10 * 2;
      int var33 = var23;
      var23 += var11 * 6;
      int var34 = var23;
      var23 += var18;
      int var35 = var23;
      var23 += var19;
      int var10000 = var23 + var20;
      this.ac = var9;
      this.al = var10;
      this.am = var11;
      this.au = new int[var9];
      this.ab = new int[var9];
      this.aq = new int[var9];
      this.at = new int[var10];
      this.aa = new int[var10];
      this.ay = new int[var10];
      if (var11 > 0) {
         this.as = new byte[var11];
         this.aj = new short[var11];
         this.ak = new short[var11];
         this.az = new short[var11];
      }

      if (var16 == 1) {
         this.ad = new int[var9];
      }

      if (var12 == 1) {
         this.ao = new byte[var10];
         this.ag = new byte[var10];
         this.av = new short[var10];
      }

      if (var13 == 255) {
         this.ax = new byte[var10];
      } else {
         this.ar = (byte)var13;
      }

      if (var14 == 1) {
         this.ai = new byte[var10];
      }

      if (var15 == 1) {
         this.ae = new int[var10];
      }

      if (var17 == 1) {
         this.bb = new int[var9][];
         this.bi = new int[var9][];
      }

      this.ah = new short[var10];
      var4.at = var24 * -1516355947;
      var5.at = var34 * -1516355947;
      var6.at = var35 * -1516355947;
      var7.at = var23 * -1516355947;
      var8.at = var29 * -1516355947;
      int var37 = 0;
      int var38 = 0;
      int var39 = 0;

      int var40;
      int var41;
      int var42;
      int var43;
      int var44;
      for(var40 = 0; var40 < var9; ++var40) {
         var41 = var4.cm((byte)7);
         var42 = 0;
         if ((var41 & 1) != 0) {
            var42 = var5.cp(2056520271);
         }

         var43 = 0;
         if ((var41 & 2) != 0) {
            var43 = var6.cp(1735217890);
         }

         var44 = 0;
         if ((var41 & 4) != 0) {
            var44 = var7.cp(1470238110);
         }

         this.au[var40] = var37 + var42;
         this.ab[var40] = var38 + var43;
         this.aq[var40] = var39 + var44;
         var37 = this.au[var40];
         var38 = this.ab[var40];
         var39 = this.aq[var40];
         if (var16 == 1) {
            this.ad[var40] = var8.cm((byte)7);
         }
      }

      if (var17 == 1) {
         for(var40 = 0; var40 < var9; ++var40) {
            var41 = var8.cm((byte)7);
            this.bb[var40] = new int[var41];
            this.bi[var40] = new int[var41];

            for(var42 = 0; var42 < var41; ++var42) {
               this.bb[var40][var42] = var8.cm((byte)7);
               this.bi[var40][var42] = var8.cm((byte)7);
            }
         }
      }

      var4.at = var32 * -1516355947;
      var5.at = var28 * -1516355947;
      var6.at = var26 * -1516355947;
      var7.at = var30 * -1516355947;
      var8.at = var27 * -1516355947;

      for(var40 = 0; var40 < var10; ++var40) {
         this.ah[var40] = (short)var4.cl(-978439996);
         if (var12 == 1) {
            var41 = var5.cm((byte)7);
            if ((var41 & 1) == 1) {
               this.ao[var40] = 1;
               var2 = true;
            } else {
               this.ao[var40] = 0;
            }

            if ((var41 & 2) == 2) {
               this.ag[var40] = (byte)(var41 >> 2);
               this.av[var40] = this.ah[var40];
               this.ah[var40] = 127;
               if (this.av[var40] != -1) {
                  var3 = true;
               }
            } else {
               this.ag[var40] = -1;
               this.av[var40] = -1;
            }
         }

         if (var13 == 255) {
            this.ax[var40] = var6.cf(435772489);
         }

         if (var14 == 1) {
            this.ai[var40] = var7.cf(435772489);
         }

         if (var15 == 1) {
            this.ae[var40] = var8.cm((byte)7);
         }
      }

      var4.at = var31 * -1516355947;
      var5.at = var25 * -1516355947;
      var40 = 0;
      var41 = 0;
      var42 = 0;
      var43 = 0;

      int var45;
      int var46;
      for(var44 = 0; var44 < var10; ++var44) {
         var45 = var5.cm((byte)7);
         if (var45 == 1) {
            var40 = var4.cp(1170686617) + var43;
            var41 = var4.cp(1205600844) + var40;
            var42 = var4.cp(1547249996) + var41;
            var43 = var42;
            this.at[var44] = var40;
            this.aa[var44] = var41;
            this.ay[var44] = var42;
         }

         if (var45 == 2) {
            var41 = var42;
            var42 = var4.cp(1904745011) + var43;
            var43 = var42;
            this.at[var44] = var40;
            this.aa[var44] = var41;
            this.ay[var44] = var42;
         }

         if (var45 == 3) {
            var40 = var42;
            var42 = var4.cp(1989160451) + var43;
            var43 = var42;
            this.at[var44] = var40;
            this.aa[var44] = var41;
            this.ay[var44] = var42;
         }

         if (var45 == 4) {
            var46 = var40;
            var40 = var41;
            var41 = var46;
            var42 = var4.cp(1910980656) + var43;
            var43 = var42;
            this.at[var44] = var40;
            this.aa[var44] = var46;
            this.ay[var44] = var42;
         }
      }

      var4.at = var33 * -1516355947;

      for(var44 = 0; var44 < var11; ++var44) {
         this.as[var44] = 0;
         this.aj[var44] = (short)var4.cl(-1538493556);
         this.ak[var44] = (short)var4.cl(-1776332859);
         this.az[var44] = (short)var4.cl(660697426);
      }

      if (this.ag != null) {
         boolean var47 = false;

         for(var45 = 0; var45 < var10; ++var45) {
            var46 = this.ag[var45] & 255;
            if (var46 != 255) {
               if ((this.aj[var46] & '\uffff') == this.at[var45] && (this.ak[var46] & '\uffff') == this.aa[var45] && (this.az[var46] & '\uffff') == this.ay[var45]) {
                  this.ag[var45] = -1;
               } else {
                  var47 = true;
               }
            }
         }

         if (!var47) {
            this.ag = null;
         }
      }

      if (!var3) {
         this.av = null;
      }

      if (!var2) {
         this.ao = null;
      }

   }

   void bg(byte[] var1) {
      sg var2 = new sg(var1);
      sg var3 = new sg(var1);
      sg var4 = new sg(var1);
      sg var5 = new sg(var1);
      sg var6 = new sg(var1);
      sg var7 = new sg(var1);
      sg var8 = new sg(var1);
      var2.at = (var1.length - 23) * -1516355947;
      int var9 = var2.cl(-1388923165);
      int var10 = var2.cl(-57692333);
      int var11 = var2.cm((byte)7);
      int var12 = var2.cm((byte)7);
      int var13 = var2.cm((byte)7);
      int var14 = var2.cm((byte)7);
      int var15 = var2.cm((byte)7);
      int var16 = var2.cm((byte)7);
      int var17 = var2.cm((byte)7);
      int var18 = var2.cl(-749453996);
      int var19 = var2.cl(-1908684387);
      int var20 = var2.cl(-779863720);
      int var21 = var2.cl(-654249997);
      int var22 = var2.cl(-822099427);
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if (var11 > 0) {
         this.as = new byte[var11];
         var2.at = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.as[var26] = var2.cf(435772489);
            if (var27 == 0) {
               ++var23;
            }

            if (var27 >= 1 && var27 <= 3) {
               ++var24;
            }

            if (var27 == 2) {
               ++var25;
            }
         }
      }

      var26 = var11 + var9;
      int var28 = var26;
      if (var12 == 1) {
         var26 += var10;
      }

      int var29 = var26;
      var26 += var10;
      int var30 = var26;
      if (var13 == 255) {
         var26 += var10;
      }

      int var31 = var26;
      if (var15 == 1) {
         var26 += var10;
      }

      int var32 = var26;
      if (var17 == 1) {
         var26 += var9;
      }

      int var33 = var26;
      if (var14 == 1) {
         var26 += var10;
      }

      int var34 = var26;
      var26 += var21;
      int var35 = var26;
      if (var16 == 1) {
         var26 += var10 * 2;
      }

      int var36 = var26;
      var26 += var22;
      int var37 = var26;
      var26 += var10 * 2;
      int var38 = var26;
      var26 += var18;
      int var39 = var26;
      var26 += var19;
      int var40 = var26;
      var26 += var20;
      int var41 = var26;
      var26 += var23 * 6;
      int var42 = var26;
      var26 += var24 * 6;
      int var43 = var26;
      var26 += var24 * 6;
      int var44 = var26;
      var26 += var24 * 2;
      int var45 = var26;
      var26 += var24;
      int var46 = var26;
      var26 += var24 * 2 + var25 * 2;
      this.ac = var9;
      this.al = var10;
      this.am = var11;
      this.au = new int[var9];
      this.ab = new int[var9];
      this.aq = new int[var9];
      this.at = new int[var10];
      this.aa = new int[var10];
      this.ay = new int[var10];
      if (var17 == 1) {
         this.ad = new int[var9];
      }

      if (var12 == 1) {
         this.ao = new byte[var10];
      }

      if (var13 == 255) {
         this.ax = new byte[var10];
      } else {
         this.ar = (byte)var13;
      }

      if (var14 == 1) {
         this.ai = new byte[var10];
      }

      if (var15 == 1) {
         this.ae = new int[var10];
      }

      if (var16 == 1) {
         this.av = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.ag = new byte[var10];
      }

      this.ah = new short[var10];
      if (var11 > 0) {
         this.aj = new short[var11];
         this.ak = new short[var11];
         this.az = new short[var11];
      }

      var2.at = var11 * -1516355947;
      var3.at = var38 * -1516355947;
      var4.at = var39 * -1516355947;
      var5.at = var40 * -1516355947;
      var6.at = var32 * -1516355947;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      int var51;
      int var52;
      int var53;
      int var54;
      int var55;
      for(var51 = 0; var51 < var9; ++var51) {
         var52 = var2.cm((byte)7);
         var53 = 0;
         if ((var52 & 1) != 0) {
            var53 = var3.cp(1593400190);
         }

         var54 = 0;
         if ((var52 & 2) != 0) {
            var54 = var4.cp(2082736074);
         }

         var55 = 0;
         if ((var52 & 4) != 0) {
            var55 = var5.cp(1920057725);
         }

         this.au[var51] = var48 + var53;
         this.ab[var51] = var49 + var54;
         this.aq[var51] = var50 + var55;
         var48 = this.au[var51];
         var49 = this.ab[var51];
         var50 = this.aq[var51];
         if (var17 == 1) {
            this.ad[var51] = var6.cm((byte)7);
         }
      }

      var2.at = var37 * -1516355947;
      var3.at = var28 * -1516355947;
      var4.at = var30 * -1516355947;
      var5.at = var33 * -1516355947;
      var6.at = var31 * -1516355947;
      var7.at = var35 * -1516355947;
      var8.at = var36 * -1516355947;

      for(var51 = 0; var51 < var10; ++var51) {
         this.ah[var51] = (short)var2.cl(-1375859412);
         if (var12 == 1) {
            this.ao[var51] = var3.cf(435772489);
         }

         if (var13 == 255) {
            this.ax[var51] = var4.cf(435772489);
         }

         if (var14 == 1) {
            this.ai[var51] = var5.cf(435772489);
         }

         if (var15 == 1) {
            this.ae[var51] = var6.cm((byte)7);
         }

         if (var16 == 1) {
            this.av[var51] = (short)(var7.cl(-46432988) - 1);
         }

         if (this.ag != null && this.av[var51] != -1) {
            this.ag[var51] = (byte)(var8.cm((byte)7) - 1);
         }
      }

      var2.at = var34 * -1516355947;
      var3.at = var29 * -1516355947;
      var51 = 0;
      var52 = 0;
      var53 = 0;
      var54 = 0;

      int var56;
      for(var55 = 0; var55 < var10; ++var55) {
         var56 = var3.cm((byte)7);
         if (var56 == 1) {
            var51 = var2.cp(1500602142) + var54;
            var52 = var2.cp(1209932887) + var51;
            var53 = var2.cp(1786318645) + var52;
            var54 = var53;
            this.at[var55] = var51;
            this.aa[var55] = var52;
            this.ay[var55] = var53;
         }

         if (var56 == 2) {
            var52 = var53;
            var53 = var2.cp(1700630260) + var54;
            var54 = var53;
            this.at[var55] = var51;
            this.aa[var55] = var52;
            this.ay[var55] = var53;
         }

         if (var56 == 3) {
            var51 = var53;
            var53 = var2.cp(1577794286) + var54;
            var54 = var53;
            this.at[var55] = var51;
            this.aa[var55] = var52;
            this.ay[var55] = var53;
         }

         if (var56 == 4) {
            int var57 = var51;
            var51 = var52;
            var52 = var57;
            var53 = var2.cp(1612023953) + var54;
            var54 = var53;
            this.at[var55] = var51;
            this.aa[var55] = var57;
            this.ay[var55] = var53;
         }
      }

      var2.at = var41 * -1516355947;
      var3.at = var42 * -1516355947;
      var4.at = var43 * -1516355947;
      var5.at = var44 * -1516355947;
      var6.at = var45 * -1516355947;
      var7.at = var46 * -1516355947;

      for(var55 = 0; var55 < var11; ++var55) {
         var56 = this.as[var55] & 255;
         if (var56 == 0) {
            this.aj[var55] = (short)var2.cl(-1491410133);
            this.ak[var55] = (short)var2.cl(-1747759796);
            this.az[var55] = (short)var2.cl(-471349371);
         }
      }

      var2.at = var26 * -1516355947;
      var55 = var2.cm((byte)7);
      if (var55 != 0) {
         new jo();
         var2.cl(-1670641749);
         var2.cl(563785550);
         var2.cl(-1676890611);
         var2.cx(-1419279539);
      }

   }

   void bu(byte[] var1) {
      sg var2 = new sg(var1);
      sg var3 = new sg(var1);
      sg var4 = new sg(var1);
      sg var5 = new sg(var1);
      sg var6 = new sg(var1);
      sg var7 = new sg(var1);
      sg var8 = new sg(var1);
      var2.at = (var1.length - 23) * -1881752330;
      int var9 = var2.cl(877646025);
      int var10 = var2.cl(-1382833117);
      int var11 = var2.cm((byte)7);
      int var12 = var2.cm((byte)7);
      int var13 = var2.cm((byte)7);
      int var14 = var2.cm((byte)7);
      int var15 = var2.cm((byte)7);
      int var16 = var2.cm((byte)7);
      int var17 = var2.cm((byte)7);
      int var18 = var2.cl(-514482367);
      int var19 = var2.cl(378033897);
      int var20 = var2.cl(-452823571);
      int var21 = var2.cl(-1860409626);
      int var22 = var2.cl(26826262);
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if (var11 > 0) {
         this.as = new byte[var11];
         var2.at = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.as[var26] = var2.cf(435772489);
            if (var27 == 0) {
               ++var23;
            }

            if (var27 >= 1 && var27 <= 3) {
               ++var24;
            }

            if (var27 == 2) {
               ++var25;
            }
         }
      }

      var26 = var11 + var9;
      int var28 = var26;
      if (var12 == 1) {
         var26 += var10;
      }

      int var29 = var26;
      var26 += var10;
      int var30 = var26;
      if (var13 == 679788973) {
         var26 += var10;
      }

      int var31 = var26;
      if (var15 == 1) {
         var26 += var10;
      }

      int var32 = var26;
      if (var17 == 1) {
         var26 += var9;
      }

      int var33 = var26;
      if (var14 == 1) {
         var26 += var10;
      }

      int var34 = var26;
      var26 += var21;
      int var35 = var26;
      if (var16 == 1) {
         var26 += var10 * 2;
      }

      int var36 = var26;
      var26 += var22;
      int var37 = var26;
      var26 += var10 * 2;
      int var38 = var26;
      var26 += var18;
      int var39 = var26;
      var26 += var19;
      int var40 = var26;
      var26 += var20;
      int var41 = var26;
      var26 += var23 * 6;
      int var42 = var26;
      var26 += var24 * 6;
      int var43 = var26;
      var26 += var24 * 6;
      int var44 = var26;
      var26 += var24 * 2;
      int var45 = var26;
      var26 += var24;
      int var46 = var26;
      var26 += var24 * 2 + var25 * 2;
      this.ac = var9;
      this.al = var10;
      this.am = var11;
      this.au = new int[var9];
      this.ab = new int[var9];
      this.aq = new int[var9];
      this.at = new int[var10];
      this.aa = new int[var10];
      this.ay = new int[var10];
      if (var17 == 1) {
         this.ad = new int[var9];
      }

      if (var12 == 1) {
         this.ao = new byte[var10];
      }

      if (var13 == 255) {
         this.ax = new byte[var10];
      } else {
         this.ar = (byte)var13;
      }

      if (var14 == 1) {
         this.ai = new byte[var10];
      }

      if (var15 == 1) {
         this.ae = new int[var10];
      }

      if (var16 == 1) {
         this.av = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.ag = new byte[var10];
      }

      this.ah = new short[var10];
      if (var11 > 0) {
         this.aj = new short[var11];
         this.ak = new short[var11];
         this.az = new short[var11];
      }

      var2.at = var11 * -172971331;
      var3.at = var38 * -35623277;
      var4.at = var39 * -1516355947;
      var5.at = var40 * -1958171409;
      var6.at = var32 * -959047756;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      int var51;
      int var52;
      int var53;
      int var54;
      int var55;
      for(var51 = 0; var51 < var9; ++var51) {
         var52 = var2.cm((byte)7);
         var53 = 0;
         if ((var52 & 1) != 0) {
            var53 = var3.cp(1147458043);
         }

         var54 = 0;
         if ((var52 & 2) != 0) {
            var54 = var4.cp(1215634204);
         }

         var55 = 0;
         if ((var52 & 4) != 0) {
            var55 = var5.cp(1115920956);
         }

         this.au[var51] = var48 + var53;
         this.ab[var51] = var49 + var54;
         this.aq[var51] = var50 + var55;
         var48 = this.au[var51];
         var49 = this.ab[var51];
         var50 = this.aq[var51];
         if (var17 == 1) {
            this.ad[var51] = var6.cm((byte)7);
         }
      }

      var2.at = var37 * -1516355947;
      var3.at = var28 * -1516355947;
      var4.at = var30 * -1516355947;
      var5.at = var33 * -1516355947;
      var6.at = var31 * 949914880;
      var7.at = var35 * 702585222;
      var8.at = var36 * -1516355947;

      for(var51 = 0; var51 < var10; ++var51) {
         this.ah[var51] = (short)var2.cl(324474659);
         if (var12 == 1) {
            this.ao[var51] = var3.cf(435772489);
         }

         if (var13 == 255) {
            this.ax[var51] = var4.cf(435772489);
         }

         if (var14 == 1) {
            this.ai[var51] = var5.cf(435772489);
         }

         if (var15 == 1) {
            this.ae[var51] = var6.cm((byte)7);
         }

         if (var16 == 1) {
            this.av[var51] = (short)(var7.cl(615848648) - 1);
         }

         if (this.ag != null && this.av[var51] != -1) {
            this.ag[var51] = (byte)(var8.cm((byte)7) - 1);
         }
      }

      var2.at = var34 * -714773712;
      var3.at = var29 * -1516355947;
      var51 = 0;
      var52 = 0;
      var53 = 0;
      var54 = 0;

      int var56;
      for(var55 = 0; var55 < var10; ++var55) {
         var56 = var3.cm((byte)7);
         if (var56 == 1) {
            var51 = var2.cp(1837054225) + var54;
            var52 = var2.cp(1113772602) + var51;
            var53 = var2.cp(1254946264) + var52;
            var54 = var53;
            this.at[var55] = var51;
            this.aa[var55] = var52;
            this.ay[var55] = var53;
         }

         if (var56 == 2) {
            var52 = var53;
            var53 = var2.cp(2146343938) + var54;
            var54 = var53;
            this.at[var55] = var51;
            this.aa[var55] = var52;
            this.ay[var55] = var53;
         }

         if (var56 == 3) {
            var51 = var53;
            var53 = var2.cp(2009171629) + var54;
            var54 = var53;
            this.at[var55] = var51;
            this.aa[var55] = var52;
            this.ay[var55] = var53;
         }

         if (var56 == 4) {
            int var57 = var51;
            var51 = var52;
            var52 = var57;
            var53 = var2.cp(1620572083) + var54;
            var54 = var53;
            this.at[var55] = var51;
            this.aa[var55] = var57;
            this.ay[var55] = var53;
         }
      }

      var2.at = var41 * -1516355947;
      var3.at = var42 * -1516355947;
      var4.at = var43 * 1298691582;
      var5.at = var44 * -1516355947;
      var6.at = var45 * -1516355947;
      var7.at = var46 * -1516355947;

      for(var55 = 0; var55 < var11; ++var55) {
         var56 = this.as[var55] & 255;
         if (var56 == 0) {
            this.aj[var55] = (short)var2.cl(680363229);
            this.ak[var55] = (short)var2.cl(-395853234);
            this.az[var55] = (short)var2.cl(-956434090);
         }
      }

      var2.at = var26 * -1516355947;
      var55 = var2.cm((byte)7);
      if (var55 != 0) {
         new jo();
         var2.cl(-1931916400);
         var2.cl(-543930985);
         var2.cl(612411741);
         var2.cx(-1791881492);
      }

   }

   void bf(byte[] var1) {
      sg var2 = new sg(var1);
      sg var3 = new sg(var1);
      sg var4 = new sg(var1);
      sg var5 = new sg(var1);
      sg var6 = new sg(var1);
      sg var7 = new sg(var1);
      sg var8 = new sg(var1);
      var2.at = (var1.length - 23) * -1516355947;
      int var9 = var2.cl(-394905058);
      int var10 = var2.cl(-1293106094);
      int var11 = var2.cm((byte)7);
      int var12 = var2.cm((byte)7);
      int var13 = var2.cm((byte)7);
      int var14 = var2.cm((byte)7);
      int var15 = var2.cm((byte)7);
      int var16 = var2.cm((byte)7);
      int var17 = var2.cm((byte)7);
      int var18 = var2.cl(-559471947);
      int var19 = var2.cl(-1027872175);
      int var20 = var2.cl(-784992277);
      int var21 = var2.cl(-209960889);
      int var22 = var2.cl(628339674);
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if (var11 > 0) {
         this.as = new byte[var11];
         var2.at = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.as[var26] = var2.cf(435772489);
            if (var27 == 0) {
               ++var23;
            }

            if (var27 >= 1 && var27 <= 3) {
               ++var24;
            }

            if (var27 == 2) {
               ++var25;
            }
         }
      }

      var26 = var11 + var9;
      int var28 = var26;
      if (var12 == 1) {
         var26 += var10;
      }

      int var29 = var26;
      var26 += var10;
      int var30 = var26;
      if (var13 == 1137300336) {
         var26 += var10;
      }

      int var31 = var26;
      if (var15 == 1) {
         var26 += var10;
      }

      int var32 = var26;
      if (var17 == 1) {
         var26 += var9;
      }

      int var33 = var26;
      if (var14 == 1) {
         var26 += var10;
      }

      int var34 = var26;
      var26 += var21;
      int var35 = var26;
      if (var16 == 1) {
         var26 += var10 * 2;
      }

      int var36 = var26;
      var26 += var22;
      int var37 = var26;
      var26 += var10 * 2;
      int var38 = var26;
      var26 += var18;
      int var39 = var26;
      var26 += var19;
      int var40 = var26;
      var26 += var20;
      int var41 = var26;
      var26 += var23 * 6;
      int var42 = var26;
      var26 += var24 * 6;
      int var43 = var26;
      var26 += var24 * 6;
      int var44 = var26;
      var26 += var24 * 2;
      int var45 = var26;
      var26 += var24;
      int var46 = var26;
      var26 += var24 * 2 + var25 * 2;
      this.ac = var9;
      this.al = var10;
      this.am = var11;
      this.au = new int[var9];
      this.ab = new int[var9];
      this.aq = new int[var9];
      this.at = new int[var10];
      this.aa = new int[var10];
      this.ay = new int[var10];
      if (var17 == 1) {
         this.ad = new int[var9];
      }

      if (var12 == 1) {
         this.ao = new byte[var10];
      }

      if (var13 == 888031703) {
         this.ax = new byte[var10];
      } else {
         this.ar = (byte)var13;
      }

      if (var14 == 1) {
         this.ai = new byte[var10];
      }

      if (var15 == 1) {
         this.ae = new int[var10];
      }

      if (var16 == 1) {
         this.av = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.ag = new byte[var10];
      }

      this.ah = new short[var10];
      if (var11 > 0) {
         this.aj = new short[var11];
         this.ak = new short[var11];
         this.az = new short[var11];
      }

      var2.at = var11 * -1516355947;
      var3.at = var38 * -1516355947;
      var4.at = var39 * -129701827;
      var5.at = var40 * 2125241828;
      var6.at = var32 * 1049624243;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      int var51;
      int var52;
      int var53;
      int var54;
      int var55;
      for(var51 = 0; var51 < var9; ++var51) {
         var52 = var2.cm((byte)7);
         var53 = 0;
         if ((var52 & 1) != 0) {
            var53 = var3.cp(1121042438);
         }

         var54 = 0;
         if ((var52 & 2) != 0) {
            var54 = var4.cp(1148201400);
         }

         var55 = 0;
         if ((var52 & 4) != 0) {
            var55 = var5.cp(1676285758);
         }

         this.au[var51] = var48 + var53;
         this.ab[var51] = var49 + var54;
         this.aq[var51] = var50 + var55;
         var48 = this.au[var51];
         var49 = this.ab[var51];
         var50 = this.aq[var51];
         if (var17 == 1) {
            this.ad[var51] = var6.cm((byte)7);
         }
      }

      var2.at = var37 * -1516355947;
      var3.at = var28 * -1439674309;
      var4.at = var30 * -1707164273;
      var5.at = var33 * -479614196;
      var6.at = var31 * -1516355947;
      var7.at = var35 * 941522642;
      var8.at = var36 * 717868435;

      for(var51 = 0; var51 < var10; ++var51) {
         this.ah[var51] = (short)var2.cl(739840872);
         if (var12 == 1) {
            this.ao[var51] = var3.cf(435772489);
         }

         if (var13 == 43328877) {
            this.ax[var51] = var4.cf(435772489);
         }

         if (var14 == 1) {
            this.ai[var51] = var5.cf(435772489);
         }

         if (var15 == 1) {
            this.ae[var51] = var6.cm((byte)7);
         }

         if (var16 == 1) {
            this.av[var51] = (short)(var7.cl(-1092471975) - 1);
         }

         if (this.ag != null && this.av[var51] != -1) {
            this.ag[var51] = (byte)(var8.cm((byte)7) - 1);
         }
      }

      var2.at = var34 * -1516355947;
      var3.at = var29 * -1516355947;
      var51 = 0;
      var52 = 0;
      var53 = 0;
      var54 = 0;

      int var56;
      for(var55 = 0; var55 < var10; ++var55) {
         var56 = var3.cm((byte)7);
         if (var56 == 1) {
            var51 = var2.cp(1946398222) + var54;
            var52 = var2.cp(1295108664) + var51;
            var53 = var2.cp(1338659927) + var52;
            var54 = var53;
            this.at[var55] = var51;
            this.aa[var55] = var52;
            this.ay[var55] = var53;
         }

         if (var56 == 2) {
            var52 = var53;
            var53 = var2.cp(2064125566) + var54;
            var54 = var53;
            this.at[var55] = var51;
            this.aa[var55] = var52;
            this.ay[var55] = var53;
         }

         if (var56 == 3) {
            var51 = var53;
            var53 = var2.cp(1527173862) + var54;
            var54 = var53;
            this.at[var55] = var51;
            this.aa[var55] = var52;
            this.ay[var55] = var53;
         }

         if (var56 == 4) {
            int var57 = var51;
            var51 = var52;
            var52 = var57;
            var53 = var2.cp(2147183446) + var54;
            var54 = var53;
            this.at[var55] = var51;
            this.aa[var55] = var57;
            this.ay[var55] = var53;
         }
      }

      var2.at = var41 * -1516355947;
      var3.at = var42 * -1277208434;
      var4.at = var43 * -1516355947;
      var5.at = var44 * -1986252123;
      var6.at = var45 * -1622838568;
      var7.at = var46 * 893276114;

      for(var55 = 0; var55 < var11; ++var55) {
         var56 = this.as[var55] & -1936644162;
         if (var56 == 0) {
            this.aj[var55] = (short)var2.cl(864802393);
            this.ak[var55] = (short)var2.cl(-1829404334);
            this.az[var55] = (short)var2.cl(-1604487764);
         }
      }

      var2.at = var26 * -1516355947;
      var55 = var2.cm((byte)7);
      if (var55 != 0) {
         new jo();
         var2.cl(-1368395891);
         var2.cl(-320036789);
         var2.cl(-947032577);
         var2.cx(-1189047403);
      }

   }

   void bq(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      sg var4 = new sg(var1);
      sg var5 = new sg(var1);
      sg var6 = new sg(var1);
      sg var7 = new sg(var1);
      sg var8 = new sg(var1);
      var4.at = (var1.length - 18) * -1516355947;
      int var9 = var4.cl(-1523143906);
      int var10 = var4.cl(-1833151557);
      int var11 = var4.cm((byte)7);
      int var12 = var4.cm((byte)7);
      int var13 = var4.cm((byte)7);
      int var14 = var4.cm((byte)7);
      int var15 = var4.cm((byte)7);
      int var16 = var4.cm((byte)7);
      int var17 = var4.cl(454193740);
      int var18 = var4.cl(-802530404);
      int var19 = var4.cl(-1349533948);
      int var20 = var4.cl(220272305);
      int var21 = 0;
      byte var22 = (byte)var21;
      var21 += var9;
      int var23 = var21;
      var21 += var10;
      int var24 = var21;
      if (var13 == 255) {
         var21 += var10;
      }

      int var25 = var21;
      if (var15 == 1) {
         var21 += var10;
      }

      int var26 = var21;
      if (var12 == 1) {
         var21 += var10;
      }

      int var27 = var21;
      if (var16 == 1) {
         var21 += var9;
      }

      int var28 = var21;
      if (var14 == 1) {
         var21 += var10;
      }

      int var29 = var21;
      var21 += var20;
      int var30 = var21;
      var21 += var10 * 2;
      int var31 = var21;
      var21 += var11 * 6;
      int var32 = var21;
      var21 += var17;
      int var33 = var21;
      var21 += var18;
      int var10000 = var21 + var19;
      this.ac = var9;
      this.al = var10;
      this.am = var11;
      this.au = new int[var9];
      this.ab = new int[var9];
      this.aq = new int[var9];
      this.at = new int[var10];
      this.aa = new int[var10];
      this.ay = new int[var10];
      if (var11 > 0) {
         this.as = new byte[var11];
         this.aj = new short[var11];
         this.ak = new short[var11];
         this.az = new short[var11];
      }

      if (var16 == 1) {
         this.ad = new int[var9];
      }

      if (var12 == 1) {
         this.ao = new byte[var10];
         this.ag = new byte[var10];
         this.av = new short[var10];
      }

      if (var13 == 255) {
         this.ax = new byte[var10];
      } else {
         this.ar = (byte)var13;
      }

      if (var14 == 1) {
         this.ai = new byte[var10];
      }

      if (var15 == 1) {
         this.ae = new int[var10];
      }

      this.ah = new short[var10];
      var4.at = var22 * -1516355947;
      var5.at = var32 * -1516355947;
      var6.at = var33 * -1516355947;
      var7.at = var21 * -1516355947;
      var8.at = var27 * -1516355947;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.cm((byte)7);
         var40 = 0;
         if ((var39 & 1) != 0) {
            var40 = var5.cp(1585627127);
         }

         var41 = 0;
         if ((var39 & 2) != 0) {
            var41 = var6.cp(1573900898);
         }

         var42 = 0;
         if ((var39 & 4) != 0) {
            var42 = var7.cp(1201336539);
         }

         this.au[var38] = var35 + var40;
         this.ab[var38] = var36 + var41;
         this.aq[var38] = var37 + var42;
         var35 = this.au[var38];
         var36 = this.ab[var38];
         var37 = this.aq[var38];
         if (var16 == 1) {
            this.ad[var38] = var8.cm((byte)7);
         }
      }

      var4.at = var30 * -1516355947;
      var5.at = var26 * -1516355947;
      var6.at = var24 * -1516355947;
      var7.at = var28 * -1516355947;
      var8.at = var25 * -1516355947;

      for(var38 = 0; var38 < var10; ++var38) {
         this.ah[var38] = (short)var4.cl(-1657772276);
         if (var12 == 1) {
            var39 = var5.cm((byte)7);
            if ((var39 & 1) == 1) {
               this.ao[var38] = 1;
               var2 = true;
            } else {
               this.ao[var38] = 0;
            }

            if ((var39 & 2) == 2) {
               this.ag[var38] = (byte)(var39 >> 2);
               this.av[var38] = this.ah[var38];
               this.ah[var38] = 127;
               if (this.av[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.ag[var38] = -1;
               this.av[var38] = -1;
            }
         }

         if (var13 == 255) {
            this.ax[var38] = var6.cf(435772489);
         }

         if (var14 == 1) {
            this.ai[var38] = var7.cf(435772489);
         }

         if (var15 == 1) {
            this.ae[var38] = var8.cm((byte)7);
         }
      }

      var4.at = var29 * -1516355947;
      var5.at = var23 * -1516355947;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.cm((byte)7);
         if (var43 == 1) {
            var38 = var4.cp(1640612276) + var41;
            var39 = var4.cp(1847229057) + var38;
            var40 = var4.cp(1826890176) + var39;
            var41 = var40;
            this.at[var42] = var38;
            this.aa[var42] = var39;
            this.ay[var42] = var40;
         }

         if (var43 == 2) {
            var39 = var40;
            var40 = var4.cp(1868392443) + var41;
            var41 = var40;
            this.at[var42] = var38;
            this.aa[var42] = var39;
            this.ay[var42] = var40;
         }

         if (var43 == 3) {
            var38 = var40;
            var40 = var4.cp(1472099857) + var41;
            var41 = var40;
            this.at[var42] = var38;
            this.aa[var42] = var39;
            this.ay[var42] = var40;
         }

         if (var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.cp(1364531179) + var41;
            var41 = var40;
            this.at[var42] = var38;
            this.aa[var42] = var44;
            this.ay[var42] = var40;
         }
      }

      var4.at = var31 * -1516355947;

      for(var42 = 0; var42 < var11; ++var42) {
         this.as[var42] = 0;
         this.aj[var42] = (short)var4.cl(637494933);
         this.ak[var42] = (short)var4.cl(-905001244);
         this.az[var42] = (short)var4.cl(-939088024);
      }

      if (this.ag != null) {
         boolean var45 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.ag[var43] & 255;
            if (var44 != 255) {
               if ((this.aj[var44] & '\uffff') == this.at[var43] && (this.ak[var44] & '\uffff') == this.aa[var43] && (this.az[var44] & '\uffff') == this.ay[var43]) {
                  this.ag[var43] = -1;
               } else {
                  var45 = true;
               }
            }
         }

         if (!var45) {
            this.ag = null;
         }
      }

      if (!var3) {
         this.av = null;
      }

      if (!var2) {
         this.ao = null;
      }

   }

   void ac(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      sg var4 = new sg(var1);
      sg var5 = new sg(var1);
      sg var6 = new sg(var1);
      sg var7 = new sg(var1);
      sg var8 = new sg(var1);
      var4.at = (var1.length - 23) * -1516355947;
      int var9 = var4.cl(-514877144);
      int var10 = var4.cl(-1162706547);
      int var11 = var4.cm((byte)7);
      int var12 = var4.cm((byte)7);
      int var13 = var4.cm((byte)7);
      int var14 = var4.cm((byte)7);
      int var15 = var4.cm((byte)7);
      int var16 = var4.cm((byte)7);
      int var17 = var4.cm((byte)7);
      int var18 = var4.cl(-360966121);
      int var19 = var4.cl(-1971720478);
      int var20 = var4.cl(682172629);
      int var21 = var4.cl(375281554);
      int var22 = var4.cl(32636529);
      int var23 = 0;
      byte var24 = (byte)var23;
      var23 += var9;
      int var25 = var23;
      var23 += var10;
      int var26 = var23;
      if (var13 == 255) {
         var23 += var10;
      }

      int var27 = var23;
      if (var15 == 1) {
         var23 += var10;
      }

      int var28 = var23;
      if (var12 == 1) {
         var23 += var10;
      }

      int var29 = var23;
      var23 += var22;
      int var30 = var23;
      if (var14 == 1) {
         var23 += var10;
      }

      int var31 = var23;
      var23 += var21;
      int var32 = var23;
      var23 += var10 * 2;
      int var33 = var23;
      var23 += var11 * 6;
      int var34 = var23;
      var23 += var18;
      int var35 = var23;
      var23 += var19;
      int var10000 = var23 + var20;
      this.ac = var9;
      this.al = var10;
      this.am = var11;
      this.au = new int[var9];
      this.ab = new int[var9];
      this.aq = new int[var9];
      this.at = new int[var10];
      this.aa = new int[var10];
      this.ay = new int[var10];
      if (var11 > 0) {
         this.as = new byte[var11];
         this.aj = new short[var11];
         this.ak = new short[var11];
         this.az = new short[var11];
      }

      if (var16 == 1) {
         this.ad = new int[var9];
      }

      if (var12 == 1) {
         this.ao = new byte[var10];
         this.ag = new byte[var10];
         this.av = new short[var10];
      }

      if (var13 == 255) {
         this.ax = new byte[var10];
      } else {
         this.ar = (byte)var13;
      }

      if (var14 == 1) {
         this.ai = new byte[var10];
      }

      if (var15 == 1) {
         this.ae = new int[var10];
      }

      if (var17 == 1) {
         this.bb = new int[var9][];
         this.bi = new int[var9][];
      }

      this.ah = new short[var10];
      var4.at = var24 * -1516355947;
      var5.at = var34 * -1516355947;
      var6.at = var35 * -1516355947;
      var7.at = var23 * -1516355947;
      var8.at = var29 * -1516355947;
      int var37 = 0;
      int var38 = 0;
      int var39 = 0;

      int var40;
      int var41;
      int var42;
      int var43;
      int var44;
      for(var40 = 0; var40 < var9; ++var40) {
         var41 = var4.cm((byte)7);
         var42 = 0;
         if ((var41 & 1) != 0) {
            var42 = var5.cp(1244062175);
         }

         var43 = 0;
         if ((var41 & 2) != 0) {
            var43 = var6.cp(1927617060);
         }

         var44 = 0;
         if ((var41 & 4) != 0) {
            var44 = var7.cp(1752135752);
         }

         this.au[var40] = var37 + var42;
         this.ab[var40] = var38 + var43;
         this.aq[var40] = var39 + var44;
         var37 = this.au[var40];
         var38 = this.ab[var40];
         var39 = this.aq[var40];
         if (var16 == 1) {
            this.ad[var40] = var8.cm((byte)7);
         }
      }

      if (var17 == 1) {
         for(var40 = 0; var40 < var9; ++var40) {
            var41 = var8.cm((byte)7);
            this.bb[var40] = new int[var41];
            this.bi[var40] = new int[var41];

            for(var42 = 0; var42 < var41; ++var42) {
               this.bb[var40][var42] = var8.cm((byte)7);
               this.bi[var40][var42] = var8.cm((byte)7);
            }
         }
      }

      var4.at = var32 * -1516355947;
      var5.at = var28 * -1516355947;
      var6.at = var26 * -1516355947;
      var7.at = var30 * -1516355947;
      var8.at = var27 * -1516355947;

      for(var40 = 0; var40 < var10; ++var40) {
         this.ah[var40] = (short)var4.cl(489634053);
         if (var12 == 1) {
            var41 = var5.cm((byte)7);
            if ((var41 & 1) == 1) {
               this.ao[var40] = 1;
               var2 = true;
            } else {
               this.ao[var40] = 0;
            }

            if ((var41 & 2) == 2) {
               this.ag[var40] = (byte)(var41 >> 2);
               this.av[var40] = this.ah[var40];
               this.ah[var40] = 127;
               if (this.av[var40] != -1) {
                  var3 = true;
               }
            } else {
               this.ag[var40] = -1;
               this.av[var40] = -1;
            }
         }

         if (var13 == 255) {
            this.ax[var40] = var6.cf(435772489);
         }

         if (var14 == 1) {
            this.ai[var40] = var7.cf(435772489);
         }

         if (var15 == 1) {
            this.ae[var40] = var8.cm((byte)7);
         }
      }

      var4.at = var31 * -1516355947;
      var5.at = var25 * -1516355947;
      var40 = 0;
      var41 = 0;
      var42 = 0;
      var43 = 0;

      int var45;
      int var46;
      for(var44 = 0; var44 < var10; ++var44) {
         var45 = var5.cm((byte)7);
         if (var45 == 1) {
            var40 = var4.cp(1461015598) + var43;
            var41 = var4.cp(1351847590) + var40;
            var42 = var4.cp(1925006621) + var41;
            var43 = var42;
            this.at[var44] = var40;
            this.aa[var44] = var41;
            this.ay[var44] = var42;
         }

         if (var45 == 2) {
            var41 = var42;
            var42 = var4.cp(1154814202) + var43;
            var43 = var42;
            this.at[var44] = var40;
            this.aa[var44] = var41;
            this.ay[var44] = var42;
         }

         if (var45 == 3) {
            var40 = var42;
            var42 = var4.cp(1983296982) + var43;
            var43 = var42;
            this.at[var44] = var40;
            this.aa[var44] = var41;
            this.ay[var44] = var42;
         }

         if (var45 == 4) {
            var46 = var40;
            var40 = var41;
            var41 = var46;
            var42 = var4.cp(1979359343) + var43;
            var43 = var42;
            this.at[var44] = var40;
            this.aa[var44] = var46;
            this.ay[var44] = var42;
         }
      }

      var4.at = var33 * -1516355947;

      for(var44 = 0; var44 < var11; ++var44) {
         this.as[var44] = 0;
         this.aj[var44] = (short)var4.cl(307324662);
         this.ak[var44] = (short)var4.cl(-1329357815);
         this.az[var44] = (short)var4.cl(753029702);
      }

      if (this.ag != null) {
         boolean var47 = false;

         for(var45 = 0; var45 < var10; ++var45) {
            var46 = this.ag[var45] & 255;
            if (var46 != 255) {
               if ((this.aj[var46] & '\uffff') == this.at[var45] && (this.ak[var46] & '\uffff') == this.aa[var45] && (this.az[var46] & '\uffff') == this.ay[var45]) {
                  this.ag[var45] = -1;
               } else {
                  var47 = true;
               }
            }
         }

         if (!var47) {
            this.ag = null;
         }
      }

      if (!var3) {
         this.av = null;
      }

      if (!var2) {
         this.ao = null;
      }

   }

   public void cq() {
      for(int var1 = 0; var1 < this.ac; ++var1) {
         int var2 = this.aq[var1];
         this.aq[var1] = this.au[var1];
         this.au[var1] = -var2;
      }

      this.ae();
   }

   final int bl(iz var1, int var2) {
      int var3 = -1;
      int var4 = var1.au[var2];
      int var5 = var1.ab[var2];
      int var6 = var1.aq[var2];

      for(int var7 = 0; var7 < this.ac; ++var7) {
         if (var4 == this.au[var7] && var5 == this.ab[var7] && var6 == this.aq[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.au[this.ac] = var4;
         this.ab[this.ac] = var5;
         this.aq[this.ac] = var6;
         if (var1.ad != null) {
            this.ad[this.ac] = var1.ad[var2];
         }

         if (var1.bb != null) {
            this.bb[this.ac] = var1.bb[var2];
            this.bi[this.ac] = var1.bi[var2];
         }

         var3 = this.ac++;
      }

      return var3;
   }

   public iz bp() {
      iz var1 = new iz();
      if (this.ao != null) {
         var1.ao = new byte[this.al];

         for(int var2 = 0; var2 < this.al; ++var2) {
            var1.ao[var2] = this.ao[var2];
         }
      }

      var1.ac = this.ac;
      var1.al = this.al;
      var1.am = this.am;
      var1.au = this.au;
      var1.ab = this.ab;
      var1.aq = this.aq;
      var1.at = this.at;
      var1.aa = this.aa;
      var1.ay = this.ay;
      var1.ax = this.ax;
      var1.ai = this.ai;
      var1.ag = this.ag;
      var1.ah = this.ah;
      var1.av = this.av;
      var1.ar = this.ar;
      var1.as = this.as;
      var1.aj = this.aj;
      var1.ak = this.ak;
      var1.az = this.az;
      var1.ad = this.ad;
      var1.ae = this.ae;
      var1.ap = this.ap;
      var1.by = this.by;
      var1.bk = this.bk;
      var1.be = this.be;
      var1.bo = this.bo;
      var1.bz = this.bz;
      return var1;
   }

   public iz bc() {
      iz var1 = new iz();
      if (this.ao != null) {
         var1.ao = new byte[this.al];

         for(int var2 = 0; var2 < this.al; ++var2) {
            var1.ao[var2] = this.ao[var2];
         }
      }

      var1.ac = this.ac;
      var1.al = this.al;
      var1.am = this.am;
      var1.au = this.au;
      var1.ab = this.ab;
      var1.aq = this.aq;
      var1.at = this.at;
      var1.aa = this.aa;
      var1.ay = this.ay;
      var1.ax = this.ax;
      var1.ai = this.ai;
      var1.ag = this.ag;
      var1.ah = this.ah;
      var1.av = this.av;
      var1.ar = this.ar;
      var1.as = this.as;
      var1.aj = this.aj;
      var1.ak = this.ak;
      var1.az = this.az;
      var1.ad = this.ad;
      var1.ae = this.ae;
      var1.ap = this.ap;
      var1.by = this.by;
      var1.bk = this.bk;
      var1.be = this.be;
      var1.bo = this.bo;
      var1.bz = this.bz;
      return var1;
   }

   public iz bh(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.ap();
      int var7 = var2 + this.bt;
      int var8 = var2 + this.bj;
      int var9 = var4 + this.bs;
      int var10 = var4 + this.bn;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + -1227007250 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            iz var11;
            if (var5) {
               var11 = new iz();
               var11.ac = this.ac;
               var11.al = this.al;
               var11.am = this.am;
               var11.au = this.au;
               var11.aq = this.aq;
               var11.at = this.at;
               var11.aa = this.aa;
               var11.ay = this.ay;
               var11.ao = this.ao;
               var11.ax = this.ax;
               var11.ai = this.ai;
               var11.ag = this.ag;
               var11.ah = this.ah;
               var11.av = this.av;
               var11.ar = this.ar;
               var11.as = this.as;
               var11.aj = this.aj;
               var11.ak = this.ak;
               var11.az = this.az;
               var11.ad = this.ad;
               var11.ae = this.ae;
               var11.ap = this.ap;
               var11.by = this.by;
               var11.bo = this.bo;
               var11.bz = this.bz;
               var11.ab = new int[var11.ac];
            } else {
               var11 = this;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if (var6 == 0) {
               for(var12 = 0; var12 < var11.ac; ++var12) {
                  var13 = this.au[var12] + var2;
                  var14 = this.aq[var12] + var4;
                  var15 = var13 & -145579976;
                  var16 = var14 & 616675675;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (-407361740 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (-1867314573 - var16) + var20 * var16 >> 7;
                  var11.ab[var12] = this.ab[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.ac; ++var12) {
                  var13 = (-this.ab[var12] << 16) / (this.et * 1550732737);
                  if (var13 < var6) {
                     var14 = this.au[var12] + var2;
                     var15 = this.aq[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (45163965 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (1478222767 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (1350985583 - var17) + var21 * var17 >> 7;
                     var11.ab[var12] = this.ab[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.ae();
            return var11;
         }
      } else {
         return this;
      }
   }

   void bw() {
      int[] var1;
      int var2;
      int var10002;
      int var3;
      int var4;
      if (this.ad != null) {
         var1 = new int[680791843];
         var2 = 0;

         for(var3 = 0; var3 < this.ac; ++var3) {
            var4 = this.ad[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.ap = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.ap[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.ac; this.ap[var4][var1[var4]++] = var3++) {
            var4 = this.ad[var3];
         }

         this.ad = null;
      }

      if (this.ae != null) {
         var1 = new int[-1854902625];
         var2 = 0;

         for(var3 = 0; var3 < this.al; ++var3) {
            var4 = this.ae[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.by = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.by[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.al; this.by[var4][var1[var4]++] = var3++) {
            var4 = this.ae[var3];
         }

         this.ae = null;
      }

   }

   public void cc() {
      for(int var1 = 0; var1 < this.ac; ++var1) {
         this.au[var1] = -this.au[var1];
         this.aq[var1] = -this.aq[var1];
      }

      this.ae();
   }

   public void cy(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.ac; ++var4) {
         int[] var10000 = this.au;
         var10000[var4] += var1;
         var10000 = this.ab;
         var10000[var4] += var2;
         var10000 = this.aq;
         var10000[var4] += var3;
      }

      this.ae();
   }

   void cs() {
      int[] var1;
      int var2;
      int var10002;
      int var3;
      int var4;
      if (this.ad != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.ac; ++var3) {
            var4 = this.ad[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.ap = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.ap[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.ac; this.ap[var4][var1[var4]++] = var3++) {
            var4 = this.ad[var3];
         }

         this.ad = null;
      }

      if (this.ae != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.al; ++var3) {
            var4 = this.ae[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.by = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.by[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.al; this.by[var4][var1[var4]++] = var3++) {
            var4 = this.ae[var3];
         }

         this.ae = null;
      }

   }

   static final int de(int var0, int var1) {
      var1 = var1 * (var0 & -1687584107) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 974969325;
      }

      return (var0 & 1907875418) + var1;
   }

   public void cn() {
      for(int var1 = 0; var1 < this.ac; ++var1) {
         this.au[var1] = -this.au[var1];
         this.aq[var1] = -this.aq[var1];
      }

      this.ae();
   }

   public void ca() {
      for(int var1 = 0; var1 < this.ac; ++var1) {
         this.au[var1] = -this.au[var1];
         this.aq[var1] = -this.aq[var1];
      }

      this.ae();
   }

   public void dm(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.ac; ++var4) {
         this.au[var4] = this.au[var4] * var1 / 128;
         this.ab[var4] = this.ab[var4] * var2 / 128;
         this.aq[var4] = this.aq[var4] * var3 / 128;
      }

      this.ae();
   }

   public void cm(int var1) {
      int var2 = bf[var1];
      int var3 = bq[var1];

      for(int var4 = 0; var4 < this.ac; ++var4) {
         int var5 = this.aq[var4] * var2 + this.au[var4] * var3 >> 16;
         this.aq[var4] = this.aq[var4] * var3 - this.au[var4] * var2 >> 16;
         this.au[var4] = var5;
      }

      this.ae();
   }

   public static iz bo(nm var0, int var1, int var2) {
      byte[] var3 = var0.bh(var1, var2, (byte)-5);
      return var3 == null ? null : new iz(var3);
   }

   final int bv(iz var1, int var2) {
      int var3 = -1;
      int var4 = var1.au[var2];
      int var5 = var1.ab[var2];
      int var6 = var1.aq[var2];

      for(int var7 = 0; var7 < this.ac; ++var7) {
         if (var4 == this.au[var7] && var5 == this.ab[var7] && var6 == this.aq[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.au[this.ac] = var4;
         this.ab[this.ac] = var5;
         this.aq[this.ac] = var6;
         if (var1.ad != null) {
            this.ad[this.ac] = var1.ad[var2];
         }

         if (var1.bb != null) {
            this.bb[this.ac] = var1.bb[var2];
            this.bi[this.ac] = var1.bi[var2];
         }

         var3 = this.ac++;
      }

      return var3;
   }

   public void cf(int var1) {
      int var2 = bf[var1];
      int var3 = bq[var1];

      for(int var4 = 0; var4 < this.ac; ++var4) {
         int var5 = this.aq[var4] * var2 + this.au[var4] * var3 >> 16;
         this.aq[var4] = this.aq[var4] * var3 - this.au[var4] * var2 >> 16;
         this.au[var4] = var5;
      }

      this.ae();
   }

   public void cl(int var1) {
      int var2 = bf[var1];
      int var3 = bq[var1];

      for(int var4 = 0; var4 < this.ac; ++var4) {
         int var5 = this.aq[var4] * var2 + this.au[var4] * var3 >> 16;
         this.aq[var4] = this.aq[var4] * var3 - this.au[var4] * var2 >> 16;
         this.au[var4] = var5;
      }

      this.ae();
   }

   public void cg(int var1) {
      int var2 = bf[var1];
      int var3 = bq[var1];

      for(int var4 = 0; var4 < this.ac; ++var4) {
         int var5 = this.aq[var4] * var2 + this.au[var4] * var3 >> 16;
         this.aq[var4] = this.aq[var4] * var3 - this.au[var4] * var2 >> 16;
         this.au[var4] = var5;
      }

      this.ae();
   }

   iz() {
   }

   public static iz af(nm var0, int var1, int var2) {
      byte[] var3 = var0.bh(var1, var2, (byte)-110);
      return var3 == null ? null : new iz(var3);
   }

   void ce() {
      int[] var1;
      int var2;
      int var10002;
      int var3;
      int var4;
      if (this.ad != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.ac; ++var3) {
            var4 = this.ad[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.ap = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.ap[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.ac; this.ap[var4][var1[var4]++] = var3++) {
            var4 = this.ad[var3];
         }

         this.ad = null;
      }

      if (this.ae != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.al; ++var3) {
            var4 = this.ae[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.by = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.by[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.al; this.by[var4][var1[var4]++] = var3++) {
            var4 = this.ae[var3];
         }

         this.ae = null;
      }

   }

   public void cv(short var1, short var2) {
      for(int var3 = 0; var3 < this.al; ++var3) {
         if (this.ah[var3] == var1) {
            this.ah[var3] = var2;
         }
      }

   }

   public void cb(short var1, short var2) {
      for(int var3 = 0; var3 < this.al; ++var3) {
         if (this.ah[var3] == var1) {
            this.ah[var3] = var2;
         }
      }

   }

   public void co(short var1, short var2) {
      for(int var3 = 0; var3 < this.al; ++var3) {
         if (this.ah[var3] == var1) {
            this.ah[var3] = var2;
         }
      }

   }

   public void aj(short var1, short var2) {
      if (this.av != null) {
         for(int var3 = 0; var3 < this.al; ++var3) {
            if (this.av[var3] == var1) {
               this.av[var3] = var2;
            }
         }

      }
   }

   public void cw() {
      int var1;
      for(var1 = 0; var1 < this.ac; ++var1) {
         this.aq[var1] = -this.aq[var1];
      }

      for(var1 = 0; var1 < this.al; ++var1) {
         int var2 = this.at[var1];
         this.at[var1] = this.ay[var1];
         this.ay[var1] = var2;
      }

      this.ae();
   }

   public void cj() {
      int var1;
      for(var1 = 0; var1 < this.ac; ++var1) {
         this.aq[var1] = -this.aq[var1];
      }

      for(var1 = 0; var1 < this.al; ++var1) {
         int var2 = this.at[var1];
         this.at[var1] = this.ay[var1];
         this.ay[var1] = var2;
      }

      this.ae();
   }

   public void ch(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.ac; ++var4) {
         this.au[var4] = this.au[var4] * var1 / 128;
         this.ab[var4] = this.ab[var4] * var2 / 128;
         this.aq[var4] = this.aq[var4] * var3 / 128;
      }

      this.ae();
   }

   public void ct(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.ac; ++var4) {
         this.au[var4] = this.au[var4] * var1 / 128;
         this.ab[var4] = this.ab[var4] * var2 / 128;
         this.aq[var4] = this.aq[var4] * var3 / 128;
      }

      this.ae();
   }

   void dk() {
      if (!this.bm) {
         this.et = 0;
         this.bd = 0;
         this.bt = 999999;
         this.bj = -999999;
         this.bn = -99999;
         this.bs = 99999;

         for(int var1 = 0; var1 < this.ac; ++var1) {
            int var2 = this.au[var1];
            int var3 = this.ab[var1];
            int var4 = this.aq[var1];
            if (var2 < this.bt) {
               this.bt = var2;
            }

            if (var2 > this.bj) {
               this.bj = var2;
            }

            if (var4 < this.bs) {
               this.bs = var4;
            }

            if (var4 > this.bn) {
               this.bn = var4;
            }

            if (-var3 > this.et * 1550732737) {
               this.et = -var3 * -644693439;
            }

            if (var3 > this.bd) {
               this.bd = var3;
            }
         }

         this.bm = true;
      }
   }

   public void cd(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.ac; ++var4) {
         this.au[var4] = this.au[var4] * var1 / 128;
         this.ab[var4] = this.ab[var4] * var2 / 128;
         this.aq[var4] = this.aq[var4] * var3 / 128;
      }

      this.ae();
   }

   void ci() {
      int[] var1;
      int var2;
      int var10002;
      int var3;
      int var4;
      if (this.ad != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.ac; ++var3) {
            var4 = this.ad[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.ap = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.ap[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.ac; this.ap[var4][var1[var4]++] = var3++) {
            var4 = this.ad[var3];
         }

         this.ad = null;
      }

      if (this.ae != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.al; ++var3) {
            var4 = this.ae[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.by = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.by[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.al; this.by[var4][var1[var4]++] = var3++) {
            var4 = this.ae[var3];
         }

         this.ae = null;
      }

   }

   public void dw() {
      if (this.bk == null) {
         this.bk = new ib[this.ac];

         int var1;
         for(var1 = 0; var1 < this.ac; ++var1) {
            this.bk[var1] = new ib();
         }

         for(var1 = 0; var1 < this.al; ++var1) {
            int var2 = this.at[var1];
            int var3 = this.aa[var1];
            int var4 = this.ay[var1];
            int var5 = this.au[var3] - this.au[var2];
            int var6 = this.ab[var3] - this.ab[var2];
            int var7 = this.aq[var3] - this.aq[var2];
            int var8 = this.au[var4] - this.au[var2];
            int var9 = this.ab[var4] - this.ab[var2];
            int var10 = this.aq[var4] - this.aq[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -389469498 || var12 < -1905863943 || var13 < -1738698907; var13 >>= 1) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if (var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 1989362291 / var14;
            byte var15;
            if (this.ao == null) {
               var15 = 0;
            } else {
               var15 = this.ao[var1];
            }

            if (var15 == 0) {
               ib var16 = this.bk[var2];
               var16.af += var11 * 328354862;
               var16.an += var12 * -1303307195;
               var16.aw += var13 * -362430901;
               var16.ac += 1073301069;
               var16 = this.bk[var3];
               var16.af += var11 * 690600101;
               var16.an += var12 * -1901731085;
               var16.aw += var13 * 711778803;
               var16.ac += -1992029881;
               var16 = this.bk[var4];
               var16.af += var11 * 690600101;
               var16.an += var12 * -1303307195;
               var16.aw += var13 * 1688166178;
               var16.ac += 1108281853;
            } else if (var15 == 1) {
               if (this.be == null) {
                  this.be = new ir[this.al];
               }

               ir var17 = this.be[var1] = new ir();
               var17.af = var11 * 1219045431;
               var17.an = var12 * -1383295079;
               var17.aw = var13 * -1973704156;
            }
         }

      }
   }

   void dc() {
      this.bk = null;
      this.bx = null;
      this.be = null;
      this.bm = false;
   }

   void do() {
      this.bk = null;
      this.bx = null;
      this.be = null;
      this.bm = false;
   }

   void di() {
      this.bk = null;
      this.bx = null;
      this.be = null;
      this.bm = false;
   }

   static void dt(iz var0, iz var1, int var2, int var3, int var4, boolean var5) {
      var0.ap();
      var0.ad();
      var1.ap();
      var1.ad();
      ++bu;
      int var6 = 0;
      int[] var7 = var1.au;
      int var8 = var1.ac;

      int var9;
      for(var9 = 0; var9 < var0.ac; ++var9) {
         ib var10 = var0.bk[var9];
         if (var10.ac * -1837445001 != 0) {
            int var11 = var0.ab[var9] - var3;
            if (var11 <= var1.bd) {
               int var12 = var0.au[var9] - var2;
               if (var12 >= var1.bt && var12 <= var1.bj) {
                  int var13 = var0.aq[var9] - var4;
                  if (var13 >= var1.bs && var13 <= var1.bn) {
                     for(int var14 = 0; var14 < var8; ++var14) {
                        ib var15 = var1.bk[var14];
                        if (var12 == var7[var14] && var13 == var1.aq[var14] && var11 == var1.ab[var14] && var15.ac * -1837445001 != 0) {
                           if (var0.bx == null) {
                              var0.bx = new ib[var0.ac];
                           }

                           if (var1.bx == null) {
                              var1.bx = new ib[var8];
                           }

                           ib var16 = var0.bx[var9];
                           if (var16 == null) {
                              var16 = var0.bx[var9] = new ib(var10);
                           }

                           ib var17 = var1.bx[var14];
                           if (var17 == null) {
                              var17 = var1.bx[var14] = new ib(var15);
                           }

                           var16.af += var15.af * 1;
                           var16.an += var15.an * 1;
                           var16.aw += var15.aw * 1;
                           var16.ac += var15.ac * 1;
                           var17.af += var10.af * 1;
                           var17.an += var10.an * 1;
                           var17.aw += var10.aw * 1;
                           var17.ac += var10.ac * 1;
                           ++var6;
                           br[var9] = bu;
                           bg[var14] = bu;
                        }
                     }
                  }
               }
            }
         }
      }

      if (var6 >= 3 && var5) {
         for(var9 = 0; var9 < var0.al; ++var9) {
            if (br[var0.at[var9]] == bu && br[var0.aa[var9]] == bu && br[var0.ay[var9]] == bu) {
               if (var0.ao == null) {
                  var0.ao = new byte[var0.al];
               }

               var0.ao[var9] = 2;
            }
         }

         for(var9 = 0; var9 < var1.al; ++var9) {
            if (bg[var1.at[var9]] == bu && bg[var1.aa[var9]] == bu && bg[var1.ay[var9]] == bu) {
               if (var1.ao == null) {
                  var1.ao = new byte[var1.al];
               }

               var1.ao[var9] = 2;
            }
         }

      }
   }

   public void ar(int var1) {
      int var2 = bf[var1];
      int var3 = bq[var1];

      for(int var4 = 0; var4 < this.ac; ++var4) {
         int var5 = this.aq[var4] * var2 + this.au[var4] * var3 >> 16;
         this.aq[var4] = this.aq[var4] * var3 - this.au[var4] * var2 >> 16;
         this.au[var4] = var5;
      }

      this.ae();
   }

   void dl() {
      this.bk = null;
      this.bx = null;
      this.be = null;
      this.bm = false;
   }

   public static iz bz(nm var0, int var1, int var2) {
      byte[] var3 = var0.bh(var1, var2, (byte)-37);
      return var3 == null ? null : new iz(var3);
   }

   public final it dv(int var1, int var2, int var3, int var4, int var5) {
      this.ad();
      int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      int var7 = var2 * var6 >> 8;
      it var8 = new it();
      var8.ah = new int[this.al];
      var8.av = new int[this.al];
      var8.ar = new int[this.al];
      if (this.am > 0 && this.ag != null) {
         int[] var9 = new int[this.am];

         int var10;
         for(var10 = 0; var10 < this.al; ++var10) {
            if (this.ag[var10] != -1) {
               ++var9[this.ag[var10] & 255];
            }
         }

         var8.ad = 0;

         for(var10 = 0; var10 < this.am; ++var10) {
            if (var9[var10] > 0 && this.as[var10] == 0) {
               ++var8.ad;
            }
         }

         var8.ae = new int[var8.ad];
         var8.ap = new int[var8.ad];
         var8.by = new int[var8.ad];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.am; ++var11) {
            if (var9[var11] > 0 && this.as[var11] == 0) {
               var8.ae[var10] = this.aj[var11] & '\uffff';
               var8.ap[var10] = this.ak[var11] & '\uffff';
               var8.by[var10] = this.az[var11] & '\uffff';
               var9[var11] = var10++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.aj = new byte[this.al];

         for(var11 = 0; var11 < this.al; ++var11) {
            if (this.ag[var11] != -1) {
               var8.aj[var11] = (byte)var9[this.ag[var11] & 255];
            } else {
               var8.aj[var11] = -1;
            }
         }
      }

      for(int var16 = 0; var16 < this.al; ++var16) {
         byte var17;
         if (this.ao == null) {
            var17 = 0;
         } else {
            var17 = this.ao[var16];
         }

         byte var18;
         if (this.ai == null) {
            var18 = 0;
         } else {
            var18 = this.ai[var16];
         }

         short var12;
         if (this.av == null) {
            var12 = -1;
         } else {
            var12 = this.av[var16];
         }

         if (var18 == -2) {
            var17 = 3;
         }

         if (var18 == -1) {
            var17 = 2;
         }

         ib var13;
         int var14;
         ir var19;
         if (var12 == -1) {
            if (var17 != 0) {
               if (var17 == 1) {
                  var19 = this.be[var16];
                  var14 = var1 + (var3 * var19.af * -18074541 + var4 * var19.an * 1542458359 + var5 * var19.aw * -446870673) / (var7 + var7 / 2);
                  var8.ah[var16] = bi(this.ah[var16] & '\uffff', var14);
                  var8.ar[var16] = -1;
               } else if (var17 == 3) {
                  var8.ah[var16] = 128;
                  var8.ar[var16] = -1;
               } else {
                  var8.ar[var16] = -2;
               }
            } else {
               int var15 = this.ah[var16] & '\uffff';
               if (this.bx != null && this.bx[this.at[var16]] != null) {
                  var13 = this.bx[this.at[var16]];
               } else {
                  var13 = this.bk[this.at[var16]];
               }

               var14 = var1 + (var3 * var13.af * -1941999827 + var4 * var13.an * 124229261 + var5 * var13.aw * 2108671835) / (var7 * var13.ac * -1837445001);
               var8.ah[var16] = bi(var15, var14);
               if (this.bx != null && this.bx[this.aa[var16]] != null) {
                  var13 = this.bx[this.aa[var16]];
               } else {
                  var13 = this.bk[this.aa[var16]];
               }

               var14 = var1 + (var3 * var13.af * -1941999827 + var4 * var13.an * 124229261 + var5 * var13.aw * 2108671835) / (var7 * var13.ac * -1837445001);
               var8.av[var16] = bi(var15, var14);
               if (this.bx != null && this.bx[this.ay[var16]] != null) {
                  var13 = this.bx[this.ay[var16]];
               } else {
                  var13 = this.bk[this.ay[var16]];
               }

               var14 = var1 + (var3 * var13.af * -1941999827 + var4 * var13.an * 124229261 + var5 * var13.aw * 2108671835) / (var7 * var13.ac * -1837445001);
               var8.ar[var16] = bi(var15, var14);
            }
         } else if (var17 != 0) {
            if (var17 == 1) {
               var19 = this.be[var16];
               var14 = var1 + (var3 * var19.af * -18074541 + var4 * var19.an * 1542458359 + var5 * var19.aw * -446870673) / (var7 + var7 / 2);
               var8.ah[var16] = be(var14);
               var8.ar[var16] = -1;
            } else {
               var8.ar[var16] = -2;
            }
         } else {
            if (this.bx != null && this.bx[this.at[var16]] != null) {
               var13 = this.bx[this.at[var16]];
            } else {
               var13 = this.bk[this.at[var16]];
            }

            var14 = var1 + (var3 * var13.af * -1941999827 + var4 * var13.an * 124229261 + var5 * var13.aw * 2108671835) / (var7 * var13.ac * -1837445001);
            var8.ah[var16] = be(var14);
            if (this.bx != null && this.bx[this.aa[var16]] != null) {
               var13 = this.bx[this.aa[var16]];
            } else {
               var13 = this.bk[this.aa[var16]];
            }

            var14 = var1 + (var3 * var13.af * -1941999827 + var4 * var13.an * 124229261 + var5 * var13.aw * 2108671835) / (var7 * var13.ac * -1837445001);
            var8.av[var16] = be(var14);
            if (this.bx != null && this.bx[this.ay[var16]] != null) {
               var13 = this.bx[this.ay[var16]];
            } else {
               var13 = this.bk[this.ay[var16]];
            }

            var14 = var1 + (var3 * var13.af * -1941999827 + var4 * var13.an * 124229261 + var5 * var13.aw * 2108671835) / (var7 * var13.ac * -1837445001);
            var8.ar[var16] = be(var14);
         }
      }

      this.ai();
      var8.al = this.ac;
      var8.at = this.au;
      var8.aa = this.ab;
      var8.ay = this.aq;
      var8.ao = this.al;
      var8.ax = this.at;
      var8.ai = this.aa;
      var8.ag = this.ay;
      var8.am = this.ax;
      var8.as = this.ai;
      var8.az = this.ar;
      var8.bb = this.ap;
      var8.bi = this.by;
      var8.ak = this.av;
      var8.be = this.bb;
      var8.bk = this.bi;
      return var8;
   }

   public void ad() {
      if (this.bk == null) {
         this.bk = new ib[this.ac];

         int var1;
         for(var1 = 0; var1 < this.ac; ++var1) {
            this.bk[var1] = new ib();
         }

         for(var1 = 0; var1 < this.al; ++var1) {
            int var2 = this.at[var1];
            int var3 = this.aa[var1];
            int var4 = this.ay[var1];
            int var5 = this.au[var3] - this.au[var2];
            int var6 = this.ab[var3] - this.ab[var2];
            int var7 = this.aq[var3] - this.aq[var2];
            int var8 = this.au[var4] - this.au[var2];
            int var9 = this.ab[var4] - this.ab[var2];
            int var10 = this.aq[var4] - this.aq[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if (var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if (this.ao == null) {
               var15 = 0;
            } else {
               var15 = this.ao[var1];
            }

            if (var15 == 0) {
               ib var16 = this.bk[var2];
               var16.af += var11 * 690600101;
               var16.an += var12 * -1303307195;
               var16.aw += var13 * 1279987923;
               var16.ac += -1992029881;
               var16 = this.bk[var3];
               var16.af += var11 * 690600101;
               var16.an += var12 * -1303307195;
               var16.aw += var13 * 1279987923;
               var16.ac += -1992029881;
               var16 = this.bk[var4];
               var16.af += var11 * 690600101;
               var16.an += var12 * -1303307195;
               var16.aw += var13 * 1279987923;
               var16.ac += -1992029881;
            } else if (var15 == 1) {
               if (this.be == null) {
                  this.be = new ir[this.al];
               }

               ir var17 = this.be[var1] = new ir();
               var17.af = var11 * 769404891;
               var17.an = var12 * -1145821753;
               var17.aw = var13 * -2013236337;
            }
         }

      }
   }

   public final it dg(int var1, int var2, int var3, int var4, int var5) {
      this.ad();
      int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      int var7 = var2 * var6 >> 8;
      it var8 = new it();
      var8.ah = new int[this.al];
      var8.av = new int[this.al];
      var8.ar = new int[this.al];
      if (this.am > 0 && this.ag != null) {
         int[] var9 = new int[this.am];

         int var10;
         for(var10 = 0; var10 < this.al; ++var10) {
            if (this.ag[var10] != -1) {
               ++var9[this.ag[var10] & 255];
            }
         }

         var8.ad = 0;

         for(var10 = 0; var10 < this.am; ++var10) {
            if (var9[var10] > 0 && this.as[var10] == 0) {
               ++var8.ad;
            }
         }

         var8.ae = new int[var8.ad];
         var8.ap = new int[var8.ad];
         var8.by = new int[var8.ad];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.am; ++var11) {
            if (var9[var11] > 0 && this.as[var11] == 0) {
               var8.ae[var10] = this.aj[var11] & 1286305087;
               var8.ap[var10] = this.ak[var11] & -1306678098;
               var8.by[var10] = this.az[var11] & '\uffff';
               var9[var11] = var10++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.aj = new byte[this.al];

         for(var11 = 0; var11 < this.al; ++var11) {
            if (this.ag[var11] != -1) {
               var8.aj[var11] = (byte)var9[this.ag[var11] & 255];
            } else {
               var8.aj[var11] = -1;
            }
         }
      }

      for(int var16 = 0; var16 < this.al; ++var16) {
         byte var17;
         if (this.ao == null) {
            var17 = 0;
         } else {
            var17 = this.ao[var16];
         }

         byte var18;
         if (this.ai == null) {
            var18 = 0;
         } else {
            var18 = this.ai[var16];
         }

         short var12;
         if (this.av == null) {
            var12 = -1;
         } else {
            var12 = this.av[var16];
         }

         if (var18 == -743747204) {
            var17 = 3;
         }

         if (var18 == -1) {
            var17 = 2;
         }

         ib var13;
         int var14;
         ir var19;
         if (var12 == -1) {
            if (var17 != 0) {
               if (var17 == 1) {
                  var19 = this.be[var16];
                  var14 = var1 + (var3 * var19.af * -18074541 + var4 * var19.an * 510023215 + var5 * var19.aw * -446870673) / (var7 + var7 / 2);
                  var8.ah[var16] = bi(this.ah[var16] & '\uffff', var14);
                  var8.ar[var16] = -1;
               } else if (var17 == 3) {
                  var8.ah[var16] = 128;
                  var8.ar[var16] = -1;
               } else {
                  var8.ar[var16] = -1647769187;
               }
            } else {
               int var15 = this.ah[var16] & -41187370;
               if (this.bx != null && this.bx[this.at[var16]] != null) {
                  var13 = this.bx[this.at[var16]];
               } else {
                  var13 = this.bk[this.at[var16]];
               }

               var14 = var1 + (var3 * var13.af * -1941999827 + var4 * var13.an * 124229261 + var5 * var13.aw * 1215517409) / (var7 * var13.ac * 1333234373);
               var8.ah[var16] = bi(var15, var14);
               if (this.bx != null && this.bx[this.aa[var16]] != null) {
                  var13 = this.bx[this.aa[var16]];
               } else {
                  var13 = this.bk[this.aa[var16]];
               }

               var14 = var1 + (var3 * var13.af * 2119647653 + var4 * var13.an * 124229261 + var5 * var13.aw * 2108671835) / (var7 * var13.ac * -1837445001);
               var8.av[var16] = bi(var15, var14);
               if (this.bx != null && this.bx[this.ay[var16]] != null) {
                  var13 = this.bx[this.ay[var16]];
               } else {
                  var13 = this.bk[this.ay[var16]];
               }

               var14 = var1 + (var3 * var13.af * -254709211 + var4 * var13.an * 124229261 + var5 * var13.aw * 431017970) / (var7 * var13.ac * 170537058);
               var8.ar[var16] = bi(var15, var14);
            }
         } else if (var17 != 0) {
            if (var17 == 1) {
               var19 = this.be[var16];
               var14 = var1 + (var3 * var19.af * -18074541 + var4 * var19.an * 1542458359 + var5 * var19.aw * -312873938) / (var7 + var7 / 2);
               var8.ah[var16] = be(var14);
               var8.ar[var16] = -1;
            } else {
               var8.ar[var16] = 1931752367;
            }
         } else {
            if (this.bx != null && this.bx[this.at[var16]] != null) {
               var13 = this.bx[this.at[var16]];
            } else {
               var13 = this.bk[this.at[var16]];
            }

            var14 = var1 + (var3 * var13.af * -1941999827 + var4 * var13.an * 124229261 + var5 * var13.aw * -1032287220) / (var7 * var13.ac * -1837445001);
            var8.ah[var16] = be(var14);
            if (this.bx != null && this.bx[this.aa[var16]] != null) {
               var13 = this.bx[this.aa[var16]];
            } else {
               var13 = this.bk[this.aa[var16]];
            }

            var14 = var1 + (var3 * var13.af * 1359817843 + var4 * var13.an * 124229261 + var5 * var13.aw * 2108671835) / (var7 * var13.ac * -1837445001);
            var8.av[var16] = be(var14);
            if (this.bx != null && this.bx[this.ay[var16]] != null) {
               var13 = this.bx[this.ay[var16]];
            } else {
               var13 = this.bk[this.ay[var16]];
            }

            var14 = var1 + (var3 * var13.af * -1941999827 + var4 * var13.an * 2041303530 + var5 * var13.aw * -202076184) / (var7 * var13.ac * -1837445001);
            var8.ar[var16] = be(var14);
         }
      }

      this.ai();
      var8.al = this.ac;
      var8.at = this.au;
      var8.aa = this.ab;
      var8.ay = this.aq;
      var8.ao = this.al;
      var8.ax = this.at;
      var8.ai = this.aa;
      var8.ag = this.ay;
      var8.am = this.ax;
      var8.as = this.ai;
      var8.az = this.ar;
      var8.bb = this.ap;
      var8.bi = this.by;
      var8.ak = this.av;
      var8.be = this.bb;
      var8.bk = this.bi;
      return var8;
   }

   void bs(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      sg var4 = new sg(var1);
      sg var5 = new sg(var1);
      sg var6 = new sg(var1);
      sg var7 = new sg(var1);
      sg var8 = new sg(var1);
      var4.at = (var1.length - 23) * -1516355947;
      int var9 = var4.cl(30229587);
      int var10 = var4.cl(-1567390877);
      int var11 = var4.cm((byte)7);
      int var12 = var4.cm((byte)7);
      int var13 = var4.cm((byte)7);
      int var14 = var4.cm((byte)7);
      int var15 = var4.cm((byte)7);
      int var16 = var4.cm((byte)7);
      int var17 = var4.cm((byte)7);
      int var18 = var4.cl(-1975459940);
      int var19 = var4.cl(-310647337);
      int var20 = var4.cl(-2071947118);
      int var21 = var4.cl(627955691);
      int var22 = var4.cl(824867692);
      int var23 = 0;
      byte var24 = (byte)var23;
      var23 += var9;
      int var25 = var23;
      var23 += var10;
      int var26 = var23;
      if (var13 == 255) {
         var23 += var10;
      }

      int var27 = var23;
      if (var15 == 1) {
         var23 += var10;
      }

      int var28 = var23;
      if (var12 == 1) {
         var23 += var10;
      }

      int var29 = var23;
      var23 += var22;
      int var30 = var23;
      if (var14 == 1) {
         var23 += var10;
      }

      int var31 = var23;
      var23 += var21;
      int var32 = var23;
      var23 += var10 * 2;
      int var33 = var23;
      var23 += var11 * 6;
      int var34 = var23;
      var23 += var18;
      int var35 = var23;
      var23 += var19;
      int var10000 = var23 + var20;
      this.ac = var9;
      this.al = var10;
      this.am = var11;
      this.au = new int[var9];
      this.ab = new int[var9];
      this.aq = new int[var9];
      this.at = new int[var10];
      this.aa = new int[var10];
      this.ay = new int[var10];
      if (var11 > 0) {
         this.as = new byte[var11];
         this.aj = new short[var11];
         this.ak = new short[var11];
         this.az = new short[var11];
      }

      if (var16 == 1) {
         this.ad = new int[var9];
      }

      if (var12 == 1) {
         this.ao = new byte[var10];
         this.ag = new byte[var10];
         this.av = new short[var10];
      }

      if (var13 == 255) {
         this.ax = new byte[var10];
      } else {
         this.ar = (byte)var13;
      }

      if (var14 == 1) {
         this.ai = new byte[var10];
      }

      if (var15 == 1) {
         this.ae = new int[var10];
      }

      if (var17 == 1) {
         this.bb = new int[var9][];
         this.bi = new int[var9][];
      }

      this.ah = new short[var10];
      var4.at = var24 * -1516355947;
      var5.at = var34 * -1516355947;
      var6.at = var35 * -1516355947;
      var7.at = var23 * -1516355947;
      var8.at = var29 * -1516355947;
      int var37 = 0;
      int var38 = 0;
      int var39 = 0;

      int var40;
      int var41;
      int var42;
      int var43;
      int var44;
      for(var40 = 0; var40 < var9; ++var40) {
         var41 = var4.cm((byte)7);
         var42 = 0;
         if ((var41 & 1) != 0) {
            var42 = var5.cp(1715586743);
         }

         var43 = 0;
         if ((var41 & 2) != 0) {
            var43 = var6.cp(1793760723);
         }

         var44 = 0;
         if ((var41 & 4) != 0) {
            var44 = var7.cp(1930607593);
         }

         this.au[var40] = var37 + var42;
         this.ab[var40] = var38 + var43;
         this.aq[var40] = var39 + var44;
         var37 = this.au[var40];
         var38 = this.ab[var40];
         var39 = this.aq[var40];
         if (var16 == 1) {
            this.ad[var40] = var8.cm((byte)7);
         }
      }

      if (var17 == 1) {
         for(var40 = 0; var40 < var9; ++var40) {
            var41 = var8.cm((byte)7);
            this.bb[var40] = new int[var41];
            this.bi[var40] = new int[var41];

            for(var42 = 0; var42 < var41; ++var42) {
               this.bb[var40][var42] = var8.cm((byte)7);
               this.bi[var40][var42] = var8.cm((byte)7);
            }
         }
      }

      var4.at = var32 * -1516355947;
      var5.at = var28 * -1516355947;
      var6.at = var26 * -1516355947;
      var7.at = var30 * -1516355947;
      var8.at = var27 * -1516355947;

      for(var40 = 0; var40 < var10; ++var40) {
         this.ah[var40] = (short)var4.cl(-515519569);
         if (var12 == 1) {
            var41 = var5.cm((byte)7);
            if ((var41 & 1) == 1) {
               this.ao[var40] = 1;
               var2 = true;
            } else {
               this.ao[var40] = 0;
            }

            if ((var41 & 2) == 2) {
               this.ag[var40] = (byte)(var41 >> 2);
               this.av[var40] = this.ah[var40];
               this.ah[var40] = 127;
               if (this.av[var40] != -1) {
                  var3 = true;
               }
            } else {
               this.ag[var40] = -1;
               this.av[var40] = -1;
            }
         }

         if (var13 == 255) {
            this.ax[var40] = var6.cf(435772489);
         }

         if (var14 == 1) {
            this.ai[var40] = var7.cf(435772489);
         }

         if (var15 == 1) {
            this.ae[var40] = var8.cm((byte)7);
         }
      }

      var4.at = var31 * -1516355947;
      var5.at = var25 * -1516355947;
      var40 = 0;
      var41 = 0;
      var42 = 0;
      var43 = 0;

      int var45;
      int var46;
      for(var44 = 0; var44 < var10; ++var44) {
         var45 = var5.cm((byte)7);
         if (var45 == 1) {
            var40 = var4.cp(1769268447) + var43;
            var41 = var4.cp(2071578162) + var40;
            var42 = var4.cp(1334613268) + var41;
            var43 = var42;
            this.at[var44] = var40;
            this.aa[var44] = var41;
            this.ay[var44] = var42;
         }

         if (var45 == 2) {
            var41 = var42;
            var42 = var4.cp(1925359791) + var43;
            var43 = var42;
            this.at[var44] = var40;
            this.aa[var44] = var41;
            this.ay[var44] = var42;
         }

         if (var45 == 3) {
            var40 = var42;
            var42 = var4.cp(2035184688) + var43;
            var43 = var42;
            this.at[var44] = var40;
            this.aa[var44] = var41;
            this.ay[var44] = var42;
         }

         if (var45 == 4) {
            var46 = var40;
            var40 = var41;
            var41 = var46;
            var42 = var4.cp(1475449035) + var43;
            var43 = var42;
            this.at[var44] = var40;
            this.aa[var44] = var46;
            this.ay[var44] = var42;
         }
      }

      var4.at = var33 * -1516355947;

      for(var44 = 0; var44 < var11; ++var44) {
         this.as[var44] = 0;
         this.aj[var44] = (short)var4.cl(-142943120);
         this.ak[var44] = (short)var4.cl(3751707);
         this.az[var44] = (short)var4.cl(-1794668263);
      }

      if (this.ag != null) {
         boolean var47 = false;

         for(var45 = 0; var45 < var10; ++var45) {
            var46 = this.ag[var45] & 255;
            if (var46 != 255) {
               if ((this.aj[var46] & '\uffff') == this.at[var45] && (this.ak[var46] & '\uffff') == this.aa[var45] && (this.az[var46] & '\uffff') == this.ay[var45]) {
                  this.ag[var45] = -1;
               } else {
                  var47 = true;
               }
            }
         }

         if (!var47) {
            this.ag = null;
         }
      }

      if (!var3) {
         this.av = null;
      }

      if (!var2) {
         this.ao = null;
      }

   }

   static final int dh(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   static final int dp(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   static final int du(int var0, int var1) {
      var1 = var1 * (var0 & -239588724) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }
}
