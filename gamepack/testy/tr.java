import accessors.RSClientError;
import java.io.DataInputStream;
import java.net.URL;

public class tr extends RuntimeException implements RSClientError {
   public static int aw;
   Throwable aq;
   public static int au;
   String ab;
   public static String an;

   public static void ac(String var0, Throwable var1) {
      try {
         String var2 = "";
         if (var1 != null) {
            var2 = iu.aw(var1, -1633313603);
         }

         if (var0 != null) {
            if (var1 != null) {
               var2 = var2 + " | ";
            }

            var2 = var2 + var0;
         }

         System.out.println("Error: " + var2);
         var2 = var2.replace(':', '.');
         var2 = var2.replace('@', '_');
         var2 = var2.replace('&', '_');
         var2 = var2.replace('#', '_');
         if (dn.af == null) {
            return;
         }

         URL var3 = new URL(dn.af.getCodeBase(), "clienterror.ws?cv=" + 2027530319 * aw + "&cs=" + qh.ac * 1574980473 + "&u=" + an + "&v1=" + gd.af + "&v2=" + gd.an + "&ct=" + au * -891448341 + "&e=" + var2);
         DataInputStream var4 = new DataInputStream(var3.openStream());
         var4.read();
         var4.close();
      } catch (Exception var5) {
      }

   }

   tr(Throwable var1, String var2) {
      try {
         super();
         this.ab = var2;
         this.aq = var1;
      } catch (RuntimeException var3) {
         throw db.an(var3, "tr.<init>(" + ')');
      }
   }

   public static void au(String var0, Throwable var1) {
      try {
         String var2 = "";
         if (var1 != null) {
            var2 = iu.aw(var1, -1633313603);
         }

         if (var0 != null) {
            if (var1 != null) {
               var2 = var2 + " | ";
            }

            var2 = var2 + var0;
         }

         System.out.println("Error: " + var2);
         var2 = var2.replace(':', '.');
         var2 = var2.replace((char)327654231, (char)1666465384);
         var2 = var2.replace((char)-1073112517, '_');
         var2 = var2.replace((char)1159167227, '_');
         if (dn.af == null) {
            return;
         }

         URL var3 = new URL(dn.af.getCodeBase(), "clienterror.ws?cv=" + -504557583 * aw + "&cs=" + qh.ac * 1574980473 + "&u=" + an + "&v1=" + gd.af + "&v2=" + gd.an + "&ct=" + au * -891448341 + "&e=" + var2);
         DataInputStream var4 = new DataInputStream(var3.openStream());
         var4.read();
         var4.close();
      } catch (Exception var5) {
      }

   }

   public static void ab(String var0, Throwable var1) {
      try {
         String var2 = "";
         if (var1 != null) {
            var2 = iu.aw(var1, -1633313603);
         }

         if (var0 != null) {
            if (var1 != null) {
               var2 = var2 + " | ";
            }

            var2 = var2 + var0;
         }

         System.out.println("Error: " + var2);
         var2 = var2.replace(':', '.');
         var2 = var2.replace('@', '_');
         var2 = var2.replace('&', '_');
         var2 = var2.replace('#', '_');
         if (dn.af == null) {
            return;
         }

         URL var3 = new URL(dn.af.getCodeBase(), "clienterror.ws?cv=" + 2027530319 * aw + "&cs=" + qh.ac * 1574980473 + "&u=" + an + "&v1=" + gd.af + "&v2=" + gd.an + "&ct=" + au * -891448341 + "&e=" + var2);
         DataInputStream var4 = new DataInputStream(var3.openStream());
         var4.read();
         var4.close();
      } catch (Exception var5) {
      }

   }

   public static tr aq(Throwable var0, String var1) {
      tr var2;
      if (var0 instanceof tr) {
         var2 = (tr)var0;
         var2.ab = var2.ab + ' ' + var1;
      } else {
         var2 = new tr(var0, var1);
      }

      return var2;
   }

   public static tr al(Throwable var0, String var1) {
      tr var2;
      if (var0 instanceof tr) {
         var2 = (tr)var0;
         var2.ab = var2.ab + ' ' + var1;
      } else {
         var2 = new tr(var0, var1);
      }

      return var2;
   }
}
