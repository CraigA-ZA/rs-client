public class WorldMapEvent {
   public int af;
   public Coord an;
   public Coord aw;

   public WorldMapEvent(int var1, Coord var2, Coord var3) {
      this.af = 271164285 * var1;
      this.an = var2;
      this.aw = var3;
   }
}
