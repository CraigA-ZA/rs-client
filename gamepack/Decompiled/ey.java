public class ey implements Enumerated {
   static Archive archive12;
   static Archive archive15;
   static WorldMap worldMap0;
   static final ey ab = new ey(5, 5, (String)null, 3);
   static final ey ac = new ey(3, 3, (String)null, 6);
   static final ey af = new ey(0, 0, (String)null, 0);
   static final ey an = new ey(1, 1, (String)null, 9);
   static final ey au = new ey(4, 4, (String)null, 1);
   static final ey aw = new ey(2, 2, (String)null, 3);
   final int al;
   final int aq;
   final int at;

   ey(int var1, int var2, String var3, int var4) {
      this.aq = 1725401325 * var1;
      this.al = 1452340253 * var2;
      this.at = -961645797 * var4;
   }

   int ab() {
      return 1224388371 * this.at;
   }

   public int ordinal() {
      return this.al * -902992331;
   }

   static int bh_renamed(int var0, ClientScript var1, boolean var2) {
      if (7463 == var0) {
         boolean var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
         OwnWorldComparator.ox_renamed(var4);
         return 1;
      } else {
         return 2;
      }
   }
}
