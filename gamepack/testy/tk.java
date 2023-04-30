import accessors.RSAbstractRasterProvider;

public abstract class tk implements RSAbstractRasterProvider {
   public int ac;
   public int[] aw;
   public int au;
   protected float[] ab;

   public abstract void aq(int var1, int var2, int var3, int var4);

   public final void ar(byte var1) {
      try {
         th.ea(this.aw, 1313069155 * this.ac, 1695726685 * this.au, this.ab);
      } catch (RuntimeException var2) {
         throw db.an(var2, "tk.ar(" + ')');
      }
   }

   public abstract void an(int var1, int var2, int var3);

   public abstract void aw(int var1, int var2, int var3, int var4, int var5);

   public final void am(boolean var1, int var2) {
      try {
         float[] var10001;
         if (var1) {
            if (var2 == -756179250) {
               return;
            }

            var10001 = new float[this.au * 1695726685 * 1313069155 * this.ac + 1];
         } else {
            var10001 = null;
         }

         this.ab = var10001;
      } catch (RuntimeException var3) {
         throw db.an(var3, "tk.am(" + ')');
      }
   }

   public final void as() {
      th.ea(this.aw, 1313069155 * this.ac, 1695726685 * this.au, this.ab);
   }

   public abstract void al(int var1, int var2, int var3, int var4);

   public abstract void at(int var1, int var2, int var3, int var4);

   public final void aj() {
      th.ea(this.aw, -1569591464 * this.ac, 1695726685 * this.au, this.ab);
   }

   protected tk() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "tk.<init>(" + ')');
      }
   }

   public abstract void ah(int var1, int var2);

   public abstract void av(int var1, int var2);

   public final void az(boolean var1) {
      this.ab = var1 ? new float[this.au * 1695726685 * 1313069155 * this.ac + 1] : null;
   }

   public final void ak(boolean var1) {
      this.ab = var1 ? new float[this.au * 313811688 * 1313069155 * this.ac + 1] : null;
   }

   public final void ad(boolean var1) {
      this.ab = var1 ? new float[this.au * -315347315 * 1653702743 * this.ac + 1] : null;
   }
}
