public class InterfaceParent extends Node {
   boolean aw = false;
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
      if (var0.length == 100 && -300357261 * ByteArrayPool.au < ByteArrayPool.at * 255163693) {
         ByteArrayPool.ax[(ByteArrayPool.au += -1092459589) * -300357261 - 1] = var0;
      } else if (5000 == var0.length && 481846585 * ByteArrayPool.ab < 1720410087 * ByteArrayPool.aa) {
         ByteArrayPool.ai[(ByteArrayPool.ab += 1267792137) * 481846585 - 1] = var0;
      } else if (10000 == var0.length && -926544205 * ByteArrayPool.aq < ByteArrayPool.ay * -1922603885) {
         ByteArrayPool.ag[(ByteArrayPool.aq += -1706733445) * -926544205 - 1] = var0;
      } else if (30000 == var0.length && ByteArrayPool.al * 767381159 < -1866109675 * ByteArrayPool.ao) {
         ByteArrayPool.ah[(ByteArrayPool.al += 1254586647) * 767381159 - 1] = var0;
      } else {
         if (null != eb.am) {
            for(int var2 = 0; var2 < gj.av.length; ++var2) {
               if (gj.av[var2] == var0.length && fo.ar[var2] < eb.am[var2].length) {
                  eb.am[var2][fo.ar[var2]++] = var0;
                  return;
               }
            }
         }

      }
   }
}
