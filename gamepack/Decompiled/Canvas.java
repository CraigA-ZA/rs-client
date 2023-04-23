import java.awt.Graphics;

public final class Canvas extends java.awt.Canvas {
   static IndexedSprite ay;
   java.awt.Component af;

   Canvas(java.awt.Component var1) {
      this.af = var1;
   }

   public final void update(Graphics var1) {
      this.af.update(var1);
   }

   public final void paint(Graphics var1) {
      this.af.paint(var1);
   }

   public static int ac_renamed(int var0, int var1, int var2) {
      int var4 = fn.an_renamed(var2 - var1 + 1);
      var4 <<= var1;
      return var0 & ~var4;
   }

   static void ne_renamed() {
      Client.in.aw(mi.an_renamed(ClientProt.ac, Client.in.au));
      Client.lv = 0;
   }
}
