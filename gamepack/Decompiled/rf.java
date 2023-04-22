public class rf extends rw {
   int af = 0;
   int an = 0;

   public rf(int var1, int var2, int var3, int var4) {
      super(var3, var4);
      this.af = -1209774779 * var1;
      this.an = var2 * -471908127;
   }

   public int af() {
      double var2 = this.ay();
      return (int)Math.round((double)(-17285747 * this.af) + (double)(-1288305887 * this.an - -17285747 * this.af) * var2);
   }
}
