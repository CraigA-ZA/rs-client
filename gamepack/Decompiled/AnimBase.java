public class AnimBase extends Node {
   ic aa;
   int id;
   int transformCount;
   int[] transformTypes;
   int[][] transformLabels;

   public AnimBase(int var1, byte[] var2) {
      this.id = -185537285 * var1;
      Packet var3 = new Packet(var2);
      this.transformCount = var3.g1() * -714404747;
      this.transformTypes = new int[1158767581 * this.transformCount];
      this.transformLabels = new int[1158767581 * this.transformCount][];

      int var4;
      for(var4 = 0; var4 < this.transformCount * 1158767581; ++var4) {
         this.transformTypes[var4] = var3.g1();
      }

      for(var4 = 0; var4 < this.transformCount * 1158767581; ++var4) {
         this.transformLabels[var4] = new int[var3.g1()];
      }

      for(var4 = 0; var4 < 1158767581 * this.transformCount; ++var4) {
         for(int var5 = 0; var5 < this.transformLabels[var4].length; ++var5) {
            this.transformLabels[var4][var5] = var3.g1();
         }
      }

      if (-1633313603 * var3.index < var3.array.length) {
         var4 = var3.cl();
         if (var4 > 0) {
            this.aa = new ic(var3, var4);
         }
      }

   }

   public int af() {
      return this.transformCount * 1158767581;
   }

   public ic an() {
      return this.aa;
   }
}
