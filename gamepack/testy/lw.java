public class lw {
   static final int aw = 2;
   public static final int bs = 50;

   public static int aw(int var0, int var1, int var2) {
      var2 &= 3;
      if (var2 == 0) {
         return var0;
      } else if (1 == var2) {
         return var1;
      } else {
         return 2 == var2 ? 7 - var0 : 7 - var1;
      }
   }

   lw() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "lw.<init>(" + ')');
      }
   }

   public static int an(int var0, int var1, int var2) {
      var2 &= 3;
      if (var2 == 0) {
         return var0;
      } else if (1 == var2) {
         return var1;
      } else {
         return 2 == var2 ? 7 - var0 : 7 - var1;
      }
   }

   static void af(int var0, int var1) {
      try {
         qx.an = var0 * -1605864417;
         qx.af = new qx[var0];
         aw = 0;
      } catch (RuntimeException var2) {
         throw db.an(var2, "lw.af(" + ')');
      }
   }
}
