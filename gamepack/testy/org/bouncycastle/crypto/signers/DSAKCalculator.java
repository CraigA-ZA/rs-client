package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;

public interface DSAKCalculator {
   void init(BigInteger var1, SecureRandom var2);

   boolean isDeterministic();

   void init(BigInteger var1, BigInteger var2, byte[] var3);

   BigInteger nextK();
}
