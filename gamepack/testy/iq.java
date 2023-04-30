import accessors.RSAABB;

public class iq implements RSAABB {
   int an;
   static md ci;
   public static final int ah = 65536;
   int ac;
   int aw;
   int ab;
   int af;
   int au;

   iq(int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         super();
         this.af = 1721407449 * var1;
         this.an = 1707404497 * var2;
         this.aw = -1533203909 * var3;
         this.ac = var4 * 2119680761;
         this.au = var5 * -2116275109;
         this.ab = var6 * 21950063;
      } catch (RuntimeException var7) {
         throw db.an(var7, "iq.<init>(" + ')');
      }
   }
}
