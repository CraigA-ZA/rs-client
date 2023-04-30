import accessors.RSWorldMapManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class jv implements RSWorldMapManager {
   tq ac;
   HashMap au;
   final HashMap ay;
   boolean an;
   kk aw;
   jr[][] ab;
   HashMap aq;
   tc[] al;
   final nm at;
   final nm aa;
   int ag;
   public int ah;
   int ax;
   int ai;
   int ao;
   boolean af;

   public final void am(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var9 = th.ad;
      int var10 = th.ae;
      int var11 = th.ap;
      float[] var12 = th.by;
      int[] var13 = new int[4];
      th.el(var13);
      ju var14 = this.aq(var1, var2, var3, var4, -1216850815);
      float var15 = this.ay(var7 - var5, var3 - var1, -2097930601);
      int var16 = (int)Math.ceil((double)var15);
      this.ah = var16 * 1717142051;
      if (!this.aq.containsKey(var16)) {
         kj var17 = new kj(var16);
         var17.ac(32201926);
         this.aq.put(var16, var17);
      }

      int var24 = var14.af * -1083493055 + -1346472301 * var14.aw - 1;
      int var18 = 844386227 * var14.ac + 856820921 * var14.an - 1;

      int var19;
      int var20;
      for(var19 = var14.aw * -1346472301; var19 <= var24; ++var19) {
         for(var20 = 844386227 * var14.ac; var20 <= var18; ++var20) {
            this.ab[var19][var20].ax(var16, (kj)this.aq.get(var16), this.al, this.at, this.aa, 930960763);
         }
      }

      an.ay(var9, var10, var11, var12, 580310026);
      th.en(var13);
      var19 = (int)(64.0F * var15);
      var20 = 1525088909 * this.ao + var1;
      int var21 = this.ax * -151833963 + var2;

      for(int var22 = var14.aw * -1346472301; var22 < -1346472301 * var14.aw + var14.af * -1083493055; ++var22) {
         for(int var23 = var14.ac * 844386227; var23 < var14.an * 856820921 + 844386227 * var14.ac; ++var23) {
            this.ab[var22][var23].ac(var5 + (1598848320 * this.ab[var22][var23].ab - var20) * var19 / 64, var8 - (64 + (-1342988608 * this.ab[var22][var23].aq - var21)) * var19 / 64, var19, (byte)29);
         }
      }

   }

   public void af(nm var1, String var2, boolean var3, short var4) {
      try {
         if (this.an) {
            if (var4 >= 512) {
               throw new IllegalStateException();
            }
         } else {
            this.af = false;
            this.an = true;
            System.nanoTime();
            int var5 = var1.cy(kq.af.ab, -371614953);
            int var6 = var1.cx(var5, var2, (short)8192);
            sg var7 = new sg(var1.cb(kq.af.ab, var2, 1648560407));
            sg var8 = new sg(var1.cb(kq.an.ab, var2, 1648560407));
            System.nanoTime();
            System.nanoTime();
            this.aw = new kk();

            try {
               this.aw.cl(var7, var8, var6, var3, (byte)-7);
            } catch (IllegalStateException var17) {
               return;
            }

            this.aw.ar((byte)53);
            this.aw.am(-2019541929);
            this.aw.as(-151833963);
            this.ao = this.aw.ai(16748608) * -1335619264;
            this.ax = this.aw.ah(892504992) * 683814720;
            this.ai = (this.aw.ag(38693655) - this.aw.ai(16748608) + 1) * -1863614400;
            this.ag = (this.aw.av(1025496542) - this.aw.ah(-1471663693) + 1) * -935980224;
            int var9 = this.aw.ag(-1739321942) - this.aw.ai(16748608) + 1;
            int var10 = this.aw.av(1679530537) - this.aw.ah(1896833864) + 1;
            System.nanoTime();
            System.nanoTime();
            pr.aw(-2040027942);
            this.ab = new jr[var9][var10];
            Iterator var11 = this.aw.ax.iterator();

            while(var11.hasNext()) {
               jm var12 = (jm)var11.next();
               int var13 = var12.aq * -1159667627;
               int var14 = var12.al * -1674687277;
               int var15 = var13 - this.aw.ai(16748608);
               int var16 = var14 - this.aw.ah(388206686);
               this.ab[var15][var16] = new jr(var13, var14, this.aw.ao(-2082932774), this.ay);
               this.ab[var15][var16].au(var12, this.aw.ag, 1780260388);
            }

            for(int var19 = 0; var19 < var9; ++var19) {
               if (var4 >= 512) {
                  return;
               }

               for(int var21 = 0; var21 < var10; ++var21) {
                  if (var4 >= 512) {
                     throw new IllegalStateException();
                  }

                  if (this.ab[var19][var21] == null) {
                     if (var4 >= 512) {
                        throw new IllegalStateException();
                     }

                     this.ab[var19][var21] = new jr(this.aw.ai(16748608) + var19, this.aw.ah(-604476008) + var21, this.aw.ao(-2092871640), this.ay);
                     this.ab[var19][var21].ab(this.aw.ai, this.aw.ag, 1961953252);
                  }
               }
            }

            System.nanoTime();
            System.nanoTime();
            if (var1.cv(kq.aw.ab, var2, -1313069490)) {
               if (var4 >= 512) {
                  throw new IllegalStateException();
               }

               byte[] var20 = var1.cb(kq.aw.ab, var2, 1648560407);
               this.ac = mk.af(var20, 140363639);
            }

            System.nanoTime();
            var1.cf(2145845097);
            var1.cg(1903798827);
            this.af = true;
         }
      } catch (RuntimeException var18) {
         throw db.an(var18, "jv.af(" + ')');
      }
   }

   public final void an(int var1) {
      try {
         this.au = null;
      } catch (RuntimeException var2) {
         throw db.an(var2, "jv.an(" + ')');
      }
   }

   public final void aw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      try {
         int[] var10 = th.ad;
         int var11 = th.ae;
         int var12 = th.ap;
         float[] var13 = th.by;
         int[] var14 = new int[4];
         th.el(var14);
         ju var15 = this.aq(var1, var2, var3, var4, -612377796);
         float var16 = this.ay(var7 - var5, var3 - var1, -1905584991);
         int var17 = (int)Math.ceil((double)var16);
         this.ah = var17 * 1717142051;
         if (!this.aq.containsKey(var17)) {
            if (var9 == -65498066) {
               throw new IllegalStateException();
            }

            kj var18 = new kj(var17);
            var18.ac(-246959980);
            this.aq.put(var17, var18);
         }

         int var26 = var15.af * -1083493055 + -1346472301 * var15.aw - 1;
         int var19 = 844386227 * var15.ac + 856820921 * var15.an - 1;

         int var20;
         int var21;
         for(var20 = var15.aw * -1346472301; var20 <= var26; ++var20) {
            if (var9 == -65498066) {
               throw new IllegalStateException();
            }

            for(var21 = 844386227 * var15.ac; var21 <= var19; ++var21) {
               if (var9 == -65498066) {
                  throw new IllegalStateException();
               }

               this.ab[var20][var21].ax(var17, (kj)this.aq.get(var17), this.al, this.at, this.aa, -818426546);
            }
         }

         an.ay(var10, var11, var12, var13, 580310026);
         th.en(var14);
         var20 = (int)(64.0F * var16);
         var21 = 1525088909 * this.ao + var1;
         int var22 = this.ax * -151833963 + var2;

         for(int var23 = var15.aw * -1346472301; var23 < -1346472301 * var15.aw + var15.af * -1083493055; ++var23) {
            if (var9 == -65498066) {
               return;
            }

            for(int var24 = var15.ac * 844386227; var24 < var15.an * 856820921 + 844386227 * var15.ac; ++var24) {
               if (var9 == -65498066) {
                  throw new IllegalStateException();
               }

               this.ab[var23][var24].ac(var5 + (1598848320 * this.ab[var23][var24].ab - var21) * var20 / 64, var8 - (64 + (-1342988608 * this.ab[var23][var24].aq - var22)) * var20 / 64, var20, (byte)6);
            }
         }

      } catch (RuntimeException var25) {
         throw db.an(var25, "jv.aw(" + ')');
      }
   }

   public final void ac(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13, int var14) {
      try {
         ju var15 = this.aq(var1, var2, var3, var4, -496440495);
         float var16 = this.ay(var7 - var5, var3 - var1, 1362839406);
         int var17 = (int)(var16 * 64.0F);
         int var18 = var1 + this.ao * 1525088909;
         int var19 = var2 + -151833963 * this.ax;

         int var20;
         int var21;
         for(var20 = -1346472301 * var15.aw; var20 < -1083493055 * var15.af + var15.aw * -1346472301; ++var20) {
            for(var21 = 844386227 * var15.ac; var21 < var15.ac * 844386227 + var15.an * 856820921; ++var21) {
               if (var13) {
                  if (var14 == -508767459) {
                     throw new IllegalStateException();
                  }

                  this.ab[var20][var21].at(-1575710248);
               }

               this.ab[var20][var21].ai(var5 + (1598848320 * this.ab[var20][var21].ab - var18) * var17 / 64, var8 - (-1342988608 * this.ab[var20][var21].aq - var19 + 64) * var17 / 64, var17, var9, (byte)-48);
            }
         }

         if (var10 != null) {
            if (var14 == -508767459) {
               return;
            }

            if (var11 > 0) {
               if (var14 == -508767459) {
                  throw new IllegalStateException();
               }

               for(var20 = -1346472301 * var15.aw; var20 < -1346472301 * var15.aw + -1083493055 * var15.af; ++var20) {
                  if (var14 == -508767459) {
                     return;
                  }

                  for(var21 = var15.ac * 844386227; var21 < var15.an * 856820921 + 844386227 * var15.ac; ++var21) {
                     this.ab[var20][var21].ag(var10, var11, var12, -1521624109);
                  }
               }
            }
         }

      } catch (RuntimeException var22) {
         throw db.an(var22, "jv.ac(" + ')');
      }
   }

   ju bx(int var1, int var2, int var3, int var4) {
      ju var5 = new ju(this);
      int var6 = var1 + this.ao * 1525088909;
      int var7 = var2 + this.ax * -151833963;
      int var8 = this.ao * 1525088909 + var3;
      int var9 = this.ax * -151833963 + var4;
      int var10 = var6 / 64;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      var5.af = (var12 - var10 + 1) * 1584683713;
      var5.an = 227686793 * (var13 - var11 + 1);
      var5.aw = (var10 - this.aw.ai(16748608)) * 507320219;
      var5.ac = (var11 - this.aw.ah(-46002004)) * -1727465605;
      if (var5.aw * -1346472301 < 0) {
         var5.af += 685970131 * var5.aw;
         var5.aw = 0;
      }

      if (var5.aw * -1346472301 > this.ab.length - -1083493055 * var5.af) {
         var5.af = 1584683713 * (this.ab.length - var5.aw * -1346472301);
      }

      if (var5.ac * 844386227 < 0) {
         var5.an += 1072923083 * var5.ac;
         var5.ac = 0;
      }

      if (var5.ac * 844386227 > this.ab[0].length - var5.an * 856820921) {
         var5.an = 227686793 * (this.ab[0].length - 844386227 * var5.ac);
      }

      var5.af = Math.min(-1083493055 * var5.af, this.ab.length) * 1584683713;
      var5.an = Math.min(var5.an * 856820921, this.ab[0].length) * 227686793;
      return var5;
   }

   void bs() {
      if (this.au == null) {
         this.au = new HashMap();
      }

      this.au.clear();

      for(int var1 = 0; var1 < this.ab.length; ++var1) {
         for(int var2 = 0; var2 < this.ab[var1].length; ++var2) {
            List var3 = this.ab[var1][var2].bd((byte)50);
            Iterator var4 = var3.iterator();

            while(var4.hasNext()) {
               kg var5 = (kg)var4.next();
               if (var5.as(853905183)) {
                  int var6 = var5.an(-139545119);
                  if (!this.au.containsKey(var6)) {
                     LinkedList var7 = new LinkedList();
                     var7.add(var5);
                     this.au.put(var6, var7);
                  } else {
                     List var8 = (List)this.au.get(var6);
                     var8.add(var5);
                  }
               }
            }
         }
      }

   }

   ju aq(int var1, int var2, int var3, int var4, int var5) {
      try {
         ju var6 = new ju(this);
         int var7 = var1 + this.ao * 1525088909;
         int var8 = var2 + this.ax * -151833963;
         int var9 = this.ao * 1525088909 + var3;
         int var10 = this.ax * -151833963 + var4;
         int var11 = var7 / 64;
         int var12 = var8 / 64;
         int var13 = var9 / 64;
         int var14 = var10 / 64;
         var6.af = (var13 - var11 + 1) * 1584683713;
         var6.an = 227686793 * (var14 - var12 + 1);
         var6.aw = (var11 - this.aw.ai(16748608)) * 507320219;
         var6.ac = (var12 - this.aw.ah(-1971180212)) * -1727465605;
         if (var6.aw * -1346472301 < 0) {
            if (var5 == -463567197) {
               throw new IllegalStateException();
            }

            var6.af += 685970131 * var6.aw;
            var6.aw = 0;
         }

         if (var6.aw * -1346472301 > this.ab.length - -1083493055 * var6.af) {
            if (var5 == -463567197) {
               throw new IllegalStateException();
            }

            var6.af = 1584683713 * (this.ab.length - var6.aw * -1346472301);
         }

         if (var6.ac * 844386227 < 0) {
            if (var5 == -463567197) {
               throw new IllegalStateException();
            }

            var6.an += 1072923083 * var6.ac;
            var6.ac = 0;
         }

         if (var6.ac * 844386227 > this.ab[0].length - var6.an * 856820921) {
            var6.an = 227686793 * (this.ab[0].length - 844386227 * var6.ac);
         }

         var6.af = Math.min(-1083493055 * var6.af, this.ab.length) * 1584683713;
         var6.an = Math.min(var6.an * 856820921, this.ab[0].length) * 227686793;
         return var6;
      } catch (RuntimeException var15) {
         throw db.an(var15, "jv.aq(" + ')');
      }
   }

   public boolean al(int var1) {
      try {
         return this.af;
      } catch (RuntimeException var2) {
         throw db.an(var2, "jv.al(" + ')');
      }
   }

   public HashMap at(byte var1) {
      try {
         this.aa((byte)23);
         return this.au;
      } catch (RuntimeException var2) {
         throw db.an(var2, "jv.at(" + ')');
      }
   }

   void aa(byte var1) {
      try {
         if (this.au == null) {
            this.au = new HashMap();
         }

         this.au.clear();

         for(int var2 = 0; var2 < this.ab.length; ++var2) {
            if (var1 == 1) {
               throw new IllegalStateException();
            }

            for(int var3 = 0; var3 < this.ab[var2].length; ++var3) {
               if (var1 == 1) {
                  throw new IllegalStateException();
               }

               List var4 = this.ab[var2][var3].bd((byte)26);
               Iterator var5 = var4.iterator();

               while(var5.hasNext()) {
                  kg var6 = (kg)var5.next();
                  if (!var6.as(-50874209)) {
                     if (var1 == 1) {
                        throw new IllegalStateException();
                     }
                  } else {
                     int var7 = var6.an(-932425967);
                     if (!this.au.containsKey(var7)) {
                        LinkedList var8 = new LinkedList();
                        var8.add(var6);
                        this.au.put(var7, var8);
                     } else {
                        List var10 = (List)this.au.get(var7);
                        var10.add(var6);
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var9) {
         throw db.an(var9, "jv.aa(" + ')');
      }
   }

   float ay(int var1, int var2, int var3) {
      try {
         float var4 = (float)var1 / (float)var2;
         if (var4 > 8.0F) {
            if (var3 == 61014472) {
               throw new IllegalStateException();
            } else {
               return 8.0F;
            }
         } else if (var4 < 1.0F) {
            if (var3 == 61014472) {
               throw new IllegalStateException();
            } else {
               return 1.0F;
            }
         } else {
            int var5 = Math.round(var4);
            return Math.abs((float)var5 - var4) < 0.05F ? (float)var5 : var4;
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "jv.ay(" + ')');
      }
   }

   public void ao(nm var1, String var2, boolean var3) {
      if (!this.an) {
         this.af = false;
         this.an = true;
         System.nanoTime();
         int var4 = var1.cy(kq.af.ab, -411765045);
         int var5 = var1.cx(var4, var2, (short)8192);
         sg var6 = new sg(var1.cb(kq.af.ab, var2, 1648560407));
         sg var7 = new sg(var1.cb(kq.an.ab, var2, 1648560407));
         System.nanoTime();
         System.nanoTime();
         this.aw = new kk();

         try {
            this.aw.cl(var6, var7, var5, var3, (byte)23);
         } catch (IllegalStateException var16) {
            return;
         }

         this.aw.ar((byte)112);
         this.aw.am(-2019541929);
         this.aw.as(-151833963);
         this.ao = this.aw.ai(16748608) * -1335619264;
         this.ax = this.aw.ah(899648583) * 2026999912;
         this.ai = (this.aw.ag(-839370116) - this.aw.ai(16748608) + 1) * -295850215;
         this.ag = (this.aw.av(-1861025582) - this.aw.ah(1774762854) + 1) * -935980224;
         int var8 = this.aw.ag(-789256894) - this.aw.ai(16748608) + 1;
         int var9 = this.aw.av(-1813904226) - this.aw.ah(907879458) + 1;
         System.nanoTime();
         System.nanoTime();
         pr.aw(-2011620588);
         this.ab = new jr[var8][var9];
         Iterator var10 = this.aw.ax.iterator();

         while(var10.hasNext()) {
            jm var11 = (jm)var10.next();
            int var12 = var11.aq * -1159667627;
            int var13 = var11.al * -1674687277;
            int var14 = var12 - this.aw.ai(16748608);
            int var15 = var13 - this.aw.ah(-345603282);
            this.ab[var14][var15] = new jr(var12, var13, this.aw.ao(-2083933576), this.ay);
            this.ab[var14][var15].au(var11, this.aw.ag, 55339771);
         }

         for(int var17 = 0; var17 < var8; ++var17) {
            for(int var19 = 0; var19 < var9; ++var19) {
               if (this.ab[var17][var19] == null) {
                  this.ab[var17][var19] = new jr(this.aw.ai(16748608) + var17, this.aw.ah(1771641174) + var19, this.aw.ao(-2070281377), this.ay);
                  this.ab[var17][var19].ab(this.aw.ai, this.aw.ag, -1808928227);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if (var1.cv(kq.aw.ab, var2, -1313069490)) {
            byte[] var18 = var1.cb(kq.aw.ab, var2, 1648560407);
            this.ac = mk.af(var18, -602730867);
         }

         System.nanoTime();
         var1.cf(2146252837);
         var1.cg(1903798827);
         this.af = true;
      }
   }

   ju be(int var1, int var2, int var3, int var4) {
      ju var5 = new ju(this);
      int var6 = var1 + this.ao * 1525088909;
      int var7 = var2 + this.ax * -151833963;
      int var8 = this.ao * 1525088909 + var3;
      int var9 = this.ax * -151833963 + var4;
      int var10 = var6 / 64;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      var5.af = (var12 - var10 + 1) * 1584683713;
      var5.an = 227686793 * (var13 - var11 + 1);
      var5.aw = (var10 - this.aw.ai(16748608)) * 507320219;
      var5.ac = (var11 - this.aw.ah(2074311529)) * -1727465605;
      if (var5.aw * -1346472301 < 0) {
         var5.af += 685970131 * var5.aw;
         var5.aw = 0;
      }

      if (var5.aw * -1346472301 > this.ab.length - -1083493055 * var5.af) {
         var5.af = 1584683713 * (this.ab.length - var5.aw * -1346472301);
      }

      if (var5.ac * 844386227 < 0) {
         var5.an += 1072923083 * var5.ac;
         var5.ac = 0;
      }

      if (var5.ac * 844386227 > this.ab[0].length - var5.an * 856820921) {
         var5.an = 227686793 * (this.ab[0].length - 844386227 * var5.ac);
      }

      var5.af = Math.min(-1083493055 * var5.af, this.ab.length) * 1584683713;
      var5.an = Math.min(var5.an * 856820921, this.ab[0].length) * 227686793;
      return var5;
   }

   public final void ai() {
      this.au = null;
   }

   void bg() {
      if (this.au == null) {
         this.au = new HashMap();
      }

      this.au.clear();

      for(int var1 = 0; var1 < this.ab.length; ++var1) {
         for(int var2 = 0; var2 < this.ab[var1].length; ++var2) {
            List var3 = this.ab[var1][var2].bd((byte)82);
            Iterator var4 = var3.iterator();

            while(var4.hasNext()) {
               kg var5 = (kg)var4.next();
               if (var5.as(1510001963)) {
                  int var6 = var5.an(-110941176);
                  if (!this.au.containsKey(var6)) {
                     LinkedList var7 = new LinkedList();
                     var7.add(var5);
                     this.au.put(var6, var7);
                  } else {
                     List var8 = (List)this.au.get(var6);
                     var8.add(var5);
                  }
               }
            }
         }
      }

   }

   public HashMap bn() {
      this.aa((byte)-63);
      return this.au;
   }

   public final void av() {
      this.au = null;
   }

   public final void ar(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var9 = th.ad;
      int var10 = th.ae;
      int var11 = th.ap;
      float[] var12 = th.by;
      int[] var13 = new int[4];
      th.el(var13);
      ju var14 = this.aq(var1, var2, var3, var4, -1355662239);
      float var15 = this.ay(var7 - var5, var3 - var1, -1952934455);
      int var16 = (int)Math.ceil((double)var15);
      this.ah = var16 * 1717142051;
      if (!this.aq.containsKey(var16)) {
         kj var17 = new kj(var16);
         var17.ac(-2114807120);
         this.aq.put(var16, var17);
      }

      int var24 = var14.af * 1286773463 + -1346472301 * var14.aw - 1;
      int var18 = 844386227 * var14.ac + -38208678 * var14.an - 1;

      int var19;
      int var20;
      for(var19 = var14.aw * -1346472301; var19 <= var24; ++var19) {
         for(var20 = 1770975042 * var14.ac; var20 <= var18; ++var20) {
            this.ab[var19][var20].ax(var16, (kj)this.aq.get(var16), this.al, this.at, this.aa, -1844496367);
         }
      }

      an.ay(var9, var10, var11, var12, 580310026);
      th.en(var13);
      var19 = (int)(64.0F * var15);
      var20 = -1528846414 * this.ao + var1;
      int var21 = this.ax * 2043615840 + var2;

      for(int var22 = var14.aw * 1751694455; var22 < -1346472301 * var14.aw + var14.af * 820904947; ++var22) {
         for(int var23 = var14.ac * -1766904777; var23 < var14.an * 856820921 + 844386227 * var14.ac; ++var23) {
            this.ab[var22][var23].ac(var5 + (2069843925 * this.ab[var22][var23].ab - var20) * var19 / 64, var8 - (64 + (-1342988608 * this.ab[var22][var23].aq - var21)) * var19 / 64, var19, (byte)35);
         }
      }

   }

   public final void ag() {
      this.au = null;
   }

   public final void as(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var9 = th.ad;
      int var10 = th.ae;
      int var11 = th.ap;
      float[] var12 = th.by;
      int[] var13 = new int[4];
      th.el(var13);
      ju var14 = this.aq(var1, var2, var3, var4, -882677737);
      float var15 = this.ay(var7 - var5, var3 - var1, 745037243);
      int var16 = (int)Math.ceil((double)var15);
      this.ah = var16 * -371925812;
      if (!this.aq.containsKey(var16)) {
         kj var17 = new kj(var16);
         var17.ac(-1084423007);
         this.aq.put(var16, var17);
      }

      int var24 = var14.af * -1083493055 + -1346472301 * var14.aw - 1;
      int var18 = 844386227 * var14.ac + 1483261747 * var14.an - 1;

      int var19;
      int var20;
      for(var19 = var14.aw * -1346472301; var19 <= var24; ++var19) {
         for(var20 = 844386227 * var14.ac; var20 <= var18; ++var20) {
            this.ab[var19][var20].ax(var16, (kj)this.aq.get(var16), this.al, this.at, this.aa, -891872984);
         }
      }

      an.ay(var9, var10, var11, var12, 580310026);
      th.en(var13);
      var19 = (int)(64.0F * var15);
      var20 = -600546818 * this.ao + var1;
      int var21 = this.ax * 1211711839 + var2;

      for(int var22 = var14.aw * -1265489426; var22 < -1346472301 * var14.aw + var14.af * -1083493055; ++var22) {
         for(int var23 = var14.ac * -1497882299; var23 < var14.an * 856820921 + 37246554 * var14.ac; ++var23) {
            this.ab[var22][var23].ac(var5 + (718180085 * this.ab[var22][var23].ab - var20) * var19 / 64, var8 - (2074112908 + (706597005 * this.ab[var22][var23].aq - var21)) * var19 / 64, var19, (byte)79);
         }
      }

   }

   public final void aj(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
      ju var14 = this.aq(var1, var2, var3, var4, 1649935410);
      float var15 = this.ay(var7 - var5, var3 - var1, -951491064);
      int var16 = (int)(var15 * 64.0F);
      int var17 = var1 + this.ao * 1525088909;
      int var18 = var2 + -151833963 * this.ax;

      int var19;
      int var20;
      for(var19 = -1346472301 * var14.aw; var19 < -1083493055 * var14.af + var14.aw * -1346472301; ++var19) {
         for(var20 = 844386227 * var14.ac; var20 < var14.ac * 844386227 + var14.an * 856820921; ++var20) {
            if (var13) {
               this.ab[var19][var20].at(-1835891705);
            }

            this.ab[var19][var20].ai(var5 + (1598848320 * this.ab[var19][var20].ab - var17) * var16 / 64, var8 - (-1342988608 * this.ab[var19][var20].aq - var18 + 64) * var16 / 64, var16, var9, (byte)-89);
         }
      }

      if (var10 != null && var11 > 0) {
         for(var19 = -1346472301 * var14.aw; var19 < -1346472301 * var14.aw + -1083493055 * var14.af; ++var19) {
            for(var20 = var14.ac * 844386227; var20 < var14.an * 856820921 + 844386227 * var14.ac; ++var20) {
               this.ab[var19][var20].ag(var10, var11, var12, -2062529298);
            }
         }
      }

   }

   public final void ak(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
      ju var14 = this.aq(var1, var2, var3, var4, 559315025);
      float var15 = this.ay(var7 - var5, var3 - var1, 17619858);
      int var16 = (int)(var15 * 64.0F);
      int var17 = var1 + this.ao * 1525088909;
      int var18 = var2 + -1994689621 * this.ax;

      int var19;
      int var20;
      for(var19 = 738960122 * var14.aw; var19 < -1083493055 * var14.af + var14.aw * -1346472301; ++var19) {
         for(var20 = 844386227 * var14.ac; var20 < var14.ac * 844386227 + var14.an * 700823188; ++var20) {
            if (var13) {
               this.ab[var19][var20].at(-1928585875);
            }

            this.ab[var19][var20].ai(var5 + (1598848320 * this.ab[var19][var20].ab - var17) * var16 / 64, var8 - (-1675580528 * this.ab[var19][var20].aq - var18 + 64) * var16 / 64, var16, var9, (byte)-66);
         }
      }

      if (var10 != null && var11 > 0) {
         for(var19 = -1346472301 * var14.aw; var19 < -1346472301 * var14.aw + -104984323 * var14.af; ++var19) {
            for(var20 = var14.ac * -1222263255; var20 < var14.an * 856820921 + -1185347058 * var14.ac; ++var20) {
               this.ab[var19][var20].ag(var10, var11, var12, -2123892067);
            }
         }
      }

   }

   public void az(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (null != this.ac) {
         this.ac.ag(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (this.au == null) {
               this.aa((byte)18);
            }

            Iterator var8 = var5.iterator();

            while(true) {
               List var10;
               do {
                  if (!var8.hasNext()) {
                     return;
                  }

                  int var9 = (Integer)var8.next();
                  var10 = (List)this.au.get(var9);
               } while(null == var10);

               Iterator var11 = var10.iterator();

               while(var11.hasNext()) {
                  kg var12 = (kg)var11.next();
                  int var13 = (-96298701 * var12.aq.an - this.ao * 1525088909) * var3 / (335565313 * this.ai);
                  int var14 = var4 - var4 * (var12.aq.aw * -2105445199 - this.ax * -151833963) / (2138972293 * this.ag);
                  th.ed(var13 + var1, var14 + var2, 2, 16776960, 256);
               }
            }
         }
      }
   }

   public void ad(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (null != this.ac) {
         this.ac.ag(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (this.au == null) {
               this.aa((byte)16);
            }

            Iterator var8 = var5.iterator();

            while(true) {
               List var10;
               do {
                  if (!var8.hasNext()) {
                     return;
                  }

                  int var9 = (Integer)var8.next();
                  var10 = (List)this.au.get(var9);
               } while(null == var10);

               Iterator var11 = var10.iterator();

               while(var11.hasNext()) {
                  kg var12 = (kg)var11.next();
                  int var13 = (-96298701 * var12.aq.an - this.ao * 1525088909) * var3 / (335565313 * this.ai);
                  int var14 = var4 - var4 * (var12.aq.aw * -2105445199 - this.ax * -151833963) / (2138972293 * this.ag);
                  th.ed(var13 + var1, var14 + var2, 2, 16776960, 256);
               }
            }
         }
      }
   }

   public void ae(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (null != this.ac) {
         this.ac.ag(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (this.au == null) {
               this.aa((byte)39);
            }

            Iterator var8 = var5.iterator();

            while(true) {
               List var10;
               do {
                  if (!var8.hasNext()) {
                     return;
                  }

                  int var9 = (Integer)var8.next();
                  var10 = (List)this.au.get(var9);
               } while(null == var10);

               Iterator var11 = var10.iterator();

               while(var11.hasNext()) {
                  kg var12 = (kg)var11.next();
                  int var13 = (-232227256 * var12.aq.an - this.ao * 1525088909) * var3 / (-2017784329 * this.ai);
                  int var14 = var4 - var4 * (var12.aq.aw * -237056951 - this.ax * 99509396) / (2138972293 * this.ag);
                  th.ed(var13 + var1, var14 + var2, 2, -1107625642, 1708767397);
               }
            }
         }
      }
   }

   public void ap(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (null != this.ac) {
         this.ac.ag(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (this.au == null) {
               this.aa((byte)-15);
            }

            Iterator var8 = var5.iterator();

            while(true) {
               List var10;
               do {
                  if (!var8.hasNext()) {
                     return;
                  }

                  int var9 = (Integer)var8.next();
                  var10 = (List)this.au.get(var9);
               } while(null == var10);

               Iterator var11 = var10.iterator();

               while(var11.hasNext()) {
                  kg var12 = (kg)var11.next();
                  int var13 = (-96298701 * var12.aq.an - this.ao * 1525088909) * var3 / (335565313 * this.ai);
                  int var14 = var4 - var4 * (var12.aq.aw * -2105445199 - this.ax * -151833963) / (2138972293 * this.ag);
                  th.ed(var13 + var1, var14 + var2, 2, 16776960, 256);
               }
            }
         }
      }
   }

   public List by(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var11 = new LinkedList();
      if (!this.af) {
         return var11;
      } else {
         ju var12 = this.aq(var1, var2, var3, var4, -1488977797);
         float var13 = this.ay(var7, var3 - var1, -47211836);
         int var14 = (int)(var13 * 64.0F);
         int var15 = var1 + -585340977 * this.ao;
         int var16 = var2 + -151833963 * this.ax;

         for(int var17 = 455856026 * var12.aw; var17 < 2090620896 * var12.af + -1346472301 * var12.aw; ++var17) {
            for(int var18 = var12.ac * 844386227; var18 < 856820921 * var12.an + var12.ac * -445895706; ++var18) {
               List var19 = this.ab[var17][var18].bm(var14 * (1649781547 * this.ab[var17][var18].ab - var15) / -656963090 + var5, var8 + var6 - (1027492528 * this.ab[var17][var18].aq - var16 + -578247865) * var14 / 64, var14, var9, var10, (byte)-26);
               if (!var19.isEmpty()) {
                  var11.addAll(var19);
               }
            }
         }

         return var11;
      }
   }

   public void ax(nm var1, String var2, boolean var3) {
      if (!this.an) {
         this.af = false;
         this.an = true;
         System.nanoTime();
         int var4 = var1.cy(kq.af.ab, 1326656171);
         int var5 = var1.cx(var4, var2, (short)8192);
         sg var6 = new sg(var1.cb(kq.af.ab, var2, 1648560407));
         sg var7 = new sg(var1.cb(kq.an.ab, var2, 1648560407));
         System.nanoTime();
         System.nanoTime();
         this.aw = new kk();

         try {
            this.aw.cl(var6, var7, var5, var3, (byte)35);
         } catch (IllegalStateException var16) {
            return;
         }

         this.aw.ar((byte)127);
         this.aw.am(-2019541929);
         this.aw.as(-151833963);
         this.ao = this.aw.ai(16748608) * -1335619264;
         this.ax = this.aw.ah(-1526726761) * 1012238118;
         this.ai = (this.aw.ag(-358885076) - this.aw.ai(16748608) + 1) * -631636316;
         this.ag = (this.aw.av(-1825445135) - this.aw.ah(166019274) + 1) * -935980224;
         int var8 = this.aw.ag(262206892) - this.aw.ai(16748608) + 1;
         int var9 = this.aw.av(1154476621) - this.aw.ah(-1842055220) + 1;
         System.nanoTime();
         System.nanoTime();
         pr.aw(-1888807393);
         this.ab = new jr[var8][var9];
         Iterator var10 = this.aw.ax.iterator();

         while(var10.hasNext()) {
            jm var11 = (jm)var10.next();
            int var12 = var11.aq * 189209236;
            int var13 = var11.al * -407031379;
            int var14 = var12 - this.aw.ai(16748608);
            int var15 = var13 - this.aw.ah(1804310120);
            this.ab[var14][var15] = new jr(var12, var13, this.aw.ao(-2085820998), this.ay);
            this.ab[var14][var15].au(var11, this.aw.ag, 1593386353);
         }

         for(int var17 = 0; var17 < var8; ++var17) {
            for(int var19 = 0; var19 < var9; ++var19) {
               if (this.ab[var17][var19] == null) {
                  this.ab[var17][var19] = new jr(this.aw.ai(16748608) + var17, this.aw.ah(-74357237) + var19, this.aw.ao(-2084122687), this.ay);
                  this.ab[var17][var19].ab(this.aw.ai, this.aw.ag, 1311466640);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if (var1.cv(kq.aw.ab, var2, -1313069490)) {
            byte[] var18 = var1.cb(kq.aw.ab, var2, 1648560407);
            this.ac = mk.af(var18, -1347299615);
         }

         System.nanoTime();
         var1.cf(2146990695);
         var1.cg(1903798827);
         this.af = true;
      }
   }

   public boolean bz() {
      return this.af;
   }

   public final void ah() {
      this.au = null;
   }

   ju bk(int var1, int var2, int var3, int var4) {
      ju var5 = new ju(this);
      int var6 = var1 + this.ao * -1481417322;
      int var7 = var2 + this.ax * 1725044784;
      int var8 = this.ao * -1899372874 + var3;
      int var9 = this.ax * -151833963 + var4;
      int var10 = var6 / 64;
      int var11 = var7 / 1682463402;
      int var12 = var8 / -1769885541;
      int var13 = var9 / 64;
      var5.af = (var12 - var10 + 1) * 631684420;
      var5.an = 227686793 * (var13 - var11 + 1);
      var5.aw = (var10 - this.aw.ai(16748608)) * -422205939;
      var5.ac = (var11 - this.aw.ah(-402217017)) * 1195596936;
      if (var5.aw * -1346472301 < 0) {
         var5.af += -2086255145 * var5.aw;
         var5.aw = 0;
      }

      if (var5.aw * -1346472301 > this.ab.length - 2081776173 * var5.af) {
         var5.af = -480439700 * (this.ab.length - var5.aw * -740327581);
      }

      if (var5.ac * 844386227 < 0) {
         var5.an += -2146504867 * var5.ac;
         var5.ac = 0;
      }

      if (var5.ac * 844386227 > this.ab[0].length - var5.an * 651141980) {
         var5.an = 227686793 * (this.ab[0].length - 844386227 * var5.ac);
      }

      var5.af = Math.min(-1083493055 * var5.af, this.ab.length) * -1103004293;
      var5.an = Math.min(var5.an * 856820921, this.ab[0].length) * 1549584965;
      return var5;
   }

   ju bi(int var1, int var2, int var3, int var4) {
      ju var5 = new ju(this);
      int var6 = var1 + this.ao * 1525088909;
      int var7 = var2 + this.ax * -151833963;
      int var8 = this.ao * 1525088909 + var3;
      int var9 = this.ax * -151833963 + var4;
      int var10 = var6 / 64;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      var5.af = (var12 - var10 + 1) * 1584683713;
      var5.an = 227686793 * (var13 - var11 + 1);
      var5.aw = (var10 - this.aw.ai(16748608)) * 507320219;
      var5.ac = (var11 - this.aw.ah(128419952)) * -1727465605;
      if (var5.aw * -1346472301 < 0) {
         var5.af += 685970131 * var5.aw;
         var5.aw = 0;
      }

      if (var5.aw * -1346472301 > this.ab.length - -1083493055 * var5.af) {
         var5.af = 1584683713 * (this.ab.length - var5.aw * -1346472301);
      }

      if (var5.ac * 844386227 < 0) {
         var5.an += 1072923083 * var5.ac;
         var5.ac = 0;
      }

      if (var5.ac * 844386227 > this.ab[0].length - var5.an * 856820921) {
         var5.an = 227686793 * (this.ab[0].length - 844386227 * var5.ac);
      }

      var5.af = Math.min(-1083493055 * var5.af, this.ab.length) * 1584683713;
      var5.an = Math.min(var5.an * 856820921, this.ab[0].length) * 227686793;
      return var5;
   }

   ju bo(int var1, int var2, int var3, int var4) {
      ju var5 = new ju(this);
      int var6 = var1 + this.ao * 1525088909;
      int var7 = var2 + this.ax * -151833963;
      int var8 = this.ao * 1525088909 + var3;
      int var9 = this.ax * -151833963 + var4;
      int var10 = var6 / 64;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      var5.af = (var12 - var10 + 1) * 1584683713;
      var5.an = 227686793 * (var13 - var11 + 1);
      var5.aw = (var10 - this.aw.ai(16748608)) * 507320219;
      var5.ac = (var11 - this.aw.ah(1954680132)) * -1727465605;
      if (var5.aw * -1346472301 < 0) {
         var5.af += 685970131 * var5.aw;
         var5.aw = 0;
      }

      if (var5.aw * -1346472301 > this.ab.length - -1083493055 * var5.af) {
         var5.af = 1584683713 * (this.ab.length - var5.aw * -1346472301);
      }

      if (var5.ac * 844386227 < 0) {
         var5.an += 1072923083 * var5.ac;
         var5.ac = 0;
      }

      if (var5.ac * 844386227 > this.ab[0].length - var5.an * 856820921) {
         var5.an = 227686793 * (this.ab[0].length - 844386227 * var5.ac);
      }

      var5.af = Math.min(-1083493055 * var5.af, this.ab.length) * 1584683713;
      var5.an = Math.min(var5.an * 856820921, this.ab[0].length) * 227686793;
      return var5;
   }

   public boolean bt() {
      return this.af;
   }

   public boolean bm() {
      return this.af;
   }

   public List ab(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      try {
         LinkedList var12 = new LinkedList();
         if (!this.af) {
            if (var11 == -1220821549) {
               throw new IllegalStateException();
            } else {
               return var12;
            }
         } else {
            ju var13 = this.aq(var1, var2, var3, var4, 751450291);
            float var14 = this.ay(var7, var3 - var1, 1104410263);
            int var15 = (int)(var14 * 64.0F);
            int var16 = var1 + 1525088909 * this.ao;
            int var17 = var2 + -151833963 * this.ax;

            for(int var18 = -1346472301 * var13.aw; var18 < -1083493055 * var13.af + -1346472301 * var13.aw; ++var18) {
               for(int var19 = var13.ac * 844386227; var19 < 856820921 * var13.an + var13.ac * 844386227; ++var19) {
                  if (var11 == -1220821549) {
                     throw new IllegalStateException();
                  }

                  List var20 = this.ab[var18][var19].bm(var15 * (1598848320 * this.ab[var18][var19].ab - var16) / 64 + var5, var8 + var6 - (-1342988608 * this.ab[var18][var19].aq - var17 + 64) * var15 / 64, var15, var9, var10, (byte)-100);
                  if (!var20.isEmpty()) {
                     var12.addAll(var20);
                  }
               }
            }

            return var12;
         }
      } catch (RuntimeException var21) {
         throw db.an(var21, "jv.ab(" + ')');
      }
   }

   public jv(tc[] var1, HashMap var2, nm var3, nm var4) {
      try {
         super();
         this.af = false;
         this.an = false;
         this.aq = new HashMap();
         this.ah = 0;
         this.al = var1;
         this.ay = var2;
         this.at = var3;
         this.aa = var4;
      } catch (RuntimeException var5) {
         throw db.an(var5, "jv.<init>(" + ')');
      }
   }

   public List bb(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var11 = new LinkedList();
      if (!this.af) {
         return var11;
      } else {
         ju var12 = this.aq(var1, var2, var3, var4, 1179270336);
         float var13 = this.ay(var7, var3 - var1, 870184949);
         int var14 = (int)(var13 * 64.0F);
         int var15 = var1 + 1525088909 * this.ao;
         int var16 = var2 + -151833963 * this.ax;

         for(int var17 = -1346472301 * var12.aw; var17 < -1083493055 * var12.af + -1346472301 * var12.aw; ++var17) {
            for(int var18 = var12.ac * 844386227; var18 < 856820921 * var12.an + var12.ac * 844386227; ++var18) {
               List var19 = this.ab[var17][var18].bm(var14 * (1598848320 * this.ab[var17][var18].ab - var15) / 64 + var5, var8 + var6 - (-1342988608 * this.ab[var17][var18].aq - var16 + 64) * var14 / 64, var14, var9, var10, (byte)-110);
               if (!var19.isEmpty()) {
                  var11.addAll(var19);
               }
            }
         }

         return var11;
      }
   }

   public boolean bd() {
      return this.af;
   }

   public void au(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7, int var8) {
      try {
         if (null == this.ac) {
            if (var8 >= -1222491879) {
               throw new IllegalStateException();
            }
         } else {
            this.ac.ag(var1, var2, var3, var4);
            if (var6 > 0) {
               if (var8 >= -1222491879) {
                  throw new IllegalStateException();
               }

               if (var6 % var7 < var7 / 2) {
                  if (this.au == null) {
                     this.aa((byte)-76);
                  }

                  Iterator var9 = var5.iterator();

                  while(true) {
                     List var11;
                     do {
                        if (!var9.hasNext()) {
                           return;
                        }

                        if (var8 >= -1222491879) {
                           return;
                        }

                        int var10 = (Integer)var9.next();
                        var11 = (List)this.au.get(var10);
                     } while(null == var11);

                     Iterator var12 = var11.iterator();

                     while(var12.hasNext()) {
                        kg var13 = (kg)var12.next();
                        int var14 = (-96298701 * var13.aq.an - this.ao * 1525088909) * var3 / (335565313 * this.ai);
                        int var15 = var4 - var4 * (var13.aq.aw * -2105445199 - this.ax * -151833963) / (2138972293 * this.ag);
                        th.ed(var14 + var1, var15 + var2, 2, 16776960, 256);
                     }
                  }
               }

               if (var8 >= -1222491879) {
                  throw new IllegalStateException();
               }
            }

         }
      } catch (RuntimeException var16) {
         throw db.an(var16, "jv.au(" + ')');
      }
   }

   void br() {
      if (this.au == null) {
         this.au = new HashMap();
      }

      this.au.clear();

      for(int var1 = 0; var1 < this.ab.length; ++var1) {
         for(int var2 = 0; var2 < this.ab[var1].length; ++var2) {
            List var3 = this.ab[var1][var2].bd((byte)107);
            Iterator var4 = var3.iterator();

            while(var4.hasNext()) {
               kg var5 = (kg)var4.next();
               if (var5.as(2013499781)) {
                  int var6 = var5.an(-1995695961);
                  if (!this.au.containsKey(var6)) {
                     LinkedList var7 = new LinkedList();
                     var7.add(var5);
                     this.au.put(var6, var7);
                  } else {
                     List var8 = (List)this.au.get(var6);
                     var8.add(var5);
                  }
               }
            }
         }
      }

   }

   public HashMap bj() {
      this.aa((byte)-29);
      return this.au;
   }

   float bu(int var1, int var2) {
      float var3 = (float)var1 / (float)var2;
      if (var3 > 8.0F) {
         return 8.0F;
      } else if (var3 < 1.0F) {
         return 1.0F;
      } else {
         int var4 = Math.round(var3);
         return Math.abs((float)var4 - var3) < 0.05F ? (float)var4 : var3;
      }
   }
}
