import java.util.Comparator;

final class np implements Comparator {
   static final int ac = 16384;
   static final int wl = -2;

   public int ab(Object var1, Object var2) {
      return this.af((nu)var1, (nu)var2, (byte)120);
   }

   int an(nu var1, nu var2) {
      return var1.an * -2107275097961185091L < -2107275097961185091L * var2.an ? -1 : (-2107275097961185091L * var1.an == -2107275097961185091L * var2.an ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.af((nu)var1, (nu)var2, (byte)76);
      } catch (RuntimeException var3) {
         throw db.an(var3, "np.compare(" + ')');
      }
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw db.an(var2, "np.equals(" + ')');
      }
   }

   public int au(Object var1, Object var2) {
      return this.af((nu)var1, (nu)var2, (byte)50);
   }

   int af(nu var1, nu var2, byte var3) {
      try {
         int var10000;
         if (var1.an * -2107275097961185091L < -2107275097961185091L * var2.an) {
            if (var3 <= 4) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else {
            var10000 = -2107275097961185091L * var1.an == -2107275097961185091L * var2.an ? 0 : 1;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw db.an(var4, "np.af(" + ')');
      }
   }

   public int al(Object var1, Object var2) {
      return this.af((nu)var1, (nu)var2, (byte)46);
   }

   public boolean gm(Object var1) {
      return super.equals(var1);
   }

   public boolean gi(Object var1) {
      return super.equals(var1);
   }

   public boolean gq(Object var1) {
      return super.equals(var1);
   }

   public boolean gk(Object var1) {
      return super.equals(var1);
   }

   public int aq(Object var1, Object var2) {
      return this.af((nu)var1, (nu)var2, (byte)19);
   }

   int aw(nu var1, nu var2) {
      return var1.an * -2107275097961185091L < -2107275097961185091L * var2.an ? -1 : (-2107275097961185091L * var1.an == -2107275097961185091L * var2.an ? 0 : 1);
   }

   int ac(nu var1, nu var2) {
      return var1.an * -2107275097961185091L < -2107275097961185091L * var2.an ? -1 : (-2107275097961185091L * var1.an == -2107275097961185091L * var2.an ? 0 : 1);
   }

   public static nh jk(byte var0) {
      try {
         return client.rq;
      } catch (RuntimeException var1) {
         throw db.an(var1, "np.jk(" + ')');
      }
   }
}
