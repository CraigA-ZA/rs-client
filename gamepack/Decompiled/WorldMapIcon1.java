public class WorldMapIcon1 extends AbstractWorldMapIcon {
   final int ac;
   final int aw;
   final WorldMapLabel label0;
   final int af;
   public static short[] ax;

   public int an() {
      return 1767565411 * this.af;
   }

   int ac() {
      return -1314083237 * this.aw;
   }

   WorldMapLabel aw() {
      return this.label0;
   }

   int au() {
      return 1694335235 * this.ac;
   }

   WorldMapIcon1(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
      super(var1, var2);
      this.af = -1078535861 * var3;
      this.label0 = var4;
      MapElementType var5 = nf.getMapElementType(this.an());
      Rasterizer3D var6 = var5.ab(false);
      if (var6 != null) {
         this.aw = -717434413 * var6.an;
         this.ac = var6.aw * 935195051;
      } else {
         this.aw = 0;
         this.ac = 0;
      }

   }
}
