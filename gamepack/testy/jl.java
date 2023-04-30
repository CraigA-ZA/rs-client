public class jl {
   final int aw;
   final int an;
   final int af;
   static final int ac = 1;

   jl(int var1, int var2, int var3) {
      try {
         super();
         this.af = 1358143841 * var1;
         this.an = var2 * 1865707777;
         this.aw = var3 * 1079176927;
      } catch (RuntimeException var4) {
         throw db.an(var4, "jl.<init>(" + ')');
      }
   }

   static final void ij(String var0, boolean var1, int var2) {
      try {
         if (client.mj) {
            byte var3 = 4;
            int var4 = var3 + 6;
            int var5 = var3 + 6;
            int var6 = je.io.ai(var0, 250);
            int var7 = je.io.ag(var0, 250) * 13;
            th.em(var4 - var3, var5 - var3, var3 + var3 + var6, var3 + var3 + var7, 0);
            th.ek(var4 - var3, var5 - var3, var6 + var3 + var3, var7 + var3 + var3, 16777215);
            je.io.ak(var0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
            int var8 = var4 - var3;
            int var9 = var5 - var3;
            int var10 = var6 + var3 + var3;
            int var11 = var3 + var7 + var3;

            for(int var12 = 0; var12 < -356793645 * client.rr; ++var12) {
               if (var2 == -1957273559) {
                  return;
               }

               if (client.ra[var12] + client.rh[var12] > var8) {
                  if (var2 == -1957273559) {
                     throw new IllegalStateException();
                  }

                  if (client.rh[var12] < var10 + var8) {
                     if (var2 == -1957273559) {
                        return;
                     }

                     if (client.rb[var12] + client.ri[var12] > var9) {
                        if (var2 == -1957273559) {
                           throw new IllegalStateException();
                        }

                        if (client.rb[var12] < var9 + var11) {
                           client.rf[var12] = true;
                        }
                     }
                  }
               }
            }

            if (var1) {
               ia.bn.an(0, 0, 1570141358);
            } else {
               ps.ki(var4, var5, var6, var7, -1848509736);
            }

         }
      } catch (RuntimeException var13) {
         throw db.an(var13, "jl.ij(" + ')');
      }
   }
}
