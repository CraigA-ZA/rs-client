import accessors.RSModel;
import java.util.Arrays;
import java.util.HashMap;

public class it extends iv implements RSModel {
   static final int cz = 3500;
   static byte[] an = new byte[1];
   static int[] cx;
   static byte[] ac = new byte[1];
   static qj au = new qj();
   static qj ab = new qj();
   static qj aq = new qj();
   public int al = 0;
   int[] at;
   int[] aa;
   static int[] cv;
   public int ao = 0;
   int[] ax;
   int[] ai;
   int[] ag;
   static int[][] ce = new int[12][2000];
   int[] av;
   int[] ar;
   byte[] am;
   byte[] as;
   static float[] ck = new float[10];
   short[] ak;
   public byte az = 0;
   public int ad = 0;
   byte[] aj;
   int[] ap;
   int[][] be;
   int[][] bb;
   public boolean bx = false;
   public byte ch;
   int[][] bk;
   static int[] ba = new int[6500];
   int bo;
   int bz;
   int bm;
   int[] ah;
   static final int co = 50;
   HashMap bj = new HashMap();
   static it af = new it();
   static boolean[] bs = new boolean[6500];
   static boolean[] br = new boolean[6500];
   static it aw = new it();
   static int[] bu = new int[6500];
   static float[] bf = new float[6500];
   static int[] bq = new int[6500];
   int bd;
   static int[] bv = new int[6500];
   static int[] cb;
   static final int bp = 6000;
   static int cm;
   static char[][] bh = new char[6000][512];
   static int[] bw = new int[12];
   static boolean cl = true;
   static int[] ci = new int[2000];
   static int[] cs = new int[2000];
   static int[] cc = new int[12];
   static int[] cn = new int[10];
   static int[] ca = new int[10];
   static int[] cu = new int[10];
   int[] by;
   static int cq;
   static int[] bg = new int[6500];
   static int cf;
   int bt;
   static int[] cy;
   int[][] bi;
   static final int cg = 5;
   static final int cr = 20;
   public byte ct;
   static char[] bc = new char[6000];
   public short cd;
   public byte cj;
   static final float cw;
   static final int bn = 6500;
   int[] ae;
   static int[] bl = new int[6500];
   public byte cp;
   int[] ay;

   public it aa(boolean var1) {
      if (!var1 && an.length < this.ao) {
         an = new byte[this.ao + 100];
      }

      return this.ao(var1, af, an);
   }

   public it(it[] var1, int var2) {
      this.al = 0;
      this.ao = 0;
      this.ad = 0;
      this.az = -1;

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         it var4 = var1[var3];
         if (var4 != null) {
            this.al += var4.al;
            this.ao += var4.ao;
            this.ad += var4.ad;
            if (this.az == -1) {
               this.az = var4.az;
            }
         }
      }

      this.af(this.al, this.ao, this.ad);
      this.al = 0;
      this.ao = 0;
      this.ad = 0;

