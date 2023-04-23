import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class gy {
   UrlRequest ay;
   float[] ax = new float[4];
   int at = -88536347;
   String aa;
   String ao = null;
   ArrayList ag = new ArrayList();
   ArrayList ah = new ArrayList();
   ArrayList ai = new ArrayList();
   Map ar = new HashMap();
   Map av = new HashMap();

   public boolean af(String var1, UrlRequester var2) {
      if (var1 != null && !var1.isEmpty()) {
         if (var2 == null) {
            return false;
         } else {
            this.ay();

            try {
               this.aa = var1;
               this.ay = var2.request(new URL(this.aa));
               this.at = 0;
               return true;
            } catch (MalformedURLException var5) {
               this.ay();
               this.at = 263700108;
               return false;
            }
         }
      } else {
         return false;
      }
   }

   public void an(UrlRequester var1) {
      switch (this.at * 371416339) {
         case 0:
            this.ao(var1);
            break;
         case 1:
            this.ax();
            break;
         default:
            return;
      }

   }

   public int aw() {
      return 371416339 * this.at;
   }

   public int ac(String var1) {
      return this.av.containsKey(var1) ? (Integer)this.av.get(var1) : -1;
   }

   public String au(String var1) {
      return (String)((String)(this.ar.containsKey(var1) ? this.ar.get(var1) : null));
   }

   public ArrayList ab() {
      return this.ag;
   }

   public ArrayList aq() {
      return this.ah;
   }

   public String al() {
      return this.ao;
   }

   public float[] at() {
      return this.ax;
   }

   public ArrayList aa() {
      return this.ai;
   }

   void ay() {
      this.ay = null;
      this.ao = null;
      this.ax[0] = 0.0F;
      this.ax[1] = 0.0F;
      this.ax[2] = 1.0F;
      this.ax[3] = 1.0F;
      this.ai.clear();
      this.ag.clear();
      this.ah.clear();
      this.av.clear();
      this.ar.clear();
   }

   void ao(UrlRequester var1) {
      if (null != this.ay && this.ay.isDone()) {
         byte[] var3 = this.ay.getResponse();
         if (var3 == null) {
            this.ay();
            this.at = 263700108;
         } else {
            try {
               this.ar(new qv(var3), var1);
            } catch (UnsupportedEncodingException var5) {
               this.ay();
               this.at = 440772802;
               return;
            }

            this.at = (this.ag.size() > 0 ? 1 : 2) * 88536347;
            this.ay = null;
         }
      }
   }

   void ax() {
      Iterator var2 = this.ag.iterator();

      gi var3;
      do {
         if (!var2.hasNext()) {
            var2 = this.ag.iterator();

            while(var2.hasNext()) {
               var3 = (gi)var2.next();
               if (null != var3.af) {
                  byte[] var4 = var3.af.getResponse();
                  if (null != var4 && var4.length > 0) {
                     this.at = 177072694;
                     return;
                  }
               }
            }

            this.ay();
            this.at = 352236455;
            return;
         }

         var3 = (gi)var2.next();
      } while(var3.af == null || var3.af.isDone());

   }

   void ai(JSONArray var1, UrlRequester var2) throws JSONException {
      if (var1 != null) {
         for(int var4 = 0; var4 < var1.length(); ++var4) {
            try {
               JSONObject var5 = var1.getJSONObject(var4);
               gi var6 = new gi(this);
               var6.af = var2.request(new URL(var5.getString("src")));
               var6.an = ea.as_renamed(var5, "placement");
               this.ag.add(var6);
            } catch (MalformedURLException var7) {
            }
         }

      }
   }

   void ag(JSONArray var1) throws JSONException {
      if (var1 != null) {
         for(int var3 = 0; var3 < var1.length(); ++var3) {
            JSONObject var4 = var1.getJSONObject(var3);
            gq var5 = new gq(this);
            var5.ac = var4.getString("text");
            String var8 = var4.getString("align_x");
            byte var7;
            if (var8.equals("centre")) {
               var7 = 1;
            } else if (!var8.equals("bottom") && !var8.equals("right")) {
               var7 = 0;
            } else {
               var7 = 2;
            }

            var5.ab = var7 * -663309687;
            String var11 = var4.getString("align_y");
            byte var10;
            if (var11.equals("centre")) {
               var10 = 1;
            } else if (!var11.equals("bottom") && !var11.equals("right")) {
               var10 = 0;
            } else {
               var10 = 2;
            }

            var5.aq = 1437150123 * var10;
            var5.al = var4.getInt("font") * -1157447435;
            var5.au = ea.as_renamed(var4, "placement");
            this.ah.add(var5);
         }

      }
   }

   void ah(JSONObject var1) throws JSONException {
      if (null != var1) {
         this.ax = ea.as_renamed(var1, "clickbounds");
         this.ao = var1.getString("endpoint");
         String[] var3 = JSONObject.getNames(var1);

         for(int var4 = 0; var4 < var1.length(); ++var4) {
            if (!var3[var4].equals("clickbounds") && !var3[var4].equals("endpoint")) {
               try {
                  int var5 = var1.getInt(var3[var4]);
                  this.ai.add(new gk(this, var3[var4], var5));
               } catch (Exception var8) {
                  try {
                     String var6 = var1.getString(var3[var4]);
                     if (var6.equals("true")) {
                        this.ai.add(new gk(this, var3[var4], 1));
                     } else if (var6.equals("false")) {
                        this.ai.add(new gk(this, var3[var4], 0));
                     } else {
                        this.ai.add(new gh(this, var3[var4], var6));
                     }
                  } catch (Exception var7) {
                  }
               }
            }
         }

      }
   }

   void av(JSONObject var1) throws JSONException {
      String[] var3 = JSONObject.getNames(var1);

      for(int var4 = 0; var4 < var1.length(); ++var4) {
         try {
            int var5 = var1.getInt(var3[var4]);
            this.av.put(var3[var4], var5);
         } catch (Exception var8) {
            try {
               String var6 = var1.getString(var3[var4]);
               if (var6.equals("true")) {
                  this.av.put(var3[var4], 1);
               } else if (var6.equals("false")) {
                  this.av.put(var3[var4], 0);
               } else {
                  this.ar.put(var3[var4], var6);
               }
            } catch (Exception var7) {
            }
         }
      }

   }

   void ar(qv var1, UrlRequester var2) {
      JSONObject var4;
      try {
         var4 = var1.aq();
         var4 = var4.getJSONObject("message");
      } catch (Exception var10) {
         this.ay();
         this.at = 440772802;
         return;
      }

      try {
         this.ai(var4.getJSONArray("images"), var2);
      } catch (Exception var9) {
         this.ag.clear();
      }

      try {
         this.ag(var4.getJSONArray("labels"));
      } catch (Exception var8) {
         this.ah.clear();
      }

      try {
         this.ah(var4.getJSONObject("behaviour"));
      } catch (Exception var7) {
         this.ao = null;
         this.ax[0] = 0.0F;
         this.ax[1] = 0.0F;
         this.ax[2] = 1.0F;
         this.ax[3] = 1.0F;
         this.ai.clear();
      }

      try {
         this.av(var4.getJSONObject("meta"));
      } catch (Exception var6) {
         this.av.clear();
         this.ar.clear();
      }

   }

   public boolean am(String var1, UrlRequester var2) {
      try {
         this.ar(new qv(var1.getBytes()), var2);
         this.at = (this.ag.size() > 0 ? 1 : 2) * 88536347;
      } catch (UnsupportedEncodingException var5) {
         this.at = 440772802;
      }

      return 371416339 * this.at < 100;
   }

   static void kp_renamed() {
      if (Client.om) {
         Component var1 = SoundSystem.getComponentChild(96656415 * jg.ou, 145251849 * Client.oa);
         if (var1 != null && null != var1.fy) {
            ClientScriptEvent var2 = new ClientScriptEvent();
            var2.aw = var1;
            var2.af = var1.fy;
            HeadbarUpdate.af_renamed(var2);
         }

         Client.op = -35668549;
         Client.om = false;
         fw.ma_renamed(var1);
      }
   }

   static final void ll_renamed(Component var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (Client.ki) {
         Client.ko = 1151731872;
      } else {
         Client.ko = 0;
      }

      Client.ki = false;
      int var8;
      if (114417019 * MouseHandler.aa == 1 || !su.ev && 114417019 * MouseHandler.aa == 4) {
         if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < 16 + var2) {
            var0.cm -= -510215044;
            fw.ma_renamed(var0);
         } else if (var5 >= var1 && var5 < 16 + var1 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
            var0.cm += -510215044;
            fw.ma_renamed(var0);
         } else if (var5 >= var1 - Client.ko * -1434295667 && var5 < -1434295667 * Client.ko + 16 + var1 && var6 >= var2 + 16 && var6 < var2 + var3 - 16) {
            var8 = (var3 - 32) * var3 / var4;
            if (var8 < 8) {
               var8 = 8;
            }

            int var9 = var6 - var2 - 16 - var8 / 2;
            int var10 = var3 - 32 - var8;
            var0.cm = 946188063 * (var9 * (var4 - var3) / var10);
            fw.ma_renamed(var0);
            Client.ki = true;
         }
      }

      if (-121753353 * Client.rd != 0) {
         var8 = var0.cs * -794961409;
         if (var5 >= var1 - var8 && var6 >= var2 && var5 < 16 + var1 && var6 <= var3 + var2) {
            var0.cm += Client.rd * -908462347;
            fw.ma_renamed(var0);
         }
      }

   }
}
