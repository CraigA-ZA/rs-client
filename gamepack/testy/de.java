import accessors.RSActor;

public abstract class de extends iv implements RSActor {
   int bj;
   int bo;
   int bt;
   boolean an;
   int bm;
   int[] cl;
   boolean co;
   int bz;
   boolean ci;
   int bs;
   int br;
   int bg;
   String bw;
   int bf;
   int bq;
   int ba;
   int bv;
   int bl;
   int bu;
   int bc;
   int dp;
   int bh;
   int bd;
   int cr;
   int cs;
   int cc;
   int[] cf;
   byte cu;
   int[] ck;
   int[] cq;
   int bn;
   int dd;
   int dh;
   oi cg;
   int bx;
   boolean cy;
   int cx;
   int[] dy;
   int cb;
   int[] ds;
   boolean ce;
   int cw;
   int cj;
   int ch;
   byte du;
   int cp;
   int cd;
   int dm;
   int dw;
   ro dc;
   int cz;
   int di;
   int dr;
   int dl;
   int dx;
   int dt;
   int dv;
   int dz;
   int dg;
   int de;
   int bp;
   int cv;
   iu[] da;
   byte db;
   byte df;
   int ct;
   int do;
   int dj;
   int[] cm;
   int dn;
   int cn;
   int dk;
   byte dq;
   int ep;
   int eo;
   int eq;
   public static final String kw = "There was a problem updating your DOB.";

