import accessors.RSUserComparator2;
import java.util.Comparator;

public class ty implements Comparator, RSUserComparator2 {
   final boolean af;

   int af(pw var1, pw var2, int var3) {
      try {
         int var10000;
         if (this.af) {
            if (var3 == 680027429) {
               throw new IllegalStateException();
            }

            var10000 = var1.be(473993579).aq(var2.be(473993579), (byte)60);
         } else {
            var10000 = var2.be(473993579).aq(var1.be(473993579), (byte)83);
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw db.an(var4, "ty.af(" + ')');
      }
   }

   public int al(Object var1, Object var2) {
      return this.af((pw)var1, (pw)var2, 741901522);
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.af((pw)var1, (pw)var2, 2140059241);
      } catch (RuntimeException var3) {
         throw db.an(var3, "ty.compare(" + ')');
      }
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw db.an(var2, "ty.equals(" + ')');
      }
   }

   public boolean gk(Object var1) {
      return super.equals(var1);
   }

   public int ab(Object var1, Object var2) {
      return this.af((pw)var1, (pw)var2, 1221010173);
   }

   public int aq(Object var1, Object var2) {
      return this.af((pw)var1, (pw)var2, 1678018675);
   }

   public ty(boolean var1) {
      try {
         super();
         this.af = var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ty.<init>(" + ')');
      }
   }

   public boolean gm(Object var1) {
      return super.equals(var1);
   }

   public boolean gi(Object var1) {
      return super.equals(var1);
   }

   public boolean gq(Object var1) {
      return super.equals(var1);
   }

   public int au(Object var1, Object var2) {
      return this.af((pw)var1, (pw)var2, 2002160278);
   }

   int an(pw var1, pw var2) {
      return this.af ? var1.be(473993579).aq(var2.be(473993579), (byte)86) : var2.be(473993579).aq(var1.be(473993579), (byte)75);
   }

   int aw(pw var1, pw var2) {
      return this.af ? var1.be(473993579).aq(var2.be(473993579), (byte)45) : var2.be(473993579).aq(var1.be(473993579), (byte)63);
   }
}