      for(var3 = 0; var3 < var2; ++var3) {
         this.ac(var1[var3]);
      }

   }

   public it(int var1, int var2, int var3, byte var4) {
      this.af(var1, var2, var3);
      this.az = var4;
      this.al = 0;
      this.ao = 0;
      this.ad = 0;
   }

   public void bi(int var1) {
      int var2 = cy[var1];
      int var3 = cx[var1];

      for(int var4 = 0; var4 < this.al; ++var4) {
         int var5 = this.aa[var4] * var3 - this.ay[var4] * var2 >> 16;
         this.ay[var4] = this.aa[var4] * var2 + this.ay[var4] * var3 >> 16;
         this.aa[var4] = var5;
      }

      this.av();
   }

   void aw(it var1) {
      int var2 = this.ax.length;
      if (this.am == null && (var1.am != null || this.az != var1.az)) {
         this.am = new byte[var2];
         Arrays.fill(this.am, this.az);
      }

      if (this.as == null && var1.as != null) {
         this.as = new byte[var2];
         Arrays.fill(this.as, (byte)0);
      }

      if (this.ak == null && var1.ak != null) {
         this.ak = new short[var2];
         Arrays.fill(this.ak, (short)-1);
      }

      if (this.aj == null && var1.aj != null) {
         this.aj = new byte[var2];
         Arrays.fill(this.aj, (byte)-1);
      }

   }

   public void dv(io var1, int var2, int[] var3, boolean var4) {
      if (var3 == null) {
         this.ar(var1, var2);
      } else {
         il var5 = var1.af[var2];
         ik var6 = var5.au;
         int var7 = 0;
         int var8 = var3[var7++];
         cq = 0;
         cm = 0;
         cf = 0;

         for(int var9 = 0; var9 < var5.ab; ++var9) {
            int var10;
            for(var10 = var5.aq[var9]; var10 > var8; var8 = var3[var7++]) {
            }

            if (var4) {
               if (var10 == var8 || var6.al[var10] == 0) {
                  this.ae(var6.al[var10], var6.at[var10], var5.al[var9], var5.at[var9], var5.aa[var9]);
               }
            } else if (var10 != var8 || var6.al[var10] == 0) {
               this.ae(var6.al[var10], var6.at[var10], var5.al[var9], var5.at[var9], var5.aa[var9]);
            }
         }

      }
   }

   public it at(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.ai();
      int var7 = var2 - this.bm;
      int var8 = var2 + this.bm;
      int var9 = var4 - this.bm;
      int var10 = var4 + this.bm;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            it var11;
            if (var5) {
               var11 = new it();
               var11.al = this.al;
               var11.ao = this.ao;
               var11.ad = this.ad;
               var11.at = this.at;
               var11.ay = this.ay;
               var11.ax = this.ax;
               var11.ai = this.ai;
               var11.ag = this.ag;
               var11.ah = this.ah;
               var11.av = this.av;
               var11.ar = this.ar;
               var11.am = this.am;
               var11.as = this.as;
               var11.aj = this.aj;
               var11.ak = this.ak;
               var11.az = this.az;
               var11.ae = this.ae;
               var11.ap = this.ap;
               var11.by = this.by;
               var11.bb = this.bb;
               var11.bi = this.bi;
               var11.bx = this.bx;
               var11.aa = new int[var11.al];
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
               for(var12 = 0; var12 < var11.al; ++var12) {
                  var13 = this.at[var12] + var2;
                  var14 = this.ay[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.aa[var12] = this.aa[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.al; ++var12) {
                  var13 = (-this.aa[var12] << 16) / (this.et * 1550732737);
                  if (var13 < var6) {
                     var14 = this.at[var12] + var2;
                     var15 = this.ay[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.aa[var12] = this.aa[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.av();
            return var11;
         }
      } else {
         return this;
      }
   }

   public void cu() {
      if (this.bo != 1) {
         this.bo = 1;
         this.et = 0;
         this.bz = 0;
         this.bm = 0;

         for(int var1 = 0; var1 < this.al; ++var1) {
            int var2 = this.at[var1];
            int var3 = this.aa[var1];
            int var4 = this.ay[var1];
            if (-var3 > this.et * 1550732737) {
               this.et = -var3 * -644693439;
            }

            if (var3 > this.bz) {
               this.bz = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.bm) {
               this.bm = var5;
            }
         }

         this.bm = (int)(Math.sqrt((double)this.bm) + 0.99);
         this.bt = (int)(Math.sqrt((double)(this.bm * this.bm + this.et * 1581357103 * this.et * 1550732737)) + 0.99);
         this.bd = this.bt + (int)(Math.sqrt((double)(this.bm * this.bm + this.bz * this.bz)) + 0.99);
      }
   }

   public it ay(boolean var1) {
      if (!var1 && ac.length < this.ao) {
         ac = new byte[this.ao + 100];
      }

      return this.ao(var1, aw, ac);
   }

   it ao(boolean var1, it var2, byte[] var3) {
      var2.al = this.al;
      var2.ao = this.ao;
      var2.ad = this.ad;
      if (var2.at == null || var2.at.length < this.al) {
         var2.at = new int[this.al + 100];
         var2.aa = new int[this.al + 100];
         var2.ay = new int[this.al + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.al; ++var4) {
         var2.at[var4] = this.at[var4];
         var2.aa[var4] = this.aa[var4];
         var2.ay[var4] = this.ay[var4];
      }

      if (var1) {
         var2.as = this.as;
      } else {
         var2.as = var3;
         if (this.as == null) {
            for(var4 = 0; var4 < this.ao; ++var4) {
               var2.as[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.ao; ++var4) {
               var2.as[var4] = this.as[var4];
            }
         }
      }

      var2.ax = this.ax;
      var2.ai = this.ai;
      var2.ag = this.ag;
      var2.ah = this.ah;
      var2.av = this.av;
      var2.ar = this.ar;
      var2.am = this.am;
      var2.aj = this.aj;
      var2.ak = this.ak;
      var2.az = this.az;
      var2.ae = this.ae;
      var2.ap = this.ap;
      var2.by = this.by;
      var2.bb = this.bb;
      var2.bi = this.bi;
      var2.be = this.be;
      var2.bk = this.bk;
      var2.bx = this.bx;
      var2.av();
      var2.cp = 0;
      return var2;
   }

   void ax(int var1) {
      if (!this.bj.containsKey(var1)) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = cx[var1];
         int var9 = cy[var1];

         for(int var10 = 0; var10 < this.al; ++var10) {
            int var11 = fy.af(this.at[var10], this.ay[var10], var8, var9, (byte)6);
            int var12 = this.aa[var10];
            int var13 = gj.an(this.at[var10], this.ay[var10], var8, var9, (byte)91);
            if (var11 < var2) {
               var2 = var11;
            }

            if (var11 > var5) {
               var5 = var11;
            }

            if (var12 < var3) {
               var3 = var12;
            }

            if (var12 > var6) {
               var6 = var12;
            }

            if (var13 < var4) {
               var4 = var13;
            }

            if (var13 > var7) {
               var7 = var13;
            }
         }

         iq var14 = new iq((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
         boolean var15 = true;
         if (var14.ac * -1923653815 < 32) {
            var14.ac = -889692384;
         }

         if (var14.ab * -452185969 < 32) {
            var14.ab = 702402016;
         }

         if (this.bx) {
            boolean var16 = true;
            var14.ac += -222423096;
            var14.ab += 175600504;
         }

         this.bj.put(var1, var14);
      }
   }

   public void bb() {
      for(int var1 = 0; var1 < this.al; ++var1) {
         int var2 = this.ay[var1];
         this.ay[var1] = this.at[var1];
         this.at[var1] = -var2;
      }

      this.av();
   }

   public void da(int var1) {
      int var2 = cy[var1];
      int var3 = cx[var1];

      for(int var4 = 0; var4 < this.al; ++var4) {
         int var5 = this.aa[var4] * var3 - this.ay[var4] * var2 >> 16;
         this.ay[var4] = this.aa[var4] * var2 + this.ay[var4] * var3 >> 16;
         this.aa[var4] = var5;
      }

      this.av();
   }

   public void cz(io var1, int var2) {
      if (this.bb != null) {
         if (var2 != -1) {
            il var3 = var1.af[var2];
            ik var4 = var3.au;
            cq = 0;
            cm = 0;
            cf = 0;

            for(int var5 = 0; var5 < var3.ab; ++var5) {
               int var6 = var3.aq[var5];
               this.ae(var4.al[var6], var4.at[var6], var3.al[var5], var3.at[var5], var3.aa[var5]);
            }

            this.av();
         }
      }
   }

   public void av() {
      this.bo = 0;
      this.bj.clear();
   }

   public void ct(fh var1, int var2) {
      ik var3 = var1.ac;
      ic var4 = var3.an(-1351569612);
      if (var4 != null) {
         var3.an(-2010476646).au(var1, var2, 1481623119);
         this.aj(var3.an(411997093), var1.ac(-2076506354));
      }

      if (var1.au(1713081171)) {
         this.as(var1, var2);
      }

      this.av();
   }

   public void am(fh var1, int var2) {
      ik var3 = var1.ac;
      ic var4 = var3.an(-1572646625);
      if (var4 != null) {
         var3.an(-1665750973).au(var1, var2, 1980554520);
         this.aj(var3.an(1810874091), var1.ac(-2042558319));
      }

      if (var1.au(1713081171)) {
         this.as(var1, var2);
      }

      this.av();
   }

   public int ah() {
      this.ai();
      return this.bm;
   }

   void aj(ic var1, int var2) {
      this.bs(var1, var2);
   }

   public void ak(io var1, int var2, io var3, int var4, int[] var5) {
      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            il var6 = var1.af[var2];
            il var7 = var3.af[var4];
            ik var8 = var6.au;
            cq = 0;
            cm = 0;
            cf = 0;
            int var9 = 0;
            int var10 = var5[var9++];

            int var11;
            int var12;
            for(var11 = 0; var11 < var6.ab; ++var11) {
               for(var12 = var6.aq[var11]; var12 > var10; var10 = var5[var9++]) {
               }

               if (var12 != var10 || var8.al[var12] == 0) {
                  this.ae(var8.al[var12], var8.at[var12], var6.al[var11], var6.at[var11], var6.aa[var11]);
               }
            }

            cq = 0;
            cm = 0;
            cf = 0;
            byte var13 = 0;
            var9 = var13 + 1;
            var10 = var5[var13];

            for(var11 = 0; var11 < var7.ab; ++var11) {
               for(var12 = var7.aq[var11]; var12 > var10; var10 = var5[var9++]) {
               }

               if (var12 == var10 || var8.al[var12] == 0) {
                  this.ae(var8.al[var12], var8.at[var12], var7.al[var11], var7.at[var11], var7.aa[var11]);
               }
            }

            this.av();
         } else {
            this.ar(var1, var2);
         }
      }
   }

   public void be(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.al; ++var4) {
         int[] var10000 = this.at;
         var10000[var4] += var1;
         var10000 = this.aa;
         var10000[var4] += var2;
         var10000 = this.ay;
         var10000[var4] += var3;
      }

      this.av();
   }

   public void ad(io var1, int var2, int[] var3, boolean var4) {
      if (var3 == null) {
         this.ar(var1, var2);
      } else {
         il var5 = var1.af[var2];
         ik var6 = var5.au;
         int var7 = 0;
         int var8 = var3[var7++];
         cq = 0;
         cm = 0;
         cf = 0;

         for(int var9 = 0; var9 < var5.ab; ++var9) {
            int var10;
            for(var10 = var5.aq[var9]; var10 > var8; var8 = var3[var7++]) {
            }

            if (var4) {
               if (var10 == var8 || var6.al[var10] == 0) {
                  this.ae(var6.al[var10], var6.at[var10], var5.al[var9], var5.at[var9], var5.aa[var9]);
               }
            } else if (var10 != var8 || var6.al[var10] == 0) {
               this.ae(var6.al[var10], var6.at[var10], var5.al[var9], var5.at[var9], var5.aa[var9]);
            }
         }

      }
   }

   void ae(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var7;
      int var8;
      int var11;
      int var12;
      if (var1 == 0) {
         var7 = 0;
         cq = 0;
         cm = 0;
         cf = 0;

         for(var8 = 0; var8 < var6; ++var8) {
            int var18 = var2[var8];
            if (var18 < this.bb.length) {
               int[] var19 = this.bb[var18];

               for(var11 = 0; var11 < var19.length; ++var11) {
                  var12 = var19[var11];
                  cq += this.at[var12];
                  cm += this.aa[var12];
                  cf += this.ay[var12];
                  ++var7;
               }
            }
         }

         if (var7 > 0) {
            cq = cq / var7 + var3;
            cm = cm / var7 + var4;
            cf = cf / var7 + var5;
         } else {
            cq = var3;
            cm = var4;
            cf = var5;
         }

      } else {
         int[] var9;
         int var10;
         int[] var10000;
         if (var1 == 1) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.bb.length) {
                  var9 = this.bb[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.at;
                     var10000[var11] += var3;
                     var10000 = this.aa;
                     var10000[var11] += var4;
                     var10000 = this.ay;
                     var10000[var11] += var5;
                  }
               }
            }

         } else if (var1 == 2) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.bb.length) {
                  var9 = this.bb[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.at;
                     var10000[var11] -= cq;
                     var10000 = this.aa;
                     var10000[var11] -= cm;
                     var10000 = this.ay;
                     var10000[var11] -= cf;
                     var12 = (var3 & 255) * 8;
                     int var13 = (var4 & 255) * 8;
                     int var14 = (var5 & 255) * 8;
                     int var15;
                     int var16;
                     int var17;
                     if (var14 != 0) {
                        var15 = cy[var14];
                        var16 = cx[var14];
                        var17 = this.aa[var11] * var15 + this.at[var11] * var16 >> 16;
                        this.aa[var11] = this.aa[var11] * var16 - this.at[var11] * var15 >> 16;
                        this.at[var11] = var17;
                     }

                     if (var12 != 0) {
                        var15 = cy[var12];
                        var16 = cx[var12];
                        var17 = this.aa[var11] * var16 - this.ay[var11] * var15 >> 16;
                        this.ay[var11] = this.aa[var11] * var15 + this.ay[var11] * var16 >> 16;
                        this.aa[var11] = var17;
                     }

                     if (var13 != 0) {
                        var15 = cy[var13];
                        var16 = cx[var13];
                        var17 = this.ay[var11] * var15 + this.at[var11] * var16 >> 16;
                        this.ay[var11] = this.ay[var11] * var16 - this.at[var11] * var15 >> 16;
                        this.at[var11] = var17;
                     }

                     var10000 = this.at;
                     var10000[var11] += cq;
                     var10000 = this.aa;
                     var10000[var11] += cm;
                     var10000 = this.ay;
                     var10000[var11] += cf;
                  }
               }
            }

         } else if (var1 == 3) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.bb.length) {
                  var9 = this.bb[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.at;
                     var10000[var11] -= cq;
                     var10000 = this.aa;
                     var10000[var11] -= cm;
                     var10000 = this.ay;
                     var10000[var11] -= cf;
                     this.at[var11] = this.at[var11] * var3 / 128;
                     this.aa[var11] = this.aa[var11] * var4 / 128;
                     this.ay[var11] = this.ay[var11] * var5 / 128;
                     var10000 = this.at;
                     var10000[var11] += cq;
                     var10000 = this.aa;
                     var10000[var11] += cm;
                     var10000 = this.ay;
                     var10000[var11] += cf;
                  }
               }
            }

         } else if (var1 == 5) {
            if (this.bi != null && this.as != null) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var2[var7];
                  if (var8 < this.bi.length) {
                     var9 = this.bi[var8];

                     for(var10 = 0; var10 < var9.length; ++var10) {
                        var11 = var9[var10];
                        var12 = (this.as[var11] & 255) + var3 * 8;
                        if (var12 < 0) {
                           var12 = 0;
                        } else if (var12 > 255) {
                           var12 = 255;
                        }

                        this.as[var11] = (byte)var12;
                     }
                  }
               }
            }

         }
      }
   }

   public void do(io var1, int var2, io var3, int var4, int[] var5) {
      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            il var6 = var1.af[var2];
            il var7 = var3.af[var4];
            ik var8 = var6.au;
            cq = 0;
            cm = 0;
            cf = 0;
            int var9 = 0;
            int var10 = var5[var9++];

            int var11;
            int var12;
            for(var11 = 0; var11 < var6.ab; ++var11) {
               for(var12 = var6.aq[var11]; var12 > var10; var10 = var5[var9++]) {
               }

               if (var12 != var10 || var8.al[var12] == 0) {
                  this.ae(var8.al[var12], var8.at[var12], var6.al[var11], var6.at[var11], var6.aa[var11]);
               }
            }

            cq = 0;
            cm = 0;
            cf = 0;
            byte var13 = 0;
            var9 = var13 + 1;
            var10 = var5[var13];

            for(var11 = 0; var11 < var7.ab; ++var11) {
               for(var12 = var7.aq[var11]; var12 > var10; var10 = var5[var9++]) {
               }

               if (var12 == var10 || var8.al[var12] == 0) {
                  this.ae(var8.al[var12], var8.at[var12], var7.al[var11], var7.at[var11], var7.aa[var11]);
               }
            }

            this.av();
         } else {
            this.ar(var1, var2);
         }
      }
   }

   public void by() {
      for(int var1 = 0; var1 < this.al; ++var1) {
         this.at[var1] = -this.at[var1];
         this.ay[var1] = -this.ay[var1];
      }

      this.av();
   }

   public it ce(boolean var1) {
      if (!var1 && ac.length < this.ao) {
         ac = new byte[this.ao + 100];
      }

      return this.ao(var1, aw, ac);
   }

   void as(fh var1, int var2) {
      ik var3 = var1.ac;

      for(int var4 = 0; var4 < var3.aq * 1158767581; ++var4) {
         int var5 = var3.al[var4];
         if (var5 == 5 && var1.an != null && var1.an[var4] != null && var1.an[var4][0] != null && this.bi != null && this.as != null) {
            ek var6 = var1.an[var4][0];
            int[] var7 = var3.at[var4];
            int var8 = var7.length;

            for(int var9 = 0; var9 < var8; ++var9) {
               int var10 = var7[var9];
               if (var10 < this.bi.length) {
                  int[] var11 = this.bi[var10];

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     int var13 = var11[var12];
                     int var14 = (int)((float)(this.as[var13] & 255) + var6.aw(var2, -1700300783) * 255.0F);
                     if (var14 < 0) {
                        var14 = 0;
                     } else if (var14 > 255) {
                        var14 = 255;
                     }

                     this.as[var13] = (byte)var14;
                  }
               }
            }
         }
      }

   }

   void bn(int var1, qj var2) {
      float var3 = (float)this.at[var1];
      float var4 = (float)(-this.aa[var1]);
      float var5 = (float)(-this.ay[var1]);
      float var6 = 1.0F;
      this.at[var1] = (int)(var2.au[0] * var3 + var2.au[4] * var4 + var2.au[8] * var5 + var2.au[12] * var6);
      this.aa[var1] = -((int)(var2.au[1] * var3 + var2.au[5] * var4 + var2.au[9] * var5 + var2.au[13] * var6));
      this.ay[var1] = -((int)(var2.au[2] * var3 + var2.au[6] * var4 + var2.au[10] * var5 + var2.au[14] * var6));
   }

   public final void el(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.bo != 2 && this.bo != 1) {
         this.ag();
      }

      int var9 = gd.au(679539611);
      int var10 = ax.ab(141339267);
      int var11 = cy[var1];
      int var12 = cx[var1];
      int var13 = cy[var2];
      int var14 = cx[var2];
      int var15 = cy[var3];
      int var16 = cx[var3];
      int var17 = cy[var4];
      int var18 = cx[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for(int var20 = 0; var20 < this.al; ++var20) {
         int var21 = this.at[var20];
         int var22 = this.aa[var20];
         int var23 = this.ay[var20];
         int var24;
         if (var3 != 0) {
            var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if (var1 != 0) {
            var24 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var24;
         }

         if (var2 != 0) {
            var24 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var24;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         var24 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         bq[var20] = var23 - var19;
         bg[var20] = var9 + var21 * eu.at(-1989528605) / var8;
         bu[var20] = var10 + var24 * eu.at(-1563824813) / var8;
         bf[var20] = df.au(var8, 251841264);
         if (this.ad > 0) {
            ba[var20] = var21;
            bv[var20] = var24;
            bl[var20] = var23;
         }
      }

      try {
         this.bz(false, false, false, 0L);
      } catch (Exception var25) {
      }

   }

   public void ba(it var1) {
      if (var1 != null) {
         this.aw(var1);

         int var2;
         for(var2 = 0; var2 < var1.ao; ++var2) {
            this.ax[this.ao] = var1.ax[var2] + this.al;
            this.ai[this.ao] = var1.ai[var2] + this.al;
            this.ag[this.ao] = var1.ag[var2] + this.al;
            this.ah[this.ao] = var1.ah[var2];
            this.av[this.ao] = var1.av[var2];
            this.ar[this.ao] = var1.ar[var2];
            if (this.am != null) {
               this.am[this.ao] = var1.am != null ? var1.am[var2] : var1.az;
            }

            if (this.as != null && var1.as != null) {
               this.as[this.ao] = var1.as[var2];
            }

            if (this.ak != null) {
               this.ak[this.ao] = var1.ak != null ? var1.ak[var2] : -1;
            }

            if (this.aj != null) {
               if (var1.aj != null && var1.aj[var2] != -1) {
                  this.aj[this.ao] = (byte)(var1.aj[var2] + this.ad);
               } else {
                  this.aj[this.ao] = -1;
               }
            }

            ++this.ao;
         }

         for(var2 = 0; var2 < var1.ad; ++var2) {
            this.ae[this.ad] = var1.ae[var2] + this.al;
            this.ap[this.ad] = var1.ap[var2] + this.al;
            this.by[this.ad] = var1.by[var2] + this.al;
            ++this.ad;
         }

         for(var2 = 0; var2 < var1.al; ++var2) {
            this.at[this.al] = var1.at[var2];
            this.aa[this.al] = var1.aa[var2];
            this.ay[this.al] = var1.ay[var2];
            ++this.al;
         }

      }
   }

   public final void bo(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.bo != 2 && this.bo != 1) {
         this.ag();
      }

      int var9 = gd.au(-1616456716);
      int var10 = ax.ab(-1139847057);
      int var11 = cy[var1];
      int var12 = cx[var1];
      int var13 = cy[var2];
      int var14 = cx[var2];
      int var15 = cy[var3];
      int var16 = cx[var3];
      int var17 = cy[var4];
      int var18 = cx[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for(int var20 = 0; var20 < this.al; ++var20) {
         int var21 = this.at[var20];
         int var22 = this.aa[var20];
         int var23 = this.ay[var20];
         int var24;
         if (var3 != 0) {
            var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if (var1 != 0) {
            var24 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var24;
         }

         if (var2 != 0) {
            var24 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var24;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         var24 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         bq[var20] = var23 - var19;
         bg[var20] = var9 + var21 * eu.at(-1398451712) / var8;
         bu[var20] = var10 + var24 * eu.at(-60466529) / var8;
         bf[var20] = df.au(var8, 1874384832);
         if (this.ad > 0) {
            ba[var20] = var21;
            bv[var20] = var24;
            bl[var20] = var23;
         }
      }

      try {
         this.bz(false, false, false, 0L);
      } catch (Exception var25) {
      }

   }

   void df(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      if (this.bo != 1) {
         this.ai();
      }

      this.ax(var1);
      int var11 = var8 * var5 - var6 * var4 >> 16;
      int var12 = var7 * var2 + var11 * var3 >> 16;
      int var13 = this.bm * var3 >> 16;
      int var14 = var12 + var13;
      if (var14 > 50 && var12 < 3500) {
         int var15 = var8 * var4 + var6 * var5 >> 16;
         int var16 = (var15 - this.bm) * eu.at(-1320099830);
         if (var16 / var14 < kt.aq(1788412659)) {
            int var17 = (var15 + this.bm) * eu.at(-286169550);
            int var18 = var17 / var14;
            int var19 = -1346890391 * in.ab.av;
            if (var18 > var19) {
               int var20 = var7 * var3 - var11 * var2 >> 16;
               int var21 = this.bm * var2 >> 16;
               int var22 = var21 + (this.bz * var3 >> 16);
               int var23 = (var20 + var22) * eu.at(-204654938);
               int var24 = var23 / var14;
               int var25 = in.ab.am * 1380452969;
               if (var24 > var25) {
                  int var26 = var21 + (this.et * 1550732737 * var3 >> 16);
                  int var27 = (var20 - var26) * eu.at(2046151423);
                  if (var27 / var14 < fa.al((byte)6)) {
                     int var28 = var13 + (this.et * 1550732737 * var2 >> 16);
                     boolean var29 = false;
                     boolean var30 = false;
                     if (var12 - var28 <= 50) {
                        var30 = true;
                     }

                     boolean var31 = var30 || this.ad > 0;
                     int var32 = cw.ax(-678191257);
                     int var33 = ix.aw * 148198745;
                     boolean var35 = ix.af;
                     boolean var37 = gq.aw(var9);
                     boolean var38 = false;
                     int var40;
                     int var41;
                     int var42;
                     if (var37 && var35) {
                        boolean var39 = false;
                        if (cl) {
                           var39 = qf.ag(this, var1, var6, var7, var8, (byte)11);
                        } else {
                           var40 = var12 - var13;
                           if (var40 <= 50) {
                              var40 = 50;
                           }

                           if (var15 > 0) {
                              var16 /= var14;
                              var17 /= var40;
                           } else {
                              var17 /= var14;
                              var16 /= var40;
                           }

                           if (var20 > 0) {
                              var27 /= var14;
                              var23 /= var40;
                           } else {
                              var23 /= var14;
                              var27 /= var40;
                           }

                           var41 = var32 - gd.au(-673901293);
                           var42 = var33 - ax.ab(-1711889850);
                           if (var41 > var16 && var41 < var17 && var42 > var27 && var42 < var23) {
                              var39 = true;
                           }
                        }

                        if (var39) {
                           if (this.bx) {
                              cx.ao(var9);
                           } else {
                              var38 = true;
                           }
                        }
                     }

                     int var49 = gd.au(503999866);
                     var40 = ax.ab(-635464644);
                     var41 = 0;
                     var42 = 0;
                     if (var1 != 0) {
                        var41 = cy[var1];
                        var42 = cx[var1];
                     }

                     for(int var43 = 0; var43 < this.al; ++var43) {
                        int var44 = this.at[var43];
                        int var45 = this.aa[var43];
                        int var46 = this.ay[var43];
                        int var47;
                        if (var1 != 0) {
                           var47 = var46 * var41 + var44 * var42 >> 16;
                           var46 = var46 * var42 - var44 * var41 >> 16;
                           var44 = var47;
                        }

                        var44 += var6;
                        var45 += var7;
                        var46 += var8;
                        var47 = var46 * var4 + var44 * var5 >> 16;
                        var46 = var46 * var5 - var44 * var4 >> 16;
                        var44 = var47;
                        var47 = var45 * var3 - var46 * var2 >> 16;
                        var46 = var45 * var2 + var46 * var3 >> 16;
                        bq[var43] = var46 - var12;
                        if (var46 >= 50) {
                           bg[var43] = var49 + var44 * eu.at(2097792310) / var46;
                           bu[var43] = var40 + var47 * eu.at(-1515781515) / var46;
                           bf[var43] = df.au(var46, 1444080454);
                        } else {
                           bg[var43] = -5000;
                           var29 = true;
                        }

                        if (var31) {
                           ba[var43] = var44;
                           bv[var43] = var47;
                           bl[var43] = var46;
                        }
                     }

                     try {
                        this.bz(var29, var38, this.bx, var9);
                     } catch (Exception var48) {
                     }

                  }
               }
            }
         }
      }
   }

   final void bz(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.bd < 6000) {
         int var6;
         for(var6 = 0; var6 < this.bd; ++var6) {
            bc[var6] = 0;
         }

         var6 = var3 ? 20 : 5;

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var15;
         int var16;
         int var18;
         for(var7 = 0; var7 < this.ao; var7 = (char)(var7 + 1)) {
            if (this.ar[var7] != -2) {
               var8 = this.ax[var7];
               var9 = this.ai[var7];
               var10 = this.ag[var7];
               var11 = bg[var8];
               var12 = bg[var9];
               var13 = bg[var10];
               int var17;
               int var32;
               if (var1 && (var11 == -5000 || var12 == -5000 || var13 == -5000)) {
                  var32 = ba[var8];
                  var15 = ba[var9];
                  var16 = ba[var10];
                  var17 = bv[var8];
                  var18 = bv[var9];
                  int var19 = bv[var10];
                  int var20 = bl[var8];
                  int var21 = bl[var9];
                  int var22 = bl[var10];
                  var32 -= var15;
                  var16 -= var15;
                  var17 -= var18;
                  var19 -= var18;
                  var20 -= var21;
                  var22 -= var21;
                  int var23 = var17 * var22 - var20 * var19;
                  int var24 = var20 * var16 - var32 * var22;
                  int var25 = var32 * var19 - var17 * var16;
                  if (var15 * var23 + var18 * var24 + var21 * var25 > 0) {
                     br[var7] = true;
                     int var26 = (bq[var8] + bq[var9] + bq[var10]) / 3 + this.bt;
                     bh[var26][bc[var26]++] = (char)var7;
                  }
               } else {
                  if (var2) {
                     var15 = bu[var8];
                     var16 = bu[var9];
                     var17 = bu[var10];
                     var18 = 148198745 * ix.aw + var6;
                     boolean var14;
                     if (var18 < var15 && var18 < var16 && var18 < var17) {
                        var14 = false;
                     } else {
                        var18 = ix.aw * 148198745 - var6;
                        if (var18 > var15 && var18 > var16 && var18 > var17) {
                           var14 = false;
                        } else {
                           var18 = var6 + ix.an * 2139535413;
                           if (var18 < var11 && var18 < var12 && var18 < var13) {
                              var14 = false;
                           } else {
                              var18 = ix.an * 2139535413 - var6;
                              if (var18 > var11 && var18 > var12 && var18 > var13) {
                                 var14 = false;
                              } else {
                                 var14 = true;
                              }
                           }
                        }
                     }

                     if (var14) {
                        cx.ao(var4);
                        var2 = false;
                     }
                  }

                  if ((var11 - var12) * (bu[var10] - bu[var9]) - (bu[var8] - bu[var9]) * (var13 - var12) > 0) {
                     br[var7] = false;
                     var32 = aq.aa(-1788010106);
                     if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= var32 && var12 <= var32 && var13 <= var32) {
                        bs[var7] = false;
                     } else {
                        bs[var7] = true;
                     }

                     var15 = (bq[var8] + bq[var9] + bq[var10]) / 3 + this.bt;
                     bh[var15][bc[var15]++] = (char)var7;
                  }
               }
            }
         }

         char var27;
         char[] var28;
         if (this.am == null) {
            for(var7 = this.bd - 1; var7 >= 0; --var7) {
               var27 = bc[var7];
               if (var27 > 0) {
                  var28 = bh[var7];

                  for(var10 = 0; var10 < var27; ++var10) {
                     this.bm(var28[var10]);
                  }
               }
            }

         } else {
            for(var7 = 0; var7 < 12; ++var7) {
               bw[var7] = 0;
               cc[var7] = 0;
            }

            for(var7 = this.bd - 1; var7 >= 0; --var7) {
               var27 = bc[var7];
               if (var27 > 0) {
                  var28 = bh[var7];

                  for(var10 = 0; var10 < var27; ++var10) {
                     char var29 = var28[var10];
                     byte var30 = this.am[var29];
                     var13 = bw[var30]++;
                     ce[var30][var13] = var29;
                     if (var30 < 10) {
                        int[] var35 = cc;
                        var35[var30] += var7;
                     } else if (var30 == 10) {
                        ci[var13] = var7;
                     } else {
                        cs[var13] = var7;
                     }
                  }
               }
            }

            var7 = 0;
            if (bw[1] > 0 || bw[2] > 0) {
               var7 = (cc[1] + cc[2]) / (bw[1] + bw[2]);
            }

            var8 = 0;
            if (bw[3] > 0 || bw[4] > 0) {
               var8 = (cc[3] + cc[4]) / (bw[3] + bw[4]);
            }

            var9 = 0;
            if (bw[6] > 0 || bw[8] > 0) {
               var9 = (cc[6] + cc[8]) / (bw[6] + bw[8]);
            }

            var11 = 0;
            var12 = bw[10];
            int[] var31 = ce[10];
            int[] var33 = ci;
            if (var11 == var12) {
               var11 = 0;
               var12 = bw[11];
               var31 = ce[11];
               var33 = cs;
            }

            if (var11 < var12) {
               var10 = var33[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var7) {
                  this.bm(var31[var11++]);
                  if (var11 == var12 && var31 != ce[11]) {
                     var11 = 0;
                     var12 = bw[11];
                     var31 = ce[11];
                     var33 = cs;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.bm(var31[var11++]);
                  if (var11 == var12 && var31 != ce[11]) {
                     var11 = 0;
                     var12 = bw[11];
                     var31 = ce[11];
                     var33 = cs;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.bm(var31[var11++]);
                  if (var11 == var12 && var31 != ce[11]) {
                     var11 = 0;
                     var12 = bw[11];
                     var31 = ce[11];
                     var33 = cs;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = bw[var15];
               int[] var34 = ce[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.bm(var34[var18]);
               }
            }

            while(var10 != -1000) {
               this.bm(var31[var11++]);
               if (var11 == var12 && var31 != ce[11]) {
                  var11 = 0;
                  var31 = ce[11];
                  var12 = bw[11];
                  var33 = cs;
               }

               if (var11 < var12) {
                  var10 = var33[var11];
               } else {
                  var10 = -1000;
               }
            }

         }
      }
   }

   final void bm(int var1) {
      if (br[var1]) {
         this.bj(var1);
      } else {
         int var2 = this.ax[var1];
         int var3 = this.ai[var1];
         int var4 = this.ag[var1];
         in.ab.af = bs[var1];
         if (this.as == null) {
            in.ab.aw = 0;
         } else {
            in.ab.aw = (this.as[var1] & 255) * -1087605381;
         }

         this.bt(var1, bu[var2], bu[var3], bu[var4], bg[var2], bg[var3], bg[var4], bf[var2], bf[var3], bf[var4], this.ah[var1], this.av[var1], this.ar[var1]);
      }
   }

   boolean bd(int var1) {
      return this.cp > 0 && var1 < this.cd;
   }

   final void bt(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
      int var15;
      int var16;
      int var17;
      if (this.ak != null && this.ak[var1] != -1) {
         int var20;
         if (this.aj != null && this.aj[var1] != -1) {
            var17 = this.aj[var1] & 255;
            var20 = this.ae[var17];
            var15 = this.ap[var17];
            var16 = this.by[var17];
         } else {
            var20 = this.ax[var1];
            var15 = this.ai[var1];
            var16 = this.ag[var1];
         }

         if (this.ar[var1] == -1) {
            az.ar(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, ba[var20], ba[var15], ba[var16], bv[var20], bv[var15], bv[var16], bl[var20], bl[var15], bl[var16], this.ak[var1], (short)26065);
         } else {
            az.ar(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, ba[var20], ba[var15], ba[var16], bv[var20], bv[var15], bv[var16], bl[var20], bl[var15], bl[var16], this.ak[var1], (short)-16054);
         }
      } else {
         boolean var14 = this.bd(var1);
         byte var18;
         if (this.ar[var1] == -1 && var14) {
            var15 = cv[this.ah[var1]];
            var16 = this.cj;
            var17 = this.ch;
            var18 = this.ct;
            byte var19 = this.cp;
            in.aq.au(var2, var3, var4, var5, var6, var7, var8, var9, var10, var15, (byte)var16, (byte)var17, var18, var19, -1620123395);
         } else if (this.ar[var1] == -1) {
            fw.av(var2, var3, var4, var5, var6, var7, var8, var9, var10, cv[this.ah[var1]], -1859113077);
         } else if (var14) {
            var15 = this.cj;
            var16 = this.ch;
            var17 = this.ct;
            var18 = this.cp;
            in.aq.ac(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, (byte)var15, (byte)var16, (byte)var17, var18, (byte)-58);
         } else {
            jk.ah(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, -428480375);
         }
      }

   }

   public final void es(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.bo != 2 && this.bo != 1) {
         this.ag();
      }

      int var9 = gd.au(841462324);
      int var10 = ax.ab(956991344);
      int var11 = cy[var1];
      int var12 = cx[var1];
      int var13 = cy[var2];
      int var14 = cx[var2];
      int var15 = cy[var3];
      int var16 = cx[var3];
      int var17 = cy[var4];
      int var18 = cx[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for(int var20 = 0; var20 < this.al; ++var20) {
         int var21 = this.at[var20];
         int var22 = this.aa[var20];
         int var23 = this.ay[var20];
         int var24;
         if (var3 != 0) {
            var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if (var1 != 0) {
            var24 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var24;
         }

         if (var2 != 0) {
            var24 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var24;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         var24 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         bq[var20] = var23 - var19;
         bg[var20] = var9 + var21 * eu.at(1211975950) / var8;
         bu[var20] = var10 + var24 * eu.at(-1755079044) / var8;
         bf[var20] = df.au(var8, 1273986691);
         if (this.ad > 0) {
            ba[var20] = var21;
            bv[var20] = var24;
            bl[var20] = var23;
         }
      }

      try {
         this.bz(false, false, false, 0L);
      } catch (Exception var25) {
      }

   }

   public void dr(io var1, int var2, io var3, int var4, int[] var5) {
      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            il var6 = var1.af[var2];
            il var7 = var3.af[var4];
            ik var8 = var6.au;
            cq = 0;
            cm = 0;
            cf = 0;
            int var9 = 0;
            int var10 = var5[var9++];

            int var11;
            int var12;
            for(var11 = 0; var11 < var6.ab; ++var11) {
               for(var12 = var6.aq[var11]; var12 > var10; var10 = var5[var9++]) {
               }

               if (var12 != var10 || var8.al[var12] == 0) {
                  this.ae(var8.al[var12], var8.at[var12], var6.al[var11], var6.at[var11], var6.aa[var11]);
               }
            }

            cq = 0;
            cm = 0;
            cf = 0;
            byte var13 = 0;
            var9 = var13 + 1;
            var10 = var5[var13];

            for(var11 = 0; var11 < var7.ab; ++var11) {
               for(var12 = var7.aq[var11]; var12 > var10; var10 = var5[var9++]) {
               }

               if (var12 == var10 || var8.al[var12] == 0) {
                  this.ae(var8.al[var12], var8.at[var12], var7.al[var11], var7.at[var11], var7.aa[var11]);
               }
            }

            this.av();
         } else {
            this.ar(var1, var2);
         }
      }
   }

   void bs(ic var1, int var2) {
      if (this.be != null) {
         for(int var3 = 0; var3 < this.al; ++var3) {
            int[] var4 = this.be[var3];
            if (var4 != null && var4.length != 0) {
               int[] var5 = this.bk[var3];
               au.aq(1283851159);

               for(int var6 = 0; var6 < var4.length; ++var6) {
                  int var7 = var4[var6];
                  ew var8 = var1.aw(var7, (byte)119);
                  if (var8 != null) {
                     ab.at((float)var5[var6] / 255.0F, -2059885087);
                     aq.al(var8.al(var2, 250554518), 1972086993);
                     aq.ao(ab, 2018256268);
                     au.ay(aq, -1643954745);
                  }
               }

               this.bn(var3, au);
            }
         }

      }
   }

   static {
      cy = in.ac;
      cx = in.au;
      cv = in.af;
      cb = in.aw;
      cw = df.au(50, 1228620083);
   }

   it() {
   }

   void dd(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      if (this.bo != 1) {
         this.ai();
      }

      this.ax(var1);
      int var11 = var8 * var5 - var6 * var4 >> 16;
      int var12 = var7 * var2 + var11 * var3 >> 16;
      int var13 = this.bm * var3 >> 16;
      int var14 = var12 + var13;
      if (var14 > 50 && var12 < 3500) {
         int var15 = var8 * var4 + var6 * var5 >> 16;
         int var16 = (var15 - this.bm) * eu.at(2082245810);
         if (var16 / var14 < kt.aq(1706609087)) {
            int var17 = (var15 + this.bm) * eu.at(-1031286153);
            int var18 = var17 / var14;
            int var19 = -1346890391 * in.ab.av;
            if (var18 > var19) {
               int var20 = var7 * var3 - var11 * var2 >> 16;
               int var21 = this.bm * var2 >> 16;
               int var22 = var21 + (this.bz * var3 >> 16);
               int var23 = (var20 + var22) * eu.at(1644928393);
               int var24 = var23 / var14;
               int var25 = in.ab.am * 1380452969;
               if (var24 > var25) {
                  int var26 = var21 + (this.et * 1550732737 * var3 >> 16);
                  int var27 = (var20 - var26) * eu.at(1018782067);
                  if (var27 / var14 < fa.al((byte)6)) {
                     int var28 = var13 + (this.et * 1550732737 * var2 >> 16);
                     boolean var29 = false;
                     boolean var30 = false;
                     if (var12 - var28 <= 50) {
                        var30 = true;
                     }

                     boolean var31 = var30 || this.ad > 0;
                     int var32 = cw.ax(-85610950);
                     int var33 = ix.aw * 148198745;
                     boolean var35 = ix.af;
                     boolean var37 = gq.aw(var9);
                     boolean var38 = false;
                     int var40;
                     int var41;
                     int var42;
                     if (var37 && var35) {
                        boolean var39 = false;
                        if (cl) {
                           var39 = qf.ag(this, var1, var6, var7, var8, (byte)21);
                        } else {
                           var40 = var12 - var13;
                           if (var40 <= 50) {
                              var40 = 50;
                           }

                           if (var15 > 0) {
                              var16 /= var14;
                              var17 /= var40;
                           } else {
                              var17 /= var14;
                              var16 /= var40;
                           }

                           if (var20 > 0) {
                              var27 /= var14;
                              var23 /= var40;
                           } else {
                              var23 /= var14;
                              var27 /= var40;
                           }

                           var41 = var32 - gd.au(15316915);
                           var42 = var33 - ax.ab(495725681);
                           if (var41 > var16 && var41 < var17 && var42 > var27 && var42 < var23) {
                              var39 = true;
                           }
                        }

                        if (var39) {
                           if (this.bx) {
                              cx.ao(var9);
                           } else {
                              var38 = true;
                           }
                        }
                     }

                     int var49 = gd.au(-1662958914);
                     var40 = ax.ab(-769596186);
                     var41 = 0;
                     var42 = 0;
                     if (var1 != 0) {
                        var41 = cy[var1];
                        var42 = cx[var1];
                     }

                     for(int var43 = 0; var43 < this.al; ++var43) {
                        int var44 = this.at[var43];
                        int var45 = this.aa[var43];
                        int var46 = this.ay[var43];
                        int var47;
                        if (var1 != 0) {
                           var47 = var46 * var41 + var44 * var42 >> 16;
                           var46 = var46 * var42 - var44 * var41 >> 16;
                           var44 = var47;
                        }

                        var44 += var6;
                        var45 += var7;
                        var46 += var8;
                        var47 = var46 * var4 + var44 * var5 >> 16;
                        var46 = var46 * var5 - var44 * var4 >> 16;
                        var44 = var47;
                        var47 = var45 * var3 - var46 * var2 >> 16;
                        var46 = var45 * var2 + var46 * var3 >> 16;
                        bq[var43] = var46 - var12;
                        if (var46 >= 50) {
                           bg[var43] = var49 + var44 * eu.at(-1488926706) / var46;
                           bu[var43] = var40 + var47 * eu.at(-1772444624) / var46;
                           bf[var43] = df.au(var46, -19023253);
                        } else {
                           bg[var43] = -5000;
                           var29 = true;
                        }

                        if (var31) {
                           ba[var43] = var44;
                           bv[var43] = var47;
                           bl[var43] = var46;
                        }
                     }

                     try {
                        this.bz(var29, var38, this.bx, var9);
                     } catch (Exception var48) {
                     }

                  }
               }
            }
         }
      }
   }

   void dj(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      if (this.bo != 1) {
         this.ai();
      }

      this.ax(var1);
      int var11 = var8 * var5 - var6 * var4 >> 16;
      int var12 = var7 * var2 + var11 * var3 >> 16;
      int var13 = this.bm * var3 >> 16;
      int var14 = var12 + var13;
      if (var14 > 50 && var12 < 3500) {
         int var15 = var8 * var4 + var6 * var5 >> 16;
         int var16 = (var15 - this.bm) * eu.at(-1013866611);
         if (var16 / var14 < kt.aq(1936711915)) {
            int var17 = (var15 + this.bm) * eu.at(1850479187);
            int var18 = var17 / var14;
            int var19 = -1346890391 * in.ab.av;
            if (var18 > var19) {
               int var20 = var7 * var3 - var11 * var2 >> 16;
               int var21 = this.bm * var2 >> 16;
               int var22 = var21 + (this.bz * var3 >> 16);
               int var23 = (var20 + var22) * eu.at(951165993);
               int var24 = var23 / var14;
               int var25 = in.ab.am * 1380452969;
               if (var24 > var25) {
                  int var26 = var21 + (this.et * 1550732737 * var3 >> 16);
                  int var27 = (var20 - var26) * eu.at(-585863365);
                  if (var27 / var14 < fa.al((byte)6)) {
                     int var28 = var13 + (this.et * 1550732737 * var2 >> 16);
                     boolean var29 = false;
                     boolean var30 = false;
                     if (var12 - var28 <= 50) {
                        var30 = true;
                     }

                     boolean var31 = var30 || this.ad > 0;
                     int var32 = cw.ax(-595044136);
                     int var33 = ix.aw * 148198745;
                     boolean var35 = ix.af;
                     boolean var37 = gq.aw(var9);
                     boolean var38 = false;
                     int var40;
                     int var41;
                     int var42;
                     if (var37 && var35) {
                        boolean var39 = false;
                        if (cl) {
                           var39 = qf.ag(this, var1, var6, var7, var8, (byte)90);
                        } else {
                           var40 = var12 - var13;
                           if (var40 <= 50) {
                              var40 = 50;
                           }

                           if (var15 > 0) {
                              var16 /= var14;
                              var17 /= var40;
                           } else {
                              var17 /= var14;
                              var16 /= var40;
                           }

                           if (var20 > 0) {
                              var27 /= var14;
                              var23 /= var40;
                           } else {
                              var23 /= var14;
                              var27 /= var40;
                           }

                           var41 = var32 - gd.au(932285686);
                           var42 = var33 - ax.ab(1513711828);
                           if (var41 > var16 && var41 < var17 && var42 > var27 && var42 < var23) {
                              var39 = true;
                           }
                        }

                        if (var39) {
                           if (this.bx) {
                              cx.ao(var9);
                           } else {
                              var38 = true;
                           }
                        }
                     }

                     int var49 = gd.au(-711462544);
                     var40 = ax.ab(-1999243172);
                     var41 = 0;
                     var42 = 0;
                     if (var1 != 0) {
                        var41 = cy[var1];
                        var42 = cx[var1];
                     }

                     for(int var43 = 0; var43 < this.al; ++var43) {
                        int var44 = this.at[var43];
                        int var45 = this.aa[var43];
                        int var46 = this.ay[var43];
                        int var47;
                        if (var1 != 0) {
                           var47 = var46 * var41 + var44 * var42 >> 16;
                           var46 = var46 * var42 - var44 * var41 >> 16;
                           var44 = var47;
                        }

                        var44 += var6;
                        var45 += var7;
                        var46 += var8;
                        var47 = var46 * var4 + var44 * var5 >> 16;
                        var46 = var46 * var5 - var44 * var4 >> 16;
                        var44 = var47;
                        var47 = var45 * var3 - var46 * var2 >> 16;
                        var46 = var45 * var2 + var46 * var3 >> 16;
                        bq[var43] = var46 - var12;
                        if (var46 >= 50) {
                           bg[var43] = var49 + var44 * eu.at(1709088480) / var46;
                           bu[var43] = var40 + var47 * eu.at(-936694643) / var46;
                           bf[var43] = df.au(var46, 421198624);
                        } else {
                           bg[var43] = -5000;
                           var29 = true;
                        }

                        if (var31) {
                           ba[var43] = var44;
                           bv[var43] = var47;
                           bl[var43] = var46;
                        }
                     }

                     try {
                        this.bz(var29, var38, this.bx, var9);
                     } catch (Exception var48) {
                     }

                  }
               }
            }
         }
      }
   }

   void br(int var1, int var2, int var3) {
      this.at = new int[var1];
      this.aa = new int[var1];
      this.ay = new int[var1];
      this.ax = new int[var2];
      this.ai = new int[var2];
      this.ag = new int[var2];
      this.ah = new int[var2];
      this.av = new int[var2];
      this.ar = new int[var2];
      if (var3 > 0) {
         this.ae = new int[var3];
         this.ap = new int[var3];
         this.by = new int[var3];
      }

   }

   void bg(int var1, int var2, int var3) {
      this.at = new int[var1];
      this.aa = new int[var1];
      this.ay = new int[var1];
      this.ax = new int[var2];
      this.ai = new int[var2];
      this.ag = new int[var2];
      this.ah = new int[var2];
      this.av = new int[var2];
      this.ar = new int[var2];
      if (var3 > 0) {
         this.ae = new int[var3];
         this.ap = new int[var3];
         this.by = new int[var3];
      }

   }

   void bu(int var1, int var2, int var3) {
      this.at = new int[var1];
      this.aa = new int[var1];
      this.ay = new int[var1];
      this.ax = new int[var2];
      this.ai = new int[var2];
      this.ag = new int[var2];
      this.ah = new int[var2];
      this.av = new int[var2];
      this.ar = new int[var2];
      if (var3 > 0) {
         this.ae = new int[var3];
         this.ap = new int[var3];
         this.by = new int[var3];
      }

   }

   public void dt(ik var1, fh var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      ic var7 = var1.an(761976567);
      if (var7 != null) {
         var7.ab(var2, var3, var4, var5, -2123682677);
         if (var6) {
            this.aj(var7, var2.ac(-1850731737));
         }
      }

      if (!var5 && var2.au(1713081171)) {
         this.as(var2, var3);
      }

   }

   void bq(it var1) {
      int var2 = this.ax.length;
      if (this.am == null && (var1.am != null || this.az != var1.az)) {
         this.am = new byte[var2];
         Arrays.fill(this.am, this.az);
      }

      if (this.as == null && var1.as != null) {
         this.as = new byte[var2];
         Arrays.fill(this.as, (byte)0);
      }

      if (this.ak == null && var1.ak != null) {
         this.ak = new short[var2];
         Arrays.fill(this.ak, (short)-1);
      }

      if (this.aj == null && var1.aj != null) {
         this.aj = new byte[var2];
         Arrays.fill(this.aj, (byte)-1);
      }

   }

   final void bj(int var1) {
      int var2 = gd.au(95425776);
      int var3 = ax.ab(872857315);
      int var4 = 0;
      int var5 = this.ax[var1];
      int var6 = this.ai[var1];
      int var7 = this.ag[var1];
      int var8 = bl[var5];
      int var9 = bl[var6];
      int var10 = bl[var7];
      if (this.as == null) {
         in.ab.aw = 0;
      } else {
         in.ab.aw = (this.as[var1] & 255) * -1087605381;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if (var8 >= 50) {
         cn[var4] = bg[var5];
         ca[var4] = bu[var5];
         ck[var4] = bf[var7];
         cu[var4++] = this.ah[var1];
      } else {
         var11 = ba[var5];
         var12 = bv[var5];
         var13 = this.ah[var1];
         if (var10 >= 50) {
            var14 = (50 - var8) * cb[var10 - var8];
            cn[var4] = var2 + (var11 + ((ba[var7] - var11) * var14 >> 16)) * eu.at(-1302284774) / 50;
            ca[var4] = var3 + (var12 + ((bv[var7] - var12) * var14 >> 16)) * eu.at(1638810477) / 50;
            ck[var4] = cw;
            cu[var4++] = var13 + ((this.ar[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 50) {
            var14 = (50 - var8) * cb[var9 - var8];
            cn[var4] = var2 + (var11 + ((ba[var6] - var11) * var14 >> 16)) * eu.at(1389624775) / 50;
            ca[var4] = var3 + (var12 + ((bv[var6] - var12) * var14 >> 16)) * eu.at(-1412739144) / 50;
            ck[var4] = cw;
            cu[var4++] = var13 + ((this.av[var1] - var13) * var14 >> 16);
         }
      }

      if (var9 >= 50) {
         cn[var4] = bg[var6];
         ca[var4] = bu[var6];
         ck[var4] = bf[var7];
         cu[var4++] = this.av[var1];
      } else {
         var11 = ba[var6];
         var12 = bv[var6];
         var13 = this.av[var1];
         if (var8 >= 50) {
            var14 = (50 - var9) * cb[var8 - var9];
            cn[var4] = var2 + (var11 + ((ba[var5] - var11) * var14 >> 16)) * eu.at(-143504688) / 50;
            ca[var4] = var3 + (var12 + ((bv[var5] - var12) * var14 >> 16)) * eu.at(1889241777) / 50;
            ck[var4] = cw;
            cu[var4++] = var13 + ((this.ah[var1] - var13) * var14 >> 16);
         }

         if (var10 >= 50) {
            var14 = (50 - var9) * cb[var10 - var9];
            cn[var4] = var2 + (var11 + ((ba[var7] - var11) * var14 >> 16)) * eu.at(-1042225413) / 50;
            ca[var4] = var3 + (var12 + ((bv[var7] - var12) * var14 >> 16)) * eu.at(720496843) / 50;
            cu[var4++] = var13 + ((this.ar[var1] - var13) * var14 >> 16);
         }
      }

      if (var10 >= 50) {
         cn[var4] = bg[var7];
         ca[var4] = bu[var7];
         ck[var4] = bf[var7];
         cu[var4++] = this.ar[var1];
      } else {
         var11 = ba[var7];
         var12 = bv[var7];
         var13 = this.ar[var1];
         if (var9 >= 50) {
            var14 = (50 - var10) * cb[var9 - var10];
            cn[var4] = var2 + (var11 + ((ba[var6] - var11) * var14 >> 16)) * eu.at(1019779405) / 50;
            ca[var4] = var3 + (var12 + ((bv[var6] - var12) * var14 >> 16)) * eu.at(928270370) / 50;
            ck[var4] = cw;
            cu[var4++] = var13 + ((this.av[var1] - var13) * var14 >> 16);
         }

         if (var8 >= 50) {
            var14 = (50 - var10) * cb[var8 - var10];
            cn[var4] = var2 + (var11 + ((ba[var5] - var11) * var14 >> 16)) * eu.at(-172713699) / 50;
            ca[var4] = var3 + (var12 + ((bv[var5] - var12) * var14 >> 16)) * eu.at(200000014) / 50;
            ck[var4] = cw;
            cu[var4++] = var13 + ((this.ah[var1] - var13) * var14 >> 16);
         }
      }

      var11 = cn[0];
      var12 = cn[1];
      var13 = cn[2];
      var14 = ca[0];
      int var15 = ca[1];
      int var16 = ca[2];
      float var17 = ck[0];
      float var18 = ck[1];
      float var19 = ck[2];
      in.ab.af = false;
      int var20 = aq.aa(281290493);
      if (var4 == 3) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
            in.ab.af = true;
         }

         this.bt(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, cu[0], cu[1], cu[2]);
      }

      if (var4 == 4) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || cn[3] < 0 || cn[3] > var20) {
            in.ab.af = true;
         }

         int var22;
         int var23;
         int var24;
         short var40;
         if (this.ak != null && this.ak[var1] != -1) {
            int var38;
            if (this.aj != null && this.aj[var1] != -1) {
               var24 = this.aj[var1] & 255;
               var38 = this.ae[var24];
               var22 = this.ap[var24];
               var23 = this.by[var24];
            } else {
               var38 = var5;
               var22 = var6;
               var23 = var7;
            }

            var40 = this.ak[var1];
            if (this.ar[var1] == -1) {
               az.ar(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.ah[var1], this.ah[var1], this.ah[var1], ba[var38], ba[var22], ba[var23], bv[var38], bv[var22], bv[var23], bl[var38], bl[var22], bl[var23], var40, (short)16635);
               az.ar(var14, var16, ca[3], var11, var13, cn[3], var17, var19, ck[3], this.ah[var1], this.ah[var1], this.ah[var1], ba[var38], ba[var22], ba[var23], bv[var38], bv[var22], bv[var23], bl[var38], bl[var22], bl[var23], var40, (short)-32721);
            } else {
               az.ar(var14, var15, var16, var11, var12, var13, var17, var18, var19, cu[0], cu[1], cu[2], ba[var38], ba[var22], ba[var23], bv[var38], bv[var22], bv[var23], bl[var38], bl[var22], bl[var23], var40, (short)12522);
               az.ar(var14, var16, ca[3], var11, var13, cn[3], var17, var19, ck[3], cu[0], cu[2], cu[3], ba[var38], ba[var22], ba[var23], bv[var38], bv[var22], bv[var23], bl[var38], bl[var22], bl[var23], var40, (short)18389);
            }
         } else {
            boolean var21 = this.bd(var1);
            byte var25;
            byte var26;
            int var27;
            int var28;
            if (this.ar[var1] == -1 && var21) {
               var22 = cv[this.ah[var1]];
               byte var39 = this.cj;
               var40 = this.ch;
               var25 = this.ct;
               var26 = this.cp;
               in.aq.au(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, var39, (byte)var40, var25, var26, -1620123395);
               var27 = ca[3];
               var28 = cn[3];
               float var41 = ck[3];
               byte var42 = this.cj;
               byte var43 = this.ch;
               byte var44 = this.ct;
               byte var45 = this.cp;
               in.aq.au(var14, var16, var27, var11, var13, var28, var17, var19, var41, var22, var42, var43, var44, var45, -1620123395);
            } else if (this.ar[var1] == -1) {
               var22 = cv[this.ah[var1]];
               fw.av(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, -207720501);
               fw.av(var14, var16, ca[3], var11, var13, cn[3], var17, var19, ck[3], var22, 352019099);
            } else if (var21) {
               var22 = cu[0];
               var23 = cu[1];
               var24 = cu[2];
               var25 = this.cj;
               var26 = this.ct;
               var27 = this.ch;
               var28 = this.cp;
               in.aq.ac(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, var23, var24, var25, var26, (byte)var27, (byte)var28, (byte)-71);
               int var29 = ca[3];
               int var30 = cn[3];
               int var31 = cu[0];
               int var32 = cu[2];
               int var33 = cu[3];
               byte var34 = this.cj;
               byte var35 = this.ct;
               byte var36 = this.ch;
               byte var37 = this.cp;
               in.aq.ac(var14, var16, var29, var11, var13, var30, 0.0F, 0.0F, 0.0F, var31, var32, var33, var34, var35, var36, var37, (byte)-126);
            } else {
               jk.ah(var14, var15, var16, var11, var12, var13, var17, var18, var19, cu[0], cu[1], cu[2], -428480375);
               jk.ah(var14, var16, ca[3], var11, var13, cn[3], var17, var19, ck[3], cu[0], cu[2], cu[3], -428480375);
            }
         }
      }

   }

   public int cr() {
      this.ai();
      return this.bm;
   }

   void dw(ic var1, int var2) {
      this.bs(var1, var2);
   }

   public it bp(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.ai();
      int var7 = var2 - this.bm;
      int var8 = var2 + this.bm;
      int var9 = var4 - this.bm;
      int var10 = var4 + this.bm;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            it var11;
            if (var5) {
               var11 = new it();
               var11.al = this.al;
               var11.ao = this.ao;
               var11.ad = this.ad;
               var11.at = this.at;
               var11.ay = this.ay;
               var11.ax = this.ax;
               var11.ai = this.ai;
               var11.ag = this.ag;
               var11.ah = this.ah;
               var11.av = this.av;
               var11.ar = this.ar;
               var11.am = this.am;
               var11.as = this.as;
               var11.aj = this.aj;
               var11.ak = this.ak;
               var11.az = this.az;
               var11.ae = this.ae;
               var11.ap = this.ap;
               var11.by = this.by;
               var11.bb = this.bb;
               var11.bi = this.bi;
               var11.bx = this.bx;
               var11.aa = new int[var11.al];
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
               for(var12 = 0; var12 < var11.al; ++var12) {
                  var13 = this.at[var12] + var2;
                  var14 = this.ay[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.aa[var12] = this.aa[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.al; ++var12) {
                  var13 = (-this.aa[var12] << 16) / (this.et * 1550732737);
                  if (var13 < var6) {
                     var14 = this.at[var12] + var2;
                     var15 = this.ay[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.aa[var12] = this.aa[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.av();
            return var11;
         }
      } else {
         return this;
      }
   }

   public final void ea(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (this.bo != 2 && this.bo != 1) {
         this.ag();
      }

      int var8 = gd.au(262473629);
      int var9 = ax.ab(-518877069);
      int var10 = cy[var1];
      int var11 = cx[var1];
      int var12 = cy[var2];
      int var13 = cx[var2];
      int var14 = cy[var3];
      int var15 = cx[var3];
      int var16 = cy[var4];
      int var17 = cx[var4];
      int var18 = var6 * var16 + var7 * var17 >> 16;

      for(int var19 = 0; var19 < this.al; ++var19) {
         int var20 = this.at[var19];
         int var21 = this.aa[var19];
         int var22 = this.ay[var19];
         int var23;
         if (var3 != 0) {
            var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if (var1 != 0) {
            var23 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var23;
         }

         if (var2 != 0) {
            var23 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var23;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         var23 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         bq[var19] = var22 - var18;
         bg[var19] = var8 + var20 * eu.at(-1299442076) / var22;
         bu[var19] = var9 + var23 * eu.at(1489437911) / var22;
         bf[var19] = df.au(var22, 650465009);
         if (this.ad > 0) {
            ba[var19] = var20;
            bv[var19] = var23;
            bl[var19] = var22;
         }
      }

      try {
         this.bz(false, false, false, 0L);
      } catch (Exception var24) {
      }

   }

   public it bh(boolean var1) {
      if (!var1 && an.length < this.ao) {
         an = new byte[this.ao + 100];
      }

      return this.ao(var1, af, an);
   }

   public it bw(boolean var1) {
      if (!var1 && ac.length < this.ao) {
         ac = new byte[this.ao + 100];
      }

      return this.ao(var1, aw, ac);
   }

   final void ey(int var1) {
      int var2 = gd.au(399681782);
      int var3 = ax.ab(606944201);
      int var4 = 0;
      int var5 = this.ax[var1];
      int var6 = this.ai[var1];
      int var7 = this.ag[var1];
      int var8 = bl[var5];
      int var9 = bl[var6];
      int var10 = bl[var7];
      if (this.as == null) {
         in.ab.aw = 0;
      } else {
         in.ab.aw = (this.as[var1] & 255) * -1087605381;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if (var8 >= 50) {
         cn[var4] = bg[var5];
         ca[var4] = bu[var5];
         ck[var4] = bf[var7];
         cu[var4++] = this.ah[var1];
      } else {
         var11 = ba[var5];
         var12 = bv[var5];
         var13 = this.ah[var1];
         if (var10 >= 50) {
            var14 = (50 - var8) * cb[var10 - var8];
            cn[var4] = var2 + (var11 + ((ba[var7] - var11) * var14 >> 16)) * eu.at(111911501) / 50;
            ca[var4] = var3 + (var12 + ((bv[var7] - var12) * var14 >> 16)) * eu.at(-946617381) / 50;
            ck[var4] = cw;
            cu[var4++] = var13 + ((this.ar[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 50) {
            var14 = (50 - var8) * cb[var9 - var8];
            cn[var4] = var2 + (var11 + ((ba[var6] - var11) * var14 >> 16)) * eu.at(181846008) / 50;
            ca[var4] = var3 + (var12 + ((bv[var6] - var12) * var14 >> 16)) * eu.at(-132163643) / 50;
            ck[var4] = cw;
            cu[var4++] = var13 + ((this.av[var1] - var13) * var14 >> 16);
         }
      }

      if (var9 >= 50) {
         cn[var4] = bg[var6];
         ca[var4] = bu[var6];
         ck[var4] = bf[var7];
         cu[var4++] = this.av[var1];
      } else {
         var11 = ba[var6];
         var12 = bv[var6];
         var13 = this.av[var1];
         if (var8 >= 50) {
            var14 = (50 - var9) * cb[var8 - var9];
            cn[var4] = var2 + (var11 + ((ba[var5] - var11) * var14 >> 16)) * eu.at(978700698) / 50;
            ca[var4] = var3 + (var12 + ((bv[var5] - var12) * var14 >> 16)) * eu.at(-1358640230) / 50;
            ck[var4] = cw;
            cu[var4++] = var13 + ((this.ah[var1] - var13) * var14 >> 16);
         }

         if (var10 >= 50) {
            var14 = (50 - var9) * cb[var10 - var9];
            cn[var4] = var2 + (var11 + ((ba[var7] - var11) * var14 >> 16)) * eu.at(318649455) / 50;
            ca[var4] = var3 + (var12 + ((bv[var7] - var12) * var14 >> 16)) * eu.at(-1469351734) / 50;
            cu[var4++] = var13 + ((this.ar[var1] - var13) * var14 >> 16);
         }
      }

      if (var10 >= 50) {
         cn[var4] = bg[var7];
         ca[var4] = bu[var7];
         ck[var4] = bf[var7];
         cu[var4++] = this.ar[var1];
      } else {
         var11 = ba[var7];
         var12 = bv[var7];
         var13 = this.ar[var1];
         if (var9 >= 50) {
            var14 = (50 - var10) * cb[var9 - var10];
            cn[var4] = var2 + (var11 + ((ba[var6] - var11) * var14 >> 16)) * eu.at(-102230718) / 50;
            ca[var4] = var3 + (var12 + ((bv[var6] - var12) * var14 >> 16)) * eu.at(-546712257) / 50;
            ck[var4] = cw;
            cu[var4++] = var13 + ((this.av[var1] - var13) * var14 >> 16);
         }

         if (var8 >= 50) {
            var14 = (50 - var10) * cb[var8 - var10];
            cn[var4] = var2 + (var11 + ((ba[var5] - var11) * var14 >> 16)) * eu.at(1018882175) / 50;
            ca[var4] = var3 + (var12 + ((bv[var5] - var12) * var14 >> 16)) * eu.at(1549017579) / 50;
            ck[var4] = cw;
            cu[var4++] = var13 + ((this.ah[var1] - var13) * var14 >> 16);
         }
      }

      var11 = cn[0];
      var12 = cn[1];
      var13 = cn[2];
      var14 = ca[0];
      int var15 = ca[1];
      int var16 = ca[2];
      float var17 = ck[0];
      float var18 = ck[1];
      float var19 = ck[2];
      in.ab.af = false;
      int var20 = aq.aa(-1521256899);
      if (var4 == 3) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
            in.ab.af = true;
         }

         this.bt(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, cu[0], cu[1], cu[2]);
      }

      if (var4 == 4) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || cn[3] < 0 || cn[3] > var20) {
            in.ab.af = true;
         }

         int var22;
         int var23;
         int var24;
         short var40;
         if (this.ak != null && this.ak[var1] != -1) {
            int var38;
            if (this.aj != null && this.aj[var1] != -1) {
               var24 = this.aj[var1] & 255;
               var38 = this.ae[var24];
               var22 = this.ap[var24];
               var23 = this.by[var24];
            } else {
               var38 = var5;
               var22 = var6;
               var23 = var7;
            }

            var40 = this.ak[var1];
            if (this.ar[var1] == -1) {
               az.ar(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.ah[var1], this.ah[var1], this.ah[var1], ba[var38], ba[var22], ba[var23], bv[var38], bv[var22], bv[var23], bl[var38], bl[var22], bl[var23], var40, (short)-5746);
               az.ar(var14, var16, ca[3], var11, var13, cn[3], var17, var19, ck[3], this.ah[var1], this.ah[var1], this.ah[var1], ba[var38], ba[var22], ba[var23], bv[var38], bv[var22], bv[var23], bl[var38], bl[var22], bl[var23], var40, (short)-7877);
            } else {
               az.ar(var14, var15, var16, var11, var12, var13, var17, var18, var19, cu[0], cu[1], cu[2], ba[var38], ba[var22], ba[var23], bv[var38], bv[var22], bv[var23], bl[var38], bl[var22], bl[var23], var40, (short)-29403);
               az.ar(var14, var16, ca[3], var11, var13, cn[3], var17, var19, ck[3], cu[0], cu[2], cu[3], ba[var38], ba[var22], ba[var23], bv[var38], bv[var22], bv[var23], bl[var38], bl[var22], bl[var23], var40, (short)-7027);
            }
         } else {
            boolean var21 = this.bd(var1);
            byte var25;
            byte var26;
            int var27;
            int var28;
            if (this.ar[var1] == -1 && var21) {
               var22 = cv[this.ah[var1]];
               byte var39 = this.cj;
               var40 = this.ch;
               var25 = this.ct;
               var26 = this.cp;
               in.aq.au(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, var39, (byte)var40, var25, var26, -1620123395);
               var27 = ca[3];
               var28 = cn[3];
               float var41 = ck[3];
               byte var42 = this.cj;
               byte var43 = this.ch;
               byte var44 = this.ct;
               byte var45 = this.cp;
               in.aq.au(var14, var16, var27, var11, var13, var28, var17, var19, var41, var22, var42, var43, var44, var45, -1620123395);
            } else if (this.ar[var1] == -1) {
               var22 = cv[this.ah[var1]];
               fw.av(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, -568783421);
               fw.av(var14, var16, ca[3], var11, var13, cn[3], var17, var19, ck[3], var22, 546216340);
            } else if (var21) {
               var22 = cu[0];
               var23 = cu[1];
               var24 = cu[2];
               var25 = this.cj;
               var26 = this.ct;
               var27 = this.ch;
               var28 = this.cp;
               in.aq.ac(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, var23, var24, var25, var26, (byte)var27, (byte)var28, (byte)-128);
               int var29 = ca[3];
               int var30 = cn[3];
               int var31 = cu[0];
               int var32 = cu[2];
               int var33 = cu[3];
               byte var34 = this.cj;
               byte var35 = this.ct;
               byte var36 = this.ch;
               byte var37 = this.cp;
               in.aq.ac(var14, var16, var29, var11, var13, var30, 0.0F, 0.0F, 0.0F, var31, var32, var33, var34, var35, var36, var37, (byte)-37);
            } else {
               jk.ah(var14, var15, var16, var11, var12, var13, var17, var18, var19, cu[0], cu[1], cu[2], -428480375);
               jk.ah(var14, var16, ca[3], var11, var13, cn[3], var17, var19, ck[3], cu[0], cu[2], cu[3], -428480375);
            }
         }
      }

   }

   public void ar(io var1, int var2) {
      if (this.bb != null) {
         if (var2 != -1) {
            il var3 = var1.af[var2];
            ik var4 = var3.au;
            cq = 0;
            cm = 0;
            cf = 0;

            for(int var5 = 0; var5 < var3.ab; ++var5) {
               int var6 = var3.aq[var5];
               this.ae(var4.al[var6], var4.at[var6], var3.al[var5], var3.at[var5], var3.aa[var5]);
            }

            this.av();
         }
      }
   }

   it cs(boolean var1, it var2, byte[] var3) {
      var2.al = this.al;
      var2.ao = this.ao;
      var2.ad = this.ad;
      if (var2.at == null || var2.at.length < this.al) {
         var2.at = new int[this.al + 969664020];
         var2.aa = new int[this.al + 100];
         var2.ay = new int[this.al + -500839];
      }

      int var4;
      for(var4 = 0; var4 < this.al; ++var4) {
         var2.at[var4] = this.at[var4];
         var2.aa[var4] = this.aa[var4];
         var2.ay[var4] = this.ay[var4];
      }

      if (var1) {
         var2.as = this.as;
      } else {
         var2.as = var3;
         if (this.as == null) {
            for(var4 = 0; var4 < this.ao; ++var4) {
               var2.as[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.ao; ++var4) {
               var2.as[var4] = this.as[var4];
            }
         }
      }

      var2.ax = this.ax;
      var2.ai = this.ai;
      var2.ag = this.ag;
      var2.ah = this.ah;
      var2.av = this.av;
      var2.ar = this.ar;
      var2.am = this.am;
      var2.aj = this.aj;
      var2.ak = this.ak;
      var2.az = this.az;
      var2.ae = this.ae;
      var2.ap = this.ap;
      var2.by = this.by;
      var2.bb = this.bb;
      var2.bi = this.bi;
      var2.be = this.be;
      var2.bk = this.bk;
      var2.bx = this.bx;
      var2.av();
      var2.cp = 0;
      return var2;
   }

   it cc(boolean var1, it var2, byte[] var3) {
      var2.al = this.al;
      var2.ao = this.ao;
      var2.ad = this.ad;
      if (var2.at == null || var2.at.length < this.al) {
         var2.at = new int[this.al + 997125025];
         var2.aa = new int[this.al + 100];
         var2.ay = new int[this.al + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.al; ++var4) {
         var2.at[var4] = this.at[var4];
         var2.aa[var4] = this.aa[var4];
         var2.ay[var4] = this.ay[var4];
      }

      if (var1) {
         var2.as = this.as;
      } else {
         var2.as = var3;
         if (this.as == null) {
            for(var4 = 0; var4 < this.ao; ++var4) {
               var2.as[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.ao; ++var4) {
               var2.as[var4] = this.as[var4];
            }
         }
      }

      var2.ax = this.ax;
      var2.ai = this.ai;
      var2.ag = this.ag;
      var2.ah = this.ah;
      var2.av = this.av;
      var2.ar = this.ar;
      var2.am = this.am;
      var2.aj = this.aj;
      var2.ak = this.ak;
      var2.az = this.az;
      var2.ae = this.ae;
      var2.ap = this.ap;
      var2.by = this.by;
      var2.bb = this.bb;
      var2.bi = this.bi;
      var2.be = this.be;
      var2.bk = this.bk;
      var2.bx = this.bx;
      var2.av();
      var2.cp = 0;
      return var2;
   }

   void cn(int var1) {
      if (!this.bj.containsKey(var1)) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = cx[var1];
         int var9 = cy[var1];

         int var11;
         for(int var10 = 0; var10 < this.al; ++var10) {
            var11 = fy.af(this.at[var10], this.ay[var10], var8, var9, (byte)-31);
            int var12 = this.aa[var10];
            int var13 = gj.an(this.at[var10], this.ay[var10], var8, var9, (byte)43);
            if (var11 < var2) {
               var2 = var11;
            }

            if (var11 > var5) {
               var5 = var11;
            }

            if (var12 < var3) {
               var3 = var12;
            }

            if (var12 > var6) {
               var6 = var12;
            }

            if (var13 < var4) {
               var4 = var13;
            }

            if (var13 > var7) {
               var7 = var13;
            }
         }

         iq var14 = new iq((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
         var11 = 2066300766;
         if (var14.ac * -1923653815 < -107742183) {
            var14.ac = -889692384;
         }

         if (var14.ab * -452185969 < -963310703) {
            var14.ab = -1624052030;
         }

         if (this.bx) {
            boolean var15 = true;
            var14.ac += -1749513468;
            var14.ab += 175600504;
         }

         this.bj.put(var1, var14);
      }
   }

   public void ca() {
      if (this.bo != 1) {
         this.bo = 1;
         this.et = 0;
         this.bz = 0;
         this.bm = 0;

         for(int var1 = 0; var1 < this.al; ++var1) {
            int var2 = this.at[var1];
            int var3 = this.aa[var1];
            int var4 = this.ay[var1];
            if (-var3 > this.et * 1550732737) {
               this.et = -var3 * -644693439;
            }

            if (var3 > this.bz) {
               this.bz = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.bm) {
               this.bm = var5;
            }
         }

         this.bm = (int)(Math.sqrt((double)this.bm) + 0.99);
         this.bt = (int)(Math.sqrt((double)(this.bm * this.bm + this.et * 1550732737 * this.et * 1550732737)) + 0.99);
         this.bd = this.bt + (int)(Math.sqrt((double)(this.bm * this.bm + this.bz * this.bz)) + 0.99);
      }
   }

   public void az(ik var1, fh var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      ic var7 = var1.an(-870517645);
      if (var7 != null) {
         var7.ab(var2, var3, var4, var5, -944205793);
         if (var6) {
            this.aj(var7, var2.ac(-2096519042));
         }
      }

      if (!var5 && var2.au(1713081171)) {
         this.as(var2, var3);
      }

   }

   public void ck() {
      if (this.bo != 1) {
         this.bo = 1;
         this.et = 0;
         this.bz = 0;
         this.bm = 0;

         for(int var1 = 0; var1 < this.al; ++var1) {
            int var2 = this.at[var1];
            int var3 = this.aa[var1];
            int var4 = this.ay[var1];
            if (-var3 > this.et * 1550732737) {
               this.et = -var3 * -644693439;
            }

            if (var3 > this.bz) {
               this.bz = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.bm) {
               this.bm = var5;
            }
         }

         this.bm = (int)(Math.sqrt((double)this.bm) + 0.99);
         this.bt = (int)(Math.sqrt((double)(this.bm * this.bm + this.et * 1550732737 * this.et * 1550732737)) + 0.99);
         this.bd = this.bt + (int)(Math.sqrt((double)(this.bm * this.bm + this.bz * this.bz)) + 0.99);
      }
   }

   public void cq() {
      if (this.bo != 1) {
         this.bo = 1;
         this.et = 0;
         this.bz = 0;
         this.bm = 0;

         for(int var1 = 0; var1 < this.al; ++var1) {
            int var2 = this.at[var1];
            int var3 = this.aa[var1];
            int var4 = this.ay[var1];
            if (-var3 > this.et * 1550732737) {
               this.et = -var3 * 1536136836;
            }

            if (var3 > this.bz) {
               this.bz = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.bm) {
               this.bm = var5;
            }
         }

         this.bm = (int)(Math.sqrt((double)this.bm) + 0.99);
         this.bt = (int)(Math.sqrt((double)(this.bm * this.bm + this.et * 995599161 * this.et * 1550732737)) + 0.99);
         this.bd = this.bt + (int)(Math.sqrt((double)(this.bm * this.bm + this.bz * this.bz)) + 0.99);
      }
   }

   public void cm() {
      if (this.bo != 1) {
         this.bo = 1;
         this.et = 0;
         this.bz = 0;
         this.bm = 0;

         for(int var1 = 0; var1 < this.al; ++var1) {
            int var2 = this.at[var1];
            int var3 = this.aa[var1];
            int var4 = this.ay[var1];
            if (-var3 > this.et * -583996032) {
               this.et = -var3 * 1591333732;
            }

            if (var3 > this.bz) {
               this.bz = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.bm) {
               this.bm = var5;
            }
         }

         this.bm = (int)(Math.sqrt((double)this.bm) + 0.99);
         this.bt = (int)(Math.sqrt((double)(this.bm * this.bm + this.et * 1550732737 * this.et * 1550732737)) + 0.99);
         this.bd = this.bt + (int)(Math.sqrt((double)(this.bm * this.bm + this.bz * this.bz)) + 0.99);
      }
   }

   void cf() {
      if (this.bo != 2) {
         this.bo = 2;
         this.bm = 0;

         for(int var1 = 0; var1 < this.al; ++var1) {
            int var2 = this.at[var1];
            int var3 = this.aa[var1];
            int var4 = this.ay[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if (var5 > this.bm) {
               this.bm = var5;
            }
         }

         this.bm = (int)(Math.sqrt((double)this.bm) + 0.99);
         this.bt = this.bm;
         this.bd = this.bm + this.bm;
      }
   }

   void cl() {
      if (this.bo != 2) {
         this.bo = 2;
         this.bm = 0;

         for(int var1 = 0; var1 < this.al; ++var1) {
            int var2 = this.at[var1];
            int var3 = this.aa[var1];
            int var4 = this.ay[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if (var5 > this.bm) {
               this.bm = var5;
            }
         }

         this.bm = (int)(Math.sqrt((double)this.bm) + 0.99);
         this.bt = this.bm;
         this.bd = this.bm + this.bm;
      }
   }

   public int cg() {
      this.ai();
      return this.bm;
   }

   public void ai() {
      if (this.bo != 1) {
         this.bo = 1;
         this.et = 0;
         this.bz = 0;
         this.bm = 0;

         for(int var1 = 0; var1 < this.al; ++var1) {
            int var2 = this.at[var1];
            int var3 = this.aa[var1];
            int var4 = this.ay[var1];
            if (-var3 > this.et * 1550732737) {
               this.et = -var3 * -644693439;
            }

            if (var3 > this.bz) {
               this.bz = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.bm) {
               this.bm = var5;
            }
         }

         this.bm = (int)(Math.sqrt((double)this.bm) + 0.99);
         this.bt = (int)(Math.sqrt((double)(this.bm * this.bm + this.et * 1550732737 * this.et * 1550732737)) + 0.99);
         this.bd = this.bt + (int)(Math.sqrt((double)(this.bm * this.bm + this.bz * this.bz)) + 0.99);
      }
   }

   public int cy() {
      this.ai();
      return this.bm;
   }

   public int cx() {
      this.ai();
      return this.bm;
   }

   public int cv() {
      this.ai();
      return this.bm;
   }

   public void cb() {
      this.bo = 0;
      this.bj.clear();
   }

   public void co() {
      this.bo = 0;
      this.bj.clear();
   }

   public void dk(ik var1, fh var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      ic var7 = var1.an(-1328703004);
      if (var7 != null) {
         var7.ab(var2, var3, var4, var5, -1890418329);
         if (var6) {
            this.aj(var7, var2.ac(-2018875291));
         }
      }

      if (!var5 && var2.au(1713081171)) {
         this.as(var2, var3);
      }

   }

   public void cw(io var1, int var2) {
      if (this.bb != null) {
         if (var2 != -1) {
            il var3 = var1.af[var2];
            ik var4 = var3.au;
            cq = 0;
            cm = 0;
            cf = 0;

            for(int var5 = 0; var5 < var3.ab; ++var5) {
               int var6 = var3.aq[var5];
               this.ae(var4.al[var6], var4.at[var6], var3.al[var5], var3.at[var5], var3.aa[var5]);
            }

            this.av();
         }
      }
   }

   public void cj(io var1, int var2) {
      if (this.bb != null) {
         if (var2 != -1) {
            il var3 = var1.af[var2];
            ik var4 = var3.au;
            cq = 0;
            cm = 0;
            cf = 0;

            for(int var5 = 0; var5 < var3.ab; ++var5) {
               int var6 = var3.aq[var5];
               this.ae(var4.al[var6], var4.at[var6], var3.al[var5], var3.at[var5], var3.aa[var5]);
            }

            this.av();
         }
      }
   }

   public void bk(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.al; ++var4) {
         this.at[var4] = this.at[var4] * var1 / 128;
         this.aa[var4] = this.aa[var4] * var2 / 128;
         this.ay[var4] = this.ay[var4] * var3 / 128;
      }

      this.av();
   }

   final void ev(int var1) {
      if (br[var1]) {
         this.bj(var1);
      } else {
         int var2 = this.ax[var1];
         int var3 = this.ai[var1];
         int var4 = this.ag[var1];
         in.ab.af = bs[var1];
         if (this.as == null) {
            in.ab.aw = 0;
         } else {
            in.ab.aw = (this.as[var1] & 255) * -1087605381;
         }

         this.bt(var1, bu[var2], bu[var3], bu[var4], bg[var2], bg[var3], bg[var4], bf[var2], bf[var3], bf[var4], this.ah[var1], this.av[var1], this.ar[var1]);
      }
   }

   void cp(fh var1, int var2) {
      ik var3 = var1.ac;

      for(int var4 = 0; var4 < var3.aq * 859454199; ++var4) {
         int var5 = var3.al[var4];
         if (var5 == 5 && var1.an != null && var1.an[var4] != null && var1.an[var4][0] != null && this.bi != null && this.as != null) {
            ek var6 = var1.an[var4][0];
            int[] var7 = var3.at[var4];
            int var8 = var7.length;

            for(int var9 = 0; var9 < var8; ++var9) {
               int var10 = var7[var9];
               if (var10 < this.bi.length) {
                  int[] var11 = this.bi[var10];

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     int var13 = var11[var12];
                     int var14 = (int)((float)(this.as[var13] & -1936234000) + var6.aw(var2, -1678561692) * 255.0F);
                     if (var14 < 0) {
                        var14 = 0;
                     } else if (var14 > -1263029120) {
                        var14 = 255;
                     }

                     this.as[var13] = (byte)var14;
                  }
               }
            }
         }
      }

   }

   void cd(ic var1, int var2) {
      this.bs(var1, var2);
   }

   void af(int var1, int var2, int var3) {
      this.at = new int[var1];
      this.aa = new int[var1];
      this.ay = new int[var1];
      this.ax = new int[var2];
      this.ai = new int[var2];
      this.ag = new int[var2];
      this.ah = new int[var2];
      this.av = new int[var2];
      this.ar = new int[var2];
      if (var3 > 0) {
         this.ae = new int[var3];
         this.ap = new int[var3];
         this.by = new int[var3];
      }

   }

   public void dg(io var1, int var2, int[] var3, boolean var4) {
      if (var3 == null) {
         this.ar(var1, var2);
      } else {
         il var5 = var1.af[var2];
         ik var6 = var5.au;
         int var7 = 0;
         int var8 = var3[var7++];
         cq = 0;
         cm = 0;
         cf = 0;

         for(int var9 = 0; var9 < var5.ab; ++var9) {
            int var10;
            for(var10 = var5.aq[var9]; var10 > var8; var8 = var3[var7++]) {
            }

            if (var4) {
               if (var10 == var8 || var6.al[var10] == 0) {
                  this.ae(var6.al[var10], var6.at[var10], var5.al[var9], var5.at[var9], var5.aa[var9]);
               }
            } else if (var10 != var8 || var6.al[var10] == 0) {
               this.ae(var6.al[var10], var6.at[var10], var5.al[var9], var5.at[var9], var5.aa[var9]);
            }
         }

      }
   }

   void dc(ic var1, int var2) {
      this.bs(var1, var2);
   }

   boolean em(int var1) {
      return this.cp > 0 && var1 < this.cd;
   }

   public void di(io var1, int var2, io var3, int var4, int[] var5) {
      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            il var6 = var1.af[var2];
            il var7 = var3.af[var4];
            ik var8 = var6.au;
            cq = 0;
            cm = 0;
            cf = 0;
            int var9 = 0;
            int var10 = var5[var9++];

            int var11;
            int var12;
            for(var11 = 0; var11 < var6.ab; ++var11) {
               for(var12 = var6.aq[var11]; var12 > var10; var10 = var5[var9++]) {
               }

               if (var12 != var10 || var8.al[var12] == 0) {
                  this.ae(var8.al[var12], var8.at[var12], var6.al[var11], var6.at[var11], var6.aa[var11]);
               }
            }

            cq = 0;
            cm = 0;
            cf = 0;
            byte var13 = 0;
            var9 = var13 + 1;
            var10 = var5[var13];

            for(var11 = 0; var11 < var7.ab; ++var11) {
               for(var12 = var7.aq[var11]; var12 > var10; var10 = var5[var9++]) {
               }

               if (var12 == var10 || var8.al[var12] == 0) {
                  this.ae(var8.al[var12], var8.at[var12], var7.al[var11], var7.at[var11], var7.aa[var11]);
               }
            }

            this.av();
         } else {
            this.ar(var1, var2);
         }
      }
   }

   void dq(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      if (this.bo != 1) {
         this.ai();
      }

      this.ax(var1);
      int var11 = var8 * var5 - var6 * var4 >> 16;
      int var12 = var7 * var2 + var11 * var3 >> 16;
      int var13 = this.bm * var3 >> 16;
      int var14 = var12 + var13;
      if (var14 > 50 && var12 < 3500) {
         int var15 = var8 * var4 + var6 * var5 >> 16;
         int var16 = (var15 - this.bm) * eu.at(-1479302619);
         if (var16 / var14 < kt.aq(1916786055)) {
            int var17 = (var15 + this.bm) * eu.at(310281643);
            int var18 = var17 / var14;
            int var19 = -1346890391 * in.ab.av;
            if (var18 > var19) {
               int var20 = var7 * var3 - var11 * var2 >> 16;
               int var21 = this.bm * var2 >> 16;
               int var22 = var21 + (this.bz * var3 >> 16);
               int var23 = (var20 + var22) * eu.at(-1677969012);
               int var24 = var23 / var14;
               int var25 = in.ab.am * 1380452969;
               if (var24 > var25) {
                  int var26 = var21 + (this.et * 1550732737 * var3 >> 16);
                  int var27 = (var20 - var26) * eu.at(1524812658);
                  if (var27 / var14 < fa.al((byte)6)) {
                     int var28 = var13 + (this.et * 1550732737 * var2 >> 16);
                     boolean var29 = false;
                     boolean var30 = false;
                     if (var12 - var28 <= 50) {
                        var30 = true;
                     }

                     boolean var31 = var30 || this.ad > 0;
                     int var32 = cw.ax(-745601645);
                     int var33 = ix.aw * 148198745;
                     boolean var35 = ix.af;
                     boolean var37 = gq.aw(var9);
                     boolean var38 = false;
                     int var40;
                     int var41;
                     int var42;
                     if (var37 && var35) {
                        boolean var39 = false;
                        if (cl) {
                           var39 = qf.ag(this, var1, var6, var7, var8, (byte)92);
                        } else {
                           var40 = var12 - var13;
                           if (var40 <= 50) {
                              var40 = 50;
                           }

                           if (var15 > 0) {
                              var16 /= var14;
                              var17 /= var40;
                           } else {
                              var17 /= var14;
                              var16 /= var40;
                           }

                           if (var20 > 0) {
                              var27 /= var14;
                              var23 /= var40;
                           } else {
                              var23 /= var14;
                              var27 /= var40;
                           }

                           var41 = var32 - gd.au(-412790989);
                           var42 = var33 - ax.ab(446704928);
                           if (var41 > var16 && var41 < var17 && var42 > var27 && var42 < var23) {
                              var39 = true;
                           }
                        }

                        if (var39) {
                           if (this.bx) {
                              cx.ao(var9);
                           } else {
                              var38 = true;
                           }
                        }
                     }

                     int var49 = gd.au(-1797641926);
                     var40 = ax.ab(559612447);
                     var41 = 0;
                     var42 = 0;
                     if (var1 != 0) {
                        var41 = cy[var1];
                        var42 = cx[var1];
                     }

                     for(int var43 = 0; var43 < this.al; ++var43) {
                        int var44 = this.at[var43];
                        int var45 = this.aa[var43];
                        int var46 = this.ay[var43];
                        int var47;
                        if (var1 != 0) {
                           var47 = var46 * var41 + var44 * var42 >> 16;
                           var46 = var46 * var42 - var44 * var41 >> 16;
                           var44 = var47;
                        }

                        var44 += var6;
                        var45 += var7;
                        var46 += var8;
                        var47 = var46 * var4 + var44 * var5 >> 16;
                        var46 = var46 * var5 - var44 * var4 >> 16;
                        var44 = var47;
                        var47 = var45 * var3 - var46 * var2 >> 16;
                        var46 = var45 * var2 + var46 * var3 >> 16;
                        bq[var43] = var46 - var12;
                        if (var46 >= 50) {
                           bg[var43] = var49 + var44 * eu.at(-313117699) / var46;
                           bu[var43] = var40 + var47 * eu.at(-373067325) / var46;
                           bf[var43] = df.au(var46, 1507097185);
                        } else {
                           bg[var43] = -5000;
                           var29 = true;
                        }

                        if (var31) {
                           ba[var43] = var44;
                           bv[var43] = var47;
                           bl[var43] = var46;
                        }
                     }

                     try {
                        this.bz(var29, var38, this.bx, var9);
                     } catch (Exception var48) {
                     }

                  }
               }
            }
         }
      }
   }

   public void dl(ik var1, fh var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      ic var7 = var1.an(1892699677);
      if (var7 != null) {
         var7.ab(var2, var3, var4, var5, -994842239);
         if (var6) {
            this.aj(var7, var2.ac(-2097900247));
         }
      }

      if (!var5 && var2.au(1713081171)) {
         this.as(var2, var3);
      }

   }

   void dh(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var7;
      int var8;
      int var11;
      int var12;
      if (var1 == 0) {
         var7 = 0;
         cq = 0;
         cm = 0;
         cf = 0;

         for(var8 = 0; var8 < var6; ++var8) {
            int var18 = var2[var8];
            if (var18 < this.bb.length) {
               int[] var19 = this.bb[var18];

               for(var11 = 0; var11 < var19.length; ++var11) {
                  var12 = var19[var11];
                  cq += this.at[var12];
                  cm += this.aa[var12];
                  cf += this.ay[var12];
                  ++var7;
               }
            }
         }

         if (var7 > 0) {
            cq = cq / var7 + var3;
            cm = cm / var7 + var4;
            cf = cf / var7 + var5;
         } else {
            cq = var3;
            cm = var4;
            cf = var5;
         }

      } else {
         int[] var9;
         int var10;
         int[] var10000;
         if (var1 == 1) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.bb.length) {
                  var9 = this.bb[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.at;
                     var10000[var11] += var3;
                     var10000 = this.aa;
                     var10000[var11] += var4;
                     var10000 = this.ay;
                     var10000[var11] += var5;
                  }
               }
            }

         } else if (var1 == 2) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.bb.length) {
                  var9 = this.bb[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.at;
                     var10000[var11] -= cq;
                     var10000 = this.aa;
                     var10000[var11] -= cm;
                     var10000 = this.ay;
                     var10000[var11] -= cf;
                     var12 = (var3 & 255) * 8;
                     int var13 = (var4 & 255) * 8;
                     int var14 = (var5 & 255) * 8;
                     int var15;
                     int var16;
                     int var17;
                     if (var14 != 0) {
                        var15 = cy[var14];
                        var16 = cx[var14];
                        var17 = this.aa[var11] * var15 + this.at[var11] * var16 >> 16;
                        this.aa[var11] = this.aa[var11] * var16 - this.at[var11] * var15 >> 16;
                        this.at[var11] = var17;
                     }

                     if (var12 != 0) {
                        var15 = cy[var12];
                        var16 = cx[var12];
                        var17 = this.aa[var11] * var16 - this.ay[var11] * var15 >> 16;
                        this.ay[var11] = this.aa[var11] * var15 + this.ay[var11] * var16 >> 16;
                        this.aa[var11] = var17;
                     }

                     if (var13 != 0) {
                        var15 = cy[var13];
                        var16 = cx[var13];
                        var17 = this.ay[var11] * var15 + this.at[var11] * var16 >> 16;
                        this.ay[var11] = this.ay[var11] * var16 - this.at[var11] * var15 >> 16;
                        this.at[var11] = var17;
                     }

                     var10000 = this.at;
                     var10000[var11] += cq;
                     var10000 = this.aa;
                     var10000[var11] += cm;
                     var10000 = this.ay;
                     var10000[var11] += cf;
                  }
               }
            }

         } else if (var1 == 3) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.bb.length) {
                  var9 = this.bb[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.at;
                     var10000[var11] -= cq;
                     var10000 = this.aa;
                     var10000[var11] -= cm;
                     var10000 = this.ay;
                     var10000[var11] -= cf;
                     this.at[var11] = this.at[var11] * var3 / 128;
                     this.aa[var11] = this.aa[var11] * var4 / 128;
                     this.ay[var11] = this.ay[var11] * var5 / 128;
                     var10000 = this.at;
                     var10000[var11] += cq;
                     var10000 = this.aa;
                     var10000[var11] += cm;
                     var10000 = this.ay;
                     var10000[var11] += cf;
                  }
               }
            }

         } else if (var1 == 5) {
            if (this.bi != null && this.as != null) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var2[var7];
                  if (var8 < this.bi.length) {
                     var9 = this.bi[var8];

                     for(var10 = 0; var10 < var9.length; ++var10) {
                        var11 = var9[var10];
                        var12 = (this.as[var11] & 255) + var3 * 8;
                        if (var12 < 0) {
                           var12 = 0;
                        } else if (var12 > 255) {
                           var12 = 255;
                        }

                        this.as[var11] = (byte)var12;
                     }
                  }
               }
            }

         }
      }
   }

   public final void eu(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.bo != 2 && this.bo != 1) {
         this.ag();
      }

      int var9 = gd.au(-2033954181);
      int var10 = ax.ab(-1982507159);
      int var11 = cy[var1];
      int var12 = cx[var1];
      int var13 = cy[var2];
      int var14 = cx[var2];
      int var15 = cy[var3];
      int var16 = cx[var3];
      int var17 = cy[var4];
      int var18 = cx[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for(int var20 = 0; var20 < this.al; ++var20) {
         int var21 = this.at[var20];
         int var22 = this.aa[var20];
         int var23 = this.ay[var20];
         int var24;
         if (var3 != 0) {
            var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if (var1 != 0) {
            var24 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var24;
         }

         if (var2 != 0) {
            var24 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var24;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         var24 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         bq[var20] = var23 - var19;
         bg[var20] = var9 + var21 * eu.at(963894311) / var8;
         bu[var20] = var10 + var24 * eu.at(653172634) / var8;
         bf[var20] = df.au(var8, 383143440);
         if (this.ad > 0) {
            ba[var20] = var21;
            bv[var20] = var24;
            bl[var20] = var23;
         }
      }

      try {
         this.bz(false, false, false, 0L);
      } catch (Exception var25) {
      }

   }

   public void bv(it var1) {
      if (var1 != null) {
         this.aw(var1);

         int var2;
         for(var2 = 0; var2 < var1.ao; ++var2) {
            this.ax[this.ao] = var1.ax[var2] + this.al;
            this.ai[this.ao] = var1.ai[var2] + this.al;
            this.ag[this.ao] = var1.ag[var2] + this.al;
            this.ah[this.ao] = var1.ah[var2];
            this.av[this.ao] = var1.av[var2];
            this.ar[this.ao] = var1.ar[var2];
            if (this.am != null) {
               this.am[this.ao] = var1.am != null ? var1.am[var2] : var1.az;
            }

            if (this.as != null && var1.as != null) {
               this.as[this.ao] = var1.as[var2];
            }

            if (this.ak != null) {
               this.ak[this.ao] = var1.ak != null ? var1.ak[var2] : -1;
            }

            if (this.aj != null) {
               if (var1.aj != null && var1.aj[var2] != -1) {
                  this.aj[this.ao] = (byte)(var1.aj[var2] + this.ad);
               } else {
                  this.aj[this.ao] = -1;
               }
            }

            ++this.ao;
         }

         for(var2 = 0; var2 < var1.ad; ++var2) {
            this.ae[this.ad] = var1.ae[var2] + this.al;
            this.ap[this.ad] = var1.ap[var2] + this.al;
            this.by[this.ad] = var1.by[var2] + this.al;
            ++this.ad;
         }

         for(var2 = 0; var2 < var1.al; ++var2) {
            this.at[this.al] = var1.at[var2];
            this.aa[this.al] = var1.aa[var2];
            this.ay[this.al] = var1.ay[var2];
            ++this.al;
         }

      }
   }

   public void dz(io var1, int var2, int[] var3, boolean var4) {
      if (var3 == null) {
         this.ar(var1, var2);
      } else {
         il var5 = var1.af[var2];
         ik var6 = var5.au;
         int var7 = 0;
         int var8 = var3[var7++];
         cq = 0;
         cm = 0;
         cf = 0;

         for(int var9 = 0; var9 < var5.ab; ++var9) {
            int var10;
            for(var10 = var5.aq[var9]; var10 > var8; var8 = var3[var7++]) {
            }

            if (var4) {
               if (var10 == var8 || var6.al[var10] == 0) {
                  this.ae(var6.al[var10], var6.at[var10], var5.al[var9], var5.at[var9], var5.aa[var9]);
               }
            } else if (var10 != var8 || var6.al[var10] == 0) {
               this.ae(var6.al[var10], var6.at[var10], var5.al[var9], var5.at[var9], var5.aa[var9]);
            }
         }

      }
   }

   boolean ew(int var1) {
      return this.cp > 0 && var1 < this.cd;
   }

   public void de(io var1, int var2, int[] var3, boolean var4) {
      if (var3 == null) {
         this.ar(var1, var2);
      } else {
         il var5 = var1.af[var2];
         ik var6 = var5.au;
         int var7 = 0;
         int var8 = var3[var7++];
         cq = 0;
         cm = 0;
         cf = 0;

         for(int var9 = 0; var9 < var5.ab; ++var9) {
            int var10;
            for(var10 = var5.aq[var9]; var10 > var8; var8 = var3[var7++]) {
            }

            if (var4) {
               if (var10 == var8 || var6.al[var10] == 0) {
                  this.ae(var6.al[var10], var6.at[var10], var5.al[var9], var5.at[var9], var5.aa[var9]);
               }
            } else if (var10 != var8 || var6.al[var10] == 0) {
               this.ae(var6.al[var10], var6.at[var10], var5.al[var9], var5.at[var9], var5.aa[var9]);
            }
         }

      }
   }

   public void dx() {
      for(int var1 = 0; var1 < this.al; ++var1) {
         this.at[var1] = -this.at[var1];
         this.ay[var1] = -this.ay[var1];
      }

      this.av();
   }

   public void dp() {
      for(int var1 = 0; var1 < this.al; ++var1) {
         int var2 = this.at[var1];
         this.at[var1] = this.ay[var1];
         this.ay[var1] = -var2;
      }

      this.av();
   }

   public void du() {
      for(int var1 = 0; var1 < this.al; ++var1) {
         this.at[var1] = -this.at[var1];
         this.ay[var1] = -this.ay[var1];
      }

      this.av();
   }

   public void db() {
      for(int var1 = 0; var1 < this.al; ++var1) {
         this.at[var1] = -this.at[var1];
         this.ay[var1] = -this.ay[var1];
      }

      this.av();
   }

   public void dn() {
      for(int var1 = 0; var1 < this.al; ++var1) {
         int var2 = this.ay[var1];
         this.ay[var1] = this.at[var1];
         this.at[var1] = -var2;
      }

      this.av();
   }

   public void ap() {
      for(int var1 = 0; var1 < this.al; ++var1) {
         int var2 = this.at[var1];
         this.at[var1] = this.ay[var1];
         this.ay[var1] = -var2;
      }

      this.av();
   }

   public void dy() {
      for(int var1 = 0; var1 < this.al; ++var1) {
         int var2 = this.ay[var1];
         this.ay[var1] = this.at[var1];
         this.at[var1] = -var2;
      }

      this.av();
   }

   public void ds(int var1) {
      int var2 = cy[var1];
      int var3 = cx[var1];

      for(int var4 = 0; var4 < this.al; ++var4) {
         int var5 = this.aa[var4] * var3 - this.ay[var4] * var2 >> 16;
         this.ay[var4] = this.aa[var4] * var2 + this.ay[var4] * var3 >> 16;
         this.aa[var4] = var5;
      }

      this.av();
   }

   void dm(ic var1, int var2) {
      this.bs(var1, var2);
   }

   public void ep(int var1) {
      int var2 = cy[var1];
      int var3 = cx[var1];

      for(int var4 = 0; var4 < this.al; ++var4) {
         int var5 = this.aa[var4] * var3 - this.ay[var4] * var2 >> 16;
         this.ay[var4] = this.aa[var4] * var2 + this.ay[var4] * var3 >> 16;
         this.aa[var4] = var5;
      }

      this.av();
   }

   public void eo(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.al; ++var4) {
         int[] var10000 = this.at;
         var10000[var4] += var1;
         var10000 = this.aa;
         var10000[var4] += var2;
         var10000 = this.ay;
         var10000[var4] += var3;
      }

      this.av();
   }

   public void eq(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.al; ++var4) {
         int[] var10000 = this.at;
         var10000[var4] += var1;
         var10000 = this.aa;
         var10000[var4] += var2;
         var10000 = this.ay;
         var10000[var4] += var3;
      }

      this.av();
   }

   public void et(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.al; ++var4) {
         this.at[var4] = this.at[var4] * var1 / 128;
         this.aa[var4] = this.aa[var4] * var2 / -2130871502;
         this.ay[var4] = this.ay[var4] * var3 / 128;
      }

      this.av();
   }

   public void ef(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.al; ++var4) {
         this.at[var4] = this.at[var4] * var1 / 128;
         this.aa[var4] = this.aa[var4] * var2 / 128;
         this.ay[var4] = this.ay[var4] * var3 / 128;
      }

      this.av();
   }

   public void ez(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.al; ++var4) {
         this.at[var4] = this.at[var4] * var1 / 128;
         this.aa[var4] = this.aa[var4] * var2 / 52940047;
         this.ay[var4] = this.ay[var4] * var3 / 362171391;
      }

      this.av();
   }

   public final void ej(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (this.bo != 2 && this.bo != 1) {
         this.ag();
      }

      int var8 = gd.au(-922960447);
      int var9 = ax.ab(-718675372);
      int var10 = cy[var1];
      int var11 = cx[var1];
      int var12 = cy[var2];
      int var13 = cx[var2];
      int var14 = cy[var3];
      int var15 = cx[var3];
      int var16 = cy[var4];
      int var17 = cx[var4];
      int var18 = var6 * var16 + var7 * var17 >> 16;

      for(int var19 = 0; var19 < this.al; ++var19) {
         int var20 = this.at[var19];
         int var21 = this.aa[var19];
         int var22 = this.ay[var19];
         int var23;
         if (var3 != 0) {
            var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if (var1 != 0) {
            var23 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var23;
         }

         if (var2 != 0) {
            var23 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var23;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         var23 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         bq[var19] = var22 - var18;
         bg[var19] = var8 + var20 * eu.at(-818106717) / var22;
         bu[var19] = var9 + var23 * eu.at(-449026615) / var22;
         bf[var19] = df.au(var22, 398166947);
         if (this.ad > 0) {
            ba[var19] = var20;
            bv[var19] = var23;
            bl[var19] = var22;
         }
      }

      try {
         this.bz(false, false, false, 0L);
      } catch (Exception var24) {
      }

   }

   final void ed(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.bd < 6000) {
         int var6;
         for(var6 = 0; var6 < this.bd; ++var6) {
            bc[var6] = 0;
         }

         var6 = var3 ? 20 : 5;

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var15;
         int var16;
         int var18;
         for(var7 = 0; var7 < this.ao; var7 = (char)(var7 + 1)) {
            if (this.ar[var7] != -2) {
               var8 = this.ax[var7];
               var9 = this.ai[var7];
               var10 = this.ag[var7];
               var11 = bg[var8];
               var12 = bg[var9];
               var13 = bg[var10];
               int var17;
               int var32;
               if (var1 && (var11 == -5000 || var12 == -5000 || var13 == -5000)) {
                  var32 = ba[var8];
                  var15 = ba[var9];
                  var16 = ba[var10];
                  var17 = bv[var8];
                  var18 = bv[var9];
                  int var19 = bv[var10];
                  int var20 = bl[var8];
                  int var21 = bl[var9];
                  int var22 = bl[var10];
                  var32 -= var15;
                  var16 -= var15;
                  var17 -= var18;
                  var19 -= var18;
                  var20 -= var21;
                  var22 -= var21;
                  int var23 = var17 * var22 - var20 * var19;
                  int var24 = var20 * var16 - var32 * var22;
                  int var25 = var32 * var19 - var17 * var16;
                  if (var15 * var23 + var18 * var24 + var21 * var25 > 0) {
                     br[var7] = true;
                     int var26 = (bq[var8] + bq[var9] + bq[var10]) / 3 + this.bt;
                     bh[var26][bc[var26]++] = (char)var7;
                  }
               } else {
                  if (var2) {
                     var15 = bu[var8];
                     var16 = bu[var9];
                     var17 = bu[var10];
                     var18 = 148198745 * ix.aw + var6;
                     boolean var14;
                     if (var18 < var15 && var18 < var16 && var18 < var17) {
                        var14 = false;
                     } else {
                        var18 = ix.aw * 148198745 - var6;
                        if (var18 > var15 && var18 > var16 && var18 > var17) {
                           var14 = false;
                        } else {
                           var18 = var6 + ix.an * 2139535413;
                           if (var18 < var11 && var18 < var12 && var18 < var13) {
                              var14 = false;
                           } else {
                              var18 = ix.an * 2139535413 - var6;
                              if (var18 > var11 && var18 > var12 && var18 > var13) {
                                 var14 = false;
                              } else {
                                 var14 = true;
                              }
                           }
                        }
                     }

                     if (var14) {
                        cx.ao(var4);
                        var2 = false;
                     }
                  }

                  if ((var11 - var12) * (bu[var10] - bu[var9]) - (bu[var8] - bu[var9]) * (var13 - var12) > 0) {
                     br[var7] = false;
                     var32 = aq.aa(952603467);
                     if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= var32 && var12 <= var32 && var13 <= var32) {
                        bs[var7] = false;
                     } else {
                        bs[var7] = true;
                     }

                     var15 = (bq[var8] + bq[var9] + bq[var10]) / 3 + this.bt;
                     bh[var15][bc[var15]++] = (char)var7;
                  }
               }
            }
         }

         char var27;
         char[] var28;
         if (this.am == null) {
            for(var7 = this.bd - 1; var7 >= 0; --var7) {
               var27 = bc[var7];
               if (var27 > 0) {
                  var28 = bh[var7];

                  for(var10 = 0; var10 < var27; ++var10) {
                     this.bm(var28[var10]);
                  }
               }
            }

         } else {
            for(var7 = 0; var7 < 12; ++var7) {
               bw[var7] = 0;
               cc[var7] = 0;
            }

            for(var7 = this.bd - 1; var7 >= 0; --var7) {
               var27 = bc[var7];
               if (var27 > 0) {
                  var28 = bh[var7];

                  for(var10 = 0; var10 < var27; ++var10) {
                     char var29 = var28[var10];
                     byte var30 = this.am[var29];
                     var13 = bw[var30]++;
                     ce[var30][var13] = var29;
                     if (var30 < 10) {
                        int[] var35 = cc;
                        var35[var30] += var7;
                     } else if (var30 == 10) {
                        ci[var13] = var7;
                     } else {
                        cs[var13] = var7;
                     }
                  }
               }
            }

            var7 = 0;
            if (bw[1] > 0 || bw[2] > 0) {
               var7 = (cc[1] + cc[2]) / (bw[1] + bw[2]);
            }

            var8 = 0;
            if (bw[3] > 0 || bw[4] > 0) {
               var8 = (cc[3] + cc[4]) / (bw[3] + bw[4]);
            }

            var9 = 0;
            if (bw[6] > 0 || bw[8] > 0) {
               var9 = (cc[6] + cc[8]) / (bw[6] + bw[8]);
            }

            var11 = 0;
            var12 = bw[10];
            int[] var31 = ce[10];
            int[] var33 = ci;
            if (var11 == var12) {
               var11 = 0;
               var12 = bw[11];
               var31 = ce[11];
               var33 = cs;
            }

            if (var11 < var12) {
               var10 = var33[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var7) {
                  this.bm(var31[var11++]);
                  if (var11 == var12 && var31 != ce[11]) {
                     var11 = 0;
                     var12 = bw[11];
                     var31 = ce[11];
                     var33 = cs;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.bm(var31[var11++]);
                  if (var11 == var12 && var31 != ce[11]) {
                     var11 = 0;
                     var12 = bw[11];
                     var31 = ce[11];
                     var33 = cs;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.bm(var31[var11++]);
                  if (var11 == var12 && var31 != ce[11]) {
                     var11 = 0;
                     var12 = bw[11];
                     var31 = ce[11];
                     var33 = cs;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = bw[var15];
               int[] var34 = ce[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.bm(var34[var18]);
               }
            }

            while(var10 != -1000) {
               this.bm(var31[var11++]);
               if (var11 == var12 && var31 != ce[11]) {
                  var11 = 0;
                  var31 = ce[11];
                  var12 = bw[11];
                  var33 = cs;
               }

               if (var11 < var12) {
                  var10 = var33[var11];
               } else {
                  var10 = -1000;
               }
            }

         }
      }
   }

   public void ch(fh var1, int var2) {
      ik var3 = var1.ac;
      ic var4 = var3.an(-660221315);
      if (var4 != null) {
         var3.an(857270537).au(var1, var2, 113796429);
         this.aj(var3.an(923000785), var1.ac(-2122387614));
      }

      if (var1.au(1713081171)) {
         this.as(var1, var2);
      }

      this.av();
   }

   public it bc(boolean var1) {
      if (!var1 && an.length < this.ao) {
         an = new byte[this.ao + 100];
      }

      return this.ao(var1, af, an);
   }

   public it bl(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.ai();
      int var7 = var2 - this.bm;
      int var8 = var2 + this.bm;
      int var9 = var4 - this.bm;
      int var10 = var4 + this.bm;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            it var11;
            if (var5) {
               var11 = new it();
               var11.al = this.al;
               var11.ao = this.ao;
               var11.ad = this.ad;
               var11.at = this.at;
               var11.ay = this.ay;
               var11.ax = this.ax;
               var11.ai = this.ai;
               var11.ag = this.ag;
               var11.ah = this.ah;
               var11.av = this.av;
               var11.ar = this.ar;
               var11.am = this.am;
               var11.as = this.as;
               var11.aj = this.aj;
               var11.ak = this.ak;
               var11.az = this.az;
               var11.ae = this.ae;
               var11.ap = this.ap;
               var11.by = this.by;
               var11.bb = this.bb;
               var11.bi = this.bi;
               var11.bx = this.bx;
               var11.aa = new int[var11.al];
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
               for(var12 = 0; var12 < var11.al; ++var12) {
                  var13 = this.at[var12] + var2;
                  var14 = this.ay[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.aa[var12] = this.aa[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.al; ++var12) {
                  var13 = (-this.aa[var12] << 16) / (this.et * 1550732737);
                  if (var13 < var6) {
                     var14 = this.at[var12] + var2;
                     var15 = this.ay[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.aa[var12] = this.aa[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.av();
            return var11;
         }
      } else {
         return this;
      }
   }

   void ag() {
      if (this.bo != 2) {
         this.bo = 2;
         this.bm = 0;

         for(int var1 = 0; var1 < this.al; ++var1) {
            int var2 = this.at[var1];
            int var3 = this.aa[var1];
            int var4 = this.ay[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if (var5 > this.bm) {
               this.bm = var5;
            }
         }

         this.bm = (int)(Math.sqrt((double)this.bm) + 0.99);
         this.bt = this.bm;
         this.bd = this.bm + this.bm;
      }
   }

   final void en(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.bd < 6000) {
         int var6;
         for(var6 = 0; var6 < this.bd; ++var6) {
            bc[var6] = 0;
         }

         var6 = var3 ? 20 : 5;

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var15;
         int var16;
         int var18;
         for(var7 = 0; var7 < this.ao; var7 = (char)(var7 + 1)) {
            if (this.ar[var7] != -2) {
               var8 = this.ax[var7];
               var9 = this.ai[var7];
               var10 = this.ag[var7];
               var11 = bg[var8];
               var12 = bg[var9];
               var13 = bg[var10];
               int var14;
               int var17;
               if (!var1 || var11 != -5000 && var12 != -5000 && var13 != -5000) {
                  if (var2) {
                     var15 = bu[var8];
                     var16 = bu[var9];
                     var17 = bu[var10];
                     var18 = 148198745 * ix.aw + var6;
                     boolean var32;
                     if (var18 < var15 && var18 < var16 && var18 < var17) {
                        var32 = false;
                     } else {
                        var18 = ix.aw * 148198745 - var6;
                        if (var18 > var15 && var18 > var16 && var18 > var17) {
                           var32 = false;
                        } else {
                           var18 = var6 + ix.an * 2139535413;
                           if (var18 < var11 && var18 < var12 && var18 < var13) {
                              var32 = false;
                           } else {
                              var18 = ix.an * 2139535413 - var6;
                              if (var18 > var11 && var18 > var12 && var18 > var13) {
                                 var32 = false;
                              } else {
                                 var32 = true;
                              }
                           }
                        }
                     }

                     if (var32) {
                        cx.ao(var4);
                        var2 = false;
                     }
                  }

                  if ((var11 - var12) * (bu[var10] - bu[var9]) - (bu[var8] - bu[var9]) * (var13 - var12) > 0) {
                     br[var7] = false;
                     var14 = aq.aa(-2024317984);
                     if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= var14 && var12 <= var14 && var13 <= var14) {
                        bs[var7] = false;
                     } else {
                        bs[var7] = true;
                     }

                     var15 = (bq[var8] + bq[var9] + bq[var10]) / 3 + this.bt;
                     bh[var15][bc[var15]++] = (char)var7;
                  }
               } else {
                  var14 = ba[var8];
                  var15 = ba[var9];
                  var16 = ba[var10];
                  var17 = bv[var8];
                  var18 = bv[var9];
                  int var19 = bv[var10];
                  int var20 = bl[var8];
                  int var21 = bl[var9];
                  int var22 = bl[var10];
                  var14 -= var15;
                  var16 -= var15;
                  var17 -= var18;
                  var19 -= var18;
                  var20 -= var21;
                  var22 -= var21;
                  int var23 = var17 * var22 - var20 * var19;
                  int var24 = var20 * var16 - var14 * var22;
                  int var25 = var14 * var19 - var17 * var16;
                  if (var15 * var23 + var18 * var24 + var21 * var25 > 0) {
                     br[var7] = true;
                     int var26 = (bq[var8] + bq[var9] + bq[var10]) / 3 + this.bt;
                     bh[var26][bc[var26]++] = (char)var7;
                  }
               }
            }
         }

         char var27;
         char[] var28;
         if (this.am == null) {
            for(var7 = this.bd - 1; var7 >= 0; --var7) {
               var27 = bc[var7];
               if (var27 > 0) {
                  var28 = bh[var7];

                  for(var10 = 0; var10 < var27; ++var10) {
                     this.bm(var28[var10]);
                  }
               }
            }

         } else {
            for(var7 = 0; var7 < 12; ++var7) {
               bw[var7] = 0;
               cc[var7] = 0;
            }

            for(var7 = this.bd - 1; var7 >= 0; --var7) {
               var27 = bc[var7];
               if (var27 > 0) {
                  var28 = bh[var7];

                  for(var10 = 0; var10 < var27; ++var10) {
                     char var29 = var28[var10];
                     byte var30 = this.am[var29];
                     var13 = bw[var30]++;
                     ce[var30][var13] = var29;
                     if (var30 < 10) {
                        int[] var35 = cc;
                        var35[var30] += var7;
                     } else if (var30 == 10) {
                        ci[var13] = var7;
                     } else {
                        cs[var13] = var7;
                     }
                  }
               }
            }

            var7 = 0;
            if (bw[1] > 0 || bw[2] > 0) {
               var7 = (cc[1] + cc[2]) / (bw[1] + bw[2]);
            }

            var8 = 0;
            if (bw[3] > 0 || bw[4] > 0) {
               var8 = (cc[3] + cc[4]) / (bw[3] + bw[4]);
            }

            var9 = 0;
            if (bw[6] > 0 || bw[8] > 0) {
               var9 = (cc[6] + cc[8]) / (bw[6] + bw[8]);
            }

            var11 = 0;
            var12 = bw[10];
            int[] var31 = ce[10];
            int[] var33 = ci;
            if (var11 == var12) {
               var11 = 0;
               var12 = bw[11];
               var31 = ce[11];
               var33 = cs;
            }

            if (var11 < var12) {
               var10 = var33[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var7) {
                  this.bm(var31[var11++]);
                  if (var11 == var12 && var31 != ce[11]) {
                     var11 = 0;
                     var12 = bw[11];
                     var31 = ce[11];
                     var33 = cs;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.bm(var31[var11++]);
                  if (var11 == var12 && var31 != ce[11]) {
                     var11 = 0;
                     var12 = bw[11];
                     var31 = ce[11];
                     var33 = cs;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.bm(var31[var11++]);
                  if (var11 == var12 && var31 != ce[11]) {
                     var11 = 0;
                     var12 = bw[11];
                     var31 = ce[11];
                     var33 = cs;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = bw[var15];
               int[] var34 = ce[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.bm(var34[var18]);
               }
            }

            while(var10 != -1000) {
               this.bm(var31[var11++]);
               if (var11 == var12 && var31 != ce[11]) {
                  var11 = 0;
                  var31 = ce[11];
                  var12 = bw[11];
                  var33 = cs;
               }

               if (var11 < var12) {
                  var10 = var33[var11];
               } else {
                  var10 = -1000;
               }
            }

         }
      }
   }

   final void er(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.bd < 49532904) {
         int var6;
         for(var6 = 0; var6 < this.bd; ++var6) {
            bc[var6] = 0;
         }

         var6 = var3 ? 20 : 5;

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var15;
         int var16;
         int var18;
         for(var7 = 0; var7 < this.ao; var7 = (char)(var7 + 1)) {
            if (this.ar[var7] != -2) {
               var8 = this.ax[var7];
               var9 = this.ai[var7];
               var10 = this.ag[var7];
               var11 = bg[var8];
               var12 = bg[var9];
               var13 = bg[var10];
               int var17;
               int var32;
               if (var1 && (var11 == -1878846415 || var12 == -5000 || var13 == -5000)) {
                  var32 = ba[var8];
                  var15 = ba[var9];
                  var16 = ba[var10];
                  var17 = bv[var8];
                  var18 = bv[var9];
                  int var19 = bv[var10];
                  int var20 = bl[var8];
                  int var21 = bl[var9];
                  int var22 = bl[var10];
                  var32 -= var15;
                  var16 -= var15;
                  var17 -= var18;
                  var19 -= var18;
                  var20 -= var21;
                  var22 -= var21;
                  int var23 = var17 * var22 - var20 * var19;
                  int var24 = var20 * var16 - var32 * var22;
                  int var25 = var32 * var19 - var17 * var16;
                  if (var15 * var23 + var18 * var24 + var21 * var25 > 0) {
                     br[var7] = true;
                     int var26 = (bq[var8] + bq[var9] + bq[var10]) / 3 + this.bt;
                     bh[var26][bc[var26]++] = (char)var7;
                  }
               } else {
                  if (var2) {
                     var15 = bu[var8];
                     var16 = bu[var9];
                     var17 = bu[var10];
                     var18 = 148198745 * ix.aw + var6;
                     boolean var14;
                     if (var18 < var15 && var18 < var16 && var18 < var17) {
                        var14 = false;
                     } else {
                        var18 = ix.aw * 148198745 - var6;
                        if (var18 > var15 && var18 > var16 && var18 > var17) {
                           var14 = false;
                        } else {
                           var18 = var6 + ix.an * -1893241990;
                           if (var18 < var11 && var18 < var12 && var18 < var13) {
                              var14 = false;
                           } else {
                              var18 = ix.an * 1537094364 - var6;
                              if (var18 > var11 && var18 > var12 && var18 > var13) {
                                 var14 = false;
                              } else {
                                 var14 = true;
                              }
                           }
                        }
                     }

                     if (var14) {
                        cx.ao(var4);
                        var2 = false;
                     }
                  }

                  if ((var11 - var12) * (bu[var10] - bu[var9]) - (bu[var8] - bu[var9]) * (var13 - var12) > 0) {
                     br[var7] = false;
                     var32 = aq.aa(572676006);
                     if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= var32 && var12 <= var32 && var13 <= var32) {
                        bs[var7] = false;
                     } else {
                        bs[var7] = true;
                     }

                     var15 = (bq[var8] + bq[var9] + bq[var10]) / 3 + this.bt;
                     bh[var15][bc[var15]++] = (char)var7;
                  }
               }
            }
         }

         char var27;
         char[] var28;
         if (this.am == null) {
            for(var7 = this.bd - 1; var7 >= 0; --var7) {
               var27 = bc[var7];
               if (var27 > 0) {
                  var28 = bh[var7];

                  for(var10 = 0; var10 < var27; ++var10) {
                     this.bm(var28[var10]);
                  }
               }
            }

         } else {
            for(var7 = 0; var7 < 12; ++var7) {
               bw[var7] = 0;
               cc[var7] = 0;
            }

            for(var7 = this.bd - 1; var7 >= 0; --var7) {
               var27 = bc[var7];
               if (var27 > 0) {
                  var28 = bh[var7];

                  for(var10 = 0; var10 < var27; ++var10) {
                     char var29 = var28[var10];
                     byte var30 = this.am[var29];
                     var13 = bw[var30]++;
                     ce[var30][var13] = var29;
                     if (var30 < 10) {
                        int[] var35 = cc;
                        var35[var30] += var7;
                     } else if (var30 == 10) {
                        ci[var13] = var7;
                     } else {
                        cs[var13] = var7;
                     }
                  }
               }
            }

            var7 = 0;
            if (bw[1] > 0 || bw[2] > 0) {
               var7 = (cc[1] + cc[2]) / (bw[1] + bw[2]);
            }

            var8 = 0;
            if (bw[3] > 0 || bw[4] > 0) {
               var8 = (cc[3] + cc[4]) / (bw[3] + bw[4]);
            }

            var9 = 0;
            if (bw[6] > 0 || bw[8] > 0) {
               var9 = (cc[6] + cc[8]) / (bw[6] + bw[8]);
            }

            var11 = 0;
            var12 = bw[10];
            int[] var31 = ce[10];
            int[] var33 = ci;
            if (var11 == var12) {
               var11 = 0;
               var12 = bw[11];
               var31 = ce[11];
               var33 = cs;
            }

            if (var11 < var12) {
               var10 = var33[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var7) {
                  this.bm(var31[var11++]);
                  if (var11 == var12 && var31 != ce[11]) {
                     var11 = 0;
                     var12 = bw[11];
                     var31 = ce[11];
                     var33 = cs;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = 1499305320;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.bm(var31[var11++]);
                  if (var11 == var12 && var31 != ce[11]) {
                     var11 = 0;
                     var12 = bw[11];
                     var31 = ce[11];
                     var33 = cs;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = 499196324;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.bm(var31[var11++]);
                  if (var11 == var12 && var31 != ce[11]) {
                     var11 = 0;
                     var12 = bw[11];
                     var31 = ce[11];
                     var33 = cs;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = bw[var15];
               int[] var34 = ce[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.bm(var34[var18]);
               }
            }

            while(var10 != -1173515549) {
               this.bm(var31[var11++]);
               if (var11 == var12 && var31 != ce[11]) {
                  var11 = 0;
                  var31 = ce[11];
                  var12 = bw[11];
                  var33 = cs;
               }

               if (var11 < var12) {
                  var10 = var33[var11];
               } else {
                  var10 = -61954849;
               }
            }

         }
      }
   }

   final void eg(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.bd < -1469194642) {
         int var6;
         for(var6 = 0; var6 < this.bd; ++var6) {
            bc[var6] = 0;
         }

         var6 = var3 ? 20 : 5;

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var15;
         int var16;
         int var18;
         for(var7 = 0; var7 < this.ao; var7 = (char)(var7 + 1)) {
            if (this.ar[var7] != -2) {
               var8 = this.ax[var7];
               var9 = this.ai[var7];
               var10 = this.ag[var7];
               var11 = bg[var8];
               var12 = bg[var9];
               var13 = bg[var10];
               int var17;
               int var32;
               if (var1 && (var11 == -5000 || var12 == -5000 || var13 == 1755061194)) {
                  var32 = ba[var8];
                  var15 = ba[var9];
                  var16 = ba[var10];
                  var17 = bv[var8];
                  var18 = bv[var9];
                  int var19 = bv[var10];
                  int var20 = bl[var8];
                  int var21 = bl[var9];
                  int var22 = bl[var10];
                  var32 -= var15;
                  var16 -= var15;
                  var17 -= var18;
                  var19 -= var18;
                  var20 -= var21;
                  var22 -= var21;
                  int var23 = var17 * var22 - var20 * var19;
                  int var24 = var20 * var16 - var32 * var22;
                  int var25 = var32 * var19 - var17 * var16;
                  if (var15 * var23 + var18 * var24 + var21 * var25 > 0) {
                     br[var7] = true;
                     int var26 = (bq[var8] + bq[var9] + bq[var10]) / 3 + this.bt;
                     bh[var26][bc[var26]++] = (char)var7;
                  }
               } else {
                  if (var2) {
                     var15 = bu[var8];
                     var16 = bu[var9];
                     var17 = bu[var10];
                     var18 = 2053830242 * ix.aw + var6;
                     boolean var14;
                     if (var18 < var15 && var18 < var16 && var18 < var17) {
                        var14 = false;
                     } else {
                        var18 = ix.aw * 148198745 - var6;
                        if (var18 > var15 && var18 > var16 && var18 > var17) {
                           var14 = false;
                        } else {
                           var18 = var6 + ix.an * 2139535413;
                           if (var18 < var11 && var18 < var12 && var18 < var13) {
                              var14 = false;
                           } else {
                              var18 = ix.an * 1837049372 - var6;
                              if (var18 > var11 && var18 > var12 && var18 > var13) {
                                 var14 = false;
                              } else {
                                 var14 = true;
                              }
                           }
                        }
                     }

                     if (var14) {
                        cx.ao(var4);
                        var2 = false;
                     }
                  }

                  if ((var11 - var12) * (bu[var10] - bu[var9]) - (bu[var8] - bu[var9]) * (var13 - var12) > 0) {
                     br[var7] = false;
                     var32 = aq.aa(-940926625);
                     if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= var32 && var12 <= var32 && var13 <= var32) {
                        bs[var7] = false;
                     } else {
                        bs[var7] = true;
                     }

                     var15 = (bq[var8] + bq[var9] + bq[var10]) / 3 + this.bt;
                     bh[var15][bc[var15]++] = (char)var7;
                  }
               }
            }
         }

         char var27;
         char[] var28;
         if (this.am == null) {
            for(var7 = this.bd - 1; var7 >= 0; --var7) {
               var27 = bc[var7];
               if (var27 > 0) {
                  var28 = bh[var7];

                  for(var10 = 0; var10 < var27; ++var10) {
                     this.bm(var28[var10]);
                  }
               }
            }

         } else {
            for(var7 = 0; var7 < 12; ++var7) {
               bw[var7] = 0;
               cc[var7] = 0;
            }

            for(var7 = this.bd - 1; var7 >= 0; --var7) {
               var27 = bc[var7];
               if (var27 > 0) {
                  var28 = bh[var7];

                  for(var10 = 0; var10 < var27; ++var10) {
                     char var29 = var28[var10];
                     byte var30 = this.am[var29];
                     var13 = bw[var30]++;
                     ce[var30][var13] = var29;
                     if (var30 < 10) {
                        int[] var35 = cc;
                        var35[var30] += var7;
                     } else if (var30 == 10) {
                        ci[var13] = var7;
                     } else {
                        cs[var13] = var7;
                     }
                  }
               }
            }

            var7 = 0;
            if (bw[1] > 0 || bw[2] > 0) {
               var7 = (cc[1] + cc[2]) / (bw[1] + bw[2]);
            }

            var8 = 0;
            if (bw[3] > 0 || bw[4] > 0) {
               var8 = (cc[3] + cc[4]) / (bw[3] + bw[4]);
            }

            var9 = 0;
            if (bw[6] > 0 || bw[8] > 0) {
               var9 = (cc[6] + cc[8]) / (bw[6] + bw[8]);
            }

            var11 = 0;
            var12 = bw[10];
            int[] var31 = ce[10];
            int[] var33 = ci;
            if (var11 == var12) {
               var11 = 0;
               var12 = bw[11];
               var31 = ce[11];
               var33 = cs;
            }

            if (var11 < var12) {
               var10 = var33[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var7) {
                  this.bm(var31[var11++]);
                  if (var11 == var12 && var31 != ce[11]) {
                     var11 = 0;
                     var12 = bw[11];
                     var31 = ce[11];
                     var33 = cs;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = 285616793;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.bm(var31[var11++]);
                  if (var11 == var12 && var31 != ce[11]) {
                     var11 = 0;
                     var12 = bw[11];
                     var31 = ce[11];
                     var33 = cs;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.bm(var31[var11++]);
                  if (var11 == var12 && var31 != ce[11]) {
                     var11 = 0;
                     var12 = bw[11];
                     var31 = ce[11];
                     var33 = cs;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = bw[var15];
               int[] var34 = ce[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.bm(var34[var18]);
               }
            }

            while(var10 != -1000) {
               this.bm(var31[var11++]);
               if (var11 == var12 && var31 != ce[11]) {
                  var11 = 0;
                  var31 = ce[11];
                  var12 = bw[11];
                  var33 = cs;
               }

               if (var11 < var12) {
                  var10 = var33[var11];
               } else {
                  var10 = -1000;
               }
            }

         }
      }
   }

   void bf(it var1) {
      int var2 = this.ax.length;
      if (this.am == null && (var1.am != null || this.az != var1.az)) {
         this.am = new byte[var2];
         Arrays.fill(this.am, this.az);
      }

      if (this.as == null && var1.as != null) {
         this.as = new byte[var2];
         Arrays.fill(this.as, (byte)0);
      }

      if (this.ak == null && var1.ak != null) {
         this.ak = new short[var2];
         Arrays.fill(this.ak, (short)-1);
      }

      if (this.aj == null && var1.aj != null) {
         this.aj = new byte[var2];
         Arrays.fill(this.aj, (byte)-1);
      }

   }

   public void ac(it var1) {
      if (var1 != null) {
         this.aw(var1);

         int var2;
         for(var2 = 0; var2 < var1.ao; ++var2) {
            this.ax[this.ao] = var1.ax[var2] + this.al;
            this.ai[this.ao] = var1.ai[var2] + this.al;
            this.ag[this.ao] = var1.ag[var2] + this.al;
            this.ah[this.ao] = var1.ah[var2];
            this.av[this.ao] = var1.av[var2];
            this.ar[this.ao] = var1.ar[var2];
            if (this.am != null) {
               this.am[this.ao] = var1.am != null ? var1.am[var2] : var1.az;
            }

            if (this.as != null && var1.as != null) {
               this.as[this.ao] = var1.as[var2];
            }

            if (this.ak != null) {
               this.ak[this.ao] = var1.ak != null ? var1.ak[var2] : -1;
            }

            if (this.aj != null) {
               if (var1.aj != null && var1.aj[var2] != -1) {
                  this.aj[this.ao] = (byte)(var1.aj[var2] + this.ad);
               } else {
                  this.aj[this.ao] = -1;
               }
            }

            ++this.ao;
         }

         for(var2 = 0; var2 < var1.ad; ++var2) {
            this.ae[this.ad] = var1.ae[var2] + this.al;
            this.ap[this.ad] = var1.ap[var2] + this.al;
            this.by[this.ad] = var1.by[var2] + this.al;
            ++this.ad;
         }

         for(var2 = 0; var2 < var1.al; ++var2) {
            this.at[this.al] = var1.at[var2];
            this.aa[this.al] = var1.aa[var2];
            this.ay[this.al] = var1.ay[var2];
            ++this.al;
         }

      }
   }

   public final void bx(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (this.bo != 2 && this.bo != 1) {
         this.ag();
      }

      int var8 = gd.au(-219755023);
      int var9 = ax.ab(1626941955);
      int var10 = cy[var1];
      int var11 = cx[var1];
      int var12 = cy[var2];
      int var13 = cx[var2];
      int var14 = cy[var3];
      int var15 = cx[var3];
      int var16 = cy[var4];
      int var17 = cx[var4];
      int var18 = var6 * var16 + var7 * var17 >> 16;

      for(int var19 = 0; var19 < this.al; ++var19) {
         int var20 = this.at[var19];
         int var21 = this.aa[var19];
         int var22 = this.ay[var19];
         int var23;
         if (var3 != 0) {
            var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if (var1 != 0) {
            var23 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var23;
         }

         if (var2 != 0) {
            var23 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var23;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         var23 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         bq[var19] = var22 - var18;
         bg[var19] = var8 + var20 * eu.at(-756770280) / var22;
         bu[var19] = var9 + var23 * eu.at(826464175) / var22;
         bf[var19] = df.au(var22, 909567009);
         if (this.ad > 0) {
            ba[var19] = var20;
            bv[var19] = var23;
            bl[var19] = var22;
         }
      }

      try {
         this.bz(false, false, false, 0L);
      } catch (Exception var24) {
      }

   }

   public it ci(boolean var1) {
      if (!var1 && ac.length < this.ao) {
         ac = new byte[this.ao + 100];
      }

      return this.ao(var1, aw, ac);
   }

   final void ex(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
      int var15;
      int var16;
      int var17;
      if (this.ak != null && this.ak[var1] != -1) {
         int var20;
         if (this.aj != null && this.aj[var1] != -1) {
            var17 = this.aj[var1] & 255;
            var20 = this.ae[var17];
            var15 = this.ap[var17];
            var16 = this.by[var17];
         } else {
            var20 = this.ax[var1];
            var15 = this.ai[var1];
            var16 = this.ag[var1];
         }

         if (this.ar[var1] == -1) {
            az.ar(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, ba[var20], ba[var15], ba[var16], bv[var20], bv[var15], bv[var16], bl[var20], bl[var15], bl[var16], this.ak[var1], (short)17138);
         } else {
            az.ar(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, ba[var20], ba[var15], ba[var16], bv[var20], bv[var15], bv[var16], bl[var20], bl[var15], bl[var16], this.ak[var1], (short)-31923);
         }
      } else {
         boolean var14 = this.bd(var1);
         byte var18;
         if (this.ar[var1] == -1 && var14) {
            var15 = cv[this.ah[var1]];
            var16 = this.cj;
            var17 = this.ch;
            var18 = this.ct;
            byte var19 = this.cp;
            in.aq.au(var2, var3, var4, var5, var6, var7, var8, var9, var10, var15, (byte)var16, (byte)var17, var18, var19, -1620123395);
         } else if (this.ar[var1] == -1) {
            fw.av(var2, var3, var4, var5, var6, var7, var8, var9, var10, cv[this.ah[var1]], -229457129);
         } else if (var14) {
            var15 = this.cj;
            var16 = this.ch;
            var17 = this.ct;
            var18 = this.cp;
            in.aq.ac(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, (byte)var15, (byte)var16, (byte)var17, var18, (byte)-80);
         } else {
            jk.ah(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, -428480375);
         }
      }

   }

   final void eh(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
      int var15;
      int var16;
      int var17;
      if (this.ak != null && this.ak[var1] != -1) {
         int var20;
         if (this.aj != null && this.aj[var1] != -1) {
            var17 = this.aj[var1] & -43419227;
            var20 = this.ae[var17];
            var15 = this.ap[var17];
            var16 = this.by[var17];
         } else {
            var20 = this.ax[var1];
            var15 = this.ai[var1];
            var16 = this.ag[var1];
         }

         if (this.ar[var1] == -1) {
            az.ar(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, ba[var20], ba[var15], ba[var16], bv[var20], bv[var15], bv[var16], bl[var20], bl[var15], bl[var16], this.ak[var1], (short)6670);
         } else {
            az.ar(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, ba[var20], ba[var15], ba[var16], bv[var20], bv[var15], bv[var16], bl[var20], bl[var15], bl[var16], this.ak[var1], (short)-332);
         }
      } else {
         boolean var14 = this.bd(var1);
         byte var18;
         if (this.ar[var1] == -1 && var14) {
            var15 = cv[this.ah[var1]];
            var16 = this.cj;
            var17 = this.ch;
            var18 = this.ct;
            byte var19 = this.cp;
            in.aq.au(var2, var3, var4, var5, var6, var7, var8, var9, var10, var15, (byte)var16, (byte)var17, var18, var19, -1620123395);
         } else if (this.ar[var1] == -1) {
            fw.av(var2, var3, var4, var5, var6, var7, var8, var9, var10, cv[this.ah[var1]], -1477338792);
         } else if (var14) {
            var15 = this.cj;
            var16 = this.ch;
            var17 = this.ct;
            var18 = this.cp;
            in.aq.ac(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, (byte)var15, (byte)var16, (byte)var17, var18, (byte)-110);
         } else {
            jk.ah(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, -428480375);
         }
      }

   }

   final void ek(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
      int var15;
      int var16;
      int var17;
      if (this.ak != null && this.ak[var1] != -1) {
         int var20;
         if (this.aj != null && this.aj[var1] != -1) {
            var17 = this.aj[var1] & 255;
            var20 = this.ae[var17];
            var15 = this.ap[var17];
            var16 = this.by[var17];
         } else {
            var20 = this.ax[var1];
            var15 = this.ai[var1];
            var16 = this.ag[var1];
         }

         if (this.ar[var1] == -1) {
            az.ar(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, ba[var20], ba[var15], ba[var16], bv[var20], bv[var15], bv[var16], bl[var20], bl[var15], bl[var16], this.ak[var1], (short)30507);
         } else {
            az.ar(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, ba[var20], ba[var15], ba[var16], bv[var20], bv[var15], bv[var16], bl[var20], bl[var15], bl[var16], this.ak[var1], (short)-11877);
         }
      } else {
         boolean var14 = this.bd(var1);
         byte var18;
         if (this.ar[var1] == -1 && var14) {
            var15 = cv[this.ah[var1]];
            var16 = this.cj;
            var17 = this.ch;
            var18 = this.ct;
            byte var19 = this.cp;
            in.aq.au(var2, var3, var4, var5, var6, var7, var8, var9, var10, var15, (byte)var16, (byte)var17, var18, var19, -1620123395);
         } else if (this.ar[var1] == -1) {
            fw.av(var2, var3, var4, var5, var6, var7, var8, var9, var10, cv[this.ah[var1]], -996074030);
         } else if (var14) {
            var15 = this.cj;
            var16 = this.ch;
            var17 = this.ct;
            var18 = this.cp;
            in.aq.ac(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, (byte)var15, (byte)var16, (byte)var17, var18, (byte)-52);
         } else {
            jk.ah(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, -428480375);
         }
      }

   }

   public final void eb(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.bo != 2 && this.bo != 1) {
         this.ag();
      }

      int var9 = gd.au(-1627012122);
      int var10 = ax.ab(1310530316);
      int var11 = cy[var1];
      int var12 = cx[var1];
      int var13 = cy[var2];
      int var14 = cx[var2];
      int var15 = cy[var3];
      int var16 = cx[var3];
      int var17 = cy[var4];
      int var18 = cx[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for(int var20 = 0; var20 < this.al; ++var20) {
         int var21 = this.at[var20];
         int var22 = this.aa[var20];
         int var23 = this.ay[var20];
         int var24;
         if (var3 != 0) {
            var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if (var1 != 0) {
            var24 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var24;
         }

         if (var2 != 0) {
            var24 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var24;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         var24 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         bq[var20] = var23 - var19;
         bg[var20] = var9 + var21 * eu.at(1066228336) / var8;
         bu[var20] = var10 + var24 * eu.at(-1898103808) / var8;
         bf[var20] = df.au(var8, 701913142);
         if (this.ad > 0) {
            ba[var20] = var21;
            bv[var20] = var24;
            bl[var20] = var23;
         }
      }

      try {
         this.bz(false, false, false, 0L);
      } catch (Exception var25) {
      }

   }

   void ec(int var1, qj var2) {
      float var3 = (float)this.at[var1];
      float var4 = (float)(-this.aa[var1]);
      float var5 = (float)(-this.ay[var1]);
      float var6 = 1.0F;
      this.at[var1] = (int)(var2.au[0] * var3 + var2.au[4] * var4 + var2.au[8] * var5 + var2.au[12] * var6);
      this.aa[var1] = -((int)(var2.au[1] * var3 + var2.au[5] * var4 + var2.au[9] * var5 + var2.au[13] * var6));
      this.ay[var1] = -((int)(var2.au[2] * var3 + var2.au[6] * var4 + var2.au[10] * var5 + var2.au[14] * var6));
   }

   void ei(int var1, qj var2) {
      float var3 = (float)this.at[var1];
      float var4 = (float)(-this.aa[var1]);
      float var5 = (float)(-this.ay[var1]);
      float var6 = 1.0F;
      this.at[var1] = (int)(var2.au[0] * var3 + var2.au[4] * var4 + var2.au[8] * var5 + var2.au[12] * var6);
      this.aa[var1] = -((int)(var2.au[1] * var3 + var2.au[5] * var4 + var2.au[9] * var5 + var2.au[13] * var6));
      this.ay[var1] = -((int)(var2.au[2] * var3 + var2.au[6] * var4 + var2.au[10] * var5 + var2.au[14] * var6));
   }

   void ee(ic var1, int var2) {
      if (this.be != null) {
         for(int var3 = 0; var3 < this.al; ++var3) {
            int[] var4 = this.be[var3];
            if (var4 != null && var4.length != 0) {
               int[] var5 = this.bk[var3];
               au.aq(1409705591);

               for(int var6 = 0; var6 < var4.length; ++var6) {
                  int var7 = var4[var6];
                  ew var8 = var1.aw(var7, (byte)-51);
                  if (var8 != null) {
                     ab.at((float)var5[var6] / 255.0F, 268353901);
                     aq.al(var8.al(var2, -1051625794), 1907037909);
                     aq.ao(ab, 1549525824);
                     au.ay(aq, -2045482558);
                  }
               }

               this.bn(var3, au);
            }
         }

      }
   }

   void fe(ic var1, int var2) {
      if (this.be != null) {
         for(int var3 = 0; var3 < this.al; ++var3) {
            int[] var4 = this.be[var3];
            if (var4 != null && var4.length != 0) {
               int[] var5 = this.bk[var3];
               au.aq(1287909662);

               for(int var6 = 0; var6 < var4.length; ++var6) {
                  int var7 = var4[var6];
                  ew var8 = var1.aw(var7, (byte)-19);
                  if (var8 != null) {
                     ab.at((float)var5[var6] / 255.0F, -1606075808);
                     aq.al(var8.al(var2, 587524853), 1877033830);
                     aq.ao(ab, 1196929111);
                     au.ay(aq, 913965177);
                  }
               }

               this.bn(var3, au);
            }
         }

      }
   }
}
