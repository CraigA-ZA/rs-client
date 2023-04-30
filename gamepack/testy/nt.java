import accessors.RSUnitPriceComparator;
import java.util.Comparator;

final class nt implements Comparator, RSUnitPriceComparator {
   static final float fe = 200.0F;
   static nd fu;

   public int ab(Object var1, Object var2) {
      return this.af((nu)var1, (nu)var2, -411750205);
   }

   int af(nu var1, nu var2, int var3) {
      try {
         byte var10000;
         if (var1.aw.aw * -1994102707 < var2.aw.aw * -1994102707) {
            var10000 = -1;
         } else if (var2.aw.aw * -1994102707 == var1.aw.aw * -1994102707) {
            if (var3 != -411750205) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = 1;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw db.an(var4, "nt.af(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.af((nu)var1, (nu)var2, -411750205);
      } catch (RuntimeException var3) {
         throw db.an(var3, "nt.compare(" + ')');
      }
   }

   int aw(nu var1, nu var2) {
      return var1.aw.aw * -1994102707 < var2.aw.aw * -1994102707 ? -1 : (var2.aw.aw * -1994102707 == var1.aw.aw * -1874545678 ? 0 : 1);
   }

   int aa(nu var1, nu var2) {
      return var1.aw.aw * -1994102707 < var2.aw.aw * -1994102707 ? -1 : (var2.aw.aw * -1994102707 == var1.aw.aw * -1994102707 ? 0 : 1);
   }

   public static int af(int var0, int var1) {
      try {
         if (0 != var0) {
            if (var1 == -2028669797) {
               throw new IllegalStateException();
            }

            if (var0 != 1) {
               return -1;
            }

            if (var1 == -2028669797) {
               throw new IllegalStateException();
            }
         }

         return 0;
      } catch (RuntimeException var2) {
         throw db.an(var2, "nt.af(" + ')');
      }
   }

   public int aq(Object var1, Object var2) {
      return this.af((nu)var1, (nu)var2, -411750205);
   }

   public int al(Object var1, Object var2) {
      return this.af((nu)var1, (nu)var2, -411750205);
   }

   public boolean gm(Object var1) {
      return super.equals(var1);
   }

   public boolean gq(Object var1) {
      return super.equals(var1);
   }

   public boolean gk(Object var1) {
      return super.equals(var1);
   }

   int an(nu var1, nu var2) {
      return var1.aw.aw * 261540490 < var2.aw.aw * -1994102707 ? -1 : (var2.aw.aw * -1994102707 == var1.aw.aw * -894718739 ? 0 : 1);
   }

   public boolean gi(Object var1) {
      return super.equals(var1);
   }

   int ac(nu var1, nu var2) {
      return var1.aw.aw * -1994102707 < var2.aw.aw * -1994102707 ? -1 : (var2.aw.aw * -1994102707 == var1.aw.aw * -1994102707 ? 0 : 1);
   }

   int at(nu var1, nu var2) {
      return var1.aw.aw * -1994102707 < var2.aw.aw * -1994102707 ? -1 : (var2.aw.aw * -1994102707 == var1.aw.aw * -1994102707 ? 0 : 1);
   }

   public int au(Object var1, Object var2) {
      return this.af((nu)var1, (nu)var2, -411750205);
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw db.an(var2, "nt.equals(" + ')');
      }
   }
}
