package org.bouncycastle.crypto.tls;

public class HeartbeatMode {
   public static boolean isValid(short var0) {
      return var0 >= 1 && var0 <= 2;
   }
}
