package org.bouncycastle.crypto.params;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;

public class ParametersWithRandom implements CipherParameters {
   SecureRandom random;
   CipherParameters parameters;

   public ParametersWithRandom(CipherParameters var1) {
      this(var1, new SecureRandom());
   }

   public CipherParameters getParameters() {
      return this.parameters;
   }

   public SecureRandom getRandom() {
      return this.random;
   }

   public ParametersWithRandom(CipherParameters var1, SecureRandom var2) {
      this.random = var2;
      this.parameters = var1;
   }
}
