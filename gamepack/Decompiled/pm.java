public class pm {
   static final pm af = new pm("Basic");
   static final pm an = new pm("Bearer");
   final String aw;

   pm(String var1) {
      this.aw = var1;
   }

   String af() {
      return this.aw;
   }

   static boolean isComponentHidden(Component var0) {
      return var0.isHidden;
   }
}
