public class qm {
   static final int[] ai = new int[2048];
   static final int[] ax = new int[2048];

   static {
      double var0 = 0.0030679615757712823;

      for(int var2 = 0; var2 < 2048; ++var2) {
         ax[var2] = (int)(65536.0 * Math.sin(var0 * (double)var2));
         ai[var2] = (int)(65536.0 * Math.cos((double)var2 * var0));
      }

   }

   qm() throws Throwable {
      throw new Error();
   }
}
