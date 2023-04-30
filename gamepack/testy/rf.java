public class rf extends rw {
   int af;
   int an;

   public rf(int var1, int var2, int var3, int var4) {
      try {
         super(var3, var4);
         this.af = 0;
         this.an = 0;
         this.af = -1209774779 * var1;
         this.an = var2 * -471908127;
      } catch (RuntimeException var5) {
         throw db.an(var5, "rf.<init>(" + ')');
      }
   }

   public int af(int var1) {
      try {
         double var2 = this.ay(1089057010);
         return (int)Math.round((double)(-17285747 * this.af) + (double)(-1288305887 * this.an - -17285747 * this.af) * var2);
      } catch (RuntimeException var4) {
         throw db.an(var4, "rf.af(" + ')');
      }
   }

   public int an() {
      double var1 = this.ay(1089057010);
      return (int)Math.round((double)(-17285747 * this.af) + (double)(-1288305887 * this.an - -17285747 * this.af) * var1);
   }

   public int aw() {
      double var1 = this.ay(1089057010);
      return (int)Math.round((double)(-17285747 * this.af) + (double)(-1288305887 * this.an - -17285747 * this.af) * var1);
   }

   public int ac() {
      double var1 = this.ay(1089057010);
      return (int)Math.round((double)(-17285747 * this.af) + (double)(1188047352 * this.an - -435170628 * this.af) * var1);
   }
}
