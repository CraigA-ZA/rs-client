package org.bouncycastle.crypto.tls;

public class NamedCurve {
   public static boolean isValid(int var0) {
      return var0 >= 1 && var0 <= 28 || var0 >= 65281 && var0 <= 65282;
   }

   public static boolean refersToASpecificNamedCurve(int var0) {
      switch (var0) {
         case 65281:
         case 65282:
            return false;
         default:
            return true;
      }
   }
}
