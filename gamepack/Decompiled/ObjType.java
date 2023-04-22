public class ObjType extends DualNode {
   int boughttemplate;
   public int cost;
   public static AbstractArchive aq;
   static EvictingDualNodeHashTable ObjType_cached = new EvictingDualNodeHashTable(64);
   static EvictingDualNodeHashTable ay = new EvictingDualNodeHashTable(50);
   static EvictingDualNodeHashTable ao = new EvictingDualNodeHashTable(200);
   public int manwear;
   int ag;
   int manhead;
   public String[] iop;
   public short[] ar;
   public short[] av;
   public short[] as;
   public int aj;
   public int yan2d;
   public int manwear2;
   public int manwearyoff;
   public int yof2d;
   public boolean stockmarket;
   public int womanwearyoff;
   public short[] am;
   public int contrast;
   int ambient;
   public int stackable;
   public String[] op;
   int womanwear;
   int womanwear2;
   int resizey;
   int placeholdertemplate;
   int womanwear3;
   int certlink;
   int manhead2;
   int womanhead;
   int womanhead2;
   int resizex;
   IterableNodeHashTable params;
   int zoom2d;
   int[] bh;
   public int xan2d;
   public int certtemplate;
   public int resizez;
   public int placeholderlink;
   int shiftclickindex;
   int team;
   public int zan2d;
   public int boughtlink;
   public int xof2d;
   public String name;
   int ai;
   public boolean members;
   int[] bw;
   int cg;
   public int cr;
   public int cy;
   static fj sq;
   int manwear3;

   void decode(Packet var1) {
      while(true) {
         int var3 = var1.g1();
         if (0 == var3) {
            return;
         }

         this.decode0(var1, var3);
      }
   }

   boolean ak() {
      return null != this.ar;
   }

   void aq(ObjType var1, ObjType var2) {
      this.ag = var1.ag * 1;
      this.aj = 1 * var1.aj;
      this.yan2d = var1.yan2d * 1;
      this.manwear2 = var1.manwear2 * 1;
      this.xof2d = var1.xof2d * 1;
      this.manwearyoff = var1.manwearyoff * 1;
      this.yof2d = var1.yof2d * 1;
      this.av = var1.av;
      this.ar = var1.ar;
      this.am = var1.am;
      this.as = var1.as;
      this.stackable = var1.stackable * 1;
      this.name = var2.name;
      this.cost = 0;
      this.stockmarket = false;
      this.members = false;
   }

   void au(ObjType var1, ObjType var2) {
      this.ag = var1.ag * 1;
      this.aj = var1.aj * 1;
      this.yan2d = 1 * var1.yan2d;
      this.manwear2 = 1 * var1.manwear2;
      this.xof2d = 1 * var1.xof2d;
      this.manwearyoff = 1 * var1.manwearyoff;
      this.yof2d = var1.yof2d * 1;
      this.av = var1.av;
      this.ar = var1.ar;
      this.am = var1.am;
      this.as = var1.as;
      this.name = var2.name;
      this.stockmarket = var2.stockmarket;
      this.cost = var2.cost * 1;
      this.stackable = 1685556127;
   }

   void ab(ObjType var1, ObjType var2) {
      this.ag = 1 * var1.ag;
      this.aj = 1 * var1.aj;
      this.yan2d = 1 * var1.yan2d;
      this.manwear2 = 1 * var1.manwear2;
      this.xof2d = 1 * var1.xof2d;
      this.manwearyoff = 1 * var1.manwearyoff;
      this.yof2d = 1 * var1.yof2d;
      this.av = var2.av;
      this.ar = var2.ar;
      this.am = var2.am;
      this.as = var2.as;
      this.name = var2.name;
      this.stockmarket = var2.stockmarket;
      this.stackable = var2.stackable * 1;
      this.womanwearyoff = 1 * var2.womanwearyoff;
      this.manwear = 1 * var2.manwear;
      this.contrast = var2.contrast * 1;
      this.womanwear2 = var2.womanwear2 * 1;
      this.resizey = var2.resizey * 1;
      this.womanhead = var2.womanhead * 1;
      this.womanwear3 = 1 * var2.womanwear3;
      this.manhead = var2.manhead * 1;
      this.womanhead2 = var2.womanhead2 * 1;
      this.resizex = 1 * var2.resizex;
      this.certlink = 1 * var2.certlink;
      this.boughttemplate = var2.boughttemplate * 1;
      this.zoom2d = 1 * var2.zoom2d;
      this.placeholderlink = var2.placeholderlink * 1;
      this.iop = var2.iop;
      this.xan2d = var2.xan2d * 1;
      this.op = new String[5];
      if (null != var2.op) {
         for(int var4 = 0; var4 < 4; ++var4) {
            this.op[var4] = var2.op[var4];
         }
      }

      this.op[4] = Strings.al;
      this.cost = 0;
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
      int var3 = this.womanwear2 * 1259737505;
      int var4 = this.resizey * -1975240801;
      int var5 = this.womanhead * -1550321451;
      if (1 == var1) {
         var3 = -1355512081 * this.womanwear3;
         var4 = -1937321521 * this.manhead;
         var5 = this.womanhead2 * 1169668803;
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

   public final boolean ag(int var1) {
      int var3 = 2144570273 * this.resizex;
      int var4 = this.certlink * 1570928533;
      if (var1 == 1) {
         var3 = this.boughttemplate * -560329405;
         var4 = this.zoom2d * 1869912693;
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
      int var3 = 2144570273 * this.resizex;
      int var4 = 1570928533 * this.certlink;
      if (var1 == 1) {
         var3 = -560329405 * this.boughttemplate;
         var4 = 1869912693 * this.zoom2d;
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
      IterableNodeHashTable var5 = this.params;
      int var4;
      if (null == var5) {
         var4 = var2;
      } else {
         IntegerNode var6 = (IntegerNode)var5.get((long)var1);
         if (var6 == null) {
            var4 = var2;
         } else {
            var4 = var6.integer;
         }
      }

      return var4;
   }

   public String getStringParam(int var1, String var2) {
      return EnumType.an_renamed(this.params, var1, var2);
   }

   public int getShiftClickIndex() {
      if (this.womanwear * -377028789 != -1 && this.op != null) {
         if (this.womanwear * -377028789 >= 0) {
            return this.op[-377028789 * this.womanwear] != null ? -377028789 * this.womanwear : -1;
         } else {
            return Strings.Strings_drop.equalsIgnoreCase(this.op[4]) ? 4 : -1;
         }
      } else {
         return -1;
      }
   }

   ObjType() {
      this.name = Strings.Strings_null;
      this.aj = -139745840;
      this.yan2d = 0;
      this.manwear2 = 0;
      this.xof2d = 0;
      this.manwearyoff = 0;
      this.yof2d = 0;
      this.stackable = 0;
      this.cost = -1041171269;
      this.womanwearyoff = 1072009039;
      this.manwear = -1699982907;
      this.contrast = -1627653365;
      this.stockmarket = false;
      this.iop = new String[]{null, null, Strings.Strings_take, null, null};
      this.op = new String[]{null, null, null, null, Strings.Strings_drop};
      this.womanwear = 1290787642;
      this.womanwear2 = 240774559;
      this.resizey = -1308828767;
      this.manwear3 = 0;
      this.womanwear3 = 459970545;
      this.manhead = -624858415;
      this.manhead2 = 0;
      this.womanhead = -1230864509;
      this.womanhead2 = -787170795;
      this.resizex = -1008801889;
      this.certlink = -174922685;
      this.boughttemplate = 1191712917;
      this.zoom2d = 738400803;
      this.certtemplate = -58690731;
      this.resizez = -468518381;
      this.ambient = 1106160256;
      this.shiftclickindex = 1018432384;
      this.team = 1308512384;
      this.zan2d = 0;
      this.boughtlink = 0;
      this.placeholderlink = 0;
      this.xan2d = 0;
      this.members = false;
      this.placeholdertemplate = -1905271763;
      this.cg = -1073961371;
      this.cr = 1652212107;
      this.cy = 115270063;
   }

   boolean az() {
      return this.as != null;
   }

   public final UnlitModel ai(int var1) {
      int var3 = this.womanwear2 * 1259737505;
      int var4 = -1975240801 * this.resizey;
      int var5 = this.womanhead * -1550321451;
      if (1 == var1) {
         var3 = this.womanwear3 * -1355512081;
         var4 = this.manhead * -1937321521;
         var5 = this.womanhead2 * 1169668803;
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

         if (0 == var1 && 0 != this.manwear3 * 1328855603) {
            var6.am(0, this.manwear3 * 1328855603, 0);
         }

         if (1 == var1 && -846717499 * this.manhead2 != 0) {
            var6.am(0, -846717499 * this.manhead2, 0);
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
            if (this.ambient * 614283261 != 128 || this.shiftclickindex * 1552043943 != 128 || 128 != this.team * -302979231) {
               var7.az(614283261 * this.ambient, 1552043943 * this.shiftclickindex, -302979231 * this.team);
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

            var6 = var7.bb(64 + 2093614773 * this.zan2d, 1794294545 * this.boughtlink + 768, -50, -10, -50);
            var6.bx = true;
            ay.put(var6, (long)(this.ai * -264956633));
            return var6;
         }
      }
   }

   void decode0(Packet var1, int var2) {
      if (var2 == 1) {
         this.ag = var1.cl() * 19259063;
      } else if (2 == var2) {
         this.name = var1.cw();
      } else if (4 == var2) {
         this.aj = var1.cl() * 354264929;
      } else if (5 == var2) {
         this.yan2d = var1.cl() * -111167811;
      } else if (var2 == 6) {
         this.manwear2 = var1.cl() * -1698175273;
      } else if (var2 == 7) {
         this.manwearyoff = var1.cl() * 233220529;
         if (this.manwearyoff * 151912273 > 32767) {
            this.manwearyoff -= -1448017920;
         }
      } else if (8 == var2) {
         this.yof2d = var1.cl() * -780188501;
         if (-271411709 * this.yof2d > 32767) {
            this.yof2d -= 1152057344;
         }
      } else if (9 == var2) {
         var1.cw();
      } else if (var2 == 11) {
         this.stackable = 1685556127;
      } else if (var2 == 12) {
         this.cost = var1.g4s() * -1041171269;
      } else if (var2 == 13) {
         this.womanwearyoff = var1.g1() * -1072009039;
      } else if (var2 == 14) {
         this.manwear = var1.g1() * 1699982907;
      } else if (16 == var2) {
         this.stockmarket = true;
      } else if (23 == var2) {
         this.womanwear2 = var1.cl() * -240774559;
         this.manwear3 = var1.g1() * -1007890181;
      } else if (var2 == 24) {
         this.resizey = var1.cl() * 1308828767;
      } else if (var2 == 25) {
         this.womanwear3 = var1.cl() * -459970545;
         this.manhead2 = var1.g1() * -677816051;
      } else if (var2 == 26) {
         this.manhead = var1.cl() * 624858415;
      } else if (var2 == 27) {
         this.contrast = var1.g1() * 1627653365;
      } else if (var2 >= 30 && var2 < 35) {
         this.iop[var2 - 30] = var1.cw();
         if (this.iop[var2 - 30].equalsIgnoreCase(Strings.Strings_hidden)) {
            this.iop[var2 - 30] = null;
         }
      } else if (var2 >= 35 && var2 < 40) {
         this.op[var2 - 35] = var1.cw();
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
            this.womanwear = var1.g1s() * -645393821;
         } else if (var2 == 65) {
            this.members = true;
         } else if (75 == var2) {
            this.xan2d = var1.cg() * 1825858873;
         } else if (78 == var2) {
            this.womanhead = var1.cl() * 1230864509;
         } else if (var2 == 79) {
            this.womanhead2 = var1.cl() * 787170795;
         } else if (90 == var2) {
            this.resizex = var1.cl() * 1008801889;
         } else if (var2 == 91) {
            this.boughttemplate = var1.cl() * -1191712917;
         } else if (var2 == 92) {
            this.certlink = var1.cl() * 174922685;
         } else if (93 == var2) {
            this.zoom2d = var1.cl() * -738400803;
         } else if (94 == var2) {
            var1.cl();
         } else if (95 == var2) {
            this.xof2d = var1.cl() * 1724640311;
         } else if (97 == var2) {
            this.certtemplate = var1.cl() * 58690731;
         } else if (var2 == 98) {
            this.resizez = var1.cl() * 468518381;
         } else if (var2 >= 100 && var2 < 110) {
            if (this.bh == null) {
               this.bh = new int[10];
               this.bw = new int[10];
            }

            this.bh[var2 - 100] = var1.cl();
            this.bw[var2 - 100] = var1.cl();
         } else if (110 == var2) {
            this.ambient = var1.cl() * -662446763;
         } else if (var2 == 111) {
            this.shiftclickindex = var1.cl() * 1450797079;
         } else if (112 == var2) {
            this.team = var1.cl() * 547093665;
         } else if (var2 == 113) {
            this.zan2d = var1.g1s() * -2035992675;
         } else if (var2 == 114) {
            this.boughtlink = var1.g1s() * -297744971;
         } else if (var2 == 115) {
            this.placeholderlink = var1.g1() * 1067505549;
         } else if (139 == var2) {
            this.placeholdertemplate = var1.cl() * 1905271763;
         } else if (var2 == 140) {
            this.cg = var1.cl() * 1073961371;
         } else if (var2 == 148) {
            this.cr = var1.cl() * -1652212107;
         } else if (149 == var2) {
            this.cy = var1.cl() * -115270063;
         } else if (var2 == 249) {
            this.params = ChatChannel.readStringIntParameters(var1, this.params);
         }
      }

   }

   void an() {
      if (this.stackable * 1552863327 == 1) {
         this.xan2d = 0;
      }

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
         if (this.ambient * 614283261 != 128 || this.shiftclickindex * 1552043943 != 128 || -302979231 * this.team != 128) {
            var5.az(this.ambient * 614283261, this.shiftclickindex * 1552043943, -302979231 * this.team);
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
}
