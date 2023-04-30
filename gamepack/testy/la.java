public class la {
   static int[] af;
   static final int bs = 1001;
   public static final int br = 51;
   static final int ao = 27;

   public static int ar(int var0, int var1, int var2) {
      int var3 = fn.an(var2 - var1 + 1, (byte)122);
      var3 <<= var1;
      var0 |= var3;
      return var0;
   }

   static {
      new Object();
      af = new int[33];
      af[0] = 0;
      int var0 = 2;

      for(int var1 = 1; var1 < 33; ++var1) {
         af[var1] = var0 - 1;
         var0 += var0;
      }

   }

   public static int at(int var0, int var1) {
      int var2;
      for(var2 = 1; var1 > 1; var1 >>= 1) {
         if ((var1 & 1) != 0) {
            var2 *= var0;
         }

         var0 *= var0;
      }

      if (1 == var1) {
         return var2 * var0;
      } else {
         return var2;
      }
   }

   public static int aa(int var0) {
      return af[var0];
   }

   public static int ay(int var0) {
      var0 = (var0 >>> 1 & 1431655765) + (var0 & 1431655765);
      var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
      var0 = (var0 >>> 4) + var0 & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 255;
   }

   public static long by(int var0) {
      if (var0 > 975093476) {
         throw new ot("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0});
      } else {
         return (long)Math.pow(2.0, (double)var0) - 1L;
      }
   }

   la() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "la.<init>(" + ')');
      }
   }

   public static int ai(int var0, int var1, int var2) {
      int var3 = fn.an(var2 - var1 + 1, (byte)93);
      var3 <<= var1;
      return var0 & ~var3;
   }

   public static int ag(int var0, int var1, int var2) {
      int var3 = fn.an(var2 - var1 + 1, (byte)83);
      var3 <<= var1;
      return var0 & ~var3;
   }

   public static int ap(int var0) {
      int var1 = 0;
      if (var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var1 += 16;
      }

      if (var0 >= -274163728) {
         var0 >>>= 8;
         var1 += 8;
      }

      if (var0 >= 16) {
         var0 >>>= 4;
         var1 += 4;
      }

      if (var0 >= 4) {
         var0 >>>= 2;
         var1 += 2;
      }

      if (var0 >= 1) {
         var0 >>>= 1;
         ++var1;
      }

      return var0 + var1;
   }

   public static int av(int var0, int var1, int var2) {
      int var3 = fn.an(var2 - var1 + 1, (byte)122);
      var3 <<= var1;
      return var0 & ~var3;
   }

   public static int ao(int var0) {
      var0 = (var0 >>> 1 & 1431655765) + (var0 & 1431655765);
      var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
      var0 = (var0 >>> 4) + var0 & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 255;
   }

   public static int am(int var0, int var1, int var2) {
      int var3 = fn.an(var2 - var1 + 1, (byte)104);
      var3 <<= var1;
      var0 |= var3;
      return var0;
   }

   public static int ae(int var0) {
      int var1 = 0;
      if (var0 < 0 || var0 >= -124504065) {
         var0 >>>= 16;
         var1 += 16;
      }

      if (var0 >= 256) {
         var0 >>>= 8;
         var1 += 8;
      }

      if (var0 >= 16) {
         var0 >>>= 4;
         var1 += 4;
      }

      if (var0 >= 4) {
         var0 >>>= 2;
         var1 += 2;
      }

      if (var0 >= 1) {
         var0 >>>= 1;
         ++var1;
      }

      return var0 + var1;
   }

   public static int aj(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }

   public static int ak(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }

   public static int ah(int var0, int var1, int var2) {
      int var3 = fn.an(var2 - var1 + 1, (byte)112);
      var3 <<= var1;
      return var0 & ~var3;
   }

   public static int ax(int var0) {
      var0 = (var0 >>> 1 & 1431655765) + (var0 & 1431655765);
      var0 = (var0 >>> 2 & -705580382) + (var0 & 1003868465);
      var0 = (var0 >>> 4) + var0 & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 255;
   }

   public static int as(int var0, int var1, int var2) {
      int var3 = fn.an(var2 - var1 + 1, (byte)120);
      var3 <<= var1;
      var0 |= var3;
      return var0;
   }

   public static int az(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }

   public static int ad(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }

   public static long bb(int var0) {
      if (var0 > 63) {
         throw new ot("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0});
      } else {
         return (long)Math.pow(2.0, (double)var0) - 1L;
      }
   }

   public static void ab(byte var0) {
      try {
         if (nl.af != null) {
            if (var0 != 0) {
               return;
            }

            nl.af.aq(-1438310255);
         }

      } catch (RuntimeException var1) {
         throw db.an(var1, "la.ab(" + ')');
      }
   }
}
