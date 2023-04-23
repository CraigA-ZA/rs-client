public class Inventory extends Node {
   static boolean sv;
   static int gf;
   static NodeHashTable itemContainers = new NodeHashTable(32);
   int[] ids = new int[]{-1};
   int[] quantities = new int[]{0};

   Inventory() {
   }

   public static SpotType getSpotType(int var0) {
      SpotType var2 = (SpotType)SpotType.SpotType_cached.get((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = SpotType.SpotType_archive.takeFile(13, var0);
         var2 = new SpotType();
         var2.au = var0 * 903573465;
         if (var3 != null) {
            var2.decode(new Packet(var3));
         }

         SpotType.SpotType_cached.put(var2, (long)var0);
         return var2;
      }
   }

   public static SeqType getSeqType(int var0, byte var1) {
      SeqType var2 = (SeqType)SeqType.SeqType_cached.get((long)var0);
      if (null != var2) {
         if (var1 <= -1) {
            throw new IllegalStateException();
         } else {
            return var2;
         }
      } else {
         byte[] var3 = SeqType.SeqType_archive.takeFile(12, var0);
         var2 = new SeqType();
         if (var3 != null) {
            if (var1 <= -1) {
               throw new IllegalStateException();
            }

            var2.decode(new Packet(var3));
         }

         var2.removeAll();
         SeqType.SeqType_cached.put(var2, (long)var0);
         return var2;
      }
   }

   static final String lu_renamed(int var0, int var1) {
      int var3 = var1 - var0;
      if (var3 < -9) {
         return oa.colorStartTag(16711680);
      } else if (var3 < -6) {
         return oa.colorStartTag(16723968);
      } else if (var3 < -3) {
         return oa.colorStartTag(16740352);
      } else if (var3 < 0) {
         return oa.colorStartTag(16756736);
      } else if (var3 > 9) {
         return oa.colorStartTag(65280);
      } else if (var3 > 6) {
         return oa.colorStartTag(4259584);
      } else if (var3 > 3) {
         return oa.colorStartTag(8453888);
      } else {
         return var3 > 0 ? oa.colorStartTag(12648192) : oa.colorStartTag(16776960);
      }
   }
}
