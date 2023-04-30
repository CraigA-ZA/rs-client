import accessors.RSLoginType;

public class sw implements RSLoginType {
   static final sw au = new sw(7, 4, "", "");
   static final sw an = new sw(6, 1, "", "");
   public static final sw af = new sw(4, 0, "", "");
   static final sw aw = new sw(3, 2, "", "");
   static final sw ac = new sw(8, 3, "", "");
   static final sw ab = new sw(5, 5, "", "");
   static final sw aq = new sw(2, 6, "", "");
   static final sw al = new sw(1, 7, "", "");
   public static final sw at;
   final int aa;
   final String ay;

   public String ahm() {
      return this.ay;
   }

   sw(int var1, int var2, String var3, String var4, boolean var5, sw[] var6) {
      try {
         super();
         this.aa = var1 * 800568237;
         this.ay = var4;
      } catch (RuntimeException var7) {
         throw db.an(var7, "sw.<init>(" + ')');
      }
   }

   public String toString() {
      try {
         return this.ay;
      } catch (RuntimeException var1) {
         throw db.an(var1, "sw.toString(" + ')');
      }
   }

   static {
      at = new sw(0, -1, "", "", true, new sw[]{af, an, aw, au, ac});
   }

   public String ahp() {
      return this.ay;
   }

   sw(int var1, int var2, String var3, String var4) {
      try {
         super();
         this.aa = var1 * 800568237;
         this.ay = var4;
      } catch (RuntimeException var5) {
         throw db.an(var5, "sw.<init>(" + ')');
      }
   }

   public String ahj() {
      return this.ay;
   }
}
