public class AABB {
   static ServerBuild serverBuild;
   int zMidOffset;
   int xMidOffset;
   int xMid;
   int yMid;
   int yMidOffset;
   int zMid;

   AABB(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.xMid = 1721407449 * var1;
      this.yMid = 1707404497 * var2;
      this.zMid = -1533203909 * var3;
      this.xMidOffset = var4 * 2119680761;
      this.yMidOffset = var5 * -2116275109;
      this.zMidOffset = var6 * 21950063;
   }
}
