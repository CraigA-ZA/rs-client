import java.util.concurrent.ThreadFactory;

final class fe implements ThreadFactory {
   static PcmStreamMixer pcmStreamMixer;
   static Component os;
   public static String[] cacheDirectoryLocations;

   static final void mn_renamed(int var0) {
      var0 = Math.min(Math.max(var0, 0), 127);
      aj.clientPreferences.as(var0);
   }

   public Thread newThread(Runnable var1) {
      return new Thread(var1, "OSRS Maya Anim Load");
   }

   static int ap_renamed(int var0, ClientScript var1, boolean var2) {
      if (var0 == 3300) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.ep * -1886224337;
         return 1;
      } else {
         int var4;
         int var5;
         if (var0 == 3301) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            var5 = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Player.af_renamed(var4, var5);
            return 1;
         } else if (var0 == 3302) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            var4 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            var5 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = qb.an_renamed(var4, var5);
            return 1;
         } else if (var0 == 3303) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            var4 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = BufferedNetSocket.aw_renamed(var4, var5);
            return 1;
         } else if (3304 == var0) {
            var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = cm.an_renamed(var4).size * -2010981849;
            return 1;
         } else if (3305 == var0) {
            var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.ng[var4];
            return 1;
         } else if (3306 == var0) {
            var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.ny[var4];
            return 1;
         } else if (3307 == var0) {
            var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.nu[var4];
            return 1;
         } else {
            int var6;
            if (var0 == 3308) {
               var4 = -1727408401 * GameShell.plane;
               var5 = jm.ib * -1232093375 + (1144428983 * MusicPatchNode.localPlayer.bx >> 7);
               var6 = 827352769 * Scenery.jc + (-411750205 * MusicPatchNode.localPlayer.bo >> 7);
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var6 + (var5 << 14) + (var4 << 28);
               return 1;
            } else if (var0 == 3309) {
               var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4 >> 14 & 16383;
               return 1;
            } else if (var0 == 3310) {
               var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4 >> 28;
               return 1;
            } else if (3311 == var0) {
               var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4 & 16383;
               return 1;
            } else if (3312 == var0) {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.ca ? 1 : 0;
               return 1;
            } else if (var0 == 3313) {
               Interpreter.Interpreter_intStackSize -= 854271946;
               var4 = '耀' + Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
               var5 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Player.af_renamed(var4, var5);
               return 1;
            } else if (var0 == 3314) {
               Interpreter.Interpreter_intStackSize -= 854271946;
               var4 = '耀' + Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
               var5 = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = qb.an_renamed(var4, var5);
               return 1;
            } else if (3315 == var0) {
               Interpreter.Interpreter_intStackSize -= 854271946;
               var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] + '耀';
               var5 = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = BufferedNetSocket.aw_renamed(var4, var5);
               return 1;
            } else if (3316 == var0) {
               if (Client.pu * 324465533 >= 2) {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.pu * 324465533;
               } else {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3317) {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.ea * -1496573241;
               return 1;
            } else if (var0 == 3318) {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -453810525 * Client.bw;
               return 1;
            } else if (var0 == 3321) {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -365416549 * Client.pk / 100;
               return 1;
            } else if (3322 == var0) {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.pj * -1940722149;
               return 1;
            } else if (3323 == var0) {
               if (Client.po) {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
               }

               return 1;
            } else if (3324 == var0) {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -205173751 * Client.ce;
               return 1;
            } else if (3325 == var0) {
               Interpreter.Interpreter_intStackSize -= 1708543892;
               var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
               var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
               var6 = Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539];
               int var7 = Interpreter.Interpreter_intStack[3 + Interpreter.Interpreter_intStackSize * -964267539];
               var4 += var5 << 14;
               var4 += var6 << 28;
               var4 += var7;
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4;
               return 1;
            } else if (var0 == 3326) {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -751176573 * Client.et;
               return 1;
            } else if (var0 == 3327) {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.ef * -2076298705;
               return 1;
            } else if (3331 == var0) {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.pk * -365416549;
               return 1;
            } else {
               return 2;
            }
         }
      }
   }
}
