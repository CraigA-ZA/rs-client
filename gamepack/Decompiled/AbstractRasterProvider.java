public abstract class AbstractRasterProvider {
   protected float[] ab;
   public int width;
   public int height;
   public int[] pixels;

   protected AbstractRasterProvider() {
   }

   public final void apply() {
      Rasterizer2D.Rasterizer2D_replace(this.pixels, 1313069155 * this.width, 1695726685 * this.height, this.ab);
   }

   public final void am(boolean var1) {
      this.ab = var1 ? new float[this.height * 1695726685 * 1313069155 * this.width + 1] : null;
   }

   public abstract void drawFull(int var1, int var2);

   public abstract void draw(int var1, int var2, int var3, int var4);
}
