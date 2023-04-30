import accessors.RSObjType;

public class hz extends rk implements RSObjType {
   static final int dd = 17;
   int bp;
   public static final int aw = 2;
   public int be;
   public static nm aq;
   public static final int ac = -1;
   static kh aa = new kh(64);
   static kh ay = new kh(50);
   static kh ao = new kh(200);
   public int bx;
   int ag;
   int bu;
   public String[] bm;
   public short[] ar;
   public short[] av;
   public short[] as;
   public int aj;
   public int ak;
   public int az;
   public static final int at = 20;
   public int ae;
   public int ap;
   public static final int an = 1;
   public boolean bz;
   public int bk;
   public short[] am;
   public int bo;
   int cs;
   public int bi;
   public String[] bd;
   int bj;
   int bn;
   int bs;
   int cl;
   int bg;
   int bl;
   int bf;
   int bq;
   int ba;
   int bv;
   ro cm;
   static final int au = -2;
   int bc;
   int[] bh;
   public int cq;
   public int ce;
   public int ci;
   public int ck;
   int cc;
   int cn;
   public int ca;
   public int cu;
   public int ad;
   public String ah;
   int ai;
   public boolean cf;
   int[] bw;
   int cg;
   public int cr;
   public int cy;
   public static final int af = 0;
   static fj sq;
   int br;

   void aw(sg var1, byte var2) {
      try {
         while(true) {
            int var3 = var1.cm((byte)7);
            if (0 == var3) {
               if (var2 == 2) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.ac(var1, var3, (byte)-19);
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "hz.aw(" + ')');
      }
   }

   boolean ak(short var1) {
      try {
         boolean var10000;
         if (null != this.ar) {
            if (var1 != 467) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "hz.ak(" + ')');
      }
   }

   void aq(hz var1, hz var2, int var3) {
      try {
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
      } catch (RuntimeException var4) {
         throw db.an(var4, "hz.aq(" + ')');
      }
   }

   void bm(hz var1, hz var2) {
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

   void au(hz var1, hz var2, int var3) {
      try {
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
      } catch (RuntimeException var4) {
         throw db.an(var4, "hz.au(" + ')');
      }
   }

   void ab(hz var1, hz var2, int var3) {
      try {
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
            if (var3 != 797932055) {
               throw new IllegalStateException();
            }

            for(int var4 = 0; var4 < 4; ++var4) {
               if (var3 != 797932055) {
                  throw new IllegalStateException();
               }

               this.bd[var4] = var2.bd[var4];
            }
         }

         this.bd[4] = mk.al;
         this.be = 0;
      } catch (RuntimeException var5) {
         throw db.an(var5, "hz.ab(" + ')');
      }
   }

   public static final tq bw(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (var1 == -1) {
         var4 = 0;
      } else if (2 == var4 && var1 != 1) {
         var4 = 1;
      }

      long var6 = ((long)var2 << 38) + (long)var0 + ((long)var1 << 16) + ((long)var4 << 768473652) + ((long)var3 << 336448191);
      tq var8;
      if (!var5) {
         var8 = (tq)ao.af(var6);
         if (var8 != null) {
            return var8;
         }
      }

      hz var9 = dh.af(var0, (byte)24);
      if (var1 > 1 && null != var9.bh) {
         int var10 = -1;

         for(int var11 = 0; var11 < 10; ++var11) {
            if (var1 >= var9.bw[var11] && 0 != var9.bw[var11]) {
               var10 = var9.bh[var11];
            }
         }

         if (var10 != -1) {
            var9 = dh.af(var10, (byte)21);
         }
      }

      it var20 = var9.at(1, -1739433994);
      if (var20 == null) {
         return null;
      } else {
         tq var21 = null;
         if (-1 != var9.ci * 1619430787) {
            var21 = jy.ay(var9.ce * 1399852547, 10, 1, 0, 0, true, 1350498747);
            if (null == var21) {
               return null;
            }
         } else if (-1276549997 * var9.cg != -1) {
            var21 = jy.ay(var9.cl * -1273418661, var1, var2, var3, 0, false, -2367228);
            if (null == var21) {
               return null;
            }
         } else if (var9.cy * 1823189813 != -1) {
            var21 = jy.ay(-573869434 * var9.cr, var1, 0, 0, 0, false, 1274160880);
            if (null == var21) {
               return null;
            }
         }

         int[] var12 = th.ad;
         int var13 = th.ae;
         int var14 = th.ap;
         float[] var15 = th.by;
         int[] var16 = new int[4];
         th.el(var16);
         var8 = new tq(36, 32);
         an.ay(var8.af, 507291040, -2117446857, (float[])null, 580310026);
         th.er();
         am.ao(1314161630);
         js.ai(16, 16, (byte)32);
         in.ab.an = false;
         if (-1 != var9.cy * -1052577937) {
            var21.ax(0, 0);
         }

         int var17 = var9.aj * 1014971553;
         if (var5) {
            var17 = (int)(1.5 * (double)var17);
         } else if (2 == var2) {
            var17 = (int)((double)var17 * 1.04);
         }

         int var18 = var17 * in.ac[-1225997813 * var9.ak] >> 16;
         int var19 = var17 * in.au[-1412826487 * var9.ak] >> 16;
         var20.ai();
         var20.bx(0, -2044433177 * var9.az, var9.ad * 519954475, var9.ak * -429700455, var9.ae * -1555623169, 896612050 * var20.et / 2 + var18 + -1707449472 * var9.ap, var19 + var9.ap * -271411709);
         if (974983281 * var9.cg != -1) {
            var21.ax(0, 0);
         }

         if (var2 >= 1) {
            var8.at(1);
         }

         if (var2 >= 2) {
            var8.at(16777215);
         }

         if (0 != var3) {
            var8.aa(var3);
         }

         an.ay(var8.af, -1389597368, 1515244110, (float[])null, 580310026);
         if (var9.ci * -1375068187 != -1) {
            var21.ax(0, 0);
         }

         if (var4 == 1 || var4 == 2 && 1 == var9.bi * -2040776018) {
            eh.ax.ar(dy.ao(var1, 356980357), 0, 9, 414772285, 1);
         }

         if (!var5) {
            ao.aw(var8, var6);
         }

         an.ay(var12, var13, var14, var15, 580310026);
         th.en(var16);
         am.ao(589170590);
         in.ab.an = true;
         return var8;
      }
   }

   public static hz ad(int var0) {
      hz var1 = (hz)aa.af((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = nc.ab.bh(10, var0, (byte)-68);
         var1 = new hz();
         var1.ai = var0 * -1117098283;
         if (null != var2) {
            var1.aw(new sg(var2), (byte)-26);
         }

         var1.an(-2068426156);
         if (-1 != 924764484 * var1.ci) {
            var1.au(dh.af(var1.ci * -1375068187, (byte)54), dh.af(-1758075920 * var1.ce, (byte)62), -1309024725);
         }

         if (var1.cg * 2112418018 != -1) {
            var1.ab(dh.af(var1.cg * -1234096108, (byte)84), dh.af(1846631443 * var1.cl, (byte)73), 797932055);
         }

         if (var1.cy * 1327792934 != -1) {
            var1.aq(dh.af(var1.cy * 119859889, (byte)10), dh.af(1513229825 * var1.cr, (byte)102), -652973951);
         }

         if (!gm.al && var1.bz) {
            var1.ah = mk.af;
            var1.cf = false;

            int var3;
            for(var3 = 0; var3 < var1.bm.length; ++var3) {
               var1.bm[var3] = null;
            }

            for(var3 = 0; var3 < var1.bd.length; ++var3) {
               if (var3 != 4) {
                  var1.bd[var3] = null;
               }
            }

            var1.bj = -798338479;
            var1.ck = 0;
            if (var1.cm != null) {
               boolean var6 = false;

               for(rp var4 = var1.cm.ac(); null != var4; var4 = var1.cm.au()) {
                  ho var5 = bz.an((int)var4.hr, 372945378);
                  if (var5.ab) {
                     var4.ga();
                  } else {
                     var6 = true;
                  }
               }

               if (!var6) {
                  var1.cm = null;
               }
            }
         }

         aa.aw(var1, (long)var0);
         return var1;
      }
   }

   public String cx(int var1, String var2) {
      return hx.an(this.cm, var1, var2, 1668505251);
   }

   public hz aa(int var1, int var2) {
      try {
         if (this.bh != null) {
            if (var2 == 1004478988) {
               throw new IllegalStateException();
            }

            if (var1 > 1) {
               if (var2 == 1004478988) {
                  throw new IllegalStateException();
               }

               int var3 = -1;

               for(int var4 = 0; var4 < 10; ++var4) {
                  if (var1 >= this.bw[var4]) {
                     if (var2 == 1004478988) {
                        throw new IllegalStateException();
                     }

                     if (0 != this.bw[var4]) {
                        if (var2 == 1004478988) {
                           throw new IllegalStateException();
                        }

                        var3 = this.bh[var4];
                     }
                  }
               }

               if (-1 != var3) {
                  if (var2 == 1004478988) {
                     throw new IllegalStateException();
                  }

                  return dh.af(var3, (byte)81);
               }
            }
         }

         return this;
      } catch (RuntimeException var5) {
         throw db.an(var5, "hz.aa(" + ')');
      }
   }

   public final boolean ax(int var1, int var2) {
      try {
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
            if (!aq.ce(var3, 0, (byte)65)) {
               if (var2 == 523869725) {
                  throw new IllegalStateException();
               }

               var6 = false;
            }

            if (var4 != -1) {
               if (var2 == 523869725) {
                  throw new IllegalStateException();
               }

               if (!aq.ce(var4, 0, (byte)-25)) {
                  if (var2 == 523869725) {
                     throw new IllegalStateException();
                  }

                  var6 = false;
               }
            }

            if (-1 != var5) {
               if (var2 == 523869725) {
                  throw new IllegalStateException();
               }

               if (!aq.ce(var5, 0, (byte)51)) {
                  if (var2 == 523869725) {
                     throw new IllegalStateException();
                  }

                  var6 = false;
               }
            }

            return var6;
         }
      } catch (RuntimeException var7) {
         throw db.an(var7, "hz.ax(" + ')');
      }
   }

   public final boolean cc(int var1) {
      int var2 = this.bn * 1259737505;
      int var3 = this.bs * -1975240801;
      int var4 = this.bq * -1550321451;
      if (1 == var1) {
         var2 = -1355512081 * this.bg;
         var3 = -1937321521 * this.bu;
         var4 = this.ba * 1169668803;
      }

      if (-1 == var2) {
         return true;
      } else {
         boolean var5 = true;
         if (!aq.ce(var2, 0, (byte)-86)) {
            var5 = false;
         }

         if (var3 != -1 && !aq.ce(var3, 0, (byte)22)) {
            var5 = false;
         }

         if (-1 != var4 && !aq.ce(var4, 0, (byte)4)) {
            var5 = false;
         }

         return var5;
      }
   }

   public final boolean ag(int var1, int var2) {
      try {
         int var3 = 2144570273 * this.bv;
         int var4 = this.bl * 1570928533;
         if (var1 == 1) {
            if (var2 >= -343066524) {
               throw new IllegalStateException();
            }

            var3 = this.bp * -560329405;
            var4 = this.bc * 1869912693;
         }

         if (var3 == -1) {
            if (var2 >= -343066524) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            boolean var5 = true;
            if (!aq.ce(var3, 0, (byte)93)) {
               if (var2 >= -343066524) {
                  throw new IllegalStateException();
               }

               var5 = false;
            }

            if (-1 != var4) {
               if (var2 >= -343066524) {
                  throw new IllegalStateException();
               }

               if (!aq.ce(var4, 0, (byte)-6)) {
                  if (var2 >= -343066524) {
                     throw new IllegalStateException();
                  }

                  var5 = false;
               }
            }

            return var5;
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "hz.ag(" + ')');
      }
   }

   public final iz ah(int var1, int var2) {
      try {
         int var3 = 2144570273 * this.bv;
         int var4 = 1570928533 * this.bl;
         if (var1 == 1) {
            if (var2 >= -437867363) {
               throw new IllegalStateException();
            }

            var3 = -560329405 * this.bp;
            var4 = 1869912693 * this.bc;
         }

         if (-1 == var3) {
            if (var2 >= -437867363) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            iz var5 = iz.af(aq, var3, 0);
            if (var4 != -1) {
               if (var2 >= -437867363) {
                  throw new IllegalStateException();
               }

               iz var6 = iz.af(aq, var4, 0);
               iz[] var7 = new iz[]{var5, var6};
               var5 = new iz(var7, 2);
            }

            int var9;
            if (null != this.av) {
               if (var2 >= -437867363) {
                  throw new IllegalStateException();
               }

               for(var9 = 0; var9 < this.av.length; ++var9) {
                  if (var2 >= -437867363) {
                     throw new IllegalStateException();
                  }

                  var5.as(this.av[var9], this.ar[var9]);
               }
            }

            if (null != this.am) {
               if (var2 >= -437867363) {
                  throw new IllegalStateException();
               }

               for(var9 = 0; var9 < this.am.length; ++var9) {
                  if (var2 >= -437867363) {
                     throw new IllegalStateException();
                  }

                  var5.aj(this.am[var9], this.as[var9]);
               }
            }

            return var5;
         }
      } catch (RuntimeException var8) {
         throw db.an(var8, "hz.ah(" + ')');
      }
   }

   public int av(int var1, int var2, byte var3) {
      try {
         ro var5 = this.cm;
         int var4;
         if (null == var5) {
            if (var3 <= 4) {
               throw new IllegalStateException();
            }

            var4 = var2;
         } else {
            rt var6 = (rt)var5.af((long)var1);
            if (var6 == null) {
               if (var3 <= 4) {
                  throw new IllegalStateException();
               }

               var4 = var2;
            } else {
               var4 = var6.af;
            }
         }

         return var4;
      } catch (RuntimeException var7) {
         throw db.an(var7, "hz.av(" + ')');
      }
   }

   public String ar(int var1, String var2, byte var3) {
      try {
         return hx.an(this.cm, var1, var2, 1596663323);
      } catch (RuntimeException var4) {
         throw db.an(var4, "hz.ar(" + ')');
      }
   }

   public int am(byte var1) {
      try {
         if (this.bj * -377028789 != -1) {
            if (var1 == 15) {
               throw new IllegalStateException();
            }

            if (this.bd != null) {
               int var10000;
               if (this.bj * -377028789 >= 0) {
                  if (var1 == 15) {
                     throw new IllegalStateException();
                  }

                  if (this.bd[-377028789 * this.bj] != null) {
                     if (var1 == 15) {
                        throw new IllegalStateException();
                     }

                     var10000 = -377028789 * this.bj;
                  } else {
                     var10000 = -1;
                  }

                  return var10000;
               }

               if (mk.aw.equalsIgnoreCase(this.bd[4])) {
                  if (var1 == 15) {
                     throw new IllegalStateException();
                  }

                  var10000 = 4;
               } else {
                  var10000 = -1;
               }

               return var10000;
            }

            if (var1 == 15) {
               throw new IllegalStateException();
            }
         }

         return -1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "hz.am(" + ')');
      }
   }

