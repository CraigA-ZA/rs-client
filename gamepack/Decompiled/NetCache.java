import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import java.util.zip.CRC32;

public class NetCache {
   public static byte ad = 0;
   public static int aa = 0;
   public static int NetCache_crcMismatches = 0;
   public static int an = 0;
   public static int ao = 0;
   public static int NetCache_ioExceptions = 0;
   public static int aq = 0;
   public static int au = 0;
   public static int av = 0;
   public static long aw;
   public static DualNodeDeque al = new DualNodeDeque();
   public static AbstractSocket af;
   public static NodeHashTable ab = new NodeHashTable(32);
   public static NodeHashTable ac = new NodeHashTable(4096);
   public static NodeHashTable at = new NodeHashTable(4096);
   public static NodeHashTable ay = new NodeHashTable(4096);
   public static Packet ag = new Packet(8);
   public static Packet ah;
   static boolean ax;
   static int ak = -2072522323;
   static int az = -1684033519;
   static CRC32 NetCache_crc = new CRC32();
   static Archive[] NetCache_archives = new Archive[256];

   NetCache() throws Throwable {
      throw new Error();
   }

   protected static int bq_renamed() {
      int var1 = 0;
      if (li.garbageCollector == null || !li.garbageCollector.isValid()) {
         try {
            Iterator var2 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var2.hasNext()) {
               GarbageCollectorMXBean var3 = (GarbageCollectorMXBean)var2.next();
               if (var3.isValid()) {
                  li.garbageCollector = var3;
                  GameShell.garbageCollectorLastCheckTimeMs = 4496549445389278039L;
                  GameShell.garbageCollectorLastCollectionTime = -3922098655801851377L;
               }
            }
         } catch (Throwable var10) {
         }
      }

      if (null != li.garbageCollector) {
         long var11 = Formatting.af_renamed();
         long var4 = li.garbageCollector.getCollectionTime();
         if (-3199239881614683375L * GameShell.garbageCollectorLastCollectionTime != -1L) {
            long var6 = var4 - -3199239881614683375L * GameShell.garbageCollectorLastCollectionTime;
            long var8 = var11 - 9118577410129870745L * GameShell.garbageCollectorLastCheckTimeMs;
            if (var8 != 0L) {
               var1 = (int)(100L * var6 / var8);
            }
         }

         GameShell.garbageCollectorLastCollectionTime = 3922098655801851377L * var4;
         GameShell.garbageCollectorLastCheckTimeMs = -4496549445389278039L * var11;
      }

      return var1;
   }
}
