public class rs extends rm {
   int ab = 0;
   int ac = 0;
   int af = 0;
   int an = 0;
   int au = 0;
   int aw = 0;

   public rs(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      super(var7, var8);
      this.af = var1 * -1673207349;
      this.an = var2 * 1707987953;
      this.aw = 1911990649 * var3;
      this.ac = 1745971459 * var4;
      this.au = var5 * -1112541267;
      this.ab = -233243325 * var6;
   }

   public int af() {
      double var2 = this.ay();
      return (int)Math.round((double)(this.ac * 886000043 - this.af * -932824093) * var2 + (double)(this.af * -932824093));
   }

   public int an() {
      double var2 = this.ay();
      return (int)Math.round(var2 * (double)(this.au * -322141147 - this.an * 832355601) + (double)(this.an * 832355601));
   }

   public int aw() {
      double var2 = this.ay();
      return (int)Math.round((double)(-659525431 * this.aw) + (double)(this.ab * 1604089707 - this.aw * -659525431) * var2);
   }
}
