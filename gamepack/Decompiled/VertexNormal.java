public class VertexNormal {
   int ac;
   int af;
   int an;
   int aw;

   VertexNormal() {
   }

   VertexNormal(VertexNormal var1) {
      this.af = 1 * var1.af;
      this.an = 1 * var1.an;
      this.aw = var1.aw * 1;
      this.ac = 1 * var1.ac;
   }

   static int bs_renamed(int var0) {
      return (int)Math.pow(2.0, (double)((float)var0 / 256.0F + 7.0F));
   }
}
