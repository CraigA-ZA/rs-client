import accessors.RSLoginProt;

public class lf implements km, RSLoginProt {
   public static final lf au = new lf(19, -2);
   static final lf an = new lf(15, 4);
   static final int at = 256;
   public static final lf ac = new lf(18, -2);
   public static final lf aw = new lf(16, -2);
   static final lf ab = new lf(27, 0);
   public static final lf af = new lf(14, 0);
   static final lf[] al = new lf[32];
   public final int aq;
   public static final int aa = 12;

   static {
      lf[] var0 = bz.af((byte)0);

      for(int var1 = 0; var1 < var0.length; ++var1) {
         al[var0[var1].aq * 537668749] = var0[var1];
      }

   }

   static lf[] aw() {
      return new lf[]{ac, ab, an, aw, af, au};
   }

   static lf[] an() {
      return new lf[]{ac, ab, an, aw, af, au};
   }

   lf(int var1, int var2) {
      try {
         super();
         this.aq = var1 * 1990948421;
      } catch (RuntimeException var3) {
         throw db.an(var3, "lf.<init>(" + ')');
      }
   }

   static lf[] ac() {
      return new lf[]{ac, ab, an, aw, af, au};
   }

   public static int aq(int var0, int var1) {
      try {
         int var2;
         label59: {
            var2 = 0;
            if (var0 >= 0) {
               if (var1 >= -135563578) {
                  throw new IllegalStateException();
               }

               if (var0 < 65536) {
                  break label59;
               }

               if (var1 >= -135563578) {
                  throw new IllegalStateException();
               }
            }

            var0 >>>= 16;
            var2 += 16;
         }

         if (var0 >= 256) {
            if (var1 >= -135563578) {
               throw new IllegalStateException();
            }

            var0 >>>= 8;
            var2 += 8;
         }

         if (var0 >= 16) {
            if (var1 >= -135563578) {
               throw new IllegalStateException();
            }

            var0 >>>= 4;
            var2 += 4;
         }

         if (var0 >= 4) {
            if (var1 >= -135563578) {
               throw new IllegalStateException();
            }

            var0 >>>= 2;
            var2 += 2;
         }

         if (var0 >= 1) {
            if (var1 >= -135563578) {
               throw new IllegalStateException();
            }

            var0 >>>= 1;
            ++var2;
         }

         return var0 + var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "lf.aq(" + ')');
      }
   }
}
