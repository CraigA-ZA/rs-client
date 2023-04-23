public class sm extends DualNode {
   static EvictingDualNodeHashTable an = new EvictingDualNodeHashTable(64);
   static AbstractArchive af;
   public int[][] aw;
   public Object[][] ac;

   sm() {
   }

   void aw(Packet var1) {
      while(true) {
         int var3 = var1.g1();
         if (0 == var3) {
            return;
         }

         this.ac(var1, var3);
      }
   }

   void ac(Packet var1, int var2) {
      if (1 == var2) {
         int var4 = var1.g1();
         if (null == this.aw) {
            this.aw = new int[var4][];
         }

         for(int var5 = var1.g1(); var5 != 255; var5 = var1.g1()) {
            int var6 = var5 & 127;
            boolean var7 = 0 != (var5 & 128);
            int[] var8 = new int[var1.g1()];

            for(int var9 = 0; var9 < var8.length; ++var9) {
               var8[var9] = var1.cd();
            }

            this.aw[var6] = var8;
            if (var7) {
               if (null == this.ac) {
                  this.ac = new Object[this.aw.length][];
               }

               this.ac[var6] = oe.ac_renamed(var1, var8);
            }
         }
      }

   }

   void au() {
   }
}
