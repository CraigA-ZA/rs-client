package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$AbstractFp;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

public class SecP384R1Curve extends ECCurve$AbstractFp {
   public static final BigInteger q = new BigInteger(1, Hex.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF"));
   public SecP384R1Point infinity = new SecP384R1Point(this, (ECFieldElement)null, (ECFieldElement)null);

   public ECCurve cloneCurve() {
      return new SecP384R1Curve();
   }

   public ECFieldElement fromBigInteger(BigInteger var1) {
      return new SecP384R1FieldElement(var1);
   }

   public boolean supportsCoordinateSystem(int var1) {
      switch (var1) {
         case 2:
            return true;
         default:
            return false;
      }
   }

   public BigInteger getQ() {
      return q;
   }

   public SecP384R1Curve() {
      super(q);
      this.a = this.fromBigInteger(new BigInteger(1, Hex.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC")));
      this.b = this.fromBigInteger(new BigInteger(1, Hex.decode("B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF")));
      this.order = new BigInteger(1, Hex.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973"));
      this.cofactor = BigInteger.valueOf(1L);
      this.coord = 2;
   }

   public ECPoint createRawPoint(ECFieldElement var1, ECFieldElement var2, boolean var3) {
      return new SecP384R1Point(this, var1, var2, var3);
   }

   public ECPoint createRawPoint(ECFieldElement var1, ECFieldElement var2, ECFieldElement[] var3, boolean var4) {
      return new SecP384R1Point(this, var1, var2, var3, var4);
   }

   public ECPoint getInfinity() {
      return this.infinity;
   }

   public int getFieldSize() {
      return q.bitLength();
   }
}
