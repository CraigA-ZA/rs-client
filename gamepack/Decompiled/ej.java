import java.util.Comparator;

public class ej implements Comparator {
   final boolean af;
   static int[] ax;

   static void nc_renamed(Packet var0, int var1) {
      byte[] var3 = var0.array;
      if (null == Client.hf) {
         Client.hf = new byte[24];
      }

      op.af_renamed(var3, var1, Client.hf, 0, 24);
      gx.ac_renamed(var0, var1);
   }

   int af(Buddy var1, Buddy var2) {
      return this.af ? 1907692493 * var1.int2 - 1907692493 * var2.int2 : var2.int2 * 1907692493 - 1907692493 * var1.int2;
   }

   public int compare(Object var1, Object var2) {
      return this.af((Buddy)var1, (Buddy)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   static int bt_renamed(int var0, ClientScript var1, boolean var2) {
      if (5306 == var0) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = na.iv_renamed();
         return 1;
      } else {
         int var4;
         if (5307 == var0) {
            var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (var4 == 1 || var4 == 2) {
               Decimator.ir_renamed(var4);
            }

            return 1;
         } else if (5308 == var0) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = aj.clientPreferences.bi();
            return 1;
         } else if (5309 != var0) {
            if (5310 == var0) {
               Interpreter.Interpreter_intStackSize -= 427135973;
               return 1;
            } else {
               return 2;
            }
         } else {
            var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (1 == var4 || var4 == 2) {
               aj.clientPreferences.bb(var4);
            }

            return 1;
         }
      }
   }

   public static ac af_renamed(aq var0) {
      switch (var0.an * -1098467785) {
         case 0:
            return new af();
         default:
            throw new IllegalArgumentException();
      }
   }

   static dj[] au_renamed() {
      return new dj[]{dj.au, dj.af, dj.an, dj.aw, dj.ac};
   }

   public ej(boolean var1) {
      this.af = var1;
   }
}
