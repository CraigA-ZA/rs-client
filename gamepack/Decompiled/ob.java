import java.io.DataInputStream;
import java.net.URL;

public class ob {
   ob() throws Throwable {
      throw new Error();
   }

   static final int aw_renamed(int var0, int var1, int var2, int var3) {
      return var0 * var2 - var1 * var3 >> 16;
   }

   public static void af_renamed(String var0, Throwable var1) {
      try {
         String var3 = "";
         if (var1 != null) {
            var3 = iu.aw_renamed(var1);
         }

         if (var0 != null) {
            if (var1 != null) {
               var3 = var3 + " | ";
            }

            var3 = var3 + var0;
         }

         System.out.println("Error: " + var3);
         var3 = var3.replace(':', '.');
         var3 = var3.replace('@', '_');
         var3 = var3.replace('&', '_');
         var3 = var3.replace('#', '_');
         if (dn.af == null) {
            return;
         }

         URL var4 = new URL(dn.af.getCodeBase(), "clienterror.ws?cv=" + 2027530319 * ClientError.aw + "&cs=" + qh.ac * 1574980473 + "&u=" + ClientError.localPlayerName + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + ClientError.au * -891448341 + "&e=" + var3);
         DataInputStream var5 = new DataInputStream(var4.openStream());
         var5.read();
         var5.close();
      } catch (Exception var6) {
      }

   }
}
