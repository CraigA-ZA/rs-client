public class sx {
   int[] af = new int[8];
   short[] an = new short[8];

   public sx(hs var1) {
      int var2 = 0;
      if (var1.ai()) {
         var2 = var1.ag().length;
         System.arraycopy(var1.ag(), 0, this.af, 0, var2);
         System.arraycopy(var1.av(), 0, this.an, 0, var2);
      }

      for(int var3 = var2; var3 < 8; ++var3) {
         this.af[var3] = -1;
         this.an[var3] = -1;
      }

   }

   public int[] af() {
      return this.af;
   }

   public short[] an() {
      return this.an;
   }

   public void aw(int var1, int var2, short var3) {
      this.af[var1] = var2;
      this.an[var1] = var3;
   }

   public void ac(int[] var1, short[] var2) {
      this.af = var1;
      this.an = var2;
   }
}
