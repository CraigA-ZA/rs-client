import accessors.RSFaceNormal;

public class ir implements RSFaceNormal {
   static final int dy = 21;
   int aw;
   int an;
   static final int az = 25;
   int af;
   public static final int cp = 98;
   static final int cs = 70;

   static cl aq(int var0) {
      try {
         cl.aq = 0;
         return cy.al(1971574397);
      } catch (RuntimeException var1) {
         throw db.an(var1, "ir.aq(" + ')');
      }
   }

   ir() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "ir.<init>(" + ')');
      }
   }

   public static long aa(int var0, int var1, int var2, boolean var3, int var4, int var5) {
      try {
         long var6 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
         if (var3) {
            if (var5 <= -1492123941) {
               throw new IllegalStateException();
            }

            var6 |= 65536L;
         }

         return var6;
      } catch (RuntimeException var8) {
         throw db.an(var8, "ir.aa(" + ')');
      }
   }

   public static int au(int var0, int var1) {
      try {
         long var3 = ix.ag[var0];
         int var2 = (int)(var3 >>> 0 & 127L);
         return var2;
      } catch (RuntimeException var5) {
         throw db.an(var5, "ir.au(" + ')');
      }
   }

   static int ay(int var0, int var1) {
      try {
         cq var2 = (cq)eo.an.af((long)var0);
         if (null == var2) {
            if (var1 <= 263229985) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else if (eo.aw.af == var2.ez) {
            if (var1 <= 263229985) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return -1117255211 * ((cq)var2.ez).af;
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "ir.ay(" + ')');
      }
   }
}
