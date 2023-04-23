package org.bouncycastle.crypto.params;

import org.bouncycastle.util.Arrays;

public class DHValidationParameters {
   byte[] seed;
   int counter;

   public int hashCode() {
      return this.counter ^ Arrays.hashCode(this.seed);
   }

   public int getCounter() {
      return this.counter;
   }

   public int ahh() {
      return this.counter ^ Arrays.hashCode(this.seed);
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof DHValidationParameters)) {
         return false;
      } else {
         DHValidationParameters var2 = (DHValidationParameters)var1;
         return var2.counter != this.counter ? false : Arrays.areEqual(this.seed, var2.seed);
      }
   }

   public byte[] getSeed() {
      return this.seed;
   }

   public boolean gm(Object var1) {
      if (!(var1 instanceof DHValidationParameters)) {
         return false;
      } else {
         DHValidationParameters var2 = (DHValidationParameters)var1;
         return var2.counter != this.counter ? false : Arrays.areEqual(this.seed, var2.seed);
      }
   }

   public DHValidationParameters(byte[] var1, int var2) {
      this.seed = var1;
      this.counter = var2;
   }

   public boolean gq(Object var1) {
      if (!(var1 instanceof DHValidationParameters)) {
         return false;
      } else {
         DHValidationParameters var2 = (DHValidationParameters)var1;
         return var2.counter != this.counter ? false : Arrays.areEqual(this.seed, var2.seed);
      }
   }

   public boolean gi(Object var1) {
      if (!(var1 instanceof DHValidationParameters)) {
         return false;
      } else {
         DHValidationParameters var2 = (DHValidationParameters)var1;
         return var2.counter != this.counter ? false : Arrays.areEqual(this.seed, var2.seed);
      }
   }

   public boolean gk(Object var1) {
      if (!(var1 instanceof DHValidationParameters)) {
         return false;
      } else {
         DHValidationParameters var2 = (DHValidationParameters)var1;
         return var2.counter != this.counter ? false : Arrays.areEqual(this.seed, var2.seed);
      }
   }

   public int aht() {
      return this.counter ^ Arrays.hashCode(this.seed);
   }

   public int ahv() {
      return this.counter ^ Arrays.hashCode(this.seed);
   }
}
