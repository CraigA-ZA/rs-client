package org.bouncycastle.crypto;

public class CryptoException extends Exception {
   Throwable cause;

   public Throwable getCause() {
      return this.cause;
   }

   public CryptoException(String var1) {
      super(var1);
   }

   public CryptoException(String var1, Throwable var2) {
      super(var1);
      this.cause = var2;
   }

   public CryptoException() {
   }
}
