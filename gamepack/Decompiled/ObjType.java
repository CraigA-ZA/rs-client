public class ObjType extends DualNode {
   public static AbstractArchive aq;
   static fj sq;
   static EvictingDualNodeHashTable aa = new EvictingDualNodeHashTable(64);
   static EvictingDualNodeHashTable ao = new EvictingDualNodeHashTable(200);
   static EvictingDualNodeHashTable ay = new EvictingDualNodeHashTable(50);
   int ag;
   int ai;
   int ba;
   int bc;
   int bf;
   int bg;
   int bj;
   int bl;
   int bn;
   int bp;
   int bq;
   int br;
   int bs;
   int bu;
   int bv;
   int cc;
   int cg;
   int cl;
   int cn;
   int cs;
   int[] bh;
   int[] bw;
   IterableNodeHashTable cm;
   public boolean bz;
   public boolean cf;
   public int ad;
   public int ae;
   public int aj;
   public int ak;
   public int ap;
   public int az;
   public int be;
   public int bi;
   public int bk;
   public int bo;
   public int bx;
   public int ca;
   public int ce;
   public int ci;
   public int ck;
   public int cq;
   public int cr;
   public int cu;
   public int cy;
   public String ah;
   public String[] bd;
   public String[] bm;
   public short[] am;
   public short[] ar;
   public short[] as;
   public short[] av;

   ObjType() {
      this.ah = Strings.at;
      this.aj = -139745840;
      this.ak = 0;
      this.az = 0;
      this.ad = 0;
      this.ae = 0;
      this.ap = 0;
      this.bi = 0;
      this.be = -1041171269;
      this.bk = 1072009039;
      this.bx = -1699982907;
      this.bo = -1627653365;
      this.bz = false;
      this.bm = new String[]{null, null, Strings.an, null, null};
      this.bd = new String[]{null, null, null, null, Strings.aw};
      this.bj = 1290787642;
      this.bn = 240774559;
      this.bs = -1308828767;
      this.br = 0;
      this.bg = 459970545;
      this.bu = -624858415;
      this.bf = 0;
      this.bq = -1230864509;
      this.ba = -787170795;
      this.bv = -1008801889;
      this.bl = -174922685;
      this.bp = 1191712917;
      this.bc = 738400803;
      this.ce = -58690731;
      this.ci = -468518381;
      this.cs = 1106160256;
      this.cc = 1018432384;
      this.cn = 1308512384;
      this.ca = 0;
      this.cu = 0;
      this.ck = 0;
      this.cq = 0;
      this.cf = false;
      this.cl = -1905271763;
      this.cg = -1073961371;
      this.cr = 1652212107;
      this.cy = 115270063;
   }

   void clear() {
      if (this.bi * 1552863327 == 1) {
         this.cq = 0;
      }

   }

   void decode(Packet var1) {
      while(true) {
         int var3 = var1.g1();
         if (0 == var3) {
            return;
         }

         this.decode0(var1, var3);
      }
   }

   void decode0(Packet var1, int var2) {
      if (var2 == 1) {
         this.ag = var1.cl() * 19259063;
      } else if (2 == var2) {
         this.ah = var1.cw();
      } else if (4 == var2) {
         this.aj = var1.cl() * 354264929;
      } else if (5 == var2) {
         this.ak = var1.cl() * -111167811;
      } else if (var2 == 6) {
         this.az = var1.cl() * -1698175273;
      } else if (var2 == 7) {
         this.ae = var1.cl() * 233220529;
         if (this.ae * 151912273 > 32767) {
            this.ae -= -1448017920;
         }
      } else if (8 == var2) {
         this.ap = var1.cl() * -780188501;
         if (-271411709 * this.ap > 32767) {
            this.ap -= 1152057344;
         }
      } else if (9 == var2) {
         var1.cw();
      } else if (var2 == 11) {
         this.bi = 1685556127;
      } else if (var2 == 12) {
         this.be = var1.g4s() * -1041171269;
      } else if (var2 == 13) {
         this.bk = var1.g1() * -1072009039;
      } else if (var2 == 14) {
         this.bx = var1.g1() * 1699982907;
      } else if (16 == var2) {
         this.bz = true;
      } else if (23 == var2) {
         this.bn = var1.cl() * -240774559;
         this.br = var1.g1() * -1007890181;
      } else if (var2 == 24) {
         this.bs = var1.cl() * 1308828767;
      } else if (var2 == 25) {
         this.bg = var1.cl() * -459970545;
         this.bf = var1.g1() * -677816051;
      } else if (var2 == 26) {
         this.bu = var1.cl() * 624858415;
      } else if (var2 == 27) {
         this.bo = var1.g1() * 1627653365;
      } else if (var2 >= 30 && var2 < 35) {
         this.bm[var2 - 30] = var1.cw();
         if (this.bm[var2 - 30].equalsIgnoreCase(Strings.ac)) {
            this.bm[var2 - 30] = null;
         }
      } else if (var2 >= 35 && var2 < 40) {
         this.bd[var2 - 35] = var1.cw();
      } else {
         int var4;
         int var5;
         if (var2 == 40) {
            var4 = var1.g1();
            this.av = new short[var4];
            this.ar = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.av[var5] = (short)var1.cl();
               this.ar[var5] = (short)var1.cl();
            }
         } else if (41 == var2) {
            var4 = var1.g1();
            this.am = new short[var4];
            this.as = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.am[var5] = (short)var1.cl();
               this.as[var5] = (short)var1.cl();
            }
         } else if (42 == var2) {
            this.bj = var1.g1s() * -645393821;
         } else if (var2 == 65) {
            this.cf = true;
         } else if (75 == var2) {
            this.cq = var1.cg() * 1825858873;
         } else if (78 == var2) {
            this.bq = var1.cl() * 1230864509;
         } else if (var2 == 79) {
            this.ba = var1.cl() * 787170795;
         } else if (90 == var2) {
            this.bv = var1.cl() * 1008801889;
         } else if (var2 == 91) {
            this.bp = var1.cl() * -1191712917;
         } else if (var2 == 92) {
            this.bl = var1.cl() * 174922685;
         } else if (93 == var2) {
            this.bc = var1.cl() * -738400803;
         } else if (94 == var2) {
            var1.cl();
         } else if (95 == var2) {
            this.ad = var1.cl() * 1724640311;
         } else if (97 == var2) {
            this.ce = var1.cl() * 58690731;
         } else if (var2 == 98) {
            this.ci = var1.cl() * 468518381;
         } else if (var2 >= 100 && var2 < 110) {
            if (this.bh == null) {
               this.bh = new int[10];
               this.bw = new int[10];
            }

            this.bh[var2 - 100] = var1.cl();
            this.bw[var2 - 100] = var1.cl();
         } else if (110 == var2) {
            this.cs = var1.cl() * -662446763;
         } else if (var2 == 111) {
            this.cc = var1.cl() * 1450797079;
         } else if (112 == var2) {
            this.cn = var1.cl() * 547093665;
         } else if (var2 == 113) {
            this.ca = var1.g1s() * -2035992675;
         } else if (var2 == 114) {
            this.cu = var1.g1s() * -297744971;
         } else if (var2 == 115) {
            this.ck = var1.g1() * 1067505549;
         } else if (139 == var2) {
            this.cl = var1.cl() * 1905271763;
         } else if (var2 == 140) {
            this.cg = var1.cl() * 1073961371;
         } else if (var2 == 148) {
            this.cr = var1.cl() * -1652212107;
         } else if (149 == var2) {
            this.cy = var1.cl() * -115270063;
         } else if (var2 == 249) {
            this.cm = ChatChannel.readStringIntParameters(var1, this.cm);
         }
      }

   }

   void au(ObjType var1, ObjType var2) {
      this.ag = var1.ag * 1;
      this.aj = var1.aj * 1;
      this.ak = 1 * var1.ak;
      this.az = 1 * var1.az;
      this.ad = 1 * var1.ad;
      this.ae = 1 * var1.ae;
      this.ap = var1.ap * 1;
      this.av = var1.av;
      this.ar = var1.ar;
      this.am = var1.am;
      this.as = var1.as;
      this.ah = var2.ah;
      this.bz = var2.bz;
      this.be = var2.be * 1;
      this.bi = 1685556127;
   }

   void ab(ObjType var1, ObjType var2) {
      this.ag = 1 * var1.ag;
      this.aj = 1 * var1.aj;
      this.ak = 1 * var1.ak;
      this.az = 1 * var1.az;
      this.ad = 1 * var1.ad;
      this.ae = 1 * var1.ae;
      this.ap = 1 * var1.ap;
      this.av = var2.av;
      this.ar = var2.ar;
      this.am = var2.am;
      this.as = var2.as;
      this.ah = var2.ah;
      this.bz = var2.bz;
      this.bi = var2.bi * 1;
      this.bk = 1 * var2.bk;
      this.bx = 1 * var2.bx;
      this.bo = var2.bo * 1;
      this.bn = var2.bn * 1;
      this.bs = var2.bs * 1;
      this.bq = var2.bq * 1;
      this.bg = 1 * var2.bg;
      this.bu = var2.bu * 1;
      this.ba = var2.ba * 1;
      this.bv = 1 * var2.bv;
      this.bl = 1 * var2.bl;
      this.bp = var2.bp * 1;
      this.bc = 1 * var2.bc;
      this.ck = var2.ck * 1;
      this.bm = var2.bm;
      this.cq = var2.cq * 1;
      this.bd = new String[5];
      if (null != var2.bd) {
         for(int var4 = 0; var4 < 4; ++var4) {
            this.bd[var4] = var2.bd[var4];
         }
      }

      this.bd[4] = Strings.al;
      this.be = 0;
   }

   void aq(ObjType var1, ObjType var2) {
      this.ag = var1.ag * 1;
      this.aj = 1 * var1.aj;
      this.ak = var1.ak * 1;
      this.az = var1.az * 1;
      this.ad = var1.ad * 1;
      this.ae = var1.ae * 1;
      this.ap = var1.ap * 1;
      this.av = var1.av;
      this.ar = var1.ar;
      this.am = var1.am;
      this.as = var1.as;
      this.bi = var1.bi * 1;
      this.ah = var2.ah;
      this.be = 0;
      this.bz = false;
      this.cf = false;
   }

   public final UnlitModel al(int var1) {
      int var4;
      if (null != this.bh && var1 > 1) {
         int var3 = -1;

         for(var4 = 0; var4 < 10; ++var4) {
            if (var1 >= this.bw[var4] && this.bw[var4] != 0) {
               var3 = this.bh[var4];
            }
         }

         if (var3 != -1) {
            return HeadbarUpdate.getObjType(var3).al(1);
         }
      }

      UnlitModel var5 = UnlitModel.af_renamed(aq, 2000117511 * this.ag, 0);
      if (var5 == null) {
         return null;
      } else {
         if (this.cs * 614283261 != 128 || this.cc * 1552043943 != 128 || -302979231 * this.cn != 128) {
            var5.az(this.cs * 614283261, this.cc * 1552043943, -302979231 * this.cn);
         }

         if (this.av != null) {
            for(var4 = 0; var4 < this.av.length; ++var4) {
               var5.recolor(this.av[var4], this.ar[var4]);
            }
         }

         if (null != this.am) {
            for(var4 = 0; var4 < this.am.length; ++var4) {
               var5.retexture(this.am[var4], this.as[var4]);
            }
         }

         return var5;
      }
   }

   public final it at(int var1) {
      if (null != this.bh && var1 > 1) {
         int var3 = -1;

         for(int var4 = 0; var4 < 10; ++var4) {
            if (var1 >= this.bw[var4] && 0 != this.bw[var4]) {
               var3 = this.bh[var4];
            }
         }

         if (-1 != var3) {
            return HeadbarUpdate.getObjType(var3).at(1);
         }
      }

      it var6 = (it)ay.get((long)(-264956633 * this.ai));
      if (null != var6) {
         return var6;
      } else {
         UnlitModel var7 = UnlitModel.af_renamed(aq, 2000117511 * this.ag, 0);
         if (null == var7) {
            return null;
         } else {
            if (this.cs * 614283261 != 128 || this.cc * 1552043943 != 128 || 128 != this.cn * -302979231) {
               var7.az(614283261 * this.cs, 1552043943 * this.cc, -302979231 * this.cn);
            }

            int var5;
            if (this.av != null) {
               for(var5 = 0; var5 < this.av.length; ++var5) {
                  var7.recolor(this.av[var5], this.ar[var5]);
               }
            }

            if (null != this.am) {
               for(var5 = 0; var5 < this.am.length; ++var5) {
                  var7.retexture(this.am[var5], this.as[var5]);
               }
            }

            var6 = var7.bb(64 + 2093614773 * this.ca, 1794294545 * this.cu + 768, -50, -10, -50);
            var6.bx = true;
            ay.put(var6, (long)(this.ai * -264956633));
            return var6;
         }
      }
   }

   public ObjType getCountObj(int var1) {
      if (this.bh != null && var1 > 1) {
         int var3 = -1;

         for(int var4 = 0; var4 < 10; ++var4) {
            if (var1 >= this.bw[var4] && 0 != this.bw[var4]) {
               var3 = this.bh[var4];
            }
         }

         if (-1 != var3) {
            return HeadbarUpdate.getObjType(var3);
         }
      }

      return this;
   }

   public final boolean ax(int var1) {
      int var3 = this.bn * 1259737505;
      int var4 = this.bs * -1975240801;
      int var5 = this.bq * -1550321451;
      if (1 == var1) {
         var3 = -1355512081 * this.bg;
         var4 = -1937321521 * this.bu;
         var5 = this.ba * 1169668803;
      }

      if (-1 == var3) {
         return true;
      } else {
         boolean var6 = true;
         if (!aq.tryLoadFile(var3, 0)) {
            var6 = false;
         }

         if (var4 != -1 && !aq.tryLoadFile(var4, 0)) {
            var6 = false;
         }

         if (-1 != var5 && !aq.tryLoadFile(var5, 0)) {
            var6 = false;
         }

         return var6;
      }
   }

   public final UnlitModel ai(int var1) {
      int var3 = this.bn * 1259737505;
      int var4 = -1975240801 * this.bs;
      int var5 = this.bq * -1550321451;
      if (1 == var1) {
         var3 = this.bg * -1355512081;
         var4 = this.bu * -1937321521;
         var5 = this.ba * 1169668803;
      }

      if (var3 == -1) {
         return null;
      } else {
         UnlitModel var6 = UnlitModel.af_renamed(aq, var3, 0);
         if (-1 != var4) {
            UnlitModel var7 = UnlitModel.af_renamed(aq, var4, 0);
            if (-1 != var5) {
               UnlitModel var8 = UnlitModel.af_renamed(aq, var5, 0);
               UnlitModel[] var9 = new UnlitModel[]{var6, var7, var8};
               var6 = new UnlitModel(var9, 3);
            } else {
               UnlitModel[] var11 = new UnlitModel[]{var6, var7};
               var6 = new UnlitModel(var11, 2);
            }
         }

         if (0 == var1 && 0 != this.br * 1328855603) {
            var6.am(0, this.br * 1328855603, 0);
         }

         if (1 == var1 && -846717499 * this.bf != 0) {
            var6.am(0, -846717499 * this.bf, 0);
         }

         int var10;
         if (this.av != null) {
            for(var10 = 0; var10 < this.av.length; ++var10) {
               var6.recolor(this.av[var10], this.ar[var10]);
            }
         }

         if (this.am != null) {
            for(var10 = 0; var10 < this.am.length; ++var10) {
               var6.retexture(this.am[var10], this.as[var10]);
            }
         }

         return var6;
      }
   }

   public final boolean ag(int var1) {
      int var3 = 2144570273 * this.bv;
      int var4 = this.bl * 1570928533;
      if (var1 == 1) {
         var3 = this.bp * -560329405;
         var4 = this.bc * 1869912693;
      }

      if (var3 == -1) {
         return true;
      } else {
         boolean var5 = true;
         if (!aq.tryLoadFile(var3, 0)) {
            var5 = false;
         }

         if (-1 != var4 && !aq.tryLoadFile(var4, 0)) {
            var5 = false;
         }

         return var5;
      }
   }

   public final UnlitModel ah(int var1) {
      int var3 = 2144570273 * this.bv;
      int var4 = 1570928533 * this.bl;
      if (var1 == 1) {
         var3 = -560329405 * this.bp;
         var4 = 1869912693 * this.bc;
      }

      if (-1 == var3) {
         return null;
      } else {
         UnlitModel var5 = UnlitModel.af_renamed(aq, var3, 0);
         if (var4 != -1) {
            UnlitModel var6 = UnlitModel.af_renamed(aq, var4, 0);
            UnlitModel[] var7 = new UnlitModel[]{var5, var6};
            var5 = new UnlitModel(var7, 2);
         }

         int var8;
         if (null != this.av) {
            for(var8 = 0; var8 < this.av.length; ++var8) {
               var5.recolor(this.av[var8], this.ar[var8]);
            }
         }

         if (null != this.am) {
            for(var8 = 0; var8 < this.am.length; ++var8) {
               var5.retexture(this.am[var8], this.as[var8]);
            }
         }

         return var5;
      }
   }

   public int getIntParam(int var1, int var2) {
      IterableNodeHashTable var5 = this.cm;
      int var4;
      if (null == var5) {
         var4 = var2;
      } else {
         IntegerNode var6 = (IntegerNode)var5.get((long)var1);
         if (var6 == null) {
            var4 = var2;
         } else {
            var4 = var6.af;
         }
      }

      return var4;
   }

   public String getStringParam(int var1, String var2) {
      return EnumType.an_renamed(this.cm, var1, var2);
   }

   public int getShiftClickIndex() {
      if (this.bj * -377028789 != -1 && this.bd != null) {
         if (this.bj * -377028789 >= 0) {
            return this.bd[-377028789 * this.bj] != null ? -377028789 * this.bj : -1;
         } else {
            return Strings.aw.equalsIgnoreCase(this.bd[4]) ? 4 : -1;
         }
      } else {
         return -1;
      }
   }

   boolean ak() {
      return null != this.ar;
   }

   boolean az() {
      return this.as != null;
   }
}
