package org.bouncycastle.math.field;

import org.bouncycastle.util.Arrays;

class GF2Polynomial implements Polynomial {
   public final int[] exponents;

   public boolean gq(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof GF2Polynomial)) {
         return false;
      } else {
         GF2Polynomial var2 = (GF2Polynomial)var1;
         return Arrays.areEqual(this.exponents, var2.exponents);
      }
   }

   public int getDegree() {
      return this.exponents[this.exponents.length - 1];
   }

   GF2Polynomial(int[] var1) {
      this.exponents = Arrays.clone(var1);
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof GF2Polynomial)) {
         return false;
      } else {
         GF2Polynomial var2 = (GF2Polynomial)var1;
         return Arrays.areEqual(this.exponents, var2.exponents);
      }
   }

   public boolean gm(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof GF2Polynomial)) {
         return false;
      } else {
         GF2Polynomial var2 = (GF2Polynomial)var1;
         return Arrays.areEqual(this.exponents, var2.exponents);
      }
   }

   public int hashCode() {
      return Arrays.hashCode(this.exponents);
   }

   public boolean gi(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof GF2Polynomial)) {
         return false;
      } else {
         GF2Polynomial var2 = (GF2Polynomial)var1;
         return Arrays.areEqual(this.exponents, var2.exponents);
      }
   }

   public int[] getExponentsPresent() {
      return Arrays.clone(this.exponents);
   }

   public boolean gk(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof GF2Polynomial)) {
         return false;
      } else {
         GF2Polynomial var2 = (GF2Polynomial)var1;
         return Arrays.areEqual(this.exponents, var2.exponents);
      }
   }

   public int ahh() {
      return Arrays.hashCode(this.exponents);
   }

   public int aht() {
      return Arrays.hashCode(this.exponents);
   }

   public int ahv() {
      return Arrays.hashCode(this.exponents);
   }
}
