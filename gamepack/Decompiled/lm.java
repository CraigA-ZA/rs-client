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
      if (-297150195 * Client.tl < 50 && aj.vb.az() != 0) {
         if (null != var0.ar && var1 < var0.ar.length) {
            ge.hp_renamed(var0.ar[var1], var2, var3);
         }
      }
   }

   static void mv_renamed(int var0) {
      Language.ot = new MiniMenuEntry();
      Language.ot.af = 116605911 * Client.nk[var0];
      Language.ot.an = Client.ni[var0] * 1112086437;
      Language.ot.aw = Client.nh[var0] * -1623394963;
      Language.ot.ac = Client.nq[var0] * -1353871487;
      Language.ot.au = 355643405 * Client.oi[var0];
      Language.ot.ab = Client.og[var0];
      Language.ot.aq = Client.ok[var0];
   }

   static final void mj_renamed(int var0) {
      if (SoundSystem.loadInterface(var0)) {
         Component[] var2 = hn.ap[var0];

         for(int var3 = 0; var3 < var2.length; ++var3) {
            Component var4 = var2[var3];
            if (var4 != null) {
               var4.gx = 0;
               var4.gl = 0;
            }
         }

      }
   }
}
