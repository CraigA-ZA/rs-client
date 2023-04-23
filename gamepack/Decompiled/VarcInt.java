public class VarcInt extends DualNode {
   public static EvictingDualNodeHashTable an = new EvictingDualNodeHashTable(64);
   public boolean persist = false;

   public void decode(Packet var1) {
      while(true) {
         int var3 = var1.g1();
         if (0 == var3) {
            return;
         }

         this.decode0(var1, var3);
      }
   }

   void decode0(Packet var1, int var2) {
      if (2 == var2) {
         this.persist = true;
      }

   }

   public static boolean ag_renamed(char var0, byte var1) {
      if (var0 >= ' ') {
         if (var1 <= -1) {
            throw new IllegalStateException();
         }

         if (var0 <= '~') {
            if (var1 <= -1) {
               throw new IllegalStateException();
            }

            return true;
         }
      }

      if (var0 >= 160) {
         if (var1 <= -1) {
            throw new IllegalStateException();
         }

         if (var0 <= 255) {
            if (var1 <= -1) {
               throw new IllegalStateException();
            }

            return true;
         }
      }

      if (8364 != var0) {
         if (var1 <= -1) {
            throw new IllegalStateException();
         }

         if (var0 != 338) {
            if (var1 <= -1) {
               throw new IllegalStateException();
            }

            if (var0 != 8212) {
               if (var1 <= -1) {
                  throw new IllegalStateException();
               }

               if (var0 != 339) {
                  if (376 != var0) {
                     return false;
                  }

                  if (var1 <= -1) {
                     throw new IllegalStateException();
                  }
               }
            }
         }
      }

      return true;
   }
}
