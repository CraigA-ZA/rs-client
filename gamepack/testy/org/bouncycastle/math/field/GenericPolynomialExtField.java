package org.bouncycastle.math.field;

import java.math.BigInteger;
import org.bouncycastle.util.Integers;

class GenericPolynomialExtField implements PolynomialExtensionField {
   public final FiniteField subfield;
   public final Polynomial minimalPolynomial;

   public FiniteField getSubfield() {
      return this.subfield;
   }

   GenericPolynomialExtField(FiniteField var1, Polynomial var2) {
      this.subfield = var1;
      this.minimalPolynomial = var2;
   }

   public int getDimension() {
      return this.subfield.getDimension() * this.minimalPolynomial.getDegree();
   }

   public BigInteger getCharacteristic() {
      return this.subfield.getCharacteristic();
   }

   public int getDegree() {
      return this.minimalPolynomial.getDegree();
   }

   public Polynomial getMinimalPolynomial() {
      return this.minimalPolynomial;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof GenericPolynomialExtField)) {
         return false;
      } else {
         GenericPolynomialExtField var2 = (GenericPolynomialExtField)var1;
         return this.subfield.equals(var2.subfield) && this.minimalPolynomial.equals(var2.minimalPolynomial);
      }
   }

   public boolean gk(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof GenericPolynomialExtField)) {
         return false;
      } else {
         GenericPolynomialExtField var2 = (GenericPolynomialExtField)var1;
         return this.subfield.equals(var2.subfield) && this.minimalPolynomial.equals(var2.minimalPolynomial);
      }
   }

   public boolean gm(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof GenericPolynomialExtField)) {
         return false;
      } else {
         GenericPolynomialExtField var2 = (GenericPolynomialExtField)var1;
         return this.subfield.equals(var2.subfield) && this.minimalPolynomial.equals(var2.minimalPolynomial);
      }
   }

   public int hashCode() {
      return this.subfield.hashCode() ^ Integers.rotateLeft(this.minimalPolynomial.hashCode(), 16);
   }

   public boolean gq(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof GenericPolynomialExtField)) {
         return false;
      } else {
         GenericPolynomialExtField var2 = (GenericPolynomialExtField)var1;
         return this.subfield.equals(var2.subfield) && this.minimalPolynomial.equals(var2.minimalPolynomial);
      }
   }

   public boolean gi(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof GenericPolynomialExtField)) {
         return false;
      } else {
         GenericPolynomialExtField var2 = (GenericPolynomialExtField)var1;
         return this.subfield.equals(var2.subfield) && this.minimalPolynomial.equals(var2.minimalPolynomial);
      }
   }

   public int ahh() {
      return this.subfield.hashCode() ^ Integers.rotateLeft(this.minimalPolynomial.hashCode(), 16);
   }

   public int aht() {
      return this.subfield.hashCode() ^ Integers.rotateLeft(this.minimalPolynomial.hashCode(), 16);
   }

   public int ahv() {
      return this.subfield.hashCode() ^ Integers.rotateLeft(this.minimalPolynomial.hashCode(), 16);
   }
}
