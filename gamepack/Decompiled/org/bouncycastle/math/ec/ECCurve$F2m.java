package org.bouncycastle.math.ec;

import java.math.BigInteger;

public class ECCurve$F2m extends ECCurve$AbstractF2m {
   int m;
   int k1;
   ECPoint$F2m infinity;
   int k2;
   int k3;

   public int getM() {
      return this.m;
   }

   public ECCurve$F2m(int var1, int var2, BigInteger var3, BigInteger var4, BigInteger var5, BigInteger var6) {
      this(var1, var2, 0, 0, (BigInteger)var3, (BigInteger)var4, var5, var6);
   }

   public ECCurve$F2m(int var1, int var2, int var3, int var4, BigInteger var5, BigInteger var6) {
      this(var1, var2, var3, var4, (BigInteger)var5, (BigInteger)var6, (BigInteger)null, (BigInteger)null);
   }

   public ECCurve$F2m(int var1, int var2, int var3, int var4, BigInteger var5, BigInteger var6, BigInteger var7, BigInteger var8) {
      super(var1, var2, var3, var4);
      this.m = var1;
      this.k1 = var2;
      this.k2 = var3;
      this.k3 = var4;
      this.order = var7;
      this.cofactor = var8;
      this.infinity = new ECPoint$F2m(this, (ECFieldElement)null, (ECFieldElement)null);
      this.a = this.fromBigInteger(var5);
      this.b = this.fromBigInteger(var6);
      this.coord = 6;
   }

   public ECCurve$F2m(int var1, int var2, int var3, int var4, ECFieldElement var5, ECFieldElement var6, BigInteger var7, BigInteger var8) {
      super(var1, var2, var3, var4);
      this.m = var1;
      this.k1 = var2;
      this.k2 = var3;
      this.k3 = var4;
      this.order = var7;
      this.cofactor = var8;
      this.infinity = new ECPoint$F2m(this, (ECFieldElement)null, (ECFieldElement)null);
      this.a = var5;
      this.b = var6;
      this.coord = 6;
   }

   public ECCurve cloneCurve() {
      return new ECCurve$F2m(this.m, this.k1, this.k2, this.k3, this.a, this.b, this.order, this.cofactor);
   }

   public boolean supportsCoordinateSystem(int var1) {
      switch (var1) {
         case 0:
         case 1:
         case 6:
            return true;
         default:
            return false;
      }
   }

   public ECCurve$F2m(int var1, int var2, BigInteger var3, BigInteger var4) {
      this(var1, var2, 0, 0, (BigInteger)var3, (BigInteger)var4, (BigInteger)null, (BigInteger)null);
   }

   public int getFieldSize() {
      return this.m;
   }

   public ECFieldElement fromBigInteger(BigInteger var1) {
      return new ECFieldElement$F2m(this.m, this.k1, this.k2, this.k3, var1);
   }

   public ECPoint createRawPoint(ECFieldElement var1, ECFieldElement var2, boolean var3) {
      return new ECPoint$F2m(this, var1, var2, var3);
   }

   public ECPoint createRawPoint(ECFieldElement var1, ECFieldElement var2, ECFieldElement[] var3, boolean var4) {
      return new ECPoint$F2m(this, var1, var2, var3, var4);
   }

   public ECPoint getInfinity() {
      return this.infinity;
   }

   public int getK3() {
      return this.k3;
   }

   public boolean isTrinomial() {
      return this.k2 == 0 && this.k3 == 0;
   }

   public int getK1() {
      return this.k1;
   }

   public int getK2() {
      return this.k2;
   }

   public ECMultiplier createDefaultMultiplier() {
      return (ECMultiplier)(this.isKoblitz() ? new WTauNafMultiplier() : super.createDefaultMultiplier());
   }

   /** @deprecated */
   public BigInteger getN() {
      return this.order;
   }

   /** @deprecated */
   public BigInteger getH() {
      return this.cofactor;
   }
}
