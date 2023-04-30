public class qo {
   static IndexedSprite aq;
   static final int[] ab = new int[16384];
   static final int[] au = new int[16384];

   static {
      double var0 = 3.834951969714103E-4;

      for(int var2 = 0; var2 < 16384; ++var2) {
         au[var2] = (int)(16384.0 * Math.sin(var0 * (double)var2));
         ab[var2] = (int)(16384.0 * Math.cos(var0 * (double)var2));
      }

   }

   qo() throws Throwable {
      throw new Error();
   }
}
