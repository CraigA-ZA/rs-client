public class AttackOption implements Enumerated {
   static final AttackOption ac = new AttackOption(2);
   static final AttackOption af = new AttackOption(-1);
   static final AttackOption an = new AttackOption(0);
   static final AttackOption aw = new AttackOption(1);
   final int au;

   AttackOption(int var1) {
      this.au = 521487647 * var1;
   }

   public int ordinal() {
      return this.au * -1923877153;
   }
}
