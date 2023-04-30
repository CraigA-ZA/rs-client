import accessors.RSIntHashTable;

public class td implements RSIntHashTable {
   public static final int at = 1280;
   int[] af;

   public int ac(int var1) {
      int var2 = (this.af.length >> 1) - 1;
      int var3 = var1 & var2;

      while(true) {
         int var4 = this.af[1 + var3 + var3];
         if (-1 == var4) {
            return -1;
         }

         if (this.af[var3 + var3] == var1) {
            return var4;
         }

         var3 = 1 + var3 & var2;
      }
   }

   public int af(int var1, int var2) {
      try {
         int var3 = (this.af.length >> 1) - 1;
         int var4 = var1 & var3;

         while(true) {
            int var5 = this.af[1 + var4 + var4];
            if (-1 == var5) {
               if (var2 == -1815433325) {
                  throw new IllegalStateException();
               } else {
                  return -1;
               }
            }

            if (this.af[var4 + var4] == var1) {
               if (var2 == -1815433325) {
                  throw new IllegalStateException();
               }

               return var5;
            }

            var4 = 1 + var4 & var3;
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "td.af(" + ')');
      }
   }

   public int an(int var1) {
      int var2 = (this.af.length >> 1) - 1;
      int var3 = var1 & var2;

      while(true) {
         int var4 = this.af[1 + var3 + var3];
         if (-1 == var4) {
            return -1;
         }

         if (this.af[var3 + var3] == var1) {
            return var4;
         }

         var3 = 1 + var3 & var2;
      }
   }

   public td(int[] var1) {
      try {
         super();

         int var2;
         for(var2 = 1; var2 <= (var1.length >> 1) + var1.length; var2 <<= 1) {
         }

         this.af = new int[var2 + var2];

         int var3;
         for(var3 = 0; var3 < var2 + var2; ++var3) {
            this.af[var3] = -1;
         }

         int var4;
         for(var3 = 0; var3 < var1.length; this.af[var4 + var4 + 1] = var3++) {
            for(var4 = var1[var3] & var2 - 1; -1 != this.af[var4 + var4 + 1]; var4 = 1 + var4 & var2 - 1) {
            }

            this.af[var4 + var4] = var1[var3];
         }

      } catch (RuntimeException var5) {
         throw db.an(var5, "td.<init>(" + ')');
      }
   }

   public int aw(int var1) {
      int var2 = (this.af.length >> 1) - 1;
      int var3 = var1 & var2;

      while(true) {
         int var4 = this.af[1 + var3 + var3];
         if (-1 == var4) {
            return -1;
         }

         if (this.af[var3 + var3] == var1) {
            return var4;
         }

         var3 = 1 + var3 & var2;
      }
   }

   public int au(int var1) {
      int var2 = (this.af.length >> 1) - 1;
      int var3 = var1 & var2;

      while(true) {
         int var4 = this.af[1 + var3 + var3];
         if (-1 == var4) {
            return -1;
         }

         if (this.af[var3 + var3] == var1) {
            return var4;
         }

         var3 = 1 + var3 & var2;
      }
   }
}
