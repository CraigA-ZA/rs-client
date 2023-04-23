public class ClientScriptEvent extends Node {
   static int uw;
   static AbstractArchive be;
   boolean an;
   int ab;
   int ac;
   int al;
   int ao = -1484849228;
   int at;
   int au;
   int ay;
   Object[] af;
   String aa;
   Component aq;
   Component aw;

   public static boolean ac_renamed(int var0) {
      return 0 != (var0 >> 21 & 1);
   }

   public void setArgs(Object[] var1) {
      this.af = var1;
   }

   public void setType(int var1) {
      this.ao = 941178879 * var1;
   }

   public void aw(Component var1) {
      this.aw = var1;
   }

   static Object cn_renamed(int var0) {
      return Language.cc_renamed((sh)StructType.findEnumerated(sh.au_renamed(), var0));
   }
}
