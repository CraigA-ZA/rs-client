public class qr {
   float an;
   public static final int aq = 768;
   float aw;
   float af;
   static final String av = ",";

   final float ac() {
      return (float)Math.sqrt((double)(this.aw * this.aw + this.af * this.af + this.an * this.an));
   }

   final float af(byte var1) {
      try {
         return (float)Math.sqrt((double)(this.aw * this.aw + this.af * this.af + this.an * this.an));
      } catch (RuntimeException var2) {
         throw db.an(var2, "qr.af(" + ')');
      }
   }

   public String toString() {
      try {
         return this.af + ", " + this.an + ", " + this.aw;
      } catch (RuntimeException var1) {
         throw db.an(var1, "qr.toString(" + ')');
      }
   }

   static {
      new qr(0.0F, 0.0F, 0.0F);
      new qr(1.0F, 1.0F, 1.0F);
      new qr(1.0F, 0.0F, 0.0F);
      new qr(0.0F, 1.0F, 0.0F);
      new qr(0.0F, 0.0F, 1.0F);
   }

   public String ahm() {
      return this.af + ", " + this.an + ", " + this.aw;
   }

   public String ahj() {
      return this.af + ", " + this.an + ", " + this.aw;
   }

   public String ahp() {
      return this.af + ", " + this.an + ", " + this.aw;
   }

   final float an() {
      return (float)Math.sqrt((double)(this.aw * this.aw + this.af * this.af + this.an * this.an));
   }

   qr(float var1, float var2, float var3) {
      try {
         super();
         this.af = var1;
         this.an = var2;
         this.aw = var3;
      } catch (RuntimeException var4) {
         throw db.an(var4, "qr.<init>(" + ')');
      }
   }

   final float aw() {
      return (float)Math.sqrt((double)(this.aw * this.aw + this.af * this.af + this.an * this.an));
   }
}
