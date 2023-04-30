import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ag {
   static UrlRequester urlRequester;
   final int af;
   final String an;
   final ThreadFactory aw;
   final ThreadPoolExecutor ac;

   public ag(String var1, int var2, int var3) {
      this.an = var1;
      this.af = -1983210819 * var2;
      this.aw = new av(this);
      this.ac = this.af(var3);
   }

   final ThreadPoolExecutor af(int var1) {
      return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(1905963157 * this.af), this.aw);
   }

   public am an(ay var1) {
      if (this.ac.getQueue().remainingCapacity() <= 0) {
         System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.ac.getCorePoolSize() + " Queue capacity " + this.af * 1905963157);
         return new am("Queue full");
      } else {
         am var3 = new am(this.ac.submit(new as(this, var1)));
         return var3;
      }
   }

   public final void aw() {
      try {
         this.ac.shutdown();
      } catch (Exception var3) {
         System.err.println("Error shutting down RestRequestService\r\n" + var3);
      }

   }

   static float an_renamed(ek var0, float var1) {
      if (null == var0) {
         return 0.0F;
      } else {
         float var3 = var1 - var0.aq;
         return var0.ao + var3 * (var0.ay + var3 * (var0.at * var3 + var0.aa));
      }
   }

   static String ax_renamed(char var0, int var1) {
      char[] var3 = new char[var1];

      for(int var4 = 0; var4 < var1; ++var4) {
         var3[var4] = var0;
      }

      return new String(var3);
   }

   public static void ag_renamed() {
      LocType.LocType_cached.clear();
      LocType.LocType_cachedUnlitModels.clear();
      LocType.ab.clear();
      LocType.LocType_cachedModels.clear();
   }

   static void av_renamed(int var0) {
      ee.ak_renamed(14);
      Login.ba = var0 * -1919975363;
   }

   static final void hb_renamed(boolean var0) {
      if (var0) {
         Client.gh = Login.cd ? fp.an : fp.ac;
      } else {
         Client.gh = aj.clientPreferences.bk(Login.Login_username) ? fp.af : fp.aw;
      }

   }
}
