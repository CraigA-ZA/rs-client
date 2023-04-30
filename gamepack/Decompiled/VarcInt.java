public class VarcInt extends DualNode {
   public static EvictingDualNodeHashTable an = new EvictingDualNodeHashTable(64);
   public boolean persist = false;

   public void af(Packet var1) {
      while(true) {
         int var3 = var1.g1();
         if (0 == var3) {
            return;
         }

         this.an(var1, var3);
      }
   }

   void an(Packet var1, int var2) {
      if (2 == var2) {
         this.persist = true;
      }

   }

   public static boolean ag_renamed(char var0) {
      if (var0 >= ' ' && var0 <= '~') {
         return true;
      } else if (var0 >= 160 && var0 <= 255) {
         return true;
      } else {
         return 8364 == var0 || var0 == 338 || var0 == 8212 || var0 == 339 || 376 == var0;
      }
   }
}
