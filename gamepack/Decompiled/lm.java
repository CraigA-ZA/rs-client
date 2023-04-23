public class lm {
   public static final lm aa = new lm();
   public static final lm ab = new lm();
   public static final lm ac = new lm();
   public static final lm af = new lm();
   public static final lm al = new lm();
   public static final lm an = new lm();
   public static final lm aq = new lm();
   public static final lm at = new lm();
   public static final lm au = new lm();
   public static final lm aw = new lm();
   public static final lm ay = new lm();

   lm() {
   }

   static void hk_renamed(SeqType var0, int var1, int var2, int var3) {
      if (-297150195 * Client.soundEffectCount < 50 && aj.clientPreferences.az() != 0) {
         if (null != var0.ar && var1 < var0.ar.length) {
            ge.hp_renamed(var0.ar[var1], var2, var3);
         }
      }
   }

   static void mv_renamed(int var0) {
      Language.tempMenuAction = new MiniMenuEntry();
      Language.tempMenuAction.af = 116605911 * Client.menuArguments1[var0];
      Language.tempMenuAction.an = Client.menuArguments2[var0] * 1112086437;
      Language.tempMenuAction.aw = Client.menuOpcodes[var0] * -1623394963;
      Language.tempMenuAction.ac = Client.menuArguments0[var0] * -1353871487;
      Language.tempMenuAction.au = 355643405 * Client.oi[var0];
      Language.tempMenuAction.ab = Client.menuActions[var0];
      Language.tempMenuAction.aq = Client.menuTargetNames[var0];
   }

   static final void mj_renamed(int var0) {
      if (SoundSystem.loadInterface(var0)) {
         Component[] var2 = hn.interfaceComponents[var0];

         for(int var3 = 0; var3 < var2.length; ++var3) {
            Component var4 = var2[var3];
            if (var4 != null) {
               var4.modelFrame = 0;
               var4.modelFrameCycle = 0;
            }
         }

      }
   }
}
