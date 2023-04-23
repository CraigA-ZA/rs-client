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
         Interpreter.at -= 854271946;
         var4 = Interpreter.al[-964267539 * Interpreter.at];
         var5 = Interpreter.al[1 + -964267539 * Interpreter.at];
         EnumType var11 = fc.getEnumType(var4);
         if (var11.ac != 's') {
         }

         for(var7 = 0; var7 < -1067065 * var11.aq; ++var7) {
            if (var5 == var11.al[var7]) {
               Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var11.aa[var7];
               var11 = null;
               break;
            }
         }

         if (var11 != null) {
            Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var11.au;
         }

         return 1;
      } else if (3408 != var0) {
         if (var0 == 3411) {
            var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
            EnumType var10 = fc.getEnumType(var4);
            Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var10.size();
            return 1;
         } else {
            return 2;
         }
      } else {
         Interpreter.at -= 1708543892;
         var4 = Interpreter.al[Interpreter.at * -964267539];
         var5 = Interpreter.al[-964267539 * Interpreter.at + 1];
         int var6 = Interpreter.al[-964267539 * Interpreter.at + 2];
         var7 = Interpreter.al[-964267539 * Interpreter.at + 3];
         EnumType var8 = fc.getEnumType(var6);
         if (var4 == var8.aw && var5 == var8.ac) {
            for(int var9 = 0; var9 < -1067065 * var8.aq; ++var9) {
               if (var7 == var8.al[var9]) {
                  if (var5 == 115) {
                     Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var8.aa[var9];
                  } else {
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var8.at[var9];
                  }

                  var8 = null;
                  break;
               }
            }

            if (null != var8) {
               if (var5 == 115) {
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var8.au;
               } else {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -635236715 * var8.ab;
               }
            }

            return 1;
         } else {
            if (115 == var5) {
               Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = Strings.at;
            } else {
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
            }

            return 1;
         }
      }
   }
}
