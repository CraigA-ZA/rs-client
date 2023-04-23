public class WorldMapEvent {
   public int mapElement;
   public Coord coord1;
   public Coord coord2;

   public WorldMapEvent(int var1, Coord var2, Coord var3) {
      this.mapElement = 271164285 * var1;
      this.coord1 = var2;
      this.coord2 = var3;
   }
}
