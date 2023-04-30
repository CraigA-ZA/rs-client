public class tf {
   public static final tf an = new tf(1);
   static final tf aw = new tf(2);
   static final tf af = new tf(0);
   public final int ac;

   public static tf aw(int var0) {
      tf[] var1 = new tf[]{af, aw, an};
      tf[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         tf var4 = var2[var3];
         if (var4.ac * 1843384107 == var0) {
            return var4;
         }
      }

      return null;
   }

   public static tf an(int var0) {
      tf[] var1 = new tf[]{af, aw, an};
      tf[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         tf var4 = var2[var3];
         if (var4.ac * 1843384107 == var0) {
            return var4;
         }
      }

      return null;
   }

   public static tf ac(int var0) {
      tf[] var1 = new tf[]{af, aw, an};
      tf[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         tf var4 = var2[var3];
         if (var4.ac * 1843384107 == var0) {
            return var4;
         }
      }

      return null;
   }

   tf(int var1) {
      try {
         super();
         this.ac = 1099200387 * var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "tf.<init>(" + ')');
      }
   }
}
