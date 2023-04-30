public class ev {
   float ac;
   float ab;
   float aw;
   int af;
   float au;
   ev aq;
   float an;
   static final String hh = "JX_ACCESS_TOKEN";
   static final int bm = 49;
   public static boolean ay;
   public static final String kx = "Please ensure all characters are populated.";

   void aw(sg var1, int var2) {
      this.af = var1.cg((byte)8) * -1294107159;
      this.an = var1.cb(1904923237);
      this.aw = var1.cb(1517069771);
      this.ac = var1.cb(628544942);
      this.au = var1.cb(1882410851);
      this.ab = var1.cb(1233194639);
   }

   void af(sg var1, int var2, int var3) {
      try {
         this.af = var1.cg((byte)-12) * -1294107159;
         this.an = var1.cb(1038383495);
         this.aw = var1.cb(1253800642);
         this.ac = var1.cb(1257779706);
         this.au = var1.cb(1261517760);
         this.ab = var1.cb(2141379961);
      } catch (RuntimeException var4) {
         throw db.an(var4, "ev.af(" + ')');
      }
   }

   void an(sg var1, int var2) {
      this.af = var1.cg((byte)-20) * 1259095469;
      this.an = var1.cb(1165476302);
      this.aw = var1.cb(996707654);
      this.ac = var1.cb(942219684);
      this.au = var1.cb(1612295397);
      this.ab = var1.cb(1847753989);
   }

   ev() {
      try {
         super();
         this.aw = Float.MAX_VALUE;
         this.ac = Float.MAX_VALUE;
         this.au = Float.MAX_VALUE;
         this.ab = Float.MAX_VALUE;
      } catch (RuntimeException var1) {
         throw db.an(var1, "ev.<init>(" + ')');
      }
   }

   static void lw(boolean var0, byte var1) {
      try {
         client.ol = var0;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ev.lw(" + ')');
      }
   }
}
