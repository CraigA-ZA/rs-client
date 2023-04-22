package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$AbstractFp;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

public class SecP160K1Curve extends ECCurve$AbstractFp {
   public SecP160K1Point infinity = new SecP160K1Point(this, (ECFieldElement)null, (ECFieldElement)null);
   public static final BigInteger q;

   public BigInteger getQ() {
      return q;
   }

   public ECPoint createRawPoint(ECFieldElement var1, ECFieldElement var2, ECFieldElement[] var3, boolean var4) {
      return new SecP160K1Point(this, var1, var2, var3, var4);
   }

   public boolean supportsCoordinateSystem(int var1) {
      switch (var1) {
         case 2:
            return true;
         default:
            return false;
      }
   }

   public ECPoint createRawPoint(ECFieldElement var1, ECFieldElement var2, boolean var3) {
      return new SecP160K1Point(this, var1, var2, var3);
   }

   public int getFieldSize() {
      return q.bitLength();
   }

   public ECFieldElement fromBigInteger(BigInteger var1) {
      return new SecP160R2FieldElement(var1);
   }

   public ECCurve cloneCurve() {
      return new SecP160K1Curve();
   }

   public SecP160K1Curve() {
      super(q);
      this.a = this.fromBigInteger(ECConstants.ZERO);
      this.b = this.fromBigInteger(BigInteger.valueOf(7L));
      this.order = new BigInteger(1, Hex.decode("0100000000000000000001B8FA16DFAB9ACA16B6B3"));
      this.cofactor = BigInteger.valueOf(1L);
      this.coord = 2;
   }

   public ECPoint getInfinity() {
      return this.infinity;
   }

   static {
      q = SecP160R2Curve.q;
   }
}
