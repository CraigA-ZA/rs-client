import accessors.RSMusicPatchNode2;

public class lp implements RSMusicPatchNode2 {
   byte[] an;
   byte[] af;
   int aw;
   int ac;
   int at;
   int ab;
   int aq;
   int al;
   int au;
   static final int bt = 43;
   static final int dj = 18;

   public static tc au(nm var0, String var1, String var2, int var3) {
      try {
         if (!var0.cv(var1, var2, -1313069490)) {
            if (var3 == 1112690706) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int var4 = var0.cy(var1, 666526600);
            int var5 = var0.cx(var4, var2, (short)8192);
            byte[] var8 = var0.bh(var4, var5, (byte)-76);
            boolean var7;
            if (var8 == null) {
               if (var3 == 1112690706) {
                  throw new IllegalStateException();
               }

               var7 = false;
            } else {
               sb.aa(var8, 1145263442);
               var7 = true;
            }

            tc var6;
            if (!var7) {
               if (var3 == 1112690706) {
                  throw new IllegalStateException();
               }

               var6 = null;
            } else {
               var6 = mk.al((byte)1);
            }

            return var6;
         }
      } catch (RuntimeException var9) {
         throw db.an(var9, "lp.au(" + ')');
      }
   }

   lp() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "lp.<init>(" + ')');
      }
   }
}
