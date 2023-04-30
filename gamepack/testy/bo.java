import accessors.RSRasterProvider;
import java.awt.Component;
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

public final class bo extends tk implements RSRasterProvider {
   Component af;
   Image an;

   public final void at(int var1, int var2, int var3, int var4) {
      this.au(this.af.getGraphics(), var1, var2, var3, var4, -703152610);
   }

   final void af(Component var1, byte var2) {
      try {
         this.af = var1;
      } catch (RuntimeException var3) {
         throw db.an(var3, "bo.af(" + ')');
      }
   }

   public final void an(int var1, int var2, int var3) {
      try {
         this.ac(this.af.getGraphics(), var1, var2, 1476768137);
      } catch (RuntimeException var4) {
         throw db.an(var4, "bo.an(" + ')');
      }
   }

   final void au(Graphics var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         try {
            Shape var7 = var1.getClip();
            var1.clipRect(var2, var3, var4, var5);
            var1.drawImage(this.an, 0, 0, this.af);
            var1.setClip(var7);
         } catch (Exception var8) {
            this.af.repaint();
         }

      } catch (RuntimeException var9) {
         throw db.an(var9, "bo.au(" + ')');
      }
   }

   public final void av(int var1, int var2) {
      this.ac(this.af.getGraphics(), var1, var2, 1767790220);
   }

   final void ac(Graphics var1, int var2, int var3, int var4) {
      try {
         try {
            var1.drawImage(this.an, var2, var3, this.af);
         } catch (Exception var6) {
            this.af.repaint();
         }

      } catch (RuntimeException var7) {
         throw db.an(var7, "bo.ac(" + ')');
      }
   }

   final void ab(Component var1) {
      this.af = var1;
   }

   public final void aq(int var1, int var2, int var3, int var4) {
      this.au(this.af.getGraphics(), var1, var2, var3, var4, -1597375263);
   }

   public final void aw(int var1, int var2, int var3, int var4, int var5) {
      try {
         this.au(this.af.getGraphics(), var1, var2, var3, var4, -1060106622);
      } catch (RuntimeException var6) {
         throw db.an(var6, "bo.aw(" + ')');
      }
   }

   final void aa(Graphics var1, int var2, int var3) {
      try {
         var1.drawImage(this.an, var2, var3, this.af);
      } catch (Exception var5) {
         this.af.repaint();
      }

   }

   final void ai(Graphics var1, int var2, int var3, int var4, int var5) {
      try {
         Shape var6 = var1.getClip();
         var1.clipRect(var2, var3, var4, var5);
         var1.drawImage(this.an, 0, 0, this.af);
         var1.setClip(var6);
      } catch (Exception var7) {
         this.af.repaint();
      }

   }

   final void ay(Graphics var1, int var2, int var3) {
      try {
         var1.drawImage(this.an, var2, var3, this.af);
      } catch (Exception var5) {
         this.af.repaint();
      }

   }

   final void ao(Graphics var1, int var2, int var3, int var4, int var5) {
      try {
         Shape var6 = var1.getClip();
         var1.clipRect(var2, var3, var4, var5);
         var1.drawImage(this.an, 0, 0, this.af);
         var1.setClip(var6);
      } catch (Exception var7) {
         this.af.repaint();
      }

   }

   final void ax(Graphics var1, int var2, int var3, int var4, int var5) {
      try {
         Shape var6 = var1.getClip();
         var1.clipRect(var2, var3, var4, var5);
         var1.drawImage(this.an, 0, 0, this.af);
         var1.setClip(var6);
      } catch (Exception var7) {
         this.af.repaint();
      }

   }

   bo(int var1, int var2, Component var3, boolean var4) {
      try {
         super();
         this.ac = var1 * 1020619083;
         this.au = 1097136117 * var2;
         this.aw = new int[1 + var1 * var2];
         if (var4) {
            this.ab = new float[var2 * var1 + 1];
         }

         DataBufferInt var5 = new DataBufferInt(this.aw, this.aw.length);
         DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
         WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(1313069155 * this.ac, this.au * 1695726685), var5, (Point)null);
         this.an = new BufferedImage(var6, var7, false, new Hashtable());
         this.af(var3, (byte)83);
         this.ar((byte)0);
      } catch (RuntimeException var8) {
         throw db.an(var8, "bo.<init>(" + ')');
      }
   }

   final void ag(Graphics var1, int var2, int var3, int var4, int var5) {
      try {
         Shape var6 = var1.getClip();
         var1.clipRect(var2, var3, var4, var5);
         var1.drawImage(this.an, 0, 0, this.af);
         var1.setClip(var6);
      } catch (Exception var7) {
         this.af.repaint();
      }

   }

   public final void ah(int var1, int var2) {
      this.ac(this.af.getGraphics(), var1, var2, 1818067960);
   }

   public final void al(int var1, int var2, int var3, int var4) {
      this.au(this.af.getGraphics(), var1, var2, var3, var4, 975611099);
   }
}
