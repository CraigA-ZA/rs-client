public interface WorldMapSection {
   boolean containsCoord(int var1, int var2, int var3);

   int[] position(int var1, int var2, int var3);

   Coord coord(int var1, int var2);

   boolean containsPosition(int var1, int var2);

   void expandBounds(WorldMapArea var1);

   void read(Packet var1);
}
