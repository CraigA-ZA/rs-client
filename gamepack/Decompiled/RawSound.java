public class RawSound extends AbstractSound {
   int ac;
   public boolean au;
   public byte[] an;
   public int af;
   public int aw;

   RawSound(int var1, byte[] var2, int var3, int var4) {
      this.af = var1;
      this.an = var2;
      this.aw = var3;
      this.ac = var4;
   }

   RawSound(int var1, byte[] var2, int var3, int var4, boolean var5) {
      this.af = var1;
      this.an = var2;
      this.aw = var3;
      this.ac = var4;
      this.au = var5;
   }

   public RawSound resample(Decimator var1) {
      this.an = var1.resample(this.an);
      this.af = var1.scaleRate(this.af);
      if (this.aw == this.ac) {
         this.aw = this.ac = var1.scalePosition(this.aw);
      } else {
         this.aw = var1.scalePosition(this.aw);
         this.ac = var1.scalePosition(this.ac);
         if (this.aw == this.ac) {
            --this.aw;
         }
      }

      return this;
   }
}
