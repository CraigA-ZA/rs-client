public class ClientScriptEvent extends Node {
   static int uw;
   static AbstractArchive be;
   boolean boolean1;
   int opIndex;
   int mouseX;
   int keyPressed;
   int type0 = -1484849228;
   int keyTyped;
   int mouseY;
   int ay;
   Object[] args0;
   String opbase;
   Component dragTarget;
   Component component;

   public static boolean ac_renamed(int var0) {
      return 0 != (var0 >> 21 & 1);
   }

   public void setArgs(Object[] var1) {
      this.args0 = var1;
   }

   public void setType(int var1) {
      this.type0 = 941178879 * var1;
   }

   public void aw(Component var1) {
      this.component = var1;
   }

   static Object cn_renamed(int var0) {
      return Language.cc_renamed((sh)StructType.findEnumerated(sh.au_renamed(), var0));
   }
}
