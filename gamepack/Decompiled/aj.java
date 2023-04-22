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
   static ClientPreferences clientPreferences;

   aj(String var1) {
      this.af = 1056936272;
      this.an = null;
      this.aw = "";
   }

   public int af() {
      return this.af * -673848331;
   }

   public Map an() {
      return this.an;
   }

   public String aw() {
      return this.aw;
   }

   aj(HttpURLConnection var1) throws IOException {
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
   }

   public static int ag_renamed(int var0) {
      fh var3 = (fh)SeqType.aa.get((long)var0);
      fh var2;
      if (var3 != null) {
         var2 = var3;
      } else {
         var3 = iw.af_renamed(SeqType.ab, SeqType.aq, var0, false);
         if (null != var3) {
            SeqType.aa.put(var3, (long)var0);
         }

         var2 = var3;
      }

      if (null == var2) {
         return 2;
      } else {
         return var2.aw() ? 0 : 1;
      }
   }

   static int ac_renamed(int var0, int var1) {
      long var3 = (long)(var1 + (var0 << 16));
      return ClientScript.NetCache_currentResponse != null && ClientScript.NetCache_currentResponse.hr == var3 ? 1510710551 * NetCache.ah.index / (NetCache.ah.array.length - ClientScript.NetCache_currentResponse.padding) + 1 : 0;
   }
}
