import accessors.RSSeqType;
import java.util.HashMap;
import java.util.Map;

public class ha extends rk implements RSSeqType {
   int ax;
   public static kh al = new kh(64);
   public int ap;
   public static final int ac = 2;
   boolean[] aj;
   static nm ab;
   static nm aq;
   static final int aw = 1;
   public int az;
   public static kh aa = new kh(100);
   public int ay;
   int[] ah;
   static boolean af = false;
   int ai;
   public int[] ag;
   public int am;
   public static kh at = new kh(100);
   public int[] ar;
   public int[] av;
   int[] as;
   static final int an = 0;
   public boolean ak;
   public boolean by;
   public int ad;
   public int ae;
   static nm au;
   public Map ao;
   public int bb;
   public int bi;
   public int be;

   it bx(it var1, int var2, int var3) {
      it var5;
      if (!this.ao(-1773877668)) {
         var2 = this.ag[var2];
         io var6 = kb.ai(var2 >> 16, -616996593);
         var2 &= 400930930;
         if (var6 == null) {
            return var1.aa(true);
         } else {
            var5 = var1.aa(!var6.an(var2, -12726073));
            var3 &= 3;
            if (var3 == 1) {
               var5.bb();
            } else if (var3 == 2) {
               var5.by();
            } else if (var3 == 3) {
               var5.ap();
            }

            var5.ar(var6, var2);
            if (var3 == 1) {
               var5.ap();
            } else if (var3 == 2) {
               var5.by();
            } else if (var3 == 3) {
               var5.bb();
            }

            return var5;
         }
      } else {
         fh var4 = dx.av(168349591 * this.ay, 2145766101);
         if (null == var4) {
            return var1.aa(true);
         } else {
            var5 = var1.aa(!var4.au(1713081171));
            var3 &= 3;
            if (var3 == 1) {
               var5.bb();
            } else if (var3 == 2) {
               var5.by();
            } else if (var3 == 3) {
               var5.ap();
            }

            var5.am(var4, var2);
            if (1 == var3) {
               var5.ap();
            } else if (var3 == 2) {
               var5.by();
            } else if (3 == var3) {
               var5.bb();
            }

            return var5;
         }
      }
   }

   void aw(sg var1, int var2) {
      try {
         while(true) {
            int var3 = var1.cm((byte)7);
            if (var3 == 0) {
               if (var2 != 1877633819) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.ac(var1, var3, (byte)14);
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "ha.aw(" + ')');
      }
   }

   void aj(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (var2 == 0) {
            return;
         }

         this.ac(var1, var2, (byte)-36);
      }
   }

   void au(int var1) {
      try {
         if (1069382699 * this.bb == -1) {
            label47: {
               if (var1 >= 1573434537) {
                  throw new IllegalStateException();
               }

               if (null == this.as) {
                  if (var1 >= 1573434537) {
                     throw new IllegalStateException();
                  }

                  if (null == this.aj) {
                     this.bb = 0;
                     break label47;
                  }
               }

               this.bb = 1476838662;
            }
         }

         if (-1 == this.bi * 1957040329) {
            if (var1 >= 1573434537) {
               throw new IllegalStateException();
            }

            if (null == this.as && this.aj == null) {
               this.bi = 0;
            } else {
               this.bi = 270930674;
            }
         }

      } catch (RuntimeException var2) {
         throw db.an(var2, "ha.au(" + ')');
      }
   }

