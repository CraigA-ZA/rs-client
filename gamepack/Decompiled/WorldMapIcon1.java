public class WorldMapIcon1 extends AbstractWorldMapIcon {
   public static short[] ax;
   final int ac;
   final int af;
   final int aw;
   final WorldMapLabel label0;

   WorldMapIcon1(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
      super(var1, var2);
      this.af = -1078535861 * var3;
      this.label0 = var4;
      MapElementType var5 = nf.getMapElementType(this.element());
      Rasterizer3D var6 = var5.ab(false);
      if (var6 != null) {
         this.aw = -717434413 * var6.an;
         this.ac = var6.aw * 935195051;
      } else {
         this.aw = 0;
         this.ac = 0;
      }

   }

   public int element() {
      return 1767565411 * this.af;
   }

   WorldMapLabel label() {
      return this.label0;
   }

   int ac() {
      return -1314083237 * this.aw;
   }

   int au() {
      return 1694335235 * this.ac;
   }
}
