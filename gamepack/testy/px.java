import accessors.RSTriBool;

public class px implements RSTriBool {
   static int cf;
   public static final px an = new px();
   public static final px aw = new px();
   static final int bg = 52;
   public static final px af = new px();
   static final int du = 13;

   px() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "px.<init>(" + ')');
      }
   }

   public static int ac(int var0, byte var1) {
      try {
         return qo.ab[var0 & 16383];
      } catch (RuntimeException var2) {
         throw db.an(var2, "px.ac(" + ')');
      }
   }
}
