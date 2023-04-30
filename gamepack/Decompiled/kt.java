import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class kt {
   public static boolean[] loadedInterfaces;
   static int wu;

   kt() throws Throwable {
      throw new Error();
   }

   static long af_renamed() {
      try {
         URL var1 = new URL(InvType.nb_renamed("services", false) + "m=accountappeal/login.ws");
         URLConnection var2 = var1.openConnection();
         var2.setRequestProperty("connection", "close");
         var2.setDoInput(true);
         var2.setDoOutput(true);
         var2.setConnectTimeout(5000);
         OutputStreamWriter var3 = new OutputStreamWriter(var2.getOutputStream());
         var3.write("data1=req");
         var3.flush();
         InputStream var4 = var2.getInputStream();
         Packet var5 = new Packet(new byte[1000]);

         do {
            int var6 = var4.read(var5.array, -1633313603 * var5.index, 1000 - -1633313603 * var5.index);
            if (-1 == var6) {
               var5.index = 0;
               long var9 = var5.g8s();
               return var9;
            }

            var5.index += -1516355947 * var6;
         } while(-1633313603 * var5.index < 1000);

         return 0L;
      } catch (Exception var8) {
         return 0L;
      }
   }

   static int aq_renamed() {
      return Rasterizer3D.ab.ar * -1643027043;
   }
}
