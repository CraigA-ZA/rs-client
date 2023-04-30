public class rs extends rm {
   int ac;
   int af;
   int aw;
   int ab;
   int au;
   int an;

   public int au() {
      double var1 = this.ay(1089057010);
      return (int)Math.round(var1 * (double)(this.au * -1133492170 - this.an * 629390841) + (double)(this.an * -218179973));
   }

   public int at() {
      double var1 = this.ay(1089057010);
      return (int)Math.round((double)(81359788 * this.aw) + (double)(this.ab * 1604089707 - this.aw * -659525431) * var1);
   }

   public int an(int var1) {
      try {
         double var2 = this.ay(1089057010);
         return (int)Math.round(var2 * (double)(this.au * -322141147 - this.an * 832355601) + (double)(this.an * 832355601));
      } catch (RuntimeException var4) {
         throw db.an(var4, "rs.an(" + ')');
      }
   }

   public int aw(byte var1) {
      try {
         double var2 = this.ay(1089057010);
         return (int)Math.round((double)(-659525431 * this.aw) + (double)(this.ab * 1604089707 - this.aw * -659525431) * var2);
      } catch (RuntimeException var4) {
         throw db.an(var4, "rs.aw(" + ')');
      }
   }

   public int ac() {
      double var1 = this.ay(1089057010);
      return (int)Math.round((double)(this.ac * 117192587 - this.af * -2105750034) * var1 + (double)(this.af * -932824093));
   }

   public int af(int var1) {
      try {
         double var2 = this.ay(1089057010);
         return (int)Math.round((double)(this.ac * 886000043 - this.af * -932824093) * var2 + (double)(this.af * -932824093));
      } catch (RuntimeException var4) {
         throw db.an(var4, "rs.af(" + ')');
      }
   }

   public int ab() {
      double var1 = this.ay(1089057010);
      return (int)Math.round(var1 * (double)(this.au * -322141147 - this.an * 832355601) + (double)(this.an * 832355601));
   }

   public int aq() {
      double var1 = this.ay(1089057010);
      return (int)Math.round(var1 * (double)(this.au * -322141147 - this.an * 832355601) + (double)(this.an * 832355601));
   }

   public int al() {
      double var1 = this.ay(1089057010);
      return (int)Math.round((double)(-659525431 * this.aw) + (double)(this.ab * 1604089707 - this.aw * -659525431) * var1);
   }

   public rs(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         super(var7, var8);
         this.af = 0;
         this.an = 0;
         this.aw = 0;
         this.ac = 0;
         this.au = 0;
         this.ab = 0;
         this.af = var1 * -1673207349;
         this.an = var2 * 1707987953;
         this.aw = 1911990649 * var3;
         this.ac = 1745971459 * var4;
         this.au = var5 * -1112541267;
         this.ab = -233243325 * var6;
      } catch (RuntimeException var9) {
         throw db.an(var9, "rs.<init>(" + ')');
      }
   }
}
