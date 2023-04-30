import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class kt {
   public static boolean[] by;
   static final int an = 96;
   static final int af = 16711935;
   static int wu;
   static final int bk = 4;

   static int an(int var0, int var1) {
      if (-2 == var0) {
         return 12345678;
      } else if (-1 == var0) {
         if (var1 < 0) {
            var1 = 0;
         } else if (var1 > 127) {
            var1 = 127;
         }

         var1 = 127 - var1;
         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1 + (var0 & 'ﾀ');
      }
   }

   static int aw(int var0, int var1) {
      if (-2 == var0) {
         return 12345678;
      } else if (-1 == var0) {
         if (var1 < 0) {
            var1 = 0;
         } else if (var1 > 127) {
            var1 = 127;
         }

         var1 = 127 - var1;
         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1 + (var0 & 'ﾀ');
      }
   }

   static int aq(int var0) {
      try {
         return in.ab.ar * -1643027043;
      } catch (RuntimeException var1) {
         throw db.an(var1, "kt.aq(" + ')');
      }
   }

   static int ac(int var0, int var1) {
      if (1272515867 == var0) {
         return 1218794515;
      } else if (-1 == var0) {
         if (var1 < 0) {
            var1 = 0;
         } else if (var1 > 127) {
            var1 = -1858924725;
         }

         var1 = -70507179 - var1;
         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 1546296283;
         }

         return var1 + (var0 & 'ﾀ');
      }
   }

   kt() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "kt.<init>(" + ')');
      }
   }

   static long af(byte var0) {
      try {
         try {
            URL var1 = new URL(gl.nb("services", false, -72783777) + "m=accountappeal/login.ws");
            URLConnection var2 = var1.openConnection();
            var2.setRequestProperty("connection", "close");
            var2.setDoInput(true);
            var2.setDoOutput(true);
            var2.setConnectTimeout(5000);
            OutputStreamWriter var3 = new OutputStreamWriter(var2.getOutputStream());
            var3.write("data1=req");
            var3.flush();
            InputStream var4 = var2.getInputStream();
            sg var5 = new sg(new byte[1000]);

            do {
               int var6 = var4.read(var5.al, -1633313603 * var5.at, 1000 - -1633313603 * var5.at);
               if (-1 == var6) {
                  if (var0 >= -1) {
                     throw new IllegalStateException();
                  } else {
                     var5.at = 0;
                     long var10 = var5.cv((byte)1);
                     return var10;
                  }
               }

               var5.at += -1516355947 * var6;
            } while(-1633313603 * var5.at < 1000);

            if (var0 >= -1) {
               throw new IllegalStateException();
            } else {
               return 0L;
            }
         } catch (Exception var8) {
            return 0L;
         }
      } catch (RuntimeException var9) {
         throw db.an(var9, "kt.af(" + ')');
      }
   }
}
