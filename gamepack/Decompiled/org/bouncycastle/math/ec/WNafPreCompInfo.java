package org.bouncycastle.math.ec;

public class WNafPreCompInfo implements PreCompInfo {
   public ECPoint twice = null;
   public ECPoint[] preComp = null;
   public ECPoint[] preCompNeg = null;

   public ECPoint getTwice() {
      return this.twice;
   }

   public void setPreComp(ECPoint[] var1) {
      this.preComp = var1;
   }

   public ECPoint[] getPreCompNeg() {
      return this.preCompNeg;
   }

   public void setPreCompNeg(ECPoint[] var1) {
      this.preCompNeg = var1;
   }

   public void setTwice(ECPoint var1) {
      this.twice = var1;
   }

   public ECPoint[] getPreComp() {
      return this.preComp;
   }
}
