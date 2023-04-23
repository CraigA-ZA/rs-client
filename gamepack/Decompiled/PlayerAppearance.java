import java.util.Arrays;

public class PlayerAppearance {
   public static short[] ay;
   public static short[][] ao;
   static EvictingDualNodeHashTable ar;
   static final int[] ag;
   boolean isFemale = false;
   gx[] at;
   int[] af;
   int[] an;
   int[] aw;
   long al;
   long aq;
   public int ab;
   public int ac = -1029929221;
   public int au = 0;

   public static byte[] af_renamed(CharSequence var0, byte var1) {
      int var2 = var0.length();
      byte[] var3 = new byte[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         if (var1 >= -1) {
            throw new IllegalStateException();
         }

         char var5 = var0.charAt(var4);
         if (var5 > 127) {
            var3[var4] = 63;
         } else {
            var3[var4] = (byte)var5;
         }
      }

      return var3;
   }

   public static final void af(long var0) {
      if (var0 > 0L) {
         if (0L == var0 % 10L) {
            long var2 = var0 - 1L;

            try {
               Thread.sleep(var2);
            } catch (InterruptedException var7) {
            }

            try {
               Thread.sleep(1L);
            } catch (InterruptedException var6) {
            }
         } else {
            try {
               Thread.sleep(var0);
            } catch (InterruptedException var5) {
            }
         }

      }
   }

   static {
      ag = new int[]{622494345 * hp.at.ag, hp.ao.ag * 622494345, 622494345 * hp.au.ag, 622494345 * hp.aq.ag, hp.aa.ag * 622494345, 622494345 * hp.al.ag, 622494345 * hp.ay.ag};
      ar = new EvictingDualNodeHashTable(260);
   }

   public PlayerAppearance() {
   }

   PlayerAppearance(PlayerAppearance var1) {
      int[] var2 = Arrays.copyOf(var1.an, var1.an.length);
      int[] var3 = Arrays.copyOf(var1.af, var1.af.length);
      gx[] var4 = (gx[])(var1.at != null ? (gx[])Arrays.copyOf(var1.at, var1.at.length) : null);
      int[] var5 = Arrays.copyOf(var1.aw, var1.aw.length);
      this.af(var3, var2, var4, false, var5, 1693987821 * var1.au, var1.ab * -2131733097, var1.ac * -1004049459);
   }

