public class MiniMenuEntry {
   static su qh;
   int argument0;
   int argument1;
   int argument2;
   int au;
   int opcode;
   String action;
   String aq;

   static void af_renamed(int var0, byte[] var1, ArchiveDisk var2) {
      ArchiveDiskAction var4 = new ArchiveDiskAction();
      var4.type = 0;
      var4.key = (long)var0;
      var4.data = var1;
      var4.archiveDisk = var2;
      synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
         ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var4);
      }

      eh.aw_renamed();
   }

   public static void af_renamed(AbstractArchive var0) {
      VarBitType.VarBitType_archive = var0;
   }

   public static void af_renamed(AbstractArchive var0, AbstractArchive var1) {
      NPCType.NPCType_archive = var0;
      NPCType.aw = var1;
   }

   public static boolean ay_renamed(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   public static final void kz_renamed(String var0, String var1, int var2, int var3, int var4, int var5) {
      TilePaint.addMiniMenuEntry(var0, var1, var2, var3, var4, var5, -1, false);
   }

   MiniMenuEntry() {
   }
}
