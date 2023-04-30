public class sr implements Enumerated {
   public static final sr af = new sr(5, 0);
   public static final sr an = new sr(1, 2);
   static final sr ab = new sr(3, 8);
   static final sr ac = new sr(4, 6);
   static final sr au = new sr(0, 7);
   static final sr aw = new sr(2, 5);
   final int al;
   final int aq;

   sr(int var1, int var2) {
      this.aq = var1 * -1186971013;
      this.al = var2 * -1262949217;
   }

   public int ordinal() {
      return 1588670303 * this.al;
   }

   public boolean au() {
      return this == an;
   }
}
