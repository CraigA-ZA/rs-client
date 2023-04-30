public class qm {
   static final int[] ax = new int[2048];
   public static final int an = 2047;
   public static final double aw = 325.94932345220167;
   public static final int ac = 65536;
   public static final int ab = 512;
   public static final int aa = 1536;
   static final int[] ai = new int[2048];
   static final int af = 2048;

   qm() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "qm.<init>(" + ')');
      }
   }

   static {
      double var0 = 0.0030679615757712823;

      for(int var2 = 0; var2 < 2048; ++var2) {
         ax[var2] = (int)(65536.0 * Math.sin(var0 * (double)var2));
         ai[var2] = (int)(65536.0 * Math.cos((double)var2 * var0));
      }

   }
}
