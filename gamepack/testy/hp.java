public class hp {
   public final int ag;
   static final hp af = new hp(0);
   static final hp aw = new hp(2);
   public static final hp aa;
   public static final hp au;
   static final hp ab;
   public static final hp aq;
   public static final hp al;
   public static final hp at;
   public static final hp ao;
   static final hp ac = new hp(3);
   static final hp an = new hp(1);
   public static final hp ay;
   static final hp ai;
   static final hp ax;
   static int ct;
   public static final int cf = 84;
   public static final String ka = "";
   public static final String kj = "persists, please contact Jagex Support.";

   hp(int var1, hl var2) {
      try {
         super();
         this.ag = -1022651463 * var1;
      } catch (RuntimeException var3) {
         throw db.an(var3, "hp.<init>(" + ')');
      }
   }

   hp(int var1) {
      try {
         this(var1, (hl)null);
      } catch (RuntimeException var2) {
         throw db.an(var2, "hp.<init>(" + ')');
      }
   }

   static {
      au = new hp(4, hl.aw);
      ab = new hp(5);
      aq = new hp(6, hl.ac);
      al = new hp(7, hl.ab);
      at = new hp(8, hl.af);
      aa = new hp(9, hl.au);
      ay = new hp(10, hl.aq);
      ao = new hp(11, hl.an);
      ax = new hp(12);
      ai = new hp(13);
   }

   static void mx(int var0, int var1, int var2) {
      try {
         fd.kv(nx.ot, var0, var1, (byte)46);
         nx.ot = null;
      } catch (RuntimeException var3) {
         throw db.an(var3, "hp.mx(" + ')');
      }
   }
}
