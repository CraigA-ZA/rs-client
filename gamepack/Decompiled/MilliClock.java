public class MilliClock extends Clock {
   static int ux;
   int ab;
   int an = 1682640640;
   int au = 0;
   int aw = 889500577;
   long ac = Formatting.currentTimeMs() * 3111052400392486887L;
   long[] af = new long[10];

   MilliClock() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.af[var1] = this.ac * -3320355304386370601L;
      }

   }

   public void mark() {
      for(int var2 = 0; var2 < 10; ++var2) {
         this.af[var2] = 0L;
      }

   }

   public int wait(int var1, int var2) {
      int var4 = 1354187759 * this.an;
      int var5 = -1087246239 * this.aw;
      this.an = -779618924;
      this.aw = 889500577;
      this.ac = Formatting.currentTimeMs() * 3111052400392486887L;
      if (0L == this.af[this.ab * 1512168621]) {
         this.an = -1520153841 * var4;
         this.aw = var5 * 889500577;
      } else if (-3320355304386370601L * this.ac > this.af[this.ab * 1512168621]) {
         this.an = (int)((long)(2560 * var1) / (-3320355304386370601L * this.ac - this.af[1512168621 * this.ab])) * -1520153841;
      }

      if (this.an * 1354187759 < 25) {
         this.an = 650859639;
      }

      if (1354187759 * this.an > 256) {
         this.an = 1682640640;
         this.aw = (int)((long)var1 - (-3320355304386370601L * this.ac - this.af[this.ab * 1512168621]) / 10L) * 889500577;
      }

      if (this.aw * -1087246239 > var1) {
         this.aw = 889500577 * var1;
      }

      this.af[1512168621 * this.ab] = -3320355304386370601L * this.ac;
      this.ab = -213391579 * ((1 + 1512168621 * this.ab) % 10);
      int var6;
      if (this.aw * -1087246239 > 1) {
         for(var6 = 0; var6 < 10; ++var6) {
            if (0L != this.af[var6]) {
               this.af[var6] += (long)(this.aw * -1087246239);
            }
         }
      }

      if (-1087246239 * this.aw < var2) {
         this.aw = var2 * 889500577;
      }

      PlayerAppearance.af((long)(-1087246239 * this.aw));

      for(var6 = 0; 1554226597 * this.au < 256; this.au += this.an * -1933259005) {
         ++var6;
      }

      this.au = (1554226597 * this.au & 255) * -1269169619;
      return var6;
   }
}
