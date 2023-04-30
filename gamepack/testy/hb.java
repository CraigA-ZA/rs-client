import accessors.RSHitmarkType;

public class hb extends rk implements RSHitmarkType {
   public int am;
   public static nm an;
   public static nm aw;
   static kh ac = new kh(64);
   static kh au = new kh(64);
   static kh ab = new kh(20);
   public static final int al = 0;
   public static nm af;
   static final int be = 3;
   int ao;
   public int ax;
   public static final int at = 1;
   public int ai;
   int ah;
   int av;
   int ar;
   static final int aa = 16777215;
   public int as;
   int by;
   public int az;
   String ak;
   public int ad;
   public int[] ae;
   int ap;
   public int aj;
   int ag;

   public tq al(int var1) {
      try {
         if (1100815213 * this.av < 0) {
            if (var1 <= 1473950221) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            tq var2 = (tq)au.af((long)(this.av * 1100815213));
            if (null != var2) {
               if (var1 <= 1473950221) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               var2 = sc.aw(an, 1100815213 * this.av, 0, -1094014063);
               if (var2 != null) {
                  if (var1 <= 1473950221) {
                     throw new IllegalStateException();
                  }

                  au.aw(var2, (long)(1100815213 * this.av));
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "hb.al(" + ')');
      }
   }

   void an(sg var1, int var2) {
      try {
         while(true) {
            int var3 = var1.cm((byte)7);
            if (var3 == 0) {
               if (var2 <= 868016454) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.aw(var1, var3, (byte)1);
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "hb.an(" + ')');
      }
   }

   void aw(sg var1, int var2, byte var3) {
      try {
         if (var2 == 1) {
            if (var3 != 1) {
               throw new IllegalStateException();
            }

            this.ao = var1.do(1454910852) * 1427566695;
         } else if (2 == var2) {
            if (var3 != 1) {
               return;
            }

            this.ax = var1.cr(-992963164) * -407348977;
         } else if (var2 == 3) {
            this.ag = var1.do(258654860) * 1067276637;
         } else if (var2 == 4) {
            this.av = var1.do(432348780) * -42326427;
         } else if (5 == var2) {
            if (var3 != 1) {
               throw new IllegalStateException();
            }

            this.ah = var1.do(1582479651) * 1113583925;
         } else if (var2 == 6) {
            if (var3 != 1) {
               return;
            }

            this.ar = var1.do(1746407775) * -1203704241;
         } else if (var2 == 7) {
            this.am = var1.cg((byte)-91) * -924786991;
         } else if (8 == var2) {
            this.ak = var1.cj((short)-27035);
         } else if (var2 == 9) {
            this.ai = var1.cl(-735890334) * -877673633;
         } else if (10 == var2) {
            if (var3 != 1) {
               throw new IllegalStateException();
            }

            this.as = var1.cg((byte)-37) * -1866102945;
         } else if (11 == var2) {
            if (var3 != 1) {
               throw new IllegalStateException();
            }

            this.aj = 0;
         } else if (12 == var2) {
            this.az = var1.cm((byte)7) * 720956497;
         } else if (13 == var2) {
            if (var3 != 1) {
               throw new IllegalStateException();
            }

            this.ad = var1.cg((byte)-13) * 219094333;
         } else if (var2 == 14) {
            if (var3 != 1) {
               return;
            }

            this.aj = var1.cl(-2039023905) * -481029747;
         } else {
            if (var2 != 17) {
               if (var3 != 1) {
                  throw new IllegalStateException();
               }

               if (var2 != 18) {
                  return;
               }
            }

            this.ap = var1.cl(-1558626191) * 753468781;
            if (1173802085 * this.ap == 65535) {
               if (var3 != 1) {
                  throw new IllegalStateException();
               }

               this.ap = -753468781;
            }

            this.by = var1.cl(-1683724219) * -663321583;
            if (this.by * -1580274447 == 65535) {
               this.by = 663321583;
            }

            int var4 = -1;
            if (var2 == 18) {
               if (var3 != 1) {
                  throw new IllegalStateException();
               }

               var4 = var1.cl(-1252871079);
               if (65535 == var4) {
                  var4 = -1;
               }
            }

            int var5 = var1.cm((byte)7);
            this.ae = new int[var5 + 2];

            for(int var6 = 0; var6 <= var5; ++var6) {
               if (var3 != 1) {
                  throw new IllegalStateException();
               }

               this.ae[var6] = var1.cl(-1274792633);
               if (65535 == this.ae[var6]) {
                  if (var3 != 1) {
                     return;
                  }

                  this.ae[var6] = -1;
               }
            }

            this.ae[var5 + 1] = var4;
         }

      } catch (RuntimeException var7) {
         throw db.an(var7, "hb.aw(" + ')');
      }
   }

   void ai(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (var2 == 0) {
            return;
         }

         this.aw(var1, var2, (byte)1);
      }
   }

   public String au(int var1, int var2) {
      try {
         String var3 = this.ak;

         while(true) {
            int var4 = var3.indexOf("%1");
            if (var4 < 0) {
               if (var2 >= -182047433) {
                  throw new IllegalStateException();
               } else {
                  return var3;
               }
            }

            var3 = var3.substring(0, var4) + hj.ab(var1, false, (byte)16) + var3.substring(var4 + 2);
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "hb.au(" + ')');
      }
   }

   public tq ab(int var1) {
      try {
         if (728089333 * this.ag < 0) {
            if (var1 >= 2116163662) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            tq var2 = (tq)au.af((long)(728089333 * this.ag));
            if (var2 != null) {
               if (var1 >= 2116163662) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               var2 = sc.aw(an, 728089333 * this.ag, 0, 710007229);
               if (null != var2) {
                  if (var1 >= 2116163662) {
                     throw new IllegalStateException();
                  }

                  au.aw(var2, (long)(728089333 * this.ag));
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "hb.ab(" + ')');
      }
   }

   public tq aq(int var1) {
      try {
         if (-466249443 * this.ah < 0) {
            if (var1 >= 218740551) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            tq var2 = (tq)au.af((long)(this.ah * -466249443));
            if (var2 != null) {
               if (var1 >= 218740551) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               var2 = sc.aw(an, this.ah * -466249443, 0, 20819222);
               if (var2 != null) {
                  if (var1 >= 218740551) {
                     throw new IllegalStateException();
                  }

                  au.aw(var2, (long)(this.ah * -466249443));
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "hb.aq(" + ')');
      }
   }

   void am(sg var1, int var2) {
      if (var2 == 1) {
         this.ao = var1.do(843054154) * 1427566695;
      } else if (2 == var2) {
         this.ax = var1.cr(-1664778981) * -407348977;
      } else if (var2 == 3) {
         this.ag = var1.do(1369801299) * 1067276637;
      } else if (var2 == 4) {
         this.av = var1.do(1264228852) * -42326427;
      } else if (5 == var2) {
         this.ah = var1.do(1504753669) * 1113583925;
      } else if (var2 == 6) {
         this.ar = var1.do(1903172003) * -1203704241;
      } else if (var2 == 7) {
         this.am = var1.cg((byte)-122) * -924786991;
      } else if (8 == var2) {
         this.ak = var1.cj((short)-32086);
      } else if (var2 == 9) {
         this.ai = var1.cl(-629265713) * -877673633;
      } else if (10 == var2) {
         this.as = var1.cg((byte)-26) * -1866102945;
      } else if (11 == var2) {
         this.aj = 0;
      } else if (12 == var2) {
         this.az = var1.cm((byte)7) * 720956497;
      } else if (13 == var2) {
         this.ad = var1.cg((byte)-25) * 219094333;
      } else if (var2 == 14) {
         this.aj = var1.cl(-325102921) * -481029747;
      } else if (var2 == 17 || var2 == 18) {
         this.ap = var1.cl(113359226) * 753468781;
         if (1173802085 * this.ap == 65535) {
            this.ap = -753468781;
         }

         this.by = var1.cl(807365714) * -663321583;
         if (this.by * -1580274447 == 65535) {
            this.by = 663321583;
         }

         int var3 = -1;
         if (var2 == 18) {
            var3 = var1.cl(-1573849689);
            if (65535 == var3) {
               var3 = -1;
            }
         }

         int var4 = var1.cm((byte)7);
         this.ae = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.ae[var5] = var1.cl(272972147);
            if (65535 == this.ae[var5]) {
               this.ae[var5] = -1;
            }
         }

         this.ae[var4 + 1] = var3;
      }

   }

   public tq at(byte var1) {
      try {
         if (170092719 * this.ar < 0) {
            return null;
         } else {
            tq var2 = (tq)au.af((long)(this.ar * 170092719));
            if (var2 != null) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               var2 = sc.aw(an, this.ar * 170092719, 0, 1839029471);
               if (var2 != null) {
                  if (var1 <= 1) {
                     throw new IllegalStateException();
                  }

                  au.aw(var2, (long)(170092719 * this.ar));
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "hb.at(" + ')');
      }
   }

   void ar(sg var1, int var2) {
      if (var2 == 1) {
         this.ao = var1.do(1145753063) * 1427566695;
      } else if (2 == var2) {
         this.ax = var1.cr(1878523891) * -407348977;
      } else if (var2 == 3) {
         this.ag = var1.do(1218903553) * 1067276637;
      } else if (var2 == 4) {
         this.av = var1.do(1003018522) * -42326427;
      } else if (5 == var2) {
         this.ah = var1.do(896438137) * 1113583925;
      } else if (var2 == 6) {
         this.ar = var1.do(1408434027) * -1203704241;
      } else if (var2 == 7) {
         this.am = var1.cg((byte)-28) * -924786991;
      } else if (8 == var2) {
         this.ak = var1.cj((short)-12474);
      } else if (var2 == 9) {
         this.ai = var1.cl(-873155858) * -877673633;
      } else if (10 == var2) {
         this.as = var1.cg((byte)-15) * -1866102945;
      } else if (11 == var2) {
         this.aj = 0;
      } else if (12 == var2) {
         this.az = var1.cm((byte)7) * 720956497;
      } else if (13 == var2) {
         this.ad = var1.cg((byte)-121) * 219094333;
      } else if (var2 == 14) {
         this.aj = var1.cl(-1635136271) * -481029747;
      } else if (var2 == 17 || var2 == 18) {
         this.ap = var1.cl(-693304215) * 753468781;
         if (1173802085 * this.ap == 65535) {
            this.ap = -753468781;
         }

         this.by = var1.cl(-1539544052) * -663321583;
         if (this.by * -1580274447 == 65535) {
            this.by = 663321583;
         }

         int var3 = -1;
         if (var2 == 18) {
            var3 = var1.cl(-889484258);
            if (65535 == var3) {
               var3 = -1;
            }
         }

         int var4 = var1.cm((byte)7);
         this.ae = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.ae[var5] = var1.cl(-155645341);
            if (65535 == this.ae[var5]) {
               this.ae[var5] = -1;
            }
         }

         this.ae[var4 + 1] = var3;
      }

   }

   public final hb ac(byte var1) {
      try {
         int var2 = -1;
         if (-1 != 1173802085 * this.ap) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            }

            var2 = jy.af(this.ap * 1173802085, 1419921071);
         } else if (-1 != this.by * -1580274447) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            }

            var2 = le.aw[-1580274447 * this.by];
         }

         int var3;
         if (var2 >= 0 && var2 < this.ae.length - 1) {
            var3 = this.ae[var2];
         } else {
            var3 = this.ae[this.ae.length - 1];
         }

         if (var3 != -1) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            } else {
               return ew.af(var3, (byte)4);
            }
         } else {
            return null;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "hb.ac(" + ')');
      }
   }

   public static hb ao(int var0) {
      hb var1 = (hb)ac.af((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = af.bh(1623310074, var0, (byte)-122);
         var1 = new hb();
         if (var2 != null) {
            var1.an(new sg(var2), 1336661418);
         }

         ac.aw(var1, (long)var0);
         return var1;
      }
   }

   public static hb ax(int var0) {
      hb var1 = (hb)ac.af((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = af.bh(32, var0, (byte)-97);
         var1 = new hb();
         if (var2 != null) {
            var1.an(new sg(var2), 1772810325);
         }

         ac.aw(var1, (long)var0);
         return var1;
      }
   }

   public final hb aj() {
      int var1 = -1;
      if (-1 != 1173802085 * this.ap) {
         var1 = jy.af(this.ap * 1173802085, 2024022414);
      } else if (-1 != this.by * -1580274447) {
         var1 = le.aw[-668715763 * this.by];
      }

      int var2;
      if (var1 >= 0 && var1 < this.ae.length - 1) {
         var2 = this.ae[var1];
      } else {
         var2 = this.ae[this.ae.length - 1];
      }

      return var2 != -1 ? ew.af(var2, (byte)4) : null;
   }

   void ag(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (var2 == 0) {
            return;
         }

         this.aw(var1, var2, (byte)1);
      }
   }

   void ah(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (var2 == 0) {
            return;
         }

         this.aw(var1, var2, (byte)1);
      }
   }

   void av(sg var1, int var2) {
      if (var2 == 1) {
         this.ao = var1.do(1077219081) * 1427566695;
      } else if (2 == var2) {
         this.ax = var1.cr(86142979) * -407348977;
      } else if (var2 == 3) {
         this.ag = var1.do(61958093) * 1067276637;
      } else if (var2 == 4) {
         this.av = var1.do(1299544638) * -42326427;
      } else if (5 == var2) {
         this.ah = var1.do(179784434) * 1113583925;
      } else if (var2 == 6) {
         this.ar = var1.do(1511800667) * -1203704241;
      } else if (var2 == 7) {
         this.am = var1.cg((byte)-96) * -924786991;
      } else if (8 == var2) {
         this.ak = var1.cj((short)-30151);
      } else if (var2 == 9) {
         this.ai = var1.cl(-11045990) * -877673633;
      } else if (10 == var2) {
         this.as = var1.cg((byte)-123) * -1866102945;
      } else if (11 == var2) {
         this.aj = 0;
      } else if (12 == var2) {
         this.az = var1.cm((byte)7) * 720956497;
      } else if (13 == var2) {
         this.ad = var1.cg((byte)-45) * 219094333;
      } else if (var2 == 14) {
         this.aj = var1.cl(816041590) * -481029747;
      } else if (var2 == 17 || var2 == 18) {
         this.ap = var1.cl(-1023039428) * 753468781;
         if (1173802085 * this.ap == 65535) {
            this.ap = -753468781;
         }

         this.by = var1.cl(-282032028) * -663321583;
         if (this.by * -1580274447 == 65535) {
            this.by = 663321583;
         }

         int var3 = -1;
         if (var2 == 18) {
            var3 = var1.cl(-294954317);
            if (65535 == var3) {
               var3 = -1;
            }
         }

         int var4 = var1.cm((byte)7);
         this.ae = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.ae[var5] = var1.cl(-1499577);
            if (65535 == this.ae[var5]) {
               this.ae[var5] = -1;
            }
         }

         this.ae[var4 + 1] = var3;
      }

   }

   public tq bi() {
      if (-153839723 * this.ah < 0) {
         return null;
      } else {
         tq var1 = (tq)au.af((long)(this.ah * 609190515));
         if (var1 != null) {
            return var1;
         } else {
            var1 = sc.aw(an, this.ah * 677464414, 0, -575780438);
            if (var1 != null) {
               au.aw(var1, (long)(this.ah * -612187434));
            }

            return var1;
         }
      }
   }

   public on bm() {
      if (-1 == 1857366871 * this.ao) {
         return null;
      } else {
         on var1 = (on)ab.af((long)(-644588611 * this.ao));
         if (var1 != null) {
            return var1;
         } else {
            nm var3 = an;
            nm var4 = aw;
            int var5 = 1857366871 * this.ao;
            byte[] var7 = var3.bh(var5, 0, (byte)-60);
            boolean var6;
            if (null == var7) {
               var6 = false;
            } else {
               sb.aa(var7, 1145263442);
               var6 = true;
            }

            on var2;
            if (!var6) {
               var2 = null;
            } else {
               byte[] var8 = var4.bh(var5, 0, (byte)-105);
               on var10;
               if (var8 == null) {
                  var10 = null;
               } else {
                  on var9 = new on(var8, tx.ac, ar.au, dd.ab, fd.aq, pc.al, hg.at);
                  pk.ay(-262861184);
                  var10 = var9;
               }

               var2 = var10;
            }

            if (null != var2) {
               ab.aw(var2, (long)(-898121873 * this.ao));
            }

            return var2;
         }
      }
   }

   public final hb as() {
      int var1 = -1;
      if (-1 != 1173802085 * this.ap) {
         var1 = jy.af(this.ap * 1173802085, 2061546777);
      } else if (-1 != this.by * -2143251457) {
         var1 = le.aw[-1580274447 * this.by];
      }

      int var2;
      if (var1 >= 0 && var1 < this.ae.length - 1) {
         var2 = this.ae[var1];
      } else {
         var2 = this.ae[this.ae.length - 1];
      }

      return var2 != -1 ? ew.af(var2, (byte)4) : null;
   }

   public on aa(int var1) {
      try {
         if (-1 == 1857366871 * this.ao) {
            if (var1 != 1644925127) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            on var2 = (on)ab.af((long)(1857366871 * this.ao));
            if (var2 != null) {
               if (var1 != 1644925127) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               nm var4 = an;
               nm var5 = aw;
               int var6 = 1857366871 * this.ao;
               byte[] var8 = var4.bh(var6, 0, (byte)-126);
               boolean var7;
               if (null == var8) {
                  if (var1 != 1644925127) {
                     throw new IllegalStateException();
                  }

                  var7 = false;
               } else {
                  sb.aa(var8, 1145263442);
                  var7 = true;
               }

               on var3;
               if (!var7) {
                  if (var1 != 1644925127) {
                     throw new IllegalStateException();
                  }

                  var3 = null;
               } else {
                  byte[] var9 = var5.bh(var6, 0, (byte)-11);
                  on var12;
                  if (var9 == null) {
                     if (var1 != 1644925127) {
                        throw new IllegalStateException();
                     }

                     var12 = null;
                  } else {
                     on var10 = new on(var9, tx.ac, ar.au, dd.ab, fd.aq, pc.al, hg.at);
                     pk.ay(-262861184);
                     var12 = var10;
                  }

                  var3 = var12;
               }

               if (null != var3) {
                  if (var1 != 1644925127) {
                     throw new IllegalStateException();
                  }

                  ab.aw(var3, (long)(1857366871 * this.ao));
               }

               return var3;
            }
         }
      } catch (RuntimeException var11) {
         throw db.an(var11, "hb.aa(" + ')');
      }
   }

   public final hb az() {
      int var1 = -1;
      if (-1 != -1531757343 * this.ap) {
         var1 = jy.af(this.ap * 1173802085, 2080171463);
      } else if (-1 != this.by * -1580274447) {
         var1 = le.aw[617756669 * this.by];
      }

      int var2;
      if (var1 >= 0 && var1 < this.ae.length - 1) {
         var2 = this.ae[var1];
      } else {
         var2 = this.ae[this.ae.length - 1];
      }

      return var2 != -1 ? ew.af(var2, (byte)4) : null;
   }

   public String ad(int var1) {
      String var2 = this.ak;

      while(true) {
         int var3 = var2.indexOf("%1");
         if (var3 < 0) {
            return var2;
         }

         var2 = var2.substring(0, var3) + hj.ab(var1, false, (byte)16) + var2.substring(var3 + 2);
      }
   }

   public String ae(int var1) {
      String var2 = this.ak;

      while(true) {
         int var3 = var2.indexOf("%1");
         if (var3 < 0) {
            return var2;
         }

         var2 = var2.substring(0, var3) + hj.ab(var1, false, (byte)16) + var2.substring(var3 + 2);
      }
   }

   public String ap(int var1) {
      String var2 = this.ak;

      while(true) {
         int var3 = var2.indexOf("%1");
         if (var3 < 0) {
            return var2;
         }

         var2 = var2.substring(0, var3) + hj.ab(var1, false, (byte)16) + var2.substring(var3 + 2);
      }
   }

   public tq by() {
      if (737275718 * this.ag < 0) {
         return null;
      } else {
         tq var1 = (tq)au.af((long)(2075649144 * this.ag));
         if (var1 != null) {
            return var1;
         } else {
            var1 = sc.aw(an, 728089333 * this.ag, 0, 670116879);
            if (null != var1) {
               au.aw(var1, (long)(728089333 * this.ag));
            }

            return var1;
         }
      }
   }

   public tq bb() {
      if (1481785964 * this.ah < 0) {
         return null;
      } else {
         tq var1 = (tq)au.af((long)(this.ah * -1798902719));
         if (var1 != null) {
            return var1;
         } else {
            var1 = sc.aw(an, this.ah * -466249443, 0, 333728604);
            if (var1 != null) {
               au.aw(var1, (long)(this.ah * -466249443));
            }

            return var1;
         }
      }
   }

   public on bz() {
      if (-1 == 668904608 * this.ao) {
         return null;
      } else {
         on var1 = (on)ab.af((long)(1857366871 * this.ao));
         if (var1 != null) {
            return var1;
         } else {
            nm var3 = an;
            nm var4 = aw;
            int var5 = 1857366871 * this.ao;
            byte[] var7 = var3.bh(var5, 0, (byte)-77);
            boolean var6;
            if (null == var7) {
               var6 = false;
            } else {
               sb.aa(var7, 1145263442);
               var6 = true;
            }

            on var2;
            if (!var6) {
               var2 = null;
            } else {
               byte[] var8 = var4.bh(var5, 0, (byte)-104);
               on var10;
               if (var8 == null) {
                  var10 = null;
               } else {
                  on var9 = new on(var8, tx.ac, ar.au, dd.ab, fd.aq, pc.al, hg.at);
                  pk.ay(-262861184);
                  var10 = var9;
               }

               var2 = var10;
            }

            if (null != var2) {
               ab.aw(var2, (long)(1531805076 * this.ao));
            }

            return var2;
         }
      }
   }

   public tq be() {
      if (-466249443 * this.ah < 0) {
         return null;
      } else {
         tq var1 = (tq)au.af((long)(this.ah * -466249443));
         if (var1 != null) {
            return var1;
         } else {
            var1 = sc.aw(an, this.ah * -466249443, 0, 898274027);
            if (var1 != null) {
               au.aw(var1, (long)(this.ah * -2047586410));
            }

            return var1;
         }
      }
   }

   public tq bk() {
      if (1100815213 * this.av < 0) {
         return null;
      } else {
         tq var1 = (tq)au.af((long)(this.av * 1100815213));
         if (null != var1) {
            return var1;
         } else {
            var1 = sc.aw(an, 1100815213 * this.av, 0, -115701406);
            if (var1 != null) {
               au.aw(var1, (long)(1100815213 * this.av));
            }

            return var1;
         }
      }
   }

   public final hb ak() {
      int var1 = -1;
      if (-1 != 1173802085 * this.ap) {
         var1 = jy.af(this.ap * -106494121, 1378585505);
      } else if (-1 != this.by * -756179250) {
         var1 = le.aw[-1580274447 * this.by];
      }

      int var2;
      if (var1 >= 0 && var1 < this.ae.length - 1) {
         var2 = this.ae[var1];
      } else {
         var2 = this.ae[this.ae.length - 1];
      }

      return var2 != -1 ? ew.af(var2, (byte)4) : null;
   }

   public tq bo() {
      if (170092719 * this.ar < 0) {
         return null;
      } else {
         tq var1 = (tq)au.af((long)(this.ar * 170092719));
         if (var1 != null) {
            return var1;
         } else {
            var1 = sc.aw(an, this.ar * 170092719, 0, 351583008);
            if (var1 != null) {
               au.aw(var1, (long)(170092719 * this.ar));
            }

            return var1;
         }
      }
   }

   public tq bx() {
      if (1100815213 * this.av < 0) {
         return null;
      } else {
         tq var1 = (tq)au.af((long)(this.av * 1110850418));
         if (null != var1) {
            return var1;
         } else {
            var1 = sc.aw(an, -1242132835 * this.av, 0, 1213129481);
            if (var1 != null) {
               au.aw(var1, (long)(1100815213 * this.av));
            }

            return var1;
         }
      }
   }

   hb() {
      try {
         super();
         this.ao = -1427566695;
         this.ax = 659007217;
         this.ai = -1307612166;
         this.ag = -1067276637;
         this.ah = -1113583925;
         this.av = 42326427;
         this.ar = 1203704241;
         this.am = 0;
         this.as = 0;
         this.aj = 481029747;
         this.ak = "";
         this.az = -720956497;
         this.ad = 0;
         this.ap = -753468781;
         this.by = 663321583;
      } catch (RuntimeException var1) {
         throw db.an(var1, "hb.<init>(" + ')');
      }
   }

   public static void bd() {
      ac.ac();
      au.ac();
      ab.ac();
   }

   static int bb(int var0, ch var1, boolean var2, byte var3) {
      try {
         int var4;
         if (var0 == 3500) {
            if (var3 != 1) {
               throw new IllegalStateException();
            } else {
               var4 = cy.al[(at -= 427135973) * -964267539];
               cy.al[(at += 427135973) * -964267539 - 1] = client.sh.av(var4, -680355127) ? 1 : 0;
               return 1;
            }
         } else {
            int[] var10000;
            int var10001;
            byte var10002;
            if (var0 == 3501) {
               if (var3 != 1) {
                  throw new IllegalStateException();
               } else {
                  var4 = cy.al[(at -= 427135973) * -964267539];
                  var10000 = cy.al;
                  var10001 = (at += 427135973) * -964267539 - 1;
                  if (client.sh.ah(var4, (byte)92)) {
                     if (var3 != 1) {
                        throw new IllegalStateException();
                     }

                     var10002 = 1;
                  } else {
                     var10002 = 0;
                  }

                  var10000[var10001] = var10002;
                  return 1;
               }
            } else if (3502 == var0) {
               var4 = cy.al[(at -= 427135973) * -964267539];
               var10000 = cy.al;
               var10001 = (at += 427135973) * -964267539 - 1;
               if (client.sh.ar(var4, 1556637445)) {
                  if (var3 != 1) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1;
               } else {
                  var10002 = 0;
               }

               var10000[var10001] = var10002;
               return 1;
            } else {
               return 2;
            }
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "hb.bb(" + ')');
      }
   }
}
