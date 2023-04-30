public class ClientScript extends DualNode {
   public static NetFileRequest NetCache_currentResponse;
   static EvictingDualNodeHashTable ClientScript_cached = new EvictingDualNodeHashTable(128);
   int localIntCount;
   int intArgumentCount;
   int localStringCount;
   int stringArgumentCount;
   int[] intOperands;
   int[] opcodes;
   String an;
   String[] stringOperands;
   IterableNodeHashTable[] switches;

   ClientScript() {
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

   IterableNodeHashTable[] au(int var1) {
      return new IterableNodeHashTable[var1];
   }
}