   final void co(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         boolean var8 = true;
         boolean var9 = true;

         int var10;
         for(var10 = 0; var10 < 4; ++var10) {
            if (var7 != 1919870398) {
               throw new IllegalStateException();
            }

            if (this.cm[var10] > var5) {
               if (var7 != 1919870398) {
                  return;
               }

               var8 = false;
            } else {
               var9 = false;
            }
         }

         var10 = -1;
         int var11 = -1;
         int var12 = 0;
         if (var1 >= 0) {
            if (var7 != 1919870398) {
               throw new IllegalStateException();
            }

            hb var13 = ew.af(var1, (byte)4);
            var11 = 1897913521 * var13.az;
            var12 = 292771999 * var13.ai;
         }

         int var16;
         if (var9) {
            if (var7 != 1919870398) {
               return;
            }

            if (var11 == -1) {
               return;
            }

            var10 = 0;
            var16 = 0;
            if (0 == var11) {
               var16 = this.cm[0];
            } else if (1 == var11) {
               if (var7 != 1919870398) {
                  return;
               }

               var16 = this.cq[0];
            }

            for(int var14 = 1; var14 < 4; ++var14) {
               if (var7 != 1919870398) {
                  throw new IllegalStateException();
               }

               if (0 == var11) {
                  if (var7 != 1919870398) {
                     throw new IllegalStateException();
                  }

                  if (this.cm[var14] < var16) {
                     var10 = var14;
                     var16 = this.cm[var14];
                  }
               } else if (1 == var11) {
                  if (var7 != 1919870398) {
                     return;
                  }

                  if (this.cq[var14] < var16) {
                     var10 = var14;
                     var16 = this.cq[var14];
                  }
               }
            }

            if (1 == var11) {
               if (var7 != 1919870398) {
                  return;
               }

               if (var16 >= var2) {
                  if (var7 != 1919870398) {
                     return;
                  }

                  return;
               }
            }
         } else {
            if (var8) {
               this.cu = 0;
            }

            for(var16 = 0; var16 < 4; ++var16) {
               if (var7 != 1919870398) {
                  throw new IllegalStateException();
               }

               byte var17 = this.cu;
               this.cu = (byte)((1 + this.cu) % 4);
               if (this.cm[var17] <= var5) {
                  if (var7 != 1919870398) {
                     throw new IllegalStateException();
                  }

                  var10 = var17;
                  break;
               }
            }
         }

         if (var10 < 0) {
            if (var7 != 1919870398) {
               throw new IllegalStateException();
            }
         } else {
            this.ck[var10] = var1;
            this.cq[var10] = var2;
            this.cf[var10] = var3;
            this.cl[var10] = var4;
            this.cm[var10] = var5 + var12 + var6;
         }
      } catch (RuntimeException var15) {
         throw db.an(var15, "de.co(" + ')');
      }
   }

   void cd(int var1) {
      try {
         this.co = false;
         this.cx = 1409690365;
         this.cv = 1213206377;
         this.cb = -1388623137;
      } catch (RuntimeException var2) {
         throw db.an(var2, "de.cd(" + ')');
      }
   }

   boolean as(int var1) {
      try {
         return false;
      } catch (RuntimeException var2) {
         throw db.an(var2, "de.as(" + ')');
      }
   }

   final void dm() {
      this.dn = 0;
      this.eo = 0;
   }

   static cq ac(int var0, int var1, int var2) {
      try {
         cp var3 = (cp)eo.af.get(var0);
         return var3.an(var1, -2100835042);
      } catch (RuntimeException var4) {
         throw db.an(var4, "de.ac(" + ')');
      }
   }

   it cp(it var1, byte var2) {
      try {
         if (-500494421 * this.do == 0) {
            if (var2 <= 104) {
               throw new IllegalStateException();
            } else {
               return var1;
            }
         } else {
            rj var3 = new rj(this.dc);
            int var4 = var1.al;
            int var5 = var1.ao;
            int var6 = var1.ad;
            byte var7 = var1.az;

            for(tt var8 = (tt)var3.an(); var8 != null; var8 = (tt)var3.next()) {
               if (var8.an * 971664459 == -1) {
                  if (var2 <= 104) {
                     throw new IllegalStateException();
                  }
               } else {
                  it var9 = dc.an(-1171575623 * var8.af, 499145783).ab(767740458);
                  if (null == var9) {
                     if (var2 <= 104) {
                        throw new IllegalStateException();
                     }
                  } else {
                     var4 += var9.al;
                     var5 += var9.ao;
                     var6 += var9.ad;
                  }
               }
            }

            it var12 = new it(var4, var5, var6, var7);
            var12.ac(var1);

            for(tt var13 = (tt)var3.an(); null != var13; var13 = (tt)var3.next()) {
               if (var2 <= 104) {
                  throw new IllegalStateException();
               }

               if (-1 == var13.an * 971664459) {
                  if (var2 <= 104) {
                     throw new IllegalStateException();
                  }
               } else {
                  it var10 = dc.an(var13.af * -1171575623, 2052934649).au(971664459 * var13.an, -2067893122);
                  if (null != var10) {
                     var10.be(0, -(-790772793 * var13.au), 0);
                     var12.ac(var10);
                  }
               }
            }

            return var12;
         }
      } catch (RuntimeException var11) {
         throw db.an(var11, "de.cp(" + ')');
      }
   }

   void cj(int var1, int var2, int var3, int var4, int var5) {
      try {
         int var6 = var4 + client.ep * -1886224337;
         tt var7 = (tt)this.dc.af((long)var1);
         if (null != var7) {
            var7.ga();
            this.do -= -1822461181;
         }

         if (65535 != var2) {
            if (var5 <= -2058412227) {
               throw new IllegalStateException();
            }

            if (var2 != -1) {
               byte var8 = 0;
               if (var4 > 0) {
                  if (var5 <= -2058412227) {
                     throw new IllegalStateException();
                  }

                  var8 = -1;
               }

               this.dc.an(new tt(var2, var3, var6, var8), (long)var1);
               this.do += -1822461181;
               return;
            }

            if (var5 <= -2058412227) {
               return;
            }
         }

      } catch (RuntimeException var9) {
         throw db.an(var9, "de.cj(" + ')');
      }
   }

   ro ch(byte var1) {
      try {
         return this.dc;
      } catch (RuntimeException var2) {
         throw db.an(var2, "de.ch(" + ')');
      }
   }

   void ct(int var1) {
      try {
         rj var2 = new rj(this.dc);

         for(tt var3 = (tt)var2.an(); null != var3; var3 = (tt)var2.next()) {
            if (var1 >= -1723490434) {
               throw new IllegalStateException();
            }

            var3.ga();
         }

         this.do = 0;
      } catch (RuntimeException var4) {
         throw db.an(var4, "de.ct(" + ')');
      }
   }

   final void cz(int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      try {
         hm var9 = (hm)hm.aw.af((long)var1);
         hm var8;
         if (null != var9) {
            if (var7 <= 75) {
               return;
            }

            var8 = var9;
         } else {
            byte[] var10 = hm.af.bh(33, var1, (byte)-46);
            var9 = new hm();
            if (null != var10) {
               if (var7 <= 75) {
                  throw new IllegalStateException();
               }

               var9.af(new sg(var10), (byte)85);
            }

            hm.aw.aw(var9, (long)var1);
            var8 = var9;
         }

         var9 = var8;
         db var16 = null;
         db var11 = null;
         int var12 = var8.at * 1525821745;
         int var13 = 0;

         db var14;
         for(var14 = (db)this.cg.au(); var14 != null; var14 = (db)this.cg.aq()) {
            if (var7 <= 75) {
               throw new IllegalStateException();
            }

            ++var13;
            if (var14.aw.au * -431598869 == var9.au * -431598869) {
               if (var7 <= 75) {
                  throw new IllegalStateException();
               }

               var14.af(var4 + var2, var5, var6, var3, -869970014);
               return;
            }

            if (520914669 * var14.aw.al <= 520914669 * var9.al) {
               if (var7 <= 75) {
                  throw new IllegalStateException();
               }

               var16 = var14;
            }

            if (1525821745 * var14.aw.at > var12) {
               if (var7 <= 75) {
                  throw new IllegalStateException();
               }

               var11 = var14;
               var12 = 1525821745 * var14.aw.at;
            }
         }

         if (null == var11) {
            if (var7 <= 75) {
               throw new IllegalStateException();
            }

            if (var13 >= 4) {
               if (var7 <= 75) {
                  throw new IllegalStateException();
               }

               return;
            }
         }

         var14 = new db(var9);
         if (var16 == null) {
            if (var7 <= 75) {
               return;
            }

            this.cg.aw(var14);
         } else {
            oi.ac(var14, var16);
         }

         var14.af(var2 + var4, var5, var6, var3, -869970014);
         if (var13 >= 4) {
            if (var7 <= 75) {
               throw new IllegalStateException();
            }

            var11.ga();
         }

      } catch (RuntimeException var15) {
         throw db.an(var15, "de.cz(" + ')');
      }
   }

   it db(it var1) {
      if (-500494421 * this.do == 0) {
         return var1;
      } else {
         rj var2 = new rj(this.dc);
         int var3 = var1.al;
         int var4 = var1.ao;
         int var5 = var1.ad;
         byte var6 = var1.az;

         for(tt var7 = (tt)var2.an(); var7 != null; var7 = (tt)var2.next()) {
            if (var7.an * 971664459 != -1) {
               it var8 = dc.an(-1171575623 * var7.af, -813947732).ab(-1943393538);
               if (null != var8) {
                  var3 += var8.al;
                  var4 += var8.ao;
                  var5 += var8.ad;
               }
            }
         }

         it var10 = new it(var3, var4, var5, var6);
         var10.ac(var1);

         for(tt var11 = (tt)var2.an(); null != var11; var11 = (tt)var2.next()) {
            if (-1 != var11.an * 971664459) {
               it var9 = dc.an(var11.af * -1171575623, 409806383).au(971664459 * var11.an, -1621049162);
               if (null != var9) {
                  var9.be(0, -(-790772793 * var11.au), 0);
                  var10.ac(var9);
               }
            }
         }

         return var10;
      }
   }

   boolean cx() {
      return false;
   }

   boolean cv() {
      return false;
   }

   final void cw(int var1, int var2) {
      try {
         hm var4 = (hm)hm.aw.af((long)var1);
         hm var3;
         if (var4 != null) {
            if (var2 != 1269115179) {
               throw new IllegalStateException();
            }

            var3 = var4;
         } else {
            byte[] var5 = hm.af.bh(33, var1, (byte)-2);
            var4 = new hm();
            if (null != var5) {
               if (var2 != 1269115179) {
                  throw new IllegalStateException();
               }

               var4.af(new sg(var5), (byte)39);
            }

            hm.aw.aw(var4, (long)var1);
            var3 = var4;
         }

         var4 = var3;

         for(db var7 = (db)this.cg.au(); null != var7; var7 = (db)this.cg.aq()) {
            if (var4 == var7.aw) {
               if (var2 != 1269115179) {
                  throw new IllegalStateException();
               }

               var7.ga();
               return;
            }
         }

      } catch (RuntimeException var6) {
         throw db.an(var6, "de.cw(" + ')');
      }
   }

   final void dw() {
      this.dn = 0;
      this.eo = 0;
   }

   final void dc(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      boolean var8 = true;

      int var9;
      for(var9 = 0; var9 < 4; ++var9) {
         if (this.cm[var9] > var5) {
            var7 = false;
         } else {
            var8 = false;
         }
      }

      var9 = -1;
      int var10 = -1;
      int var11 = 0;
      if (var1 >= 0) {
         hb var12 = ew.af(var1, (byte)4);
         var10 = 1742391276 * var12.az;
         var11 = 292771999 * var12.ai;
      }

      int var14;
      if (var8) {
         if (var10 == -1) {
            return;
         }

         var9 = 0;
         var14 = 0;
         if (0 == var10) {
            var14 = this.cm[0];
         } else if (1 == var10) {
            var14 = this.cq[0];
         }

         for(int var13 = 1; var13 < 4; ++var13) {
            if (0 == var10) {
               if (this.cm[var13] < var14) {
                  var9 = var13;
                  var14 = this.cm[var13];
               }
            } else if (1 == var10 && this.cq[var13] < var14) {
               var9 = var13;
               var14 = this.cq[var13];
            }
         }

         if (1 == var10 && var14 >= var2) {
            return;
         }
      } else {
         if (var7) {
            this.cu = 0;
         }

         for(var14 = 0; var14 < 4; ++var14) {
            byte var15 = this.cu;
            this.cu = (byte)((1 + this.cu) % 4);
            if (this.cm[var15] <= var5) {
               var9 = var15;
               break;
            }
         }
      }

      if (var9 >= 0) {
         this.ck[var9] = var1;
         this.cq[var9] = var2;
         this.cf[var9] = var3;
         this.cl[var9] = var4;
         this.cm[var9] = var5 + var11 + var6;
      }
   }

   final void dl(int var1) {
      hm var3 = (hm)hm.aw.af((long)var1);
      hm var2;
      if (var3 != null) {
         var2 = var3;
      } else {
         byte[] var4 = hm.af.bh(33, var1, (byte)-54);
         var3 = new hm();
         if (null != var4) {
            var3.af(new sg(var4), (byte)48);
         }

         hm.aw.aw(var3, (long)var1);
         var2 = var3;
      }

      var3 = var2;

      for(db var5 = (db)this.cg.au(); null != var5; var5 = (db)this.cg.aq()) {
         if (var3 == var5.aw) {
            var5.ga();
            return;
         }
      }

   }

   final void di(int var1, int var2, int var3, int var4, int var5, int var6) {
      hm var8 = (hm)hm.aw.af((long)var1);
      hm var7;
      if (null != var8) {
         var7 = var8;
      } else {
         byte[] var9 = hm.af.bh(33, var1, (byte)-46);
         var8 = new hm();
         if (null != var9) {
            var8.af(new sg(var9), (byte)6);
         }

         hm.aw.aw(var8, (long)var1);
         var7 = var8;
      }

      var8 = var7;
      db var14 = null;
      db var10 = null;
      int var11 = var7.at * 1525821745;
      int var12 = 0;

      db var13;
      for(var13 = (db)this.cg.au(); var13 != null; var13 = (db)this.cg.aq()) {
         ++var12;
         if (var13.aw.au * -696374900 == var8.au * -431598869) {
            var13.af(var4 + var2, var5, var6, var3, -869970014);
            return;
         }

         if (520914669 * var13.aw.al <= -970443958 * var8.al) {
            var14 = var13;
         }

         if (1525821745 * var13.aw.at > var11) {
            var10 = var13;
            var11 = -737946232 * var13.aw.at;
         }
      }

      if (null != var10 || var12 < 4) {
         var13 = new db(var8);
         if (var14 == null) {
            this.cg.aw(var13);
         } else {
            oi.ac(var13, var14);
         }

         var13.af(var2 + var4, var5, var6, var3, -869970014);
         if (var12 >= 4) {
            var10.ga();
         }

      }
   }

   final void dr(int var1, int var2, int var3, int var4, int var5, int var6) {
      hm var8 = (hm)hm.aw.af((long)var1);
      hm var7;
      if (null != var8) {
         var7 = var8;
      } else {
         byte[] var9 = hm.af.bh(33, var1, (byte)-1);
         var8 = new hm();
         if (null != var9) {
            var8.af(new sg(var9), (byte)5);
         }

         hm.aw.aw(var8, (long)var1);
         var7 = var8;
      }

      var8 = var7;
      db var14 = null;
      db var10 = null;
      int var11 = var7.at * 1525821745;
      int var12 = 0;

      db var13;
      for(var13 = (db)this.cg.au(); var13 != null; var13 = (db)this.cg.aq()) {
         ++var12;
         if (var13.aw.au * -380549468 == var8.au * 552594223) {
            var13.af(var4 + var2, var5, var6, var3, -869970014);
            return;
         }

         if (-797036281 * var13.aw.al <= 1852898328 * var8.al) {
            var14 = var13;
         }

         if (1525821745 * var13.aw.at > var11) {
            var10 = var13;
            var11 = 1562385266 * var13.aw.at;
         }
      }

      if (null != var10 || var12 < 4) {
         var13 = new db(var8);
         if (var14 == null) {
            this.cg.aw(var13);
         } else {
            oi.ac(var13, var14);
         }

         var13.af(var2 + var4, var5, var6, var3, -869970014);
         if (var12 >= 4) {
            var10.ga();
         }

      }
   }

   final void cb(byte var1) {
      try {
         this.dn = 0;
         this.eo = 0;
      } catch (RuntimeException var2) {
         throw db.an(var2, "de.cb(" + ')');
      }
   }

   final void dk(int var1) {
      hm var3 = (hm)hm.aw.af((long)var1);
      hm var2;
      if (var3 != null) {
         var2 = var3;
      } else {
         byte[] var4 = hm.af.bh(-950529253, var1, (byte)-67);
         var3 = new hm();
         if (null != var4) {
            var3.af(new sg(var4), (byte)52);
         }

         hm.aw.aw(var3, (long)var1);
         var2 = var3;
      }

      var3 = var2;

      for(db var5 = (db)this.cg.au(); null != var5; var5 = (db)this.cg.aq()) {
         if (var3 == var5.aw) {
            var5.ga();
            return;
         }
      }

   }

   de() {
      try {
         super();
         this.an = false;
         this.bm = -1967111979;
         this.bt = -1196796229;
         this.bj = 767436785;
         this.bn = 603869663;
         this.bs = -1672510249;
         this.br = 1683505383;
         this.bg = -497469823;
         this.bu = -1927855919;
         this.bf = -140602839;
         this.bq = 1320156809;
         this.ba = -725472713;
         this.bv = 1530081757;
         this.bl = 1035736995;
         this.bp = 1110395975;
         this.bc = 2025717011;
         this.bh = 919918425;
         this.bw = null;
         this.ci = false;
         this.cs = -1924554444;
         this.cc = 0;
         this.cn = 0;
         this.cu = 0;
         this.ck = new int[4];
         this.cq = new int[4];
         this.cm = new int[4];
         this.cf = new int[4];
         this.cl = new int[4];
         this.cg = new oi();
         this.cr = -1052277865;
         this.cy = false;
         this.cx = 1409690365;
         this.cv = 1213206377;
         this.cb = -1388623137;
         this.cz = -327373721;
         this.cw = 0;
         this.cj = 0;
         this.ch = 0;
         this.ct = 1690721941;
         this.cp = 0;
         this.cd = 0;
         this.dm = 0;
         this.dw = 0;
         this.dc = new ro(4);
         this.do = 0;
         this.dg = 0;
         this.de = 233502456;
         this.dh = 887211183;
         this.dp = 368061749;
         this.dj = 0;
         this.dx = -1759588000;
         this.dn = 0;
         this.dy = new int[10];
         this.ds = new int[10];
         this.da = new iu[10];
         this.ep = 0;
         this.eo = 0;
         this.eq = -1392091407;
      } catch (RuntimeException var1) {
         throw db.an(var1, "de.<init>(" + ')');
      }
   }

   void dv(int var1, int var2, int var3, int var4) {
      int var5 = var4 + client.ep * -1886224337;
      tt var6 = (tt)this.dc.af((long)var1);
      if (null != var6) {
         var6.ga();
         this.do -= -1822461181;
      }

      if (65535 != var2 && var2 != -1) {
         byte var7 = 0;
         if (var4 > 0) {
            var7 = -1;
         }

         this.dc.an(new tt(var2, var3, var5, var7), (long)var1);
         this.do += -1822461181;
      }
   }

   void dz(int var1, int var2, int var3, int var4) {
      int var5 = var4 + client.ep * -1886224337;
      tt var6 = (tt)this.dc.af((long)var1);
      if (null != var6) {
         var6.ga();
         this.do -= 1287323085;
      }

      if (65535 != var2 && var2 != -1) {
         byte var7 = 0;
         if (var4 > 0) {
            var7 = -1;
         }

         this.dc.an(new tt(var2, var3, var5, var7), (long)var1);
         this.do += -2010255727;
      }
   }

   ro dg() {
      return this.dc;
   }

   ro dh() {
      return this.dc;
   }

   void dt(int var1, int var2, int var3, int var4) {
      int var5 = var4 + client.ep * -1886224337;
      tt var6 = (tt)this.dc.af((long)var1);
      if (null != var6) {
         var6.ga();
         this.do -= -1822461181;
      }

      if (65535 != var2 && var2 != -1) {
         byte var7 = 0;
         if (var4 > 0) {
            var7 = -1;
         }

         this.dc.an(new tt(var2, var3, var5, var7), (long)var1);
         this.do += -1822461181;
      }
   }

   void dp() {
      rj var1 = new rj(this.dc);

      for(tt var2 = (tt)var1.an(); null != var2; var2 = (tt)var1.next()) {
         var2.ga();
      }

      this.do = 0;
   }

   void du() {
      rj var1 = new rj(this.dc);

      for(tt var2 = (tt)var1.an(); null != var2; var2 = (tt)var1.next()) {
         var2.ga();
      }

      this.do = 0;
   }

   ro de() {
      return this.dc;
   }

   static final int av(int var0, int var1, int var2) {
      try {
         int var3 = 57 * var1 + var0;
         var3 ^= var3 << 13;
         int var4 = 1376312589 + (15731 * var3 * var3 + 789221) * var3 & Integer.MAX_VALUE;
         return var4 >> 19 & 255;
      } catch (RuntimeException var5) {
         throw db.an(var5, "de.av(" + ')');
      }
   }

   public static void aq(int var0, nm var1, int var2, int var3, int var4, boolean var5, int var6) {
      try {
         ly.au = -626822165;
         ly.ab = var1;
         oq.aq = var2 * -1643562499;
         gz.al = var3 * 1823837761;
         dn.at = var4 * 111967803;
         ev.ay = var5;
         ga.aa = var0 * -1927001363;
      } catch (RuntimeException var7) {
         throw db.an(var7, "de.aq(" + ')');
      }
   }

   public static int al(CharSequence var0, byte var1) {
      try {
         int var2 = var0.length();
         int var3 = 0;

         for(int var4 = 0; var4 < var2; ++var4) {
            if (var1 <= 8) {
               throw new IllegalStateException();
            }

            var3 = (var3 << 5) - var3 + var0.charAt(var4);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw db.an(var5, "de.al(" + ')');
      }
   }

   final void do(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      boolean var8 = true;

      int var9;
      for(var9 = 0; var9 < 4; ++var9) {
         if (this.cm[var9] > var5) {
            var7 = false;
         } else {
            var8 = false;
         }
      }

      var9 = -1;
      int var10 = -1;
      int var11 = 0;
      if (var1 >= 0) {
         hb var12 = ew.af(var1, (byte)4);
         var10 = -1542146559 * var12.az;
         var11 = -989280825 * var12.ai;
      }

      int var14;
      if (var8) {
         if (var10 == -1) {
            return;
         }

         var9 = 0;
         var14 = 0;
         if (0 == var10) {
            var14 = this.cm[0];
         } else if (1 == var10) {
            var14 = this.cq[0];
         }

         for(int var13 = 1; var13 < 4; ++var13) {
            if (0 == var10) {
               if (this.cm[var13] < var14) {
                  var9 = var13;
                  var14 = this.cm[var13];
               }
            } else if (1 == var10 && this.cq[var13] < var14) {
               var9 = var13;
               var14 = this.cq[var13];
            }
         }

         if (1 == var10 && var14 >= var2) {
            return;
         }
      } else {
         if (var7) {
            this.cu = 0;
         }

         for(var14 = 0; var14 < 4; ++var14) {
            byte var15 = this.cu;
            this.cu = (byte)((1 + this.cu) % 4);
            if (this.cm[var15] <= var5) {
               var9 = var15;
               break;
            }
         }
      }

      if (var9 >= 0) {
         this.ck[var9] = var1;
         this.cq[var9] = var2;
         this.cf[var9] = var3;
         this.cl[var9] = var4;
         this.cm[var9] = var5 + var11 + var6;
      }
   }
}
