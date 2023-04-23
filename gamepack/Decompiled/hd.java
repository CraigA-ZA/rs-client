public class hd implements Enumerated {
   public static String userHomeDirectory;
   static PcmPlayer pcmPlayer1;
   static final hd af = new hd(0, 0);
   static final hd an = new hd(2, 1);
   static final hd aw = new hd(1, 2);
   final int au;
   public final int ac;

   hd(int var1, int var2) {
      this.ac = -782562361 * var1;
      this.au = -1771456679 * var2;
   }

   public int ordinal() {
      return 455418089 * this.au;
   }

   public static int au_renamed(boolean var0, boolean var1) {
      int var3 = 0;
      if (var0) {
         var3 += -1171541559 * NetCache.au + -1952694793 * NetCache.aq;
      }

      if (var1) {
         var3 += NetCache.aa * -32010957 + -1651605431 * NetCache.ao;
      }

      return var3;
   }
}