   public void af(int[] var1, int[] var2, gx[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
      this.at = var3;
      this.isFemale = var4;
      this.ac = var8 * 1029929221;
      this.an(var1, var2, var5, var6, var7);
   }

   public void an(int[] var1, int[] var2, int[] var3, int var4, int var5) {
      if (null == var1) {
         var1 = this.aw(var4);
      }

      if (null == var2) {
         var2 = this.aw(var4);
      }

      this.af = var1;
      this.an = var2;
      this.aw = var3;
      this.au = 325591525 * var4;
      this.ab = -11568601 * var5;
      this.at();
   }

   int[] aw(int var1) {
      int[] var3 = new int[12];

      for(int var4 = 0; var4 < 7; ++var4) {
         gt.ac_renamed(var1, var3, var4);
      }

      return var3;
   }

   public void au(int var1, boolean var2) {
      if (var1 != 1 || 1 != this.au * 1693987821) {
         int var4 = this.an[ag[var1]];
         if (0 != var4) {
            var4 -= 256;

            IDKType var5;
            do {
               if (!var2) {
                  --var4;
                  if (var4 < 0) {
                     var4 = IDKType.aw * 743589639 - 1;
                  }
               } else {
                  ++var4;
                  if (var4 >= 743589639 * IDKType.aw) {
                     var4 = 0;
                  }
               }

               var5 = dn.getIDKType(var4);
            } while(null == var5 || var5.ao || var5.bodyPart * 1015855167 != var1 + (1 == this.au * 1693987821 ? 7 : 0));

            this.an[ag[var1]] = 256 + var4;
            this.at();
         }
      }
   }

   public void ab(int var1, boolean var2) {
      int var4 = this.aw[var1];
      if (!var2) {
         do {
            --var4;
            if (var4 < 0) {
               var4 = ao[var1].length - 1;
            }
         } while(!fj.af_renamed(var1, var4));
      } else {
         do {
            ++var4;
            if (var4 >= ao[var1].length) {
               var4 = 0;
            }
         } while(!fj.af_renamed(var1, var4));
      }

      this.aw[var1] = var4;
      this.at();
   }

   public void aq(int var1) {
      if (1693987821 * this.au != var1) {
         this.an((int[])null, (int[])null, this.aw, var1, -1);
      }
   }

   public void encode(Packet var1) {
      var1.bu(1693987821 * this.au);

      int var3;
      for(var3 = 0; var3 < 7; ++var3) {
         int var4 = this.an[ag[var3]];
         if (var4 == 0) {
            var1.bu(-1);
         } else {
            var1.bu(var4 - 256);
         }
      }

      for(var3 = 0; var3 < 5; ++var3) {
         var1.bu(this.aw[var3]);
      }

   }

   void at() {
      long var2 = 800274196296009541L * this.aq;
      int var4 = this.an[5];
      int var5 = this.an[9];
      this.an[5] = var5;
      this.an[9] = var4;
      this.aq = 0L;

      int var6;
      for(var6 = 0; var6 < 12; ++var6) {
         this.aq = (this.aq * 800274196296009541L << 4) * 4410892792882131853L;
         if (this.an[var6] >= 256) {
            this.aq += 4410892792882131853L * (long)(this.an[var6] - 256);
         }
      }

      if (this.an[0] >= 256) {
         this.aq += (long)(this.an[0] - 256 >> 4) * 4410892792882131853L;
      }

      if (this.an[1] >= 256) {
         this.aq += (long)(this.an[1] - 256 >> 8) * 4410892792882131853L;
      }

      for(var6 = 0; var6 < 5; ++var6) {
         this.aq = 4410892792882131853L * (800274196296009541L * this.aq << 3);
         this.aq += (long)this.aw[var6] * 4410892792882131853L;
      }

      this.aq = 4410892792882131853L * (800274196296009541L * this.aq << 1);
      this.aq += (long)this.au * -7585466391638339447L;
      this.an[5] = var4;
      this.an[9] = var5;
      if (var2 != 0L && this.aq * 800274196296009541L != var2 || this.isFemale) {
         ar.remove(var2);
      }

   }

   public it aa(SeqType var1, int var2, SeqType var3, int var4) {
      if (-1 != -2131733097 * this.ab) {
         return AbstractArchive.an_renamed(this.ab * -2131733097).ab(var1, var2, var3, var4, (hv)null);
      } else {
         long var6 = this.aq * 800274196296009541L;
         int[] var8 = this.an;
         if (var1 != null && (var1.ad * -932726919 >= 0 || var1.ae * -170018527 >= 0)) {
            var8 = new int[12];

            for(int var9 = 0; var9 < 12; ++var9) {
               var8[var9] = this.an[var9];
            }

            if (-932726919 * var1.ad >= 0) {
               var6 += (long)(-932726919 * var1.ad - this.an[5] << 40);
               var8[5] = var1.ad * -932726919;
            }

            if (-170018527 * var1.ae >= 0) {
               var6 += (long)(var1.ae * -170018527 - this.an[3] << 48);
               var8[3] = var1.ae * -170018527;
            }
         }

         it var21 = (it)ar.get(var6);
         if (null == var21) {
            boolean var10 = false;

            int var12;
            for(int var11 = 0; var11 < 12; ++var11) {
               var12 = var8[var11];
               if (var12 >= 256 && var12 < 512 && !dn.getIDKType(var12 - 256).loadModel()) {
                  var10 = true;
               }

               if (var12 >= 512 && !HeadbarUpdate.getObjType(var12 - 512).ax(this.au * 1693987821)) {
                  var10 = true;
               }
            }

            if (var10) {
               if (-1L != 1976929687773021041L * this.al) {
                  var21 = (it)ar.get(1976929687773021041L * this.al);
               }

               if (null == var21) {
                  return null;
               }
            }

            if (var21 == null) {
               UnlitModel[] var23 = new UnlitModel[12];
               var12 = 0;

               int var14;
               for(int var13 = 0; var13 < 12; ++var13) {
                  var14 = var8[var13];
                  if (var14 >= 256 && var14 < 512) {
                     UnlitModel var15 = dn.getIDKType(var14 - 256).getModel();
                     if (var15 != null) {
                        var23[var12++] = var15;
                     }
                  }

                  if (var14 >= 512) {
                     ObjType var25 = HeadbarUpdate.getObjType(var14 - 512);
                     UnlitModel var16 = var25.ai(1693987821 * this.au);
                     if (var16 != null) {
                        if (null != this.at) {
                           gx var17 = this.at[var13];
                           if (var17 != null) {
                              int var18;
                              if (var17.aw != null && var25.av != null && var25.ar.length == var17.aw.length) {
                                 for(var18 = 0; var18 < var25.av.length; ++var18) {
                                    var16.recolor(var25.ar[var18], var17.aw[var18]);
                                 }
                              }

                              if (null != var17.ac && var25.am != null && var17.ac.length == var25.as.length) {
                                 for(var18 = 0; var18 < var25.am.length; ++var18) {
                                    var16.retexture(var25.as[var18], var17.ac[var18]);
                                 }
                              }
                           }
                        }

                        var23[var12++] = var16;
                     }
                  }
               }

               UnlitModel var24 = new UnlitModel(var23, var12);

               for(var14 = 0; var14 < 5; ++var14) {
                  if (this.aw[var14] < ao[var14].length) {
                     var24.recolor(ay[var14], ao[var14][this.aw[var14]]);
                  }

                  if (this.aw[var14] < qv.ai[var14].length) {
                     var24.recolor(WorldMapIcon1.ax[var14], qv.ai[var14][this.aw[var14]]);
                  }
               }

               var21 = var24.bb(64, 850, -30, -50, -30);
               ar.put(var21, var6);
               this.al = var6 * 3107045911833599377L;
            }
         }

         it var22;
         if (var1 == null && var3 == null) {
            var22 = var21.aa(true);
         } else if (var1 != null && null != var3) {
            var22 = var1.at(var21, var2, var3, var4);
         } else if (null != var1) {
            var22 = var1.ab(var21, var2);
         } else {
            var22 = var3.ab(var21, var4);
         }

         return var22;
      }
   }

   UnlitModel getChatHeadModel() {
      if (-1 != this.ab * -2131733097) {
         return AbstractArchive.an_renamed(this.ab * -2131733097).aq((hv)null);
      } else {
         boolean var2 = false;

         int var4;
         for(int var3 = 0; var3 < 12; ++var3) {
            var4 = this.an[var3];
            if (var4 >= 256 && var4 < 512 && !dn.getIDKType(var4 - 256).loadChatHeadModel()) {
               var2 = true;
            }

            if (var4 >= 512 && !HeadbarUpdate.getObjType(var4 - 512).ag(this.au * 1693987821)) {
               var2 = true;
            }
         }

         if (var2) {
            return null;
         } else {
            UnlitModel[] var9 = new UnlitModel[12];
            var4 = 0;

            int var6;
            for(int var5 = 0; var5 < 12; ++var5) {
               var6 = this.an[var5];
               UnlitModel var7;
               if (var6 >= 256 && var6 < 512) {
                  var7 = dn.getIDKType(var6 - 256).getChatHeadModel();
                  if (var7 != null) {
                     var9[var4++] = var7;
                  }
               }

               if (var6 >= 512) {
                  var7 = HeadbarUpdate.getObjType(var6 - 512).ah(this.au * 1693987821);
                  if (null != var7) {
                     var9[var4++] = var7;
                  }
               }
            }

            UnlitModel var10 = new UnlitModel(var9, var4);

            for(var6 = 0; var6 < 5; ++var6) {
               if (this.aw[var6] < ao[var6].length) {
                  var10.recolor(ay[var6], ao[var6][this.aw[var6]]);
               }

               if (this.aw[var6] < qv.ai[var6].length) {
                  var10.recolor(WorldMapIcon1.ax[var6], qv.ai[var6][this.aw[var6]]);
               }
            }

            return var10;
         }
      }
   }

   public int getChatHeadId() {
      return this.ab * -2131733097 == -1 ? (this.an[11] << 5) + (this.an[8] << 10) + (this.aw[0] << 25) + (this.aw[4] << 20) + (this.an[0] << 15) + this.an[1] : 305419896 + AbstractArchive.an_renamed(this.ab * -2131733097).ab * -1115372301;
   }

   void ax() {
      this.an(this.af, this.an, this.aw, 1693987821 * this.au, -2131733097 * this.ab);
   }
}
