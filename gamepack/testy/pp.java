import java.util.Comparator;
import java.util.Map;

class pp implements Comparator {
   static final int cz = 89;
   static final int an = 200;
   // $FF: synthetic field
   final pc this$0;

   pp(pc var1) {
      this.this$0 = var1;
   }

   int af(Map.Entry var1, Map.Entry var2, int var3) {
      try {
         return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
      } catch (RuntimeException var4) {
         throw db.an(var4, "pp.af(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.af((Map.Entry)var1, (Map.Entry)var2, 226740004);
      } catch (RuntimeException var3) {
         throw db.an(var3, "pp.compare(" + ')');
      }
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw db.an(var2, "pp.equals(" + ')');
      }
   }

   public int au(Object var1, Object var2) {
      return this.af((Map.Entry)var1, (Map.Entry)var2, -1762118595);
   }

   public int ab(Object var1, Object var2) {
      return this.af((Map.Entry)var1, (Map.Entry)var2, -659020020);
   }

   public int aq(Object var1, Object var2) {
      return this.af((Map.Entry)var1, (Map.Entry)var2, 482858325);
   }

   public boolean gq(Object var1) {
      return super.equals(var1);
   }

   public boolean gm(Object var1) {
      return super.equals(var1);
   }

   public boolean gi(Object var1) {
      return super.equals(var1);
   }

   public int al(Object var1, Object var2) {
      return this.af((Map.Entry)var1, (Map.Entry)var2, 181644901);
   }

   public boolean gk(Object var1) {
      return super.equals(var1);
   }

   int an(Map.Entry var1, Map.Entry var2) {
      return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
   }
}
