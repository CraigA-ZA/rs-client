import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class fh extends rk {
   int af;
   public static final int bz = 38;
   ek[][] aw;
   public ik ac;
   int au;
   public ek[][] an;
   static int aq;
   Future at;
   List aa;
   static final int bi = 2;
   static fj ah;
   boolean ab;

   static void he(int var0, int var1, int var2, byte var3) {
      try {
         if (aj.vb.aj(1583264693) != 0) {
            if (var3 >= 8) {
               throw new IllegalStateException();
            }

            if (0 != var1) {
               if (var3 >= 8) {
                  throw new IllegalStateException();
               }

               if (client.tl * -297150195 < 50) {
                  client.tu[client.tl * -297150195] = var0;
                  client.tr[client.tl * -297150195] = var1;
                  client.tg[client.tl * -297150195] = var2;
                  client.ti[-297150195 * client.tl] = null;
                  client.tb[client.tl * -297150195] = 0;
                  client.tl += 831233477;
               }
            }
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "fh.he(" + ')');
      }
   }

   void an(sg var1, int var2, byte var3) {
      try {
         var1.cl(-697993691);
         var1.cl(196138183);
         this.au = var1.cm((byte)7) * 2106398559;
         int var4 = var1.cl(-376786090);
         this.aw = new ek[this.ac.an(485057822).an(-1415640515)][];
         this.an = new ek[this.ac.af(612928159)][];
         eh[] var5 = new eh[var4];

         int var6;
         int var8;
         int var10;
         for(var6 = 0; var6 < var4; ++var6) {
            var8 = var1.cm((byte)7);
            ey var9 = (ey)ht.af(gz.au(335062925), var8, (short)173);
            if (null == var9) {
               if (var3 >= 3) {
                  throw new IllegalStateException();
               }

               var9 = ey.af;
            }

            var10 = var1.cp(1391642638);
            ec var11 = el.aq(var1.cm((byte)7), -500821406);
            ek var12 = new ek();
            var12.af(var1, var2, (byte)-26);
            var5[var6] = new eh(this, var12, var9, var11, var10);
            int var13 = var9.ab(-406434338);
            ek[][] var14;
            if (ey.an == var9) {
               if (var3 >= 3) {
                  throw new IllegalStateException();
               }

               var14 = this.aw;
            } else {
               var14 = this.an;
            }

            if (var14[var10] == null) {
               if (var3 >= 3) {
                  throw new IllegalStateException();
               }

               var14[var10] = new ek[var13];
            }

            if (ey.au == var9) {
               if (var3 >= 3) {
                  throw new IllegalStateException();
               }

               this.ab = true;
            }
         }

         var6 = var4 / (-1609019153 * aq);
         int var7 = var4 % (aq * -1609019153);
         int var16 = 0;
         var10 = 0;

         while(true) {
            if (var10 < -1609019153 * aq) {
               if (var3 >= 3) {
                  return;
               }

               var8 = var16;
               var16 += var6;
               if (var7 > 0) {
                  if (var3 >= 3) {
                     throw new IllegalStateException();
                  }

                  ++var16;
                  --var7;
               }

               if (var16 != var8) {
                  this.aa.add(ot.al.submit(new ei(this, var8, var16, var5)));
                  ++var10;
                  continue;
               }

               if (var3 >= 3) {
                  throw new IllegalStateException();
               }
            }

            return;
         }
      } catch (RuntimeException var15) {
         throw db.an(var15, "fh.an(" + ')');
      }
   }

   public boolean au(int var1) {
      try {
         return this.ab;
      } catch (RuntimeException var2) {
         throw db.an(var2, "fh.au(" + ')');
      }
   }

   void ad(qj var1, int var2, ew var3, int var4) {
      float[] var5 = var3.at(this.au * 540704180, 689701217);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.aw[var2] != null) {
         ek var9 = this.aw[var2][0];
         ek var10 = this.aw[var2][1];
         ek var11 = this.aw[var2][2];
         if (null != var9) {
            var6 = var9.aw(var4, -1118122159);
         }

         if (var10 != null) {
            var7 = var10.aw(var4, -1999651151);
         }

         if (var11 != null) {
            var8 = var11.aw(var4, -1674751589);
         }
      }

      qx var17 = fs.an((byte)-11);
      var17.au(1.0F, 0.0F, 0.0F, var6, 749287521);
      qx var18 = fs.an((byte)-89);
      var18.au(0.0F, 1.0F, 0.0F, var7, 749287521);
      qx var19 = fs.an((byte)12);
      var19.au(0.0F, 0.0F, 1.0F, var8, 749287521);
      qx var12 = fs.an((byte)87);
      var12.aq(var19, (byte)84);
      var12.aq(var17, (byte)57);
      var12.aq(var18, (byte)125);
      qj var13;
      synchronized(qj.an) {
         if (0 == qj.ac * 652550762) {
            var13 = new qj();
         } else {
            qj.an[(qj.ac -= 1340498910) * -1129163430].ab((byte)-47);
            var13 = qj.an[-910698341 * qj.ac];
         }
      }

      var13.ax(var12, (byte)-63);
      var1.ao(var13, 1104068098);
      var17.aw((byte)-61);
      var18.aw((byte)-81);
      var19.aw((byte)-98);
      var12.aw((byte)-78);
      var13.an(1198141071);
   }

   public void aj(int var1, ew var2, int var3, int var4) {
      qj var5;
      synchronized(qj.an) {
         if (0 == -910698341 * qj.ac) {
            var5 = new qj();
         } else {
            qj.an[(qj.ac -= -564638317) * -910698341].ab((byte)-25);
            var5 = qj.an[-910698341 * qj.ac];
         }
      }

      this.aq(var5, var3, var2, var1, -2124298429);
      this.at(var5, var3, var2, var1, -1624433511);
      this.al(var5, var3, var2, var1, 1838788389);
      var2.au(var5, -1846725676);
      var5.an(1198141071);
   }

   public void ab(int var1, ew var2, int var3, int var4, int var5) {
      try {
         qj var6;
         synchronized(qj.an) {
            if (0 == -910698341 * qj.ac) {
               if (var5 == -1720220833) {
                  return;
               }

               var6 = new qj();
            } else {
               qj.an[(qj.ac -= -564638317) * -910698341].ab((byte)-24);
               var6 = qj.an[-910698341 * qj.ac];
            }
         }

         this.aq(var6, var3, var2, var1, -2042507237);
         this.at(var6, var3, var2, var1, -1686943935);
         this.al(var6, var3, var2, var1, 2146059803);
         var2.au(var6, -2093338496);
         var6.an(1198141071);
      } catch (RuntimeException var10) {
         throw db.an(var10, "fh.ab(" + ')');
      }
   }

   void al(qj var1, int var2, ew var3, int var4, int var5) {
      try {
         float[] var6 = var3.aa(this.au * -744553313, 2097133235);
         float var7 = var6[0];
         float var8 = var6[1];
         float var9 = var6[2];
         if (null != this.aw[var2]) {
            ek var10 = this.aw[var2][3];
            ek var11 = this.aw[var2][4];
            ek var12 = this.aw[var2][5];
            if (var10 != null) {
               if (var5 <= 1401960191) {
                  throw new IllegalStateException();
               }

               var7 = var10.aw(var4, -1677194647);
            }

            if (var11 != null) {
               if (var5 <= 1401960191) {
                  throw new IllegalStateException();
               }

               var8 = var11.aw(var4, -2050927243);
            }

            if (var12 != null) {
               var9 = var12.aw(var4, -1917493818);
            }
         }

         var1.au[12] = var7;
         var1.au[13] = var8;
         var1.au[14] = var9;
      } catch (RuntimeException var13) {
         throw db.an(var13, "fh.al(" + ')');
      }
   }

   fh(nm var1, nm var2, int var3, boolean var4) {
      try {
         super();
         this.an = (ek[][])null;
         this.aw = (ek[][])null;
         this.au = 0;
         this.af = 1049522741 * var3;
         byte[] var5 = var1.bh(-1156919267 * this.af >> 16 & '\uffff', this.af * -1156919267 & '\uffff', (byte)-124);
         sg var6 = new sg(var5);
         int var7 = var6.cm((byte)7);
         int var8 = var6.cl(756623767);
         byte[] var9;
         if (var4) {
            var9 = var2.ca(0, var8, -606351717);
         } else {
            var9 = var2.ca(var8, 0, -606351717);
         }

         this.ac = new ik(var8, var9);
         this.aa = new ArrayList();
         this.at = ot.al.submit(new fi(this, var6, var7));
      } catch (RuntimeException var10) {
         throw db.an(var10, "fh.<init>(" + ')');
      }
   }

   public int ac(int var1) {
      try {
         return this.au * -744553313;
      } catch (RuntimeException var2) {
         throw db.an(var2, "fh.ac(" + ')');
      }
   }

   public boolean as() {
      return this.ab;
   }

   public static fh aa(nm var0, nm var1, int var2, boolean var3) {
      boolean var4 = true;
      byte[] var5 = var0.ca(var2 >> 16 & 276025475, var2 & '\uffff', -606351717);
      if (null == var5) {
         var4 = false;
         return null;
      } else {
         int var6 = (var5[1] & 255) << 8 | var5[2] & 255;
         byte[] var7;
         if (var3) {
            var7 = var1.ca(0, var6, -606351717);
         } else {
            var7 = var1.ca(var6, 0, -606351717);
         }

         if (null == var7) {
            var4 = false;
         }

         if (!var4) {
            return null;
         } else {
            if (null == ot.al) {
               aq = Runtime.getRuntime().availableProcessors() * -1357423466;
               ot.al = new ThreadPoolExecutor(0, -1246097741 * aq, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(1692989204 + 1283907559 * aq), new fe());
            }

            try {
               return new fh(var0, var1, var2, var3);
            } catch (Exception var9) {
               return null;
            }
         }
      }
   }

   void ao(sg var1, int var2) {
      var1.cl(-1171732614);
      var1.cl(-265441270);
      this.au = var1.cm((byte)7) * 2106398559;
      int var3 = var1.cl(-113917240);
      this.aw = new ek[this.ac.an(219113487).an(-668665502)][];
      this.an = new ek[this.ac.af(646305676)][];
      eh[] var4 = new eh[var3];

      int var5;
      int var7;
      int var9;
      for(var5 = 0; var5 < var3; ++var5) {
         var7 = var1.cm((byte)7);
         ey var8 = (ey)ht.af(gz.au(-483162450), var7, (short)173);
         if (null == var8) {
            var8 = ey.af;
         }

         var9 = var1.cp(2113432759);
         ec var10 = el.aq(var1.cm((byte)7), -817945649);
         ek var11 = new ek();
         var11.af(var1, var2, (byte)-84);
         var4[var5] = new eh(this, var11, var8, var10, var9);
         int var12 = var8.ab(-1917645336);
         ek[][] var13;
         if (ey.an == var8) {
            var13 = this.aw;
         } else {
            var13 = this.an;
         }

         if (var13[var9] == null) {
            var13[var9] = new ek[var12];
         }

         if (ey.au == var8) {
            this.ab = true;
         }
      }

      var5 = var3 / (1719893363 * aq);
      int var6 = var3 % (aq * 361417104);
      int var14 = 0;

      for(var9 = 0; var9 < -1609019153 * aq; ++var9) {
         var7 = var14;
         var14 += var5;
         if (var6 > 0) {
            ++var14;
            --var6;
         }

         if (var14 == var7) {
            break;
         }

         this.aa.add(ot.al.submit(new ei(this, var7, var14, var4)));
      }

   }

   void ax(sg var1, int var2) {
      var1.cl(-541167353);
      var1.cl(-1464819018);
      this.au = var1.cm((byte)7) * -1991005177;
      int var3 = var1.cl(-2115502743);
      this.aw = new ek[this.ac.an(-312016765).an(-1182529487)][];
      this.an = new ek[this.ac.af(-45612163)][];
      eh[] var4 = new eh[var3];

      int var5;
      int var7;
      int var9;
      for(var5 = 0; var5 < var3; ++var5) {
         var7 = var1.cm((byte)7);
         ey var8 = (ey)ht.af(gz.au(727727471), var7, (short)173);
         if (null == var8) {
            var8 = ey.af;
         }

         var9 = var1.cp(1689699579);
         ec var10 = el.aq(var1.cm((byte)7), -1214354953);
         ek var11 = new ek();
         var11.af(var1, var2, (byte)-77);
         var4[var5] = new eh(this, var11, var8, var10, var9);
         int var12 = var8.ab(682121227);
         ek[][] var13;
         if (ey.an == var8) {
            var13 = this.aw;
         } else {
            var13 = this.an;
         }

         if (var13[var9] == null) {
            var13[var9] = new ek[var12];
         }

         if (ey.au == var8) {
            this.ab = true;
         }
      }

      var5 = var3 / (-809614081 * aq);
      int var6 = var3 % (aq * -1609019153);
      int var14 = 0;

      for(var9 = 0; var9 < -1609019153 * aq; ++var9) {
         var7 = var14;
         var14 += var5;
         if (var6 > 0) {
            ++var14;
            --var6;
         }

         if (var14 == var7) {
            break;
         }

         this.aa.add(ot.al.submit(new ei(this, var7, var14, var4)));
      }

   }

   public boolean ai() {
      if (null == this.at && this.aa == null) {
         return true;
      } else {
         if (this.at != null) {
            if (!this.at.isDone()) {
               return false;
            }

            this.at = null;
         }

         boolean var1 = true;

         for(int var2 = 0; var2 < this.aa.size(); ++var2) {
            if (!((Future)this.aa.get(var2)).isDone()) {
               var1 = false;
            } else {
               this.aa.remove(var2);
               --var2;
            }
         }

         if (!var1) {
            return false;
         } else {
            this.aa = null;
            return true;
         }
      }
   }

   public boolean ag() {
      if (null == this.at && this.aa == null) {
         return true;
      } else {
         if (this.at != null) {
            if (!this.at.isDone()) {
               return false;
            }

            this.at = null;
         }

         boolean var1 = true;

         for(int var2 = 0; var2 < this.aa.size(); ++var2) {
            if (!((Future)this.aa.get(var2)).isDone()) {
               var1 = false;
            } else {
               this.aa.remove(var2);
               --var2;
            }
         }

         if (!var1) {
            return false;
         } else {
            this.aa = null;
            return true;
         }
      }
   }

   public boolean ah() {
      if (null == this.at && this.aa == null) {
         return true;
      } else {
         if (this.at != null) {
            if (!this.at.isDone()) {
               return false;
            }

            this.at = null;
         }

         boolean var1 = true;

         for(int var2 = 0; var2 < this.aa.size(); ++var2) {
            if (!((Future)this.aa.get(var2)).isDone()) {
               var1 = false;
            } else {
               this.aa.remove(var2);
               --var2;
            }
         }

         if (!var1) {
            return false;
         } else {
            this.aa = null;
            return true;
         }
      }
   }

   public int av() {
      return this.au * 1923262966;
   }

   public int ar() {
      return this.au * -413757052;
   }

   public boolean am() {
      return this.ab;
   }

   public static fh ay(nm var0, nm var1, int var2, boolean var3) {
      boolean var4 = true;
      byte[] var5 = var0.ca(var2 >> 16 & '\uffff', var2 & '\uffff', -606351717);
      if (null == var5) {
         var4 = false;
         return null;
      } else {
         int var6 = (var5[1] & 255) << 8 | var5[2] & 255;
         byte[] var7;
         if (var3) {
            var7 = var1.ca(0, var6, -606351717);
         } else {
            var7 = var1.ca(var6, 0, -606351717);
         }

         if (null == var7) {
            var4 = false;
         }

         if (!var4) {
            return null;
         } else {
            if (null == ot.al) {
               aq = Runtime.getRuntime().availableProcessors() * -1243816433;
               ot.al = new ThreadPoolExecutor(0, -1609019153 * aq, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100 + -1988125348 * aq), new fe());
            }

            try {
               return new fh(var0, var1, var2, var3);
            } catch (Exception var9) {
               return null;
            }
         }
      }
   }

   void bb(qj var1, int var2, ew var3, int var4) {
      float[] var5 = var3.ay(-744553313 * this.au, -2140302395);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (null != this.aw[var2]) {
         ek var9 = this.aw[var2][6];
         ek var10 = this.aw[var2][7];
         ek var11 = this.aw[var2][8];
         if (var9 != null) {
            var6 = var9.aw(var4, -1555047649);
         }

         if (null != var10) {
            var7 = var10.aw(var4, -1614643660);
         }

         if (null != var11) {
            var8 = var11.aw(var4, -1320778696);
         }
      }

      qj var14;
      synchronized(qj.an) {
         if (-2134274549 * qj.ac == 0) {
            var14 = new qj();
         } else {
            qj.an[(qj.ac -= -564638317) * -910698341].ab((byte)-124);
            var14 = qj.an[-910698341 * qj.ac];
         }
      }

      var14.aa(var6, var7, var8, 691804305);
      var1.ao(var14, 1456468723);
      var14.an(1198141071);
   }

   public void ak(int var1, ew var2, int var3, int var4) {
      qj var5;
      synchronized(qj.an) {
         if (0 == -910698341 * qj.ac) {
            var5 = new qj();
         } else {
            qj.an[(qj.ac -= -581569689) * -910698341].ab((byte)-48);
            var5 = qj.an[-910698341 * qj.ac];
         }
      }

      this.aq(var5, var3, var2, var1, -1366884139);
      this.at(var5, var3, var2, var1, -1876303915);
      this.al(var5, var3, var2, var1, 2032809415);
      var2.au(var5, -2093532589);
      var5.an(1198141071);
   }

   void az(qj var1, int var2, ew var3, int var4) {
      float[] var5 = var3.at(this.au * -744553313, 689701217);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.aw[var2] != null) {
         ek var9 = this.aw[var2][0];
         ek var10 = this.aw[var2][1];
         ek var11 = this.aw[var2][2];
         if (null != var9) {
            var6 = var9.aw(var4, -1353498447);
         }

         if (var10 != null) {
            var7 = var10.aw(var4, -1766075218);
         }

         if (var11 != null) {
            var8 = var11.aw(var4, -1041345262);
         }
      }

      qx var17 = fs.an((byte)11);
      var17.au(1.0F, 0.0F, 0.0F, var6, 749287521);
      qx var18 = fs.an((byte)6);
      var18.au(0.0F, 1.0F, 0.0F, var7, 749287521);
      qx var19 = fs.an((byte)-54);
      var19.au(0.0F, 0.0F, 1.0F, var8, 749287521);
      qx var12 = fs.an((byte)50);
      var12.aq(var19, (byte)105);
      var12.aq(var17, (byte)7);
      var12.aq(var18, (byte)94);
      qj var13;
      synchronized(qj.an) {
         if (0 == qj.ac * -910698341) {
            var13 = new qj();
         } else {
            qj.an[(qj.ac -= -564638317) * -910698341].ab((byte)-43);
            var13 = qj.an[-910698341 * qj.ac];
         }
      }

      var13.ax(var12, (byte)-125);
      var1.ao(var13, 1950375064);
      var17.aw((byte)-5);
      var18.aw((byte)-26);
      var19.aw((byte)-67);
      var12.aw((byte)-84);
      var13.an(1198141071);
   }

   public boolean aw(int var1) {
      try {
         if (null == this.at && this.aa == null) {
            if (var1 != -63286081) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            if (this.at != null) {
               if (var1 != -63286081) {
                  throw new IllegalStateException();
               }

               if (!this.at.isDone()) {
                  if (var1 != -63286081) {
                     throw new IllegalStateException();
                  }

                  return false;
               }

               this.at = null;
            }

            boolean var2 = true;

            for(int var3 = 0; var3 < this.aa.size(); ++var3) {
               if (var1 != -63286081) {
                  throw new IllegalStateException();
               }

               if (!((Future)this.aa.get(var3)).isDone()) {
                  if (var1 != -63286081) {
                     throw new IllegalStateException();
                  }

                  var2 = false;
               } else {
                  this.aa.remove(var3);
                  --var3;
               }
            }

            if (!var2) {
               if (var1 != -63286081) {
                  throw new IllegalStateException();
               } else {
                  return false;
               }
            } else {
               this.aa = null;
               return true;
            }
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "fh.aw(" + ')');
      }
   }

   void ae(qj var1, int var2, ew var3, int var4) {
      float[] var5 = var3.aa(this.au * -744553313, 540389908);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (null != this.aw[var2]) {
         ek var9 = this.aw[var2][3];
         ek var10 = this.aw[var2][4];
         ek var11 = this.aw[var2][5];
         if (var9 != null) {
            var6 = var9.aw(var4, -2021016406);
         }

         if (var10 != null) {
            var7 = var10.aw(var4, -2065526236);
         }

         if (var11 != null) {
            var8 = var11.aw(var4, -2115259052);
         }
      }

      var1.au[12] = var6;
      var1.au[13] = var7;
      var1.au[14] = var8;
   }

   void ap(qj var1, int var2, ew var3, int var4) {
      float[] var5 = var3.aa(this.au * -744553313, 1957061639);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (null != this.aw[var2]) {
         ek var9 = this.aw[var2][3];
         ek var10 = this.aw[var2][4];
         ek var11 = this.aw[var2][5];
         if (var9 != null) {
            var6 = var9.aw(var4, -1765865983);
         }

         if (var10 != null) {
            var7 = var10.aw(var4, -893628976);
         }

         if (var11 != null) {
            var8 = var11.aw(var4, -2119734709);
         }
      }

      var1.au[12] = var6;
      var1.au[13] = var7;
      var1.au[14] = var8;
   }

   void by(qj var1, int var2, ew var3, int var4) {
      float[] var5 = var3.aa(this.au * -744553313, 962805315);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (null != this.aw[var2]) {
         ek var9 = this.aw[var2][3];
         ek var10 = this.aw[var2][4];
         ek var11 = this.aw[var2][5];
         if (var9 != null) {
            var6 = var9.aw(var4, -1153369949);
         }

         if (var10 != null) {
            var7 = var10.aw(var4, -823839020);
         }

         if (var11 != null) {
            var8 = var11.aw(var4, -1051756925);
         }
      }

      var1.au[12] = var6;
      var1.au[13] = var7;
      var1.au[14] = var8;
   }

   void aq(qj var1, int var2, ew var3, int var4, int var5) {
      try {
         float[] var6 = var3.at(this.au * -744553313, 689701217);
         float var7 = var6[0];
         float var8 = var6[1];
         float var9 = var6[2];
         if (this.aw[var2] != null) {
            if (var5 >= -362988431) {
               throw new IllegalStateException();
            }

            ek var10 = this.aw[var2][0];
            ek var11 = this.aw[var2][1];
            ek var12 = this.aw[var2][2];
            if (null != var10) {
               if (var5 >= -362988431) {
                  throw new IllegalStateException();
               }

               var7 = var10.aw(var4, -1453071914);
            }

            if (var11 != null) {
               if (var5 >= -362988431) {
                  throw new IllegalStateException();
               }

               var8 = var11.aw(var4, -2024475281);
            }

            if (var12 != null) {
               if (var5 >= -362988431) {
                  throw new IllegalStateException();
               }

               var9 = var12.aw(var4, -1489920931);
            }
         }

         qx var19 = fs.an((byte)-20);
         var19.au(1.0F, 0.0F, 0.0F, var7, 749287521);
         qx var20 = fs.an((byte)70);
         var20.au(0.0F, 1.0F, 0.0F, var8, 749287521);
         qx var21 = fs.an((byte)-15);
         var21.au(0.0F, 0.0F, 1.0F, var9, 749287521);
         qx var13 = fs.an((byte)30);
         var13.aq(var21, (byte)31);
         var13.aq(var19, (byte)43);
         var13.aq(var20, (byte)73);
         qj var14;
         synchronized(qj.an) {
            if (0 == qj.ac * -910698341) {
               if (var5 >= -362988431) {
                  return;
               }

               var14 = new qj();
            } else {
               qj.an[(qj.ac -= -564638317) * -910698341].ab((byte)-106);
               var14 = qj.an[-910698341 * qj.ac];
            }
         }

         var14.ax(var13, (byte)-48);
         var1.ao(var14, 1545077271);
         var19.aw((byte)-73);
         var20.aw((byte)-51);
         var21.aw((byte)-95);
         var13.aw((byte)-6);
         var14.an(1198141071);
      } catch (RuntimeException var18) {
         throw db.an(var18, "fh.aq(" + ')');
      }
   }

   void bi(qj var1, int var2, ew var3, int var4) {
      float[] var5 = var3.ay(-744553313 * this.au, -2141984637);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (null != this.aw[var2]) {
         ek var9 = this.aw[var2][6];
         ek var10 = this.aw[var2][7];
         ek var11 = this.aw[var2][8];
         if (var9 != null) {
            var6 = var9.aw(var4, -899279174);
         }

         if (null != var10) {
            var7 = var10.aw(var4, -1413299620);
         }

         if (null != var11) {
            var8 = var11.aw(var4, -930173665);
         }
      }

      qj var14;
      synchronized(qj.an) {
         if (-1319000195 * qj.ac == 0) {
            var14 = new qj();
         } else {
            qj.an[(qj.ac -= 1234448817) * -910698341].ab((byte)-88);
            var14 = qj.an[-910698341 * qj.ac];
         }
      }

      var14.aa(var6, var7, var8, -1822777242);
      var1.ao(var14, 1906184528);
      var14.an(1198141071);
   }

   void be(qj var1, int var2, ew var3, int var4) {
      float[] var5 = var3.ay(-744553313 * this.au, -2143768055);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (null != this.aw[var2]) {
         ek var9 = this.aw[var2][6];
         ek var10 = this.aw[var2][7];
         ek var11 = this.aw[var2][8];
         if (var9 != null) {
            var6 = var9.aw(var4, -1375501555);
         }

         if (null != var10) {
            var7 = var10.aw(var4, -1496871291);
         }

         if (null != var11) {
            var8 = var11.aw(var4, -1260700774);
         }
      }

      qj var14;
      synchronized(qj.an) {
         if (-910698341 * qj.ac == 0) {
            var14 = new qj();
         } else {
            qj.an[(qj.ac -= -564638317) * -910698341].ab((byte)-3);
            var14 = qj.an[-910698341 * qj.ac];
         }
      }

      var14.aa(var6, var7, var8, 119673828);
      var1.ao(var14, 1100049253);
      var14.an(1198141071);
   }

   void bk(qj var1, int var2, ew var3, int var4) {
      float[] var5 = var3.ay(-744553313 * this.au, -2145759891);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (null != this.aw[var2]) {
         ek var9 = this.aw[var2][6];
         ek var10 = this.aw[var2][7];
         ek var11 = this.aw[var2][8];
         if (var9 != null) {
            var6 = var9.aw(var4, -808402141);
         }

         if (null != var10) {
            var7 = var10.aw(var4, -2072435977);
         }

         if (null != var11) {
            var8 = var11.aw(var4, -1430722397);
         }
      }

      qj var14;
      synchronized(qj.an) {
         if (-910698341 * qj.ac == 0) {
            var14 = new qj();
         } else {
            qj.an[(qj.ac -= -564638317) * -910698341].ab((byte)-125);
            var14 = qj.an[-910698341 * qj.ac];
         }
      }

      var14.aa(var6, var7, var8, -284702389);
      var1.ao(var14, 1128174859);
      var14.an(1198141071);
   }

   void at(qj var1, int var2, ew var3, int var4, int var5) {
      try {
         float[] var6 = var3.ay(-744553313 * this.au, -2141341986);
         float var7 = var6[0];
         float var8 = var6[1];
         float var9 = var6[2];
         if (null != this.aw[var2]) {
            if (var5 >= -966914563) {
               throw new IllegalStateException();
            }

            ek var10 = this.aw[var2][6];
            ek var11 = this.aw[var2][7];
            ek var12 = this.aw[var2][8];
            if (var10 != null) {
               if (var5 >= -966914563) {
                  throw new IllegalStateException();
               }

               var7 = var10.aw(var4, -1599255440);
            }

            if (null != var11) {
               if (var5 >= -966914563) {
                  throw new IllegalStateException();
               }

               var8 = var11.aw(var4, -1320109879);
            }

            if (null != var12) {
               if (var5 >= -966914563) {
                  throw new IllegalStateException();
               }

               var9 = var12.aw(var4, -1753875121);
            }
         }

         qj var16;
         synchronized(qj.an) {
            if (-910698341 * qj.ac == 0) {
               if (var5 >= -966914563) {
                  throw new IllegalStateException();
               }

               var16 = new qj();
            } else {
               qj.an[(qj.ac -= -564638317) * -910698341].ab((byte)-124);
               var16 = qj.an[-910698341 * qj.ac];
            }
         }

         var16.aa(var7, var8, var9, -2045639991);
         var1.ao(var16, 1139469665);
         var16.an(1198141071);
      } catch (RuntimeException var15) {
         throw db.an(var15, "fh.at(" + ')');
      }
   }

   static final void il(int var0, int var1, int var2, int var3) {
      try {
         if (-2100544359 * bt.kx < var0) {
            if (var3 == -1835821708) {
               throw new IllegalStateException();
            }

            bt.kx += (2083910077 * ap.ul + fd.uu * -1514927571 * (var0 - -2100544359 * bt.kx) / 1000) * -1682679895;
            if (-2100544359 * bt.kx > var0) {
               if (var3 == -1835821708) {
                  throw new IllegalStateException();
               }

               bt.kx = -1682679895 * var0;
            }
         }

         if (bt.kx * -2100544359 > var0) {
            bt.kx -= -1682679895 * (ap.ul * 2083910077 + fd.uu * -1514927571 * (-2100544359 * bt.kx - var0) / 1000);
            if (-2100544359 * bt.kx < var0) {
               if (var3 == -1835821708) {
                  throw new IllegalStateException();
               }

               bt.kx = var0 * -1682679895;
            }
         }

         if (1772923873 * gk.kv < var1) {
            if (var3 == -1835821708) {
               throw new IllegalStateException();
            }

            gk.kv += (2083910077 * ap.ul + (var1 - gk.kv * 1772923873) * fd.uu * -1514927571 / 1000) * -424093663;
            if (gk.kv * 1772923873 > var1) {
               if (var3 == -1835821708) {
                  throw new IllegalStateException();
               }

               gk.kv = -424093663 * var1;
            }
         }

         if (gk.kv * 1772923873 > var1) {
            if (var3 == -1835821708) {
               throw new IllegalStateException();
            }

            gk.kv -= (ap.ul * 2083910077 + (1772923873 * gk.kv - var1) * -1514927571 * fd.uu / 1000) * -424093663;
            if (1772923873 * gk.kv < var1) {
               if (var3 == -1835821708) {
                  throw new IllegalStateException();
               }

               gk.kv = -424093663 * var1;
            }
         }

         if (-91399205 * ly.ke < var2) {
            if (var3 == -1835821708) {
               throw new IllegalStateException();
            }

            ly.ke += (-1514927571 * fd.uu * (var2 - -91399205 * ly.ke) / 1000 + ap.ul * 2083910077) * 46344275;
            if (-91399205 * ly.ke > var2) {
               if (var3 == -1835821708) {
                  throw new IllegalStateException();
               }

               ly.ke = var2 * 46344275;
            }
         }

         if (-91399205 * ly.ke > var2) {
            if (var3 == -1835821708) {
               throw new IllegalStateException();
            }

            ly.ke -= (-1514927571 * fd.uu * (ly.ke * -91399205 - var2) / 1000 + 2083910077 * ap.ul) * 46344275;
            if (-91399205 * ly.ke < var2) {
               if (var3 == -1835821708) {
                  throw new IllegalStateException();
               }

               ly.ke = 46344275 * var2;
            }
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "fh.il(" + ')');
      }
   }
}
