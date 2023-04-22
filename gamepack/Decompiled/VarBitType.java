public class VarBitType extends DualNode {
   public int au;
   static AbstractArchive af;
   public static EvictingDualNodeHashTable VarBitType_cached = new EvictingDualNodeHashTable(64);
   public int ac;
   public int aw;
   static final int[] ab = new int[32];
   public static byte[][] at;

   void aw(Packet var1) {
      while(true) {
         int var3 = var1.g1();
         if (var3 == 0) {
            return;
         }

         this.ac(var1, var3);
      }
   }

   VarBitType() {
   }

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         ab[var1] = var0 - 1;
         var0 += var0;
      }

   }

   void ac(Packet var1, int var2) {
      if (var2 == 1) {
         this.aw = var1.cl() * -893309655;
         this.ac = var1.g1() * -1466027509;
         this.au = var1.g1() * 909304255;
      }

   }
}
