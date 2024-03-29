public class PcmPlayer {
   public static PcmPlayerProvider pcmPlayerProvider;
   public static boolean ab;
   public static int au;
   static Archive gs;
   boolean ap = true;
   PcmStream ag;
   PcmStream[] bo = new PcmStream[8];
   PcmStream[] bz = new PcmStream[8];
   int ad = 0;
   int ah = 572938784;
   int ak = 0;
   int am;
   int ar;
   int as;
   int az = 0;
   int bx = 0;
   long ae = 0L;
   long aj = 0L;
   long av = Formatting.currentTimeMs() * 9158675434300782157L;
   protected int[] ai;

   protected PcmPlayer() {
   }

   public final synchronized void aj(PcmStream var1) {
      this.ag = var1;
   }

   public final synchronized void ak() {
      if (this.ai != null) {
         long var2 = Formatting.currentTimeMs();

         try {
            if (0L != -269385131777873879L * this.aj) {
               if (var2 < this.aj * -269385131777873879L) {
                  return;
               }

               this.open(-896831859 * this.ar);
               this.aj = 0L;
               this.ap = true;
            }

            int var4 = this.position();
            if (-1187659381 * this.ad - var4 > 1667971679 * this.ak) {
               this.ak = (this.ad * -1187659381 - var4) * -286285409;
            }

            int var5 = 335978257 * this.as + 1331788289 * this.am;
            if (256 + var5 > 16384) {
               var5 = 16128;
            }

            if (var5 + 256 > this.ar * -896831859) {
               this.ar += -737078272;
               if (this.ar * -896831859 > 16384) {
                  this.ar = 1091649536;
               }

               this.close();
               this.open(-896831859 * this.ar);
               var4 = 0;
               this.ap = true;
               if (256 + var5 > this.ar * -896831859) {
                  var5 = -896831859 * this.ar - 256;
                  this.as = -802016783 * (var5 - 1331788289 * this.am);
               }
            }

            while(var4 < var5) {
               this.by(this.ai, 256);
               this.write();
               var4 += 256;
            }

            if (var2 > 7119359816026141145L * this.ae) {
               if (!this.ap) {
                  if (this.ak * 1667971679 == 0 && this.az * -1982890287 == 0) {
                     this.close();
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
            this.close();
            this.aj = (var2 + 2000L) * -8158358322466360295L;
         }

         try {
            if (var2 > 500000L + 5466236213624304261L * this.av) {
               var2 = 5466236213624304261L * this.av;
            }

            while(var2 > 5000L + 5466236213624304261L * this.av) {
               this.ap(256);
               this.av += 9158675434300782157L * (long)(256000 / (au * -1359271235));
            }
         } catch (Exception var6) {
            this.av = var2 * 9158675434300782157L;
         }

      }
   }

   public final void az() {
      this.ap = true;
   }

   public final synchronized void ad() {
      this.ap = true;

      try {
         this.discard();
      } catch (Exception var3) {
         this.close();
         this.aj = (Formatting.currentTimeMs() + 2000L) * -8158358322466360295L;
      }

   }

   public final synchronized void ae() {
      if (nf.soundSystem != null) {
         boolean var2 = true;

         for(int var3 = 0; var3 < 2; ++var3) {
            if (this == nf.soundSystem.players[var3]) {
               nf.soundSystem.players[var3] = null;
            }

            if (null != nf.soundSystem.players[var3]) {
               var2 = false;
            }
         }

         if (var2) {
            SoundSystem.soundSystemExecutor.shutdownNow();
            SoundSystem.soundSystemExecutor = null;
            nf.soundSystem = null;
         }
      }

      this.close();
      this.ai = null;
   }

   final void ap(int var1) {
      this.bx -= -348458013 * var1;
      if (-951195189 * this.bx < 0) {
         this.bx = 0;
      }

      if (null != this.ag) {
         this.ag.skip(var1);
      }

   }

   final void by(int[] var1, int var2) {
      int var3 = var2;
      if (ab) {
         var3 = var2 << 1;
      }

      op.clearIntArray(var1, 0, var3);
      this.bx -= -348458013 * var2;
      if (null != this.ag && -951195189 * this.bx <= 0) {
         this.bx += (au * -1359271235 >> 4) * -348458013;
         hy.PcmStream_disable(this.ag);
         this.bi(this.ag, this.ag.ba());
         int var4 = 0;
         int var5 = 255;

         int var6;
         PcmStream var10;
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
                  PcmStream var11 = this.bo[var7];

                  label135:
                  while(true) {
                     while(true) {
                        if (null == var11) {
                           break label135;
                        }

                        AbstractSound var12 = var11.sound;
                        if (var12 != null && var12.position > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.after;
                        } else {
                           var11.active = true;
                           int var13 = var11.al();
                           var4 += var13;
                           if (null != var12) {
                              var12.position += var13;
                           }

                           if (var4 >= 1670800945 * this.ah) {
                              break label141;
                           }

                           PcmStream var14 = var11.firstSubStream();
                           if (null != var14) {
                              for(int var15 = var11.av; null != var14; var14 = var11.nextSubStream()) {
                                 this.bi(var14, var15 * var14.ba() >> 8);
                              }
                           }

                           PcmStream var20 = var11.after;
                           var11.after = null;
                           if (null == var10) {
                              this.bo[var7] = var20;
                           } else {
                              var10.after = var20;
                           }

                           if (var20 == null) {
                              this.bz[var7] = var10;
                           }

                           var11 = var20;
                        }
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            PcmStream var18 = this.bo[var6];
            PcmStream[] var19 = this.bo;
            this.bz[var6] = null;

            for(var19[var6] = null; null != var18; var18 = var10) {
               var10 = var18.after;
               var18.after = null;
            }
         }
      }

      if (this.bx * -951195189 < 0) {
         this.bx = 0;
      }

      if (this.ag != null) {
         this.ag.fill(var1, 0, var2);
      }

      this.av = Formatting.currentTimeMs() * 9158675434300782157L;
   }

   final void bi(PcmStream var1, int var2) {
      int var4 = var2 >> 5;
      PcmStream var5 = this.bz[var4];
      if (var5 == null) {
         this.bo[var4] = var1;
      } else {
         var5.after = var1;
      }

      this.bz[var4] = var1;
      var1.av = var2;
   }

   protected void init() throws Exception {
   }

   protected void open(int var1) throws Exception {
   }

   protected int position() throws Exception {
      return this.ar * -896831859;
   }

   protected void write() throws Exception {
   }

   protected void close() {
   }

   protected void discard() throws Exception {
   }

   static int ax_renamed(int var0, int var1, int var2) {
      if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) {
         return 0;
      } else {
         return var0 > 0 && 0 != (Tiles.Tiles_renderFlags[1][var1][var2] & 2) ? var0 - 1 : var0;
      }
   }
}
