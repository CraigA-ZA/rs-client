package org.bouncycastle.util.encoders;

public class EncoderException extends IllegalStateException {
   Throwable cause;

   public Throwable getCause() {
      return this.cause;
   }

   EncoderException(String var1, Throwable var2) {
      super(var1);
      this.cause = var2;
   }
}
