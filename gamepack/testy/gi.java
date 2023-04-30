public class gi {
   static final int do = 1;
   public float[] an;
   // $FF: synthetic field
   final gy this$0;
   public ez af;
   static final int ab = 6;
   static final int az = 23;
   static final int od = 2000;

   gi(gy var1) {
      try {
         this.this$0 = var1;
         super();
         this.an = new float[4];
      } catch (RuntimeException var2) {
         throw db.an(var2, "gi.<init>(" + ')');
      }
   }

   static long af(CharSequence var0, int var1) {
      try {
         long var2 = 0L;
         int var4 = var0.length();

         for(int var5 = 0; var5 < var4; ++var5) {
            if (var1 >= -1290820166) {
               throw new IllegalStateException();
            }

            var2 *= 37L;
            char var6 = var0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
               if (var1 >= -1290820166) {
                  throw new IllegalStateException();
               }

               var2 += (long)(1 + var6 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
               if (var1 >= -1290820166) {
                  throw new IllegalStateException();
               }

               var2 += (long)(1 + var6 - 97);
            } else if (var6 >= '0') {
               if (var1 >= -1290820166) {
                  throw new IllegalStateException();
               }

               if (var6 <= '9') {
                  var2 += (long)(var6 + 27 - 48);
               }
            }

            if (var2 >= 177917621779460413L) {
               if (var1 >= -1290820166) {
                  throw new IllegalStateException();
               }
               break;
            }
         }

         while(0L == var2 % 37L) {
            if (var1 >= -1290820166) {
               throw new IllegalStateException();
            }

            if (0L == var2) {
               break;
            }

            if (var1 >= -1290820166) {
               throw new IllegalStateException();
            }

            var2 /= 37L;
         }

         return var2;
      } catch (RuntimeException var7) {
         throw db.an(var7, "gi.af(" + ')');
      }
   }
}
