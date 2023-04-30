import accessors.RSFonts;
import java.util.HashMap;

public class ra implements RSFonts {
   nm an;
   HashMap aw;
   nm af;

   public HashMap af(ri[] var1, byte var2) {
      try {
         HashMap var3 = new HashMap();
         ri[] var4 = var1;

         for(int var5 = 0; var5 < var4.length; ++var5) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            ri var6 = var4[var5];
            if (this.aw.containsKey(var6)) {
               if (var2 <= 0) {
                  throw new IllegalStateException();
               }

               var3.put(var6, this.aw.get(var6));
            } else {
               on var7 = pv.ab(this.af, this.an, var6.aq, "", 1606925660);
               if (var7 != null) {
                  if (var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  this.aw.put(var6, var7);
                  var3.put(var6, var7);
               }
            }
         }

         return var3;
      } catch (RuntimeException var8) {
         throw db.an(var8, "ra.af(" + ')');
      }
   }

   public HashMap an(ri[] var1) {
      HashMap var2 = new HashMap();
      ri[] var3 = var1;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         ri var5 = var3[var4];
         if (this.aw.containsKey(var5)) {
            var2.put(var5, this.aw.get(var5));
         } else {
            on var6 = pv.ab(this.af, this.an, var5.aq, "", 1606925660);
            if (var6 != null) {
               this.aw.put(var5, var6);
               var2.put(var5, var6);
            }
         }
      }

      return var2;
   }

   public ra(nm var1, nm var2) {
      try {
         super();
         this.af = var1;
         this.an = var2;
         this.aw = new HashMap();
      } catch (RuntimeException var3) {
         throw db.an(var3, "ra.<init>(" + ')');
      }
   }

   public HashMap aw(ri[] var1) {
      HashMap var2 = new HashMap();
      ri[] var3 = var1;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         ri var5 = var3[var4];
         if (this.aw.containsKey(var5)) {
            var2.put(var5, this.aw.get(var5));
         } else {
            on var6 = pv.ab(this.af, this.an, var5.aq, "", 1606925660);
            if (var6 != null) {
               this.aw.put(var5, var6);
               var2.put(var5, var6);
            }
         }
      }

      return var2;
   }
}
