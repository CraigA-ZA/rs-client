import accessors.RSVertexNormal;

public class ib implements RSVertexNormal {
   int ac;
   int an;
   int aw;
   int af;
   static final int aq = 10;
   static final int dm = 1000;

   ib() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "ib.<init>(" + ')');
      }
   }

   ib(ib var1) {
      try {
         super();
         this.af = 1 * var1.af;
         this.an = 1 * var1.an;
         this.aw = var1.aw * 1;
         this.ac = 1 * var1.ac;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ib.<init>(" + ')');
      }
   }

   static int bs(int var0, int var1) {
      try {
         return (int)Math.pow(2.0, (double)((float)var0 / 256.0F + 7.0F));
      } catch (RuntimeException var2) {
         throw db.an(var2, "ib.bs(" + ')');
      }
   }
}
