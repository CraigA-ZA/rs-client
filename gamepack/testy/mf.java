public class mf {
   public static final int af = 8;
   static final int an = -3;
   public static final int aw = 16;

   mf() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "mf.<init>(" + ')');
      }
   }

   public static int an(int var0, int var1) {
      return (-3 - var0 << 8) + var1;
   }

   public static int aw(int var0, int var1) {
      return (-3 - var0 << 8) + var1;
   }
}
