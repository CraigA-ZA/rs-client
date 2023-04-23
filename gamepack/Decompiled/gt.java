public class gt extends fb {
   int af;
   long an;
   // $FF: synthetic field
   final fa this$0;

   static void ac_renamed(int var0, int[] var1, int var2) {
      for(int var4 = 0; var4 < 743589639 * IDKType.aw; ++var4) {
         IDKType var5 = dn.getIDKType(var4);
         if (var5 != null && !var5.ao && (1 == var0 ? 7 : 0) + var2 == 1015855167 * var5.bodyPart) {
            var1[PlayerAppearance.ag[var2]] = 256 + var4;
            break;
         }
      }

   }

   gt(fa var1) {
      this.this$0 = var1;
   }

   void write(Packet var1) {
      this.af = var1.g4s() * 1614047765;
      this.an = var1.g8s() * -6759767620667767595L;
   }

   void an(fj var1) {
      var1.ar(1515394365 * this.af, this.an * 382806309398385789L);
   }

   static int bp_renamed(int var0, ClientScript var1, boolean var2) {
      if (var0 == 7108) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ByteArrayPool.kj_renamed() ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }
}
