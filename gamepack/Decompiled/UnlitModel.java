public class UnlitModel extends Entity {
   static int[] UnlitModel_cosine;
   int[][] bb;
   int verticesCount = 0;
   int[] au;
   int[] ab;
   int[] aq;
   int faceCount = 0;
   int[] at;
   int[] ay;
   int[] ad;
   byte[] ax;
   public short bz;
   byte[] ag;
   short[] faceColors;
   short[] faceTextures;
   byte ar = 0;
   int[][] ap;
   byte[] as;
   short[] aj;
   public short bo;
   int bs;
   static int[] UnlitModel_sine;
   int[] ae;
   short[] az;
   int[][] by;
   int bj;
   int[][] bi;
   ir[] be;
   VertexNormal[] bx;
   byte[] ao;
   int am;
   byte[] ai;
   boolean isBoundsCalculated = false;
   int bd;
   int bt;
   short[] ak;
   int bn;
   static int[] br = new int[10000];
   static int[] bg = new int[10000];
   static int bu = 0;
   VertexNormal[] bk;
   int[] aa;

   UnlitModel(byte[] var1) {
      Packet var2 = new Packet(10);
      var2.p2(-2);
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
      Packet var2 = new Packet(var1);
      Packet var3 = new Packet(var1);
      Packet var4 = new Packet(var1);
      Packet var5 = new Packet(var1);
      Packet var6 = new Packet(var1);
      Packet var7 = new Packet(var1);
      Packet var8 = new Packet(var1);
      var2.index = (var1.length - 26) * -1516355947;
      int var9 = var2.cl();
      int var10 = var2.cl();
      int var11 = var2.g1();
      int var12 = var2.g1();
      int var13 = var2.g1();
      int var14 = var2.g1();
      int var15 = var2.g1();
      int var16 = var2.g1();
      int var17 = var2.g1();
      int var18 = var2.g1();
      int var19 = var2.cl();
      int var20 = var2.cl();
      int var21 = var2.cl();
      int var22 = var2.cl();
      int var23 = var2.cl();
      int var24 = var2.cl();
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28;
      if (var11 > 0) {
         this.as = new byte[var11];
         var2.index = 0;

         for(var28 = 0; var28 < var11; ++var28) {
            byte var29 = this.as[var28] = var2.g1s();
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
      this.verticesCount = var9;
      this.faceCount = var10;
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
         this.faceTextures = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.ag = new byte[var10];
      }

      if (var18 == 1) {
         this.bb = new int[var9][];
         this.bi = new int[var9][];
      }

      this.faceColors = new short[var10];
      if (var11 > 0) {
         this.aj = new short[var11];
         this.ak = new short[var11];
         this.az = new short[var11];
      }

      var2.index = var11 * -1516355947;
      var3.index = var40 * -1516355947;
      var4.index = var41 * -1516355947;
      var5.index = var42 * -1516355947;
      var6.index = var34 * -1516355947;
      int var50 = 0;
      int var51 = 0;
      int var52 = 0;

      int var53;
      int var54;
      int var55;
      int var56;
      int var57;
      for(var53 = 0; var53 < var9; ++var53) {
         var54 = var2.g1();
         var55 = 0;
         if ((var54 & 1) != 0) {
            var55 = var3.gSmart1or2s();
         }

         var56 = 0;
         if ((var54 & 2) != 0) {
            var56 = var4.gSmart1or2s();
         }

         var57 = 0;
         if ((var54 & 4) != 0) {
            var57 = var5.gSmart1or2s();
         }

         this.au[var53] = var50 + var55;
         this.ab[var53] = var51 + var56;
         this.aq[var53] = var52 + var57;
         var50 = this.au[var53];
         var51 = this.ab[var53];
         var52 = this.aq[var53];
         if (var17 == 1) {
            this.ad[var53] = var6.g1();
         }
      }

      if (var18 == 1) {
         for(var53 = 0; var53 < var9; ++var53) {
            var54 = var6.g1();
            this.bb[var53] = new int[var54];
            this.bi[var53] = new int[var54];

            for(var55 = 0; var55 < var54; ++var55) {
               this.bb[var53][var55] = var6.g1();
               this.bi[var53][var55] = var6.g1();
            }
         }
      }

      var2.index = var39 * -1516355947;
      var3.index = var30 * -1516355947;
      var4.index = var32 * -1516355947;
      var5.index = var35 * -1516355947;
      var6.index = var33 * -1516355947;
      var7.index = var37 * -1516355947;
      var8.index = var38 * -1516355947;

      for(var53 = 0; var53 < var10; ++var53) {
         this.faceColors[var53] = (short)var2.cl();
         if (var12 == 1) {
            this.ao[var53] = var3.g1s();
         }

         if (var13 == 255) {
            this.ax[var53] = var4.g1s();
         }

         if (var14 == 1) {
            this.ai[var53] = var5.g1s();
         }

         if (var15 == 1) {
            this.ae[var53] = var6.g1();
         }

         if (var16 == 1) {
            this.faceTextures[var53] = (short)(var7.cl() - 1);
         }

         if (this.ag != null && this.faceTextures[var53] != -1) {
            this.ag[var53] = (byte)(var8.g1() - 1);
         }
      }

      var2.index = var36 * -1516355947;
      var3.index = var31 * -1516355947;
      var53 = 0;
      var54 = 0;
      var55 = 0;
      var56 = 0;

      int var58;
      for(var57 = 0; var57 < var10; ++var57) {
         var58 = var3.g1();
         if (var58 == 1) {
            var53 = var2.gSmart1or2s() + var56;
            var54 = var2.gSmart1or2s() + var53;
            var55 = var2.gSmart1or2s() + var54;
            var56 = var55;
            this.at[var57] = var53;
            this.aa[var57] = var54;
            this.ay[var57] = var55;
         }

         if (var58 == 2) {
            var54 = var55;
            var55 = var2.gSmart1or2s() + var56;
            var56 = var55;
            this.at[var57] = var53;
            this.aa[var57] = var54;
            this.ay[var57] = var55;
         }

         if (var58 == 3) {
            var53 = var55;
            var55 = var2.gSmart1or2s() + var56;
            var56 = var55;
            this.at[var57] = var53;
            this.aa[var57] = var54;
            this.ay[var57] = var55;
         }

         if (var58 == 4) {
            int var59 = var53;
            var53 = var54;
            var54 = var59;
            var55 = var2.gSmart1or2s() + var56;
            var56 = var55;
            this.at[var57] = var53;
            this.aa[var57] = var59;
            this.ay[var57] = var55;
         }
      }

      var2.index = var43 * -1516355947;
      var3.index = var44 * -1516355947;
      var4.index = var45 * -1516355947;
      var5.index = var46 * -1516355947;
      var6.index = var47 * -1516355947;
      var7.index = var48 * -1516355947;

      for(var57 = 0; var57 < var11; ++var57) {
         var58 = this.as[var57] & 255;
         if (var58 == 0) {
            this.aj[var57] = (short)var2.cl();
            this.ak[var57] = (short)var2.cl();
            this.az[var57] = (short)var2.cl();
         }
      }

      var2.index = var28 * -1516355947;
      var57 = var2.g1();
      if (var57 != 0) {
         new UnlitModel0();
         var2.cl();
         var2.cl();
         var2.cl();
         var2.g4s();
      }

   }

   void at(byte[] var1) {
      Packet var2 = new Packet(var1);
      Packet var3 = new Packet(var1);
      Packet var4 = new Packet(var1);
      Packet var5 = new Packet(var1);
      Packet var6 = new Packet(var1);
      Packet var7 = new Packet(var1);
      Packet var8 = new Packet(var1);
      var2.index = (var1.length - 23) * -1516355947;
      int var9 = var2.cl();
      int var10 = var2.cl();
      int var11 = var2.g1();
      int var12 = var2.g1();
      int var13 = var2.g1();
      int var14 = var2.g1();
      int var15 = var2.g1();
      int var16 = var2.g1();
      int var17 = var2.g1();
      int var18 = var2.cl();
      int var19 = var2.cl();
      int var20 = var2.cl();
      int var21 = var2.cl();
      int var22 = var2.cl();
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if (var11 > 0) {
         this.as = new byte[var11];
         var2.index = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.as[var26] = var2.g1s();
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
      this.verticesCount = var9;
      this.faceCount = var10;
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
         this.faceTextures = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.ag = new byte[var10];
      }

      this.faceColors = new short[var10];
      if (var11 > 0) {
         this.aj = new short[var11];
         this.ak = new short[var11];
         this.az = new short[var11];
      }

      var2.index = var11 * -1516355947;
      var3.index = var38 * -1516355947;
      var4.index = var39 * -1516355947;
      var5.index = var40 * -1516355947;
      var6.index = var32 * -1516355947;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      int var51;
      int var52;
      int var53;
      int var54;
      int var55;
      for(var51 = 0; var51 < var9; ++var51) {
         var52 = var2.g1();
         var53 = 0;
         if ((var52 & 1) != 0) {
            var53 = var3.gSmart1or2s();
         }

         var54 = 0;
         if ((var52 & 2) != 0) {
            var54 = var4.gSmart1or2s();
         }

         var55 = 0;
         if ((var52 & 4) != 0) {
            var55 = var5.gSmart1or2s();
         }

         this.au[var51] = var48 + var53;
         this.ab[var51] = var49 + var54;
         this.aq[var51] = var50 + var55;
         var48 = this.au[var51];
         var49 = this.ab[var51];
         var50 = this.aq[var51];
         if (var17 == 1) {
            this.ad[var51] = var6.g1();
         }
      }

      var2.index = var37 * -1516355947;
      var3.index = var28 * -1516355947;
      var4.index = var30 * -1516355947;
      var5.index = var33 * -1516355947;
      var6.index = var31 * -1516355947;
      var7.index = var35 * -1516355947;
      var8.index = var36 * -1516355947;

      for(var51 = 0; var51 < var10; ++var51) {
         this.faceColors[var51] = (short)var2.cl();
         if (var12 == 1) {
            this.ao[var51] = var3.g1s();
         }

         if (var13 == 255) {
            this.ax[var51] = var4.g1s();
         }

         if (var14 == 1) {
            this.ai[var51] = var5.g1s();
         }

         if (var15 == 1) {
            this.ae[var51] = var6.g1();
         }

         if (var16 == 1) {
            this.faceTextures[var51] = (short)(var7.cl() - 1);
         }

         if (this.ag != null && this.faceTextures[var51] != -1) {
            this.ag[var51] = (byte)(var8.g1() - 1);
         }
      }

      var2.index = var34 * -1516355947;
      var3.index = var29 * -1516355947;
      var51 = 0;
      var52 = 0;
      var53 = 0;
      var54 = 0;

      int var56;
      for(var55 = 0; var55 < var10; ++var55) {
         var56 = var3.g1();
         if (var56 == 1) {
            var51 = var2.gSmart1or2s() + var54;
            var52 = var2.gSmart1or2s() + var51;
            var53 = var2.gSmart1or2s() + var52;
            var54 = var53;
            this.at[var55] = var51;
            this.aa[var55] = var52;
            this.ay[var55] = var53;
         }

         if (var56 == 2) {
            var52 = var53;
            var53 = var2.gSmart1or2s() + var54;
            var54 = var53;
            this.at[var55] = var51;
            this.aa[var55] = var52;
            this.ay[var55] = var53;
         }

         if (var56 == 3) {
            var51 = var53;
            var53 = var2.gSmart1or2s() + var54;
            var54 = var53;
            this.at[var55] = var51;
            this.aa[var55] = var52;
            this.ay[var55] = var53;
         }

         if (var56 == 4) {
            int var57 = var51;
            var51 = var52;
            var52 = var57;
            var53 = var2.gSmart1or2s() + var54;
            var54 = var53;
            this.at[var55] = var51;
            this.aa[var55] = var57;
            this.ay[var55] = var53;
         }
      }

      var2.index = var41 * -1516355947;
      var3.index = var42 * -1516355947;
      var4.index = var43 * -1516355947;
      var5.index = var44 * -1516355947;
      var6.index = var45 * -1516355947;
      var7.index = var46 * -1516355947;

      for(var55 = 0; var55 < var11; ++var55) {
         var56 = this.as[var55] & 255;
         if (var56 == 0) {
            this.aj[var55] = (short)var2.cl();
            this.ak[var55] = (short)var2.cl();
            this.az[var55] = (short)var2.cl();
         }
      }

      var2.index = var26 * -1516355947;
      var55 = var2.g1();
      if (var55 != 0) {
         new UnlitModel0();
         var2.cl();
         var2.cl();
         var2.cl();
         var2.g4s();
      }

   }

   void aa(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Packet var4 = new Packet(var1);
      Packet var5 = new Packet(var1);
      Packet var6 = new Packet(var1);
      Packet var7 = new Packet(var1);
      Packet var8 = new Packet(var1);
      var4.index = (var1.length - 18) * -1516355947;
      int var9 = var4.cl();
      int var10 = var4.cl();
      int var11 = var4.g1();
      int var12 = var4.g1();
      int var13 = var4.g1();
      int var14 = var4.g1();
      int var15 = var4.g1();
      int var16 = var4.g1();
      int var17 = var4.cl();
      int var18 = var4.cl();
      int var19 = var4.cl();
      int var20 = var4.cl();
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
      this.verticesCount = var9;
      this.faceCount = var10;
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
         this.faceTextures = new short[var10];
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

      this.faceColors = new short[var10];
      var4.index = var22 * -1516355947;
      var5.index = var32 * -1516355947;
      var6.index = var33 * -1516355947;
      var7.index = var21 * -1516355947;
      var8.index = var27 * -1516355947;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.g1();
         var40 = 0;
         if ((var39 & 1) != 0) {
            var40 = var5.gSmart1or2s();
         }

         var41 = 0;
         if ((var39 & 2) != 0) {
            var41 = var6.gSmart1or2s();
         }

         var42 = 0;
         if ((var39 & 4) != 0) {
            var42 = var7.gSmart1or2s();
         }

         this.au[var38] = var35 + var40;
         this.ab[var38] = var36 + var41;
         this.aq[var38] = var37 + var42;
         var35 = this.au[var38];
         var36 = this.ab[var38];
         var37 = this.aq[var38];
         if (var16 == 1) {
            this.ad[var38] = var8.g1();
         }
      }

      var4.index = var30 * -1516355947;
      var5.index = var26 * -1516355947;
      var6.index = var24 * -1516355947;
      var7.index = var28 * -1516355947;
      var8.index = var25 * -1516355947;

      for(var38 = 0; var38 < var10; ++var38) {
         this.faceColors[var38] = (short)var4.cl();
         if (var12 == 1) {
            var39 = var5.g1();
            if ((var39 & 1) == 1) {
               this.ao[var38] = 1;
               var2 = true;
            } else {
               this.ao[var38] = 0;
            }

            if ((var39 & 2) == 2) {
               this.ag[var38] = (byte)(var39 >> 2);
               this.faceTextures[var38] = this.faceColors[var38];
               this.faceColors[var38] = 127;
               if (this.faceTextures[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.ag[var38] = -1;
               this.faceTextures[var38] = -1;
            }
         }

         if (var13 == 255) {
            this.ax[var38] = var6.g1s();
         }

         if (var14 == 1) {
            this.ai[var38] = var7.g1s();
         }

         if (var15 == 1) {
            this.ae[var38] = var8.g1();
         }
      }

      var4.index = var29 * -1516355947;
      var5.index = var23 * -1516355947;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.g1();
         if (var43 == 1) {
            var38 = var4.gSmart1or2s() + var41;
            var39 = var4.gSmart1or2s() + var38;
            var40 = var4.gSmart1or2s() + var39;
            var41 = var40;
            this.at[var42] = var38;
            this.aa[var42] = var39;
            this.ay[var42] = var40;
         }

         if (var43 == 2) {
            var39 = var40;
            var40 = var4.gSmart1or2s() + var41;
            var41 = var40;
            this.at[var42] = var38;
            this.aa[var42] = var39;
            this.ay[var42] = var40;
         }

         if (var43 == 3) {
            var38 = var40;
            var40 = var4.gSmart1or2s() + var41;
            var41 = var40;
            this.at[var42] = var38;
            this.aa[var42] = var39;
            this.ay[var42] = var40;
         }

         if (var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.gSmart1or2s() + var41;
            var41 = var40;
            this.at[var42] = var38;
            this.aa[var42] = var44;
            this.ay[var42] = var40;
         }
      }

      var4.index = var31 * -1516355947;

      for(var42 = 0; var42 < var11; ++var42) {
         this.as[var42] = 0;
         this.aj[var42] = (short)var4.cl();
         this.ak[var42] = (short)var4.cl();
         this.az[var42] = (short)var4.cl();
      }

      if (this.ag != null) {
         boolean var48 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.ag[var43] & 255;
            if (var44 != 255) {
               if ((this.aj[var44] & '\uffff') == this.at[var43] && (this.ak[var44] & '\uffff') == this.aa[var43] && (this.az[var44] & '\uffff') == this.ay[var43]) {
                  this.ag[var43] = -1;
               } else {
                  var48 = true;
               }
            }
         }

         if (!var48) {
            this.ag = null;
         }
      }

      if (!var3) {
         this.faceTextures = null;
      }

      if (!var2) {
         this.ao = null;
      }

   }

   public UnlitModel(UnlitModel[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      this.verticesCount = 0;
      this.faceCount = 0;
      this.am = 0;
      this.ar = -1;

      int var10;
      UnlitModel var11;
      for(var10 = 0; var10 < var2; ++var10) {
         var11 = var1[var10];
         if (var11 != null) {
            this.verticesCount += var11.verticesCount;
            this.faceCount += var11.faceCount;
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
            var7 |= var11.faceTextures != null;
            var8 |= var11.ag != null;
            var9 |= var11.bb != null;
         }
      }

      this.au = new int[this.verticesCount];
      this.ab = new int[this.verticesCount];
      this.aq = new int[this.verticesCount];
      this.ad = new int[this.verticesCount];
      this.at = new int[this.faceCount];
      this.aa = new int[this.faceCount];
      this.ay = new int[this.faceCount];
      if (var3) {
         this.ao = new byte[this.faceCount];
      }

      if (var4) {
         this.ax = new byte[this.faceCount];
      }

      if (var5) {
         this.ai = new byte[this.faceCount];
      }

      if (var6) {
         this.ae = new int[this.faceCount];
      }

      if (var7) {
         this.faceTextures = new short[this.faceCount];
      }

      if (var8) {
         this.ag = new byte[this.faceCount];
      }

      if (var9) {
         this.bb = new int[this.verticesCount][];
         this.bi = new int[this.verticesCount][];
      }

      this.faceColors = new short[this.faceCount];
      if (this.am > 0) {
         this.as = new byte[this.am];
         this.aj = new short[this.am];
         this.ak = new short[this.am];
         this.az = new short[this.am];
      }

      this.verticesCount = 0;
      this.faceCount = 0;
      this.am = 0;

      for(var10 = 0; var10 < var2; ++var10) {
         var11 = var1[var10];
         if (var11 != null) {
            int var12;
            for(var12 = 0; var12 < var11.faceCount; ++var12) {
               if (var3 && var11.ao != null) {
                  this.ao[this.faceCount] = var11.ao[var12];
               }

               if (var4) {
                  if (var11.ax != null) {
                     this.ax[this.faceCount] = var11.ax[var12];
                  } else {
                     this.ax[this.faceCount] = var11.ar;
                  }
               }

               if (var5 && var11.ai != null) {
                  this.ai[this.faceCount] = var11.ai[var12];
               }

               if (var6 && var11.ae != null) {
                  this.ae[this.faceCount] = var11.ae[var12];
               }

               if (var7) {
                  if (var11.faceTextures != null) {
                     this.faceTextures[this.faceCount] = var11.faceTextures[var12];
                  } else {
                     this.faceTextures[this.faceCount] = -1;
                  }
               }

               if (var8) {
                  if (var11.ag != null && var11.ag[var12] != -1) {
                     this.ag[this.faceCount] = (byte)(var11.ag[var12] + this.am);
                  } else {
                     this.ag[this.faceCount] = -1;
                  }
               }

               this.faceColors[this.faceCount] = var11.faceColors[var12];
               this.at[this.faceCount] = this.ay(var11, var11.at[var12]);
               this.aa[this.faceCount] = this.ay(var11, var11.aa[var12]);
               this.ay[this.faceCount] = this.ay(var11, var11.ay[var12]);
               ++this.faceCount;
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

   static final int bi_renamed(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   public UnlitModel(UnlitModel var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.verticesCount = var1.verticesCount;
      this.faceCount = var1.faceCount;
      this.am = var1.am;
      int var6;
      if (var2) {
         this.au = var1.au;
         this.ab = var1.ab;
         this.aq = var1.aq;
      } else {
         this.au = new int[this.verticesCount];
         this.ab = new int[this.verticesCount];
         this.aq = new int[this.verticesCount];

         for(var6 = 0; var6 < this.verticesCount; ++var6) {
            this.au[var6] = var1.au[var6];
            this.ab[var6] = var1.ab[var6];
            this.aq[var6] = var1.aq[var6];
         }
      }

      if (var3) {
         this.faceColors = var1.faceColors;
      } else {
         this.faceColors = new short[this.faceCount];

         for(var6 = 0; var6 < this.faceCount; ++var6) {
            this.faceColors[var6] = var1.faceColors[var6];
         }
      }

      if (!var4 && var1.faceTextures != null) {
         this.faceTextures = new short[this.faceCount];

         for(var6 = 0; var6 < this.faceCount; ++var6) {
            this.faceTextures[var6] = var1.faceTextures[var6];
         }
      } else {
         this.faceTextures = var1.faceTextures;
      }

      if (var5) {
         this.ai = var1.ai;
      } else {
         this.ai = new byte[this.faceCount];
         if (var1.ai == null) {
            for(var6 = 0; var6 < this.faceCount; ++var6) {
               this.ai[var6] = 0;
            }
         } else {
            for(var6 = 0; var6 < this.faceCount; ++var6) {
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

   public UnlitModel ax(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
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
            UnlitModel var11;
            if (var5) {
               var11 = new UnlitModel();
               var11.verticesCount = this.verticesCount;
               var11.faceCount = this.faceCount;
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
               var11.faceColors = this.faceColors;
               var11.faceTextures = this.faceTextures;
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
               var11.ab = new int[var11.verticesCount];
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
               for(var12 = 0; var12 < var11.verticesCount; ++var12) {
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
               for(var12 = 0; var12 < var11.verticesCount; ++var12) {
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

            var11.invalidate();
            return var11;
         }
      } else {
         return this;
      }
   }

   public void ag() {
      for(int var1 = 0; var1 < this.verticesCount; ++var1) {
         int var2 = this.au[var1];
         this.au[var1] = this.aq[var1];
         this.aq[var1] = -var2;
      }

      this.invalidate();
   }

   public void av() {
      for(int var1 = 0; var1 < this.verticesCount; ++var1) {
         int var2 = this.aq[var1];
         this.aq[var1] = this.au[var1];
         this.au[var1] = -var2;
      }

      this.invalidate();
   }

   public void ah() {
      for(int var1 = 0; var1 < this.verticesCount; ++var1) {
         this.au[var1] = -this.au[var1];
         this.aq[var1] = -this.aq[var1];
      }

      this.invalidate();
   }

   public void am(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.verticesCount; ++var4) {
         int[] var10000 = this.au;
         var10000[var4] += var1;
         var10000 = this.ab;
         var10000[var4] += var2;
         var10000 = this.aq;
         var10000[var4] += var3;
      }

      this.invalidate();
   }

   public void recolor(short var1, short var2) {
      for(int var3 = 0; var3 < this.faceCount; ++var3) {
         if (this.faceColors[var3] == var1) {
            this.faceColors[var3] = var2;
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

         for(var3 = 0; var3 < this.verticesCount; ++var3) {
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

         for(var3 = 0; var3 < this.verticesCount; this.ap[var4][var1[var4]++] = var3++) {
            var4 = this.ad[var3];
         }

         this.ad = null;
      }

      if (this.ae != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.faceCount; ++var3) {
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

         for(var3 = 0; var3 < this.faceCount; this.by[var4][var1[var4]++] = var3++) {
            var4 = this.ae[var3];
         }

         this.ae = null;
      }

   }

   public void ak() {
      int var1;
      for(var1 = 0; var1 < this.verticesCount; ++var1) {
         this.aq[var1] = -this.aq[var1];
      }

      for(var1 = 0; var1 < this.faceCount; ++var1) {
         int var2 = this.at[var1];
         this.at[var1] = this.ay[var1];
         this.ay[var1] = var2;
      }

      this.invalidate();
   }

   public void az(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.verticesCount; ++var4) {
         this.au[var4] = this.au[var4] * var1 / 128;
         this.ab[var4] = this.ab[var4] * var2 / 128;
         this.aq[var4] = this.aq[var4] * var3 / 128;
      }

      this.invalidate();
   }

   void invalidate() {
      this.bk = null;
      this.bx = null;
      this.be = null;
      this.isBoundsCalculated = false;
   }

   void ap() {
      if (!this.isBoundsCalculated) {
         this.et = 0;
         this.bd = 0;
         this.bt = 999999;
         this.bj = -999999;
         this.bn = -99999;
         this.bs = 99999;

         for(int var1 = 0; var1 < this.verticesCount; ++var1) {
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

         this.isBoundsCalculated = true;
      }
   }

   static void by(UnlitModel var0, UnlitModel var1, int var2, int var3, int var4, boolean var5) {
      var0.ap();
      var0.ad();
      var1.ap();
      var1.ad();
      ++bu;
      int var6 = 0;
      int[] var7 = var1.au;
      int var8 = var1.verticesCount;

      int var9;
      for(var9 = 0; var9 < var0.verticesCount; ++var9) {
         VertexNormal var10 = var0.bk[var9];
         if (var10.ac * -1837445001 != 0) {
            int var11 = var0.ab[var9] - var3;
            if (var11 <= var1.bd) {
               int var12 = var0.au[var9] - var2;
               if (var12 >= var1.bt && var12 <= var1.bj) {
                  int var13 = var0.aq[var9] - var4;
                  if (var13 >= var1.bs && var13 <= var1.bn) {
                     for(int var14 = 0; var14 < var8; ++var14) {
                        VertexNormal var15 = var1.bk[var14];
                        if (var12 == var7[var14] && var13 == var1.aq[var14] && var11 == var1.ab[var14] && var15.ac * -1837445001 != 0) {
                           if (var0.bx == null) {
                              var0.bx = new VertexNormal[var0.verticesCount];
                           }

                           if (var1.bx == null) {
                              var1.bx = new VertexNormal[var8];
                           }

                           VertexNormal var16 = var0.bx[var9];
                           if (var16 == null) {
                              var16 = var0.bx[var9] = new VertexNormal(var10);
                           }

                           VertexNormal var17 = var1.bx[var14];
                           if (var17 == null) {
                              var17 = var1.bx[var14] = new VertexNormal(var15);
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
         for(var9 = 0; var9 < var0.faceCount; ++var9) {
            if (br[var0.at[var9]] == bu && br[var0.aa[var9]] == bu && br[var0.ay[var9]] == bu) {
               if (var0.ao == null) {
                  var0.ao = new byte[var0.faceCount];
               }

               var0.ao[var9] = 2;
            }
         }

         for(var9 = 0; var9 < var1.faceCount; ++var9) {
            if (bg[var1.at[var9]] == bu && bg[var1.aa[var9]] == bu && bg[var1.ay[var9]] == bu) {
               if (var1.ao == null) {
                  var1.ao = new byte[var1.faceCount];
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
      var8.ah = new int[this.faceCount];
      var8.av = new int[this.faceCount];
      var8.ar = new int[this.faceCount];
      if (this.am > 0 && this.ag != null) {
         int[] var9 = new int[this.am];

         int var10;
         for(var10 = 0; var10 < this.faceCount; ++var10) {
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

         var8.aj = new byte[this.faceCount];

         for(var11 = 0; var11 < this.faceCount; ++var11) {
            if (this.ag[var11] != -1) {
               var8.aj[var11] = (byte)var9[this.ag[var11] & 255];
            } else {
               var8.aj[var11] = -1;
            }
         }
      }

      for(int var22 = 0; var22 < this.faceCount; ++var22) {
         byte var23;
         if (this.ao == null) {
            var23 = 0;
         } else {
            var23 = this.ao[var22];
         }

         byte var24;
         if (this.ai == null) {
            var24 = 0;
         } else {
            var24 = this.ai[var22];
         }

         short var12;
         if (this.faceTextures == null) {
            var12 = -1;
         } else {
            var12 = this.faceTextures[var22];
         }

         if (var24 == -2) {
            var23 = 3;
         }

         if (var24 == -1) {
            var23 = 2;
         }

         VertexNormal var13;
         int var14;
         ir var25;
         if (var12 == -1) {
            if (var23 != 0) {
               if (var23 == 1) {
                  var25 = this.be[var22];
                  var14 = var1 + (var3 * var25.af * -18074541 + var4 * var25.an * 1542458359 + var5 * var25.aw * -446870673) / (var7 + var7 / 2);
                  var8.ah[var22] = bi_renamed(this.faceColors[var22] & '\uffff', var14);
                  var8.ar[var22] = -1;
               } else if (var23 == 3) {
                  var8.ah[var22] = 128;
                  var8.ar[var22] = -1;
               } else {
                  var8.ar[var22] = -2;
               }
            } else {
               int var15 = this.faceColors[var22] & '\uffff';
               if (this.bx != null && this.bx[this.at[var22]] != null) {
                  var13 = this.bx[this.at[var22]];
               } else {
                  var13 = this.bk[this.at[var22]];
               }

               var14 = var1 + (var3 * var13.af * -1941999827 + var4 * var13.an * 124229261 + var5 * var13.aw * 2108671835) / (var7 * var13.ac * -1837445001);
               var8.ah[var22] = bi_renamed(var15, var14);
               if (this.bx != null && this.bx[this.aa[var22]] != null) {
                  var13 = this.bx[this.aa[var22]];
               } else {
                  var13 = this.bk[this.aa[var22]];
               }

               var14 = var1 + (var3 * var13.af * -1941999827 + var4 * var13.an * 124229261 + var5 * var13.aw * 2108671835) / (var7 * var13.ac * -1837445001);
               var8.av[var22] = bi_renamed(var15, var14);
               if (this.bx != null && this.bx[this.ay[var22]] != null) {
                  var13 = this.bx[this.ay[var22]];
               } else {
                  var13 = this.bk[this.ay[var22]];
               }

               var14 = var1 + (var3 * var13.af * -1941999827 + var4 * var13.an * 124229261 + var5 * var13.aw * 2108671835) / (var7 * var13.ac * -1837445001);
               var8.ar[var22] = bi_renamed(var15, var14);
            }
         } else if (var23 != 0) {
            if (var23 == 1) {
               var25 = this.be[var22];
               var14 = var1 + (var3 * var25.af * -18074541 + var4 * var25.an * 1542458359 + var5 * var25.aw * -446870673) / (var7 + var7 / 2);
               var8.ah[var22] = be_renamed(var14);
               var8.ar[var22] = -1;
            } else {
               var8.ar[var22] = -2;
            }
         } else {
            if (this.bx != null && this.bx[this.at[var22]] != null) {
               var13 = this.bx[this.at[var22]];
            } else {
               var13 = this.bk[this.at[var22]];
            }

            var14 = var1 + (var3 * var13.af * -1941999827 + var4 * var13.an * 124229261 + var5 * var13.aw * 2108671835) / (var7 * var13.ac * -1837445001);
            var8.ah[var22] = be_renamed(var14);
            if (this.bx != null && this.bx[this.aa[var22]] != null) {
               var13 = this.bx[this.aa[var22]];
            } else {
               var13 = this.bk[this.aa[var22]];
            }

            var14 = var1 + (var3 * var13.af * -1941999827 + var4 * var13.an * 124229261 + var5 * var13.aw * 2108671835) / (var7 * var13.ac * -1837445001);
            var8.av[var22] = be_renamed(var14);
            if (this.bx != null && this.bx[this.ay[var22]] != null) {
               var13 = this.bx[this.ay[var22]];
            } else {
               var13 = this.bk[this.ay[var22]];
            }

            var14 = var1 + (var3 * var13.af * -1941999827 + var4 * var13.an * 124229261 + var5 * var13.aw * 2108671835) / (var7 * var13.ac * -1837445001);
            var8.ar[var22] = be_renamed(var14);
         }
      }

      this.ai();
      var8.al = this.verticesCount;
      var8.at = this.au;
      var8.aa = this.ab;
      var8.ay = this.aq;
      var8.ao = this.faceCount;
      var8.ax = this.at;
      var8.ai = this.aa;
      var8.ag = this.ay;
      var8.am = this.ax;
      var8.as = this.ai;
      var8.az = this.ar;
      var8.bb = this.ap;
      var8.bi = this.by;
      var8.ak = this.faceTextures;
      var8.be = this.bb;
      var8.bk = this.bi;
      return var8;
   }

   static final int be_renamed(int var0) {
      if (var0 < 2) {
         var0 = 2;
      } else if (var0 > 126) {
         var0 = 126;
      }

      return var0;
   }

   static {
      UnlitModel_sine = in.ac;
      UnlitModel_cosine = in.au;
   }

   public UnlitModel ao() {
      UnlitModel var1 = new UnlitModel();
      if (this.ao != null) {
         var1.ao = new byte[this.faceCount];

         for(int var2 = 0; var2 < this.faceCount; ++var2) {
            var1.ao[var2] = this.ao[var2];
         }
      }

      var1.verticesCount = this.verticesCount;
      var1.faceCount = this.faceCount;
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
      var1.faceColors = this.faceColors;
      var1.faceTextures = this.faceTextures;
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

   final int ay(UnlitModel var1, int var2) {
      int var3 = -1;
      int var4 = var1.au[var2];
      int var5 = var1.ab[var2];
      int var6 = var1.aq[var2];

      for(int var7 = 0; var7 < this.verticesCount; ++var7) {
         if (var4 == this.au[var7] && var5 == this.ab[var7] && var6 == this.aq[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.au[this.verticesCount] = var4;
         this.ab[this.verticesCount] = var5;
         this.aq[this.verticesCount] = var6;
         if (var1.ad != null) {
            this.ad[this.verticesCount] = var1.ad[var2];
         }

         if (var1.bb != null) {
            this.bb[this.verticesCount] = var1.bb[var2];
            this.bi[this.verticesCount] = var1.bi[var2];
         }

         var3 = this.verticesCount++;
      }

      return var3;
   }

   void ac(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Packet var4 = new Packet(var1);
      Packet var5 = new Packet(var1);
      Packet var6 = new Packet(var1);
      Packet var7 = new Packet(var1);
      Packet var8 = new Packet(var1);
      var4.index = (var1.length - 23) * -1516355947;
      int var9 = var4.cl();
      int var10 = var4.cl();
      int var11 = var4.g1();
      int var12 = var4.g1();
      int var13 = var4.g1();
      int var14 = var4.g1();
      int var15 = var4.g1();
      int var16 = var4.g1();
      int var17 = var4.g1();
      int var18 = var4.cl();
      int var19 = var4.cl();
      int var20 = var4.cl();
      int var21 = var4.cl();
      int var22 = var4.cl();
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
      this.verticesCount = var9;
      this.faceCount = var10;
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
         this.faceTextures = new short[var10];
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

      this.faceColors = new short[var10];
      var4.index = var24 * -1516355947;
      var5.index = var34 * -1516355947;
      var6.index = var35 * -1516355947;
      var7.index = var23 * -1516355947;
      var8.index = var29 * -1516355947;
      int var37 = 0;
      int var38 = 0;
      int var39 = 0;

      int var40;
      int var41;
      int var42;
      int var43;
      int var44;
      for(var40 = 0; var40 < var9; ++var40) {
         var41 = var4.g1();
         var42 = 0;
         if ((var41 & 1) != 0) {
            var42 = var5.gSmart1or2s();
         }

         var43 = 0;
         if ((var41 & 2) != 0) {
            var43 = var6.gSmart1or2s();
         }

         var44 = 0;
         if ((var41 & 4) != 0) {
            var44 = var7.gSmart1or2s();
         }

         this.au[var40] = var37 + var42;
         this.ab[var40] = var38 + var43;
         this.aq[var40] = var39 + var44;
         var37 = this.au[var40];
         var38 = this.ab[var40];
         var39 = this.aq[var40];
         if (var16 == 1) {
            this.ad[var40] = var8.g1();
         }
      }

      if (var17 == 1) {
         for(var40 = 0; var40 < var9; ++var40) {
            var41 = var8.g1();
            this.bb[var40] = new int[var41];
            this.bi[var40] = new int[var41];

            for(var42 = 0; var42 < var41; ++var42) {
               this.bb[var40][var42] = var8.g1();
               this.bi[var40][var42] = var8.g1();
            }
         }
      }

      var4.index = var32 * -1516355947;
      var5.index = var28 * -1516355947;
      var6.index = var26 * -1516355947;
      var7.index = var30 * -1516355947;
      var8.index = var27 * -1516355947;

      for(var40 = 0; var40 < var10; ++var40) {
         this.faceColors[var40] = (short)var4.cl();
         if (var12 == 1) {
            var41 = var5.g1();
            if ((var41 & 1) == 1) {
               this.ao[var40] = 1;
               var2 = true;
            } else {
               this.ao[var40] = 0;
            }

            if ((var41 & 2) == 2) {
               this.ag[var40] = (byte)(var41 >> 2);
               this.faceTextures[var40] = this.faceColors[var40];
               this.faceColors[var40] = 127;
               if (this.faceTextures[var40] != -1) {
                  var3 = true;
               }
            } else {
               this.ag[var40] = -1;
               this.faceTextures[var40] = -1;
            }
         }

         if (var13 == 255) {
            this.ax[var40] = var6.g1s();
         }

         if (var14 == 1) {
            this.ai[var40] = var7.g1s();
         }

         if (var15 == 1) {
            this.ae[var40] = var8.g1();
         }
      }

      var4.index = var31 * -1516355947;
      var5.index = var25 * -1516355947;
      var40 = 0;
      var41 = 0;
      var42 = 0;
      var43 = 0;

      int var45;
      int var46;
      for(var44 = 0; var44 < var10; ++var44) {
         var45 = var5.g1();
         if (var45 == 1) {
            var40 = var4.gSmart1or2s() + var43;
            var41 = var4.gSmart1or2s() + var40;
            var42 = var4.gSmart1or2s() + var41;
            var43 = var42;
            this.at[var44] = var40;
            this.aa[var44] = var41;
            this.ay[var44] = var42;
         }

         if (var45 == 2) {
            var41 = var42;
            var42 = var4.gSmart1or2s() + var43;
            var43 = var42;
            this.at[var44] = var40;
            this.aa[var44] = var41;
            this.ay[var44] = var42;
         }

         if (var45 == 3) {
            var40 = var42;
            var42 = var4.gSmart1or2s() + var43;
            var43 = var42;
            this.at[var44] = var40;
            this.aa[var44] = var41;
            this.ay[var44] = var42;
         }

         if (var45 == 4) {
            var46 = var40;
            var40 = var41;
            var41 = var46;
            var42 = var4.gSmart1or2s() + var43;
            var43 = var42;
            this.at[var44] = var40;
            this.aa[var44] = var46;
            this.ay[var44] = var42;
         }
      }

      var4.index = var33 * -1516355947;

      for(var44 = 0; var44 < var11; ++var44) {
         this.as[var44] = 0;
         this.aj[var44] = (short)var4.cl();
         this.ak[var44] = (short)var4.cl();
         this.az[var44] = (short)var4.cl();
      }

      if (this.ag != null) {
         boolean var49 = false;

         for(var45 = 0; var45 < var10; ++var45) {
            var46 = this.ag[var45] & 255;
            if (var46 != 255) {
               if ((this.aj[var46] & '\uffff') == this.at[var45] && (this.ak[var46] & '\uffff') == this.aa[var45] && (this.az[var46] & '\uffff') == this.ay[var45]) {
                  this.ag[var45] = -1;
               } else {
                  var49 = true;
               }
            }
         }

         if (!var49) {
            this.ag = null;
         }
      }

      if (!var3) {
         this.faceTextures = null;
      }

      if (!var2) {
         this.ao = null;
      }

   }

   UnlitModel() {
   }

   public static UnlitModel af_renamed(AbstractArchive var0, int var1, int var2) {
      byte[] var3 = var0.takeFile(var1, var2);
      return var3 == null ? null : new UnlitModel(var3);
   }

   public void retexture(short var1, short var2) {
      if (this.faceTextures != null) {
         for(int var3 = 0; var3 < this.faceCount; ++var3) {
            if (this.faceTextures[var3] == var1) {
               this.faceTextures[var3] = var2;
            }
         }

      }
   }

   public void ar(int var1) {
      int var2 = UnlitModel_sine[var1];
      int var3 = UnlitModel_cosine[var1];

      for(int var4 = 0; var4 < this.verticesCount; ++var4) {
         int var5 = this.aq[var4] * var2 + this.au[var4] * var3 >> 16;
         this.aq[var4] = this.aq[var4] * var3 - this.au[var4] * var2 >> 16;
         this.au[var4] = var5;
      }

      this.invalidate();
   }

   public void ad() {
      if (this.bk == null) {
         this.bk = new VertexNormal[this.verticesCount];

         int var1;
         for(var1 = 0; var1 < this.verticesCount; ++var1) {
            this.bk[var1] = new VertexNormal();
         }

         for(var1 = 0; var1 < this.faceCount; ++var1) {
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
               VertexNormal var16 = this.bk[var2];
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
                  this.be = new ir[this.faceCount];
               }

               ir var23 = this.be[var1] = new ir();
               var23.af = var11 * 769404891;
               var23.an = var12 * -1145821753;
               var23.aw = var13 * -2013236337;
            }
         }

      }
   }
}
