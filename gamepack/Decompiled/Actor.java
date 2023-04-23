public abstract class Actor extends Entity {
   boolean an = false;
   boolean ce;
   boolean ci = false;
   boolean co;
   boolean cy = false;
   byte cu = 0;
   byte db;
   byte df;
   byte dq;
   byte du;
   int ba = -725472713;
   int bc = 2025717011;
   int bd;
   int bf = -140602839;
   int bg = -497469823;
   int bh = 919918425;
   int bj = 767436785;
   int bl = 1035736995;
   int bm = -1967111979;
   int bn = 603869663;
   int bo;
   int bp = 1110395975;
   int bq = 1320156809;
   int br = 1683505383;
   int bs = -1672510249;
   int bt = -1196796229;
   int bu = -1927855919;
   int bv = 1530081757;
   int bx;
   int bz;
   int cb = -1388623137;
   int cc = 0;
   int cd = 0;
   int ch = 0;
   int cj = 0;
   int cn = 0;
   int cp = 0;
   int cr = -1052277865;
   int cs = -1924554444;
   int ct = 1690721941;
   int cv = 1213206377;
   int cw = 0;
   int cx = 1409690365;
   int cz = -327373721;
   int dd;
   int de = 233502456;
   int dg = 0;
   int dh = 887211183;
   int di;
   int dj = 0;
   int dk;
   int dl;
   int dm = 0;
   int dn = 0;
   int do = 0;
   int dp = 368061749;
   int dr;
   int dt;
   int dv;
   int dw = 0;
   int dx = -1759588000;
   int dz;
   int eo = 0;
   int ep = 0;
   int eq = -1392091407;
   int[] cf = new int[4];
   int[] ck = new int[4];
   int[] cl = new int[4];
   int[] cm = new int[4];
   int[] cq = new int[4];
   int[] ds = new int[10];
   int[] dy = new int[10];
   iu[] da = new iu[10];
   String bw = null;
   IterableNodeDeque cg = new IterableNodeDeque();
   IterableNodeHashTable dc = new IterableNodeHashTable(4);

   static Message ac_renamed(int var0, int var1) {
      ChatChannel var3 = (ChatChannel)Messages.af.get(var0);
      return var3.getMessage(var1);
   }

   public static void aq_renamed(int var0, AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
      ly.au = -626822165;
      ly.ab = var1;
      oq.aq = var2 * -1643562499;
      gz.al = var3 * 1823837761;
      dn.at = var4 * 111967803;
      ev.ay = var5;
      ga.aa = var0 * -1927001363;
   }

   Actor() {
   }

   final void cb() {
      this.dn = 0;
      this.eo = 0;
   }

   boolean isVisible() {
      return false;
   }

   final void addHitmark(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var8 = true;
      boolean var9 = true;

      int var10;
      for(var10 = 0; var10 < 4; ++var10) {
         if (this.cm[var10] > var5) {
            var8 = false;
         } else {
            var9 = false;
         }
      }

      var10 = -1;
      int var11 = -1;
      int var12 = 0;
      if (var1 >= 0) {
         HitmarkType var13 = ew.getHitmarkType(var1);
         var11 = 1897913521 * var13.az;
         var12 = 292771999 * var13.ai;
      }

      int var15;
      if (var9) {
         if (var11 == -1) {
            return;
         }

         var10 = 0;
         var15 = 0;
         if (0 == var11) {
            var15 = this.cm[0];
         } else if (1 == var11) {
            var15 = this.cq[0];
         }

         for(int var14 = 1; var14 < 4; ++var14) {
            if (0 == var11) {
               if (this.cm[var14] < var15) {
                  var10 = var14;
                  var15 = this.cm[var14];
               }
            } else if (1 == var11 && this.cq[var14] < var15) {
               var10 = var14;
               var15 = this.cq[var14];
            }
         }

         if (1 == var11 && var15 >= var2) {
            return;
         }
      } else {
         if (var8) {
            this.cu = 0;
         }

         for(var15 = 0; var15 < 4; ++var15) {
            byte var16 = this.cu;
            this.cu = (byte)((1 + this.cu) % 4);
            if (this.cm[var16] <= var5) {
               var10 = var16;
               break;
            }
         }
      }

      if (var10 >= 0) {
         this.ck[var10] = var1;
         this.cq[var10] = var2;
         this.cf[var10] = var3;
         this.cl[var10] = var4;
         this.cm[var10] = var5 + var12 + var6;
      }
   }

   public static int al_renamed(CharSequence var0) {
      int var2 = var0.length();
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         var3 = (var3 << 5) - var3 + var0.charAt(var4);
      }

      return var3;
   }

   final void addHeadbar(int var1, int var2, int var3, int var4, int var5, int var6) {
      HeadbarType var9 = (HeadbarType)HeadbarType.aw.get((long)var1);
      HeadbarType var8;
      if (null != var9) {
         var8 = var9;
      } else {
         byte[] var10 = HeadbarType.af.takeFile(33, var1);
         var9 = new HeadbarType();
         if (null != var10) {
            var9.decode(new Packet(var10));
         }

         HeadbarType.aw.put(var9, (long)var1);
         var8 = var9;
      }

      var9 = var8;
      Headbar var15 = null;
      Headbar var11 = null;
      int var12 = var8.at * 1525821745;
      int var13 = 0;

      Headbar var14;
      for(var14 = (Headbar)this.cg.last(); var14 != null; var14 = (Headbar)this.cg.previous()) {
         ++var13;
         if (var14.aw.au * -431598869 == var9.au * -431598869) {
            var14.put(var4 + var2, var5, var6, var3);
            return;
         }

         if (520914669 * var14.aw.al <= 520914669 * var9.al) {
            var15 = var14;
         }

         if (1525821745 * var14.aw.at > var12) {
            var11 = var14;
            var12 = 1525821745 * var14.aw.at;
         }
      }

      if (null != var11 || var13 < 4) {
         var14 = new Headbar(var9);
         if (var15 == null) {
            this.cg.addLast(var14);
         } else {
            IterableNodeDeque.IterableNodeDeque_addBefore(var14, var15);
         }

         var14.put(var2 + var4, var5, var6, var3);
         if (var13 >= 4) {
            var11.remove();
         }

      }
   }

   final void removeHeadbar(int var1) {
      HeadbarType var4 = (HeadbarType)HeadbarType.aw.get((long)var1);
      HeadbarType var3;
      if (var4 != null) {
         var3 = var4;
      } else {
         byte[] var5 = HeadbarType.af.takeFile(33, var1);
         var4 = new HeadbarType();
         if (null != var5) {
            var4.decode(new Packet(var5));
         }

         HeadbarType.aw.put(var4, (long)var1);
         var3 = var4;
      }

      var4 = var3;

      for(Headbar var6 = (Headbar)this.cg.last(); null != var6; var6 = (Headbar)this.cg.previous()) {
         if (var4 == var6.aw) {
            var6.remove();
            return;
         }
      }

   }

   void cj(int var1, int var2, int var3, int var4) {
      int var6 = var4 + Client.ep * -1886224337;
      tt var7 = (tt)this.dc.get((long)var1);
      if (null != var7) {
         var7.remove();
         this.do -= -1822461181;
      }

      if (65535 != var2 && var2 != -1) {
         byte var8 = 0;
         if (var4 > 0) {
            var8 = -1;
         }

         this.dc.put(new tt(var2, var3, var6, var8), (long)var1);
         this.do += -1822461181;
      }
   }

   IterableNodeHashTable ch() {
      return this.dc;
   }

   void ct() {
      IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.dc);

      for(tt var3 = (tt)var2.an(); null != var3; var3 = (tt)var2.next()) {
         var3.remove();
      }

      this.do = 0;
   }

   it cp(it var1) {
      if (-500494421 * this.do == 0) {
         return var1;
      } else {
         IterableNodeHashTableIterator var3 = new IterableNodeHashTableIterator(this.dc);
         int var4 = var1.al;
         int var5 = var1.ao;
         int var6 = var1.ad;
         byte var7 = var1.az;

         for(tt var8 = (tt)var3.an(); var8 != null; var8 = (tt)var3.next()) {
            if (var8.an * 971664459 != -1) {
               it var9 = Inventory.getSpotType(-1171575623 * var8.af).ab();
               if (null != var9) {
                  var4 += var9.al;
                  var5 += var9.ao;
                  var6 += var9.ad;
               }
            }
         }

         it var11 = new it(var4, var5, var6, var7);
         var11.ac(var1);

         for(tt var12 = (tt)var3.an(); null != var12; var12 = (tt)var3.next()) {
            if (-1 != var12.an * 971664459) {
               it var10 = Inventory.getSpotType(var12.af * -1171575623).au(971664459 * var12.an);
               if (null != var10) {
                  var10.be(0, -(-790772793 * var12.au), 0);
                  var11.ac(var10);
               }
            }
         }

         return var11;
      }
   }

   void cd() {
      this.co = false;
      this.cx = 1409690365;
      this.cv = 1213206377;
      this.cb = -1388623137;
   }

   static final int av_renamed(int var0, int var1) {
      int var3 = 57 * var1 + var0;
      var3 ^= var3 << 13;
      int var4 = 1376312589 + (15731 * var3 * var3 + 789221) * var3 & Integer.MAX_VALUE;
      return var4 >> 19 & 255;
   }
}