   public it ab(it var1, int var2, byte var3) {
      try {
         boolean var10001;
         it var5;
         if (!this.ao(596572848)) {
            var2 = this.ag[var2];
            io var7 = kb.ai(var2 >> 16, -1835195272);
            var2 &= 65535;
            if (null == var7) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  return var1.aa(true);
               }
            } else {
               if (!var7.an(var2, 997946133)) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               var5 = var1.aa(var10001);
               var5.ar(var7, var2);
               return var5;
            }
         } else {
            fh var4 = dx.av(this.ay * 1238147375, 2142933215);
            if (null == var4) {
               return var1.aa(true);
            } else {
               if (!var4.au(1713081171)) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               var5 = var1.aa(var10001);
               var5.am(var4, var2);
               return var5;
            }
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "ha.ab(" + ')');
      }
   }

   public it ay(it var1, int var2, byte var3) {
      try {
         if (!this.ao(204874306)) {
            int var4 = this.ag[var2];
            io var5 = kb.ai(var4 >> 16, 1690269747);
            var4 &= 65535;
            if (var5 == null) {
               if (var3 == 32) {
                  throw new IllegalStateException();
               } else {
                  return var1.aa(true);
               }
            } else {
               io var6 = null;
               int var7 = 0;
               if (this.ah != null) {
                  if (var3 == 32) {
                     throw new IllegalStateException();
                  }

                  if (var2 < this.ah.length) {
                     if (var3 == 32) {
                        throw new IllegalStateException();
                     }

                     var7 = this.ah[var2];
                     var6 = kb.ai(var7 >> 16, -442206339);
                     var7 &= 65535;
                  }
               }

               boolean var10001;
               it var8;
               if (null != var6) {
                  if (var3 == 32) {
                     throw new IllegalStateException();
                  }

                  if (65535 != var7) {
                     if (!var5.an(var4, -100012645)) {
                        if (var3 == 32) {
                           throw new IllegalStateException();
                        }

                        var10001 = true;
                     } else {
                        var10001 = false;
                     }

                     boolean var10002;
                     if (!var6.an(var7, 586226879)) {
                        if (var3 == 32) {
                           throw new IllegalStateException();
                        }

                        var10002 = true;
                     } else {
                        var10002 = false;
                     }

                     var8 = var1.aa(var10001 & var10002);
                     var8.ar(var5, var4);
                     var8.ar(var6, var7);
                     return var8;
                  }

                  if (var3 == 32) {
                     throw new IllegalStateException();
                  }
               }

               if (!var5.an(var4, 2041463438)) {
                  if (var3 == 32) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               var8 = var1.aa(var10001);
               var8.ar(var5, var4);
               return var8;
            }
         } else {
            return this.ab(var1, var2, (byte)-92);
         }
      } catch (RuntimeException var9) {
         throw db.an(var9, "ha.ay(" + ')');
      }
   }

   void az(sg var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.cl(-2005689592);
         this.av = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.av[var4] = var1.cl(-2119849596);
         }

         this.ag = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ag[var4] = var1.cl(-407632587);
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.ag[var4] += var1.cl(-265503048) << 16;
         }
      } else if (2 == var2) {
         this.am = var1.cl(-1164020838) * 332517881;
      } else if (var2 == 3) {
         var3 = var1.cm((byte)7);
         this.as = new int[1 + var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.as[var4] = var1.cm((byte)7);
         }

         this.as[var3] = 9999999;
      } else if (var2 == 4) {
         this.ak = true;
      } else if (5 == var2) {
         this.az = var1.cm((byte)7) * -1276641873;
      } else if (6 == var2) {
         this.ad = var1.cl(653480431) * 766640841;
      } else if (var2 == 7) {
         this.ae = var1.cl(-1610393165) * 960826081;
      } else if (var2 == 8) {
         this.ap = var1.cm((byte)7) * -413193849;
         this.by = true;
      } else if (var2 == 9) {
         this.bb = var1.cm((byte)7) * 738419331;
      } else if (10 == var2) {
         this.bi = var1.cm((byte)7) * -2012018311;
      } else if (var2 == 11) {
         this.be = var1.cm((byte)7) * 1672364297;
      } else if (var2 == 12) {
         var3 = var1.cm((byte)7);
         this.ah = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ah[var4] = var1.cl(-1983834909);
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.ah[var4] += var1.cl(311474766) << 16;
         }
      } else if (var2 == 13) {
         var3 = var1.cm((byte)7);
         this.ar = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ar[var4] = var1.cr(1231886138);
         }
      } else if (14 == var2) {
         this.ay = var1.cx(-2031478709) * 526927311;
      } else if (var2 == 15) {
         var3 = var1.cl(-512328198);
         this.ao = new HashMap();

         for(var4 = 0; var4 < var3; ++var4) {
            int var5 = var1.cl(165368038);
            int var6 = var1.cr(469334489);
            this.ao.put(var5, var6);
         }
      } else if (var2 == 16) {
         this.ax = var1.cl(-1733467221) * 732547785;
         this.ai = var1.cl(438891853) * -1631071449;
      } else if (var2 == 17) {
         this.aj = new boolean[256];

         for(var3 = 0; var3 < this.aj.length; ++var3) {
            this.aj[var3] = false;
         }

         var3 = var1.cm((byte)7);

         for(var4 = 0; var4 < var3; ++var4) {
            this.aj[var1.cm((byte)7)] = true;
         }
      }

   }

   public it bb(it var1, int var2) {
      it var4;
      if (!this.ao(-1769460313)) {
         var2 = this.ag[var2];
         io var5 = kb.ai(var2 >> 16, 1504818046);
         var2 &= 65535;
         if (null == var5) {
            return var1.aa(true);
         } else {
            var4 = var1.aa(!var5.an(var2, 746119541));
            var4.ar(var5, var2);
            return var4;
         }
      } else {
         fh var3 = dx.av(this.ay * 1938551039, 2146143073);
         if (null == var3) {
            return var1.aa(true);
         } else {
            var4 = var1.aa(!var3.au(1713081171));
            var4.am(var3, var2);
            return var4;
         }
      }
   }

   it aa(it var1, int var2, ha var3, int var4, byte var5) {
      try {
         var2 = this.ag[var2];
         io var6 = kb.ai(var2 >> 16, 1872736941);
         var2 &= 65535;
         if (null == var6) {
            if (var5 == 0) {
               throw new IllegalStateException();
            } else {
               return var3.ab(var1, var4, (byte)-117);
            }
         } else {
            var4 = var3.ag[var4];
            io var7 = kb.ai(var4 >> 16, -1564784352);
            var4 &= 65535;
            boolean var10001;
            it var8;
            if (null == var7) {
               if (var5 == 0) {
                  throw new IllegalStateException();
               } else {
                  if (!var6.an(var2, -1166769749)) {
                     if (var5 == 0) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  var8 = var1.aa(var10001);
                  var8.ar(var6, var2);
                  return var8;
               }
            } else {
               if (!var6.an(var2, -438067522)) {
                  if (var5 == 0) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               boolean var10002;
               if (!var7.an(var4, -1096423846)) {
                  if (var5 == 0) {
                     throw new IllegalStateException();
                  }

                  var10002 = true;
               } else {
                  var10002 = false;
               }

               var8 = var1.aa(var10001 & var10002);
               var8.ak(var6, var2, var7, var4, this.as);
               return var8;
            }
         }
      } catch (RuntimeException var9) {
         throw db.an(var9, "ha.aa(" + ')');
      }
   }

   it bd(it var1, int var2) {
      it var4;
      if (!this.ao(410525360)) {
         var2 = this.ag[var2];
         io var5 = kb.ai(var2 >> 16, 2045706329);
         var2 &= 2080267860;
         if (var5 == null) {
            return var1.ay(true);
         } else {
            var4 = var1.ay(!var5.an(var2, 1027822751));
            var4.ar(var5, var2);
            return var4;
         }
      } else {
         fh var3 = dx.av(-1039799324 * this.ay, 2142424491);
         if (var3 == null) {
            return var1.ay(true);
         } else {
            var4 = var1.ay(!var3.au(1713081171));
            var4.am(var3, var2);
            return var4;
         }
      }
   }

   public boolean ao(int var1) {
      try {
         boolean var10000;
         if (this.ay * 1238147375 >= 0) {
            if (var1 == 1671088558) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ha.ao(" + ')');
      }
   }

   public int ax(int var1) {
      try {
         return this.ai * 1833069719 - -968724615 * this.ax;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ha.ax(" + ')');
      }
   }

   static io bc(int var0) {
      io var1 = (io)at.af((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         var1 = dg.af(ab, aq, var0, false, 2130637515);
         if (var1 != null) {
            at.aw(var1, (long)var0);
         }

         return var1;
      }
   }

   public it bf(it var1, int var2) {
      if (!this.ao(-1665299305)) {
         int var3 = this.ag[var2];
         io var4 = kb.ai(var3 >> 16, -777595783);
         var3 &= 65535;
         if (var4 == null) {
            return var1.aa(true);
         } else {
            io var5 = null;
            int var6 = 0;
            if (this.ah != null && var2 < this.ah.length) {
               var6 = this.ah[var2];
               var5 = kb.ai(var6 >> 16, 729636040);
               var6 &= 65535;
            }

            it var7;
            if (null != var5 && 65535 != var6) {
               var7 = var1.aa(!var4.an(var3, 2115601263) & !var5.an(var6, -1862107189));
               var7.ar(var4, var3);
               var7.ar(var5, var6);
               return var7;
            } else {
               var7 = var1.aa(!var4.an(var3, 471545464));
               var7.ar(var4, var3);
               return var7;
            }
         }
      } else {
         return this.ab(var1, var2, (byte)-65);
      }
   }

   static fh cc(int var0) {
      if (aj.ag(var0, 854271946) != 0) {
         return null;
      } else {
         fh var2 = (fh)aa.af((long)var0);
         fh var1;
         if (null != var2) {
            var1 = var2;
         } else {
            var2 = iw.af(ab, aq, var0, false, 499342238);
            if (null != var2) {
               aa.aw(var2, (long)var0);
            }

            var1 = var2;
         }

         return var1;
      }
   }

   public static ha am(int var0) {
      ha var1 = (ha)al.af((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = au.bh(12, var0, (byte)-73);
         var1 = new ha();
         if (var2 != null) {
            var1.aw(new sg(var2), 1877633819);
         }

         var1.au(1213101672);
         al.aw(var1, (long)var0);
         return var1;
      }
   }

   public static ha as(int var0) {
      ha var1 = (ha)al.af((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = au.bh(12, var0, (byte)-106);
         var1 = new ha();
         if (var2 != null) {
            var1.aw(new sg(var2), 1877633819);
         }

         var1.au(-910530452);
         al.aw(var1, (long)var0);
         return var1;
      }
   }

   public static void ar(nm var0, nm var1, nm var2) {
      au = var0;
      ab = var1;
      aq = var2;
   }

   void ak(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (var2 == 0) {
            return;
         }

         this.ac(var1, var2, (byte)-23);
      }
   }

   void ad(sg var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.cl(72341591);
         this.av = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.av[var4] = var1.cl(-1079441722);
         }

         this.ag = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ag[var4] = var1.cl(344395547);
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.ag[var4] += var1.cl(398109585) << 16;
         }
      } else if (2 == var2) {
         this.am = var1.cl(-239999700) * 332517881;
      } else if (var2 == 3) {
         var3 = var1.cm((byte)7);
         this.as = new int[1 + var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.as[var4] = var1.cm((byte)7);
         }

         this.as[var3] = 9999999;
      } else if (var2 == 4) {
         this.ak = true;
      } else if (5 == var2) {
         this.az = var1.cm((byte)7) * -1276641873;
      } else if (6 == var2) {
         this.ad = var1.cl(231618444) * 766640841;
      } else if (var2 == 7) {
         this.ae = var1.cl(-2119724277) * 960826081;
      } else if (var2 == 8) {
         this.ap = var1.cm((byte)7) * -413193849;
         this.by = true;
      } else if (var2 == 9) {
         this.bb = var1.cm((byte)7) * 738419331;
      } else if (10 == var2) {
         this.bi = var1.cm((byte)7) * -2012018311;
      } else if (var2 == 11) {
         this.be = var1.cm((byte)7) * 1672364297;
      } else if (var2 == 12) {
         var3 = var1.cm((byte)7);
         this.ah = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ah[var4] = var1.cl(-275686545);
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.ah[var4] += var1.cl(405265290) << 16;
         }
      } else if (var2 == 13) {
         var3 = var1.cm((byte)7);
         this.ar = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ar[var4] = var1.cr(-348323935);
         }
      } else if (14 == var2) {
         this.ay = var1.cx(-1501006604) * 526927311;
      } else if (var2 == 15) {
         var3 = var1.cl(294375087);
         this.ao = new HashMap();

         for(var4 = 0; var4 < var3; ++var4) {
            int var5 = var1.cl(577572617);
            int var6 = var1.cr(679570374);
            this.ao.put(var5, var6);
         }
      } else if (var2 == 16) {
         this.ax = var1.cl(-1245828740) * 732547785;
         this.ai = var1.cl(-1444069536) * -1631071449;
      } else if (var2 == 17) {
         this.aj = new boolean[256];

         for(var3 = 0; var3 < this.aj.length; ++var3) {
            this.aj[var3] = false;
         }

         var3 = var1.cm((byte)7);

         for(var4 = 0; var4 < var3; ++var4) {
            this.aj[var1.cm((byte)7)] = true;
         }
      }

   }

   void ae() {
      if (1069382699 * this.bb == -1) {
         if (null == this.as && null == this.aj) {
            this.bb = 0;
         } else {
            this.bb = 1476838662;
         }
      }

      if (-1 == this.bi * 1957040329) {
         if (null == this.as && this.aj == null) {
            this.bi = 0;
         } else {
            this.bi = 270930674;
         }
      }

   }

   void ap() {
      if (1069382699 * this.bb == -1) {
         if (null == this.as && null == this.aj) {
            this.bb = 0;
         } else {
            this.bb = 1476838662;
         }
      }

      if (-1 == this.bi * 1957040329) {
         if (null == this.as && this.aj == null) {
            this.bi = 0;
         } else {
            this.bi = 270930674;
         }
      }

   }

   void by() {
      if (1069382699 * this.bb == -1) {
         if (null == this.as && null == this.aj) {
            this.bb = 0;
         } else {
            this.bb = 1476838662;
         }
      }

      if (-1 == this.bi * 1957040329) {
         if (null == this.as && this.aj == null) {
            this.bi = 0;
         } else {
            this.bi = 270930674;
         }
      }

   }

   ha() {
      try {
         super();
         this.ay = -526927311;
         this.ax = 0;
         this.ai = 0;
         this.am = -332517881;
         this.ak = false;
         this.az = -2088242069;
         this.ad = -766640841;
         this.ae = -960826081;
         this.ap = 2043481909;
         this.by = false;
         this.bb = -738419331;
         this.bi = 2012018311;
         this.be = -950238702;
      } catch (RuntimeException var1) {
         throw db.an(var1, "ha.<init>(" + ')');
      }
   }

   public it bi(it var1, int var2) {
      it var4;
      if (!this.ao(837526416)) {
         var2 = this.ag[var2];
         io var5 = kb.ai(var2 >> 16, 2020246419);
         var2 &= 65535;
         if (null == var5) {
            return var1.aa(true);
         } else {
            var4 = var1.aa(!var5.an(var2, 1409607745));
            var4.ar(var5, var2);
            return var4;
         }
      } else {
         fh var3 = dx.av(this.ay * -1716638417, 2145038401);
         if (null == var3) {
            return var1.aa(true);
         } else {
            var4 = var1.aa(!var3.au(1713081171));
            var4.am(var3, var2);
            return var4;
         }
      }
   }

   it be(it var1, int var2, int var3) {
      it var5;
      if (!this.ao(-2058472306)) {
         var2 = this.ag[var2];
         io var6 = kb.ai(var2 >> 16, 1299186926);
         var2 &= 65535;
         if (var6 == null) {
            return var1.aa(true);
         } else {
            var5 = var1.aa(!var6.an(var2, -728571592));
            var3 &= 3;
            if (var3 == 1) {
               var5.bb();
            } else if (var3 == 2) {
               var5.by();
            } else if (var3 == 3) {
               var5.ap();
            }

            var5.ar(var6, var2);
            if (var3 == 1) {
               var5.ap();
            } else if (var3 == 2) {
               var5.by();
            } else if (var3 == 3) {
               var5.bb();
            }

            return var5;
         }
      } else {
         fh var4 = dx.av(-1713418167 * this.ay, 2139594039);
         if (null == var4) {
            return var1.aa(true);
         } else {
            var5 = var1.aa(!var4.au(1713081171));
            var3 &= 3;
            if (var3 == 1) {
               var5.bb();
            } else if (var3 == 2) {
               var5.by();
            } else if (var3 == 3) {
               var5.ap();
            }

            var5.am(var4, var2);
            if (1 == var3) {
               var5.ap();
            } else if (var3 == 2) {
               var5.by();
            } else if (3 == var3) {
               var5.bb();
            }

            return var5;
         }
      }
   }

   static final void lc(int var0, int var1, int var2, boolean var3, int var4) {
      try {
         if (!bq.ac(var0, 1376777516)) {
            if (var4 == -726165376) {
               ;
            }
         } else {
            fp.ld(hn.ap[var0], -1, var1, var2, var3, 1809081725);
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "ha.lc(" + ')');
      }
   }

   it al(it var1, int var2, int var3) {
      try {
         boolean var10001;
         it var5;
         if (!this.ao(1701969380)) {
            if (var3 >= 197366738) {
               throw new IllegalStateException();
            } else {
               var2 = this.ag[var2];
               io var7 = kb.ai(var2 >> 16, 488275791);
               var2 &= 65535;
               if (var7 == null) {
                  return var1.ay(true);
               } else {
                  if (!var7.an(var2, -299026728)) {
                     if (var3 >= 197366738) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  var5 = var1.ay(var10001);
                  var5.ar(var7, var2);
                  return var5;
               }
            }
         } else {
            fh var4 = dx.av(1238147375 * this.ay, 2140657667);
            if (var4 == null) {
               if (var3 >= 197366738) {
                  throw new IllegalStateException();
               } else {
                  return var1.ay(true);
               }
            } else {
               if (!var4.au(1713081171)) {
                  if (var3 >= 197366738) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               var5 = var1.ay(var10001);
               var5.am(var4, var2);
               return var5;
            }
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "ha.al(" + ')');
      }
   }

   it bo(it var1, int var2, int var3) {
      it var5;
      if (!this.ao(364444547)) {
         var2 = this.ag[var2];
         io var6 = kb.ai(var2 >> 16, -344419564);
         var2 &= 65535;
         if (var6 == null) {
            return var1.aa(true);
         } else {
            var5 = var1.aa(!var6.an(var2, -673554604));
            var3 &= 3;
            if (var3 == 1) {
               var5.bb();
            } else if (var3 == 2) {
               var5.by();
            } else if (var3 == 3) {
               var5.ap();
            }

            var5.ar(var6, var2);
            if (var3 == 1) {
               var5.ap();
            } else if (var3 == 2) {
               var5.by();
            } else if (var3 == 3) {
               var5.bb();
            }

            return var5;
         }
      } else {
         fh var4 = dx.av(1238147375 * this.ay, 2147295099);
         if (null == var4) {
            return var1.aa(true);
         } else {
            var5 = var1.aa(!var4.au(1713081171));
            var3 &= 3;
            if (var3 == 1) {
               var5.bb();
            } else if (var3 == 2) {
               var5.by();
            } else if (var3 == 3) {
               var5.ap();
            }

            var5.am(var4, var2);
            if (1 == var3) {
               var5.ap();
            } else if (var3 == 2) {
               var5.by();
            } else if (3 == var3) {
               var5.bb();
            }

            return var5;
         }
      }
   }

   it bz(it var1, int var2) {
      it var4;
      if (!this.ao(-1983790722)) {
         var2 = this.ag[var2];
         io var5 = kb.ai(var2 >> 16, 467666539);
         var2 &= 65535;
         if (var5 == null) {
            return var1.ay(true);
         } else {
            var4 = var1.ay(!var5.an(var2, 479259882));
            var4.ar(var5, var2);
            return var4;
         }
      } else {
         fh var3 = dx.av(1238147375 * this.ay, 2143463858);
         if (var3 == null) {
            return var1.ay(true);
         } else {
            var4 = var1.ay(!var3.au(1713081171));
            var4.am(var3, var2);
            return var4;
         }
      }
   }

   it bm(it var1, int var2) {
      it var4;
      if (!this.ao(-2054757048)) {
         var2 = this.ag[var2];
         io var5 = kb.ai(var2 >> 16, 1674145031);
         var2 &= -42016816;
         if (var5 == null) {
            return var1.ay(true);
         } else {
            var4 = var1.ay(!var5.an(var2, 1049699721));
            var4.ar(var5, var2);
            return var4;
         }
      } else {
         fh var3 = dx.av(-1479963300 * this.ay, 2146620436);
         if (var3 == null) {
            return var1.ay(true);
         } else {
            var4 = var1.ay(!var3.au(1713081171));
            var4.am(var3, var2);
            return var4;
         }
      }
   }

   fh ah(byte var1) {
      try {
         if (this.ao(632753914)) {
            if (var1 == 6) {
               throw new IllegalStateException();
            } else {
               return dx.av(1238147375 * this.ay, 2146493961);
            }
         } else {
            return null;
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "ha.ah(" + ')');
      }
   }

   public it bt(it var1, int var2, ha var3, int var4) {
      if (af && !this.ao(-1592879083) && !var3.ao(262873433)) {
         return this.aa(var1, var2, var3, var4, (byte)-5);
      } else {
         it var5 = var1.aa(false);
         boolean var6 = false;
         io var7 = null;
         ik var8 = null;
         fh var9;
         if (this.ao(124166958)) {
            var9 = this.ah((byte)-28);
            if (null == var9) {
               return var5;
            }

            if (var3.ao(-1388167983) && this.aj == null) {
               var5.am(var9, var2);
               return var5;
            }

            var8 = var9.ac;
            var5.az(var8, var9, var2, this.aj, false, !var3.ao(884790103));
         } else {
            var2 = this.ag[var2];
            var7 = kb.ai(var2 >> 16, 119245666);
            var2 &= 65535;
            if (var7 == null) {
               return var3.ab(var1, var4, (byte)-8);
            }

            if (!var3.ao(-1191969098) && (this.as == null || -1 == var4)) {
               var5.ar(var7, var2);
               return var5;
            }

            if (this.as == null || var4 == -1) {
               var5.ar(var7, var2);
               return var5;
            }

            var6 = var3.ao(-1609077347);
            if (!var6) {
               var5.ad(var7, var2, this.as, false);
            }
         }

         if (var3.ao(-1831645635)) {
            var9 = var3.ah((byte)-85);
            if (var9 == null) {
               return var5;
            }

            if (var8 == null) {
               var8 = var9.ac;
            }

            var5.az(var8, var9, var4, this.aj, true, true);
         } else {
            var4 = var3.ag[var4];
            io var10 = kb.ai(var4 >> 16, -546109747);
            var4 &= 65535;
            if (var10 == null) {
               return this.ab(var1, var2, (byte)-25);
            }

            var5.ad(var10, var4, this.as, true);
         }

         if (var6 && var7 != null) {
            var5.ad(var7, var2, this.as, false);
         }

         var5.av();
         return var5;
      }
   }

   public it bj(it var1, int var2, ha var3, int var4) {
      if (af && !this.ao(901596972) && !var3.ao(-1494265733)) {
         return this.aa(var1, var2, var3, var4, (byte)-14);
      } else {
         it var5 = var1.aa(false);
         boolean var6 = false;
         io var7 = null;
         ik var8 = null;
         fh var9;
         if (this.ao(-524973539)) {
            var9 = this.ah((byte)14);
            if (null == var9) {
               return var5;
            }

            if (var3.ao(-563396159) && this.aj == null) {
               var5.am(var9, var2);
               return var5;
            }

            var8 = var9.ac;
            var5.az(var8, var9, var2, this.aj, false, !var3.ao(-1710426297));
         } else {
            var2 = this.ag[var2];
            var7 = kb.ai(var2 >> 16, -1115429048);
            var2 &= 1122887077;
            if (var7 == null) {
               return var3.ab(var1, var4, (byte)-27);
            }

            if (!var3.ao(-2055695392) && (this.as == null || -1 == var4)) {
               var5.ar(var7, var2);
               return var5;
            }

            if (this.as == null || var4 == -1) {
               var5.ar(var7, var2);
               return var5;
            }

            var6 = var3.ao(530281739);
            if (!var6) {
               var5.ad(var7, var2, this.as, false);
            }
         }

         if (var3.ao(-940400258)) {
            var9 = var3.ah((byte)-31);
            if (var9 == null) {
               return var5;
            }

            if (var8 == null) {
               var8 = var9.ac;
            }

            var5.az(var8, var9, var4, this.aj, true, true);
         } else {
            var4 = var3.ag[var4];
            io var10 = kb.ai(var4 >> 16, 1931447080);
            var4 &= 65535;
            if (var10 == null) {
               return this.ab(var1, var2, (byte)-57);
            }

            var5.ad(var10, var4, this.as, true);
         }

         if (var6 && var7 != null) {
            var5.ad(var7, var2, this.as, false);
         }

         var5.av();
         return var5;
      }
   }

   public it bn(it var1, int var2, ha var3, int var4) {
      if (af && !this.ao(-1562264791) && !var3.ao(-1056946583)) {
         return this.aa(var1, var2, var3, var4, (byte)20);
      } else {
         it var5 = var1.aa(false);
         boolean var6 = false;
         io var7 = null;
         ik var8 = null;
         fh var9;
         if (this.ao(-532419696)) {
            var9 = this.ah((byte)-30);
            if (null == var9) {
               return var5;
            }

            if (var3.ao(-636179230) && this.aj == null) {
               var5.am(var9, var2);
               return var5;
            }

            var8 = var9.ac;
            var5.az(var8, var9, var2, this.aj, false, !var3.ao(1549985832));
         } else {
            var2 = this.ag[var2];
            var7 = kb.ai(var2 >> 16, -6829684);
            var2 &= 65535;
            if (var7 == null) {
               return var3.ab(var1, var4, (byte)-27);
            }

            if (!var3.ao(-538075153) && (this.as == null || -1 == var4)) {
               var5.ar(var7, var2);
               return var5;
            }

            if (this.as == null || var4 == -1) {
               var5.ar(var7, var2);
               return var5;
            }

            var6 = var3.ao(228799911);
            if (!var6) {
               var5.ad(var7, var2, this.as, false);
            }
         }

         if (var3.ao(499298987)) {
            var9 = var3.ah((byte)-62);
            if (var9 == null) {
               return var5;
            }

            if (var8 == null) {
               var8 = var9.ac;
            }

            var5.az(var8, var9, var4, this.aj, true, true);
         } else {
            var4 = var3.ag[var4];
            io var10 = kb.ai(var4 >> 16, -884620793);
            var4 &= 65535;
            if (var10 == null) {
               return this.ab(var1, var2, (byte)-35);
            }

            var5.ad(var10, var4, this.as, true);
         }

         if (var6 && var7 != null) {
            var5.ad(var7, var2, this.as, false);
         }

         var5.av();
         return var5;
      }
   }

   it aq(it var1, int var2, int var3, int var4) {
      try {
         boolean var10001;
         it var6;
         if (!this.ao(-268939495)) {
            if (var4 != 16711935) {
               throw new IllegalStateException();
            } else {
               var2 = this.ag[var2];
               io var8 = kb.ai(var2 >> 16, -1087159182);
               var2 &= 65535;
               if (var8 == null) {
                  if (var4 != 16711935) {
                     throw new IllegalStateException();
                  } else {
                     return var1.aa(true);
                  }
               } else {
                  if (!var8.an(var2, 854896761)) {
                     if (var4 != 16711935) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  var6 = var1.aa(var10001);
                  var3 &= 3;
                  if (var3 == 1) {
                     if (var4 != 16711935) {
                        throw new IllegalStateException();
                     }

                     var6.bb();
                  } else if (var3 == 2) {
                     if (var4 != 16711935) {
                        throw new IllegalStateException();
                     }

                     var6.by();
                  } else if (var3 == 3) {
                     if (var4 != 16711935) {
                        throw new IllegalStateException();
                     }

                     var6.ap();
                  }

                  var6.ar(var8, var2);
                  if (var3 == 1) {
                     if (var4 != 16711935) {
                        throw new IllegalStateException();
                     }

                     var6.ap();
                  } else if (var3 == 2) {
                     if (var4 != 16711935) {
                        throw new IllegalStateException();
                     }

                     var6.by();
                  } else if (var3 == 3) {
                     if (var4 != 16711935) {
                        throw new IllegalStateException();
                     }

                     var6.bb();
                  }

                  return var6;
               }
            }
         } else {
            fh var5 = dx.av(1238147375 * this.ay, 2142207160);
            if (null == var5) {
               if (var4 != 16711935) {
                  throw new IllegalStateException();
               } else {
                  return var1.aa(true);
               }
            } else {
               if (!var5.au(1713081171)) {
                  if (var4 != 16711935) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               var6 = var1.aa(var10001);
               var3 &= 3;
               if (var3 == 1) {
                  var6.bb();
               } else if (var3 == 2) {
                  if (var4 != 16711935) {
                     throw new IllegalStateException();
                  }

                  var6.by();
               } else if (var3 == 3) {
                  if (var4 != 16711935) {
                     throw new IllegalStateException();
                  }

                  var6.ap();
               }

               var6.am(var5, var2);
               if (1 == var3) {
                  var6.ap();
               } else if (var3 == 2) {
                  var6.by();
               } else if (3 == var3) {
                  if (var4 != 16711935) {
                     throw new IllegalStateException();
                  }

                  var6.bb();
               }

               return var6;
            }
         }
      } catch (RuntimeException var7) {
         throw db.an(var7, "ha.aq(" + ')');
      }
   }

   it br(it var1, int var2, ha var3, int var4) {
      var2 = this.ag[var2];
      io var5 = kb.ai(var2 >> 16, 2082590192);
      var2 &= 65535;
      if (null == var5) {
         return var3.ab(var1, var4, (byte)-66);
      } else {
         var4 = var3.ag[var4];
         io var6 = kb.ai(var4 >> 16, 374640603);
         var4 &= 65535;
         it var7;
         if (null == var6) {
            var7 = var1.aa(!var5.an(var2, 2031442074));
            var7.ar(var5, var2);
            return var7;
         } else {
            var7 = var1.aa(!var5.an(var2, 602016305) & !var6.an(var4, -1266673739));
            var7.ak(var5, var2, var6, var4, this.as);
            return var7;
         }
      }
   }

   it bg(it var1, int var2, ha var3, int var4) {
      var2 = this.ag[var2];
      io var5 = kb.ai(var2 >> 16, 897655315);
      var2 &= 2057284896;
      if (null == var5) {
         return var3.ab(var1, var4, (byte)-35);
      } else {
         var4 = var3.ag[var4];
         io var6 = kb.ai(var4 >> 16, -2135765363);
         var4 &= 65535;
         it var7;
         if (null == var6) {
            var7 = var1.aa(!var5.an(var2, -1776560890));
            var7.ar(var5, var2);
            return var7;
         } else {
            var7 = var1.aa(!var5.an(var2, -42127960) & !var6.an(var4, -515402288));
            var7.ak(var5, var2, var6, var4, this.as);
            return var7;
         }
      }
   }

   public it bu(it var1, int var2) {
      if (!this.ao(1477262179)) {
         int var3 = this.ag[var2];
         io var4 = kb.ai(var3 >> 16, -446605764);
         var3 &= 65535;
         if (var4 == null) {
            return var1.aa(true);
         } else {
            io var5 = null;
            int var6 = 0;
            if (this.ah != null && var2 < this.ah.length) {
               var6 = this.ah[var2];
               var5 = kb.ai(var6 >> 16, 239406556);
               var6 &= -1728537238;
            }

            it var7;
            if (null != var5 && 1935750600 != var6) {
               var7 = var1.aa(!var4.an(var3, 740280949) & !var5.an(var6, 1269490695));
               var7.ar(var4, var3);
               var7.ar(var5, var6);
               return var7;
            } else {
               var7 = var1.aa(!var4.an(var3, 1271828267));
               var7.ar(var4, var3);
               return var7;
            }
         }
      } else {
         return this.ab(var1, var2, (byte)-60);
      }
   }

   public boolean bq() {
      return this.ay * 1238147375 >= 0;
   }

   void ac(sg var1, int var2, byte var3) {
      try {
         int var4;
         int var5;
         if (var2 == 1) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            var4 = var1.cl(-631314543);
            this.av = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               if (var3 == 0) {
                  return;
               }

               this.av[var5] = var1.cl(489385674);
            }

            this.ag = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               if (var3 == 0) {
                  throw new IllegalStateException();
               }

               this.ag[var5] = var1.cl(-1291848929);
            }

            for(var5 = 0; var5 < var4; ++var5) {
               if (var3 == 0) {
                  throw new IllegalStateException();
               }

               this.ag[var5] += var1.cl(-1957323533) << 16;
            }
         } else if (2 == var2) {
            this.am = var1.cl(662238305) * 332517881;
         } else if (var2 == 3) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            var4 = var1.cm((byte)7);
            this.as = new int[1 + var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.as[var5] = var1.cm((byte)7);
            }

            this.as[var4] = 9999999;
         } else if (var2 == 4) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            this.ak = true;
         } else if (5 == var2) {
            if (var3 == 0) {
               return;
            }

            this.az = var1.cm((byte)7) * -1276641873;
         } else if (6 == var2) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            this.ad = var1.cl(-46134641) * 766640841;
         } else if (var2 == 7) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            this.ae = var1.cl(-862954667) * 960826081;
         } else if (var2 == 8) {
            this.ap = var1.cm((byte)7) * -413193849;
            this.by = true;
         } else if (var2 == 9) {
            this.bb = var1.cm((byte)7) * 738419331;
         } else if (10 == var2) {
            if (var3 == 0) {
               return;
            }

            this.bi = var1.cm((byte)7) * -2012018311;
         } else if (var2 == 11) {
            if (var3 == 0) {
               return;
            }

            this.be = var1.cm((byte)7) * 1672364297;
         } else if (var2 == 12) {
            var4 = var1.cm((byte)7);
            this.ah = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               if (var3 == 0) {
                  throw new IllegalStateException();
               }

               this.ah[var5] = var1.cl(-386308957);
            }

            for(var5 = 0; var5 < var4; ++var5) {
               if (var3 == 0) {
                  throw new IllegalStateException();
               }

               this.ah[var5] += var1.cl(-888735824) << 16;
            }
         } else if (var2 == 13) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            var4 = var1.cm((byte)7);
            this.ar = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               if (var3 == 0) {
                  throw new IllegalStateException();
               }

               this.ar[var5] = var1.cr(177949144);
            }
         } else if (14 == var2) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            this.ay = var1.cx(-2020709198) * 526927311;
         } else if (var2 == 15) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            var4 = var1.cl(-461600300);
            this.ao = new HashMap();

            for(var5 = 0; var5 < var4; ++var5) {
               if (var3 == 0) {
                  throw new IllegalStateException();
               }

               int var6 = var1.cl(-417931195);
               int var7 = var1.cr(-1649990669);
               this.ao.put(var6, var7);
            }
         } else if (var2 == 16) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            this.ax = var1.cl(-165174990) * 732547785;
            this.ai = var1.cl(-225973117) * -1631071449;
         } else if (var2 == 17) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            this.aj = new boolean[256];

            for(var4 = 0; var4 < this.aj.length; ++var4) {
               if (var3 == 0) {
                  return;
               }

               this.aj[var4] = false;
            }

            var4 = var1.cm((byte)7);

            for(var5 = 0; var5 < var4; ++var5) {
               if (var3 == 0) {
                  return;
               }

               this.aj[var1.cm((byte)7)] = true;
            }
         }

      } catch (RuntimeException var8) {
         throw db.an(var8, "ha.ac(" + ')');
      }
   }

   public int ba() {
      return this.ai * 1833069719 - -968724615 * this.ax;
   }

   public int bv() {
      return this.ai * 1833069719 - -968724615 * this.ax;
   }

   public int bl() {
      return this.ai * 1833069719 - -968724615 * this.ax;
   }

   static io bp(int var0) {
      io var1 = (io)at.af((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         var1 = dg.af(ab, aq, var0, false, 1984517350);
         if (var1 != null) {
            at.aw(var1, (long)var0);
         }

         return var1;
      }
   }

   public static int ce(int var0) {
      fh var2 = (fh)aa.af((long)var0);
      fh var1;
      if (var2 != null) {
         var1 = var2;
      } else {
         var2 = iw.af(ab, aq, var0, false, 324760637);
         if (null != var2) {
            aa.aw(var2, (long)var0);
         }

         var1 = var2;
      }

      if (null == var1) {
         return 2;
      } else {
         return var1.aw(-63286081) ? 0 : 1;
      }
   }

   static io bh(int var0) {
      io var1 = (io)at.af((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         var1 = dg.af(ab, aq, var0, false, -923005348);
         if (var1 != null) {
            at.aw(var1, (long)var0);
         }

         return var1;
      }
   }

   static io bw(int var0) {
      io var1 = (io)at.af((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         var1 = dg.af(ab, aq, var0, false, -894572511);
         if (var1 != null) {
            at.aw(var1, (long)var0);
         }

         return var1;
      }
   }

   it bs(it var1, int var2, ha var3, int var4) {
      var2 = this.ag[var2];
      io var5 = kb.ai(var2 >> 16, 1377956105);
      var2 &= 65535;
      if (null == var5) {
         return var3.ab(var1, var4, (byte)-12);
      } else {
         var4 = var3.ag[var4];
         io var6 = kb.ai(var4 >> 16, 1554020886);
         var4 &= 65535;
         it var7;
         if (null == var6) {
            var7 = var1.aa(!var5.an(var2, -48137992));
            var7.ar(var5, var2);
            return var7;
         } else {
            var7 = var1.aa(!var5.an(var2, -172501145) & !var6.an(var4, 1028361526));
            var7.ak(var5, var2, var6, var4, this.as);
            return var7;
         }
      }
   }

   fh ci() {
      return this.ao(-1499484133) ? dx.av(1420017749 * this.ay, 2147021207) : null;
   }

   static fh cs(int var0) {
      if (aj.ag(var0, 854271946) != 0) {
         return null;
      } else {
         fh var2 = (fh)aa.af((long)var0);
         fh var1;
         if (null != var2) {
            var1 = var2;
         } else {
            var2 = iw.af(ab, aq, var0, false, 197987423);
            if (null != var2) {
               aa.aw(var2, (long)var0);
            }

            var1 = var2;
         }

         return var1;
      }
   }

   it bk(it var1, int var2, int var3) {
      it var5;
      if (!this.ao(-964207824)) {
         var2 = this.ag[var2];
         io var6 = kb.ai(var2 >> 16, 836891344);
         var2 &= 65535;
         if (var6 == null) {
            return var1.aa(true);
         } else {
            var5 = var1.aa(!var6.an(var2, 191728469));
            var3 &= 3;
            if (var3 == 1) {
               var5.bb();
            } else if (var3 == 2) {
               var5.by();
            } else if (var3 == 3) {
               var5.ap();
            }

            var5.ar(var6, var2);
            if (var3 == 1) {
               var5.ap();
            } else if (var3 == 2) {
               var5.by();
            } else if (var3 == 3) {
               var5.bb();
            }

            return var5;
         }
      } else {
         fh var4 = dx.av(1238147375 * this.ay, 2140160120);
         if (null == var4) {
            return var1.aa(true);
         } else {
            var5 = var1.aa(!var4.au(1713081171));
            var3 &= 3;
            if (var3 == 1) {
               var5.bb();
            } else if (var3 == 2) {
               var5.by();
            } else if (var3 == 3) {
               var5.ap();
            }

            var5.am(var4, var2);
            if (1 == var3) {
               var5.ap();
            } else if (var3 == 2) {
               var5.by();
            } else if (3 == var3) {
               var5.bb();
            }

            return var5;
         }
      }
   }

   public it at(it var1, int var2, ha var3, int var4, int var5) {
      try {
         if (af) {
            if (var5 <= 1422738245) {
               throw new IllegalStateException();
            }

            if (!this.ao(528780304)) {
               if (var5 <= 1422738245) {
                  throw new IllegalStateException();
               }

               if (!var3.ao(-1553118563)) {
                  if (var5 <= 1422738245) {
                     throw new IllegalStateException();
                  }

                  return this.aa(var1, var2, var3, var4, (byte)52);
               }
            }
         }

         it var6;
         io var8;
         label170: {
            var6 = var1.aa(false);
            boolean var7 = false;
            var8 = null;
            ik var9 = null;
            fh var10;
            if (this.ao(-298382613)) {
               if (var5 <= 1422738245) {
                  throw new IllegalStateException();
               }

               var10 = this.ah((byte)4);
               if (null == var10) {
                  if (var5 <= 1422738245) {
                     throw new IllegalStateException();
                  }

                  return var6;
               }

               if (var3.ao(-1499964341)) {
                  if (var5 <= 1422738245) {
                     throw new IllegalStateException();
                  }

                  if (this.aj == null) {
                     if (var5 <= 1422738245) {
                        throw new IllegalStateException();
                     }

                     var6.am(var10, var2);
                     return var6;
                  }
               }

               var9 = var10.ac;
               boolean[] var10004 = this.aj;
               boolean var10006;
               if (!var3.ao(-1447966042)) {
                  if (var5 <= 1422738245) {
                     throw new IllegalStateException();
                  }

                  var10006 = true;
               } else {
                  var10006 = false;
               }

               var6.az(var9, var10, var2, var10004, false, var10006);
            } else {
               var2 = this.ag[var2];
               var8 = kb.ai(var2 >> 16, 746118634);
               var2 &= 65535;
               if (var8 == null) {
                  if (var5 <= 1422738245) {
                     throw new IllegalStateException();
                  }

                  return var3.ab(var1, var4, (byte)-111);
               }

               if (!var3.ao(-1590123636)) {
                  label160: {
                     if (this.as != null) {
                        if (var5 <= 1422738245) {
                           throw new IllegalStateException();
                        }

                        if (-1 != var4) {
                           break label160;
                        }

                        if (var5 <= 1422738245) {
                           throw new IllegalStateException();
                        }
                     }

                     var6.ar(var8, var2);
                     return var6;
                  }
               }

               if (this.as == null) {
                  break label170;
               }

               if (var5 <= 1422738245) {
                  throw new IllegalStateException();
               }

               if (var4 == -1) {
                  if (var5 <= 1422738245) {
                     throw new IllegalStateException();
                  }
                  break label170;
               }

               var7 = var3.ao(602151857);
               if (!var7) {
                  var6.ad(var8, var2, this.as, false);
               }
            }

            if (var3.ao(-564622343)) {
               if (var5 <= 1422738245) {
                  throw new IllegalStateException();
               }

               var10 = var3.ah((byte)-53);
               if (var10 == null) {
                  if (var5 <= 1422738245) {
                     throw new IllegalStateException();
                  }

                  return var6;
               }

               if (var9 == null) {
                  var9 = var10.ac;
               }

               var6.az(var9, var10, var4, this.aj, true, true);
            } else {
               var4 = var3.ag[var4];
               io var12 = kb.ai(var4 >> 16, 1727483448);
               var4 &= 65535;
               if (var12 == null) {
                  if (var5 <= 1422738245) {
                     throw new IllegalStateException();
                  }

                  return this.ab(var1, var2, (byte)-33);
               }

               var6.ad(var12, var4, this.as, true);
            }

            if (var7) {
               if (var5 <= 1422738245) {
                  throw new IllegalStateException();
               }

               if (var8 != null) {
                  var6.ad(var8, var2, this.as, false);
               }
            }

            var6.av();
            return var6;
         }

         var6.ar(var8, var2);
         return var6;
      } catch (RuntimeException var11) {
         throw db.an(var11, "ha.at(" + ')');
      }
   }

   static int bs(byte[] var0, int var1, int var2, int var3) {
      try {
         int var4 = -1;

         for(int var5 = var1; var5 < var2; ++var5) {
            if (var3 == -290584708) {
               throw new IllegalStateException();
            }

            var4 = var4 >>> 8 ^ sg.aa[(var4 ^ var0[var5]) & 255];
         }

         var4 = ~var4;
         return var4;
      } catch (RuntimeException var6) {
         throw db.an(var6, "ha.bs(" + ')');
      }
   }
}
