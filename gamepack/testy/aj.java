import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

public class aj {
   final String aw;
   final Map an;
   final int af;
   public static final int ak = 47;
   static du vb;
   static final int bi = 2;

   public String at() {
      return this.aw;
   }

   aj(String var1) {
      try {
         super();
         this.af = 1056936272;
         this.an = null;
         this.aw = "";
      } catch (RuntimeException var2) {
         throw db.an(var2, "aj.<init>(" + ')');
      }
   }

   public int af(int var1) {
      try {
         return this.af * -673848331;
      } catch (RuntimeException var2) {
         throw db.an(var2, "aj.af(" + ')');
      }
   }

   public Map an(int var1) {
      try {
         return this.an;
      } catch (RuntimeException var2) {
         throw db.an(var2, "aj.an(" + ')');
      }
   }

   public String aw(int var1) {
      try {
         return this.aw;
      } catch (RuntimeException var2) {
         throw db.an(var2, "aj.aw(" + ')');
      }
   }

   aj(HttpURLConnection var1) throws IOException {
      try {
         super();
         this.af = var1.getResponseCode() * -1146261411;
         var1.getResponseMessage();
         this.an = var1.getHeaderFields();
         StringBuilder var2 = new StringBuilder();
         InputStream var3 = -673848331 * this.af >= 300 ? var1.getErrorStream() : var1.getInputStream();
         if (var3 != null) {
            InputStreamReader var4 = new InputStreamReader(var3);
            BufferedReader var5 = new BufferedReader(var4);

            String var6;
            while((var6 = var5.readLine()) != null) {
               var2.append(var6);
            }

            var3.close();
         }

         this.aw = var2.toString();
      } catch (RuntimeException var7) {
         throw db.an(var7, "aj.<init>(" + ')');
      }
   }

   public int au() {
      return this.af * -673848331;
   }

   public int ab() {
      return this.af * -1973670823;
   }

   public Map aq() {
      return this.an;
   }

   public int ac() {
      return this.af * -673848331;
   }

   public String al() {
      return this.aw;
   }

   public static int ag(int var0, int var1) {
      try {
         fh var3 = (fh)ha.aa.af((long)var0);
         fh var2;
         if (var3 != null) {
            if (var1 != 854271946) {
               throw new IllegalStateException();
            }

            var2 = var3;
         } else {
            var3 = iw.af(ha.ab, ha.aq, var0, false, 1641739959);
            if (null != var3) {
               if (var1 != 854271946) {
                  throw new IllegalStateException();
               }

               ha.aa.aw(var3, (long)var0);
            }

            var2 = var3;
         }

         if (null == var2) {
            if (var1 != 854271946) {
               throw new IllegalStateException();
            } else {
               return 2;
            }
         } else {
            byte var10000;
            if (var2.aw(-63286081)) {
               if (var1 != 854271946) {
                  throw new IllegalStateException();
               }

               var10000 = 0;
            } else {
               var10000 = 1;
            }

            return var10000;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "aj.ag(" + ')');
      }
   }

   static int ac(int var0, int var1, int var2) {
      try {
         long var3 = (long)(var1 + (var0 << 16));
         if (ch.ai != null) {
            if (var2 != -964267539) {
               throw new IllegalStateException();
            }

            if (ch.ai.hr == var3) {
               return 1510710551 * nl.ah.at / (nl.ah.al.length - ch.ai.aw) + 1;
            }
         }

         return 0;
      } catch (RuntimeException var5) {
         throw db.an(var5, "aj.ac(" + ')');
      }
   }
}
