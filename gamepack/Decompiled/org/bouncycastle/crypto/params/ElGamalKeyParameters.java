package org.bouncycastle.crypto.params;

public class ElGamalKeyParameters extends AsymmetricKeyParameter {
   ElGamalParameters params;

   public int ahh() {
      return this.params != null ? this.params.hashCode() : 0;
   }

   public ElGamalKeyParameters(boolean var1, ElGamalParameters var2) {
      super(var1);
      this.params = var2;
   }

   public int hashCode() {
      return this.params != null ? this.params.hashCode() : 0;
   }

   public boolean gi(Object var1) {
      if (!(var1 instanceof ElGamalKeyParameters)) {
         return false;
      } else {
         ElGamalKeyParameters var2 = (ElGamalKeyParameters)var1;
         if (this.params == null) {
            return var2.getParameters() == null;
         } else {
            return this.params.equals(var2.getParameters());
         }
      }
   }

   public boolean gm(Object var1) {
      if (!(var1 instanceof ElGamalKeyParameters)) {
         return false;
      } else {
         ElGamalKeyParameters var2 = (ElGamalKeyParameters)var1;
         if (this.params == null) {
            return var2.getParameters() == null;
         } else {
            return this.params.equals(var2.getParameters());
         }
      }
   }

   public boolean gk(Object var1) {
      if (!(var1 instanceof ElGamalKeyParameters)) {
         return false;
      } else {
         ElGamalKeyParameters var2 = (ElGamalKeyParameters)var1;
         if (this.params == null) {
            return var2.getParameters() == null;
         } else {
            return this.params.equals(var2.getParameters());
         }
      }
   }

   public boolean gq(Object var1) {
      if (!(var1 instanceof ElGamalKeyParameters)) {
         return false;
      } else {
         ElGamalKeyParameters var2 = (ElGamalKeyParameters)var1;
         if (this.params == null) {
            return var2.getParameters() == null;
         } else {
            return this.params.equals(var2.getParameters());
         }
      }
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof ElGamalKeyParameters)) {
         return false;
      } else {
         ElGamalKeyParameters var2 = (ElGamalKeyParameters)var1;
         if (this.params == null) {
            return var2.getParameters() == null;
         } else {
            return this.params.equals(var2.getParameters());
         }
      }
   }

   public ElGamalParameters getParameters() {
      return this.params;
   }

   public int aht() {
      return this.params != null ? this.params.hashCode() : 0;
   }

   public int ahv() {
      return this.params != null ? this.params.hashCode() : 0;
   }
}
