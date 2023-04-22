import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class qv implements qq {
   public static short[][] ai;
   JSONObject an;

   public qv(String var1) throws UnsupportedEncodingException {
      this.ab(var1);
   }

   public qv(byte[] var1) throws UnsupportedEncodingException {
      this.au(var1);
   }

   public qz af() {
      return qz.af;
   }

   void au(byte[] var1) throws UnsupportedEncodingException {
      String var3 = new String(var1, "UTF-8");
      this.ab(var3);
   }

   public JSONObject aq() {
      return this.an;
   }

   public byte[] an() throws UnsupportedEncodingException {
      return null == this.an ? new byte[0] : this.an.toString().getBytes("UTF-8");
   }

   public qv(JSONObject var1) {
      this.an = var1;
   }

   void ab(String var1) throws UnsupportedEncodingException {
      try {
         if (var1.charAt(0) == '{') {
            this.an = new JSONObject(var1);
         } else {
            if (var1.charAt(0) != '[') {
               throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }

            JSONArray var3 = new JSONArray(var1);
            this.an = new JSONObject();
            this.an.put("arrayValues", (Object)var3);
         }

      } catch (JSONException var4) {
         throw new UnsupportedEncodingException(var4.getMessage());
      }
   }

   static final int ac_renamed(int var0, int var1, int var2, int var3) {
      return var3 * var0 + var2 * var1 >> 16;
   }
}
