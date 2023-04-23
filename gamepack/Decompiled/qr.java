public class qr {
   float af;
   float an;
   float aw;

   static {
      new qr(0.0F, 0.0F, 0.0F);
      new qr(1.0F, 1.0F, 1.0F);
      new qr(1.0F, 0.0F, 0.0F);
      new qr(0.0F, 1.0F, 0.0F);
      new qr(0.0F, 0.0F, 1.0F);
   }

   qr(float var1, float var2, float var3) {
      this.af = var1;
      this.an = var2;
      this.aw = var3;
   }

   final float af() {
      return (float)Math.sqrt((double)(this.aw * this.aw + this.af * this.af + this.an * this.an));
   }

   public String toString() {
      return this.af + ", " + this.an + ", " + this.aw;
   }
}
