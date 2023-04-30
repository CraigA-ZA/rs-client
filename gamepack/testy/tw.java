import accessors.RSUserComparator1;
import java.util.Comparator;

public class tw implements Comparator, RSUserComparator1 {
   final boolean af;
   static final int ab = 32;
   static final int ax = 1;
   public static final String ko = "Please ensure date follows the format";

   public tw(boolean var1) {
      try {
         super();
         this.af = var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "tw.<init>(" + ')');
      }
   }

   int af(pw var1, pw var2, int var3) {
      try {
         int var10000;
         if (this.af) {
            if (var3 == -1623027882) {
               throw new IllegalStateException();
            }

            var10000 = var1.an(var2, 1925965260);
         } else {
            var10000 = var2.an(var1, 1823223921);
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw db.an(var4, "tw.af(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.af((pw)var1, (pw)var2, 412667408);
      } catch (RuntimeException var3) {
         throw db.an(var3, "tw.compare(" + ')');
      }
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw db.an(var2, "tw.equals(" + ')');
      }
   }

   public int au(Object var1, Object var2) {
      return this.af((pw)var1, (pw)var2, 2089319386);
   }

   public boolean gq(Object var1) {
      return super.equals(var1);
   }

   public int ab(Object var1, Object var2) {
      return this.af((pw)var1, (pw)var2, 1610761189);
   }

   public int al(Object var1, Object var2) {
      return this.af((pw)var1, (pw)var2, 1086325702);
   }

   public boolean gm(Object var1) {
      return super.equals(var1);
   }

   public boolean gi(Object var1) {
      return super.equals(var1);
   }

   public int aq(Object var1, Object var2) {
      return this.af((pw)var1, (pw)var2, -1210298482);
   }

   public boolean gk(Object var1) {
      return super.equals(var1);
   }

   int an(pw var1, pw var2) {
      return this.af ? var1.an(var2, 1001280788) : var2.an(var1, 1558179708);
   }

   int aw(pw var1, pw var2) {
      return this.af ? var1.an(var2, 1469576656) : var2.an(var1, 1277813108);
   }

   int ac(pw var1, pw var2) {
      return this.af ? var1.an(var2, 1858152342) : var2.an(var1, 1108761004);
   }
}
