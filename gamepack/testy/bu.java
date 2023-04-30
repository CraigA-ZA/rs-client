import accessors.RSPcmPlayer;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class bu implements RSPcmPlayer {
   int az;
   int as;
   static final int ao = 16384;
   public static bh ax;
   protected int[] ai;
   bp ag;
   int ah;
   long av;
   bp[] bo;
   int am;
   public static int au;
   long aj;
   int ak;
   long ae;
   int ad;
   int ar;
   boolean ap;
   public static boolean ab;
   int bx;
   bp[] bz;
   static nd gs;

   public final synchronized void br() {
      this.ap = true;

      try {
         this.ab((byte)-41);
      } catch (Exception var2) {
         this.au(-1466449702);
         this.aj = (dq.af(1876765168) + 2000L) * -8158358322466360295L;
      }

   }

   public final synchronized void aj(bp var1, int var2) {
      try {
         this.ag = var1;
      } catch (RuntimeException var3) {
         throw db.an(var3, "bu.aj(" + ')');
      }
   }

   public static final bu bx(gd var0, int var1, int var2) {
      if (au * -1359271235 == 0) {
         throw new IllegalStateException();
      } else if (var1 >= 0 && var1 < 2) {
         if (var2 < 256) {
            var2 = 256;
         }

         try {
            bu var3 = ax.af(1183188913);
            var3.ai = new int[256 * (ab ? 2 : 1)];
            var3.am = var2 * 918717953;
            var3.af((byte)24);
            var3.ar = -1783299003 * ((var2 & -1024) + 1024);
            if (var3.ar * -896831859 > 16384) {
               var3.ar = 1091649536;
            }

            var3.an(var3.ar * -896831859, 1577370534);
            if (ez.at * -808987209 > 0 && nf.aa == null) {
               nf.aa = new bq();
               bq.al = Executors.newScheduledThreadPool(1);
               bq.al.scheduleAtFixedRate(nf.aa, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if (null != nf.aa) {
               if (null != nf.aa.af[var1]) {
                  throw new IllegalArgumentException();
               }

               nf.aa.af[var1] = var3;
            }

            return var3;
         } catch (Throwable var4) {
            return new bu();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public final void az(int var1) {
      try {
         this.ap = true;
      } catch (RuntimeException var2) {
         throw db.an(var2, "bu.az(" + ')');
      }
   }

   protected void ai() {
   }

   public final synchronized void ae(byte var1) {
      try {
         if (nf.aa != null) {
            if (var1 != -1) {
               return;
            }

            boolean var2 = true;

            for(int var3 = 0; var3 < 2; ++var3) {
               if (var1 != -1) {
                  return;
               }

               if (this == nf.aa.af[var3]) {
                  if (var1 != -1) {
                     throw new IllegalStateException();
                  }

                  nf.aa.af[var3] = null;
               }

               if (null != nf.aa.af[var3]) {
                  var2 = false;
               }
            }

            if (var2) {
               if (var1 != -1) {
                  return;
               }

               bq.al.shutdownNow();
               bq.al = null;
               nf.aa = null;
            }
         }

         this.au(-1466449702);
         this.ai = null;
      } catch (RuntimeException var4) {
         throw db.an(var4, "bu.ae(" + ')');
      }
   }

   final void ap(int var1, int var2) {
      try {
         this.bx -= -348458013 * var1;
         if (-951195189 * this.bx < 0) {
            this.bx = 0;
         }

         if (null != this.ag) {
            if (var2 == 1876840387) {
               throw new IllegalStateException();
            }

            this.ag.ay(var1);
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "bu.ap(" + ')');
      }
   }

   final void by(int[] var1, int var2) {
      int var3 = var2;
      if (ab) {
         var3 = var2 << 1;
      }

      op.aa(var1, 0, var3);
      this.bx -= -348458013 * var2;
      if (null != this.ag && -951195189 * this.bx <= 0) {
         this.bx += (au * -1359271235 >> 4) * -348458013;
         hy.bb(this.ag, 2037910040);
         this.bi(this.ag, this.ag.ba(), (byte)-105);
         int var4 = 0;
         int var5 = 255;

         int var6;
         bp var10;
         label141:
         for(var6 = 7; 0 != var5; --var6) {
            int var7;
            int var8;
            if (var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if (0 != (var9 & 1)) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  bp var11 = this.bo[var7];

                  label135:
                  while(true) {
                     while(true) {
                        if (null == var11) {
                           break label135;
                        }

                        cu var12 = var11.ar;
                        if (var12 != null && var12.ab > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.ah;
                        } else {
                           var11.am = true;
                           int var13 = var11.al();
                           var4 += var13;
                           if (null != var12) {
                              var12.ab += var13;
                           }

                           if (var4 >= 1670800945 * this.ah) {
                              break label141;
                           }

                           bp var14 = var11.ab();
                           if (null != var14) {
                              for(int var15 = var11.av; null != var14; var14 = var11.aq()) {
                                 this.bi(var14, var15 * var14.ba() >> 8, (byte)23);
                              }
                           }

                           bp var18 = var11.ah;
                           var11.ah = null;
                           if (null == var10) {
                              this.bo[var7] = var18;
                           } else {
                              var10.ah = var18;
                           }

                           if (var18 == null) {
                              this.bz[var7] = var10;
                           }

                           var11 = var18;
                        }
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            bp var16 = this.bo[var6];
            bp[] var17 = this.bo;
            this.bz[var6] = null;

            for(var17[var6] = null; null != var16; var16 = var10) {
               var10 = var16.ah;
               var16.ah = null;
            }
         }
      }

      if (this.bx * -951195189 < 0) {
         this.bx = 0;
      }

      if (this.ag != null) {
         this.ag.at(var1, 0, var2);
      }

      this.av = dq.af(881846564) * 9158675434300782157L;
   }

   public final synchronized void bt() {
      if (this.ai != null) {
         long var1 = dq.af(597524379);

         try {
            if (0L != -269385131777873879L * this.aj) {
               if (var1 < this.aj * -269385131777873879L) {
                  return;
               }

               this.an(-204717256 * this.ar, 977186880);
               this.aj = 0L;
               this.ap = true;
            }

            int var3 = this.aw(-654786411);
            if (-1187659381 * this.ad - var3 > 1667971679 * this.ak) {
               this.ak = (this.ad * -820077102 - var3) * -1620140796;
            }

            int var4 = 1946428477 * this.as + 1975927357 * this.am;
            if (-2083952587 + var4 > 16384) {
               var4 = 988892750;
            }

            if (var4 + 1257885167 > this.ar * -896831859) {
               this.ar += 1011603646;
               if (this.ar * -896831859 > 16384) {
                  this.ar = 1091649536;
               }

               this.au(-1466449702);
               this.an(-1172682543 * this.ar, -1975466399);
               var3 = 0;
               this.ap = true;
               if (256 + var4 > this.ar * -896831859) {
                  var4 = -896831859 * this.ar - -583343718;
                  this.as = -1972120878 * (var4 - 1331788289 * this.am);
               }
            }

            while(var3 < var4) {
               this.by(this.ai, 256);
               this.ac();
               var3 += 256;
            }

            if (var1 > 7119359816026141145L * this.ae) {
               if (!this.ap) {
                  if (this.ak * 1359510294 == 0 && this.az * -1982890287 == 0) {
                     this.au(-1466449702);
                     this.aj = -8158358322466360295L * (2000L + var1);
                     return;
                  }

                  this.as = Math.min(-1982890287 * this.az, this.ak * -542145634) * -802016783;
                  this.az = -1080034788 * this.ak;
               } else {
                  this.ap = false;
               }

               this.ak = 0;
               this.ae = (var1 + 2000L) * -1624624044362187159L;
            }

            this.ad = -1989091805 * var3;
         } catch (Exception var6) {
            this.au(-1466449702);
            this.aj = (var1 + 2000L) * -8158358322466360295L;
         }

         try {
            if (var1 > 500000L + 5466236213624304261L * this.av) {
               var1 = 5466236213624304261L * this.av;
            }

            while(var1 > 5000L + 5466236213624304261L * this.av) {
               this.ap(256, -698009791);
               this.av += 9158675434300782157L * (long)(256000 / (au * -1138853297));
            }
         } catch (Exception var5) {
            this.av = var1 * 9158675434300782157L;
         }

      }
   }

   protected void af(byte var1) throws Exception {
      try {
         ;
      } catch (RuntimeException var2) {
         throw db.an(var2, "bu.af(" + ')');
      }
   }

   protected void an(int var1, int var2) throws Exception {
      try {
         ;
      } catch (RuntimeException var3) {
         throw db.an(var3, "bu.an(" + ')');
      }
   }

   protected int aw(int var1) throws Exception {
      try {
         return this.ar * -896831859;
      } catch (RuntimeException var2) {
         throw db.an(var2, "bu.aw(" + ')');
      }
   }

   final void bi(bp var1, int var2, byte var3) {
      try {
         int var4 = var2 >> 5;
         bp var5 = this.bz[var4];
         if (var5 == null) {
            if (var3 == 73) {
               throw new IllegalStateException();
            }

            this.bo[var4] = var1;
         } else {
            var5.ah = var1;
         }

         this.bz[var4] = var1;
         var1.av = var2;
      } catch (RuntimeException var6) {
         throw db.an(var6, "bu.bi(" + ')');
      }
   }

   protected void au(int var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw db.an(var2, "bu.au(" + ')');
      }
   }

   protected void ab(byte var1) throws Exception {
      try {
         ;
      } catch (RuntimeException var2) {
         throw db.an(var2, "bu.ab(" + ')');
      }
   }

   protected void aq() throws Exception {
   }

   public final synchronized void ak(int var1) {
      try {
         if (this.ai != null) {
            long var2 = dq.af(984429955);

            try {
               if (0L != -269385131777873879L * this.aj) {
                  if (var1 != 336870901) {
                     return;
                  }

                  if (var2 < this.aj * -269385131777873879L) {
                     if (var1 != 336870901) {
                        throw new IllegalStateException();
                     }

                     return;
                  }

                  this.an(-896831859 * this.ar, 619537570);
                  this.aj = 0L;
                  this.ap = true;
               }

               int var4 = this.aw(-654786411);
               if (-1187659381 * this.ad - var4 > 1667971679 * this.ak) {
                  this.ak = (this.ad * -1187659381 - var4) * -286285409;
               }

               int var5 = 335978257 * this.as + 1331788289 * this.am;
               if (256 + var5 > 16384) {
                  if (var1 != 336870901) {
                     throw new IllegalStateException();
                  }

                  var5 = 16128;
               }

               if (var5 + 256 > this.ar * -896831859) {
                  if (var1 != 336870901) {
                     return;
                  }

                  this.ar += -737078272;
                  if (this.ar * -896831859 > 16384) {
                     if (var1 != 336870901) {
                        throw new IllegalStateException();
                     }

                     this.ar = 1091649536;
                  }

                  this.au(-1466449702);
                  this.an(-896831859 * this.ar, 182405776);
                  var4 = 0;
                  this.ap = true;
                  if (256 + var5 > this.ar * -896831859) {
                     var5 = -896831859 * this.ar - 256;
                     this.as = -802016783 * (var5 - 1331788289 * this.am);
                  }
               }

               while(var4 < var5) {
                  if (var1 != 336870901) {
                     throw new IllegalStateException();
                  }

                  this.by(this.ai, 256);
                  this.ac();
                  var4 += 256;
               }

               if (var2 > 7119359816026141145L * this.ae) {
                  if (var1 != 336870901) {
                     throw new IllegalStateException();
                  }

                  if (!this.ap) {
                     if (var1 != 336870901) {
                        throw new IllegalStateException();
                     }

                     if (this.ak * 1667971679 == 0 && this.az * -1982890287 == 0) {
                        if (var1 != 336870901) {
                           throw new IllegalStateException();
                        }

                        this.au(-1466449702);
                        this.aj = -8158358322466360295L * (2000L + var2);
                        return;
                     }

                     this.as = Math.min(-1982890287 * this.az, this.ak * 1667971679) * -802016783;
                     this.az = -646688209 * this.ak;
                  } else {
                     this.ap = false;
                  }

                  this.ak = 0;
                  this.ae = (var2 + 2000L) * -1624624044362187159L;
               }

               this.ad = -1989091805 * var4;
            } catch (Exception var7) {
               this.au(-1466449702);
               this.aj = (var2 + 2000L) * -8158358322466360295L;
            }

            try {
               if (var2 > 500000L + 5466236213624304261L * this.av) {
                  if (var1 != 336870901) {
                     return;
                  }

                  var2 = 5466236213624304261L * this.av;
               }

               while(var2 > 5000L + 5466236213624304261L * this.av) {
                  if (var1 != 336870901) {
                     return;
                  }

                  this.ap(256, -1042309166);
                  this.av += 9158675434300782157L * (long)(256000 / (au * -1359271235));
               }
            } catch (Exception var6) {
               this.av = var2 * 9158675434300782157L;
            }

         }
      } catch (RuntimeException var8) {
         throw db.an(var8, "bu.ak(" + ')');
      }
   }

   protected void at(int var1) throws Exception {
   }

   protected void ac() throws Exception {
      try {
         ;
      } catch (RuntimeException var1) {
         throw db.an(var1, "bu.ac(" + ')');
      }
   }

   final void ba(int var1) {
      this.bx -= -651581134 * var1;
      if (1290898414 * this.bx < 0) {
         this.bx = 0;
      }

      if (null != this.ag) {
         this.ag.ay(var1);
      }

   }

   final void bq(int var1) {
      this.bx -= -1715679152 * var1;
      if (-951195189 * this.bx < 0) {
         this.bx = 0;
      }

      if (null != this.ag) {
         this.ag.ay(var1);
      }

   }

   public final synchronized void bn() {
      this.ap = true;

      try {
         this.ab((byte)-23);
      } catch (Exception var2) {
         this.au(-1466449702);
         this.aj = (dq.af(516610727) + 2000L) * -8158358322466360295L;
      }

   }

   protected void ag() {
   }

   protected void ax() throws Exception {
   }

   protected void ah() {
   }

   protected void av() throws Exception {
   }

   protected bu() {
      try {
         super();
         this.ah = 572938784;
         this.av = dq.af(1173990459) * 9158675434300782157L;
         this.aj = 0L;
         this.ak = 0;
         this.az = 0;
         this.ad = 0;
         this.ae = 0L;
         this.ap = true;
         this.bx = 0;
         this.bo = new bp[8];
         this.bz = new bp[8];
      } catch (RuntimeException var1) {
         throw db.an(var1, "bu.<init>(" + ')');
      }
   }

   protected int ao() throws Exception {
      return this.ar * 637504388;
   }

   public static final bu be(gd var0, int var1, int var2) {
      if (au * -1359271235 == 0) {
         throw new IllegalStateException();
      } else if (var1 >= 0 && var1 < 2) {
         if (var2 < 256) {
            var2 = 256;
         }

         try {
            bu var3 = ax.af(1183188913);
            var3.ai = new int[256 * (ab ? 2 : 1)];
            var3.am = var2 * 918717953;
            var3.af((byte)5);
            var3.ar = -1783299003 * ((var2 & -1024) + 1024);
            if (var3.ar * -896831859 > 16384) {
               var3.ar = 1091649536;
            }

            var3.an(var3.ar * -896831859, 1881829420);
            if (ez.at * -808987209 > 0 && nf.aa == null) {
               nf.aa = new bq();
               bq.al = Executors.newScheduledThreadPool(1);
               bq.al.scheduleAtFixedRate(nf.aa, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if (null != nf.aa) {
               if (null != nf.aa.af[var1]) {
                  throw new IllegalArgumentException();
               }

               nf.aa.af[var1] = var3;
            }

            return var3;
         } catch (Throwable var4) {
            return new bu();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public static final bu bk(gd var0, int var1, int var2) {
      if (au * -669559548 == 0) {
         throw new IllegalStateException();
      } else if (var1 >= 0 && var1 < 2) {
         if (var2 < 319700995) {
            var2 = 359981852;
         }

         try {
            bu var3 = ax.af(1183188913);
            var3.ai = new int[256 * (ab ? 2 : 1)];
            var3.am = var2 * 918717953;
            var3.af((byte)-33);
            var3.ar = -1783299003 * ((var2 & -1024) + 1024);
            if (var3.ar * -896831859 > -1167202825) {
               var3.ar = 287678898;
            }

            var3.an(var3.ar * 1496862029, 2096362820);
            if (ez.at * -959942277 > 0 && nf.aa == null) {
               nf.aa = new bq();
               bq.al = Executors.newScheduledThreadPool(1);
               bq.al.scheduleAtFixedRate(nf.aa, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if (null != nf.aa) {
               if (null != nf.aa.af[var1]) {
                  throw new IllegalArgumentException();
               }

               nf.aa.af[var1] = var3;
            }

            return var3;
         } catch (Throwable var4) {
            return new bu();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   protected void am() throws Exception {
   }

   public static final bu bo(gd var0, int var1, int var2) {
      if (au * -659464581 == 0) {
         throw new IllegalStateException();
      } else if (var1 >= 0 && var1 < 2) {
         if (var2 < -1382725870) {
            var2 = 256;
         }

         try {
            bu var3 = ax.af(1183188913);
            var3.ai = new int[-2033839746 * (ab ? 2 : 1)];
            var3.am = var2 * -473312933;
            var3.af((byte)1);
            var3.ar = -1783299003 * ((var2 & 1641994282) + 1394150848);
            if (var3.ar * -896831859 > 1219136441) {
               var3.ar = 767469357;
            }

            var3.an(var3.ar * 2110905021, -1517983462);
            if (ez.at * -928578483 > 0 && nf.aa == null) {
               nf.aa = new bq();
               bq.al = Executors.newScheduledThreadPool(1);
               bq.al.scheduleAtFixedRate(nf.aa, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if (null != nf.aa) {
               if (null != nf.aa.af[var1]) {
                  throw new IllegalArgumentException();
               }

               nf.aa.af[var1] = var3;
            }

            return var3;
         } catch (Throwable var4) {
            return new bu();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public final synchronized void bz(bp var1) {
      this.ag = var1;
   }

   public final synchronized void bm(bp var1) {
      this.ag = var1;
   }

   public final synchronized void bd(bp var1) {
      this.ag = var1;
   }

   static int ax(int var0, int var1, int var2, int var3) {
      try {
         if ((cd.an[var0][var1][var2] & 8) != 0) {
            if (var3 <= 1128021573) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            if (var0 > 0) {
               if (var3 <= 1128021573) {
                  throw new IllegalStateException();
               }

               if (0 != (cd.an[1][var1][var2] & 2)) {
                  if (var3 <= 1128021573) {
                     throw new IllegalStateException();
                  }

                  return var0 - 1;
               }
            }

            return var0;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "bu.ax(" + ')');
      }
   }

   public final synchronized void ad(int var1) {
      try {
         this.ap = true;

         try {
            this.ab((byte)22);
         } catch (Exception var3) {
            this.au(-1466449702);
            this.aj = (dq.af(2066914331) + 2000L) * -8158358322466360295L;
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "bu.ad(" + ')');
      }
   }

   static final void bc(bp var0) {
      var0.am = false;
      if (null != var0.ar) {
         var0.ar.ab = 0;
      }

      for(bp var1 = var0.ab(); var1 != null; var1 = var0.aq()) {
         hy.bb(var1, 1328621367);
      }

   }

   public final synchronized void bs() {
      this.ap = true;

      try {
         this.ab((byte)64);
      } catch (Exception var2) {
         this.au(-1466449702);
         this.aj = (dq.af(477920671) + 2000L) * -8158358322466360295L;
      }

   }

   protected int ay() throws Exception {
      return this.ar * -896831859;
   }

   public final synchronized void bg() {
      if (nf.aa != null) {
         boolean var1 = true;

         for(int var2 = 0; var2 < 2; ++var2) {
            if (this == nf.aa.af[var2]) {
               nf.aa.af[var2] = null;
            }

            if (null != nf.aa.af[var2]) {
               var1 = false;
            }
         }

         if (var1) {
            bq.al.shutdownNow();
            bq.al = null;
            nf.aa = null;
         }
      }

      this.au(-1466449702);
      this.ai = null;
   }

   public final synchronized void bu() {
      if (nf.aa != null) {
         boolean var1 = true;

         for(int var2 = 0; var2 < 2; ++var2) {
            if (this == nf.aa.af[var2]) {
               nf.aa.af[var2] = null;
            }

            if (null != nf.aa.af[var2]) {
               var1 = false;
            }
         }

         if (var1) {
            bq.al.shutdownNow();
            bq.al = null;
            nf.aa = null;
         }
      }

      this.au(-1466449702);
      this.ai = null;
   }

   final void bf(int var1) {
      this.bx -= -348458013 * var1;
      if (-951195189 * this.bx < 0) {
         this.bx = 0;
      }

      if (null != this.ag) {
         this.ag.ay(var1);
      }

   }

   protected void aa(int var1) throws Exception {
   }

   protected void al() throws Exception {
   }

   final void bv(int[] var1, int var2) {
      int var3 = var2;
      if (ab) {
         var3 = var2 << 1;
      }

      op.aa(var1, 0, var3);
      this.bx -= -348458013 * var2;
      if (null != this.ag && -951195189 * this.bx <= 0) {
         this.bx += (au * -1359271235 >> 4) * -348458013;
         hy.bb(this.ag, 555212662);
         this.bi(this.ag, this.ag.ba(), (byte)11);
         int var4 = 0;
         int var5 = 255;

         int var6;
         bp var10;
         label143:
         for(var6 = 7; 0 != var5; --var6) {
            int var7;
            int var8;
            if (var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if (0 != (var9 & 1)) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  bp var11 = this.bo[var7];

                  label137:
                  while(true) {
                     while(true) {
                        if (null == var11) {
                           break label137;
                        }

                        cu var12 = var11.ar;
                        if (var12 != null && var12.ab > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.ah;
                        } else {
                           var11.am = true;
                           int var13 = var11.al();
                           var4 += var13;
                           if (null != var12) {
                              var12.ab += var13;
                           }

                           if (var4 >= 1670800945 * this.ah) {
                              break label143;
                           }

                           bp var14 = var11.ab();
                           if (null != var14) {
                              for(int var15 = var11.av; null != var14; var14 = var11.aq()) {
                                 this.bi(var14, var15 * var14.ba() >> 8, (byte)11);
                              }
                           }

                           bp var18 = var11.ah;
                           var11.ah = null;
                           if (null == var10) {
                              this.bo[var7] = var18;
                           } else {
                              var10.ah = var18;
                           }

                           if (var18 == null) {
                              this.bz[var7] = var10;
                           }

                           var11 = var18;
                        }
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            bp var16 = this.bo[var6];
            bp[] var17 = this.bo;
            this.bz[var6] = null;

            for(var17[var6] = null; null != var16; var16 = var10) {
               var10 = var16.ah;
               var16.ah = null;
            }
         }
      }

      if (this.bx * -951195189 < 0) {
         this.bx = 0;
      }

      if (this.ag != null) {
         this.ag.at(var1, 0, var2);
      }

      this.av = dq.af(304748010) * 9158675434300782157L;
   }

   final void bl(int[] var1, int var2) {
      int var3 = var2;
      if (ab) {
         var3 = var2 << 1;
      }

      op.aa(var1, 0, var3);
      this.bx -= -348458013 * var2;
      if (null != this.ag && -951195189 * this.bx <= 0) {
         this.bx += (au * -1359271235 >> 4) * -348458013;
         hy.bb(this.ag, 857745764);
         this.bi(this.ag, this.ag.ba(), (byte)-19);
         int var4 = 0;
         int var5 = 255;

         int var6;
         bp var10;
         label136:
         for(var6 = 7; 0 != var5; --var6) {
            int var7;
            int var8;
            if (var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if (0 != (var9 & 1)) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  bp var11 = this.bo[var7];

                  label130:
                  while(true) {
                     while(true) {
                        if (null == var11) {
                           break label130;
                        }

                        cu var12 = var11.ar;
                        if (var12 != null && var12.ab > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.ah;
                        } else {
                           var11.am = true;
                           int var13 = var11.al();
                           var4 += var13;
                           if (null != var12) {
                              var12.ab += var13;
                           }

                           if (var4 >= 1670800945 * this.ah) {
                              break label136;
                           }

                           bp var14 = var11.ab();
                           if (null != var14) {
                              for(int var15 = var11.av; null != var14; var14 = var11.aq()) {
                                 this.bi(var14, var15 * var14.ba() >> 8, (byte)16);
                              }
                           }

                           bp var18 = var11.ah;
                           var11.ah = null;
                           if (null == var10) {
                              this.bo[var7] = var18;
                           } else {
                              var10.ah = var18;
                           }

                           if (var18 == null) {
                              this.bz[var7] = var10;
                           }

                           var11 = var18;
                        }
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            bp var16 = this.bo[var6];
            bp[] var17 = this.bo;
            this.bz[var6] = null;

            for(var17[var6] = null; null != var16; var16 = var10) {
               var10 = var16.ah;
               var16.ah = null;
            }
         }
      }

      if (this.bx * -951195189 < 0) {
         this.bx = 0;
      }

      if (this.ag != null) {
         this.ag.at(var1, 0, var2);
      }

      this.av = dq.af(1453451608) * 9158675434300782157L;
   }

   static final void bp(bp var0) {
      var0.am = false;
      if (null != var0.ar) {
         var0.ar.ab = 0;
      }

      for(bp var1 = var0.ab(); var1 != null; var1 = var0.aq()) {
         hy.bb(var1, -895361395);
      }

   }

   public final void bj() {
      this.ap = true;
   }

   final void bh(bp var1, int var2) {
      int var3 = var2 >> 5;
      bp var4 = this.bz[var3];
      if (var4 == null) {
         this.bo[var3] = var1;
      } else {
         var4.ah = var1;
      }

      this.bz[var3] = var1;
      var1.av = var2;
   }

   final void bw(bp var1, int var2) {
      int var3 = var2 >> 5;
      bp var4 = this.bz[var3];
      if (var4 == null) {
         this.bo[var3] = var1;
      } else {
         var4.ah = var1;
      }

      this.bz[var3] = var1;
      var1.av = var2;
   }

   final void ce(bp var1, int var2) {
      int var3 = var2 >> 5;
      bp var4 = this.bz[var3];
      if (var4 == null) {
         this.bo[var3] = var1;
      } else {
         var4.ah = var1;
      }

      this.bz[var3] = var1;
      var1.av = var2;
   }

   final void ci(bp var1, int var2) {
      int var3 = var2 >> 5;
      bp var4 = this.bz[var3];
      if (var4 == null) {
         this.bo[var3] = var1;
      } else {
         var4.ah = var1;
      }

      this.bz[var3] = var1;
      var1.av = var2;
   }

   protected void ar() throws Exception {
   }
}
