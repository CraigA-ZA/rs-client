public class LoginProt implements ClientProt0 {
   public static final LoginProt ac = new LoginProt(18);
   public static final LoginProt af = new LoginProt(14);
   public static final LoginProt au = new LoginProt(19);
   public static final LoginProt aw = new LoginProt(16);
   static final LoginProt ab = new LoginProt(27);
   static final LoginProt an = new LoginProt(15);
   static final LoginProt[] al = new LoginProt[32];
   public final int id;

   static {
      LoginProt[] var0 = bz.af_renamed();

      for(int var1 = 0; var1 < var0.length; ++var1) {
         al[var0[var1].id * 537668749] = var0[var1];
      }

   }

   LoginProt(int var1) {
      this.id = var1 * 1990948421;
   }

   public static int aq_renamed(int var0) {
      int var2 = 0;
      if (var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var2 += 16;
      }

      if (var0 >= 256) {
         var0 >>>= 8;
         var2 += 8;
      }

      if (var0 >= 16) {
         var0 >>>= 4;
         var2 += 4;
      }

      if (var0 >= 4) {
         var0 >>>= 2;
         var2 += 2;
      }

      if (var0 >= 1) {
         var0 >>>= 1;
         ++var2;
      }

      return var0 + var2;
   }
}
