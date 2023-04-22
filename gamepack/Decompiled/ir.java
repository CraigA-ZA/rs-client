public class ir {
   int aw;
   int an;
   int af;

   static World aq_renamed() {
      World.aq = 0;
      return Interpreter.al_renamed();
   }

   ir() {
   }

   public static long aa_renamed(int var0, int var1, int var2, boolean var3, int var4) {
      long var6 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
      if (var3) {
         var6 |= 65536L;
      }

      return var6;
   }

   public static int au_renamed(int var0) {
      long var3 = ix.ag[var0];
      int var2 = (int)(var3 >>> 0 & 127L);
      return var2;
   }

   static int ay_renamed(int var0) {
      Message var2 = (Message)Messages.Messages_hashTable.get((long)var0);
      if (null == var2) {
         return -1;
      } else {
         return Messages.Messages_queue.sentinel == var2.ez ? -1 : -1117255211 * ((Message)var2.ez).count;
      }
   }
}
