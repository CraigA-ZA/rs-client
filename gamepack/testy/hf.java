public class hf extends rp {
   static final int ia = 14;
   static int[] ae;
   public static final int af = 0;
   public int ac;
   public int au;
   public mq ab;
   public static final int an = 1;
   static final int bt = 12;
   public int aw;

   static sk ov(int var0, int var1) {
      try {
         sk var2 = (sk)client.wq.af((long)var0);
         if (var2 == null) {
            if (var1 != 1127097285) {
               throw new IllegalStateException();
            }

            var2 = new sk(bu.gs, oy.af(var0, (byte)93), qe.an(var0, (byte)48));
            client.wq.aw(var2, (long)var0);
         }

         return var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "hf.ov(" + ')');
      }
   }

   public hf(int var1, int var2, int var3, mq var4) {
      try {
         super();
         this.au = var1 * 104718613;
         this.aw = var2 * -1689391215;
         this.ac = -1488158589 * var3;
         this.ab = var4;
      } catch (RuntimeException var5) {
         throw db.an(var5, "hf.<init>(" + ')');
      }
   }
}
