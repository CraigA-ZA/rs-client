import java.util.concurrent.ThreadPoolExecutor;

public class ot extends RuntimeException {
   static ThreadPoolExecutor al;

   public ot(String var1, Object[] var2) {
      try {
         super(String.format(var1, var2));
      } catch (RuntimeException var3) {
         throw db.an(var3, "ot.<init>(" + ')');
      }
   }

   static final void jf(int var0, int var1, int var2, int var3) {
      try {
         if (var0 >= 128) {
            if (var3 >= 1630906241) {
               throw new IllegalStateException();
            }

            if (var1 >= 128) {
               if (var3 >= 1630906241) {
                  throw new IllegalStateException();
               }

               if (var0 <= 13056) {
                  if (var3 >= 1630906241) {
                     return;
                  }

                  if (var1 <= 13056) {
                     int var4 = fq.jw(var0, var1, -1727408401 * bm.mh, (byte)-17) - var2;
                     var0 -= bt.kx * -2100544359;
                     var4 -= gk.kv * 1772923873;
                     var1 -= ly.ke * -91399205;
                     int var5 = in.ac[1897923909 * jb.ky];
                     int var6 = in.au[jb.ky * 1897923909];
                     int var7 = in.ac[-1010818347 * ek.kh];
                     int var8 = in.au[-1010818347 * ek.kh];
                     int var9 = var8 * var0 + var7 * var1 >> 16;
                     var1 = var1 * var8 - var7 * var0 >> 16;
                     var0 = var9;
                     var9 = var6 * var4 - var5 * var1 >> 16;
                     var1 = var1 * var6 + var4 * var5 >> 16;
                     if (var1 >= 50) {
                        if (var3 >= 1630906241) {
                           throw new IllegalStateException();
                        }

                        client.mz = (433849721 * client.vp / 2 + var0 * client.vi * -1114517553 / var1) * -846498395;
                        client.mu = -1610031701 * (client.vy * 2042096749 / 2 + var9 * -1114517553 * client.vi / var1);
                     } else {
                        client.mz = 846498395;
                        client.mu = 1610031701;
                     }

                     return;
                  }

                  if (var3 >= 1630906241) {
                     throw new IllegalStateException();
                  }
               }
            }
         }

         client.mz = 846498395;
         client.mu = 1610031701;
      } catch (RuntimeException var10) {
         throw db.an(var10, "ot.jf(" + ')');
      }
   }
}
