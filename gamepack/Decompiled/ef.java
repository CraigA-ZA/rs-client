import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public class ef extends UrlRequester {
   final boolean au;
   static String cm;

   void af(UrlRequest var1) throws IOException {
      URLConnection var3 = null;
      boolean var10 = false;

      HttpURLConnection var13;
      label140: {
         label132: {
            try {
               label135: {
                  var10 = true;
                  String var4 = var1.url.getProtocol();
                  if (var4.equals("http")) {
                     var3 = this.ad(var1);
                  } else {
                     if (!var4.equals("https")) {
                        var1.ac = -1267363191 * UrlRequest.aw;
                        var10 = false;
                        break label135;
                     }

                     var3 = this.ae(var1);
                  }

                  this.ac(var3, var1);
                  var10 = false;
                  break label140;
               }
            } catch (IOException var11) {
               var1.ac = UrlRequest.aw * -1267363191;
               var10 = false;
               break label132;
            } finally {
               if (var10) {
                  if (null != var3 && var3 instanceof HttpURLConnection) {
                     HttpURLConnection var7 = (HttpURLConnection)var3;
                     var7.disconnect();
                  }

               }
            }

            if (null != var3 && var3 instanceof HttpURLConnection) {
               HttpURLConnection var5 = (HttpURLConnection)var3;
               var5.disconnect();
            }

            return;
         }

         if (null != var3 && var3 instanceof HttpURLConnection) {
            var13 = (HttpURLConnection)var3;
            var13.disconnect();
         }

         return;
      }

      if (null != var3 && var3 instanceof HttpURLConnection) {
         var13 = (HttpURLConnection)var3;
         var13.disconnect();
      }

   }

   URLConnection ad(UrlRequest var1) throws IOException {
      URLConnection var3 = var1.url.openConnection();
      this.aw(var3);
      return var3;
   }

   URLConnection ae(UrlRequest var1) throws IOException {
      HttpsURLConnection var3 = (HttpsURLConnection)var1.url.openConnection();
      if (!this.au) {
         if (ah.an == null) {
            ah.an = new ah();
         }

         ah var5 = ah.an;
         var3.setSSLSocketFactory(var5);
      }

      this.aw(var3);
      return var3;
   }

   public static Object byteArrayToObject(byte[] var0, boolean var1) {
      if (null == var0) {
         return null;
      } else if (var0.length > 136) {
         DirectByteArrayCopier var3 = new DirectByteArrayCopier();
         var3.set(var0);
         return var3;
      } else {
         return var1 ? fy.aw_renamed(var0) : var0;
      }
   }

   public ef(boolean var1, int var2) {
      super(var2);
      this.au = var1;
   }
}
