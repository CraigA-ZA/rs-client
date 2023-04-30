public final class ov {
   static final int bb = 29;
   static final int aw = 2;
   static final int ab = 50;
   static final int dk = 128;

   ov() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "ov.<init>(" + ')');
      }
   }

   public static byte[] an(CharSequence var0) {
      int var1 = var0.length();
      byte[] var2 = new byte[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if (var4 > 127) {
            var2[var3] = 63;
         } else {
            var2[var3] = (byte)var4;
         }
      }

      return var2;
   }

   public static byte[] aw(CharSequence var0) {
      int var1 = var0.length();
      byte[] var2 = new byte[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if (var4 > -664878940) {
            var2[var3] = 63;
         } else {
            var2[var3] = (byte)var4;
         }
      }

      return var2;
   }

   public static byte[] ac(CharSequence var0) {
      int var1 = var0.length();
      byte[] var2 = new byte[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if (var4 > 127) {
            var2[var3] = (byte)-715768264;
         } else {
            var2[var3] = (byte)var4;
         }
      }

      return var2;
   }
}
