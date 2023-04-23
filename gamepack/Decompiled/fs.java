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
         var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
         var5 = gh.an_renamed(var4);
      } else {
         var5 = var2 ? SoundSystem.ag : an.ai;
      }

      if (var0 == 1000) {
         Interpreter.at -= 1708543892;
         var5.bp = 1806877347 * Interpreter.al[-964267539 * Interpreter.at];
         var5.bc = 1231090287 * Interpreter.al[1 + Interpreter.at * -964267539];
         var5.bq = Interpreter.al[2 + Interpreter.at * -964267539] * 1656805111;
         var5.ba = Interpreter.al[3 + -964267539 * Interpreter.at] * -362988363;
         fw.ma_renamed(var5);
         ClientScriptFrame.bc.alignComponent(var5);
         if (var4 != -1 && 883712245 * var5.bg == 0) {
            WallDecoration.lz_renamed(hn.ap[var4 >> 16], var5, false);
         }

         return 1;
      } else if (1001 == var0) {
         Interpreter.at -= 1708543892;
         var5.bh = -1495372107 * Interpreter.al[Interpreter.at * -964267539];
         var5.bw = 1193771871 * Interpreter.al[1 + Interpreter.at * -964267539];
         var5.bv = 387308049 * Interpreter.al[2 + Interpreter.at * -964267539];
         var5.bl = -480958745 * Interpreter.al[3 + -964267539 * Interpreter.at];
         fw.ma_renamed(var5);
         ClientScriptFrame.bc.alignComponent(var5);
         if (-1 != var4 && var5.bg * 883712245 == 0) {
            WallDecoration.lz_renamed(hn.ap[var4 >> 16], var5, false);
         }

         return 1;
      } else if (1003 == var0) {
         boolean var6 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
         if (var6 != var5.ck) {
            var5.ck = var6;
            fw.ma_renamed(var5);
         }

         return 1;
      } else if (var0 == 1005) {
         var5.hn = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
         return 1;
      } else if (var0 == 1006) {
         var5.hl = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
         return 1;
      } else {
         return 2;
      }
   }
}
