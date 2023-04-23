import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import java.util.zip.CRC32;

public class NetCache {
   public static byte ad = 0;
   public static int aa = 0;
   public static int ae = 0;
   public static int an = 0;
   public static int ao = 0;
   public static int ap = 0;
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
   static CRC32 am = new CRC32();
   static Archive[] aj = new Archive[256];

   NetCache() throws Throwable {
      throw new Error();
   }

   protected static int bq_renamed() {
      int var1 = 0;
      if (li.ba == null || !li.ba.isValid()) {
         try {
            Iterator var2 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var2.hasNext()) {
               GarbageCollectorMXBean var3 = (GarbageCollectorMXBean)var2.next();
               if (var3.isValid()) {
                  li.ba = var3;
                  GameShell.bl = 4496549445389278039L;
                  GameShell.bv = -3922098655801851377L;
               }
            }
         } catch (Throwable var10) {
         }
      }

      if (null != li.ba) {
         long var11 = Formatting.af_renamed();
         long var4 = li.ba.getCollectionTime();
         if (-3199239881614683375L * GameShell.bv != -1L) {
            long var6 = var4 - -3199239881614683375L * GameShell.bv;
            long var8 = var11 - 9118577410129870745L * GameShell.bl;
            if (var8 != 0L) {
               var1 = (int)(100L * var6 / var8);
            }
         }

         GameShell.bv = 3922098655801851377L * var4;
         GameShell.bl = -4496549445389278039L * var11;
      }

      return var1;
   }
}
