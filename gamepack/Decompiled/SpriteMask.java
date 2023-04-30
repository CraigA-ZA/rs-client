public class SpriteMask extends DualNode {
   static String gn;
   public final int width;
   public final int height;
   public final int[] xStarts;
   public final int[] xWidths;

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
      this.width = var1 * 1531475491;
      this.height = var2 * 1387260015;
      this.xWidths = var3;
      this.xStarts = var4;
   }

   public boolean contains(int var1, int var2) {
      if (var2 >= 0 && var2 < this.xStarts.length) {
         int var4 = this.xStarts[var2];
         if (var1 >= var4 && var1 <= var4 + this.xWidths[var2]) {
            return true;
         }
      }

      return false;
   }
}
