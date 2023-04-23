public class ow {
   int af;

   ow(int var1, boolean var2) {
      this.af = -349301751 * var1;
   }

   public int af() {
      return 410499641 * this.af;
   }

   static int by_renamed(int var0, ClientScript var1, boolean var2) {
      int var4;
      int var5;
      int var7;
      if (3400 == var0) {
         Interpreter.Interpreter_intStackSize -= 854271946;
         var4 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
         var5 = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
         EnumType var11 = fc.getEnumType(var4);
         if (var11.outputtype != 's') {
         }

         for(var7 = 0; var7 < -1067065 * var11.outputcount; ++var7) {
            if (var5 == var11.keys[var7]) {
               Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var11.strvals[var7];
               var11 = null;
               break;
            }
         }

         if (var11 != null) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var11.defaultstr;
         }

         return 1;
      } else if (3408 != var0) {
         if (var0 == 3411) {
            var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            EnumType var10 = fc.getEnumType(var4);
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var10.size();
            return 1;
         } else {
            return 2;
         }
      } else {
         Interpreter.Interpreter_intStackSize -= 1708543892;
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
         var5 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
         int var6 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 2];
         var7 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 3];
         EnumType var8 = fc.getEnumType(var6);
         if (var4 == var8.inputtype && var5 == var8.outputtype) {
            for(int var9 = 0; var9 < -1067065 * var8.outputcount; ++var9) {
               if (var7 == var8.keys[var9]) {
                  if (var5 == 115) {
                     Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var8.strvals[var9];
                  } else {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var8.intvals[var9];
                  }

                  var8 = null;
                  break;
               }
            }

            if (null != var8) {
               if (var5 == 115) {
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var8.defaultstr;
               } else {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -635236715 * var8.ab;
               }
            }

            return 1;
         } else {
            if (115 == var5) {
               Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = Strings.Strings_null;
            } else {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }

            return 1;
         }
      }
   }
}
