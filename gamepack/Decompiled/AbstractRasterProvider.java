public abstract class AbstractRasterProvider {
   public int ac;
   public int[] pixels;
   public int au;
   protected float[] ab;

   public final void ar() {
      Rasterizer2D.Rasterizer2D_replace(this.pixels, 1313069155 * this.ac, 1695726685 * this.au, this.ab);
   }

   public abstract void drawFull(int var1, int var2);

   public abstract void draw(int var1, int var2, int var3, int var4);

   public final void am(boolean var1) {
      this.ab = var1 ? new float[this.au * 1695726685 * 1313069155 * this.ac + 1] : null;
   }

   protected AbstractRasterProvider() {
   }
}
