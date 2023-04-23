public class NanoClock extends Clock {
   long lastTimeNano = System.nanoTime() * 6656301822495610875L;

   NanoClock() {
   }

   public void mark() {
      this.lastTimeNano = System.nanoTime() * 6656301822495610875L;
   }

   public int wait(int var1, int var2) {
      long var4 = (long)var2 * 1000000L;
      long var6 = 5545563677173652275L * this.lastTimeNano - System.nanoTime();
      if (var6 < var4) {
         var6 = var4;
      }

      PlayerAppearance.af(var6 / 1000000L);
      long var8 = System.nanoTime();

      int var10;
      for(var10 = 0; var10 < 10 && (var10 < 1 || 5545563677173652275L * this.lastTimeNano < var8); this.lastTimeNano += -2862317670020565824L * (long)var1) {
         ++var10;
      }

      if (5545563677173652275L * this.lastTimeNano < var8) {
         this.lastTimeNano = 6656301822495610875L * var8;
      }

      return var10;
   }
}
