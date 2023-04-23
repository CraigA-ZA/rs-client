public class mg {
   public static void af_renamed(AbstractArchive var0) {
      sz.af = var0;
   }

   mg() throws Throwable {
      throw new Error();
   }

   static int bg_renamed(int var0, ClientScript var1, boolean var2) {
      if (6200 == var0) {
         Interpreter.at -= 854271946;
         Client.vv = (short)VertexNormal.bs_renamed(Interpreter.al[-964267539 * Interpreter.at]);
         if (Client.vv <= 0) {
            Client.vv = 256;
         }

         Client.va = (short)VertexNormal.bs_renamed(Interpreter.al[Interpreter.at * -964267539 + 1]);
         if (Client.va <= 0) {
            Client.va = 256;
         }

         return 1;
      } else if (var0 == 6201) {
         Interpreter.at -= 854271946;
         Client.vl = (short)Interpreter.al[-964267539 * Interpreter.at];
         if (Client.vl <= 0) {
            Client.vl = 256;
         }

         Client.ve = (short)Interpreter.al[-964267539 * Interpreter.at + 1];
         if (Client.ve <= 0) {
            Client.ve = 320;
         }

         return 1;
      } else if (6202 == var0) {
         Interpreter.at -= 1708543892;
         Client.vm = (short)Interpreter.al[Interpreter.at * -964267539];
         if (Client.vm <= 0) {
            Client.vm = 1;
         }

         Client.vn = (short)Interpreter.al[1 + -964267539 * Interpreter.at];
         if (Client.vn <= 0) {
            Client.vn = 32767;
         } else if (Client.vn < Client.vm) {
            Client.vn = Client.vm;
         }

         Client.vo = (short)Interpreter.al[2 + Interpreter.at * -964267539];
         if (Client.vo <= 0) {
            Client.vo = 1;
         }

         Client.vk = (short)Interpreter.al[3 + -964267539 * Interpreter.at];
         if (Client.vk <= 0) {
            Client.vk = 32767;
         } else if (Client.vk < Client.vo) {
            Client.vk = Client.vo;
         }

         return 1;
      } else if (6203 == var0) {
         if (Client.ps != null) {
            bt.setViewportShape(0, 0, -794961409 * Client.ps.cs, 1473950221 * Client.ps.cc, false);
            Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 433849721 * Client.vp;
            Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = Client.vy * 2042096749;
         } else {
            Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
            Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
         }

         return 1;
      } else if (var0 == 6204) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = Client.vl;
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = Client.ve;
         return 1;
      } else if (var0 == 6205) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = SoundSystem.br_renamed(Client.vv);
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = SoundSystem.br_renamed(Client.va);
         return 1;
      } else if (6220 == var0) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
         return 1;
      } else if (6221 == var0) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
         return 1;
      } else if (var0 == 6222) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = GameShell.aj * -1687260435;
         return 1;
      } else if (6223 == var0) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 1658005443 * kd.ak;
         return 1;
      } else {
         return 2;
      }
   }
}
