import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class qv implements qq {
   public static short[][] ai;
   JSONObject an;
   static final int ab = 4;
   static final int by = 29;
   static final String af = "arrayValues";

   public qv(String var1) throws UnsupportedEncodingException {
      try {
         super();
         this.ab(var1, (byte)101);
      } catch (RuntimeException var2) {
         throw db.an(var2, "qv.<init>(" + ')');
      }
   }

   void ao(String var1) throws UnsupportedEncodingException {
      try {
         if (var1.charAt(0) == -1905607916) {
            this.an = new JSONObject(var1);
         } else {
            if (var1.charAt(0) != 1416809269) {
               throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }

            JSONArray var2 = new JSONArray(var1);
            this.an = new JSONObject();
            this.an.put("arrayValues", (Object)var2);
         }

      } catch (JSONException var3) {
         throw new UnsupportedEncodingException(var3.getMessage());
      }
   }

   public qv(byte[] var1) throws UnsupportedEncodingException {
      try {
         super();
         this.au(var1, 773111973);
      } catch (RuntimeException var2) {
         throw db.an(var2, "qv.<init>(" + ')');
      }
   }

   public qz af(int var1) {
      try {
         return qz.af;
      } catch (RuntimeException var2) {
         throw db.an(var2, "qv.af(" + ')');
      }
   }

   void au(byte[] var1, int var2) throws UnsupportedEncodingException {
      try {
         String var3 = new String(var1, "UTF-8");
         this.ab(var3, (byte)29);
      } catch (RuntimeException var4) {
         throw db.an(var4, "qv.au(" + ')');
      }
   }

   void al(byte[] var1) throws UnsupportedEncodingException {
      String var2 = new String(var1, "UTF-8");
      this.ab(var2, (byte)69);
   }

   public JSONObject aq(int var1) {
      try {
         return this.an;
      } catch (RuntimeException var2) {
         throw db.an(var2, "qv.aq(" + ')');
      }
   }

   public byte[] an(int var1) throws UnsupportedEncodingException {
      try {
         if (null == this.an) {
            if (var1 != 888549065) {
               throw new IllegalStateException();
            } else {
               return new byte[0];
            }
         } else {
            return this.an.toString().getBytes("UTF-8");
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "qv.an(" + ')');
      }
   }

   public qz aw() {
      return qz.af;
   }

   public byte[] ac() throws UnsupportedEncodingException {
      return null == this.an ? new byte[0] : this.an.toString().getBytes("UTF-8");
   }

   void ax(String var1) throws UnsupportedEncodingException {
      try {
         if (var1.charAt(0) == 2080932428) {
            this.an = new JSONObject(var1);
         } else {
            if (var1.charAt(0) != '[') {
               throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }

            JSONArray var2 = new JSONArray(var1);
            this.an = new JSONObject();
            this.an.put("arrayValues", (Object)var2);
         }

      } catch (JSONException var3) {
         throw new UnsupportedEncodingException(var3.getMessage());
      }
   }

   void at(byte[] var1) throws UnsupportedEncodingException {
      String var2 = new String(var1, "UTF-8");
      this.ab(var2, (byte)114);
   }

   void aa(byte[] var1) throws UnsupportedEncodingException {
      String var2 = new String(var1, "UTF-8");
      this.ab(var2, (byte)112);
   }

   void ay(byte[] var1) throws UnsupportedEncodingException {
      String var2 = new String(var1, "UTF-8");
      this.ab(var2, (byte)78);
   }

   public qv(JSONObject var1) {
      try {
         super();
         this.an = var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "qv.<init>(" + ')');
      }
   }

   void ab(String var1, byte var2) throws UnsupportedEncodingException {
      try {
         try {
            if (var1.charAt(0) == '{') {
               if (var2 <= 1) {
                  throw new IllegalStateException();
               }

               this.an = new JSONObject(var1);
            } else {
               if (var1.charAt(0) != '[') {
                  throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
               }

               if (var2 <= 1) {
                  return;
               }

               JSONArray var3 = new JSONArray(var1);
               this.an = new JSONObject();
               this.an.put("arrayValues", (Object)var3);
            }

         } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "qv.ab(" + ')');
      }
   }

   public JSONObject ai() {
      return this.an;
   }

   public JSONObject ag() {
      return this.an;
   }

   public JSONObject ah() {
      return this.an;
   }

   static final int ac(int var0, int var1, int var2, int var3, byte var4) {
      try {
         return var3 * var0 + var2 * var1 >> 16;
      } catch (RuntimeException var5) {
         throw db.an(var5, "qv.ac(" + ')');
      }
   }
}
