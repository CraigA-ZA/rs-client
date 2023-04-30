public class ta implements nj {
   public final int ac;
   static final ta an = new ta(1, 1);
   static final ta aw = new ta(2, 2);
   final int au;
   public static final ta af = new ta(0, 0);
   static final int ao = 11;

   static void an(int var0, int var1, int var2) {
      try {
         int[] var3 = new int[4];
         int[] var4 = new int[4];
         var3[0] = var0;
         var4[0] = var1;
         int var5 = 1;

         for(int var6 = 0; var6 < 4; ++var6) {
            if (var0 != cl.at[var6]) {
               if (var2 >= 207612479) {
                  return;
               }

               var3[var5] = cl.at[var6];
               var4[var5] = cl.al[var6];
               ++var5;
            }
         }

         cl.at = var3;
         cl.al = var4;
         ex.aw(bx.au, 0, bx.au.length - 1, cl.at, cl.al, -139825594);
      } catch (RuntimeException var7) {
         throw db.an(var7, "ta.an(" + ')');
      }
   }

   public int af(int var1) {
      try {
         return -1089213109 * this.au;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ta.af(" + ')');
      }
   }

   public int an() {
      return -1089213109 * this.au;
   }

   public int aw() {
      return -1089213109 * this.au;
   }

   public int ac() {
      return -1089213109 * this.au;
   }

   public static ta[] ab() {
      return new ta[]{aw, af, an};
   }

   public static ta[] aq() {
      return new ta[]{aw, af, an};
   }

   public static ta[] al() {
      return new ta[]{aw, af, an};
   }

   public static ta[] at() {
      return new ta[]{aw, af, an};
   }

   public static ta[] aa() {
      return new ta[]{aw, af, an};
   }

   ta(int var1, int var2) {
      try {
         super();
         this.ac = var1 * -311706931;
         this.au = -1236781981 * var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "ta.<init>(" + ')');
      }
   }
}
