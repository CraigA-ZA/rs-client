public class gq {
   public int al;
   static final int an = 1;
   public String ac;
   public float[] au;
   // $FF: synthetic field
   final gy this$0;
   static final int by = 1;
   public int ab;
   public int aq;
   static tq[] kb;
   static final int az = 1;
   public static final int ar = 34;
   static final int af = 0;

   static void nk(byte var0) {
      try {
         if (986256295 * client.lv == 1) {
            client.ln = true;
         }

      } catch (RuntimeException var1) {
         throw db.an(var1, "gq.nk(" + ')');
      }
   }

   public static int af(CharSequence var0, int var1) {
      try {
         int var2 = var0.length();
         int var3 = 0;

         for(int var4 = 0; var4 < var2; ++var4) {
            if (var1 == -254804647) {
               throw new IllegalStateException();
            }

            char var5 = var0.charAt(var4);
            if (var5 <= 127) {
               if (var1 == -254804647) {
                  throw new IllegalStateException();
               }

               ++var3;
            } else if (var5 <= 2047) {
               var3 += 2;
            } else {
               var3 += 3;
            }
         }

         return var3;
      } catch (RuntimeException var6) {
         throw db.an(var6, "gq.af(" + ')');
      }
   }

   public static boolean aw(long var0) {
      try {
         boolean var2 = 0L != var0;
         if (var2) {
            boolean var3 = 1 == (int)(var0 >>> 16 & 1L);
            var2 = !var3;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw db.an(var4, "gq.aw(" + ')');
      }
   }

   public static void ax(byte var0) {
      try {
         hs.ac.ac();
         hs.au.ac();
      } catch (RuntimeException var1) {
         throw db.an(var1, "gq.ax(" + ')');
      }
   }

   gq(gy var1) {
      try {
         this.this$0 = var1;
         super();
         this.au = new float[4];
         this.ab = -663309687;
         this.aq = 1437150123;
         this.al = 0;
      } catch (RuntimeException var2) {
         throw db.an(var2, "gq.<init>(" + ')');
      }
   }
}
