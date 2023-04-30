import accessors.RSClanChat;

public class ps extends pq implements RSClanChat {
   static final int af = 500;
   final sw an;
   final pt aw;
   public String ac;
   public String au;
   int al;
   public int aq;
   public byte ab;
   static int gw;

   static final void ki(int var0, int var1, int var2, int var3, int var4) {
      try {
         for(int var5 = 0; var5 < -356793645 * client.rr; ++var5) {
            if (var4 != -1848509736) {
               throw new IllegalStateException();
            }

            if (client.rh[var5] + client.ra[var5] > var0 && client.rh[var5] < var2 + var0) {
               if (var4 != -1848509736) {
                  throw new IllegalStateException();
               }

               if (client.ri[var5] + client.rb[var5] > var1) {
                  if (var4 != -1848509736) {
                     throw new IllegalStateException();
                  }

                  if (client.rb[var5] < var1 + var3) {
                     client.rm[var5] = true;
                  }
               }
            }
         }

      } catch (RuntimeException var6) {
         throw db.an(var6, "ps.ki(" + ')');
      }
   }

   pw af(int var1) {
      try {
         return new pd();
      } catch (RuntimeException var2) {
         throw db.an(var2, "ps.af(" + ')');
      }
   }

   public final void by(sg var1) {
      tm var2 = new tm(var1.cw((byte)0), this.an);
      int var3 = var1.cl(-901452470);
      byte var4 = var1.cf(435772489);
      boolean var5 = false;
      if (-128 == var4) {
         var5 = true;
      }

      pd var6;
      if (var5) {
         if (this.bm(827079507) == 0) {
            return;
         }

         var6 = (pd)this.bn(var2, (short)197);
         if (var6 != null && var6.bq(1420976780) == var3) {
            this.bg(var6, 3442721);
         }
      } else {
         var1.cw((byte)0);
         var6 = (pd)this.bn(var2, (short)197);
         if (null == var6) {
            if (this.bm(-756653644) > this.at * 602004280) {
               return;
            }

            var6 = (pd)this.bu(var2, (byte)-46);
         }

         var6.bf(var3, (this.al += 923743697) * -835632335 - 1, 1903124306);
         var6.aq = 1331866435 * var4;
         this.ah(var6, -1653054194);
      }

   }

   final void aw(String var1, int var2) {
      try {
         this.ac = cj.ac(var1, -1236850266);
      } catch (RuntimeException var3) {
         throw db.an(var3, "ps.aw(" + ')');
      }
   }

   public final void ad(sg var1, int var2) {
      this.ay(var1.cw((byte)0), -978786129);
      long var3 = var1.cv((byte)1);
      this.aw(jn.an(var3), -2073582217);
      this.ab = var1.cf(435772489);
      int var5;
      int var6;
      if (1 == var2) {
         var5 = var1.cm((byte)7);
         var6 = 1102111594;
      } else {
         if (var2 != 2) {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
         }

         var5 = var1.dm(-300093630);
         var6 = -1;
      }

      if (var5 != var6) {
         int var7 = var5;
         this.bz(-2092001396);

         for(int var8 = 0; var8 < var7; ++var8) {
            pd var9 = (pd)this.bu(new tm(var1.cw((byte)0), this.an), (byte)-16);
            int var10 = var1.cl(-949775076);
            var9.bf(var10, (this.al += 923743697) * -151581843 - 1, 1883230576);
            var9.aq = var1.cf(435772489) * 1331866435;
            var1.cw((byte)0);
            this.ah(var9, -1376086769);
         }

      }
   }

   public final void ao(sg var1, int var2, byte var3) {
      try {
         this.ay(var1.cw((byte)0), -951582244);
         long var4 = var1.cv((byte)1);
         this.aw(jn.an(var4), 455982360);
         this.ab = var1.cf(435772489);
         int var6;
         short var7;
         if (1 == var2) {
            if (var3 != 1) {
               throw new IllegalStateException();
            }

            var6 = var1.cm((byte)7);
            var7 = 255;
         } else {
            if (var2 != 2) {
               throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
            }

            var6 = var1.dm(-534505085);
            var7 = -1;
         }

         if (var6 != var7) {
            int var8 = var6;
            this.bz(-1601244871);

            for(int var9 = 0; var9 < var8; ++var9) {
               if (var3 != 1) {
                  throw new IllegalStateException();
               }

               pd var10 = (pd)this.bu(new tm(var1.cw((byte)0), this.an), (byte)19);
               int var11 = var1.cl(-1496375041);
               var10.bf(var11, (this.al += 923743697) * -835632335 - 1, 1375808116);
               var10.aq = var1.cf(435772489) * 1331866435;
               var1.cw((byte)0);
               this.ah(var10, 300754990);
            }

         }
      } catch (RuntimeException var12) {
         throw db.an(var12, "ps.ao(" + ')');
      }
   }

