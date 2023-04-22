package org.bouncycastle.math.ec;

public class ScaleXPointMap implements ECPointMap {
   public final ECFieldElement scale;

   public ScaleXPointMap(ECFieldElement var1) {
      this.scale = var1;
   }

   public ECPoint map(ECPoint var1) {
      return var1.scaleX(this.scale);
   }
}
