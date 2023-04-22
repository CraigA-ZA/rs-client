package org.bouncycastle.crypto.tls;

public class CipherSuite {
   public static boolean isSCSV(int var0) {
      switch (var0) {
         case 255:
         case 22016:
            return true;
         default:
            return false;
      }
   }
}
