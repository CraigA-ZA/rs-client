public final class Wall {
   int orientationA;
   int tileHeight;
   int x;
   int flags = 0;
   int orientationB;
   int y;
   public Entity entity1;
   public Entity entity2;
   public long tag = 0L;

   Wall() {
   }

   static void ah_renamed(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11) {
      Rasterizer3D.aq.ab(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }
}
