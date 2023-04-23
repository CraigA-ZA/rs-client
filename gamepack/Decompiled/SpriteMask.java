public class SpriteMask extends DualNode {
   static String gn;
   public final int af;
   public final int an;
   public final int[] ac;
   public final int[] aw;

   public static int af_renamed(int var0, int var1, int var2) {
      var2 &= 3;
      if (var2 == 0) {
         return var0;
      } else if (1 == var2) {
         return var1;
      } else {
         return 2 == var2 ? 7 - var0 : 7 - var1;
      }
   }

   SpriteMask(int var1, int var2, int[] var3, int[] var4) {
      this.af = var1 * 1531475491;
      this.an = var2 * 1387260015;
      this.aw = var3;
      this.ac = var4;
   }

   public boolean contains(int var1, int var2) {
      if (var2 >= 0 && var2 < this.ac.length) {
         int var4 = this.ac[var2];
         if (var1 >= var4 && var1 <= var4 + this.aw[var2]) {
            return true;
         }
      }

      return false;
   }
}
