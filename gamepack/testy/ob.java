import java.io.DataInputStream;
import java.net.URL;

public class ob {
   static final int bm = 41;
   public static final int af = 213;

   ob() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "ob.<init>(" + ')');
      }
   }

   static final int aw(int var0, int var1, int var2, int var3, byte var4) {
      try {
         return var0 * var2 - var1 * var3 >> 16;
      } catch (RuntimeException var5) {
         throw db.an(var5, "ob.aw(" + ')');
      }
   }

   public static void af(String var0, Throwable var1, byte var2) {
      try {
         try {
            String var3 = "";
            if (var1 != null) {
               var3 = iu.aw(var1, -1633313603);
            }

            if (var0 != null) {
               if (var2 != 8) {
                  throw new IllegalStateException();
               }

               if (var1 != null) {
                  if (var2 != 8) {
                     throw new IllegalStateException();
                  }

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
               if (var2 != 8) {
                  throw new IllegalStateException();
               }

               return;
            }

            URL var4 = new URL(dn.af.getCodeBase(), "clienterror.ws?cv=" + 2027530319 * tr.aw + "&cs=" + qh.ac * 1574980473 + "&u=" + tr.an + "&v1=" + gd.af + "&v2=" + gd.an + "&ct=" + tr.au * -891448341 + "&e=" + var3);
            DataInputStream var5 = new DataInputStream(var4.openStream());
            var5.read();
            var5.close();
         } catch (Exception var6) {
         }

      } catch (RuntimeException var7) {
         throw db.an(var7, "ob.af(" + ')');
      }
   }
}
