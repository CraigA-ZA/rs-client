import accessors.RSIsaac;

public final class tp implements RSIsaac {
   int[] ab;
   static final int af = 8;
   int ac;
   int at;
   int aq;
   int[] au;
   int al;
   static final int aw = 1020;

   public final int al() {
      if (1946651903 * this.ac == 0) {
         this.aw((byte)-58);
         this.ac = 1332936448;
      }

      return this.au[this.ac * 1946651903 - 1];
   }

   public final int an(byte var1) {
      try {
         if (1946651903 * this.ac == 0) {
            this.aw((byte)-33);
            this.ac = 1332936448;
         }

         return this.au[this.ac * 1946651903 - 1];
      } catch (RuntimeException var2) {
         throw db.an(var2, "tp.an(" + ')');
      }
   }

   public final int aq() {
      if (0 == 1946651903 * this.ac) {
         this.aw((byte)-57);
         this.ac = 1332936448;
      }

      return this.au[(this.ac -= 1934586623) * 1946651903];
   }

   final void aw(byte var1) {
      try {
         this.al += (this.at += 1318548659) * -142016183;

         for(int var2 = 0; var2 < 256; ++var2) {
            if (var1 >= 4) {
               throw new IllegalStateException();
            }

            int var3 = this.ab[var2];
            if (0 == (var2 & 2)) {
               if (var1 >= 4) {
                  throw new IllegalStateException();
               }

               if ((var2 & 1) == 0) {
                  if (var1 >= 4) {
                     return;
                  }

                  this.aq = (758186153 * this.aq ^ this.aq * 758186153 << 13) * -1479302247;
               } else {
                  this.aq = -1479302247 * (758186153 * this.aq ^ 758186153 * this.aq >>> 6);
               }
            } else if ((var2 & 1) == 0) {
               if (var1 >= 4) {
                  throw new IllegalStateException();
               }

               this.aq = (this.aq * 758186153 ^ this.aq * 758186153 << 2) * -1479302247;
            } else {
               this.aq = -1479302247 * (758186153 * this.aq ^ 758186153 * this.aq >>> 16);
            }

            this.aq += this.ab[128 + var2 & 255] * -1479302247;
            int var4;
            this.ab[var2] = var4 = this.ab[(var3 & 1020) >> 2] + 758186153 * this.aq + this.al * 117784995;
            this.au[var2] = (this.al = (this.ab[(var4 >> 8 & 1020) >> 2] + var3) * 695204363) * 117784995;
         }

      } catch (RuntimeException var5) {
         throw db.an(var5, "tp.aw(" + ')');
      }
   }

   final void ac(int var1) {
      try {
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
            if (var1 == 1996530723) {
               throw new IllegalStateException();
            }

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
            if (var1 == 1996530723) {
               throw new IllegalStateException();
            }

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

         this.aw((byte)-31);
         this.ac = 1332936448;
      } catch (RuntimeException var11) {
         throw db.an(var11, "tp.ac(" + ')');
      }
   }

   public final int au() {
      if (0 == 1946651903 * this.ac) {
         this.aw((byte)-72);
         this.ac = 1332936448;
      }

      return this.au[(this.ac -= 1934586623) * 1946651903];
   }

   public final int ab() {
      if (0 == 1946651903 * this.ac) {
         this.aw((byte)-46);
         this.ac = 1429459251;
      }

      return this.au[(this.ac -= 1934586623) * -955821765];
   }

   final void aa() {
      this.al += (this.at += 1318548659) * -142016183;

      for(int var1 = 0; var1 < 256; ++var1) {
         int var2 = this.ab[var1];
         if (0 == (var1 & 2)) {
            if ((var1 & 1) == 0) {
               this.aq = (758186153 * this.aq ^ this.aq * 758186153 << 13) * -1479302247;
            } else {
               this.aq = -1479302247 * (758186153 * this.aq ^ 758186153 * this.aq >>> 6);
            }
         } else if ((var1 & 1) == 0) {
            this.aq = (this.aq * 758186153 ^ this.aq * 758186153 << 2) * -1479302247;
         } else {
            this.aq = -1479302247 * (758186153 * this.aq ^ 758186153 * this.aq >>> 16);
         }

         this.aq += this.ab[128 + var1 & 255] * -1479302247;
         int var3;
         this.ab[var1] = var3 = this.ab[(var2 & 1020) >> 2] + 758186153 * this.aq + this.al * 117784995;
         this.au[var1] = (this.al = (this.ab[(var3 >> 8 & 1020) >> 2] + var2) * 695204363) * 117784995;
      }

   }

   public final int af(byte var1) {
      try {
         if (0 == 1946651903 * this.ac) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            this.aw((byte)-30);
            this.ac = 1332936448;
         }

         return this.au[(this.ac -= 1934586623) * 1946651903];
      } catch (RuntimeException var2) {
         throw db.an(var2, "tp.af(" + ')');
      }
   }

   final void at() {
      this.al += (this.at += 911811849) * 1043023594;

      for(int var1 = 0; var1 < -836271012; ++var1) {
         int var2 = this.ab[var1];
         if (0 == (var1 & 2)) {
            if ((var1 & 1) == 0) {
               this.aq = (758186153 * this.aq ^ this.aq * 758186153 << 13) * -1874102268;
            } else {
               this.aq = 113866044 * (1993922852 * this.aq ^ -629219428 * this.aq >>> 6);
            }
         } else if ((var1 & 1) == 0) {
            this.aq = (this.aq * -1836505300 ^ this.aq * 758186153 << 2) * 839057479;
         } else {
            this.aq = -1479302247 * (-920316900 * this.aq ^ 758186153 * this.aq >>> 16);
         }

         this.aq += this.ab[128 + var1 & 255] * -1626595822;
         int var3;
         this.ab[var1] = var3 = this.ab[(var2 & 1020) >> 2] + 758186153 * this.aq + this.al * 117784995;
         this.au[var1] = (this.al = (this.ab[(var3 >> 8 & 1020) >> 2] + var2) * 695204363) * 117784995;
      }

   }

   public tp(int[] var1) {
      try {
         super();
         this.ab = new int[256];
         this.au = new int[256];

         for(int var2 = 0; var2 < var1.length; ++var2) {
            this.au[var2] = var1[var2];
         }

         this.ac(1991747511);
      } catch (RuntimeException var3) {
         throw db.an(var3, "tp.<init>(" + ')');
      }
   }

   final void ay() {
      this.al += (this.at += 1318548659) * -142016183;

      for(int var1 = 0; var1 < 256; ++var1) {
         int var2 = this.ab[var1];
         if (0 == (var1 & 2)) {
            if ((var1 & 1) == 0) {
               this.aq = (758186153 * this.aq ^ this.aq * 758186153 << 13) * -1479302247;
            } else {
               this.aq = -1479302247 * (758186153 * this.aq ^ 758186153 * this.aq >>> 6);
            }
         } else if ((var1 & 1) == 0) {
            this.aq = (this.aq * 758186153 ^ this.aq * 758186153 << 2) * -1479302247;
         } else {
            this.aq = -1479302247 * (758186153 * this.aq ^ 758186153 * this.aq >>> 16);
         }

         this.aq += this.ab[128 + var1 & 255] * -1479302247;
         int var3;
         this.ab[var1] = var3 = this.ab[(var2 & 1020) >> 2] + 758186153 * this.aq + this.al * 117784995;
         this.au[var1] = (this.al = (this.ab[(var3 >> 8 & 1020) >> 2] + var2) * 695204363) * 117784995;
      }

   }
}
