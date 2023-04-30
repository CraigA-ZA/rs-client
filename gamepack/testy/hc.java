public class hc extends rk {
   static final int aa = 32;
   static nd ff;

   public static int af(int var0, int var1) {
      try {
         return var0 >> 11 & 63;
      } catch (RuntimeException var2) {
         throw db.an(var2, "hc.af(" + ')');
      }
   }

   hc() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "hc.<init>(" + ')');
      }
   }

   static {
      new kh(64);
   }

   public static void af(nm var0, int var1) {
      try {
         ho.af = var0;
      } catch (RuntimeException var2) {
         throw db.an(var2, "hc.af(" + ')');
      }
   }

   static final boolean aj(int var0, int var1, int var2) {
      try {
         hq var3 = fw.an(var0, (short)27574);
         if (11 == var1) {
            if (var2 <= 669295600) {
               throw new IllegalStateException();
            }

            var1 = 10;
         }

         if (var1 >= 5) {
            if (var2 <= 669295600) {
               throw new IllegalStateException();
            }

            if (var1 <= 8) {
               if (var2 <= 669295600) {
                  throw new IllegalStateException();
               }

               var1 = 4;
            }
         }

         return var3.ab(var1, -1491101758);
      } catch (RuntimeException var4) {
         throw db.an(var4, "hc.aj(" + ')');
      }
   }

   public static ht an(int var0, int var1) {
      try {
         ht var2 = (ht)ht.an.af((long)var0);
         if (null != var2) {
            if (var1 >= -132716496) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = ht.af.bh(34, var0, (byte)-76);
            var2 = new ht();
            if (null != var3) {
               if (var1 >= -132716496) {
                  throw new IllegalStateException();
               }

               var2.ac(new sg(var3), -1875219485);
            }

            var2.aw(-1436129588);
            ht.an.aw(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "hc.an(" + ')');
      }
   }
}
