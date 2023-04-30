public abstract class rw {
   double aa = 0.0;
   int al = 0;
   int at = 0;
   int ay = 0;

   rw(int var1, int var2) {
      this.al = var1 * -617236073;
      this.at = 0;
      this.ay = (var2 >= 0 && var2 <= 27 ? var2 : 0) * -895713409;
      this.aa = co.ao_renamed(this.at * 1095678947, this.al * 71849511, this.ay * 570638463);
   }

   public void aa() {
      if (this.at * 1095678947 < this.al * 71849511) {
         this.at += -1759485493;
         this.aa = co.ao_renamed(1095678947 * this.at, 71849511 * this.al, 570638463 * this.ay);
      }

   }

   double ay() {
      return this.aa;
   }
}
