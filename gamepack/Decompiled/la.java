public class la {
   static int[] af;

   static {
      new Object();
      af = new int[33];
      af[0] = 0;
      int var0 = 2;

      for(int var1 = 1; var1 < 33; ++var1) {
         af[var1] = var0 - 1;
         var0 += var0;
      }

   }

   la() throws Throwable {
      throw new Error();
   }

   public static void ab_renamed() {
      if (NetCache.af != null) {
         NetCache.af.aq();
      }

   }
}
