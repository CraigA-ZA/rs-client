public class InterfaceParent extends Node {
   boolean keep = false;
   int af;
   int an;

   InterfaceParent() {
   }

   public static void al_renamed() {
      StructType.an.clear();
   }

   public static int at(long var0) {
      return (int)(var0 >>> 17 & 4294967295L);
   }

   public static synchronized void ByteArrayPool_release(byte[] var0) {
      if (var0.length == 100 && -300357261 * ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.at * 255163693) {
         ByteArrayPool.ByteArrayPool_small[(ByteArrayPool.ByteArrayPool_smallCount += -1092459589) * -300357261 - 1] = var0;
      } else if (5000 == var0.length && 481846585 * ByteArrayPool.ByteArrayPool_mediumCount < 1720410087 * ByteArrayPool.aa) {
         ByteArrayPool.ByteArrayPool_medium[(ByteArrayPool.ByteArrayPool_mediumCount += 1267792137) * 481846585 - 1] = var0;
      } else if (10000 == var0.length && -926544205 * ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.ay * -1922603885) {
         ByteArrayPool.ByteArrayPool_large[(ByteArrayPool.ByteArrayPool_largeCount += -1706733445) * -926544205 - 1] = var0;
      } else if (30000 == var0.length && ByteArrayPool.al * 767381159 < -1866109675 * ByteArrayPool.ao) {
         ByteArrayPool.ah[(ByteArrayPool.al += 1254586647) * 767381159 - 1] = var0;
      } else {
         if (null != UserComparator3.am) {
            for(int var2 = 0; var2 < gj.av.length; ++var2) {
               if (gj.av[var2] == var0.length && fo.ar[var2] < UserComparator3.am[var2].length) {
                  UserComparator3.am[var2][fo.ar[var2]++] = var0;
                  return;
               }
            }
         }

      }
   }
}
