package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class RSAPrivateCrtKeyParameters extends RSAKeyParameters {
   BigInteger q;
   BigInteger p;
   BigInteger dQ;
   BigInteger dP;
   BigInteger e;
   BigInteger qInv;

   public BigInteger getDQ() {
      return this.dQ;
   }

   public BigInteger getP() {
      return this.p;
   }

   public RSAPrivateCrtKeyParameters(BigInteger var1, BigInteger var2, BigInteger var3, BigInteger var4, BigInteger var5, BigInteger var6, BigInteger var7, BigInteger var8) {
      super(true, var1, var3);
      this.e = var2;
      this.p = var4;
      this.q = var5;
      this.dP = var6;
      this.dQ = var7;
      this.qInv = var8;
   }

   public BigInteger getQ() {
      return this.q;
   }

   public BigInteger getDP() {
      return this.dP;
   }

   public BigInteger getQInv() {
      return this.qInv;
   }

   public BigInteger getPublicExponent() {
      return this.e;
   }
}
