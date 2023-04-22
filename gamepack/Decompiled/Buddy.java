public class Buddy extends User {
   public int int2;
   public int rank;
   public int world0 = 1128162401;

   public int world() {
      return this.world0 * 177258591;
   }

   public boolean hasWorld() {
      return this.world0 * 177258591 > 0;
   }

   Buddy() {
   }

   void set(int var1, int var2) {
      this.world0 = var1 * -1128162401;
      this.int2 = 1270747397 * var2;
   }
}