   public final void ai(int var1) {
      try {
         for(int var2 = 0; var2 < this.bm(1859432010); ++var2) {
            ((pd)this.bq(var2, -74669048)).af((byte)12);
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "ps.ai(" + ')');
      }
   }

   final void ah(pd var1, int var2) {
      try {
         if (var1.be(473993579).equals(this.aw.nv(637501068))) {
            if (var2 <= -1900179119) {
               return;
            }

            this.aq = var1.aq * 2092329417;
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "ps.ah(" + ')');
      }
   }

   public final void ag(byte var1) {
      try {
         for(int var2 = 0; var2 < this.bm(1603660447); ++var2) {
            if (var1 == 1) {
               throw new IllegalStateException();
            }

            ((pd)this.bq(var2, 818709767)).aa(629220603);
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "ps.ag(" + ')');
      }
   }

   public final void ax(sg var1, byte var2) {
      try {
         tm var3 = new tm(var1.cw((byte)0), this.an);
         int var4 = var1.cl(186460102);
         byte var5 = var1.cf(435772489);
         boolean var6 = false;
         if (-128 == var5) {
            var6 = true;
         }

         pd var7;
         if (var6) {
            if (var2 >= 2) {
               throw new IllegalStateException();
            }

            if (this.bm(-882944622) == 0) {
               if (var2 >= 2) {
                  throw new IllegalStateException();
               }

               return;
            }

            var7 = (pd)this.bn(var3, (short)197);
            if (var7 != null) {
               if (var2 >= 2) {
                  return;
               }

               if (var7.bq(-199616481) == var4) {
                  if (var2 >= 2) {
                     throw new IllegalStateException();
                  }

                  this.bg(var7, -623771631);
               }
            }
         } else {
            var1.cw((byte)0);
            var7 = (pd)this.bn(var3, (short)197);
            if (null == var7) {
               if (var2 >= 2) {
                  throw new IllegalStateException();
               }

               if (this.bm(-2019825610) > this.at * -734344935) {
                  return;
               }

               var7 = (pd)this.bu(var3, (byte)31);
            }

            var7.bf(var4, (this.al += 923743697) * -835632335 - 1, 1994082485);
            var7.aq = 1331866435 * var5;
            this.ah(var7, -1829447137);
         }

      } catch (RuntimeException var8) {
         throw db.an(var8, "ps.ax(" + ')');
      }
   }

   final void ay(String var1, int var2) {
      try {
         this.au = cj.ac(var1, -86032975);
      } catch (RuntimeException var3) {
         throw db.an(var3, "ps.ay(" + ')');
      }
   }

   pw au() {
      return new pd();
   }

   public final void ae(sg var1, int var2) {
      this.ay(var1.cw((byte)0), 891895805);
      long var3 = var1.cv((byte)1);
      this.aw(jn.an(var3), 1601212501);
      this.ab = var1.cf(435772489);
      int var5;
      short var6;
      if (1 == var2) {
         var5 = var1.cm((byte)7);
         var6 = 255;
      } else {
         if (var2 != 2) {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
         }

         var5 = var1.dm(-1033685322);
         var6 = -1;
      }

      if (var5 != var6) {
         int var7 = var5;
         this.bz(-486578704);

         for(int var8 = 0; var8 < var7; ++var8) {
            pd var9 = (pd)this.bu(new tm(var1.cw((byte)0), this.an), (byte)-7);
            int var10 = var1.cl(-1644864463);
            var9.bf(var10, (this.al += 923743697) * -835632335 - 1, 1131002477);
            var9.aq = var1.cf(435772489) * 1331866435;
            var1.cw((byte)0);
            this.ah(var9, 1608699137);
         }

      }
   }

   pw[] aq(int var1) {
      return new pd[var1];
   }

   pw[] al(int var1) {
      return new pd[var1];
   }

   pw ac() {
      return new pd();
   }

   pw[] aa(int var1) {
      return new pd[var1];
   }

   final void av(String var1) {
      this.ac = cj.ac(var1, 1248226916);
   }

   final void ar(String var1) {
      this.ac = cj.ac(var1, 1154205470);
   }

   final void am(String var1) {
      this.au = cj.ac(var1, 942954986);
   }

   pw[] an(int var1, int var2) {
      try {
         return new pd[var1];
      } catch (RuntimeException var3) {
         throw db.an(var3, "ps.an(" + ')');
      }
   }

   final void aj(String var1) {
      this.au = cj.ac(var1, 1306198444);
   }

   public final void ak(sg var1, int var2) {
      this.ay(var1.cw((byte)0), -1285481312);
      long var3 = var1.cv((byte)1);
      this.aw(jn.an(var3), -477600755);
      this.ab = var1.cf(435772489);
      int var5;
      int var6;
      if (1 == var2) {
         var5 = var1.cm((byte)7);
         var6 = -838297693;
      } else {
         if (var2 != 2) {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
         }

         var5 = var1.dm(1578349610);
         var6 = -1;
      }

      if (var5 != var6) {
         int var7 = var5;
         this.bz(-1563785454);

         for(int var8 = 0; var8 < var7; ++var8) {
            pd var9 = (pd)this.bu(new tm(var1.cw((byte)0), this.an), (byte)19);
            int var10 = var1.cl(-62484546);
            var9.bf(var10, (this.al += -1589203227) * -835632335 - 1, 1267325166);
            var9.aq = var1.cf(435772489) * 1331866435;
            var1.cw((byte)0);
            this.ah(var9, -485868387);
         }

      }
   }

