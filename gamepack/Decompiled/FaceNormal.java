public class FaceNormal {
   public int an;
   public int aw;
   public int af;

   static void an_renamed(String[] var0, short[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var5 = (var2 + var3) / 2;
         int var6 = var2;
         String var7 = var0[var5];
         var0[var5] = var0[var3];
         var0[var3] = var7;
         short var8 = var1[var5];
         var1[var5] = var1[var3];
         var1[var3] = var8;

         for(int var9 = var2; var9 < var3; ++var9) {
            if (var7 == null || var0[var9] != null && var0[var9].compareTo(var7) < (var9 & 1)) {
               String var10 = var0[var9];
               var0[var9] = var0[var6];
               var0[var6] = var10;
               short var11 = var1[var9];
               var1[var9] = var1[var6];
               var1[var6++] = var11;
            }
         }

         var0[var3] = var0[var6];
         var0[var6] = var7;
         var1[var3] = var1[var6];
         var1[var6] = var8;
         an_renamed(var0, var1, var2, var6 - 1);
         an_renamed(var0, var1, var6 + 1, var3);
      }

   }

   FaceNormal() {
   }
}
