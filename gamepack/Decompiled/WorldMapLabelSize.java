public class WorldMapLabelSize {
   public static final WorldMapLabelSize WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4);
   public static final WorldMapLabelSize WorldMapLabelSize_medium = new WorldMapLabelSize(2, 1, 2);
   public static final WorldMapLabelSize WorldMapLabelSize_large = new WorldMapLabelSize(1, 2, 0);
   static Archive archive9;
   final int ab;
   final int ac;
   final int au;

   WorldMapLabelSize(int var1, int var2, int var3) {
      this.ac = var1 * -1440612219;
      this.au = -841767259 * var2;
      this.ab = -1162134759 * var3;
   }

   boolean af(float var1) {
      return var1 >= (float)(2106192169 * this.ab);
   }

   static WorldMapLabelSize an_renamed(int var0) {
      WorldMapLabelSize[] var2 = new WorldMapLabelSize[]{WorldMapLabelSize_small, WorldMapLabelSize_medium, WorldMapLabelSize_large};
      WorldMapLabelSize[] var3 = var2;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         WorldMapLabelSize var5 = var3[var4];
         if (513003821 * var5.au == var0) {
            return var5;
         }
      }

      return null;
   }

   static final void ab_renamed(PacketBit var0) {
      for(int var2 = 0; var2 < ds.ax * 1474255643; ++var2) {
         int var3 = ds.ai[var2];
         Player var4 = Client.players[var3];
         int var5 = var0.g1();
         if (0 != (var5 & 8)) {
            var5 += var0.g1() << 8;
         }

         if (0 != (var5 & 16384)) {
            var5 += var0.g1() << 16;
         }

         ClientPreferences.aq_renamed(var0, var3, var4, var5);
      }

   }

   static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
      ArchiveDisk var6 = null;
      if (null != gc.dat2File) {
         var6 = new ArchiveDisk(var0, gc.dat2File, ol.idxFiles[var0], 1000000);
      }

      return new Archive(var6, kb.masterDisk, var0, var1, var2, var3, var4);
   }
}
