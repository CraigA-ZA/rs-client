package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class DHPrivateKeyParameters extends DHKeyParameters {
   BigInteger x;

   public int ahv() {
      return this.x.hashCode() ^ super.hashCode();
   }

   public BigInteger getX() {
      return this.x;
   }

   public boolean gq(Object var1) {
      if (!(var1 instanceof DHPrivateKeyParameters)) {
         return false;
      } else {
         DHPrivateKeyParameters var2 = (DHPrivateKeyParameters)var1;
         return var2.getX().equals(this.x) && super.equals(var1);
      }
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof DHPrivateKeyParameters)) {
         return false;
      } else {
         DHPrivateKeyParameters var2 = (DHPrivateKeyParameters)var1;
         return var2.getX().equals(this.x) && super.equals(var1);
      }
   }

   public boolean gm(Object var1) {
      if (!(var1 instanceof DHPrivateKeyParameters)) {
         return false;
      } else {
         DHPrivateKeyParameters var2 = (DHPrivateKeyParameters)var1;
         return var2.getX().equals(this.x) && super.equals(var1);
      }
   }

   public boolean gi(Object var1) {
      if (!(var1 instanceof DHPrivateKeyParameters)) {
         return false;
      } else {
         DHPrivateKeyParameters var2 = (DHPrivateKeyParameters)var1;
         return var2.getX().equals(this.x) && super.equals(var1);
      }
   }

   public int hashCode() {
      return this.x.hashCode() ^ super.hashCode();
   }

   public boolean gk(Object var1) {
      if (!(var1 instanceof DHPrivateKeyParameters)) {
         return false;
      } else {
         DHPrivateKeyParameters var2 = (DHPrivateKeyParameters)var1;
         return var2.getX().equals(this.x) && super.equals(var1);
      }
   }

   public int ahh() {
      return this.x.hashCode() ^ super.hashCode();
   }

   public int aht() {
      return this.x.hashCode() ^ super.hashCode();
   }

   public DHPrivateKeyParameters(BigInteger var1, DHParameters var2) {
      super(true, var2);
      this.x = var1;
   }
}
