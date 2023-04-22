public class at {
   final int an;
   final int af;
   final String aw;

   int an() {
      return this.an;
   }

   at(Packet var1) {
      this(var1.g1(), var1.g1(), var1.cw());
   }

   at(int var1, int var2, String var3) {
      this.af = var1;
      this.an = var2;
      this.aw = var3;
   }

   String af() {
      return Integer.toHexString(this.af) + Integer.toHexString(this.an) + this.aw;
   }
}
