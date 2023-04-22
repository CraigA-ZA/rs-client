public class ClientScript extends DualNode {
   String an;
   int[] aw;
   int[] ac;
   String[] stringOperands;
   int ab;
   int aq;
   int at;
   int al;
   IterableNodeHashTable[] switches;
   static EvictingDualNodeHashTable ClientScript_cached = new EvictingDualNodeHashTable(128);
   public static NetFileRequest NetCache_currentResponse;

   IterableNodeHashTable[] au(int var1) {
      return new IterableNodeHashTable[var1];
   }

   public static int af_renamed(int var0, int var1) {
      int var3;
      for(var3 = 1; var1 > 1; var1 >>= 1) {
         if ((var1 & 1) != 0) {
            var3 *= var0;
         }

         var0 *= var0;
      }

      if (1 == var1) {
         return var3 * var0;
      } else {
         return var3;
      }
   }

   ClientScript() {
   }
}
