public class PcmPlayer {
   int az = 0;
   int as;
   public static PcmPlayerProvider pcmPlayerProvider;
   protected int[] ai;
   PcmStream ag;
   int ah = 572938784;
   long av = Formatting.af_renamed() * 9158675434300782157L;
   PcmStream[] bo = new PcmStream[8];
   int am;
   public static int au;
   long aj = 0L;
   int ak = 0;
   long ae = 0L;
   int ad = 0;
   int ar;
   boolean ap = true;
   public static boolean ab;
   int bx = 0;
   PcmStream[] bz = new PcmStream[8];
   static Archive archive14;

   public final synchronized void aj(PcmStream var1) {
      this.ag = var1;
   }

   public final void az() {
      this.ap = true;
   }

   public final synchronized void ae(byte var1) {
      if (nf.soundSystem != null) {
         if (var1 != -1) {
            return;
         }

         boolean var2 = true;

         for(int var3 = 0; var3 < 2; ++var3) {
            if (var1 != -1) {
               return;
            }

            if (this == nf.soundSystem.players[var3]) {
               if (var1 != -1) {
                  throw new IllegalStateException();
               }

               nf.soundSystem.players[var3] = null;
            }

            if (null != nf.soundSystem.players[var3]) {
               var2 = false;
            }
         }

         if (var2) {
            if (var1 != -1) {
               return;
            }

            SoundSystem.soundSystemExecutor.shutdownNow();
            SoundSystem.soundSystemExecutor = null;
            nf.soundSystem = null;
         }
      }

      this.au();
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

                           PcmStream var14 = var11.ab();
                           if (null != var14) {
                              for(int var15 = var11.av; null != var14; var14 = var11.aq()) {
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

      this.av = Formatting.af_renamed() * 9158675434300782157L;
   }

   protected void af() throws Exception {
   }

   protected void an(int var1) throws Exception {
   }

   protected int aw() throws Exception {
      return this.ar * -896831859;
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

   protected void au() {
   }

   protected void ab() throws Exception {
   }

   public final synchronized void ak() {
      if (this.ai != null) {
         long var2 = Formatting.af_renamed();

         try {
            if (0L != -269385131777873879L * this.aj) {
               if (var2 < this.aj * -269385131777873879L) {
                  return;
               }

               this.an(-896831859 * this.ar);
               this.aj = 0L;
               this.ap = true;
            }

            int var4 = this.aw();
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

               this.au();
               this.an(-896831859 * this.ar);
               var4 = 0;
               this.ap = true;
               if (256 + var5 > this.ar * -896831859) {
                  var5 = -896831859 * this.ar - 256;
                  this.as = -802016783 * (var5 - 1331788289 * this.am);
               }
            }

            while(var4 < var5) {
               this.by(this.ai, 256);
               this.ac();
               var4 += 256;
            }

            if (var2 > 7119359816026141145L * this.ae) {
               if (!this.ap) {
                  if (this.ak * 1667971679 == 0 && this.az * -1982890287 == 0) {
                     this.au();
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
            this.au();
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

   protected void ac() throws Exception {
   }

   protected PcmPlayer() {
   }

   static int ax_renamed(int var0, int var1, int var2) {
      if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) {
         return 0;
      } else {
         return var0 > 0 && 0 != (Tiles.Tiles_renderFlags[1][var1][var2] & 2) ? var0 - 1 : var0;
      }
   }

   public final synchronized void ad() {
      this.ap = true;

      try {
         this.ab();
      } catch (Exception var3) {
         this.au();
         this.aj = (Formatting.af_renamed() + 2000L) * -8158358322466360295L;
      }

   }
}
