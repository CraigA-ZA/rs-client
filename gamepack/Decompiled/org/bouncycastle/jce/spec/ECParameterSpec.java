package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

public class ECParameterSpec implements AlgorithmParameterSpec {
   byte[] seed;
   BigInteger h;
   BigInteger n;
   ECCurve curve;
   ECPoint G;

   public boolean gm(Object var1) {
      if (!(var1 instanceof ECParameterSpec)) {
         return false;
      } else {
         ECParameterSpec var2 = (ECParameterSpec)var1;
         return this.getCurve().equals(var2.getCurve()) && this.getG().equals(var2.getG());
      }
   }

   public ECParameterSpec(ECCurve var1, ECPoint var2, BigInteger var3, BigInteger var4) {
      this.curve = var1;
      this.G = var2.normalize();
      this.n = var3;
      this.h = var4;
      this.seed = null;
   }

   public ECParameterSpec(ECCurve var1, ECPoint var2, BigInteger var3, BigInteger var4, byte[] var5) {
      this.curve = var1;
      this.G = var2.normalize();
      this.n = var3;
      this.h = var4;
      this.seed = var5;
   }

   public ECCurve getCurve() {
      return this.curve;
   }

   public ECPoint getG() {
      return this.G;
   }

   public BigInteger getN() {
      return this.n;
   }

   public byte[] getSeed() {
      return this.seed;
   }

   public ECParameterSpec(ECCurve var1, ECPoint var2, BigInteger var3) {
      this.curve = var1;
      this.G = var2.normalize();
      this.n = var3;
      this.h = BigInteger.valueOf(1L);
      this.seed = null;
   }

   public int ahh() {
      return this.getCurve().hashCode() ^ this.getG().hashCode();
   }

   public int hashCode() {
      return this.getCurve().hashCode() ^ this.getG().hashCode();
   }

   public BigInteger getH() {
      return this.h;
   }

   public boolean gi(Object var1) {
      if (!(var1 instanceof ECParameterSpec)) {
         return false;
      } else {
         ECParameterSpec var2 = (ECParameterSpec)var1;
         return this.getCurve().equals(var2.getCurve()) && this.getG().equals(var2.getG());
      }
   }

   public boolean gq(Object var1) {
      if (!(var1 instanceof ECParameterSpec)) {
         return false;
      } else {
         ECParameterSpec var2 = (ECParameterSpec)var1;
         return this.getCurve().equals(var2.getCurve()) && this.getG().equals(var2.getG());
      }
   }

   public boolean gk(Object var1) {
      if (!(var1 instanceof ECParameterSpec)) {
         return false;
      } else {
         ECParameterSpec var2 = (ECParameterSpec)var1;
         return this.getCurve().equals(var2.getCurve()) && this.getG().equals(var2.getG());
      }
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof ECParameterSpec)) {
         return false;
      } else {
         ECParameterSpec var2 = (ECParameterSpec)var1;
         return this.getCurve().equals(var2.getCurve()) && this.getG().equals(var2.getG());
      }
   }

   public int aht() {
      return this.getCurve().hashCode() ^ this.getG().hashCode();
   }

   public int ahv() {
      return this.getCurve().hashCode() ^ this.getG().hashCode();
   }
}
