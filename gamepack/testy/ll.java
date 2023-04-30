import accessors.RSSpriteMask;

public class ll extends rk implements RSSpriteMask {
   public final int an;
   static final int au = 4;
   public final int[] aw;
   public final int[] ac;
   static String gn;
   public final int af;
   static final int dm = 100;
   static final int bq = 55;

   public boolean ac(int var1, int var2) {
      if (var2 >= 0 && var2 < this.ac.length) {
         int var3 = this.ac[var2];
         if (var1 >= var3 && var1 <= var3 + this.aw[var2]) {
            return true;
         }
      }

      return false;
   }

   public boolean af(int var1, int var2, int var3) {
      try {
         if (var2 >= 0 && var2 < this.ac.length) {
            if (var3 != -746690647) {
               throw new IllegalStateException();
            }

            int var4 = this.ac[var2];
            if (var1 >= var4 && var1 <= var4 + this.aw[var2]) {
               if (var3 != -746690647) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var5) {
         throw db.an(var5, "ll.af(" + ')');
      }
   }

   public static int af(int var0, int var1, int var2, int var3) {
      try {
         var2 &= 3;
         if (var2 == 0) {
            return var0;
         } else if (1 == var2) {
            if (var3 != 575322475) {
               throw new IllegalStateException();
            } else {
               return var1;
            }
         } else if (2 == var2) {
            if (var3 != 575322475) {
               throw new IllegalStateException();
            } else {
               return 7 - var0;
            }
         } else {
            return 7 - var1;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "ll.af(" + ')');
      }
   }

   public boolean aw(int var1, int var2) {
      if (var2 >= 0 && var2 < this.ac.length) {
         int var3 = this.ac[var2];
         if (var1 >= var3 && var1 <= var3 + this.aw[var2]) {
            return true;
         }
      }

      return false;
   }

   ll(int var1, int var2, int[] var3, int[] var4, int var5) {
      try {
         super();
         this.af = var1 * 1531475491;
         this.an = var2 * 1387260015;
         this.aw = var3;
         this.ac = var4;
      } catch (RuntimeException var6) {
         throw db.an(var6, "ll.<init>(" + ')');
      }
   }

   public boolean an(int var1, int var2) {
      if (var2 >= 0 && var2 < this.ac.length) {
         int var3 = this.ac[var2];
         if (var1 >= var3 && var1 <= var3 + this.aw[var2]) {
            return true;
         }
      }

      return false;
   }
}