   public final void az(sg var1, int var2) {
      this.ay(var1.cw((byte)0), -767254359);
      long var3 = var1.cv((byte)1);
      this.aw(jn.an(var3), -1275296651);
      this.ab = var1.cf(435772489);
      int var5;
      int var6;
      if (1 == var2) {
         var5 = var1.cm((byte)7);
         var6 = 1242228774;
      } else {
         if (var2 != 2) {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
         }

         var5 = var1.dm(1855867113);
         var6 = -1;
      }

      if (var5 != var6) {
         int var7 = var5;
         this.bz(-449134005);

         for(int var8 = 0; var8 < var7; ++var8) {
            pd var9 = (pd)this.bu(new tm(var1.cw((byte)0), this.an), (byte)-53);
            int var10 = var1.cl(192277522);
            var9.bf(var10, (this.al += 923743697) * 554501222 - 1, 1203152290);
            var9.aq = var1.cf(435772489) * 1331866435;
            var1.cw((byte)0);
            this.ah(var9, -507999479);
         }

      }
   }

   public final void bi() {
      for(int var1 = 0; var1 < this.bm(365942957); ++var1) {
         ((pd)this.bq(var1, 121910923)).af((byte)12);
      }

   }

   final void as(String var1) {
      this.au = cj.ac(var1, 81191450);
   }

   public final void ap(sg var1) {
      tm var2 = new tm(var1.cw((byte)0), this.an);
      int var3 = var1.cl(243947533);
      byte var4 = var1.cf(435772489);
      boolean var5 = false;
      if (-128 == var4) {
         var5 = true;
      }

      pd var6;
      if (var5) {
         if (this.bm(1418953947) == 0) {
            return;
         }

         var6 = (pd)this.bn(var2, (short)197);
         if (var6 != null && var6.bq(1694678223) == var3) {
            this.bg(var6, 79524041);
         }
      } else {
         var1.cw((byte)0);
         var6 = (pd)this.bn(var2, (short)197);
         if (null == var6) {
            if (this.bm(1482791185) > this.at * -734344935) {
               return;
            }

            var6 = (pd)this.bu(var2, (byte)-2);
         }

         var6.bf(var3, (this.al += 923743697) * -835632335 - 1, 1107396519);
         var6.aq = 1331866435 * var4;
         this.ah(var6, -1362294849);
      }

   }

   pw ab() {
      return new pd();
   }

   public final void bb(sg var1) {
      tm var2 = new tm(var1.cw((byte)0), this.an);
      int var3 = var1.cl(-1113914117);
      byte var4 = var1.cf(435772489);
      boolean var5 = false;
      if (-789373839 == var4) {
         var5 = true;
      }

      pd var6;
      if (var5) {
         if (this.bm(-257280697) == 0) {
            return;
         }

         var6 = (pd)this.bn(var2, (short)197);
         if (var6 != null && var6.bq(2096752983) == var3) {
            this.bg(var6, -2086508076);
         }
      } else {
         var1.cw((byte)0);
         var6 = (pd)this.bn(var2, (short)197);
         if (null == var6) {
            if (this.bm(-1619225497) > this.at * -271614236) {
               return;
            }

            var6 = (pd)this.bu(var2, (byte)-109);
         }

         var6.bf(var3, (this.al += -1061330987) * -1662708899 - 1, 2127954528);
         var6.aq = 1331866435 * var4;
         this.ah(var6, -808203700);
      }

   }

   public ps(sw var1, pt var2) {
      try {
         super(500);
         this.ac = null;
         this.au = null;
         this.al = 923743697;
         this.an = var1;
         this.aw = var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "ps.<init>(" + ')');
      }
   }

   public final void be() {
      for(int var1 = 0; var1 < this.bm(1573945479); ++var1) {
         ((pd)this.bq(var1, -273422176)).af((byte)12);
      }

   }

   public final void bk() {
      for(int var1 = 0; var1 < this.bm(-1883954293); ++var1) {
         ((pd)this.bq(var1, 1258272352)).af((byte)12);
      }

   }

   public final void bx() {
      for(int var1 = 0; var1 < this.bm(-791726632); ++var1) {
         ((pd)this.bq(var1, 871060465)).aa(402172393);
      }

   }

   public final void bo() {
      for(int var1 = 0; var1 < this.bm(-1380015983); ++var1) {
         ((pd)this.bq(var1, 1645013785)).aa(2127626051);
      }

   }

   pw[] at(int var1) {
      return new pd[var1];
   }
}
