public final class qx {
   static int an;
   static int aw;
   static qx[] af = new qx[0];
   float ac;
   float au;
   float ab;
   float aq;

   qx() {
      this.ab();
   }

   void ac(float var1, float var2, float var3, float var4) {
      this.ac = var1;
      this.au = var2;
      this.ab = var3;
      this.aq = var4;
   }

   public void au(float var1, float var2, float var3, float var4) {
      float var6 = (float)Math.sin((double)(0.5F * var4));
      float var7 = (float)Math.cos((double)(0.5F * var4));
      this.ac = var6 * var1;
      this.au = var6 * var2;
      this.ab = var3 * var6;
      this.aq = var7;
   }

   public final void aq(qx var1) {
      this.ac(var1.au * this.ab + var1.ac * this.aq + var1.aq * this.ac - this.au * var1.ab, var1.au * this.aq + (this.au * var1.aq - this.ab * var1.ac) + this.ac * var1.ab, this.ab * var1.aq + var1.ac * this.au - var1.au * this.ac + var1.ab * this.aq, this.aq * var1.aq - var1.ac * this.ac - this.au * var1.au - this.ab * var1.ab);
   }

   public String toString() {
      return this.ac + "," + this.au + "," + this.ab + "," + this.aq;
   }

   public int hashCode() {
      boolean var1 = true;
      float var2 = 1.0F;
      var2 = 31.0F * var2 + this.ac;
      var2 = 31.0F * var2 + this.au;
      var2 = 31.0F * var2 + this.ab;
      var2 = this.aq + 31.0F * var2;
      return (int)var2;
   }

   static {
      lw.af_renamed(100);
      new qx();
   }

   public void aw() {
      synchronized(af) {
         if (-2133937525 * aw < -1819670561 * an - 1) {
            af[(aw += 1732158755) * -2133937525 - 1] = this;
         }

      }
   }

   final void ab() {
      this.ab = 0.0F;
      this.au = 0.0F;
      this.ac = 0.0F;
      this.aq = 1.0F;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof qx)) {
         return false;
      } else {
         qx var2 = (qx)var1;
         return this.ac == var2.ac && this.au == var2.au && this.ab == var2.ab && var2.aq == this.aq;
      }
   }

   static float an_renamed(float[] var0, int var1, float var2) {
      float var4 = var0[var1];

      for(int var5 = var1 - 1; var5 >= 0; --var5) {
         var4 = var0[var5] + var4 * var2;
      }

      return var4;
   }
}
