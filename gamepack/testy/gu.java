import accessors.RSNanoClock;

public class gu extends gv implements RSNanoClock {
   long af;

   public void af(int var1) {
      try {
         this.af = System.nanoTime() * 6656301822495610875L;
      } catch (RuntimeException var2) {
         throw db.an(var2, "gu.af(" + ')');
      }
   }

   public void au() {
      this.af = System.nanoTime() * 6656301822495610875L;
   }

   public int aq(int var1, int var2) {
      long var3 = (long)var2 * 1000000L;
      long var5 = 5545563677173652275L * this.af - System.nanoTime();
      if (var5 < var3) {
         var5 = var3;
      }

      mw.af(var5 / 1000000L);
      long var7 = System.nanoTime();

      int var9;
      for(var9 = 0; var9 < 10 && (var9 < 1 || 5545563677173652275L * this.af < var7); this.af += -2862317670020565824L * (long)var1) {
         ++var9;
      }

      if (5545563677173652275L * this.af < var7) {
         this.af = 6656301822495610875L * var7;
      }

      return var9;
   }

   gu() {
      try {
         super();
         this.af = System.nanoTime() * 6656301822495610875L;
      } catch (RuntimeException var1) {
         throw db.an(var1, "gu.<init>(" + ')');
      }
   }

   public void ac() {
      this.af = System.nanoTime() * 6656301822495610875L;
   }

   public int an(int var1, int var2, int var3) {
      try {
         long var4 = (long)var2 * 1000000L;
         long var6 = 5545563677173652275L * this.af - System.nanoTime();
         if (var6 < var4) {
            if (var3 >= -92512277) {
               throw new IllegalStateException();
            }

            var6 = var4;
         }

         mw.af(var6 / 1000000L);
         long var8 = System.nanoTime();

         int var10;
         for(var10 = 0; var10 < 10; this.af += -2862317670020565824L * (long)var1) {
            if (var3 >= -92512277) {
               throw new IllegalStateException();
            }

            if (var10 >= 1) {
               if (var3 >= -92512277) {
                  throw new IllegalStateException();
               }

               if (5545563677173652275L * this.af >= var8) {
                  break;
               }

               if (var3 >= -92512277) {
                  throw new IllegalStateException();
               }
            }

            ++var10;
         }

         if (5545563677173652275L * this.af < var8) {
            this.af = 6656301822495610875L * var8;
         }

         return var10;
      } catch (RuntimeException var11) {
         throw db.an(var11, "gu.an(" + ')');
      }
   }

   public int ab(int var1, int var2) {
      long var3 = (long)var2 * 1000000L;
      long var5 = 5545563677173652275L * this.af - System.nanoTime();
      if (var5 < var3) {
         var5 = var3;
      }

      mw.af(var5 / 1000000L);
      long var7 = System.nanoTime();

      int var9;
      for(var9 = 0; var9 < 10 && (var9 < 1 || 5545563677173652275L * this.af < var7); this.af += -2862317670020565824L * (long)var1) {
         ++var9;
      }

      if (5545563677173652275L * this.af < var7) {
         this.af = 6656301822495610875L * var7;
      }

      return var9;
   }

   public void aw() {
      this.af = System.nanoTime() * 6656301822495610875L;
   }
}
