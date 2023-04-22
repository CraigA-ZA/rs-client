public class ta implements Enumerated {
   public final int ac;
   static final ta an = new ta(1, 1);
   static final ta aw = new ta(2, 2);
   final int au;
   public static final ta af = new ta(0, 0);

   static void an_renamed(int var0, int var1) {
      int[] var3 = new int[4];
      int[] var4 = new int[4];
      var3[0] = var0;
      var4[0] = var1;
      int var5 = 1;

      for(int var6 = 0; var6 < 4; ++var6) {
         if (var0 != World.at[var6]) {
            var3[var5] = World.at[var6];
            var4[var5] = World.al[var6];
            ++var5;
         }
      }

      World.at = var3;
      World.al = var4;
      ex.aw_renamed(bx.worlds, 0, bx.worlds.length - 1, World.at, World.al);
   }

   public int af() {
      return -1089213109 * this.au;
   }

   ta(int var1, int var2) {
      this.ac = var1 * -311706931;
      this.au = -1236781981 * var2;
   }
}
