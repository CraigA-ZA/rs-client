public class ff extends fb {
   int af;
   String an;
   // $FF: synthetic field
   final fa this$0;

   public static boolean aa_renamed(char var0) {
      return var0 >= '0' && var0 <= '9';
   }

   ff(fa var1) {
      this.this$0 = var1;
   }

   void write(Packet var1) {
      this.af = var1.g4s() * 710939539;
      this.an = var1.cw();
   }

   void an(fj var1) {
      var1.am(801047195 * this.af, this.an);
   }

   static final void jy_renamed(int var0, int var1, int var2, int var3, int var4) {
      long var6 = bx.scene.by(var0, var1, var2);
      int var8;
      int var9;
      int var10;
      int var11;
      int var13;
      int var14;
      if (var6 != 0L) {
         var8 = bx.scene.bk(var0, var1, var2, var6);
         var9 = var8 >> 6 & 3;
         var10 = var8 & 31;
         var11 = var3;
         if (gq.aw(var6)) {
            var11 = var4;
         }

         int[] var12 = UrlRequester.tk.af;
         var13 = (103 - var2) * 2048 + var1 * 4 + 24624;
         var14 = InterfaceParent.at(var6);
         hq var15 = fw.an_renamed(var14);
         if (-1 != var15.bk * 771086195) {
            IndexedSprite var16 = ml.ju[var15.bk * 771086195];
            if (var16 != null) {
               int var17 = (var15.av * -1064754148 - var16.subWidth) / 2;
               int var18 = (var15.ar * 1952358772 - var16.subHeight) / 2;
               var16.aw(var17 + 48 + var1 * 4, var18 + (104 - var2 - -1659393955 * var15.ar) * 4 + 48);
            }
         } else {
            if (0 == var10 || var10 == 2) {
               if (0 == var9) {
                  var12[var13] = var11;
                  var12[512 + var13] = var11;
                  var12[var13 + 1024] = var11;
                  var12[1536 + var13] = var11;
               } else if (var9 == 1) {
                  var12[var13] = var11;
                  var12[1 + var13] = var11;
                  var12[var13 + 2] = var11;
                  var12[3 + var13] = var11;
               } else if (2 == var9) {
                  var12[var13 + 3] = var11;
                  var12[512 + var13 + 3] = var11;
                  var12[3 + var13 + 1024] = var11;
                  var12[1536 + 3 + var13] = var11;
               } else if (var9 == 3) {
                  var12[var13 + 1536] = var11;
                  var12[1 + var13 + 1536] = var11;
                  var12[1536 + var13 + 2] = var11;
                  var12[1536 + var13 + 3] = var11;
               }
            }

            if (3 == var10) {
               if (var9 == 0) {
                  var12[var13] = var11;
               } else if (var9 == 1) {
                  var12[3 + var13] = var11;
               } else if (2 == var9) {
                  var12[var13 + 3 + 1536] = var11;
               } else if (3 == var9) {
                  var12[1536 + var13] = var11;
               }
            }

            if (var10 == 2) {
               if (3 == var9) {
                  var12[var13] = var11;
                  var12[var13 + 512] = var11;
                  var12[var13 + 1024] = var11;
                  var12[1536 + var13] = var11;
               } else if (var9 == 0) {
                  var12[var13] = var11;
                  var12[var13 + 1] = var11;
                  var12[var13 + 2] = var11;
                  var12[var13 + 3] = var11;
               } else if (var9 == 1) {
                  var12[3 + var13] = var11;
                  var12[512 + 3 + var13] = var11;
                  var12[var13 + 3 + 1024] = var11;
                  var12[var13 + 3 + 1536] = var11;
               } else if (2 == var9) {
                  var12[var13 + 1536] = var11;
                  var12[1 + 1536 + var13] = var11;
                  var12[2 + 1536 + var13] = var11;
                  var12[1536 + var13 + 3] = var11;
               }
            }
         }
      }

      var6 = bx.scene.bi(var0, var1, var2);
      if (var6 != 0L) {
         var8 = bx.scene.bk(var0, var1, var2, var6);
         var9 = var8 >> 6 & 3;
         var10 = var8 & 31;
         var11 = InterfaceParent.at(var6);
         hq var21 = fw.an_renamed(var11);
         int var25;
         if (-1 != var21.bk * 771086195) {
            IndexedSprite var23 = ml.ju[771086195 * var21.bk];
            if (var23 != null) {
               var14 = (-1064754148 * var21.av - var23.subWidth) / 2;
               var25 = (1952358772 * var21.ar - var23.subHeight) / 2;
               var23.aw(48 + var1 * 4 + var14, var25 + 4 * (104 - var2 - var21.ar * -1659393955) + 48);
            }
         } else if (var10 == 9) {
            var13 = 15658734;
            if (gq.aw(var6)) {
               var13 = 15597568;
            }

            int[] var24 = UrlRequester.tk.af;
            var25 = 24624 + var1 * 4 + (103 - var2) * 2048;
            if (0 != var9 && var9 != 2) {
               var24[var25] = var13;
               var24[1 + 512 + var25] = var13;
               var24[2 + var25 + 1024] = var13;
               var24[var25 + 1536 + 3] = var13;
            } else {
               var24[1536 + var25] = var13;
               var24[1 + var25 + 1024] = var13;
               var24[2 + var25 + 512] = var13;
               var24[3 + var25] = var13;
            }
         }
      }

      var6 = bx.scene.be(var0, var1, var2);
      if (0L != var6) {
         var8 = InterfaceParent.at(var6);
         hq var19 = fw.an_renamed(var8);
         if (var19.bk * 771086195 != -1) {
            IndexedSprite var20 = ml.ju[771086195 * var19.bk];
            if (null != var20) {
               var11 = (var19.av * -1064754148 - var20.subWidth) / 2;
               int var22 = (var19.ar * 1952358772 - var20.subHeight) / 2;
               var20.aw(var1 * 4 + 48 + var11, 48 + (104 - var2 - -1659393955 * var19.ar) * 4 + var22);
            }
         }
      }

   }
}
