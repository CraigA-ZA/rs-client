public class jn {
   static java.awt.Font bb;

   jn() throws Throwable {
      throw new Error();
   }

   public static String longToString(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (0L == var0 % 37L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; var3 != 0L; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5 = new StringBuilder(var2);

            while(var0 != 0L) {
               long var6 = var0;
               var0 /= 37L;
               var5.append(oy.af[(int)(var6 - 37L * var0)]);
            }

            return var5.reverse().toString();
         }
      } else {
         return null;
      }
   }

   static int ax_renamed(int var0, ClientScript var1, boolean var2) {
      Component var4 = var2 ? SoundSystem.ag : an.ai;
      if (1500 == var0) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var4.ce * 262951665;
         return 1;
      } else if (1501 == var0) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -747355095 * var4.ci;
         return 1;
      } else if (var0 == 1502) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var4.cs * -794961409;
         return 1;
      } else if (var0 == 1503) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var4.cc * 1473950221;
         return 1;
      } else if (var0 == 1504) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var4.ck ? 1 : 0;
         return 1;
      } else if (1505 == var0) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 913615679 * var4.cu;
         return 1;
      } else {
         return 2;
      }
   }

   static void nx_renamed(int var0) {
      Client.lv = -1041341417 * var0;
   }
}
