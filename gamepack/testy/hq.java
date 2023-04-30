import accessors.RSLocType;

public class hq extends rk implements RSLocType {
   short[] ah;
   static nm an;
   static kh ac = new kh(4096);
   public static kh au = new kh(500);
   static kh ab = new kh(30);
   int bd;
   static iz[] al = new iz[4];
   int by;
   int[] aa;
   int[] ay;
   public int ae;
   public int[] bc;
   short[] ai;
   short[] ag;
   short[] ax;
   public int av;
   public int ar;
   public String[] bi;
   public boolean as;
   public int aj;
   int ak;
   public int am;
   public boolean ad;
   boolean az;
   public int ap;
   public int be;
   int bb;
   public String ao;
   static kh aq = new kh(30);
   public int at;
   boolean bx;
   public boolean bo;
   int bz;
   int bm;
   static boolean af = false;
   int bt;
   int bj;
   int bn;
   public boolean bs;
   boolean br;
   public int bk;
   public int[] bu;
   int bf;
   int bq;
   public int ba;
   public int bv;
   ro bw;
   public int bp;
   public int bl;
   public boolean bh;
   public int bg;

   void az(sg var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.cm((byte)7);
         if (var3 > 0) {
            if (this.aa != null && !af) {
               var1.at += -254100545 * var3;
            } else {
               this.ay = new int[var3];
               this.aa = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.aa[var4] = var1.cl(-797865563);
                  this.ay[var4] = var1.cm((byte)7);
               }
            }
         }
      } else if (var2 == 2) {
         this.ao = var1.cw((byte)0);
      } else if (var2 == 5) {
         var3 = var1.cm((byte)7);
         if (var3 > 0) {
            if (this.aa != null && !af) {
               var1.at += var3 * 1262255402;
            } else {
               this.ay = null;
               this.aa = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.aa[var4] = var1.cl(824115707);
               }
            }
         }
      } else if (var2 == 14) {
         this.av = var1.cm((byte)7) * 1205654711;
      } else if (15 == var2) {
         this.ar = var1.cm((byte)7) * 1159818229;
      } else if (var2 == 17) {
         this.am = 0;
         this.as = false;
      } else if (var2 == 18) {
         this.as = false;
      } else if (var2 == 19) {
         this.aj = var1.cm((byte)7) * 1041321269;
      } else if (var2 == 21) {
         this.ak = 0;
      } else if (var2 == 22) {
         this.az = true;
      } else if (23 == var2) {
         this.ad = true;
      } else if (var2 == 24) {
         this.ae = var1.cl(293346868) * -1142530427;
         if (65535 == 1292954189 * this.ae) {
            this.ae = 1142530427;
         }
      } else if (27 == var2) {
         this.am = 1356917295;
      } else if (var2 == 28) {
         this.ap = var1.cm((byte)7) * -1893671375;
      } else if (var2 == 29) {
         this.by = var1.cf(435772489) * 524532799;
      } else if (39 == var2) {
         this.bb = var1.cf(435772489) * -1238182971;
      } else if (var2 >= 30 && var2 < 35) {
         this.bi[var2 - 30] = var1.cw((byte)0);
         if (this.bi[var2 - 30].equalsIgnoreCase(mk.ac)) {
            this.bi[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var3 = var1.cm((byte)7);
         this.ax = new short[var3];
         this.ai = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ax[var4] = (short)var1.cl(594232540);
            this.ai[var4] = (short)var1.cl(-277420877);
         }
      } else if (var2 == 41) {
         var3 = var1.cm((byte)7);
         this.ag = new short[var3];
         this.ah = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ag[var4] = (short)var1.cl(-463043824);
            this.ah[var4] = (short)var1.cl(-619252906);
         }
      } else if (61 == var2) {
         var1.cl(133141665);
      } else if (62 == var2) {
         this.bx = true;
      } else if (64 == var2) {
         this.bo = false;
      } else if (65 == var2) {
         this.bz = var1.cl(-359590807) * 1039146105;
      } else if (var2 == 66) {
         this.bm = var1.cl(-1427205830) * -677695703;
      } else if (var2 == 67) {
         this.bd = var1.cl(-25281735) * 1862946657;
      } else if (var2 == 68) {
         this.bk = var1.cl(143546544) * -476568133;
      } else if (69 == var2) {
         var1.cm((byte)7);
      } else if (var2 == 70) {
         this.bt = var1.cg((byte)-73) * -327422321;
      } else if (71 == var2) {
         this.bj = var1.cg((byte)-39) * 956024773;
      } else if (72 == var2) {
         this.bn = var1.cg((byte)8) * -127229215;
      } else if (73 == var2) {
         this.bs = true;
      } else if (74 == var2) {
         this.br = true;
      } else if (var2 == 75) {
         this.bg = var1.cm((byte)7) * 1776888457;
      } else if (var2 != 77 && var2 != 92) {
         if (78 == var2) {
            this.ba = var1.cl(397487416) * -38705135;
            this.bv = var1.cm((byte)7) * 1190823625;
         } else if (var2 == 79) {
            this.bl = var1.cl(-27524667) * 1257958995;
            this.bp = var1.cl(694248063) * 230715233;
            this.bv = var1.cm((byte)7) * 1190823625;
            var3 = var1.cm((byte)7);
            this.bc = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.bc[var4] = var1.cl(-1649217402);
            }
         } else if (81 == var2) {
            this.ak = var1.cm((byte)7) * 708044032;
         } else if (var2 == 82) {
            this.be = var1.cl(-1357953624) * -1683785829;
         } else if (89 == var2) {
            this.bh = false;
         } else if (var2 == 249) {
            this.bw = cp.af(var1, this.bw, (byte)-33);
         }
      } else {
         this.bf = var1.cl(366288798) * 1157714067;
         if (1411927451 * this.bf == 65535) {
            this.bf = -1157714067;
         }

         this.bq = var1.cl(-939707830) * -1863808827;
         if (1685173773 * this.bq == 65535) {
            this.bq = 1863808827;
         }

         var3 = -1;
         if (var2 == 92) {
            var3 = var1.cl(438938570);
            if (65535 == var3) {
               var3 = -1;
            }
         }

         var4 = var1.cm((byte)7);
         this.bu = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.bu[var5] = var1.cl(534843065);
            if (this.bu[var5] == 65535) {
               this.bu[var5] = -1;
            }
         }

         this.bu[1 + var4] = var3;
      }

   }

   void aw(byte var1) {
      try {
         if (this.aj * 415653149 == -1) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            this.aj = 0;
            if (null != this.aa) {
               label70: {
                  if (null != this.ay) {
                     if (var1 <= 1) {
                        return;
                     }

                     if (this.ay[0] != 10) {
                        break label70;
                     }
                  }

                  this.aj = 1041321269;
               }
            }

            for(int var2 = 0; var2 < 5; ++var2) {
               if (this.bi[var2] != null) {
                  this.aj = 1041321269;
               }
            }
         }

         if (-1 == -1850643527 * this.bg) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            byte var10001;
            if (this.am * -973955889 != 0) {
               if (var1 <= 1) {
                  return;
               }

               var10001 = 1;
            } else {
               var10001 = 0;
            }

            this.bg = var10001 * 1776888457;
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "hq.aw(" + ')');
      }
   }

   void ac(sg var1, int var2) {
      try {
         while(true) {
            int var3 = var1.cm((byte)7);
            if (var3 == 0) {
               if (var2 <= -1047808758) {
                  return;
               }

               return;
            }

            this.au(var1, var3, (byte)16);
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "hq.ac(" + ')');
      }
   }

   void au(sg var1, int var2, byte var3) {
      try {
         int var4;
         int var5;
         if (var2 == 1) {
            if (var3 == -1) {
               throw new IllegalStateException();
            }

            var4 = var1.cm((byte)7);
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

                  this.aa[var5] = var1.cl(-1452279273);
                  this.ay[var5] = var1.cm((byte)7);
               }
            }
         } else if (var2 == 2) {
            this.ao = var1.cw((byte)0);
         } else if (var2 == 5) {
            if (var3 == -1) {
               throw new IllegalStateException();
            }

            var4 = var1.cm((byte)7);
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

                     this.aa[var5] = var1.cl(856545210);
                  }
               }
            }
         } else if (var2 == 14) {
            if (var3 == -1) {
               return;
            }

            this.av = var1.cm((byte)7) * 1205654711;
         } else if (15 == var2) {
            if (var3 == -1) {
               throw new IllegalStateException();
            }

            this.ar = var1.cm((byte)7) * 1159818229;
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

            this.aj = var1.cm((byte)7) * 1041321269;
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
            this.ae = var1.cl(-1984039376) * -1142530427;
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

            this.ap = var1.cm((byte)7) * -1893671375;
         } else if (var2 == 29) {
            if (var3 == -1) {
               throw new IllegalStateException();
            }

            this.by = var1.cf(435772489) * 524532799;
         } else if (39 == var2) {
            this.bb = var1.cf(435772489) * -1238182971;
         } else {
            if (var2 >= 30) {
               if (var3 == -1) {
                  throw new IllegalStateException();
               }

               if (var2 < 35) {
                  this.bi[var2 - 30] = var1.cw((byte)0);
                  if (this.bi[var2 - 30].equalsIgnoreCase(mk.ac)) {
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

               var4 = var1.cm((byte)7);
               this.ax = new short[var4];
               this.ai = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.ax[var5] = (short)var1.cl(780781429);
                  this.ai[var5] = (short)var1.cl(-898629482);
               }
            } else if (var2 == 41) {
               if (var3 == -1) {
                  return;
               }

               var4 = var1.cm((byte)7);
               this.ag = new short[var4];
               this.ah = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 == -1) {
                     throw new IllegalStateException();
                  }

                  this.ag[var5] = (short)var1.cl(-646955319);
                  this.ah[var5] = (short)var1.cl(-1186018024);
               }
            } else if (61 == var2) {
               var1.cl(-611613382);
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

               this.bz = var1.cl(-1676166404) * 1039146105;
            } else if (var2 == 66) {
               if (var3 == -1) {
                  throw new IllegalStateException();
               }

               this.bm = var1.cl(-1266856253) * -677695703;
            } else if (var2 == 67) {
               if (var3 == -1) {
                  return;
               }

               this.bd = var1.cl(-635017095) * 1862946657;
            } else if (var2 == 68) {
               this.bk = var1.cl(-2061884866) * -476568133;
            } else if (69 == var2) {
               if (var3 == -1) {
                  throw new IllegalStateException();
               }

               var1.cm((byte)7);
            } else if (var2 == 70) {
               if (var3 == -1) {
                  throw new IllegalStateException();
               }

               this.bt = var1.cg((byte)-65) * -327422321;
            } else if (71 == var2) {
               if (var3 == -1) {
                  throw new IllegalStateException();
               }

               this.bj = var1.cg((byte)-38) * 956024773;
            } else if (72 == var2) {
               if (var3 == -1) {
                  return;
               }

               this.bn = var1.cg((byte)-28) * -127229215;
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

               this.bg = var1.cm((byte)7) * 1776888457;
            } else {
               if (var2 != 77) {
                  if (var2 != 92) {
                     if (78 == var2) {
                        if (var3 == -1) {
                           throw new IllegalStateException();
                        }

                        this.ba = var1.cl(-1713656342) * -38705135;
                        this.bv = var1.cm((byte)7) * 1190823625;
                        return;
                     } else if (var2 == 79) {
                        if (var3 == -1) {
                           throw new IllegalStateException();
                        }

                        this.bl = var1.cl(-1181862673) * 1257958995;
                        this.bp = var1.cl(-905484374) * 230715233;
                        this.bv = var1.cm((byte)7) * 1190823625;
                        var4 = var1.cm((byte)7);
                        this.bc = new int[var4];

                        for(var5 = 0; var5 < var4; ++var5) {
                           this.bc[var5] = var1.cl(-1316711094);
                        }

                        return;
                     } else if (81 == var2) {
                        this.ak = var1.cm((byte)7) * 708044032;
                        return;
                     } else if (var2 == 82) {
                        if (var3 == -1) {
                           return;
                        }

                        this.be = var1.cl(-1961096702) * -1683785829;
                        return;
                     } else {
                        if (89 == var2) {
                           if (var3 == -1) {
                              throw new IllegalStateException();
                           }

                           this.bh = false;
                        } else if (var2 == 249) {
                           this.bw = cp.af(var1, this.bw, (byte)-79);
                           return;
                        }

                        return;
                     }
                  }

                  if (var3 == -1) {
                     throw new IllegalStateException();
                  }
               }

               this.bf = var1.cl(-54438080) * 1157714067;
               if (1411927451 * this.bf == 65535) {
                  if (var3 == -1) {
                     return;
                  }

                  this.bf = -1157714067;
               }

               this.bq = var1.cl(-1244092173) * -1863808827;
               if (1685173773 * this.bq == 65535) {
                  this.bq = 1863808827;
               }

               var4 = -1;
               if (var2 == 92) {
                  if (var3 == -1) {
                     throw new IllegalStateException();
                  }

                  var4 = var1.cl(-423137913);
                  if (65535 == var4) {
                     if (var3 == -1) {
                        return;
                     }

                     var4 = -1;
                  }
               }

               var5 = var1.cm((byte)7);
               this.bu = new int[var5 + 2];

               for(int var6 = 0; var6 <= var5; ++var6) {
                  this.bu[var6] = var1.cl(-95483605);
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

      } catch (RuntimeException var7) {
         throw db.an(var7, "hq.au(" + ')');
      }
   }

   public final boolean ab(int var1, int var2) {
      try {
         if (this.ay == null) {
            if (var2 == -1754346109) {
               throw new IllegalStateException();
            } else if (null == this.aa) {
               if (var2 == -1754346109) {
                  throw new IllegalStateException();
               } else {
                  return true;
               }
            } else if (var1 != 10) {
               if (var2 == -1754346109) {
                  throw new IllegalStateException();
               } else {
                  return true;
               }
            } else {
               boolean var6 = true;

               for(int var4 = 0; var4 < this.aa.length; ++var4) {
                  if (var2 == -1754346109) {
                     throw new IllegalStateException();
                  }

                  var6 &= go.aw.ce(this.aa[var4] & '\uffff', 0, (byte)-74);
               }

               return var6;
            }
         } else {
            for(int var3 = 0; var3 < this.ay.length; ++var3) {
               if (var2 == -1754346109) {
                  throw new IllegalStateException();
               }

               if (this.ay[var3] == var1) {
                  if (var2 == -1754346109) {
                     throw new IllegalStateException();
                  }

                  return go.aw.ce(this.aa[var3] & '\uffff', 0, (byte)23);
               }
            }

            return true;
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "hq.ab(" + ')');
      }
   }

   hq() {
      try {
         super();
         this.ao = mk.at;
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
      } catch (RuntimeException var1) {
         throw db.an(var1, "hq.<init>(" + ')');
      }
   }

   public final iv al(int var1, int var2, int[][] var3, int var4, int var5, int var6, byte var7) {
      try {
         long var8;
         if (this.ay == null) {
            if (var7 >= -1) {
               throw new IllegalStateException();
            }

            var8 = (long)((this.at * -1529817365 << 10) + var2);
         } else {
            var8 = (long)(var2 + (-1529817365 * this.at << 10) + (var1 << 3));
         }

         Object var10 = (iv)ab.af(var8);
         if (null == var10) {
            if (var7 >= -1) {
               throw new IllegalStateException();
            }

            iz var11 = this.ay(var1, var2, 930909307);
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

            ab.aw((rk)var10, var8);
         }

         if (this.az) {
            if (var7 >= -1) {
               throw new IllegalStateException();
            }

            var10 = ((iz)var10).ao();
         }

         if (-1437543955 * this.ak >= 0) {
            if (var7 >= -1) {
               throw new IllegalStateException();
            }

            if (var10 instanceof it) {
               var10 = ((it)var10).at(var3, var4, var5, var6, true, this.ak * -1437543955);
            } else if (var10 instanceof iz) {
               if (var7 >= -1) {
                  throw new IllegalStateException();
               }

               var10 = ((iz)var10).ax(var3, var4, var5, var6, true, -1437543955 * this.ak);
            }
         }

         return (iv)var10;
      } catch (RuntimeException var12) {
         throw db.an(var12, "hq.al(" + ')');
      }
   }

   public final boolean bb() {
      if (this.aa == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.aa.length; ++var2) {
            var1 &= go.aw.ce(this.aa[var2] & '\uffff', 0, (byte)-21);
         }

         return var1;
      }
   }

   public final it aa(int var1, int var2, int[][] var3, int var4, int var5, int var6, ha var7, int var8, int var9) {
      try {
         long var10;
         if (null == this.ay) {
            if (var9 == -170244579) {
               throw new IllegalStateException();
            }

            var10 = (long)(var2 + (this.at * -1529817365 << 10));
         } else {
            var10 = (long)(var2 + (this.at * -1529817365 << 10) + (var1 << 3));
         }

         it var12 = (it)aq.af(var10);
         if (var12 == null) {
            iz var13 = this.ay(var1, var2, 1035462813);
            if (var13 == null) {
               if (var9 == -170244579) {
                  throw new IllegalStateException();
               }

               return null;
            }

            var12 = var13.bb(64 + this.by * 1284125631, 768 + this.bb * -18088891, -50, -10, -50);
            aq.aw(var12, var10);
         }

         if (var7 == null) {
            if (var9 == -170244579) {
               throw new IllegalStateException();
            }

            if (-1 == this.ak * -1437543955) {
               return var12;
            }
         }

         if (null != var7) {
            if (var9 == -170244579) {
               throw new IllegalStateException();
            }

            var12 = var7.aq(var12, var8, var2, 16711935);
         } else {
            var12 = var12.aa(true);
         }

         if (-1437543955 * this.ak >= 0) {
            var12 = var12.at(var3, var4, var5, var6, false, -1437543955 * this.ak);
         }

         return var12;
      } catch (RuntimeException var14) {
         throw db.an(var14, "hq.aa(" + ')');
      }
   }

   final iz ay(int var1, int var2, int var3) {
      try {
         iz var4 = null;
         boolean var5;
         int var6;
         int var8;
         boolean var10000;
         if (this.ay == null) {
            if (var1 != 10) {
               if (var3 >= 1446803360) {
                  throw new IllegalStateException();
               }

               return null;
            }

            if (null == this.aa) {
               if (var3 >= 1446803360) {
                  throw new IllegalStateException();
               }

               return null;
            }

            var5 = this.bx;
            if (2 == var1) {
               if (var3 >= 1446803360) {
                  throw new IllegalStateException();
               }

               if (var2 > 3) {
                  if (var3 >= 1446803360) {
                     throw new IllegalStateException();
                  }

                  if (!var5) {
                     if (var3 >= 1446803360) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  var5 = var10000;
               }
            }

            var6 = this.aa.length;

            for(int var7 = 0; var7 < var6; ++var7) {
               if (var3 >= 1446803360) {
                  throw new IllegalStateException();
               }

               var8 = this.aa[var7];
               if (var5) {
                  var8 += 65536;
               }

               var4 = (iz)au.af((long)var8);
               if (null == var4) {
                  if (var3 >= 1446803360) {
                     throw new IllegalStateException();
                  }

                  var4 = iz.af(go.aw, var8 & '\uffff', 0);
                  if (var4 == null) {
                     if (var3 >= 1446803360) {
                        throw new IllegalStateException();
                     }

                     return null;
                  }

                  if (var5) {
                     if (var3 >= 1446803360) {
                        throw new IllegalStateException();
                     }

                     var4.ak();
                  }

                  au.aw(var4, (long)var8);
               }

               if (var6 > 1) {
                  if (var3 >= 1446803360) {
                     throw new IllegalStateException();
                  }

                  al[var7] = var4;
               }
            }

            if (var6 > 1) {
               if (var3 >= 1446803360) {
                  throw new IllegalStateException();
               }

               var4 = new iz(al, var6);
            }
         } else {
            int var10 = -1;

            for(var6 = 0; var6 < this.ay.length; ++var6) {
               if (var3 >= 1446803360) {
                  throw new IllegalStateException();
               }

               if (this.ay[var6] == var1) {
                  if (var3 >= 1446803360) {
                     throw new IllegalStateException();
                  }

                  var10 = var6;
                  break;
               }
            }

            if (var10 == -1) {
               return null;
            }

            var6 = this.aa[var10];
            var10000 = this.bx;
            boolean var10001;
            if (var2 > 3) {
               if (var3 >= 1446803360) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            boolean var11 = var10000 ^ var10001;
            if (var11) {
               var6 += 65536;
            }

            var4 = (iz)au.af((long)var6);
            if (null == var4) {
               if (var3 >= 1446803360) {
                  throw new IllegalStateException();
               }

               var4 = iz.af(go.aw, var6 & '\uffff', 0);
               if (null == var4) {
                  if (var3 >= 1446803360) {
                     throw new IllegalStateException();
                  }

                  return null;
               }

               if (var11) {
                  if (var3 >= 1446803360) {
                     throw new IllegalStateException();
                  }

                  var4.ak();
               }

               au.aw(var4, (long)var6);
            }
         }

         label334: {
            if (128 == this.bz * -60584503) {
               if (var3 >= 1446803360) {
                  throw new IllegalStateException();
               }

               if (128 == -950870759 * this.bm) {
                  if (var3 >= 1446803360) {
                     throw new IllegalStateException();
                  }

                  if (-1734306655 * this.bd == 128) {
                     var5 = false;
                     break label334;
                  }

                  if (var3 >= 1446803360) {
                     throw new IllegalStateException();
                  }
               }
            }

            var5 = true;
         }

         boolean var12;
         label325: {
            if (105607279 * this.bt == 0) {
               if (var3 >= 1446803360) {
                  throw new IllegalStateException();
               }

               if (0 == this.bj * -1068622067) {
                  if (var3 >= 1446803360) {
                     throw new IllegalStateException();
                  }

                  if (this.bn * 629285153 == 0) {
                     var12 = false;
                     break label325;
                  }

                  if (var3 >= 1446803360) {
                     throw new IllegalStateException();
                  }
               }
            }

            var12 = true;
         }

         iz var14;
         boolean var10003;
         label316: {
            var14 = new iz;
            if (0 == var2) {
               if (var3 >= 1446803360) {
                  throw new IllegalStateException();
               }

               if (!var5 && !var12) {
                  if (var3 >= 1446803360) {
                     throw new IllegalStateException();
                  }

                  var10003 = true;
                  break label316;
               }
            }

            var10003 = false;
         }

         boolean var10004;
         if (this.ax == null) {
            if (var3 >= 1446803360) {
               throw new IllegalStateException();
            }

            var10004 = true;
         } else {
            var10004 = false;
         }

         boolean var10005;
         if (this.ag == null) {
            if (var3 >= 1446803360) {
               throw new IllegalStateException();
            }

            var10005 = true;
         } else {
            var10005 = false;
         }

         var14.<init>(var4, var10003, var10004, var10005, true);
         iz var13 = var14;
         if (4 == var1) {
            if (var3 >= 1446803360) {
               throw new IllegalStateException();
            }

            if (var2 > 3) {
               if (var3 >= 1446803360) {
                  throw new IllegalStateException();
               }

               var13.ar(256);
               var13.am(45, 0, -45);
            }
         }

         var2 &= 3;
         if (1 == var2) {
            if (var3 >= 1446803360) {
               throw new IllegalStateException();
            }

            var13.ag();
         } else if (var2 == 2) {
            if (var3 >= 1446803360) {
               throw new IllegalStateException();
            }

            var13.ah();
         } else if (var2 == 3) {
            var13.av();
         }

         if (this.ax != null) {
            if (var3 >= 1446803360) {
               throw new IllegalStateException();
            }

            for(var8 = 0; var8 < this.ax.length; ++var8) {
               if (var3 >= 1446803360) {
                  throw new IllegalStateException();
               }

               var13.as(this.ax[var8], this.ai[var8]);
            }
         }

         if (null != this.ag) {
            if (var3 >= 1446803360) {
               throw new IllegalStateException();
            }

            for(var8 = 0; var8 < this.ag.length; ++var8) {
               if (var3 >= 1446803360) {
                  throw new IllegalStateException();
               }

               var13.aj(this.ag[var8], this.ah[var8]);
            }
         }

         if (var5) {
            if (var3 >= 1446803360) {
               throw new IllegalStateException();
            }

            var13.az(this.bz * -60584503, this.bm * -950870759, -1734306655 * this.bd);
         }

         if (var12) {
            if (var3 >= 1446803360) {
               throw new IllegalStateException();
            }

            var13.am(105607279 * this.bt, this.bj * -1068622067, this.bn * 629285153);
         }

         return var13;
      } catch (RuntimeException var9) {
         throw db.an(var9, "hq.ay(" + ')');
      }
   }

   public final hq ao(byte var1) {
      try {
         int var2 = -1;
         if (-1 != 1411927451 * this.bf) {
            if (var1 == 1) {
               throw new IllegalStateException();
            }

            var2 = jy.af(1411927451 * this.bf, 1707765619);
         } else if (1685173773 * this.bq != -1) {
            if (var1 == 1) {
               throw new IllegalStateException();
            }

            var2 = le.aw[this.bq * 1685173773];
         }

         int var3;
         label47: {
            if (var2 >= 0) {
               if (var1 == 1) {
                  throw new IllegalStateException();
               }

               if (var2 < this.bu.length - 1) {
                  var3 = this.bu[var2];
                  break label47;
               }

               if (var1 == 1) {
                  throw new IllegalStateException();
               }
            }

            var3 = this.bu[this.bu.length - 1];
         }

         if (-1 != var3) {
            if (var1 == 1) {
               throw new IllegalStateException();
            } else {
               return fw.an(var3, (short)8608);
            }
         } else {
            return null;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "hq.ao(" + ')');
      }
   }

   public final it at(int var1, int var2, int[][] var3, int var4, int var5, int var6, byte var7) {
      try {
         long var8;
         if (null == this.ay) {
            if (var7 == 6) {
               throw new IllegalStateException();
            }

            var8 = (long)((-1529817365 * this.at << 10) + var2);
         } else {
            var8 = (long)((this.at * -1529817365 << 10) + (var1 << 3) + var2);
         }

         it var10 = (it)aq.af(var8);
         if (var10 == null) {
            if (var7 == 6) {
               throw new IllegalStateException();
            }

            iz var11 = this.ay(var1, var2, -512287449);
            if (var11 == null) {
               if (var7 == 6) {
                  throw new IllegalStateException();
               }

               return null;
            }

            var10 = var11.bb(this.by * 1284125631 + 64, 768 + -18088891 * this.bb, -50, -10, -50);
            aq.aw(var10, var8);
         }

         if (this.ak * -1437543955 >= 0) {
            var10 = var10.at(var3, var4, var5, var6, true, -1437543955 * this.ak);
         }

         return var10;
      } catch (RuntimeException var12) {
         throw db.an(var12, "hq.at(" + ')');
      }
   }

   public final it bo(int var1, int var2, int[][] var3, int var4, int var5, int var6, ha var7, int var8) {
      long var9;
      if (null == this.ay) {
         var9 = (long)(var2 + (this.at * -1529817365 << 10));
      } else {
         var9 = (long)(var2 + (this.at * -1529817365 << 10) + (var1 << 3));
      }

      it var11 = (it)aq.af(var9);
      if (var11 == null) {
         iz var12 = this.ay(var1, var2, -2126302636);
         if (var12 == null) {
            return null;
         }

         var11 = var12.bb(1489985345 + this.by * 1284125631, 347244718 + this.bb * -18088891, 149066266, -10, 939406618);
         aq.aw(var11, var9);
      }

      if (var7 == null && -1 == this.ak * -1553366609) {
         return var11;
      } else {
         if (null != var7) {
            var11 = var7.aq(var11, var8, var2, 16711935);
         } else {
            var11 = var11.aa(true);
         }

         if (1681064148 * this.ak >= 0) {
            var11 = var11.at(var3, var4, var5, var6, false, -1877991058 * this.ak);
         }

         return var11;
      }
   }

   public boolean ah(int var1) {
      try {
         if (this.bu == null) {
            if (var1 >= -1928114592) {
               throw new IllegalStateException();
            } else {
               boolean var10000;
               if (this.ba * 1970571505 == -1) {
                  if (var1 >= -1928114592) {
                     throw new IllegalStateException();
                  }

                  if (null == this.bc) {
                     var10000 = false;
                     return var10000;
                  }

                  if (var1 >= -1928114592) {
                     throw new IllegalStateException();
                  }
               }

               var10000 = true;
               return var10000;
            }
         } else {
            int var2 = 0;

            while(true) {
               if (var2 >= this.bu.length) {
                  return false;
               }

               if (-1 != this.bu[var2]) {
                  if (var1 >= -1928114592) {
                     throw new IllegalStateException();
                  }

                  hq var3 = fw.an(this.bu[var2], (short)7207);
                  if (-1 != 1970571505 * var3.ba) {
                     break;
                  }

                  if (var1 >= -1928114592) {
                     throw new IllegalStateException();
                  }

                  if (var3.bc != null) {
                     if (var1 >= -1928114592) {
                        throw new IllegalStateException();
                     }
                     break;
                  }
               }

               ++var2;
            }

            return true;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "hq.ah(" + ')');
      }
   }

   public static void ba() {
      ac.ac();
      au.ac();
      ab.ac();
      aq.ac();
   }

   public static void av(nm var0, nm var1, boolean var2) {
      an = var0;
      go.aw = var1;
      af = var2;
   }

   public int ax(int var1, int var2, int var3) {
      try {
         ro var5 = this.bw;
         int var4;
         if (null == var5) {
            if (var3 >= -633281837) {
               throw new IllegalStateException();
            }

            var4 = var2;
         } else {
            rt var6 = (rt)var5.af((long)var1);
            if (null == var6) {
               if (var3 >= -633281837) {
                  throw new IllegalStateException();
               }

               var4 = var2;
            } else {
               var4 = var6.af;
            }
         }

         return var4;
      } catch (RuntimeException var7) {
         throw db.an(var7, "hq.ax(" + ')');
      }
   }

   public final boolean aq(int var1) {
      try {
         if (this.aa == null) {
            if (var1 >= -589150360) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            boolean var2 = true;

            for(int var3 = 0; var3 < this.aa.length; ++var3) {
               if (var1 >= -589150360) {
                  throw new IllegalStateException();
               }

               var2 &= go.aw.ce(this.aa[var3] & '\uffff', 0, (byte)112);
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "hq.aq(" + ')');
      }
   }

   public final it bz(int var1, int var2, int[][] var3, int var4, int var5, int var6, ha var7, int var8) {
      long var9;
      if (null == this.ay) {
         var9 = (long)(var2 + (this.at * -1529817365 << 10));
      } else {
         var9 = (long)(var2 + (this.at * -911274093 << 10) + (var1 << 3));
      }

      it var11 = (it)aq.af(var9);
      if (var11 == null) {
         iz var12 = this.ay(var1, var2, -626716628);
         if (var12 == null) {
            return null;
         }

         var11 = var12.bb(-1541863509 + this.by * 1139591093, -430689957 + this.bb * -18088891, -50, -10, -50);
         aq.aw(var11, var9);
      }

      if (var7 == null && -1 == this.ak * -1437543955) {
         return var11;
      } else {
         if (null != var7) {
            var11 = var7.aq(var11, var8, var2, 16711935);
         } else {
            var11 = var11.aa(true);
         }

         if (-707241297 * this.ak >= 0) {
            var11 = var11.at(var3, var4, var5, var6, false, -1029637378 * this.ak);
         }

         return var11;
      }
   }

   void aj(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (var2 == 0) {
            return;
         }

         this.au(var1, var2, (byte)-60);
      }
   }

   void ad(sg var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.cm((byte)7);
         if (var3 > 0) {
            if (this.aa != null && !af) {
               var1.at += -254100545 * var3;
            } else {
               this.ay = new int[var3];
               this.aa = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.aa[var4] = var1.cl(283438923);
                  this.ay[var4] = var1.cm((byte)7);
               }
            }
         }
      } else if (var2 == 2) {
         this.ao = var1.cw((byte)0);
      } else if (var2 == 5) {
         var3 = var1.cm((byte)7);
         if (var3 > 0) {
            if (this.aa != null && !af) {
               var1.at += var3 * 1262255402;
            } else {
               this.ay = null;
               this.aa = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.aa[var4] = var1.cl(474619975);
               }
            }
         }
      } else if (var2 == 14) {
         this.av = var1.cm((byte)7) * 1205654711;
      } else if (15 == var2) {
         this.ar = var1.cm((byte)7) * 1159818229;
      } else if (var2 == 17) {
         this.am = 0;
         this.as = false;
      } else if (var2 == 18) {
         this.as = false;
      } else if (var2 == 19) {
         this.aj = var1.cm((byte)7) * 1041321269;
      } else if (var2 == 21) {
         this.ak = 0;
      } else if (var2 == 22) {
         this.az = true;
      } else if (23 == var2) {
         this.ad = true;
      } else if (var2 == 24) {
         this.ae = var1.cl(-1464875629) * -1142530427;
         if (65535 == 1292954189 * this.ae) {
            this.ae = 1142530427;
         }
      } else if (27 == var2) {
         this.am = 1356917295;
      } else if (var2 == 28) {
         this.ap = var1.cm((byte)7) * -1893671375;
      } else if (var2 == 29) {
         this.by = var1.cf(435772489) * 524532799;
      } else if (39 == var2) {
         this.bb = var1.cf(435772489) * -1238182971;
      } else if (var2 >= 30 && var2 < 35) {
         this.bi[var2 - 30] = var1.cw((byte)0);
         if (this.bi[var2 - 30].equalsIgnoreCase(mk.ac)) {
            this.bi[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var3 = var1.cm((byte)7);
         this.ax = new short[var3];
         this.ai = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ax[var4] = (short)var1.cl(-545408305);
            this.ai[var4] = (short)var1.cl(-2106264935);
         }
      } else if (var2 == 41) {
         var3 = var1.cm((byte)7);
         this.ag = new short[var3];
         this.ah = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ag[var4] = (short)var1.cl(25507155);
            this.ah[var4] = (short)var1.cl(399854598);
         }
      } else if (61 == var2) {
         var1.cl(-222573929);
      } else if (62 == var2) {
         this.bx = true;
      } else if (64 == var2) {
         this.bo = false;
      } else if (65 == var2) {
         this.bz = var1.cl(184416091) * 1039146105;
      } else if (var2 == 66) {
         this.bm = var1.cl(-715140535) * -677695703;
      } else if (var2 == 67) {
         this.bd = var1.cl(-1344606068) * 1862946657;
      } else if (var2 == 68) {
         this.bk = var1.cl(143881282) * -476568133;
      } else if (69 == var2) {
         var1.cm((byte)7);
      } else if (var2 == 70) {
         this.bt = var1.cg((byte)-114) * -327422321;
      } else if (71 == var2) {
         this.bj = var1.cg((byte)-69) * 956024773;
      } else if (72 == var2) {
         this.bn = var1.cg((byte)-95) * -127229215;
      } else if (73 == var2) {
         this.bs = true;
      } else if (74 == var2) {
         this.br = true;
      } else if (var2 == 75) {
         this.bg = var1.cm((byte)7) * 1776888457;
      } else if (var2 != 77 && var2 != 92) {
         if (78 == var2) {
            this.ba = var1.cl(290026354) * -38705135;
            this.bv = var1.cm((byte)7) * 1190823625;
         } else if (var2 == 79) {
            this.bl = var1.cl(-1061334761) * 1257958995;
            this.bp = var1.cl(-785424707) * 230715233;
            this.bv = var1.cm((byte)7) * 1190823625;
            var3 = var1.cm((byte)7);
            this.bc = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.bc[var4] = var1.cl(-1282455724);
            }
         } else if (81 == var2) {
            this.ak = var1.cm((byte)7) * 708044032;
         } else if (var2 == 82) {
            this.be = var1.cl(-767086784) * -1683785829;
         } else if (89 == var2) {
            this.bh = false;
         } else if (var2 == 249) {
            this.bw = cp.af(var1, this.bw, (byte)-7);
         }
      } else {
         this.bf = var1.cl(-202927169) * 1157714067;
         if (1411927451 * this.bf == 65535) {
            this.bf = -1157714067;
         }

         this.bq = var1.cl(-270409479) * -1863808827;
         if (1685173773 * this.bq == 65535) {
            this.bq = 1863808827;
         }

         var3 = -1;
         if (var2 == 92) {
            var3 = var1.cl(-415454254);
            if (65535 == var3) {
               var3 = -1;
            }
         }

         var4 = var1.cm((byte)7);
         this.bu = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.bu[var5] = var1.cl(583985562);
            if (this.bu[var5] == 65535) {
               this.bu[var5] = -1;
            }
         }

         this.bu[1 + var4] = var3;
      }

   }

   public final hq bn() {
      int var1 = -1;
      if (-1 != 259093902 * this.bf) {
         var1 = jy.af(-153347516 * this.bf, 1381778669);
      } else if (1685173773 * this.bq != -1) {
         var1 = le.aw[this.bq * -576986873];
      }

      int var2;
      if (var1 >= 0 && var1 < this.bu.length - 1) {
         var2 = this.bu[var1];
      } else {
         var2 = this.bu[this.bu.length - 1];
      }

      return -1 != var2 ? fw.an(var2, (short)30369) : null;
   }

   static int ae(int var0, ch var1, boolean var2, byte var3) {
      try {
         if (var0 == 3200) {
            if (var3 != 6) {
               throw new IllegalStateException();
            } else {
               cy.at -= 1281407919;
               fh.he(cy.al[cy.at * -964267539], cy.al[1 + -964267539 * cy.at], cy.al[cy.at * -964267539 + 2], (byte)-14);
               return 1;
            }
         } else if (var0 == 3201) {
            if (var3 != 6) {
               throw new IllegalStateException();
            } else {
               an.hf(cy.al[(cy.at -= 427135973) * -964267539], -1119881265);
               return 1;
            }
         } else if (var0 == 3202) {
            if (var3 != 6) {
               throw new IllegalStateException();
            } else {
               cy.at -= 854271946;
               if.hy(cy.al[cy.at * -964267539], cy.al[-964267539 * cy.at + 1], 1287836101);
               return 1;
            }
         } else {
            dt var4;
            dk var5;
            int var6;
            int var7;
            String var10;
            if (var0 != 3212) {
               if (var3 != 6) {
                  throw new IllegalStateException();
               }

               if (3213 != var0) {
                  if (var3 != 6) {
                     throw new IllegalStateException();
                  }

                  if (var0 != 3209) {
                     if (var3 != 6) {
                        throw new IllegalStateException();
                     }

                     if (var0 != 3181) {
                        if (var3 != 6) {
                           throw new IllegalStateException();
                        }

                        if (3203 != var0) {
                           if (var3 != 6) {
                              throw new IllegalStateException();
                           }

                           if (var0 != 3205) {
                              if (var3 != 6) {
                                 throw new IllegalStateException();
                              }

                              if (3207 != var0) {
                                 boolean var11;
                                 byte var20;
                                 if (var0 != 3214) {
                                    if (var3 != 6) {
                                       throw new IllegalStateException();
                                    }

                                    if (var0 != 3215) {
                                       if (var3 != 6) {
                                          throw new IllegalStateException();
                                       }

                                       if (3210 != var0) {
                                          if (var3 != 6) {
                                             throw new IllegalStateException();
                                          }

                                          if (3182 != var0 && var0 != 3204) {
                                             if (var3 != 6) {
                                                throw new IllegalStateException();
                                             }

                                             if (var0 != 3206) {
                                                if (3208 != var0) {
                                                   if (3211 == var0) {
                                                      if (var3 != 6) {
                                                         throw new IllegalStateException();
                                                      }

                                                      return 1;
                                                   }

                                                   int var12;
                                                   if (3216 == var0) {
                                                      var12 = cy.al[(cy.at -= 427135973) * -964267539];
                                                      byte var15 = 0;
                                                      dt var19 = (dt)ht.af(nw.au(-678147968), var12, (short)173);
                                                      if (var19 != null) {
                                                         if (var3 != 6) {
                                                            throw new IllegalStateException();
                                                         }

                                                         if (dt.af != var19) {
                                                            if (var3 != 6) {
                                                               throw new IllegalStateException();
                                                            }

                                                            var20 = 1;
                                                         } else {
                                                            var20 = 0;
                                                         }

                                                         var15 = var20;
                                                      }

                                                      cy.al[(cy.at += 427135973) * -964267539 - 1] = var15;
                                                      return 1;
                                                   }

                                                   if (3218 == var0) {
                                                      var12 = cy.al[(cy.at -= 427135973) * -964267539];
                                                      int var14 = 0;
                                                      dk var18 = (dk)ht.af(em.au(2081889972), var12, (short)173);
                                                      if (var18 != null) {
                                                         if (var3 != 6) {
                                                            throw new IllegalStateException();
                                                         }

                                                         var14 = var18 != dk.af ? 1 : 0;
                                                      }

                                                      cy.al[(cy.at += 427135973) * -964267539 - 1] = var14;
                                                      return 1;
                                                   }

                                                   if (3217 != var0) {
                                                      if (var3 != 6) {
                                                         throw new IllegalStateException();
                                                      }

                                                      if (var0 != 3219) {
                                                         return 2;
                                                      }

                                                      if (var3 != 6) {
                                                         throw new IllegalStateException();
                                                      }
                                                   }

                                                   var4 = dt.af;
                                                   var5 = dk.af;
                                                   var11 = true;
                                                   boolean var17 = true;
                                                   int var8;
                                                   if (3217 == var0) {
                                                      if (var3 != 6) {
                                                         throw new IllegalStateException();
                                                      }

                                                      var8 = cy.al[(cy.at -= 427135973) * -964267539];
                                                      var4 = (dt)ht.af(nw.au(-678147968), var8, (short)173);
                                                      if (null == var4) {
                                                         if (var3 != 6) {
                                                            throw new IllegalStateException();
                                                         }

                                                         throw new RuntimeException(String.format("Unrecognized device option %d", var8));
                                                      }
                                                   }

                                                   if (var0 == 3219) {
                                                      if (var3 != 6) {
                                                         throw new IllegalStateException();
                                                      }

                                                      var8 = cy.al[(cy.at -= 427135973) * -964267539];
                                                      var5 = (dk)ht.af(em.au(1830498693), var8, (short)173);
                                                      if (null == var5) {
                                                         throw new RuntimeException(String.format("Unrecognized game option %d", var8));
                                                      }
                                                   }

                                                   String var13;
                                                   byte var16;
                                                   if (dk.af == var5) {
                                                      if (var3 != 6) {
                                                         throw new IllegalStateException();
                                                      }

                                                      switch (-2060299987 * var4.aq) {
                                                         case 1:
                                                         case 2:
                                                         case 3:
                                                            var16 = 0;
                                                            var7 = 1;
                                                            break;
                                                         case 4:
                                                            var16 = 0;
                                                            var7 = Integer.MAX_VALUE;
                                                            break;
                                                         case 5:
                                                            var16 = 0;
                                                            var7 = 100;
                                                            break;
                                                         default:
                                                            var13 = String.format("Unkown device option: %s.", var4.toString());
                                                            throw new RuntimeException(var13);
                                                      }
                                                   } else {
                                                      switch (358560065 * var5.ab) {
                                                         case 1:
                                                            var16 = 0;
                                                            var7 = 1;
                                                            break;
                                                         case 2:
                                                         case 3:
                                                         case 4:
                                                            var16 = 0;
                                                            var7 = 100;
                                                            break;
                                                         default:
                                                            var13 = String.format("Unkown game option: %s.", var5.toString());
                                                            throw new RuntimeException(var13);
                                                      }
                                                   }

                                                   cy.al[(cy.at += 427135973) * -964267539 - 1] = var16;
                                                   cy.al[(cy.at += 427135973) * -964267539 - 1] = var7;
                                                   return 1;
                                                }

                                                if (var3 != 6) {
                                                   throw new IllegalStateException();
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }

                                 var4 = dt.af;
                                 var5 = dk.af;
                                 var11 = false;
                                 if (3214 == var0) {
                                    var7 = cy.al[(cy.at -= 427135973) * -964267539];
                                    var4 = (dt)ht.af(nw.au(-678147968), var7, (short)173);
                                    if (var4 == null) {
                                       if (var3 != 6) {
                                          throw new IllegalStateException();
                                       }

                                       throw new RuntimeException(String.format("Unrecognized device option %d", var7));
                                    }
                                 }

                                 if (var0 == 3215) {
                                    if (var3 != 6) {
                                       throw new IllegalStateException();
                                    }

                                    var7 = cy.al[(cy.at -= 427135973) * -964267539];
                                    var5 = (dk)ht.af(em.au(1795089350), var7, (short)173);
                                    if (null == var5) {
                                       if (var3 != 6) {
                                          throw new IllegalStateException();
                                       }

                                       throw new RuntimeException(String.format("Unrecognized game option %d", var7));
                                    }
                                 }

                                 if (3210 == var0) {
                                    if (var3 != 6) {
                                       throw new IllegalStateException();
                                    }

                                    var7 = cy.al[(cy.at -= 427135973) * -964267539];
                                    var4 = (dt)ht.af(nw.au(-678147968), var7, (short)173);
                                    if (var4 == null) {
                                       if (var3 != 6) {
                                          throw new IllegalStateException();
                                       }

                                       var5 = (dk)ht.af(em.au(2051277304), var7, (short)173);
                                       if (var5 == null) {
                                          throw new RuntimeException(String.format("Unrecognized client option %d", var7));
                                       }
                                    }
                                 } else if (3182 == var0) {
                                    if (var3 != 6) {
                                       throw new IllegalStateException();
                                    }

                                    var4 = dt.ab;
                                 } else if (var0 == 3204) {
                                    if (var3 != 6) {
                                       throw new IllegalStateException();
                                    }

                                    var5 = dk.aw;
                                 } else if (var0 == 3206) {
                                    if (var3 != 6) {
                                       throw new IllegalStateException();
                                    }

                                    var5 = dk.ac;
                                 } else if (var0 == 3208) {
                                    if (var3 != 6) {
                                       throw new IllegalStateException();
                                    }

                                    var5 = dk.au;
                                 }

                                 if (var5 == dk.af) {
                                    if (var3 != 6) {
                                       throw new IllegalStateException();
                                    }

                                    switch (var4.aq * -2060299987) {
                                       case 1:
                                          var6 = aj.vb.al(-2121061539) ? 1 : 0;
                                          break;
                                       case 2:
                                          if (aj.vb.aa(-1197954221)) {
                                             if (var3 != 6) {
                                                throw new IllegalStateException();
                                             }

                                             var20 = 1;
                                          } else {
                                             var20 = 0;
                                          }

                                          var6 = var20;
                                          break;
                                       case 3:
                                          if (aj.vb.ax((short)635)) {
                                             if (var3 != 6) {
                                                throw new IllegalStateException();
                                             }

                                             var20 = 1;
                                          } else {
                                             var20 = 0;
                                          }

                                          var6 = var20;
                                          break;
                                       case 4:
                                          var6 = aj.vb.ag(1671764667);
                                          break;
                                       case 5:
                                          var6 = da.mh(-1900076897);
                                          break;
                                       default:
                                          var10 = String.format("Unkown device option: %s.", var4.toString());
                                          throw new RuntimeException(var10);
                                    }
                                 } else {
                                    switch (var5.ab * 358560065) {
                                       case 1:
                                          if (aj.vb.ab(-2064860341)) {
                                             if (var3 != 6) {
                                                throw new IllegalStateException();
                                             }

                                             var20 = 1;
                                          } else {
                                             var20 = 0;
                                          }

                                          var6 = var20;
                                          break;
                                       case 2:
                                          var7 = aj.vb.am(-1177228802);
                                          var6 = Math.round((float)(var7 * 100) / 255.0F);
                                          break;
                                       case 3:
                                          var7 = aj.vb.aj(1942519392);
                                          var6 = Math.round((float)(var7 * 100) / 127.0F);
                                          break;
                                       case 4:
                                          var7 = aj.vb.az(-1861682668);
                                          var6 = Math.round((float)(100 * var7) / 127.0F);
                                          break;
                                       default:
                                          var10 = String.format("Unkown game option: %s.", var5.toString());
                                          throw new RuntimeException(var10);
                                    }
                                 }

                                 cy.al[(cy.at += 427135973) * -964267539 - 1] = var6;
                                 return 1;
                              }

                              if (var3 != 6) {
                                 throw new IllegalStateException();
                              }
                           }
                        }
                     }
                  }
               }
            }

            var4 = dt.af;
            var5 = dk.af;
            var6 = cy.al[(cy.at -= 427135973) * -964267539];
            if (3212 == var0) {
               if (var3 != 6) {
                  throw new IllegalStateException();
               }

               var7 = cy.al[(cy.at -= 427135973) * -964267539];
               var4 = (dt)ht.af(nw.au(-678147968), var7, (short)173);
               if (var4 == null) {
                  throw new RuntimeException(String.format("Unrecognized device option %d", var7));
               }
            }

            if (var0 == 3213) {
               var7 = cy.al[(cy.at -= 427135973) * -964267539];
               var5 = (dk)ht.af(em.au(1978895221), var7, (short)173);
               if (var5 == null) {
                  if (var3 != 6) {
                     throw new IllegalStateException();
                  }

                  throw new RuntimeException(String.format("Unrecognized game option %d", var7));
               }
            }

            if (var0 == 3209) {
               if (var3 != 6) {
                  throw new IllegalStateException();
               }

               var7 = cy.al[(cy.at -= 427135973) * -964267539];
               var4 = (dt)ht.af(nw.au(-678147968), var7, (short)173);
               if (null == var4) {
                  if (var3 != 6) {
                     throw new IllegalStateException();
                  }

                  var5 = (dk)ht.af(em.au(1901937136), var7, (short)173);
                  if (null == var5) {
                     if (var3 != 6) {
                        throw new IllegalStateException();
                     }

                     throw new RuntimeException(String.format("Unrecognized client option %d", var7));
                  }
               }
            } else if (var0 == 3181) {
               if (var3 != 6) {
                  throw new IllegalStateException();
               }

               var4 = dt.ab;
            } else if (var0 == 3203) {
               var5 = dk.aw;
            } else if (3205 == var0) {
               if (var3 != 6) {
                  throw new IllegalStateException();
               }

               var5 = dk.ac;
            } else if (3207 == var0) {
               if (var3 != 6) {
                  throw new IllegalStateException();
               }

               var5 = dk.au;
            }

            if (dk.af == var5) {
               if (var3 != 6) {
                  throw new IllegalStateException();
               }

               du var10000;
               boolean var10001;
               switch (-2060299987 * var4.aq) {
                  case 1:
                     var10000 = aj.vb;
                     if (1 == var6) {
                        if (var3 != 6) {
                           throw new IllegalStateException();
                        }

                        var10001 = true;
                     } else {
                        var10001 = false;
                     }

                     var10000.aq(var10001, 1798514375);
                     break;
                  case 2:
                     var10000 = aj.vb;
                     if (1 == var6) {
                        if (var3 != 6) {
                           throw new IllegalStateException();
                        }

                        var10001 = true;
                     } else {
                        var10001 = false;
                     }

                     var10000.at(var10001, -527699713);
                     break;
                  case 3:
                     var10000 = aj.vb;
                     if (1 == var6) {
                        if (var3 != 6) {
                           throw new IllegalStateException();
                        }

                        var10001 = true;
                     } else {
                        var10001 = false;
                     }

                     var10000.ay(var10001, 1980083738);
                     break;
                  case 4:
                     if (var6 < 0) {
                        var6 = 0;
                     }

                     aj.vb.ai(var6, (byte)-3);
                     break;
                  case 5:
                     cm.mc(var6, -1280627199);
                     break;
                  default:
                     var10 = String.format("Unkown device option: %s.", var4.toString());
                     throw new RuntimeException(var10);
               }
            } else {
               switch (var5.ab * 358560065) {
                  case 1:
                     aj.vb.au(var6 == 1, -1505559794);
                     break;
                  case 2:
                     var6 = Math.min(Math.max(var6, 0), 100);
                     var7 = Math.round((float)(255 * var6) / 100.0F);
                     dt.mo(var7, (byte)-104);
                     break;
                  case 3:
                     var6 = Math.min(Math.max(var6, 0), 100);
                     var7 = Math.round((float)(127 * var6) / 100.0F);
                     fe.mn(var7, 1534718960);
                     break;
                  case 4:
                     var6 = Math.min(Math.max(var6, 0), 100);
                     var7 = Math.round((float)(127 * var6) / 100.0F);
                     fp.mi(var7, (byte)0);
                     break;
                  default:
                     var10 = String.format("Unkown game option: %s.", var5.toString());
                     throw new RuntimeException(var10);
               }
            }

            return 1;
         }
      } catch (RuntimeException var9) {
         throw db.an(var9, "hq.ae(" + ')');
      }
   }

   public final boolean ap(int var1) {
      if (this.ay != null) {
         for(int var4 = 0; var4 < this.ay.length; ++var4) {
            if (this.ay[var4] == var1) {
               return go.aw.ce(this.aa[var4] & -1330068997, 0, (byte)5);
            }
         }

         return true;
      } else if (null == this.aa) {
         return true;
      } else if (var1 != 10) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.aa.length; ++var3) {
            var2 &= go.aw.ce(this.aa[var3] & '\uffff', 0, (byte)72);
         }

         return var2;
      }
   }

   public final boolean by(int var1) {
      if (this.ay != null) {
         for(int var4 = 0; var4 < this.ay.length; ++var4) {
            if (this.ay[var4] == var1) {
               return go.aw.ce(this.aa[var4] & '\uffff', 0, (byte)65);
            }
         }

         return true;
      } else if (null == this.aa) {
         return true;
      } else if (var1 != 10) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.aa.length; ++var3) {
            var2 &= go.aw.ce(this.aa[var3] & 1624936214, 0, (byte)69);
         }

         return var2;
      }
   }

   void as(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (var2 == 0) {
            return;
         }

         this.au(var1, var2, (byte)10);
      }
   }

   public final iv bi(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (this.ay == null) {
         var7 = (long)((this.at * -1529817365 << 10) + var2);
      } else {
         var7 = (long)(var2 + (-1529817365 * this.at << 10) + (var1 << 3));
      }

      Object var9 = (iv)ab.af(var7);
      if (null == var9) {
         iz var10 = this.ay(var1, var2, -1393577886);
         if (var10 == null) {
            return null;
         }

         if (!this.az) {
            var9 = var10.bb(64 + this.by * 1284125631, 768 + -18088891 * this.bb, -50, -10, -50);
         } else {
            var10.bo = (short)(1284125631 * this.by + 64);
            var10.bz = (short)(this.bb * -18088891 + 768);
            var10.ad();
            var9 = var10;
         }

         ab.aw((rk)var9, var7);
      }

      if (this.az) {
         var9 = ((iz)var9).ao();
      }

      if (-1437543955 * this.ak >= 0) {
         if (var9 instanceof it) {
            var9 = ((it)var9).at(var3, var4, var5, var6, true, this.ak * -1437543955);
         } else if (var9 instanceof iz) {
            var9 = ((iz)var9).ax(var3, var4, var5, var6, true, -1437543955 * this.ak);
         }
      }

      return (iv)var9;
   }

   public final it be(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (null == this.ay) {
         var7 = (long)((1473477817 * this.at << 10) + var2);
      } else {
         var7 = (long)((this.at * -1529817365 << 10) + (var1 << 3) + var2);
      }

      it var9 = (it)aq.af(var7);
      if (var9 == null) {
         iz var10 = this.ay(var1, var2, 837049316);
         if (var10 == null) {
            return null;
         }

         var9 = var10.bb(this.by * 1284125631 + 64, 210937984 + -446151184 * this.bb, -50, -625708688, -50);
         aq.aw(var9, var7);
      }

      if (this.ak * 1827119507 >= 0) {
         var9 = var9.at(var3, var4, var5, var6, true, 414226600 * this.ak);
      }

      return var9;
   }

   public final it bk(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (null == this.ay) {
         var7 = (long)((-1529817365 * this.at << 10) + var2);
      } else {
         var7 = (long)((this.at * -153794912 << 10) + (var1 << 3) + var2);
      }

      it var9 = (it)aq.af(var7);
      if (var9 == null) {
         iz var10 = this.ay(var1, var2, -1333707024);
         if (var10 == null) {
            return null;
         }

         var9 = var10.bb(this.by * 1284125631 + 64, -735647475 + -1517902111 * this.bb, -50, 1095129611, -1319222382);
         aq.aw(var9, var7);
      }

      if (this.ak * -1437543955 >= 0) {
         var9 = var9.at(var3, var4, var5, var6, true, 1355092949 * this.ak);
      }

      return var9;
   }

   public final it bx(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (null == this.ay) {
         var7 = (long)((995495977 * this.at << 10) + var2);
      } else {
         var7 = (long)((this.at * 1929349323 << 10) + (var1 << 3) + var2);
      }

      it var9 = (it)aq.af(var7);
      if (var9 == null) {
         iz var10 = this.ay(var1, var2, -1717747182);
         if (var10 == null) {
            return null;
         }

         var9 = var10.bb(this.by * 1284125631 + 119179726, -834072137 + -18088891 * this.bb, -50, -1373238886, -50);
         aq.aw(var9, var7);
      }

      if (this.ak * -1437543955 >= 0) {
         var9 = var9.at(var3, var4, var5, var6, true, -1437543955 * this.ak);
      }

      return var9;
   }

   public final hq bd() {
      int var1 = -1;
      if (-1 != 1411927451 * this.bf) {
         var1 = jy.af(1411927451 * this.bf, 1305493297);
      } else if (1685173773 * this.bq != -1) {
         var1 = le.aw[this.bq * 1685173773];
      }

      int var2;
      if (var1 >= 0 && var1 < this.bu.length - 1) {
         var2 = this.bu[var1];
      } else {
         var2 = this.bu[this.bu.length - 1];
      }

      return -1 != var2 ? fw.an(var2, (short)17939) : null;
   }

   public boolean bc() {
      if (this.bu == null) {
         return this.ba * 1820546879 != -1 || null != this.bc;
      } else {
         for(int var1 = 0; var1 < this.bu.length; ++var1) {
            if (-1 != this.bu[var1]) {
               hq var2 = fw.an(this.bu[var1], (short)23285);
               if (-1 != 290373291 * var2.ba || var2.bc != null) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   void am() {
      if (this.aj * 415653149 == -1) {
         this.aj = 0;
         if (null != this.aa && (null == this.ay || this.ay[0] == 10)) {
            this.aj = 1041321269;
         }

         for(int var1 = 0; var1 < 5; ++var1) {
            if (this.bi[var1] != null) {
               this.aj = 1041321269;
            }
         }
      }

      if (-1 == -1850643527 * this.bg) {
         this.bg = (this.am * -973955889 != 0 ? 1 : 0) * 1776888457;
      }

   }

   public boolean bh() {
      if (this.bu == null) {
         return this.ba * 1970571505 != -1 || null != this.bc;
      } else {
         for(int var1 = 0; var1 < this.bu.length; ++var1) {
            if (-1 != this.bu[var1]) {
               hq var2 = fw.an(this.bu[var1], (short)19514);
               if (-1 != 1970571505 * var2.ba || var2.bc != null) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public final hq bt() {
      int var1 = -1;
      if (-1 != 1411927451 * this.bf) {
         var1 = jy.af(1411927451 * this.bf, 1931996319);
      } else if (1685173773 * this.bq != -1) {
         var1 = le.aw[this.bq * 1685173773];
      }

      int var2;
      if (var1 >= 0 && var1 < this.bu.length - 1) {
         var2 = this.bu[var1];
      } else {
         var2 = this.bu[this.bu.length - 1];
      }

      return -1 != var2 ? fw.an(var2, (short)2504) : null;
   }

   public final hq bj() {
      int var1 = -1;
      if (-1 != 1411927451 * this.bf) {
         var1 = jy.af(735120569 * this.bf, 1879109256);
      } else if (1685173773 * this.bq != -1) {
         var1 = le.aw[this.bq * 549692019];
      }

      int var2;
      if (var1 >= 0 && var1 < this.bu.length - 1) {
         var2 = this.bu[var1];
      } else {
         var2 = this.bu[this.bu.length - 1];
      }

      return -1 != var2 ? fw.an(var2, (short)10611) : null;
   }

   public final boolean ae(int var1) {
      if (this.ay != null) {
         for(int var4 = 0; var4 < this.ay.length; ++var4) {
            if (this.ay[var4] == var1) {
               return go.aw.ce(this.aa[var4] & '\uffff', 0, (byte)63);
            }
         }

         return true;
      } else if (null == this.aa) {
         return true;
      } else if (var1 != 10) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.aa.length; ++var3) {
            var2 &= go.aw.ce(this.aa[var3] & '\uffff', 0, (byte)-1);
         }

         return var2;
      }
   }

   public int bs(int var1, int var2) {
      ro var4 = this.bw;
      int var3;
      if (null == var4) {
         var3 = var2;
      } else {
         rt var5 = (rt)var4.af((long)var1);
         if (null == var5) {
            var3 = var2;
         } else {
            var3 = var5.af;
         }
      }

      return var3;
   }

   public String ai(int var1, String var2, int var3) {
      try {
         return hx.an(this.bw, var1, var2, 2110621235);
      } catch (RuntimeException var4) {
         throw db.an(var4, "hq.ai(" + ')');
      }
   }

   public String bg(int var1, String var2) {
      return hx.an(this.bw, var1, var2, 1591817112);
   }

   public String bu(int var1, String var2) {
      return hx.an(this.bw, var1, var2, 1607567986);
   }

   public static void bf() {
      ac.ac();
      au.ac();
      ab.ac();
      aq.ac();
   }

   public static void bq() {
      ac.ac();
      au.ac();
      ab.ac();
      aq.ac();
   }

   public final it bm(int var1, int var2, int[][] var3, int var4, int var5, int var6, ha var7, int var8) {
      long var9;
      if (null == this.ay) {
         var9 = (long)(var2 + (this.at * -1529817365 << 10));
      } else {
         var9 = (long)(var2 + (this.at * -1529817365 << 10) + (var1 << 3));
      }

      it var11 = (it)aq.af(var9);
      if (var11 == null) {
         iz var12 = this.ay(var1, var2, -932381275);
         if (var12 == null) {
            return null;
         }

         var11 = var12.bb(64 + this.by * 1284125631, 768 + this.bb * -18088891, -50, -10, -50);
         aq.aw(var11, var9);
      }

      if (var7 == null && -1 == this.ak * -1437543955) {
         return var11;
      } else {
         if (null != var7) {
            var11 = var7.aq(var11, var8, var2, 16711935);
         } else {
            var11 = var11.aa(true);
         }

         if (-1437543955 * this.ak >= 0) {
            var11 = var11.at(var3, var4, var5, var6, false, -1437543955 * this.ak);
         }

         return var11;
      }
   }

   public static void bv() {
      ac.ac();
      au.ac();
      ab.ac();
      aq.ac();
   }

   public static void bl() {
      ac.ac();
      au.ac();
      ab.ac();
      aq.ac();
   }

   public boolean bp() {
      if (this.bu == null) {
         return this.ba * 1970571505 != -1 || null != this.bc;
      } else {
         for(int var1 = 0; var1 < this.bu.length; ++var1) {
            if (-1 != this.bu[var1]) {
               hq var2 = fw.an(this.bu[var1], (short)27600);
               if (-1 != 1970571505 * var2.ba || var2.bc != null) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   void ak(sg var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.cm((byte)7);
         if (var3 > 0) {
            if (this.aa != null && !af) {
               var1.at += -254100545 * var3;
            } else {
               this.ay = new int[var3];
               this.aa = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.aa[var4] = var1.cl(275301632);
                  this.ay[var4] = var1.cm((byte)7);
               }
            }
         }
      } else if (var2 == 2) {
         this.ao = var1.cw((byte)0);
      } else if (var2 == 5) {
         var3 = var1.cm((byte)7);
         if (var3 > 0) {
            if (this.aa != null && !af) {
               var1.at += var3 * 1262255402;
            } else {
               this.ay = null;
               this.aa = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.aa[var4] = var1.cl(-509329390);
               }
            }
         }
      } else if (var2 == 14) {
         this.av = var1.cm((byte)7) * 1205654711;
      } else if (15 == var2) {
         this.ar = var1.cm((byte)7) * 1159818229;
      } else if (var2 == 17) {
         this.am = 0;
         this.as = false;
      } else if (var2 == 18) {
         this.as = false;
      } else if (var2 == 19) {
         this.aj = var1.cm((byte)7) * 1041321269;
      } else if (var2 == 21) {
         this.ak = 0;
      } else if (var2 == 22) {
         this.az = true;
      } else if (23 == var2) {
         this.ad = true;
      } else if (var2 == 24) {
         this.ae = var1.cl(-1451819980) * -1142530427;
         if (65535 == 1292954189 * this.ae) {
            this.ae = 1142530427;
         }
      } else if (27 == var2) {
         this.am = 1356917295;
      } else if (var2 == 28) {
         this.ap = var1.cm((byte)7) * -1893671375;
      } else if (var2 == 29) {
         this.by = var1.cf(435772489) * 524532799;
      } else if (39 == var2) {
         this.bb = var1.cf(435772489) * -1238182971;
      } else if (var2 >= 30 && var2 < 35) {
         this.bi[var2 - 30] = var1.cw((byte)0);
         if (this.bi[var2 - 30].equalsIgnoreCase(mk.ac)) {
            this.bi[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var3 = var1.cm((byte)7);
         this.ax = new short[var3];
         this.ai = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ax[var4] = (short)var1.cl(-342438149);
            this.ai[var4] = (short)var1.cl(-510222877);
         }
      } else if (var2 == 41) {
         var3 = var1.cm((byte)7);
         this.ag = new short[var3];
         this.ah = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ag[var4] = (short)var1.cl(-941391818);
            this.ah[var4] = (short)var1.cl(-1810796775);
         }
      } else if (61 == var2) {
         var1.cl(326951040);
      } else if (62 == var2) {
         this.bx = true;
      } else if (64 == var2) {
         this.bo = false;
      } else if (65 == var2) {
         this.bz = var1.cl(255865028) * 1039146105;
      } else if (var2 == 66) {
         this.bm = var1.cl(877419536) * -677695703;
      } else if (var2 == 67) {
         this.bd = var1.cl(-1822531321) * 1862946657;
      } else if (var2 == 68) {
         this.bk = var1.cl(-1795784067) * -476568133;
      } else if (69 == var2) {
         var1.cm((byte)7);
      } else if (var2 == 70) {
         this.bt = var1.cg((byte)-56) * -327422321;
      } else if (71 == var2) {
         this.bj = var1.cg((byte)-46) * 956024773;
      } else if (72 == var2) {
         this.bn = var1.cg((byte)-96) * -127229215;
      } else if (73 == var2) {
         this.bs = true;
      } else if (74 == var2) {
         this.br = true;
      } else if (var2 == 75) {
         this.bg = var1.cm((byte)7) * 1776888457;
      } else if (var2 != 77 && var2 != 92) {
         if (78 == var2) {
            this.ba = var1.cl(-453705863) * -38705135;
            this.bv = var1.cm((byte)7) * 1190823625;
         } else if (var2 == 79) {
            this.bl = var1.cl(-155337547) * 1257958995;
            this.bp = var1.cl(-1700023977) * 230715233;
            this.bv = var1.cm((byte)7) * 1190823625;
            var3 = var1.cm((byte)7);
            this.bc = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.bc[var4] = var1.cl(-1027331075);
            }
         } else if (81 == var2) {
            this.ak = var1.cm((byte)7) * 708044032;
         } else if (var2 == 82) {
            this.be = var1.cl(-940542363) * -1683785829;
         } else if (89 == var2) {
            this.bh = false;
         } else if (var2 == 249) {
            this.bw = cp.af(var1, this.bw, (byte)-8);
         }
      } else {
         this.bf = var1.cl(-328634669) * 1157714067;
         if (1411927451 * this.bf == 65535) {
            this.bf = -1157714067;
         }

         this.bq = var1.cl(-778895613) * -1863808827;
         if (1685173773 * this.bq == 65535) {
            this.bq = 1863808827;
         }

         var3 = -1;
         if (var2 == 92) {
            var3 = var1.cl(-1114027003);
            if (65535 == var3) {
               var3 = -1;
            }
         }

         var4 = var1.cm((byte)7);
         this.bu = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.bu[var5] = var1.cl(130659752);
            if (this.bu[var5] == 65535) {
               this.bu[var5] = -1;
            }
         }

         this.bu[1 + var4] = var3;
      }

   }

   void ar() {
      if (this.aj * -1053247149 == -1) {
         this.aj = 0;
         if (null != this.aa && (null == this.ay || this.ay[0] == 10)) {
            this.aj = 1041321269;
         }

         for(int var1 = 0; var1 < 5; ++var1) {
            if (this.bi[var1] != null) {
               this.aj = 1041321269;
            }
         }
      }

      if (-1 == -1850643527 * this.bg) {
         this.bg = (this.am * -973955889 != 0 ? 1 : 0) * 809171642;
      }

   }

   static ch aw(int var0, int var1, byte var2) {
      try {
         ch var3 = (ch)ch.af.af((long)(var0 << 16));
         if (var3 != null) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            } else {
               return var3;
            }
         } else {
            String var4 = String.valueOf(var0);
            int var5 = ey.fj.cy(var4, 1230677243);
            if (var5 == -1) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               byte[] var6 = ey.fj.cn(var5, (byte)-8);
               if (var6 != null) {
                  if (var6.length <= 1) {
                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }

                     return null;
                  }

                  var3 = bz.ac(var6, (byte)1);
                  if (var3 != null) {
                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }

                     ch.af.aw(var3, (long)(var0 << 16));
                     return var3;
                  }
               }

               return null;
            }
         }
      } catch (RuntimeException var7) {
         throw db.an(var7, "hq.aw(" + ')');
      }
   }

   public int br(int var1, int var2) {
      ro var4 = this.bw;
      int var3;
      if (null == var4) {
         var3 = var2;
      } else {
         rt var5 = (rt)var4.af((long)var1);
         if (null == var5) {
            var3 = var2;
         } else {
            var3 = var5.af;
         }
      }

      return var3;
   }

   public static boolean au(int var0, int var1) {
      try {
         boolean var10000;
         if (0 != (var0 >> 22 & 1)) {
            if (var1 <= 740429811) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "hq.au(" + ')');
      }
   }
}
