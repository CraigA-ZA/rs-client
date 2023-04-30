import accessors.RSAttackOption;

public class mb implements nj, RSAttackOption {
   static final mb aw = new mb(1);
   static final mb af = new mb(-1);
   static final mb ac = new mb(2);
   static final mb an = new mb(0);
   final int au;

   public int ac() {
      return this.au * -1923877153;
   }

   public int af(int var1) {
      try {
         return this.au * -1923877153;
      } catch (RuntimeException var2) {
         throw db.an(var2, "mb.af(" + ')');
      }
   }

   mb(int var1) {
      try {
         super();
         this.au = 521487647 * var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "mb.<init>(" + ')');
      }
   }

   public int an() {
      return this.au * -1923877153;
   }

   public static mb[] aq() {
      return new mb[]{af, ac, an, aw};
   }

   public int aw() {
      return this.au * 349092197;
   }

   public static mb[] ab() {
      return new mb[]{af, ac, an, aw};
   }
}
