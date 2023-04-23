public class AnimBase extends Node {
   ic aa;
   int ab;
   int aq;
   int[] al;
   int[][] at;

   public AnimBase(int var1, byte[] var2) {
      this.ab = -185537285 * var1;
      Packet var3 = new Packet(var2);
      this.aq = var3.g1() * -714404747;
      this.al = new int[1158767581 * this.aq];
      this.at = new int[1158767581 * this.aq][];

      int var4;
      for(var4 = 0; var4 < this.aq * 1158767581; ++var4) {
         this.al[var4] = var3.g1();
      }

      for(var4 = 0; var4 < this.aq * 1158767581; ++var4) {
         this.at[var4] = new int[var3.g1()];
      }

      for(var4 = 0; var4 < 1158767581 * this.aq; ++var4) {
         for(int var5 = 0; var5 < this.at[var4].length; ++var5) {
            this.at[var4][var5] = var3.g1();
         }
      }

      if (-1633313603 * var3.at < var3.al.length) {
         var4 = var3.cl();
         if (var4 > 0) {
            this.aa = new ic(var3, var4);
         }
      }

   }

   public int af() {
      return this.aq * 1158767581;
   }

   public ic an() {
      return this.aa;
   }
}
