import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

public class pc {
   public static int[] al;
   final DecimalFormat ab = new DecimalFormat();
   final Map ac = new HashMap();
   final Map au = new HashMap();

   public pc() {
      this.ab.setMaximumFractionDigits(2);
   }

   public void af(HttpsURLConnection var1) {
      Iterator var3 = this.ac.entrySet().iterator();

      while(var3.hasNext()) {
         Map.Entry var4 = (Map.Entry)var3.next();
         var1.setRequestProperty((String)var4.getKey(), (String)var4.getValue());
      }

   }

   public Map an() {
      return this.ac;
   }

   public void aw(String var1, String var2) {
      if (null != var1 && !var1.isEmpty()) {
         this.ac.put(var1, var2 != null ? var2 : "");
      }

   }

   static void af_renamed(java.awt.Component var0) {
      var0.addMouseListener(MouseHandler.ac);
      var0.addMouseMotionListener(MouseHandler.ac);
      var0.addFocusListener(MouseHandler.ac);
   }

   public void ac(String var1) {
      if (null != var1 && !var1.isEmpty()) {
         this.ac.remove(var1);
      }

   }

   void au(pm var1, String var2) {
      String var4 = String.format("%s %s", var1.af(), var2);
      this.aw("Authorization", var4);
   }

   public void ab(String var1) {
      this.au(pm.af, var1);
   }

   public void aq(String var1) {
      this.au(pm.an, var1);
   }

   public void al(qz var1) {
      this.ac.put("Content-Type", var1.af());
   }

   public void at() {
      this.ac.remove("Content-Type");
   }

   public void aa(qz var1) {
      this.ay(var1, 1.0F);
   }

   void ay(qz var1, float var2) {
      this.au.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
      this.ao();
   }

   void ao() {
      this.ac.remove("Accept");
      if (!this.au.isEmpty()) {
         this.ac.put("Accept", this.ax());
      }

   }

   String ax() {
      ArrayList var2 = new ArrayList(this.au.entrySet());
      Collections.sort(var2, new pp(this));
      StringBuilder var3 = new StringBuilder();
      Iterator var4 = var2.iterator();

      while(var4.hasNext()) {
         Map.Entry var5 = (Map.Entry)var4.next();
         if (var3.length() > 0) {
            var3.append(",");
         }

         var3.append(((qz)var5.getKey()).af());
         float var6 = (Float)var5.getValue();
         if (var6 < 1.0F) {
            String var7 = this.ab.format((double)var6);
            var3.append(";q=").append(var7);
         }
      }

      return var3.toString();
   }
}
