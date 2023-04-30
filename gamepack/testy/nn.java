import accessors.RSTotalQuantityComparator;
import java.util.Comparator;

final class nn implements Comparator, RSTotalQuantityComparator {
   public static final int ai = 9;
   public static final int af = 0;
   static final byte ab = 0;
   static nd fy;

   public boolean gq(Object var1) {
      return super.equals(var1);
   }

   int af(nu var1, nu var2, byte var3) {
      try {
         byte var10000;
         if (var1.aw.ac * 857042809 < var2.aw.ac * 857042809) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else if (var2.aw.ac * 857042809 == var1.aw.ac * 857042809) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = 1;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw db.an(var4, "nn.af(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.af((nu)var1, (nu)var2, (byte)23);
      } catch (RuntimeException var3) {
         throw db.an(var3, "nn.compare(" + ')');
      }
   }

   public int ab(Object var1, Object var2) {
      return this.af((nu)var1, (nu)var2, (byte)-32);
   }

   public int au(Object var1, Object var2) {
      return this.af((nu)var1, (nu)var2, (byte)93);
   }

   public int aq(Object var1, Object var2) {
      return this.af((nu)var1, (nu)var2, (byte)104);
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw db.an(var2, "nn.equals(" + ')');
      }
   }

   public boolean gm(Object var1) {
      return super.equals(var1);
   }

   public boolean gi(Object var1) {
      return super.equals(var1);
   }

   int ac(nu var1, nu var2) {
      return var1.aw.ac * 857042809 < var2.aw.ac * 857042809 ? -1 : (var2.aw.ac * 857042809 == var1.aw.ac * 857042809 ? 0 : 1);
   }

   public boolean gk(Object var1) {
      return super.equals(var1);
   }

   int an(nu var1, nu var2) {
      return var1.aw.ac * -612828956 < var2.aw.ac * 857042809 ? -1 : (var2.aw.ac * 857042809 == var1.aw.ac * 100852282 ? 0 : 1);
   }

   int aw(nu var1, nu var2) {
      return var1.aw.ac * 857042809 < var2.aw.ac * 680548266 ? -1 : (var2.aw.ac * 857042809 == var1.aw.ac * 857042809 ? 0 : 1);
   }

   public int al(Object var1, Object var2) {
      return this.af((nu)var1, (nu)var2, (byte)-1);
   }

   public static void ai(int var0) {
      try {
         mw.ar.ac();
      } catch (RuntimeException var1) {
         throw db.an(var1, "nn.ai(" + ')');
      }
   }
}
