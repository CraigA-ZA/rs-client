public class fs {
   fs() throws Throwable {
      throw new Error();
   }

   public static qx an_renamed() {
      synchronized(qx.af) {
         if (0 == -2133937525 * qx.aw) {
            return new qx();
         } else {
            qx.af[(qx.aw -= 1732158755) * -2133937525].ab();
            return qx.af[-2133937525 * qx.aw];
         }
      }
   }

   static int au_renamed(int var0, ClientScript var1, boolean var2) {
      int var4 = -1;
      Component var5;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
         var5 = gh.getInterfaceComponent(var4);
      } else {
         var5 = var2 ? SoundSystem.ag : an.ai;
      }

      if (var0 == 1000) {
         Interpreter.Interpreter_intStackSize -= 1708543892;
         var5.rawX = 1806877347 * Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
         var5.rawY = 1231090287 * Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
         var5.xAlignment = Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539] * 1656805111;
         var5.yAlignment = Interpreter.Interpreter_intStack[3 + -964267539 * Interpreter.Interpreter_intStackSize] * -362988363;
         fw.ma_renamed(var5);
         ClientScriptFrame.client.alignComponent(var5);
         if (var4 != -1 && 883712245 * var5.type == 0) {
            WallDecoration.lz_renamed(hn.interfaceComponents[var4 >> 16], var5, false);
         }

         return 1;
      } else if (1001 == var0) {
         Interpreter.Interpreter_intStackSize -= 1708543892;
         var5.rawWidth = -1495372107 * Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
         var5.rawHeight = 1193771871 * Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
         var5.widthAlignment = 387308049 * Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539];
         var5.heightAlignment = -480958745 * Interpreter.Interpreter_intStack[3 + -964267539 * Interpreter.Interpreter_intStackSize];
         fw.ma_renamed(var5);
         ClientScriptFrame.client.alignComponent(var5);
         if (-1 != var4 && var5.type * 883712245 == 0) {
            WallDecoration.lz_renamed(hn.interfaceComponents[var4 >> 16], var5, false);
         }

         return 1;
      } else if (1003 == var0) {
         boolean var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
         if (var6 != var5.isHidden) {
            var5.isHidden = var6;
            fw.ma_renamed(var5);
         }

         return 1;
      } else if (var0 == 1005) {
         var5.noClickThrough = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
         return 1;
      } else if (var0 == 1006) {
         var5.hl = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
         return 1;
      } else {
         return 2;
      }
   }
}
