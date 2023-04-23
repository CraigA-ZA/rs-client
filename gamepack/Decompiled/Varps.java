public class Varps {
   public static int[] an;
   public static int[] aw;
   static int[] af = new int[32];

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         af[var1] = var0 - 1;
         var0 += var0;
      }

      an = new int[4000];
      aw = new int[4000];
   }

   Varps() throws Throwable {
      throw new Error();
   }
}
