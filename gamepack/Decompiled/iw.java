import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class iw {
   static int[] at = new int[4096];
   static int[][] ac = new int[128][128];
   static int[] al = new int[4096];
   static int[][] aw = new int[128][128];

   public static fh af_renamed(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
      boolean var5 = true;
      byte[] var6 = var0.getFile(var2 >> 16 & '\uffff', var2 & '\uffff');
      if (null == var6) {
         var5 = false;
         return null;
      } else {
         int var7 = (var6[1] & 255) << 8 | var6[2] & 255;
         byte[] var8;
         if (var3) {
            var8 = var1.getFile(0, var7);
         } else {
            var8 = var1.getFile(var7, 0);
         }

         if (null == var8) {
            var5 = false;
         }

         if (!var5) {
            return null;
         } else {
            if (null == ot.al) {
               fh.aq = Runtime.getRuntime().availableProcessors() * -1243816433;
               ot.al = new ThreadPoolExecutor(0, -1609019153 * fh.aq, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100 + -1988125348 * fh.aq), new fe());
            }

            try {
               return new fh(var0, var1, var2, var3);
            } catch (Exception var10) {
               return null;
            }
         }
      }
   }

   iw() throws Throwable {
      throw new Error();
   }
}