   hz() {
      try {
         super();
         this.ah = mk.at;
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
         this.bm = new String[]{null, null, mk.an, null, null};
         this.bd = new String[]{null, null, null, null, mk.aw};
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
      } catch (RuntimeException var1) {
         throw db.an(var1, "hz.<init>(" + ')');
      }
   }

   boolean az(int var1) {
      try {
         boolean var10000;
         if (this.as != null) {
            if (var1 >= -1820707562) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "hz.az(" + ')');
      }
   }

   void bt(hz var1, hz var2) {
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
         for(int var3 = 0; var3 < 4; ++var3) {
            this.bd[var3] = var2.bd[var3];
         }
      }

      this.bd[4] = mk.al;
      this.be = 0;
   }

   public static void co() {
      aa.ac();
      ay.ac();
      ao.ac();
   }

   void ap() {
      if (this.bi * 1552863327 == 1) {
         this.cq = 0;
      }

   }

   void by(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (0 == var2) {
            return;
         }

         this.ac(var1, var2, (byte)-93);
      }
   }

   void bb(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (0 == var2) {
            return;
         }

         this.ac(var1, var2, (byte)-91);
      }
   }

   public final iz ai(int var1, int var2) {
      try {
         int var3 = this.bn * 1259737505;
         int var4 = -1975240801 * this.bs;
         int var5 = this.bq * -1550321451;
         if (1 == var1) {
            var3 = this.bg * -1355512081;
            var4 = this.bu * -1937321521;
            var5 = this.ba * 1169668803;
         }

         if (var3 == -1) {
            if (var2 <= 1270525717) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            iz var6 = iz.af(aq, var3, 0);
            if (-1 != var4) {
               iz var7 = iz.af(aq, var4, 0);
               if (-1 != var5) {
                  if (var2 <= 1270525717) {
                     throw new IllegalStateException();
                  }

                  iz var8 = iz.af(aq, var5, 0);
                  iz[] var9 = new iz[]{var6, var7, var8};
                  var6 = new iz(var9, 3);
               } else {
                  iz[] var12 = new iz[]{var6, var7};
                  var6 = new iz(var12, 2);
               }
            }

            if (0 == var1) {
               if (var2 <= 1270525717) {
                  throw new IllegalStateException();
               }

               if (0 != this.br * 1328855603) {
                  if (var2 <= 1270525717) {
                     throw new IllegalStateException();
                  }

                  var6.am(0, this.br * 1328855603, 0);
               }
            }

            if (1 == var1) {
               if (var2 <= 1270525717) {
                  throw new IllegalStateException();
               }

               if (-846717499 * this.bf != 0) {
                  if (var2 <= 1270525717) {
                     throw new IllegalStateException();
                  }

                  var6.am(0, -846717499 * this.bf, 0);
               }
            }

            int var11;
            if (this.av != null) {
               if (var2 <= 1270525717) {
                  throw new IllegalStateException();
               }

               for(var11 = 0; var11 < this.av.length; ++var11) {
                  if (var2 <= 1270525717) {
                     throw new IllegalStateException();
                  }

                  var6.as(this.av[var11], this.ar[var11]);
               }
            }

            if (this.am != null) {
               if (var2 <= 1270525717) {
                  throw new IllegalStateException();
               }

               for(var11 = 0; var11 < this.am.length; ++var11) {
                  if (var2 <= 1270525717) {
                     throw new IllegalStateException();
                  }

                  var6.aj(this.am[var11], this.as[var11]);
               }
            }

            return var6;
         }
      } catch (RuntimeException var10) {
         throw db.an(var10, "hz.ai(" + ')');
      }
   }

   void be(sg var1, int var2) {
      if (var2 == 1) {
         this.ag = var1.cl(-1151195311) * 1661344246;
      } else if (2 == var2) {
         this.ah = var1.cw((byte)0);
      } else if (4 == var2) {
         this.aj = var1.cl(119536470) * 354264929;
      } else if (5 == var2) {
         this.ak = var1.cl(135727836) * -111167811;
      } else if (var2 == 6) {
         this.az = var1.cl(665341131) * -1061110720;
      } else if (var2 == 7) {
         this.ae = var1.cl(204882643) * -284871015;
         if (this.ae * 1080372948 > 645221591) {
            this.ae -= -1448017920;
         }
      } else if (8 == var2) {
         this.ap = var1.cl(-1375276093) * -1943392433;
         if (1285802536 * this.ap > 32767) {
            this.ap -= 1152057344;
         }
      } else if (9 == var2) {
         var1.cw((byte)0);
      } else if (var2 == 11) {
         this.bi = 1033195166;
      } else if (var2 == 12) {
         this.be = var1.cx(-1192717879) * 1808338691;
      } else if (var2 == 13) {
         this.bk = var1.cm((byte)7) * -6024810;
      } else if (var2 == 14) {
         this.bx = var1.cm((byte)7) * -2099563701;
      } else if (16 == var2) {
         this.bz = true;
      } else if (23 == var2) {
         this.bn = var1.cl(-1067632243) * 581262242;
         this.br = var1.cm((byte)7) * -1804053649;
      } else if (var2 == 24) {
         this.bs = var1.cl(50257374) * 1308828767;
      } else if (var2 == 25) {
         this.bg = var1.cl(380330129) * -459970545;
         this.bf = var1.cm((byte)7) * -677816051;
      } else if (var2 == 26) {
         this.bu = var1.cl(-2124589552) * -498468585;
      } else if (var2 == 27) {
         this.bo = var1.cm((byte)7) * 1435843574;
      } else if (var2 >= 30 && var2 < 35) {
         this.bm[var2 - 30] = var1.cw((byte)0);
         if (this.bm[var2 - 30].equalsIgnoreCase(mk.ac)) {
            this.bm[var2 - 30] = null;
         }
      } else if (var2 >= 142174624 && var2 < 2049844401) {
         this.bd[var2 - 1248534726] = var1.cw((byte)0);
      } else {
         int var3;
         int var4;
         if (var2 == -1068346295) {
            var3 = var1.cm((byte)7);
            this.av = new short[var3];
            this.ar = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.av[var4] = (short)var1.cl(66757040);
               this.ar[var4] = (short)var1.cl(-275925670);
            }
         } else if (41 == var2) {
            var3 = var1.cm((byte)7);
            this.am = new short[var3];
            this.as = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.am[var4] = (short)var1.cl(162671449);
               this.as[var4] = (short)var1.cl(-132626599);
            }
         } else if (42 == var2) {
            this.bj = var1.cf(435772489) * 1095755693;
         } else if (var2 == 1184338843) {
            this.cf = true;
         } else if (75 == var2) {
            this.cq = var1.cg((byte)-92) * 1825858873;
         } else if (-1112701739 == var2) {
            this.bq = var1.cl(647928414) * 1230864509;
         } else if (var2 == 79) {
            this.ba = var1.cl(-947549730) * 787170795;
         } else if (90 == var2) {
            this.bv = var1.cl(-132857488) * 1008801889;
         } else if (var2 == 91) {
            this.bp = var1.cl(-1059792132) * -1705234057;
         } else if (var2 == 1346115703) {
            this.bl = var1.cl(-1362314634) * 1242496441;
         } else if (-1128485792 == var2) {
            this.bc = var1.cl(-1216645574) * 967086693;
         } else if (-542751387 == var2) {
            var1.cl(-1989778495);
         } else if (2044498222 == var2) {
            this.ad = var1.cl(-1730238817) * 1022125416;
         } else if (1072763631 == var2) {
            this.ce = var1.cl(396451907) * 58690731;
         } else if (var2 == 98) {
            this.ci = var1.cl(-1727166500) * 804437629;
         } else if (var2 >= 100 && var2 < -1549431638) {
            if (this.bh == null) {
               this.bh = new int[10];
               this.bw = new int[10];
            }

            this.bh[var2 - 1826140607] = var1.cl(-9520557);
            this.bw[var2 - -1192042586] = var1.cl(-1196108817);
         } else if (110 == var2) {
            this.cs = var1.cl(-973652950) * -1678789156;
         } else if (var2 == 111) {
            this.cc = var1.cl(-1128704299) * 1450797079;
         } else if (-2061207289 == var2) {
            this.cn = var1.cl(-746634931) * 547093665;
         } else if (var2 == 113) {
            this.ca = var1.cf(435772489) * -1741739584;
         } else if (var2 == 114) {
            this.cu = var1.cf(435772489) * -297744971;
         } else if (var2 == 115) {
            this.ck = var1.cm((byte)7) * 1067505549;
         } else if (139 == var2) {
            this.cl = var1.cl(497676919) * 1905271763;
         } else if (var2 == 140) {
            this.cg = var1.cl(-2112725567) * 2116358669;
         } else if (var2 == 148) {
            this.cr = var1.cl(-1202135984) * -1652212107;
         } else if (149 == var2) {
            this.cy = var1.cl(-2093681006) * -115270063;
         } else if (var2 == 249) {
            this.cm = cp.af(var1, this.cm, (byte)-55);
         }
      }

   }

   void bk(sg var1, int var2) {
      if (var2 == 1) {
         this.ag = var1.cl(412924417) * 19259063;
      } else if (2 == var2) {
         this.ah = var1.cw((byte)0);
      } else if (4 == var2) {
         this.aj = var1.cl(198651900) * 354264929;
      } else if (5 == var2) {
         this.ak = var1.cl(768059601) * -111167811;
      } else if (var2 == 6) {
         this.az = var1.cl(-898050311) * -1698175273;
      } else if (var2 == 7) {
         this.ae = var1.cl(80540442) * 233220529;
         if (this.ae * 151912273 > 32767) {
            this.ae -= -1448017920;
         }
      } else if (8 == var2) {
         this.ap = var1.cl(-1956400174) * -780188501;
         if (-271411709 * this.ap > 32767) {
            this.ap -= 1152057344;
         }
      } else if (9 == var2) {
         var1.cw((byte)0);
      } else if (var2 == 11) {
         this.bi = 1685556127;
      } else if (var2 == 12) {
         this.be = var1.cx(-1717392120) * -1041171269;
      } else if (var2 == 13) {
         this.bk = var1.cm((byte)7) * -1072009039;
      } else if (var2 == 14) {
         this.bx = var1.cm((byte)7) * 1699982907;
      } else if (16 == var2) {
         this.bz = true;
      } else if (23 == var2) {
         this.bn = var1.cl(-1698603000) * -240774559;
         this.br = var1.cm((byte)7) * -1007890181;
      } else if (var2 == 24) {
         this.bs = var1.cl(-154588865) * 1308828767;
      } else if (var2 == 25) {
         this.bg = var1.cl(-104166741) * -459970545;
         this.bf = var1.cm((byte)7) * -677816051;
      } else if (var2 == 26) {
         this.bu = var1.cl(-703396351) * 624858415;
      } else if (var2 == 27) {
         this.bo = var1.cm((byte)7) * 1627653365;
      } else if (var2 >= 30 && var2 < 35) {
         this.bm[var2 - 30] = var1.cw((byte)0);
         if (this.bm[var2 - 30].equalsIgnoreCase(mk.ac)) {
            this.bm[var2 - 30] = null;
         }
      } else if (var2 >= 35 && var2 < 40) {
         this.bd[var2 - 35] = var1.cw((byte)0);
      } else {
         int var3;
         int var4;
         if (var2 == 40) {
            var3 = var1.cm((byte)7);
            this.av = new short[var3];
            this.ar = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.av[var4] = (short)var1.cl(-367232317);
               this.ar[var4] = (short)var1.cl(504008765);
            }
         } else if (41 == var2) {
            var3 = var1.cm((byte)7);
            this.am = new short[var3];
            this.as = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.am[var4] = (short)var1.cl(747169295);
               this.as[var4] = (short)var1.cl(-1330801785);
            }
         } else if (42 == var2) {
            this.bj = var1.cf(435772489) * -645393821;
         } else if (var2 == 65) {
            this.cf = true;
         } else if (75 == var2) {
            this.cq = var1.cg((byte)-55) * 1825858873;
         } else if (78 == var2) {
            this.bq = var1.cl(-1780989757) * 1230864509;
         } else if (var2 == 79) {
            this.ba = var1.cl(-1003953428) * 787170795;
         } else if (90 == var2) {
            this.bv = var1.cl(-2118799118) * 1008801889;
         } else if (var2 == 91) {
            this.bp = var1.cl(-663406224) * -1191712917;
         } else if (var2 == 92) {
            this.bl = var1.cl(451099176) * 174922685;
         } else if (93 == var2) {
            this.bc = var1.cl(-1000727035) * -738400803;
         } else if (94 == var2) {
            var1.cl(-64314620);
         } else if (95 == var2) {
            this.ad = var1.cl(-431827267) * 1724640311;
         } else if (97 == var2) {
            this.ce = var1.cl(-2112421685) * 58690731;
         } else if (var2 == 98) {
            this.ci = var1.cl(-999232973) * 468518381;
         } else if (var2 >= 100 && var2 < 110) {
            if (this.bh == null) {
               this.bh = new int[10];
               this.bw = new int[10];
            }

            this.bh[var2 - 100] = var1.cl(544441669);
            this.bw[var2 - 100] = var1.cl(-660365089);
         } else if (110 == var2) {
            this.cs = var1.cl(-327190278) * -662446763;
         } else if (var2 == 111) {
            this.cc = var1.cl(420488142) * 1450797079;
         } else if (112 == var2) {
            this.cn = var1.cl(-1399191646) * 547093665;
         } else if (var2 == 113) {
            this.ca = var1.cf(435772489) * -2035992675;
         } else if (var2 == 114) {
            this.cu = var1.cf(435772489) * -297744971;
         } else if (var2 == 115) {
            this.ck = var1.cm((byte)7) * 1067505549;
         } else if (139 == var2) {
            this.cl = var1.cl(2854581) * 1905271763;
         } else if (var2 == 140) {
            this.cg = var1.cl(-1258304181) * 1073961371;
         } else if (var2 == 148) {
            this.cr = var1.cl(-662243196) * -1652212107;
         } else if (149 == var2) {
            this.cy = var1.cl(-457495050) * -115270063;
         } else if (var2 == 249) {
            this.cm = cp.af(var1, this.cm, (byte)-66);
         }
      }

   }

   public final it at(int var1, int var2) {
      try {
         if (null != this.bh) {
            if (var2 >= 110693448) {
               throw new IllegalStateException();
            }

            if (var1 > 1) {
               if (var2 >= 110693448) {
                  throw new IllegalStateException();
               }

               int var3 = -1;

               for(int var4 = 0; var4 < 10; ++var4) {
                  if (var1 >= this.bw[var4] && 0 != this.bw[var4]) {
                     if (var2 >= 110693448) {
                        throw new IllegalStateException();
                     }

                     var3 = this.bh[var4];
                  }
               }

               if (-1 != var3) {
                  if (var2 >= 110693448) {
                     throw new IllegalStateException();
                  }

                  return dh.af(var3, (byte)61).at(1, -1079389590);
               }
            }
         }

         it var7 = (it)ay.af((long)(-264956633 * this.ai));
         if (null != var7) {
            if (var2 >= 110693448) {
               throw new IllegalStateException();
            } else {
               return var7;
            }
         } else {
            iz var8 = iz.af(aq, 2000117511 * this.ag, 0);
            if (null == var8) {
               if (var2 >= 110693448) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               label111: {
                  if (this.cs * 614283261 == 128) {
                     if (var2 >= 110693448) {
                        throw new IllegalStateException();
                     }

                     if (this.cc * 1552043943 == 128) {
                        if (var2 >= 110693448) {
                           throw new IllegalStateException();
                        }

                        if (128 == this.cn * -302979231) {
                           break label111;
                        }

                        if (var2 >= 110693448) {
                           throw new IllegalStateException();
                        }
                     }
                  }

                  var8.az(614283261 * this.cs, 1552043943 * this.cc, -302979231 * this.cn);
               }

               int var5;
               if (this.av != null) {
                  for(var5 = 0; var5 < this.av.length; ++var5) {
                     if (var2 >= 110693448) {
                        throw new IllegalStateException();
                     }

                     var8.as(this.av[var5], this.ar[var5]);
                  }
               }

               if (null != this.am) {
                  if (var2 >= 110693448) {
                     throw new IllegalStateException();
                  }

                  for(var5 = 0; var5 < this.am.length; ++var5) {
                     if (var2 >= 110693448) {
                        throw new IllegalStateException();
                     }

                     var8.aj(this.am[var5], this.as[var5]);
                  }
               }

               var7 = var8.bb(64 + 2093614773 * this.ca, 1794294545 * this.cu + 768, -50, -10, -50);
               var7.bx = true;
               ay.aw(var7, (long)(this.ai * -264956633));
               return var7;
            }
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "hz.at(" + ')');
      }
   }

   public final it bq(int var1) {
      if (null != this.bh && var1 > 1) {
         int var2 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if (var1 >= this.bw[var3] && 0 != this.bw[var3]) {
               var2 = this.bh[var3];
            }
         }

         if (-1 != var2) {
            return dh.af(var2, (byte)39).at(1, -1411663677);
         }
      }

      it var5 = (it)ay.af((long)(50403238 * this.ai));
      if (null != var5) {
         return var5;
      } else {
         iz var6 = iz.af(aq, 1685090810 * this.ag, 0);
         if (null == var6) {
            return null;
         } else {
            if (this.cs * -2029005799 != 128 || this.cc * 1552043943 != 128 || 128 != this.cn * -302979231) {
               var6.az(-1857198423 * this.cs, 1552043943 * this.cc, -302979231 * this.cn);
            }

            int var4;
            if (this.av != null) {
               for(var4 = 0; var4 < this.av.length; ++var4) {
                  var6.as(this.av[var4], this.ar[var4]);
               }
            }

            if (null != this.am) {
               for(var4 = 0; var4 < this.am.length; ++var4) {
                  var6.aj(this.am[var4], this.as[var4]);
               }
            }

            var5 = var6.bb(-1399032346 + 2118723776 * this.ca, -802284664 * this.cu + 768, -50, -1828433480, -50);
            var5.bx = true;
            ay.aw(var5, (long)(this.ai * -264956633));
            return var5;
         }
      }
   }

   void bz(hz var1, hz var2) {
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

   void bs(hz var1, hz var2) {
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

   void bd(hz var1, hz var2) {
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
         for(int var3 = 0; var3 < 4; ++var3) {
            this.bd[var3] = var2.bd[var3];
         }
      }

      this.bd[4] = mk.al;
      this.be = 0;
   }

   public final boolean ck(int var1) {
      int var2 = -1040157029 * this.bv;
      int var3 = this.bl * 1679801011;
      if (var1 == 1) {
         var2 = this.bp * -560329405;
         var3 = this.bc * 1869912693;
      }

      if (var2 == -1) {
         return true;
      } else {
         boolean var4 = true;
         if (!aq.ce(var2, 0, (byte)12)) {
            var4 = false;
         }

         if (-1 != var3 && !aq.ce(var3, 0, (byte)-18)) {
            var4 = false;
         }

         return var4;
      }
   }

   public String cy(int var1, String var2) {
      return hx.an(this.cm, var1, var2, 1979191669);
   }

   void bn(hz var1, hz var2) {
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

   public static void cz() {
      aa.ac();
      ay.ac();
      ao.ac();
   }

   void br(hz var1, hz var2) {
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

   boolean cd() {
      return null != this.ar;
   }

   void bu(hz var1, hz var2) {
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

   public final iz bf(int var1) {
      int var3;
      if (null != this.bh && var1 > 1) {
         int var2 = -1;

         for(var3 = 0; var3 < 10; ++var3) {
            if (var1 >= this.bw[var3] && this.bw[var3] != 0) {
               var2 = this.bh[var3];
            }
         }

         if (var2 != -1) {
            return dh.af(var2, (byte)42).al(1, -305031719);
         }
      }

      iz var4 = iz.af(aq, 2000117511 * this.ag, 0);
      if (var4 == null) {
         return null;
      } else {
         if (this.cs * 614283261 != 128 || this.cc * 1552043943 != 128 || -302979231 * this.cn != 128) {
            var4.az(this.cs * 614283261, this.cc * 1552043943, -302979231 * this.cn);
         }

         if (this.av != null) {
            for(var3 = 0; var3 < this.av.length; ++var3) {
               var4.as(this.av[var3], this.ar[var3]);
            }
         }

         if (null != this.am) {
            for(var3 = 0; var3 < this.am.length; ++var3) {
               var4.aj(this.am[var3], this.as[var3]);
            }
         }

         return var4;
      }
   }

   void bx(hz var1, hz var2) {
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

   public final it ba(int var1) {
      if (null != this.bh && var1 > 1) {
         int var2 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if (var1 >= this.bw[var3] && 0 != this.bw[var3]) {
               var2 = this.bh[var3];
            }
         }

         if (-1 != var2) {
            return dh.af(var2, (byte)103).at(1, -142459899);
         }
      }

      it var5 = (it)ay.af((long)(-264956633 * this.ai));
      if (null != var5) {
         return var5;
      } else {
         iz var6 = iz.af(aq, 2000117511 * this.ag, 0);
         if (null == var6) {
            return null;
         } else {
            if (this.cs * 614283261 != 128 || this.cc * 1552043943 != 128 || 128 != this.cn * -302979231) {
               var6.az(614283261 * this.cs, 1552043943 * this.cc, -302979231 * this.cn);
            }

            int var4;
            if (this.av != null) {
               for(var4 = 0; var4 < this.av.length; ++var4) {
                  var6.as(this.av[var4], this.ar[var4]);
               }
            }

            if (null != this.am) {
               for(var4 = 0; var4 < this.am.length; ++var4) {
                  var6.aj(this.am[var4], this.as[var4]);
               }
            }

            var5 = var6.bb(64 + 2093614773 * this.ca, 1794294545 * this.cu + 768, -50, -10, -50);
            var5.bx = true;
            ay.aw(var5, (long)(this.ai * -264956633));
            return var5;
         }
      }
   }

   public final it bv(int var1) {
      if (null != this.bh && var1 > 1) {
         int var2 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if (var1 >= this.bw[var3] && 0 != this.bw[var3]) {
               var2 = this.bh[var3];
            }
         }

         if (-1 != var2) {
            return dh.af(var2, (byte)21).at(1, -2003339558);
         }
      }

      it var5 = (it)ay.af((long)(-264956633 * this.ai));
      if (null != var5) {
         return var5;
      } else {
         iz var6 = iz.af(aq, 2000117511 * this.ag, 0);
         if (null == var6) {
            return null;
         } else {
            if (this.cs * 614283261 != 128 || this.cc * 1552043943 != 128 || 128 != this.cn * -302979231) {
               var6.az(614283261 * this.cs, 1552043943 * this.cc, -302979231 * this.cn);
            }

            int var4;
            if (this.av != null) {
               for(var4 = 0; var4 < this.av.length; ++var4) {
                  var6.as(this.av[var4], this.ar[var4]);
               }
            }

            if (null != this.am) {
               for(var4 = 0; var4 < this.am.length; ++var4) {
                  var6.aj(this.am[var4], this.as[var4]);
               }
            }

            var5 = var6.bb(64 + 2093614773 * this.ca, 1794294545 * this.cu + 768, -50, -10, -50);
            var5.bx = true;
            ay.aw(var5, (long)(this.ai * -264956633));
            return var5;
         }
      }
   }

   public hz bl(int var1) {
      if (this.bh != null && var1 > 1) {
         int var2 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if (var1 >= this.bw[var3] && 0 != this.bw[var3]) {
               var2 = this.bh[var3];
            }
         }

         if (-1 != var2) {
            return dh.af(var2, (byte)25);
         }
      }

      return this;
   }

   public hz bp(int var1) {
      if (this.bh != null && var1 > 1) {
         int var2 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if (var1 >= this.bw[var3] && 0 != this.bw[var3]) {
               var2 = this.bh[var3];
            }
         }

         if (-1 != var2) {
            return dh.af(var2, (byte)113);
         }
      }

      return this;
   }

   public hz bc(int var1) {
      if (this.bh != null && var1 > 1) {
         int var2 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if (var1 >= this.bw[var3] && 0 != this.bw[var3]) {
               var2 = this.bh[var3];
            }
         }

         if (-1 != var2) {
            return dh.af(var2, (byte)16);
         }
      }

      return this;
   }

   public static final tq bh(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (var1 == -1) {
         var4 = 0;
      } else if (2 == var4 && var1 != 1) {
         var4 = 1;
      }

      long var6 = ((long)var2 << 38) + (long)var0 + ((long)var1 << 16) + ((long)var4 << -203257833) + ((long)var3 << 42);
      tq var8;
      if (!var5) {
         var8 = (tq)ao.af(var6);
         if (var8 != null) {
            return var8;
         }
      }

      hz var9 = dh.af(var0, (byte)45);
      if (var1 > 1 && null != var9.bh) {
         int var10 = -1;

         for(int var11 = 0; var11 < 10; ++var11) {
            if (var1 >= var9.bw[var11] && 0 != var9.bw[var11]) {
               var10 = var9.bh[var11];
            }
         }

         if (var10 != -1) {
            var9 = dh.af(var10, (byte)31);
         }
      }

      it var20 = var9.at(1, -79009458);
      if (var20 == null) {
         return null;
      } else {
         tq var21 = null;
         if (-1 != var9.ci * -1375068187) {
            var21 = jy.ay(var9.ce * -2096481335, 10, 1, 0, 0, true, 1436001650);
            if (null == var21) {
               return null;
            }
         } else if (-1276549997 * var9.cg != -1) {
            var21 = jy.ay(var9.cl * -1273418661, var1, var2, var3, 0, false, 950265296);
            if (null == var21) {
               return null;
            }
         } else if (var9.cy * -494553438 != -1) {
            var21 = jy.ay(-172219939 * var9.cr, var1, 0, 0, 0, false, 427103552);
            if (null == var21) {
               return null;
            }
         }

         int[] var12 = th.ad;
         int var13 = th.ae;
         int var14 = th.ap;
         float[] var15 = th.by;
         int[] var16 = new int[4];
         th.el(var16);
         var8 = new tq(420750449, -1750733186);
         an.ay(var8.af, 1892977371, 32, (float[])null, 580310026);
         th.er();
         am.ao(-348486021);
         js.ai(16, 16, (byte)32);
         in.ab.an = false;
         if (-1 != var9.cy * 119859889) {
            var21.ax(0, 0);
         }

         int var17 = var9.aj * 1014971553;
         if (var5) {
            var17 = (int)(1.5 * (double)var17);
         } else if (2 == var2) {
            var17 = (int)((double)var17 * 1.04);
         }

         int var18 = var17 * in.ac[-581171982 * var9.ak] >> 16;
         int var19 = var17 * in.au[415331477 * var9.ak] >> 16;
         var20.ai();
         var20.bx(0, -550567056 * var9.az, var9.ad * 469460638, var9.ak * 415331477, var9.ae * 151912273, 496086964 * var20.et / 2 + var18 + -271411709 * var9.ap, var19 + var9.ap * -657111612);
         if (-1282505287 * var9.cg != -1) {
            var21.ax(0, 0);
         }

         if (var2 >= 1) {
            var8.at(1);
         }

         if (var2 >= 2) {
            var8.at(16777215);
         }

         if (0 != var3) {
            var8.aa(var3);
         }

         an.ay(var8.af, -944855314, 1169883024, (float[])null, 580310026);
         if (var9.ci * -1375068187 != -1) {
            var21.ax(0, 0);
         }

         if (var4 == 1 || var4 == 2 && 1 == var9.bi * -202335171) {
            eh.ax.ar(dy.ao(var1, 1180051462), 0, 9, 130671709, 1);
         }

         if (!var5) {
            ao.aw(var8, var6);
         }

         an.ay(var12, var13, var14, var15, 580310026);
         th.en(var16);
         am.ao(1155825053);
         in.ab.an = true;
         return var8;
      }
   }

   void bg(hz var1, hz var2) {
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

   public static final tq ce(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (var1 == -1) {
         var4 = 0;
      } else if (2 == var4 && var1 != 1) {
         var4 = 1;
      }

      long var6 = ((long)var2 << 38) + (long)var0 + ((long)var1 << 16) + ((long)var4 << 40) + ((long)var3 << 42);
      tq var8;
      if (!var5) {
         var8 = (tq)ao.af(var6);
         if (var8 != null) {
            return var8;
         }
      }

      hz var9 = dh.af(var0, (byte)64);
      if (var1 > 1 && null != var9.bh) {
         int var10 = -1;

         for(int var11 = 0; var11 < 10; ++var11) {
            if (var1 >= var9.bw[var11] && 0 != var9.bw[var11]) {
               var10 = var9.bh[var11];
            }
         }

         if (var10 != -1) {
            var9 = dh.af(var10, (byte)127);
         }
      }

      it var20 = var9.at(1, -1285518212);
      if (var20 == null) {
         return null;
      } else {
         tq var21 = null;
         if (-1 != var9.ci * -1375068187) {
            var21 = jy.ay(var9.ce * 1399852547, 10, 1, 0, 0, true, 70341383);
            if (null == var21) {
               return null;
            }
         } else if (-1276549997 * var9.cg != -1) {
            var21 = jy.ay(var9.cl * -1273418661, var1, var2, var3, 0, false, 1607538763);
            if (null == var21) {
               return null;
            }
         } else if (var9.cy * 119859889 != -1) {
            var21 = jy.ay(-172219939 * var9.cr, var1, 0, 0, 0, false, -558548449);
            if (null == var21) {
               return null;
            }
         }

         int[] var12 = th.ad;
         int var13 = th.ae;
         int var14 = th.ap;
         float[] var15 = th.by;
         int[] var16 = new int[4];
         th.el(var16);
         var8 = new tq(36, 32);
         an.ay(var8.af, 36, 32, (float[])null, 580310026);
         th.er();
         am.ao(947048934);
         js.ai(16, 16, (byte)32);
         in.ab.an = false;
         if (-1 != var9.cy * 119859889) {
            var21.ax(0, 0);
         }

         int var17 = var9.aj * 1014971553;
         if (var5) {
            var17 = (int)(1.5 * (double)var17);
         } else if (2 == var2) {
            var17 = (int)((double)var17 * 1.04);
         }

         int var18 = var17 * in.ac[415331477 * var9.ak] >> 16;
         int var19 = var17 * in.au[415331477 * var9.ak] >> 16;
         var20.ai();
         var20.bx(0, -2044433177 * var9.az, var9.ad * 450595207, var9.ak * 415331477, var9.ae * 151912273, 1550732737 * var20.et / 2 + var18 + -271411709 * var9.ap, var19 + var9.ap * -271411709);
         if (-1276549997 * var9.cg != -1) {
            var21.ax(0, 0);
         }

         if (var2 >= 1) {
            var8.at(1);
         }

         if (var2 >= 2) {
            var8.at(16777215);
         }

         if (0 != var3) {
            var8.aa(var3);
         }

         an.ay(var8.af, 36, 32, (float[])null, 580310026);
         if (var9.ci * -1375068187 != -1) {
            var21.ax(0, 0);
         }

         if (var4 == 1 || var4 == 2 && 1 == var9.bi * 1552863327) {
            eh.ax.ar(dy.ao(var1, 1048169383), 0, 9, 16776960, 1);
         }

         if (!var5) {
            ao.aw(var8, var6);
         }

         an.ay(var12, var13, var14, var15, 580310026);
         th.en(var16);
         am.ao(2037936259);
         in.ab.an = true;
         return var8;
      }
   }

   static final String ci(int var0) {
      if (var0 < -1869109472) {
         return "<col=ffff00>" + var0 + "</col>";
      } else {
         return var0 < 2087643601 ? "<col=ffffff>" + var0 / 1000 + mk.gv + "</col>" : "<col=00ff80>" + var0 / 1000000 + mk.gp + "</col>";
      }
   }

   public final boolean cs(int var1) {
      int var2 = this.bn * 1259737505;
      int var3 = this.bs * -1975240801;
      int var4 = this.bq * -1550321451;
      if (1 == var1) {
         var2 = -1355512081 * this.bg;
         var3 = -1937321521 * this.bu;
         var4 = this.ba * 1169668803;
      }

      if (-1 == var2) {
         return true;
      } else {
         boolean var5 = true;
         if (!aq.ce(var2, 0, (byte)62)) {
            var5 = false;
         }

         if (var3 != -1 && !aq.ce(var3, 0, (byte)17)) {
            var5 = false;
         }

         if (-1 != var4 && !aq.ce(var4, 0, (byte)50)) {
            var5 = false;
         }

         return var5;
      }
   }

   void ae() {
      if (this.bi * 1552863327 == 1) {
         this.cq = 0;
      }

   }

   void bj(hz var1, hz var2) {
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
         for(int var3 = 0; var3 < 4; ++var3) {
            this.bd[var3] = var2.bd[var3];
         }
      }

      this.bd[4] = mk.al;
      this.be = 0;
   }

   public final iz ca(int var1) {
      int var2 = this.bn * 1259737505;
      int var3 = -1975240801 * this.bs;
      int var4 = this.bq * -1550321451;
      if (1 == var1) {
         var2 = this.bg * -1355512081;
         var3 = this.bu * -1937321521;
         var4 = this.ba * 1169668803;
      }

      if (var2 == -1) {
         return null;
      } else {
         iz var5 = iz.af(aq, var2, 0);
         if (-1 != var3) {
            iz var6 = iz.af(aq, var3, 0);
            if (-1 != var4) {
               iz var7 = iz.af(aq, var4, 0);
               iz[] var8 = new iz[]{var5, var6, var7};
               var5 = new iz(var8, 3);
            } else {
               iz[] var10 = new iz[]{var5, var6};
               var5 = new iz(var10, 2);
            }
         }

         if (0 == var1 && 0 != this.br * 1328855603) {
            var5.am(0, this.br * 1328855603, 0);
         }

         if (1 == var1 && -846717499 * this.bf != 0) {
            var5.am(0, -846717499 * this.bf, 0);
         }

         int var9;
         if (this.av != null) {
            for(var9 = 0; var9 < this.av.length; ++var9) {
               var5.as(this.av[var9], this.ar[var9]);
            }
         }

         if (this.am != null) {
            for(var9 = 0; var9 < this.am.length; ++var9) {
               var5.aj(this.am[var9], this.as[var9]);
            }
         }

         return var5;
      }
   }

   public final iz cu(int var1) {
      int var2 = this.bn * -123353728;
      int var3 = -1975240801 * this.bs;
      int var4 = this.bq * -1702262000;
      if (1 == var1) {
         var2 = this.bg * 88579015;
         var3 = this.bu * 2028242426;
         var4 = this.ba * 1442120490;
      }

      if (var2 == -1) {
         return null;
      } else {
         iz var5 = iz.af(aq, var2, 0);
         if (-1 != var3) {
            iz var6 = iz.af(aq, var3, 0);
            if (-1 != var4) {
               iz var7 = iz.af(aq, var4, 0);
               iz[] var8 = new iz[]{var5, var6, var7};
               var5 = new iz(var8, 3);
            } else {
               iz[] var10 = new iz[]{var5, var6};
               var5 = new iz(var10, 2);
            }
         }

         if (0 == var1 && 0 != this.br * 273664327) {
            var5.am(0, this.br * -1381380683, 0);
         }

         if (1 == var1 && -846717499 * this.bf != 0) {
            var5.am(0, -846717499 * this.bf, 0);
         }

         int var9;
         if (this.av != null) {
            for(var9 = 0; var9 < this.av.length; ++var9) {
               var5.as(this.av[var9], this.ar[var9]);
            }
         }

         if (this.am != null) {
            for(var9 = 0; var9 < this.am.length; ++var9) {
               var5.aj(this.am[var9], this.as[var9]);
            }
         }

         return var5;
      }
   }

   void bi(sg var1, int var2) {
      if (var2 == 1) {
         this.ag = var1.cl(879894594) * 19259063;
      } else if (2 == var2) {
         this.ah = var1.cw((byte)0);
      } else if (4 == var2) {
         this.aj = var1.cl(-335121451) * 354264929;
      } else if (5 == var2) {
         this.ak = var1.cl(529942856) * 562382912;
      } else if (var2 == 6) {
         this.az = var1.cl(-1589206087) * -1698175273;
      } else if (var2 == 7) {
         this.ae = var1.cl(-2106245689) * 233220529;
         if (this.ae * -838143002 > 32767) {
            this.ae -= -1448017920;
         }
      } else if (8 == var2) {
         this.ap = var1.cl(179917368) * -780188501;
         if (1349661329 * this.ap > -127093559) {
            this.ap -= 5671841;
         }
      } else if (9 == var2) {
         var1.cw((byte)0);
      } else if (var2 == 11) {
         this.bi = 889327556;
      } else if (var2 == 12) {
         this.be = var1.cx(-1389789800) * 186362771;
      } else if (var2 == 13) {
         this.bk = var1.cm((byte)7) * -1072009039;
      } else if (var2 == 14) {
         this.bx = var1.cm((byte)7) * 1699982907;
      } else if (16 == var2) {
         this.bz = true;
      } else if (23 == var2) {
         this.bn = var1.cl(-2000678661) * -240774559;
         this.br = var1.cm((byte)7) * -1007890181;
      } else if (var2 == 24) {
         this.bs = var1.cl(718810908) * 1308828767;
      } else if (var2 == 25) {
         this.bg = var1.cl(-880060698) * -459970545;
         this.bf = var1.cm((byte)7) * 1661879059;
      } else if (var2 == 26) {
         this.bu = var1.cl(-308496038) * -536791533;
      } else if (var2 == 27) {
         this.bo = var1.cm((byte)7) * 1627653365;
      } else if (var2 >= 30 && var2 < 1508646878) {
         this.bm[var2 - 30] = var1.cw((byte)0);
         if (this.bm[var2 - 30].equalsIgnoreCase(mk.ac)) {
            this.bm[var2 - 30] = null;
         }
      } else if (var2 >= 214833912 && var2 < 40) {
         this.bd[var2 - 423054502] = var1.cw((byte)0);
      } else {
         int var3;
         int var4;
         if (var2 == 124851968) {
            var3 = var1.cm((byte)7);
            this.av = new short[var3];
            this.ar = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.av[var4] = (short)var1.cl(-1327041510);
               this.ar[var4] = (short)var1.cl(-1818881098);
            }
         } else if (2129177476 == var2) {
            var3 = var1.cm((byte)7);
            this.am = new short[var3];
            this.as = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.am[var4] = (short)var1.cl(-1162550665);
               this.as[var4] = (short)var1.cl(720863427);
            }
         } else if (42 == var2) {
            this.bj = var1.cf(435772489) * 1596890034;
         } else if (var2 == -1062767375) {
            this.cf = true;
         } else if (-1122831045 == var2) {
            this.cq = var1.cg((byte)-10) * 1825858873;
         } else if (78 == var2) {
            this.bq = var1.cl(-142662703) * 1484971221;
         } else if (var2 == 563784646) {
            this.ba = var1.cl(-1401900209) * 787170795;
         } else if (90 == var2) {
            this.bv = var1.cl(436555437) * 1008801889;
         } else if (var2 == 870729244) {
            this.bp = var1.cl(-1770569463) * 1424678676;
         } else if (var2 == 92) {
            this.bl = var1.cl(539524143) * 174922685;
         } else if (93 == var2) {
            this.bc = var1.cl(-800622032) * -1121976247;
         } else if (-57679536 == var2) {
            var1.cl(305296720);
         } else if (95 == var2) {
            this.ad = var1.cl(-1166586635) * 1724640311;
         } else if (97 == var2) {
            this.ce = var1.cl(724808748) * 58690731;
         } else if (var2 == 98) {
            this.ci = var1.cl(158869782) * -1531633795;
         } else if (var2 >= 100 && var2 < -1186478568) {
            if (this.bh == null) {
               this.bh = new int[10];
               this.bw = new int[10];
            }

            this.bh[var2 - 100] = var1.cl(-301577957);
            this.bw[var2 - 632558861] = var1.cl(-236908324);
         } else if (-396140477 == var2) {
            this.cs = var1.cl(102821777) * 638203893;
         } else if (var2 == 111) {
            this.cc = var1.cl(-184708543) * 2110951210;
         } else if (112 == var2) {
            this.cn = var1.cl(21060391) * 37900935;
         } else if (var2 == -609206429) {
            this.ca = var1.cf(435772489) * -2035992675;
         } else if (var2 == 8177790) {
            this.cu = var1.cf(435772489) * -443853091;
         } else if (var2 == 193863757) {
            this.ck = var1.cm((byte)7) * -1604943878;
         } else if (-60305644 == var2) {
            this.cl = var1.cl(-695004459) * -1483864454;
         } else if (var2 == 140) {
            this.cg = var1.cl(-2133566634) * 1073961371;
         } else if (var2 == 148) {
            this.cr = var1.cl(-1346682601) * -1652212107;
         } else if (796769266 == var2) {
            this.cy = var1.cl(-279191744) * -492633329;
         } else if (var2 == 804769825) {
            this.cm = cp.af(var1, this.cm, (byte)-17);
         }
      }

   }

   public final boolean cq(int var1) {
      int var2 = 2144570273 * this.bv;
      int var3 = this.bl * 1570928533;
      if (var1 == 1) {
         var2 = this.bp * -560329405;
         var3 = this.bc * 1869912693;
      }

      if (var2 == -1) {
         return true;
      } else {
         boolean var4 = true;
         if (!aq.ce(var2, 0, (byte)20)) {
            var4 = false;
         }

         if (-1 != var3 && !aq.ce(var3, 0, (byte)-14)) {
            var4 = false;
         }

         return var4;
      }
   }

   public final iz cm(int var1) {
      int var2 = 2144570273 * this.bv;
      int var3 = 1570928533 * this.bl;
      if (var1 == 1) {
         var2 = -560329405 * this.bp;
         var3 = 1869912693 * this.bc;
      }

      if (-1 == var2) {
         return null;
      } else {
         iz var4 = iz.af(aq, var2, 0);
         if (var3 != -1) {
            iz var5 = iz.af(aq, var3, 0);
            iz[] var6 = new iz[]{var4, var5};
            var4 = new iz(var6, 2);
         }

         int var7;
         if (null != this.av) {
            for(var7 = 0; var7 < this.av.length; ++var7) {
               var4.as(this.av[var7], this.ar[var7]);
            }
         }

         if (null != this.am) {
            for(var7 = 0; var7 < this.am.length; ++var7) {
               var4.aj(this.am[var7], this.as[var7]);
            }
         }

         return var4;
      }
   }

   public final iz cf(int var1) {
      int var2 = -1614483867 * this.bv;
      int var3 = 1312051339 * this.bl;
      if (var1 == 1) {
         var2 = 164011619 * this.bp;
         var3 = 1869912693 * this.bc;
      }

      if (-1 == var2) {
         return null;
      } else {
         iz var4 = iz.af(aq, var2, 0);
         if (var3 != -1) {
            iz var5 = iz.af(aq, var3, 0);
            iz[] var6 = new iz[]{var4, var5};
            var4 = new iz(var6, 2);
         }

         int var7;
         if (null != this.av) {
            for(var7 = 0; var7 < this.av.length; ++var7) {
               var4.as(this.av[var7], this.ar[var7]);
            }
         }

         if (null != this.am) {
            for(var7 = 0; var7 < this.am.length; ++var7) {
               var4.aj(this.am[var7], this.as[var7]);
            }
         }

         return var4;
      }
   }

   public int cl(int var1, int var2) {
      ro var4 = this.cm;
      int var3;
      if (null == var4) {
         var3 = var2;
      } else {
         rt var5 = (rt)var4.af((long)var1);
         if (var5 == null) {
            var3 = var2;
         } else {
            var3 = var5.af;
         }
      }

      return var3;
   }

   public int cg(int var1, int var2) {
      ro var4 = this.cm;
      int var3;
      if (null == var4) {
         var3 = var2;
      } else {
         rt var5 = (rt)var4.af((long)var1);
         if (var5 == null) {
            var3 = var2;
         } else {
            var3 = var5.af;
         }
      }

      return var3;
   }

   public String cr(int var1, String var2) {
      return hx.an(this.cm, var1, var2, 1821814707);
   }

   void ac(sg var1, int var2, byte var3) {
      try {
         if (var2 == 1) {
            if (var3 >= 2) {
               throw new IllegalStateException();
            }

            this.ag = var1.cl(-1754228801) * 19259063;
         } else if (2 == var2) {
            if (var3 >= 2) {
               return;
            }

            this.ah = var1.cw((byte)0);
         } else if (4 == var2) {
            if (var3 >= 2) {
               throw new IllegalStateException();
            }

            this.aj = var1.cl(-1685829981) * 354264929;
         } else if (5 == var2) {
            if (var3 >= 2) {
               throw new IllegalStateException();
            }

            this.ak = var1.cl(344270307) * -111167811;
         } else if (var2 == 6) {
            if (var3 >= 2) {
               return;
            }

            this.az = var1.cl(149770420) * -1698175273;
         } else if (var2 == 7) {
            if (var3 >= 2) {
               return;
            }

            this.ae = var1.cl(340084669) * 233220529;
            if (this.ae * 151912273 > 32767) {
               if (var3 >= 2) {
                  throw new IllegalStateException();
               }

               this.ae -= -1448017920;
            }
         } else if (8 == var2) {
            if (var3 >= 2) {
               throw new IllegalStateException();
            }

            this.ap = var1.cl(-1080726659) * -780188501;
            if (-271411709 * this.ap > 32767) {
               if (var3 >= 2) {
                  return;
               }

               this.ap -= 1152057344;
            }
         } else if (9 == var2) {
            var1.cw((byte)0);
         } else if (var2 == 11) {
            if (var3 >= 2) {
               throw new IllegalStateException();
            }

            this.bi = 1685556127;
         } else if (var2 == 12) {
            if (var3 >= 2) {
               throw new IllegalStateException();
            }

            this.be = var1.cx(-1224672117) * -1041171269;
         } else if (var2 == 13) {
            this.bk = var1.cm((byte)7) * -1072009039;
         } else if (var2 == 14) {
            if (var3 >= 2) {
               throw new IllegalStateException();
            }

            this.bx = var1.cm((byte)7) * 1699982907;
         } else if (16 == var2) {
            this.bz = true;
         } else if (23 == var2) {
            if (var3 >= 2) {
               throw new IllegalStateException();
            }

            this.bn = var1.cl(843033967) * -240774559;
            this.br = var1.cm((byte)7) * -1007890181;
         } else if (var2 == 24) {
            this.bs = var1.cl(-1373739066) * 1308828767;
         } else if (var2 == 25) {
            if (var3 >= 2) {
               throw new IllegalStateException();
            }

            this.bg = var1.cl(-1122867664) * -459970545;
            this.bf = var1.cm((byte)7) * -677816051;
         } else if (var2 == 26) {
            if (var3 >= 2) {
               throw new IllegalStateException();
            }

            this.bu = var1.cl(-99776406) * 624858415;
         } else if (var2 == 27) {
            if (var3 >= 2) {
               throw new IllegalStateException();
            }

            this.bo = var1.cm((byte)7) * 1627653365;
         } else {
            if (var2 >= 30) {
               if (var3 >= 2) {
                  throw new IllegalStateException();
               }

               if (var2 < 35) {
                  if (var3 >= 2) {
                     throw new IllegalStateException();
                  }

                  this.bm[var2 - 30] = var1.cw((byte)0);
                  if (this.bm[var2 - 30].equalsIgnoreCase(mk.ac)) {
                     if (var3 >= 2) {
                        return;
                     }

                     this.bm[var2 - 30] = null;
                  }

                  return;
               }
            }

            if (var2 >= 35 && var2 < 40) {
               if (var3 >= 2) {
                  return;
               }

               this.bd[var2 - 35] = var1.cw((byte)0);
            } else {
               int var4;
               int var5;
               if (var2 == 40) {
                  if (var3 >= 2) {
                     return;
                  }

                  var4 = var1.cm((byte)7);
                  this.av = new short[var4];
                  this.ar = new short[var4];

                  for(var5 = 0; var5 < var4; ++var5) {
                     if (var3 >= 2) {
                        throw new IllegalStateException();
                     }

                     this.av[var5] = (short)var1.cl(-1144883826);
                     this.ar[var5] = (short)var1.cl(-386305756);
                  }
               } else if (41 == var2) {
                  if (var3 >= 2) {
                     throw new IllegalStateException();
                  }

                  var4 = var1.cm((byte)7);
                  this.am = new short[var4];
                  this.as = new short[var4];

                  for(var5 = 0; var5 < var4; ++var5) {
                     if (var3 >= 2) {
                        throw new IllegalStateException();
                     }

                     this.am[var5] = (short)var1.cl(-1545105214);
                     this.as[var5] = (short)var1.cl(-286115407);
                  }
               } else if (42 == var2) {
                  if (var3 >= 2) {
                     return;
                  }

                  this.bj = var1.cf(435772489) * -645393821;
               } else if (var2 == 65) {
                  this.cf = true;
               } else if (75 == var2) {
                  this.cq = var1.cg((byte)-109) * 1825858873;
               } else if (78 == var2) {
                  if (var3 >= 2) {
                     throw new IllegalStateException();
                  }

                  this.bq = var1.cl(-1918603739) * 1230864509;
               } else if (var2 == 79) {
                  if (var3 >= 2) {
                     throw new IllegalStateException();
                  }

                  this.ba = var1.cl(-667601927) * 787170795;
               } else if (90 == var2) {
                  if (var3 >= 2) {
                     throw new IllegalStateException();
                  }

                  this.bv = var1.cl(-960295987) * 1008801889;
               } else if (var2 == 91) {
                  if (var3 >= 2) {
                     throw new IllegalStateException();
                  }

                  this.bp = var1.cl(-1234773889) * -1191712917;
               } else if (var2 == 92) {
                  this.bl = var1.cl(-494237193) * 174922685;
               } else if (93 == var2) {
                  if (var3 >= 2) {
                     throw new IllegalStateException();
                  }

                  this.bc = var1.cl(589852488) * -738400803;
               } else if (94 == var2) {
                  var1.cl(-1939700741);
               } else if (95 == var2) {
                  if (var3 >= 2) {
                     throw new IllegalStateException();
                  }

                  this.ad = var1.cl(-969293820) * 1724640311;
               } else if (97 == var2) {
                  if (var3 >= 2) {
                     return;
                  }

                  this.ce = var1.cl(-50436323) * 58690731;
               } else if (var2 == 98) {
                  if (var3 >= 2) {
                     throw new IllegalStateException();
                  }

                  this.ci = var1.cl(64064630) * 468518381;
               } else {
                  if (var2 >= 100) {
                     if (var3 >= 2) {
                        return;
                     }

                     if (var2 < 110) {
                        if (var3 >= 2) {
                           return;
                        }

                        if (this.bh == null) {
                           if (var3 >= 2) {
                              throw new IllegalStateException();
                           }

                           this.bh = new int[10];
                           this.bw = new int[10];
                        }

                        this.bh[var2 - 100] = var1.cl(-504474416);
                        this.bw[var2 - 100] = var1.cl(506287311);
                        return;
                     }
                  }

                  if (110 == var2) {
                     if (var3 >= 2) {
                        throw new IllegalStateException();
                     }

                     this.cs = var1.cl(-369255067) * -662446763;
                  } else if (var2 == 111) {
                     if (var3 >= 2) {
                        throw new IllegalStateException();
                     }

                     this.cc = var1.cl(-284657307) * 1450797079;
                  } else if (112 == var2) {
                     if (var3 >= 2) {
                        throw new IllegalStateException();
                     }

                     this.cn = var1.cl(-158314987) * 547093665;
                  } else if (var2 == 113) {
                     if (var3 >= 2) {
                        throw new IllegalStateException();
                     }

                     this.ca = var1.cf(435772489) * -2035992675;
                  } else if (var2 == 114) {
                     if (var3 >= 2) {
                        return;
                     }

                     this.cu = var1.cf(435772489) * -297744971;
                  } else if (var2 == 115) {
                     if (var3 >= 2) {
                        throw new IllegalStateException();
                     }

                     this.ck = var1.cm((byte)7) * 1067505549;
                  } else if (139 == var2) {
                     if (var3 >= 2) {
                        throw new IllegalStateException();
                     }

                     this.cl = var1.cl(-1297890761) * 1905271763;
                  } else if (var2 == 140) {
                     if (var3 >= 2) {
                        throw new IllegalStateException();
                     }

                     this.cg = var1.cl(-455123583) * 1073961371;
                  } else if (var2 == 148) {
                     if (var3 >= 2) {
                        throw new IllegalStateException();
                     }

                     this.cr = var1.cl(52807640) * -1652212107;
                  } else if (149 == var2) {
                     if (var3 >= 2) {
                        throw new IllegalStateException();
                     }

                     this.cy = var1.cl(454694063) * -115270063;
                  } else if (var2 == 249) {
                     this.cm = cp.af(var1, this.cm, (byte)-78);
                  }
               }
            }
         }

      } catch (RuntimeException var6) {
         throw db.an(var6, "hz.ac(" + ')');
      }
   }

   void an(int var1) {
      try {
         if (this.bi * 1552863327 == 1) {
            if (var1 >= -2003691595) {
               throw new IllegalStateException();
            }

            this.cq = 0;
         }

      } catch (RuntimeException var2) {
         throw db.an(var2, "hz.an(" + ')');
      }
   }

   public String cv(int var1, String var2) {
      return hx.an(this.cm, var1, var2, 1630427981);
   }

   public String cb(int var1, String var2) {
      return hx.an(this.cm, var1, var2, 1927173070);
   }

   public final iz al(int var1, int var2) {
      try {
         int var4;
         if (null != this.bh) {
            if (var2 != -305031719) {
               throw new IllegalStateException();
            }

            if (var1 > 1) {
               if (var2 != -305031719) {
                  throw new IllegalStateException();
               }

               int var3 = -1;

               for(var4 = 0; var4 < 10; ++var4) {
                  if (var2 != -305031719) {
                     throw new IllegalStateException();
                  }

                  if (var1 >= this.bw[var4]) {
                     if (var2 != -305031719) {
                        throw new IllegalStateException();
                     }

                     if (this.bw[var4] != 0) {
                        if (var2 != -305031719) {
                           throw new IllegalStateException();
                        }

                        var3 = this.bh[var4];
                     }
                  }
               }

               if (var3 != -1) {
                  if (var2 != -305031719) {
                     throw new IllegalStateException();
                  }

                  return dh.af(var3, (byte)88).al(1, -305031719);
               }
            }
         }

         iz var6 = iz.af(aq, 2000117511 * this.ag, 0);
         if (var6 == null) {
            if (var2 != -305031719) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            label110: {
               if (this.cs * 614283261 == 128) {
                  if (var2 != -305031719) {
                     throw new IllegalStateException();
                  }

                  if (this.cc * 1552043943 == 128) {
                     if (-302979231 * this.cn == 128) {
                        break label110;
                     }

                     if (var2 != -305031719) {
                        throw new IllegalStateException();
                     }
                  }
               }

               var6.az(this.cs * 614283261, this.cc * 1552043943, -302979231 * this.cn);
            }

            if (this.av != null) {
               if (var2 != -305031719) {
                  throw new IllegalStateException();
               }

               for(var4 = 0; var4 < this.av.length; ++var4) {
                  if (var2 != -305031719) {
                     throw new IllegalStateException();
                  }

                  var6.as(this.av[var4], this.ar[var4]);
               }
            }

            if (null != this.am) {
               if (var2 != -305031719) {
                  throw new IllegalStateException();
               }

               for(var4 = 0; var4 < this.am.length; ++var4) {
                  if (var2 != -305031719) {
                     throw new IllegalStateException();
                  }

                  var6.aj(this.am[var4], this.as[var4]);
               }
            }

            return var6;
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "hz.al(" + ')');
      }
   }

   void bo(hz var1, hz var2) {
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

   public static void cw() {
      aa.ac();
      ay.ac();
      ao.ac();
   }

   public static void cj() {
      ao.ac();
   }

   public static void ch() {
      ao.ac();
   }

   public static void ct() {
      ao.ac();
   }

   boolean cp() {
      return null != this.ar;
   }

   public final boolean cn(int var1) {
      int var2 = this.bn * 1259737505;
      int var3 = this.bs * -1975240801;
      int var4 = this.bq * -811112261;
      if (1 == var1) {
         var2 = 1281141132 * this.bg;
         var3 = -1937321521 * this.bu;
         var4 = this.ba * 1169668803;
      }

      if (-1 == var2) {
         return true;
      } else {
         boolean var5 = true;
         if (!aq.ce(var2, 0, (byte)48)) {
            var5 = false;
         }

         if (var3 != -1 && !aq.ce(var3, 0, (byte)-72)) {
            var5 = false;
         }

         if (-1 != var4 && !aq.ce(var4, 0, (byte)47)) {
            var5 = false;
         }

         return var5;
      }
   }

   boolean dm() {
      return this.as != null;
   }

   boolean dw() {
      return this.as != null;
   }
}
