public class ks {
   ks() throws Throwable {
      throw new Error();
   }

   static int an_renamed(int var0, int var1, int var2) {
      return var0 << 28 | var1 << 14 | var2;
   }

   public static void ab_renamed(int var0, AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
      if (var1.cv(var2, var3)) {
         int var7 = var1.getGroupId(var2);
         int var8 = var1.getFileId(var7, var3);
         Actor.aq_renamed(var0, var1, var7, var8, var4, var5);
      }

   }

   public static void ba_renamed(Component var0, int var1) {
      ObjType var3 = HeadbarUpdate.getObjType(var1);
      var0.dd.an[-1935812527 * var3.womanwearyoff] = 512 + var1;
      if (-1719338253 * var3.manwear != -1) {
         var0.dd.an[var3.manwear * -1719338253] = 0;
      }

      if (var3.contrast * 723093341 != -1) {
         var0.dd.an[var3.contrast * 723093341] = 0;
      }

      var0.dd.ax();
   }

   static int bq_renamed(int var0, ClientScript var1, boolean var2) {
      if (var0 == 6754) {
         int var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
         hs var7 = AbstractArchive.an_renamed(var6);
         Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = null != var7 ? var7.aq : "";
         return 1;
      } else {
         hs var4;
         if (6764 == var0) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            var4 = AbstractArchive.an_renamed(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize]);
            int var5 = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4.ah(var5);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4.ar(var5);
            return 1;
         } else if (var0 == 6765) {
            var4 = AbstractArchive.an_renamed(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4 != null ? 2062903815 * var4.bx : 0;
            return 1;
         } else {
            return 2;
         }
      }
   }
}
