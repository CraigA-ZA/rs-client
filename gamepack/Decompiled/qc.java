public class qc {
   static Archive archive4;
   float aa;
   float ab;
   float ac;
   float af;
   float al;
   float an;
   float ao;
   float aq;
   float at;
   float au;
   float aw;
   float ay;

   static {
      new qc();
   }

   qc() {
      this.af();
   }

   void af() {
      this.ao = 0.0F;
      this.ay = 0.0F;
      this.aa = 0.0F;
      this.al = 0.0F;
      this.aq = 0.0F;
      this.ab = 0.0F;
      this.ac = 0.0F;
      this.aw = 0.0F;
      this.an = 0.0F;
      this.at = 1.0F;
      this.au = 1.0F;
      this.af = 1.0F;
   }

   void an(float var1) {
      float var3 = (float)Math.cos((double)var1);
      float var4 = (float)Math.sin((double)var1);
      float var5 = this.an;
      float var6 = this.au;
      float var7 = this.al;
      float var8 = this.ay;
      this.an = var5 * var3 - this.aw * var4;
      this.aw = this.aw * var3 + var4 * var5;
      this.au = var3 * var6 - var4 * this.ab;
      this.ab = this.ab * var3 + var6 * var4;
      this.al = var7 * var3 - var4 * this.at;
      this.at = this.at * var3 + var4 * var7;
      this.ay = var3 * var8 - this.ao * var4;
      this.ao = var4 * var8 + var3 * this.ao;
   }

   void aw(float var1) {
      float var3 = (float)Math.cos((double)var1);
      float var4 = (float)Math.sin((double)var1);
      float var5 = this.af;
      float var6 = this.ac;
      float var7 = this.aq;
      float var8 = this.aa;
      this.af = var4 * this.aw + var3 * var5;
      this.aw = var3 * this.aw - var5 * var4;
      this.ac = var4 * this.ab + var6 * var3;
      this.ab = this.ab * var3 - var6 * var4;
      this.aq = var4 * this.at + var3 * var7;
      this.at = this.at * var3 - var4 * var7;
      this.aa = var3 * var8 + var4 * this.ao;
      this.ao = var3 * this.ao - var8 * var4;
   }

   void ac(float var1) {
      float var3 = (float)Math.cos((double)var1);
      float var4 = (float)Math.sin((double)var1);
      float var5 = this.af;
      float var6 = this.ac;
      float var7 = this.aq;
      float var8 = this.aa;
      this.af = var5 * var3 - this.an * var4;
      this.an = var3 * this.an + var5 * var4;
      this.ac = var6 * var3 - this.au * var4;
      this.au = var4 * var6 + var3 * this.au;
      this.aq = var3 * var7 - this.al * var4;
      this.al = var3 * this.al + var4 * var7;
      this.aa = var3 * var8 - var4 * this.ay;
      this.ay = var3 * this.ay + var4 * var8;
   }

   void au(float var1, float var2, float var3) {
      this.aa += var1;
      this.ay += var2;
      this.ao += var3;
   }

   public String toString() {
      return this.af + "," + this.ac + "," + this.aq + "," + this.aa + "\n" + this.an + "," + this.au + "," + this.al + "," + this.ay + "\n" + this.aw + "," + this.ab + "," + this.at + "," + this.ao;
   }

   static final void ns_renamed(int var0, int var1, int var2, int var3, Sprite var4, SpriteMask var5) {
      if (var4 != null) {
         int var7 = Client.kf * 704283033 & 2047;
         int var8 = var3 * var3 + var2 * var2;
         if (var8 <= 6400) {
            int var9 = Rasterizer3D.ac[var7];
            int var10 = Rasterizer3D.au[var7];
            int var11 = var2 * var10 + var3 * var9 >> 16;
            int var12 = var3 * var10 - var9 * var2 >> 16;
            if (var8 > 2500) {
               var4.bi(var5.height * 1484188043 / 2 + var11 - var4.width / 2, var5.width * 939947663 / 2 - var12 - var4.height / 2, var0, var1, 1484188043 * var5.height, 939947663 * var5.width, var5.xStarts, var5.xWidths);
            } else {
               var4.ax(var11 + var0 + var5.height * 1484188043 / 2 - var4.width / 2, 939947663 * var5.width / 2 + var1 - var12 - var4.height / 2);
            }

         }
      }
   }
}
