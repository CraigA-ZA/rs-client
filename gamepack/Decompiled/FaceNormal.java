public class FaceNormal {
   int af;
   int an;
   int aw;

   FaceNormal() {
   }

   public static int au_renamed(int var0) {
      long var3 = ViewportMouse.ag[var0];
      int var2 = (int)(var3 >>> 0 & 127L);
      return var2;
   }

   static int ay_renamed(int var0) {
      Message var2 = (Message)Messages.Messages_hashTable.get((long)var0);
      if (null == var2) {
         return -1;
      } else {
         return Messages.Messages_queue.sentinel == var2.previousDual ? -1 : -1117255211 * ((Message)var2.previousDual).count;
      }
   }

   public static long aa_renamed(int var0, int var1, int var2, boolean var3, int var4) {
      long var6 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
      if (var3) {
         var6 |= 65536L;
      }

      return var6;
   }

   static World aq_renamed() {
      World.aq = 0;
      return Interpreter.al_renamed();
   }
}
