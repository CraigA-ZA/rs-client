public class kn {
   static int[] ao;

   kn() throws Throwable {
      throw new Error();
   }

   static final int af_renamed(LoginType var0) {
      if (null == var0) {
         return 12;
      } else {
         switch (var0.aa * -874502107) {
            case 5:
               return 20;
            default:
               return 12;
         }
      }
   }

   public static void an_renamed(int var0, int var1) {
      VarBitType var3 = gs.an_renamed(var0);
      int var4 = 470400793 * var3.baseVar;
      int var5 = var3.startBit * 1050888611;
      int var6 = var3.endBit * 1130237503;
      int var7 = Varps.Varps_masks[var6 - var5];
      if (var1 < 0 || var1 > var7) {
         var1 = 0;
      }

      var7 <<= var5;
      Varps.Varps_main[var4] = Varps.Varps_main[var4] & ~var7 | var1 << var5 & var7;
   }
}
