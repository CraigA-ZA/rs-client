public class lo {
   public int an;
   public static final int ad = 128;
   public int aw;
   public static final int au = 5;
   public int af;

   static void an(String[] var0, short[] var1, int var2, int var3, int var4) {
      try {
         if (var2 < var3) {
            if (var4 != 1826563573) {
               throw new IllegalStateException();
            }

            int var5 = (var2 + var3) / 2;
            int var6 = var2;
            String var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            short var8 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var8;

            for(int var9 = var2; var9 < var3; ++var9) {
               if (var4 != 1826563573) {
                  throw new IllegalStateException();
               }

               if (var7 != null) {
                  if (var4 != 1826563573) {
                     return;
                  }

                  if (var0[var9] == null) {
                     continue;
                  }

                  if (var4 != 1826563573) {
                     throw new IllegalStateException();
                  }

                  if (var0[var9].compareTo(var7) >= (var9 & 1)) {
                     continue;
                  }

                  if (var4 != 1826563573) {
                     throw new IllegalStateException();
                  }
               }

               String var10 = var0[var9];
               var0[var9] = var0[var6];
               var0[var6] = var10;
               short var11 = var1[var9];
               var1[var9] = var1[var6];
               var1[var6++] = var11;
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var8;
            an(var0, var1, var2, var6 - 1, 1826563573);
            an(var0, var1, var6 + 1, var3, 1826563573);
         }

      } catch (RuntimeException var12) {
         throw db.an(var12, "lo.an(" + ')');
      }
   }

   lo() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "lo.<init>(" + ')');
      }
   }
}
