import accessors.RSAnimBase;

public class ik extends rp implements RSAnimBase {
   int aq;
   public static final int af = 1;
   public static final int aw = 3;
   public static final int ac = 5;
   public static final int by = 2048;
   int ab;
   int[] al;
   public static final int an = 2;
   ic aa;
   int[][] at;

   public int aw() {
      return this.aq * 1158767581;
   }

   public int af(int var1) {
      try {
         return this.aq * 1158767581;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ik.af(" + ')');
      }
   }

   public ic an(int var1) {
      try {
         return this.aa;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ik.an(" + ')');
      }
   }

   public ik(int var1, byte[] var2) {
      try {
         super();
         this.ab = -185537285 * var1;
         sg var3 = new sg(var2);
         this.aq = var3.cm((byte)7) * -714404747;
         this.al = new int[1158767581 * this.aq];
         this.at = new int[1158767581 * this.aq][];

         int var4;
         for(var4 = 0; var4 < this.aq * 1158767581; ++var4) {
            this.al[var4] = var3.cm((byte)7);
         }

         for(var4 = 0; var4 < this.aq * 1158767581; ++var4) {
            this.at[var4] = new int[var3.cm((byte)7)];
         }

         for(var4 = 0; var4 < 1158767581 * this.aq; ++var4) {
            for(int var5 = 0; var5 < this.at[var4].length; ++var5) {
               this.at[var4][var5] = var3.cm((byte)7);
            }
         }

         if (-1633313603 * var3.at < var3.al.length) {
            var4 = var3.cl(556940689);
            if (var4 > 0) {
               this.aa = new ic(var3, var4);
            }
         }

      } catch (RuntimeException var6) {
         throw db.an(var6, "ik.<init>(" + ')');
      }
   }

   public ic ac() {
      return this.aa;
   }

   public ic au() {
      return this.aa;
   }

   public ic ab() {
      return this.aa;
   }
}
