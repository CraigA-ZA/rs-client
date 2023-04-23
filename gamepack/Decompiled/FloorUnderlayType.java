public class FloorUnderlayType extends DualNode {
   public static EvictingDualNodeHashTable an = new EvictingDualNodeHashTable(64);
   public static AbstractArchive af;
   static int cw;
   static Archive fr;
   static tf sn;
   int aw = 0;
   public int ab;
   public int ac;
   public int aq;
   public int au;

   public void clear() {
      this.setHsl(this.aw * 86825461);
   }

   public void decode(Packet var1, int var2) {
      while(true) {
         int var4 = var1.g1();
         if (var4 == 0) {
            return;
         }

         this.decode0(var1, var4, var2);
      }
   }

   void decode0(Packet var1, int var2, int var3) {
      if (var2 == 1) {
         this.aw = var1.cr() * 1952729693;
      }

   }

   void setHsl(int var1) {
      double var3 = (double)(var1 >> 16 & 255) / 256.0;
      double var5 = (double)(var1 >> 8 & 255) / 256.0;
      double var7 = (double)(var1 & 255) / 256.0;
      double var9 = var3;
      if (var5 < var3) {
         var9 = var5;
      }

      if (var7 < var9) {
         var9 = var7;
      }

      double var11 = var3;
      if (var5 > var3) {
         var11 = var5;
      }

      if (var7 > var11) {
         var11 = var7;
      }

      double var13 = 0.0;
      double var15 = 0.0;
      double var17 = (var11 + var9) / 2.0;
      if (var9 != var11) {
         if (var17 < 0.5) {
            var15 = (var11 - var9) / (var9 + var11);
         }

         if (var17 >= 0.5) {
            var15 = (var11 - var9) / (2.0 - var11 - var9);
         }

         if (var3 == var11) {
            var13 = (var5 - var7) / (var11 - var9);
         } else if (var5 == var11) {
            var13 = (var7 - var3) / (var11 - var9) + 2.0;
         } else if (var7 == var11) {
            var13 = 4.0 + (var3 - var5) / (var11 - var9);
         }
      }

      var13 /= 6.0;
      this.au = (int)(var15 * 256.0) * 479912699;
      this.ab = (int)(var17 * 256.0) * 239606945;
      if (1058265139 * this.au < 0) {
         this.au = 0;
      } else if (this.au * 1058265139 > 255) {
         this.au = 2118653957;
      }

      if (this.ab * -1527986335 < 0) {
         this.ab = 0;
      } else if (-1527986335 * this.ab > 255) {
         this.ab = 970228831;
      }

      if (var17 > 0.5) {
         this.aq = 335859721 * (int)((1.0 - var17) * var15 * 512.0);
      } else {
         this.aq = (int)(512.0 * var17 * var15) * 335859721;
      }

      if (this.aq * -2012234183 < 1) {
         this.aq = 335859721;
      }

      this.ac = 1936467539 * (int)((double)(this.aq * -2012234183) * var13);
   }

   public static String longToTitleString(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; 0L != var3; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5;
            char var8;
            for(var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
               long var6 = var0;
               var0 /= 37L;
               var8 = oy.af[(int)(var6 - var0 * 37L)];
               if ('_' == var8) {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = 160;
               }
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

   public static void au_renamed() {
      sa.ac.ao();
      ly.au = -626822165;
      ly.ab = null;
   }
}
