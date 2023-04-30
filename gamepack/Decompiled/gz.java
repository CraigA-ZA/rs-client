public class gz extends DualNode {
   public static int al;
   public static int an;
   public static EvictingDualNodeHashTable aw = new EvictingDualNodeHashTable(64);
   public static AbstractArchive af;
   public int ac = 0;

   gz() {
   }

   static ey[] au_renamed() {
      return new ey[]{ey.af, ey.an, ey.aw, ey.ac, ey.au, ey.ab};
   }

   void an(Packet var1) {
      while(true) {
         int var3 = var1.g1();
         if (var3 == 0) {
            return;
         }

         this.aw(var1, var3);
      }
   }

   void aw(Packet var1, int var2) {
      if (5 == var2) {
         this.ac = var1.cl() * 1851631081;
      }

   }

   static Sprite an_renamed(int var0, int var1, int var2) {
      return (Sprite)WorldMapRegion.au.get(er.af_renamed(var0, var1, var2));
   }

   public static void ag_renamed(int var0, int var1, int var2) {
      Rasterizer3D.ab.aw(var0, var1, var2);
   }
}
