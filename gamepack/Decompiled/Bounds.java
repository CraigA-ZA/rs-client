public class Bounds {
   public int height;
   public int x;
   public int y;
   public int width;

   public Bounds(int var1, int var2) {
      this(0, 0, var1, var2);
   }

   public Bounds(int var1, int var2, int var3, int var4) {
      this.setLocation(var1, var2);
      this.setSize(var3, var4);
   }

   public void setLocation(int var1, int var2) {
      this.x = var1 * 775648579;
      this.y = -1859334611 * var2;
   }

   public void setSize(int var1, int var2) {
      this.width = -1469434281 * var1;
      this.height = 149296003 * var2;
   }

   public boolean aw(int var1, int var2) {
      return var1 >= -844906645 * this.x && var1 < this.width * 944313703 + this.x * -844906645 && var2 >= this.y * 1864020389 && var2 < this.y * 1864020389 + this.height * -1376251093;
   }

   public String toString() {
      return null;
   }

   public void ac(Bounds var1, Bounds var2) {
      this.au(var1, var2);
      this.ab(var1, var2);
   }

   void au(Bounds var1, Bounds var2) {
      var2.x = 1 * this.x;
      var2.width = this.width * 1;
      if (this.x * -844906645 < var1.x * -844906645) {
         var2.width -= -413884579 * var1.x - this.x * -413884579;
         var2.x = 1 * var1.x;
      }

      if (var2.aq() > var1.aq()) {
         var2.width -= (var2.aq() - var1.aq()) * -1469434281;
      }

      if (var2.width * 944313703 < 0) {
         var2.width = 0;
      }

   }

   void ab(Bounds var1, Bounds var2) {
      var2.y = this.y * 1;
      var2.height = this.height * 1;
      if (this.y * 1864020389 < var1.y * 1864020389) {
         var2.height -= var1.y * -1743378833 - -1743378833 * this.y;
         var2.y = var1.y * 1;
      }

      if (var2.al() > var1.al()) {
         var2.height -= (var2.al() - var1.al()) * 149296003;
      }

      if (var2.height * -1376251093 < 0) {
         var2.height = 0;
      }

   }

   int aq() {
      return this.width * 944313703 + this.x * -844906645;
   }

   int al() {
      return -1376251093 * this.height + this.y * 1864020389;
   }
}
