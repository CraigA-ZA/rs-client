import accessors.RSFloorDecoration;

public final class ig implements RSFloorDecoration {
   int ab;
   int an;
   int aw;
   public iv ac;
   public long au;
   int af;

   static void iq(dv var0, int var1, int var2, int var3) {
      try {
         if (-1372355773 * var0.ct == var1 && var1 != -1) {
            if (var3 >= 145957899) {
               throw new IllegalStateException();
            }

            int var4 = dc.an(var1, (byte)124).be * 789159225;
            if (1 == var4) {
               if (var3 >= 145957899) {
                  return;
               }

               var0.cp = 0;
               var0.cd = 0;
               var0.dm = var2 * -401806131;
               var0.dw = 0;
            }

            if (2 == var4) {
               if (var3 >= 145957899) {
                  throw new IllegalStateException();
               }

               var0.dw = 0;
            }
         } else {
            if (-1 != var1) {
               if (var3 >= 145957899) {
                  throw new IllegalStateException();
               }

               if (var0.ct * -1372355773 != -1) {
                  if (var3 >= 145957899) {
                     throw new IllegalStateException();
                  }

                  if (dc.an(var1, (byte)20).az * -1932560049 < dc.an(-1372355773 * var0.ct, (byte)54).az * -1932560049) {
                     return;
                  }

                  if (var3 >= 145957899) {
                     return;
                  }
               }
            }

            var0.ct = var1 * -1690721941;
            var0.cp = 0;
            var0.cd = 0;
            var0.dm = var2 * -401806131;
            var0.dw = 0;
            var0.eo = var0.dn * -1718989897;
         }

      } catch (RuntimeException var5) {
         throw db.an(var5, "ig.iq(" + ')');
      }
   }

   static final int aw(int var0, int var1, int var2) {
      try {
         var1 = (var0 & 127) * var1 >> 7;
         if (var1 < 2) {
            if (var2 != 769773533) {
               throw new IllegalStateException();
            }

            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      } catch (RuntimeException var3) {
         throw db.an(var3, "ig.aw(" + ')');
      }
   }

   ig() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "ig.<init>(" + ')');
      }
   }

   static void am(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, byte var22) {
      try {
         in.aq.at(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
      } catch (RuntimeException var23) {
         throw db.an(var23, "ig.am(" + ')');
      }
   }
}
