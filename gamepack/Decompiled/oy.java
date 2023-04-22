public final class oy {
   static long[] an = new long[12];
   static final char[] base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
   static Varcs varcs;

   public static int af_renamed(int var0) {
      return var0 >>> 12;
   }

   static {
      for(int var0 = 0; var0 < an.length; ++var0) {
         an[var0] = (long)Math.pow(37.0, (double)var0);
      }

   }

   oy() throws Throwable {
      throw new Error();
   }

   static void itemContainerSetItem(int var0, int var1, int var2, int var3, byte var4) {
      Inventory var5 = (Inventory)Inventory.itemContainers.get((long)var0);
      if (var5 == null) {
         if (var4 <= -1) {
            throw new IllegalStateException();
         }

         var5 = new Inventory();
         Inventory.itemContainers.put(var5, (long)var0);
      }

      if (var5.ids.length <= var1) {
         int[] var6 = new int[var1 + 1];
         int[] var7 = new int[1 + var1];

         int var8;
         for(var8 = 0; var8 < var5.ids.length; ++var8) {
            if (var4 <= -1) {
               throw new IllegalStateException();
            }

            var6[var8] = var5.ids[var8];
            var7[var8] = var5.quantities[var8];
         }

         for(var8 = var5.ids.length; var8 < var1; ++var8) {
            if (var4 <= -1) {
               throw new IllegalStateException();
            }

            var6[var8] = -1;
            var7[var8] = 0;
         }

         var5.ids = var6;
         var5.quantities = var7;
      }

      var5.ids[var1] = var2;
      var5.quantities[var1] = var3;
   }
}
