import java.awt.Component;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

public class pc {
   final Map ac;
   static final String an = "Accept";
   static final String aw = "Authorization";
   public static int[] al;
   final Map au;
   final DecimalFormat ab;
   public static final String af = "Content-Type";

   public void ae(String var1, String var2) {
      if (null != var1 && !var1.isEmpty()) {
         this.ac.put(var1, var2 != null ? var2 : "");
      }

   }

   public void af(HttpsURLConnection var1, int var2) {
      try {
         Iterator var3 = this.ac.entrySet().iterator();

         while(var3.hasNext()) {
            if (var2 <= 1692969259) {
               throw new IllegalStateException();
            }

            Map.Entry var4 = (Map.Entry)var3.next();
            var1.setRequestProperty((String)var4.getKey(), (String)var4.getValue());
         }

      } catch (RuntimeException var5) {
         throw db.an(var5, "pc.af(" + ')');
      }
   }

   public Map an(int var1) {
      try {
         return this.ac;
      } catch (RuntimeException var2) {
         throw db.an(var2, "pc.an(" + ')');
      }
   }

   public void aw(String var1, String var2, int var3) {
      try {
         if (null != var1) {
            if (var3 >= 1788650387) {
               throw new IllegalStateException();
            }

            if (!var1.isEmpty()) {
               if (var3 >= 1788650387) {
                  throw new IllegalStateException();
               }

               Map var10000 = this.ac;
               String var10002;
               if (var2 != null) {
                  if (var3 >= 1788650387) {
                     return;
                  }

                  var10002 = var2;
               } else {
                  var10002 = "";
               }

               var10000.put(var1, var10002);
            }
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "pc.aw(" + ')');
      }
   }

   public void bz(String var1) {
      this.au(pm.an, var1, (byte)84);
   }

   void au(pm var1, String var2, byte var3) {
      try {
         String var4 = String.format("%s %s", var1.af((byte)43), var2);
         this.aw("Authorization", var4, -1992067293);
      } catch (RuntimeException var5) {
         throw db.an(var5, "pc.au(" + ')');
      }
   }

   void bi(pm var1, String var2) {
      String var3 = String.format("%s %s", var1.af((byte)19), var2);
      this.aw("Authorization", var3, -2050894255);
   }

   public void aq(String var1, int var2) {
      try {
         this.au(pm.an, var1, (byte)84);
      } catch (RuntimeException var3) {
         throw db.an(var3, "pc.aq(" + ')');
      }
   }

   public void al(qz var1, int var2) {
      try {
         this.ac.put("Content-Type", var1.af(797480377));
      } catch (RuntimeException var3) {
         throw db.an(var3, "pc.al(" + ')');
      }
   }

   public void at(int var1) {
      try {
         this.ac.remove("Content-Type");
      } catch (RuntimeException var2) {
         throw db.an(var2, "pc.at(" + ')');
      }
   }

   public void aa(qz var1, byte var2) {
      try {
         this.ay(var1, 1.0F, -868305920);
      } catch (RuntimeException var3) {
         throw db.an(var3, "pc.aa(" + ')');
      }
   }

   void ay(qz var1, float var2, int var3) {
      try {
         this.au.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
         this.ao(720033407);
      } catch (RuntimeException var4) {
         throw db.an(var4, "pc.ay(" + ')');
      }
   }

   void ao(int var1) {
      try {
         this.ac.remove("Accept");
         if (!this.au.isEmpty()) {
            if (var1 <= 539068886) {
               return;
            }

            this.ac.put("Accept", this.ax(269746303));
         }

      } catch (RuntimeException var2) {
         throw db.an(var2, "pc.ao(" + ')');
      }
   }

   public void az(String var1, String var2) {
      if (null != var1 && !var1.isEmpty()) {
         this.ac.put(var1, var2 != null ? var2 : "");
      }

   }

   public void ai(HttpsURLConnection var1) {
      Iterator var2 = this.ac.entrySet().iterator();

      while(var2.hasNext()) {
         Map.Entry var3 = (Map.Entry)var2.next();
         var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
      }

   }

   public void bo(String var1) {
      this.au(pm.af, var1, (byte)84);
   }

   public void ah(HttpsURLConnection var1) {
      Iterator var2 = this.ac.entrySet().iterator();

      while(var2.hasNext()) {
         Map.Entry var3 = (Map.Entry)var2.next();
         var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
      }

   }

   public void av(HttpsURLConnection var1) {
      Iterator var2 = this.ac.entrySet().iterator();

      while(var2.hasNext()) {
         Map.Entry var3 = (Map.Entry)var2.next();
         var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
      }

   }

   public Map ar() {
      return this.ac;
   }

   public Map am() {
      return this.ac;
   }

   public Map as() {
      return this.ac;
   }

   public void ab(String var1, byte var2) {
      try {
         this.au(pm.af, var1, (byte)84);
      } catch (RuntimeException var3) {
         throw db.an(var3, "pc.ab(" + ')');
      }
   }

   public void ak(String var1, String var2) {
      if (null != var1 && !var1.isEmpty()) {
         this.ac.put(var1, var2 != null ? var2 : "");
      }

   }

