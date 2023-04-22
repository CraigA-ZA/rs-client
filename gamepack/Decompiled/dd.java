public class dd {
   int ac;
   int an;
   int aw;
   public static int[] ab;
   int af;

   int an() {
      return this.an * 446388583;
   }

   int aw() {
      return -1357124753 * this.aw;
   }

   dd(int var1, int var2, int var3, int var4) {
      this.af = -543519 * var1;
      this.an = var2 * -1866616233;
      this.aw = -942287985 * var3;
      this.ac = var4 * 1074949955;
   }

   int af() {
      return 2080935713 * this.af;
   }

   int ac() {
      return 1073288555 * this.ac;
   }

   static int af_renamed(int var0, int var1) {
      if (-2 == var0) {
         return 12345678;
      } else if (-1 == var0) {
         if (var1 < 0) {
            var1 = 0;
         } else if (var1 > 127) {
            var1 = 127;
         }

         var1 = 127 - var1;
         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1 + (var0 & 'ﾀ');
      }
   }
}
