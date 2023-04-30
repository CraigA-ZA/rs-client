final class dy implements lx {
   static int qw;
   // $FF: synthetic field
   final Component val$cc;

   static final String ao_renamed(int var0) {
      if (var0 < 100000) {
         return "<col=ffff00>" + var0 + "</col>";
      } else {
         return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + Strings.gv + "</col>" : "<col=00ff80>" + var0 / 1000000 + Strings.gp + "</col>";
      }
   }

   dy(Component var1) {
      this.val$cc = var1;
   }

   public void af() {
      if (this.val$cc != null && this.val$cc.br().ac != null) {
         ClientScriptEvent var2 = new ClientScriptEvent();
         var2.aw(this.val$cc);
         var2.setArgs(this.val$cc.br().ac);
         np.jk_renamed().addFirst(var2);
      }

   }

   static final int ai_renamed(int var0, int var1, int var2) {
      int var4 = var0 / var2;
      int var5 = var0 & var2 - 1;
      int var6 = var1 / var2;
      int var7 = var1 & var2 - 1;
      int var8 = oa.ah_renamed(var4, var6);
      int var9 = oa.ah_renamed(1 + var4, var6);
      int var10 = oa.ah_renamed(var4, var6 + 1);
      int var11 = oa.ah_renamed(var4 + 1, var6 + 1);
      int var12 = gc.ag_renamed(var8, var9, var5, var2);
      int var13 = gc.ag_renamed(var10, var11, var5, var2);
      return gc.ag_renamed(var12, var13, var7, var2);
   }
}
