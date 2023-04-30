public class hv {
   short[] aw;
   int[] an;
   public long af;
   short[] ac;
   public boolean au;
   static final int ax = 4096;

   public hv(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
      try {
         super();
         this.au = false;
         this.af = -9020219036960248931L * var1;
         this.an = var3;
         this.aw = var4;
         this.ac = var5;
         this.au = var6;
      } catch (RuntimeException var7) {
         throw db.an(var7, "hv.<init>(" + ')');
      }
   }
}
