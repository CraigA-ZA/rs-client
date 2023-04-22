import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;

public class qa implements qq {
   final Map af;

   public qz af() {
      return null;
   }

   public byte[] an() throws UnsupportedEncodingException {
      return this.au().getBytes("UTF-8");
   }

   public String au() throws UnsupportedEncodingException {
      StringBuilder var2 = new StringBuilder();
      Iterator var3 = this.af.entrySet().iterator();

      while(var3.hasNext()) {
         Map.Entry var4 = (Map.Entry)var3.next();
         String var5 = URLEncoder.encode((String)var4.getKey(), "UTF-8");
         String var6 = URLEncoder.encode((String)var4.getValue(), "UTF-8");
         var2.append(var5).append("=").append(var6).append("&");
      }

      if (var2.length() == 0) {
         return "";
      } else {
         var2.deleteCharAt(var2.length() - 1);
         var2.insert(0, "?");
         return var2.toString();
      }
   }

   public qa(Map var1) {
      this.af = var1;
   }
}