   void ba() {
      this.ac.remove("Accept");
      if (!this.au.isEmpty()) {
         this.ac.put("Accept", this.ax(-447293098));
      }

   }

   public void ad(String var1, String var2) {
      if (null != var1 && !var1.isEmpty()) {
         this.ac.put(var1, var2 != null ? var2 : "");
      }

   }

   public void bs(qz var1) {
      this.ay(var1, 1.0F, -78813818);
   }

   public void ap(String var1) {
      if (null != var1 && !var1.isEmpty()) {
         this.ac.remove(var1);
      }

   }

   public void by(String var1) {
      if (null != var1 && !var1.isEmpty()) {
         this.ac.remove(var1);
      }

   }

   public void bb(String var1) {
      if (null != var1 && !var1.isEmpty()) {
         this.ac.remove(var1);
      }

   }

   public void bm(String var1) {
      this.au(pm.an, var1, (byte)84);
   }

   void bf(qz var1, float var2) {
      this.au.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
      this.ao(984801824);
   }

   void bk(pm var1, String var2) {
      String var3 = String.format("%s %s", var1.af((byte)49), var2);
      this.aw("Authorization", var3, 239388088);
   }

   public pc() {
      try {
         super();
         this.ac = new HashMap();
         this.au = new HashMap();
         this.ab = new DecimalFormat();
         this.ab.setMaximumFractionDigits(2);
      } catch (RuntimeException var1) {
         throw db.an(var1, "pc.<init>(" + ')');
      }
   }

   public void ag(HttpsURLConnection var1) {
      Iterator var2 = this.ac.entrySet().iterator();

      while(var2.hasNext()) {
         Map.Entry var3 = (Map.Entry)var2.next();
         var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
      }

   }

   public void ac(String var1, short var2) {
      try {
         if (null != var1) {
            if (var2 >= 128) {
               throw new IllegalStateException();
            }

            if (!var1.isEmpty()) {
               this.ac.remove(var1);
            }
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "pc.ac(" + ')');
      }
   }

   void bv() {
      this.ac.remove("Accept");
      if (!this.au.isEmpty()) {
         this.ac.put("Accept", this.ax(1051847542));
      }

   }

   public void bd(qz var1) {
      this.ac.put("Content-Type", var1.af(797480377));
   }

   public void bt(qz var1) {
      this.ac.put("Content-Type", var1.af(797480377));
   }

   public void bj() {
      this.ac.remove("Content-Type");
   }

   public void bn(qz var1) {
      this.ay(var1, 1.0F, 195096976);
   }

   void be(pm var1, String var2) {
      String var3 = String.format("%s %s", var1.af((byte)110), var2);
      this.aw("Authorization", var3, -1489361673);
   }

   public void br(qz var1) {
      this.ay(var1, 1.0F, -12160586);
   }

   String ax(int var1) {
      try {
         ArrayList var2 = new ArrayList(this.au.entrySet());
         Collections.sort(var2, new pp(this));
         StringBuilder var3 = new StringBuilder();
         Iterator var4 = var2.iterator();

         while(var4.hasNext()) {
            if (var1 == -964267539) {
               throw new IllegalStateException();
            }

            Map.Entry var5 = (Map.Entry)var4.next();
            if (var3.length() > 0) {
               var3.append(",");
            }

            var3.append(((qz)var5.getKey()).af(797480377));
            float var6 = (Float)var5.getValue();
            if (var6 < 1.0F) {
               if (var1 == -964267539) {
                  throw new IllegalStateException();
               }

               String var7 = this.ab.format((double)var6);
               var3.append(";q=").append(var7);
            }
         }

         return var3.toString();
      } catch (RuntimeException var8) {
         throw db.an(var8, "pc.ax(" + ')');
      }
   }

   void bu(qz var1, float var2) {
      this.au.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
      this.ao(874944320);
   }

   String bl() {
      ArrayList var1 = new ArrayList(this.au.entrySet());
      Collections.sort(var1, new pp(this));
      StringBuilder var2 = new StringBuilder();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         Map.Entry var4 = (Map.Entry)var3.next();
         if (var2.length() > 0) {
            var2.append(",");
         }

         var2.append(((qz)var4.getKey()).af(797480377));
         float var5 = (Float)var4.getValue();
         if (var5 < 1.0F) {
            String var6 = this.ab.format((double)var5);
            var2.append(";q=").append(var6);
         }
      }

      return var2.toString();
   }

   void bq() {
      this.ac.remove("Accept");
      if (!this.au.isEmpty()) {
         this.ac.put("Accept", this.ax(-563044923));
      }

   }

   public void bx(String var1) {
      this.au(pm.af, var1, (byte)84);
   }

   void bg(qz var1, float var2) {
      this.au.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
      this.ao(913972792);
   }

   public void aj(String var1, String var2) {
      if (null != var1 && !var1.isEmpty()) {
         this.ac.put(var1, var2 != null ? var2 : "");
      }

   }

   static void af(Component var0, int var1) {
      try {
         var0.addMouseListener(bd.ac);
         var0.addMouseMotionListener(bd.ac);
         var0.addFocusListener(bd.ac);
      } catch (RuntimeException var2) {
         throw db.an(var2, "pc.af(" + ')');
      }
   }
}
