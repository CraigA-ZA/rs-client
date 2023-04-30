import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SecureRandomFuture {
   static int oo;
   ExecutorService executor = Executors.newSingleThreadExecutor();
   Future future;

   SecureRandomFuture() {
      this.future = this.executor.submit(new SecureRandomCallable());
   }

   void shutdown() {
      this.executor.shutdown();
      this.executor = null;
   }

   boolean isDone() {
      return this.future.isDone();
   }

   SecureRandom get() {
      try {
         return (SecureRandom)this.future.get();
      } catch (Exception var5) {
         SecureRandom var4 = new SecureRandom();
         var4.nextInt();
         return var4;
      }
   }

   public static int aw_renamed() {
      return (MouseHandler.MouseHandler_idleCycles += -500489753) * -119381545 - 1;
   }

   public static int au_renamed(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var4 = false;
         boolean var5 = false;
         int var6 = 0;
         int var7 = var0.length();

         for(int var8 = 0; var8 < var7; ++var8) {
            int var9 = var0.charAt(var8);
            if (var8 == 0) {
               if (45 == var9) {
                  var4 = true;
                  continue;
               }

               if (43 == var9 && var2) {
                  continue;
               }
            }

            if (var9 >= 48 && var9 <= 57) {
               var9 -= 48;
            } else if (var9 >= 65 && var9 <= 90) {
               var9 -= 55;
            } else {
               if (var9 < 97 || var9 > 122) {
                  throw new NumberFormatException();
               }

               var9 -= 87;
            }

            if (var9 >= var1) {
               throw new NumberFormatException();
            }

            if (var4) {
               var9 = -var9;
            }

            int var10 = var9 + var6 * var1;
            if (var6 != var10 / var1) {
               throw new NumberFormatException();
            }

            var6 = var10;
            var5 = true;
         }

         if (!var5) {
            throw new NumberFormatException();
         } else {
            return var6;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   public static String ac_renamed(CharSequence var0) {
      String var2 = FloorUnderlayType.longToTitleString(gi.af_renamed(var0));
      if (null == var2) {
         var2 = "";
      }

      return var2;
   }
}
