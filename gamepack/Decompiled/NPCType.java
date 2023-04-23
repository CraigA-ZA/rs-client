public class NPCType extends DualNode {
   static EvictingDualNodeHashTable NPCType_cached = new EvictingDualNodeHashTable(64);
   static EvictingDualNodeHashTable au = new EvictingDualNodeHashTable(50);
   static AbstractArchive NPCType_archive;
   static AbstractArchive aw;
   int bd;
   int bo;
   int transformVarp;
   int transformVarbit;
   int bt;
   int bz;
   int[] aa;
   int[] models;
   int[] bq;
   IterableNodeHashTable params;
   short[] ap;
   short[] ba;
   short[] bb;
   public boolean isFollower;
   public boolean isInteractable;
   public boolean bk;
   public boolean bm;
   public boolean bu;
   public int ab;
   public int ad;
   public int ae;
   public int ag;
   public int ah;
   public int ai;
   public int ambient;
   public int contrast;
   public int size;
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
   public int[] transforms;
   public String name;
   public String[] op;
   public short[] bi;
   public short[] by;

   NPCType() {
      this.name = Strings.Strings_null;
      this.size = -1159021589;
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
      this.ambient = 1734270145;
      this.contrast = 237251001;
      this.az = 1296177123;
      this.ad = 2136803683;
      this.ae = -2044090389;
      this.op = new String[5];
      this.bk = true;
      this.bx = 959716425;
      this.bo = 1835076736;
      this.bz = 2129768832;
      this.bm = false;
      this.bd = 0;
      this.bt = 0;
      this.bj = -1472822432;
      this.transformVarbit = -1998015621;
      this.transformVarp = -17057377;
      this.isInteractable = true;
      this.bu = true;
      this.isFollower = false;
      this.bq = null;
      this.ba = null;
   }

   public static int aq(long var0) {
      return (int)(var0 >>> 7 & 127L);
   }

   void postDecode() {
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
      int var4;
      int var5;
      if (1 == var2) {
         var4 = var1.g1();
         this.models = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.models[var5] = var1.cl();
         }
      } else if (2 == var2) {
         this.name = var1.cw();
      } else if (var2 == 12) {
         this.size = var1.g1() * -1159021589;
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
         this.op[var2 - 30] = var1.cw();
         if (this.op[var2 - 30].equalsIgnoreCase(Strings.Strings_hidden)) {
            this.op[var2 - 30] = null;
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
               this.isInteractable = false;
            } else if (109 == var2) {
               this.bu = false;
            } else if (var2 == 111) {
               this.isFollower = true;
            } else if (114 == var2) {
               this.ar = var1.cl() * 1104808909;
            } else if (var2 == 115) {
               this.ar = var1.cl() * 1104808909;
               this.am = var1.cl() * -1535672631;
               this.as = var1.cl() * -257868351;
               this.ambient = var1.cl() * -1734270145;
            } else if (var2 == 116) {
               this.contrast = var1.cl() * -237251001;
            } else if (117 == var2) {
               this.contrast = var1.cl() * -237251001;
               this.az = var1.cl() * -1296177123;
               this.ad = var1.cl() * -2136803683;
               this.ae = var1.cl() * 2044090389;
            } else if (249 == var2) {
               this.params = ChatChannel.readStringIntParameters(var1, this.params);
            }
         } else {
            this.transformVarbit = var1.cl() * 1998015621;
            if (65535 == this.transformVarbit * 1781845069) {
               this.transformVarbit = -1998015621;
            }

            this.transformVarp = var1.cl() * 17057377;
            if (this.transformVarp * 2051988897 == 65535) {
               this.transformVarp = -17057377;
            }

            var4 = -1;
            if (var2 == 118) {
               var4 = var1.cl();
               if (var4 == 65535) {
                  var4 = -1;
               }
            }

            var5 = var1.g1();
            this.transforms = new int[var5 + 2];

            for(var6 = 0; var6 <= var5; ++var6) {
               this.transforms[var6] = var1.cl();
               if (this.transforms[var6] == 65535) {
                  this.transforms[var6] = -1;
               }
            }

            this.transforms[var5 + 1] = var4;
         }
      }

   }

   public final it ab(SeqType var1, int var2, SeqType var3, int var4, hv var5) {
      if (null != this.transforms) {
         NPCType var13 = this.transform();
         return var13 == null ? null : var13.ab(var1, var2, var3, var4, var5);
      } else {
         long var7 = (long)(this.ab * -1115372301);
         if (null != var5) {
            var7 |= -1176524468931644747L * var5.af << 16;
         }

         it var9 = (it)au.get(var7);
         if (var9 == null) {
            UnlitModel var10 = this.al(this.models, var5);
            if (var10 == null) {
               return null;
            }

            var9 = var10.bb(64 + this.bd * -1500709613, this.bt * -2057653211 + 850, -30, -50, -30);
            au.put(var9, var7);
         }

         it var14;
         if (null != var1 && var3 != null) {
            var14 = var1.at(var9, var2, var3, var4);
         } else if (var1 != null) {
            var14 = var1.ab(var9, var2);
         } else if (var3 != null) {
            var14 = var3.ab(var9, var4);
         } else {
            var14 = var9.aa(true);
         }

         if (this.bo * 1661958697 != 128 || this.bz * 521320011 != 128) {
            var14.bk(this.bo * 1661958697, this.bz * 521320011, 1661958697 * this.bo);
         }

         return var14;
      }
   }

   public final UnlitModel aq(hv var1) {
      if (null != this.transforms) {
         NPCType var3 = this.transform();
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
            UnlitModel[] var15 = new UnlitModel[var4.length];

            for(int var7 = 0; var7 < var4.length; ++var7) {
               var15[var7] = UnlitModel.af_renamed(aw, var4[var7], 0);
            }

            UnlitModel var16;
            if (var15.length == 1) {
               var16 = var15[0];
               if (null == var16) {
                  var16 = new UnlitModel(var15, var15.length);
               }
            } else {
               var16 = new UnlitModel(var15, var15.length);
            }

            short[] var8;
            int var9;
            if (null != this.ap) {
               var8 = this.by;
               if (var2 != null && null != var2.aw) {
                  var8 = var2.aw;
               }

               for(var9 = 0; var9 < this.ap.length; ++var9) {
                  var16.recolor(this.ap[var9], var8[var9]);
               }
            }

            if (this.bb != null) {
               var8 = this.bi;
               if (null != var2 && var2.ac != null) {
                  var8 = var2.ac;
               }

               for(var9 = 0; var9 < this.bb.length; ++var9) {
                  var16.retexture(this.bb[var9], var8[var9]);
               }
            }

            return var16;
         }
      }
   }

   public final NPCType transform() {
      int var2 = -1;
      if (-1 != 1781845069 * this.transformVarbit) {
         var2 = WorldMapSection1.getVarbit(1781845069 * this.transformVarbit);
      } else if (2051988897 * this.transformVarp != -1) {
         var2 = Varps.Varps_main[this.transformVarp * 2051988897];
      }

      int var3;
      if (var2 >= 0 && var2 < this.transforms.length - 1) {
         var3 = this.transforms[var2];
      } else {
         var3 = this.transforms[this.transforms.length - 1];
      }

      return var3 != -1 ? AbstractArchive.getNPCType(var3) : null;
   }

   public boolean aa() {
      if (this.transforms == null) {
         return true;
      } else {
         int var2 = -1;
         if (-1 != this.transformVarbit * 1781845069) {
            var2 = WorldMapSection1.getVarbit(this.transformVarbit * 1781845069);
         } else if (-1 != 2051988897 * this.transformVarp) {
            var2 = Varps.Varps_main[2051988897 * this.transformVarp];
         }

         if (var2 >= 0 && var2 < this.transforms.length) {
            return -1 != this.transforms[var2];
         } else {
            return this.transforms[this.transforms.length - 1] != -1;
         }
      }
   }

   public int getIntParam(int var1, int var2) {
      IterableNodeHashTable var5 = this.params;
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

   public String getStringParam(int var1, String var2) {
      return EnumType.an_renamed(this.params, var1, var2);
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
