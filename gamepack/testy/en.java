import accessors.RSUserComparator10;

public class en extends pz implements RSUserComparator10 {
   final boolean af;
   static rv vz;
   static final int tv = 2;
   static final int am = 19;
   public static final int aq = 32;

   public int ab(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, 2061002589);
   }

   int af(pb var1, pb var2, int var3) {
      try {
         if (177258591 * var1.au == -453810525 * client.bw) {
            if (var3 == -549033243) {
               throw new IllegalStateException();
            }

            if (177258591 * var2.au == client.bw * -453810525) {
               if (var3 == -549033243) {
                  throw new IllegalStateException();
               }

               int var10000;
               if (this.af) {
                  if (var3 == -549033243) {
                     throw new IllegalStateException();
                  }

                  var10000 = 1907692493 * var1.ab - 1907692493 * var2.ab;
               } else {
                  var10000 = 1907692493 * var2.ab - var1.ab * 1907692493;
               }

               return var10000;
            }
         }

         return this.ao(var1, var2, 641920470);
      } catch (RuntimeException var4) {
         throw db.an(var4, "en.af(" + ')');
      }
   }

   int an(pb var1, pb var2) {
      if (177258591 * var1.au == -453810525 * client.bw && 177258591 * var2.au == client.bw * -453810525) {
         return this.af ? 1907692493 * var1.ab - 1907692493 * var2.ab : 1907692493 * var2.ab - var1.ab * 1907692493;
      } else {
         return this.ao(var1, var2, 641920470);
      }
   }

   public int al(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, 987427124);
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.af((pb)var1, (pb)var2, -430449272);
      } catch (RuntimeException var3) {
         throw db.an(var3, "en.compare(" + ')');
      }
   }

   public int aq(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, -1474905162);
   }

   public en(boolean var1) {
      try {
         super();
         this.af = var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "en.<init>(" + ')');
      }
   }

   public int au(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, 1707876368);
   }

   int aw(pb var1, pb var2) {
      if (1912150627 * var1.au == 534351448 * client.bw && 177258591 * var2.au == client.bw * -1615585009) {
         return this.af ? 1907692493 * var1.ab - 1907692493 * var2.ab : -1152119350 * var2.ab - var1.ab * 1907692493;
      } else {
         return this.ao(var1, var2, 641920470);
      }
   }
}
