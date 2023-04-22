package org.bouncycastle.crypto.tls;

public class MaxFragmentLength {
   public static boolean isValid(short var0) {
      return var0 >= 1 && var0 <= 4;
   }
}
