public class AnimBase extends Node {
   int id;
   int transformCount;
   int[] transformTypes;
   ic aa;
   int[][] transformLabels;

   public int af() {
      return this.id * 1158767581;
   }

   public ic an() {
      return this.aa;
   }

   public AnimBase(int var1, byte[] var2) {
      this.transformCount = -185537285 * var1;
      Packet var3 = new Packet(var2);
      this.id = var3.g1() * -714404747;
      this.transformTypes = new int[1158767581 * this.id];
      this.transformLabels = new int[1158767581 * this.id][];

      int var4;
      for(var4 = 0; var4 < this.id * 1158767581; ++var4) {
         this.transformTypes[var4] = var3.g1();
      }

      for(var4 = 0; var4 < this.id * 1158767581; ++var4) {
         this.transformLabels[var4] = new int[var3.g1()];
      }

      for(var4 = 0; var4 < 1158767581 * this.id; ++var4) {
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
}
