import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ry implements rn {
   final ts an;
   Map af;

   public void an(int var1, Object var2) {
      if (null == this.af) {
         this.af = new HashMap();
         this.af.put(var1, new te(var1, var2));
      } else {
         te var4 = (te)this.af.get(var1);
         if (null == var4) {
            this.af.put(var1, new te(var1, var2));
         } else {
            var4.an = var2;
         }
      }

   }

   public ry(ts var1) {
      this.an = var1;
   }

   public Iterator iterator() {
      return this.af == null ? Collections.emptyList().iterator() : this.af.values().iterator();
   }

   public int af(int var1) {
      if (this.af != null) {
         te var3 = (te)this.af.get(var1);
         if (var3 != null) {
            return (Integer)var3.an;
         }
      }

      return (Integer)this.an.aw(var1);
   }
}
