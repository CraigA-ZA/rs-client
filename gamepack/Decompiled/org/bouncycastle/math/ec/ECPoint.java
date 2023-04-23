package org.bouncycastle.math.ec;

import java.math.BigInteger;
import java.util.Hashtable;

public abstract class ECPoint {
   public static ECFieldElement[] EMPTY_ZS = new ECFieldElement[0];
   public boolean withCompression;
   public Hashtable preCompTable;
   public ECCurve curve;
   public ECFieldElement x;
   public ECFieldElement y;
   public ECFieldElement[] zs;

   /** @deprecated */
   public boolean isCompressed() {
      return this.withCompression;
   }

   public ECPoint(ECCurve var1, ECFieldElement var2, ECFieldElement var3) {
      this(var1, var2, var3, getInitialZCoords(var1));
   }

   public boolean isValid() {
      if (this.isInfinity()) {
         return true;
      } else {
         ECCurve var1 = this.getCurve();
         if (var1 != null) {
            if (!this.satisfiesCurveEquation()) {
               return false;
            }

            if (!this.satisfiesCofactor()) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else {
         return !(var1 instanceof ECPoint) ? false : this.equals((ECPoint)var1);
      }
   }

   public abstract boolean satisfiesCurveEquation();

   public final ECPoint getDetachedPoint() {
      return this.normalize().detach();
   }

   public ECFieldElement getXCoord() {
      return this.x;
   }

   public boolean isNormalized() {
      int var1 = this.getCurveCoordinateSystem();
      return var1 == 0 || var1 == 5 || this.isInfinity() || this.zs[0].isOne();
   }

   public int getCurveCoordinateSystem() {
      return null == this.curve ? 0 : this.curve.getCoordinateSystem();
   }

   /** @deprecated */
   public ECFieldElement getX() {
      return this.normalize().getXCoord();
   }

   /** @deprecated */
   public ECFieldElement getY() {
      return this.normalize().getYCoord();
   }

   public ECFieldElement getZCoord(int var1) {
      return var1 >= 0 && var1 < this.zs.length ? this.zs[var1] : null;
   }

   public ECFieldElement getAffineYCoord() {
      this.checkNormalized();
      return this.getYCoord();
   }

   public ECPoint threeTimes() {
      return this.twicePlus(this);
   }

   public boolean satisfiesCofactor() {
      BigInteger var1 = this.curve.getCofactor();
      return var1 == null || var1.equals(ECConstants.ONE) || !ECAlgorithms.referenceMultiply(this, var1).isInfinity();
   }

   ECPoint normalize(ECFieldElement var1) {
      switch (this.getCurveCoordinateSystem()) {
         case 1:
         case 6:
            return this.createScaledPoint(var1, var1);
         case 2:
         case 3:
         case 4:
            ECFieldElement var2 = var1.square();
            ECFieldElement var3 = var2.multiply(var1);
            return this.createScaledPoint(var2, var3);
         case 5:
         default:
            throw new IllegalStateException("not a projective coordinate system");
      }
   }

   public ECFieldElement[] getZCoords() {
      int var1 = this.zs.length;
      if (var1 == 0) {
         return EMPTY_ZS;
      } else {
         ECFieldElement[] var2 = new ECFieldElement[var1];
         System.arraycopy(this.zs, 0, var2, 0, var1);
         return var2;
      }
   }

   public final ECFieldElement getRawXCoord() {
      return this.x;
   }

   public final ECFieldElement getRawYCoord() {
      return this.y;
   }

   public final ECFieldElement[] getRawZCoords() {
      return this.zs;
   }

   public ECFieldElement getYCoord() {
      return this.y;
   }

   public int aht() {
      ECCurve var1 = this.getCurve();
      int var2 = null == var1 ? 0 : ~var1.hashCode();
      if (!this.isInfinity()) {
         ECPoint var3 = this.normalize();
         var2 ^= var3.getXCoord().hashCode() * 17;
         var2 ^= var3.getYCoord().hashCode() * -767439614;
      }

      return var2;
   }

   public ECPoint normalize() {
      if (this.isInfinity()) {
         return this;
      } else {
         switch (this.getCurveCoordinateSystem()) {
            case 0:
            case 5:
               return this;
            default:
               ECFieldElement var1 = this.getZCoord(0);
               return var1.isOne() ? this : this.normalize(var1.invert());
         }
      }
   }

   public ECFieldElement getAffineXCoord() {
      this.checkNormalized();
      return this.getXCoord();
   }

   public ECPoint createScaledPoint(ECFieldElement var1, ECFieldElement var2) {
      return this.getCurve().createRawPoint(this.getRawXCoord().multiply(var1), this.getRawYCoord().multiply(var2), this.withCompression);
   }

   public abstract ECPoint detach();

   public String ahp() {
      if (this.isInfinity()) {
         return "INF";
      } else {
         StringBuffer var1 = new StringBuffer();
         var1.append('(');
         var1.append(this.getRawXCoord());
         var1.append(',');
         var1.append(this.getRawYCoord());

         for(int var2 = 0; var2 < this.zs.length; ++var2) {
            var1.append(',');
            var1.append(this.zs[var2]);
         }

         var1.append(')');
         return var1.toString();
      }
   }

   public static ECFieldElement[] getInitialZCoords(ECCurve var0) {
      int var1 = null == var0 ? 0 : var0.getCoordinateSystem();
      switch (var1) {
         case 0:
         case 5:
            return EMPTY_ZS;
         default:
            ECFieldElement var2 = var0.fromBigInteger(ECConstants.ONE);
            switch (var1) {
               case 1:
               case 2:
               case 6:
                  return new ECFieldElement[]{var2};
               case 3:
                  return new ECFieldElement[]{var2, var2, var2};
               case 4:
                  return new ECFieldElement[]{var2, var0.getA()};
               case 5:
               default:
                  throw new IllegalArgumentException("unknown coordinate system");
            }
      }
   }

   public ECPoint scaleX(ECFieldElement var1) {
      return this.isInfinity() ? this : this.getCurve().createRawPoint(this.getRawXCoord().multiply(var1), this.getRawYCoord(), this.getRawZCoords(), this.withCompression);
   }

   public ECPoint scaleY(ECFieldElement var1) {
      return this.isInfinity() ? this : this.getCurve().createRawPoint(this.getRawXCoord(), this.getRawYCoord().multiply(var1), this.getRawZCoords(), this.withCompression);
   }

   public boolean equals(ECPoint var1) {
      if (null == var1) {
         return false;
      } else {
         ECCurve var2 = this.getCurve();
         ECCurve var3 = var1.getCurve();
         boolean var4 = null == var2;
         boolean var5 = null == var3;
         boolean var6 = this.isInfinity();
         boolean var7 = var1.isInfinity();
         if (!var6 && !var7) {
            ECPoint var8 = this;
            ECPoint var9 = var1;
            if (!var4 || !var5) {
               if (var4) {
                  var9 = var1.normalize();
               } else if (var5) {
                  var8 = this.normalize();
               } else {
                  if (!var2.equals(var3)) {
                     return false;
                  }

                  ECPoint[] var10 = new ECPoint[]{this, var2.importPoint(var1)};
                  var2.normalizeAll(var10);
                  var8 = var10[0];
                  var9 = var10[1];
               }
            }

            return var8.getXCoord().equals(var9.getXCoord()) && var8.getYCoord().equals(var9.getYCoord());
         } else {
            return var6 && var7 && (var4 || var5 || var2.equals(var3));
         }
      }
   }

   public boolean isInfinity() {
      return this.x == null || this.y == null || this.zs.length > 0 && this.zs[0].isZero();
   }

   public int hashCode() {
      ECCurve var1 = this.getCurve();
      int var2 = null == var1 ? 0 : ~var1.hashCode();
      if (!this.isInfinity()) {
         ECPoint var3 = this.normalize();
         var2 ^= var3.getXCoord().hashCode() * 17;
         var2 ^= var3.getYCoord().hashCode() * 257;
      }

      return var2;
   }

   public String toString() {
      if (this.isInfinity()) {
         return "INF";
      } else {
         StringBuffer var1 = new StringBuffer();
         var1.append('(');
         var1.append(this.getRawXCoord());
         var1.append(',');
         var1.append(this.getRawYCoord());

         for(int var2 = 0; var2 < this.zs.length; ++var2) {
            var1.append(',');
            var1.append(this.zs[var2]);
         }

         var1.append(')');
         return var1.toString();
      }
   }

   /** @deprecated */
   public byte[] getEncoded() {
      return this.getEncoded(this.withCompression);
   }

   public byte[] getEncoded(boolean var1) {
      if (this.isInfinity()) {
         return new byte[1];
      } else {
         ECPoint var2 = this.normalize();
         byte[] var3 = var2.getXCoord().getEncoded();
         byte[] var4;
         if (var1) {
            var4 = new byte[var3.length + 1];
            var4[0] = (byte)(var2.getCompressionYTilde() ? 3 : 2);
            System.arraycopy(var3, 0, var4, 1, var3.length);
            return var4;
         } else {
            var4 = var2.getYCoord().getEncoded();
            byte[] var5 = new byte[var3.length + var4.length + 1];
            var5[0] = 4;
            System.arraycopy(var3, 0, var5, 1, var3.length);
            System.arraycopy(var4, 0, var5, var3.length + 1, var4.length);
            return var5;
         }
      }
   }

   public void checkNormalized() {
      if (!this.isNormalized()) {
         throw new IllegalStateException("point not in normal form");
      }
   }

   public abstract ECPoint add(ECPoint var1);

   public abstract ECPoint negate();

   public boolean gq(Object var1) {
      if (var1 == this) {
         return true;
      } else {
         return !(var1 instanceof ECPoint) ? false : this.equals((ECPoint)var1);
      }
   }

   public abstract boolean getCompressionYTilde();

   public ECPoint timesPow2(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException("'e' cannot be negative");
      } else {
         ECPoint var2 = this;

         while(true) {
            --var1;
            if (var1 < 0) {
               return var2;
            }

            var2 = var2.twice();
         }
      }
   }

   public ECPoint twicePlus(ECPoint var1) {
      return this.twice().add(var1);
   }

   public ECPoint(ECCurve var1, ECFieldElement var2, ECFieldElement var3, ECFieldElement[] var4) {
      this.preCompTable = null;
      this.curve = var1;
      this.x = var2;
      this.y = var3;
      this.zs = var4;
   }

   public ECPoint multiply(BigInteger var1) {
      return this.getCurve().getMultiplier().multiply(this, var1);
   }

   public boolean gm(Object var1) {
      if (var1 == this) {
         return true;
      } else {
         return !(var1 instanceof ECPoint) ? false : this.equals((ECPoint)var1);
      }
   }

   public boolean gi(Object var1) {
      if (var1 == this) {
         return true;
      } else {
         return !(var1 instanceof ECPoint) ? false : this.equals((ECPoint)var1);
      }
   }

   public abstract ECPoint twice();

   public boolean gk(Object var1) {
      if (var1 == this) {
         return true;
      } else {
         return !(var1 instanceof ECPoint) ? false : this.equals((ECPoint)var1);
      }
   }

   public int ahh() {
      ECCurve var1 = this.getCurve();
      int var2 = null == var1 ? 0 : ~var1.hashCode();
      if (!this.isInfinity()) {
         ECPoint var3 = this.normalize();
         var2 ^= var3.getXCoord().hashCode() * 17;
         var2 ^= var3.getYCoord().hashCode() * -640461118;
      }

      return var2;
   }

   public abstract ECPoint subtract(ECPoint var1);

   public int ahv() {
      ECCurve var1 = this.getCurve();
      int var2 = null == var1 ? 0 : ~var1.hashCode();
      if (!this.isInfinity()) {
         ECPoint var3 = this.normalize();
         var2 ^= var3.getXCoord().hashCode() * 17;
         var2 ^= var3.getYCoord().hashCode() * 257;
      }

      return var2;
   }

   public String ahm() {
      if (this.isInfinity()) {
         return "INF";
      } else {
         StringBuffer var1 = new StringBuffer();
         var1.append('(');
         var1.append(this.getRawXCoord());
         var1.append(',');
         var1.append(this.getRawYCoord());

         for(int var2 = 0; var2 < this.zs.length; ++var2) {
            var1.append(',');
            var1.append(this.zs[var2]);
         }

         var1.append((char)-434973862);
         return var1.toString();
      }
   }

   public String ahj() {
      if (this.isInfinity()) {
         return "INF";
      } else {
         StringBuffer var1 = new StringBuffer();
         var1.append((char)422073292);
         var1.append(this.getRawXCoord());
         var1.append((char)1743313637);
         var1.append(this.getRawYCoord());

         for(int var2 = 0; var2 < this.zs.length; ++var2) {
            var1.append((char)-2000760156);
            var1.append(this.zs[var2]);
         }

         var1.append(')');
         return var1.toString();
      }
   }

   public ECCurve getCurve() {
      return this.curve;
   }
}
