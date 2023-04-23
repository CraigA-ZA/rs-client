public class hn implements Enumerated {
   public static Component[][] interfaceComponents;
   static final hn af = new hn(2, 0);
   static final hn an = new hn(1, 1);
   static final hn aw = new hn(0, 2);
   final int au;
   public final int ac;

   hn(int var1, int var2) {
      this.ac = -441541533 * var1;
      this.au = -1969701431 * var2;
   }

   public int ordinal() {
      return -1332614023 * this.au;
   }

   static final void at_renamed(String var0) {
      es.an_renamed(30, "", var0);
   }

   public static int aq_renamed(CharSequence var0) {
      int var2 = var0.length();
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         var3 = (var3 << 5) - var3 + dn.af_renamed(var0.charAt(var4));
      }

      return var3;
   }
}
