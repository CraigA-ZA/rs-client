public class hq extends DualNode {
   public static EvictingDualNodeHashTable au = new EvictingDualNodeHashTable(500);
   static boolean af = false;
   static UnlitModel[] al = new UnlitModel[4];
   static EvictingDualNodeHashTable ab = new EvictingDualNodeHashTable(30);
   static EvictingDualNodeHashTable ac = new EvictingDualNodeHashTable(4096);
   static EvictingDualNodeHashTable aq = new EvictingDualNodeHashTable(30);
   static AbstractArchive an;
   boolean az;
   boolean br;
   boolean bx;
   int ak;
   int bb;
   int bd;
   int bf;
   int bj;
   int bm;
   int bn;
   int bq;
   int bt;
   int by;
   int bz;
   int[] aa;
   int[] ay;
   IterableNodeHashTable bw;
   short[] ag;
   short[] ah;
   short[] ai;
   short[] ax;
   public boolean ad;
   public boolean as;
   public boolean bh;
   public boolean bo;
   public boolean bs;
   public int ae;
   public int aj;
   public int am;
   public int ap;
   public int ar;
   public int at;
   public int av;
   public int ba;
   public int be;
   public int bg;
   public int bk;
   public int bl;
   public int bp;
   public int bv;
   public int[] bc;
   public int[] bu;
   public String ao;
   public String[] bi;

   public static boolean au_renamed(int var0) {
      return 0 != (var0 >> 22 & 1);
   }

   hq() {
      this.ao = Strings.at;
      this.av = 1205654711;
      this.ar = 1159818229;
      this.am = -1581132706;
      this.as = true;
      this.aj = -1041321269;
      this.ak = -657077221;
      this.az = false;
      this.ad = false;
      this.ae = 1142530427;
      this.ap = -233970928;
      this.by = 0;
      this.bb = 0;
      this.bi = new String[5];
      this.be = 1683785829;
      this.bk = 476568133;
      this.bx = false;
      this.bo = true;
      this.bz = -133284736;
      this.bm = -845704064;
      this.bd = -2060996480;
      this.bt = 0;
      this.bj = 0;
      this.bn = 0;
      this.bs = false;
      this.br = false;
      this.bg = -1776888457;
      this.bf = -1157714067;
      this.bq = 1863808827;
      this.ba = 38705135;
      this.bv = 0;
      this.bl = 0;
      this.bp = 0;
      this.bh = true;
   }

   static ClientScript aw_renamed(int var0, int var1) {
      ClientScript var3 = (ClientScript)ClientScript.af.get((long)(var0 << 16));
      if (var3 != null) {
         return var3;
      } else {
         String var4 = String.valueOf(var0);
         int var5 = ey.fj.getGroupId(var4);
         if (var5 == -1) {
            return null;
         } else {
            byte[] var6 = ey.fj.takeFileFlat(var5);
            if (var6 != null) {
               if (var6.length <= 1) {
                  return null;
               }

               var3 = bz.loadClientScript(var6);
               if (var3 != null) {
                  ClientScript.af.put(var3, (long)(var0 << 16));
                  return var3;
               }
            }

            return null;
         }
      }
   }

   void postDecode() {
      if (this.aj * 415653149 == -1) {
         this.aj = 0;
         if (null != this.aa && (null == this.ay || this.ay[0] == 10)) {
            this.aj = 1041321269;
         }

         for(int var2 = 0; var2 < 5; ++var2) {
            if (this.bi[var2] != null) {
               this.aj = 1041321269;
            }
         }
      }

      if (-1 == -1850643527 * this.bg) {
         this.bg = (this.am * -973955889 != 0 ? 1 : 0) * 1776888457;
      }

   }

   void decode(Packet var1) {
      while(true) {
         int var3 = var1.g1();
         if (var3 == 0) {
            return;
         }

         this.au(var1, var3, (byte)16);
      }
   }

   void au(Packet var1, int var2, byte var3) {
      int var4;
      int var5;
      if (var2 == 1) {
         if (var3 == -1) {
            throw new IllegalStateException();
         }

         var4 = var1.g1();
         if (var4 > 0) {
            if (var3 == -1) {
               return;
            }

            if (this.aa != null) {
               if (var3 == -1) {
                  throw new IllegalStateException();
               }

               if (!af) {
                  var1.at += -254100545 * var4;
                  return;
               }

               if (var3 == -1) {
                  return;
               }
            }

            this.ay = new int[var4];
            this.aa = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               if (var3 == -1) {
                  throw new IllegalStateException();
               }

               this.aa[var5] = var1.cl();
               this.ay[var5] = var1.g1();
            }
         }
      } else if (var2 == 2) {
         this.ao = var1.cw();
      } else if (var2 == 5) {
         if (var3 == -1) {
            throw new IllegalStateException();
         }

         var4 = var1.g1();
         if (var4 > 0) {
            if (this.aa != null && !af) {
               var1.at += var4 * 1262255402;
            } else {
               this.ay = null;
               this.aa = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 == -1) {
                     throw new IllegalStateException();
                  }

                  this.aa[var5] = var1.cl();
               }
            }
         }
      } else if (var2 == 14) {
         if (var3 == -1) {
            return;
         }

         this.av = var1.g1() * 1205654711;
      } else if (15 == var2) {
         if (var3 == -1) {
            throw new IllegalStateException();
         }

         this.ar = var1.g1() * 1159818229;
      } else if (var2 == 17) {
         if (var3 == -1) {
            throw new IllegalStateException();
         }

         this.am = 0;
         this.as = false;
      } else if (var2 == 18) {
         this.as = false;
      } else if (var2 == 19) {
         if (var3 == -1) {
            throw new IllegalStateException();
         }

         this.aj = var1.g1() * 1041321269;
      } else if (var2 == 21) {
         if (var3 == -1) {
            throw new IllegalStateException();
         }

         this.ak = 0;
      } else if (var2 == 22) {
         if (var3 == -1) {
            throw new IllegalStateException();
         }

         this.az = true;
      } else if (23 == var2) {
         this.ad = true;
      } else if (var2 == 24) {
         this.ae = var1.cl() * -1142530427;
         if (65535 == 1292954189 * this.ae) {
            if (var3 == -1) {
               throw new IllegalStateException();
            }

            this.ae = 1142530427;
         }
      } else if (27 == var2) {
         if (var3 == -1) {
            throw new IllegalStateException();
         }

         this.am = 1356917295;
      } else if (var2 == 28) {
         if (var3 == -1) {
            throw new IllegalStateException();
         }

         this.ap = var1.g1() * -1893671375;
      } else if (var2 == 29) {
         if (var3 == -1) {
            throw new IllegalStateException();
         }

         this.by = var1.g1s() * 524532799;
      } else if (39 == var2) {
         this.bb = var1.g1s() * -1238182971;
      } else {
         if (var2 >= 30) {
            if (var3 == -1) {
               throw new IllegalStateException();
            }

            if (var2 < 35) {
               this.bi[var2 - 30] = var1.cw();
               if (this.bi[var2 - 30].equalsIgnoreCase(Strings.ac)) {
                  if (var3 == -1) {
                     throw new IllegalStateException();
                  }

                  this.bi[var2 - 30] = null;
               }

               return;
            }
         }

         if (var2 == 40) {
            if (var3 == -1) {
               throw new IllegalStateException();
            }

            var4 = var1.g1();
            this.ax = new short[var4];
            this.ai = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.ax[var5] = (short)var1.cl();
               this.ai[var5] = (short)var1.cl();
            }
         } else if (var2 == 41) {
            if (var3 == -1) {
               return;
            }

            var4 = var1.g1();
            this.ag = new short[var4];
            this.ah = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               if (var3 == -1) {
                  throw new IllegalStateException();
               }

               this.ag[var5] = (short)var1.cl();
               this.ah[var5] = (short)var1.cl();
            }
         } else if (61 == var2) {
            var1.cl();
         } else if (62 == var2) {
            if (var3 == -1) {
               throw new IllegalStateException();
            }

            this.bx = true;
         } else if (64 == var2) {
            if (var3 == -1) {
               throw new IllegalStateException();
            }

            this.bo = false;
         } else if (65 == var2) {
            if (var3 == -1) {
               throw new IllegalStateException();
            }

            this.bz = var1.cl() * 1039146105;
         } else if (var2 == 66) {
            if (var3 == -1) {
               throw new IllegalStateException();
            }

            this.bm = var1.cl() * -677695703;
         } else if (var2 == 67) {
            if (var3 == -1) {
               return;
            }

            this.bd = var1.cl() * 1862946657;
         } else if (var2 == 68) {
            this.bk = var1.cl() * -476568133;
         } else if (69 == var2) {
            if (var3 == -1) {
               throw new IllegalStateException();
            }

            var1.g1();
         } else if (var2 == 70) {
            if (var3 == -1) {
               throw new IllegalStateException();
            }

            this.bt = var1.cg() * -327422321;
         } else if (71 == var2) {
            if (var3 == -1) {
               throw new IllegalStateException();
            }

            this.bj = var1.cg() * 956024773;
         } else if (72 == var2) {
            if (var3 == -1) {
               return;
            }

            this.bn = var1.cg() * -127229215;
         } else if (73 == var2) {
            if (var3 == -1) {
               return;
            }

            this.bs = true;
         } else if (74 == var2) {
            if (var3 == -1) {
               throw new IllegalStateException();
            }

            this.br = true;
         } else if (var2 == 75) {
            if (var3 == -1) {
               return;
            }

            this.bg = var1.g1() * 1776888457;
         } else {
            if (var2 != 77) {
               if (var2 != 92) {
                  if (78 == var2) {
                     if (var3 == -1) {
                        throw new IllegalStateException();
                     }

                     this.ba = var1.cl() * -38705135;
                     this.bv = var1.g1() * 1190823625;
                     return;
                  } else if (var2 == 79) {
                     if (var3 == -1) {
                        throw new IllegalStateException();
                     }

                     this.bl = var1.cl() * 1257958995;
                     this.bp = var1.cl() * 230715233;
                     this.bv = var1.g1() * 1190823625;
                     var4 = var1.g1();
                     this.bc = new int[var4];

                     for(var5 = 0; var5 < var4; ++var5) {
                        this.bc[var5] = var1.cl();
                     }

                     return;
                  } else if (81 == var2) {
                     this.ak = var1.g1() * 708044032;
                     return;
                  } else if (var2 == 82) {
                     if (var3 == -1) {
                        return;
                     }

                     this.be = var1.cl() * -1683785829;
                     return;
                  } else {
                     if (89 == var2) {
                        if (var3 == -1) {
                           throw new IllegalStateException();
                        }

                        this.bh = false;
                     } else if (var2 == 249) {
                        this.bw = ChatChannel.readStringIntParameters(var1, this.bw);
                        return;
                     }

                     return;
                  }
               }

               if (var3 == -1) {
                  throw new IllegalStateException();
               }
            }

            this.bf = var1.cl() * 1157714067;
            if (1411927451 * this.bf == 65535) {
               if (var3 == -1) {
                  return;
               }

               this.bf = -1157714067;
            }

            this.bq = var1.cl() * -1863808827;
            if (1685173773 * this.bq == 65535) {
               this.bq = 1863808827;
            }

            var4 = -1;
            if (var2 == 92) {
               if (var3 == -1) {
                  throw new IllegalStateException();
               }

               var4 = var1.cl();
               if (65535 == var4) {
                  if (var3 == -1) {
                     return;
                  }

                  var4 = -1;
               }
            }

            var5 = var1.g1();
            this.bu = new int[var5 + 2];

            for(int var6 = 0; var6 <= var5; ++var6) {
               this.bu[var6] = var1.cl();
               if (this.bu[var6] == 65535) {
                  if (var3 == -1) {
                     throw new IllegalStateException();
                  }

                  this.bu[var6] = -1;
               }
            }

            this.bu[1 + var5] = var4;
         }
      }

   }

   public final boolean ab(int var1) {
      if (this.ay != null) {
         for(int var5 = 0; var5 < this.ay.length; ++var5) {
            if (this.ay[var5] == var1) {
               return go.aw.tryLoadFile(this.aa[var5] & '\uffff', 0);
            }
         }

         return true;
      } else if (null == this.aa) {
         return true;
      } else if (var1 != 10) {
         return true;
      } else {
         boolean var3 = true;

         for(int var4 = 0; var4 < this.aa.length; ++var4) {
            var3 &= go.aw.tryLoadFile(this.aa[var4] & '\uffff', 0);
         }

         return var3;
      }
   }

   public final boolean loadChatHeadModel() {
      if (this.aa == null) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.aa.length; ++var3) {
            var2 &= go.aw.tryLoadFile(this.aa[var3] & '\uffff', 0);
         }

         return var2;
      }
   }

   public final Entity al(int var1, int var2, int[][] var3, int var4, int var5, int var6, byte var7) {
      long var8;
      if (this.ay == null) {
         if (var7 >= -1) {
            throw new IllegalStateException();
         }

         var8 = (long)((this.at * -1529817365 << 10) + var2);
      } else {
         var8 = (long)(var2 + (-1529817365 * this.at << 10) + (var1 << 3));
      }

      Object var10 = (Entity)ab.get(var8);
      if (null == var10) {
         if (var7 >= -1) {
            throw new IllegalStateException();
         }

         UnlitModel var11 = this.ay(var1, var2);
         if (var11 == null) {
            if (var7 >= -1) {
               throw new IllegalStateException();
            }

            return null;
         }

         if (!this.az) {
            if (var7 >= -1) {
               throw new IllegalStateException();
            }

            var10 = var11.bb(64 + this.by * 1284125631, 768 + -18088891 * this.bb, -50, -10, -50);
         } else {
            var11.bo = (short)(1284125631 * this.by + 64);
            var11.bz = (short)(this.bb * -18088891 + 768);
            var11.ad();
            var10 = var11;
         }

         ab.put((DualNode)var10, var8);
      }

      if (this.az) {
         if (var7 >= -1) {
            throw new IllegalStateException();
         }

         var10 = ((UnlitModel)var10).ao();
      }

      if (-1437543955 * this.ak >= 0) {
         if (var7 >= -1) {
            throw new IllegalStateException();
         }

         if (var10 instanceof it) {
            var10 = ((it)var10).at(var3, var4, var5, var6, true, this.ak * -1437543955);
         } else if (var10 instanceof UnlitModel) {
            if (var7 >= -1) {
               throw new IllegalStateException();
            }

            var10 = ((UnlitModel)var10).ax(var3, var4, var5, var6, true, -1437543955 * this.ak);
         }
      }

      return (Entity)var10;
   }

   public final it at(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var8;
      if (null == this.ay) {
         var8 = (long)((-1529817365 * this.at << 10) + var2);
      } else {
         var8 = (long)((this.at * -1529817365 << 10) + (var1 << 3) + var2);
      }

      it var10 = (it)aq.get(var8);
      if (var10 == null) {
         UnlitModel var11 = this.ay(var1, var2);
         if (var11 == null) {
            return null;
         }

         var10 = var11.bb(this.by * 1284125631 + 64, 768 + -18088891 * this.bb, -50, -10, -50);
         aq.put(var10, var8);
      }

      if (this.ak * -1437543955 >= 0) {
         var10 = var10.at(var3, var4, var5, var6, true, -1437543955 * this.ak);
      }

      return var10;
   }

   public final it aa(int var1, int var2, int[][] var3, int var4, int var5, int var6, SeqType var7, int var8) {
      long var10;
      if (null == this.ay) {
         var10 = (long)(var2 + (this.at * -1529817365 << 10));
      } else {
         var10 = (long)(var2 + (this.at * -1529817365 << 10) + (var1 << 3));
      }

      it var12 = (it)aq.get(var10);
      if (var12 == null) {
         UnlitModel var13 = this.ay(var1, var2);
         if (var13 == null) {
            return null;
         }

         var12 = var13.bb(64 + this.by * 1284125631, 768 + this.bb * -18088891, -50, -10, -50);
         aq.put(var12, var10);
      }

      if (var7 == null && -1 == this.ak * -1437543955) {
         return var12;
      } else {
         if (null != var7) {
            var12 = var7.aq(var12, var8, var2);
         } else {
            var12 = var12.aa(true);
         }

         if (-1437543955 * this.ak >= 0) {
            var12 = var12.at(var3, var4, var5, var6, false, -1437543955 * this.ak);
         }

         return var12;
      }
   }

   final UnlitModel ay(int var1, int var2) {
      UnlitModel var4 = null;
      boolean var5;
      int var6;
      int var8;
      if (this.ay == null) {
         if (var1 != 10) {
            return null;
         }

         if (null == this.aa) {
            return null;
         }

         var5 = this.bx;
         if (2 == var1 && var2 > 3) {
            var5 = !var5;
         }

         var6 = this.aa.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            var8 = this.aa[var7];
            if (var5) {
               var8 += 65536;
            }

            var4 = (UnlitModel)au.get((long)var8);
            if (null == var4) {
               var4 = UnlitModel.af_renamed(go.aw, var8 & '\uffff', 0);
               if (var4 == null) {
                  return null;
               }

               if (var5) {
                  var4.ak();
               }

               au.put(var4, (long)var8);
            }

            if (var6 > 1) {
               al[var7] = var4;
            }
         }

         if (var6 > 1) {
            var4 = new UnlitModel(al, var6);
         }
      } else {
         int var9 = -1;

         for(var6 = 0; var6 < this.ay.length; ++var6) {
            if (this.ay[var6] == var1) {
               var9 = var6;
               break;
            }
         }

         if (var9 == -1) {
            return null;
         }

         var6 = this.aa[var9];
         boolean var10 = this.bx ^ var2 > 3;
         if (var10) {
            var6 += 65536;
         }

         var4 = (UnlitModel)au.get((long)var6);
         if (null == var4) {
            var4 = UnlitModel.af_renamed(go.aw, var6 & '\uffff', 0);
            if (null == var4) {
               return null;
            }

            if (var10) {
               var4.ak();
            }

            au.put(var4, (long)var6);
         }
      }

      if (128 == this.bz * -60584503 && 128 == -950870759 * this.bm && -1734306655 * this.bd == 128) {
         var5 = false;
      } else {
         var5 = true;
      }

      boolean var11;
      if (105607279 * this.bt == 0 && 0 == this.bj * -1068622067 && this.bn * 629285153 == 0) {
         var11 = false;
      } else {
         var11 = true;
      }

      UnlitModel var12 = new UnlitModel(var4, 0 == var2 && !var5 && !var11, this.ax == null, this.ag == null, true);
      if (4 == var1 && var2 > 3) {
         var12.ar(256);
         var12.am(45, 0, -45);
      }

      var2 &= 3;
      if (1 == var2) {
         var12.ag();
      } else if (var2 == 2) {
         var12.ah();
      } else if (var2 == 3) {
         var12.av();
      }

      if (this.ax != null) {
         for(var8 = 0; var8 < this.ax.length; ++var8) {
            var12.recolor(this.ax[var8], this.ai[var8]);
         }
      }

      if (null != this.ag) {
         for(var8 = 0; var8 < this.ag.length; ++var8) {
            var12.retexture(this.ag[var8], this.ah[var8]);
         }
      }

      if (var5) {
         var12.az(this.bz * -60584503, this.bm * -950870759, -1734306655 * this.bd);
      }

      if (var11) {
         var12.am(105607279 * this.bt, this.bj * -1068622067, this.bn * 629285153);
      }

      return var12;
   }

   public final hq ao() {
      int var2 = -1;
      if (-1 != 1411927451 * this.bf) {
         var2 = WorldMapSection1.af_renamed(1411927451 * this.bf);
      } else if (1685173773 * this.bq != -1) {
         var2 = Varps.aw[this.bq * 1685173773];
      }

      int var3;
      if (var2 >= 0 && var2 < this.bu.length - 1) {
         var3 = this.bu[var2];
      } else {
         var3 = this.bu[this.bu.length - 1];
      }

      return -1 != var3 ? fw.an_renamed(var3) : null;
   }

   public int ax(int var1, int var2) {
      IterableNodeHashTable var5 = this.bw;
      int var4;
      if (null == var5) {
         var4 = var2;
      } else {
         IntegerNode var6 = (IntegerNode)var5.get((long)var1);
         if (null == var6) {
            var4 = var2;
         } else {
            var4 = var6.af;
         }
      }

      return var4;
   }

   public String ai(int var1, String var2) {
      return EnumType.an_renamed(this.bw, var1, var2);
   }

   public boolean ah() {
      if (this.bu == null) {
         return this.ba * 1970571505 != -1 || null != this.bc;
      } else {
         for(int var2 = 0; var2 < this.bu.length; ++var2) {
            if (-1 != this.bu[var2]) {
               hq var3 = fw.an_renamed(this.bu[var2]);
               if (-1 != 1970571505 * var3.ba || var3.bc != null) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   static int ae_renamed(int var0, ClientScript var1, boolean var2) {
      if (var0 == 3200) {
         Interpreter.at -= 1281407919;
         fh.he_renamed(Interpreter.al[Interpreter.at * -964267539], Interpreter.al[1 + -964267539 * Interpreter.at], Interpreter.al[Interpreter.at * -964267539 + 2]);
         return 1;
      } else if (var0 == 3201) {
         an.hf_renamed(Interpreter.al[(Interpreter.at -= 427135973) * -964267539]);
         return 1;
      } else if (var0 == 3202) {
         Interpreter.at -= 854271946;
         CollisionMap.hy_renamed(Interpreter.al[Interpreter.at * -964267539], Interpreter.al[-964267539 * Interpreter.at + 1]);
         return 1;
      } else {
         dt var4;
         dk var5;
         int var6;
         int var7;
         String var10;
         if (var0 != 3212 && 3213 != var0 && var0 != 3209 && var0 != 3181 && 3203 != var0 && var0 != 3205 && 3207 != var0) {
            boolean var9;
            if (var0 != 3214 && var0 != 3215 && 3210 != var0 && 3182 != var0 && var0 != 3204 && var0 != 3206 && 3208 != var0) {
               if (3211 == var0) {
                  return 1;
               } else {
                  int var11;
                  int var13;
                  if (3216 == var0) {
                     var11 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                     var13 = 0;
                     dt var17 = (dt)StructType.findEnumerated(ArchiveDiskAction.au_renamed(), var11);
                     if (var17 != null) {
                        var13 = dt.af != var17 ? 1 : 0;
                     }

                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var13;
                     return 1;
                  } else if (3218 == var0) {
                     var11 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                     var13 = 0;
                     dk var16 = (dk)StructType.findEnumerated(em.au_renamed(), var11);
                     if (var16 != null) {
                        var13 = var16 != dk.af ? 1 : 0;
                     }

                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var13;
                     return 1;
                  } else if (3217 != var0 && var0 != 3219) {
                     return 2;
                  } else {
                     var4 = dt.af;
                     var5 = dk.af;
                     var9 = true;
                     boolean var15 = true;
                     int var8;
                     if (3217 == var0) {
                        var8 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                        var4 = (dt)StructType.findEnumerated(ArchiveDiskAction.au_renamed(), var8);
                        if (null == var4) {
                           throw new RuntimeException(String.format("Unrecognized device option %d", var8));
                        }
                     }

                     if (var0 == 3219) {
                        var8 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                        var5 = (dk)StructType.findEnumerated(em.au_renamed(), var8);
                        if (null == var5) {
                           throw new RuntimeException(String.format("Unrecognized game option %d", var8));
                        }
                     }

                     String var12;
                     byte var14;
                     if (dk.af == var5) {
                        switch (-2060299987 * var4.aq) {
                           case 1:
                           case 2:
                           case 3:
                              var14 = 0;
                              var7 = 1;
                              break;
                           case 4:
                              var14 = 0;
                              var7 = Integer.MAX_VALUE;
                              break;
                           case 5:
                              var14 = 0;
                              var7 = 100;
                              break;
                           default:
                              var12 = String.format("Unkown device option: %s.", var4.toString());
                              throw new RuntimeException(var12);
                        }
                     } else {
                        switch (358560065 * var5.ab) {
                           case 1:
                              var14 = 0;
                              var7 = 1;
                              break;
                           case 2:
                           case 3:
                           case 4:
                              var14 = 0;
                              var7 = 100;
                              break;
                           default:
                              var12 = String.format("Unkown game option: %s.", var5.toString());
                              throw new RuntimeException(var12);
                        }
                     }

                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var14;
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var7;
                     return 1;
                  }
               }
            } else {
               var4 = dt.af;
               var5 = dk.af;
               var9 = false;
               if (3214 == var0) {
                  var7 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                  var4 = (dt)StructType.findEnumerated(ArchiveDiskAction.au_renamed(), var7);
                  if (var4 == null) {
                     throw new RuntimeException(String.format("Unrecognized device option %d", var7));
                  }
               }

               if (var0 == 3215) {
                  var7 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                  var5 = (dk)StructType.findEnumerated(em.au_renamed(), var7);
                  if (null == var5) {
                     throw new RuntimeException(String.format("Unrecognized game option %d", var7));
                  }
               }

               if (3210 == var0) {
                  var7 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                  var4 = (dt)StructType.findEnumerated(ArchiveDiskAction.au_renamed(), var7);
                  if (var4 == null) {
                     var5 = (dk)StructType.findEnumerated(em.au_renamed(), var7);
                     if (var5 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var7));
                     }
                  }
               } else if (3182 == var0) {
                  var4 = dt.ab;
               } else if (var0 == 3204) {
                  var5 = dk.aw;
               } else if (var0 == 3206) {
                  var5 = dk.ac;
               } else if (var0 == 3208) {
                  var5 = dk.au;
               }

               if (var5 == dk.af) {
                  switch (var4.aq * -2060299987) {
                     case 1:
                        var6 = aj.vb.al() ? 1 : 0;
                        break;
                     case 2:
                        var6 = aj.vb.aa() ? 1 : 0;
                        break;
                     case 3:
                        var6 = aj.vb.ax() ? 1 : 0;
                        break;
                     case 4:
                        var6 = aj.vb.ag();
                        break;
                     case 5:
                        var6 = da.mh_renamed();
                        break;
                     default:
                        var10 = String.format("Unkown device option: %s.", var4.toString());
                        throw new RuntimeException(var10);
                  }
               } else {
                  switch (var5.ab * 358560065) {
                     case 1:
                        var6 = aj.vb.ab() ? 1 : 0;
                        break;
                     case 2:
                        var7 = aj.vb.am();
                        var6 = Math.round((float)(var7 * 100) / 255.0F);
                        break;
                     case 3:
                        var7 = aj.vb.aj();
                        var6 = Math.round((float)(var7 * 100) / 127.0F);
                        break;
                     case 4:
                        var7 = aj.vb.az();
                        var6 = Math.round((float)(100 * var7) / 127.0F);
                        break;
                     default:
                        var10 = String.format("Unkown game option: %s.", var5.toString());
                        throw new RuntimeException(var10);
                  }
               }

               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var6;
               return 1;
            }
         } else {
            var4 = dt.af;
            var5 = dk.af;
            var6 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
            if (3212 == var0) {
               var7 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
               var4 = (dt)StructType.findEnumerated(ArchiveDiskAction.au_renamed(), var7);
               if (var4 == null) {
                  throw new RuntimeException(String.format("Unrecognized device option %d", var7));
               }
            }

            if (var0 == 3213) {
               var7 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
               var5 = (dk)StructType.findEnumerated(em.au_renamed(), var7);
               if (var5 == null) {
                  throw new RuntimeException(String.format("Unrecognized game option %d", var7));
               }
            }

            if (var0 == 3209) {
               var7 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
               var4 = (dt)StructType.findEnumerated(ArchiveDiskAction.au_renamed(), var7);
               if (null == var4) {
                  var5 = (dk)StructType.findEnumerated(em.au_renamed(), var7);
                  if (null == var5) {
                     throw new RuntimeException(String.format("Unrecognized client option %d", var7));
                  }
               }
            } else if (var0 == 3181) {
               var4 = dt.ab;
            } else if (var0 == 3203) {
               var5 = dk.aw;
            } else if (3205 == var0) {
               var5 = dk.ac;
            } else if (3207 == var0) {
               var5 = dk.au;
            }

            if (dk.af == var5) {
               switch (-2060299987 * var4.aq) {
                  case 1:
                     aj.vb.aq(1 == var6);
                     break;
                  case 2:
                     aj.vb.at(1 == var6);
                     break;
                  case 3:
                     aj.vb.ay(1 == var6);
                     break;
                  case 4:
                     if (var6 < 0) {
                        var6 = 0;
                     }

                     aj.vb.ai(var6);
                     break;
                  case 5:
                     cm.mc_renamed(var6);
                     break;
                  default:
                     var10 = String.format("Unkown device option: %s.", var4.toString());
                     throw new RuntimeException(var10);
               }
            } else {
               switch (var5.ab * 358560065) {
                  case 1:
                     aj.vb.au(var6 == 1);
                     break;
                  case 2:
                     var6 = Math.min(Math.max(var6, 0), 100);
                     var7 = Math.round((float)(255 * var6) / 100.0F);
                     dt.mo_renamed(var7);
                     break;
                  case 3:
                     var6 = Math.min(Math.max(var6, 0), 100);
                     var7 = Math.round((float)(127 * var6) / 100.0F);
                     fe.mn_renamed(var7);
                     break;
                  case 4:
                     var6 = Math.min(Math.max(var6, 0), 100);
                     var7 = Math.round((float)(127 * var6) / 100.0F);
                     fp.mi_renamed(var7);
                     break;
                  default:
                     var10 = String.format("Unkown game option: %s.", var5.toString());
                     throw new RuntimeException(var10);
               }
            }

            return 1;
         }
      }
   }
}
