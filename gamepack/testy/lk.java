public final class lk {
   static long af;
   static long an;

   lk() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "lk.<init>(" + ')');
      }
   }

   public static final synchronized long an() {
      long var0 = System.currentTimeMillis();
      if (var0 < af * 1436109859624790083L) {
         an += 4531959532299302581L * (af * 1436109859624790083L - var0);
      }

      af = -820153132959898517L * var0;
      return var0 + 5764352098133378973L * an;
   }

   static final void hg(int var0, int var1) {
      try {
         bx.hc(-919092771);
         switch (var0) {
            case 1:
               ii.aj((byte)92);
               break;
            case 2:
               ez.as(-560341895);
         }

      } catch (RuntimeException var2) {
         throw db.an(var2, "lk.hg(" + ')');
      }
   }
}
