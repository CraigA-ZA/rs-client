public class ic {
   ew[] an;
   int aw;

   ic(Packet var1, int var2) {
      this.an = new ew[var2];
      this.aw = var1.g1() * -265983497;

      for(int var3 = 0; var3 < this.an.length; ++var3) {
         ew var4 = new ew(this.aw * 1558849479, var1, false);
         this.an[var3] = var4;
      }

      this.af();
   }

   void af() {
      ew[] var2 = this.an;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         ew var4 = var2[var3];
         if (875758789 * var4.af >= 0) {
            var4.an = this.an[var4.af * 875758789];
         }
      }

   }

   public int an() {
      return this.an.length;
   }

   ew aw(int var1) {
      return var1 >= this.an() ? null : this.an[var1];
   }

   ew[] ac() {
      return this.an;
   }

   void au(fh var1, int var2) {
      this.ab(var1, var2, (boolean[])null, false);
   }

   void ab(fh var1, int var2, boolean[] var3, boolean var4) {
      int var6 = var1.ac();
      int var7 = 0;
      ew[] var8 = this.ac();

      for(int var9 = 0; var9 < var8.length; ++var9) {
         ew var10 = var8[var9];
         if (var3 == null || var4 == var3[var7]) {
            var1.ab(var2, var10, var7, var6);
         }

         ++var7;
      }

   }
}
