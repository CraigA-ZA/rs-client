import java.net.URL;

public class UrlRequest {
   public static int at;
   static int an = -1187714911;
   static int aw = 589984538;
   final URL af;
   volatile byte[] au;
   volatile int ac;

   static int ac(int var0, double var1) {
      double var3 = (double)(var0 >> 16) / 256.0;
      double var5 = (double)(var0 >> 8 & 255) / 256.0;
      double var7 = (double)(var0 & 255) / 256.0;
      var3 = Math.pow(var3, var1);
      var5 = Math.pow(var5, var1);
      var7 = Math.pow(var7, var1);
      int var9 = (int)(var3 * 256.0);
      int var10 = (int)(var5 * 256.0);
      int var11 = (int)(256.0 * var7);
      return var11 + (var10 << 8) + (var9 << 16);
   }

   UrlRequest(URL var1) {
      this.ac = an * -856794795;
      this.af = var1;
   }

   public boolean isDone() {
      return -349727197 * this.ac != 1340146847 * an;
   }

   public byte[] getResponse() {
      return this.au;
   }

   public String aw() {
      return this.af.toString();
   }

   static void as_renamed() {
      ee.ak_renamed(24);
      he.ax_renamed(Strings.jf, Strings.jw, Strings.js);
   }
}
