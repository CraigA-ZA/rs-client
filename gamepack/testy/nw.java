import accessors.RSArchiveDiskAction;

public class nw extends rp implements RSArchiveDiskAction {
   int af;
   public byte[] an;
   public qk aw;
   public nd ac;
   static final int ai = 16;

   static dt[] au(int var0) {
      try {
         return new dt[]{dt.an, dt.ab, dt.aw, dt.af, dt.au, dt.ac};
      } catch (RuntimeException var1) {
         throw db.an(var1, "nw.au(" + ')');
      }
   }

   static final String ly(int var0, short var1) {
      try {
         String var2 = Integer.toString(var0);

         for(int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            if (var1 <= 141) {
               throw new IllegalStateException();
            }

            var2 = var2.substring(0, var3) + dq.an + var2.substring(var3);
         }

         if (var2.length() > 9) {
            if (var1 <= 141) {
               throw new IllegalStateException();
            } else {
               return " " + oa.an(65408, -1521347825) + var2.substring(0, var2.length() - 8) + mk.gb + " " + dq.ac + var2 + dq.au + dq.al;
            }
         } else if (var2.length() > 6) {
            if (var1 <= 141) {
               throw new IllegalStateException();
            } else {
               return " " + oa.an(16777215, -1204065259) + var2.substring(0, var2.length() - 4) + mk.gn + " " + dq.ac + var2 + dq.au + dq.al;
            }
         } else {
            return " " + oa.an(16776960, 2128832594) + var2 + dq.al;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "nw.ly(" + ')');
      }
   }

   nw() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "nw.<init>(" + ')');
      }
   }
}
