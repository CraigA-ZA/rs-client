import java.util.ArrayList;
import java.util.HashMap;

public class ByteArrayPool {
   static byte[][] ByteArrayPool_large = new byte[100][];
   static byte[][] ah = new byte[50][];
   static byte[][] ByteArrayPool_medium = new byte[250][];
   static byte[][] ByteArrayPool_small = new byte[1000][];
   static int aa = 1002979318;
   static int ByteArrayPool_mediumCount = 0;
   static int al = 0;
   static int ao = -1364074518;
   static int ByteArrayPool_largeCount = 0;
   static int at = -1043983224;
   static int ByteArrayPool_smallCount = 0;
   static int ay = 2094465164;
   static int ck;
   static ArrayList as = new ArrayList();
   static WorldMapEvent worldMapEvent;

   static {
      kr.an_renamed();
      new HashMap();
   }

   ByteArrayPool() throws Throwable {
      throw new Error();
   }

   public static synchronized byte[] ByteArrayPool_get(int var0, boolean var1) {
      byte[] var9;
      if ((var0 == 100 || var0 < 100 && var1) && ByteArrayPool_smallCount * -300357261 > 0) {
         var9 = ByteArrayPool_small[(ByteArrayPool_smallCount -= -1092459589) * -300357261];
         ByteArrayPool_small[ByteArrayPool_smallCount * -300357261] = null;
         return var9;
      } else if ((var0 == 5000 || var0 < 5000 && var1) && 481846585 * ByteArrayPool_mediumCount > 0) {
         var9 = ByteArrayPool_medium[(ByteArrayPool_mediumCount -= 1267792137) * 481846585];
         ByteArrayPool_medium[ByteArrayPool_mediumCount * 481846585] = null;
         return var9;
      } else if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool_largeCount * -926544205 > 0) {
         var9 = ByteArrayPool_large[(ByteArrayPool_largeCount -= -1706733445) * -926544205];
         ByteArrayPool_large[-926544205 * ByteArrayPool_largeCount] = null;
         return var9;
      } else if ((var0 == 30000 || var0 < 30000 && var1) && al * 767381159 > 0) {
         var9 = ah[(al -= 1254586647) * 767381159];
         ah[767381159 * al] = null;
         return var9;
      } else {
         int var3;
         if (eb.am != null) {
            for(var3 = 0; var3 < gj.av.length; ++var3) {
               if ((var0 == gj.av[var3] || var0 < gj.av[var3] && var1) && fo.ar[var3] > 0) {
                  byte[] var4 = eb.am[var3][--fo.ar[var3]];
                  eb.am[var3][fo.ar[var3]] = null;
                  return var4;
               }
            }
         }

         if (var1 && gj.av != null) {
            for(var3 = 0; var3 < gj.av.length; ++var3) {
               if (var0 <= gj.av[var3] && fo.ar[var3] < eb.am[var3].length) {
                  return new byte[gj.av[var3]];
               }
            }
         }

         return new byte[var0];
      }
   }

   static final boolean kj_renamed() {
      return Client.isMiniMenuOpen;
   }
}
