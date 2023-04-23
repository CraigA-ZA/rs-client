public final class TilePaint {
   boolean ab = true;
   int ac;
   int af;
   int an;
   int aq;
   int au;
   int aw;

   TilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.af = var1 * 1110698183;
      this.an = 450282055 * var2;
      this.aw = var3 * -615792113;
      this.ac = var4 * 1943953885;
      this.au = 1567743091 * var5;
      this.aq = 810771411 * var6;
      this.ab = var7;
   }

   public static String aw_renamed(Packet var0) {
      String var2;
      try {
         int var3 = var0.cd();
         if (var3 > 32767) {
            var3 = 32767;
         }

         byte[] var4 = new byte[var3];
         var0.at += mv.af.an(var0.al, -1633313603 * var0.at, var4, 0, var3) * -1516355947;
         String var5 = Packet.ab_renamed(var4, 0, var3);
         var2 = var5;
      } catch (Exception var6) {
         var2 = "Cabbage";
      }

      return var2;
   }

   static int ak_renamed(int var0, ClientScript var1, boolean var2) {
      Component var4;
      if (var0 == 2700) {
         var4 = gh.an_renamed(Interpreter.al[(Interpreter.at -= 427135973) * -964267539]);
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -2006098851 * var4.gn;
         return 1;
      } else if (var0 == 2701) {
         var4 = gh.an_renamed(Interpreter.al[(Interpreter.at -= 427135973) * -964267539]);
         if (var4.gn * -2006098851 != -1) {
            Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var4.gv * 1336975799;
         } else {
            Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
         }

         return 1;
      } else if (2702 == var0) {
         int var6 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
         InterfaceParent var5 = (InterfaceParent)Client.oc.get((long)var6);
         if (null != var5) {
            Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 1;
         } else {
            Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
         }

         return 1;
      } else if (2706 == var0) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = Client.or * -896157613;
         return 1;
      } else if (2707 == var0) {
         var4 = gh.an_renamed(Interpreter.al[(Interpreter.at -= 427135973) * -964267539]);
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var4.by() ? 1 : 0;
         return 1;
      } else if (2708 == var0) {
         var4 = gh.an_renamed(Interpreter.al[(Interpreter.at -= 427135973) * -964267539]);
         return BufferedSource.ah_renamed(var4);
      } else if (var0 == 2709) {
         var4 = gh.an_renamed(Interpreter.al[(Interpreter.at -= 427135973) * -964267539]);
         return au.av_renamed(var4);
      } else {
         return 2;
      }
   }

   static final void addMiniMenuEntry(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      if (!Client.nt) {
         if (Client.ne * 730065501 < 500) {
            Client.og[730065501 * Client.ne] = var0;
            Client.ok[Client.ne * 730065501] = var1;
            Client.nh[730065501 * Client.ne] = var2;
            Client.nq[730065501 * Client.ne] = var3;
            Client.nk[Client.ne * 730065501] = var4;
            Client.ni[730065501 * Client.ne] = var5;
            Client.oi[Client.ne * 730065501] = var6;
            Client.ox[730065501 * Client.ne] = var7;
            Client.ne += 1153055221;
         }

      }
   }
}
