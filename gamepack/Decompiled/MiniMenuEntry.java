public class MiniMenuEntry {
   static su qh;
   int ac;
   int af;
   int an;
   int au;
   int aw;
   String ab;
   String aq;

   static void af_renamed(int var0, byte[] var1, ArchiveDisk var2) {
      ArchiveDiskAction var4 = new ArchiveDiskAction();
      var4.af = 0;
      var4.hr = (long)var0;
      var4.an = var1;
      var4.aw = var2;
      synchronized(ArchiveDiskActionHandler.af) {
         ArchiveDiskActionHandler.af.addFirst(var4);
      }

      eh.aw_renamed();
   }

   public static void af_renamed(AbstractArchive var0) {
      VarBitType.af = var0;
   }

   public static void af_renamed(AbstractArchive var0, AbstractArchive var1) {
      hs.an = var0;
      hs.aw = var1;
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
