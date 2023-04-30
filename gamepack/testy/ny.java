import accessors.RSWorldComparator;
import java.util.Comparator;

final class ny implements Comparator, RSWorldComparator {
   static final int bt = 4;
   public static final int ax = 8;

   public int compare(Object var1, Object var2) {
      try {
         return this.af((nu)var1, (nu)var2, -1139417462);
      } catch (RuntimeException var3) {
         throw db.an(var3, "ny.compare(" + ')');
      }
   }

   int af(nu var1, nu var2, int var3) {
      try {
         byte var10000;
         if (var1.af * -39392873 < var2.af * -39392873) {
            if (var3 >= 1170972792) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else if (var2.af * -39392873 == -39392873 * var1.af) {
            if (var3 >= 1170972792) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = 1;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw db.an(var4, "ny.af(" + ')');
      }
   }

   public int au(Object var1, Object var2) {
      return this.af((nu)var1, (nu)var2, -404491769);
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw db.an(var2, "ny.equals(" + ')');
      }
   }

   public boolean gk(Object var1) {
      return super.equals(var1);
   }

   public int ab(Object var1, Object var2) {
      return this.af((nu)var1, (nu)var2, -1755360852);
   }

   public int aq(Object var1, Object var2) {
      return this.af((nu)var1, (nu)var2, -471985110);
   }

   public boolean gi(Object var1) {
      return super.equals(var1);
   }

   public boolean gm(Object var1) {
      return super.equals(var1);
   }

   public boolean gq(Object var1) {
      return super.equals(var1);
   }

   public int al(Object var1, Object var2) {
      return this.af((nu)var1, (nu)var2, 415922831);
   }

   int an(nu var1, nu var2) {
      return var1.af * -39392873 < var2.af * -1928230122 ? -1 : (var2.af * -814054554 == -1303186490 * var1.af ? 0 : 1);
   }
}
