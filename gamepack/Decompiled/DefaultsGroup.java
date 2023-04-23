public class DefaultsGroup {
   static final DefaultsGroup af = new DefaultsGroup(3);
   final int an;

   DefaultsGroup(int var1) {
      this.an = 1519432129 * var1;
   }

   static int ag_renamed(int var0, ClientScript var1, boolean var2) {
      Component var4 = var2 ? SoundSystem.ag : an.ai;
      if (1700 == var0) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var4.gn * -2006098851;
         return 1;
      } else if (1701 == var0) {
         if (-1 != -2006098851 * var4.gn) {
            Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var4.gv * 1336975799;
         } else {
            Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
         }

         return 1;
      } else if (1702 == var0) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 55577617 * var4.br;
         return 1;
      } else if (1707 == var0) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var4.by() ? 1 : 0;
         return 1;
      } else if (var0 == 1708) {
         return BufferedSource.ah_renamed(var4);
      } else {
         return var0 == 1709 ? au.av_renamed(var4) : 2;
      }
   }
}
