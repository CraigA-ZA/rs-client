public class td {
   int[] af;

   public td(int[] var1) {
      int var2;
      for(var2 = 1; var2 <= (var1.length >> 1) + var1.length; var2 <<= 1) {
      }

      this.af = new int[var2 + var2];

      int var3;
      for(var3 = 0; var3 < var2 + var2; ++var3) {
         this.af[var3] = -1;
      }

      int var4;
      for(var3 = 0; var3 < var1.length; this.af[var4 + var4 + 1] = var3++) {
         for(var4 = var1[var3] & var2 - 1; -1 != this.af[var4 + var4 + 1]; var4 = 1 + var4 & var2 - 1) {
         }

         this.af[var4 + var4] = var1[var3];
      }

   }

   public int af(int var1) {
      int var3 = (this.af.length >> 1) - 1;
      int var4 = var1 & var3;

      while(true) {
         int var5 = this.af[1 + var4 + var4];
         if (-1 == var5) {
            return -1;
         }

         if (this.af[var4 + var4] == var1) {
            return var5;
         }

         var4 = 1 + var4 & var3;
      }
   }
}
