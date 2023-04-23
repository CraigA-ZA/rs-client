public class WorldMapIcon2 extends AbstractWorldMapIcon {
   int ab;
   int au;
   int aw;
   WorldMapLabel ac;
   final int af;
   final WorldMapRegion an;

   WorldMapIcon2(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
      super(var1, var2);
      this.af = var3 * -375241415;
      this.an = var4;
      this.af();
   }

   void af() {
      this.aw = fw.an_renamed(-707716855 * this.af).ao().be * 1063280821;
      this.ac = this.an.bz(nf.getMapElementType(this.aw * -362754265));
      MapElementType var2 = nf.getMapElementType(this.element());
      Rasterizer3D var3 = var2.ab(false);
      if (var3 != null) {
         this.au = -2030208215 * var3.an;
         this.ab = 36450991 * var3.aw;
      } else {
         this.au = 0;
         this.ab = 0;
      }

   }

   public int element() {
      return -362754265 * this.aw;
   }

   WorldMapLabel label() {
      return this.ac;
   }

   int ac() {
      return -756068071 * this.au;
   }

   int au() {
      return 1550869583 * this.ab;
   }
}
