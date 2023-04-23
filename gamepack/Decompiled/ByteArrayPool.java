import java.util.ArrayList;
import java.util.HashMap;

public class ByteArrayPool {
   static byte[][] ag = new byte[100][];
   static byte[][] ah = new byte[50][];
   static byte[][] ai = new byte[250][];
   static byte[][] ax = new byte[1000][];
   static int aa = 1002979318;
   static int ab = 0;
   static int al = 0;
   static int ao = -1364074518;
   static int aq = 0;
   static int at = -1043983224;
   static int au = 0;
   static int ay = 2094465164;
   static int ck;
   static ArrayList as = new ArrayList();
   static WorldMapEvent aj;

   static {
      kr.an_renamed();
      new HashMap();
   }

   ByteArrayPool() throws Throwable {
      throw new Error();
   }

   public static synchronized byte[] ByteArrayPool_get(int var0, boolean var1) {
      byte[] var5;
      if ((var0 == 100 || var0 < 100 && var1) && au * -300357261 > 0) {
         var5 = ax[(au -= -1092459589) * -300357261];
         ax[au * -300357261] = null;
         return var5;
      } else if ((var0 == 5000 || var0 < 5000 && var1) && 481846585 * ab > 0) {
         var5 = ai[(ab -= 1267792137) * 481846585];
         ai[ab * 481846585] = null;
         return var5;
      } else if ((var0 == 10000 || var0 < 10000 && var1) && aq * -926544205 > 0) {
         var5 = ag[(aq -= -1706733445) * -926544205];
         ag[-926544205 * aq] = null;
         return var5;
      } else if ((var0 == 30000 || var0 < 30000 && var1) && al * 767381159 > 0) {
         var5 = ah[(al -= 1254586647) * 767381159];
         ah[767381159 * al] = null;
         return var5;
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
      return Client.nt;
   }
}
