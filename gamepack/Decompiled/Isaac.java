public final class Isaac {
   int ac;
   int al;
   int aq;
   int at;
   int[] ab = new int[256];
   int[] au = new int[256];

   public Isaac(int[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.au[var2] = var1[var2];
      }

      this.ac();
   }

   public final int af() {
      if (0 == 1946651903 * this.ac) {
         this.aw();
         this.ac = 1332936448;
      }

      return this.au[(this.ac -= 1934586623) * 1946651903];
   }

   public final int an() {
      if (1946651903 * this.ac == 0) {
         this.aw();
         this.ac = 1332936448;
      }

      return this.au[this.ac * 1946651903 - 1];
   }

   final void aw() {
      this.al += (this.at += 1318548659) * -142016183;

      for(int var2 = 0; var2 < 256; ++var2) {
         int var3 = this.ab[var2];
         if (0 == (var2 & 2)) {
            if ((var2 & 1) == 0) {
               this.aq = (758186153 * this.aq ^ this.aq * 758186153 << 13) * -1479302247;
            } else {
               this.aq = -1479302247 * (758186153 * this.aq ^ 758186153 * this.aq >>> 6);
            }
         } else if ((var2 & 1) == 0) {
            this.aq = (this.aq * 758186153 ^ this.aq * 758186153 << 2) * -1479302247;
         } else {
            this.aq = -1479302247 * (758186153 * this.aq ^ 758186153 * this.aq >>> 16);
         }

         this.aq += this.ab[128 + var2 & 255] * -1479302247;
         int var4;
         this.ab[var2] = var4 = this.ab[(var3 & 1020) >> 2] + 758186153 * this.aq + this.al * 117784995;
         this.au[var2] = (this.al = (this.ab[(var4 >> 8 & 1020) >> 2] + var3) * 695204363) * 117784995;
      }

   }

   final void ac() {
      int var10 = -1640531527;
      int var9 = -1640531527;
      int var8 = -1640531527;
      int var7 = -1640531527;
      int var6 = -1640531527;
      int var5 = -1640531527;
      int var4 = -1640531527;
      int var3 = -1640531527;

      int var2;
      for(var2 = 0; var2 < 4; ++var2) {
         var3 ^= var4 << 11;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 >>> 2;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 << 8;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 >>> 16;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 << 10;
         var10 += var7;
         var8 += var9;
         var8 ^= var9 >>> 4;
         var3 += var8;
         var9 += var10;
         var9 ^= var10 << 8;
         var4 += var9;
         var10 += var3;
         var10 ^= var3 >>> 9;
         var5 += var10;
         var3 += var4;
      }

      for(var2 = 0; var2 < 256; var2 += 8) {
         var3 += this.au[var2];
         var4 += this.au[var2 + 1];
         var5 += this.au[var2 + 2];
         var6 += this.au[var2 + 3];
         var7 += this.au[4 + var2];
         var8 += this.au[var2 + 5];
         var9 += this.au[6 + var2];
         var10 += this.au[7 + var2];
         var3 ^= var4 << 11;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 >>> 2;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 << 8;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 >>> 16;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 << 10;
         var10 += var7;
         var8 += var9;
         var8 ^= var9 >>> 4;
         var3 += var8;
         var9 += var10;
         var9 ^= var10 << 8;
         var4 += var9;
         var10 += var3;
         var10 ^= var3 >>> 9;
         var5 += var10;
         var3 += var4;
         this.ab[var2] = var3;
         this.ab[1 + var2] = var4;
         this.ab[var2 + 2] = var5;
         this.ab[var2 + 3] = var6;
         this.ab[var2 + 4] = var7;
         this.ab[var2 + 5] = var8;
         this.ab[6 + var2] = var9;
         this.ab[var2 + 7] = var10;
      }

      for(var2 = 0; var2 < 256; var2 += 8) {
         var3 += this.ab[var2];
         var4 += this.ab[var2 + 1];
         var5 += this.ab[var2 + 2];
         var6 += this.ab[3 + var2];
         var7 += this.ab[var2 + 4];
         var8 += this.ab[var2 + 5];
         var9 += this.ab[6 + var2];
         var10 += this.ab[7 + var2];
         var3 ^= var4 << 11;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 >>> 2;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 << 8;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 >>> 16;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 << 10;
         var10 += var7;
         var8 += var9;
         var8 ^= var9 >>> 4;
         var3 += var8;
         var9 += var10;
         var9 ^= var10 << 8;
         var4 += var9;
         var10 += var3;
         var10 ^= var3 >>> 9;
         var5 += var10;
         var3 += var4;
         this.ab[var2] = var3;
         this.ab[1 + var2] = var4;
         this.ab[var2 + 2] = var5;
         this.ab[var2 + 3] = var6;
         this.ab[4 + var2] = var7;
         this.ab[var2 + 5] = var8;
         this.ab[6 + var2] = var9;
         this.ab[var2 + 7] = var10;
      }

      this.aw();
      this.ac = 1332936448;
   }
}
