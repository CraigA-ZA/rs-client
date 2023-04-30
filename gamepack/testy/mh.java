import accessors.RSSkills;

public class mh implements RSSkills {
   public static int[] aw = new int[99];
   public static final boolean[] an = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
   public static final int af = 25;

   mh() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "mh.<init>(" + ')');
      }
   }

   static {
      int var0 = 0;

      for(int var1 = 0; var1 < 99; ++var1) {
         int var2 = 1 + var1;
         int var3 = (int)((double)var2 + 300.0 * Math.pow(2.0, (double)var2 / 7.0));
         var0 += var3;
         aw[var1] = var0 / 4;
      }

   }
}
