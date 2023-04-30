import accessors.RSFormatting;

public class dq implements RSFormatting {
   static String ab = "->";
   static String af = "true";
   static String aw = "|";
   static String ac = " (";
   static String au = ")";
   static int qe;
   static String aq = "<br>";
   static String al = "</col>";
   public static String[] ar;
   static final int by = 28;
   static final int be = 44;
   static String an = ",";
   static qu bh;
   static int ls;
   static final int ci = 100;

   static String aq(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }

   dq() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "dq.<init>(" + ')');
      }
   }

   static String ac(int var0) {
      return "<img=" + var0 + ">";
   }

   static String au(int var0) {
      return "<img=" + var0 + ">";
   }

   static String ab(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }

   static String aw(int var0) {
      return "<img=" + var0 + ">";
   }

   public static final synchronized long af(int var0) {
      try {
         long var1 = System.currentTimeMillis();
         if (var1 < lk.af * 1436109859624790083L) {
            if (var0 <= -498726675) {
               throw new IllegalStateException();
            }

            lk.an += 4531959532299302581L * (lk.af * 1436109859624790083L - var1);
         }

         lk.af = -820153132959898517L * var1;
         return var1 + 5764352098133378973L * lk.an;
      } catch (RuntimeException var3) {
         throw db.an(var3, "dq.af(" + ')');
      }
   }
}
