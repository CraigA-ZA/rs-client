public final class au {
   static byte[][] jf;
   static int gq;

   static mi[] af_renamed() {
      return new mi[]{mi.af, mi.an};
   }

   public static boolean al_renamed() {
      return 0 != ly.au * 926096579 ? true : sa.midiPcmStream.isReady();
   }

   public static void at_renamed() {
      IDKType.IDKType_cached.clear();
   }

   public static void af_renamed(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, AbstractArchive var3) {
      int var5 = 0;
      if (null != var0) {
         eb.Component_archive = var0;
         DynamicObject.bi = var1;
         ClientScriptEvent.be = var2;
         fv.bk = var3;
         var5 = eb.Component_archive.cm();
      }

      hn.interfaceComponents = new Component[var5][];
      kt.loadedInterfaces = new boolean[var5];
   }

   au() throws Throwable {
      throw new Error();
   }

   static int av_renamed(Component var0) {
      if (var0.bg * 883712245 != 11) {
         Interpreter.Interpreter_stringStack[-2017760987 * SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
         return 1;
      } else {
         String var2 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
         Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var0.bi(var2);
         return 1;
      }
   }
}
