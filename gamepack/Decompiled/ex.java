public class ex implements Enumerated {
   static MouseWheel mouseWheel;
   static int uo;
   static Sprite at;
   static final ex ac = new ex(3, 3);
   static final ex af = new ex(0, 0);
   static final ex an = new ex(1, 1);
   static final ex au = new ex(4, 4);
   static final ex aw = new ex(2, 2);
   final int ab;
   final int aq;

   static void aw_renamed(World[] var0, int var1, int var2, int[] var3, int[] var4) {
      if (var1 < var2) {
         int var6 = var1 - 1;
         int var7 = 1 + var2;
         int var8 = (var2 + var1) / 2;
         World var9 = var0[var8];
         var0[var8] = var0[var1];
         var0[var1] = var9;

         while(var6 < var7) {
            boolean var10 = true;

            int var11;
            int var12;
            int var13;
            do {
               --var7;

               for(var11 = 0; var11 < 4; ++var11) {
                  if (var3[var11] == 2) {
                     var12 = var0[var7].index * 1692771375;
                     var13 = 1692771375 * var9.index;
                  } else if (1 == var3[var11]) {
                     var12 = var0[var7].population * -1396846889;
                     var13 = var9.population * -1396846889;
                     if (var12 == -1 && var4[var11] == 1) {
                        var12 = 2001;
                     }

                     if (var13 == -1 && 1 == var4[var11]) {
                        var13 = 2001;
                     }
                  } else if (3 == var3[var11]) {
                     var12 = var0[var7].at() ? 1 : 0;
                     var13 = var9.at() ? 1 : 0;
                  } else {
                     var12 = var0[var7].id * -2091224171;
                     var13 = -2091224171 * var9.id;
                  }

                  if (var13 != var12) {
                     if ((var4[var11] != 1 || var12 <= var13) && (var4[var11] != 0 || var12 >= var13)) {
                        var10 = false;
                     }
                     break;
                  }

                  if (var11 == 3) {
                     var10 = false;
                  }
               }
            } while(var10);

            var10 = true;

            do {
               ++var6;

               for(var11 = 0; var11 < 4; ++var11) {
                  if (2 == var3[var11]) {
                     var12 = 1692771375 * var0[var6].index;
                     var13 = 1692771375 * var9.index;
                  } else if (var3[var11] == 1) {
                     var12 = var0[var6].population * -1396846889;
                     var13 = -1396846889 * var9.population;
                     if (-1 == var12 && 1 == var4[var11]) {
                        var12 = 2001;
                     }

                     if (-1 == var13 && var4[var11] == 1) {
                        var13 = 2001;
                     }
                  } else if (3 == var3[var11]) {
                     var12 = var0[var6].at() ? 1 : 0;
                     var13 = var9.at() ? 1 : 0;
                  } else {
                     var12 = var0[var6].id * -2091224171;
                     var13 = var9.id * -2091224171;
                  }

                  if (var12 != var13) {
                     if ((1 != var4[var11] || var12 >= var13) && (var4[var11] != 0 || var12 <= var13)) {
                        var10 = false;
                     }
                     break;
                  }

                  if (3 == var11) {
                     var10 = false;
                  }
               }
            } while(var10);

            if (var6 < var7) {
               World var24 = var0[var6];
               var0[var6] = var0[var7];
               var0[var7] = var24;
            }
         }

         aw_renamed(var0, var1, var7, var3, var4);
         aw_renamed(var0, 1 + var7, var2, var3, var4);
      }

   }

   ex(int var1, int var2) {
      this.ab = var1 * -1799886237;
      this.aq = var2 * 962359993;
   }

   public int ordinal() {
      return this.aq * 355070857;
   }
}
