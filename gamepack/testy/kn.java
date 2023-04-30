public class kn {
   static final int al = 10;
   public static final int af = 256;
   static int[] ao;
   static final int ar = 20;
   public static final int ag = 16384;
   public static final int ad = 22;

   public static void an(int var0, int var1, int var2) {
      try {
         int var4;
         int var5;
         int var7;
         label29: {
            hg var3 = gs.an(var0, -428444865);
            var4 = 470400793 * var3.aw;
            var5 = var3.ac * 1050888611;
            int var6 = var3.au * 1130237503;
            var7 = le.af[var6 - var5];
            if (var1 >= 0) {
               if (var2 <= -91537313) {
                  throw new IllegalStateException();
               }

               if (var1 <= var7) {
                  break label29;
               }

               if (var2 <= -91537313) {
                  return;
               }
            }

            var1 = 0;
         }

         var7 <<= var5;
         le.aw[var4] = le.aw[var4] & ~var7 | var1 << var5 & var7;
      } catch (RuntimeException var8) {
         throw db.an(var8, "kn.an(" + ')');
      }
   }

   static final int af(sw var0, int var1) {
      try {
         if (null == var0) {
            if (var1 >= -136432346) {
               throw new IllegalStateException();
            } else {
               return 12;
            }
         } else {
            switch (var0.aa * -874502107) {
               case 5:
                  return 20;
               default:
                  return 12;
            }
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "kn.af(" + ')');
      }
   }

   kn() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "kn.<init>(" + ')');
      }
   }
}
