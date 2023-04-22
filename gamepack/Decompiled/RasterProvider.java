import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class RasterProvider extends AbstractRasterProvider {
   java.awt.Component component0;
   Image image;

   final void setComponent(java.awt.Component var1) {
      this.component0 = var1;
   }

   public final void drawFull(int var1, int var2) {
      this.drawFull0(this.component0.getGraphics(), var1, var2);
   }

   final void draw0(Graphics var1, int var2, int var3, int var4, int var5) {
      try {
         Shape var7 = var1.getClip();
         var1.clipRect(var2, var3, var4, var5);
         var1.drawImage(this.image, 0, 0, this.component0);
         var1.setClip(var7);
      } catch (Exception var8) {
         this.component0.repaint();
      }

   }

   final void drawFull0(Graphics var1, int var2, int var3) {
      try {
         var1.drawImage(this.image, var2, var3, this.component0);
      } catch (Exception var6) {
         this.component0.repaint();
      }

   }

   public final void draw(int var1, int var2, int var3, int var4) {
      this.draw0(this.component0.getGraphics(), var1, var2, var3, var4);
   }

   RasterProvider(int var1, int var2, java.awt.Component var3, boolean var4) {
      this.ac = var1 * 1020619083;
      this.au = 1097136117 * var2;
      this.aw = new int[1 + var1 * var2];
      if (var4) {
         this.ab = new float[var2 * var1 + 1];
      }

      DataBufferInt var5 = new DataBufferInt(this.aw, this.aw.length);
      DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
      WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(1313069155 * this.ac, this.au * 1695726685), var5, (Point)null);
      this.image = new BufferedImage(var6, var7, false, new Hashtable());
      this.setComponent(var3);
      this.ar();
   }
}
