public abstract class Entity extends DualNode {
   public int height = -448344600;

   protected Entity() {
   }

   void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      Model var11 = this.getModel();
      if (null != var11) {
         this.height = var11.height * 1;
         var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }

   }

   protected Model getModel() {
      return null;
   }

   static void an_renamed() {
      hu.ac = (short[][][])null;
      Tiles.au = (short[][][])null;
      Tiles.ab = (byte[][][])null;
      Tiles.aq = (byte[][][])null;
      ge.ag = (int[][][])null;
      Tiles.al = (byte[][][])null;
      Tiles.at = (int[][])null;
      gm.aa = null;
      Tiles.ay = null;
      kn.ao = null;
      UserComparator4.ax = null;
      bx.ai = null;
   }
}
