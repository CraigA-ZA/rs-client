import accessors.RSMiniMenuEntry;

public class cb implements RSMiniMenuEntry {
   int au;
   int af;
   int aw;
   int ac;
   int an;
   String ab;
   static su qh;
   String aq;
   static final int bd = 50;

   public static boolean ay(char var0, int var1) {
      try {
         boolean var10000;
         label60: {
            if (var0 >= '0') {
               if (var1 >= 21779331) {
                  throw new IllegalStateException();
               }

               if (var0 <= '9') {
                  break label60;
               }

               if (var1 >= 21779331) {
                  throw new IllegalStateException();
               }
            }

            if (var0 >= 'A') {
               if (var1 >= 21779331) {
                  throw new IllegalStateException();
               }

               if (var0 <= 'Z') {
                  break label60;
               }

               if (var1 >= 21779331) {
                  throw new IllegalStateException();
               }
            }

            if (var0 >= 'a') {
               if (var1 >= 21779331) {
                  throw new IllegalStateException();
               }

               if (var0 <= 'z') {
                  if (var1 >= 21779331) {
                     throw new IllegalStateException();
                  }
                  break label60;
               }
            }

            var10000 = false;
            return var10000;
         }

         var10000 = true;
         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "cb.ay(" + ')');
      }
   }

   public static void af(nm var0, nm var1, int var2) {
      try {
         hs.an = var0;
         hs.aw = var1;
      } catch (RuntimeException var3) {
         throw db.an(var3, "cb.af(" + ')');
      }
   }

   cb() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "cb.<init>(" + ')');
      }
   }

   static void af(int var0, byte[] var1, qk var2, byte var3) {
      try {
         nw var4 = new nw();
         var4.af = 0;
         var4.hr = (long)var0;
         var4.an = var1;
         var4.aw = var2;
         synchronized(ns.af) {
            ns.af.an(var4);
         }

         eh.aw(1001828661);
      } catch (RuntimeException var8) {
         throw db.an(var8, "cb.af(" + ')');
      }
   }

   public static final void kz(String var0, String var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         jc.lv(var0, var1, var2, var3, var4, var5, -1, false, (byte)6);
      } catch (RuntimeException var7) {
         throw db.an(var7, "cb.kz(" + ')');
      }
   }

   public static void af(nm var0, int var1) {
      try {
         hg.af = var0;
      } catch (RuntimeException var2) {
         throw db.an(var2, "cb.af(" + ')');
      }
   }
}
