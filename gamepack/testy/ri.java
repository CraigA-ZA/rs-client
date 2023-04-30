import accessors.RSFontName;

public class ri implements RSFontName {
   static int wj;
   static int[] jm;
   public static final ri aw = new ri("b12_full");
   public static final ri ac = new ri("verdana_11pt_regular");
   public static final ri af = new ri("p11_full");
   public static final ri ab = new ri("verdana_15pt_regular");
   String aq;
   static int jt;
   public static final ri au = new ri("verdana_13pt_regular");
   static int um;
   public static final ri an = new ri("p12_full");

   public static ri[] aw() {
      return new ri[]{ac, an, ab, af, au, aw};
   }

   ri(String var1) {
      try {
         super();
         this.aq = var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ri.<init>(" + ')');
      }
   }

   public static ri[] an() {
      return new ri[]{ac, an, ab, af, au, aw};
   }

   public static ri[] au() {
      return new ri[]{ac, an, ab, af, au, aw};
   }

   public static ri[] ac() {
      return new ri[]{ac, an, ab, af, au, aw};
   }

   public static ri[] af(byte var0) {
      try {
         return new ri[]{ac, an, ab, af, au, aw};
      } catch (RuntimeException var1) {
         throw db.an(var1, "ri.af(" + ')');
      }
   }

   public static ri[] ab() {
      return new ri[]{ac, an, ab, af, au, aw};
   }

   public static ri[] aq() {
      return new ri[]{ac, an, ab, af, au, aw};
   }
}
