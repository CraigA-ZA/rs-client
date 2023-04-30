import accessors.RSCanvas;
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class ad extends Canvas implements RSCanvas {
   public static final String aq = "main_file_cache.dat2";
   static final int aj = 23;
   static tc ay;
   static final int bk = 45;
   Component af;
   static final int ah = 16;
   public static final int aw = 4;

   public final void ab(Graphics var1) {
      this.af.paint(var1);
   }

   public final void paint(Graphics var1) {
      try {
         this.af.paint(var1);
      } catch (RuntimeException var2) {
         throw db.an(var2, "ad.paint(" + ')');
      }
   }

   public final void af(Graphics var1) {
      this.af.update(var1);
   }

   public final void aq(Graphics var1) {
      this.af.paint(var1);
   }

   public final void an(Graphics var1) {
      this.af.update(var1);
   }

   public final void aw(Graphics var1) {
      this.af.update(var1);
   }

   public final void ac(Graphics var1) {
      this.af.paint(var1);
   }

   public final void au(Graphics var1) {
      this.af.paint(var1);
   }

   public static int ac(int var0, int var1, int var2, int var3) {
      try {
         int var4 = fn.an(var2 - var1 + 1, (byte)111);
         var4 <<= var1;
         return var0 & ~var4;
      } catch (RuntimeException var5) {
         throw db.an(var5, "ad.ac(" + ')');
      }
   }

   public final void update(Graphics var1) {
      try {
         this.af.update(var1);
      } catch (RuntimeException var2) {
         throw db.an(var2, "ad.update(" + ')');
      }
   }

   static void ne(byte var0) {
      try {
         client.in.aw(mi.an(lv.ac, client.in.au, (short)-1894), 414135591);
         client.lv = 0;
      } catch (RuntimeException var1) {
         throw db.an(var1, "ad.ne(" + ')');
      }
   }

   ad(Component var1) {
      try {
         super();
         this.af = var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ad.<init>(" + ')');
      }
   }
}
