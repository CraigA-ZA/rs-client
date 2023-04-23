public class hs extends DualNode {
   static EvictingDualNodeHashTable ac = new EvictingDualNodeHashTable(64);
   static EvictingDualNodeHashTable au = new EvictingDualNodeHashTable(50);
   static AbstractArchive an;
   static AbstractArchive aw;
   int bd;
   int bo;
   int br;
   int bs;
   int bt;
   int bz;
   int[] aa;
   int[] at;
   int[] bq;
   IterableNodeHashTable bv;
   short[] ap;
   short[] ba;
   short[] bb;
   public boolean bf;
   public boolean bg;
   public boolean bk;
   public boolean bm;
   public boolean bu;
   public int ab;
   public int ad;
   public int ae;
   public int ag;
   public int ah;
   public int ai;
   public int aj;
   public int ak;
   public int al;
   public int am;
   public int ao;
   public int ar;
   public int as;
   public int av;
   public int ax;
   public int ay;
   public int az;
   public int bj;
   public int bx;
   public int[] bn;
   public String aq;
   public String[] be;
   public short[] bi;
   public short[] by;

   hs() {
      this.aq = Strings.Strings_null;
      this.al = -1159021589;
      this.ay = -1304162881;
      this.ao = -1526449071;
      this.ax = -1325267127;
      this.ai = -1653161499;
      this.ag = 820247353;
      this.ah = -1030172671;
      this.av = 2142663477;
      this.ar = -1104808909;
      this.am = 1535672631;
      this.as = 257868351;
      this.aj = 1734270145;
      this.ak = 237251001;
      this.az = 1296177123;
      this.ad = 2136803683;
      this.ae = -2044090389;
      this.be = new String[5];
      this.bk = true;
      this.bx = 959716425;
      this.bo = 1835076736;
      this.bz = 2129768832;
      this.bm = false;
      this.bd = 0;
      this.bt = 0;
      this.bj = -1472822432;
      this.bs = -1998015621;
      this.br = -17057377;
      this.bg = true;
      this.bu = true;
      this.bf = false;
      this.bq = null;
      this.ba = null;
   }

   public static int aq(long var0) {
      return (int)(var0 >>> 7 & 127L);
   }

   void aw() {
   }

   void ac(Packet var1) {
      while(true) {
         int var3 = var1.g1();
         if (0 == var3) {
            return;
         }

         this.au(var1, var3);
      }
   }

   void au(Packet var1, int var2) {
      int var4;
      int var5;
      if (1 == var2) {
         var4 = var1.g1();
         this.at = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.at[var5] = var1.cl();
         }
      } else if (2 == var2) {
         this.aq = var1.cw();
      } else if (var2 == 12) {
         this.al = var1.g1() * -1159021589;
      } else if (13 == var2) {
         this.ay = var1.cl() * 1304162881;
      } else if (var2 == 14) {
         this.ai = var1.cl() * 1653161499;
      } else if (var2 == 15) {
         this.ao = var1.cl() * 1526449071;
      } else if (16 == var2) {
         this.ax = var1.cl() * 1325267127;
      } else if (var2 == 17) {
         this.ai = var1.cl() * 1653161499;
         this.ag = var1.cl() * -820247353;
         this.ah = var1.cl() * 1030172671;
         this.av = var1.cl() * -2142663477;
      } else if (var2 == 18) {
         var1.cl();
      } else if (var2 >= 30 && var2 < 35) {
         this.be[var2 - 30] = var1.cw();
         if (this.be[var2 - 30].equalsIgnoreCase(Strings.Strings_hidden)) {
            this.be[var2 - 30] = null;
         }
      } else if (40 == var2) {
         var4 = var1.g1();
         this.ap = new short[var4];
         this.by = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.ap[var5] = (short)var1.cl();
            this.by[var5] = (short)var1.cl();
         }
      } else if (41 == var2) {
         var4 = var1.g1();
         this.bb = new short[var4];
         this.bi = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.bb[var5] = (short)var1.cl();
            this.bi[var5] = (short)var1.cl();
         }
      } else if (60 == var2) {
         var4 = var1.g1();
         this.aa = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.aa[var5] = var1.cl();
         }
      } else if (93 == var2) {
         this.bk = false;
      } else if (95 == var2) {
         this.bx = var1.cl() * -959716425;
      } else if (97 == var2) {
         this.bo = var1.cl() * 1121632793;
      } else if (var2 == 98) {
         this.bz = var1.cl() * 889054051;
      } else if (var2 == 99) {
         this.bm = true;
      } else if (100 == var2) {
         this.bd = var1.g1s() * 1774081307;
      } else if (var2 == 101) {
         this.bt = var1.g1s() * 352282209;
      } else {
         int var6;
         if (102 == var2) {
            var4 = var1.g1();
            var5 = 0;

            for(var6 = var4; 0 != var6; var6 >>= 1) {
               ++var5;
            }

            this.bq = new int[var5];
            this.ba = new short[var5];

            for(int var7 = 0; var7 < var5; ++var7) {
               if ((var4 & 1 << var7) == 0) {
                  this.bq[var7] = -1;
                  this.ba[var7] = -1;
               } else {
                  this.bq[var7] = var1.gSmart2or4();
                  this.ba[var7] = (short)var1.dm();
               }
            }
         } else if (var2 == 103) {
            this.bj = var1.cl() * 222409755;
         } else if (var2 != 106 && var2 != 118) {
            if (107 == var2) {
               this.bg = false;
            } else if (109 == var2) {
               this.bu = false;
            } else if (var2 == 111) {
               this.bf = true;
            } else if (114 == var2) {
               this.ar = var1.cl() * 1104808909;
            } else if (var2 == 115) {
               this.ar = var1.cl() * 1104808909;
               this.am = var1.cl() * -1535672631;
               this.as = var1.cl() * -257868351;
               this.aj = var1.cl() * -1734270145;
            } else if (var2 == 116) {
               this.ak = var1.cl() * -237251001;
            } else if (117 == var2) {
               this.ak = var1.cl() * -237251001;
               this.az = var1.cl() * -1296177123;
               this.ad = var1.cl() * -2136803683;
               this.ae = var1.cl() * 2044090389;
            } else if (249 == var2) {
               this.bv = ChatChannel.readStringIntParameters(var1, this.bv);
            }
         } else {
            this.bs = var1.cl() * 1998015621;
            if (65535 == this.bs * 1781845069) {
               this.bs = -1998015621;
            }

            this.br = var1.cl() * 17057377;
            if (this.br * 2051988897 == 65535) {
               this.br = -17057377;
            }

            var4 = -1;
            if (var2 == 118) {
               var4 = var1.cl();
               if (var4 == 65535) {
                  var4 = -1;
               }
            }

            var5 = var1.g1();
            this.bn = new int[var5 + 2];

            for(var6 = 0; var6 <= var5; ++var6) {
               this.bn[var6] = var1.cl();
               if (this.bn[var6] == 65535) {
                  this.bn[var6] = -1;
               }
            }

            this.bn[var5 + 1] = var4;
         }
      }

   }

   public final it ab(SeqType var1, int var2, SeqType var3, int var4, hv var5) {
      if (null != this.bn) {
         hs var11 = this.at();
         return var11 == null ? null : var11.ab(var1, var2, var3, var4, var5);
      } else {
         long var7 = (long)(this.ab * -1115372301);
         if (null != var5) {
            var7 |= -1176524468931644747L * var5.af << 16;
         }

         it var9 = (it)au.get(var7);
         if (var9 == null) {
            UnlitModel var10 = this.al(this.at, var5);
            if (var10 == null) {
               return null;
            }

            var9 = var10.bb(64 + this.bd * -1500709613, this.bt * -2057653211 + 850, -30, -50, -30);
            au.put(var9, var7);
         }

         it var12;
         if (null != var1 && var3 != null) {
            var12 = var1.at(var9, var2, var3, var4);
         } else if (var1 != null) {
            var12 = var1.ab(var9, var2);
         } else if (var3 != null) {
            var12 = var3.ab(var9, var4);
         } else {
            var12 = var9.aa(true);
         }

         if (this.bo * 1661958697 != 128 || this.bz * 521320011 != 128) {
            var12.bk(this.bo * 1661958697, this.bz * 521320011, 1661958697 * this.bo);
         }

         return var12;
      }
   }

   public final UnlitModel aq(hv var1) {
      if (null != this.bn) {
         hs var3 = this.at();
         return null == var3 ? null : var3.aq(var1);
      } else {
         return this.al(this.aa, var1);
      }
   }

   UnlitModel al(int[] var1, hv var2) {
      int[] var4 = var1;
      if (var2 != null && var2.an != null) {
         var4 = var2.an;
      }

      if (null == var4) {
         return null;
      } else {
         boolean var5 = false;

         for(int var6 = 0; var6 < var4.length; ++var6) {
            if (var4[var6] != -1 && !aw.tryLoadFile(var4[var6], 0)) {
               var5 = true;
            }
         }

         if (var5) {
            return null;
         } else {
            UnlitModel[] var10 = new UnlitModel[var4.length];

            for(int var7 = 0; var7 < var4.length; ++var7) {
               var10[var7] = UnlitModel.af_renamed(aw, var4[var7], 0);
            }

            UnlitModel var11;
            if (var10.length == 1) {
               var11 = var10[0];
               if (null == var11) {
                  var11 = new UnlitModel(var10, var10.length);
               }
            } else {
               var11 = new UnlitModel(var10, var10.length);
            }

            short[] var8;
            int var9;
            if (null != this.ap) {
               var8 = this.by;
               if (var2 != null && null != var2.aw) {
                  var8 = var2.aw;
               }

               for(var9 = 0; var9 < this.ap.length; ++var9) {
                  var11.recolor(this.ap[var9], var8[var9]);
               }
            }

            if (this.bb != null) {
               var8 = this.bi;
               if (null != var2 && var2.ac != null) {
                  var8 = var2.ac;
               }

               for(var9 = 0; var9 < this.bb.length; ++var9) {
                  var11.retexture(this.bb[var9], var8[var9]);
               }
            }

            return var11;
         }
      }
   }

   public final hs at() {
      int var2 = -1;
      if (-1 != 1781845069 * this.bs) {
         var2 = WorldMapSection1.af_renamed(1781845069 * this.bs);
      } else if (2051988897 * this.br != -1) {
         var2 = Varps.Varps_main[this.br * 2051988897];
      }

      int var3;
      if (var2 >= 0 && var2 < this.bn.length - 1) {
         var3 = this.bn[var2];
      } else {
         var3 = this.bn[this.bn.length - 1];
      }

      return var3 != -1 ? AbstractArchive.an_renamed(var3) : null;
   }

   public boolean aa() {
      if (this.bn == null) {
         return true;
      } else {
         int var2 = -1;
         if (-1 != this.bs * 1781845069) {
            var2 = WorldMapSection1.af_renamed(this.bs * 1781845069);
         } else if (-1 != 2051988897 * this.br) {
            var2 = Varps.Varps_main[2051988897 * this.br];
         }

         if (var2 >= 0 && var2 < this.bn.length) {
            return -1 != this.bn[var2];
         } else {
            return this.bn[this.bn.length - 1] != -1;
         }
      }
   }

   public int ay(int var1, int var2) {
      IterableNodeHashTable var5 = this.bv;
      int var4;
      if (null == var5) {
         var4 = var2;
      } else {
         IntegerNode var6 = (IntegerNode)var5.get((long)var1);
         if (null == var6) {
            var4 = var2;
         } else {
            var4 = var6.integer;
         }
      }

      return var4;
   }

   public String ao(int var1, String var2) {
      return EnumType.an_renamed(this.bv, var1, var2);
   }

   public boolean ai() {
      return null != this.bq && this.ba != null;
   }

   public int[] ag() {
      return this.bq;
   }

   public int ah(int var1) {
      return null != this.bq && var1 < this.bq.length ? this.bq[var1] : -1;
   }

   public short[] av() {
      return this.ba;
   }

   public short ar(int var1) {
      return null != this.ba && var1 < this.ba.length ? this.ba[var1] : -1;
   }
}
