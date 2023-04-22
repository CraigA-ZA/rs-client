public class Bounds {
   public int aw;
   public int an;
   public int af;
   public int ac;

   public void an(int var1, int var2) {
      this.aw = -1469434281 * var1;
      this.ac = 149296003 * var2;
   }

   public void af(int var1, int var2) {
      this.af = var1 * 775648579;
      this.an = -1859334611 * var2;
   }

   public Bounds(int var1, int var2) {
      this(0, 0, var1, var2);
   }

   public boolean aw(int var1, int var2) {
      return var1 >= -844906645 * this.af && var1 < this.aw * 944313703 + this.af * -844906645 && var2 >= this.an * 1864020389 && var2 < this.an * 1864020389 + this.ac * -1376251093;
   }

   public String toString() {
      return null;
   }

   void au(Bounds var1, Bounds var2) {
      var2.af = 1 * this.af;
      var2.aw = this.aw * 1;
      if (this.af * -844906645 < var1.af * -844906645) {
         var2.aw -= -413884579 * var1.af - this.af * -413884579;
         var2.af = 1 * var1.af;
      }

      if (var2.aq() > var1.aq()) {
         var2.aw -= (var2.aq() - var1.aq()) * -1469434281;
      }

      if (var2.aw * 944313703 < 0) {
         var2.aw = 0;
      }

   }

   void ab(Bounds var1, Bounds var2) {
      var2.an = this.an * 1;
      var2.ac = this.ac * 1;
      if (this.an * 1864020389 < var1.an * 1864020389) {
         var2.ac -= var1.an * -1743378833 - -1743378833 * this.an;
         var2.an = var1.an * 1;
      }

      if (var2.al() > var1.al()) {
         var2.ac -= (var2.al() - var1.al()) * 149296003;
      }

      if (var2.ac * -1376251093 < 0) {
         var2.ac = 0;
      }

   }

   int aq() {
      return this.aw * 944313703 + this.af * -844906645;
   }

   public void ac(Bounds var1, Bounds var2) {
      this.au(var1, var2);
      this.ab(var1, var2);
   }

   int al() {
      return -1376251093 * this.ac + this.an * 1864020389;
   }

   public Bounds(int var1, int var2, int var3, int var4) {
      this.af(var1, var2);
      this.an(var3, var4);
   }
}
