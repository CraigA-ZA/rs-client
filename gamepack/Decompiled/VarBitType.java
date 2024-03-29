public class VarBitType extends DualNode {
   public static byte[][] at;
   public static EvictingDualNodeHashTable VarBitType_cached = new EvictingDualNodeHashTable(64);
   static AbstractArchive VarBitType_archive;
   static final int[] ab = new int[32];
   public int startBit;
   public int endBit;
   public int baseVar;

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         ab[var1] = var0 - 1;
         var0 += var0;
      }

   }

   VarBitType() {
   }

   void decode(Packet var1) {
      while(true) {
         int var3 = var1.g1();
         if (var3 == 0) {
            return;
         }

         this.decodeNext(var1, var3);
      }
   }

   void decodeNext(Packet var1, int var2) {
      if (var2 == 1) {
         this.baseVar = var1.cl() * -893309655;
         this.startBit = var1.g1() * -1466027509;
         this.endBit = var1.g1() * 909304255;
      }

   }
}
