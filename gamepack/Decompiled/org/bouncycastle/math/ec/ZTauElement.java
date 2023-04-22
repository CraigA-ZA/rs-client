package org.bouncycastle.math.ec;

import java.math.BigInteger;

class ZTauElement {
   public final BigInteger v;
   public final BigInteger u;

   public ZTauElement(BigInteger var1, BigInteger var2) {
      this.u = var1;
      this.v = var2;
   }
}
