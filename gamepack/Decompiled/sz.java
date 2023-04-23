public class sz extends DualNode {
   public static EvictingDualNodeHashTable an = new EvictingDualNodeHashTable(64);
   static AbstractArchive af;
   int[][] ac;
   Object[][] aw;
   public int au = 1229882107;

   sz() {
   }

   void aw(Packet var1) {
      while(true) {
         int var3 = var1.g1();
         if (var3 == 0) {
            return;
         }

         this.au(var1, var3);
      }
   }

   public Object[] ac(int var1) {
      return this.aw == null ? null : this.aw[var1];
   }

   void au(Packet var1, int var2) {
      if (var2 == 3) {
         int var4 = var1.g1();
         if (this.aw == null) {
            this.aw = new Object[var4][];
            this.ac = new int[var4][];
         }

         for(int var5 = var1.g1(); 255 != var5; var5 = var1.g1()) {
            int var6 = var1.g1();
            int[] var7 = new int[var6];

            for(int var8 = 0; var8 < var6; ++var8) {
               var7[var8] = var1.cd();
            }

            this.aw[var5] = oe.ac_renamed(var1, var7);
            this.ac[var5] = var7;
         }
      } else if (4 == var2) {
         this.au = var1.dr((byte)53) * -1229882107;
      }

   }

   void ab() {
   }
}
